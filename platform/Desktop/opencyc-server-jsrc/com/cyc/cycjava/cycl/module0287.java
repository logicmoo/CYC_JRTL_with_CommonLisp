package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0287 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0287";
    public static final String myFingerPrint = "857c3462c921afc8cfeaa78f7cb7fd3a765bfec6c8ffbc06392fc324f000d9d0";
    private static SubLSymbol $g2638$;
    private static SubLSymbol $g2639$;
    private static SubLSymbol $g2640$;
    private static SubLSymbol $g2641$;
    private static SubLSymbol $g2642$;
    private static SubLSymbol $g2643$;
    private static SubLSymbol $g2644$;
    private static final SubLList $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLList $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLInteger $ic28$;
    private static final SubLInteger $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLString $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLObject $ic72$;
    private static final SubLObject $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLObject $ic80$;
    private static final SubLList $ic81$;
    private static final SubLString $ic82$;
    private static final SubLList $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLString $ic89$;
    private static final SubLList $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLList $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLObject $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLList $ic107$;
    private static final SubLList $ic108$;
    private static final SubLObject $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLList $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLString $ic122$;
    private static final SubLList $ic123$;
    private static final SubLList $ic124$;
    private static final SubLList $ic125$;
    private static final SubLList $ic126$;
    private static final SubLList $ic127$;
    private static final SubLList $ic128$;
    private static final SubLList $ic129$;
    private static final SubLList $ic130$;
    private static final SubLList $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLList $ic133$;
    private static final SubLString $ic134$;
    private static final SubLString $ic135$;
    private static final SubLString $ic136$;
    private static final SubLString $ic137$;
    private static final SubLList $ic138$;
    private static final SubLString $ic139$;
    private static final SubLList $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLList $ic142$;
    private static final SubLObject $ic143$;
    private static final SubLList $ic144$;
    private static final SubLObject $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLObject $ic147$;
    private static final SubLObject $ic148$;
    private static final SubLList $ic149$;
    private static final SubLObject $ic150$;
    private static final SubLList $ic151$;
    private static final SubLObject $ic152$;
    private static final SubLList $ic153$;
    private static final SubLString $ic154$;
    private static final SubLList $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLString $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLString $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLString $ic166$;
    private static final SubLString $ic167$;
    private static final SubLString $ic168$;
    private static final SubLList $ic169$;
    private static final SubLString $ic170$;
    
    public static SubLObject f19151(final SubLObject var1, SubLObject var2, final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0287.NIL;
        SubLObject var7 = var1;
        SubLObject var8 = (SubLObject)module0287.NIL;
        var8 = var7.first();
        while (module0287.NIL != var7) {
            var8 = f19152(var8);
            final SubLObject var9 = module0204.f13090(var8, var2, Symbols.symbol_function((SubLObject)module0287.EQUAL));
            final SubLObject var10 = f19153(var8, var9, var3, var4);
            if (module0287.NIL != module0107.f7629(module0285.$g2613$.getDynamicValue(var5))) {
                final SubLObject var11 = f19154(var8);
                final SubLObject var12 = module0205.f13276(var10);
                module0285.$g2613$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var12, var11), module0285.$g2613$.getDynamicValue(var5)), var5);
            }
            var6 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var8, var10), var6);
            var7 = var7.rest();
            var8 = var7.first();
        }
        var7 = var6;
        SubLObject var13 = (SubLObject)module0287.NIL;
        var13 = var7.first();
        while (module0287.NIL != var7) {
            SubLObject var15;
            final SubLObject var14 = var15 = var13;
            SubLObject var16 = (SubLObject)module0287.NIL;
            SubLObject var17 = (SubLObject)module0287.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0287.$ic0$);
            var16 = var15.first();
            var15 = var15.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0287.$ic0$);
            var17 = var15.first();
            var15 = var15.rest();
            if (module0287.NIL == var15) {
                var2 = f19155(var16, var17, var2);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)module0287.$ic0$);
            }
            var7 = var7.rest();
            var13 = var7.first();
        }
        return var2;
    }
    
    public static SubLObject f19152(final SubLObject var16) {
        SubLObject var17 = (SubLObject)module0287.NIL;
        SubLObject var18 = var16;
        SubLObject var19 = (SubLObject)module0287.NIL;
        var19 = var18.first();
        while (module0287.NIL != var18) {
            if (module0287.NIL != module0210.f13571(var19)) {
                var17 = (SubLObject)ConsesLow.cons(module0285.f18990(var19), var17);
            }
            else {
                var17 = (SubLObject)ConsesLow.cons(var19, var17);
            }
            var18 = var18.rest();
            var19 = var18.first();
        }
        return Sequences.nreverse(var17);
    }
    
    public static SubLObject f19155(final SubLObject var8, final SubLObject var10, final SubLObject var2) {
        if (module0287.NIL != module0210.f13579(var10)) {
            return module0285.f18988(var10, conses_high.subst(var10, var8, var2, Symbols.symbol_function((SubLObject)module0287.EQUAL), (SubLObject)module0287.UNPROVIDED));
        }
        if (module0287.NIL != module0210.f13581(var10)) {
            final SubLObject var11 = f19154(var8);
            final SubLObject var12 = (SubLObject)ConsesLow.list(module0287.$ic1$, var11, var10);
            SubLObject var13 = (SubLObject)module0287.NIL;
            SubLObject var14 = conses_high.subst(var11, var8, var2, Symbols.symbol_function((SubLObject)module0287.EQUAL), (SubLObject)module0287.UNPROVIDED);
            SubLObject var15 = (SubLObject)module0287.NIL;
            var15 = var14.first();
            while (module0287.NIL != var14) {
                if (module0287.NIL != module0035.f2427(var11, var15, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED)) {
                    SubLObject var17;
                    final SubLObject var16 = var17 = var15;
                    SubLObject var18 = (SubLObject)module0287.NIL;
                    SubLObject var19 = (SubLObject)module0287.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0287.$ic2$);
                    var18 = var17.first();
                    var17 = var17.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0287.$ic2$);
                    var19 = var17.first();
                    var17 = var17.rest();
                    if (module0287.NIL == var17) {
                        var13 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0035.f2084(var12, var18), var19), var13);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0287.$ic2$);
                    }
                }
                else {
                    var13 = (SubLObject)ConsesLow.cons(var15, var13);
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
            return Sequences.nreverse(var13);
        }
        if (module0287.NIL != var10) {
            return conses_high.subst(var10, var8, var2, Symbols.symbol_function((SubLObject)module0287.EQUAL), (SubLObject)module0287.UNPROVIDED);
        }
        return var2;
    }
    
    public static SubLObject f19156(final SubLObject var26) {
        SubLObject var27 = module0205.f13277(var26, (SubLObject)module0287.UNPROVIDED);
        final SubLObject var28 = module0205.f13370(var26, (SubLObject)module0287.UNPROVIDED);
        if (module0287.NIL != var28) {
            var27 = (SubLObject)ConsesLow.cons(var28, var27);
        }
        return var27;
    }
    
    public static SubLObject f19154(final SubLObject var26) {
        final SubLObject var27 = module0205.f13276(var26);
        if (var27.eql(module0287.$ic3$)) {
            return module0205.f13368(var26, (SubLObject)module0287.UNPROVIDED);
        }
        if (var27.eql(module0287.$ic4$)) {
            return module0035.f2114(var26);
        }
        if (var27.eql(module0287.$ic5$)) {
            return module0035.f2115(var26);
        }
        if (var27.eql(module0287.$ic6$)) {
            return module0205.f13368(var26, (SubLObject)module0287.UNPROVIDED);
        }
        module0202.f12747((SubLObject)module0287.FIVE_INTEGER, (SubLObject)module0287.$ic7$, var26, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19157(final SubLObject var26, final SubLObject var2, final SubLObject var29) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        final SubLObject var31 = f19158(var26);
        SubLObject var32 = (SubLObject)module0287.NIL;
        SubLObject var33 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0287.$ic8$), Sort.sort(conses_high.copy_list(var29), Symbols.symbol_function((SubLObject)module0287.$ic9$), Symbols.symbol_function((SubLObject)module0287.$ic10$)));
        SubLObject var34 = (SubLObject)module0287.NIL;
        var34 = var33.first();
        while (module0287.NIL != var33) {
            if (module0287.NIL != module0004.f104(var34, conses_high.second(var26), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED)) {
                var32 = (SubLObject)ConsesLow.cons(var34, var32);
            }
            var33 = var33.rest();
            var34 = var33.first();
        }
        var32 = Sequences.nreverse(var32);
        if (module0146.$g1989$.getDynamicValue(var30).numGE((SubLObject)module0287.ONE_INTEGER) && (module0287.NIL != conses_high.set_difference(conses_high.second(var26), var32, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED) || module0287.NIL != conses_high.set_difference(var32, conses_high.second(var26), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED))) {
            module0202.f12747((SubLObject)module0287.THREE_INTEGER, (SubLObject)module0287.$ic11$, conses_high.second(var26), var32, (SubLObject)module0287.UNPROVIDED);
        }
        final SubLObject var35 = module0035.f2078(Symbols.symbol_function((SubLObject)module0287.$ic12$), var2, (SubLObject)module0287.UNPROVIDED);
        final SubLObject var36 = module0035.f2078(Symbols.symbol_function((SubLObject)module0287.$ic13$), var2, (SubLObject)module0287.UNPROVIDED);
        SubLObject var37 = (SubLObject)module0287.NIL;
        if (Sequences.length(var35).numG((SubLObject)module0287.ONE_INTEGER)) {
            Dynamic.sublisp_throw((SubLObject)module0287.$ic14$, (SubLObject)ConsesLow.list((SubLObject)module0287.$ic14$, f19159(var26), var35));
        }
        if (module0287.NIL == module0146.$g1994$.getDynamicValue(var30)) {
            SubLObject var38 = var32;
            SubLObject var39 = (SubLObject)module0287.NIL;
            var39 = var38.first();
            while (module0287.NIL != var38) {
                if (module0287.NIL != module0004.f104(var39, var36, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED)) {
                    var37 = (SubLObject)ConsesLow.cons(var39, var37);
                }
                var38 = var38.rest();
                var39 = var38.first();
            }
            return Sequences.nreverse(module0035.f2116(var31, var37));
        }
        if (module0287.NIL != var31) {
            return module0035.f2084(var31, var32);
        }
        return var32;
    }
    
    public static SubLObject f19153(final SubLObject var8, final SubLObject var36, final SubLObject var3, final SubLObject var4) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        SubLObject var38 = (SubLObject)module0287.NIL;
        SubLObject var39 = (SubLObject)module0287.NIL;
        final SubLObject var40 = f19160(var36);
        final SubLObject var41 = module0287.$g2638$.currentBinding(var37);
        try {
            module0287.$g2638$.bind((SubLObject)module0287.NIL, var37);
            var38 = f19161(f19154(var8), var40, Symbols.symbol_function((SubLObject)module0287.$ic15$));
            var39 = module0287.$g2638$.getDynamicValue(var37);
        }
        finally {
            module0287.$g2638$.rebind(var41, var37);
        }
        final SubLObject var42 = f19157(var8, var36, var39);
        final SubLObject var43 = f19159(var8);
        final SubLObject var44 = (module0287.NIL != var43) ? ((module0287.NIL != var42) ? module0202.f12710(var43, var42) : var43) : var42;
        final SubLObject var45 = Sequences.length(var42);
        if (module0287.NIL != f19162(var8)) {
            f19163(var8, var42, var36, var3, var38, var45);
        }
        final SubLObject var46 = f19164(var45, var38);
        final SubLObject var47 = f19165(var38, var3, var46);
        if (module0287.NIL != var47) {
            return (SubLObject)ConsesLow.cons(var47, var44);
        }
        if (module0287.NIL != var4) {
            final SubLObject var48 = f19166(var8, var36, (SubLObject)module0287.UNPROVIDED);
            final SubLObject var49 = f19167(var8, var42, var36);
            return f19168(var49, var44, var3, var38, var48);
        }
        if (module0287.NIL != module0035.f1966(var42, conses_high.second(var8))) {
            return (SubLObject)ConsesLow.cons(var8.first(), (SubLObject)ConsesLow.cons(var42, conses_high.cddr(var8)));
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19160(final SubLObject var2) {
        return module0036.f2531(var2, (SubLObject)module0287.$ic16$, (SubLObject)module0287.$ic17$, (SubLObject)module0287.UNPROVIDED);
    }
    
    public static SubLObject f19165(final SubLObject var37, final SubLObject var3, final SubLObject var44) {
        SubLObject var45 = (SubLObject)module0287.NIL;
        if (module0287.NIL == var45) {
            SubLObject var46 = var44;
            SubLObject var47 = (SubLObject)module0287.NIL;
            var47 = var46.first();
            while (module0287.NIL == var45 && module0287.NIL != var46) {
                SubLObject var49;
                final SubLObject var48 = var49 = var47;
                SubLObject var50 = (SubLObject)module0287.NIL;
                SubLObject var51 = (SubLObject)module0287.NIL;
                SubLObject var52 = (SubLObject)module0287.NIL;
                SubLObject var53 = (SubLObject)module0287.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)module0287.$ic18$);
                var50 = var49.first();
                var49 = var49.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)module0287.$ic18$);
                var51 = var49.first();
                var49 = var49.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)module0287.$ic18$);
                var52 = var49.first();
                var49 = var49.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)module0287.$ic18$);
                var53 = var49.first();
                var49 = var49.rest();
                if (module0287.NIL == var49) {
                    if (var37.equal(var53) && module0287.NIL != module0161.f10514(var3, var52)) {
                        var45 = var50;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var48, (SubLObject)module0287.$ic18$);
                }
                var46 = var46.rest();
                var47 = var46.first();
            }
        }
        return var45;
    }
    
    public static SubLObject f19167(final SubLObject var8, final SubLObject var31, final SubLObject var36) {
        return module0035.f2151((SubLObject)module0287.ONE_INTEGER, var31, module0285.f19067(var8, var36));
    }
    
    public static SubLObject f19169(final SubLObject var8) {
        return (module0287.NIL != f19158(var8)) ? ((module0287.NIL != f19159(var8)) ? ((module0287.NIL != module0146.$g1982$.getGlobalValue()) ? module0287.$ic19$ : module0287.$ic5$) : ((module0287.NIL != module0146.$g1982$.getGlobalValue()) ? module0287.$ic20$ : module0287.$ic5$)) : ((module0287.NIL != f19159(var8)) ? ((module0287.NIL != module0146.$g1982$.getGlobalValue()) ? module0287.$ic21$ : module0287.$ic4$) : ((module0287.NIL != module0146.$g1982$.getGlobalValue()) ? module0287.$ic22$ : module0287.$ic4$));
    }
    
    public static SubLObject f19168(final SubLObject var8, final SubLObject var31, final SubLObject var3, final SubLObject var56, final SubLObject var57) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        SubLObject var59 = (SubLObject)module0287.NIL;
        final SubLObject var60 = module0111.$g1406$.currentBinding(var58);
        try {
            module0111.$g1406$.bind((SubLObject)module0287.NIL, var58);
            final SubLObject var61 = module0290.f19499(var56);
            var59 = module0538.f33345(module0166.f10764(), var8, var3, var61, var57);
            module0146.$g1992$.setDynamicValue((SubLObject)module0287.T, var58);
            if (module0287.NIL != var59) {
                module0538.f33446(module0574.f35152(), module0051.f3557((SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED), module0538.f33465(), module0051.f3558((SubLObject)module0287.UNPROVIDED));
            }
        }
        finally {
            module0111.$g1406$.rebind(var60, var58);
        }
        return (SubLObject)ConsesLow.cons(var59, var31);
    }
    
    public static SubLObject f19161(final SubLObject var8, final SubLObject var2, SubLObject var60) {
        if (var60 == module0287.UNPROVIDED) {
            var60 = Symbols.symbol_function((SubLObject)module0287.$ic15$);
        }
        final SubLThread var61 = SubLProcess.currentSubLThread();
        SubLObject var62 = (SubLObject)module0287.NIL;
        SubLObject var63 = (SubLObject)module0287.NIL;
        SubLObject var64 = var2;
        SubLObject var65 = (SubLObject)module0287.NIL;
        var65 = var64.first();
        while (module0287.NIL != var64) {
            var63 = (SubLObject)ConsesLow.cons(module0285.f19032(var65, (SubLObject)module0287.UNPROVIDED), var63);
            var64 = var64.rest();
            var65 = var64.first();
        }
        if (module0287.NIL == module0146.$g2036$.getDynamicValue(var61)) {
            var63 = conses_high.subst(f19170(), var8, var63, Symbols.symbol_function((SubLObject)module0287.EQUAL), (SubLObject)module0287.UNPROVIDED);
        }
        var63 = (var64 = f19171(Sequences.nreverse(var63)));
        var65 = (SubLObject)module0287.NIL;
        var65 = var64.first();
        while (module0287.NIL != var64) {
            var62 = (SubLObject)ConsesLow.cons(f19172(var8, var65, var60), var62);
            var64 = var64.rest();
            var65 = var64.first();
        }
        return Sequences.nreverse(var62);
    }
    
    public static SubLObject f19171(final SubLObject var2) {
        if (module0287.NIL != module0035.f1997(var2)) {
            return var2;
        }
        return Sort.stable_sort(conses_high.copy_list(var2), Symbols.symbol_function((SubLObject)module0287.$ic23$), Symbols.symbol_function((SubLObject)module0287.$ic24$));
    }
    
    public static SubLObject f19172(final SubLObject var8, final SubLObject var21, SubLObject var60) {
        if (var60 == module0287.UNPROVIDED) {
            var60 = Symbols.symbol_function((SubLObject)module0287.$ic15$);
        }
        final SubLThread var61 = SubLProcess.currentSubLThread();
        SubLObject var62 = f19170();
        SubLObject var63 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(var8, var62));
        SubLObject var64 = (SubLObject)module0287.ONE_INTEGER;
        SubLObject var65 = module0282.f18743(module0204.f13084(var21, var60));
        SubLObject var66 = (SubLObject)module0287.NIL;
        var66 = var65.first();
        while (module0287.NIL != var65) {
            if (!var66.equal(var8) && !var66.equal(f19170())) {
                if (module0287.NIL == conses_high.assoc(var66, module0287.$g2638$.getDynamicValue(var61), Symbols.symbol_function((SubLObject)module0287.EQUAL), (SubLObject)module0287.UNPROVIDED)) {
                    module0287.$g2638$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var66, var64), module0287.$g2638$.getDynamicValue(var61)), var61);
                }
                var62 = module0279.f18441(var64, (SubLObject)module0287.$ic25$);
                var64 = Numbers.add(var64, (SubLObject)module0287.ONE_INTEGER);
                var63 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var66, var62), var63);
            }
            var65 = var65.rest();
            var66 = var65.first();
        }
        return conses_high.sublis(var63, var21, Symbols.symbol_function((SubLObject)module0287.EQUAL), (SubLObject)module0287.UNPROVIDED);
    }
    
    public static SubLObject f19170() {
        return module0279.f18441((SubLObject)module0287.ZERO_INTEGER, (SubLObject)module0287.$ic25$);
    }
    
    public static SubLObject f19173() {
        final SubLObject var66 = module0287.$g2639$.getGlobalValue();
        if (module0287.NIL != var66) {
            module0034.f1818(var66);
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19174(final SubLObject var67) {
        return module0034.f1829(module0287.$g2639$.getGlobalValue(), (SubLObject)ConsesLow.list(var67), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
    }
    
    public static SubLObject f19175(final SubLObject var67) {
        return module0038.f2638(module0202.f12941(var67, Symbols.symbol_function((SubLObject)module0287.$ic26$)));
    }
    
    public static SubLObject f19176(final SubLObject var67) {
        SubLObject var68 = module0287.$g2639$.getGlobalValue();
        if (module0287.NIL == var68) {
            var68 = module0034.f1934((SubLObject)module0287.$ic24$, (SubLObject)module0287.$ic27$, (SubLObject)module0287.$ic28$, (SubLObject)module0287.EQUAL, (SubLObject)module0287.ONE_INTEGER, (SubLObject)module0287.$ic29$);
        }
        SubLObject var69 = module0034.f1814(var68, var67, (SubLObject)module0287.$ic30$);
        if (var69 == module0287.$ic30$) {
            var69 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f19175(var67)));
            module0034.f1816(var68, var67, var69, (SubLObject)module0287.UNPROVIDED);
        }
        return module0034.f1959(var69);
    }
    
    public static SubLObject f19177(final SubLObject var70) {
        if (module0287.$ic31$.eql(var70)) {
            return (SubLObject)module0287.NIL;
        }
        return module0201.f12580(var70);
    }
    
    public static SubLObject f19178(final SubLObject var45, final SubLObject var8, final SubLObject var3, final SubLObject var56) {
        return (SubLObject)ConsesLow.list(var45, var8, var3, var56);
    }
    
    public static SubLObject f19179(final SubLObject var71, SubLObject var30) {
        if (var30 == module0287.UNPROVIDED) {
            var30 = (SubLObject)module0287.NIL;
        }
        if (module0287.NIL != var30) {
            return Numbers.add((SubLObject)module0287.ONE_INTEGER, Sequences.length(var71));
        }
        return Sequences.length(var71);
    }
    
    public static SubLObject f19180(final SubLObject var71, final SubLObject var19, final SubLObject var72, final SubLObject var30) {
        if (module0287.NIL != var30) {
            return (SubLObject)ConsesLow.list(module0287.$ic6$, var71, var19, var72, var30);
        }
        return (SubLObject)ConsesLow.list(module0287.$ic3$, var71, var19, var72);
    }
    
    public static SubLObject f19181(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        SubLObject var60 = (SubLObject)module0287.NIL;
        SubLObject var61 = (SubLObject)module0287.NIL;
        try {
            var59.throwStack.push(module0287.$ic32$);
            SubLObject var62 = (SubLObject)module0287.NIL;
            SubLObject var63 = (SubLObject)module0287.NIL;
            final Iterator var64 = Hashtables.getEntrySetIterator(module0146.$g2067$.getGlobalValue());
            try {
                while (Hashtables.iteratorHasNext(var64)) {
                    final Map.Entry var65 = Hashtables.iteratorNextEntry(var64);
                    var62 = Hashtables.getEntryKey(var65);
                    SubLObject var66;
                    var63 = (var66 = Hashtables.getEntryValue(var65));
                    SubLObject var67 = (SubLObject)module0287.NIL;
                    var67 = var66.first();
                    while (module0287.NIL != var66) {
                        if (var67.first().eql(var58)) {
                            var60 = var67;
                            module0012.f425();
                        }
                        var66 = var66.rest();
                        var67 = var66.first();
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var64);
            }
        }
        catch (Throwable var68) {
            var61 = Errors.handleThrowable(var68, (SubLObject)module0287.$ic32$);
        }
        finally {
            var59.throwStack.pop();
        }
        return var60;
    }
    
    public static SubLObject f19182(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        SubLObject var60 = (SubLObject)module0287.NIL;
        SubLObject var61 = (SubLObject)module0287.NIL;
        try {
            var59.throwStack.push(module0287.$ic32$);
            SubLObject var62 = (SubLObject)module0287.NIL;
            SubLObject var63 = (SubLObject)module0287.NIL;
            final Iterator var64 = Hashtables.getEntrySetIterator(module0146.$g2067$.getGlobalValue());
            try {
                while (Hashtables.iteratorHasNext(var64)) {
                    final Map.Entry var65 = Hashtables.iteratorNextEntry(var64);
                    var62 = Hashtables.getEntryKey(var65);
                    SubLObject var66;
                    var63 = (var66 = Hashtables.getEntryValue(var65));
                    SubLObject var67 = (SubLObject)module0287.NIL;
                    var67 = var66.first();
                    while (module0287.NIL != var66) {
                        if (var67.first().eql(var58)) {
                            var60 = (SubLObject)ConsesLow.list(var67, var62);
                            module0012.f425();
                        }
                        var66 = var66.rest();
                        var67 = var66.first();
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var64);
            }
        }
        catch (Throwable var68) {
            var61 = Errors.handleThrowable(var68, (SubLObject)module0287.$ic32$);
        }
        finally {
            var59.throwStack.pop();
        }
        return var60;
    }
    
    public static SubLObject f19183(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        SubLObject var60 = (SubLObject)module0287.NIL;
        SubLObject var61 = (SubLObject)module0287.NIL;
        try {
            var59.throwStack.push(module0287.$ic32$);
            SubLObject var62 = (SubLObject)module0287.NIL;
            SubLObject var63 = (SubLObject)module0287.NIL;
            final Iterator var64 = Hashtables.getEntrySetIterator(module0146.$g2067$.getGlobalValue());
            try {
                while (Hashtables.iteratorHasNext(var64)) {
                    final Map.Entry var65 = Hashtables.iteratorNextEntry(var64);
                    var62 = Hashtables.getEntryKey(var65);
                    SubLObject var66;
                    var63 = (var66 = Hashtables.getEntryValue(var65));
                    SubLObject var67 = (SubLObject)module0287.NIL;
                    var67 = var66.first();
                    while (module0287.NIL != var66) {
                        if (var67.first().eql(var58)) {
                            var60 = var62;
                            module0012.f425();
                        }
                        var66 = var66.rest();
                        var67 = var66.first();
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var64);
            }
        }
        catch (Throwable var68) {
            var61 = Errors.handleThrowable(var68, (SubLObject)module0287.$ic32$);
        }
        finally {
            var59.throwStack.pop();
        }
        return var60;
    }
    
    public static SubLObject f19184(final SubLObject var80) {
        return var80.first();
    }
    
    public static SubLObject f19185(final SubLObject var58) {
        return conses_high.second(f19181(var58));
    }
    
    public static SubLObject f19186(final SubLObject var81) {
        return conses_high.third(f19181(var81));
    }
    
    public static SubLObject f19159(final SubLObject var26) {
        if (module0287.NIL != f19187(var26)) {
            return (SubLObject)module0287.NIL;
        }
        return module0205.f13370(var26, (SubLObject)module0287.UNPROVIDED);
    }
    
    public static SubLObject f19188(final SubLObject var58) {
        return f19159(f19185(var58));
    }
    
    public static SubLObject f19187(final SubLObject var26) {
        if (module0287.$ic3$.eql(module0205.f13276(var26))) {
            return module0202.f12734(var26, (SubLObject)module0287.TWO_INTEGER, (SubLObject)module0287.UNPROVIDED);
        }
        if (module0287.$ic6$.eql(module0205.f13276(var26))) {
            return module0202.f12734(var26, (SubLObject)module0287.THREE_INTEGER, (SubLObject)module0287.UNPROVIDED);
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19158(final SubLObject var26) {
        if (module0287.NIL != f19187(var26)) {
            return module0205.f13370(var26, (SubLObject)module0287.UNPROVIDED);
        }
        return module0205.f13371(var26, (SubLObject)module0287.UNPROVIDED);
    }
    
    public static SubLObject f19189(final SubLObject var58) {
        return f19158(f19185(var58));
    }
    
    public static SubLObject f19190(final SubLObject var58) {
        return conses_high.second(f19185(var58));
    }
    
    public static SubLObject f19191(final SubLObject var58) {
        return f19154(f19185(var58));
    }
    
    public static SubLObject f19192(final SubLObject var81) {
        final SubLObject var82 = f19193(var81);
        final SubLObject var83 = f19158(var82);
        if (module0287.NIL == var83) {
            return (module0287.NIL != f19187(var82)) ? module0035.f2084((SubLObject)module0287.NIL, var82) : var82;
        }
        SubLObject var85;
        final SubLObject var84 = var85 = var82;
        SubLObject var86 = (SubLObject)module0287.NIL;
        SubLObject var87 = (SubLObject)module0287.NIL;
        SubLObject var88 = (SubLObject)module0287.NIL;
        SubLObject var89 = (SubLObject)module0287.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0287.$ic33$);
        var86 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0287.$ic33$);
        var87 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0287.$ic33$);
        var88 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0287.$ic33$);
        var89 = var85.first();
        var85 = var85.rest();
        final SubLObject var90 = (SubLObject)(var85.isCons() ? var85.first() : module0287.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var85, var84, (SubLObject)module0287.$ic33$);
        var85 = var85.rest();
        if (module0287.NIL == var85) {
            return (module0287.NIL != f19187(var82)) ? module0202.f12683(var86, (SubLObject)ConsesLow.list(conses_high.butlast(var87, (SubLObject)module0287.UNPROVIDED), var88, (SubLObject)module0287.NIL, var89), (SubLObject)module0287.UNPROVIDED) : module0202.f12683(var86, (SubLObject)ConsesLow.list(conses_high.butlast(var87, (SubLObject)module0287.UNPROVIDED), var88, var89, var90), (SubLObject)module0287.UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(var84, (SubLObject)module0287.$ic33$);
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19193(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        var59.resetMultipleValues();
        final SubLObject var60 = f19194(var58, f19195(var58, (SubLObject)module0287.UNPROVIDED));
        final SubLObject var61 = var59.secondMultipleValue();
        final SubLObject var62 = var59.thirdMultipleValue();
        final SubLObject var63 = var59.fourthMultipleValue();
        var59.resetMultipleValues();
        if (module0287.NIL != var61) {
            final SubLObject var64 = module0282.f18743(var60);
            final SubLObject var65 = (module0287.NIL != var63) ? Sequences.nreverse((SubLObject)ConsesLow.cons(var63, Sequences.nreverse(var64))) : var64;
            final SubLObject var66 = f19180(var65, var61, var62, var63);
            return var66;
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19194(final SubLObject var58, final SubLObject var90) {
        SubLObject var91 = (SubLObject)module0287.NIL;
        SubLObject var92 = (SubLObject)module0287.NIL;
        SubLObject var93 = (SubLObject)module0287.NIL;
        SubLObject var94 = (SubLObject)module0287.NIL;
        SubLObject var95 = (SubLObject)module0287.NIL;
        SubLObject var96 = (SubLObject)module0287.NIL;
        SubLObject var97 = (SubLObject)module0287.NIL;
        SubLObject var98 = var90;
        SubLObject var99 = (SubLObject)module0287.NIL;
        var99 = var98.first();
        while (module0287.NIL != var98) {
            final SubLObject var100 = module0538.f33482(var99);
            final SubLObject var101 = module0289.f19484(var100);
            SubLObject var102 = (SubLObject)module0287.NIL;
            SubLObject var103 = (SubLObject)module0287.NIL;
            SubLObject var104 = (SubLObject)module0287.NIL;
            if (module0287.NIL == var101 && module0225.f14739(var58).eql((SubLObject)module0287.ZERO_INTEGER)) {
                var91 = (SubLObject)ConsesLow.cons(var100, var91);
                var97 = (SubLObject)module0287.T;
            }
            else {
                var102 = conses_high.set_difference(module0232.f15308(var100), var101, Symbols.symbol_function((SubLObject)module0287.EQUAL), (SubLObject)module0287.UNPROVIDED);
                var103 = conses_high.set_difference(module0232.f15306(var100), var101, Symbols.symbol_function((SubLObject)module0287.EQUAL), (SubLObject)module0287.UNPROVIDED);
                var104 = module0232.f15326(var103, var102);
                SubLObject var7_96 = var101;
                SubLObject var105 = (SubLObject)module0287.NIL;
                var105 = var7_96.first();
                while (module0287.NIL != var7_96) {
                    if (module0287.NIL == module0210.f13577(module0202.f12835(var105, (SubLObject)module0287.UNPROVIDED))) {
                        var104 = conses_high.subst(module0202.f12835(var105, (SubLObject)module0287.UNPROVIDED), module0202.f12834(var105, (SubLObject)module0287.UNPROVIDED), var104, Symbols.symbol_function((SubLObject)module0287.EQUAL), (SubLObject)module0287.UNPROVIDED);
                    }
                    var7_96 = var7_96.rest();
                    var105 = var7_96.first();
                }
                SubLObject var7_97 = var101;
                var105 = (SubLObject)module0287.NIL;
                var105 = var7_97.first();
                while (module0287.NIL != var7_97) {
                    if (var58.eql(module0205.f13276(module0202.f12835(var105, (SubLObject)module0287.UNPROVIDED))) && module0287.NIL == var94) {
                        var94 = module0202.f12834(var105, (SubLObject)module0287.UNPROVIDED);
                        if (module0287.NIL == var92) {
                            var92 = module0205.f13304(module0202.f12835(var105, (SubLObject)module0287.UNPROVIDED), (SubLObject)module0287.UNPROVIDED);
                            final SubLObject var106 = module0202.f12707(module0202.f12835(var105, (SubLObject)module0287.UNPROVIDED), (SubLObject)module0287.UNPROVIDED);
                            if (module0287.NIL != var106) {
                                if (module0287.NIL != var95 && !var106.eql(var95)) {
                                    Errors.warn((SubLObject)module0287.$ic34$, var58, var95, var106);
                                }
                                else {
                                    var95 = var106;
                                }
                            }
                            SubLObject var7_98 = var92;
                            SubLObject var107 = (SubLObject)module0287.NIL;
                            var107 = var7_98.first();
                            while (module0287.NIL != var7_98) {
                                if (module0287.NIL != module0552.f34132(var107)) {
                                    var93 = (SubLObject)ConsesLow.cons(var107, var93);
                                }
                                else if (module0287.NIL != f19196(var107, module0178.f11287(var99)) && var107.equal(module0035.f2114(var92))) {
                                    if (module0287.NIL == var96) {
                                        var96 = var107;
                                    }
                                }
                                else {
                                    Errors.warn((SubLObject)module0287.$ic35$, var58);
                                    var93 = (SubLObject)ConsesLow.cons(var107, var93);
                                }
                                var7_98 = var7_98.rest();
                                var107 = var7_98.first();
                            }
                            var93 = Sequences.nreverse(var93);
                        }
                    }
                    var7_97 = var7_97.rest();
                    var105 = var7_97.first();
                }
                var91 = (SubLObject)ConsesLow.cons(var104, var91);
            }
            var98 = var98.rest();
            var99 = var98.first();
        }
        var91 = Sequences.nreverse(var91);
        if (module0287.NIL != var97 && module0287.NIL == var94) {
            final SubLObject var108 = module0172.f10921((SubLObject)ConsesLow.list(var58));
            if (module0287.NIL != var108) {
                var94 = module0279.f18513(var91, (SubLObject)module0287.UNPROVIDED);
                if (!module0287.$ic36$.eql(var94)) {
                    print_high.print(var94, (SubLObject)module0287.UNPROVIDED);
                }
            }
        }
        return Values.values(var93, var94, var95, var96);
    }
    
    public static SubLObject f19197(final SubLObject var37) {
        if (module0287.NIL != var37) {
            SubLObject var38 = (SubLObject)module0287.NIL;
            SubLObject var39 = (SubLObject)module0287.NIL;
            SubLObject var40 = (SubLObject)module0287.NIL;
            SubLObject var41 = (SubLObject)module0287.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var37, var37, (SubLObject)module0287.$ic37$);
            var38 = var37.first();
            SubLObject var42 = var37.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var42, var37, (SubLObject)module0287.$ic37$);
            var39 = var42.first();
            var42 = var42.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var42, var37, (SubLObject)module0287.$ic37$);
            var40 = var42.first();
            var42 = var42.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var42, var37, (SubLObject)module0287.$ic37$);
            var41 = var42.first();
            var42 = var42.rest();
            if (module0287.NIL == var42) {
                final SubLObject var43 = conses_high.second(var39);
                return f19198(Sequences.length(var43), var41);
            }
            cdestructuring_bind.cdestructuring_bind_error(var37, (SubLObject)module0287.$ic37$);
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19199(final SubLObject var58) {
        return f19197(f19181(var58));
    }
    
    public static SubLObject f19198(final SubLObject var103, final SubLObject var36) {
        return (SubLObject)ConsesLow.cons(var103, module0285.f19001(module0205.f13191(f19200(var36), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED)));
    }
    
    public static SubLObject f19200(final SubLObject var2) {
        return module0036.f2531(var2, (SubLObject)module0287.$ic16$, (SubLObject)module0287.$ic38$, (SubLObject)module0287.UNPROVIDED);
    }
    
    public static SubLObject f19164(final SubLObject var103, final SubLObject var36) {
        final SubLObject var104 = f19198(var103, var36);
        final SubLObject var105 = Hashtables.gethash(var104, module0146.$g2067$.getGlobalValue(), (SubLObject)module0287.UNPROVIDED);
        final SubLObject var106 = (SubLObject)ConsesLow.cons(var103, module0285.f19001(module0205.f13194(var36, (SubLObject)module0287.UNPROVIDED)));
        final SubLObject var107 = Hashtables.gethash(var106, module0146.$g2067$.getGlobalValue(), (SubLObject)module0287.UNPROVIDED);
        if (module0287.NIL != var107) {
            return ConsesLow.append(var105, var107);
        }
        return var105;
    }
    
    public static SubLObject f19201(final SubLObject var80) {
        SubLObject var81 = (SubLObject)module0287.NIL;
        SubLObject var82 = (SubLObject)module0287.NIL;
        SubLObject var83 = (SubLObject)module0287.NIL;
        SubLObject var84 = (SubLObject)module0287.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var80, (SubLObject)module0287.$ic37$);
        var81 = var80.first();
        SubLObject var85 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var80, (SubLObject)module0287.$ic37$);
        var82 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var80, (SubLObject)module0287.$ic37$);
        var83 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var80, (SubLObject)module0287.$ic37$);
        var84 = var85.first();
        var85 = var85.rest();
        if (module0287.NIL == var85) {
            return var84;
        }
        cdestructuring_bind.cdestructuring_bind_error(var80, (SubLObject)module0287.$ic37$);
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19202(final SubLObject var80) {
        SubLObject var81 = (SubLObject)module0287.NIL;
        SubLObject var82 = (SubLObject)module0287.NIL;
        SubLObject var83 = (SubLObject)module0287.NIL;
        SubLObject var84 = (SubLObject)module0287.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var80, (SubLObject)module0287.$ic37$);
        var81 = var80.first();
        SubLObject var85 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var80, (SubLObject)module0287.$ic37$);
        var82 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var80, (SubLObject)module0287.$ic37$);
        var83 = var85.first();
        var85 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var85, var80, (SubLObject)module0287.$ic37$);
        var84 = var85.first();
        var85 = var85.rest();
        if (module0287.NIL == var85) {
            return var83;
        }
        cdestructuring_bind.cdestructuring_bind_error(var80, (SubLObject)module0287.$ic37$);
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19203(final SubLObject var58) {
        SubLObject var59 = (SubLObject)module0287.NIL;
        SubLObject var60 = f19195(var58, (SubLObject)module0287.UNPROVIDED);
        SubLObject var61 = (SubLObject)module0287.NIL;
        var61 = var60.first();
        while (module0287.NIL != var60) {
            final SubLObject var62 = module0178.f11282(var61);
            if (module0287.NIL == conses_high.member(var62, var59, Symbols.symbol_function((SubLObject)module0287.EQUAL), Symbols.symbol_function((SubLObject)module0287.IDENTITY))) {
                var59 = (SubLObject)ConsesLow.cons(var62, var59);
            }
            var60 = var60.rest();
            var61 = var60.first();
        }
        return Sequences.nreverse(var59);
    }
    
    public static SubLObject f19204(final SubLObject var58, SubLObject var111) {
        if (var111 == module0287.UNPROVIDED) {
            var111 = (SubLObject)module0287.NIL;
        }
        final SubLThread var112 = SubLProcess.currentSubLThread();
        SubLObject var113 = (SubLObject)module0287.NIL;
        SubLObject var114 = (SubLObject)module0287.NIL;
        try {
            var112.throwStack.push(module0287.$ic39$);
            final SubLObject var115 = Errors.$error_handler$.currentBinding(var112);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0287.$ic40$), var112);
                try {
                    var113 = f19195(var58, var111);
                }
                catch (Throwable var116) {
                    Errors.handleThrowable(var116, (SubLObject)module0287.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var115, var112);
            }
        }
        catch (Throwable var117) {
            var114 = Errors.handleThrowable(var117, (SubLObject)module0287.$ic39$);
        }
        finally {
            var112.throwStack.pop();
        }
        if (module0287.NIL == var113) {
            final SubLObject var115 = module0147.$g2094$.currentBinding(var112);
            final SubLObject var118 = module0147.$g2095$.currentBinding(var112);
            try {
                module0147.$g2094$.bind((SubLObject)module0287.$ic41$, var112);
                module0147.$g2095$.bind(module0287.$ic42$, var112);
                var113 = module0219.f14521(var58, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var118, var112);
                module0147.$g2094$.rebind(var115, var112);
            }
        }
        return var113;
    }
    
    public static SubLObject f19205(final SubLObject var115) {
        return Types.sublisp_null(f19204(var115, (SubLObject)module0287.UNPROVIDED));
    }
    
    public static SubLObject f19206(final SubLObject var115) {
        return Types.sublisp_null(f19195(var115, (SubLObject)module0287.UNPROVIDED));
    }
    
    public static SubLObject f19207(final SubLObject var58) {
        return module0220.f14552(var58, module0287.$ic43$, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
    }
    
    public static SubLObject f19195(final SubLObject var58, SubLObject var111) {
        if (var111 == module0287.UNPROVIDED) {
            var111 = (SubLObject)module0287.NIL;
        }
        final SubLObject var112 = f19207(var58);
        if (module0287.NIL != var112) {
            final SubLObject var113 = module0178.f11299(var112).first();
            if (module0287.NIL != module0184.f11659(var113)) {
                return module0188.f11770(var113);
            }
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19208(final SubLObject var118) {
        SubLObject var119 = (SubLObject)module0287.NIL;
        SubLObject var120 = var118;
        SubLObject var121 = (SubLObject)module0287.NIL;
        var121 = var120.first();
        while (module0287.NIL != var120) {
            final SubLObject var122 = f19195(var121, (SubLObject)module0287.UNPROVIDED);
            if (var122.isVector()) {
                final SubLObject var123 = var122;
                final SubLObject var124 = (SubLObject)module0287.NIL;
                SubLObject var125;
                SubLObject var126;
                SubLObject var127;
                SubLObject var128;
                for (var125 = Sequences.length(var123), var126 = (SubLObject)module0287.NIL, var126 = (SubLObject)module0287.ZERO_INTEGER; var126.numL(var125); var126 = Numbers.add(var126, (SubLObject)module0287.ONE_INTEGER)) {
                    var127 = ((module0287.NIL != var124) ? Numbers.subtract(var125, var126, (SubLObject)module0287.ONE_INTEGER) : var126);
                    var128 = Vectors.aref(var123, var127);
                    var119 = (SubLObject)ConsesLow.cons(var128, var119);
                }
            }
            else {
                SubLObject var7_126 = var122;
                SubLObject var129 = (SubLObject)module0287.NIL;
                var129 = var7_126.first();
                while (module0287.NIL != var7_126) {
                    var119 = (SubLObject)ConsesLow.cons(var129, var119);
                    var7_126 = var7_126.rest();
                    var129 = var7_126.first();
                }
            }
            var120 = var120.rest();
            var121 = var120.first();
        }
        return Sequences.delete_duplicates(Sequences.nreverse(var119), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
    }
    
    public static SubLObject f19209(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        SubLObject var60 = (SubLObject)module0287.NIL;
        final SubLObject var61 = module0146.$g1962$.currentBinding(var59);
        try {
            module0146.$g1962$.bind((SubLObject)module0287.$ic44$, var59);
            var60 = module0205.f13183(f19195(var58, (SubLObject)module0287.NIL), (SubLObject)module0287.$ic45$, (SubLObject)module0287.T, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
        }
        finally {
            module0146.$g1962$.rebind(var61, var59);
        }
        return var60;
    }
    
    public static SubLObject f19210(final SubLObject var58) {
        return Sequences.remove(var58, f19209(var58), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
    }
    
    public static SubLObject f19211(final SubLObject var58) {
        return module0213.f13937(conses_high.copy_list(f19209(var58))).first();
    }
    
    public static SubLObject f19212(final SubLObject var118) {
        return module0211.f13708(f19208(var118));
    }
    
    public static SubLObject f19213(final SubLObject var58, final SubLObject var92) {
        final SubLThread var93 = SubLProcess.currentSubLThread();
        if (module0287.NIL != module0178.f11284(var92)) {
            SubLObject var94 = (SubLObject)module0287.NIL;
            final SubLObject var95 = module0147.$g2094$.currentBinding(var93);
            final SubLObject var96 = module0147.$g2095$.currentBinding(var93);
            final SubLObject var97 = module0205.$g2314$.currentBinding(var93);
            try {
                module0147.$g2094$.bind((SubLObject)module0287.$ic46$, var93);
                module0147.$g2095$.bind(module0178.f11287(var92), var93);
                module0205.$g2314$.bind((SubLObject)module0287.$ic47$, var93);
                var94 = module0205.f13222(var58, var92, (SubLObject)module0287.NIL, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
            }
            finally {
                module0205.$g2314$.rebind(var97, var93);
                module0147.$g2095$.rebind(var96, var93);
                module0147.$g2094$.rebind(var95, var93);
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(module0287.NIL == var94);
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19214(final SubLObject var58, final SubLObject var92, SubLObject var111) {
        if (var111 == module0287.UNPROVIDED) {
            var111 = (SubLObject)module0287.NIL;
        }
        return module0004.f104(var92, f19195(var58, var111), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
    }
    
    public static SubLObject f19215(final SubLObject var58, final SubLObject var129, SubLObject var130) {
        if (var130 == module0287.UNPROVIDED) {
            var130 = (SubLObject)module0287.NIL;
        }
        final SubLObject var131 = f19181(var58);
        final SubLObject var132 = module0178.f11287(var129);
        if (module0287.NIL != var131) {
            if (module0287.NIL != module0161.f10514(var132, f19202(var131))) {
                final SubLObject var133 = f19201(var131);
                final SubLObject var134 = (module0287.NIL != var130) ? var130 : var58;
                final SubLObject var135 = conses_high.subst(f19170(), var134, module0178.f11282(var129), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
                if (module0287.NIL != module0202.f12985((SubLObject)module0287.TWO_INTEGER) && module0287.NIL != module0035.f2428(var134, module0178.f11282(var129), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED) && module0287.NIL == f19216(var58)) {
                    module0202.f12984((SubLObject)module0287.TWO_INTEGER, (SubLObject)module0287.$ic48$, var58, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
                }
                return module0004.f104(var135, var133, Symbols.symbol_function((SubLObject)module0287.EQUAL), (SubLObject)module0287.UNPROVIDED);
            }
        }
        else if (module0287.NIL != module0210.f13580(var58)) {
            final SubLObject var136 = module0205.f13365(var58);
            return f19215(var136, var129, var58);
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19216(final SubLObject var133) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0287.NIL != module0210.f13578(var133) && module0287.ZERO_INTEGER.eql(module0225.f14739(var133)));
    }
    
    public static SubLObject f19217(final SubLObject var92) {
        final SubLThread var93 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0287.NIL == module0178.f11375(var92) || (module0287.NIL != module0178.f11284(var92) && module0287.NIL != module0004.f104(module0178.f11333(var92), module0146.$g2071$.getDynamicValue(var93), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED) && (!module0178.f11333(var92).eql(module0287.$ic49$) || (module0287.NIL != module0210.f13578(module0178.f11334(var92)) && module0287.NIL != module0256.f16576(module0178.f11335(var92), module0287.$ic4$, module0178.f11287(var92), (SubLObject)module0287.UNPROVIDED)))));
    }
    
    public static SubLObject f19218(final SubLObject var92) {
        if (module0287.NIL != module0205.f13145((SubLObject)module0287.$ic50$, module0178.f11289(var92), (SubLObject)module0287.T, (SubLObject)module0287.UNPROVIDED) || module0287.NIL != module0205.f13145((SubLObject)module0287.$ic50$, module0178.f11287(var92), (SubLObject)module0287.T, (SubLObject)module0287.UNPROVIDED)) {
            final SubLObject var93 = module0178.f11301(var92);
            return module0004.f104(module0287.$ic43$, Mapping.mapcar((SubLObject)module0287.$ic51$, Mapping.mapcar((SubLObject)module0287.$ic52$, var93)), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19219(final SubLObject var58, final SubLObject var92) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0287.NIL != module0205.f13220(var58, var92, (SubLObject)module0287.T, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED) && module0287.NIL != f19214(var58, var92, (SubLObject)module0287.UNPROVIDED));
    }
    
    public static SubLObject f19220(final SubLObject var92) {
        final SubLThread var93 = SubLProcess.currentSubLThread();
        SubLObject var94 = (SubLObject)module0287.NIL;
        final SubLObject var95 = module0146.$g1962$.currentBinding(var93);
        try {
            module0146.$g1962$.bind((SubLObject)module0287.$ic53$, var93);
            var94 = module0205.f13183(var92, Symbols.symbol_function((SubLObject)module0287.$ic54$), (SubLObject)module0287.NIL, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
        }
        finally {
            module0146.$g1962$.rebind(var95, var93);
        }
        return var94;
    }
    
    public static SubLObject f19221(final SubLObject var92) {
        SubLObject var93 = (SubLObject)module0287.NIL;
        SubLObject var94 = f19220(var92);
        SubLObject var95 = (SubLObject)module0287.NIL;
        var95 = var94.first();
        while (module0287.NIL != var94) {
            if (module0287.NIL != f19219(var95, var92)) {
                var93 = (SubLObject)ConsesLow.cons(var95, var93);
            }
            var94 = var94.rest();
            var95 = var94.first();
        }
        return Sequences.nreverse(var93);
    }
    
    public static SubLObject f19222(final SubLObject var58, final SubLObject var3, SubLObject var111) {
        if (var111 == module0287.UNPROVIDED) {
            var111 = (SubLObject)module0287.NIL;
        }
        final SubLThread var112 = SubLProcess.currentSubLThread();
        SubLObject var113 = (SubLObject)module0287.NIL;
        final SubLObject var114 = module0147.$g2095$.currentBinding(var112);
        try {
            module0147.$g2095$.bind(var3, var112);
            SubLObject var115 = f19195(var58, var111);
            SubLObject var116 = (SubLObject)module0287.NIL;
            var116 = var115.first();
            while (module0287.NIL != var115) {
                final SubLObject var117 = var116;
                if (module0287.NIL == conses_high.member(var117, var113, Symbols.symbol_function((SubLObject)module0287.EQL), Symbols.symbol_function((SubLObject)module0287.IDENTITY))) {
                    var113 = (SubLObject)ConsesLow.cons(var117, var113);
                }
                var115 = var115.rest();
                var116 = var115.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var114, var112);
        }
        return var113;
    }
    
    public static SubLObject f19223() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (module0287.NIL == Errors.$ignore_mustsP$.getDynamicValue(var5) && module0287.NIL == f19224()) {
            Errors.error((SubLObject)module0287.$ic55$);
        }
        return module0287.$g2640$.getDynamicValue(var5).first();
    }
    
    public static SubLObject f19225() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (module0287.NIL == Errors.$ignore_mustsP$.getDynamicValue(var5) && module0287.NIL == f19224()) {
            Errors.error((SubLObject)module0287.$ic56$);
        }
        return conses_high.second(module0287.$g2640$.getDynamicValue(var5));
    }
    
    public static SubLObject f19226() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (module0287.NIL == Errors.$ignore_mustsP$.getDynamicValue(var5) && module0287.NIL == f19224()) {
            Errors.error((SubLObject)module0287.$ic57$);
        }
        return conses_high.third(module0287.$g2640$.getDynamicValue(var5));
    }
    
    public static SubLObject f19227() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (module0287.NIL == Errors.$ignore_mustsP$.getDynamicValue(var5) && module0287.NIL == f19224()) {
            Errors.error((SubLObject)module0287.$ic58$);
        }
        return conses_high.fourth(module0287.$g2640$.getDynamicValue(var5));
    }
    
    public static SubLObject f19228() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (module0287.NIL == Errors.$ignore_mustsP$.getDynamicValue(var5) && module0287.NIL == f19224()) {
            Errors.error((SubLObject)module0287.$ic59$);
        }
        return conses_high.fifth(module0287.$g2640$.getDynamicValue(var5));
    }
    
    public static SubLObject f19229() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (module0287.NIL == Errors.$ignore_mustsP$.getDynamicValue(var5) && module0287.NIL == f19224()) {
            Errors.error((SubLObject)module0287.$ic60$);
        }
        return conses_high.sixth(module0287.$g2640$.getDynamicValue(var5));
    }
    
    public static SubLObject f19230(final SubLObject var37, final SubLObject var75) {
        final SubLThread var76 = SubLProcess.currentSubLThread();
        if (module0287.NIL == Errors.$ignore_mustsP$.getDynamicValue(var76) && module0287.NIL == f19224()) {
            Errors.error((SubLObject)module0287.$ic61$);
        }
        module0035.f2044((SubLObject)module0287.THREE_INTEGER, var37, module0287.$g2640$.getDynamicValue(var76));
        module0035.f2044((SubLObject)module0287.FOUR_INTEGER, var75, module0287.$g2640$.getDynamicValue(var76));
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19231(final SubLObject var63) {
        final SubLThread var64 = SubLProcess.currentSubLThread();
        if (module0287.NIL == Errors.$ignore_mustsP$.getDynamicValue(var64) && module0287.NIL == f19224()) {
            Errors.error((SubLObject)module0287.$ic62$);
        }
        module0035.f2044((SubLObject)module0287.FIVE_INTEGER, var63, module0287.$g2640$.getDynamicValue(var64));
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19224() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean(module0287.$g2640$.getDynamicValue(var5));
    }
    
    public static SubLObject f19232(final SubLObject var58) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0287.NIL != f19224() && var58.eql(f19223()));
    }
    
    public static SubLObject f19162(final SubLObject var8) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0287.NIL != f19224() && ((module0287.$ic63$ == f19225() && module0287.NIL != module0205.f13220(module0233.f15355(f19229().first()), var8, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED)) || f19154(var8).eql(f19225())));
    }
    
    public static SubLObject f19233(final SubLObject var135, final SubLObject var11) {
        final SubLThread var136 = SubLProcess.currentSubLThread();
        if (module0287.NIL == Errors.$ignore_mustsP$.getDynamicValue(var136) && module0287.NIL == f19224()) {
            Errors.error((SubLObject)module0287.$ic64$);
        }
        final SubLObject var137 = (SubLObject)ConsesLow.cons(var135, var11);
        if (module0287.NIL == module0035.f2171(var137, f19229())) {
            f19231((SubLObject)ConsesLow.cons(var137, f19229()));
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19163(final SubLObject var8, final SubLObject var40, final SubLObject var36, final SubLObject var3, final SubLObject var37, final SubLObject var43) {
        final SubLObject var44 = module0205.f13257(f19229(), var8, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
        final SubLObject var45 = f19167(var44, var40, var36);
        final SubLObject var46 = f19198(var43, var37);
        final SubLObject var47 = f19178(f19223(), var45, var3, var37);
        f19230(var47, var46);
        if (module0287.NIL != f19226()) {
            f19234(var47, var46);
        }
        return Values.values(var47, var46);
    }
    
    public static SubLObject f19235(final SubLObject var58, SubLObject var75) {
        if (var75 == module0287.UNPROVIDED) {
            var75 = f19183(var58);
        }
        SubLObject var76 = (SubLObject)module0287.NIL;
        SubLObject var77 = Hashtables.gethash(var75, module0146.$g2067$.getGlobalValue(), (SubLObject)module0287.UNPROVIDED);
        SubLObject var78 = (SubLObject)module0287.NIL;
        var78 = var77.first();
        while (module0287.NIL != var77) {
            if (!var58.eql(var78.first())) {
                var76 = (SubLObject)ConsesLow.cons(var78, var76);
            }
            var77 = var77.rest();
            var78 = var77.first();
        }
        Hashtables.sethash(var75, module0146.$g2067$.getGlobalValue(), Sequences.nreverse(var76));
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19234(final SubLObject var37, SubLObject var75) {
        if (var75 == module0287.UNPROVIDED) {
            var75 = f19197(var37);
        }
        Hashtables.sethash(var75, module0146.$g2067$.getGlobalValue(), (SubLObject)ConsesLow.cons(var37, Hashtables.gethash(var75, module0146.$g2067$.getGlobalValue(), (SubLObject)module0287.UNPROVIDED)));
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19236() {
        return module0269.f17703(module0287.$ic4$);
    }
    
    public static SubLObject f19237() {
        SubLObject var75 = (SubLObject)module0287.NIL;
        SubLObject var76 = (SubLObject)module0287.NIL;
        final Iterator var77 = Hashtables.getEntrySetIterator(module0146.$g2067$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(var77)) {
                final Map.Entry var78 = Hashtables.iteratorNextEntry(var77);
                var75 = Hashtables.getEntryKey(var78);
                SubLObject var79;
                var76 = (var79 = Hashtables.getEntryValue(var78));
                SubLObject var80 = (SubLObject)module0287.NIL;
                var80 = var79.first();
                while (module0287.NIL != var79) {
                    final SubLObject var81 = conses_high.second(var80);
                    if (module0287.NIL != f19187(var81)) {
                        return (SubLObject)module0287.T;
                    }
                    var79 = var79.rest();
                    var80 = var79.first();
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var77);
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19238(SubLObject var139, SubLObject var111) {
        if (var139 == module0287.UNPROVIDED) {
            var139 = (SubLObject)module0287.NIL;
        }
        if (var111 == module0287.UNPROVIDED) {
            var111 = (SubLObject)module0287.T;
        }
        final SubLThread var140 = SubLProcess.currentSubLThread();
        Hashtables.clrhash(module0146.$g2067$.getGlobalValue());
        module0146.$g2073$.setDynamicValue((SubLObject)module0287.NIL, var140);
        module0146.$g2074$.setDynamicValue((SubLObject)module0287.NIL, var140);
        final SubLObject var141 = f19236();
        if (module0287.NIL != var111) {
            PrintLow.format((SubLObject)module0287.T, (SubLObject)module0287.$ic65$, Sequences.length(var141));
        }
        final SubLObject var142 = var141;
        module0012.$g82$.setDynamicValue((SubLObject)module0287.$ic66$, var140);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var140);
        module0012.$g83$.setDynamicValue(Sequences.length(var142), var140);
        module0012.$g84$.setDynamicValue((SubLObject)module0287.ZERO_INTEGER, var140);
        final SubLObject var143 = module0012.$g75$.currentBinding(var140);
        final SubLObject var144 = module0012.$g76$.currentBinding(var140);
        final SubLObject var145 = module0012.$g77$.currentBinding(var140);
        final SubLObject var146 = module0012.$g78$.currentBinding(var140);
        try {
            module0012.$g75$.bind((SubLObject)module0287.ZERO_INTEGER, var140);
            module0012.$g76$.bind((SubLObject)module0287.NIL, var140);
            module0012.$g77$.bind((SubLObject)module0287.T, var140);
            module0012.$g78$.bind(Time.get_universal_time(), var140);
            module0012.f478(module0012.$g82$.getDynamicValue(var140));
            SubLObject var147 = var142;
            SubLObject var148 = (SubLObject)module0287.NIL;
            var148 = var147.first();
            while (module0287.NIL != var147) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var140), module0012.$g83$.getDynamicValue(var140));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var140), (SubLObject)module0287.ONE_INTEGER), var140);
                if (module0287.NIL == module0533.f33218(var148)) {
                    SubLObject var149 = (SubLObject)module0287.NIL;
                    try {
                        var140.throwStack.push(module0003.$g3$.getGlobalValue());
                        final SubLObject var39_143 = Errors.$error_handler$.currentBinding(var140);
                        try {
                            Errors.$error_handler$.bind((SubLObject)module0287.$ic67$, var140);
                            try {
                                f19239(var148, var139);
                            }
                            catch (Throwable var150) {
                                Errors.handleThrowable(var150, (SubLObject)module0287.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(var39_143, var140);
                        }
                    }
                    catch (Throwable var151) {
                        var149 = Errors.handleThrowable(var151, module0003.$g3$.getGlobalValue());
                    }
                    finally {
                        var140.throwStack.pop();
                    }
                    if (var149.isString()) {
                        Errors.warn((SubLObject)module0287.$ic68$, var149);
                    }
                }
                var147 = var147.rest();
                var148 = var147.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var146, var140);
            module0012.$g77$.rebind(var145, var140);
            module0012.$g76$.rebind(var144, var140);
            module0012.$g75$.rebind(var143, var140);
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19239(final SubLObject var58, SubLObject var139) {
        if (var139 == module0287.UNPROVIDED) {
            var139 = (SubLObject)module0287.NIL;
        }
        return f19240(var58, f19195(var58, (SubLObject)module0287.UNPROVIDED), var139);
    }
    
    public static SubLObject f19241(final SubLObject var58, SubLObject var90) {
        if (var90 == module0287.UNPROVIDED) {
            var90 = f19195(var58, (SubLObject)module0287.UNPROVIDED);
        }
        return f19240(var58, var90, (SubLObject)module0287.NIL);
    }
    
    public static SubLObject f19240(final SubLObject var58, SubLObject var90, SubLObject var139) {
        if (var90 == module0287.UNPROVIDED) {
            var90 = f19195(var58, (SubLObject)module0287.UNPROVIDED);
        }
        if (var139 == module0287.UNPROVIDED) {
            var139 = (SubLObject)module0287.NIL;
        }
        final SubLThread var140 = SubLProcess.currentSubLThread();
        SubLObject var141 = (SubLObject)module0287.NIL;
        SubLObject var142 = (SubLObject)module0287.NIL;
        if (module0287.NIL == module0259.f16854(var58, module0287.$ic4$, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED)) {
            Errors.warn((SubLObject)module0287.$ic69$, var58);
        }
        if (module0287.NIL == var90) {
            Errors.warn((SubLObject)module0287.$ic70$, var58);
        }
        if (module0287.NIL != var90) {
            final SubLObject var143 = module0287.$g2640$.currentBinding(var140);
            try {
                module0287.$g2640$.bind((SubLObject)ConsesLow.list(var58, f19242(var58, var90), var139, (SubLObject)module0287.NIL, (SubLObject)module0287.NIL, (SubLObject)module0287.NIL), var140);
                final SubLObject var144 = var90.first();
                var140.resetMultipleValues();
                final SubLObject var145 = module0289.f19396(var144);
                final SubLObject var146 = var140.secondMultipleValue();
                var140.resetMultipleValues();
                module0285.f18874(var145, var146);
                var141 = f19227();
                var142 = f19228();
            }
            finally {
                module0287.$g2640$.rebind(var143, var140);
            }
        }
        return Values.values(var141, var142);
    }
    
    public static SubLObject f19242(final SubLObject var58, final SubLObject var90) {
        SubLObject var91 = var90;
        SubLObject var92 = (SubLObject)module0287.NIL;
        var92 = var91.first();
        while (module0287.NIL != var91) {
            if (module0287.NIL != module0178.f11284(var92)) {
                return (SubLObject)module0287.$ic63$;
            }
            SubLObject var7_149 = module0232.f15306(module0538.f33482(var92));
            SubLObject var93 = (SubLObject)module0287.NIL;
            var93 = var7_149.first();
            while (module0287.NIL != var7_149) {
                if (module0287.NIL != module0202.f12871(var93) && var58.eql(module0205.f13276(module0202.f12835(var93, (SubLObject)module0287.UNPROVIDED)))) {
                    return module0202.f12834(var93, (SubLObject)module0287.UNPROVIDED);
                }
                var7_149 = var7_149.rest();
                var93 = var7_149.first();
            }
            var91 = var91.rest();
            var92 = var91.first();
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19196(final SubLObject var70, SubLObject var3) {
        if (var3 == module0287.UNPROVIDED) {
            var3 = (SubLObject)module0287.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0287.NIL != module0202.f12589(var70, module0287.$ic71$) || module0287.NIL != module0202.f12589(var70, module0287.$ic72$) || module0287.NIL != module0210.f13616(var70, var3) || (module0287.NIL != module0202.f12659(var70) && module0287.NIL != module0256.f16604(module0287.$ic73$, module0226.f14990(module0205.f13276(var70), var3), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED)));
    }
    
    public static SubLObject f19243(final SubLObject var16, final SubLObject var56, SubLObject var3, SubLObject var150) {
        if (var3 == module0287.UNPROVIDED) {
            var3 = module0147.$g2095$.getDynamicValue();
        }
        if (var150 == module0287.UNPROVIDED) {
            var150 = (SubLObject)module0287.NIL;
        }
        return f19244((SubLObject)module0287.$ic74$, var16, var56, var3, var150);
    }
    
    public static SubLObject f19244(final SubLObject var58, final SubLObject var16, final SubLObject var56, SubLObject var3, SubLObject var150) {
        if (var3 == module0287.UNPROVIDED) {
            var3 = module0147.$g2095$.getDynamicValue();
        }
        if (var150 == module0287.UNPROVIDED) {
            var150 = (SubLObject)module0287.NIL;
        }
        final SubLThread var151 = SubLProcess.currentSubLThread();
        var151.resetMultipleValues();
        SubLObject var152 = f19245(var16, var56, var3);
        final SubLObject var153 = var151.secondMultipleValue();
        SubLObject var154 = var151.thirdMultipleValue();
        final SubLObject var155 = var151.fourthMultipleValue();
        var151.resetMultipleValues();
        var152 = module0256.f16529(var152, var3, (SubLObject)module0287.UNPROVIDED);
        if (module0287.NIL != var152) {
            if (module0287.NIL != module0257.f16688(var152, var3)) {
                if (module0287.NIL != var150) {
                    PrintLow.format((SubLObject)module0287.T, (SubLObject)module0287.$ic75$, var58, var152);
                }
            }
            else if (module0287.NIL != var150) {
                PrintLow.format((SubLObject)module0287.T, (SubLObject)module0287.$ic76$, var58, var152);
            }
        }
        else {
            final SubLObject var156 = f19246(var16, var56, var3);
            if (module0287.NIL != var156 && module0287.NIL == module0257.f16688(var156, var3)) {
                var152 = var156;
                if (module0287.NIL != var150) {
                    PrintLow.format((SubLObject)module0287.T, (SubLObject)module0287.$ic77$, var58, var152);
                }
            }
        }
        if (module0287.NIL == var152 && module0287.NIL != var150) {
            PrintLow.format((SubLObject)module0287.T, (SubLObject)module0287.$ic78$, var58);
        }
        var154 = module0256.f16529(var154, var3, (SubLObject)module0287.UNPROVIDED);
        if (module0287.NIL != var154) {
            if (module0287.NIL != module0257.f16688(var154, var3)) {
                if (module0287.NIL != var150) {
                    PrintLow.format((SubLObject)module0287.T, (SubLObject)module0287.$ic75$, var58, var154);
                }
            }
            else if (module0287.NIL != var150) {
                PrintLow.format((SubLObject)module0287.T, (SubLObject)module0287.$ic76$, var58, var154);
            }
        }
        else {
            final SubLObject var156 = f19247(var16, var56, var3);
            if (module0287.NIL != var156 && module0287.NIL == module0257.f16688(var156, var3)) {
                var154 = var156;
                if (module0287.NIL != var150) {
                    PrintLow.format((SubLObject)module0287.T, (SubLObject)module0287.$ic79$, var58, var154);
                }
            }
        }
        if (module0287.NIL == var154 && module0287.NIL != var150) {
            PrintLow.format((SubLObject)module0287.T, (SubLObject)module0287.$ic78$, var58);
        }
        return Values.values(var152, var153, var154, var155);
    }
    
    public static SubLObject f19245(final SubLObject var18, final SubLObject var56, SubLObject var3) {
        if (var3 == module0287.UNPROVIDED) {
            var3 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        SubLObject var58 = (SubLObject)module0287.NIL;
        SubLObject var59 = (SubLObject)module0287.NIL;
        SubLObject var60 = (SubLObject)module0287.NIL;
        SubLObject var61 = (SubLObject)module0287.NIL;
        SubLObject var62 = var56;
        SubLObject var63 = (SubLObject)module0287.NIL;
        var63 = var62.first();
        while (module0287.NIL != var62) {
            SubLObject var7_160;
            final SubLObject var64 = var7_160 = module0232.f15308(var63);
            SubLObject var65 = (SubLObject)module0287.NIL;
            var65 = var7_160.first();
            while (module0287.NIL != var7_160) {
                final SubLObject var66 = module0202.f12834(var65, (SubLObject)module0287.UNPROVIDED);
                final SubLObject var67 = module0202.f12835(var65, (SubLObject)module0287.UNPROVIDED);
                if (module0287.NIL != module0202.f12859(var65) && var66.equal(var18)) {
                    if (module0287.NIL != module0269.f17705(var67)) {
                        final SubLObject var68 = var67;
                        if (module0287.NIL == conses_high.member(var68, var58, Symbols.symbol_function((SubLObject)module0287.EQL), Symbols.symbol_function((SubLObject)module0287.IDENTITY))) {
                            var58 = (SubLObject)ConsesLow.cons(var68, var58);
                        }
                    }
                    else if (module0287.NIL != module0201.f12580(var67)) {
                        final SubLObject var68 = module0279.f18442(var67);
                        if (module0287.NIL == conses_high.member(var68, var59, Symbols.symbol_function((SubLObject)module0287.EQL), Symbols.symbol_function((SubLObject)module0287.IDENTITY))) {
                            var59 = (SubLObject)ConsesLow.cons(var68, var59);
                        }
                    }
                }
                else if (module0287.NIL != module0202.f12865(var65) && var66.equal(var18)) {
                    if (module0287.NIL != module0269.f17705(var67)) {
                        final SubLObject var68 = var67;
                        if (module0287.NIL == conses_high.member(var68, var60, Symbols.symbol_function((SubLObject)module0287.EQL), Symbols.symbol_function((SubLObject)module0287.IDENTITY))) {
                            var60 = (SubLObject)ConsesLow.cons(var68, var60);
                        }
                    }
                    else if (module0287.NIL != module0201.f12580(var67)) {
                        final SubLObject var68 = module0279.f18442(var67);
                        if (module0287.NIL == conses_high.member(var68, var61, Symbols.symbol_function((SubLObject)module0287.EQL), Symbols.symbol_function((SubLObject)module0287.IDENTITY))) {
                            var61 = (SubLObject)ConsesLow.cons(var68, var61);
                        }
                    }
                }
                var7_160 = var7_160.rest();
                var65 = var7_160.first();
            }
            var62 = var62.rest();
            var63 = var62.first();
        }
        if (module0287.NIL == module0035.f1997(var58)) {
            final SubLObject var69 = module0146.$g2069$.currentBinding(var57);
            try {
                module0146.$g2069$.bind((SubLObject)module0287.T, var57);
                var58 = f19248(var58, var3);
            }
            finally {
                module0146.$g2069$.rebind(var69, var57);
            }
        }
        if (module0287.NIL == module0035.f1997(var60)) {
            final SubLObject var69 = module0146.$g2069$.currentBinding(var57);
            try {
                module0146.$g2069$.bind((SubLObject)module0287.T, var57);
                var60 = f19248(var60, var3);
            }
            finally {
                module0146.$g2069$.rebind(var69, var57);
            }
        }
        return Values.values(var58, var59, var60, var61);
    }
    
    public static SubLObject f19246(final SubLObject var19, final SubLObject var56, SubLObject var3) {
        if (var3 == module0287.UNPROVIDED) {
            var3 = (SubLObject)module0287.NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        if (module0287.NIL != module0146.$g2068$.getDynamicValue(var57)) {
            return module0256.f16529(Sequences.remove(module0287.$ic80$, module0307.f20790(var19, var56, var3, (SubLObject)module0287.UNPROVIDED), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED), var3, (SubLObject)module0287.UNPROVIDED);
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19247(final SubLObject var19, final SubLObject var56, SubLObject var3) {
        if (var3 == module0287.UNPROVIDED) {
            var3 = (SubLObject)module0287.NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        if (module0287.NIL != module0146.$g2068$.getDynamicValue(var57)) {
            return module0256.f16529(module0307.f20791(var19, var56, var3, (SubLObject)module0287.UNPROVIDED), var3, (SubLObject)module0287.UNPROVIDED);
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19166(final SubLObject var8, final SubLObject var56, SubLObject var3) {
        if (var3 == module0287.UNPROVIDED) {
            var3 = module0147.$g2095$.getDynamicValue();
        }
        final SubLObject var57 = conses_high.second(var8);
        final SubLObject var58 = f19158(var8);
        final SubLObject var59 = (SubLObject)((module0287.NIL != var58) ? Numbers.add((SubLObject)module0287.ONE_INTEGER, Sequences.length(var57)) : module0287.NIL);
        SubLObject var60 = (SubLObject)module0287.NIL;
        SubLObject var61 = var57;
        SubLObject var62 = (SubLObject)module0287.NIL;
        var62 = var61.first();
        while (module0287.NIL != var61) {
            var60 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var62, f19248(module0307.f20792(var62, var56, var3), var3)), var60);
            var61 = var61.rest();
            var62 = var61.first();
        }
        if (module0287.NIL != module0004.f104(var59, module0146.$g1959$.getGlobalValue(), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED)) {
            var60 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var58, (SubLObject)module0287.$ic81$), var60);
        }
        return Sequences.nreverse(var60);
    }
    
    public static SubLObject f19249(SubLObject var139, SubLObject var150) {
        if (var139 == module0287.UNPROVIDED) {
            var139 = (SubLObject)module0287.NIL;
        }
        if (var150 == module0287.UNPROVIDED) {
            var150 = (SubLObject)module0287.T;
        }
        final SubLThread var151 = SubLProcess.currentSubLThread();
        final SubLObject var152 = Hashtables.hash_table_count(module0146.$g2067$.getGlobalValue());
        SubLObject var153 = (SubLObject)module0287.ZERO_INTEGER;
        final SubLObject var154 = module0012.$g75$.currentBinding(var151);
        final SubLObject var155 = module0012.$g76$.currentBinding(var151);
        final SubLObject var156 = module0012.$g77$.currentBinding(var151);
        final SubLObject var157 = module0012.$g78$.currentBinding(var151);
        try {
            module0012.$g75$.bind((SubLObject)module0287.ZERO_INTEGER, var151);
            module0012.$g76$.bind((SubLObject)module0287.NIL, var151);
            module0012.$g77$.bind((SubLObject)module0287.T, var151);
            module0012.$g78$.bind(Time.get_universal_time(), var151);
            module0012.f478((SubLObject)module0287.$ic82$);
            SubLObject var158 = (SubLObject)module0287.NIL;
            SubLObject var159 = (SubLObject)module0287.NIL;
            final Iterator var160 = Hashtables.getEntrySetIterator(module0146.$g2067$.getGlobalValue());
            try {
                while (Hashtables.iteratorHasNext(var160)) {
                    final Map.Entry var161 = Hashtables.iteratorNextEntry(var160);
                    var158 = Hashtables.getEntryKey(var161);
                    var159 = Hashtables.getEntryValue(var161);
                    var153 = Numbers.add(var153, (SubLObject)module0287.ONE_INTEGER);
                    module0012.note_percent_progress(var153, var152);
                    SubLObject var162 = var159;
                    SubLObject var163 = (SubLObject)module0287.NIL;
                    var163 = var162.first();
                    while (module0287.NIL != var162) {
                        SubLObject var165;
                        final SubLObject var164 = var165 = var163;
                        SubLObject var166 = (SubLObject)module0287.NIL;
                        SubLObject var167 = (SubLObject)module0287.NIL;
                        SubLObject var168 = (SubLObject)module0287.NIL;
                        SubLObject var169 = (SubLObject)module0287.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var165, var164, (SubLObject)module0287.$ic83$);
                        var166 = var165.first();
                        var165 = var165.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var165, var164, (SubLObject)module0287.$ic83$);
                        var167 = var165.first();
                        var165 = var165.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var165, var164, (SubLObject)module0287.$ic83$);
                        var168 = var165.first();
                        var165 = var165.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var165, var164, (SubLObject)module0287.$ic83$);
                        var169 = var165.first();
                        var165 = var165.rest();
                        if (module0287.NIL == var165) {
                            final SubLObject var170 = conses_high.second(var167);
                            final SubLObject var56_170 = f19203(var166);
                            SubLObject var171;
                            SubLObject var167_172;
                            SubLObject var172;
                            SubLObject var173;
                            SubLObject var174;
                            SubLObject var7_175;
                            SubLObject var175;
                            SubLObject var39_176;
                            SubLObject var176;
                            SubLObject var7_176;
                            SubLObject var177;
                            for (var171 = Sequences.length(var170), var167_172 = (SubLObject)module0287.NIL, var167_172 = (SubLObject)module0287.ZERO_INTEGER; var167_172.numL(var171); var167_172 = Numbers.add(var167_172, (SubLObject)module0287.ONE_INTEGER)) {
                                var172 = (SubLObject)module0287.NIL;
                                var173 = (SubLObject)module0287.NIL;
                                var174 = Numbers.add((SubLObject)module0287.ONE_INTEGER, var167_172);
                                if (module0287.NIL == module0226.f14882(var166, var174, var168)) {
                                    var7_175 = var56_170;
                                    var175 = (SubLObject)module0287.NIL;
                                    var175 = var7_175.first();
                                    while (module0287.NIL != var7_175) {
                                        var172 = conses_high.nunion(var172, f19250(var166, var174, var175, var168), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
                                        var7_175 = var7_175.rest();
                                        var175 = var7_175.first();
                                    }
                                    var173 = f19248(var172, var168);
                                    if (module0287.NIL != var173) {
                                        if (module0287.NIL != var150) {
                                            PrintLow.format((SubLObject)module0287.T, (SubLObject)module0287.$ic84$, new SubLObject[] { var174, var166, var173 });
                                        }
                                        if (module0287.NIL != var139 && module0287.NIL == module0226.f14882(var166, var174, var168)) {
                                            var39_176 = module0111.$g1406$.currentBinding(var151);
                                            try {
                                                module0111.$g1406$.bind((SubLObject)module0287.NIL, var151);
                                                if (module0287.NIL != module0202.f12908(var174)) {
                                                    var176 = module0226.f14903(var174, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
                                                    if (module0287.NIL != module0173.f10955(var176)) {
                                                        var7_176 = var173;
                                                        var177 = (SubLObject)module0287.NIL;
                                                        var177 = var7_176.first();
                                                        while (module0287.NIL != var7_176) {
                                                            module0543.f33628((SubLObject)ConsesLow.list(var176, var166, var177), var168, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
                                                            var7_176 = var7_176.rest();
                                                            var177 = var7_176.first();
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                module0111.$g1406$.rebind(var39_176, var151);
                                            }
                                        }
                                    }
                                    else if (module0287.NIL != var150) {
                                        PrintLow.format((SubLObject)module0287.T, (SubLObject)module0287.$ic85$, new SubLObject[] { var174, var166, var173 });
                                    }
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var164, (SubLObject)module0287.$ic83$);
                        }
                        var162 = var162.rest();
                        var163 = var162.first();
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var160);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var157, var151);
            module0012.$g77$.rebind(var156, var151);
            module0012.$g76$.rebind(var155, var151);
            module0012.$g75$.rebind(var154, var151);
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19250(final SubLObject var180, final SubLObject var174, final SubLObject var93, SubLObject var3) {
        if (var3 == module0287.UNPROVIDED) {
            var3 = module0147.$g2095$.getDynamicValue();
        }
        final SubLObject var181 = f19251(var180, var174, var93);
        if (module0287.NIL != var181) {
            return module0307.f20797(var181, var93, var3);
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19251(final SubLObject var180, final SubLObject var174, final SubLObject var93) {
        SubLObject var181 = module0202.f12845(module0232.f15306(var93));
        SubLObject var182 = (SubLObject)module0287.NIL;
        var182 = var181.first();
        while (module0287.NIL != var181) {
            if (var180.eql(module0205.f13276(conses_high.third(var182)))) {
                return ConsesLow.nth(var174, conses_high.third(var182));
            }
            var181 = var181.rest();
            var182 = var181.first();
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19248(SubLObject var173, SubLObject var3) {
        if (var3 == module0287.UNPROVIDED) {
            var3 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var174 = SubLProcess.currentSubLThread();
        if (module0287.NIL != var173) {
            var173 = module0256.f16529(Sequences.remove_duplicates(var173, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED), var3, (SubLObject)module0287.UNPROVIDED);
            if (module0287.NIL != conses_high.second(var173)) {
                var173 = Sequences.remove(module0287.$ic80$, var173, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
            }
            if (module0287.NIL == module0257.f16688(var173, var3)) {
                if (module0287.NIL == module0146.$g2069$.getDynamicValue(var174)) {
                    return var173;
                }
                if (module0287.NIL != module0035.f1997(var173)) {
                    return var173;
                }
                final SubLObject var175 = module0256.f16639(var173, (SubLObject)module0287.NIL, var3, (SubLObject)module0287.UNPROVIDED);
                if (module0287.NIL != module0035.f1997(var175)) {
                    return var175;
                }
                final SubLObject var176 = module0256.f16637(var173, (SubLObject)module0287.NIL, var3, (SubLObject)module0287.UNPROVIDED);
                if (module0287.NIL != module0035.f1997(var176)) {
                    return var176;
                }
                if (module0287.NIL != var175) {
                    return (SubLObject)ConsesLow.list(var175.first());
                }
                if (module0287.NIL != var176) {
                    return (SubLObject)ConsesLow.list(var176.first());
                }
                return (SubLObject)module0287.NIL;
            }
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19252() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = Hashtables.hash_table_count(module0146.$g2067$.getGlobalValue());
        SubLObject var7 = (SubLObject)module0287.ZERO_INTEGER;
        SubLObject var8 = (SubLObject)module0287.ZERO_INTEGER;
        final SubLObject var9 = module0012.$g75$.currentBinding(var5);
        final SubLObject var10 = module0012.$g76$.currentBinding(var5);
        final SubLObject var11 = module0012.$g77$.currentBinding(var5);
        final SubLObject var12 = module0012.$g78$.currentBinding(var5);
        try {
            module0012.$g75$.bind((SubLObject)module0287.ZERO_INTEGER, var5);
            module0012.$g76$.bind((SubLObject)module0287.NIL, var5);
            module0012.$g77$.bind((SubLObject)module0287.T, var5);
            module0012.$g78$.bind(Time.get_universal_time(), var5);
            module0012.f478((SubLObject)module0287.$ic86$);
            SubLObject var13 = (SubLObject)module0287.NIL;
            SubLObject var14 = (SubLObject)module0287.NIL;
            final Iterator var15 = Hashtables.getEntrySetIterator(module0146.$g2067$.getGlobalValue());
            try {
                while (Hashtables.iteratorHasNext(var15)) {
                    final Map.Entry var16 = Hashtables.iteratorNextEntry(var15);
                    var13 = Hashtables.getEntryKey(var16);
                    var14 = Hashtables.getEntryValue(var16);
                    var7 = Numbers.add(var7, (SubLObject)module0287.ONE_INTEGER);
                    module0012.note_percent_progress(var7, var6);
                    SubLObject var17 = var14;
                    SubLObject var18 = (SubLObject)module0287.NIL;
                    var18 = var17.first();
                    while (module0287.NIL != var17) {
                        SubLObject var20;
                        final SubLObject var19 = var20 = var18;
                        SubLObject var21 = (SubLObject)module0287.NIL;
                        SubLObject var22 = (SubLObject)module0287.NIL;
                        SubLObject var23 = (SubLObject)module0287.NIL;
                        SubLObject var24 = (SubLObject)module0287.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0287.$ic87$);
                        var21 = var20.first();
                        var20 = var20.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0287.$ic87$);
                        var22 = var20.first();
                        var20 = var20.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0287.$ic87$);
                        var23 = var20.first();
                        var20 = var20.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0287.$ic87$);
                        var24 = var20.first();
                        var20 = var20.rest();
                        if (module0287.NIL == var20) {
                            if (var8.numL(Sequences.length(conses_high.second(var22)))) {
                                var8 = Sequences.length(conses_high.second(var22));
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var19, (SubLObject)module0287.$ic87$);
                        }
                        var17 = var17.rest();
                        var18 = var17.first();
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var15);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var12, var5);
            module0012.$g77$.rebind(var11, var5);
            module0012.$g76$.rebind(var10, var5);
            module0012.$g75$.rebind(var9, var5);
        }
        return var8;
    }
    
    public static SubLObject f19253(SubLObject var103) {
        if (var103 == module0287.UNPROVIDED) {
            var103 = f19252();
        }
        final SubLThread var104 = SubLProcess.currentSubLThread();
        final SubLObject var105 = Hashtables.hash_table_count(module0146.$g2067$.getGlobalValue());
        SubLObject var106 = (SubLObject)module0287.ZERO_INTEGER;
        SubLObject var107 = (SubLObject)module0287.NIL;
        final SubLObject var108 = module0012.$g75$.currentBinding(var104);
        final SubLObject var109 = module0012.$g76$.currentBinding(var104);
        final SubLObject var110 = module0012.$g77$.currentBinding(var104);
        final SubLObject var111 = module0012.$g78$.currentBinding(var104);
        try {
            module0012.$g75$.bind((SubLObject)module0287.ZERO_INTEGER, var104);
            module0012.$g76$.bind((SubLObject)module0287.NIL, var104);
            module0012.$g77$.bind((SubLObject)module0287.T, var104);
            module0012.$g78$.bind(Time.get_universal_time(), var104);
            module0012.f478((SubLObject)module0287.$ic86$);
            SubLObject var112 = (SubLObject)module0287.NIL;
            SubLObject var113 = (SubLObject)module0287.NIL;
            final Iterator var114 = Hashtables.getEntrySetIterator(module0146.$g2067$.getGlobalValue());
            try {
                while (Hashtables.iteratorHasNext(var114)) {
                    final Map.Entry var115 = Hashtables.iteratorNextEntry(var114);
                    var112 = Hashtables.getEntryKey(var115);
                    var113 = Hashtables.getEntryValue(var115);
                    var106 = Numbers.add(var106, (SubLObject)module0287.ONE_INTEGER);
                    module0012.note_percent_progress(var106, var105);
                    SubLObject var116 = var113;
                    SubLObject var117 = (SubLObject)module0287.NIL;
                    var117 = var116.first();
                    while (module0287.NIL != var116) {
                        SubLObject var119;
                        final SubLObject var118 = var119 = var117;
                        SubLObject var120 = (SubLObject)module0287.NIL;
                        SubLObject var121 = (SubLObject)module0287.NIL;
                        SubLObject var122 = (SubLObject)module0287.NIL;
                        SubLObject var123 = (SubLObject)module0287.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var119, var118, (SubLObject)module0287.$ic87$);
                        var120 = var119.first();
                        var119 = var119.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var119, var118, (SubLObject)module0287.$ic87$);
                        var121 = var119.first();
                        var119 = var119.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var119, var118, (SubLObject)module0287.$ic87$);
                        var122 = var119.first();
                        var119 = var119.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var119, var118, (SubLObject)module0287.$ic87$);
                        var123 = var119.first();
                        var119 = var119.rest();
                        if (module0287.NIL == var119) {
                            if (var103.numE(Sequences.length(conses_high.second(var121)))) {
                                var107 = (SubLObject)ConsesLow.cons(var120, var107);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var118, (SubLObject)module0287.$ic87$);
                        }
                        var116 = var116.rest();
                        var117 = var116.first();
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var114);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var111, var104);
            module0012.$g77$.rebind(var110, var104);
            module0012.$g76$.rebind(var109, var104);
            module0012.$g75$.rebind(var108, var104);
        }
        return var107;
    }
    
    public static SubLObject f19254(final SubLObject var189) {
        if (module0287.NIL != f19255(var189)) {
            return (SubLObject)module0287.T;
        }
        SubLObject var190 = module0211.f13678(var189);
        SubLObject var191 = (SubLObject)module0287.NIL;
        var191 = var190.first();
        while (module0287.NIL != var190) {
            if (module0287.NIL != f19256(var191, var189)) {
                return (SubLObject)module0287.T;
            }
            var190 = var190.rest();
            var191 = var190.first();
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19255(final SubLObject var189) {
        final SubLObject var190 = f19207(var189);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0287.NIL == var190 || module0287.NIL == module0178.f11376(var190));
    }
    
    public static SubLObject f19256(final SubLObject var190, final SubLObject var189) {
        final SubLObject var191 = module0289.f19396(var190);
        if (module0287.NIL == module0205.f13145((SubLObject)module0287.$ic88$, var191, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED)) {
            return (SubLObject)module0287.T;
        }
        if (module0287.NIL != module0205.f13220(var189, var191, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED)) {
            return (SubLObject)module0287.T;
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19257() {
        SubLObject var17 = (SubLObject)module0287.NIL;
        SubLObject var18 = f19236();
        SubLObject var19 = (SubLObject)module0287.NIL;
        var19 = var18.first();
        while (module0287.NIL != var18) {
            if (module0287.NIL != f19254(var19)) {
                var17 = (SubLObject)ConsesLow.cons(var19, var17);
            }
            var18 = var18.rest();
            var19 = var18.first();
        }
        return Sequences.nreverse(var17);
    }
    
    public static SubLObject f19258() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = Hashtables.hash_table_count(module0146.$g2067$.getGlobalValue());
        SubLObject var7 = (SubLObject)module0287.ZERO_INTEGER;
        SubLObject var8 = (SubLObject)module0287.NIL;
        final SubLObject var9 = module0012.$g75$.currentBinding(var5);
        final SubLObject var10 = module0012.$g76$.currentBinding(var5);
        final SubLObject var11 = module0012.$g77$.currentBinding(var5);
        final SubLObject var12 = module0012.$g78$.currentBinding(var5);
        try {
            module0012.$g75$.bind((SubLObject)module0287.ZERO_INTEGER, var5);
            module0012.$g76$.bind((SubLObject)module0287.NIL, var5);
            module0012.$g77$.bind((SubLObject)module0287.T, var5);
            module0012.$g78$.bind(Time.get_universal_time(), var5);
            module0012.f478((SubLObject)module0287.$ic86$);
            SubLObject var13 = (SubLObject)module0287.NIL;
            SubLObject var14 = (SubLObject)module0287.NIL;
            final Iterator var15 = Hashtables.getEntrySetIterator(module0146.$g2067$.getGlobalValue());
            try {
                while (Hashtables.iteratorHasNext(var15)) {
                    final Map.Entry var16 = Hashtables.iteratorNextEntry(var15);
                    var13 = Hashtables.getEntryKey(var16);
                    var14 = Hashtables.getEntryValue(var16);
                    var7 = Numbers.add(var7, (SubLObject)module0287.ONE_INTEGER);
                    module0012.note_percent_progress(var7, var6);
                    SubLObject var17 = var14;
                    SubLObject var18 = (SubLObject)module0287.NIL;
                    var18 = var17.first();
                    while (module0287.NIL != var17) {
                        SubLObject var20;
                        final SubLObject var19 = var20 = var18;
                        SubLObject var21 = (SubLObject)module0287.NIL;
                        SubLObject var22 = (SubLObject)module0287.NIL;
                        SubLObject var23 = (SubLObject)module0287.NIL;
                        SubLObject var24 = (SubLObject)module0287.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0287.$ic87$);
                        var21 = var20.first();
                        var20 = var20.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0287.$ic87$);
                        var22 = var20.first();
                        var20 = var20.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0287.$ic87$);
                        var23 = var20.first();
                        var20 = var20.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0287.$ic87$);
                        var24 = var20.first();
                        var20 = var20.rest();
                        if (module0287.NIL == var20) {
                            SubLObject var25 = (SubLObject)module0287.NIL;
                            if (module0287.NIL == var25) {
                                SubLObject var26 = Sequences.remove(var21, Sequences.remove_duplicates(module0035.f2119(var24), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
                                SubLObject var27 = (SubLObject)module0287.NIL;
                                var27 = var26.first();
                                while (module0287.NIL == var25 && module0287.NIL != var26) {
                                    if (module0287.NIL != module0259.f16854(var27, module0287.$ic4$, var23, (SubLObject)module0287.UNPROVIDED)) {
                                        var25 = var27;
                                    }
                                    var26 = var26.rest();
                                    var27 = var26.first();
                                }
                            }
                            if (module0287.NIL != var25) {
                                var8 = (SubLObject)ConsesLow.cons(var21, var8);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var19, (SubLObject)module0287.$ic87$);
                        }
                        var17 = var17.rest();
                        var18 = var17.first();
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var15);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var12, var5);
            module0012.$g77$.rebind(var11, var5);
            module0012.$g76$.rebind(var10, var5);
            module0012.$g75$.rebind(var9, var5);
        }
        return var8;
    }
    
    public static SubLObject f19259(SubLObject var196) {
        if (var196 == module0287.UNPROVIDED) {
            var196 = (SubLObject)module0287.NIL;
        }
        final SubLThread var197 = SubLProcess.currentSubLThread();
        final SubLObject var198 = Hashtables.hash_table_count(module0146.$g2067$.getGlobalValue());
        SubLObject var199 = (SubLObject)module0287.ZERO_INTEGER;
        SubLObject var200 = (SubLObject)module0287.NIL;
        final SubLObject var201 = module0012.$g75$.currentBinding(var197);
        final SubLObject var202 = module0012.$g76$.currentBinding(var197);
        final SubLObject var203 = module0012.$g77$.currentBinding(var197);
        final SubLObject var204 = module0012.$g78$.currentBinding(var197);
        try {
            module0012.$g75$.bind((SubLObject)module0287.ZERO_INTEGER, var197);
            module0012.$g76$.bind((SubLObject)module0287.NIL, var197);
            module0012.$g77$.bind((SubLObject)module0287.T, var197);
            module0012.$g78$.bind(Time.get_universal_time(), var197);
            module0012.f478((SubLObject)module0287.$ic86$);
            SubLObject var205 = (SubLObject)module0287.NIL;
            SubLObject var206 = (SubLObject)module0287.NIL;
            final Iterator var207 = Hashtables.getEntrySetIterator(module0146.$g2067$.getGlobalValue());
            try {
                while (Hashtables.iteratorHasNext(var207)) {
                    final Map.Entry var208 = Hashtables.iteratorNextEntry(var207);
                    var205 = Hashtables.getEntryKey(var208);
                    var206 = Hashtables.getEntryValue(var208);
                    var199 = Numbers.add(var199, (SubLObject)module0287.ONE_INTEGER);
                    module0012.note_percent_progress(var199, var198);
                    SubLObject var209 = var206;
                    SubLObject var210 = (SubLObject)module0287.NIL;
                    var210 = var209.first();
                    while (module0287.NIL != var209) {
                        final SubLObject var211 = var210.first();
                        if (module0287.NIL != module0173.f10955(var211) && !var205.equal(f19199(var211))) {
                            var200 = (SubLObject)ConsesLow.cons(var211, var200);
                            if (module0287.NIL != var196) {
                                f19239(var211, (SubLObject)module0287.T);
                            }
                        }
                        var209 = var209.rest();
                        var210 = var209.first();
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var207);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var204, var197);
            module0012.$g77$.rebind(var203, var197);
            module0012.$g76$.rebind(var202, var197);
            module0012.$g75$.rebind(var201, var197);
        }
        return var200;
    }
    
    public static SubLObject f19260(SubLObject var197) {
        if (var197 == module0287.UNPROVIDED) {
            var197 = (SubLObject)module0287.NIL;
        }
        final SubLThread var198 = SubLProcess.currentSubLThread();
        final SubLObject var199 = Hashtables.hash_table_count(module0146.$g2067$.getGlobalValue());
        SubLObject var200 = (SubLObject)module0287.ZERO_INTEGER;
        SubLObject var201 = (SubLObject)module0287.NIL;
        final SubLObject var202 = module0012.$g75$.currentBinding(var198);
        final SubLObject var203 = module0012.$g76$.currentBinding(var198);
        final SubLObject var204 = module0012.$g77$.currentBinding(var198);
        final SubLObject var205 = module0012.$g78$.currentBinding(var198);
        try {
            module0012.$g75$.bind((SubLObject)module0287.ZERO_INTEGER, var198);
            module0012.$g76$.bind((SubLObject)module0287.NIL, var198);
            module0012.$g77$.bind((SubLObject)module0287.T, var198);
            module0012.$g78$.bind(Time.get_universal_time(), var198);
            module0012.f478((SubLObject)module0287.$ic86$);
            SubLObject var206 = (SubLObject)module0287.NIL;
            SubLObject var207 = (SubLObject)module0287.NIL;
            final Iterator var208 = Hashtables.getEntrySetIterator(module0146.$g2067$.getGlobalValue());
            try {
                while (Hashtables.iteratorHasNext(var208)) {
                    final Map.Entry var209 = Hashtables.iteratorNextEntry(var208);
                    var206 = Hashtables.getEntryKey(var209);
                    var207 = Hashtables.getEntryValue(var209);
                    var200 = Numbers.add(var200, (SubLObject)module0287.ONE_INTEGER);
                    module0012.note_percent_progress(var200, var199);
                    SubLObject var210 = var207;
                    SubLObject var211 = (SubLObject)module0287.NIL;
                    var211 = var210.first();
                    while (module0287.NIL != var210) {
                        final SubLObject var212 = var211.first();
                        if (module0287.NIL == module0173.f10955(var212)) {
                            var201 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var206, var211), var201);
                            if (module0287.NIL != var197) {
                                final SubLObject var213 = Sequences.remove(var211, var207, Symbols.symbol_function((SubLObject)module0287.EQUAL), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
                                if (module0287.NIL != var213) {
                                    Hashtables.sethash(var206, module0146.$g2067$.getGlobalValue(), var213);
                                }
                                else {
                                    Hashtables.remhash(var206, module0146.$g2067$.getGlobalValue());
                                }
                            }
                        }
                        var210 = var210.rest();
                        var211 = var210.first();
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var208);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var205, var198);
            module0012.$g77$.rebind(var204, var198);
            module0012.$g76$.rebind(var203, var198);
            module0012.$g75$.rebind(var202, var198);
        }
        return var201;
    }
    
    public static SubLObject f19261(SubLObject var197) {
        if (var197 == module0287.UNPROVIDED) {
            var197 = (SubLObject)module0287.NIL;
        }
        final SubLThread var198 = SubLProcess.currentSubLThread();
        final SubLObject var199 = Hashtables.hash_table_count(module0146.$g2067$.getGlobalValue());
        SubLObject var200 = (SubLObject)module0287.ZERO_INTEGER;
        SubLObject var201 = (SubLObject)module0287.NIL;
        final SubLObject var202 = module0012.$g75$.currentBinding(var198);
        final SubLObject var203 = module0012.$g76$.currentBinding(var198);
        final SubLObject var204 = module0012.$g77$.currentBinding(var198);
        final SubLObject var205 = module0012.$g78$.currentBinding(var198);
        try {
            module0012.$g75$.bind((SubLObject)module0287.ZERO_INTEGER, var198);
            module0012.$g76$.bind((SubLObject)module0287.NIL, var198);
            module0012.$g77$.bind((SubLObject)module0287.T, var198);
            module0012.$g78$.bind(Time.get_universal_time(), var198);
            module0012.f478((SubLObject)module0287.$ic86$);
            SubLObject var206 = (SubLObject)module0287.NIL;
            SubLObject var207 = (SubLObject)module0287.NIL;
            final Iterator var208 = Hashtables.getEntrySetIterator(module0146.$g2067$.getGlobalValue());
            try {
                while (Hashtables.iteratorHasNext(var208)) {
                    final Map.Entry var209 = Hashtables.iteratorNextEntry(var208);
                    var206 = Hashtables.getEntryKey(var209);
                    var207 = Hashtables.getEntryValue(var209);
                    var200 = Numbers.add(var200, (SubLObject)module0287.ONE_INTEGER);
                    module0012.note_percent_progress(var200, var199);
                    if (module0287.NIL == var207) {
                        var201 = (SubLObject)ConsesLow.cons(var206, var201);
                        if (module0287.NIL == var197) {
                            continue;
                        }
                        Hashtables.remhash(var206, module0146.$g2067$.getGlobalValue());
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var208);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var205, var198);
            module0012.$g77$.rebind(var204, var198);
            module0012.$g76$.rebind(var203, var198);
            module0012.$g75$.rebind(var202, var198);
        }
        return var201;
    }
    
    public static SubLObject f19262(SubLObject var111, SubLObject var197) {
        if (var111 == module0287.UNPROVIDED) {
            var111 = (SubLObject)module0287.NIL;
        }
        if (var197 == module0287.UNPROVIDED) {
            var197 = (SubLObject)module0287.NIL;
        }
        final SubLThread var198 = SubLProcess.currentSubLThread();
        final SubLObject var199 = Hashtables.hash_table_count(module0146.$g2067$.getGlobalValue());
        SubLObject var200 = (SubLObject)module0287.ZERO_INTEGER;
        final SubLObject var201 = (SubLObject)module0287.NIL;
        final SubLObject var202 = module0012.$g75$.currentBinding(var198);
        final SubLObject var203 = module0012.$g76$.currentBinding(var198);
        final SubLObject var204 = module0012.$g77$.currentBinding(var198);
        final SubLObject var205 = module0012.$g78$.currentBinding(var198);
        try {
            module0012.$g75$.bind((SubLObject)module0287.ZERO_INTEGER, var198);
            module0012.$g76$.bind((SubLObject)module0287.NIL, var198);
            module0012.$g77$.bind((SubLObject)module0287.T, var198);
            module0012.$g78$.bind(Time.get_universal_time(), var198);
            module0012.f478((SubLObject)module0287.$ic86$);
            SubLObject var206 = (SubLObject)module0287.NIL;
            SubLObject var207 = (SubLObject)module0287.NIL;
            final Iterator var208 = Hashtables.getEntrySetIterator(module0146.$g2067$.getGlobalValue());
            try {
                while (Hashtables.iteratorHasNext(var208)) {
                    final Map.Entry var209 = Hashtables.iteratorNextEntry(var208);
                    var206 = Hashtables.getEntryKey(var209);
                    var207 = Hashtables.getEntryValue(var209);
                    var200 = Numbers.add(var200, (SubLObject)module0287.ONE_INTEGER);
                    module0012.note_percent_progress(var200, var199);
                    final SubLObject var210 = conses_high.subst(module0287.$ic6$, module0287.$ic5$, conses_high.subst(module0287.$ic3$, module0287.$ic4$, var207, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
                    if (module0287.NIL != var210) {
                        if (module0287.NIL != var111) {
                            print_high.print(var210, (SubLObject)module0287.UNPROVIDED);
                        }
                        if (module0287.NIL == var197) {
                            continue;
                        }
                        Hashtables.sethash(var206, module0146.$g2067$.getGlobalValue(), var210);
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var208);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var205, var198);
            module0012.$g77$.rebind(var204, var198);
            module0012.$g76$.rebind(var203, var198);
            module0012.$g75$.rebind(var202, var198);
        }
        return var201;
    }
    
    public static SubLObject f19263(SubLObject var196) {
        if (var196 == module0287.UNPROVIDED) {
            var196 = (SubLObject)module0287.NIL;
        }
        final SubLThread var197 = SubLProcess.currentSubLThread();
        SubLObject var198 = (SubLObject)module0287.NIL;
        final SubLObject var199 = module0146.$g2067$.getGlobalValue();
        module0012.$g82$.setDynamicValue((SubLObject)module0287.$ic86$, var197);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var197);
        module0012.$g83$.setDynamicValue(Hashtables.hash_table_count(var199), var197);
        module0012.$g84$.setDynamicValue((SubLObject)module0287.ZERO_INTEGER, var197);
        final SubLObject var200 = module0012.$g75$.currentBinding(var197);
        final SubLObject var201 = module0012.$g76$.currentBinding(var197);
        final SubLObject var202 = module0012.$g77$.currentBinding(var197);
        final SubLObject var203 = module0012.$g78$.currentBinding(var197);
        try {
            module0012.$g75$.bind((SubLObject)module0287.ZERO_INTEGER, var197);
            module0012.$g76$.bind((SubLObject)module0287.NIL, var197);
            module0012.$g77$.bind((SubLObject)module0287.T, var197);
            module0012.$g78$.bind(Time.get_universal_time(), var197);
            module0012.f478(module0012.$g82$.getDynamicValue(var197));
            SubLObject var204 = (SubLObject)module0287.NIL;
            SubLObject var205 = (SubLObject)module0287.NIL;
            final Iterator var206 = Hashtables.getEntrySetIterator(var199);
            try {
                while (Hashtables.iteratorHasNext(var206)) {
                    final Map.Entry var207 = Hashtables.iteratorNextEntry(var206);
                    var204 = Hashtables.getEntryKey(var207);
                    var205 = Hashtables.getEntryValue(var207);
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var197), module0012.$g83$.getDynamicValue(var197));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var197), (SubLObject)module0287.ONE_INTEGER), var197);
                    SubLObject var208 = var205;
                    SubLObject var209 = (SubLObject)module0287.NIL;
                    var209 = var208.first();
                    while (module0287.NIL != var208) {
                        final SubLObject var210 = var209.first();
                        final SubLObject var211 = conses_high.third(var209);
                        if (module0287.NIL == var211) {
                            var198 = (SubLObject)ConsesLow.cons(var210, var198);
                        }
                        var208 = var208.rest();
                        var209 = var208.first();
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var206);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var203, var197);
            module0012.$g77$.rebind(var202, var197);
            module0012.$g76$.rebind(var201, var197);
            module0012.$g75$.rebind(var200, var197);
        }
        if (module0287.NIL != var196) {
            final SubLObject var212 = var198;
            module0012.$g82$.setDynamicValue((SubLObject)module0287.$ic89$, var197);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var197);
            module0012.$g83$.setDynamicValue(Sequences.length(var212), var197);
            module0012.$g84$.setDynamicValue((SubLObject)module0287.ZERO_INTEGER, var197);
            final SubLObject var213 = module0012.$g75$.currentBinding(var197);
            final SubLObject var214 = module0012.$g76$.currentBinding(var197);
            final SubLObject var215 = module0012.$g77$.currentBinding(var197);
            final SubLObject var216 = module0012.$g78$.currentBinding(var197);
            try {
                module0012.$g75$.bind((SubLObject)module0287.ZERO_INTEGER, var197);
                module0012.$g76$.bind((SubLObject)module0287.NIL, var197);
                module0012.$g77$.bind((SubLObject)module0287.T, var197);
                module0012.$g78$.bind(Time.get_universal_time(), var197);
                module0012.f478(module0012.$g82$.getDynamicValue(var197));
                SubLObject var217 = var212;
                SubLObject var218 = (SubLObject)module0287.NIL;
                var218 = var217.first();
                while (module0287.NIL != var217) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var197), module0012.$g83$.getDynamicValue(var197));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var197), (SubLObject)module0287.ONE_INTEGER), var197);
                    f19239(var218, (SubLObject)module0287.T);
                    var217 = var217.rest();
                    var218 = var217.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var216, var197);
                module0012.$g77$.rebind(var215, var197);
                module0012.$g76$.rebind(var214, var197);
                module0012.$g75$.rebind(var213, var197);
            }
        }
        return var198;
    }
    
    public static SubLObject f19264(final SubLObject var58) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0287.NIL == f19265(f19181(var58)));
    }
    
    public static SubLObject f19266(final SubLObject var58) {
        return module0035.sublisp_boolean(f19265(f19181(var58)));
    }
    
    public static SubLObject f19267(final SubLObject var58) {
        return f19268(f19181(var58));
    }
    
    public static SubLObject f19269(final SubLObject var80) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0287.NIL == f19268(var80));
    }
    
    public static SubLObject f19265(final SubLObject var80) {
        return module0035.sublisp_boolean(f19268(var80));
    }
    
    public static SubLObject f19268(final SubLObject var80) {
        SubLObject var81 = (SubLObject)module0287.NIL;
        if (module0287.NIL == var80) {
            var81 = (SubLObject)ConsesLow.cons((SubLObject)module0287.$ic90$, var81);
        }
        else if (var80.isAtom()) {
            var81 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0287.$ic91$, var80), var81);
        }
        if (module0287.NIL != var81) {
            return var81;
        }
        if (!module0287.FOUR_INTEGER.numE(Sequences.length(var80))) {
            var81 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0287.$ic92$, var80), var81);
            if (module0287.NIL != var81) {
                Sequences.nreverse(var81);
            }
        }
        SubLObject var82 = (SubLObject)module0287.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var80, (SubLObject)module0287.$ic93$);
        var82 = var80.first();
        SubLObject var83 = var80.rest();
        final SubLObject var84 = (SubLObject)(var83.isCons() ? var83.first() : module0287.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var83, var80, (SubLObject)module0287.$ic93$);
        var83 = var83.rest();
        final SubLObject var85 = (SubLObject)(var83.isCons() ? var83.first() : module0287.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var83, var80, (SubLObject)module0287.$ic93$);
        var83 = var83.rest();
        final SubLObject var86 = (SubLObject)(var83.isCons() ? var83.first() : module0287.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var83, var80, (SubLObject)module0287.$ic93$);
        final SubLObject var87;
        var83 = (var87 = var83.rest());
        if (module0287.NIL != var87) {
            var81 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0287.$ic94$, var87), var81);
            if (module0287.NIL != var81) {
                return Sequences.nreverse(var81);
            }
        }
        if (module0287.NIL == module0210.f13578(var82)) {
            var81 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0287.$ic95$, var82), var81);
            if (module0287.NIL != var81) {
                return Sequences.nreverse(var81);
            }
        }
        if (module0287.NIL != var84) {
            if (!var84.isCons() || (!module0287.THREE_INTEGER.numE(Sequences.length(var84)) && !module0287.FOUR_INTEGER.numE(Sequences.length(var84)) && !module0287.FIVE_INTEGER.numE(Sequences.length(var84)))) {
                var81 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0287.$ic96$, var84), var81);
            }
            else {
                SubLObject var209_210;
                final SubLObject var207_208 = var209_210 = var84;
                SubLObject var88 = (SubLObject)module0287.NIL;
                SubLObject var89 = (SubLObject)module0287.NIL;
                SubLObject var90 = (SubLObject)module0287.NIL;
                SubLObject var91 = (SubLObject)module0287.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var209_210, var207_208, (SubLObject)module0287.$ic97$);
                var88 = var209_210.first();
                var209_210 = var209_210.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var209_210, var207_208, (SubLObject)module0287.$ic97$);
                var89 = var209_210.first();
                var209_210 = var209_210.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var209_210, var207_208, (SubLObject)module0287.$ic97$);
                var90 = var209_210.first();
                var209_210 = var209_210.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var209_210, var207_208, (SubLObject)module0287.$ic97$);
                var91 = var209_210.first();
                var209_210 = var209_210.rest();
                SubLObject var92 = (SubLObject)(var209_210.isCons() ? var209_210.first() : module0287.NIL);
                cdestructuring_bind.destructuring_bind_must_listp(var209_210, var207_208, (SubLObject)module0287.$ic97$);
                var209_210 = var209_210.rest();
                if (module0287.NIL == var209_210) {
                    if (module0287.NIL != f19187(var84)) {
                        var92 = var91;
                    }
                    if (module0287.NIL == module0210.f13591(var88)) {
                        var81 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0287.$ic98$, var88), var81);
                        if (module0287.NIL != var81) {
                            return Sequences.nreverse(var81);
                        }
                    }
                    if (module0287.NIL != var89 && !var89.isList()) {
                        var81 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0287.$ic99$, var89), var81);
                        if (module0287.NIL != var81) {
                            return Sequences.nreverse(var81);
                        }
                    }
                    if (module0287.NIL != var92 && module0287.NIL == module0004.f104(var92, var89, Symbols.symbol_function((SubLObject)module0287.EQUAL), (SubLObject)module0287.UNPROVIDED)) {
                        var81 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0287.$ic100$, var89, var92), var81);
                        if (module0287.NIL != var81) {
                            return Sequences.nreverse(var81);
                        }
                    }
                    if (module0287.NIL == module0202.f12940(Sequences.remove(var92, var89, Symbols.symbol_function((SubLObject)module0287.EQUAL), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED))) {
                        var81 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0287.$ic101$, var89), var81);
                        if (module0287.NIL != var81) {
                            return Sequences.nreverse(var81);
                        }
                    }
                    if (module0287.NIL == var90 || module0287.NIL == module0201.f12546(var90)) {
                        var81 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0287.$ic102$, var90), var81);
                        if (module0287.NIL != var81) {
                            return Sequences.nreverse(var81);
                        }
                    }
                    if ((module0287.NIL != var92 && !var88.eql(module0287.$ic6$)) || (var88.eql(module0287.$ic6$) && module0287.NIL == var92)) {
                        var81 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0287.$ic103$, var88, var92), var81);
                        if (module0287.NIL != var81) {
                            return Sequences.nreverse(var81);
                        }
                    }
                    if (module0287.NIL != var92 && var92.isList() && var92.first().eql(module0287.$ic104$)) {
                        var81 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0287.$ic105$, var92), var81);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var207_208, (SubLObject)module0287.$ic97$);
                }
            }
            if (module0287.NIL != var81) {
                return Sequences.nreverse(var81);
            }
        }
        if (module0287.NIL != var85 && module0287.NIL == module0161.f10499(var85)) {
            var81 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0287.$ic106$, var85), var81);
            if (module0287.NIL != var81) {
                return Sequences.nreverse(var81);
            }
        }
        if (module0287.NIL == var86) {
            var81 = (SubLObject)ConsesLow.cons((SubLObject)module0287.$ic107$, var81);
            if (module0287.NIL != var81) {
                return Sequences.nreverse(var81);
            }
        }
        return Sequences.nreverse(var81);
    }
    
    public static SubLObject f19270(final SubLObject var189) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0287.NIL != f19271(var189) && module0287.NIL == f19254(var189));
    }
    
    public static SubLObject f19271(final SubLObject var189) {
        SubLObject var190 = (SubLObject)module0287.ZERO_INTEGER;
        SubLObject var191 = (SubLObject)module0287.NIL;
        final SubLObject var192 = module0287.$ic43$;
        if (module0287.NIL != module0158.f10010(var189, (SubLObject)module0287.ONE_INTEGER, var192)) {
            final SubLObject var193 = module0158.f10011(var189, (SubLObject)module0287.ONE_INTEGER, var192);
            SubLObject var194 = var191;
            final SubLObject var195 = (SubLObject)module0287.NIL;
            while (module0287.NIL == var194) {
                final SubLObject var196 = module0052.f3695(var193, var195);
                final SubLObject var197 = (SubLObject)SubLObjectFactory.makeBoolean(!var195.eql(var196));
                if (module0287.NIL != var197) {
                    SubLObject var198 = (SubLObject)module0287.NIL;
                    try {
                        var198 = module0158.f10316(var196, (SubLObject)module0287.$ic63$, (SubLObject)module0287.NIL, (SubLObject)module0287.NIL);
                        SubLObject var216_221 = var191;
                        final SubLObject var217_222 = (SubLObject)module0287.NIL;
                        while (module0287.NIL == var216_221) {
                            final SubLObject var199 = module0052.f3695(var198, var217_222);
                            final SubLObject var219_223 = (SubLObject)SubLObjectFactory.makeBoolean(!var217_222.eql(var199));
                            if (module0287.NIL != var219_223) {
                                var190 = Numbers.add(var190, (SubLObject)module0287.ONE_INTEGER);
                                final SubLObject var200 = module0178.f11299(var199);
                                if (module0287.NIL == module0035.f1997(var200)) {
                                    var191 = var199;
                                    final SubLObject var201 = var200.first();
                                    if (module0287.NIL == module0184.f11659(var201)) {
                                        var191 = var199;
                                    }
                                }
                            }
                            var216_221 = (SubLObject)SubLObjectFactory.makeBoolean(module0287.NIL == var219_223 || module0287.NIL != var191);
                        }
                    }
                    finally {
                        final SubLObject var202 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0287.T);
                            if (module0287.NIL != var198) {
                                module0158.f10319(var198);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var202);
                        }
                    }
                }
                var194 = (SubLObject)SubLObjectFactory.makeBoolean(module0287.NIL == var197 || module0287.NIL != var191);
            }
        }
        if (module0287.NIL != var191) {
            return (SubLObject)module0287.NIL;
        }
        if (!module0287.ONE_INTEGER.numE(var190)) {
            return (SubLObject)module0287.NIL;
        }
        return (SubLObject)module0287.T;
    }
    
    public static SubLObject f19272() {
        SubLObject var226 = (SubLObject)module0287.NIL;
        SubLObject var227 = f19236();
        SubLObject var228 = (SubLObject)module0287.NIL;
        var228 = var227.first();
        while (module0287.NIL != var227) {
            if (module0287.NIL == module0533.f33218(var228) && module0287.NIL == f19271(var228)) {
                var226 = (SubLObject)ConsesLow.cons(var228, var226);
            }
            var227 = var227.rest();
            var228 = var227.first();
        }
        return Sequences.nreverse(var226);
    }
    
    public static SubLObject f19273() {
        return f19274(f19236(), (SubLObject)module0287.UNPROVIDED);
    }
    
    public static SubLObject f19274(final SubLObject var118, SubLObject var227) {
        if (var227 == module0287.UNPROVIDED) {
            var227 = (SubLObject)module0287.NIL;
        }
        final SubLThread var228 = SubLProcess.currentSubLThread();
        SubLObject var229 = (SubLObject)module0287.ZERO_INTEGER;
        final SubLObject var231;
        final SubLObject var230 = var231 = module0034.f1854((SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
        final SubLObject var232 = module0034.$g879$.currentBinding(var228);
        try {
            module0034.$g879$.bind(var231, var228);
            SubLObject var233 = (SubLObject)module0287.NIL;
            if (module0287.NIL != var231 && module0287.NIL == module0034.f1842(var231)) {
                var233 = module0034.f1869(var231);
                final SubLObject var234 = Threads.current_process();
                if (module0287.NIL == var233) {
                    module0034.f1873(var231, var234);
                }
                else if (!var233.eql(var234)) {
                    Errors.error((SubLObject)module0287.$ic110$);
                }
            }
            try {
                SubLObject var235 = var118;
                SubLObject var236 = (SubLObject)module0287.NIL;
                var236 = var235.first();
                while (module0287.NIL != var235) {
                    final SubLObject var237 = f19275(var236);
                    if (module0287.NIL != var237) {
                        var229 = Numbers.add(var229, (SubLObject)module0287.ONE_INTEGER);
                    }
                    if (module0287.NIL != var237 || module0287.NIL != var227) {
                        module0006.f218((SubLObject)module0287.T, (SubLObject)module0287.$ic111$, module0259.f16821(var236, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED).first(), var236, var237, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
                    }
                    var235 = var235.rest();
                    var236 = var235.first();
                }
            }
            finally {
                final SubLObject var39_233 = Threads.$is_thread_performing_cleanupP$.currentBinding(var228);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0287.T, var228);
                    if (module0287.NIL != var231 && module0287.NIL == var233) {
                        module0034.f1873(var231, (SubLObject)module0287.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var39_233, var228);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var232, var228);
        }
        return var229;
    }
    
    public static SubLObject f19275(final SubLObject var58) {
        SubLObject var59 = f19276(var58);
        SubLObject var60 = f19210(var58);
        SubLObject var61 = (SubLObject)module0287.NIL;
        var61 = var60.first();
        while (module0287.NIL != var60) {
            final SubLObject var63;
            final SubLObject var62 = var63 = f19276(var61);
            if (var63.isVector()) {
                final SubLObject var64 = var63;
                final SubLObject var65 = (SubLObject)module0287.NIL;
                SubLObject var66;
                SubLObject var67;
                SubLObject var68;
                SubLObject var70;
                SubLObject var69;
                for (var66 = Sequences.length(var64), var67 = (SubLObject)module0287.NIL, var67 = (SubLObject)module0287.ZERO_INTEGER; var67.numL(var66); var67 = Numbers.add(var67, (SubLObject)module0287.ONE_INTEGER)) {
                    var68 = ((module0287.NIL != var65) ? Numbers.subtract(var66, var67, (SubLObject)module0287.ONE_INTEGER) : var67);
                    var69 = (var70 = Vectors.aref(var64, var68));
                    if (module0287.NIL == conses_high.member(var70, var59, Symbols.symbol_function((SubLObject)module0287.EQL), Symbols.symbol_function((SubLObject)module0287.IDENTITY))) {
                        var59 = (SubLObject)ConsesLow.cons(var70, var59);
                    }
                }
            }
            else {
                SubLObject var7_238 = var63;
                SubLObject var71 = (SubLObject)module0287.NIL;
                var71 = var7_238.first();
                while (module0287.NIL != var7_238) {
                    final SubLObject var72 = var71;
                    if (module0287.NIL == conses_high.member(var72, var59, Symbols.symbol_function((SubLObject)module0287.EQL), Symbols.symbol_function((SubLObject)module0287.IDENTITY))) {
                        var59 = (SubLObject)ConsesLow.cons(var72, var59);
                    }
                    var7_238 = var7_238.rest();
                    var71 = var7_238.first();
                }
            }
            var60 = var60.rest();
            var61 = var60.first();
        }
        return var59;
    }
    
    public static SubLObject f19277(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        SubLObject var60 = (SubLObject)module0287.NIL;
        final SubLObject var61 = module0147.$g2094$.currentBinding(var59);
        final SubLObject var62 = module0147.$g2095$.currentBinding(var59);
        try {
            module0147.$g2094$.bind((SubLObject)module0287.$ic41$, var59);
            module0147.$g2095$.bind(module0287.$ic42$, var59);
            final SubLObject var63 = f19195(var58, (SubLObject)module0287.UNPROVIDED);
            if (module0287.NIL != var63) {
                SubLObject var64 = (SubLObject)module0287.NIL;
                SubLObject var65 = var63;
                SubLObject var66 = (SubLObject)module0287.NIL;
                var66 = var65.first();
                while (module0287.NIL != var65) {
                    var59.resetMultipleValues();
                    final SubLObject var67 = module0289.f19396(var66);
                    final SubLObject var68 = var59.secondMultipleValue();
                    var59.resetMultipleValues();
                    final SubLObject var69 = module0202.f12782(var68, var67);
                    var59.resetMultipleValues();
                    final SubLObject var90_241 = module0288.f19342(var67, var68);
                    final SubLObject var70 = var59.secondMultipleValue();
                    var59.resetMultipleValues();
                    if (module0287.NIL != var70) {
                        if (module0287.NIL != var90_241) {
                            final SubLObject var71 = (SubLObject)module0287.$ic113$;
                            if (module0287.NIL == conses_high.member(var71, var60, Symbols.symbol_function((SubLObject)module0287.EQL), Symbols.symbol_function((SubLObject)module0287.IDENTITY))) {
                                var60 = (SubLObject)ConsesLow.cons(var71, var60);
                            }
                        }
                        else {
                            final SubLObject var71 = (SubLObject)module0287.$ic114$;
                            if (module0287.NIL == conses_high.member(var71, var60, Symbols.symbol_function((SubLObject)module0287.EQL), Symbols.symbol_function((SubLObject)module0287.IDENTITY))) {
                                var60 = (SubLObject)ConsesLow.cons(var71, var60);
                            }
                        }
                    }
                    if (module0287.NIL != module0178.f11290(var66) && module0287.NIL != module0211.f13732(var66)) {
                        final SubLObject var72 = (SubLObject)module0287.$ic115$;
                        if (module0287.NIL == conses_high.member(var72, var60, Symbols.symbol_function((SubLObject)module0287.EQL), Symbols.symbol_function((SubLObject)module0287.IDENTITY))) {
                            var60 = (SubLObject)ConsesLow.cons(var72, var60);
                        }
                    }
                    if (module0287.NIL != var64 && module0287.NIL == module0161.f10514(var68, var64)) {
                        final SubLObject var72 = (SubLObject)module0287.$ic116$;
                        if (module0287.NIL == conses_high.member(var72, var60, Symbols.symbol_function((SubLObject)module0287.EQL), Symbols.symbol_function((SubLObject)module0287.IDENTITY))) {
                            var60 = (SubLObject)ConsesLow.cons(var72, var60);
                        }
                    }
                    var64 = var68;
                    if (module0287.NIL != module0035.f2434(var58, var69)) {
                        final SubLObject var72 = (SubLObject)module0287.$ic117$;
                        if (module0287.NIL == conses_high.member(var72, var60, Symbols.symbol_function((SubLObject)module0287.EQL), Symbols.symbol_function((SubLObject)module0287.IDENTITY))) {
                            var60 = (SubLObject)ConsesLow.cons(var72, var60);
                        }
                    }
                    if (module0287.NIL != module0035.f2434(module0287.$ic3$, var69)) {
                        final SubLObject var72 = (SubLObject)module0287.$ic118$;
                        if (module0287.NIL == conses_high.member(var72, var60, Symbols.symbol_function((SubLObject)module0287.EQL), Symbols.symbol_function((SubLObject)module0287.IDENTITY))) {
                            var60 = (SubLObject)ConsesLow.cons(var72, var60);
                        }
                    }
                    var65 = var65.rest();
                    var66 = var65.first();
                }
            }
            if (module0287.NIL != module0004.f104(var58, module0287.$g2641$.getGlobalValue(), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED)) {
                var60 = (SubLObject)ConsesLow.cons((SubLObject)module0287.$ic119$, var60);
            }
            final SubLObject var73 = f19267(var58);
            if (var73.isVector()) {
                final SubLObject var74 = var73;
                final SubLObject var75 = (SubLObject)module0287.NIL;
                SubLObject var76;
                SubLObject var77;
                SubLObject var78;
                SubLObject var79;
                for (var76 = Sequences.length(var74), var77 = (SubLObject)module0287.NIL, var77 = (SubLObject)module0287.ZERO_INTEGER; var77.numL(var76); var77 = Numbers.add(var77, (SubLObject)module0287.ONE_INTEGER)) {
                    var78 = ((module0287.NIL != var75) ? Numbers.subtract(var76, var77, (SubLObject)module0287.ONE_INTEGER) : var77);
                    var79 = Vectors.aref(var74, var78);
                    var60 = (SubLObject)ConsesLow.cons(var79, var60);
                }
            }
            else {
                SubLObject var65 = var73;
                SubLObject var80 = (SubLObject)module0287.NIL;
                var80 = var65.first();
                while (module0287.NIL != var65) {
                    var60 = (SubLObject)ConsesLow.cons(var80, var60);
                    var65 = var65.rest();
                    var80 = var65.first();
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var62, var59);
            module0147.$g2094$.rebind(var61, var59);
        }
        if (module0287.NIL != var60 && module0287.NIL == conses_high.intersection(var60, (SubLObject)module0287.$ic120$, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED) && module0287.NIL != f19278(var58)) {
            var60 = (SubLObject)module0287.NIL;
        }
        return Sequences.nreverse(var60);
    }
    
    public static SubLObject f19276(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        final SubLObject var60 = module0034.$g879$.getDynamicValue(var59);
        SubLObject var61 = (SubLObject)module0287.NIL;
        if (module0287.NIL == var60) {
            return f19277(var58);
        }
        var61 = module0034.f1857(var60, (SubLObject)module0287.$ic112$, (SubLObject)module0287.UNPROVIDED);
        if (module0287.NIL == var61) {
            var61 = module0034.f1807(module0034.f1842(var60), (SubLObject)module0287.$ic112$, (SubLObject)module0287.ONE_INTEGER, (SubLObject)module0287.NIL, (SubLObject)module0287.EQ, (SubLObject)module0287.UNPROVIDED);
            module0034.f1860(var60, (SubLObject)module0287.$ic112$, var61);
        }
        SubLObject var62 = module0034.f1814(var61, var58, (SubLObject)module0287.$ic30$);
        if (var62 == module0287.$ic30$) {
            var62 = Values.arg2(var59.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f19277(var58)));
            module0034.f1816(var61, var58, var62, (SubLObject)module0287.UNPROVIDED);
        }
        return module0034.f1959(var62);
    }
    
    public static SubLObject f19279(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        SubLObject var60 = (SubLObject)module0287.NIL;
        final SubLObject var61 = f19195(var58, (SubLObject)module0287.UNPROVIDED).first();
        if (module0287.NIL != module0174.f11041(var61, (SubLObject)module0287.UNPROVIDED)) {
            SubLObject var62 = (SubLObject)module0287.NIL;
            try {
                var59.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var63 = Errors.$error_handler$.currentBinding(var59);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0287.$ic67$, var59);
                    try {
                        var60 = (SubLObject)ConsesLow.cons(module0543.f33675(var61, module0211.f13702(var61)), var60);
                    }
                    catch (Throwable var64) {
                        Errors.handleThrowable(var64, (SubLObject)module0287.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var63, var59);
                }
            }
            catch (Throwable var65) {
                var62 = Errors.handleThrowable(var65, module0003.$g3$.getGlobalValue());
            }
            finally {
                var59.throwStack.pop();
            }
            if (var62.isString()) {
                Errors.warn((SubLObject)module0287.$ic68$, var62);
            }
        }
        return Sequences.nreverse(var60);
    }
    
    public static SubLObject f19278(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        if (module0287.NIL != module0004.f104(var58, module0287.$g2642$.getGlobalValue(), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED)) {
            return (SubLObject)module0287.T;
        }
        SubLObject var60 = (SubLObject)module0287.NIL;
        SubLObject var61 = (SubLObject)module0287.NIL;
        SubLObject var62 = (SubLObject)module0287.NIL;
        SubLObject var63 = f19195(var58, (SubLObject)module0287.UNPROVIDED);
        SubLObject var64 = (SubLObject)module0287.NIL;
        var64 = var63.first();
        while (module0287.NIL != var63) {
            var59.resetMultipleValues();
            final SubLObject var65 = module0289.f19396(var64);
            final SubLObject var66 = var59.secondMultipleValue();
            var59.resetMultipleValues();
            final SubLObject var67 = module0205.f13147(var65, (SubLObject)module0287.$ic15$, (SubLObject)module0287.$ic38$, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
            if (module0287.NIL != var60 && module0287.NIL != module0035.f1966(var62, var67)) {
                Errors.warn((SubLObject)module0287.$ic122$, var58, var60, var65);
                return (SubLObject)module0287.NIL;
            }
            var60 = var65;
            var61 = var66;
            var62 = var67;
            var63 = var63.rest();
            var64 = var63.first();
        }
        SubLObject var68 = (SubLObject)module0287.NIL;
        final SubLObject var69 = module0287.$g2643$.currentBinding(var59);
        try {
            module0287.$g2643$.bind(f19280(var58), var59);
            var68 = (SubLObject)SubLObjectFactory.makeBoolean(module0287.NIL != module0337.f22630(var60, (SubLObject)module0287.$ic123$) || module0287.NIL != module0337.f22630(var60, (SubLObject)module0287.$ic124$) || module0287.NIL != module0337.f22630(var60, (SubLObject)module0287.$ic125$) || module0287.NIL != module0337.f22630(var60, (SubLObject)module0287.$ic126$) || module0287.NIL != module0337.f22630(var60, (SubLObject)module0287.$ic127$) || module0287.NIL != module0337.f22630(var60, (SubLObject)module0287.$ic128$) || module0287.NIL != module0337.f22630(var60, (SubLObject)module0287.$ic129$) || module0287.NIL != module0337.f22630(var60, (SubLObject)module0287.$ic130$) || module0287.NIL != module0337.f22630(var60, (SubLObject)module0287.$ic131$));
        }
        finally {
            module0287.$g2643$.rebind(var69, var59);
        }
        return var68;
    }
    
    public static SubLObject f19280(final SubLObject var58) {
        final SubLObject var59 = module0077.f5313(Symbols.symbol_function((SubLObject)module0287.EQUAL), (SubLObject)module0287.UNPROVIDED);
        SubLObject var60 = f19195(var58, (SubLObject)module0287.UNPROVIDED);
        SubLObject var61 = (SubLObject)module0287.NIL;
        var61 = var60.first();
        while (module0287.NIL != var60) {
            module0077.f5326(module0178.f11282(var61), var59);
            var60 = var60.rest();
            var61 = var60.first();
        }
        return module0077.f5311(var59);
    }
    
    public static SubLObject f19281(final SubLObject var70) {
        final SubLThread var71 = SubLProcess.currentSubLThread();
        if (module0287.NIL != module0202.f12595(var70)) {
            if (module0287.NIL != module0202.f12734(var70, module0287.$g2643$.getDynamicValue(var71), (SubLObject)module0287.UNPROVIDED)) {
                SubLObject var73;
                final SubLObject var72 = var73 = module0205.f13207(var70, (SubLObject)module0287.$ic132$);
                SubLObject var74 = (SubLObject)module0287.NIL;
                var74 = var73.first();
                while (module0287.NIL != var73) {
                    if (module0287.NIL == module0207.f13522(var74)) {
                        return (SubLObject)module0287.NIL;
                    }
                    var73 = var73.rest();
                    var74 = var73.first();
                }
            }
            return (SubLObject)module0287.T;
        }
        if (module0287.NIL != module0207.f13522(var70)) {
            return module0048.f3275(module0287.$g2643$.getDynamicValue(var71));
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19282() {
        SubLObject var75 = (SubLObject)module0287.NIL;
        SubLObject var76 = (SubLObject)module0287.NIL;
        final Iterator var77 = Hashtables.getEntrySetIterator(module0146.$g2067$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(var77)) {
                final Map.Entry var78 = Hashtables.iteratorNextEntry(var77);
                var75 = Hashtables.getEntryKey(var78);
                SubLObject var79;
                var76 = (var79 = Hashtables.getEntryValue(var78));
                SubLObject var80 = (SubLObject)module0287.NIL;
                var80 = var79.first();
                while (module0287.NIL != var79) {
                    final SubLObject var81 = conses_high.second(var80);
                    final SubLObject var82 = f19283(var81);
                    module0035.f2044((SubLObject)module0287.ONE_INTEGER, var82, var80);
                    var79 = var79.rest();
                    var80 = var79.first();
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var77);
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19283(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0287.NIL != f19187(var8)) {
            SubLObject var10 = (SubLObject)module0287.NIL;
            SubLObject var11 = (SubLObject)module0287.NIL;
            SubLObject var12 = (SubLObject)module0287.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var8, var8, (SubLObject)module0287.$ic133$);
            var10 = var8.first();
            SubLObject var13 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var8, (SubLObject)module0287.$ic133$);
            var11 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var8, (SubLObject)module0287.$ic133$);
            var12 = var13.first();
            var13 = var13.rest();
            final SubLObject var14 = (SubLObject)(var13.isCons() ? var13.first() : module0287.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var13, var8, (SubLObject)module0287.$ic133$);
            var13 = var13.rest();
            if (module0287.NIL == var13) {
                final SubLObject var15 = f19180(var11, var12, (SubLObject)module0287.NIL, var14);
                if (module0287.NIL == Errors.$ignore_mustsP$.getDynamicValue(var9) && !var10.eql(module0205.f13276(var15))) {
                    Errors.error((SubLObject)module0287.$ic134$, var8, var10, var15);
                }
                return var15;
            }
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)module0287.$ic133$);
        }
        return var8;
    }
    
    public static SubLObject f19284() {
        SubLObject var17 = (SubLObject)module0287.NIL;
        SubLObject var18 = f19236();
        SubLObject var19 = (SubLObject)module0287.NIL;
        var19 = var18.first();
        while (module0287.NIL != var18) {
            final SubLObject var20 = f19285(var19);
            if (module0287.NIL == var20) {
                var17 = (SubLObject)ConsesLow.cons(var19, var17);
            }
            var18 = var18.rest();
            var19 = var18.first();
        }
        return Sequences.nreverse(var17);
    }
    
    public static SubLObject f19285(final SubLObject var58) {
        SubLObject var59 = (SubLObject)module0287.NIL;
        if (module0287.NIL == module0035.f2169(var58, module0287.$g2641$.getGlobalValue()) && module0287.NIL == module0035.f2169(var58, module0287.$g2642$.getGlobalValue())) {
            final SubLObject var60 = conses_high.second(f19241(var58, (SubLObject)module0287.UNPROVIDED));
            final SubLObject var61 = f19193(var58);
            if (!var60.equal(var61)) {
                var59 = (SubLObject)module0287.T;
                SubLObject var62 = (SubLObject)module0287.$ic135$;
                if (module0287.NIL != f19286(var58)) {
                    var62 = (SubLObject)module0287.$ic136$;
                }
                module0006.f218((SubLObject)module0287.T, (SubLObject)module0287.$ic137$, var62, var58, var60, var61, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0287.NIL == var59);
    }
    
    public static SubLObject f19287(final SubLObject var118) {
        SubLObject var119 = (SubLObject)module0287.NIL;
        SubLObject var120 = var118;
        SubLObject var121 = (SubLObject)module0287.NIL;
        var121 = var120.first();
        while (module0287.NIL != var120) {
            if (module0287.NIL != f19288(var121)) {
                var119 = (SubLObject)ConsesLow.cons(var121, var119);
            }
            var120 = var120.rest();
            var121 = var120.first();
        }
        return Sequences.nreverse(var119);
    }
    
    public static SubLObject f19288(final SubLObject var58) {
        if (module0287.NIL != module0035.f2194(conses_high.second(conses_high.second(f19181(var58))), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED)) {
            return f19289(var58);
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19289(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        final SubLObject var60 = f19181(var58);
        final SubLObject var61 = f19283(conses_high.second(var60));
        SubLObject var63;
        final SubLObject var62 = var63 = var61;
        SubLObject var64 = (SubLObject)module0287.NIL;
        SubLObject var65 = (SubLObject)module0287.NIL;
        SubLObject var66 = (SubLObject)module0287.NIL;
        SubLObject var67 = (SubLObject)module0287.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)module0287.$ic138$);
        var64 = var63.first();
        var63 = var63.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)module0287.$ic138$);
        var65 = var63.first();
        var63 = var63.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)module0287.$ic138$);
        var66 = var63.first();
        var63 = var63.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)module0287.$ic138$);
        var67 = var63.first();
        var63 = var63.rest();
        if (module0287.NIL == var63) {
            if (module0287.NIL == Errors.$ignore_mustsP$.getDynamicValue(var59) && !var64.eql(module0287.$ic3$)) {
                Errors.error((SubLObject)module0287.$ic139$);
            }
            final SubLObject var68 = module0035.f2113(module0035.f2196(var65, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED));
            final SubLObject var69 = module0035.f2074(var68, var65, (SubLObject)module0287.UNPROVIDED);
            final SubLObject var70 = f19180(var69, var66, var67, var68);
            module0035.f2044((SubLObject)module0287.ONE_INTEGER, var70, var60);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var62, (SubLObject)module0287.$ic138$);
        }
        return var60;
    }
    
    public static SubLObject f19290(final SubLObject var118) {
        SubLObject var119 = (SubLObject)module0287.NIL;
        SubLObject var120 = var118;
        SubLObject var121 = (SubLObject)module0287.NIL;
        var121 = var120.first();
        while (module0287.NIL != var120) {
            if (module0287.NIL != f19291(var121)) {
                var119 = (SubLObject)ConsesLow.cons(var121, var119);
            }
            var120 = var120.rest();
            var121 = var120.first();
        }
        return Sequences.nreverse(var119);
    }
    
    public static SubLObject f19291(final SubLObject var58) {
        SubLObject var59 = conses_high.second(conses_high.second(f19181(var58)));
        SubLObject var60 = (SubLObject)module0287.NIL;
        var60 = var59.first();
        while (module0287.NIL != var59) {
            if (module0287.NIL != f19196(var60, (SubLObject)module0287.UNPROVIDED)) {
                return f19292(var58);
            }
            var59 = var59.rest();
            var60 = var59.first();
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19292(final SubLObject var58) {
        final SubLObject var59 = f19181(var58);
        final SubLObject var60 = f19283(conses_high.second(var59));
        SubLObject var62;
        final SubLObject var61 = var62 = var60;
        SubLObject var63 = (SubLObject)module0287.NIL;
        SubLObject var64 = (SubLObject)module0287.NIL;
        SubLObject var65 = (SubLObject)module0287.NIL;
        SubLObject var66 = (SubLObject)module0287.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)module0287.$ic140$);
        var63 = var62.first();
        var62 = var62.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)module0287.$ic140$);
        var64 = var62.first();
        var62 = var62.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)module0287.$ic140$);
        var65 = var62.first();
        var62 = var62.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)module0287.$ic140$);
        var66 = var62.first();
        var62 = var62.rest();
        final SubLObject var67 = (SubLObject)(var62.isCons() ? var62.first() : module0287.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var62, var61, (SubLObject)module0287.$ic140$);
        var62 = var62.rest();
        if (module0287.NIL == var62) {
            if (module0287.$ic3$.eql(var63)) {
                final SubLObject var68 = module0035.f2113(module0035.remove_if_not((SubLObject)module0287.$ic141$, var64, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED));
                final SubLObject var69 = Sequences.remove_if((SubLObject)module0287.$ic141$, var64, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
                final SubLObject var70 = f19180(var69, var65, var66, var68);
                module0035.f2044((SubLObject)module0287.ONE_INTEGER, var70, var59);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var61, (SubLObject)module0287.$ic140$);
        }
        return var59;
    }
    
    public static SubLObject f19286(final SubLObject var58) {
        if (module0287.NIL != module0128.f8463(var58, (SubLObject)module0287.UNPROVIDED)) {
            final SubLObject var59 = f19195(var58, (SubLObject)module0287.UNPROVIDED);
            if (module0287.NIL != module0035.f1995(var59, (SubLObject)module0287.TWO_INTEGER, (SubLObject)module0287.UNPROVIDED)) {
                SubLObject var61;
                final SubLObject var60 = var61 = var59;
                SubLObject var62 = (SubLObject)module0287.NIL;
                SubLObject var63 = (SubLObject)module0287.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var61, var60, (SubLObject)module0287.$ic142$);
                var62 = var61.first();
                var61 = var61.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var61, var60, (SubLObject)module0287.$ic142$);
                var63 = var61.first();
                var61 = var61.rest();
                if (module0287.NIL == var61) {
                    if (module0287.NIL != module0178.f11284(var62) && module0287.NIL != module0178.f11284(var63) && module0287.NIL != module0202.f12589(module0178.f11285(var63), module0287.$ic143$) && module0287.NIL != module0035.f2428(module0287.$ic3$, module0178.f11287(var62), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED) && module0287.NIL != module0035.f2428(module0287.$ic3$, module0178.f11287(var63), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED)) {
                        return (SubLObject)module0287.T;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var60, (SubLObject)module0287.$ic142$);
                }
            }
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19293(final SubLObject var118) {
        SubLObject var119 = var118;
        SubLObject var120 = (SubLObject)module0287.NIL;
        var120 = var119.first();
        while (module0287.NIL != var119) {
            f19294(var120);
            var119 = var119.rest();
            var120 = var119.first();
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19294(final SubLObject var58) {
        if (module0287.NIL != f19286(var58)) {
            SubLObject var60;
            final SubLObject var59 = var60 = f19195(var58, (SubLObject)module0287.UNPROVIDED);
            SubLObject var61 = (SubLObject)module0287.NIL;
            SubLObject var62 = (SubLObject)module0287.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var60, var59, (SubLObject)module0287.$ic144$);
            var61 = var60.first();
            var60 = var60.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var60, var59, (SubLObject)module0287.$ic144$);
            var62 = var60.first();
            var60 = var60.rest();
            if (module0287.NIL == var60) {
                final SubLObject var63 = module0178.f11285(var61);
                final SubLObject var64 = module0161.f10557(module0178.f11287(var61));
                module0540.f33517((SubLObject)ConsesLow.list(module0287.$ic145$, (SubLObject)module0287.$ic146$, (SubLObject)ConsesLow.list(module0287.$ic147$, (SubLObject)ConsesLow.listS(module0287.$ic148$, var64, (SubLObject)module0287.$ic149$), (SubLObject)ConsesLow.listS(module0287.$ic150$, var63, (SubLObject)module0287.$ic151$))), module0287.$ic152$, (SubLObject)module0287.UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var59, (SubLObject)module0287.$ic144$);
            }
            module0540.f33510(var58);
            return (SubLObject)module0287.T;
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19295() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (module0287.NIL != f19237()) {
            f19282();
            f19287(module0269.f17703(module0287.$ic4$));
            f19290(module0269.f17703(module0287.$ic4$));
            f19293((SubLObject)module0287.$ic153$);
            final SubLObject var6 = module0287.$g2642$.getGlobalValue();
            module0012.$g82$.setDynamicValue((SubLObject)module0287.$ic154$, var5);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var5);
            module0012.$g83$.setDynamicValue(Sequences.length(var6), var5);
            module0012.$g84$.setDynamicValue((SubLObject)module0287.ZERO_INTEGER, var5);
            final SubLObject var7 = module0012.$g75$.currentBinding(var5);
            final SubLObject var8 = module0012.$g76$.currentBinding(var5);
            final SubLObject var9 = module0012.$g77$.currentBinding(var5);
            final SubLObject var10 = module0012.$g78$.currentBinding(var5);
            try {
                module0012.$g75$.bind((SubLObject)module0287.ZERO_INTEGER, var5);
                module0012.$g76$.bind((SubLObject)module0287.NIL, var5);
                module0012.$g77$.bind((SubLObject)module0287.T, var5);
                module0012.$g78$.bind(Time.get_universal_time(), var5);
                module0012.f478(module0012.$g82$.getDynamicValue(var5));
                SubLObject var11 = var6;
                SubLObject var12 = (SubLObject)module0287.NIL;
                var12 = var11.first();
                while (module0287.NIL != var11) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var5), module0012.$g83$.getDynamicValue(var5));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var5), (SubLObject)module0287.ONE_INTEGER), var5);
                    if (module0287.NIL != module0128.f8463(var12, (SubLObject)module0287.UNPROVIDED)) {
                        f19279(var12);
                    }
                    var11 = var11.rest();
                    var12 = var11.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var10, var5);
                module0012.$g77$.rebind(var9, var5);
                module0012.$g76$.rebind(var8, var5);
                module0012.$g75$.rebind(var7, var5);
            }
            return (SubLObject)module0287.T;
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19296() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0287.NIL;
        final SubLObject var7 = module0287.$ic4$;
        final SubLObject var8 = module0137.$g1605$.currentBinding(var5);
        final SubLObject var9 = module0139.$g1636$.currentBinding(var5);
        try {
            module0137.$g1605$.bind(module0137.f8955(module0287.$ic49$), var5);
            module0139.$g1636$.bind(module0139.f9007(), var5);
            SubLObject var280_281 = var7;
            final SubLObject var10 = (SubLObject)module0287.$ic158$;
            final SubLObject var11 = module0056.f4145(var10);
            final SubLObject var39_284 = module0139.$g1635$.currentBinding(var5);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var5);
                final SubLObject var12 = (SubLObject)module0287.NIL;
                final SubLObject var39_285 = module0141.$g1714$.currentBinding(var5);
                final SubLObject var114_287 = module0141.$g1715$.currentBinding(var5);
                try {
                    module0141.$g1714$.bind((module0287.NIL != var12) ? var12 : module0141.f9283(), var5);
                    module0141.$g1715$.bind((SubLObject)((module0287.NIL != var12) ? module0287.$ic159$ : module0141.$g1715$.getDynamicValue(var5)), var5);
                    if (module0287.NIL != var12 && module0287.NIL != module0136.f8864() && module0287.NIL == module0141.f9279(var12)) {
                        final SubLObject var13 = module0136.$g1591$.getDynamicValue(var5);
                        if (var13.eql((SubLObject)module0287.$ic160$)) {
                            module0136.f8870((SubLObject)module0287.ONE_INTEGER, (SubLObject)module0287.$ic161$, var12, (SubLObject)module0287.$ic162$, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
                        }
                        else if (var13.eql((SubLObject)module0287.$ic163$)) {
                            module0136.f8871((SubLObject)module0287.ONE_INTEGER, (SubLObject)module0287.$ic164$, (SubLObject)module0287.$ic161$, var12, (SubLObject)module0287.$ic162$, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
                        }
                        else if (var13.eql((SubLObject)module0287.$ic165$)) {
                            Errors.warn((SubLObject)module0287.$ic161$, var12, (SubLObject)module0287.$ic162$);
                        }
                        else {
                            Errors.warn((SubLObject)module0287.$ic166$, module0136.$g1591$.getDynamicValue(var5));
                            Errors.cerror((SubLObject)module0287.$ic164$, (SubLObject)module0287.$ic161$, var12, (SubLObject)module0287.$ic162$);
                        }
                    }
                    final SubLObject var39_286 = module0141.$g1670$.currentBinding(var5);
                    final SubLObject var114_288 = module0141.$g1671$.currentBinding(var5);
                    final SubLObject var14 = module0141.$g1672$.currentBinding(var5);
                    final SubLObject var15 = module0141.$g1674$.currentBinding(var5);
                    final SubLObject var16 = module0137.$g1605$.currentBinding(var5);
                    try {
                        module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0287.$ic49$)), var5);
                        module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0287.$ic49$))), var5);
                        module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0287.$ic49$))), var5);
                        module0141.$g1674$.bind((SubLObject)module0287.NIL, var5);
                        module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0287.$ic49$)), var5);
                        if (module0287.NIL != module0136.f8865() || module0287.NIL != module0244.f15795(var7, module0137.f8955((SubLObject)module0287.UNPROVIDED))) {
                            final SubLObject var39_287 = module0141.$g1677$.currentBinding(var5);
                            final SubLObject var114_289 = module0138.$g1619$.currentBinding(var5);
                            final SubLObject var128_293 = module0141.$g1674$.currentBinding(var5);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var5);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0287.$ic49$))), var5);
                                module0141.$g1674$.bind((SubLObject)module0287.NIL, var5);
                                module0249.f16055(var280_281, (SubLObject)module0287.UNPROVIDED);
                                while (module0287.NIL != var280_281) {
                                    final SubLObject var17 = var280_281;
                                    SubLObject var19;
                                    final SubLObject var18 = var19 = module0200.f12443(module0137.f8955(module0287.$ic49$));
                                    SubLObject var20 = (SubLObject)module0287.NIL;
                                    var20 = var19.first();
                                    while (module0287.NIL != var19) {
                                        final SubLObject var39_288 = module0137.$g1605$.currentBinding(var5);
                                        final SubLObject var114_290 = module0141.$g1674$.currentBinding(var5);
                                        try {
                                            module0137.$g1605$.bind(var20, var5);
                                            module0141.$g1674$.bind((SubLObject)((module0287.NIL != module0141.f9205((SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0287.NIL == module0141.$g1674$.getDynamicValue(var5)) : module0141.$g1674$.getDynamicValue(var5)), var5);
                                            final SubLObject var21 = module0228.f15229(var17);
                                            if (module0287.NIL != module0138.f8992(var21)) {
                                                final SubLObject var22 = module0242.f15664(var21, module0137.f8955((SubLObject)module0287.UNPROVIDED));
                                                if (module0287.NIL != var22) {
                                                    final SubLObject var23 = module0245.f15834(var22, module0244.f15780(module0137.f8955(module0287.$ic49$)), module0137.f8955((SubLObject)module0287.UNPROVIDED));
                                                    if (module0287.NIL != var23) {
                                                        SubLObject var24;
                                                        for (var24 = module0066.f4838(module0067.f4891(var23)); module0287.NIL == module0066.f4841(var24); var24 = module0066.f4840(var24)) {
                                                            var5.resetMultipleValues();
                                                            final SubLObject var25 = module0066.f4839(var24);
                                                            final SubLObject var26 = var5.secondMultipleValue();
                                                            var5.resetMultipleValues();
                                                            if (module0287.NIL != module0147.f9507(var25)) {
                                                                final SubLObject var39_289 = module0138.$g1623$.currentBinding(var5);
                                                                try {
                                                                    module0138.$g1623$.bind(var25, var5);
                                                                    SubLObject var302_306;
                                                                    for (var302_306 = module0066.f4838(module0067.f4891(var26)); module0287.NIL == module0066.f4841(var302_306); var302_306 = module0066.f4840(var302_306)) {
                                                                        var5.resetMultipleValues();
                                                                        final SubLObject var27 = module0066.f4839(var302_306);
                                                                        final SubLObject var28 = var5.secondMultipleValue();
                                                                        var5.resetMultipleValues();
                                                                        if (module0287.NIL != module0141.f9289(var27)) {
                                                                            final SubLObject var39_290 = module0138.$g1624$.currentBinding(var5);
                                                                            try {
                                                                                module0138.$g1624$.bind(var27, var5);
                                                                                final SubLObject var29 = var28;
                                                                                if (module0287.NIL != module0077.f5302(var29)) {
                                                                                    final SubLObject var30 = module0077.f5333(var29);
                                                                                    SubLObject var31;
                                                                                    SubLObject var32;
                                                                                    SubLObject var33;
                                                                                    for (var31 = module0032.f1741(var30), var32 = (SubLObject)module0287.NIL, var32 = module0032.f1742(var31, var30); module0287.NIL == module0032.f1744(var31, var32); var32 = module0032.f1743(var32)) {
                                                                                        var33 = module0032.f1745(var31, var32);
                                                                                        if (module0287.NIL != module0032.f1746(var32, var33) && module0287.NIL == module0249.f16059(var33, module0139.$g1636$.getDynamicValue(var5))) {
                                                                                            module0249.f16055(var33, module0139.$g1636$.getDynamicValue(var5));
                                                                                            if (module0287.NIL == module0004.f104(var33, module0287.$g2644$.getGlobalValue(), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED) && module0287.NIL != f19297(var33)) {
                                                                                                var6 = (SubLObject)ConsesLow.cons(var33, var6);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var29.isList()) {
                                                                                    SubLObject var34 = var29;
                                                                                    SubLObject var35 = (SubLObject)module0287.NIL;
                                                                                    var35 = var34.first();
                                                                                    while (module0287.NIL != var34) {
                                                                                        if (module0287.NIL == module0249.f16059(var35, module0139.$g1636$.getDynamicValue(var5))) {
                                                                                            module0249.f16055(var35, module0139.$g1636$.getDynamicValue(var5));
                                                                                            if (module0287.NIL == module0004.f104(var35, module0287.$g2644$.getGlobalValue(), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED) && module0287.NIL != f19297(var35)) {
                                                                                                var6 = (SubLObject)ConsesLow.cons(var35, var6);
                                                                                            }
                                                                                        }
                                                                                        var34 = var34.rest();
                                                                                        var35 = var34.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0287.$ic167$, var29);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var39_290, var5);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var302_306);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var39_289, var5);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var24);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0287.FIVE_INTEGER, (SubLObject)module0287.$ic168$, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
                                                }
                                                if (module0287.NIL != module0200.f12419(var21, module0137.f8955((SubLObject)module0287.UNPROVIDED))) {
                                                    SubLObject var36 = module0248.f15995(var21);
                                                    SubLObject var37 = (SubLObject)module0287.NIL;
                                                    var37 = var36.first();
                                                    while (module0287.NIL != var36) {
                                                        SubLObject var39;
                                                        final SubLObject var38 = var39 = var37;
                                                        SubLObject var40 = (SubLObject)module0287.NIL;
                                                        SubLObject var41 = (SubLObject)module0287.NIL;
                                                        SubLObject var42 = (SubLObject)module0287.NIL;
                                                        cdestructuring_bind.destructuring_bind_must_consp(var39, var38, (SubLObject)module0287.$ic169$);
                                                        var40 = var39.first();
                                                        var39 = var39.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(var39, var38, (SubLObject)module0287.$ic169$);
                                                        var41 = var39.first();
                                                        var39 = var39.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(var39, var38, (SubLObject)module0287.$ic169$);
                                                        var42 = var39.first();
                                                        var39 = var39.rest();
                                                        if (module0287.NIL == var39) {
                                                            if (module0287.NIL != module0147.f9507(var41)) {
                                                                final SubLObject var39_291 = module0138.$g1623$.currentBinding(var5);
                                                                try {
                                                                    module0138.$g1623$.bind(var41, var5);
                                                                    if (module0287.NIL != module0141.f9289(var42)) {
                                                                        final SubLObject var39_292 = module0138.$g1624$.currentBinding(var5);
                                                                        try {
                                                                            module0138.$g1624$.bind(var42, var5);
                                                                            final SubLObject var29;
                                                                            final SubLObject var43 = var29 = (SubLObject)ConsesLow.list(var40);
                                                                            if (module0287.NIL != module0077.f5302(var29)) {
                                                                                final SubLObject var30 = module0077.f5333(var29);
                                                                                SubLObject var31;
                                                                                SubLObject var32;
                                                                                SubLObject var33;
                                                                                for (var31 = module0032.f1741(var30), var32 = (SubLObject)module0287.NIL, var32 = module0032.f1742(var31, var30); module0287.NIL == module0032.f1744(var31, var32); var32 = module0032.f1743(var32)) {
                                                                                    var33 = module0032.f1745(var31, var32);
                                                                                    if (module0287.NIL != module0032.f1746(var32, var33) && module0287.NIL == module0249.f16059(var33, module0139.$g1636$.getDynamicValue(var5))) {
                                                                                        module0249.f16055(var33, module0139.$g1636$.getDynamicValue(var5));
                                                                                        if (module0287.NIL == module0004.f104(var33, module0287.$g2644$.getGlobalValue(), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED) && module0287.NIL != f19297(var33)) {
                                                                                            var6 = (SubLObject)ConsesLow.cons(var33, var6);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (var29.isList()) {
                                                                                SubLObject var48_322 = var29;
                                                                                SubLObject var35 = (SubLObject)module0287.NIL;
                                                                                var35 = var48_322.first();
                                                                                while (module0287.NIL != var48_322) {
                                                                                    if (module0287.NIL == module0249.f16059(var35, module0139.$g1636$.getDynamicValue(var5))) {
                                                                                        module0249.f16055(var35, module0139.$g1636$.getDynamicValue(var5));
                                                                                        if (module0287.NIL == module0004.f104(var35, module0287.$g2644$.getGlobalValue(), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED) && module0287.NIL != f19297(var35)) {
                                                                                            var6 = (SubLObject)ConsesLow.cons(var35, var6);
                                                                                        }
                                                                                    }
                                                                                    var48_322 = var48_322.rest();
                                                                                    var35 = var48_322.first();
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)module0287.$ic167$, var29);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1624$.rebind(var39_292, var5);
                                                                        }
                                                                    }
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var39_291, var5);
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            cdestructuring_bind.cdestructuring_bind_error(var38, (SubLObject)module0287.$ic169$);
                                                        }
                                                        var36 = var36.rest();
                                                        var37 = var36.first();
                                                    }
                                                }
                                            }
                                            else if (module0287.NIL != module0155.f9785(var21, (SubLObject)module0287.UNPROVIDED)) {
                                                SubLObject var7_324;
                                                final SubLObject var44 = var7_324 = ((module0287.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0287.$ic49$)), module0141.$g1714$.getDynamicValue(var5), module0137.f8955((SubLObject)module0287.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0287.$ic49$)), module0141.$g1714$.getDynamicValue(var5), module0137.f8955((SubLObject)module0287.UNPROVIDED)));
                                                SubLObject var45 = (SubLObject)module0287.NIL;
                                                var45 = var7_324.first();
                                                while (module0287.NIL != var7_324) {
                                                    final SubLObject var39_293 = module0138.$g1625$.currentBinding(var5);
                                                    try {
                                                        module0138.$g1625$.bind(var45, var5);
                                                        final SubLObject var47;
                                                        final SubLObject var46 = var47 = Functions.funcall(var45, var21);
                                                        if (module0287.NIL != module0077.f5302(var47)) {
                                                            final SubLObject var48 = module0077.f5333(var47);
                                                            SubLObject var49;
                                                            SubLObject var50;
                                                            SubLObject var51;
                                                            for (var49 = module0032.f1741(var48), var50 = (SubLObject)module0287.NIL, var50 = module0032.f1742(var49, var48); module0287.NIL == module0032.f1744(var49, var50); var50 = module0032.f1743(var50)) {
                                                                var51 = module0032.f1745(var49, var50);
                                                                if (module0287.NIL != module0032.f1746(var50, var51) && module0287.NIL == module0249.f16059(var51, module0139.$g1636$.getDynamicValue(var5))) {
                                                                    module0249.f16055(var51, module0139.$g1636$.getDynamicValue(var5));
                                                                    if (module0287.NIL == module0004.f104(var51, module0287.$g2644$.getGlobalValue(), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED) && module0287.NIL != f19297(var51)) {
                                                                        var6 = (SubLObject)ConsesLow.cons(var51, var6);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        else if (var47.isList()) {
                                                            SubLObject var52 = var47;
                                                            SubLObject var53 = (SubLObject)module0287.NIL;
                                                            var53 = var52.first();
                                                            while (module0287.NIL != var52) {
                                                                if (module0287.NIL == module0249.f16059(var53, module0139.$g1636$.getDynamicValue(var5))) {
                                                                    module0249.f16055(var53, module0139.$g1636$.getDynamicValue(var5));
                                                                    if (module0287.NIL == module0004.f104(var53, module0287.$g2644$.getGlobalValue(), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED) && module0287.NIL != f19297(var53)) {
                                                                        var6 = (SubLObject)ConsesLow.cons(var53, var6);
                                                                    }
                                                                }
                                                                var52 = var52.rest();
                                                                var53 = var52.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0287.$ic167$, var47);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var39_293, var5);
                                                    }
                                                    var7_324 = var7_324.rest();
                                                    var45 = var7_324.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var114_290, var5);
                                            module0137.$g1605$.rebind(var39_288, var5);
                                        }
                                        var19 = var19.rest();
                                        var20 = var19.first();
                                    }
                                    SubLObject var55;
                                    final SubLObject var54 = var55 = module0200.f12443(module0244.f15771(module0137.f8955(module0287.$ic49$)));
                                    SubLObject var56 = (SubLObject)module0287.NIL;
                                    var56 = var55.first();
                                    while (module0287.NIL != var55) {
                                        final SubLObject var39_294 = module0137.$g1605$.currentBinding(var5);
                                        final SubLObject var114_291 = module0141.$g1674$.currentBinding(var5);
                                        try {
                                            module0137.$g1605$.bind(var56, var5);
                                            module0141.$g1674$.bind((SubLObject)((module0287.NIL != module0141.f9205((SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0287.NIL == module0141.$g1674$.getDynamicValue(var5)) : module0141.$g1674$.getDynamicValue(var5)), var5);
                                            final SubLObject var57 = module0228.f15229(var280_281);
                                            if (module0287.NIL != module0138.f8992(var57)) {
                                                final SubLObject var58 = module0242.f15664(var57, module0137.f8955((SubLObject)module0287.UNPROVIDED));
                                                if (module0287.NIL != var58) {
                                                    final SubLObject var59 = module0245.f15834(var58, module0138.f8979(), module0137.f8955((SubLObject)module0287.UNPROVIDED));
                                                    if (module0287.NIL != var59) {
                                                        SubLObject var60;
                                                        for (var60 = module0066.f4838(module0067.f4891(var59)); module0287.NIL == module0066.f4841(var60); var60 = module0066.f4840(var60)) {
                                                            var5.resetMultipleValues();
                                                            final SubLObject var61 = module0066.f4839(var60);
                                                            final SubLObject var62 = var5.secondMultipleValue();
                                                            var5.resetMultipleValues();
                                                            if (module0287.NIL != module0147.f9507(var61)) {
                                                                final SubLObject var39_295 = module0138.$g1623$.currentBinding(var5);
                                                                try {
                                                                    module0138.$g1623$.bind(var61, var5);
                                                                    SubLObject var302_307;
                                                                    for (var302_307 = module0066.f4838(module0067.f4891(var62)); module0287.NIL == module0066.f4841(var302_307); var302_307 = module0066.f4840(var302_307)) {
                                                                        var5.resetMultipleValues();
                                                                        final SubLObject var63 = module0066.f4839(var302_307);
                                                                        final SubLObject var64 = var5.secondMultipleValue();
                                                                        var5.resetMultipleValues();
                                                                        if (module0287.NIL != module0141.f9289(var63)) {
                                                                            final SubLObject var39_296 = module0138.$g1624$.currentBinding(var5);
                                                                            try {
                                                                                module0138.$g1624$.bind(var63, var5);
                                                                                final SubLObject var65 = var64;
                                                                                if (module0287.NIL != module0077.f5302(var65)) {
                                                                                    final SubLObject var66 = module0077.f5333(var65);
                                                                                    SubLObject var67;
                                                                                    SubLObject var68;
                                                                                    SubLObject var69;
                                                                                    for (var67 = module0032.f1741(var66), var68 = (SubLObject)module0287.NIL, var68 = module0032.f1742(var67, var66); module0287.NIL == module0032.f1744(var67, var68); var68 = module0032.f1743(var68)) {
                                                                                        var69 = module0032.f1745(var67, var68);
                                                                                        if (module0287.NIL != module0032.f1746(var68, var69) && module0287.NIL == module0249.f16059(var69, (SubLObject)module0287.UNPROVIDED)) {
                                                                                            module0249.f16055(var69, (SubLObject)module0287.UNPROVIDED);
                                                                                            module0056.f4149(var69, var11);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var65.isList()) {
                                                                                    SubLObject var70 = var65;
                                                                                    SubLObject var71 = (SubLObject)module0287.NIL;
                                                                                    var71 = var70.first();
                                                                                    while (module0287.NIL != var70) {
                                                                                        if (module0287.NIL == module0249.f16059(var71, (SubLObject)module0287.UNPROVIDED)) {
                                                                                            module0249.f16055(var71, (SubLObject)module0287.UNPROVIDED);
                                                                                            module0056.f4149(var71, var11);
                                                                                        }
                                                                                        var70 = var70.rest();
                                                                                        var71 = var70.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0287.$ic167$, var65);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var39_296, var5);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var302_307);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var39_295, var5);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var60);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0287.FIVE_INTEGER, (SubLObject)module0287.$ic168$, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
                                                }
                                            }
                                            else if (module0287.NIL != module0155.f9785(var57, (SubLObject)module0287.UNPROVIDED)) {
                                                SubLObject var7_325;
                                                final SubLObject var72 = var7_325 = ((module0287.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var5), module0137.f8955((SubLObject)module0287.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var5), module0137.f8955((SubLObject)module0287.UNPROVIDED)));
                                                SubLObject var73 = (SubLObject)module0287.NIL;
                                                var73 = var7_325.first();
                                                while (module0287.NIL != var7_325) {
                                                    final SubLObject var39_297 = module0138.$g1625$.currentBinding(var5);
                                                    try {
                                                        module0138.$g1625$.bind(var73, var5);
                                                        final SubLObject var75;
                                                        final SubLObject var74 = var75 = Functions.funcall(var73, var57);
                                                        if (module0287.NIL != module0077.f5302(var75)) {
                                                            final SubLObject var76 = module0077.f5333(var75);
                                                            SubLObject var77;
                                                            SubLObject var78;
                                                            SubLObject var79;
                                                            for (var77 = module0032.f1741(var76), var78 = (SubLObject)module0287.NIL, var78 = module0032.f1742(var77, var76); module0287.NIL == module0032.f1744(var77, var78); var78 = module0032.f1743(var78)) {
                                                                var79 = module0032.f1745(var77, var78);
                                                                if (module0287.NIL != module0032.f1746(var78, var79) && module0287.NIL == module0249.f16059(var79, (SubLObject)module0287.UNPROVIDED)) {
                                                                    module0249.f16055(var79, (SubLObject)module0287.UNPROVIDED);
                                                                    module0056.f4149(var79, var11);
                                                                }
                                                            }
                                                        }
                                                        else if (var75.isList()) {
                                                            SubLObject var80 = var75;
                                                            SubLObject var81 = (SubLObject)module0287.NIL;
                                                            var81 = var80.first();
                                                            while (module0287.NIL != var80) {
                                                                if (module0287.NIL == module0249.f16059(var81, (SubLObject)module0287.UNPROVIDED)) {
                                                                    module0249.f16055(var81, (SubLObject)module0287.UNPROVIDED);
                                                                    module0056.f4149(var81, var11);
                                                                }
                                                                var80 = var80.rest();
                                                                var81 = var80.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0287.$ic167$, var75);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var39_297, var5);
                                                    }
                                                    var7_325 = var7_325.rest();
                                                    var73 = var7_325.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var114_291, var5);
                                            module0137.$g1605$.rebind(var39_294, var5);
                                        }
                                        var55 = var55.rest();
                                        var56 = var55.first();
                                    }
                                    var280_281 = module0056.f4150(var11);
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var128_293, var5);
                                module0138.$g1619$.rebind(var114_289, var5);
                                module0141.$g1677$.rebind(var39_287, var5);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)module0287.TWO_INTEGER, (SubLObject)module0287.$ic170$, var7, module0244.f15748(module0137.f8955((SubLObject)module0287.UNPROVIDED)), (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED, (SubLObject)module0287.UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var16, var5);
                        module0141.$g1674$.rebind(var15, var5);
                        module0141.$g1672$.rebind(var14, var5);
                        module0141.$g1671$.rebind(var114_288, var5);
                        module0141.$g1670$.rebind(var39_286, var5);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var114_287, var5);
                    module0141.$g1714$.rebind(var39_285, var5);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var5));
            }
            finally {
                module0139.$g1635$.rebind(var39_284, var5);
            }
            module0139.f9011(module0139.$g1636$.getDynamicValue(var5));
        }
        finally {
            module0139.$g1636$.rebind(var9, var5);
            module0137.$g1605$.rebind(var8, var5);
        }
        return Sequences.nreverse(var6);
    }
    
    public static SubLObject f19297(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        SubLObject var60 = f19195(var58, (SubLObject)module0287.UNPROVIDED);
        SubLObject var61 = (SubLObject)module0287.NIL;
        var61 = var60.first();
        while (module0287.NIL != var60) {
            var59.resetMultipleValues();
            final SubLObject var62 = module0289.f19396(var61);
            final SubLObject var63 = var59.secondMultipleValue();
            var59.resetMultipleValues();
            var59.resetMultipleValues();
            final SubLObject var64 = module0288.f19342(var62, var63);
            final SubLObject var65 = var59.secondMultipleValue();
            var59.resetMultipleValues();
            if (module0287.NIL != var65) {
                return (SubLObject)module0287.T;
            }
            var60 = var60.rest();
            var61 = var60.first();
        }
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19298() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19151", "S#21476", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19152", "S#21745", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19155", "S#21746", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19156", "S#21747", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19154", "S#21748", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19157", "S#21749", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19153", "S#21750", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19160", "S#21751", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19165", "S#21752", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19167", "S#21753", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19169", "S#21754", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19168", "S#21755", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19161", "S#21756", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19171", "S#21757", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19172", "S#21758", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19170", "S#21759", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19173", "S#21760", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19174", "S#21761", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19175", "S#21762", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19176", "S#21763", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19177", "S#21764", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19178", "S#21765", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19179", "S#21766", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19180", "S#21767", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19181", "S#21768", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19182", "S#21769", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19183", "S#21770", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19184", "S#21771", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19185", "S#21772", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19186", "S#21773", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19159", "S#21774", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19188", "S#21775", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19187", "S#21776", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19158", "S#21682", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19189", "S#21777", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19190", "S#21778", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19191", "S#21779", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19192", "S#21780", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19193", "S#21781", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19194", "S#21782", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19197", "S#21783", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19199", "S#21784", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19198", "S#21785", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19200", "S#21786", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19164", "S#21787", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19201", "S#21788", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19202", "S#21789", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19203", "S#21790", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19204", "S#21791", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19205", "S#21792", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19206", "S#21793", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19207", "S#21794", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19195", "SKOLEM-DEFN-ASSERTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19208", "S#21795", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19209", "S#21796", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19210", "S#21797", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19211", "S#21798", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19212", "S#21799", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19213", "S#21800", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19214", "S#21801", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19215", "S#21802", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19216", "S#21803", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19217", "S#21804", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19218", "S#21805", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19219", "S#21806", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19220", "S#21807", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19221", "S#21808", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19222", "S#21809", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19223", "S#21810", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19225", "S#21811", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19226", "S#21812", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19227", "S#21813", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19228", "S#21814", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19229", "S#21815", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19230", "S#21816", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19231", "S#21817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19224", "S#21818", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19232", "S#21819", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19162", "S#21820", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19233", "S#21821", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19163", "S#21822", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19235", "S#13553", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19234", "S#21823", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19236", "S#21824", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19237", "S#21825", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19238", "S#21826", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19239", "S#21827", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19241", "S#21828", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19240", "S#21829", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19242", "S#21830", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19196", "S#21831", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19243", "S#21832", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19244", "S#21833", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19245", "S#21834", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19246", "S#21835", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19247", "S#21836", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19166", "S#21837", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19249", "S#21838", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19250", "S#21839", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19251", "S#21840", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19248", "S#21841", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19252", "S#21842", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19253", "S#21843", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19254", "S#21844", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19255", "S#21845", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19256", "SKOLEM-RULE-HOSED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19257", "S#21846", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19258", "S#21847", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19259", "S#21848", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19260", "S#21849", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19261", "S#21850", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19262", "S#21851", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19263", "S#21852", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19264", "S#21853", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19266", "S#21854", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19267", "S#21855", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19269", "S#21856", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19265", "S#21857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19268", "S#21858", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19270", "S#21859", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19271", "S#21860", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19272", "S#21861", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19273", "S#21862", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19274", "S#21863", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19275", "S#21864", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19277", "S#21865", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19276", "S#21866", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19279", "S#21867", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19278", "S#21868", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19280", "S#21869", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19281", "S#21870", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19282", "S#21871", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19283", "S#21872", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19284", "S#21873", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19285", "S#21874", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19287", "S#21875", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19288", "S#21876", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19289", "S#21877", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19290", "S#21878", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19291", "S#21879", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19292", "S#21880", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19286", "S#21881", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19293", "S#21882", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19294", "S#21883", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19295", "S#21884", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19296", "S#21885", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0287", "f19297", "S#21886", 1, 0, false);
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19299() {
        module0287.$g2638$ = SubLFiles.defparameter("S#21887", (SubLObject)module0287.NIL);
        module0287.$g2639$ = SubLFiles.deflexical("S#21888", (SubLObject)module0287.NIL);
        module0287.$g2640$ = SubLFiles.defparameter("S#21889", (SubLObject)module0287.NIL);
        module0287.$g2641$ = SubLFiles.deflexical("S#21890", (SubLObject)module0287.$ic108$);
        module0287.$g2642$ = SubLFiles.deflexical("S#21891", module0287.$ic109$);
        module0287.$g2643$ = SubLFiles.defparameter("S#21892", (SubLObject)module0287.$ic121$);
        module0287.$g2644$ = SubLFiles.deflexical("S#21893", (SubLObject)module0287.$ic155$);
        return (SubLObject)module0287.NIL;
    }
    
    public static SubLObject f19300() {
        module0034.f1909((SubLObject)module0287.$ic24$);
        module0034.f1895((SubLObject)module0287.$ic112$);
        return (SubLObject)module0287.NIL;
    }
    
    private static SubLObject _constant_109_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-16971619")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9662286")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-45878693")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-27834981")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-12369461")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-10688698")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-45547787")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-31789746")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-26692934")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-48466118")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-60531811")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-29624762")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-22643466")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-29472649")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6535610808")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6391880459")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6069753105")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1836062444")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1140288587")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0975510193")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0417114039")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2399775374")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9741300383")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0828551493")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2588418129")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1857929740")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9771221235")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5248881133")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-30037247")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-60060919")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-10786079")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-14077376")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-55914574")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-16648407")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-44601733")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7913899905")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4396958760")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8020199718")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-20333")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3701677947")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2758282998")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-32592026")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-15476867")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-11623545")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-39071040")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-22133371")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-49114437")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6397777")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-27545347")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-44682034")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-55141454")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-29896988")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-42443574")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-13447977")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-30519480")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-62227276")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-17408839")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-58430677")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-59662976")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-12620975")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9433064")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9205245")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-DepictedGroupMember")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-19625320")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3784346661")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6544284149")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0614825063")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0016213450")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-22649603")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4118636")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-19878232")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-15013378")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-65815517")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-56452378")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-49139121")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-12749049")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2910558946")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2910558946")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8609688279")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3254220233")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4116454483")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9882206036")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7876960574")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7849157406")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0013694801")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3786700124")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1714230847")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7566265665")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8055872557")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6624619390")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4749393956")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9902000475")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2176445673")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9582976901")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-62641426")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-37581079")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9780389")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-51938893")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-33012437")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9412760")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-22314298")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-52903378")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-59517423")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-24705784")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-22566254")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-35236481")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-26725746")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-55356852")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3634339")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-65815517")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-56452378")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-49139121")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-12749049")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4408119749")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3789312666")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0283155048")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9294061441")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4876245588")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2809645919")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1124554131")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0220610914")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4790221775")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1168015263")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4318796173")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1828131226")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2199671088")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9895165404")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6604522774")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6086634185")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0428133650")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7899934995")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0860923384")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4146570201")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0406242321")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4468030352")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8519691249")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6471415053")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6816884555")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2207590761")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4785728462")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6959780810")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2698165023")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1592332182")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9127604959")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3352641286")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9726105841")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0624682876")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9673514545")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1902545429")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6876074534")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8288491486")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4637358284")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0635199939")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4292973565")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7798353664")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-34523039")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-33538847")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-58036047")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9708075")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-13094314")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-27004431")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-47290403")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-49713991")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-40178904")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-62659908")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-61484227")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-35458681")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-17599345")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-53668837")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-24102297")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-32709431")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-51752162")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-35359227")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-20847759")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-51781280")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-51473172")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-36777684")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-27183984")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-24538299")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-51270566")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6498804")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-52375281")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-59156909")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-59507392")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-21555986")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0925186357")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6223276020")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5400448981")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0033649819")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8779626658")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2650598318")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1317366451")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5713244721")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5494021688")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-50021281")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-52700384")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-27017330")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6926447")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-57742011")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-32797409")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-36775099")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8803460")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-11685259")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-49596986")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1515868")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-12425256")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-26526786")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-757265")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-66361621")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-50135687")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-28256974")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-52059331")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-60879947")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-10095100")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-20576203")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-49828332")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-44916076")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-63714570")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3886762")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-14991605")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-35022890")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9692584")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-56789029")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-63331999")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-60839916")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-11805601")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("MarriedCoupleFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-54717125")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-47103024")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-32504795")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-50991035")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-54893967")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4588740")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-34044423")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-23158350")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-26216492")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-23792367")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-26655735")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-36384184")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-28223401")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-30705866")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-31089449")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-43795517")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-54692934")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-62874373")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-13198899")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6598020")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-66712623")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-61590093")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4298210")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-13358052")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1077450")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-27216176")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-28083191")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-539243")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-14104209")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6066610")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-14779626")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1007216")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-49463821")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-764714")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-59277817")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-24473185")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-22799176")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-13378825")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8692086")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-59150515")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6649426")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-18423567")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-61014428")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-612301")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-390407")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-469762")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-57350382")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-550621")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-41449368")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-20918103")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-447007")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1383963")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-348190")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-693803")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-133452")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2813385")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-31097107")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-57888")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-10895131")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-13225721")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-43450038")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-21119958")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-47744038")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-466900")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-46555292")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-23253528")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-924570")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-BandMemPlaying")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-48376054")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-121716")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7364934")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-14760742")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-17172575")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-23584353")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-53200158")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-48653451")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-55897365")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-52891476")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-33105457")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-10518089")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-33158362")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-66304485")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-810295")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-968219")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9855449")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-51029398")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9874778")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-14008069")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-197207")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9176578")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-62825")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-476059")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-366078")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-17345463")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-51339287")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1046930")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-828757")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-51633710")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-19769806")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-46906520")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-20309046")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7477821")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-21294579")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-17746")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-42407080")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-32539269")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-17651656")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-49636199")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-63665039")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-923916")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-41511095")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-402998")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1827166")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-25558723")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-92235")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-24405989")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-37741853")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-681210")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-16612795")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-55392675")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-41395088")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-427687")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-46187940")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-18860364")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-846216")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5393361")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-12316220")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-54217404")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5169399")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-920133")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3247485")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2269494")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-13038949")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-28759634")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-17122972")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-953550")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-906137")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-14962533")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8254998")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-46599863")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-36778441")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-45777401")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-45356858")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-28542904")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-33462840")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-18834377")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-23165858")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-171447")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-38743072")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-62752838")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-46799967")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-38741805")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-22034341")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-49949893")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-750835")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-27330810")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-61593935")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-29534329")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8780298")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-10230735")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-28051850")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-15346572")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-38351646")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-54477051")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-58577410")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-41179398")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9098087")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-464896")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-13765056")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-54796118")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-892012")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5733810632")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9732365118")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8062776921")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9356282252")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7770326773")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9303451156")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7682359700")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0472592080")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5868767078")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6969827182")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8235654414")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9268693067")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4188164665")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3268848892")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3954038304")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8411301306")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6870027660")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2200319382")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8663443543")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6270260084")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7428624994")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6367907452")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7752915649")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4786775108")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5640043419")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6071218505")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3183844767")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7356970316")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4272845489")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5224425512")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3795912959")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7714022869")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8565886278")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0519624184")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4286299680")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3516286017")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8782865500")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4515155650")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5391096127")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8826617065")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6950497514")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4751258604")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3616130689")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7131788917")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4848573733")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2401054776")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0985467323")) });
    }
    
    public void declareFunctions() {
        f19298();
    }
    
    public void initializeVariables() {
        f19299();
    }
    
    public void runTopLevelForms() {
        f19300();
    }
    
    static {
        me = (SubLFile)new module0287();
        module0287.$g2638$ = null;
        module0287.$g2639$ = null;
        module0287.$g2640$ = null;
        module0287.$g2641$ = null;
        module0287.$g2642$ = null;
        module0287.$g2643$ = null;
        module0287.$g2644$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#21772", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#21894", "CYC"));
        $ic1$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LITS"));
        $ic3$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SkolemFunctionFn"));
        $ic4$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SkolemFunction"));
        $ic5$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SkolemFuncN"));
        $ic6$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SkolemFuncNFn"));
        $ic7$ = SubLObjectFactory.makeString("unreified-skolem-term references unknown skolem type: ~s");
        $ic8$ = SubLObjectFactory.makeSymbol("CAR");
        $ic9$ = SubLObjectFactory.makeSymbol("<");
        $ic10$ = SubLObjectFactory.makeSymbol("CDR");
        $ic11$ = SubLObjectFactory.makeString("skolem-args : ~s vs ~s");
        $ic12$ = SubLObjectFactory.makeSymbol("S#15983", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#15984", "CYC");
        $ic14$ = SubLObjectFactory.makeKeyword("TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE");
        $ic15$ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $ic16$ = SubLObjectFactory.makeSymbol("S#15529", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#21748", "CYC");
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#21895", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#21896", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#21897", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#21898", "CYC"));
        $ic19$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("VariableAritySkolemFuncN"));
        $ic20$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("FixedAritySkolemFuncN"));
        $ic21$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("VariableAritySkolemFunction"));
        $ic22$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("FixedAritySkolemFunction"));
        $ic23$ = SubLObjectFactory.makeSymbol("STRING<");
        $ic24$ = SubLObjectFactory.makeSymbol("S#21763", "CYC");
        $ic25$ = SubLObjectFactory.makeKeyword("EL-VAR");
        $ic26$ = SubLObjectFactory.makeSymbol("S#21764", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#21888", "CYC");
        $ic28$ = SubLObjectFactory.makeInteger(512);
        $ic29$ = SubLObjectFactory.makeInteger(64);
        $ic30$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic31$ = SubLObjectFactory.makeSymbol("?X-0");
        $ic32$ = SubLObjectFactory.makeKeyword("MAPPING-DONE");
        $ic33$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#21899", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#21900", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#21901", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"));
        $ic34$ = SubLObjectFactory.makeString("Multiple skolem sequence variables: ~a ~a ~a");
        $ic35$ = SubLObjectFactory.makeString("SkolemFuncN appears as SkolemFunction: ~a");
        $ic36$ = SubLObjectFactory.makeSymbol("?X");
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#21902", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#21772", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#21903", "CYC"));
        $ic38$ = SubLObjectFactory.makeSymbol("FALSE");
        $ic39$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic40$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic41$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic42$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic43$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("skolem"));
        $ic44$ = SubLObjectFactory.makeSymbol("ASSERTION-IST-FORMULA");
        $ic45$ = SubLObjectFactory.makeSymbol("SKOLEM-FUNCTION-P");
        $ic46$ = SubLObjectFactory.makeSymbol("S#12278", "CYC");
        $ic47$ = SubLObjectFactory.makeSymbol("S#16049", "CYC");
        $ic48$ = SubLObjectFactory.makeString("[in gaf-has-corresponding-cnf-in-skolem-defn?] skolem ~s is not a skolem constant");
        $ic49$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic50$ = SubLObjectFactory.makeSymbol("REIFIED-SKOLEM-FN?");
        $ic51$ = SubLObjectFactory.makeSymbol("S#13459", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("DEDUCTION-ASSERTION");
        $ic53$ = SubLObjectFactory.makeSymbol("ASSERTION-FORMULA");
        $ic54$ = SubLObjectFactory.makeSymbol("S#13552", "CYC");
        $ic55$ = SubLObjectFactory.makeString("recomputing-skolem-defn-info-constant called when not recomputing a skolem defn");
        $ic56$ = SubLObjectFactory.makeString("recomputing-skolem-defn-info-var called when not recomputing a skolem defn");
        $ic57$ = SubLObjectFactory.makeString("really-recomputing-skolem-defn? called when not recomputing a skolem defn");
        $ic58$ = SubLObjectFactory.makeString("recomputing-skolem-defn-info-defn called when not recomputing a skolem defn");
        $ic59$ = SubLObjectFactory.makeString("recomputing-skolem-defn-info-key called when not recomputing a skolem defn");
        $ic60$ = SubLObjectFactory.makeString("recomputing-skolem-defn-info-blist called when not recomputing a skolem defn");
        $ic61$ = SubLObjectFactory.makeString("set-recomputing-skolem-defn-result called when not recomputing a skolem defn");
        $ic62$ = SubLObjectFactory.makeString("set-recomputing-skolem-defn-blist called when not recomputing a skolem defn");
        $ic63$ = SubLObjectFactory.makeKeyword("GAF");
        $ic64$ = SubLObjectFactory.makeString("note-skolem-binding called when not recomputing a skolem defn");
        $ic65$ = SubLObjectFactory.makeString("Total KB Skolems: ~a");
        $ic66$ = SubLObjectFactory.makeString("building skolem defn table");
        $ic67$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic68$ = SubLObjectFactory.makeString("~A");
        $ic69$ = SubLObjectFactory.makeString("~%~%reified skolem ~a not known to be an instance of #$SkolemFunction");
        $ic70$ = SubLObjectFactory.makeString("No skolem defn assertions for: ~S");
        $ic71$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("IntervalMinFn"));
        $ic72$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("IntervalMaxFn"));
        $ic73$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ScalarInterval"));
        $ic74$ = SubLObjectFactory.makeKeyword("UNNAMED-SKOLEM-FN");
        $ic75$ = SubLObjectFactory.makeString("~%disjoint result types: ~s : ~s");
        $ic76$ = SubLObjectFactory.makeString("~%explicit result types: ~s : ~s");
        $ic77$ = SubLObjectFactory.makeString("~%tacit result isa: ~s : ~s");
        $ic78$ = SubLObjectFactory.makeString("~%no result types: ~s");
        $ic79$ = SubLObjectFactory.makeString("~%tacit result genl: ~s : ~s");
        $ic80$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLReifiableDenotationalTerm"));
        $ic81$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("NonNegativeScalarInterval")));
        $ic82$ = SubLObjectFactory.makeString("mapping skolem defn table");
        $ic83$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#21904", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#21772", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#21903", "CYC"));
        $ic84$ = SubLObjectFactory.makeString("~%tacit arg ~s type: ~s : ~s");
        $ic85$ = SubLObjectFactory.makeString("~%no arg ~s type: ~s : ~s");
        $ic86$ = SubLObjectFactory.makeString("mapping skolem axiom table");
        $ic87$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10505", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#21905", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#21903", "CYC"));
        $ic88$ = SubLObjectFactory.makeSymbol("S#15480", "CYC");
        $ic89$ = SubLObjectFactory.makeString("fixing skolems w/o mts");
        $ic90$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SKOLEM-DEFN-MISSING"));
        $ic91$ = SubLObjectFactory.makeKeyword("SKOLEM-DEFN-NOT-LIST");
        $ic92$ = SubLObjectFactory.makeKeyword("SKOLEM-DEFN-MAL-LENGTH");
        $ic93$ = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("THIRD"), (SubLObject)SubLObjectFactory.makeSymbol("FOURTH"), (SubLObject)SubLObjectFactory.makeSymbol("S#21906", "CYC"));
        $ic94$ = SubLObjectFactory.makeKeyword("SKOLEM-DEFN-ORTS");
        $ic95$ = SubLObjectFactory.makeKeyword("SKOLEM-DEFN-MAL-SKOLEM-FORT");
        $ic96$ = SubLObjectFactory.makeKeyword("SKOLEM-DEFN-MAL-UNREIFIED-FN-LENGTH");
        $ic97$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#21907", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#21901", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"));
        $ic98$ = SubLObjectFactory.makeKeyword("SKOLEM-DEFN-MAL-SKOLEM-FN-TYPE");
        $ic99$ = SubLObjectFactory.makeKeyword("SKOLEM-DEFN-MAL-SKOLEM-FN-ARGS");
        $ic100$ = SubLObjectFactory.makeKeyword("SKOLEM-DEFN-ARGS-W/O-NUMBER");
        $ic101$ = SubLObjectFactory.makeKeyword("SKOLEM-DEFN-NON-VAR-ARGS");
        $ic102$ = SubLObjectFactory.makeKeyword("SKOLEM-DEFN-MAL-SK-VAR");
        $ic103$ = SubLObjectFactory.makeKeyword("SKOLEM-DEFN-ARGS-SK-TYPE/NUMBER-MISMATCH");
        $ic104$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Unity"));
        $ic105$ = SubLObjectFactory.makeKeyword("SKOLEM-DEFN-OBSOLETE-NUMBER");
        $ic106$ = SubLObjectFactory.makeKeyword("SKOLEM-DEFN-MAL-MT");
        $ic107$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SKOLEM-DEFN-W/O-CLAUSES"));
        $ic108$ = ConsesLow.list(new SubLObject[] { module0128.f8479((SubLObject)SubLObjectFactory.makeString("ThePrototypicalFixedAritySkolemFunction")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4855075916")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9401565")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-30608153")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-358427")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-981029")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-378457")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7897525238")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-23426283")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4978723980")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8095780367")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2283707389")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3819196850")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2177078880")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9178370244")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2313708415")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-54808499")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2396342019")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0540013113")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7329112212")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2463549462")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7267986583")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2341431804")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5635570701")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8712676684")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6439069748")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3035846539")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9609006789")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2094656502")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1622895730")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6034791567")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8429706273")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5002539315")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7731242586")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1935351914")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5819554541")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7665225690")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5742181768")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7774820049")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9832002172")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9099460346")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6802057837")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0233545031")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7143243607")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5547792583")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1970550724")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2043784885")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1714183462")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6071957396")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7004599156")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0633671947")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4928965872")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4365040835")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9778251013")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8146092452")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0882987459")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6693421741")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1800635573")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5174206356")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8137704160")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6138620537")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6954747722")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8822929547")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6574888924")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4648710733")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3574121958")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7111033530")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1259710929")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9511328868")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7988430072")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9334424285")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0241028856")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8824048486")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4709173148")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9085853324")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5615627058")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6491665291")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0256832978")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1494753028")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3439360561")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4359556905")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1746016905")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4430979996")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5792768502")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5965884944")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4975731367")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2918153882")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0992686716")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8537516687")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7685719048")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1488659619")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9837174340")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0372211184")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6796242698")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4631282123")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8747036173")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9214557550")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2969771224")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3201009743")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8199787846")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1857924337")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2577476768")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9606922473")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3890236588")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2976547342")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2734536924")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4107434815")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8121330546")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0714339318")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3616130689")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4918966")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-12370394")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-58467056")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-61049284")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-14302329")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4779393528")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1305979122")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3277105")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-23116387")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-55356852")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4332265")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-DepictedFamilyMem2")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-38156889")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-DepictedFamilyMem1")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0858093676")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7924901403")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7033956451")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4442841559")) });
        $ic109$ = _constant_109_initializer();
        $ic110$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic111$ = SubLObjectFactory.makeString("~a ~a ~s~%");
        $ic112$ = SubLObjectFactory.makeSymbol("S#21866", "CYC");
        $ic113$ = SubLObjectFactory.makeKeyword("PARTIALLY-UNFINDABLE");
        $ic114$ = SubLObjectFactory.makeKeyword("UNFINDABLE");
        $ic115$ = SubLObjectFactory.makeKeyword("FREE-VARIABLE");
        $ic116$ = SubLObjectFactory.makeKeyword("MULTIPLE-MTS");
        $ic117$ = SubLObjectFactory.makeKeyword("RAW-SKOLEM");
        $ic118$ = SubLObjectFactory.makeKeyword("UNREIFIED-SKOLEM");
        $ic119$ = SubLObjectFactory.makeKeyword("KNOWN-ISSUE");
        $ic120$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RAW-SKOLEM"), (SubLObject)SubLObjectFactory.makeKeyword("UNREIFIED-SKOLEM"), (SubLObject)SubLObjectFactory.makeKeyword("FREE-VARIABLE"));
        $ic121$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic122$ = SubLObjectFactory.makeString("different el formulas for ~a:~%~s~%~s");
        $ic123$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#21870", "CYC")));
        $ic124$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#21870", "CYC"))));
        $ic125$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#21870", "CYC")))));
        $ic126$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#21870", "CYC"))));
        $ic127$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#21870", "CYC")))));
        $ic128$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#21870", "CYC"))))));
        $ic129$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#15563", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("GROUND?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#21870", "CYC"))));
        $ic130$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#15513", "CYC")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("temporalMicrotheoriesIntersect")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))));
        $ic131$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("temporalMicrotheoriesIntersect")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#15513", "CYC")));
        $ic132$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic133$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#21899", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#21900", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"));
        $ic134$ = SubLObjectFactory.makeString("Skolem type mismatch: ~a ~a ~a");
        $ic135$ = SubLObjectFactory.makeString("");
        $ic136$ = SubLObjectFactory.makeString("temporalMicrotheoriesIntersect ");
        $ic137$ = SubLObjectFactory.makeString("~%~amismatch for ~a~%~a~%~a~%");
        $ic138$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#21908", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#16447", "CYC"));
        $ic139$ = SubLObjectFactory.makeString("Error");
        $ic140$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#21908", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#16447", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#21909", "CYC"));
        $ic141$ = SubLObjectFactory.makeSymbol("S#21831", "CYC");
        $ic142$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#21910", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#21911", "CYC"));
        $ic143$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("temporalMicrotheoriesIntersect"));
        $ic144$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#21912", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#21913", "CYC"));
        $ic145$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $ic146$ = SubLObjectFactory.makeSymbol("?TIME");
        $ic147$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic148$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtSpace"));
        $ic149$ = ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtTimeDimFn")), (SubLObject)SubLObjectFactory.makeSymbol("?TIME")));
        $ic150$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("and"));
        $ic151$ = ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("temporalMicrotheoriesIntersect")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtTimeDimFn")), (SubLObject)SubLObjectFactory.makeSymbol("?TIME")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtTimeWithGranularityDimFn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Now-Indexical"))), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimePoint")))));
        $ic152$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic153$ = ConsesLow.list(new SubLObject[] { module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2172650888")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6548862369")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8409811003")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7363528201")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1358114357")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4072021064")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1681761679")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2548755082")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6067931751")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5709128133")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1590734700")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5134195828")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3907269039")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6454474627")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9567857250")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5128698501")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0849952130")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5716409094")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9715593487")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4012481774")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9973400181")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4749210628")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7688139609")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7103881989")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5296958920")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9684239747")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9283857452")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8076090600")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8853185369")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2870709283")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4865105368")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6632523431")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8236383708")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0341790583")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5342612010")) });
        $ic154$ = SubLObjectFactory.makeString("recanonicalizing skolems");
        $ic155$ = ConsesLow.list(new SubLObject[] { module0128.f8479((SubLObject)SubLObjectFactory.makeString("ThePrototypicalFixedAritySkolemFunction")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4855075916")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9401565")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-30608153")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-358427")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-981029")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-378457")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7897525238")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-23426283")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4978723980")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8095780367")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2283707389")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3819196850")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2177078880")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9178370244")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2313708415")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-54808499")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2396342019")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0540013113")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7329112212")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2463549462")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7267986583")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2341431804")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5635570701")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8712676684")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6439069748")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3035846539")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9609006789")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2094656502")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1622895730")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6034791567")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8429706273")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5002539315")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7731242586")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1935351914")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5819554541")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7665225690")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5742181768")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7774820049")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9832002172")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9099460346")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6802057837")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0233545031")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7143243607")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5547792583")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1970550724")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2043784885")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1714183462")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6071957396")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7004599156")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0633671947")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4928965872")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4365040835")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9778251013")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8146092452")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0882987459")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6693421741")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1800635573")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5174206356")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8137704160")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6138620537")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6954747722")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8822929547")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6574888924")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4648710733")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3574121958")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7111033530")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1259710929")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9511328868")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7988430072")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9334424285")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0241028856")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8824048486")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4709173148")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9085853324")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5615627058")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6491665291")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0256832978")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1494753028")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3439360561")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4359556905")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1746016905")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4430979996")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5792768502")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5965884944")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4975731367")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2918153882")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0992686716")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8537516687")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7685719048")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1488659619")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9837174340")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0372211184")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6796242698")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4631282123")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8747036173")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9214557550")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2969771224")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3201009743")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8199787846")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1857924337")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2577476768")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9606922473")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3890236588")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2976547342")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-2734536924")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4107434815")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8121330546")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0714339318")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3616130689")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4918966")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-12370394")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-58467056")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-61049284")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-14302329")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4779393528")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1305979122")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-0519624184")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8565886278")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5224425512")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4272845489")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-8653559423")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6875965541")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3326030935")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-5171360072")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-1849376525")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9027182255")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9111966754")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-3322944904")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-6974073305")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-9804613947")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4372359165")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-59006438")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-7033956451")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKF-4442841559")) });
        $ic156$ = SubLObjectFactory.makeKeyword("BREADTH");
        $ic157$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic158$ = SubLObjectFactory.makeKeyword("STACK");
        $ic159$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic160$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic161$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic162$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic163$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic164$ = SubLObjectFactory.makeString("continue anyway");
        $ic165$ = SubLObjectFactory.makeKeyword("WARN");
        $ic166$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic167$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic168$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic169$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#4D5E436"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1526883"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#15AA083"));
        $ic170$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0287.class
	Total time: 2255 ms
	
	Decompiled with Procyon 0.5.32.
*/