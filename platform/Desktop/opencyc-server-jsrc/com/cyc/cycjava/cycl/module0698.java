package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        if (var1 == module0698.UNPROVIDED) {
            var1 = (SubLObject)module0698.NIL;
        }
        return f42509();
    }
    
    public static SubLObject f42510(SubLObject var2) {
        if (var2 == module0698.UNPROVIDED) {
            var2 = (SubLObject)module0698.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0698.NIL == var2) {
            var2 = (SubLObject)module0698.$ic11$;
        }
        final SubLObject var4 = module0656.f39832((SubLObject)module0698.$ic12$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0698.$ic13$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
        if (module0698.NIL != var4) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
            module0642.f39020(var4);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)module0698.T, var3);
            module0642.f39019(var2);
        }
        finally {
            module0015.$g533$.rebind(var5, var3);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0698.NIL;
    }
    
    public static SubLObject f42509() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = (SubLObject)module0698.$ic20$;
        final SubLObject var5 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((module0698.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED), var3);
            module0642.f39020((SubLObject)module0698.$ic21$);
            module0642.f39029((SubLObject)module0698.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var6 = module0014.f672((SubLObject)module0698.$ic22$);
            module0642.f39029((SubLObject)module0698.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
            module0642.f39020((SubLObject)module0698.$ic23$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
            if (module0698.NIL != var6) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                module0642.f39020(var6);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
            module0642.f39020((SubLObject)module0698.$ic24$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
            module0016.f941();
            if (module0698.NIL != var4) {
                module0642.f39029((SubLObject)module0698.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var4);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0698.UNPROVIDED);
            final SubLObject var5_8 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)module0698.T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0698.NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                module0642.f39020((SubLObject)module0698.$ic27$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                final SubLObject var5_9 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)module0698.T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39020((SubLObject)module0698.$ic28$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                    final SubLObject var5_10 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0698.T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39020((SubLObject)module0698.$ic29$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39020((SubLObject)module0698.$ic30$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39019((SubLObject)module0698.$ic31$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_10, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0698.NIL != var4) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0698.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39019(var4);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0698.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                    final SubLObject var5_11 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var7 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var8 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0698.T, var3);
                        module0015.$g541$.bind((SubLObject)module0698.T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0656.f39870((SubLObject)module0698.$ic18$, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
                        module0656.f39837((SubLObject)module0698.$ic32$, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
                        f42511();
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var8, var3);
                        module0015.$g541$.rebind(var7, var3);
                        module0015.$g533$.rebind(var5_11, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0698.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var5_9, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0698.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var5_8, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0698.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var5, var3);
        }
        return (SubLObject)module0698.NIL;
    }
    
    public static SubLObject f42511() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g282$.getGlobalValue());
        module0642.f39020(module0015.$g284$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
        module0642.f39020((SubLObject)module0698.$ic33$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
        module0642.f39020(module0015.$g285$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
        module0642.f39020((SubLObject)module0698.$ic34$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
        final SubLObject var4 = module0015.$g533$.currentBinding(var3);
        final SubLObject var5 = module0015.$g541$.currentBinding(var3);
        final SubLObject var6 = module0015.$g539$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)module0698.T, var3);
            module0015.$g541$.bind((SubLObject)module0698.T, var3);
            module0015.$g539$.bind(module0015.f797(), var3);
            module0642.f39069((SubLObject)module0698.$ic35$, (SubLObject)module0698.NIL, (SubLObject)module0698.UNPROVIDED);
            module0642.f39026((SubLObject)module0698.TWO_INTEGER);
            module0642.f39074((SubLObject)module0698.$ic36$, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
            module0642.f39026((SubLObject)module0698.TWO_INTEGER);
            module0642.f39019((SubLObject)module0698.$ic37$);
            module0642.f39026((SubLObject)module0698.TWO_INTEGER);
            SubLObject var7 = f42512();
            module0642.f39020(module0015.$g207$.getGlobalValue());
            module0642.f39019((SubLObject)module0698.$ic38$);
            module0642.f39020(module0015.$g208$.getGlobalValue());
            module0642.f39026((SubLObject)module0698.UNPROVIDED);
            if (module0698.NIL != var7) {
                SubLObject var8 = var7;
                SubLObject var9 = (SubLObject)module0698.NIL;
                var9 = var8.first();
                while (module0698.NIL != var8) {
                    module0642.f39068(module0656.f39842(var9), (SubLObject)module0698.T, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39032((SubLObject)module0698.TWO_INTEGER);
                    module0656.f39804(var9, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39026((SubLObject)module0698.UNPROVIDED);
                    var8 = var8.rest();
                    var9 = var8.first();
                }
            }
            else {
                module0642.f39019((SubLObject)module0698.$ic39$);
            }
            module0642.f39026((SubLObject)module0698.TWO_INTEGER);
            module0642.f39020(module0015.$g207$.getGlobalValue());
            module0642.f39019((SubLObject)module0698.$ic40$);
            module0642.f39020(module0015.$g208$.getGlobalValue());
            module0642.f39026((SubLObject)module0698.UNPROVIDED);
            var7 = f42513();
            if (module0698.NIL != var7) {
                SubLObject var8 = var7;
                SubLObject var9 = (SubLObject)module0698.NIL;
                var9 = var8.first();
                while (module0698.NIL != var8) {
                    module0642.f39068(module0656.f39842(var9), (SubLObject)module0698.T, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39032((SubLObject)module0698.TWO_INTEGER);
                    module0656.f39804(var9, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39026((SubLObject)module0698.UNPROVIDED);
                    var8 = var8.rest();
                    var9 = var8.first();
                }
            }
            else {
                module0642.f39019((SubLObject)module0698.$ic39$);
            }
            module0642.f39026((SubLObject)module0698.TWO_INTEGER);
            module0642.f39074((SubLObject)module0698.$ic36$, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
            module0642.f39026((SubLObject)module0698.TWO_INTEGER);
            module0015.f799(module0015.$g539$.getDynamicValue(var3));
        }
        finally {
            module0015.$g539$.rebind(var6, var3);
            module0015.$g541$.rebind(var5, var3);
            module0015.$g533$.rebind(var4, var3);
        }
        module0642.f39020(module0015.$g283$.getGlobalValue());
        return (SubLObject)module0698.NIL;
    }
    
    public static SubLObject f42512() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0655.$g5083$.setDynamicValue(module0035.delete_if_not(Symbols.symbol_function((SubLObject)module0698.$ic41$), module0655.$g5083$.getDynamicValue(var3), (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED), var3);
        return conses_high.copy_list(module0655.$g5083$.getDynamicValue(var3));
    }
    
    public static SubLObject f42513() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0655.$g5085$.setDynamicValue(module0035.delete_if_not(Symbols.symbol_function((SubLObject)module0698.$ic42$), module0655.$g5085$.getDynamicValue(var3), (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED), var3);
        return conses_high.copy_list(module0655.$g5085$.getDynamicValue(var3));
    }
    
    public static SubLObject f42514(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0698.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0698.$ic43$);
            return (SubLObject)module0698.NIL;
        }
        SubLObject var3 = (SubLObject)module0698.NIL;
        SubLObject var4 = var1;
        SubLObject var5 = (SubLObject)module0698.NIL;
        var5 = var4.first();
        while (module0698.NIL != var4) {
            if (var5.isList()) {
                final SubLObject var6 = var5.first();
                final SubLObject var7 = module0656.f39943(var6, (SubLObject)module0698.UNPROVIDED);
                if (module0698.NIL != module0173.f10955(var7)) {
                    var3 = (SubLObject)ConsesLow.cons(var7, var3);
                }
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        var3 = Sequences.nreverse(Sequences.remove_duplicates(var3, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED));
        if (module0698.NIL == var3.rest()) {
            module0656.f39789((SubLObject)module0698.$ic44$, var3.first(), (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
            return (SubLObject)module0698.NIL;
        }
        final SubLObject var8 = (SubLObject)module0698.$ic17$;
        final SubLObject var9 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((module0698.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED), var2);
            module0642.f39020((SubLObject)module0698.$ic21$);
            module0642.f39029((SubLObject)module0698.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var10 = module0014.f672((SubLObject)module0698.$ic22$);
            module0642.f39029((SubLObject)module0698.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
            module0642.f39020((SubLObject)module0698.$ic23$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
            if (module0698.NIL != var10) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                module0642.f39020(var10);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
            module0642.f39020((SubLObject)module0698.$ic24$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
            module0016.f941();
            if (module0698.NIL != var8) {
                module0642.f39029((SubLObject)module0698.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var8);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0698.UNPROVIDED);
            final SubLObject var5_21 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)module0698.T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0698.NIL != module0015.$g132$.getDynamicValue(var2)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                module0642.f39020((SubLObject)module0698.$ic27$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                final SubLObject var5_22 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0698.T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39020((SubLObject)module0698.$ic28$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                    final SubLObject var5_23 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0698.T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39020((SubLObject)module0698.$ic29$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39020((SubLObject)module0698.$ic30$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39019((SubLObject)module0698.$ic31$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_23, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0698.NIL != var8) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0698.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39019(var8);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0698.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                    }
                    module0656.f39870((SubLObject)module0698.$ic18$, (SubLObject)module0698.NIL, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39027((SubLObject)module0698.$ic45$, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39019((SubLObject)module0698.$ic46$);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39020((SubLObject)module0698.$ic47$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39020((SubLObject)module0698.$ic34$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39020(module0015.$g287$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39020((SubLObject)module0698.$ic48$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                    final SubLObject var5_24 = module0015.$g533$.currentBinding(var2);
                    final SubLObject var11 = module0015.$g541$.currentBinding(var2);
                    final SubLObject var12 = module0015.$g539$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0698.T, var2);
                        module0015.$g541$.bind((SubLObject)module0698.T, var2);
                        module0015.$g539$.bind(module0015.f797(), var2);
                        module0642.f39069((SubLObject)module0698.$ic49$, (SubLObject)module0698.$ic50$, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39020((SubLObject)module0698.$ic29$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39019((SubLObject)module0698.$ic51$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39020((SubLObject)module0698.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39020(module0015.$g353$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39020((SubLObject)module0698.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39020(module0015.$g354$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39020((SubLObject)module0698.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                        final SubLObject var5_25 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)module0698.T, var2);
                            f42515(var3, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var5_25, var2);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                        module0642.f39026((SubLObject)module0698.UNPROVIDED);
                        module0642.f39074((SubLObject)module0698.$ic52$, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39026((SubLObject)module0698.TWO_INTEGER);
                        f42516();
                        module0015.f799(module0015.$g539$.getDynamicValue(var2));
                    }
                    finally {
                        module0015.$g539$.rebind(var12, var2);
                        module0015.$g541$.rebind(var11, var2);
                        module0015.$g533$.rebind(var5_24, var2);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0698.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var5_22, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0698.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var5_21, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0698.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var9, var2);
        }
        return (SubLObject)module0698.NIL;
    }
    
    public static SubLObject f42517(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
        final SubLObject var28 = module0015.$g533$.currentBinding(var27);
        try {
            module0015.$g533$.bind((SubLObject)module0698.T, var27);
        }
        finally {
            module0015.$g533$.rebind(var28, var27);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        SubLObject var29 = module0015.$g491$.getGlobalValue();
        SubLObject var30 = (SubLObject)module0698.NIL;
        if (var26.numG((SubLObject)module0698.ZERO_INTEGER)) {
            SubLObject var31;
            SubLObject var32;
            for (var31 = (SubLObject)module0698.NIL, var31 = (SubLObject)module0698.ZERO_INTEGER; var31.numL(var26); var31 = Numbers.add(var31, (SubLObject)module0698.ONE_INTEGER)) {
                if (module0698.NIL != module0655.$g5111$.getDynamicValue(var27)) {
                    var29 = ((module0698.NIL != var30) ? module0015.$g491$.getGlobalValue() : module0015.$g492$.getGlobalValue());
                    if (module0698.NIL != var30) {
                        var30 = (SubLObject)module0698.NIL;
                    }
                    else {
                        var30 = (SubLObject)module0698.T;
                    }
                }
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0698.$ic54$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                if (module0698.NIL != var29) {
                    module0642.f39020(module0015.$g374$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39020(var29);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                var32 = module0015.$g533$.currentBinding(var27);
                try {
                    module0015.$g533$.bind((SubLObject)module0698.T, var27);
                    module0642.f39020((SubLObject)module0698.$ic55$);
                }
                finally {
                    module0015.$g533$.rebind(var32, var27);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
        }
        return (SubLObject)module0698.NIL;
    }
    
    public static SubLObject f42518(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        final SubLObject var32 = Numbers.add((SubLObject)module0698.ONE_INTEGER, Sequences.length(var30));
        SubLObject var33 = (SubLObject)module0698.ZERO_INTEGER;
        SubLObject var34 = var30;
        SubLObject var35 = (SubLObject)module0698.NIL;
        var35 = var34.first();
        while (module0698.NIL != var34) {
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
            final SubLObject var36 = module0015.$g533$.currentBinding(var31);
            try {
                module0015.$g533$.bind((SubLObject)module0698.T, var31);
                f42517(var33);
                final SubLObject var37 = Numbers.subtract(var32, var33);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                if (module0698.NIL != var37) {
                    module0642.f39020(module0015.$g371$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39020(var37);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                }
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0698.$ic56$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                final SubLObject var5_35 = module0015.$g533$.currentBinding(var31);
                try {
                    module0015.$g533$.bind((SubLObject)module0698.T, var31);
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    module0642.f39020(module0015.$g221$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39020((SubLObject)module0698.FOUR_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                    final SubLObject var5_36 = module0015.$g533$.currentBinding(var31);
                    try {
                        module0015.$g533$.bind((SubLObject)module0698.T, var31);
                        module0656.f39804(var35, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
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
            module0642.f39029((SubLObject)module0698.UNPROVIDED);
            var33 = Numbers.add(var33, (SubLObject)module0698.ONE_INTEGER);
            var34 = var34.rest();
            var35 = var34.first();
        }
        return (SubLObject)module0698.NIL;
    }
    
    public static SubLObject f42515(final SubLObject var30, SubLObject var37, SubLObject var38) {
        if (var37 == module0698.UNPROVIDED) {
            var37 = (SubLObject)module0698.NIL;
        }
        if (var38 == module0698.UNPROVIDED) {
            var38 = (SubLObject)module0698.NIL;
        }
        final SubLThread var39 = SubLProcess.currentSubLThread();
        final SubLObject var40 = Sequences.length(var30);
        if (module0698.NIL == var37) {
            f42518(var30);
            SubLObject var41 = module0220.f14565(module0698.$ic57$, module0698.$ic58$, (SubLObject)module0698.TWO_INTEGER, (SubLObject)module0698.ONE_INTEGER, (SubLObject)module0698.UNPROVIDED);
            SubLObject var42 = (SubLObject)module0698.NIL;
            var42 = var41.first();
            while (module0698.NIL != var41) {
                f42515(var30, var42, (SubLObject)module0698.UNPROVIDED);
                var41 = var41.rest();
                var42 = var41.first();
            }
            f42515(var30, module0698.$ic57$, (SubLObject)module0698.UNPROVIDED);
            var41 = module0220.f14565(module0698.$ic59$, module0698.$ic58$, (SubLObject)module0698.TWO_INTEGER, (SubLObject)module0698.ONE_INTEGER, (SubLObject)module0698.UNPROVIDED);
            SubLObject var43 = (SubLObject)module0698.NIL;
            var43 = var41.first();
            while (module0698.NIL != var41) {
                f42515(var30, var43, (SubLObject)module0698.UNPROVIDED);
                var41 = var41.rest();
                var43 = var41.first();
            }
            f42515(var30, module0698.$ic59$, (SubLObject)module0698.UNPROVIDED);
            return (SubLObject)module0698.NIL;
        }
        if (module0698.NIL == var38) {
            final SubLObject var44 = module0697.f42493(var30, var37);
            if (module0698.NIL != var44) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                final SubLObject var45 = module0015.$g533$.currentBinding(var39);
                try {
                    module0015.$g533$.bind((SubLObject)module0698.T, var39);
                    f42517(var40);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0698.$ic54$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    if (module0698.NIL != module0015.$g516$.getGlobalValue()) {
                        module0642.f39020(module0015.$g374$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39020(module0015.$g516$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                    final SubLObject var5_42 = module0015.$g533$.currentBinding(var39);
                    try {
                        module0015.$g533$.bind((SubLObject)module0698.T, var39);
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39020((SubLObject)module0698.TEN_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                        final SubLObject var5_43 = module0015.$g533$.currentBinding(var39);
                        try {
                            module0015.$g533$.bind((SubLObject)module0698.T, var39);
                            module0656.f39804(var37, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
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
                module0642.f39029((SubLObject)module0698.UNPROVIDED);
                SubLObject var46 = var44;
                SubLObject var38_44 = (SubLObject)module0698.NIL;
                var38_44 = var46.first();
                while (module0698.NIL != var46) {
                    f42515(var30, var37, var38_44);
                    var46 = var46.rest();
                    var38_44 = var46.first();
                }
            }
            return (SubLObject)module0698.NIL;
        }
        Hashtables.clrhash(module0697.$g5477$.getDynamicValue(var39));
        final SubLObject var47 = module0697.f42486(var30, var37, var38);
        if (module0698.NIL != var47) {
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
            final SubLObject var45 = module0015.$g533$.currentBinding(var39);
            try {
                module0015.$g533$.bind((SubLObject)module0698.T, var39);
                f42517(var40);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0698.$ic54$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                if (module0698.NIL != module0015.$g508$.getGlobalValue()) {
                    module0642.f39020(module0015.$g374$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39020(module0015.$g508$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                final SubLObject var5_44 = module0015.$g533$.currentBinding(var39);
                try {
                    module0015.$g533$.bind((SubLObject)module0698.T, var39);
                    module0642.f39020(module0015.$g209$.getGlobalValue());
                    module0642.f39019((SubLObject)module0698.$ic60$);
                    module0656.f39804(var38, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39019((SubLObject)module0698.$ic61$);
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
            module0642.f39029((SubLObject)module0698.UNPROVIDED);
            f42519(var47, var30, var37, var38);
        }
        return (SubLObject)module0698.NIL;
    }
    
    public static SubLObject f42519(final SubLObject var47, final SubLObject var30, final SubLObject var37, final SubLObject var38) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        final SubLObject var49 = Hashtables.make_hash_table((SubLObject)module0698.$ic62$, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
        SubLObject var50 = (SubLObject)module0698.ZERO_INTEGER;
        SubLObject var51 = (SubLObject)module0698.NIL;
        var48.resetMultipleValues();
        final SubLObject var52 = module0697.f42494(var47, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
        final SubLObject var53 = var48.secondMultipleValue();
        var48.resetMultipleValues();
        if (module0698.NIL == module0655.$g5111$.getDynamicValue(var48)) {
            var51 = (SubLObject)module0698.$ic63$;
        }
        SubLObject var54 = (SubLObject)module0698.NIL;
        SubLObject var55 = (SubLObject)module0698.NIL;
        SubLObject var56 = (SubLObject)module0698.NIL;
        SubLObject var57 = (SubLObject)module0698.NIL;
        var55 = var52;
        var56 = var55.first();
        for (var57 = (SubLObject)module0698.ZERO_INTEGER; module0698.NIL != var55; var55 = var55.rest(), var56 = var55.first(), var57 = Numbers.add((SubLObject)module0698.ONE_INTEGER, var57)) {
            if (module0698.NIL != module0655.$g5111$.getDynamicValue(var48)) {
                if (module0698.NIL != var54) {
                    var54 = (SubLObject)module0698.NIL;
                }
                else {
                    var54 = (SubLObject)module0698.T;
                }
                var51 = (SubLObject)((module0698.NIL != var54) ? module0698.$ic64$ : module0698.$ic63$);
            }
            final SubLObject var58 = var56.first();
            final SubLObject var59 = conses_high.second(var56);
            module0642.f39028((SubLObject)module0698.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
            final SubLObject var60 = module0015.$g533$.currentBinding(var48);
            try {
                module0015.$g533$.bind((SubLObject)module0698.T, var48);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                final SubLObject var5_57 = module0015.$g533$.currentBinding(var48);
                try {
                    module0015.$g533$.bind((SubLObject)module0698.T, var48);
                    module0642.f39027((SubLObject)module0698.$ic45$, (SubLObject)module0698.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var5_57, var48);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                f42520(var58, var30, var37, var38);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                if (module0698.NIL != var51) {
                    module0642.f39020(module0015.$g374$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39020(var51);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                final SubLObject var5_58 = module0015.$g533$.currentBinding(var48);
                try {
                    module0015.$g533$.bind((SubLObject)module0698.T, var48);
                    if (!var59.numE((SubLObject)module0698.ZERO_INTEGER)) {
                        module0642.f39027((SubLObject)module0698.$ic45$, (SubLObject)module0698.TWO_INTEGER);
                        SubLObject var61;
                        SubLObject var62;
                        for (var61 = Numbers.multiply((SubLObject)module0698.FOUR_INTEGER, Numbers.subtract(var59, (SubLObject)module0698.ONE_INTEGER)), var62 = (SubLObject)module0698.NIL, var62 = (SubLObject)module0698.ZERO_INTEGER; var62.numL(var61); var62 = Numbers.add(var62, (SubLObject)module0698.ONE_INTEGER)) {
                            module0642.f39027((SubLObject)module0698.$ic45$, (SubLObject)module0698.TWO_INTEGER);
                        }
                        module0642.f39019((SubLObject)module0698.$ic65$);
                    }
                    module0642.f39027((SubLObject)module0698.$ic45$, (SubLObject)module0698.TWO_INTEGER);
                    SubLObject var63 = module0697.f42501(var53, var58);
                    SubLObject var64 = (SubLObject)module0698.NIL;
                    var64 = var63.first();
                    while (module0698.NIL != var63) {
                        PrintLow.format(module0015.$g131$.getDynamicValue(var48), (SubLObject)module0698.$ic66$, Hashtables.gethash(var64, var49, (SubLObject)module0698.UNPROVIDED));
                        module0642.f39027((SubLObject)module0698.$ic45$, (SubLObject)module0698.UNPROVIDED);
                        var63 = var63.rest();
                        var64 = var63.first();
                    }
                    module0656.f39804(var58, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
                    if (module0698.NIL != module0697.f42498(var53, var58)) {
                        var50 = Numbers.add(var50, (SubLObject)module0698.ONE_INTEGER);
                        Hashtables.sethash(var58, var49, var50);
                        module0642.f39027((SubLObject)module0698.$ic45$, (SubLObject)module0698.UNPROVIDED);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var48), (SubLObject)module0698.$ic66$, var50);
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
            module0642.f39029((SubLObject)module0698.UNPROVIDED);
        }
        return (SubLObject)module0698.NIL;
    }
    
    public static SubLObject f42520(final SubLObject var55, final SubLObject var30, final SubLObject var37, final SubLObject var38) {
        final SubLThread var56 = SubLProcess.currentSubLThread();
        SubLObject var57 = (SubLObject)module0698.NIL;
        SubLObject var58 = (SubLObject)module0698.NIL;
        if (module0698.NIL == module0655.$g5111$.getDynamicValue(var56)) {
            var58 = (SubLObject)module0698.$ic63$;
        }
        SubLObject var59 = (SubLObject)module0698.NIL;
        SubLObject var60 = (SubLObject)module0698.NIL;
        SubLObject var61 = (SubLObject)module0698.NIL;
        SubLObject var62 = (SubLObject)module0698.NIL;
        var60 = var30;
        var61 = var60.first();
        for (var62 = (SubLObject)module0698.ZERO_INTEGER; module0698.NIL != var60; var60 = var60.rest(), var61 = var60.first(), var62 = Numbers.add((SubLObject)module0698.ONE_INTEGER, var62)) {
            if (module0698.NIL != module0655.$g5111$.getDynamicValue(var56)) {
                if (module0698.NIL != var59) {
                    var59 = (SubLObject)module0698.NIL;
                }
                else {
                    var59 = (SubLObject)module0698.T;
                }
                var58 = (SubLObject)((module0698.NIL != var59) ? module0698.$ic64$ : module0698.$ic63$);
            }
            final SubLObject var63 = (SubLObject)ConsesLow.list(var61, var55);
            if (module0698.NIL != module0697.f42485(var63, (SubLObject)module0698.$ic67$)) {
                if (module0698.NIL != module0697.f42485(var63, (SubLObject)module0698.$ic68$)) {
                    if (module0698.NIL != module0697.f42485(var63, (SubLObject)module0698.$ic69$)) {
                        var57 = PrintLow.format((SubLObject)module0698.NIL, (SubLObject)module0698.$ic70$);
                    }
                    else {
                        var57 = PrintLow.format((SubLObject)module0698.NIL, (SubLObject)module0698.$ic71$);
                    }
                }
                else if (module0698.NIL != module0697.f42485(var63, (SubLObject)module0698.$ic69$)) {
                    var57 = PrintLow.format((SubLObject)module0698.NIL, (SubLObject)module0698.$ic72$);
                }
                else {
                    var57 = PrintLow.format((SubLObject)module0698.NIL, (SubLObject)module0698.$ic73$);
                }
            }
            else if (module0698.NIL != module0697.f42485(var63, (SubLObject)module0698.$ic68$)) {
                if (module0698.NIL != module0697.f42485(var63, (SubLObject)module0698.$ic69$)) {
                    var57 = PrintLow.format((SubLObject)module0698.NIL, (SubLObject)module0698.$ic74$);
                }
                else {
                    var57 = PrintLow.format((SubLObject)module0698.NIL, (SubLObject)module0698.$ic75$);
                }
            }
            else if (module0698.NIL != module0697.f42485(var63, (SubLObject)module0698.$ic69$)) {
                var57 = PrintLow.format((SubLObject)module0698.NIL, (SubLObject)module0698.$ic76$);
            }
            else {
                var57 = PrintLow.format((SubLObject)module0698.NIL, (SubLObject)module0698.$ic77$);
            }
            final SubLObject var64 = module0697.f42485(var63, (SubLObject)module0698.$ic69$);
            final SubLObject var65 = module0697.f42485(var63, (SubLObject)module0698.$ic68$);
            final SubLObject var66 = module0697.f42485(var63, (SubLObject)module0698.$ic67$);
            if (module0698.NIL != var64) {
                if (module0698.NIL != var66) {
                    var58 = module0015.$g512$.getGlobalValue();
                }
                else {
                    var58 = module0015.$g499$.getGlobalValue();
                }
            }
            else if (module0698.NIL != var65) {
                var58 = module0015.$g504$.getGlobalValue();
            }
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g370$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0698.$ic78$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
            if (module0698.NIL != var58) {
                module0642.f39020(module0015.$g374$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                module0642.f39020(var58);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
            final SubLObject var67 = module0015.$g533$.currentBinding(var56);
            try {
                module0015.$g533$.bind((SubLObject)module0698.T, var56);
                final SubLObject var68 = module0217.f14421((SubLObject)ConsesLow.list(var37, var61, var55), var38);
                if (module0698.NIL != var68) {
                    module0642.f39020(module0015.$g381$.getGlobalValue());
                    module0642.f39020(module0015.$g383$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var56), (SubLObject)module0698.$ic79$, module0174.f11025(var68));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                    final SubLObject var5_69 = module0015.$g533$.currentBinding(var56);
                    try {
                        module0015.$g533$.bind((SubLObject)module0698.T, var56);
                        module0656.f39853(var68, (SubLObject)module0698.$ic80$);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_69, var56);
                    }
                    module0642.f39020(module0015.$g382$.getGlobalValue());
                }
                if (module0698.NIL != var64) {
                    module0642.f39069(f42521(var37, var38, var55, var61, (SubLObject)module0698.UNPROVIDED), (SubLObject)module0698.$ic81$, (SubLObject)module0698.UNPROVIDED);
                }
                module0642.f39068(f42521(var37, var38, var55, var61, (SubLObject)module0698.UNPROVIDED), (SubLObject)module0698.$ic82$, var64, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var67, var56);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        return (SubLObject)module0698.NIL;
    }
    
    public static SubLObject f42516() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
        module0642.f39020((SubLObject)module0698.ONE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
        module0642.f39020((SubLObject)module0698.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
        module0642.f39020((SubLObject)module0698.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
        final SubLObject var4 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)module0698.T, var3);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
            final SubLObject var5_70 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)module0698.T, var3);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                final SubLObject var5_71 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)module0698.T, var3);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39020((SubLObject)module0698.ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39020(module0015.$g353$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39020((SubLObject)module0698.ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39020(module0015.$g354$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39020((SubLObject)module0698.THREE_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                    final SubLObject var5_72 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0698.T, var3);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                        final SubLObject var5_73 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)module0698.T, var3);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                            module0642.f39020((SubLObject)module0698.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0698.$ic54$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                            final SubLObject var5_74 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0698.T, var3);
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                module0642.f39020(module0015.$g221$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                                module0642.f39020((SubLObject)module0698.FOUR_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                                final SubLObject var5_75 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0698.T, var3);
                                    module0642.f39019((SubLObject)module0698.$ic83$);
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
                        module0642.f39029((SubLObject)module0698.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                        final SubLObject var5_76 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)module0698.T, var3);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0698.$ic78$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                            if (module0698.NIL != module0015.$g512$.getGlobalValue()) {
                                module0642.f39020(module0015.$g374$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                                module0642.f39020(module0015.$g512$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                            final SubLObject var5_77 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0698.T, var3);
                                module0642.f39020(module0015.$g236$.getGlobalValue());
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                module0642.f39020(module0015.$g221$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                                module0642.f39020((SubLObject)module0698.EIGHT_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                                final SubLObject var5_78 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0698.T, var3);
                                    module0642.f39019((SubLObject)module0698.$ic84$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_78, var3);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                                module0642.f39020(module0015.$g237$.getGlobalValue());
                                module0642.f39068((SubLObject)module0698.$ic85$, (SubLObject)module0698.$ic85$, (SubLObject)module0698.T, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_77, var3);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                            final SubLObject var5_79 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0698.T, var3);
                                module0642.f39019((SubLObject)module0698.$ic86$);
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
                        module0642.f39029((SubLObject)module0698.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                        final SubLObject var5_80 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)module0698.T, var3);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0698.$ic78$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                            if (module0698.NIL != module0015.$g499$.getGlobalValue()) {
                                module0642.f39020(module0015.$g374$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                                module0642.f39020(module0015.$g499$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                            final SubLObject var5_81 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0698.T, var3);
                                module0642.f39020(module0015.$g236$.getGlobalValue());
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                module0642.f39020(module0015.$g221$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                                module0642.f39020((SubLObject)module0698.EIGHT_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                                final SubLObject var5_82 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0698.T, var3);
                                    module0642.f39019((SubLObject)module0698.$ic84$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_82, var3);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                                module0642.f39020(module0015.$g237$.getGlobalValue());
                                module0642.f39068((SubLObject)module0698.$ic85$, (SubLObject)module0698.$ic85$, (SubLObject)module0698.T, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_81, var3);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                            final SubLObject var5_83 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0698.T, var3);
                                module0642.f39019((SubLObject)module0698.$ic87$);
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
                        module0642.f39029((SubLObject)module0698.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                        final SubLObject var5_84 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)module0698.T, var3);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0698.$ic78$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                            if (module0698.NIL != module0015.$g504$.getGlobalValue()) {
                                module0642.f39020(module0015.$g374$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                                module0642.f39020(module0015.$g504$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                            final SubLObject var5_85 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0698.T, var3);
                                final SubLObject var5 = module0014.f697((SubLObject)module0698.$ic2$);
                                final SubLObject var6 = (SubLObject)module0698.$ic88$;
                                final SubLObject var7 = module0014.f694((SubLObject)module0698.$ic2$);
                                final SubLObject var8 = (SubLObject)module0698.ZERO_INTEGER;
                                module0642.f39020(module0015.$g431$.getGlobalValue());
                                module0642.f39020(module0015.$g440$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                                module0642.f39020(var5);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                                if (module0698.NIL != var7) {
                                    module0642.f39020(module0015.$g437$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                                    module0642.f39020(var7);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                                }
                                if (module0698.NIL != var6) {
                                    module0642.f39020(module0015.$g438$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                                    module0642.f39020(module0642.f39049(var6));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                                }
                                if (module0698.NIL != var8) {
                                    module0642.f39020(module0015.$g439$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                                    module0642.f39020(var8);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                                final SubLObject var5_86 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0698.T, var3);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_86, var3);
                                }
                                module0642.f39020(module0015.$g432$.getGlobalValue());
                                module0642.f39068((SubLObject)module0698.$ic85$, (SubLObject)module0698.$ic85$, (SubLObject)module0698.NIL, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_85, var3);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                            final SubLObject var5_87 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0698.T, var3);
                                module0642.f39019((SubLObject)module0698.$ic89$);
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
                        module0642.f39029((SubLObject)module0698.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                        final SubLObject var5_88 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)module0698.T, var3);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0698.$ic78$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                            if (module0698.NIL != module0015.$g504$.getGlobalValue()) {
                                module0642.f39020(module0015.$g374$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                                module0642.f39020(module0015.$g504$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                            final SubLObject var5_89 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0698.T, var3);
                                module0642.f39068((SubLObject)module0698.$ic85$, (SubLObject)module0698.$ic85$, (SubLObject)module0698.NIL, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_89, var3);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                            final SubLObject var5_90 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0698.T, var3);
                                module0642.f39019((SubLObject)module0698.$ic90$);
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
                        module0642.f39029((SubLObject)module0698.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                        final SubLObject var5_91 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)module0698.T, var3);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0698.$ic78$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                            if (module0698.NIL != module0015.$g492$.getGlobalValue()) {
                                module0642.f39020(module0015.$g374$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                                module0642.f39020(module0015.$g492$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0698.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                            final SubLObject var5_92 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0698.T, var3);
                                module0642.f39068((SubLObject)module0698.$ic85$, (SubLObject)module0698.$ic85$, (SubLObject)module0698.NIL, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_92, var3);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0698.UNPROVIDED);
                            final SubLObject var5_93 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0698.T, var3);
                                module0642.f39019((SubLObject)module0698.$ic91$);
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
                        module0642.f39029((SubLObject)module0698.UNPROVIDED);
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
            module0642.f39029((SubLObject)module0698.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var4, var3);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0698.NIL;
    }
    
    public static SubLObject f42522(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = Hashtables.make_hash_table((SubLObject)module0698.$ic92$, (SubLObject)module0698.EQUAL, (SubLObject)module0698.UNPROVIDED);
        if (module0698.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0698.$ic43$);
            return (SubLObject)module0698.NIL;
        }
        SubLObject var4 = var1;
        SubLObject var5 = (SubLObject)module0698.NIL;
        var5 = var4.first();
        while (module0698.NIL != var4) {
            if (var5.isList()) {
                final SubLObject var6 = var5.first();
                final SubLObject var7 = conses_high.second(var5);
                final SubLObject var8 = Hashtables.gethash(var6, var3, (SubLObject)module0698.UNPROVIDED);
                if (var7.equal((SubLObject)module0698.$ic82$)) {
                    if (module0698.NIL == var8) {
                        Hashtables.sethash(var6, var3, (SubLObject)module0698.$ic93$);
                    }
                    else {
                        Hashtables.sethash(var6, var3, (SubLObject)module0698.$ic94$);
                    }
                }
                if (var7.equal((SubLObject)module0698.$ic81$)) {
                    if (module0698.NIL == var8) {
                        Hashtables.sethash(var6, var3, (SubLObject)module0698.$ic95$);
                    }
                    else {
                        Hashtables.sethash(var6, var3, (SubLObject)module0698.$ic94$);
                    }
                }
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        SubLObject var9 = (SubLObject)module0698.NIL;
        SubLObject var10 = (SubLObject)module0698.NIL;
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
                if (var17.eql((SubLObject)module0698.$ic93$)) {
                    PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0698.$ic96$, new SubLObject[] { var13, var16, var15, var14 });
                    module0642.f39026((SubLObject)module0698.UNPROVIDED);
                    module0642.f39019((SubLObject)module0698.$ic97$);
                    module0656.f39804(module0543.f33631((SubLObject)ConsesLow.list(var13, var16, var15), var14, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED), (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39026((SubLObject)module0698.TWO_INTEGER);
                }
                else {
                    if (!var17.eql((SubLObject)module0698.$ic95$)) {
                        continue;
                    }
                    PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0698.$ic98$, new SubLObject[] { var13, var16, var15, var14 });
                    module0642.f39026((SubLObject)module0698.UNPROVIDED);
                    module0642.f39019((SubLObject)module0698.$ic97$);
                    module0656.f39804(module0543.f33658((SubLObject)ConsesLow.list(var13, var16, var15), var14), (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
                    module0642.f39026((SubLObject)module0698.TWO_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var11);
        }
        f42508((SubLObject)module0698.NIL);
        return (SubLObject)module0698.NIL;
    }
    
    public static SubLObject f42521(final SubLObject var37, SubLObject var38, SubLObject var33, SubLObject var105, SubLObject var107) {
        if (var38 == module0698.UNPROVIDED) {
            var38 = (SubLObject)module0698.NIL;
        }
        if (var33 == module0698.UNPROVIDED) {
            var33 = (SubLObject)module0698.NIL;
        }
        if (var105 == module0698.UNPROVIDED) {
            var105 = (SubLObject)module0698.NIL;
        }
        if (var107 == module0698.UNPROVIDED) {
            var107 = (SubLObject)module0698.NIL;
        }
        final SubLObject var108 = module0656.f39842(var37);
        final SubLObject var109 = module0656.f39842(var38);
        final SubLObject var110 = module0656.f39842(var33);
        final SubLObject var111 = module0656.f39842(var105);
        if (module0698.NIL == var37) {
            return (SubLObject)module0698.NIL;
        }
        if (module0698.NIL == var38) {
            return PrintLow.format((SubLObject)module0698.NIL, (SubLObject)module0698.$ic104$, var108);
        }
        if (module0698.NIL == var33) {
            return PrintLow.format((SubLObject)module0698.NIL, (SubLObject)module0698.$ic103$, var108, var109);
        }
        if (module0698.NIL == var105) {
            return PrintLow.format((SubLObject)module0698.NIL, (SubLObject)module0698.$ic102$, new SubLObject[] { var108, var109, var110 });
        }
        if (module0698.NIL != var107) {
            return PrintLow.format((SubLObject)module0698.NIL, (SubLObject)module0698.$ic100$, new SubLObject[] { var108, var109, var110, var111, var107 });
        }
        return PrintLow.format((SubLObject)module0698.NIL, (SubLObject)module0698.$ic101$, new SubLObject[] { var108, var109, var110, var111 });
    }
    
    public static SubLObject f42523(final SubLObject var112) {
        final SubLObject var113 = module0038.f2738(var112, (SubLObject)module0698.$ic105$, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED, (SubLObject)module0698.UNPROVIDED);
        final SubLObject var114 = module0656.f39943(ConsesLow.nth((SubLObject)module0698.ONE_INTEGER, var113), (SubLObject)module0698.UNPROVIDED);
        final SubLObject var115 = module0656.f39943(ConsesLow.nth((SubLObject)module0698.TWO_INTEGER, var113), (SubLObject)module0698.UNPROVIDED);
        final SubLObject var116 = module0656.f39943(ConsesLow.nth((SubLObject)module0698.THREE_INTEGER, var113), (SubLObject)module0698.UNPROVIDED);
        final SubLObject var117 = module0656.f39943(ConsesLow.nth((SubLObject)module0698.FOUR_INTEGER, var113), (SubLObject)module0698.UNPROVIDED);
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
        return (SubLObject)module0698.NIL;
    }
    
    public static SubLObject f42525() {
        return (SubLObject)module0698.NIL;
    }
    
    public static SubLObject f42526() {
        Hashtables.sethash((SubLObject)module0698.$ic0$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0698.$ic1$, (SubLObject)module0698.NIL));
        Hashtables.sethash((SubLObject)module0698.$ic2$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0698.$ic3$, (SubLObject)module0698.NIL));
        Hashtables.sethash((SubLObject)module0698.$ic4$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0698.$ic5$, (SubLObject)module0698.NIL));
        Hashtables.sethash((SubLObject)module0698.$ic6$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0698.$ic7$, (SubLObject)module0698.NIL));
        Hashtables.sethash((SubLObject)module0698.$ic8$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0698.$ic9$, (SubLObject)module0698.NIL));
        module0015.f873((SubLObject)module0698.$ic10$);
        module0656.f39840((SubLObject)module0698.$ic14$, (SubLObject)module0698.$ic15$, (SubLObject)module0698.ONE_INTEGER);
        module0656.f39821((SubLObject)module0698.$ic14$, (SubLObject)module0698.$ic11$, (SubLObject)module0698.$ic16$, (SubLObject)module0698.$ic17$);
        Hashtables.sethash((SubLObject)module0698.$ic18$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0698.$ic19$, (SubLObject)module0698.NIL));
        module0015.f873((SubLObject)module0698.$ic53$);
        module0015.f873((SubLObject)module0698.$ic99$);
        return (SubLObject)module0698.NIL;
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
        $ic0$ = SubLObjectFactory.makeKeyword("BLUE-BALL");
        $ic1$ = SubLObjectFactory.makeString("blue.gif");
        $ic2$ = SubLObjectFactory.makeKeyword("GREEN-BALL");
        $ic3$ = SubLObjectFactory.makeString("green.gif");
        $ic4$ = SubLObjectFactory.makeKeyword("RED-BALL");
        $ic5$ = SubLObjectFactory.makeString("red.gif");
        $ic6$ = SubLObjectFactory.makeKeyword("WHITE-BALL");
        $ic7$ = SubLObjectFactory.makeString("white.gif");
        $ic8$ = SubLObjectFactory.makeKeyword("YELLOW-BALL");
        $ic9$ = SubLObjectFactory.makeString("yellow.gif");
        $ic10$ = SubLObjectFactory.makeSymbol("ST-SIMILARITY-ENTRANCE");
        $ic11$ = SubLObjectFactory.makeString("Similarity");
        $ic12$ = SubLObjectFactory.makeKeyword("MAIN");
        $ic13$ = SubLObjectFactory.makeString("st-similarity-entrance");
        $ic14$ = SubLObjectFactory.makeKeyword("SIMILARITY");
        $ic15$ = SubLObjectFactory.makeSymbol("S#46494", "CYC");
        $ic16$ = SubLObjectFactory.makeString("Sim");
        $ic17$ = SubLObjectFactory.makeString("Similarity Tool");
        $ic18$ = SubLObjectFactory.makeKeyword("ST-SIMILARITY");
        $ic19$ = SubLObjectFactory.makeString("st-similarity.html");
        $ic20$ = SubLObjectFactory.makeString("Similarity Tool Choose");
        $ic21$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic22$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic23$ = SubLObjectFactory.makeString("stylesheet");
        $ic24$ = SubLObjectFactory.makeString("text/css");
        $ic25$ = SubLObjectFactory.makeKeyword("SHA1");
        $ic26$ = SubLObjectFactory.makeString("text/javascript");
        $ic27$ = SubLObjectFactory.makeString("yui-skin-sam");
        $ic28$ = SubLObjectFactory.makeString("reloadFrameButton");
        $ic29$ = SubLObjectFactory.makeString("button");
        $ic30$ = SubLObjectFactory.makeString("reload");
        $ic31$ = SubLObjectFactory.makeString("Refresh Frames");
        $ic32$ = SubLObjectFactory.makeKeyword("CLEAR-HISTORY");
        $ic33$ = SubLObjectFactory.makeString("cg?cb-similarity");
        $ic34$ = SubLObjectFactory.makeKeyword("POST");
        $ic35$ = SubLObjectFactory.makeString("cb-similarity");
        $ic36$ = SubLObjectFactory.makeString("Run Similarity Tool");
        $ic37$ = SubLObjectFactory.makeString("Please choose two or more constants.");
        $ic38$ = SubLObjectFactory.makeString("Recent Constants :");
        $ic39$ = SubLObjectFactory.makeString("None");
        $ic40$ = SubLObjectFactory.makeString("Recent NATs :");
        $ic41$ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $ic42$ = SubLObjectFactory.makeSymbol("S#13637", "CYC");
        $ic43$ = SubLObjectFactory.makeString("the Similarity Tool page");
        $ic44$ = SubLObjectFactory.makeString("Cannot show similarity for just one constant: ~A.");
        $ic45$ = SubLObjectFactory.makeKeyword("NBSP");
        $ic46$ = SubLObjectFactory.makeString("Check or uncheck the boxes to make or remove assertions.");
        $ic47$ = SubLObjectFactory.makeString("cg");
        $ic48$ = SubLObjectFactory.makeString("SimilarityForm");
        $ic49$ = SubLObjectFactory.makeString("cb-similarity-assert");
        $ic50$ = SubLObjectFactory.makeString("t");
        $ic51$ = SubLObjectFactory.makeString("Reset");
        $ic52$ = SubLObjectFactory.makeString("Submit");
        $ic53$ = SubLObjectFactory.makeSymbol("CB-SIMILARITY");
        $ic54$ = SubLObjectFactory.makeKeyword("CENTER");
        $ic55$ = SubLObjectFactory.makeString("&nbsp;");
        $ic56$ = SubLObjectFactory.makeKeyword("LEFT");
        $ic57$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic58$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic59$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic60$ = SubLObjectFactory.makeString("(");
        $ic61$ = SubLObjectFactory.makeString(")");
        $ic62$ = SubLObjectFactory.makeInteger(32);
        $ic63$ = SubLObjectFactory.makeString("#cccccc");
        $ic64$ = SubLObjectFactory.makeString("#dddddd");
        $ic65$ = SubLObjectFactory.makeString("|__");
        $ic66$ = SubLObjectFactory.makeString("(~A)");
        $ic67$ = SubLObjectFactory.makeKeyword("BASIS");
        $ic68$ = SubLObjectFactory.makeKeyword("IMPLIED");
        $ic69$ = SubLObjectFactory.makeKeyword("ASSERTED");
        $ic70$ = SubLObjectFactory.makeString("BIA ");
        $ic71$ = SubLObjectFactory.makeString("BI_ ");
        $ic72$ = SubLObjectFactory.makeString("B_A ");
        $ic73$ = SubLObjectFactory.makeString("B__ ");
        $ic74$ = SubLObjectFactory.makeString("_IA ");
        $ic75$ = SubLObjectFactory.makeString("_I_ ");
        $ic76$ = SubLObjectFactory.makeString("__A ");
        $ic77$ = SubLObjectFactory.makeString("___ ");
        $ic78$ = SubLObjectFactory.makeKeyword("RIGHT");
        $ic79$ = SubLObjectFactory.makeString("cg?cb-af&~a");
        $ic80$ = SubLObjectFactory.makeKeyword("BOTTOM");
        $ic81$ = SubLObjectFactory.makeString("a");
        $ic82$ = SubLObjectFactory.makeString("x");
        $ic83$ = SubLObjectFactory.makeString("L E G E N D");
        $ic84$ = SubLObjectFactory.makeString("*");
        $ic85$ = SubLObjectFactory.makeString("");
        $ic86$ = SubLObjectFactory.makeString("Asserted in KB.");
        $ic87$ = SubLObjectFactory.makeString("Asserted in KB, but redundant.");
        $ic88$ = SubLObjectFactory.makeKeyword("TOP");
        $ic89$ = SubLObjectFactory.makeString("Shown as asserted in KB by a forward rule.");
        $ic90$ = SubLObjectFactory.makeString("Not asserted in KB, but true.");
        $ic91$ = SubLObjectFactory.makeString("Neither asserted in KB nor true.");
        $ic92$ = SubLObjectFactory.makeInteger(64);
        $ic93$ = SubLObjectFactory.makeSymbol("ASSERT");
        $ic94$ = SubLObjectFactory.makeSymbol("S#40015", "CYC");
        $ic95$ = SubLObjectFactory.makeSymbol("S#46507", "CYC");
        $ic96$ = SubLObjectFactory.makeString("Asserting: (~A ~A ~A) in ~A");
        $ic97$ = SubLObjectFactory.makeString("Result: ");
        $ic98$ = SubLObjectFactory.makeString("Unasserting: (~A ~A ~A) from ~A");
        $ic99$ = SubLObjectFactory.makeSymbol("CB-SIMILARITY-ASSERT");
        $ic100$ = SubLObjectFactory.makeString("st|~A|~A|~A|~A|~A|");
        $ic101$ = SubLObjectFactory.makeString("st|~A|~A|~A|~A|");
        $ic102$ = SubLObjectFactory.makeString("st|~A|~A|~A|");
        $ic103$ = SubLObjectFactory.makeString("st|~A|~A|");
        $ic104$ = SubLObjectFactory.makeString("st|~A|");
        $ic105$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("|"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0698.class
	Total time: 804 ms
	
	Decompiled with Procyon 0.5.32.
*/