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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic2$);
        }
        else {
            final SubLObject var3 = (SubLObject)$ic3$;
            final SubLObject var4 = module0015.$g538$.currentBinding(var2);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2);
                module0642.f39020((SubLObject)$ic4$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
                final SubLObject var5 = module0014.f672((SubLObject)$ic5$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic6$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var5) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var5);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic7$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0016.f941();
                if (NIL != var3) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var3);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0666.f40471();
                module0666.f40487();
                module0666.f40535();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var4_6 = module0015.$g535$.currentBinding(var2);
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
                    module0642.f39020((SubLObject)$ic10$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_7 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic11$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_8 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var2);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic12$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic13$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic14$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_8, var2);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (NIL != var3) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            module0642.f39019(var3);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        module0644.f39197();
                        final SubLObject var6 = module0656.f39832((SubLObject)NIL);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g285$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        if (NIL != var6) {
                            module0642.f39020(module0015.$g286$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var6);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_9 = module0015.$g533$.currentBinding(var2);
                        final SubLObject var7 = module0015.$g541$.currentBinding(var2);
                        final SubLObject var8 = module0015.$g539$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var2);
                            module0015.$g541$.bind((SubLObject)T, var2);
                            module0015.$g539$.bind(module0015.f797(), var2);
                            module0642.f39069((SubLObject)$ic16$, (SubLObject)T, (SubLObject)UNPROVIDED);
                            module0656.f39870((SubLObject)$ic0$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                            module0656.f39790((SubLObject)$ic17$, (SubLObject)$ic18$);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0642.f39073((SubLObject)$ic19$);
                            module0642.f39032((SubLObject)TWO_INTEGER);
                            module0642.f39074((SubLObject)$ic20$, (SubLObject)$ic21$, (SubLObject)UNPROVIDED);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic22$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)FIVE_INTEGER);
                            module0642.f39075(module0642.f39130((SubLObject)$ic23$), module0038.$g916$.getGlobalValue(), (SubLObject)$ic24$);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0642.f39021((SubLObject)$ic25$);
                            final SubLObject var9 = module0642.f39130((SubLObject)$ic26$);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)TWO_INTEGER);
                            module0642.f39072(var9, (SubLObject)$ic27$, (SubLObject)T, (SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic28$);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)TWO_INTEGER);
                            module0642.f39072(var9, (SubLObject)$ic29$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic30$);
                            module0642.f39075(module0642.f39130((SubLObject)$ic31$), module0038.$g916$.getGlobalValue(), (SubLObject)TEN_INTEGER);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)TWO_INTEGER);
                            module0642.f39072(var9, (SubLObject)$ic32$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic33$);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic34$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)FIVE_INTEGER);
                            module0642.f39139(module0642.f39130((SubLObject)$ic35$), (SubLObject)$ic36$, (SubLObject)$ic24$);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0683.f41673((SubLObject)$ic37$, (SubLObject)$ic38$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)FIVE_INTEGER);
                            module0642.f39075(module0642.f39130((SubLObject)$ic39$), module0038.$g916$.getGlobalValue(), (SubLObject)TEN_INTEGER);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0683.f41673((SubLObject)$ic40$, (SubLObject)$ic41$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)FIVE_INTEGER);
                            module0642.f39075(module0642.f39130((SubLObject)$ic42$), module0038.$g916$.getGlobalValue(), (SubLObject)TEN_INTEGER);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic43$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)FIVE_INTEGER);
                            final SubLObject var10 = module0642.f39130((SubLObject)$ic44$);
                            module0666.f40467(var10, (SubLObject)$ic45$, $ic46$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39075(var10, module0038.$g916$.getGlobalValue(), (SubLObject)UNPROVIDED);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0015.f799(module0015.$g539$.getDynamicValue(var2));
                        }
                        finally {
                            module0015.$g539$.rebind(var8, var2);
                            module0015.$g541$.rebind(var7, var2);
                            module0015.$g533$.rebind(var4_9, var2);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var4_7, var2);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var4_6, var2);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var4, var2);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43984(final SubLObject var1) {
        final SubLObject var2 = (SubLObject)$ic35$;
        final SubLObject var3 = module0038.f2735(module0642.f39132(var2, var1));
        final SubLObject var4 = module0642.f39132((SubLObject)$ic23$, var1);
        final SubLObject var5 = (NIL != module0038.f2611(var3)) ? var3 : var4;
        final SubLObject var6 = module0642.f39132((SubLObject)$ic39$, var1);
        final SubLObject var7 = module0642.f39132((SubLObject)$ic42$, var1);
        final SubLObject var8 = module0642.f39132((SubLObject)$ic44$, var1);
        final SubLObject var9 = (SubLObject)((NIL != module0038.f2611(var8)) ? module0656.f39943(var8, (SubLObject)UNPROVIDED) : NIL);
        final SubLObject var10 = module0642.f39132((SubLObject)$ic26$, var1);
        final SubLObject var11 = (SubLObject)makeBoolean(!var10.equal((SubLObject)$ic27$));
        final SubLObject var12 = Equality.equal(var10, (SubLObject)$ic29$);
        final SubLObject var13 = module0642.f39132((SubLObject)$ic31$, var1);
        SubLObject var14 = (SubLObject)NIL;
        if (NIL == module0589.f35909(var5) && (NIL == module0038.f2611(var5) || NIL == module0075.f5218(var5))) {
            var14 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205(var5), module0006.$g11$.getGlobalValue(), $ic49$ });
        }
        else if (NIL == module0038.f2611(var4)) {
            var14 = Sequences.cconcatenate(module0006.f205(var4), (SubLObject)$ic50$);
        }
        else if (NIL != var12 && NIL != module0038.f2608(var13)) {
            var14 = Sequences.copy_seq((SubLObject)$ic51$);
        }
        if (NIL != var14) {
            module0656.f39789(var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            f43985(module0035.f2333((SubLObject)$ic52$, (SubLObject)ConsesLow.list(var4, var5, var6, var7, var9, var11, var12, var13)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43985(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = conses_high.getf(var28, (SubLObject)$ic54$, (SubLObject)UNPROVIDED);
        final SubLObject var31 = module0709.f43461(var28);
        final SubLObject var32 = (SubLObject)NIL;
        final SubLObject var33 = module0015.$g538$.currentBinding(var29);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var29))) ? module0015.$g538$.getDynamicValue(var29) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var29);
            module0642.f39020((SubLObject)$ic4$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var29), module0655.$g5142$.getDynamicValue(var29));
            final SubLObject var34 = module0014.f672((SubLObject)$ic5$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var34) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var34);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic7$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var32) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var32);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var4_30 = module0015.$g535$.currentBinding(var29);
            try {
                module0015.$g535$.bind((SubLObject)T, var29);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var29)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var29)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic10$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_31 = module0015.$g533$.currentBinding(var29);
                try {
                    module0015.$g533$.bind((SubLObject)T, var29);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic11$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_32 = module0015.$g533$.currentBinding(var29);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var29);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_32, var29);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var32) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var32);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g189$.getGlobalValue());
                    module0642.f39020((SubLObject)TWO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    module0642.f39019((SubLObject)$ic55$);
                    if (NIL != var30) {
                        module0656.f39804(var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else {
                        module0642.f39019((SubLObject)$ic56$);
                    }
                    module0642.f39020(module0015.$g190$.getGlobalValue());
                    module0642.f39020((SubLObject)TWO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    f43986(var31, (SubLObject)$ic57$, (SubLObject)T);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_31, var29);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_30, var29);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var33, var29);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43987(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic59$);
        var2 = var1.first();
        SubLObject var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)$ic59$);
        var3 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var5 = module0038.f2642(var2);
            if (NIL == module0709.f43467(var5)) {
                module0656.f39789((SubLObject)$ic60$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                f43988(var5, Equality.equalp(var3, (SubLObject)$ic61$));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic59$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43988(final SubLObject var37, final SubLObject var38) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        final SubLObject var40 = module0709.f43466(var37);
        final SubLObject var41 = module0709.f43464(var37);
        final SubLObject var42 = module0709.f43465(var37);
        final SubLObject var43 = module0172.f10922(module0709.f43462(var37));
        final SubLObject var44 = f43989(var37);
        module0642.f39020((SubLObject)$ic4$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var39), module0655.$g5142$.getDynamicValue(var39));
        final SubLObject var45 = module0014.f672((SubLObject)$ic5$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic6$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var45) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var45);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic7$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)$ic2$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39055((SubLObject)((NIL != var38 && NIL == var40) ? $g5673$.getDynamicValue(var39) : NIL));
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var46 = module0015.$g535$.currentBinding(var39);
        try {
            module0015.$g535$.bind((SubLObject)T, var39);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_43 = module0015.$g533$.currentBinding(var39);
            try {
                module0015.$g533$.bind((SubLObject)T, var39);
                module0642.f39020(module0015.$g189$.getGlobalValue());
                module0642.f39020((SubLObject)TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                if (NIL == var40) {
                    module0642.f39019((SubLObject)$ic55$);
                }
                if (NIL != var43) {
                    module0656.f39804(var43, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                else {
                    module0642.f39019((SubLObject)$ic56$);
                }
                module0642.f39020(module0015.$g190$.getGlobalValue());
                module0642.f39020((SubLObject)TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                PrintLow.format(module0015.$g131$.getDynamicValue(var39), (SubLObject)$ic63$, (SubLObject)((NIL != var40) ? $ic64$ : $ic65$));
                PrintLow.format(module0015.$g131$.getDynamicValue(var39), (SubLObject)$ic66$, module0051.f3574(var44, (SubLObject)ZERO_INTEGER));
                if (NIL != module0212.f13762(var43)) {
                    final SubLObject var4_44 = module0147.$g2094$.currentBinding(var39);
                    final SubLObject var47 = module0147.$g2095$.currentBinding(var39);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic67$, var39);
                        module0147.$g2095$.bind($ic68$, var39);
                        final SubLObject var48 = Sequences.length(module0219.f14509(var43, (SubLObject)TWO_INTEGER, $ic69$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                        PrintLow.format(module0015.$g131$.getDynamicValue(var39), (SubLObject)$ic70$, var48);
                    }
                    finally {
                        module0147.$g2095$.rebind(var47, var39);
                        module0147.$g2094$.rebind(var4_44, var39);
                    }
                }
                module0642.f39026((SubLObject)TWO_INTEGER);
                if (NIL != module0048.f3293(var44)) {
                    module0642.f39020(module0015.$g149$.getGlobalValue());
                    module0642.f39020(module0015.$g152$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g250$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_45 = module0015.$g533$.currentBinding(var39);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var39);
                        SubLObject var49 = (SubLObject)NIL;
                        SubLObject var50 = (SubLObject)NIL;
                        SubLObject var51 = (SubLObject)NIL;
                        var49 = Sequences.reverse(var41);
                        var50 = var49.first();
                        for (var51 = (SubLObject)ZERO_INTEGER; NIL != var49; var49 = var49.rest(), var50 = var49.first(), var51 = Numbers.add((SubLObject)ONE_INTEGER, var51)) {
                            if (NIL != module0035.f2014(var50)) {
                                SubLObject var53;
                                final SubLObject var52 = var53 = var50;
                                SubLObject var54 = (SubLObject)NIL;
                                SubLObject var55 = (SubLObject)NIL;
                                SubLObject var56 = (SubLObject)NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var53, var52, (SubLObject)$ic71$);
                                var54 = var53.first();
                                var53 = var53.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var53, var52, (SubLObject)$ic71$);
                                var55 = var53.first();
                                var53 = var53.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var53, var52, (SubLObject)$ic71$);
                                var56 = var53.first();
                                var53 = var53.rest();
                                if (NIL == var53) {
                                    PrintLow.format(module0015.$g131$.getDynamicValue(var39), (SubLObject)$ic72$, ConsesLow.nth(var51, $g5672$.getGlobalValue()));
                                    module0642.f39026((SubLObject)UNPROVIDED);
                                    module0642.f39093(Numbers.truncate(Numbers.multiply((SubLObject)$ic73$, var55), (SubLObject)UNPROVIDED), (SubLObject)$ic73$, module0048.f3313(var56, var44, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    PrintLow.format(module0015.$g131$.getDynamicValue(var39), (SubLObject)$ic74$, module0051.f3552(var54), module0051.f3574(var56, (SubLObject)ZERO_INTEGER));
                                    if (var55.isPositive()) {
                                        final SubLObject var57 = Numbers.truncate(Numbers.divide(var56, var55), (SubLObject)UNPROVIDED);
                                        if (!Numbers.subtract(var57, var56).numLE($g5673$.getDynamicValue(var39))) {
                                            module0642.f39026((SubLObject)UNPROVIDED);
                                            PrintLow.format(module0015.$g131$.getDynamicValue(var39), (SubLObject)$ic75$, module0051.f3552(Numbers.add(var54, var57)), module0051.f3574(var57, (SubLObject)ZERO_INTEGER));
                                        }
                                    }
                                    module0642.f39026((SubLObject)TWO_INTEGER);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic71$);
                                }
                            }
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var4_45, var39);
                    }
                    module0642.f39020(module0015.$g150$.getGlobalValue());
                }
                module0642.f39026((SubLObject)UNPROVIDED);
                if (NIL != var42) {
                    module0642.f39020(module0015.$g149$.getGlobalValue());
                    module0642.f39020(module0015.$g152$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g251$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_46 = module0015.$g533$.currentBinding(var39);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var39);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        PrintLow.format(module0015.$g131$.getDynamicValue(var39), (SubLObject)$ic76$, Sequences.length(var42));
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var4_46, var39);
                    }
                    module0642.f39020(module0015.$g150$.getGlobalValue());
                    module0642.f39026((SubLObject)UNPROVIDED);
                    SubLObject var58 = var42;
                    SubLObject var59 = (SubLObject)NIL;
                    var59 = var58.first();
                    while (NIL != var58) {
                        SubLObject var61;
                        final SubLObject var60 = var61 = var59;
                        SubLObject var62 = (SubLObject)NIL;
                        SubLObject var63 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var61, var60, (SubLObject)$ic77$);
                        var62 = var61.first();
                        var61 = var61.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var61, var60, (SubLObject)$ic77$);
                        var63 = var61.first();
                        var61 = var61.rest();
                        if (NIL == var61) {
                            module0656.f39804(var62, (SubLObject)ZERO_INTEGER, (SubLObject)T);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39019(var63);
                            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var60, (SubLObject)$ic77$);
                        }
                        var58 = var58.rest();
                        var59 = var58.first();
                    }
                    module0642.f39026((SubLObject)UNPROVIDED);
                }
                if (NIL != var40) {
                    f43986(var37, (SubLObject)$ic78$, (SubLObject)NIL);
                }
                else if (NIL != var38) {
                    f43986(var37, (SubLObject)$ic79$, (SubLObject)NIL);
                }
                else {
                    f43986(var37, (SubLObject)$ic80$, (SubLObject)T);
                }
                module0642.f39020(module0015.$g149$.getGlobalValue());
                module0642.f39020(module0015.$g152$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g250$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_47 = module0015.$g533$.currentBinding(var39);
                try {
                    module0015.$g533$.bind((SubLObject)T, var39);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var39), (SubLObject)$ic81$, module0051.f3552((SubLObject)UNPROVIDED));
                }
                finally {
                    module0015.$g533$.rebind(var4_47, var39);
                }
                module0642.f39020(module0015.$g150$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var4_43, var39);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var46, var39);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43989(final SubLObject var37) {
        final SubLObject var38 = module0709.f43466(var37);
        final SubLObject var39 = module0709.f43464(var37);
        SubLObject var40 = (SubLObject)ZERO_INTEGER;
        if (NIL != var39) {
            SubLObject var41 = (NIL != var38) ? var39.rest() : var39;
            SubLObject var42 = (SubLObject)NIL;
            var42 = var41.first();
            while (NIL != var41) {
                var40 = Numbers.add(var40, conses_high.third(var42));
                var41 = var41.rest();
                var42 = var41.first();
            }
        }
        return var40;
    }
    
    public static SubLObject f43986(final SubLObject var37, SubLObject var63, SubLObject var64) {
        if (var63 == UNPROVIDED) {
            var63 = (SubLObject)NIL;
        }
        if (var64 == UNPROVIDED) {
            var64 = (SubLObject)NIL;
        }
        final SubLThread var65 = SubLProcess.currentSubLThread();
        assert NIL != module0004.f106(var37) : var37;
        if (NIL == var63) {
            var63 = Sequences.cconcatenate((SubLObject)$ic83$, new SubLObject[] { module0006.f207(var37), $ic84$ });
        }
        final SubLObject var66 = module0656.f39832((SubLObject)$ic85$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var65), (SubLObject)$ic86$, var37, var64);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var66) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var66);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var67 = module0015.$g533$.currentBinding(var65);
        try {
            module0015.$g533$.bind((SubLObject)T, var65);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43991() {
        $g5672$ = SubLFiles.deflexical("S#48167", (SubLObject)$ic58$);
        $g5673$ = SubLFiles.defparameter("S#48168", (SubLObject)TWO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43992() {
        Hashtables.sethash((SubLObject)$ic0$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic47$);
        module0015.f873((SubLObject)$ic53$);
        module0015.f873((SubLObject)$ic62$);
        module0656.f39840((SubLObject)$ic87$, (SubLObject)$ic88$, (SubLObject)THREE_INTEGER);
        return (SubLObject)NIL;
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
        $g5672$ = null;
        $g5673$ = null;
        $ic0$ = makeKeyword("CB-OWL-TO-CYCL");
        $ic1$ = makeString("cb-owl-to-cycl.html");
        $ic2$ = makeString("OWL Importer");
        $ic3$ = makeString("Import an OWL ontology");
        $ic4$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic5$ = makeKeyword("CB-CYC");
        $ic6$ = makeString("stylesheet");
        $ic7$ = makeString("text/css");
        $ic8$ = makeKeyword("SHA1");
        $ic9$ = makeString("text/javascript");
        $ic10$ = makeString("yui-skin-sam");
        $ic11$ = makeString("reloadFrameButton");
        $ic12$ = makeString("button");
        $ic13$ = makeString("reload");
        $ic14$ = makeString("Refresh Frames");
        $ic15$ = makeString("post");
        $ic16$ = makeString("handle-owl-to-cycl-input");
        $ic17$ = makeKeyword("SELF");
        $ic18$ = makeString("Back");
        $ic19$ = makeString("Clear");
        $ic20$ = makeString("Submit");
        $ic21$ = makeString("import-owl-file");
        $ic22$ = makeString("Enter the URI you wish to use to identify the ontology:");
        $ic23$ = makeString("uri");
        $ic24$ = makeInteger(60);
        $ic25$ = makeString("Format for term names in #$synonymousExternalConcept assertions:");
        $ic26$ = makeString("term-name-format");
        $ic27$ = makeString("short");
        $ic28$ = makeString("Short (local names only)");
        $ic29$ = makeString("medium");
        $ic30$ = makeString("Medium (prefixed names) using prefix: ");
        $ic31$ = makeString("uri-prefix");
        $ic32$ = makeString("long");
        $ic33$ = makeString("Long (full URIs)");
        $ic34$ = makeString("(Optional) enter pathname of a file to load the ontology from (if not from the URI):");
        $ic35$ = makeString("pathname");
        $ic36$ = makeString("");
        $ic37$ = makeString("Enter a prefix for new constant names:");
        $ic38$ = makeString("Newly created constants for terms in the imported ontology will have names that start with this prefix.");
        $ic39$ = makeString("constant-prefix");
        $ic40$ = makeString("Enter a suffix for new constant names:");
        $ic41$ = makeString("Newly created constants for terms in the imported ontology will have names that start with this suffix");
        $ic42$ = makeString("constant-suffix");
        $ic43$ = makeString("(Optional) Enter an existing Cyc term that represents the ontology:");
        $ic44$ = makeString("ontology");
        $ic45$ = makeString("Complete");
        $ic46$ = constant_handles_oc.f8479((SubLObject)makeString("owl:Ontology"));
        $ic47$ = makeSymbol("CB-OWL-IMPORT-OLD");
        $ic48$ = makeString("Bad source: ");
        $ic49$ = makeString("Can only import OWL ontologies from valid files or URLs.");
        $ic50$ = makeString(" does not appear to be a URI.");
        $ic51$ = makeString("Enter a prefix for Medium format names");
        $ic52$ = ConsesLow.list((SubLObject)makeKeyword("URI"), (SubLObject)makeKeyword("SOURCE"), (SubLObject)makeKeyword("CONSTANT-PREFIX"), (SubLObject)makeKeyword("CONSTANT-SUFFIX"), (SubLObject)makeKeyword("ONTOLOGY"), (SubLObject)makeKeyword("PREFIX-EXTERNAL-NAMES?"), (SubLObject)makeKeyword("ABBREVIATE-PREFIXES?"), (SubLObject)makeKeyword("URI-PREFIX"));
        $ic53$ = makeSymbol("HANDLE-OWL-TO-CYCL-INPUT");
        $ic54$ = makeKeyword("ONTOLOGY");
        $ic55$ = makeString("Importing ");
        $ic56$ = makeString("OWL Ontology");
        $ic57$ = makeString("[Display Importer Progress]");
        $ic58$ = ConsesLow.list((SubLObject)makeString("Processing Class Definitions"), (SubLObject)makeString("Processing Property Definitions"), (SubLObject)makeString("Processing Instance Definitions"), (SubLObject)makeString("Waiting for Enqueued Operations to be Processed"));
        $ic59$ = ConsesLow.list((SubLObject)makeSymbol("S#38900", "CYC"), (SubLObject)makeSymbol("S#48169", "CYC"));
        $ic60$ = makeString("Can't interpret ~S as the ID of an exising OWL importer.");
        $ic61$ = makeString("T");
        $ic62$ = makeSymbol("CB-SHOW-OWL-IMPORTER");
        $ic63$ = makeString("Status: ~A.");
        $ic64$ = makeString("Done");
        $ic65$ = makeString("Working");
        $ic66$ = makeString(" Total time: ~A.");
        $ic67$ = makeSymbol("S#12274", "CYC");
        $ic68$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic69$ = constant_handles_oc.f8479((SubLObject)makeString("synonymousExternalConcept"));
        $ic70$ = makeString("Term count: ~D.");
        $ic71$ = ConsesLow.list((SubLObject)makeSymbol("S#5849", "CYC"), (SubLObject)makeSymbol("S#48170", "CYC"), (SubLObject)makeSymbol("S#48171", "CYC"));
        $ic72$ = makeString("~A:");
        $ic73$ = makeInteger(100);
        $ic74$ = makeString("Started at ~A. Elapsed time: ~A.");
        $ic75$ = makeString("Estimated finish time: ~A (after ~A)");
        $ic76$ = makeString("Error Messages (~D):");
        $ic77$ = ConsesLow.list((SubLObject)makeSymbol("OBJECT", "CYC"), (SubLObject)makeSymbol("S#295", "CYC"));
        $ic78$ = makeString("[Refresh]");
        $ic79$ = makeString("[Halt Auto Refresh]");
        $ic80$ = makeString("[Start Auto Refresh]");
        $ic81$ = makeString(" (Last refresh: ~A)");
        $ic82$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic83$ = makeString("[OWL Importer ");
        $ic84$ = makeString("]");
        $ic85$ = makeKeyword("MAIN");
        $ic86$ = makeString("cb-show-owl-importer&~D&~A");
        $ic87$ = makeKeyword("SHOW-OWL-IMPORTER");
        $ic88$ = makeSymbol("S#48166", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 372 ms
	
	Decompiled with Procyon 0.5.32.
*/