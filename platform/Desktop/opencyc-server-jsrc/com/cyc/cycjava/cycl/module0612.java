package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0612 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0612";
    public static final String myFingerPrint = "2540d5cf03ddc9f65c819f50ebe45db07165f0621287a2f8b9924681366e2616";
    private static SubLSymbol $g4711$;
    private static SubLSymbol $g4712$;
    private static SubLSymbol $g4713$;
    public static SubLSymbol $g2464$;
    public static SubLSymbol $g2466$;
    public static SubLSymbol $g4714$;
    private static SubLSymbol $g4715$;
    private static SubLSymbol $g4716$;
    private static SubLSymbol $g4717$;
    private static SubLSymbol $g4718$;
    private static SubLSymbol $g4719$;
    private static SubLSymbol $g4720$;
    private static SubLSymbol $g4721$;
    public static SubLSymbol $g4722$;
    public static SubLSymbol $g4513$;
    public static SubLSymbol $g4723$;
    public static SubLSymbol $g4724$;
    private static SubLSymbol $g4725$;
    private static SubLSymbol $g4726$;
    private static SubLSymbol $g4727$;
    private static SubLSymbol $g4728$;
    private static SubLSymbol $g4729$;
    private static SubLSymbol $g4730$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLList $ic12$;
    private static final SubLList $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
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
    private static final SubLObject $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLObject $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLObject $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLObject $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLInteger $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLObject $ic66$;
    private static final SubLObject $ic67$;
    private static final SubLObject $ic68$;
    private static final SubLObject $ic69$;
    private static final SubLObject $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLObject $ic72$;
    private static final SubLInteger $ic73$;
    private static final SubLInteger $ic74$;
    private static final SubLObject $ic75$;
    private static final SubLObject $ic76$;
    private static final SubLInteger $ic77$;
    private static final SubLObject $ic78$;
    private static final SubLInteger $ic79$;
    private static final SubLList $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLObject $ic84$;
    private static final SubLList $ic85$;
    private static final SubLString $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLObject $ic90$;
    private static final SubLList $ic91$;
    private static final SubLInteger $ic92$;
    private static final SubLInteger $ic93$;
    private static final SubLInteger $ic94$;
    private static final SubLInteger $ic95$;
    private static final SubLInteger $ic96$;
    private static final SubLList $ic97$;
    private static final SubLObject $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLObject $ic101$;
    private static final SubLObject $ic102$;
    private static final SubLObject $ic103$;
    private static final SubLObject $ic104$;
    private static final SubLObject $ic105$;
    private static final SubLObject $ic106$;
    private static final SubLInteger $ic107$;
    private static final SubLInteger $ic108$;
    private static final SubLObject $ic109$;
    private static final SubLObject $ic110$;
    private static final SubLObject $ic111$;
    private static final SubLObject $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLObject $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLString $ic116$;
    private static final SubLInteger $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLString $ic119$;
    private static final SubLInteger $ic120$;
    private static final SubLString $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLList $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLList $ic128$;
    private static final SubLList $ic129$;
    private static final SubLList $ic130$;
    private static final SubLList $ic131$;
    private static final SubLInteger $ic132$;
    private static final SubLObject $ic133$;
    private static final SubLObject $ic134$;
    private static final SubLObject $ic135$;
    private static final SubLObject $ic136$;
    private static final SubLObject $ic137$;
    private static final SubLObject $ic138$;
    private static final SubLObject $ic139$;
    private static final SubLObject $ic140$;
    private static final SubLObject $ic141$;
    private static final SubLObject $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLString $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLString $ic151$;
    private static final SubLString $ic152$;
    private static final SubLString $ic153$;
    private static final SubLList $ic154$;
    private static final SubLList $ic155$;
    private static final SubLList $ic156$;
    private static final SubLString $ic157$;
    private static final SubLList $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLList $ic160$;
    private static final SubLInteger $ic161$;
    private static final SubLInteger $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLInteger $ic164$;
    private static final SubLInteger $ic165$;
    private static final SubLList $ic166$;
    private static final SubLList $ic167$;
    private static final SubLString $ic168$;
    private static final SubLString $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLString $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLList $ic185$;
    private static final SubLList $ic186$;
    private static final SubLInteger $ic187$;
    private static final SubLList $ic188$;
    private static final SubLList $ic189$;
    private static final SubLList $ic190$;
    private static final SubLList $ic191$;
    private static final SubLList $ic192$;
    private static final SubLList $ic193$;
    private static final SubLList $ic194$;
    private static final SubLList $ic195$;
    private static final SubLList $ic196$;
    private static final SubLList $ic197$;
    private static final SubLList $ic198$;
    private static final SubLList $ic199$;
    private static final SubLList $ic200$;
    private static final SubLList $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLList $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLString $ic206$;
    private static final SubLString $ic207$;
    private static final SubLString $ic208$;
    private static final SubLString $ic209$;
    private static final SubLString $ic210$;
    private static final SubLString $ic211$;
    private static final SubLString $ic212$;
    private static final SubLString $ic213$;
    private static final SubLString $ic214$;
    private static final SubLString $ic215$;
    private static final SubLString $ic216$;
    private static final SubLString $ic217$;
    private static final SubLString $ic218$;
    private static final SubLString $ic219$;
    private static final SubLString $ic220$;
    private static final SubLString $ic221$;
    private static final SubLString $ic222$;
    private static final SubLString $ic223$;
    private static final SubLString $ic224$;
    private static final SubLList $ic225$;
    private static final SubLList $ic226$;
    private static final SubLList $ic227$;
    private static final SubLList $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLString $ic230$;
    private static final SubLString $ic231$;
    private static final SubLString $ic232$;
    private static final SubLString $ic233$;
    private static final SubLString $ic234$;
    private static final SubLString $ic235$;
    private static final SubLString $ic236$;
    private static final SubLList $ic237$;
    
    public static SubLObject f37379() {
        if (module0612.NIL != module0035.f2370((SubLObject)module0612.$ic1$, module0612.$g4711$.getGlobalValue(), (SubLObject)module0612.UNPROVIDED)) {
            module0131.f8567();
        }
        else {
            module0131.f8568();
        }
        return module0131.f8566();
    }
    
    public static SubLObject f37380(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0612.NIL != f37381(var1) || var1.isInteger());
    }
    
    public static SubLObject f37381(final SubLObject var1) {
        return module0202.f12590(var1);
    }
    
    public static SubLObject f37382(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0612.NIL != f37381(var1) && module0612.NIL != f37383(var1));
    }
    
    public static SubLObject f37384(final SubLObject var1) {
        return module0202.f12590(var1);
    }
    
    public static SubLObject f37385(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0612.NIL != f37384(var1) && module0612.NIL != f37386(var1));
    }
    
    public static SubLObject f37387(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0612.NIL != f37382(var1) || module0612.NIL != f37388(var1) || module0612.NIL != f37389(var1) || module0612.NIL != f37390(var1));
    }
    
    public static SubLObject f37391(final SubLObject var1, SubLObject var2) {
        if (var2 == module0612.UNPROVIDED) {
            var2 = (SubLObject)module0612.NIL;
        }
        if (module0612.NIL != module0035.f2496(var1)) {
            return (SubLObject)module0612.NIL;
        }
        SubLObject var3 = (SubLObject)module0612.NIL;
        if (module0612.NIL == var3) {
            SubLObject var4 = module0612.$g4712$.getGlobalValue().rest();
            SubLObject var5 = (SubLObject)module0612.NIL;
            var5 = var4.first();
            while (module0612.NIL == var3 && module0612.NIL != var4) {
                if (var5.isList() && (module0612.NIL == var2 || var2.eql(var5.first()))) {
                    var3 = ((module0612.NIL != module0035.f2428((SubLObject)module0612.$ic2$, var5, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED)) ? module0035.f2428((SubLObject)ConsesLow.list(var5.first(), (SubLObject)module0612.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0612.$ic2$, (SubLObject)module0612.$ic4$)), var1, (SubLObject)module0612.$ic5$, (SubLObject)module0612.UNPROVIDED) : module0035.f2428((SubLObject)ConsesLow.list(var5.first(), (SubLObject)module0612.$ic3$), var1, (SubLObject)module0612.$ic5$, (SubLObject)module0612.UNPROVIDED));
                }
                var4 = var4.rest();
                var5 = var4.first();
            }
        }
        return module0035.sublisp_boolean(var3);
    }
    
    public static SubLObject f37383(final SubLObject var6) {
        return module0337.f22628(module0612.$g4712$.getGlobalValue(), var6);
    }
    
    public static SubLObject f37392(final SubLObject var1) {
        return module0337.f22628((SubLObject)module0612.$ic4$, var1);
    }
    
    public static SubLObject f37386(final SubLObject var6) {
        return module0337.f22628(module0612.$g4713$.getGlobalValue(), var6);
    }
    
    public static SubLObject f37389(final SubLObject var8) {
        return Equality.eq(var8, module0612.$g2464$.getGlobalValue());
    }
    
    public static SubLObject f37388(final SubLObject var8) {
        return Equality.eq(var8, module0612.$g2466$.getGlobalValue());
    }
    
    public static SubLObject f37390(final SubLObject var9) {
        return Equality.eq(var9, module0612.$ic10$);
    }
    
    public static SubLObject f37393(final SubLObject var9) {
        return Equality.eq(var9, module0612.$ic11$);
    }
    
    public static SubLObject f37394(final SubLObject var10, final SubLObject var11) {
        return module0004.f104(var10, conses_high.member(var11, module0612.$g4714$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0612.EQ), (SubLObject)module0612.UNPROVIDED).rest(), Symbols.symbol_function((SubLObject)module0612.EQ), (SubLObject)module0612.UNPROVIDED);
    }
    
    public static SubLObject f37395(final SubLObject var12, final SubLObject var13) {
        SubLObject var15;
        final SubLObject var14 = var15 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0612.$ic13$);
        final SubLObject var16 = var15.rest();
        var15 = var15.first();
        SubLObject var17 = (SubLObject)module0612.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0612.$ic13$);
        var17 = var15.first();
        var15 = var15.rest();
        SubLObject var18 = (SubLObject)module0612.NIL;
        SubLObject var19 = var15;
        SubLObject var20 = (SubLObject)module0612.NIL;
        SubLObject var21_22 = (SubLObject)module0612.NIL;
        while (module0612.NIL != var19) {
            cdestructuring_bind.destructuring_bind_must_consp(var19, var14, (SubLObject)module0612.$ic13$);
            var21_22 = var19.first();
            var19 = var19.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var19, var14, (SubLObject)module0612.$ic13$);
            if (module0612.NIL == conses_high.member(var21_22, (SubLObject)module0612.$ic14$, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED)) {
                var20 = (SubLObject)module0612.T;
            }
            if (var21_22 == module0612.$ic15$) {
                var18 = var19.first();
            }
            var19 = var19.rest();
        }
        if (module0612.NIL != var20 && module0612.NIL == var18) {
            cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)module0612.$ic13$);
        }
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)module0612.$ic16$, var15);
        final SubLObject var22 = (SubLObject)((module0612.NIL != var21) ? conses_high.cadr(var21) : module0612.NIL);
        final SubLObject var23;
        var15 = (var23 = var16);
        return (SubLObject)ConsesLow.listS((SubLObject)module0612.$ic17$, (SubLObject)ConsesLow.list(var17, (SubLObject)module0612.$ic18$, var22), ConsesLow.append(var23, (SubLObject)module0612.NIL));
    }
    
    public static SubLObject f37396(final SubLObject var26, final SubLObject var27) {
        return module0004.f104(var26, conses_high.member(var27, module0612.$g4715$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0612.EQ), (SubLObject)module0612.UNPROVIDED).rest(), Symbols.symbol_function((SubLObject)module0612.EQ), (SubLObject)module0612.UNPROVIDED);
    }
    
    public static SubLObject f37397(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        var9.resetMultipleValues();
        final SubLObject var10 = f37398(var8);
        final SubLObject var11 = var9.secondMultipleValue();
        final SubLObject var12 = var9.thirdMultipleValue();
        final SubLObject var13 = var9.fourthMultipleValue();
        final SubLObject var14 = var9.fifthMultipleValue();
        final SubLObject var15 = var9.sixthMultipleValue();
        final SubLObject var16 = var9.seventhMultipleValue();
        var9.resetMultipleValues();
        final SubLObject var17 = var10;
        if (var17.eql((SubLObject)module0612.$ic20$)) {
            return var11;
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37399(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        var9.resetMultipleValues();
        final SubLObject var10 = f37398(var8);
        final SubLObject var11 = var9.secondMultipleValue();
        final SubLObject var12 = var9.thirdMultipleValue();
        final SubLObject var13 = var9.fourthMultipleValue();
        final SubLObject var14 = var9.fifthMultipleValue();
        final SubLObject var15 = var9.sixthMultipleValue();
        final SubLObject var16 = var9.seventhMultipleValue();
        var9.resetMultipleValues();
        final SubLObject var17 = var10;
        if (var17.eql((SubLObject)module0612.$ic20$)) {
            return (SubLObject)module0612.NIL;
        }
        if (var17.eql((SubLObject)module0612.$ic21$)) {
            return var11;
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37400(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        var9.resetMultipleValues();
        final SubLObject var10 = f37398(var8);
        final SubLObject var11 = var9.secondMultipleValue();
        final SubLObject var12 = var9.thirdMultipleValue();
        final SubLObject var13 = var9.fourthMultipleValue();
        final SubLObject var14 = var9.fifthMultipleValue();
        final SubLObject var15 = var9.sixthMultipleValue();
        final SubLObject var16 = var9.seventhMultipleValue();
        var9.resetMultipleValues();
        final SubLObject var17 = var10;
        if (var17.eql((SubLObject)module0612.$ic21$) || var17.eql((SubLObject)module0612.$ic20$)) {
            return (SubLObject)module0612.NIL;
        }
        return var11;
    }
    
    public static SubLObject f37401(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        var9.resetMultipleValues();
        final SubLObject var10 = f37398(var8);
        final SubLObject var11 = var9.secondMultipleValue();
        final SubLObject var12 = var9.thirdMultipleValue();
        final SubLObject var13 = var9.fourthMultipleValue();
        final SubLObject var14 = var9.fifthMultipleValue();
        final SubLObject var15 = var9.sixthMultipleValue();
        final SubLObject var16 = var9.seventhMultipleValue();
        var9.resetMultipleValues();
        final SubLObject var17 = var10;
        if (var17.eql((SubLObject)module0612.$ic23$) || var17.eql((SubLObject)module0612.$ic21$) || var17.eql((SubLObject)module0612.$ic20$)) {
            return (SubLObject)module0612.NIL;
        }
        return (SubLObject)((module0612.NIL != module0051.f3542(var12)) ? f37402(var12) : module0612.NIL);
    }
    
    public static SubLObject f37403(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        var9.resetMultipleValues();
        final SubLObject var10 = f37398(var8);
        final SubLObject var11 = var9.secondMultipleValue();
        final SubLObject var12 = var9.thirdMultipleValue();
        final SubLObject var13 = var9.fourthMultipleValue();
        final SubLObject var14 = var9.fifthMultipleValue();
        final SubLObject var15 = var9.sixthMultipleValue();
        final SubLObject var16 = var9.seventhMultipleValue();
        var9.resetMultipleValues();
        return var12;
    }
    
    public static SubLObject f37404(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        var9.resetMultipleValues();
        final SubLObject var10 = f37398(var8);
        final SubLObject var11 = var9.secondMultipleValue();
        final SubLObject var12 = var9.thirdMultipleValue();
        final SubLObject var13 = var9.fourthMultipleValue();
        final SubLObject var14 = var9.fifthMultipleValue();
        final SubLObject var15 = var9.sixthMultipleValue();
        final SubLObject var16 = var9.seventhMultipleValue();
        var9.resetMultipleValues();
        return var13;
    }
    
    public static SubLObject f37405(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        var9.resetMultipleValues();
        final SubLObject var10 = f37398(var8);
        final SubLObject var11 = var9.secondMultipleValue();
        final SubLObject var12 = var9.thirdMultipleValue();
        final SubLObject var13 = var9.fourthMultipleValue();
        final SubLObject var14 = var9.fifthMultipleValue();
        final SubLObject var15 = var9.sixthMultipleValue();
        final SubLObject var16 = var9.seventhMultipleValue();
        var9.resetMultipleValues();
        return var14;
    }
    
    public static SubLObject f37406(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        var9.resetMultipleValues();
        final SubLObject var10 = f37398(var8);
        final SubLObject var11 = var9.secondMultipleValue();
        final SubLObject var12 = var9.thirdMultipleValue();
        final SubLObject var13 = var9.fourthMultipleValue();
        final SubLObject var14 = var9.fifthMultipleValue();
        final SubLObject var15 = var9.sixthMultipleValue();
        final SubLObject var16 = var9.seventhMultipleValue();
        var9.resetMultipleValues();
        return var15;
    }
    
    public static SubLObject f37407(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        var9.resetMultipleValues();
        final SubLObject var10 = f37398(var8);
        final SubLObject var11 = var9.secondMultipleValue();
        final SubLObject var12 = var9.thirdMultipleValue();
        final SubLObject var13 = var9.fourthMultipleValue();
        final SubLObject var14 = var9.fifthMultipleValue();
        final SubLObject var15 = var9.sixthMultipleValue();
        final SubLObject var16 = var9.seventhMultipleValue();
        var9.resetMultipleValues();
        return var16;
    }
    
    public static SubLObject f37408(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        var9.resetMultipleValues();
        final SubLObject var10 = f37398(var8);
        final SubLObject var11 = var9.secondMultipleValue();
        final SubLObject var12 = var9.thirdMultipleValue();
        final SubLObject var13 = var9.fourthMultipleValue();
        final SubLObject var14 = var9.fifthMultipleValue();
        final SubLObject var15 = var9.sixthMultipleValue();
        final SubLObject var16 = var9.seventhMultipleValue();
        final SubLObject var17 = var9.eighthMultipleValue();
        var9.resetMultipleValues();
        return var17;
    }
    
    public static SubLObject f37409(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        assert module0612.NIL != f37385(var40) : var40;
        var41.resetMultipleValues();
        final SubLObject var42 = f37410(var40);
        final SubLObject var43 = var41.secondMultipleValue();
        final SubLObject var44 = var41.thirdMultipleValue();
        final SubLObject var45 = var41.fourthMultipleValue();
        final SubLObject var46 = var41.fifthMultipleValue();
        SubLObject var47 = var41.sixthMultipleValue();
        SubLObject var48 = var41.seventhMultipleValue();
        SubLObject var49 = var41.eighthMultipleValue();
        var41.resetMultipleValues();
        if (module0612.NIL == var47) {
            var47 = (SubLObject)module0612.ZERO_INTEGER;
        }
        if (module0612.NIL == var48) {
            var48 = (SubLObject)module0612.ZERO_INTEGER;
        }
        if (module0612.NIL == var49) {
            var49 = (SubLObject)module0612.ZERO_INTEGER;
        }
        return module0051.f3641(var46, var47, var48, var49);
    }
    
    public static SubLObject f37411(final SubLObject var8, final SubLObject var45) {
        if (var45.eql(module0612.$ic31$)) {
            return f37408(var8);
        }
        if (var45.eql(module0612.$ic32$)) {
            return f37407(var8);
        }
        if (var45.eql(module0612.$ic33$)) {
            return f37406(var8);
        }
        if (var45.eql(module0612.$ic34$)) {
            return f37405(var8);
        }
        if (var45.eql(module0612.$ic35$)) {
            return f37404(var8);
        }
        if (var45.eql(module0612.$ic36$)) {
            return f37401(var8);
        }
        if (var45.eql(module0612.$ic37$)) {
            return f37400(var8);
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37398(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0612.NIL == Errors.$ignore_mustsP$.getDynamicValue(var9) && module0612.NIL == f37382(var8)) {
            Errors.error((SubLObject)module0612.$ic38$, var8);
        }
        final SubLObject var10 = f37412(var8);
        if (var10.eql((SubLObject)module0612.$ic39$)) {
            return f37413(var8);
        }
        if (var10.eql((SubLObject)module0612.$ic23$)) {
            return f37414(var8);
        }
        if (var10.eql((SubLObject)module0612.$ic21$)) {
            return f37415(var8);
        }
        if (var10.eql((SubLObject)module0612.$ic20$)) {
            return f37416(var8);
        }
        Errors.error((SubLObject)module0612.$ic40$, var8);
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37412(final SubLObject var8) {
        final SubLObject var9 = var8.first();
        if (var9.eql(module0612.$ic41$) || var9.eql(module0612.$ic42$) || var9.eql(module0612.$ic43$) || var9.eql(module0612.$ic44$) || var9.eql(module0612.$ic45$) || var9.eql(module0612.$ic46$) || var9.eql(module0612.$ic47$)) {
            return (SubLObject)module0612.$ic39$;
        }
        if (var9.eql(module0612.$ic48$)) {
            return (SubLObject)module0612.$ic23$;
        }
        if (var9.eql(module0612.$ic49$)) {
            return (SubLObject)module0612.$ic21$;
        }
        if (var9.eql(module0612.$ic50$)) {
            return (SubLObject)module0612.$ic20$;
        }
        Errors.error((SubLObject)module0612.$ic40$, var8);
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37410(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (module0612.NIL == Errors.$ignore_mustsP$.getDynamicValue(var41) && module0612.NIL == f37385(var40)) {
            Errors.error((SubLObject)module0612.$ic51$, var40);
        }
        return f37413(var40);
    }
    
    public static SubLObject f37413(SubLObject var8) {
        SubLObject var9 = (SubLObject)module0612.NIL;
        SubLObject var10 = (SubLObject)module0612.NIL;
        SubLObject var11 = (SubLObject)module0612.NIL;
        SubLObject var12 = (SubLObject)module0612.NIL;
        SubLObject var13 = (SubLObject)module0612.NIL;
        SubLObject var14 = (SubLObject)module0612.NIL;
        SubLObject var15 = (SubLObject)module0612.NIL;
        while (var8.isCons()) {
            final SubLObject var16 = var8.first();
            if (var16.eql(module0612.$ic41$)) {
                var9 = conses_high.second(var8);
                var8 = (SubLObject)module0612.NIL;
            }
            else if (var16.eql(module0612.$ic42$)) {
                var10 = f37417(conses_high.second(var8));
                var8 = conses_high.third(var8);
            }
            else if (var16.eql(module0612.$ic43$)) {
                var11 = conses_high.second(var8);
                var8 = conses_high.third(var8);
            }
            else if (var16.eql(module0612.$ic44$)) {
                var12 = conses_high.second(var8);
                var8 = conses_high.third(var8);
            }
            else if (var16.eql(module0612.$ic45$)) {
                var13 = conses_high.second(var8);
                var8 = conses_high.third(var8);
            }
            else if (var16.eql(module0612.$ic46$)) {
                var14 = conses_high.second(var8);
                var8 = conses_high.third(var8);
            }
            else if (var16.eql(module0612.$ic47$)) {
                var15 = conses_high.second(var8);
                var8 = conses_high.third(var8);
            }
            else {
                Errors.error((SubLObject)module0612.$ic40$, var8);
            }
        }
        return Values.values((SubLObject)module0612.$ic39$, var9, var10, var11, var12, var13, var14, var15);
    }
    
    public static SubLObject f37414(SubLObject var8) {
        SubLObject var9 = (SubLObject)module0612.NIL;
        SubLObject var10 = (SubLObject)module0612.NIL;
        while (var8.isCons()) {
            final SubLObject var11 = var8.first();
            if (var11.eql(module0612.$ic41$)) {
                var9 = conses_high.second(var8);
                var8 = (SubLObject)module0612.NIL;
            }
            else if (var11.eql(module0612.$ic48$)) {
                var10 = conses_high.second(var8);
                var8 = conses_high.third(var8);
            }
            else {
                Errors.error((SubLObject)module0612.$ic40$, var8);
            }
        }
        return Values.values((SubLObject)module0612.$ic23$, var9, var10);
    }
    
    public static SubLObject f37415(SubLObject var8) {
        SubLObject var9 = (SubLObject)module0612.NIL;
        while (var8.isCons()) {
            final SubLObject var10 = var8.first();
            if (var10.eql(module0612.$ic49$)) {
                var9 = conses_high.second(var8);
                var8 = (SubLObject)module0612.NIL;
            }
            else {
                Errors.error((SubLObject)module0612.$ic40$, var8);
            }
        }
        return Values.values((SubLObject)module0612.$ic21$, var9);
    }
    
    public static SubLObject f37416(SubLObject var8) {
        SubLObject var9 = (SubLObject)module0612.NIL;
        while (var8.isCons()) {
            final SubLObject var10 = var8.first();
            if (var10.eql(module0612.$ic50$)) {
                var9 = conses_high.second(var8);
                var8 = (SubLObject)module0612.NIL;
            }
            else {
                Errors.error((SubLObject)module0612.$ic40$, var8);
            }
        }
        return Values.values((SubLObject)module0612.$ic20$, var9);
    }
    
    public static SubLObject f37418(final SubLObject var35, final SubLObject var34, final SubLObject var33, final SubLObject var32, final SubLObject var31, final SubLObject var38) {
        return (SubLObject)ConsesLow.list(module0612.$ic46$, var35, (SubLObject)ConsesLow.list(module0612.$ic45$, var34, (SubLObject)ConsesLow.list(module0612.$ic44$, var33, (SubLObject)ConsesLow.list(module0612.$ic43$, var32, (SubLObject)ConsesLow.list(module0612.$ic42$, var31, (SubLObject)ConsesLow.list(module0612.$ic41$, var38))))));
    }
    
    public static SubLObject f37419(final SubLObject var35, final SubLObject var34, final SubLObject var33, final SubLObject var32, final SubLObject var31, final SubLObject var38) {
        SubLObject var39 = (SubLObject)module0612.NIL;
        if (module0612.NIL != var38) {
            var39 = (SubLObject)((var38 == module0612.$ic52$) ? module0612.$ic53$ : ConsesLow.list(module0612.$ic41$, var38));
            if (module0612.NIL != var31) {
                var39 = (SubLObject)ConsesLow.list(module0612.$ic42$, f37402(var31), var39);
                if (module0612.NIL != var32) {
                    var39 = (SubLObject)ConsesLow.list(module0612.$ic43$, var32, var39);
                    if (module0612.NIL != var33) {
                        var39 = (SubLObject)ConsesLow.list(module0612.$ic44$, var33, var39);
                        if (module0612.NIL != var34) {
                            var39 = (SubLObject)ConsesLow.list(module0612.$ic45$, var34, var39);
                            if (module0612.NIL != var35) {
                                var39 = (SubLObject)ConsesLow.list(module0612.$ic46$, var35, var39);
                            }
                        }
                    }
                }
            }
        }
        return var39;
    }
    
    public static SubLObject f37420(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)module0612.NIL;
        var9.resetMultipleValues();
        final SubLObject var11 = f37398(var8);
        final SubLObject var12 = var9.secondMultipleValue();
        SubLObject var13 = var9.thirdMultipleValue();
        SubLObject var14 = var9.fourthMultipleValue();
        SubLObject var15 = var9.fifthMultipleValue();
        SubLObject var16 = var9.sixthMultipleValue();
        SubLObject var17 = var9.seventhMultipleValue();
        var9.resetMultipleValues();
        SubLObject var18 = (SubLObject)module0612.NIL;
        if (module0612.NIL == var18) {
            SubLObject var19 = module0612.$g4714$.getGlobalValue();
            SubLObject var20 = (SubLObject)module0612.NIL;
            var20 = var19.first();
            while (module0612.NIL == var18 && module0612.NIL != var19) {
                final SubLObject var21 = f37411(var8, var20);
                if (module0612.NIL != var21 && module0612.NIL == f37421(var21, var20)) {
                    var18 = var20;
                }
                var19 = var19.rest();
                var20 = var19.first();
            }
        }
        final SubLObject var22 = var18;
        if (var22.eql(module0612.$ic37$)) {
            var17 = (SubLObject)module0612.NIL;
            var16 = (SubLObject)module0612.NIL;
            var15 = (SubLObject)module0612.NIL;
            var14 = (SubLObject)module0612.NIL;
            var13 = (SubLObject)module0612.NIL;
        }
        else if (var22.eql(module0612.$ic36$)) {
            var17 = (SubLObject)module0612.NIL;
            var16 = (SubLObject)module0612.NIL;
            var15 = (SubLObject)module0612.NIL;
            var14 = (SubLObject)module0612.NIL;
        }
        else if (var22.eql(module0612.$ic35$)) {
            var17 = (SubLObject)module0612.NIL;
            var16 = (SubLObject)module0612.NIL;
            var15 = (SubLObject)module0612.NIL;
        }
        else if (var22.eql(module0612.$ic34$)) {
            var17 = (SubLObject)module0612.NIL;
            var16 = (SubLObject)module0612.NIL;
        }
        else if (var22.eql(module0612.$ic33$)) {
            var17 = (SubLObject)module0612.NIL;
        }
        var10 = f37419(var17, var16, var15, var14, var13, var12);
        return var10;
    }
    
    public static SubLObject f37422(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)module0612.NIL;
        var9.resetMultipleValues();
        final SubLObject var11 = f37398(var8);
        final SubLObject var12 = var9.secondMultipleValue();
        final SubLObject var13 = var9.thirdMultipleValue();
        final SubLObject var14 = var9.fourthMultipleValue();
        final SubLObject var15 = var9.fifthMultipleValue();
        final SubLObject var16 = var9.sixthMultipleValue();
        final SubLObject var17 = var9.seventhMultipleValue();
        var9.resetMultipleValues();
        SubLObject var18 = (SubLObject)module0612.NIL;
        if (module0612.NIL == var18) {
            SubLObject var19 = module0612.$g4714$.getGlobalValue();
            SubLObject var20 = (SubLObject)module0612.NIL;
            var20 = var19.first();
            while (module0612.NIL == var18 && module0612.NIL != var19) {
                final SubLObject var21 = f37411(var8, var20);
                if (module0612.NIL == f37423(var21, var20, var13, var12)) {
                    var18 = var20;
                }
                var19 = var19.rest();
                var20 = var19.first();
            }
        }
        final SubLObject var22 = var18;
        if (var22.eql(module0612.$ic37$)) {
            var10 = (SubLObject)ConsesLow.list(module0612.$ic41$, var12);
        }
        else if (var22.eql(module0612.$ic36$)) {
            var10 = (SubLObject)ConsesLow.list(module0612.$ic42$, f37402(var13), (SubLObject)ConsesLow.list(module0612.$ic41$, var12));
        }
        else if (var22.eql(module0612.$ic35$)) {
            var10 = (SubLObject)ConsesLow.list(module0612.$ic43$, var14, (SubLObject)ConsesLow.list(module0612.$ic42$, f37402(var13), (SubLObject)ConsesLow.list(module0612.$ic41$, var12)));
        }
        else if (var22.eql(module0612.$ic34$)) {
            var10 = (SubLObject)ConsesLow.list(module0612.$ic44$, var15, (SubLObject)ConsesLow.list(module0612.$ic43$, var14, (SubLObject)ConsesLow.list(module0612.$ic42$, f37402(var13), (SubLObject)ConsesLow.list(module0612.$ic41$, var12))));
        }
        else if (var22.eql(module0612.$ic33$)) {
            var10 = (SubLObject)ConsesLow.list(module0612.$ic45$, var16, (SubLObject)ConsesLow.list(module0612.$ic44$, var15, (SubLObject)ConsesLow.list(module0612.$ic43$, var14, (SubLObject)ConsesLow.list(module0612.$ic42$, f37402(var13), (SubLObject)ConsesLow.list(module0612.$ic41$, var12)))));
        }
        else if (var22.eql(module0612.$ic32$)) {
            var10 = var8;
        }
        return var10;
    }
    
    public static SubLObject f37424(SubLObject var8, final SubLObject var51, SubLObject var52) {
        if (var52 == module0612.UNPROVIDED) {
            var52 = (SubLObject)module0612.NIL;
        }
        final SubLThread var53 = SubLProcess.currentSubLThread();
        if (module0612.NIL != var51 && module0612.NIL != var52 && module0612.NIL != f37382(var8) && module0612.NIL != f37394(var51, f37425(var8))) {
            final SubLObject var54 = var52;
            if (var54.eql((SubLObject)module0612.$ic54$)) {
                var8 = f37426(Numbers.subtract(f37427(var8), (SubLObject)module0612.ONE_INTEGER));
            }
            else if (var54.eql((SubLObject)module0612.$ic55$)) {
                var8 = f37426(Numbers.add(f37427(var8), (SubLObject)module0612.ONE_INTEGER));
            }
        }
        var53.resetMultipleValues();
        final SubLObject var55 = f37398(var8);
        SubLObject var56 = var53.secondMultipleValue();
        SubLObject var57 = var53.thirdMultipleValue();
        SubLObject var58 = var53.fourthMultipleValue();
        SubLObject var59 = var53.fifthMultipleValue();
        SubLObject var60 = var53.sixthMultipleValue();
        SubLObject var61 = var53.seventhMultipleValue();
        var53.resetMultipleValues();
        final SubLObject var62 = var55;
        if (var62.eql((SubLObject)module0612.$ic21$)) {
            var56 = Numbers.multiply(var56, (SubLObject)module0612.TEN_INTEGER);
        }
        else if (var62.eql((SubLObject)module0612.$ic20$)) {
            var56 = module0048.f_1X(Numbers.multiply(module0048.f_1_(var56), (SubLObject)module0612.$ic56$));
        }
        if (var51.eql(module0612.$ic37$)) {
            var57 = (SubLObject)module0612.NIL;
            var58 = (SubLObject)module0612.NIL;
            var59 = (SubLObject)module0612.NIL;
            var60 = (SubLObject)module0612.NIL;
            var61 = (SubLObject)module0612.NIL;
        }
        else if (var51.eql(module0612.$ic36$)) {
            if (module0612.NIL == var57) {
                var57 = (SubLObject)module0612.ONE_INTEGER;
            }
            var58 = (SubLObject)module0612.NIL;
            var59 = (SubLObject)module0612.NIL;
            var60 = (SubLObject)module0612.NIL;
            var61 = (SubLObject)module0612.NIL;
        }
        else if (var51.eql(module0612.$ic35$)) {
            if (module0612.NIL == var57) {
                var57 = (SubLObject)module0612.ONE_INTEGER;
            }
            if (module0612.NIL == var58) {
                var58 = (SubLObject)module0612.ONE_INTEGER;
            }
            var59 = (SubLObject)module0612.NIL;
            var60 = (SubLObject)module0612.NIL;
            var61 = (SubLObject)module0612.NIL;
        }
        else if (var51.eql(module0612.$ic34$)) {
            if (module0612.NIL == var57) {
                var57 = (SubLObject)module0612.ONE_INTEGER;
            }
            if (module0612.NIL == var58) {
                var58 = (SubLObject)module0612.ONE_INTEGER;
            }
            if (module0612.NIL == var59) {
                var59 = (SubLObject)module0612.ZERO_INTEGER;
            }
            var60 = (SubLObject)module0612.NIL;
            var61 = (SubLObject)module0612.NIL;
        }
        else if (var51.eql(module0612.$ic33$)) {
            if (module0612.NIL == var57) {
                var57 = (SubLObject)module0612.ONE_INTEGER;
            }
            if (module0612.NIL == var58) {
                var58 = (SubLObject)module0612.ONE_INTEGER;
            }
            if (module0612.NIL == var59) {
                var59 = (SubLObject)module0612.ZERO_INTEGER;
            }
            if (module0612.NIL == var60) {
                var60 = (SubLObject)module0612.ZERO_INTEGER;
            }
            var61 = (SubLObject)module0612.NIL;
        }
        else if (var51.eql(module0612.$ic32$)) {
            if (module0612.NIL == var57) {
                var57 = (SubLObject)module0612.ONE_INTEGER;
            }
            if (module0612.NIL == var58) {
                var58 = (SubLObject)module0612.ONE_INTEGER;
            }
            if (module0612.NIL == var59) {
                var59 = (SubLObject)module0612.ZERO_INTEGER;
            }
            if (module0612.NIL == var60) {
                var60 = (SubLObject)module0612.ZERO_INTEGER;
            }
            if (module0612.NIL == var61) {
                var61 = (SubLObject)module0612.ZERO_INTEGER;
            }
        }
        return f37419(var61, var60, var59, var58, var57, var56);
    }
    
    public static SubLObject f37428(final SubLObject var38, SubLObject var31, SubLObject var32, SubLObject var33, SubLObject var42, SubLObject var43, SubLObject var44) {
        if (var31 == module0612.UNPROVIDED) {
            var31 = (SubLObject)module0612.NIL;
        }
        if (var32 == module0612.UNPROVIDED) {
            var32 = (SubLObject)module0612.NIL;
        }
        if (var33 == module0612.UNPROVIDED) {
            var33 = (SubLObject)module0612.NIL;
        }
        if (var42 == module0612.UNPROVIDED) {
            var42 = (SubLObject)module0612.NIL;
        }
        if (var43 == module0612.UNPROVIDED) {
            var43 = (SubLObject)module0612.NIL;
        }
        if (var44 == module0612.UNPROVIDED) {
            var44 = (SubLObject)module0612.NIL;
        }
        SubLObject var45 = (SubLObject)(var38.isInteger() ? ConsesLow.list(module0612.$ic41$, var38) : var38);
        if (module0612.NIL != var31) {
            if (module0612.NIL != var45) {
                if (var31.isInteger()) {
                    var45 = (SubLObject)ConsesLow.list(module0612.$ic42$, f37402(var31), var45);
                }
                else {
                    Errors.error((SubLObject)module0612.$ic57$, var31, var45);
                }
            }
            else if (var31.isInteger()) {
                Errors.error((SubLObject)module0612.$ic57$, var31, var45);
            }
            else {
                var45 = var31;
            }
        }
        else if (module0612.NIL != var45) {
            return var45;
        }
        if (module0612.NIL != var32) {
            if (module0612.NIL != var45) {
                if (var32.isInteger()) {
                    var45 = (SubLObject)ConsesLow.list(module0612.$ic43$, var32, var45);
                }
                else {
                    Errors.error((SubLObject)module0612.$ic58$, var32, var45);
                }
            }
            else if (var32.isInteger()) {
                Errors.error((SubLObject)module0612.$ic58$, var32, var45);
            }
            else {
                var45 = var32;
            }
        }
        else if (module0612.NIL != var45) {
            return var45;
        }
        if (module0612.NIL != var33) {
            if (module0612.NIL != var45) {
                if (var33.isInteger()) {
                    var45 = (SubLObject)ConsesLow.list(module0612.$ic44$, var33, var45);
                }
                else {
                    Errors.error((SubLObject)module0612.$ic59$, var33, var45);
                }
            }
            else if (var33.isInteger()) {
                Errors.error((SubLObject)module0612.$ic59$, var33, var45);
            }
            else {
                var45 = var33;
            }
        }
        else if (module0612.NIL != var45) {
            return var45;
        }
        if (module0612.NIL != var42) {
            if (module0612.NIL != var45) {
                if (var42.isInteger()) {
                    var45 = (SubLObject)ConsesLow.list(module0612.$ic45$, var42, var45);
                }
                else {
                    Errors.error((SubLObject)module0612.$ic60$, var42, var45);
                }
            }
            else if (var42.isInteger()) {
                Errors.error((SubLObject)module0612.$ic60$, var42, var45);
            }
            else {
                var45 = var42;
            }
        }
        else if (module0612.NIL != var45) {
            return var45;
        }
        if (module0612.NIL != var43) {
            if (module0612.NIL != var45) {
                if (var43.isInteger()) {
                    var45 = (SubLObject)ConsesLow.list(module0612.$ic46$, var43, var45);
                }
                else {
                    Errors.error((SubLObject)module0612.$ic61$, var43, var45);
                }
            }
            else if (var43.isInteger()) {
                Errors.error((SubLObject)module0612.$ic61$, var43, var45);
            }
            else {
                var45 = var43;
            }
        }
        else if (module0612.NIL != var45) {
            return var45;
        }
        if (module0612.NIL != var44) {
            if (module0612.NIL != var45) {
                if (var44.isInteger()) {
                    var45 = (SubLObject)ConsesLow.list(module0612.$ic47$, var44, var45);
                }
                else {
                    Errors.error((SubLObject)module0612.$ic62$, var44, var45);
                }
            }
            else if (var44.isInteger()) {
                Errors.error((SubLObject)module0612.$ic62$, var44, var45);
            }
            else {
                var45 = var44;
            }
        }
        else if (module0612.NIL != var45) {
            return var45;
        }
        return var45;
    }
    
    public static SubLObject f37429(final SubLObject var38, SubLObject var46) {
        if (var46 == module0612.UNPROVIDED) {
            var46 = (SubLObject)module0612.NIL;
        }
        SubLObject var47 = (SubLObject)(var38.isInteger() ? ConsesLow.list(module0612.$ic41$, var38) : var38);
        if (module0612.NIL != var46) {
            if (module0612.NIL != var47) {
                if (var46.isInteger()) {
                    var47 = (SubLObject)ConsesLow.list(module0612.$ic48$, var46, var47);
                }
                else {
                    Errors.error((SubLObject)module0612.$ic63$, var46, var47);
                }
            }
            else if (var46.isInteger()) {
                Errors.error((SubLObject)module0612.$ic63$, var46, var47);
            }
            else {
                var47 = var46;
            }
        }
        else if (module0612.NIL != var47) {
            return var47;
        }
        return var47;
    }
    
    public static SubLObject f37430(final SubLObject var37) {
        if (var37.isInteger()) {
            return (SubLObject)ConsesLow.list(module0612.$ic49$, var37);
        }
        Errors.error((SubLObject)module0612.$ic64$, var37);
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37431(final SubLObject var30) {
        if (var30.isInteger()) {
            return (SubLObject)ConsesLow.list(module0612.$ic50$, var30);
        }
        Errors.error((SubLObject)module0612.$ic65$, var30);
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37432(final SubLObject var53, final SubLObject var54, SubLObject var38, SubLObject var31, SubLObject var32, SubLObject var33, SubLObject var42, SubLObject var43) {
        final SubLThread var55 = SubLProcess.currentSubLThread();
        if (var53.eql(module0612.$ic66$)) {
            if (module0612.NIL != var38) {
                var38 = Numbers.add(var38, var54);
            }
        }
        else if (var53.eql(module0612.$ic67$)) {
            if (module0612.NIL != var31) {
                var31 = Numbers.add(var31, var54);
            }
        }
        else if (var53.eql(module0612.$ic68$)) {
            if (module0612.NIL != var32) {
                var32 = Numbers.add(var32, Numbers.multiply((SubLObject)module0612.SEVEN_INTEGER, var54));
            }
        }
        else if (var53.eql(module0612.$ic69$)) {
            if (module0612.NIL != var32) {
                var32 = Numbers.add(var32, var54);
            }
        }
        else if (var53.eql(module0612.$ic70$)) {
            if (module0612.NIL != var33) {
                var33 = Numbers.add(var33, var54);
            }
        }
        else if (var53.eql(module0612.$ic71$)) {
            if (module0612.NIL != var42) {
                var42 = Numbers.add(var42, var54);
            }
        }
        else if (var53.eql(module0612.$ic72$) && module0612.NIL != var43) {
            var43 = Numbers.add(var43, var54);
        }
        if (module0612.NIL != var43) {
            if (var43.numL((SubLObject)module0612.ZERO_INTEGER)) {
                var42 = Numbers.add(var42, Numbers.subtract(Numbers.integerDivide(var43, (SubLObject)module0612.$ic73$), (SubLObject)(Numbers.mod(var43, (SubLObject)module0612.$ic73$).numE((SubLObject)module0612.ZERO_INTEGER) ? module0612.ZERO_INTEGER : module0612.ONE_INTEGER)));
            }
            else {
                var42 = Numbers.add(var42, Numbers.integerDivide(var43, (SubLObject)module0612.$ic73$));
            }
            var43 = Numbers.mod(var43, (SubLObject)module0612.$ic73$);
        }
        if (module0612.NIL != var42) {
            if (var42.numL((SubLObject)module0612.ZERO_INTEGER)) {
                var33 = Numbers.add(var33, Numbers.subtract(Numbers.integerDivide(var42, (SubLObject)module0612.$ic73$), (SubLObject)(Numbers.mod(var42, (SubLObject)module0612.$ic73$).numE((SubLObject)module0612.ZERO_INTEGER) ? module0612.ZERO_INTEGER : module0612.ONE_INTEGER)));
            }
            else {
                var33 = Numbers.add(var33, Numbers.integerDivide(var42, (SubLObject)module0612.$ic73$));
            }
            var42 = Numbers.mod(var42, (SubLObject)module0612.$ic73$);
        }
        if (module0612.NIL != var33) {
            if (var33.numL((SubLObject)module0612.ZERO_INTEGER)) {
                var32 = Numbers.add(var32, Numbers.subtract(Numbers.integerDivide(var33, (SubLObject)module0612.$ic74$), (SubLObject)(Numbers.mod(var33, (SubLObject)module0612.$ic74$).numE((SubLObject)module0612.ZERO_INTEGER) ? module0612.ZERO_INTEGER : module0612.ONE_INTEGER)));
            }
            else {
                var32 = Numbers.add(var32, Numbers.integerDivide(var33, (SubLObject)module0612.$ic74$));
            }
            var33 = Numbers.mod(var33, (SubLObject)module0612.$ic74$);
        }
        var55.resetMultipleValues();
        final SubLObject var56 = module0051.f3654(var38, var31, var32);
        final SubLObject var57 = var55.secondMultipleValue();
        final SubLObject var58 = var55.thirdMultipleValue();
        var55.resetMultipleValues();
        return f37428(var56, var57, var58, var33, var42, var43, (SubLObject)module0612.UNPROVIDED);
    }
    
    public static SubLObject f37433(final SubLObject var53, final SubLObject var54, SubLObject var38, SubLObject var46) {
        if (var53.eql(module0612.$ic66$)) {
            if (module0612.NIL != var38) {
                var38 = Numbers.add(var38, var54);
            }
        }
        else if (var53.eql(module0612.$ic75$) && module0612.NIL != var46) {
            var46 = Numbers.add(var46, var54);
        }
        if (module0612.NIL != var46) {
            if (var46.numL((SubLObject)module0612.ONE_INTEGER)) {
                var38 = Numbers.add(var38, Numbers.subtract(Numbers.integerDivide(var46, (SubLObject)module0612.FOUR_INTEGER), (SubLObject)module0612.ONE_INTEGER));
            }
            else {
                var38 = Numbers.add(var38, Numbers.integerDivide(var46, (SubLObject)module0612.FOUR_INTEGER));
            }
            var46 = Numbers.add(Numbers.mod(Numbers.subtract(var46, (SubLObject)module0612.ONE_INTEGER), (SubLObject)module0612.FOUR_INTEGER), (SubLObject)module0612.ONE_INTEGER);
        }
        return f37429(var38, var46);
    }
    
    public static SubLObject f37434(final SubLObject var53, final SubLObject var54, SubLObject var37) {
        if (module0612.NIL == var37) {
            return (SubLObject)module0612.NIL;
        }
        if (var53.eql(module0612.$ic76$)) {
            var37 = Numbers.add(var37, var54);
        }
        else if (var53.eql(module0612.$ic66$)) {
            var37 = Numbers.add(var37, Numbers.integerDivide(var54, (SubLObject)module0612.TEN_INTEGER));
        }
        else if (var53.eql(module0612.$ic67$)) {
            var37 = Numbers.add(var37, Numbers.integerDivide(var54, (SubLObject)module0612.$ic77$));
        }
        return f37430(var37);
    }
    
    public static SubLObject f37435(final SubLObject var53, final SubLObject var54, SubLObject var30) {
        if (module0612.NIL == var30) {
            return (SubLObject)module0612.NIL;
        }
        if (var53.eql(module0612.$ic78$)) {
            var30 = Numbers.add(var30, var54);
        }
        else if (var53.eql(module0612.$ic76$)) {
            var30 = Numbers.add(var30, Numbers.integerDivide(var54, (SubLObject)module0612.TEN_INTEGER));
        }
        else if (var53.eql(module0612.$ic66$)) {
            var30 = Numbers.add(var30, Numbers.integerDivide(var54, (SubLObject)module0612.$ic56$));
        }
        else if (var53.eql(module0612.$ic67$)) {
            var30 = Numbers.add(var30, Numbers.integerDivide(var54, (SubLObject)module0612.$ic79$));
        }
        return f37431(var30);
    }
    
    public static SubLObject f37436(final SubLObject var1) {
        if (module0612.NIL == module0131.f8566()) {
            Errors.error((SubLObject)module0612.$ic81$);
        }
        return module0035.f2169(var1, module0612.$g4716$.getGlobalValue());
    }
    
    public static SubLObject f37402(final SubLObject var58) {
        assert module0612.NIL != module0051.f3542(var58) : var58;
        if (module0612.NIL == module0131.f8566()) {
            Errors.error((SubLObject)module0612.$ic81$);
        }
        return ConsesLow.nth(Numbers.subtract(var58, (SubLObject)module0612.ONE_INTEGER), module0612.$g4716$.getGlobalValue());
    }
    
    public static SubLObject f37417(final SubLObject var31) {
        assert module0612.NIL != f37437(var31) : var31;
        if (module0612.NIL == module0131.f8566()) {
            Errors.error((SubLObject)module0612.$ic81$);
        }
        if (module0612.NIL != module0173.f10955(var31)) {
            final SubLObject var32 = Sequences.position(var31, module0612.$g4716$.getGlobalValue(), (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
            return (SubLObject)((module0612.NIL != var32) ? Numbers.add(var32, (SubLObject)module0612.ONE_INTEGER) : module0612.NIL);
        }
        return conses_high.second(var31);
    }
    
    public static SubLObject f37438(final SubLObject var8) {
        final SubLObject var9 = f37403(var8);
        final SubLObject var10 = f37400(var8);
        final SubLObject var11 = f37404(var8);
        return Numbers.add(module0051.f3657(var9, var10), var11);
    }
    
    public static SubLObject f37437(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0612.NIL != f37436(var1) || (module0612.NIL != module0172.f10917(var1) && var1.first().eql(module0612.$ic84$)));
    }
    
    public static SubLObject f37439(final SubLObject var1) {
        if (module0612.NIL == module0131.f8566()) {
            Errors.error((SubLObject)module0612.$ic81$);
        }
        return module0004.f104(var1, module0612.$g4717$.getGlobalValue(), (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
    }
    
    public static SubLObject f37440(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        if (module0612.NIL == Errors.$ignore_mustsP$.getDynamicValue(var59) && (!var58.isInteger() || var58.isNegative() || !var58.numL((SubLObject)module0612.SEVEN_INTEGER))) {
            Errors.error((SubLObject)module0612.$ic86$, var58);
        }
        if (module0612.NIL == module0131.f8566()) {
            Errors.error((SubLObject)module0612.$ic81$);
        }
        return ConsesLow.nth(var58, module0612.$g4717$.getGlobalValue());
    }
    
    public static SubLObject f37441(final SubLObject var60) {
        return f37440(Numbers.mod(module0048.f_1X(f37442(var60)), (SubLObject)module0612.SEVEN_INTEGER));
    }
    
    public static SubLObject f37443(final SubLObject var60) {
        return f37440(Numbers.mod(Numbers.subtract(f37442(var60), (SubLObject)module0612.ONE_INTEGER), (SubLObject)module0612.SEVEN_INTEGER));
    }
    
    public static SubLObject f37442(final SubLObject var60) {
        assert module0612.NIL != f37439(var60) : var60;
        return Sequences.position(var60, module0612.$g4717$.getGlobalValue(), (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
    }
    
    public static SubLObject f37444(final SubLObject var8) {
        assert module0612.NIL != f37382(var8) : var8;
        final SubLObject var9 = f37425(var8);
        if (var9.eql(module0612.$ic35$) || var9.eql(module0612.$ic34$) || var9.eql(module0612.$ic33$) || var9.eql(module0612.$ic32$)) {
            final SubLObject var10 = f37400(var8);
            final SubLObject var11 = f37445(f37400(var8));
            final SubLObject var12 = f37446(var11);
            final SubLObject var13 = Numbers.subtract(var10, var11);
            SubLObject var14 = f37447((SubLObject)ConsesLow.list(module0612.$ic41$, var11), (SubLObject)ConsesLow.list(module0612.$ic41$, var10));
            final SubLObject var15 = f37438(var8);
            SubLObject var16 = (SubLObject)module0612.NIL;
            if (module0612.NIL != module0051.f3655(var10)) {
                var14 = Numbers.add(var14, (SubLObject)module0612.MINUS_ONE_INTEGER);
            }
            var16 = Numbers.mod(Numbers.add(new SubLObject[] { var12, var13, var14, var15 }), (SubLObject)module0612.SEVEN_INTEGER);
            return f37440(var16);
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37448(final SubLObject var60, final SubLObject var8) {
        assert module0612.NIL != f37439(var60) : var60;
        assert module0612.NIL != f37382(var8) : var8;
        final SubLObject var61 = f37449(var8);
        final SubLObject var62 = f37444(var8);
        if (module0612.NIL == f37382(var61) || module0612.NIL == f37439(var62)) {
            return (SubLObject)module0612.NIL;
        }
        final SubLObject var63 = f37442(var62);
        final SubLObject var64 = f37442(var60);
        final SubLObject var65 = Numbers.mod(Numbers.subtract(var63, var64), (SubLObject)module0612.SEVEN_INTEGER);
        final SubLObject var66 = (SubLObject)(var65.isZero() ? module0612.SEVEN_INTEGER : var65);
        return f37450(var61, (SubLObject)ConsesLow.list(module0612.$ic69$, var66));
    }
    
    public static SubLObject f37451(final SubLObject var60, final SubLObject var8) {
        assert module0612.NIL != f37439(var60) : var60;
        assert module0612.NIL != f37382(var8) : var8;
        final SubLObject var61 = f37449(var8);
        final SubLObject var62 = f37444(var8);
        if (module0612.NIL == f37382(var61) || module0612.NIL == f37439(var62)) {
            return (SubLObject)module0612.NIL;
        }
        final SubLObject var63 = f37442(var62);
        final SubLObject var64 = f37442(var60);
        final SubLObject var65 = Numbers.mod(Numbers.subtract(var63, var64), (SubLObject)module0612.SEVEN_INTEGER);
        if (var65.isZero()) {
            return f37449(var8);
        }
        return f37450(var61, (SubLObject)ConsesLow.list(module0612.$ic69$, var65));
    }
    
    public static SubLObject f37452(final SubLObject var60, final SubLObject var8) {
        assert module0612.NIL != f37439(var60) : var60;
        assert module0612.NIL != f37382(var8) : var8;
        final SubLObject var61 = f37449(var8);
        final SubLObject var62 = f37444(var8);
        if (module0612.NIL == f37382(var61) || module0612.NIL == f37439(var62)) {
            return (SubLObject)module0612.NIL;
        }
        final SubLObject var63 = f37442(var62);
        final SubLObject var64 = f37442(var60);
        final SubLObject var65 = Numbers.mod(Numbers.subtract(var64, var63), (SubLObject)module0612.SEVEN_INTEGER);
        final SubLObject var66 = (SubLObject)(var65.isZero() ? module0612.SEVEN_INTEGER : var65);
        return f37453(var61, (SubLObject)ConsesLow.list(module0612.$ic69$, var66));
    }
    
    public static SubLObject f37454(final SubLObject var60, final SubLObject var8) {
        assert module0612.NIL != f37439(var60) : var60;
        assert module0612.NIL != f37382(var8) : var8;
        final SubLObject var61 = f37449(var8);
        final SubLObject var62 = f37444(var8);
        if (module0612.NIL == f37382(var61) || module0612.NIL == f37439(var62)) {
            return (SubLObject)module0612.NIL;
        }
        final SubLObject var63 = f37442(var62);
        final SubLObject var64 = f37442(var60);
        final SubLObject var65 = Numbers.mod(Numbers.subtract(var64, var63), (SubLObject)module0612.SEVEN_INTEGER);
        if (var65.isZero()) {
            return f37449(var8);
        }
        return f37453(var61, (SubLObject)ConsesLow.list(module0612.$ic69$, var65));
    }
    
    public static SubLObject f37445(final SubLObject var38) {
        assert module0612.NIL != Types.integerp(var38) : var38;
        return Numbers.multiply(Numbers.integerDivide(var38, (SubLObject)module0612.$ic56$), (SubLObject)module0612.$ic56$);
    }
    
    public static SubLObject f37446(final SubLObject var30) {
        final SubLObject var32;
        final SubLObject var31 = var32 = Numbers.mod(Numbers.integerDivide(var30, (SubLObject)module0612.$ic56$), (SubLObject)module0612.FOUR_INTEGER);
        if (var32.eql((SubLObject)module0612.ZERO_INTEGER)) {
            return (SubLObject)module0612.FIVE_INTEGER;
        }
        if (var32.eql((SubLObject)module0612.ONE_INTEGER)) {
            return (SubLObject)module0612.FOUR_INTEGER;
        }
        if (var32.eql((SubLObject)module0612.TWO_INTEGER)) {
            return (SubLObject)module0612.TWO_INTEGER;
        }
        if (var32.eql((SubLObject)module0612.THREE_INTEGER)) {
            return (SubLObject)module0612.ZERO_INTEGER;
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37455(final SubLObject var1) {
        if (module0612.NIL == module0131.f8566()) {
            Errors.error((SubLObject)module0612.$ic81$);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0612.NIL != module0172.f10917(var1) && var1.first().eql(module0612.$ic90$));
    }
    
    public static SubLObject f37456(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        var9.resetMultipleValues();
        final SubLObject var10 = f37398(var8);
        final SubLObject var11 = var9.secondMultipleValue();
        final SubLObject var12 = var9.thirdMultipleValue();
        final SubLObject var13 = var9.fourthMultipleValue();
        final SubLObject var14 = var9.fifthMultipleValue();
        final SubLObject var15 = var9.sixthMultipleValue();
        final SubLObject var16 = var9.seventhMultipleValue();
        var9.resetMultipleValues();
        return Numbers.add(new SubLObject[] { Numbers.multiply((SubLObject)module0612.$ic92$, module0048.f_1_(var11)), Numbers.integerDivide(module0048.f_1_(var11), (SubLObject)module0612.FOUR_INTEGER), Numbers.minus(Numbers.integerDivide(module0048.f_1_(var11), (SubLObject)module0612.$ic56$)), Numbers.integerDivide(module0048.f_1_(var11), (SubLObject)module0612.$ic93$), Numbers.integerDivide(Numbers.subtract(Numbers.multiply((SubLObject)module0612.$ic94$, var12), (SubLObject)module0612.$ic95$), (SubLObject)module0612.TWELVE_INTEGER), f37457(var12, var11), var13 });
    }
    
    public static SubLObject f37457(final SubLObject var31, final SubLObject var38) {
        if (var31.numLE((SubLObject)module0612.TWO_INTEGER)) {
            return (SubLObject)module0612.ZERO_INTEGER;
        }
        if (module0612.NIL != module0051.f3655(var38)) {
            return (SubLObject)module0612.MINUS_ONE_INTEGER;
        }
        return (SubLObject)module0612.$ic96$;
    }
    
    public static SubLObject f37458(final SubLObject var1) {
        return module0004.f104(var1, module0612.$g4719$.getGlobalValue(), (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
    }
    
    public static SubLObject f37459(final SubLObject var1) {
        if (module0612.NIL == module0131.f8566()) {
            Errors.error((SubLObject)module0612.$ic81$);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0612.NIL != module0172.f10917(var1) && var1.first().eql(module0612.$ic98$));
    }
    
    public static SubLObject f37460(final SubLObject var8) {
        assert module0612.NIL != f37382(var8) : var8;
        final SubLObject var9 = f37405(var8);
        if (module0612.NIL != var9) {
            return ConsesLow.nth(var9, module0612.$g4719$.getGlobalValue());
        }
        Errors.cerror((SubLObject)module0612.$ic99$, (SubLObject)module0612.$ic100$, var8);
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37461(final SubLObject var73) {
        return Sequences.position(var73, module0612.$g4719$.getGlobalValue(), (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
    }
    
    public static SubLObject f37462(final SubLObject var1) {
        if (module0612.NIL == module0131.f8566()) {
            Errors.error((SubLObject)module0612.$ic81$);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0612.NIL != module0172.f10917(var1) && var1.first().eql(module0612.$ic101$));
    }
    
    public static SubLObject f37463(final SubLObject var1) {
        if (module0612.NIL == module0131.f8566()) {
            Errors.error((SubLObject)module0612.$ic81$);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0612.NIL != module0172.f10917(var1) && var1.first().eql(module0612.$ic102$));
    }
    
    public static SubLObject f37421(final SubLObject var50, final SubLObject var45) {
        if (module0612.NIL == var50) {
            return (SubLObject)module0612.T;
        }
        if (var45.eql(module0612.$ic32$) || var45.eql(module0612.$ic33$) || var45.eql(module0612.$ic34$)) {
            return Equality.eq(var50, (SubLObject)module0612.ZERO_INTEGER);
        }
        if (var45.eql(module0612.$ic35$)) {
            return Equality.eq(var50, (SubLObject)module0612.ONE_INTEGER);
        }
        if (var45.eql(module0612.$ic103$)) {
            return Equality.eq(var50, module0612.$ic104$);
        }
        if (var45.eql(module0612.$ic36$)) {
            return Equality.eq(var50, module0612.$ic105$);
        }
        if (var45.eql(module0612.$ic106$)) {
            return Equality.eq(var50, (SubLObject)module0612.ONE_INTEGER);
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37464(final SubLObject var50, final SubLObject var45) {
        if (module0612.NIL == var50) {
            return (SubLObject)module0612.T;
        }
        if (var45.eql(module0612.$ic32$) || var45.eql(module0612.$ic33$) || var45.eql(module0612.$ic34$)) {
            return Equality.eq(var50, (SubLObject)module0612.ZERO_INTEGER);
        }
        if (var45.eql(module0612.$ic35$)) {
            return Equality.eq(var50, (SubLObject)module0612.ONE_INTEGER);
        }
        if (var45.eql(module0612.$ic103$)) {
            return Equality.eq(var50, (SubLObject)module0612.ONE_INTEGER);
        }
        if (var45.eql(module0612.$ic36$)) {
            return Equality.eq(var50, (SubLObject)module0612.ONE_INTEGER);
        }
        if (var45.eql(module0612.$ic106$)) {
            return Equality.eq(var50, (SubLObject)module0612.ONE_INTEGER);
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37465(final SubLObject var74, final SubLObject var45) {
        SubLObject var75 = (SubLObject)module0612.ZERO_INTEGER;
        SubLObject var76 = (SubLObject)module0612.NIL;
        if (module0612.NIL == var76) {
            SubLObject var77 = module0035.f2124(module0048.f_1X(Sequences.position(var45, module0612.$g4714$.getGlobalValue(), (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED)), module0612.$g4714$.getGlobalValue());
            SubLObject var78 = (SubLObject)module0612.NIL;
            var78 = var77.first();
            while (module0612.NIL == var76 && module0612.NIL != var77) {
                final SubLObject var79 = ConsesLow.nth(var75, var74);
                var75 = Numbers.add(var75, (SubLObject)module0612.ONE_INTEGER);
                if (module0612.NIL == f37464(var79, var78)) {
                    var76 = (SubLObject)module0612.T;
                }
                var77 = var77.rest();
                var78 = var77.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0612.NIL == var76);
    }
    
    public static SubLObject f37423(final SubLObject var50, final SubLObject var45, SubLObject var31, SubLObject var38) {
        if (var31 == module0612.UNPROVIDED) {
            var31 = (SubLObject)module0612.NIL;
        }
        if (var38 == module0612.UNPROVIDED) {
            var38 = (SubLObject)module0612.NIL;
        }
        if (module0612.NIL == var50) {
            return (SubLObject)module0612.T;
        }
        if (var45.eql(module0612.$ic32$) || var45.eql(module0612.$ic33$)) {
            return Equality.eq(var50, (SubLObject)module0612.$ic107$);
        }
        if (var45.eql(module0612.$ic34$)) {
            return Equality.eq(var50, (SubLObject)module0612.$ic108$);
        }
        if (var45.eql(module0612.$ic35$)) {
            return Equality.eq(var50, module0051.f3545(var31, var38));
        }
        if (var45.eql(module0612.$ic103$)) {
            return Equality.eq(var50, module0612.$ic109$);
        }
        if (var45.eql(module0612.$ic36$)) {
            return Equality.eq(var50, module0612.$ic110$);
        }
        if (var45.eql(module0612.$ic106$)) {
            return Equality.eq(var50, (SubLObject)module0612.FOUR_INTEGER);
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37466(final SubLObject var50, final SubLObject var45, SubLObject var31, SubLObject var38) {
        if (var31 == module0612.UNPROVIDED) {
            var31 = (SubLObject)module0612.NIL;
        }
        if (var38 == module0612.UNPROVIDED) {
            var38 = (SubLObject)module0612.NIL;
        }
        if (module0612.NIL == var50) {
            return (SubLObject)module0612.T;
        }
        if (var45.eql(module0612.$ic32$) || var45.eql(module0612.$ic33$)) {
            return Equality.eq(var50, (SubLObject)module0612.$ic107$);
        }
        if (var45.eql(module0612.$ic34$)) {
            return Equality.eq(var50, (SubLObject)module0612.$ic108$);
        }
        if (var45.eql(module0612.$ic35$)) {
            return Equality.eq(var50, module0051.f3545(var31, var38));
        }
        if (var45.eql(module0612.$ic103$)) {
            return Equality.eq(var50, (SubLObject)module0612.SEVEN_INTEGER);
        }
        if (var45.eql(module0612.$ic36$)) {
            return Equality.eq(var50, (SubLObject)module0612.TWELVE_INTEGER);
        }
        if (var45.eql(module0612.$ic106$)) {
            return Equality.eq(var50, (SubLObject)module0612.FOUR_INTEGER);
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37467(final SubLObject var74, final SubLObject var45, SubLObject var31, SubLObject var38) {
        if (var31 == module0612.UNPROVIDED) {
            var31 = (SubLObject)module0612.NIL;
        }
        if (var38 == module0612.UNPROVIDED) {
            var38 = (SubLObject)module0612.NIL;
        }
        SubLObject var75 = (SubLObject)module0612.ZERO_INTEGER;
        SubLObject var76 = (SubLObject)module0612.NIL;
        if (module0612.NIL == var76) {
            SubLObject var77 = module0035.f2124(module0048.f_1X(Sequences.position(var45, module0612.$g4714$.getGlobalValue(), (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED)), module0612.$g4714$.getGlobalValue());
            SubLObject var78 = (SubLObject)module0612.NIL;
            var78 = var77.first();
            while (module0612.NIL == var76 && module0612.NIL != var77) {
                final SubLObject var79 = ConsesLow.nth(var75, var74);
                var75 = Numbers.add(var75, (SubLObject)module0612.ONE_INTEGER);
                if (module0612.NIL == f37466(var79, var78, var31, var38)) {
                    var76 = (SubLObject)module0612.T;
                }
                var77 = var77.rest();
                var78 = var77.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0612.NIL == var76);
    }
    
    public static SubLObject f37468(final SubLObject var8, final SubLObject var79) {
        final SubLObject var80 = f37412(var8);
        if (var80.eql(var79)) {
            return var8;
        }
        if (module0612.NIL != f37396(var80, var79)) {
            return (SubLObject)module0612.NIL;
        }
        if (var79.eql((SubLObject)module0612.$ic20$)) {
            return f37469(var8);
        }
        if (var79.eql((SubLObject)module0612.$ic21$)) {
            return f37470(var8);
        }
        if (var79.eql((SubLObject)module0612.$ic23$)) {
            return f37471(var8);
        }
        if (var79.eql((SubLObject)module0612.$ic39$)) {
            return (SubLObject)module0612.NIL;
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37425(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0612.NIL == module0131.f8566()) {
            Errors.error((SubLObject)module0612.$ic81$);
        }
        var9.resetMultipleValues();
        final SubLObject var10 = f37398(var8);
        final SubLObject var11 = var9.secondMultipleValue();
        final SubLObject var12 = var9.thirdMultipleValue();
        final SubLObject var13 = var9.fourthMultipleValue();
        final SubLObject var14 = var9.fifthMultipleValue();
        final SubLObject var15 = var9.sixthMultipleValue();
        final SubLObject var16 = var9.seventhMultipleValue();
        final SubLObject var17 = var9.eighthMultipleValue();
        var9.resetMultipleValues();
        final SubLObject var18 = var10;
        if (var18.eql((SubLObject)module0612.$ic39$)) {
            if (module0612.NIL != var17) {
                return module0612.$ic31$;
            }
            if (module0612.NIL != var16) {
                return module0612.$ic32$;
            }
            if (module0612.NIL != var15) {
                return module0612.$ic33$;
            }
            if (module0612.NIL != var14) {
                return module0612.$ic34$;
            }
            if (module0612.NIL != var13) {
                return module0612.$ic35$;
            }
            if (module0612.NIL != var12) {
                return module0612.$ic36$;
            }
            if (module0612.NIL != var11) {
                return module0612.$ic37$;
            }
            return (SubLObject)module0612.NIL;
        }
        else if (var18.eql((SubLObject)module0612.$ic23$)) {
            if (module0612.NIL != var12) {
                return module0612.$ic106$;
            }
            if (module0612.NIL != var11) {
                return module0612.$ic37$;
            }
            return (SubLObject)module0612.NIL;
        }
        else if (var18.eql((SubLObject)module0612.$ic21$)) {
            if (module0612.NIL != var11) {
                return module0612.$ic111$;
            }
            return (SubLObject)module0612.NIL;
        }
        else {
            if (!var18.eql((SubLObject)module0612.$ic20$)) {
                return (SubLObject)module0612.NIL;
            }
            if (module0612.NIL != var11) {
                return module0612.$ic112$;
            }
            return (SubLObject)module0612.NIL;
        }
    }
    
    public static SubLObject f37472(final SubLObject var8) {
        if (module0612.NIL != f37473(var8)) {
            return var8;
        }
        if (module0612.NIL != f37389(var8)) {
            return var8;
        }
        final SubLObject var9 = module0205.f13276(var8);
        final SubLObject var10 = module0205.f13277(var8, (SubLObject)module0612.UNPROVIDED);
        final SubLObject var11 = module0205.f13368(var8, (SubLObject)module0612.UNPROVIDED);
        final SubLObject var12 = var9;
        if (var12.eql(module0612.$ic46$) || var12.eql(module0612.$ic45$) || var12.eql(module0612.$ic44$)) {
            if (var10.numE((SubLObject)module0612.ZERO_INTEGER)) {
                return f37472(var11);
            }
            return var8;
        }
        else if (var12.eql(module0612.$ic43$)) {
            if (var10.numE((SubLObject)module0612.ONE_INTEGER)) {
                return f37472(var11);
            }
            return var8;
        }
        else {
            if (!var12.eql(module0612.$ic42$)) {
                return var8;
            }
            if (var10.eql(module0612.$ic105$)) {
                return f37472(var11);
            }
            return var8;
        }
    }
    
    public static SubLObject f37474(final SubLObject var8) {
        if (module0612.NIL != f37473(var8)) {
            return var8;
        }
        if (module0612.NIL != f37388(var8)) {
            return var8;
        }
        final SubLObject var9 = module0205.f13276(var8);
        final SubLObject var10 = module0205.f13277(var8, (SubLObject)module0612.UNPROVIDED);
        final SubLObject var11 = module0205.f13368(var8, (SubLObject)module0612.UNPROVIDED);
        final SubLObject var12 = var9;
        if (var12.eql(module0612.$ic46$) || var12.eql(module0612.$ic45$)) {
            if (var10.numE((SubLObject)module0612.$ic107$)) {
                return f37474(var11);
            }
            return var8;
        }
        else if (var12.eql(module0612.$ic44$)) {
            if (var10.numE((SubLObject)module0612.$ic108$)) {
                return f37474(var11);
            }
            return var8;
        }
        else if (var12.eql(module0612.$ic43$)) {
            final SubLObject var13 = f37401(var11);
            final SubLObject var14 = f37400(var11);
            final SubLObject var15 = module0051.f3545(f37417(var13), var14);
            if (var10.numE(var15)) {
                return f37474(var11);
            }
            return var8;
        }
        else {
            if (!var12.eql(module0612.$ic42$)) {
                return var8;
            }
            if (var10.eql(module0612.$ic110$)) {
                return f37474(var11);
            }
            return var8;
        }
    }
    
    public static SubLObject f37475(final SubLObject var85) {
        if (module0612.NIL == module0131.f8566()) {
            Errors.error((SubLObject)module0612.$ic81$);
        }
        return (SubLObject)((module0612.NIL != module0173.f10969(var85)) ? f37476(var85) : module0612.NIL);
    }
    
    public static SubLObject f37477(final SubLObject var86) {
        return module0220.f14556(var86, module0612.$ic114$, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
    }
    
    public static SubLObject f37476(final SubLObject var86) {
        final SubLThread var87 = SubLProcess.currentSubLThread();
        final SubLObject var88 = module0034.$g879$.getDynamicValue(var87);
        SubLObject var89 = (SubLObject)module0612.NIL;
        if (module0612.NIL == var88) {
            return f37477(var86);
        }
        var89 = module0034.f1857(var88, (SubLObject)module0612.$ic113$, (SubLObject)module0612.UNPROVIDED);
        if (module0612.NIL == var89) {
            var89 = module0034.f1807(module0034.f1842(var88), (SubLObject)module0612.$ic113$, (SubLObject)module0612.ONE_INTEGER, (SubLObject)module0612.NIL, (SubLObject)module0612.EQ, (SubLObject)module0612.UNPROVIDED);
            module0034.f1860(var88, (SubLObject)module0612.$ic113$, var89);
        }
        SubLObject var90 = module0034.f1814(var89, var86, (SubLObject)module0612.$ic115$);
        if (var90 == module0612.$ic115$) {
            var90 = Values.arg2(var87.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f37477(var86)));
            module0034.f1816(var89, var86, var90, (SubLObject)module0612.UNPROVIDED);
        }
        return module0034.f1959(var90);
    }
    
    public static SubLObject f37478(final SubLObject var8, final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (module0612.NIL == module0131.f8566()) {
            Errors.error((SubLObject)module0612.$ic81$);
        }
        var41.resetMultipleValues();
        final SubLObject var42 = f37479(var40);
        final SubLObject var43 = var41.secondMultipleValue();
        var41.resetMultipleValues();
        final SubLObject var44 = f37425(var8);
        SubLObject var45 = (SubLObject)module0612.NIL;
        if (module0612.NIL == var44) {
            module0229.f15259();
        }
        final SubLObject var46 = f37475(var44);
        if (module0612.NIL == module0610.f37203(var42, var46)) {
            module0229.f15259();
        }
        if (module0612.NIL != module0610.f37205(module0612.$ic66$, var42)) {
            final SubLObject var47 = module0610.f37206(module0612.$ic66$, var42, var43, (SubLObject)module0612.UNPROVIDED);
            var45 = module0610.f37198(module0612.$ic66$, Numbers.floor(var47, (SubLObject)module0612.UNPROVIDED), (SubLObject)module0612.UNPROVIDED);
        }
        else if (module0612.NIL != module0610.f37205(var42, var46)) {
            final SubLObject var48 = module0610.f37206(var46, var42, var43, (SubLObject)module0612.UNPROVIDED);
            var45 = module0610.f37198(var46, Numbers.ceiling(var48, (SubLObject)module0612.UNPROVIDED), (SubLObject)module0612.UNPROVIDED);
        }
        else {
            var45 = var40;
        }
        return var45;
    }
    
    public static SubLObject f37480(final SubLObject var8) {
        final SubLObject var9 = (SubLObject)((module0612.NIL != f37382(var8)) ? f37406(var8) : module0612.NIL);
        final SubLObject var10 = (SubLObject)((module0612.NIL != module0004.f106(var9)) ? f37481(var8) : module0612.NIL);
        return (SubLObject)((module0612.NIL != module0172.f10917(var10)) ? module0202.f12768(module0612.$ic45$, var9, var10) : module0612.NIL);
    }
    
    public static SubLObject f37481(final SubLObject var8) {
        final SubLObject var9 = (SubLObject)((module0612.NIL != f37382(var8)) ? f37405(var8) : module0612.NIL);
        final SubLObject var10 = (SubLObject)((module0612.NIL != module0004.f106(var9)) ? f37449(var8) : module0612.NIL);
        return (SubLObject)((module0612.NIL != module0172.f10917(var10)) ? module0202.f12768(module0612.$ic44$, var9, var10) : module0612.NIL);
    }
    
    public static SubLObject f37449(final SubLObject var8) {
        final SubLObject var9 = (SubLObject)((module0612.NIL != f37382(var8)) ? f37404(var8) : module0612.NIL);
        final SubLObject var10 = (SubLObject)((module0612.NIL != module0004.f105(var9)) ? f37482(var8) : module0612.NIL);
        return (SubLObject)((module0612.NIL != module0172.f10917(var10)) ? module0202.f12768(module0612.$ic43$, var9, var10) : module0612.NIL);
    }
    
    public static SubLObject f37482(final SubLObject var8) {
        final SubLObject var9 = (SubLObject)((module0612.NIL != f37382(var8)) ? f37401(var8) : module0612.NIL);
        final SubLObject var10 = (SubLObject)((module0612.NIL != module0173.f10955(var9)) ? f37483(var8) : module0612.NIL);
        return (SubLObject)((module0612.NIL != module0172.f10917(var10)) ? module0202.f12768(module0612.$ic42$, var9, var10) : module0612.NIL);
    }
    
    public static SubLObject f37471(final SubLObject var8) {
        final SubLObject var9 = (SubLObject)((module0612.NIL != f37382(var8)) ? f37401(var8) : module0612.NIL);
        final SubLObject var10 = (SubLObject)((module0612.NIL != module0173.f10955(var9)) ? f37484(var9) : module0612.NIL);
        final SubLObject var11 = (SubLObject)(var10.isInteger() ? f37483(var8) : module0612.NIL);
        return (SubLObject)((module0612.NIL != module0172.f10917(var11)) ? module0202.f12768(module0612.$ic48$, var10, var11) : module0612.NIL);
    }
    
    public static SubLObject f37484(final SubLObject var31) {
        return module0048.f_1X(Numbers.integerDivide(f37417(var31), (SubLObject)module0612.FOUR_INTEGER));
    }
    
    public static SubLObject f37483(final SubLObject var8) {
        final SubLObject var9 = (SubLObject)((module0612.NIL != f37382(var8)) ? f37400(var8) : module0612.NIL);
        return (SubLObject)(var9.isInteger() ? module0202.f12643(module0612.$ic41$, var9) : module0612.NIL);
    }
    
    public static SubLObject f37470(final SubLObject var8) {
        SubLObject var9 = f37399(var8);
        if (!var9.isInteger()) {
            final SubLObject var10 = f37400(var8);
            if (var10.isInteger()) {
                var9 = Numbers.integerDivide(var10, (SubLObject)module0612.TEN_INTEGER);
            }
        }
        return (SubLObject)(var9.isInteger() ? module0202.f12643(module0612.$ic49$, var9) : module0612.NIL);
    }
    
    public static SubLObject f37469(final SubLObject var8) {
        SubLObject var9 = f37397(var8);
        if (!var9.isInteger()) {
            final SubLObject var10 = f37400(var8);
            if (var10.isInteger()) {
                final SubLObject var11 = module0048.f_1_(var10);
                final SubLObject var12 = Numbers.integerDivide(var11, (SubLObject)module0612.$ic56$);
                final SubLObject var13 = var9 = module0048.f_1X(var12);
            }
        }
        if (!var9.isInteger()) {
            final SubLObject var14 = f37399(var8);
            if (var14.isInteger() && !Numbers.mod(var14, (SubLObject)module0612.TEN_INTEGER).isZero()) {
                final SubLObject var15 = Numbers.integerDivide(var14, (SubLObject)module0612.TEN_INTEGER);
                final SubLObject var16 = var9 = module0048.f_1X(var15);
            }
        }
        return (SubLObject)(var9.isInteger() ? module0202.f12643(module0612.$ic50$, var9) : module0612.NIL);
    }
    
    public static SubLObject f37485(final SubLObject var97, final SubLObject var98) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0612.NIL != f37486(var97, var98) || module0612.NIL != f37487(var97, var98));
    }
    
    public static SubLObject f37488(final SubLObject var97, final SubLObject var98) {
        return f37485(var98, var97);
    }
    
    public static SubLObject f37486(final SubLObject var97, final SubLObject var98) {
        return Equality.equal(var97, var98);
    }
    
    public static SubLObject f37487(final SubLObject var97, final SubLObject var98) {
        if (module0612.NIL != f37389(var98)) {
            return (SubLObject)module0612.NIL;
        }
        if (module0612.NIL != f37389(var97)) {
            return (SubLObject)module0612.T;
        }
        if (module0612.NIL != f37388(var97)) {
            return (SubLObject)module0612.NIL;
        }
        if (module0612.NIL != f37388(var98)) {
            return (SubLObject)module0612.T;
        }
        if (module0612.NIL == f37382(var97) || module0612.NIL == f37382(var98)) {
            return (SubLObject)module0612.NIL;
        }
        final SubLObject var99 = f37412(var97);
        final SubLObject var100 = f37412(var98);
        if (var99.eql(var100)) {
            return f37489(var97, var98);
        }
        if (module0612.NIL != f37396(var99, var100)) {
            return f37489(var97, f37468(var98, var99));
        }
        return f37489(f37468(var97, var100), var98);
    }
    
    public static SubLObject f37490(final SubLObject var97, final SubLObject var98) {
        return f37487(var98, var97);
    }
    
    public static SubLObject f37489(final SubLObject var97, final SubLObject var98) {
        final SubLThread var99 = SubLProcess.currentSubLThread();
        var99.resetMultipleValues();
        final SubLObject var100 = f37398(var97);
        final SubLObject var101 = var99.secondMultipleValue();
        final SubLObject var102 = var99.thirdMultipleValue();
        final SubLObject var103 = var99.fourthMultipleValue();
        final SubLObject var104 = var99.fifthMultipleValue();
        final SubLObject var105 = var99.sixthMultipleValue();
        final SubLObject var106 = var99.seventhMultipleValue();
        var99.resetMultipleValues();
        var99.resetMultipleValues();
        final SubLObject var107 = f37398(var98);
        final SubLObject var108 = var99.secondMultipleValue();
        final SubLObject var109 = var99.thirdMultipleValue();
        final SubLObject var110 = var99.fourthMultipleValue();
        final SubLObject var111 = var99.fifthMultipleValue();
        final SubLObject var112 = var99.sixthMultipleValue();
        final SubLObject var113 = var99.seventhMultipleValue();
        var99.resetMultipleValues();
        if (var101.isInteger() && var108.isInteger() && var101.numL(var108)) {
            return (SubLObject)module0612.T;
        }
        if (!var101.eql(var108)) {
            return (SubLObject)module0612.NIL;
        }
        if (var102.isInteger() && var109.isInteger() && var102.numL(var109)) {
            return (SubLObject)module0612.T;
        }
        if (!var102.eql(var109)) {
            return (SubLObject)module0612.NIL;
        }
        if (var103.isInteger() && var110.isInteger() && var103.numL(var110)) {
            return (SubLObject)module0612.T;
        }
        if (!var103.eql(var110)) {
            return (SubLObject)module0612.NIL;
        }
        if (var104.isInteger() && var111.isInteger() && var104.numL(var111)) {
            return (SubLObject)module0612.T;
        }
        if (!var104.eql(var111)) {
            return (SubLObject)module0612.NIL;
        }
        if (var105.isInteger() && var112.isInteger() && var105.numL(var112)) {
            return (SubLObject)module0612.T;
        }
        if (!var105.eql(var112)) {
            return (SubLObject)module0612.NIL;
        }
        if (var106.isInteger() && var113.isInteger() && var106.numL(var113)) {
            return (SubLObject)module0612.T;
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37491(SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0612.NIL == Errors.$ignore_mustsP$.getDynamicValue(var9) && module0612.NIL == f37382(var8)) {
            Errors.error((SubLObject)module0612.$ic116$, var8);
        }
        SubLObject var10 = (SubLObject)module0612.ZERO_INTEGER;
        SubLObject var11 = (SubLObject)module0612.ZERO_INTEGER;
        SubLObject var12 = (SubLObject)module0612.ZERO_INTEGER;
        SubLObject var13 = (SubLObject)module0612.ONE_INTEGER;
        SubLObject var14 = (SubLObject)module0612.ONE_INTEGER;
        SubLObject var15 = (SubLObject)module0612.NIL;
        while (var8.isCons()) {
            final SubLObject var17;
            final SubLObject var16 = var17 = var8.first();
            if (var17.eql(module0612.$ic46$)) {
                var10 = conses_high.second(var8);
                var8 = conses_high.third(var8);
            }
            else if (var17.eql(module0612.$ic45$)) {
                var11 = conses_high.second(var8);
                var8 = conses_high.third(var8);
            }
            else if (var17.eql(module0612.$ic44$)) {
                var12 = conses_high.second(var8);
                var8 = conses_high.third(var8);
            }
            else if (var17.eql(module0612.$ic43$)) {
                var13 = conses_high.second(var8);
                var8 = conses_high.third(var8);
            }
            else if (var17.eql(module0612.$ic42$)) {
                var14 = f37417(conses_high.second(var8));
                var8 = conses_high.third(var8);
            }
            else if (var17.eql(module0612.$ic48$)) {
                var14 = Numbers.subtract(Numbers.multiply(conses_high.second(var8), (SubLObject)module0612.THREE_INTEGER), (SubLObject)module0612.TWO_INTEGER);
                var8 = conses_high.third(var8);
            }
            else if (var17.eql(module0612.$ic41$)) {
                var15 = conses_high.second(var8);
                var8 = (SubLObject)module0612.NIL;
            }
            else if (var17.eql(module0612.$ic49$)) {
                var15 = Numbers.multiply(conses_high.second(var8), (SubLObject)module0612.TEN_INTEGER);
                var8 = (SubLObject)module0612.NIL;
            }
            else {
                if (!var17.eql(module0612.$ic50$)) {
                    return (SubLObject)module0612.NIL;
                }
                var15 = module0048.f_1X(Numbers.multiply(module0048.f_1_(conses_high.second(var8)), (SubLObject)module0612.$ic56$));
                var8 = (SubLObject)module0612.NIL;
            }
        }
        var14 = f37402(var14);
        return f37418(var10, var11, var12, var13, var14, var15);
    }
    
    public static SubLObject f37492(final SubLObject var8) {
        assert module0612.NIL != f37382(var8) : var8;
        SubLObject var9 = var8;
        SubLObject var10 = (SubLObject)module0612.$ic107$;
        SubLObject var11 = (SubLObject)module0612.$ic107$;
        SubLObject var12 = (SubLObject)module0612.$ic108$;
        SubLObject var13 = (SubLObject)module0612.NIL;
        SubLObject var14 = (SubLObject)module0612.TWELVE_INTEGER;
        SubLObject var15 = (SubLObject)module0612.NIL;
        while (var9.isCons()) {
            final SubLObject var17;
            final SubLObject var16 = var17 = var9.first();
            if (var17.eql(module0612.$ic46$)) {
                var10 = conses_high.second(var9);
                var9 = conses_high.third(var9);
            }
            else if (var17.eql(module0612.$ic45$)) {
                var11 = conses_high.second(var9);
                var9 = conses_high.third(var9);
            }
            else if (var17.eql(module0612.$ic44$)) {
                var12 = conses_high.second(var9);
                var9 = conses_high.third(var9);
            }
            else if (var17.eql(module0612.$ic43$)) {
                var13 = conses_high.second(var9);
                var9 = conses_high.third(var9);
            }
            else if (var17.eql(module0612.$ic42$)) {
                var14 = f37417(conses_high.second(var9));
                var9 = conses_high.third(var9);
            }
            else if (var17.eql(module0612.$ic48$)) {
                var14 = Numbers.multiply(conses_high.second(var9), (SubLObject)module0612.THREE_INTEGER);
                var9 = conses_high.third(var9);
            }
            else if (var17.eql(module0612.$ic41$)) {
                var15 = conses_high.second(var9);
                var9 = (SubLObject)module0612.NIL;
            }
            else if (var17.eql(module0612.$ic49$)) {
                var15 = Numbers.add(Numbers.multiply(conses_high.second(var9), (SubLObject)module0612.TEN_INTEGER), (SubLObject)module0612.NINE_INTEGER);
                var9 = (SubLObject)module0612.NIL;
            }
            else {
                if (!var17.eql(module0612.$ic50$)) {
                    return (SubLObject)module0612.NIL;
                }
                var15 = Numbers.multiply(conses_high.second(var9), (SubLObject)module0612.$ic56$);
                var9 = (SubLObject)module0612.NIL;
            }
        }
        if (module0612.NIL == var13) {
            var13 = (SubLObject)((var14.numE((SubLObject)module0612.TWO_INTEGER) && module0612.NIL != module0051.f3655(var15)) ? module0612.$ic117$ : module0051.f3656(var14));
        }
        var14 = f37402(var14);
        return f37418(var10, var11, var12, var13, var14, var15);
    }
    
    public static SubLObject f37493(final SubLObject var97, final SubLObject var98) {
        final SubLObject var99 = (SubLObject)SubLObjectFactory.makeBoolean(module0612.NIL != f37382(var97) && module0612.NIL != f37382(var98));
        final SubLObject var100 = (SubLObject)SubLObjectFactory.makeBoolean(module0612.NIL != var99 && module0612.NIL != f37485(f37491(var97), f37491(var98)) && module0612.NIL != f37485(f37492(var98), f37492(var97)));
        return Values.values(var100, var99);
    }
    
    public static SubLObject f37479(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        var41.resetMultipleValues();
        final SubLObject var42 = module0610.f37199(var40);
        final SubLObject var43 = var41.secondMultipleValue();
        final SubLObject var44 = var41.thirdMultipleValue();
        var41.resetMultipleValues();
        if (!var43.numE(var44)) {
            module0229.f15259();
        }
        return Values.values(var42, var43);
    }
    
    public static SubLObject f37453(final SubLObject var8, SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        assert module0612.NIL != f37382(var8) : var8;
        assert module0612.NIL != module0615.f37703(var40) : var40;
        var40 = f37478(var8, var40);
        var41.resetMultipleValues();
        final SubLObject var42 = f37398(var8);
        final SubLObject var43 = var41.secondMultipleValue();
        final SubLObject var44 = var41.thirdMultipleValue();
        final SubLObject var45 = var41.fourthMultipleValue();
        final SubLObject var46 = var41.fifthMultipleValue();
        final SubLObject var47 = var41.sixthMultipleValue();
        final SubLObject var48 = var41.seventhMultipleValue();
        var41.resetMultipleValues();
        var41.resetMultipleValues();
        final SubLObject var49 = f37479(var40);
        final SubLObject var50 = var41.secondMultipleValue();
        var41.resetMultipleValues();
        if (var42 == module0612.$ic39$) {
            return f37432(var49, var50, var43, var44, var45, var46, var47, var48);
        }
        if (var42 == module0612.$ic23$) {
            return f37433(var49, var50, var43, var44);
        }
        if (var42 == module0612.$ic21$) {
            return f37434(var49, var50, var43);
        }
        if (var42 == module0612.$ic20$) {
            return f37435(var49, var50, var43);
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37450(final SubLObject var8, SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        assert module0612.NIL != f37382(var8) : var8;
        assert module0612.NIL != module0615.f37703(var40) : var40;
        var40 = f37478(var8, var40);
        var41.resetMultipleValues();
        final SubLObject var42 = f37398(var8);
        final SubLObject var43 = var41.secondMultipleValue();
        final SubLObject var44 = var41.thirdMultipleValue();
        final SubLObject var45 = var41.fourthMultipleValue();
        final SubLObject var46 = var41.fifthMultipleValue();
        final SubLObject var47 = var41.sixthMultipleValue();
        final SubLObject var48 = var41.seventhMultipleValue();
        var41.resetMultipleValues();
        var41.resetMultipleValues();
        final SubLObject var49 = f37479(var40);
        final SubLObject var50 = var41.secondMultipleValue();
        var41.resetMultipleValues();
        if (var42 == module0612.$ic39$) {
            return f37432(var49, Numbers.minus(var50), var43, var44, var45, var46, var47, var48);
        }
        if (var42 == module0612.$ic23$) {
            return f37433(var49, Numbers.minus(var50), var43, var44);
        }
        if (var42 == module0612.$ic21$) {
            return f37434(var49, Numbers.minus(var50), var43);
        }
        if (var42 == module0612.$ic20$) {
            return f37435(var49, Numbers.minus(var50), var43);
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37494(final SubLObject var115) {
        final SubLObject var116 = module0205.f13136(var115);
        final SubLObject var117 = module0205.f13203(var115, (SubLObject)module0612.UNPROVIDED);
        final SubLObject var118 = var116;
        if (var118.eql(module0612.$ic72$)) {
            return var117;
        }
        if (var118.eql(module0612.$ic71$)) {
            return Numbers.multiply(var117, module0051.$g81$.getGlobalValue());
        }
        if (var118.eql(module0612.$ic70$)) {
            return Numbers.multiply(var117, module0051.$g996$.getGlobalValue());
        }
        if (var118.eql(module0612.$ic69$)) {
            return Numbers.multiply(var117, module0051.$g995$.getGlobalValue());
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37495(final SubLObject var115) {
        final SubLObject var116 = module0205.f13136(var115);
        final SubLObject var117 = module0205.f13203(var115, (SubLObject)module0612.UNPROVIDED);
        final SubLObject var118 = var116;
        if (var118.eql(module0612.$ic71$)) {
            return var117;
        }
        if (var118.eql(module0612.$ic70$)) {
            return Numbers.multiply(var117, module0051.$g997$.getGlobalValue());
        }
        if (var118.eql(module0612.$ic69$)) {
            return Numbers.multiply(var117, module0051.$g998$.getGlobalValue(), module0051.$g997$.getGlobalValue());
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37496(final SubLObject var115) {
        final SubLObject var116 = module0205.f13136(var115);
        final SubLObject var117 = module0205.f13203(var115, (SubLObject)module0612.UNPROVIDED);
        final SubLObject var118 = var116;
        if (var118.eql(module0612.$ic70$)) {
            return var117;
        }
        if (var118.eql(module0612.$ic69$)) {
            return Numbers.multiply(var117, module0051.$g998$.getGlobalValue());
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37497(final SubLObject var115) {
        final SubLObject var116 = module0205.f13136(var115);
        final SubLObject var117 = module0205.f13203(var115, (SubLObject)module0612.UNPROVIDED);
        final SubLObject var118 = var116;
        if (var118.eql(module0612.$ic69$)) {
            return var117;
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37498(final SubLObject var115) {
        final SubLObject var116 = module0205.f13136(var115);
        final SubLObject var117 = module0205.f13203(var115, (SubLObject)module0612.UNPROVIDED);
        final SubLObject var118 = var116;
        if (var118.eql(module0612.$ic67$)) {
            return var117;
        }
        if (var118.eql(module0612.$ic75$)) {
            return Numbers.multiply(var117, module0051.$g999$.getGlobalValue());
        }
        if (var118.eql(module0612.$ic66$)) {
            return Numbers.multiply(var117, module0051.$g1000$.getGlobalValue());
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37499(final SubLObject var115) {
        final SubLObject var116 = module0205.f13136(var115);
        final SubLObject var117 = module0205.f13203(var115, (SubLObject)module0612.UNPROVIDED);
        final SubLObject var118 = var116;
        if (var118.eql(module0612.$ic66$)) {
            return var117;
        }
        if (var118.eql(module0612.$ic76$)) {
            return Numbers.multiply(var117, module0051.$g1001$.getGlobalValue());
        }
        if (var118.eql(module0612.$ic78$)) {
            return Numbers.multiply(var117, module0051.$g1002$.getGlobalValue());
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37500(final SubLObject var118, final SubLObject var119, SubLObject var51) {
        if (var51 == module0612.UNPROVIDED) {
            var51 = (SubLObject)module0612.NIL;
        }
        SubLObject var120 = (SubLObject)module0612.NIL;
        if (module0612.NIL == var51) {
            var51 = f37501(var118, var119);
        }
        final SubLObject var121 = var51;
        if (var121.eql(module0612.$ic76$)) {
            var120 = f37502(var118, var119, var51, (SubLObject)module0612.TEN_INTEGER);
        }
        else if (var121.eql(module0612.$ic66$)) {
            var120 = f37502(var118, var119, var51, (SubLObject)module0612.UNPROVIDED);
        }
        else if (var121.eql(module0612.$ic75$)) {
            var120 = f37503(var118, var119, var51, (SubLObject)module0612.THREE_INTEGER);
        }
        else if (var121.eql(module0612.$ic67$)) {
            var120 = f37503(var118, var119, var51, (SubLObject)module0612.UNPROVIDED);
        }
        else {
            final SubLObject var122 = f37491(var118);
            final SubLObject var123 = f37491(var119);
            if (var122.equal(var123)) {
                var120 = (SubLObject)ConsesLow.list(var51, (SubLObject)module0612.ZERO_INTEGER);
            }
            else if (module0612.NIL != f37487(var122, var123)) {
                var120 = f37504(var122, var123, var51);
            }
            else {
                var120 = f37504(var123, var122, var51);
            }
        }
        return var120;
    }
    
    public static SubLObject f37501(final SubLObject var118, final SubLObject var119) {
        final SubLObject var120 = f37425(var118);
        final SubLObject var121 = f37425(var119);
        if (var120.eql(module0612.$ic32$) || var121.eql(module0612.$ic32$)) {
            return module0612.$ic72$;
        }
        if (var120.eql(module0612.$ic33$) || var121.eql(module0612.$ic33$)) {
            return module0612.$ic71$;
        }
        if (var120.eql(module0612.$ic34$) || var121.eql(module0612.$ic34$)) {
            return module0612.$ic70$;
        }
        if (var120.eql(module0612.$ic35$) || var121.eql(module0612.$ic35$)) {
            return module0612.$ic69$;
        }
        if (var120.eql(module0612.$ic36$) || var121.eql(module0612.$ic36$)) {
            return module0612.$ic67$;
        }
        if (var120.eql(module0612.$ic106$) || var121.eql(module0612.$ic106$)) {
            return module0612.$ic75$;
        }
        if (var120.eql(module0612.$ic37$) || var121.eql(module0612.$ic37$)) {
            return module0612.$ic66$;
        }
        if (var120.eql(module0612.$ic111$) || var121.eql(module0612.$ic111$)) {
            return module0612.$ic76$;
        }
        Errors.error((SubLObject)module0612.$ic119$, var118, var119);
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37504(final SubLObject var124, final SubLObject var125, final SubLObject var51) {
        SubLObject var126 = (SubLObject)module0612.NIL;
        if (var51.eql(module0612.$ic66$)) {
            var126 = f37505(var124, var125);
        }
        else if (var51.eql(module0612.$ic67$)) {
            var126 = f37506(var124, var125);
        }
        else if (var51.eql(module0612.$ic69$)) {
            var126 = f37507(var124, var125);
        }
        else if (var51.eql(module0612.$ic70$)) {
            var126 = f37508(var124, var125);
        }
        else if (var51.eql(module0612.$ic71$)) {
            var126 = f37509(var124, var125);
        }
        else if (var51.eql(module0612.$ic72$)) {
            var126 = f37510(var124, var125);
        }
        return (SubLObject)ConsesLow.list(var51, var126);
    }
    
    public static SubLObject f37505(final SubLObject var124, final SubLObject var125) {
        return Numbers.subtract(f37400(var125), f37400(var124));
    }
    
    public static SubLObject f37506(final SubLObject var124, final SubLObject var125) {
        return Numbers.add(Numbers.multiply((SubLObject)module0612.TWELVE_INTEGER, f37505(var124, var125)), Numbers.subtract(f37403(var125), f37403(var124)));
    }
    
    public static SubLObject f37507(final SubLObject var124, final SubLObject var125) {
        return Numbers.subtract(f37456(var125), f37456(var124));
    }
    
    public static SubLObject f37508(final SubLObject var124, final SubLObject var125) {
        return Numbers.add(Numbers.multiply((SubLObject)module0612.$ic74$, f37507(var124, var125)), Numbers.subtract(f37405(var125), f37405(var124)));
    }
    
    public static SubLObject f37509(final SubLObject var124, final SubLObject var125) {
        return Numbers.add(Numbers.multiply((SubLObject)module0612.$ic73$, f37508(var124, var125)), Numbers.subtract(f37406(var125), f37406(var124)));
    }
    
    public static SubLObject f37510(final SubLObject var124, final SubLObject var125) {
        return Numbers.add(Numbers.multiply((SubLObject)module0612.$ic73$, f37509(var124, var125)), Numbers.subtract(f37407(var125), f37407(var124)));
    }
    
    public static SubLObject f37447(final SubLObject var124, final SubLObject var125) {
        final SubLObject var126 = f37400(var124);
        final SubLObject var127 = f37400(var125);
        final SubLObject var128 = f37403(var124);
        final SubLObject var129 = Numbers.truncate(var126, (SubLObject)module0612.$ic56$);
        final SubLObject var130 = Numbers.truncate(var127, (SubLObject)module0612.$ic56$);
        SubLObject var131 = f37511(var126, var127);
        if (var126.numE(var127)) {
            return (SubLObject)module0612.ZERO_INTEGER;
        }
        if (module0612.NIL != module0051.f3655(var126) && (!var128.isNumber() || var128.numL((SubLObject)module0612.THREE_INTEGER))) {
            var131 = Numbers.add(var131, (SubLObject)module0612.ONE_INTEGER);
        }
        if (var130.numG(var129)) {
            final SubLObject var132 = f37511(var129, var130);
            var131 = Numbers.subtract(var131, Numbers.subtract(Numbers.subtract(var130, var129), var132));
        }
        return var131;
    }
    
    public static SubLObject f37511(final SubLObject var126, final SubLObject var127) {
        final SubLObject var128 = Numbers.floor(Numbers.add(Numbers.subtract(var127, var126), Numbers.mod(var126, (SubLObject)module0612.FOUR_INTEGER)), (SubLObject)module0612.FOUR_INTEGER);
        return var128;
    }
    
    public static SubLObject f37502(final SubLObject var118, final SubLObject var119, final SubLObject var51, SubLObject var133) {
        if (var133 == module0612.UNPROVIDED) {
            var133 = (SubLObject)module0612.ONE_INTEGER;
        }
        final SubLObject var134 = f37512(var118);
        final SubLObject var135 = f37512(var119);
        final SubLObject var136 = Numbers.multiply(module0612.$g4720$.getGlobalValue(), var133);
        SubLObject var137 = (SubLObject)module0612.NIL;
        if (var134.numL(var135)) {
            var137 = Numbers.subtract(Numbers.integerDivide(var135, var136), Numbers.integerDivide(var134, var136));
        }
        else {
            var137 = Numbers.subtract(Numbers.integerDivide(var134, var136), Numbers.integerDivide(var135, var136));
        }
        return (SubLObject)ConsesLow.list(var51, var137);
    }
    
    public static SubLObject f37503(final SubLObject var118, final SubLObject var119, final SubLObject var51, SubLObject var136) {
        if (var136 == module0612.UNPROVIDED) {
            var136 = (SubLObject)module0612.ONE_INTEGER;
        }
        final SubLThread var137 = SubLProcess.currentSubLThread();
        final SubLObject var138 = f37512(var118);
        final SubLObject var139 = f37512(var119);
        SubLObject var140 = (SubLObject)module0612.NIL;
        var137.resetMultipleValues();
        final SubLObject var141 = module0051.f3648(var138);
        final SubLObject var142 = var137.secondMultipleValue();
        final SubLObject var143 = var137.thirdMultipleValue();
        final SubLObject var144 = var137.fourthMultipleValue();
        final SubLObject var145 = var137.fifthMultipleValue();
        final SubLObject var146 = var137.sixthMultipleValue();
        var137.resetMultipleValues();
        var137.resetMultipleValues();
        final SubLObject var147 = module0051.f3648(var139);
        final SubLObject var148 = var137.secondMultipleValue();
        final SubLObject var149 = var137.thirdMultipleValue();
        final SubLObject var150 = var137.fourthMultipleValue();
        final SubLObject var151 = var137.fifthMultipleValue();
        final SubLObject var152 = var137.sixthMultipleValue();
        var137.resetMultipleValues();
        if (var138.numL(var139)) {
            var140 = Numbers.integerDivide(Numbers.add(Numbers.multiply((SubLObject)module0612.TWELVE_INTEGER, Numbers.subtract(var152, var146)), Numbers.subtract(var151, var145)), var136);
        }
        else {
            var140 = Numbers.integerDivide(Numbers.add(Numbers.multiply((SubLObject)module0612.TWELVE_INTEGER, Numbers.subtract(var146, var152)), Numbers.subtract(var145, var151)), var136);
        }
        return (SubLObject)ConsesLow.list(var51, var140);
    }
    
    public static SubLObject f37513(final SubLObject var149, final SubLObject var150) {
        final SubLThread var151 = SubLProcess.currentSubLThread();
        final SubLObject var152 = f37514(var149);
        final SubLObject var153 = f37514(var150);
        final SubLObject var154 = f37500(var152, var153, (SubLObject)module0612.UNPROVIDED);
        if (module0612.NIL == Errors.$ignore_mustsP$.getDynamicValue(var151) && module0612.NIL == module0202.f12589(var154, module0612.$ic69$)) {
            Errors.error((SubLObject)module0612.$ic121$, var154);
        }
        final SubLObject var155 = module0205.f13277(var154, (SubLObject)module0612.UNPROVIDED);
        return var155;
    }
    
    public static SubLObject f37473(final SubLObject var155) {
        return module0004.f104(var155, module0612.$g4721$.getGlobalValue(), (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
    }
    
    public static SubLObject f37515(final SubLObject var155) {
        if (module0612.NIL != module0167.f10813(var155)) {
            return f37515(module0172.f10920(var155));
        }
        if (var155.isAtom()) {
            return f37473(var155);
        }
        if (var155.isList()) {
            return module0205.f13145((SubLObject)module0612.$ic124$, var155, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37516(final SubLObject var156) {
        final SubLObject var157 = f37517(var156);
        SubLObject var158 = var156.first();
        SubLObject var159 = var156.rest();
        SubLObject var160 = (SubLObject)module0612.NIL;
        var160 = var159.first();
        while (module0612.NIL != var159) {
            final SubLObject var161 = (module0612.NIL != f37515(var160)) ? Hashtables.gethash(var160, var157, (SubLObject)module0612.UNPROVIDED) : var160;
            final SubLObject var162 = (module0612.NIL != f37515(var158)) ? Hashtables.gethash(var158, var157, (SubLObject)module0612.UNPROVIDED) : var158;
            if (module0612.NIL != f37487(var161, var162)) {
                var158 = var160;
            }
            var159 = var159.rest();
            var160 = var159.first();
        }
        return var158;
    }
    
    public static SubLObject f37518(final SubLObject var156) {
        final SubLObject var157 = f37517(var156);
        SubLObject var158 = var156.first();
        SubLObject var159 = var156.rest();
        SubLObject var160 = (SubLObject)module0612.NIL;
        var160 = var159.first();
        while (module0612.NIL != var159) {
            final SubLObject var161 = (module0612.NIL != f37515(var160)) ? Hashtables.gethash(var160, var157, (SubLObject)module0612.UNPROVIDED) : var160;
            final SubLObject var162 = (module0612.NIL != f37515(var158)) ? Hashtables.gethash(var158, var157, (SubLObject)module0612.UNPROVIDED) : var158;
            if (module0612.NIL != f37487(var162, var161)) {
                var158 = var160;
            }
            var159 = var159.rest();
            var160 = var159.first();
        }
        return var158;
    }
    
    public static SubLObject f37517(final SubLObject var161) {
        final SubLObject var162 = Sequences.remove_duplicates(module0035.f2399(var161, (SubLObject)module0612.$ic124$, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED), (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
        final SubLObject var163 = Hashtables.make_hash_table((SubLObject)module0612.ZERO_INTEGER, (SubLObject)module0612.EQ, (SubLObject)module0612.UNPROVIDED);
        SubLObject var164 = var162;
        SubLObject var165 = (SubLObject)module0612.NIL;
        var165 = var164.first();
        while (module0612.NIL != var164) {
            Hashtables.sethash(var165, var163, module0489.f31997(var165));
            var164 = var164.rest();
            var165 = var164.first();
        }
        return var163;
    }
    
    public static SubLObject f37519(final SubLObject var155) {
        return (module0612.NIL != f37515(var155)) ? f37520(var155) : var155;
    }
    
    public static SubLObject f37520(final SubLObject var155) {
        return module0205.f13147(var155, (SubLObject)module0612.$ic124$, (SubLObject)module0612.$ic125$, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
    }
    
    public static SubLObject f37521(final SubLObject var165) {
        return Mapping.mapcar((SubLObject)module0612.$ic126$, var165);
    }
    
    public static SubLObject f37522() {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        return module0612.$g4722$.getDynamicValue(var28);
    }
    
    public static SubLObject f37523() {
        final SubLObject var166 = module0373.f26114();
        return (module0612.NIL != var166) ? var166 : Time.get_universal_time();
    }
    
    public static SubLObject f37524(final SubLObject var12, final SubLObject var13) {
        final SubLObject var14 = var12.rest();
        final SubLObject var16;
        final SubLObject var15 = var16 = var14;
        return (SubLObject)ConsesLow.listS((SubLObject)module0612.$ic127$, (SubLObject)module0612.$ic128$, ConsesLow.append(var16, (SubLObject)module0612.NIL));
    }
    
    public static SubLObject f37525(final SubLObject var12, final SubLObject var13) {
        final SubLObject var14 = var12.rest();
        final SubLObject var16;
        final SubLObject var15 = var16 = var14;
        return (SubLObject)ConsesLow.listS((SubLObject)module0612.$ic127$, (SubLObject)module0612.$ic129$, ConsesLow.append(var16, (SubLObject)module0612.NIL));
    }
    
    public static SubLObject f37526(final SubLObject var12, final SubLObject var13) {
        final SubLObject var14 = var12.rest();
        final SubLObject var16;
        final SubLObject var15 = var16 = var14;
        return (SubLObject)ConsesLow.listS((SubLObject)module0612.$ic127$, (SubLObject)module0612.$ic130$, ConsesLow.append(var16, (SubLObject)module0612.NIL));
    }
    
    public static SubLObject f37527() {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)module0612.NIL;
        final SubLObject var30 = module0612.$g4722$.currentBinding(var28);
        try {
            module0612.$g4722$.bind((module0612.NIL != module0612.$g4722$.getDynamicValue(var28)) ? module0612.$g4722$.getDynamicValue(var28) : f37523(), var28);
            var29 = f37426(f37522());
        }
        finally {
            module0612.$g4722$.rebind(var30, var28);
        }
        return var29;
    }
    
    public static SubLObject f37528() {
        return f37514(module0051.f3557((SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED));
    }
    
    public static SubLObject f37529() {
        return module0613.f37585(f37528(), (SubLObject)module0612.$ic131$);
    }
    
    public static SubLObject f37530() {
        return module0613.f37586(f37528(), (SubLObject)module0612.$ic131$);
    }
    
    public static SubLObject f37531() {
        return Numbers.subtract(Time.get_universal_time(), module0612.$g4513$.getGlobalValue());
    }
    
    public static SubLObject f37532(final SubLObject var175) {
        final SubLObject var176 = (module0612.NIL != module0615.f37682(var175)) ? module0615.f37688(var175) : module0615.f37691(var175);
        final SubLObject var177 = (SubLObject)((module0612.NIL != var176) ? f37533(var175, (SubLObject)module0612.UNPROVIDED) : module0612.NIL);
        final SubLObject var178 = (SubLObject)((module0612.NIL != var177) ? f37450(var177, var176) : module0612.NIL);
        return (SubLObject)((module0612.NIL != var178 && module0612.NIL != f37493(var178, f37527())) ? var178 : module0612.NIL);
    }
    
    public static SubLObject f37533(final SubLObject var179, SubLObject var180) {
        if (var180 == module0612.UNPROVIDED) {
            var180 = f37527();
        }
        final SubLObject var181 = f37400(var180);
        final SubLObject var182 = f37401(var180);
        final SubLObject var183 = f37404(var180);
        final SubLObject var184 = f37405(var180);
        final SubLObject var185 = f37406(var180);
        final SubLObject var186 = f37407(var180);
        SubLObject var187 = var179;
        final SubLObject var188 = (SubLObject)module0612.NIL;
        SubLObject var189 = (SubLObject)module0612.NIL;
        SubLObject var190 = (SubLObject)module0612.NIL;
        SubLObject var191 = (SubLObject)module0612.NIL;
        SubLObject var192 = (SubLObject)module0612.NIL;
        SubLObject var193 = (SubLObject)module0612.NIL;
        SubLObject var194 = (SubLObject)module0612.NIL;
        SubLObject var195 = var181;
        SubLObject var196 = (SubLObject)module0612.NIL;
        SubLObject var197 = (SubLObject)module0612.NIL;
        SubLObject var198 = (SubLObject)module0612.NIL;
        SubLObject var199 = (SubLObject)module0612.NIL;
        SubLObject var200 = (SubLObject)module0612.NIL;
        SubLObject var201 = (SubLObject)module0612.NIL;
        final SubLObject var202 = var187;
        if (var202.eql(module0612.$ic32$)) {
            return f37424(f37432(module0612.$ic72$, (SubLObject)module0612.ONE_INTEGER, var181, f37417(var182), var183, var184, var185, var186), var187, (SubLObject)module0612.UNPROVIDED);
        }
        if (var202.eql(module0612.$ic33$)) {
            return f37424(f37432(module0612.$ic71$, (SubLObject)module0612.ONE_INTEGER, var181, f37417(var182), var183, var184, var185, (SubLObject)module0612.ZERO_INTEGER), var187, (SubLObject)module0612.UNPROVIDED);
        }
        if (var202.eql(module0612.$ic34$)) {
            return f37424(f37432(module0612.$ic70$, (SubLObject)module0612.ONE_INTEGER, var181, f37417(var182), var183, var184, (SubLObject)module0612.ZERO_INTEGER, (SubLObject)module0612.ZERO_INTEGER), var187, (SubLObject)module0612.UNPROVIDED);
        }
        if (var202.eql(module0612.$ic35$)) {
            return f37424(f37432(module0612.$ic69$, (SubLObject)module0612.ONE_INTEGER, var181, f37417(var182), var183, (SubLObject)module0612.ZERO_INTEGER, (SubLObject)module0612.ZERO_INTEGER, (SubLObject)module0612.ZERO_INTEGER), var187, (SubLObject)module0612.UNPROVIDED);
        }
        if (var202.eql(module0612.$ic103$)) {
            var187 = module0612.$ic104$;
            var201 = module0612.$ic35$;
        }
        else {
            if (var202.eql(module0612.$ic36$)) {
                return f37424(f37432(module0612.$ic67$, (SubLObject)module0612.ONE_INTEGER, var181, f37417(var182), (SubLObject)module0612.ONE_INTEGER, (SubLObject)module0612.ZERO_INTEGER, (SubLObject)module0612.ZERO_INTEGER, (SubLObject)module0612.ZERO_INTEGER), var187, (SubLObject)module0612.UNPROVIDED);
            }
            if (var202.eql(module0612.$ic37$)) {
                return f37424(f37432(module0612.$ic66$, (SubLObject)module0612.ONE_INTEGER, var181, (SubLObject)module0612.ONE_INTEGER, (SubLObject)module0612.ONE_INTEGER, (SubLObject)module0612.ZERO_INTEGER, (SubLObject)module0612.ZERO_INTEGER, (SubLObject)module0612.ZERO_INTEGER), var187, (SubLObject)module0612.UNPROVIDED);
            }
            if (var202.eql(module0612.$ic133$)) {
                var187 = module0612.$ic134$;
                var201 = module0612.$ic34$;
            }
            else if (var202.eql(module0612.$ic135$)) {
                var187 = module0612.$ic136$;
                var201 = module0612.$ic34$;
            }
        }
        if (module0612.NIL != module0206.f13453(var187) && module0205.f13276(var187).eql(module0612.$ic137$)) {
            var189 = module0205.f13277(var187, (SubLObject)module0612.UNPROVIDED);
            var187 = module0205.f13368(var187, (SubLObject)module0612.UNPROVIDED);
        }
        else if (module0612.NIL != f37436(var187)) {
            var189 = var187;
            var187 = (SubLObject)module0612.NIL;
        }
        else if (module0612.NIL != f37437(var187)) {
            var189 = f37402(f37417(var187));
            var187 = (SubLObject)module0612.NIL;
        }
        if (module0612.NIL != module0206.f13453(var187) && module0205.f13276(var187).eql(module0612.$ic138$)) {
            var191 = module0205.f13277(var187, (SubLObject)module0612.UNPROVIDED);
            var187 = module0205.f13368(var187, (SubLObject)module0612.UNPROVIDED);
        }
        else if (module0612.NIL != f37455(var187)) {
            var191 = var187;
            var187 = (SubLObject)module0612.NIL;
        }
        else if (module0612.NIL != module0205.f13300(var187, module0612.$ic139$)) {
            var189 = module0205.f13277(var187, (SubLObject)module0612.UNPROVIDED);
            var191 = module0205.f13368(var187, (SubLObject)module0612.UNPROVIDED);
            var187 = (SubLObject)module0612.NIL;
        }
        else if (module0612.NIL != module0205.f13300(var187, module0612.$ic90$)) {
            var191 = module0205.f13277(var187, (SubLObject)module0612.UNPROVIDED);
            var187 = (SubLObject)module0612.NIL;
        }
        if (module0612.NIL != var191 && module0612.NIL != module0206.f13453(var191)) {
            var191 = module0205.f13277(var191, (SubLObject)module0612.UNPROVIDED);
        }
        if (module0612.NIL != f37439(var187)) {
            var190 = var187;
            var187 = (SubLObject)module0612.NIL;
        }
        else if (module0612.NIL != module0206.f13453(var187) && module0205.f13276(var187).eql(module0612.$ic140$)) {
            var190 = module0205.f13277(var187, (SubLObject)module0612.UNPROVIDED);
            var187 = module0205.f13368(var187, (SubLObject)module0612.UNPROVIDED);
        }
        if (module0612.NIL != module0206.f13453(var187) && module0205.f13276(var187).eql(module0612.$ic141$)) {
            var192 = module0205.f13277(var187, (SubLObject)module0612.UNPROVIDED);
            var187 = module0205.f13368(var187, (SubLObject)module0612.UNPROVIDED);
        }
        else if (module0612.NIL != f37459(var187)) {
            var192 = module0205.f13277(var187, (SubLObject)module0612.UNPROVIDED);
            var187 = (SubLObject)module0612.NIL;
        }
        else if (module0612.NIL != f37458(var187)) {
            var192 = f37461(var187);
            var187 = (SubLObject)module0612.NIL;
        }
        if (module0612.NIL != var192 && module0612.NIL != module0206.f13453(var192)) {
            var192 = module0205.f13277(var192, (SubLObject)module0612.UNPROVIDED);
        }
        else if (module0612.NIL != f37458(var192)) {
            var192 = f37461(var192);
        }
        if (module0612.NIL != module0206.f13453(var187) && module0205.f13276(var187).eql(module0612.$ic142$)) {
            var193 = module0205.f13277(var187, (SubLObject)module0612.UNPROVIDED);
            var187 = module0205.f13368(var187, (SubLObject)module0612.UNPROVIDED);
        }
        else if (module0612.NIL != f37462(var187)) {
            var193 = module0205.f13277(var187, (SubLObject)module0612.UNPROVIDED);
            var187 = (SubLObject)module0612.NIL;
        }
        if (module0612.NIL != var193 && module0612.NIL != module0206.f13453(var193)) {
            var193 = module0205.f13277(var193, (SubLObject)module0612.UNPROVIDED);
        }
        if (module0612.NIL != f37463(var187)) {
            var194 = module0205.f13277(var187, (SubLObject)module0612.UNPROVIDED);
            var187 = (SubLObject)module0612.NIL;
        }
        if (module0612.NIL != var187) {
            return (SubLObject)module0612.NIL;
        }
        if (module0612.NIL == var201) {
            var201 = ((module0612.NIL != var194) ? module0612.$ic32$ : ((module0612.NIL != var193) ? module0612.$ic33$ : ((module0612.NIL != var192) ? module0612.$ic34$ : ((module0612.NIL != var191 || module0612.NIL != var190) ? module0612.$ic35$ : ((module0612.NIL != var189) ? module0612.$ic36$ : module0612.$ic37$)))));
        }
        if (module0612.NIL == var194) {
            var194 = (SubLObject)module0612.ZERO_INTEGER;
            if (module0612.NIL == var193) {
                var193 = (SubLObject)module0612.ZERO_INTEGER;
                if (module0612.NIL == var192) {
                    var192 = (SubLObject)module0612.ZERO_INTEGER;
                    if (module0612.NIL == var191 && module0612.NIL == var190) {
                        var191 = (SubLObject)module0612.ONE_INTEGER;
                        if (module0612.NIL == var189 && module0612.NIL == var190) {
                            var189 = module0612.$ic105$;
                        }
                    }
                }
            }
        }
        var195 = ((module0612.NIL != var188) ? var188 : var181);
        var196 = ((module0612.NIL != var189) ? var189 : var182);
        var197 = ((module0612.NIL != var191) ? var191 : var183);
        var198 = ((module0612.NIL != var192) ? var192 : var184);
        var199 = ((module0612.NIL != var193) ? var193 : var185);
        var200 = ((module0612.NIL != var194) ? var194 : var186);
        SubLObject var203 = (SubLObject)module0612.NIL;
        SubLObject var204 = (SubLObject)module0612.NIL;
        var203 = f37534((SubLObject)module0612.NIL, var195, var196, var197, var198, var199, var200, var190);
        if (module0612.NIL != f37487(var180, var203)) {
            var204 = var203;
        }
        if (module0612.NIL == var204 && module0612.NIL != var189) {
            var203 = f37534(module0612.$ic66$, var195, var196, var197, var198, var199, var200, var190);
            if (module0612.NIL != f37487(var180, var203)) {
                var204 = var203;
            }
        }
        if (module0612.NIL == var204 && module0612.NIL != var191) {
            var203 = f37534(module0612.$ic67$, var195, var196, var197, var198, var199, var200, var190);
            if (module0612.NIL != f37487(var180, var203)) {
                var204 = var203;
            }
        }
        if (module0612.NIL == var204 && module0612.NIL != var192) {
            var203 = f37534(module0612.$ic69$, var195, var196, var197, var198, var199, var200, var190);
            if (module0612.NIL != f37487(var180, var203)) {
                var204 = var203;
            }
        }
        if (module0612.NIL == var204 && module0612.NIL != var193) {
            var203 = f37534(module0612.$ic70$, var195, var196, var197, var198, var199, var200, var190);
            if (module0612.NIL != f37487(var180, var203)) {
                var204 = var203;
            }
        }
        if (module0612.NIL == var204 && module0612.NIL != var194) {
            var203 = f37534(module0612.$ic71$, var195, var196, var197, var198, var199, var200, var190);
            if (module0612.NIL != f37487(var180, var203)) {
                var204 = var203;
            }
        }
        if (module0612.NIL != var204) {
            return f37424(var204, var201, (SubLObject)module0612.UNPROVIDED);
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37534(final SubLObject var202, final SubLObject var195, final SubLObject var196, final SubLObject var197, final SubLObject var198, final SubLObject var199, final SubLObject var200, final SubLObject var190) {
        if (module0612.NIL == var202) {
            final SubLObject var203 = f37418(var200, var199, var198, var197, var196, var195);
            if (module0612.NIL == var190) {
                return var203;
            }
            final SubLObject var204 = f37454(var190, var203);
            return f37418(f37407(var203), f37406(var203), f37405(var203), f37404(var204), f37401(var204), f37400(var204));
        }
        else {
            final SubLObject var203 = f37432(var202, (SubLObject)module0612.ONE_INTEGER, var195, f37417(var196), var197, var198, var199, var200);
            if (module0612.NIL == var190) {
                return var203;
            }
            final SubLObject var204 = f37454(var190, var203);
            return f37418(f37407(var203), f37406(var203), f37405(var203), f37404(var204), f37401(var204), f37400(var204));
        }
    }
    
    public static SubLObject f37426(final SubLObject var205) {
        final SubLThread var206 = SubLProcess.currentSubLThread();
        assert module0612.NIL != module0051.f3549(var205) : var205;
        if (module0612.NIL == module0131.f8566()) {
            Errors.error((SubLObject)module0612.$ic81$);
        }
        var206.resetMultipleValues();
        final SubLObject var207 = Time.decode_universal_time(var205, (SubLObject)module0612.UNPROVIDED);
        final SubLObject var208 = var206.secondMultipleValue();
        final SubLObject var209 = var206.thirdMultipleValue();
        final SubLObject var210 = var206.fourthMultipleValue();
        final SubLObject var211 = var206.fifthMultipleValue();
        final SubLObject var212 = var206.sixthMultipleValue();
        var206.resetMultipleValues();
        final SubLObject var213 = (SubLObject)ConsesLow.list(module0612.$ic46$, var207, (SubLObject)ConsesLow.list(module0612.$ic45$, var208, (SubLObject)ConsesLow.list(module0612.$ic44$, var209, (SubLObject)ConsesLow.list(module0612.$ic43$, var210, (SubLObject)ConsesLow.list(module0612.$ic42$, f37402(var211), (SubLObject)ConsesLow.list(module0612.$ic41$, var212))))));
        return conses_high.copy_tree(var213);
    }
    
    public static SubLObject f37514(final SubLObject var206) {
        final SubLThread var207 = SubLProcess.currentSubLThread();
        assert module0612.NIL != module0051.f3603(var206) : var206;
        if (module0612.NIL == module0131.f8566()) {
            Errors.error((SubLObject)module0612.$ic81$);
        }
        var207.resetMultipleValues();
        final SubLObject var208 = module0051.f3613(var206);
        final SubLObject var209 = var207.secondMultipleValue();
        final SubLObject var210 = var207.thirdMultipleValue();
        var207.resetMultipleValues();
        final SubLObject var211 = (SubLObject)ConsesLow.list(module0612.$ic43$, var208, (SubLObject)ConsesLow.list(module0612.$ic42$, f37402(var209), (SubLObject)ConsesLow.list(module0612.$ic41$, var210)));
        return conses_high.copy_tree(var211);
    }
    
    public static SubLObject f37535(final SubLObject var207) {
        final SubLThread var208 = SubLProcess.currentSubLThread();
        if (module0612.NIL == module0131.f8566()) {
            Errors.error((SubLObject)module0612.$ic81$);
        }
        var208.resetMultipleValues();
        final SubLObject var209 = module0051.f3648(var207);
        final SubLObject var210 = var208.secondMultipleValue();
        final SubLObject var211 = var208.thirdMultipleValue();
        final SubLObject var212 = var208.fourthMultipleValue();
        final SubLObject var213 = var208.fifthMultipleValue();
        final SubLObject var214 = var208.sixthMultipleValue();
        var208.resetMultipleValues();
        final SubLObject var215 = (SubLObject)ConsesLow.list(module0612.$ic46$, var209, (SubLObject)ConsesLow.list(module0612.$ic45$, var210, (SubLObject)ConsesLow.list(module0612.$ic44$, var211, (SubLObject)ConsesLow.list(module0612.$ic43$, var212, (SubLObject)ConsesLow.list(module0612.$ic42$, f37402(var213), (SubLObject)ConsesLow.list(module0612.$ic41$, var214))))));
        return conses_high.copy_tree(var215);
    }
    
    public static SubLObject f37536(SubLObject var8) {
        if (module0612.NIL == module0131.f8566()) {
            Errors.error((SubLObject)module0612.$ic81$);
        }
        assert module0612.NIL != f37382(var8) : var8;
        SubLObject var9 = (SubLObject)module0612.ONE_INTEGER;
        SubLObject var10 = (SubLObject)module0612.ONE_INTEGER;
        SubLObject var11 = (SubLObject)module0612.NIL;
        while (var8.isCons()) {
            final SubLObject var13;
            final SubLObject var12 = var13 = var8.first();
            if (var13.eql(module0612.$ic46$) || var13.eql(module0612.$ic45$) || var13.eql(module0612.$ic44$)) {
                var8 = conses_high.third(var8);
            }
            else if (var13.eql(module0612.$ic43$)) {
                var9 = conses_high.second(var8);
                var8 = conses_high.third(var8);
            }
            else if (var13.eql(module0612.$ic42$)) {
                var10 = f37417(conses_high.second(var8));
                var8 = conses_high.third(var8);
            }
            else {
                if (!var13.eql(module0612.$ic41$)) {
                    return (SubLObject)module0612.NIL;
                }
                var11 = conses_high.second(var8);
                var8 = (SubLObject)module0612.NIL;
            }
        }
        return module0051.f3604(var9, var10, var11);
    }
    
    public static SubLObject f37427(SubLObject var8) {
        if (module0612.NIL == module0131.f8566()) {
            Errors.error((SubLObject)module0612.$ic81$);
        }
        assert module0612.NIL != f37382(var8) : var8;
        SubLObject var9 = (SubLObject)module0612.ZERO_INTEGER;
        SubLObject var10 = (SubLObject)module0612.ZERO_INTEGER;
        SubLObject var11 = (SubLObject)module0612.ZERO_INTEGER;
        SubLObject var12 = (SubLObject)module0612.ONE_INTEGER;
        SubLObject var13 = (SubLObject)module0612.ONE_INTEGER;
        SubLObject var14 = (SubLObject)module0612.NIL;
        SubLObject var15 = (SubLObject)module0612.NIL;
        while (var8.isCons()) {
            final SubLObject var17;
            final SubLObject var16 = var17 = var8.first();
            if (var17.eql(module0612.$ic47$)) {
                var14 = conses_high.second(var8);
                var8 = conses_high.third(var8);
            }
            else if (var17.eql(module0612.$ic46$)) {
                var9 = conses_high.second(var8);
                var8 = conses_high.third(var8);
            }
            else if (var17.eql(module0612.$ic45$)) {
                var10 = conses_high.second(var8);
                var8 = conses_high.third(var8);
            }
            else if (var17.eql(module0612.$ic44$)) {
                var11 = conses_high.second(var8);
                var8 = conses_high.third(var8);
            }
            else if (var17.eql(module0612.$ic43$)) {
                var12 = conses_high.second(var8);
                var8 = conses_high.third(var8);
            }
            else if (var17.eql(module0612.$ic42$)) {
                var13 = f37417(conses_high.second(var8));
                var8 = conses_high.third(var8);
            }
            else {
                if (!var17.eql(module0612.$ic41$)) {
                    return (SubLObject)module0612.NIL;
                }
                var15 = conses_high.second(var8);
                var8 = (SubLObject)module0612.NIL;
            }
        }
        return Values.values(Time.encode_universal_time(var9, var10, var11, var12, var13, var15, (SubLObject)module0612.UNPROVIDED), var14);
    }
    
    public static SubLObject f37537(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = f37427(var8);
        var9.resetMultipleValues();
        final SubLObject var11 = module0051.f3642(var10);
        final SubLObject var12 = var9.secondMultipleValue();
        var9.resetMultipleValues();
        return var12;
    }
    
    public static SubLObject f37512(SubLObject var8) {
        assert module0612.NIL != f37382(var8) : var8;
        SubLObject var9 = (SubLObject)module0612.ZERO_INTEGER;
        SubLObject var10 = (SubLObject)module0612.ZERO_INTEGER;
        SubLObject var11 = (SubLObject)module0612.ZERO_INTEGER;
        SubLObject var12 = (SubLObject)module0612.ONE_INTEGER;
        SubLObject var13 = (SubLObject)module0612.ONE_INTEGER;
        SubLObject var14 = (SubLObject)module0612.NIL;
        while (var8.isCons()) {
            final SubLObject var16;
            final SubLObject var15 = var16 = var8.first();
            if (var16.eql(module0612.$ic46$)) {
                var9 = conses_high.second(var8);
                var8 = conses_high.third(var8);
            }
            else if (var16.eql(module0612.$ic45$)) {
                var10 = conses_high.second(var8);
                var8 = conses_high.third(var8);
            }
            else if (var16.eql(module0612.$ic44$)) {
                var11 = conses_high.second(var8);
                var8 = conses_high.third(var8);
            }
            else if (var16.eql(module0612.$ic43$)) {
                var12 = conses_high.second(var8);
                var8 = conses_high.third(var8);
            }
            else if (var16.eql(module0612.$ic42$)) {
                var13 = f37417(conses_high.second(var8));
                var8 = conses_high.third(var8);
            }
            else if (var16.eql(module0612.$ic48$)) {
                var13 = Numbers.subtract(Numbers.multiply(conses_high.second(var8), (SubLObject)module0612.THREE_INTEGER), (SubLObject)module0612.TWO_INTEGER);
                var8 = conses_high.third(var8);
            }
            else if (var16.eql(module0612.$ic41$)) {
                var14 = conses_high.second(var8);
                var8 = (SubLObject)module0612.NIL;
            }
            else if (var16.eql(module0612.$ic49$)) {
                var14 = Numbers.multiply(conses_high.second(var8), (SubLObject)module0612.TEN_INTEGER);
                var8 = (SubLObject)module0612.NIL;
            }
            else {
                if (!var16.eql(module0612.$ic50$)) {
                    return (SubLObject)module0612.NIL;
                }
                var14 = module0048.f_1X(Numbers.multiply(module0048.f_1_(conses_high.second(var8)), (SubLObject)module0612.$ic56$));
                var8 = (SubLObject)module0612.NIL;
            }
        }
        return module0051.f3647(var9, var10, var11, var12, var13, var14);
    }
    
    public static SubLObject f37538(SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        assert module0612.NIL != f37382(var8) : var8;
        SubLObject var10 = (SubLObject)module0612.NIL;
        SubLObject var11 = (SubLObject)module0612.NIL;
        SubLObject var12 = (SubLObject)module0612.NIL;
        SubLObject var13 = (SubLObject)module0612.NIL;
        SubLObject var14 = (SubLObject)module0612.NIL;
        SubLObject var15 = (SubLObject)module0612.NIL;
        while (var8.isCons()) {
            final SubLObject var17;
            final SubLObject var16 = var17 = var8.first();
            if (var17.eql(module0612.$ic46$)) {
                var10 = conses_high.second(var8);
                var8 = conses_high.third(var8);
            }
            else if (var17.eql(module0612.$ic45$)) {
                var12 = conses_high.second(var8);
                var8 = conses_high.third(var8);
            }
            else if (var17.eql(module0612.$ic44$)) {
                var11 = conses_high.second(var8);
                var8 = conses_high.third(var8);
            }
            else if (var17.eql(module0612.$ic43$)) {
                var13 = conses_high.second(var8);
                var8 = conses_high.third(var8);
            }
            else if (var17.eql(module0612.$ic42$)) {
                var14 = f37417(conses_high.second(var8));
                var8 = conses_high.third(var8);
            }
            else if (var17.eql(module0612.$ic48$)) {
                var14 = Numbers.multiply(conses_high.second(var8), (SubLObject)module0612.THREE_INTEGER);
                var8 = conses_high.third(var8);
            }
            else if (var17.eql(module0612.$ic41$)) {
                var15 = conses_high.second(var8);
                var8 = (SubLObject)module0612.NIL;
            }
            else if (var17.eql(module0612.$ic49$)) {
                var15 = Numbers.add(Numbers.multiply(conses_high.second(var8), (SubLObject)module0612.TEN_INTEGER), (SubLObject)module0612.NINE_INTEGER);
                var8 = (SubLObject)module0612.NIL;
            }
            else {
                if (!var17.eql(module0612.$ic50$)) {
                    return (SubLObject)module0612.NIL;
                }
                var15 = Numbers.multiply(conses_high.second(var8), (SubLObject)module0612.$ic56$);
                var8 = (SubLObject)module0612.NIL;
            }
        }
        if (module0612.NIL != var10) {
            var10 = Numbers.add(var10, (SubLObject)module0612.ONE_INTEGER);
        }
        else if (module0612.NIL != var12) {
            var12 = Numbers.add(var12, (SubLObject)module0612.ONE_INTEGER);
        }
        else if (module0612.NIL != var11) {
            var11 = Numbers.add(var11, (SubLObject)module0612.ONE_INTEGER);
        }
        else if (module0612.NIL != var13) {
            var13 = Numbers.add(var13, (SubLObject)module0612.ONE_INTEGER);
        }
        else if (module0612.NIL != var14) {
            var14 = Numbers.add(var14, (SubLObject)module0612.ONE_INTEGER);
        }
        else if (module0612.NIL != var15) {
            var15 = Numbers.add(var15, (SubLObject)module0612.ONE_INTEGER);
        }
        var9.resetMultipleValues();
        final SubLObject var18 = module0051.f3651(var15, var14, var13, var11, var12, var10);
        SubLObject var19 = var9.secondMultipleValue();
        SubLObject var20 = var9.thirdMultipleValue();
        SubLObject var21 = var9.fourthMultipleValue();
        SubLObject var22 = var9.fifthMultipleValue();
        SubLObject var23 = var9.sixthMultipleValue();
        var9.resetMultipleValues();
        if (module0612.NIL == var19) {
            var19 = (SubLObject)module0612.ONE_INTEGER;
        }
        if (module0612.NIL == var20) {
            var20 = (SubLObject)module0612.ONE_INTEGER;
        }
        if (module0612.NIL == var21) {
            var21 = (SubLObject)module0612.ZERO_INTEGER;
        }
        if (module0612.NIL == var22) {
            var22 = (SubLObject)module0612.ZERO_INTEGER;
        }
        if (module0612.NIL == var23) {
            var23 = (SubLObject)module0612.ZERO_INTEGER;
        }
        var23 = Numbers.subtract(var23, (SubLObject)module0612.ONE_INTEGER);
        var9.resetMultipleValues();
        final SubLObject var24 = module0051.f3651(var18, var19, var20, var21, var22, var23);
        final SubLObject var25 = var9.secondMultipleValue();
        final SubLObject var26 = var9.thirdMultipleValue();
        final SubLObject var27 = var9.fourthMultipleValue();
        final SubLObject var28 = var9.fifthMultipleValue();
        final SubLObject var29 = var9.sixthMultipleValue();
        var9.resetMultipleValues();
        return module0051.f3647(var29, var28, var27, var26, var25, var24);
    }
    
    public static SubLObject f37539(final SubLObject var218) {
        final SubLThread var219 = SubLProcess.currentSubLThread();
        SubLObject var220 = (SubLObject)module0612.NIL;
        var220 = module0656.f39957(var218, (SubLObject)module0612.NIL);
        if (module0612.NIL != f37540(var220, (SubLObject)module0612.UNPROVIDED)) {
            return var220;
        }
        var220 = f37541(var218);
        if (module0612.NIL != f37540(var220, (SubLObject)module0612.UNPROVIDED)) {
            return var220;
        }
        SubLObject var221 = (SubLObject)module0612.NIL;
        try {
            var219.throwStack.push(module0612.$ic145$);
            final SubLObject var222 = Errors.$error_handler$.currentBinding(var219);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0612.$ic146$), var219);
                try {
                    var220 = f37542(var218);
                }
                catch (Throwable var223) {
                    Errors.handleThrowable(var223, (SubLObject)module0612.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var222, var219);
            }
        }
        catch (Throwable var224) {
            var221 = Errors.handleThrowable(var224, (SubLObject)module0612.$ic145$);
        }
        finally {
            var219.throwStack.pop();
        }
        if (module0612.NIL != f37540(var220, (SubLObject)module0612.UNPROVIDED)) {
            return var220;
        }
        var220 = f37543(var218);
        if (module0612.NIL != f37540(var220, (SubLObject)module0612.UNPROVIDED)) {
            return var220;
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37540(final SubLObject var1, SubLObject var222) {
        if (var222 == module0612.UNPROVIDED) {
            var222 = (SubLObject)module0612.T;
        }
        if (module0612.NIL != var222) {
            return module0161.f10592(var1);
        }
        return module0161.f10593(var1);
    }
    
    public static SubLObject f37541(final SubLObject var218) {
        final SubLThread var219 = SubLProcess.currentSubLThread();
        SubLObject var220 = (SubLObject)module0612.NIL;
        if (module0612.NIL != f37544(var218)) {
            var219.resetMultipleValues();
            final SubLObject var221 = f37545(var218);
            final SubLObject var222 = var219.secondMultipleValue();
            final SubLObject var223 = var219.thirdMultipleValue();
            final SubLObject var224 = var219.fourthMultipleValue();
            var219.resetMultipleValues();
            final SubLObject var225 = module0656.f39960(var221);
            final SubLObject var226 = module0656.f39960(var222);
            if (module0612.NIL != module0161.f10592(var225) && module0612.NIL != module0161.f10592(var226)) {
                var220 = f37546(var225, var226, var223, var224);
            }
        }
        return var220;
    }
    
    public static SubLObject f37544(final SubLObject var218) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0612.NIL != module0038.f2684(var218, (SubLObject)module0612.$ic147$) && module0612.NIL != module0038.f2668((SubLObject)module0612.$ic148$, var218, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED));
    }
    
    public static SubLObject f37545(final SubLObject var218) {
        final SubLObject var219 = (SubLObject)module0612.FIVE_INTEGER;
        final SubLObject var220 = Sequences.search((SubLObject)module0612.$ic148$, var218, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
        final SubLObject var221 = (SubLObject)module0612.FOUR_INTEGER;
        final SubLObject var222 = module0038.f2623(var218, var219, var220);
        final SubLObject var223 = module0038.f2623(var218, Numbers.add(var220, var221), (SubLObject)module0612.UNPROVIDED);
        final SubLObject var224 = (SubLObject)module0612.T;
        final SubLObject var225 = (SubLObject)module0612.T;
        return Values.values(var222, var223, var224, var225);
    }
    
    public static SubLObject f37546(final SubLObject var227, final SubLObject var228, final SubLObject var225, final SubLObject var226) {
        final SubLThread var229 = SubLProcess.currentSubLThread();
        if (module0612.NIL == Errors.$ignore_mustsP$.getDynamicValue(var229) && !var225.eql(var226)) {
            Errors.error((SubLObject)module0612.$ic149$);
        }
        if (module0612.NIL != var225 && module0612.NIL != var226) {
            return module0267.f17577(var227, var228);
        }
        Errors.error((SubLObject)module0612.$ic150$);
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37547(final SubLObject var218) {
        final SubLObject var219 = f37548(var218, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
        if (module0612.NIL != var219) {
            return var219;
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37549(final SubLObject var232) {
        final SubLThread var233 = SubLProcess.currentSubLThread();
        if (module0612.NIL != module0612.$g4723$.getDynamicValue(var233)) {
            return var232;
        }
        SubLObject var235;
        final SubLObject var234 = var235 = module0205.f13211(module0612.$ic41$, var232);
        SubLObject var236 = (SubLObject)module0612.NIL;
        var236 = var235.first();
        while (module0612.NIL != var235) {
            if (module0205.f13203(var236, (SubLObject)module0612.UNPROVIDED).numL((SubLObject)module0612.$ic56$)) {
                return (SubLObject)module0612.NIL;
            }
            var235 = var235.rest();
            var236 = var235.first();
        }
        return var232;
    }
    
    public static SubLObject f37550(final SubLObject var218) {
        final SubLThread var219 = SubLProcess.currentSubLThread();
        SubLObject var220 = (SubLObject)module0612.NIL;
        final SubLObject var221 = module0612.$g4723$.currentBinding(var219);
        try {
            module0612.$g4723$.bind((SubLObject)module0612.NIL, var219);
            var220 = f37547(var218);
        }
        finally {
            module0612.$g4723$.rebind(var221, var219);
        }
        return var220;
    }
    
    public static SubLObject f37543(final SubLObject var218) {
        final SubLObject var219 = f37547(var218);
        if (module0612.NIL != module0035.f1997(var219)) {
            return var219.first();
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37542(final SubLObject var218) {
        if (module0612.NIL != module0038.f2668((SubLObject)module0612.$ic151$, var218, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED) || module0612.NIL != module0038.f2668((SubLObject)module0612.$ic152$, var218, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED) || module0612.NIL != module0038.f2668((SubLObject)module0612.$ic153$, var218, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED)) {
            final SubLObject var219 = module0038.f2738(var218, (SubLObject)module0612.$ic154$, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
            if (module0612.NIL != f37551(var219)) {
                final SubLObject var220 = conses_high.last(var219, (SubLObject)module0612.UNPROVIDED).first();
                final SubLObject var221 = module0038.f2738(var220, (SubLObject)module0612.$ic155$, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                final SubLObject var222 = module0035.f2132(var219);
                return f37552(var222, var221);
            }
            if (module0612.NIL != f37553(var219)) {
                final SubLObject var220 = var219.first();
                final SubLObject var221 = module0038.f2738(var220, (SubLObject)module0612.$ic155$, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                final SubLObject var222 = var219.rest();
                return f37552(var222, var221);
            }
            SubLObject var224;
            final SubLObject var223 = var224 = f37554(var219, (SubLObject)module0612.T, (SubLObject)module0612.UNPROVIDED).first();
            SubLObject var225 = (SubLObject)module0612.NIL;
            SubLObject var226 = (SubLObject)module0612.NIL;
            SubLObject var227 = (SubLObject)module0612.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var224, var223, (SubLObject)module0612.$ic156$);
            var225 = var224.first();
            var224 = var224.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var224, var223, (SubLObject)module0612.$ic156$);
            var226 = var224.first();
            var224 = var224.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var224, var223, (SubLObject)module0612.$ic156$);
            var227 = var224.first();
            var224 = var224.rest();
            if (module0612.NIL == var224) {
                return f37419((SubLObject)module0612.NIL, (SubLObject)module0612.NIL, (SubLObject)module0612.NIL, var225, var226, var227);
            }
            cdestructuring_bind.cdestructuring_bind_error(var223, (SubLObject)module0612.$ic156$);
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37552(final SubLObject var239, final SubLObject var238) {
        final SubLThread var240 = SubLProcess.currentSubLThread();
        SubLObject var242;
        final SubLObject var241 = var242 = f37554(var239, (SubLObject)module0612.T, (SubLObject)module0612.UNPROVIDED).first();
        SubLObject var243 = (SubLObject)module0612.NIL;
        SubLObject var244 = (SubLObject)module0612.NIL;
        SubLObject var245 = (SubLObject)module0612.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var242, var241, (SubLObject)module0612.$ic156$);
        var243 = var242.first();
        var242 = var242.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var242, var241, (SubLObject)module0612.$ic156$);
        var244 = var242.first();
        var242 = var242.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var242, var241, (SubLObject)module0612.$ic156$);
        var245 = var242.first();
        var242 = var242.rest();
        if (module0612.NIL == var242) {
            var240.resetMultipleValues();
            final SubLObject var246 = f37555(var238);
            final SubLObject var247 = var240.secondMultipleValue();
            final SubLObject var248 = var240.thirdMultipleValue();
            var240.resetMultipleValues();
            return f37419(var246, var247, var248, var243, var244, var245);
        }
        cdestructuring_bind.cdestructuring_bind_error(var241, (SubLObject)module0612.$ic156$);
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37551(final SubLObject var236) {
        if (module0612.NIL != module0035.f2000(var236, (SubLObject)module0612.TWO_INTEGER, (SubLObject)module0612.UNPROVIDED)) {
            final SubLObject var237 = conses_high.last(var236, (SubLObject)module0612.UNPROVIDED).first();
            return module0038.f2668((SubLObject)module0612.$ic157$, var237, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37553(final SubLObject var236) {
        if (module0612.NIL != module0035.f2000(var236, (SubLObject)module0612.TWO_INTEGER, (SubLObject)module0612.UNPROVIDED)) {
            final SubLObject var237 = var236.first();
            return module0038.f2668((SubLObject)module0612.$ic157$, var237, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37548(final SubLObject var218, SubLObject var246, SubLObject var247, SubLObject var248) {
        if (var246 == module0612.UNPROVIDED) {
            var246 = (SubLObject)module0612.NIL;
        }
        if (var247 == module0612.UNPROVIDED) {
            var247 = (SubLObject)module0612.NIL;
        }
        if (var248 == module0612.UNPROVIDED) {
            var248 = (SubLObject)module0612.NIL;
        }
        final SubLThread var249 = SubLProcess.currentSubLThread();
        final SubLObject var250 = module0038.f2738(var218, (SubLObject)module0612.$ic158$, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
        final SubLObject var251 = f37554(var250, var246, var248);
        SubLObject var252 = (SubLObject)module0612.NIL;
        SubLObject var253 = (SubLObject)module0612.NIL;
        SubLObject var254 = (SubLObject)module0612.NIL;
        SubLObject var255 = (SubLObject)module0612.NIL;
        final SubLObject var256 = Sequences.find_if((SubLObject)module0612.$ic159$, var250, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
        if (module0612.NIL != var256) {
            var249.resetMultipleValues();
            final SubLObject var251_252 = f37555(module0038.f2738(var256, (SubLObject)module0612.$ic160$, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED));
            final SubLObject var253_254 = var249.secondMultipleValue();
            final SubLObject var255_256 = var249.thirdMultipleValue();
            var249.resetMultipleValues();
            var252 = var251_252;
            var253 = var253_254;
            var254 = var255_256;
        }
        SubLObject var257 = var251;
        SubLObject var258 = (SubLObject)module0612.NIL;
        var258 = var257.first();
        while (module0612.NIL != var257) {
            SubLObject var260;
            final SubLObject var259 = var260 = var258;
            SubLObject var261 = (SubLObject)module0612.NIL;
            SubLObject var262 = (SubLObject)module0612.NIL;
            SubLObject var263 = (SubLObject)module0612.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var260, var259, (SubLObject)module0612.$ic156$);
            var261 = var260.first();
            var260 = var260.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var260, var259, (SubLObject)module0612.$ic156$);
            var262 = var260.first();
            var260 = var260.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var260, var259, (SubLObject)module0612.$ic156$);
            var263 = var260.first();
            var260 = var260.rest();
            if (module0612.NIL == var260) {
                final SubLObject var264 = f37419(var252, var253, var254, var261, var262, var263);
                if (module0612.NIL != f37556(var261, var262, var263, var218)) {
                    var255 = (SubLObject)ConsesLow.cons(var264, var255);
                    if (module0612.NIL == var247) {
                        SubLObject var158_260 = f37557(var264, var248);
                        SubLObject var265 = (SubLObject)module0612.NIL;
                        var265 = var158_260.first();
                        while (module0612.NIL != var158_260) {
                            var255 = (SubLObject)ConsesLow.cons(var265, var255);
                            var158_260 = var158_260.rest();
                            var265 = var158_260.first();
                        }
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var259, (SubLObject)module0612.$ic156$);
            }
            var257 = var257.rest();
            var258 = var257.first();
        }
        return Sequences.delete_duplicates(var255, Symbols.symbol_function((SubLObject)module0612.EQUAL), (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
    }
    
    public static SubLObject f37556(final SubLObject var32, final SubLObject var31, final SubLObject var38, final SubLObject var218) {
        if (module0612.NIL != var32) {
            return (SubLObject)module0612.T;
        }
        if (var38.isInteger() && var38.numGE((SubLObject)module0612.$ic161$) && var38.numLE((SubLObject)module0612.$ic162$)) {
            return (SubLObject)module0612.T;
        }
        if (module0612.NIL != module0035.find_if_not((SubLObject)module0612.$ic163$, var218, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED)) {
            return (SubLObject)module0612.T;
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37558(final SubLObject var8, SubLObject var261) {
        if (var261 == module0612.UNPROVIDED) {
            var261 = (SubLObject)module0612.NIL;
        }
        if (module0612.NIL == var261 || module0612.NIL == f37391(var8, (SubLObject)module0612.UNPROVIDED)) {
            final SubLObject var262 = f37400(var8);
            return (SubLObject)SubLObjectFactory.makeBoolean(var262.isInteger() && module0612.$ic56$.numG(var262));
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37557(final SubLObject var232, SubLObject var261) {
        if (var261 == module0612.UNPROVIDED) {
            var261 = (SubLObject)module0612.NIL;
        }
        final SubLThread var262 = SubLProcess.currentSubLThread();
        if (module0612.NIL != f37558(var232, var261)) {
            var262.resetMultipleValues();
            final SubLObject var263 = f37398(var232);
            final SubLObject var264 = var262.secondMultipleValue();
            final SubLObject var265 = var262.thirdMultipleValue();
            final SubLObject var266 = var262.fourthMultipleValue();
            final SubLObject var267 = var262.fifthMultipleValue();
            final SubLObject var268 = var262.sixthMultipleValue();
            final SubLObject var269 = var262.seventhMultipleValue();
            var262.resetMultipleValues();
            final SubLObject var270 = f37432(module0612.$ic66$, (SubLObject)module0612.$ic164$, var264, var265, var266, var267, var268, var269);
            final SubLObject var271 = f37514(module0051.f3605());
            SubLObject var272 = (SubLObject)module0612.NIL;
            var272 = (SubLObject)ConsesLow.cons(var270, var272);
            if (module0612.NIL != f37487(var271, var270)) {
                var272 = (SubLObject)ConsesLow.cons(f37432(module0612.$ic66$, (SubLObject)module0612.$ic165$, var264, var265, var266, var267, var268, var269), var272);
            }
            return var272;
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37554(final SubLObject var236, SubLObject var246, SubLObject var265) {
        if (var246 == module0612.UNPROVIDED) {
            var246 = (SubLObject)module0612.T;
        }
        if (var265 == module0612.UNPROVIDED) {
            var265 = (SubLObject)module0612.NIL;
        }
        final SubLThread var266 = SubLProcess.currentSubLThread();
        final SubLObject var267 = Sequences.delete((SubLObject)module0612.$ic168$, Sequences.delete((SubLObject)module0612.$ic169$, var236, (SubLObject)module0612.EQUAL, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED), (SubLObject)module0612.EQUAL, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
        SubLObject var268 = (SubLObject)module0612.NIL;
        SubLObject var269 = (SubLObject)module0612.NIL;
        SubLObject var270 = (SubLObject)module0612.NIL;
        if (module0612.NIL == var268) {
            SubLObject var271 = (SubLObject)ConsesLow.list((SubLObject)((module0612.NIL != var265) ? module0612.$g4725$.getDynamicValue(var266) : module0612.NIL), module0612.$g4724$.getDynamicValue(var266));
            SubLObject var272 = (SubLObject)module0612.NIL;
            var272 = var271.first();
            while (module0612.NIL == var268 && module0612.NIL != var271) {
                if (module0612.NIL == var268) {
                    SubLObject var4_269 = var272;
                    SubLObject var273 = (SubLObject)module0612.NIL;
                    var273 = var4_269.first();
                    while (module0612.NIL == var268 && module0612.NIL != var4_269) {
                        var269 = f37559(var267, var273);
                        if (var269.isList() && module0612.NIL != conses_high.third(var269)) {
                            var270 = (SubLObject)ConsesLow.cons(var269, var270);
                            if (module0612.NIL != var246) {
                                var268 = (SubLObject)module0612.T;
                            }
                        }
                        var4_269 = var4_269.rest();
                        var273 = var4_269.first();
                    }
                }
                var271 = var271.rest();
                var272 = var271.first();
            }
        }
        return var270;
    }
    
    public static SubLObject f37559(final SubLObject var236, final SubLObject var270) {
        final SubLThread var271 = SubLProcess.currentSubLThread();
        SubLObject var272 = (SubLObject)module0612.NIL;
        SubLObject var273 = (SubLObject)module0612.NIL;
        SubLObject var274 = (SubLObject)module0612.NIL;
        SubLObject var275 = (SubLObject)module0612.NIL;
        if (Sequences.length(var236).numGE(Sequences.length(var270)) || module0612.NIL != conses_high.member((SubLObject)module0612.$ic170$, var270, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED) || module0612.NIL != conses_high.member((SubLObject)module0612.$ic52$, var270, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED) || module0612.NIL != conses_high.member((SubLObject)module0612.$ic171$, var270, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED)) {
            final SubLObject var277;
            final SubLObject var276 = var277 = module0034.f1888();
            final SubLObject var278 = module0034.$g879$.currentBinding(var271);
            try {
                module0034.$g879$.bind(var277, var271);
                SubLObject var279 = (SubLObject)module0612.NIL;
                if (module0612.NIL != var277 && module0612.NIL == module0034.f1842(var277)) {
                    var279 = module0034.f1869(var277);
                    final SubLObject var280 = Threads.current_process();
                    if (module0612.NIL == var279) {
                        module0034.f1873(var277, var280);
                    }
                    else if (!var279.eql(var280)) {
                        Errors.error((SubLObject)module0612.$ic172$);
                    }
                }
                try {
                    if (module0612.NIL == var275) {
                        SubLObject var281 = (SubLObject)module0612.NIL;
                        SubLObject var276_277 = (SubLObject)module0612.NIL;
                        SubLObject var282 = (SubLObject)module0612.NIL;
                        SubLObject var279_280 = (SubLObject)module0612.NIL;
                        var281 = var236;
                        var276_277 = var281.first();
                        var282 = var270;
                        var279_280 = var282.first();
                        while (module0612.NIL == var275 && (module0612.NIL != var282 || module0612.NIL != var281)) {
                            if (module0612.NIL == var276_277 && var279_280 == module0612.$ic52$) {
                                var274 = (SubLObject)module0612.$ic52$;
                            }
                            else if (module0612.NIL == var276_277 && var279_280 == module0612.$ic170$) {
                                var274 = (SubLObject)module0612.$ic173$;
                            }
                            else if (module0612.NIL == var276_277 && var279_280 == module0612.$ic171$) {
                                var272 = (SubLObject)module0612.$ic174$;
                            }
                            else if (!var276_277.isString()) {
                                var275 = (SubLObject)module0612.T;
                            }
                            else if (var279_280 == module0612.$ic175$ && module0612.NIL != f37560(var276_277, (SubLObject)module0612.UNPROVIDED)) {
                                var274 = f37560(var276_277, (SubLObject)module0612.UNPROVIDED);
                            }
                            else if (var279_280 == module0612.$ic176$ && module0612.NIL != f37561(var276_277)) {
                                var273 = f37561(var276_277);
                            }
                            else if (var279_280 == module0612.$ic177$ && module0612.NIL != f37562(var276_277)) {
                                var273 = f37562(var276_277);
                            }
                            else if (var279_280 != module0612.$ic178$ || module0612.NIL == f37563(var276_277)) {
                                if (var279_280 != module0612.$ic179$ || module0612.NIL == f37564(var276_277)) {
                                    if (var279_280 != module0612.$ic180$ || module0612.NIL == f37565(var276_277)) {
                                        if (var279_280 == module0612.$ic181$ && module0612.NIL != f37566(var276_277)) {
                                            var273 = f37566(var276_277);
                                        }
                                        else if (var279_280 == module0612.$ic182$ && module0612.NIL != f37567(var276_277)) {
                                            var272 = f37567(var276_277);
                                        }
                                        else {
                                            var275 = (SubLObject)module0612.T;
                                        }
                                    }
                                }
                            }
                            var281 = var281.rest();
                            var276_277 = var281.first();
                            var282 = var282.rest();
                            var279_280 = var282.first();
                        }
                    }
                }
                finally {
                    final SubLObject var174_281 = Threads.$is_thread_performing_cleanupP$.currentBinding(var271);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0612.T, var271);
                        if (module0612.NIL != var277 && module0612.NIL == var279) {
                            module0034.f1873(var277, (SubLObject)module0612.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var174_281, var271);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var278, var271);
            }
            if (module0612.NIL == var275 && (module0612.NIL != module0206.f13497(var274) || var274 == module0612.$ic52$ || module0612.NIL != module0051.f3541(var274)) && (module0612.NIL == var273 || module0612.NIL != module0051.f3542(var273)) && (module0612.NIL == var272 || module0612.NIL != module0206.f13497(var272) || module0612.NIL != module0051.f3544(var272, var273, var274))) {
                return (SubLObject)ConsesLow.list(var272, var273, var274);
            }
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0612.NIL, (SubLObject)module0612.NIL, (SubLObject)module0612.NIL);
    }
    
    public static SubLObject f37568(final SubLObject var155, SubLObject var282) {
        if (var282 == module0612.UNPROVIDED) {
            var282 = module0612.$g4723$.getDynamicValue();
        }
        if (module0612.NIL != var282) {
            return module0038.f2642(var155);
        }
        if (module0612.NIL != module0035.f1995(var155, (SubLObject)module0612.FOUR_INTEGER, (SubLObject)module0612.UNPROVIDED)) {
            return module0038.f2642(var155);
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37560(final SubLObject var155, SubLObject var282) {
        if (var282 == module0612.UNPROVIDED) {
            var282 = module0612.$g4723$.getDynamicValue();
        }
        final SubLThread var283 = SubLProcess.currentSubLThread();
        final SubLObject var284 = module0034.$g879$.getDynamicValue(var283);
        SubLObject var285 = (SubLObject)module0612.NIL;
        if (module0612.NIL == var284) {
            return f37568(var155, var282);
        }
        var285 = module0034.f1857(var284, (SubLObject)module0612.$ic183$, (SubLObject)module0612.UNPROVIDED);
        if (module0612.NIL == var285) {
            var285 = module0034.f1807(module0034.f1842(var284), (SubLObject)module0612.$ic183$, (SubLObject)module0612.TWO_INTEGER, (SubLObject)module0612.NIL, (SubLObject)module0612.EQUAL, (SubLObject)module0612.UNPROVIDED);
            module0034.f1860(var284, (SubLObject)module0612.$ic183$, var285);
        }
        final SubLObject var286 = module0034.f1782(var155, var282);
        final SubLObject var287 = module0034.f1814(var285, var286, (SubLObject)module0612.UNPROVIDED);
        if (var287 != module0612.$ic115$) {
            SubLObject var288 = var287;
            SubLObject var289 = (SubLObject)module0612.NIL;
            var289 = var288.first();
            while (module0612.NIL != var288) {
                SubLObject var290 = var289.first();
                final SubLObject var291 = conses_high.second(var289);
                if (var155.equal(var290.first())) {
                    var290 = var290.rest();
                    if (module0612.NIL != var290 && module0612.NIL == var290.rest() && var282.equal(var290.first())) {
                        return module0034.f1959(var291);
                    }
                }
                var288 = var288.rest();
                var289 = var288.first();
            }
        }
        final SubLObject var292 = Values.arg2(var283.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f37568(var155, var282)));
        module0034.f1836(var285, var286, var287, var292, (SubLObject)ConsesLow.list(var155, var282));
        return module0034.f1959(var292);
    }
    
    public static SubLObject f37569(final SubLObject var155) {
        final SubLObject var156 = f37570(var155);
        return (module0612.NIL != var156) ? var156 : f37571(var155);
    }
    
    public static SubLObject f37567(final SubLObject var155) {
        final SubLThread var156 = SubLProcess.currentSubLThread();
        final SubLObject var157 = module0034.$g879$.getDynamicValue(var156);
        SubLObject var158 = (SubLObject)module0612.NIL;
        if (module0612.NIL == var157) {
            return f37569(var155);
        }
        var158 = module0034.f1857(var157, (SubLObject)module0612.$ic184$, (SubLObject)module0612.UNPROVIDED);
        if (module0612.NIL == var158) {
            var158 = module0034.f1807(module0034.f1842(var157), (SubLObject)module0612.$ic184$, (SubLObject)module0612.ONE_INTEGER, (SubLObject)module0612.NIL, (SubLObject)module0612.EQUAL, (SubLObject)module0612.UNPROVIDED);
            module0034.f1860(var157, (SubLObject)module0612.$ic184$, var158);
        }
        SubLObject var159 = module0034.f1814(var158, var155, (SubLObject)module0612.$ic115$);
        if (var159 == module0612.$ic115$) {
            var159 = Values.arg2(var156.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f37569(var155)));
            module0034.f1816(var158, var155, var159, (SubLObject)module0612.UNPROVIDED);
        }
        return module0034.f1959(var159);
    }
    
    public static SubLObject f37571(final SubLObject var155) {
        if (module0612.NIL != module0038.f2740(var155)) {
            return f37570(module0038.f2741(var155));
        }
        if (module0612.NIL != module0038.f2728(var155)) {
            return f37572(var155);
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37572(final SubLObject var218) {
        final SubLThread var219 = SubLProcess.currentSubLThread();
        if (!module0612.$g4726$.getDynamicValue(var219).isHashtable()) {
            f37573();
        }
        return Hashtables.gethash(var218, module0612.$g4726$.getDynamicValue(var219), (SubLObject)module0612.UNPROVIDED);
    }
    
    public static SubLObject f37573() {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        module0612.$g4726$.setDynamicValue(Hashtables.make_hash_table((SubLObject)module0612.$ic56$, (SubLObject)module0612.EQUALP, (SubLObject)module0612.UNPROVIDED), var28);
        SubLObject var29 = module0612.$g4727$.getDynamicValue(var28);
        SubLObject var30 = (SubLObject)module0612.NIL;
        var30 = var29.first();
        while (module0612.NIL != var29) {
            SubLObject var32;
            final SubLObject var31 = var32 = var30;
            SubLObject var33 = (SubLObject)module0612.NIL;
            SubLObject var34 = (SubLObject)module0612.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0612.$ic186$);
            var33 = var32.first();
            var32 = var32.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0612.$ic186$);
            var34 = var32.first();
            var32 = var32.rest();
            if (module0612.NIL == var32) {
                Hashtables.sethash(var33, module0612.$g4726$.getDynamicValue(var28), var34);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)module0612.$ic186$);
            }
            var29 = var29.rest();
            var30 = var29.first();
        }
        return module0612.$g4726$.getDynamicValue(var28);
    }
    
    public static SubLObject f37570(SubLObject var155) {
        if (module0612.NIL != module0038.f2727(var155) && module0612.NIL != module0038.f2642(var155)) {
            var155 = module0038.f2642(var155);
        }
        if (!var155.isInteger()) {
            return (SubLObject)module0612.NIL;
        }
        if (module0612.$ic187$.numG(var155) && module0612.ZERO_INTEGER.numL(var155)) {
            return var155;
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37561(final SubLObject var155) {
        final SubLObject var156 = f37562(var155);
        return (module0612.NIL != var156) ? var156 : f37566(var155);
    }
    
    public static SubLObject f37562(final SubLObject var155) {
        if (module0612.NIL != conses_high.member(var155, (SubLObject)module0612.$ic188$, (SubLObject)module0612.EQUALP, (SubLObject)module0612.UNPROVIDED)) {
            return (SubLObject)module0612.ONE_INTEGER;
        }
        if (module0612.NIL != conses_high.member(var155, (SubLObject)module0612.$ic189$, (SubLObject)module0612.EQUALP, (SubLObject)module0612.UNPROVIDED)) {
            return (SubLObject)module0612.TWO_INTEGER;
        }
        if (module0612.NIL != conses_high.member(var155, (SubLObject)module0612.$ic190$, (SubLObject)module0612.EQUALP, (SubLObject)module0612.UNPROVIDED)) {
            return (SubLObject)module0612.THREE_INTEGER;
        }
        if (module0612.NIL != conses_high.member(var155, (SubLObject)module0612.$ic191$, (SubLObject)module0612.EQUALP, (SubLObject)module0612.UNPROVIDED)) {
            return (SubLObject)module0612.FOUR_INTEGER;
        }
        if (module0612.NIL != conses_high.member(var155, (SubLObject)module0612.$ic192$, (SubLObject)module0612.EQUALP, (SubLObject)module0612.UNPROVIDED)) {
            return (SubLObject)module0612.FIVE_INTEGER;
        }
        if (module0612.NIL != conses_high.member(var155, (SubLObject)module0612.$ic193$, (SubLObject)module0612.EQUALP, (SubLObject)module0612.UNPROVIDED)) {
            return (SubLObject)module0612.SIX_INTEGER;
        }
        if (module0612.NIL != conses_high.member(var155, (SubLObject)module0612.$ic194$, (SubLObject)module0612.EQUALP, (SubLObject)module0612.UNPROVIDED)) {
            return (SubLObject)module0612.SEVEN_INTEGER;
        }
        if (module0612.NIL != conses_high.member(var155, (SubLObject)module0612.$ic195$, (SubLObject)module0612.EQUALP, (SubLObject)module0612.UNPROVIDED)) {
            return (SubLObject)module0612.EIGHT_INTEGER;
        }
        if (module0612.NIL != conses_high.member(var155, (SubLObject)module0612.$ic196$, (SubLObject)module0612.EQUALP, (SubLObject)module0612.UNPROVIDED)) {
            return (SubLObject)module0612.NINE_INTEGER;
        }
        if (module0612.NIL != conses_high.member(var155, (SubLObject)module0612.$ic197$, (SubLObject)module0612.EQUALP, (SubLObject)module0612.UNPROVIDED)) {
            return (SubLObject)module0612.TEN_INTEGER;
        }
        if (module0612.NIL != conses_high.member(var155, (SubLObject)module0612.$ic198$, (SubLObject)module0612.EQUALP, (SubLObject)module0612.UNPROVIDED)) {
            return (SubLObject)module0612.ELEVEN_INTEGER;
        }
        if (module0612.NIL != conses_high.member(var155, (SubLObject)module0612.$ic199$, (SubLObject)module0612.EQUALP, (SubLObject)module0612.UNPROVIDED)) {
            return (SubLObject)module0612.TWELVE_INTEGER;
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37563(final SubLObject var155) {
        return conses_high.member(var155, module0612.$g4728$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0612.EQUALP), (SubLObject)module0612.UNPROVIDED);
    }
    
    public static SubLObject f37564(final SubLObject var155) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var155.isString() && module0612.NIL != Sequences.find((SubLObject)Characters.CHAR_colon, var155, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED));
    }
    
    public static SubLObject f37565(final SubLObject var155) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0612.NIL != conses_high.member(var155, module0612.$g4729$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0612.EQUALP), (SubLObject)module0612.UNPROVIDED) || (var155.isString() && ((module0612.NIL != Characters.alpha_char_p(module0038.f2636(var155)) && module0612.NIL != module0035.f1995(var155, (SubLObject)module0612.ONE_INTEGER, (SubLObject)module0612.UNPROVIDED)) || (module0612.NIL != module0035.f1995(var155, (SubLObject)module0612.FOUR_INTEGER, (SubLObject)module0612.UNPROVIDED) && module0612.NIL == module0035.find_if_not((SubLObject)module0612.$ic202$, var155, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED)) || (module0612.NIL != module0035.f1995(var155, (SubLObject)module0612.FIVE_INTEGER, (SubLObject)module0612.UNPROVIDED) && module0612.NIL == module0035.find_if_not((SubLObject)module0612.$ic202$, var155, Symbols.symbol_function((SubLObject)module0612.IDENTITY), (SubLObject)module0612.ONE_INTEGER, (SubLObject)module0612.UNPROVIDED) && module0612.NIL != conses_high.member(module0038.f2636(var155), (SubLObject)module0612.$ic203$, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED)))));
    }
    
    public static SubLObject f37574(SubLObject var155) {
        if (module0612.NIL != module0038.f2727(var155) && module0612.NIL != module0038.f2642(var155)) {
            var155 = module0038.f2642(var155);
        }
        if (var155.isInteger() && module0612.ZERO_INTEGER.numL(var155) && module0612.THIRTEEN_INTEGER.numG(var155)) {
            return var155;
        }
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37566(final SubLObject var155) {
        final SubLThread var156 = SubLProcess.currentSubLThread();
        final SubLObject var157 = module0034.$g879$.getDynamicValue(var156);
        SubLObject var158 = (SubLObject)module0612.NIL;
        if (module0612.NIL == var157) {
            return f37574(var155);
        }
        var158 = module0034.f1857(var157, (SubLObject)module0612.$ic204$, (SubLObject)module0612.UNPROVIDED);
        if (module0612.NIL == var158) {
            var158 = module0034.f1807(module0034.f1842(var157), (SubLObject)module0612.$ic204$, (SubLObject)module0612.ONE_INTEGER, (SubLObject)module0612.NIL, (SubLObject)module0612.EQUAL, (SubLObject)module0612.UNPROVIDED);
            module0034.f1860(var157, (SubLObject)module0612.$ic204$, var158);
        }
        SubLObject var159 = module0034.f1814(var158, var155, (SubLObject)module0612.$ic115$);
        if (var159 == module0612.$ic115$) {
            var159 = Values.arg2(var156.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f37574(var155)));
            module0034.f1816(var158, var155, var159, (SubLObject)module0612.UNPROVIDED);
        }
        return module0034.f1959(var159);
    }
    
    public static SubLObject f37555(final SubLObject var236) {
        SubLObject var237 = (SubLObject)module0612.NIL;
        SubLObject var238 = (SubLObject)module0612.NIL;
        SubLObject var239 = (SubLObject)module0612.NIL;
        final SubLObject var240 = Mapping.mapcar((SubLObject)module0612.$ic205$, var236);
        final SubLObject var241 = Sequences.length(var236);
        if (var241.eql((SubLObject)module0612.TWO_INTEGER)) {
            final SubLObject var242 = var240;
            var239 = var242.first();
            var238 = conses_high.cadr(var242);
        }
        else if (var241.eql((SubLObject)module0612.THREE_INTEGER)) {
            final SubLObject var243 = var240;
            var239 = var243.first();
            var238 = conses_high.cadr(var243);
            var237 = conses_high.cddr(var243).first();
        }
        if (module0612.NIL != module0051.f3546(var239) && module0612.NIL != module0051.f3547(var238) && (module0612.NIL == var237 || module0612.NIL != module0051.f3548(var237))) {
            return Values.values(var237, var238, var239);
        }
        return Values.values((SubLObject)module0612.NIL, (SubLObject)module0612.NIL, (SubLObject)module0612.NIL);
    }
    
    public static SubLObject f37575(final SubLObject var301, final SubLObject var8) {
        final SubLThread var302 = SubLProcess.currentSubLThread();
        SubLObject var303 = (SubLObject)module0612.NIL;
        SubLObject var304 = (SubLObject)module0612.NIL;
        try {
            var302.throwStack.push(module0612.$ic145$);
            final SubLObject var305 = Errors.$error_handler$.currentBinding(var302);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0612.$ic146$), var302);
                try {
                    var302.resetMultipleValues();
                    final SubLObject var306 = f37398(var8);
                    final SubLObject var307 = var302.secondMultipleValue();
                    final SubLObject var308 = var302.thirdMultipleValue();
                    final SubLObject var309 = var302.fourthMultipleValue();
                    SubLObject var310 = var302.fifthMultipleValue();
                    SubLObject var311 = var302.sixthMultipleValue();
                    SubLObject var312 = var302.seventhMultipleValue();
                    final SubLObject var313 = var302.eighthMultipleValue();
                    var302.resetMultipleValues();
                    if (module0612.$ic206$.equal(var301)) {
                        var303 = PrintLow.format((SubLObject)module0612.NIL, (SubLObject)module0612.$ic207$, new SubLObject[] { var307, var308, var309, var310, var311, var312 });
                    }
                    else if (module0612.$ic208$.equal(var301)) {
                        var303 = PrintLow.format((SubLObject)module0612.NIL, (SubLObject)module0612.$ic209$, new SubLObject[] { var307, (module0612.NIL != var308) ? var308 : module0612.ONE_INTEGER, (module0612.NIL != var309) ? var309 : module0612.ONE_INTEGER, (module0612.NIL != var310) ? var310 : module0612.ZERO_INTEGER, (module0612.NIL != var311) ? var311 : module0612.ZERO_INTEGER, (module0612.NIL != var312) ? var312 : module0612.ZERO_INTEGER });
                    }
                    else if (module0612.$ic210$.equal(var301)) {
                        var303 = PrintLow.format((SubLObject)module0612.NIL, (SubLObject)module0612.$ic211$, new SubLObject[] { var307, var308, var309 });
                    }
                    else if (module0612.$ic212$.equal(var301)) {
                        var303 = PrintLow.format((SubLObject)module0612.NIL, (SubLObject)module0612.$ic213$, new SubLObject[] { var310, var311, var312 });
                    }
                    else if (module0612.$ic214$.equal(var301)) {
                        var303 = PrintLow.format((SubLObject)module0612.NIL, (SubLObject)module0612.$ic215$, new SubLObject[] { var310, var311, var312 });
                    }
                    else if (module0612.$ic216$.equal(var301)) {
                        if (module0612.NIL != var307) {
                            if (module0612.NIL == var310 && module0612.NIL == var311 && module0612.NIL == var312) {
                                var310 = (SubLObject)module0612.ZERO_INTEGER;
                                var311 = (SubLObject)module0612.ZERO_INTEGER;
                                var312 = (SubLObject)module0612.ZERO_INTEGER;
                            }
                            var303 = PrintLow.format((SubLObject)module0612.NIL, (SubLObject)module0612.$ic217$, new SubLObject[] { var307, var308, var309, var310, var311 });
                        }
                    }
                    else if (module0612.$ic218$.equal(var301) || module0612.$ic219$.equalp(var301) || module0612.$ic220$.equal(var301)) {
                        if (module0612.NIL != var307) {
                            if (module0612.NIL == var310 && module0612.NIL == var311 && module0612.NIL == var312) {
                                var310 = (SubLObject)module0612.ZERO_INTEGER;
                                var311 = (SubLObject)module0612.ZERO_INTEGER;
                                var312 = (SubLObject)module0612.ZERO_INTEGER;
                            }
                            if (module0612.$ic218$.equal(var301)) {
                                var303 = PrintLow.format((SubLObject)module0612.NIL, (SubLObject)module0612.$ic209$, new SubLObject[] { var307, var308, var309, var310, var311, var312 });
                            }
                            else if (module0612.$ic219$.equalp(var301)) {
                                var303 = PrintLow.format((SubLObject)module0612.NIL, (SubLObject)module0612.$ic221$, new SubLObject[] { var307, var308, var309, var310, var311, var312 });
                            }
                            else if (module0612.$ic220$.equal(var301)) {
                                var303 = PrintLow.format((SubLObject)module0612.NIL, (SubLObject)module0612.$ic222$, new SubLObject[] { var307, var308, var309, var310, var311, var312 });
                            }
                        }
                    }
                    else if (module0612.$ic223$.equal(var301)) {
                        var303 = PrintLow.format((SubLObject)module0612.NIL, (SubLObject)module0612.$ic224$, new SubLObject[] { var307, var308, var309 });
                    }
                    else {
                        var303 = module0051.f3562(var313, var312, var311, var310, var309, var308, var307, var301);
                    }
                }
                catch (Throwable var314) {
                    Errors.handleThrowable(var314, (SubLObject)module0612.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var305, var302);
            }
        }
        catch (Throwable var315) {
            var304 = Errors.handleThrowable(var315, (SubLObject)module0612.$ic145$);
        }
        finally {
            var302.throwStack.pop();
        }
        return var303;
    }
    
    public static SubLObject f37576() {
        return module0612.$g4730$.getGlobalValue();
    }
    
    public static SubLObject f37577(final SubLObject var301, final SubLObject var302) {
        final SubLThread var303 = SubLProcess.currentSubLThread();
        SubLObject var304 = (SubLObject)module0612.NIL;
        SubLObject var305 = (SubLObject)module0612.NIL;
        try {
            var303.throwStack.push(module0612.$ic145$);
            final SubLObject var306 = Errors.$error_handler$.currentBinding(var303);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0612.$ic146$), var303);
                try {
                    if (module0612.$ic206$.equal(var301)) {
                        final SubLObject var307 = reader.parse_integer(var302, (SubLObject)module0612.ZERO_INTEGER, (SubLObject)module0612.FOUR_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                        final SubLObject var308 = reader.parse_integer(var302, (SubLObject)module0612.FIVE_INTEGER, (SubLObject)module0612.SEVEN_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                        final SubLObject var309 = reader.parse_integer(var302, (SubLObject)module0612.EIGHT_INTEGER, (SubLObject)module0612.TEN_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                        final SubLObject var310 = reader.parse_integer(var302, (SubLObject)module0612.ELEVEN_INTEGER, (SubLObject)module0612.THIRTEEN_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                        final SubLObject var311 = reader.parse_integer(var302, (SubLObject)module0612.FOURTEEN_INTEGER, (SubLObject)module0612.SIXTEEN_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                        final SubLObject var312 = reader.parse_integer(var302, (SubLObject)module0612.SEVENTEEN_INTEGER, (SubLObject)module0612.NINETEEN_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                        var304 = f37428(var307, var308, var309, var310, var311, var312, (SubLObject)module0612.UNPROVIDED);
                    }
                    else if (module0612.$ic208$.equal(var301)) {
                        final SubLObject var313 = module0038.f2738(var302, (SubLObject)module0612.$ic226$, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                        SubLObject var315;
                        final SubLObject var314 = var315 = var313;
                        SubLObject var316 = (SubLObject)(var315.isCons() ? var315.first() : module0612.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(var315, var314, (SubLObject)module0612.$ic227$);
                        var315 = var315.rest();
                        SubLObject var317 = (SubLObject)(var315.isCons() ? var315.first() : module0612.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(var315, var314, (SubLObject)module0612.$ic227$);
                        var315 = var315.rest();
                        SubLObject var318 = (SubLObject)(var315.isCons() ? var315.first() : module0612.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(var315, var314, (SubLObject)module0612.$ic227$);
                        var315 = var315.rest();
                        SubLObject var319 = (SubLObject)(var315.isCons() ? var315.first() : module0612.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(var315, var314, (SubLObject)module0612.$ic227$);
                        var315 = var315.rest();
                        SubLObject var320 = (SubLObject)(var315.isCons() ? var315.first() : module0612.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(var315, var314, (SubLObject)module0612.$ic227$);
                        var315 = var315.rest();
                        SubLObject var321 = (SubLObject)(var315.isCons() ? var315.first() : module0612.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(var315, var314, (SubLObject)module0612.$ic227$);
                        var315 = var315.rest();
                        final SubLObject var322 = (SubLObject)(var315.isCons() ? var315.first() : module0612.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(var315, var314, (SubLObject)module0612.$ic227$);
                        var315 = var315.rest();
                        if (module0612.NIL == var315) {
                            var316 = (SubLObject)(var316.isString() ? module0038.f2642(var316) : module0612.NIL);
                            var317 = (SubLObject)(var317.isString() ? module0038.f2642(var317) : module0612.NIL);
                            var318 = (SubLObject)(var318.isString() ? module0038.f2642(var318) : module0612.NIL);
                            var319 = (SubLObject)(var319.isString() ? module0038.f2642(var319) : module0612.NIL);
                            var320 = (SubLObject)(var320.isString() ? module0038.f2642(var320) : module0612.NIL);
                            var321 = (SubLObject)(var321.isString() ? module0038.f2642(var321) : module0612.NIL);
                            var304 = f37428(var316, var317, var318, var319, var320, var321, (SubLObject)module0612.UNPROVIDED);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var314, (SubLObject)module0612.$ic227$);
                        }
                    }
                    else if (module0612.$ic220$.equal(var301)) {
                        final SubLObject var307 = reader.parse_integer(var302, (SubLObject)module0612.ZERO_INTEGER, (SubLObject)module0612.FOUR_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                        final SubLObject var308 = reader.parse_integer(var302, (SubLObject)module0612.FOUR_INTEGER, (SubLObject)module0612.SIX_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                        final SubLObject var309 = reader.parse_integer(var302, (SubLObject)module0612.SIX_INTEGER, (SubLObject)module0612.EIGHT_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                        final SubLObject var310 = reader.parse_integer(var302, (SubLObject)module0612.EIGHT_INTEGER, (SubLObject)module0612.TEN_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                        final SubLObject var311 = reader.parse_integer(var302, (SubLObject)module0612.TEN_INTEGER, (SubLObject)module0612.TWELVE_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                        final SubLObject var312 = reader.parse_integer(var302, (SubLObject)module0612.TWELVE_INTEGER, (SubLObject)module0612.FOURTEEN_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                        var304 = f37428(var307, var308, var309, var310, var311, var312, (SubLObject)module0612.UNPROVIDED);
                    }
                    else if (module0612.$ic216$.equal(var301)) {
                        final SubLObject var307 = reader.parse_integer(var302, (SubLObject)module0612.ZERO_INTEGER, (SubLObject)module0612.FOUR_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                        final SubLObject var308 = reader.parse_integer(var302, (SubLObject)module0612.FOUR_INTEGER, (SubLObject)module0612.SIX_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                        final SubLObject var309 = reader.parse_integer(var302, (SubLObject)module0612.SIX_INTEGER, (SubLObject)module0612.EIGHT_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                        final SubLObject var310 = reader.parse_integer(var302, (SubLObject)module0612.EIGHT_INTEGER, (SubLObject)module0612.TEN_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                        final SubLObject var311 = reader.parse_integer(var302, (SubLObject)module0612.TEN_INTEGER, (SubLObject)module0612.TWELVE_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                        var304 = f37428(var307, var308, var309, var310, var311, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                    }
                    else if (module0612.$ic210$.equal(var301)) {
                        final SubLObject var307 = reader.parse_integer(var302, (SubLObject)module0612.ZERO_INTEGER, (SubLObject)module0612.FOUR_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                        final SubLObject var308 = reader.parse_integer(var302, (SubLObject)module0612.FOUR_INTEGER, (SubLObject)module0612.SIX_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                        final SubLObject var309 = reader.parse_integer(var302, (SubLObject)module0612.SIX_INTEGER, (SubLObject)module0612.EIGHT_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                        var304 = f37428(var307, var308, var309, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                    }
                    else if (module0612.$ic218$.equal(var301) || module0612.$ic219$.equalp(var301) || module0612.$ic223$.equal(var301)) {
                        final SubLObject var313 = module0038.f2738(var302, (SubLObject)module0612.$ic228$, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
                        SubLObject var324;
                        final SubLObject var323 = var324 = var313;
                        SubLObject var316 = (SubLObject)(var324.isCons() ? var324.first() : module0612.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(var324, var323, (SubLObject)module0612.$ic227$);
                        var324 = var324.rest();
                        SubLObject var317 = (SubLObject)(var324.isCons() ? var324.first() : module0612.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(var324, var323, (SubLObject)module0612.$ic227$);
                        var324 = var324.rest();
                        SubLObject var318 = (SubLObject)(var324.isCons() ? var324.first() : module0612.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(var324, var323, (SubLObject)module0612.$ic227$);
                        var324 = var324.rest();
                        SubLObject var319 = (SubLObject)(var324.isCons() ? var324.first() : module0612.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(var324, var323, (SubLObject)module0612.$ic227$);
                        var324 = var324.rest();
                        SubLObject var320 = (SubLObject)(var324.isCons() ? var324.first() : module0612.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(var324, var323, (SubLObject)module0612.$ic227$);
                        var324 = var324.rest();
                        SubLObject var321 = (SubLObject)(var324.isCons() ? var324.first() : module0612.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(var324, var323, (SubLObject)module0612.$ic227$);
                        var324 = var324.rest();
                        final SubLObject var322 = (SubLObject)(var324.isCons() ? var324.first() : module0612.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(var324, var323, (SubLObject)module0612.$ic227$);
                        var324 = var324.rest();
                        if (module0612.NIL == var324) {
                            var316 = (SubLObject)(var316.isString() ? module0038.f2642(var316) : module0612.NIL);
                            var317 = (SubLObject)(var317.isString() ? module0038.f2642(var317) : module0612.NIL);
                            var318 = (SubLObject)(var318.isString() ? module0038.f2642(var318) : module0612.NIL);
                            var319 = (SubLObject)(var319.isString() ? module0038.f2642(var319) : module0612.NIL);
                            var320 = (SubLObject)(var320.isString() ? module0038.f2642(var320) : module0612.NIL);
                            var321 = (SubLObject)(var321.isString() ? module0038.f2642(var321) : module0612.NIL);
                            if (module0612.NIL != var316) {
                                var304 = f37428(var316, var317, var318, var319, var320, var321, (SubLObject)module0612.UNPROVIDED);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var323, (SubLObject)module0612.$ic227$);
                        }
                    }
                    else {
                        var303.resetMultipleValues();
                        final SubLObject var325 = module0051.f3595(var302, var301);
                        final SubLObject var326 = var303.secondMultipleValue();
                        final SubLObject var327 = var303.thirdMultipleValue();
                        final SubLObject var328 = var303.fourthMultipleValue();
                        final SubLObject var329 = var303.fifthMultipleValue();
                        final SubLObject var330 = var303.sixthMultipleValue();
                        final SubLObject var331 = var303.seventhMultipleValue();
                        var303.resetMultipleValues();
                        var304 = f37428(var331, var330, var329, var328, var327, var326, var325);
                    }
                }
                catch (Throwable var332) {
                    Errors.handleThrowable(var332, (SubLObject)module0612.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var306, var303);
            }
        }
        catch (Throwable var333) {
            var305 = Errors.handleThrowable(var333, (SubLObject)module0612.$ic145$);
        }
        finally {
            var303.throwStack.pop();
        }
        return var304;
    }
    
    public static SubLObject f37578(final SubLObject var302) {
        SubLObject var303 = f37547(var302);
        if (module0612.NIL == var303) {}
        if (module0612.NIL != var303) {
            return Mapping.mapcar((SubLObject)module0612.$ic229$, var303);
        }
        if (module0612.NIL == var303) {
            SubLObject var304 = f37576();
            SubLObject var305 = (SubLObject)module0612.NIL;
            var305 = var304.first();
            while (module0612.NIL == var303 && module0612.NIL != var304) {
                final SubLObject var307;
                final SubLObject var306 = var307 = f37577(var305, var302);
                if (module0612.NIL != var307) {
                    final SubLObject var308 = var307;
                    if (module0612.NIL == conses_high.member(var308, var303, Symbols.symbol_function((SubLObject)module0612.EQL), Symbols.symbol_function((SubLObject)module0612.IDENTITY))) {
                        var303 = (SubLObject)ConsesLow.cons(var308, var303);
                    }
                }
                var304 = var304.rest();
                var305 = var304.first();
            }
        }
        return var303;
    }
    
    public static SubLObject f37579(final SubLObject var301, final SubLObject var115) {
        final SubLThread var302 = SubLProcess.currentSubLThread();
        final SubLObject var303 = f37494(var115);
        SubLObject var304 = (SubLObject)module0612.NIL;
        SubLObject var305 = (SubLObject)module0612.NIL;
        SubLObject var306 = (SubLObject)module0612.NIL;
        SubLObject var307 = (SubLObject)module0612.NIL;
        SubLObject var308 = (SubLObject)module0612.NIL;
        if (module0612.NIL != module0038.f2668((SubLObject)module0612.$ic230$, var301, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED)) {
            var302.resetMultipleValues();
            final SubLObject var319_320 = module0051.f3598(var303);
            final SubLObject var321_322 = var302.secondMultipleValue();
            final SubLObject var323_324 = var302.thirdMultipleValue();
            final SubLObject var325_326 = var302.fourthMultipleValue();
            var302.resetMultipleValues();
            var304 = var319_320;
            var305 = var321_322;
            var306 = var323_324;
            var307 = var325_326;
        }
        else {
            var302.resetMultipleValues();
            final SubLObject var327_328 = module0051.f3599(var303);
            final SubLObject var329_330 = var302.secondMultipleValue();
            final SubLObject var331_332 = var302.thirdMultipleValue();
            final SubLObject var333_334 = var302.fourthMultipleValue();
            var302.resetMultipleValues();
            var304 = var327_328;
            var305 = var329_330;
            var306 = var331_332;
            var307 = var333_334;
        }
        if (module0612.$ic231$.equal(var301)) {
            var308 = PrintLow.format((SubLObject)module0612.NIL, (SubLObject)module0612.$ic232$, new SubLObject[] { var306, var305, Numbers.truncate(var304, (SubLObject)module0612.UNPROVIDED) });
        }
        else if (module0612.$ic212$.equal(var301)) {
            var308 = PrintLow.format((SubLObject)module0612.NIL, (SubLObject)module0612.$ic213$, new SubLObject[] { var306, var305, var304 });
        }
        else if (module0612.$ic233$.equal(var301)) {
            var308 = PrintLow.format((SubLObject)module0612.NIL, (SubLObject)module0612.$ic234$, var306, var305);
        }
        else {
            Errors.cerror((SubLObject)module0612.$ic235$, (SubLObject)module0612.$ic236$, var301);
        }
        return var308;
    }
    
    public static SubLObject f37580(final SubLObject var301, final SubLObject var237) {
        SubLObject var302 = (SubLObject)module0612.NIL;
        if (module0612.$ic231$.equal(var301)) {
            final SubLObject var303 = Mapping.mapcar((SubLObject)module0612.$ic205$, module0038.f2738(var237, (SubLObject)module0612.$ic237$, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED));
            final SubLObject var304 = var303.first();
            final SubLObject var305 = conses_high.second(var303);
            final SubLObject var306 = conses_high.third(var303);
            final SubLObject var307 = module0051.f3600(var306, var305, var304, (SubLObject)module0612.UNPROVIDED);
            var302 = module0202.f12643(module0612.$ic72$, var307);
        }
        else if (module0612.$ic212$.equal(var301)) {
            final SubLObject var308 = reader.parse_integer(var237, (SubLObject)module0612.ZERO_INTEGER, (SubLObject)module0612.TWO_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
            final SubLObject var309 = reader.parse_integer(var237, (SubLObject)module0612.TWO_INTEGER, (SubLObject)module0612.FOUR_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
            final SubLObject var310 = reader.parse_integer(var237, (SubLObject)module0612.FOUR_INTEGER, (SubLObject)module0612.SIX_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
            final SubLObject var311 = module0051.f3600(var310, var309, var308, (SubLObject)module0612.UNPROVIDED);
            var302 = module0202.f12643(module0612.$ic72$, var311);
        }
        else if (module0612.$ic233$.equal(var301)) {
            final SubLObject var308 = reader.parse_integer(var237, (SubLObject)module0612.ZERO_INTEGER, (SubLObject)module0612.TWO_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
            final SubLObject var309 = reader.parse_integer(var237, (SubLObject)module0612.TWO_INTEGER, (SubLObject)module0612.FOUR_INTEGER, (SubLObject)module0612.UNPROVIDED, (SubLObject)module0612.UNPROVIDED);
            final SubLObject var312 = module0051.f3600((SubLObject)module0612.ZERO_INTEGER, var309, var308, (SubLObject)module0612.UNPROVIDED);
            var302 = module0202.f12643(module0612.$ic72$, var312);
        }
        else {
            Errors.cerror((SubLObject)module0612.$ic235$, (SubLObject)module0612.$ic236$, var301);
        }
        return var302;
    }
    
    public static SubLObject f37581() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37379", "S#41094", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37380", "S#24500", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37381", "S#41095", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37382", "S#24728", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37384", "S#41096", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37385", "S#41097", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37387", "S#14102", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37391", "S#41098", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37383", "S#41089", 1, 0, false);
        new $f37383$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37392", "S#41099", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37386", "S#41100", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37389", "S#20109", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37388", "S#20110", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37390", "S#13438", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37393", "S#20094", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37394", "S#41101", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0612", "f37395", "S#41102");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37396", "S#41103", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37397", "S#41104", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37399", "S#41105", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37400", "EXTRACT-DATE-YEAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37401", "S#34852", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37403", "EXTRACT-DATE-MONTH-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37404", "EXTRACT-DATE-DAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37405", "EXTRACT-DATE-HOUR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37406", "EXTRACT-DATE-MINUTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37407", "EXTRACT-DATE-SECOND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37408", "EXTRACT-DATE-MILLISECOND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37409", "S#41106", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37411", "S#41107", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37398", "S#41108", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37412", "S#41109", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37410", "S#41110", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37413", "S#41111", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37414", "S#41112", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37415", "S#41113", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37416", "S#41114", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37418", "S#41115", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37419", "S#41116", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37420", "S#41117", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37422", "S#41118", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37424", "S#34902", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37428", "S#41119", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37429", "S#41120", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37430", "S#41121", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37431", "S#41122", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37432", "S#41123", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37433", "S#41124", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37434", "S#41125", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37435", "S#41126", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37436", "S#24504", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37402", "S#41127", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37417", "S#4942", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37438", "S#34875", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37437", "S#41128", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37439", "S#41129", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37440", "S#41130", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37441", "S#41131", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37443", "S#41132", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37442", "S#41133", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37444", "S#41134", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37448", "S#41135", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37451", "S#41136", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37452", "S#41137", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37454", "S#41138", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37445", "S#41139", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37446", "S#41140", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37455", "S#41141", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37456", "S#41142", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37457", "S#41143", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37458", "S#41144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37459", "S#41145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37460", "S#41146", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37461", "S#41147", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37462", "S#41148", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37463", "S#41149", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37421", "S#41150", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37464", "S#41151", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37465", "S#41152", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37423", "S#41153", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37466", "S#41154", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37467", "S#41155", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37468", "S#41156", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37425", "S#34900", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37472", "S#20107", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37474", "S#20108", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37475", "S#41157", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37477", "S#41158", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37476", "S#34856", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37478", "S#41159", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37480", "S#41160", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37481", "S#41161", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37449", "S#41162", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37482", "S#41163", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37471", "S#41164", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37484", "S#41165", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37483", "S#41166", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37470", "S#41167", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37469", "S#41168", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37485", "S#20104", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37488", "S#41169", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37486", "S#41170", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37487", "S#20158", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37490", "S#20159", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37489", "S#41171", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37491", "S#41172", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37492", "S#41173", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37493", "S#41174", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37479", "S#41175", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37453", "S#41176", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37450", "S#33716", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37494", "S#39905", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37495", "S#41177", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37496", "S#41178", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37497", "S#41179", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37498", "S#41180", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37499", "S#41181", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37500", "S#41182", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37501", "S#41183", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37504", "S#41184", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37505", "S#41185", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37506", "S#41186", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37507", "S#41187", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37508", "S#41188", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37509", "S#41189", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37510", "S#41190", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37447", "S#41191", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37511", "S#41192", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37502", "S#41193", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37503", "S#41194", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37513", "S#41195", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37473", "S#34877", 1, 0, false);
        new $f37473$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37515", "S#20160", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37516", "S#20101", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37518", "S#20100", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37517", "S#41196", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37519", "S#18223", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37520", "S#41197", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37521", "S#20099", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37522", "S#41198", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37523", "S#41199", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0612", "f37524", "S#41200");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0612", "f37525", "S#41201");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0612", "f37526", "S#41202");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37527", "S#31692", 0, 0, false);
        new $f37527$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37528", "S#35358", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37529", "S#35359", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37530", "S#35360", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37531", "S#35361", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37532", "S#41203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37533", "S#41204", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37534", "S#41205", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37426", "S#31693", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37514", "S#14100", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37535", "S#14101", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37536", "S#35631", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37427", "S#33715", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37537", "S#35632", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37512", "S#24502", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37538", "S#24503", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37539", "S#41206", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37540", "S#41207", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37541", "S#41208", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37544", "S#41209", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37545", "S#41210", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37546", "S#41211", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37547", "S#41212", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37549", "S#41213", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37550", "S#41214", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37543", "S#41215", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37542", "S#41216", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37552", "S#41217", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37551", "S#41218", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37553", "S#41219", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37548", "S#41220", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37556", "S#41221", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37558", "S#41222", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37557", "S#41223", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37554", "S#41224", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37559", "S#41225", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37568", "S#41226", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37560", "S#41227", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37569", "S#41228", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37567", "S#41229", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37571", "S#41230", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37572", "S#41231", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37573", "S#41232", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37570", "S#41233", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37561", "S#41234", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37562", "S#41235", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37563", "S#41236", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37564", "S#41237", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37565", "S#41238", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37574", "S#41239", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37566", "S#41240", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37555", "S#41241", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37575", "S#41242", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37576", "S#41243", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37577", "S#41244", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37578", "S#41245", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37579", "S#41246", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0612", "f37580", "S#41247", 2, 0, false);
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37582() {
        module0612.$g4711$ = SubLFiles.deflexical("S#41248", (SubLObject)module0612.$ic0$);
        module0612.$g4712$ = SubLFiles.deflexical("S#41249", (SubLObject)module0612.$ic6$);
        module0612.$g4713$ = SubLFiles.deflexical("S#41250", (SubLObject)module0612.$ic7$);
        module0612.$g2464$ = SubLFiles.defconstant("S#41251", (SubLObject)module0612.$ic8$);
        module0612.$g2466$ = SubLFiles.defconstant("S#41252", (SubLObject)module0612.$ic9$);
        module0612.$g4714$ = SubLFiles.deflexical("S#41253", (SubLObject)module0612.$ic12$);
        module0612.$g4715$ = SubLFiles.deflexical("S#41254", (SubLObject)module0612.$ic19$);
        module0612.$g4716$ = SubLFiles.deflexical("S#41255", (SubLObject)module0612.$ic80$);
        module0612.$g4717$ = SubLFiles.deflexical("S#41256", (SubLObject)module0612.$ic85$);
        module0612.$g4718$ = SubLFiles.deflexical("S#41257", (SubLObject)module0612.$ic91$);
        module0612.$g4719$ = SubLFiles.deflexical("S#41258", (SubLObject)module0612.$ic97$);
        module0612.$g4720$ = SubLFiles.defconstant("S#41259", (SubLObject)module0612.$ic120$);
        module0612.$g4721$ = SubLFiles.deflexical("S#41260", (SubLObject)((module0612.NIL != Symbols.boundp((SubLObject)module0612.$ic122$)) ? module0612.$g4721$.getGlobalValue() : module0612.$ic123$));
        module0612.$g4722$ = SubLFiles.defparameter("S#41261", (SubLObject)module0612.NIL);
        module0612.$g4513$ = SubLFiles.defconstant("S#41262", Time.encode_universal_time((SubLObject)module0612.ZERO_INTEGER, (SubLObject)module0612.ZERO_INTEGER, (SubLObject)module0612.ZERO_INTEGER, (SubLObject)module0612.ONE_INTEGER, (SubLObject)module0612.ONE_INTEGER, (SubLObject)module0612.$ic132$, (SubLObject)module0612.UNPROVIDED));
        module0612.$g4723$ = SubLFiles.defparameter("S#41263", (SubLObject)module0612.T);
        module0612.$g4724$ = SubLFiles.defparameter("S#41264", (SubLObject)module0612.$ic166$);
        module0612.$g4725$ = SubLFiles.defparameter("S#41265", (SubLObject)module0612.$ic167$);
        module0612.$g4726$ = SubLFiles.defparameter("S#41266", (SubLObject)module0612.NIL);
        module0612.$g4727$ = SubLFiles.defparameter("S#41267", (SubLObject)module0612.$ic185$);
        module0612.$g4728$ = SubLFiles.deflexical("S#41268", (SubLObject)module0612.$ic200$);
        module0612.$g4729$ = SubLFiles.deflexical("S#41269", (SubLObject)module0612.$ic201$);
        module0612.$g4730$ = SubLFiles.deflexical("S#41270", (SubLObject)module0612.$ic225$);
        return (SubLObject)module0612.NIL;
    }
    
    public static SubLObject f37583() {
        module0002.f38((SubLObject)module0612.$ic22$);
        module0002.f38((SubLObject)module0612.$ic24$);
        module0002.f38((SubLObject)module0612.$ic25$);
        module0002.f38((SubLObject)module0612.$ic26$);
        module0002.f38((SubLObject)module0612.$ic27$);
        module0002.f38((SubLObject)module0612.$ic28$);
        module0002.f38((SubLObject)module0612.$ic29$);
        module0034.f1895((SubLObject)module0612.$ic113$);
        module0003.f57((SubLObject)module0612.$ic122$);
        module0034.f1895((SubLObject)module0612.$ic183$);
        module0034.f1895((SubLObject)module0612.$ic184$);
        module0034.f1895((SubLObject)module0612.$ic204$);
        return (SubLObject)module0612.NIL;
    }
    
    public void declareFunctions() {
        f37581();
    }
    
    public void initializeVariables() {
        f37582();
    }
    
    public void runTopLevelForms() {
        f37583();
    }
    
    static {
        me = (SubLFile)new module0612();
        module0612.$g4711$ = null;
        module0612.$g4712$ = null;
        module0612.$g4713$ = null;
        module0612.$g2464$ = null;
        module0612.$g2466$ = null;
        module0612.$g4714$ = null;
        module0612.$g4715$ = null;
        module0612.$g4716$ = null;
        module0612.$g4717$ = null;
        module0612.$g4718$ = null;
        module0612.$g4719$ = null;
        module0612.$g4720$ = null;
        module0612.$g4721$ = null;
        module0612.$g4722$ = null;
        module0612.$g4513$ = null;
        module0612.$g4723$ = null;
        module0612.$g4724$ = null;
        module0612.$g4725$ = null;
        module0612.$g4726$ = null;
        module0612.$g4727$ = null;
        module0612.$g4728$ = null;
        module0612.$g4729$ = null;
        module0612.$g4730$ = null;
        $ic0$ = ConsesLow.list(new SubLObject[] { module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("MinuteFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("HourFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("DayFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("MonthFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("YearFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("January")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("February")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("March")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("April")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("May")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("June")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("July")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("August")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("September")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("October")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("November")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("December")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("definingTimeUnit")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("DaysDuration")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("MonthsDuration")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("YearsDuration")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarDay")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarMonth")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarYear")) });
        $ic1$ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $ic2$ = SubLObjectFactory.makeKeyword("AND");
        $ic3$ = SubLObjectFactory.makeKeyword("EL-VARIABLE");
        $ic4$ = SubLObjectFactory.makeKeyword("ANYTHING");
        $ic5$ = SubLObjectFactory.makeSymbol("S#25244", "CYC");
        $ic6$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("OR"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheYear-Indexical")), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MonthFn")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#41089", "CYC")))), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MonthFn")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheYear-Indexical")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#41089", "CYC")))), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MonthFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#41089", "CYC")))), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("HourFn")), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#41089", "CYC")))), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MinuteFn")), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("HourFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#41089", "CYC")))), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondFn")), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MinuteFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#41089", "CYC")))), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MilliSecondFn")), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#41089", "CYC")))), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("DecadeFn")), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CenturyFn")), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("QuarterFn")), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#41089", "CYC")))) });
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("HourFn")), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#41099", "CYC"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MinuteFn")), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("HourFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#41100", "CYC")))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondFn")), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MinuteFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#41100", "CYC")))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MilliSecondFn")), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#41100", "CYC")))));
        $ic8$ = SubLObjectFactory.makeKeyword("BEGINNING-OF-TIME");
        $ic9$ = SubLObjectFactory.makeKeyword("END-OF-TIME");
        $ic10$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Always-TimeInterval"));
        $ic11$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheEmptyTimeInterval"));
        $ic12$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarSecond")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarMinute")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarHour")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarDay")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarMonth")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarYear")));
        $ic13$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#41271", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#15403", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE?"));
        $ic15$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic16$ = SubLObjectFactory.makeKeyword("DONE?");
        $ic17$ = SubLObjectFactory.makeSymbol("CSOME");
        $ic18$ = SubLObjectFactory.makeSymbol("S#41253", "CYC");
        $ic19$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALENDAR"), (SubLObject)SubLObjectFactory.makeKeyword("QUARTER"), (SubLObject)SubLObjectFactory.makeKeyword("DECADE"), (SubLObject)SubLObjectFactory.makeKeyword("CENTURY"));
        $ic20$ = SubLObjectFactory.makeKeyword("CENTURY");
        $ic21$ = SubLObjectFactory.makeKeyword("DECADE");
        $ic22$ = SubLObjectFactory.makeSymbol("EXTRACT-DATE-YEAR");
        $ic23$ = SubLObjectFactory.makeKeyword("QUARTER");
        $ic24$ = SubLObjectFactory.makeSymbol("EXTRACT-DATE-MONTH-NUMBER");
        $ic25$ = SubLObjectFactory.makeSymbol("EXTRACT-DATE-DAY");
        $ic26$ = SubLObjectFactory.makeSymbol("EXTRACT-DATE-HOUR");
        $ic27$ = SubLObjectFactory.makeSymbol("EXTRACT-DATE-MINUTE");
        $ic28$ = SubLObjectFactory.makeSymbol("EXTRACT-DATE-SECOND");
        $ic29$ = SubLObjectFactory.makeSymbol("EXTRACT-DATE-MILLISECOND");
        $ic30$ = SubLObjectFactory.makeSymbol("S#41097", "CYC");
        $ic31$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarMilliSecond"));
        $ic32$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarSecond"));
        $ic33$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarMinute"));
        $ic34$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarHour"));
        $ic35$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarDay"));
        $ic36$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarMonth"));
        $ic37$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarYear"));
        $ic38$ = SubLObjectFactory.makeString("~a is not a valid date.");
        $ic39$ = SubLObjectFactory.makeKeyword("CALENDAR");
        $ic40$ = SubLObjectFactory.makeString("Can't handle a date of ~S yet");
        $ic41$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("YearFn"));
        $ic42$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MonthFn"));
        $ic43$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("DayFn"));
        $ic44$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("HourFn"));
        $ic45$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MinuteFn"));
        $ic46$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondFn"));
        $ic47$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MilliSecondFn"));
        $ic48$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("QuarterFn"));
        $ic49$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("DecadeFn"));
        $ic50$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CenturyFn"));
        $ic51$ = SubLObjectFactory.makeString("~a is not a valid time");
        $ic52$ = SubLObjectFactory.makeKeyword("INDEXICAL-YEAR");
        $ic53$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheYear-Indexical"));
        $ic54$ = SubLObjectFactory.makeKeyword("START");
        $ic55$ = SubLObjectFactory.makeKeyword("END");
        $ic56$ = SubLObjectFactory.makeInteger(100);
        $ic57$ = SubLObjectFactory.makeString("Can't attach month ~S to date ~S");
        $ic58$ = SubLObjectFactory.makeString("Can't attach day ~S to date ~S");
        $ic59$ = SubLObjectFactory.makeString("Can't attach hour ~S to date ~S");
        $ic60$ = SubLObjectFactory.makeString("Can't attach minute ~S to date ~S");
        $ic61$ = SubLObjectFactory.makeString("Can't attach sec ~S to date ~S");
        $ic62$ = SubLObjectFactory.makeString("Can't attach millisec ~S to date ~S");
        $ic63$ = SubLObjectFactory.makeString("Can't attach quarter ~S to date ~S");
        $ic64$ = SubLObjectFactory.makeString("Can't construct date with decade ~S");
        $ic65$ = SubLObjectFactory.makeString("Can't construct date with century ~S");
        $ic66$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("YearsDuration"));
        $ic67$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MonthsDuration"));
        $ic68$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("WeeksDuration"));
        $ic69$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("DaysDuration"));
        $ic70$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("HoursDuration"));
        $ic71$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MinutesDuration"));
        $ic72$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondsDuration"));
        $ic73$ = SubLObjectFactory.makeInteger(60);
        $ic74$ = SubLObjectFactory.makeInteger(24);
        $ic75$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("QuartersDuration"));
        $ic76$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("DecadesDuration"));
        $ic77$ = SubLObjectFactory.makeInteger(120);
        $ic78$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CenturiesDuration"));
        $ic79$ = SubLObjectFactory.makeInteger(1200);
        $ic80$ = ConsesLow.list(new SubLObject[] { module0128.f8479((SubLObject)SubLObjectFactory.makeString("January")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("February")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("March")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("April")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("May")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("June")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("July")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("August")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("September")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("October")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("November")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("December")) });
        $ic81$ = SubLObjectFactory.makeString("A KB-dependent date-specific function was called, but the current Cyc KB does not contain knowledge about dates.");
        $ic82$ = SubLObjectFactory.makeSymbol("S#4945", "CYC");
        $ic83$ = SubLObjectFactory.makeSymbol("S#41128", "CYC");
        $ic84$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MonthOfYearFn"));
        $ic85$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Sunday")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Monday")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Tuesday")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Wednesday")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Thursday")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Friday")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Saturday")));
        $ic86$ = SubLObjectFactory.makeString("~S is not a valid day-of-week number");
        $ic87$ = SubLObjectFactory.makeSymbol("S#41129", "CYC");
        $ic88$ = SubLObjectFactory.makeSymbol("S#24728", "CYC");
        $ic89$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic90$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("DayOfMonthFn"));
        $ic91$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)module0612.ONE_INTEGER, (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MonthFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)module0612.ONE_INTEGER)));
        $ic92$ = SubLObjectFactory.makeInteger(365);
        $ic93$ = SubLObjectFactory.makeInteger(400);
        $ic94$ = SubLObjectFactory.makeInteger(367);
        $ic95$ = SubLObjectFactory.makeInteger(362);
        $ic96$ = SubLObjectFactory.makeInteger(-2);
        $ic97$ = ConsesLow.list(new SubLObject[] { module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-MidnightHour")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-1AM")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-2AM")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-3AM")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-4AM")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-5AM")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-6AM")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-7AM")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-8AM")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-9AM")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-10AM")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-11AM")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-NoonHour")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-1PM")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-2PM")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-3PM")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-4PM")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-5PM")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-6PM")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-7PM")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-8PM")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-9PM")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-10PM")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-11PM")) });
        $ic98$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("HourOfDayFn"));
        $ic99$ = SubLObjectFactory.makeString("Continue with nil hour of day?");
        $ic100$ = SubLObjectFactory.makeString("~a did not specify a day.");
        $ic101$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MinuteOfHourFn"));
        $ic102$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondOfMinuteFn"));
        $ic103$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarWeek"));
        $ic104$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Sunday"));
        $ic105$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("January"));
        $ic106$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarQuarter"));
        $ic107$ = SubLObjectFactory.makeInteger(59);
        $ic108$ = SubLObjectFactory.makeInteger(23);
        $ic109$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Saturday"));
        $ic110$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("December"));
        $ic111$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarDecade"));
        $ic112$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarCentury"));
        $ic113$ = SubLObjectFactory.makeSymbol("S#34856", "CYC");
        $ic114$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("definingTimeUnit"));
        $ic115$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic116$ = SubLObjectFactory.makeString("~a is not a valid cycl date.");
        $ic117$ = SubLObjectFactory.makeInteger(29);
        $ic118$ = SubLObjectFactory.makeSymbol("S#20114", "CYC");
        $ic119$ = SubLObjectFactory.makeString("Could not determine precision for ~a or ~a.~%");
        $ic120$ = SubLObjectFactory.makeInteger("10000000000");
        $ic121$ = SubLObjectFactory.makeString("Expected a #$DaysDuration nat, got ~s");
        $ic122$ = SubLObjectFactory.makeSymbol("S#41260", "CYC");
        $ic123$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Now")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Now-Indexical")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Today-Indexical")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Tomorrow-Indexical")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Yesterday-Indexical")));
        $ic124$ = SubLObjectFactory.makeSymbol("S#34877", "CYC");
        $ic125$ = SubLObjectFactory.makeSymbol("S#35336", "CYC");
        $ic126$ = SubLObjectFactory.makeSymbol("S#41197", "CYC");
        $ic127$ = SubLObjectFactory.makeSymbol("CLET");
        $ic128$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#41261", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-UNIVERSAL-TIME"))));
        $ic129$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#41261", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#41199", "CYC"))));
        $ic130$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#41261", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-OF"), (SubLObject)SubLObjectFactory.makeSymbol("S#41261", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#41199", "CYC")))));
        $ic131$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("DaysDuration")), (SubLObject)module0612.ONE_INTEGER);
        $ic132$ = SubLObjectFactory.makeInteger(1970);
        $ic133$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-AM"));
        $ic134$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-MidnightHour"));
        $ic135$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-PM"));
        $ic136$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDay-NoonHour"));
        $ic137$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfYearFn"));
        $ic138$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfMonthFn"));
        $ic139$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("DayOfYearFn"));
        $ic140$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfWeekFn"));
        $ic141$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfDayFn"));
        $ic142$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeOfHourFn"));
        $ic143$ = SubLObjectFactory.makeSymbol("S#4951", "CYC");
        $ic144$ = SubLObjectFactory.makeSymbol("S#4999", "CYC");
        $ic145$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic146$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic147$ = SubLObjectFactory.makeString("from ");
        $ic148$ = SubLObjectFactory.makeString(" to ");
        $ic149$ = SubLObjectFactory.makeString("Can't support [) or (] time intervals.");
        $ic150$ = SubLObjectFactory.makeString("Can't support [) or (] time intervals.~%");
        $ic151$ = SubLObjectFactory.makeString("/");
        $ic152$ = SubLObjectFactory.makeString("-");
        $ic153$ = SubLObjectFactory.makeString(".");
        $ic154$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("."), (SubLObject)SubLObjectFactory.makeString("-"), (SubLObject)SubLObjectFactory.makeString("/"), (SubLObject)SubLObjectFactory.makeString(" "));
        $ic155$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(":"), (SubLObject)SubLObjectFactory.makeString(" "));
        $ic156$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13592", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13591", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13593", "CYC"));
        $ic157$ = SubLObjectFactory.makeString(":");
        $ic158$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" , "), (SubLObject)SubLObjectFactory.makeString("-"), (SubLObject)SubLObjectFactory.makeString("/"), (SubLObject)SubLObjectFactory.makeString(" "), (SubLObject)SubLObjectFactory.makeString(", "), (SubLObject)SubLObjectFactory.makeString(","), (SubLObject)SubLObjectFactory.makeString(". "), (SubLObject)SubLObjectFactory.makeString("."));
        $ic159$ = SubLObjectFactory.makeSymbol("S#41237", "CYC");
        $ic160$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(":"));
        $ic161$ = SubLObjectFactory.makeInteger(1800);
        $ic162$ = SubLObjectFactory.makeInteger(2200);
        $ic163$ = SubLObjectFactory.makeSymbol("S#4798", "CYC");
        $ic164$ = SubLObjectFactory.makeInteger(2000);
        $ic165$ = SubLObjectFactory.makeInteger(1900);
        $ic166$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("YEAR")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("YEAR"), (SubLObject)SubLObjectFactory.makeKeyword("MONTH-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("DAY")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("YEAR"), (SubLObject)SubLObjectFactory.makeKeyword("MONTH-NUM"), (SubLObject)SubLObjectFactory.makeKeyword("DAY")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("YEAR"), (SubLObject)SubLObjectFactory.makeKeyword("MONTH-NAME")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("YEAR"), (SubLObject)SubLObjectFactory.makeKeyword("MONTH-NUM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("YEAR"), (SubLObject)SubLObjectFactory.makeKeyword("DAY"), (SubLObject)SubLObjectFactory.makeKeyword("MONTH-NAME")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MONTH-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("DAY"), (SubLObject)SubLObjectFactory.makeKeyword("INDEXICAL-YEAR")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MONTH-NUM"), (SubLObject)SubLObjectFactory.makeKeyword("DAY"), (SubLObject)SubLObjectFactory.makeKeyword("INDEXICAL-YEAR")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MONTH-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("YEAR")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MONTH-NUM"), (SubLObject)SubLObjectFactory.makeKeyword("YEAR")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TIME"), (SubLObject)SubLObjectFactory.makeKeyword("MONTH-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("DAY"), (SubLObject)SubLObjectFactory.makeKeyword("YEAR")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MONTH-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("DAY"), (SubLObject)SubLObjectFactory.makeKeyword("YEAR")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TIME"), (SubLObject)SubLObjectFactory.makeKeyword("MONTH-NUM"), (SubLObject)SubLObjectFactory.makeKeyword("DAY"), (SubLObject)SubLObjectFactory.makeKeyword("YEAR")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MONTH-NUM"), (SubLObject)SubLObjectFactory.makeKeyword("DAY"), (SubLObject)SubLObjectFactory.makeKeyword("YEAR")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DAY"), (SubLObject)SubLObjectFactory.makeKeyword("MONTH-NUM"), (SubLObject)SubLObjectFactory.makeKeyword("YEAR")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TIME"), (SubLObject)SubLObjectFactory.makeKeyword("DAY"), (SubLObject)SubLObjectFactory.makeKeyword("MONTH-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("YEAR")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DAY"), (SubLObject)SubLObjectFactory.makeKeyword("MONTH-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("YEAR")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DAY-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("DAY"), (SubLObject)SubLObjectFactory.makeKeyword("MONTH-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("YEAR"), (SubLObject)SubLObjectFactory.makeKeyword("TIME"), (SubLObject)SubLObjectFactory.makeKeyword("TIME-ZONE")) });
        $ic167$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MONTH-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("DAY"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN-YEAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MONTH-NUM"), (SubLObject)SubLObjectFactory.makeKeyword("DAY"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN-YEAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MONTH-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("YEAR"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN-DAY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MONTH-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN-YEAR")));
        $ic168$ = SubLObjectFactory.makeString("of");
        $ic169$ = SubLObjectFactory.makeString("");
        $ic170$ = SubLObjectFactory.makeKeyword("UNKNOWN-YEAR");
        $ic171$ = SubLObjectFactory.makeKeyword("UNKNOWN-DAY");
        $ic172$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic173$ = SubLObjectFactory.makeSymbol("?YEAR");
        $ic174$ = SubLObjectFactory.makeSymbol("?DAY");
        $ic175$ = SubLObjectFactory.makeKeyword("YEAR");
        $ic176$ = SubLObjectFactory.makeKeyword("MONTH");
        $ic177$ = SubLObjectFactory.makeKeyword("MONTH-NAME");
        $ic178$ = SubLObjectFactory.makeKeyword("DAY-NAME");
        $ic179$ = SubLObjectFactory.makeKeyword("TIME");
        $ic180$ = SubLObjectFactory.makeKeyword("TIME-ZONE");
        $ic181$ = SubLObjectFactory.makeKeyword("MONTH-NUM");
        $ic182$ = SubLObjectFactory.makeKeyword("DAY");
        $ic183$ = SubLObjectFactory.makeSymbol("S#41227", "CYC");
        $ic184$ = SubLObjectFactory.makeSymbol("S#41229", "CYC");
        $ic185$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeString("one"), (SubLObject)module0612.ONE_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("two"), (SubLObject)module0612.TWO_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("three"), (SubLObject)module0612.THREE_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("four"), (SubLObject)module0612.FOUR_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("five"), (SubLObject)module0612.FIVE_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("six"), (SubLObject)module0612.SIX_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("seven"), (SubLObject)module0612.SEVEN_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("eight"), (SubLObject)module0612.EIGHT_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("nine"), (SubLObject)module0612.NINE_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ten"), (SubLObject)module0612.TEN_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("eleven"), (SubLObject)module0612.ELEVEN_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twelve"), (SubLObject)module0612.TWELVE_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("thirteen"), (SubLObject)module0612.THIRTEEN_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("fourteen"), (SubLObject)module0612.FOURTEEN_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("fifteen"), (SubLObject)module0612.FIFTEEN_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sixteen"), (SubLObject)module0612.SIXTEEN_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("seventeen"), (SubLObject)module0612.SEVENTEEN_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("eighteen"), (SubLObject)module0612.EIGHTEEN_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("nineteen"), (SubLObject)module0612.NINETEEN_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty"), (SubLObject)module0612.TWENTY_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty-one"), (SubLObject)SubLObjectFactory.makeInteger(21)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty-two"), (SubLObject)SubLObjectFactory.makeInteger(22)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty-three"), (SubLObject)SubLObjectFactory.makeInteger(23)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty-four"), (SubLObject)SubLObjectFactory.makeInteger(24)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty-five"), (SubLObject)SubLObjectFactory.makeInteger(25)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty-six"), (SubLObject)SubLObjectFactory.makeInteger(26)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty-seven"), (SubLObject)SubLObjectFactory.makeInteger(27)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty-eight"), (SubLObject)SubLObjectFactory.makeInteger(28)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty-nine"), (SubLObject)SubLObjectFactory.makeInteger(29)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("thirty"), (SubLObject)SubLObjectFactory.makeInteger(30)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("thirty-one"), (SubLObject)SubLObjectFactory.makeInteger(31)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty one"), (SubLObject)SubLObjectFactory.makeInteger(21)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty two"), (SubLObject)SubLObjectFactory.makeInteger(22)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty three"), (SubLObject)SubLObjectFactory.makeInteger(23)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty four"), (SubLObject)SubLObjectFactory.makeInteger(24)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty five"), (SubLObject)SubLObjectFactory.makeInteger(25)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty six"), (SubLObject)SubLObjectFactory.makeInteger(26)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty seven"), (SubLObject)SubLObjectFactory.makeInteger(27)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty eight"), (SubLObject)SubLObjectFactory.makeInteger(28)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty nine"), (SubLObject)SubLObjectFactory.makeInteger(29)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("thirty one"), (SubLObject)SubLObjectFactory.makeInteger(31)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("first"), (SubLObject)module0612.ONE_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("second"), (SubLObject)module0612.TWO_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("third"), (SubLObject)module0612.THREE_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("fourth"), (SubLObject)module0612.FOUR_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("fifth"), (SubLObject)module0612.FIVE_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sixth"), (SubLObject)module0612.SIX_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("seventh"), (SubLObject)module0612.SEVEN_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("eighth"), (SubLObject)module0612.EIGHT_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ninth"), (SubLObject)module0612.NINE_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("tenth"), (SubLObject)module0612.TEN_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("eleventh"), (SubLObject)module0612.ELEVEN_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twelfth"), (SubLObject)module0612.TWELVE_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("thirteenth"), (SubLObject)module0612.THIRTEEN_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("fourteenth"), (SubLObject)module0612.FOURTEEN_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("fifteenth"), (SubLObject)module0612.FIFTEEN_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sixteenth"), (SubLObject)module0612.SIXTEEN_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("seventeenth"), (SubLObject)module0612.SEVENTEEN_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("eighteenth"), (SubLObject)module0612.EIGHTEEN_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("nineteenth"), (SubLObject)module0612.NINETEEN_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twentieth"), (SubLObject)module0612.TWENTY_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty-first"), (SubLObject)SubLObjectFactory.makeInteger(21)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty-second"), (SubLObject)SubLObjectFactory.makeInteger(22)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty-third"), (SubLObject)SubLObjectFactory.makeInteger(23)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty-fourth"), (SubLObject)SubLObjectFactory.makeInteger(24)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty-fifth"), (SubLObject)SubLObjectFactory.makeInteger(25)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty-sixth"), (SubLObject)SubLObjectFactory.makeInteger(26)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty-seventh"), (SubLObject)SubLObjectFactory.makeInteger(27)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty-eighth"), (SubLObject)SubLObjectFactory.makeInteger(28)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty-ninth"), (SubLObject)SubLObjectFactory.makeInteger(29)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("thirtieth"), (SubLObject)SubLObjectFactory.makeInteger(30)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("thirty-first"), (SubLObject)SubLObjectFactory.makeInteger(31)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty first"), (SubLObject)SubLObjectFactory.makeInteger(21)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty second"), (SubLObject)SubLObjectFactory.makeInteger(22)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty third"), (SubLObject)SubLObjectFactory.makeInteger(23)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty fourth"), (SubLObject)SubLObjectFactory.makeInteger(24)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty fifth"), (SubLObject)SubLObjectFactory.makeInteger(25)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty sixth"), (SubLObject)SubLObjectFactory.makeInteger(26)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty seventh"), (SubLObject)SubLObjectFactory.makeInteger(27)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty eighth"), (SubLObject)SubLObjectFactory.makeInteger(28)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("twenty ninth"), (SubLObject)SubLObjectFactory.makeInteger(29)), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("thirty first"), (SubLObject)SubLObjectFactory.makeInteger(31)) });
        $ic186$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic187$ = SubLObjectFactory.makeInteger(32);
        $ic188$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("January"), (SubLObject)SubLObjectFactory.makeString("Jan"));
        $ic189$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("February"), (SubLObject)SubLObjectFactory.makeString("Feb"));
        $ic190$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("March"), (SubLObject)SubLObjectFactory.makeString("mar"));
        $ic191$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("April"), (SubLObject)SubLObjectFactory.makeString("Apr"));
        $ic192$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("May"));
        $ic193$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("June"), (SubLObject)SubLObjectFactory.makeString("Jun"));
        $ic194$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("July"), (SubLObject)SubLObjectFactory.makeString("Jul"));
        $ic195$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("August"), (SubLObject)SubLObjectFactory.makeString("Aug"));
        $ic196$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("September"), (SubLObject)SubLObjectFactory.makeString("Sept"), (SubLObject)SubLObjectFactory.makeString("Sep"));
        $ic197$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("October"), (SubLObject)SubLObjectFactory.makeString("Oct"));
        $ic198$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("November"), (SubLObject)SubLObjectFactory.makeString("Nov"));
        $ic199$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("December"), (SubLObject)SubLObjectFactory.makeString("Dec"));
        $ic200$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Sunday"), SubLObjectFactory.makeString("Sun"), SubLObjectFactory.makeString("Monday"), SubLObjectFactory.makeString("Mon"), SubLObjectFactory.makeString("Tuesday"), SubLObjectFactory.makeString("Tue"), SubLObjectFactory.makeString("Wednesday"), SubLObjectFactory.makeString("Wed"), SubLObjectFactory.makeString("Thursday"), SubLObjectFactory.makeString("Thu"), SubLObjectFactory.makeString("Friday"), SubLObjectFactory.makeString("Fri"), SubLObjectFactory.makeString("Saturday"), SubLObjectFactory.makeString("Sat") });
        $ic201$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("UT"), SubLObjectFactory.makeString("GMT"), SubLObjectFactory.makeString("EST"), SubLObjectFactory.makeString("EDT"), SubLObjectFactory.makeString("CST"), SubLObjectFactory.makeString("CDT"), SubLObjectFactory.makeString("MST"), SubLObjectFactory.makeString("MDT"), SubLObjectFactory.makeString("PST"), SubLObjectFactory.makeString("PDT"), SubLObjectFactory.makeString("Z") });
        $ic202$ = SubLObjectFactory.makeSymbol("DIGIT-CHAR-P");
        $ic203$ = ConsesLow.list((SubLObject)Characters.CHAR_hyphen, (SubLObject)Characters.CHAR_plus);
        $ic204$ = SubLObjectFactory.makeSymbol("S#41240", "CYC");
        $ic205$ = SubLObjectFactory.makeSymbol("S#3982", "CYC");
        $ic206$ = SubLObjectFactory.makeString("XML-datetime");
        $ic207$ = SubLObjectFactory.makeString("~D-~2,'0D-~2,'0DT~2,'0D:~2,'0D:~2,'0DZ");
        $ic208$ = SubLObjectFactory.makeString("MySQL-datetime");
        $ic209$ = SubLObjectFactory.makeString("~D-~2,'0D-~2,'0D ~2,'0D:~2,'0D:~2,'0D");
        $ic210$ = SubLObjectFactory.makeString("YYYYMMDD");
        $ic211$ = SubLObjectFactory.makeString("~D~2,'0D~2,'0D");
        $ic212$ = SubLObjectFactory.makeString("HHMMSS");
        $ic213$ = SubLObjectFactory.makeString("~2,'0D~2,'0D~2,'0D");
        $ic214$ = SubLObjectFactory.makeString("HH:MM:SS");
        $ic215$ = SubLObjectFactory.makeString("~2,'0D:~2,'0D:~2,'0D");
        $ic216$ = SubLObjectFactory.makeString("YYYYMMDDHHMM");
        $ic217$ = SubLObjectFactory.makeString("~4,'0D~2,'0D~2,'0D~2,'0D~2,'0D");
        $ic218$ = SubLObjectFactory.makeString("YYYY-MM-DD HH:MM:SS");
        $ic219$ = SubLObjectFactory.makeString("YYYY-MM-DDTHH:MM:SS");
        $ic220$ = SubLObjectFactory.makeString("YYYYMMDDHHMMSS");
        $ic221$ = SubLObjectFactory.makeString("~D-~2,'0D-~2,'0DT~2,'0D:~2,'0D:~2,'0D");
        $ic222$ = SubLObjectFactory.makeString("~4,'0D~2,'0D~2,'0D~2,'0D~2,'0D~2,'0D");
        $ic223$ = SubLObjectFactory.makeString("YYYY-MM-DD");
        $ic224$ = SubLObjectFactory.makeString("~D-~2,'0D-~2,'0D");
        $ic225$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("YYYY-MM-DD HH:MM:SS.S"), (SubLObject)SubLObjectFactory.makeString("YYYY-MM-DDTHH:MM:SS"));
        $ic226$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("-"), (SubLObject)SubLObjectFactory.makeString(" "), (SubLObject)SubLObjectFactory.makeString(":"), (SubLObject)SubLObjectFactory.makeString("."));
        $ic227$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#13593", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13591", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13592", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9940", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#40068", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("S#41272", "CYC"));
        $ic228$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("-"), (SubLObject)SubLObjectFactory.makeString(" "), (SubLObject)SubLObjectFactory.makeString(":"), (SubLObject)SubLObjectFactory.makeString("."), (SubLObject)SubLObjectFactory.makeString("T"), (SubLObject)SubLObjectFactory.makeString("t"));
        $ic229$ = SubLObjectFactory.makeSymbol("S#20107", "CYC");
        $ic230$ = SubLObjectFactory.makeString("D");
        $ic231$ = SubLObjectFactory.makeString("H:MM:SS");
        $ic232$ = SubLObjectFactory.makeString("~D:~2,'0D:~2,'0D");
        $ic233$ = SubLObjectFactory.makeString("HHMM");
        $ic234$ = SubLObjectFactory.makeString("~2,'0D~2,'0D");
        $ic235$ = SubLObjectFactory.makeString(":cont");
        $ic236$ = SubLObjectFactory.makeString("The template ~A is not currently handled.");
        $ic237$ = ConsesLow.list((SubLObject)Characters.CHAR_colon);
    }
    
    public static final class $f37383$UnaryFunction extends UnaryFunction
    {
        public $f37383$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#41089"));
        }
        
        public SubLObject processItem(final SubLObject var7) {
            return module0612.f37383(var7);
        }
    }
    
    public static final class $f37473$UnaryFunction extends UnaryFunction
    {
        public $f37473$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34877"));
        }
        
        public SubLObject processItem(final SubLObject var7) {
            return module0612.f37473(var7);
        }
    }
    
    public static final class $f37527$ZeroArityFunction extends ZeroArityFunction
    {
        public $f37527$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#31692"));
        }
        
        public SubLObject processItem() {
            return module0612.f37527();
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0612.class
	Total time: 1380 ms
	
	Decompiled with Procyon 0.5.32.
*/