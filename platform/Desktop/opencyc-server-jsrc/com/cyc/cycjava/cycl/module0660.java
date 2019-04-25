package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0660 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0660";
    public static final String myFingerPrint = "fc71adcf0bef7e021895a790765d71496e607022d3fd428d0efec9bbf598d027";
    private static SubLSymbol $g5199$;
    public static SubLSymbol $g5200$;
    private static SubLSymbol $g5202$;
    private static SubLSymbol $g5203$;
    private static SubLSymbol $g5204$;
    private static SubLSymbol $g5205$;
    public static SubLSymbol $g5206$;
    private static SubLSymbol $g5207$;
    public static SubLSymbol $g5208$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLInteger $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLInteger $ic71$;
    private static final SubLObject $ic72$;
    private static final SubLString $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLString $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLInteger $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLString $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLString $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLString $ic120$;
    private static final SubLString $ic121$;
    private static final SubLString $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLString $ic133$;
    private static final SubLObject $ic134$;
    private static final SubLObject $ic135$;
    private static final SubLInteger $ic136$;
    private static final SubLInteger $ic137$;
    private static final SubLInteger $ic138$;
    private static final SubLList $ic139$;
    private static final SubLList $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLString $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLString $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLString $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLString $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLString $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLList $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLList $ic172$;
    private static final SubLString $ic173$;
    private static final SubLString $ic174$;
    private static final SubLString $ic175$;
    private static final SubLString $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLString $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLString $ic181$;
    private static final SubLString $ic182$;
    private static final SubLString $ic183$;
    private static final SubLString $ic184$;
    private static final SubLString $ic185$;
    private static final SubLString $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLString $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLString $ic190$;
    private static final SubLString $ic191$;
    private static final SubLString $ic192$;
    private static final SubLString $ic193$;
    private static final SubLString $ic194$;
    private static final SubLString $ic195$;
    private static final SubLSymbol $ic196$;
    
    public static SubLObject f40138(SubLObject var1) {
        if (var1 == module0660.UNPROVIDED) {
            var1 = (SubLObject)module0660.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)module0660.$ic0$);
        module0642.f39029((SubLObject)module0660.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
        final SubLObject var3 = module0014.f672((SubLObject)module0660.$ic1$);
        module0642.f39029((SubLObject)module0660.UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39020((SubLObject)module0660.$ic2$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        if (module0660.NIL != var3) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            module0642.f39020(var3);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39020((SubLObject)module0660.$ic3$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
        module0642.f39029((SubLObject)module0660.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019(f40139((SubLObject)module0660.UNPROVIDED));
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0660.UNPROVIDED);
        if (module0660.NIL != module0015.f713()) {
            Errors.error((SubLObject)module0660.$ic4$);
        }
        module0642.f39020(module0015.$g415$.getGlobalValue());
        module0642.f39020(module0015.$g418$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39020((SubLObject)module0660.$ic5$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
        final SubLObject var4 = module0015.$g533$.currentBinding(var2);
        try {
            module0015.$g533$.bind((SubLObject)module0660.T, var2);
            module0656.f39836((SubLObject)module0660.$ic6$, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
            module0656.f39836((SubLObject)module0660.$ic7$, var1, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
            module0656.f39836((SubLObject)module0660.$ic8$, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
            module0642.f39020(module0015.$g461$.getGlobalValue());
            final SubLObject var4_5 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)module0660.T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_6 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    module0642.f39020(module0015.$g209$.getGlobalValue());
                    module0642.f39019((SubLObject)module0660.$ic9$);
                    module0656.f39837((SubLObject)module0660.$ic10$, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39019((SubLObject)module0660.$ic11$);
                    module0642.f39020(module0015.$g210$.getGlobalValue());
                    module0642.f39029((SubLObject)module0660.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_6, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0660.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_5, var2);
            }
            module0642.f39020(module0015.$g462$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var4, var2);
        }
        module0642.f39020(module0015.$g416$.getGlobalValue());
        module0642.f39029((SubLObject)module0660.UNPROVIDED);
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0660.UNPROVIDED);
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40139(SubLObject var7) {
        if (var7 == module0660.UNPROVIDED) {
            var7 = (SubLObject)module0660.NIL;
        }
        SubLObject var8 = Strings.string_downcase(Environment.get_machine_name((SubLObject)module0660.UNPROVIDED), (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
        if (var8.isString()) {
            var8 = Sequences.cconcatenate((SubLObject)module0660.$ic14$, new SubLObject[] { module0006.f203(var8), module0660.$ic15$ });
        }
        else {
            var8 = (SubLObject)module0660.$ic16$;
        }
        if (var7.isString()) {
            var7 = Sequences.cconcatenate((SubLObject)module0660.$ic17$, var7);
        }
        else {
            var7 = (SubLObject)module0660.$ic16$;
        }
        return PrintLow.format((SubLObject)module0660.NIL, (SubLObject)module0660.$ic18$, new SubLObject[] { module0660.$g5199$.getGlobalValue(), var7, var8 });
    }
    
    public static SubLObject f40140(SubLObject var9) {
        if (var9 == module0660.UNPROVIDED) {
            var9 = (SubLObject)module0660.NIL;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (module0660.NIL == var9) {
            var9 = (SubLObject)module0660.$ic19$;
        }
        final SubLObject var11 = module0656.f39832((SubLObject)module0660.$ic20$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0660.$ic21$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        if (module0660.NIL != var11) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            module0642.f39020(var11);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
        final SubLObject var12 = module0015.$g533$.currentBinding(var10);
        try {
            module0015.$g533$.bind((SubLObject)module0660.T, var10);
            module0642.f39019(var9);
        }
        finally {
            module0015.$g533$.rebind(var12, var10);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40141(SubLObject var1) {
        if (var1 == module0660.UNPROVIDED) {
            var1 = (SubLObject)module0660.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)module0660.$ic0$);
        module0642.f39029((SubLObject)module0660.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
        final SubLObject var3 = module0014.f672((SubLObject)module0660.$ic1$);
        module0642.f39029((SubLObject)module0660.UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39020((SubLObject)module0660.$ic2$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        if (module0660.NIL != var3) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            module0642.f39020(var3);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39020((SubLObject)module0660.$ic3$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
        module0666.f40487();
        module0666.f40535();
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0660.UNPROVIDED);
        final SubLObject var4 = module0015.$g535$.currentBinding(var2);
        try {
            module0015.$g535$.bind((SubLObject)module0660.T, var2);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (module0660.NIL != module0015.$g529$.getGlobalValue()) {
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0015.$g529$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
            final SubLObject var4_11 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)module0660.T, var2);
                f40142();
                module0642.f39029((SubLObject)module0660.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var4_11, var2);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0660.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var4, var2);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0660.UNPROVIDED);
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40143(SubLObject var9) {
        if (var9 == module0660.UNPROVIDED) {
            var9 = (SubLObject)module0660.NIL;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (module0660.NIL == var9) {
            var9 = (SubLObject)module0660.$ic28$;
        }
        final SubLObject var11 = module0656.f39832((SubLObject)module0660.$ic6$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0660.$ic29$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        if (module0660.NIL != var11) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            module0642.f39020(var11);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
        final SubLObject var12 = module0015.$g533$.currentBinding(var10);
        try {
            module0015.$g533$.bind((SubLObject)module0660.T, var10);
            module0642.f39019(var9);
        }
        finally {
            module0015.$g533$.rebind(var12, var10);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40142() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39046(module0015.$g348$.getGlobalValue());
        module0642.f39046(module0015.$g349$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39020((SubLObject)module0660.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39020((SubLObject)module0660.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39020((SubLObject)module0660.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
        final SubLObject var3 = module0015.$g533$.currentBinding(var2);
        try {
            module0015.$g533$.bind((SubLObject)module0660.T, var2);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
            final SubLObject var4_12 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)module0660.T, var2);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0660.$ic39$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0660.$ic20$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_13 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    final SubLObject var4 = module0656.f39832((SubLObject)module0660.$ic20$);
                    module0642.f39020(module0015.$g381$.getGlobalValue());
                    module0642.f39020(module0015.$g383$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0655.f39768();
                    module0642.f39019((SubLObject)module0660.$ic21$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    if (module0660.NIL != var4) {
                        module0642.f39020(module0015.$g387$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                        module0642.f39020(var4);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                    final SubLObject var4_14 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0660.T, var2);
                        final SubLObject var5 = module0014.f697((SubLObject)module0660.$ic31$);
                        final SubLObject var6 = (SubLObject)module0660.$ic20$;
                        final SubLObject var7 = module0014.f694((SubLObject)module0660.$ic31$);
                        final SubLObject var8 = (SubLObject)module0660.ZERO_INTEGER;
                        module0642.f39020(module0015.$g431$.getGlobalValue());
                        module0642.f39020(module0015.$g440$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                        module0642.f39020(var5);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                        if (module0660.NIL != var7) {
                            module0642.f39020(module0015.$g437$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                            module0642.f39020(var7);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                        }
                        if (module0660.NIL != var6) {
                            module0642.f39020(module0015.$g438$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                            module0642.f39020(module0642.f39049(var6));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                        }
                        if (module0660.NIL != var8) {
                            module0642.f39020(module0015.$g439$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                            module0642.f39020(var8);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                        final SubLObject var4_15 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)module0660.T, var2);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_15, var2);
                        }
                        module0642.f39020(module0015.$g432$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var4_14, var2);
                    }
                    module0642.f39020(module0015.$g382$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_13, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_16 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    module0642.f39027((SubLObject)module0660.$ic40$, (SubLObject)module0660.TWO_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var4_16, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0660.$ic39$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0660.$ic20$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_17 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    f40144();
                }
                finally {
                    module0015.$g533$.rebind(var4_17, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_18 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    module0642.f39027((SubLObject)module0660.$ic40$, (SubLObject)module0660.TWO_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var4_18, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                final SubLObject var9 = (SubLObject)module0660.$ic39$;
                module0642.f39020(module0015.$g360$.getGlobalValue());
                if (module0660.NIL != var9) {
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0642.f39049(var9));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                }
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0660.$ic20$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0015.$g375$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020((SubLObject)module0660.$ic41$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_19 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    f40145();
                }
                finally {
                    module0015.$g533$.rebind(var4_19, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_20 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    module0642.f39027((SubLObject)module0660.$ic40$, (SubLObject)module0660.TWO_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var4_20, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0660.$ic39$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0660.$ic20$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_21 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39019((SubLObject)module0660.$ic42$);
                    module0656.f39804(module0574.f35152(), (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39032((SubLObject)module0660.UNPROVIDED);
                    module0656.f39837((SubLObject)module0660.$ic43$, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39026((SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39019((SubLObject)module0660.$ic44$);
                    module0642.f39019(Environment.get_machine_name((SubLObject)module0660.$ic45$));
                    module0642.f39019((SubLObject)module0660.$ic46$);
                    module0642.f39019(module0110.$g1378$.getDynamicValue(var2));
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                    module0642.f39026((SubLObject)module0660.UNPROVIDED);
                    if (module0660.NIL != module0678.$g5201$.getDynamicValue(var2)) {
                        final SubLObject var10 = Sequences.length(module0678.$g5201$.getDynamicValue(var2));
                        final SubLObject var11 = var10.numG(module0660.$g5202$.getGlobalValue()) ? Sequences.cconcatenate(module0038.f2629(module0660.$g5202$.getGlobalValue(), module0678.$g5201$.getDynamicValue(var2)), (SubLObject)module0660.$ic47$) : module0678.$g5201$.getDynamicValue(var2);
                        module0642.f39020(module0015.$g459$.getGlobalValue());
                        module0642.f39019((SubLObject)module0660.$ic48$);
                        module0642.f39019(var11);
                        module0642.f39020(module0015.$g460$.getGlobalValue());
                    }
                    module0656.f39837((SubLObject)module0660.$ic10$, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39032((SubLObject)module0660.UNPROVIDED);
                    module0656.f39837((SubLObject)module0660.$ic49$, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var4_21, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_12, var2);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0660.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var3, var2);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40146() {
        module0656.f39837((SubLObject)module0660.$ic6$, (SubLObject)module0660.$ic28$, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
        module0642.f39032((SubLObject)module0660.TWO_INTEGER);
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40145() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = f40147();
        var3 = module0035.remove_if_not((SubLObject)module0660.$ic52$, var3, (SubLObject)module0660.$ic53$, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
        var3 = module0035.remove_if_not((SubLObject)module0660.$ic54$, var3, (SubLObject)module0660.$ic55$, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
        var3 = Sort.sort(var3, (SubLObject)module0660.$ic56$, (SubLObject)module0660.$ic55$);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39020((SubLObject)module0660.FIVE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39020((SubLObject)module0660.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
        final SubLObject var4 = module0015.$g533$.currentBinding(var2);
        try {
            module0015.$g533$.bind((SubLObject)module0660.T, var2);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
            final SubLObject var4_30 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)module0660.T, var2);
                SubLObject var5 = var3;
                SubLObject var6 = (SubLObject)module0660.NIL;
                var6 = var5.first();
                while (module0660.NIL != var5) {
                    if (module0656.f39838(var6).isFunctionSpec()) {
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0660.$ic57$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0660.$ic20$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                        final SubLObject var4_31 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)module0660.T, var2);
                            module0656.f39837(var6, module0656.f39822(var6), (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_31, var2);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    var5 = var5.rest();
                    var6 = var5.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var4_30, var2);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0660.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var4, var2);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40147() {
        return module0660.$g5203$.getGlobalValue();
    }
    
    public static SubLObject f40144() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = (SubLObject)module0660.$ic61$;
        final SubLObject var4 = module0656.f39832((SubLObject)module0660.$ic7$);
        module0642.f39020(module0015.$g282$.getGlobalValue());
        module0642.f39020(module0015.$g284$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39020(module0110.$g570$.getDynamicValue(var2));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        if (module0660.NIL != module0015.$g289$.getGlobalValue()) {
            module0642.f39020(module0015.$g285$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            module0642.f39020(module0015.$g289$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        }
        if (module0660.NIL != var4) {
            module0642.f39020(module0015.$g286$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            module0642.f39020(var4);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var2);
        final SubLObject var6 = module0015.$g541$.currentBinding(var2);
        final SubLObject var7 = module0015.$g539$.currentBinding(var2);
        try {
            module0015.$g533$.bind((SubLObject)module0660.T, var2);
            module0015.$g541$.bind((SubLObject)module0660.T, var2);
            module0015.$g539$.bind(module0015.f797(), var2);
            module0642.f39069((SubLObject)module0660.$ic62$, (SubLObject)module0660.NIL, (SubLObject)module0660.UNPROVIDED);
            module0642.f39069((SubLObject)module0660.$ic63$, (SubLObject)module0660.$ic64$, (SubLObject)module0660.UNPROVIDED);
            module0642.f39069((SubLObject)module0660.$ic65$, (SubLObject)module0660.T, (SubLObject)module0660.UNPROVIDED);
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39020(module0015.$g353$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            module0642.f39020((SubLObject)module0660.ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            module0642.f39020(module0015.$g354$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            module0642.f39020((SubLObject)module0660.ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
            final SubLObject var4_38 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)module0660.T, var2);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_39 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0660.$ic20$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                    final SubLObject var4_40 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0660.T, var2);
                        module0642.f39020(module0015.$g459$.getGlobalValue());
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                        final SubLObject var4_41 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)module0660.T, var2);
                            module0642.f39020(module0015.$g144$.getGlobalValue());
                            module0642.f39020(module0015.$g157$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                            module0642.f39020((SubLObject)module0660.$ic66$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                            module0642.f39020(module0015.$g158$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                            module0642.f39020((SubLObject)module0660.$ic67$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                            final SubLObject var4_42 = module0015.$g533$.currentBinding(var2);
                            try {
                                module0015.$g533$.bind((SubLObject)module0660.T, var2);
                                module0644.f39192((SubLObject)module0660.$ic68$, (SubLObject)module0660.$ic16$, var3, (SubLObject)module0660.NIL, module0110.$g570$.getDynamicValue(var2), module0015.$g289$.getGlobalValue(), (SubLObject)module0660.UNPROVIDED);
                                module0642.f39020(module0015.$g144$.getGlobalValue());
                                module0642.f39020(module0015.$g157$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                                module0642.f39020((SubLObject)module0660.$ic69$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                                final SubLObject var4_43 = module0015.$g533$.currentBinding(var2);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_43, var2);
                                }
                                module0642.f39020(module0015.$g145$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_42, var2);
                            }
                            module0642.f39020(module0015.$g145$.getGlobalValue());
                            if (module0660.NIL != module0660.$g5206$.getDynamicValue(var2)) {
                                module0666.f40486((SubLObject)module0660.$ic70$, (SubLObject)module0660.$ic69$, (SubLObject)module0660.$ic71$, (SubLObject)module0660.THREE_INTEGER, (SubLObject)module0660.T, module0660.$ic72$);
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var4_41, var2);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        module0642.f39020(module0015.$g460$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var4_40, var2);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0660.$ic20$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                    final SubLObject var4_44 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0660.T, var2);
                        module0644.f39190((SubLObject)module0660.$ic73$, (SubLObject)module0660.$ic16$, (SubLObject)module0660.NIL, module0110.$g570$.getDynamicValue(var2), module0015.$g289$.getGlobalValue(), (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_44, var2);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_39, var2);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_45 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                    final SubLObject var4_46 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0660.T, var2);
                        module0642.f39020(module0015.$g459$.getGlobalValue());
                        module0642.f39027((SubLObject)module0660.$ic40$, (SubLObject)module0660.UNPROVIDED);
                        module0642.f39020(module0015.$g460$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var4_46, var2);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0660.$ic74$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                    final SubLObject var4_47 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0660.T, var2);
                        module0644.f39184((SubLObject)module0660.$ic68$, (SubLObject)module0660.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_47, var2);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_45, var2);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0660.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var4_38, var2);
            }
            module0642.f39020(module0015.$g347$.getGlobalValue());
            module0015.f799(module0015.$g539$.getDynamicValue(var2));
        }
        finally {
            module0015.$g539$.rebind(var7, var2);
            module0015.$g541$.rebind(var6, var2);
            module0015.$g533$.rebind(var5, var2);
        }
        module0642.f39020(module0015.$g283$.getGlobalValue());
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40148(final SubLObject var48, final SubLObject var49) {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        final SubLObject var51 = module0656.f39832((SubLObject)module0660.$ic75$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var50), (SubLObject)module0660.$ic76$, module0589.f35898(var48, (SubLObject)module0660.UNPROVIDED));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        if (module0660.NIL != var51) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            module0642.f39020(var51);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
        final SubLObject var52 = module0015.$g533$.currentBinding(var50);
        try {
            module0015.$g533$.bind((SubLObject)module0660.T, var50);
            PrintLow.format(module0015.$g131$.getDynamicValue(var50), (SubLObject)module0660.$ic77$, var49);
        }
        finally {
            module0015.$g533$.rebind(var52, var50);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var48;
    }
    
    public static SubLObject f40149(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = module0642.f39104((SubLObject)module0660.$ic68$, var1);
        SubLObject var4 = (SubLObject)module0660.NIL;
        SubLObject var5 = (SubLObject)module0660.NIL;
        final SubLObject var6 = (SubLObject)module0660.NIL;
        SubLObject var7 = (SubLObject)module0660.NIL;
        final SubLObject var8 = module0642.f39104((SubLObject)module0660.$ic80$, var1);
        final SubLObject var9 = (SubLObject)(var8.isString() ? reader.read_from_string_ignoring_errors(var8, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED) : module0660.$ic81$);
        final SubLObject var10 = (SubLObject)((module0660.NIL != module0642.f39104((SubLObject)module0660.$ic82$, var1)) ? module0660.T : module0660.NIL);
        final SubLObject var11 = module0642.f39104((SubLObject)module0660.$ic83$, var1);
        final SubLObject var12 = module0642.f39104((SubLObject)module0660.$ic84$, var1);
        final SubLObject var13 = (SubLObject)((module0660.NIL != var12) ? module0660.NIL : module0660.$ic85$);
        final SubLObject var14 = (SubLObject)module0660.T;
        if (module0660.NIL != var10 && module0660.NIL == module0655.$g5120$.getDynamicValue(var2)) {
            module0655.$g5120$.setDynamicValue((SubLObject)module0660.T, var2);
        }
        else if (module0660.NIL == var10 && module0660.NIL != module0655.$g5120$.getDynamicValue(var2)) {
            module0655.$g5120$.setDynamicValue((SubLObject)module0660.NIL, var2);
        }
        module0655.$g5119$.setDynamicValue(var9, var2);
        if (module0660.NIL != var3) {
            var3 = module0038.f2823(var3);
            var2.resetMultipleValues();
            final SubLObject var15 = f40150(var3, var14, (SubLObject)module0660.T);
            final SubLObject var16 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            if (module0660.NIL == module0035.f1997(var15) && (module0660.NIL == f40151(var3) || module0660.NIL != f40152(var3))) {
                var2.resetMultipleValues();
                final SubLObject var64_65 = f40153(var3, var15, var13);
                final SubLObject var66_67 = var2.secondMultipleValue();
                var2.resetMultipleValues();
                var4 = var64_65;
                var5 = var66_67;
                var7 = (SubLObject)module0660.T;
            }
            if (module0660.NIL == var15 && module0660.NIL == var4 && module0660.NIL == var6) {
                if (var3.isString() && module0660.NIL == module0035.find_if_not(Symbols.symbol_function((SubLObject)module0660.$ic86$), var3, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED)) {
                    if (Sequences.length(var3).numG((SubLObject)module0660.ZERO_INTEGER)) {
                        module0669.f40867((SubLObject)ConsesLow.list(var3));
                    }
                    else {
                        module0669.f40872((SubLObject)module0660.UNPROVIDED);
                    }
                }
                else if (module0660.NIL != var16) {
                    module0656.f39789(var16, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
                }
                else {
                    module0656.f39789((SubLObject)module0660.$ic87$, var3, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
                }
            }
            else if (module0660.NIL != module0035.f1997(var15) && module0660.NIL == var4) {
                if (module0660.NIL != assertion_handles_oc.f11035(var15.first())) {
                    module0671.f40976(var15.first());
                }
                else if (module0660.NIL != oc_deduction_handles.f11659(var15.first())) {
                    module0671.f41005(var15.first());
                }
                else {
                    f40154(module0656.f39932(var15.first()));
                }
            }
            else if (module0660.NIL == var15 && module0660.NIL != module0035.f1997(var4)) {
                if (module0660.NIL != assertion_handles_oc.f11035(var4.first())) {
                    module0671.f40976(var4.first());
                }
                else if (module0660.NIL != oc_deduction_handles.f11659(var15.first())) {
                    module0671.f41005(var4.first());
                }
                else {
                    f40154(module0656.f39932(var4.first()));
                }
            }
            else if (var15.isCons() || var4.isCons() || var6.isCons()) {
                f40155(var3, var15, var4, var6, var9, var5);
            }
            else if (module0660.NIL != var16) {
                module0656.f39789(var16, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
            }
            else {
                module0656.f39789((SubLObject)module0660.$ic87$, var3, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
            }
        }
        else {
            module0656.f39789((SubLObject)module0660.$ic88$, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
        }
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40155(final SubLObject var50, final SubLObject var68, final SubLObject var69, final SubLObject var53, SubLObject var56, SubLObject var70) {
        if (var56 == module0660.UNPROVIDED) {
            var56 = (SubLObject)module0660.NIL;
        }
        if (var70 == module0660.UNPROVIDED) {
            var70 = (SubLObject)module0660.NIL;
        }
        final SubLThread var71 = SubLProcess.currentSubLThread();
        var71.resetMultipleValues();
        final SubLObject var72 = module0035.f2092(var68, Symbols.symbol_function((SubLObject)module0660.$ic90$));
        final SubLObject var73 = var71.secondMultipleValue();
        var71.resetMultipleValues();
        final SubLObject var74 = (module0660.NIL != f40152(var50)) ? Sequences.cconcatenate((SubLObject)module0660.$ic91$, new SubLObject[] { module0038.f2674(var50, (SubLObject)module0660.$ic92$, (SubLObject)module0660.UNPROVIDED), module0660.$ic93$ }) : Sequences.cconcatenate((SubLObject)module0660.$ic94$, new SubLObject[] { var50, module0660.$ic93$ });
        final SubLObject var75 = (SubLObject)((module0660.NIL != var73) ? ((module0660.NIL != module0035.f1997(var73)) ? module0660.$ic95$ : module0660.$ic96$) : ((module0660.NIL != f40152(var50)) ? ((module0660.NIL != var53) ? module0660.$ic97$ : module0660.$ic98$) : module0660.$ic99$));
        final SubLObject var76 = (SubLObject)((module0660.NIL != var73) ? module0660.$ic100$ : module0660.$ic101$);
        module0642.f39020((SubLObject)module0660.$ic0$);
        module0642.f39029((SubLObject)module0660.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0642.f39029((SubLObject)module0660.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019(var74);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0660.UNPROVIDED);
        final SubLObject var77 = module0015.$g132$.getDynamicValue(var71);
        final SubLObject var78 = module0015.$g535$.currentBinding(var71);
        try {
            module0015.$g535$.bind((SubLObject)module0660.T, var71);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (module0660.NIL != var77) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0642.f39042(var77));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
            final SubLObject var4_76 = module0015.$g533$.currentBinding(var71);
            try {
                module0015.$g533$.bind((SubLObject)module0660.T, var71);
                module0642.f39020(module0015.$g189$.getGlobalValue());
                module0642.f39020((SubLObject)module0660.TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                module0642.f39019(var74);
                module0642.f39020(module0015.$g190$.getGlobalValue());
                module0642.f39020((SubLObject)module0660.TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var71), module0655.$g5142$.getDynamicValue(var71));
                final SubLObject var79 = module0014.f672((SubLObject)module0660.$ic1$);
                module0642.f39029((SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020((SubLObject)module0660.$ic2$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                if (module0660.NIL != var79) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(var79);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020((SubLObject)module0660.$ic3$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_77 = module0015.$g535$.currentBinding(var71);
                try {
                    module0015.$g535$.bind((SubLObject)module0660.T, var71);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                    final SubLObject var4_78 = module0015.$g533$.currentBinding(var71);
                    try {
                        module0015.$g533$.bind((SubLObject)module0660.T, var71);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var71));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                        final SubLObject var4_79 = module0015.$g533$.currentBinding(var71);
                        final SubLObject var80 = module0015.$g541$.currentBinding(var71);
                        final SubLObject var81 = module0015.$g539$.currentBinding(var71);
                        try {
                            module0015.$g533$.bind((SubLObject)module0660.T, var71);
                            module0015.$g541$.bind((SubLObject)module0660.T, var71);
                            module0015.$g539$.bind(module0015.f797(), var71);
                            if (module0660.NIL != f40152(var50)) {
                                module0642.f39020(module0015.$g189$.getGlobalValue());
                                module0642.f39020((SubLObject)module0660.FOUR_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                                PrintLow.format(module0015.$g131$.getDynamicValue(var71), var75, Sequences.length(var53));
                                module0642.f39020(module0015.$g190$.getGlobalValue());
                                module0642.f39020((SubLObject)module0660.FOUR_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                            }
                            else {
                                module0642.f39020(module0015.$g189$.getGlobalValue());
                                module0642.f39020((SubLObject)module0660.FOUR_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                                PrintLow.format(module0015.$g131$.getDynamicValue(var71), var75, Sequences.length(var73));
                                module0642.f39020(module0015.$g190$.getGlobalValue());
                                module0642.f39020((SubLObject)module0660.FOUR_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                            }
                            final SubLObject var4_80 = module0580.$g4361$.currentBinding(var71);
                            try {
                                module0580.$g4361$.bind((SubLObject)module0660.NIL, var71);
                                var71.resetMultipleValues();
                                final SubLObject var4_81 = module0580.$g4362$.currentBinding(var71);
                                try {
                                    module0580.$g4362$.bind(module0580.f35560(), var71);
                                    final SubLObject var82 = var71.secondMultipleValue();
                                    var71.resetMultipleValues();
                                    try {
                                        var71.resetMultipleValues();
                                        final SubLObject var4_82 = module0580.$g4358$.currentBinding(var71);
                                        try {
                                            module0580.$g4358$.bind(module0580.f35544(), var71);
                                            final SubLObject var83 = var71.secondMultipleValue();
                                            var71.resetMultipleValues();
                                            final SubLObject var4_83 = module0580.$g4359$.currentBinding(var71);
                                            try {
                                                module0580.$g4359$.bind(module0580.f35545(), var71);
                                                final SubLObject var84 = module0580.$g4358$.getDynamicValue(var71);
                                                final SubLObject var4_84 = module0034.$g879$.currentBinding(var71);
                                                try {
                                                    module0034.$g879$.bind(var84, var71);
                                                    SubLObject var85 = (SubLObject)module0660.NIL;
                                                    if (module0660.NIL != var84 && module0660.NIL == module0034.f1842(var84)) {
                                                        var85 = module0034.f1869(var84);
                                                        final SubLObject var86 = Threads.current_process();
                                                        if (module0660.NIL == var85) {
                                                            module0034.f1873(var84, var86);
                                                        }
                                                        else if (!var85.eql(var86)) {
                                                            Errors.error((SubLObject)module0660.$ic102$);
                                                        }
                                                    }
                                                    try {
                                                        final SubLObject var4_85 = module0579.$g4260$.currentBinding(var71);
                                                        final SubLObject var36_91 = module0579.$g4259$.currentBinding(var71);
                                                        try {
                                                            module0579.$g4260$.bind(module0677.f41312(), var71);
                                                            module0579.$g4259$.bind((SubLObject)module0660.$ic103$, var71);
                                                            f40156(var73, var56);
                                                        }
                                                        finally {
                                                            module0579.$g4259$.rebind(var36_91, var71);
                                                            module0579.$g4260$.rebind(var4_85, var71);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject var4_86 = Threads.$is_thread_performing_cleanupP$.currentBinding(var71);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0660.T, var71);
                                                            if (module0660.NIL != var84 && module0660.NIL == var85) {
                                                                module0034.f1873(var84, (SubLObject)module0660.NIL);
                                                            }
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(var4_86, var71);
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0034.$g879$.rebind(var4_84, var71);
                                                }
                                            }
                                            finally {
                                                module0580.$g4359$.rebind(var4_83, var71);
                                            }
                                            if (var83 == module0660.$ic104$ && module0660.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var71))) {
                                                module0034.f1891(module0580.$g4358$.getDynamicValue(var71));
                                            }
                                        }
                                        finally {
                                            module0580.$g4358$.rebind(var4_82, var71);
                                        }
                                    }
                                    finally {
                                        final SubLObject var4_87 = Threads.$is_thread_performing_cleanupP$.currentBinding(var71);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0660.T, var71);
                                            if (module0660.NIL == var82) {
                                                module0580.f35554(module0580.$g4362$.getDynamicValue(var71));
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var4_87, var71);
                                        }
                                    }
                                }
                                finally {
                                    module0580.$g4362$.rebind(var4_81, var71);
                                }
                            }
                            finally {
                                module0580.$g4361$.rebind(var4_80, var71);
                            }
                            if (module0660.NIL != var69 || module0660.NIL != var72) {
                                module0642.f39020(module0015.$g189$.getGlobalValue());
                                module0642.f39020((SubLObject)module0660.FOUR_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                                module0642.f39019(var76);
                                if (module0660.NIL != var70) {
                                    module0642.f39020(module0015.$g149$.getGlobalValue());
                                    module0642.f39020(module0015.$g152$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                                    module0642.f39020(module0015.$g250$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                                    final SubLObject var4_88 = module0015.$g533$.currentBinding(var71);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0660.T, var71);
                                        PrintLow.format(module0015.$g131$.getDynamicValue(var71), (SubLObject)module0660.$ic105$, Sequences.length(var69));
                                        module0656.f39837((SubLObject)module0660.$ic78$, var50, var70, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
                                        module0642.f39019((SubLObject)module0660.$ic15$);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_88, var71);
                                    }
                                    module0642.f39020(module0015.$g150$.getGlobalValue());
                                }
                                module0642.f39020(module0015.$g190$.getGlobalValue());
                                module0642.f39020((SubLObject)module0660.FOUR_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                            }
                            f40156(Sequences.cconcatenate(var72, var69), var56);
                            if (module0660.NIL != var53) {
                                module0642.f39026((SubLObject)module0660.UNPROVIDED);
                                f40157(var53);
                            }
                            module0015.f799(module0015.$g539$.getDynamicValue(var71));
                        }
                        finally {
                            module0015.$g539$.rebind(var81, var71);
                            module0015.$g541$.rebind(var80, var71);
                            module0015.$g533$.rebind(var4_79, var71);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)module0660.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_78, var71);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)module0660.UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var4_77, var71);
                }
                module0642.f39029((SubLObject)module0660.UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var4_76, var71);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0660.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var78, var71);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0660.UNPROVIDED);
        return var50;
    }
    
    public static SubLObject f40157(final SubLObject var53) {
        assert module0660.NIL != module0035.f2015(var53) : var53;
        SubLObject var54 = var53;
        SubLObject var55 = (SubLObject)module0660.NIL;
        var55 = var54.first();
        while (module0660.NIL != var54) {
            assert module0660.NIL != module0172.f10917(var55) : var55;
            var54 = var54.rest();
            var55 = var54.first();
        }
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40156(final SubLObject var62, SubLObject var56) {
        if (var56 == module0660.UNPROVIDED) {
            var56 = (SubLObject)module0660.NIL;
        }
        final SubLObject var63 = module0035.f2110(Symbols.symbol_function((SubLObject)module0660.$ic108$), var62, (SubLObject)module0660.UNPROVIDED);
        final SubLObject var64 = module0035.f2110(Symbols.symbol_function((SubLObject)module0660.$ic109$), var62, (SubLObject)module0660.UNPROVIDED);
        final SubLObject var65 = module0213.f13926(module0035.f2110(Symbols.symbol_function((SubLObject)module0660.$ic90$), var62, (SubLObject)module0660.UNPROVIDED), (SubLObject)module0660.NIL, (SubLObject)module0660.NIL, (SubLObject)module0660.T, (SubLObject)module0660.NIL, (SubLObject)module0660.$ic110$, (SubLObject)module0660.UNPROVIDED);
        final SubLObject var66 = module0035.f2218(module0035.f2218(module0035.f2218(var62, var63, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED), var64, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED), var65, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
        if (var56 == module0660.$ic81$) {
            f40158(var63, var64, var65, var66);
        }
        else {
            f40159(var63, var64, var65, var66, var56);
        }
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40159(final SubLObject var97, final SubLObject var98, final SubLObject var71, final SubLObject var99, final SubLObject var56) {
        if (module0660.NIL != var97) {
            module0642.f39020(module0015.$g224$.getGlobalValue());
            module0642.f39019((SubLObject)module0660.$ic111$);
            module0642.f39020(module0015.$g225$.getGlobalValue());
            module0642.f39051((SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
            SubLObject var100 = var97;
            SubLObject var101 = (SubLObject)module0660.NIL;
            var101 = var100.first();
            while (module0660.NIL != var100) {
                f40160(var101, var56);
                var100 = var100.rest();
                var101 = var100.first();
            }
        }
        if (module0660.NIL != var98) {
            if (module0660.NIL != var97) {
                module0642.f39026((SubLObject)module0660.TWO_INTEGER);
            }
            module0642.f39020(module0015.$g224$.getGlobalValue());
            module0642.f39019((SubLObject)module0660.$ic112$);
            module0642.f39020(module0015.$g225$.getGlobalValue());
            module0642.f39051((SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
            SubLObject var100 = var98;
            SubLObject var101 = (SubLObject)module0660.NIL;
            var101 = var100.first();
            while (module0660.NIL != var100) {
                f40160(var101, var56);
                var100 = var100.rest();
                var101 = var100.first();
            }
        }
        if (module0660.NIL != var99) {
            if (module0660.NIL != var97 || module0660.NIL != var98) {
                module0642.f39026((SubLObject)module0660.TWO_INTEGER);
            }
            module0642.f39020(module0015.$g224$.getGlobalValue());
            module0642.f39019((SubLObject)module0660.$ic113$);
            module0642.f39020(module0015.$g225$.getGlobalValue());
            module0642.f39051((SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
            SubLObject var100 = var99;
            SubLObject var101 = (SubLObject)module0660.NIL;
            var101 = var100.first();
            while (module0660.NIL != var100) {
                f40160(var101, var56);
                var100 = var100.rest();
                var101 = var100.first();
            }
        }
        if (module0660.NIL != var71) {
            if (module0660.NIL != var97 || module0660.NIL != var98 || module0660.NIL != var99) {
                module0642.f39026((SubLObject)module0660.TWO_INTEGER);
            }
            module0642.f39020(module0015.$g224$.getGlobalValue());
            module0642.f39019((SubLObject)module0660.$ic114$);
            module0642.f39020(module0015.$g225$.getGlobalValue());
            module0642.f39051((SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
            SubLObject var100 = var71;
            SubLObject var101 = (SubLObject)module0660.NIL;
            var101 = var100.first();
            while (module0660.NIL != var100) {
                f40160(var101, var56);
                var100 = var100.rest();
                var101 = var100.first();
            }
        }
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40158(final SubLObject var97, final SubLObject var98, final SubLObject var71, final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39020((SubLObject)module0660.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39020((SubLObject)module0660.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
        final SubLObject var101 = module0015.$g533$.currentBinding(var100);
        try {
            module0015.$g533$.bind((SubLObject)module0660.T, var100);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
            final SubLObject var4_101 = module0015.$g533$.currentBinding(var100);
            try {
                module0015.$g533$.bind((SubLObject)module0660.T, var100);
                if (module0660.NIL != var97) {
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0660.$ic20$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                    final SubLObject var4_102 = module0015.$g533$.currentBinding(var100);
                    try {
                        module0015.$g533$.bind((SubLObject)module0660.T, var100);
                        module0642.f39020(module0015.$g224$.getGlobalValue());
                        module0642.f39019((SubLObject)module0660.$ic111$);
                        module0642.f39020(module0015.$g225$.getGlobalValue());
                        module0642.f39051((SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
                        SubLObject var102 = var97;
                        SubLObject var103 = (SubLObject)module0660.NIL;
                        var103 = var102.first();
                        while (module0660.NIL != var102) {
                            f40160(var103, (SubLObject)module0660.UNPROVIDED);
                            var102 = var102.rest();
                            var103 = var102.first();
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var4_102, var100);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                    final SubLObject var4_103 = module0015.$g533$.currentBinding(var100);
                    try {
                        module0015.$g533$.bind((SubLObject)module0660.T, var100);
                        module0642.f39027((SubLObject)module0660.$ic40$, (SubLObject)module0660.FOUR_INTEGER);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_103, var100);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                if (module0660.NIL != var98) {
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0660.$ic20$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                    final SubLObject var4_104 = module0015.$g533$.currentBinding(var100);
                    try {
                        module0015.$g533$.bind((SubLObject)module0660.T, var100);
                        module0642.f39020(module0015.$g224$.getGlobalValue());
                        module0642.f39019((SubLObject)module0660.$ic112$);
                        module0642.f39020(module0015.$g225$.getGlobalValue());
                        module0642.f39051((SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
                        SubLObject var102 = var98;
                        SubLObject var103 = (SubLObject)module0660.NIL;
                        var103 = var102.first();
                        while (module0660.NIL != var102) {
                            f40160(var103, (SubLObject)module0660.UNPROVIDED);
                            var102 = var102.rest();
                            var103 = var102.first();
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var4_104, var100);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                    final SubLObject var4_105 = module0015.$g533$.currentBinding(var100);
                    try {
                        module0015.$g533$.bind((SubLObject)module0660.T, var100);
                        module0642.f39027((SubLObject)module0660.$ic40$, (SubLObject)module0660.FOUR_INTEGER);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_105, var100);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                if (module0660.NIL != var99) {
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0660.$ic20$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                    final SubLObject var4_106 = module0015.$g533$.currentBinding(var100);
                    try {
                        module0015.$g533$.bind((SubLObject)module0660.T, var100);
                        module0642.f39020(module0015.$g224$.getGlobalValue());
                        module0642.f39019((SubLObject)module0660.$ic113$);
                        module0642.f39020(module0015.$g225$.getGlobalValue());
                        module0642.f39051((SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
                        SubLObject var102 = var99;
                        SubLObject var103 = (SubLObject)module0660.NIL;
                        var103 = var102.first();
                        while (module0660.NIL != var102) {
                            f40160(var103, (SubLObject)module0660.UNPROVIDED);
                            var102 = var102.rest();
                            var103 = var102.first();
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var4_106, var100);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
            }
            finally {
                module0015.$g533$.rebind(var4_101, var100);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0660.UNPROVIDED);
            if (module0660.NIL != var71) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_107 = module0015.$g533$.currentBinding(var100);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var100);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g371$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020((SubLObject)module0660.THREE_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0660.$ic20$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                    final SubLObject var4_108 = module0015.$g533$.currentBinding(var100);
                    try {
                        module0015.$g533$.bind((SubLObject)module0660.T, var100);
                        if (module0660.NIL != var97 || module0660.NIL != var98 || module0660.NIL != var99) {
                            module0642.f39026((SubLObject)module0660.TWO_INTEGER);
                        }
                        module0642.f39020(module0015.$g224$.getGlobalValue());
                        module0642.f39019((SubLObject)module0660.$ic114$);
                        module0642.f39020(module0015.$g225$.getGlobalValue());
                        module0642.f39051((SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
                        SubLObject var102 = var71;
                        SubLObject var103 = (SubLObject)module0660.NIL;
                        var103 = var102.first();
                        while (module0660.NIL != var102) {
                            f40160(var103, (SubLObject)module0660.UNPROVIDED);
                            var102 = var102.rest();
                            var103 = var102.first();
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var4_108, var100);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_107, var100);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0660.UNPROVIDED);
            }
        }
        finally {
            module0015.$g533$.rebind(var101, var100);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40160(final SubLObject var100, SubLObject var56) {
        if (var56 == module0660.UNPROVIDED) {
            var56 = (SubLObject)module0660.$ic81$;
        }
        final SubLThread var101 = SubLProcess.currentSubLThread();
        final SubLObject var102 = (SubLObject)((var56 == module0660.$ic81$) ? module0660.NIL : f40161(var100, var56));
        if (var56 == module0660.$ic81$) {
            module0656.f39804(var100, (SubLObject)module0660.NIL, (SubLObject)module0660.T);
            module0642.f39026((SubLObject)module0660.UNPROVIDED);
        }
        else {
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39020(module0015.$g353$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            module0642.f39020((SubLObject)module0660.ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            module0642.f39020(module0015.$g354$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            module0642.f39020((SubLObject)module0660.ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
            final SubLObject var103 = module0015.$g533$.currentBinding(var101);
            try {
                module0015.$g533$.bind((SubLObject)module0660.T, var101);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_110 = module0015.$g533$.currentBinding(var101);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var101);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0660.$ic20$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                    final SubLObject var4_111 = module0015.$g533$.currentBinding(var101);
                    try {
                        module0015.$g533$.bind((SubLObject)module0660.T, var101);
                        module0642.f39020(module0015.$g459$.getGlobalValue());
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0656.f39804(var100, (SubLObject)module0660.NIL, (SubLObject)module0660.T);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                        module0642.f39019((SubLObject)module0660.$ic115$);
                        module0642.f39020(module0015.$g460$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var4_111, var101);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    if (module0660.NIL != var102) {
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0660.$ic20$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                        final SubLObject var4_112 = module0015.$g533$.currentBinding(var101);
                        try {
                            module0015.$g533$.bind((SubLObject)module0660.T, var101);
                            module0642.f39020(var102);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_112, var101);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                }
                finally {
                    module0015.$g533$.rebind(var4_110, var101);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0660.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var103, var101);
            }
            module0642.f39020(module0015.$g347$.getGlobalValue());
        }
        return (SubLObject)module0660.T;
    }
    
    public static SubLObject f40161(final SubLObject var100, final SubLObject var56) {
        final SubLObject var101 = (SubLObject)module0660.$ic16$;
        return var101;
    }
    
    public static SubLObject f40151(final SubLObject var113) {
        assert module0660.NIL != Types.stringp(var113) : var113;
        if (module0660.NIL != module0038.f2684(var113, (SubLObject)module0660.$ic116$)) {
            return (SubLObject)module0660.T;
        }
        if (module0660.NIL != module0038.f2684(var113, (SubLObject)module0660.$ic117$)) {
            return (SubLObject)module0660.T;
        }
        if (module0660.NIL != module0038.f2684(var113, (SubLObject)module0660.$ic118$)) {
            return (SubLObject)module0660.T;
        }
        if (module0660.NIL != module0038.f2684(var113, (SubLObject)module0660.$ic119$)) {
            return (SubLObject)module0660.T;
        }
        if (module0660.NIL != f40152(var113)) {
            return (SubLObject)module0660.T;
        }
        if (module0660.NIL != module0038.f2694(var113)) {
            return (SubLObject)module0660.T;
        }
        if (module0660.NIL != module0038.f2684(var113, (SubLObject)module0660.$ic120$) && module0660.NIL != module0038.f2673(var113, (SubLObject)module0660.$ic93$, (SubLObject)module0660.UNPROVIDED)) {
            return (SubLObject)module0660.T;
        }
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40152(final SubLObject var113) {
        assert module0660.NIL != Types.stringp(var113) : var113;
        return module0038.f2684(var113, (SubLObject)module0660.$ic92$);
    }
    
    public static SubLObject f40150(SubLObject var113, SubLObject var61, SubLObject var114) {
        if (var61 == module0660.UNPROVIDED) {
            var61 = (SubLObject)module0660.T;
        }
        if (var114 == module0660.UNPROVIDED) {
            var114 = (SubLObject)module0660.NIL;
        }
        final SubLThread var115 = SubLProcess.currentSubLThread();
        assert module0660.NIL != Types.stringp(var113) : var113;
        var113 = module0039.f3040(var113);
        var113 = module0038.f2735(var113);
        var61 = module0035.sublisp_boolean(var61);
        if (Sequences.length(var113).numE((SubLObject)module0660.ZERO_INTEGER)) {
            return Values.values((SubLObject)module0660.NIL, (SubLObject)module0660.$ic121$);
        }
        if (module0660.NIL != module0038.f2684(var113, (SubLObject)module0660.$ic92$)) {
            return Values.values((SubLObject)module0660.NIL, (SubLObject)module0660.NIL);
        }
        if (module0660.NIL != module0655.$g5120$.getDynamicValue(var115) && module0660.NIL != module0126.f8389(var113)) {
            final SubLObject var116 = module0126.f8393(var113, Types.sublisp_null(var61), (SubLObject)module0660.T, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
            if (module0660.NIL != module0035.f1997(var116)) {
                return Values.values(var116, (SubLObject)module0660.NIL);
            }
        }
        if (module0660.NIL != module0038.f2694(var113)) {
            return Values.values(f40162(var113), (SubLObject)module0660.NIL);
        }
        final SubLObject var117 = f40163(var113);
        if (module0660.NIL != var117) {
            return Values.values(var117, (SubLObject)module0660.NIL);
        }
        if (module0660.NIL == module0038.f2684(var113, (SubLObject)module0660.$ic122$)) {
            SubLObject var118 = (SubLObject)module0660.NIL;
            try {
                var115.throwStack.push(module0660.$ic123$);
                final SubLObject var119 = Errors.$error_handler$.currentBinding(var115);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0660.$ic124$), var115);
                    try {
                        if (module0660.NIL != module0213.f13915(var113)) {
                            final SubLObject var120 = module0213.f13917(var113);
                            if (module0660.NIL != f40166(var120) && var113.equal(module0213.f13918(var120))) {
                                return Values.values((SubLObject)ConsesLow.list(var120), (SubLObject)module0660.NIL);
                            }
                        }
                    }
                    catch (Throwable var121) {
                        Errors.handleThrowable(var121, (SubLObject)module0660.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var119, var115);
                }
            }
            catch (Throwable var122) {
                var118 = Errors.handleThrowable(var122, (SubLObject)module0660.$ic123$);
            }
            finally {
                var115.throwStack.pop();
            }
            SubLObject var123 = (SubLObject)module0660.NIL;
            if (module0660.NIL != module0038.f2684(var113, (SubLObject)module0660.$ic126$) && module0660.NIL == module0038.f2673(var113, (SubLObject)module0660.$ic127$, (SubLObject)module0660.UNPROVIDED)) {
                if (module0660.NIL != module0038.f2673(var113, (SubLObject)module0660.$ic126$, (SubLObject)module0660.UNPROVIDED)) {
                    if (Sequences.length(var113).numLE((SubLObject)module0660.FOUR_INTEGER)) {
                        return Values.values((SubLObject)module0660.NIL, (SubLObject)module0660.$ic128$);
                    }
                    var123 = f40167(var113, var61);
                }
                else {
                    if (Sequences.length(var113).numLE((SubLObject)module0660.THREE_INTEGER)) {
                        return Values.values((SubLObject)module0660.NIL, (SubLObject)module0660.$ic129$);
                    }
                    var123 = f40168(var113, var61);
                }
            }
            else if (module0660.NIL != module0038.f2673(var113, (SubLObject)module0660.$ic126$, (SubLObject)module0660.UNPROVIDED) && module0660.NIL == module0038.f2673(var113, (SubLObject)module0660.$ic127$, (SubLObject)module0660.UNPROVIDED)) {
                if (Sequences.length(var113).numLE((SubLObject)module0660.TWO_INTEGER)) {
                    return Values.values((SubLObject)module0660.NIL, (SubLObject)module0660.$ic130$);
                }
                var123 = f40169(var113, var61);
            }
            else if (module0660.NIL != module0038.f2635(var113)) {
                final SubLObject var124 = module0038.f2627(var113);
                var123 = f40170(var124, (SubLObject)module0660.T);
                if (module0660.NIL != module0212.f13762(var124)) {
                    var123 = Sequences.cconcatenate(var123, f40171(var124));
                }
            }
            else {
                var123 = f40172(var113, var61);
            }
            var123 = conses_high.union(var123, module0791.f50540(var113, (SubLObject)module0660.UNPROVIDED), (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
            var123 = module0035.delete_if_not(Symbols.symbol_function((SubLObject)module0660.$ic131$), var123, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
            var123 = module0213.f13926(var123, (SubLObject)module0660.NIL, (SubLObject)module0660.NIL, (SubLObject)module0660.T, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
            return Values.values(var123, (SubLObject)module0660.NIL);
        }
        if (module0660.NIL != var114) {
            return Values.values(f40164(var113), (SubLObject)module0660.NIL);
        }
        return Values.values(f40165(var113), (SubLObject)module0660.NIL);
    }
    
    public static SubLObject f40153(final SubLObject var113, SubLObject var122, SubLObject var123) {
        if (var122 == module0660.UNPROVIDED) {
            var122 = (SubLObject)module0660.NIL;
        }
        if (var123 == module0660.UNPROVIDED) {
            var123 = (SubLObject)module0660.$ic85$;
        }
        final SubLThread var124 = SubLProcess.currentSubLThread();
        final SubLObject var125 = (SubLObject)((module0660.NIL != module0660.$g5207$.getDynamicValue(var124)) ? f40173(var113, var122, var123) : module0660.NIL);
        SubLObject var126 = Sequences.length(var125);
        SubLObject var127 = (SubLObject)module0660.NIL;
        SubLObject var128 = (SubLObject)module0660.NIL;
        SubLObject var129 = (SubLObject)module0660.NIL;
        try {
            var124.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var130 = Errors.$error_handler$.currentBinding(var124);
            try {
                Errors.$error_handler$.bind((SubLObject)module0660.$ic132$, var124);
                try {
                    var124.resetMultipleValues();
                    final SubLObject var128_129 = f40174(var113, Sequences.cconcatenate(var125, var122), var123);
                    final SubLObject var130_131 = var124.secondMultipleValue();
                    var124.resetMultipleValues();
                    var127 = var128_129;
                    var128 = var130_131;
                }
                catch (Throwable var131) {
                    Errors.handleThrowable(var131, (SubLObject)module0660.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var130, var124);
            }
        }
        catch (Throwable var132) {
            var129 = Errors.handleThrowable(var132, module0003.$g3$.getGlobalValue());
        }
        finally {
            var124.throwStack.pop();
        }
        if (module0660.NIL != var129) {
            Errors.warn((SubLObject)module0660.$ic133$, var129);
        }
        if (module0660.NIL != var128) {
            var126 = Numbers.add(var126, var128);
        }
        else {
            var126 = (SubLObject)module0660.NIL;
        }
        return Values.values(module0035.delete_if_not(Symbols.symbol_function((SubLObject)module0660.$ic131$), Sequences.delete_duplicates(Sequences.cconcatenate(var125, var127), (SubLObject)module0660.EQUAL, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED), (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED), var126);
    }
    
    public static SubLObject f40174(final SubLObject var113, final SubLObject var122, SubLObject var132) {
        if (var132 == module0660.UNPROVIDED) {
            var132 = (SubLObject)module0660.NIL;
        }
        final SubLObject var133 = (SubLObject)module0660.NIL;
        final SubLObject var134 = (SubLObject)module0660.NIL;
        return Values.values(conses_high.set_difference(var133, var122, (SubLObject)module0660.EQUAL, (SubLObject)module0660.UNPROVIDED), var134);
    }
    
    public static SubLObject f40173(final SubLObject var113, SubLObject var122, SubLObject var123) {
        if (var122 == module0660.UNPROVIDED) {
            var122 = (SubLObject)module0660.NIL;
        }
        if (var123 == module0660.UNPROVIDED) {
            var123 = (SubLObject)module0660.NIL;
        }
        SubLObject var124 = (SubLObject)module0660.NIL;
        SubLObject var125 = (SubLObject)module0660.NIL;
        var124 = Sequences.nreverse(var124);
        var125 = Sequences.length(var124);
        if (var123.isInteger() && module0660.NIL != module0035.f2002(var124, var123, (SubLObject)module0660.UNPROVIDED)) {
            var124 = module0035.f2124(var123, var124);
        }
        return Values.values(var124, var125);
    }
    
    public static SubLObject f40166(final SubLObject var100) {
        return module0035.sublisp_boolean(module0656.f39932(var100));
    }
    
    public static SubLObject f40165(final SubLObject var113) {
        final SubLObject var114 = module0553.f34183(var113);
        if (module0660.NIL != module0167.f10813(var114)) {
            return (SubLObject)ConsesLow.list(var114);
        }
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40164(final SubLObject var113) {
        final SubLObject var114 = module0553.f34183(var113);
        if (module0660.NIL != var114) {
            return (SubLObject)ConsesLow.list(var114);
        }
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40170(final SubLObject var113, SubLObject var133) {
        if (var133 == module0660.UNPROVIDED) {
            var133 = (SubLObject)module0660.NIL;
        }
        final SubLThread var134 = SubLProcess.currentSubLThread();
        if (module0660.NIL != module0018.f984() && var113.isString()) {
            SubLObject var135 = (SubLObject)module0660.NIL;
            final SubLObject var136 = module0660.$ic134$;
            final SubLObject var137 = (SubLObject)((module0660.NIL != constant_handles_oc.f8463(var136, (SubLObject)module0660.UNPROVIDED)) ? module0162.f10628(module0161.f10518((SubLObject)ConsesLow.list(var136, module0660.$ic135$))) : module0660.NIL);
            final SubLObject var138 = module0584.$g4396$.currentBinding(var134);
            try {
                module0584.$g4396$.bind((module0660.NIL != var137) ? var137 : module0584.$g4396$.getDynamicValue(var134), var134);
                var135 = module0731.f44799(var113, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
                if (module0660.NIL != var133) {
                    var135 = ConsesLow.append(var135, module0730.f44560(var113, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED));
                }
            }
            finally {
                module0584.$g4396$.rebind(var138, var134);
            }
            return var135;
        }
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40162(final SubLObject var113) {
        return module0126.f8393(var113, (SubLObject)module0660.T, (SubLObject)module0660.T, (SubLObject)module0660.TWO_INTEGER, (SubLObject)module0660.UNPROVIDED);
    }
    
    public static SubLObject f40163(SubLObject var113) {
        if (module0660.$ic136$.numE(Sequences.length(var113))) {
            var113 = Sequences.subseq(var113, (SubLObject)module0660.THREE_INTEGER, (SubLObject)module0660.$ic137$);
        }
        if (module0660.NIL != module0035.f1995(var113, (SubLObject)module0660.$ic138$, (SubLObject)module0660.UNPROVIDED) && module0660.NIL != Guids.guid_string_p(var113)) {
            final SubLObject var114 = Guids.string_to_guid(var113);
            if (module0660.NIL != var114) {
                return (SubLObject)ConsesLow.list(constants_high_oc.f10751(var114));
            }
        }
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40169(final SubLObject var113, SubLObject var61) {
        if (var61 == module0660.UNPROVIDED) {
            var61 = (SubLObject)module0660.NIL;
        }
        return module0126.f8393(Sequences.subseq(var113, (SubLObject)module0660.ZERO_INTEGER, Numbers.subtract(Sequences.length(var113), (SubLObject)module0660.ONE_INTEGER)), (SubLObject)SubLObjectFactory.makeBoolean(module0660.NIL == var61), (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
    }
    
    public static SubLObject f40167(final SubLObject var113, SubLObject var61) {
        if (var61 == module0660.UNPROVIDED) {
            var61 = (SubLObject)module0660.NIL;
        }
        return module0126.f8400(Sequences.subseq(var113, (SubLObject)module0660.ONE_INTEGER, Numbers.subtract(Sequences.length(var113), (SubLObject)module0660.ONE_INTEGER)), (SubLObject)SubLObjectFactory.makeBoolean(module0660.NIL == var61), (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
    }
    
    public static SubLObject f40168(final SubLObject var113, SubLObject var61) {
        if (var61 == module0660.UNPROVIDED) {
            var61 = (SubLObject)module0660.NIL;
        }
        return module0126.f8401(Sequences.subseq(var113, (SubLObject)module0660.ONE_INTEGER, Sequences.length(var113)), (SubLObject)SubLObjectFactory.makeBoolean(module0660.NIL == var61), (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
    }
    
    public static SubLObject f40172(final SubLObject var113, SubLObject var138) {
        if (var138 == module0660.UNPROVIDED) {
            var138 = (SubLObject)module0660.T;
        }
        final SubLObject var139 = module0126.f8393(var113, (SubLObject)module0660.NIL, (SubLObject)module0660.T, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
        final SubLObject var140 = module0543.f33693(var113);
        SubLObject var141 = (SubLObject)module0660.NIL;
        SubLObject var142 = (SubLObject)module0660.NIL;
        var141 = f40170(var113, (SubLObject)module0660.UNPROVIDED);
        var142 = Sequences.delete_duplicates(ConsesLow.append(var139, var141, var140), (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
        if (module0660.NIL != module0212.f13762(var113)) {
            var142 = Sequences.cconcatenate(var142, f40171(var113));
        }
        return var142;
    }
    
    public static SubLObject f40171(final SubLObject var113) {
        return module0219.f14508(var113, (SubLObject)module0660.T);
    }
    
    public static SubLObject f40175(final SubLObject var143, SubLObject var144) {
        if (var144 == module0660.UNPROVIDED) {
            var144 = (SubLObject)module0660.NIL;
        }
        final SubLObject var145 = (SubLObject)((module0660.NIL != var144) ? module0660.NIL : module0660.$ic139$);
        final SubLObject var146 = (SubLObject)module0660.NIL;
        return var146;
    }
    
    public static SubLObject f40176(SubLObject var1) {
        if (var1 == module0660.UNPROVIDED) {
            var1 = (SubLObject)module0660.NIL;
        }
        if (var1.isCons()) {
            SubLObject var3;
            final SubLObject var2 = var3 = var1;
            SubLObject var4 = (SubLObject)module0660.NIL;
            SubLObject var5 = (SubLObject)module0660.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var3, var2, (SubLObject)module0660.$ic140$);
            var4 = var3.first();
            var3 = (var5 = var3.rest());
            if (var4.isString()) {
                var4 = Strings.string_upcase(var4, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var6 = Packages.find_symbol(var4, (SubLObject)module0660.UNPROVIDED);
                if (var6.isSymbol() && module0660.NIL != Symbols.fboundp(var6) && module0660.NIL != module0015.f874(var6)) {
                    return Functions.funcall(var6, var5);
                }
            }
        }
        module0677.f41328();
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40177(SubLObject var1) {
        if (var1 == module0660.UNPROVIDED) {
            var1 = (SubLObject)module0660.NIL;
        }
        return f40154(var1.first());
    }
    
    public static SubLObject f40178(SubLObject var1) {
        if (var1 == module0660.UNPROVIDED) {
            var1 = (SubLObject)module0660.NIL;
        }
        return f40154(var1.first());
    }
    
    public static SubLObject f40179(SubLObject var1) {
        if (var1 == module0660.UNPROVIDED) {
            var1 = (SubLObject)module0660.NIL;
        }
        return f40154(var1.first());
    }
    
    public static SubLObject f40180(SubLObject var1) {
        if (var1 == module0660.UNPROVIDED) {
            var1 = (SubLObject)module0660.NIL;
        }
        return f40154(var1.first());
    }
    
    public static SubLObject f40181(SubLObject var1) {
        if (var1 == module0660.UNPROVIDED) {
            var1 = (SubLObject)module0660.NIL;
        }
        return f40154(var1.first());
    }
    
    public static SubLObject f40154(final SubLObject var151) {
        final SubLThread var152 = SubLProcess.currentSubLThread();
        final SubLObject var153 = module0656.f39957(var151, (SubLObject)module0660.UNPROVIDED);
        if (module0660.NIL != var153) {
            if (module0660.NIL != module0167.f10813(var153)) {
                module0677.f41360(var153);
            }
            else if (module0660.NIL != module0210.f13595(var153, (SubLObject)module0660.UNPROVIDED)) {
                if (module0660.NIL == module0167.f10813(module0172.f10921(var153))) {
                    module0677.f41360(var153);
                }
            }
            else {
                module0658.f40054(var153);
                module0677.f41359(var153);
            }
            final SubLObject var154 = module0656.f39932(var153);
            module0642.f39020((SubLObject)module0660.$ic0$);
            module0642.f39029((SubLObject)module0660.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0589.f35880();
            if (module0660.NIL != module0015.f713()) {
                Errors.error((SubLObject)module0660.$ic4$);
            }
            module0642.f39020(module0015.$g415$.getGlobalValue());
            module0642.f39020(module0015.$g417$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            module0642.f39020((SubLObject)module0660.$ic147$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
            final SubLObject var155 = module0015.$g533$.currentBinding(var152);
            try {
                module0015.$g533$.bind((SubLObject)module0660.T, var152);
                module0656.f39836((SubLObject)module0660.$ic148$, var154, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
                module0656.f39836((SubLObject)module0660.$ic149$, var154, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var155, var152);
            }
            module0642.f39020(module0015.$g416$.getGlobalValue());
            module0642.f39029((SubLObject)module0660.UNPROVIDED);
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0660.UNPROVIDED);
        }
        else {
            module0656.f39789((SubLObject)module0660.$ic150$, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
        }
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40182(SubLObject var1) {
        if (var1 == module0660.UNPROVIDED) {
            var1 = (SubLObject)module0660.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0656.f39969(var1);
        if (module0660.$ic153$ == module0660.$g5208$.getDynamicValue(var2) && module0660.NIL != module0212.f13762(var3)) {
            module0669.f40606(var3);
        }
        else if (module0660.$ic151$ == module0660.$g5208$.getDynamicValue(var2) && module0660.NIL != module0212.f13762(var3)) {
            module0670.f40910(var3);
        }
        else if (module0660.NIL != var3) {
            module0669.f40606(var3);
        }
        else {
            final SubLObject var4 = module0656.f39950(var1.first(), (SubLObject)module0660.UNPROVIDED);
            module0642.f39020((SubLObject)module0660.$ic0$);
            module0642.f39029((SubLObject)module0660.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            final SubLObject var5 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)module0660.T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_155 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    module0663.f40325(var4);
                    module0642.f39029((SubLObject)module0660.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var4_155, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0660.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var5, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0660.UNPROVIDED);
        }
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40183() {
        module0642.f39019((SubLObject)module0660.$ic155$);
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40184(SubLObject var1) {
        if (var1 == module0660.UNPROVIDED) {
            var1 = (SubLObject)module0660.NIL;
        }
        final SubLObject var2 = module0656.f39969(var1);
        if (module0660.NIL != module0173.f10955(var2) || module0660.NIL != module0223.f14667(var2)) {
            f40185(var2);
        }
        else {
            final SubLObject var3 = module0656.f39950(var1.first(), (SubLObject)module0660.UNPROVIDED);
            f40185(var3);
        }
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40185(final SubLObject var100) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        if (module0660.NIL != module0210.f13595(var100, (SubLObject)module0660.UNPROVIDED)) {
            return module0663.f40328(var100);
        }
        if (module0660.$ic157$ == module0655.$g5079$.getDynamicValue(var101)) {
            return module0742.f45920(var100, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
        }
        final SubLObject var102 = module0655.$g5079$.getDynamicValue(var101);
        if (var102.eql((SubLObject)module0660.$ic158$)) {
            return f40186(var100);
        }
        if (var102.eql((SubLObject)module0660.$ic159$)) {
            return module0669.f40718(var100);
        }
        if (var102.eql((SubLObject)module0660.$ic160$)) {
            return module0669.f40699(var100);
        }
        if (var102.eql((SubLObject)module0660.$ic161$)) {
            return f40187(var100);
        }
        return module0669.f40699(var100);
    }
    
    public static SubLObject f40186(final SubLObject var153) {
        final SubLThread var154 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)module0660.$ic0$);
        module0642.f39029((SubLObject)module0660.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var154), module0655.$g5142$.getDynamicValue(var154));
        final SubLObject var155 = module0014.f672((SubLObject)module0660.$ic1$);
        module0642.f39029((SubLObject)module0660.UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39020((SubLObject)module0660.$ic2$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        if (module0660.NIL != var155) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            module0642.f39020(var155);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39020((SubLObject)module0660.$ic3$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
        module0642.f39029((SubLObject)module0660.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)module0660.$ic162$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0660.UNPROVIDED);
        final SubLObject var156 = module0015.$g535$.currentBinding(var154);
        try {
            module0015.$g535$.bind((SubLObject)module0660.T, var154);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
            final SubLObject var4_157 = module0015.$g533$.currentBinding(var154);
            try {
                module0015.$g533$.bind((SubLObject)module0660.T, var154);
                f40188(var153);
                module0642.f39029((SubLObject)module0660.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var4_157, var154);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0660.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var156, var154);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0660.UNPROVIDED);
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40188(final SubLObject var153) {
        module0642.f39026((SubLObject)module0660.TWO_INTEGER);
        module0642.f39020(module0015.$g187$.getGlobalValue());
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0660.$ic163$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39020(module0015.$g188$.getGlobalValue());
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40187(final SubLObject var158) {
        final SubLThread var159 = SubLProcess.currentSubLThread();
        if (module0660.NIL == module0655.$g5080$.getDynamicValue(var159) || module0617.f37893(var158).numL(module0655.$g5080$.getDynamicValue(var159))) {
            return module0669.f40732((SubLObject)ConsesLow.list(var158));
        }
        if (module0217.f14357(var158).numL(module0655.$g5080$.getDynamicValue(var159))) {
            return module0669.f40738((SubLObject)ConsesLow.list(var158));
        }
        final SubLObject var160 = (SubLObject)((module0660.NIL != module0269.f17715(var158)) ? module0217.f14247(var158, (SubLObject)module0660.UNPROVIDED) : module0660.ZERO_INTEGER);
        final SubLObject var161 = (SubLObject)((module0660.NIL != module0269.f17723(var158)) ? module0217.f14257(var158) : module0660.ZERO_INTEGER);
        if ((var160.numG((SubLObject)module0660.ZERO_INTEGER) || var161.numG((SubLObject)module0660.ZERO_INTEGER)) && Numbers.add(module0217.f14221(var158, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED), var160, var161).numL(module0655.$g5080$.getDynamicValue(var159))) {
            module0669.f40788((SubLObject)ConsesLow.list(var158));
            return (SubLObject)module0660.NIL;
        }
        if (module0217.f14221(var158, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED).numL(module0655.$g5080$.getDynamicValue(var159))) {
            return module0669.f40757((SubLObject)ConsesLow.list(var158));
        }
        if (module0217.f14221(var158, (SubLObject)module0660.ONE_INTEGER, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED).numL(module0655.$g5080$.getDynamicValue(var159))) {
            return module0669.f40757((SubLObject)ConsesLow.list(var158, (SubLObject)module0660.$ic164$));
        }
        return module0669.f40717((SubLObject)ConsesLow.list(var158));
    }
    
    public static SubLObject f40189(SubLObject var1) {
        if (var1 == module0660.UNPROVIDED) {
            var1 = (SubLObject)module0660.NIL;
        }
        f40190((SubLObject)module0660.UNPROVIDED);
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40190(SubLObject var1) {
        if (var1 == module0660.UNPROVIDED) {
            var1 = (SubLObject)module0660.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)module0660.$ic0$);
        module0642.f39029((SubLObject)module0660.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        if (module0660.NIL != module0655.$g5091$.getDynamicValue(var2)) {
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var3 = module0014.f672((SubLObject)module0660.$ic1$);
            module0642.f39029((SubLObject)module0660.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            module0642.f39020((SubLObject)module0660.$ic2$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            if (module0660.NIL != var3) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(var3);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            module0642.f39020((SubLObject)module0660.$ic3$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
            module0642.f39055(module0655.$g5091$.getDynamicValue(var2));
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0660.UNPROVIDED);
        }
        final SubLObject var4 = module0015.$g535$.currentBinding(var2);
        try {
            module0015.$g535$.bind((SubLObject)module0660.T, var2);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
            final SubLObject var4_161 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)module0660.T, var2);
                f40191();
                module0642.f39029((SubLObject)module0660.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var4_161, var2);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0660.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var4, var2);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0660.UNPROVIDED);
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40192(SubLObject var9) {
        if (var9 == module0660.UNPROVIDED) {
            var9 = (SubLObject)module0660.NIL;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (module0660.NIL == var9) {
            var9 = (SubLObject)module0660.$ic28$;
        }
        final SubLObject var11 = module0656.f39832((SubLObject)module0660.$ic8$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0660.$ic166$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        if (module0660.NIL != var11) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
            module0642.f39020(var11);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
        final SubLObject var12 = module0015.$g533$.currentBinding(var10);
        try {
            module0015.$g533$.bind((SubLObject)module0660.T, var10);
            module0642.f39019(var9);
        }
        finally {
            module0015.$g533$.rebind(var12, var10);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40193() {
        return module0644.f39183(module0656.f39832((SubLObject)module0660.$ic8$));
    }
    
    public static SubLObject f40194(final SubLObject var162, final SubLObject var163) {
        final SubLObject var164 = var162.rest();
        final SubLObject var166;
        final SubLObject var165 = var166 = var164;
        return (SubLObject)ConsesLow.list((SubLObject)module0660.$ic169$, (SubLObject)module0660.$ic170$, (SubLObject)ConsesLow.listS((SubLObject)module0660.$ic171$, (SubLObject)module0660.$ic172$, ConsesLow.append(var166, (SubLObject)module0660.NIL)));
    }
    
    public static SubLObject f40191() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39020((SubLObject)module0660.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
        final SubLObject var3 = module0015.$g533$.currentBinding(var2);
        try {
            module0015.$g533$.bind((SubLObject)module0660.T, var2);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
            final SubLObject var4_167 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)module0660.T, var2);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39046(module0015.$g369$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0660.$ic39$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0660.$ic20$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_168 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    f40195();
                }
                finally {
                    module0015.$g533$.rebind(var4_168, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_169 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    module0642.f39032((SubLObject)module0660.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var4_169, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39046(module0015.$g369$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0660.$ic39$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0660.$ic20$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_170 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    f40196();
                }
                finally {
                    module0015.$g533$.rebind(var4_170, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_171 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    module0642.f39032((SubLObject)module0660.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var4_171, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39046(module0015.$g369$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0660.$ic39$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0660.$ic20$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_172 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    f40197();
                }
                finally {
                    module0015.$g533$.rebind(var4_172, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_173 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    module0642.f39032((SubLObject)module0660.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var4_173, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39046(module0015.$g369$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0660.$ic39$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0660.$ic20$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_174 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    f40198();
                }
                finally {
                    module0015.$g533$.rebind(var4_174, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_175 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    module0642.f39032((SubLObject)module0660.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var4_175, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39046(module0015.$g369$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0660.$ic39$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0660.$ic20$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_176 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    f40199();
                }
                finally {
                    module0015.$g533$.rebind(var4_176, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                if (module0660.NIL != f40200()) {
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                    final SubLObject var4_177 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0660.T, var2);
                        module0642.f39032((SubLObject)module0660.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_177, var2);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39046(module0015.$g369$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0660.$ic39$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0660.$ic20$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                    final SubLObject var4_178 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0660.T, var2);
                        f40201();
                    }
                    finally {
                        module0015.$g533$.rebind(var4_178, var2);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                if (module0660.NIL != f40202()) {
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                    final SubLObject var4_179 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0660.T, var2);
                        module0642.f39032((SubLObject)module0660.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_179, var2);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39046(module0015.$g369$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0660.$ic39$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0660.$ic20$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                    final SubLObject var4_180 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0660.T, var2);
                        f40203();
                    }
                    finally {
                        module0015.$g533$.rebind(var4_180, var2);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                if (module0660.NIL != f40204()) {
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                    final SubLObject var4_181 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0660.T, var2);
                        module0642.f39032((SubLObject)module0660.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_181, var2);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39046(module0015.$g369$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0660.$ic39$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0660.$ic20$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                    final SubLObject var4_182 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0660.T, var2);
                        f40205();
                    }
                    finally {
                        module0015.$g533$.rebind(var4_182, var2);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                if (module0660.NIL != f40206()) {
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                    final SubLObject var4_183 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0660.T, var2);
                        module0642.f39032((SubLObject)module0660.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_183, var2);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39046(module0015.$g369$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0660.$ic39$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0660.$ic20$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                    final SubLObject var4_184 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0660.T, var2);
                        f40207();
                    }
                    finally {
                        module0015.$g533$.rebind(var4_184, var2);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_185 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    module0642.f39032((SubLObject)module0660.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var4_185, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39046(module0015.$g369$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0660.$ic39$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0660.$ic20$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_186 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    f40208();
                }
                finally {
                    module0015.$g533$.rebind(var4_186, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_187 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    module0642.f39032((SubLObject)module0660.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var4_187, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39046(module0015.$g369$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0660.$ic74$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0660.$ic20$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_188 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    module0642.f39019((SubLObject)module0660.$ic173$);
                    module0642.f39020(module0015.$g381$.getGlobalValue());
                    module0642.f39020(module0015.$g383$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020((SubLObject)module0660.$ic174$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0015.$g387$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020((SubLObject)module0660.$ic175$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                    final SubLObject var4_189 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0660.T, var2);
                        module0642.f39019((SubLObject)module0660.$ic176$);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_189, var2);
                    }
                    module0642.f39020(module0015.$g382$.getGlobalValue());
                    module0642.f39027((SubLObject)module0660.$ic40$, (SubLObject)module0660.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var4_188, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_167, var2);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0660.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var3, var2);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40195() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0660.NIL != module0655.$g5077$.getDynamicValue(var2)) {
            module0656.f39869((SubLObject)module0660.$ic177$, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
        }
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40196() {
        module0656.f39837((SubLObject)module0660.$ic167$, (SubLObject)module0660.$ic28$, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40197() {
        module0656.f39837((SubLObject)module0660.$ic179$, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
        module0642.f39032((SubLObject)module0660.UNPROVIDED);
        final SubLObject var190 = module0574.f35126();
        final SubLObject var191 = module0574.f35170(var190);
        module0642.f39019(var191);
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40198() {
        module0656.f39837((SubLObject)module0660.$ic180$, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
        module0642.f39032((SubLObject)module0660.UNPROVIDED);
        module0642.f39019(module0593.f36286());
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40199() {
        module0642.f39021((SubLObject)module0660.$ic181$);
        module0642.f39019(module0018.f971());
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40200() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0574.f35163().isPositive() || module0660.NIL != module0574.f35132());
    }
    
    public static SubLObject f40201() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0574.f35163();
        final SubLObject var4 = module0572.f35062((SubLObject)module0660.UNPROVIDED);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39020((SubLObject)module0660.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39020((SubLObject)module0660.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var2);
        try {
            module0015.$g533$.bind((SubLObject)module0660.T, var2);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
            final SubLObject var4_194 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)module0660.T, var2);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39046(module0015.$g369$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_195 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    module0642.f39020(module0015.$g149$.getGlobalValue());
                    module0642.f39020(module0015.$g159$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020((SubLObject)module0660.$ic16$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                    final SubLObject var4_196 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0660.T, var2);
                        module0642.f39021((SubLObject)module0660.$ic182$);
                        module0642.f39019((SubLObject)module0660.$ic122$);
                        if (var3.eql(var4)) {
                            module0642.f39019((SubLObject)module0660.$ic183$);
                        }
                        module0642.f39019(var3);
                        if (!var3.eql(var4)) {
                            module0642.f39019((SubLObject)module0660.$ic184$);
                            module0642.f39019((SubLObject)((module0660.NIL != var4) ? var4 : module0660.$ic185$));
                        }
                        module0642.f39019((SubLObject)module0660.$ic15$);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_196, var2);
                    }
                    module0642.f39020(module0015.$g150$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_195, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_194, var2);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0660.UNPROVIDED);
            if (var4.isNumber() && !var3.eql(var4)) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var4_197 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g375$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020((SubLObject)module0660.$ic71$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                    final SubLObject var4_198 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0660.T, var2);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                        module0642.f39020((SubLObject)module0660.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                        module0642.f39020(module0015.$g353$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                        module0642.f39020((SubLObject)module0660.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                        module0642.f39020(module0015.$g354$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                        module0642.f39020((SubLObject)module0660.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                        final SubLObject var4_199 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)module0660.T, var2);
                            var2.resetMultipleValues();
                            final SubLObject var6 = module0642.f39095(var3, var4, (SubLObject)module0660.NIL);
                            final SubLObject var7 = var2.secondMultipleValue();
                            var2.resetMultipleValues();
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39020(module0015.$g367$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                            module0642.f39020((SubLObject)module0660.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                            final SubLObject var4_200 = module0015.$g533$.currentBinding(var2);
                            try {
                                module0015.$g533$.bind((SubLObject)module0660.T, var2);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                if (module0660.NIL != module0015.$g504$.getGlobalValue()) {
                                    module0642.f39020(module0015.$g374$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                                    module0642.f39020(module0015.$g504$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                                }
                                if (module0660.NIL != var6) {
                                    module0642.f39020(module0015.$g375$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                                    module0642.f39020(var6);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                                final SubLObject var4_201 = module0015.$g533$.currentBinding(var2);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_201, var2);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                if (module0660.NIL != module0015.$g502$.getGlobalValue()) {
                                    module0642.f39020(module0015.$g374$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                                    module0642.f39020(module0015.$g502$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                                }
                                if (module0660.NIL != var7) {
                                    module0642.f39020(module0015.$g375$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                                    module0642.f39020(var7);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                                final SubLObject var4_202 = module0015.$g533$.currentBinding(var2);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_202, var2);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_200, var2);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0660.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_199, var2);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var4_198, var2);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_197, var2);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0660.UNPROVIDED);
            }
        }
        finally {
            module0015.$g533$.rebind(var5, var2);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40202() {
        return module0575.f35283();
    }
    
    public static SubLObject f40203() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0575.f35243();
        final SubLObject var4 = module0575.f35257();
        final SubLObject var5 = module0575.f35277();
        module0642.f39020(module0015.$g234$.getGlobalValue());
        if (module0660.NIL != module0575.f35244()) {
            module0642.f39019((SubLObject)module0660.$ic186$);
        }
        else {
            module0656.f39837((SubLObject)module0660.$ic187$, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
        }
        module0642.f39032((SubLObject)module0660.UNPROVIDED);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        if (var3.isPositive() || var4.isPositive()) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0660.$ic188$, var3);
            if (var4.numG((SubLObject)module0660.ZERO_INTEGER)) {
                final SubLObject var6 = (SubLObject)module0660.$ic189$;
                module0642.f39020(module0015.$g219$.getGlobalValue());
                if (module0660.NIL != var6) {
                    module0642.f39020(module0015.$g222$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                    module0642.f39020(module0642.f39042(var6));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0660.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0660.UNPROVIDED);
                final SubLObject var7 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0660.T, var2);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0660.$ic190$, var4);
                }
                finally {
                    module0015.$g533$.rebind(var7, var2);
                }
                module0642.f39020(module0015.$g220$.getGlobalValue());
            }
            else {
                PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0660.$ic190$, var4);
            }
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0660.$ic191$, var5);
        }
        else {
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0660.$ic192$, var5);
        }
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40204() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0575.f35267().isPositive() || module0574.f35142().isPositive());
    }
    
    public static SubLObject f40205() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0575.f35267();
        final SubLObject var4 = module0574.f35142();
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0660.$ic193$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        if (var3.isPositive()) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0660.$ic194$, var3, var4);
        }
        else {
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0660.$ic192$, var4);
        }
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40206() {
        return Numbers.plusp(module0575.f35272());
    }
    
    public static SubLObject f40207() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0575.f35272();
        module0642.f39021((SubLObject)module0660.$ic195$);
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0660.$ic192$, var3);
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40208() {
        module0656.f39837((SubLObject)module0660.$ic196$, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED, (SubLObject)module0660.UNPROVIDED);
        module0642.f39032((SubLObject)module0660.UNPROVIDED);
        module0642.f39019(module0011.f351());
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40209() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40138", "CB-START", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40139", "S#44198", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40140", "S#44199", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40141", "CB-TOOLBAR-FRAME", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40143", "S#44200", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40142", "S#44201", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40146", "S#44202", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40145", "S#44203", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40147", "S#44204", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40144", "S#44205", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40148", "S#44206", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40149", "CB-HANDLE-SPECIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40155", "S#44207", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40157", "S#44208", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40156", "S#44209", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40159", "S#44210", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40158", "S#44211", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40160", "S#44212", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40161", "S#44213", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40151", "S#44214", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40152", "S#44215", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40150", "S#44216", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40153", "S#44217", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40174", "S#44218", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40173", "S#44219", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40166", "S#44220", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40165", "S#44221", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40164", "S#44222", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40170", "S#44223", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40162", "S#44224", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40163", "S#44225", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40169", "CONSTANT-VIA-STAR-COMPLETION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40167", "S#44226", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40168", "S#44227", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40172", "S#44228", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40171", "S#44229", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40175", "S#44230", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40176", "CB-MAIN-FRAME", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40177", "CB-CF", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40178", "CB-CONSTANT-FRAME", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40179", "CB-NF", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40180", "CB-NART-FRAME", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40181", "CB-NAUT-FRAME", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40154", "S#44231", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40182", "CB-INDEX-FRAME", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40183", "S#44232", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40184", "CB-CONTENT-FRAME", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40185", "S#44233", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40186", "S#44234", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40188", "S#44235", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40187", "S#44236", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40189", "CB-STATUS-FRAME", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40190", "S#44237", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40192", "S#44238", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40193", "S#44239", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0660", "f40194", "S#44240");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40191", "S#44241", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40195", "S#44242", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40196", "S#44243", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40197", "S#44244", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40198", "S#44245", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40199", "S#44246", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40200", "S#44247", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40201", "S#44248", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40202", "S#44249", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40203", "S#44250", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40204", "S#44251", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40205", "S#44252", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40206", "S#44253", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40207", "S#44254", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0660", "f40208", "S#44255", 0, 0, false);
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40210() {
        module0660.$g5199$ = SubLFiles.deflexical("S#44256", (SubLObject)module0660.$ic13$);
        module0660.$g5200$ = SubLFiles.defparameter("S#44257", module0073.f5143((SubLObject)(module0660.$ic24$.isSymbol() ? Symbols.symbol_value((SubLObject)module0660.$ic24$) : module0660.$ic24$), (SubLObject)module0660.$ic25$, (SubLObject)(module0660.NIL.isSymbol() ? Symbols.symbol_value((SubLObject)module0660.NIL) : module0660.NIL), (SubLObject)module0660.$ic26$, (SubLObject)module0660.UNPROVIDED));
        module0660.$g5202$ = SubLFiles.deflexical("S#44258", (SubLObject)module0660.$ic50$);
        module0660.$g5203$ = SubLFiles.deflexical("S#44259", (SubLObject)module0660.$ic51$);
        module0660.$g5204$ = SubLFiles.deflexical("S#44260", (SubLObject)module0660.$ic58$);
        module0660.$g5205$ = SubLFiles.deflexical("S#44261", (SubLObject)module0660.$ic59$);
        module0660.$g5206$ = SubLFiles.defparameter("S#44262", (SubLObject)module0660.T);
        module0660.$g5207$ = SubLFiles.defparameter("S#44263", (SubLObject)module0660.NIL);
        module0660.$g5208$ = SubLFiles.defvar("S#44264", (SubLObject)module0660.$ic151$);
        return (SubLObject)module0660.NIL;
    }
    
    public static SubLObject f40211() {
        module0015.f873((SubLObject)module0660.$ic12$);
        module0656.f39840((SubLObject)module0660.$ic22$, (SubLObject)module0660.$ic23$, (SubLObject)module0660.ONE_INTEGER);
        module0015.f873((SubLObject)module0660.$ic27$);
        module0656.f39840((SubLObject)module0660.$ic6$, (SubLObject)module0660.$ic30$, (SubLObject)module0660.ONE_INTEGER);
        Hashtables.sethash((SubLObject)module0660.$ic31$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0660.$ic32$, (SubLObject)module0660.$ic33$));
        Hashtables.sethash((SubLObject)module0660.$ic34$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0660.$ic35$, (SubLObject)module0660.$ic36$));
        Hashtables.sethash((SubLObject)module0660.$ic37$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0660.$ic38$, (SubLObject)module0660.NIL));
        module0012.f441((SubLObject)module0660.$ic60$);
        module0012.f444((SubLObject)module0660.$ic60$);
        module0656.f39840((SubLObject)module0660.$ic78$, (SubLObject)module0660.$ic79$, (SubLObject)module0660.TWO_INTEGER);
        module0015.f873((SubLObject)module0660.$ic89$);
        module0015.f873((SubLObject)module0660.$ic141$);
        module0015.f873((SubLObject)module0660.$ic142$);
        module0015.f873((SubLObject)module0660.$ic143$);
        module0015.f873((SubLObject)module0660.$ic144$);
        module0015.f873((SubLObject)module0660.$ic145$);
        module0015.f873((SubLObject)module0660.$ic146$);
        module0012.f441((SubLObject)module0660.$ic152$);
        module0012.f444((SubLObject)module0660.$ic152$);
        module0015.f873((SubLObject)module0660.$ic154$);
        module0015.f873((SubLObject)module0660.$ic156$);
        module0015.f873((SubLObject)module0660.$ic165$);
        module0656.f39840((SubLObject)module0660.$ic167$, (SubLObject)module0660.$ic168$, (SubLObject)module0660.ONE_INTEGER);
        Hashtables.sethash((SubLObject)module0660.$ic177$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0660.$ic178$, (SubLObject)module0660.NIL));
        return (SubLObject)module0660.NIL;
    }
    
    public void declareFunctions() {
        f40209();
    }
    
    public void initializeVariables() {
        f40210();
    }
    
    public void runTopLevelForms() {
        f40211();
    }
    
    static {
        me = (SubLFile)new module0660();
        module0660.$g5199$ = null;
        module0660.$g5200$ = null;
        module0660.$g5202$ = null;
        module0660.$g5203$ = null;
        module0660.$g5204$ = null;
        module0660.$g5205$ = null;
        module0660.$g5206$ = null;
        module0660.$g5207$ = null;
        module0660.$g5208$ = null;
        $ic0$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic1$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic2$ = SubLObjectFactory.makeString("stylesheet");
        $ic3$ = SubLObjectFactory.makeString("text/css");
        $ic4$ = SubLObjectFactory.makeString("Cannot have a FRAMESET tag inside a BODY tag.");
        $ic5$ = SubLObjectFactory.makeString("75,*,50");
        $ic6$ = SubLObjectFactory.makeKeyword("TOOLBAR");
        $ic7$ = SubLObjectFactory.makeKeyword("MAIN");
        $ic8$ = SubLObjectFactory.makeKeyword("STATUS");
        $ic9$ = SubLObjectFactory.makeString("You must have frames enabled to use Cyc.  Please either enable frames in your web browser or disable frame support in the Cyc browser at the ");
        $ic10$ = SubLObjectFactory.makeKeyword("OPTIONS");
        $ic11$ = SubLObjectFactory.makeString(" page.");
        $ic12$ = SubLObjectFactory.makeSymbol("CB-START");
        $ic13$ = SubLObjectFactory.makeString("OpenCyc");
        $ic14$ = SubLObjectFactory.makeString(" (");
        $ic15$ = SubLObjectFactory.makeString(")");
        $ic16$ = SubLObjectFactory.makeString("");
        $ic17$ = SubLObjectFactory.makeString(" - ");
        $ic18$ = SubLObjectFactory.makeString("~A~A~A");
        $ic19$ = SubLObjectFactory.makeString("KB Browser");
        $ic20$ = SubLObjectFactory.makeKeyword("TOP");
        $ic21$ = SubLObjectFactory.makeString("cb-start");
        $ic22$ = SubLObjectFactory.makeKeyword("START");
        $ic23$ = SubLObjectFactory.makeSymbol("S#44199", "CYC");
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("system.common.browser.tools.cb-toolbar-restrict-to-user-tools?"));
        $ic25$ = SubLObjectFactory.makeSymbol("S#44257", "CYC");
        $ic26$ = SubLObjectFactory.makeKeyword("PARAMETER");
        $ic27$ = SubLObjectFactory.makeSymbol("CB-TOOLBAR-FRAME");
        $ic28$ = SubLObjectFactory.makeString("Update");
        $ic29$ = SubLObjectFactory.makeString("cb-toolbar-frame");
        $ic30$ = SubLObjectFactory.makeSymbol("S#44200", "CYC");
        $ic31$ = SubLObjectFactory.makeKeyword("OPENCYC-60");
        $ic32$ = SubLObjectFactory.makeString("opencyc-logo-60.gif");
        $ic33$ = SubLObjectFactory.makeString("OpenCyc Browser");
        $ic34$ = SubLObjectFactory.makeKeyword("RESEARCHCYC-60");
        $ic35$ = SubLObjectFactory.makeString("cyc-logo-violet-60.gif");
        $ic36$ = SubLObjectFactory.makeString("ResearchCyc Browser");
        $ic37$ = SubLObjectFactory.makeKeyword("CB-TOOLBAR-FRAME");
        $ic38$ = SubLObjectFactory.makeString("cb-toolbar-frame.html");
        $ic39$ = SubLObjectFactory.makeKeyword("LEFT");
        $ic40$ = SubLObjectFactory.makeKeyword("NBSP");
        $ic41$ = SubLObjectFactory.makeString("50%");
        $ic42$ = SubLObjectFactory.makeString("You are: ");
        $ic43$ = SubLObjectFactory.makeKeyword("LOGOUT");
        $ic44$ = SubLObjectFactory.makeString("Server: ");
        $ic45$ = SubLObjectFactory.makeString("unknown");
        $ic46$ = SubLObjectFactory.makeString(":");
        $ic47$ = SubLObjectFactory.makeString("...");
        $ic48$ = SubLObjectFactory.makeString("Purpose: ");
        $ic49$ = SubLObjectFactory.makeKeyword("TOOLS");
        $ic50$ = SubLObjectFactory.makeInteger(25);
        $ic51$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HISTORY"), (SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERT"), (SubLObject)SubLObjectFactory.makeKeyword("COMPOSE"), (SubLObject)SubLObjectFactory.makeKeyword("QUERY"), (SubLObject)SubLObjectFactory.makeKeyword("DOC"));
        $ic52$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic53$ = SubLObjectFactory.makeSymbol("S#43809", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic55$ = SubLObjectFactory.makeSymbol("S#43797", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("STRING<");
        $ic57$ = SubLObjectFactory.makeKeyword("CENTER");
        $ic58$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("No gloss"), (SubLObject)SubLObjectFactory.makeString("CycL gloss"));
        $ic59$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NONE"), (SubLObject)SubLObjectFactory.makeSymbol("S#42702", "CYC"));
        $ic60$ = SubLObjectFactory.makeSymbol("S#44262", "CYC");
        $ic61$ = SubLObjectFactory.makeString("98%");
        $ic62$ = SubLObjectFactory.makeString("cb-handle-specify");
        $ic63$ = SubLObjectFactory.makeString("handler");
        $ic64$ = SubLObjectFactory.makeString("cb-cf");
        $ic65$ = SubLObjectFactory.makeString("arg-done");
        $ic66$ = SubLObjectFactory.makeString("constant-complete");
        $ic67$ = SubLObjectFactory.makeString("autocomplete");
        $ic68$ = SubLObjectFactory.makeString("query");
        $ic69$ = SubLObjectFactory.makeString("completeContainer");
        $ic70$ = SubLObjectFactory.makeString("inputBox");
        $ic71$ = SubLObjectFactory.makeInteger(50);
        $ic72$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic73$ = SubLObjectFactory.makeString("Search");
        $ic74$ = SubLObjectFactory.makeKeyword("RIGHT");
        $ic75$ = SubLObjectFactory.makeKeyword("CYC-MAIN");
        $ic76$ = SubLObjectFactory.makeString("cb-handle-specify&query=~A&everything=t");
        $ic77$ = SubLObjectFactory.makeString("~A results");
        $ic78$ = SubLObjectFactory.makeKeyword("CB-SPECIFY-ALL");
        $ic79$ = SubLObjectFactory.makeSymbol("S#44206", "CYC");
        $ic80$ = SubLObjectFactory.makeString("gloss-required");
        $ic81$ = SubLObjectFactory.makeSymbol("NONE");
        $ic82$ = SubLObjectFactory.makeString("lucky");
        $ic83$ = SubLObjectFactory.makeString("case-insensitive");
        $ic84$ = SubLObjectFactory.makeString("everything");
        $ic85$ = SubLObjectFactory.makeInteger(100);
        $ic86$ = SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-CHAR-P");
        $ic87$ = SubLObjectFactory.makeString("Can't determine a Cyc term from ~s.");
        $ic88$ = SubLObjectFactory.makeString("Please enter a non-empty string.");
        $ic89$ = SubLObjectFactory.makeSymbol("CB-HANDLE-SPECIFY");
        $ic90$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic91$ = SubLObjectFactory.makeString("WordNet search results for \"");
        $ic92$ = SubLObjectFactory.makeString("wn ");
        $ic93$ = SubLObjectFactory.makeString("\"");
        $ic94$ = SubLObjectFactory.makeString("Search results for \"");
        $ic95$ = SubLObjectFactory.makeString("~A matching term found:");
        $ic96$ = SubLObjectFactory.makeString("~A matching terms found:");
        $ic97$ = SubLObjectFactory.makeString("~A matching WordNet synsets found:");
        $ic98$ = SubLObjectFactory.makeString("No matching WordNet synsets found:");
        $ic99$ = SubLObjectFactory.makeString("No matching terms found.");
        $ic100$ = SubLObjectFactory.makeString("See also:");
        $ic101$ = SubLObjectFactory.makeString("But see:");
        $ic102$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic103$ = SubLObjectFactory.makeKeyword("HTML");
        $ic104$ = SubLObjectFactory.makeKeyword("NEW");
        $ic105$ = SubLObjectFactory.makeString(" (1-~A of approximately ");
        $ic106$ = SubLObjectFactory.makeSymbol("S#747", "CYC");
        $ic107$ = SubLObjectFactory.makeSymbol("NAUT-P");
        $ic108$ = SubLObjectFactory.makeSymbol("S#17581", "CYC");
        $ic109$ = SubLObjectFactory.makeSymbol("S#20292", "CYC");
        $ic110$ = SubLObjectFactory.makeSymbol("ASSERTION-CONS");
        $ic111$ = SubLObjectFactory.makeString("Collections");
        $ic112$ = SubLObjectFactory.makeString("Relations");
        $ic113$ = SubLObjectFactory.makeString("Individuals");
        $ic114$ = SubLObjectFactory.makeString("Assertions");
        $ic115$ = SubLObjectFactory.makeString(": ");
        $ic116$ = SubLObjectFactory.makeString("a ");
        $ic117$ = SubLObjectFactory.makeString("d ");
        $ic118$ = SubLObjectFactory.makeString("c ");
        $ic119$ = SubLObjectFactory.makeString("n ");
        $ic120$ = SubLObjectFactory.makeString("#G\"");
        $ic121$ = SubLObjectFactory.makeString("Empty string results in no constants found.");
        $ic122$ = SubLObjectFactory.makeString("(");
        $ic123$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic124$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic125$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic126$ = SubLObjectFactory.makeString("*");
        $ic127$ = SubLObjectFactory.makeString(".*");
        $ic128$ = SubLObjectFactory.makeString("Cannot handle pattern *[string]* if [string] is under 5 characters.");
        $ic129$ = SubLObjectFactory.makeString("Cannot handle pattern *[string] if [string] is under 4 characters.");
        $ic130$ = SubLObjectFactory.makeString("Cannot handle pattern [string]* if [string] is under 3 characters.");
        $ic131$ = SubLObjectFactory.makeSymbol("S#44220", "CYC");
        $ic132$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic133$ = SubLObjectFactory.makeString("Unable to access subword-index: ~S");
        $ic134$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AllLexicalMicrotheoryPSC"));
        $ic135$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AnytimePSC"));
        $ic136$ = SubLObjectFactory.makeInteger(40);
        $ic137$ = SubLObjectFactory.makeInteger(39);
        $ic138$ = SubLObjectFactory.makeInteger(36);
        $ic139$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CASELESS"));
        $ic140$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#43984", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43985", "CYC"));
        $ic141$ = SubLObjectFactory.makeSymbol("CB-MAIN-FRAME");
        $ic142$ = SubLObjectFactory.makeSymbol("CB-CF");
        $ic143$ = SubLObjectFactory.makeSymbol("CB-CONSTANT-FRAME");
        $ic144$ = SubLObjectFactory.makeSymbol("CB-NF");
        $ic145$ = SubLObjectFactory.makeSymbol("CB-NART-FRAME");
        $ic146$ = SubLObjectFactory.makeSymbol("CB-NAUT-FRAME");
        $ic147$ = SubLObjectFactory.makeString("30%,*");
        $ic148$ = SubLObjectFactory.makeKeyword("INDEX");
        $ic149$ = SubLObjectFactory.makeKeyword("CONTENT");
        $ic150$ = SubLObjectFactory.makeString("The requested term is not available.");
        $ic151$ = SubLObjectFactory.makeKeyword("INFERRED");
        $ic152$ = SubLObjectFactory.makeSymbol("S#44264", "CYC");
        $ic153$ = SubLObjectFactory.makeKeyword("LEGACY");
        $ic154$ = SubLObjectFactory.makeSymbol("CB-INDEX-FRAME");
        $ic155$ = SubLObjectFactory.makeString("No Index");
        $ic156$ = SubLObjectFactory.makeSymbol("CB-CONTENT-FRAME");
        $ic157$ = SubLObjectFactory.makeKeyword("LEXICAL");
        $ic158$ = SubLObjectFactory.makeKeyword("NONE");
        $ic159$ = SubLObjectFactory.makeKeyword("DEFINITIONAL");
        $ic160$ = SubLObjectFactory.makeKeyword("DOCUMENTATION");
        $ic161$ = SubLObjectFactory.makeKeyword("MAXIMAL");
        $ic162$ = SubLObjectFactory.makeString("Index Choose");
        $ic163$ = SubLObjectFactory.makeString("Choose an item from the index.");
        $ic164$ = SubLObjectFactory.makeString("1");
        $ic165$ = SubLObjectFactory.makeSymbol("CB-STATUS-FRAME");
        $ic166$ = SubLObjectFactory.makeString("cb-status-frame");
        $ic167$ = SubLObjectFactory.makeKeyword("SERVER-STATUS");
        $ic168$ = SubLObjectFactory.makeSymbol("S#44238", "CYC");
        $ic169$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic170$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1024", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1516", "CYC")));
        $ic171$ = SubLObjectFactory.makeSymbol("S#1023", "CYC");
        $ic172$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("LEFT"), (SubLObject)SubLObjectFactory.makeKeyword("VALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("TOP"), (SubLObject)SubLObjectFactory.makeKeyword("NOWRAP"), (SubLObject)module0660.T);
        $ic173$ = SubLObjectFactory.makeString("Learn about ");
        $ic174$ = SubLObjectFactory.makeString("http://research.cyc.com/upgrade_from_opencyc");
        $ic175$ = SubLObjectFactory.makeString("_researchcyc");
        $ic176$ = SubLObjectFactory.makeString("ResearchCyc");
        $ic177$ = SubLObjectFactory.makeKeyword("CB-SERVER-STATUS");
        $ic178$ = SubLObjectFactory.makeString("cb-server-status.html");
        $ic179$ = SubLObjectFactory.makeKeyword("MODE");
        $ic180$ = SubLObjectFactory.makeKeyword("AGENDA");
        $ic181$ = SubLObjectFactory.makeString("KB: ");
        $ic182$ = SubLObjectFactory.makeString("Remote: ");
        $ic183$ = SubLObjectFactory.makeString("all ");
        $ic184$ = SubLObjectFactory.makeString(" of ");
        $ic185$ = SubLObjectFactory.makeString("???");
        $ic186$ = SubLObjectFactory.makeString("Local:");
        $ic187$ = SubLObjectFactory.makeKeyword("SHOW-LOCAL-OPS");
        $ic188$ = SubLObjectFactory.makeString("(~d ");
        $ic189$ = SubLObjectFactory.makeKeyword("RED");
        $ic190$ = SubLObjectFactory.makeString("~d");
        $ic191$ = SubLObjectFactory.makeString(" ~d)");
        $ic192$ = SubLObjectFactory.makeString("(~d)");
        $ic193$ = SubLObjectFactory.makeString("Aux: ");
        $ic194$ = SubLObjectFactory.makeString("(~d ~d)");
        $ic195$ = SubLObjectFactory.makeString("Transmit Pending: ");
        $ic196$ = SubLObjectFactory.makeKeyword("SYSTEM");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0660.class
	Total time: 1565 ms
	
	Decompiled with Procyon 0.5.32.
*/