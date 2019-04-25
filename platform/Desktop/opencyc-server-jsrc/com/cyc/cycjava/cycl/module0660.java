package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)$ic0$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
        final SubLObject var3 = module0014.f672((SubLObject)$ic1$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic2$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var3) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var3);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic3$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019(f40139((SubLObject)UNPROVIDED));
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        if (NIL != module0015.f713()) {
            Errors.error((SubLObject)$ic4$);
        }
        module0642.f39020(module0015.$g415$.getGlobalValue());
        module0642.f39020(module0015.$g418$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic5$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0015.$g533$.currentBinding(var2);
        try {
            module0015.$g533$.bind((SubLObject)T, var2);
            module0656.f39836((SubLObject)$ic6$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0656.f39836((SubLObject)$ic7$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0656.f39836((SubLObject)$ic8$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g461$.getGlobalValue());
            final SubLObject var4_5 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_6 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39020(module0015.$g209$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic9$);
                    module0656.f39837((SubLObject)$ic10$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39019((SubLObject)$ic11$);
                    module0642.f39020(module0015.$g210$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_6, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
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
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40139(SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        SubLObject var8 = Strings.string_downcase(Environment.get_machine_name((SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var8.isString()) {
            var8 = Sequences.cconcatenate((SubLObject)$ic14$, new SubLObject[] { module0006.f203(var8), $ic15$ });
        }
        else {
            var8 = (SubLObject)$ic16$;
        }
        if (var7.isString()) {
            var7 = Sequences.cconcatenate((SubLObject)$ic17$, var7);
        }
        else {
            var7 = (SubLObject)$ic16$;
        }
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic18$, new SubLObject[] { $g5199$.getGlobalValue(), var7, var8 });
    }
    
    public static SubLObject f40140(SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (NIL == var9) {
            var9 = (SubLObject)$ic19$;
        }
        final SubLObject var11 = module0656.f39832((SubLObject)$ic20$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic21$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var11) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var11);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var12 = module0015.$g533$.currentBinding(var10);
        try {
            module0015.$g533$.bind((SubLObject)T, var10);
            module0642.f39019(var9);
        }
        finally {
            module0015.$g533$.rebind(var12, var10);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40141(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)$ic0$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
        final SubLObject var3 = module0014.f672((SubLObject)$ic1$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic2$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var3) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var3);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic3$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0666.f40487();
        module0666.f40535();
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var4 = module0015.$g535$.currentBinding(var2);
        try {
            module0015.$g535$.bind((SubLObject)T, var2);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (NIL != module0015.$g529$.getGlobalValue()) {
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g529$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_11 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)T, var2);
                f40142();
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var4_11, var2);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var4, var2);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40143(SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (NIL == var9) {
            var9 = (SubLObject)$ic28$;
        }
        final SubLObject var11 = module0656.f39832((SubLObject)$ic6$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic29$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var11) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var11);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var12 = module0015.$g533$.currentBinding(var10);
        try {
            module0015.$g533$.bind((SubLObject)T, var10);
            module0642.f39019(var9);
        }
        finally {
            module0015.$g533$.rebind(var12, var10);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40142() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39046(module0015.$g348$.getGlobalValue());
        module0642.f39046(module0015.$g349$.getGlobalValue());
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
        final SubLObject var3 = module0015.$g533$.currentBinding(var2);
        try {
            module0015.$g533$.bind((SubLObject)T, var2);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_12 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)T, var2);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic39$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_13 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    final SubLObject var4 = module0656.f39832((SubLObject)$ic20$);
                    module0642.f39020(module0015.$g381$.getGlobalValue());
                    module0642.f39020(module0015.$g383$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0655.f39768();
                    module0642.f39019((SubLObject)$ic21$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var4) {
                        module0642.f39020(module0015.$g387$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var4);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_14 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        final SubLObject var5 = module0014.f697((SubLObject)$ic31$);
                        final SubLObject var6 = (SubLObject)$ic20$;
                        final SubLObject var7 = module0014.f694((SubLObject)$ic31$);
                        final SubLObject var8 = (SubLObject)ZERO_INTEGER;
                        module0642.f39020(module0015.$g431$.getGlobalValue());
                        module0642.f39020(module0015.$g440$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var5);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        if (NIL != var7) {
                            module0642.f39020(module0015.$g437$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var7);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        if (NIL != var6) {
                            module0642.f39020(module0015.$g438$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049(var6));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        if (NIL != var8) {
                            module0642.f39020(module0015.$g439$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var8);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_15 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var2);
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
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_16 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39027((SubLObject)$ic40$, (SubLObject)TWO_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var4_16, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic39$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_17 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    f40144();
                }
                finally {
                    module0015.$g533$.rebind(var4_17, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_18 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39027((SubLObject)$ic40$, (SubLObject)TWO_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var4_18, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                final SubLObject var9 = (SubLObject)$ic39$;
                module0642.f39020(module0015.$g360$.getGlobalValue());
                if (NIL != var9) {
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049(var9));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g375$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic41$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_19 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    f40145();
                }
                finally {
                    module0015.$g533$.rebind(var4_19, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_20 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39027((SubLObject)$ic40$, (SubLObject)TWO_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var4_20, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic39$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_21 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic42$);
                    module0656.f39804(module0574.f35152(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0656.f39837((SubLObject)$ic43$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic44$);
                    module0642.f39019(Environment.get_machine_name((SubLObject)$ic45$));
                    module0642.f39019((SubLObject)$ic46$);
                    module0642.f39019(module0110.$g1378$.getDynamicValue(var2));
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                    module0642.f39026((SubLObject)UNPROVIDED);
                    if (NIL != module0678.$g5201$.getDynamicValue(var2)) {
                        final SubLObject var10 = Sequences.length(module0678.$g5201$.getDynamicValue(var2));
                        final SubLObject var11 = var10.numG($g5202$.getGlobalValue()) ? Sequences.cconcatenate(module0038.f2629($g5202$.getGlobalValue(), module0678.$g5201$.getDynamicValue(var2)), (SubLObject)$ic47$) : module0678.$g5201$.getDynamicValue(var2);
                        module0642.f39020(module0015.$g459$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic48$);
                        module0642.f39019(var11);
                        module0642.f39020(module0015.$g460$.getGlobalValue());
                    }
                    module0656.f39837((SubLObject)$ic10$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0656.f39837((SubLObject)$ic49$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var3, var2);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40146() {
        module0656.f39837((SubLObject)$ic6$, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)TWO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40145() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = f40147();
        var3 = module0035.remove_if_not((SubLObject)$ic52$, var3, (SubLObject)$ic53$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var3 = module0035.remove_if_not((SubLObject)$ic54$, var3, (SubLObject)$ic55$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var3 = Sort.sort(var3, (SubLObject)$ic56$, (SubLObject)$ic55$);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)FIVE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0015.$g533$.currentBinding(var2);
        try {
            module0015.$g533$.bind((SubLObject)T, var2);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_30 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)T, var2);
                SubLObject var5 = var3;
                SubLObject var6 = (SubLObject)NIL;
                var6 = var5.first();
                while (NIL != var5) {
                    if (module0656.f39838(var6).isFunctionSpec()) {
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic57$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_31 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var2);
                            module0656.f39837(var6, module0656.f39822(var6), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var4, var2);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40147() {
        return $g5203$.getGlobalValue();
    }
    
    public static SubLObject f40144() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = (SubLObject)$ic61$;
        final SubLObject var4 = module0656.f39832((SubLObject)$ic7$);
        module0642.f39020(module0015.$g282$.getGlobalValue());
        module0642.f39020(module0015.$g284$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0110.$g570$.getDynamicValue(var2));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != module0015.$g289$.getGlobalValue()) {
            module0642.f39020(module0015.$g285$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g289$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var4) {
            module0642.f39020(module0015.$g286$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var4);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var2);
        final SubLObject var6 = module0015.$g541$.currentBinding(var2);
        final SubLObject var7 = module0015.$g539$.currentBinding(var2);
        try {
            module0015.$g533$.bind((SubLObject)T, var2);
            module0015.$g541$.bind((SubLObject)T, var2);
            module0015.$g539$.bind(module0015.f797(), var2);
            module0642.f39069((SubLObject)$ic62$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            module0642.f39069((SubLObject)$ic63$, (SubLObject)$ic64$, (SubLObject)UNPROVIDED);
            module0642.f39069((SubLObject)$ic65$, (SubLObject)T, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39020(module0015.$g353$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g354$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_38 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)T, var2);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_39 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_40 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39020(module0015.$g459$.getGlobalValue());
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_41 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var2);
                            module0642.f39020(module0015.$g144$.getGlobalValue());
                            module0642.f39020(module0015.$g157$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic66$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g158$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic67$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_42 = module0015.$g533$.currentBinding(var2);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var2);
                                module0644.f39192((SubLObject)$ic68$, (SubLObject)$ic16$, var3, (SubLObject)NIL, module0110.$g570$.getDynamicValue(var2), module0015.$g289$.getGlobalValue(), (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g144$.getGlobalValue());
                                module0642.f39020(module0015.$g157$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic69$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_43 = module0015.$g533$.currentBinding(var2);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var2);
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
                            if (NIL != $g5206$.getDynamicValue(var2)) {
                                module0666.f40486((SubLObject)$ic70$, (SubLObject)$ic69$, (SubLObject)$ic71$, (SubLObject)THREE_INTEGER, (SubLObject)T, $ic72$);
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
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_44 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0644.f39190((SubLObject)$ic73$, (SubLObject)$ic16$, (SubLObject)NIL, module0110.$g570$.getDynamicValue(var2), module0015.$g289$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_45 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_46 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39020(module0015.$g459$.getGlobalValue());
                        module0642.f39027((SubLObject)$ic40$, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g460$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var4_46, var2);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic74$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_47 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0644.f39184((SubLObject)$ic68$, (SubLObject)UNPROVIDED);
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
                module0642.f39029((SubLObject)UNPROVIDED);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40148(final SubLObject var48, final SubLObject var49) {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        final SubLObject var51 = module0656.f39832((SubLObject)$ic75$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var50), (SubLObject)$ic76$, module0589.f35898(var48, (SubLObject)UNPROVIDED));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var51) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var51);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var52 = module0015.$g533$.currentBinding(var50);
        try {
            module0015.$g533$.bind((SubLObject)T, var50);
            PrintLow.format(module0015.$g131$.getDynamicValue(var50), (SubLObject)$ic77$, var49);
        }
        finally {
            module0015.$g533$.rebind(var52, var50);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var48;
    }
    
    public static SubLObject f40149(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = module0642.f39104((SubLObject)$ic68$, var1);
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        final SubLObject var8 = module0642.f39104((SubLObject)$ic80$, var1);
        final SubLObject var9 = (SubLObject)(var8.isString() ? reader.read_from_string_ignoring_errors(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : $ic81$);
        final SubLObject var10 = (SubLObject)((NIL != module0642.f39104((SubLObject)$ic82$, var1)) ? T : NIL);
        final SubLObject var11 = module0642.f39104((SubLObject)$ic83$, var1);
        final SubLObject var12 = module0642.f39104((SubLObject)$ic84$, var1);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? NIL : $ic85$);
        final SubLObject var14 = (SubLObject)T;
        if (NIL != var10 && NIL == module0655.$g5120$.getDynamicValue(var2)) {
            module0655.$g5120$.setDynamicValue((SubLObject)T, var2);
        }
        else if (NIL == var10 && NIL != module0655.$g5120$.getDynamicValue(var2)) {
            module0655.$g5120$.setDynamicValue((SubLObject)NIL, var2);
        }
        module0655.$g5119$.setDynamicValue(var9, var2);
        if (NIL != var3) {
            var3 = module0038.f2823(var3);
            var2.resetMultipleValues();
            final SubLObject var15 = f40150(var3, var14, (SubLObject)T);
            final SubLObject var16 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            if (NIL == module0035.f1997(var15) && (NIL == f40151(var3) || NIL != f40152(var3))) {
                var2.resetMultipleValues();
                final SubLObject var64_65 = f40153(var3, var15, var13);
                final SubLObject var66_67 = var2.secondMultipleValue();
                var2.resetMultipleValues();
                var4 = var64_65;
                var5 = var66_67;
                var7 = (SubLObject)T;
            }
            if (NIL == var15 && NIL == var4 && NIL == var6) {
                if (var3.isString() && NIL == module0035.find_if_not(Symbols.symbol_function((SubLObject)$ic86$), var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    if (Sequences.length(var3).numG((SubLObject)ZERO_INTEGER)) {
                        module0669.f40867((SubLObject)ConsesLow.list(var3));
                    }
                    else {
                        module0669.f40872((SubLObject)UNPROVIDED);
                    }
                }
                else if (NIL != var16) {
                    module0656.f39789(var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                else {
                    module0656.f39789((SubLObject)$ic87$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            else if (NIL != module0035.f1997(var15) && NIL == var4) {
                if (NIL != assertion_handles_oc.f11035(var15.first())) {
                    module0671.f40976(var15.first());
                }
                else if (NIL != deduction_handles_oc.f11659(var15.first())) {
                    module0671.f41005(var15.first());
                }
                else {
                    f40154(module0656.f39932(var15.first()));
                }
            }
            else if (NIL == var15 && NIL != module0035.f1997(var4)) {
                if (NIL != assertion_handles_oc.f11035(var4.first())) {
                    module0671.f40976(var4.first());
                }
                else if (NIL != deduction_handles_oc.f11659(var15.first())) {
                    module0671.f41005(var4.first());
                }
                else {
                    f40154(module0656.f39932(var4.first()));
                }
            }
            else if (var15.isCons() || var4.isCons() || var6.isCons()) {
                f40155(var3, var15, var4, var6, var9, var5);
            }
            else if (NIL != var16) {
                module0656.f39789(var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                module0656.f39789((SubLObject)$ic87$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else {
            module0656.f39789((SubLObject)$ic88$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40155(final SubLObject var50, final SubLObject var68, final SubLObject var69, final SubLObject var53, SubLObject var56, SubLObject var70) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        if (var70 == UNPROVIDED) {
            var70 = (SubLObject)NIL;
        }
        final SubLThread var71 = SubLProcess.currentSubLThread();
        var71.resetMultipleValues();
        final SubLObject var72 = module0035.f2092(var68, Symbols.symbol_function((SubLObject)$ic90$));
        final SubLObject var73 = var71.secondMultipleValue();
        var71.resetMultipleValues();
        final SubLObject var74 = (NIL != f40152(var50)) ? Sequences.cconcatenate((SubLObject)$ic91$, new SubLObject[] { module0038.f2674(var50, (SubLObject)$ic92$, (SubLObject)UNPROVIDED), $ic93$ }) : Sequences.cconcatenate((SubLObject)$ic94$, new SubLObject[] { var50, $ic93$ });
        final SubLObject var75 = (SubLObject)((NIL != var73) ? ((NIL != module0035.f1997(var73)) ? $ic95$ : $ic96$) : ((NIL != f40152(var50)) ? ((NIL != var53) ? $ic97$ : $ic98$) : $ic99$));
        final SubLObject var76 = (SubLObject)((NIL != var73) ? $ic100$ : $ic101$);
        module0642.f39020((SubLObject)$ic0$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019(var74);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var77 = module0015.$g132$.getDynamicValue(var71);
        final SubLObject var78 = module0015.$g535$.currentBinding(var71);
        try {
            module0015.$g535$.bind((SubLObject)T, var71);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (NIL != var77) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(var77));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_76 = module0015.$g533$.currentBinding(var71);
            try {
                module0015.$g533$.bind((SubLObject)T, var71);
                module0642.f39020(module0015.$g189$.getGlobalValue());
                module0642.f39020((SubLObject)TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0642.f39019(var74);
                module0642.f39020(module0015.$g190$.getGlobalValue());
                module0642.f39020((SubLObject)TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var71), module0655.$g5142$.getDynamicValue(var71));
                final SubLObject var79 = module0014.f672((SubLObject)$ic1$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic2$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var79) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var79);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic3$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var4_77 = module0015.$g535$.currentBinding(var71);
                try {
                    module0015.$g535$.bind((SubLObject)T, var71);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_78 = module0015.$g533$.currentBinding(var71);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var71);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var71));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_79 = module0015.$g533$.currentBinding(var71);
                        final SubLObject var80 = module0015.$g541$.currentBinding(var71);
                        final SubLObject var81 = module0015.$g539$.currentBinding(var71);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var71);
                            module0015.$g541$.bind((SubLObject)T, var71);
                            module0015.$g539$.bind(module0015.f797(), var71);
                            if (NIL != f40152(var50)) {
                                module0642.f39020(module0015.$g189$.getGlobalValue());
                                module0642.f39020((SubLObject)FOUR_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                PrintLow.format(module0015.$g131$.getDynamicValue(var71), var75, Sequences.length(var53));
                                module0642.f39020(module0015.$g190$.getGlobalValue());
                                module0642.f39020((SubLObject)FOUR_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            }
                            else {
                                module0642.f39020(module0015.$g189$.getGlobalValue());
                                module0642.f39020((SubLObject)FOUR_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                PrintLow.format(module0015.$g131$.getDynamicValue(var71), var75, Sequences.length(var73));
                                module0642.f39020(module0015.$g190$.getGlobalValue());
                                module0642.f39020((SubLObject)FOUR_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            }
                            final SubLObject var4_80 = module0580.$g4361$.currentBinding(var71);
                            try {
                                module0580.$g4361$.bind((SubLObject)NIL, var71);
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
                                                    SubLObject var85 = (SubLObject)NIL;
                                                    if (NIL != var84 && NIL == module0034.f1842(var84)) {
                                                        var85 = module0034.f1869(var84);
                                                        final SubLObject var86 = Threads.current_process();
                                                        if (NIL == var85) {
                                                            module0034.f1873(var84, var86);
                                                        }
                                                        else if (!var85.eql(var86)) {
                                                            Errors.error((SubLObject)$ic102$);
                                                        }
                                                    }
                                                    try {
                                                        final SubLObject var4_85 = module0579.$g4260$.currentBinding(var71);
                                                        final SubLObject var36_91 = module0579.$g4259$.currentBinding(var71);
                                                        try {
                                                            module0579.$g4260$.bind(module0677.f41312(), var71);
                                                            module0579.$g4259$.bind((SubLObject)$ic103$, var71);
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
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var71);
                                                            if (NIL != var84 && NIL == var85) {
                                                                module0034.f1873(var84, (SubLObject)NIL);
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
                                            if (var83 == $ic104$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var71))) {
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
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var71);
                                            if (NIL == var82) {
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
                            if (NIL != var69 || NIL != var72) {
                                module0642.f39020(module0015.$g189$.getGlobalValue());
                                module0642.f39020((SubLObject)FOUR_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                module0642.f39019(var76);
                                if (NIL != var70) {
                                    module0642.f39020(module0015.$g149$.getGlobalValue());
                                    module0642.f39020(module0015.$g152$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g250$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var4_88 = module0015.$g533$.currentBinding(var71);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var71);
                                        PrintLow.format(module0015.$g131$.getDynamicValue(var71), (SubLObject)$ic105$, Sequences.length(var69));
                                        module0656.f39837((SubLObject)$ic78$, var50, var70, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        module0642.f39019((SubLObject)$ic15$);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_88, var71);
                                    }
                                    module0642.f39020(module0015.$g150$.getGlobalValue());
                                }
                                module0642.f39020(module0015.$g190$.getGlobalValue());
                                module0642.f39020((SubLObject)FOUR_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            }
                            f40156(Sequences.cconcatenate(var72, var69), var56);
                            if (NIL != var53) {
                                module0642.f39026((SubLObject)UNPROVIDED);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_78, var71);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var4_77, var71);
                }
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var4_76, var71);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var78, var71);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return var50;
    }
    
    public static SubLObject f40157(final SubLObject var53) {
        assert NIL != module0035.f2015(var53) : var53;
        SubLObject var54 = var53;
        SubLObject var55 = (SubLObject)NIL;
        var55 = var54.first();
        while (NIL != var54) {
            assert NIL != module0172.f10917(var55) : var55;
            var54 = var54.rest();
            var55 = var54.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40156(final SubLObject var62, SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        final SubLObject var63 = module0035.f2110(Symbols.symbol_function((SubLObject)$ic108$), var62, (SubLObject)UNPROVIDED);
        final SubLObject var64 = module0035.f2110(Symbols.symbol_function((SubLObject)$ic109$), var62, (SubLObject)UNPROVIDED);
        final SubLObject var65 = module0213.f13926(module0035.f2110(Symbols.symbol_function((SubLObject)$ic90$), var62, (SubLObject)UNPROVIDED), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T, (SubLObject)NIL, (SubLObject)$ic110$, (SubLObject)UNPROVIDED);
        final SubLObject var66 = module0035.f2218(module0035.f2218(module0035.f2218(var62, var63, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var64, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var65, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var56 == $ic81$) {
            f40158(var63, var64, var65, var66);
        }
        else {
            f40159(var63, var64, var65, var66, var56);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40159(final SubLObject var97, final SubLObject var98, final SubLObject var71, final SubLObject var99, final SubLObject var56) {
        if (NIL != var97) {
            module0642.f39020(module0015.$g224$.getGlobalValue());
            module0642.f39019((SubLObject)$ic111$);
            module0642.f39020(module0015.$g225$.getGlobalValue());
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var100 = var97;
            SubLObject var101 = (SubLObject)NIL;
            var101 = var100.first();
            while (NIL != var100) {
                f40160(var101, var56);
                var100 = var100.rest();
                var101 = var100.first();
            }
        }
        if (NIL != var98) {
            if (NIL != var97) {
                module0642.f39026((SubLObject)TWO_INTEGER);
            }
            module0642.f39020(module0015.$g224$.getGlobalValue());
            module0642.f39019((SubLObject)$ic112$);
            module0642.f39020(module0015.$g225$.getGlobalValue());
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var100 = var98;
            SubLObject var101 = (SubLObject)NIL;
            var101 = var100.first();
            while (NIL != var100) {
                f40160(var101, var56);
                var100 = var100.rest();
                var101 = var100.first();
            }
        }
        if (NIL != var99) {
            if (NIL != var97 || NIL != var98) {
                module0642.f39026((SubLObject)TWO_INTEGER);
            }
            module0642.f39020(module0015.$g224$.getGlobalValue());
            module0642.f39019((SubLObject)$ic113$);
            module0642.f39020(module0015.$g225$.getGlobalValue());
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var100 = var99;
            SubLObject var101 = (SubLObject)NIL;
            var101 = var100.first();
            while (NIL != var100) {
                f40160(var101, var56);
                var100 = var100.rest();
                var101 = var100.first();
            }
        }
        if (NIL != var71) {
            if (NIL != var97 || NIL != var98 || NIL != var99) {
                module0642.f39026((SubLObject)TWO_INTEGER);
            }
            module0642.f39020(module0015.$g224$.getGlobalValue());
            module0642.f39019((SubLObject)$ic114$);
            module0642.f39020(module0015.$g225$.getGlobalValue());
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var100 = var71;
            SubLObject var101 = (SubLObject)NIL;
            var101 = var100.first();
            while (NIL != var100) {
                f40160(var101, var56);
                var100 = var100.rest();
                var101 = var100.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40158(final SubLObject var97, final SubLObject var98, final SubLObject var71, final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var101 = module0015.$g533$.currentBinding(var100);
        try {
            module0015.$g533$.bind((SubLObject)T, var100);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_101 = module0015.$g533$.currentBinding(var100);
            try {
                module0015.$g533$.bind((SubLObject)T, var100);
                if (NIL != var97) {
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_102 = module0015.$g533$.currentBinding(var100);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var100);
                        module0642.f39020(module0015.$g224$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic111$);
                        module0642.f39020(module0015.$g225$.getGlobalValue());
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        SubLObject var102 = var97;
                        SubLObject var103 = (SubLObject)NIL;
                        var103 = var102.first();
                        while (NIL != var102) {
                            f40160(var103, (SubLObject)UNPROVIDED);
                            var102 = var102.rest();
                            var103 = var102.first();
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var4_102, var100);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_103 = module0015.$g533$.currentBinding(var100);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var100);
                        module0642.f39027((SubLObject)$ic40$, (SubLObject)FOUR_INTEGER);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_103, var100);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                if (NIL != var98) {
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_104 = module0015.$g533$.currentBinding(var100);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var100);
                        module0642.f39020(module0015.$g224$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic112$);
                        module0642.f39020(module0015.$g225$.getGlobalValue());
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        SubLObject var102 = var98;
                        SubLObject var103 = (SubLObject)NIL;
                        var103 = var102.first();
                        while (NIL != var102) {
                            f40160(var103, (SubLObject)UNPROVIDED);
                            var102 = var102.rest();
                            var103 = var102.first();
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var4_104, var100);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_105 = module0015.$g533$.currentBinding(var100);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var100);
                        module0642.f39027((SubLObject)$ic40$, (SubLObject)FOUR_INTEGER);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_105, var100);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                if (NIL != var99) {
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_106 = module0015.$g533$.currentBinding(var100);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var100);
                        module0642.f39020(module0015.$g224$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic113$);
                        module0642.f39020(module0015.$g225$.getGlobalValue());
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        SubLObject var102 = var99;
                        SubLObject var103 = (SubLObject)NIL;
                        var103 = var102.first();
                        while (NIL != var102) {
                            f40160(var103, (SubLObject)UNPROVIDED);
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
            module0642.f39029((SubLObject)UNPROVIDED);
            if (NIL != var71) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_107 = module0015.$g533$.currentBinding(var100);
                try {
                    module0015.$g533$.bind((SubLObject)T, var100);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g371$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)THREE_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_108 = module0015.$g533$.currentBinding(var100);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var100);
                        if (NIL != var97 || NIL != var98 || NIL != var99) {
                            module0642.f39026((SubLObject)TWO_INTEGER);
                        }
                        module0642.f39020(module0015.$g224$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic114$);
                        module0642.f39020(module0015.$g225$.getGlobalValue());
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        SubLObject var102 = var71;
                        SubLObject var103 = (SubLObject)NIL;
                        var103 = var102.first();
                        while (NIL != var102) {
                            f40160(var103, (SubLObject)UNPROVIDED);
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
                module0642.f39029((SubLObject)UNPROVIDED);
            }
        }
        finally {
            module0015.$g533$.rebind(var101, var100);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40160(final SubLObject var100, SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)$ic81$;
        }
        final SubLThread var101 = SubLProcess.currentSubLThread();
        final SubLObject var102 = (SubLObject)((var56 == $ic81$) ? NIL : f40161(var100, var56));
        if (var56 == $ic81$) {
            module0656.f39804(var100, (SubLObject)NIL, (SubLObject)T);
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        else {
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39020(module0015.$g353$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g354$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var103 = module0015.$g533$.currentBinding(var101);
            try {
                module0015.$g533$.bind((SubLObject)T, var101);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_110 = module0015.$g533$.currentBinding(var101);
                try {
                    module0015.$g533$.bind((SubLObject)T, var101);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_111 = module0015.$g533$.currentBinding(var101);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var101);
                        module0642.f39020(module0015.$g459$.getGlobalValue());
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0656.f39804(var100, (SubLObject)NIL, (SubLObject)T);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic115$);
                        module0642.f39020(module0015.$g460$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var4_111, var101);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    if (NIL != var102) {
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_112 = module0015.$g533$.currentBinding(var101);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var101);
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
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var103, var101);
            }
            module0642.f39020(module0015.$g347$.getGlobalValue());
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f40161(final SubLObject var100, final SubLObject var56) {
        final SubLObject var101 = (SubLObject)$ic16$;
        return var101;
    }
    
    public static SubLObject f40151(final SubLObject var113) {
        assert NIL != Types.stringp(var113) : var113;
        if (NIL != module0038.f2684(var113, (SubLObject)$ic116$)) {
            return (SubLObject)T;
        }
        if (NIL != module0038.f2684(var113, (SubLObject)$ic117$)) {
            return (SubLObject)T;
        }
        if (NIL != module0038.f2684(var113, (SubLObject)$ic118$)) {
            return (SubLObject)T;
        }
        if (NIL != module0038.f2684(var113, (SubLObject)$ic119$)) {
            return (SubLObject)T;
        }
        if (NIL != f40152(var113)) {
            return (SubLObject)T;
        }
        if (NIL != module0038.f2694(var113)) {
            return (SubLObject)T;
        }
        if (NIL != module0038.f2684(var113, (SubLObject)$ic120$) && NIL != module0038.f2673(var113, (SubLObject)$ic93$, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40152(final SubLObject var113) {
        assert NIL != Types.stringp(var113) : var113;
        return module0038.f2684(var113, (SubLObject)$ic92$);
    }
    
    public static SubLObject f40150(SubLObject var113, SubLObject var61, SubLObject var114) {
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)T;
        }
        if (var114 == UNPROVIDED) {
            var114 = (SubLObject)NIL;
        }
        final SubLThread var115 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var113) : var113;
        var113 = module0039.f3040(var113);
        var113 = module0038.f2735(var113);
        var61 = module0035.sublisp_boolean(var61);
        if (Sequences.length(var113).numE((SubLObject)ZERO_INTEGER)) {
            return Values.values((SubLObject)NIL, (SubLObject)$ic121$);
        }
        if (NIL != module0038.f2684(var113, (SubLObject)$ic92$)) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL);
        }
        if (NIL != module0655.$g5120$.getDynamicValue(var115) && NIL != module0126.f8389(var113)) {
            final SubLObject var116 = module0126.f8393(var113, Types.sublisp_null(var61), (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != module0035.f1997(var116)) {
                return Values.values(var116, (SubLObject)NIL);
            }
        }
        if (NIL != module0038.f2694(var113)) {
            return Values.values(f40162(var113), (SubLObject)NIL);
        }
        final SubLObject var117 = f40163(var113);
        if (NIL != var117) {
            return Values.values(var117, (SubLObject)NIL);
        }
        if (NIL == module0038.f2684(var113, (SubLObject)$ic122$)) {
            SubLObject var118 = (SubLObject)NIL;
            try {
                var115.throwStack.push($ic123$);
                final SubLObject var119 = Errors.$error_handler$.currentBinding(var115);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic124$), var115);
                    try {
                        if (NIL != module0213.f13915(var113)) {
                            final SubLObject var120 = module0213.f13917(var113);
                            if (NIL != f40166(var120) && var113.equal(module0213.f13918(var120))) {
                                return Values.values((SubLObject)ConsesLow.list(var120), (SubLObject)NIL);
                            }
                        }
                    }
                    catch (Throwable var121) {
                        Errors.handleThrowable(var121, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var119, var115);
                }
            }
            catch (Throwable var122) {
                var118 = Errors.handleThrowable(var122, (SubLObject)$ic123$);
            }
            finally {
                var115.throwStack.pop();
            }
            SubLObject var123 = (SubLObject)NIL;
            if (NIL != module0038.f2684(var113, (SubLObject)$ic126$) && NIL == module0038.f2673(var113, (SubLObject)$ic127$, (SubLObject)UNPROVIDED)) {
                if (NIL != module0038.f2673(var113, (SubLObject)$ic126$, (SubLObject)UNPROVIDED)) {
                    if (Sequences.length(var113).numLE((SubLObject)FOUR_INTEGER)) {
                        return Values.values((SubLObject)NIL, (SubLObject)$ic128$);
                    }
                    var123 = f40167(var113, var61);
                }
                else {
                    if (Sequences.length(var113).numLE((SubLObject)THREE_INTEGER)) {
                        return Values.values((SubLObject)NIL, (SubLObject)$ic129$);
                    }
                    var123 = f40168(var113, var61);
                }
            }
            else if (NIL != module0038.f2673(var113, (SubLObject)$ic126$, (SubLObject)UNPROVIDED) && NIL == module0038.f2673(var113, (SubLObject)$ic127$, (SubLObject)UNPROVIDED)) {
                if (Sequences.length(var113).numLE((SubLObject)TWO_INTEGER)) {
                    return Values.values((SubLObject)NIL, (SubLObject)$ic130$);
                }
                var123 = f40169(var113, var61);
            }
            else if (NIL != module0038.f2635(var113)) {
                final SubLObject var124 = module0038.f2627(var113);
                var123 = f40170(var124, (SubLObject)T);
                if (NIL != module0212.f13762(var124)) {
                    var123 = Sequences.cconcatenate(var123, f40171(var124));
                }
            }
            else {
                var123 = f40172(var113, var61);
            }
            var123 = conses_high.union(var123, module0791.f50540(var113, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var123 = module0035.delete_if_not(Symbols.symbol_function((SubLObject)$ic131$), var123, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var123 = module0213.f13926(var123, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return Values.values(var123, (SubLObject)NIL);
        }
        if (NIL != var114) {
            return Values.values(f40164(var113), (SubLObject)NIL);
        }
        return Values.values(f40165(var113), (SubLObject)NIL);
    }
    
    public static SubLObject f40153(final SubLObject var113, SubLObject var122, SubLObject var123) {
        if (var122 == UNPROVIDED) {
            var122 = (SubLObject)NIL;
        }
        if (var123 == UNPROVIDED) {
            var123 = (SubLObject)$ic85$;
        }
        final SubLThread var124 = SubLProcess.currentSubLThread();
        final SubLObject var125 = (SubLObject)((NIL != $g5207$.getDynamicValue(var124)) ? f40173(var113, var122, var123) : NIL);
        SubLObject var126 = Sequences.length(var125);
        SubLObject var127 = (SubLObject)NIL;
        SubLObject var128 = (SubLObject)NIL;
        SubLObject var129 = (SubLObject)NIL;
        try {
            var124.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var130 = Errors.$error_handler$.currentBinding(var124);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic132$, var124);
                try {
                    var124.resetMultipleValues();
                    final SubLObject var128_129 = f40174(var113, Sequences.cconcatenate(var125, var122), var123);
                    final SubLObject var130_131 = var124.secondMultipleValue();
                    var124.resetMultipleValues();
                    var127 = var128_129;
                    var128 = var130_131;
                }
                catch (Throwable var131) {
                    Errors.handleThrowable(var131, (SubLObject)NIL);
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
        if (NIL != var129) {
            Errors.warn((SubLObject)$ic133$, var129);
        }
        if (NIL != var128) {
            var126 = Numbers.add(var126, var128);
        }
        else {
            var126 = (SubLObject)NIL;
        }
        return Values.values(module0035.delete_if_not(Symbols.symbol_function((SubLObject)$ic131$), Sequences.delete_duplicates(Sequences.cconcatenate(var125, var127), (SubLObject)EQUAL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var126);
    }
    
    public static SubLObject f40174(final SubLObject var113, final SubLObject var122, SubLObject var132) {
        if (var132 == UNPROVIDED) {
            var132 = (SubLObject)NIL;
        }
        final SubLObject var133 = (SubLObject)NIL;
        final SubLObject var134 = (SubLObject)NIL;
        return Values.values(conses_high.set_difference(var133, var122, (SubLObject)EQUAL, (SubLObject)UNPROVIDED), var134);
    }
    
    public static SubLObject f40173(final SubLObject var113, SubLObject var122, SubLObject var123) {
        if (var122 == UNPROVIDED) {
            var122 = (SubLObject)NIL;
        }
        if (var123 == UNPROVIDED) {
            var123 = (SubLObject)NIL;
        }
        SubLObject var124 = (SubLObject)NIL;
        SubLObject var125 = (SubLObject)NIL;
        var124 = Sequences.nreverse(var124);
        var125 = Sequences.length(var124);
        if (var123.isInteger() && NIL != module0035.f2002(var124, var123, (SubLObject)UNPROVIDED)) {
            var124 = module0035.f2124(var123, var124);
        }
        return Values.values(var124, var125);
    }
    
    public static SubLObject f40166(final SubLObject var100) {
        return module0035.sublisp_boolean(module0656.f39932(var100));
    }
    
    public static SubLObject f40165(final SubLObject var113) {
        final SubLObject var114 = module0553.f34183(var113);
        if (NIL != module0167.f10813(var114)) {
            return (SubLObject)ConsesLow.list(var114);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40164(final SubLObject var113) {
        final SubLObject var114 = module0553.f34183(var113);
        if (NIL != var114) {
            return (SubLObject)ConsesLow.list(var114);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40170(final SubLObject var113, SubLObject var133) {
        if (var133 == UNPROVIDED) {
            var133 = (SubLObject)NIL;
        }
        final SubLThread var134 = SubLProcess.currentSubLThread();
        if (NIL != module0018.f984() && var113.isString()) {
            SubLObject var135 = (SubLObject)NIL;
            final SubLObject var136 = $ic134$;
            final SubLObject var137 = (SubLObject)((NIL != constant_handles_oc.f8463(var136, (SubLObject)UNPROVIDED)) ? module0162.f10628(module0161.f10518((SubLObject)ConsesLow.list(var136, $ic135$))) : NIL);
            final SubLObject var138 = module0584.$g4396$.currentBinding(var134);
            try {
                module0584.$g4396$.bind((NIL != var137) ? var137 : module0584.$g4396$.getDynamicValue(var134), var134);
                var135 = module0731.f44799(var113, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != var133) {
                    var135 = ConsesLow.append(var135, module0730.f44560(var113, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                }
            }
            finally {
                module0584.$g4396$.rebind(var138, var134);
            }
            return var135;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40162(final SubLObject var113) {
        return module0126.f8393(var113, (SubLObject)T, (SubLObject)T, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40163(SubLObject var113) {
        if ($ic136$.numE(Sequences.length(var113))) {
            var113 = Sequences.subseq(var113, (SubLObject)THREE_INTEGER, (SubLObject)$ic137$);
        }
        if (NIL != module0035.f1995(var113, (SubLObject)$ic138$, (SubLObject)UNPROVIDED) && NIL != Guids.guid_string_p(var113)) {
            final SubLObject var114 = Guids.string_to_guid(var113);
            if (NIL != var114) {
                return (SubLObject)ConsesLow.list(constants_high_oc.f10751(var114));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40169(final SubLObject var113, SubLObject var61) {
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)NIL;
        }
        return module0126.f8393(Sequences.subseq(var113, (SubLObject)ZERO_INTEGER, Numbers.subtract(Sequences.length(var113), (SubLObject)ONE_INTEGER)), (SubLObject)makeBoolean(NIL == var61), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40167(final SubLObject var113, SubLObject var61) {
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)NIL;
        }
        return module0126.f8400(Sequences.subseq(var113, (SubLObject)ONE_INTEGER, Numbers.subtract(Sequences.length(var113), (SubLObject)ONE_INTEGER)), (SubLObject)makeBoolean(NIL == var61), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40168(final SubLObject var113, SubLObject var61) {
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)NIL;
        }
        return module0126.f8401(Sequences.subseq(var113, (SubLObject)ONE_INTEGER, Sequences.length(var113)), (SubLObject)makeBoolean(NIL == var61), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40172(final SubLObject var113, SubLObject var138) {
        if (var138 == UNPROVIDED) {
            var138 = (SubLObject)T;
        }
        final SubLObject var139 = module0126.f8393(var113, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var140 = module0543.f33693(var113);
        SubLObject var141 = (SubLObject)NIL;
        SubLObject var142 = (SubLObject)NIL;
        var141 = f40170(var113, (SubLObject)UNPROVIDED);
        var142 = Sequences.delete_duplicates(ConsesLow.append(var139, var141, var140), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != module0212.f13762(var113)) {
            var142 = Sequences.cconcatenate(var142, f40171(var113));
        }
        return var142;
    }
    
    public static SubLObject f40171(final SubLObject var113) {
        return module0219.f14508(var113, (SubLObject)T);
    }
    
    public static SubLObject f40175(final SubLObject var143, SubLObject var144) {
        if (var144 == UNPROVIDED) {
            var144 = (SubLObject)NIL;
        }
        final SubLObject var145 = (SubLObject)((NIL != var144) ? NIL : $ic139$);
        final SubLObject var146 = (SubLObject)NIL;
        return var146;
    }
    
    public static SubLObject f40176(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        if (var1.isCons()) {
            SubLObject var3;
            final SubLObject var2 = var3 = var1;
            SubLObject var4 = (SubLObject)NIL;
            SubLObject var5 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var3, var2, (SubLObject)$ic140$);
            var4 = var3.first();
            var3 = (var5 = var3.rest());
            if (var4.isString()) {
                var4 = Strings.string_upcase(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var6 = Packages.find_symbol(var4, (SubLObject)UNPROVIDED);
                if (var6.isSymbol() && NIL != Symbols.fboundp(var6) && NIL != module0015.f874(var6)) {
                    return Functions.funcall(var6, var5);
                }
            }
        }
        module0677.f41328();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40177(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        return f40154(var1.first());
    }
    
    public static SubLObject f40178(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        return f40154(var1.first());
    }
    
    public static SubLObject f40179(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        return f40154(var1.first());
    }
    
    public static SubLObject f40180(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        return f40154(var1.first());
    }
    
    public static SubLObject f40181(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        return f40154(var1.first());
    }
    
    public static SubLObject f40154(final SubLObject var151) {
        final SubLThread var152 = SubLProcess.currentSubLThread();
        final SubLObject var153 = module0656.f39957(var151, (SubLObject)UNPROVIDED);
        if (NIL != var153) {
            if (NIL != module0167.f10813(var153)) {
                module0677.f41360(var153);
            }
            else if (NIL != module0210.f13595(var153, (SubLObject)UNPROVIDED)) {
                if (NIL == module0167.f10813(module0172.f10921(var153))) {
                    module0677.f41360(var153);
                }
            }
            else {
                module0658.f40054(var153);
                module0677.f41359(var153);
            }
            final SubLObject var154 = module0656.f39932(var153);
            module0642.f39020((SubLObject)$ic0$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0589.f35880();
            if (NIL != module0015.f713()) {
                Errors.error((SubLObject)$ic4$);
            }
            module0642.f39020(module0015.$g415$.getGlobalValue());
            module0642.f39020(module0015.$g417$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic147$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var155 = module0015.$g533$.currentBinding(var152);
            try {
                module0015.$g533$.bind((SubLObject)T, var152);
                module0656.f39836((SubLObject)$ic148$, var154, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0656.f39836((SubLObject)$ic149$, var154, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var155, var152);
            }
            module0642.f39020(module0015.$g416$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        else {
            module0656.f39789((SubLObject)$ic150$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40182(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0656.f39969(var1);
        if ($ic153$ == $g5208$.getDynamicValue(var2) && NIL != module0212.f13762(var3)) {
            module0669.f40606(var3);
        }
        else if ($ic151$ == $g5208$.getDynamicValue(var2) && NIL != module0212.f13762(var3)) {
            module0670.f40910(var3);
        }
        else if (NIL != var3) {
            module0669.f40606(var3);
        }
        else {
            final SubLObject var4 = module0656.f39950(var1.first(), (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic0$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            final SubLObject var5 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_155 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0663.f40325(var4);
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var4_155, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var5, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40183() {
        module0642.f39019((SubLObject)$ic155$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40184(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        final SubLObject var2 = module0656.f39969(var1);
        if (NIL != module0173.f10955(var2) || NIL != module0223.f14667(var2)) {
            f40185(var2);
        }
        else {
            final SubLObject var3 = module0656.f39950(var1.first(), (SubLObject)UNPROVIDED);
            f40185(var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40185(final SubLObject var100) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        if (NIL != module0210.f13595(var100, (SubLObject)UNPROVIDED)) {
            return module0663.f40328(var100);
        }
        if ($ic157$ == module0655.$g5079$.getDynamicValue(var101)) {
            return module0742.f45920(var100, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var102 = module0655.$g5079$.getDynamicValue(var101);
        if (var102.eql((SubLObject)$ic158$)) {
            return f40186(var100);
        }
        if (var102.eql((SubLObject)$ic159$)) {
            return module0669.f40718(var100);
        }
        if (var102.eql((SubLObject)$ic160$)) {
            return module0669.f40699(var100);
        }
        if (var102.eql((SubLObject)$ic161$)) {
            return f40187(var100);
        }
        return module0669.f40699(var100);
    }
    
    public static SubLObject f40186(final SubLObject var153) {
        final SubLThread var154 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)$ic0$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var154), module0655.$g5142$.getDynamicValue(var154));
        final SubLObject var155 = module0014.f672((SubLObject)$ic1$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic2$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var155) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var155);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic3$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)$ic162$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var156 = module0015.$g535$.currentBinding(var154);
        try {
            module0015.$g535$.bind((SubLObject)T, var154);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_157 = module0015.$g533$.currentBinding(var154);
            try {
                module0015.$g533$.bind((SubLObject)T, var154);
                f40188(var153);
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var4_157, var154);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var156, var154);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40188(final SubLObject var153) {
        module0642.f39026((SubLObject)TWO_INTEGER);
        module0642.f39020(module0015.$g187$.getGlobalValue());
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic163$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39020(module0015.$g188$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40187(final SubLObject var158) {
        final SubLThread var159 = SubLProcess.currentSubLThread();
        if (NIL == module0655.$g5080$.getDynamicValue(var159) || module0617.f37893(var158).numL(module0655.$g5080$.getDynamicValue(var159))) {
            return module0669.f40732((SubLObject)ConsesLow.list(var158));
        }
        if (module0217.f14357(var158).numL(module0655.$g5080$.getDynamicValue(var159))) {
            return module0669.f40738((SubLObject)ConsesLow.list(var158));
        }
        final SubLObject var160 = (SubLObject)((NIL != module0269.f17715(var158)) ? module0217.f14247(var158, (SubLObject)UNPROVIDED) : ZERO_INTEGER);
        final SubLObject var161 = (SubLObject)((NIL != module0269.f17723(var158)) ? module0217.f14257(var158) : ZERO_INTEGER);
        if ((var160.numG((SubLObject)ZERO_INTEGER) || var161.numG((SubLObject)ZERO_INTEGER)) && Numbers.add(module0217.f14221(var158, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var160, var161).numL(module0655.$g5080$.getDynamicValue(var159))) {
            module0669.f40788((SubLObject)ConsesLow.list(var158));
            return (SubLObject)NIL;
        }
        if (module0217.f14221(var158, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).numL(module0655.$g5080$.getDynamicValue(var159))) {
            return module0669.f40757((SubLObject)ConsesLow.list(var158));
        }
        if (module0217.f14221(var158, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).numL(module0655.$g5080$.getDynamicValue(var159))) {
            return module0669.f40757((SubLObject)ConsesLow.list(var158, (SubLObject)$ic164$));
        }
        return module0669.f40717((SubLObject)ConsesLow.list(var158));
    }
    
    public static SubLObject f40189(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        f40190((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40190(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)$ic0$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        if (NIL != module0655.$g5091$.getDynamicValue(var2)) {
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var3 = module0014.f672((SubLObject)$ic1$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic2$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var3) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var3);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic3$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0642.f39055(module0655.$g5091$.getDynamicValue(var2));
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        final SubLObject var4 = module0015.$g535$.currentBinding(var2);
        try {
            module0015.$g535$.bind((SubLObject)T, var2);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_161 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)T, var2);
                f40191();
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var4_161, var2);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var4, var2);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40192(SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (NIL == var9) {
            var9 = (SubLObject)$ic28$;
        }
        final SubLObject var11 = module0656.f39832((SubLObject)$ic8$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic166$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var11) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var11);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var12 = module0015.$g533$.currentBinding(var10);
        try {
            module0015.$g533$.bind((SubLObject)T, var10);
            module0642.f39019(var9);
        }
        finally {
            module0015.$g533$.rebind(var12, var10);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40193() {
        return module0644.f39183(module0656.f39832((SubLObject)$ic8$));
    }
    
    public static SubLObject f40194(final SubLObject var162, final SubLObject var163) {
        final SubLObject var164 = var162.rest();
        final SubLObject var166;
        final SubLObject var165 = var166 = var164;
        return (SubLObject)ConsesLow.list((SubLObject)$ic169$, (SubLObject)$ic170$, (SubLObject)ConsesLow.listS((SubLObject)$ic171$, (SubLObject)$ic172$, ConsesLow.append(var166, (SubLObject)NIL)));
    }
    
    public static SubLObject f40191() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var3 = module0015.$g533$.currentBinding(var2);
        try {
            module0015.$g533$.bind((SubLObject)T, var2);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_167 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)T, var2);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39046(module0015.$g369$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic39$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_168 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    f40195();
                }
                finally {
                    module0015.$g533$.rebind(var4_168, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_169 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39032((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var4_169, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39046(module0015.$g369$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic39$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_170 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    f40196();
                }
                finally {
                    module0015.$g533$.rebind(var4_170, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_171 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39032((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var4_171, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39046(module0015.$g369$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic39$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_172 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    f40197();
                }
                finally {
                    module0015.$g533$.rebind(var4_172, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_173 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39032((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var4_173, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39046(module0015.$g369$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic39$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_174 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    f40198();
                }
                finally {
                    module0015.$g533$.rebind(var4_174, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_175 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39032((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var4_175, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39046(module0015.$g369$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic39$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_176 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    f40199();
                }
                finally {
                    module0015.$g533$.rebind(var4_176, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                if (NIL != f40200()) {
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_177 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39032((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_177, var2);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39046(module0015.$g369$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic39$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_178 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        f40201();
                    }
                    finally {
                        module0015.$g533$.rebind(var4_178, var2);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                if (NIL != f40202()) {
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_179 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39032((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_179, var2);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39046(module0015.$g369$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic39$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_180 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        f40203();
                    }
                    finally {
                        module0015.$g533$.rebind(var4_180, var2);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                if (NIL != f40204()) {
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_181 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39032((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_181, var2);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39046(module0015.$g369$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic39$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_182 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        f40205();
                    }
                    finally {
                        module0015.$g533$.rebind(var4_182, var2);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                if (NIL != f40206()) {
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_183 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39032((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_183, var2);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39046(module0015.$g369$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic39$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_184 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        f40207();
                    }
                    finally {
                        module0015.$g533$.rebind(var4_184, var2);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_185 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39032((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var4_185, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39046(module0015.$g369$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic39$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_186 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    f40208();
                }
                finally {
                    module0015.$g533$.rebind(var4_186, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_187 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39032((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var4_187, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39046(module0015.$g369$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic74$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_188 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39019((SubLObject)$ic173$);
                    module0642.f39020(module0015.$g381$.getGlobalValue());
                    module0642.f39020(module0015.$g383$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic174$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g387$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic175$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_189 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39019((SubLObject)$ic176$);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_189, var2);
                    }
                    module0642.f39020(module0015.$g382$.getGlobalValue());
                    module0642.f39027((SubLObject)$ic40$, (SubLObject)UNPROVIDED);
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
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var3, var2);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40195() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != module0655.$g5077$.getDynamicValue(var2)) {
            module0656.f39869((SubLObject)$ic177$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40196() {
        module0656.f39837((SubLObject)$ic167$, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40197() {
        module0656.f39837((SubLObject)$ic179$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        final SubLObject var190 = module0574.f35126();
        final SubLObject var191 = module0574.f35170(var190);
        module0642.f39019(var191);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40198() {
        module0656.f39837((SubLObject)$ic180$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0642.f39019(module0593.f36286());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40199() {
        module0642.f39021((SubLObject)$ic181$);
        module0642.f39019(module0018.f971());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40200() {
        return (SubLObject)makeBoolean(module0574.f35163().isPositive() || NIL != module0574.f35132());
    }
    
    public static SubLObject f40201() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0574.f35163();
        final SubLObject var4 = module0572.f35062((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var2);
        try {
            module0015.$g533$.bind((SubLObject)T, var2);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_194 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)T, var2);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39046(module0015.$g369$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_195 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39020(module0015.$g149$.getGlobalValue());
                    module0642.f39020(module0015.$g159$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic16$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_196 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39021((SubLObject)$ic182$);
                        module0642.f39019((SubLObject)$ic122$);
                        if (var3.eql(var4)) {
                            module0642.f39019((SubLObject)$ic183$);
                        }
                        module0642.f39019(var3);
                        if (!var3.eql(var4)) {
                            module0642.f39019((SubLObject)$ic184$);
                            module0642.f39019((SubLObject)((NIL != var4) ? var4 : $ic185$));
                        }
                        module0642.f39019((SubLObject)$ic15$);
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
            module0642.f39029((SubLObject)UNPROVIDED);
            if (var4.isNumber() && !var3.eql(var4)) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_197 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g375$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic71$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_198 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
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
                        final SubLObject var4_199 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var2);
                            var2.resetMultipleValues();
                            final SubLObject var6 = module0642.f39095(var3, var4, (SubLObject)NIL);
                            final SubLObject var7 = var2.secondMultipleValue();
                            var2.resetMultipleValues();
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39020(module0015.$g367$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_200 = module0015.$g533$.currentBinding(var2);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var2);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                if (NIL != module0015.$g504$.getGlobalValue()) {
                                    module0642.f39020(module0015.$g374$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g504$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                if (NIL != var6) {
                                    module0642.f39020(module0015.$g375$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var6);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_201 = module0015.$g533$.currentBinding(var2);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var2);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_201, var2);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                if (NIL != module0015.$g502$.getGlobalValue()) {
                                    module0642.f39020(module0015.$g374$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g502$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                if (NIL != var7) {
                                    module0642.f39020(module0015.$g375$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var7);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_202 = module0015.$g533$.currentBinding(var2);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var2);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
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
                module0642.f39029((SubLObject)UNPROVIDED);
            }
        }
        finally {
            module0015.$g533$.rebind(var5, var2);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
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
        if (NIL != module0575.f35244()) {
            module0642.f39019((SubLObject)$ic186$);
        }
        else {
            module0656.f39837((SubLObject)$ic187$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0642.f39032((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        if (var3.isPositive() || var4.isPositive()) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic188$, var3);
            if (var4.numG((SubLObject)ZERO_INTEGER)) {
                final SubLObject var6 = (SubLObject)$ic189$;
                module0642.f39020(module0015.$g219$.getGlobalValue());
                if (NIL != var6) {
                    module0642.f39020(module0015.$g222$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(var6));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var7 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic190$, var4);
                }
                finally {
                    module0015.$g533$.rebind(var7, var2);
                }
                module0642.f39020(module0015.$g220$.getGlobalValue());
            }
            else {
                PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic190$, var4);
            }
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic191$, var5);
        }
        else {
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic192$, var5);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40204() {
        return (SubLObject)makeBoolean(module0575.f35267().isPositive() || module0574.f35142().isPositive());
    }
    
    public static SubLObject f40205() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0575.f35267();
        final SubLObject var4 = module0574.f35142();
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic193$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        if (var3.isPositive()) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic194$, var3, var4);
        }
        else {
            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic192$, var4);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40206() {
        return Numbers.plusp(module0575.f35272());
    }
    
    public static SubLObject f40207() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0575.f35272();
        module0642.f39021((SubLObject)$ic195$);
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic192$, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40208() {
        module0656.f39837((SubLObject)$ic196$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0642.f39019(module0011.f351());
        return (SubLObject)NIL;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40210() {
        $g5199$ = SubLFiles.deflexical("S#44256", (SubLObject)$ic13$);
        $g5200$ = SubLFiles.defparameter("S#44257", module0073.f5143((SubLObject)($ic24$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic24$) : $ic24$), (SubLObject)$ic25$, (SubLObject)(NIL.isSymbol() ? Symbols.symbol_value((SubLObject)NIL) : NIL), (SubLObject)$ic26$, (SubLObject)UNPROVIDED));
        $g5202$ = SubLFiles.deflexical("S#44258", (SubLObject)$ic50$);
        $g5203$ = SubLFiles.deflexical("S#44259", (SubLObject)$ic51$);
        $g5204$ = SubLFiles.deflexical("S#44260", (SubLObject)$ic58$);
        $g5205$ = SubLFiles.deflexical("S#44261", (SubLObject)$ic59$);
        $g5206$ = SubLFiles.defparameter("S#44262", (SubLObject)T);
        $g5207$ = SubLFiles.defparameter("S#44263", (SubLObject)NIL);
        $g5208$ = SubLFiles.defvar("S#44264", (SubLObject)$ic151$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40211() {
        module0015.f873((SubLObject)$ic12$);
        module0656.f39840((SubLObject)$ic22$, (SubLObject)$ic23$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic27$);
        module0656.f39840((SubLObject)$ic6$, (SubLObject)$ic30$, (SubLObject)ONE_INTEGER);
        Hashtables.sethash((SubLObject)$ic31$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic32$, (SubLObject)$ic33$));
        Hashtables.sethash((SubLObject)$ic34$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic35$, (SubLObject)$ic36$));
        Hashtables.sethash((SubLObject)$ic37$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic38$, (SubLObject)NIL));
        module0012.f441((SubLObject)$ic60$);
        module0012.f444((SubLObject)$ic60$);
        module0656.f39840((SubLObject)$ic78$, (SubLObject)$ic79$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic89$);
        module0015.f873((SubLObject)$ic141$);
        module0015.f873((SubLObject)$ic142$);
        module0015.f873((SubLObject)$ic143$);
        module0015.f873((SubLObject)$ic144$);
        module0015.f873((SubLObject)$ic145$);
        module0015.f873((SubLObject)$ic146$);
        module0012.f441((SubLObject)$ic152$);
        module0012.f444((SubLObject)$ic152$);
        module0015.f873((SubLObject)$ic154$);
        module0015.f873((SubLObject)$ic156$);
        module0015.f873((SubLObject)$ic165$);
        module0656.f39840((SubLObject)$ic167$, (SubLObject)$ic168$, (SubLObject)ONE_INTEGER);
        Hashtables.sethash((SubLObject)$ic177$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic178$, (SubLObject)NIL));
        return (SubLObject)NIL;
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
        $g5199$ = null;
        $g5200$ = null;
        $g5202$ = null;
        $g5203$ = null;
        $g5204$ = null;
        $g5205$ = null;
        $g5206$ = null;
        $g5207$ = null;
        $g5208$ = null;
        $ic0$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic1$ = makeKeyword("CB-CYC");
        $ic2$ = makeString("stylesheet");
        $ic3$ = makeString("text/css");
        $ic4$ = makeString("Cannot have a FRAMESET tag inside a BODY tag.");
        $ic5$ = makeString("75,*,50");
        $ic6$ = makeKeyword("TOOLBAR");
        $ic7$ = makeKeyword("MAIN");
        $ic8$ = makeKeyword("STATUS");
        $ic9$ = makeString("You must have frames enabled to use Cyc.  Please either enable frames in your web browser or disable frame support in the Cyc browser at the ");
        $ic10$ = makeKeyword("OPTIONS");
        $ic11$ = makeString(" page.");
        $ic12$ = makeSymbol("CB-START");
        $ic13$ = makeString("OpenCyc");
        $ic14$ = makeString(" (");
        $ic15$ = makeString(")");
        $ic16$ = makeString("");
        $ic17$ = makeString(" - ");
        $ic18$ = makeString("~A~A~A");
        $ic19$ = makeString("KB Browser");
        $ic20$ = makeKeyword("TOP");
        $ic21$ = makeString("cb-start");
        $ic22$ = makeKeyword("START");
        $ic23$ = makeSymbol("S#44199", "CYC");
        $ic24$ = ConsesLow.list((SubLObject)makeString("system.common.browser.tools.cb-toolbar-restrict-to-user-tools?"));
        $ic25$ = makeSymbol("S#44257", "CYC");
        $ic26$ = makeKeyword("PARAMETER");
        $ic27$ = makeSymbol("CB-TOOLBAR-FRAME");
        $ic28$ = makeString("Update");
        $ic29$ = makeString("cb-toolbar-frame");
        $ic30$ = makeSymbol("S#44200", "CYC");
        $ic31$ = makeKeyword("OPENCYC-60");
        $ic32$ = makeString("opencyc-logo-60.gif");
        $ic33$ = makeString("OpenCyc Browser");
        $ic34$ = makeKeyword("RESEARCHCYC-60");
        $ic35$ = makeString("cyc-logo-violet-60.gif");
        $ic36$ = makeString("ResearchCyc Browser");
        $ic37$ = makeKeyword("CB-TOOLBAR-FRAME");
        $ic38$ = makeString("cb-toolbar-frame.html");
        $ic39$ = makeKeyword("LEFT");
        $ic40$ = makeKeyword("NBSP");
        $ic41$ = makeString("50%");
        $ic42$ = makeString("You are: ");
        $ic43$ = makeKeyword("LOGOUT");
        $ic44$ = makeString("Server: ");
        $ic45$ = makeString("unknown");
        $ic46$ = makeString(":");
        $ic47$ = makeString("...");
        $ic48$ = makeString("Purpose: ");
        $ic49$ = makeKeyword("TOOLS");
        $ic50$ = makeInteger(25);
        $ic51$ = ConsesLow.list((SubLObject)makeKeyword("HISTORY"), (SubLObject)makeKeyword("CREATE"), (SubLObject)makeKeyword("ASSERT"), (SubLObject)makeKeyword("COMPOSE"), (SubLObject)makeKeyword("QUERY"), (SubLObject)makeKeyword("DOC"));
        $ic52$ = makeSymbol("FUNCTION-SPEC-P");
        $ic53$ = makeSymbol("S#43809", "CYC");
        $ic54$ = makeSymbol("STRINGP");
        $ic55$ = makeSymbol("S#43797", "CYC");
        $ic56$ = makeSymbol("STRING<");
        $ic57$ = makeKeyword("CENTER");
        $ic58$ = ConsesLow.list((SubLObject)makeString("No gloss"), (SubLObject)makeString("CycL gloss"));
        $ic59$ = ConsesLow.list((SubLObject)makeSymbol("NONE"), (SubLObject)makeSymbol("S#42702", "CYC"));
        $ic60$ = makeSymbol("S#44262", "CYC");
        $ic61$ = makeString("98%");
        $ic62$ = makeString("cb-handle-specify");
        $ic63$ = makeString("handler");
        $ic64$ = makeString("cb-cf");
        $ic65$ = makeString("arg-done");
        $ic66$ = makeString("constant-complete");
        $ic67$ = makeString("autocomplete");
        $ic68$ = makeString("query");
        $ic69$ = makeString("completeContainer");
        $ic70$ = makeString("inputBox");
        $ic71$ = makeInteger(50);
        $ic72$ = constant_handles_oc.f8479((SubLObject)makeString("Thing"));
        $ic73$ = makeString("Search");
        $ic74$ = makeKeyword("RIGHT");
        $ic75$ = makeKeyword("CYC-MAIN");
        $ic76$ = makeString("cb-handle-specify&query=~A&everything=t");
        $ic77$ = makeString("~A results");
        $ic78$ = makeKeyword("CB-SPECIFY-ALL");
        $ic79$ = makeSymbol("S#44206", "CYC");
        $ic80$ = makeString("gloss-required");
        $ic81$ = makeSymbol("NONE");
        $ic82$ = makeString("lucky");
        $ic83$ = makeString("case-insensitive");
        $ic84$ = makeString("everything");
        $ic85$ = makeInteger(100);
        $ic86$ = makeSymbol("VALID-CONSTANT-NAME-CHAR-P");
        $ic87$ = makeString("Can't determine a Cyc term from ~s.");
        $ic88$ = makeString("Please enter a non-empty string.");
        $ic89$ = makeSymbol("CB-HANDLE-SPECIFY");
        $ic90$ = makeSymbol("ASSERTION-P");
        $ic91$ = makeString("WordNet search results for \"");
        $ic92$ = makeString("wn ");
        $ic93$ = makeString("\"");
        $ic94$ = makeString("Search results for \"");
        $ic95$ = makeString("~A matching term found:");
        $ic96$ = makeString("~A matching terms found:");
        $ic97$ = makeString("~A matching WordNet synsets found:");
        $ic98$ = makeString("No matching WordNet synsets found:");
        $ic99$ = makeString("No matching terms found.");
        $ic100$ = makeString("See also:");
        $ic101$ = makeString("But see:");
        $ic102$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic103$ = makeKeyword("HTML");
        $ic104$ = makeKeyword("NEW");
        $ic105$ = makeString(" (1-~A of approximately ");
        $ic106$ = makeSymbol("S#747", "CYC");
        $ic107$ = makeSymbol("NAUT-P");
        $ic108$ = makeSymbol("S#17581", "CYC");
        $ic109$ = makeSymbol("S#20292", "CYC");
        $ic110$ = makeSymbol("ASSERTION-CONS");
        $ic111$ = makeString("Collections");
        $ic112$ = makeString("Relations");
        $ic113$ = makeString("Individuals");
        $ic114$ = makeString("Assertions");
        $ic115$ = makeString(": ");
        $ic116$ = makeString("a ");
        $ic117$ = makeString("d ");
        $ic118$ = makeString("c ");
        $ic119$ = makeString("n ");
        $ic120$ = makeString("#G\"");
        $ic121$ = makeString("Empty string results in no constants found.");
        $ic122$ = makeString("(");
        $ic123$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic124$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic125$ = makeSymbol("S#5859", "CYC");
        $ic126$ = makeString("*");
        $ic127$ = makeString(".*");
        $ic128$ = makeString("Cannot handle pattern *[string]* if [string] is under 5 characters.");
        $ic129$ = makeString("Cannot handle pattern *[string] if [string] is under 4 characters.");
        $ic130$ = makeString("Cannot handle pattern [string]* if [string] is under 3 characters.");
        $ic131$ = makeSymbol("S#44220", "CYC");
        $ic132$ = makeSymbol("S#38", "CYC");
        $ic133$ = makeString("Unable to access subword-index: ~S");
        $ic134$ = constant_handles_oc.f8479((SubLObject)makeString("AllLexicalMicrotheoryPSC"));
        $ic135$ = constant_handles_oc.f8479((SubLObject)makeString("AnytimePSC"));
        $ic136$ = makeInteger(40);
        $ic137$ = makeInteger(39);
        $ic138$ = makeInteger(36);
        $ic139$ = ConsesLow.list((SubLObject)makeKeyword("CASELESS"));
        $ic140$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#43984", "CYC"), (SubLObject)makeSymbol("S#43985", "CYC"));
        $ic141$ = makeSymbol("CB-MAIN-FRAME");
        $ic142$ = makeSymbol("CB-CF");
        $ic143$ = makeSymbol("CB-CONSTANT-FRAME");
        $ic144$ = makeSymbol("CB-NF");
        $ic145$ = makeSymbol("CB-NART-FRAME");
        $ic146$ = makeSymbol("CB-NAUT-FRAME");
        $ic147$ = makeString("30%,*");
        $ic148$ = makeKeyword("INDEX");
        $ic149$ = makeKeyword("CONTENT");
        $ic150$ = makeString("The requested term is not available.");
        $ic151$ = makeKeyword("INFERRED");
        $ic152$ = makeSymbol("S#44264", "CYC");
        $ic153$ = makeKeyword("LEGACY");
        $ic154$ = makeSymbol("CB-INDEX-FRAME");
        $ic155$ = makeString("No Index");
        $ic156$ = makeSymbol("CB-CONTENT-FRAME");
        $ic157$ = makeKeyword("LEXICAL");
        $ic158$ = makeKeyword("NONE");
        $ic159$ = makeKeyword("DEFINITIONAL");
        $ic160$ = makeKeyword("DOCUMENTATION");
        $ic161$ = makeKeyword("MAXIMAL");
        $ic162$ = makeString("Index Choose");
        $ic163$ = makeString("Choose an item from the index.");
        $ic164$ = makeString("1");
        $ic165$ = makeSymbol("CB-STATUS-FRAME");
        $ic166$ = makeString("cb-status-frame");
        $ic167$ = makeKeyword("SERVER-STATUS");
        $ic168$ = makeSymbol("S#44238", "CYC");
        $ic169$ = makeSymbol("PROGN");
        $ic170$ = ConsesLow.list((SubLObject)makeSymbol("S#1024", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1516", "CYC")));
        $ic171$ = makeSymbol("S#1023", "CYC");
        $ic172$ = ConsesLow.list((SubLObject)makeKeyword("ALIGN"), (SubLObject)makeKeyword("LEFT"), (SubLObject)makeKeyword("VALIGN"), (SubLObject)makeKeyword("TOP"), (SubLObject)makeKeyword("NOWRAP"), (SubLObject)T);
        $ic173$ = makeString("Learn about ");
        $ic174$ = makeString("http://research.cyc.com/upgrade_from_opencyc");
        $ic175$ = makeString("_researchcyc");
        $ic176$ = makeString("ResearchCyc");
        $ic177$ = makeKeyword("CB-SERVER-STATUS");
        $ic178$ = makeString("cb-server-status.html");
        $ic179$ = makeKeyword("MODE");
        $ic180$ = makeKeyword("AGENDA");
        $ic181$ = makeString("KB: ");
        $ic182$ = makeString("Remote: ");
        $ic183$ = makeString("all ");
        $ic184$ = makeString(" of ");
        $ic185$ = makeString("???");
        $ic186$ = makeString("Local:");
        $ic187$ = makeKeyword("SHOW-LOCAL-OPS");
        $ic188$ = makeString("(~d ");
        $ic189$ = makeKeyword("RED");
        $ic190$ = makeString("~d");
        $ic191$ = makeString(" ~d)");
        $ic192$ = makeString("(~d)");
        $ic193$ = makeString("Aux: ");
        $ic194$ = makeString("(~d ~d)");
        $ic195$ = makeString("Transmit Pending: ");
        $ic196$ = makeKeyword("SYSTEM");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1565 ms
	
	Decompiled with Procyon 0.5.32.
*/