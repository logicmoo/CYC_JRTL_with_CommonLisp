package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0698 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0698";
    public static final String myFingerPrint = "28d572cdfb72313562c27b6738b25949dccb78a4c93f1387b415c834fbc61d09";
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLObject $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLInteger $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLString $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLInteger $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLList $ic105$;
    
    public static SubLObject f42508(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        return f42509();
    }
    
    public static SubLObject f42510(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL == var2) {
            var2 = (SubLObject)$ic11$;
        }
        final SubLObject var4 = module0656.f39832((SubLObject)$ic12$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic13$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var4) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var4);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)T, var3);
            module0642.f39019(var2);
        }
        finally {
            module0015.$g533$.rebind(var5, var3);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42509() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = (SubLObject)$ic20$;
        final SubLObject var5 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
            module0642.f39020((SubLObject)$ic21$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var6 = module0014.f672((SubLObject)$ic22$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic23$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var6) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var6);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic24$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var4) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var4);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var5_8 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic27$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_9 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic28$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_10 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic29$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic30$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic31$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_10, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var4) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var4);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_11 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var7 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var8 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0015.$g541$.bind((SubLObject)T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0656.f39870((SubLObject)$ic18$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0656.f39837((SubLObject)$ic32$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        f42511();
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var8, var3);
                        module0015.$g541$.rebind(var7, var3);
                        module0015.$g533$.rebind(var5_11, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var5_9, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var5_8, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var5, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42511() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g282$.getGlobalValue());
        module0642.f39020(module0015.$g284$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic33$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g285$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic34$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0015.$g533$.currentBinding(var3);
        final SubLObject var5 = module0015.$g541$.currentBinding(var3);
        final SubLObject var6 = module0015.$g539$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)T, var3);
            module0015.$g541$.bind((SubLObject)T, var3);
            module0015.$g539$.bind(module0015.f797(), var3);
            module0642.f39069((SubLObject)$ic35$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            module0642.f39026((SubLObject)TWO_INTEGER);
            module0642.f39074((SubLObject)$ic36$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39026((SubLObject)TWO_INTEGER);
            module0642.f39019((SubLObject)$ic37$);
            module0642.f39026((SubLObject)TWO_INTEGER);
            SubLObject var7 = f42512();
            module0642.f39020(module0015.$g207$.getGlobalValue());
            module0642.f39019((SubLObject)$ic38$);
            module0642.f39020(module0015.$g208$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            if (NIL != var7) {
                SubLObject var8 = var7;
                SubLObject var9 = (SubLObject)NIL;
                var9 = var8.first();
                while (NIL != var8) {
                    module0642.f39068(module0656.f39842(var9), (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)TWO_INTEGER);
                    module0656.f39804(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39026((SubLObject)UNPROVIDED);
                    var8 = var8.rest();
                    var9 = var8.first();
                }
            }
            else {
                module0642.f39019((SubLObject)$ic39$);
            }
            module0642.f39026((SubLObject)TWO_INTEGER);
            module0642.f39020(module0015.$g207$.getGlobalValue());
            module0642.f39019((SubLObject)$ic40$);
            module0642.f39020(module0015.$g208$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            var7 = f42513();
            if (NIL != var7) {
                SubLObject var8 = var7;
                SubLObject var9 = (SubLObject)NIL;
                var9 = var8.first();
                while (NIL != var8) {
                    module0642.f39068(module0656.f39842(var9), (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)TWO_INTEGER);
                    module0656.f39804(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39026((SubLObject)UNPROVIDED);
                    var8 = var8.rest();
                    var9 = var8.first();
                }
            }
            else {
                module0642.f39019((SubLObject)$ic39$);
            }
            module0642.f39026((SubLObject)TWO_INTEGER);
            module0642.f39074((SubLObject)$ic36$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39026((SubLObject)TWO_INTEGER);
            module0015.f799(module0015.$g539$.getDynamicValue(var3));
        }
        finally {
            module0015.$g539$.rebind(var6, var3);
            module0015.$g541$.rebind(var5, var3);
            module0015.$g533$.rebind(var4, var3);
        }
        module0642.f39020(module0015.$g283$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42512() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0655.$g5083$.setDynamicValue(module0035.delete_if_not(Symbols.symbol_function((SubLObject)$ic41$), module0655.$g5083$.getDynamicValue(var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
        return conses_high.copy_list(module0655.$g5083$.getDynamicValue(var3));
    }
    
    public static SubLObject f42513() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0655.$g5085$.setDynamicValue(module0035.delete_if_not(Symbols.symbol_function((SubLObject)$ic42$), module0655.$g5085$.getDynamicValue(var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
        return conses_high.copy_list(module0655.$g5085$.getDynamicValue(var3));
    }
    
    public static SubLObject f42514(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic43$);
            return (SubLObject)NIL;
        }
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = var1;
        SubLObject var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            if (var5.isList()) {
                final SubLObject var6 = var5.first();
                final SubLObject var7 = module0656.f39943(var6, (SubLObject)UNPROVIDED);
                if (NIL != module0173.f10955(var7)) {
                    var3 = (SubLObject)ConsesLow.cons(var7, var3);
                }
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        var3 = Sequences.nreverse(Sequences.remove_duplicates(var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        if (NIL == var3.rest()) {
            module0656.f39789((SubLObject)$ic44$, var3.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        final SubLObject var8 = (SubLObject)$ic17$;
        final SubLObject var9 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2);
            module0642.f39020((SubLObject)$ic21$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var10 = module0014.f672((SubLObject)$ic22$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic23$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var10) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var10);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic24$);
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
            final SubLObject var5_21 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var2)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic27$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_22 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic28$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_23 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic29$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic30$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic31$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_23, var2);
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
                    module0656.f39870((SubLObject)$ic18$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                    module0642.f39027((SubLObject)$ic45$, (SubLObject)UNPROVIDED);
                    module0642.f39019((SubLObject)$ic46$);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic47$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic34$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g287$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic48$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_24 = module0015.$g533$.currentBinding(var2);
                    final SubLObject var11 = module0015.$g541$.currentBinding(var2);
                    final SubLObject var12 = module0015.$g539$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0015.$g541$.bind((SubLObject)T, var2);
                        module0015.$g539$.bind(module0015.f797(), var2);
                        module0642.f39069((SubLObject)$ic49$, (SubLObject)$ic50$, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic29$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic51$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
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
                        final SubLObject var5_25 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var2);
                            f42515(var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var5_25, var2);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39074((SubLObject)$ic52$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        f42516();
                        module0015.f799(module0015.$g539$.getDynamicValue(var2));
                    }
                    finally {
                        module0015.$g539$.rebind(var12, var2);
                        module0015.$g541$.rebind(var11, var2);
                        module0015.$g533$.rebind(var5_24, var2);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var5_22, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var5_21, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var9, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42517(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var28 = module0015.$g533$.currentBinding(var27);
        try {
            module0015.$g533$.bind((SubLObject)T, var27);
        }
        finally {
            module0015.$g533$.rebind(var28, var27);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        SubLObject var29 = module0015.$g491$.getGlobalValue();
        SubLObject var30 = (SubLObject)NIL;
        if (var26.numG((SubLObject)ZERO_INTEGER)) {
            SubLObject var31;
            SubLObject var32;
            for (var31 = (SubLObject)NIL, var31 = (SubLObject)ZERO_INTEGER; var31.numL(var26); var31 = Numbers.add(var31, (SubLObject)ONE_INTEGER)) {
                if (NIL != module0655.$g5111$.getDynamicValue(var27)) {
                    var29 = ((NIL != var30) ? module0015.$g491$.getGlobalValue() : module0015.$g492$.getGlobalValue());
                    if (NIL != var30) {
                        var30 = (SubLObject)NIL;
                    }
                    else {
                        var30 = (SubLObject)T;
                    }
                }
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic54$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var29) {
                    module0642.f39020(module0015.$g374$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var29);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                var32 = module0015.$g533$.currentBinding(var27);
                try {
                    module0015.$g533$.bind((SubLObject)T, var27);
                    module0642.f39020((SubLObject)$ic55$);
                }
                finally {
                    module0015.$g533$.rebind(var32, var27);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42518(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        final SubLObject var32 = Numbers.add((SubLObject)ONE_INTEGER, Sequences.length(var30));
        SubLObject var33 = (SubLObject)ZERO_INTEGER;
        SubLObject var34 = var30;
        SubLObject var35 = (SubLObject)NIL;
        var35 = var34.first();
        while (NIL != var34) {
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var36 = module0015.$g533$.currentBinding(var31);
            try {
                module0015.$g533$.bind((SubLObject)T, var31);
                f42517(var33);
                final SubLObject var37 = Numbers.subtract(var32, var33);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                if (NIL != var37) {
                    module0642.f39020(module0015.$g371$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var37);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic56$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_35 = module0015.$g533$.currentBinding(var31);
                try {
                    module0015.$g533$.bind((SubLObject)T, var31);
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    module0642.f39020(module0015.$g221$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)FOUR_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_36 = module0015.$g533$.currentBinding(var31);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var31);
                        module0656.f39804(var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_36, var31);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var5_35, var31);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var36, var31);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            var33 = Numbers.add(var33, (SubLObject)ONE_INTEGER);
            var34 = var34.rest();
            var35 = var34.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42515(final SubLObject var30, SubLObject var37, SubLObject var38) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        if (var38 == UNPROVIDED) {
            var38 = (SubLObject)NIL;
        }
        final SubLThread var39 = SubLProcess.currentSubLThread();
        final SubLObject var40 = Sequences.length(var30);
        if (NIL == var37) {
            f42518(var30);
            SubLObject var41 = module0220.f14565($ic57$, $ic58$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
            SubLObject var42 = (SubLObject)NIL;
            var42 = var41.first();
            while (NIL != var41) {
                f42515(var30, var42, (SubLObject)UNPROVIDED);
                var41 = var41.rest();
                var42 = var41.first();
            }
            f42515(var30, $ic57$, (SubLObject)UNPROVIDED);
            var41 = module0220.f14565($ic59$, $ic58$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
            SubLObject var43 = (SubLObject)NIL;
            var43 = var41.first();
            while (NIL != var41) {
                f42515(var30, var43, (SubLObject)UNPROVIDED);
                var41 = var41.rest();
                var43 = var41.first();
            }
            f42515(var30, $ic59$, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        if (NIL == var38) {
            final SubLObject var44 = module0697.f42493(var30, var37);
            if (NIL != var44) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var45 = module0015.$g533$.currentBinding(var39);
                try {
                    module0015.$g533$.bind((SubLObject)T, var39);
                    f42517(var40);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic54$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != module0015.$g516$.getGlobalValue()) {
                        module0642.f39020(module0015.$g374$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g516$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_42 = module0015.$g533$.currentBinding(var39);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var39);
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)TEN_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_43 = module0015.$g533$.currentBinding(var39);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var39);
                            module0656.f39804(var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var5_43, var39);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var5_42, var39);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var45, var39);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                SubLObject var46 = var44;
                SubLObject var38_44 = (SubLObject)NIL;
                var38_44 = var46.first();
                while (NIL != var46) {
                    f42515(var30, var37, var38_44);
                    var46 = var46.rest();
                    var38_44 = var46.first();
                }
            }
            return (SubLObject)NIL;
        }
        Hashtables.clrhash(module0697.$g5477$.getDynamicValue(var39));
        final SubLObject var47 = module0697.f42486(var30, var37, var38);
        if (NIL != var47) {
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var45 = module0015.$g533$.currentBinding(var39);
            try {
                module0015.$g533$.bind((SubLObject)T, var39);
                f42517(var40);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic54$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != module0015.$g508$.getGlobalValue()) {
                    module0642.f39020(module0015.$g374$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g508$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_44 = module0015.$g533$.currentBinding(var39);
                try {
                    module0015.$g533$.bind((SubLObject)T, var39);
                    module0642.f39020(module0015.$g209$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic60$);
                    module0656.f39804(var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39019((SubLObject)$ic61$);
                    module0642.f39020(module0015.$g210$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var5_44, var39);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var45, var39);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            f42519(var47, var30, var37, var38);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42519(final SubLObject var47, final SubLObject var30, final SubLObject var37, final SubLObject var38) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        final SubLObject var49 = Hashtables.make_hash_table((SubLObject)$ic62$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var50 = (SubLObject)ZERO_INTEGER;
        SubLObject var51 = (SubLObject)NIL;
        var48.resetMultipleValues();
        final SubLObject var52 = module0697.f42494(var47, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var53 = var48.secondMultipleValue();
        var48.resetMultipleValues();
        if (NIL == module0655.$g5111$.getDynamicValue(var48)) {
            var51 = (SubLObject)$ic63$;
        }
        SubLObject var54 = (SubLObject)NIL;
        SubLObject var55 = (SubLObject)NIL;
        SubLObject var56 = (SubLObject)NIL;
        SubLObject var57 = (SubLObject)NIL;
        var55 = var52;
        var56 = var55.first();
        for (var57 = (SubLObject)ZERO_INTEGER; NIL != var55; var55 = var55.rest(), var56 = var55.first(), var57 = Numbers.add((SubLObject)ONE_INTEGER, var57)) {
            if (NIL != module0655.$g5111$.getDynamicValue(var48)) {
                if (NIL != var54) {
                    var54 = (SubLObject)NIL;
                }
                else {
                    var54 = (SubLObject)T;
                }
                var51 = (SubLObject)((NIL != var54) ? $ic64$ : $ic63$);
            }
            final SubLObject var58 = var56.first();
            final SubLObject var59 = conses_high.second(var56);
            module0642.f39028((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var60 = module0015.$g533$.currentBinding(var48);
            try {
                module0015.$g533$.bind((SubLObject)T, var48);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_57 = module0015.$g533$.currentBinding(var48);
                try {
                    module0015.$g533$.bind((SubLObject)T, var48);
                    module0642.f39027((SubLObject)$ic45$, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var5_57, var48);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                f42520(var58, var30, var37, var38);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                if (NIL != var51) {
                    module0642.f39020(module0015.$g374$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var51);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_58 = module0015.$g533$.currentBinding(var48);
                try {
                    module0015.$g533$.bind((SubLObject)T, var48);
                    if (!var59.numE((SubLObject)ZERO_INTEGER)) {
                        module0642.f39027((SubLObject)$ic45$, (SubLObject)TWO_INTEGER);
                        SubLObject var61;
                        SubLObject var62;
                        for (var61 = Numbers.multiply((SubLObject)FOUR_INTEGER, Numbers.subtract(var59, (SubLObject)ONE_INTEGER)), var62 = (SubLObject)NIL, var62 = (SubLObject)ZERO_INTEGER; var62.numL(var61); var62 = Numbers.add(var62, (SubLObject)ONE_INTEGER)) {
                            module0642.f39027((SubLObject)$ic45$, (SubLObject)TWO_INTEGER);
                        }
                        module0642.f39019((SubLObject)$ic65$);
                    }
                    module0642.f39027((SubLObject)$ic45$, (SubLObject)TWO_INTEGER);
                    SubLObject var63 = module0697.f42501(var53, var58);
                    SubLObject var64 = (SubLObject)NIL;
                    var64 = var63.first();
                    while (NIL != var63) {
                        PrintLow.format(module0015.$g131$.getDynamicValue(var48), (SubLObject)$ic66$, Hashtables.gethash(var64, var49, (SubLObject)UNPROVIDED));
                        module0642.f39027((SubLObject)$ic45$, (SubLObject)UNPROVIDED);
                        var63 = var63.rest();
                        var64 = var63.first();
                    }
                    module0656.f39804(var58, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL != module0697.f42498(var53, var58)) {
                        var50 = Numbers.add(var50, (SubLObject)ONE_INTEGER);
                        Hashtables.sethash(var58, var49, var50);
                        module0642.f39027((SubLObject)$ic45$, (SubLObject)UNPROVIDED);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var48), (SubLObject)$ic66$, var50);
                    }
                }
                finally {
                    module0015.$g533$.rebind(var5_58, var48);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var60, var48);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42520(final SubLObject var55, final SubLObject var30, final SubLObject var37, final SubLObject var38) {
        final SubLThread var56 = SubLProcess.currentSubLThread();
        SubLObject var57 = (SubLObject)NIL;
        SubLObject var58 = (SubLObject)NIL;
        if (NIL == module0655.$g5111$.getDynamicValue(var56)) {
            var58 = (SubLObject)$ic63$;
        }
        SubLObject var59 = (SubLObject)NIL;
        SubLObject var60 = (SubLObject)NIL;
        SubLObject var61 = (SubLObject)NIL;
        SubLObject var62 = (SubLObject)NIL;
        var60 = var30;
        var61 = var60.first();
        for (var62 = (SubLObject)ZERO_INTEGER; NIL != var60; var60 = var60.rest(), var61 = var60.first(), var62 = Numbers.add((SubLObject)ONE_INTEGER, var62)) {
            if (NIL != module0655.$g5111$.getDynamicValue(var56)) {
                if (NIL != var59) {
                    var59 = (SubLObject)NIL;
                }
                else {
                    var59 = (SubLObject)T;
                }
                var58 = (SubLObject)((NIL != var59) ? $ic64$ : $ic63$);
            }
            final SubLObject var63 = (SubLObject)ConsesLow.list(var61, var55);
            if (NIL != module0697.f42485(var63, (SubLObject)$ic67$)) {
                if (NIL != module0697.f42485(var63, (SubLObject)$ic68$)) {
                    if (NIL != module0697.f42485(var63, (SubLObject)$ic69$)) {
                        var57 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic70$);
                    }
                    else {
                        var57 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic71$);
                    }
                }
                else if (NIL != module0697.f42485(var63, (SubLObject)$ic69$)) {
                    var57 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic72$);
                }
                else {
                    var57 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic73$);
                }
            }
            else if (NIL != module0697.f42485(var63, (SubLObject)$ic68$)) {
                if (NIL != module0697.f42485(var63, (SubLObject)$ic69$)) {
                    var57 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic74$);
                }
                else {
                    var57 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic75$);
                }
            }
            else if (NIL != module0697.f42485(var63, (SubLObject)$ic69$)) {
                var57 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic76$);
            }
            else {
                var57 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic77$);
            }
            final SubLObject var64 = module0697.f42485(var63, (SubLObject)$ic69$);
            final SubLObject var65 = module0697.f42485(var63, (SubLObject)$ic68$);
            final SubLObject var66 = module0697.f42485(var63, (SubLObject)$ic67$);
            if (NIL != var64) {
                if (NIL != var66) {
                    var58 = module0015.$g512$.getGlobalValue();
                }
                else {
                    var58 = module0015.$g499$.getGlobalValue();
                }
            }
            else if (NIL != var65) {
                var58 = module0015.$g504$.getGlobalValue();
            }
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g370$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic78$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var58) {
                module0642.f39020(module0015.$g374$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var58);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var67 = module0015.$g533$.currentBinding(var56);
            try {
                module0015.$g533$.bind((SubLObject)T, var56);
                final SubLObject var68 = module0217.f14421((SubLObject)ConsesLow.list(var37, var61, var55), var38);
                if (NIL != var68) {
                    module0642.f39020(module0015.$g381$.getGlobalValue());
                    module0642.f39020(module0015.$g383$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var56), (SubLObject)$ic79$, assertion_handles_oc.f11025(var68));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_69 = module0015.$g533$.currentBinding(var56);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var56);
                        module0656.f39853(var68, (SubLObject)$ic80$);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_69, var56);
                    }
                    module0642.f39020(module0015.$g382$.getGlobalValue());
                }
                if (NIL != var64) {
                    module0642.f39069(f42521(var37, var38, var55, var61, (SubLObject)UNPROVIDED), (SubLObject)$ic81$, (SubLObject)UNPROVIDED);
                }
                module0642.f39068(f42521(var37, var38, var55, var61, (SubLObject)UNPROVIDED), (SubLObject)$ic82$, var64, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var67, var56);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42516() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ONE_INTEGER);
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
        final SubLObject var4 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)T, var3);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var5_70 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)T, var3);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_71 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)T, var3);
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
                    module0642.f39020((SubLObject)THREE_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_72 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_73 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var3);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic54$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_74 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                module0642.f39020(module0015.$g221$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)FOUR_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var5_75 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var3);
                                    module0642.f39019((SubLObject)$ic83$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_75, var3);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var5_74, var3);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_73, var3);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_76 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var3);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic78$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            if (NIL != module0015.$g512$.getGlobalValue()) {
                                module0642.f39020(module0015.$g374$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g512$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_77 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0642.f39020(module0015.$g236$.getGlobalValue());
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                module0642.f39020(module0015.$g221$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)EIGHT_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var5_78 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var3);
                                    module0642.f39019((SubLObject)$ic84$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_78, var3);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                                module0642.f39020(module0015.$g237$.getGlobalValue());
                                module0642.f39068((SubLObject)$ic85$, (SubLObject)$ic85$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_77, var3);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_79 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0642.f39019((SubLObject)$ic86$);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_79, var3);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_76, var3);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_80 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var3);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic78$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            if (NIL != module0015.$g499$.getGlobalValue()) {
                                module0642.f39020(module0015.$g374$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g499$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_81 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0642.f39020(module0015.$g236$.getGlobalValue());
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                module0642.f39020(module0015.$g221$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)EIGHT_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var5_82 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var3);
                                    module0642.f39019((SubLObject)$ic84$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_82, var3);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                                module0642.f39020(module0015.$g237$.getGlobalValue());
                                module0642.f39068((SubLObject)$ic85$, (SubLObject)$ic85$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_81, var3);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_83 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0642.f39019((SubLObject)$ic87$);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_83, var3);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_80, var3);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_84 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var3);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic78$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            if (NIL != module0015.$g504$.getGlobalValue()) {
                                module0642.f39020(module0015.$g374$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g504$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_85 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                final SubLObject var5 = module0014.f697((SubLObject)$ic2$);
                                final SubLObject var6 = (SubLObject)$ic88$;
                                final SubLObject var7 = module0014.f694((SubLObject)$ic2$);
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
                                final SubLObject var5_86 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var3);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_86, var3);
                                }
                                module0642.f39020(module0015.$g432$.getGlobalValue());
                                module0642.f39068((SubLObject)$ic85$, (SubLObject)$ic85$, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_85, var3);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_87 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0642.f39019((SubLObject)$ic89$);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_87, var3);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_84, var3);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_88 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var3);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic78$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            if (NIL != module0015.$g504$.getGlobalValue()) {
                                module0642.f39020(module0015.$g374$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g504$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_89 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0642.f39068((SubLObject)$ic85$, (SubLObject)$ic85$, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_89, var3);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_90 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0642.f39019((SubLObject)$ic90$);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_90, var3);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_88, var3);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_91 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var3);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic78$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            if (NIL != module0015.$g492$.getGlobalValue()) {
                                module0642.f39020(module0015.$g374$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g492$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_92 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0642.f39068((SubLObject)$ic85$, (SubLObject)$ic85$, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_92, var3);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_93 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0642.f39019((SubLObject)$ic91$);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_93, var3);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_91, var3);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_72, var3);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var5_71, var3);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var5_70, var3);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var4, var3);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42522(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = Hashtables.make_hash_table((SubLObject)$ic92$, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic43$);
            return (SubLObject)NIL;
        }
        SubLObject var4 = var1;
        SubLObject var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            if (var5.isList()) {
                final SubLObject var6 = var5.first();
                final SubLObject var7 = conses_high.second(var5);
                final SubLObject var8 = Hashtables.gethash(var6, var3, (SubLObject)UNPROVIDED);
                if (var7.equal((SubLObject)$ic82$)) {
                    if (NIL == var8) {
                        Hashtables.sethash(var6, var3, (SubLObject)$ic93$);
                    }
                    else {
                        Hashtables.sethash(var6, var3, (SubLObject)$ic94$);
                    }
                }
                if (var7.equal((SubLObject)$ic81$)) {
                    if (NIL == var8) {
                        Hashtables.sethash(var6, var3, (SubLObject)$ic95$);
                    }
                    else {
                        Hashtables.sethash(var6, var3, (SubLObject)$ic94$);
                    }
                }
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        final Iterator var11 = Hashtables.getEntrySetIterator(var3);
        try {
            while (Hashtables.iteratorHasNext(var11)) {
                final Map.Entry var12 = Hashtables.iteratorNextEntry(var11);
                var9 = Hashtables.getEntryKey(var12);
                var10 = Hashtables.getEntryValue(var12);
                var2.resetMultipleValues();
                final SubLObject var13 = f42523(var9);
                final SubLObject var14 = var2.secondMultipleValue();
                final SubLObject var15 = var2.thirdMultipleValue();
                final SubLObject var16 = var2.fourthMultipleValue();
                var2.resetMultipleValues();
                final SubLObject var17 = var10;
                if (var17.eql((SubLObject)$ic93$)) {
                    PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic96$, new SubLObject[] { var13, var16, var15, var14 });
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0642.f39019((SubLObject)$ic97$);
                    module0656.f39804(module0543.f33631((SubLObject)ConsesLow.list(var13, var16, var15), var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39026((SubLObject)TWO_INTEGER);
                }
                else {
                    if (!var17.eql((SubLObject)$ic95$)) {
                        continue;
                    }
                    PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic98$, new SubLObject[] { var13, var16, var15, var14 });
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0642.f39019((SubLObject)$ic97$);
                    module0656.f39804(module0543.f33658((SubLObject)ConsesLow.list(var13, var16, var15), var14), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39026((SubLObject)TWO_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var11);
        }
        f42508((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42521(final SubLObject var37, SubLObject var38, SubLObject var33, SubLObject var105, SubLObject var107) {
        if (var38 == UNPROVIDED) {
            var38 = (SubLObject)NIL;
        }
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        if (var105 == UNPROVIDED) {
            var105 = (SubLObject)NIL;
        }
        if (var107 == UNPROVIDED) {
            var107 = (SubLObject)NIL;
        }
        final SubLObject var108 = module0656.f39842(var37);
        final SubLObject var109 = module0656.f39842(var38);
        final SubLObject var110 = module0656.f39842(var33);
        final SubLObject var111 = module0656.f39842(var105);
        if (NIL == var37) {
            return (SubLObject)NIL;
        }
        if (NIL == var38) {
            return PrintLow.format((SubLObject)NIL, (SubLObject)$ic104$, var108);
        }
        if (NIL == var33) {
            return PrintLow.format((SubLObject)NIL, (SubLObject)$ic103$, var108, var109);
        }
        if (NIL == var105) {
            return PrintLow.format((SubLObject)NIL, (SubLObject)$ic102$, new SubLObject[] { var108, var109, var110 });
        }
        if (NIL != var107) {
            return PrintLow.format((SubLObject)NIL, (SubLObject)$ic100$, new SubLObject[] { var108, var109, var110, var111, var107 });
        }
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic101$, new SubLObject[] { var108, var109, var110, var111 });
    }
    
    public static SubLObject f42523(final SubLObject var112) {
        final SubLObject var113 = module0038.f2738(var112, (SubLObject)$ic105$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var114 = module0656.f39943(ConsesLow.nth((SubLObject)ONE_INTEGER, var113), (SubLObject)UNPROVIDED);
        final SubLObject var115 = module0656.f39943(ConsesLow.nth((SubLObject)TWO_INTEGER, var113), (SubLObject)UNPROVIDED);
        final SubLObject var116 = module0656.f39943(ConsesLow.nth((SubLObject)THREE_INTEGER, var113), (SubLObject)UNPROVIDED);
        final SubLObject var117 = module0656.f39943(ConsesLow.nth((SubLObject)FOUR_INTEGER, var113), (SubLObject)UNPROVIDED);
        return Values.values(var114, var115, var116, var117);
    }
    
    public static SubLObject f42524() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0698", "f42508", "ST-SIMILARITY-ENTRANCE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0698", "f42510", "S#46494", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0698", "f42509", "S#46495", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0698", "f42511", "S#46496", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0698", "f42512", "S#46497", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0698", "f42513", "S#46498", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0698", "f42514", "CB-SIMILARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0698", "f42517", "S#46499", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0698", "f42518", "S#46500", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0698", "f42515", "S#46501", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0698", "f42519", "S#46502", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0698", "f42520", "S#46503", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0698", "f42516", "S#46504", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0698", "f42522", "CB-SIMILARITY-ASSERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0698", "f42521", "S#46505", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0698", "f42523", "S#46506", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42525() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42526() {
        Hashtables.sethash((SubLObject)$ic0$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)NIL));
        Hashtables.sethash((SubLObject)$ic2$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)NIL));
        Hashtables.sethash((SubLObject)$ic4$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)NIL));
        Hashtables.sethash((SubLObject)$ic6$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)NIL));
        Hashtables.sethash((SubLObject)$ic8$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic10$);
        module0656.f39840((SubLObject)$ic14$, (SubLObject)$ic15$, (SubLObject)ONE_INTEGER);
        module0656.f39821((SubLObject)$ic14$, (SubLObject)$ic11$, (SubLObject)$ic16$, (SubLObject)$ic17$);
        Hashtables.sethash((SubLObject)$ic18$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic19$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic53$);
        module0015.f873((SubLObject)$ic99$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f42524();
    }
    
    public void initializeVariables() {
        f42525();
    }
    
    public void runTopLevelForms() {
        f42526();
    }
    
    static {
        me = (SubLFile)new module0698();
        $ic0$ = makeKeyword("BLUE-BALL");
        $ic1$ = makeString("blue.gif");
        $ic2$ = makeKeyword("GREEN-BALL");
        $ic3$ = makeString("green.gif");
        $ic4$ = makeKeyword("RED-BALL");
        $ic5$ = makeString("red.gif");
        $ic6$ = makeKeyword("WHITE-BALL");
        $ic7$ = makeString("white.gif");
        $ic8$ = makeKeyword("YELLOW-BALL");
        $ic9$ = makeString("yellow.gif");
        $ic10$ = makeSymbol("ST-SIMILARITY-ENTRANCE");
        $ic11$ = makeString("Similarity");
        $ic12$ = makeKeyword("MAIN");
        $ic13$ = makeString("st-similarity-entrance");
        $ic14$ = makeKeyword("SIMILARITY");
        $ic15$ = makeSymbol("S#46494", "CYC");
        $ic16$ = makeString("Sim");
        $ic17$ = makeString("Similarity Tool");
        $ic18$ = makeKeyword("ST-SIMILARITY");
        $ic19$ = makeString("st-similarity.html");
        $ic20$ = makeString("Similarity Tool Choose");
        $ic21$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic22$ = makeKeyword("CB-CYC");
        $ic23$ = makeString("stylesheet");
        $ic24$ = makeString("text/css");
        $ic25$ = makeKeyword("SHA1");
        $ic26$ = makeString("text/javascript");
        $ic27$ = makeString("yui-skin-sam");
        $ic28$ = makeString("reloadFrameButton");
        $ic29$ = makeString("button");
        $ic30$ = makeString("reload");
        $ic31$ = makeString("Refresh Frames");
        $ic32$ = makeKeyword("CLEAR-HISTORY");
        $ic33$ = makeString("cg?cb-similarity");
        $ic34$ = makeKeyword("POST");
        $ic35$ = makeString("cb-similarity");
        $ic36$ = makeString("Run Similarity Tool");
        $ic37$ = makeString("Please choose two or more constants.");
        $ic38$ = makeString("Recent Constants :");
        $ic39$ = makeString("None");
        $ic40$ = makeString("Recent NATs :");
        $ic41$ = makeSymbol("VALID-CONSTANT?");
        $ic42$ = makeSymbol("S#13637", "CYC");
        $ic43$ = makeString("the Similarity Tool page");
        $ic44$ = makeString("Cannot show similarity for just one constant: ~A.");
        $ic45$ = makeKeyword("NBSP");
        $ic46$ = makeString("Check or uncheck the boxes to make or remove assertions.");
        $ic47$ = makeString("cg");
        $ic48$ = makeString("SimilarityForm");
        $ic49$ = makeString("cb-similarity-assert");
        $ic50$ = makeString("t");
        $ic51$ = makeString("Reset");
        $ic52$ = makeString("Submit");
        $ic53$ = makeSymbol("CB-SIMILARITY");
        $ic54$ = makeKeyword("CENTER");
        $ic55$ = makeString("&nbsp;");
        $ic56$ = makeKeyword("LEFT");
        $ic57$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic58$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic59$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic60$ = makeString("(");
        $ic61$ = makeString(")");
        $ic62$ = makeInteger(32);
        $ic63$ = makeString("#cccccc");
        $ic64$ = makeString("#dddddd");
        $ic65$ = makeString("|__");
        $ic66$ = makeString("(~A)");
        $ic67$ = makeKeyword("BASIS");
        $ic68$ = makeKeyword("IMPLIED");
        $ic69$ = makeKeyword("ASSERTED");
        $ic70$ = makeString("BIA ");
        $ic71$ = makeString("BI_ ");
        $ic72$ = makeString("B_A ");
        $ic73$ = makeString("B__ ");
        $ic74$ = makeString("_IA ");
        $ic75$ = makeString("_I_ ");
        $ic76$ = makeString("__A ");
        $ic77$ = makeString("___ ");
        $ic78$ = makeKeyword("RIGHT");
        $ic79$ = makeString("cg?cb-af&~a");
        $ic80$ = makeKeyword("BOTTOM");
        $ic81$ = makeString("a");
        $ic82$ = makeString("x");
        $ic83$ = makeString("L E G E N D");
        $ic84$ = makeString("*");
        $ic85$ = makeString("");
        $ic86$ = makeString("Asserted in KB.");
        $ic87$ = makeString("Asserted in KB, but redundant.");
        $ic88$ = makeKeyword("TOP");
        $ic89$ = makeString("Shown as asserted in KB by a forward rule.");
        $ic90$ = makeString("Not asserted in KB, but true.");
        $ic91$ = makeString("Neither asserted in KB nor true.");
        $ic92$ = makeInteger(64);
        $ic93$ = makeSymbol("ASSERT");
        $ic94$ = makeSymbol("S#40015", "CYC");
        $ic95$ = makeSymbol("S#46507", "CYC");
        $ic96$ = makeString("Asserting: (~A ~A ~A) in ~A");
        $ic97$ = makeString("Result: ");
        $ic98$ = makeString("Unasserting: (~A ~A ~A) from ~A");
        $ic99$ = makeSymbol("CB-SIMILARITY-ASSERT");
        $ic100$ = makeString("st|~A|~A|~A|~A|~A|");
        $ic101$ = makeString("st|~A|~A|~A|~A|");
        $ic102$ = makeString("st|~A|~A|~A|");
        $ic103$ = makeString("st|~A|~A|");
        $ic104$ = makeString("st|~A|");
        $ic105$ = ConsesLow.list((SubLObject)makeString("|"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 804 ms
	
	Decompiled with Procyon 0.5.32.
*/