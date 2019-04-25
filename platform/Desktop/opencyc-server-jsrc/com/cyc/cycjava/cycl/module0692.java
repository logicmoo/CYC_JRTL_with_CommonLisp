package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0692 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0692";
    public static final String myFingerPrint = "2a159d440b6fe62de5ad6bbae7157de4d8b7628a376b5d001a851001eca9008d";
    private static SubLSymbol $g5456$;
    public static SubLSymbol $g5457$;
    private static SubLSymbol $g5458$;
    public static SubLSymbol $g5459$;
    public static SubLSymbol $g5460$;
    public static SubLSymbol $g5461$;
    public static SubLSymbol $g5462$;
    public static SubLSymbol $g5463$;
    public static SubLSymbol $g5464$;
    public static SubLSymbol $g5465$;
    public static SubLSymbol $g5466$;
    public static SubLSymbol $g5383$;
    public static SubLSymbol $g5467$;
    public static SubLSymbol $g5468$;
    public static SubLSymbol $g5381$;
    public static SubLSymbol $g5382$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLList $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLString $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLObject $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLString $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLString $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLString $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLString $ic102$;
    private static final SubLInteger $ic103$;
    private static final SubLString $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLString $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLString $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLString $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLString $ic131$;
    private static final SubLString $ic132$;
    private static final SubLInteger $ic133$;
    private static final SubLInteger $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLString $ic136$;
    private static final SubLList $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLList $ic140$;
    private static final SubLString $ic141$;
    private static final SubLString $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLString $ic145$;
    private static final SubLString $ic146$;
    private static final SubLString $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    
    public static SubLObject f42382() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0577.f35454((SubLObject)ConsesLow.list((SubLObject)module0692.$ic12$, module0574.f35152(), (SubLObject)module0692.$ic13$, module0692.$g5458$.getDynamicValue(var1)));
        if (module0692.NIL == module0577.f35438(var2)) {
            Errors.error((SubLObject)module0692.$ic14$);
        }
        module0577.f35447(var2, Time.get_universal_time());
        module0577.f35448(var2, Hashtables.make_hash_table((SubLObject)module0692.TWENTY_INTEGER, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED));
        Hashtables.sethash((SubLObject)module0692.$ic5$, module0577.f35443(var2), (SubLObject)ConsesLow.list(module0577.f35439(var2)));
        f42383(var2);
        f42384(var2);
        return var2;
    }
    
    public static SubLObject f42384(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0577.f35443(var2);
        module0577.f35448(var2, Hashtables.make_hash_table((SubLObject)module0692.TWENTY_INTEGER, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED));
        if (var4.isHashtable()) {
            SubLObject var5 = (SubLObject)module0692.NIL;
            SubLObject var6 = (SubLObject)module0692.NIL;
            final Iterator var7 = Hashtables.getEntrySetIterator(var4);
            try {
                while (Hashtables.iteratorHasNext(var7)) {
                    final Map.Entry var8 = Hashtables.iteratorNextEntry(var7);
                    var5 = Hashtables.getEntryKey(var8);
                    var6 = Hashtables.getEntryValue(var8);
                    if (module0692.NIL != module0004.f104(var5, module0692.$g5461$.getDynamicValue(var3), (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED)) {
                        Hashtables.sethash(var5, module0577.f35443(var2), var6);
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var7);
            }
        }
        return (SubLObject)module0692.NIL;
    }
    
    public static SubLObject f42385(final SubLObject var2, final SubLObject var8) {
        module0030.f1610(var8, module0577.f35443(var2));
        module0030.f1610(module0577.f35443(var2), var8);
        f42384(var2);
        return var8;
    }
    
    public static SubLObject f42386(final SubLObject var2, final SubLObject var9) {
        SubLObject var10 = var9;
        SubLObject var11 = (SubLObject)module0692.NIL;
        var11 = var10.first();
        while (module0692.NIL != var10) {
            Hashtables.remhash(var11, module0577.f35443(var2));
            var10 = var10.rest();
            var11 = var10.first();
        }
        return (SubLObject)module0692.NIL;
    }
    
    public static SubLObject f42383(final SubLObject var2) {
        SubLObject var3 = module0665.f40428((SubLObject)module0692.UNPROVIDED);
        final SubLObject var4 = Hashtables.gethash((SubLObject)module0692.$ic5$, module0577.f35443(var2), (SubLObject)module0692.UNPROVIDED);
        module0665.f40421((SubLObject)module0692.$ic7$, var3, (SubLObject)module0692.$ic15$);
        module0665.f40422((SubLObject)module0692.$ic16$, var3, (SubLObject)module0692.$ic17$);
        module0665.f40422((SubLObject)module0692.$ic8$, var3, (SubLObject)module0692.$ic18$);
        module0577.f35448(var2, Hashtables.make_hash_table((SubLObject)module0692.TWENTY_INTEGER, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED));
        Hashtables.sethash((SubLObject)module0692.$ic5$, module0577.f35443(var2), var4);
        var3 = f42385(var2, var3);
        return var3;
    }
    
    public static SubLObject f42387(SubLObject var13) {
        if (var13 == module0692.UNPROVIDED) {
            var13 = (SubLObject)module0692.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        if (module0692.NIL == var13) {
            var13 = (SubLObject)module0692.$ic19$;
        }
        final SubLObject var15 = module0656.f39832((SubLObject)module0692.$ic20$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0692.$ic21$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
        if (module0692.NIL != var15) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
            module0642.f39020(var15);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
        final SubLObject var16 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)module0692.T, var14);
            module0642.f39019(var13);
        }
        finally {
            module0015.$g533$.rebind(var16, var14);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0692.NIL;
    }
    
    public static SubLObject f42388(final SubLObject var12) {
        final SubLObject var13 = module0577.f35456(var12);
        module0642.f39019((SubLObject)module0692.$ic23$);
        return (SubLObject)module0692.NIL;
    }
    
    public static SubLObject f42389(SubLObject var16) {
        if (var16 == module0692.UNPROVIDED) {
            var16 = (SubLObject)module0692.NIL;
        }
        if (module0692.NIL != module0543.f33698()) {
            return module0667.f40583((SubLObject)module0692.$ic31$);
        }
        final SubLObject var17 = module0665.f40432(var16);
        return f42390(var17);
    }
    
    public static SubLObject f42390(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = module0030.f1606((SubLObject)module0692.$ic5$, var8, (SubLObject)module0692.UNPROVIDED);
        SubLObject var11 = (SubLObject)module0692.NIL;
        if (module0692.NIL != var10) {
            var11 = module0577.f35456(var10);
        }
        else {
            final SubLObject var12 = module0577.f35462(module0574.f35152(), module0692.$g5458$.getDynamicValue(var9));
            final SubLObject var13 = Sequences.length(var12);
            if (var13.eql((SubLObject)module0692.ZERO_INTEGER)) {
                final SubLObject var2_19 = f42382();
                module0030.f1599((SubLObject)module0692.$ic5$, module0577.f35439(var2_19), var8);
                f42390(var8);
                return (SubLObject)module0692.NIL;
            }
            if (!var13.eql((SubLObject)module0692.ONE_INTEGER)) {
                module0693.f42413(module0692.$g5458$.getDynamicValue(var9));
                return (SubLObject)module0692.NIL;
            }
            var11 = var12.first();
            var10 = module0577.f35439(var11);
        }
        if (module0692.NIL == module0577.f35438(var11)) {
            module0667.f40568((SubLObject)module0692.$ic33$, PrintLow.format((SubLObject)module0692.NIL, (SubLObject)module0692.$ic34$));
        }
        else {
            module0642.f39020((SubLObject)module0692.$ic35$);
            module0642.f39029((SubLObject)module0692.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            if (module0692.NIL != module0015.f713()) {
                Errors.error((SubLObject)module0692.$ic36$);
            }
            module0642.f39020(module0015.$g415$.getGlobalValue());
            module0642.f39020(module0015.$g418$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
            module0642.f39020((SubLObject)module0692.$ic37$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
            module0642.f39020(module0015.$g419$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
            module0642.f39020((SubLObject)module0692.$ic38$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
            final SubLObject var14 = module0015.$g533$.currentBinding(var9);
            try {
                module0015.$g533$.bind((SubLObject)module0692.T, var9);
                module0656.f39836((SubLObject)module0692.$ic24$, var10, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED);
                module0656.f39836((SubLObject)module0692.$ic28$, var10, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var14, var9);
            }
            module0642.f39020(module0015.$g416$.getGlobalValue());
            module0642.f39029((SubLObject)module0692.UNPROVIDED);
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0692.UNPROVIDED);
        }
        return (SubLObject)module0692.NIL;
    }
    
    public static SubLObject f42391(SubLObject var16) {
        if (var16 == module0692.UNPROVIDED) {
            var16 = (SubLObject)module0692.NIL;
        }
        final SubLObject var17 = module0665.f40432(var16);
        return f42392(var17);
    }
    
    public static SubLObject f42392(final SubLObject var8) {
        final SubLObject var9 = module0693.f42415(var8);
        if (module0692.NIL != var9) {
            f42393(var9);
        }
        return (SubLObject)module0692.NIL;
    }
    
    public static SubLObject f42393(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0692.NIL == module0577.f35438(var2)) {
            return (SubLObject)module0692.NIL;
        }
        final SubLObject var4 = module0577.f35439(var2);
        module0642.f39020((SubLObject)module0692.$ic35$);
        module0642.f39029((SubLObject)module0692.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0642.f39029((SubLObject)module0692.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)module0692.$ic40$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0692.UNPROVIDED);
        final SubLObject var5 = module0015.$g535$.currentBinding(var3);
        try {
            module0015.$g535$.bind((SubLObject)module0692.T, var3);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (module0692.NIL != module0015.$g509$.getGlobalValue()) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                module0642.f39020(module0642.f39042(module0015.$g509$.getGlobalValue()));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
            final SubLObject var15_20 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)module0692.T, var3);
                module0642.f39020(module0015.$g207$.getGlobalValue());
                module0642.f39020(module0015.$g209$.getGlobalValue());
                module0642.f39019((SubLObject)module0692.$ic31$);
                module0642.f39020(module0015.$g210$.getGlobalValue());
                module0642.f39020(module0015.$g208$.getGlobalValue());
                module0642.f39032((SubLObject)module0692.THREE_INTEGER);
                SubLObject var6 = module0656.f39832((SubLObject)module0692.$ic28$);
                module0642.f39020(module0015.$g381$.getGlobalValue());
                module0642.f39020(module0015.$g383$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                module0655.f39768();
                module0642.f39019(PrintLow.format((SubLObject)module0692.NIL, (SubLObject)module0692.$ic41$, var4));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                if (module0692.NIL != var6) {
                    module0642.f39020(module0015.$g387$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                    module0642.f39020(var6);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                final SubLObject var15_21 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)module0692.T, var3);
                    module0642.f39019((SubLObject)module0692.$ic42$);
                }
                finally {
                    module0015.$g533$.rebind(var15_21, var3);
                }
                module0642.f39020(module0015.$g382$.getGlobalValue());
                module0642.f39032((SubLObject)module0692.UNPROVIDED);
                module0642.f39019((SubLObject)module0692.$ic43$);
                module0642.f39032((SubLObject)module0692.UNPROVIDED);
                var6 = module0656.f39832((SubLObject)module0692.$ic28$);
                module0642.f39020(module0015.$g381$.getGlobalValue());
                module0642.f39020(module0015.$g383$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                module0655.f39768();
                module0642.f39019(PrintLow.format((SubLObject)module0692.NIL, (SubLObject)module0692.$ic44$, var4));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                if (module0692.NIL != var6) {
                    module0642.f39020(module0015.$g387$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                    module0642.f39020(var6);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                final SubLObject var15_22 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)module0692.T, var3);
                    module0642.f39019((SubLObject)module0692.$ic45$);
                }
                finally {
                    module0015.$g533$.rebind(var15_22, var3);
                }
                module0642.f39020(module0015.$g382$.getGlobalValue());
                module0642.f39029((SubLObject)module0692.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var15_20, var3);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0692.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var5, var3);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0692.UNPROVIDED);
        return (SubLObject)module0692.NIL;
    }
    
    public static SubLObject f42394(SubLObject var16) {
        if (var16 == module0692.UNPROVIDED) {
            var16 = (SubLObject)module0692.NIL;
        }
        final SubLObject var17 = module0665.f40432(var16);
        return f42395(var17);
    }
    
    public static SubLObject f42395(SubLObject var8) {
        final SubLObject var9 = module0693.f42415(var8);
        if (module0692.NIL == var9) {
            module0656.f39789((SubLObject)module0692.$ic47$, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED);
            return (SubLObject)module0692.NIL;
        }
        f42385(var9, var8);
        SubLObject var11;
        final SubLObject var10 = var11 = module0030.f1606((SubLObject)module0692.$ic48$, var8, (SubLObject)module0692.UNPROVIDED);
        if (var11.eql((SubLObject)module0692.$ic49$)) {
            var8 = f42383(var9);
        }
        final SubLObject var12 = var11 = module0030.f1606((SubLObject)module0692.$ic7$, var8, (SubLObject)module0692.UNPROVIDED);
        if (var11.eql((SubLObject)module0692.$ic15$)) {
            f42396(var8, (SubLObject)module0692.UNPROVIDED);
        }
        else {
            module0656.f39789((SubLObject)module0692.$ic50$, var12, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED);
        }
        return (SubLObject)module0692.NIL;
    }
    
    public static SubLObject f42397(final SubLObject var16) {
        final SubLObject var17 = module0665.f40432(var16);
        final SubLObject var18 = module0693.f42415(var17);
        if (module0692.NIL == var18) {
            module0656.f39789((SubLObject)module0692.$ic51$, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED);
            return (SubLObject)module0692.NIL;
        }
        f42385(var18, var17);
        f42396(var17, (SubLObject)module0692.UNPROVIDED);
        return (SubLObject)module0692.NIL;
    }
    
    public static SubLObject f42396(final SubLObject var25, SubLObject var2) {
        if (var2 == module0692.UNPROVIDED) {
            var2 = (SubLObject)module0692.NIL;
        }
        final SubLThread var26 = SubLProcess.currentSubLThread();
        if (module0692.NIL == var2) {
            var2 = module0693.f42415(var25);
            if (module0692.NIL == var2) {
                module0656.f39789((SubLObject)module0692.$ic53$, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED);
                return (SubLObject)module0692.NIL;
            }
        }
        final SubLObject var27 = module0692.$g5456$.getDynamicValue(var26);
        final SubLObject var28 = Symbols.symbol_function((SubLObject)module0692.$ic54$);
        final SubLObject var29 = Symbols.symbol_function((SubLObject)module0692.$ic55$);
        final SubLObject var30 = (module0692.NIL != module0269.f17707(module0665.f40419((SubLObject)module0692.$ic56$, var25))) ? module0665.f40419((SubLObject)module0692.$ic56$, var25) : module0692.$ic57$;
        if (module0692.NIL != var27) {
            module0642.f39020(module0015.$g189$.getGlobalValue());
            module0642.f39020((SubLObject)module0692.THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
            module0642.f39019((SubLObject)module0692.$ic58$);
            module0642.f39020(module0015.$g190$.getGlobalValue());
            module0642.f39020((SubLObject)module0692.THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
            SubLObject var31 = Sort.sort(module0030.f1625(var25), Symbols.symbol_function((SubLObject)module0692.$ic60$), Symbols.symbol_function((SubLObject)module0692.$ic61$));
            SubLObject var32 = (SubLObject)module0692.NIL;
            var32 = var31.first();
            while (module0692.NIL != var31) {
                module0642.f39019(var32);
                module0642.f39019((SubLObject)module0692.$ic59$);
                module0642.f39019(Hashtables.gethash(var32, var25, (SubLObject)module0692.UNPROVIDED));
                module0642.f39026((SubLObject)module0692.UNPROVIDED);
                var31 = var31.rest();
                var32 = var31.first();
            }
        }
        if (module0692.NIL != var27) {
            module0642.f39020(module0015.$g189$.getGlobalValue());
            module0642.f39020((SubLObject)module0692.THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
            module0642.f39019((SubLObject)module0692.$ic62$);
            module0642.f39020(module0015.$g190$.getGlobalValue());
            module0642.f39020((SubLObject)module0692.THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
        }
        module0665.f40462(var25, (SubLObject)module0692.$ic9$, module0692.$g5459$.getGlobalValue(), var27, var28, var29, module0692.$ic63$, var30);
        module0665.f40462(var25, (SubLObject)module0692.$ic10$, module0692.$g5460$.getGlobalValue(), var27, var28, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED);
        module0665.f40460(var25, (SubLObject)module0692.$ic56$, var27, var28, var29, module0692.$ic64$, module0132.$g1548$.getGlobalValue());
        if (module0692.NIL != var27) {
            module0642.f39020(module0015.$g189$.getGlobalValue());
            module0642.f39020((SubLObject)module0692.THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
            module0642.f39019((SubLObject)module0692.$ic65$);
            module0642.f39020(module0015.$g190$.getGlobalValue());
            module0642.f39020((SubLObject)module0692.THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
            SubLObject var31 = Sort.sort(module0030.f1625(var25), Symbols.symbol_function((SubLObject)module0692.$ic60$), Symbols.symbol_function((SubLObject)module0692.$ic61$));
            SubLObject var32 = (SubLObject)module0692.NIL;
            var32 = var31.first();
            while (module0692.NIL != var31) {
                module0642.f39019(var32);
                module0642.f39019((SubLObject)module0692.$ic59$);
                module0642.f39019(Hashtables.gethash(var32, var25, (SubLObject)module0692.UNPROVIDED));
                module0642.f39026((SubLObject)module0692.UNPROVIDED);
                var31 = var31.rest();
                var32 = var31.first();
            }
        }
        f42386(var2, module0692.$g5460$.getGlobalValue());
        f42386(var2, module0692.$g5459$.getGlobalValue());
        f42385(var2, var25);
        if (module0692.NIL != var27) {
            module0642.f39020(module0015.$g189$.getGlobalValue());
            module0642.f39020((SubLObject)module0692.THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
            module0642.f39019((SubLObject)module0692.$ic66$);
            module0642.f39020(module0015.$g190$.getGlobalValue());
            module0642.f39020((SubLObject)module0692.THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
            SubLObject var31 = Sort.sort(module0030.f1625(module0577.f35443(var2)), Symbols.symbol_function((SubLObject)module0692.$ic60$), Symbols.symbol_function((SubLObject)module0692.$ic61$));
            SubLObject var32 = (SubLObject)module0692.NIL;
            var32 = var31.first();
            while (module0692.NIL != var31) {
                module0642.f39019(var32);
                module0642.f39019((SubLObject)module0692.$ic59$);
                module0642.f39019(Hashtables.gethash(var32, module0577.f35443(var2), (SubLObject)module0692.UNPROVIDED));
                module0642.f39026((SubLObject)module0692.UNPROVIDED);
                var31 = var31.rest();
                var32 = var31.first();
            }
        }
        module0642.f39020((SubLObject)module0692.$ic35$);
        module0642.f39029((SubLObject)module0692.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0642.f39029((SubLObject)module0692.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)module0692.$ic67$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0666.f40471();
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0692.UNPROVIDED);
        final SubLObject var33 = module0015.$g535$.currentBinding(var26);
        try {
            module0015.$g535$.bind((SubLObject)module0692.T, var26);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
            final SubLObject var15_30 = module0015.$g533$.currentBinding(var26);
            try {
                module0015.$g533$.bind((SubLObject)module0692.T, var26);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var26));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                module0642.f39020(module0015.$g285$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                module0642.f39020((SubLObject)module0692.$ic68$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                final SubLObject var15_31 = module0015.$g533$.currentBinding(var26);
                final SubLObject var34 = module0015.$g541$.currentBinding(var26);
                final SubLObject var35 = module0015.$g539$.currentBinding(var26);
                try {
                    module0015.$g533$.bind((SubLObject)module0692.T, var26);
                    module0015.$g541$.bind((SubLObject)module0692.T, var26);
                    module0015.$g539$.bind(module0015.f797(), var26);
                    module0642.f39069((SubLObject)module0692.$ic69$, (SubLObject)module0692.T, (SubLObject)module0692.UNPROVIDED);
                    module0665.f40440(var25, (SubLObject)module0692.$ic5$, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                    final SubLObject var15_32 = module0015.$g533$.currentBinding(var26);
                    try {
                        module0015.$g533$.bind((SubLObject)module0692.T, var26);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                        final SubLObject var15_33 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)module0692.T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0692.$ic70$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                            final SubLObject var15_34 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39019((SubLObject)module0692.$ic71$);
                                module0642.f39020(module0015.$g210$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var15_34, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                            final SubLObject var15_35 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                final SubLObject var36 = module0665.f40417((SubLObject)module0692.$ic8$, (SubLObject)module0692.$ic72$);
                                module0642.f39020(module0015.$g318$.getGlobalValue());
                                module0642.f39020(module0015.$g320$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                                module0642.f39020(var36);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                                module0642.f39032((SubLObject)module0692.ONE_INTEGER);
                                module0642.f39020((SubLObject)module0692.$ic73$);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                                final SubLObject var15_36 = module0015.$g533$.currentBinding(var26);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                    SubLObject var37 = (SubLObject)module0692.NIL;
                                    SubLObject var41_42 = (SubLObject)module0692.NIL;
                                    SubLObject var38 = (SubLObject)module0692.NIL;
                                    SubLObject var44_45 = (SubLObject)module0692.NIL;
                                    var37 = module0691.f42286();
                                    var41_42 = var37.first();
                                    var38 = module0691.f42286();
                                    var44_45 = var38.first();
                                    while (module0692.NIL != var38 || module0692.NIL != var37) {
                                        final SubLObject var39 = module0035.f2171(var41_42, module0665.f40420((SubLObject)module0692.$ic8$, var25));
                                        final SubLObject var47_48 = module0665.f40415(var41_42, (SubLObject)module0692.$ic72$);
                                        module0642.f39020(module0015.$g324$.getGlobalValue());
                                        if (module0692.NIL != var39) {
                                            module0642.f39046(module0015.$g327$.getGlobalValue());
                                        }
                                        if (module0692.NIL != var47_48) {
                                            module0642.f39020(module0015.$g326$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                                            module0642.f39020(var47_48);
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                                        }
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                                        final SubLObject var15_37 = module0015.$g533$.currentBinding(var26);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                            module0642.f39019(var44_45);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var15_37, var26);
                                        }
                                        module0642.f39020(module0015.$g325$.getGlobalValue());
                                        var37 = var37.rest();
                                        var41_42 = var37.first();
                                        var38 = var38.rest();
                                        var44_45 = var38.first();
                                    }
                                }
                                finally {
                                    module0015.$g533$.rebind(var15_36, var26);
                                }
                                module0642.f39020(module0015.$g319$.getGlobalValue());
                                SubLObject var40 = module0691.f42288(module0665.f40419((SubLObject)module0692.$ic8$, var25), (SubLObject)module0692.$ic74$);
                                if (var40.isString()) {
                                    var40 = module0038.f2659((SubLObject)module0692.$ic75$, (SubLObject)module0692.$ic76$, var40, (SubLObject)module0692.UNPROVIDED);
                                    var40 = module0038.f2659((SubLObject)module0692.$ic77$, (SubLObject)module0692.$ic78$, var40, (SubLObject)module0692.UNPROVIDED);
                                    module0642.f39026((SubLObject)module0692.UNPROVIDED);
                                    final SubLObject var15_38 = module0015.$g533$.currentBinding(var26);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0692.NIL, var26);
                                        module0642.f39019(var40);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var15_38, var26);
                                    }
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var15_35, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var15_33, var26);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0692.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                        final SubLObject var15_39 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)module0692.T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39020((SubLObject)module0692.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                            final SubLObject var15_40 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                module0642.f39051((SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var15_40, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var15_39, var26);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0692.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                        final SubLObject var15_41 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)module0692.T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0692.$ic70$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                            final SubLObject var15_42 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39019((SubLObject)module0692.$ic79$);
                                module0642.f39020(module0015.$g210$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var15_42, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                            final SubLObject var15_43 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                module0665.f40461(var25, (SubLObject)module0692.$ic9$, module0692.$g5459$.getGlobalValue(), var27, var28, (SubLObject)module0692.ONE_INTEGER, (SubLObject)module0692.ONE_INTEGER, (SubLObject)module0692.T, (SubLObject)module0692.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var15_43, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var15_41, var26);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0692.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                        final SubLObject var15_44 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)module0692.T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39020((SubLObject)module0692.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                            final SubLObject var15_45 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                module0642.f39051((SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var15_45, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var15_44, var26);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0692.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                        final SubLObject var15_46 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)module0692.T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0692.$ic70$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                            final SubLObject var15_47 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39019((SubLObject)module0692.$ic80$);
                                module0642.f39020(module0015.$g210$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var15_47, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                            final SubLObject var15_48 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                module0665.f40461(var25, (SubLObject)module0692.$ic10$, module0692.$g5460$.getGlobalValue(), var27, var28, (SubLObject)module0692.ONE_INTEGER, (SubLObject)module0692.TWO_INTEGER, (SubLObject)module0692.T, module0692.$ic63$);
                            }
                            finally {
                                module0015.$g533$.rebind(var15_48, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var15_46, var26);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0692.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                        final SubLObject var15_49 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)module0692.T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39020((SubLObject)module0692.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                            final SubLObject var15_50 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                module0642.f39051((SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var15_50, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var15_49, var26);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0692.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                        final SubLObject var15_51 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)module0692.T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0692.$ic70$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                            final SubLObject var15_52 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39019((SubLObject)module0692.$ic81$);
                                module0642.f39020(module0015.$g210$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var15_52, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                            final SubLObject var15_53 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                module0665.f40452(var25, (SubLObject)module0692.$ic56$, var27, var28, (SubLObject)module0692.T, (SubLObject)module0692.T, module0692.$ic64$);
                            }
                            finally {
                                module0015.$g533$.rebind(var15_53, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var15_51, var26);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0692.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                        final SubLObject var15_54 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)module0692.T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39020((SubLObject)module0692.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                            final SubLObject var15_55 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                module0642.f39051((SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var15_55, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var15_54, var26);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0692.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                        final SubLObject var15_56 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)module0692.T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0692.$ic70$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                            final SubLObject var15_57 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39019((SubLObject)module0692.$ic82$);
                                module0642.f39020(module0015.$g210$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var15_57, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                            final SubLObject var15_58 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                SubLObject var41 = module0691.f42275((SubLObject)module0692.UNPROVIDED);
                                SubLObject var42 = (SubLObject)module0692.NIL;
                                var42 = var41.first();
                                while (module0692.NIL != var41) {
                                    module0665.f40436(var25, (SubLObject)module0692.$ic16$, var42, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED);
                                    module0642.f39019(var42);
                                    module0642.f39026((SubLObject)module0692.UNPROVIDED);
                                    var41 = var41.rest();
                                    var42 = var41.first();
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var15_58, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var15_56, var26);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0692.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                        final SubLObject var15_59 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)module0692.T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39020((SubLObject)module0692.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                            final SubLObject var15_60 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                module0642.f39051((SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var15_60, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var15_59, var26);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0692.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                        final SubLObject var15_61 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)module0692.T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0692.$ic70$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                            final SubLObject var15_62 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39019((SubLObject)module0692.$ic83$);
                                module0642.f39020(module0015.$g210$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var15_62, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                            final SubLObject var15_63 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                module0665.f40448(var25, (SubLObject)module0692.$ic84$, (SubLObject)module0692.ONE_INTEGER, (SubLObject)module0692.THREE_INTEGER, (SubLObject)module0692.$ic85$);
                            }
                            finally {
                                module0015.$g533$.rebind(var15_63, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var15_61, var26);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0692.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                        final SubLObject var15_64 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)module0692.T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39020((SubLObject)module0692.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                            final SubLObject var15_65 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                module0642.f39051((SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var15_65, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var15_64, var26);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0692.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                        final SubLObject var15_66 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)module0692.T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0692.$ic70$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                            final SubLObject var15_67 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                module0642.f39027((SubLObject)module0692.$ic86$, (SubLObject)module0692.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var15_67, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                            final SubLObject var15_68 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                module0665.f40445(var25, (SubLObject)module0692.$ic87$, (SubLObject)module0692.$ic88$, (SubLObject)module0692.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var15_68, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var15_66, var26);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0692.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                        final SubLObject var15_69 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)module0692.T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39020((SubLObject)module0692.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                            final SubLObject var15_70 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                module0642.f39051((SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var15_70, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var15_69, var26);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0692.UNPROVIDED);
                        final SubLObject var43 = module0665.f40419((SubLObject)module0692.$ic8$, var25);
                        final SubLObject var44 = module0665.f40420((SubLObject)module0692.$ic10$, var25);
                        final SubLObject var45 = module0665.f40420((SubLObject)module0692.$ic9$, var25);
                        final SubLObject var46 = module0665.f40419((SubLObject)module0692.$ic56$, var25);
                        final SubLObject var47 = module0665.f40419((SubLObject)module0692.$ic84$, var25);
                        final SubLObject var48 = module0665.f40420((SubLObject)module0692.$ic16$, var25);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                        final SubLObject var15_71 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)module0692.T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0692.$ic70$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                            final SubLObject var15_72 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39019((SubLObject)module0692.$ic89$);
                                module0642.f39020(module0015.$g210$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var15_72, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                            final SubLObject var15_73 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                if (Packages.intern(module0038.f2968(var43), (SubLObject)module0692.UNPROVIDED).isFunctionSpec() && module0692.ZERO_INTEGER.numL(Sequences.length(var44)) && module0692.ZERO_INTEGER.numL(Sequences.length(var45)) && module0692.NIL != module0269.f17731(var46) && var47.isNumber()) {
                                    module0642.f39019((SubLObject)module0692.$ic90$);
                                    module0642.f39020(module0015.$g219$.getGlobalValue());
                                    module0642.f39020(module0015.$g221$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                                    module0642.f39020((SubLObject)module0692.$ic91$);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
                                    final SubLObject var15_74 = module0015.$g533$.currentBinding(var26);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0692.T, var26);
                                        module0642.f39020(module0015.$g209$.getGlobalValue());
                                        module0656.f39837((SubLObject)module0692.$ic92$, (SubLObject)module0692.$ic93$, module0577.f35443(var2), (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED);
                                        module0642.f39020(module0015.$g210$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var15_74, var26);
                                    }
                                    module0642.f39020(module0015.$g220$.getGlobalValue());
                                }
                                else {
                                    module0642.f39020(module0015.$g209$.getGlobalValue());
                                    module0642.f39019((SubLObject)module0692.$ic94$);
                                    module0642.f39020(module0015.$g210$.getGlobalValue());
                                }
                                module0642.f39026((SubLObject)module0692.TWO_INTEGER);
                                module0642.f39019((SubLObject)module0692.$ic95$);
                                module0642.f39019(var43);
                                module0642.f39026((SubLObject)module0692.UNPROVIDED);
                                module0642.f39019((SubLObject)module0692.$ic96$);
                                module0656.f39804(var44, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED);
                                module0642.f39026((SubLObject)module0692.UNPROVIDED);
                                module0642.f39019((SubLObject)module0692.$ic97$);
                                module0656.f39804(var45, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED);
                                module0642.f39026((SubLObject)module0692.UNPROVIDED);
                                module0642.f39019((SubLObject)module0692.$ic98$);
                                module0656.f39804(var46, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED);
                                module0642.f39026((SubLObject)module0692.UNPROVIDED);
                                module0642.f39019((SubLObject)module0692.$ic99$);
                                module0642.f39019(var47);
                                module0642.f39026((SubLObject)module0692.UNPROVIDED);
                                module0642.f39019((SubLObject)module0692.$ic100$);
                                module0642.f39019(var48);
                                module0642.f39026((SubLObject)module0692.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var15_73, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var15_71, var26);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0692.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var15_32, var26);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                    module0015.f799(module0015.$g539$.getDynamicValue(var26));
                }
                finally {
                    module0015.$g539$.rebind(var35, var26);
                    module0015.$g541$.rebind(var34, var26);
                    module0015.$g533$.rebind(var15_31, var26);
                }
                module0642.f39020(module0015.$g283$.getGlobalValue());
                module0642.f39029((SubLObject)module0692.UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var15_30, var26);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0692.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var33, var26);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0692.UNPROVIDED);
        return (SubLObject)module0692.NIL;
    }
    
    public static SubLObject f42398(final SubLObject var13, final SubLObject var8) {
        module0665.f40421((SubLObject)module0692.$ic101$, var8, PrintLow.format((SubLObject)module0692.NIL, (SubLObject)module0692.$ic102$, random.random(Numbers.expt((SubLObject)module0692.TWO_INTEGER, (SubLObject)module0692.$ic103$))));
        f42399(var8, var13, (SubLObject)module0692.$ic104$);
        return (SubLObject)module0692.NIL;
    }
    
    public static SubLObject f42400(final SubLObject var16) {
        final SubLObject var17 = module0665.f40432(var16);
        module0665.f40421((SubLObject)module0692.$ic101$, var17, PrintLow.format((SubLObject)module0692.NIL, (SubLObject)module0692.$ic106$, random.random(Numbers.expt((SubLObject)module0692.TWO_INTEGER, (SubLObject)module0692.$ic103$))));
        f42401(var17);
        module0004.f78((SubLObject)module0692.$ic104$, Symbols.symbol_function((SubLObject)module0692.$ic107$), (SubLObject)ConsesLow.list(var17));
        return (SubLObject)module0692.NIL;
    }
    
    public static SubLObject f42402(final SubLObject var8) {
        final SubLObject var9 = module0665.f40420((SubLObject)module0692.$ic9$, var8);
        final SubLObject var10 = module0665.f40420((SubLObject)module0692.$ic10$, var8);
        final SubLObject var11 = module0665.f40419((SubLObject)module0692.$ic56$, var8);
        final SubLObject var12 = module0665.f40419((SubLObject)module0692.$ic84$, var8);
        final SubLObject var13 = module0665.f40420((SubLObject)module0692.$ic16$, var8);
        SubLObject var14 = (SubLObject)module0692.NIL;
        final SubLObject var15 = module0665.f40419((SubLObject)module0692.$ic8$, var8);
        final SubLObject var16 = Packages.intern(module0038.f2968(var15), (SubLObject)module0692.$ic109$);
        final SubLObject var17 = module0665.f40419((SubLObject)module0692.$ic101$, var8);
        SubLObject var18 = var13;
        SubLObject var19 = (SubLObject)module0692.NIL;
        var19 = var18.first();
        while (module0692.NIL != var18) {
            var14 = (SubLObject)ConsesLow.cons(Packages.intern(module0038.f2968(var19), (SubLObject)module0692.$ic109$), var14);
            var18 = var18.rest();
            var19 = var18.first();
        }
        var14 = Sequences.nreverse(var14);
        module0691.f42322(var17, (SubLObject)ConsesLow.list(module0692.$g5383$.getGlobalValue(), (SubLObject)ConsesLow.list(new SubLObject[] { module0692.$ic110$, var16, module0692.$ic9$, var9, module0692.$ic10$, var10, module0692.$ic56$, var11, module0692.$ic84$, var12, module0692.$ic111$, var14 })));
        return (SubLObject)module0692.NIL;
    }
    
    public static SubLObject f42403(final SubLObject var98) {
        final SubLThread var99 = SubLProcess.currentSubLThread();
        final SubLObject var100 = conses_high.getf(var98, (SubLObject)module0692.$ic119$, (SubLObject)module0692.UNPROVIDED);
        final SubLObject var101 = (var100.isString() || (var100.isInteger() && var100.numG((SubLObject)module0692.ZERO_INTEGER))) ? var100 : module0692.$g5464$.getGlobalValue();
        final SubLObject var102 = conses_high.getf(var98, (SubLObject)module0692.$ic120$, (SubLObject)module0692.UNPROVIDED);
        final SubLObject var103 = (var102.isInteger() && var102.numG((SubLObject)module0692.ZERO_INTEGER)) ? var102 : module0692.$g5465$.getGlobalValue();
        final SubLObject var104 = conses_high.getf(var98, (SubLObject)module0692.$ic121$, (SubLObject)module0692.UNPROVIDED);
        final SubLObject var105 = (SubLObject)((module0692.NIL != module0269.f17731(var104)) ? var104 : module0692.NIL);
        final SubLObject var106 = conses_high.getf(var98, (SubLObject)module0692.$ic122$, (SubLObject)module0692.UNPROVIDED);
        final SubLObject var107 = (SubLObject)((module0692.NIL != module0269.f17731(var106)) ? var106 : module0692.NIL);
        final SubLObject var108 = conses_high.getf(var98, (SubLObject)module0692.$ic123$, (SubLObject)module0692.UNPROVIDED);
        final SubLObject var109 = (SubLObject)((module0692.NIL != module0269.f17731(var108)) ? var108 : module0692.NIL);
        final SubLObject var110 = conses_high.getf(var98, (SubLObject)module0692.$ic101$, (SubLObject)module0692.UNPROVIDED);
        final SubLObject var111 = module0692.$g5462$.getGlobalValue();
        final SubLObject var112 = module0014.f675((SubLObject)module0692.$ic124$);
        final SubLObject var113 = conses_high.getf(var98, (SubLObject)module0692.$ic125$, (SubLObject)module0692.UNPROVIDED);
        final SubLObject var114 = var113.isString() ? var113 : module0692.$g5463$.getGlobalValue();
        module0642.f39020(module0015.$g442$.getGlobalValue());
        module0642.f39020(module0015.$g444$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
        module0642.f39020(var114);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
        module0642.f39020(module0015.$g445$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
        module0642.f39020(var111);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
        module0642.f39020(module0015.$g446$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
        module0642.f39020(var112);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
        module0642.f39020(module0015.$g451$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
        module0642.f39020(var103);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
        module0642.f39020(module0015.$g452$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
        module0642.f39020(var101);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
        final SubLObject var115 = module0015.$g533$.currentBinding(var99);
        try {
            module0015.$g533$.bind((SubLObject)module0692.T, var99);
            module0642.f39020(module0015.$g453$.getGlobalValue());
            module0642.f39020(module0015.$g454$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
            module0642.f39020((SubLObject)module0692.$ic126$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
            module0642.f39020(module0015.$g455$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
            module0642.f39020(PrintLow.format((SubLObject)module0692.NIL, (SubLObject)module0692.$ic102$, module0574.f35152()));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
            if (module0692.NIL != var105) {
                module0642.f39020(module0015.$g453$.getGlobalValue());
                module0642.f39020(module0015.$g454$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                module0642.f39020((SubLObject)module0692.$ic127$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                module0642.f39020(module0015.$g455$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                module0642.f39020(module0597.f36628(var105));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
            }
            if (module0692.NIL != var107) {
                module0642.f39020(module0015.$g453$.getGlobalValue());
                module0642.f39020(module0015.$g454$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                module0642.f39020((SubLObject)module0692.$ic128$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                module0642.f39020(module0015.$g455$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                module0642.f39020(module0597.f36628(var107));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
            }
            if (module0692.NIL != var109) {
                module0642.f39020(module0015.$g453$.getGlobalValue());
                module0642.f39020(module0015.$g454$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                module0642.f39020((SubLObject)module0692.$ic129$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                module0642.f39020(module0015.$g455$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                module0642.f39020(module0597.f36628(var109));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
            }
            module0642.f39020(module0015.$g453$.getGlobalValue());
            module0642.f39020(module0015.$g454$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
            module0642.f39020((SubLObject)module0692.$ic130$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
            module0642.f39020(module0015.$g455$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
            module0642.f39020(var110);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
            module0642.f39020(module0015.$g453$.getGlobalValue());
            module0642.f39020(module0015.$g454$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
            module0642.f39020((SubLObject)module0692.$ic131$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
            module0642.f39020(module0015.$g455$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
            module0642.f39020(module0110.$g1378$.getDynamicValue(var99));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
            module0642.f39019((SubLObject)module0692.$ic132$);
        }
        finally {
            module0015.$g533$.rebind(var115, var99);
        }
        module0642.f39020(module0015.$g443$.getGlobalValue());
        return (SubLObject)module0692.NIL;
    }
    
    public static SubLObject f42404(final SubLObject var16) {
        return f42401(module0665.f40432(var16));
    }
    
    public static SubLObject f42401(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        module0691.f42317();
        module0642.f39020((SubLObject)module0692.$ic35$);
        module0642.f39029((SubLObject)module0692.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0642.f39029((SubLObject)module0692.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)module0692.$ic136$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0692.UNPROVIDED);
        final SubLObject var10 = module0015.$g535$.currentBinding(var9);
        try {
            module0015.$g535$.bind((SubLObject)module0692.T, var9);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
            final SubLObject var15_113 = module0015.$g533$.currentBinding(var9);
            try {
                module0015.$g533$.bind((SubLObject)module0692.T, var9);
                f42403((SubLObject)ConsesLow.list(new SubLObject[] { module0692.$ic119$, module0665.f40419((SubLObject)module0692.$ic119$, var8), module0692.$ic120$, module0665.f40419((SubLObject)module0692.$ic120$, var8), module0692.$ic121$, module0665.f40419((SubLObject)module0692.$ic121$, var8), module0692.$ic122$, module0665.f40419((SubLObject)module0692.$ic121$, var8), module0692.$ic123$, module0665.f40419((SubLObject)module0692.$ic123$, var8), module0692.$ic101$, module0665.f40419((SubLObject)module0692.$ic101$, var8) }));
                module0642.f39029((SubLObject)module0692.UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var15_113, var9);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0692.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var10, var9);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0692.UNPROVIDED);
        return (SubLObject)module0692.NIL;
    }
    
    public static SubLObject f42405(final SubLObject var8, final SubLObject var97, SubLObject var100, SubLObject var102) {
        if (var100 == module0692.UNPROVIDED) {
            var100 = module0692.$g5381$.getGlobalValue();
        }
        if (var102 == module0692.UNPROVIDED) {
            var102 = module0692.$g5382$.getGlobalValue();
        }
        module0665.f40421((SubLObject)module0692.$ic101$, var8, var97);
        module0665.f40421((SubLObject)module0692.$ic119$, var8, var100);
        module0665.f40421((SubLObject)module0692.$ic120$, var8, var102);
        return var8;
    }
    
    public static SubLObject f42406(final SubLObject var100, final SubLObject var102) {
        return module0662.f40314((SubLObject)ConsesLow.listS((SubLObject)module0692.$ic137$, (SubLObject)ConsesLow.list((SubLObject)module0692.$ic120$, var102), (SubLObject)ConsesLow.list((SubLObject)module0692.$ic119$, var100), (SubLObject)ConsesLow.list((SubLObject)module0692.$ic138$, var102), (SubLObject)ConsesLow.list((SubLObject)module0692.$ic139$, var100), (SubLObject)module0692.$ic140$));
    }
    
    public static SubLObject f42399(final SubLObject var8, final SubLObject var13, SubLObject var114) {
        if (var114 == module0692.UNPROVIDED) {
            var114 = (SubLObject)module0692.$ic141$;
        }
        final SubLThread var115 = SubLProcess.currentSubLThread();
        final SubLObject var116 = (SubLObject)((module0692.NIL != module0665.f40419((SubLObject)module0692.$ic101$, var8)) ? module0656.f39832(module0665.f40419((SubLObject)module0692.$ic101$, var8)) : module0692.NIL);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
        module0655.f39768();
        module0642.f39019(module0665.f40434(var8, var114));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
        if (module0692.NIL != var116) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
            module0642.f39020(var116);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
        }
        module0642.f39020(module0015.$g160$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var115), (SubLObject)module0692.$ic142$);
        module0655.f39768();
        module0642.f39019(module0665.f40434(var8, var114));
        PrintLow.format(module0015.$g131$.getDynamicValue(var115), (SubLObject)module0692.$ic143$);
        if (module0692.NIL != module0665.f40419((SubLObject)module0692.$ic101$, var8)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var115), (SubLObject)module0692.$ic144$, module0665.f40419((SubLObject)module0692.$ic101$, var8));
        }
        else {
            PrintLow.format(module0015.$g131$.getDynamicValue(var115), (SubLObject)module0692.$ic145$);
        }
        PrintLow.format(module0015.$g131$.getDynamicValue(var115), (SubLObject)module0692.$ic146$, f42406(module0692.$g5381$.getGlobalValue(), module0692.$g5382$.getGlobalValue()));
        PrintLow.format(module0015.$g131$.getDynamicValue(var115), (SubLObject)module0692.$ic147$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0692.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0692.UNPROVIDED);
        final SubLObject var117 = module0015.$g533$.currentBinding(var115);
        try {
            module0015.$g533$.bind((SubLObject)module0692.T, var115);
            module0642.f39019(var13);
        }
        finally {
            module0015.$g533$.rebind(var117, var115);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0692.NIL;
    }
    
    public static SubLObject f42407(final SubLObject var13, SubLObject var97, SubLObject var8) {
        if (var97 == module0692.UNPROVIDED) {
            var97 = (SubLObject)module0692.NIL;
        }
        if (var8 == module0692.UNPROVIDED) {
            var8 = (SubLObject)module0692.NIL;
        }
        if (module0692.NIL == module0665.f40429(var8)) {
            var8 = module0665.f40428((SubLObject)module0692.UNPROVIDED);
        }
        var8 = f42405(var8, var97, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED);
        f42399(var8, var13, (SubLObject)module0692.UNPROVIDED);
        return (SubLObject)module0692.NIL;
    }
    
    public static SubLObject f42408() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42382", "S#46387", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42384", "S#46388", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42385", "S#46389", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42386", "S#46390", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42383", "S#46391", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42387", "S#46392", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42388", "S#46393", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42389", "CB-BLUE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42390", "S#46394", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42391", "CB-BLUE-INDEX-FRAME", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42392", "S#46395", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42393", "S#46396", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42394", "CB-BLUE-CONTENT-FRAME", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42395", "S#46397", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42397", "CB-BLUE-BUILD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42396", "S#46398", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42398", "S#46399", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42400", "CB-GRAPH-EVENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42402", "S#46400", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42403", "S#44725", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42404", "CB-BLUE-APPLET-WINDOW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42401", "S#45680", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42405", "S#46401", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42406", "S#45678", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42399", "S#46402", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0692", "f42407", "S#46403", 1, 2, false);
        return (SubLObject)module0692.NIL;
    }
    
    public static SubLObject f42409() {
        module0692.$g5456$ = SubLFiles.defparameter("S#46404", (SubLObject)module0692.NIL);
        module0692.$g5457$ = SubLFiles.defparameter("S#46405", (SubLObject)module0692.NIL);
        module0692.$g5458$ = SubLFiles.defparameter("S#46406", (SubLObject)module0692.$ic1$);
        module0692.$g5459$ = SubLFiles.deflexical("S#46407", (SubLObject)module0692.$ic3$);
        module0692.$g5460$ = SubLFiles.deflexical("S#46408", (SubLObject)module0692.$ic4$);
        module0692.$g5461$ = SubLFiles.defparameter("S#46409", (SubLObject)ConsesLow.listS((SubLObject)module0692.$ic5$, (SubLObject)module0692.$ic6$, (SubLObject)module0692.$ic7$, (SubLObject)module0692.$ic8$, (SubLObject)module0692.$ic9$, ConsesLow.append(module0692.$g5459$.getGlobalValue(), reader.bq_cons((SubLObject)module0692.$ic10$, ConsesLow.append(module0692.$g5460$.getGlobalValue(), (SubLObject)module0692.$ic11$)))));
        module0692.$g5462$ = SubLFiles.deflexical("S#46410", (SubLObject)module0692.$ic112$);
        module0692.$g5463$ = SubLFiles.deflexical("S#46411", (SubLObject)module0692.$ic113$);
        module0692.$g5464$ = SubLFiles.deflexical("S#46412", (SubLObject)module0692.$ic114$);
        module0692.$g5465$ = SubLFiles.deflexical("S#46413", (SubLObject)module0692.$ic115$);
        module0692.$g5466$ = SubLFiles.deflexical("S#46414", (SubLObject)module0692.$ic116$);
        module0692.$g5383$ = SubLFiles.deflexical("S#46415", (SubLObject)module0692.$ic117$);
        module0692.$g5467$ = SubLFiles.deflexical("S#46416", (SubLObject)module0692.$ic118$);
        module0692.$g5468$ = SubLFiles.deflexical("S#46417", (SubLObject)module0692.FIVE_INTEGER);
        module0692.$g5381$ = SubLFiles.deflexical("S#46418", (SubLObject)module0692.$ic133$);
        module0692.$g5382$ = SubLFiles.deflexical("S#46419", (SubLObject)module0692.$ic134$);
        return (SubLObject)module0692.NIL;
    }
    
    public static SubLObject f42410() {
        module0012.f441((SubLObject)module0692.$ic0$);
        module0012.f444((SubLObject)module0692.$ic0$);
        final SubLObject var116 = module0577.f35431((SubLObject)module0692.$ic2$);
        module0577.f35427(var116, (SubLObject)module0692.$ic1$);
        Hashtables.sethash(module0577.f35423(var116), module0577.$g4225$.getDynamicValue(), var116);
        module0656.f39840(module0692.$g5458$.getDynamicValue(), (SubLObject)module0692.$ic22$, (SubLObject)module0692.ONE_INTEGER);
        module0656.f39833((SubLObject)module0692.$ic24$, (SubLObject)module0692.$ic25$, (SubLObject)module0692.$ic26$, (SubLObject)module0692.$ic27$, (SubLObject)module0692.T, (SubLObject)module0692.NIL);
        module0656.f39833((SubLObject)module0692.$ic28$, (SubLObject)module0692.$ic29$, (SubLObject)module0692.$ic30$, (SubLObject)module0692.$ic27$, (SubLObject)module0692.UNPROVIDED, (SubLObject)module0692.UNPROVIDED);
        module0015.f873((SubLObject)module0692.$ic32$);
        module0015.f873((SubLObject)module0692.$ic39$);
        module0015.f873((SubLObject)module0692.$ic46$);
        module0015.f873((SubLObject)module0692.$ic52$);
        module0656.f39840((SubLObject)module0692.$ic92$, (SubLObject)module0692.$ic105$, (SubLObject)module0692.TWO_INTEGER);
        module0015.f873((SubLObject)module0692.$ic108$);
        module0015.f873((SubLObject)module0692.$ic135$);
        module0656.f39840((SubLObject)module0692.$ic148$, (SubLObject)module0692.$ic149$, (SubLObject)module0692.THREE_INTEGER);
        return (SubLObject)module0692.NIL;
    }
    
    public void declareFunctions() {
        f42408();
    }
    
    public void initializeVariables() {
        f42409();
    }
    
    public void runTopLevelForms() {
        f42410();
    }
    
    static {
        me = (SubLFile)new module0692();
        module0692.$g5456$ = null;
        module0692.$g5457$ = null;
        module0692.$g5458$ = null;
        module0692.$g5459$ = null;
        module0692.$g5460$ = null;
        module0692.$g5461$ = null;
        module0692.$g5462$ = null;
        module0692.$g5463$ = null;
        module0692.$g5464$ = null;
        module0692.$g5465$ = null;
        module0692.$g5466$ = null;
        module0692.$g5383$ = null;
        module0692.$g5467$ = null;
        module0692.$g5468$ = null;
        module0692.$g5381$ = null;
        module0692.$g5382$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#46405", "CYC");
        $ic1$ = SubLObjectFactory.makeKeyword("BLUE");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUMMARY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("S#46393", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CB-BLUE"), (SubLObject)SubLObjectFactory.makeKeyword("HANDLER-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CB-BLUE"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRED1"), (SubLObject)SubLObjectFactory.makeKeyword("PRED2"), (SubLObject)SubLObjectFactory.makeKeyword("PRED3"), (SubLObject)SubLObjectFactory.makeKeyword("PRED4"), (SubLObject)SubLObjectFactory.makeKeyword("PRED5"), (SubLObject)SubLObjectFactory.makeKeyword("PRED6"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT1"), (SubLObject)SubLObjectFactory.makeKeyword("FORT2"), (SubLObject)SubLObjectFactory.makeKeyword("FORT3"), (SubLObject)SubLObjectFactory.makeKeyword("FORT4"), (SubLObject)SubLObjectFactory.makeKeyword("FORT5"), (SubLObject)SubLObjectFactory.makeKeyword("FORT6"));
        $ic5$ = SubLObjectFactory.makeKeyword("USER-ACTION-ID-STRING");
        $ic6$ = SubLObjectFactory.makeKeyword("PREFERENCES");
        $ic7$ = SubLObjectFactory.makeKeyword("MODE");
        $ic8$ = SubLObjectFactory.makeKeyword("BUILDER-FN-KEY");
        $ic9$ = SubLObjectFactory.makeKeyword("PREDS");
        $ic10$ = SubLObjectFactory.makeKeyword("FORTS");
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("FILTER-FN-KEYS"), (SubLObject)SubLObjectFactory.makeKeyword("DEPTH"));
        $ic12$ = SubLObjectFactory.makeKeyword("CYCLIST");
        $ic13$ = SubLObjectFactory.makeKeyword("TYPE-KEY");
        $ic14$ = SubLObjectFactory.makeString("cb-blue: Could not create a user action.");
        $ic15$ = SubLObjectFactory.makeKeyword("BUILD");
        $ic16$ = SubLObjectFactory.makeKeyword("FILTER-FN-KEYS");
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BFF-CYC-KB-SUBSET-COLLECTIONS"), (SubLObject)SubLObjectFactory.makeKeyword("BFF-ARBITRARY-UNIONS"));
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BBF-FORWARD-TRUE"));
        $ic19$ = SubLObjectFactory.makeString("[Blue Grapher]");
        $ic20$ = SubLObjectFactory.makeKeyword("MAIN");
        $ic21$ = SubLObjectFactory.makeString("cb-blue");
        $ic22$ = SubLObjectFactory.makeSymbol("S#46392", "CYC");
        $ic23$ = SubLObjectFactory.makeString("Blue Grapher interaction in progress");
        $ic24$ = SubLObjectFactory.makeKeyword("BLUE-INDEX");
        $ic25$ = SubLObjectFactory.makeString("blueindex");
        $ic26$ = SubLObjectFactory.makeString("cb-blue-index-frame");
        $ic27$ = SubLObjectFactory.makeString("&:user-action-id-string=~a");
        $ic28$ = SubLObjectFactory.makeKeyword("BLUE-CONTENT");
        $ic29$ = SubLObjectFactory.makeString("bluecontent");
        $ic30$ = SubLObjectFactory.makeString("cb-blue-content-frame");
        $ic31$ = SubLObjectFactory.makeString("Blue Grapher");
        $ic32$ = SubLObjectFactory.makeSymbol("CB-BLUE");
        $ic33$ = SubLObjectFactory.makeString("Fatal Error");
        $ic34$ = SubLObjectFactory.makeString("cb-blue-internal called without a valid user-action-id-string");
        $ic35$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic36$ = SubLObjectFactory.makeString("Cannot have a FRAMESET tag inside a BODY tag.");
        $ic37$ = SubLObjectFactory.makeString("40,*");
        $ic38$ = SubLObjectFactory.makeString("no");
        $ic39$ = SubLObjectFactory.makeSymbol("CB-BLUE-INDEX-FRAME");
        $ic40$ = SubLObjectFactory.makeString("Blue Grapher Button Bar");
        $ic41$ = SubLObjectFactory.makeString("cb-blue-content-frame&:user-action-id-string=~A&::action=restart");
        $ic42$ = SubLObjectFactory.makeString("Restart");
        $ic43$ = SubLObjectFactory.makeString("|");
        $ic44$ = SubLObjectFactory.makeString("cb-blue-content-frame&:user-action-id-string=~A&::mode=build");
        $ic45$ = SubLObjectFactory.makeString("Build");
        $ic46$ = SubLObjectFactory.makeSymbol("CB-BLUE-CONTENT-FRAME");
        $ic47$ = SubLObjectFactory.makeString("cb-blue-content-frame-internal: no user action found");
        $ic48$ = SubLObjectFactory.makeKeyword("ACTION");
        $ic49$ = SubLObjectFactory.makeKeyword("RESTART");
        $ic50$ = SubLObjectFactory.makeString("invalid mode (~A) or mode not implemented");
        $ic51$ = SubLObjectFactory.makeString("cb-blue-build: no user action found");
        $ic52$ = SubLObjectFactory.makeSymbol("CB-BLUE-BUILD");
        $ic53$ = SubLObjectFactory.makeString("cb-blue-build-internal: no user action found");
        $ic54$ = SubLObjectFactory.makeSymbol("S#3971", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("S#44216", "CYC");
        $ic56$ = SubLObjectFactory.makeKeyword("MT");
        $ic57$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CyclistsMt"));
        $ic58$ = SubLObjectFactory.makeString("initial arghash");
        $ic59$ = SubLObjectFactory.makeString(" : ");
        $ic60$ = SubLObjectFactory.makeSymbol("STRING<");
        $ic61$ = SubLObjectFactory.makeSymbol("SYMBOL-NAME");
        $ic62$ = SubLObjectFactory.makeString("validation");
        $ic63$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Predicate"));
        $ic64$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $ic65$ = SubLObjectFactory.makeString("arghash after validation");
        $ic66$ = SubLObjectFactory.makeString("(user-action-data user-action) after update from arghash");
        $ic67$ = SubLObjectFactory.makeString("Blue Grapher - Building Graph");
        $ic68$ = SubLObjectFactory.makeKeyword("POST");
        $ic69$ = SubLObjectFactory.makeString("cb-blue-build");
        $ic70$ = SubLObjectFactory.makeKeyword("TOP");
        $ic71$ = SubLObjectFactory.makeString("");
        $ic72$ = SubLObjectFactory.makeKeyword("KEYWORD");
        $ic73$ = SubLObjectFactory.makeString("onChange=javascript:this.form.submit();");
        $ic74$ = SubLObjectFactory.makeKeyword("HELP-STRING");
        $ic75$ = SubLObjectFactory.makeString(".)<br>");
        $ic76$ = SubLObjectFactory.makeString(".) ");
        $ic77$ = SubLObjectFactory.makeString(".<br>");
        $ic78$ = SubLObjectFactory.makeString(".  ");
        $ic79$ = SubLObjectFactory.makeString("PREDS: ");
        $ic80$ = SubLObjectFactory.makeString("FORTS: ");
        $ic81$ = SubLObjectFactory.makeString("MT: ");
        $ic82$ = SubLObjectFactory.makeString("FILTER-FNS: ");
        $ic83$ = SubLObjectFactory.makeString("DEPTH: ");
        $ic84$ = SubLObjectFactory.makeKeyword("DEPTH");
        $ic85$ = SubLObjectFactory.makeKeyword("INTEGER");
        $ic86$ = SubLObjectFactory.makeKeyword("NBSP");
        $ic87$ = SubLObjectFactory.makeString("Submit");
        $ic88$ = SubLObjectFactory.makeKeyword("SUBMIT");
        $ic89$ = SubLObjectFactory.makeString("Status: ");
        $ic90$ = SubLObjectFactory.makeString("Ready to ");
        $ic91$ = SubLObjectFactory.makeString("+1");
        $ic92$ = SubLObjectFactory.makeKeyword("GRAPH-EVENT");
        $ic93$ = SubLObjectFactory.makeString("[Visualize]");
        $ic94$ = SubLObjectFactory.makeString("Waiting for more input.");
        $ic95$ = SubLObjectFactory.makeString("Algorithm: ");
        $ic96$ = SubLObjectFactory.makeString("Forts: ");
        $ic97$ = SubLObjectFactory.makeString("Preds: ");
        $ic98$ = SubLObjectFactory.makeString("Mt: ");
        $ic99$ = SubLObjectFactory.makeString("Depth: ");
        $ic100$ = SubLObjectFactory.makeString("Filters: ");
        $ic101$ = SubLObjectFactory.makeKeyword("SIGNATURE");
        $ic102$ = SubLObjectFactory.makeString("~A");
        $ic103$ = SubLObjectFactory.makeInteger(30);
        $ic104$ = SubLObjectFactory.makeString("cb-graph-event");
        $ic105$ = SubLObjectFactory.makeSymbol("S#46399", "CYC");
        $ic106$ = SubLObjectFactory.makeString("~a");
        $ic107$ = SubLObjectFactory.makeSymbol("S#46400", "CYC");
        $ic108$ = SubLObjectFactory.makeSymbol("CB-GRAPH-EVENT");
        $ic109$ = SubLObjectFactory.makeString("CYC");
        $ic110$ = SubLObjectFactory.makeKeyword("BUILDER-FN");
        $ic111$ = SubLObjectFactory.makeKeyword("FILTER-FNS");
        $ic112$ = SubLObjectFactory.makeString("/java/script-editor");
        $ic113$ = SubLObjectFactory.makeString("com.cyc.framework.ui.blue.cyc.CycGraphApplet");
        $ic114$ = SubLObjectFactory.makeString("100%");
        $ic115$ = SubLObjectFactory.makeString("90%");
        $ic116$ = SubLObjectFactory.makeString("com.cyc.framework.ui.blue.cyc.CycGraphCommand_AddEdge");
        $ic117$ = SubLObjectFactory.makeString("com.cyc.framework.ui.blue.cyc.CycGraphCommand_AddGraph");
        $ic118$ = SubLObjectFactory.makeString("com.cyc.framework.ui.blue.cyc.CycGraphCommand_AddNode");
        $ic119$ = SubLObjectFactory.makeKeyword("WIDTH");
        $ic120$ = SubLObjectFactory.makeKeyword("HEIGHT");
        $ic121$ = SubLObjectFactory.makeKeyword("DOMAIN-MT");
        $ic122$ = SubLObjectFactory.makeKeyword("PARSING-MT");
        $ic123$ = SubLObjectFactory.makeKeyword("GENERATION-MT");
        $ic124$ = SubLObjectFactory.makeString("script-editor");
        $ic125$ = SubLObjectFactory.makeKeyword("CLASS-FILE");
        $ic126$ = SubLObjectFactory.makeString("user");
        $ic127$ = SubLObjectFactory.makeString("domain_mt");
        $ic128$ = SubLObjectFactory.makeString("parsing_mt");
        $ic129$ = SubLObjectFactory.makeString("generation_mt");
        $ic130$ = SubLObjectFactory.makeString("signature");
        $ic131$ = SubLObjectFactory.makeString("baseport");
        $ic132$ = SubLObjectFactory.makeString("[Java applet could not be displayed]");
        $ic133$ = SubLObjectFactory.makeInteger(1010);
        $ic134$ = SubLObjectFactory.makeInteger(750);
        $ic135$ = SubLObjectFactory.makeSymbol("CB-BLUE-APPLET-WINDOW");
        $ic136$ = SubLObjectFactory.makeString("Blue Graph");
        $ic137$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEPENDENT"), (SubLObject)SubLObjectFactory.makeKeyword("NO"));
        $ic138$ = SubLObjectFactory.makeKeyword("INNERHEIGHT");
        $ic139$ = SubLObjectFactory.makeKeyword("INNERWIDTH");
        $ic140$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HOTKEYS"), (SubLObject)SubLObjectFactory.makeKeyword("NO")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DIRECTORIES"), (SubLObject)SubLObjectFactory.makeKeyword("NO")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MENUBAR"), (SubLObject)SubLObjectFactory.makeKeyword("NO")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RESIZABLE"), (SubLObject)SubLObjectFactory.makeKeyword("YES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SCROLLBARS"), (SubLObject)SubLObjectFactory.makeKeyword("YES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TOOLBAR"), (SubLObject)SubLObjectFactory.makeKeyword("NO")));
        $ic141$ = SubLObjectFactory.makeString("cb-blue-applet-window");
        $ic142$ = SubLObjectFactory.makeString("window.open('");
        $ic143$ = SubLObjectFactory.makeString("',");
        $ic144$ = SubLObjectFactory.makeString("'~A'");
        $ic145$ = SubLObjectFactory.makeString("null");
        $ic146$ = SubLObjectFactory.makeString(",'~A'); ");
        $ic147$ = SubLObjectFactory.makeString("return false;");
        $ic148$ = SubLObjectFactory.makeKeyword("BLUE-APPLET-WINDOW");
        $ic149$ = SubLObjectFactory.makeSymbol("S#46403", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0692.class
	Total time: 1802 ms
	
	Decompiled with Procyon 0.5.32.
*/