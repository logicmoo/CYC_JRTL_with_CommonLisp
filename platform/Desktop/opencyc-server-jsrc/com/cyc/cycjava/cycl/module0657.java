package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        if (var1 == module0657.UNPROVIDED) {
            var1 = (SubLObject)module0657.NIL;
        }
        return (SubLObject)((module0657.NIL != var1) ? module0656.f39865(var1) : module0657.$ic0$);
    }
    
    public static SubLObject f39992(SubLObject var2, SubLObject var3) {
        if (var2 == module0657.UNPROVIDED) {
            var2 = (SubLObject)module0657.NIL;
        }
        if (var3 == module0657.UNPROVIDED) {
            var3 = (SubLObject)module0657.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0161.f10557(var2);
        final SubLObject var6 = module0161.f10586(var2);
        if (module0657.NIL != module0161.f10471()) {
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
            final SubLObject var7 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)module0657.T, var4);
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
        return (SubLObject)module0657.NIL;
    }
    
    public static SubLObject f39996(final SubLObject var7) {
        assert module0657.NIL != Types.stringp(var7) : var7;
        return PrintLow.format((SubLObject)module0657.NIL, (SubLObject)module0657.$ic3$, var7);
    }
    
    public static SubLObject f39995(SubLObject var1, SubLObject var3) {
        if (var1 == module0657.UNPROVIDED) {
            var1 = (SubLObject)module0657.NIL;
        }
        if (var3 == module0657.UNPROVIDED) {
            var3 = (SubLObject)module0657.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var6;
        final SubLObject var5 = var6 = var3;
        final SubLObject var7 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic4$, var6);
        final SubLObject var8 = (SubLObject)((module0657.NIL != var7) ? conses_high.cadr(var7) : module0657.T);
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic5$, var6);
        final SubLObject var10 = (module0657.NIL != var9) ? conses_high.cadr(var9) : module0657.$g5184$.getGlobalValue();
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic6$, var6);
        final SubLObject var12 = (SubLObject)((module0657.NIL != var11) ? conses_high.cadr(var11) : module0657.NIL);
        final SubLObject var13 = f39997(var10);
        if (module0657.NIL != var8) {
            module0666.f40467(var13, (SubLObject)module0657.$ic7$, module0657.$ic8$, (SubLObject)module0657.NIL, (SubLObject)module0657.NIL, var12);
            module0642.f39032((SubLObject)module0657.ONE_INTEGER);
        }
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0657.$ic9$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        final SubLObject var14 = f39991(var1);
        if (module0657.NIL != var8) {
            module0642.f39075(var13, var14, module0655.$g5136$.getDynamicValue(var4));
            module0642.f39032((SubLObject)module0657.ONE_INTEGER);
            module0644.f39184(var13, (SubLObject)module0657.$ic10$);
        }
        else {
            module0656.f39804(var1, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
            module0642.f39069(var13, var14, (SubLObject)module0657.UNPROVIDED);
        }
        return (SubLObject)module0657.NIL;
    }
    
    public static SubLObject f39993(SubLObject var1, SubLObject var3) {
        if (var1 == module0657.UNPROVIDED) {
            var1 = (SubLObject)module0657.NIL;
        }
        if (var3 == module0657.UNPROVIDED) {
            var3 = (SubLObject)module0657.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var6;
        final SubLObject var5 = var6 = var3;
        final SubLObject var7 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic4$, var6);
        final SubLObject var8 = (SubLObject)((module0657.NIL != var7) ? conses_high.cadr(var7) : module0657.T);
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic5$, var6);
        final SubLObject var10 = (module0657.NIL != var9) ? conses_high.cadr(var9) : module0657.$g5184$.getGlobalValue();
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic6$, var6);
        final SubLObject var12 = (SubLObject)((module0657.NIL != var11) ? conses_high.cadr(var11) : module0657.NIL);
        if (module0657.NIL != var8) {
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
            final SubLObject var13 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)module0657.T, var4);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0657.$ic11$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                final SubLObject var6_22 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)module0657.T, var4);
                    final SubLObject var14 = f39996(var10);
                    module0642.f39068(var14, (SubLObject)module0657.$ic12$, (SubLObject)module0657.T, (SubLObject)module0657.NIL, (SubLObject)module0657.NIL, (SubLObject)module0657.T);
                }
                finally {
                    module0015.$g533$.rebind(var6_22, var4);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g371$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39020((SubLObject)module0657.THREE_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0657.$ic13$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                final SubLObject var6_23 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)module0657.T, var4);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)module0657.$ic14$);
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
            module0642.f39029((SubLObject)module0657.UNPROVIDED);
        }
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39020(module0015.$g373$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39020(module0642.f39049((SubLObject)module0657.$ic11$));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
        final SubLObject var13 = module0015.$g533$.currentBinding(var4);
        try {
            module0015.$g533$.bind((SubLObject)module0657.T, var4);
            final SubLObject var15 = f39997(var10);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0657.$ic11$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
            final SubLObject var6_24 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)module0657.T, var4);
            }
            finally {
                module0015.$g533$.rebind(var6_24, var4);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g370$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0657.$ic13$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
            final SubLObject var6_25 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)module0657.T, var4);
                if (module0657.NIL != var8) {
                    module0666.f40467(var15, (SubLObject)module0657.$ic7$, module0657.$ic8$, (SubLObject)module0657.NIL, (SubLObject)module0657.NIL, var12);
                    module0642.f39032((SubLObject)module0657.ONE_INTEGER);
                }
            }
            finally {
                module0015.$g533$.rebind(var6_25, var4);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g370$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0657.$ic15$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
            final SubLObject var6_26 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)module0657.T, var4);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019((SubLObject)module0657.$ic16$);
                module0642.f39020(module0015.$g235$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var6_26, var4);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            final SubLObject var16 = f39991(var1);
            if (module0657.NIL != var8) {
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0657.$ic13$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                final SubLObject var6_27 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)module0657.T, var4);
                    if (module0657.NIL != module0015.f794((SubLObject)module0657.UNPROVIDED)) {
                        final SubLObject var17 = module0015.f793((SubLObject)module0657.UNPROVIDED);
                        final SubLObject var18 = Sequences.cconcatenate((SubLObject)module0657.$ic17$, module0006.f203(var17));
                        final SubLObject var19 = Sequences.cconcatenate((SubLObject)module0657.$ic18$, module0006.f203(var17));
                        final SubLObject var20 = Sequences.cconcatenate((SubLObject)module0657.$ic19$, module0006.f203(var17));
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        if (module0657.NIL != var18) {
                            module0642.f39020(module0015.$g157$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                            module0642.f39020(var18);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g158$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39020((SubLObject)module0657.$ic20$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                        final SubLObject var6_28 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)module0657.T, var4);
                            module0642.f39020(module0015.$g336$.getGlobalValue());
                            module0642.f39020(module0015.$g338$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                            module0642.f39020(var15);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                            if (module0657.NIL != module0655.$g5136$.getDynamicValue(var4)) {
                                module0642.f39020(module0015.$g340$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                                module0642.f39020(module0655.$g5136$.getDynamicValue(var4));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                            }
                            if (module0657.NIL != var19) {
                                module0642.f39020(module0015.$g341$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                                module0642.f39020(var19);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                            }
                            module0642.f39020(module0015.$g339$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                            module0642.f39020((SubLObject)module0657.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                            module0642.f39020(module0015.$g342$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                            module0642.f39020((SubLObject)module0657.$ic21$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                            module0642.f39020(module0015.$g158$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                            module0642.f39020((SubLObject)module0657.$ic22$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                            final SubLObject var6_29 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)module0657.T, var4);
                                module0642.f39019(var16);
                            }
                            finally {
                                module0015.$g533$.rebind(var6_29, var4);
                            }
                            module0642.f39020(module0015.$g337$.getGlobalValue());
                            module0642.f39020(module0015.$g144$.getGlobalValue());
                            if (module0657.NIL != var20) {
                                module0642.f39020(module0015.$g157$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                                module0642.f39020(var20);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                            }
                            module0642.f39020(module0015.$g158$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                            module0642.f39020((SubLObject)module0657.$ic23$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                            final SubLObject var6_30 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)module0657.T, var4);
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
                        module0666.f40486(var19, var20, (SubLObject)module0657.TWENTY_INTEGER, (SubLObject)module0657.THREE_INTEGER, (SubLObject)module0657.NIL, module0657.$ic8$);
                    }
                    else {
                        module0642.f39020(module0015.$g336$.getGlobalValue());
                        module0642.f39020(module0015.$g338$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39020(var15);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        if (module0657.NIL != module0655.$g5136$.getDynamicValue(var4)) {
                            module0642.f39020(module0015.$g340$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                            module0642.f39020(module0655.$g5136$.getDynamicValue(var4));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g339$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39020((SubLObject)module0657.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                        final SubLObject var6_31 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)module0657.T, var4);
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
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0657.$ic13$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                final SubLObject var6_32 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)module0657.T, var4);
                    module0644.f39184(var15, (SubLObject)module0657.$ic10$);
                }
                finally {
                    module0015.$g533$.rebind(var6_32, var4);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            else {
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0657.$ic13$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                final SubLObject var6_33 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)module0657.T, var4);
                    module0656.f39804(var1, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
                    module0642.f39069(var15, var16, (SubLObject)module0657.UNPROVIDED);
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
        module0642.f39029((SubLObject)module0657.UNPROVIDED);
        return (SubLObject)module0657.NIL;
    }
    
    public static SubLObject f39997(final SubLObject var7) {
        assert module0657.NIL != Types.stringp(var7) : var7;
        return PrintLow.format((SubLObject)module0657.NIL, (SubLObject)module0657.$ic24$, Strings.string_downcase(var7, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED));
    }
    
    public static SubLObject f39998(final SubLObject var7) {
        assert module0657.NIL != Types.stringp(var7) : var7;
        return PrintLow.format((SubLObject)module0657.NIL, (SubLObject)module0657.$ic25$, var7);
    }
    
    public static SubLObject f39994(SubLObject var5, SubLObject var3) {
        if (var5 == module0657.UNPROVIDED) {
            var5 = (SubLObject)module0657.NIL;
        }
        if (var3 == module0657.UNPROVIDED) {
            var3 = (SubLObject)module0657.NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var8;
        final SubLObject var7 = var8 = var3;
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic4$, var8);
        final SubLObject var10 = (SubLObject)((module0657.NIL != var9) ? conses_high.cadr(var9) : module0657.T);
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic5$, var8);
        final SubLObject var12 = (module0657.NIL != var11) ? conses_high.cadr(var11) : module0657.$g5184$.getGlobalValue();
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic26$, var8);
        final SubLObject var14 = (SubLObject)((module0657.NIL != var13) ? conses_high.cadr(var13) : module0657.T);
        final SubLObject var15 = f39999(var12);
        final SubLObject var16 = f40000(var12);
        final SubLObject var17 = module0161.f10535(var5);
        SubLObject var18 = (SubLObject)module0657.NIL;
        SubLObject var19 = (SubLObject)module0657.NIL;
        if (module0657.NIL == var17) {
            var6.resetMultipleValues();
            final SubLObject var50_51 = module0161.f10583(var5);
            final SubLObject var52_53 = var6.secondMultipleValue();
            var6.resetMultipleValues();
            var18 = var50_51;
            var19 = var52_53;
        }
        final SubLObject var20 = f39998(var12);
        if (module0657.NIL == var10) {
            module0642.f39069(var20, (SubLObject)module0657.$ic27$, (SubLObject)module0657.UNPROVIDED);
        }
        else if (module0657.NIL == var14) {
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
            final SubLObject var21 = module0015.$g533$.currentBinding(var6);
            try {
                module0015.$g533$.bind((SubLObject)module0657.T, var6);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0657.$ic11$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                final SubLObject var6_55 = module0015.$g533$.currentBinding(var6);
                try {
                    module0015.$g533$.bind((SubLObject)module0657.T, var6);
                    module0642.f39068(var20, (SubLObject)module0657.$ic12$, (SubLObject)module0657.T, (SubLObject)module0657.NIL, (SubLObject)module0657.NIL, (SubLObject)module0657.T);
                }
                finally {
                    module0015.$g533$.rebind(var6_55, var6);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g371$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39020((SubLObject)module0657.THREE_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0657.$ic13$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                final SubLObject var6_56 = module0015.$g533$.currentBinding(var6);
                try {
                    module0015.$g533$.bind((SubLObject)module0657.T, var6);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)module0657.$ic28$);
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
            module0642.f39029((SubLObject)module0657.UNPROVIDED);
            module0642.f39069(var20, (SubLObject)module0657.$ic27$, (SubLObject)module0657.UNPROVIDED);
        }
        else {
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
            final SubLObject var21 = module0015.$g533$.currentBinding(var6);
            try {
                module0015.$g533$.bind((SubLObject)module0657.T, var6);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0657.$ic11$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                final SubLObject var6_57 = module0015.$g533$.currentBinding(var6);
                try {
                    module0015.$g533$.bind((SubLObject)module0657.T, var6);
                    module0642.f39068(var20, (SubLObject)module0657.$ic12$, (SubLObject)SubLObjectFactory.makeBoolean(module0657.NIL == var17), (SubLObject)module0657.NIL, (SubLObject)module0657.NIL, (SubLObject)SubLObjectFactory.makeBoolean(module0657.NIL == var14));
                }
                finally {
                    module0015.$g533$.rebind(var6_57, var6);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g371$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39020((SubLObject)module0657.THREE_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0657.$ic13$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                final SubLObject var6_58 = module0015.$g533$.currentBinding(var6);
                try {
                    module0015.$g533$.bind((SubLObject)module0657.T, var6);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)module0657.$ic28$);
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
            module0642.f39029((SubLObject)module0657.UNPROVIDED);
        }
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39020(module0015.$g373$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39020(module0642.f39049((SubLObject)module0657.$ic11$));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
        SubLObject var22 = module0015.$g533$.currentBinding(var6);
        try {
            module0015.$g533$.bind((SubLObject)module0657.T, var6);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
            final SubLObject var6_59 = module0015.$g533$.currentBinding(var6);
            try {
                module0015.$g533$.bind((SubLObject)module0657.T, var6);
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
        module0642.f39029((SubLObject)module0657.UNPROVIDED);
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39020(module0015.$g373$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39020(module0642.f39049((SubLObject)module0657.$ic11$));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
        var22 = module0015.$g533$.currentBinding(var6);
        try {
            module0015.$g533$.bind((SubLObject)module0657.T, var6);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
            final SubLObject var6_60 = module0015.$g533$.currentBinding(var6);
            try {
                module0015.$g533$.bind((SubLObject)module0657.T, var6);
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
        module0642.f39029((SubLObject)module0657.UNPROVIDED);
        return (SubLObject)module0657.NIL;
    }
    
    public static SubLObject f40001(SubLObject var48, SubLObject var45, SubLObject var11) {
        if (var48 == module0657.UNPROVIDED) {
            var48 = (SubLObject)module0657.NIL;
        }
        if (var45 == module0657.UNPROVIDED) {
            var45 = (SubLObject)module0657.NIL;
        }
        if (var11 == module0657.UNPROVIDED) {
            var11 = (SubLObject)module0657.NIL;
        }
        final SubLThread var49 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39020(module0015.$g370$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39020(module0642.f39049((SubLObject)module0657.$ic13$));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
        SubLObject var50 = module0015.$g533$.currentBinding(var49);
        try {
            module0015.$g533$.bind((SubLObject)module0657.T, var49);
            if (module0657.NIL != var11) {
                final SubLObject var51 = (SubLObject)module0657.$ic29$;
                module0666.f40467(var45, (SubLObject)module0657.$ic7$, module0657.$ic30$, (SubLObject)module0657.NIL, (SubLObject)module0657.NIL, var51);
                module0642.f39032((SubLObject)module0657.ONE_INTEGER);
            }
        }
        finally {
            module0015.$g533$.rebind(var50, var49);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39020(module0015.$g370$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39020(module0642.f39049((SubLObject)module0657.$ic15$));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
        var50 = module0015.$g533$.currentBinding(var49);
        try {
            module0015.$g533$.bind((SubLObject)module0657.T, var49);
            if (module0657.NIL == var11) {
                module0642.f39021((SubLObject)module0657.$ic31$);
            }
            module0642.f39021((SubLObject)module0657.$ic32$);
        }
        finally {
            module0015.$g533$.rebind(var50, var49);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        final SubLObject var52 = module0656.f39962(var48);
        if (module0657.NIL != var11) {
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g370$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0657.$ic13$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
            SubLObject var53 = module0015.$g533$.currentBinding(var49);
            try {
                module0015.$g533$.bind((SubLObject)module0657.T, var49);
                final SubLObject var54 = (SubLObject)module0657.TWO_INTEGER;
                if (module0657.NIL != module0015.f794((SubLObject)module0657.UNPROVIDED)) {
                    final SubLObject var55 = module0015.f793((SubLObject)module0657.UNPROVIDED);
                    final SubLObject var56 = Sequences.cconcatenate((SubLObject)module0657.$ic17$, module0006.f203(var55));
                    final SubLObject var57 = Sequences.cconcatenate((SubLObject)module0657.$ic18$, module0006.f203(var55));
                    final SubLObject var58 = Sequences.cconcatenate((SubLObject)module0657.$ic19$, module0006.f203(var55));
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    if (module0657.NIL != var56) {
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39020(var56);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g158$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                    module0642.f39020((SubLObject)module0657.$ic20$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                    final SubLObject var6_64 = module0015.$g533$.currentBinding(var49);
                    try {
                        module0015.$g533$.bind((SubLObject)module0657.T, var49);
                        module0642.f39020(module0015.$g336$.getGlobalValue());
                        module0642.f39020(module0015.$g338$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39020(var45);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        if (module0657.NIL != module0655.$g5136$.getDynamicValue(var49)) {
                            module0642.f39020(module0015.$g340$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                            module0642.f39020(module0655.$g5136$.getDynamicValue(var49));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        }
                        if (module0657.NIL != var57) {
                            module0642.f39020(module0015.$g341$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                            module0642.f39020(var57);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        }
                        if (module0657.NIL != var54) {
                            module0642.f39020(module0015.$g339$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                            module0642.f39020(var54);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g342$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39020((SubLObject)module0657.$ic21$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39020(module0015.$g158$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39020((SubLObject)module0657.$ic22$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                        final SubLObject var6_65 = module0015.$g533$.currentBinding(var49);
                        try {
                            module0015.$g533$.bind((SubLObject)module0657.T, var49);
                            module0642.f39019(var52);
                        }
                        finally {
                            module0015.$g533$.rebind(var6_65, var49);
                        }
                        module0642.f39020(module0015.$g337$.getGlobalValue());
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        if (module0657.NIL != var58) {
                            module0642.f39020(module0015.$g157$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                            module0642.f39020(var58);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g158$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39020((SubLObject)module0657.$ic23$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                        final SubLObject var6_66 = module0015.$g533$.currentBinding(var49);
                        try {
                            module0015.$g533$.bind((SubLObject)module0657.T, var49);
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
                    module0666.f40486(var57, var58, (SubLObject)module0657.TWENTY_INTEGER, (SubLObject)module0657.THREE_INTEGER, (SubLObject)module0657.NIL, module0657.$ic30$);
                }
                else {
                    module0642.f39020(module0015.$g336$.getGlobalValue());
                    module0642.f39020(module0015.$g338$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                    module0642.f39020(var45);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                    if (module0657.NIL != module0655.$g5136$.getDynamicValue(var49)) {
                        module0642.f39020(module0015.$g340$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39020(module0655.$g5136$.getDynamicValue(var49));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                    }
                    if (module0657.NIL != var54) {
                        module0642.f39020(module0015.$g339$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39020(var54);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                    final SubLObject var6_67 = module0015.$g533$.currentBinding(var49);
                    try {
                        module0015.$g533$.bind((SubLObject)module0657.T, var49);
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
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0657.$ic13$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
            var53 = module0015.$g533$.currentBinding(var49);
            try {
                module0015.$g533$.bind((SubLObject)module0657.T, var49);
                module0644.f39184(var45, (SubLObject)module0657.$ic33$);
            }
            finally {
                module0015.$g533$.rebind(var53, var49);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        else {
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g370$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0657.$ic13$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
            final SubLObject var53 = module0015.$g533$.currentBinding(var49);
            try {
                module0015.$g533$.bind((SubLObject)module0657.T, var49);
                module0656.f39804(var48, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
                module0642.f39069(var45, var52, (SubLObject)module0657.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var53, var49);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        return (SubLObject)module0657.NIL;
    }
    
    public static SubLObject f39999(final SubLObject var7) {
        assert module0657.NIL != Types.stringp(var7) : var7;
        return PrintLow.format((SubLObject)module0657.NIL, (SubLObject)module0657.$ic34$, Strings.string_downcase(var7, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED));
    }
    
    public static SubLObject f40002(SubLObject var49, SubLObject var46, SubLObject var11) {
        if (var49 == module0657.UNPROVIDED) {
            var49 = (SubLObject)module0657.NIL;
        }
        if (var46 == module0657.UNPROVIDED) {
            var46 = (SubLObject)module0657.NIL;
        }
        if (var11 == module0657.UNPROVIDED) {
            var11 = (SubLObject)module0657.NIL;
        }
        final SubLThread var50 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39020(module0015.$g370$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39020(module0642.f39049((SubLObject)module0657.$ic13$));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
        SubLObject var51 = module0015.$g533$.currentBinding(var50);
        try {
            module0015.$g533$.bind((SubLObject)module0657.T, var50);
            if (module0657.NIL != var11) {
                final SubLObject var52 = (SubLObject)module0657.$ic35$;
                module0666.f40467(var46, (SubLObject)module0657.$ic7$, module0657.$ic36$, (SubLObject)module0657.NIL, (SubLObject)module0657.NIL, var52);
                module0642.f39032((SubLObject)module0657.ONE_INTEGER);
            }
        }
        finally {
            module0015.$g533$.rebind(var51, var50);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39020(module0015.$g370$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39020(module0642.f39049((SubLObject)module0657.$ic15$));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
        var51 = module0015.$g533$.currentBinding(var50);
        try {
            module0015.$g533$.bind((SubLObject)module0657.T, var50);
            if (module0657.NIL == var11) {
                module0642.f39021((SubLObject)module0657.$ic31$);
            }
            module0642.f39021((SubLObject)module0657.$ic37$);
        }
        finally {
            module0015.$g533$.rebind(var51, var50);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        final SubLObject var53 = module0656.f39963(var49);
        if (module0657.NIL != var11) {
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g370$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0657.$ic13$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
            SubLObject var54 = module0015.$g533$.currentBinding(var50);
            try {
                module0015.$g533$.bind((SubLObject)module0657.T, var50);
                if (module0657.NIL != module0015.f794((SubLObject)module0657.UNPROVIDED)) {
                    final SubLObject var55 = module0015.f793((SubLObject)module0657.UNPROVIDED);
                    final SubLObject var56 = Sequences.cconcatenate((SubLObject)module0657.$ic17$, module0006.f203(var55));
                    final SubLObject var57 = Sequences.cconcatenate((SubLObject)module0657.$ic18$, module0006.f203(var55));
                    final SubLObject var58 = Sequences.cconcatenate((SubLObject)module0657.$ic19$, module0006.f203(var55));
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    if (module0657.NIL != var56) {
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39020(var56);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g158$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                    module0642.f39020((SubLObject)module0657.$ic20$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                    final SubLObject var6_70 = module0015.$g533$.currentBinding(var50);
                    try {
                        module0015.$g533$.bind((SubLObject)module0657.T, var50);
                        module0642.f39020(module0015.$g336$.getGlobalValue());
                        module0642.f39020(module0015.$g338$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39020(var46);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        if (module0657.NIL != module0655.$g5136$.getDynamicValue(var50)) {
                            module0642.f39020(module0015.$g340$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                            module0642.f39020(module0655.$g5136$.getDynamicValue(var50));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        }
                        if (module0657.NIL != var57) {
                            module0642.f39020(module0015.$g341$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                            module0642.f39020(var57);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g339$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39020((SubLObject)module0657.ONE_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39020(module0015.$g342$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39020((SubLObject)module0657.$ic21$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39020(module0015.$g158$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39020((SubLObject)module0657.$ic22$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                        final SubLObject var6_71 = module0015.$g533$.currentBinding(var50);
                        try {
                            module0015.$g533$.bind((SubLObject)module0657.T, var50);
                            module0642.f39019(var53);
                        }
                        finally {
                            module0015.$g533$.rebind(var6_71, var50);
                        }
                        module0642.f39020(module0015.$g337$.getGlobalValue());
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        if (module0657.NIL != var58) {
                            module0642.f39020(module0015.$g157$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                            module0642.f39020(var58);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g158$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39020((SubLObject)module0657.$ic23$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                        final SubLObject var6_72 = module0015.$g533$.currentBinding(var50);
                        try {
                            module0015.$g533$.bind((SubLObject)module0657.T, var50);
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
                    module0666.f40486(var57, var58, (SubLObject)module0657.TWENTY_INTEGER, (SubLObject)module0657.THREE_INTEGER, (SubLObject)module0657.NIL, module0657.$ic36$);
                }
                else {
                    module0642.f39020(module0015.$g336$.getGlobalValue());
                    module0642.f39020(module0015.$g338$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                    module0642.f39020(var46);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                    if (module0657.NIL != module0655.$g5136$.getDynamicValue(var50)) {
                        module0642.f39020(module0015.$g340$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                        module0642.f39020(module0655.$g5136$.getDynamicValue(var50));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g339$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                    module0642.f39020((SubLObject)module0657.ONE_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                    final SubLObject var6_73 = module0015.$g533$.currentBinding(var50);
                    try {
                        module0015.$g533$.bind((SubLObject)module0657.T, var50);
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
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0657.$ic13$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
            var54 = module0015.$g533$.currentBinding(var50);
            try {
                module0015.$g533$.bind((SubLObject)module0657.T, var50);
                module0644.f39184(var46, (SubLObject)module0657.$ic38$);
            }
            finally {
                module0015.$g533$.rebind(var54, var50);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        else {
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g370$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0657.$ic13$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
            final SubLObject var54 = module0015.$g533$.currentBinding(var50);
            try {
                module0015.$g533$.bind((SubLObject)module0657.T, var50);
                module0656.f39804(var49, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
                module0642.f39069(var46, var53, (SubLObject)module0657.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var54, var50);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        return (SubLObject)module0657.NIL;
    }
    
    public static SubLObject f40000(final SubLObject var7) {
        assert module0657.NIL != Types.stringp(var7) : var7;
        return PrintLow.format((SubLObject)module0657.NIL, (SubLObject)module0657.$ic39$, Strings.string_downcase(var7, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED));
    }
    
    public static SubLObject f40003(final SubLObject var74, SubLObject var75, SubLObject var76) {
        if (var75 == module0657.UNPROVIDED) {
            var75 = (SubLObject)module0657.NIL;
        }
        if (var76 == module0657.UNPROVIDED) {
            var76 = (SubLObject)module0657.NIL;
        }
        final SubLThread var77 = SubLProcess.currentSubLThread();
        final SubLObject var79;
        final SubLObject var78 = var79 = var76;
        final SubLObject var80 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic5$, var79);
        final SubLObject var81 = (module0657.NIL != var80) ? conses_high.cadr(var80) : module0657.$g5184$.getGlobalValue();
        final SubLObject var82 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic40$, var79);
        final SubLObject var83 = (SubLObject)((module0657.NIL != var82) ? conses_high.cadr(var82) : module0657.NIL);
        final SubLObject var84 = module0161.f10576(var75);
        SubLObject var85 = (SubLObject)module0657.NIL;
        SubLObject var86 = (SubLObject)module0657.NIL;
        var77.resetMultipleValues();
        final SubLObject var85_86 = module0161.f10612(var75, (SubLObject)module0657.NIL, (SubLObject)module0657.NIL);
        final SubLObject var87_88 = var77.secondMultipleValue();
        var77.resetMultipleValues();
        var85 = var85_86;
        var86 = var87_88;
        SubLObject var87 = (SubLObject)module0657.$ic41$;
        SubLObject var88 = (SubLObject)module0657.$ic41$;
        SubLObject var89 = (SubLObject)module0657.$ic41$;
        final SubLObject var90 = f39997(var81);
        final SubLObject var91 = module0642.f39104(var90, var74);
        if (module0657.NIL != var91) {
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
        if (module0657.NIL != var89) {
            return Values.values((SubLObject)module0657.NIL, var89, var91);
        }
        if (module0657.NIL == module0161.f10471()) {
            return Values.values(var87, (SubLObject)module0657.NIL, (SubLObject)module0657.NIL);
        }
        final SubLObject var92 = f39998(var81);
        final SubLObject var93 = module0642.f39104(var92, var74);
        if (module0657.NIL != var93) {
            SubLObject var94 = (SubLObject)module0657.$ic41$;
            SubLObject var95 = (SubLObject)module0657.$ic41$;
            final SubLObject var96 = f39999(var81);
            final SubLObject var97 = module0642.f39104(var96, var74);
            var77.resetMultipleValues();
            final SubLObject var97_98 = f40006(var97, var85, var83);
            final SubLObject var99_100 = var77.secondMultipleValue();
            var77.resetMultipleValues();
            var94 = var97_98;
            var89 = var99_100;
            if (module0657.NIL != var89) {
                return Values.values((SubLObject)module0657.NIL, var89, var97);
            }
            final SubLObject var98 = f40000(var81);
            final SubLObject var99 = module0642.f39104(var98, var74);
            var77.resetMultipleValues();
            final SubLObject var102_103 = f40007(var99, var86, var83);
            final SubLObject var104_105 = var77.secondMultipleValue();
            var77.resetMultipleValues();
            var95 = var102_103;
            var89 = var104_105;
            if (module0657.NIL != var89) {
                return Values.values((SubLObject)module0657.NIL, var89, var99);
            }
            var88 = module0161.f10543(var94, var95);
        }
        else {
            var88 = module0161.f10543(module0657.$ic42$, (SubLObject)module0657.UNPROVIDED);
        }
        if (module0657.NIL == var87 && module0657.NIL == var88) {
            final SubLObject var89_106 = f40005();
            return Values.values((SubLObject)module0657.NIL, var89_106, (SubLObject)module0657.NIL);
        }
        if (module0657.NIL == var87 || module0657.NIL == var88) {
            final SubLObject var100 = ConsesLow.nconc((SubLObject)((module0657.NIL != var87) ? module0657.NIL : ConsesLow.list((SubLObject)module0657.$ic43$)), (SubLObject)((module0657.NIL != var88) ? module0657.NIL : ConsesLow.list((SubLObject)module0657.$ic44$)));
            final SubLObject var89_107 = f40008(var100);
            return Values.values((SubLObject)module0657.NIL, var89_107, (SubLObject)module0657.NIL);
        }
        final SubLObject var101 = module0161.f10619(var87, var88);
        return Values.values(var101, (SubLObject)module0657.NIL, (SubLObject)module0657.NIL);
    }
    
    public static SubLObject f40004(SubLObject var110, final SubLObject var82, final SubLObject var81) {
        assert module0657.NIL != Types.stringp(var110) : var110;
        var110 = module0038.f2824(module0038.f2735(var110));
        if (module0657.NIL != module0038.f2608(var110)) {
            if (module0657.NIL != var82) {
                return Values.values(var82, (SubLObject)module0657.NIL);
            }
            return Values.values((SubLObject)module0657.NIL, (SubLObject)module0657.NIL);
        }
        else {
            final SubLObject var111 = module0656.f39957(var110, (SubLObject)module0657.UNPROVIDED);
            if (module0657.NIL == var111) {
                if (module0657.NIL != module0038.f2873(var110, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED)) {
                    return Values.values((SubLObject)module0657.NIL, f40009((SubLObject)module0657.$ic43$));
                }
                return Values.values((SubLObject)module0657.NIL, f40010((SubLObject)module0657.$ic43$));
            }
            else {
                if (module0657.NIL == module0674.f41210(var111) && (module0657.NIL == var81 || module0657.NIL == module0552.f34132(var111))) {
                    return Values.values((SubLObject)module0657.NIL, f40011((SubLObject)module0657.$ic43$));
                }
                return Values.values(var111, (SubLObject)module0657.NIL);
            }
        }
    }
    
    public static SubLObject f40006(SubLObject var110, final SubLObject var83, final SubLObject var81) {
        assert module0657.NIL != Types.stringp(var110) : var110;
        var110 = module0038.f2824(module0038.f2735(var110));
        if (module0657.NIL != module0038.f2608(var110)) {
            if (module0657.NIL != var83) {
                return Values.values(var83, (SubLObject)module0657.NIL);
            }
            return Values.values((SubLObject)module0657.NIL, (SubLObject)module0657.NIL);
        }
        else {
            final SubLObject var111 = module0656.f39957(var110, (SubLObject)module0657.UNPROVIDED);
            if (module0657.NIL != var81 && module0657.NIL != module0552.f34132(var111)) {
                return Values.values(var111, (SubLObject)module0657.NIL);
            }
            final SubLObject var112 = module0656.f39960(var110);
            if (module0657.NIL == var112) {
                if (module0657.NIL != module0038.f2873(var110, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED)) {
                    return Values.values((SubLObject)module0657.NIL, f40009((SubLObject)module0657.$ic45$));
                }
                return Values.values((SubLObject)module0657.NIL, f40010((SubLObject)module0657.$ic45$));
            }
            else {
                if (module0657.NIL == module0161.f10593(var112)) {
                    return Values.values((SubLObject)module0657.NIL, f40011((SubLObject)module0657.$ic45$));
                }
                return Values.values(var112, (SubLObject)module0657.NIL);
            }
        }
    }
    
    public static SubLObject f40007(SubLObject var110, final SubLObject var84, final SubLObject var81) {
        assert module0657.NIL != Types.stringp(var110) : var110;
        var110 = module0038.f2824(module0038.f2735(var110));
        if (module0657.NIL != module0038.f2608(var110)) {
            if (module0657.NIL != var84) {
                return Values.values(var84, (SubLObject)module0657.NIL);
            }
            return Values.values((SubLObject)module0657.NIL, (SubLObject)module0657.NIL);
        }
        else {
            final SubLObject var111 = module0656.f39957(var110, (SubLObject)module0657.UNPROVIDED);
            if (module0657.NIL != var81 && module0657.NIL != module0552.f34132(var111)) {
                return Values.values(var111, (SubLObject)module0657.NIL);
            }
            final SubLObject var112 = module0656.f39961(var110);
            if (module0657.NIL == var112) {
                if (module0657.NIL != module0038.f2873(var110, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED)) {
                    return Values.values((SubLObject)module0657.NIL, f40009((SubLObject)module0657.$ic46$));
                }
                return Values.values((SubLObject)module0657.NIL, f40010((SubLObject)module0657.$ic46$));
            }
            else {
                if (module0657.NIL == module0161.f10594(var112)) {
                    return Values.values((SubLObject)module0657.NIL, f40011((SubLObject)module0657.$ic46$));
                }
                return Values.values(var112, (SubLObject)module0657.NIL);
            }
        }
    }
    
    public static SubLObject f40012(final SubLObject var112) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0657.NIL != module0035.f2014(var112) && module0657.NIL != module0035.f2000(var112, (SubLObject)module0657.TWO_INTEGER, (SubLObject)module0657.UNPROVIDED) && module0657.$ic47$ == var112.first());
    }
    
    public static SubLObject f40013(final SubLObject var89, SubLObject var110) {
        if (var110 == module0657.UNPROVIDED) {
            var110 = (SubLObject)module0657.NIL;
        }
        if (module0657.NIL == f40012(var89)) {
            return module0656.f39789((SubLObject)module0657.$ic81$, var89, var110, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
        }
        SubLObject var111 = (SubLObject)module0657.NIL;
        SubLObject var112 = (SubLObject)module0657.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var89, var89, (SubLObject)module0657.$ic48$);
        var111 = var89.first();
        SubLObject var113 = var89.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var113, var89, (SubLObject)module0657.$ic48$);
        var112 = var113.first();
        var113 = var113.rest();
        final SubLObject var114 = (SubLObject)(var113.isCons() ? var113.first() : module0657.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var113, var89, (SubLObject)module0657.$ic48$);
        var113 = var113.rest();
        if (module0657.NIL != var113) {
            cdestructuring_bind.cdestructuring_bind_error(var89, (SubLObject)module0657.$ic48$);
            return (SubLObject)module0657.NIL;
        }
        final SubLObject var115 = var112;
        if (var115.eql((SubLObject)module0657.$ic49$)) {
            return module0656.f39789((SubLObject)module0657.$ic50$, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
        }
        if (var115.eql((SubLObject)module0657.$ic51$)) {
            final SubLObject var118_119 = var114;
            if (var118_119.eql((SubLObject)module0657.$ic43$)) {
                if (module0657.NIL != module0161.f10471()) {
                    return module0656.f39789((SubLObject)module0657.$ic52$, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
                }
                return module0656.f39789((SubLObject)module0657.$ic50$, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
            }
            else {
                if (var118_119.eql((SubLObject)module0657.$ic44$)) {
                    return module0656.f39789((SubLObject)module0657.$ic53$, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
                }
                if (var118_119.eql((SubLObject)module0657.$ic45$)) {
                    return module0656.f39789((SubLObject)module0657.$ic54$, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
                }
                if (var118_119.eql((SubLObject)module0657.$ic46$)) {
                    return module0656.f39789((SubLObject)module0657.$ic55$, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
                }
                return module0656.f39789((SubLObject)module0657.$ic56$, var114, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
            }
        }
        else if (var115.eql((SubLObject)module0657.$ic57$)) {
            final SubLObject var118_120 = var114;
            if (var118_120.eql((SubLObject)module0657.$ic43$)) {
                return module0656.f39789((SubLObject)module0657.$ic58$, var110, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
            }
            if (var118_120.eql((SubLObject)module0657.$ic44$)) {
                return module0656.f39789((SubLObject)module0657.$ic59$, var110, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
            }
            if (var118_120.eql((SubLObject)module0657.$ic45$)) {
                return module0656.f39789((SubLObject)module0657.$ic60$, var110, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
            }
            if (var118_120.eql((SubLObject)module0657.$ic46$)) {
                return module0656.f39789((SubLObject)module0657.$ic61$, var110, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
            }
            return module0656.f39789((SubLObject)module0657.$ic62$, var110, var114, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
        }
        else if (var115.eql((SubLObject)module0657.$ic63$)) {
            final SubLObject var118_121 = var114;
            if (var118_121.eql((SubLObject)module0657.$ic43$)) {
                return module0656.f39789((SubLObject)module0657.$ic64$, var110, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
            }
            if (var118_121.eql((SubLObject)module0657.$ic44$)) {
                return module0656.f39789((SubLObject)module0657.$ic65$, var110, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
            }
            if (var118_121.eql((SubLObject)module0657.$ic45$)) {
                return module0656.f39789((SubLObject)module0657.$ic66$, var110, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
            }
            if (var118_121.eql((SubLObject)module0657.$ic46$)) {
                return module0656.f39789((SubLObject)module0657.$ic67$, var110, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
            }
            return module0656.f39789((SubLObject)module0657.$ic68$, var110, var114, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
        }
        else {
            if (var115.eql((SubLObject)module0657.$ic69$)) {
                final SubLObject var116 = var114;
                return module0656.f39789((SubLObject)module0657.$ic70$, var116, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
            }
            if (!var115.eql((SubLObject)module0657.$ic71$)) {
                return module0656.f39789((SubLObject)module0657.$ic80$, var112, var114, var110, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
            }
            final SubLObject var118_122 = var114;
            if (var118_122.eql((SubLObject)module0657.$ic43$)) {
                if (module0657.NIL != module0161.f10471()) {
                    return module0656.f39789((SubLObject)module0657.$ic72$, var110, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
                }
                return module0656.f39789((SubLObject)module0657.$ic73$, var110, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
            }
            else {
                if (var118_122.eql((SubLObject)module0657.$ic44$)) {
                    return module0656.f39789((SubLObject)module0657.$ic74$, var110, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
                }
                if (var118_122.eql((SubLObject)module0657.$ic75$)) {
                    return module0656.f39789((SubLObject)module0657.$ic76$, var110, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
                }
                if (var118_122.eql((SubLObject)module0657.$ic77$)) {
                    return module0656.f39789((SubLObject)module0657.$ic78$, var110, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
                }
                return module0656.f39789((SubLObject)module0657.$ic79$, var110, var114, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
            }
        }
    }
    
    public static SubLObject f40005() {
        return (SubLObject)ConsesLow.list((SubLObject)module0657.$ic47$, (SubLObject)module0657.$ic49$);
    }
    
    public static SubLObject f40014(final SubLObject var89) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0657.NIL != f40012(var89) && module0657.$ic49$ == conses_high.second(var89));
    }
    
    public static SubLObject f40009(final SubLObject var124) {
        return (SubLObject)ConsesLow.list((SubLObject)module0657.$ic47$, (SubLObject)module0657.$ic57$, var124);
    }
    
    public static SubLObject f40010(final SubLObject var124) {
        return (SubLObject)ConsesLow.list((SubLObject)module0657.$ic47$, (SubLObject)module0657.$ic63$, var124);
    }
    
    public static SubLObject f40011(final SubLObject var124) {
        return (SubLObject)ConsesLow.list((SubLObject)module0657.$ic47$, (SubLObject)module0657.$ic71$, var124);
    }
    
    public static SubLObject f40008(SubLObject var107) {
        if (var107 == module0657.UNPROVIDED) {
            var107 = (SubLObject)module0657.NIL;
        }
        if (module0657.NIL != module0035.f1997(var107)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0657.$ic47$, (SubLObject)module0657.$ic51$, var107.first());
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0657.$ic47$, (SubLObject)module0657.$ic69$, var107);
    }
    
    public static SubLObject f40015() {
        return (SubLObject)module0657.NIL;
    }
    
    public static SubLObject f40016() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0655.$g5116$.getDynamicValue(var4);
    }
    
    public static SubLObject f40017(SubLObject var125, SubLObject var3) {
        if (var125 == module0657.UNPROVIDED) {
            var125 = (SubLObject)module0657.NIL;
        }
        if (var3 == module0657.UNPROVIDED) {
            var3 = (SubLObject)module0657.NIL;
        }
        if (module0657.NIL != f40015()) {
            return f40018(var125, var3);
        }
        return f40019(var125, var3);
    }
    
    public static SubLObject f40018(SubLObject var125, SubLObject var3) {
        if (var125 == module0657.UNPROVIDED) {
            var125 = (SubLObject)module0657.NIL;
        }
        if (var3 == module0657.UNPROVIDED) {
            var3 = (SubLObject)module0657.NIL;
        }
        final SubLObject var127;
        final SubLObject var126 = var127 = var3;
        SubLObject var128 = (SubLObject)module0657.NIL;
        SubLObject var129 = var127;
        SubLObject var130 = (SubLObject)module0657.NIL;
        SubLObject var131_132 = (SubLObject)module0657.NIL;
        while (module0657.NIL != var129) {
            cdestructuring_bind.destructuring_bind_must_consp(var129, var126, (SubLObject)module0657.$ic83$);
            var131_132 = var129.first();
            var129 = var129.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var129, var126, (SubLObject)module0657.$ic83$);
            if (module0657.NIL == conses_high.member(var131_132, (SubLObject)module0657.$ic84$, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED)) {
                var130 = (SubLObject)module0657.T;
            }
            if (var131_132 == module0657.$ic85$) {
                var128 = var129.first();
            }
            var129 = var129.rest();
        }
        if (module0657.NIL != var130 && module0657.NIL == var128) {
            cdestructuring_bind.cdestructuring_bind_error(var126, (SubLObject)module0657.$ic83$);
        }
        final SubLObject var131 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic5$, var127);
        final SubLObject var132 = (module0657.NIL != var131) ? conses_high.cadr(var131) : module0657.$g5185$.getGlobalValue();
        final SubLObject var133 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic86$, var127);
        final SubLObject var134 = (SubLObject)((module0657.NIL != var133) ? conses_high.cadr(var133) : module0657.$ic7$);
        final SubLObject var135 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic87$, var127);
        final SubLObject var136 = (SubLObject)((module0657.NIL != var135) ? conses_high.cadr(var135) : module0657.NIL);
        final SubLObject var137 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic88$, var127);
        final SubLObject var138 = (SubLObject)((module0657.NIL != var137) ? conses_high.cadr(var137) : module0657.$ic89$);
        final SubLObject var139 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic90$, var127);
        final SubLObject var140 = (SubLObject)((module0657.NIL != var139) ? conses_high.cadr(var139) : module0657.$ic91$);
        final SubLObject var141 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic92$, var127);
        final SubLObject var142 = (SubLObject)((module0657.NIL != var141) ? conses_high.cadr(var141) : module0657.NIL);
        final SubLObject var143 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic93$, var127);
        final SubLObject var144 = (module0657.NIL != var143) ? conses_high.cadr(var143) : module0657.$ic94$;
        final SubLObject var145 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic95$, var127);
        final SubLObject var146 = (SubLObject)((module0657.NIL != var145) ? conses_high.cadr(var145) : module0657.$ic96$);
        final SubLObject var147 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic97$, var127);
        final SubLObject var148 = (SubLObject)((module0657.NIL != var147) ? conses_high.cadr(var147) : module0657.TWENTY_INTEGER);
        if (module0657.NIL != var138) {
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019(var138);
            module0642.f39019((SubLObject)module0657.$ic98$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)module0657.UNPROVIDED);
        }
        return (SubLObject)module0657.NIL;
    }
    
    public static SubLObject f40019(SubLObject var125, SubLObject var3) {
        if (var125 == module0657.UNPROVIDED) {
            var125 = (SubLObject)module0657.NIL;
        }
        if (var3 == module0657.UNPROVIDED) {
            var3 = (SubLObject)module0657.NIL;
        }
        final SubLThread var126 = SubLProcess.currentSubLThread();
        final SubLObject var128;
        final SubLObject var127 = var128 = var3;
        SubLObject var129 = (SubLObject)module0657.NIL;
        SubLObject var130 = var128;
        SubLObject var131 = (SubLObject)module0657.NIL;
        SubLObject var155_156 = (SubLObject)module0657.NIL;
        while (module0657.NIL != var130) {
            cdestructuring_bind.destructuring_bind_must_consp(var130, var127, (SubLObject)module0657.$ic99$);
            var155_156 = var130.first();
            var130 = var130.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var130, var127, (SubLObject)module0657.$ic99$);
            if (module0657.NIL == conses_high.member(var155_156, (SubLObject)module0657.$ic100$, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED)) {
                var131 = (SubLObject)module0657.T;
            }
            if (var155_156 == module0657.$ic85$) {
                var129 = var130.first();
            }
            var130 = var130.rest();
        }
        if (module0657.NIL != var131 && module0657.NIL == var129) {
            cdestructuring_bind.cdestructuring_bind_error(var127, (SubLObject)module0657.$ic99$);
        }
        final SubLObject var132 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic5$, var128);
        final SubLObject var133 = (module0657.NIL != var132) ? conses_high.cadr(var132) : module0657.$g5185$.getGlobalValue();
        final SubLObject var134 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic86$, var128);
        final SubLObject var135 = (SubLObject)((module0657.NIL != var134) ? conses_high.cadr(var134) : module0657.$ic7$);
        final SubLObject var136 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic87$, var128);
        final SubLObject var137 = (SubLObject)((module0657.NIL != var136) ? conses_high.cadr(var136) : module0657.NIL);
        final SubLObject var138 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic88$, var128);
        final SubLObject var139 = (SubLObject)((module0657.NIL != var138) ? conses_high.cadr(var138) : module0657.$ic89$);
        final SubLObject var140 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic90$, var128);
        final SubLObject var141 = (SubLObject)((module0657.NIL != var140) ? conses_high.cadr(var140) : module0657.$ic91$);
        final SubLObject var142 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic92$, var128);
        final SubLObject var143 = (SubLObject)((module0657.NIL != var142) ? conses_high.cadr(var142) : module0657.NIL);
        final SubLObject var144 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic95$, var128);
        final SubLObject var145 = (SubLObject)((module0657.NIL != var144) ? conses_high.cadr(var144) : module0657.$ic96$);
        final SubLObject var146 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic97$, var128);
        final SubLObject var147 = (SubLObject)((module0657.NIL != var146) ? conses_high.cadr(var146) : module0657.TWENTY_INTEGER);
        final SubLObject var148 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic101$, var128);
        final SubLObject var149 = (SubLObject)((module0657.NIL != var148) ? conses_high.cadr(var148) : module0657.$ic102$);
        assert module0657.NIL != Types.stringp(var133) : var133;
        assert module0657.NIL != module0004.f105(var145) : var145;
        assert module0657.NIL != module0004.f105(var147) : var147;
        if (module0657.NIL != var135 && !module0657.areAssertionsDisabledFor(me) && module0657.NIL == Types.stringp(var135)) {
            throw new AssertionError(var135);
        }
        final SubLObject var150 = var137;
        assert module0657.NIL != module0035.f2015(var150) : var150;
        SubLObject var151 = var150;
        SubLObject var152 = (SubLObject)module0657.NIL;
        var152 = var151.first();
        while (module0657.NIL != var151) {
            assert module0657.NIL != constant_handles_oc.f8449(var152) : var152;
            var151 = var151.rest();
            var152 = var151.first();
        }
        if (module0657.NIL != var139 && !module0657.areAssertionsDisabledFor(me) && module0657.NIL == Types.stringp(var139)) {
            throw new AssertionError(var139);
        }
        if (module0657.NIL != var143 && !module0657.areAssertionsDisabledFor(me) && module0657.NIL == Types.stringp(var143)) {
            throw new AssertionError(var143);
        }
        if (module0657.NIL != var141 && !module0657.areAssertionsDisabledFor(me) && module0657.NIL == Types.stringp(var141)) {
            throw new AssertionError(var141);
        }
        if (module0657.NIL != var149 && !module0657.areAssertionsDisabledFor(me) && module0657.NIL == Types.keywordp(var149)) {
            throw new AssertionError(var149);
        }
        if (module0657.NIL != var135 || module0657.NIL != var139 || module0657.NIL != var143 || module0657.NIL != var141) {
            if (module0657.NIL != var135) {
                module0666.f40467(var133, var135, (SubLObject)module0657.NIL, (SubLObject)module0657.NIL, (SubLObject)module0657.NIL, var137);
                module0642.f39032((SubLObject)module0657.ONE_INTEGER);
            }
            if (module0657.NIL != var139) {
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019(var139);
                module0642.f39019((SubLObject)module0657.$ic98$);
                module0642.f39020(module0015.$g235$.getGlobalValue());
            }
            if (module0657.NIL != var143 && module0657.NIL != module0655.$g5105$.getDynamicValue(var126)) {
                module0642.f39032((SubLObject)module0657.ONE_INTEGER);
                module0666.f40470(var133, var143);
            }
            if (module0657.NIL != var141) {
                module0642.f39032((SubLObject)module0657.FOUR_INTEGER);
                module0644.f39184(var133, var141);
            }
            module0642.f39026((SubLObject)module0657.UNPROVIDED);
        }
        module0642.f39020(module0015.$g336$.getGlobalValue());
        module0642.f39020(module0015.$g338$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39020(var133);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        if (module0657.NIL != var145) {
            module0642.f39020(module0015.$g340$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            module0642.f39020(var145);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        }
        if (module0657.NIL != var133) {
            module0642.f39020(module0015.$g341$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            module0642.f39020(var133);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        }
        if (module0657.NIL != var147) {
            module0642.f39020(module0015.$g339$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            module0642.f39020(var147);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
        final SubLObject var153 = module0015.$g533$.currentBinding(var126);
        try {
            module0015.$g533$.bind((SubLObject)module0657.T, var126);
            if (module0657.NIL != var125) {
                f40020(var125, var149);
            }
        }
        finally {
            module0015.$g533$.rebind(var153, var126);
        }
        module0642.f39020(module0015.$g337$.getGlobalValue());
        module0642.f39029((SubLObject)module0657.UNPROVIDED);
        f40021(var133, var145, var149, (SubLObject)module0657.UNPROVIDED);
        return (SubLObject)module0657.NIL;
    }
    
    public static SubLObject f40020(final SubLObject var125, final SubLObject var166) {
        final SubLThread var167 = SubLProcess.currentSubLThread();
        module0194.f12114(module0205.f13147(var125, (SubLObject)module0657.$ic109$, (SubLObject)module0657.$ic110$, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED), module0015.$g131$.getDynamicValue(var167), (SubLObject)module0657.ZERO_INTEGER);
        return var125;
    }
    
    public static SubLObject f40021(final SubLObject var7, final SubLObject var147, SubLObject var166, SubLObject var170) {
        if (var166 == module0657.UNPROVIDED) {
            var166 = (SubLObject)module0657.$ic102$;
        }
        if (var170 == module0657.UNPROVIDED) {
            var170 = Time.get_universal_time();
        }
        final SubLThread var171 = SubLProcess.currentSubLThread();
        if (module0657.NIL != f40016()) {
            final SubLObject var172 = (SubLObject)((var166 == module0657.$ic108$) ? module0657.$ic111$ : module0657.$ic112$);
            PrintLow.format(module0015.$g131$.getDynamicValue(var171), (SubLObject)module0657.$ic113$, new SubLObject[] { var7, var147, var170, var172 });
            module0642.f39029((SubLObject)module0657.UNPROVIDED);
            return (SubLObject)module0657.NIL;
        }
        return (SubLObject)module0657.NIL;
    }
    
    public static SubLObject f40022(final SubLObject var74, SubLObject var76) {
        if (var76 == module0657.UNPROVIDED) {
            var76 = (SubLObject)module0657.NIL;
        }
        final SubLThread var77 = SubLProcess.currentSubLThread();
        final SubLObject var79;
        final SubLObject var78 = var79 = var76;
        SubLObject var80 = (SubLObject)module0657.NIL;
        SubLObject var81 = var79;
        SubLObject var82 = (SubLObject)module0657.NIL;
        SubLObject var177_178 = (SubLObject)module0657.NIL;
        while (module0657.NIL != var81) {
            cdestructuring_bind.destructuring_bind_must_consp(var81, var78, (SubLObject)module0657.$ic114$);
            var177_178 = var81.first();
            var81 = var81.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var81, var78, (SubLObject)module0657.$ic114$);
            if (module0657.NIL == conses_high.member(var177_178, (SubLObject)module0657.$ic115$, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED)) {
                var82 = (SubLObject)module0657.T;
            }
            if (var177_178 == module0657.$ic85$) {
                var80 = var81.first();
            }
            var81 = var81.rest();
        }
        if (module0657.NIL != var82 && module0657.NIL == var80) {
            cdestructuring_bind.cdestructuring_bind_error(var78, (SubLObject)module0657.$ic114$);
        }
        final SubLObject var83 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic116$, var79);
        final SubLObject var84 = (SubLObject)((module0657.NIL != var83) ? conses_high.cadr(var83) : module0657.T);
        final SubLObject var85 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic5$, var79);
        final SubLObject var86 = (module0657.NIL != var85) ? conses_high.cadr(var85) : module0657.$g5185$.getGlobalValue();
        final SubLObject var87 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic117$, var79);
        final SubLObject var88 = (SubLObject)((module0657.NIL != var87) ? conses_high.cadr(var87) : module0657.T);
        SubLObject var89 = module0642.f39104(var86, var74);
        if (module0657.NIL == var89) {
            final SubLObject var90 = (SubLObject)((module0657.NIL != var84) ? f40023((SubLObject)module0657.$ic51$) : module0657.NIL);
            return Values.values((SubLObject)module0657.NIL, var90);
        }
        if (module0657.NIL != var88) {
            var89 = module0038.f2933(var89);
        }
        var77.resetMultipleValues();
        final SubLObject var91 = f40024(f40025(var89), var84);
        final SubLObject var92 = var77.secondMultipleValue();
        var77.resetMultipleValues();
        if (module0657.NIL != var92) {
            return Values.values((SubLObject)module0657.NIL, var92, var89);
        }
        return Values.values(var91, (SubLObject)module0657.NIL, (SubLObject)module0657.NIL);
    }
    
    public static SubLObject f40026(final SubLObject var186, SubLObject var2) {
        if (var2 == module0657.UNPROVIDED) {
            var2 = (SubLObject)module0657.NIL;
        }
        assert module0657.NIL != Types.stringp(var186) : var186;
        final SubLObject var187 = reader.read_from_string_ignoring_errors(var186, (SubLObject)module0657.NIL, (SubLObject)module0657.NIL, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
        if (module0657.NIL == module0202.f12590(var187)) {
            module0656.f39789((SubLObject)module0657.$ic120$, var186, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
            return (SubLObject)module0657.NIL;
        }
        if (module0657.NIL != var2 && module0657.NIL == module0274.f18110(var187, var2, (SubLObject)module0657.UNPROVIDED)) {
            module0674.f41156(var187, var2, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
            return (SubLObject)module0657.NIL;
        }
        return var187;
    }
    
    public static SubLObject f40024(SubLObject var184, final SubLObject var180) {
        final SubLThread var185 = SubLProcess.currentSubLThread();
        assert module0657.NIL != Types.stringp(var184) : var184;
        var184 = module0038.f2735(var184);
        if (module0657.NIL != module0038.f2608(var184)) {
            final SubLObject var186 = (SubLObject)((module0657.NIL != var180) ? f40023((SubLObject)module0657.$ic51$) : module0657.NIL);
            return Values.values((SubLObject)module0657.NIL, var186);
        }
        if (module0657.NIL != f40027(var184)) {
            return Values.values((SubLObject)module0657.NIL, f40023((SubLObject)module0657.$ic121$));
        }
        var185.resetMultipleValues();
        SubLObject var187 = reader.read_from_string_ignoring_errors(var184, (SubLObject)module0657.NIL, (SubLObject)module0657.$ic122$, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
        final SubLObject var188 = var185.secondMultipleValue();
        var185.resetMultipleValues();
        var187 = f40028(var187);
        if (module0657.$ic122$ == var187) {
            if (module0657.NIL == module0038.f2873(var184, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED)) {
                return Values.values((SubLObject)module0657.NIL, f40023((SubLObject)module0657.$ic123$));
            }
            return Values.values((SubLObject)module0657.NIL, f40023((SubLObject)module0657.$ic122$));
        }
        else {
            if (module0657.$ic124$ == var188) {
                return Values.values((SubLObject)module0657.NIL, f40023((SubLObject)module0657.$ic125$));
            }
            if (module0657.NIL != module0205.f13183(var187, (SubLObject)module0657.$ic126$, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED)) {
                return Values.values((SubLObject)module0657.NIL, f40023((SubLObject)module0657.$ic127$));
            }
            if (module0657.NIL == module0207.f13509(var187)) {
                return Values.values((SubLObject)module0657.NIL, f40023((SubLObject)module0657.$ic128$));
            }
            return Values.values(var187, (SubLObject)module0657.NIL);
        }
    }
    
    public static SubLObject f40028(SubLObject var189) {
        SubLObject var190 = module0205.f13183(var189, (SubLObject)module0657.$ic2$, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
        SubLObject var191 = (SubLObject)module0657.NIL;
        var191 = var190.first();
        while (module0657.NIL != var190) {
            final SubLObject var192 = module0209.f13561(var191);
            if (!var192.equal(var191)) {
                var189 = module0205.f13251(var192, var191, var189, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
            }
            var190 = var190.rest();
            var191 = var190.first();
        }
        return var189;
    }
    
    public static SubLObject f40029(final SubLObject var186) {
        final SubLObject var187 = module0038.f2738(var186, (SubLObject)module0657.$ic129$, (SubLObject)module0657.NIL, (SubLObject)module0657.T, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
        SubLObject var188 = (SubLObject)module0657.NIL;
        SubLObject var189 = (SubLObject)module0657.NIL;
        SubLObject var190 = var187;
        SubLObject var191 = (SubLObject)module0657.NIL;
        var191 = var190.first();
        while (module0657.NIL != var190) {
            if (module0657.NIL != var188) {
                if (var191.equal((SubLObject)module0657.$ic130$)) {
                    var188 = (SubLObject)module0657.NIL;
                }
            }
            else if (var191.equal((SubLObject)module0657.$ic130$)) {
                var188 = (SubLObject)module0657.T;
            }
            else {
                var189 = ConsesLow.append(var189, module0038.f2935(var191, (SubLObject)module0657.T));
            }
            var190 = var190.rest();
            var191 = var190.first();
        }
        return var189;
    }
    
    public static SubLObject f40025(final SubLObject var195) {
        SubLObject var196 = module0038.f2659((SubLObject)module0657.$ic0$, Strings.make_string((SubLObject)module0657.ONE_INTEGER, (SubLObject)Characters.CHAR_return), var195, (SubLObject)module0657.UNPROVIDED);
        var196 = module0038.f2823(var196);
        return var196;
    }
    
    public static SubLObject f40027(final SubLObject var186) {
        return module0035.sublisp_boolean(f40029(var186));
    }
    
    public static SubLObject f40030(final SubLObject var112) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0657.NIL != module0035.f2014(var112) && module0657.NIL != module0035.f1995(var112, (SubLObject)module0657.TWO_INTEGER, (SubLObject)module0657.UNPROVIDED) && module0657.$ic131$ == var112.first());
    }
    
    public static SubLObject f40031(final SubLObject var185, SubLObject var184, SubLObject var197) {
        if (var184 == module0657.UNPROVIDED) {
            var184 = (SubLObject)module0657.NIL;
        }
        if (var197 == module0657.UNPROVIDED) {
            var197 = (SubLObject)module0657.NIL;
        }
        assert module0657.NIL != f40030(var185) : var185;
        if (module0657.NIL != var184 && !module0657.areAssertionsDisabledFor(me) && module0657.NIL == Types.stringp(var184)) {
            throw new AssertionError(var184);
        }
        final SubLObject var199;
        final SubLObject var198 = var199 = var197;
        final SubLObject var200 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic133$, var199);
        final SubLObject var201 = (SubLObject)((module0657.NIL != var200) ? conses_high.cadr(var200) : module0657.NIL);
        if (module0657.NIL != var201 && !module0657.areAssertionsDisabledFor(me) && module0657.NIL == Types.stringp(var201)) {
            throw new AssertionError(var201);
        }
        SubLObject var202 = (SubLObject)module0657.NIL;
        SubLObject var203 = (SubLObject)module0657.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var185, var185, (SubLObject)module0657.$ic134$);
        var202 = var185.first();
        SubLObject var204_205 = var185.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var204_205, var185, (SubLObject)module0657.$ic134$);
        var203 = var204_205.first();
        var204_205 = var204_205.rest();
        if (module0657.NIL == var204_205) {
            final SubLObject var204 = var203;
            if (var204.eql((SubLObject)module0657.$ic51$)) {
                SubLObject var205 = (SubLObject)module0657.NIL;
                if (module0657.NIL != var201) {
                    var205 = Sequences.cconcatenate((SubLObject)module0657.$ic135$, new SubLObject[] { var201, module0657.$ic136$ });
                }
                else {
                    var205 = (SubLObject)module0657.$ic137$;
                }
                module0656.f39789((SubLObject)module0657.$ic138$, var205, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
            }
            else if (var204.eql((SubLObject)module0657.$ic121$)) {
                SubLObject var205 = (SubLObject)module0657.NIL;
                if (module0657.NIL != var201) {
                    var205 = Sequences.cconcatenate((SubLObject)module0657.$ic139$, var201);
                }
                else {
                    var205 = (SubLObject)module0657.$ic140$;
                }
                f40032(var205, (SubLObject)module0657.$ic141$, var184);
            }
            else if (var204.eql((SubLObject)module0657.$ic123$)) {
                SubLObject var205 = (SubLObject)module0657.NIL;
                if (module0657.NIL != var201) {
                    var205 = Sequences.cconcatenate((SubLObject)module0657.$ic142$, var201);
                }
                else {
                    var205 = (SubLObject)module0657.$ic143$;
                }
                f40032(var205, (SubLObject)module0657.$ic144$, var184);
            }
            else if (var204.eql((SubLObject)module0657.$ic122$)) {
                SubLObject var205 = (SubLObject)module0657.NIL;
                if (module0657.NIL != var201) {
                    var205 = Sequences.cconcatenate((SubLObject)module0657.$ic145$, var201);
                }
                else {
                    var205 = (SubLObject)module0657.$ic146$;
                }
                f40032(var205, (SubLObject)module0657.$ic147$, var184);
            }
            else if (var204.eql((SubLObject)module0657.$ic125$)) {
                SubLObject var205 = (SubLObject)module0657.NIL;
                if (module0657.NIL != var201) {
                    var205 = Sequences.cconcatenate((SubLObject)module0657.$ic148$, var201);
                }
                else {
                    var205 = (SubLObject)module0657.$ic149$;
                }
                f40032(var205, (SubLObject)module0657.$ic150$, var184);
            }
            else if (var204.eql((SubLObject)module0657.$ic127$)) {
                SubLObject var205 = (SubLObject)module0657.NIL;
                if (module0657.NIL != var201) {
                    var205 = Sequences.cconcatenate((SubLObject)module0657.$ic139$, var201);
                }
                else {
                    var205 = (SubLObject)module0657.$ic140$;
                }
                f40032(var205, (SubLObject)module0657.$ic151$, var184);
            }
            else if (var204.eql((SubLObject)module0657.$ic128$)) {
                SubLObject var205 = (SubLObject)module0657.NIL;
                if (module0657.NIL != var201) {
                    var205 = Sequences.cconcatenate((SubLObject)module0657.$ic152$, var201);
                }
                else {
                    var205 = (SubLObject)module0657.$ic153$;
                }
                f40032(var205, (SubLObject)module0657.$ic154$, var184);
            }
            else {
                module0656.f39789((SubLObject)module0657.$ic138$, var203, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var185, (SubLObject)module0657.$ic134$);
        }
        return (SubLObject)module0657.NIL;
    }
    
    public static SubLObject f40023(final SubLObject var116) {
        return (SubLObject)ConsesLow.list((SubLObject)module0657.$ic131$, var116);
    }
    
    public static SubLObject f40032(final SubLObject var208, final SubLObject var209, final SubLObject var207) {
        final SubLThread var210 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)module0657.$ic155$);
        module0642.f39029((SubLObject)module0657.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0642.f39029((SubLObject)module0657.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019(var208);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0657.UNPROVIDED);
        final SubLObject var211 = module0015.$g132$.getDynamicValue(var210);
        final SubLObject var212 = module0015.$g535$.currentBinding(var210);
        try {
            module0015.$g535$.bind((SubLObject)module0657.T, var210);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (module0657.NIL != var211) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39020(module0642.f39042(var211));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
            final SubLObject var6_211 = module0015.$g533$.currentBinding(var210);
            try {
                module0015.$g533$.bind((SubLObject)module0657.T, var210);
                module0642.f39020(module0015.$g189$.getGlobalValue());
                module0642.f39020((SubLObject)module0657.TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                module0642.f39019(var208);
                module0642.f39020(module0015.$g190$.getGlobalValue());
                module0642.f39020((SubLObject)module0657.TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                Functions.funcall(var209, var207);
                module0656.f39790((SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
                module0642.f39029((SubLObject)module0657.UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var6_211, var210);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0657.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var212, var210);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0657.UNPROVIDED);
        return (SubLObject)module0657.NIL;
    }
    
    public static SubLObject f40033(SubLObject var212, SubLObject var3) {
        if (var212 == module0657.UNPROVIDED) {
            var212 = (SubLObject)module0657.NIL;
        }
        if (var3 == module0657.UNPROVIDED) {
            var3 = (SubLObject)module0657.NIL;
        }
        final SubLThread var213 = SubLProcess.currentSubLThread();
        final SubLObject var215;
        final SubLObject var214 = var215 = var3;
        final SubLObject var216 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic5$, var215);
        final SubLObject var217 = (module0657.NIL != var216) ? conses_high.cadr(var216) : module0657.$g5186$.getGlobalValue();
        final SubLObject var218 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic86$, var215);
        final SubLObject var219 = (SubLObject)((module0657.NIL != var218) ? conses_high.cadr(var218) : module0657.$ic7$);
        final SubLObject var220 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic88$, var215);
        final SubLObject var221 = (SubLObject)((module0657.NIL != var220) ? conses_high.cadr(var220) : module0657.NIL);
        final SubLObject var222 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic90$, var215);
        final SubLObject var223 = (SubLObject)((module0657.NIL != var222) ? conses_high.cadr(var222) : module0657.$ic157$);
        final SubLObject var224 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic92$, var215);
        final SubLObject var225 = (SubLObject)((module0657.NIL != var224) ? conses_high.cadr(var224) : module0657.NIL);
        assert module0657.NIL != Types.stringp(var217) : var217;
        if (module0657.NIL != var219 && !module0657.areAssertionsDisabledFor(me) && module0657.NIL == Types.stringp(var219)) {
            throw new AssertionError(var219);
        }
        if (module0657.NIL != var221 && !module0657.areAssertionsDisabledFor(me) && module0657.NIL == Types.stringp(var221)) {
            throw new AssertionError(var221);
        }
        if (module0657.NIL != var225 && !module0657.areAssertionsDisabledFor(me) && module0657.NIL == Types.stringp(var225)) {
            throw new AssertionError(var225);
        }
        if (module0657.NIL != var223 && !module0657.areAssertionsDisabledFor(me) && module0657.NIL == Types.stringp(var223)) {
            throw new AssertionError(var223);
        }
        if (module0657.NIL == var219 && module0657.NIL == var221 && module0657.NIL == var225 && module0657.NIL == var223) {
            return f40034(var212, var3);
        }
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39020((SubLObject)module0657.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39020((SubLObject)module0657.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39020((SubLObject)module0657.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
        final SubLObject var226 = module0015.$g533$.currentBinding(var213);
        try {
            module0015.$g533$.bind((SubLObject)module0657.T, var213);
            if ((module0657.NIL != var225 && module0657.NIL != module0655.$g5105$.getDynamicValue(var213)) || module0657.NIL != var223) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                final SubLObject var6_220 = module0015.$g533$.currentBinding(var213);
                try {
                    module0015.$g533$.bind((SubLObject)module0657.T, var213);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g371$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                    module0642.f39020((SubLObject)module0657.TWO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                    final SubLObject var6_221 = module0015.$g533$.currentBinding(var213);
                    try {
                        module0015.$g533$.bind((SubLObject)module0657.T, var213);
                        if (module0657.NIL != var225 && module0657.NIL != module0655.$g5105$.getDynamicValue(var213)) {
                            module0666.f40470(var217, var225);
                        }
                        if (module0657.NIL != var223) {
                            module0642.f39032((SubLObject)module0657.ONE_INTEGER);
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
                module0642.f39029((SubLObject)module0657.UNPROVIDED);
            }
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
            final SubLObject var6_222 = module0015.$g533$.currentBinding(var213);
            try {
                module0015.$g533$.bind((SubLObject)module0657.T, var213);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                final SubLObject var6_223 = module0015.$g533$.currentBinding(var213);
                try {
                    module0015.$g533$.bind((SubLObject)module0657.T, var213);
                    if (module0657.NIL != var221) {
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019(var221);
                        module0642.f39019((SubLObject)module0657.$ic98$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                    }
                }
                finally {
                    module0015.$g533$.rebind(var6_223, var213);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                final SubLObject var6_224 = module0015.$g533$.currentBinding(var213);
                try {
                    module0015.$g533$.bind((SubLObject)module0657.T, var213);
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
            module0642.f39029((SubLObject)module0657.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var226, var213);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0657.NIL;
    }
    
    public static SubLObject f40034(SubLObject var212, SubLObject var3) {
        if (var212 == module0657.UNPROVIDED) {
            var212 = (SubLObject)module0657.NIL;
        }
        if (var3 == module0657.UNPROVIDED) {
            var3 = (SubLObject)module0657.NIL;
        }
        final SubLThread var213 = SubLProcess.currentSubLThread();
        final SubLObject var215;
        final SubLObject var214 = var215 = var3;
        final SubLObject var216 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic5$, var215);
        final SubLObject var217 = (module0657.NIL != var216) ? conses_high.cadr(var216) : module0657.$g5186$.getGlobalValue();
        final SubLObject var218 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic158$, var215);
        final SubLObject var219 = (SubLObject)((module0657.NIL != var218) ? conses_high.cadr(var218) : module0657.NIL);
        final SubLObject var220 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic95$, var215);
        final SubLObject var221 = (SubLObject)((module0657.NIL != var220) ? conses_high.cadr(var220) : module0657.$ic159$);
        final SubLObject var222 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic97$, var215);
        final SubLObject var223 = (SubLObject)((module0657.NIL != var222) ? conses_high.cadr(var222) : module0657.ONE_INTEGER);
        assert module0657.NIL != Types.stringp(var217) : var217;
        assert module0657.NIL != module0004.f105(var221) : var221;
        assert module0657.NIL != module0004.f105(var223) : var223;
        final SubLObject var225;
        final SubLObject var224 = var225 = module0038.f2624(module0015.f793((SubLObject)module0657.UNPROVIDED));
        final SubLObject var226 = Sequences.cconcatenate((SubLObject)module0657.$ic160$, var224);
        final SubLObject var227 = Sequences.cconcatenate((SubLObject)module0657.$ic161$, var224);
        final SubLObject var228 = Sequences.cconcatenate((SubLObject)module0657.$ic162$, new SubLObject[] { module0006.f203(var221), module0657.$ic163$ });
        final SubLObject var229 = Sequences.cconcatenate((SubLObject)module0657.$ic162$, new SubLObject[] { module0006.f203(var221), module0657.$ic164$ });
        final SubLObject var230 = (SubLObject)((module0657.NIL != var212) ? module0194.f12113(var212, (SubLObject)module0657.ZERO_INTEGER) : module0657.$ic0$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        if (module0657.NIL != var225) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            module0642.f39020(var225);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        }
        module0642.f39020(module0015.$g158$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39020((SubLObject)module0657.$ic165$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39020(module0015.$g147$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39020(var228);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
        final SubLObject var231 = module0015.$g533$.currentBinding(var213);
        try {
            module0015.$g533$.bind((SubLObject)module0657.T, var213);
            if (var223.numG((SubLObject)module0657.ONE_INTEGER)) {
                module0642.f39020(module0015.$g336$.getGlobalValue());
                module0642.f39020(module0015.$g338$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39020(var217);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                if (module0657.NIL != var227) {
                    module0642.f39020(module0015.$g341$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                    module0642.f39020(var227);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                }
                if (module0657.NIL != var223) {
                    module0642.f39020(module0015.$g339$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                    module0642.f39020(var223);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                }
                if (module0657.NIL != var229) {
                    module0642.f39020(module0015.$g342$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                    module0642.f39020(var229);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                final SubLObject var6_239 = module0015.$g533$.currentBinding(var213);
                try {
                    module0015.$g533$.bind((SubLObject)module0657.T, var213);
                    if (module0657.NIL != var212) {
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
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39020(module0015.$g317$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39020(module0015.$g306$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39020(var229);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                if (module0657.NIL != var227) {
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                    module0642.f39020(var227);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                }
                if (module0657.NIL != var217) {
                    module0642.f39020(module0015.$g302$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                    module0642.f39020(var217);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                }
                if (module0657.NIL != var230) {
                    module0642.f39020(module0015.$g307$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                    module0642.f39019(var230);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
            }
            module0642.f39020(module0015.$g144$.getGlobalValue());
            if (module0657.NIL != var226) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39020(var226);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            }
            module0642.f39020(module0015.$g158$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            module0642.f39020((SubLObject)module0657.$ic166$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
            final SubLObject var6_240 = module0015.$g533$.currentBinding(var213);
            try {
                module0015.$g533$.bind((SubLObject)module0657.T, var213);
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
        module0666.f40486(var227, var226, (SubLObject)module0657.TWENTY_INTEGER, (SubLObject)module0657.TWO_INTEGER, (SubLObject)module0657.NIL, var219);
        module0642.f39029((SubLObject)module0657.UNPROVIDED);
        return (SubLObject)module0657.NIL;
    }
    
    public static SubLObject f40035(final SubLObject var74, SubLObject var76) {
        if (var76 == module0657.UNPROVIDED) {
            var76 = (SubLObject)module0657.NIL;
        }
        final SubLThread var77 = SubLProcess.currentSubLThread();
        final SubLObject var79;
        final SubLObject var78 = var79 = var76;
        SubLObject var80 = (SubLObject)module0657.NIL;
        SubLObject var81 = var79;
        SubLObject var82 = (SubLObject)module0657.NIL;
        SubLObject var246_247 = (SubLObject)module0657.NIL;
        while (module0657.NIL != var81) {
            cdestructuring_bind.destructuring_bind_must_consp(var81, var78, (SubLObject)module0657.$ic167$);
            var246_247 = var81.first();
            var81 = var81.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var81, var78, (SubLObject)module0657.$ic167$);
            if (module0657.NIL == conses_high.member(var246_247, (SubLObject)module0657.$ic115$, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED)) {
                var82 = (SubLObject)module0657.T;
            }
            if (var246_247 == module0657.$ic85$) {
                var80 = var81.first();
            }
            var81 = var81.rest();
        }
        if (module0657.NIL != var82 && module0657.NIL == var80) {
            cdestructuring_bind.cdestructuring_bind_error(var78, (SubLObject)module0657.$ic167$);
        }
        final SubLObject var83 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic116$, var79);
        final SubLObject var84 = (SubLObject)((module0657.NIL != var83) ? conses_high.cadr(var83) : module0657.T);
        final SubLObject var85 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic5$, var79);
        final SubLObject var86 = (module0657.NIL != var85) ? conses_high.cadr(var85) : module0657.$g5186$.getGlobalValue();
        final SubLObject var87 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic117$, var79);
        final SubLObject var88 = (SubLObject)((module0657.NIL != var87) ? conses_high.cadr(var87) : module0657.T);
        SubLObject var89 = module0642.f39104(var86, var74);
        if (module0657.NIL == var89) {
            final SubLObject var90 = (SubLObject)((module0657.NIL != var84) ? f40036((SubLObject)module0657.$ic51$) : module0657.NIL);
            return Values.values((SubLObject)module0657.NIL, var90);
        }
        if (module0657.NIL != var88) {
            var89 = module0038.f2933(var89);
        }
        var77.resetMultipleValues();
        final SubLObject var91 = f40037(f40025(var89), var84);
        final SubLObject var92 = var77.secondMultipleValue();
        var77.resetMultipleValues();
        if (module0657.NIL != var92) {
            return Values.values((SubLObject)module0657.NIL, var92, var89);
        }
        return Values.values(var91, (SubLObject)module0657.NIL, (SubLObject)module0657.NIL);
    }
    
    public static SubLObject f40037(SubLObject var251, final SubLObject var180) {
        final SubLThread var252 = SubLProcess.currentSubLThread();
        assert module0657.NIL != Types.stringp(var251) : var251;
        var251 = module0038.f2735(var251);
        if (module0657.NIL != module0038.f2608(var251)) {
            final SubLObject var253 = (SubLObject)((module0657.NIL != var180) ? f40036((SubLObject)module0657.$ic51$) : module0657.NIL);
            return Values.values((SubLObject)module0657.NIL, var253);
        }
        if (module0657.NIL != f40027(var251)) {
            return Values.values((SubLObject)module0657.NIL, f40036((SubLObject)module0657.$ic121$));
        }
        var252.resetMultipleValues();
        final SubLObject var254 = reader.read_from_string_ignoring_errors(var251, (SubLObject)module0657.NIL, (SubLObject)module0657.$ic122$, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
        final SubLObject var255 = var252.secondMultipleValue();
        var252.resetMultipleValues();
        if (module0657.$ic122$ == var254) {
            if (module0657.NIL == module0038.f2873(var251, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED)) {
                return Values.values((SubLObject)module0657.NIL, f40036((SubLObject)module0657.$ic123$));
            }
            return Values.values((SubLObject)module0657.NIL, f40036((SubLObject)module0657.$ic122$));
        }
        else {
            if (module0657.$ic124$ == var255) {
                return Values.values((SubLObject)module0657.NIL, f40036((SubLObject)module0657.$ic125$));
            }
            if (module0657.NIL != module0205.f13183(var254, (SubLObject)module0657.$ic126$, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED)) {
                return Values.values((SubLObject)module0657.NIL, f40036((SubLObject)module0657.$ic127$));
            }
            return Values.values(var254, (SubLObject)module0657.NIL);
        }
    }
    
    public static SubLObject f40038(final SubLObject var112) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0657.NIL != module0035.f2014(var112) && module0657.NIL != module0035.f1995(var112, (SubLObject)module0657.TWO_INTEGER, (SubLObject)module0657.UNPROVIDED) && module0657.$ic168$ == var112.first());
    }
    
    public static SubLObject f40039(final SubLObject var252, SubLObject var251, SubLObject var197) {
        if (var251 == module0657.UNPROVIDED) {
            var251 = (SubLObject)module0657.NIL;
        }
        if (var197 == module0657.UNPROVIDED) {
            var197 = (SubLObject)module0657.NIL;
        }
        assert module0657.NIL != f40038(var252) : var252;
        if (module0657.NIL != var251 && !module0657.areAssertionsDisabledFor(me) && module0657.NIL == Types.stringp(var251)) {
            throw new AssertionError(var251);
        }
        final SubLObject var254;
        final SubLObject var253 = var254 = var197;
        final SubLObject var255 = cdestructuring_bind.property_list_member((SubLObject)module0657.$ic133$, var254);
        final SubLObject var256 = (SubLObject)((module0657.NIL != var255) ? conses_high.cadr(var255) : module0657.NIL);
        if (module0657.NIL != var256 && !module0657.areAssertionsDisabledFor(me) && module0657.NIL == Types.stringp(var256)) {
            throw new AssertionError(var256);
        }
        SubLObject var257 = (SubLObject)module0657.NIL;
        SubLObject var258 = (SubLObject)module0657.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var252, var252, (SubLObject)module0657.$ic170$);
        var257 = var252.first();
        SubLObject var258_259 = var252.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var258_259, var252, (SubLObject)module0657.$ic170$);
        var258 = var258_259.first();
        var258_259 = var258_259.rest();
        if (module0657.NIL == var258_259) {
            final SubLObject var259 = var258;
            if (var259.eql((SubLObject)module0657.$ic51$)) {
                SubLObject var260 = (SubLObject)module0657.NIL;
                if (module0657.NIL != var256) {
                    var260 = Sequences.cconcatenate((SubLObject)module0657.$ic171$, new SubLObject[] { var256, module0657.$ic136$ });
                }
                else {
                    var260 = (SubLObject)module0657.$ic172$;
                }
                module0656.f39789((SubLObject)module0657.$ic138$, var260, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
            }
            else if (var259.eql((SubLObject)module0657.$ic121$)) {
                SubLObject var260 = (SubLObject)module0657.NIL;
                if (module0657.NIL != var256) {
                    var260 = Sequences.cconcatenate((SubLObject)module0657.$ic139$, var256);
                }
                else {
                    var260 = (SubLObject)module0657.$ic140$;
                }
                f40040(var260, (SubLObject)module0657.$ic141$, var251);
            }
            else if (var259.eql((SubLObject)module0657.$ic123$)) {
                SubLObject var260 = (SubLObject)module0657.NIL;
                if (module0657.NIL != var256) {
                    var260 = Sequences.cconcatenate((SubLObject)module0657.$ic142$, var256);
                }
                else {
                    var260 = (SubLObject)module0657.$ic143$;
                }
                f40040(var260, (SubLObject)module0657.$ic144$, var251);
            }
            else if (var259.eql((SubLObject)module0657.$ic122$)) {
                SubLObject var260 = (SubLObject)module0657.NIL;
                if (module0657.NIL != var256) {
                    var260 = Sequences.cconcatenate((SubLObject)module0657.$ic173$, var256);
                }
                else {
                    var260 = (SubLObject)module0657.$ic174$;
                }
                f40040(var260, (SubLObject)module0657.$ic147$, var251);
            }
            else if (var259.eql((SubLObject)module0657.$ic125$)) {
                SubLObject var260 = (SubLObject)module0657.NIL;
                if (module0657.NIL != var256) {
                    var260 = Sequences.cconcatenate((SubLObject)module0657.$ic175$, var256);
                }
                else {
                    var260 = (SubLObject)module0657.$ic176$;
                }
                f40040(var260, (SubLObject)module0657.$ic150$, var251);
            }
            else if (var259.eql((SubLObject)module0657.$ic127$)) {
                SubLObject var260 = (SubLObject)module0657.NIL;
                if (module0657.NIL != var256) {
                    var260 = Sequences.cconcatenate((SubLObject)module0657.$ic139$, var256);
                }
                else {
                    var260 = (SubLObject)module0657.$ic140$;
                }
                f40040(var260, (SubLObject)module0657.$ic151$, var251);
            }
            else {
                module0656.f39789((SubLObject)module0657.$ic138$, var258, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var252, (SubLObject)module0657.$ic170$);
        }
        return (SubLObject)module0657.NIL;
    }
    
    public static SubLObject f40036(final SubLObject var116) {
        return (SubLObject)ConsesLow.list((SubLObject)module0657.$ic168$, var116);
    }
    
    public static SubLObject f40040(final SubLObject var208, final SubLObject var209, final SubLObject var207) {
        final SubLThread var210 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)module0657.$ic155$);
        module0642.f39029((SubLObject)module0657.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0642.f39029((SubLObject)module0657.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019(var208);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0657.UNPROVIDED);
        final SubLObject var211 = module0015.$g132$.getDynamicValue(var210);
        final SubLObject var212 = module0015.$g535$.currentBinding(var210);
        try {
            module0015.$g535$.bind((SubLObject)module0657.T, var210);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (module0657.NIL != var211) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
                module0642.f39020(module0642.f39042(var211));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0657.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
            final SubLObject var6_261 = module0015.$g533$.currentBinding(var210);
            try {
                module0015.$g533$.bind((SubLObject)module0657.T, var210);
                module0642.f39020(module0015.$g189$.getGlobalValue());
                module0642.f39020((SubLObject)module0657.TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                module0642.f39019(var208);
                module0642.f39020(module0015.$g190$.getGlobalValue());
                module0642.f39020((SubLObject)module0657.TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0657.UNPROVIDED);
                Functions.funcall(var209, var207);
                module0656.f39790((SubLObject)module0657.UNPROVIDED, (SubLObject)module0657.UNPROVIDED);
                module0642.f39029((SubLObject)module0657.UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var6_261, var210);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0657.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var212, var210);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0657.UNPROVIDED);
        return (SubLObject)module0657.NIL;
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
        return (SubLObject)module0657.NIL;
    }
    
    public static SubLObject f40042() {
        module0657.$g5184$ = SubLFiles.deflexical("S#44044", (SubLObject)module0657.$ic1$);
        module0657.$g5185$ = SubLFiles.deflexical("S#44045", (SubLObject)module0657.$ic82$);
        module0657.$g5186$ = SubLFiles.deflexical("S#44046", (SubLObject)module0657.$ic156$);
        return (SubLObject)module0657.NIL;
    }
    
    public static SubLObject f40043() {
        module0002.f35((SubLObject)module0657.$ic118$, (SubLObject)module0657.$ic119$);
        module0027.f1449((SubLObject)module0657.$ic177$, (SubLObject)ConsesLow.list(new SubLObject[] { module0657.$ic178$, module0657.EQUAL, module0657.$ic179$, module0657.NIL, module0657.$ic180$, module0657.NIL, module0657.$ic181$, module0657.$ic182$, module0657.$ic183$, module0657.T }), (SubLObject)module0657.$ic184$);
        return (SubLObject)module0657.NIL;
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
        module0657.$g5184$ = null;
        module0657.$g5185$ = null;
        module0657.$g5186$ = null;
        $ic0$ = SubLObjectFactory.makeString("");
        $ic1$ = SubLObjectFactory.makeString("mt");
        $ic2$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic3$ = SubLObjectFactory.makeString("~A-monad-dimension-specified");
        $ic4$ = SubLObjectFactory.makeKeyword("EDIT-ALLOWED?");
        $ic5$ = SubLObjectFactory.makeKeyword("INPUT-NAME");
        $ic6$ = SubLObjectFactory.makeKeyword("MONAD-CHOICES");
        $ic7$ = SubLObjectFactory.makeString("Complete");
        $ic8$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $ic9$ = SubLObjectFactory.makeString("Mt : ");
        $ic10$ = SubLObjectFactory.makeString("Clear Mt");
        $ic11$ = SubLObjectFactory.makeKeyword("TOP");
        $ic12$ = SubLObjectFactory.makeString("t");
        $ic13$ = SubLObjectFactory.makeKeyword("LEFT");
        $ic14$ = SubLObjectFactory.makeString("Monad Dimension");
        $ic15$ = SubLObjectFactory.makeKeyword("RIGHT");
        $ic16$ = SubLObjectFactory.makeString("Monad Mt : ");
        $ic17$ = SubLObjectFactory.makeString("autocomplete-");
        $ic18$ = SubLObjectFactory.makeString("input-");
        $ic19$ = SubLObjectFactory.makeString("autocomplete-results-");
        $ic20$ = SubLObjectFactory.makeString("yui-ac");
        $ic21$ = SubLObjectFactory.makeString("position:static");
        $ic22$ = SubLObjectFactory.makeString("yui-ac-input");
        $ic23$ = SubLObjectFactory.makeString("yui-ac-container");
        $ic24$ = SubLObjectFactory.makeString("~A-monad");
        $ic25$ = SubLObjectFactory.makeString("~A-time-dimension-specified");
        $ic26$ = SubLObjectFactory.makeKeyword("ANYTIME-PSC-ALLOWED?");
        $ic27$ = SubLObjectFactory.makeString("na");
        $ic28$ = SubLObjectFactory.makeString("Time Dimension");
        $ic29$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Always-TimeInterval")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Now")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Now-Indexical")));
        $ic30$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TimeInterval"));
        $ic31$ = SubLObjectFactory.makeString("Time ");
        $ic32$ = SubLObjectFactory.makeString("Interval : ");
        $ic33$ = SubLObjectFactory.makeString("Clear Interval");
        $ic34$ = SubLObjectFactory.makeString("~A-time-interval");
        $ic35$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Null-TimeParameter")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TimePoint")));
        $ic36$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TimeParameter"));
        $ic37$ = SubLObjectFactory.makeString("Parameter : ");
        $ic38$ = SubLObjectFactory.makeString("Clear Parameter");
        $ic39$ = SubLObjectFactory.makeString("~A-time-parameter");
        $ic40$ = SubLObjectFactory.makeKeyword("ALLOW-VARIABLE?");
        $ic41$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic42$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AnytimePSC"));
        $ic43$ = SubLObjectFactory.makeKeyword("MONAD-MT");
        $ic44$ = SubLObjectFactory.makeKeyword("TIME-MT");
        $ic45$ = SubLObjectFactory.makeKeyword("TIME-INTERVAL");
        $ic46$ = SubLObjectFactory.makeKeyword("TIME-PARAMETER");
        $ic47$ = SubLObjectFactory.makeKeyword("MT-ERROR");
        $ic48$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44047", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44048", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#44049", "CYC"));
        $ic49$ = SubLObjectFactory.makeKeyword("WHOLLY-UNSPECIFIED");
        $ic50$ = SubLObjectFactory.makeString("No microtheory was specified.");
        $ic51$ = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $ic52$ = SubLObjectFactory.makeString("No monadic microtheory was specified.");
        $ic53$ = SubLObjectFactory.makeString("No microtheory time dimension was specified.");
        $ic54$ = SubLObjectFactory.makeString("No microtheory time interval was specified.");
        $ic55$ = SubLObjectFactory.makeString("No microtheory time parameter was specified.");
        $ic56$ = SubLObjectFactory.makeString("The MT part ~A was not specified.");
        $ic57$ = SubLObjectFactory.makeKeyword("UNINTELLIGIBLE");
        $ic58$ = SubLObjectFactory.makeString("The string ~S did not make sense as a microtheory.");
        $ic59$ = SubLObjectFactory.makeString("The string ~S did not make sense as a microtheory time dimension.");
        $ic60$ = SubLObjectFactory.makeString("The string ~S did not make sense as a time interval.");
        $ic61$ = SubLObjectFactory.makeString("The string ~S did not make sense as a time parameter.");
        $ic62$ = SubLObjectFactory.makeString("The string ~S did not make sense for MT part ~A.");
        $ic63$ = SubLObjectFactory.makeKeyword("UNMATCHED-PAREN");
        $ic64$ = SubLObjectFactory.makeString("Unmatched Parentheses in microtheory ~S.");
        $ic65$ = SubLObjectFactory.makeString("Unmatched Parentheses in microtheory time dimension ~S.");
        $ic66$ = SubLObjectFactory.makeString("Unmatched Parentheses in time interval ~S.");
        $ic67$ = SubLObjectFactory.makeString("Unmatched Parentheses in time parameter ~S.");
        $ic68$ = SubLObjectFactory.makeString("Unmatched Parentheses in mt part ~S.");
        $ic69$ = SubLObjectFactory.makeKeyword("INCOMPLETELY-SPECIFIED");
        $ic70$ = SubLObjectFactory.makeString("MT parts ~S were unspecified.");
        $ic71$ = SubLObjectFactory.makeKeyword("SEMANTIC");
        $ic72$ = SubLObjectFactory.makeString("~S did not specify a monadic microtheory.");
        $ic73$ = SubLObjectFactory.makeString("~S did not specify a microtheory.");
        $ic74$ = SubLObjectFactory.makeString("~S did not specify a microtheory time dimension.");
        $ic75$ = SubLObjectFactory.makeKeyword("NON-TIME-INTERVAL");
        $ic76$ = SubLObjectFactory.makeString("~S did not specify a time interval.");
        $ic77$ = SubLObjectFactory.makeKeyword("NON-TIME-PARAMETER");
        $ic78$ = SubLObjectFactory.makeString("~S did not specify a time parameter.");
        $ic79$ = SubLObjectFactory.makeString("~S did not specify a term suitable for MT part ~A.");
        $ic80$ = SubLObjectFactory.makeString("MT ERROR ~S : ~S ~S ~S");
        $ic81$ = SubLObjectFactory.makeString("~S : ~S");
        $ic82$ = SubLObjectFactory.makeString("sentence");
        $ic83$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44050", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44045", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44051", "CYC"), (SubLObject)SubLObjectFactory.makeString("Complete")), SubLObjectFactory.makeSymbol("S#44052", "CYC"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15027", "CYC"), (SubLObject)SubLObjectFactory.makeString("EL Sentence")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44053", "CYC"), (SubLObject)SubLObjectFactory.makeString("Clear Sentence")), SubLObjectFactory.makeSymbol("S#44054", "CYC"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15402", "CYC"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#896", "CYC"), (SubLObject)SubLObjectFactory.makeInteger(80)), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#895", "CYC"), (SubLObject)module0657.TWENTY_INTEGER) });
        $ic84$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("INPUT-NAME"), SubLObjectFactory.makeKeyword("COMPLETE-LABEL"), SubLObjectFactory.makeKeyword("CHOICES"), SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeKeyword("CLEAR-LABEL"), SubLObjectFactory.makeKeyword("CYCLIFY-LABEL"), SubLObjectFactory.makeKeyword("DOMAIN-MT"), SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeKeyword("HEIGHT") });
        $ic85$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic86$ = SubLObjectFactory.makeKeyword("COMPLETE-LABEL");
        $ic87$ = SubLObjectFactory.makeKeyword("CHOICES");
        $ic88$ = SubLObjectFactory.makeKeyword("PRETTY-NAME");
        $ic89$ = SubLObjectFactory.makeString("EL Sentence");
        $ic90$ = SubLObjectFactory.makeKeyword("CLEAR-LABEL");
        $ic91$ = SubLObjectFactory.makeString("Clear Sentence");
        $ic92$ = SubLObjectFactory.makeKeyword("CYCLIFY-LABEL");
        $ic93$ = SubLObjectFactory.makeKeyword("DOMAIN-MT");
        $ic94$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic95$ = SubLObjectFactory.makeKeyword("WIDTH");
        $ic96$ = SubLObjectFactory.makeInteger(80);
        $ic97$ = SubLObjectFactory.makeKeyword("HEIGHT");
        $ic98$ = SubLObjectFactory.makeString(" :");
        $ic99$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44050", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44045", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44051", "CYC"), (SubLObject)SubLObjectFactory.makeString("Complete")), SubLObjectFactory.makeSymbol("S#44052", "CYC"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15027", "CYC"), (SubLObject)SubLObjectFactory.makeString("EL Sentence")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44053", "CYC"), (SubLObject)SubLObjectFactory.makeString("Clear Sentence")), SubLObjectFactory.makeSymbol("S#44054", "CYC"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#896", "CYC"), (SubLObject)SubLObjectFactory.makeInteger(80)), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#895", "CYC"), (SubLObject)module0657.TWENTY_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4785", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERT")) });
        $ic100$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("INPUT-NAME"), SubLObjectFactory.makeKeyword("COMPLETE-LABEL"), SubLObjectFactory.makeKeyword("CHOICES"), SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeKeyword("CLEAR-LABEL"), SubLObjectFactory.makeKeyword("CYCLIFY-LABEL"), SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeKeyword("HEIGHT"), SubLObjectFactory.makeKeyword("MODE") });
        $ic101$ = SubLObjectFactory.makeKeyword("MODE");
        $ic102$ = SubLObjectFactory.makeKeyword("ASSERT");
        $ic103$ = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $ic104$ = SubLObjectFactory.makeSymbol("S#747", "CYC");
        $ic105$ = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $ic106$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic107$ = SubLObjectFactory.makeKeyword("SILK");
        $ic108$ = SubLObjectFactory.makeKeyword("QUERY");
        $ic109$ = SubLObjectFactory.makeSymbol("S#16379", "CYC");
        $ic110$ = SubLObjectFactory.makeSymbol("S#16391", "CYC");
        $ic111$ = SubLObjectFactory.makeString("false");
        $ic112$ = SubLObjectFactory.makeString("true");
        $ic113$ = SubLObjectFactory.makeString("<script>Event.onDOMReady(function() {setupSentenceEditor(~S, ~S, ~S, ~A);});</script>");
        $ic114$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44055", "CYC"), (SubLObject)module0657.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44050", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44045", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44056", "CYC"), (SubLObject)module0657.T));
        $ic115$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REQUIRED?"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("AUTO-CYCLIFY"));
        $ic116$ = SubLObjectFactory.makeKeyword("REQUIRED?");
        $ic117$ = SubLObjectFactory.makeKeyword("AUTO-CYCLIFY");
        $ic118$ = SubLObjectFactory.makeSymbol("S#44026", "CYC");
        $ic119$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44025", "CYC"));
        $ic120$ = SubLObjectFactory.makeString("Bad formula, probably due to a misspelling.~%Check these inputs:~%~%~S");
        $ic121$ = SubLObjectFactory.makeKeyword("INVALID-CONSTANTS");
        $ic122$ = SubLObjectFactory.makeKeyword("EOF");
        $ic123$ = SubLObjectFactory.makeKeyword("UNMATCHED-PARENTHESES");
        $ic124$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic125$ = SubLObjectFactory.makeKeyword("READ-ERROR");
        $ic126$ = SubLObjectFactory.makeSymbol("SUBL-NON-VARIABLE-NON-KEYWORD-SYMBOL-P");
        $ic127$ = SubLObjectFactory.makeKeyword("SYMBOLS-FOR-INVALID-CONSTANTS");
        $ic128$ = SubLObjectFactory.makeKeyword("NON-SENTENCE");
        $ic129$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("\""));
        $ic130$ = SubLObjectFactory.makeString("\"");
        $ic131$ = SubLObjectFactory.makeKeyword("EL-SENTENCE-ERROR");
        $ic132$ = SubLObjectFactory.makeSymbol("S#44032", "CYC");
        $ic133$ = SubLObjectFactory.makeKeyword("LOCATION");
        $ic134$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44057", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44048", "CYC"));
        $ic135$ = SubLObjectFactory.makeString("No sentence was specified in ");
        $ic136$ = SubLObjectFactory.makeString(".");
        $ic137$ = SubLObjectFactory.makeString("No sentence was specified.");
        $ic138$ = SubLObjectFactory.makeString("~A");
        $ic139$ = SubLObjectFactory.makeString("Invalid Constant References in ");
        $ic140$ = SubLObjectFactory.makeString("Invalid Constant References");
        $ic141$ = SubLObjectFactory.makeSymbol("S#43933", "CYC");
        $ic142$ = SubLObjectFactory.makeString("Unmatched Parentheses in ");
        $ic143$ = SubLObjectFactory.makeString("Unmatched Parentheses");
        $ic144$ = SubLObjectFactory.makeSymbol("S#43932", "CYC");
        $ic145$ = SubLObjectFactory.makeString("Unfinished Sentence in ");
        $ic146$ = SubLObjectFactory.makeString("Unfinished Sentence");
        $ic147$ = SubLObjectFactory.makeSymbol("S#43934", "CYC");
        $ic148$ = SubLObjectFactory.makeString("Unreadable Sentence in ");
        $ic149$ = SubLObjectFactory.makeString("Unreadable Sentence");
        $ic150$ = SubLObjectFactory.makeSymbol("S#43935", "CYC");
        $ic151$ = SubLObjectFactory.makeSymbol("S#43936", "CYC");
        $ic152$ = SubLObjectFactory.makeString("Not a Sentence in ");
        $ic153$ = SubLObjectFactory.makeString("Not a Sentence");
        $ic154$ = SubLObjectFactory.makeSymbol("S#43937", "CYC");
        $ic155$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic156$ = SubLObjectFactory.makeString("term");
        $ic157$ = SubLObjectFactory.makeString("Clear Term");
        $ic158$ = SubLObjectFactory.makeKeyword("COMPLETE-TYPE");
        $ic159$ = SubLObjectFactory.makeInteger(300);
        $ic160$ = SubLObjectFactory.makeString("completeContainer");
        $ic161$ = SubLObjectFactory.makeString("textArea");
        $ic162$ = SubLObjectFactory.makeString("width: ");
        $ic163$ = SubLObjectFactory.makeString("px;");
        $ic164$ = SubLObjectFactory.makeString("px; position:static");
        $ic165$ = SubLObjectFactory.makeString("autocomplete");
        $ic166$ = SubLObjectFactory.makeString("cycAutocompleteContainer");
        $ic167$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44055", "CYC"), (SubLObject)module0657.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44050", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44046", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44056", "CYC"), (SubLObject)module0657.T));
        $ic168$ = SubLObjectFactory.makeKeyword("EL-TERM-ERROR");
        $ic169$ = SubLObjectFactory.makeSymbol("S#44040", "CYC");
        $ic170$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44058", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44048", "CYC"));
        $ic171$ = SubLObjectFactory.makeString("No term was specified in ");
        $ic172$ = SubLObjectFactory.makeString("No term was specified.");
        $ic173$ = SubLObjectFactory.makeString("Unfinished Term in ");
        $ic174$ = SubLObjectFactory.makeString("Unfinished Term");
        $ic175$ = SubLObjectFactory.makeString("Unreadable Term in ");
        $ic176$ = SubLObjectFactory.makeString("Unreadable Term");
        $ic177$ = SubLObjectFactory.makeSymbol("S#44028", "CYC");
        $ic178$ = SubLObjectFactory.makeKeyword("TEST");
        $ic179$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic180$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic181$ = SubLObjectFactory.makeKeyword("KB");
        $ic182$ = SubLObjectFactory.makeKeyword("FULL");
        $ic183$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic184$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nameString")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CityOfBeijingChina")), (SubLObject)SubLObjectFactory.makeString("&#21271;&#20140;&#24066;"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nameString")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CityOfBeijingChina")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("&u5317;&u4EAC;&u5E02;")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nameString")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Thing")), (SubLObject)SubLObjectFactory.makeString("The Big Thing"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nameString")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Thing")), (SubLObject)SubLObjectFactory.makeString("The Big Thing"))));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0657.class
	Total time: 1223 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/