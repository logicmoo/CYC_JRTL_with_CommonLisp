package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        final SubLObject var2 = module0577.f35454((SubLObject)ConsesLow.list((SubLObject)$ic12$, module0574.f35152(), (SubLObject)$ic13$, $g5458$.getDynamicValue(var1)));
        if (NIL == module0577.f35438(var2)) {
            Errors.error((SubLObject)$ic14$);
        }
        module0577.f35447(var2, Time.get_universal_time());
        module0577.f35448(var2, Hashtables.make_hash_table((SubLObject)TWENTY_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        Hashtables.sethash((SubLObject)$ic5$, module0577.f35443(var2), (SubLObject)ConsesLow.list(module0577.f35439(var2)));
        f42383(var2);
        f42384(var2);
        return var2;
    }
    
    public static SubLObject f42384(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0577.f35443(var2);
        module0577.f35448(var2, Hashtables.make_hash_table((SubLObject)TWENTY_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        if (var4.isHashtable()) {
            SubLObject var5 = (SubLObject)NIL;
            SubLObject var6 = (SubLObject)NIL;
            final Iterator var7 = Hashtables.getEntrySetIterator(var4);
            try {
                while (Hashtables.iteratorHasNext(var7)) {
                    final Map.Entry var8 = Hashtables.iteratorNextEntry(var7);
                    var5 = Hashtables.getEntryKey(var8);
                    var6 = Hashtables.getEntryValue(var8);
                    if (NIL != module0004.f104(var5, $g5461$.getDynamicValue(var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        Hashtables.sethash(var5, module0577.f35443(var2), var6);
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var7);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42385(final SubLObject var2, final SubLObject var8) {
        module0030.f1610(var8, module0577.f35443(var2));
        module0030.f1610(module0577.f35443(var2), var8);
        f42384(var2);
        return var8;
    }
    
    public static SubLObject f42386(final SubLObject var2, final SubLObject var9) {
        SubLObject var10 = var9;
        SubLObject var11 = (SubLObject)NIL;
        var11 = var10.first();
        while (NIL != var10) {
            Hashtables.remhash(var11, module0577.f35443(var2));
            var10 = var10.rest();
            var11 = var10.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42383(final SubLObject var2) {
        SubLObject var3 = module0665.f40428((SubLObject)UNPROVIDED);
        final SubLObject var4 = Hashtables.gethash((SubLObject)$ic5$, module0577.f35443(var2), (SubLObject)UNPROVIDED);
        module0665.f40421((SubLObject)$ic7$, var3, (SubLObject)$ic15$);
        module0665.f40422((SubLObject)$ic16$, var3, (SubLObject)$ic17$);
        module0665.f40422((SubLObject)$ic8$, var3, (SubLObject)$ic18$);
        module0577.f35448(var2, Hashtables.make_hash_table((SubLObject)TWENTY_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        Hashtables.sethash((SubLObject)$ic5$, module0577.f35443(var2), var4);
        var3 = f42385(var2, var3);
        return var3;
    }
    
    public static SubLObject f42387(SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        if (NIL == var13) {
            var13 = (SubLObject)$ic19$;
        }
        final SubLObject var15 = module0656.f39832((SubLObject)$ic20$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic21$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var15) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var15);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)T, var14);
            module0642.f39019(var13);
        }
        finally {
            module0015.$g533$.rebind(var16, var14);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42388(final SubLObject var12) {
        final SubLObject var13 = module0577.f35456(var12);
        module0642.f39019((SubLObject)$ic23$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42389(SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        if (NIL != module0543.f33698()) {
            return module0667.f40583((SubLObject)$ic31$);
        }
        final SubLObject var17 = module0665.f40432(var16);
        return f42390(var17);
    }
    
    public static SubLObject f42390(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = module0030.f1606((SubLObject)$ic5$, var8, (SubLObject)UNPROVIDED);
        SubLObject var11 = (SubLObject)NIL;
        if (NIL != var10) {
            var11 = module0577.f35456(var10);
        }
        else {
            final SubLObject var12 = module0577.f35462(module0574.f35152(), $g5458$.getDynamicValue(var9));
            final SubLObject var13 = Sequences.length(var12);
            if (var13.eql((SubLObject)ZERO_INTEGER)) {
                final SubLObject var2_19 = f42382();
                module0030.f1599((SubLObject)$ic5$, module0577.f35439(var2_19), var8);
                f42390(var8);
                return (SubLObject)NIL;
            }
            if (!var13.eql((SubLObject)ONE_INTEGER)) {
                module0693.f42413($g5458$.getDynamicValue(var9));
                return (SubLObject)NIL;
            }
            var11 = var12.first();
            var10 = module0577.f35439(var11);
        }
        if (NIL == module0577.f35438(var11)) {
            module0667.f40568((SubLObject)$ic33$, PrintLow.format((SubLObject)NIL, (SubLObject)$ic34$));
        }
        else {
            module0642.f39020((SubLObject)$ic35$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            if (NIL != module0015.f713()) {
                Errors.error((SubLObject)$ic36$);
            }
            module0642.f39020(module0015.$g415$.getGlobalValue());
            module0642.f39020(module0015.$g418$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic37$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g419$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic38$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var14 = module0015.$g533$.currentBinding(var9);
            try {
                module0015.$g533$.bind((SubLObject)T, var9);
                module0656.f39836((SubLObject)$ic24$, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0656.f39836((SubLObject)$ic28$, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var14, var9);
            }
            module0642.f39020(module0015.$g416$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42391(SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        final SubLObject var17 = module0665.f40432(var16);
        return f42392(var17);
    }
    
    public static SubLObject f42392(final SubLObject var8) {
        final SubLObject var9 = module0693.f42415(var8);
        if (NIL != var9) {
            f42393(var9);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42393(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL == module0577.f35438(var2)) {
            return (SubLObject)NIL;
        }
        final SubLObject var4 = module0577.f35439(var2);
        module0642.f39020((SubLObject)$ic35$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)$ic40$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var5 = module0015.$g535$.currentBinding(var3);
        try {
            module0015.$g535$.bind((SubLObject)T, var3);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (NIL != module0015.$g509$.getGlobalValue()) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(module0015.$g509$.getGlobalValue()));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var15_20 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)T, var3);
                module0642.f39020(module0015.$g207$.getGlobalValue());
                module0642.f39020(module0015.$g209$.getGlobalValue());
                module0642.f39019((SubLObject)$ic31$);
                module0642.f39020(module0015.$g210$.getGlobalValue());
                module0642.f39020(module0015.$g208$.getGlobalValue());
                module0642.f39032((SubLObject)THREE_INTEGER);
                SubLObject var6 = module0656.f39832((SubLObject)$ic28$);
                module0642.f39020(module0015.$g381$.getGlobalValue());
                module0642.f39020(module0015.$g383$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0655.f39768();
                module0642.f39019(PrintLow.format((SubLObject)NIL, (SubLObject)$ic41$, var4));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var6) {
                    module0642.f39020(module0015.$g387$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var6);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var15_21 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)T, var3);
                    module0642.f39019((SubLObject)$ic42$);
                }
                finally {
                    module0015.$g533$.rebind(var15_21, var3);
                }
                module0642.f39020(module0015.$g382$.getGlobalValue());
                module0642.f39032((SubLObject)UNPROVIDED);
                module0642.f39019((SubLObject)$ic43$);
                module0642.f39032((SubLObject)UNPROVIDED);
                var6 = module0656.f39832((SubLObject)$ic28$);
                module0642.f39020(module0015.$g381$.getGlobalValue());
                module0642.f39020(module0015.$g383$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0655.f39768();
                module0642.f39019(PrintLow.format((SubLObject)NIL, (SubLObject)$ic44$, var4));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var6) {
                    module0642.f39020(module0015.$g387$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var6);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var15_22 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)T, var3);
                    module0642.f39019((SubLObject)$ic45$);
                }
                finally {
                    module0015.$g533$.rebind(var15_22, var3);
                }
                module0642.f39020(module0015.$g382$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var15_20, var3);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var5, var3);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42394(SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        final SubLObject var17 = module0665.f40432(var16);
        return f42395(var17);
    }
    
    public static SubLObject f42395(SubLObject var8) {
        final SubLObject var9 = module0693.f42415(var8);
        if (NIL == var9) {
            module0656.f39789((SubLObject)$ic47$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        f42385(var9, var8);
        SubLObject var11;
        final SubLObject var10 = var11 = module0030.f1606((SubLObject)$ic48$, var8, (SubLObject)UNPROVIDED);
        if (var11.eql((SubLObject)$ic49$)) {
            var8 = f42383(var9);
        }
        final SubLObject var12 = var11 = module0030.f1606((SubLObject)$ic7$, var8, (SubLObject)UNPROVIDED);
        if (var11.eql((SubLObject)$ic15$)) {
            f42396(var8, (SubLObject)UNPROVIDED);
        }
        else {
            module0656.f39789((SubLObject)$ic50$, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42397(final SubLObject var16) {
        final SubLObject var17 = module0665.f40432(var16);
        final SubLObject var18 = module0693.f42415(var17);
        if (NIL == var18) {
            module0656.f39789((SubLObject)$ic51$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        f42385(var18, var17);
        f42396(var17, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42396(final SubLObject var25, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var26 = SubLProcess.currentSubLThread();
        if (NIL == var2) {
            var2 = module0693.f42415(var25);
            if (NIL == var2) {
                module0656.f39789((SubLObject)$ic53$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                return (SubLObject)NIL;
            }
        }
        final SubLObject var27 = $g5456$.getDynamicValue(var26);
        final SubLObject var28 = Symbols.symbol_function((SubLObject)$ic54$);
        final SubLObject var29 = Symbols.symbol_function((SubLObject)$ic55$);
        final SubLObject var30 = (NIL != module0269.f17707(module0665.f40419((SubLObject)$ic56$, var25))) ? module0665.f40419((SubLObject)$ic56$, var25) : $ic57$;
        if (NIL != var27) {
            module0642.f39020(module0015.$g189$.getGlobalValue());
            module0642.f39020((SubLObject)THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0642.f39019((SubLObject)$ic58$);
            module0642.f39020(module0015.$g190$.getGlobalValue());
            module0642.f39020((SubLObject)THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            SubLObject var31 = Sort.sort(module0030.f1625(var25), Symbols.symbol_function((SubLObject)$ic60$), Symbols.symbol_function((SubLObject)$ic61$));
            SubLObject var32 = (SubLObject)NIL;
            var32 = var31.first();
            while (NIL != var31) {
                module0642.f39019(var32);
                module0642.f39019((SubLObject)$ic59$);
                module0642.f39019(Hashtables.gethash(var32, var25, (SubLObject)UNPROVIDED));
                module0642.f39026((SubLObject)UNPROVIDED);
                var31 = var31.rest();
                var32 = var31.first();
            }
        }
        if (NIL != var27) {
            module0642.f39020(module0015.$g189$.getGlobalValue());
            module0642.f39020((SubLObject)THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0642.f39019((SubLObject)$ic62$);
            module0642.f39020(module0015.$g190$.getGlobalValue());
            module0642.f39020((SubLObject)THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        }
        module0665.f40462(var25, (SubLObject)$ic9$, $g5459$.getGlobalValue(), var27, var28, var29, $ic63$, var30);
        module0665.f40462(var25, (SubLObject)$ic10$, $g5460$.getGlobalValue(), var27, var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0665.f40460(var25, (SubLObject)$ic56$, var27, var28, var29, $ic64$, module0132.$g1548$.getGlobalValue());
        if (NIL != var27) {
            module0642.f39020(module0015.$g189$.getGlobalValue());
            module0642.f39020((SubLObject)THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0642.f39019((SubLObject)$ic65$);
            module0642.f39020(module0015.$g190$.getGlobalValue());
            module0642.f39020((SubLObject)THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            SubLObject var31 = Sort.sort(module0030.f1625(var25), Symbols.symbol_function((SubLObject)$ic60$), Symbols.symbol_function((SubLObject)$ic61$));
            SubLObject var32 = (SubLObject)NIL;
            var32 = var31.first();
            while (NIL != var31) {
                module0642.f39019(var32);
                module0642.f39019((SubLObject)$ic59$);
                module0642.f39019(Hashtables.gethash(var32, var25, (SubLObject)UNPROVIDED));
                module0642.f39026((SubLObject)UNPROVIDED);
                var31 = var31.rest();
                var32 = var31.first();
            }
        }
        f42386(var2, $g5460$.getGlobalValue());
        f42386(var2, $g5459$.getGlobalValue());
        f42385(var2, var25);
        if (NIL != var27) {
            module0642.f39020(module0015.$g189$.getGlobalValue());
            module0642.f39020((SubLObject)THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0642.f39019((SubLObject)$ic66$);
            module0642.f39020(module0015.$g190$.getGlobalValue());
            module0642.f39020((SubLObject)THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            SubLObject var31 = Sort.sort(module0030.f1625(module0577.f35443(var2)), Symbols.symbol_function((SubLObject)$ic60$), Symbols.symbol_function((SubLObject)$ic61$));
            SubLObject var32 = (SubLObject)NIL;
            var32 = var31.first();
            while (NIL != var31) {
                module0642.f39019(var32);
                module0642.f39019((SubLObject)$ic59$);
                module0642.f39019(Hashtables.gethash(var32, module0577.f35443(var2), (SubLObject)UNPROVIDED));
                module0642.f39026((SubLObject)UNPROVIDED);
                var31 = var31.rest();
                var32 = var31.first();
            }
        }
        module0642.f39020((SubLObject)$ic35$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)$ic67$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0666.f40471();
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var33 = module0015.$g535$.currentBinding(var26);
        try {
            module0015.$g535$.bind((SubLObject)T, var26);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var15_30 = module0015.$g533$.currentBinding(var26);
            try {
                module0015.$g533$.bind((SubLObject)T, var26);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var26));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g285$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic68$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var15_31 = module0015.$g533$.currentBinding(var26);
                final SubLObject var34 = module0015.$g541$.currentBinding(var26);
                final SubLObject var35 = module0015.$g539$.currentBinding(var26);
                try {
                    module0015.$g533$.bind((SubLObject)T, var26);
                    module0015.$g541$.bind((SubLObject)T, var26);
                    module0015.$g539$.bind(module0015.f797(), var26);
                    module0642.f39069((SubLObject)$ic69$, (SubLObject)T, (SubLObject)UNPROVIDED);
                    module0665.f40440(var25, (SubLObject)$ic5$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var15_32 = module0015.$g533$.currentBinding(var26);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var26);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var15_33 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic70$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var15_34 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var26);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39019((SubLObject)$ic71$);
                                module0642.f39020(module0015.$g210$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var15_34, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var15_35 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var26);
                                final SubLObject var36 = module0665.f40417((SubLObject)$ic8$, (SubLObject)$ic72$);
                                module0642.f39020(module0015.$g318$.getGlobalValue());
                                module0642.f39020(module0015.$g320$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var36);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39032((SubLObject)ONE_INTEGER);
                                module0642.f39020((SubLObject)$ic73$);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var15_36 = module0015.$g533$.currentBinding(var26);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var26);
                                    SubLObject var37 = (SubLObject)NIL;
                                    SubLObject var41_42 = (SubLObject)NIL;
                                    SubLObject var38 = (SubLObject)NIL;
                                    SubLObject var44_45 = (SubLObject)NIL;
                                    var37 = module0691.f42286();
                                    var41_42 = var37.first();
                                    var38 = module0691.f42286();
                                    var44_45 = var38.first();
                                    while (NIL != var38 || NIL != var37) {
                                        final SubLObject var39 = module0035.f2171(var41_42, module0665.f40420((SubLObject)$ic8$, var25));
                                        final SubLObject var47_48 = module0665.f40415(var41_42, (SubLObject)$ic72$);
                                        module0642.f39020(module0015.$g324$.getGlobalValue());
                                        if (NIL != var39) {
                                            module0642.f39046(module0015.$g327$.getGlobalValue());
                                        }
                                        if (NIL != var47_48) {
                                            module0642.f39020(module0015.$g326$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(var47_48);
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        }
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var15_37 = module0015.$g533$.currentBinding(var26);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var26);
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
                                SubLObject var40 = module0691.f42288(module0665.f40419((SubLObject)$ic8$, var25), (SubLObject)$ic74$);
                                if (var40.isString()) {
                                    var40 = module0038.f2659((SubLObject)$ic75$, (SubLObject)$ic76$, var40, (SubLObject)UNPROVIDED);
                                    var40 = module0038.f2659((SubLObject)$ic77$, (SubLObject)$ic78$, var40, (SubLObject)UNPROVIDED);
                                    module0642.f39026((SubLObject)UNPROVIDED);
                                    final SubLObject var15_38 = module0015.$g533$.currentBinding(var26);
                                    try {
                                        module0015.$g533$.bind((SubLObject)NIL, var26);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var15_39 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var15_40 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var26);
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var15_41 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic70$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var15_42 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var26);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39019((SubLObject)$ic79$);
                                module0642.f39020(module0015.$g210$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var15_42, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var15_43 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var26);
                                module0665.f40461(var25, (SubLObject)$ic9$, $g5459$.getGlobalValue(), var27, var28, (SubLObject)ONE_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)T, (SubLObject)UNPROVIDED);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var15_44 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var15_45 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var26);
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var15_46 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic70$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var15_47 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var26);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39019((SubLObject)$ic80$);
                                module0642.f39020(module0015.$g210$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var15_47, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var15_48 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var26);
                                module0665.f40461(var25, (SubLObject)$ic10$, $g5460$.getGlobalValue(), var27, var28, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)T, $ic63$);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var15_49 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var15_50 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var26);
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var15_51 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic70$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var15_52 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var26);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39019((SubLObject)$ic81$);
                                module0642.f39020(module0015.$g210$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var15_52, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var15_53 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var26);
                                module0665.f40452(var25, (SubLObject)$ic56$, var27, var28, (SubLObject)T, (SubLObject)T, $ic64$);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var15_54 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var15_55 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var26);
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var15_56 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic70$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var15_57 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var26);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39019((SubLObject)$ic82$);
                                module0642.f39020(module0015.$g210$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var15_57, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var15_58 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var26);
                                SubLObject var41 = module0691.f42275((SubLObject)UNPROVIDED);
                                SubLObject var42 = (SubLObject)NIL;
                                var42 = var41.first();
                                while (NIL != var41) {
                                    module0665.f40436(var25, (SubLObject)$ic16$, var42, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    module0642.f39019(var42);
                                    module0642.f39026((SubLObject)UNPROVIDED);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var15_59 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var15_60 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var26);
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var15_61 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic70$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var15_62 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var26);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39019((SubLObject)$ic83$);
                                module0642.f39020(module0015.$g210$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var15_62, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var15_63 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var26);
                                module0665.f40448(var25, (SubLObject)$ic84$, (SubLObject)ONE_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)$ic85$);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var15_64 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var15_65 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var26);
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var15_66 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic70$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var15_67 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var26);
                                module0642.f39027((SubLObject)$ic86$, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var15_67, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var15_68 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var26);
                                module0665.f40445(var25, (SubLObject)$ic87$, (SubLObject)$ic88$, (SubLObject)UNPROVIDED);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var15_69 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var15_70 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var26);
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        final SubLObject var43 = module0665.f40419((SubLObject)$ic8$, var25);
                        final SubLObject var44 = module0665.f40420((SubLObject)$ic10$, var25);
                        final SubLObject var45 = module0665.f40420((SubLObject)$ic9$, var25);
                        final SubLObject var46 = module0665.f40419((SubLObject)$ic56$, var25);
                        final SubLObject var47 = module0665.f40419((SubLObject)$ic84$, var25);
                        final SubLObject var48 = module0665.f40420((SubLObject)$ic16$, var25);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var15_71 = module0015.$g533$.currentBinding(var26);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var26);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic70$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var15_72 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var26);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39019((SubLObject)$ic89$);
                                module0642.f39020(module0015.$g210$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var15_72, var26);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var15_73 = module0015.$g533$.currentBinding(var26);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var26);
                                if (Packages.intern(module0038.f2968(var43), (SubLObject)UNPROVIDED).isFunctionSpec() && ZERO_INTEGER.numL(Sequences.length(var44)) && ZERO_INTEGER.numL(Sequences.length(var45)) && NIL != module0269.f17731(var46) && var47.isNumber()) {
                                    module0642.f39019((SubLObject)$ic90$);
                                    module0642.f39020(module0015.$g219$.getGlobalValue());
                                    module0642.f39020(module0015.$g221$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020((SubLObject)$ic91$);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var15_74 = module0015.$g533$.currentBinding(var26);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var26);
                                        module0642.f39020(module0015.$g209$.getGlobalValue());
                                        module0656.f39837((SubLObject)$ic92$, (SubLObject)$ic93$, module0577.f35443(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0015.$g210$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var15_74, var26);
                                    }
                                    module0642.f39020(module0015.$g220$.getGlobalValue());
                                }
                                else {
                                    module0642.f39020(module0015.$g209$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic94$);
                                    module0642.f39020(module0015.$g210$.getGlobalValue());
                                }
                                module0642.f39026((SubLObject)TWO_INTEGER);
                                module0642.f39019((SubLObject)$ic95$);
                                module0642.f39019(var43);
                                module0642.f39026((SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic96$);
                                module0656.f39804(var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39026((SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic97$);
                                module0656.f39804(var45, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39026((SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic98$);
                                module0656.f39804(var46, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39026((SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic99$);
                                module0642.f39019(var47);
                                module0642.f39026((SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic100$);
                                module0642.f39019(var48);
                                module0642.f39026((SubLObject)UNPROVIDED);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
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
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var15_30, var26);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var33, var26);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42398(final SubLObject var13, final SubLObject var8) {
        module0665.f40421((SubLObject)$ic101$, var8, PrintLow.format((SubLObject)NIL, (SubLObject)$ic102$, random.random(Numbers.expt((SubLObject)TWO_INTEGER, (SubLObject)$ic103$))));
        f42399(var8, var13, (SubLObject)$ic104$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42400(final SubLObject var16) {
        final SubLObject var17 = module0665.f40432(var16);
        module0665.f40421((SubLObject)$ic101$, var17, PrintLow.format((SubLObject)NIL, (SubLObject)$ic106$, random.random(Numbers.expt((SubLObject)TWO_INTEGER, (SubLObject)$ic103$))));
        f42401(var17);
        module0004.f78((SubLObject)$ic104$, Symbols.symbol_function((SubLObject)$ic107$), (SubLObject)ConsesLow.list(var17));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42402(final SubLObject var8) {
        final SubLObject var9 = module0665.f40420((SubLObject)$ic9$, var8);
        final SubLObject var10 = module0665.f40420((SubLObject)$ic10$, var8);
        final SubLObject var11 = module0665.f40419((SubLObject)$ic56$, var8);
        final SubLObject var12 = module0665.f40419((SubLObject)$ic84$, var8);
        final SubLObject var13 = module0665.f40420((SubLObject)$ic16$, var8);
        SubLObject var14 = (SubLObject)NIL;
        final SubLObject var15 = module0665.f40419((SubLObject)$ic8$, var8);
        final SubLObject var16 = Packages.intern(module0038.f2968(var15), (SubLObject)$ic109$);
        final SubLObject var17 = module0665.f40419((SubLObject)$ic101$, var8);
        SubLObject var18 = var13;
        SubLObject var19 = (SubLObject)NIL;
        var19 = var18.first();
        while (NIL != var18) {
            var14 = (SubLObject)ConsesLow.cons(Packages.intern(module0038.f2968(var19), (SubLObject)$ic109$), var14);
            var18 = var18.rest();
            var19 = var18.first();
        }
        var14 = Sequences.nreverse(var14);
        module0691.f42322(var17, (SubLObject)ConsesLow.list($g5383$.getGlobalValue(), (SubLObject)ConsesLow.list(new SubLObject[] { $ic110$, var16, $ic9$, var9, $ic10$, var10, $ic56$, var11, $ic84$, var12, $ic111$, var14 })));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42403(final SubLObject var98) {
        final SubLThread var99 = SubLProcess.currentSubLThread();
        final SubLObject var100 = conses_high.getf(var98, (SubLObject)$ic119$, (SubLObject)UNPROVIDED);
        final SubLObject var101 = (var100.isString() || (var100.isInteger() && var100.numG((SubLObject)ZERO_INTEGER))) ? var100 : $g5464$.getGlobalValue();
        final SubLObject var102 = conses_high.getf(var98, (SubLObject)$ic120$, (SubLObject)UNPROVIDED);
        final SubLObject var103 = (var102.isInteger() && var102.numG((SubLObject)ZERO_INTEGER)) ? var102 : $g5465$.getGlobalValue();
        final SubLObject var104 = conses_high.getf(var98, (SubLObject)$ic121$, (SubLObject)UNPROVIDED);
        final SubLObject var105 = (SubLObject)((NIL != module0269.f17731(var104)) ? var104 : NIL);
        final SubLObject var106 = conses_high.getf(var98, (SubLObject)$ic122$, (SubLObject)UNPROVIDED);
        final SubLObject var107 = (SubLObject)((NIL != module0269.f17731(var106)) ? var106 : NIL);
        final SubLObject var108 = conses_high.getf(var98, (SubLObject)$ic123$, (SubLObject)UNPROVIDED);
        final SubLObject var109 = (SubLObject)((NIL != module0269.f17731(var108)) ? var108 : NIL);
        final SubLObject var110 = conses_high.getf(var98, (SubLObject)$ic101$, (SubLObject)UNPROVIDED);
        final SubLObject var111 = $g5462$.getGlobalValue();
        final SubLObject var112 = module0014.f675((SubLObject)$ic124$);
        final SubLObject var113 = conses_high.getf(var98, (SubLObject)$ic125$, (SubLObject)UNPROVIDED);
        final SubLObject var114 = var113.isString() ? var113 : $g5463$.getGlobalValue();
        module0642.f39020(module0015.$g442$.getGlobalValue());
        module0642.f39020(module0015.$g444$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var114);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g445$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var111);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g446$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var112);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g451$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var103);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g452$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var101);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var115 = module0015.$g533$.currentBinding(var99);
        try {
            module0015.$g533$.bind((SubLObject)T, var99);
            module0642.f39020(module0015.$g453$.getGlobalValue());
            module0642.f39020(module0015.$g454$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic126$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g455$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(PrintLow.format((SubLObject)NIL, (SubLObject)$ic102$, module0574.f35152()));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            if (NIL != var105) {
                module0642.f39020(module0015.$g453$.getGlobalValue());
                module0642.f39020(module0015.$g454$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic127$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g455$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0597.f36628(var105));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            }
            if (NIL != var107) {
                module0642.f39020(module0015.$g453$.getGlobalValue());
                module0642.f39020(module0015.$g454$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic128$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g455$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0597.f36628(var107));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            }
            if (NIL != var109) {
                module0642.f39020(module0015.$g453$.getGlobalValue());
                module0642.f39020(module0015.$g454$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic129$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g455$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0597.f36628(var109));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g453$.getGlobalValue());
            module0642.f39020(module0015.$g454$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic130$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g455$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var110);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g453$.getGlobalValue());
            module0642.f39020(module0015.$g454$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic131$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g455$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0110.$g1378$.getDynamicValue(var99));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0642.f39019((SubLObject)$ic132$);
        }
        finally {
            module0015.$g533$.rebind(var115, var99);
        }
        module0642.f39020(module0015.$g443$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42404(final SubLObject var16) {
        return f42401(module0665.f40432(var16));
    }
    
    public static SubLObject f42401(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        module0691.f42317();
        module0642.f39020((SubLObject)$ic35$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)$ic136$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var10 = module0015.$g535$.currentBinding(var9);
        try {
            module0015.$g535$.bind((SubLObject)T, var9);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var15_113 = module0015.$g533$.currentBinding(var9);
            try {
                module0015.$g533$.bind((SubLObject)T, var9);
                f42403((SubLObject)ConsesLow.list(new SubLObject[] { $ic119$, module0665.f40419((SubLObject)$ic119$, var8), $ic120$, module0665.f40419((SubLObject)$ic120$, var8), $ic121$, module0665.f40419((SubLObject)$ic121$, var8), $ic122$, module0665.f40419((SubLObject)$ic121$, var8), $ic123$, module0665.f40419((SubLObject)$ic123$, var8), $ic101$, module0665.f40419((SubLObject)$ic101$, var8) }));
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var15_113, var9);
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
    
    public static SubLObject f42405(final SubLObject var8, final SubLObject var97, SubLObject var100, SubLObject var102) {
        if (var100 == UNPROVIDED) {
            var100 = $g5381$.getGlobalValue();
        }
        if (var102 == UNPROVIDED) {
            var102 = $g5382$.getGlobalValue();
        }
        module0665.f40421((SubLObject)$ic101$, var8, var97);
        module0665.f40421((SubLObject)$ic119$, var8, var100);
        module0665.f40421((SubLObject)$ic120$, var8, var102);
        return var8;
    }
    
    public static SubLObject f42406(final SubLObject var100, final SubLObject var102) {
        return module0662.f40314((SubLObject)ConsesLow.listS((SubLObject)$ic137$, (SubLObject)ConsesLow.list((SubLObject)$ic120$, var102), (SubLObject)ConsesLow.list((SubLObject)$ic119$, var100), (SubLObject)ConsesLow.list((SubLObject)$ic138$, var102), (SubLObject)ConsesLow.list((SubLObject)$ic139$, var100), (SubLObject)$ic140$));
    }
    
    public static SubLObject f42399(final SubLObject var8, final SubLObject var13, SubLObject var114) {
        if (var114 == UNPROVIDED) {
            var114 = (SubLObject)$ic141$;
        }
        final SubLThread var115 = SubLProcess.currentSubLThread();
        final SubLObject var116 = (SubLObject)((NIL != module0665.f40419((SubLObject)$ic101$, var8)) ? module0656.f39832(module0665.f40419((SubLObject)$ic101$, var8)) : NIL);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019(module0665.f40434(var8, var114));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var116) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var116);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g160$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var115), (SubLObject)$ic142$);
        module0655.f39768();
        module0642.f39019(module0665.f40434(var8, var114));
        PrintLow.format(module0015.$g131$.getDynamicValue(var115), (SubLObject)$ic143$);
        if (NIL != module0665.f40419((SubLObject)$ic101$, var8)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var115), (SubLObject)$ic144$, module0665.f40419((SubLObject)$ic101$, var8));
        }
        else {
            PrintLow.format(module0015.$g131$.getDynamicValue(var115), (SubLObject)$ic145$);
        }
        PrintLow.format(module0015.$g131$.getDynamicValue(var115), (SubLObject)$ic146$, f42406($g5381$.getGlobalValue(), $g5382$.getGlobalValue()));
        PrintLow.format(module0015.$g131$.getDynamicValue(var115), (SubLObject)$ic147$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var117 = module0015.$g533$.currentBinding(var115);
        try {
            module0015.$g533$.bind((SubLObject)T, var115);
            module0642.f39019(var13);
        }
        finally {
            module0015.$g533$.rebind(var117, var115);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42407(final SubLObject var13, SubLObject var97, SubLObject var8) {
        if (var97 == UNPROVIDED) {
            var97 = (SubLObject)NIL;
        }
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        if (NIL == module0665.f40429(var8)) {
            var8 = module0665.f40428((SubLObject)UNPROVIDED);
        }
        var8 = f42405(var8, var97, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f42399(var8, var13, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42409() {
        $g5456$ = SubLFiles.defparameter("S#46404", (SubLObject)NIL);
        $g5457$ = SubLFiles.defparameter("S#46405", (SubLObject)NIL);
        $g5458$ = SubLFiles.defparameter("S#46406", (SubLObject)$ic1$);
        $g5459$ = SubLFiles.deflexical("S#46407", (SubLObject)$ic3$);
        $g5460$ = SubLFiles.deflexical("S#46408", (SubLObject)$ic4$);
        $g5461$ = SubLFiles.defparameter("S#46409", (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)$ic6$, (SubLObject)$ic7$, (SubLObject)$ic8$, (SubLObject)$ic9$, ConsesLow.append($g5459$.getGlobalValue(), reader.bq_cons((SubLObject)$ic10$, ConsesLow.append($g5460$.getGlobalValue(), (SubLObject)$ic11$)))));
        $g5462$ = SubLFiles.deflexical("S#46410", (SubLObject)$ic112$);
        $g5463$ = SubLFiles.deflexical("S#46411", (SubLObject)$ic113$);
        $g5464$ = SubLFiles.deflexical("S#46412", (SubLObject)$ic114$);
        $g5465$ = SubLFiles.deflexical("S#46413", (SubLObject)$ic115$);
        $g5466$ = SubLFiles.deflexical("S#46414", (SubLObject)$ic116$);
        $g5383$ = SubLFiles.deflexical("S#46415", (SubLObject)$ic117$);
        $g5467$ = SubLFiles.deflexical("S#46416", (SubLObject)$ic118$);
        $g5468$ = SubLFiles.deflexical("S#46417", (SubLObject)FIVE_INTEGER);
        $g5381$ = SubLFiles.deflexical("S#46418", (SubLObject)$ic133$);
        $g5382$ = SubLFiles.deflexical("S#46419", (SubLObject)$ic134$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42410() {
        module0012.f441((SubLObject)$ic0$);
        module0012.f444((SubLObject)$ic0$);
        final SubLObject var116 = module0577.f35431((SubLObject)$ic2$);
        module0577.f35427(var116, (SubLObject)$ic1$);
        Hashtables.sethash(module0577.f35423(var116), module0577.$g4225$.getDynamicValue(), var116);
        module0656.f39840($g5458$.getDynamicValue(), (SubLObject)$ic22$, (SubLObject)ONE_INTEGER);
        module0656.f39833((SubLObject)$ic24$, (SubLObject)$ic25$, (SubLObject)$ic26$, (SubLObject)$ic27$, (SubLObject)T, (SubLObject)NIL);
        module0656.f39833((SubLObject)$ic28$, (SubLObject)$ic29$, (SubLObject)$ic30$, (SubLObject)$ic27$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0015.f873((SubLObject)$ic32$);
        module0015.f873((SubLObject)$ic39$);
        module0015.f873((SubLObject)$ic46$);
        module0015.f873((SubLObject)$ic52$);
        module0656.f39840((SubLObject)$ic92$, (SubLObject)$ic105$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic108$);
        module0015.f873((SubLObject)$ic135$);
        module0656.f39840((SubLObject)$ic148$, (SubLObject)$ic149$, (SubLObject)THREE_INTEGER);
        return (SubLObject)NIL;
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
        $g5456$ = null;
        $g5457$ = null;
        $g5458$ = null;
        $g5459$ = null;
        $g5460$ = null;
        $g5461$ = null;
        $g5462$ = null;
        $g5463$ = null;
        $g5464$ = null;
        $g5465$ = null;
        $g5466$ = null;
        $g5383$ = null;
        $g5467$ = null;
        $g5468$ = null;
        $g5381$ = null;
        $g5382$ = null;
        $ic0$ = makeSymbol("S#46405", "CYC");
        $ic1$ = makeKeyword("BLUE");
        $ic2$ = ConsesLow.list((SubLObject)makeKeyword("SUMMARY-FN"), (SubLObject)makeSymbol("S#46393", "CYC"), (SubLObject)makeKeyword("DISPLAY-FN"), (SubLObject)makeSymbol("CB-BLUE"), (SubLObject)makeKeyword("HANDLER-FN"), (SubLObject)makeSymbol("CB-BLUE"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("PRED1"), (SubLObject)makeKeyword("PRED2"), (SubLObject)makeKeyword("PRED3"), (SubLObject)makeKeyword("PRED4"), (SubLObject)makeKeyword("PRED5"), (SubLObject)makeKeyword("PRED6"));
        $ic4$ = ConsesLow.list((SubLObject)makeKeyword("FORT1"), (SubLObject)makeKeyword("FORT2"), (SubLObject)makeKeyword("FORT3"), (SubLObject)makeKeyword("FORT4"), (SubLObject)makeKeyword("FORT5"), (SubLObject)makeKeyword("FORT6"));
        $ic5$ = makeKeyword("USER-ACTION-ID-STRING");
        $ic6$ = makeKeyword("PREFERENCES");
        $ic7$ = makeKeyword("MODE");
        $ic8$ = makeKeyword("BUILDER-FN-KEY");
        $ic9$ = makeKeyword("PREDS");
        $ic10$ = makeKeyword("FORTS");
        $ic11$ = ConsesLow.list((SubLObject)makeKeyword("MT"), (SubLObject)makeKeyword("FILTER-FN-KEYS"), (SubLObject)makeKeyword("DEPTH"));
        $ic12$ = makeKeyword("CYCLIST");
        $ic13$ = makeKeyword("TYPE-KEY");
        $ic14$ = makeString("cb-blue: Could not create a user action.");
        $ic15$ = makeKeyword("BUILD");
        $ic16$ = makeKeyword("FILTER-FN-KEYS");
        $ic17$ = ConsesLow.list((SubLObject)makeKeyword("BFF-CYC-KB-SUBSET-COLLECTIONS"), (SubLObject)makeKeyword("BFF-ARBITRARY-UNIONS"));
        $ic18$ = ConsesLow.list((SubLObject)makeKeyword("BBF-FORWARD-TRUE"));
        $ic19$ = makeString("[Blue Grapher]");
        $ic20$ = makeKeyword("MAIN");
        $ic21$ = makeString("cb-blue");
        $ic22$ = makeSymbol("S#46392", "CYC");
        $ic23$ = makeString("Blue Grapher interaction in progress");
        $ic24$ = makeKeyword("BLUE-INDEX");
        $ic25$ = makeString("blueindex");
        $ic26$ = makeString("cb-blue-index-frame");
        $ic27$ = makeString("&:user-action-id-string=~a");
        $ic28$ = makeKeyword("BLUE-CONTENT");
        $ic29$ = makeString("bluecontent");
        $ic30$ = makeString("cb-blue-content-frame");
        $ic31$ = makeString("Blue Grapher");
        $ic32$ = makeSymbol("CB-BLUE");
        $ic33$ = makeString("Fatal Error");
        $ic34$ = makeString("cb-blue-internal called without a valid user-action-id-string");
        $ic35$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic36$ = makeString("Cannot have a FRAMESET tag inside a BODY tag.");
        $ic37$ = makeString("40,*");
        $ic38$ = makeString("no");
        $ic39$ = makeSymbol("CB-BLUE-INDEX-FRAME");
        $ic40$ = makeString("Blue Grapher Button Bar");
        $ic41$ = makeString("cb-blue-content-frame&:user-action-id-string=~A&::action=restart");
        $ic42$ = makeString("Restart");
        $ic43$ = makeString("|");
        $ic44$ = makeString("cb-blue-content-frame&:user-action-id-string=~A&::mode=build");
        $ic45$ = makeString("Build");
        $ic46$ = makeSymbol("CB-BLUE-CONTENT-FRAME");
        $ic47$ = makeString("cb-blue-content-frame-internal: no user action found");
        $ic48$ = makeKeyword("ACTION");
        $ic49$ = makeKeyword("RESTART");
        $ic50$ = makeString("invalid mode (~A) or mode not implemented");
        $ic51$ = makeString("cb-blue-build: no user action found");
        $ic52$ = makeSymbol("CB-BLUE-BUILD");
        $ic53$ = makeString("cb-blue-build-internal: no user action found");
        $ic54$ = makeSymbol("S#3971", "CYC");
        $ic55$ = makeSymbol("S#44216", "CYC");
        $ic56$ = makeKeyword("MT");
        $ic57$ = constant_handles_oc.f8479((SubLObject)makeString("CyclistsMt"));
        $ic58$ = makeString("initial arghash");
        $ic59$ = makeString(" : ");
        $ic60$ = makeSymbol("STRING<");
        $ic61$ = makeSymbol("SYMBOL-NAME");
        $ic62$ = makeString("validation");
        $ic63$ = constant_handles_oc.f8479((SubLObject)makeString("Predicate"));
        $ic64$ = constant_handles_oc.f8479((SubLObject)makeString("Microtheory"));
        $ic65$ = makeString("arghash after validation");
        $ic66$ = makeString("(user-action-data user-action) after update from arghash");
        $ic67$ = makeString("Blue Grapher - Building Graph");
        $ic68$ = makeKeyword("POST");
        $ic69$ = makeString("cb-blue-build");
        $ic70$ = makeKeyword("TOP");
        $ic71$ = makeString("");
        $ic72$ = makeKeyword("KEYWORD");
        $ic73$ = makeString("onChange=javascript:this.form.submit();");
        $ic74$ = makeKeyword("HELP-STRING");
        $ic75$ = makeString(".)<br>");
        $ic76$ = makeString(".) ");
        $ic77$ = makeString(".<br>");
        $ic78$ = makeString(".  ");
        $ic79$ = makeString("PREDS: ");
        $ic80$ = makeString("FORTS: ");
        $ic81$ = makeString("MT: ");
        $ic82$ = makeString("FILTER-FNS: ");
        $ic83$ = makeString("DEPTH: ");
        $ic84$ = makeKeyword("DEPTH");
        $ic85$ = makeKeyword("INTEGER");
        $ic86$ = makeKeyword("NBSP");
        $ic87$ = makeString("Submit");
        $ic88$ = makeKeyword("SUBMIT");
        $ic89$ = makeString("Status: ");
        $ic90$ = makeString("Ready to ");
        $ic91$ = makeString("+1");
        $ic92$ = makeKeyword("GRAPH-EVENT");
        $ic93$ = makeString("[Visualize]");
        $ic94$ = makeString("Waiting for more input.");
        $ic95$ = makeString("Algorithm: ");
        $ic96$ = makeString("Forts: ");
        $ic97$ = makeString("Preds: ");
        $ic98$ = makeString("Mt: ");
        $ic99$ = makeString("Depth: ");
        $ic100$ = makeString("Filters: ");
        $ic101$ = makeKeyword("SIGNATURE");
        $ic102$ = makeString("~A");
        $ic103$ = makeInteger(30);
        $ic104$ = makeString("cb-graph-event");
        $ic105$ = makeSymbol("S#46399", "CYC");
        $ic106$ = makeString("~a");
        $ic107$ = makeSymbol("S#46400", "CYC");
        $ic108$ = makeSymbol("CB-GRAPH-EVENT");
        $ic109$ = makeString("CYC");
        $ic110$ = makeKeyword("BUILDER-FN");
        $ic111$ = makeKeyword("FILTER-FNS");
        $ic112$ = makeString("/java/script-editor");
        $ic113$ = makeString("com.cyc.framework.ui.blue.cyc.CycGraphApplet");
        $ic114$ = makeString("100%");
        $ic115$ = makeString("90%");
        $ic116$ = makeString("com.cyc.framework.ui.blue.cyc.CycGraphCommand_AddEdge");
        $ic117$ = makeString("com.cyc.framework.ui.blue.cyc.CycGraphCommand_AddGraph");
        $ic118$ = makeString("com.cyc.framework.ui.blue.cyc.CycGraphCommand_AddNode");
        $ic119$ = makeKeyword("WIDTH");
        $ic120$ = makeKeyword("HEIGHT");
        $ic121$ = makeKeyword("DOMAIN-MT");
        $ic122$ = makeKeyword("PARSING-MT");
        $ic123$ = makeKeyword("GENERATION-MT");
        $ic124$ = makeString("script-editor");
        $ic125$ = makeKeyword("CLASS-FILE");
        $ic126$ = makeString("user");
        $ic127$ = makeString("domain_mt");
        $ic128$ = makeString("parsing_mt");
        $ic129$ = makeString("generation_mt");
        $ic130$ = makeString("signature");
        $ic131$ = makeString("baseport");
        $ic132$ = makeString("[Java applet could not be displayed]");
        $ic133$ = makeInteger(1010);
        $ic134$ = makeInteger(750);
        $ic135$ = makeSymbol("CB-BLUE-APPLET-WINDOW");
        $ic136$ = makeString("Blue Graph");
        $ic137$ = ConsesLow.list((SubLObject)makeKeyword("DEPENDENT"), (SubLObject)makeKeyword("NO"));
        $ic138$ = makeKeyword("INNERHEIGHT");
        $ic139$ = makeKeyword("INNERWIDTH");
        $ic140$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("HOTKEYS"), (SubLObject)makeKeyword("NO")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("DIRECTORIES"), (SubLObject)makeKeyword("NO")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("MENUBAR"), (SubLObject)makeKeyword("NO")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("RESIZABLE"), (SubLObject)makeKeyword("YES")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("SCROLLBARS"), (SubLObject)makeKeyword("YES")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TOOLBAR"), (SubLObject)makeKeyword("NO")));
        $ic141$ = makeString("cb-blue-applet-window");
        $ic142$ = makeString("window.open('");
        $ic143$ = makeString("',");
        $ic144$ = makeString("'~A'");
        $ic145$ = makeString("null");
        $ic146$ = makeString(",'~A'); ");
        $ic147$ = makeString("return false;");
        $ic148$ = makeKeyword("BLUE-APPLET-WINDOW");
        $ic149$ = makeSymbol("S#46403", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1802 ms
	
	Decompiled with Procyon 0.5.32.
*/