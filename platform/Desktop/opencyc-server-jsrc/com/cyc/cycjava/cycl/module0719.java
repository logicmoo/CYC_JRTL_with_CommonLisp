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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0719 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0719";
    public static final String myFingerPrint = "4d5c3fef85397db1f3237d5b49321894ce2ac4a5559f7021979029eb2a5eef35";
    private static SubLSymbol $g5678$;
    public static SubLSymbol $g5679$;
    private static SubLSymbol $g5680$;
    private static SubLSymbol $g5681$;
    public static SubLSymbol $g5683$;
    private static SubLSymbol $g5684$;
    private static SubLSymbol $g5682$;
    private static SubLSymbol $g5685$;
    public static SubLSymbol $g5686$;
    private static SubLSymbol $g5687$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLList $ic35$;
    private static final SubLList $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLInteger $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLList $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLList $ic79$;
    private static final SubLList $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLString $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLString $ic86$;
    private static final SubLObject $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLString $ic95$;
    private static final SubLList $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLObject $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLString $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLString $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLInteger $ic116$;
    private static final SubLInteger $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLString $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLString $ic121$;
    private static final SubLString $ic122$;
    private static final SubLObject $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLString $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLString $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLList $ic130$;
    private static final SubLList $ic131$;
    private static final SubLList $ic132$;
    private static final SubLList $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLList $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
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
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLList $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLList $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLString $ic164$;
    private static final SubLString $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLList $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLString $ic171$;
    private static final SubLString $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLObject $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLString $ic177$;
    private static final SubLString $ic178$;
    private static final SubLObject $ic179$;
    private static final SubLString $ic180$;
    private static final SubLString $ic181$;
    private static final SubLString $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLList $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLString $ic186$;
    private static final SubLString $ic187$;
    private static final SubLString $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLList $ic191$;
    private static final SubLList $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLString $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLList $ic196$;
    private static final SubLList $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLString $ic199$;
    private static final SubLList $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLString $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLString $ic204$;
    private static final SubLString $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLString $ic207$;
    private static final SubLString $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLObject $ic210$;
    private static final SubLString $ic211$;
    private static final SubLObject $ic212$;
    private static final SubLString $ic213$;
    private static final SubLObject $ic214$;
    private static final SubLString $ic215$;
    private static final SubLObject $ic216$;
    private static final SubLString $ic217$;
    private static final SubLList $ic218$;
    private static final SubLList $ic219$;
    private static final SubLString $ic220$;
    private static final SubLList $ic221$;
    private static final SubLList $ic222$;
    private static final SubLList $ic223$;
    private static final SubLString $ic224$;
    private static final SubLList $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLString $ic227$;
    private static final SubLSymbol $ic228$;
    private static final SubLString $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLList $ic231$;
    private static final SubLList $ic232$;
    private static final SubLList $ic233$;
    private static final SubLSymbol $ic234$;
    private static final SubLString $ic235$;
    private static final SubLSymbol $ic236$;
    private static final SubLList $ic237$;
    private static final SubLList $ic238$;
    private static final SubLList $ic239$;
    private static final SubLSymbol $ic240$;
    private static final SubLString $ic241$;
    private static final SubLSymbol $ic242$;
    private static final SubLList $ic243$;
    private static final SubLList $ic244$;
    private static final SubLList $ic245$;
    private static final SubLSymbol $ic246$;
    private static final SubLList $ic247$;
    private static final SubLList $ic248$;
    private static final SubLObject $ic249$;
    private static final SubLObject $ic250$;
    private static final SubLObject $ic251$;
    private static final SubLList $ic252$;
    private static final SubLSymbol $ic253$;
    private static final SubLSymbol $ic254$;
    private static final SubLString $ic255$;
    private static final SubLSymbol $ic256$;
    private static final SubLString $ic257$;
    private static final SubLInteger $ic258$;
    private static final SubLString $ic259$;
    private static final SubLObject $ic260$;
    private static final SubLSymbol $ic261$;
    private static final SubLList $ic262$;
    private static final SubLString $ic263$;
    private static final SubLString $ic264$;
    private static final SubLSymbol $ic265$;
    private static final SubLString $ic266$;
    private static final SubLSymbol $ic267$;
    private static final SubLString $ic268$;
    private static final SubLSymbol $ic269$;
    private static final SubLString $ic270$;
    
    public static SubLObject f44033(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = module0665.f40432(var1);
        if (module0719.NIL == module0173.f10955(module0665.f40419((SubLObject)module0719.$ic12$, var3))) {
            module0665.f40421((SubLObject)module0719.$ic12$, var3, module0665.f40419((SubLObject)module0719.$ic13$, var3));
        }
        if (module0719.NIL == module0173.f10955(module0665.f40419((SubLObject)module0719.$ic12$, var3))) {
            module0642.f39019((SubLObject)module0719.$ic14$);
            module0642.f39026((SubLObject)module0719.UNPROVIDED);
            return (SubLObject)module0719.NIL;
        }
        var3 = f44034(var3);
        final SubLObject var4 = module0719.$g5680$.getGlobalValue();
        final SubLObject var5 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((module0719.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED), var2);
            module0642.f39020((SubLObject)module0719.$ic15$);
            module0642.f39029((SubLObject)module0719.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var6 = module0014.f672((SubLObject)module0719.$ic16$);
            module0642.f39029((SubLObject)module0719.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            module0642.f39020((SubLObject)module0719.$ic17$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            if (module0719.NIL != var6) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020(var6);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            module0642.f39020((SubLObject)module0719.$ic18$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
            module0016.f941();
            if (module0719.NIL != var4) {
                module0642.f39029((SubLObject)module0719.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var4);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0719.UNPROVIDED);
            final SubLObject var5_7 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)module0719.T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0719.NIL != module0015.$g132$.getDynamicValue(var2)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020((SubLObject)module0719.$ic21$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var5_8 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020((SubLObject)module0719.$ic22$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var5_9 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0719.T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39020((SubLObject)module0719.$ic23$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39020((SubLObject)module0719.$ic24$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39019((SubLObject)module0719.$ic25$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_9, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0719.NIL != var4) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0719.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39019(var4);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0719.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    }
                    module0016.f895();
                    module0016.f892();
                    f44035(var3);
                    f44036(var3);
                    module0669.f40609(module0665.f40419((SubLObject)module0719.$ic12$, var3), (SubLObject)module0719.$ic10$);
                    module0642.f39051((SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                    if (module0719.NIL != module0574.f35194()) {
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (module0719.NIL != module0015.$g495$.getGlobalValue()) {
                            module0642.f39020(module0015.$g222$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                            module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                        final SubLObject var5_10 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)module0719.T, var2);
                            module0642.f39020(module0015.$g209$.getGlobalValue());
                            module0642.f39019((SubLObject)module0719.$ic26$);
                            module0642.f39020(module0015.$g210$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_10, var2);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                        module0642.f39026((SubLObject)module0719.TWO_INTEGER);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020((SubLObject)module0719.$ic27$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var5_11 = module0015.$g533$.currentBinding(var2);
                    final SubLObject var7 = module0015.$g541$.currentBinding(var2);
                    final SubLObject var8 = module0015.$g539$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0719.T, var2);
                        module0015.$g541$.bind((SubLObject)module0719.T, var2);
                        module0015.$g539$.bind(module0015.f797(), var2);
                        module0642.f39069(module0719.$g5681$.getGlobalValue(), (SubLObject)module0719.T, (SubLObject)module0719.UNPROVIDED);
                        module0665.f40440(var3, (SubLObject)module0719.$ic12$, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                        module0665.f40440(var3, (SubLObject)module0719.$ic28$, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                        var3 = f44037((SubLObject)module0719.$ic29$, var3);
                        final SubLObject var9 = module0665.f40419((SubLObject)module0719.$ic28$, var3);
                        if (module0719.NIL != var9) {
                            final SubLObject var10 = f44038(Hashtables.gethash(var9, module0719.$g5682$.getDynamicValue(var2), (SubLObject)module0719.UNPROVIDED));
                            if (module0719.NIL != var10) {
                                var3 = Functions.funcall(var10, var3);
                            }
                            var3 = f44037(var9, var3);
                        }
                        var3 = f44037((SubLObject)module0719.$ic30$, var3);
                        module0015.f799(module0015.$g539$.getDynamicValue(var2));
                    }
                    finally {
                        module0015.$g539$.rebind(var8, var2);
                        module0015.$g541$.rebind(var7, var2);
                        module0015.$g533$.rebind(var5_11, var2);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0719.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var5_8, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0719.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var5_7, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0719.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var5, var2);
        }
        return (SubLObject)module0719.NIL;
    }
    
    public static SubLObject f44039(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0656.$g5152$.currentBinding(var17);
        try {
            module0656.$g5152$.bind(module0719.$g5681$.getGlobalValue(), var17);
            module0656.f39804(var16, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
        }
        finally {
            module0656.$g5152$.rebind(var18, var17);
        }
        return (SubLObject)module0719.NIL;
    }
    
    public static SubLObject f44040(final SubLObject var17, final SubLObject var18) {
        f44041(var17, var18, (SubLObject)module0719.ZERO_INTEGER);
        return (SubLObject)module0719.NIL;
    }
    
    public static SubLObject f44042(final SubLObject var17) {
        return (SubLObject)((var17.getClass() == $sX48204_native.class) ? module0719.T : module0719.NIL);
    }
    
    public static SubLObject f44043(final SubLObject var17) {
        assert module0719.NIL != f44042(var17) : var17;
        return var17.getField2();
    }
    
    public static SubLObject f44044(final SubLObject var17) {
        assert module0719.NIL != f44042(var17) : var17;
        return var17.getField3();
    }
    
    public static SubLObject f44045(final SubLObject var17) {
        assert module0719.NIL != f44042(var17) : var17;
        return var17.getField4();
    }
    
    public static SubLObject f44038(final SubLObject var17) {
        assert module0719.NIL != f44042(var17) : var17;
        return var17.getField5();
    }
    
    public static SubLObject f44046(final SubLObject var17) {
        assert module0719.NIL != f44042(var17) : var17;
        return var17.getField6();
    }
    
    public static SubLObject f44047(final SubLObject var17, final SubLObject var20) {
        assert module0719.NIL != f44042(var17) : var17;
        return var17.setField2(var20);
    }
    
    public static SubLObject f44048(final SubLObject var17, final SubLObject var20) {
        assert module0719.NIL != f44042(var17) : var17;
        return var17.setField3(var20);
    }
    
    public static SubLObject f44049(final SubLObject var17, final SubLObject var20) {
        assert module0719.NIL != f44042(var17) : var17;
        return var17.setField4(var20);
    }
    
    public static SubLObject f44050(final SubLObject var17, final SubLObject var20) {
        assert module0719.NIL != f44042(var17) : var17;
        return var17.setField5(var20);
    }
    
    public static SubLObject f44051(final SubLObject var17, final SubLObject var20) {
        assert module0719.NIL != f44042(var17) : var17;
        return var17.setField6(var20);
    }
    
    public static SubLObject f44052(SubLObject var21) {
        if (var21 == module0719.UNPROVIDED) {
            var21 = (SubLObject)module0719.NIL;
        }
        final SubLObject var22 = (SubLObject)new $sX48204_native();
        SubLObject var23;
        SubLObject var24;
        SubLObject var25;
        SubLObject var26;
        for (var23 = (SubLObject)module0719.NIL, var23 = var21; module0719.NIL != var23; var23 = conses_high.cddr(var23)) {
            var24 = var23.first();
            var25 = conses_high.cadr(var23);
            var26 = var24;
            if (var26.eql((SubLObject)module0719.$ic51$)) {
                f44047(var22, var25);
            }
            else if (var26.eql((SubLObject)module0719.$ic52$)) {
                f44048(var22, var25);
            }
            else if (var26.eql((SubLObject)module0719.$ic53$)) {
                f44049(var22, var25);
            }
            else if (var26.eql((SubLObject)module0719.$ic54$)) {
                f44050(var22, var25);
            }
            else if (var26.eql((SubLObject)module0719.$ic55$)) {
                f44051(var22, var25);
            }
            else {
                Errors.error((SubLObject)module0719.$ic56$, var24);
            }
        }
        return var22;
    }
    
    public static SubLObject f44053(final SubLObject var27, final SubLObject var28) {
        Functions.funcall(var28, var27, (SubLObject)module0719.$ic57$, (SubLObject)module0719.$ic58$, (SubLObject)module0719.FIVE_INTEGER);
        Functions.funcall(var28, var27, (SubLObject)module0719.$ic59$, (SubLObject)module0719.$ic51$, f44043(var27));
        Functions.funcall(var28, var27, (SubLObject)module0719.$ic59$, (SubLObject)module0719.$ic52$, f44044(var27));
        Functions.funcall(var28, var27, (SubLObject)module0719.$ic59$, (SubLObject)module0719.$ic53$, f44045(var27));
        Functions.funcall(var28, var27, (SubLObject)module0719.$ic59$, (SubLObject)module0719.$ic54$, f44038(var27));
        Functions.funcall(var28, var27, (SubLObject)module0719.$ic59$, (SubLObject)module0719.$ic55$, f44046(var27));
        Functions.funcall(var28, var27, (SubLObject)module0719.$ic60$, (SubLObject)module0719.$ic58$, (SubLObject)module0719.FIVE_INTEGER);
        return var27;
    }
    
    public static SubLObject f44054(final SubLObject var27, final SubLObject var28) {
        return f44053(var27, var28);
    }
    
    public static SubLObject f44041(final SubLObject var16, final SubLObject var18, final SubLObject var29) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        if (module0719.NIL != print_high.$print_level$.getDynamicValue(var30) && var29.numG(print_high.$print_level$.getDynamicValue(var30))) {
            print_high.princ((SubLObject)module0719.$ic63$, var18);
        }
        else if (module0719.NIL != print_high.$print_readably$.getDynamicValue(var30)) {
            print_high.print_not_readable(var16, var18);
        }
        else {
            streams_high.write_string((SubLObject)module0719.$ic64$, var18, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var16), new SubLObject[] { module0719.$ic65$, var18 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var18);
            print_high.princ(f44043(var16), var18);
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var18);
        }
        return var16;
    }
    
    public static SubLObject f44055(final SubLObject var34, final SubLObject var35) {
        SubLObject var37;
        final SubLObject var36 = var37 = var34.rest();
        SubLObject var38 = (SubLObject)module0719.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var37, var36, (SubLObject)module0719.$ic67$);
        var38 = var37.first();
        final SubLObject var39;
        var37 = (var39 = var37.rest());
        final SubLObject var40 = (SubLObject)module0719.$ic68$;
        return (SubLObject)ConsesLow.list((SubLObject)module0719.$ic69$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var40, (SubLObject)ConsesLow.list((SubLObject)module0719.$ic58$, (SubLObject)ConsesLow.list((SubLObject)module0719.$ic70$, var39)))), (SubLObject)ConsesLow.list((SubLObject)module0719.$ic71$, (SubLObject)ConsesLow.list((SubLObject)module0719.$ic41$, var40), (SubLObject)ConsesLow.list((SubLObject)module0719.$ic70$, var38)), (SubLObject)ConsesLow.list((SubLObject)module0719.$ic72$, (SubLObject)ConsesLow.list((SubLObject)module0719.$ic43$, var40), (SubLObject)module0719.$ic73$, var40), (SubLObject)ConsesLow.list((SubLObject)module0719.$ic74$, (SubLObject)module0719.$ic75$, (SubLObject)ConsesLow.list((SubLObject)module0719.$ic76$, var40, (SubLObject)ConsesLow.listS((SubLObject)module0719.$ic77$, (SubLObject)ConsesLow.list((SubLObject)module0719.$ic70$, var38), (SubLObject)module0719.$ic78$))));
    }
    
    public static SubLObject f44056(final SubLObject var41) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        final SubLObject var43 = Hashtables.gethash(var41, module0719.$g5682$.getDynamicValue(var42), (SubLObject)module0719.UNPROVIDED);
        return var43;
    }
    
    public static SubLObject f44057(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0719.NIL;
        SubLObject var6 = module0719.$g5684$.getDynamicValue(var4);
        SubLObject var7 = (SubLObject)module0719.NIL;
        var7 = var6.first();
        while (module0719.NIL != var6) {
            final SubLObject var8 = f44045(var7);
            if (module0719.NIL != Functions.funcall(var8, var3)) {
                var5 = (SubLObject)ConsesLow.cons(var7, var5);
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        return Sequences.nreverse(var5);
    }
    
    public static SubLObject f44058(final SubLObject var41, final SubLObject var3) {
        final SubLObject var42 = f44056(var41);
        if (module0719.NIL == f44042(var42)) {
            return (SubLObject)module0719.NIL;
        }
        final SubLObject var43 = f44045(var42);
        return Functions.funcall(var43, var3);
    }
    
    public static SubLObject f44059(final SubLObject var3) {
        return (SubLObject)module0719.T;
    }
    
    public static SubLObject f44060(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0665.f40419((SubLObject)module0719.$ic12$, var3);
        final SubLObject var6 = module0718.f44022(var5, module0719.$g5679$.getDynamicValue(var4));
        if (module0719.NIL != var6) {
            SubLObject var7 = var6;
            SubLObject var8 = (SubLObject)module0719.NIL;
            var8 = var7.first();
            while (module0719.NIL != var7) {
                module0642.f39011();
                module0642.f39020(module0015.$g346$.getGlobalValue());
                module0642.f39020(module0015.$g352$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020(module0015.$g353$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020(module0015.$g354$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                if (module0719.NIL != module0015.$g516$.getGlobalValue()) {
                    module0642.f39020(module0015.$g357$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020(module0015.$g516$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                }
                module0642.f39020(module0015.$g358$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020((SubLObject)module0719.$ic82$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var9 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var4);
                    f44061(var5, var8, var3);
                }
                finally {
                    module0015.$g533$.rebind(var9, var4);
                }
                module0642.f39020(module0015.$g347$.getGlobalValue());
                module0642.f39026((SubLObject)module0719.UNPROVIDED);
                var7 = var7.rest();
                var8 = var7.first();
            }
        }
        return var3;
    }
    
    public static SubLObject f44061(final SubLObject var46, final SubLObject var48, SubLObject var3) {
        if (var3 == module0719.UNPROVIDED) {
            var3 = (SubLObject)module0719.NIL;
        }
        final SubLThread var49 = SubLProcess.currentSubLThread();
        SubLObject var50 = module0718.f44017(var48, module0719.$g5679$.getDynamicValue(var49));
        final SubLObject var51 = module0718.f44013(var48);
        final SubLObject var52 = module0718.f44015(var48);
        final SubLObject var53 = module0718.f44011(var48);
        module0665.f40441(var3, (SubLObject)module0719.$ic83$, var53, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
        var49.resetMultipleValues();
        final SubLObject var54 = module0718.f44023(var46, var48, module0719.$g5679$.getDynamicValue(var49));
        final SubLObject var55 = var49.secondMultipleValue();
        var49.resetMultipleValues();
        if (Sequences.length(var50).numL((SubLObject)module0719.TWENTY_INTEGER)) {
            var50 = Sort.sort(var50, Symbols.symbol_function((SubLObject)module0719.$ic84$), (SubLObject)module0719.UNPROVIDED);
        }
        else {
            var50 = Sort.sort(var50, Symbols.symbol_function((SubLObject)module0719.$ic85$), (SubLObject)module0719.UNPROVIDED);
        }
        final SubLObject var56 = Sequences.nreverse(conses_high.set_difference(var50, ConsesLow.append(var54, var55), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED));
        SubLObject var57 = (SubLObject)module0719.NIL;
        final SubLObject var58 = (SubLObject)module0719.$ic86$;
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
        SubLObject var59 = module0015.$g533$.currentBinding(var49);
        try {
            module0015.$g533$.bind((SubLObject)module0719.T, var49);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g371$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            module0642.f39020((SubLObject)module0719.TWO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var5_58 = module0015.$g533$.currentBinding(var49);
            try {
                module0015.$g533$.bind((SubLObject)module0719.T, var49);
                if (module0719.NIL != var56) {
                    module0642.f39020(module0015.$g209$.getGlobalValue());
                    f44039(var48);
                    module0642.f39020(module0015.$g210$.getGlobalValue());
                }
                else {
                    f44039(var48);
                }
            }
            finally {
                module0015.$g533$.rebind(var5_58, var49);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var59, var49);
        }
        module0642.f39020(module0015.$g365$.getGlobalValue());
        module0642.f39029((SubLObject)module0719.UNPROVIDED);
        SubLObject var60 = var54;
        SubLObject var61 = (SubLObject)module0719.NIL;
        var61 = var60.first();
        while (module0719.NIL != var60) {
            final SubLObject var62 = module0217.f14423((SubLObject)ConsesLow.list(module0719.$ic87$, var46, var61));
            if (module0719.NIL != var62) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                if (module0719.NIL != module0015.$g517$.getGlobalValue()) {
                    module0642.f39020(module0015.$g366$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020(module0015.$g517$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var63 = module0015.$g533$.currentBinding(var49);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var49);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0719.$ic88$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    if (module0719.NIL != var58) {
                        module0642.f39020(module0015.$g375$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39020(var58);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var5_59 = module0015.$g533$.currentBinding(var49);
                    try {
                        module0015.$g533$.bind((SubLObject)module0719.T, var49);
                        module0656.f39837((SubLObject)module0719.$ic89$, var62, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39027((SubLObject)module0719.$ic90$, (SubLObject)module0719.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_59, var49);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var5_60 = module0015.$g533$.currentBinding(var49);
                    try {
                        module0015.$g533$.bind((SubLObject)module0719.T, var49);
                        f44039(var61);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_60, var49);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var63, var49);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0719.UNPROVIDED);
            }
            else {
                var57 = (SubLObject)ConsesLow.cons(var61, var57);
            }
            var60 = var60.rest();
            var61 = var60.first();
        }
        var57 = (var60 = Sequences.nreverse(var57));
        SubLObject var64 = (SubLObject)module0719.NIL;
        var64 = var60.first();
        while (module0719.NIL != var60) {
            module0642.f39020(module0015.$g364$.getGlobalValue());
            if (module0719.NIL != module0015.$g517$.getGlobalValue()) {
                module0642.f39020(module0015.$g366$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020(module0015.$g517$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var65 = module0015.$g533$.currentBinding(var49);
            try {
                module0015.$g533$.bind((SubLObject)module0719.T, var49);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0719.$ic88$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                if (module0719.NIL != var58) {
                    module0642.f39020(module0015.$g375$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020(var58);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var5_61 = module0015.$g533$.currentBinding(var49);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var49);
                    module0642.f39020(module0015.$g209$.getGlobalValue());
                    module0642.f39019((SubLObject)module0719.$ic91$);
                    module0642.f39027((SubLObject)module0719.$ic90$, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020(module0015.$g210$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var5_61, var49);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var5_62 = module0015.$g533$.currentBinding(var49);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var49);
                    f44039(var64);
                    module0642.f39027((SubLObject)module0719.$ic90$, (SubLObject)module0719.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var5_62, var49);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var65, var49);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0719.UNPROVIDED);
            var60 = var60.rest();
            var64 = var60.first();
        }
        if (module0719.TEN_INTEGER.numGE(Sequences.length(var56))) {
            final SubLObject var66 = conses_high.member(var51, module0718.$g5675$.getGlobalValue(), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
            SubLObject var67 = var56;
            SubLObject var68 = (SubLObject)module0719.NIL;
            var68 = var67.first();
            while (module0719.NIL != var67) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                if (module0719.NIL != module0015.$g517$.getGlobalValue()) {
                    module0642.f39020(module0015.$g366$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020(module0015.$g517$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var63 = module0015.$g533$.currentBinding(var49);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var49);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0719.$ic88$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    if (module0719.NIL != var58) {
                        module0642.f39020(module0015.$g375$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39020(var58);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var5_63 = module0015.$g533$.currentBinding(var49);
                    try {
                        module0015.$g533$.bind((SubLObject)module0719.T, var49);
                        if (module0719.NIL != var66) {
                            module0665.f40437(var3, var53, var68);
                        }
                        else {
                            module0665.f40436(var3, (SubLObject)module0719.$ic92$, var68, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                        }
                        module0642.f39027((SubLObject)module0719.$ic90$, (SubLObject)module0719.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_63, var49);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var5_64 = module0015.$g533$.currentBinding(var49);
                    try {
                        module0015.$g533$.bind((SubLObject)module0719.T, var49);
                        f44039(var68);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_64, var49);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var63, var49);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0719.UNPROVIDED);
                var67 = var67.rest();
                var68 = var67.first();
            }
        }
        else {
            module0642.f39020(module0015.$g364$.getGlobalValue());
            if (module0719.NIL != module0015.$g517$.getGlobalValue()) {
                module0642.f39020(module0015.$g366$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020(module0015.$g517$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
            var59 = module0015.$g533$.currentBinding(var49);
            try {
                module0015.$g533$.bind((SubLObject)module0719.T, var49);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0719.$ic88$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                if (module0719.NIL != var58) {
                    module0642.f39020(module0015.$g375$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020(var58);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var5_65 = module0015.$g533$.currentBinding(var49);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var49);
                    module0665.f40436(var3, (SubLObject)module0719.$ic93$, var52, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39027((SubLObject)module0719.$ic90$, (SubLObject)module0719.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var5_65, var49);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var5_66 = module0015.$g533$.currentBinding(var49);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var49);
                    final SubLObject var69 = module0665.f40417(var52, (SubLObject)module0719.$ic12$);
                    module0642.f39020(module0015.$g318$.getGlobalValue());
                    module0642.f39020(module0015.$g320$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020(var69);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var5_67 = module0015.$g533$.currentBinding(var49);
                    try {
                        module0015.$g533$.bind((SubLObject)module0719.T, var49);
                        SubLObject var70 = var56;
                        SubLObject var71 = (SubLObject)module0719.NIL;
                        var71 = var70.first();
                        while (module0719.NIL != var70) {
                            final SubLObject var72 = module0035.f2171(var71, module0665.f40420(var52, var3));
                            final SubLObject var73 = module0665.f40415(var71, (SubLObject)module0719.$ic94$);
                            module0642.f39020(module0015.$g324$.getGlobalValue());
                            if (module0719.NIL != var72) {
                                module0642.f39046(module0015.$g327$.getGlobalValue());
                            }
                            if (module0719.NIL != var73) {
                                module0642.f39020(module0015.$g326$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                                module0642.f39020(var73);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                            final SubLObject var5_68 = module0015.$g533$.currentBinding(var49);
                            try {
                                module0015.$g533$.bind((SubLObject)module0719.T, var49);
                                module0642.f39019(module0597.f36628(var71));
                            }
                            finally {
                                module0015.$g533$.rebind(var5_68, var49);
                            }
                            module0642.f39020(module0015.$g325$.getGlobalValue());
                            var70 = var70.rest();
                            var71 = var70.first();
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var5_67, var49);
                    }
                    module0642.f39020(module0015.$g319$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var5_66, var49);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var59, var49);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0719.UNPROVIDED);
        }
        var57 = (SubLObject)module0719.NIL;
        var60 = var55;
        SubLObject var74 = (SubLObject)module0719.NIL;
        var74 = var60.first();
        while (module0719.NIL != var60) {
            final SubLObject var75 = module0217.f14423((SubLObject)ConsesLow.list(module0719.$ic87$, var46, var74));
            if (module0719.NIL != var75) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                if (module0719.NIL != module0015.$g517$.getGlobalValue()) {
                    module0642.f39020(module0015.$g366$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020(module0015.$g517$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var63 = module0015.$g533$.currentBinding(var49);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var49);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0719.$ic88$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    if (module0719.NIL != var58) {
                        module0642.f39020(module0015.$g375$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39020(var58);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var5_69 = module0015.$g533$.currentBinding(var49);
                    try {
                        module0015.$g533$.bind((SubLObject)module0719.T, var49);
                        module0656.f39837((SubLObject)module0719.$ic89$, var75, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39027((SubLObject)module0719.$ic90$, (SubLObject)module0719.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_69, var49);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var5_70 = module0015.$g533$.currentBinding(var49);
                    try {
                        module0015.$g533$.bind((SubLObject)module0719.T, var49);
                        module0642.f39020(module0015.$g232$.getGlobalValue());
                        f44039(var74);
                        module0642.f39020(module0015.$g233$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var5_70, var49);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var63, var49);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0719.UNPROVIDED);
            }
            else {
                var57 = (SubLObject)ConsesLow.cons(var74, var57);
            }
            var60 = var60.rest();
            var74 = var60.first();
        }
        var57 = Sequences.nreverse(var57);
        if (module0719.TEN_INTEGER.numGE(Sequences.length(var57))) {
            var60 = var57;
            var64 = (SubLObject)module0719.NIL;
            var64 = var60.first();
            while (module0719.NIL != var60) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                if (module0719.NIL != module0015.$g517$.getGlobalValue()) {
                    module0642.f39020(module0015.$g366$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020(module0015.$g517$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var65 = module0015.$g533$.currentBinding(var49);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var49);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0719.$ic88$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    if (module0719.NIL != var58) {
                        module0642.f39020(module0015.$g375$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39020(var58);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var5_71 = module0015.$g533$.currentBinding(var49);
                    try {
                        module0015.$g533$.bind((SubLObject)module0719.T, var49);
                        module0642.f39019((SubLObject)module0719.$ic95$);
                        module0642.f39027((SubLObject)module0719.$ic90$, (SubLObject)module0719.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_71, var49);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var5_72 = module0015.$g533$.currentBinding(var49);
                    try {
                        module0015.$g533$.bind((SubLObject)module0719.T, var49);
                        module0642.f39020(module0015.$g232$.getGlobalValue());
                        f44039(var64);
                        module0642.f39020(module0015.$g233$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var5_72, var49);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var65, var49);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0719.UNPROVIDED);
                var60 = var60.rest();
                var64 = var60.first();
            }
        }
        else {
            module0642.f39020(module0015.$g364$.getGlobalValue());
            if (module0719.NIL != module0015.$g517$.getGlobalValue()) {
                module0642.f39020(module0015.$g366$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020(module0015.$g517$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
            var59 = module0015.$g533$.currentBinding(var49);
            try {
                module0015.$g533$.bind((SubLObject)module0719.T, var49);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0719.$ic88$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                if (module0719.NIL != var58) {
                    module0642.f39020(module0015.$g375$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020(var58);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var5_73 = module0015.$g533$.currentBinding(var49);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var49);
                    module0642.f39019((SubLObject)module0719.$ic95$);
                    module0642.f39027((SubLObject)module0719.$ic90$, (SubLObject)module0719.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var5_73, var49);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var5_74 = module0015.$g533$.currentBinding(var49);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var49);
                    final SubLObject var76 = module0656.f39842(var52);
                    module0642.f39020(module0015.$g318$.getGlobalValue());
                    module0642.f39020(module0015.$g320$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020(var76);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var5_75 = module0015.$g533$.currentBinding(var49);
                    try {
                        module0015.$g533$.bind((SubLObject)module0719.T, var49);
                        SubLObject var70 = var57;
                        SubLObject var77 = (SubLObject)module0719.NIL;
                        var77 = var70.first();
                        while (module0719.NIL != var70) {
                            final SubLObject var78 = module0656.f39842(var77);
                            module0642.f39020(module0015.$g324$.getGlobalValue());
                            if (module0719.NIL != var78) {
                                module0642.f39020(module0015.$g326$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                                module0642.f39020(var78);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                            final SubLObject var5_76 = module0015.$g533$.currentBinding(var49);
                            try {
                                module0015.$g533$.bind((SubLObject)module0719.T, var49);
                                module0642.f39019(module0597.f36628(var77));
                            }
                            finally {
                                module0015.$g533$.rebind(var5_76, var49);
                            }
                            module0642.f39020(module0015.$g325$.getGlobalValue());
                            var70 = var70.rest();
                            var77 = var70.first();
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var5_75, var49);
                    }
                    module0642.f39020(module0015.$g319$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var5_74, var49);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var59, var49);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0719.UNPROVIDED);
        }
        return (SubLObject)module0719.NIL;
    }
    
    public static SubLObject f44062(final SubLObject var3) {
        return module0269.f17705(module0665.f40419((SubLObject)module0719.$ic12$, var3));
    }
    
    public static SubLObject f44063(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0665.f40419((SubLObject)module0719.$ic12$, var3);
        final SubLObject var6 = module0718.f44029(var5, module0719.$ic98$, (SubLObject)module0719.NIL, module0719.$g5679$.getDynamicValue(var4));
        final SubLObject var7 = conses_high.getf(var6, (SubLObject)module0719.$ic99$, (SubLObject)module0719.UNPROVIDED);
        final SubLObject var8 = conses_high.getf(var6, (SubLObject)module0719.$ic100$, (SubLObject)module0719.UNPROVIDED);
        if (module0719.NIL != var7) {
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39020(module0015.$g352$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            module0642.f39020(module0015.$g353$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            module0642.f39020(module0015.$g354$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            if (module0719.NIL != module0015.$g504$.getGlobalValue()) {
                module0642.f39020(module0015.$g357$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020(module0015.$g504$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            }
            module0642.f39020(module0015.$g358$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            module0642.f39020((SubLObject)module0719.$ic82$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var9 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var5_92 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var4);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var5_93 = module0015.$g533$.currentBinding(var4);
                    try {
                        module0015.$g533$.bind((SubLObject)module0719.T, var4);
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)module0719.$ic101$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var5_93, var4);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var5_94 = module0015.$g533$.currentBinding(var4);
                    try {
                        module0015.$g533$.bind((SubLObject)module0719.T, var4);
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)module0719.$ic102$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var5_94, var4);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var5_95 = module0015.$g533$.currentBinding(var4);
                    try {
                        module0015.$g533$.bind((SubLObject)module0719.T, var4);
                        module0665.f40445(var3, (SubLObject)module0719.$ic103$, (SubLObject)module0719.$ic104$, (SubLObject)module0719.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_95, var4);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var5_92, var4);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0719.UNPROVIDED);
                SubLObject var10 = var7;
                SubLObject var11 = (SubLObject)module0719.NIL;
                var11 = var10.first();
                while (module0719.NIL != var10) {
                    final SubLObject var12 = module0217.f14427((SubLObject)ConsesLow.list(module0719.$ic98$, var5, var11), module0719.$g5679$.getDynamicValue(var4));
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    if (module0719.NIL != module0015.$g505$.getGlobalValue()) {
                        module0642.f39020(module0015.$g366$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39020(module0015.$g505$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var5_96 = module0015.$g533$.currentBinding(var4);
                    try {
                        module0015.$g533$.bind((SubLObject)module0719.T, var4);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g375$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39020((SubLObject)module0719.$ic82$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                        final SubLObject var5_97 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)module0719.T, var4);
                            module0642.f39032((SubLObject)module0719.FIVE_INTEGER);
                            if (module0719.NIL != var12) {
                                module0656.f39837((SubLObject)module0719.$ic89$, var12, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                                module0642.f39032((SubLObject)module0719.ONE_INTEGER);
                            }
                            f44039(var11);
                            if (module0719.NIL != module0004.f104(var11, var8, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED)) {
                                module0642.f39019((SubLObject)module0719.$ic105$);
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var5_97, var4);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                        final SubLObject var5_98 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)module0719.T, var4);
                            f44039(module0178.f11287(var12));
                        }
                        finally {
                            module0015.$g533$.rebind(var5_98, var4);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0719.$ic106$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                        final SubLObject var5_99 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)module0719.T, var4);
                            if (module0719.NIL != assertion_handles_oc.f11035(var12)) {
                                module0665.f40436(var3, (SubLObject)module0719.$ic107$, assertion_handles_oc.f11025(var12), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var5_99, var4);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var5_96, var4);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)module0719.UNPROVIDED);
                    var10 = var10.rest();
                    var11 = var10.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var9, var4);
            }
            module0642.f39020(module0015.$g347$.getGlobalValue());
            module0642.f39026((SubLObject)module0719.UNPROVIDED);
        }
        final SubLObject var9 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var13 = module0147.$g2095$.currentBinding(var4);
        try {
            module0147.$g2094$.bind((SubLObject)module0719.$ic108$, var4);
            module0147.$g2095$.bind(module0719.$g5679$.getDynamicValue(var4), var4);
            final SubLObject var14 = module0718.f44019((SubLObject)ConsesLow.list(var5), module0719.$g5679$.getDynamicValue(var4));
            SubLObject var15 = (SubLObject)module0719.NIL;
            SubLObject var16 = (SubLObject)module0719.NIL;
            SubLObject var17 = (SubLObject)module0719.ZERO_INTEGER;
            final SubLObject var18 = module0256.f16661(var5, module0719.$g5679$.getDynamicValue(var4));
            if (module0719.NIL != var14) {
                module0665.f40421((SubLObject)module0719.$ic109$, var3, (SubLObject)module0719.T);
                module0642.f39020(module0015.$g346$.getGlobalValue());
                module0642.f39020(module0015.$g352$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020(module0015.$g353$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020(module0015.$g354$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                if (module0719.NIL != module0015.$g516$.getGlobalValue()) {
                    module0642.f39020(module0015.$g357$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020(module0015.$g516$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                }
                module0642.f39020(module0015.$g358$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020((SubLObject)module0719.$ic82$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var5_100 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var4);
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var5_101 = module0015.$g533$.currentBinding(var4);
                    try {
                        module0015.$g533$.bind((SubLObject)module0719.T, var4);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g375$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39020((SubLObject)module0719.$ic82$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                        final SubLObject var5_102 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)module0719.T, var4);
                            module0642.f39020(module0015.$g209$.getGlobalValue());
                            module0642.f39019((SubLObject)module0719.$ic110$);
                            module0642.f39020(module0015.$g210$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_102, var4);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                        final SubLObject var5_103 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)module0719.T, var4);
                            module0642.f39020(module0015.$g209$.getGlobalValue());
                            module0642.f39019((SubLObject)module0719.$ic102$);
                            module0642.f39020(module0015.$g210$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_103, var4);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                        final SubLObject var5_104 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)module0719.T, var4);
                            module0665.f40445(var3, (SubLObject)module0719.$ic103$, (SubLObject)module0719.$ic104$, (SubLObject)module0719.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var5_104, var4);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var5_101, var4);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)module0719.UNPROVIDED);
                    SubLObject var19 = var14;
                    SubLObject var20 = (SubLObject)module0719.NIL;
                    var20 = var19.first();
                    while (module0719.NIL != var19) {
                        final SubLObject var21 = module0718.f44015(var20);
                        final SubLObject var22 = module0718.f44017(var20, module0719.$g5679$.getDynamicValue(var4));
                        final SubLObject var23 = module0718.f44011(var20);
                        final SubLObject var24 = module0718.f44016(var20);
                        final SubLObject var25 = module0718.f44010(var20);
                        var15 = ConsesLow.append(var15, conses_high.copy_list(var22));
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        if (module0719.NIL != module0015.$g517$.getGlobalValue()) {
                            module0642.f39020(module0015.$g366$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                            module0642.f39020(module0015.$g517$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                        final SubLObject var5_105 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)module0719.T, var4);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                            final SubLObject var5_106 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                                module0665.f40441(var3, (SubLObject)module0719.$ic111$, var23, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                                module0665.f40437(var3, (SubLObject)module0719.$ic112$, var23);
                                module0642.f39032((SubLObject)module0719.UNPROVIDED);
                                f44039(var20);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_106, var4);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                            final SubLObject var5_107 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                                f44039(var24);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_107, var4);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0719.$ic106$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                            final SubLObject var5_108 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                                if (module0719.NIL != assertion_handles_oc.f11035(var25)) {
                                    module0665.f40436(var3, (SubLObject)module0719.$ic107$, assertion_handles_oc.f11025(var25), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                                    module0642.f39027((SubLObject)module0719.$ic90$, (SubLObject)module0719.THREE_INTEGER);
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var5_108, var4);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_105, var4);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0719.UNPROVIDED);
                        SubLObject var43_117 = Sort.sort(var22, Symbols.symbol_function((SubLObject)module0719.$ic84$), (SubLObject)module0719.UNPROVIDED);
                        SubLObject var26 = (SubLObject)module0719.NIL;
                        var26 = var43_117.first();
                        while (module0719.NIL != var43_117) {
                            final SubLObject var27 = module0217.f14427((SubLObject)ConsesLow.list(module0719.$ic87$, var26, var21), module0719.$g5679$.getDynamicValue(var4));
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            if (module0719.NIL != module0015.$g517$.getGlobalValue()) {
                                module0642.f39020(module0015.$g366$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                                module0642.f39020(module0015.$g517$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                            final SubLObject var5_109 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                                final SubLObject var5_110 = module0015.$g533$.currentBinding(var4);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0719.T, var4);
                                    module0642.f39032((SubLObject)module0719.FIVE_INTEGER);
                                    module0665.f40440(var3, Symbols.make_keyword(PrintLow.format((SubLObject)module0719.NIL, (SubLObject)module0719.$ic113$, var23)), var26, (SubLObject)module0719.UNPROVIDED);
                                    module0665.f40436(var3, Symbols.make_keyword(PrintLow.format((SubLObject)module0719.NIL, (SubLObject)module0719.$ic114$, var23)), var26, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                                    module0642.f39027((SubLObject)module0719.$ic90$, (SubLObject)module0719.UNPROVIDED);
                                    if (module0719.NIL != assertion_handles_oc.f11035(var27)) {
                                        module0656.f39837((SubLObject)module0719.$ic89$, var27, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                                    }
                                    f44039(var26);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_110, var4);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                                final SubLObject var5_111 = module0015.$g533$.currentBinding(var4);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0719.T, var4);
                                    if (module0719.NIL != assertion_handles_oc.f11035(var27)) {
                                        module0642.f39027((SubLObject)module0719.$ic90$, (SubLObject)module0719.TWO_INTEGER);
                                        f44039(module0178.f11287(var27));
                                    }
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_111, var4);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0719.$ic106$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                                final SubLObject var5_112 = module0015.$g533$.currentBinding(var4);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0719.T, var4);
                                    if (module0719.NIL != assertion_handles_oc.f11035(var27)) {
                                        module0642.f39027((SubLObject)module0719.$ic90$, (SubLObject)module0719.THREE_INTEGER);
                                        module0665.f40436(var3, (SubLObject)module0719.$ic107$, assertion_handles_oc.f11025(var27), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                                    }
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_112, var4);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var5_109, var4);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0719.UNPROVIDED);
                            var43_117 = var43_117.rest();
                            var26 = var43_117.first();
                        }
                        var19 = var19.rest();
                        var20 = var19.first();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var5_100, var4);
                }
                module0642.f39020(module0015.$g347$.getGlobalValue());
                module0642.f39026((SubLObject)module0719.UNPROVIDED);
            }
            if (module0719.NIL != var15) {
                module0665.f40421((SubLObject)module0719.$ic115$, var3, (SubLObject)module0719.T);
            }
            module0642.f39011();
            var16 = conses_high.set_difference(var18, var15, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
            if (module0719.NIL != var16) {
                var16 = Sort.sort(var16, Symbols.symbol_function((SubLObject)module0719.$ic84$), (SubLObject)module0719.UNPROVIDED);
                final SubLObject var28 = Sequences.length(var16);
                if (var28.numG((SubLObject)module0719.$ic116$)) {
                    var17 = Numbers.subtract(var28, (SubLObject)module0719.$ic116$);
                    var16 = module0035.f2124((SubLObject)module0719.$ic117$, var16);
                }
                module0665.f40421((SubLObject)module0719.$ic118$, var3, (SubLObject)module0719.T);
                final SubLObject var29 = Numbers.numL(Sequences.length(var16), (SubLObject)module0719.TWENTY_INTEGER);
                module0642.f39020(module0015.$g346$.getGlobalValue());
                module0642.f39020(module0015.$g352$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020(module0015.$g353$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020(module0015.$g354$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                if (module0719.NIL != module0015.$g516$.getGlobalValue()) {
                    module0642.f39020(module0015.$g357$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020(module0015.$g516$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                }
                module0642.f39020(module0015.$g358$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020((SubLObject)module0719.$ic82$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var5_113 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var4);
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var5_114 = module0015.$g533$.currentBinding(var4);
                    try {
                        module0015.$g533$.bind((SubLObject)module0719.T, var4);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g375$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39020((SubLObject)module0719.$ic82$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                        final SubLObject var5_115 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)module0719.T, var4);
                            module0642.f39020(module0015.$g209$.getGlobalValue());
                            module0642.f39019((SubLObject)module0719.$ic119$);
                            module0642.f39020(module0015.$g210$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_115, var4);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                        final SubLObject var5_116 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)module0719.T, var4);
                            module0642.f39020(module0015.$g209$.getGlobalValue());
                            module0642.f39019((SubLObject)module0719.$ic102$);
                            module0642.f39020(module0015.$g210$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_116, var4);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                        final SubLObject var5_117 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)module0719.T, var4);
                            module0665.f40445(var3, (SubLObject)module0719.$ic103$, (SubLObject)module0719.$ic104$, (SubLObject)module0719.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var5_117, var4);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var5_114, var4);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)module0719.UNPROVIDED);
                    SubLObject var30 = var16;
                    SubLObject var31 = (SubLObject)module0719.NIL;
                    var31 = var30.first();
                    while (module0719.NIL != var30) {
                        final SubLObject var32 = module0217.f14427((SubLObject)ConsesLow.list(module0719.$ic98$, var31, var5), module0719.$g5679$.getDynamicValue(var4));
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        if (module0719.NIL != module0015.$g517$.getGlobalValue()) {
                            module0642.f39020(module0015.$g366$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                            module0642.f39020(module0015.$g517$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                        final SubLObject var5_118 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)module0719.T, var4);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                            final SubLObject var5_119 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                                module0642.f39032((SubLObject)module0719.FIVE_INTEGER);
                                module0665.f40436(var3, (SubLObject)module0719.$ic120$, var31, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                                module0642.f39032((SubLObject)module0719.UNPROVIDED);
                                if (module0719.NIL != assertion_handles_oc.f11035(var32)) {
                                    module0656.f39837((SubLObject)module0719.$ic89$, var32, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                                    module0642.f39032((SubLObject)module0719.UNPROVIDED);
                                }
                                f44039(var31);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_119, var4);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                            final SubLObject var5_120 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                                if (module0719.NIL != assertion_handles_oc.f11035(var32)) {
                                    f44039(module0178.f11287(var32));
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var5_120, var4);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0719.$ic106$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                            final SubLObject var5_121 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                                if (module0719.NIL != assertion_handles_oc.f11035(var32)) {
                                    module0665.f40436(var3, (SubLObject)module0719.$ic107$, assertion_handles_oc.f11025(var32), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                                    module0642.f39027((SubLObject)module0719.$ic90$, (SubLObject)module0719.THREE_INTEGER);
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var5_121, var4);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_118, var4);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0719.UNPROVIDED);
                        if (module0719.NIL != var29) {
                            SubLObject var33 = module0256.f16661(var31, module0719.$g5679$.getDynamicValue(var4));
                            if (Sequences.length(var33).numL((SubLObject)module0719.TWENTY_INTEGER)) {
                                SubLObject var43_118;
                                var33 = (var43_118 = Sort.sort(var33, Symbols.symbol_function((SubLObject)module0719.$ic84$), (SubLObject)module0719.UNPROVIDED));
                                SubLObject var34 = (SubLObject)module0719.NIL;
                                var34 = var43_118.first();
                                while (module0719.NIL != var43_118) {
                                    final SubLObject var35 = module0217.f14427((SubLObject)ConsesLow.list(module0719.$ic98$, var34, var31), module0719.$g5679$.getDynamicValue(var4));
                                    if (module0719.NIL == module0004.f104(var34, var15, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED)) {
                                        module0642.f39020(module0015.$g364$.getGlobalValue());
                                        if (module0719.NIL != module0015.$g517$.getGlobalValue()) {
                                            module0642.f39020(module0015.$g366$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                                            module0642.f39020(module0015.$g517$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                                        }
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                                        final SubLObject var5_122 = module0015.$g533$.currentBinding(var4);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0719.T, var4);
                                            module0642.f39020(module0015.$g360$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                                            final SubLObject var5_123 = module0015.$g533$.currentBinding(var4);
                                            try {
                                                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                                                module0642.f39032((SubLObject)module0719.EIGHT_INTEGER);
                                                module0642.f39019((SubLObject)module0719.$ic121$);
                                                module0665.f40436(var3, (SubLObject)module0719.$ic120$, var34, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                                                if (module0719.NIL != assertion_handles_oc.f11035(var35)) {
                                                    module0656.f39837((SubLObject)module0719.$ic89$, var35, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                                                    module0642.f39032((SubLObject)module0719.UNPROVIDED);
                                                }
                                                module0642.f39032((SubLObject)module0719.UNPROVIDED);
                                                f44039(var34);
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var5_123, var4);
                                            }
                                            module0642.f39020(module0015.$g361$.getGlobalValue());
                                            module0642.f39020(module0015.$g360$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                                            final SubLObject var5_124 = module0015.$g533$.currentBinding(var4);
                                            try {
                                                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                                                if (module0719.NIL != assertion_handles_oc.f11035(var35)) {
                                                    module0642.f39027((SubLObject)module0719.$ic90$, (SubLObject)module0719.TWO_INTEGER);
                                                    f44039(module0178.f11287(var35));
                                                }
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var5_124, var4);
                                            }
                                            module0642.f39020(module0015.$g361$.getGlobalValue());
                                            module0642.f39020(module0015.$g360$.getGlobalValue());
                                            module0642.f39020(module0015.$g370$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                                            module0642.f39020(module0642.f39049((SubLObject)module0719.$ic106$));
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                                            final SubLObject var5_125 = module0015.$g533$.currentBinding(var4);
                                            try {
                                                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                                                if (module0719.NIL != assertion_handles_oc.f11035(var35)) {
                                                    module0642.f39027((SubLObject)module0719.$ic90$, (SubLObject)module0719.THREE_INTEGER);
                                                    module0665.f40436(var3, (SubLObject)module0719.$ic107$, assertion_handles_oc.f11025(var35), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                                                }
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var5_125, var4);
                                            }
                                            module0642.f39020(module0015.$g361$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var5_122, var4);
                                        }
                                        module0642.f39020(module0015.$g365$.getGlobalValue());
                                        module0642.f39029((SubLObject)module0719.UNPROVIDED);
                                    }
                                    var43_118 = var43_118.rest();
                                    var34 = var43_118.first();
                                }
                            }
                        }
                        var30 = var30.rest();
                        var31 = var30.first();
                    }
                    if (var17.numG((SubLObject)module0719.ZERO_INTEGER)) {
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                        final SubLObject var5_126 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)module0719.T, var4);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                            module0642.f39020((SubLObject)module0719.THREE_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                            final SubLObject var5_127 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                                module0642.f39032((SubLObject)module0719.FIVE_INTEGER);
                                module0642.f39019(var17);
                                module0642.f39019((SubLObject)module0719.$ic122$);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_127, var4);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_126, var4);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0719.UNPROVIDED);
                    }
                }
                finally {
                    module0015.$g533$.rebind(var5_113, var4);
                }
                module0642.f39020(module0015.$g347$.getGlobalValue());
            }
            module0642.f39011();
            if (module0719.NIL != module0259.f16854(var5, module0719.$ic123$, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED)) {
                SubLObject var36 = module0259.f16829(var5, module0719.$g5679$.getDynamicValue(var4), (SubLObject)module0719.UNPROVIDED);
                final SubLObject var37 = (SubLObject)module0719.FOUR_INTEGER;
                SubLObject var38 = (SubLObject)module0719.NIL;
                SubLObject var39 = var36;
                SubLObject var40 = (SubLObject)module0719.NIL;
                var40 = var39.first();
                while (module0719.NIL != var39) {
                    if (module0719.NIL != module0173.f10955(var40)) {
                        var38 = (SubLObject)ConsesLow.cons(var40, var38);
                    }
                    var39 = var39.rest();
                    var40 = var39.first();
                }
                var36 = Sequences.nreverse(var38);
                if (module0719.NIL != var36) {
                    module0665.f40421((SubLObject)module0719.$ic124$, var3, (SubLObject)module0719.T);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020(module0015.$g353$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020(module0015.$g354$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    if (module0719.NIL != module0015.$g512$.getGlobalValue()) {
                        module0642.f39020(module0015.$g357$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39020(module0015.$g512$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g358$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020((SubLObject)module0719.$ic82$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var5_128 = module0015.$g533$.currentBinding(var4);
                    try {
                        module0015.$g533$.bind((SubLObject)module0719.T, var4);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                        final SubLObject var5_129 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)module0719.T, var4);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            if (module0719.NIL != var37) {
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                                module0642.f39020(var37);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                            final SubLObject var5_130 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39019((SubLObject)module0719.$ic125$);
                                module0642.f39020(module0015.$g210$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var5_130, var4);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_129, var4);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0719.UNPROVIDED);
                        SubLObject var41 = Sort.sort(var36, Symbols.symbol_function((SubLObject)module0719.$ic84$), (SubLObject)module0719.UNPROVIDED);
                        final SubLObject var42 = Sequences.length(var41);
                        final SubLObject var43 = Numbers.multiply((SubLObject)module0719.TWENTY_INTEGER, Numbers.subtract(var37, (SubLObject)module0719.ONE_INTEGER));
                        SubLObject var44 = (SubLObject)module0719.ZERO_INTEGER;
                        SubLObject var45 = (SubLObject)module0719.NIL;
                        while (module0719.NIL == var45) {
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            if (module0719.NIL != module0015.$g513$.getGlobalValue()) {
                                module0642.f39020(module0015.$g366$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                                module0642.f39020(module0015.$g513$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                            final SubLObject var5_131 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                                final SubLObject var5_132 = module0015.$g533$.currentBinding(var4);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0719.T, var4);
                                    module0642.f39027((SubLObject)module0719.$ic90$, (SubLObject)module0719.FIVE_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_132, var4);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                SubLObject var46 = Numbers.subtract(var37, (SubLObject)module0719.ONE_INTEGER);
                                while (module0719.ZERO_INTEGER.numL(var46)) {
                                    var46 = Numbers.subtract(var46, (SubLObject)module0719.ONE_INTEGER);
                                    if (module0719.NIL == var45) {
                                        final SubLObject var47 = var41.first();
                                        var41 = var41.rest();
                                        var44 = Numbers.add(var44, (SubLObject)module0719.ONE_INTEGER);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                                        final SubLObject var5_133 = module0015.$g533$.currentBinding(var4);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0719.T, var4);
                                            module0665.f40436(var3, (SubLObject)module0719.$ic126$, var47, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                                            module0642.f39027((SubLObject)module0719.$ic90$, (SubLObject)module0719.UNPROVIDED);
                                            f44039(var47);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var5_133, var4);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                    }
                                    else {
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                                        final SubLObject var5_134 = module0015.$g533$.currentBinding(var4);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0719.T, var4);
                                            module0642.f39027((SubLObject)module0719.$ic90$, (SubLObject)module0719.UNPROVIDED);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var5_134, var4);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                    }
                                    if (var44.numGE(var43) || var44.numGE(var42)) {
                                        var45 = (SubLObject)module0719.T;
                                    }
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var5_131, var4);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0719.UNPROVIDED);
                        }
                        final SubLObject var48 = Numbers.subtract(var42, var43);
                        if (module0719.ZERO_INTEGER.numL(var48)) {
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            if (module0719.NIL != var37) {
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                                module0642.f39020(var37);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                            final SubLObject var5_135 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                                module0642.f39032((SubLObject)module0719.FIVE_INTEGER);
                                module0642.f39019(var48);
                                module0642.f39019((SubLObject)module0719.$ic127$);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_135, var4);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        module0642.f39026((SubLObject)module0719.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_128, var4);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                }
            }
            module0642.f39026((SubLObject)module0719.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var13, var4);
            module0147.$g2094$.rebind(var9, var4);
        }
        return var3;
    }
    
    public static SubLObject f44064(final SubLObject var17, final SubLObject var18) {
        f44065(var17, var18, (SubLObject)module0719.ZERO_INTEGER);
        return (SubLObject)module0719.NIL;
    }
    
    public static SubLObject f44066(final SubLObject var17) {
        return (SubLObject)((var17.getClass() == $sX48206_native.class) ? module0719.T : module0719.NIL);
    }
    
    public static SubLObject f44067(final SubLObject var17) {
        assert module0719.NIL != f44066(var17) : var17;
        return var17.getField2();
    }
    
    public static SubLObject f44068(final SubLObject var17) {
        assert module0719.NIL != f44066(var17) : var17;
        return var17.getField3();
    }
    
    public static SubLObject f44069(final SubLObject var17) {
        assert module0719.NIL != f44066(var17) : var17;
        return var17.getField4();
    }
    
    public static SubLObject f44070(final SubLObject var17) {
        assert module0719.NIL != f44066(var17) : var17;
        return var17.getField5();
    }
    
    public static SubLObject f44071(final SubLObject var17) {
        assert module0719.NIL != f44066(var17) : var17;
        return var17.getField6();
    }
    
    public static SubLObject f44072(final SubLObject var17) {
        assert module0719.NIL != f44066(var17) : var17;
        return var17.getField7();
    }
    
    public static SubLObject f44073(final SubLObject var17) {
        assert module0719.NIL != f44066(var17) : var17;
        return var17.getField8();
    }
    
    public static SubLObject f44074(final SubLObject var17) {
        assert module0719.NIL != f44066(var17) : var17;
        return var17.getField9();
    }
    
    public static SubLObject f44075(final SubLObject var17, final SubLObject var20) {
        assert module0719.NIL != f44066(var17) : var17;
        return var17.setField2(var20);
    }
    
    public static SubLObject f44076(final SubLObject var17, final SubLObject var20) {
        assert module0719.NIL != f44066(var17) : var17;
        return var17.setField3(var20);
    }
    
    public static SubLObject f44077(final SubLObject var17, final SubLObject var20) {
        assert module0719.NIL != f44066(var17) : var17;
        return var17.setField4(var20);
    }
    
    public static SubLObject f44078(final SubLObject var17, final SubLObject var20) {
        assert module0719.NIL != f44066(var17) : var17;
        return var17.setField5(var20);
    }
    
    public static SubLObject f44079(final SubLObject var17, final SubLObject var20) {
        assert module0719.NIL != f44066(var17) : var17;
        return var17.setField6(var20);
    }
    
    public static SubLObject f44080(final SubLObject var17, final SubLObject var20) {
        assert module0719.NIL != f44066(var17) : var17;
        return var17.setField7(var20);
    }
    
    public static SubLObject f44081(final SubLObject var17, final SubLObject var20) {
        assert module0719.NIL != f44066(var17) : var17;
        return var17.setField8(var20);
    }
    
    public static SubLObject f44082(final SubLObject var17, final SubLObject var20) {
        assert module0719.NIL != f44066(var17) : var17;
        return var17.setField9(var20);
    }
    
    public static SubLObject f44083(SubLObject var21) {
        if (var21 == module0719.UNPROVIDED) {
            var21 = (SubLObject)module0719.NIL;
        }
        final SubLObject var22 = (SubLObject)new $sX48206_native();
        SubLObject var23;
        SubLObject var24;
        SubLObject var25;
        SubLObject var26;
        for (var23 = (SubLObject)module0719.NIL, var23 = var21; module0719.NIL != var23; var23 = conses_high.cddr(var23)) {
            var24 = var23.first();
            var25 = conses_high.cadr(var23);
            var26 = var24;
            if (var26.eql((SubLObject)module0719.$ic51$)) {
                f44075(var22, var25);
            }
            else if (var26.eql((SubLObject)module0719.$ic52$)) {
                f44076(var22, var25);
            }
            else if (var26.eql((SubLObject)module0719.$ic153$)) {
                f44077(var22, var25);
            }
            else if (var26.eql((SubLObject)module0719.$ic28$)) {
                f44078(var22, var25);
            }
            else if (var26.eql((SubLObject)module0719.$ic53$)) {
                f44079(var22, var25);
            }
            else if (var26.eql((SubLObject)module0719.$ic54$)) {
                f44080(var22, var25);
            }
            else if (var26.eql((SubLObject)module0719.$ic154$)) {
                f44081(var22, var25);
            }
            else if (var26.eql((SubLObject)module0719.$ic155$)) {
                f44082(var22, var25);
            }
            else {
                Errors.error((SubLObject)module0719.$ic56$, var24);
            }
        }
        return var22;
    }
    
    public static SubLObject f44084(final SubLObject var27, final SubLObject var28) {
        Functions.funcall(var28, var27, (SubLObject)module0719.$ic57$, (SubLObject)module0719.$ic156$, (SubLObject)module0719.EIGHT_INTEGER);
        Functions.funcall(var28, var27, (SubLObject)module0719.$ic59$, (SubLObject)module0719.$ic51$, f44067(var27));
        Functions.funcall(var28, var27, (SubLObject)module0719.$ic59$, (SubLObject)module0719.$ic52$, f44068(var27));
        Functions.funcall(var28, var27, (SubLObject)module0719.$ic59$, (SubLObject)module0719.$ic153$, f44069(var27));
        Functions.funcall(var28, var27, (SubLObject)module0719.$ic59$, (SubLObject)module0719.$ic28$, f44070(var27));
        Functions.funcall(var28, var27, (SubLObject)module0719.$ic59$, (SubLObject)module0719.$ic53$, f44071(var27));
        Functions.funcall(var28, var27, (SubLObject)module0719.$ic59$, (SubLObject)module0719.$ic54$, f44072(var27));
        Functions.funcall(var28, var27, (SubLObject)module0719.$ic59$, (SubLObject)module0719.$ic154$, f44073(var27));
        Functions.funcall(var28, var27, (SubLObject)module0719.$ic59$, (SubLObject)module0719.$ic155$, f44074(var27));
        Functions.funcall(var28, var27, (SubLObject)module0719.$ic60$, (SubLObject)module0719.$ic156$, (SubLObject)module0719.EIGHT_INTEGER);
        return var27;
    }
    
    public static SubLObject f44085(final SubLObject var27, final SubLObject var28) {
        return f44084(var27, var28);
    }
    
    public static SubLObject f44065(final SubLObject var16, final SubLObject var18, final SubLObject var29) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        if (module0719.NIL != print_high.$print_level$.getDynamicValue(var30) && var29.numG(print_high.$print_level$.getDynamicValue(var30))) {
            print_high.princ((SubLObject)module0719.$ic63$, var18);
        }
        else if (module0719.NIL != print_high.$print_readably$.getDynamicValue(var30)) {
            print_high.print_not_readable(var16, var18);
        }
        else {
            streams_high.write_string((SubLObject)module0719.$ic64$, var18, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var16), new SubLObject[] { module0719.$ic65$, var18 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var18);
            print_high.princ(f44067(var16), var18);
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var18);
        }
        return var16;
    }
    
    public static SubLObject f44086(final SubLObject var34, final SubLObject var35) {
        SubLObject var37;
        final SubLObject var36 = var37 = var34.rest();
        SubLObject var38 = (SubLObject)module0719.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var37, var36, (SubLObject)module0719.$ic67$);
        var38 = var37.first();
        final SubLObject var39;
        var37 = (var39 = var37.rest());
        final SubLObject var40 = (SubLObject)module0719.$ic158$;
        return (SubLObject)ConsesLow.list((SubLObject)module0719.$ic69$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var40, (SubLObject)ConsesLow.list((SubLObject)module0719.$ic156$, (SubLObject)ConsesLow.list((SubLObject)module0719.$ic70$, var39)))), (SubLObject)ConsesLow.list((SubLObject)module0719.$ic71$, (SubLObject)ConsesLow.list((SubLObject)module0719.$ic137$, var40), (SubLObject)ConsesLow.list((SubLObject)module0719.$ic70$, var38)), (SubLObject)ConsesLow.list((SubLObject)module0719.$ic74$, (SubLObject)module0719.$ic159$, (SubLObject)ConsesLow.list((SubLObject)module0719.$ic76$, var40, (SubLObject)ConsesLow.listS((SubLObject)module0719.$ic77$, (SubLObject)ConsesLow.list((SubLObject)module0719.$ic70$, var38), (SubLObject)module0719.$ic160$))));
    }
    
    public static SubLObject f44087() {
        return module0719.$g5687$.getGlobalValue();
    }
    
    public static SubLObject f44088(final SubLObject var175) {
        return Sort.sort(var175, Symbols.symbol_function((SubLObject)module0719.$ic161$), Symbols.symbol_function((SubLObject)module0719.$ic141$));
    }
    
    public static SubLObject f44089(final SubLObject var14) {
        SubLObject var15 = (SubLObject)module0719.NIL;
        SubLObject var16 = f44087();
        SubLObject var17 = (SubLObject)module0719.NIL;
        var17 = var16.first();
        while (module0719.NIL != var16) {
            final SubLObject var18 = f44070(var17);
            if (var14.eql(var18)) {
                var15 = (SubLObject)ConsesLow.cons(var17, var15);
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        return f44088(var15);
    }
    
    public static SubLObject f44037(final SubLObject var14, SubLObject var3) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = f44089(var14);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        if (module0719.NIL != module0015.$g491$.getGlobalValue()) {
            module0642.f39020(module0015.$g357$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            module0642.f39020(module0015.$g491$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        }
        module0642.f39020(module0015.$g358$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020((SubLObject)module0719.$ic82$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
        final SubLObject var17 = module0015.$g533$.currentBinding(var15);
        try {
            module0015.$g533$.bind((SubLObject)module0719.T, var15);
            SubLObject var18 = var16;
            SubLObject var19 = (SubLObject)module0719.NIL;
            var19 = var18.first();
            while (module0719.NIL != var18) {
                if (module0719.NIL != f44066(var19)) {
                    final SubLObject var20 = f44071(var19);
                    final SubLObject var21 = f44072(var19);
                    if (var20.isFunctionSpec() && var21.isFunctionSpec() && module0719.NIL != Functions.funcall(var20, var3)) {
                        var3 = Functions.funcall(var21, var3);
                    }
                }
                var18 = var18.rest();
                var19 = var18.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var17, var15);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return var3;
    }
    
    public static SubLObject f44034(SubLObject var3) {
        SubLObject var4 = module0719.$g5687$.getGlobalValue();
        SubLObject var5 = (SubLObject)module0719.NIL;
        var5 = var4.first();
        while (module0719.NIL != var4) {
            final SubLObject var6 = f44073(var5);
            final SubLObject var7 = f44074(var5);
            if (var6.isFunctionSpec() && var7.isFunctionSpec() && module0719.NIL != Functions.funcall(var6, var3)) {
                var3 = Functions.funcall(var7, var3);
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        return var3;
    }
    
    public static SubLObject f44090(final SubLObject var3) {
        return (SubLObject)module0719.T;
    }
    
    public static SubLObject f44091(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        if (module0719.NIL != module0015.$g491$.getGlobalValue()) {
            module0642.f39020(module0015.$g357$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            module0642.f39020(module0015.$g491$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        }
        module0642.f39020(module0015.$g358$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020((SubLObject)module0719.$ic82$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var4);
        try {
            module0015.$g533$.bind((SubLObject)module0719.T, var4);
            SubLObject var6 = (SubLObject)module0719.NIL;
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var5_185 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g371$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020((SubLObject)module0719.TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var5_186 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var4);
                    SubLObject var7 = conses_high.getf(module0719.$g5685$.getDynamicValue(var4), (SubLObject)module0719.$ic167$, (SubLObject)module0719.UNPROVIDED);
                    SubLObject var8 = (SubLObject)module0719.NIL;
                    var8 = var7.first();
                    while (module0719.NIL != var7) {
                        final SubLObject var9 = var8;
                        if (module0719.NIL == conses_high.member(var9, var6, Symbols.symbol_function((SubLObject)module0719.EQL), Symbols.symbol_function((SubLObject)module0719.IDENTITY))) {
                            var6 = (SubLObject)ConsesLow.cons(var9, var6);
                        }
                        final SubLObject var10 = Hashtables.gethash(var8, module0719.$g5682$.getDynamicValue(var4), (SubLObject)module0719.UNPROVIDED);
                        if (module0719.NIL != var10) {
                            final SubLObject var11 = PrintLow.format((SubLObject)module0719.NIL, (SubLObject)module0719.$ic164$, f44046(var10));
                            final SubLObject var12 = module0665.f40419((SubLObject)module0719.$ic12$, var3);
                            final SubLObject var13 = Functions.funcall(f44045(var10), var3);
                            if (module0719.NIL != var13) {
                                if (var8.eql(module0665.f40419((SubLObject)module0719.$ic28$, var3))) {
                                    module0642.f39020(module0015.$g209$.getGlobalValue());
                                    module0642.f39019(var11);
                                    module0642.f39020(module0015.$g210$.getGlobalValue());
                                }
                                else {
                                    final SubLObject var14 = PrintLow.format((SubLObject)module0719.NIL, (SubLObject)module0719.$ic165$, module0110.$g570$.getDynamicValue(var4), module0665.f40434(module0665.f40433((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0719.$ic12$, var12), (SubLObject)ConsesLow.list((SubLObject)module0719.$ic166$, var8))), module0719.$g5681$.getGlobalValue()));
                                    module0642.f39020(module0015.$g381$.getGlobalValue());
                                    module0642.f39020(module0015.$g383$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                                    module0642.f39020(var14);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                                    final SubLObject var5_187 = module0015.$g533$.currentBinding(var4);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0719.T, var4);
                                        module0642.f39019(var11);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var5_187, var4);
                                    }
                                    module0642.f39020(module0015.$g382$.getGlobalValue());
                                }
                                module0642.f39032((SubLObject)module0719.UNPROVIDED);
                            }
                        }
                        var7 = var7.rest();
                        var8 = var7.first();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var5_186, var4);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var5_185, var4);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0719.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var5, var4);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        module0642.f39026((SubLObject)module0719.UNPROVIDED);
        return var3;
    }
    
    public static SubLObject f44092(final SubLObject var3) {
        return (SubLObject)module0719.T;
    }
    
    public static SubLObject f44093(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0665.f40419((SubLObject)module0719.$ic166$, var3);
        if (module0719.NIL != var5) {
            module0665.f40421((SubLObject)module0719.$ic28$, var3, var5);
        }
        SubLObject var6 = (SubLObject)module0719.NIL;
        if (module0719.NIL == var6) {
            SubLObject var7 = (SubLObject)ConsesLow.cons(module0665.f40419((SubLObject)module0719.$ic28$, var3), conses_high.getf(module0719.$g5685$.getDynamicValue(var4), (SubLObject)module0719.$ic94$, (SubLObject)module0719.UNPROVIDED));
            SubLObject var8 = (SubLObject)module0719.NIL;
            var8 = var7.first();
            while (module0719.NIL == var6 && module0719.NIL != var7) {
                final SubLObject var9 = f44058(var8, var3);
                if (module0719.NIL != var9) {
                    var6 = (SubLObject)module0719.T;
                    module0665.f40421((SubLObject)module0719.$ic28$, var3, var8);
                }
                var7 = var7.rest();
                var8 = var7.first();
            }
        }
        return var3;
    }
    
    public static SubLObject f44094(final SubLObject var3) {
        return (SubLObject)module0719.T;
    }
    
    public static SubLObject f44095(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0665.f40419((SubLObject)module0719.$ic12$, var3);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        if (module0719.NIL != module0015.$g508$.getGlobalValue()) {
            module0642.f39020(module0015.$g357$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            module0642.f39020(module0015.$g508$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        }
        module0642.f39020(module0015.$g358$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020((SubLObject)module0719.$ic82$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
        final SubLObject var6 = module0015.$g533$.currentBinding(var4);
        try {
            module0015.$g533$.bind((SubLObject)module0719.T, var4);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var5_194 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0719.$ic170$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var5_195 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var4);
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    module0642.f39020(module0015.$g221$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020((SubLObject)module0719.FIVE_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var5_196 = module0015.$g533$.currentBinding(var4);
                    try {
                        module0015.$g533$.bind((SubLObject)module0719.T, var4);
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        f44039(var5);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var5_196, var4);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var5_195, var4);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0719.$ic88$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0719.$ic170$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var5_197 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var4);
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    module0642.f39020(module0015.$g221$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020((SubLObject)module0719.THREE_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var5_198 = module0015.$g533$.currentBinding(var4);
                    try {
                        module0015.$g533$.bind((SubLObject)module0719.T, var4);
                        module0642.f39019((SubLObject)module0719.$ic171$);
                        module0656.f39804(var5, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39019((SubLObject)module0719.$ic172$);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_198, var4);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var5_197, var4);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var5_194, var4);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0719.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            if (module0719.NIL != module0015.$g508$.getGlobalValue()) {
                module0642.f39020(module0015.$g366$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020(module0015.$g508$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var5_199 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g371$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020((SubLObject)module0719.TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var5_200 = module0015.$g533$.currentBinding(var4);
                final SubLObject var7 = module0147.$g2094$.currentBinding(var4);
                final SubLObject var8 = module0147.$g2095$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var4);
                    module0147.$g2094$.bind((SubLObject)module0719.$ic173$, var4);
                    module0147.$g2095$.bind(module0719.$ic174$, var4);
                    final SubLObject var9 = Sort.sort(Sequences.remove_duplicates(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0719.$ic175$), module0219.f14509(var5, (SubLObject)module0719.ONE_INTEGER, module0719.$ic87$, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED)), Symbols.symbol_function((SubLObject)module0719.$ic176$), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED), Symbols.symbol_function((SubLObject)module0719.$ic84$), (SubLObject)module0719.UNPROVIDED);
                    if (module0719.NIL != module0035.sublisp_boolean(var9)) {
                        module0642.f39019((SubLObject)module0719.$ic177$);
                        SubLObject var10 = var9;
                        SubLObject var11 = (SubLObject)module0719.NIL;
                        var11 = var10.first();
                        while (module0719.NIL != var10) {
                            f44039(var11);
                            module0642.f39019((SubLObject)module0719.$ic178$);
                            var10 = var10.rest();
                            var11 = var10.first();
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var8, var4);
                    module0147.$g2094$.rebind(var7, var4);
                    module0015.$g533$.rebind(var5_200, var4);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var5_199, var4);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0719.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            if (module0719.NIL != module0015.$g509$.getGlobalValue()) {
                module0642.f39020(module0015.$g366$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020(module0015.$g509$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var5_201 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g371$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020((SubLObject)module0719.TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var5_202 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var4);
                    final SubLObject var12 = module0220.f14565(var5, module0719.$ic179$, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                    if (module0719.NIL != var12) {
                        SubLObject var13 = var12;
                        SubLObject var14 = (SubLObject)module0719.NIL;
                        var14 = var13.first();
                        while (module0719.NIL != var13) {
                            f44039(var14);
                            var13 = var13.rest();
                            var14 = var13.first();
                        }
                    }
                    else {
                        module0642.f39019((SubLObject)module0719.$ic180$);
                    }
                }
                finally {
                    module0015.$g533$.rebind(var5_202, var4);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var5_201, var4);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0719.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var6, var4);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        module0642.f39026((SubLObject)module0719.UNPROVIDED);
        final SubLObject var15 = module0259.f16952(var5, module0719.$g5679$.getDynamicValue(var4));
        final SubLObject var16 = module0259.f16822(var5, module0719.$g5679$.getDynamicValue(var4), (SubLObject)module0719.UNPROVIDED);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        if (module0719.NIL != module0015.$g512$.getGlobalValue()) {
            module0642.f39020(module0015.$g357$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            module0642.f39020(module0015.$g512$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        }
        module0642.f39020(module0015.$g358$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020((SubLObject)module0719.$ic82$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
        final SubLObject var17 = module0015.$g533$.currentBinding(var4);
        try {
            module0015.$g533$.bind((SubLObject)module0719.T, var4);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var5_203 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g375$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020((SubLObject)module0719.$ic82$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var5_204 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var4);
                    module0642.f39020(module0015.$g209$.getGlobalValue());
                    module0642.f39019((SubLObject)module0719.$ic181$);
                    module0642.f39020(module0015.$g210$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var5_204, var4);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var5_205 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var4);
                    module0642.f39020(module0015.$g209$.getGlobalValue());
                    module0642.f39019((SubLObject)module0719.$ic102$);
                    module0642.f39020(module0015.$g210$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var5_205, var4);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var5_206 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var4);
                    module0665.f40445(var3, (SubLObject)module0719.$ic103$, (SubLObject)module0719.$ic104$, (SubLObject)module0719.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var5_206, var4);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var5_203, var4);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0719.UNPROVIDED);
            if (module0719.NIL == var16) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                if (module0719.NIL != module0015.$g513$.getGlobalValue()) {
                    module0642.f39020(module0015.$g366$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    module0642.f39020(module0015.$g513$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var5_207 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var4);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var5_208 = module0015.$g533$.currentBinding(var4);
                    try {
                        module0015.$g533$.bind((SubLObject)module0719.T, var4);
                        module0642.f39032((SubLObject)module0719.FIVE_INTEGER);
                        module0642.f39019((SubLObject)module0719.$ic182$);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_208, var4);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var5_207, var4);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0719.UNPROVIDED);
            }
            SubLObject var18 = module0549.f33908(var15, (SubLObject)module0719.$ic183$);
            SubLObject var19 = (SubLObject)module0719.NIL;
            var19 = var18.first();
            while (module0719.NIL != var18) {
                SubLObject var43_217;
                final SubLObject var20 = var43_217 = module0217.f14425((SubLObject)ConsesLow.list(module0719.$ic87$, var5, var19));
                SubLObject var21 = (SubLObject)module0719.NIL;
                var21 = var43_217.first();
                while (module0719.NIL != var43_217) {
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    if (module0719.NIL != module0015.$g513$.getGlobalValue()) {
                        module0642.f39020(module0015.$g366$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39020(module0015.$g513$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var5_209 = module0015.$g533$.currentBinding(var4);
                    try {
                        module0015.$g533$.bind((SubLObject)module0719.T, var4);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                        final SubLObject var5_210 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)module0719.T, var4);
                            module0642.f39032((SubLObject)module0719.FIVE_INTEGER);
                            if (module0719.NIL != var21) {
                                module0656.f39837((SubLObject)module0719.$ic89$, var21, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                                module0642.f39032((SubLObject)module0719.UNPROVIDED);
                            }
                            f44039(var19);
                        }
                        finally {
                            module0015.$g533$.rebind(var5_210, var4);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                        final SubLObject var5_211 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)module0719.T, var4);
                            f44039(module0178.f11287(var21));
                        }
                        finally {
                            module0015.$g533$.rebind(var5_211, var4);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0719.$ic106$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                        final SubLObject var5_212 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)module0719.T, var4);
                            module0665.f40436(var3, (SubLObject)module0719.$ic107$, assertion_handles_oc.f11025(var21), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var5_212, var4);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var5_209, var4);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)module0719.UNPROVIDED);
                    var43_217 = var43_217.rest();
                    var21 = var43_217.first();
                }
                var18 = var18.rest();
                var19 = var18.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var17, var4);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        module0642.f39026((SubLObject)module0719.UNPROVIDED);
        return var3;
    }
    
    public static SubLObject f44096(final SubLObject var3) {
        return (SubLObject)module0719.NIL;
    }
    
    public static SubLObject f44097(final SubLObject var3) {
        return var3;
    }
    
    public static SubLObject f44098(final SubLObject var3) {
        return (SubLObject)module0719.T;
    }
    
    public static SubLObject f44099(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var4);
        try {
            module0015.$g533$.bind((SubLObject)module0719.T, var4);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var5_222 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                module0642.f39020(module0015.$g209$.getGlobalValue());
                module0642.f39019((SubLObject)module0719.$ic186$);
                f44039(module0665.f40419((SubLObject)module0719.$ic12$, var3));
                module0642.f39019((SubLObject)module0719.$ic187$);
                module0642.f39020(module0015.$g210$.getGlobalValue());
                module0665.f40445(var3, (SubLObject)module0719.$ic188$, (SubLObject)module0719.$ic189$, (SubLObject)module0719.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var5_222, var4);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var5, var4);
        }
        module0642.f39020(module0015.$g365$.getGlobalValue());
        module0642.f39029((SubLObject)module0719.UNPROVIDED);
        return var3;
    }
    
    public static SubLObject f44100(final SubLObject var3) {
        return module0035.sublisp_boolean(module0665.f40419((SubLObject)module0719.$ic189$, var3));
    }
    
    public static SubLObject f44101(SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0665.f40419((SubLObject)module0719.$ic12$, var3);
        final SubLObject var6 = module0665.f40420((SubLObject)module0719.$ic92$, var3);
        final SubLObject var7 = module0665.f40420((SubLObject)module0719.$ic93$, var3);
        SubLObject var8 = var6;
        SubLObject var9 = module0665.f40420((SubLObject)module0719.$ic83$, var3);
        SubLObject var10 = (SubLObject)module0719.NIL;
        var10 = var9.first();
        while (module0719.NIL != var9) {
            SubLObject var43_226 = module0665.f40420(var10, var3);
            SubLObject var11 = (SubLObject)module0719.NIL;
            var11 = var43_226.first();
            while (module0719.NIL != var43_226) {
                if (module0719.NIL != module0173.f10955(var11)) {
                    final SubLObject var12 = var11;
                    if (module0719.NIL == conses_high.member(var12, var8, Symbols.symbol_function((SubLObject)module0719.EQL), Symbols.symbol_function((SubLObject)module0719.IDENTITY))) {
                        var8 = (SubLObject)ConsesLow.cons(var12, var8);
                    }
                }
                var43_226 = var43_226.rest();
                var11 = var43_226.first();
            }
            var9 = var9.rest();
            var10 = var9.first();
        }
        var9 = var7;
        SubLObject var13 = (SubLObject)module0719.NIL;
        var13 = var9.first();
        while (module0719.NIL != var9) {
            SubLObject var43_227;
            final SubLObject var14 = var43_227 = module0665.f40420(var13, var3);
            SubLObject var15 = (SubLObject)module0719.NIL;
            var15 = var43_227.first();
            while (module0719.NIL != var43_227) {
                if (module0719.NIL != module0173.f10955(var15)) {
                    final SubLObject var16 = var15;
                    if (module0719.NIL == conses_high.member(var16, var8, Symbols.symbol_function((SubLObject)module0719.EQL), Symbols.symbol_function((SubLObject)module0719.IDENTITY))) {
                        var8 = (SubLObject)ConsesLow.cons(var16, var8);
                    }
                }
                var43_227 = var43_227.rest();
                var15 = var43_227.first();
            }
            var9 = var9.rest();
            var13 = var9.first();
        }
        if (module0719.NIL == var8) {
            module0665.f40423((SubLObject)module0719.$ic190$, (SubLObject)module0719.$ic191$, var3);
            return var3;
        }
        var9 = var8;
        SubLObject var17 = (SubLObject)module0719.NIL;
        var17 = var9.first();
        while (module0719.NIL != var9) {
            SubLObject var18 = (SubLObject)module0719.NIL;
            var4.resetMultipleValues();
            final SubLObject var233_234 = f44102(var3, (SubLObject)ConsesLow.list(module0719.$ic87$, var5, var17), module0719.$g5679$.getDynamicValue(var4), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var235_236 = var4.secondMultipleValue();
            var4.resetMultipleValues();
            var3 = var233_234;
            var18 = var235_236;
            var9 = var9.rest();
            var17 = var9.first();
        }
        return var3;
    }
    
    public static SubLObject f44103(final SubLObject var3) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0719.NIL != module0665.f40419((SubLObject)module0719.$ic109$, var3) && (module0719.NIL != module0665.f40419((SubLObject)module0719.$ic115$, var3) || module0719.NIL != module0665.f40419((SubLObject)module0719.$ic118$, var3)));
    }
    
    public static SubLObject f44104(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var4);
        try {
            module0015.$g533$.bind((SubLObject)module0719.T, var4);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var5_237 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                module0642.f39020(module0015.$g209$.getGlobalValue());
                module0642.f39019((SubLObject)module0719.$ic194$);
                module0642.f39020(module0015.$g210$.getGlobalValue());
                module0665.f40445(var3, (SubLObject)module0719.$ic188$, (SubLObject)module0719.$ic195$, (SubLObject)module0719.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var5_237, var4);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var5, var4);
        }
        module0642.f39020(module0015.$g365$.getGlobalValue());
        module0642.f39029((SubLObject)module0719.UNPROVIDED);
        return var3;
    }
    
    public static SubLObject f44105(final SubLObject var3) {
        return module0035.sublisp_boolean(module0665.f40419((SubLObject)module0719.$ic195$, var3));
    }
    
    public static SubLObject f44106(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = f44107(var3);
        if (module0719.NIL == var5) {
            module0665.f40423((SubLObject)module0719.$ic190$, (SubLObject)module0719.$ic196$, var3);
        }
        else {
            final SubLObject var6 = module0665.f40419((SubLObject)module0719.$ic112$, var3);
            if (!var6.isNumber()) {
                module0665.f40423((SubLObject)module0719.$ic190$, (SubLObject)module0719.$ic197$, var3);
                return var3;
            }
            final SubLObject var7 = module0718.f44012(var6);
            if (module0719.NIL == module0718.f44009(var7)) {
                module0665.f40423((SubLObject)module0719.$ic190$, (SubLObject)module0719.$ic197$, var3);
                return var3;
            }
            final SubLObject var8 = module0718.f44015(var7);
            if (module0719.NIL == module0269.f17705(var8)) {
                module0665.f40423((SubLObject)module0719.$ic190$, (SubLObject)ConsesLow.list((SubLObject)module0719.$ic198$, (SubLObject)module0719.$ic199$, module0718.f44013(var7)), var3);
                return var3;
            }
            SubLObject var9 = var5;
            SubLObject var10 = (SubLObject)module0719.NIL;
            var10 = var9.first();
            while (module0719.NIL != var9) {
                final SubLObject var11 = (SubLObject)ConsesLow.list(module0719.$ic87$, var10, var8);
                f44102(var3, var11, module0719.$g5679$.getDynamicValue(var4), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                var9 = var9.rest();
                var10 = var9.first();
            }
        }
        return var3;
    }
    
    public static SubLObject f44108(final SubLObject var3) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0719.NIL != module0665.f40419((SubLObject)module0719.$ic115$, var3) || module0719.NIL != module0665.f40419((SubLObject)module0719.$ic118$, var3));
    }
    
    public static SubLObject f44109(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0665.f40419((SubLObject)module0719.$ic12$, var3);
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
        SubLObject var6 = module0015.$g533$.currentBinding(var4);
        try {
            module0015.$g533$.bind((SubLObject)module0719.T, var4);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var5_242 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                module0642.f39020(module0015.$g209$.getGlobalValue());
                module0642.f39019((SubLObject)module0719.$ic202$);
                module0642.f39020(module0015.$g210$.getGlobalValue());
                module0665.f40445(var3, (SubLObject)module0719.$ic188$, (SubLObject)module0719.$ic203$, (SubLObject)module0719.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var5_242, var4);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var6, var4);
        }
        module0642.f39020(module0015.$g365$.getGlobalValue());
        module0642.f39029((SubLObject)module0719.UNPROVIDED);
        module0642.f39020(module0015.$g364$.getGlobalValue());
        if (module0719.NIL != module0015.$g492$.getGlobalValue()) {
            module0642.f39020(module0015.$g366$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            module0642.f39020(module0015.$g492$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
        var6 = module0015.$g533$.currentBinding(var4);
        try {
            module0015.$g533$.bind((SubLObject)module0719.T, var4);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var5_243 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                module0642.f39032((SubLObject)module0719.FIVE_INTEGER);
                module0642.f39019((SubLObject)module0719.$ic204$);
                module0642.f39019(module0038.f2867(module0597.f36628(var5), (SubLObject)module0719.UNPROVIDED));
                module0642.f39019((SubLObject)module0719.$ic205$);
                module0665.f40448(var3, (SubLObject)module0719.$ic206$, (SubLObject)module0719.$ic207$, (SubLObject)module0719.TWENTY_INTEGER, (SubLObject)module0719.UNPROVIDED);
                module0642.f39026((SubLObject)module0719.UNPROVIDED);
                module0642.f39032((SubLObject)module0719.FIVE_INTEGER);
                module0642.f39019((SubLObject)module0719.$ic208$);
                module0665.f40437(var3, (SubLObject)module0719.$ic209$, module0719.$ic210$);
                module0642.f39019((SubLObject)module0719.$ic211$);
                module0665.f40437(var3, (SubLObject)module0719.$ic209$, module0719.$ic212$);
                module0642.f39019((SubLObject)module0719.$ic213$);
                module0665.f40437(var3, (SubLObject)module0719.$ic209$, module0719.$ic214$);
                module0642.f39019((SubLObject)module0719.$ic215$);
                module0665.f40437(var3, (SubLObject)module0719.$ic209$, module0719.$ic216$);
                module0642.f39019((SubLObject)module0719.$ic217$);
            }
            finally {
                module0015.$g533$.rebind(var5_243, var4);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var6, var4);
        }
        module0642.f39020(module0015.$g365$.getGlobalValue());
        module0642.f39029((SubLObject)module0719.UNPROVIDED);
        return var3;
    }
    
    public static SubLObject f44110(final SubLObject var3) {
        return module0035.sublisp_boolean(module0665.f40419((SubLObject)module0719.$ic203$, var3));
    }
    
    public static SubLObject f44111(SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0665.f40419((SubLObject)module0719.$ic206$, var3);
        final SubLObject var6 = module0665.f40419((SubLObject)module0719.$ic209$, var3);
        SubLObject var7 = f44107(var3);
        final SubLObject var8 = module0665.f40419((SubLObject)module0719.$ic12$, var3);
        SubLObject var9 = (SubLObject)module0719.NIL;
        SubLObject var10 = module0665.f40420((SubLObject)module0719.$ic111$, var3);
        SubLObject var11 = (SubLObject)module0719.NIL;
        var11 = var10.first();
        while (module0719.NIL != var10) {
            SubLObject var43_247 = module0665.f40420(var11, var3);
            SubLObject var12 = (SubLObject)module0719.NIL;
            var12 = var43_247.first();
            while (module0719.NIL != var43_247) {
                if (module0719.NIL != module0173.f10955(var12)) {
                    final SubLObject var13 = var12;
                    if (module0719.NIL == conses_high.member(var13, var7, Symbols.symbol_function((SubLObject)module0719.EQL), Symbols.symbol_function((SubLObject)module0719.IDENTITY))) {
                        var7 = (SubLObject)ConsesLow.cons(var13, var7);
                    }
                }
                var43_247 = var43_247.rest();
                var12 = var43_247.first();
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        if (module0719.NIL == var7) {
            module0665.f40423((SubLObject)module0719.$ic190$, (SubLObject)module0719.$ic196$, var3);
            var9 = (SubLObject)module0719.T;
        }
        if (module0719.NIL == module0004.f104(var6, module0718.$g5677$.getGlobalValue(), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED)) {
            module0665.f40423((SubLObject)module0719.$ic190$, (SubLObject)module0719.$ic218$, var3);
            var9 = (SubLObject)module0719.T;
        }
        if (module0719.NIL == module0038.f2653(var5)) {
            module0665.f40423((SubLObject)module0719.$ic190$, (SubLObject)module0719.$ic219$, var3);
            var9 = (SubLObject)module0719.T;
        }
        if (module0719.NIL != var9) {
            return var3;
        }
        final SubLObject var14 = module0038.f2867(PrintLow.format((SubLObject)module0719.NIL, (SubLObject)module0719.$ic220$, module0038.f2867(module0597.f36628(var8), (SubLObject)module0719.UNPROVIDED), var5), (SubLObject)module0719.UNPROVIDED);
        final SubLObject var15 = module0543.f33623(var14, (SubLObject)module0719.UNPROVIDED);
        if (module0719.NIL != module0004.f104(var6, module0718.$g5675$.getGlobalValue(), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED)) {
            var4.resetMultipleValues();
            final SubLObject var251_252 = f44102(var3, (SubLObject)ConsesLow.listS(module0719.$ic87$, var15, (SubLObject)module0719.$ic221$), module0719.$g5679$.getDynamicValue(var4), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var253_254 = var4.secondMultipleValue();
            var4.resetMultipleValues();
            var3 = var251_252;
            var9 = var253_254;
        }
        else {
            var4.resetMultipleValues();
            final SubLObject var255_256 = f44102(var3, (SubLObject)ConsesLow.listS(module0719.$ic87$, var15, (SubLObject)module0719.$ic222$), module0719.$g5679$.getDynamicValue(var4), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var257_258 = var4.secondMultipleValue();
            var4.resetMultipleValues();
            var3 = var255_256;
            var9 = var257_258;
        }
        if (module0719.NIL != var9) {
            return var3;
        }
        var4.resetMultipleValues();
        final SubLObject var259_260 = f44102(var3, (SubLObject)ConsesLow.listS(module0719.$ic98$, var15, (SubLObject)module0719.$ic223$), module0719.$g5679$.getDynamicValue(var4), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
        final SubLObject var261_262 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        var3 = var259_260;
        var9 = var261_262;
        if (module0719.NIL != var9) {
            return var3;
        }
        final SubLObject var16 = PrintLow.format((SubLObject)module0719.NIL, (SubLObject)module0719.$ic224$, module0038.f2618(var8), module0038.f2761(module0038.f2866(var5), (SubLObject)module0719.UNPROVIDED));
        var4.resetMultipleValues();
        final SubLObject var264_265 = f44102(var3, (SubLObject)ConsesLow.list(module0719.$ic179$, var15, var16), module0719.$g5679$.getDynamicValue(var4), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
        final SubLObject var266_267 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        var3 = var264_265;
        var9 = var266_267;
        if (module0719.NIL != var9) {
            return var3;
        }
        SubLObject var17 = var7;
        SubLObject var18 = (SubLObject)module0719.NIL;
        var18 = var17.first();
        while (module0719.NIL != var17) {
            var4.resetMultipleValues();
            final SubLObject var268_269 = f44102(var3, (SubLObject)ConsesLow.list(module0719.$ic87$, var18, var15), module0719.$g5679$.getDynamicValue(var4), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var270_271 = var4.secondMultipleValue();
            var4.resetMultipleValues();
            var3 = var268_269;
            var9 = var270_271;
            if (module0719.NIL != var9) {
                return var3;
            }
            var17 = var17.rest();
            var18 = var17.first();
        }
        var4.resetMultipleValues();
        final SubLObject var272_273 = f44102(var3, (SubLObject)ConsesLow.list(var6, var8, var15), module0719.$g5679$.getDynamicValue(var4), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
        final SubLObject var274_275 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        var3 = var272_273;
        var9 = var274_275;
        return var3;
    }
    
    public static SubLObject f44112(final SubLObject var3) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0719.NIL != module0665.f40419((SubLObject)module0719.$ic115$, var3) || module0719.NIL != module0665.f40419((SubLObject)module0719.$ic118$, var3));
    }
    
    public static SubLObject f44113(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
        SubLObject var5 = module0015.$g533$.currentBinding(var4);
        try {
            module0015.$g533$.bind((SubLObject)module0719.T, var4);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var5_276 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                module0642.f39020(module0015.$g209$.getGlobalValue());
                module0642.f39019((SubLObject)module0719.$ic227$);
                module0642.f39020(module0015.$g210$.getGlobalValue());
                module0665.f40445(var3, (SubLObject)module0719.$ic188$, (SubLObject)module0719.$ic228$, (SubLObject)module0719.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var5_276, var4);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var5, var4);
        }
        module0642.f39020(module0015.$g365$.getGlobalValue());
        module0642.f39029((SubLObject)module0719.UNPROVIDED);
        module0642.f39020(module0015.$g364$.getGlobalValue());
        if (module0719.NIL != module0015.$g492$.getGlobalValue()) {
            module0642.f39020(module0015.$g366$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            module0642.f39020(module0015.$g492$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
        var5 = module0015.$g533$.currentBinding(var4);
        try {
            module0015.$g533$.bind((SubLObject)module0719.T, var4);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var5_277 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                module0642.f39032((SubLObject)module0719.FIVE_INTEGER);
                module0642.f39019((SubLObject)module0719.$ic229$);
                module0665.f40448(var3, (SubLObject)module0719.$ic230$, (SubLObject)module0719.$ic207$, (SubLObject)module0719.TWENTY_INTEGER, (SubLObject)module0719.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var5_277, var4);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var5, var4);
        }
        module0642.f39020(module0015.$g365$.getGlobalValue());
        module0642.f39029((SubLObject)module0719.UNPROVIDED);
        return var3;
    }
    
    public static SubLObject f44114(final SubLObject var3) {
        return module0035.sublisp_boolean(module0665.f40419((SubLObject)module0719.$ic228$, var3));
    }
    
    public static SubLObject f44115(SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0038.f2697(module0665.f40419((SubLObject)module0719.$ic230$, var3));
        SubLObject var6 = f44107(var3);
        final SubLObject var7 = module0665.f40419((SubLObject)module0719.$ic12$, var3);
        SubLObject var8 = (SubLObject)module0719.NIL;
        SubLObject var9 = module0665.f40420((SubLObject)module0719.$ic111$, var3);
        SubLObject var10 = (SubLObject)module0719.NIL;
        var10 = var9.first();
        while (module0719.NIL != var9) {
            SubLObject var43_279 = module0665.f40420(var10, var3);
            SubLObject var11 = (SubLObject)module0719.NIL;
            var11 = var43_279.first();
            while (module0719.NIL != var43_279) {
                if (module0719.NIL != module0173.f10955(var11)) {
                    final SubLObject var12 = var11;
                    if (module0719.NIL == conses_high.member(var12, var6, Symbols.symbol_function((SubLObject)module0719.EQL), Symbols.symbol_function((SubLObject)module0719.IDENTITY))) {
                        var6 = (SubLObject)ConsesLow.cons(var12, var6);
                    }
                }
                var43_279 = var43_279.rest();
                var11 = var43_279.first();
            }
            var9 = var9.rest();
            var10 = var9.first();
        }
        if (module0719.NIL == var6) {
            module0665.f40423((SubLObject)module0719.$ic190$, (SubLObject)module0719.$ic196$, var3);
            var8 = (SubLObject)module0719.T;
        }
        if (module0719.NIL == module0126.f8389(var5)) {
            module0665.f40423((SubLObject)module0719.$ic190$, (SubLObject)module0719.$ic231$, var3);
            var8 = (SubLObject)module0719.T;
        }
        if (module0719.NIL != var8) {
            return var3;
        }
        SubLObject var13 = constants_high_oc.f10737(var5);
        if (module0719.NIL == var13) {
            var13 = module0543.f33623(var5, (SubLObject)module0719.UNPROVIDED);
            var4.resetMultipleValues();
            final SubLObject var281_282 = f44102(var3, (SubLObject)ConsesLow.listS(module0719.$ic87$, var13, (SubLObject)module0719.$ic232$), module0719.$g5679$.getDynamicValue(var4), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var283_284 = var4.secondMultipleValue();
            var4.resetMultipleValues();
            var3 = var281_282;
            var8 = var283_284;
            if (module0719.NIL != var8) {
                return var3;
            }
            var4.resetMultipleValues();
            final SubLObject var285_286 = f44102(var3, (SubLObject)ConsesLow.list(module0719.$ic98$, var13, var7), module0719.$g5679$.getDynamicValue(var4), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var287_288 = var4.secondMultipleValue();
            var4.resetMultipleValues();
            var3 = var285_286;
            var8 = var287_288;
            if (module0719.NIL != var8) {
                return var3;
            }
        }
        SubLObject var14 = var6;
        SubLObject var15 = (SubLObject)module0719.NIL;
        var15 = var14.first();
        while (module0719.NIL != var14) {
            var4.resetMultipleValues();
            final SubLObject var289_290 = f44102(var3, (SubLObject)ConsesLow.list(module0719.$ic98$, var15, var13), module0719.$g5679$.getDynamicValue(var4), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var291_292 = var4.secondMultipleValue();
            var4.resetMultipleValues();
            var3 = var289_290;
            var8 = var291_292;
            if (module0719.NIL != var8) {
                return var3;
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        var14 = var6;
        var15 = (SubLObject)module0719.NIL;
        var15 = var14.first();
        while (module0719.NIL != var14) {
            var4.resetMultipleValues();
            final SubLObject var293_294 = f44116(var3, (SubLObject)ConsesLow.list(module0719.$ic98$, var15, var7), module0719.$g5679$.getDynamicValue(var4));
            final SubLObject var295_296 = var4.secondMultipleValue();
            var4.resetMultipleValues();
            var3 = var293_294;
            var8 = var295_296;
            if (module0719.NIL != var8) {
                return var3;
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        return var3;
    }
    
    public static SubLObject f44117(final SubLObject var3) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0719.NIL != module0665.f40419((SubLObject)module0719.$ic115$, var3) && module0719.NIL != module0665.f40419((SubLObject)module0719.$ic118$, var3));
    }
    
    public static SubLObject f44118(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var4);
        try {
            module0015.$g533$.bind((SubLObject)module0719.T, var4);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var5_297 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                module0642.f39020(module0015.$g209$.getGlobalValue());
                module0642.f39019((SubLObject)module0719.$ic235$);
                module0642.f39020(module0015.$g210$.getGlobalValue());
                module0665.f40445(var3, (SubLObject)module0719.$ic188$, (SubLObject)module0719.$ic236$, (SubLObject)module0719.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var5_297, var4);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var5, var4);
        }
        module0642.f39020(module0015.$g365$.getGlobalValue());
        module0642.f39029((SubLObject)module0719.UNPROVIDED);
        return var3;
    }
    
    public static SubLObject f44119(final SubLObject var3) {
        return module0035.sublisp_boolean(module0665.f40419((SubLObject)module0719.$ic236$, var3));
    }
    
    public static SubLObject f44120(SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = f44121(var3);
        final SubLObject var6 = f44122(var3);
        SubLObject var7 = (SubLObject)module0719.NIL;
        if (module0719.NIL == var5) {
            module0665.f40423((SubLObject)module0719.$ic190$, (SubLObject)module0719.$ic237$, var3);
            var7 = (SubLObject)module0719.T;
        }
        if (module0719.NIL == var6) {
            module0665.f40423((SubLObject)module0719.$ic190$, (SubLObject)module0719.$ic238$, var3);
            var7 = (SubLObject)module0719.T;
        }
        if (module0719.NIL != var7) {
            return var3;
        }
        SubLObject var8 = var5;
        SubLObject var9 = (SubLObject)module0719.NIL;
        var9 = var8.first();
        while (module0719.NIL != var8) {
            SubLObject var43_298 = var6;
            SubLObject var10 = (SubLObject)module0719.NIL;
            var10 = var43_298.first();
            while (module0719.NIL != var43_298) {
                var4.resetMultipleValues();
                final SubLObject var300_301 = f44102(var3, (SubLObject)ConsesLow.list(module0719.$ic98$, var9, var10), module0719.$g5679$.getDynamicValue(var4), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var302_303 = var4.secondMultipleValue();
                var4.resetMultipleValues();
                var3 = var300_301;
                var7 = var302_303;
                var43_298 = var43_298.rest();
                var10 = var43_298.first();
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        return var3;
    }
    
    public static SubLObject f44123(final SubLObject var3) {
        return (SubLObject)SubLObjectFactory.makeBoolean((module0719.NIL != module0665.f40419((SubLObject)module0719.$ic115$, var3) || module0719.NIL != module0665.f40419((SubLObject)module0719.$ic118$, var3)) && module0719.NIL != module0665.f40419((SubLObject)module0719.$ic124$, var3));
    }
    
    public static SubLObject f44124(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var4);
        try {
            module0015.$g533$.bind((SubLObject)module0719.T, var4);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var5_304 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                module0642.f39020(module0015.$g209$.getGlobalValue());
                module0642.f39019((SubLObject)module0719.$ic241$);
                module0642.f39020(module0015.$g210$.getGlobalValue());
                module0665.f40445(var3, (SubLObject)module0719.$ic188$, (SubLObject)module0719.$ic242$, (SubLObject)module0719.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var5_304, var4);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var5, var4);
        }
        module0642.f39020(module0015.$g365$.getGlobalValue());
        module0642.f39029((SubLObject)module0719.UNPROVIDED);
        return var3;
    }
    
    public static SubLObject f44125(final SubLObject var3) {
        return module0035.sublisp_boolean(module0665.f40419((SubLObject)module0719.$ic242$, var3));
    }
    
    public static SubLObject f44126(SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0665.f40419((SubLObject)module0719.$ic12$, var3);
        final SubLObject var6 = f44107(var3);
        final SubLObject var7 = f44127(var3);
        SubLObject var8 = (SubLObject)module0719.NIL;
        if (module0719.NIL == var6) {
            module0665.f40423((SubLObject)module0719.$ic190$, (SubLObject)module0719.$ic243$, var3);
            var8 = (SubLObject)module0719.T;
        }
        if (module0719.NIL == var7) {
            module0665.f40423((SubLObject)module0719.$ic190$, (SubLObject)module0719.$ic244$, var3);
            var8 = (SubLObject)module0719.T;
        }
        if (module0719.NIL != var8) {
            return var3;
        }
        SubLObject var9 = var7;
        SubLObject var10 = (SubLObject)module0719.NIL;
        var10 = var9.first();
        while (module0719.NIL != var9) {
            final SubLObject var11 = module0217.f14423((SubLObject)ConsesLow.list(module0719.$ic87$, var10, var5));
            SubLObject var12 = (SubLObject)module0719.NIL;
            SubLObject var13 = (SubLObject)module0719.NIL;
            if (module0719.NIL != assertion_handles_oc.f11035(var11)) {
                var12 = module0178.f11293(var11);
                var13 = module0178.f11291(var11);
            }
            SubLObject var43_308 = var6;
            SubLObject var14 = (SubLObject)module0719.NIL;
            var14 = var43_308.first();
            while (module0719.NIL != var43_308) {
                var4.resetMultipleValues();
                final SubLObject var309_310 = f44102(var3, (SubLObject)ConsesLow.list(module0719.$ic87$, var10, var14), module0719.$g5679$.getDynamicValue(var4), var12, var13);
                final SubLObject var311_312 = var4.secondMultipleValue();
                var4.resetMultipleValues();
                var3 = var309_310;
                var8 = var311_312;
                var43_308 = var43_308.rest();
                var14 = var43_308.first();
            }
            var9 = var9.rest();
            var10 = var9.first();
        }
        return var3;
    }
    
    public static SubLObject f44128(final SubLObject var3) {
        return (SubLObject)module0719.NIL;
    }
    
    public static SubLObject f44129(final SubLObject var3) {
        return var3;
    }
    
    public static SubLObject f44130(final SubLObject var3) {
        return module0035.sublisp_boolean(module0665.f40419((SubLObject)module0719.$ic104$, var3));
    }
    
    public static SubLObject f44131(SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var6;
        final SubLObject var5 = var6 = module0665.f40420((SubLObject)module0719.$ic107$, var3);
        SubLObject var7 = (SubLObject)module0719.NIL;
        var7 = var6.first();
        while (module0719.NIL != var6) {
            final SubLObject var8 = assertion_handles_oc.f11053(var7);
            final SubLObject var9 = module0178.f11285(var8);
            final SubLObject var10 = module0178.f11287(var8);
            final SubLObject var11 = module0665.f40419((SubLObject)module0719.$ic12$, var3);
            final SubLObject var12 = f44132(var11, (SubLObject)module0719.UNPROVIDED);
            SubLObject var13 = (SubLObject)module0719.NIL;
            var4.resetMultipleValues();
            final SubLObject var319_320 = f44116(var3, var9, var10);
            final SubLObject var321_322 = var4.secondMultipleValue();
            var4.resetMultipleValues();
            var3 = var319_320;
            var13 = var321_322;
            if (module0719.NIL != var13) {
                return var3;
            }
            if (module0719.NIL == module0259.f16840(var11, module0719.$g5679$.getDynamicValue(var4), (SubLObject)module0719.UNPROVIDED)) {
                final SubLObject var14 = var12;
                if (var14.eql((SubLObject)module0719.ZERO_INTEGER)) {
                    var4.resetMultipleValues();
                    final SubLObject var323_324 = f44102(var3, (SubLObject)ConsesLow.listS(module0719.$ic87$, var11, (SubLObject)module0719.$ic247$), module0719.$g5679$.getDynamicValue(var4), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var325_326 = var4.secondMultipleValue();
                    var4.resetMultipleValues();
                    var3 = var323_324;
                    var13 = var325_326;
                }
                else if (var14.eql((SubLObject)module0719.ONE_INTEGER)) {
                    var4.resetMultipleValues();
                    final SubLObject var327_328 = f44102(var3, (SubLObject)ConsesLow.listS(module0719.$ic87$, var11, (SubLObject)module0719.$ic232$), module0719.$g5679$.getDynamicValue(var4), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var329_330 = var4.secondMultipleValue();
                    var4.resetMultipleValues();
                    var3 = var327_328;
                    var13 = var329_330;
                }
                else if (var14.eql((SubLObject)module0719.TWO_INTEGER)) {
                    var4.resetMultipleValues();
                    final SubLObject var331_332 = f44102(var3, (SubLObject)ConsesLow.listS(module0719.$ic87$, var11, (SubLObject)module0719.$ic222$), module0719.$g5679$.getDynamicValue(var4), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var333_334 = var4.secondMultipleValue();
                    var4.resetMultipleValues();
                    var3 = var331_332;
                    var13 = var333_334;
                }
                else if (var14.eql((SubLObject)module0719.THREE_INTEGER)) {
                    var4.resetMultipleValues();
                    final SubLObject var335_336 = f44102(var3, (SubLObject)ConsesLow.listS(module0719.$ic87$, var11, (SubLObject)module0719.$ic248$), module0719.$g5679$.getDynamicValue(var4), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var337_338 = var4.secondMultipleValue();
                    var4.resetMultipleValues();
                    var3 = var335_336;
                    var13 = var337_338;
                }
            }
            if (module0719.NIL == module0256.f16531(var11, module0719.$g5679$.getDynamicValue(var4), (SubLObject)module0719.UNPROVIDED)) {
                final SubLObject var14 = var12;
                if (var14.eql((SubLObject)module0719.ONE_INTEGER)) {
                    var4.resetMultipleValues();
                    final SubLObject var339_340 = f44102(var3, (SubLObject)ConsesLow.listS(module0719.$ic98$, var11, (SubLObject)module0719.$ic247$), module0719.$g5679$.getDynamicValue(var4), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var341_342 = var4.secondMultipleValue();
                    var4.resetMultipleValues();
                    var3 = var339_340;
                    var13 = var341_342;
                }
                else if (var14.eql((SubLObject)module0719.TWO_INTEGER)) {
                    var4.resetMultipleValues();
                    final SubLObject var343_344 = f44102(var3, (SubLObject)ConsesLow.listS(module0719.$ic98$, var11, (SubLObject)module0719.$ic232$), module0719.$g5679$.getDynamicValue(var4), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var345_346 = var4.secondMultipleValue();
                    var4.resetMultipleValues();
                    var3 = var343_344;
                    var13 = var345_346;
                }
                else if (var14.eql((SubLObject)module0719.THREE_INTEGER)) {
                    var4.resetMultipleValues();
                    final SubLObject var347_348 = f44102(var3, (SubLObject)ConsesLow.listS(module0719.$ic98$, var11, (SubLObject)module0719.$ic222$), module0719.$g5679$.getDynamicValue(var4), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED);
                    final SubLObject var349_350 = var4.secondMultipleValue();
                    var4.resetMultipleValues();
                    var3 = var347_348;
                    var13 = var349_350;
                }
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        module0665.f40425((SubLObject)module0719.$ic107$, var3);
        return var3;
    }
    
    public static SubLObject f44132(final SubLObject var46, SubLObject var351) {
        if (var351 == module0719.UNPROVIDED) {
            var351 = (SubLObject)module0719.NIL;
        }
        final SubLThread var352 = SubLProcess.currentSubLThread();
        SubLObject var353 = (SubLObject)module0719.NIL;
        final SubLObject var354 = var351;
        final SubLObject var355 = module0147.$g2094$.currentBinding(var352);
        final SubLObject var356 = module0147.$g2095$.currentBinding(var352);
        try {
            module0147.$g2094$.bind(module0147.f9531(var354), var352);
            module0147.$g2095$.bind(module0147.f9534(var354), var352);
            if (module0719.NIL != module0259.f16854(var46, module0719.$ic249$, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED)) {
                var353 = (SubLObject)module0719.THREE_INTEGER;
            }
            else if (module0719.NIL != module0259.f16854(var46, module0719.$ic250$, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED)) {
                var353 = (SubLObject)module0719.TWO_INTEGER;
            }
            else if (module0719.NIL != module0259.f16854(var46, module0719.$ic123$, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED)) {
                var353 = (SubLObject)module0719.ONE_INTEGER;
            }
            else if (module0719.NIL != module0259.f16854(var46, module0719.$ic251$, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED)) {
                var353 = (SubLObject)module0719.ZERO_INTEGER;
            }
            else {
                var353 = (SubLObject)module0719.NIL;
            }
        }
        finally {
            module0147.$g2095$.rebind(var356, var352);
            module0147.$g2094$.rebind(var355, var352);
        }
        return var353;
    }
    
    public static SubLObject f44133(final SubLObject var3) {
        return (SubLObject)module0719.T;
    }
    
    public static SubLObject f44134(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        module0665.f40425((SubLObject)module0719.$ic254$, var3);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020((SubLObject)module0719.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        if (module0719.NIL != module0015.$g491$.getGlobalValue()) {
            module0642.f39020(module0015.$g357$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            module0642.f39020(module0015.$g491$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        }
        module0642.f39020(module0015.$g358$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39020((SubLObject)module0719.$ic82$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var4);
        try {
            module0015.$g533$.bind((SubLObject)module0719.T, var4);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var5_353 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var5_354 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var4);
                    module0642.f39020(module0015.$g209$.getGlobalValue());
                    module0642.f39019((SubLObject)module0719.$ic255$);
                    f44039(module0719.$g5679$.getDynamicValue(var4));
                    module0642.f39020(module0015.$g210$.getGlobalValue());
                    module0642.f39027((SubLObject)module0719.$ic90$, (SubLObject)module0719.UNPROVIDED);
                    module0665.f40445(var3, (SubLObject)module0719.$ic188$, (SubLObject)module0719.$ic256$, (SubLObject)module0719.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var5_354, var4);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var5_353, var4);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0719.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            if (module0719.NIL != module0015.$g492$.getGlobalValue()) {
                module0642.f39020(module0015.$g366$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020(module0015.$g492$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var5_355 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
                final SubLObject var5_356 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)module0719.T, var4);
                    module0642.f39032((SubLObject)module0719.FIVE_INTEGER);
                    module0642.f39019((SubLObject)module0719.$ic257$);
                    module0665.f40450(var3, (SubLObject)module0719.$ic254$, (SubLObject)module0719.NIL, (SubLObject)module0719.$ic258$, (SubLObject)module0719.$ic259$, module0719.$ic260$);
                }
                finally {
                    module0015.$g533$.rebind(var5_356, var4);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var5_355, var4);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0719.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var5, var4);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return var3;
    }
    
    public static SubLObject f44135(final SubLObject var3) {
        return (SubLObject)module0719.T;
    }
    
    public static SubLObject f44136(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0719.NIL != module0269.f17731(module0665.f40419((SubLObject)module0719.$ic254$, var3)) && !module0719.$g5679$.getDynamicValue(var4).eql(module0665.f40419((SubLObject)module0719.$ic254$, var3))) {
            module0719.$g5679$.setDynamicValue(module0665.f40419((SubLObject)module0719.$ic254$, var3), var4);
        }
        if (module0719.NIL == module0269.f17731(module0719.$g5679$.getDynamicValue(var4))) {
            module0719.$g5679$.setDynamicValue(module0719.$g5678$.getGlobalValue(), var4);
        }
        module0665.f40425((SubLObject)module0719.$ic254$, var3);
        return var3;
    }
    
    public static SubLObject f44122(final SubLObject var3) {
        SubLObject var4 = (SubLObject)module0719.NIL;
        SubLObject var5 = module0665.f40420((SubLObject)module0719.$ic111$, var3);
        SubLObject var6 = (SubLObject)module0719.NIL;
        var6 = var5.first();
        while (module0719.NIL != var5) {
            SubLObject var43_357 = module0665.f40420(Symbols.make_keyword(PrintLow.format((SubLObject)module0719.NIL, (SubLObject)module0719.$ic114$, var6)), var3);
            SubLObject var7 = (SubLObject)module0719.NIL;
            var7 = var43_357.first();
            while (module0719.NIL != var43_357) {
                var4 = (SubLObject)ConsesLow.cons(var7, var4);
                var43_357 = var43_357.rest();
                var7 = var43_357.first();
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        return var4;
    }
    
    public static SubLObject f44121(final SubLObject var3) {
        SubLObject var4 = (SubLObject)module0719.NIL;
        SubLObject var5 = module0665.f40420((SubLObject)module0719.$ic120$, var3);
        SubLObject var6 = (SubLObject)module0719.NIL;
        var6 = var5.first();
        while (module0719.NIL != var5) {
            var4 = (SubLObject)ConsesLow.cons(var6, var4);
            var5 = var5.rest();
            var6 = var5.first();
        }
        return var4;
    }
    
    public static SubLObject f44107(final SubLObject var3) {
        return ConsesLow.append(f44122(var3), f44121(var3));
    }
    
    public static SubLObject f44127(final SubLObject var3) {
        return module0665.f40420((SubLObject)module0719.$ic126$, var3);
    }
    
    public static SubLObject f44137(final SubLObject var358) {
        SubLObject var359 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0719.$ic261$), module0038.f2738(module0038.f2968(var358), (SubLObject)module0719.$ic262$, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED));
        var359 = (SubLObject)ConsesLow.cons(module0038.f2811(var359.first()), var359.rest());
        return module0038.f2761(var359, (SubLObject)module0719.UNPROVIDED);
    }
    
    public static SubLObject f44138(final SubLObject var360) {
        final SubLObject var361 = f44137(var360.first());
        final SubLObject var362 = conses_high.cadr(var360);
        final SubLObject var363 = conses_high.cddr(var360);
        SubLObject var364 = (SubLObject)module0719.NIL;
        if (var362.isString()) {
            var364 = PrintLow.format((SubLObject)module0719.NIL, (SubLObject)module0719.$ic263$, var361, PrintLow.format((SubLObject)module0719.NIL, var362, new SubLObject[] { var363.first(), conses_high.second(var363), conses_high.third(var363), conses_high.fourth(var363), conses_high.fifth(var363) }));
        }
        else {
            var364 = var361;
        }
        return var364;
    }
    
    public static SubLObject f44035(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0719.NIL != module0665.f40420((SubLObject)module0719.$ic190$, var3)) {
            module0642.f39020(module0015.$g209$.getGlobalValue());
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (module0719.NIL != module0015.$g495$.getGlobalValue()) {
                module0642.f39020(module0015.$g222$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var5 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                module0642.f39019((SubLObject)module0719.$ic264$);
                module0642.f39026((SubLObject)module0719.UNPROVIDED);
                SubLObject var6 = module0665.f40420((SubLObject)module0719.$ic190$, var3);
                SubLObject var7 = (SubLObject)module0719.NIL;
                var7 = var6.first();
                while (module0719.NIL != var6) {
                    final SubLObject var8 = f44138(var7);
                    if (module0719.NIL != var8) {
                        module0642.f39032((SubLObject)module0719.FIVE_INTEGER);
                        module0642.f39019(var8);
                        module0642.f39026((SubLObject)module0719.UNPROVIDED);
                    }
                    var6 = var6.rest();
                    var7 = var6.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var5, var4);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
            module0642.f39020(module0015.$g210$.getGlobalValue());
            module0642.f39026((SubLObject)module0719.UNPROVIDED);
        }
        return (SubLObject)module0719.NIL;
    }
    
    public static SubLObject f44036(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0719.NIL != module0665.f40420((SubLObject)module0719.$ic265$, var3)) {
            module0642.f39020(module0015.$g209$.getGlobalValue());
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (module0719.NIL != module0015.$g495$.getGlobalValue()) {
                module0642.f39020(module0015.$g222$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
                module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0719.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0719.UNPROVIDED);
            final SubLObject var5 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)module0719.T, var4);
                module0642.f39019((SubLObject)module0719.$ic266$);
                module0642.f39026((SubLObject)module0719.UNPROVIDED);
                SubLObject var6 = module0665.f40420((SubLObject)module0719.$ic265$, var3);
                SubLObject var7 = (SubLObject)module0719.NIL;
                var7 = var6.first();
                while (module0719.NIL != var6) {
                    final SubLObject var8 = f44138(var7);
                    if (module0719.NIL != var8) {
                        module0642.f39032((SubLObject)module0719.FIVE_INTEGER);
                        module0642.f39019(var8);
                        module0642.f39026((SubLObject)module0719.UNPROVIDED);
                    }
                    var6 = var6.rest();
                    var7 = var6.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var5, var4);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
            module0642.f39020(module0015.$g210$.getGlobalValue());
            module0642.f39026((SubLObject)module0719.UNPROVIDED);
        }
        return (SubLObject)module0719.NIL;
    }
    
    public static SubLObject f44102(final SubLObject var3, final SubLObject var367, final SubLObject var351, SubLObject var306, SubLObject var307) {
        if (var306 == module0719.UNPROVIDED) {
            var306 = (SubLObject)module0719.$ic94$;
        }
        if (var307 == module0719.UNPROVIDED) {
            var307 = (SubLObject)module0719.NIL;
        }
        final SubLThread var368 = SubLProcess.currentSubLThread();
        SubLObject var369 = (SubLObject)module0719.NIL;
        var368.resetMultipleValues();
        final SubLObject var370 = module0543.f33631(var367, var351, var306, var307);
        final SubLObject var371 = var368.secondMultipleValue();
        var368.resetMultipleValues();
        if (module0719.NIL == var370) {
            module0665.f40423((SubLObject)module0719.$ic190$, var371, var3);
            var369 = (SubLObject)module0719.T;
        }
        else {
            module0665.f40423((SubLObject)module0719.$ic265$, (SubLObject)ConsesLow.list((SubLObject)module0719.$ic267$, (SubLObject)module0719.$ic268$, var367, var351), var3);
        }
        return Values.values(var3, var369);
    }
    
    public static SubLObject f44116(final SubLObject var3, final SubLObject var367, final SubLObject var351) {
        final SubLThread var368 = SubLProcess.currentSubLThread();
        SubLObject var369 = (SubLObject)module0719.NIL;
        var368.resetMultipleValues();
        final SubLObject var370 = module0543.f33658(var367, var351);
        final SubLObject var371 = var368.secondMultipleValue();
        var368.resetMultipleValues();
        if (module0719.NIL == var370) {
            module0665.f40423((SubLObject)module0719.$ic190$, var371, var3);
            var369 = (SubLObject)module0719.T;
        }
        else {
            module0665.f40423((SubLObject)module0719.$ic265$, (SubLObject)ConsesLow.list((SubLObject)module0719.$ic269$, (SubLObject)module0719.$ic270$, var367, var351), var3);
        }
        return Values.values(var3, var369);
    }
    
    public static SubLObject f44139() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44033", "CB-FACET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44039", "S#48208", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44040", "S#48209", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44042", "S#48205", 1, 0, false);
        new $f44042$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44043", "S#48210", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44044", "S#48211", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44045", "S#48212", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44038", "S#48213", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44046", "S#48214", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44047", "S#48215", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44048", "S#48216", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44049", "S#48217", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44050", "S#48218", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44051", "S#48219", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44052", "S#48220", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44053", "S#48221", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44054", "S#48222", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44041", "S#48223", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0719", "f44055", "S#48224");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44056", "S#48225", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44057", "S#48226", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44058", "S#48227", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44059", "S#48228", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44060", "S#48229", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44061", "S#48230", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44062", "S#48231", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44063", "S#48232", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44064", "S#48233", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44066", "S#48207", 1, 0, false);
        new $f44066$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44067", "S#48234", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44068", "S#48235", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44069", "S#48236", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44070", "S#48237", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44071", "S#48238", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44072", "S#48239", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44073", "S#48240", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44074", "S#48241", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44075", "S#48242", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44076", "S#48243", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44077", "S#48244", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44078", "S#48245", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44079", "S#48246", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44080", "S#48247", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44081", "S#48248", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44082", "S#48249", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44083", "S#48250", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44084", "S#48251", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44085", "S#48252", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44065", "S#48253", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0719", "f44086", "S#48254");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44087", "S#48255", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44088", "S#48256", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44089", "S#48257", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44037", "S#48258", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44034", "S#48259", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44090", "S#48260", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44091", "S#48261", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44092", "S#48262", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44093", "S#48263", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44094", "S#48264", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44095", "S#48265", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44096", "S#48266", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44097", "S#48267", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44098", "S#48268", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44099", "S#48269", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44100", "S#48270", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44101", "S#48271", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44103", "S#48272", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44104", "S#48273", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44105", "S#48274", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44106", "S#48275", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44108", "S#48276", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44109", "S#48277", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44110", "S#48278", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44111", "S#48279", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44112", "S#48280", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44113", "S#48281", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44114", "S#48282", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44115", "S#48283", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44117", "S#48284", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44118", "S#48285", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44119", "S#48286", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44120", "S#48287", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44123", "S#48288", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44124", "S#48289", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44125", "S#48290", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44126", "S#48291", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44128", "S#48292", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44129", "S#48293", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44130", "S#48294", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44131", "S#48295", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44132", "S#48296", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44133", "S#48297", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44134", "S#48298", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44135", "S#48299", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44136", "S#48300", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44122", "S#48301", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44121", "S#48302", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44107", "S#48303", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44127", "S#48304", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44137", "S#48305", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44138", "S#48306", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44035", "S#48307", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44036", "S#48308", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44102", "S#48309", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0719", "f44116", "S#48310", 3, 0, false);
        return (SubLObject)module0719.NIL;
    }
    
    public static SubLObject f44140() {
        module0719.$g5678$ = SubLFiles.deflexical("S#48311", module0719.$ic0$);
        module0719.$g5679$ = SubLFiles.defparameter("S#48312", module0719.$g5678$.getGlobalValue());
        module0719.$g5680$ = SubLFiles.deflexical("S#48313", (SubLObject)module0719.$ic2$);
        module0719.$g5681$ = SubLFiles.deflexical("S#48314", (SubLObject)module0719.$ic3$);
        module0719.$g5683$ = SubLFiles.defconstant("S#48315", (SubLObject)module0719.$ic32$);
        module0719.$g5684$ = SubLFiles.defparameter("S#48316", (SubLObject)module0719.NIL);
        module0719.$g5682$ = SubLFiles.defparameter("S#48317", Hashtables.make_hash_table((SubLObject)module0719.$ic62$, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED));
        module0719.$g5685$ = SubLFiles.defparameter("S#48318", (SubLObject)module0719.$ic79$);
        module0719.$g5686$ = SubLFiles.defconstant("S#48319", (SubLObject)module0719.$ic128$);
        module0719.$g5687$ = SubLFiles.deflexical("S#48320", (SubLObject)module0719.NIL);
        return (SubLObject)module0719.NIL;
    }
    
    public static SubLObject f44141() {
        module0012.f441((SubLObject)module0719.$ic1$);
        Hashtables.sethash((SubLObject)module0719.$ic4$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0719.$ic5$, (SubLObject)module0719.$ic6$));
        Hashtables.sethash((SubLObject)module0719.$ic7$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0719.$ic8$, (SubLObject)module0719.$ic6$));
        final SubLObject var369 = module0659.$g5197$.getGlobalValue();
        final SubLObject var370 = module0659.f40098((SubLObject)module0719.$ic9$);
        module0659.f40083(var370, (SubLObject)module0719.$ic10$);
        module0659.$g5197$.setGlobalValue((SubLObject)ConsesLow.cons(var370, Sequences.delete((SubLObject)module0719.$ic10$, var369, Symbols.symbol_function((SubLObject)module0719.EQUAL), Symbols.symbol_function((SubLObject)module0719.$ic11$), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED)));
        module0015.f873((SubLObject)module0719.$ic31$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0719.$g5683$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0719.$ic39$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0719.$ic40$);
        Structures.def_csetf((SubLObject)module0719.$ic41$, (SubLObject)module0719.$ic42$);
        Structures.def_csetf((SubLObject)module0719.$ic43$, (SubLObject)module0719.$ic44$);
        Structures.def_csetf((SubLObject)module0719.$ic45$, (SubLObject)module0719.$ic46$);
        Structures.def_csetf((SubLObject)module0719.$ic47$, (SubLObject)module0719.$ic48$);
        Structures.def_csetf((SubLObject)module0719.$ic49$, (SubLObject)module0719.$ic50$);
        Equality.identity((SubLObject)module0719.$ic32$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0719.$g5683$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0719.$ic61$));
        SubLObject var371 = f44052((SubLObject)module0719.$ic80$);
        f44047(var371, (SubLObject)module0719.$ic81$);
        Hashtables.sethash(f44044(var371), module0719.$g5682$.getDynamicValue(), var371);
        module0719.$g5684$.setDynamicValue((SubLObject)ConsesLow.cons(var371, Sequences.delete((SubLObject)module0719.$ic81$, module0719.$g5684$.getDynamicValue(), Symbols.symbol_function((SubLObject)module0719.EQUAL), Symbols.symbol_function((SubLObject)module0719.$ic41$), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED)));
        var371 = f44052((SubLObject)module0719.$ic96$);
        f44047(var371, (SubLObject)module0719.$ic97$);
        Hashtables.sethash(f44044(var371), module0719.$g5682$.getDynamicValue(), var371);
        module0719.$g5684$.setDynamicValue((SubLObject)ConsesLow.cons(var371, Sequences.delete((SubLObject)module0719.$ic97$, module0719.$g5684$.getDynamicValue(), Symbols.symbol_function((SubLObject)module0719.EQUAL), Symbols.symbol_function((SubLObject)module0719.$ic41$), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED)));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0719.$g5686$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0719.$ic135$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0719.$ic136$);
        Structures.def_csetf((SubLObject)module0719.$ic137$, (SubLObject)module0719.$ic138$);
        Structures.def_csetf((SubLObject)module0719.$ic139$, (SubLObject)module0719.$ic140$);
        Structures.def_csetf((SubLObject)module0719.$ic141$, (SubLObject)module0719.$ic142$);
        Structures.def_csetf((SubLObject)module0719.$ic143$, (SubLObject)module0719.$ic144$);
        Structures.def_csetf((SubLObject)module0719.$ic145$, (SubLObject)module0719.$ic146$);
        Structures.def_csetf((SubLObject)module0719.$ic147$, (SubLObject)module0719.$ic148$);
        Structures.def_csetf((SubLObject)module0719.$ic149$, (SubLObject)module0719.$ic150$);
        Structures.def_csetf((SubLObject)module0719.$ic151$, (SubLObject)module0719.$ic152$);
        Equality.identity((SubLObject)module0719.$ic128$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0719.$g5686$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0719.$ic157$));
        SubLObject var372 = f44083((SubLObject)module0719.$ic162$);
        f44075(var372, (SubLObject)module0719.$ic163$);
        module0719.$g5687$.setGlobalValue((SubLObject)ConsesLow.cons(var372, Sequences.delete((SubLObject)module0719.$ic163$, module0719.$g5687$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0719.EQUAL), Symbols.symbol_function((SubLObject)module0719.$ic137$), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED)));
        var372 = f44083((SubLObject)module0719.$ic168$);
        f44075(var372, (SubLObject)module0719.$ic169$);
        module0719.$g5687$.setGlobalValue((SubLObject)ConsesLow.cons(var372, Sequences.delete((SubLObject)module0719.$ic169$, module0719.$g5687$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0719.EQUAL), Symbols.symbol_function((SubLObject)module0719.$ic137$), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED)));
        var372 = f44083((SubLObject)module0719.$ic184$);
        f44075(var372, (SubLObject)module0719.$ic185$);
        module0719.$g5687$.setGlobalValue((SubLObject)ConsesLow.cons(var372, Sequences.delete((SubLObject)module0719.$ic185$, module0719.$g5687$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0719.EQUAL), Symbols.symbol_function((SubLObject)module0719.$ic137$), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED)));
        var372 = f44083((SubLObject)module0719.$ic192$);
        f44075(var372, (SubLObject)module0719.$ic193$);
        module0719.$g5687$.setGlobalValue((SubLObject)ConsesLow.cons(var372, Sequences.delete((SubLObject)module0719.$ic193$, module0719.$g5687$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0719.EQUAL), Symbols.symbol_function((SubLObject)module0719.$ic137$), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED)));
        var372 = f44083((SubLObject)module0719.$ic200$);
        f44075(var372, (SubLObject)module0719.$ic201$);
        module0719.$g5687$.setGlobalValue((SubLObject)ConsesLow.cons(var372, Sequences.delete((SubLObject)module0719.$ic201$, module0719.$g5687$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0719.EQUAL), Symbols.symbol_function((SubLObject)module0719.$ic137$), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED)));
        var372 = f44083((SubLObject)module0719.$ic225$);
        f44075(var372, (SubLObject)module0719.$ic226$);
        module0719.$g5687$.setGlobalValue((SubLObject)ConsesLow.cons(var372, Sequences.delete((SubLObject)module0719.$ic226$, module0719.$g5687$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0719.EQUAL), Symbols.symbol_function((SubLObject)module0719.$ic137$), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED)));
        var372 = f44083((SubLObject)module0719.$ic233$);
        f44075(var372, (SubLObject)module0719.$ic234$);
        module0719.$g5687$.setGlobalValue((SubLObject)ConsesLow.cons(var372, Sequences.delete((SubLObject)module0719.$ic234$, module0719.$g5687$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0719.EQUAL), Symbols.symbol_function((SubLObject)module0719.$ic137$), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED)));
        var372 = f44083((SubLObject)module0719.$ic239$);
        f44075(var372, (SubLObject)module0719.$ic240$);
        module0719.$g5687$.setGlobalValue((SubLObject)ConsesLow.cons(var372, Sequences.delete((SubLObject)module0719.$ic240$, module0719.$g5687$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0719.EQUAL), Symbols.symbol_function((SubLObject)module0719.$ic137$), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED)));
        var372 = f44083((SubLObject)module0719.$ic245$);
        f44075(var372, (SubLObject)module0719.$ic246$);
        module0719.$g5687$.setGlobalValue((SubLObject)ConsesLow.cons(var372, Sequences.delete((SubLObject)module0719.$ic246$, module0719.$g5687$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0719.EQUAL), Symbols.symbol_function((SubLObject)module0719.$ic137$), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED)));
        var372 = f44083((SubLObject)module0719.$ic252$);
        f44075(var372, (SubLObject)module0719.$ic253$);
        module0719.$g5687$.setGlobalValue((SubLObject)ConsesLow.cons(var372, Sequences.delete((SubLObject)module0719.$ic253$, module0719.$g5687$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0719.EQUAL), Symbols.symbol_function((SubLObject)module0719.$ic137$), (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED, (SubLObject)module0719.UNPROVIDED)));
        return (SubLObject)module0719.NIL;
    }
    
    public void declareFunctions() {
        f44139();
    }
    
    public void initializeVariables() {
        f44140();
    }
    
    public void runTopLevelForms() {
        f44141();
    }
    
    static {
        me = (SubLFile)new module0719();
        module0719.$g5678$ = null;
        module0719.$g5679$ = null;
        module0719.$g5680$ = null;
        module0719.$g5681$ = null;
        module0719.$g5683$ = null;
        module0719.$g5684$ = null;
        module0719.$g5682$ = null;
        module0719.$g5685$ = null;
        module0719.$g5686$ = null;
        module0719.$g5687$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $ic1$ = SubLObjectFactory.makeSymbol("S#48312", "CYC");
        $ic2$ = SubLObjectFactory.makeString("Facets Browser");
        $ic3$ = SubLObjectFactory.makeString("cb-facet");
        $ic4$ = SubLObjectFactory.makeKeyword("FACET-BROWSER");
        $ic5$ = SubLObjectFactory.makeString("facet-browser.gif");
        $ic6$ = SubLObjectFactory.makeString("[Facets]");
        $ic7$ = SubLObjectFactory.makeKeyword("FACET-BROWSER-DISABLED");
        $ic8$ = SubLObjectFactory.makeString("facet-browser-disabled.gif");
        $ic9$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("INDEX-FORT"), SubLObjectFactory.makeKeyword("ACTIVE-P"), module0719.T, SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeKeyword("FACET-BROWSER"), SubLObjectFactory.makeKeyword("IMAGE-DISABLED"), SubLObjectFactory.makeKeyword("FACET-BROWSER-DISABLED"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeString("[Facets]"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("FORT-P"), SubLObjectFactory.makeKeyword("HANDLER"), SubLObjectFactory.makeString("cb-facet"), SubLObjectFactory.makeKeyword("TOOL"), module0719.NIL, SubLObjectFactory.makeKeyword("TITLE"), SubLObjectFactory.makeString("Facets Browser"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Link to the faceting information for FORT") });
        $ic10$ = SubLObjectFactory.makeSymbol("S#44159", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#44084", "CYC");
        $ic12$ = SubLObjectFactory.makeKeyword("FORT");
        $ic13$ = SubLObjectFactory.makeKeyword("JUST-FORT");
        $ic14$ = SubLObjectFactory.makeString("No term provided!");
        $ic15$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic16$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic17$ = SubLObjectFactory.makeString("stylesheet");
        $ic18$ = SubLObjectFactory.makeString("text/css");
        $ic19$ = SubLObjectFactory.makeKeyword("SHA1");
        $ic20$ = SubLObjectFactory.makeString("text/javascript");
        $ic21$ = SubLObjectFactory.makeString("yui-skin-sam");
        $ic22$ = SubLObjectFactory.makeString("reloadFrameButton");
        $ic23$ = SubLObjectFactory.makeString("button");
        $ic24$ = SubLObjectFactory.makeString("reload");
        $ic25$ = SubLObjectFactory.makeString("Refresh Frames");
        $ic26$ = SubLObjectFactory.makeString("WARNING: You are transmitting operations  Be very careful.");
        $ic27$ = SubLObjectFactory.makeKeyword("POST");
        $ic28$ = SubLObjectFactory.makeKeyword("PERSPECTIVE");
        $ic29$ = SubLObjectFactory.makeKeyword("GLOBAL-TOP");
        $ic30$ = SubLObjectFactory.makeKeyword("GLOBAL-BOTTOM");
        $ic31$ = SubLObjectFactory.makeSymbol("CB-FACET");
        $ic32$ = SubLObjectFactory.makeSymbol("S#48204", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#48205", "CYC");
        $ic34$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("S#48321", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38898", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48322", "CYC"));
        $ic35$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY?-FN"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY-FN"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY-STRING"));
        $ic36$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48210", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48211", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48212", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48213", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48214", "CYC"));
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48215", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48216", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48217", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48218", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48219", "CYC"));
        $ic38$ = SubLObjectFactory.makeSymbol("S#48223", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#48209", "CYC");
        $ic40$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#48205", "CYC"));
        $ic41$ = SubLObjectFactory.makeSymbol("S#48210", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("S#48215", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("S#48211", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#48216", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("S#48212", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#48217", "CYC");
        $ic47$ = SubLObjectFactory.makeSymbol("S#48213", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("S#48218", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#48214", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#48219", "CYC");
        $ic51$ = SubLObjectFactory.makeKeyword("NAME");
        $ic52$ = SubLObjectFactory.makeKeyword("KEYWORD");
        $ic53$ = SubLObjectFactory.makeKeyword("DISPLAY?-FN");
        $ic54$ = SubLObjectFactory.makeKeyword("DISPLAY-FN");
        $ic55$ = SubLObjectFactory.makeKeyword("DISPLAY-STRING");
        $ic56$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic57$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic58$ = SubLObjectFactory.makeSymbol("S#48220", "CYC");
        $ic59$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic60$ = SubLObjectFactory.makeKeyword("END");
        $ic61$ = SubLObjectFactory.makeSymbol("S#48222", "CYC");
        $ic62$ = SubLObjectFactory.makeInteger(32);
        $ic63$ = SubLObjectFactory.makeString("#");
        $ic64$ = SubLObjectFactory.makeString("#<");
        $ic65$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic66$ = SubLObjectFactory.makeKeyword("BASE");
        $ic67$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#30", "CYC"));
        $ic68$ = SubLObjectFactory.makeUninternedSymbol("US#1C8BB8A");
        $ic69$ = SubLObjectFactory.makeSymbol("CLET");
        $ic70$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic71$ = SubLObjectFactory.makeSymbol("CSETF");
        $ic72$ = SubLObjectFactory.makeSymbol("SETHASH");
        $ic73$ = SubLObjectFactory.makeSymbol("S#48317", "CYC");
        $ic74$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic75$ = SubLObjectFactory.makeSymbol("S#48316", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("CONS");
        $ic77$ = SubLObjectFactory.makeSymbol("DELETE");
        $ic78$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48316", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0719.EQUAL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("S#48210", "CYC")));
        $ic79$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DISPLAY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AS-INDIVIDUAL"), (SubLObject)SubLObjectFactory.makeKeyword("AS-COLLECTION")), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AS-COLLECTION"), (SubLObject)SubLObjectFactory.makeKeyword("AS-INDIVIDUAL")));
        $ic80$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("AS-INDIVIDUAL"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY?-FN"), (SubLObject)SubLObjectFactory.makeSymbol("S#48228", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("S#48229", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY-STRING"), (SubLObject)SubLObjectFactory.makeString("Individual"));
        $ic81$ = SubLObjectFactory.makeSymbol("S#48323", "CYC");
        $ic82$ = SubLObjectFactory.makeString("100%");
        $ic83$ = SubLObjectFactory.makeKeyword("A-FACET");
        $ic84$ = SubLObjectFactory.makeSymbol("S#18496", "CYC");
        $ic85$ = SubLObjectFactory.makeSymbol("S#40357", "CYC");
        $ic86$ = SubLObjectFactory.makeString("6%");
        $ic87$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic88$ = SubLObjectFactory.makeKeyword("RIGHT");
        $ic89$ = SubLObjectFactory.makeKeyword("ASSERTION");
        $ic90$ = SubLObjectFactory.makeKeyword("NBSP");
        $ic91$ = SubLObjectFactory.makeString("i ");
        $ic92$ = SubLObjectFactory.makeKeyword("ADD-SUP");
        $ic93$ = SubLObjectFactory.makeKeyword("ADD-SUP-FROM");
        $ic94$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic95$ = SubLObjectFactory.makeString("x ");
        $ic96$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("AS-COLLECTION"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY?-FN"), (SubLObject)SubLObjectFactory.makeSymbol("S#48231", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("S#48232", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY-STRING"), (SubLObject)SubLObjectFactory.makeString("Collection"));
        $ic97$ = SubLObjectFactory.makeSymbol("S#48324", "CYC");
        $ic98$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic99$ = SubLObjectFactory.makeKeyword("ASSERTED-TRUE");
        $ic100$ = SubLObjectFactory.makeKeyword("COEXTENSIONAL");
        $ic101$ = SubLObjectFactory.makeString("* genls: ");
        $ic102$ = SubLObjectFactory.makeString("in Mt");
        $ic103$ = SubLObjectFactory.makeString("Unassert");
        $ic104$ = SubLObjectFactory.makeKeyword("UNASSERT-GO");
        $ic105$ = SubLObjectFactory.makeString(" (coextensional)");
        $ic106$ = SubLObjectFactory.makeKeyword("CENTER");
        $ic107$ = SubLObjectFactory.makeKeyword("UNASSERT-ID");
        $ic108$ = SubLObjectFactory.makeSymbol("S#12278", "CYC");
        $ic109$ = SubLObjectFactory.makeKeyword("FACETS?");
        $ic110$ = SubLObjectFactory.makeString("* faceted specs: ");
        $ic111$ = SubLObjectFactory.makeKeyword("FACET-ID");
        $ic112$ = SubLObjectFactory.makeKeyword("FACET-ID-SELECTED");
        $ic113$ = SubLObjectFactory.makeString("~A-SPEC");
        $ic114$ = SubLObjectFactory.makeString("~A-SPEC-SELECTED");
        $ic115$ = SubLObjectFactory.makeKeyword("SPECS-FACETED?");
        $ic116$ = SubLObjectFactory.makeInteger(200);
        $ic117$ = SubLObjectFactory.makeInteger(100);
        $ic118$ = SubLObjectFactory.makeKeyword("SPECS-UNFACETED?");
        $ic119$ = SubLObjectFactory.makeString("* unfaceted specs: ");
        $ic120$ = SubLObjectFactory.makeKeyword("SPEC-UNFACETED");
        $ic121$ = SubLObjectFactory.makeString("|__ ");
        $ic122$ = SubLObjectFactory.makeString(" unfaceted specs not shown.");
        $ic123$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Collection"));
        $ic124$ = SubLObjectFactory.makeKeyword("INSTANCES?");
        $ic125$ = SubLObjectFactory.makeString("* instances: ");
        $ic126$ = SubLObjectFactory.makeKeyword("INSTANCE");
        $ic127$ = SubLObjectFactory.makeString(" instances not shown.");
        $ic128$ = SubLObjectFactory.makeSymbol("S#48206", "CYC");
        $ic129$ = SubLObjectFactory.makeSymbol("S#48207", "CYC");
        $ic130$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("S#48325", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48204", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48321", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38898", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48326", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38899", "CYC"));
        $ic131$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("ORDER-NUM"), (SubLObject)SubLObjectFactory.makeKeyword("PERSPECTIVE"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY?-FN"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY-FN"), (SubLObject)SubLObjectFactory.makeKeyword("HANDLER?-FN"), (SubLObject)SubLObjectFactory.makeKeyword("HANDLER-FN"));
        $ic132$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48234", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48235", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48236", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48237", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48238", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48239", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48240", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48241", "CYC"));
        $ic133$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48242", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48243", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48244", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48245", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48246", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48247", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48248", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48249", "CYC"));
        $ic134$ = SubLObjectFactory.makeSymbol("S#48253", "CYC");
        $ic135$ = SubLObjectFactory.makeSymbol("S#48233", "CYC");
        $ic136$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#48207", "CYC"));
        $ic137$ = SubLObjectFactory.makeSymbol("S#48234", "CYC");
        $ic138$ = SubLObjectFactory.makeSymbol("S#48242", "CYC");
        $ic139$ = SubLObjectFactory.makeSymbol("S#48235", "CYC");
        $ic140$ = SubLObjectFactory.makeSymbol("S#48243", "CYC");
        $ic141$ = SubLObjectFactory.makeSymbol("S#48236", "CYC");
        $ic142$ = SubLObjectFactory.makeSymbol("S#48244", "CYC");
        $ic143$ = SubLObjectFactory.makeSymbol("S#48237", "CYC");
        $ic144$ = SubLObjectFactory.makeSymbol("S#48245", "CYC");
        $ic145$ = SubLObjectFactory.makeSymbol("S#48238", "CYC");
        $ic146$ = SubLObjectFactory.makeSymbol("S#48246", "CYC");
        $ic147$ = SubLObjectFactory.makeSymbol("S#48239", "CYC");
        $ic148$ = SubLObjectFactory.makeSymbol("S#48247", "CYC");
        $ic149$ = SubLObjectFactory.makeSymbol("S#48240", "CYC");
        $ic150$ = SubLObjectFactory.makeSymbol("S#48248", "CYC");
        $ic151$ = SubLObjectFactory.makeSymbol("S#48241", "CYC");
        $ic152$ = SubLObjectFactory.makeSymbol("S#48249", "CYC");
        $ic153$ = SubLObjectFactory.makeKeyword("ORDER-NUM");
        $ic154$ = SubLObjectFactory.makeKeyword("HANDLER?-FN");
        $ic155$ = SubLObjectFactory.makeKeyword("HANDLER-FN");
        $ic156$ = SubLObjectFactory.makeSymbol("S#48250", "CYC");
        $ic157$ = SubLObjectFactory.makeSymbol("S#48252", "CYC");
        $ic158$ = SubLObjectFactory.makeUninternedSymbol("US#6D1128D");
        $ic159$ = SubLObjectFactory.makeSymbol("S#48320", "CYC");
        $ic160$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48320", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0719.EQUAL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("S#48234", "CYC")));
        $ic161$ = SubLObjectFactory.makeSymbol("<");
        $ic162$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("CHANGE-PERSPECTIVE"), SubLObjectFactory.makeKeyword("ORDER-NUM"), module0719.TEN_INTEGER, SubLObjectFactory.makeKeyword("PERSPECTIVE"), SubLObjectFactory.makeKeyword("GLOBAL-TOP"), SubLObjectFactory.makeKeyword("DISPLAY?-FN"), SubLObjectFactory.makeSymbol("S#48260", "CYC"), SubLObjectFactory.makeKeyword("DISPLAY-FN"), SubLObjectFactory.makeSymbol("S#48261", "CYC"), SubLObjectFactory.makeKeyword("HANDLER?-FN"), SubLObjectFactory.makeSymbol("S#48262", "CYC"), SubLObjectFactory.makeKeyword("HANDLER-FN"), SubLObjectFactory.makeSymbol("S#48263", "CYC") });
        $ic163$ = SubLObjectFactory.makeSymbol("S#48327", "CYC");
        $ic164$ = SubLObjectFactory.makeString("[~A]");
        $ic165$ = SubLObjectFactory.makeString("~A?~A");
        $ic166$ = SubLObjectFactory.makeKeyword("NEW-PERSPECTIVE");
        $ic167$ = SubLObjectFactory.makeKeyword("DISPLAY");
        $ic168$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("SHOW-DEFINITION"), SubLObjectFactory.makeKeyword("ORDER-NUM"), module0719.TWENTY_INTEGER, SubLObjectFactory.makeKeyword("PERSPECTIVE"), SubLObjectFactory.makeKeyword("GLOBAL-TOP"), SubLObjectFactory.makeKeyword("DISPLAY?-FN"), SubLObjectFactory.makeSymbol("S#48264", "CYC"), SubLObjectFactory.makeKeyword("DISPLAY-FN"), SubLObjectFactory.makeSymbol("S#48265", "CYC"), SubLObjectFactory.makeKeyword("HANDLER?-FN"), SubLObjectFactory.makeSymbol("S#48266", "CYC"), SubLObjectFactory.makeKeyword("HANDLER-FN"), SubLObjectFactory.makeSymbol("S#48267", "CYC") });
        $ic169$ = SubLObjectFactory.makeSymbol("S#48328", "CYC");
        $ic170$ = SubLObjectFactory.makeKeyword("MIDDLE");
        $ic171$ = SubLObjectFactory.makeString("(Show ");
        $ic172$ = SubLObjectFactory.makeString(" in Index Browser)");
        $ic173$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic174$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic175$ = SubLObjectFactory.makeSymbol("ASSERTION-MT");
        $ic176$ = SubLObjectFactory.makeSymbol("HLMT-EQUAL");
        $ic177$ = SubLObjectFactory.makeString("Defined in ");
        $ic178$ = SubLObjectFactory.makeString(" ");
        $ic179$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("comment"));
        $ic180$ = SubLObjectFactory.makeString("No comment.");
        $ic181$ = SubLObjectFactory.makeString("* isa: ");
        $ic182$ = SubLObjectFactory.makeString("Undefined in current Mt.");
        $ic183$ = SubLObjectFactory.makeKeyword("DESCENDING");
        $ic184$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("ADD-FORT-TO-CHOSEN-COLS"), SubLObjectFactory.makeKeyword("ORDER-NUM"), SubLObjectFactory.makeInteger(30), SubLObjectFactory.makeKeyword("PERSPECTIVE"), SubLObjectFactory.makeKeyword("AS-INDIVIDUAL"), SubLObjectFactory.makeKeyword("DISPLAY?-FN"), SubLObjectFactory.makeSymbol("S#48268", "CYC"), SubLObjectFactory.makeKeyword("DISPLAY-FN"), SubLObjectFactory.makeSymbol("S#48269", "CYC"), SubLObjectFactory.makeKeyword("HANDLER?-FN"), SubLObjectFactory.makeSymbol("S#48270", "CYC"), SubLObjectFactory.makeKeyword("HANDLER-FN"), SubLObjectFactory.makeSymbol("S#48271", "CYC") });
        $ic185$ = SubLObjectFactory.makeSymbol("S#48329", "CYC");
        $ic186$ = SubLObjectFactory.makeString("* Make ");
        $ic187$ = SubLObjectFactory.makeString(" a direct instance of selected collections. ");
        $ic188$ = SubLObjectFactory.makeString("Go");
        $ic189$ = SubLObjectFactory.makeKeyword("ADD-FORT-TO-CHOSEN-COLS-GO");
        $ic190$ = SubLObjectFactory.makeKeyword("ERRORS");
        $ic191$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-COLLECTIONS-CHOSEN"));
        $ic192$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("ADD-SPECS-TO-FACET"), SubLObjectFactory.makeKeyword("ORDER-NUM"), SubLObjectFactory.makeInteger(40), SubLObjectFactory.makeKeyword("PERSPECTIVE"), SubLObjectFactory.makeKeyword("AS-COLLECTION"), SubLObjectFactory.makeKeyword("DISPLAY?-FN"), SubLObjectFactory.makeSymbol("S#48272", "CYC"), SubLObjectFactory.makeKeyword("DISPLAY-FN"), SubLObjectFactory.makeSymbol("S#48273", "CYC"), SubLObjectFactory.makeKeyword("HANDLER?-FN"), SubLObjectFactory.makeSymbol("S#48274", "CYC"), SubLObjectFactory.makeKeyword("HANDLER-FN"), SubLObjectFactory.makeSymbol("S#48275", "CYC") });
        $ic193$ = SubLObjectFactory.makeSymbol("S#48330", "CYC");
        $ic194$ = SubLObjectFactory.makeString("* Add selected spec(s) to selected facet ");
        $ic195$ = SubLObjectFactory.makeKeyword("ADD-SPECS-TO-FACET-GO");
        $ic196$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-SPEC-CHOSEN"));
        $ic197$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-FACET-CHOSEN"));
        $ic198$ = SubLObjectFactory.makeKeyword("UNSUPPORTED-FACET-CHOSEN");
        $ic199$ = SubLObjectFactory.makeString("~A assertions must currently be hand edited.");
        $ic200$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("ADD-SPECS-TO-NEW-FACET"), SubLObjectFactory.makeKeyword("ORDER-NUM"), SubLObjectFactory.makeInteger(50), SubLObjectFactory.makeKeyword("PERSPECTIVE"), SubLObjectFactory.makeKeyword("AS-COLLECTION"), SubLObjectFactory.makeKeyword("DISPLAY?-FN"), SubLObjectFactory.makeSymbol("S#48276", "CYC"), SubLObjectFactory.makeKeyword("DISPLAY-FN"), SubLObjectFactory.makeSymbol("S#48277", "CYC"), SubLObjectFactory.makeKeyword("HANDLER?-FN"), SubLObjectFactory.makeSymbol("S#48278", "CYC"), SubLObjectFactory.makeKeyword("HANDLER-FN"), SubLObjectFactory.makeSymbol("S#48279", "CYC") });
        $ic201$ = SubLObjectFactory.makeSymbol("S#48331", "CYC");
        $ic202$ = SubLObjectFactory.makeString("* Make a new facet with selected spec(s) as instances ");
        $ic203$ = SubLObjectFactory.makeKeyword("ADD-SPECS-TO-NEW-FACET-GO");
        $ic204$ = SubLObjectFactory.makeString("New facet name: ");
        $ic205$ = SubLObjectFactory.makeString("TypeBy");
        $ic206$ = SubLObjectFactory.makeKeyword("NEW-FACET-NAME");
        $ic207$ = SubLObjectFactory.makeString("");
        $ic208$ = SubLObjectFactory.makeString("New facet type: ");
        $ic209$ = SubLObjectFactory.makeKeyword("NEW-FACET-TYPE");
        $ic210$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("facets-Generic"));
        $ic211$ = SubLObjectFactory.makeString(" generic ");
        $ic212$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("facets-Strict"));
        $ic213$ = SubLObjectFactory.makeString(" strict ");
        $ic214$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("facets-Covering"));
        $ic215$ = SubLObjectFactory.makeString(" covering ");
        $ic216$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("facets-Partition"));
        $ic217$ = SubLObjectFactory.makeString(" partition ");
        $ic218$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-FACET-TYPE-CHOSEN"));
        $ic219$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-FACET-NAME-CHOSEN"));
        $ic220$ = SubLObjectFactory.makeString("~ATypeBy~A");
        $ic221$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DisjointCollectionType")));
        $ic222$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CollectionType")));
        $ic223$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ConventionalClassificationType")));
        $ic224$ = SubLObjectFactory.makeString("A collection of collections. Each instance is a spec of ~A whose instances are all of the same ~A.");
        $ic225$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC"), SubLObjectFactory.makeKeyword("ORDER-NUM"), SubLObjectFactory.makeInteger(60), SubLObjectFactory.makeKeyword("PERSPECTIVE"), SubLObjectFactory.makeKeyword("AS-COLLECTION"), SubLObjectFactory.makeKeyword("DISPLAY?-FN"), SubLObjectFactory.makeSymbol("S#48280", "CYC"), SubLObjectFactory.makeKeyword("DISPLAY-FN"), SubLObjectFactory.makeSymbol("S#48281", "CYC"), SubLObjectFactory.makeKeyword("HANDLER?-FN"), SubLObjectFactory.makeSymbol("S#48282", "CYC"), SubLObjectFactory.makeKeyword("HANDLER-FN"), SubLObjectFactory.makeSymbol("S#48283", "CYC") });
        $ic226$ = SubLObjectFactory.makeSymbol("S#48332", "CYC");
        $ic227$ = SubLObjectFactory.makeString("* Make selected spec(s) direct specs of specified collection or new spec");
        $ic228$ = SubLObjectFactory.makeKeyword("MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC-GO");
        $ic229$ = SubLObjectFactory.makeString("Collection or new spec name: ");
        $ic230$ = SubLObjectFactory.makeKeyword("NEW-SPEC-NAME");
        $ic231$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INVALID-SPEC-NAME"));
        $ic232$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Collection")));
        $ic233$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS"), SubLObjectFactory.makeKeyword("ORDER-NUM"), SubLObjectFactory.makeInteger(60), SubLObjectFactory.makeKeyword("PERSPECTIVE"), SubLObjectFactory.makeKeyword("AS-COLLECTION"), SubLObjectFactory.makeKeyword("DISPLAY?-FN"), SubLObjectFactory.makeSymbol("S#48284", "CYC"), SubLObjectFactory.makeKeyword("DISPLAY-FN"), SubLObjectFactory.makeSymbol("S#48285", "CYC"), SubLObjectFactory.makeKeyword("HANDLER?-FN"), SubLObjectFactory.makeSymbol("S#48286", "CYC"), SubLObjectFactory.makeKeyword("HANDLER-FN"), SubLObjectFactory.makeSymbol("S#48287", "CYC") });
        $ic234$ = SubLObjectFactory.makeSymbol("S#48333", "CYC");
        $ic235$ = SubLObjectFactory.makeString("* Make selected unfaceted spec(s) direct specs of selected faceted spec(s)");
        $ic236$ = SubLObjectFactory.makeKeyword("MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS-GO");
        $ic237$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-UNFACETED-SPECS-CHOSEN"));
        $ic238$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-FACETED-SPECS-CHOSEN"));
        $ic239$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("ADD-INSTANCES-TO-SPECS"), SubLObjectFactory.makeKeyword("ORDER-NUM"), SubLObjectFactory.makeInteger(70), SubLObjectFactory.makeKeyword("PERSPECTIVE"), SubLObjectFactory.makeKeyword("AS-COLLECTION"), SubLObjectFactory.makeKeyword("DISPLAY?-FN"), SubLObjectFactory.makeSymbol("S#48288", "CYC"), SubLObjectFactory.makeKeyword("DISPLAY-FN"), SubLObjectFactory.makeSymbol("S#48289", "CYC"), SubLObjectFactory.makeKeyword("HANDLER?-FN"), SubLObjectFactory.makeSymbol("S#48290", "CYC"), SubLObjectFactory.makeKeyword("HANDLER-FN"), SubLObjectFactory.makeSymbol("S#48291", "CYC") });
        $ic240$ = SubLObjectFactory.makeSymbol("S#48334", "CYC");
        $ic241$ = SubLObjectFactory.makeString("* Add selected instance(s) to selected spec(s)");
        $ic242$ = SubLObjectFactory.makeKeyword("ADD-INSTANCES-TO-SPECS-GO");
        $ic243$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-SPECS-CHOSEN"));
        $ic244$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-INSTANCES-CHOSEN"));
        $ic245$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("UNASSERT"), SubLObjectFactory.makeKeyword("ORDER-NUM"), module0719.ZERO_INTEGER, SubLObjectFactory.makeKeyword("PERSPECTIVE"), module0719.NIL, SubLObjectFactory.makeKeyword("DISPLAY?-FN"), SubLObjectFactory.makeSymbol("S#48292", "CYC"), SubLObjectFactory.makeKeyword("DISPLAY-FN"), SubLObjectFactory.makeSymbol("S#48293", "CYC"), SubLObjectFactory.makeKeyword("HANDLER?-FN"), SubLObjectFactory.makeSymbol("S#48294", "CYC"), SubLObjectFactory.makeKeyword("HANDLER-FN"), SubLObjectFactory.makeSymbol("S#48295", "CYC") });
        $ic246$ = SubLObjectFactory.makeSymbol("S#46507", "CYC");
        $ic247$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Thing")));
        $ic248$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CollectionTypeType")));
        $ic249$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CollectionTypeType"));
        $ic250$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CollectionType"));
        $ic251$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Individual"));
        $ic252$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("CHANGE-MT"), SubLObjectFactory.makeKeyword("ORDER-NUM"), SubLObjectFactory.makeInteger(100), SubLObjectFactory.makeKeyword("PERSPECTIVE"), SubLObjectFactory.makeKeyword("GLOBAL-BOTTOM"), SubLObjectFactory.makeKeyword("DISPLAY?-FN"), SubLObjectFactory.makeSymbol("S#48297", "CYC"), SubLObjectFactory.makeKeyword("DISPLAY-FN"), SubLObjectFactory.makeSymbol("S#48298", "CYC"), SubLObjectFactory.makeKeyword("HANDLER?-FN"), SubLObjectFactory.makeSymbol("S#48299", "CYC"), SubLObjectFactory.makeKeyword("HANDLER-FN"), SubLObjectFactory.makeSymbol("S#48300", "CYC") });
        $ic253$ = SubLObjectFactory.makeSymbol("S#48335", "CYC");
        $ic254$ = SubLObjectFactory.makeKeyword("MT");
        $ic255$ = SubLObjectFactory.makeString("* Change current Mt from ");
        $ic256$ = SubLObjectFactory.makeKeyword("CHANGE-MT-GO");
        $ic257$ = SubLObjectFactory.makeString(" New Mt name: ");
        $ic258$ = SubLObjectFactory.makeInteger(30);
        $ic259$ = SubLObjectFactory.makeString("Complete");
        $ic260$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $ic261$ = SubLObjectFactory.makeSymbol("STRING-DOWNCASE");
        $ic262$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("-"));
        $ic263$ = SubLObjectFactory.makeString("~A: ~A");
        $ic264$ = SubLObjectFactory.makeString("Errors found:");
        $ic265$ = SubLObjectFactory.makeKeyword("SUCCESSES");
        $ic266$ = SubLObjectFactory.makeString("Actions taken:");
        $ic267$ = SubLObjectFactory.makeKeyword("ASSERTED");
        $ic268$ = SubLObjectFactory.makeString("~A in ~A");
        $ic269$ = SubLObjectFactory.makeKeyword("UNASSERTED");
        $ic270$ = SubLObjectFactory.makeString("~A from ~A");
    }
    
    public static final class $sX48204_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $keyword;
        public SubLObject $displayP_fn;
        public SubLObject $display_fn;
        public SubLObject $display_string;
        private static final SubLStructDeclNative structDecl;
        
        public $sX48204_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$keyword = (SubLObject)CommonSymbols.NIL;
            this.$displayP_fn = (SubLObject)CommonSymbols.NIL;
            this.$display_fn = (SubLObject)CommonSymbols.NIL;
            this.$display_string = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX48204_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$keyword;
        }
        
        public SubLObject getField4() {
            return this.$displayP_fn;
        }
        
        public SubLObject getField5() {
            return this.$display_fn;
        }
        
        public SubLObject getField6() {
            return this.$display_string;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$keyword = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$displayP_fn = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$display_fn = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$display_string = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX48204_native.class, module0719.$ic32$, module0719.$ic33$, module0719.$ic34$, module0719.$ic35$, new String[] { "$name", "$keyword", "$displayP_fn", "$display_fn", "$display_string" }, module0719.$ic36$, module0719.$ic37$, module0719.$ic38$);
        }
    }
    
    public static final class $f44042$UnaryFunction extends UnaryFunction
    {
        public $f44042$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#48205"));
        }
        
        public SubLObject processItem(final SubLObject var19) {
            return module0719.f44042(var19);
        }
    }
    
    public static final class $sX48206_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $keyword;
        public SubLObject $order_num;
        public SubLObject $perspective;
        public SubLObject $displayP_fn;
        public SubLObject $display_fn;
        public SubLObject $handlerP_fn;
        public SubLObject $handler_fn;
        private static final SubLStructDeclNative structDecl;
        
        public $sX48206_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$keyword = (SubLObject)CommonSymbols.NIL;
            this.$order_num = (SubLObject)CommonSymbols.NIL;
            this.$perspective = (SubLObject)CommonSymbols.NIL;
            this.$displayP_fn = (SubLObject)CommonSymbols.NIL;
            this.$display_fn = (SubLObject)CommonSymbols.NIL;
            this.$handlerP_fn = (SubLObject)CommonSymbols.NIL;
            this.$handler_fn = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX48206_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$keyword;
        }
        
        public SubLObject getField4() {
            return this.$order_num;
        }
        
        public SubLObject getField5() {
            return this.$perspective;
        }
        
        public SubLObject getField6() {
            return this.$displayP_fn;
        }
        
        public SubLObject getField7() {
            return this.$display_fn;
        }
        
        public SubLObject getField8() {
            return this.$handlerP_fn;
        }
        
        public SubLObject getField9() {
            return this.$handler_fn;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$keyword = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$order_num = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$perspective = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$displayP_fn = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$display_fn = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$handlerP_fn = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$handler_fn = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX48206_native.class, module0719.$ic128$, module0719.$ic129$, module0719.$ic130$, module0719.$ic131$, new String[] { "$name", "$keyword", "$order_num", "$perspective", "$displayP_fn", "$display_fn", "$handlerP_fn", "$handler_fn" }, module0719.$ic132$, module0719.$ic133$, module0719.$ic134$);
        }
    }
    
    public static final class $f44066$UnaryFunction extends UnaryFunction
    {
        public $f44066$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#48207"));
        }
        
        public SubLObject processItem(final SubLObject var19) {
            return module0719.f44066(var19);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0719.class
	Total time: 3379 ms
	
	Decompiled with Procyon 0.5.32.
*/