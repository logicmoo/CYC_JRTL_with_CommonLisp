package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0597 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0597";
    public static final String myFingerPrint = "7fd2936e1aa2ddf7d41d9cda486d6e92c56a218339b8bb5cab3fca946a35e02d";
    public static SubLSymbol $g4560$;
    public static SubLSymbol $g4561$;
    public static SubLSymbol $g4562$;
    public static SubLSymbol $g4563$;
    public static SubLSymbol $g4564$;
    public static SubLSymbol $g4565$;
    public static SubLSymbol $g4566$;
    public static SubLSymbol $g4567$;
    public static SubLSymbol $g4568$;
    public static SubLSymbol $g4569$;
    public static SubLSymbol $g4570$;
    public static SubLSymbol $g4571$;
    public static SubLSymbol $g4572$;
    public static SubLSymbol $g4573$;
    public static SubLSymbol $g4574$;
    public static SubLSymbol $g4575$;
    public static SubLSymbol $g4576$;
    public static SubLSymbol $g4577$;
    public static SubLSymbol $g4578$;
    public static SubLSymbol $g4579$;
    public static SubLSymbol $g4580$;
    public static SubLSymbol $g4581$;
    public static SubLSymbol $g4582$;
    public static SubLSymbol $g4583$;
    public static SubLSymbol $g4584$;
    public static SubLSymbol $g4585$;
    public static SubLSymbol $g4586$;
    public static SubLSymbol $g4587$;
    public static SubLSymbol $g4588$;
    public static SubLSymbol $g4589$;
    public static SubLSymbol $g4590$;
    public static SubLSymbol $g4591$;
    public static SubLSymbol $g4592$;
    public static SubLSymbol $g4593$;
    public static SubLSymbol $g4594$;
    public static SubLSymbol $g4595$;
    public static SubLSymbol $g4596$;
    public static SubLSymbol $g4597$;
    public static SubLSymbol $g4598$;
    public static SubLSymbol $g4599$;
    public static SubLSymbol $g4600$;
    public static SubLSymbol $g4601$;
    public static SubLSymbol $g4602$;
    public static SubLSymbol $g4603$;
    public static SubLSymbol $g4604$;
    public static SubLSymbol $g4605$;
    public static SubLSymbol $g4606$;
    public static SubLSymbol $g4607$;
    public static SubLSymbol $g4608$;
    public static SubLSymbol $g4609$;
    public static SubLSymbol $g4610$;
    public static SubLSymbol $g4611$;
    public static SubLSymbol $g4612$;
    public static SubLSymbol $g4613$;
    public static SubLSymbol $g4614$;
    public static SubLSymbol $g4615$;
    public static SubLSymbol $g4616$;
    public static SubLSymbol $g4617$;
    public static SubLSymbol $g4618$;
    public static SubLSymbol $g4619$;
    public static SubLSymbol $g4620$;
    public static SubLSymbol $g4621$;
    public static SubLSymbol $g4622$;
    public static SubLSymbol $g4623$;
    public static SubLSymbol $g4624$;
    public static SubLSymbol $g4625$;
    public static SubLSymbol $g4626$;
    public static SubLSymbol $g4627$;
    public static SubLSymbol $g4628$;
    public static SubLSymbol $g4629$;
    public static SubLSymbol $g4630$;
    public static SubLSymbol $g4631$;
    public static SubLSymbol $g4632$;
    public static SubLSymbol $g4633$;
    public static SubLSymbol $g4634$;
    public static SubLSymbol $g4635$;
    public static SubLSymbol $g4636$;
    public static SubLSymbol $g4637$;
    public static SubLSymbol $g4638$;
    public static SubLSymbol $g4639$;
    public static SubLSymbol $g4640$;
    public static SubLSymbol $g4641$;
    public static SubLSymbol $g4642$;
    public static SubLSymbol $g4643$;
    public static SubLSymbol $g4644$;
    public static SubLSymbol $g4645$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLInteger $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLInteger $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLList $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLString $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLObject $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLString $ic107$;
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLString $ic112$;
    private static final SubLList $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLString $ic120$;
    private static final SubLString $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLObject $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLObject $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLList $ic145$;
    private static final SubLList $ic146$;
    private static final SubLList $ic147$;
    private static final SubLList $ic148$;
    private static final SubLList $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLString $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLList $ic154$;
    private static final SubLList $ic155$;
    private static final SubLList $ic156$;
    private static final SubLInteger $ic157$;
    private static final SubLList $ic158$;
    private static final SubLList $ic159$;
    private static final SubLList $ic160$;
    private static final SubLList $ic161$;
    private static final SubLList $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLObject $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLString $ic168$;
    private static final SubLString $ic169$;
    private static final SubLString $ic170$;
    private static final SubLObject $ic171$;
    private static final SubLObject $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLList $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLString $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLString $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLString $ic187$;
    private static final SubLString $ic188$;
    private static final SubLString $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLList $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLObject $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLList $ic199$;
    private static final SubLSymbol $ic200$;
    
    public static SubLObject f36516(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == module0597.UNPROVIDED) {
            var3 = (SubLObject)module0597.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        f36517();
        SubLObject var5 = (SubLObject)module0597.NIL;
        SubLObject var6 = (SubLObject)module0597.NIL;
        final SubLObject var7 = module0597.$g4634$.currentBinding(var4);
        final SubLObject var8 = module0597.$g4635$.currentBinding(var4);
        final SubLObject var9 = module0597.$g4636$.currentBinding(var4);
        final SubLObject var10 = module0597.$g4637$.currentBinding(var4);
        final SubLObject var11 = module0597.$g4638$.currentBinding(var4);
        final SubLObject var12 = module0597.$g4639$.currentBinding(var4);
        final SubLObject var13 = module0597.$g4574$.currentBinding(var4);
        final SubLObject var14 = module0597.$g4575$.currentBinding(var4);
        final SubLObject var15 = module0597.$g4577$.currentBinding(var4);
        final SubLObject var16 = module0597.$g4570$.currentBinding(var4);
        final SubLObject var17 = module0597.$g4568$.currentBinding(var4);
        final SubLObject var18 = module0597.$g4569$.currentBinding(var4);
        final SubLObject var19 = module0597.$g4562$.currentBinding(var4);
        try {
            module0597.$g4634$.bind(module0597.$g4634$.getDynamicValue(var4).isFunctionSpec() ? module0597.$g4634$.getDynamicValue(var4) : Symbols.symbol_function((SubLObject)module0597.$ic92$), var4);
            module0597.$g4635$.bind(module0597.$g4635$.getDynamicValue(var4).isFunctionSpec() ? module0597.$g4635$.getDynamicValue(var4) : Symbols.symbol_function((SubLObject)module0597.$ic93$), var4);
            module0597.$g4636$.bind(module0597.$g4636$.getDynamicValue(var4).isFunctionSpec() ? module0597.$g4636$.getDynamicValue(var4) : Symbols.symbol_function((SubLObject)module0597.$ic94$), var4);
            module0597.$g4637$.bind(module0597.$g4637$.getDynamicValue(var4).isFunctionSpec() ? module0597.$g4637$.getDynamicValue(var4) : Symbols.symbol_function((SubLObject)module0597.$ic95$), var4);
            module0597.$g4638$.bind(module0597.$g4638$.getDynamicValue(var4).isFunctionSpec() ? module0597.$g4638$.getDynamicValue(var4) : Symbols.symbol_function((SubLObject)module0597.$ic96$), var4);
            module0597.$g4639$.bind(module0597.$g4639$.getDynamicValue(var4).isFunctionSpec() ? module0597.$g4639$.getDynamicValue(var4) : Symbols.symbol_function((SubLObject)module0597.$ic97$), var4);
            module0597.$g4574$.bind(var1, var4);
            module0597.$g4575$.bind(var2, var4);
            module0597.$g4577$.bind(Sequences.remove_duplicates((SubLObject)ConsesLow.list(var1, var2), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED), var4);
            module0597.$g4570$.bind(Sequences.length(module0597.$g4577$.getDynamicValue(var4)), var4);
            module0597.$g4568$.bind((SubLObject)module0597.ZERO_INTEGER, var4);
            module0597.$g4569$.bind((SubLObject)module0597.ZERO_INTEGER, var4);
            module0597.$g4562$.bind((SubLObject)module0597.ZERO_INTEGER, var4);
            final SubLObject var20 = Time.get_internal_real_time();
            if (module0597.NIL != module0035.f1997(module0597.$g4577$.getDynamicValue(var4))) {
                var5 = module0597.$g4577$.getDynamicValue(var4);
            }
            else {
                final SubLObject var21 = var3;
                final SubLObject var7_22 = module0147.$g2094$.currentBinding(var4);
                final SubLObject var8_23 = module0147.$g2095$.currentBinding(var4);
                try {
                    module0147.$g2094$.bind(module0147.f9531(var21), var4);
                    module0147.$g2095$.bind(module0147.f9534(var21), var4);
                    final SubLObject var7_23 = module0012.$g75$.currentBinding(var4);
                    final SubLObject var8_24 = module0012.$g76$.currentBinding(var4);
                    final SubLObject var9_26 = module0012.$g77$.currentBinding(var4);
                    final SubLObject var10_27 = module0012.$g78$.currentBinding(var4);
                    try {
                        module0012.$g75$.bind((SubLObject)module0597.ZERO_INTEGER, var4);
                        module0012.$g76$.bind((SubLObject)module0597.NIL, var4);
                        module0012.$g77$.bind((SubLObject)module0597.T, var4);
                        module0012.$g78$.bind(Time.get_universal_time(), var4);
                        module0012.f478((SubLObject)module0597.$ic98$);
                        SubLObject var22 = module0597.$g4577$.getDynamicValue(var4);
                        SubLObject var23 = (SubLObject)module0597.NIL;
                        var23 = var22.first();
                        while (module0597.NIL != var22) {
                            f36518(var23, var23, (SubLObject)module0597.UNPROVIDED);
                            var22 = var22.rest();
                            var23 = var22.first();
                        }
                        SubLObject var24;
                        SubLObject var25;
                        SubLObject var26;
                        SubLObject var27;
                        SubLObject var28;
                        SubLObject var29;
                        for (var24 = (SubLObject)module0597.NIL, var25 = (SubLObject)module0597.NIL, var26 = (SubLObject)module0597.NIL, var27 = (SubLObject)module0597.NIL, var28 = (SubLObject)module0597.NIL, var29 = (SubLObject)module0597.NIL, var24 = f36519(), var25 = f36520((SubLObject)ConsesLow.list(var1), var1, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED), var26 = f36520((SubLObject)ConsesLow.list(var2), var2, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED), var27 = var25, var28 = var26, var29 = f36521(var1, var2); module0597.NIL == var29 && module0597.NIL == f36522(var24, var25, var26); var24 = f36519(), var25 = f36520(var25, var1, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED), var26 = f36520(var26, var2, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED), var27 = (SubLObject)((module0597.NIL != var25) ? ConsesLow.nconc(var27, var25) : module0597.NIL), var28 = (SubLObject)((module0597.NIL != var26) ? ConsesLow.nconc(var28, var26) : module0597.NIL), var29 = f36521(var1, var2)) {
                            if (module0597.NIL != module0597.$g4579$.getDynamicValue(var4) && module0597.NIL == var29) {
                                f36523((SubLObject)module0597.THREE_INTEGER, (SubLObject)module0597.$ic99$, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                            }
                            if (module0597.$g4596$.getDynamicValue(var4).isNumber() && module0597.$g4596$.getDynamicValue(var4).numGE((SubLObject)module0597.THREE_INTEGER)) {
                                if (module0597.NIL != module0035.f2194(var27, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED)) {
                                    f36523((SubLObject)module0597.FOUR_INTEGER, (SubLObject)module0597.$ic100$, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                                }
                                if (module0597.NIL != module0035.f2194(var28, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED)) {
                                    f36523((SubLObject)module0597.FOUR_INTEGER, (SubLObject)module0597.$ic101$, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                                }
                            }
                        }
                        if (module0597.NIL != var29) {
                            var5 = var29;
                            module0597.$g4560$.setDynamicValue((SubLObject)module0597.$ic102$, var4);
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var10_27, var4);
                        module0012.$g77$.rebind(var9_26, var4);
                        module0012.$g76$.rebind(var8_24, var4);
                        module0012.$g75$.rebind(var7_23, var4);
                    }
                    if (module0597.NIL != module0597.$g4593$.getDynamicValue(var4)) {
                        SubLObject var30 = f36524(var1, var2, var3, (SubLObject)module0597.UNPROVIDED);
                        SubLObject var31 = (SubLObject)module0597.NIL;
                        var31 = var30.first();
                        while (module0597.NIL != var30) {
                            if (module0597.NIL != var31) {
                                final SubLObject var32 = var31;
                                if (module0597.NIL == conses_high.member(var32, var5, Symbols.symbol_function((SubLObject)module0597.EQUAL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
                                    var5 = (SubLObject)ConsesLow.cons(var32, var5);
                                }
                            }
                            var30 = var30.rest();
                            var31 = var30.first();
                        }
                    }
                    if (module0597.NIL != module0597.$g4592$.getDynamicValue(var4)) {
                        SubLObject var30 = f36525(var1, var2, var3, (SubLObject)module0597.UNPROVIDED);
                        SubLObject var31 = (SubLObject)module0597.NIL;
                        var31 = var30.first();
                        while (module0597.NIL != var30) {
                            if (module0597.NIL != var31) {
                                final SubLObject var32 = var31;
                                if (module0597.NIL == conses_high.member(var32, var5, Symbols.symbol_function((SubLObject)module0597.EQUAL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
                                    var5 = (SubLObject)ConsesLow.cons(var32, var5);
                                }
                            }
                            var30 = var30.rest();
                            var31 = var30.first();
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var8_23, var4);
                    module0147.$g2094$.rebind(var7_22, var4);
                }
            }
            module0597.$g4583$.setDynamicValue(Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var20), time_high.$internal_time_units_per_second$.getGlobalValue()), var4);
            if (module0597.NIL == module0597.$g4579$.getDynamicValue(var4)) {
                f36526((SubLObject)module0597.THREE_INTEGER, (SubLObject)module0597.$ic103$, module0597.$g4562$.getDynamicValue(var4), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
            }
            if (module0597.NIL != module0597.$g4567$.getDynamicValue(var4)) {
                var6 = f36527(var5);
            }
        }
        finally {
            module0597.$g4562$.rebind(var19, var4);
            module0597.$g4569$.rebind(var18, var4);
            module0597.$g4568$.rebind(var17, var4);
            module0597.$g4570$.rebind(var16, var4);
            module0597.$g4577$.rebind(var15, var4);
            module0597.$g4575$.rebind(var14, var4);
            module0597.$g4574$.rebind(var13, var4);
            module0597.$g4639$.rebind(var12, var4);
            module0597.$g4638$.rebind(var11, var4);
            module0597.$g4637$.rebind(var10, var4);
            module0597.$g4636$.rebind(var9, var4);
            module0597.$g4635$.rebind(var8, var4);
            module0597.$g4634$.rebind(var7, var4);
        }
        if (module0597.NIL != module0597.$g4567$.getDynamicValue(var4)) {
            return Values.values(var5, var6);
        }
        return var5;
    }
    
    public static SubLObject f36528(final SubLObject var1, final SubLObject var2, SubLObject var38) {
        if (var38 == module0597.UNPROVIDED) {
            var38 = (SubLObject)module0597.TWO_INTEGER;
        }
        final SubLThread var39 = SubLProcess.currentSubLThread();
        SubLObject var40 = (SubLObject)module0597.NIL;
        final SubLObject var41 = module0597.$g4597$.currentBinding(var39);
        try {
            module0597.$g4597$.bind(var38, var39);
            var40 = f36516(var1, var2, (SubLObject)module0597.UNPROVIDED);
        }
        finally {
            module0597.$g4597$.rebind(var41, var39);
        }
        return var40;
    }
    
    public static SubLObject f36529(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0597.NIL;
        final SubLObject var5 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var3);
        try {
            module0147.$g2094$.bind((SubLObject)module0597.$ic104$, var3);
            module0147.$g2095$.bind(module0597.$ic105$, var3);
            var4 = f36516(var1, var2, (SubLObject)module0597.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var6, var3);
            module0147.$g2094$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f36530(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0597.NIL;
        final SubLObject var6 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var7 = module0147.$g2095$.currentBinding(var4);
        try {
            module0147.$g2094$.bind((SubLObject)module0597.$ic106$, var4);
            module0147.$g2095$.bind(var3, var4);
            var5 = f36516(var1, var2, (SubLObject)module0597.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var7, var4);
            module0147.$g2094$.rebind(var6, var4);
        }
        return var5;
    }
    
    public static SubLObject f36521(SubLObject var1, SubLObject var2) {
        if (var1 == module0597.UNPROVIDED) {
            var1 = module0597.$g4574$.getDynamicValue();
        }
        if (var2 == module0597.UNPROVIDED) {
            var2 = module0597.$g4575$.getDynamicValue();
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0597.NIL != module0597.$g4579$.getDynamicValue(var3)) {
            if (module0597.NIL != module0597.$g4596$.getDynamicValue(var3)) {
                f36531((SubLObject)module0597.TWO_INTEGER, (SubLObject)module0597.$ic107$, module0038.f2887(module0597.$g4579$.getDynamicValue(var3), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
            }
            f36532(module0597.$g4579$.getDynamicValue(var3));
            return f36533(var1, var2);
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36532(SubLObject var39) {
        if (var39 == module0597.UNPROVIDED) {
            var39 = module0597.$g4579$.getDynamicValue();
        }
        final SubLThread var40 = SubLProcess.currentSubLThread();
        final SubLObject var41 = module0597.$g4586$.currentBinding(var40);
        try {
            module0597.$g4586$.bind((SubLObject)module0597.ZERO_INTEGER, var40);
            SubLObject var42 = var39;
            SubLObject var43 = (SubLObject)module0597.NIL;
            var43 = var42.first();
            while (module0597.NIL != var42) {
                f36531((SubLObject)module0597.FOUR_INTEGER, (SubLObject)module0597.$ic108$, f36534(var43), var43, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                SubLObject var28_41 = f36535(var43, (SubLObject)module0597.UNPROVIDED);
                SubLObject var44 = (SubLObject)module0597.NIL;
                var44 = var28_41.first();
                while (module0597.NIL != var28_41) {
                    f36536(var44);
                    var28_41 = var28_41.rest();
                    var44 = var28_41.first();
                }
                var42 = var42.rest();
                var43 = var42.first();
            }
        }
        finally {
            module0597.$g4586$.rebind(var41, var40);
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36536(final SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        module0597.$g4586$.setDynamicValue(Numbers.add(module0597.$g4586$.getDynamicValue(var44), (SubLObject)module0597.ONE_INTEGER), var44);
        f36531((SubLObject)module0597.FOUR_INTEGER, (SubLObject)module0597.$ic109$, module0038.f2945(module0597.$g4586$.getDynamicValue(var44), (SubLObject)module0597.UNPROVIDED), f36534(var43), module0038.f2945(module0597.$g4586$.getDynamicValue(var44), (SubLObject)module0597.UNPROVIDED), var43);
        f36537(var43, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
        SubLObject var45 = f36535(var43, (SubLObject)module0597.UNPROVIDED);
        SubLObject var46 = (SubLObject)module0597.NIL;
        var46 = var45.first();
        while (module0597.NIL != var45) {
            f36538(var46);
            var45 = var45.rest();
            var46 = var45.first();
        }
        module0597.$g4586$.setDynamicValue(Numbers.subtract(module0597.$g4586$.getDynamicValue(var44), (SubLObject)module0597.ONE_INTEGER), var44);
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36538(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (module0597.NIL == f36539(var40, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED)) {
            module0597.$g4586$.setDynamicValue(Numbers.add(module0597.$g4586$.getDynamicValue(var41), (SubLObject)module0597.ONE_INTEGER), var41);
            f36531((SubLObject)module0597.FOUR_INTEGER, (SubLObject)module0597.$ic110$, module0038.f2945(module0597.$g4586$.getDynamicValue(var41), (SubLObject)module0597.UNPROVIDED), f36534(var40), module0038.f2945(module0597.$g4586$.getDynamicValue(var41), (SubLObject)module0597.UNPROVIDED), var40);
            f36537(var40, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
            if (module0597.NIL == f36540(var40)) {
                SubLObject var42 = f36535(var40, (SubLObject)module0597.UNPROVIDED);
                SubLObject var43 = (SubLObject)module0597.NIL;
                var43 = var42.first();
                while (module0597.NIL != var42) {
                    f36536(var43);
                    var42 = var42.rest();
                    var43 = var42.first();
                }
            }
            module0597.$g4586$.setDynamicValue(Numbers.subtract(module0597.$g4586$.getDynamicValue(var41), (SubLObject)module0597.ONE_INTEGER), var41);
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36533(SubLObject var1, SubLObject var2) {
        if (var1 == module0597.UNPROVIDED) {
            var1 = module0597.$g4574$.getDynamicValue();
        }
        if (var2 == module0597.UNPROVIDED) {
            var2 = module0597.$g4575$.getDynamicValue();
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0597.NIL;
        final SubLObject var5 = module0597.$g4575$.currentBinding(var3);
        final SubLObject var6 = module0597.$g4574$.currentBinding(var3);
        final SubLObject var7 = module0597.$g4586$.currentBinding(var3);
        final SubLObject var8 = module0597.$g4599$.currentBinding(var3);
        try {
            module0597.$g4575$.bind(var2, var3);
            module0597.$g4574$.bind(var1, var3);
            module0597.$g4586$.bind((SubLObject)module0597.ZERO_INTEGER, var3);
            module0597.$g4599$.bind((SubLObject)((module0597.NIL != module0597.$g4598$.getDynamicValue(var3)) ? Numbers.multiply((SubLObject)module0597.FOUR_INTEGER, module0597.$g4562$.getDynamicValue(var3)) : module0597.NIL), var3);
            final SubLObject var9 = f36541((SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
            final SubLObject var7_46 = module0597.$g4587$.currentBinding(var3);
            final SubLObject var8_47 = module0597.$g4588$.currentBinding(var3);
            try {
                module0597.$g4587$.bind(module0035.remove_if_not(module0597.$g4564$.getDynamicValue(var3), var9, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED), var3);
                module0597.$g4588$.bind(module0035.remove_if_not(module0597.$g4565$.getDynamicValue(var3), var9, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED), var3);
                var4 = f36542();
            }
            finally {
                module0597.$g4588$.rebind(var8_47, var3);
                module0597.$g4587$.rebind(var7_46, var3);
            }
        }
        finally {
            module0597.$g4599$.rebind(var8, var3);
            module0597.$g4586$.rebind(var7, var3);
            module0597.$g4574$.rebind(var6, var3);
            module0597.$g4575$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f36542() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0597.$g4561$.getDynamicValue(var4);
        if (var5.eql((SubLObject)module0597.$ic1$)) {
            return f36543();
        }
        if (var5.eql((SubLObject)module0597.$ic111$)) {
            return f36544();
        }
        f36523((SubLObject)module0597.THREE_INTEGER, (SubLObject)module0597.$ic112$, module0597.$g4561$.getDynamicValue(var4), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36544() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0597.NIL;
        SubLObject var6 = (SubLObject)module0597.NIL;
        SubLObject var7 = (SubLObject)module0597.NIL;
        SubLObject var8 = (SubLObject)module0597.NIL;
        SubLObject var9 = (SubLObject)module0597.NIL;
        var6 = module0597.$g4574$.getDynamicValue(var4);
        var7 = (SubLObject)ConsesLow.list(var6);
        var8 = conses_high.set_difference(f36545(var6), var7, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
        for (var9 = Sequences.remove(var6, module0597.$g4587$.getDynamicValue(var4), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED); module0597.NIL != var9; var9 = Sequences.delete(var6, var9, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED)) {
            SubLObject var10 = var8;
            SubLObject var11 = (SubLObject)module0597.NIL;
            var11 = var10.first();
            while (module0597.NIL != var10) {
                SubLObject var28_55 = f36546(var6, var11);
                SubLObject var12 = (SubLObject)module0597.NIL;
                var12 = var28_55.first();
                while (module0597.NIL != var28_55) {
                    var5 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var6, var11, var12), var5);
                    var28_55 = var28_55.rest();
                    var12 = var28_55.first();
                }
                var10 = var10.rest();
                var11 = var10.first();
            }
            var6 = ((module0597.NIL != var8) ? var8.first() : var9.first());
            var7 = (SubLObject)ConsesLow.cons(var6, var7);
            var8 = conses_high.set_difference(f36545(var6), var7, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
        }
        return Sequences.nreverse(var5);
    }
    
    public static SubLObject f36543() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0597.NIL;
        final SubLObject var6 = module0597.$g4584$.currentBinding(var4);
        final SubLObject var7 = module0597.$g4585$.currentBinding(var4);
        final SubLObject var8 = module0597.$g4581$.currentBinding(var4);
        final SubLObject var9 = module0597.$g4580$.currentBinding(var4);
        try {
            module0597.$g4584$.bind((SubLObject)module0597.NIL, var4);
            module0597.$g4585$.bind((SubLObject)module0597.NIL, var4);
            module0597.$g4581$.bind((SubLObject)module0597.NIL, var4);
            module0597.$g4580$.bind((SubLObject)module0597.NIL, var4);
            var5 = f36547((SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED).first();
        }
        finally {
            module0597.$g4580$.rebind(var9, var4);
            module0597.$g4581$.rebind(var8, var4);
            module0597.$g4585$.rebind(var7, var4);
            module0597.$g4584$.rebind(var6, var4);
        }
        if (module0597.NIL != var5) {
            return f36548(var5);
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36548(final SubLObject var57) {
        if (module0597.NIL != var57) {
            SubLObject var58 = (SubLObject)module0597.NIL;
            SubLObject var59 = (SubLObject)module0597.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var57, var57, (SubLObject)module0597.$ic113$);
            var59 = var57.first();
            SubLObject var60 = var57.rest();
            final SubLObject var61 = (SubLObject)(var60.isCons() ? var60.first() : module0597.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var60, var57, (SubLObject)module0597.$ic113$);
            var60 = var60.rest();
            if (module0597.NIL == var60) {
                if (module0597.NIL == var61) {
                    return (SubLObject)ConsesLow.list(var57);
                }
                SubLObject var62 = var61;
                SubLObject var63 = (SubLObject)module0597.NIL;
                var63 = var62.first();
                while (module0597.NIL != var62) {
                    SubLObject var28_61 = f36548(var63);
                    SubLObject var64 = (SubLObject)module0597.NIL;
                    var64 = var28_61.first();
                    while (module0597.NIL != var28_61) {
                        var58 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var59, var64), var58);
                        var28_61 = var28_61.rest();
                        var64 = var28_61.first();
                    }
                    var62 = var62.rest();
                    var63 = var62.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var57, (SubLObject)module0597.$ic113$);
            }
            return var58;
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36547(SubLObject var40, SubLObject var62) {
        if (var40 == module0597.UNPROVIDED) {
            var40 = module0597.$g4574$.getDynamicValue();
        }
        if (var62 == module0597.UNPROVIDED) {
            var62 = module0597.$g4584$.getDynamicValue();
        }
        final SubLThread var63 = SubLProcess.currentSubLThread();
        if (module0597.NIL != f36549((SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED) && module0597.NIL != f36550(var40)) {
            f36531((SubLObject)module0597.FOUR_INTEGER, (SubLObject)module0597.$ic114$, module0038.f2945(module0597.$g4586$.getDynamicValue(var63), (SubLObject)module0597.UNPROVIDED), module0038.f2945(module0597.$g4586$.getDynamicValue(var63), (SubLObject)module0597.UNPROVIDED), var40, (SubLObject)module0597.UNPROVIDED);
            module0597.$g4586$.setDynamicValue(Numbers.add(module0597.$g4586$.getDynamicValue(var63), (SubLObject)module0597.ONE_INTEGER), var63);
            if (module0597.NIL != f36551(var40, module0597.$g4575$.getDynamicValue(var63), (SubLObject)module0597.UNPROVIDED)) {
                module0597.$g4581$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var40), module0597.$g4581$.getDynamicValue(var63)), var63);
            }
            else {
                final SubLObject var64 = module0597.$g4580$.currentBinding(var63);
                final SubLObject var65 = module0597.$g4584$.currentBinding(var63);
                try {
                    module0597.$g4580$.bind((SubLObject)module0597.NIL, var63);
                    module0597.$g4584$.bind((SubLObject)ConsesLow.cons(var40, var62), var63);
                    SubLObject var66 = f36552(var40);
                    SubLObject var67 = (SubLObject)module0597.NIL;
                    var67 = var66.first();
                    while (module0597.NIL != var66) {
                        f36553(var67, (SubLObject)module0597.UNPROVIDED);
                        var66 = var66.rest();
                        var67 = var66.first();
                    }
                    if (module0597.NIL != module0597.$g4580$.getDynamicValue(var63)) {
                        module0597.$g4581$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var40, module0597.$g4580$.getDynamicValue(var63)), module0597.$g4581$.getDynamicValue(var63)), var63);
                    }
                }
                finally {
                    module0597.$g4584$.rebind(var65, var63);
                    module0597.$g4580$.rebind(var64, var63);
                }
            }
            module0597.$g4586$.setDynamicValue(Numbers.subtract(module0597.$g4586$.getDynamicValue(var63), (SubLObject)module0597.ONE_INTEGER), var63);
        }
        return module0597.$g4581$.getDynamicValue(var63);
    }
    
    public static SubLObject f36553(final SubLObject var43, SubLObject var62) {
        if (var62 == module0597.UNPROVIDED) {
            var62 = module0597.$g4585$.getDynamicValue();
        }
        final SubLThread var63 = SubLProcess.currentSubLThread();
        if (module0597.NIL != f36549((SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED) && module0597.NIL != f36554(var43)) {
            f36531((SubLObject)module0597.FOUR_INTEGER, (SubLObject)module0597.$ic115$, module0038.f2945(module0597.$g4586$.getDynamicValue(var63), (SubLObject)module0597.UNPROVIDED), module0038.f2945(module0597.$g4586$.getDynamicValue(var63), (SubLObject)module0597.UNPROVIDED), var43, (SubLObject)module0597.UNPROVIDED);
            module0597.$g4586$.setDynamicValue(Numbers.add(module0597.$g4586$.getDynamicValue(var63), (SubLObject)module0597.ONE_INTEGER), var63);
            final SubLObject var64 = module0597.$g4581$.currentBinding(var63);
            final SubLObject var65 = module0597.$g4585$.currentBinding(var63);
            try {
                module0597.$g4581$.bind((SubLObject)module0597.NIL, var63);
                module0597.$g4585$.bind((SubLObject)ConsesLow.cons(var43, var62), var63);
                SubLObject var66 = f36555(var43);
                SubLObject var67 = (SubLObject)module0597.NIL;
                var67 = var66.first();
                while (module0597.NIL != var66) {
                    f36547(var67, (SubLObject)module0597.UNPROVIDED);
                    var66 = var66.rest();
                    var67 = var66.first();
                }
                if (module0597.NIL != module0597.$g4581$.getDynamicValue(var63)) {
                    module0597.$g4580$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var43, module0597.$g4581$.getDynamicValue(var63)), module0597.$g4580$.getDynamicValue(var63)), var63);
                }
            }
            finally {
                module0597.$g4585$.rebind(var65, var63);
                module0597.$g4581$.rebind(var64, var63);
            }
            module0597.$g4586$.setDynamicValue(Numbers.subtract(module0597.$g4586$.getDynamicValue(var63), (SubLObject)module0597.ONE_INTEGER), var63);
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36556(final SubLObject var63, final SubLObject var45, SubLObject var64) {
        if (var64 == module0597.UNPROVIDED) {
            var64 = Symbols.symbol_function((SubLObject)module0597.EQL);
        }
        final SubLThread var65 = SubLProcess.currentSubLThread();
        SubLObject var66 = f36535(var63, (SubLObject)module0597.UNPROVIDED);
        SubLObject var67 = var45;
        SubLObject var68 = (SubLObject)module0597.NIL;
        var68 = var67.first();
        while (module0597.NIL != var67) {
            if (module0597.NIL == module0004.f104(var68, var66, var64, (SubLObject)module0597.UNPROVIDED) && module0597.NIL != f36557(var68, module0597.$g4577$.getDynamicValue(var65), var63, (SubLObject)module0597.UNPROVIDED)) {
                var66 = (SubLObject)ConsesLow.cons(var68, var66);
            }
            var67 = var67.rest();
            var68 = var67.first();
        }
        return Sequences.nreverse(var66);
    }
    
    public static SubLObject f36552(final SubLObject var50) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        return f36556(var50, module0597.$g4588$.getDynamicValue(var51), (SubLObject)module0597.UNPROVIDED);
    }
    
    public static SubLObject f36555(final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        return f36556(var56, module0597.$g4587$.getDynamicValue(var57), (SubLObject)module0597.UNPROVIDED);
    }
    
    public static SubLObject f36546(final SubLObject var66, final SubLObject var67) {
        SubLObject var68 = (SubLObject)module0597.NIL;
        SubLObject var69 = f36535(var67, (SubLObject)module0597.UNPROVIDED);
        SubLObject var70 = (SubLObject)module0597.NIL;
        var70 = var69.first();
        while (module0597.NIL != var69) {
            if (module0597.NIL != module0004.f104(var66, f36535(var70, (SubLObject)module0597.UNPROVIDED), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED)) {
                var68 = (SubLObject)ConsesLow.cons(var70, var68);
            }
            var69 = var69.rest();
            var70 = var69.first();
        }
        var69 = f36535(var66, (SubLObject)module0597.UNPROVIDED);
        var70 = (SubLObject)module0597.NIL;
        var70 = var69.first();
        while (module0597.NIL != var69) {
            if (module0597.NIL != module0004.f104(var67, f36535(var70, (SubLObject)module0597.UNPROVIDED), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED)) {
                final SubLObject var71 = var70;
                if (module0597.NIL == conses_high.member(var71, var68, Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
                    var68 = (SubLObject)ConsesLow.cons(var71, var68);
                }
            }
            var69 = var69.rest();
            var70 = var69.first();
        }
        return var68;
    }
    
    public static SubLObject f36545(final SubLObject var50) {
        return Sequences.remove(var50, module0035.f2078(Symbols.symbol_function((SubLObject)module0597.$ic116$), f36552(var50), (SubLObject)module0597.UNPROVIDED), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
    }
    
    public static SubLObject f36554(final SubLObject var43) {
        if (module0597.NIL == f36539(var43, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != f36558(var43)) {
            return (SubLObject)module0597.NIL;
        }
        return (SubLObject)module0597.T;
    }
    
    public static SubLObject f36550(final SubLObject var50) {
        if (module0597.NIL == f36539(var50, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != f36559(var50)) {
            return (SubLObject)module0597.NIL;
        }
        return (SubLObject)module0597.T;
    }
    
    public static SubLObject f36558(final SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        return module0004.f104(var43, module0597.$g4585$.getDynamicValue(var44), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
    }
    
    public static SubLObject f36559(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        return module0004.f104(var40, module0597.$g4584$.getDynamicValue(var41), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
    }
    
    public static SubLObject f36549(SubLObject var69, SubLObject var70) {
        if (var69 == module0597.UNPROVIDED) {
            var69 = module0597.$g4586$.getDynamicValue();
        }
        if (var70 == module0597.UNPROVIDED) {
            var70 = module0597.$g4599$.getDynamicValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(!var69.isNumber() || !var70.isNumber() || var70.numGE(var69));
    }
    
    public static SubLObject f36520(final SubLObject var71, SubLObject var29, SubLObject var72, SubLObject var73, SubLObject var74) {
        if (var29 == module0597.UNPROVIDED) {
            var29 = module0597.$g4576$.getDynamicValue();
        }
        if (var72 == module0597.UNPROVIDED) {
            var72 = module0597.$g4635$.getDynamicValue();
        }
        if (var73 == module0597.UNPROVIDED) {
            var73 = Symbols.symbol_function((SubLObject)module0597.$ic7$);
        }
        if (var74 == module0597.UNPROVIDED) {
            var74 = module0597.$g4639$.getDynamicValue();
        }
        final SubLThread var75 = SubLProcess.currentSubLThread();
        f36531((SubLObject)module0597.THREE_INTEGER, (SubLObject)module0597.$ic117$, var29, module0597.$g4562$.getDynamicValue(var75), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
        if (module0597.NIL == module0597.$g4579$.getDynamicValue(var75)) {
            SubLObject var76 = (SubLObject)module0597.NIL;
            SubLObject var77 = module0597.$g4560$.getDynamicValue(var75);
            final SubLObject var78 = module0597.$g4578$.currentBinding(var75);
            final SubLObject var79 = module0597.$g4576$.currentBinding(var75);
            try {
                module0597.$g4578$.bind((SubLObject)module0597.NIL, var75);
                module0597.$g4576$.bind(var29, var75);
                if (module0597.NIL == var77) {
                    SubLObject var80 = var71;
                    final SubLObject var7_77 = module0597.$g4582$.currentBinding(var75);
                    try {
                        module0597.$g4582$.bind((SubLObject)module0597.NIL, var75);
                        module0597.$g4582$.setDynamicValue(var80.first(), var75);
                        while (module0597.NIL == var77 && module0597.NIL != var80) {
                            module0597.$g4568$.setDynamicValue(Numbers.add(module0597.$g4568$.getDynamicValue(var75), (SubLObject)module0597.ONE_INTEGER), var75);
                            f36531((SubLObject)module0597.TWO_INTEGER, (SubLObject)module0597.$ic118$, module0597.$g4562$.getDynamicValue(var75), module0597.$g4568$.getDynamicValue(var75), module0597.$g4582$.getDynamicValue(var75), (SubLObject)module0597.UNPROVIDED);
                            f36560(module0597.$g4582$.getDynamicValue(var75), var72, var73, var74);
                            var77 = f36561();
                            var80 = var80.rest();
                            module0597.$g4582$.setDynamicValue(var80.first(), var75);
                        }
                    }
                    finally {
                        module0597.$g4582$.rebind(var7_77, var75);
                    }
                }
                var76 = module0597.$g4578$.getDynamicValue(var75);
            }
            finally {
                module0597.$g4576$.rebind(var79, var75);
                module0597.$g4578$.rebind(var78, var75);
            }
            if (module0597.NIL == var76) {
                f36526((SubLObject)module0597.THREE_INTEGER, (SubLObject)module0597.$ic119$, var29, module0597.$g4562$.getDynamicValue(var75), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
            }
            return var76;
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36562(final SubLObject var43, SubLObject var29, SubLObject var42) {
        if (var29 == module0597.UNPROVIDED) {
            var29 = module0597.$g4576$.getDynamicValue();
        }
        if (var42 == module0597.UNPROVIDED) {
            var42 = module0597.$g4582$.getDynamicValue();
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        if (module0597.NIL != Functions.funcall(module0597.$g4637$.getDynamicValue(var44), var43)) {
            module0597.$g4569$.setDynamicValue(Numbers.add(module0597.$g4569$.getDynamicValue(var44), (SubLObject)module0597.ONE_INTEGER), var44);
            f36563(var43, var29, var42, (SubLObject)module0597.UNPROVIDED);
            if (module0597.NIL == f36564(var43, var29, (SubLObject)module0597.UNPROVIDED)) {
                f36518(var43, var29, (SubLObject)module0597.UNPROVIDED);
                f36565(var43, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
            }
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36566(final SubLObject var40, SubLObject var29, SubLObject var42) {
        if (var29 == module0597.UNPROVIDED) {
            var29 = module0597.$g4576$.getDynamicValue();
        }
        if (var42 == module0597.UNPROVIDED) {
            var42 = module0597.$g4582$.getDynamicValue();
        }
        final SubLThread var43 = SubLProcess.currentSubLThread();
        if (module0597.NIL != Functions.funcall(module0597.$g4638$.getDynamicValue(var43), var40)) {
            module0597.$g4570$.setDynamicValue(Numbers.add(module0597.$g4570$.getDynamicValue(var43), (SubLObject)module0597.ONE_INTEGER), var43);
            f36563(var40, var29, var42, (SubLObject)module0597.UNPROVIDED);
            if (module0597.NIL == f36564(var40, var29, (SubLObject)module0597.UNPROVIDED)) {
                f36518(var40, var29, (SubLObject)module0597.UNPROVIDED);
                f36531((SubLObject)module0597.FOUR_INTEGER, (SubLObject)module0597.$ic120$, var40, f36534(var40), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                if (module0597.NIL != f36539(var40, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED)) {
                    module0597.$g4579$.setDynamicValue((SubLObject)ConsesLow.cons(var40, module0597.$g4579$.getDynamicValue(var43)), var43);
                    f36531((SubLObject)module0597.ONE_INTEGER, (SubLObject)module0597.$ic121$, var40, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                    if (module0597.NIL != module0597.$g4601$.getDynamicValue(var43)) {
                        module0597.$g4560$.setDynamicValue((SubLObject)module0597.$ic102$, var43);
                    }
                }
                else {
                    module0597.$g4578$.setDynamicValue((SubLObject)ConsesLow.cons(var40, module0597.$g4578$.getDynamicValue(var43)), var43);
                }
            }
            if (module0597.NIL != f36561()) {
                module0597.$g4560$.setDynamicValue((SubLObject)module0597.$ic122$, var43);
            }
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36565(final SubLObject var43, SubLObject var72, SubLObject var73) {
        if (var72 == module0597.UNPROVIDED) {
            var72 = module0597.$g4636$.getDynamicValue();
        }
        if (var73 == module0597.UNPROVIDED) {
            var73 = Symbols.symbol_function((SubLObject)module0597.$ic5$);
        }
        final SubLThread var74 = SubLProcess.currentSubLThread();
        SubLObject var75 = Functions.funcall(module0597.$g4634$.getDynamicValue(var74), var43);
        SubLObject var76 = (SubLObject)module0597.NIL;
        var76 = var75.first();
        while (module0597.NIL != var75) {
            if (module0597.NIL != module0597.$g4560$.getDynamicValue(var74)) {
                return (SubLObject)module0597.NIL;
            }
            if (module0597.NIL == f36551(var76, module0597.$g4582$.getDynamicValue(var74), (SubLObject)module0597.UNPROVIDED) && module0597.NIL != Functions.funcall(var73, var76)) {
                final SubLObject var77 = module0597.$g4582$.currentBinding(var74);
                try {
                    module0597.$g4582$.bind(var43, var74);
                    Functions.funcall(var72, var76);
                }
                finally {
                    module0597.$g4582$.rebind(var77, var74);
                }
            }
            var75 = var75.rest();
            var76 = var75.first();
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36567(final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        if (module0597.NIL == module0147.f9508(var56)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != module0597.$g4613$.getDynamicValue(var57) && module0597.NIL == f36568(var56)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != module0597.$g4602$.getDynamicValue(var57) && module0597.NIL == module0178.f11284(var56)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != module0597.$g4607$.getDynamicValue(var57) && module0597.NIL != f36569(var56)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != module0597.$g4609$.getDynamicValue(var57) && module0597.NIL != f36570(var56)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != module0597.$g4611$.getDynamicValue(var57) && module0597.NIL != f36571(var56)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != module0597.$g4605$.getDynamicValue(var57) && module0597.NIL != f36572(var56)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != module0597.$g4629$.getDynamicValue(var57) && module0597.NIL != f36573(var56)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != module0597.$g4631$.getDynamicValue(var57) && module0597.NIL != f36574(var56)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != module0597.$g4625$.getDynamicValue(var57) && module0597.NIL != f36575(var56)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != module0597.$g4627$.getDynamicValue(var57) && module0597.NIL != f36576(var56)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != module0597.$g4633$.getDynamicValue(var57) && module0597.NIL != f36577(var56)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != f36578(var56)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != module0597.$g4603$.getDynamicValue(var57) && module0597.NIL != f36579(var56)) {
            return (SubLObject)module0597.NIL;
        }
        return (SubLObject)module0597.T;
    }
    
    public static SubLObject f36580(final SubLObject var50) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        if (module0597.NIL == module0173.f10955(var50)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != f36551(var50, module0597.$g4576$.getDynamicValue(var51), (SubLObject)module0597.UNPROVIDED)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != module0269.f17725(var50)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != module0597.$g4605$.getDynamicValue(var51) && module0597.NIL != f36581(var50)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != module0597.$g4615$.getDynamicValue(var51) && module0597.NIL != f36582(var50)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != module0597.$g4619$.getDynamicValue(var51) && module0597.NIL != f36583(var50)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != module0597.$g4621$.getDynamicValue(var51) && module0597.NIL != f36584(var50)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != module0597.$g4594$.getDynamicValue(var51) && module0597.NIL != f36585(var50)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != module0597.$g4623$.getDynamicValue(var51) && module0597.NIL != f36586(var50)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != f36587(var50)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != module0597.$g4617$.getDynamicValue(var51) && module0597.NIL != f36588(var50)) {
            return (SubLObject)module0597.NIL;
        }
        return (SubLObject)module0597.T;
    }
    
    public static SubLObject f36588(final SubLObject var50) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        if (module0597.NIL != module0269.f17705(var50)) {
            final SubLObject var52 = module0549.f33901(var50);
            if (var52.isInteger()) {
                return Numbers.numG(var52, Sequences.creduce((SubLObject)module0597.$ic123$, module0035.remove_if_not((SubLObject)module0597.$ic124$, (SubLObject)ConsesLow.cons(module0597.$g4618$.getDynamicValue(var51), Mapping.mapcar((SubLObject)module0597.$ic125$, module0597.$g4577$.getDynamicValue(var51))), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED));
            }
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36582(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        return module0256.f16604(var40, module0597.$g4616$.getDynamicValue(var41), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
    }
    
    public static SubLObject f36583(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        return module0259.f16902(var40, module0597.$g4620$.getDynamicValue(var41), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
    }
    
    public static SubLObject f36585(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (module0597.NIL != module0597.$g4595$.getDynamicValue(var41)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0597.NIL == module0259.f16902(var40, module0597.$g4595$.getDynamicValue(var41), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED) && module0597.NIL == module0252.f16352(module0244.f15797(var40, (SubLObject)module0597.UNPROVIDED), var40, module0597.$g4595$.getDynamicValue(var41), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED));
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36586(final SubLObject var50) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        if (module0597.NIL != module0173.f10955(var50)) {
            SubLObject var52 = (SubLObject)module0597.NIL;
            if (module0597.NIL == var52) {
                SubLObject var53;
                SubLObject var54;
                for (var53 = module0597.$g4624$.getDynamicValue(var51), var54 = (SubLObject)module0597.NIL, var54 = var53.first(); module0597.NIL == var52 && module0597.NIL != var53; var52 = module0220.f14544(var50, var54.first(), conses_high.second(var54), (SubLObject)module0597.UNPROVIDED), var53 = var53.rest(), var54 = var53.first()) {}
            }
            return var52;
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36584(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        return module0259.f16902(var40, module0597.$g4622$.getDynamicValue(var41), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
    }
    
    public static SubLObject f36573(final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        SubLObject var58 = (SubLObject)module0597.NIL;
        if (module0597.NIL != module0178.f11284(var56)) {
            if (module0597.NIL == var58) {
                SubLObject var59;
                SubLObject var60;
                for (var59 = module0597.$g4630$.getDynamicValue(var57), var60 = (SubLObject)module0597.NIL, var60 = var59.first(); module0597.NIL == var58 && module0597.NIL != var59; var58 = f36583(module0178.f11331(var56, var60)), var59 = var59.rest(), var60 = var59.first()) {}
            }
            if (module0597.NIL == var58) {
                SubLObject var59;
                SubLObject var60;
                for (var59 = module0597.$g4630$.getDynamicValue(var57), var60 = (SubLObject)module0597.NIL, var60 = var59.first(); module0597.NIL == var58 && module0597.NIL != var59; var58 = f36582(module0178.f11331(var56, var60)), var59 = var59.rest(), var60 = var59.first()) {}
            }
        }
        return var58;
    }
    
    public static SubLObject f36569(final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        if (module0597.NIL != module0597.$g4608$.getDynamicValue(var57) && module0597.NIL != module0178.f11284(var56)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0597.NIL == module0004.f104(module0178.f11333(var56), module0597.$g4608$.getDynamicValue(var57), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED));
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36570(final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        if (module0597.NIL != module0597.$g4610$.getDynamicValue(var57) && module0597.NIL != module0178.f11284(var56)) {
            return module0004.f104(module0178.f11333(var56), module0597.$g4610$.getDynamicValue(var57), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36571(final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        if (module0597.NIL != module0597.$g4611$.getDynamicValue(var57) && module0597.NIL != module0174.f11035(var56)) {
            return module0004.f104(module0178.f11287(var56), module0597.$g4612$.getDynamicValue(var57), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36575(final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        SubLObject var58 = (SubLObject)module0597.NIL;
        if (module0597.NIL != module0210.f13566(var56)) {
            final SubLObject var59 = f36589(var56, (SubLObject)module0597.UNPROVIDED);
            if (module0597.NIL == var58) {
                SubLObject var60 = module0597.$g4626$.getDynamicValue(var57);
                SubLObject var61 = (SubLObject)module0597.NIL;
                var61 = var60.first();
                while (module0597.NIL == var58 && module0597.NIL != var60) {
                    SubLObject var62 = (SubLObject)module0597.NIL;
                    if (module0597.NIL == var62) {
                        SubLObject var76_86;
                        SubLObject var63;
                        for (var76_86 = var61, var63 = (SubLObject)module0597.NIL, var63 = var76_86.first(); module0597.NIL == var62 && module0597.NIL != var76_86; var62 = (SubLObject)SubLObjectFactory.makeBoolean(module0597.NIL == module0004.f104(var63, var59, Symbols.symbol_function((SubLObject)module0597.EQUAL), (SubLObject)module0597.UNPROVIDED)), var76_86 = var76_86.rest(), var63 = var76_86.first()) {}
                    }
                    var58 = (SubLObject)SubLObjectFactory.makeBoolean(module0597.NIL == var62);
                    var60 = var60.rest();
                    var61 = var60.first();
                }
            }
        }
        return var58;
    }
    
    public static SubLObject f36576(final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        if (module0597.NIL != module0597.$g4628$.getDynamicValue(var57)) {
            SubLObject var58 = (SubLObject)module0597.NIL;
            if (module0597.NIL != module0210.f13566(var56)) {
                final SubLObject var59 = f36589(var56, (SubLObject)module0597.UNPROVIDED);
                if (module0597.NIL == var58) {
                    SubLObject var60;
                    SubLObject var61;
                    for (var60 = module0597.$g4628$.getDynamicValue(var57), var61 = (SubLObject)module0597.NIL, var61 = var60.first(); module0597.NIL == var58 && module0597.NIL != var60; var58 = module0004.f104(var61, var59, Symbols.symbol_function((SubLObject)module0597.EQUAL), (SubLObject)module0597.UNPROVIDED), var60 = var60.rest(), var61 = var60.first()) {}
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(module0597.NIL == var58);
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36568(final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0597.NIL == Symbols.fboundp(module0597.$g4614$.getDynamicValue(var57)) || module0597.NIL != Functions.funcall(module0597.$g4614$.getDynamicValue(var57), var56));
    }
    
    public static SubLObject f36574(final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        SubLObject var58 = (SubLObject)module0597.NIL;
        if (module0597.NIL != module0210.f13566(var56) && module0597.NIL == var58) {
            SubLObject var59 = module0597.$g4632$.getDynamicValue(var57);
            SubLObject var60 = (SubLObject)module0597.NIL;
            var60 = var59.first();
            while (module0597.NIL == var58 && module0597.NIL != var59) {
                final SubLObject var61 = f36590(var56, var60);
                if (module0597.NIL == var58) {
                    SubLObject var76_91;
                    SubLObject var62;
                    for (var76_91 = var61, var62 = (SubLObject)module0597.NIL, var62 = var76_91.first(); module0597.NIL == var58 && module0597.NIL != var76_91; var58 = f36583(var62), var76_91 = var76_91.rest(), var62 = var76_91.first()) {}
                }
                if (module0597.NIL == var58) {
                    SubLObject var62;
                    SubLObject var76_92;
                    for (var76_92 = var61, var62 = (SubLObject)module0597.NIL, var62 = var76_92.first(); module0597.NIL == var58 && module0597.NIL != var76_92; var58 = f36582(var62), var76_92 = var76_92.rest(), var62 = var76_92.first()) {}
                }
                var59 = var59.rest();
                var60 = var59.first();
            }
        }
        return var58;
    }
    
    public static SubLObject f36577(final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        SubLObject var58 = (SubLObject)module0597.NIL;
        if (module0597.NIL != module0210.f13566(var56)) {
            final SubLObject var59 = module0177.f11211(var56);
            final SubLObject var60 = module0178.f11287(var56);
            final SubLObject var61 = module0597.$g4633$.currentBinding(var57);
            try {
                module0597.$g4633$.bind((SubLObject)module0597.NIL, var57);
                if (module0597.NIL != var59) {
                    SubLObject var62;
                    SubLObject var63;
                    SubLObject var64;
                    for (var62 = (SubLObject)module0597.NIL, var62 = module0192.f12029(var59); module0597.NIL == var58 && module0597.NIL != var62; var62 = var62.rest()) {
                        var63 = var62.first();
                        if (!var56.eql(var63)) {
                            var64 = module0178.f11287(var63);
                            if (module0597.NIL != module0147.f9507(var64) && module0597.NIL != module0262.f17336(var60, var64, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED) && module0597.NIL == module0262.f17336(var64, var60, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED)) {
                                var58 = Functions.funcall(module0597.$g4637$.getDynamicValue(var57), var63);
                            }
                        }
                    }
                }
            }
            finally {
                module0597.$g4633$.rebind(var61, var57);
            }
        }
        return var58;
    }
    
    public static SubLObject f36572(final SubLObject var43) {
        final SubLObject var44 = f36591(var43);
        return var44;
    }
    
    public static SubLObject f36591(final SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        if (module0597.$g4562$.getDynamicValue(var44).numGE((SubLObject)module0597.ONE_INTEGER)) {
            final SubLObject var45 = (SubLObject)module0597.NIL;
            if (module0597.NIL == var45) {
                SubLObject var46 = (SubLObject)ConsesLow.cons(module0597.$g4582$.getDynamicValue(var44), f36535(var43, (SubLObject)module0597.UNPROVIDED));
                SubLObject var47 = (SubLObject)module0597.NIL;
                var47 = var46.first();
                while (module0597.NIL == var45 && module0597.NIL != var46) {
                    final SubLObject var48 = f36592(var43, var47);
                    if (module0597.NIL != var48) {
                        if (module0597.NIL != Sequences.remove(module0597.$g4576$.getDynamicValue(var44), f36534(var43), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED)) {
                            return (SubLObject)module0597.T;
                        }
                        if (module0597.NIL == var45) {
                            SubLObject var76_100 = f36535(var47, (SubLObject)module0597.UNPROVIDED);
                            SubLObject var49 = (SubLObject)module0597.NIL;
                            var49 = var76_100.first();
                            while (module0597.NIL == var45 && module0597.NIL != var76_100) {
                                if (module0597.NIL == var45) {
                                    SubLObject var76_101 = f36535(var49, (SubLObject)module0597.UNPROVIDED);
                                    SubLObject var50 = (SubLObject)module0597.NIL;
                                    var50 = var76_101.first();
                                    while (module0597.NIL == var45 && module0597.NIL != var76_101) {
                                        final SubLObject var51 = f36592(var49, var50);
                                        if (module0597.NIL != var51 && !var48.eql(var51)) {
                                            return (SubLObject)module0597.T;
                                        }
                                        var76_101 = var76_101.rest();
                                        var50 = var76_101.first();
                                    }
                                }
                                var76_100 = var76_100.rest();
                                var49 = var76_100.first();
                            }
                        }
                    }
                    var46 = var46.rest();
                    var47 = var46.first();
                }
            }
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36581(final SubLObject var50) {
        final SubLObject var51 = f36593(var50);
        return var51;
    }
    
    public static SubLObject f36593(final SubLObject var50) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        if (module0597.$g4562$.getDynamicValue(var51).numGE((SubLObject)module0597.ONE_INTEGER)) {
            final SubLObject var52 = (SubLObject)module0597.NIL;
            final SubLObject var53 = conses_high.adjoin(module0597.$g4576$.getDynamicValue(var51), f36534(var50), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
            if (module0597.NIL == var52) {
                SubLObject var54 = (SubLObject)ConsesLow.cons(module0597.$g4582$.getDynamicValue(var51), f36535(var50, (SubLObject)module0597.UNPROVIDED));
                SubLObject var55 = (SubLObject)module0597.NIL;
                var55 = var54.first();
                while (module0597.NIL == var52 && module0597.NIL != var54) {
                    final SubLObject var56 = f36592(var55, var50);
                    if (module0597.NIL != var56) {
                        if (module0597.NIL != Sequences.remove(module0597.$g4576$.getDynamicValue(var51), f36534(var55), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED)) {
                            return (SubLObject)module0597.T;
                        }
                        if (module0597.NIL == var52) {
                            SubLObject var76_105 = f36535(var55, (SubLObject)module0597.UNPROVIDED);
                            SubLObject var57 = (SubLObject)module0597.NIL;
                            var57 = var76_105.first();
                            while (module0597.NIL == var52 && module0597.NIL != var76_105) {
                                if (module0597.NIL == var52) {
                                    SubLObject var76_106 = f36535(var57, (SubLObject)module0597.UNPROVIDED);
                                    SubLObject var58 = (SubLObject)module0597.NIL;
                                    var58 = var76_106.first();
                                    while (module0597.NIL == var52 && module0597.NIL != var76_106) {
                                        final SubLObject var59 = f36592(var58, var57);
                                        if (module0597.NIL != var59) {
                                            final SubLObject var60 = f36534(var58);
                                            if (module0597.NIL == module0035.f1997(var53)) {
                                                return (SubLObject)module0597.T;
                                            }
                                            if (var56.eql(var59)) {
                                                return Equality.equal(var53, var60);
                                            }
                                            if (var53.equal(var60)) {
                                                return (SubLObject)module0597.T;
                                            }
                                        }
                                        var76_106 = var76_106.rest();
                                        var58 = var76_106.first();
                                    }
                                }
                                var76_105 = var76_105.rest();
                                var57 = var76_105.first();
                            }
                        }
                    }
                    var54 = var54.rest();
                    var55 = var54.first();
                }
            }
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36592(final SubLObject var43, final SubLObject var87) {
        if (module0597.NIL != module0178.f11284(var43)) {
            final SubLObject var88 = module0178.f11285(var43);
            final SubLObject var89 = module0202.f12832(var88, (SubLObject)module0597.UNPROVIDED);
            final SubLObject var90 = Sequences.position(var87, var88, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
            final SubLObject var91 = var89;
            if (var91.eql(module0597.$ic126$)) {
                final SubLObject var48_110 = var90;
                if (var48_110.eql((SubLObject)module0597.ONE_INTEGER)) {
                    return (SubLObject)module0597.$ic127$;
                }
                if (var48_110.eql((SubLObject)module0597.TWO_INTEGER)) {
                    return (SubLObject)module0597.$ic128$;
                }
            }
            else if (var91.eql(module0597.$ic129$)) {
                final SubLObject var48_111 = var90;
                if (var48_111.eql((SubLObject)module0597.ONE_INTEGER)) {
                    return (SubLObject)module0597.$ic127$;
                }
                if (var48_111.eql((SubLObject)module0597.TWO_INTEGER)) {
                    return (SubLObject)module0597.$ic128$;
                }
            }
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36594(final SubLObject var63) {
        final SubLThread var64 = SubLProcess.currentSubLThread();
        if (module0597.NIL != module0597.$g4603$.getDynamicValue(var64) && module0597.NIL != f36595(var63)) {
            return (SubLObject)module0597.NIL;
        }
        if (module0597.NIL != module0597.$g4604$.getDynamicValue(var64) && module0597.NIL != f36596(var63)) {
            return (SubLObject)module0597.NIL;
        }
        return (SubLObject)module0597.T;
    }
    
    public static SubLObject f36560(final SubLObject var87, SubLObject var72, SubLObject var73, SubLObject var74) {
        if (var72 == module0597.UNPROVIDED) {
            var72 = module0597.$g4635$.getDynamicValue();
        }
        if (var73 == module0597.UNPROVIDED) {
            var73 = Symbols.symbol_function((SubLObject)module0597.IDENTITY);
        }
        if (var74 == module0597.UNPROVIDED) {
            var74 = Symbols.symbol_function((SubLObject)module0597.IDENTITY);
        }
        f36597(module0226.f15093(var87, (SubLObject)module0597.UNPROVIDED), var72, var73, var74, Symbols.symbol_function((SubLObject)module0597.IDENTITY), (SubLObject)module0597.NIL);
        return var87;
    }
    
    public static SubLObject f36597(final SubLObject var63, final SubLObject var72, SubLObject var73, SubLObject var74, SubLObject var112, SubLObject var113) {
        if (var73 == module0597.UNPROVIDED) {
            var73 = Symbols.symbol_function((SubLObject)module0597.$ic7$);
        }
        if (var74 == module0597.UNPROVIDED) {
            var74 = Symbols.symbol_function((SubLObject)module0597.IDENTITY);
        }
        if (var112 == module0597.UNPROVIDED) {
            var112 = Symbols.symbol_function((SubLObject)module0597.IDENTITY);
        }
        if (var113 == module0597.UNPROVIDED) {
            var113 = (SubLObject)module0597.T;
        }
        final SubLThread var114 = SubLProcess.currentSubLThread();
        if (module0597.NIL == module0597.$g4560$.getDynamicValue(var114)) {
            if (module0597.NIL != Functions.funcall(var73, Functions.funcall(var112, var63))) {
                Functions.funcall(var72, var63);
                if (module0597.NIL == var113) {
                    if (module0597.NIL != module0597.$g4606$.getDynamicValue(var114) && module0597.NIL != module0174.f11035(var63) && module0597.NIL != module0228.f15209(var63)) {
                        final SubLObject var115 = module0597.$g4606$.currentBinding(var114);
                        try {
                            module0597.$g4606$.bind((SubLObject)module0597.NIL, var114);
                            final SubLObject var116 = module0178.f11334(var63);
                            if (module0597.NIL != Functions.funcall(module0597.$g4638$.getDynamicValue(var114), var116)) {
                                f36560(var116, var72, var73, var74);
                            }
                        }
                        finally {
                            module0597.$g4606$.rebind(var115, var114);
                        }
                    }
                    return (SubLObject)module0597.NIL;
                }
            }
            if (var63.isCons()) {
                SubLObject var117 = (SubLObject)module0597.NIL;
                SubLObject var118 = (SubLObject)module0597.NIL;
                var117 = var63;
                var118 = var117.first();
                while (var117.rest().isCons()) {
                    f36597(var118, var72, var73, var74, var112, var113);
                    var117 = var117.rest();
                    var118 = var117.first();
                }
                f36597(var117.first(), var72, var73, var74, var112, var113);
                if (module0597.NIL != var117.rest()) {
                    f36597(var117.rest(), var72, var73, var74, var112, var113);
                }
            }
            else if (module0597.NIL != module0053.f3802(var63)) {
                f36597(module0053.f3805(var63), var72, var73, var74, var112, var113);
                f36597(module0053.f3806(var63), var72, var73, var74, var112, var113);
                if (module0597.NIL != Functions.funcall(var74, var63)) {
                    f36597(module0053.f3803(var63), var72, var73, var74, var112, var113);
                    f36597(module0053.f3804(var63), var72, var73, var74, var112, var113);
                }
            }
            else if (module0597.NIL != module0174.f11035(var63)) {
                f36597(module0177.f11163(var63), var72, var73, var74, var112, var113);
                f36597(module0178.f11287(var63), var72, var73, var74, var112, var113);
                f36597(module0178.f11294(var63), var72, var73, var74, var112, var113);
            }
            else if (module0597.NIL != module0192.f12006(var63)) {
                f36597(module0192.f12017(var63), var72, var73, var74, var112, var113);
            }
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36590(final SubLObject var43, final SubLObject var89) {
        final SubLThread var90 = SubLProcess.currentSubLThread();
        var90.resetMultipleValues();
        final SubLObject var91 = module0217.f14378(module0178.f11282(var43));
        final SubLObject var92 = var90.secondMultipleValue();
        final SubLObject var93 = var90.thirdMultipleValue();
        var90.resetMultipleValues();
        if (var89.eql((SubLObject)module0597.$ic130$)) {
            return Mapping.mapcar(Symbols.symbol_function((SubLObject)module0597.$ic131$), var91);
        }
        if (var89.eql((SubLObject)module0597.$ic132$)) {
            return Mapping.mapcar(Symbols.symbol_function((SubLObject)module0597.$ic131$), var92);
        }
        if (var89.eql((SubLObject)module0597.$ic133$)) {
            return var93;
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36598(final SubLObject var43, SubLObject var64) {
        if (var64 == module0597.UNPROVIDED) {
            var64 = Symbols.symbol_function((SubLObject)module0597.EQL);
        }
        SubLObject var65 = (SubLObject)module0597.NIL;
        final SubLObject var66 = module0178.f11282(var43);
        SubLObject var67 = module0232.f15308(var66);
        SubLObject var68 = (SubLObject)module0597.NIL;
        var68 = var67.first();
        while (module0597.NIL != var67) {
            SubLObject var28_120 = module0205.f13206(var68, (SubLObject)module0597.UNPROVIDED);
            SubLObject var69 = (SubLObject)module0597.NIL;
            var69 = var28_120.first();
            while (module0597.NIL != var28_120) {
                final SubLObject var70 = var69;
                if (module0597.NIL == conses_high.member(var70, var65, var64, Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
                    var65 = (SubLObject)ConsesLow.cons(var70, var65);
                }
                var28_120 = var28_120.rest();
                var69 = var28_120.first();
            }
            var67 = var67.rest();
            var68 = var67.first();
        }
        var67 = module0232.f15306(var66);
        var68 = (SubLObject)module0597.NIL;
        var68 = var67.first();
        while (module0597.NIL != var67) {
            SubLObject var28_121 = module0205.f13206(var68, (SubLObject)module0597.UNPROVIDED);
            SubLObject var69 = (SubLObject)module0597.NIL;
            var69 = var28_121.first();
            while (module0597.NIL != var28_121) {
                final SubLObject var70 = var69;
                if (module0597.NIL == conses_high.member(var70, var65, var64, Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
                    var65 = (SubLObject)ConsesLow.cons(var70, var65);
                }
                var28_121 = var28_121.rest();
                var69 = var28_121.first();
            }
            var67 = var67.rest();
            var68 = var67.first();
        }
        var67 = var65;
        SubLObject var71 = (SubLObject)module0597.NIL;
        var71 = var67.first();
        while (module0597.NIL != var67) {
            if (module0597.NIL != module0173.f10955(var71)) {
                final SubLObject var72 = module0228.f15205(var71);
                SubLObject var28_122 = module0205.f13304(var72, (SubLObject)module0597.UNPROVIDED);
                SubLObject var73 = (SubLObject)module0597.NIL;
                var73 = var28_122.first();
                while (module0597.NIL != var28_122) {
                    final SubLObject var74 = var73;
                    if (module0597.NIL == conses_high.member(var74, var65, var64, Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
                        var65 = (SubLObject)ConsesLow.cons(var74, var65);
                    }
                    var28_122 = var28_122.rest();
                    var73 = var28_122.first();
                }
            }
            var67 = var67.rest();
            var71 = var67.first();
        }
        return var65;
    }
    
    public static SubLObject f36589(final SubLObject var43, SubLObject var64) {
        if (var64 == module0597.UNPROVIDED) {
            var64 = Symbols.symbol_function((SubLObject)module0597.EQL);
        }
        return Sequences.remove_duplicates(module0035.f2119(module0538.f33478(var43, (SubLObject)module0597.UNPROVIDED)), var64, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
    }
    
    public static SubLObject f36517() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        module0597.$g4560$.setDynamicValue((SubLObject)module0597.NIL, var4);
        module0597.$g4566$.setDynamicValue((SubLObject)module0597.NIL, var4);
        module0597.$g4579$.setDynamicValue((SubLObject)module0597.NIL, var4);
        module0597.$g4583$.setDynamicValue((SubLObject)module0597.NIL, var4);
        Hashtables.clrhash(module0597.$g4590$.getDynamicValue(var4));
        Hashtables.clrhash(module0597.$g4591$.getDynamicValue(var4));
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36527(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        module0597.$g4566$.setDynamicValue((SubLObject)ConsesLow.list(new SubLObject[] { module0597.$g4561$.getDynamicValue(var6), Sequences.length(var5), module0597.$ic134$, (module0597.NIL != var5) ? module0048.f3307(Numbers.divide(f36599(var5), Sequences.length(var5)), (SubLObject)module0597.ONE_INTEGER) : module0597.NIL, module0597.$ic135$, module0597.$g4562$.getDynamicValue(var6), module0597.$ic136$, module0597.$g4570$.getDynamicValue(var6), module0597.$ic137$, module0597.$g4568$.getDynamicValue(var6), module0597.$ic111$, module0597.$g4569$.getDynamicValue(var6), module0597.$ic138$, module0597.$g4568$.getDynamicValue(var6).numG((SubLObject)module0597.ZERO_INTEGER) ? module0048.f3307(Numbers.divide(module0597.$g4569$.getDynamicValue(var6), module0597.$g4568$.getDynamicValue(var6)), (SubLObject)module0597.ONE_INTEGER) : module0597.NIL, module0597.$ic139$, module0597.$g4583$.getDynamicValue(var6).isNumber() ? module0048.f3307(module0597.$g4583$.getDynamicValue(var6), (SubLObject)module0597.ONE_INTEGER) : module0597.NIL, module0597.$ic140$, module0597.$g4560$.getDynamicValue(var6) }), var6);
        return module0597.$g4566$.getDynamicValue(var6);
    }
    
    public static SubLObject f36600() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return f36601(module0597.$g4564$.getDynamicValue(var4));
    }
    
    public static SubLObject f36602() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return f36601(module0597.$g4565$.getDynamicValue(var4));
    }
    
    public static SubLObject f36601(final SubLObject var125) {
        final SubLThread var126 = SubLProcess.currentSubLThread();
        SubLObject var127 = (SubLObject)module0597.ZERO_INTEGER;
        final SubLObject var128 = module0597.$g4591$.getDynamicValue(var126);
        SubLObject var129 = (SubLObject)module0597.NIL;
        SubLObject var130 = (SubLObject)module0597.NIL;
        final Iterator var131 = Hashtables.getEntrySetIterator(var128);
        try {
            while (Hashtables.iteratorHasNext(var131)) {
                final Map.Entry var132 = Hashtables.iteratorNextEntry(var131);
                var129 = Hashtables.getEntryKey(var132);
                var130 = Hashtables.getEntryValue(var132);
                if (module0597.NIL != Functions.funcall(var125, var129)) {
                    var127 = Numbers.add(var127, (SubLObject)module0597.ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var131);
        }
        return var127;
    }
    
    public static SubLObject f36519() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        module0597.$g4562$.setDynamicValue(Numbers.add(module0597.$g4562$.getDynamicValue(var4), (SubLObject)module0597.ONE_INTEGER), var4);
        module0012.note_percent_progress(module0597.$g4562$.getDynamicValue(var4), module0597.$g4597$.getDynamicValue(var4));
        return module0597.$g4562$.getDynamicValue(var4);
    }
    
    public static SubLObject f36522(final SubLObject var30, final SubLObject var31, final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        if (module0597.NIL == module0597.$g4560$.getDynamicValue(var33)) {
            if (module0597.NIL != f36603(var31, var32)) {
                module0597.$g4560$.setDynamicValue((SubLObject)module0597.$ic141$, var33);
            }
            else if (module0597.NIL != f36604(var30)) {
                module0597.$g4560$.setDynamicValue((SubLObject)module0597.$ic142$, var33);
            }
            else if (module0597.NIL != f36561()) {
                module0597.$g4560$.setDynamicValue((SubLObject)module0597.$ic122$, var33);
            }
        }
        return module0597.$g4560$.getDynamicValue(var33);
    }
    
    public static SubLObject f36603(final SubLObject var31, final SubLObject var32) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0597.NIL == var31 && module0597.NIL == var32);
    }
    
    public static SubLObject f36604(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (var30.isNumber() && module0597.$g4597$.getDynamicValue(var31).isNumber()) {
            return Numbers.numGE(var30, module0597.$g4597$.getDynamicValue(var31));
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36561() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0597.$g4570$.getDynamicValue(var4).isNumber() && module0597.$g4600$.getDynamicValue(var4).isNumber()) {
            return Numbers.numGE(module0597.$g4570$.getDynamicValue(var4), module0597.$g4600$.getDynamicValue(var4));
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36599(final SubLObject var35) {
        SubLObject var36 = (SubLObject)module0597.ZERO_INTEGER;
        SubLObject var37 = module0035.f2119(var35);
        SubLObject var38 = (SubLObject)module0597.NIL;
        var38 = var37.first();
        while (module0597.NIL != var37) {
            if (module0597.NIL != module0174.f11035(var38)) {
                var36 = Numbers.add(var36, (SubLObject)module0597.ONE_INTEGER);
            }
            var37 = var37.rest();
            var38 = var37.first();
        }
        return var36;
    }
    
    public static SubLObject f36540(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        return module0004.f104(var40, module0597.$g4577$.getDynamicValue(var41), Symbols.symbol_function((SubLObject)module0597.$ic143$), (SubLObject)module0597.UNPROVIDED);
    }
    
    public static SubLObject f36551(final SubLObject var132, final SubLObject var133, SubLObject var64) {
        if (var64 == module0597.UNPROVIDED) {
            var64 = module0597.$g4563$.getDynamicValue();
        }
        return Functions.funcall(var64, var132, var133);
    }
    
    public static SubLObject f36596(final SubLObject var63) {
        final SubLThread var64 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0597.NIL != module0053.f3802(var63) && module0597.$g4589$.getDynamicValue(var64).eql((SubLObject)module0597.TWO_INTEGER) && module0053.f3803(var63).eql(module0597.$ic129$));
    }
    
    public static SubLObject f36595(final SubLObject var63) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0597.NIL != module0053.f3802(var63) && module0597.NIL != module0269.f17754(module0053.f3803(var63)));
    }
    
    public static SubLObject f36563(final SubLObject var63, SubLObject var29, SubLObject var42, SubLObject var64) {
        if (var29 == module0597.UNPROVIDED) {
            var29 = module0597.$g4576$.getDynamicValue();
        }
        if (var42 == module0597.UNPROVIDED) {
            var42 = module0597.$g4582$.getDynamicValue();
        }
        if (var64 == module0597.UNPROVIDED) {
            var64 = Symbols.symbol_function((SubLObject)module0597.EQUAL);
        }
        final SubLThread var65 = SubLProcess.currentSubLThread();
        module0030.f1600((SubLObject)ConsesLow.list(var63, var29), var42, module0597.$g4590$.getDynamicValue(var65), var64);
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36605(final SubLObject var63, SubLObject var29) {
        if (var29 == module0597.UNPROVIDED) {
            var29 = module0597.$g4576$.getDynamicValue();
        }
        final SubLThread var64 = SubLProcess.currentSubLThread();
        return Hashtables.gethash((SubLObject)ConsesLow.list(var63, var29), module0597.$g4590$.getDynamicValue(var64), (SubLObject)module0597.UNPROVIDED);
    }
    
    public static SubLObject f36535(final SubLObject var63, SubLObject var104) {
        if (var104 == module0597.UNPROVIDED) {
            var104 = module0597.$g4577$.getDynamicValue();
        }
        SubLObject var105 = (SubLObject)module0597.NIL;
        SubLObject var106 = var104;
        SubLObject var107 = (SubLObject)module0597.NIL;
        var107 = var106.first();
        while (module0597.NIL != var106) {
            var105 = conses_high.nunion(var105, conses_high.copy_list(f36605(var63, var107)), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
            var106 = var106.rest();
            var107 = var106.first();
        }
        return var105;
    }
    
    public static SubLObject f36606(final SubLObject var63, SubLObject var29, SubLObject var42, SubLObject var64) {
        if (var29 == module0597.UNPROVIDED) {
            var29 = module0597.$g4576$.getDynamicValue();
        }
        if (var42 == module0597.UNPROVIDED) {
            var42 = module0597.$g4582$.getDynamicValue();
        }
        if (var64 == module0597.UNPROVIDED) {
            var64 = Symbols.symbol_function((SubLObject)module0597.EQUAL);
        }
        return module0004.f104(var42, f36605(var63, var29), var64, (SubLObject)module0597.UNPROVIDED);
    }
    
    public static SubLObject f36557(final SubLObject var63, SubLObject var104, SubLObject var42, SubLObject var64) {
        if (var104 == module0597.UNPROVIDED) {
            var104 = module0597.$g4577$.getDynamicValue();
        }
        if (var42 == module0597.UNPROVIDED) {
            var42 = module0597.$g4582$.getDynamicValue();
        }
        if (var64 == module0597.UNPROVIDED) {
            var64 = Symbols.symbol_function((SubLObject)module0597.EQUAL);
        }
        SubLObject var105 = (SubLObject)module0597.NIL;
        if (module0597.NIL == var105) {
            SubLObject var106;
            SubLObject var107;
            for (var106 = var104, var107 = (SubLObject)module0597.NIL, var107 = var106.first(); module0597.NIL == var105 && module0597.NIL != var106; var105 = f36606(var63, var107, var42, var64), var106 = var106.rest(), var107 = var106.first()) {}
        }
        return var105;
    }
    
    public static SubLObject f36607(final SubLObject var63) {
        final SubLThread var64 = SubLProcess.currentSubLThread();
        return Hashtables.gethash(var63, module0597.$g4591$.getDynamicValue(var64), (SubLObject)module0597.UNPROVIDED);
    }
    
    public static SubLObject f36564(final SubLObject var63, SubLObject var29, SubLObject var64) {
        if (var29 == module0597.UNPROVIDED) {
            var29 = module0597.$g4576$.getDynamicValue();
        }
        if (var64 == module0597.UNPROVIDED) {
            var64 = Symbols.symbol_function((SubLObject)module0597.EQL);
        }
        return module0004.f104(var29, f36534(var63), var64, (SubLObject)module0597.UNPROVIDED);
    }
    
    public static SubLObject f36539(final SubLObject var63, SubLObject var104, SubLObject var64) {
        if (var104 == module0597.UNPROVIDED) {
            var104 = module0597.$g4577$.getDynamicValue();
        }
        if (var64 == module0597.UNPROVIDED) {
            var64 = Symbols.symbol_function((SubLObject)module0597.EQL);
        }
        return conses_high.subsetp(var104, f36534(var63), var64, (SubLObject)module0597.UNPROVIDED);
    }
    
    public static SubLObject f36608(final SubLObject var63, SubLObject var104, SubLObject var64) {
        if (var104 == module0597.UNPROVIDED) {
            var104 = module0597.$g4577$.getDynamicValue();
        }
        if (var64 == module0597.UNPROVIDED) {
            var64 = Symbols.symbol_function((SubLObject)module0597.EQL);
        }
        return module0035.f2180(f36534(var63), var104, var64, (SubLObject)module0597.UNPROVIDED);
    }
    
    public static SubLObject f36534(final SubLObject var63) {
        final SubLThread var64 = SubLProcess.currentSubLThread();
        return Hashtables.gethash(var63, module0597.$g4591$.getDynamicValue(var64), (SubLObject)module0597.UNPROVIDED);
    }
    
    public static SubLObject f36609(SubLObject var29) {
        if (var29 == module0597.UNPROVIDED) {
            var29 = module0597.$g4576$.getDynamicValue();
        }
        final SubLThread var30 = SubLProcess.currentSubLThread();
        SubLObject var31 = (SubLObject)module0597.NIL;
        final SubLObject var32 = module0597.$g4591$.getDynamicValue(var30);
        SubLObject var33 = (SubLObject)module0597.NIL;
        SubLObject var34 = (SubLObject)module0597.NIL;
        final Iterator var35 = Hashtables.getEntrySetIterator(var32);
        try {
            while (Hashtables.iteratorHasNext(var35)) {
                final Map.Entry var36 = Hashtables.iteratorNextEntry(var35);
                var33 = Hashtables.getEntryKey(var36);
                var34 = Hashtables.getEntryValue(var36);
                if (module0597.NIL != module0004.f104(var29, var34, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED)) {
                    var31 = (SubLObject)ConsesLow.cons(var33, var31);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var35);
        }
        return var31;
    }
    
    public static SubLObject f36518(final SubLObject var63, SubLObject var29, SubLObject var64) {
        if (var29 == module0597.UNPROVIDED) {
            var29 = module0597.$g4576$.getDynamicValue();
        }
        if (var64 == module0597.UNPROVIDED) {
            var64 = Symbols.symbol_function((SubLObject)module0597.EQL);
        }
        final SubLThread var65 = SubLProcess.currentSubLThread();
        module0030.f1600(var63, var29, module0597.$g4591$.getDynamicValue(var65), var64);
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36610(final SubLObject var63, SubLObject var29, SubLObject var64) {
        if (var29 == module0597.UNPROVIDED) {
            var29 = module0597.$g4576$.getDynamicValue();
        }
        if (var64 == module0597.UNPROVIDED) {
            var64 = Symbols.symbol_function((SubLObject)module0597.EQL);
        }
        final SubLThread var65 = SubLProcess.currentSubLThread();
        module0030.f1613(var63, var29, module0597.$g4591$.getDynamicValue(var65), var64, (SubLObject)module0597.UNPROVIDED);
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36537(final SubLObject var63, SubLObject var104, SubLObject var64) {
        if (var104 == module0597.UNPROVIDED) {
            var104 = module0597.$g4577$.getDynamicValue();
        }
        if (var64 == module0597.UNPROVIDED) {
            var64 = Symbols.symbol_function((SubLObject)module0597.EQL);
        }
        final SubLThread var105 = SubLProcess.currentSubLThread();
        module0030.f1616(var63, conses_high.copy_list(var104), module0597.$g4591$.getDynamicValue(var105), var64);
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36611(final SubLObject var63, SubLObject var104, SubLObject var64) {
        if (var104 == module0597.UNPROVIDED) {
            var104 = module0597.$g4577$.getDynamicValue();
        }
        if (var64 == module0597.UNPROVIDED) {
            var64 = Symbols.symbol_function((SubLObject)module0597.EQL);
        }
        final SubLThread var105 = SubLProcess.currentSubLThread();
        module0030.f1617(var63, var104, module0597.$g4591$.getDynamicValue(var105), var64);
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36612(final SubLObject var136) {
        SubLObject var137 = var136;
        SubLObject var138 = (SubLObject)module0597.NIL;
        var138 = var137.first();
        while (module0597.NIL != var137) {
            f36613(var138);
            var137 = var137.rest();
            var138 = var137.first();
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36613(final SubLObject var63) {
        final SubLThread var64 = SubLProcess.currentSubLThread();
        Hashtables.sethash(var63, module0597.$g4591$.getDynamicValue(var64), (SubLObject)module0597.NIL);
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36541(SubLObject var104, SubLObject var64) {
        if (var104 == module0597.UNPROVIDED) {
            var104 = module0597.$g4577$.getDynamicValue();
        }
        if (var64 == module0597.UNPROVIDED) {
            var64 = Symbols.symbol_function((SubLObject)module0597.EQL);
        }
        final SubLThread var105 = SubLProcess.currentSubLThread();
        SubLObject var106 = (SubLObject)module0597.NIL;
        final SubLObject var107 = module0597.$g4591$.getDynamicValue(var105);
        SubLObject var108 = (SubLObject)module0597.NIL;
        SubLObject var109 = (SubLObject)module0597.NIL;
        final Iterator var110 = Hashtables.getEntrySetIterator(var107);
        try {
            while (Hashtables.iteratorHasNext(var110)) {
                final Map.Entry var111 = Hashtables.iteratorNextEntry(var110);
                var108 = Hashtables.getEntryKey(var111);
                var109 = Hashtables.getEntryValue(var111);
                if (module0597.NIL != conses_high.subsetp(var104, var109, var64, (SubLObject)module0597.UNPROVIDED)) {
                    var106 = (SubLObject)ConsesLow.cons(var108, var106);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var110);
        }
        return var106;
    }
    
    public static SubLObject f36579(final SubLObject var43) {
        if (module0597.NIL != module0178.f11284(var43)) {
            return module0269.f17754(module0202.f12832(module0178.f11285(var43), (SubLObject)module0597.UNPROVIDED));
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36587(final SubLObject var50) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        return module0004.f104(var50, module0597.$g4640$.getDynamicValue(var51), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
    }
    
    public static SubLObject f36578(final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        return module0004.f104(var56, module0597.$g4641$.getDynamicValue(var57), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
    }
    
    public static SubLObject f36614(final SubLObject var35) {
        SubLObject var36 = (SubLObject)module0597.NIL;
        SubLObject var37 = var35;
        SubLObject var38 = (SubLObject)module0597.NIL;
        var38 = var37.first();
        while (module0597.NIL != var37) {
            final SubLObject var39 = f36615(var38);
            if (module0597.NIL == conses_high.member(var39, var36, Symbols.symbol_function((SubLObject)module0597.$ic144$), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
                var36 = (SubLObject)ConsesLow.cons(var39, var36);
            }
            var37 = var37.rest();
            var38 = var37.first();
        }
        return Sequences.nreverse(var36);
    }
    
    public static SubLObject f36615(final SubLObject var36) {
        if (var36.isCons()) {
            SubLObject var37 = (SubLObject)module0597.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var36, var36, (SubLObject)module0597.$ic145$);
            var37 = var36.first();
            SubLObject var38 = var36.rest();
            final SubLObject var39 = (SubLObject)(var38.isCons() ? var38.first() : module0597.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var38, var36, (SubLObject)module0597.$ic145$);
            var38 = var38.rest();
            if (module0597.NIL == var38) {
                if (module0597.NIL != var39) {
                    SubLObject var143_144;
                    final SubLObject var141_142 = var143_144 = var39;
                    SubLObject var40 = (SubLObject)module0597.NIL;
                    SubLObject var41 = (SubLObject)module0597.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var143_144, var141_142, (SubLObject)module0597.$ic146$);
                    var40 = var143_144.first();
                    var143_144 = var143_144.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var143_144, var141_142, (SubLObject)module0597.$ic146$);
                    var41 = var143_144.first();
                    var143_144 = var143_144.rest();
                    if (module0597.NIL == var143_144) {
                        return (SubLObject)ConsesLow.cons(var40, f36615(var41));
                    }
                    cdestructuring_bind.cdestructuring_bind_error(var141_142, (SubLObject)module0597.$ic146$);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var36, (SubLObject)module0597.$ic145$);
            }
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36616(final SubLObject var35) {
        SubLObject var36 = (SubLObject)module0597.NIL;
        SubLObject var37 = var35;
        SubLObject var38 = (SubLObject)module0597.NIL;
        var38 = var37.first();
        while (module0597.NIL != var37) {
            final SubLObject var39 = f36617(var38);
            if (module0597.NIL == conses_high.member(var39, var36, Symbols.symbol_function((SubLObject)module0597.EQUAL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
                var36 = (SubLObject)ConsesLow.cons(var39, var36);
            }
            var37 = var37.rest();
            var38 = var37.first();
        }
        return Sequences.nreverse(var36);
    }
    
    public static SubLObject f36617(final SubLObject var36) {
        if (var36.isCons()) {
            SubLObject var37 = (SubLObject)module0597.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var36, var36, (SubLObject)module0597.$ic147$);
            var37 = var36.first();
            SubLObject var38 = var36.rest();
            final SubLObject var39 = (SubLObject)(var38.isCons() ? var38.first() : module0597.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var38, var36, (SubLObject)module0597.$ic147$);
            var38 = var38.rest();
            if (module0597.NIL == var38) {
                if (module0597.NIL != var39) {
                    SubLObject var151_152;
                    final SubLObject var149_150 = var151_152 = var39;
                    SubLObject var40 = (SubLObject)module0597.NIL;
                    SubLObject var41 = (SubLObject)module0597.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var151_152, var149_150, (SubLObject)module0597.$ic148$);
                    var40 = var151_152.first();
                    var151_152 = var151_152.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var151_152, var149_150, (SubLObject)module0597.$ic148$);
                    var41 = var151_152.first();
                    var151_152 = var151_152.rest();
                    if (module0597.NIL == var151_152) {
                        if (module0597.NIL != var41) {
                            SubLObject var157_158;
                            final SubLObject var155_156 = var157_158 = var41;
                            SubLObject var42 = (SubLObject)module0597.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var157_158, var155_156, (SubLObject)module0597.$ic149$);
                            var42 = var157_158.first();
                            var157_158 = var157_158.rest();
                            final SubLObject var43 = (SubLObject)(var157_158.isCons() ? var157_158.first() : module0597.NIL);
                            cdestructuring_bind.destructuring_bind_must_listp(var157_158, var155_156, (SubLObject)module0597.$ic149$);
                            var157_158 = var157_158.rest();
                            if (module0597.NIL == var157_158) {
                                return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var37, var42, var40), f36617(var41));
                            }
                            cdestructuring_bind.cdestructuring_bind_error(var155_156, (SubLObject)module0597.$ic149$);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var149_150, (SubLObject)module0597.$ic148$);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var36, (SubLObject)module0597.$ic147$);
            }
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36618(final SubLObject var160) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)module0597.$ic150$), var160);
    }
    
    public static SubLObject f36619(final SubLObject var161) {
        return module0035.f2077(Symbols.symbol_function((SubLObject)module0597.$ic151$), var161);
    }
    
    public static SubLObject f36620(final SubLObject var162) {
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36621(final SubLObject var163) {
        final SubLThread var164 = SubLProcess.currentSubLThread();
        module0538.f33349(var163, module0147.$g2095$.getDynamicValue(var164), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
        return module0217.f14421(var163, module0147.$g2095$.getDynamicValue(var164));
    }
    
    public static SubLObject f36531(final SubLObject var164, final SubLObject var165, SubLObject var166, SubLObject var167, SubLObject var168, SubLObject var169) {
        if (var166 == module0597.UNPROVIDED) {
            var166 = (SubLObject)module0597.NIL;
        }
        if (var167 == module0597.UNPROVIDED) {
            var167 = (SubLObject)module0597.NIL;
        }
        if (var168 == module0597.UNPROVIDED) {
            var168 = (SubLObject)module0597.NIL;
        }
        if (var169 == module0597.UNPROVIDED) {
            var169 = (SubLObject)module0597.NIL;
        }
        final SubLThread var170 = SubLProcess.currentSubLThread();
        if (module0597.$g4596$.getDynamicValue(var170).numGE(var164)) {
            PrintLow.format((SubLObject)module0597.T, var165, new SubLObject[] { var166, var167, var168, var169 });
            return (SubLObject)module0597.NIL;
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36523(final SubLObject var164, final SubLObject var165, SubLObject var166, SubLObject var167, SubLObject var168, SubLObject var169) {
        if (var166 == module0597.UNPROVIDED) {
            var166 = (SubLObject)module0597.NIL;
        }
        if (var167 == module0597.UNPROVIDED) {
            var167 = (SubLObject)module0597.NIL;
        }
        if (var168 == module0597.UNPROVIDED) {
            var168 = (SubLObject)module0597.NIL;
        }
        if (var169 == module0597.UNPROVIDED) {
            var169 = (SubLObject)module0597.NIL;
        }
        final SubLThread var170 = SubLProcess.currentSubLThread();
        if (module0597.$g4596$.getDynamicValue(var170).numGE(var164)) {
            Errors.cerror((SubLObject)module0597.$ic152$, var165, new SubLObject[] { var166, var167, var168, var169 });
        }
        else if (Numbers.add((SubLObject)module0597.TWO_INTEGER, module0597.$g4596$.getDynamicValue(var170)).numGE(var164)) {
            Errors.warn(var165, new SubLObject[] { var166, var167, var168, var169 });
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36526(final SubLObject var164, final SubLObject var165, SubLObject var166, SubLObject var167, SubLObject var168, SubLObject var169) {
        if (var166 == module0597.UNPROVIDED) {
            var166 = (SubLObject)module0597.NIL;
        }
        if (var167 == module0597.UNPROVIDED) {
            var167 = (SubLObject)module0597.NIL;
        }
        if (var168 == module0597.UNPROVIDED) {
            var168 = (SubLObject)module0597.NIL;
        }
        if (var169 == module0597.UNPROVIDED) {
            var169 = (SubLObject)module0597.NIL;
        }
        final SubLThread var170 = SubLProcess.currentSubLThread();
        if (module0597.$g4596$.getDynamicValue(var170).numGE(var164)) {
            Functions.apply((SubLObject)module0597.$ic153$, var165, new SubLObject[] { var166, var167, var168, var169 });
            return (SubLObject)module0597.NIL;
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36525(final SubLObject var170, final SubLObject var171, SubLObject var3, SubLObject var172) {
        if (var3 == module0597.UNPROVIDED) {
            var3 = (SubLObject)module0597.NIL;
        }
        if (var172 == module0597.UNPROVIDED) {
            var172 = (SubLObject)module0597.NIL;
        }
        final SubLThread var173 = SubLProcess.currentSubLThread();
        final SubLObject var174 = module0259.f16928((SubLObject)ConsesLow.list(var170, var171), (SubLObject)module0597.NIL, var3, (SubLObject)module0597.UNPROVIDED);
        SubLObject var175 = (SubLObject)module0597.NIL;
        if (module0597.NIL != var174) {
            final SubLObject var176 = module0597.$g4592$.currentBinding(var173);
            final SubLObject var177 = module0597.$g4593$.currentBinding(var173);
            final SubLObject var178 = module0597.$g4605$.currentBinding(var173);
            final SubLObject var179 = module0597.$g4598$.currentBinding(var173);
            final SubLObject var180 = module0597.$g4602$.currentBinding(var173);
            final SubLObject var181 = module0597.$g4607$.currentBinding(var173);
            final SubLObject var182 = module0597.$g4608$.currentBinding(var173);
            final SubLObject var183 = module0597.$g4594$.currentBinding(var173);
            final SubLObject var184 = module0597.$g4595$.currentBinding(var173);
            try {
                module0597.$g4592$.bind((SubLObject)module0597.NIL, var173);
                module0597.$g4593$.bind((SubLObject)module0597.NIL, var173);
                module0597.$g4605$.bind((SubLObject)module0597.NIL, var173);
                module0597.$g4598$.bind(var172, var173);
                module0597.$g4602$.bind((SubLObject)module0597.T, var173);
                module0597.$g4607$.bind((SubLObject)module0597.T, var173);
                module0597.$g4608$.bind((SubLObject)module0597.$ic154$, var173);
                module0597.$g4594$.bind((SubLObject)module0597.T, var173);
                module0597.$g4595$.bind(var174, var173);
                var175 = f36516(var170, var171, var3);
            }
            finally {
                module0597.$g4595$.rebind(var184, var173);
                module0597.$g4594$.rebind(var183, var173);
                module0597.$g4608$.rebind(var182, var173);
                module0597.$g4607$.rebind(var181, var173);
                module0597.$g4602$.rebind(var180, var173);
                module0597.$g4598$.rebind(var179, var173);
                module0597.$g4605$.rebind(var178, var173);
                module0597.$g4593$.rebind(var177, var173);
                module0597.$g4592$.rebind(var176, var173);
            }
        }
        return var175;
    }
    
    public static SubLObject f36524(final SubLObject var170, final SubLObject var171, SubLObject var3, SubLObject var172) {
        if (var3 == module0597.UNPROVIDED) {
            var3 = (SubLObject)module0597.NIL;
        }
        if (var172 == module0597.UNPROVIDED) {
            var172 = (SubLObject)module0597.NIL;
        }
        final SubLThread var173 = SubLProcess.currentSubLThread();
        final SubLObject var174 = module0256.f16637((SubLObject)ConsesLow.list(var170, var171), (SubLObject)module0597.NIL, var3, (SubLObject)module0597.UNPROVIDED);
        SubLObject var175 = (SubLObject)module0597.NIL;
        if (module0597.NIL != var174) {
            final SubLObject var176 = module0597.$g4593$.currentBinding(var173);
            final SubLObject var177 = module0597.$g4592$.currentBinding(var173);
            final SubLObject var178 = module0597.$g4605$.currentBinding(var173);
            final SubLObject var179 = module0597.$g4598$.currentBinding(var173);
            final SubLObject var180 = module0597.$g4602$.currentBinding(var173);
            final SubLObject var181 = module0597.$g4607$.currentBinding(var173);
            final SubLObject var182 = module0597.$g4608$.currentBinding(var173);
            final SubLObject var183 = module0597.$g4594$.currentBinding(var173);
            final SubLObject var184 = module0597.$g4595$.currentBinding(var173);
            try {
                module0597.$g4593$.bind((SubLObject)module0597.NIL, var173);
                module0597.$g4592$.bind((SubLObject)module0597.NIL, var173);
                module0597.$g4605$.bind((SubLObject)module0597.NIL, var173);
                module0597.$g4598$.bind(var172, var173);
                module0597.$g4602$.bind((SubLObject)module0597.T, var173);
                module0597.$g4607$.bind((SubLObject)module0597.T, var173);
                module0597.$g4608$.bind((SubLObject)module0597.$ic155$, var173);
                module0597.$g4594$.bind((SubLObject)module0597.T, var173);
                module0597.$g4595$.bind(var174, var173);
                var175 = f36516(var170, var171, var3);
            }
            finally {
                module0597.$g4595$.rebind(var184, var173);
                module0597.$g4594$.rebind(var183, var173);
                module0597.$g4608$.rebind(var182, var173);
                module0597.$g4607$.rebind(var181, var173);
                module0597.$g4602$.rebind(var180, var173);
                module0597.$g4598$.rebind(var179, var173);
                module0597.$g4605$.rebind(var178, var173);
                module0597.$g4592$.rebind(var177, var173);
                module0597.$g4593$.rebind(var176, var173);
            }
        }
        return var175;
    }
    
    public static SubLObject f36622(final SubLObject var170, final SubLObject var171, SubLObject var3, SubLObject var172) {
        if (var3 == module0597.UNPROVIDED) {
            var3 = (SubLObject)module0597.NIL;
        }
        if (var172 == module0597.UNPROVIDED) {
            var172 = (SubLObject)module0597.NIL;
        }
        final SubLThread var173 = SubLProcess.currentSubLThread();
        final SubLObject var174 = module0262.f17369((SubLObject)ConsesLow.list(var170, var171), (SubLObject)module0597.NIL, var3);
        SubLObject var175 = (SubLObject)module0597.NIL;
        if (module0597.NIL != var174) {
            final SubLObject var176 = module0597.$g4593$.currentBinding(var173);
            final SubLObject var177 = module0597.$g4592$.currentBinding(var173);
            final SubLObject var178 = module0597.$g4605$.currentBinding(var173);
            final SubLObject var179 = module0597.$g4598$.currentBinding(var173);
            final SubLObject var180 = module0597.$g4602$.currentBinding(var173);
            final SubLObject var181 = module0597.$g4607$.currentBinding(var173);
            final SubLObject var182 = module0597.$g4608$.currentBinding(var173);
            final SubLObject var183 = module0597.$g4594$.currentBinding(var173);
            final SubLObject var184 = module0597.$g4595$.currentBinding(var173);
            try {
                module0597.$g4593$.bind((SubLObject)module0597.NIL, var173);
                module0597.$g4592$.bind((SubLObject)module0597.NIL, var173);
                module0597.$g4605$.bind((SubLObject)module0597.NIL, var173);
                module0597.$g4598$.bind(var172, var173);
                module0597.$g4602$.bind((SubLObject)module0597.T, var173);
                module0597.$g4607$.bind((SubLObject)module0597.T, var173);
                module0597.$g4608$.bind((SubLObject)module0597.$ic156$, var173);
                module0597.$g4594$.bind((SubLObject)module0597.T, var173);
                module0597.$g4595$.bind(var174, var173);
                var175 = f36516(var170, var171, var3);
            }
            finally {
                module0597.$g4595$.rebind(var184, var173);
                module0597.$g4594$.rebind(var183, var173);
                module0597.$g4608$.rebind(var182, var173);
                module0597.$g4607$.rebind(var181, var173);
                module0597.$g4602$.rebind(var180, var173);
                module0597.$g4598$.rebind(var179, var173);
                module0597.$g4605$.rebind(var178, var173);
                module0597.$g4592$.rebind(var177, var173);
                module0597.$g4593$.rebind(var176, var173);
            }
        }
        return var175;
    }
    
    public static SubLObject f36623(final SubLObject var176, final SubLObject var177) {
        final SubLThread var178 = SubLProcess.currentSubLThread();
        SubLObject var179 = (SubLObject)module0597.NIL;
        final SubLObject var180 = module0597.$g4597$.currentBinding(var178);
        final SubLObject var181 = module0597.$g4602$.currentBinding(var178);
        final SubLObject var182 = module0597.$g4592$.currentBinding(var178);
        final SubLObject var183 = module0597.$g4593$.currentBinding(var178);
        final SubLObject var184 = module0597.$g4618$.currentBinding(var178);
        final SubLObject var185 = module0597.$g4606$.currentBinding(var178);
        final SubLObject var186 = module0597.$g4601$.currentBinding(var178);
        final SubLObject var187 = module0597.$g4609$.currentBinding(var178);
        final SubLObject var188 = module0597.$g4605$.currentBinding(var178);
        final SubLObject var189 = module0597.$g4610$.currentBinding(var178);
        final SubLObject var190 = module0597.$g4621$.currentBinding(var178);
        final SubLObject var191 = module0597.$g4622$.currentBinding(var178);
        final SubLObject var192 = module0597.$g4619$.currentBinding(var178);
        final SubLObject var193 = module0597.$g4620$.currentBinding(var178);
        final SubLObject var194 = module0597.$g4616$.currentBinding(var178);
        final SubLObject var195 = module0597.$g4567$.currentBinding(var178);
        final SubLObject var196 = module0147.$g2094$.currentBinding(var178);
        final SubLObject var197 = module0147.$g2095$.currentBinding(var178);
        try {
            module0597.$g4597$.bind((SubLObject)module0597.TWO_INTEGER, var178);
            module0597.$g4602$.bind((SubLObject)module0597.NIL, var178);
            module0597.$g4592$.bind((SubLObject)module0597.NIL, var178);
            module0597.$g4593$.bind((SubLObject)module0597.T, var178);
            module0597.$g4618$.bind((SubLObject)module0597.TWENTY_INTEGER, var178);
            module0597.$g4606$.bind((SubLObject)module0597.T, var178);
            module0597.$g4601$.bind((SubLObject)module0597.T, var178);
            module0597.$g4609$.bind((SubLObject)module0597.T, var178);
            module0597.$g4605$.bind((SubLObject)module0597.T, var178);
            module0597.$g4610$.bind((SubLObject)module0597.$ic158$, var178);
            module0597.$g4621$.bind((SubLObject)module0597.T, var178);
            module0597.$g4622$.bind((SubLObject)module0597.$ic159$, var178);
            module0597.$g4619$.bind((SubLObject)module0597.T, var178);
            module0597.$g4620$.bind((SubLObject)module0597.$ic160$, var178);
            module0597.$g4616$.bind((SubLObject)module0597.$ic161$, var178);
            module0597.$g4567$.bind((SubLObject)module0597.NIL, var178);
            module0147.$g2094$.bind((SubLObject)module0597.$ic104$, var178);
            module0147.$g2095$.bind(module0597.$ic105$, var178);
            var179 = f36516(var176, var177, (SubLObject)module0597.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var197, var178);
            module0147.$g2094$.rebind(var196, var178);
            module0597.$g4567$.rebind(var195, var178);
            module0597.$g4616$.rebind(var194, var178);
            module0597.$g4620$.rebind(var193, var178);
            module0597.$g4619$.rebind(var192, var178);
            module0597.$g4622$.rebind(var191, var178);
            module0597.$g4621$.rebind(var190, var178);
            module0597.$g4610$.rebind(var189, var178);
            module0597.$g4605$.rebind(var188, var178);
            module0597.$g4609$.rebind(var187, var178);
            module0597.$g4601$.rebind(var186, var178);
            module0597.$g4606$.rebind(var185, var178);
            module0597.$g4618$.rebind(var184, var178);
            module0597.$g4593$.rebind(var183, var178);
            module0597.$g4592$.rebind(var182, var178);
            module0597.$g4602$.rebind(var181, var178);
            module0597.$g4597$.rebind(var180, var178);
        }
        return var179;
    }
    
    public static SubLObject f36624(SubLObject var183) {
        if (var183 == module0597.UNPROVIDED) {
            var183 = (SubLObject)module0597.NIL;
        }
        final SubLThread var184 = SubLProcess.currentSubLThread();
        final SubLObject var185 = module0597.$g4597$.currentBinding(var184);
        final SubLObject var186 = module0597.$g4602$.currentBinding(var184);
        final SubLObject var187 = module0597.$g4592$.currentBinding(var184);
        final SubLObject var188 = module0597.$g4593$.currentBinding(var184);
        final SubLObject var189 = module0597.$g4618$.currentBinding(var184);
        final SubLObject var190 = module0597.$g4606$.currentBinding(var184);
        final SubLObject var191 = module0597.$g4601$.currentBinding(var184);
        final SubLObject var192 = module0597.$g4609$.currentBinding(var184);
        final SubLObject var193 = module0597.$g4605$.currentBinding(var184);
        final SubLObject var194 = module0597.$g4610$.currentBinding(var184);
        final SubLObject var195 = module0597.$g4621$.currentBinding(var184);
        final SubLObject var196 = module0597.$g4622$.currentBinding(var184);
        final SubLObject var197 = module0597.$g4619$.currentBinding(var184);
        final SubLObject var198 = module0597.$g4620$.currentBinding(var184);
        final SubLObject var199 = module0597.$g4616$.currentBinding(var184);
        final SubLObject var200 = module0597.$g4567$.currentBinding(var184);
        try {
            module0597.$g4597$.bind((SubLObject)module0597.TWO_INTEGER, var184);
            module0597.$g4602$.bind((SubLObject)module0597.NIL, var184);
            module0597.$g4592$.bind((SubLObject)module0597.NIL, var184);
            module0597.$g4593$.bind((SubLObject)module0597.T, var184);
            module0597.$g4618$.bind((SubLObject)module0597.TWENTY_INTEGER, var184);
            module0597.$g4606$.bind((SubLObject)module0597.T, var184);
            module0597.$g4601$.bind((SubLObject)module0597.T, var184);
            module0597.$g4609$.bind((SubLObject)module0597.T, var184);
            module0597.$g4605$.bind((SubLObject)module0597.T, var184);
            module0597.$g4610$.bind((SubLObject)module0597.$ic158$, var184);
            module0597.$g4621$.bind((SubLObject)module0597.T, var184);
            module0597.$g4622$.bind((SubLObject)module0597.$ic162$, var184);
            module0597.$g4619$.bind((SubLObject)module0597.T, var184);
            module0597.$g4620$.bind((SubLObject)module0597.$ic160$, var184);
            module0597.$g4616$.bind((SubLObject)module0597.$ic161$, var184);
            module0597.$g4567$.bind((SubLObject)module0597.NIL, var184);
            if (module0597.NIL != var183) {
                Hashtables.clrhash(module0597.$g4642$.getDynamicValue(var184));
                module0597.$g4643$.setDynamicValue((SubLObject)module0597.ZERO_INTEGER, var184);
                module0597.$g4644$.setDynamicValue((SubLObject)module0597.ZERO_INTEGER, var184);
                module0597.$g4645$.setDynamicValue((SubLObject)module0597.ZERO_INTEGER, var184);
            }
            final SubLObject var7_184 = module0147.$g2094$.currentBinding(var184);
            final SubLObject var8_185 = module0147.$g2095$.currentBinding(var184);
            try {
                module0147.$g2094$.bind((SubLObject)module0597.$ic104$, var184);
                module0147.$g2095$.bind(module0597.$ic105$, var184);
                module0219.f14478((SubLObject)module0597.$ic163$, module0597.$ic164$, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var8_185, var184);
                module0147.$g2094$.rebind(var7_184, var184);
            }
        }
        finally {
            module0597.$g4567$.rebind(var200, var184);
            module0597.$g4616$.rebind(var199, var184);
            module0597.$g4620$.rebind(var198, var184);
            module0597.$g4619$.rebind(var197, var184);
            module0597.$g4622$.rebind(var196, var184);
            module0597.$g4621$.rebind(var195, var184);
            module0597.$g4610$.rebind(var194, var184);
            module0597.$g4605$.rebind(var193, var184);
            module0597.$g4609$.rebind(var192, var184);
            module0597.$g4601$.rebind(var191, var184);
            module0597.$g4606$.rebind(var190, var184);
            module0597.$g4618$.rebind(var189, var184);
            module0597.$g4593$.rebind(var188, var184);
            module0597.$g4592$.rebind(var187, var184);
            module0597.$g4602$.rebind(var186, var184);
            module0597.$g4597$.rebind(var185, var184);
        }
        return module0597.$g4642$.getDynamicValue(var184);
    }
    
    public static SubLObject f36625(final SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        if (module0597.NIL != module0178.f11284(var43)) {
            final SubLObject var45 = module0174.f11025(var43);
            final SubLObject var46 = module0178.f11333(var43);
            final SubLObject var47 = module0178.f11334(var43);
            final SubLObject var48 = module0178.f11335(var43);
            SubLObject var49 = (SubLObject)module0597.NIL;
            SubLObject var50 = (SubLObject)module0597.NIL;
            if (var46.eql(module0597.$ic164$)) {
                try {
                    var44.throwStack.push(module0003.$g3$.getGlobalValue());
                    final SubLObject var51 = Errors.$error_handler$.currentBinding(var44);
                    try {
                        Errors.$error_handler$.bind((SubLObject)module0597.$ic165$, var44);
                        try {
                            var50 = f36516(var47, var48, (SubLObject)module0597.UNPROVIDED);
                        }
                        catch (Throwable var52) {
                            Errors.handleThrowable(var52, (SubLObject)module0597.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var51, var44);
                    }
                }
                catch (Throwable var53) {
                    var49 = Errors.handleThrowable(var53, module0003.$g3$.getGlobalValue());
                }
                finally {
                    var44.throwStack.pop();
                }
                module0597.$g4643$.setDynamicValue(Numbers.add(module0597.$g4643$.getDynamicValue(var44), (SubLObject)module0597.ONE_INTEGER), var44);
                if (module0597.NIL != var50) {
                    var50 = module0036.f2548(f36614(var50), Symbols.symbol_function((SubLObject)module0597.$ic166$), Symbols.symbol_function((SubLObject)module0597.$ic167$), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                    Hashtables.sethash(var45, module0597.$g4642$.getDynamicValue(var44), var50);
                    print_high.print((SubLObject)ConsesLow.list(var47, var48, var50), (SubLObject)module0597.UNPROVIDED);
                    module0597.$g4644$.setDynamicValue(Numbers.add(module0597.$g4644$.getDynamicValue(var44), (SubLObject)module0597.ONE_INTEGER), var44);
                }
                else if (module0597.NIL != var49) {
                    Hashtables.sethash(var45, module0597.$g4642$.getDynamicValue(var44), var49);
                    print_high.print((SubLObject)ConsesLow.list(var47, var48, var49), (SubLObject)module0597.UNPROVIDED);
                    module0597.$g4645$.setDynamicValue(Numbers.add(module0597.$g4645$.getDynamicValue(var44), (SubLObject)module0597.ONE_INTEGER), var44);
                }
                else {
                    Hashtables.sethash(var45, module0597.$g4642$.getDynamicValue(var44), var50);
                    print_high.print((SubLObject)ConsesLow.list(var47, var48, var50), (SubLObject)module0597.UNPROVIDED);
                }
            }
            return var50;
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36626() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        PrintLow.format((SubLObject)module0597.T, (SubLObject)module0597.$ic168$, module0597.$g4643$.getDynamicValue(var4));
        PrintLow.format((SubLObject)module0597.T, (SubLObject)module0597.$ic169$, module0597.$g4644$.getDynamicValue(var4));
        PrintLow.format((SubLObject)module0597.T, (SubLObject)module0597.$ic170$, module0597.$g4645$.getDynamicValue(var4));
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36627(final SubLObject var176, final SubLObject var177, final SubLObject var36, SubLObject var3) {
        if (var3 == module0597.UNPROVIDED) {
            var3 = module0597.$ic171$;
        }
        SubLObject var178 = conses_high.nsubst(module0201.f12561(f36628(var176)), var176, conses_high.nsubst(module0201.f12561(f36628(var177)), var177, var36, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
        if (module0597.NIL != module0035.f1997(var178)) {
            var178 = var178.first();
        }
        else {
            var178 = (SubLObject)ConsesLow.cons(module0597.$ic172$, var178);
        }
        final SubLObject var179 = module0538.f33428(var178, var3, (SubLObject)module0597.T, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
        return var179;
    }
    
    public static SubLObject f36628(final SubLObject var40) {
        if (module0597.NIL != module0128.f8449(var40)) {
            return module0166.f10743(var40);
        }
        if (module0597.NIL != module0167.f10813(var40)) {
            return module0038.f2618(module0172.f10920(var40));
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36629(final SubLObject var193, final SubLObject var194) {
        return Strings.stringL(f36628(var193), f36628(var194), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
    }
    
    public static SubLObject f36630(final SubLObject var195, final SubLObject var196) {
        if (module0597.NIL != module0210.f13566(var195) && module0597.NIL != module0210.f13566(var196)) {
            return Equality.equal(f36631(var195), f36631(var196));
        }
        if (var195.isCons() && var196.isCons()) {
            return module0035.f2201(var195, var196, (SubLObject)module0597.UNPROVIDED);
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36631(final SubLObject var197) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)module0597.$ic167$), var197);
    }
    
    public static SubLObject f36632(final SubLObject var198, SubLObject var199, SubLObject var200, SubLObject var3, SubLObject var201) {
        if (var199 == module0597.UNPROVIDED) {
            var199 = (SubLObject)module0597.$ic173$;
        }
        if (var200 == module0597.UNPROVIDED) {
            var200 = (SubLObject)module0597.$ic14$;
        }
        if (var3 == module0597.UNPROVIDED) {
            var3 = (SubLObject)module0597.NIL;
        }
        if (var201 == module0597.UNPROVIDED) {
            var201 = (SubLObject)module0597.$ic174$;
        }
        final SubLThread var202 = SubLProcess.currentSubLThread();
        SubLObject var203 = (SubLObject)module0597.NIL;
        final SubLObject var204 = module0018.$g584$.currentBinding(var202);
        try {
            module0018.$g584$.bind((SubLObject)module0597.NIL, var202);
            final SubLObject var205 = var3;
            final SubLObject var7_202 = module0147.$g2094$.currentBinding(var202);
            final SubLObject var206 = module0147.$g2095$.currentBinding(var202);
            try {
                module0147.$g2094$.bind(module0147.f9531(var205), var202);
                module0147.$g2095$.bind(module0147.f9534(var205), var202);
                final SubLObject var207 = module0139.f9008();
                final SubLObject var7_203 = module0139.$g1630$.currentBinding(var202);
                final SubLObject var8_205 = module0139.$g1659$.currentBinding(var202);
                try {
                    module0139.$g1630$.bind((SubLObject)module0597.NIL, var202);
                    module0139.$g1659$.bind(module0139.f9007(), var202);
                    final SubLObject var7_204 = module0139.$g1638$.currentBinding(var202);
                    final SubLObject var8_206 = module0139.$g1630$.currentBinding(var202);
                    try {
                        module0139.$g1638$.bind(module0139.$g1659$.getDynamicValue(var202), var202);
                        module0139.$g1630$.bind(var207, var202);
                        SubLObject var208 = var200;
                        SubLObject var209 = (SubLObject)module0597.NIL;
                        var209 = var208.first();
                        while (module0597.NIL != var208) {
                            final SubLObject var7_205 = module0018.$g588$.currentBinding(var202);
                            try {
                                module0018.$g588$.bind(var209, var202);
                                final SubLObject var210 = f36633(var209, var201);
                                SubLObject var211 = var198;
                                final SubLObject var212 = (SubLObject)module0597.$ic177$;
                                final SubLObject var213 = module0056.f4145(var212);
                                final SubLObject var7_206 = module0139.$g1635$.currentBinding(var202);
                                try {
                                    module0139.$g1635$.bind(module0139.f9007(), var202);
                                    final SubLObject var214 = (SubLObject)module0597.NIL;
                                    final SubLObject var7_207 = module0141.$g1714$.currentBinding(var202);
                                    final SubLObject var8_207 = module0141.$g1715$.currentBinding(var202);
                                    try {
                                        module0141.$g1714$.bind((module0597.NIL != var214) ? var214 : module0141.f9283(), var202);
                                        module0141.$g1715$.bind((SubLObject)((module0597.NIL != var214) ? module0597.$ic178$ : module0141.$g1715$.getDynamicValue(var202)), var202);
                                        if (module0597.NIL != var214 && module0597.NIL != module0136.f8864() && module0597.NIL == module0141.f9279(var214)) {
                                            final SubLObject var215 = module0136.$g1591$.getDynamicValue(var202);
                                            if (var215.eql((SubLObject)module0597.$ic179$)) {
                                                module0136.f8870((SubLObject)module0597.ONE_INTEGER, (SubLObject)module0597.$ic180$, var214, (SubLObject)module0597.$ic181$, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                                            }
                                            else if (var215.eql((SubLObject)module0597.$ic182$)) {
                                                module0136.f8871((SubLObject)module0597.ONE_INTEGER, (SubLObject)module0597.$ic152$, (SubLObject)module0597.$ic180$, var214, (SubLObject)module0597.$ic181$, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                                            }
                                            else if (var215.eql((SubLObject)module0597.$ic183$)) {
                                                Errors.warn((SubLObject)module0597.$ic180$, var214, (SubLObject)module0597.$ic181$);
                                            }
                                            else {
                                                Errors.warn((SubLObject)module0597.$ic184$, module0136.$g1591$.getDynamicValue(var202));
                                                Errors.cerror((SubLObject)module0597.$ic152$, (SubLObject)module0597.$ic180$, var214, (SubLObject)module0597.$ic181$);
                                            }
                                        }
                                        final SubLObject var7_208 = module0141.$g1670$.currentBinding(var202);
                                        final SubLObject var8_208 = module0141.$g1671$.currentBinding(var202);
                                        final SubLObject var216 = module0141.$g1672$.currentBinding(var202);
                                        final SubLObject var217 = module0141.$g1674$.currentBinding(var202);
                                        final SubLObject var218 = module0137.$g1605$.currentBinding(var202);
                                        try {
                                            module0141.$g1670$.bind(module0137.f8955(module0597.$ic126$), var202);
                                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0597.$ic126$)), var202);
                                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0597.$ic126$)), var202);
                                            module0141.$g1674$.bind((SubLObject)module0597.NIL, var202);
                                            module0137.$g1605$.bind(module0137.f8955(module0597.$ic126$), var202);
                                            if (module0597.NIL != module0136.f8865() || module0597.NIL != module0244.f15795(var198, module0137.f8955((SubLObject)module0597.UNPROVIDED))) {
                                                final SubLObject var7_209 = module0141.$g1677$.currentBinding(var202);
                                                final SubLObject var8_209 = module0138.$g1619$.currentBinding(var202);
                                                final SubLObject var9_222 = module0141.$g1674$.currentBinding(var202);
                                                try {
                                                    module0141.$g1677$.bind(module0141.f9208(), var202);
                                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0597.$ic126$)), var202);
                                                    module0141.$g1674$.bind((SubLObject)module0597.NIL, var202);
                                                    module0249.f16055(var211, (SubLObject)module0597.UNPROVIDED);
                                                    while (module0597.NIL != var211) {
                                                        final SubLObject var219 = var211;
                                                        SubLObject var28_224 = var210;
                                                        SubLObject var220 = (SubLObject)module0597.NIL;
                                                        var220 = var28_224.first();
                                                        while (module0597.NIL != var28_224) {
                                                            final SubLObject var7_210 = module0018.$g585$.currentBinding(var202);
                                                            final SubLObject var8_210 = module0018.$g589$.currentBinding(var202);
                                                            final SubLObject var9_223 = module0018.$g590$.currentBinding(var202);
                                                            try {
                                                                module0018.$g585$.bind(var220.first(), var202);
                                                                module0018.$g589$.bind(conses_high.second(var220), var202);
                                                                module0018.$g590$.bind(conses_high.third(var220), var202);
                                                                module0219.f14477((SubLObject)module0597.$ic185$, var219, module0018.$g589$.getDynamicValue(var202), module0018.$g585$.getDynamicValue(var202), (SubLObject)module0597.$ic186$, (SubLObject)module0597.UNPROVIDED);
                                                            }
                                                            finally {
                                                                module0018.$g590$.rebind(var9_223, var202);
                                                                module0018.$g589$.rebind(var8_210, var202);
                                                                module0018.$g585$.rebind(var7_210, var202);
                                                            }
                                                            var28_224 = var28_224.rest();
                                                            var220 = var28_224.first();
                                                        }
                                                        SubLObject var28_225;
                                                        final SubLObject var221 = var28_225 = module0200.f12443(module0137.f8955(module0597.$ic126$));
                                                        SubLObject var222 = (SubLObject)module0597.NIL;
                                                        var222 = var28_225.first();
                                                        while (module0597.NIL != var28_225) {
                                                            final SubLObject var7_211 = module0137.$g1605$.currentBinding(var202);
                                                            final SubLObject var8_211 = module0141.$g1674$.currentBinding(var202);
                                                            try {
                                                                module0137.$g1605$.bind(var222, var202);
                                                                module0141.$g1674$.bind((SubLObject)((module0597.NIL != module0141.f9205((SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0597.NIL == module0141.$g1674$.getDynamicValue(var202)) : module0141.$g1674$.getDynamicValue(var202)), var202);
                                                                final SubLObject var223 = module0228.f15229(var211);
                                                                if (module0597.NIL != module0138.f8992(var223)) {
                                                                    final SubLObject var224 = module0242.f15664(var223, module0137.f8955((SubLObject)module0597.UNPROVIDED));
                                                                    if (module0597.NIL != var224) {
                                                                        final SubLObject var225 = module0245.f15834(var224, module0138.f8979(), module0137.f8955((SubLObject)module0597.UNPROVIDED));
                                                                        if (module0597.NIL != var225) {
                                                                            SubLObject var226;
                                                                            for (var226 = module0066.f4838(module0067.f4891(var225)); module0597.NIL == module0066.f4841(var226); var226 = module0066.f4840(var226)) {
                                                                                var202.resetMultipleValues();
                                                                                final SubLObject var238_239 = module0066.f4839(var226);
                                                                                final SubLObject var227 = var202.secondMultipleValue();
                                                                                var202.resetMultipleValues();
                                                                                if (module0597.NIL != module0147.f9507(var238_239)) {
                                                                                    final SubLObject var7_212 = module0138.$g1623$.currentBinding(var202);
                                                                                    try {
                                                                                        module0138.$g1623$.bind(var238_239, var202);
                                                                                        SubLObject var237_242;
                                                                                        for (var237_242 = module0066.f4838(module0067.f4891(var227)); module0597.NIL == module0066.f4841(var237_242); var237_242 = module0066.f4840(var237_242)) {
                                                                                            var202.resetMultipleValues();
                                                                                            final SubLObject var228 = module0066.f4839(var237_242);
                                                                                            final SubLObject var229 = var202.secondMultipleValue();
                                                                                            var202.resetMultipleValues();
                                                                                            if (module0597.NIL != module0141.f9289(var228)) {
                                                                                                final SubLObject var7_213 = module0138.$g1624$.currentBinding(var202);
                                                                                                try {
                                                                                                    module0138.$g1624$.bind(var228, var202);
                                                                                                    final SubLObject var230 = var229;
                                                                                                    if (module0597.NIL != module0077.f5302(var230)) {
                                                                                                        final SubLObject var231 = module0077.f5333(var230);
                                                                                                        SubLObject var232;
                                                                                                        SubLObject var233;
                                                                                                        SubLObject var234;
                                                                                                        for (var232 = module0032.f1741(var231), var233 = (SubLObject)module0597.NIL, var233 = module0032.f1742(var232, var231); module0597.NIL == module0032.f1744(var232, var233); var233 = module0032.f1743(var233)) {
                                                                                                            var234 = module0032.f1745(var232, var233);
                                                                                                            if (module0597.NIL != module0032.f1746(var233, var234) && module0597.NIL == module0249.f16059(var234, (SubLObject)module0597.UNPROVIDED)) {
                                                                                                                module0249.f16055(var234, (SubLObject)module0597.UNPROVIDED);
                                                                                                                module0056.f4149(var234, var213);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else if (var230.isList()) {
                                                                                                        SubLObject var235 = var230;
                                                                                                        SubLObject var236 = (SubLObject)module0597.NIL;
                                                                                                        var236 = var235.first();
                                                                                                        while (module0597.NIL != var235) {
                                                                                                            if (module0597.NIL == module0249.f16059(var236, (SubLObject)module0597.UNPROVIDED)) {
                                                                                                                module0249.f16055(var236, (SubLObject)module0597.UNPROVIDED);
                                                                                                                module0056.f4149(var236, var213);
                                                                                                            }
                                                                                                            var235 = var235.rest();
                                                                                                            var236 = var235.first();
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        Errors.error((SubLObject)module0597.$ic187$, var230);
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    module0138.$g1624$.rebind(var7_213, var202);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        module0066.f4842(var237_242);
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1623$.rebind(var7_212, var202);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var226);
                                                                        }
                                                                    }
                                                                    else {
                                                                        module0136.f8870((SubLObject)module0597.FIVE_INTEGER, (SubLObject)module0597.$ic188$, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                                                                    }
                                                                }
                                                                else if (module0597.NIL != module0155.f9785(var223, (SubLObject)module0597.UNPROVIDED)) {
                                                                    SubLObject var28_226;
                                                                    final SubLObject var237 = var28_226 = ((module0597.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var202), module0137.f8955((SubLObject)module0597.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var202), module0137.f8955((SubLObject)module0597.UNPROVIDED)));
                                                                    SubLObject var238 = (SubLObject)module0597.NIL;
                                                                    var238 = var28_226.first();
                                                                    while (module0597.NIL != var28_226) {
                                                                        final SubLObject var7_214 = module0138.$g1625$.currentBinding(var202);
                                                                        try {
                                                                            module0138.$g1625$.bind(var238, var202);
                                                                            final SubLObject var240;
                                                                            final SubLObject var239 = var240 = Functions.funcall(var238, var223);
                                                                            if (module0597.NIL != module0077.f5302(var240)) {
                                                                                final SubLObject var241 = module0077.f5333(var240);
                                                                                SubLObject var242;
                                                                                SubLObject var243;
                                                                                SubLObject var244;
                                                                                for (var242 = module0032.f1741(var241), var243 = (SubLObject)module0597.NIL, var243 = module0032.f1742(var242, var241); module0597.NIL == module0032.f1744(var242, var243); var243 = module0032.f1743(var243)) {
                                                                                    var244 = module0032.f1745(var242, var243);
                                                                                    if (module0597.NIL != module0032.f1746(var243, var244) && module0597.NIL == module0249.f16059(var244, (SubLObject)module0597.UNPROVIDED)) {
                                                                                        module0249.f16055(var244, (SubLObject)module0597.UNPROVIDED);
                                                                                        module0056.f4149(var244, var213);
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (var240.isList()) {
                                                                                SubLObject var245 = var240;
                                                                                SubLObject var246 = (SubLObject)module0597.NIL;
                                                                                var246 = var245.first();
                                                                                while (module0597.NIL != var245) {
                                                                                    if (module0597.NIL == module0249.f16059(var246, (SubLObject)module0597.UNPROVIDED)) {
                                                                                        module0249.f16055(var246, (SubLObject)module0597.UNPROVIDED);
                                                                                        module0056.f4149(var246, var213);
                                                                                    }
                                                                                    var245 = var245.rest();
                                                                                    var246 = var245.first();
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)module0597.$ic187$, var240);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1625$.rebind(var7_214, var202);
                                                                        }
                                                                        var28_226 = var28_226.rest();
                                                                        var238 = var28_226.first();
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                module0141.$g1674$.rebind(var8_211, var202);
                                                                module0137.$g1605$.rebind(var7_211, var202);
                                                            }
                                                            var28_225 = var28_225.rest();
                                                            var222 = var28_225.first();
                                                        }
                                                        var211 = module0056.f4150(var213);
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var9_222, var202);
                                                    module0138.$g1619$.rebind(var8_209, var202);
                                                    module0141.$g1677$.rebind(var7_209, var202);
                                                }
                                            }
                                            else {
                                                module0136.f8872((SubLObject)module0597.TWO_INTEGER, (SubLObject)module0597.$ic189$, var198, module0244.f15748(module0137.f8955((SubLObject)module0597.UNPROVIDED)), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                                            }
                                        }
                                        finally {
                                            module0137.$g1605$.rebind(var218, var202);
                                            module0141.$g1674$.rebind(var217, var202);
                                            module0141.$g1672$.rebind(var216, var202);
                                            module0141.$g1671$.rebind(var8_208, var202);
                                            module0141.$g1670$.rebind(var7_208, var202);
                                        }
                                    }
                                    finally {
                                        module0141.$g1715$.rebind(var8_207, var202);
                                        module0141.$g1714$.rebind(var7_207, var202);
                                    }
                                    module0139.f9011(module0139.$g1635$.getDynamicValue(var202));
                                }
                                finally {
                                    module0139.$g1635$.rebind(var7_206, var202);
                                }
                            }
                            finally {
                                module0018.$g588$.rebind(var7_205, var202);
                            }
                            var208 = var208.rest();
                            var209 = var208.first();
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var8_206, var202);
                        module0139.$g1638$.rebind(var7_204, var202);
                    }
                    module0139.f9011(module0139.$g1659$.getDynamicValue(var202));
                }
                finally {
                    module0139.$g1659$.rebind(var8_205, var202);
                    module0139.$g1630$.rebind(var7_203, var202);
                }
                final SubLObject var247 = module0035.f2272(Mapping.mapcar((SubLObject)module0597.$ic190$, module0018.$g584$.getDynamicValue(var202)));
                final SubLObject var248 = Hashtables.make_hash_table(Sequences.length(var247), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                SubLObject var249 = (SubLObject)module0597.NIL;
                SubLObject var250 = (SubLObject)module0597.NIL;
                SubLObject var251 = module0018.$g584$.getDynamicValue(var202);
                SubLObject var252 = (SubLObject)module0597.NIL;
                var252 = var251.first();
                while (module0597.NIL != var251) {
                    SubLObject var254;
                    final SubLObject var253 = var254 = var252;
                    SubLObject var255 = (SubLObject)module0597.NIL;
                    SubLObject var256 = (SubLObject)module0597.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var254, var253, (SubLObject)module0597.$ic191$);
                    var255 = var254.first();
                    var254 = (var256 = var254.rest());
                    module0030.f1599(var255, var256, var248);
                    var251 = var251.rest();
                    var252 = var251.first();
                }
                SubLObject var257 = (SubLObject)module0597.NIL;
                SubLObject var258 = (SubLObject)module0597.NIL;
                final Iterator var259 = Hashtables.getEntrySetIterator(var248);
                try {
                    while (Hashtables.iteratorHasNext(var259)) {
                        final Map.Entry var260 = Hashtables.iteratorNextEntry(var259);
                        var257 = Hashtables.getEntryKey(var260);
                        var258 = Hashtables.getEntryValue(var260);
                        var249 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(Sequences.length(var258), (SubLObject)ConsesLow.cons(var257, var258)), var249);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var259);
                }
                var250 = (var251 = f36634(var249, var199, (SubLObject)module0597.UNPROVIDED));
                SubLObject var261 = (SubLObject)module0597.NIL;
                var261 = var251.first();
                while (module0597.NIL != var251) {
                    final SubLObject var262 = module0139.f9008();
                    final SubLObject var7_215 = module0139.$g1630$.currentBinding(var202);
                    final SubLObject var8_212 = module0139.$g1659$.currentBinding(var202);
                    try {
                        module0139.$g1630$.bind((SubLObject)module0597.NIL, var202);
                        module0139.$g1659$.bind(module0139.f9007(), var202);
                        final SubLObject var7_216 = module0139.$g1638$.currentBinding(var202);
                        final SubLObject var8_213 = module0139.$g1630$.currentBinding(var202);
                        try {
                            module0139.$g1638$.bind(module0139.$g1659$.getDynamicValue(var202), var202);
                            module0139.$g1630$.bind(var262, var202);
                            module0251.f16232(module0137.f8955(module0597.$ic126$), var261, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                            SubLObject var263 = (SubLObject)module0597.NIL;
                            final SubLObject var7_217 = module0139.$g1635$.currentBinding(var202);
                            try {
                                module0139.$g1635$.bind(module0139.f9007(), var202);
                                final SubLObject var7_218 = module0139.$g1644$.currentBinding(var202);
                                try {
                                    module0139.$g1644$.bind((SubLObject)module0597.T, var202);
                                    SubLObject var264 = (SubLObject)module0597.NIL;
                                    SubLObject var265 = (SubLObject)module0597.NIL;
                                    final Iterator var266 = Hashtables.getEntrySetIterator(var248);
                                    try {
                                        while (Hashtables.iteratorHasNext(var266)) {
                                            final Map.Entry var267 = Hashtables.iteratorNextEntry(var266);
                                            var264 = Hashtables.getEntryKey(var267);
                                            var265 = Hashtables.getEntryValue(var267);
                                            if (module0597.NIL != module0251.f16239(var264, module0139.$g1638$.getDynamicValue(var202)) || module0597.NIL != module0256.f16576(var264, var261, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED)) {
                                                var263 = ConsesLow.nconc(var263, conses_high.copy_list(var265));
                                            }
                                        }
                                    }
                                    finally {
                                        Hashtables.releaseEntrySetIterator(var266);
                                    }
                                }
                                finally {
                                    module0139.$g1644$.rebind(var7_218, var202);
                                }
                                module0139.f9011(module0139.$g1635$.getDynamicValue(var202));
                            }
                            finally {
                                module0139.$g1635$.rebind(var7_217, var202);
                            }
                            var203 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var261, Sequences.length(var263), var263), var203);
                        }
                        finally {
                            module0139.$g1630$.rebind(var8_213, var202);
                            module0139.$g1638$.rebind(var7_216, var202);
                        }
                        module0139.f9011(module0139.$g1659$.getDynamicValue(var202));
                    }
                    finally {
                        module0139.$g1659$.rebind(var8_212, var202);
                        module0139.$g1630$.rebind(var7_215, var202);
                    }
                    var251 = var251.rest();
                    var261 = var251.first();
                }
            }
            finally {
                module0147.$g2095$.rebind(var206, var202);
                module0147.$g2094$.rebind(var7_202, var202);
            }
        }
        finally {
            module0018.$g584$.rebind(var204, var202);
        }
        return Sort.sort(var203, (SubLObject)module0597.$ic192$, (SubLObject)module0597.$ic193$);
    }
    
    public static SubLObject f36635(final SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        final SubLObject var45 = module0178.f11331(var43, module0018.$g589$.getDynamicValue(var44));
        final SubLObject var46 = module0178.f11331(var43, module0018.$g590$.getDynamicValue(var44));
        if (module0597.NIL != module0173.f10955(var45) && module0597.NIL != module0173.f10955(var46) && module0597.NIL == module0251.f16239(var46, module0139.$g1638$.getDynamicValue(var44)) && module0597.NIL != module0269.f17706(var46)) {
            module0018.$g584$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var45, (SubLObject)ConsesLow.cons(var46, module0018.$g588$.getDynamicValue(var44))), module0018.$g584$.getDynamicValue(var44)), var44);
            module0251.f16232(module0137.f8955(module0597.$ic194$), var46, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36636(final SubLObject var273, SubLObject var3) {
        if (var3 == module0597.UNPROVIDED) {
            var3 = (SubLObject)module0597.NIL;
        }
        final SubLThread var274 = SubLProcess.currentSubLThread();
        SubLObject var275 = (SubLObject)module0597.NIL;
        final SubLObject var276 = var3;
        final SubLObject var277 = module0147.$g2094$.currentBinding(var274);
        final SubLObject var278 = module0147.$g2095$.currentBinding(var274);
        try {
            module0147.$g2094$.bind(module0147.f9531(var276), var274);
            module0147.$g2095$.bind(module0147.f9534(var276), var274);
            SubLObject var279 = var273;
            SubLObject var280 = (SubLObject)module0597.NIL;
            var280 = var279.first();
            while (module0597.NIL != var279) {
                if (module0597.NIL == module0256.f16607(var280, var273, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED)) {
                    var275 = (SubLObject)ConsesLow.cons(var280, var275);
                }
                var279 = var279.rest();
                var280 = var279.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var278, var274);
            module0147.$g2094$.rebind(var277, var274);
        }
        return var275;
    }
    
    public static SubLObject f36637(final SubLObject var273, SubLObject var3) {
        if (var3 == module0597.UNPROVIDED) {
            var3 = (SubLObject)module0597.NIL;
        }
        final SubLThread var274 = SubLProcess.currentSubLThread();
        final SubLObject var275 = Sequences.length(var273);
        final SubLObject var276 = Hashtables.make_hash_table(var275, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
        SubLObject var277 = (SubLObject)module0597.NIL;
        final SubLObject var278 = var3;
        final SubLObject var279 = module0147.$g2094$.currentBinding(var274);
        final SubLObject var280 = module0147.$g2095$.currentBinding(var274);
        try {
            module0147.$g2094$.bind(module0147.f9531(var278), var274);
            module0147.$g2095$.bind(module0147.f9534(var278), var274);
            SubLObject var281 = var273;
            SubLObject var282 = (SubLObject)module0597.NIL;
            var282 = var281.first();
            while (module0597.NIL != var281) {
                SubLObject var283 = var282;
                final SubLObject var284 = (SubLObject)((module0597.$ic134$ == module0597.$ic175$) ? module0597.$ic176$ : module0597.$ic177$);
                final SubLObject var285 = module0056.f4145(var284);
                final SubLObject var7_274 = module0139.$g1635$.currentBinding(var274);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var274);
                    final SubLObject var286 = (SubLObject)module0597.NIL;
                    final SubLObject var7_275 = module0141.$g1714$.currentBinding(var274);
                    final SubLObject var8_276 = module0141.$g1715$.currentBinding(var274);
                    try {
                        module0141.$g1714$.bind((module0597.NIL != var286) ? var286 : module0141.f9283(), var274);
                        module0141.$g1715$.bind((SubLObject)((module0597.NIL != var286) ? module0597.$ic178$ : module0141.$g1715$.getDynamicValue(var274)), var274);
                        if (module0597.NIL != var286 && module0597.NIL != module0136.f8864() && module0597.NIL == module0141.f9279(var286)) {
                            final SubLObject var287 = module0136.$g1591$.getDynamicValue(var274);
                            if (var287.eql((SubLObject)module0597.$ic179$)) {
                                module0136.f8870((SubLObject)module0597.ONE_INTEGER, (SubLObject)module0597.$ic180$, var286, (SubLObject)module0597.$ic181$, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                            }
                            else if (var287.eql((SubLObject)module0597.$ic182$)) {
                                module0136.f8871((SubLObject)module0597.ONE_INTEGER, (SubLObject)module0597.$ic152$, (SubLObject)module0597.$ic180$, var286, (SubLObject)module0597.$ic181$, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                            }
                            else if (var287.eql((SubLObject)module0597.$ic183$)) {
                                Errors.warn((SubLObject)module0597.$ic180$, var286, (SubLObject)module0597.$ic181$);
                            }
                            else {
                                Errors.warn((SubLObject)module0597.$ic184$, module0136.$g1591$.getDynamicValue(var274));
                                Errors.cerror((SubLObject)module0597.$ic152$, (SubLObject)module0597.$ic180$, var286, (SubLObject)module0597.$ic181$);
                            }
                        }
                        final SubLObject var7_276 = module0141.$g1670$.currentBinding(var274);
                        final SubLObject var8_277 = module0141.$g1671$.currentBinding(var274);
                        final SubLObject var288 = module0141.$g1672$.currentBinding(var274);
                        final SubLObject var289 = module0141.$g1674$.currentBinding(var274);
                        final SubLObject var290 = module0137.$g1605$.currentBinding(var274);
                        try {
                            module0141.$g1670$.bind(module0137.f8955(module0597.$ic126$), var274);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0597.$ic126$)), var274);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0597.$ic126$)), var274);
                            module0141.$g1674$.bind((SubLObject)module0597.NIL, var274);
                            module0137.$g1605$.bind(module0137.f8955(module0597.$ic126$), var274);
                            if (module0597.NIL != module0136.f8865() || module0597.NIL != module0244.f15795(var282, module0137.f8955((SubLObject)module0597.UNPROVIDED))) {
                                final SubLObject var7_277 = module0141.$g1677$.currentBinding(var274);
                                final SubLObject var8_278 = module0138.$g1619$.currentBinding(var274);
                                final SubLObject var9_281 = module0141.$g1674$.currentBinding(var274);
                                try {
                                    module0141.$g1677$.bind(module0141.f9208(), var274);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0597.$ic126$)), var274);
                                    module0141.$g1674$.bind((SubLObject)module0597.NIL, var274);
                                    module0249.f16055(var283, (SubLObject)module0597.UNPROVIDED);
                                    while (module0597.NIL != var283) {
                                        final SubLObject var291 = var283;
                                        if (module0597.NIL != module0004.f104(var291, var273, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED)) {
                                            module0030.f1599(var282, var291, var276);
                                        }
                                        SubLObject var28_282;
                                        final SubLObject var292 = var28_282 = module0200.f12443(module0137.f8955(module0597.$ic126$));
                                        SubLObject var293 = (SubLObject)module0597.NIL;
                                        var293 = var28_282.first();
                                        while (module0597.NIL != var28_282) {
                                            final SubLObject var7_278 = module0137.$g1605$.currentBinding(var274);
                                            final SubLObject var8_279 = module0141.$g1674$.currentBinding(var274);
                                            try {
                                                module0137.$g1605$.bind(var293, var274);
                                                module0141.$g1674$.bind((SubLObject)((module0597.NIL != module0141.f9205((SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0597.NIL == module0141.$g1674$.getDynamicValue(var274)) : module0141.$g1674$.getDynamicValue(var274)), var274);
                                                final SubLObject var294 = module0228.f15229(var283);
                                                if (module0597.NIL != module0138.f8992(var294)) {
                                                    final SubLObject var295 = module0242.f15664(var294, module0137.f8955((SubLObject)module0597.UNPROVIDED));
                                                    if (module0597.NIL != var295) {
                                                        final SubLObject var296 = module0245.f15834(var295, module0138.f8979(), module0137.f8955((SubLObject)module0597.UNPROVIDED));
                                                        if (module0597.NIL != var296) {
                                                            SubLObject var297;
                                                            for (var297 = module0066.f4838(module0067.f4891(var296)); module0597.NIL == module0066.f4841(var297); var297 = module0066.f4840(var297)) {
                                                                var274.resetMultipleValues();
                                                                final SubLObject var238_285 = module0066.f4839(var297);
                                                                final SubLObject var298 = var274.secondMultipleValue();
                                                                var274.resetMultipleValues();
                                                                if (module0597.NIL != module0147.f9507(var238_285)) {
                                                                    final SubLObject var7_279 = module0138.$g1623$.currentBinding(var274);
                                                                    try {
                                                                        module0138.$g1623$.bind(var238_285, var274);
                                                                        SubLObject var237_287;
                                                                        for (var237_287 = module0066.f4838(module0067.f4891(var298)); module0597.NIL == module0066.f4841(var237_287); var237_287 = module0066.f4840(var237_287)) {
                                                                            var274.resetMultipleValues();
                                                                            final SubLObject var299 = module0066.f4839(var237_287);
                                                                            final SubLObject var300 = var274.secondMultipleValue();
                                                                            var274.resetMultipleValues();
                                                                            if (module0597.NIL != module0141.f9289(var299)) {
                                                                                final SubLObject var7_280 = module0138.$g1624$.currentBinding(var274);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var299, var274);
                                                                                    final SubLObject var301 = var300;
                                                                                    if (module0597.NIL != module0077.f5302(var301)) {
                                                                                        final SubLObject var302 = module0077.f5333(var301);
                                                                                        SubLObject var303;
                                                                                        SubLObject var304;
                                                                                        SubLObject var305;
                                                                                        for (var303 = module0032.f1741(var302), var304 = (SubLObject)module0597.NIL, var304 = module0032.f1742(var303, var302); module0597.NIL == module0032.f1744(var303, var304); var304 = module0032.f1743(var304)) {
                                                                                            var305 = module0032.f1745(var303, var304);
                                                                                            if (module0597.NIL != module0032.f1746(var304, var305) && module0597.NIL == module0249.f16059(var305, (SubLObject)module0597.UNPROVIDED)) {
                                                                                                module0249.f16055(var305, (SubLObject)module0597.UNPROVIDED);
                                                                                                module0056.f4149(var305, var285);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var301.isList()) {
                                                                                        SubLObject var306 = var301;
                                                                                        SubLObject var307 = (SubLObject)module0597.NIL;
                                                                                        var307 = var306.first();
                                                                                        while (module0597.NIL != var306) {
                                                                                            if (module0597.NIL == module0249.f16059(var307, (SubLObject)module0597.UNPROVIDED)) {
                                                                                                module0249.f16055(var307, (SubLObject)module0597.UNPROVIDED);
                                                                                                module0056.f4149(var307, var285);
                                                                                            }
                                                                                            var306 = var306.rest();
                                                                                            var307 = var306.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0597.$ic187$, var301);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var7_280, var274);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var237_287);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var7_279, var274);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var297);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0597.FIVE_INTEGER, (SubLObject)module0597.$ic188$, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0597.NIL != module0155.f9785(var294, (SubLObject)module0597.UNPROVIDED)) {
                                                    SubLObject var28_283;
                                                    final SubLObject var308 = var28_283 = ((module0597.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var274), module0137.f8955((SubLObject)module0597.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var274), module0137.f8955((SubLObject)module0597.UNPROVIDED)));
                                                    SubLObject var309 = (SubLObject)module0597.NIL;
                                                    var309 = var28_283.first();
                                                    while (module0597.NIL != var28_283) {
                                                        final SubLObject var7_281 = module0138.$g1625$.currentBinding(var274);
                                                        try {
                                                            module0138.$g1625$.bind(var309, var274);
                                                            final SubLObject var311;
                                                            final SubLObject var310 = var311 = Functions.funcall(var309, var294);
                                                            if (module0597.NIL != module0077.f5302(var311)) {
                                                                final SubLObject var312 = module0077.f5333(var311);
                                                                SubLObject var313;
                                                                SubLObject var314;
                                                                SubLObject var315;
                                                                for (var313 = module0032.f1741(var312), var314 = (SubLObject)module0597.NIL, var314 = module0032.f1742(var313, var312); module0597.NIL == module0032.f1744(var313, var314); var314 = module0032.f1743(var314)) {
                                                                    var315 = module0032.f1745(var313, var314);
                                                                    if (module0597.NIL != module0032.f1746(var314, var315) && module0597.NIL == module0249.f16059(var315, (SubLObject)module0597.UNPROVIDED)) {
                                                                        module0249.f16055(var315, (SubLObject)module0597.UNPROVIDED);
                                                                        module0056.f4149(var315, var285);
                                                                    }
                                                                }
                                                            }
                                                            else if (var311.isList()) {
                                                                SubLObject var316 = var311;
                                                                SubLObject var317 = (SubLObject)module0597.NIL;
                                                                var317 = var316.first();
                                                                while (module0597.NIL != var316) {
                                                                    if (module0597.NIL == module0249.f16059(var317, (SubLObject)module0597.UNPROVIDED)) {
                                                                        module0249.f16055(var317, (SubLObject)module0597.UNPROVIDED);
                                                                        module0056.f4149(var317, var285);
                                                                    }
                                                                    var316 = var316.rest();
                                                                    var317 = var316.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0597.$ic187$, var311);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var7_281, var274);
                                                        }
                                                        var28_283 = var28_283.rest();
                                                        var309 = var28_283.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var8_279, var274);
                                                module0137.$g1605$.rebind(var7_278, var274);
                                            }
                                            var28_282 = var28_282.rest();
                                            var293 = var28_282.first();
                                        }
                                        var283 = module0056.f4150(var285);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var9_281, var274);
                                    module0138.$g1619$.rebind(var8_278, var274);
                                    module0141.$g1677$.rebind(var7_277, var274);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0597.TWO_INTEGER, (SubLObject)module0597.$ic189$, var282, module0244.f15748(module0137.f8955((SubLObject)module0597.UNPROVIDED)), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var290, var274);
                            module0141.$g1674$.rebind(var289, var274);
                            module0141.$g1672$.rebind(var288, var274);
                            module0141.$g1671$.rebind(var8_277, var274);
                            module0141.$g1670$.rebind(var7_276, var274);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var8_276, var274);
                        module0141.$g1714$.rebind(var7_275, var274);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var274));
                }
                finally {
                    module0139.$g1635$.rebind(var7_274, var274);
                }
                var281 = var281.rest();
                var282 = var281.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var280, var274);
            module0147.$g2094$.rebind(var279, var274);
        }
        SubLObject var318 = (SubLObject)module0597.NIL;
        SubLObject var319 = (SubLObject)module0597.NIL;
        SubLObject var320 = (SubLObject)module0597.NIL;
        SubLObject var321 = (SubLObject)module0597.NIL;
        SubLObject var322 = (SubLObject)module0597.NIL;
        var319 = (var320 = var273);
        var321 = (SubLObject)module0597.NIL;
        var322 = var275;
        while (module0597.NIL == var318 || !var320.eql(var319)) {
            SubLObject var323 = (SubLObject)module0597.NIL;
            SubLObject var324 = (SubLObject)module0597.NIL;
            final Iterator var325 = Hashtables.getEntrySetIterator(var276);
            try {
                while (Hashtables.iteratorHasNext(var325)) {
                    final Map.Entry var326 = Hashtables.iteratorNextEntry(var325);
                    var323 = Hashtables.getEntryKey(var326);
                    var324 = Hashtables.getEntryValue(var326);
                    if (var322.numE(Sequences.length(var324))) {
                        var321 = (SubLObject)ConsesLow.cons(var323, var321);
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var325);
            }
            var318 = (SubLObject)module0597.T;
            var319 = var320;
            var320 = module0035.f2225(var319, var321);
            var321 = (SubLObject)module0597.NIL;
            var322 = Sequences.length(var320);
        }
        var277 = var320;
        return var277;
    }
    
    public static SubLObject f36638(final SubLObject var297, final SubLObject var273, SubLObject var3) {
        if (var3 == module0597.UNPROVIDED) {
            var3 = (SubLObject)module0597.NIL;
        }
        SubLObject var298 = var273;
        SubLObject var299 = var297;
        SubLObject var300 = (SubLObject)module0597.NIL;
        var300 = var299.first();
        while (module0597.NIL != var299) {
            final SubLObject var301 = module0256.f16575(var300, var273, var3, (SubLObject)module0597.UNPROVIDED);
            final SubLObject var302 = f36637(var301, var3);
            var298 = module0076.f5292(var298, var302);
            var299 = var299.rest();
            var300 = var299.first();
        }
        return var298;
    }
    
    public static SubLObject f36639(final SubLObject var273, SubLObject var3) {
        if (var3 == module0597.UNPROVIDED) {
            var3 = (SubLObject)module0597.NIL;
        }
        final SubLThread var274 = SubLProcess.currentSubLThread();
        SubLObject var275 = (SubLObject)module0597.NIL;
        final SubLObject var276 = var3;
        final SubLObject var277 = module0147.$g2094$.currentBinding(var274);
        final SubLObject var278 = module0147.$g2095$.currentBinding(var274);
        try {
            module0147.$g2094$.bind(module0147.f9531(var276), var274);
            module0147.$g2095$.bind(module0147.f9534(var276), var274);
            SubLObject var279 = var273;
            SubLObject var280 = (SubLObject)module0597.NIL;
            var280 = var279.first();
            while (module0597.NIL != var279) {
                if (module0597.NIL == module0256.f16608(var280, var273, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED)) {
                    var275 = (SubLObject)ConsesLow.cons(var280, var275);
                }
                var279 = var279.rest();
                var280 = var279.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var278, var274);
            module0147.$g2094$.rebind(var277, var274);
        }
        return var275;
    }
    
    public static SubLObject f36640(final SubLObject var273, SubLObject var3) {
        if (var3 == module0597.UNPROVIDED) {
            var3 = (SubLObject)module0597.NIL;
        }
        final SubLThread var274 = SubLProcess.currentSubLThread();
        final SubLObject var275 = Sequences.length(var273);
        final SubLObject var276 = Hashtables.make_hash_table(var275, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
        SubLObject var277 = (SubLObject)module0597.NIL;
        final SubLObject var278 = var3;
        final SubLObject var279 = module0147.$g2094$.currentBinding(var274);
        final SubLObject var280 = module0147.$g2095$.currentBinding(var274);
        try {
            module0147.$g2094$.bind(module0147.f9531(var278), var274);
            module0147.$g2095$.bind(module0147.f9534(var278), var274);
            SubLObject var281 = var273;
            SubLObject var282 = (SubLObject)module0597.NIL;
            var282 = var281.first();
            while (module0597.NIL != var281) {
                SubLObject var283 = var282;
                final SubLObject var284 = (SubLObject)((module0597.$ic134$ == module0597.$ic175$) ? module0597.$ic176$ : module0597.$ic177$);
                final SubLObject var285 = module0056.f4145(var284);
                final SubLObject var7_301 = module0139.$g1635$.currentBinding(var274);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var274);
                    final SubLObject var286 = (SubLObject)module0597.NIL;
                    final SubLObject var7_302 = module0141.$g1714$.currentBinding(var274);
                    final SubLObject var8_303 = module0141.$g1715$.currentBinding(var274);
                    try {
                        module0141.$g1714$.bind((module0597.NIL != var286) ? var286 : module0141.f9283(), var274);
                        module0141.$g1715$.bind((SubLObject)((module0597.NIL != var286) ? module0597.$ic178$ : module0141.$g1715$.getDynamicValue(var274)), var274);
                        if (module0597.NIL != var286 && module0597.NIL != module0136.f8864() && module0597.NIL == module0141.f9279(var286)) {
                            final SubLObject var287 = module0136.$g1591$.getDynamicValue(var274);
                            if (var287.eql((SubLObject)module0597.$ic179$)) {
                                module0136.f8870((SubLObject)module0597.ONE_INTEGER, (SubLObject)module0597.$ic180$, var286, (SubLObject)module0597.$ic181$, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                            }
                            else if (var287.eql((SubLObject)module0597.$ic182$)) {
                                module0136.f8871((SubLObject)module0597.ONE_INTEGER, (SubLObject)module0597.$ic152$, (SubLObject)module0597.$ic180$, var286, (SubLObject)module0597.$ic181$, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                            }
                            else if (var287.eql((SubLObject)module0597.$ic183$)) {
                                Errors.warn((SubLObject)module0597.$ic180$, var286, (SubLObject)module0597.$ic181$);
                            }
                            else {
                                Errors.warn((SubLObject)module0597.$ic184$, module0136.$g1591$.getDynamicValue(var274));
                                Errors.cerror((SubLObject)module0597.$ic152$, (SubLObject)module0597.$ic180$, var286, (SubLObject)module0597.$ic181$);
                            }
                        }
                        final SubLObject var7_303 = module0141.$g1670$.currentBinding(var274);
                        final SubLObject var8_304 = module0141.$g1671$.currentBinding(var274);
                        final SubLObject var288 = module0141.$g1672$.currentBinding(var274);
                        final SubLObject var289 = module0141.$g1674$.currentBinding(var274);
                        final SubLObject var290 = module0137.$g1605$.currentBinding(var274);
                        try {
                            module0141.$g1670$.bind(module0137.f8955(module0597.$ic126$), var274);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0597.$ic126$)), var274);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0597.$ic126$)), var274);
                            module0141.$g1674$.bind((SubLObject)module0597.NIL, var274);
                            module0137.$g1605$.bind(module0137.f8955(module0597.$ic126$), var274);
                            if (module0597.NIL != module0136.f8865() || module0597.NIL != module0244.f15795(var282, module0137.f8955((SubLObject)module0597.UNPROVIDED))) {
                                final SubLObject var7_304 = module0141.$g1677$.currentBinding(var274);
                                final SubLObject var8_305 = module0138.$g1619$.currentBinding(var274);
                                final SubLObject var9_308 = module0141.$g1674$.currentBinding(var274);
                                try {
                                    module0141.$g1677$.bind(module0141.f9208(), var274);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0597.$ic126$)), var274);
                                    module0141.$g1674$.bind((SubLObject)module0597.NIL, var274);
                                    module0249.f16055(var283, (SubLObject)module0597.UNPROVIDED);
                                    while (module0597.NIL != var283) {
                                        final SubLObject var291 = var283;
                                        if (module0597.NIL != module0004.f104(var291, var273, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED)) {
                                            module0030.f1599(var291, var282, var276);
                                        }
                                        SubLObject var28_309;
                                        final SubLObject var292 = var28_309 = module0200.f12443(module0137.f8955(module0597.$ic126$));
                                        SubLObject var293 = (SubLObject)module0597.NIL;
                                        var293 = var28_309.first();
                                        while (module0597.NIL != var28_309) {
                                            final SubLObject var7_305 = module0137.$g1605$.currentBinding(var274);
                                            final SubLObject var8_306 = module0141.$g1674$.currentBinding(var274);
                                            try {
                                                module0137.$g1605$.bind(var293, var274);
                                                module0141.$g1674$.bind((SubLObject)((module0597.NIL != module0141.f9205((SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0597.NIL == module0141.$g1674$.getDynamicValue(var274)) : module0141.$g1674$.getDynamicValue(var274)), var274);
                                                final SubLObject var294 = module0228.f15229(var283);
                                                if (module0597.NIL != module0138.f8992(var294)) {
                                                    final SubLObject var295 = module0242.f15664(var294, module0137.f8955((SubLObject)module0597.UNPROVIDED));
                                                    if (module0597.NIL != var295) {
                                                        final SubLObject var296 = module0245.f15834(var295, module0138.f8979(), module0137.f8955((SubLObject)module0597.UNPROVIDED));
                                                        if (module0597.NIL != var296) {
                                                            SubLObject var297;
                                                            for (var297 = module0066.f4838(module0067.f4891(var296)); module0597.NIL == module0066.f4841(var297); var297 = module0066.f4840(var297)) {
                                                                var274.resetMultipleValues();
                                                                final SubLObject var238_312 = module0066.f4839(var297);
                                                                final SubLObject var298 = var274.secondMultipleValue();
                                                                var274.resetMultipleValues();
                                                                if (module0597.NIL != module0147.f9507(var238_312)) {
                                                                    final SubLObject var7_306 = module0138.$g1623$.currentBinding(var274);
                                                                    try {
                                                                        module0138.$g1623$.bind(var238_312, var274);
                                                                        SubLObject var237_314;
                                                                        for (var237_314 = module0066.f4838(module0067.f4891(var298)); module0597.NIL == module0066.f4841(var237_314); var237_314 = module0066.f4840(var237_314)) {
                                                                            var274.resetMultipleValues();
                                                                            final SubLObject var299 = module0066.f4839(var237_314);
                                                                            final SubLObject var300 = var274.secondMultipleValue();
                                                                            var274.resetMultipleValues();
                                                                            if (module0597.NIL != module0141.f9289(var299)) {
                                                                                final SubLObject var7_307 = module0138.$g1624$.currentBinding(var274);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var299, var274);
                                                                                    final SubLObject var301 = var300;
                                                                                    if (module0597.NIL != module0077.f5302(var301)) {
                                                                                        final SubLObject var302 = module0077.f5333(var301);
                                                                                        SubLObject var303;
                                                                                        SubLObject var304;
                                                                                        SubLObject var305;
                                                                                        for (var303 = module0032.f1741(var302), var304 = (SubLObject)module0597.NIL, var304 = module0032.f1742(var303, var302); module0597.NIL == module0032.f1744(var303, var304); var304 = module0032.f1743(var304)) {
                                                                                            var305 = module0032.f1745(var303, var304);
                                                                                            if (module0597.NIL != module0032.f1746(var304, var305) && module0597.NIL == module0249.f16059(var305, (SubLObject)module0597.UNPROVIDED)) {
                                                                                                module0249.f16055(var305, (SubLObject)module0597.UNPROVIDED);
                                                                                                module0056.f4149(var305, var285);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var301.isList()) {
                                                                                        SubLObject var306 = var301;
                                                                                        SubLObject var307 = (SubLObject)module0597.NIL;
                                                                                        var307 = var306.first();
                                                                                        while (module0597.NIL != var306) {
                                                                                            if (module0597.NIL == module0249.f16059(var307, (SubLObject)module0597.UNPROVIDED)) {
                                                                                                module0249.f16055(var307, (SubLObject)module0597.UNPROVIDED);
                                                                                                module0056.f4149(var307, var285);
                                                                                            }
                                                                                            var306 = var306.rest();
                                                                                            var307 = var306.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0597.$ic187$, var301);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var7_307, var274);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var237_314);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var7_306, var274);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var297);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0597.FIVE_INTEGER, (SubLObject)module0597.$ic188$, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0597.NIL != module0155.f9785(var294, (SubLObject)module0597.UNPROVIDED)) {
                                                    SubLObject var28_310;
                                                    final SubLObject var308 = var28_310 = ((module0597.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var274), module0137.f8955((SubLObject)module0597.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var274), module0137.f8955((SubLObject)module0597.UNPROVIDED)));
                                                    SubLObject var309 = (SubLObject)module0597.NIL;
                                                    var309 = var28_310.first();
                                                    while (module0597.NIL != var28_310) {
                                                        final SubLObject var7_308 = module0138.$g1625$.currentBinding(var274);
                                                        try {
                                                            module0138.$g1625$.bind(var309, var274);
                                                            final SubLObject var311;
                                                            final SubLObject var310 = var311 = Functions.funcall(var309, var294);
                                                            if (module0597.NIL != module0077.f5302(var311)) {
                                                                final SubLObject var312 = module0077.f5333(var311);
                                                                SubLObject var313;
                                                                SubLObject var314;
                                                                SubLObject var315;
                                                                for (var313 = module0032.f1741(var312), var314 = (SubLObject)module0597.NIL, var314 = module0032.f1742(var313, var312); module0597.NIL == module0032.f1744(var313, var314); var314 = module0032.f1743(var314)) {
                                                                    var315 = module0032.f1745(var313, var314);
                                                                    if (module0597.NIL != module0032.f1746(var314, var315) && module0597.NIL == module0249.f16059(var315, (SubLObject)module0597.UNPROVIDED)) {
                                                                        module0249.f16055(var315, (SubLObject)module0597.UNPROVIDED);
                                                                        module0056.f4149(var315, var285);
                                                                    }
                                                                }
                                                            }
                                                            else if (var311.isList()) {
                                                                SubLObject var316 = var311;
                                                                SubLObject var317 = (SubLObject)module0597.NIL;
                                                                var317 = var316.first();
                                                                while (module0597.NIL != var316) {
                                                                    if (module0597.NIL == module0249.f16059(var317, (SubLObject)module0597.UNPROVIDED)) {
                                                                        module0249.f16055(var317, (SubLObject)module0597.UNPROVIDED);
                                                                        module0056.f4149(var317, var285);
                                                                    }
                                                                    var316 = var316.rest();
                                                                    var317 = var316.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0597.$ic187$, var311);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var7_308, var274);
                                                        }
                                                        var28_310 = var28_310.rest();
                                                        var309 = var28_310.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var8_306, var274);
                                                module0137.$g1605$.rebind(var7_305, var274);
                                            }
                                            var28_309 = var28_309.rest();
                                            var293 = var28_309.first();
                                        }
                                        var283 = module0056.f4150(var285);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var9_308, var274);
                                    module0138.$g1619$.rebind(var8_305, var274);
                                    module0141.$g1677$.rebind(var7_304, var274);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0597.TWO_INTEGER, (SubLObject)module0597.$ic189$, var282, module0244.f15748(module0137.f8955((SubLObject)module0597.UNPROVIDED)), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var290, var274);
                            module0141.$g1674$.rebind(var289, var274);
                            module0141.$g1672$.rebind(var288, var274);
                            module0141.$g1671$.rebind(var8_304, var274);
                            module0141.$g1670$.rebind(var7_303, var274);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var8_303, var274);
                        module0141.$g1714$.rebind(var7_302, var274);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var274));
                }
                finally {
                    module0139.$g1635$.rebind(var7_301, var274);
                }
                var281 = var281.rest();
                var282 = var281.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var280, var274);
            module0147.$g2094$.rebind(var279, var274);
        }
        SubLObject var318 = (SubLObject)module0597.NIL;
        SubLObject var319 = (SubLObject)module0597.NIL;
        SubLObject var320 = (SubLObject)module0597.NIL;
        SubLObject var321 = (SubLObject)module0597.NIL;
        SubLObject var322 = (SubLObject)module0597.NIL;
        var319 = (var320 = var273);
        var321 = (SubLObject)module0597.NIL;
        var322 = var275;
        while (module0597.NIL == var318 || !var320.eql(var319)) {
            SubLObject var323 = (SubLObject)module0597.NIL;
            SubLObject var324 = (SubLObject)module0597.NIL;
            final Iterator var325 = Hashtables.getEntrySetIterator(var276);
            try {
                while (Hashtables.iteratorHasNext(var325)) {
                    final Map.Entry var326 = Hashtables.iteratorNextEntry(var325);
                    var323 = Hashtables.getEntryKey(var326);
                    var324 = Hashtables.getEntryValue(var326);
                    if (var322.numE(Sequences.length(var324))) {
                        var321 = (SubLObject)ConsesLow.cons(var323, var321);
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var325);
            }
            var318 = (SubLObject)module0597.T;
            var319 = var320;
            var320 = module0035.f2225(var319, var321);
            var321 = (SubLObject)module0597.NIL;
            var322 = Sequences.length(var320);
        }
        var277 = var320;
        return var277;
    }
    
    public static SubLObject f36641(final SubLObject var297, final SubLObject var273, SubLObject var3) {
        if (var3 == module0597.UNPROVIDED) {
            var3 = (SubLObject)module0597.NIL;
        }
        SubLObject var298 = var273;
        SubLObject var299 = var297;
        SubLObject var300 = (SubLObject)module0597.NIL;
        var300 = var299.first();
        while (module0597.NIL != var299) {
            final SubLObject var301 = module0256.f16572(var300, var273, var3, (SubLObject)module0597.UNPROVIDED);
            final SubLObject var302 = f36640(var301, var3);
            var298 = module0076.f5292(var298, var302);
            var299 = var299.rest();
            var300 = var299.first();
        }
        return var298;
    }
    
    public static SubLObject f36634(final SubLObject var319, SubLObject var199, SubLObject var3) {
        if (var199 == module0597.UNPROVIDED) {
            var199 = (SubLObject)module0597.$ic173$;
        }
        if (var3 == module0597.UNPROVIDED) {
            var3 = (SubLObject)module0597.NIL;
        }
        final SubLObject var320 = Mapping.mapcar((SubLObject)module0597.$ic193$, var319);
        final SubLObject var321 = var199;
        if (var321.eql((SubLObject)module0597.$ic195$)) {
            return var320;
        }
        if (var321.eql((SubLObject)module0597.$ic173$)) {
            return module0256.f16529(f36637(var320, var3), var3, (SubLObject)module0597.UNPROVIDED);
        }
        if (var321.eql((SubLObject)module0597.$ic196$)) {
            return module0256.f16538(f36640(var320, var3), var3, (SubLObject)module0597.UNPROVIDED);
        }
        if (var321.eql((SubLObject)module0597.$ic197$)) {
            return f36642(var320, var3);
        }
        if (var321.eql((SubLObject)module0597.$ic198$)) {
            return f36643(var320, var3);
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36642(final SubLObject var273, SubLObject var3) {
        if (var3 == module0597.UNPROVIDED) {
            var3 = (SubLObject)module0597.NIL;
        }
        SubLObject var274 = (SubLObject)module0597.NIL;
        SubLObject var275;
        SubLObject var276;
        SubLObject var277;
        SubLObject var278;
        SubLObject var279;
        for (var275 = (SubLObject)module0597.NIL, var276 = (SubLObject)module0597.NIL, var277 = (SubLObject)module0597.NIL, var278 = (SubLObject)module0597.NIL, var279 = (SubLObject)module0597.NIL, var275 = f36640(f36637(var273, var3), var3), var276 = module0256.f16529(var275, var3, (SubLObject)module0597.UNPROVIDED), var277 = module0256.f16538(var275, var3, (SubLObject)module0597.UNPROVIDED), var278 = conses_high.copy_list(var276), var279 = conses_high.copy_list(var277); module0597.NIL != var275; var275 = module0035.f2225(module0035.f2225(var275, var276), var277), var276 = module0256.f16529(var275, var3, (SubLObject)module0597.UNPROVIDED), var277 = module0256.f16538(var275, var3, (SubLObject)module0597.UNPROVIDED), var278 = module0256.f16538(ConsesLow.nconc(var278, conses_high.copy_list(var276)), var3, (SubLObject)module0597.UNPROVIDED), var279 = module0256.f16529(ConsesLow.nconc(var279, conses_high.copy_list(var277)), var3, (SubLObject)module0597.UNPROVIDED)) {}
        var274 = module0256.f16529(module0035.f2272(ConsesLow.append(var278, var279)), var3, (SubLObject)module0597.UNPROVIDED);
        return var274;
    }
    
    public static SubLObject f36643(final SubLObject var273, SubLObject var3) {
        if (var3 == module0597.UNPROVIDED) {
            var3 = (SubLObject)module0597.NIL;
        }
        SubLObject var274 = (SubLObject)module0597.NIL;
        SubLObject var275 = (SubLObject)module0597.NIL;
        SubLObject var276;
        SubLObject var277;
        SubLObject var278;
        for (var276 = (SubLObject)module0597.NIL, var277 = (SubLObject)module0597.NIL, var278 = (SubLObject)module0597.NIL, var276 = f36640(f36637(var273, var3), var3), var277 = module0256.f16529(var276, var3, (SubLObject)module0597.UNPROVIDED), var278 = module0256.f16538(var276, var3, (SubLObject)module0597.UNPROVIDED); module0597.NIL != var277 || module0597.NIL != var278; var277 = module0256.f16529(var276, var3, (SubLObject)module0597.UNPROVIDED), var278 = module0256.f16538(var276, var3, (SubLObject)module0597.UNPROVIDED)) {
            var274 = ConsesLow.nconc(var274, ConsesLow.nconc(conses_high.copy_list(var277), conses_high.copy_list(var278)));
            var275 = module0035.f2225(var276, var274);
            var276 = f36641(var278, f36638(var277, var275, var3), var3);
        }
        return module0035.f2272(var274);
    }
    
    public static SubLObject f36644(final SubLObject var320, SubLObject var3) {
        if (var3 == module0597.UNPROVIDED) {
            var3 = (SubLObject)module0597.NIL;
        }
        final SubLThread var321 = SubLProcess.currentSubLThread();
        final SubLObject var322 = Sequences.length(var320);
        final SubLObject var323 = Hashtables.make_hash_table(var322, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
        final SubLObject var324 = Hashtables.make_hash_table(var322, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
        SubLObject var325 = var320;
        SubLObject var326 = (SubLObject)module0597.NIL;
        var326 = var325.first();
        while (module0597.NIL != var325) {
            SubLObject var327 = var326;
            final SubLObject var328 = (SubLObject)((module0597.$ic134$ == module0597.$ic175$) ? module0597.$ic176$ : module0597.$ic177$);
            final SubLObject var329 = module0056.f4145(var328);
            final SubLObject var330 = module0139.$g1635$.currentBinding(var321);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var321);
                final SubLObject var331 = var3;
                final SubLObject var7_330 = module0147.$g2095$.currentBinding(var321);
                final SubLObject var332 = module0147.$g2094$.currentBinding(var321);
                final SubLObject var333 = module0147.$g2096$.currentBinding(var321);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var331), var321);
                    module0147.$g2094$.bind(module0147.f9546(var331), var321);
                    module0147.$g2096$.bind(module0147.f9549(var331), var321);
                    final SubLObject var334 = (SubLObject)module0597.NIL;
                    final SubLObject var7_331 = module0141.$g1714$.currentBinding(var321);
                    final SubLObject var8_332 = module0141.$g1715$.currentBinding(var321);
                    try {
                        module0141.$g1714$.bind((module0597.NIL != var334) ? var334 : module0141.f9283(), var321);
                        module0141.$g1715$.bind((SubLObject)((module0597.NIL != var334) ? module0597.$ic178$ : module0141.$g1715$.getDynamicValue(var321)), var321);
                        if (module0597.NIL != var334 && module0597.NIL != module0136.f8864() && module0597.NIL == module0141.f9279(var334)) {
                            final SubLObject var335 = module0136.$g1591$.getDynamicValue(var321);
                            if (var335.eql((SubLObject)module0597.$ic179$)) {
                                module0136.f8870((SubLObject)module0597.ONE_INTEGER, (SubLObject)module0597.$ic180$, var334, (SubLObject)module0597.$ic181$, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                            }
                            else if (var335.eql((SubLObject)module0597.$ic182$)) {
                                module0136.f8871((SubLObject)module0597.ONE_INTEGER, (SubLObject)module0597.$ic152$, (SubLObject)module0597.$ic180$, var334, (SubLObject)module0597.$ic181$, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                            }
                            else if (var335.eql((SubLObject)module0597.$ic183$)) {
                                Errors.warn((SubLObject)module0597.$ic180$, var334, (SubLObject)module0597.$ic181$);
                            }
                            else {
                                Errors.warn((SubLObject)module0597.$ic184$, module0136.$g1591$.getDynamicValue(var321));
                                Errors.cerror((SubLObject)module0597.$ic152$, (SubLObject)module0597.$ic180$, var334, (SubLObject)module0597.$ic181$);
                            }
                        }
                        final SubLObject var7_332 = module0141.$g1670$.currentBinding(var321);
                        final SubLObject var8_333 = module0141.$g1671$.currentBinding(var321);
                        final SubLObject var9_335 = module0141.$g1672$.currentBinding(var321);
                        final SubLObject var336 = module0141.$g1674$.currentBinding(var321);
                        final SubLObject var337 = module0137.$g1605$.currentBinding(var321);
                        try {
                            module0141.$g1670$.bind(module0137.f8955(module0597.$ic126$), var321);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0597.$ic126$)), var321);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0597.$ic126$)), var321);
                            module0141.$g1674$.bind((SubLObject)module0597.NIL, var321);
                            module0137.$g1605$.bind(module0137.f8955(module0597.$ic126$), var321);
                            if (module0597.NIL != module0136.f8865() || module0597.NIL != module0244.f15795(var326, module0137.f8955((SubLObject)module0597.UNPROVIDED))) {
                                final SubLObject var7_333 = module0141.$g1677$.currentBinding(var321);
                                final SubLObject var8_334 = module0138.$g1619$.currentBinding(var321);
                                final SubLObject var9_336 = module0141.$g1674$.currentBinding(var321);
                                try {
                                    module0141.$g1677$.bind(module0141.f9208(), var321);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0597.$ic126$)), var321);
                                    module0141.$g1674$.bind((SubLObject)module0597.NIL, var321);
                                    module0249.f16055(var327, (SubLObject)module0597.UNPROVIDED);
                                    while (module0597.NIL != var327) {
                                        final SubLObject var338 = var327;
                                        if (module0597.NIL != module0004.f104(var338, var320, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED) && !var338.eql(var326)) {
                                            module0030.f1599(var338, var326, var323);
                                            module0030.f1599(var326, var338, var324);
                                        }
                                        SubLObject var28_339;
                                        final SubLObject var339 = var28_339 = module0200.f12443(module0137.f8955(module0597.$ic126$));
                                        SubLObject var340 = (SubLObject)module0597.NIL;
                                        var340 = var28_339.first();
                                        while (module0597.NIL != var28_339) {
                                            final SubLObject var7_334 = module0137.$g1605$.currentBinding(var321);
                                            final SubLObject var8_335 = module0141.$g1674$.currentBinding(var321);
                                            try {
                                                module0137.$g1605$.bind(var340, var321);
                                                module0141.$g1674$.bind((SubLObject)((module0597.NIL != module0141.f9205((SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0597.NIL == module0141.$g1674$.getDynamicValue(var321)) : module0141.$g1674$.getDynamicValue(var321)), var321);
                                                final SubLObject var341 = module0228.f15229(var327);
                                                if (module0597.NIL != module0138.f8992(var341)) {
                                                    final SubLObject var342 = module0242.f15664(var341, module0137.f8955((SubLObject)module0597.UNPROVIDED));
                                                    if (module0597.NIL != var342) {
                                                        final SubLObject var343 = module0245.f15834(var342, module0138.f8979(), module0137.f8955((SubLObject)module0597.UNPROVIDED));
                                                        if (module0597.NIL != var343) {
                                                            SubLObject var344;
                                                            for (var344 = module0066.f4838(module0067.f4891(var343)); module0597.NIL == module0066.f4841(var344); var344 = module0066.f4840(var344)) {
                                                                var321.resetMultipleValues();
                                                                final SubLObject var238_342 = module0066.f4839(var344);
                                                                final SubLObject var345 = var321.secondMultipleValue();
                                                                var321.resetMultipleValues();
                                                                if (module0597.NIL != module0147.f9507(var238_342)) {
                                                                    final SubLObject var7_335 = module0138.$g1623$.currentBinding(var321);
                                                                    try {
                                                                        module0138.$g1623$.bind(var238_342, var321);
                                                                        SubLObject var237_344;
                                                                        for (var237_344 = module0066.f4838(module0067.f4891(var345)); module0597.NIL == module0066.f4841(var237_344); var237_344 = module0066.f4840(var237_344)) {
                                                                            var321.resetMultipleValues();
                                                                            final SubLObject var346 = module0066.f4839(var237_344);
                                                                            final SubLObject var347 = var321.secondMultipleValue();
                                                                            var321.resetMultipleValues();
                                                                            if (module0597.NIL != module0141.f9289(var346)) {
                                                                                final SubLObject var7_336 = module0138.$g1624$.currentBinding(var321);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var346, var321);
                                                                                    final SubLObject var348 = var347;
                                                                                    if (module0597.NIL != module0077.f5302(var348)) {
                                                                                        final SubLObject var349 = module0077.f5333(var348);
                                                                                        SubLObject var350;
                                                                                        SubLObject var351;
                                                                                        SubLObject var352;
                                                                                        for (var350 = module0032.f1741(var349), var351 = (SubLObject)module0597.NIL, var351 = module0032.f1742(var350, var349); module0597.NIL == module0032.f1744(var350, var351); var351 = module0032.f1743(var351)) {
                                                                                            var352 = module0032.f1745(var350, var351);
                                                                                            if (module0597.NIL != module0032.f1746(var351, var352) && module0597.NIL == module0249.f16059(var352, (SubLObject)module0597.UNPROVIDED)) {
                                                                                                module0249.f16055(var352, (SubLObject)module0597.UNPROVIDED);
                                                                                                module0056.f4149(var352, var329);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var348.isList()) {
                                                                                        SubLObject var353 = var348;
                                                                                        SubLObject var354 = (SubLObject)module0597.NIL;
                                                                                        var354 = var353.first();
                                                                                        while (module0597.NIL != var353) {
                                                                                            if (module0597.NIL == module0249.f16059(var354, (SubLObject)module0597.UNPROVIDED)) {
                                                                                                module0249.f16055(var354, (SubLObject)module0597.UNPROVIDED);
                                                                                                module0056.f4149(var354, var329);
                                                                                            }
                                                                                            var353 = var353.rest();
                                                                                            var354 = var353.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0597.$ic187$, var348);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var7_336, var321);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var237_344);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var7_335, var321);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var344);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0597.FIVE_INTEGER, (SubLObject)module0597.$ic188$, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0597.NIL != module0155.f9785(var341, (SubLObject)module0597.UNPROVIDED)) {
                                                    SubLObject var28_340;
                                                    final SubLObject var355 = var28_340 = ((module0597.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var321), module0137.f8955((SubLObject)module0597.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var321), module0137.f8955((SubLObject)module0597.UNPROVIDED)));
                                                    SubLObject var356 = (SubLObject)module0597.NIL;
                                                    var356 = var28_340.first();
                                                    while (module0597.NIL != var28_340) {
                                                        final SubLObject var7_337 = module0138.$g1625$.currentBinding(var321);
                                                        try {
                                                            module0138.$g1625$.bind(var356, var321);
                                                            final SubLObject var358;
                                                            final SubLObject var357 = var358 = Functions.funcall(var356, var341);
                                                            if (module0597.NIL != module0077.f5302(var358)) {
                                                                final SubLObject var359 = module0077.f5333(var358);
                                                                SubLObject var360;
                                                                SubLObject var361;
                                                                SubLObject var362;
                                                                for (var360 = module0032.f1741(var359), var361 = (SubLObject)module0597.NIL, var361 = module0032.f1742(var360, var359); module0597.NIL == module0032.f1744(var360, var361); var361 = module0032.f1743(var361)) {
                                                                    var362 = module0032.f1745(var360, var361);
                                                                    if (module0597.NIL != module0032.f1746(var361, var362) && module0597.NIL == module0249.f16059(var362, (SubLObject)module0597.UNPROVIDED)) {
                                                                        module0249.f16055(var362, (SubLObject)module0597.UNPROVIDED);
                                                                        module0056.f4149(var362, var329);
                                                                    }
                                                                }
                                                            }
                                                            else if (var358.isList()) {
                                                                SubLObject var363 = var358;
                                                                SubLObject var364 = (SubLObject)module0597.NIL;
                                                                var364 = var363.first();
                                                                while (module0597.NIL != var363) {
                                                                    if (module0597.NIL == module0249.f16059(var364, (SubLObject)module0597.UNPROVIDED)) {
                                                                        module0249.f16055(var364, (SubLObject)module0597.UNPROVIDED);
                                                                        module0056.f4149(var364, var329);
                                                                    }
                                                                    var363 = var363.rest();
                                                                    var364 = var363.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0597.$ic187$, var358);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var7_337, var321);
                                                        }
                                                        var28_340 = var28_340.rest();
                                                        var356 = var28_340.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var8_335, var321);
                                                module0137.$g1605$.rebind(var7_334, var321);
                                            }
                                            var28_339 = var28_339.rest();
                                            var340 = var28_339.first();
                                        }
                                        var327 = module0056.f4150(var329);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var9_336, var321);
                                    module0138.$g1619$.rebind(var8_334, var321);
                                    module0141.$g1677$.rebind(var7_333, var321);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0597.TWO_INTEGER, (SubLObject)module0597.$ic189$, var326, module0244.f15748(module0137.f8955((SubLObject)module0597.UNPROVIDED)), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var337, var321);
                            module0141.$g1674$.rebind(var336, var321);
                            module0141.$g1672$.rebind(var9_335, var321);
                            module0141.$g1671$.rebind(var8_333, var321);
                            module0141.$g1670$.rebind(var7_332, var321);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var8_332, var321);
                        module0141.$g1714$.rebind(var7_331, var321);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var333, var321);
                    module0147.$g2094$.rebind(var332, var321);
                    module0147.$g2095$.rebind(var7_330, var321);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var321));
            }
            finally {
                module0139.$g1635$.rebind(var330, var321);
            }
            var325 = var325.rest();
            var326 = var325.first();
        }
        var325 = var320;
        var326 = (SubLObject)module0597.NIL;
        var326 = var325.first();
        while (module0597.NIL != var325) {
            final SubLObject var365 = Sequences.length(Hashtables.gethash(var326, var323, (SubLObject)module0597.UNPROVIDED));
            final SubLObject var366 = Sequences.length(Hashtables.gethash(var326, var324, (SubLObject)module0597.UNPROVIDED));
            print_high.print((SubLObject)ConsesLow.list(var326, Numbers.add(var365, var366), var365, var366), (SubLObject)module0597.UNPROVIDED);
            var325 = var325.rest();
            var326 = var325.first();
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36645(final SubLObject var198, final SubLObject var208, SubLObject var3, SubLObject var201) {
        if (var3 == module0597.UNPROVIDED) {
            var3 = (SubLObject)module0597.NIL;
        }
        if (var201 == module0597.UNPROVIDED) {
            var201 = (SubLObject)module0597.$ic199$;
        }
        final SubLThread var209 = SubLProcess.currentSubLThread();
        SubLObject var210 = (SubLObject)module0597.NIL;
        final SubLObject var211 = var3;
        final SubLObject var212 = module0147.$g2094$.currentBinding(var209);
        final SubLObject var213 = module0147.$g2095$.currentBinding(var209);
        try {
            module0147.$g2094$.bind(module0147.f9531(var211), var209);
            module0147.$g2095$.bind(module0147.f9534(var211), var209);
            final SubLObject var214 = module0139.f9008();
            final SubLObject var7_350 = module0139.$g1630$.currentBinding(var209);
            final SubLObject var8_351 = module0139.$g1659$.currentBinding(var209);
            try {
                module0139.$g1630$.bind((SubLObject)module0597.NIL, var209);
                module0139.$g1659$.bind(module0139.f9007(), var209);
                final SubLObject var7_351 = module0139.$g1638$.currentBinding(var209);
                final SubLObject var8_352 = module0139.$g1630$.currentBinding(var209);
                final SubLObject var215 = module0018.$g584$.currentBinding(var209);
                try {
                    module0139.$g1638$.bind(module0139.$g1659$.getDynamicValue(var209), var209);
                    module0139.$g1630$.bind(var214, var209);
                    module0018.$g584$.bind((SubLObject)module0597.NIL, var209);
                    final SubLObject var216 = f36633(var208, var201);
                    SubLObject var217 = var198;
                    final SubLObject var218 = (SubLObject)module0597.$ic177$;
                    final SubLObject var219 = module0056.f4145(var218);
                    final SubLObject var7_352 = module0139.$g1635$.currentBinding(var209);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var209);
                        final SubLObject var220 = (SubLObject)module0597.NIL;
                        final SubLObject var7_353 = module0141.$g1714$.currentBinding(var209);
                        final SubLObject var8_353 = module0141.$g1715$.currentBinding(var209);
                        try {
                            module0141.$g1714$.bind((module0597.NIL != var220) ? var220 : module0141.f9283(), var209);
                            module0141.$g1715$.bind((SubLObject)((module0597.NIL != var220) ? module0597.$ic178$ : module0141.$g1715$.getDynamicValue(var209)), var209);
                            if (module0597.NIL != var220 && module0597.NIL != module0136.f8864() && module0597.NIL == module0141.f9279(var220)) {
                                final SubLObject var221 = module0136.$g1591$.getDynamicValue(var209);
                                if (var221.eql((SubLObject)module0597.$ic179$)) {
                                    module0136.f8870((SubLObject)module0597.ONE_INTEGER, (SubLObject)module0597.$ic180$, var220, (SubLObject)module0597.$ic181$, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                                }
                                else if (var221.eql((SubLObject)module0597.$ic182$)) {
                                    module0136.f8871((SubLObject)module0597.ONE_INTEGER, (SubLObject)module0597.$ic152$, (SubLObject)module0597.$ic180$, var220, (SubLObject)module0597.$ic181$, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                                }
                                else if (var221.eql((SubLObject)module0597.$ic183$)) {
                                    Errors.warn((SubLObject)module0597.$ic180$, var220, (SubLObject)module0597.$ic181$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0597.$ic184$, module0136.$g1591$.getDynamicValue(var209));
                                    Errors.cerror((SubLObject)module0597.$ic152$, (SubLObject)module0597.$ic180$, var220, (SubLObject)module0597.$ic181$);
                                }
                            }
                            final SubLObject var7_354 = module0141.$g1670$.currentBinding(var209);
                            final SubLObject var8_354 = module0141.$g1671$.currentBinding(var209);
                            final SubLObject var9_359 = module0141.$g1672$.currentBinding(var209);
                            final SubLObject var222 = module0141.$g1674$.currentBinding(var209);
                            final SubLObject var223 = module0137.$g1605$.currentBinding(var209);
                            try {
                                module0141.$g1670$.bind(module0137.f8955(module0597.$ic126$), var209);
                                module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0597.$ic126$)), var209);
                                module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0597.$ic126$)), var209);
                                module0141.$g1674$.bind((SubLObject)module0597.NIL, var209);
                                module0137.$g1605$.bind(module0137.f8955(module0597.$ic126$), var209);
                                if (module0597.NIL != module0136.f8865() || module0597.NIL != module0244.f15795(var198, module0137.f8955((SubLObject)module0597.UNPROVIDED))) {
                                    final SubLObject var7_355 = module0141.$g1677$.currentBinding(var209);
                                    final SubLObject var8_355 = module0138.$g1619$.currentBinding(var209);
                                    final SubLObject var9_360 = module0141.$g1674$.currentBinding(var209);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9208(), var209);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0597.$ic126$)), var209);
                                        module0141.$g1674$.bind((SubLObject)module0597.NIL, var209);
                                        module0249.f16055(var217, (SubLObject)module0597.UNPROVIDED);
                                        while (module0597.NIL != var217) {
                                            final SubLObject var224 = var217;
                                            SubLObject var225 = var216;
                                            SubLObject var226 = (SubLObject)module0597.NIL;
                                            var226 = var225.first();
                                            while (module0597.NIL != var225) {
                                                final SubLObject var7_356 = module0018.$g585$.currentBinding(var209);
                                                final SubLObject var8_356 = module0018.$g589$.currentBinding(var209);
                                                final SubLObject var9_361 = module0018.$g590$.currentBinding(var209);
                                                try {
                                                    module0018.$g585$.bind(var226.first(), var209);
                                                    module0018.$g589$.bind(conses_high.second(var226), var209);
                                                    module0018.$g590$.bind(conses_high.third(var226), var209);
                                                    module0219.f14477((SubLObject)module0597.$ic200$, var224, module0018.$g589$.getDynamicValue(var209), module0018.$g585$.getDynamicValue(var209), (SubLObject)module0597.$ic186$, (SubLObject)module0597.UNPROVIDED);
                                                }
                                                finally {
                                                    module0018.$g590$.rebind(var9_361, var209);
                                                    module0018.$g589$.rebind(var8_356, var209);
                                                    module0018.$g585$.rebind(var7_356, var209);
                                                }
                                                var225 = var225.rest();
                                                var226 = var225.first();
                                            }
                                            final SubLObject var227 = var225 = module0200.f12443(module0137.f8955(module0597.$ic126$));
                                            SubLObject var228 = (SubLObject)module0597.NIL;
                                            var228 = var225.first();
                                            while (module0597.NIL != var225) {
                                                final SubLObject var7_357 = module0137.$g1605$.currentBinding(var209);
                                                final SubLObject var8_357 = module0141.$g1674$.currentBinding(var209);
                                                try {
                                                    module0137.$g1605$.bind(var228, var209);
                                                    module0141.$g1674$.bind((SubLObject)((module0597.NIL != module0141.f9205((SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0597.NIL == module0141.$g1674$.getDynamicValue(var209)) : module0141.$g1674$.getDynamicValue(var209)), var209);
                                                    final SubLObject var229 = module0228.f15229(var217);
                                                    if (module0597.NIL != module0138.f8992(var229)) {
                                                        final SubLObject var230 = module0242.f15664(var229, module0137.f8955((SubLObject)module0597.UNPROVIDED));
                                                        if (module0597.NIL != var230) {
                                                            final SubLObject var231 = module0245.f15834(var230, module0138.f8979(), module0137.f8955((SubLObject)module0597.UNPROVIDED));
                                                            if (module0597.NIL != var231) {
                                                                SubLObject var232;
                                                                for (var232 = module0066.f4838(module0067.f4891(var231)); module0597.NIL == module0066.f4841(var232); var232 = module0066.f4840(var232)) {
                                                                    var209.resetMultipleValues();
                                                                    final SubLObject var238_368 = module0066.f4839(var232);
                                                                    final SubLObject var233 = var209.secondMultipleValue();
                                                                    var209.resetMultipleValues();
                                                                    if (module0597.NIL != module0147.f9507(var238_368)) {
                                                                        final SubLObject var7_358 = module0138.$g1623$.currentBinding(var209);
                                                                        try {
                                                                            module0138.$g1623$.bind(var238_368, var209);
                                                                            SubLObject var237_370;
                                                                            for (var237_370 = module0066.f4838(module0067.f4891(var233)); module0597.NIL == module0066.f4841(var237_370); var237_370 = module0066.f4840(var237_370)) {
                                                                                var209.resetMultipleValues();
                                                                                final SubLObject var234 = module0066.f4839(var237_370);
                                                                                final SubLObject var235 = var209.secondMultipleValue();
                                                                                var209.resetMultipleValues();
                                                                                if (module0597.NIL != module0141.f9289(var234)) {
                                                                                    final SubLObject var7_359 = module0138.$g1624$.currentBinding(var209);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var234, var209);
                                                                                        final SubLObject var236 = var235;
                                                                                        if (module0597.NIL != module0077.f5302(var236)) {
                                                                                            final SubLObject var237 = module0077.f5333(var236);
                                                                                            SubLObject var238;
                                                                                            SubLObject var239;
                                                                                            SubLObject var240;
                                                                                            for (var238 = module0032.f1741(var237), var239 = (SubLObject)module0597.NIL, var239 = module0032.f1742(var238, var237); module0597.NIL == module0032.f1744(var238, var239); var239 = module0032.f1743(var239)) {
                                                                                                var240 = module0032.f1745(var238, var239);
                                                                                                if (module0597.NIL != module0032.f1746(var239, var240) && module0597.NIL == module0249.f16059(var240, (SubLObject)module0597.UNPROVIDED)) {
                                                                                                    module0249.f16055(var240, (SubLObject)module0597.UNPROVIDED);
                                                                                                    module0056.f4149(var240, var219);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var236.isList()) {
                                                                                            SubLObject var241 = var236;
                                                                                            SubLObject var242 = (SubLObject)module0597.NIL;
                                                                                            var242 = var241.first();
                                                                                            while (module0597.NIL != var241) {
                                                                                                if (module0597.NIL == module0249.f16059(var242, (SubLObject)module0597.UNPROVIDED)) {
                                                                                                    module0249.f16055(var242, (SubLObject)module0597.UNPROVIDED);
                                                                                                    module0056.f4149(var242, var219);
                                                                                                }
                                                                                                var241 = var241.rest();
                                                                                                var242 = var241.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0597.$ic187$, var236);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var7_359, var209);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var237_370);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var7_358, var209);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var232);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0597.FIVE_INTEGER, (SubLObject)module0597.$ic188$, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0597.NIL != module0155.f9785(var229, (SubLObject)module0597.UNPROVIDED)) {
                                                        SubLObject var28_372;
                                                        final SubLObject var243 = var28_372 = ((module0597.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var209), module0137.f8955((SubLObject)module0597.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var209), module0137.f8955((SubLObject)module0597.UNPROVIDED)));
                                                        SubLObject var244 = (SubLObject)module0597.NIL;
                                                        var244 = var28_372.first();
                                                        while (module0597.NIL != var28_372) {
                                                            final SubLObject var7_360 = module0138.$g1625$.currentBinding(var209);
                                                            try {
                                                                module0138.$g1625$.bind(var244, var209);
                                                                final SubLObject var246;
                                                                final SubLObject var245 = var246 = Functions.funcall(var244, var229);
                                                                if (module0597.NIL != module0077.f5302(var246)) {
                                                                    final SubLObject var247 = module0077.f5333(var246);
                                                                    SubLObject var248;
                                                                    SubLObject var249;
                                                                    SubLObject var250;
                                                                    for (var248 = module0032.f1741(var247), var249 = (SubLObject)module0597.NIL, var249 = module0032.f1742(var248, var247); module0597.NIL == module0032.f1744(var248, var249); var249 = module0032.f1743(var249)) {
                                                                        var250 = module0032.f1745(var248, var249);
                                                                        if (module0597.NIL != module0032.f1746(var249, var250) && module0597.NIL == module0249.f16059(var250, (SubLObject)module0597.UNPROVIDED)) {
                                                                            module0249.f16055(var250, (SubLObject)module0597.UNPROVIDED);
                                                                            module0056.f4149(var250, var219);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var246.isList()) {
                                                                    SubLObject var251 = var246;
                                                                    SubLObject var252 = (SubLObject)module0597.NIL;
                                                                    var252 = var251.first();
                                                                    while (module0597.NIL != var251) {
                                                                        if (module0597.NIL == module0249.f16059(var252, (SubLObject)module0597.UNPROVIDED)) {
                                                                            module0249.f16055(var252, (SubLObject)module0597.UNPROVIDED);
                                                                            module0056.f4149(var252, var219);
                                                                        }
                                                                        var251 = var251.rest();
                                                                        var252 = var251.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0597.$ic187$, var246);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var7_360, var209);
                                                            }
                                                            var28_372 = var28_372.rest();
                                                            var244 = var28_372.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var8_357, var209);
                                                    module0137.$g1605$.rebind(var7_357, var209);
                                                }
                                                var225 = var225.rest();
                                                var228 = var225.first();
                                            }
                                            var217 = module0056.f4150(var219);
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var9_360, var209);
                                        module0138.$g1619$.rebind(var8_355, var209);
                                        module0141.$g1677$.rebind(var7_355, var209);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0597.TWO_INTEGER, (SubLObject)module0597.$ic189$, var198, module0244.f15748(module0137.f8955((SubLObject)module0597.UNPROVIDED)), (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var223, var209);
                                module0141.$g1674$.rebind(var222, var209);
                                module0141.$g1672$.rebind(var9_359, var209);
                                module0141.$g1671$.rebind(var8_354, var209);
                                module0141.$g1670$.rebind(var7_354, var209);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var8_353, var209);
                            module0141.$g1714$.rebind(var7_353, var209);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var209));
                    }
                    finally {
                        module0139.$g1635$.rebind(var7_352, var209);
                    }
                    var210 = module0018.$g584$.getDynamicValue(var209);
                }
                finally {
                    module0018.$g584$.rebind(var215, var209);
                    module0139.$g1630$.rebind(var8_352, var209);
                    module0139.$g1638$.rebind(var7_351, var209);
                }
                module0139.f9011(module0139.$g1659$.getDynamicValue(var209));
            }
            finally {
                module0139.$g1659$.rebind(var8_351, var209);
                module0139.$g1630$.rebind(var7_350, var209);
            }
        }
        finally {
            module0147.$g2095$.rebind(var213, var209);
            module0147.$g2094$.rebind(var212, var209);
        }
        return module0260.f17085(var210, var3, (SubLObject)module0597.UNPROVIDED);
    }
    
    public static SubLObject f36646(final SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        final SubLObject var45 = module0178.f11331(var43, module0018.$g589$.getDynamicValue(var44));
        final SubLObject var46 = module0178.f11331(var43, module0018.$g590$.getDynamicValue(var44));
        if (module0597.NIL != module0173.f10955(var45) && module0597.NIL != module0173.f10955(var46) && module0597.NIL == module0251.f16239(var46, module0139.$g1638$.getDynamicValue(var44)) && module0597.NIL != module0269.f17706(var46)) {
            module0018.$g584$.setDynamicValue((SubLObject)ConsesLow.cons(var46, module0018.$g584$.getDynamicValue(var44)), var44);
            print_high.print(var43, (SubLObject)module0597.UNPROVIDED);
            module0251.f16232(module0137.f8955(module0597.$ic194$), var46, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED);
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36633(final SubLObject var208, SubLObject var201) {
        if (var201 == module0597.UNPROVIDED) {
            var201 = (SubLObject)module0597.$ic199$;
        }
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36647() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36516", "S#40251", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36528", "S#40252", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36529", "S#40253", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36530", "S#40254", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36521", "S#40255", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36532", "S#40256", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36536", "S#40257", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36538", "S#40258", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36533", "S#40259", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36542", "S#40260", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36544", "S#40261", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36543", "S#40262", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36548", "S#40263", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36547", "S#40264", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36553", "S#40265", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36556", "S#40266", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36552", "S#40267", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36555", "S#40268", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36546", "S#40269", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36545", "S#40270", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36554", "S#40271", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36550", "S#40272", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36558", "S#40273", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36559", "S#40274", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36549", "S#40275", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36520", "S#40276", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36562", "S#679", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36566", "S#681", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36565", "S#40277", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36567", "S#683", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36580", "S#685", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36588", "S#40278", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36582", "S#40279", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36583", "S#40280", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36585", "S#40281", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36586", "S#40282", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36584", "S#40283", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36573", "S#40284", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36569", "S#40285", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36570", "S#40286", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36571", "S#40287", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36575", "S#40288", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36576", "S#40289", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36568", "S#40290", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36574", "S#40291", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36577", "S#40292", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36572", "S#40293", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36591", "S#40294", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36581", "S#40295", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36593", "S#40296", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36592", "S#40297", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36594", "S#687", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36560", "S#40298", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36597", "S#40299", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36590", "S#40300", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36598", "S#677", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36589", "S#40301", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36517", "S#40302", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36527", "S#40303", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36600", "S#40304", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36602", "S#40305", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36601", "S#40306", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36519", "S#40307", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36522", "S#40308", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36603", "S#40309", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36604", "S#40310", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36561", "S#40311", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36599", "S#40312", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36540", "S#40313", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36551", "S#40314", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36596", "S#40315", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36595", "S#40316", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36563", "S#40317", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36605", "S#40318", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36535", "S#40319", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36606", "S#40320", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36557", "S#40321", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36607", "S#40322", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36564", "S#40323", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36539", "S#40324", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36608", "S#40325", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36534", "S#40326", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36609", "S#40327", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36518", "S#40328", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36610", "S#40329", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36537", "S#40330", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36611", "S#40331", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36612", "S#40332", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36613", "S#40333", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36541", "S#40334", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36579", "S#40335", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36587", "S#40336", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36578", "S#40337", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36614", "S#40338", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36615", "S#40339", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36616", "S#40340", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36617", "S#40341", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36618", "S#40342", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36619", "S#40343", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36620", "S#40344", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36621", "S#40345", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36531", "S#40346", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36523", "S#40347", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36526", "S#40348", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36525", "S#40349", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36524", "S#40350", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36622", "S#40351", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36623", "S#40352", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36624", "S#40353", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36625", "S#40354", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36626", "S#40355", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36627", "S#40356", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36628", "S#18405", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36629", "S#40357", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36630", "S#40358", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36631", "S#40359", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36632", "S#40360", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36635", "S#40361", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36636", "S#40362", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36637", "S#40363", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36638", "S#40364", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36639", "S#40365", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36640", "S#40366", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36641", "S#40367", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36634", "S#40368", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36642", "S#40369", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36643", "S#40370", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36644", "S#40371", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36645", "S#40372", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36646", "S#40373", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0597", "f36633", "S#40374", 1, 1, false);
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36648() {
        module0597.$g4560$ = SubLFiles.defparameter("S#40375", (SubLObject)module0597.NIL);
        module0597.$g4561$ = SubLFiles.defparameter("S#40376", (SubLObject)module0597.$ic1$);
        module0597.$g4562$ = SubLFiles.defparameter("S#40377", (SubLObject)module0597.NIL);
        module0597.$g4563$ = SubLFiles.defparameter("S#40378", Symbols.symbol_function((SubLObject)module0597.EQL));
        module0597.$g4564$ = SubLFiles.defparameter("S#40379", Symbols.symbol_function((SubLObject)module0597.$ic5$));
        module0597.$g4565$ = SubLFiles.defparameter("S#40380", Symbols.symbol_function((SubLObject)module0597.$ic7$));
        module0597.$g4566$ = SubLFiles.defparameter("S#40381", (SubLObject)module0597.NIL);
        module0597.$g4567$ = SubLFiles.defparameter("S#40382", (SubLObject)module0597.T);
        module0597.$g4568$ = SubLFiles.defparameter("S#40383", (SubLObject)module0597.NIL);
        module0597.$g4569$ = SubLFiles.defparameter("S#40384", (SubLObject)module0597.NIL);
        module0597.$g4570$ = SubLFiles.defparameter("S#40385", (SubLObject)module0597.NIL);
        module0597.$g4571$ = SubLFiles.defparameter("S#40386", (SubLObject)module0597.$ic14$);
        module0597.$g4572$ = SubLFiles.defparameter("S#40387", (SubLObject)module0597.$ic16$);
        module0597.$g4573$ = SubLFiles.defparameter("S#40388", Symbols.symbol_function((SubLObject)module0597.IDENTITY));
        module0597.$g4574$ = SubLFiles.defparameter("S#40389", (SubLObject)module0597.NIL);
        module0597.$g4575$ = SubLFiles.defparameter("S#40390", (SubLObject)module0597.NIL);
        module0597.$g4576$ = SubLFiles.defparameter("S#40391", (SubLObject)module0597.NIL);
        module0597.$g4577$ = SubLFiles.defparameter("S#40392", (SubLObject)module0597.NIL);
        module0597.$g4578$ = SubLFiles.defparameter("S#40393", (SubLObject)module0597.NIL);
        module0597.$g4579$ = SubLFiles.defparameter("S#40394", (SubLObject)module0597.NIL);
        module0597.$g4580$ = SubLFiles.defparameter("S#40395", (SubLObject)module0597.NIL);
        module0597.$g4581$ = SubLFiles.defparameter("S#40396", (SubLObject)module0597.NIL);
        module0597.$g4582$ = SubLFiles.defparameter("S#40397", (SubLObject)module0597.NIL);
        module0597.$g4583$ = SubLFiles.defparameter("S#40398", (SubLObject)module0597.NIL);
        module0597.$g4584$ = SubLFiles.defparameter("S#40399", (SubLObject)module0597.NIL);
        module0597.$g4585$ = SubLFiles.defparameter("S#40400", (SubLObject)module0597.NIL);
        module0597.$g4586$ = SubLFiles.defparameter("S#40401", (SubLObject)module0597.NIL);
        module0597.$g4587$ = SubLFiles.defparameter("S#40402", (SubLObject)module0597.NIL);
        module0597.$g4588$ = SubLFiles.defparameter("S#40403", (SubLObject)module0597.NIL);
        module0597.$g4589$ = SubLFiles.defparameter("S#40404", (SubLObject)module0597.NIL);
        module0597.$g4590$ = SubLFiles.defparameter("S#40405", Hashtables.make_hash_table((SubLObject)module0597.$ic35$, Symbols.symbol_function((SubLObject)module0597.EQUAL), (SubLObject)module0597.UNPROVIDED));
        module0597.$g4591$ = SubLFiles.defparameter("S#40406", Hashtables.make_hash_table((SubLObject)module0597.$ic35$, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED));
        module0597.$g4592$ = SubLFiles.defparameter("S#40407", (SubLObject)module0597.T);
        module0597.$g4593$ = SubLFiles.defparameter("S#40408", (SubLObject)module0597.T);
        module0597.$g4594$ = SubLFiles.defparameter("S#40409", (SubLObject)module0597.T);
        module0597.$g4595$ = SubLFiles.defparameter("S#40410", (SubLObject)module0597.NIL);
        module0597.$g4596$ = SubLFiles.defparameter("S#40411", (SubLObject)module0597.ZERO_INTEGER);
        module0597.$g4597$ = SubLFiles.defparameter("S#40412", (SubLObject)module0597.FIVE_INTEGER);
        module0597.$g4598$ = SubLFiles.defparameter("S#40413", (SubLObject)module0597.T);
        module0597.$g4599$ = SubLFiles.defparameter("S#40414", (SubLObject)module0597.NIL);
        module0597.$g4600$ = SubLFiles.defparameter("S#40415", (SubLObject)module0597.$ic46$);
        module0597.$g4601$ = SubLFiles.defparameter("S#40416", (SubLObject)module0597.NIL);
        module0597.$g4602$ = SubLFiles.defparameter("S#40417", (SubLObject)module0597.T);
        module0597.$g4603$ = SubLFiles.defparameter("S#40418", (SubLObject)module0597.T);
        module0597.$g4604$ = SubLFiles.defparameter("S#40419", (SubLObject)module0597.T);
        module0597.$g4605$ = SubLFiles.defparameter("S#40420", (SubLObject)module0597.NIL);
        module0597.$g4606$ = SubLFiles.defparameter("S#40421", (SubLObject)module0597.NIL);
        module0597.$g4607$ = SubLFiles.defparameter("S#40422", (SubLObject)module0597.T);
        module0597.$g4608$ = SubLFiles.defparameter("S#40423", (SubLObject)module0597.NIL);
        module0597.$g4609$ = SubLFiles.defparameter("S#40424", (SubLObject)module0597.T);
        module0597.$g4610$ = SubLFiles.defparameter("S#40425", (SubLObject)module0597.NIL);
        module0597.$g4611$ = SubLFiles.defparameter("S#40426", (SubLObject)module0597.NIL);
        module0597.$g4612$ = SubLFiles.defparameter("S#40427", (SubLObject)module0597.$ic59$);
        module0597.$g4613$ = SubLFiles.defparameter("S#40428", (SubLObject)module0597.NIL);
        module0597.$g4614$ = SubLFiles.defparameter("S#40429", (SubLObject)module0597.NIL);
        module0597.$g4615$ = SubLFiles.defparameter("S#40430", (SubLObject)module0597.T);
        module0597.$g4616$ = SubLFiles.defparameter("S#40431", (SubLObject)module0597.NIL);
        module0597.$g4617$ = SubLFiles.defparameter("S#40432", (SubLObject)module0597.T);
        module0597.$g4618$ = SubLFiles.defparameter("S#40433", (SubLObject)module0597.TWENTY_INTEGER);
        module0597.$g4619$ = SubLFiles.defparameter("S#40434", (SubLObject)module0597.T);
        module0597.$g4620$ = SubLFiles.defparameter("S#40435", (SubLObject)module0597.NIL);
        module0597.$g4621$ = SubLFiles.defparameter("S#40436", (SubLObject)module0597.T);
        module0597.$g4622$ = SubLFiles.defparameter("S#40437", (SubLObject)module0597.NIL);
        module0597.$g4623$ = SubLFiles.defparameter("S#40438", (SubLObject)module0597.T);
        module0597.$g4624$ = SubLFiles.defparameter("S#40439", (SubLObject)module0597.$ic72$);
        module0597.$g4625$ = SubLFiles.defparameter("S#40440", (SubLObject)module0597.T);
        module0597.$g4626$ = SubLFiles.defparameter("S#40441", (SubLObject)module0597.NIL);
        module0597.$g4627$ = SubLFiles.defparameter("S#40442", (SubLObject)module0597.T);
        module0597.$g4628$ = SubLFiles.defparameter("S#40443", (SubLObject)module0597.NIL);
        module0597.$g4629$ = SubLFiles.defparameter("S#40444", (SubLObject)module0597.T);
        module0597.$g4630$ = SubLFiles.defparameter("S#40445", (SubLObject)module0597.$ic79$);
        module0597.$g4631$ = SubLFiles.defparameter("S#40446", (SubLObject)module0597.T);
        module0597.$g4632$ = SubLFiles.defparameter("S#40447", (SubLObject)module0597.NIL);
        module0597.$g4633$ = SubLFiles.defparameter("S#40448", (SubLObject)module0597.NIL);
        module0597.$g4634$ = SubLFiles.defparameter("S#676", (SubLObject)module0597.NIL);
        module0597.$g4635$ = SubLFiles.defparameter("S#678", (SubLObject)module0597.NIL);
        module0597.$g4636$ = SubLFiles.defparameter("S#680", (SubLObject)module0597.NIL);
        module0597.$g4637$ = SubLFiles.defparameter("S#682", (SubLObject)module0597.NIL);
        module0597.$g4638$ = SubLFiles.defparameter("S#684", (SubLObject)module0597.NIL);
        module0597.$g4639$ = SubLFiles.defparameter("S#686", (SubLObject)module0597.NIL);
        module0597.$g4640$ = SubLFiles.defparameter("S#40449", (SubLObject)module0597.NIL);
        module0597.$g4641$ = SubLFiles.defparameter("S#40450", (SubLObject)module0597.NIL);
        module0597.$g4642$ = SubLFiles.defparameter("S#40451", Hashtables.make_hash_table((SubLObject)module0597.$ic157$, (SubLObject)module0597.UNPROVIDED, (SubLObject)module0597.UNPROVIDED));
        module0597.$g4643$ = SubLFiles.defparameter("S#40452", (SubLObject)module0597.ZERO_INTEGER);
        module0597.$g4644$ = SubLFiles.defparameter("S#40453", (SubLObject)module0597.ZERO_INTEGER);
        module0597.$g4645$ = SubLFiles.defparameter("S#40454", (SubLObject)module0597.ZERO_INTEGER);
        return (SubLObject)module0597.NIL;
    }
    
    public static SubLObject f36649() {
        SubLObject var37 = (SubLObject)module0597.$ic0$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic2$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic3$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic4$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic6$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic8$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic9$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic10$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic11$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic12$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic13$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic15$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic17$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic18$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic19$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic20$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic21$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic22$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic23$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic24$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic25$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic26$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic27$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic28$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic29$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic30$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic31$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic32$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic33$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic34$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic36$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic37$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic38$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic39$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic40$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic41$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic42$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic43$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic44$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic45$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic47$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic48$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic49$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic50$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic51$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic52$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic53$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic54$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic55$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic56$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic57$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic58$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic60$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic61$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic62$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic63$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic64$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic65$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic66$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic67$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic68$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic69$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic70$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic71$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic73$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic74$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic75$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic76$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic77$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic78$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic80$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic81$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic82$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic83$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic84$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic85$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic86$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic87$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic88$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic89$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic90$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        var37 = (SubLObject)module0597.$ic91$;
        if (module0597.NIL == conses_high.member(var37, module0012.$g58$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0597.EQL), Symbols.symbol_function((SubLObject)module0597.IDENTITY))) {
            module0012.$g58$.setGlobalValue((SubLObject)ConsesLow.cons(var37, module0012.$g58$.getGlobalValue()));
        }
        return (SubLObject)module0597.NIL;
    }
    
    public void declareFunctions() {
        f36647();
    }
    
    public void initializeVariables() {
        f36648();
    }
    
    public void runTopLevelForms() {
        f36649();
    }
    
    static {
        me = (SubLFile)new module0597();
        module0597.$g4560$ = null;
        module0597.$g4561$ = null;
        module0597.$g4562$ = null;
        module0597.$g4563$ = null;
        module0597.$g4564$ = null;
        module0597.$g4565$ = null;
        module0597.$g4566$ = null;
        module0597.$g4567$ = null;
        module0597.$g4568$ = null;
        module0597.$g4569$ = null;
        module0597.$g4570$ = null;
        module0597.$g4571$ = null;
        module0597.$g4572$ = null;
        module0597.$g4573$ = null;
        module0597.$g4574$ = null;
        module0597.$g4575$ = null;
        module0597.$g4576$ = null;
        module0597.$g4577$ = null;
        module0597.$g4578$ = null;
        module0597.$g4579$ = null;
        module0597.$g4580$ = null;
        module0597.$g4581$ = null;
        module0597.$g4582$ = null;
        module0597.$g4583$ = null;
        module0597.$g4584$ = null;
        module0597.$g4585$ = null;
        module0597.$g4586$ = null;
        module0597.$g4587$ = null;
        module0597.$g4588$ = null;
        module0597.$g4589$ = null;
        module0597.$g4590$ = null;
        module0597.$g4591$ = null;
        module0597.$g4592$ = null;
        module0597.$g4593$ = null;
        module0597.$g4594$ = null;
        module0597.$g4595$ = null;
        module0597.$g4596$ = null;
        module0597.$g4597$ = null;
        module0597.$g4598$ = null;
        module0597.$g4599$ = null;
        module0597.$g4600$ = null;
        module0597.$g4601$ = null;
        module0597.$g4602$ = null;
        module0597.$g4603$ = null;
        module0597.$g4604$ = null;
        module0597.$g4605$ = null;
        module0597.$g4606$ = null;
        module0597.$g4607$ = null;
        module0597.$g4608$ = null;
        module0597.$g4609$ = null;
        module0597.$g4610$ = null;
        module0597.$g4611$ = null;
        module0597.$g4612$ = null;
        module0597.$g4613$ = null;
        module0597.$g4614$ = null;
        module0597.$g4615$ = null;
        module0597.$g4616$ = null;
        module0597.$g4617$ = null;
        module0597.$g4618$ = null;
        module0597.$g4619$ = null;
        module0597.$g4620$ = null;
        module0597.$g4621$ = null;
        module0597.$g4622$ = null;
        module0597.$g4623$ = null;
        module0597.$g4624$ = null;
        module0597.$g4625$ = null;
        module0597.$g4626$ = null;
        module0597.$g4627$ = null;
        module0597.$g4628$ = null;
        module0597.$g4629$ = null;
        module0597.$g4630$ = null;
        module0597.$g4631$ = null;
        module0597.$g4632$ = null;
        module0597.$g4633$ = null;
        module0597.$g4634$ = null;
        module0597.$g4635$ = null;
        module0597.$g4636$ = null;
        module0597.$g4637$ = null;
        module0597.$g4638$ = null;
        module0597.$g4639$ = null;
        module0597.$g4640$ = null;
        module0597.$g4641$ = null;
        module0597.$g4642$ = null;
        module0597.$g4643$ = null;
        module0597.$g4644$ = null;
        module0597.$g4645$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#40375", "CYC");
        $ic1$ = SubLObjectFactory.makeKeyword("PATHS");
        $ic2$ = SubLObjectFactory.makeSymbol("S#40376", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#40377", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#40378", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic6$ = SubLObjectFactory.makeSymbol("S#40379", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic8$ = SubLObjectFactory.makeSymbol("S#40380", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#40381", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#40382", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#40383", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#40384", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#40385", "CYC");
        $ic14$ = ConsesLow.list((SubLObject)module0597.ONE_INTEGER, (SubLObject)module0597.TWO_INTEGER, (SubLObject)module0597.THREE_INTEGER, (SubLObject)module0597.FOUR_INTEGER, (SubLObject)module0597.FIVE_INTEGER);
        $ic15$ = SubLObjectFactory.makeSymbol("S#40386", "CYC");
        $ic16$ = ConsesLow.list((SubLObject)module0597.ONE_INTEGER, (SubLObject)module0597.TWO_INTEGER, (SubLObject)module0597.FOUR_INTEGER, (SubLObject)module0597.FOUR_INTEGER, (SubLObject)module0597.FIVE_INTEGER);
        $ic17$ = SubLObjectFactory.makeSymbol("S#40387", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#40388", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#40389", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#40390", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#40391", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#40392", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#40393", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#40394", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#40395", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#40396", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#40397", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#40398", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#40399", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#40400", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#40401", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#40402", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#40403", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#40404", "CYC");
        $ic35$ = SubLObjectFactory.makeInteger(2048);
        $ic36$ = SubLObjectFactory.makeSymbol("S#40405", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#40406", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#40407", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#40408", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#40409", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#40410", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("S#40411", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("S#40412", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#40413", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("S#40414", "CYC");
        $ic46$ = SubLObjectFactory.makeInteger(1000);
        $ic47$ = SubLObjectFactory.makeSymbol("S#40415", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("S#40416", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#40417", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#40418", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#40419", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#40420", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#40421", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("S#40422", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("S#40423", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#40424", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("S#40425", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("S#40426", "CYC");
        $ic59$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("EnglishMt")));
        $ic60$ = SubLObjectFactory.makeSymbol("S#40427", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("S#40428", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("S#40429", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#40430", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#40431", "CYC");
        $ic65$ = SubLObjectFactory.makeSymbol("S#40432", "CYC");
        $ic66$ = SubLObjectFactory.makeSymbol("S#40433", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("S#40434", "CYC");
        $ic68$ = SubLObjectFactory.makeSymbol("S#40435", "CYC");
        $ic69$ = SubLObjectFactory.makeSymbol("S#40436", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("S#40437", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("S#40438", "CYC");
        $ic72$ = ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedCollection")), (SubLObject)module0597.ONE_INTEGER));
        $ic73$ = SubLObjectFactory.makeSymbol("S#40439", "CYC");
        $ic74$ = SubLObjectFactory.makeSymbol("S#40440", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("S#40441", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("S#40442", "CYC");
        $ic77$ = SubLObjectFactory.makeSymbol("S#40443", "CYC");
        $ic78$ = SubLObjectFactory.makeSymbol("S#40444", "CYC");
        $ic79$ = ConsesLow.list((SubLObject)module0597.ZERO_INTEGER);
        $ic80$ = SubLObjectFactory.makeSymbol("S#40445", "CYC");
        $ic81$ = SubLObjectFactory.makeSymbol("S#40446", "CYC");
        $ic82$ = SubLObjectFactory.makeSymbol("S#40447", "CYC");
        $ic83$ = SubLObjectFactory.makeSymbol("S#40448", "CYC");
        $ic84$ = SubLObjectFactory.makeSymbol("S#676", "CYC");
        $ic85$ = SubLObjectFactory.makeSymbol("S#678", "CYC");
        $ic86$ = SubLObjectFactory.makeSymbol("S#680", "CYC");
        $ic87$ = SubLObjectFactory.makeSymbol("S#682", "CYC");
        $ic88$ = SubLObjectFactory.makeSymbol("S#684", "CYC");
        $ic89$ = SubLObjectFactory.makeSymbol("S#686", "CYC");
        $ic90$ = SubLObjectFactory.makeSymbol("S#40449", "CYC");
        $ic91$ = SubLObjectFactory.makeSymbol("S#40450", "CYC");
        $ic92$ = SubLObjectFactory.makeSymbol("S#677", "CYC");
        $ic93$ = SubLObjectFactory.makeSymbol("S#679", "CYC");
        $ic94$ = SubLObjectFactory.makeSymbol("S#681", "CYC");
        $ic95$ = SubLObjectFactory.makeSymbol("S#683", "CYC");
        $ic96$ = SubLObjectFactory.makeSymbol("S#685", "CYC");
        $ic97$ = SubLObjectFactory.makeSymbol("S#687", "CYC");
        $ic98$ = SubLObjectFactory.makeString("searching for kb paths");
        $ic99$ = SubLObjectFactory.makeString("missed connection");
        $ic100$ = SubLObjectFactory.makeString("duplicates in accessed1");
        $ic101$ = SubLObjectFactory.makeString("duplicates in accessed2");
        $ic102$ = SubLObjectFactory.makeKeyword("SUCCESS");
        $ic103$ = SubLObjectFactory.makeString("horizons missed; iteration ~s");
        $ic104$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic105$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic106$ = SubLObjectFactory.makeSymbol("S#12276", "CYC");
        $ic107$ = SubLObjectFactory.makeString("~%~%kbp common nodes: ~a");
        $ic108$ = SubLObjectFactory.makeString("~%~%complete-paths-home-from: ~s ~%~s");
        $ic109$ = SubLObjectFactory.makeString("~%~%~acomplete-paths-home-from-link: ~s ~%~a~s");
        $ic110$ = SubLObjectFactory.makeString("~%~%~acomplete-paths-home-from-node: ~s ~%~a~s");
        $ic111$ = SubLObjectFactory.makeKeyword("LINKS");
        $ic112$ = SubLObjectFactory.makeString("invalid path format: ~s");
        $ic113$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5430", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#9175", "CYC"));
        $ic114$ = SubLObjectFactory.makeString("~%~%~agather-node-latice:~%~a~s");
        $ic115$ = SubLObjectFactory.makeString("~%~%~agather-link-latice: ~%~a~s");
        $ic116$ = SubLObjectFactory.makeSymbol("S#40268", "CYC");
        $ic117$ = SubLObjectFactory.makeString("~%~%marking horizon for ~s in iteration ~s");
        $ic118$ = SubLObjectFactory.makeString("~%search node: [~s ~s] ~s");
        $ic119$ = SubLObjectFactory.makeString("empty horizon for ~s in iteration ~s");
        $ic120$ = SubLObjectFactory.makeString("~%~s searched by: ~s");
        $ic121$ = SubLObjectFactory.makeString("~%~s  *** goal!!!!!!!!!!!!!!!!!");
        $ic122$ = SubLObjectFactory.makeKeyword("TERM-BOUND");
        $ic123$ = SubLObjectFactory.makeSymbol("+");
        $ic124$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic125$ = SubLObjectFactory.makeSymbol("SPEC-CARDINALITY");
        $ic126$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic127$ = SubLObjectFactory.makeKeyword("UP");
        $ic128$ = SubLObjectFactory.makeKeyword("DOWN");
        $ic129$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic130$ = SubLObjectFactory.makeKeyword("NEG");
        $ic131$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic132$ = SubLObjectFactory.makeKeyword("POS");
        $ic133$ = SubLObjectFactory.makeKeyword("OTHER");
        $ic134$ = SubLObjectFactory.makeKeyword("DEPTH");
        $ic135$ = SubLObjectFactory.makeKeyword("ITERATIONS");
        $ic136$ = SubLObjectFactory.makeKeyword("TERMS");
        $ic137$ = SubLObjectFactory.makeKeyword("NODES");
        $ic138$ = SubLObjectFactory.makeKeyword("BRANCH");
        $ic139$ = SubLObjectFactory.makeKeyword("TIME");
        $ic140$ = SubLObjectFactory.makeKeyword("TERMINATION");
        $ic141$ = SubLObjectFactory.makeKeyword("EXHAUST");
        $ic142$ = SubLObjectFactory.makeKeyword("ITERATION-BOUND");
        $ic143$ = SubLObjectFactory.makeSymbol("S#40314", "CYC");
        $ic144$ = SubLObjectFactory.makeSymbol("S#40358", "CYC");
        $ic145$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9182", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#40455", "CYC"));
        $ic146$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24487", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#40456", "CYC"));
        $ic147$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#40457", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#40458", "CYC"));
        $ic148$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#40459", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#40460", "CYC"));
        $ic149$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#40461", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#40462", "CYC"));
        $ic150$ = SubLObjectFactory.makeSymbol("S#40343", "CYC");
        $ic151$ = SubLObjectFactory.makeSymbol("S#40344", "CYC");
        $ic152$ = SubLObjectFactory.makeString("continue anyway");
        $ic153$ = SubLObjectFactory.makeSymbol("WARN");
        $ic154$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")));
        $ic155$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls")));
        $ic156$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt")));
        $ic157$ = SubLObjectFactory.makeInteger(1024);
        $ic158$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")));
        $ic159$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Predicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Microtheory")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("KnowledgeBase")));
        $ic160$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TestingConstant")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("LinguisticObjectType")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferenceRelatedBookkeepingPredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("GenericAttribute")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("KnowledgeBase")));
        $ic161$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("PartiallyTangible")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SiblingDisjointCollectionType")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ExistingObjectType")));
        $ic162$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Predicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Microtheory")));
        $ic163$ = SubLObjectFactory.makeSymbol("S#40354", "CYC");
        $ic164$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated"));
        $ic165$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic166$ = SubLObjectFactory.makeSymbol("S#16400", "CYC");
        $ic167$ = SubLObjectFactory.makeSymbol("ASSERTION-FI-FORMULA");
        $ic168$ = SubLObjectFactory.makeString("~%cr gafs considered: ~a");
        $ic169$ = SubLObjectFactory.makeString("~%cr gafs explained: ~a");
        $ic170$ = SubLObjectFactory.makeString("~%cr gafs w/errors: ~a");
        $ic171$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic172$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("and"));
        $ic173$ = SubLObjectFactory.makeKeyword("MIN");
        $ic174$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REQUIRED"), (SubLObject)SubLObjectFactory.makeKeyword("RELATION-ALL"));
        $ic175$ = SubLObjectFactory.makeKeyword("BREADTH");
        $ic176$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic177$ = SubLObjectFactory.makeKeyword("STACK");
        $ic178$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic179$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic180$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic181$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic182$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic183$ = SubLObjectFactory.makeKeyword("WARN");
        $ic184$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic185$ = SubLObjectFactory.makeSymbol("S#40361", "CYC");
        $ic186$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic187$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic188$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic189$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic190$ = SubLObjectFactory.makeSymbol("CAR");
        $ic191$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"));
        $ic192$ = SubLObjectFactory.makeSymbol(">");
        $ic193$ = SubLObjectFactory.makeSymbol("CADR");
        $ic194$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic195$ = SubLObjectFactory.makeKeyword("ALL");
        $ic196$ = SubLObjectFactory.makeKeyword("MAX");
        $ic197$ = SubLObjectFactory.makeKeyword("MID");
        $ic198$ = SubLObjectFactory.makeKeyword("EDGE");
        $ic199$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REQUIRED"), (SubLObject)SubLObjectFactory.makeKeyword("RELATION-ALL"), (SubLObject)SubLObjectFactory.makeKeyword("RELATION-EXISTS"), (SubLObject)SubLObjectFactory.makeKeyword("INTER-ARG-ISA-INDEPENDENT"), (SubLObject)SubLObjectFactory.makeKeyword("INTER-ARG-ISA-DEPENDENT"));
        $ic200$ = SubLObjectFactory.makeSymbol("S#40373", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0597.class
	Total time: 3161 ms
	
	Decompiled with Procyon 0.5.32.
*/