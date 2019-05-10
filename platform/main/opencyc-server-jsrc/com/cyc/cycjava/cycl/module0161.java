package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0161 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0161";
    public static final String myFingerPrint = "e6b5d95614134e45e3186526e81c63ab03c99fd63c1394196be04abafe4c8c1f";
    public static SubLSymbol $g2154$;
    public static SubLSymbol $g2155$;
    public static SubLSymbol $g2156$;
    public static SubLSymbol $g2157$;
    public static SubLSymbol $g2158$;
    public static SubLSymbol $g2159$;
    public static SubLSymbol $g2160$;
    public static SubLSymbol $g2161$;
    private static SubLSymbol $g2162$;
    private static SubLSymbol $g2163$;
    private static SubLSymbol $g2164$;
    private static SubLSymbol $g2165$;
    private static SubLSymbol $g2166$;
    private static SubLSymbol $g2167$;
    private static SubLSymbol $g2168$;
    private static SubLSymbol $g2169$;
    private static SubLSymbol $g2170$;
    private static SubLSymbol $g2171$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLList $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLObject $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLObject $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLObject $ic60$;
    private static final SubLList $ic61$;
    private static final SubLObject $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLObject $ic64$;
    private static final SubLObject $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLList $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLList $ic82$;
    private static final SubLList $ic83$;
    private static final SubLList $ic84$;
    
    public static SubLObject f10471() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g2154$.getDynamicValue(var1);
    }
    
    public static SubLObject f10472(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic1$, ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f10473() {
        $g2154$.setDynamicValue((SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10474() {
        $g2154$.setDynamicValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10475() {
        return $g2169$.getGlobalValue();
    }
    
    public static SubLObject f10476(final SubLObject var7) {
        return module0004.f104(var7, $g2169$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10477(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != module0212.f13769(var7) && NIL == f10476(var7));
    }
    
    public static SubLObject f10478(final SubLObject var7) {
        return Equality.eql(var7, $g2162$.getGlobalValue());
    }
    
    public static SubLObject f10479(final SubLObject var7) {
        return f10480(var7);
    }
    
    public static SubLObject f10480(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != module0202.f12656(var7) || NIL != f10481(var7));
    }
    
    public static SubLObject f10482(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var7) || NIL != f10483(var7));
    }
    
    public static SubLObject f10484(final SubLObject var7) {
        return f10483(var7);
    }
    
    public static SubLObject f10483(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != f10481(var7) && NIL != module0193.f12107(var7));
    }
    
    public static SubLObject f10485(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != f10480(var7) && NIL != module0193.f12107(var7));
    }
    
    public static SubLObject f10481(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        return (NIL != $g2154$.getDynamicValue(var8)) ? f10486(var7) : f10487(var7);
    }
    
    public static SubLObject f10487(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != module0173.f10969(var7) || NIL != f10488(var7));
    }
    
    public static SubLObject f10486(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != module0173.f10969(var7) || NIL != f10489(var7));
    }
    
    public static SubLObject f10490(final SubLObject var7) {
        if (NIL != module0202.f12659(var7)) {
            final SubLObject var8 = module0205.f13366(var7);
            return (SubLObject)makeBoolean(NIL != f10491(var8) || NIL != f10492(var8) || NIL != f10493(var8));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10489(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != f10490(var7) && (NIL != f10494(var7) || NIL != f10495(var7) || NIL != f10488(var7) || NIL != f10496(var7)));
    }
    
    public static SubLObject f10494(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != module0202.f12659(var7) && NIL != f10478(module0205.f13366(var7)) && NIL != f10497(module0205.f13361(var7, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f10497(final SubLObject var10) {
        return (SubLObject)makeBoolean(NIL == var10 || (NIL != f10481(var10.first()) && NIL != f10497(var10.rest())));
    }
    
    public static SubLObject f10495(final SubLObject var7) {
        if (NIL != module0202.f12659(var7)) {
            final SubLObject var8 = module0205.f13366(var7);
            if (NIL != f10498(var8)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10488(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != module0202.f12659(var7) && NIL != f10492(module0205.f13366(var7)));
    }
    
    public static SubLObject f10492(final SubLObject var7) {
        return Equality.eql(var7, $ic13$);
    }
    
    public static SubLObject f10499(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != module0206.f13451(var7) && NIL != f10500(var7));
    }
    
    public static SubLObject f10500(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        return (NIL != $g2154$.getDynamicValue(var8)) ? f10501(var7) : f10502(var7);
    }
    
    public static SubLObject f10502(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != f10481(var7) && (NIL != f10503(var7) || NIL != f10504(var7)));
    }
    
    public static SubLObject f10501(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != f10481(var7) && (NIL != f10503(var7) || NIL != f10505(var7)));
    }
    
    public static SubLObject f10505(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != f10506(var7) || NIL != f10507(var7) || NIL != f10504(var7));
    }
    
    public static SubLObject f10506(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != module0202.f12659(var7) && NIL != f10478(module0205.f13366(var7)) && NIL != f10508(module0205.f13361(var7, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f10508(final SubLObject var10) {
        return (SubLObject)makeBoolean(NIL == var10 || (NIL != f10500(var10.first()) && NIL != f10508(var10.rest())));
    }
    
    public static SubLObject f10507(final SubLObject var7) {
        if (NIL != module0202.f12659(var7)) {
            final SubLObject var8 = module0205.f13366(var7);
            return (SubLObject)makeBoolean(NIL != f10498(var8) && NIL != f10509(var8, module0205.f13361(var7, (SubLObject)UNPROVIDED)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10509(final SubLObject var9, final SubLObject var10) {
        if (var9.eql($ic14$)) {
            return f10510(var10);
        }
        if (var9.eql($ic15$)) {
            return f10511(var10);
        }
        return module0035.f1995(var10, module0225.f14739(var9), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10504(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != module0202.f12659(var7) && NIL != f10492(module0205.f13366(var7)) && NIL != f10512(module0205.f13361(var7, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f10512(final SubLObject var10) {
        return (SubLObject)makeBoolean(NIL == var10 || (NIL != f10500(var10.first()) && NIL != f10512(var10.rest())));
    }
    
    public static SubLObject f10513(final SubLObject var12, final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        if (NIL != $g2154$.getDynamicValue(var14)) {
            return Equality.equal(var12, var13);
        }
        return Equality.eql(var12, var13);
    }
    
    public static SubLObject f10514(final SubLObject var12, final SubLObject var13) {
        if (NIL != f10513(var12, var13)) {
            return (SubLObject)T;
        }
        if (NIL != f10515(var12) && NIL != f10515(var13)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != f10516(var12, var13) && NIL != f10517(var12, var13));
    }
    
    public static SubLObject f10518(final SubLObject var15) {
        assert NIL != Types.listp(var15) : var15;
        return (SubLObject)ConsesLow.cons($g2162$.getGlobalValue(), var15);
    }
    
    public static SubLObject f10519(final SubLObject var16) {
        return conses_high.copy_tree(var16);
    }
    
    public static SubLObject f10520(final SubLObject var17) {
        return module0202.f12643($g2168$.getGlobalValue(), var17);
    }
    
    public static SubLObject f10521() {
        return $g2167$.getGlobalValue();
    }
    
    public static SubLObject f10522(final SubLObject var18) {
        return module0205.f13361(var18, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10523(final SubLObject var19) {
        return Mapping.mapcan((SubLObject)$ic17$, f10522(var19), EMPTY_SUBL_OBJECT_ARRAY);
    }
    
    public static SubLObject f10524(final SubLObject var7) {
        return (SubLObject)((NIL != f10488(var7)) ? f10523(var7) : ConsesLow.list(var7));
    }
    
    public static SubLObject f10525(final SubLObject var20) {
        if (NIL != module0004.f104($ic19$, var20, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED)) {
            return $ic19$;
        }
        if (NIL != module0004.f104($ic20$, var20, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED)) {
            return $ic20$;
        }
        if (NIL != module0035.f1998(var20) && NIL != module0262.f17336(var20.first(), conses_high.second(var20), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return var20.first();
        }
        if (NIL != module0035.f1998(var20) && NIL != module0262.f17336(conses_high.second(var20), var20.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return conses_high.second(var20);
        }
        if (NIL != Sequences.find_if((SubLObject)$ic21$, var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return f10526((SubLObject)ConsesLow.cons($ic13$, Mapping.mapcar((SubLObject)$ic22$, var20)), f10521(), (SubLObject)NIL);
        }
        return (SubLObject)ConsesLow.cons($ic13$, var20);
    }
    
    public static SubLObject f10527(final SubLObject var7) {
        return module0004.f104(var7, $g2164$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10528() {
        return $g2164$.getGlobalValue();
    }
    
    public static SubLObject f10498(final SubLObject var7) {
        return module0004.f104(var7, $g2165$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10491(final SubLObject var7) {
        return module0004.f104(var7, $g2166$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10529(final SubLObject var7) {
        return module0305.f20438(var7, $ic23$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10530(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic24$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic24$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic24$);
        var8 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic24$);
        var9 = var5.first();
        var5 = var5.rest();
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = var5;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var29_30 = (SubLObject)NIL;
        while (NIL != var11) {
            cdestructuring_bind.destructuring_bind_must_consp(var11, var4, (SubLObject)$ic24$);
            var29_30 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var4, (SubLObject)$ic24$);
            if (NIL == conses_high.member(var29_30, (SubLObject)$ic25$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var12 = (SubLObject)T;
            }
            if (var29_30 == $ic26$) {
                var10 = var11.first();
            }
            var11 = var11.rest();
        }
        if (NIL != var12 && NIL == var10) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic24$);
        }
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic27$, var5);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var5 = (var15 = var6);
        final SubLObject var16 = (SubLObject)$ic28$;
        final SubLObject var17 = (SubLObject)$ic29$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic30$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic31$, var9), (SubLObject)ConsesLow.list((SubLObject)$ic32$, var14, (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list(reader.bq_cons(var7, (SubLObject)$ic33$), (SubLObject)ConsesLow.list(var8, var9)), ConsesLow.append(var15, (SubLObject)NIL)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic34$, var9), (SubLObject)ConsesLow.list((SubLObject)$ic32$, var14, (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)$ic35$, var9)), (SubLObject)ConsesLow.list(var8, var9)), ConsesLow.append(var15, (SubLObject)NIL)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic36$, var9), (SubLObject)ConsesLow.list((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.list((SubLObject)$ic37$, var9))), (SubLObject)ConsesLow.list((SubLObject)$ic38$, (SubLObject)ConsesLow.list(var17, var16, var14), (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)$ic39$, var17)), (SubLObject)ConsesLow.list(var8, var17)), ConsesLow.append(var15, (SubLObject)NIL))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic40$, (SubLObject)ConsesLow.list((SubLObject)$ic41$, var9), (SubLObject)ConsesLow.list((SubLObject)$ic42$, var9)), (SubLObject)ConsesLow.list((SubLObject)$ic32$, var14, (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list(reader.bq_cons(var7, (SubLObject)$ic43$), (SubLObject)ConsesLow.list(var8, var9)), ConsesLow.append(var15, (SubLObject)NIL)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic44$, var9), (SubLObject)ConsesLow.list((SubLObject)$ic32$, var14, (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list(reader.bq_cons(var7, (SubLObject)$ic33$), (SubLObject)ConsesLow.list(var8, var9)), ConsesLow.append(var15, (SubLObject)NIL)))), (SubLObject)ConsesLow.list((SubLObject)T, (SubLObject)ConsesLow.list((SubLObject)$ic32$, var14, (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list(reader.bq_cons(var7, (SubLObject)$ic45$), (SubLObject)ConsesLow.list(var8, var9)), ConsesLow.append(var15, (SubLObject)NIL)))));
    }
    
    public static SubLObject f10531(final SubLObject var33) {
        if (NIL != f10515(var33)) {
            return (SubLObject)$ic47$;
        }
        if (NIL != f10532(var33)) {
            return (SubLObject)$ic48$;
        }
        return (SubLObject)$ic49$;
    }
    
    public static SubLObject f10533(final SubLObject var34) {
        if (NIL != f10515(var34)) {
            return (SubLObject)$ic47$;
        }
        if (NIL != module0202.f12659(var34)) {
            return f10534(var34);
        }
        return (SubLObject)$ic49$;
    }
    
    public static SubLObject f10534(final SubLObject var35) {
        if (NIL != f10535(var35)) {
            return (SubLObject)$ic48$;
        }
        final SubLObject var37;
        final SubLObject var36 = var37 = module0205.f13366(var35);
        if (var37.eql($ic14$) || var37.eql($ic15$) || var37.eql($ic11$)) {
            return (SubLObject)$ic48$;
        }
        if (!var37.eql($ic50$)) {
            return (SubLObject)NIL;
        }
        final SubLObject var11_37;
        final SubLObject var38 = var11_37 = module0205.f13277(var35, (SubLObject)UNPROVIDED);
        if (var11_37.eql($ic51$)) {
            return (SubLObject)$ic47$;
        }
        if (var11_37.eql($ic52$) || var11_37.eql($ic53$)) {
            return (SubLObject)$ic48$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10536(final SubLObject var38, final SubLObject var16) {
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = (SubLObject)NIL;
        if (NIL != f10515(var16)) {
            if (NIL == var40) {
                final SubLObject var41 = (SubLObject)$ic47$;
                if (var38.eql(var41)) {
                    var39 = var16;
                    var40 = (SubLObject)T;
                }
            }
        }
        else if (NIL != f10495(var16)) {
            if (NIL == var40) {
                final SubLObject var41 = f10534(var16);
                if (var38.eql(var41)) {
                    var39 = var16;
                    var40 = (SubLObject)T;
                }
            }
        }
        else if (NIL != f10494(var16)) {
            final SubLObject var42 = module0205.f13361(var16, (SubLObject)UNPROVIDED);
            if (NIL == var40) {
                SubLObject var43 = var42;
                SubLObject var44 = (SubLObject)NIL;
                var44 = var43.first();
                while (NIL == var40 && NIL != var43) {
                    final SubLObject var45 = f10531(var44);
                    final SubLObject var46 = var44;
                    if (var38.eql(var45)) {
                        var39 = var46;
                        var40 = (SubLObject)T;
                    }
                    var43 = var43.rest();
                    var44 = var43.first();
                }
            }
        }
        else if (NIL != f10535(var16) || NIL != f10496(var16)) {
            if (NIL == var40) {
                final SubLObject var41 = (SubLObject)$ic48$;
                if (var38.eql(var41)) {
                    var39 = var16;
                    var40 = (SubLObject)T;
                }
            }
        }
        else if (NIL != f10485(var16)) {
            if (NIL == var40) {
                final SubLObject var41 = (SubLObject)$ic47$;
                if (var38.eql(var41)) {
                    var39 = var16;
                    var40 = (SubLObject)T;
                }
            }
        }
        else if (NIL == var40) {
            final SubLObject var41 = (SubLObject)$ic49$;
            if (var38.eql(var41)) {
                var39 = var16;
                var40 = (SubLObject)T;
            }
        }
        return var39;
    }
    
    public static SubLObject f10537(final SubLObject var16) {
        if (NIL != f10494(var16)) {
            return module0205.f13361(var16, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)ConsesLow.list(var16);
    }
    
    public static SubLObject f10538(final SubLObject var38, final SubLObject var16) {
        final SubLObject var39 = f10537(var16);
        final SubLObject var40 = f10536(var38, var16);
        return f10539(Sequences.remove(var40, var39, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f10540(final SubLObject var38, final SubLObject var16, final SubLObject var47) {
        final SubLObject var48 = f10537(var16);
        final SubLObject var49 = f10536(var38, var16);
        final SubLObject var50 = Sequences.remove(var49, var48, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var51 = (SubLObject)ConsesLow.cons(var47, var50);
        return f10539(var51);
    }
    
    public static SubLObject f10541(final SubLObject var16, final SubLObject var50) {
        return (NIL != module0173.f10955(var16)) ? var50 : f10540((SubLObject)$ic47$, var16, var50);
    }
    
    public static SubLObject f10542(final SubLObject var16, final SubLObject var51, SubLObject var52) {
        if (var52 == UNPROVIDED) {
            var52 = (SubLObject)NIL;
        }
        final SubLObject var53 = f10543(var51, var52);
        return f10540((SubLObject)$ic48$, var16, var53);
    }
    
    public static SubLObject f10544(final SubLObject var38, final SubLObject var47) {
        if (var38.eql((SubLObject)$ic47$)) {
            return f10545(var47);
        }
        if (var38.eql((SubLObject)$ic48$)) {
            return f10546(var47);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10547(final SubLObject var54) {
        return module0035.f2369((SubLObject)$ic54$, var54, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10548(final SubLObject var16) {
        SubLObject var17 = (SubLObject)NIL;
        if (NIL != f10515(var16)) {
            if (NIL == var17) {
                final SubLObject var18 = (SubLObject)$ic47$;
                if (NIL == f10549(var18) && NIL == f10544(var18, var16)) {
                    var17 = (SubLObject)T;
                }
            }
        }
        else if (NIL != f10495(var16)) {
            if (NIL == var17) {
                final SubLObject var18 = f10534(var16);
                if (NIL == f10549(var18) && NIL == f10544(var18, var16)) {
                    var17 = (SubLObject)T;
                }
            }
        }
        else if (NIL != f10494(var16)) {
            final SubLObject var19 = module0205.f13361(var16, (SubLObject)UNPROVIDED);
            if (NIL == var17) {
                SubLObject var20 = var19;
                SubLObject var21 = (SubLObject)NIL;
                var21 = var20.first();
                while (NIL == var17 && NIL != var20) {
                    final SubLObject var22 = f10531(var21);
                    final SubLObject var23 = var21;
                    if (NIL == f10549(var22) && NIL == f10544(var22, var23)) {
                        var17 = (SubLObject)T;
                    }
                    var20 = var20.rest();
                    var21 = var20.first();
                }
            }
        }
        else if (NIL != f10535(var16) || NIL != f10496(var16)) {
            if (NIL == var17) {
                final SubLObject var18 = (SubLObject)$ic48$;
                if (NIL == f10549(var18) && NIL == f10544(var18, var16)) {
                    var17 = (SubLObject)T;
                }
            }
        }
        else if (NIL != f10485(var16)) {
            if (NIL == var17) {
                final SubLObject var18 = (SubLObject)$ic47$;
                if (NIL == f10549(var18) && NIL == f10544(var18, var16)) {
                    var17 = (SubLObject)T;
                }
            }
        }
        else if (NIL == var17) {
            final SubLObject var18 = (SubLObject)$ic49$;
            if (NIL == f10549(var18) && NIL == f10544(var18, var16)) {
                var17 = (SubLObject)T;
            }
        }
        return var17;
    }
    
    public static SubLObject f10550(final SubLObject var56) {
        final SubLObject var57 = module0178.f11287(var56);
        return f10551(var57);
    }
    
    public static SubLObject f10552(final SubLObject var16, final SubLObject var57, final SubLObject var58) {
        SubLObject var59 = (SubLObject)NIL;
        if (NIL != f10515(var16)) {
            if (NIL == var59) {
                final SubLObject var60 = (SubLObject)$ic47$;
                var59 = (SubLObject)makeBoolean(var60.eql(var57) && NIL != f10513(var16, var58));
            }
        }
        else if (NIL != f10495(var16)) {
            if (NIL == var59) {
                final SubLObject var60 = f10534(var16);
                var59 = (SubLObject)makeBoolean(var60.eql(var57) && NIL != f10513(var16, var58));
            }
        }
        else if (NIL != f10494(var16)) {
            final SubLObject var61 = module0205.f13361(var16, (SubLObject)UNPROVIDED);
            if (NIL == var59) {
                SubLObject var62 = var61;
                SubLObject var63 = (SubLObject)NIL;
                var63 = var62.first();
                while (NIL == var59 && NIL != var62) {
                    final SubLObject var64 = f10531(var63);
                    final SubLObject var65 = var63;
                    var59 = (SubLObject)makeBoolean(var64.eql(var57) && NIL != f10513(var65, var58));
                    var62 = var62.rest();
                    var63 = var62.first();
                }
            }
        }
        else if (NIL != f10535(var16) || NIL != f10496(var16)) {
            if (NIL == var59) {
                final SubLObject var60 = (SubLObject)$ic48$;
                var59 = (SubLObject)makeBoolean(var60.eql(var57) && NIL != f10513(var16, var58));
            }
        }
        else if (NIL != f10485(var16)) {
            if (NIL == var59) {
                final SubLObject var60 = (SubLObject)$ic47$;
                var59 = (SubLObject)makeBoolean(var60.eql(var57) && NIL != f10513(var16, var58));
            }
        }
        else if (NIL == var59) {
            final SubLObject var60 = (SubLObject)$ic49$;
            var59 = (SubLObject)makeBoolean(var60.eql(var57) && NIL != f10513(var16, var58));
        }
        return var59;
    }
    
    public static SubLObject f10551(final SubLObject var16) {
        SubLObject var17 = conses_high.copy_list($g2164$.getGlobalValue());
        SubLObject var18 = (SubLObject)NIL;
        if (NIL != f10515(var16)) {
            final SubLObject var19 = (SubLObject)$ic47$;
            var17 = Sequences.delete(var19, var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var18 = (SubLObject)ConsesLow.cons(f10553(var19, var16), var18);
        }
        else if (NIL != f10495(var16)) {
            final SubLObject var19 = f10534(var16);
            var17 = Sequences.delete(var19, var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var18 = (SubLObject)ConsesLow.cons(f10553(var19, var16), var18);
        }
        else if (NIL != f10494(var16)) {
            SubLObject var21;
            final SubLObject var20 = var21 = module0205.f13361(var16, (SubLObject)UNPROVIDED);
            SubLObject var22 = (SubLObject)NIL;
            var22 = var21.first();
            while (NIL != var21) {
                final SubLObject var23 = f10531(var22);
                final SubLObject var24 = var22;
                var17 = Sequences.delete(var23, var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var18 = (SubLObject)ConsesLow.cons(f10553(var23, var24), var18);
                var21 = var21.rest();
                var22 = var21.first();
            }
        }
        else if (NIL != f10535(var16) || NIL != f10496(var16)) {
            final SubLObject var19 = (SubLObject)$ic48$;
            var17 = Sequences.delete(var19, var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var18 = (SubLObject)ConsesLow.cons(f10553(var19, var16), var18);
        }
        else if (NIL != f10485(var16)) {
            final SubLObject var19 = (SubLObject)$ic47$;
            var17 = Sequences.delete(var19, var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var18 = (SubLObject)ConsesLow.cons(f10553(var19, var16), var18);
        }
        else {
            final SubLObject var19 = (SubLObject)$ic49$;
            var17 = Sequences.delete(var19, var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var18 = (SubLObject)ConsesLow.cons(f10553(var19, var16), var18);
        }
        SubLObject var25 = var17;
        SubLObject var26 = (SubLObject)NIL;
        var26 = var25.first();
        while (NIL != var25) {
            var18 = (SubLObject)ConsesLow.cons(f10554(var26), var18);
            var25 = var25.rest();
            var26 = var25.first();
        }
        return f10518(var18);
    }
    
    public static SubLObject f10555(SubLObject var16, SubLObject var62) {
        if (var62 == UNPROVIDED) {
            var62 = (SubLObject)T;
        }
        var16 = f10556(var16, var62);
        final SubLObject var63 = f10557(var16);
        if (NIL != module0147.f9557(var63)) {
            return var63;
        }
        if (var63.eql(var16)) {
            return var16;
        }
        SubLObject var64 = (SubLObject)NIL;
        if (NIL != f10515(var16)) {
            final SubLObject var65 = (SubLObject)$ic47$;
            final SubLObject var66 = var16;
            if (NIL == f10544(var65, var66)) {
                var64 = (SubLObject)ConsesLow.cons(f10558(var65, var66), var64);
            }
        }
        else if (NIL != f10495(var16)) {
            final SubLObject var65 = f10534(var16);
            final SubLObject var66 = var16;
            if (NIL == f10544(var65, var66)) {
                var64 = (SubLObject)ConsesLow.cons(f10558(var65, var66), var64);
            }
        }
        else if (NIL != f10494(var16)) {
            SubLObject var68;
            final SubLObject var67 = var68 = module0205.f13361(var16, (SubLObject)UNPROVIDED);
            SubLObject var69 = (SubLObject)NIL;
            var69 = var68.first();
            while (NIL != var68) {
                final SubLObject var70 = f10531(var69);
                final SubLObject var71 = var69;
                if (NIL == f10544(var70, var71)) {
                    var64 = (SubLObject)ConsesLow.cons(f10558(var70, var71), var64);
                }
                var68 = var68.rest();
                var69 = var68.first();
            }
        }
        else if (NIL != f10535(var16) || NIL != f10496(var16)) {
            final SubLObject var65 = (SubLObject)$ic48$;
            final SubLObject var66 = var16;
            if (NIL == f10544(var65, var66)) {
                var64 = (SubLObject)ConsesLow.cons(f10558(var65, var66), var64);
            }
        }
        else if (NIL != f10485(var16)) {
            final SubLObject var65 = (SubLObject)$ic47$;
            final SubLObject var66 = var16;
            if (NIL == f10544(var65, var66)) {
                var64 = (SubLObject)ConsesLow.cons(f10558(var65, var66), var64);
            }
        }
        else {
            final SubLObject var65 = (SubLObject)$ic49$;
            final SubLObject var66 = var16;
            if (NIL == f10544(var65, var66)) {
                var64 = (SubLObject)ConsesLow.cons(f10558(var65, var66), var64);
            }
        }
        if (NIL != module0035.f1997(var64)) {
            return var64.first();
        }
        if (NIL != var64) {
            return f10518(var64);
        }
        return f10557(var16);
    }
    
    public static SubLObject f10556(final SubLObject var16, final SubLObject var62) {
        if (NIL != f10488(var16)) {
            return f10559(var16, var62);
        }
        if (var16.isCons()) {
            return (SubLObject)ConsesLow.cons(f10556(var16.first(), var62), f10556(var16.rest(), var62));
        }
        return var16;
    }
    
    public static SubLObject f10559(final SubLObject var18, final SubLObject var62) {
        SubLObject var63 = f10523(var18);
        if (NIL != module0004.f104($ic19$, var63, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED)) {
            return $ic19$;
        }
        if (NIL != module0004.f104($ic20$, var63, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED)) {
            return $ic20$;
        }
        if (NIL != var62) {
            var63 = f10560(module0213.f13926(var63, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        else {
            var63 = module0213.f13926(module0035.f2269(var63, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0035.f1994(var63, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
            return var63.first();
        }
        return module0202.f12786($ic13$, var63);
    }
    
    public static SubLObject f10561() {
        final SubLObject var65 = $g2170$.getGlobalValue();
        if (NIL != var65) {
            module0034.f1818(var65);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10562(final SubLObject var64) {
        return module0034.f1829($g2170$.getGlobalValue(), (SubLObject)ConsesLow.list(var64), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10563(final SubLObject var64) {
        return module0213.f13926(module0262.f17364(var64, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10560(final SubLObject var64) {
        SubLObject var65 = $g2170$.getGlobalValue();
        if (NIL == var65) {
            var65 = module0034.f1934((SubLObject)$ic55$, (SubLObject)$ic56$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
            module0034.f1943((SubLObject)$ic57$);
        }
        SubLObject var66 = module0034.f1814(var65, var64, (SubLObject)$ic58$);
        if (var66 == $ic58$) {
            var66 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f10563(var64)));
            module0034.f1816(var65, var64, var66, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var66);
    }
    
    public static SubLObject f10539(final SubLObject var15) {
        return f10555(f10518(var15), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10564(SubLObject var68, SubLObject var69) {
        if (var68.eql($ic19$) || var69.eql($ic19$)) {
            return $ic19$;
        }
        if (var68.eql($ic20$) || var69.eql($ic20$)) {
            return $ic20$;
        }
        SubLObject var70 = (SubLObject)NIL;
        var68 = module0162.f10628(var68);
        var69 = module0162.f10628(var69);
        if (NIL != f10488(var68)) {
            var70 = ConsesLow.append(f10522(var68), var70);
        }
        else {
            var70 = (SubLObject)ConsesLow.cons(var68, var70);
        }
        if (NIL != f10488(var69)) {
            var70 = ConsesLow.append(f10522(var69), var70);
        }
        else {
            var70 = (SubLObject)ConsesLow.cons(var69, var70);
        }
        var70 = module0262.f17364(var70, (SubLObject)UNPROVIDED);
        if (NIL != module0035.f1997(var70)) {
            return var70.first();
        }
        return module0285.f18875(module0202.f12720($ic13$, var70, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10565(final SubLObject var15) {
        return module0162.f10628(f10518(var15));
    }
    
    public static SubLObject f10553(final SubLObject var38, final SubLObject var47) {
        if (var38.eql((SubLObject)$ic47$)) {
            return var47;
        }
        if (var38.eql((SubLObject)$ic48$)) {
            return f10566(var47);
        }
        return var47;
    }
    
    public static SubLObject f10558(final SubLObject var38, final SubLObject var47) {
        if (var38.eql((SubLObject)$ic47$)) {
            return var47;
        }
        if (var38.eql((SubLObject)$ic48$)) {
            return f10567(var47);
        }
        return var47;
    }
    
    public static SubLObject f10554(final SubLObject var38) {
        if (var38.eql((SubLObject)$ic47$)) {
            return $g2155$.getGlobalValue();
        }
        if (var38.eql((SubLObject)$ic48$)) {
            return f10568();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10569(final SubLObject var70) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10570(final SubLObject var16, SubLObject var71) {
        if (var71 == UNPROVIDED) {
            var71 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != f10499(var16) && NIL != f10571(var16, var71));
    }
    
    public static SubLObject f10571(final SubLObject var16, SubLObject var71) {
        if (var71 == UNPROVIDED) {
            var71 = (SubLObject)NIL;
        }
        if (NIL == f10481(var16)) {
            return (SubLObject)NIL;
        }
        if (NIL != var71) {
            SubLObject var72 = (SubLObject)NIL;
            if (NIL != f10515(var16)) {
                if (NIL == var72) {
                    final SubLObject var73 = (SubLObject)$ic47$;
                    if (NIL == f10572(var73, var16)) {
                        var72 = (SubLObject)T;
                    }
                }
            }
            else if (NIL != f10495(var16)) {
                if (NIL == var72) {
                    final SubLObject var73 = f10534(var16);
                    if (NIL == f10572(var73, var16)) {
                        var72 = (SubLObject)T;
                    }
                }
            }
            else if (NIL != f10494(var16)) {
                final SubLObject var74 = module0205.f13361(var16, (SubLObject)UNPROVIDED);
                if (NIL == var72) {
                    SubLObject var75 = var74;
                    SubLObject var76 = (SubLObject)NIL;
                    var76 = var75.first();
                    while (NIL == var72 && NIL != var75) {
                        final SubLObject var77 = f10531(var76);
                        final SubLObject var78 = var76;
                        if (NIL == f10572(var77, var78)) {
                            var72 = (SubLObject)T;
                        }
                        var75 = var75.rest();
                        var76 = var75.first();
                    }
                }
            }
            else if (NIL != f10535(var16) || NIL != f10496(var16)) {
                if (NIL == var72) {
                    final SubLObject var73 = (SubLObject)$ic48$;
                    if (NIL == f10572(var73, var16)) {
                        var72 = (SubLObject)T;
                    }
                }
            }
            else if (NIL != f10485(var16)) {
                if (NIL == var72) {
                    final SubLObject var73 = (SubLObject)$ic47$;
                    if (NIL == f10572(var73, var16)) {
                        var72 = (SubLObject)T;
                    }
                }
            }
            else if (NIL == var72) {
                final SubLObject var73 = (SubLObject)$ic49$;
                if (NIL == f10572(var73, var16)) {
                    var72 = (SubLObject)T;
                }
            }
            return (SubLObject)makeBoolean(NIL == var72);
        }
        return f10573(f10557(var16));
    }
    
    public static SubLObject f10572(final SubLObject var38, final SubLObject var47) {
        if (var38.eql((SubLObject)$ic47$)) {
            return f10573(var47);
        }
        if (var38.eql((SubLObject)$ic48$)) {
            return f10574(var47);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10545(final SubLObject var7) {
        return Equality.eql(var7, $g2155$.getGlobalValue());
    }
    
    public static SubLObject f10549(final SubLObject var7) {
        return Equality.eql(var7, (SubLObject)$ic47$);
    }
    
    public static SubLObject f10515(final SubLObject var7) {
        return (SubLObject)makeBoolean((NIL != module0173.f10955(var7) && NIL == f10535(var7)) || (NIL != f10488(var7) && NIL != module0035.f2370((SubLObject)$ic31$, f10522(var7), (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f10573(final SubLObject var39) {
        if (NIL != var39) {
            return (SubLObject)makeBoolean(NIL != module0173.f10969(var39) && NIL != module0269.f17707(var39));
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f10503(final SubLObject var7) {
        return (SubLObject)makeBoolean((NIL != module0173.f10955(var7) && NIL != module0269.f17707(var7)) || (NIL != f10488(var7) && NIL != module0035.f2370((SubLObject)$ic59$, f10522(var7), (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f10575(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != f10479(var7) && NIL == f10489(var7) && NIL != module0259.f16891(var7, $ic60$));
    }
    
    public static SubLObject f10557(final SubLObject var16) {
        final SubLObject var17 = f10576(var16);
        return (NIL != var17) ? var17 : $g2155$.getGlobalValue();
    }
    
    public static SubLObject f10576(final SubLObject var16) {
        return (NIL != f10489(var16)) ? f10536((SubLObject)$ic47$, var16) : var16;
    }
    
    public static SubLObject f10577(final SubLObject var56) {
        final SubLObject var57 = module0178.f11287(var56);
        final SubLObject var58 = f10557(var57);
        if (NIL != var58) {
            return var58;
        }
        return $g2155$.getGlobalValue();
    }
    
    public static SubLObject f10516(final SubLObject var12, final SubLObject var13) {
        return f10578(f10557(var12), f10557(var13));
    }
    
    public static SubLObject f10578(final SubLObject var12, final SubLObject var13) {
        return Equality.eql(var12, var13);
    }
    
    public static SubLObject f10579(final SubLObject var38) {
        return module0004.f104(var38, $g2163$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10580(final SubLObject var36) {
        return module0004.f104(var36, $g2171$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10581(final SubLObject var7) {
        return Equality.eql(var7, $g2160$.getGlobalValue());
    }
    
    public static SubLObject f10582(final SubLObject var7) {
        return Equality.eql(var7, $g2161$.getGlobalValue());
    }
    
    public static SubLObject f10546(final SubLObject var38) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        if (NIL != module0202.f12659(var38)) {
            var39.resetMultipleValues();
            final SubLObject var40 = f10583(var38);
            final SubLObject var41 = var39.secondMultipleValue();
            var39.resetMultipleValues();
            return (SubLObject)makeBoolean(var40.eql($g2160$.getGlobalValue()) && var41.eql($g2161$.getGlobalValue()));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10584(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != module0202.f12659(var7) && NIL != f10579(module0205.f13366(var7)));
    }
    
    public static SubLObject f10535(final SubLObject var7) {
        return Equality.eql(var7, $g2167$.getGlobalValue());
    }
    
    public static SubLObject f10493(final SubLObject var7) {
        return Equality.eql(var7, $g2168$.getGlobalValue());
    }
    
    public static SubLObject f10496(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != module0202.f12659(var7) && NIL != f10493(module0205.f13366(var7)));
    }
    
    public static SubLObject f10585(final SubLObject var16) {
        return f10535(f10586(var16));
    }
    
    public static SubLObject f10587(final SubLObject var16) {
        final SubLObject var17 = f10586(var16);
        return (SubLObject)makeBoolean(NIL != f10496(var17) && NIL != module0259.f16854(f10588(var17), $ic62$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f10589(final SubLObject var7) {
        if (NIL != f10489(var7)) {
            return module0035.sublisp_boolean(f10586(var7));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10590(final SubLObject var16) {
        return (SubLObject)makeBoolean(NIL == f10589(var16));
    }
    
    public static SubLObject f10532(final SubLObject var7) {
        if (NIL != f10535(var7)) {
            return (SubLObject)T;
        }
        if (NIL != f10496(var7)) {
            return (SubLObject)T;
        }
        if (NIL == f10495(var7)) {
            return (SubLObject)NIL;
        }
        final SubLObject var8 = module0205.f13366(var7);
        if (NIL != f10579(var8)) {
            return (SubLObject)T;
        }
        if (var8.eql($ic50$)) {
            return f10580(module0205.f13277(var7, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10591(final SubLObject var7) {
        return Equality.eq(var7, (SubLObject)$ic48$);
    }
    
    public static SubLObject f10592(final SubLObject var7) {
        return module0305.f20438(var7, $ic62$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10593(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != f10592(var7) || NIL != module0305.f20438(var7, $ic63$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f10594(final SubLObject var7) {
        return module0305.f20438(var7, $ic64$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10595(final SubLObject var77) {
        return (SubLObject)makeBoolean(NIL != module0202.f12659(var77) && module0205.f13366(var77).eql($ic15$));
    }
    
    public static SubLObject f10596(final SubLObject var77) {
        return (SubLObject)makeBoolean(NIL != module0202.f12659(var77) && module0205.f13366(var77).eql($ic14$));
    }
    
    public static SubLObject f10597(final SubLObject var77) {
        final SubLThread var78 = SubLProcess.currentSubLThread();
        if (NIL != f10584(var77)) {
            var78.resetMultipleValues();
            final SubLObject var79 = f10598(var77);
            final SubLObject var80 = var78.secondMultipleValue();
            var78.resetMultipleValues();
            return f10599(var79);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10600(final SubLObject var74) {
        return (SubLObject)makeBoolean(NIL != module0202.f12659(var74) && module0205.f13366(var74).eql($ic65$));
    }
    
    public static SubLObject f10599(final SubLObject var74) {
        return (SubLObject)makeBoolean(NIL != module0202.f12658(var74) && (NIL != f10600(var74) || NIL != module0035.f2369((SubLObject)$ic66$, module0205.f13304(var74, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f10601(final SubLObject var16) {
        final SubLObject var17 = f10586(var16);
        if (NIL != var17) {
            return f10597(var17);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10602(final SubLObject var16) {
        final SubLObject var17 = f10586(var16);
        return (SubLObject)makeBoolean(NIL != f10535(var17) || NIL != f10496(var17));
    }
    
    public static SubLObject f10517(final SubLObject var12, final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        if (var12.eql(var13)) {
            return (SubLObject)T;
        }
        final SubLObject var15 = f10601(var12);
        final SubLObject var16 = f10601(var13);
        if (NIL == var15 && NIL == var16) {
            var14.resetMultipleValues();
            final SubLObject var17 = f10583(var12);
            final SubLObject var18 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            var14.resetMultipleValues();
            final SubLObject var19 = f10583(var13);
            final SubLObject var20 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            return (SubLObject)makeBoolean(NIL != f10603(var17, var19) && NIL != f10604(var18, var20));
        }
        if (NIL != var15 && NIL != var16) {
            var14.resetMultipleValues();
            final SubLObject var17 = f10605(var12);
            final SubLObject var21 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            var14.resetMultipleValues();
            final SubLObject var19 = f10605(var13);
            final SubLObject var22 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            return (SubLObject)makeBoolean(NIL != f10603(var17, var19) && NIL != f10606(var21, var22));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10603(final SubLObject var12, final SubLObject var13) {
        return Equality.equal(var12, var13);
    }
    
    public static SubLObject f10604(final SubLObject var12, final SubLObject var13) {
        return Equality.equal(var12, var13);
    }
    
    public static SubLObject f10607(final SubLObject var88, final SubLObject var68) {
        return f10517(f10586(var88), f10586(var68));
    }
    
    public static SubLObject f10606(final SubLObject var89, final SubLObject var90) {
        final SubLObject var91 = module0202.f12595(var89);
        final SubLObject var92 = module0202.f12595(var90);
        if (NIL != var91 && NIL != var92) {
            Errors.cerror((SubLObject)$ic67$, (SubLObject)$ic68$);
            return (SubLObject)NIL;
        }
        if (NIL != var91) {
            return conses_high.subsetp(var90, var89, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        }
        if (NIL != var92) {
            return conses_high.subsetp(var89, var90, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        }
        return Equality.equal(var89, var90);
    }
    
    public static SubLObject f10586(final SubLObject var16) {
        return f10536((SubLObject)$ic48$, var16);
    }
    
    public static SubLObject f10608(final SubLObject var16) {
        return module0205.f13277(f10586(var16), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10609(final SubLObject var16) {
        final SubLObject var17 = module0205.f13277(f10586(var16), (SubLObject)UNPROVIDED);
        return (NIL != var17) ? var17 : $g2160$.getGlobalValue();
    }
    
    public static SubLObject f10610(final SubLObject var16) {
        final SubLObject var17 = module0205.f13368(f10586(var16), (SubLObject)UNPROVIDED);
        return (NIL != f10590(var16)) ? ((NIL != var17) ? var17 : $g2158$.getGlobalValue()) : ((NIL != var17) ? var17 : $g2161$.getGlobalValue());
    }
    
    public static SubLObject f10611(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic69$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic69$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic69$);
        var8 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            var5 = var6;
            SubLObject var9 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic69$);
            var9 = var5.first();
            final SubLObject var10;
            var5 = (var10 = var5.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list(var7, var8), (SubLObject)ConsesLow.list((SubLObject)$ic70$, (SubLObject)ConsesLow.list(var7, var8), (SubLObject)ConsesLow.list((SubLObject)$ic71$, var9)), ConsesLow.append(var10, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic69$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10598(final SubLObject var77) {
        if (NIL == var77) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL);
        }
        final SubLObject var79;
        final SubLObject var78 = var79 = module0205.f13366(var77);
        if (var79.eql($ic14$)) {
            return Values.values(module0205.f13277(var77, (SubLObject)UNPROVIDED), module0205.f13368(var77, (SubLObject)UNPROVIDED));
        }
        if (var79.eql($ic15$)) {
            return Values.values(module0205.f13277(var77, (SubLObject)UNPROVIDED), $ic3$);
        }
        Errors.cerror((SubLObject)$ic67$, (SubLObject)$ic72$, var77);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10605(final SubLObject var77) {
        return Values.values(module0205.f13277(var77, (SubLObject)UNPROVIDED), module0205.f13368(var77, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f10588(final SubLObject var97) {
        return module0205.f13367(var97, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10612(final SubLObject var16, final SubLObject var98, final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        final SubLObject var101 = f10586(var16);
        if (NIL != f10535(var101)) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL);
        }
        if (NIL != f10496(var101)) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL);
        }
        SubLObject var102 = (SubLObject)NIL;
        SubLObject var103 = (SubLObject)NIL;
        var100.resetMultipleValues();
        final SubLObject var100_101 = f10598(var101);
        final SubLObject var102_103 = var100.secondMultipleValue();
        var100.resetMultipleValues();
        var102 = var100_101;
        var103 = var102_103;
        if (NIL == var102) {
            if (var98 == $ic73$) {
                var102 = $g2160$.getGlobalValue();
            }
            else {
                var102 = var98;
            }
        }
        if (NIL == var103) {
            if (var99 == $ic73$) {
                var103 = $g2161$.getGlobalValue();
            }
            else {
                var103 = var99;
            }
        }
        return Values.values(var102, var103);
    }
    
    public static SubLObject f10583(final SubLObject var16) {
        return f10612(var16, $g2160$.getGlobalValue(), $g2161$.getGlobalValue());
    }
    
    public static SubLObject f10613(final SubLObject var16, final SubLObject var104) {
        if (NIL != var104) {
            return f10612(var16, $g2160$.getGlobalValue(), $g2158$.getGlobalValue());
        }
        return f10583(var16);
    }
    
    public static SubLObject f10614(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic74$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic74$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic74$);
        var8 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic74$);
        var9 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            var5 = var6;
            SubLObject var10 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic74$);
            var10 = var5.first();
            final SubLObject var11;
            var5 = (var11 = var5.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)$ic22$, var10)), var8, var9), (SubLObject)ConsesLow.list((SubLObject)$ic70$, (SubLObject)ConsesLow.list(var8, var9), (SubLObject)ConsesLow.list((SubLObject)$ic75$, var10)), ConsesLow.append(var11, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic74$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10615(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic74$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic74$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic74$);
        var8 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic74$);
        var9 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            var5 = var6;
            SubLObject var10 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic74$);
            var10 = var5.first();
            final SubLObject var11;
            var5 = (var11 = var5.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)$ic76$, var10)), var8, var9), (SubLObject)ConsesLow.list((SubLObject)$ic70$, (SubLObject)ConsesLow.list(var8, var9), (SubLObject)ConsesLow.listS((SubLObject)$ic77$, var10, (SubLObject)$ic78$)), ConsesLow.append(var11, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic74$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10616(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic69$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic69$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic69$);
        var8 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            var5 = var6;
            SubLObject var9 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic69$);
            var9 = var5.first();
            final SubLObject var10;
            var5 = (var10 = var5.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list(var7, var8), (SubLObject)ConsesLow.list((SubLObject)$ic70$, (SubLObject)ConsesLow.list(var7, var8), (SubLObject)ConsesLow.listS((SubLObject)$ic77$, var9, (SubLObject)$ic79$)), ConsesLow.append(var10, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic69$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10617(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic69$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic69$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic69$);
        var8 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            var5 = var6;
            SubLObject var9 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic69$);
            var9 = var5.first();
            final SubLObject var10;
            var5 = (var10 = var5.rest());
            return (SubLObject)ConsesLow.list((SubLObject)$ic80$, (SubLObject)ConsesLow.list((SubLObject)$ic81$, var9), (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list(reader.bq_cons(var7, (SubLObject)$ic82$), reader.bq_cons(var8, (SubLObject)$ic83$)), ConsesLow.append(var10, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic69$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10618(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic69$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic69$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic69$);
        var8 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            var5 = var6;
            SubLObject var9 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic69$);
            var9 = var5.first();
            final SubLObject var10;
            var5 = (var10 = var5.rest());
            return (SubLObject)ConsesLow.list((SubLObject)$ic80$, (SubLObject)ConsesLow.list((SubLObject)$ic81$, var9), (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)ConsesLow.list(reader.bq_cons(var7, (SubLObject)$ic82$), reader.bq_cons(var8, (SubLObject)$ic84$)), ConsesLow.append(var10, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic69$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10543(final SubLObject var96, SubLObject var52) {
        if (var52 == UNPROVIDED) {
            var52 = (SubLObject)NIL;
        }
        if (NIL != f10535(var96)) {
            return var96;
        }
        if (NIL != f10496(var96)) {
            return var96;
        }
        if (NIL != var52) {
            return (SubLObject)ConsesLow.list($ic14$, var96, var52);
        }
        return (SubLObject)ConsesLow.list($ic15$, var96);
    }
    
    public static SubLObject f10526(final SubLObject var73, final SubLObject var96, final SubLObject var52) {
        return f10518((SubLObject)ConsesLow.list(var73, f10543(var96, var52)));
    }
    
    public static SubLObject f10619(final SubLObject var73, final SubLObject var76) {
        return module0162.f10628(f10518((SubLObject)ConsesLow.list(var73, var76)));
    }
    
    public static SubLObject f10620(final SubLObject var73, final SubLObject var96) {
        return f10518((SubLObject)ConsesLow.list(var73, f10543(var96, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f10568() {
        return (SubLObject)ConsesLow.list($ic15$, $g2160$.getGlobalValue());
    }
    
    public static SubLObject f10621(final SubLObject var74) {
        return (SubLObject)ConsesLow.list($ic15$, var74);
    }
    
    public static SubLObject f10566(final SubLObject var120) {
        if (NIL != f10595(var120)) {
            return f10622(var120);
        }
        return var120;
    }
    
    public static SubLObject f10567(final SubLObject var120) {
        final SubLThread var121 = SubLProcess.currentSubLThread();
        if (NIL != f10596(var120)) {
            SubLObject var122 = (SubLObject)NIL;
            SubLObject var123 = (SubLObject)NIL;
            var121.resetMultipleValues();
            final SubLObject var121_122 = f10598(var120);
            final SubLObject var123_124 = var121.secondMultipleValue();
            var121.resetMultipleValues();
            var122 = var121_122;
            var123 = var123_124;
            if (NIL != f10582(var123)) {
                return f10621(var122);
            }
        }
        return var120;
    }
    
    public static SubLObject f10622(final SubLObject var77) {
        final SubLObject var78 = module0205.f13277(var77, (SubLObject)UNPROVIDED);
        return (SubLObject)ConsesLow.list($ic14$, var78, $g2161$.getGlobalValue());
    }
    
    public static SubLObject f10574(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (NIL != f10532(var7)) {
            final SubLObject var9 = module0205.f13366(var7);
            SubLObject var10 = (SubLObject)NIL;
            SubLObject var11 = (SubLObject)NIL;
            var8.resetMultipleValues();
            final SubLObject var125_126 = f10598(var7);
            final SubLObject var127_128 = var8.secondMultipleValue();
            var8.resetMultipleValues();
            var10 = var125_126;
            var11 = var127_128;
            final SubLObject var12 = var9;
            if (var12.eql($ic15$)) {
                return f10623(var10);
            }
            if (var12.eql($ic14$)) {
                return (SubLObject)makeBoolean(NIL != f10623(var10) && NIL != f10624(var11));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10623(final SubLObject var96) {
        return (SubLObject)makeBoolean(NIL == var96 || NIL != module0259.f16891(var96, $ic63$));
    }
    
    public static SubLObject f10624(final SubLObject var52) {
        return (SubLObject)makeBoolean(NIL == var52 || NIL != module0259.f16891(var52, $ic64$));
    }
    
    public static SubLObject f10510(final SubLObject var10) {
        return (SubLObject)makeBoolean(NIL != module0035.f1995(var10, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && NIL != f10623(var10.first()) && NIL != f10624(conses_high.second(var10)));
    }
    
    public static SubLObject f10511(final SubLObject var10) {
        return (SubLObject)makeBoolean(NIL != module0035.f1995(var10, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL != f10623(var10.first()));
    }
    
    public static SubLObject f10625() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10471", "S#13278", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0161", "f10472", "S#13279");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10473", "S#13280", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10474", "S#13281", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10475", "S#13282", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10476", "S#13283", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10477", "S#13284", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10478", "S#13285", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10479", "S#12264", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10480", "S#12265", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10482", "S#13286", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10484", "S#11214", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10483", "S#13261", 1, 0, false);
        new $f10483$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10485", "S#13287", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10481", "S#12263", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10487", "S#13288", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10486", "S#13289", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10490", "S#13290", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10489", "S#13291", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10494", "S#13292", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10497", "S#13293", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10495", "S#13294", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10488", "S#12333", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10492", "S#13295", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10499", "S#13265", 1, 0, false);
        new $f10499$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10500", "S#13296", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10502", "S#13297", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10501", "S#13298", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10505", "S#13299", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10506", "S#13300", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10508", "S#13301", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10507", "S#13302", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10509", "S#13303", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10504", "S#13304", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10512", "S#13305", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10513", "HLMT-EQUAL", 2, 0, false);
        new $f10513$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10514", "S#12762", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10518", "S#13306", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10519", "S#13307", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10520", "S#13308", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10521", "S#13309", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10522", "S#12266", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10523", "S#13310", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10524", "S#13266", 1, 0, false);
        new $f10524$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10525", "UNION-MT-RELEVANCE-CONTEXTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10527", "S#13311", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10528", "S#13312", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10498", "S#13313", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10491", "S#13314", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10529", "S#13315", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0161", "f10530", "S#13316");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10531", "S#13317", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10533", "S#13268", 1, 0, false);
        new $f10533$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10534", "S#13318", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10536", "S#13319", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10537", "S#13320", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10538", "S#13321", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10540", "S#13322", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10541", "S#13323", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10542", "S#13324", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10544", "S#13325", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10547", "S#13326", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10548", "S#13327", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10550", "S#13328", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10552", "S#13329", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10551", "S#13330", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10555", "S#13331", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10556", "S#13332", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10559", "S#13333", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10561", "S#13334", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10562", "S#13335", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10563", "S#13336", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10560", "S#13337", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10539", "S#13338", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10564", "S#13339", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10565", "S#13340", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10553", "S#13341", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10558", "S#13342", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10554", "S#13343", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10569", "S#13344", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10570", "S#13345", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10571", "S#13346", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10572", "S#13347", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10545", "S#13348", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10549", "S#13349", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10515", "S#13272", 1, 0, false);
        new $f10515$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10573", "S#13350", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10503", "S#13351", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10575", "MONAD-CYCL-MT?", 1, 0, false);
        new $f10575$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10557", "HLMT-MONAD-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10576", "S#13352", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10577", "S#13353", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10516", "S#13354", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10578", "S#13355", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10579", "S#13356", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10580", "S#13357", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10581", "S#13358", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10582", "S#13359", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10546", "S#13360", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10584", "S#13361", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10535", "S#12259", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10493", "S#13362", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10496", "S#13363", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10585", "S#13364", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10587", "S#13365", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10589", "S#13366", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10590", "S#13367", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10532", "TEMPORAL-DIMENSION-MT-P", 1, 0, false);
        new $f10532$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10591", "S#13368", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10592", "S#13369", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10593", "S#13370", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10594", "S#13371", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10595", "S#13372", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10596", "S#13373", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10597", "S#13374", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10600", "S#13375", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10599", "S#13376", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10601", "S#13377", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10602", "S#13378", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10517", "S#13379", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10603", "S#13380", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10604", "S#13381", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10607", "S#13382", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10606", "S#13383", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10586", "HLMT-TEMPORAL-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10608", "S#13384", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10609", "S#13385", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10610", "S#13386", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0161", "f10611", "S#13387");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10598", "S#13388", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10605", "S#13389", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10588", "S#12260", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10612", "S#13390", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10583", "S#13391", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10613", "S#13392", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0161", "f10614", "S#13393");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0161", "f10615", "S#13394");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0161", "f10616", "S#13395");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0161", "f10617", "S#13396");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0161", "f10618", "S#13397");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10543", "S#12261", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10526", "S#13398", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10619", "S#13399", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10620", "S#13400", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10568", "S#13401", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10621", "S#13402", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10566", "S#13403", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10567", "S#13404", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10622", "S#13405", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10574", "S#13406", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10623", "S#13407", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10624", "S#13408", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10510", "S#13409", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0161", "f10511", "S#13410", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10626() {
        $g2154$ = SubLFiles.defvar("S#13411", (SubLObject)T);
        $g2155$ = SubLFiles.deflexical("S#13412", $ic2$);
        $g2156$ = SubLFiles.deflexical("S#13413", $ic3$);
        $g2157$ = SubLFiles.deflexical("S#13414", $ic3$);
        $g2158$ = SubLFiles.deflexical("S#13415", $ic4$);
        $g2159$ = SubLFiles.deflexical("S#13416", $ic3$);
        $g2160$ = SubLFiles.deflexical("S#13417", $ic5$);
        $g2161$ = SubLFiles.deflexical("S#13418", $ic3$);
        $g2162$ = SubLFiles.deflexical("S#13419", $ic6$);
        $g2163$ = SubLFiles.deflexical("S#13420", (SubLObject)$ic7$);
        $g2164$ = SubLFiles.deflexical("S#13421", (SubLObject)$ic8$);
        $g2165$ = SubLFiles.deflexical("S#13422", (SubLObject)$ic9$);
        $g2166$ = SubLFiles.deflexical("S#13423", (SubLObject)ConsesLow.cons($g2162$.getGlobalValue(), $g2165$.getGlobalValue()));
        $g2167$ = SubLFiles.deflexical("S#13424", $ic10$);
        $g2168$ = SubLFiles.deflexical("S#13425", $ic11$);
        $g2169$ = SubLFiles.deflexical("S#13426", (SubLObject)$ic12$);
        $g2170$ = SubLFiles.deflexical("S#13427", (SubLObject)NIL);
        $g2171$ = SubLFiles.deflexical("S#13428", (SubLObject)$ic61$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10627() {
        module0002.f38((SubLObject)$ic18$);
        module0002.f50((SubLObject)$ic39$, (SubLObject)$ic46$);
        module0034.f1909((SubLObject)$ic55$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f10625();
    }
    
    public void initializeVariables() {
        f10626();
    }
    
    public void runTopLevelForms() {
        f10627();
    }
    
    static {
        me = (SubLFile)new module0161();
        $g2154$ = null;
        $g2155$ = null;
        $g2156$ = null;
        $g2157$ = null;
        $g2158$ = null;
        $g2159$ = null;
        $g2160$ = null;
        $g2161$ = null;
        $g2162$ = null;
        $g2163$ = null;
        $g2164$ = null;
        $g2165$ = null;
        $g2166$ = null;
        $g2167$ = null;
        $g2168$ = null;
        $g2169$ = null;
        $g2170$ = null;
        $g2171$ = null;
        $ic0$ = makeSymbol("CLET");
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#13411", "CYC"), (SubLObject)T));
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("Null-TimeParameter"));
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("TimePoint"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("Always-TimeInterval"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("MtSpace"));
        $ic7$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("MtTimeWithGranularityDimFn")), constant_handles_oc.f8479((SubLObject)makeString("MtTimeDimFn")));
        $ic8$ = ConsesLow.list((SubLObject)makeKeyword("MONAD"), (SubLObject)makeKeyword("TIME"));
        $ic9$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("MtDim")), constant_handles_oc.f8479((SubLObject)makeString("MtTimeDimFn")), constant_handles_oc.f8479((SubLObject)makeString("MtTimeWithGranularityDimFn")));
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("AnytimePSC"));
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("AnytimeDuringPSCFn"));
        $ic12$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("MtSpace")), constant_handles_oc.f8479((SubLObject)makeString("MtDim")), constant_handles_oc.f8479((SubLObject)makeString("MtTimeDimFn")), constant_handles_oc.f8479((SubLObject)makeString("MtTimeWithGranularityDimFn")), constant_handles_oc.f8479((SubLObject)makeString("mtTimeIndex")), constant_handles_oc.f8479((SubLObject)makeString("mtTimeParameter")), constant_handles_oc.f8479((SubLObject)makeString("mtMonad")), constant_handles_oc.f8479((SubLObject)makeString("Always-TimeInterval")), constant_handles_oc.f8479((SubLObject)makeString("Null-TimeParameter")), constant_handles_oc.f8479((SubLObject)makeString("TimePoint")) });
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("MtUnionFn"));
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("MtTimeWithGranularityDimFn"));
        $ic15$ = constant_handles_oc.f8479((SubLObject)makeString("MtTimeDimFn"));
        $ic16$ = makeSymbol("LISTP");
        $ic17$ = makeSymbol("S#13266", "CYC");
        $ic18$ = makeSymbol("UNION-MT-RELEVANCE-CONTEXTS");
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic21$ = makeSymbol("S#13364", "CYC");
        $ic22$ = makeSymbol("HLMT-MONAD-MT");
        $ic23$ = constant_handles_oc.f8479((SubLObject)makeString("MicrotheoryDimensionPredicate"));
        $ic24$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#13429", "CYC"), (SubLObject)makeSymbol("S#13430", "CYC"), (SubLObject)makeSymbol("S#13431", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic25$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic26$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic27$ = makeKeyword("DONE");
        $ic28$ = makeUninternedSymbol("US#74A08C1");
        $ic29$ = makeUninternedSymbol("US#74A0892");
        $ic30$ = makeSymbol("PCOND");
        $ic31$ = makeSymbol("S#13272", "CYC");
        $ic32$ = makeSymbol("PUNLESS");
        $ic33$ = ConsesLow.list((SubLObject)makeKeyword("MONAD"));
        $ic34$ = makeSymbol("S#13294", "CYC");
        $ic35$ = makeSymbol("S#13318", "CYC");
        $ic36$ = makeSymbol("S#13292", "CYC");
        $ic37$ = makeSymbol("S#13263", "CYC");
        $ic38$ = makeSymbol("CSOME");
        $ic39$ = makeSymbol("S#13317", "CYC");
        $ic40$ = makeSymbol("COR");
        $ic41$ = makeSymbol("S#12259", "CYC");
        $ic42$ = makeSymbol("S#13363", "CYC");
        $ic43$ = ConsesLow.list((SubLObject)makeKeyword("TIME"));
        $ic44$ = makeSymbol("S#13287", "CYC");
        $ic45$ = ConsesLow.list((SubLObject)makeKeyword("UNKNOWN"));
        $ic46$ = makeSymbol("S#13316", "CYC");
        $ic47$ = makeKeyword("MONAD");
        $ic48$ = makeKeyword("TIME");
        $ic49$ = makeKeyword("UNKNOWN");
        $ic50$ = constant_handles_oc.f8479((SubLObject)makeString("MtDim"));
        $ic51$ = constant_handles_oc.f8479((SubLObject)makeString("mtMonad"));
        $ic52$ = constant_handles_oc.f8479((SubLObject)makeString("mtTimeIndex"));
        $ic53$ = constant_handles_oc.f8479((SubLObject)makeString("mtTimeParameter"));
        $ic54$ = makeSymbol("S#13327", "CYC");
        $ic55$ = makeSymbol("S#13337", "CYC");
        $ic56$ = makeSymbol("S#13427", "CYC");
        $ic57$ = makeSymbol("S#13334", "CYC");
        $ic58$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic59$ = makeSymbol("S#13351", "CYC");
        $ic60$ = constant_handles_oc.f8479((SubLObject)makeString("Microtheory"));
        $ic61$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("mtTimeIndex")), constant_handles_oc.f8479((SubLObject)makeString("mtTimeParameter")));
        $ic62$ = constant_handles_oc.f8479((SubLObject)makeString("TimeInterval"));
        $ic63$ = constant_handles_oc.f8479((SubLObject)makeString("TemporalThing"));
        $ic64$ = constant_handles_oc.f8479((SubLObject)makeString("TimeParameter"));
        $ic65$ = constant_handles_oc.f8479((SubLObject)makeString("SomeTimeInIntervalFn"));
        $ic66$ = makeSymbol("S#13376", "CYC");
        $ic67$ = makeString("Continue Anyway.");
        $ic68$ = makeString("We should never test two some time conjuncts.");
        $ic69$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#13432", "CYC"), (SubLObject)makeSymbol("S#13433", "CYC")), (SubLObject)makeSymbol("S#13431", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic70$ = makeSymbol("CMULTIPLE-VALUE-SETQ");
        $ic71$ = makeSymbol("S#13388", "CYC");
        $ic72$ = makeString("DIM-NAT ~a is not a microtheory time dimension NAT");
        $ic73$ = makeKeyword("ERROR");
        $ic74$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#13434", "CYC"), (SubLObject)makeSymbol("S#13432", "CYC"), (SubLObject)makeSymbol("S#13433", "CYC")), (SubLObject)makeSymbol("S#13431", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic75$ = makeSymbol("S#13391", "CYC");
        $ic76$ = makeSymbol("S#13352", "CYC");
        $ic77$ = makeSymbol("S#13390", "CYC");
        $ic78$ = ConsesLow.list((SubLObject)NIL, (SubLObject)NIL);
        $ic79$ = ConsesLow.list((SubLObject)makeSymbol("S#13417", "CYC"), (SubLObject)makeSymbol("S#13413", "CYC"));
        $ic80$ = makeSymbol("PROGN");
        $ic81$ = makeSymbol("IGNORE");
        $ic82$ = ConsesLow.list((SubLObject)makeSymbol("S#13417", "CYC"));
        $ic83$ = ConsesLow.list((SubLObject)makeSymbol("S#13415", "CYC"));
        $ic84$ = ConsesLow.list((SubLObject)makeSymbol("S#13416", "CYC"));
    }
    
    public static final class $f10483$UnaryFunction extends UnaryFunction
    {
        public $f10483$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#13261"));
        }
        
        public SubLObject processItem(final SubLObject var8) {
            return f10483(var8);
        }
    }
    
    public static final class $f10499$UnaryFunction extends UnaryFunction
    {
        public $f10499$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#13265"));
        }
        
        public SubLObject processItem(final SubLObject var8) {
            return f10499(var8);
        }
    }
    
    public static final class $f10513$BinaryFunction extends BinaryFunction
    {
        public $f10513$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HLMT-EQUAL"));
        }
        
        public SubLObject processItem(final SubLObject var8, final SubLObject var14) {
            return f10513(var8, var14);
        }
    }
    
    public static final class $f10524$UnaryFunction extends UnaryFunction
    {
        public $f10524$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#13266"));
        }
        
        public SubLObject processItem(final SubLObject var8) {
            return f10524(var8);
        }
    }
    
    public static final class $f10533$UnaryFunction extends UnaryFunction
    {
        public $f10533$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#13268"));
        }
        
        public SubLObject processItem(final SubLObject var8) {
            return f10533(var8);
        }
    }
    
    public static final class $f10515$UnaryFunction extends UnaryFunction
    {
        public $f10515$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#13272"));
        }
        
        public SubLObject processItem(final SubLObject var8) {
            return f10515(var8);
        }
    }
    
    public static final class $f10575$UnaryFunction extends UnaryFunction
    {
        public $f10575$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("MONAD-CYCL-MT?"));
        }
        
        public SubLObject processItem(final SubLObject var8) {
            return f10575(var8);
        }
    }
    
    public static final class $f10532$UnaryFunction extends UnaryFunction
    {
        public $f10532$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TEMPORAL-DIMENSION-MT-P"));
        }
        
        public SubLObject processItem(final SubLObject var8) {
            return f10532(var8);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 493 ms
	
	Decompiled with Procyon 0.5.32.
*/