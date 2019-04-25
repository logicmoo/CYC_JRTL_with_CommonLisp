package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0715 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0715";
    public static final String myFingerPrint = "8dddd3db5573e3b4d2046fd1c642dc9711b474ac41c6c437374a0f87cc2fe05f";
    private static SubLSymbol $g5672$;
    private static SubLSymbol $g5673$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLInteger $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLList $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLList $ic58$;
    private static final SubLList $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLObject $ic68$;
    private static final SubLObject $ic69$;
    private static final SubLString $ic70$;
    private static final SubLList $ic71$;
    private static final SubLString $ic72$;
    private static final SubLInteger $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLList $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLString $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    
    public static SubLObject f43983(SubLObject var1) {
        if (var1 == module0715.UNPROVIDED) {
            var1 = (SubLObject)module0715.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0715.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0715.$ic2$);
        }
        else {
            final SubLObject var3 = (SubLObject)module0715.$ic3$;
            final SubLObject var4 = module0015.$g538$.currentBinding(var2);
            try {
                module0015.$g538$.bind((module0715.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)module0715.UNPROVIDED, (SubLObject)module0715.UNPROVIDED, (SubLObject)module0715.UNPROVIDED), var2);
                module0642.f39020((SubLObject)module0715.$ic4$);
                module0642.f39029((SubLObject)module0715.UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
                final SubLObject var5 = module0014.f672((SubLObject)module0715.$ic5$);
                module0642.f39029((SubLObject)module0715.UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                module0642.f39020((SubLObject)module0715.$ic6$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                if (module0715.NIL != var5) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                    module0642.f39020(var5);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                module0642.f39020((SubLObject)module0715.$ic7$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0715.UNPROVIDED);
                module0016.f941();
                if (module0715.NIL != var3) {
                    module0642.f39029((SubLObject)module0715.UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var3);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0666.f40471();
                module0666.f40487();
                module0666.f40535();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)module0715.UNPROVIDED);
                final SubLObject var4_6 = module0015.$g535$.currentBinding(var2);
                try {
                    module0015.$g535$.bind((SubLObject)module0715.T, var2);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (module0715.NIL != module0015.$g132$.getDynamicValue(var2)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                    module0642.f39020((SubLObject)module0715.$ic10$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0715.UNPROVIDED);
                    final SubLObject var4_7 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0715.T, var2);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                        module0642.f39020((SubLObject)module0715.$ic11$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0715.UNPROVIDED);
                        final SubLObject var4_8 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)module0715.T, var2);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                            module0642.f39020((SubLObject)module0715.$ic12$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                            module0642.f39020((SubLObject)module0715.$ic13$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                            module0642.f39019((SubLObject)module0715.$ic14$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0715.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_8, var2);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (module0715.NIL != var3) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)module0715.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0715.UNPROVIDED);
                            module0642.f39019(var3);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)module0715.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0715.UNPROVIDED);
                        }
                        module0644.f39197();
                        final SubLObject var6 = module0656.f39832((SubLObject)module0715.NIL);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                        module0642.f39020(module0015.$g285$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                        module0642.f39020((SubLObject)module0715.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                        if (module0715.NIL != var6) {
                            module0642.f39020(module0015.$g286$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                            module0642.f39020(var6);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0715.UNPROVIDED);
                        final SubLObject var4_9 = module0015.$g533$.currentBinding(var2);
                        final SubLObject var7 = module0015.$g541$.currentBinding(var2);
                        final SubLObject var8 = module0015.$g539$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)module0715.T, var2);
                            module0015.$g541$.bind((SubLObject)module0715.T, var2);
                            module0015.$g539$.bind(module0015.f797(), var2);
                            module0642.f39069((SubLObject)module0715.$ic16$, (SubLObject)module0715.T, (SubLObject)module0715.UNPROVIDED);
                            module0656.f39870((SubLObject)module0715.$ic0$, (SubLObject)module0715.NIL, (SubLObject)module0715.UNPROVIDED);
                            module0656.f39790((SubLObject)module0715.$ic17$, (SubLObject)module0715.$ic18$);
                            module0642.f39026((SubLObject)module0715.TWO_INTEGER);
                            module0642.f39073((SubLObject)module0715.$ic19$);
                            module0642.f39032((SubLObject)module0715.TWO_INTEGER);
                            module0642.f39074((SubLObject)module0715.$ic20$, (SubLObject)module0715.$ic21$, (SubLObject)module0715.UNPROVIDED);
                            module0642.f39026((SubLObject)module0715.TWO_INTEGER);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0715.$ic22$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)module0715.UNPROVIDED);
                            module0642.f39032((SubLObject)module0715.FIVE_INTEGER);
                            module0642.f39075(module0642.f39130((SubLObject)module0715.$ic23$), module0038.$g916$.getGlobalValue(), (SubLObject)module0715.$ic24$);
                            module0642.f39026((SubLObject)module0715.TWO_INTEGER);
                            module0642.f39021((SubLObject)module0715.$ic25$);
                            final SubLObject var9 = module0642.f39130((SubLObject)module0715.$ic26$);
                            module0642.f39026((SubLObject)module0715.UNPROVIDED);
                            module0642.f39032((SubLObject)module0715.TWO_INTEGER);
                            module0642.f39072(var9, (SubLObject)module0715.$ic27$, (SubLObject)module0715.T, (SubLObject)module0715.UNPROVIDED);
                            module0642.f39032((SubLObject)module0715.UNPROVIDED);
                            module0642.f39019((SubLObject)module0715.$ic28$);
                            module0642.f39026((SubLObject)module0715.UNPROVIDED);
                            module0642.f39032((SubLObject)module0715.TWO_INTEGER);
                            module0642.f39072(var9, (SubLObject)module0715.$ic29$, (SubLObject)module0715.NIL, (SubLObject)module0715.UNPROVIDED);
                            module0642.f39032((SubLObject)module0715.UNPROVIDED);
                            module0642.f39019((SubLObject)module0715.$ic30$);
                            module0642.f39075(module0642.f39130((SubLObject)module0715.$ic31$), module0038.$g916$.getGlobalValue(), (SubLObject)module0715.TEN_INTEGER);
                            module0642.f39026((SubLObject)module0715.UNPROVIDED);
                            module0642.f39032((SubLObject)module0715.TWO_INTEGER);
                            module0642.f39072(var9, (SubLObject)module0715.$ic32$, (SubLObject)module0715.NIL, (SubLObject)module0715.UNPROVIDED);
                            module0642.f39032((SubLObject)module0715.UNPROVIDED);
                            module0642.f39019((SubLObject)module0715.$ic33$);
                            module0642.f39026((SubLObject)module0715.TWO_INTEGER);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0715.$ic34$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)module0715.UNPROVIDED);
                            module0642.f39032((SubLObject)module0715.FIVE_INTEGER);
                            module0642.f39139(module0642.f39130((SubLObject)module0715.$ic35$), (SubLObject)module0715.$ic36$, (SubLObject)module0715.$ic24$);
                            module0642.f39026((SubLObject)module0715.TWO_INTEGER);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0683.f41673((SubLObject)module0715.$ic37$, (SubLObject)module0715.$ic38$, (SubLObject)module0715.UNPROVIDED, (SubLObject)module0715.UNPROVIDED, (SubLObject)module0715.UNPROVIDED);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)module0715.UNPROVIDED);
                            module0642.f39032((SubLObject)module0715.FIVE_INTEGER);
                            module0642.f39075(module0642.f39130((SubLObject)module0715.$ic39$), module0038.$g916$.getGlobalValue(), (SubLObject)module0715.TEN_INTEGER);
                            module0642.f39026((SubLObject)module0715.TWO_INTEGER);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0683.f41673((SubLObject)module0715.$ic40$, (SubLObject)module0715.$ic41$, (SubLObject)module0715.UNPROVIDED, (SubLObject)module0715.UNPROVIDED, (SubLObject)module0715.UNPROVIDED);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)module0715.UNPROVIDED);
                            module0642.f39032((SubLObject)module0715.FIVE_INTEGER);
                            module0642.f39075(module0642.f39130((SubLObject)module0715.$ic42$), module0038.$g916$.getGlobalValue(), (SubLObject)module0715.TEN_INTEGER);
                            module0642.f39026((SubLObject)module0715.TWO_INTEGER);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0715.$ic43$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)module0715.UNPROVIDED);
                            module0642.f39032((SubLObject)module0715.FIVE_INTEGER);
                            final SubLObject var10 = module0642.f39130((SubLObject)module0715.$ic44$);
                            module0666.f40467(var10, (SubLObject)module0715.$ic45$, module0715.$ic46$, (SubLObject)module0715.UNPROVIDED, (SubLObject)module0715.UNPROVIDED, (SubLObject)module0715.UNPROVIDED);
                            module0642.f39032((SubLObject)module0715.UNPROVIDED);
                            module0642.f39075(var10, module0038.$g916$.getGlobalValue(), (SubLObject)module0715.UNPROVIDED);
                            module0642.f39026((SubLObject)module0715.UNPROVIDED);
                            module0015.f799(module0015.$g539$.getDynamicValue(var2));
                        }
                        finally {
                            module0015.$g539$.rebind(var8, var2);
                            module0015.$g541$.rebind(var7, var2);
                            module0015.$g533$.rebind(var4_9, var2);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)module0715.UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var4_7, var2);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)module0715.UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var4_6, var2);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)module0715.UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var4, var2);
            }
        }
        return (SubLObject)module0715.NIL;
    }
    
    public static SubLObject f43984(final SubLObject var1) {
        final SubLObject var2 = (SubLObject)module0715.$ic35$;
        final SubLObject var3 = module0038.f2735(module0642.f39132(var2, var1));
        final SubLObject var4 = module0642.f39132((SubLObject)module0715.$ic23$, var1);
        final SubLObject var5 = (module0715.NIL != module0038.f2611(var3)) ? var3 : var4;
        final SubLObject var6 = module0642.f39132((SubLObject)module0715.$ic39$, var1);
        final SubLObject var7 = module0642.f39132((SubLObject)module0715.$ic42$, var1);
        final SubLObject var8 = module0642.f39132((SubLObject)module0715.$ic44$, var1);
        final SubLObject var9 = (SubLObject)((module0715.NIL != module0038.f2611(var8)) ? module0656.f39943(var8, (SubLObject)module0715.UNPROVIDED) : module0715.NIL);
        final SubLObject var10 = module0642.f39132((SubLObject)module0715.$ic26$, var1);
        final SubLObject var11 = (SubLObject)SubLObjectFactory.makeBoolean(!var10.equal((SubLObject)module0715.$ic27$));
        final SubLObject var12 = Equality.equal(var10, (SubLObject)module0715.$ic29$);
        final SubLObject var13 = module0642.f39132((SubLObject)module0715.$ic31$, var1);
        SubLObject var14 = (SubLObject)module0715.NIL;
        if (module0715.NIL == module0589.f35909(var5) && (module0715.NIL == module0038.f2611(var5) || module0715.NIL == module0075.f5218(var5))) {
            var14 = Sequences.cconcatenate((SubLObject)module0715.$ic48$, new SubLObject[] { module0006.f205(var5), module0006.$g11$.getGlobalValue(), module0715.$ic49$ });
        }
        else if (module0715.NIL == module0038.f2611(var4)) {
            var14 = Sequences.cconcatenate(module0006.f205(var4), (SubLObject)module0715.$ic50$);
        }
        else if (module0715.NIL != var12 && module0715.NIL != module0038.f2608(var13)) {
            var14 = Sequences.copy_seq((SubLObject)module0715.$ic51$);
        }
        if (module0715.NIL != var14) {
            module0656.f39789(var14, (SubLObject)module0715.UNPROVIDED, (SubLObject)module0715.UNPROVIDED, (SubLObject)module0715.UNPROVIDED, (SubLObject)module0715.UNPROVIDED, (SubLObject)module0715.UNPROVIDED);
        }
        else {
            f43985(module0035.f2333((SubLObject)module0715.$ic52$, (SubLObject)ConsesLow.list(var4, var5, var6, var7, var9, var11, var12, var13)));
        }
        return (SubLObject)module0715.NIL;
    }
    
    public static SubLObject f43985(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = conses_high.getf(var28, (SubLObject)module0715.$ic54$, (SubLObject)module0715.UNPROVIDED);
        final SubLObject var31 = module0709.f43461(var28);
        final SubLObject var32 = (SubLObject)module0715.NIL;
        final SubLObject var33 = module0015.$g538$.currentBinding(var29);
        try {
            module0015.$g538$.bind((module0715.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var29))) ? module0015.$g538$.getDynamicValue(var29) : module0057.f4173((SubLObject)module0715.UNPROVIDED, (SubLObject)module0715.UNPROVIDED, (SubLObject)module0715.UNPROVIDED), var29);
            module0642.f39020((SubLObject)module0715.$ic4$);
            module0642.f39029((SubLObject)module0715.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var29), module0655.$g5142$.getDynamicValue(var29));
            final SubLObject var34 = module0014.f672((SubLObject)module0715.$ic5$);
            module0642.f39029((SubLObject)module0715.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
            module0642.f39020((SubLObject)module0715.$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
            if (module0715.NIL != var34) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                module0642.f39020(var34);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
            module0642.f39020((SubLObject)module0715.$ic7$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0715.UNPROVIDED);
            module0016.f941();
            if (module0715.NIL != var32) {
                module0642.f39029((SubLObject)module0715.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var32);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0715.UNPROVIDED);
            final SubLObject var4_30 = module0015.$g535$.currentBinding(var29);
            try {
                module0015.$g535$.bind((SubLObject)module0715.T, var29);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0715.NIL != module0015.$g132$.getDynamicValue(var29)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var29)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                module0642.f39020((SubLObject)module0715.$ic10$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0715.UNPROVIDED);
                final SubLObject var4_31 = module0015.$g533$.currentBinding(var29);
                try {
                    module0015.$g533$.bind((SubLObject)module0715.T, var29);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                    module0642.f39020((SubLObject)module0715.$ic11$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0715.UNPROVIDED);
                    final SubLObject var4_32 = module0015.$g533$.currentBinding(var29);
                    try {
                        module0015.$g533$.bind((SubLObject)module0715.T, var29);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                        module0642.f39020((SubLObject)module0715.$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                        module0642.f39020((SubLObject)module0715.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                        module0642.f39019((SubLObject)module0715.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0715.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_32, var29);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0715.NIL != var32) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0715.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0715.UNPROVIDED);
                        module0642.f39019(var32);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0715.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0715.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g189$.getGlobalValue());
                    module0642.f39020((SubLObject)module0715.TWO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0715.UNPROVIDED);
                    module0642.f39019((SubLObject)module0715.$ic55$);
                    if (module0715.NIL != var30) {
                        module0656.f39804(var30, (SubLObject)module0715.UNPROVIDED, (SubLObject)module0715.UNPROVIDED);
                    }
                    else {
                        module0642.f39019((SubLObject)module0715.$ic56$);
                    }
                    module0642.f39020(module0015.$g190$.getGlobalValue());
                    module0642.f39020((SubLObject)module0715.TWO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0715.UNPROVIDED);
                    f43986(var31, (SubLObject)module0715.$ic57$, (SubLObject)module0715.T);
                    module0642.f39029((SubLObject)module0715.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_31, var29);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0715.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_30, var29);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0715.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var33, var29);
        }
        return (SubLObject)module0715.NIL;
    }
    
    public static SubLObject f43987(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0715.NIL;
        SubLObject var3 = (SubLObject)module0715.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0715.$ic59$);
        var2 = var1.first();
        SubLObject var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0715.$ic59$);
        var3 = var4.first();
        var4 = var4.rest();
        if (module0715.NIL == var4) {
            final SubLObject var5 = module0038.f2642(var2);
            if (module0715.NIL == module0709.f43467(var5)) {
                module0656.f39789((SubLObject)module0715.$ic60$, var2, (SubLObject)module0715.UNPROVIDED, (SubLObject)module0715.UNPROVIDED, (SubLObject)module0715.UNPROVIDED, (SubLObject)module0715.UNPROVIDED);
            }
            else {
                f43988(var5, Equality.equalp(var3, (SubLObject)module0715.$ic61$));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0715.$ic59$);
        }
        return (SubLObject)module0715.NIL;
    }
    
    public static SubLObject f43988(final SubLObject var37, final SubLObject var38) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        final SubLObject var40 = module0709.f43466(var37);
        final SubLObject var41 = module0709.f43464(var37);
        final SubLObject var42 = module0709.f43465(var37);
        final SubLObject var43 = module0172.f10922(module0709.f43462(var37));
        final SubLObject var44 = f43989(var37);
        module0642.f39020((SubLObject)module0715.$ic4$);
        module0642.f39029((SubLObject)module0715.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var39), module0655.$g5142$.getDynamicValue(var39));
        final SubLObject var45 = module0014.f672((SubLObject)module0715.$ic5$);
        module0642.f39029((SubLObject)module0715.UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
        module0642.f39020((SubLObject)module0715.$ic6$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
        if (module0715.NIL != var45) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
            module0642.f39020(var45);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
        module0642.f39020((SubLObject)module0715.$ic7$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0715.UNPROVIDED);
        module0642.f39029((SubLObject)module0715.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)module0715.$ic2$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39055((SubLObject)((module0715.NIL != var38 && module0715.NIL == var40) ? module0715.$g5673$.getDynamicValue(var39) : module0715.NIL));
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0715.UNPROVIDED);
        final SubLObject var46 = module0015.$g535$.currentBinding(var39);
        try {
            module0015.$g535$.bind((SubLObject)module0715.T, var39);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0715.UNPROVIDED);
            final SubLObject var4_43 = module0015.$g533$.currentBinding(var39);
            try {
                module0015.$g533$.bind((SubLObject)module0715.T, var39);
                module0642.f39020(module0015.$g189$.getGlobalValue());
                module0642.f39020((SubLObject)module0715.TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0715.UNPROVIDED);
                if (module0715.NIL == var40) {
                    module0642.f39019((SubLObject)module0715.$ic55$);
                }
                if (module0715.NIL != var43) {
                    module0656.f39804(var43, (SubLObject)module0715.UNPROVIDED, (SubLObject)module0715.UNPROVIDED);
                }
                else {
                    module0642.f39019((SubLObject)module0715.$ic56$);
                }
                module0642.f39020(module0015.$g190$.getGlobalValue());
                module0642.f39020((SubLObject)module0715.TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0715.UNPROVIDED);
                PrintLow.format(module0015.$g131$.getDynamicValue(var39), (SubLObject)module0715.$ic63$, (SubLObject)((module0715.NIL != var40) ? module0715.$ic64$ : module0715.$ic65$));
                PrintLow.format(module0015.$g131$.getDynamicValue(var39), (SubLObject)module0715.$ic66$, module0051.f3574(var44, (SubLObject)module0715.ZERO_INTEGER));
                if (module0715.NIL != module0212.f13762(var43)) {
                    final SubLObject var4_44 = module0147.$g2094$.currentBinding(var39);
                    final SubLObject var47 = module0147.$g2095$.currentBinding(var39);
                    try {
                        module0147.$g2094$.bind((SubLObject)module0715.$ic67$, var39);
                        module0147.$g2095$.bind(module0715.$ic68$, var39);
                        final SubLObject var48 = Sequences.length(module0219.f14509(var43, (SubLObject)module0715.TWO_INTEGER, module0715.$ic69$, (SubLObject)module0715.UNPROVIDED, (SubLObject)module0715.UNPROVIDED));
                        PrintLow.format(module0015.$g131$.getDynamicValue(var39), (SubLObject)module0715.$ic70$, var48);
                    }
                    finally {
                        module0147.$g2095$.rebind(var47, var39);
                        module0147.$g2094$.rebind(var4_44, var39);
                    }
                }
                module0642.f39026((SubLObject)module0715.TWO_INTEGER);
                if (module0715.NIL != module0048.f3293(var44)) {
                    module0642.f39020(module0015.$g149$.getGlobalValue());
                    module0642.f39020(module0015.$g152$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                    module0642.f39020(module0015.$g250$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0715.UNPROVIDED);
                    final SubLObject var4_45 = module0015.$g533$.currentBinding(var39);
                    try {
                        module0015.$g533$.bind((SubLObject)module0715.T, var39);
                        SubLObject var49 = (SubLObject)module0715.NIL;
                        SubLObject var50 = (SubLObject)module0715.NIL;
                        SubLObject var51 = (SubLObject)module0715.NIL;
                        var49 = Sequences.reverse(var41);
                        var50 = var49.first();
                        for (var51 = (SubLObject)module0715.ZERO_INTEGER; module0715.NIL != var49; var49 = var49.rest(), var50 = var49.first(), var51 = Numbers.add((SubLObject)module0715.ONE_INTEGER, var51)) {
                            if (module0715.NIL != module0035.f2014(var50)) {
                                SubLObject var53;
                                final SubLObject var52 = var53 = var50;
                                SubLObject var54 = (SubLObject)module0715.NIL;
                                SubLObject var55 = (SubLObject)module0715.NIL;
                                SubLObject var56 = (SubLObject)module0715.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var53, var52, (SubLObject)module0715.$ic71$);
                                var54 = var53.first();
                                var53 = var53.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var53, var52, (SubLObject)module0715.$ic71$);
                                var55 = var53.first();
                                var53 = var53.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var53, var52, (SubLObject)module0715.$ic71$);
                                var56 = var53.first();
                                var53 = var53.rest();
                                if (module0715.NIL == var53) {
                                    PrintLow.format(module0015.$g131$.getDynamicValue(var39), (SubLObject)module0715.$ic72$, ConsesLow.nth(var51, module0715.$g5672$.getGlobalValue()));
                                    module0642.f39026((SubLObject)module0715.UNPROVIDED);
                                    module0642.f39093(Numbers.truncate(Numbers.multiply((SubLObject)module0715.$ic73$, var55), (SubLObject)module0715.UNPROVIDED), (SubLObject)module0715.$ic73$, module0048.f3313(var56, var44, (SubLObject)module0715.UNPROVIDED), (SubLObject)module0715.UNPROVIDED, (SubLObject)module0715.UNPROVIDED);
                                    PrintLow.format(module0015.$g131$.getDynamicValue(var39), (SubLObject)module0715.$ic74$, module0051.f3552(var54), module0051.f3574(var56, (SubLObject)module0715.ZERO_INTEGER));
                                    if (var55.isPositive()) {
                                        final SubLObject var57 = Numbers.truncate(Numbers.divide(var56, var55), (SubLObject)module0715.UNPROVIDED);
                                        if (!Numbers.subtract(var57, var56).numLE(module0715.$g5673$.getDynamicValue(var39))) {
                                            module0642.f39026((SubLObject)module0715.UNPROVIDED);
                                            PrintLow.format(module0015.$g131$.getDynamicValue(var39), (SubLObject)module0715.$ic75$, module0051.f3552(Numbers.add(var54, var57)), module0051.f3574(var57, (SubLObject)module0715.ZERO_INTEGER));
                                        }
                                    }
                                    module0642.f39026((SubLObject)module0715.TWO_INTEGER);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)module0715.$ic71$);
                                }
                            }
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var4_45, var39);
                    }
                    module0642.f39020(module0015.$g150$.getGlobalValue());
                }
                module0642.f39026((SubLObject)module0715.UNPROVIDED);
                if (module0715.NIL != var42) {
                    module0642.f39020(module0015.$g149$.getGlobalValue());
                    module0642.f39020(module0015.$g152$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                    module0642.f39020(module0015.$g251$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0715.UNPROVIDED);
                    final SubLObject var4_46 = module0015.$g533$.currentBinding(var39);
                    try {
                        module0015.$g533$.bind((SubLObject)module0715.T, var39);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        PrintLow.format(module0015.$g131$.getDynamicValue(var39), (SubLObject)module0715.$ic76$, Sequences.length(var42));
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var4_46, var39);
                    }
                    module0642.f39020(module0015.$g150$.getGlobalValue());
                    module0642.f39026((SubLObject)module0715.UNPROVIDED);
                    SubLObject var58 = var42;
                    SubLObject var59 = (SubLObject)module0715.NIL;
                    var59 = var58.first();
                    while (module0715.NIL != var58) {
                        SubLObject var61;
                        final SubLObject var60 = var61 = var59;
                        SubLObject var62 = (SubLObject)module0715.NIL;
                        SubLObject var63 = (SubLObject)module0715.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var61, var60, (SubLObject)module0715.$ic77$);
                        var62 = var61.first();
                        var61 = var61.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var61, var60, (SubLObject)module0715.$ic77$);
                        var63 = var61.first();
                        var61 = var61.rest();
                        if (module0715.NIL == var61) {
                            module0656.f39804(var62, (SubLObject)module0715.ZERO_INTEGER, (SubLObject)module0715.T);
                            module0642.f39026((SubLObject)module0715.UNPROVIDED);
                            module0642.f39019(var63);
                            module0642.f39051((SubLObject)module0715.UNPROVIDED, (SubLObject)module0715.UNPROVIDED);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var60, (SubLObject)module0715.$ic77$);
                        }
                        var58 = var58.rest();
                        var59 = var58.first();
                    }
                    module0642.f39026((SubLObject)module0715.UNPROVIDED);
                }
                if (module0715.NIL != var40) {
                    f43986(var37, (SubLObject)module0715.$ic78$, (SubLObject)module0715.NIL);
                }
                else if (module0715.NIL != var38) {
                    f43986(var37, (SubLObject)module0715.$ic79$, (SubLObject)module0715.NIL);
                }
                else {
                    f43986(var37, (SubLObject)module0715.$ic80$, (SubLObject)module0715.T);
                }
                module0642.f39020(module0015.$g149$.getGlobalValue());
                module0642.f39020(module0015.$g152$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                module0642.f39020(module0015.$g250$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0715.UNPROVIDED);
                final SubLObject var4_47 = module0015.$g533$.currentBinding(var39);
                try {
                    module0015.$g533$.bind((SubLObject)module0715.T, var39);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var39), (SubLObject)module0715.$ic81$, module0051.f3552((SubLObject)module0715.UNPROVIDED));
                }
                finally {
                    module0015.$g533$.rebind(var4_47, var39);
                }
                module0642.f39020(module0015.$g150$.getGlobalValue());
                module0642.f39029((SubLObject)module0715.UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var4_43, var39);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0715.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var46, var39);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0715.UNPROVIDED);
        return (SubLObject)module0715.NIL;
    }
    
    public static SubLObject f43989(final SubLObject var37) {
        final SubLObject var38 = module0709.f43466(var37);
        final SubLObject var39 = module0709.f43464(var37);
        SubLObject var40 = (SubLObject)module0715.ZERO_INTEGER;
        if (module0715.NIL != var39) {
            SubLObject var41 = (module0715.NIL != var38) ? var39.rest() : var39;
            SubLObject var42 = (SubLObject)module0715.NIL;
            var42 = var41.first();
            while (module0715.NIL != var41) {
                var40 = Numbers.add(var40, conses_high.third(var42));
                var41 = var41.rest();
                var42 = var41.first();
            }
        }
        return var40;
    }
    
    public static SubLObject f43986(final SubLObject var37, SubLObject var63, SubLObject var64) {
        if (var63 == module0715.UNPROVIDED) {
            var63 = (SubLObject)module0715.NIL;
        }
        if (var64 == module0715.UNPROVIDED) {
            var64 = (SubLObject)module0715.NIL;
        }
        final SubLThread var65 = SubLProcess.currentSubLThread();
        assert module0715.NIL != module0004.f106(var37) : var37;
        if (module0715.NIL == var63) {
            var63 = Sequences.cconcatenate((SubLObject)module0715.$ic83$, new SubLObject[] { module0006.f207(var37), module0715.$ic84$ });
        }
        final SubLObject var66 = module0656.f39832((SubLObject)module0715.$ic85$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var65), (SubLObject)module0715.$ic86$, var37, var64);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
        if (module0715.NIL != var66) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
            module0642.f39020(var66);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0715.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0715.UNPROVIDED);
        final SubLObject var67 = module0015.$g533$.currentBinding(var65);
        try {
            module0015.$g533$.bind((SubLObject)module0715.T, var65);
            module0642.f39019(var63);
        }
        finally {
            module0015.$g533$.rebind(var67, var65);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var37;
    }
    
    public static SubLObject f43990() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0715", "f43983", "CB-OWL-IMPORT-OLD", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0715", "f43984", "HANDLE-OWL-TO-CYCL-INPUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0715", "f43985", "S#48163", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0715", "f43987", "CB-SHOW-OWL-IMPORTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0715", "f43988", "S#48164", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0715", "f43989", "S#48165", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0715", "f43986", "S#48166", 1, 2, false);
        return (SubLObject)module0715.NIL;
    }
    
    public static SubLObject f43991() {
        module0715.$g5672$ = SubLFiles.deflexical("S#48167", (SubLObject)module0715.$ic58$);
        module0715.$g5673$ = SubLFiles.defparameter("S#48168", (SubLObject)module0715.TWO_INTEGER);
        return (SubLObject)module0715.NIL;
    }
    
    public static SubLObject f43992() {
        Hashtables.sethash((SubLObject)module0715.$ic0$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0715.$ic1$, (SubLObject)module0715.NIL));
        module0015.f873((SubLObject)module0715.$ic47$);
        module0015.f873((SubLObject)module0715.$ic53$);
        module0015.f873((SubLObject)module0715.$ic62$);
        module0656.f39840((SubLObject)module0715.$ic87$, (SubLObject)module0715.$ic88$, (SubLObject)module0715.THREE_INTEGER);
        return (SubLObject)module0715.NIL;
    }
    
    public void declareFunctions() {
        f43990();
    }
    
    public void initializeVariables() {
        f43991();
    }
    
    public void runTopLevelForms() {
        f43992();
    }
    
    static {
        me = (SubLFile)new module0715();
        module0715.$g5672$ = null;
        module0715.$g5673$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("CB-OWL-TO-CYCL");
        $ic1$ = SubLObjectFactory.makeString("cb-owl-to-cycl.html");
        $ic2$ = SubLObjectFactory.makeString("OWL Importer");
        $ic3$ = SubLObjectFactory.makeString("Import an OWL ontology");
        $ic4$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic5$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic6$ = SubLObjectFactory.makeString("stylesheet");
        $ic7$ = SubLObjectFactory.makeString("text/css");
        $ic8$ = SubLObjectFactory.makeKeyword("SHA1");
        $ic9$ = SubLObjectFactory.makeString("text/javascript");
        $ic10$ = SubLObjectFactory.makeString("yui-skin-sam");
        $ic11$ = SubLObjectFactory.makeString("reloadFrameButton");
        $ic12$ = SubLObjectFactory.makeString("button");
        $ic13$ = SubLObjectFactory.makeString("reload");
        $ic14$ = SubLObjectFactory.makeString("Refresh Frames");
        $ic15$ = SubLObjectFactory.makeString("post");
        $ic16$ = SubLObjectFactory.makeString("handle-owl-to-cycl-input");
        $ic17$ = SubLObjectFactory.makeKeyword("SELF");
        $ic18$ = SubLObjectFactory.makeString("Back");
        $ic19$ = SubLObjectFactory.makeString("Clear");
        $ic20$ = SubLObjectFactory.makeString("Submit");
        $ic21$ = SubLObjectFactory.makeString("import-owl-file");
        $ic22$ = SubLObjectFactory.makeString("Enter the URI you wish to use to identify the ontology:");
        $ic23$ = SubLObjectFactory.makeString("uri");
        $ic24$ = SubLObjectFactory.makeInteger(60);
        $ic25$ = SubLObjectFactory.makeString("Format for term names in #$synonymousExternalConcept assertions:");
        $ic26$ = SubLObjectFactory.makeString("term-name-format");
        $ic27$ = SubLObjectFactory.makeString("short");
        $ic28$ = SubLObjectFactory.makeString("Short (local names only)");
        $ic29$ = SubLObjectFactory.makeString("medium");
        $ic30$ = SubLObjectFactory.makeString("Medium (prefixed names) using prefix: ");
        $ic31$ = SubLObjectFactory.makeString("uri-prefix");
        $ic32$ = SubLObjectFactory.makeString("long");
        $ic33$ = SubLObjectFactory.makeString("Long (full URIs)");
        $ic34$ = SubLObjectFactory.makeString("(Optional) enter pathname of a file to load the ontology from (if not from the URI):");
        $ic35$ = SubLObjectFactory.makeString("pathname");
        $ic36$ = SubLObjectFactory.makeString("");
        $ic37$ = SubLObjectFactory.makeString("Enter a prefix for new constant names:");
        $ic38$ = SubLObjectFactory.makeString("Newly created constants for terms in the imported ontology will have names that start with this prefix.");
        $ic39$ = SubLObjectFactory.makeString("constant-prefix");
        $ic40$ = SubLObjectFactory.makeString("Enter a suffix for new constant names:");
        $ic41$ = SubLObjectFactory.makeString("Newly created constants for terms in the imported ontology will have names that start with this suffix");
        $ic42$ = SubLObjectFactory.makeString("constant-suffix");
        $ic43$ = SubLObjectFactory.makeString("(Optional) Enter an existing Cyc term that represents the ontology:");
        $ic44$ = SubLObjectFactory.makeString("ontology");
        $ic45$ = SubLObjectFactory.makeString("Complete");
        $ic46$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("owl:Ontology"));
        $ic47$ = SubLObjectFactory.makeSymbol("CB-OWL-IMPORT-OLD");
        $ic48$ = SubLObjectFactory.makeString("Bad source: ");
        $ic49$ = SubLObjectFactory.makeString("Can only import OWL ontologies from valid files or URLs.");
        $ic50$ = SubLObjectFactory.makeString(" does not appear to be a URI.");
        $ic51$ = SubLObjectFactory.makeString("Enter a prefix for Medium format names");
        $ic52$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("URI"), (SubLObject)SubLObjectFactory.makeKeyword("SOURCE"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT-PREFIX"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT-SUFFIX"), (SubLObject)SubLObjectFactory.makeKeyword("ONTOLOGY"), (SubLObject)SubLObjectFactory.makeKeyword("PREFIX-EXTERNAL-NAMES?"), (SubLObject)SubLObjectFactory.makeKeyword("ABBREVIATE-PREFIXES?"), (SubLObject)SubLObjectFactory.makeKeyword("URI-PREFIX"));
        $ic53$ = SubLObjectFactory.makeSymbol("HANDLE-OWL-TO-CYCL-INPUT");
        $ic54$ = SubLObjectFactory.makeKeyword("ONTOLOGY");
        $ic55$ = SubLObjectFactory.makeString("Importing ");
        $ic56$ = SubLObjectFactory.makeString("OWL Ontology");
        $ic57$ = SubLObjectFactory.makeString("[Display Importer Progress]");
        $ic58$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Processing Class Definitions"), (SubLObject)SubLObjectFactory.makeString("Processing Property Definitions"), (SubLObject)SubLObjectFactory.makeString("Processing Instance Definitions"), (SubLObject)SubLObjectFactory.makeString("Waiting for Enqueued Operations to be Processed"));
        $ic59$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38900", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48169", "CYC"));
        $ic60$ = SubLObjectFactory.makeString("Can't interpret ~S as the ID of an exising OWL importer.");
        $ic61$ = SubLObjectFactory.makeString("T");
        $ic62$ = SubLObjectFactory.makeSymbol("CB-SHOW-OWL-IMPORTER");
        $ic63$ = SubLObjectFactory.makeString("Status: ~A.");
        $ic64$ = SubLObjectFactory.makeString("Done");
        $ic65$ = SubLObjectFactory.makeString("Working");
        $ic66$ = SubLObjectFactory.makeString(" Total time: ~A.");
        $ic67$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic68$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic69$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("synonymousExternalConcept"));
        $ic70$ = SubLObjectFactory.makeString("Term count: ~D.");
        $ic71$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5849", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48170", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48171", "CYC"));
        $ic72$ = SubLObjectFactory.makeString("~A:");
        $ic73$ = SubLObjectFactory.makeInteger(100);
        $ic74$ = SubLObjectFactory.makeString("Started at ~A. Elapsed time: ~A.");
        $ic75$ = SubLObjectFactory.makeString("Estimated finish time: ~A (after ~A)");
        $ic76$ = SubLObjectFactory.makeString("Error Messages (~D):");
        $ic77$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#295", "CYC"));
        $ic78$ = SubLObjectFactory.makeString("[Refresh]");
        $ic79$ = SubLObjectFactory.makeString("[Halt Auto Refresh]");
        $ic80$ = SubLObjectFactory.makeString("[Start Auto Refresh]");
        $ic81$ = SubLObjectFactory.makeString(" (Last refresh: ~A)");
        $ic82$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic83$ = SubLObjectFactory.makeString("[OWL Importer ");
        $ic84$ = SubLObjectFactory.makeString("]");
        $ic85$ = SubLObjectFactory.makeKeyword("MAIN");
        $ic86$ = SubLObjectFactory.makeString("cb-show-owl-importer&~D&~A");
        $ic87$ = SubLObjectFactory.makeKeyword("SHOW-OWL-IMPORTER");
        $ic88$ = SubLObjectFactory.makeSymbol("S#48166", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0715.class
	Total time: 372 ms
	
	Decompiled with Procyon 0.5.32.
*/