package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0657 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0657";
    public static final String myFingerPrint = "8b17eb40ef453b821f7cd30e068086c06f6565a2423614d7d5d65d322347ede8";
    private static SubLSymbol $g5184$;
    private static SubLSymbol $g5185$;
    private static SubLSymbol $g5186$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLList $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLList $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLString $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLList $ic83$;
    private static final SubLList $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLObject $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLInteger $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLString $ic98$;
    private static final SubLList $ic99$;
    private static final SubLList $ic100$;
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
    private static final SubLString $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLList $ic114$;
    private static final SubLList $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLList $ic119$;
    private static final SubLString $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLList $ic129$;
    private static final SubLString $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLList $ic134$;
    private static final SubLString $ic135$;
    private static final SubLString $ic136$;
    private static final SubLString $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLString $ic142$;
    private static final SubLString $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLString $ic145$;
    private static final SubLString $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLString $ic152$;
    private static final SubLString $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLString $ic155$;
    private static final SubLString $ic156$;
    private static final SubLString $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLInteger $ic159$;
    private static final SubLString $ic160$;
    private static final SubLString $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLString $ic164$;
    private static final SubLString $ic165$;
    private static final SubLString $ic166$;
    private static final SubLList $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLList $ic170$;
    private static final SubLString $ic171$;
    private static final SubLString $ic172$;
    private static final SubLString $ic173$;
    private static final SubLString $ic174$;
    private static final SubLString $ic175$;
    private static final SubLString $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLList $ic184$;
    
    
    public static SubLObject f39991(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        return (SubLObject)((NIL != var1) ? module0656.f39865(var1) : $ic0$);
    }
    
    public static SubLObject f39992(SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0161.f10557(var2);
        final SubLObject var6 = module0161.f10586(var2);
        if (NIL != module0161.f10471()) {
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var7 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)T, var4);
                f39993(var5, var3);
                f39994(var6, var3);
            }
            finally {
                module0015.$g533$.rebind(var7, var4);
            }
            module0642.f39020(module0015.$g347$.getGlobalValue());
        }
        else {
            f39995(var5, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39996(final SubLObject var7) {
        assert NIL != Types.stringp(var7) : var7;
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic3$, var7);
    }
    
    public static SubLObject f39995(SubLObject var1, SubLObject var3) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var6;
        final SubLObject var5 = var6 = var3;
        final SubLObject var7 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var6);
        final SubLObject var8 = (SubLObject)((NIL != var7) ? conses_high.cadr(var7) : T);
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var6);
        final SubLObject var10 = (NIL != var9) ? conses_high.cadr(var9) : $g5184$.getGlobalValue();
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic6$, var6);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = f39997(var10);
        if (NIL != var8) {
            module0666.f40467(var13, (SubLObject)$ic7$, $ic8$, (SubLObject)NIL, (SubLObject)NIL, var12);
            module0642.f39032((SubLObject)ONE_INTEGER);
        }
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic9$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        final SubLObject var14 = f39991(var1);
        if (NIL != var8) {
            module0642.f39075(var13, var14, module0655.$g5136$.getDynamicValue(var4));
            module0642.f39032((SubLObject)ONE_INTEGER);
            module0644.f39184(var13, (SubLObject)$ic10$);
        }
        else {
            module0656.f39804(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39069(var13, var14, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39993(SubLObject var1, SubLObject var3) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var6;
        final SubLObject var5 = var6 = var3;
        final SubLObject var7 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var6);
        final SubLObject var8 = (SubLObject)((NIL != var7) ? conses_high.cadr(var7) : T);
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var6);
        final SubLObject var10 = (NIL != var9) ? conses_high.cadr(var9) : $g5184$.getGlobalValue();
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic6$, var6);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        if (NIL != var8) {
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var13 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)T, var4);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic11$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var6_22 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)T, var4);
                    final SubLObject var14 = f39996(var10);
                    module0642.f39068(var14, (SubLObject)$ic12$, (SubLObject)T, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T);
                }
                finally {
                    module0015.$g533$.rebind(var6_22, var4);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g371$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)THREE_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic13$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var6_23 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)T, var4);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic14$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var6_23, var4);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var13, var4);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39020(module0015.$g373$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0642.f39049((SubLObject)$ic11$));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var13 = module0015.$g533$.currentBinding(var4);
        try {
            module0015.$g533$.bind((SubLObject)T, var4);
            final SubLObject var15 = f39997(var10);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic11$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var6_24 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)T, var4);
            }
            finally {
                module0015.$g533$.rebind(var6_24, var4);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g370$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic13$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var6_25 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)T, var4);
                if (NIL != var8) {
                    module0666.f40467(var15, (SubLObject)$ic7$, $ic8$, (SubLObject)NIL, (SubLObject)NIL, var12);
                    module0642.f39032((SubLObject)ONE_INTEGER);
                }
            }
            finally {
                module0015.$g533$.rebind(var6_25, var4);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g370$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic15$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var6_26 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)T, var4);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019((SubLObject)$ic16$);
                module0642.f39020(module0015.$g235$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var6_26, var4);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            final SubLObject var16 = f39991(var1);
            if (NIL != var8) {
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic13$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var6_27 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)T, var4);
                    if (NIL != module0015.f794((SubLObject)UNPROVIDED)) {
                        final SubLObject var17 = module0015.f793((SubLObject)UNPROVIDED);
                        final SubLObject var18 = Sequences.cconcatenate((SubLObject)$ic17$, module0006.f203(var17));
                        final SubLObject var19 = Sequences.cconcatenate((SubLObject)$ic18$, module0006.f203(var17));
                        final SubLObject var20 = Sequences.cconcatenate((SubLObject)$ic19$, module0006.f203(var17));
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        if (NIL != var18) {
                            module0642.f39020(module0015.$g157$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var18);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g158$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic20$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var6_28 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var4);
                            module0642.f39020(module0015.$g336$.getGlobalValue());
                            module0642.f39020(module0015.$g338$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var15);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            if (NIL != module0655.$g5136$.getDynamicValue(var4)) {
                                module0642.f39020(module0015.$g340$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0655.$g5136$.getDynamicValue(var4));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var19) {
                                module0642.f39020(module0015.$g341$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var19);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39020(module0015.$g339$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g342$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic21$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g158$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic22$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var6_29 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var4);
                                module0642.f39019(var16);
                            }
                            finally {
                                module0015.$g533$.rebind(var6_29, var4);
                            }
                            module0642.f39020(module0015.$g337$.getGlobalValue());
                            module0642.f39020(module0015.$g144$.getGlobalValue());
                            if (NIL != var20) {
                                module0642.f39020(module0015.$g157$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var20);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39020(module0015.$g158$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic23$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var6_30 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var4);
                            }
                            finally {
                                module0015.$g533$.rebind(var6_30, var4);
                            }
                            module0642.f39020(module0015.$g145$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var6_28, var4);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        module0666.f40486(var19, var20, (SubLObject)TWENTY_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)NIL, $ic8$);
                    }
                    else {
                        module0642.f39020(module0015.$g336$.getGlobalValue());
                        module0642.f39020(module0015.$g338$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var15);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        if (NIL != module0655.$g5136$.getDynamicValue(var4)) {
                            module0642.f39020(module0015.$g340$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0655.$g5136$.getDynamicValue(var4));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g339$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var6_31 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var4);
                            module0642.f39019(var16);
                        }
                        finally {
                            module0015.$g533$.rebind(var6_31, var4);
                        }
                        module0642.f39020(module0015.$g337$.getGlobalValue());
                    }
                }
                finally {
                    module0015.$g533$.rebind(var6_27, var4);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic13$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var6_32 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)T, var4);
                    module0644.f39184(var15, (SubLObject)$ic10$);
                }
                finally {
                    module0015.$g533$.rebind(var6_32, var4);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            else {
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic13$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var6_33 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)T, var4);
                    module0656.f39804(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39069(var15, var16, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var6_33, var4);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
        }
        finally {
            module0015.$g533$.rebind(var13, var4);
        }
        module0642.f39020(module0015.$g365$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39997(final SubLObject var7) {
        assert NIL != Types.stringp(var7) : var7;
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic24$, Strings.string_downcase(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f39998(final SubLObject var7) {
        assert NIL != Types.stringp(var7) : var7;
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic25$, var7);
    }
    
    public static SubLObject f39994(SubLObject var5, SubLObject var3) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var8;
        final SubLObject var7 = var8 = var3;
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var8);
        final SubLObject var10 = (SubLObject)((NIL != var9) ? conses_high.cadr(var9) : T);
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var8);
        final SubLObject var12 = (NIL != var11) ? conses_high.cadr(var11) : $g5184$.getGlobalValue();
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic26$, var8);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : T);
        final SubLObject var15 = f39999(var12);
        final SubLObject var16 = f40000(var12);
        final SubLObject var17 = module0161.f10535(var5);
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        if (NIL == var17) {
            var6.resetMultipleValues();
            final SubLObject var50_51 = module0161.f10583(var5);
            final SubLObject var52_53 = var6.secondMultipleValue();
            var6.resetMultipleValues();
            var18 = var50_51;
            var19 = var52_53;
        }
        final SubLObject var20 = f39998(var12);
        if (NIL == var10) {
            module0642.f39069(var20, (SubLObject)$ic27$, (SubLObject)UNPROVIDED);
        }
        else if (NIL == var14) {
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var21 = module0015.$g533$.currentBinding(var6);
            try {
                module0015.$g533$.bind((SubLObject)T, var6);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic11$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var6_55 = module0015.$g533$.currentBinding(var6);
                try {
                    module0015.$g533$.bind((SubLObject)T, var6);
                    module0642.f39068(var20, (SubLObject)$ic12$, (SubLObject)T, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T);
                }
                finally {
                    module0015.$g533$.rebind(var6_55, var6);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g371$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)THREE_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic13$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var6_56 = module0015.$g533$.currentBinding(var6);
                try {
                    module0015.$g533$.bind((SubLObject)T, var6);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic28$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var6_56, var6);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var21, var6);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39069(var20, (SubLObject)$ic27$, (SubLObject)UNPROVIDED);
        }
        else {
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var21 = module0015.$g533$.currentBinding(var6);
            try {
                module0015.$g533$.bind((SubLObject)T, var6);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic11$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var6_57 = module0015.$g533$.currentBinding(var6);
                try {
                    module0015.$g533$.bind((SubLObject)T, var6);
                    module0642.f39068(var20, (SubLObject)$ic12$, (SubLObject)makeBoolean(NIL == var17), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)makeBoolean(NIL == var14));
                }
                finally {
                    module0015.$g533$.rebind(var6_57, var6);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g371$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)THREE_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic13$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var6_58 = module0015.$g533$.currentBinding(var6);
                try {
                    module0015.$g533$.bind((SubLObject)T, var6);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic28$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var6_58, var6);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var21, var6);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39020(module0015.$g373$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0642.f39049((SubLObject)$ic11$));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var22 = module0015.$g533$.currentBinding(var6);
        try {
            module0015.$g533$.bind((SubLObject)T, var6);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var6_59 = module0015.$g533$.currentBinding(var6);
            try {
                module0015.$g533$.bind((SubLObject)T, var6);
            }
            finally {
                module0015.$g533$.rebind(var6_59, var6);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            f40001(var18, var15, var10);
        }
        finally {
            module0015.$g533$.rebind(var22, var6);
        }
        module0642.f39020(module0015.$g365$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39020(module0015.$g373$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0642.f39049((SubLObject)$ic11$));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var22 = module0015.$g533$.currentBinding(var6);
        try {
            module0015.$g533$.bind((SubLObject)T, var6);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var6_60 = module0015.$g533$.currentBinding(var6);
            try {
                module0015.$g533$.bind((SubLObject)T, var6);
            }
            finally {
                module0015.$g533$.rebind(var6_60, var6);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            f40002(var19, var16, var10);
        }
        finally {
            module0015.$g533$.rebind(var22, var6);
        }
        module0642.f39020(module0015.$g365$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40001(SubLObject var48, SubLObject var45, SubLObject var11) {
        if (var48 == UNPROVIDED) {
            var48 = (SubLObject)NIL;
        }
        if (var45 == UNPROVIDED) {
            var45 = (SubLObject)NIL;
        }
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        final SubLThread var49 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39020(module0015.$g370$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0642.f39049((SubLObject)$ic13$));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var50 = module0015.$g533$.currentBinding(var49);
        try {
            module0015.$g533$.bind((SubLObject)T, var49);
            if (NIL != var11) {
                final SubLObject var51 = (SubLObject)$ic29$;
                module0666.f40467(var45, (SubLObject)$ic7$, $ic30$, (SubLObject)NIL, (SubLObject)NIL, var51);
                module0642.f39032((SubLObject)ONE_INTEGER);
            }
        }
        finally {
            module0015.$g533$.rebind(var50, var49);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39020(module0015.$g370$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0642.f39049((SubLObject)$ic15$));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var50 = module0015.$g533$.currentBinding(var49);
        try {
            module0015.$g533$.bind((SubLObject)T, var49);
            if (NIL == var11) {
                module0642.f39021((SubLObject)$ic31$);
            }
            module0642.f39021((SubLObject)$ic32$);
        }
        finally {
            module0015.$g533$.rebind(var50, var49);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        final SubLObject var52 = module0656.f39962(var48);
        if (NIL != var11) {
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g370$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic13$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            SubLObject var53 = module0015.$g533$.currentBinding(var49);
            try {
                module0015.$g533$.bind((SubLObject)T, var49);
                final SubLObject var54 = (SubLObject)TWO_INTEGER;
                if (NIL != module0015.f794((SubLObject)UNPROVIDED)) {
                    final SubLObject var55 = module0015.f793((SubLObject)UNPROVIDED);
                    final SubLObject var56 = Sequences.cconcatenate((SubLObject)$ic17$, module0006.f203(var55));
                    final SubLObject var57 = Sequences.cconcatenate((SubLObject)$ic18$, module0006.f203(var55));
                    final SubLObject var58 = Sequences.cconcatenate((SubLObject)$ic19$, module0006.f203(var55));
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    if (NIL != var56) {
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var56);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g158$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic20$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var6_64 = module0015.$g533$.currentBinding(var49);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var49);
                        module0642.f39020(module0015.$g336$.getGlobalValue());
                        module0642.f39020(module0015.$g338$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var45);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        if (NIL != module0655.$g5136$.getDynamicValue(var49)) {
                            module0642.f39020(module0015.$g340$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0655.$g5136$.getDynamicValue(var49));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        if (NIL != var57) {
                            module0642.f39020(module0015.$g341$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var57);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        if (NIL != var54) {
                            module0642.f39020(module0015.$g339$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var54);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g342$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic21$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g158$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic22$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var6_65 = module0015.$g533$.currentBinding(var49);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var49);
                            module0642.f39019(var52);
                        }
                        finally {
                            module0015.$g533$.rebind(var6_65, var49);
                        }
                        module0642.f39020(module0015.$g337$.getGlobalValue());
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        if (NIL != var58) {
                            module0642.f39020(module0015.$g157$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var58);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g158$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic23$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var6_66 = module0015.$g533$.currentBinding(var49);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var49);
                        }
                        finally {
                            module0015.$g533$.rebind(var6_66, var49);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var6_64, var49);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    module0666.f40486(var57, var58, (SubLObject)TWENTY_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)NIL, $ic30$);
                }
                else {
                    module0642.f39020(module0015.$g336$.getGlobalValue());
                    module0642.f39020(module0015.$g338$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var45);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != module0655.$g5136$.getDynamicValue(var49)) {
                        module0642.f39020(module0015.$g340$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0655.$g5136$.getDynamicValue(var49));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    if (NIL != var54) {
                        module0642.f39020(module0015.$g339$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var54);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var6_67 = module0015.$g533$.currentBinding(var49);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var49);
                        module0642.f39019(var52);
                    }
                    finally {
                        module0015.$g533$.rebind(var6_67, var49);
                    }
                    module0642.f39020(module0015.$g337$.getGlobalValue());
                }
            }
            finally {
                module0015.$g533$.rebind(var53, var49);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g370$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic13$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            var53 = module0015.$g533$.currentBinding(var49);
            try {
                module0015.$g533$.bind((SubLObject)T, var49);
                module0644.f39184(var45, (SubLObject)$ic33$);
            }
            finally {
                module0015.$g533$.rebind(var53, var49);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        else {
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g370$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic13$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var53 = module0015.$g533$.currentBinding(var49);
            try {
                module0015.$g533$.bind((SubLObject)T, var49);
                module0656.f39804(var48, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39069(var45, var52, (SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var53, var49);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39999(final SubLObject var7) {
        assert NIL != Types.stringp(var7) : var7;
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic34$, Strings.string_downcase(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f40002(SubLObject var49, SubLObject var46, SubLObject var11) {
        if (var49 == UNPROVIDED) {
            var49 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        final SubLThread var50 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39020(module0015.$g370$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0642.f39049((SubLObject)$ic13$));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var51 = module0015.$g533$.currentBinding(var50);
        try {
            module0015.$g533$.bind((SubLObject)T, var50);
            if (NIL != var11) {
                final SubLObject var52 = (SubLObject)$ic35$;
                module0666.f40467(var46, (SubLObject)$ic7$, $ic36$, (SubLObject)NIL, (SubLObject)NIL, var52);
                module0642.f39032((SubLObject)ONE_INTEGER);
            }
        }
        finally {
            module0015.$g533$.rebind(var51, var50);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39020(module0015.$g370$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0642.f39049((SubLObject)$ic15$));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var51 = module0015.$g533$.currentBinding(var50);
        try {
            module0015.$g533$.bind((SubLObject)T, var50);
            if (NIL == var11) {
                module0642.f39021((SubLObject)$ic31$);
            }
            module0642.f39021((SubLObject)$ic37$);
        }
        finally {
            module0015.$g533$.rebind(var51, var50);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        final SubLObject var53 = module0656.f39963(var49);
        if (NIL != var11) {
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g370$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic13$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            SubLObject var54 = module0015.$g533$.currentBinding(var50);
            try {
                module0015.$g533$.bind((SubLObject)T, var50);
                if (NIL != module0015.f794((SubLObject)UNPROVIDED)) {
                    final SubLObject var55 = module0015.f793((SubLObject)UNPROVIDED);
                    final SubLObject var56 = Sequences.cconcatenate((SubLObject)$ic17$, module0006.f203(var55));
                    final SubLObject var57 = Sequences.cconcatenate((SubLObject)$ic18$, module0006.f203(var55));
                    final SubLObject var58 = Sequences.cconcatenate((SubLObject)$ic19$, module0006.f203(var55));
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    if (NIL != var56) {
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var56);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g158$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic20$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var6_70 = module0015.$g533$.currentBinding(var50);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var50);
                        module0642.f39020(module0015.$g336$.getGlobalValue());
                        module0642.f39020(module0015.$g338$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var46);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        if (NIL != module0655.$g5136$.getDynamicValue(var50)) {
                            module0642.f39020(module0015.$g340$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0655.$g5136$.getDynamicValue(var50));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        if (NIL != var57) {
                            module0642.f39020(module0015.$g341$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var57);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g339$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ONE_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g342$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic21$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g158$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic22$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var6_71 = module0015.$g533$.currentBinding(var50);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var50);
                            module0642.f39019(var53);
                        }
                        finally {
                            module0015.$g533$.rebind(var6_71, var50);
                        }
                        module0642.f39020(module0015.$g337$.getGlobalValue());
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        if (NIL != var58) {
                            module0642.f39020(module0015.$g157$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var58);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g158$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic23$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var6_72 = module0015.$g533$.currentBinding(var50);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var50);
                        }
                        finally {
                            module0015.$g533$.rebind(var6_72, var50);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var6_70, var50);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    module0666.f40486(var57, var58, (SubLObject)TWENTY_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)NIL, $ic36$);
                }
                else {
                    module0642.f39020(module0015.$g336$.getGlobalValue());
                    module0642.f39020(module0015.$g338$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var46);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != module0655.$g5136$.getDynamicValue(var50)) {
                        module0642.f39020(module0015.$g340$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0655.$g5136$.getDynamicValue(var50));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g339$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)ONE_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var6_73 = module0015.$g533$.currentBinding(var50);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var50);
                        module0642.f39019(var53);
                    }
                    finally {
                        module0015.$g533$.rebind(var6_73, var50);
                    }
                    module0642.f39020(module0015.$g337$.getGlobalValue());
                }
            }
            finally {
                module0015.$g533$.rebind(var54, var50);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g370$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic13$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            var54 = module0015.$g533$.currentBinding(var50);
            try {
                module0015.$g533$.bind((SubLObject)T, var50);
                module0644.f39184(var46, (SubLObject)$ic38$);
            }
            finally {
                module0015.$g533$.rebind(var54, var50);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        else {
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g370$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic13$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var54 = module0015.$g533$.currentBinding(var50);
            try {
                module0015.$g533$.bind((SubLObject)T, var50);
                module0656.f39804(var49, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39069(var46, var53, (SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var54, var50);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40000(final SubLObject var7) {
        assert NIL != Types.stringp(var7) : var7;
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic39$, Strings.string_downcase(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f40003(final SubLObject var74, SubLObject var75, SubLObject var76) {
        if (var75 == UNPROVIDED) {
            var75 = (SubLObject)NIL;
        }
        if (var76 == UNPROVIDED) {
            var76 = (SubLObject)NIL;
        }
        final SubLThread var77 = SubLProcess.currentSubLThread();
        final SubLObject var79;
        final SubLObject var78 = var79 = var76;
        final SubLObject var80 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var79);
        final SubLObject var81 = (NIL != var80) ? conses_high.cadr(var80) : $g5184$.getGlobalValue();
        final SubLObject var82 = cdestructuring_bind.property_list_member((SubLObject)$ic40$, var79);
        final SubLObject var83 = (SubLObject)((NIL != var82) ? conses_high.cadr(var82) : NIL);
        final SubLObject var84 = module0161.f10576(var75);
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        var77.resetMultipleValues();
        final SubLObject var85_86 = module0161.f10612(var75, (SubLObject)NIL, (SubLObject)NIL);
        final SubLObject var87_88 = var77.secondMultipleValue();
        var77.resetMultipleValues();
        var85 = var85_86;
        var86 = var87_88;
        SubLObject var87 = (SubLObject)$ic41$;
        SubLObject var88 = (SubLObject)$ic41$;
        SubLObject var89 = (SubLObject)$ic41$;
        final SubLObject var90 = f39997(var81);
        final SubLObject var91 = module0642.f39104(var90, var74);
        if (NIL != var91) {
            var77.resetMultipleValues();
            final SubLObject var91_92 = f40004(var91, var84, var83);
            final SubLObject var93_94 = var77.secondMultipleValue();
            var77.resetMultipleValues();
            var87 = var91_92;
            var89 = var93_94;
        }
        else {
            var89 = f40005();
        }
        if (NIL != var89) {
            return Values.values((SubLObject)NIL, var89, var91);
        }
        if (NIL == module0161.f10471()) {
            return Values.values(var87, (SubLObject)NIL, (SubLObject)NIL);
        }
        final SubLObject var92 = f39998(var81);
        final SubLObject var93 = module0642.f39104(var92, var74);
        if (NIL != var93) {
            SubLObject var94 = (SubLObject)$ic41$;
            SubLObject var95 = (SubLObject)$ic41$;
            final SubLObject var96 = f39999(var81);
            final SubLObject var97 = module0642.f39104(var96, var74);
            var77.resetMultipleValues();
            final SubLObject var97_98 = f40006(var97, var85, var83);
            final SubLObject var99_100 = var77.secondMultipleValue();
            var77.resetMultipleValues();
            var94 = var97_98;
            var89 = var99_100;
            if (NIL != var89) {
                return Values.values((SubLObject)NIL, var89, var97);
            }
            final SubLObject var98 = f40000(var81);
            final SubLObject var99 = module0642.f39104(var98, var74);
            var77.resetMultipleValues();
            final SubLObject var102_103 = f40007(var99, var86, var83);
            final SubLObject var104_105 = var77.secondMultipleValue();
            var77.resetMultipleValues();
            var95 = var102_103;
            var89 = var104_105;
            if (NIL != var89) {
                return Values.values((SubLObject)NIL, var89, var99);
            }
            var88 = module0161.f10543(var94, var95);
        }
        else {
            var88 = module0161.f10543($ic42$, (SubLObject)UNPROVIDED);
        }
        if (NIL == var87 && NIL == var88) {
            final SubLObject var89_106 = f40005();
            return Values.values((SubLObject)NIL, var89_106, (SubLObject)NIL);
        }
        if (NIL == var87 || NIL == var88) {
            final SubLObject var100 = ConsesLow.nconc((SubLObject)((NIL != var87) ? NIL : ConsesLow.list((SubLObject)$ic43$)), (SubLObject)((NIL != var88) ? NIL : ConsesLow.list((SubLObject)$ic44$)));
            final SubLObject var89_107 = f40008(var100);
            return Values.values((SubLObject)NIL, var89_107, (SubLObject)NIL);
        }
        final SubLObject var101 = module0161.f10619(var87, var88);
        return Values.values(var101, (SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f40004(SubLObject var110, final SubLObject var82, final SubLObject var81) {
        assert NIL != Types.stringp(var110) : var110;
        var110 = module0038.f2824(module0038.f2735(var110));
        if (NIL != module0038.f2608(var110)) {
            if (NIL != var82) {
                return Values.values(var82, (SubLObject)NIL);
            }
            return Values.values((SubLObject)NIL, (SubLObject)NIL);
        }
        else {
            final SubLObject var111 = module0656.f39957(var110, (SubLObject)UNPROVIDED);
            if (NIL == var111) {
                if (NIL != module0038.f2873(var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    return Values.values((SubLObject)NIL, f40009((SubLObject)$ic43$));
                }
                return Values.values((SubLObject)NIL, f40010((SubLObject)$ic43$));
            }
            else {
                if (NIL == module0674.f41210(var111) && (NIL == var81 || NIL == module0552.f34132(var111))) {
                    return Values.values((SubLObject)NIL, f40011((SubLObject)$ic43$));
                }
                return Values.values(var111, (SubLObject)NIL);
            }
        }
    }
    
    public static SubLObject f40006(SubLObject var110, final SubLObject var83, final SubLObject var81) {
        assert NIL != Types.stringp(var110) : var110;
        var110 = module0038.f2824(module0038.f2735(var110));
        if (NIL != module0038.f2608(var110)) {
            if (NIL != var83) {
                return Values.values(var83, (SubLObject)NIL);
            }
            return Values.values((SubLObject)NIL, (SubLObject)NIL);
        }
        else {
            final SubLObject var111 = module0656.f39957(var110, (SubLObject)UNPROVIDED);
            if (NIL != var81 && NIL != module0552.f34132(var111)) {
                return Values.values(var111, (SubLObject)NIL);
            }
            final SubLObject var112 = module0656.f39960(var110);
            if (NIL == var112) {
                if (NIL != module0038.f2873(var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    return Values.values((SubLObject)NIL, f40009((SubLObject)$ic45$));
                }
                return Values.values((SubLObject)NIL, f40010((SubLObject)$ic45$));
            }
            else {
                if (NIL == module0161.f10593(var112)) {
                    return Values.values((SubLObject)NIL, f40011((SubLObject)$ic45$));
                }
                return Values.values(var112, (SubLObject)NIL);
            }
        }
    }
    
    public static SubLObject f40007(SubLObject var110, final SubLObject var84, final SubLObject var81) {
        assert NIL != Types.stringp(var110) : var110;
        var110 = module0038.f2824(module0038.f2735(var110));
        if (NIL != module0038.f2608(var110)) {
            if (NIL != var84) {
                return Values.values(var84, (SubLObject)NIL);
            }
            return Values.values((SubLObject)NIL, (SubLObject)NIL);
        }
        else {
            final SubLObject var111 = module0656.f39957(var110, (SubLObject)UNPROVIDED);
            if (NIL != var81 && NIL != module0552.f34132(var111)) {
                return Values.values(var111, (SubLObject)NIL);
            }
            final SubLObject var112 = module0656.f39961(var110);
            if (NIL == var112) {
                if (NIL != module0038.f2873(var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    return Values.values((SubLObject)NIL, f40009((SubLObject)$ic46$));
                }
                return Values.values((SubLObject)NIL, f40010((SubLObject)$ic46$));
            }
            else {
                if (NIL == module0161.f10594(var112)) {
                    return Values.values((SubLObject)NIL, f40011((SubLObject)$ic46$));
                }
                return Values.values(var112, (SubLObject)NIL);
            }
        }
    }
    
    public static SubLObject f40012(final SubLObject var112) {
        return (SubLObject)makeBoolean(NIL != module0035.f2014(var112) && NIL != module0035.f2000(var112, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && $ic47$ == var112.first());
    }
    
    public static SubLObject f40013(final SubLObject var89, SubLObject var110) {
        if (var110 == UNPROVIDED) {
            var110 = (SubLObject)NIL;
        }
        if (NIL == f40012(var89)) {
            return module0656.f39789((SubLObject)$ic81$, var89, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        SubLObject var111 = (SubLObject)NIL;
        SubLObject var112 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var89, var89, (SubLObject)$ic48$);
        var111 = var89.first();
        SubLObject var113 = var89.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var113, var89, (SubLObject)$ic48$);
        var112 = var113.first();
        var113 = var113.rest();
        final SubLObject var114 = (SubLObject)(var113.isCons() ? var113.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var113, var89, (SubLObject)$ic48$);
        var113 = var113.rest();
        if (NIL != var113) {
            cdestructuring_bind.cdestructuring_bind_error(var89, (SubLObject)$ic48$);
            return (SubLObject)NIL;
        }
        final SubLObject var115 = var112;
        if (var115.eql((SubLObject)$ic49$)) {
            return module0656.f39789((SubLObject)$ic50$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (var115.eql((SubLObject)$ic51$)) {
            final SubLObject var118_119 = var114;
            if (var118_119.eql((SubLObject)$ic43$)) {
                if (NIL != module0161.f10471()) {
                    return module0656.f39789((SubLObject)$ic52$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                return module0656.f39789((SubLObject)$ic50$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                if (var118_119.eql((SubLObject)$ic44$)) {
                    return module0656.f39789((SubLObject)$ic53$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (var118_119.eql((SubLObject)$ic45$)) {
                    return module0656.f39789((SubLObject)$ic54$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (var118_119.eql((SubLObject)$ic46$)) {
                    return module0656.f39789((SubLObject)$ic55$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                return module0656.f39789((SubLObject)$ic56$, var114, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else if (var115.eql((SubLObject)$ic57$)) {
            final SubLObject var118_120 = var114;
            if (var118_120.eql((SubLObject)$ic43$)) {
                return module0656.f39789((SubLObject)$ic58$, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (var118_120.eql((SubLObject)$ic44$)) {
                return module0656.f39789((SubLObject)$ic59$, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (var118_120.eql((SubLObject)$ic45$)) {
                return module0656.f39789((SubLObject)$ic60$, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (var118_120.eql((SubLObject)$ic46$)) {
                return module0656.f39789((SubLObject)$ic61$, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            return module0656.f39789((SubLObject)$ic62$, var110, var114, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (var115.eql((SubLObject)$ic63$)) {
            final SubLObject var118_121 = var114;
            if (var118_121.eql((SubLObject)$ic43$)) {
                return module0656.f39789((SubLObject)$ic64$, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (var118_121.eql((SubLObject)$ic44$)) {
                return module0656.f39789((SubLObject)$ic65$, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (var118_121.eql((SubLObject)$ic45$)) {
                return module0656.f39789((SubLObject)$ic66$, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (var118_121.eql((SubLObject)$ic46$)) {
                return module0656.f39789((SubLObject)$ic67$, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            return module0656.f39789((SubLObject)$ic68$, var110, var114, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            if (var115.eql((SubLObject)$ic69$)) {
                final SubLObject var116 = var114;
                return module0656.f39789((SubLObject)$ic70$, var116, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (!var115.eql((SubLObject)$ic71$)) {
                return module0656.f39789((SubLObject)$ic80$, var112, var114, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            final SubLObject var118_122 = var114;
            if (var118_122.eql((SubLObject)$ic43$)) {
                if (NIL != module0161.f10471()) {
                    return module0656.f39789((SubLObject)$ic72$, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                return module0656.f39789((SubLObject)$ic73$, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                if (var118_122.eql((SubLObject)$ic44$)) {
                    return module0656.f39789((SubLObject)$ic74$, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (var118_122.eql((SubLObject)$ic75$)) {
                    return module0656.f39789((SubLObject)$ic76$, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (var118_122.eql((SubLObject)$ic77$)) {
                    return module0656.f39789((SubLObject)$ic78$, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                return module0656.f39789((SubLObject)$ic79$, var110, var114, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
    }
    
    public static SubLObject f40005() {
        return (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)$ic49$);
    }
    
    public static SubLObject f40014(final SubLObject var89) {
        return (SubLObject)makeBoolean(NIL != f40012(var89) && $ic49$ == conses_high.second(var89));
    }
    
    public static SubLObject f40009(final SubLObject var124) {
        return (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)$ic57$, var124);
    }
    
    public static SubLObject f40010(final SubLObject var124) {
        return (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)$ic63$, var124);
    }
    
    public static SubLObject f40011(final SubLObject var124) {
        return (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)$ic71$, var124);
    }
    
    public static SubLObject f40008(SubLObject var107) {
        if (var107 == UNPROVIDED) {
            var107 = (SubLObject)NIL;
        }
        if (NIL != module0035.f1997(var107)) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)$ic51$, var107.first());
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)$ic69$, var107);
    }
    
    public static SubLObject f40015() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40016() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0655.$g5116$.getDynamicValue(var4);
    }
    
    public static SubLObject f40017(SubLObject var125, SubLObject var3) {
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (NIL != f40015()) {
            return f40018(var125, var3);
        }
        return f40019(var125, var3);
    }
    
    public static SubLObject f40018(SubLObject var125, SubLObject var3) {
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLObject var127;
        final SubLObject var126 = var127 = var3;
        SubLObject var128 = (SubLObject)NIL;
        SubLObject var129 = var127;
        SubLObject var130 = (SubLObject)NIL;
        SubLObject var131_132 = (SubLObject)NIL;
        while (NIL != var129) {
            cdestructuring_bind.destructuring_bind_must_consp(var129, var126, (SubLObject)$ic83$);
            var131_132 = var129.first();
            var129 = var129.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var129, var126, (SubLObject)$ic83$);
            if (NIL == conses_high.member(var131_132, (SubLObject)$ic84$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var130 = (SubLObject)T;
            }
            if (var131_132 == $ic85$) {
                var128 = var129.first();
            }
            var129 = var129.rest();
        }
        if (NIL != var130 && NIL == var128) {
            cdestructuring_bind.cdestructuring_bind_error(var126, (SubLObject)$ic83$);
        }
        final SubLObject var131 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var127);
        final SubLObject var132 = (NIL != var131) ? conses_high.cadr(var131) : $g5185$.getGlobalValue();
        final SubLObject var133 = cdestructuring_bind.property_list_member((SubLObject)$ic86$, var127);
        final SubLObject var134 = (SubLObject)((NIL != var133) ? conses_high.cadr(var133) : $ic7$);
        final SubLObject var135 = cdestructuring_bind.property_list_member((SubLObject)$ic87$, var127);
        final SubLObject var136 = (SubLObject)((NIL != var135) ? conses_high.cadr(var135) : NIL);
        final SubLObject var137 = cdestructuring_bind.property_list_member((SubLObject)$ic88$, var127);
        final SubLObject var138 = (SubLObject)((NIL != var137) ? conses_high.cadr(var137) : $ic89$);
        final SubLObject var139 = cdestructuring_bind.property_list_member((SubLObject)$ic90$, var127);
        final SubLObject var140 = (SubLObject)((NIL != var139) ? conses_high.cadr(var139) : $ic91$);
        final SubLObject var141 = cdestructuring_bind.property_list_member((SubLObject)$ic92$, var127);
        final SubLObject var142 = (SubLObject)((NIL != var141) ? conses_high.cadr(var141) : NIL);
        final SubLObject var143 = cdestructuring_bind.property_list_member((SubLObject)$ic93$, var127);
        final SubLObject var144 = (NIL != var143) ? conses_high.cadr(var143) : $ic94$;
        final SubLObject var145 = cdestructuring_bind.property_list_member((SubLObject)$ic95$, var127);
        final SubLObject var146 = (SubLObject)((NIL != var145) ? conses_high.cadr(var145) : $ic96$);
        final SubLObject var147 = cdestructuring_bind.property_list_member((SubLObject)$ic97$, var127);
        final SubLObject var148 = (SubLObject)((NIL != var147) ? conses_high.cadr(var147) : TWENTY_INTEGER);
        if (NIL != var138) {
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019(var138);
            module0642.f39019((SubLObject)$ic98$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40019(SubLObject var125, SubLObject var3) {
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var126 = SubLProcess.currentSubLThread();
        final SubLObject var128;
        final SubLObject var127 = var128 = var3;
        SubLObject var129 = (SubLObject)NIL;
        SubLObject var130 = var128;
        SubLObject var131 = (SubLObject)NIL;
        SubLObject var155_156 = (SubLObject)NIL;
        while (NIL != var130) {
            cdestructuring_bind.destructuring_bind_must_consp(var130, var127, (SubLObject)$ic99$);
            var155_156 = var130.first();
            var130 = var130.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var130, var127, (SubLObject)$ic99$);
            if (NIL == conses_high.member(var155_156, (SubLObject)$ic100$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var131 = (SubLObject)T;
            }
            if (var155_156 == $ic85$) {
                var129 = var130.first();
            }
            var130 = var130.rest();
        }
        if (NIL != var131 && NIL == var129) {
            cdestructuring_bind.cdestructuring_bind_error(var127, (SubLObject)$ic99$);
        }
        final SubLObject var132 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var128);
        final SubLObject var133 = (NIL != var132) ? conses_high.cadr(var132) : $g5185$.getGlobalValue();
        final SubLObject var134 = cdestructuring_bind.property_list_member((SubLObject)$ic86$, var128);
        final SubLObject var135 = (SubLObject)((NIL != var134) ? conses_high.cadr(var134) : $ic7$);
        final SubLObject var136 = cdestructuring_bind.property_list_member((SubLObject)$ic87$, var128);
        final SubLObject var137 = (SubLObject)((NIL != var136) ? conses_high.cadr(var136) : NIL);
        final SubLObject var138 = cdestructuring_bind.property_list_member((SubLObject)$ic88$, var128);
        final SubLObject var139 = (SubLObject)((NIL != var138) ? conses_high.cadr(var138) : $ic89$);
        final SubLObject var140 = cdestructuring_bind.property_list_member((SubLObject)$ic90$, var128);
        final SubLObject var141 = (SubLObject)((NIL != var140) ? conses_high.cadr(var140) : $ic91$);
        final SubLObject var142 = cdestructuring_bind.property_list_member((SubLObject)$ic92$, var128);
        final SubLObject var143 = (SubLObject)((NIL != var142) ? conses_high.cadr(var142) : NIL);
        final SubLObject var144 = cdestructuring_bind.property_list_member((SubLObject)$ic95$, var128);
        final SubLObject var145 = (SubLObject)((NIL != var144) ? conses_high.cadr(var144) : $ic96$);
        final SubLObject var146 = cdestructuring_bind.property_list_member((SubLObject)$ic97$, var128);
        final SubLObject var147 = (SubLObject)((NIL != var146) ? conses_high.cadr(var146) : TWENTY_INTEGER);
        final SubLObject var148 = cdestructuring_bind.property_list_member((SubLObject)$ic101$, var128);
        final SubLObject var149 = (SubLObject)((NIL != var148) ? conses_high.cadr(var148) : $ic102$);
        assert NIL != Types.stringp(var133) : var133;
        assert NIL != module0004.f105(var145) : var145;
        assert NIL != module0004.f105(var147) : var147;
        if (NIL != var135 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var135)) {
            throw new AssertionError(var135);
        }
        final SubLObject var150 = var137;
        assert NIL != module0035.f2015(var150) : var150;
        SubLObject var151 = var150;
        SubLObject var152 = (SubLObject)NIL;
        var152 = var151.first();
        while (NIL != var151) {
            assert NIL != constant_handles_oc.f8449(var152) : var152;
            var151 = var151.rest();
            var152 = var151.first();
        }
        if (NIL != var139 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var139)) {
            throw new AssertionError(var139);
        }
        if (NIL != var143 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var143)) {
            throw new AssertionError(var143);
        }
        if (NIL != var141 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var141)) {
            throw new AssertionError(var141);
        }
        if (NIL != var149 && !areAssertionsDisabledFor(me) && NIL == Types.keywordp(var149)) {
            throw new AssertionError(var149);
        }
        if (NIL != var135 || NIL != var139 || NIL != var143 || NIL != var141) {
            if (NIL != var135) {
                module0666.f40467(var133, var135, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, var137);
                module0642.f39032((SubLObject)ONE_INTEGER);
            }
            if (NIL != var139) {
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019(var139);
                module0642.f39019((SubLObject)$ic98$);
                module0642.f39020(module0015.$g235$.getGlobalValue());
            }
            if (NIL != var143 && NIL != module0655.$g5105$.getDynamicValue(var126)) {
                module0642.f39032((SubLObject)ONE_INTEGER);
                module0666.f40470(var133, var143);
            }
            if (NIL != var141) {
                module0642.f39032((SubLObject)FOUR_INTEGER);
                module0644.f39184(var133, var141);
            }
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g336$.getGlobalValue());
        module0642.f39020(module0015.$g338$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var133);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var145) {
            module0642.f39020(module0015.$g340$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var145);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var133) {
            module0642.f39020(module0015.$g341$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var133);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var147) {
            module0642.f39020(module0015.$g339$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var147);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var153 = module0015.$g533$.currentBinding(var126);
        try {
            module0015.$g533$.bind((SubLObject)T, var126);
            if (NIL != var125) {
                f40020(var125, var149);
            }
        }
        finally {
            module0015.$g533$.rebind(var153, var126);
        }
        module0642.f39020(module0015.$g337$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        f40021(var133, var145, var149, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40020(final SubLObject var125, final SubLObject var166) {
        final SubLThread var167 = SubLProcess.currentSubLThread();
        module0194.f12114(module0205.f13147(var125, (SubLObject)$ic109$, (SubLObject)$ic110$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0015.$g131$.getDynamicValue(var167), (SubLObject)ZERO_INTEGER);
        return var125;
    }
    
    public static SubLObject f40021(final SubLObject var7, final SubLObject var147, SubLObject var166, SubLObject var170) {
        if (var166 == UNPROVIDED) {
            var166 = (SubLObject)$ic102$;
        }
        if (var170 == UNPROVIDED) {
            var170 = Time.get_universal_time();
        }
        final SubLThread var171 = SubLProcess.currentSubLThread();
        if (NIL != f40016()) {
            final SubLObject var172 = (SubLObject)((var166 == $ic108$) ? $ic111$ : $ic112$);
            PrintLow.format(module0015.$g131$.getDynamicValue(var171), (SubLObject)$ic113$, new SubLObject[] { var7, var147, var170, var172 });
            module0642.f39029((SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40022(final SubLObject var74, SubLObject var76) {
        if (var76 == UNPROVIDED) {
            var76 = (SubLObject)NIL;
        }
        final SubLThread var77 = SubLProcess.currentSubLThread();
        final SubLObject var79;
        final SubLObject var78 = var79 = var76;
        SubLObject var80 = (SubLObject)NIL;
        SubLObject var81 = var79;
        SubLObject var82 = (SubLObject)NIL;
        SubLObject var177_178 = (SubLObject)NIL;
        while (NIL != var81) {
            cdestructuring_bind.destructuring_bind_must_consp(var81, var78, (SubLObject)$ic114$);
            var177_178 = var81.first();
            var81 = var81.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var81, var78, (SubLObject)$ic114$);
            if (NIL == conses_high.member(var177_178, (SubLObject)$ic115$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var82 = (SubLObject)T;
            }
            if (var177_178 == $ic85$) {
                var80 = var81.first();
            }
            var81 = var81.rest();
        }
        if (NIL != var82 && NIL == var80) {
            cdestructuring_bind.cdestructuring_bind_error(var78, (SubLObject)$ic114$);
        }
        final SubLObject var83 = cdestructuring_bind.property_list_member((SubLObject)$ic116$, var79);
        final SubLObject var84 = (SubLObject)((NIL != var83) ? conses_high.cadr(var83) : T);
        final SubLObject var85 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var79);
        final SubLObject var86 = (NIL != var85) ? conses_high.cadr(var85) : $g5185$.getGlobalValue();
        final SubLObject var87 = cdestructuring_bind.property_list_member((SubLObject)$ic117$, var79);
        final SubLObject var88 = (SubLObject)((NIL != var87) ? conses_high.cadr(var87) : T);
        SubLObject var89 = module0642.f39104(var86, var74);
        if (NIL == var89) {
            final SubLObject var90 = (SubLObject)((NIL != var84) ? f40023((SubLObject)$ic51$) : NIL);
            return Values.values((SubLObject)NIL, var90);
        }
        if (NIL != var88) {
            var89 = module0038.f2933(var89);
        }
        var77.resetMultipleValues();
        final SubLObject var91 = f40024(f40025(var89), var84);
        final SubLObject var92 = var77.secondMultipleValue();
        var77.resetMultipleValues();
        if (NIL != var92) {
            return Values.values((SubLObject)NIL, var92, var89);
        }
        return Values.values(var91, (SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f40026(final SubLObject var186, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var186) : var186;
        final SubLObject var187 = reader.read_from_string_ignoring_errors(var186, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == module0202.f12590(var187)) {
            module0656.f39789((SubLObject)$ic120$, var186, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        if (NIL != var2 && NIL == module0274.f18110(var187, var2, (SubLObject)UNPROVIDED)) {
            module0674.f41156(var187, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        return var187;
    }
    
    public static SubLObject f40024(SubLObject var184, final SubLObject var180) {
        final SubLThread var185 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var184) : var184;
        var184 = module0038.f2735(var184);
        if (NIL != module0038.f2608(var184)) {
            final SubLObject var186 = (SubLObject)((NIL != var180) ? f40023((SubLObject)$ic51$) : NIL);
            return Values.values((SubLObject)NIL, var186);
        }
        if (NIL != f40027(var184)) {
            return Values.values((SubLObject)NIL, f40023((SubLObject)$ic121$));
        }
        var185.resetMultipleValues();
        SubLObject var187 = reader.read_from_string_ignoring_errors(var184, (SubLObject)NIL, (SubLObject)$ic122$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var188 = var185.secondMultipleValue();
        var185.resetMultipleValues();
        var187 = f40028(var187);
        if ($ic122$ == var187) {
            if (NIL == module0038.f2873(var184, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return Values.values((SubLObject)NIL, f40023((SubLObject)$ic123$));
            }
            return Values.values((SubLObject)NIL, f40023((SubLObject)$ic122$));
        }
        else {
            if ($ic124$ == var188) {
                return Values.values((SubLObject)NIL, f40023((SubLObject)$ic125$));
            }
            if (NIL != module0205.f13183(var187, (SubLObject)$ic126$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return Values.values((SubLObject)NIL, f40023((SubLObject)$ic127$));
            }
            if (NIL == module0207.f13509(var187)) {
                return Values.values((SubLObject)NIL, f40023((SubLObject)$ic128$));
            }
            return Values.values(var187, (SubLObject)NIL);
        }
    }
    
    public static SubLObject f40028(SubLObject var189) {
        SubLObject var190 = module0205.f13183(var189, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var191 = (SubLObject)NIL;
        var191 = var190.first();
        while (NIL != var190) {
            final SubLObject var192 = module0209.f13561(var191);
            if (!var192.equal(var191)) {
                var189 = module0205.f13251(var192, var191, var189, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            var190 = var190.rest();
            var191 = var190.first();
        }
        return var189;
    }
    
    public static SubLObject f40029(final SubLObject var186) {
        final SubLObject var187 = module0038.f2738(var186, (SubLObject)$ic129$, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var188 = (SubLObject)NIL;
        SubLObject var189 = (SubLObject)NIL;
        SubLObject var190 = var187;
        SubLObject var191 = (SubLObject)NIL;
        var191 = var190.first();
        while (NIL != var190) {
            if (NIL != var188) {
                if (var191.equal((SubLObject)$ic130$)) {
                    var188 = (SubLObject)NIL;
                }
            }
            else if (var191.equal((SubLObject)$ic130$)) {
                var188 = (SubLObject)T;
            }
            else {
                var189 = ConsesLow.append(var189, module0038.f2935(var191, (SubLObject)T));
            }
            var190 = var190.rest();
            var191 = var190.first();
        }
        return var189;
    }
    
    public static SubLObject f40025(final SubLObject var195) {
        SubLObject var196 = module0038.f2659((SubLObject)$ic0$, Strings.make_string((SubLObject)ONE_INTEGER, (SubLObject)Characters.CHAR_return), var195, (SubLObject)UNPROVIDED);
        var196 = module0038.f2823(var196);
        return var196;
    }
    
    public static SubLObject f40027(final SubLObject var186) {
        return module0035.sublisp_boolean(f40029(var186));
    }
    
    public static SubLObject f40030(final SubLObject var112) {
        return (SubLObject)makeBoolean(NIL != module0035.f2014(var112) && NIL != module0035.f1995(var112, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && $ic131$ == var112.first());
    }
    
    public static SubLObject f40031(final SubLObject var185, SubLObject var184, SubLObject var197) {
        if (var184 == UNPROVIDED) {
            var184 = (SubLObject)NIL;
        }
        if (var197 == UNPROVIDED) {
            var197 = (SubLObject)NIL;
        }
        assert NIL != f40030(var185) : var185;
        if (NIL != var184 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var184)) {
            throw new AssertionError(var184);
        }
        final SubLObject var199;
        final SubLObject var198 = var199 = var197;
        final SubLObject var200 = cdestructuring_bind.property_list_member((SubLObject)$ic133$, var199);
        final SubLObject var201 = (SubLObject)((NIL != var200) ? conses_high.cadr(var200) : NIL);
        if (NIL != var201 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var201)) {
            throw new AssertionError(var201);
        }
        SubLObject var202 = (SubLObject)NIL;
        SubLObject var203 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var185, var185, (SubLObject)$ic134$);
        var202 = var185.first();
        SubLObject var204_205 = var185.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var204_205, var185, (SubLObject)$ic134$);
        var203 = var204_205.first();
        var204_205 = var204_205.rest();
        if (NIL == var204_205) {
            final SubLObject var204 = var203;
            if (var204.eql((SubLObject)$ic51$)) {
                SubLObject var205 = (SubLObject)NIL;
                if (NIL != var201) {
                    var205 = Sequences.cconcatenate((SubLObject)$ic135$, new SubLObject[] { var201, $ic136$ });
                }
                else {
                    var205 = (SubLObject)$ic137$;
                }
                module0656.f39789((SubLObject)$ic138$, var205, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var204.eql((SubLObject)$ic121$)) {
                SubLObject var205 = (SubLObject)NIL;
                if (NIL != var201) {
                    var205 = Sequences.cconcatenate((SubLObject)$ic139$, var201);
                }
                else {
                    var205 = (SubLObject)$ic140$;
                }
                f40032(var205, (SubLObject)$ic141$, var184);
            }
            else if (var204.eql((SubLObject)$ic123$)) {
                SubLObject var205 = (SubLObject)NIL;
                if (NIL != var201) {
                    var205 = Sequences.cconcatenate((SubLObject)$ic142$, var201);
                }
                else {
                    var205 = (SubLObject)$ic143$;
                }
                f40032(var205, (SubLObject)$ic144$, var184);
            }
            else if (var204.eql((SubLObject)$ic122$)) {
                SubLObject var205 = (SubLObject)NIL;
                if (NIL != var201) {
                    var205 = Sequences.cconcatenate((SubLObject)$ic145$, var201);
                }
                else {
                    var205 = (SubLObject)$ic146$;
                }
                f40032(var205, (SubLObject)$ic147$, var184);
            }
            else if (var204.eql((SubLObject)$ic125$)) {
                SubLObject var205 = (SubLObject)NIL;
                if (NIL != var201) {
                    var205 = Sequences.cconcatenate((SubLObject)$ic148$, var201);
                }
                else {
                    var205 = (SubLObject)$ic149$;
                }
                f40032(var205, (SubLObject)$ic150$, var184);
            }
            else if (var204.eql((SubLObject)$ic127$)) {
                SubLObject var205 = (SubLObject)NIL;
                if (NIL != var201) {
                    var205 = Sequences.cconcatenate((SubLObject)$ic139$, var201);
                }
                else {
                    var205 = (SubLObject)$ic140$;
                }
                f40032(var205, (SubLObject)$ic151$, var184);
            }
            else if (var204.eql((SubLObject)$ic128$)) {
                SubLObject var205 = (SubLObject)NIL;
                if (NIL != var201) {
                    var205 = Sequences.cconcatenate((SubLObject)$ic152$, var201);
                }
                else {
                    var205 = (SubLObject)$ic153$;
                }
                f40032(var205, (SubLObject)$ic154$, var184);
            }
            else {
                module0656.f39789((SubLObject)$ic138$, var203, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var185, (SubLObject)$ic134$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40023(final SubLObject var116) {
        return (SubLObject)ConsesLow.list((SubLObject)$ic131$, var116);
    }
    
    public static SubLObject f40032(final SubLObject var208, final SubLObject var209, final SubLObject var207) {
        final SubLThread var210 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)$ic155$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019(var208);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var211 = module0015.$g132$.getDynamicValue(var210);
        final SubLObject var212 = module0015.$g535$.currentBinding(var210);
        try {
            module0015.$g535$.bind((SubLObject)T, var210);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (NIL != var211) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(var211));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var6_211 = module0015.$g533$.currentBinding(var210);
            try {
                module0015.$g533$.bind((SubLObject)T, var210);
                module0642.f39020(module0015.$g189$.getGlobalValue());
                module0642.f39020((SubLObject)TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0642.f39019(var208);
                module0642.f39020(module0015.$g190$.getGlobalValue());
                module0642.f39020((SubLObject)TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                Functions.funcall(var209, var207);
                module0656.f39790((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var6_211, var210);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var212, var210);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40033(SubLObject var212, SubLObject var3) {
        if (var212 == UNPROVIDED) {
            var212 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var213 = SubLProcess.currentSubLThread();
        final SubLObject var215;
        final SubLObject var214 = var215 = var3;
        final SubLObject var216 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var215);
        final SubLObject var217 = (NIL != var216) ? conses_high.cadr(var216) : $g5186$.getGlobalValue();
        final SubLObject var218 = cdestructuring_bind.property_list_member((SubLObject)$ic86$, var215);
        final SubLObject var219 = (SubLObject)((NIL != var218) ? conses_high.cadr(var218) : $ic7$);
        final SubLObject var220 = cdestructuring_bind.property_list_member((SubLObject)$ic88$, var215);
        final SubLObject var221 = (SubLObject)((NIL != var220) ? conses_high.cadr(var220) : NIL);
        final SubLObject var222 = cdestructuring_bind.property_list_member((SubLObject)$ic90$, var215);
        final SubLObject var223 = (SubLObject)((NIL != var222) ? conses_high.cadr(var222) : $ic157$);
        final SubLObject var224 = cdestructuring_bind.property_list_member((SubLObject)$ic92$, var215);
        final SubLObject var225 = (SubLObject)((NIL != var224) ? conses_high.cadr(var224) : NIL);
        assert NIL != Types.stringp(var217) : var217;
        if (NIL != var219 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var219)) {
            throw new AssertionError(var219);
        }
        if (NIL != var221 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var221)) {
            throw new AssertionError(var221);
        }
        if (NIL != var225 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var225)) {
            throw new AssertionError(var225);
        }
        if (NIL != var223 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var223)) {
            throw new AssertionError(var223);
        }
        if (NIL == var219 && NIL == var221 && NIL == var225 && NIL == var223) {
            return f40034(var212, var3);
        }
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
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var226 = module0015.$g533$.currentBinding(var213);
        try {
            module0015.$g533$.bind((SubLObject)T, var213);
            if ((NIL != var225 && NIL != module0655.$g5105$.getDynamicValue(var213)) || NIL != var223) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var6_220 = module0015.$g533$.currentBinding(var213);
                try {
                    module0015.$g533$.bind((SubLObject)T, var213);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g371$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)TWO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var6_221 = module0015.$g533$.currentBinding(var213);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var213);
                        if (NIL != var225 && NIL != module0655.$g5105$.getDynamicValue(var213)) {
                            module0666.f40470(var217, var225);
                        }
                        if (NIL != var223) {
                            module0642.f39032((SubLObject)ONE_INTEGER);
                            module0644.f39184(var217, var223);
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var6_221, var213);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var6_220, var213);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var6_222 = module0015.$g533$.currentBinding(var213);
            try {
                module0015.$g533$.bind((SubLObject)T, var213);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var6_223 = module0015.$g533$.currentBinding(var213);
                try {
                    module0015.$g533$.bind((SubLObject)T, var213);
                    if (NIL != var221) {
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019(var221);
                        module0642.f39019((SubLObject)$ic98$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                    }
                }
                finally {
                    module0015.$g533$.rebind(var6_223, var213);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var6_224 = module0015.$g533$.currentBinding(var213);
                try {
                    module0015.$g533$.bind((SubLObject)T, var213);
                    f40034(var212, var3);
                }
                finally {
                    module0015.$g533$.rebind(var6_224, var213);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var6_222, var213);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var226, var213);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40034(SubLObject var212, SubLObject var3) {
        if (var212 == UNPROVIDED) {
            var212 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var213 = SubLProcess.currentSubLThread();
        final SubLObject var215;
        final SubLObject var214 = var215 = var3;
        final SubLObject var216 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var215);
        final SubLObject var217 = (NIL != var216) ? conses_high.cadr(var216) : $g5186$.getGlobalValue();
        final SubLObject var218 = cdestructuring_bind.property_list_member((SubLObject)$ic158$, var215);
        final SubLObject var219 = (SubLObject)((NIL != var218) ? conses_high.cadr(var218) : NIL);
        final SubLObject var220 = cdestructuring_bind.property_list_member((SubLObject)$ic95$, var215);
        final SubLObject var221 = (SubLObject)((NIL != var220) ? conses_high.cadr(var220) : $ic159$);
        final SubLObject var222 = cdestructuring_bind.property_list_member((SubLObject)$ic97$, var215);
        final SubLObject var223 = (SubLObject)((NIL != var222) ? conses_high.cadr(var222) : ONE_INTEGER);
        assert NIL != Types.stringp(var217) : var217;
        assert NIL != module0004.f105(var221) : var221;
        assert NIL != module0004.f105(var223) : var223;
        final SubLObject var225;
        final SubLObject var224 = var225 = module0038.f2624(module0015.f793((SubLObject)UNPROVIDED));
        final SubLObject var226 = Sequences.cconcatenate((SubLObject)$ic160$, var224);
        final SubLObject var227 = Sequences.cconcatenate((SubLObject)$ic161$, var224);
        final SubLObject var228 = Sequences.cconcatenate((SubLObject)$ic162$, new SubLObject[] { module0006.f203(var221), $ic163$ });
        final SubLObject var229 = Sequences.cconcatenate((SubLObject)$ic162$, new SubLObject[] { module0006.f203(var221), $ic164$ });
        final SubLObject var230 = (SubLObject)((NIL != var212) ? module0194.f12113(var212, (SubLObject)ZERO_INTEGER) : $ic0$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        if (NIL != var225) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var225);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g158$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic165$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g147$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var228);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var231 = module0015.$g533$.currentBinding(var213);
        try {
            module0015.$g533$.bind((SubLObject)T, var213);
            if (var223.numG((SubLObject)ONE_INTEGER)) {
                module0642.f39020(module0015.$g336$.getGlobalValue());
                module0642.f39020(module0015.$g338$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var217);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var227) {
                    module0642.f39020(module0015.$g341$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var227);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                if (NIL != var223) {
                    module0642.f39020(module0015.$g339$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var223);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                if (NIL != var229) {
                    module0642.f39020(module0015.$g342$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var229);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var6_239 = module0015.$g533$.currentBinding(var213);
                try {
                    module0015.$g533$.bind((SubLObject)T, var213);
                    if (NIL != var212) {
                        module0642.f39019(var230);
                    }
                }
                finally {
                    module0015.$g533$.rebind(var6_239, var213);
                }
                module0642.f39020(module0015.$g337$.getGlobalValue());
            }
            else {
                module0642.f39020(module0015.$g295$.getGlobalValue());
                module0642.f39020(module0015.$g305$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g317$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g306$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var229);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var227) {
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var227);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                if (NIL != var217) {
                    module0642.f39020(module0015.$g302$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var217);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                if (NIL != var230) {
                    module0642.f39020(module0015.$g307$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39019(var230);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g144$.getGlobalValue());
            if (NIL != var226) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var226);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g158$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic166$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var6_240 = module0015.$g533$.currentBinding(var213);
            try {
                module0015.$g533$.bind((SubLObject)T, var213);
            }
            finally {
                module0015.$g533$.rebind(var6_240, var213);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var231, var213);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0666.f40486(var227, var226, (SubLObject)TWENTY_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)NIL, var219);
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40035(final SubLObject var74, SubLObject var76) {
        if (var76 == UNPROVIDED) {
            var76 = (SubLObject)NIL;
        }
        final SubLThread var77 = SubLProcess.currentSubLThread();
        final SubLObject var79;
        final SubLObject var78 = var79 = var76;
        SubLObject var80 = (SubLObject)NIL;
        SubLObject var81 = var79;
        SubLObject var82 = (SubLObject)NIL;
        SubLObject var246_247 = (SubLObject)NIL;
        while (NIL != var81) {
            cdestructuring_bind.destructuring_bind_must_consp(var81, var78, (SubLObject)$ic167$);
            var246_247 = var81.first();
            var81 = var81.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var81, var78, (SubLObject)$ic167$);
            if (NIL == conses_high.member(var246_247, (SubLObject)$ic115$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var82 = (SubLObject)T;
            }
            if (var246_247 == $ic85$) {
                var80 = var81.first();
            }
            var81 = var81.rest();
        }
        if (NIL != var82 && NIL == var80) {
            cdestructuring_bind.cdestructuring_bind_error(var78, (SubLObject)$ic167$);
        }
        final SubLObject var83 = cdestructuring_bind.property_list_member((SubLObject)$ic116$, var79);
        final SubLObject var84 = (SubLObject)((NIL != var83) ? conses_high.cadr(var83) : T);
        final SubLObject var85 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var79);
        final SubLObject var86 = (NIL != var85) ? conses_high.cadr(var85) : $g5186$.getGlobalValue();
        final SubLObject var87 = cdestructuring_bind.property_list_member((SubLObject)$ic117$, var79);
        final SubLObject var88 = (SubLObject)((NIL != var87) ? conses_high.cadr(var87) : T);
        SubLObject var89 = module0642.f39104(var86, var74);
        if (NIL == var89) {
            final SubLObject var90 = (SubLObject)((NIL != var84) ? f40036((SubLObject)$ic51$) : NIL);
            return Values.values((SubLObject)NIL, var90);
        }
        if (NIL != var88) {
            var89 = module0038.f2933(var89);
        }
        var77.resetMultipleValues();
        final SubLObject var91 = f40037(f40025(var89), var84);
        final SubLObject var92 = var77.secondMultipleValue();
        var77.resetMultipleValues();
        if (NIL != var92) {
            return Values.values((SubLObject)NIL, var92, var89);
        }
        return Values.values(var91, (SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f40037(SubLObject var251, final SubLObject var180) {
        final SubLThread var252 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var251) : var251;
        var251 = module0038.f2735(var251);
        if (NIL != module0038.f2608(var251)) {
            final SubLObject var253 = (SubLObject)((NIL != var180) ? f40036((SubLObject)$ic51$) : NIL);
            return Values.values((SubLObject)NIL, var253);
        }
        if (NIL != f40027(var251)) {
            return Values.values((SubLObject)NIL, f40036((SubLObject)$ic121$));
        }
        var252.resetMultipleValues();
        final SubLObject var254 = reader.read_from_string_ignoring_errors(var251, (SubLObject)NIL, (SubLObject)$ic122$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var255 = var252.secondMultipleValue();
        var252.resetMultipleValues();
        if ($ic122$ == var254) {
            if (NIL == module0038.f2873(var251, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return Values.values((SubLObject)NIL, f40036((SubLObject)$ic123$));
            }
            return Values.values((SubLObject)NIL, f40036((SubLObject)$ic122$));
        }
        else {
            if ($ic124$ == var255) {
                return Values.values((SubLObject)NIL, f40036((SubLObject)$ic125$));
            }
            if (NIL != module0205.f13183(var254, (SubLObject)$ic126$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return Values.values((SubLObject)NIL, f40036((SubLObject)$ic127$));
            }
            return Values.values(var254, (SubLObject)NIL);
        }
    }
    
    public static SubLObject f40038(final SubLObject var112) {
        return (SubLObject)makeBoolean(NIL != module0035.f2014(var112) && NIL != module0035.f1995(var112, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && $ic168$ == var112.first());
    }
    
    public static SubLObject f40039(final SubLObject var252, SubLObject var251, SubLObject var197) {
        if (var251 == UNPROVIDED) {
            var251 = (SubLObject)NIL;
        }
        if (var197 == UNPROVIDED) {
            var197 = (SubLObject)NIL;
        }
        assert NIL != f40038(var252) : var252;
        if (NIL != var251 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var251)) {
            throw new AssertionError(var251);
        }
        final SubLObject var254;
        final SubLObject var253 = var254 = var197;
        final SubLObject var255 = cdestructuring_bind.property_list_member((SubLObject)$ic133$, var254);
        final SubLObject var256 = (SubLObject)((NIL != var255) ? conses_high.cadr(var255) : NIL);
        if (NIL != var256 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var256)) {
            throw new AssertionError(var256);
        }
        SubLObject var257 = (SubLObject)NIL;
        SubLObject var258 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var252, var252, (SubLObject)$ic170$);
        var257 = var252.first();
        SubLObject var258_259 = var252.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var258_259, var252, (SubLObject)$ic170$);
        var258 = var258_259.first();
        var258_259 = var258_259.rest();
        if (NIL == var258_259) {
            final SubLObject var259 = var258;
            if (var259.eql((SubLObject)$ic51$)) {
                SubLObject var260 = (SubLObject)NIL;
                if (NIL != var256) {
                    var260 = Sequences.cconcatenate((SubLObject)$ic171$, new SubLObject[] { var256, $ic136$ });
                }
                else {
                    var260 = (SubLObject)$ic172$;
                }
                module0656.f39789((SubLObject)$ic138$, var260, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var259.eql((SubLObject)$ic121$)) {
                SubLObject var260 = (SubLObject)NIL;
                if (NIL != var256) {
                    var260 = Sequences.cconcatenate((SubLObject)$ic139$, var256);
                }
                else {
                    var260 = (SubLObject)$ic140$;
                }
                f40040(var260, (SubLObject)$ic141$, var251);
            }
            else if (var259.eql((SubLObject)$ic123$)) {
                SubLObject var260 = (SubLObject)NIL;
                if (NIL != var256) {
                    var260 = Sequences.cconcatenate((SubLObject)$ic142$, var256);
                }
                else {
                    var260 = (SubLObject)$ic143$;
                }
                f40040(var260, (SubLObject)$ic144$, var251);
            }
            else if (var259.eql((SubLObject)$ic122$)) {
                SubLObject var260 = (SubLObject)NIL;
                if (NIL != var256) {
                    var260 = Sequences.cconcatenate((SubLObject)$ic173$, var256);
                }
                else {
                    var260 = (SubLObject)$ic174$;
                }
                f40040(var260, (SubLObject)$ic147$, var251);
            }
            else if (var259.eql((SubLObject)$ic125$)) {
                SubLObject var260 = (SubLObject)NIL;
                if (NIL != var256) {
                    var260 = Sequences.cconcatenate((SubLObject)$ic175$, var256);
                }
                else {
                    var260 = (SubLObject)$ic176$;
                }
                f40040(var260, (SubLObject)$ic150$, var251);
            }
            else if (var259.eql((SubLObject)$ic127$)) {
                SubLObject var260 = (SubLObject)NIL;
                if (NIL != var256) {
                    var260 = Sequences.cconcatenate((SubLObject)$ic139$, var256);
                }
                else {
                    var260 = (SubLObject)$ic140$;
                }
                f40040(var260, (SubLObject)$ic151$, var251);
            }
            else {
                module0656.f39789((SubLObject)$ic138$, var258, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var252, (SubLObject)$ic170$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40036(final SubLObject var116) {
        return (SubLObject)ConsesLow.list((SubLObject)$ic168$, var116);
    }
    
    public static SubLObject f40040(final SubLObject var208, final SubLObject var209, final SubLObject var207) {
        final SubLThread var210 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)$ic155$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019(var208);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var211 = module0015.$g132$.getDynamicValue(var210);
        final SubLObject var212 = module0015.$g535$.currentBinding(var210);
        try {
            module0015.$g535$.bind((SubLObject)T, var210);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (NIL != var211) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(var211));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var6_261 = module0015.$g533$.currentBinding(var210);
            try {
                module0015.$g533$.bind((SubLObject)T, var210);
                module0642.f39020(module0015.$g189$.getGlobalValue());
                module0642.f39020((SubLObject)TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0642.f39019(var208);
                module0642.f39020(module0015.$g190$.getGlobalValue());
                module0642.f39020((SubLObject)TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                Functions.funcall(var209, var207);
                module0656.f39790((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var6_261, var210);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var212, var210);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40041() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f39991", "S#43994", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f39992", "S#43995", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f39996", "S#43996", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f39995", "S#43997", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f39993", "S#43998", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f39997", "S#43999", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f39998", "S#44000", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f39994", "S#44001", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40001", "S#44002", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f39999", "S#44003", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40002", "S#44004", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40000", "S#44005", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40003", "S#44006", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40004", "S#44007", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40006", "S#44008", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40007", "S#44009", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40012", "S#44010", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40013", "S#44011", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40005", "S#44012", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40014", "S#44013", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40009", "S#44014", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40010", "S#44015", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40011", "S#44016", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40008", "S#44017", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40015", "S#44018", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40016", "S#44019", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40017", "S#44020", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40018", "S#44021", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40019", "S#44022", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40020", "S#44023", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40021", "S#44024", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40022", "S#44025", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40026", "S#44026", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40024", "S#44027", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40028", "S#44028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40029", "S#44029", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40025", "S#44030", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40027", "S#44031", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40030", "S#44032", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40031", "S#44033", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40023", "S#44034", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40032", "S#44035", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40033", "S#44036", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40034", "S#44037", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40035", "S#44038", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40037", "S#44039", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40038", "S#44040", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40039", "S#44041", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40036", "S#44042", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0657", "f40040", "S#44043", 3, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40042() {
        $g5184$ = SubLFiles.deflexical("S#44044", (SubLObject)$ic1$);
        $g5185$ = SubLFiles.deflexical("S#44045", (SubLObject)$ic82$);
        $g5186$ = SubLFiles.deflexical("S#44046", (SubLObject)$ic156$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40043() {
        module0002.f35((SubLObject)$ic118$, (SubLObject)$ic119$);
        module0027.f1449((SubLObject)$ic177$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic178$, EQUAL, $ic179$, NIL, $ic180$, NIL, $ic181$, $ic182$, $ic183$, T }), (SubLObject)$ic184$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f40041();
    }
    
    public void initializeVariables() {
        f40042();
    }
    
    public void runTopLevelForms() {
        f40043();
    }
    
    static {
        me = (SubLFile)new module0657();
        $g5184$ = null;
        $g5185$ = null;
        $g5186$ = null;
        $ic0$ = makeString("");
        $ic1$ = makeString("mt");
        $ic2$ = makeSymbol("STRINGP");
        $ic3$ = makeString("~A-monad-dimension-specified");
        $ic4$ = makeKeyword("EDIT-ALLOWED?");
        $ic5$ = makeKeyword("INPUT-NAME");
        $ic6$ = makeKeyword("MONAD-CHOICES");
        $ic7$ = makeString("Complete");
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("Microtheory"));
        $ic9$ = makeString("Mt : ");
        $ic10$ = makeString("Clear Mt");
        $ic11$ = makeKeyword("TOP");
        $ic12$ = makeString("t");
        $ic13$ = makeKeyword("LEFT");
        $ic14$ = makeString("Monad Dimension");
        $ic15$ = makeKeyword("RIGHT");
        $ic16$ = makeString("Monad Mt : ");
        $ic17$ = makeString("autocomplete-");
        $ic18$ = makeString("input-");
        $ic19$ = makeString("autocomplete-results-");
        $ic20$ = makeString("yui-ac");
        $ic21$ = makeString("position:static");
        $ic22$ = makeString("yui-ac-input");
        $ic23$ = makeString("yui-ac-container");
        $ic24$ = makeString("~A-monad");
        $ic25$ = makeString("~A-time-dimension-specified");
        $ic26$ = makeKeyword("ANYTIME-PSC-ALLOWED?");
        $ic27$ = makeString("na");
        $ic28$ = makeString("Time Dimension");
        $ic29$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Always-TimeInterval")), constant_handles_oc.f8479((SubLObject)makeString("Now")), constant_handles_oc.f8479((SubLObject)makeString("Now-Indexical")));
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("TimeInterval"));
        $ic31$ = makeString("Time ");
        $ic32$ = makeString("Interval : ");
        $ic33$ = makeString("Clear Interval");
        $ic34$ = makeString("~A-time-interval");
        $ic35$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Null-TimeParameter")), constant_handles_oc.f8479((SubLObject)makeString("TimePoint")));
        $ic36$ = constant_handles_oc.f8479((SubLObject)makeString("TimeParameter"));
        $ic37$ = makeString("Parameter : ");
        $ic38$ = makeString("Clear Parameter");
        $ic39$ = makeString("~A-time-parameter");
        $ic40$ = makeKeyword("ALLOW-VARIABLE?");
        $ic41$ = makeKeyword("UNINITIALIZED");
        $ic42$ = constant_handles_oc.f8479((SubLObject)makeString("AnytimePSC"));
        $ic43$ = makeKeyword("MONAD-MT");
        $ic44$ = makeKeyword("TIME-MT");
        $ic45$ = makeKeyword("TIME-INTERVAL");
        $ic46$ = makeKeyword("TIME-PARAMETER");
        $ic47$ = makeKeyword("MT-ERROR");
        $ic48$ = ConsesLow.list((SubLObject)makeSymbol("S#44047", "CYC"), (SubLObject)makeSymbol("S#44048", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#44049", "CYC"));
        $ic49$ = makeKeyword("WHOLLY-UNSPECIFIED");
        $ic50$ = makeString("No microtheory was specified.");
        $ic51$ = makeKeyword("UNSPECIFIED");
        $ic52$ = makeString("No monadic microtheory was specified.");
        $ic53$ = makeString("No microtheory time dimension was specified.");
        $ic54$ = makeString("No microtheory time interval was specified.");
        $ic55$ = makeString("No microtheory time parameter was specified.");
        $ic56$ = makeString("The MT part ~A was not specified.");
        $ic57$ = makeKeyword("UNINTELLIGIBLE");
        $ic58$ = makeString("The string ~S did not make sense as a microtheory.");
        $ic59$ = makeString("The string ~S did not make sense as a microtheory time dimension.");
        $ic60$ = makeString("The string ~S did not make sense as a time interval.");
        $ic61$ = makeString("The string ~S did not make sense as a time parameter.");
        $ic62$ = makeString("The string ~S did not make sense for MT part ~A.");
        $ic63$ = makeKeyword("UNMATCHED-PAREN");
        $ic64$ = makeString("Unmatched Parentheses in microtheory ~S.");
        $ic65$ = makeString("Unmatched Parentheses in microtheory time dimension ~S.");
        $ic66$ = makeString("Unmatched Parentheses in time interval ~S.");
        $ic67$ = makeString("Unmatched Parentheses in time parameter ~S.");
        $ic68$ = makeString("Unmatched Parentheses in mt part ~S.");
        $ic69$ = makeKeyword("INCOMPLETELY-SPECIFIED");
        $ic70$ = makeString("MT parts ~S were unspecified.");
        $ic71$ = makeKeyword("SEMANTIC");
        $ic72$ = makeString("~S did not specify a monadic microtheory.");
        $ic73$ = makeString("~S did not specify a microtheory.");
        $ic74$ = makeString("~S did not specify a microtheory time dimension.");
        $ic75$ = makeKeyword("NON-TIME-INTERVAL");
        $ic76$ = makeString("~S did not specify a time interval.");
        $ic77$ = makeKeyword("NON-TIME-PARAMETER");
        $ic78$ = makeString("~S did not specify a time parameter.");
        $ic79$ = makeString("~S did not specify a term suitable for MT part ~A.");
        $ic80$ = makeString("MT ERROR ~S : ~S ~S ~S");
        $ic81$ = makeString("~S : ~S");
        $ic82$ = makeString("sentence");
        $ic83$ = ConsesLow.list(new SubLObject[] { makeSymbol("&KEY"), ConsesLow.list((SubLObject)makeSymbol("S#44050", "CYC"), (SubLObject)makeSymbol("S#44045", "CYC")), ConsesLow.list((SubLObject)makeSymbol("S#44051", "CYC"), (SubLObject)makeString("Complete")), makeSymbol("S#44052", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#15027", "CYC"), (SubLObject)makeString("EL Sentence")), ConsesLow.list((SubLObject)makeSymbol("S#44053", "CYC"), (SubLObject)makeString("Clear Sentence")), makeSymbol("S#44054", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#15402", "CYC"), constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"))), ConsesLow.list((SubLObject)makeSymbol("S#896", "CYC"), (SubLObject)makeInteger(80)), ConsesLow.list((SubLObject)makeSymbol("S#895", "CYC"), (SubLObject)TWENTY_INTEGER) });
        $ic84$ = ConsesLow.list(new SubLObject[] { makeKeyword("INPUT-NAME"), makeKeyword("COMPLETE-LABEL"), makeKeyword("CHOICES"), makeKeyword("PRETTY-NAME"), makeKeyword("CLEAR-LABEL"), makeKeyword("CYCLIFY-LABEL"), makeKeyword("DOMAIN-MT"), makeKeyword("WIDTH"), makeKeyword("HEIGHT") });
        $ic85$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic86$ = makeKeyword("COMPLETE-LABEL");
        $ic87$ = makeKeyword("CHOICES");
        $ic88$ = makeKeyword("PRETTY-NAME");
        $ic89$ = makeString("EL Sentence");
        $ic90$ = makeKeyword("CLEAR-LABEL");
        $ic91$ = makeString("Clear Sentence");
        $ic92$ = makeKeyword("CYCLIFY-LABEL");
        $ic93$ = makeKeyword("DOMAIN-MT");
        $ic94$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic95$ = makeKeyword("WIDTH");
        $ic96$ = makeInteger(80);
        $ic97$ = makeKeyword("HEIGHT");
        $ic98$ = makeString(" :");
        $ic99$ = ConsesLow.list(new SubLObject[] { makeSymbol("&KEY"), ConsesLow.list((SubLObject)makeSymbol("S#44050", "CYC"), (SubLObject)makeSymbol("S#44045", "CYC")), ConsesLow.list((SubLObject)makeSymbol("S#44051", "CYC"), (SubLObject)makeString("Complete")), makeSymbol("S#44052", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#15027", "CYC"), (SubLObject)makeString("EL Sentence")), ConsesLow.list((SubLObject)makeSymbol("S#44053", "CYC"), (SubLObject)makeString("Clear Sentence")), makeSymbol("S#44054", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#896", "CYC"), (SubLObject)makeInteger(80)), ConsesLow.list((SubLObject)makeSymbol("S#895", "CYC"), (SubLObject)TWENTY_INTEGER), ConsesLow.list((SubLObject)makeSymbol("S#4785", "CYC"), (SubLObject)makeKeyword("ASSERT")) });
        $ic100$ = ConsesLow.list(new SubLObject[] { makeKeyword("INPUT-NAME"), makeKeyword("COMPLETE-LABEL"), makeKeyword("CHOICES"), makeKeyword("PRETTY-NAME"), makeKeyword("CLEAR-LABEL"), makeKeyword("CYCLIFY-LABEL"), makeKeyword("WIDTH"), makeKeyword("HEIGHT"), makeKeyword("MODE") });
        $ic101$ = makeKeyword("MODE");
        $ic102$ = makeKeyword("ASSERT");
        $ic103$ = makeSymbol("POSITIVE-INTEGER-P");
        $ic104$ = makeSymbol("S#747", "CYC");
        $ic105$ = makeSymbol("CONSTANT-P");
        $ic106$ = makeSymbol("KEYWORDP");
        $ic107$ = makeKeyword("SILK");
        $ic108$ = makeKeyword("QUERY");
        $ic109$ = makeSymbol("S#16379", "CYC");
        $ic110$ = makeSymbol("S#16391", "CYC");
        $ic111$ = makeString("false");
        $ic112$ = makeString("true");
        $ic113$ = makeString("<script>Event.onDOMReady(function() {setupSentenceEditor(~S, ~S, ~S, ~A);});</script>");
        $ic114$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#44055", "CYC"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#44050", "CYC"), (SubLObject)makeSymbol("S#44045", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#44056", "CYC"), (SubLObject)T));
        $ic115$ = ConsesLow.list((SubLObject)makeKeyword("REQUIRED?"), (SubLObject)makeKeyword("INPUT-NAME"), (SubLObject)makeKeyword("AUTO-CYCLIFY"));
        $ic116$ = makeKeyword("REQUIRED?");
        $ic117$ = makeKeyword("AUTO-CYCLIFY");
        $ic118$ = makeSymbol("S#44026", "CYC");
        $ic119$ = ConsesLow.list((SubLObject)makeSymbol("S#44025", "CYC"));
        $ic120$ = makeString("Bad formula, probably due to a misspelling.~%Check these inputs:~%~%~S");
        $ic121$ = makeKeyword("INVALID-CONSTANTS");
        $ic122$ = makeKeyword("EOF");
        $ic123$ = makeKeyword("UNMATCHED-PARENTHESES");
        $ic124$ = makeKeyword("ERROR");
        $ic125$ = makeKeyword("READ-ERROR");
        $ic126$ = makeSymbol("SUBL-NON-VARIABLE-NON-KEYWORD-SYMBOL-P");
        $ic127$ = makeKeyword("SYMBOLS-FOR-INVALID-CONSTANTS");
        $ic128$ = makeKeyword("NON-SENTENCE");
        $ic129$ = ConsesLow.list((SubLObject)makeString("\""));
        $ic130$ = makeString("\"");
        $ic131$ = makeKeyword("EL-SENTENCE-ERROR");
        $ic132$ = makeSymbol("S#44032", "CYC");
        $ic133$ = makeKeyword("LOCATION");
        $ic134$ = ConsesLow.list((SubLObject)makeSymbol("S#44057", "CYC"), (SubLObject)makeSymbol("S#44048", "CYC"));
        $ic135$ = makeString("No sentence was specified in ");
        $ic136$ = makeString(".");
        $ic137$ = makeString("No sentence was specified.");
        $ic138$ = makeString("~A");
        $ic139$ = makeString("Invalid Constant References in ");
        $ic140$ = makeString("Invalid Constant References");
        $ic141$ = makeSymbol("S#43933", "CYC");
        $ic142$ = makeString("Unmatched Parentheses in ");
        $ic143$ = makeString("Unmatched Parentheses");
        $ic144$ = makeSymbol("S#43932", "CYC");
        $ic145$ = makeString("Unfinished Sentence in ");
        $ic146$ = makeString("Unfinished Sentence");
        $ic147$ = makeSymbol("S#43934", "CYC");
        $ic148$ = makeString("Unreadable Sentence in ");
        $ic149$ = makeString("Unreadable Sentence");
        $ic150$ = makeSymbol("S#43935", "CYC");
        $ic151$ = makeSymbol("S#43936", "CYC");
        $ic152$ = makeString("Not a Sentence in ");
        $ic153$ = makeString("Not a Sentence");
        $ic154$ = makeSymbol("S#43937", "CYC");
        $ic155$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic156$ = makeString("term");
        $ic157$ = makeString("Clear Term");
        $ic158$ = makeKeyword("COMPLETE-TYPE");
        $ic159$ = makeInteger(300);
        $ic160$ = makeString("completeContainer");
        $ic161$ = makeString("textArea");
        $ic162$ = makeString("width: ");
        $ic163$ = makeString("px;");
        $ic164$ = makeString("px; position:static");
        $ic165$ = makeString("autocomplete");
        $ic166$ = makeString("cycAutocompleteContainer");
        $ic167$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#44055", "CYC"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#44050", "CYC"), (SubLObject)makeSymbol("S#44046", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#44056", "CYC"), (SubLObject)T));
        $ic168$ = makeKeyword("EL-TERM-ERROR");
        $ic169$ = makeSymbol("S#44040", "CYC");
        $ic170$ = ConsesLow.list((SubLObject)makeSymbol("S#44058", "CYC"), (SubLObject)makeSymbol("S#44048", "CYC"));
        $ic171$ = makeString("No term was specified in ");
        $ic172$ = makeString("No term was specified.");
        $ic173$ = makeString("Unfinished Term in ");
        $ic174$ = makeString("Unfinished Term");
        $ic175$ = makeString("Unreadable Term in ");
        $ic176$ = makeString("Unreadable Term");
        $ic177$ = makeSymbol("S#44028", "CYC");
        $ic178$ = makeKeyword("TEST");
        $ic179$ = makeKeyword("OWNER");
        $ic180$ = makeKeyword("CLASSES");
        $ic181$ = makeKeyword("KB");
        $ic182$ = makeKeyword("FULL");
        $ic183$ = makeKeyword("WORKING?");
        $ic184$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nameString")), constant_handles_oc.f8479((SubLObject)makeString("CityOfBeijingChina")), (SubLObject)makeString("&#21271;&#20140;&#24066;"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nameString")), constant_handles_oc.f8479((SubLObject)makeString("CityOfBeijingChina")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("UnicodeStringFn")), (SubLObject)makeString("&u5317;&u4EAC;&u5E02;")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nameString")), constant_handles_oc.f8479((SubLObject)makeString("Thing")), (SubLObject)makeString("The Big Thing"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nameString")), constant_handles_oc.f8479((SubLObject)makeString("Thing")), (SubLObject)makeString("The Big Thing"))));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1223 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/