package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0538 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0538";
    public static final String myFingerPrint = "93353c7775fc18430ae9840a33f380525e3ebec384d47cbe6be30b3061593636";
    private static SubLSymbol $g3920$;
    public static SubLSymbol $g3921$;
    public static SubLSymbol $g3922$;
    public static SubLSymbol $g3923$;
    public static SubLSymbol $g3924$;
    private static SubLSymbol $g3925$;
    public static SubLSymbol $g3926$;
    private static SubLSymbol $g3928$;
    public static SubLSymbol $g3929$;
    public static SubLSymbol $g3930$;
    public static SubLSymbol $g3931$;
    public static SubLSymbol $g3932$;
    private static SubLSymbol $g3933$;
    private static SubLSymbol $g3934$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLString $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLString $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLString $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLObject $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLObject $ic59$;
    private static final SubLObject $ic60$;
    private static final SubLObject $ic61$;
    private static final SubLObject $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLObject $ic64$;
    private static final SubLObject $ic65$;
    private static final SubLObject $ic66$;
    private static final SubLObject $ic67$;
    private static final SubLList $ic68$;
    private static final SubLObject $ic69$;
    private static final SubLObject $ic70$;
    private static final SubLList $ic71$;
    private static final SubLObject $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLList $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLObject $ic79$;
    private static final SubLObject $ic80$;
    private static final SubLObject $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLString $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLString $ic90$;
    private static final SubLList $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLList $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLString $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLList $ic103$;
    private static final SubLString $ic104$;
    private static final SubLList $ic105$;
    private static final SubLString $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLList $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLObject $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLString $ic117$;
    private static final SubLObject $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLString $ic120$;
    private static final SubLList $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLString $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLObject $ic126$;
    private static final SubLString $ic127$;
    private static final SubLString $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLString $ic130$;
    private static final SubLList $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLString $ic136$;
    private static final SubLString $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLList $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLList $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLString $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLString $ic151$;
    private static final SubLString $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLString $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLList $ic157$;
    private static final SubLString $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLList $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLString $ic163$;
    private static final SubLList $ic164$;
    private static final SubLString $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLList $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLString $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLString $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLString $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLList $ic181$;
    private static final SubLString $ic182$;
    private static final SubLList $ic183$;
    private static final SubLString $ic184$;
    private static final SubLList $ic185$;
    private static final SubLString $ic186$;
    private static final SubLObject $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLList $ic190$;
    private static final SubLList $ic191$;
    private static final SubLString $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLString $ic194$;
    private static final SubLString $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLList $ic197$;
    private static final SubLString $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLString $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLString $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLList $ic206$;
    private static final SubLString $ic207$;
    private static final SubLSymbol $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLList $ic210$;
    private static final SubLString $ic211$;
    private static final SubLString $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLList $ic215$;
    private static final SubLString $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLList $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLList $ic220$;
    private static final SubLList $ic221$;
    private static final SubLList $ic222$;
    private static final SubLList $ic223$;
    private static final SubLList $ic224$;
    private static final SubLList $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLObject $ic227$;
    private static final SubLObject $ic228$;
    private static final SubLObject $ic229$;
    private static final SubLObject $ic230$;
    private static final SubLSymbol $ic231$;
    private static final SubLSymbol $ic232$;
    private static final SubLObject $ic233$;
    private static final SubLSymbol $ic234$;
    private static final SubLList $ic235$;
    private static final SubLSymbol $ic236$;
    private static final SubLSymbol $ic237$;
    private static final SubLList $ic238$;
    private static final SubLSymbol $ic239$;
    private static final SubLString $ic240$;
    private static final SubLSymbol $ic241$;
    private static final SubLString $ic242$;
    private static final SubLSymbol $ic243$;
    private static final SubLSymbol $ic244$;
    private static final SubLSymbol $ic245$;
    private static final SubLSymbol $ic246$;
    private static final SubLString $ic247$;
    private static final SubLString $ic248$;
    private static final SubLString $ic249$;
    private static final SubLSymbol $ic250$;
    private static final SubLSymbol $ic251$;
    private static final SubLSymbol $ic252$;
    private static final SubLSymbol $ic253$;
    private static final SubLSymbol $ic254$;
    private static final SubLSymbol $ic255$;
    private static final SubLSymbol $ic256$;
    private static final SubLSymbol $ic257$;
    private static final SubLSymbol $ic258$;
    private static final SubLInteger $ic259$;
    private static final SubLSymbol $ic260$;
    private static final SubLList $ic261$;
    private static final SubLSymbol $ic262$;
    private static final SubLSymbol $ic263$;
    private static final SubLSymbol $ic264$;
    private static final SubLSymbol $ic265$;
    
    
    public static SubLObject f33316() {
        f33317();
        f33318();
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33319(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0538.$ic1$, (SubLObject)module0538.$ic2$, ConsesLow.append(var5, (SubLObject)module0538.NIL));
    }
    
    public static SubLObject f33318() {
        module0538.$g3921$.setDynamicValue((SubLObject)module0538.NIL);
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33320(final SubLObject var6) {
        module0538.$g3921$.setDynamicValue(var6);
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33321() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean(module0538.$g3921$.getDynamicValue(var7));
    }
    
    public static SubLObject f33322() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return module0538.$g3921$.getDynamicValue(var7);
    }
    
    public static SubLObject f33317() {
        module0538.$g3922$.setDynamicValue((SubLObject)module0538.NIL);
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33323(final SubLObject var8) {
        module0538.$g3922$.setDynamicValue(var8);
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33324() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean(module0538.$g3922$.getDynamicValue(var7));
    }
    
    public static SubLObject f33325() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return module0538.$g3922$.getDynamicValue(var7);
    }
    
    public static SubLObject f33326(final SubLObject var8) {
        SubLObject var9 = (SubLObject)module0538.NIL;
        if (conses_high.second(var8).isString()) {
            var9 = Functions.apply(Symbols.symbol_function((SubLObject)module0538.$ic5$), (SubLObject)module0538.NIL, new SubLObject[] { conses_high.second(var8), conses_high.nthcdr((SubLObject)module0538.TWO_INTEGER, var8) });
        }
        else {
            var9 = PrintLow.format((SubLObject)module0538.NIL, (SubLObject)module0538.$ic6$, var8.first());
        }
        return var9;
    }
    
    public static SubLObject f33327() {
        return f33326(f33325());
    }
    
    public static SubLObject f33328(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0538.$ic1$, (SubLObject)module0538.$ic9$, ConsesLow.append(var5, (SubLObject)module0538.NIL));
    }
    
    public static SubLObject f33329() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return module0538.$g3925$.getDynamicValue(var7);
    }
    
    public static SubLObject f33330(final SubLObject var12, SubLObject var13, SubLObject var14, SubLObject var15, SubLObject var16, SubLObject var17, SubLObject var18, SubLObject var19, SubLObject var20) {
        if (var13 == module0538.UNPROVIDED) {
            var13 = module0012.$g49$.getGlobalValue();
        }
        if (var14 == module0538.UNPROVIDED) {
            var14 = module0012.$g49$.getGlobalValue();
        }
        if (var15 == module0538.UNPROVIDED) {
            var15 = module0012.$g49$.getGlobalValue();
        }
        if (var16 == module0538.UNPROVIDED) {
            var16 = module0012.$g49$.getGlobalValue();
        }
        if (var17 == module0538.UNPROVIDED) {
            var17 = module0012.$g49$.getGlobalValue();
        }
        if (var18 == module0538.UNPROVIDED) {
            var18 = module0012.$g49$.getGlobalValue();
        }
        if (var19 == module0538.UNPROVIDED) {
            var19 = module0012.$g49$.getGlobalValue();
        }
        if (var20 == module0538.UNPROVIDED) {
            var20 = module0012.$g49$.getGlobalValue();
        }
        final SubLObject var21 = conses_high.assoc(var12, module0538.$g3920$.getGlobalValue(), (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
        SubLObject var23;
        final SubLObject var22 = var23 = var21.rest();
        SubLObject var24 = (SubLObject)module0538.NIL;
        SubLObject var25 = (SubLObject)module0538.NIL;
        SubLObject var26 = (SubLObject)module0538.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0538.$ic10$);
        var24 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0538.$ic10$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0538.$ic10$);
        var26 = var23.first();
        var23 = var23.rest();
        if (module0538.NIL == var23) {
            SubLObject var27 = (SubLObject)module0538.NIL;
            SubLObject var28 = (SubLObject)module0538.NIL;
            if (module0538.NIL != var24 && module0538.NIL != var25) {
                if (module0538.NIL != module0012.f421(var13)) {
                    var27 = (SubLObject)ConsesLow.list(var24);
                }
                else if (module0538.NIL != module0012.f421(var14)) {
                    var27 = (SubLObject)ConsesLow.list(var24, (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var13));
                }
                else if (module0538.NIL != module0012.f421(var15)) {
                    var27 = (SubLObject)ConsesLow.list(var24, (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var13), (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var14));
                }
                else if (module0538.NIL != module0012.f421(var16)) {
                    var27 = (SubLObject)ConsesLow.list(var24, (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var13), (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var14), (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var15));
                }
                else if (module0538.NIL != module0012.f421(var17)) {
                    var27 = (SubLObject)ConsesLow.list(var24, (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var13), (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var14), (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var15), (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var16));
                }
                else if (module0538.NIL != module0012.f421(var18)) {
                    var27 = (SubLObject)ConsesLow.list(var24, (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var13), (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var14), (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var15), (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var16), (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var17));
                }
                else if (module0538.NIL != module0012.f421(var19)) {
                    var27 = (SubLObject)ConsesLow.list(var24, (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var13), (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var14), (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var15), (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var16), (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var17), (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var18));
                }
                else if (module0538.NIL != module0012.f421(var20)) {
                    var27 = (SubLObject)ConsesLow.list(var24, (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var13), (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var14), (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var15), (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var16), (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var17), (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var18), (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var19));
                }
                else {
                    var27 = (SubLObject)ConsesLow.list(new SubLObject[] { var24, ConsesLow.list((SubLObject)module0538.$ic11$, var13), ConsesLow.list((SubLObject)module0538.$ic11$, var14), ConsesLow.list((SubLObject)module0538.$ic11$, var15), ConsesLow.list((SubLObject)module0538.$ic11$, var16), ConsesLow.list((SubLObject)module0538.$ic11$, var17), ConsesLow.list((SubLObject)module0538.$ic11$, var18), ConsesLow.list((SubLObject)module0538.$ic11$, var19), ConsesLow.list((SubLObject)module0538.$ic11$, var20) });
                }
                var27 = module0280.f18631(var27);
                var28 = module0035.f2151((SubLObject)module0538.ZERO_INTEGER, var25, var27);
            }
            else {
                Errors.error((SubLObject)module0538.$ic12$, new SubLObject[] { var12, var13, var14, var15, var16, var17, var18, var19, var20, var12 });
            }
            return f33331(var27, var28, var26);
        }
        cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0538.$ic10$);
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33331(final SubLObject var27, final SubLObject var28, final SubLObject var26) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (module0538.NIL != module0111.$g1406$.getDynamicValue(var29)) {
            module0575.f35284(var27, (SubLObject)module0538.T);
            return (SubLObject)module0538.$ic13$;
        }
        SubLObject var30 = (SubLObject)module0538.NIL;
        SubLObject var31 = (SubLObject)module0538.NIL;
        SubLObject var32 = (SubLObject)module0538.NIL;
        SubLObject var33 = (SubLObject)module0538.NIL;
        SubLObject var34 = (SubLObject)module0538.NIL;
        if (module0538.NIL != var26 && module0538.NIL != module0018.$g689$.getDynamicValue(var29)) {
            var34 = module0290.f19505(var27);
        }
        final SubLObject var35 = module0131.$g1540$.currentBinding(var29);
        final SubLObject var36 = module0131.$g1541$.currentBinding(var29);
        final SubLObject var37 = module0538.$g3926$.currentBinding(var29);
        try {
            module0131.$g1540$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0538.NIL != module0575.$g3927$.getDynamicValue(var29) && module0538.NIL != var26 && module0538.NIL != module0018.$g689$.getDynamicValue(var29)), var29);
            module0131.$g1541$.bind((SubLObject)module0538.NIL, var29);
            module0538.$g3926$.bind((module0538.NIL != module0538.$g3926$.getDynamicValue(var29)) ? module0538.$g3926$.getDynamicValue(var29) : var28.first(), var29);
            var29.resetMultipleValues();
            final SubLObject var38 = Eval.eval(var28);
            final SubLObject var39 = var29.secondMultipleValue();
            final SubLObject var40 = var29.thirdMultipleValue();
            final SubLObject var41 = var29.fourthMultipleValue();
            var29.resetMultipleValues();
            var30 = var38;
            var31 = var39;
            var32 = var40;
            var33 = var41;
            if (module0538.NIL == f33324() && module0538.NIL != var26 && module0538.NIL != module0018.$g689$.getDynamicValue(var29) && module0538.NIL != var34) {
                final SubLObject var42 = var34.first();
                if (var42.eql((SubLObject)module0538.$ic14$) || var42.eql((SubLObject)module0538.$ic15$)) {
                    SubLObject var44;
                    final SubLObject var43 = var44 = var34;
                    SubLObject var45 = (SubLObject)module0538.NIL;
                    SubLObject var46 = (SubLObject)module0538.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var44, var43, (SubLObject)module0538.$ic16$);
                    var45 = var44.first();
                    var44 = var44.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var44, var43, (SubLObject)module0538.$ic16$);
                    var46 = var44.first();
                    var44 = var44.rest();
                    final SubLObject var47 = (SubLObject)(var44.isCons() ? var44.first() : module0538.NIL);
                    cdestructuring_bind.destructuring_bind_must_listp(var44, var43, (SubLObject)module0538.$ic16$);
                    var44 = var44.rest();
                    if (module0538.NIL == var44) {
                        if (module0538.NIL == var47 || var47.equal((SubLObject)module0538.$ic17$)) {
                            final SubLObject var48 = var30;
                            var34 = (SubLObject)ConsesLow.list(var45, var46, constants_high_oc.f10757(var48));
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var43, (SubLObject)module0538.$ic16$);
                    }
                }
                else if (var42.eql((SubLObject)module0538.$ic18$)) {
                    SubLObject var50;
                    final SubLObject var49 = var50 = var34;
                    SubLObject var45 = (SubLObject)module0538.NIL;
                    SubLObject var51 = (SubLObject)module0538.NIL;
                    SubLObject var52 = (SubLObject)module0538.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var50, var49, (SubLObject)module0538.$ic19$);
                    var45 = var50.first();
                    var50 = var50.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var50, var49, (SubLObject)module0538.$ic19$);
                    var51 = var50.first();
                    var50 = var50.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var50, var49, (SubLObject)module0538.$ic19$);
                    var52 = var50.first();
                    var50 = var50.rest();
                    final SubLObject var53 = (SubLObject)(var50.isCons() ? var50.first() : module0538.$ic20$);
                    cdestructuring_bind.destructuring_bind_must_listp(var50, var49, (SubLObject)module0538.$ic19$);
                    var50 = var50.rest();
                    final SubLObject var54 = (SubLObject)(var50.isCons() ? var50.first() : module0538.NIL);
                    cdestructuring_bind.destructuring_bind_must_listp(var50, var49, (SubLObject)module0538.$ic19$);
                    var50 = var50.rest();
                    if (module0538.NIL == var50) {
                        if (module0538.NIL == var54 || var54.equal((SubLObject)module0538.$ic17$)) {
                            SubLObject var55 = var30;
                            if (module0538.NIL != var55 && module0538.NIL == module0233.f15393(var55)) {
                                SubLObject var56;
                                var55 = (var56 = conses_high.copy_tree(var55));
                                SubLObject var57 = (SubLObject)module0538.NIL;
                                var57 = var56.first();
                                while (module0538.NIL != var56) {
                                    ConsesLow.rplacd(var57, constants_high_oc.f10757(var57.rest()));
                                    var56 = var56.rest();
                                    var57 = var56.first();
                                }
                                var34 = (SubLObject)ConsesLow.list(var45, var51, var52, var53, (SubLObject)ConsesLow.list((SubLObject)module0538.$ic11$, var55));
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var49, (SubLObject)module0538.$ic19$);
                    }
                }
                f33332(var34);
            }
        }
        finally {
            module0538.$g3926$.rebind(var37, var29);
            module0131.$g1541$.rebind(var36, var29);
            module0131.$g1540$.rebind(var35, var29);
        }
        return Values.values(var30, var31, var32, var33);
    }
    
    public static SubLObject f33332(final SubLObject var33) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        module0575.f35295(var33);
        if (module0538.NIL != module0575.$g3927$.getDynamicValue(var34)) {
            if (module0538.NIL != module0575.f35296(var33)) {
                module0575.f35297(var33);
            }
            else {
                SubLObject var35 = Sequences.nreverse(module0131.$g1541$.getDynamicValue(var34));
                SubLObject var36 = (SubLObject)module0538.NIL;
                var36 = var35.first();
                while (module0538.NIL != var35) {
                    var36 = module0571.f34986(module0290.f19503(module0571.f34986(var36)));
                    module0575.f35297(var36);
                    var35 = var35.rest();
                    var36 = var35.first();
                }
            }
            return (SubLObject)module0538.T;
        }
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33333(final SubLObject var12, SubLObject var13, SubLObject var14, SubLObject var15, SubLObject var16, SubLObject var17, SubLObject var18, SubLObject var19, SubLObject var20) {
        if (var13 == module0538.UNPROVIDED) {
            var13 = module0012.$g49$.getGlobalValue();
        }
        if (var14 == module0538.UNPROVIDED) {
            var14 = module0012.$g49$.getGlobalValue();
        }
        if (var15 == module0538.UNPROVIDED) {
            var15 = module0012.$g49$.getGlobalValue();
        }
        if (var16 == module0538.UNPROVIDED) {
            var16 = module0012.$g49$.getGlobalValue();
        }
        if (var17 == module0538.UNPROVIDED) {
            var17 = module0012.$g49$.getGlobalValue();
        }
        if (var18 == module0538.UNPROVIDED) {
            var18 = module0012.$g49$.getGlobalValue();
        }
        if (var19 == module0538.UNPROVIDED) {
            var19 = module0012.$g49$.getGlobalValue();
        }
        if (var20 == module0538.UNPROVIDED) {
            var20 = module0012.$g49$.getGlobalValue();
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)module0538.NIL;
        SubLObject var23 = (SubLObject)module0538.NIL;
        SubLObject var24 = (SubLObject)module0538.NIL;
        SubLObject var25 = (SubLObject)module0538.NIL;
        final SubLObject var26 = module0111.$g1406$.currentBinding(var21);
        final SubLObject var27 = module0018.$g689$.currentBinding(var21);
        try {
            module0111.$g1406$.bind((SubLObject)module0538.NIL, var21);
            module0018.$g689$.bind((SubLObject)module0538.NIL, var21);
            var21.resetMultipleValues();
            final SubLObject var28 = f33330(var12, var13, var14, var15, var16, var17, var18, var19, var20);
            final SubLObject var29 = var21.secondMultipleValue();
            final SubLObject var30 = var21.thirdMultipleValue();
            final SubLObject var31 = var21.fourthMultipleValue();
            var21.resetMultipleValues();
            var22 = var28;
            var23 = var29;
            var24 = var30;
            var25 = var31;
        }
        finally {
            module0018.$g689$.rebind(var27, var21);
            module0111.$g1406$.rebind(var26, var21);
        }
        return Values.values(var22, var23, var24, var25);
    }
    
    public static SubLObject f33334() {
        return f33330((SubLObject)module0538.$ic21$, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33335() {
        return f33330((SubLObject)module0538.$ic25$, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33336(final SubLObject var45) {
        return f33330((SubLObject)module0538.$ic28$, var45, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33337(final SubLObject var45) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        f33316();
        if (!var45.isString()) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic34$, var45));
            return (SubLObject)module0538.NIL;
        }
        if (module0538.NIL == module0126.f8389(var45)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic35$, (SubLObject)module0538.$ic36$, var45));
            return (SubLObject)module0538.NIL;
        }
        SubLObject var47 = (SubLObject)module0538.NIL;
        final SubLObject var48 = module0538.$g3925$.currentBinding(var46);
        try {
            module0538.$g3925$.bind((SubLObject)module0538.T, var46);
            final SubLObject var49 = constants_high_oc.f10737(var45);
            var47 = (SubLObject)((module0538.NIL != constant_handles_oc.f8463(var49, (SubLObject)module0538.UNPROVIDED)) ? var49 : module0538.NIL);
        }
        finally {
            module0538.$g3925$.rebind(var48, var46);
        }
        return var47;
    }
    
    public static SubLObject f33338(final SubLObject var63, SubLObject var64) {
        if (var64 == module0538.UNPROVIDED) {
            var64 = (SubLObject)module0538.NIL;
        }
        return f33330((SubLObject)module0538.$ic37$, var63, var64, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33339(final SubLObject var63, SubLObject var64) {
        if (var64 == module0538.UNPROVIDED) {
            var64 = (SubLObject)module0538.NIL;
        }
        final SubLThread var65 = SubLProcess.currentSubLThread();
        f33316();
        if (!var63.isString()) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic34$, var63));
            return (SubLObject)module0538.NIL;
        }
        SubLObject var66 = (SubLObject)module0538.NIL;
        final SubLObject var67 = module0538.$g3925$.currentBinding(var65);
        try {
            module0538.$g3925$.bind((SubLObject)module0538.T, var65);
            final SubLObject var68 = var66 = module0126.f8393(var63, var64, (SubLObject)module0538.NIL, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
        }
        finally {
            module0538.$g3925$.rebind(var67, var65);
        }
        return var66;
    }
    
    public static SubLObject f33340(final SubLObject var45, SubLObject var46) {
        if (var46 == module0538.UNPROVIDED) {
            var46 = (SubLObject)module0538.NIL;
        }
        return f33330((SubLObject)module0538.$ic42$, var45, var46, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33341(SubLObject var45, SubLObject var46) {
        if (var46 == module0538.UNPROVIDED) {
            var46 = (SubLObject)module0538.NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        f33316();
        if (var45 != module0538.$ic46$) {
            if (!var45.isString()) {
                f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic34$, var45));
                return (SubLObject)module0538.NIL;
            }
            if (module0538.NIL == module0126.f8389(var45)) {
                f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic35$, (SubLObject)module0538.$ic36$, var45));
                return (SubLObject)module0538.NIL;
            }
            if (module0538.NIL != module0126.$g1496$.getDynamicValue(var47)) {
                final SubLObject var48 = module0126.f8399(var45);
                if (module0538.NIL != var48) {
                    final SubLObject var49 = module0126.f8395(var45, (SubLObject)module0538.UNPROVIDED);
                    f33320((SubLObject)ConsesLow.list((SubLObject)module0538.$ic47$, (SubLObject)module0538.$ic48$, var45, var49));
                    var45 = var49;
                }
            }
        }
        if (module0538.NIL != var46 && module0538.NIL == constants_high_oc.f10734(var46)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic49$, var46));
            return (SubLObject)module0538.NIL;
        }
        SubLObject var50 = (SubLObject)module0538.NIL;
        final SubLObject var51 = module0018.$g734$.currentBinding(var47);
        final SubLObject var52 = module0538.$g3925$.currentBinding(var47);
        try {
            module0018.$g734$.bind((SubLObject)module0538.T, var47);
            module0538.$g3925$.bind((SubLObject)module0538.T, var47);
            final SubLObject var53 = (SubLObject)(var45.isString() ? constants_high_oc.f10737(var45) : module0538.NIL);
            final SubLObject var54 = (SubLObject)((module0538.NIL != var46) ? constants_high_oc.f10751(var46) : module0538.NIL);
            if (module0538.NIL == var53 && module0538.NIL == var46) {
                final SubLObject var55 = constants_high_oc.f10735();
                var50 = constants_high_oc.f10733(var45, var55);
                module0538.$g3923$.setDynamicValue(var50, var47);
            }
            else if (module0538.NIL == var53 && module0538.NIL != var46 && module0538.NIL == var54) {
                var50 = constants_high_oc.f10733(var45, var46);
                module0538.$g3923$.setDynamicValue(var50, var47);
            }
            else if (module0538.NIL == var53 && module0538.NIL != var54) {
                var50 = f33342(var45, var46);
            }
            else if (module0538.NIL != var53 && module0538.NIL != var54 && module0538.NIL == module0213.f14081(var53, var54)) {
                var50 = f33342(var45, var46);
            }
            else if (module0538.NIL != var53 && module0538.NIL != var54 && module0538.NIL != module0213.f14081(var53, var54)) {
                var50 = var53;
            }
            else if (module0538.NIL != var53 && module0538.NIL == var54 && module0538.NIL != constants_high_oc.f10755(var53)) {
                final SubLObject var56 = (module0538.NIL != var46) ? var46 : constants_high_oc.f10735();
                var50 = constants_high_oc.f10733(var45, var56);
                module0538.$g3923$.setDynamicValue(var50, var47);
            }
            else if (module0538.NIL != var53 && module0538.NIL == var54) {
                final SubLObject var57 = module0126.f8395(var45, (SubLObject)module0538.UNPROVIDED);
                var50 = constants_high_oc.f10733(var57, var46);
                module0538.$g3923$.setDynamicValue(var50, var47);
                f33320((SubLObject)ConsesLow.list((SubLObject)module0538.$ic47$, (SubLObject)module0538.$ic48$, var45, var57));
            }
        }
        finally {
            module0538.$g3925$.rebind(var52, var47);
            module0018.$g734$.rebind(var51, var47);
        }
        module0426.f30150(var50);
        return var50;
    }
    
    public static SubLObject f33342(final SubLObject var67, final SubLObject var72) {
        f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic50$, (SubLObject)module0538.$ic51$, var72));
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33343(final SubLObject var45, SubLObject var46) {
        if (var46 == module0538.UNPROVIDED) {
            var46 = (SubLObject)module0538.NIL;
        }
        return f33330((SubLObject)module0538.$ic52$, var45, var46, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33344(final SubLObject var45, SubLObject var46) {
        if (var46 == module0538.UNPROVIDED) {
            var46 = (SubLObject)module0538.NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        f33316();
        if (!var45.isString()) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic34$, var45));
            return (SubLObject)module0538.NIL;
        }
        if (module0538.NIL == module0126.f8389(var45)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic35$, (SubLObject)module0538.$ic36$, var45));
            return (SubLObject)module0538.NIL;
        }
        if (module0538.NIL != var46 && module0538.NIL == constants_high_oc.f10734(var46)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic49$, var46));
            return (SubLObject)module0538.NIL;
        }
        SubLObject var48 = (SubLObject)module0538.NIL;
        final SubLObject var49 = module0538.$g3925$.currentBinding(var47);
        try {
            module0538.$g3925$.bind((SubLObject)module0538.T, var47);
            var48 = f33337(var45);
            if (module0538.NIL != f33324()) {
                var48 = (SubLObject)module0538.NIL;
            }
            else if (module0538.NIL == var48) {
                var48 = f33341(var45, var46);
            }
        }
        finally {
            module0538.$g3925$.rebind(var49, var47);
        }
        return var48;
    }
    
    public static SubLObject f33345(final SubLObject var46, final SubLObject var73, final SubLObject var51, final SubLObject var74, final SubLObject var75) {
        return f33330((SubLObject)module0538.$ic54$, var46, var73, module0162.f10628(var51), var74, var75, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33346(final SubLObject var46, final SubLObject var73, SubLObject var51, final SubLObject var74, SubLObject var75) {
        if (var75 == module0538.UNPROVIDED) {
            var75 = (SubLObject)module0538.NIL;
        }
        final SubLThread var76 = SubLProcess.currentSubLThread();
        f33316();
        if (module0538.NIL == constants_high_oc.f10734(var46)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic49$, var46));
            return (SubLObject)module0538.NIL;
        }
        var51 = f33347(var51);
        if (module0538.NIL != f33324()) {
            return (SubLObject)module0538.NIL;
        }
        SubLObject var77 = (SubLObject)module0538.NIL;
        final SubLObject var78 = module0528.f32898();
        assert module0538.NIL != module0055.f4006(var78) : var78;
        final SubLObject var79 = module0131.$g1538$.currentBinding(var76);
        try {
            module0131.$g1538$.bind(var78, var76);
            final SubLObject var34_78 = module0538.$g3925$.currentBinding(var76);
            try {
                module0538.$g3925$.bind((SubLObject)module0538.T, var76);
                var77 = f33341(f33348(var46), var46);
                if (module0538.NIL != constant_handles_oc.f8449(var77)) {
                    final SubLObject var80 = conses_high.second(var73);
                    final SubLObject var81 = module0287.f19159(var73);
                    final SubLObject var82 = Sequences.length(var80);
                    final SubLObject var83 = module0287.f19198(var82, var74);
                    final SubLObject var84 = module0287.f19178(var77, var73, var51, var74);
                    final SubLObject var85 = module0287.f19169(var73);
                    f33349((SubLObject)ConsesLow.list(module0538.$ic56$, var77, var85), var51, (SubLObject)module0538.$ic57$, (SubLObject)module0538.UNPROVIDED);
                    if (module0538.NIL != var81) {
                        f33349((SubLObject)ConsesLow.list(module0538.$ic58$, var77, var82), var51, (SubLObject)module0538.$ic57$, (SubLObject)module0538.UNPROVIDED);
                    }
                    else {
                        f33349((SubLObject)ConsesLow.list(module0538.$ic59$, var77, var82), var51, (SubLObject)module0538.$ic57$, (SubLObject)module0538.UNPROVIDED);
                    }
                    f33350(var77, var80, var75, var51);
                    f33351(var77, var74, var51);
                    module0287.f19234(var84, var83);
                }
                else {
                    f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic50$, (SubLObject)module0538.$ic51$, var46));
                }
            }
            finally {
                module0538.$g3925$.rebind(var34_78, var76);
            }
            if (module0538.NIL != f33324()) {
                var77 = (SubLObject)module0538.NIL;
            }
            if (module0538.NIL == f33324()) {
                module0528.f32921();
            }
        }
        finally {
            module0131.$g1538$.rebind(var79, var76);
        }
        return var77;
    }
    
    public static SubLObject f33350(final SubLObject var76, final SubLObject var79, final SubLObject var75, final SubLObject var51) {
        final SubLObject var80 = conses_high.assoc(var79.first(), var75, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED).rest();
        final SubLObject var81 = conses_high.assoc(conses_high.second(var79), var75, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED).rest();
        final SubLObject var82 = conses_high.assoc(conses_high.third(var79), var75, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED).rest();
        final SubLObject var83 = conses_high.assoc(conses_high.fourth(var79), var75, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED).rest();
        final SubLObject var84 = conses_high.assoc(conses_high.fifth(var79), var75, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED).rest();
        SubLObject var85 = var80;
        SubLObject var86 = (SubLObject)module0538.NIL;
        var86 = var85.first();
        while (module0538.NIL != var85) {
            f33349((SubLObject)ConsesLow.list(module0538.$ic60$, var76, var86), var51, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
            var85 = var85.rest();
            var86 = var85.first();
        }
        var85 = var81;
        var86 = (SubLObject)module0538.NIL;
        var86 = var85.first();
        while (module0538.NIL != var85) {
            f33349((SubLObject)ConsesLow.list(module0538.$ic61$, var76, var86), var51, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
            var85 = var85.rest();
            var86 = var85.first();
        }
        var85 = var82;
        var86 = (SubLObject)module0538.NIL;
        var86 = var85.first();
        while (module0538.NIL != var85) {
            f33349((SubLObject)ConsesLow.list(module0538.$ic62$, var76, var86), var51, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
            var85 = var85.rest();
            var86 = var85.first();
        }
        var85 = var83;
        var86 = (SubLObject)module0538.NIL;
        var86 = var85.first();
        while (module0538.NIL != var85) {
            f33349((SubLObject)ConsesLow.list(module0538.$ic63$, var76, var86), var51, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
            var85 = var85.rest();
            var86 = var85.first();
        }
        var85 = var84;
        var86 = (SubLObject)module0538.NIL;
        var86 = var85.first();
        while (module0538.NIL != var85) {
            f33349((SubLObject)ConsesLow.list(module0538.$ic64$, var76, var86), var51, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
            var85 = var85.rest();
            var86 = var85.first();
        }
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33351(final SubLObject var76, final SubLObject var74, final SubLObject var51) {
        final SubLThread var77 = SubLProcess.currentSubLThread();
        var77.resetMultipleValues();
        final SubLObject var78 = module0287.f19243(module0287.f19170(), var74, var51, (SubLObject)module0538.UNPROVIDED);
        final SubLObject var79 = var77.secondMultipleValue();
        final SubLObject var80 = var77.thirdMultipleValue();
        final SubLObject var81 = var77.fourthMultipleValue();
        var77.resetMultipleValues();
        SubLObject var82 = var78;
        SubLObject var83 = (SubLObject)module0538.NIL;
        var83 = var82.first();
        while (module0538.NIL != var82) {
            f33349((SubLObject)ConsesLow.list(module0538.$ic65$, var76, var83), var51, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
            var82 = var82.rest();
            var83 = var82.first();
        }
        var82 = var79;
        SubLObject var84 = (SubLObject)module0538.NIL;
        var84 = var82.first();
        while (module0538.NIL != var82) {
            f33349((SubLObject)ConsesLow.list(module0538.$ic66$, var76, var84), var51, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
            var82 = var82.rest();
            var84 = var82.first();
        }
        if (module0538.NIL != var80 && module0538.NIL == module0259.f16854(var76, module0538.$ic67$, var51, (SubLObject)module0538.UNPROVIDED)) {
            f33349((SubLObject)ConsesLow.listS(module0538.$ic56$, var76, (SubLObject)module0538.$ic68$), var51, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
        }
        var82 = var80;
        var83 = (SubLObject)module0538.NIL;
        var83 = var82.first();
        while (module0538.NIL != var82) {
            f33349((SubLObject)ConsesLow.list(module0538.$ic69$, var76, var83), var51, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
            var82 = var82.rest();
            var83 = var82.first();
        }
        if (module0538.NIL != var81 && module0538.NIL == module0259.f16854(var76, module0538.$ic70$, var51, (SubLObject)module0538.UNPROVIDED)) {
            f33349((SubLObject)ConsesLow.listS(module0538.$ic56$, var76, (SubLObject)module0538.$ic71$), var51, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
        }
        var82 = var81;
        var84 = (SubLObject)module0538.NIL;
        var84 = var82.first();
        while (module0538.NIL != var82) {
            f33349((SubLObject)ConsesLow.list(module0538.$ic72$, var76, var84), var51, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
            var82 = var82.rest();
            var84 = var82.first();
        }
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33348(final SubLObject var96) {
        if (var96.isString()) {
            return PrintLow.format((SubLObject)module0538.NIL, (SubLObject)module0538.$ic73$, var96);
        }
        if (var96.isInteger()) {
            return PrintLow.format((SubLObject)module0538.NIL, (SubLObject)module0538.$ic73$, var96);
        }
        return f33348(f33352());
    }
    
    public static SubLObject f33352() {
        return f33353();
    }
    
    public static SubLObject f33353() {
        final SubLObject var97 = Strings.make_string((SubLObject)module0538.TEN_INTEGER, (SubLObject)Characters.CHAR_0);
        SubLObject var98;
        for (var98 = (SubLObject)module0538.NIL, var98 = (SubLObject)module0538.ZERO_INTEGER; var98.numL((SubLObject)module0538.TEN_INTEGER); var98 = Numbers.add(var98, (SubLObject)module0538.ONE_INTEGER)) {
            Strings.set_char(var97, var98, Strings.sublisp_char((SubLObject)module0538.$ic74$, random.random((SubLObject)module0538.TEN_INTEGER)));
        }
        return var97;
    }
    
    public static SubLObject f33354(final SubLObject var99, final SubLObject var100) {
        return f33330((SubLObject)module0538.$ic75$, var99, var100, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33355(SubLObject var99, SubLObject var100) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        f33316();
        var99 = f33356(var99);
        if (module0538.NIL != f33324()) {
            return (SubLObject)module0538.NIL;
        }
        var100 = f33356(var100);
        if (module0538.NIL != f33324()) {
            return (SubLObject)module0538.NIL;
        }
        if (module0538.NIL != module0213.f14081(var100, var99)) {
            f33320((SubLObject)module0538.$ic76$);
            return (SubLObject)module0538.NIL;
        }
        SubLObject var102 = (SubLObject)module0538.NIL;
        final SubLObject var103 = module0528.f32898();
        assert module0538.NIL != module0055.f4006(var103) : var103;
        final SubLObject var104 = module0131.$g1538$.currentBinding(var101);
        final SubLObject var105 = module0538.$g3925$.currentBinding(var101);
        final SubLObject var106 = Errors.$continue_cerrorP$.currentBinding(var101);
        final SubLObject var107 = module0018.$g696$.currentBinding(var101);
        final SubLObject var108 = module0271.$g2562$.currentBinding(var101);
        final SubLObject var109 = module0144.$g1752$.currentBinding(var101);
        final SubLObject var110 = module0271.$g2560$.currentBinding(var101);
        final SubLObject var111 = module0271.$g2561$.currentBinding(var101);
        final SubLObject var112 = module0271.$g2563$.currentBinding(var101);
        final SubLObject var113 = module0146.$g2055$.currentBinding(var101);
        final SubLObject var114 = module0144.$g1771$.currentBinding(var101);
        final SubLObject var115 = module0144.$g1769$.currentBinding(var101);
        final SubLObject var116 = module0152.$g2107$.currentBinding(var101);
        final SubLObject var117 = module0110.$g1374$.currentBinding(var101);
        try {
            module0131.$g1538$.bind(var103, var101);
            module0538.$g3925$.bind((SubLObject)module0538.T, var101);
            Errors.$continue_cerrorP$.bind((SubLObject)module0538.T, var101);
            module0018.$g696$.bind((SubLObject)module0538.NIL, var101);
            module0271.$g2562$.bind((SubLObject)module0538.NIL, var101);
            module0144.$g1752$.bind((SubLObject)module0538.NIL, var101);
            module0271.$g2560$.bind((SubLObject)module0538.NIL, var101);
            module0271.$g2561$.bind((SubLObject)module0538.NIL, var101);
            module0271.$g2563$.bind((SubLObject)module0538.NIL, var101);
            module0146.$g2055$.bind((SubLObject)module0538.NIL, var101);
            module0144.$g1771$.bind((SubLObject)module0538.NIL, var101);
            module0144.$g1769$.bind((SubLObject)module0538.NIL, var101);
            module0152.$g2107$.bind((SubLObject)module0538.NIL, var101);
            module0110.$g1374$.bind((SubLObject)module0538.T, var101);
            var102 = f33357(var99, var100);
        }
        finally {
            module0110.$g1374$.rebind(var117, var101);
            module0152.$g2107$.rebind(var116, var101);
            module0144.$g1769$.rebind(var115, var101);
            module0144.$g1771$.rebind(var114, var101);
            module0146.$g2055$.rebind(var113, var101);
            module0271.$g2563$.rebind(var112, var101);
            module0271.$g2561$.rebind(var111, var101);
            module0271.$g2560$.rebind(var110, var101);
            module0144.$g1752$.rebind(var109, var101);
            module0271.$g2562$.rebind(var108, var101);
            module0018.$g696$.rebind(var107, var101);
            Errors.$continue_cerrorP$.rebind(var106, var101);
            module0538.$g3925$.rebind(var105, var101);
            module0131.$g1538$.rebind(var104, var101);
        }
        return var102;
    }
    
    public static SubLObject f33357(final SubLObject var99, final SubLObject var100) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        assert module0538.NIL != module0173.f10955(var99) : var99;
        assert module0538.NIL != module0173.f10955(var100) : var100;
        SubLObject var102 = module0279.f18605(var99);
        SubLObject var103 = (SubLObject)module0538.NIL;
        var103 = var102.first();
        while (module0538.NIL != var102) {
            if (module0538.NIL != oc_deduction_handles.f11671(var103, (SubLObject)module0538.UNPROVIDED)) {
                final SubLObject var104 = module0188.f11788(var103);
                final SubLObject var105 = module0178.f11282(var104);
                final SubLObject var106 = module0178.f11287(var104);
                final SubLObject var107 = module0188.f11770(var103);
                module0195.f12228(var105, var106, var107);
            }
            var102 = var102.rest();
            var103 = var102.first();
        }
        var102 = module0279.f18603(var99);
        SubLObject var108 = (SubLObject)module0538.NIL;
        var108 = var102.first();
        while (module0538.NIL != var102) {
            if (module0538.NIL != assertion_handles_oc.f11041(var108, (SubLObject)module0538.UNPROVIDED) && module0538.NIL == module0178.f11324(var108)) {
                final SubLObject var109 = module0178.f11282(var108);
                final SubLObject var110 = module0178.f11287(var108);
                module0195.f12220(var109, var110);
            }
            var102 = var102.rest();
            var108 = var102.first();
        }
        f33358(var99, var100);
        f33359(var99, var100);
        final SubLObject var111 = module0538.$g3928$.currentBinding(var101);
        try {
            module0538.$g3928$.bind(f33360(module0217.f14357(var99)), var101);
            SubLObject var112 = (SubLObject)module0538.NIL;
            SubLObject var113 = (SubLObject)module0538.NIL;
            SubLObject var114 = (SubLObject)module0538.NIL;
            SubLObject var115 = (SubLObject)module0538.NIL;
            SubLObject var116 = (SubLObject)module0538.NIL;
            SubLObject var117 = (SubLObject)module0538.NIL;
            final SubLObject var34_123 = module0147.$g2094$.currentBinding(var101);
            final SubLObject var118 = module0147.$g2095$.currentBinding(var101);
            try {
                module0147.$g2094$.bind((SubLObject)module0538.$ic78$, var101);
                module0147.$g2095$.bind(module0538.$ic79$, var101);
                var112 = module0219.f14509(var99, (SubLObject)module0538.ONE_INTEGER, module0538.$ic56$, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
                var113 = module0219.f14509(var99, (SubLObject)module0538.ONE_INTEGER, module0538.$ic80$, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
                var114 = module0219.f14509(var99, (SubLObject)module0538.ONE_INTEGER, module0538.$ic81$, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
                var115 = module0219.f14509(var99, (SubLObject)module0538.ONE_INTEGER, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
                SubLObject var119;
                var116 = (var119 = module0226.f15093(var99, (SubLObject)module0538.T));
                SubLObject var120 = (SubLObject)module0538.NIL;
                var120 = var119.first();
                while (module0538.NIL != var119) {
                    if (module0538.NIL != module0035.f2439((SubLObject)module0538.$ic82$, module0178.f11303(var120), (SubLObject)module0538.UNPROVIDED)) {
                        var117 = (SubLObject)ConsesLow.cons(var120, var117);
                    }
                    var119 = var119.rest();
                    var120 = var119.first();
                }
            }
            finally {
                module0147.$g2095$.rebind(var118, var101);
                module0147.$g2094$.rebind(var34_123, var101);
            }
            var116 = conses_high.nset_difference(var116, var115, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
            var116 = conses_high.nset_difference(var116, var117, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
            var115 = conses_high.nset_difference(var115, var114, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
            var115 = conses_high.nset_difference(var115, var113, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
            var115 = conses_high.nset_difference(var115, var112, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
            var115 = conses_high.nset_difference(var115, var117, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
            SubLObject var121 = (SubLObject)module0538.NIL;
            final SubLObject var122 = (module0538.NIL != module0167.f10813(var99)) ? module0172.f10920(var99) : var99;
            SubLObject var119 = var117;
            SubLObject var120 = (SubLObject)module0538.NIL;
            var120 = var119.first();
            while (module0538.NIL != var119) {
                var101.resetMultipleValues();
                final SubLObject var123 = module0289.f19396(var120);
                final SubLObject var124 = var101.secondMultipleValue();
                var101.resetMultipleValues();
                final SubLObject var125 = (SubLObject)ConsesLow.list(var123, var124);
                if (module0538.NIL == module0004.f104(var125, var121, Symbols.symbol_function((SubLObject)module0538.EQUAL), (SubLObject)module0538.UNPROVIDED) && module0538.NIL != module0287.f19218(var120)) {
                    var121 = (SubLObject)ConsesLow.cons(var125, var121);
                    final SubLObject var126 = module0035.f2457(var123, var122, var100);
                    final SubLObject var127 = module0035.f2457(var124, var122, var100);
                    final SubLObject var128 = module0178.f11378(var120);
                    f33361(var126, var127, var128, var120);
                    f33362(var126, var127, var120);
                }
                var119 = var119.rest();
                var120 = var119.first();
            }
            SubLObject var129 = var112;
            SubLObject var130 = (SubLObject)module0538.NIL;
            var130 = var129.first();
            while (module0538.NIL != var129) {
                f33363(var100, var99, var130, (SubLObject)module0538.NIL);
                var129 = var129.rest();
                var130 = var129.first();
            }
            var129 = var113;
            var130 = (SubLObject)module0538.NIL;
            var130 = var129.first();
            while (module0538.NIL != var129) {
                f33363(var100, var99, var130, (SubLObject)module0538.NIL);
                var129 = var129.rest();
                var130 = var129.first();
            }
            var129 = var115;
            var130 = (SubLObject)module0538.NIL;
            var130 = var129.first();
            while (module0538.NIL != var129) {
                f33363(var100, var99, var130, (SubLObject)module0538.NIL);
                var129 = var129.rest();
                var130 = var129.first();
            }
            SubLObject var131 = (SubLObject)module0538.ZERO_INTEGER;
            final SubLObject var132 = Hashtables.make_hash_table(Sequences.length(var116), (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
            var119 = var116;
            var120 = (SubLObject)module0538.NIL;
            var120 = var119.first();
            while (module0538.NIL != var119) {
                final SubLObject var133 = module0213.f13939(var120);
                Hashtables.sethash(var120, var132, var133);
                if (var133.numG(var131)) {
                    var131 = var133;
                }
                var119 = var119.rest();
                var120 = var119.first();
            }
            SubLObject var134;
            SubLObject var135;
            SubLObject var136;
            SubLObject var137;
            for (var134 = (SubLObject)module0538.NIL, var134 = (SubLObject)module0538.ZERO_INTEGER; var134.numL(var131); var134 = Numbers.add(var134, (SubLObject)module0538.ONE_INTEGER)) {
                var135 = Numbers.add((SubLObject)module0538.ONE_INTEGER, var134);
                var136 = var116;
                var137 = (SubLObject)module0538.NIL;
                var137 = var136.first();
                while (module0538.NIL != var136) {
                    if (var135.eql(Hashtables.gethash(var137, var132, (SubLObject)module0538.UNPROVIDED))) {
                        f33363(var100, var99, var137, (SubLObject)module0538.NIL);
                    }
                    var136 = var136.rest();
                    var137 = var136.first();
                }
            }
            var129 = var114;
            var130 = (SubLObject)module0538.NIL;
            var130 = var129.first();
            while (module0538.NIL != var129) {
                f33364(var100, var99, var130, (SubLObject)module0538.NIL);
                var129 = var129.rest();
                var130 = var129.first();
            }
        }
        finally {
            module0538.$g3928$.rebind(var111, var101);
        }
        f33365(var99);
        module0528.f32921();
        return var100;
    }
    
    public static SubLObject f33358(final SubLObject var99, final SubLObject var100) {
        SubLObject var102;
        final SubLObject var101 = var102 = module0230.f15279(var99);
        SubLObject var103 = (SubLObject)module0538.NIL;
        var103 = var102.first();
        while (module0538.NIL != var102) {
            if (module0538.NIL == module0210.f13585(var103)) {
                final SubLObject var104 = module0172.f10920(var103);
                if (module0538.NIL != var104) {
                    final SubLObject var105 = conses_high.subst(var100, var99, var104, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
                    final SubLObject var106 = module0285.f18993(var105, (SubLObject)module0538.UNPROVIDED);
                    if (module0538.NIL != module0167.f10813(var106)) {
                        f33357(var103, var106);
                    }
                }
            }
            var102 = var102.rest();
            var103 = var102.first();
        }
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33359(final SubLObject var99, final SubLObject var100) {
        SubLObject var102;
        final SubLObject var101 = var102 = module0183.f11553(var99);
        SubLObject var103 = (SubLObject)module0538.NIL;
        var103 = var102.first();
        while (module0538.NIL != var102) {
            final SubLObject var104 = module0183.f11557(var103);
            final SubLObject var105 = conses_high.subst(var100, var99, var104, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
            final SubLObject var106 = module0183.f11558(var103);
            module0183.f11554(var105, var106);
            var102 = var102.rest();
            var103 = var102.first();
        }
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33363(final SubLObject var100, final SubLObject var99, final SubLObject var147, final SubLObject var148) {
        final SubLThread var149 = SubLProcess.currentSubLThread();
        assert module0538.NIL != module0173.f10955(var100) : var100;
        assert module0538.NIL != module0173.f10955(var99) : var99;
        assert module0538.NIL != assertion_handles_oc.f11035(var147) : var147;
        if (module0538.NIL != module0178.f11361(var147, (SubLObject)module0538.UNPROVIDED)) {
            var149.resetMultipleValues();
            final SubLObject var150 = module0289.f19396(var147);
            final SubLObject var151 = var149.secondMultipleValue();
            var149.resetMultipleValues();
            final SubLObject var152 = (module0538.NIL != module0167.f10813(var99)) ? module0172.f10920(var99) : var99;
            SubLObject var153 = module0205.f13250(var100, var152, var150, Symbols.symbol_function((SubLObject)module0538.EQUAL), (SubLObject)module0538.UNPROVIDED);
            final SubLObject var154 = module0205.f13250(var100, var152, var151, Symbols.symbol_function((SubLObject)module0538.EQUAL), (SubLObject)module0538.UNPROVIDED);
            if (module0538.NIL != module0211.f13703(var147) && module0538.NIL != f33366()) {
                final SubLObject var155 = f33367(var147, (SubLObject)module0538.UNPROVIDED);
                SubLObject var156 = module0035.f2110((SubLObject)module0538.$ic83$, var155, (SubLObject)module0538.UNPROVIDED);
                SubLObject var157 = (SubLObject)module0538.NIL;
                var157 = var156.first();
                while (module0538.NIL != var156) {
                    final SubLObject var158 = f33368(var157);
                    if (module0538.NIL != assertion_handles_oc.f11035(var158)) {
                        final SubLObject var159 = module0289.f19396(var157);
                        final SubLObject var160 = module0289.f19396(var158);
                        var153 = conses_high.subst(var160, var159, var153, Symbols.symbol_function((SubLObject)module0538.EQUAL), (SubLObject)module0538.UNPROVIDED);
                    }
                    var156 = var156.rest();
                    var157 = var156.first();
                }
            }
            if (module0538.NIL != module0035.f2439((SubLObject)module0538.$ic84$, var153, (SubLObject)module0538.UNPROVIDED) || module0538.NIL != module0035.f2439((SubLObject)module0538.$ic84$, var154, (SubLObject)module0538.UNPROVIDED)) {
                Errors.warn((SubLObject)module0538.$ic85$, var100, var147);
                return (SubLObject)module0538.NIL;
            }
            SubLObject var161 = module0018.$g696$.currentBinding(var149);
            SubLObject var162 = module0271.$g2562$.currentBinding(var149);
            SubLObject var163 = module0144.$g1752$.currentBinding(var149);
            SubLObject var164 = module0271.$g2560$.currentBinding(var149);
            SubLObject var165 = module0271.$g2561$.currentBinding(var149);
            SubLObject var166 = module0271.$g2563$.currentBinding(var149);
            SubLObject var167 = module0146.$g2055$.currentBinding(var149);
            SubLObject var168 = module0144.$g1771$.currentBinding(var149);
            SubLObject var169 = module0144.$g1769$.currentBinding(var149);
            SubLObject var170 = module0152.$g2107$.currentBinding(var149);
            SubLObject var171 = module0110.$g1374$.currentBinding(var149);
            try {
                module0018.$g696$.bind((SubLObject)module0538.NIL, var149);
                module0271.$g2562$.bind((SubLObject)module0538.NIL, var149);
                module0144.$g1752$.bind((SubLObject)module0538.NIL, var149);
                module0271.$g2560$.bind((SubLObject)module0538.NIL, var149);
                module0271.$g2561$.bind((SubLObject)module0538.NIL, var149);
                module0271.$g2563$.bind((SubLObject)module0538.NIL, var149);
                module0146.$g2055$.bind((SubLObject)module0538.NIL, var149);
                module0144.$g1771$.bind((SubLObject)module0538.NIL, var149);
                module0144.$g1769$.bind((SubLObject)module0538.NIL, var149);
                module0152.$g2107$.bind((SubLObject)module0538.NIL, var149);
                module0110.$g1374$.bind((SubLObject)module0538.T, var149);
                SubLObject var172 = module0178.f11299(var147);
                SubLObject var173 = (SubLObject)module0538.NIL;
                var173 = var172.first();
                while (module0538.NIL != var172) {
                    if (module0538.NIL != module0191.f11932(var173)) {
                        f33361(var153, var154, var173, var147);
                    }
                    else if (module0538.NIL != oc_deduction_handles.f11659(var173)) {
                        f33369(var153, var154, var100, var99, var173, var147);
                    }
                    var172 = var172.rest();
                    var173 = var172.first();
                }
                f33370(var153, var154, var100, var99, var147);
            }
            finally {
                module0110.$g1374$.rebind(var171, var149);
                module0152.$g2107$.rebind(var170, var149);
                module0144.$g1769$.rebind(var169, var149);
                module0144.$g1771$.rebind(var168, var149);
                module0146.$g2055$.rebind(var167, var149);
                module0271.$g2563$.rebind(var166, var149);
                module0271.$g2561$.rebind(var165, var149);
                module0271.$g2560$.rebind(var164, var149);
                module0144.$g1752$.rebind(var163, var149);
                module0271.$g2562$.rebind(var162, var149);
                module0018.$g696$.rebind(var161, var149);
            }
            f33362(var153, var154, var147);
            var161 = module0018.$g696$.currentBinding(var149);
            var162 = module0271.$g2562$.currentBinding(var149);
            var163 = module0144.$g1752$.currentBinding(var149);
            var164 = module0271.$g2560$.currentBinding(var149);
            var165 = module0271.$g2561$.currentBinding(var149);
            var166 = module0271.$g2563$.currentBinding(var149);
            var167 = module0146.$g2055$.currentBinding(var149);
            var168 = module0144.$g1771$.currentBinding(var149);
            var169 = module0144.$g1769$.currentBinding(var149);
            var170 = module0152.$g2107$.currentBinding(var149);
            var171 = module0110.$g1374$.currentBinding(var149);
            try {
                module0018.$g696$.bind((SubLObject)module0538.NIL, var149);
                module0271.$g2562$.bind((SubLObject)module0538.NIL, var149);
                module0144.$g1752$.bind((SubLObject)module0538.NIL, var149);
                module0271.$g2560$.bind((SubLObject)module0538.NIL, var149);
                module0271.$g2561$.bind((SubLObject)module0538.NIL, var149);
                module0271.$g2563$.bind((SubLObject)module0538.NIL, var149);
                module0146.$g2055$.bind((SubLObject)module0538.NIL, var149);
                module0144.$g1771$.bind((SubLObject)module0538.NIL, var149);
                module0144.$g1769$.bind((SubLObject)module0538.NIL, var149);
                module0152.$g2107$.bind((SubLObject)module0538.NIL, var149);
                module0110.$g1374$.bind((SubLObject)module0538.T, var149);
                if (module0538.NIL != var148) {
                    SubLObject var172 = module0178.f11299(var147);
                    SubLObject var173 = (SubLObject)module0538.NIL;
                    var173 = var172.first();
                    while (module0538.NIL != var172) {
                        module0342.f23121(var173, var147, (SubLObject)module0538.UNPROVIDED);
                        var172 = var172.rest();
                        var173 = var172.first();
                    }
                }
            }
            finally {
                module0110.$g1374$.rebind(var171, var149);
                module0152.$g2107$.rebind(var170, var149);
                module0144.$g1769$.rebind(var169, var149);
                module0144.$g1771$.rebind(var168, var149);
                module0146.$g2055$.rebind(var167, var149);
                module0271.$g2563$.rebind(var166, var149);
                module0271.$g2561$.rebind(var165, var149);
                module0271.$g2560$.rebind(var164, var149);
                module0144.$g1752$.rebind(var163, var149);
                module0271.$g2562$.rebind(var162, var149);
                module0018.$g696$.rebind(var161, var149);
            }
        }
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33361(final SubLObject var129, final SubLObject var130, final SubLObject var158, final SubLObject var147) {
        final SubLObject var159 = module0191.f11928(var158);
        final SubLObject var160 = module0178.f11291(var147);
        final SubLObject var161 = oc_assertions_low.f11248(var147);
        SubLObject var162 = (SubLObject)module0538.NIL;
        SubLObject var163 = (SubLObject)module0538.NIL;
        SubLObject var164 = (SubLObject)module0538.NIL;
        SubLObject var165 = (SubLObject)module0538.NIL;
        if (module0538.NIL != var161) {
            var162 = module0178.f11295(var147);
            var163 = module0178.f11296(var147);
            var164 = module0178.f11297(var147);
            var165 = module0178.f11298(var147);
        }
        f33349(var129, var130, var159, var160);
        if (module0538.NIL != var161) {
            f33371(var162, var163, var164, var165);
        }
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33369(final SubLObject var129, final SubLObject var130, final SubLObject var100, final SubLObject var99, final SubLObject var166, final SubLObject var147) {
        if (module0538.NIL != oc_deduction_handles.f11665(var166, (SubLObject)module0538.UNPROVIDED)) {
            final SubLObject var167 = module0178.f11291(var147);
            final SubLObject var168 = module0188.f11770(var166);
            final SubLObject var169 = conses_high.subst(var100, var99, var168, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
            final SubLObject var170 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0538.$ic86$), var169);
            f33372(var129, var130, var170, var167, (SubLObject)module0538.UNPROVIDED);
        }
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33370(final SubLObject var129, final SubLObject var130, final SubLObject var100, final SubLObject var99, final SubLObject var147) {
        final SubLObject var148 = f33373(var129, var130).first();
        if (module0538.NIL != assertion_handles_oc.f11035(var148)) {
            f33374(var148, var100, var99, var147);
        }
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33374(final SubLObject var170, final SubLObject var100, final SubLObject var99, final SubLObject var147) {
        SubLObject var171 = module0178.f11301(var147);
        SubLObject var172 = (SubLObject)module0538.NIL;
        var172 = var171.first();
        while (module0538.NIL != var171) {
            if (module0538.NIL != oc_deduction_handles.f11671(var172, (SubLObject)module0538.UNPROVIDED)) {
                final SubLObject var173 = module0188.f11781(var172);
                final SubLObject var174 = module0188.f11770(var172);
                final SubLObject var175 = Sequences.substitute(var170, var147, conses_high.subst(var100, var99, var174, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED), (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
                if (module0538.NIL != assertion_handles_oc.f11035(var173)) {
                    final SubLObject var176 = f33367(var173, (SubLObject)module0538.UNPROVIDED);
                    final SubLObject var177 = module0178.f11287(var173);
                    final SubLObject var178 = module0178.f11291(var173);
                    final SubLObject var179 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0538.$ic86$), var175);
                    f33372(var176, var177, var179, var178, (SubLObject)module0538.UNPROVIDED);
                }
                else {
                    final SubLObject var180 = module0183.f11552(var173);
                    module0182.f11522(var180, var175);
                }
            }
            var171 = var171.rest();
            var172 = var171.first();
        }
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33364(final SubLObject var100, final SubLObject var99, final SubLObject var147, final SubLObject var148) {
        final SubLThread var149 = SubLProcess.currentSubLThread();
        assert module0538.NIL != module0173.f10955(var100) : var100;
        assert module0538.NIL != module0173.f10955(var99) : var99;
        assert module0538.NIL != assertion_handles_oc.f11035(var147) : var147;
        if (module0538.NIL != module0178.f11361(var147, (SubLObject)module0538.UNPROVIDED)) {
            if (module0538.NIL != module0167.f10813(var100)) {
                final SubLObject var150 = module0228.f15206(var100);
                final SubLObject var151 = module0018.$g696$.currentBinding(var149);
                final SubLObject var152 = module0271.$g2562$.currentBinding(var149);
                final SubLObject var153 = module0144.$g1752$.currentBinding(var149);
                final SubLObject var154 = module0271.$g2560$.currentBinding(var149);
                final SubLObject var155 = module0271.$g2561$.currentBinding(var149);
                final SubLObject var156 = module0271.$g2563$.currentBinding(var149);
                final SubLObject var157 = module0146.$g2055$.currentBinding(var149);
                final SubLObject var158 = module0144.$g1771$.currentBinding(var149);
                final SubLObject var159 = module0144.$g1769$.currentBinding(var149);
                final SubLObject var160 = module0152.$g2107$.currentBinding(var149);
                final SubLObject var161 = module0110.$g1374$.currentBinding(var149);
                try {
                    module0018.$g696$.bind((SubLObject)module0538.NIL, var149);
                    module0271.$g2562$.bind((SubLObject)module0538.NIL, var149);
                    module0144.$g1752$.bind((SubLObject)module0538.NIL, var149);
                    module0271.$g2560$.bind((SubLObject)module0538.NIL, var149);
                    module0271.$g2561$.bind((SubLObject)module0538.NIL, var149);
                    module0271.$g2563$.bind((SubLObject)module0538.NIL, var149);
                    module0146.$g2055$.bind((SubLObject)module0538.NIL, var149);
                    module0144.$g1771$.bind((SubLObject)module0538.NIL, var149);
                    module0144.$g1769$.bind((SubLObject)module0538.NIL, var149);
                    module0152.$g2107$.bind((SubLObject)module0538.NIL, var149);
                    module0110.$g1374$.bind((SubLObject)module0538.T, var149);
                    f33374(var150, var100, var99, var147);
                }
                finally {
                    module0110.$g1374$.rebind(var161, var149);
                    module0152.$g2107$.rebind(var160, var149);
                    module0144.$g1769$.rebind(var159, var149);
                    module0144.$g1771$.rebind(var158, var149);
                    module0146.$g2055$.rebind(var157, var149);
                    module0271.$g2563$.rebind(var156, var149);
                    module0271.$g2561$.rebind(var155, var149);
                    module0271.$g2560$.rebind(var154, var149);
                    module0144.$g1752$.rebind(var153, var149);
                    module0271.$g2562$.rebind(var152, var149);
                    module0018.$g696$.rebind(var151, var149);
                }
                f33362(module0178.f11303(var150), module0178.f11287(var150), var147);
            }
            if (module0538.NIL != var148) {
                SubLObject var162 = module0178.f11299(var147);
                SubLObject var163 = (SubLObject)module0538.NIL;
                var163 = var162.first();
                while (module0538.NIL != var162) {
                    module0342.f23121(var163, var147, (SubLObject)module0538.UNPROVIDED);
                    var162 = var162.rest();
                    var163 = var162.first();
                }
            }
        }
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33360(final SubLObject var175) {
        return Hashtables.make_hash_table(var175, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33366() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return Types.hash_table_p(module0538.$g3928$.getDynamicValue(var7));
    }
    
    public static SubLObject f33362(final SubLObject var129, final SubLObject var130, final SubLObject var147) {
        final SubLThread var148 = SubLProcess.currentSubLThread();
        if (module0538.$g3928$.getDynamicValue(var148).isHashtable()) {
            Hashtables.sethash(var147, module0538.$g3928$.getDynamicValue(var148), module0202.f12782(var129, var130));
        }
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33368(final SubLObject var147) {
        final SubLThread var148 = SubLProcess.currentSubLThread();
        return Hashtables.gethash(var147, module0538.$g3928$.getDynamicValue(var148), (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33375(final SubLObject var176) {
        return f33330((SubLObject)module0538.$ic87$, var176, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33365(SubLObject var176) {
        final SubLThread var177 = SubLProcess.currentSubLThread();
        f33316();
        var176 = f33356(var176);
        if (module0538.NIL != f33324()) {
            return (SubLObject)module0538.NIL;
        }
        if (module0538.NIL != constants_high_oc.f10755(var176)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic92$, var176));
            return (SubLObject)module0538.NIL;
        }
        if (module0538.NIL == Errors.$ignore_mustsP$.getDynamicValue(var177) && module0538.NIL != module0213.f14074(var176)) {
            Errors.error((SubLObject)module0538.$ic93$, var176);
        }
        final SubLObject var178 = module0018.$g696$.currentBinding(var177);
        final SubLObject var179 = module0271.$g2562$.currentBinding(var177);
        final SubLObject var180 = module0144.$g1752$.currentBinding(var177);
        final SubLObject var181 = module0271.$g2560$.currentBinding(var177);
        final SubLObject var182 = module0271.$g2561$.currentBinding(var177);
        final SubLObject var183 = module0271.$g2563$.currentBinding(var177);
        final SubLObject var184 = module0146.$g2055$.currentBinding(var177);
        final SubLObject var185 = module0144.$g1771$.currentBinding(var177);
        final SubLObject var186 = module0144.$g1769$.currentBinding(var177);
        final SubLObject var187 = module0152.$g2107$.currentBinding(var177);
        final SubLObject var188 = module0110.$g1374$.currentBinding(var177);
        final SubLObject var189 = module0538.$g3925$.currentBinding(var177);
        try {
            module0018.$g696$.bind((SubLObject)module0538.NIL, var177);
            module0271.$g2562$.bind((SubLObject)module0538.NIL, var177);
            module0144.$g1752$.bind((SubLObject)module0538.NIL, var177);
            module0271.$g2560$.bind((SubLObject)module0538.NIL, var177);
            module0271.$g2561$.bind((SubLObject)module0538.NIL, var177);
            module0271.$g2563$.bind((SubLObject)module0538.NIL, var177);
            module0146.$g2055$.bind((SubLObject)module0538.NIL, var177);
            module0144.$g1771$.bind((SubLObject)module0538.NIL, var177);
            module0144.$g1769$.bind((SubLObject)module0538.NIL, var177);
            module0152.$g2107$.bind((SubLObject)module0538.NIL, var177);
            module0110.$g1374$.bind((SubLObject)module0538.T, var177);
            module0538.$g3925$.bind((SubLObject)module0538.T, var177);
            module0173.f10973(var176);
        }
        finally {
            module0538.$g3925$.rebind(var189, var177);
            module0110.$g1374$.rebind(var188, var177);
            module0152.$g2107$.rebind(var187, var177);
            module0144.$g1769$.rebind(var186, var177);
            module0144.$g1771$.rebind(var185, var177);
            module0146.$g2055$.rebind(var184, var177);
            module0271.$g2563$.rebind(var183, var177);
            module0271.$g2561$.rebind(var182, var177);
            module0271.$g2560$.rebind(var181, var177);
            module0144.$g1752$.rebind(var180, var177);
            module0271.$g2562$.rebind(var179, var177);
            module0018.$g696$.rebind(var178, var177);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0538.NIL == f33324());
    }
    
    public static SubLObject f33376(final SubLObject var47, final SubLObject var45) {
        return f33330((SubLObject)module0538.$ic94$, var47, var45, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33377(final SubLObject var47, SubLObject var45) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        f33316();
        if (module0538.NIL == constant_handles_oc.f8449(var47)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic98$, var47));
            return (SubLObject)module0538.NIL;
        }
        if (!var45.isString()) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic34$, var45));
            return (SubLObject)module0538.NIL;
        }
        if (module0538.NIL == module0126.f8389(var45)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic35$, (SubLObject)module0538.$ic36$, var45));
            return (SubLObject)module0538.NIL;
        }
        if (module0538.NIL != module0126.$g1496$.getDynamicValue(var48)) {
            SubLObject var49 = module0126.f8398(var45);
            var49 = Sequences.delete(var47, var49, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
            if (module0538.NIL != var49) {
                final SubLObject var50 = module0126.f8395(var45, (SubLObject)module0538.UNPROVIDED);
                f33320((SubLObject)ConsesLow.list((SubLObject)module0538.$ic47$, (SubLObject)module0538.$ic48$, var45, var50));
                var45 = var50;
            }
        }
        SubLObject var51 = (SubLObject)module0538.NIL;
        final SubLObject var52 = module0538.$g3925$.currentBinding(var48);
        try {
            module0538.$g3925$.bind((SubLObject)module0538.T, var48);
            if (constants_high_oc.f10743(var47).equal(var45)) {
                f33320((SubLObject)ConsesLow.list((SubLObject)module0538.$ic99$, (SubLObject)module0538.$ic100$, var47, var45));
            }
            else {
                final SubLObject var53 = constants_high_oc.f10737(var45);
                if (module0538.NIL != constant_handles_oc.f8463(var53, (SubLObject)module0538.UNPROVIDED)) {
                    final SubLObject var54 = module0126.f8395(var45, (SubLObject)module0538.UNPROVIDED);
                    var51 = constants_high_oc.f10748(var47, var54);
                    f33320((SubLObject)ConsesLow.list((SubLObject)module0538.$ic47$, (SubLObject)module0538.$ic48$, var45, var54));
                }
                else {
                    if (module0538.NIL != constant_handles_oc.f8449(var53)) {
                        constants_high_oc.f10741(var53);
                    }
                    var51 = constants_high_oc.f10748(var47, var45);
                }
            }
        }
        finally {
            module0538.$g3925$.rebind(var52, var48);
        }
        return var51;
    }
    
    public static SubLObject f33378(final SubLObject var50, final SubLObject var51) {
        return f33330((SubLObject)module0538.$ic101$, var50, module0162.f10628(var51), (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33379(final SubLObject var50, SubLObject var51) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        f33316();
        if (module0538.NIL == module0202.f12590(var50)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic106$, var50));
            return (SubLObject)module0538.NIL;
        }
        var51 = f33380(var51);
        if (module0538.NIL != f33324()) {
            return (SubLObject)module0538.NIL;
        }
        SubLObject var53 = (SubLObject)module0538.NIL;
        SubLObject var54 = (SubLObject)module0538.NIL;
        final SubLObject var55 = module0538.$g3925$.currentBinding(var52);
        try {
            module0538.$g3925$.bind((SubLObject)module0538.T, var52);
            var52.resetMultipleValues();
            final SubLObject var56 = f33373(var50, var51);
            final SubLObject var57 = var52.secondMultipleValue();
            final SubLObject var58 = var52.thirdMultipleValue();
            var52.resetMultipleValues();
            f33323(var58);
            var53 = var56;
            var54 = var57;
        }
        finally {
            module0538.$g3925$.rebind(var55, var52);
        }
        return Values.values(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0538.$ic107$), var53), var54);
    }
    
    public static SubLObject f33381(final SubLObject var184, final SubLObject var51, final SubLObject var185) {
        if (module0538.NIL != var185) {
            return f33382(var184, var51);
        }
        return f33373(var184, var51);
    }
    
    public static SubLObject f33373(final SubLObject var184, final SubLObject var51) {
        final SubLThread var185 = SubLProcess.currentSubLThread();
        if (module0538.NIL == module0274.f18060(var184, var51, (SubLObject)module0538.UNPROVIDED)) {
            final SubLObject var186 = f33383(var184, var51);
            return Values.values((SubLObject)module0538.NIL, (SubLObject)module0538.T, var186);
        }
        var185.resetMultipleValues();
        final SubLObject var187 = module0288.f19342(var184, var51);
        final SubLObject var188 = var185.secondMultipleValue();
        var185.resetMultipleValues();
        return Values.values(var187, (SubLObject)SubLObjectFactory.makeBoolean(module0538.NIL == var188), (SubLObject)module0538.NIL);
    }
    
    public static SubLObject f33382(final SubLObject var184, final SubLObject var51) {
        final SubLThread var185 = SubLProcess.currentSubLThread();
        if (module0538.NIL == module0274.f18060(var184, var51, (SubLObject)module0538.UNPROVIDED)) {
            final SubLObject var186 = f33383(var184, var51);
            return Values.values((SubLObject)module0538.NIL, (SubLObject)module0538.T, var186);
        }
        var185.resetMultipleValues();
        final SubLObject var187 = module0288.f19344(var184, var51);
        final SubLObject var188 = var185.secondMultipleValue();
        var185.resetMultipleValues();
        return Values.values(var187, (SubLObject)SubLObjectFactory.makeBoolean(module0538.NIL == var188), (SubLObject)module0538.NIL);
    }
    
    public static SubLObject f33384(final SubLObject var184) {
        return f33382(var184, module0538.$ic79$);
    }
    
    public static SubLObject f33385(final SubLObject var184, final SubLObject var51) {
        final SubLThread var185 = SubLProcess.currentSubLThread();
        var185.resetMultipleValues();
        final SubLObject var186 = f33373(var184, var51);
        final SubLObject var187 = var185.secondMultipleValue();
        final SubLObject var188 = var185.thirdMultipleValue();
        var185.resetMultipleValues();
        if (module0538.NIL != var186 && module0538.NIL != module0035.f1997(var186) && module0538.NIL != var187 && module0538.NIL == var188) {
            return var186.first();
        }
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33386(final SubLObject var189, final SubLObject var51) {
        final SubLObject var190 = f33385(var189, var51);
        if (module0538.NIL != module0178.f11284(var190)) {
            return var190;
        }
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33387(final SubLObject var50, final SubLObject var51, SubLObject var159, SubLObject var160) {
        if (var159 == module0538.UNPROVIDED) {
            var159 = (SubLObject)module0538.$ic108$;
        }
        if (var160 == module0538.UNPROVIDED) {
            var160 = (SubLObject)module0538.NIL;
        }
        return f33330((SubLObject)module0538.$ic109$, var50, module0162.f10628(var51), var159, var160, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33349(SubLObject var50, SubLObject var51, SubLObject var159, SubLObject var160) {
        if (var159 == module0538.UNPROVIDED) {
            var159 = (SubLObject)module0538.$ic108$;
        }
        if (var160 == module0538.UNPROVIDED) {
            var160 = (SubLObject)module0538.NIL;
        }
        final SubLThread var161 = SubLProcess.currentSubLThread();
        f33316();
        if (module0538.NIL == module0202.f12590(var50)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic106$, var50));
            return (SubLObject)module0538.NIL;
        }
        var50 = module0290.f19514(var50);
        var51 = module0290.f19514(var51);
        var51 = f33347(var51);
        if (module0538.NIL != f33324()) {
            return (SubLObject)module0538.NIL;
        }
        if (module0538.NIL == module0130.f8507(var159)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic113$, var159));
            return (SubLObject)module0538.NIL;
        }
        if (module0538.NIL != var160 && module0538.NIL == module0130.f8503(var160)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic114$, var160));
            return (SubLObject)module0538.NIL;
        }
        SubLObject var162 = (SubLObject)module0538.NIL;
        SubLObject var163 = (SubLObject)module0538.NIL;
        SubLObject var164 = (SubLObject)module0538.NIL;
        final SubLObject var165 = module0012.f460();
        assert module0538.NIL != module0055.f4006(var165) : var165;
        final SubLObject var166 = module0131.$g1538$.currentBinding(var161);
        final SubLObject var167 = module0018.$g734$.currentBinding(var161);
        final SubLObject var168 = module0018.$g733$.currentBinding(var161);
        try {
            module0131.$g1538$.bind(var165, var161);
            module0018.$g734$.bind((SubLObject)module0538.T, var161);
            module0018.$g733$.bind((SubLObject)module0538.NIL, var161);
            var161.resetMultipleValues();
            final SubLObject var169 = (module0538.NIL != module0538.$g3929$.getDynamicValue(var161)) ? module0285.f18887(var50, var51) : module0285.f18885(var50, var51);
            final SubLObject var170 = var161.secondMultipleValue();
            var161.resetMultipleValues();
            final SubLObject var171 = module0147.f9540(var170);
            final SubLObject var34_196 = module0147.$g2095$.currentBinding(var161);
            final SubLObject var35_197 = module0147.$g2094$.currentBinding(var161);
            final SubLObject var36_198 = module0147.$g2096$.currentBinding(var161);
            final SubLObject var172 = module0538.$g3925$.currentBinding(var161);
            try {
                module0147.$g2095$.bind(module0147.f9545(var171), var161);
                module0147.$g2094$.bind(module0147.f9546(var171), var161);
                module0147.$g2096$.bind(module0147.f9549(var171), var161);
                module0538.$g3925$.bind((SubLObject)module0538.T, var161);
                if (module0538.NIL == var169) {
                    f33323(f33388(var50, var170));
                }
                else if (module0538.NIL != module0213.f14081(var169, module0538.$ic115$)) {
                    f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic116$, (SubLObject)module0538.$ic117$, var50, var170));
                }
                else if (module0538.NIL != module0213.f14081(var169, module0538.$ic118$)) {
                    f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic119$, (SubLObject)module0538.$ic120$, var50, var170));
                }
                else {
                    module0538.$g3924$.setDynamicValue((SubLObject)module0538.NIL, var161);
                    SubLObject var173 = var169;
                    SubLObject var174 = (SubLObject)module0538.NIL;
                    var174 = var173.first();
                    while (module0538.NIL != var173) {
                        if (module0538.NIL == f33324()) {
                            SubLObject var176;
                            final SubLObject var175 = var176 = var174;
                            SubLObject var177 = (SubLObject)module0538.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var176, var175, (SubLObject)module0538.$ic121$);
                            var177 = var176.first();
                            var176 = var176.rest();
                            final SubLObject var178 = (SubLObject)(var176.isCons() ? var176.first() : module0538.NIL);
                            cdestructuring_bind.destructuring_bind_must_listp(var176, var175, (SubLObject)module0538.$ic121$);
                            var176 = var176.rest();
                            final SubLObject var179 = (SubLObject)(var176.isCons() ? var176.first() : module0538.NIL);
                            cdestructuring_bind.destructuring_bind_must_listp(var176, var175, (SubLObject)module0538.$ic121$);
                            var176 = var176.rest();
                            if (module0538.NIL == var176) {
                                if (module0538.NIL == var160) {
                                    var160 = f33389(var177);
                                }
                                final SubLObject var180 = module0195.f12224(var177, var170, var159, var160, var178);
                                if (module0538.NIL != assertion_handles_oc.f11035(var180)) {
                                    var162 = (SubLObject)ConsesLow.cons(var180, var162);
                                }
                                else if (module0538.NIL == var180) {
                                    f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic122$, (SubLObject)module0538.$ic123$, var50, var170));
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var175, (SubLObject)module0538.$ic121$);
                            }
                        }
                        var173 = var173.rest();
                        var174 = var173.first();
                    }
                    var162 = Sequences.nreverse(var162);
                }
                var163 = (SubLObject)SubLObjectFactory.makeBoolean(module0538.NIL == f33324());
            }
            finally {
                module0538.$g3925$.rebind(var172, var161);
                module0147.$g2096$.rebind(var36_198, var161);
                module0147.$g2094$.rebind(var35_197, var161);
                module0147.$g2095$.rebind(var34_196, var161);
            }
            if (module0538.NIL == f33324()) {
                SubLObject var181 = (SubLObject)module0538.NIL;
                final SubLObject var34_197 = module0131.$g1537$.currentBinding(var161);
                try {
                    module0131.$g1537$.bind(module0533.f33202(var162), var161);
                    var181 = module0528.f32921();
                }
                finally {
                    module0131.$g1537$.rebind(var34_197, var161);
                }
                f33390(var162, var181);
            }
            var164 = module0018.$g733$.getDynamicValue(var161);
        }
        finally {
            module0018.$g733$.rebind(var168, var161);
            module0018.$g734$.rebind(var167, var161);
            module0131.$g1538$.rebind(var166, var161);
        }
        module0426.f30151(var50, var51, var159, var160, var164);
        return var163;
    }
    
    public static SubLObject f33390(final SubLObject var190, final SubLObject var204) {
        final SubLThread var205 = SubLProcess.currentSubLThread();
        SubLObject var206 = (SubLObject)module0538.NIL;
        SubLObject var207 = var190;
        SubLObject var208 = (SubLObject)module0538.NIL;
        var208 = var207.first();
        while (module0538.NIL != var207) {
            if (module0538.NIL == module0228.f15209(var208)) {
                SubLObject var209 = (SubLObject)module0538.NIL;
                final SubLObject var210 = module0205.$g2314$.currentBinding(var205);
                try {
                    module0205.$g2314$.bind((SubLObject)module0538.$ic124$, var205);
                    var209 = module0205.f13184((SubLObject)module0538.$ic125$, var208, (SubLObject)module0538.NIL, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
                }
                finally {
                    module0205.$g2314$.rebind(var210, var205);
                }
                if (module0538.NIL != var209) {
                    SubLObject var55_209 = var209;
                    SubLObject var211 = (SubLObject)module0538.NIL;
                    var211 = var55_209.first();
                    while (module0538.NIL != var55_209) {
                        final SubLObject var212 = module0205.f13276(var211);
                        if (module0538.NIL == conses_high.member(var212, var206, Symbols.symbol_function((SubLObject)module0538.EQL), Symbols.symbol_function((SubLObject)module0538.IDENTITY))) {
                            var206 = (SubLObject)ConsesLow.cons(var212, var206);
                        }
                        var55_209 = var55_209.rest();
                        var211 = var55_209.first();
                    }
                }
            }
            var207 = var207.rest();
            var208 = var207.first();
        }
        if (module0538.NIL != var206) {
            var207 = var206;
            SubLObject var213 = (SubLObject)module0538.NIL;
            var213 = var207.first();
            while (module0538.NIL != var207) {
                f33391(var190, var213);
                var207 = var207.rest();
                var213 = var207.first();
            }
        }
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33391(final SubLObject var213, final SubLObject var212) {
        final SubLThread var214 = SubLProcess.currentSubLThread();
        final SubLObject var215 = (SubLObject)ConsesLow.list(module0538.$ic126$, var212);
        final SubLObject var216 = module0288.f19338(var215, module0132.$g1559$.getGlobalValue());
        if (module0538.NIL != var216) {
            final SubLObject var217 = module0178.f11299(var216);
            if (module0538.NIL == Errors.$ignore_mustsP$.getDynamicValue(var214) && module0538.NIL == module0035.f1995(var217, (SubLObject)module0538.ONE_INTEGER, (SubLObject)module0538.UNPROVIDED)) {
                Errors.error((SubLObject)module0538.$ic127$, var216);
            }
            final SubLObject var218 = var217.first();
            if (module0538.NIL == Errors.$ignore_mustsP$.getDynamicValue(var214) && module0538.NIL == oc_deduction_handles.f11659(var218)) {
                Errors.error((SubLObject)module0538.$ic128$, var216);
            }
            final SubLObject var219 = module0188.f11770(var218);
            if (module0538.NIL == Errors.$ignore_mustsP$.getDynamicValue(var214) && module0538.NIL == conses_high.subsetp(var213, var219, Symbols.symbol_function((SubLObject)module0538.$ic129$), (SubLObject)module0538.UNPROVIDED)) {
                Errors.error((SubLObject)module0538.$ic130$, var212, var213, var219);
            }
        }
        else {
            module0540.f33520(var215, var213, module0132.$g1559$.getGlobalValue(), (SubLObject)module0538.$ic131$, (SubLObject)module0538.NIL);
        }
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33392(final SubLObject var219, SubLObject var220) {
        SubLObject var221 = (SubLObject)module0538.NIL;
        SubLObject var222 = var219;
        SubLObject var223 = (SubLObject)module0538.NIL;
        var223 = var222.first();
        while (module0538.NIL != var222) {
            final SubLObject var224 = module0543.f33697(var223, (SubLObject)module0538.NIL);
            if (module0538.NIL != var224) {
                var221 = ConsesLow.append(var224, var221);
            }
            var222 = var222.rest();
            var223 = var222.first();
        }
        var220 = module0290.f19514(var220);
        f33391(var221, var220);
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33389(final SubLObject var114) {
        assert module0538.NIL != module0232.f15320(var114) : var114;
        if (module0538.NIL != module0204.f13045(var114)) {
            final SubLObject var115 = module0204.f13052(var114);
            if (module0538.NIL != module0202.f12883(var115, (SubLObject)module0538.UNPROVIDED)) {
                final SubLObject var116 = module0202.f12906(var115);
                final SubLObject var117 = module0202.f12887(var115);
                SubLObject var119;
                final SubLObject var118 = var119 = module0279.f18497(module0285.f18887(var117, var116));
                SubLObject var120 = (SubLObject)module0538.NIL;
                var120 = var119.first();
                while (module0538.NIL != var119) {
                    if (module0538.$ic133$ == f33389(var120)) {
                        return (SubLObject)module0538.$ic133$;
                    }
                    var119 = var119.rest();
                    var120 = var119.first();
                }
                return (SubLObject)module0538.$ic134$;
            }
        }
        if (module0538.NIL != module0232.f15312(var114) && module0538.NIL != module0232.f15311(var114)) {
            return (SubLObject)module0538.$ic134$;
        }
        return (SubLObject)module0538.$ic133$;
    }
    
    public static SubLObject f33383(final SubLObject var50, final SubLObject var51) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        if (module0538.NIL != module0538.$g3930$.getDynamicValue(var52)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0538.$ic135$, (SubLObject)module0538.$ic136$, var50, module0274.f18195(var50, var51, (SubLObject)module0538.UNPROVIDED));
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0538.$ic135$, (SubLObject)module0538.$ic137$, var50);
    }
    
    public static SubLObject f33388(final SubLObject var50, final SubLObject var51) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        if (module0538.NIL != module0538.$g3930$.getDynamicValue(var52)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0538.$ic135$, (SubLObject)module0538.$ic136$, var50, module0274.f18199(var50, var51, (SubLObject)module0538.UNPROVIDED));
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0538.$ic135$, (SubLObject)module0538.$ic137$, var50);
    }
    
    public static SubLObject f33393(final SubLObject var113, final SubLObject var228, final SubLObject var160, SubLObject var229) {
        if (var229 == module0538.UNPROVIDED) {
            var229 = (SubLObject)module0538.T;
        }
        final SubLThread var230 = SubLProcess.currentSubLThread();
        final SubLObject var231 = module0178.f11291(var113);
        final SubLObject var232 = module0178.f11378(var113);
        SubLObject var233 = (SubLObject)module0538.$ic138$;
        SubLObject var234 = (SubLObject)module0538.$ic138$;
        module0538.$g3924$.setDynamicValue((SubLObject)ConsesLow.cons(var113, module0538.$g3924$.getDynamicValue(var230)), var230);
        if (module0538.NIL != var229 && module0538.NIL != var232) {
            final SubLObject var235 = module0191.f11926(var232);
            if (var228.eql(var235)) {
                var233 = (SubLObject)module0538.$ic139$;
                var234 = (SubLObject)module0538.$ic139$;
                if (var160.eql(var231)) {
                    f33320((SubLObject)module0538.$ic140$);
                }
            }
            else {
                if (module0130.f8524(var235).eql(module0130.f8524(var228))) {
                    var233 = (SubLObject)module0538.$ic139$;
                }
                else {
                    var233 = (SubLObject)module0538.$ic141$;
                }
                if (module0130.f8523(var235).eql(module0130.f8523(var228))) {
                    var234 = (SubLObject)module0538.$ic139$;
                }
                else {
                    var234 = (SubLObject)module0538.$ic141$;
                }
                module0342.f23130(var232, var113, var228);
            }
        }
        else {
            var233 = (SubLObject)module0538.$ic142$;
            var234 = (SubLObject)module0538.$ic142$;
            module0342.f23118(var113, var228, var229);
        }
        if (!var160.eql(var231)) {
            module0342.f23133(var113, var160);
        }
        return Values.values(var113, var233, var234);
    }
    
    public static SubLObject f33394(final SubLObject var113, final SubLObject var228, final SubLObject var160, SubLObject var229) {
        if (var229 == module0538.UNPROVIDED) {
            var229 = (SubLObject)module0538.T;
        }
        return f33393(var113, var228, var160, var229);
    }
    
    public static SubLObject f33395(final SubLObject var50, final SubLObject var51, final SubLObject var159, final SubLObject var160) {
        return f33330((SubLObject)module0538.$ic143$, var50, module0162.f10628(var51), var159, var160, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33396(final SubLObject var50, SubLObject var51, final SubLObject var159, final SubLObject var160) {
        f33316();
        if (module0538.NIL == module0202.f12590(var50)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic106$, var50));
            return (SubLObject)module0538.NIL;
        }
        var51 = f33380(var51);
        if (module0538.NIL != f33324()) {
            return (SubLObject)module0538.NIL;
        }
        if (module0538.NIL == module0130.f8507(var159)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic113$, var159));
            return (SubLObject)module0538.NIL;
        }
        if (module0538.NIL == module0130.f8503(var160)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic114$, var160));
            return (SubLObject)module0538.NIL;
        }
        SubLObject var161 = (SubLObject)module0538.NIL;
        final SubLObject var162 = module0543.f33697(var50, var51);
        if (module0538.NIL != var162) {
            SubLObject var163 = var162;
            SubLObject var164 = (SubLObject)module0538.NIL;
            var164 = var163.first();
            while (module0538.NIL != var163) {
                if (module0538.NIL != module0178.f11375(var164)) {
                    final SubLObject var165 = f33397(var164, var159);
                    f33393(var164, var165, var160, (SubLObject)module0538.UNPROVIDED);
                }
                else {
                    final SubLObject var166 = module0178.f11293(var164);
                    f33398(var164, var160);
                    if (!var159.eql(var166)) {
                        f33320((SubLObject)module0538.$ic144$);
                    }
                }
                var163 = var163.rest();
                var164 = var163.first();
            }
        }
        else {
            f33320((SubLObject)ConsesLow.list((SubLObject)module0538.$ic145$, (SubLObject)module0538.$ic146$, var50, var51));
        }
        var161 = (SubLObject)SubLObjectFactory.makeBoolean(module0538.NIL == f33324());
        if (module0538.NIL == f33324()) {
            module0528.f32921();
        }
        return var161;
    }
    
    public static SubLObject f33397(final SubLObject var236, final SubLObject var237) {
        return module0130.f8529(module0178.f11292(var236), var237);
    }
    
    public static SubLObject f33398(final SubLObject var113, final SubLObject var160) {
        module0342.f23134(var113);
        if (!var160.eql(module0178.f11291(var113))) {
            module0342.f23133(var113, var160);
        }
        return var113;
    }
    
    public static SubLObject f33399(final SubLObject var50, final SubLObject var51) {
        return f33330((SubLObject)module0538.$ic147$, var50, module0162.f10628(var51), (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33400(final SubLObject var184, SubLObject var51) {
        final SubLThread var185 = SubLProcess.currentSubLThread();
        f33316();
        if (module0538.NIL == module0202.f12590(var184)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic106$, var184));
            return (SubLObject)module0538.NIL;
        }
        SubLObject var186 = (SubLObject)module0538.NIL;
        final SubLObject var187 = module0528.f32898();
        assert module0538.NIL != module0055.f4006(var187) : var187;
        final SubLObject var188 = module0131.$g1538$.currentBinding(var185);
        try {
            module0131.$g1538$.bind(var187, var185);
            final SubLObject var34_238 = module0538.$g3925$.currentBinding(var185);
            try {
                module0538.$g3925$.bind((SubLObject)module0538.T, var185);
                SubLObject var189 = (SubLObject)module0538.NIL;
                SubLObject var190 = (SubLObject)module0538.NIL;
                var185.resetMultipleValues();
                final SubLObject var240_241 = f33401(var184, var51);
                final SubLObject var242_243 = var185.secondMultipleValue();
                final SubLObject var244_245 = var185.thirdMultipleValue();
                var185.resetMultipleValues();
                var189 = var240_241;
                var51 = var242_243;
                var190 = var244_245;
                final SubLObject var191 = f33380(var51);
                if (module0538.NIL == f33324()) {
                    final SubLObject var192 = module0147.f9540(var191);
                    final SubLObject var34_239 = module0147.$g2095$.currentBinding(var185);
                    final SubLObject var193 = module0147.$g2094$.currentBinding(var185);
                    final SubLObject var194 = module0147.$g2096$.currentBinding(var185);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var192), var185);
                        module0147.$g2094$.bind(module0147.f9546(var192), var185);
                        module0147.$g2096$.bind(module0147.f9549(var192), var185);
                        if (module0538.NIL == var190 || module0538.NIL != var189) {
                            if (module0538.NIL == var189) {
                                f33323(f33383(var184, var51));
                            }
                            else if (module0538.NIL != module0213.f14081(var189, module0538.$ic115$)) {
                                f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic116$, (SubLObject)module0538.$ic150$, var184, var51));
                            }
                            else if (module0538.NIL != module0213.f14081(var189, module0538.$ic118$)) {
                                f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic119$, (SubLObject)module0538.$ic151$, var184, var51));
                            }
                            else {
                                SubLObject var195 = var189;
                                SubLObject var196 = (SubLObject)module0538.NIL;
                                var196 = var195.first();
                                while (module0538.NIL != var195) {
                                    if (module0538.NIL == f33324()) {
                                        SubLObject var198;
                                        final SubLObject var197 = var198 = var196;
                                        SubLObject var199 = (SubLObject)module0538.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(var198, var197, (SubLObject)module0538.$ic121$);
                                        var199 = var198.first();
                                        var198 = var198.rest();
                                        final SubLObject var200 = (SubLObject)(var198.isCons() ? var198.first() : module0538.NIL);
                                        cdestructuring_bind.destructuring_bind_must_listp(var198, var197, (SubLObject)module0538.$ic121$);
                                        var198 = var198.rest();
                                        final SubLObject var201 = (SubLObject)(var198.isCons() ? var198.first() : module0538.NIL);
                                        cdestructuring_bind.destructuring_bind_must_listp(var198, var197, (SubLObject)module0538.$ic121$);
                                        var198 = var198.rest();
                                        if (module0538.NIL == var198) {
                                            if (module0538.NIL == module0195.f12225(var199, var51)) {
                                                f33320((SubLObject)ConsesLow.list((SubLObject)module0538.$ic145$, (SubLObject)module0538.$ic152$, var184, var51));
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(var197, (SubLObject)module0538.$ic121$);
                                        }
                                    }
                                    var195 = var195.rest();
                                    var196 = var195.first();
                                }
                            }
                        }
                    }
                    finally {
                        module0147.$g2096$.rebind(var194, var185);
                        module0147.$g2094$.rebind(var193, var185);
                        module0147.$g2095$.rebind(var34_239, var185);
                    }
                }
                var186 = (SubLObject)SubLObjectFactory.makeBoolean(module0538.NIL == f33324());
            }
            finally {
                module0538.$g3925$.rebind(var34_238, var185);
            }
            if (module0538.NIL != var186) {
                module0528.f32921();
            }
        }
        finally {
            module0131.$g1538$.rebind(var188, var185);
        }
        return var186;
    }
    
    public static SubLObject f33401(final SubLObject var184, final SubLObject var51) {
        return f33402(var184, var51, (SubLObject)module0538.T);
    }
    
    public static SubLObject f33403(final SubLObject var184, final SubLObject var51) {
        final SubLThread var185 = SubLProcess.currentSubLThread();
        var185.resetMultipleValues();
        final SubLObject var186 = f33402(var184, var51, (SubLObject)module0538.NIL);
        final SubLObject var51_250 = var185.secondMultipleValue();
        final SubLObject var187 = var185.thirdMultipleValue();
        var185.resetMultipleValues();
        return Values.values(var186, var51_250);
    }
    
    public static SubLObject f33402(final SubLObject var184, SubLObject var51, final SubLObject var251) {
        final SubLThread var252 = SubLProcess.currentSubLThread();
        SubLObject var253 = module0290.f19514(var184);
        var252.resetMultipleValues();
        final SubLObject var253_254 = module0279.f18576(var253, var51);
        final SubLObject var255_256 = var252.secondMultipleValue();
        var252.resetMultipleValues();
        var253 = var253_254;
        var51 = var255_256;
        var51 = f33404(var51);
        SubLObject var254 = (SubLObject)module0538.NIL;
        SubLObject var255 = (SubLObject)module0538.NIL;
        SubLObject var256 = (SubLObject)((module0538.NIL != module0161.f10481(var51)) ? module0288.f19342(var253, var51) : module0538.NIL);
        if (module0538.NIL == var256) {
            var256 = module0543.f33697(var184, var51);
        }
        if (module0538.NIL != var256) {
            SubLObject var257 = var256;
            SubLObject var258 = (SubLObject)module0538.NIL;
            var258 = var257.first();
            while (module0538.NIL != var257) {
                if (module0538.NIL != var251 && module0538.NIL == module0178.f11378(var258)) {
                    f33320((SubLObject)ConsesLow.list((SubLObject)module0538.$ic153$, (SubLObject)module0538.$ic154$, var253, var51));
                    var255 = (SubLObject)module0538.T;
                }
                else {
                    final SubLObject var259 = module0178.f11282(var258);
                    final SubLObject var260 = (SubLObject)module0538.NIL;
                    final SubLObject var261 = (SubLObject)module0538.NIL;
                    final SubLObject var262 = (SubLObject)ConsesLow.list(var259, var260, var261);
                    final SubLObject var263 = module0178.f11287(var258);
                    var254 = (SubLObject)ConsesLow.cons(var262, var254);
                    var51 = var263;
                }
                var257 = var257.rest();
                var258 = var257.first();
            }
        }
        else if (module0538.NIL != module0161.f10481(var51)) {
            var252.resetMultipleValues();
            final SubLObject var258_259 = module0285.f18917(var253, var51);
            final SubLObject var260_261 = var252.secondMultipleValue();
            var252.resetMultipleValues();
            var254 = var258_259;
            var51 = var260_261;
        }
        return Values.values(var254, var51, var255);
    }
    
    public static SubLObject f33404(SubLObject var51) {
        var51 = module0290.f19512(var51);
        var51 = module0172.f10922(var51);
        return var51;
    }
    
    public static SubLObject f33405(final SubLObject var262, final SubLObject var129, SubLObject var263, SubLObject var130, SubLObject var159, SubLObject var160) {
        if (var263 == module0538.UNPROVIDED) {
            var263 = (SubLObject)module0538.NIL;
        }
        if (var130 == module0538.UNPROVIDED) {
            var130 = var263;
        }
        if (var159 == module0538.UNPROVIDED) {
            var159 = (SubLObject)module0538.$ic108$;
        }
        if (var160 == module0538.UNPROVIDED) {
            var160 = (SubLObject)module0538.NIL;
        }
        return f33330((SubLObject)module0538.$ic155$, var262, var129, module0162.f10628(var263), module0162.f10628(var130), var159, var160, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33406(final SubLObject var262, final SubLObject var129, SubLObject var263, SubLObject var130, SubLObject var159, SubLObject var160) {
        if (var263 == module0538.UNPROVIDED) {
            var263 = (SubLObject)module0538.NIL;
        }
        if (var130 == module0538.UNPROVIDED) {
            var130 = var263;
        }
        if (var159 == module0538.UNPROVIDED) {
            var159 = (SubLObject)module0538.$ic108$;
        }
        if (var160 == module0538.UNPROVIDED) {
            var160 = (SubLObject)module0538.NIL;
        }
        final SubLThread var264 = SubLProcess.currentSubLThread();
        final SubLObject var265 = module0144.$g1769$.currentBinding(var264);
        final SubLObject var266 = module0144.$g1771$.currentBinding(var264);
        try {
            module0144.$g1769$.bind((SubLObject)module0538.NIL, var264);
            module0144.$g1771$.bind((SubLObject)module0538.NIL, var264);
            f33349(var129, var130, var159, var160);
            final SubLObject var267 = module0538.$g3924$.getDynamicValue(var264);
            try {
                if (module0538.NIL == f33324()) {
                    f33400(var262, var263);
                }
            }
            finally {
                final SubLObject var34_265 = Threads.$is_thread_performing_cleanupP$.currentBinding(var264);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0538.T, var264);
                    module0538.$g3924$.setDynamicValue(var267, var264);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var34_265, var264);
                }
            }
        }
        finally {
            module0144.$g1771$.rebind(var266, var264);
            module0144.$g1769$.rebind(var265, var264);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0538.NIL == f33324());
    }
    
    public static SubLObject f33407(final SubLObject var262, final SubLObject var129, SubLObject var263, SubLObject var130, SubLObject var159, SubLObject var160) {
        if (var263 == module0538.UNPROVIDED) {
            var263 = (SubLObject)module0538.NIL;
        }
        if (var130 == module0538.UNPROVIDED) {
            var130 = var263;
        }
        if (var159 == module0538.UNPROVIDED) {
            var159 = (SubLObject)module0538.$ic108$;
        }
        if (var160 == module0538.UNPROVIDED) {
            var160 = (SubLObject)module0538.NIL;
        }
        if (module0538.NIL != module0288.f19338(var262, var263)) {
            return f33406(var262, var129, var263, var130, var159, var160);
        }
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33408(final SubLObject var50, final SubLObject var51, SubLObject var266) {
        if (var266 == module0538.UNPROVIDED) {
            var266 = (SubLObject)module0538.NIL;
        }
        return f33330((SubLObject)module0538.$ic159$, var50, module0162.f10628(var51), var266, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33409(final SubLObject var50, SubLObject var51, SubLObject var266) {
        if (var266 == module0538.UNPROVIDED) {
            var266 = (SubLObject)module0538.NIL;
        }
        final SubLThread var267 = SubLProcess.currentSubLThread();
        f33316();
        if (module0538.NIL == module0202.f12590(var50)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic106$, var50));
            return (SubLObject)module0538.NIL;
        }
        var51 = f33380(var51);
        if (module0538.NIL != f33324()) {
            return (SubLObject)module0538.NIL;
        }
        SubLObject var268 = (SubLObject)module0538.NIL;
        final SubLObject var269 = module0538.$g3925$.currentBinding(var267);
        try {
            module0538.$g3925$.bind((SubLObject)module0538.T, var267);
            var268 = f33410(var50, var51, var266);
        }
        finally {
            module0538.$g3925$.rebind(var269, var267);
        }
        return var268;
    }
    
    public static SubLObject f33410(final SubLObject var50, SubLObject var51, SubLObject var266) {
        if (var266 == module0538.UNPROVIDED) {
            var266 = (SubLObject)module0538.NIL;
        }
        final SubLThread var267 = SubLProcess.currentSubLThread();
        SubLObject var268 = (SubLObject)module0538.NIL;
        SubLObject var269 = (SubLObject)module0538.NIL;
        var267.resetMultipleValues();
        final SubLObject var268_269 = module0285.f18910(var50, var51);
        final SubLObject var270_271 = var267.secondMultipleValue();
        var267.resetMultipleValues();
        var269 = var268_269;
        var51 = var270_271;
        if (module0538.NIL == var269) {
            f33323(f33383(var50, var51));
            return (SubLObject)module0538.NIL;
        }
        if (module0538.NIL != module0213.f14081(var269, module0538.$ic115$)) {
            f33320((SubLObject)ConsesLow.list((SubLObject)module0538.$ic116$, (SubLObject)module0538.$ic117$, var50, var51));
        }
        else if (module0538.NIL != module0213.f14081(var269, module0538.$ic118$)) {
            f33320((SubLObject)ConsesLow.list((SubLObject)module0538.$ic119$, (SubLObject)module0538.$ic120$, var50, var51));
        }
        else {
            SubLObject var270 = var269;
            SubLObject var271 = (SubLObject)module0538.NIL;
            var271 = var270.first();
            while (module0538.NIL != var270) {
                final SubLObject var272 = var271.first();
                final SubLObject var273 = module0232.f15306(var272);
                final SubLObject var274 = module0232.f15308(var272);
                SubLObject var55_275 = var273;
                SubLObject var275 = (SubLObject)module0538.NIL;
                var275 = var55_275.first();
                while (module0538.NIL != var55_275) {
                    var275 = module0205.f13338(var275);
                    final SubLObject var276 = f33411(var275, var51, var266);
                    if (module0538.NIL == var276) {
                        f33320((SubLObject)ConsesLow.list((SubLObject)module0538.$ic145$, (SubLObject)module0538.$ic146$, var275, var51));
                        return (SubLObject)module0538.NIL;
                    }
                    SubLObject var55_276 = var276;
                    SubLObject var277 = (SubLObject)module0538.NIL;
                    var277 = var55_276.first();
                    while (module0538.NIL != var55_276) {
                        final SubLObject var278 = var277;
                        if (module0538.NIL == conses_high.member(var278, var268, Symbols.symbol_function((SubLObject)module0538.EQUAL), Symbols.symbol_function((SubLObject)module0538.IDENTITY))) {
                            var268 = (SubLObject)ConsesLow.cons(var278, var268);
                        }
                        var55_276 = var55_276.rest();
                        var277 = var55_276.first();
                    }
                    var55_275 = var55_275.rest();
                    var275 = var55_275.first();
                }
                SubLObject var55_277 = var274;
                SubLObject var279 = (SubLObject)module0538.NIL;
                var279 = var55_277.first();
                while (module0538.NIL != var55_277) {
                    final SubLObject var276 = f33411(var279, var51, var266);
                    if (module0538.NIL == var276) {
                        f33320((SubLObject)ConsesLow.list((SubLObject)module0538.$ic145$, (SubLObject)module0538.$ic146$, var279, var51));
                        return (SubLObject)module0538.NIL;
                    }
                    SubLObject var55_278 = var276;
                    SubLObject var277 = (SubLObject)module0538.NIL;
                    var277 = var55_278.first();
                    while (module0538.NIL != var55_278) {
                        final SubLObject var278 = var277;
                        if (module0538.NIL == conses_high.member(var278, var268, Symbols.symbol_function((SubLObject)module0538.EQUAL), Symbols.symbol_function((SubLObject)module0538.IDENTITY))) {
                            var268 = (SubLObject)ConsesLow.cons(var278, var268);
                        }
                        var55_278 = var55_278.rest();
                        var277 = var55_278.first();
                    }
                    var55_277 = var55_277.rest();
                    var279 = var55_277.first();
                }
                var270 = var270.rest();
                var271 = var270.first();
            }
        }
        return Sequences.nreverse(var268);
    }
    
    public static SubLObject f33411(final SubLObject var50, final SubLObject var51, final SubLObject var266) {
        final SubLObject var267 = f33412(var50, var51);
        if (module0538.NIL == var267) {
            return (SubLObject)module0538.NIL;
        }
        if (Sequences.length(var267).numE((SubLObject)module0538.ONE_INTEGER)) {
            return var267;
        }
        if (module0538.NIL == var266) {
            return var267;
        }
        SubLObject var268 = (SubLObject)module0538.NIL;
        SubLObject var269 = var267;
        SubLObject var270 = (SubLObject)module0538.NIL;
        var270 = var269.first();
        while (module0538.NIL != var269) {
            SubLObject var272;
            final SubLObject var271 = var272 = var270;
            SubLObject var273 = (SubLObject)module0538.NIL;
            SubLObject var274 = (SubLObject)module0538.NIL;
            SubLObject var275 = (SubLObject)module0538.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var272, var271, (SubLObject)module0538.$ic160$);
            var273 = var272.first();
            var272 = var272.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var272, var271, (SubLObject)module0538.$ic160$);
            var274 = var272.first();
            var272 = var272.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var272, var271, (SubLObject)module0538.$ic160$);
            var275 = var272.first();
            var272 = var272.rest();
            if (module0538.NIL == var272) {
                if (var273.eql(module0191.$g2251$.getGlobalValue())) {
                    final SubLObject var276 = f33411(var274, var275, (SubLObject)module0538.T);
                    if (module0538.NIL == var276) {
                        return (SubLObject)module0538.NIL;
                    }
                    SubLObject var55_289 = var276;
                    SubLObject var277 = (SubLObject)module0538.NIL;
                    var277 = var55_289.first();
                    while (module0538.NIL != var55_289) {
                        final SubLObject var278 = var277;
                        if (module0538.NIL == conses_high.member(var278, var268, Symbols.symbol_function((SubLObject)module0538.EQUAL), Symbols.symbol_function((SubLObject)module0538.IDENTITY))) {
                            var268 = (SubLObject)ConsesLow.cons(var278, var268);
                        }
                        var55_289 = var55_289.rest();
                        var277 = var55_289.first();
                    }
                }
                else {
                    final SubLObject var279 = var270;
                    if (module0538.NIL == conses_high.member(var279, var268, Symbols.symbol_function((SubLObject)module0538.EQUAL), Symbols.symbol_function((SubLObject)module0538.IDENTITY))) {
                        var268 = (SubLObject)ConsesLow.cons(var279, var268);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var271, (SubLObject)module0538.$ic160$);
            }
            var269 = var269.rest();
            var270 = var269.first();
        }
        return Sequences.nreverse(var268);
    }
    
    public static SubLObject f33412(final SubLObject var50, SubLObject var51) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        SubLObject var53 = (SubLObject)module0538.NIL;
        SubLObject var54 = (SubLObject)module0538.NIL;
        var52.resetMultipleValues();
        final SubLObject var292_293 = module0285.f18897(var50, var51);
        final SubLObject var294_295 = var52.secondMultipleValue();
        var52.resetMultipleValues();
        var54 = var292_293;
        var51 = var294_295;
        if (module0538.NIL == var54) {
            f33323(f33383(var50, var51));
            return (SubLObject)module0538.NIL;
        }
        if (var54.isCons()) {
            SubLObject var55 = var54;
            SubLObject var56 = (SubLObject)module0538.NIL;
            var56 = var55.first();
            while (module0538.NIL != var55) {
                if (module0538.NIL == f33324()) {
                    var52.resetMultipleValues();
                    final SubLObject var57 = f33413(var56, (SubLObject)module0538.T, (SubLObject)module0538.UNPROVIDED);
                    final SubLObject var58 = var52.secondMultipleValue();
                    final SubLObject var59 = var52.thirdMultipleValue();
                    var52.resetMultipleValues();
                    final SubLObject var60 = module0217.f14415(var57, var51);
                    if (module0538.NIL == var60) {
                        f33320((SubLObject)ConsesLow.list((SubLObject)module0538.$ic145$, (SubLObject)module0538.$ic146$, var50, var51));
                    }
                    else {
                        final SubLObject var61 = Sequences.find(module0178.f11302(var60), module0178.f11299(var60), Symbols.symbol_function((SubLObject)module0538.EQL), Symbols.symbol_function((SubLObject)module0538.$ic161$), (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
                        if (module0538.NIL != var61) {
                            if (module0538.NIL != module0191.f11911(var61)) {
                                final SubLObject var62 = f33414(var60);
                                if (module0538.NIL == conses_high.member(var62, var53, Symbols.symbol_function((SubLObject)module0538.EQUAL), Symbols.symbol_function((SubLObject)module0538.IDENTITY))) {
                                    var53 = (SubLObject)ConsesLow.cons(var62, var53);
                                }
                            }
                            else {
                                SubLObject var55_298 = module0188.f11770(var61);
                                SubLObject var63 = (SubLObject)module0538.NIL;
                                var63 = var55_298.first();
                                while (module0538.NIL != var55_298) {
                                    final SubLObject var64 = f33414(var63);
                                    if (module0538.NIL == conses_high.member(var64, var53, Symbols.symbol_function((SubLObject)module0538.EQUAL), Symbols.symbol_function((SubLObject)module0538.IDENTITY))) {
                                        var53 = (SubLObject)ConsesLow.cons(var64, var53);
                                    }
                                    var55_298 = var55_298.rest();
                                    var63 = var55_298.first();
                                }
                            }
                        }
                    }
                }
                var55 = var55.rest();
                var56 = var55.first();
            }
        }
        return Sequences.nreverse(var53);
    }
    
    public static SubLObject f33414(final SubLObject var299) {
        return (SubLObject)ConsesLow.list(module0191.f11965(var299), module0191.f11969(var299), module0191.f11976(var299));
    }
    
    public static SubLObject f33415(final SubLObject var50, final SubLObject var51, final SubLObject var115, SubLObject var160, SubLObject var300) {
        if (var160 == module0538.UNPROVIDED) {
            var160 = (SubLObject)module0538.NIL;
        }
        if (var300 == module0538.UNPROVIDED) {
            var300 = (SubLObject)module0538.NIL;
        }
        return f33330((SubLObject)module0538.$ic162$, var50, module0162.f10628(var51), var115, var160, var300, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33372(SubLObject var50, SubLObject var51, SubLObject var115, SubLObject var160, SubLObject var300) {
        if (var160 == module0538.UNPROVIDED) {
            var160 = (SubLObject)module0538.NIL;
        }
        if (var300 == module0538.UNPROVIDED) {
            var300 = (SubLObject)module0538.NIL;
        }
        final SubLThread var301 = SubLProcess.currentSubLThread();
        f33316();
        if (module0538.NIL == module0202.f12590(var50)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic106$, var50));
            return (SubLObject)module0538.NIL;
        }
        if (!var115.isCons()) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic106$, var115));
            return (SubLObject)module0538.NIL;
        }
        var50 = module0290.f19514(var50);
        var51 = module0290.f19514(var51);
        var115 = module0290.f19514(var115);
        var51 = f33347(var51);
        if (module0538.NIL != f33324()) {
            return (SubLObject)module0538.NIL;
        }
        SubLObject var302 = var115;
        SubLObject var303 = (SubLObject)module0538.NIL;
        var303 = var302.first();
        while (module0538.NIL != var302) {
            if (module0538.NIL == module0191.f11950(var303)) {
                f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic163$, var303));
                return (SubLObject)module0538.NIL;
            }
            var302 = var302.rest();
            var303 = var302.first();
        }
        if (module0538.NIL != var160 && module0538.NIL == conses_high.member(var160, (SubLObject)module0538.$ic164$, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic165$, var160));
            return (SubLObject)module0538.NIL;
        }
        var301.resetMultipleValues();
        final SubLObject var304 = f33416(var115, var300);
        final SubLObject var305 = var301.secondMultipleValue();
        var301.resetMultipleValues();
        if (module0538.NIL != var305) {
            f33323(var305);
            return (SubLObject)module0538.NIL;
        }
        var115 = var304;
        SubLObject var306 = (SubLObject)module0538.NIL;
        SubLObject var307 = (SubLObject)module0538.NIL;
        SubLObject var308 = (SubLObject)module0538.NIL;
        var301.resetMultipleValues();
        final SubLObject var303_304 = (module0538.NIL != module0538.$g3929$.getDynamicValue(var301)) ? module0285.f18887(var50, var51) : module0285.f18885(var50, var51);
        final SubLObject var305_306 = var301.secondMultipleValue();
        var301.resetMultipleValues();
        var308 = var303_304;
        var51 = var305_306;
        final SubLObject var309 = module0147.f9540(var51);
        final SubLObject var310 = module0147.$g2095$.currentBinding(var301);
        final SubLObject var311 = module0147.$g2094$.currentBinding(var301);
        final SubLObject var312 = module0147.$g2096$.currentBinding(var301);
        final SubLObject var313 = module0538.$g3925$.currentBinding(var301);
        try {
            module0147.$g2095$.bind(module0147.f9545(var309), var301);
            module0147.$g2094$.bind(module0147.f9546(var309), var301);
            module0147.$g2096$.bind(module0147.f9549(var309), var301);
            module0538.$g3925$.bind((SubLObject)module0538.T, var301);
            if (module0538.NIL == var308) {
                f33323(f33388(var50, var51));
            }
            else if (module0538.NIL != module0213.f14081(var308, module0538.$ic115$)) {
                f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic116$, (SubLObject)module0538.$ic117$, var50, var51));
            }
            else if (module0538.NIL != module0213.f14081(var308, module0538.$ic118$)) {
                f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic119$, (SubLObject)module0538.$ic120$, var50, var51));
            }
            else {
                SubLObject var314 = var308;
                SubLObject var315 = (SubLObject)module0538.NIL;
                var315 = var314.first();
                while (module0538.NIL != var314) {
                    if (module0538.NIL == f33324()) {
                        SubLObject var317;
                        final SubLObject var316 = var317 = var315;
                        SubLObject var318 = (SubLObject)module0538.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var317, var316, (SubLObject)module0538.$ic121$);
                        var318 = var317.first();
                        var317 = var317.rest();
                        final SubLObject var319 = (SubLObject)(var317.isCons() ? var317.first() : module0538.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(var317, var316, (SubLObject)module0538.$ic121$);
                        var317 = var317.rest();
                        final SubLObject var320 = (SubLObject)(var317.isCons() ? var317.first() : module0538.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(var317, var316, (SubLObject)module0538.$ic121$);
                        var317 = var317.rest();
                        if (module0538.NIL == var317) {
                            if (module0538.NIL == var160) {
                                var160 = f33389(var318);
                            }
                            var306 = (SubLObject)ConsesLow.cons(module0195.f12226(var318, var51, var115, var160, var319), var306);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var316, (SubLObject)module0538.$ic121$);
                        }
                    }
                    var314 = var314.rest();
                    var315 = var314.first();
                }
            }
            var307 = (SubLObject)SubLObjectFactory.makeBoolean(module0538.NIL == f33324());
        }
        finally {
            module0538.$g3925$.rebind(var313, var301);
            module0147.$g2096$.rebind(var312, var301);
            module0147.$g2094$.rebind(var311, var301);
            module0147.$g2095$.rebind(var310, var301);
        }
        if (module0538.NIL == f33324()) {
            final SubLObject var321 = module0528.f32921();
            f33417(var306, var321);
        }
        return var307;
    }
    
    public static SubLObject f33417(final SubLObject var302, final SubLObject var309) {
        return f33390(Mapping.mapcar((SubLObject)module0538.$ic166$, var302), var309);
    }
    
    public static SubLObject f33418(final SubLObject var310) {
        return f33419(var310);
    }
    
    public static SubLObject f33419(final SubLObject var310) {
        if (module0538.NIL != assertion_handles_oc.f11035(var310)) {
            return var310;
        }
        final SubLObject var311 = module0191.f11965(var310);
        SubLObject var312 = conses_high.copy_tree(module0191.f11969(var310));
        final SubLObject var313 = module0191.f11976(var310);
        final SubLObject var314 = module0191.f11978(var310);
        final SubLObject var315 = module0191.f11980(var310);
        if (var314 == module0538.$ic167$) {
            var312 = module0205.f13338(var312);
        }
        final SubLObject var316 = f33420(var311, var312, var313, var315);
        return var316;
    }
    
    public static SubLObject f33421(final SubLObject var310) {
        final SubLObject var311 = module0191.f11965(var310);
        SubLObject var312 = module0191.f11969(var310);
        final SubLObject var313 = module0191.f11976(var310);
        final SubLObject var314 = module0191.f11978(var310);
        final SubLObject var315 = module0191.f11980(var310);
        if (module0538.NIL != assertion_handles_oc.f11035(var310)) {
            var312 = module0290.f19495(var310);
        }
        var312 = conses_high.copy_tree(var312);
        if (var314 == module0538.$ic167$) {
            var312 = module0205.f13338(var312);
        }
        final SubLObject var316 = f33420(var311, var312, var313, var315);
        return var316;
    }
    
    public static SubLObject f33420(final SubLObject var311, final SubLObject var50, SubLObject var51, SubLObject var159) {
        if (var51 == module0538.UNPROVIDED) {
            var51 = module0147.$g2095$.getDynamicValue();
        }
        if (var159 == module0538.UNPROVIDED) {
            var159 = (SubLObject)module0538.$ic108$;
        }
        return (SubLObject)ConsesLow.list(var311, var50, var51, var159);
    }
    
    public static SubLObject f33416(final SubLObject var314, SubLObject var300) {
        if (var300 == module0538.UNPROVIDED) {
            var300 = (SubLObject)module0538.NIL;
        }
        final SubLThread var315 = SubLProcess.currentSubLThread();
        SubLObject var316 = (SubLObject)module0538.NIL;
        SubLObject var317 = var314;
        SubLObject var318 = (SubLObject)module0538.NIL;
        var318 = var317.first();
        while (module0538.NIL != var317) {
            if (module0538.NIL != assertion_handles_oc.f11035(var318)) {
                var316 = (SubLObject)ConsesLow.cons(var318, var316);
            }
            else {
                SubLObject var320;
                final SubLObject var319 = var320 = var318;
                SubLObject var321 = (SubLObject)module0538.NIL;
                SubLObject var322 = (SubLObject)module0538.NIL;
                SubLObject var323 = (SubLObject)module0538.NIL;
                SubLObject var324 = (SubLObject)module0538.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var320, var319, (SubLObject)module0538.$ic168$);
                var321 = var320.first();
                var320 = var320.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var320, var319, (SubLObject)module0538.$ic168$);
                var322 = var320.first();
                var320 = var320.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var320, var319, (SubLObject)module0538.$ic168$);
                var323 = var320.first();
                var320 = var320.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var320, var319, (SubLObject)module0538.$ic168$);
                var324 = var320.first();
                var320 = var320.rest();
                if (module0538.NIL == var320) {
                    var323 = f33380(var323);
                    if (module0538.NIL != f33324()) {
                        return Values.values((SubLObject)module0538.NIL, f33325());
                    }
                    if (var321.eql(module0191.$g2251$.getGlobalValue())) {
                        var315.resetMultipleValues();
                        final SubLObject var325 = f33422(var322, var323);
                        final SubLObject var326 = var315.secondMultipleValue();
                        final SubLObject var327 = var315.thirdMultipleValue();
                        var315.resetMultipleValues();
                        if (module0538.NIL != var327) {
                            return Values.values((SubLObject)module0538.NIL, (SubLObject)ConsesLow.list((SubLObject)module0538.$ic169$, (SubLObject)module0538.$ic170$, var318));
                        }
                        if (module0538.NIL == var326) {
                            return Values.values((SubLObject)module0538.NIL, (SubLObject)ConsesLow.list((SubLObject)module0538.$ic145$, (SubLObject)module0538.$ic146$, var322, var323));
                        }
                        if (module0538.NIL == var325) {
                            return Values.values((SubLObject)module0538.NIL, (SubLObject)ConsesLow.list((SubLObject)module0538.$ic169$, (SubLObject)module0538.$ic170$, var318));
                        }
                        SubLObject var55_319 = var325;
                        SubLObject var328 = (SubLObject)module0538.NIL;
                        var328 = var55_319.first();
                        while (module0538.NIL != var55_319) {
                            if (module0538.NIL == assertion_handles_oc.f11035(var328)) {
                                return Values.values((SubLObject)module0538.NIL, (SubLObject)ConsesLow.list((SubLObject)module0538.$ic169$, (SubLObject)module0538.$ic170$, var318));
                            }
                            var316 = (SubLObject)ConsesLow.cons(var328, var316);
                            var55_319 = var55_319.rest();
                            var328 = var55_319.first();
                        }
                    }
                    else {
                        final SubLObject var329 = module0130.f8529((SubLObject)module0538.$ic171$, var324);
                        final SubLObject var330 = module0191.f11990(var321, var322, var323, var329);
                        if (module0538.NIL != var300 && module0538.NIL != module0342.f23157(var330)) {
                            return Values.values((SubLObject)module0538.NIL, (SubLObject)ConsesLow.list((SubLObject)module0538.$ic172$, (SubLObject)module0538.$ic173$, var318));
                        }
                        var316 = (SubLObject)ConsesLow.cons(var330, var316);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var319, (SubLObject)module0538.$ic168$);
                }
            }
            var317 = var317.rest();
            var318 = var317.first();
        }
        return Sequences.nreverse(var316);
    }
    
    public static SubLObject f33422(final SubLObject var184, final SubLObject var51) {
        final SubLObject var185 = module0543.f33697(var184, var51);
        if (module0538.NIL != var185) {
            return Values.values(var185, (SubLObject)module0538.T, (SubLObject)module0538.NIL);
        }
        return f33373(var184, var51);
    }
    
    public static SubLObject f33423(final SubLObject var184, final SubLObject var51, final SubLObject var115, SubLObject var300) {
        if (var300 == module0538.UNPROVIDED) {
            var300 = (SubLObject)module0538.NIL;
        }
        return f33330((SubLObject)module0538.$ic174$, var184, module0162.f10628(var51), var115, var300, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33424(final SubLObject var184, SubLObject var51, SubLObject var115, SubLObject var300) {
        if (var300 == module0538.UNPROVIDED) {
            var300 = (SubLObject)module0538.NIL;
        }
        final SubLThread var301 = SubLProcess.currentSubLThread();
        f33316();
        if (module0538.NIL == module0202.f12590(var184)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic106$, var184));
            return (SubLObject)module0538.NIL;
        }
        var51 = f33380(var51);
        if (module0538.NIL != f33324()) {
            return (SubLObject)module0538.NIL;
        }
        if (!var115.isCons()) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic106$, var115));
            return (SubLObject)module0538.NIL;
        }
        SubLObject var302 = var115;
        SubLObject var303 = (SubLObject)module0538.NIL;
        var303 = var302.first();
        while (module0538.NIL != var302) {
            if (module0538.NIL == module0191.f11950(var303)) {
                f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic163$, var303));
                return (SubLObject)module0538.NIL;
            }
            var302 = var302.rest();
            var303 = var302.first();
        }
        var301.resetMultipleValues();
        final SubLObject var304 = f33416(var115, var300);
        final SubLObject var305 = var301.secondMultipleValue();
        var301.resetMultipleValues();
        if (module0538.NIL != var305) {
            f33323(var305);
            return (SubLObject)module0538.NIL;
        }
        var115 = var304;
        SubLObject var306 = (SubLObject)module0538.NIL;
        final SubLObject var307 = module0528.f32898();
        assert module0538.NIL != module0055.f4006(var307) : var307;
        final SubLObject var308 = module0131.$g1538$.currentBinding(var301);
        try {
            module0131.$g1538$.bind(var307, var301);
            final SubLObject var34_321 = module0538.$g3925$.currentBinding(var301);
            try {
                module0538.$g3925$.bind((SubLObject)module0538.T, var301);
                final SubLObject var34_322 = module0147.$g2094$.currentBinding(var301);
                final SubLObject var309 = module0147.$g2095$.currentBinding(var301);
                try {
                    module0147.$g2094$.bind((SubLObject)module0538.$ic175$, var301);
                    module0147.$g2095$.bind(var51, var301);
                    SubLObject var310 = (SubLObject)module0538.NIL;
                    var301.resetMultipleValues();
                    final SubLObject var323_324 = module0285.f18917(var184, var51);
                    final SubLObject var325_326 = var301.secondMultipleValue();
                    var301.resetMultipleValues();
                    var310 = var323_324;
                    var51 = var325_326;
                    if (module0538.NIL == var310) {
                        f33323(f33383(var184, var51));
                    }
                    else if (module0538.NIL != module0213.f14081(var310, module0538.$ic115$)) {
                        f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic116$, (SubLObject)module0538.$ic150$, var184, var51));
                    }
                    else if (module0538.NIL != module0213.f14081(var310, module0538.$ic118$)) {
                        f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic119$, (SubLObject)module0538.$ic151$, var184, var51));
                    }
                    else {
                        SubLObject var311 = var310;
                        SubLObject var312 = (SubLObject)module0538.NIL;
                        var312 = var311.first();
                        while (module0538.NIL != var311) {
                            if (module0538.NIL == f33324()) {
                                SubLObject var314;
                                final SubLObject var313 = var314 = var312;
                                SubLObject var315 = (SubLObject)module0538.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var314, var313, (SubLObject)module0538.$ic121$);
                                var315 = var314.first();
                                var314 = var314.rest();
                                final SubLObject var316 = (SubLObject)(var314.isCons() ? var314.first() : module0538.NIL);
                                cdestructuring_bind.destructuring_bind_must_listp(var314, var313, (SubLObject)module0538.$ic121$);
                                var314 = var314.rest();
                                final SubLObject var317 = (SubLObject)(var314.isCons() ? var314.first() : module0538.NIL);
                                cdestructuring_bind.destructuring_bind_must_listp(var314, var313, (SubLObject)module0538.$ic121$);
                                var314 = var314.rest();
                                if (module0538.NIL == var314) {
                                    module0195.f12228(var315, var51, var115);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var313, (SubLObject)module0538.$ic121$);
                                }
                            }
                            var311 = var311.rest();
                            var312 = var311.first();
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var309, var301);
                    module0147.$g2094$.rebind(var34_322, var301);
                }
                var306 = (SubLObject)SubLObjectFactory.makeBoolean(module0538.NIL == f33324());
            }
            finally {
                module0538.$g3925$.rebind(var34_321, var301);
            }
            if (module0538.NIL == f33324()) {
                module0528.f32921();
            }
        }
        finally {
            module0131.$g1538$.rebind(var308, var301);
        }
        return var306;
    }
    
    public static SubLObject f33425(final SubLObject var50, final SubLObject var51) {
        return f33330((SubLObject)module0538.$ic176$, var50, module0162.f10628(var51), (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33426(final SubLObject var50, SubLObject var51) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        f33316();
        if (module0538.NIL == module0202.f12590(var50)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic106$, var50));
            return (SubLObject)module0538.NIL;
        }
        SubLObject var53 = (SubLObject)module0538.NIL;
        final SubLObject var54 = module0528.f32898();
        assert module0538.NIL != module0055.f4006(var54) : var54;
        final SubLObject var55 = module0131.$g1538$.currentBinding(var52);
        try {
            module0131.$g1538$.bind(var54, var52);
            final SubLObject var34_329 = module0538.$g3925$.currentBinding(var52);
            final SubLObject var56 = module0146.$g2055$.currentBinding(var52);
            try {
                module0538.$g3925$.bind((SubLObject)module0538.T, var52);
                module0146.$g2055$.bind((SubLObject)module0538.NIL, var52);
                SubLObject var57 = (SubLObject)module0538.NIL;
                var52.resetMultipleValues();
                final SubLObject var330_331 = f33403(var50, var51);
                final SubLObject var332_333 = var52.secondMultipleValue();
                var52.resetMultipleValues();
                var57 = var330_331;
                var51 = var332_333;
                final SubLObject var58 = f33380(var51);
                if (module0538.NIL == f33324()) {
                    final SubLObject var59 = module0147.f9540(var58);
                    final SubLObject var34_330 = module0147.$g2095$.currentBinding(var52);
                    final SubLObject var35_335 = module0147.$g2094$.currentBinding(var52);
                    final SubLObject var60 = module0147.$g2096$.currentBinding(var52);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var59), var52);
                        module0147.$g2094$.bind(module0147.f9546(var59), var52);
                        module0147.$g2096$.bind(module0147.f9549(var59), var52);
                        if (module0538.NIL == var57) {
                            f33323(f33383(var50, var51));
                        }
                        else if (module0538.NIL != module0213.f14081(var57, module0538.$ic115$)) {
                            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic116$, (SubLObject)module0538.$ic117$, var50, var51));
                        }
                        else if (module0538.NIL != module0213.f14081(var57, module0538.$ic118$)) {
                            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic119$, (SubLObject)module0538.$ic120$, var50, var51));
                        }
                        else {
                            SubLObject var61 = var57;
                            SubLObject var62 = (SubLObject)module0538.NIL;
                            var62 = var61.first();
                            while (module0538.NIL != var61) {
                                if (module0538.NIL == f33324()) {
                                    SubLObject var64;
                                    final SubLObject var63 = var64 = var62;
                                    SubLObject var65 = (SubLObject)module0538.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(var64, var63, (SubLObject)module0538.$ic121$);
                                    var65 = var64.first();
                                    var64 = var64.rest();
                                    final SubLObject var66 = (SubLObject)(var64.isCons() ? var64.first() : module0538.NIL);
                                    cdestructuring_bind.destructuring_bind_must_listp(var64, var63, (SubLObject)module0538.$ic121$);
                                    var64 = var64.rest();
                                    final SubLObject var67 = (SubLObject)(var64.isCons() ? var64.first() : module0538.NIL);
                                    cdestructuring_bind.destructuring_bind_must_listp(var64, var63, (SubLObject)module0538.$ic121$);
                                    var64 = var64.rest();
                                    if (module0538.NIL == var64) {
                                        module0195.f12220(var65, var51);
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(var63, (SubLObject)module0538.$ic121$);
                                    }
                                }
                                var61 = var61.rest();
                                var62 = var61.first();
                            }
                        }
                    }
                    finally {
                        module0147.$g2096$.rebind(var60, var52);
                        module0147.$g2094$.rebind(var35_335, var52);
                        module0147.$g2095$.rebind(var34_330, var52);
                    }
                }
                var53 = (SubLObject)SubLObjectFactory.makeBoolean(module0538.NIL == f33324());
            }
            finally {
                module0146.$g2055$.rebind(var56, var52);
                module0538.$g3925$.rebind(var34_329, var52);
            }
            if (module0538.NIL == f33324()) {
                module0528.f32921();
            }
        }
        finally {
            module0131.$g1538$.rebind(var55, var52);
        }
        return var53;
    }
    
    public static SubLObject f33427(final SubLObject var50, SubLObject var51, SubLObject var338, SubLObject var339, SubLObject var340, SubLObject var341) {
        if (var51 == module0538.UNPROVIDED) {
            var51 = (SubLObject)module0538.NIL;
        }
        if (var338 == module0538.UNPROVIDED) {
            var338 = (SubLObject)module0538.NIL;
        }
        if (var339 == module0538.UNPROVIDED) {
            var339 = (SubLObject)module0538.NIL;
        }
        if (var340 == module0538.UNPROVIDED) {
            var340 = (SubLObject)module0538.NIL;
        }
        if (var341 == module0538.UNPROVIDED) {
            var341 = (SubLObject)module0538.NIL;
        }
        return f33330((SubLObject)module0538.$ic179$, var50, module0162.f10628(var51), var338, var339, var340, var341, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33428(final SubLObject var50, SubLObject var51, SubLObject var338, SubLObject var339, SubLObject var340, SubLObject var341) {
        if (var51 == module0538.UNPROVIDED) {
            var51 = (SubLObject)module0538.NIL;
        }
        if (var338 == module0538.UNPROVIDED) {
            var338 = (SubLObject)module0538.NIL;
        }
        if (var339 == module0538.UNPROVIDED) {
            var339 = (SubLObject)module0538.NIL;
        }
        if (var340 == module0538.UNPROVIDED) {
            var340 = (SubLObject)module0538.NIL;
        }
        if (var341 == module0538.UNPROVIDED) {
            var341 = (SubLObject)module0538.NIL;
        }
        final SubLThread var342 = SubLProcess.currentSubLThread();
        f33316();
        if (module0538.NIL == module0202.f12590(var50) && module0538.NIL == module0206.f13427(var50)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic184$, var50));
            return (SubLObject)module0538.NIL;
        }
        if (module0538.NIL != f33429(var50)) {
            SubLObject var343 = (SubLObject)module0538.NIL;
            SubLObject var344 = (SubLObject)module0538.NIL;
            SubLObject var345 = (SubLObject)module0538.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var50, var50, (SubLObject)module0538.$ic185$);
            var343 = var50.first();
            SubLObject var346 = var50.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var346, var50, (SubLObject)module0538.$ic185$);
            var344 = var346.first();
            var346 = var346.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var346, var50, (SubLObject)module0538.$ic185$);
            var345 = var346.first();
            var346 = var346.rest();
            if (module0538.NIL == var346) {
                return f33428(var345, var344, var338, var339, var340, var341);
            }
            cdestructuring_bind.cdestructuring_bind_error(var50, (SubLObject)module0538.$ic185$);
            return (SubLObject)module0538.NIL;
        }
        else {
            if (module0538.NIL == var51) {
                var51 = module0132.$g1568$.getGlobalValue();
            }
            var51 = f33430(var51);
            if (module0538.NIL != f33324()) {
                return (SubLObject)module0538.NIL;
            }
            if (module0538.NIL != var338 && var338 != module0538.T && !var338.isInteger()) {
                f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic186$, var338));
                return (SubLObject)module0538.NIL;
            }
            if (module0538.NIL != var339 && !var339.isInteger()) {
                f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic186$, var339));
                return (SubLObject)module0538.NIL;
            }
            if (module0538.NIL != var340 && !var340.isInteger()) {
                f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic186$, var340));
                return (SubLObject)module0538.NIL;
            }
            if (module0538.NIL != var341 && !var341.isInteger()) {
                f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic186$, var341));
                return (SubLObject)module0538.NIL;
            }
            SubLObject var347 = (SubLObject)module0538.NIL;
            SubLObject var348 = (SubLObject)module0538.NIL;
            final SubLObject var349 = module0528.f32898();
            assert module0538.NIL != module0055.f4006(var349) : var349;
            final SubLObject var350 = module0131.$g1538$.currentBinding(var342);
            try {
                module0131.$g1538$.bind(var349, var342);
                final SubLObject var34_348 = module0538.$g3925$.currentBinding(var342);
                try {
                    module0538.$g3925$.bind((SubLObject)module0538.T, var342);
                    var342.resetMultipleValues();
                    final SubLObject var349_350 = f33431(var50, var51, var338, var339, var340, var341);
                    final SubLObject var351_352 = var342.secondMultipleValue();
                    var342.resetMultipleValues();
                    var347 = var349_350;
                    var348 = var351_352;
                }
                finally {
                    module0538.$g3925$.rebind(var34_348, var342);
                }
                if (module0538.NIL == f33324()) {
                    module0528.f32921();
                }
            }
            finally {
                module0131.$g1538$.rebind(var350, var342);
            }
            return Values.values(var347, var348);
        }
    }
    
    public static SubLObject f33429(final SubLObject var50) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0538.NIL != module0202.f12589(var50, module0538.$ic187$) && Sequences.length(var50).numE((SubLObject)module0538.THREE_INTEGER) && module0538.NIL != module0173.f10955(conses_high.second(var50)) && conses_high.third(var50).isCons());
    }
    
    public static SubLObject f33431(final SubLObject var184, final SubLObject var51, final SubLObject var338, final SubLObject var339, final SubLObject var340, final SubLObject var341) {
        final SubLObject var342 = module0434.f30570(var338, var339, var340, var341);
        return module0409.f28506(var184, var51, var342);
    }
    
    public static SubLObject f33432(SubLObject var338, SubLObject var339, SubLObject var340, SubLObject var341, SubLObject var354) {
        if (var338 == module0538.UNPROVIDED) {
            var338 = (SubLObject)module0538.NIL;
        }
        if (var339 == module0538.UNPROVIDED) {
            var339 = (SubLObject)module0538.NIL;
        }
        if (var340 == module0538.UNPROVIDED) {
            var340 = (SubLObject)module0538.NIL;
        }
        if (var341 == module0538.UNPROVIDED) {
            var341 = (SubLObject)module0538.NIL;
        }
        if (var354 == module0538.UNPROVIDED) {
            var354 = (SubLObject)module0538.NIL;
        }
        return f33330((SubLObject)module0538.$ic188$, var338, var339, var340, var341, var354, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33433(SubLObject var338, SubLObject var339, SubLObject var340, SubLObject var341, SubLObject var354) {
        if (var338 == module0538.UNPROVIDED) {
            var338 = (SubLObject)module0538.NIL;
        }
        if (var339 == module0538.UNPROVIDED) {
            var339 = (SubLObject)module0538.NIL;
        }
        if (var340 == module0538.UNPROVIDED) {
            var340 = (SubLObject)module0538.NIL;
        }
        if (var341 == module0538.UNPROVIDED) {
            var341 = (SubLObject)module0538.NIL;
        }
        if (var354 == module0538.UNPROVIDED) {
            var354 = (SubLObject)module0538.NIL;
        }
        Errors.error((SubLObject)module0538.$ic194$);
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33434() {
        Errors.error((SubLObject)module0538.$ic195$);
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33435() {
        Errors.error((SubLObject)module0538.$ic200$);
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33436(final SubLObject var50, final SubLObject var51) {
        return f33330((SubLObject)module0538.$ic201$, var50, module0162.f10628(var51), (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33437(final SubLObject var50, SubLObject var51) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        f33316();
        if (module0538.NIL == module0202.f12590(var50)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic106$, var50));
            return (SubLObject)module0538.NIL;
        }
        var51 = f33380(var51);
        if (module0538.NIL != f33324()) {
            return (SubLObject)module0538.NIL;
        }
        SubLObject var53 = (SubLObject)module0538.NIL;
        final SubLObject var54 = module0528.f32898();
        assert module0538.NIL != module0055.f4006(var54) : var54;
        final SubLObject var55 = module0131.$g1538$.currentBinding(var52);
        try {
            module0131.$g1538$.bind(var54, var52);
            final SubLObject var34_355 = module0538.$g3925$.currentBinding(var52);
            try {
                module0538.$g3925$.bind((SubLObject)module0538.T, var52);
                final SubLObject var56 = module0543.f33697(var50, var51);
                if (module0538.NIL != var56) {
                    SubLObject var57 = var56;
                    SubLObject var58 = (SubLObject)module0538.NIL;
                    var58 = var57.first();
                    while (module0538.NIL != var57) {
                        module0342.f23162(var58);
                        var57 = var57.rest();
                        var58 = var57.first();
                    }
                }
                else {
                    SubLObject var59 = (SubLObject)module0538.NIL;
                    var52.resetMultipleValues();
                    final SubLObject var356_357 = module0285.f18897(var50, var51);
                    final SubLObject var358_359 = var52.secondMultipleValue();
                    var52.resetMultipleValues();
                    var59 = var356_357;
                    var51 = var358_359;
                    if (module0538.NIL == var59) {
                        f33323(f33383(var50, var51));
                    }
                    else if (module0538.NIL == module0206.f13427(var59)) {
                        SubLObject var60 = var59;
                        SubLObject var61 = (SubLObject)module0538.NIL;
                        var61 = var60.first();
                        while (module0538.NIL != var60) {
                            var52.resetMultipleValues();
                            final SubLObject var62 = f33413(var61, (SubLObject)module0538.T, (SubLObject)module0538.UNPROVIDED);
                            final SubLObject var63 = var52.secondMultipleValue();
                            final SubLObject var64 = var52.thirdMultipleValue();
                            var52.resetMultipleValues();
                            final SubLObject var65 = module0217.f14415(var62, var51);
                            if (module0538.NIL == var65) {
                                f33320((SubLObject)ConsesLow.list((SubLObject)module0538.$ic145$, (SubLObject)module0538.$ic146$, var50, var51));
                            }
                            else {
                                module0342.f23162(var65);
                            }
                            var60 = var60.rest();
                            var61 = var60.first();
                        }
                    }
                }
                var53 = (SubLObject)SubLObjectFactory.makeBoolean(module0538.NIL == f33324());
            }
            finally {
                module0538.$g3925$.rebind(var34_355, var52);
            }
            if (module0538.NIL == f33324()) {
                module0528.f32921();
            }
        }
        finally {
            module0131.$g1538$.rebind(var55, var52);
        }
        return var53;
    }
    
    public static SubLObject f33438(final SubLObject var51) {
        return f33330((SubLObject)module0538.$ic204$, module0162.f10628(var51), (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33439(SubLObject var51) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        f33316();
        var51 = f33380(var51);
        if (module0538.NIL != f33324()) {
            return (SubLObject)module0538.NIL;
        }
        SubLObject var53 = (SubLObject)module0538.NIL;
        final SubLObject var54 = module0528.f32898();
        assert module0538.NIL != module0055.f4006(var54) : var54;
        final SubLObject var55 = module0131.$g1538$.currentBinding(var52);
        try {
            module0131.$g1538$.bind(var54, var52);
            final SubLObject var34_360 = module0538.$g3925$.currentBinding(var52);
            try {
                module0538.$g3925$.bind((SubLObject)module0538.T, var52);
                module0342.f23163(var51);
                var53 = (SubLObject)SubLObjectFactory.makeBoolean(module0538.NIL == f33324());
            }
            finally {
                module0538.$g3925$.rebind(var34_360, var52);
            }
            if (module0538.NIL == f33324()) {
                module0528.f32921();
            }
        }
        finally {
            module0131.$g1538$.rebind(var55, var52);
        }
        return var53;
    }
    
    public static SubLObject f33440(final SubLObject var361, SubLObject var362, SubLObject var363, SubLObject var51) {
        if (var362 == module0538.UNPROVIDED) {
            var362 = (SubLObject)module0538.NIL;
        }
        if (var363 == module0538.UNPROVIDED) {
            var363 = (SubLObject)module0538.NIL;
        }
        if (var51 == module0538.UNPROVIDED) {
            var51 = (SubLObject)module0538.NIL;
        }
        return f33330((SubLObject)module0538.$ic208$, var361, var362, var363, module0162.f10628(var51), (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33441(SubLObject var361, SubLObject var362, SubLObject var363, SubLObject var51) {
        if (var362 == module0538.UNPROVIDED) {
            var362 = (SubLObject)module0538.NIL;
        }
        if (var363 == module0538.UNPROVIDED) {
            var363 = (SubLObject)module0538.NIL;
        }
        if (var51 == module0538.UNPROVIDED) {
            var51 = (SubLObject)module0538.NIL;
        }
        final SubLThread var364 = SubLProcess.currentSubLThread();
        f33316();
        var361 = f33356(var361);
        if (module0538.NIL != f33324()) {
            return (SubLObject)module0538.NIL;
        }
        if (module0538.NIL != var362 && (!var362.isFixnum() || module0538.NIL == module0130.f8531(var362))) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic212$, var362));
            return (SubLObject)module0538.NIL;
        }
        if (module0538.NIL != var363) {
            var363 = f33356(var363);
            if (module0538.NIL != f33324()) {
                return (SubLObject)module0538.NIL;
            }
        }
        if (module0538.NIL != var51) {
            var51 = f33380(var51);
            if (module0538.NIL != f33324()) {
                return (SubLObject)module0538.NIL;
            }
        }
        SubLObject var365 = (SubLObject)module0538.NIL;
        final SubLObject var366 = module0528.f32898();
        assert module0538.NIL != module0055.f4006(var366) : var366;
        final SubLObject var367 = module0131.$g1538$.currentBinding(var364);
        try {
            module0131.$g1538$.bind(var366, var364);
            final SubLObject var34_364 = module0538.$g3925$.currentBinding(var364);
            try {
                module0538.$g3925$.bind((SubLObject)module0538.T, var364);
                if (module0538.NIL == var362) {
                    module0342.f23164(var361, var51);
                }
                else if (var362.isZero()) {
                    module0342.f23165(var361, var51);
                }
                else {
                    module0342.f23166(var361, var362, var363, var51);
                }
                var365 = (SubLObject)SubLObjectFactory.makeBoolean(module0538.NIL == f33324());
            }
            finally {
                module0538.$g3925$.rebind(var34_364, var364);
            }
            if (module0538.NIL == f33324()) {
                module0528.f32921();
            }
        }
        finally {
            module0131.$g1538$.rebind(var367, var364);
        }
        return var365;
    }
    
    public static SubLObject f33442(final SubLObject var361, SubLObject var51) {
        if (var51 == module0538.UNPROVIDED) {
            var51 = (SubLObject)module0538.NIL;
        }
        return f33330((SubLObject)module0538.$ic213$, var361, var51, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33443(SubLObject var361, SubLObject var51) {
        if (var51 == module0538.UNPROVIDED) {
            var51 = (SubLObject)module0538.NIL;
        }
        final SubLThread var362 = SubLProcess.currentSubLThread();
        f33316();
        var361 = f33356(var361);
        if (module0538.NIL != f33324()) {
            return (SubLObject)module0538.NIL;
        }
        if (module0538.NIL != var51) {
            var51 = f33380(var51);
            if (module0538.NIL != f33324()) {
                return (SubLObject)module0538.NIL;
            }
        }
        SubLObject var363 = (SubLObject)module0538.NIL;
        final SubLObject var364 = module0528.f32898();
        assert module0538.NIL != module0055.f4006(var364) : var364;
        final SubLObject var365 = module0131.$g1538$.currentBinding(var362);
        try {
            module0131.$g1538$.bind(var364, var362);
            final SubLObject var34_365 = module0538.$g3925$.currentBinding(var362);
            try {
                module0538.$g3925$.bind((SubLObject)module0538.T, var362);
                module0342.f23167(var361, var51);
                var363 = (SubLObject)SubLObjectFactory.makeBoolean(module0538.NIL == f33324());
            }
            finally {
                module0538.$g3925$.rebind(var34_365, var362);
            }
            if (module0538.NIL == f33324()) {
                module0528.f32921();
            }
        }
        finally {
            module0131.$g1538$.rebind(var365, var362);
        }
        return var363;
    }
    
    public static SubLObject f33444(final SubLObject var366) {
        return f33330((SubLObject)module0538.$ic217$, var366, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33445(final SubLObject var366) {
        final SubLThread var367 = SubLProcess.currentSubLThread();
        f33316();
        if (!var366.isString()) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic34$, var366));
            return (SubLObject)module0538.NIL;
        }
        SubLObject var368 = (SubLObject)module0538.NIL;
        final SubLObject var369 = module0538.$g3925$.currentBinding(var367);
        try {
            module0538.$g3925$.bind((SubLObject)module0538.T, var367);
            var368 = module0731.f44783(var366, (SubLObject)module0538.$ic218$, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
        }
        finally {
            module0538.$g3925$.rebind(var369, var367);
        }
        return var368;
    }
    
    public static SubLObject f33446(final SubLObject var367, final SubLObject var340, SubLObject var164, SubLObject var165) {
        if (var164 == module0538.UNPROVIDED) {
            var164 = (SubLObject)module0538.NIL;
        }
        if (var165 == module0538.UNPROVIDED) {
            var165 = (SubLObject)module0538.NIL;
        }
        return f33330((SubLObject)module0538.$ic219$, var367, var340, var164, var165, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33447(SubLObject var367, final SubLObject var340, SubLObject var164, SubLObject var165) {
        if (var164 == module0538.UNPROVIDED) {
            var164 = (SubLObject)module0538.NIL;
        }
        if (var165 == module0538.UNPROVIDED) {
            var165 = (SubLObject)module0538.NIL;
        }
        final SubLThread var368 = SubLProcess.currentSubLThread();
        var367 = module0290.f19514(var367);
        if (module0538.NIL != var164) {
            var164 = module0290.f19514(var164);
        }
        f33316();
        SubLObject var369 = (SubLObject)module0538.NIL;
        final SubLObject var370 = module0538.$g3925$.currentBinding(var368);
        try {
            module0538.$g3925$.bind((SubLObject)module0538.T, var368);
            if (module0538.NIL == module0173.f10955(var367)) {
                f33320((SubLObject)module0538.$ic220$);
            }
            else if (!var340.isInteger()) {
                f33320((SubLObject)module0538.$ic221$);
            }
            else if (module0538.NIL != var164 && module0538.NIL == constant_handles_oc.f8449(var164)) {
                f33320((SubLObject)module0538.$ic222$);
            }
            else if (module0538.NIL != var165 && module0538.NIL == module0051.f3631(var165)) {
                f33320((SubLObject)module0538.$ic223$);
            }
            else if (module0538.NIL == constant_handles_oc.f8449(module0538.$g3923$.getDynamicValue(var368))) {
                f33320((SubLObject)module0538.$ic224$);
            }
            else if (module0538.NIL != f33448(module0538.$g3923$.getDynamicValue(var368))) {
                f33320((SubLObject)module0538.$ic225$);
            }
            else {
                f33449(module0538.$g3923$.getDynamicValue(var368), var367, var340, var164, var165);
            }
            var369 = (SubLObject)SubLObjectFactory.makeBoolean(module0538.NIL == f33324());
            module0538.$g3923$.setDynamicValue((SubLObject)module0538.NIL, var368);
            module0538.$g3924$.setDynamicValue((SubLObject)module0538.NIL, var368);
        }
        finally {
            module0538.$g3925$.rebind(var370, var368);
        }
        return var369;
    }
    
    public static SubLObject f33448(final SubLObject var47) {
        assert module0538.NIL != constant_handles_oc.f8449(var47) : var47;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0538.NIL != module0220.f14556(var47, module0538.$ic227$, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED) || module0538.NIL != module0220.f14556(var47, module0538.$ic228$, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED) || module0538.NIL != module0220.f14556(var47, module0538.$ic229$, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED) || module0538.NIL != module0220.f14556(var47, module0538.$ic230$, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED));
    }
    
    public static SubLObject f33449(final SubLObject var47, final SubLObject var367, final SubLObject var340, SubLObject var164, SubLObject var165) {
        if (var164 == module0538.UNPROVIDED) {
            var164 = (SubLObject)module0538.NIL;
        }
        if (var165 == module0538.UNPROVIDED) {
            var165 = (SubLObject)module0538.NIL;
        }
        final SubLObject var368 = (SubLObject)ConsesLow.list((SubLObject)module0538.$ic231$, (SubLObject)module0538.$ic57$, (SubLObject)module0538.$ic232$, (SubLObject)module0538.$ic133$);
        module0540.f33517((SubLObject)ConsesLow.list(module0538.$ic227$, var47, var367), module0538.$ic233$, var368);
        module0540.f33517((SubLObject)ConsesLow.list(module0538.$ic228$, var47, var340), module0538.$ic233$, var368);
        if (module0538.NIL != constant_handles_oc.f8449(var164)) {
            module0540.f33517((SubLObject)ConsesLow.list(module0538.$ic229$, var47, var164), module0538.$ic233$, var368);
        }
        if (module0538.NIL != module0051.f3631(var165)) {
            module0540.f33517((SubLObject)ConsesLow.list(module0538.$ic230$, var47, var165), module0538.$ic233$, var368);
        }
        return var47;
    }
    
    public static SubLObject f33450(final SubLObject var47) {
        final SubLObject var48 = module0220.f14554(var47, module0538.$ic227$, module0538.$ic233$, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
        if (module0538.NIL != var48) {
            f33400((SubLObject)ConsesLow.list(module0538.$ic227$, var47, var48), module0538.$ic233$);
        }
        final SubLObject var49 = module0220.f14554(var47, module0538.$ic228$, module0538.$ic233$, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
        if (module0538.NIL != var49) {
            f33400((SubLObject)ConsesLow.list(module0538.$ic228$, var47, var49), module0538.$ic233$);
        }
        final SubLObject var50 = module0220.f14554(var47, module0538.$ic229$, module0538.$ic233$, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
        if (module0538.NIL != var50) {
            f33400((SubLObject)ConsesLow.list(module0538.$ic229$, var47, var50), module0538.$ic233$);
        }
        final SubLObject var51 = module0220.f14554(var47, module0538.$ic230$, module0538.$ic233$, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
        if (module0538.NIL != var51) {
            f33400((SubLObject)ConsesLow.list(module0538.$ic230$, var47, var51), module0538.$ic233$);
        }
        return var47;
    }
    
    public static SubLObject f33451(final SubLObject var47, final SubLObject var367, final SubLObject var340, SubLObject var164, SubLObject var165) {
        if (var164 == module0538.UNPROVIDED) {
            var164 = (SubLObject)module0538.NIL;
        }
        if (var165 == module0538.UNPROVIDED) {
            var165 = (SubLObject)module0538.NIL;
        }
        if (module0538.NIL != module0173.f10955(var367) && var340.isInteger() && (module0538.NIL == var164 || module0538.NIL != constant_handles_oc.f8449(var164)) && (module0538.NIL == var165 || module0538.NIL != module0051.f3631(var165))) {
            f33450(var47);
            f33449(var47, var367, var340, var164, var165);
        }
        return var47;
    }
    
    public static SubLObject f33452(final SubLObject var367, final SubLObject var340, SubLObject var164, SubLObject var165) {
        if (var164 == module0538.UNPROVIDED) {
            var164 = (SubLObject)module0538.NIL;
        }
        if (var165 == module0538.UNPROVIDED) {
            var165 = (SubLObject)module0538.NIL;
        }
        return f33330((SubLObject)module0538.$ic234$, var367, var340, var164, var165, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33371(SubLObject var367, final SubLObject var340, SubLObject var164, SubLObject var165) {
        if (var164 == module0538.UNPROVIDED) {
            var164 = (SubLObject)module0538.NIL;
        }
        if (var165 == module0538.UNPROVIDED) {
            var165 = (SubLObject)module0538.NIL;
        }
        final SubLThread var368 = SubLProcess.currentSubLThread();
        var367 = module0290.f19514(var367);
        if (module0538.NIL != var164) {
            var164 = module0290.f19514(var164);
        }
        f33316();
        SubLObject var369 = (SubLObject)module0538.NIL;
        final SubLObject var370 = module0538.$g3925$.currentBinding(var368);
        try {
            module0538.$g3925$.bind((SubLObject)module0538.T, var368);
            if (module0538.NIL == module0173.f10955(var367)) {
                f33320((SubLObject)module0538.$ic220$);
            }
            else if (!var340.isInteger()) {
                f33320((SubLObject)module0538.$ic221$);
            }
            else if (module0538.NIL != var164 && module0538.NIL == constant_handles_oc.f8449(var164)) {
                f33320((SubLObject)module0538.$ic222$);
            }
            else if (module0538.NIL != var165 && module0538.NIL == module0051.f3631(var165)) {
                f33320((SubLObject)module0538.$ic223$);
            }
            else if (!module0538.$g3924$.getDynamicValue(var368).isCons()) {
                f33320((SubLObject)module0538.$ic235$);
            }
            else {
                SubLObject var372;
                final SubLObject var371 = var372 = module0538.$g3924$.getDynamicValue(var368);
                SubLObject var373 = (SubLObject)module0538.NIL;
                var373 = var372.first();
                while (module0538.NIL != var372) {
                    if (module0538.NIL != module0178.f11375(var373)) {
                        if (module0538.NIL != oc_assertions_low.f11248(var373)) {
                            f33320((SubLObject)module0538.$ic225$);
                        }
                        else {
                            module0178.f11354(var373, var367, var340, var164, var165);
                        }
                    }
                    var372 = var372.rest();
                    var373 = var372.first();
                }
            }
            var369 = (SubLObject)SubLObjectFactory.makeBoolean(module0538.NIL == f33324());
            module0538.$g3924$.setDynamicValue((SubLObject)module0538.NIL, var368);
        }
        finally {
            module0538.$g3925$.rebind(var370, var368);
        }
        return var369;
    }
    
    public static SubLObject f33453(final SubLObject var184, SubLObject var51) {
        if (var51 == module0538.UNPROVIDED) {
            var51 = (SubLObject)module0538.NIL;
        }
        return f33330((SubLObject)module0538.$ic236$, var184, var51, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33454(final SubLObject var50, SubLObject var51) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        f33316();
        if (module0538.NIL == module0202.f12590(var50)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic106$, var50));
            return (SubLObject)module0538.NIL;
        }
        var51 = f33380(var51);
        if (module0538.NIL != f33324()) {
            return (SubLObject)module0538.NIL;
        }
        SubLObject var53 = (SubLObject)module0538.NIL;
        final SubLObject var54 = module0528.f32898();
        assert module0538.NIL != module0055.f4006(var54) : var54;
        final SubLObject var55 = module0131.$g1538$.currentBinding(var52);
        final SubLObject var56 = module0538.$g3925$.currentBinding(var52);
        try {
            module0131.$g1538$.bind(var54, var52);
            module0538.$g3925$.bind((SubLObject)module0538.T, var52);
            final SubLObject var57 = module0543.f33697(var50, var51);
            if (module0538.NIL != var57) {
                SubLObject var58 = var57;
                SubLObject var59 = (SubLObject)module0538.NIL;
                var59 = var58.first();
                while (module0538.NIL != var58) {
                    module0178.f11355(var59);
                    var58 = var58.rest();
                    var59 = var58.first();
                }
            }
            else {
                SubLObject var60 = (SubLObject)module0538.NIL;
                var52.resetMultipleValues();
                final SubLObject var369_370 = module0285.f18897(var50, var51);
                final SubLObject var371_372 = var52.secondMultipleValue();
                var52.resetMultipleValues();
                var60 = var369_370;
                var51 = var371_372;
                if (module0538.NIL == var60) {
                    f33323(f33383(var50, var51));
                }
                else if (module0538.NIL == module0206.f13427(var60)) {
                    SubLObject var61 = var60;
                    SubLObject var62 = (SubLObject)module0538.NIL;
                    var62 = var61.first();
                    while (module0538.NIL != var61) {
                        var52.resetMultipleValues();
                        final SubLObject var63 = f33413(var62, (SubLObject)module0538.T, (SubLObject)module0538.UNPROVIDED);
                        final SubLObject var64 = var52.secondMultipleValue();
                        final SubLObject var65 = var52.thirdMultipleValue();
                        var52.resetMultipleValues();
                        final SubLObject var66 = module0217.f14415(var63, var51);
                        if (module0538.NIL == var66) {
                            f33320((SubLObject)ConsesLow.list((SubLObject)module0538.$ic145$, (SubLObject)module0538.$ic146$, var50, var51));
                        }
                        else {
                            module0178.f11355(var66);
                        }
                        var61 = var61.rest();
                        var62 = var61.first();
                    }
                }
            }
            var53 = (SubLObject)SubLObjectFactory.makeBoolean(module0538.NIL == f33324());
        }
        finally {
            module0538.$g3925$.rebind(var56, var52);
            module0131.$g1538$.rebind(var55, var52);
        }
        return var53;
    }
    
    public static SubLObject f33455(final SubLObject var184, final SubLObject var373, SubLObject var51) {
        if (var51 == module0538.UNPROVIDED) {
            var51 = (SubLObject)module0538.NIL;
        }
        return f33330((SubLObject)module0538.$ic237$, var184, var373, var51, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33456(SubLObject var50, final SubLObject var373, SubLObject var51) {
        if (var51 == module0538.UNPROVIDED) {
            var51 = (SubLObject)module0538.NIL;
        }
        f33316();
        if (module0538.NIL == module0202.f12590(var50)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic106$, var50));
            return (SubLObject)module0538.NIL;
        }
        if (module0538.NIL != module0202.f12883(var50, (SubLObject)module0538.UNPROVIDED)) {
            var51 = module0202.f12906(var50);
            var50 = module0202.f12887(var50);
        }
        var51 = f33380(var51);
        if (module0538.NIL != f33324()) {
            return (SubLObject)module0538.NIL;
        }
        final SubLObject var374 = module0288.f19342(var50, var51);
        if (module0538.NIL != var374) {
            SubLObject var375 = var374;
            SubLObject var376 = (SubLObject)module0538.NIL;
            var376 = var375.first();
            while (module0538.NIL != var375) {
                if (module0538.NIL != module0202.f12704(var376, var373)) {
                    f33323((SubLObject)module0538.$ic238$);
                    return (SubLObject)module0538.NIL;
                }
                var375 = var375.rest();
                var376 = var375.first();
            }
            var375 = var374;
            var376 = (SubLObject)module0538.NIL;
            var376 = var375.first();
            while (module0538.NIL != var375) {
                module0211.f13684(var376, var373);
                var375 = var375.rest();
                var376 = var375.first();
            }
        }
        else {
            f33320((SubLObject)module0538.$ic235$);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0538.NIL == f33324());
    }
    
    public static SubLObject f33457(final SubLObject var374) {
        return f33330((SubLObject)module0538.$ic239$, var374, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33458(final SubLObject var374) {
        f33316();
        if (!var374.isSymbol()) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic240$, var374));
            return (SubLObject)module0538.NIL;
        }
        if (module0538.NIL == Symbols.boundp(var374)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic241$, (SubLObject)module0538.$ic242$, var374));
            return (SubLObject)module0538.NIL;
        }
        return Symbols.symbol_value(var374);
    }
    
    public static SubLObject f33459(final SubLObject var374, final SubLObject var375) {
        return f33330((SubLObject)module0538.$ic243$, var374, var375, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33460(final SubLObject var374, final SubLObject var375) {
        f33316();
        if (!var374.isSymbol()) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic240$, var374));
            return (SubLObject)module0538.NIL;
        }
        Symbols.set(var374, var375);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0538.NIL == f33324());
    }
    
    public static SubLObject f33461(final SubLObject var376) {
        return f33330((SubLObject)module0538.$ic244$, var376, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33462(final SubLObject var376) {
        f33316();
        return Eval.eval(var376);
    }
    
    public static SubLObject f33463(final SubLObject var376) {
        return f33330((SubLObject)module0538.$ic245$, var376, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33464(final SubLObject var376) {
        f33316();
        return Eval.eval(var376);
    }
    
    public static SubLObject f33465() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return module0111.$g1408$.getDynamicValue(var7);
    }
    
    public static SubLObject f33466(final SubLObject var377) {
        if (module0538.NIL != var377 && !module0538.areAssertionsDisabledFor(me) && module0538.NIL == module0173.f10955(var377)) {
            throw new AssertionError(var377);
        }
        module0111.$g1408$.setDynamicValue(var377);
        return var377;
    }
    
    public static SubLObject f33467() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (module0538.$g3931$.getDynamicValue(var7).isInteger()) {
            return module0538.$g3931$.getDynamicValue(var7);
        }
        return module0051.f3557((SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33468() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (module0538.$g3932$.getDynamicValue(var7).isInteger()) {
            return module0538.$g3932$.getDynamicValue(var7);
        }
        return module0051.f3558((SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33347(final SubLObject var378) {
        if (module0538.NIL != module0206.f13453(var378) && module0538.NIL == module0274.f18172(var378, module0132.$g1548$.getGlobalValue(), (SubLObject)module0538.UNPROVIDED)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic246$, (SubLObject)module0538.$ic247$, var378, module0274.f18200(var378, module0132.$g1548$.getGlobalValue(), (SubLObject)module0538.UNPROVIDED)));
            return (SubLObject)module0538.NIL;
        }
        return f33380(var378);
    }
    
    public static SubLObject f33380(final SubLObject var378) {
        final SubLObject var379 = module0285.f18913(var378);
        if (module0538.NIL == module0161.f10481(var379)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic248$, var378));
            return (SubLObject)module0538.NIL;
        }
        return var379;
    }
    
    public static SubLObject f33430(final SubLObject var378) {
        final SubLObject var379 = module0285.f18908(var378);
        if (module0538.NIL == module0161.f10481(var379)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic248$, var378));
            return (SubLObject)module0538.NIL;
        }
        return var379;
    }
    
    public static SubLObject f33356(final SubLObject var378) {
        final SubLObject var379 = f33469(var378);
        if (module0538.NIL == module0173.f10955(var379)) {
            f33323((SubLObject)ConsesLow.list((SubLObject)module0538.$ic33$, (SubLObject)module0538.$ic249$, var378));
            return (SubLObject)module0538.NIL;
        }
        return var379;
    }
    
    public static SubLObject f33469(SubLObject var378) {
        var378 = module0290.f19514(var378);
        if (module0538.NIL != module0161.f10482(var378)) {
            return var378;
        }
        if (module0538.NIL != module0202.f12659(var378)) {
            return module0172.f10921(var378);
        }
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33413(final SubLObject var380, SubLObject var381, SubLObject var159) {
        if (var381 == module0538.UNPROVIDED) {
            var381 = (SubLObject)module0538.NIL;
        }
        if (var159 == module0538.UNPROVIDED) {
            var159 = (SubLObject)module0538.$ic108$;
        }
        final SubLThread var382 = SubLProcess.currentSubLThread();
        final SubLObject var383 = var380.first();
        final SubLObject var384 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0538.$ic250$), conses_high.second(var380));
        SubLObject var385 = (SubLObject)module0538.NIL;
        if (module0538.NIL != module0018.$g696$.getDynamicValue(var382) && !module0538.areAssertionsDisabledFor(me) && module0538.NIL == f33470(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0538.$ic251$), conses_high.second(var380)))) {
            throw new AssertionError(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0538.$ic251$), conses_high.second(var380)));
        }
        if (module0538.NIL != var381 && module0538.NIL != module0232.f15312(var383) && module0538.NIL == var384) {
            if (module0538.NIL == module0232.f15306(var383)) {
                var385 = (SubLObject)((var159 == module0538.$ic57$) ? module0538.$ic253$ : module0538.$ic254$);
            }
            else {
                ConsesLow.rplaca(var383.rest(), module0232.f15306(var383));
                ConsesLow.rplaca(var383, (SubLObject)module0538.NIL);
                var385 = (SubLObject)((var159 == module0538.$ic57$) ? module0538.$ic255$ : module0538.$ic256$);
            }
        }
        else {
            var385 = (SubLObject)((var159 == module0538.$ic57$) ? module0538.$ic253$ : module0538.$ic254$);
        }
        return Values.values(var383, var384, var385);
    }
    
    public static SubLObject f33471(final SubLObject var50, SubLObject var51) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        SubLObject var53 = (SubLObject)module0538.NIL;
        var52.resetMultipleValues();
        final SubLObject var382_383 = module0285.f18885(var50, var51);
        final SubLObject var384_385 = var52.secondMultipleValue();
        var52.resetMultipleValues();
        var53 = var382_383;
        var51 = var384_385;
        if (var53.isCons() && Sequences.length(var53).numE((SubLObject)module0538.ONE_INTEGER)) {
            return f33413(var53.first(), (SubLObject)module0538.T, (SubLObject)module0538.UNPROVIDED);
        }
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33472() {
        final SubLObject var386 = module0538.$g3933$.getGlobalValue();
        if (module0538.NIL != var386) {
            module0034.f1818(var386);
        }
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33473(final SubLObject var50, final SubLObject var51) {
        return module0034.f1829(module0538.$g3933$.getGlobalValue(), (SubLObject)ConsesLow.list(var50, var51), (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
    }
    
    public static SubLObject f33474(final SubLObject var50, final SubLObject var51) {
        return f33471(var50, var51);
    }
    
    public static SubLObject f33475(final SubLObject var50, final SubLObject var51) {
        SubLObject var52 = module0538.$g3933$.getGlobalValue();
        if (module0538.NIL == var52) {
            var52 = module0034.f1934((SubLObject)module0538.$ic257$, (SubLObject)module0538.$ic258$, (SubLObject)module0538.NIL, (SubLObject)module0538.EQUAL, (SubLObject)module0538.TWO_INTEGER, (SubLObject)module0538.$ic259$);
        }
        final SubLObject var53 = module0034.f1782(var50, var51);
        final SubLObject var54 = module0034.f1814(var52, var53, (SubLObject)module0538.UNPROVIDED);
        if (var54 != module0538.$ic260$) {
            SubLObject var55 = var54;
            SubLObject var56 = (SubLObject)module0538.NIL;
            var56 = var55.first();
            while (module0538.NIL != var55) {
                SubLObject var57 = var56.first();
                final SubLObject var58 = conses_high.second(var56);
                if (var50.equal(var57.first())) {
                    var57 = var57.rest();
                    if (module0538.NIL != var57 && module0538.NIL == var57.rest() && var51.equal(var57.first())) {
                        return module0034.f1959(var58);
                    }
                }
                var55 = var55.rest();
                var56 = var55.first();
            }
        }
        final SubLObject var59 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f33474(var50, var51)));
        module0034.f1836(var52, var53, var54, var59, (SubLObject)ConsesLow.list(var50, var51));
        return module0034.f1959(var59);
    }
    
    public static SubLObject f33476(final SubLObject var394, final SubLObject var51) {
        final SubLThread var395 = SubLProcess.currentSubLThread();
        var395.resetMultipleValues();
        final SubLObject var396 = f33471(var394, var51);
        final SubLObject var397 = var395.secondMultipleValue();
        final SubLObject var398 = var395.thirdMultipleValue();
        var395.resetMultipleValues();
        final SubLObject var399 = module0232.f15308(var396).first();
        if (module0130.f8524(var398) == module0538.$ic167$) {
            return module0205.f13338(var399);
        }
        return var399;
    }
    
    public static SubLObject f33477(final SubLObject var380) {
        SubLObject var381 = (SubLObject)module0538.NIL;
        SubLObject var382 = (SubLObject)module0538.NIL;
        SubLObject var383 = (SubLObject)module0538.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var380, var380, (SubLObject)module0538.$ic261$);
        var381 = var380.first();
        SubLObject var384 = var380.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var384, var380, (SubLObject)module0538.$ic261$);
        var382 = var384.first();
        var384 = var384.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var384, var380, (SubLObject)module0538.$ic261$);
        var383 = var384.first();
        var384 = var384.rest();
        if (module0538.NIL == var384) {
            return Values.values(var381, Mapping.mapcar(Symbols.symbol_function((SubLObject)module0538.$ic262$), var382), var383);
        }
        cdestructuring_bind.cdestructuring_bind_error(var380, (SubLObject)module0538.$ic261$);
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33470(final SubLObject var399) {
        if (var399.isList()) {
            SubLObject var400 = (SubLObject)module0538.NIL;
            if (module0538.NIL == var400) {
                SubLObject var401 = var399;
                SubLObject var402 = (SubLObject)module0538.NIL;
                var402 = var401.first();
                while (module0538.NIL == var400 && module0538.NIL != var401) {
                    if (module0538.NIL == module0193.f12067(var402)) {
                        var400 = (SubLObject)module0538.T;
                    }
                    var401 = var401.rest();
                    var402 = var401.first();
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(module0538.NIL == var400);
        }
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33478(final SubLObject var113, SubLObject var403) {
        if (var403 == module0538.UNPROVIDED) {
            var403 = (SubLObject)module0538.T;
        }
        final SubLThread var404 = SubLProcess.currentSubLThread();
        final SubLObject var405 = module0538.$g3934$.getDynamicValue(var404);
        final SubLObject var406 = module0178.f11287(var113);
        SubLObject var407 = (SubLObject)module0538.NIL;
        if (module0538.NIL != var405 && module0538.NIL == module0161.f10513(var406, var405)) {
            var407 = module0178.f11305(var113);
        }
        else {
            var407 = module0178.f11303(var113);
        }
        var407 = conses_high.copy_tree(var407);
        final SubLObject var408 = module0538.$g3934$.currentBinding(var404);
        try {
            module0538.$g3934$.bind(var406, var404);
            var407 = f33479(var407, (SubLObject)((module0538.NIL != var403) ? module0178.f11348(var113) : module0538.NIL));
        }
        finally {
            module0538.$g3934$.rebind(var408, var404);
        }
        return var407;
    }
    
    public static SubLObject f33367(final SubLObject var113, SubLObject var403) {
        if (var403 == module0538.UNPROVIDED) {
            var403 = (SubLObject)module0538.T;
        }
        final SubLThread var404 = SubLProcess.currentSubLThread();
        assert module0538.NIL != assertion_handles_oc.f11035(var113) : var113;
        SubLObject var405 = (SubLObject)module0538.NIL;
        final SubLObject var406 = module0111.$g1409$.currentBinding(var404);
        try {
            module0111.$g1409$.bind((SubLObject)module0538.NIL, var404);
            var405 = f33478(var113, var403);
        }
        finally {
            module0111.$g1409$.rebind(var406, var404);
        }
        return var405;
    }
    
    public static SubLObject f33480(final SubLObject var113, SubLObject var403) {
        if (var403 == module0538.UNPROVIDED) {
            var403 = (SubLObject)module0538.T;
        }
        return (SubLObject)ConsesLow.list(module0538.$ic187$, module0178.f11287(var113), f33478(var113, var403));
    }
    
    public static SubLObject f33481(final SubLObject var113, SubLObject var403) {
        if (var403 == module0538.UNPROVIDED) {
            var403 = (SubLObject)module0538.T;
        }
        final SubLThread var404 = SubLProcess.currentSubLThread();
        final SubLObject var405 = module0178.f11287(var113);
        SubLObject var406 = conses_high.copy_tree(module0178.f11282(var113));
        final SubLObject var407 = module0538.$g3934$.currentBinding(var404);
        try {
            module0538.$g3934$.bind(var405, var404);
            var406 = f33479(var406, (SubLObject)((module0538.NIL != var403) ? module0178.f11348(var113) : module0538.NIL));
        }
        finally {
            module0538.$g3934$.rebind(var407, var404);
        }
        return var406;
    }
    
    public static SubLObject f33482(final SubLObject var113) {
        final SubLThread var114 = SubLProcess.currentSubLThread();
        SubLObject var115 = (SubLObject)module0538.NIL;
        final SubLObject var116 = module0111.$g1409$.currentBinding(var114);
        try {
            module0111.$g1409$.bind((SubLObject)module0538.NIL, var114);
            var115 = f33479(conses_high.copy_tree(module0178.f11282(var113)), module0178.f11348(var113));
        }
        finally {
            module0111.$g1409$.rebind(var116, var114);
        }
        return var115;
    }
    
    public static SubLObject f33479(SubLObject var405, SubLObject var406) {
        if (var406 == module0538.UNPROVIDED) {
            var406 = (SubLObject)module0538.NIL;
        }
        final SubLThread var407 = SubLProcess.currentSubLThread();
        SubLObject var408 = var406;
        SubLObject var409 = (SubLObject)module0538.NIL;
        var409 = var408.first();
        while (module0538.NIL != var408) {
            final SubLObject var410 = module0193.f12079(Sequences.position(var409, var406, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED));
            var405 = conses_high.nsubst(var409, var410, var405, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
            var408 = var408.rest();
            var409 = var408.first();
        }
        var405 = module0036.f2532(var405, Symbols.symbol_function((SubLObject)module0538.$ic263$), Symbols.symbol_function((SubLObject)module0538.$ic264$), (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED, (SubLObject)module0538.UNPROVIDED);
        if (module0538.NIL != module0111.$g1409$.getDynamicValue(var407)) {
            var405 = f33483(var405);
            var405 = module0172.f10930(var405);
        }
        return var405;
    }
    
    public static SubLObject f33483(SubLObject var405) {
        if (module0538.NIL != module0035.f2439(Symbols.symbol_function((SubLObject)module0538.$ic83$), var405, (SubLObject)module0538.UNPROVIDED)) {
            var405 = module0036.f2531(var405, Symbols.symbol_function((SubLObject)module0538.$ic83$), Symbols.symbol_function((SubLObject)module0538.$ic107$), (SubLObject)module0538.UNPROVIDED);
        }
        return var405;
    }
    
    public static SubLObject f33484(SubLObject var405) {
        if (module0538.NIL != module0035.f2439(Symbols.symbol_function((SubLObject)module0538.$ic83$), var405, (SubLObject)module0538.UNPROVIDED)) {
            var405 = module0036.f2531(var405, Symbols.symbol_function((SubLObject)module0538.$ic83$), Symbols.symbol_function((SubLObject)module0538.$ic265$), (SubLObject)module0538.UNPROVIDED);
        }
        return var405;
    }
    
    public static SubLObject f33485() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33316", "S#9981", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0538", "f33319", "S#36768");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33318", "S#36769", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33320", "S#22111", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33321", "S#32533", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33322", "S#32534", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33317", "S#36770", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33323", "S#31623", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33324", "S#9982", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33325", "S#36771", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33326", "S#36772", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33327", "S#9983", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0538", "f33328", "S#36773");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33329", "S#36774", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33330", "S#36775", 1, 8, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33331", "S#36776", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33332", "S#36777", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33333", "SAFE-FI", 1, 8, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33334", "FI-GET-WARNING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33335", "FI-GET-ERROR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33336", "FI-FIND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33337", "S#32535", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33338", "FI-COMPLETE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33339", "S#36778", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33340", "FI-CREATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33341", "FI-CREATE-INT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33342", "S#36779", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33343", "FI-FIND-OR-CREATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33344", "S#32596", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33345", "FI-CREATE-SKOLEM", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33346", "S#36780", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33350", "S#36781", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33351", "S#36782", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33348", "S#36783", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33352", "S#36784", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33353", "S#36785", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33354", "FI-MERGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33355", "S#36786", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33357", "S#36787", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33358", "S#36788", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33359", "S#36789", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33363", "S#36790", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33361", "S#36791", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33369", "S#36792", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33370", "S#36793", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33374", "S#36794", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33364", "S#36795", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33360", "S#36796", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33366", "S#36797", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33362", "S#36798", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33368", "S#36799", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33375", "FI-KILL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33365", "FI-KILL-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33376", "FI-RENAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33377", "FI-RENAME-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33378", "FI-LOOKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33379", "S#36800", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33381", "SENTENCE-ASSERTIONS-IN-MT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33373", "SENTENCE-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33382", "S#36801", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33384", "S#24954", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33385", "S#24953", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33386", "S#36802", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33387", "FI-ASSERT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33349", "FI-ASSERT-INT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33390", "S#36803", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33391", "S#36804", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33392", "S#36805", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33389", "S#36806", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33383", "S#31624", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33388", "S#36807", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33393", "S#36808", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33394", "S#36809", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33395", "FI-REASSERT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33396", "FI-REASSERT-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33397", "S#36810", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33398", "S#36811", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33399", "FI-UNASSERT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33400", "FI-UNASSERT-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33401", "S#36812", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33403", "S#36813", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33402", "S#36814", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33404", "S#36815", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33405", "FI-EDIT", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33406", "S#36816", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33407", "S#36817", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33408", "FI-JUSTIFY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33409", "S#20826", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33410", "S#36818", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33411", "S#36819", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33412", "S#36820", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33414", "S#36821", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33415", "S#36822", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33372", "S#19521", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33417", "S#36823", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33418", "S#31657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33419", "S#36824", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33421", "S#36825", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33420", "S#25191", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33416", "S#36826", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33422", "S#36827", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33423", "S#36828", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33424", "S#25192", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33425", "FI-BLAST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33426", "S#36829", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33427", "FI-ASK", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33428", "S#20825", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33429", "S#36830", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33431", "S#36831", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33432", "FI-CONTINUE-LAST-ASK", 0, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33433", "S#36832", 0, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33434", "FI-ASK-STATUS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33435", "S#36833", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33436", "FI-TMS-RECONSIDER-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33437", "S#32536", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33438", "FI-TMS-RECONSIDER-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33439", "S#32537", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33440", "FI-TMS-RECONSIDER-GAFS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33441", "S#36834", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33442", "FI-TMS-RECONSIDER-TERM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33443", "S#36835", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33444", "FI-DENOTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33445", "S#36836", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33446", "FI-TIMESTAMP-CONSTANT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33447", "S#36837", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33448", "S#36838", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33449", "S#36839", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33450", "S#36840", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33451", "S#36841", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33452", "FI-TIMESTAMP-ASSERTION", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33371", "S#36842", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33453", "S#36843", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33454", "S#36844", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33455", "S#36845", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33456", "FI-RENAME-VARIABLES-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33457", "S#9947", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33458", "S#36846", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33459", "S#9948", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33460", "S#36847", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33461", "S#9950", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33462", "S#36848", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33463", "S#9951", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33464", "S#36849", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33465", "S#21738", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33466", "S#36850", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33467", "THE-DATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33468", "THE-SECOND", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33347", "S#36851", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33380", "S#36852", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33430", "S#36853", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33356", "S#36854", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33469", "S#36855", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33413", "S#21914", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33471", "S#36856", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33472", "S#36857", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33473", "S#36858", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33474", "S#36859", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33475", "S#36860", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33476", "S#36861", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33477", "S#36862", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33470", "S#36863", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33478", "ASSERTION-FI-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33367", "ASSERTION-HL-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33480", "S#20625", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33481", "S#36864", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33482", "S#21739", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33479", "S#16450", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33483", "S#16028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0538", "f33484", "S#36865", 1, 0, false);
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33486() {
        module0538.$g3920$ = SubLFiles.deflexical("S#36866", (SubLObject)module0538.$ic0$);
        module0538.$g3921$ = SubLFiles.defparameter("*FI-WARNING*", (SubLObject)module0538.NIL);
        module0538.$g3922$ = SubLFiles.defparameter("*FI-ERROR*", (SubLObject)module0538.NIL);
        module0538.$g3923$ = SubLFiles.defparameter("S#36867", (SubLObject)module0538.NIL);
        module0538.$g3924$ = SubLFiles.defparameter("S#36868", (SubLObject)module0538.NIL);
        module0538.$g3925$ = SubLFiles.defparameter("S#36869", (SubLObject)module0538.NIL);
        module0538.$g3926$ = SubLFiles.defparameter("S#36870", (SubLObject)module0538.NIL);
        module0538.$g3928$ = SubLFiles.defparameter("S#36871", (SubLObject)module0538.NIL);
        module0538.$g3929$ = SubLFiles.defparameter("S#36872", (SubLObject)module0538.NIL);
        module0538.$g3930$ = SubLFiles.defparameter("S#36873", (SubLObject)module0538.T);
        module0538.$g3931$ = SubLFiles.defparameter("S#36874", (SubLObject)module0538.NIL);
        module0538.$g3932$ = SubLFiles.defparameter("S#36875", (SubLObject)module0538.NIL);
        module0538.$g3933$ = SubLFiles.deflexical("S#36876", (SubLObject)module0538.NIL);
        module0538.$g3934$ = SubLFiles.defparameter("S#36877", (SubLObject)module0538.NIL);
        return (SubLObject)module0538.NIL;
    }
    
    public static SubLObject f33487() {
        module0012.f441((SubLObject)module0538.$ic3$);
        SubLObject var211 = (SubLObject)module0538.$ic3$;
        if (module0538.NIL == conses_high.member(var211, module0012.$g52$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0538.EQL), Symbols.symbol_function((SubLObject)module0538.IDENTITY))) {
            module0012.$g52$.setGlobalValue((SubLObject)ConsesLow.cons(var211, module0012.$g52$.getGlobalValue()));
        }
        module0012.f441((SubLObject)module0538.$ic4$);
        var211 = (SubLObject)module0538.$ic4$;
        if (module0538.NIL == conses_high.member(var211, module0012.$g52$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0538.EQL), Symbols.symbol_function((SubLObject)module0538.IDENTITY))) {
            module0012.$g52$.setGlobalValue((SubLObject)ConsesLow.cons(var211, module0012.$g52$.getGlobalValue()));
        }
        module0012.f441((SubLObject)module0538.$ic7$);
        var211 = (SubLObject)module0538.$ic7$;
        if (module0538.NIL == conses_high.member(var211, module0012.$g52$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0538.EQL), Symbols.symbol_function((SubLObject)module0538.IDENTITY))) {
            module0012.$g52$.setGlobalValue((SubLObject)ConsesLow.cons(var211, module0012.$g52$.getGlobalValue()));
        }
        module0012.f441((SubLObject)module0538.$ic8$);
        var211 = (SubLObject)module0538.$ic8$;
        if (module0538.NIL == conses_high.member(var211, module0012.$g52$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0538.EQL), Symbols.symbol_function((SubLObject)module0538.IDENTITY))) {
            module0012.$g52$.setGlobalValue((SubLObject)ConsesLow.cons(var211, module0012.$g52$.getGlobalValue()));
        }
        module0012.f368((SubLObject)module0538.$ic22$, (SubLObject)module0538.NIL, (SubLObject)module0538.$ic23$, (SubLObject)module0538.NIL, (SubLObject)module0538.$ic24$);
        module0012.f368((SubLObject)module0538.$ic26$, (SubLObject)module0538.NIL, (SubLObject)module0538.$ic27$, (SubLObject)module0538.NIL, (SubLObject)module0538.$ic24$);
        module0012.f368((SubLObject)module0538.$ic29$, (SubLObject)module0538.$ic30$, (SubLObject)module0538.$ic31$, (SubLObject)module0538.NIL, (SubLObject)module0538.$ic32$);
        module0012.f368((SubLObject)module0538.$ic38$, (SubLObject)module0538.$ic39$, (SubLObject)module0538.$ic40$, (SubLObject)module0538.NIL, (SubLObject)module0538.$ic41$);
        module0012.f368((SubLObject)module0538.$ic14$, (SubLObject)module0538.$ic43$, (SubLObject)module0538.$ic44$, (SubLObject)module0538.NIL, (SubLObject)module0538.$ic45$);
        module0012.f368((SubLObject)module0538.$ic15$, (SubLObject)module0538.$ic43$, (SubLObject)module0538.$ic53$, (SubLObject)module0538.NIL, (SubLObject)module0538.$ic45$);
        module0012.f368((SubLObject)module0538.$ic88$, (SubLObject)module0538.$ic89$, (SubLObject)module0538.$ic90$, (SubLObject)module0538.NIL, (SubLObject)module0538.$ic91$);
        module0012.f368((SubLObject)module0538.$ic95$, (SubLObject)module0538.$ic96$, (SubLObject)module0538.$ic97$, (SubLObject)module0538.NIL, (SubLObject)module0538.$ic32$);
        module0012.f368((SubLObject)module0538.$ic102$, (SubLObject)module0538.$ic103$, (SubLObject)module0538.$ic104$, (SubLObject)module0538.NIL, (SubLObject)module0538.$ic105$);
        module0012.f368((SubLObject)module0538.$ic110$, (SubLObject)module0538.$ic111$, (SubLObject)module0538.$ic112$, (SubLObject)module0538.NIL, (SubLObject)module0538.$ic91$);
        module0012.f368((SubLObject)module0538.$ic148$, (SubLObject)module0538.$ic103$, (SubLObject)module0538.$ic149$, (SubLObject)module0538.NIL, (SubLObject)module0538.$ic91$);
        module0012.f368((SubLObject)module0538.$ic156$, (SubLObject)module0538.$ic157$, (SubLObject)module0538.$ic158$, (SubLObject)module0538.NIL, (SubLObject)module0538.$ic91$);
        module0012.f368((SubLObject)module0538.$ic177$, (SubLObject)module0538.$ic103$, (SubLObject)module0538.$ic178$, (SubLObject)module0538.NIL, (SubLObject)module0538.$ic91$);
        module0012.f368((SubLObject)module0538.$ic180$, (SubLObject)module0538.$ic181$, (SubLObject)module0538.$ic182$, (SubLObject)module0538.NIL, (SubLObject)module0538.$ic183$);
        module0012.f588((SubLObject)module0538.$ic189$, (SubLObject)module0538.$ic190$, (SubLObject)module0538.$ic191$, (SubLObject)module0538.$ic192$, (SubLObject)module0538.NIL, (SubLObject)module0538.$ic183$);
        module0002.f35((SubLObject)module0538.$ic193$, (SubLObject)module0538.$ic190$);
        module0012.f588((SubLObject)module0538.$ic196$, (SubLObject)module0538.$ic197$, (SubLObject)module0538.NIL, (SubLObject)module0538.$ic198$, (SubLObject)module0538.NIL, (SubLObject)module0538.$ic24$);
        module0002.f35((SubLObject)module0538.$ic199$, (SubLObject)module0538.$ic197$);
        module0012.f368((SubLObject)module0538.$ic202$, (SubLObject)module0538.$ic103$, (SubLObject)module0538.$ic203$, (SubLObject)module0538.NIL, (SubLObject)module0538.$ic91$);
        module0012.f368((SubLObject)module0538.$ic205$, (SubLObject)module0538.$ic206$, (SubLObject)module0538.$ic207$, (SubLObject)module0538.NIL, (SubLObject)module0538.$ic91$);
        module0012.f368((SubLObject)module0538.$ic209$, (SubLObject)module0538.$ic210$, (SubLObject)module0538.$ic211$, (SubLObject)module0538.NIL, (SubLObject)module0538.$ic91$);
        module0012.f368((SubLObject)module0538.$ic214$, (SubLObject)module0538.$ic215$, (SubLObject)module0538.$ic216$, (SubLObject)module0538.NIL, (SubLObject)module0538.$ic91$);
        module0034.f1909((SubLObject)module0538.$ic257$);
        return (SubLObject)module0538.NIL;
    }
    
    public void declareFunctions() {
        f33485();
    }
    
    public void initializeVariables() {
        f33486();
    }
    
    public void runTopLevelForms() {
        f33487();
    }
    
    static {
        me = (SubLFile)new module0538();
        module0538.$g3920$ = null;
        module0538.$g3921$ = null;
        module0538.$g3922$ = null;
        module0538.$g3923$ = null;
        module0538.$g3924$ = null;
        module0538.$g3925$ = null;
        module0538.$g3926$ = null;
        module0538.$g3928$ = null;
        module0538.$g3929$ = null;
        module0538.$g3930$ = null;
        module0538.$g3931$ = null;
        module0538.$g3932$ = null;
        module0538.$g3933$ = null;
        module0538.$g3934$ = null;
        $ic0$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GET-WARNING"), (SubLObject)SubLObjectFactory.makeSymbol("FI-GET-WARNING"), (SubLObject)SubLObjectFactory.makeSymbol("S#32534", "CYC"), (SubLObject)module0538.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GET-ERROR"), (SubLObject)SubLObjectFactory.makeSymbol("FI-GET-ERROR"), (SubLObject)SubLObjectFactory.makeSymbol("S#36771", "CYC"), (SubLObject)module0538.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIND"), (SubLObject)SubLObjectFactory.makeSymbol("FI-FIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#32535", "CYC"), (SubLObject)module0538.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLETE"), (SubLObject)SubLObjectFactory.makeSymbol("FI-COMPLETE"), (SubLObject)SubLObjectFactory.makeSymbol("S#36778", "CYC"), (SubLObject)module0538.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeSymbol("FI-CREATE"), (SubLObject)SubLObjectFactory.makeSymbol("FI-CREATE-INT"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIND-OR-CREATE"), (SubLObject)SubLObjectFactory.makeSymbol("FI-FIND-OR-CREATE"), (SubLObject)SubLObjectFactory.makeSymbol("S#32596", "CYC"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE-SKOLEM"), (SubLObject)SubLObjectFactory.makeSymbol("FI-CREATE-SKOLEM"), (SubLObject)SubLObjectFactory.makeSymbol("S#36780", "CYC"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MERGE"), (SubLObject)SubLObjectFactory.makeSymbol("FI-MERGE"), (SubLObject)SubLObjectFactory.makeSymbol("S#36786", "CYC"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KILL"), (SubLObject)SubLObjectFactory.makeSymbol("FI-KILL"), (SubLObject)SubLObjectFactory.makeSymbol("FI-KILL-INT"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RENAME"), (SubLObject)SubLObjectFactory.makeSymbol("FI-RENAME"), (SubLObject)SubLObjectFactory.makeSymbol("FI-RENAME-INT"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("FI-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("S#36800", "CYC"), (SubLObject)module0538.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-ASSERT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-ASSERT-INT"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REASSERT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-REASSERT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-REASSERT-INT"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNASSERT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-UNASSERT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-UNASSERT-INT"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EDIT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-EDIT"), (SubLObject)SubLObjectFactory.makeSymbol("S#36816", "CYC"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RENAME-VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("S#36845", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FI-RENAME-VARIABLES-INT"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("FI-JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("S#20826", "CYC"), (SubLObject)module0538.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ADD-ARGUMENT"), (SubLObject)SubLObjectFactory.makeSymbol("S#36822", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#19521", "CYC"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVE-ARGUMENT"), (SubLObject)SubLObjectFactory.makeSymbol("S#36828", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25192", "CYC"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BLAST"), (SubLObject)SubLObjectFactory.makeSymbol("FI-BLAST"), (SubLObject)SubLObjectFactory.makeSymbol("S#36829", "CYC"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASK"), (SubLObject)SubLObjectFactory.makeSymbol("FI-ASK"), (SubLObject)SubLObjectFactory.makeSymbol("S#20825", "CYC"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONTINUE-LAST-ASK"), (SubLObject)SubLObjectFactory.makeSymbol("FI-CONTINUE-LAST-ASK"), (SubLObject)SubLObjectFactory.makeSymbol("S#36832", "CYC"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASK-STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("FI-ASK-STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("S#36833", "CYC"), (SubLObject)module0538.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TMS-RECONSIDER-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("FI-TMS-RECONSIDER-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("S#32536", "CYC"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TMS-RECONSIDER-MT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-TMS-RECONSIDER-MT"), (SubLObject)SubLObjectFactory.makeSymbol("S#32537", "CYC"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TMS-RECONSIDER-GAFS"), (SubLObject)SubLObjectFactory.makeSymbol("FI-TMS-RECONSIDER-GAFS"), (SubLObject)SubLObjectFactory.makeSymbol("S#36834", "CYC"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TMS-RECONSIDER-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("FI-TMS-RECONSIDER-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("S#36835", "CYC"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HYPOTHESIZE"), (SubLObject)SubLObjectFactory.makeSymbol("FI-HYPOTHESIZE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35014", "CYC"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROVE"), (SubLObject)SubLObjectFactory.makeSymbol("FI-PROVE"), (SubLObject)SubLObjectFactory.makeSymbol("S#36878", "CYC"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DENOTATION"), (SubLObject)SubLObjectFactory.makeSymbol("FI-DENOTATION"), (SubLObject)SubLObjectFactory.makeSymbol("S#36836", "CYC"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TIMESTAMP-CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-TIMESTAMP-CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("S#36837", "CYC"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TIMESTAMP-ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("FI-TIMESTAMP-ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("S#36842", "CYC"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVE-TIMESTAMP"), (SubLObject)SubLObjectFactory.makeSymbol("S#36843", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36844", "CYC"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GET-PARAMETER"), (SubLObject)SubLObjectFactory.makeSymbol("S#9947", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36846", "CYC"), (SubLObject)module0538.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SET-PARAMETER"), (SubLObject)SubLObjectFactory.makeSymbol("S#9948", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36847", "CYC"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EVAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#9950", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36848", "CYC"), (SubLObject)module0538.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCAL-EVAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#9951", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36849", "CYC"), (SubLObject)module0538.NIL) });
        $ic1$ = SubLObjectFactory.makeSymbol("CLET");
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*FI-ERROR*"), (SubLObject)module0538.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*FI-WARNING*"), (SubLObject)module0538.NIL));
        $ic3$ = SubLObjectFactory.makeSymbol("*FI-WARNING*");
        $ic4$ = SubLObjectFactory.makeSymbol("*FI-ERROR*");
        $ic5$ = SubLObjectFactory.makeSymbol("FORMAT");
        $ic6$ = SubLObjectFactory.makeString("~S");
        $ic7$ = SubLObjectFactory.makeSymbol("S#36867", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#36868", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36869", "CYC"), (SubLObject)module0538.T));
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#813", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36879", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36880", "CYC"));
        $ic11$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic12$ = SubLObjectFactory.makeString("Bad function call -> (FI ~s ~s ~s ~s ~s ~s ~s ~s ~s)\n~%A function for ~s is missing from *fi-dispatch-table*");
        $ic13$ = SubLObjectFactory.makeKeyword("QUEUED");
        $ic14$ = SubLObjectFactory.makeSymbol("FI-CREATE");
        $ic15$ = SubLObjectFactory.makeSymbol("FI-FIND-OR-CREATE");
        $ic16$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#168", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10596", "CYC"));
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)module0538.NIL);
        $ic18$ = SubLObjectFactory.makeSymbol("FI-HYPOTHESIZE");
        $ic19$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#168", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6061", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36881", "CYC"), (SubLObject)SubLObjectFactory.makeString("HYP")), (SubLObject)SubLObjectFactory.makeSymbol("S#36882", "CYC"));
        $ic20$ = SubLObjectFactory.makeString("HYP");
        $ic21$ = SubLObjectFactory.makeKeyword("GET-WARNING");
        $ic22$ = SubLObjectFactory.makeSymbol("FI-GET-WARNING");
        $ic23$ = SubLObjectFactory.makeString("Return a description of the warning resulting from the last FI operation.");
        $ic24$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("ATOM")));
        $ic25$ = SubLObjectFactory.makeKeyword("GET-ERROR");
        $ic26$ = SubLObjectFactory.makeSymbol("FI-GET-ERROR");
        $ic27$ = SubLObjectFactory.makeString("Return a description of the error resulting from the last FI operation.");
        $ic28$ = SubLObjectFactory.makeKeyword("FIND");
        $ic29$ = SubLObjectFactory.makeSymbol("FI-FIND");
        $ic30$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"));
        $ic31$ = SubLObjectFactory.makeString("Return the constant indentified by the string NAME.");
        $ic32$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")));
        $ic33$ = SubLObjectFactory.makeKeyword("ARG-ERROR");
        $ic34$ = SubLObjectFactory.makeString("Expected a string, got ~S");
        $ic35$ = SubLObjectFactory.makeKeyword("INVALID-NAME");
        $ic36$ = SubLObjectFactory.makeString("~S is not a valid name for a constant");
        $ic37$ = SubLObjectFactory.makeKeyword("COMPLETE");
        $ic38$ = SubLObjectFactory.makeSymbol("FI-COMPLETE");
        $ic39$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10299", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10488", "CYC"));
        $ic40$ = SubLObjectFactory.makeString("Return a list of constants whose name begins with PREFIX. The comparison is\nperformed in a case-insensitive mode unless CASE-SENSITIVE? is non-nil.");
        $ic41$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")));
        $ic42$ = SubLObjectFactory.makeKeyword("CREATE");
        $ic43$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10596", "CYC"));
        $ic44$ = SubLObjectFactory.makeString("Create a new constant with NAME.\nIf EXTERNAL-ID is non-null it is used, otherwise a unique identifier is generated.");
        $ic45$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P"));
        $ic46$ = SubLObjectFactory.makeKeyword("UNNAMED");
        $ic47$ = SubLObjectFactory.makeKeyword("NAME-CLASH");
        $ic48$ = SubLObjectFactory.makeString("NAME clash for ~S ; renaming to ~S");
        $ic49$ = SubLObjectFactory.makeString("Expected an external ID, got ~S");
        $ic50$ = SubLObjectFactory.makeKeyword("ID-CLASH");
        $ic51$ = SubLObjectFactory.makeString("Already a constant with id ~A");
        $ic52$ = SubLObjectFactory.makeKeyword("FIND-OR-CREATE");
        $ic53$ = SubLObjectFactory.makeString("Return constant with NAME if it is present.  \nIf not present, then create constant with NAME, using EXTERNAL-ID if given.\nIf EXTERNAL-ID is not given, generate a new one for the new constant.");
        $ic54$ = SubLObjectFactory.makeKeyword("CREATE-SKOLEM");
        $ic55$ = SubLObjectFactory.makeSymbol("S#690", "CYC");
        $ic56$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic57$ = SubLObjectFactory.makeKeyword("MONOTONIC");
        $ic58$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("arityMin"));
        $ic59$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("arity"));
        $ic60$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("arg1Isa"));
        $ic61$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("arg2Isa"));
        $ic62$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("arg3Isa"));
        $ic63$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("arg4Isa"));
        $ic64$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("arg5Isa"));
        $ic65$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("resultIsa"));
        $ic66$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("resultIsaArg"));
        $ic67$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CollectionDenotingFunction"));
        $ic68$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CollectionDenotingFunction")));
        $ic69$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("resultGenl"));
        $ic70$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionDenotingFunction"));
        $ic71$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionDenotingFunction")));
        $ic72$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("resultGenlArg"));
        $ic73$ = SubLObjectFactory.makeString("SKF-~a");
        $ic74$ = SubLObjectFactory.makeString("0123456789");
        $ic75$ = SubLObjectFactory.makeKeyword("MERGE");
        $ic76$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SELF-MERGE"), (SubLObject)SubLObjectFactory.makeString("Merging ~S onto itself is a no-op"), (SubLObject)SubLObjectFactory.makeSymbol("S#36883", "CYC"));
        $ic77$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic78$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic79$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic80$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic81$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $ic82$ = SubLObjectFactory.makeSymbol("SKOLEM-NART?");
        $ic83$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic84$ = SubLObjectFactory.makeSymbol("S#16420", "CYC");
        $ic85$ = SubLObjectFactory.makeString("Could not merge assertion onto term ~S due to uncanonicalization problem:~%  ~S");
        $ic86$ = SubLObjectFactory.makeSymbol("S#36824", "CYC");
        $ic87$ = SubLObjectFactory.makeKeyword("KILL");
        $ic88$ = SubLObjectFactory.makeSymbol("FI-KILL");
        $ic89$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"));
        $ic90$ = SubLObjectFactory.makeString("Kill FORT and all its uses from the KB.  If FORT is a microtheory, all assertions\nin that microtheory are removed.");
        $ic91$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic92$ = SubLObjectFactory.makeString("Constant ~S is merely an empty shell, not part of the Knowledge Base");
        $ic93$ = SubLObjectFactory.makeString("Cannot kill core constant ~a.  To kill it, first unassert that it is an instance of #$CoreUnionConstant.");
        $ic94$ = SubLObjectFactory.makeKeyword("RENAME");
        $ic95$ = SubLObjectFactory.makeSymbol("FI-RENAME");
        $ic96$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"));
        $ic97$ = SubLObjectFactory.makeString("Change name of CONSTANT to NAME. Return the constant if no error, otherwise return NIL.");
        $ic98$ = SubLObjectFactory.makeString("Expected a constant, got ~S");
        $ic99$ = SubLObjectFactory.makeKeyword("ALREADY-HAS-NAME");
        $ic100$ = SubLObjectFactory.makeString("Constant ~S is already named ~A");
        $ic101$ = SubLObjectFactory.makeKeyword("LOOKUP");
        $ic102$ = SubLObjectFactory.makeSymbol("FI-LOOKUP");
        $ic103$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6061", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic104$ = SubLObjectFactory.makeString("Returns two values when looking up the EL FORMULA in the microtheory MT.  The\nfirst value returned is a list of HL formulas resulting from the canonicalization\nof the EL FORMULA.  The second value is T iff all the HL assertions were properly \nput into the KB.");
        $ic105$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("CONSP")), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic106$ = SubLObjectFactory.makeString("Expected a cons, got ~S");
        $ic107$ = SubLObjectFactory.makeSymbol("ASSERTION-FI-FORMULA");
        $ic108$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic109$ = SubLObjectFactory.makeKeyword("ASSERT");
        $ic110$ = SubLObjectFactory.makeSymbol("FI-ASSERT");
        $ic111$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6061", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13918", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), (SubLObject)SubLObjectFactory.makeSymbol("S#5432", "CYC"));
        $ic112$ = SubLObjectFactory.makeString("Assert the FORMULA in the specified MT.  STRENGTH is :default or :monotonic.\nDIRECTION is :forward or :backward.  GAF assertion direction defaults to :forward, and rule\nassertion direction defaults to :backward. Return T if there was no error.");
        $ic113$ = SubLObjectFactory.makeString("Expected :default or :monotonic, got ~S");
        $ic114$ = SubLObjectFactory.makeString("Expected a direction, got ~S");
        $ic115$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("True"));
        $ic116$ = SubLObjectFactory.makeKeyword("TAUTOLOGY");
        $ic117$ = SubLObjectFactory.makeString("Formula ~%  ~S ~%in ~S was a tautology.");
        $ic118$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("False"));
        $ic119$ = SubLObjectFactory.makeKeyword("CONTRADICTION");
        $ic120$ = SubLObjectFactory.makeString("Formula ~%  ~S ~%in ~S was a contradiction.");
        $ic121$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13916", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#15041", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36884", "CYC"));
        $ic122$ = SubLObjectFactory.makeKeyword("COULD-NOT-ASSERT");
        $ic123$ = SubLObjectFactory.makeString("Unable to assert formula ~S~%in ~S.");
        $ic124$ = SubLObjectFactory.makeSymbol("S#16050", "CYC");
        $ic125$ = SubLObjectFactory.makeSymbol("S#16406", "CYC");
        $ic126$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("skolem"));
        $ic127$ = SubLObjectFactory.makeString("Found a #$skolem assertion with more than one argument: ~s");
        $ic128$ = SubLObjectFactory.makeString("Found a #$skolem assertion with a non-deduced argument: ~s");
        $ic129$ = SubLObjectFactory.makeSymbol("S#2879", "CYC");
        $ic130$ = SubLObjectFactory.makeString("Defining assertions for ~s~%~s~%were not all included in existing supports~%~s");
        $ic131$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD"));
        $ic132$ = SubLObjectFactory.makeSymbol("CNF-P");
        $ic133$ = SubLObjectFactory.makeKeyword("BACKWARD");
        $ic134$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic135$ = SubLObjectFactory.makeKeyword("FORMULA-NOT-WELL-FORMED");
        $ic136$ = SubLObjectFactory.makeString("Formula ~%  ~S ~%was not well formed because: ~%~a");
        $ic137$ = SubLObjectFactory.makeString("Formula ~%  ~S ~%was not well formed");
        $ic138$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic139$ = SubLObjectFactory.makeKeyword("UNCHANGED");
        $ic140$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REDUNDANT-LOCAL-ASSERTION"));
        $ic141$ = SubLObjectFactory.makeKeyword("FLIPPED");
        $ic142$ = SubLObjectFactory.makeKeyword("NEW");
        $ic143$ = SubLObjectFactory.makeKeyword("REASSERT");
        $ic144$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INVALID-STRENGTH-CHANGE"), (SubLObject)SubLObjectFactory.makeString("Attempt to change the strength of a deduced assertion from ~S to ~S"), (SubLObject)SubLObjectFactory.makeSymbol("S#36885", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13918", "CYC"));
        $ic145$ = SubLObjectFactory.makeKeyword("ASSERTION-NOT-PRESENT");
        $ic146$ = SubLObjectFactory.makeString("Formula ~S in mt ~S is not in the KB");
        $ic147$ = SubLObjectFactory.makeKeyword("UNASSERT");
        $ic148$ = SubLObjectFactory.makeSymbol("FI-UNASSERT");
        $ic149$ = SubLObjectFactory.makeString("Remove the assertions canonicalized from FORMULA in the microtheory MT.\nReturn T if the operation succeeded, otherwise return NIL.");
        $ic150$ = SubLObjectFactory.makeString("Sentence ~%  ~S ~%in ~S was a tautology.");
        $ic151$ = SubLObjectFactory.makeString("Sentence ~%  ~S ~%in ~S was a contradiction.");
        $ic152$ = SubLObjectFactory.makeString("Sentence ~S in mt ~S is not in the KB");
        $ic153$ = SubLObjectFactory.makeKeyword("ASSERTION-NOT-LOCAL");
        $ic154$ = SubLObjectFactory.makeString("Sentence ~S in mt ~S is not locally in the KB");
        $ic155$ = SubLObjectFactory.makeKeyword("EDIT");
        $ic156$ = SubLObjectFactory.makeSymbol("FI-EDIT");
        $ic157$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36886", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22108", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#36887", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36888", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36887", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13918", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), (SubLObject)SubLObjectFactory.makeSymbol("S#5432", "CYC"));
        $ic158$ = SubLObjectFactory.makeString("Unassert the assertions canonicalized from OLD-FORMULA in the microtheory OLD-MT.\n   Assert NEW-FORMULA in the specified NEW-MT.  \n   STRENGTH is :default or :monotonic.\n   DIRECTION is :forward or :backward.  \n    GAF assertion direction defaults to :forward.\n    Rule assertion direction defaults to :backward.\n   Return T if there was no error.");
        $ic159$ = SubLObjectFactory.makeKeyword("JUSTIFY");
        $ic160$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14781", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36889", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36890", "CYC"));
        $ic161$ = SubLObjectFactory.makeSymbol("S#14722", "CYC");
        $ic162$ = SubLObjectFactory.makeKeyword("ADD-ARGUMENT");
        $ic163$ = SubLObjectFactory.makeString("Expected a support, got ~S");
        $ic164$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORWARD"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARD"));
        $ic165$ = SubLObjectFactory.makeString("Expected :forward or :backward, got ~S");
        $ic166$ = SubLObjectFactory.makeSymbol("DEDUCTION-ASSERTION");
        $ic167$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic168$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14781", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6061", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13918", "CYC"));
        $ic169$ = SubLObjectFactory.makeKeyword("SUPPORT-MALFORMED");
        $ic170$ = SubLObjectFactory.makeString("Support ~S was malformed");
        $ic171$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic172$ = SubLObjectFactory.makeKeyword("SUPPORT-INVALID");
        $ic173$ = SubLObjectFactory.makeString("Support ~S is not currently valid");
        $ic174$ = SubLObjectFactory.makeKeyword("REMOVE-ARGUMENT");
        $ic175$ = SubLObjectFactory.makeSymbol("S#12278", "CYC");
        $ic176$ = SubLObjectFactory.makeKeyword("BLAST");
        $ic177$ = SubLObjectFactory.makeSymbol("FI-BLAST");
        $ic178$ = SubLObjectFactory.makeString("Remove all arguments for the FORMULA within MT, including both those \narguments resulting the direct assertion of the FORMULA, and \nthose arguments supporting the FORMULA which were derived through inference.\nReturn T if successful, otherwise return NIL.");
        $ic179$ = SubLObjectFactory.makeKeyword("ASK");
        $ic180$ = SubLObjectFactory.makeSymbol("FI-ASK");
        $ic181$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6061", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33866", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("TIME"), (SubLObject)SubLObjectFactory.makeSymbol("S#25811", "CYC"));
        $ic182$ = SubLObjectFactory.makeString("Ask for bindings for free variables which will satisfy FORMULA within MT.\nIf BACKCHAIN is NIL, no inference is performed.\nIf BACKCHAIN is an integer, then at most that many backchaining steps using rules\nare performed.\nIf BACKCHAIN is T, then inference is performed without limit on the number of\nbackchaining steps when searching for bindings.\nIf NUMBER is an integer, then at most that number of bindings are returned.\nIf TIME is an integer, then at most TIME seconds are consumed by the search for\nbindings.\nIf DEPTH is an integer, then the inference paths are limited to that number of\ntotal steps.\nReturns NIL if the operation had an error.  Otherwise returns a list of variable/\nbinding pairs.  In the case where the FORMULA has no free variables, the form\n (((T . T))) is returned indicating that the gaf is either directly asserted in the\nKB, or that it can be derived via rules in the KB.");
        $ic183$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $ic184$ = SubLObjectFactory.makeString("Expected a formula, got ~S");
        $ic185$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25981", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36891", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36892", "CYC"));
        $ic186$ = SubLObjectFactory.makeString("Expected an integer, got ~S");
        $ic187$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic188$ = SubLObjectFactory.makeKeyword("CONTINUE-LAST-ASK");
        $ic189$ = SubLObjectFactory.makeSymbol("FI-CONTINUE-LAST-ASK");
        $ic190$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTINUE-INFERENCE"));
        $ic191$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33866", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("TIME"), (SubLObject)SubLObjectFactory.makeSymbol("S#25811", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36893", "CYC"));
        $ic192$ = SubLObjectFactory.makeString("Continue the last ask that was performed with more resources.\nIf BACKCHAIN is NIL, no inference is performed.\nIf BACKCHAIN is an integer, then at most that many backchaining steps using rules\nare performed.\nIf BACKCHAIN is T, then inference is performed without limit on the number of\nbackchaining steps when searching for bindings.\nIf NUMBER is an integer, then at most that number of bindings are returned.\nIf TIME is an integer, then at most TIME seconds are consumed by the search for\nbindings.\nIf DEPTH is an integer, then the inference paths are limited to that number of\ntotal steps.\nReturns NIL if the operation had an error.  Otherwise returns a list of variable/\nbinding pairs.  In the case where the FORMULA has no free variables, the form\n (((T . T))) is returned indicating that the gaf is either directly asserted in the\nKB, or that it can be derived via rules in the KB.");
        $ic193$ = SubLObjectFactory.makeSymbol("S#36832", "CYC");
        $ic194$ = SubLObjectFactory.makeString("fi-continue-last-ask-int is deprecated; use CONTINUE-INFERENCE instead.");
        $ic195$ = SubLObjectFactory.makeString("fi-ask-status is deprecated: use INFERENCE-SUSPEND-STATUS");
        $ic196$ = SubLObjectFactory.makeSymbol("FI-ASK-STATUS");
        $ic197$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28408", "CYC"));
        $ic198$ = SubLObjectFactory.makeString("Return a status as to how the last ask successfully completed regarding\nresource limits.  \n:EXHAUST if the search spaces was exhausted.\n:DEPTH if the search space was limited because some nodes were too deep.\n:NUMBER if the requested number of bindings was found without exceeding other limits.\n:TIME if the time alloted expired prior to exhausting the search space.\nReturn NIL if there was no prior successful ask.");
        $ic199$ = SubLObjectFactory.makeSymbol("S#36833", "CYC");
        $ic200$ = SubLObjectFactory.makeString("fi-ask-status-int is deprecated: use INFERENCE-SUSPEND-STATUS");
        $ic201$ = SubLObjectFactory.makeKeyword("TMS-RECONSIDER-FORMULA");
        $ic202$ = SubLObjectFactory.makeSymbol("FI-TMS-RECONSIDER-FORMULA");
        $ic203$ = SubLObjectFactory.makeString("Reconsider all arguments for FORMULA within MT.  Return T if the\noperation succeeded, NIL if there was an error.");
        $ic204$ = SubLObjectFactory.makeKeyword("TMS-RECONSIDER-MT");
        $ic205$ = SubLObjectFactory.makeSymbol("FI-TMS-RECONSIDER-MT");
        $ic206$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic207$ = SubLObjectFactory.makeString("Reconsider all arguments for all formulas within MT.  Return T if the\noperation succeeded, NIL if there was an error.");
        $ic208$ = SubLObjectFactory.makeKeyword("TMS-RECONSIDER-GAFS");
        $ic209$ = SubLObjectFactory.makeSymbol("FI-TMS-RECONSIDER-GAFS");
        $ic210$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#202", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#717", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic211$ = SubLObjectFactory.makeString("Reconsider all arguments for all gaf formulas involving TERM.\nARG optionally constrains gafs such that the TERM occupies a specific arg position.\nPREDICATE optionally constrains gafs such that the specifed PREDICATE\noccupies the arg0 position.\nMT optionally constrains gafs such that they must be included in the specific\nmicrotheory. \nReturn T if the operation succeeded, NIL if there was an error.");
        $ic212$ = SubLObjectFactory.makeString("Expected an integer 0-5, got ~S");
        $ic213$ = SubLObjectFactory.makeKeyword("TMS-RECONSIDER-TERM");
        $ic214$ = SubLObjectFactory.makeSymbol("FI-TMS-RECONSIDER-TERM");
        $ic215$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic216$ = SubLObjectFactory.makeString("Reconsider all arguments involving TERM.  \nIf MT is provided, then only arguments in that microtheory are reconsidered.\nReturn T if the operation succeeded, NIL if there was an error.");
        $ic217$ = SubLObjectFactory.makeKeyword("DENOTATION");
        $ic218$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ABBREVS"), (SubLObject)SubLObjectFactory.makeKeyword("ACRONYMS"));
        $ic219$ = SubLObjectFactory.makeKeyword("TIMESTAMP-CONSTANT");
        $ic220$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INVALID-CYCLIST"));
        $ic221$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INVALID-TIME"));
        $ic222$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INVALID-PURPOSE"));
        $ic223$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INVALID-SECOND"));
        $ic224$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-CONSTANT"));
        $ic225$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALREADY-TIMESTAMPED"));
        $ic226$ = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $ic227$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("myCreator"));
        $ic228$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("myCreationTime"));
        $ic229$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("myCreationPurpose"));
        $ic230$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("myCreationSecond"));
        $ic231$ = SubLObjectFactory.makeKeyword("STRENGTH");
        $ic232$ = SubLObjectFactory.makeKeyword("DIRECTION");
        $ic233$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $ic234$ = SubLObjectFactory.makeKeyword("TIMESTAMP-ASSERTION");
        $ic235$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-ASSERTIONS"));
        $ic236$ = SubLObjectFactory.makeKeyword("REMOVE-TIMESTAMP");
        $ic237$ = SubLObjectFactory.makeKeyword("RENAME-VARIABLES");
        $ic238$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SIMPLE-VARIABLE-RENAME-IMPOSSIBLE"));
        $ic239$ = SubLObjectFactory.makeKeyword("GET-PARAMETER");
        $ic240$ = SubLObjectFactory.makeString("Expected a symbol, got ~S");
        $ic241$ = SubLObjectFactory.makeKeyword("UNBOUND");
        $ic242$ = SubLObjectFactory.makeString("Parameter ~S is not bound");
        $ic243$ = SubLObjectFactory.makeKeyword("SET-PARAMETER");
        $ic244$ = SubLObjectFactory.makeKeyword("EVAL");
        $ic245$ = SubLObjectFactory.makeKeyword("LOCAL-EVAL");
        $ic246$ = SubLObjectFactory.makeKeyword("HLMT-NOT-WELL-FORMED");
        $ic247$ = SubLObjectFactory.makeString("Microtheory ~S~%  was not well formed because: ~%~S");
        $ic248$ = SubLObjectFactory.makeString("Expected a microtheory, got ~S");
        $ic249$ = SubLObjectFactory.makeString("Expected a term, got ~S");
        $ic250$ = SubLObjectFactory.makeSymbol("CAR");
        $ic251$ = SubLObjectFactory.makeSymbol("CDR");
        $ic252$ = SubLObjectFactory.makeSymbol("S#36863", "CYC");
        $ic253$ = SubLObjectFactory.makeKeyword("TRUE-MON");
        $ic254$ = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $ic255$ = SubLObjectFactory.makeKeyword("FALSE-MON");
        $ic256$ = SubLObjectFactory.makeKeyword("FALSE-DEF");
        $ic257$ = SubLObjectFactory.makeSymbol("S#36860", "CYC");
        $ic258$ = SubLObjectFactory.makeSymbol("S#36876", "CYC");
        $ic259$ = SubLObjectFactory.makeInteger(100);
        $ic260$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic261$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18071", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#62", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36894", "CYC"));
        $ic262$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic263$ = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $ic264$ = SubLObjectFactory.makeSymbol("DEFAULT-EL-VAR-FOR-HL-VAR");
        $ic265$ = SubLObjectFactory.makeSymbol("S#20625", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0538.class
	Total time: 1686 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/