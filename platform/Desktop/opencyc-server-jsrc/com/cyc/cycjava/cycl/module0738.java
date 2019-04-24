package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0738 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0738";
    public static final String myFingerPrint = "b148dbc86a6425325bfae794406f0d43a764230094d2878fd4e1cd8c675b33a1";
    public static SubLSymbol $g5863$;
    public static SubLSymbol $g5864$;
    private static SubLSymbol $g5865$;
    private static SubLSymbol $g5866$;
    private static SubLSymbol $g5867$;
    private static SubLSymbol $g5868$;
    private static SubLSymbol $g5869$;
    private static SubLSymbol $g5870$;
    public static SubLSymbol $g5871$;
    public static SubLSymbol $g5872$;
    public static SubLSymbol $g5873$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
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
    private static final SubLList $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLInteger $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLObject $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLString $ic61$;
    private static final SubLObject $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLObject $ic65$;
    private static final SubLObject $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLObject $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLList $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLList $ic86$;
    private static final SubLString $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLInteger $ic89$;
    private static final SubLObject $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLObject $ic92$;
    private static final SubLList $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLList $ic99$;
    private static final SubLString $ic100$;
    private static final SubLList $ic101$;
    private static final SubLList $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLList $ic112$;
    private static final SubLList $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLList $ic115$;
    private static final SubLObject $ic116$;
    private static final SubLObject $ic117$;
    private static final SubLObject $ic118$;
    private static final SubLObject $ic119$;
    private static final SubLString $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLList $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLString $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLList $ic127$;
    private static final SubLList $ic128$;
    private static final SubLList $ic129$;
    private static final SubLList $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLList $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLString $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLString $ic151$;
    private static final SubLString $ic152$;
    private static final SubLList $ic153$;
    private static final SubLList $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLString $ic164$;
    private static final SubLString $ic165$;
    private static final SubLInteger $ic166$;
    private static final SubLString $ic167$;
    private static final SubLObject $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLString $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLString $ic174$;
    private static final SubLString $ic175$;
    private static final SubLSymbol $ic176$;
    
    public static SubLObject f45731(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0738.$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0738.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0738.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0738.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0738.NIL;
        SubLObject var10_11 = (SubLObject)module0738.NIL;
        while (module0738.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0738.$ic0$);
            var10_11 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0738.$ic0$);
            if (module0738.NIL == conses_high.member(var10_11, (SubLObject)module0738.$ic1$, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED)) {
                var9 = (SubLObject)module0738.T;
            }
            if (var10_11 == module0738.$ic2$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0738.NIL != var9 && module0738.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0738.$ic0$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0738.$ic3$, var4);
        final SubLObject var11 = (SubLObject)((module0738.NIL != var10) ? conses_high.cadr(var10) : module0738.NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0738.$ic4$, var4);
        final SubLObject var13 = (SubLObject)((module0738.NIL != var12) ? conses_high.cadr(var12) : module0738.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)module0738.$ic5$;
        final SubLObject var16 = (SubLObject)module0738.$ic6$;
        if (module0738.NIL != var11) {
            return (SubLObject)ConsesLow.list((SubLObject)module0738.$ic7$, (SubLObject)ConsesLow.list(var15, var16, (SubLObject)module0738.$ic4$, var13), (SubLObject)ConsesLow.listS((SubLObject)module0738.$ic8$, (SubLObject)ConsesLow.list(var6, var16, var13), (SubLObject)ConsesLow.list((SubLObject)module0738.$ic9$, var11, (SubLObject)ConsesLow.list((SubLObject)module0738.$ic10$, var6)), ConsesLow.append(var14, (SubLObject)module0738.NIL)));
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0738.$ic7$, (SubLObject)ConsesLow.list(var15, var16, (SubLObject)module0738.$ic4$, var13), (SubLObject)ConsesLow.listS((SubLObject)module0738.$ic8$, (SubLObject)ConsesLow.list(var6, var16, var13), ConsesLow.append(var14, (SubLObject)module0738.NIL)));
    }
    
    public static SubLObject f45732(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0738.$ic11$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0738.NIL;
        SubLObject var7 = (SubLObject)module0738.NIL;
        SubLObject var8 = (SubLObject)module0738.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0738.$ic11$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0738.$ic11$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0738.$ic11$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0738.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0738.NIL;
        SubLObject var27_28 = (SubLObject)module0738.NIL;
        while (module0738.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0738.$ic11$);
            var27_28 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0738.$ic11$);
            if (module0738.NIL == conses_high.member(var27_28, (SubLObject)module0738.$ic12$, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED)) {
                var11 = (SubLObject)module0738.T;
            }
            if (var27_28 == module0738.$ic2$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0738.NIL != var11 && module0738.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0738.$ic11$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0738.$ic13$, var4);
        final SubLObject var13 = (SubLObject)((module0738.NIL != var12) ? conses_high.cadr(var12) : module0738.$ic14$);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0738.$ic15$, var4);
        final SubLObject var15 = (SubLObject)((module0738.NIL != var14) ? conses_high.cadr(var14) : module0738.T);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)module0738.$ic16$, var4);
        final SubLObject var17 = (SubLObject)((module0738.NIL != var16) ? conses_high.cadr(var16) : module0738.$ic17$);
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)module0738.$ic18$, var4);
        final SubLObject var19 = (SubLObject)((module0738.NIL != var18) ? conses_high.cadr(var18) : module0738.$ic19$);
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)module0738.$ic20$, var4);
        final SubLObject var21 = (SubLObject)((module0738.NIL != var20) ? conses_high.cadr(var20) : module0738.NIL);
        final SubLObject var22;
        var4 = (var22 = var5);
        final SubLObject var23 = (SubLObject)module0738.$ic21$;
        return (SubLObject)ConsesLow.list((SubLObject)module0738.$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0738.$ic23$, var8), (SubLObject)ConsesLow.list(var23, (SubLObject)ConsesLow.list((SubLObject)module0738.$ic24$, var7, var19, var21))), (SubLObject)ConsesLow.list((SubLObject)module0738.$ic25$, (SubLObject)ConsesLow.list(var6, var23), (SubLObject)ConsesLow.listS((SubLObject)module0738.$ic26$, (SubLObject)ConsesLow.list((SubLObject)module0738.$ic27$, (SubLObject)ConsesLow.list((SubLObject)module0738.$ic28$, (SubLObject)ConsesLow.list((SubLObject)module0738.EQ, (SubLObject)module0738.$ic14$, var13), (SubLObject)ConsesLow.list((SubLObject)module0738.EQ, (SubLObject)ConsesLow.list((SubLObject)module0738.$ic29$, var6), var13)), (SubLObject)ConsesLow.list((SubLObject)module0738.$ic30$, var15, (SubLObject)ConsesLow.list((SubLObject)module0738.$ic31$, (SubLObject)ConsesLow.list((SubLObject)module0738.$ic32$, var7), var6, var7)), (SubLObject)ConsesLow.list((SubLObject)module0738.$ic33$, var17, var6)), ConsesLow.append(var22, (SubLObject)module0738.NIL))));
    }
    
    public static SubLObject f45733(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0738.$ic34$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0738.NIL;
        SubLObject var7 = (SubLObject)module0738.NIL;
        SubLObject var8 = (SubLObject)module0738.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0738.$ic34$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0738.$ic34$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0738.$ic34$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0738.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0738.NIL;
        SubLObject var45_46 = (SubLObject)module0738.NIL;
        while (module0738.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0738.$ic34$);
            var45_46 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0738.$ic34$);
            if (module0738.NIL == conses_high.member(var45_46, (SubLObject)module0738.$ic35$, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED)) {
                var11 = (SubLObject)module0738.T;
            }
            if (var45_46 == module0738.$ic2$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0738.NIL != var11 && module0738.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0738.$ic34$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0738.$ic15$, var4);
        final SubLObject var13 = (SubLObject)((module0738.NIL != var12) ? conses_high.cadr(var12) : module0738.T);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0738.$ic16$, var4);
        final SubLObject var15 = (SubLObject)((module0738.NIL != var14) ? conses_high.cadr(var14) : module0738.$ic17$);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)module0738.$ic18$, var4);
        final SubLObject var17 = (SubLObject)((module0738.NIL != var16) ? conses_high.cadr(var16) : module0738.$ic19$);
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)module0738.$ic20$, var4);
        final SubLObject var19 = (SubLObject)((module0738.NIL != var18) ? conses_high.cadr(var18) : module0738.NIL);
        final SubLObject var20;
        var4 = (var20 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)module0738.$ic36$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, var8, module0738.$ic13$, module0738.$ic37$, module0738.$ic16$, var15, module0738.$ic15$, var13, module0738.$ic18$, var17, module0738.$ic20$, var19 }), ConsesLow.append(var20, (SubLObject)module0738.NIL));
    }
    
    public static SubLObject f45734(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0738.$ic38$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0738.NIL;
        SubLObject var7 = (SubLObject)module0738.NIL;
        SubLObject var8 = (SubLObject)module0738.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0738.$ic38$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0738.$ic38$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0738.$ic38$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0738.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0738.NIL;
        SubLObject var57_58 = (SubLObject)module0738.NIL;
        while (module0738.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0738.$ic38$);
            var57_58 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0738.$ic38$);
            if (module0738.NIL == conses_high.member(var57_58, (SubLObject)module0738.$ic39$, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED)) {
                var11 = (SubLObject)module0738.T;
            }
            if (var57_58 == module0738.$ic2$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0738.NIL != var11 && module0738.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0738.$ic38$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0738.$ic15$, var4);
        final SubLObject var13 = (SubLObject)((module0738.NIL != var12) ? conses_high.cadr(var12) : module0738.NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0738.$ic16$, var4);
        final SubLObject var15 = (SubLObject)((module0738.NIL != var14) ? conses_high.cadr(var14) : module0738.$ic17$);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)module0738.$ic18$, var4);
        final SubLObject var17 = (SubLObject)((module0738.NIL != var16) ? conses_high.cadr(var16) : module0738.$ic19$);
        final SubLObject var18;
        var4 = (var18 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)module0738.$ic36$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, var8, module0738.$ic13$, module0738.$ic40$, module0738.$ic16$, var15, module0738.$ic15$, var13, module0738.$ic18$, var17 }), ConsesLow.append(var18, (SubLObject)module0738.NIL));
    }
    
    public static SubLObject f45735(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0738.NIL;
        SubLObject var6 = (SubLObject)module0738.NIL;
        SubLObject var7 = (SubLObject)module0738.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0738.$ic41$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0738.$ic41$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0738.$ic41$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0738.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0738.NIL;
        SubLObject var70_71 = (SubLObject)module0738.NIL;
        while (module0738.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0738.$ic41$);
            var70_71 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0738.$ic41$);
            if (module0738.NIL == conses_high.member(var70_71, (SubLObject)module0738.$ic42$, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED)) {
                var10 = (SubLObject)module0738.T;
            }
            if (var70_71 == module0738.$ic2$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0738.NIL != var10 && module0738.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0738.$ic41$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0738.$ic43$, var4);
        final SubLObject var12 = (SubLObject)((module0738.NIL != var11) ? conses_high.cadr(var11) : module0738.NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0738.$ic44$, var4);
        final SubLObject var14 = (SubLObject)((module0738.NIL != var13) ? conses_high.cadr(var13) : module0738.NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)module0738.$ic45$, var4);
        final SubLObject var16 = (SubLObject)((module0738.NIL != var15) ? conses_high.cadr(var15) : module0738.$ic46$);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)module0738.$ic47$, var4);
        final SubLObject var18 = (SubLObject)((module0738.NIL != var17) ? conses_high.cadr(var17) : module0738.NIL);
        return (SubLObject)ConsesLow.list((SubLObject)module0738.$ic48$, (SubLObject)ConsesLow.list(var6, var7), (SubLObject)ConsesLow.list((SubLObject)module0738.$ic49$, var5, var6, var7, var12, var14, var16, var18));
    }
    
    public static SubLObject f45736(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0738.NIL;
        SubLObject var6 = (SubLObject)module0738.NIL;
        SubLObject var7 = (SubLObject)module0738.NIL;
        SubLObject var8 = (SubLObject)module0738.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0738.$ic50$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0738.$ic50$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0738.$ic50$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0738.$ic50$);
        var8 = var4.first();
        var4 = var4.rest();
        if (module0738.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0738.$ic48$, (SubLObject)ConsesLow.list(var6, var8), (SubLObject)ConsesLow.list((SubLObject)module0738.$ic51$, var5, var6, var7, var8));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0738.$ic50$);
        return (SubLObject)module0738.NIL;
    }
    
    public static SubLObject f45737(final SubLObject var13, final SubLObject var84, SubLObject var34, SubLObject var23) {
        if (var34 == module0738.UNPROVIDED) {
            var34 = module0584.$g4389$.getDynamicValue();
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        SubLObject var86 = (SubLObject)module0738.NIL;
        final SubLObject var87 = module0584.$g4396$.currentBinding(var85);
        try {
            module0584.$g4396$.bind(var23, var85);
            final SubLObject var88 = f45738(var13, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED);
            final SubLObject var89 = f45739(var13);
            if (module0738.NIL == var86) {
                SubLObject var90 = var88;
                SubLObject var91 = (SubLObject)module0738.NIL;
                var91 = var90.first();
                while (module0738.NIL == var86 && module0738.NIL != var90) {
                    if (module0738.NIL != module0737.f45321(var91, (SubLObject)module0738.UNPROVIDED) && module0738.NIL != f45740(var89, var91, var13) && module0738.NIL != module0731.f44713(module0737.f45358(var91), var84, (SubLObject)module0738.UNPROVIDED) && module0738.NIL != f45741(var34, var91)) {
                        var86 = (SubLObject)module0738.T;
                    }
                    var90 = var90.rest();
                    var91 = var90.first();
                }
            }
        }
        finally {
            module0584.$g4396$.rebind(var87, var85);
        }
        return var86;
    }
    
    public static SubLObject f45742(final SubLObject var13, final SubLObject var84, SubLObject var34, SubLObject var23) {
        if (var34 == module0738.UNPROVIDED) {
            var34 = module0584.$g4389$.getDynamicValue();
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        final SubLObject var86 = module0034.$g879$.getDynamicValue(var85);
        SubLObject var87 = (SubLObject)module0738.NIL;
        if (module0738.NIL == var86) {
            return f45737(var13, var84, var34, var23);
        }
        var87 = module0034.f1857(var86, (SubLObject)module0738.$ic52$, (SubLObject)module0738.UNPROVIDED);
        if (module0738.NIL == var87) {
            var87 = module0034.f1807(module0034.f1842(var86), (SubLObject)module0738.$ic52$, (SubLObject)module0738.FOUR_INTEGER, (SubLObject)module0738.$ic53$, (SubLObject)module0738.EQUAL, (SubLObject)module0738.UNPROVIDED);
            module0034.f1860(var86, (SubLObject)module0738.$ic52$, var87);
        }
        final SubLObject var88 = module0034.f1780(var13, var84, var34, var23);
        final SubLObject var89 = module0034.f1814(var87, var88, (SubLObject)module0738.UNPROVIDED);
        if (var89 != module0738.$ic54$) {
            SubLObject var90 = var89;
            SubLObject var91 = (SubLObject)module0738.NIL;
            var91 = var90.first();
            while (module0738.NIL != var90) {
                SubLObject var92 = var91.first();
                final SubLObject var93 = conses_high.second(var91);
                if (var13.equal(var92.first())) {
                    var92 = var92.rest();
                    if (var84.equal(var92.first())) {
                        var92 = var92.rest();
                        if (var34.equal(var92.first())) {
                            var92 = var92.rest();
                            if (module0738.NIL != var92 && module0738.NIL == var92.rest() && var23.equal(var92.first())) {
                                return module0034.f1959(var93);
                            }
                        }
                    }
                }
                var90 = var90.rest();
                var91 = var90.first();
            }
        }
        final SubLObject var94 = Values.arg2(var85.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45737(var13, var84, var34, var23)));
        module0034.f1836(var87, var88, var89, var94, (SubLObject)ConsesLow.list(var13, var84, var34, var23));
        return module0034.f1959(var94);
    }
    
    public static SubLObject f45743(final SubLObject var13, SubLObject var34, SubLObject var23, SubLObject var36) {
        if (var34 == module0738.UNPROVIDED) {
            var34 = module0584.$g4389$.getDynamicValue();
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLThread var37 = SubLProcess.currentSubLThread();
        SubLObject var38 = (SubLObject)module0738.NIL;
        final SubLObject var39 = module0584.$g4396$.currentBinding(var37);
        try {
            module0584.$g4396$.bind(var23, var37);
            SubLObject var41;
            final SubLObject var40 = var41 = f45738(var13, var36, (SubLObject)module0738.NIL);
            SubLObject var42 = (SubLObject)module0738.NIL;
            var42 = var41.first();
            while (module0738.NIL != var41) {
                if ((module0738.$ic14$ == module0738.$ic37$ || module0737.f45335(var42) == module0738.$ic37$) && module0738.NIL != f45740(f45739(var13), var42, var13) && module0738.NIL != f45741(var34, var42) && module0738.NIL != module0737.f45495(var42, (SubLObject)module0738.UNPROVIDED) && module0738.NIL != module0737.f45517(var42)) {
                    final SubLObject var43 = module0737.f45495(var42, (SubLObject)module0738.UNPROVIDED);
                    if (module0738.NIL != var43) {
                        final SubLObject var44 = var43;
                        if (module0738.NIL == conses_high.member(var44, var38, Symbols.symbol_function((SubLObject)module0738.EQL), Symbols.symbol_function((SubLObject)module0738.IDENTITY))) {
                            var38 = (SubLObject)ConsesLow.cons(var44, var38);
                        }
                    }
                }
                var41 = var41.rest();
                var42 = var41.first();
            }
        }
        finally {
            module0584.$g4396$.rebind(var39, var37);
        }
        return var38;
    }
    
    public static SubLObject f45744(final SubLObject var13, final SubLObject var103, SubLObject var34, SubLObject var23, SubLObject var36) {
        if (var34 == module0738.UNPROVIDED) {
            var34 = module0584.$g4389$.getDynamicValue();
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLThread var104 = SubLProcess.currentSubLThread();
        SubLObject var105 = (SubLObject)module0738.NIL;
        final SubLObject var106 = module0584.$g4396$.currentBinding(var104);
        try {
            module0584.$g4396$.bind(var23, var104);
            SubLObject var108;
            final SubLObject var107 = var108 = f45738(var13, var36, (SubLObject)module0738.NIL);
            SubLObject var109 = (SubLObject)module0738.NIL;
            var109 = var108.first();
            while (module0738.NIL != var108) {
                if ((module0738.$ic14$ == module0738.$ic37$ || module0737.f45335(var109) == module0738.$ic37$) && module0738.NIL != f45740(f45739(var13), var109, var13) && module0738.NIL != f45741(var34, var109) && module0738.NIL != f45745(var103, module0737.f45360(var109)) && module0738.NIL != module0737.f45517(var109)) {
                    final SubLObject var110 = module0737.f45495(var109, (SubLObject)module0738.UNPROVIDED);
                    if (module0738.NIL != var110) {
                        final SubLObject var111 = var110;
                        if (module0738.NIL == conses_high.member(var111, var105, Symbols.symbol_function((SubLObject)module0738.EQL), Symbols.symbol_function((SubLObject)module0738.IDENTITY))) {
                            var105 = (SubLObject)ConsesLow.cons(var111, var105);
                        }
                    }
                }
                var108 = var108.rest();
                var109 = var108.first();
            }
        }
        finally {
            module0584.$g4396$.rebind(var106, var104);
        }
        return var105;
    }
    
    public static SubLObject f45746(final SubLObject var13, final SubLObject var104, SubLObject var34, SubLObject var23, SubLObject var36) {
        if (var34 == module0738.UNPROVIDED) {
            var34 = module0584.$g4389$.getDynamicValue();
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLThread var105 = SubLProcess.currentSubLThread();
        final SubLObject var106 = module0731.f44736(var104, (SubLObject)module0738.UNPROVIDED);
        SubLObject var107 = (SubLObject)module0738.NIL;
        SubLObject var108 = (SubLObject)module0738.NIL;
        SubLObject var109 = (SubLObject)module0738.NIL;
        final SubLObject var110 = module0584.$g4396$.currentBinding(var105);
        try {
            module0584.$g4396$.bind(var23, var105);
            SubLObject var112;
            final SubLObject var111 = var112 = f45738(var13, var36, (SubLObject)module0738.NIL);
            SubLObject var113 = (SubLObject)module0738.NIL;
            var113 = var112.first();
            while (module0738.NIL != var112) {
                if ((module0738.$ic14$ == module0738.$ic37$ || module0737.f45335(var113) == module0738.$ic37$) && module0738.NIL != f45740(f45739(var13), var113, var13) && module0738.NIL != f45741(var34, var113)) {
                    final SubLObject var114 = module0737.f45495(var113, (SubLObject)module0738.UNPROVIDED);
                    if (module0738.NIL != var114 && module0738.NIL != module0731.f44886(module0737.f45358(var113), var106) && module0738.NIL != module0737.f45517(var113)) {
                        final SubLObject var115 = module0737.f45373(var113, (SubLObject)module0738.UNPROVIDED);
                        final SubLObject var116 = var114;
                        SubLObject var94_111 = module0737.f45360(var113);
                        SubLObject var117 = (SubLObject)module0738.NIL;
                        var117 = var94_111.first();
                        while (module0738.NIL != var94_111) {
                            SubLObject var118 = (SubLObject)module0738.NIL;
                            if (module0738.NIL == var118) {
                                SubLObject var119;
                                SubLObject var114_115;
                                SubLObject var120;
                                SubLObject var117_118;
                                SubLObject var121;
                                SubLObject var120_121;
                                for (var119 = (SubLObject)module0738.NIL, var114_115 = (SubLObject)module0738.NIL, var120 = (SubLObject)module0738.NIL, var117_118 = (SubLObject)module0738.NIL, var121 = (SubLObject)module0738.NIL, var120_121 = (SubLObject)module0738.NIL, var119 = var107, var114_115 = var119.first(), var120 = var109, var117_118 = var120.first(), var121 = var108, var120_121 = var121.first(); module0738.NIL == var118 && (module0738.NIL != var121 || module0738.NIL != var120 || module0738.NIL != var119); var118 = (SubLObject)SubLObjectFactory.makeBoolean(var116.equal(var114_115) && var115.equal(var117_118) && var117.equal(var120_121)), var119 = var119.rest(), var114_115 = var119.first(), var120 = var120.rest(), var117_118 = var120.first(), var121 = var121.rest(), var120_121 = var121.first()) {}
                            }
                            if (module0738.NIL == var118) {
                                var107 = (SubLObject)ConsesLow.cons(var114, var107);
                                var109 = (SubLObject)ConsesLow.cons(var115, var109);
                                var108 = (SubLObject)ConsesLow.cons(var117.eql(module0738.$ic55$) ? module0737.f45358(var113) : var117, var108);
                            }
                            var94_111 = var94_111.rest();
                            var117 = var94_111.first();
                        }
                    }
                }
                var112 = var112.rest();
                var113 = var112.first();
            }
        }
        finally {
            module0584.$g4396$.rebind(var110, var105);
        }
        return Values.values(var107, var108, var109);
    }
    
    public static SubLObject f45747(final SubLObject var13, final SubLObject var84, SubLObject var34, SubLObject var23, SubLObject var36) {
        if (var34 == module0738.UNPROVIDED) {
            var34 = module0584.$g4389$.getDynamicValue();
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        SubLObject var86 = (SubLObject)module0738.NIL;
        SubLObject var87 = (SubLObject)module0738.NIL;
        final SubLObject var88 = module0584.$g4396$.currentBinding(var85);
        try {
            module0584.$g4396$.bind(var23, var85);
            SubLObject var90;
            final SubLObject var89 = var90 = f45738(var13, var36, (SubLObject)module0738.NIL);
            SubLObject var91 = (SubLObject)module0738.NIL;
            var91 = var90.first();
            while (module0738.NIL != var90) {
                if ((module0738.$ic14$ == module0738.$ic37$ || module0737.f45335(var91) == module0738.$ic37$) && module0738.NIL != f45740(f45739(var13), var91, var13) && module0738.NIL != f45741(var34, var91)) {
                    final SubLObject var92 = module0737.f45495(var91, (SubLObject)module0738.UNPROVIDED);
                    if (module0738.NIL != var92 && module0738.NIL != module0731.f44713(module0737.f45358(var91), var84, (SubLObject)module0738.UNPROVIDED) && module0738.NIL != module0737.f45517(var91)) {
                        final SubLObject var93 = module0737.f45360(var91);
                        final SubLObject var94 = (SubLObject)ConsesLow.make_list(conses_high.list_length(var93), var92);
                        var86 = ConsesLow.append(var94, var86);
                        var87 = ConsesLow.append(Sequences.substitute(module0737.f45358(var91), module0738.$ic55$, var93, Symbols.symbol_function((SubLObject)module0738.EQUAL), (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED), var87);
                    }
                }
                var90 = var90.rest();
                var91 = var90.first();
            }
        }
        finally {
            module0584.$g4396$.rebind(var88, var85);
        }
        SubLObject var95 = (SubLObject)module0738.NIL;
        SubLObject var96 = (SubLObject)module0738.NIL;
        SubLObject var97 = (SubLObject)module0738.NIL;
        SubLObject var98;
        SubLObject var99;
        SubLObject var100;
        SubLObject var101;
        for (var98 = Sequences.length(var86), var99 = (SubLObject)module0738.NIL, var99 = (SubLObject)module0738.ZERO_INTEGER; var99.numL(var98); var99 = Numbers.add(var99, (SubLObject)module0738.ONE_INTEGER)) {
            var100 = ConsesLow.nth(var99, var86);
            var101 = ConsesLow.nth(var99, var87);
            if (!module0035.f2293(var95, var100, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED).eql(var101)) {
                var96 = (SubLObject)ConsesLow.cons(var100, var96);
                var97 = (SubLObject)ConsesLow.cons(var101, var97);
                var95 = module0035.f2063(var95, var100, var101, (SubLObject)module0738.UNPROVIDED);
            }
        }
        return Values.values(var96, var97);
    }
    
    public static SubLObject f45748(final SubLObject var13, final SubLObject var129, SubLObject var34, SubLObject var23, SubLObject var36) {
        if (var34 == module0738.UNPROVIDED) {
            var34 = module0584.$g4389$.getDynamicValue();
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLThread var130 = SubLProcess.currentSubLThread();
        SubLObject var131 = (SubLObject)module0738.NIL;
        final SubLObject var132 = module0584.$g4396$.currentBinding(var130);
        try {
            module0584.$g4396$.bind(var23, var130);
            SubLObject var134;
            final SubLObject var133 = var134 = f45738(var13, var36, (SubLObject)module0738.NIL);
            SubLObject var135 = (SubLObject)module0738.NIL;
            var135 = var134.first();
            while (module0738.NIL != var134) {
                if ((module0738.$ic14$ == module0738.$ic37$ || module0737.f45335(var135) == module0738.$ic37$) && module0738.NIL != f45740(f45739(var13), var135, var13) && module0738.NIL != f45741(var34, var135) && module0737.f45495(var135, (SubLObject)module0738.UNPROVIDED).equal(var129)) {
                    var131 = conses_high.union(module0737.f45360(var135), var131, Symbols.symbol_function((SubLObject)module0738.EQUAL), (SubLObject)module0738.UNPROVIDED);
                }
                var134 = var134.rest();
                var135 = var134.first();
            }
        }
        finally {
            module0584.$g4396$.rebind(var132, var130);
        }
        return var131;
    }
    
    public static SubLObject f45749(final SubLObject var13, SubLObject var34, SubLObject var23, SubLObject var36) {
        if (var34 == module0738.UNPROVIDED) {
            var34 = module0584.$g4389$.getDynamicValue();
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLThread var37 = SubLProcess.currentSubLThread();
        SubLObject var38 = (SubLObject)module0738.NIL;
        final SubLObject var39 = module0584.$g4396$.currentBinding(var37);
        try {
            module0584.$g4396$.bind(var23, var37);
            SubLObject var41;
            final SubLObject var40 = var41 = f45738(var13, var36, (SubLObject)module0738.NIL);
            SubLObject var42 = (SubLObject)module0738.NIL;
            var42 = var41.first();
            while (module0738.NIL != var41) {
                if ((module0738.$ic14$ == module0738.$ic37$ || module0737.f45335(var42) == module0738.$ic37$) && module0738.NIL != f45740(f45739(var13), var42, var13) && module0738.NIL != f45741(var34, var42)) {
                    var38 = conses_high.union(module0737.f45360(var42), var38, Symbols.symbol_function((SubLObject)module0738.EQUAL), (SubLObject)module0738.UNPROVIDED);
                }
                var41 = var41.rest();
                var42 = var41.first();
            }
        }
        finally {
            module0584.$g4396$.rebind(var39, var37);
        }
        return var38;
    }
    
    public static SubLObject f45750(final SubLObject var13, SubLObject var34, SubLObject var23, SubLObject var36) {
        if (var34 == module0738.UNPROVIDED) {
            var34 = module0584.$g4389$.getDynamicValue();
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLThread var37 = SubLProcess.currentSubLThread();
        SubLObject var38 = (SubLObject)module0738.NIL;
        final SubLObject var39 = module0584.$g4396$.currentBinding(var37);
        try {
            module0584.$g4396$.bind(var23, var37);
            SubLObject var41;
            final SubLObject var40 = var41 = f45738(var13, var36, (SubLObject)module0738.NIL);
            SubLObject var42 = (SubLObject)module0738.NIL;
            var42 = var41.first();
            while (module0738.NIL != var41) {
                if ((module0738.$ic14$ == module0738.$ic40$ || module0737.f45335(var42) == module0738.$ic40$) && module0738.NIL != f45741(var34, var42)) {
                    final SubLObject var43 = module0737.f45373(var42, (SubLObject)module0738.UNPROVIDED);
                    if (module0738.NIL == conses_high.member(var43, var38, Symbols.symbol_function((SubLObject)module0738.EQL), Symbols.symbol_function((SubLObject)module0738.IDENTITY))) {
                        var38 = (SubLObject)ConsesLow.cons(var43, var38);
                    }
                }
                var41 = var41.rest();
                var42 = var41.first();
            }
        }
        finally {
            module0584.$g4396$.rebind(var39, var37);
        }
        return var38;
    }
    
    public static SubLObject f45751(final SubLObject var13, SubLObject var34, SubLObject var23, SubLObject var36) {
        if (var34 == module0738.UNPROVIDED) {
            var34 = module0584.$g4389$.getDynamicValue();
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLThread var37 = SubLProcess.currentSubLThread();
        SubLObject var38 = (SubLObject)module0738.NIL;
        final SubLObject var39 = module0584.$g4396$.currentBinding(var37);
        try {
            module0584.$g4396$.bind(var23, var37);
            SubLObject var41;
            final SubLObject var40 = var41 = f45738(var13, var36, (SubLObject)module0738.NIL);
            SubLObject var42 = (SubLObject)module0738.NIL;
            var42 = var41.first();
            while (module0738.NIL != var41) {
                if ((module0738.$ic14$ == module0738.$ic37$ || module0737.f45335(var42) == module0738.$ic37$) && module0738.NIL != f45740(f45739(var13), var42, var13) && module0738.NIL != f45741(var34, var42)) {
                    final SubLObject var43 = module0737.f45358(var42);
                    if (module0738.NIL == conses_high.member(var43, var38, Symbols.symbol_function((SubLObject)module0738.EQL), Symbols.symbol_function((SubLObject)module0738.IDENTITY))) {
                        var38 = (SubLObject)ConsesLow.cons(var43, var38);
                    }
                }
                var41 = var41.rest();
                var42 = var41.first();
            }
        }
        finally {
            module0584.$g4396$.rebind(var39, var37);
        }
        return Sequences.delete((SubLObject)module0738.NIL, var38, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED);
    }
    
    public static SubLObject f45752(final SubLObject var13, final SubLObject var129, SubLObject var34, SubLObject var23, SubLObject var36) {
        if (var34 == module0738.UNPROVIDED) {
            var34 = module0584.$g4389$.getDynamicValue();
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLThread var130 = SubLProcess.currentSubLThread();
        SubLObject var131 = (SubLObject)module0738.NIL;
        final SubLObject var132 = module0584.$g4396$.currentBinding(var130);
        try {
            module0584.$g4396$.bind(var23, var130);
            SubLObject var134;
            final SubLObject var133 = var134 = f45738(var13, var36, (SubLObject)module0738.NIL);
            SubLObject var135 = (SubLObject)module0738.NIL;
            var135 = var134.first();
            while (module0738.NIL != var134) {
                if ((module0738.$ic14$ == module0738.$ic37$ || module0737.f45335(var135) == module0738.$ic37$) && module0738.NIL != f45740(f45739(var13), var135, var13) && module0738.NIL != f45741(var34, var135) && module0737.f45495(var135, (SubLObject)module0738.UNPROVIDED).equal(var129)) {
                    final SubLObject var136 = module0737.f45358(var135);
                    if (module0738.NIL == conses_high.member(var136, var131, Symbols.symbol_function((SubLObject)module0738.EQL), Symbols.symbol_function((SubLObject)module0738.IDENTITY))) {
                        var131 = (SubLObject)ConsesLow.cons(var136, var131);
                    }
                }
                var134 = var134.rest();
                var135 = var134.first();
            }
        }
        finally {
            module0584.$g4396$.rebind(var132, var130);
        }
        return var131;
    }
    
    public static SubLObject f45753(final SubLObject var13, SubLObject var34, SubLObject var23, SubLObject var36) {
        if (var34 == module0738.UNPROVIDED) {
            var34 = (SubLObject)module0738.T;
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLObject var37 = (SubLObject)module0738.NIL;
        final SubLObject var38 = (SubLObject)module0738.$ic46$;
        final SubLObject var39 = (SubLObject)module0738.NIL;
        return f45754(var13, var34, var23, (SubLObject)module0738.T, var37, var38, var39, var36);
    }
    
    public static SubLObject f45755(final SubLObject var13, SubLObject var75, SubLObject var77, SubLObject var34, SubLObject var79, SubLObject var23, SubLObject var36) {
        if (var75 == module0738.UNPROVIDED) {
            var75 = (SubLObject)module0738.NIL;
        }
        if (var77 == module0738.UNPROVIDED) {
            var77 = (SubLObject)module0738.$ic46$;
        }
        if (var34 == module0738.UNPROVIDED) {
            var34 = (SubLObject)module0738.T;
        }
        if (var79 == module0738.UNPROVIDED) {
            var79 = (SubLObject)module0738.NIL;
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        return f45754(var13, var34, var23, (SubLObject)module0738.NIL, var75, var77, var79, var36);
    }
    
    public static SubLObject f45754(final SubLObject var13, final SubLObject var34, final SubLObject var23, SubLObject var73, SubLObject var75, SubLObject var77, SubLObject var79, SubLObject var36) {
        if (var73 == module0738.UNPROVIDED) {
            var73 = (SubLObject)module0738.NIL;
        }
        if (var75 == module0738.UNPROVIDED) {
            var75 = (SubLObject)module0738.NIL;
        }
        if (var77 == module0738.UNPROVIDED) {
            var77 = (SubLObject)module0738.$ic46$;
        }
        if (var79 == module0738.UNPROVIDED) {
            var79 = (SubLObject)module0738.NIL;
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLThread var80 = SubLProcess.currentSubLThread();
        SubLObject var81 = (SubLObject)module0738.NIL;
        SubLObject var82 = (SubLObject)module0738.NIL;
        final SubLObject var83 = f45756(var13);
        final SubLObject var84 = module0584.$g4396$.currentBinding(var80);
        try {
            module0584.$g4396$.bind(var23, var80);
            var80.resetMultipleValues();
            final SubLObject var132_133 = f45757(var13, var34, var73, var75, var77, var79, var83, var36);
            final SubLObject var134_135 = var80.secondMultipleValue();
            var80.resetMultipleValues();
            var81 = var132_133;
            var82 = var134_135;
        }
        finally {
            module0584.$g4396$.rebind(var84, var80);
        }
        return Values.values(var81, var82);
    }
    
    public static SubLObject f45757(final SubLObject var13, final SubLObject var34, final SubLObject var73, final SubLObject var75, final SubLObject var77, final SubLObject var79, final SubLObject var131, final SubLObject var36) {
        final SubLThread var132 = SubLProcess.currentSubLThread();
        SubLObject var133 = (SubLObject)module0738.NIL;
        SubLObject var134 = (SubLObject)module0738.NIL;
        final SubLObject var135 = (SubLObject)module0738.NIL;
        final SubLObject var136 = f45739(var13);
        final SubLObject var137 = (SubLObject)((module0738.NIL != var79) ? module0738.$ic37$ : module0738.$ic14$);
        final SubLObject var138 = module0584.$g4396$.currentBinding(var132);
        try {
            module0584.$g4396$.bind(module0584.$g4396$.getDynamicValue(var132), var132);
            SubLObject var140;
            final SubLObject var139 = var140 = f45738(var13, var36, (SubLObject)module0738.T);
            SubLObject var141 = (SubLObject)module0738.NIL;
            var141 = var140.first();
            while (module0738.NIL != var140) {
                if ((module0738.$ic14$ == var137 || module0737.f45335(var141).eql(var137)) && module0738.NIL != f45741(var34, var141)) {
                    SubLObject var142 = (SubLObject)module0738.NIL;
                    if (module0738.NIL != module0737.f45321(var141, (SubLObject)module0738.UNPROVIDED)) {
                        var142 = (SubLObject)SubLObjectFactory.makeBoolean(module0738.NIL != f45740(var136, var141, var13) && module0738.NIL != module0731.f44644(module0584.$g4396$.getDynamicValue(var132), module0737.f45377(var141)));
                    }
                    else if (module0738.NIL != module0737.f45320(var141, (SubLObject)module0738.UNPROVIDED)) {
                        var142 = (SubLObject)SubLObjectFactory.makeBoolean(module0738.NIL == var79 && (module0738.NIL == var135 || var131.eql(f45756(module0737.f45336(var141)))));
                    }
                    if (module0738.NIL != var142) {
                        var132.resetMultipleValues();
                        final SubLObject var138_139 = f45758(var141, var133, var134, var73, var75, var77, var79);
                        final SubLObject var140_141 = var132.secondMultipleValue();
                        var132.resetMultipleValues();
                        var133 = var138_139;
                        var134 = var140_141;
                    }
                }
                var140 = var140.rest();
                var141 = var140.first();
            }
        }
        finally {
            module0584.$g4396$.rebind(var138, var132);
        }
        return Values.values(var133, var134);
    }
    
    public static SubLObject f45759(final SubLObject var13, SubLObject var142, SubLObject var143, SubLObject var144) {
        if (var142 == module0738.UNPROVIDED) {
            var142 = (SubLObject)module0738.NIL;
        }
        if (var143 == module0738.UNPROVIDED) {
            var143 = (SubLObject)module0738.$ic57$;
        }
        if (var144 == module0738.UNPROVIDED) {
            var144 = module0584.$g4390$.getDynamicValue();
        }
        final SubLThread var145 = SubLProcess.currentSubLThread();
        final SubLObject var146 = module0732.f45074(module0038.f2738(var13, module0738.$g5864$.getGlobalValue(), (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED), module0737.f45538(), (SubLObject)module0738.$ic3$, var143, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED);
        SubLObject var147 = (SubLObject)module0738.NIL;
        SubLObject var148 = var146;
        SubLObject var149 = (SubLObject)module0738.NIL;
        var149 = var148.first();
        while (module0738.NIL != var148) {
            SubLObject var94_148 = var149;
            SubLObject var150 = (SubLObject)module0738.NIL;
            var150 = var94_148.first();
            while (module0738.NIL != var94_148) {
                final SubLObject var151 = module0782.f50333(var150);
                SubLObject var152 = (SubLObject)module0738.NIL;
                if (module0738.NIL == module0731.f44721(var144)) {
                    SubLObject var94_149 = module0782.f50334(var150);
                    SubLObject var153 = (SubLObject)module0738.NIL;
                    var153 = var94_149.first();
                    while (module0738.NIL != var94_149) {
                        if (module0738.NIL != f45760(module0737.f45373(var153, (SubLObject)module0738.UNPROVIDED), (SubLObject)module0738.$ic58$, (SubLObject)module0738.$ic46$, (SubLObject)module0738.NIL) && module0738.NIL == module0004.f104(module0737.f45373(var153, (SubLObject)module0738.UNPROVIDED), var142, (SubLObject)module0738.$ic59$, (SubLObject)module0738.UNPROVIDED)) {
                            SubLObject var94_150 = module0737.f45361(var153);
                            SubLObject var154 = (SubLObject)module0738.NIL;
                            var154 = var94_150.first();
                            while (module0738.NIL != var94_150) {
                                final SubLObject var155 = module0782.f50332(var151, var154);
                                if (module0738.NIL == conses_high.member(var155, var147, (SubLObject)module0738.EQUAL, Symbols.symbol_function((SubLObject)module0738.IDENTITY))) {
                                    var147 = (SubLObject)ConsesLow.cons(var155, var147);
                                }
                                var152 = (SubLObject)module0738.T;
                                var94_150 = var94_150.rest();
                                var154 = var94_150.first();
                            }
                        }
                        var94_149 = var94_149.rest();
                        var153 = var94_149.first();
                    }
                }
                if (module0738.NIL != module0731.f44731(var152, var144)) {
                    var145.resetMultipleValues();
                    final SubLObject var156 = module0788.f50493(var151, (SubLObject)module0738.UNPROVIDED);
                    final SubLObject var157 = var145.secondMultipleValue();
                    var145.resetMultipleValues();
                    SubLObject var158 = (SubLObject)module0738.NIL;
                    SubLObject var159_160 = (SubLObject)module0738.NIL;
                    SubLObject var159 = (SubLObject)module0738.NIL;
                    SubLObject var162_163 = (SubLObject)module0738.NIL;
                    var158 = var156;
                    var159_160 = var158.first();
                    var159 = var157;
                    var162_163 = var159.first();
                    while (module0738.NIL != var159 || module0738.NIL != var158) {
                        SubLObject var160 = (SubLObject)module0738.NIL;
                        if (module0738.NIL == var160) {
                            SubLObject var161 = var162_163;
                            SubLObject var162 = (SubLObject)module0738.NIL;
                            var162 = var161.first();
                            while (module0738.NIL == var160 && module0738.NIL != var161) {
                                if (module0738.NIL == module0004.f104(var162, var142, (SubLObject)module0738.$ic59$, (SubLObject)module0738.UNPROVIDED)) {
                                    final SubLObject var163 = module0782.f50332(var151, var159_160);
                                    if (module0738.NIL == conses_high.member(var163, var147, (SubLObject)module0738.EQUAL, Symbols.symbol_function((SubLObject)module0738.IDENTITY))) {
                                        var147 = (SubLObject)ConsesLow.cons(var163, var147);
                                    }
                                    var152 = (SubLObject)module0738.T;
                                    var160 = (SubLObject)module0738.T;
                                }
                                var161 = var161.rest();
                                var162 = var161.first();
                            }
                        }
                        var158 = var158.rest();
                        var159_160 = var158.first();
                        var159 = var159.rest();
                        var162_163 = var159.first();
                    }
                }
                if (module0738.NIL == var152) {
                    final SubLObject var164 = module0782.f50332(var151, (SubLObject)module0738.NIL);
                    if (module0738.NIL == conses_high.member(var164, var147, (SubLObject)module0738.EQUAL, Symbols.symbol_function((SubLObject)module0738.IDENTITY))) {
                        var147 = (SubLObject)ConsesLow.cons(var164, var147);
                    }
                }
                var94_148 = var94_148.rest();
                var150 = var94_148.first();
            }
            var148 = var148.rest();
            var149 = var148.first();
        }
        return Sequences.nreverse(var147);
    }
    
    public static SubLObject f45761(final SubLObject var13, final SubLObject var104, SubLObject var75, SubLObject var77, SubLObject var34, SubLObject var23, SubLObject var36) {
        if (var75 == module0738.UNPROVIDED) {
            var75 = (SubLObject)module0738.NIL;
        }
        if (var77 == module0738.UNPROVIDED) {
            var77 = (SubLObject)module0738.$ic46$;
        }
        if (var34 == module0738.UNPROVIDED) {
            var34 = (SubLObject)module0738.T;
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLThread var105 = SubLProcess.currentSubLThread();
        final SubLObject var106 = module0731.f44736(var104, (SubLObject)module0738.UNPROVIDED);
        SubLObject var107 = (SubLObject)module0738.NIL;
        SubLObject var108 = (SubLObject)module0738.NIL;
        final SubLObject var109 = module0584.$g4396$.currentBinding(var105);
        try {
            module0584.$g4396$.bind(var23, var105);
            SubLObject var111;
            final SubLObject var110 = var111 = f45738(var13, var36, (SubLObject)module0738.T);
            SubLObject var112 = (SubLObject)module0738.NIL;
            var112 = var111.first();
            while (module0738.NIL != var111) {
                if ((module0738.$ic14$ == module0738.$ic37$ || module0737.f45335(var112) == module0738.$ic37$) && module0738.NIL != f45740(f45739(var13), var112, var13) && module0738.NIL != f45741(var34, var112) && module0738.NIL != module0731.f44886(module0737.f45358(var112), var106)) {
                    var105.resetMultipleValues();
                    final SubLObject var165_166 = f45758(var112, var107, var108, (SubLObject)module0738.NIL, var75, var77, (SubLObject)module0738.NIL);
                    final SubLObject var167_168 = var105.secondMultipleValue();
                    var105.resetMultipleValues();
                    var107 = var165_166;
                    var108 = var167_168;
                }
                var111 = var111.rest();
                var112 = var111.first();
            }
        }
        finally {
            module0584.$g4396$.rebind(var109, var105);
        }
        return Values.values(var107, var108);
    }
    
    public static SubLObject f45762(final SubLObject var13, SubLObject var75, SubLObject var77, SubLObject var34, SubLObject var23, SubLObject var79, SubLObject var36) {
        if (var75 == module0738.UNPROVIDED) {
            var75 = (SubLObject)module0738.NIL;
        }
        if (var77 == module0738.UNPROVIDED) {
            var77 = (SubLObject)module0738.$ic46$;
        }
        if (var34 == module0738.UNPROVIDED) {
            var34 = module0584.$g4389$.getDynamicValue();
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        if (var79 == module0738.UNPROVIDED) {
            var79 = (SubLObject)module0738.NIL;
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLThread var80 = SubLProcess.currentSubLThread();
        SubLObject var81 = (SubLObject)module0738.NIL;
        final SubLObject var82 = module0584.$g4396$.currentBinding(var80);
        try {
            module0584.$g4396$.bind(var23, var80);
            SubLObject var84;
            final SubLObject var83 = var84 = f45738(var13, var36, (SubLObject)module0738.T);
            SubLObject var85 = (SubLObject)module0738.NIL;
            var85 = var84.first();
            while (module0738.NIL != var84) {
                if ((module0738.$ic14$ == module0738.$ic37$ || module0737.f45335(var85) == module0738.$ic37$) && module0738.NIL != f45740(f45739(var13), var85, var13) && module0738.NIL != f45741(var34, var85) && module0738.NIL != f45760(module0737.f45373(var85, (SubLObject)module0738.UNPROVIDED), var75, var77, var79)) {
                    SubLObject var94_170 = module0737.f45361(var85);
                    SubLObject var86 = (SubLObject)module0738.NIL;
                    var86 = var94_170.first();
                    while (module0738.NIL != var94_170) {
                        SubLObject var94_171 = module0737.f45360(var85);
                        SubLObject var87 = (SubLObject)module0738.NIL;
                        var87 = var94_171.first();
                        while (module0738.NIL != var94_171) {
                            final SubLObject var88 = (SubLObject)ConsesLow.list(var86, var87);
                            if (module0738.NIL == conses_high.member(var88, var81, Symbols.symbol_function((SubLObject)module0738.EQUALP), Symbols.symbol_function((SubLObject)module0738.IDENTITY))) {
                                var81 = (SubLObject)ConsesLow.cons(var88, var81);
                            }
                            var94_171 = var94_171.rest();
                            var87 = var94_171.first();
                        }
                        var94_170 = var94_170.rest();
                        var86 = var94_170.first();
                    }
                }
                var84 = var84.rest();
                var85 = var84.first();
            }
        }
        finally {
            module0584.$g4396$.rebind(var82, var80);
        }
        return var81;
    }
    
    public static SubLObject f45763(final SubLObject var13, final SubLObject var84, SubLObject var75, SubLObject var77, SubLObject var34, SubLObject var23, SubLObject var36) {
        if (var75 == module0738.UNPROVIDED) {
            var75 = (SubLObject)module0738.NIL;
        }
        if (var77 == module0738.UNPROVIDED) {
            var77 = (SubLObject)module0738.$ic46$;
        }
        if (var34 == module0738.UNPROVIDED) {
            var34 = (SubLObject)module0738.T;
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        SubLObject var86 = (SubLObject)module0738.NIL;
        SubLObject var87 = (SubLObject)module0738.NIL;
        final SubLObject var88 = module0584.$g4396$.currentBinding(var85);
        try {
            module0584.$g4396$.bind(var23, var85);
            SubLObject var90;
            final SubLObject var89 = var90 = f45738(var13, var36, (SubLObject)module0738.T);
            SubLObject var91 = (SubLObject)module0738.NIL;
            var91 = var90.first();
            while (module0738.NIL != var90) {
                if ((module0738.$ic14$ == module0738.$ic37$ || module0737.f45335(var91) == module0738.$ic37$) && module0738.NIL != f45740(f45739(var13), var91, var13) && module0738.NIL != f45741(var34, var91) && module0738.NIL != module0731.f44713(module0737.f45358(var91), var84, (SubLObject)module0738.UNPROVIDED)) {
                    var85.resetMultipleValues();
                    final SubLObject var172_173 = f45758(var91, var86, var87, (SubLObject)module0738.NIL, var75, var77, (SubLObject)module0738.NIL);
                    final SubLObject var174_175 = var85.secondMultipleValue();
                    var85.resetMultipleValues();
                    var86 = var172_173;
                    var87 = var174_175;
                }
                var90 = var90.rest();
                var91 = var90.first();
            }
        }
        finally {
            module0584.$g4396$.rebind(var88, var85);
        }
        return Values.values(var86, var87);
    }
    
    public static SubLObject f45764(final SubLObject var13, final SubLObject var120, SubLObject var75, SubLObject var77, SubLObject var34, SubLObject var23, SubLObject var36) {
        if (var75 == module0738.UNPROVIDED) {
            var75 = (SubLObject)module0738.NIL;
        }
        if (var77 == module0738.UNPROVIDED) {
            var77 = (SubLObject)module0738.$ic46$;
        }
        if (var34 == module0738.UNPROVIDED) {
            var34 = (SubLObject)module0738.T;
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLThread var121 = SubLProcess.currentSubLThread();
        SubLObject var122 = (SubLObject)module0738.NIL;
        SubLObject var123 = (SubLObject)module0738.NIL;
        final SubLObject var124 = module0584.$g4396$.currentBinding(var121);
        try {
            module0584.$g4396$.bind(var23, var121);
            SubLObject var126;
            final SubLObject var125 = var126 = f45738(var13, var36, (SubLObject)module0738.T);
            SubLObject var127 = (SubLObject)module0738.NIL;
            var127 = var126.first();
            while (module0738.NIL != var126) {
                if ((module0738.$ic14$ == module0738.$ic37$ || module0737.f45335(var127) == module0738.$ic37$) && module0738.NIL != f45740(f45739(var13), var127, var13) && module0738.NIL != f45741(var34, var127) && module0738.NIL != f45745(var120, module0737.f45360(var127))) {
                    var121.resetMultipleValues();
                    final SubLObject var176_177 = f45758(var127, var122, var123, (SubLObject)module0738.NIL, var75, var77, (SubLObject)module0738.NIL);
                    final SubLObject var178_179 = var121.secondMultipleValue();
                    var121.resetMultipleValues();
                    var122 = var176_177;
                    var123 = var178_179;
                }
                var126 = var126.rest();
                var127 = var126.first();
            }
        }
        finally {
            module0584.$g4396$.rebind(var124, var121);
        }
        return Values.values(var122, var123);
    }
    
    public static SubLObject f45765(final SubLObject var13, SubLObject var34, SubLObject var23, SubLObject var136, SubLObject var36) {
        if (var34 == module0738.UNPROVIDED) {
            var34 = module0584.$g4389$.getDynamicValue();
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        if (var136 == module0738.UNPROVIDED) {
            var136 = (SubLObject)module0738.NIL;
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        assert module0738.NIL != Types.stringp(var13) : var13;
        return f45766(var13, var34, var23, var136, var36, (SubLObject)module0738.NIL);
    }
    
    public static SubLObject f45766(final SubLObject var13, final SubLObject var34, final SubLObject var23, final SubLObject var136, final SubLObject var36, final SubLObject var180) {
        final SubLThread var181 = SubLProcess.currentSubLThread();
        SubLObject var182 = (SubLObject)module0738.NIL;
        SubLObject var183 = (SubLObject)module0738.NIL;
        final SubLObject var184 = (SubLObject)SubLObjectFactory.makeBoolean(module0738.NIL != var136 && module0738.NIL != f45756(var13));
        final SubLObject var185 = (module0738.NIL != var184) ? module0038.f2623(var13, (SubLObject)module0738.FOUR_INTEGER, (SubLObject)module0738.UNPROVIDED) : var13;
        final SubLObject var186 = (SubLObject)SubLObjectFactory.makeBoolean(module0738.NIL == var180 && module0738.NIL != module0038.f2635(var13));
        final SubLObject var187 = module0584.$g4396$.currentBinding(var181);
        try {
            module0584.$g4396$.bind(var23, var181);
            SubLObject var189;
            final SubLObject var188 = var189 = f45738(var185, var36, (SubLObject)module0738.NIL);
            SubLObject var190 = (SubLObject)module0738.NIL;
            var190 = var189.first();
            while (module0738.NIL != var189) {
                if ((module0738.$ic14$ == module0738.$ic40$ || module0737.f45335(var190) == module0738.$ic40$) && module0738.NIL != f45741(module0584.$g4389$.getDynamicValue(var181), var190)) {
                    SubLObject var191 = (SubLObject)module0738.T;
                    if (module0738.NIL != var136 && !var184.eql(f45756(module0737.f45336(var190)))) {
                        var191 = (SubLObject)module0738.NIL;
                    }
                    else if (module0738.NIL != var180 && module0738.NIL == f45767(var190)) {
                        var191 = (SubLObject)module0738.NIL;
                    }
                    else if (module0738.NIL == f45741(var34, var190)) {
                        var191 = (SubLObject)module0738.NIL;
                    }
                    if (module0738.NIL != var191) {
                        var181.resetMultipleValues();
                        final SubLObject var183_184 = f45758(var190, var182, var183, (SubLObject)module0738.T, (SubLObject)module0738.NIL, (SubLObject)module0738.$ic46$, (SubLObject)module0738.NIL);
                        final SubLObject var185_186 = var181.secondMultipleValue();
                        var181.resetMultipleValues();
                        var182 = var183_184;
                        var183 = var185_186;
                    }
                }
                var189 = var189.rest();
                var190 = var189.first();
            }
        }
        finally {
            module0584.$g4396$.rebind(var187, var181);
        }
        if (module0738.NIL != var186) {
            var181.resetMultipleValues();
            final SubLObject var192 = f45766(module0038.f2627(var13), var34, var23, var136, var36, (SubLObject)module0738.T);
            final SubLObject var193 = var181.secondMultipleValue();
            var181.resetMultipleValues();
            var181.resetMultipleValues();
            final SubLObject var189_190 = f45768(var192, var182, var193, var183);
            final SubLObject var191_192 = var181.secondMultipleValue();
            var181.resetMultipleValues();
            var182 = var189_190;
            var183 = var191_192;
        }
        return Values.values(var182, var183);
    }
    
    public static SubLObject f45756(final SubLObject var13) {
        return module0038.f2675(var13, (SubLObject)module0738.$ic61$, Symbols.symbol_function((SubLObject)module0738.EQUALP));
    }
    
    public static SubLObject f45769(final SubLObject var13, SubLObject var34, SubLObject var23, SubLObject var36) {
        if (var34 == module0738.UNPROVIDED) {
            var34 = module0584.$g4389$.getDynamicValue();
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLObject var37 = module0738.$ic62$;
        return f45770(var13, var37, var34, var23, var36);
    }
    
    public static SubLObject f45771(final SubLObject var13, SubLObject var34, SubLObject var23, SubLObject var36) {
        if (var34 == module0738.UNPROVIDED) {
            var34 = module0584.$g4389$.getDynamicValue();
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLThread var37 = SubLProcess.currentSubLThread();
        SubLObject var38 = (SubLObject)module0738.NIL;
        SubLObject var39 = (SubLObject)module0738.NIL;
        final SubLObject var40 = module0584.$g4396$.currentBinding(var37);
        try {
            module0584.$g4396$.bind(var23, var37);
            SubLObject var42;
            final SubLObject var41 = var42 = f45738(var13, var36, (SubLObject)module0738.T);
            SubLObject var43 = (SubLObject)module0738.NIL;
            var43 = var42.first();
            while (module0738.NIL != var42) {
                if ((module0738.$ic14$ == module0738.$ic14$ || module0737.f45335(var43) == module0738.$ic14$) && module0738.NIL != f45740(f45739(var13), var43, var13) && module0738.NIL != f45741(var34, var43) && module0738.NIL != module0004.f104(module0737.f45373(var43, (SubLObject)module0738.UNPROVIDED), module0584.f35790(), (SubLObject)module0738.$ic59$, (SubLObject)module0738.UNPROVIDED)) {
                    var37.resetMultipleValues();
                    final SubLObject var194_195 = f45758(var43, var38, var39, (SubLObject)module0738.T, (SubLObject)module0738.NIL, (SubLObject)module0738.$ic46$, (SubLObject)module0738.NIL);
                    final SubLObject var196_197 = var37.secondMultipleValue();
                    var37.resetMultipleValues();
                    var38 = var194_195;
                    var39 = var196_197;
                }
                var42 = var42.rest();
                var43 = var42.first();
            }
        }
        finally {
            module0584.$g4396$.rebind(var40, var37);
        }
        return Values.values(var38, var39);
    }
    
    public static SubLObject f45772(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = (SubLObject)module0738.NIL;
        SubLObject var16 = (SubLObject)module0738.NIL;
        final SubLObject var17 = module0737.$g5846$.getGlobalValue();
        SubLObject var18 = (SubLObject)module0738.NIL;
        try {
            var18 = Locks.seize_lock(var17);
            final SubLObject var19 = module0584.$g4396$.currentBinding(var14);
            try {
                module0584.$g4396$.bind(module0738.$ic63$, var14);
                SubLObject var21;
                final SubLObject var20 = var21 = f45738(var13, module0585.$g4447$.getDynamicValue(var14), (SubLObject)module0738.NIL);
                SubLObject var22 = (SubLObject)module0738.NIL;
                var22 = var21.first();
                while (module0738.NIL != var21) {
                    if ((module0738.$ic14$ == module0738.$ic14$ || module0737.f45335(var22) == module0738.$ic14$) && module0738.NIL != f45740(f45739(var13), var22, var13) && module0738.NIL != f45741(module0584.$g4389$.getDynamicValue(var14), var22)) {
                        if (module0738.NIL != module0737.f45321(var22, (SubLObject)module0738.UNPROVIDED)) {
                            final SubLObject var23 = module0077.f5333(module0737.f45400(var22));
                            SubLObject var24;
                            SubLObject var25;
                            SubLObject var26;
                            SubLObject var27;
                            for (var24 = module0032.f1741(var23), var25 = (SubLObject)module0738.NIL, var25 = module0032.f1742(var24, var23); module0738.NIL == module0032.f1744(var24, var25); var25 = module0032.f1743(var25)) {
                                var26 = module0032.f1745(var24, var25);
                                if (module0738.NIL != module0032.f1746(var25, var26) && module0738.NIL != module0174.f11035(var26)) {
                                    var27 = var26;
                                    if (module0738.NIL == conses_high.member(var27, var15, Symbols.symbol_function((SubLObject)module0738.EQL), Symbols.symbol_function((SubLObject)module0738.IDENTITY))) {
                                        var15 = (SubLObject)ConsesLow.cons(var27, var15);
                                    }
                                }
                            }
                        }
                        else if (module0738.NIL != module0174.f11035(var22)) {
                            var16 = (SubLObject)ConsesLow.cons(var22, var16);
                        }
                    }
                    var21 = var21.rest();
                    var22 = var21.first();
                }
            }
            finally {
                module0584.$g4396$.rebind(var19, var14);
            }
            final SubLObject var28 = module0737.f45705(var13);
            module0087.f5970(module0737.f45538(), var28);
            SubLObject var29 = var15;
            SubLObject var30 = (SubLObject)module0738.NIL;
            var30 = var29.first();
            while (module0738.NIL != var29) {
                module0737.f45566(var30, (SubLObject)module0738.UNPROVIDED);
                var29 = var29.rest();
                var30 = var29.first();
            }
            var29 = var16;
            var30 = (SubLObject)module0738.NIL;
            var30 = var29.first();
            while (module0738.NIL != var29) {
                module0737.f45573(var30, (SubLObject)module0738.UNPROVIDED);
                var29 = var29.rest();
                var30 = var29.first();
            }
        }
        finally {
            if (module0738.NIL != var18) {
                Locks.release_lock(var17);
            }
        }
        return module0737.f45432(var13, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED);
    }
    
    public static SubLObject f45773(final SubLObject var13, SubLObject var207, SubLObject var34, SubLObject var84, SubLObject var23, SubLObject var36) {
        if (var207 == module0738.UNPROVIDED) {
            var207 = (SubLObject)module0738.$ic14$;
        }
        if (var34 == module0738.UNPROVIDED) {
            var34 = (SubLObject)module0738.T;
        }
        if (var84 == module0738.UNPROVIDED) {
            var84 = (SubLObject)module0738.$ic14$;
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLThread var208 = SubLProcess.currentSubLThread();
        SubLObject var209 = (SubLObject)module0738.NIL;
        SubLObject var210 = (SubLObject)module0738.NIL;
        final SubLObject var211 = (SubLObject)module0738.NIL;
        final SubLObject var212 = f45739(var13);
        if (module0738.NIL != module0202.f12659(var207)) {
            var207 = module0172.f10921(var207);
        }
        final SubLObject var213 = module0584.$g4396$.currentBinding(var208);
        try {
            module0584.$g4396$.bind(var23, var208);
            SubLObject var215;
            final SubLObject var214 = var215 = f45738(var13, var36, (SubLObject)module0738.T);
            SubLObject var216 = (SubLObject)module0738.NIL;
            var216 = var215.first();
            while (module0738.NIL != var215) {
                if ((module0738.$ic14$ == module0738.$ic37$ || module0737.f45335(var216) == module0738.$ic37$) && module0738.NIL != f45741(var34, var216) && module0738.NIL != f45740(var212, var216, var13) && (module0738.NIL == module0731.f44656(var84, (SubLObject)module0738.UNPROVIDED) || module0738.NIL != module0731.f44713(module0737.f45358(var216), var84, (SubLObject)module0738.UNPROVIDED)) && module0738.NIL != module0731.f44644(module0584.$g4396$.getDynamicValue(var208), module0737.f45377(var216)) && (module0738.NIL == module0173.f10955(var207) || module0737.f45497(var216).eql(var207))) {
                    var208.resetMultipleValues();
                    final SubLObject var209_210 = f45758(var216, var209, var210, var211, (SubLObject)module0738.NIL, (SubLObject)module0738.$ic64$, (SubLObject)module0738.NIL);
                    final SubLObject var211_212 = var208.secondMultipleValue();
                    var208.resetMultipleValues();
                    var209 = var209_210;
                    var210 = var211_212;
                }
                var215 = var215.rest();
                var216 = var215.first();
            }
        }
        finally {
            module0584.$g4396$.rebind(var213, var208);
        }
        return Values.values(var209, var210);
    }
    
    public static SubLObject f45774(final SubLObject var13, SubLObject var34, SubLObject var23, SubLObject var36) {
        if (var34 == module0738.UNPROVIDED) {
            var34 = module0584.$g4389$.getDynamicValue();
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLObject var37 = module0738.$ic65$;
        return f45770(var13, var37, var34, var23, var36);
    }
    
    public static SubLObject f45775(final SubLObject var13, SubLObject var34, SubLObject var23, SubLObject var36) {
        if (var34 == module0738.UNPROVIDED) {
            var34 = module0584.$g4389$.getDynamicValue();
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLObject var37 = module0738.$ic66$;
        return f45770(var13, var37, var34, var23, var36);
    }
    
    public static SubLObject f45770(final SubLObject var13, final SubLObject var193, SubLObject var34, SubLObject var23, SubLObject var36) {
        if (var34 == module0738.UNPROVIDED) {
            var34 = module0584.$g4389$.getDynamicValue();
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLThread var194 = SubLProcess.currentSubLThread();
        SubLObject var195 = (SubLObject)module0738.NIL;
        SubLObject var196 = (SubLObject)module0738.NIL;
        final SubLObject var197 = module0584.$g4396$.currentBinding(var194);
        try {
            module0584.$g4396$.bind(var23, var194);
            SubLObject var199;
            final SubLObject var198 = var199 = f45738(var13, var36, (SubLObject)module0738.NIL);
            SubLObject var200 = (SubLObject)module0738.NIL;
            var200 = var199.first();
            while (module0738.NIL != var199) {
                if ((module0738.$ic14$ == module0738.$ic40$ || module0737.f45335(var200) == module0738.$ic40$) && module0738.NIL != f45741(var34, var200) && module0738.NIL != module0731.f44702(module0737.f45373(var200, (SubLObject)module0738.UNPROVIDED), var193, (SubLObject)module0738.UNPROVIDED)) {
                    var194.resetMultipleValues();
                    final SubLObject var213_214 = f45758(var200, var195, var196, (SubLObject)module0738.T, (SubLObject)module0738.NIL, (SubLObject)module0738.$ic46$, (SubLObject)module0738.NIL);
                    final SubLObject var215_216 = var194.secondMultipleValue();
                    var194.resetMultipleValues();
                    var195 = var213_214;
                    var196 = var215_216;
                }
                var199 = var199.rest();
                var200 = var199.first();
            }
        }
        finally {
            module0584.$g4396$.rebind(var197, var194);
        }
        return Values.values(var195, var196);
    }
    
    public static SubLObject f45776(final SubLObject var13, final SubLObject var193, SubLObject var34, SubLObject var23, SubLObject var36) {
        if (var34 == module0738.UNPROVIDED) {
            var34 = module0584.$g4389$.getDynamicValue();
        }
        if (var23 == module0738.UNPROVIDED) {
            var23 = module0584.$g4396$.getDynamicValue();
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLThread var194 = SubLProcess.currentSubLThread();
        SubLObject var195 = (SubLObject)module0738.NIL;
        final SubLObject var196 = module0584.$g4396$.currentBinding(var194);
        try {
            module0584.$g4396$.bind(var23, var194);
            SubLObject var198;
            final SubLObject var197 = var198 = f45738(var13, var36, (SubLObject)module0738.NIL);
            SubLObject var199 = (SubLObject)module0738.NIL;
            var199 = var198.first();
            while (module0738.NIL != var198) {
                if ((module0738.$ic14$ == module0738.$ic40$ || module0737.f45335(var199) == module0738.$ic40$) && module0738.NIL != f45741(var34, var199) && module0738.NIL != module0174.f11035(var199) && module0738.NIL != module0731.f44702(module0737.f45373(var199, (SubLObject)module0738.UNPROVIDED), var193, (SubLObject)module0738.UNPROVIDED)) {
                    var195 = (SubLObject)ConsesLow.cons(var199, var195);
                }
                var198 = var198.rest();
                var199 = var198.first();
            }
        }
        finally {
            module0584.$g4396$.rebind(var196, var194);
        }
        return var195;
    }
    
    public static SubLObject f45777(final SubLObject var13, final SubLObject var103, SubLObject var218) {
        if (var218 == module0738.UNPROVIDED) {
            var218 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var219 = SubLProcess.currentSubLThread();
        assert module0738.NIL != Types.stringp(var13) : var13;
        assert module0738.NIL != module0731.f44690(var103, (SubLObject)module0738.UNPROVIDED) : var103;
        SubLObject var220 = (SubLObject)module0738.NIL;
        final SubLObject var221 = module0584.$g4396$.currentBinding(var219);
        try {
            module0584.$g4396$.bind(var218, var219);
            SubLObject var223;
            final SubLObject var222 = var223 = f45738(var13, module0585.$g4447$.getDynamicValue(var219), (SubLObject)module0738.NIL);
            SubLObject var224 = (SubLObject)module0738.NIL;
            var224 = var223.first();
            while (module0738.NIL != var223) {
                if ((module0738.$ic14$ == module0738.$ic37$ || module0737.f45335(var224) == module0738.$ic37$) && module0738.NIL != f45740(f45739(var13), var224, var13) && module0738.NIL != f45741(module0584.$g4389$.getDynamicValue(var219), var224) && module0738.NIL != module0004.f104(var103, module0737.f45360(var224), (SubLObject)module0738.$ic68$, (SubLObject)module0738.UNPROVIDED)) {
                    final SubLObject var225 = module0077.f5333(module0737.f45400(var224));
                    SubLObject var226;
                    SubLObject var227;
                    SubLObject var228;
                    for (var226 = module0032.f1741(var225), var227 = (SubLObject)module0738.NIL, var227 = module0032.f1742(var226, var225); module0738.NIL == module0032.f1744(var226, var227); var227 = module0032.f1743(var227)) {
                        var228 = module0032.f1745(var226, var227);
                        if (module0738.NIL != module0032.f1746(var227, var228) && module0738.NIL == module0174.f11035(var228)) {
                            var220 = (SubLObject)module0738.T;
                        }
                    }
                }
                var223 = var223.rest();
                var224 = var223.first();
            }
        }
        finally {
            module0584.$g4396$.rebind(var221, var219);
        }
        return var220;
    }
    
    public static SubLObject f45778(final SubLObject var220, final SubLObject var221, SubLObject var222) {
        if (var222 == module0738.UNPROVIDED) {
            var222 = module0147.f9552((SubLObject)module0738.UNPROVIDED);
        }
        final SubLThread var223 = SubLProcess.currentSubLThread();
        SubLObject var224 = (SubLObject)module0738.NIL;
        SubLObject var225 = (SubLObject)module0738.NIL;
        if (module0738.NIL != module0147.f9491(var222, (SubLObject)module0738.$ic69$)) {
            final SubLObject var226 = module0147.$g2094$.currentBinding(var223);
            final SubLObject var227 = module0147.$g2095$.currentBinding(var223);
            try {
                module0147.$g2094$.bind((SubLObject)module0738.$ic69$, var223);
                module0147.$g2095$.bind(module0738.$ic70$, var223);
                if (module0738.NIL != module0147.f9507(module0737.f45341(var220))) {
                    final SubLObject var228 = module0077.f5333(module0737.f45400(var220));
                    SubLObject var229;
                    SubLObject var230;
                    SubLObject var231;
                    SubLObject var232;
                    SubLObject var233;
                    for (var229 = module0032.f1741(var228), var230 = (SubLObject)module0738.NIL, var230 = module0032.f1742(var229, var228); module0738.NIL == var224 && module0738.NIL == module0032.f1744(var229, var230); var230 = module0032.f1743(var230)) {
                        var231 = module0032.f1745(var229, var230);
                        if (module0738.NIL != module0032.f1746(var230, var231) && module0738.NIL != module0191.f11950(var231) && module0738.NIL == var224) {
                            var232 = module0737.f45471(var231);
                            var233 = (SubLObject)module0738.NIL;
                            var233 = var232.first();
                            while (module0738.NIL == var224 && module0738.NIL != var232) {
                                if (module0738.NIL != module0731.f44709(var233, var221, var222)) {
                                    var224 = var233;
                                    var225 = (SubLObject)ConsesLow.cons(var231, var225);
                                    if (!var233.equal(var221)) {
                                        var225 = (SubLObject)ConsesLow.cons(module0435.f30621(var233, var221), var225);
                                    }
                                }
                                var232 = var232.rest();
                                var233 = var232.first();
                            }
                        }
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var227, var223);
                module0147.$g2094$.rebind(var226, var223);
            }
        }
        else if (module0738.NIL != module0147.f9491(var222, (SubLObject)module0738.$ic71$)) {
            final SubLObject var226 = module0147.$g2094$.currentBinding(var223);
            final SubLObject var227 = module0147.$g2095$.currentBinding(var223);
            try {
                module0147.$g2094$.bind((SubLObject)module0738.$ic71$, var223);
                module0147.$g2095$.bind(module0738.$ic63$, var223);
                if (module0738.NIL != module0147.f9507(module0737.f45341(var220))) {
                    final SubLObject var228 = module0077.f5333(module0737.f45400(var220));
                    SubLObject var229;
                    SubLObject var230;
                    SubLObject var231;
                    SubLObject var232;
                    SubLObject var233;
                    for (var229 = module0032.f1741(var228), var230 = (SubLObject)module0738.NIL, var230 = module0032.f1742(var229, var228); module0738.NIL == var224 && module0738.NIL == module0032.f1744(var229, var230); var230 = module0032.f1743(var230)) {
                        var231 = module0032.f1745(var229, var230);
                        if (module0738.NIL != module0032.f1746(var230, var231) && module0738.NIL != module0191.f11950(var231) && module0738.NIL == var224) {
                            var232 = module0737.f45471(var231);
                            var233 = (SubLObject)module0738.NIL;
                            var233 = var232.first();
                            while (module0738.NIL == var224 && module0738.NIL != var232) {
                                if (module0738.NIL != module0731.f44709(var233, var221, var222)) {
                                    var224 = var233;
                                    var225 = (SubLObject)ConsesLow.cons(var231, var225);
                                    if (!var233.equal(var221)) {
                                        var225 = (SubLObject)ConsesLow.cons(module0435.f30621(var233, var221), var225);
                                    }
                                }
                                var232 = var232.rest();
                                var233 = var232.first();
                            }
                        }
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var227, var223);
                module0147.$g2094$.rebind(var226, var223);
            }
        }
        else if (module0738.NIL != module0161.f10488(var222)) {
            final SubLObject var226 = module0147.$g2094$.currentBinding(var223);
            final SubLObject var227 = module0147.$g2096$.currentBinding(var223);
            try {
                module0147.$g2094$.bind((SubLObject)module0738.$ic72$, var223);
                module0147.$g2096$.bind(module0161.f10522(var222), var223);
                if (module0738.NIL != module0147.f9507(module0737.f45341(var220))) {
                    final SubLObject var228 = module0077.f5333(module0737.f45400(var220));
                    SubLObject var229;
                    SubLObject var230;
                    SubLObject var231;
                    SubLObject var232;
                    SubLObject var233;
                    for (var229 = module0032.f1741(var228), var230 = (SubLObject)module0738.NIL, var230 = module0032.f1742(var229, var228); module0738.NIL == var224 && module0738.NIL == module0032.f1744(var229, var230); var230 = module0032.f1743(var230)) {
                        var231 = module0032.f1745(var229, var230);
                        if (module0738.NIL != module0032.f1746(var230, var231) && module0738.NIL != module0191.f11950(var231) && module0738.NIL == var224) {
                            var232 = module0737.f45471(var231);
                            var233 = (SubLObject)module0738.NIL;
                            var233 = var232.first();
                            while (module0738.NIL == var224 && module0738.NIL != var232) {
                                if (module0738.NIL != module0731.f44709(var233, var221, var222)) {
                                    var224 = var233;
                                    var225 = (SubLObject)ConsesLow.cons(var231, var225);
                                    if (!var233.equal(var221)) {
                                        var225 = (SubLObject)ConsesLow.cons(module0435.f30621(var233, var221), var225);
                                    }
                                }
                                var232 = var232.rest();
                                var233 = var232.first();
                            }
                        }
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var227, var223);
                module0147.$g2094$.rebind(var226, var223);
            }
        }
        else {
            final SubLObject var226 = module0147.$g2094$.currentBinding(var223);
            final SubLObject var227 = module0147.$g2095$.currentBinding(var223);
            try {
                module0147.$g2094$.bind((SubLObject)module0738.$ic73$, var223);
                module0147.$g2095$.bind(var222, var223);
                if (module0738.NIL != module0147.f9507(module0737.f45341(var220))) {
                    final SubLObject var228 = module0077.f5333(module0737.f45400(var220));
                    SubLObject var229;
                    SubLObject var230;
                    SubLObject var231;
                    SubLObject var232;
                    SubLObject var233;
                    for (var229 = module0032.f1741(var228), var230 = (SubLObject)module0738.NIL, var230 = module0032.f1742(var229, var228); module0738.NIL == var224 && module0738.NIL == module0032.f1744(var229, var230); var230 = module0032.f1743(var230)) {
                        var231 = module0032.f1745(var229, var230);
                        if (module0738.NIL != module0032.f1746(var230, var231) && module0738.NIL != module0191.f11950(var231) && module0738.NIL == var224) {
                            var232 = module0737.f45471(var231);
                            var233 = (SubLObject)module0738.NIL;
                            var233 = var232.first();
                            while (module0738.NIL == var224 && module0738.NIL != var232) {
                                if (module0738.NIL != module0731.f44709(var233, var221, var222)) {
                                    var224 = var233;
                                    var225 = (SubLObject)ConsesLow.cons(var231, var225);
                                    if (!var233.equal(var221)) {
                                        var225 = (SubLObject)ConsesLow.cons(module0435.f30621(var233, var221), var225);
                                    }
                                }
                                var232 = var232.rest();
                                var233 = var232.first();
                            }
                        }
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var227, var223);
                module0147.$g2094$.rebind(var226, var223);
            }
        }
        return Values.values(var224, var225);
    }
    
    public static SubLObject f45758(final SubLObject var6, SubLObject var65, SubLObject var66, SubLObject var73, SubLObject var75, SubLObject var77, SubLObject var79) {
        if (var73 == module0738.UNPROVIDED) {
            var73 = (SubLObject)module0738.NIL;
        }
        if (var75 == module0738.UNPROVIDED) {
            var75 = (SubLObject)module0738.NIL;
        }
        if (var77 == module0738.UNPROVIDED) {
            var77 = (SubLObject)module0738.$ic46$;
        }
        if (var79 == module0738.UNPROVIDED) {
            var79 = (SubLObject)module0738.NIL;
        }
        final SubLThread var80 = SubLProcess.currentSubLThread();
        if (module0738.NIL != var73 || module0738.NIL != f45760(module0737.f45373(var6, (SubLObject)module0738.UNPROVIDED), var75, var77, var79)) {
            final SubLObject var81 = (var77 == module0738.$ic64$) ? module0737.f45366(var6) : module0737.f45361(var6);
            final SubLObject var82 = (SubLObject)((module0738.NIL != var81) ? ConsesLow.make_list(conses_high.list_length(var81), f45779(var6)) : module0738.NIL);
            var80.resetMultipleValues();
            final SubLObject var226_227 = f45768(var81, var65, var82, var66);
            final SubLObject var228_229 = var80.secondMultipleValue();
            var80.resetMultipleValues();
            var65 = var226_227;
            var66 = var228_229;
        }
        return Values.values(var65, var66);
    }
    
    public static SubLObject f45779(final SubLObject var6) {
        if (module0738.NIL != module0737.f45320(var6, (SubLObject)module0738.UNPROVIDED)) {
            return module0737.f45373(var6, (SubLObject)module0738.UNPROVIDED);
        }
        if (module0738.NIL != module0737.f45321(var6, (SubLObject)module0738.UNPROVIDED)) {
            return module0737.f45359(var6);
        }
        return (SubLObject)module0738.NIL;
    }
    
    public static SubLObject f45768(final SubLObject var82, SubLObject var65, final SubLObject var83, SubLObject var66) {
        SubLObject var84 = (SubLObject)module0738.NIL;
        SubLObject var231_232 = (SubLObject)module0738.NIL;
        SubLObject var85 = (SubLObject)module0738.NIL;
        SubLObject var234_235 = (SubLObject)module0738.NIL;
        var84 = var82;
        var231_232 = var84.first();
        var85 = var83;
        var234_235 = var85.first();
        while (module0738.NIL != var85 || module0738.NIL != var84) {
            SubLObject var86;
            final SubLObject var83_236 = var86 = (SubLObject)(var234_235.isList() ? var234_235 : ConsesLow.list(var234_235));
            SubLObject var87 = (SubLObject)module0738.NIL;
            var87 = var86.first();
            while (module0738.NIL != var86) {
                final SubLObject var88 = Sequences.position(var231_232, var65, Symbols.symbol_function((SubLObject)module0738.EQUAL), (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED);
                if (module0738.NIL != var88) {
                    if (module0738.NIL != var87) {
                        final SubLObject var89 = var87;
                        if (module0738.NIL == conses_high.member(var89, ConsesLow.nth(var88, var66), Symbols.symbol_function((SubLObject)module0738.EQL), Symbols.symbol_function((SubLObject)module0738.IDENTITY))) {
                            ConsesLow.set_nth(var88, var66, (SubLObject)ConsesLow.cons(var89, ConsesLow.nth(var88, var66)));
                        }
                    }
                }
                else {
                    var65 = (SubLObject)ConsesLow.cons(var231_232, var65);
                    if (module0738.NIL != var87) {
                        var66 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var87), var66);
                    }
                    else {
                        var66 = (SubLObject)ConsesLow.cons((SubLObject)module0738.NIL, var66);
                    }
                }
                var86 = var86.rest();
                var87 = var86.first();
            }
            var84 = var84.rest();
            var231_232 = var84.first();
            var85 = var85.rest();
            var234_235 = var85.first();
        }
        return Values.values(var65, var66);
    }
    
    public static SubLObject f45760(final SubLObject var103, final SubLObject var75, final SubLObject var77, final SubLObject var79) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0738.NIL != f45780(var103, var75) && module0738.NIL != f45781(var103, var77) && module0738.NIL != f45782(var103, var79));
    }
    
    public static SubLObject f45780(final SubLObject var103, final SubLObject var75) {
        if (module0738.NIL != module0004.f104(var103, module0584.f35791(), (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED)) {
            return (SubLObject)((module0738.NIL != module0004.f104((SubLObject)module0738.$ic74$, var75, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED)) ? module0738.T : module0738.NIL);
        }
        if (module0738.NIL != module0004.f104(var103, module0584.f35790(), Symbols.symbol_function((SubLObject)module0738.EQUAL), (SubLObject)module0738.UNPROVIDED)) {
            return (SubLObject)((module0738.NIL != module0004.f104((SubLObject)module0738.$ic75$, var75, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED)) ? module0738.T : module0738.NIL);
        }
        return (SubLObject)module0738.T;
    }
    
    public static SubLObject f45781(final SubLObject var103, final SubLObject var77) {
        if (module0738.NIL != module0004.f104(var103, (SubLObject)module0738.$ic76$, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED)) {
            return module0004.f104(var103, module0731.f44818(var77), (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED);
        }
        if (module0738.NIL != module0004.f104(var103, module0737.f45531(), (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED)) {
            return Equality.eq(var77, (SubLObject)module0738.$ic64$);
        }
        return (SubLObject)module0738.T;
    }
    
    public static SubLObject f45782(final SubLObject var103, final SubLObject var79) {
        if (module0738.NIL != module0737.f45519(var103)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0738.NIL == var79);
        }
        return (SubLObject)module0738.T;
    }
    
    public static SubLObject f45783(final SubLObject var239, SubLObject var240, SubLObject var143, SubLObject var241, SubLObject var242, SubLObject var36) {
        if (var240 == module0738.UNPROVIDED) {
            var240 = (SubLObject)module0738.$ic3$;
        }
        if (var143 == module0738.UNPROVIDED) {
            var143 = (SubLObject)module0738.$ic57$;
        }
        if (var241 == module0738.UNPROVIDED) {
            var241 = Symbols.symbol_function((SubLObject)module0738.IDENTITY);
        }
        if (var242 == module0738.UNPROVIDED) {
            var242 = (SubLObject)module0738.ZERO_INTEGER;
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLThread var243 = SubLProcess.currentSubLThread();
        var243.resetMultipleValues();
        final SubLObject var244 = module0737.f45707(var239);
        final SubLObject var245 = var243.secondMultipleValue();
        var243.resetMultipleValues();
        final SubLObject var246 = var244.first();
        final SubLObject var247 = var245.first();
        final SubLObject var248 = module0737.f45538();
        SubLObject var249 = module0732.f45074(var246, var248, var240, var143, var241, var242);
        if (var240 != module0738.$ic77$) {
            return var249;
        }
        var249 = f45784(var249);
        if (var36 != module0738.$ic78$ && module0738.NIL == module0737.f45559(var248)) {
            final SubLObject var250 = f45785(var249, var246);
            if (var36 == module0738.$ic79$ || module0738.NIL != module0035.f2013(var250)) {
                var249 = var250;
            }
        }
        if (module0738.NIL != var247) {
            var249 = f45786(var249, var247);
        }
        return Sort.sort(Sort.sort(var249, Symbols.symbol_function((SubLObject)module0738.$ic80$), (SubLObject)module0738.$ic81$), Symbols.symbol_function((SubLObject)module0738.$ic82$), (SubLObject)module0738.$ic83$);
    }
    
    public static SubLObject f45785(final SubLObject var250, final SubLObject var17) {
        SubLObject var251 = var250;
        SubLObject var252 = (SubLObject)module0738.NIL;
        var252 = var251.first();
        while (module0738.NIL != var251) {
            final SubLObject var253 = module0782.f50326(var252);
            final SubLObject var254 = module0782.f50327(var252);
            final SubLObject var255 = module0087.f5978(var17, var253, var254);
            final SubLObject var256 = module0782.f50329(var252);
            module0782.f50337(var256, module0737.f45601(module0782.f50334(var256), var255));
            var251 = var251.rest();
            var252 = var251.first();
        }
        return var250;
    }
    
    public static SubLObject f45784(final SubLObject var250) {
        SubLObject var251 = var250;
        SubLObject var252 = (SubLObject)module0738.NIL;
        var252 = var251.first();
        while (module0738.NIL != var251) {
            final SubLObject var253 = module0782.f50329(var252);
            module0782.f50337(var253, f45787(module0782.f50334(var253), (SubLObject)module0738.UNPROVIDED));
            var251 = var251.rest();
            var252 = var251.first();
        }
        return var250;
    }
    
    public static SubLObject f45786(final SubLObject var248, final SubLObject var246) {
        final SubLObject var249 = Hashtables.make_hash_table((SubLObject)module0738.SIXTEEN_INTEGER, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED);
        SubLObject var250 = (SubLObject)module0738.NIL;
        SubLObject var251 = var246;
        SubLObject var252 = (SubLObject)module0738.NIL;
        var252 = var251.first();
        while (module0738.NIL != var251) {
            SubLObject var254;
            final SubLObject var253 = var254 = var252;
            SubLObject var255 = (SubLObject)module0738.NIL;
            SubLObject var256 = (SubLObject)module0738.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var254, var253, (SubLObject)module0738.$ic84$);
            var255 = var254.first();
            var254 = (var256 = var254.rest());
            final SubLObject var257 = Hashtables.gethash(var255, var249, (SubLObject)module0738.ZERO_INTEGER);
            final SubLObject var258 = Numbers.add(var257, Numbers.subtract((SubLObject)module0738.ONE_INTEGER, var256));
            Hashtables.sethash(var255, var249, var258);
            var251 = var251.rest();
            var252 = var251.first();
        }
        var251 = var248;
        SubLObject var259 = (SubLObject)module0738.NIL;
        var259 = var251.first();
        while (module0738.NIL != var251) {
            SubLObject var261;
            final SubLObject var260 = var261 = module0782.f50326(var259);
            SubLObject var263;
            final SubLObject var262 = var263 = module0782.f50327(var259);
            final SubLObject var264 = module0782.f50329(var259);
            SubLObject var265;
            for (var265 = (SubLObject)module0738.NIL, var265 = (SubLObject)module0738.ZERO_INTEGER; var265.numL(var260); var265 = Numbers.add(var265, (SubLObject)module0738.ONE_INTEGER)) {
                var261 = Numbers.add(var261, Hashtables.gethash(module0048.f_1X(var265), var249, (SubLObject)module0738.ZERO_INTEGER));
            }
            for (var265 = (SubLObject)module0738.NIL, var265 = (SubLObject)module0738.ZERO_INTEGER; var265.numL(var262); var265 = Numbers.add(var265, (SubLObject)module0738.ONE_INTEGER)) {
                var263 = Numbers.add(var263, Hashtables.gethash(var265, var249, (SubLObject)module0738.ZERO_INTEGER));
            }
            var250 = (SubLObject)ConsesLow.cons(module0782.f50324(var261, var263, var264), var250);
            var251 = var251.rest();
            var259 = var251.first();
        }
        return var250;
    }
    
    public static SubLObject f45788(final SubLObject var267, final SubLObject var13, SubLObject var36) {
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        assert module0738.NIL != module0737.f45540(var267, (SubLObject)module0738.UNPROVIDED) : var267;
        assert module0738.NIL != Types.stringp(var13) : var13;
        final SubLObject var268 = module0737.f45705(var13);
        return f45789(var267, var268, var36);
    }
    
    public static SubLObject f45789(final SubLObject var267, final SubLObject var17, SubLObject var36) {
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLThread var268 = SubLProcess.currentSubLThread();
        assert module0738.NIL != module0737.f45540(var267, (SubLObject)module0738.UNPROVIDED) : var267;
        SubLObject var269 = (SubLObject)module0738.NIL;
        SubLObject var270 = (SubLObject)module0738.NIL;
        var268.resetMultipleValues();
        final SubLObject var271 = module0737.f45708(var17);
        final SubLObject var272 = var268.secondMultipleValue();
        var268.resetMultipleValues();
        SubLObject var273 = (SubLObject)module0738.NIL;
        SubLObject var271_272 = (SubLObject)module0738.NIL;
        SubLObject var274 = (SubLObject)module0738.NIL;
        SubLObject var246_274 = (SubLObject)module0738.NIL;
        var273 = var271;
        var271_272 = var273.first();
        var274 = var272;
        var246_274 = var274.first();
        while (module0738.NIL != var274 || module0738.NIL != var273) {
            if (module0738.NIL != module0035.f1997(var271_272) && module0738.NIL != module0038.f2635(var271_272.first())) {
                var268.resetMultipleValues();
                final SubLObject var275_276 = module0737.f45705(module0038.f2627(var271_272.first()));
                final SubLObject var277_278 = var268.secondMultipleValue();
                var268.resetMultipleValues();
                var271_272 = var275_276;
                var246_274 = var277_278;
                var270 = (SubLObject)module0738.T;
            }
            final SubLObject var275 = module0737.$g5846$.getGlobalValue();
            SubLObject var276 = (SubLObject)module0738.NIL;
            try {
                var276 = Locks.seize_lock(var275);
                SubLObject var277 = module0087.f5983(var267, var271_272);
                SubLObject var278 = (SubLObject)module0738.NIL;
                var278 = var277.first();
                while (module0738.NIL != var277) {
                    SubLObject var279 = module0035.f2124(Sequences.length(module0737.f45525(var278)), var271_272);
                    final SubLObject var280 = f45790(var279, var246_274);
                    SubLObject var281 = (SubLObject)((module0738.NIL != var280) ? module0737.f45564(f45787(module0737.f45526(var278), (SubLObject)module0738.UNPROVIDED), var267, var279) : module0738.NIL);
                    if (var36 != module0738.$ic78$) {
                        if (module0738.NIL == module0737.f45559(var267)) {
                            if (module0738.NIL != conses_high.member(var36, (SubLObject)module0738.$ic86$, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED)) {
                                final SubLObject var282 = module0737.f45601(var281, var279);
                                if (var36 == module0738.$ic79$ || module0738.NIL != module0035.f2013(var282)) {
                                    var281 = var282;
                                }
                            }
                            else {
                                Errors.error((SubLObject)module0738.$ic87$, var36);
                            }
                        }
                    }
                    if (module0738.NIL != var270) {
                        var281 = f45791(var281);
                    }
                    if (module0738.NIL != var281) {
                        if (module0738.NIL != var246_274) {
                            var279 = f45792(Sequences.length(var279), var17, var246_274);
                        }
                        var269 = (SubLObject)ConsesLow.cons(module0737.f45524(var279, var281), var269);
                    }
                    var277 = var277.rest();
                    var278 = var277.first();
                }
            }
            finally {
                if (module0738.NIL != var276) {
                    Locks.release_lock(var275);
                }
            }
            var273 = var273.rest();
            var271_272 = var273.first();
            var274 = var274.rest();
            var246_274 = var274.first();
        }
        return Sequences.nreverse(var269);
    }
    
    public static SubLObject f45793(final SubLObject var267, final SubLObject var17, final SubLObject var36, SubLObject var286) {
        if (var286 == module0738.UNPROVIDED) {
            var286 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var287 = SubLProcess.currentSubLThread();
        SubLObject var288 = (SubLObject)module0738.NIL;
        final SubLObject var289 = module0584.$g4396$.currentBinding(var287);
        try {
            module0584.$g4396$.bind(var286, var287);
            var288 = f45789(var267, var17, var36);
        }
        finally {
            module0584.$g4396$.rebind(var289, var287);
        }
        return var288;
    }
    
    public static SubLObject f45794(final SubLObject var267, final SubLObject var17, final SubLObject var36, SubLObject var286) {
        if (var286 == module0738.UNPROVIDED) {
            var286 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var287 = SubLProcess.currentSubLThread();
        final SubLObject var288 = module0034.$g879$.getDynamicValue(var287);
        SubLObject var289 = (SubLObject)module0738.NIL;
        if (module0738.NIL == var288) {
            return f45793(var267, var17, var36, var286);
        }
        var289 = module0034.f1857(var288, (SubLObject)module0738.$ic88$, (SubLObject)module0738.UNPROVIDED);
        if (module0738.NIL == var289) {
            var289 = module0034.f1807(module0034.f1842(var288), (SubLObject)module0738.$ic88$, (SubLObject)module0738.FOUR_INTEGER, (SubLObject)module0738.$ic89$, (SubLObject)module0738.EQUAL, (SubLObject)module0738.UNPROVIDED);
            module0034.f1860(var288, (SubLObject)module0738.$ic88$, var289);
        }
        final SubLObject var290 = module0034.f1780(var267, var17, var36, var286);
        final SubLObject var291 = module0034.f1814(var289, var290, (SubLObject)module0738.UNPROVIDED);
        if (var291 != module0738.$ic54$) {
            SubLObject var292 = var291;
            SubLObject var293 = (SubLObject)module0738.NIL;
            var293 = var292.first();
            while (module0738.NIL != var292) {
                SubLObject var294 = var293.first();
                final SubLObject var295 = conses_high.second(var293);
                if (var267.equal(var294.first())) {
                    var294 = var294.rest();
                    if (var17.equal(var294.first())) {
                        var294 = var294.rest();
                        if (var36.equal(var294.first())) {
                            var294 = var294.rest();
                            if (module0738.NIL != var294 && module0738.NIL == var294.rest() && var286.equal(var294.first())) {
                                return module0034.f1959(var295);
                            }
                        }
                    }
                }
                var292 = var292.rest();
                var293 = var292.first();
            }
        }
        final SubLObject var296 = Values.arg2(var287.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45793(var267, var17, var36, var286)));
        module0034.f1836(var289, var290, var291, var296, (SubLObject)ConsesLow.list(var267, var17, var36, var286));
        return module0034.f1959(var296);
    }
    
    public static SubLObject f45791(final SubLObject var18) {
        SubLObject var19 = (SubLObject)module0738.NIL;
        SubLObject var20 = var18;
        SubLObject var21 = (SubLObject)module0738.NIL;
        var21 = var20.first();
        while (module0738.NIL != var20) {
            if (module0738.NIL != f45767(var21)) {
                var19 = (SubLObject)ConsesLow.cons(var21, var19);
            }
            var20 = var20.rest();
            var21 = var20.first();
        }
        return Sequences.nreverse(var19);
    }
    
    public static SubLObject f45767(final SubLObject var6) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0738.NIL != module0737.f45320(var6, (SubLObject)module0738.UNPROVIDED) && module0738.NIL != module0731.f44702(f45779(var6), module0738.$ic90$, (SubLObject)module0738.UNPROVIDED));
    }
    
    public static SubLObject f45795() {
        final SubLThread var85 = SubLProcess.currentSubLThread();
        return Equality.eq(module0585.$g4447$.getDynamicValue(var85), (SubLObject)module0738.$ic79$);
    }
    
    public static SubLObject f45790(final SubLObject var288, final SubLObject var246) {
        if (module0738.NIL == var246) {
            return (SubLObject)module0738.T;
        }
        final SubLObject var289 = Sequences.length(var288);
        SubLObject var290 = (SubLObject)module0738.ZERO_INTEGER;
        if (var289.isZero()) {
            return (SubLObject)module0738.T;
        }
        SubLObject var291;
        SubLObject var292;
        SubLObject var293;
        for (var291 = var289, var292 = (SubLObject)module0738.NIL, var292 = (SubLObject)module0738.ZERO_INTEGER; !var292.numGE(var291); var292 = module0048.f_1X(var292)) {
            var293 = module0035.f2293(var246, var292, Symbols.symbol_function((SubLObject)module0738.EQL), (SubLObject)module0738.ONE_INTEGER);
            var290 = Numbers.add(var290, var293);
            if (var289.eql(var290)) {
                return (SubLObject)module0738.T;
            }
            if (var290.numG(var289)) {
                return (SubLObject)module0738.NIL;
            }
        }
        return (SubLObject)module0738.NIL;
    }
    
    public static SubLObject f45792(SubLObject var294, final SubLObject var295, final SubLObject var246) {
        SubLObject var296 = (SubLObject)module0738.NIL;
        SubLObject var297;
        SubLObject var298;
        for (var297 = (SubLObject)module0738.NIL, var297 = (SubLObject)module0738.ZERO_INTEGER; !var297.numGE(var294); var297 = module0048.f_1X(var297)) {
            var296 = (SubLObject)ConsesLow.cons(ConsesLow.nth(var297, var295), var296);
            var298 = module0035.f2293(var246, var297, Symbols.symbol_function((SubLObject)module0738.EQL), (SubLObject)module0738.ONE_INTEGER);
            if (var298.numG((SubLObject)module0738.ONE_INTEGER)) {
                var294 = Numbers.subtract(var294, Numbers.subtract(var298, (SubLObject)module0738.ONE_INTEGER));
            }
        }
        return Sequences.nreverse(var296);
    }
    
    public static SubLObject f45796(final SubLObject var13, final SubLObject var218, SubLObject var36) {
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLObject var219 = f45797(var13, var218, var36);
        SubLObject var220 = (SubLObject)module0738.NIL;
        SubLObject var221 = var219;
        SubLObject var222 = (SubLObject)module0738.NIL;
        var222 = var221.first();
        while (module0738.NIL != var221) {
            var220 = (SubLObject)ConsesLow.cons(module0782.f50333(module0782.f50329(var222)), var220);
            var221 = var221.rest();
            var222 = var221.first();
        }
        return Sequences.nreverse(var220);
    }
    
    public static SubLObject f45797(final SubLObject var13, SubLObject var218, SubLObject var36) {
        if (var218 == module0738.UNPROVIDED) {
            var218 = module0584.$g4396$.getDynamicValue();
        }
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        final SubLThread var219 = SubLProcess.currentSubLThread();
        SubLObject var220 = (SubLObject)module0738.NIL;
        final SubLObject var221 = module0782.f50297(var13);
        final SubLObject var222 = Sequences.length(var221);
        final SubLObject var223 = module0584.$g4396$.currentBinding(var219);
        try {
            module0584.$g4396$.bind(var218, var219);
            final SubLObject var224 = (SubLObject)module0738.ZERO_INTEGER;
            final SubLObject var225 = f45783(var221, (SubLObject)module0738.$ic77$, (SubLObject)module0738.$ic57$, Symbols.symbol_function((SubLObject)module0738.IDENTITY), var224, var36);
            SubLObject var226;
            for (var226 = (SubLObject)module0738.NIL, var226 = (SubLObject)module0738.ZERO_INTEGER; var226.numL(var222); var226 = Numbers.add(var226, (SubLObject)module0738.ONE_INTEGER)) {
                if (module0738.NIL == module0004.f104(var226, var225, (SubLObject)module0738.$ic91$, (SubLObject)module0738.UNPROVIDED)) {
                    var220 = (SubLObject)ConsesLow.cons(module0782.f50324(var226, module0048.f_1X(var226), module0782.f50332(ConsesLow.nth(var226, var221), (SubLObject)module0738.UNPROVIDED)), var220);
                }
            }
        }
        finally {
            module0584.$g4396$.rebind(var223, var219);
        }
        return Sequences.nreverse(var220);
    }
    
    public static SubLObject f45798(final SubLObject var238, final SubLObject var149) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0738.NIL != f45799(var149) && var238.numGE(module0782.f50326(var149)) && var238.numL(module0782.f50327(var149)));
    }
    
    public static SubLObject f45799(final SubLObject var149) {
        final SubLObject var150 = module0782.f50329(var149);
        return module0035.sublisp_boolean(module0782.f50334(var150));
    }
    
    public static SubLObject f45741(final SubLObject var34, final SubLObject var302) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0738.NIL != var34 || !module0737.f45341(var302).eql(module0738.$ic92$));
    }
    
    public static SubLObject f45739(final SubLObject var13) {
        return module0038.f2750(var13, (SubLObject)Characters.CHAR_period);
    }
    
    public static SubLObject f45740(final SubLObject var303, final SubLObject var6, final SubLObject var13) {
        if (module0738.NIL == var303) {
            return (SubLObject)module0738.T;
        }
        if (module0738.NIL != module0737.f45320(var6, (SubLObject)module0738.T)) {
            final SubLObject var304 = module0737.f45370(var6);
            if (var13.equalp(var304)) {
                return (SubLObject)module0738.T;
            }
        }
        else if (module0738.NIL != module0737.f45322(var6, (SubLObject)module0738.T)) {
            final SubLObject var304 = module0178.f11336(var6);
            if (var13.equalp(var304)) {
                return (SubLObject)module0738.T;
            }
        }
        else if (module0738.NIL != module0737.f45321(var6, (SubLObject)module0738.UNPROVIDED)) {
            final SubLObject var305 = module0737.f45506(var6);
            final SubLObject var306 = module0077.f5333(module0737.f45379(var6));
            SubLObject var307;
            SubLObject var308;
            SubLObject var309;
            SubLObject var310;
            SubLObject var311;
            SubLObject var312;
            for (var307 = module0032.f1741(var306), var308 = (SubLObject)module0738.NIL, var308 = module0032.f1742(var307, var306); module0738.NIL == module0032.f1744(var307, var308); var308 = module0032.f1743(var308)) {
                var309 = module0032.f1745(var307, var308);
                if (module0738.NIL != module0032.f1746(var308, var309)) {
                    var310 = module0737.f45508(var309);
                    var311 = module0737.f45510(var309);
                    var312 = module0737.f45512(var310, var305, var311);
                    if (var13.equalp(var312)) {
                        return (SubLObject)module0738.T;
                    }
                }
            }
        }
        return (SubLObject)module0738.NIL;
    }
    
    public static SubLObject f45745(final SubLObject var103, final SubLObject var309) {
        return module0004.f104(var103, var309, (SubLObject)module0738.$ic68$, (SubLObject)module0738.UNPROVIDED);
    }
    
    public static SubLObject f45800(final SubLObject var281, final SubLObject var218) {
        if (module0738.NIL != module0004.f104(var218, (SubLObject)module0738.$ic93$, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED)) {
            return var281;
        }
        final SubLObject var282 = module0737.f45526(var281);
        SubLObject var283 = (SubLObject)module0738.NIL;
        SubLObject var284 = var282;
        SubLObject var285 = (SubLObject)module0738.NIL;
        var285 = var284.first();
        while (module0738.NIL != var284) {
            final SubLObject var286 = module0737.f45376(var285);
            final SubLObject var287 = (module0738.NIL != var286) ? var286 : module0737.f45341(var285);
            if (module0738.NIL != module0731.f44644(var218, var287)) {
                var283 = (SubLObject)ConsesLow.cons(var285, var283);
            }
            var284 = var284.rest();
            var285 = var284.first();
        }
        return (SubLObject)((module0738.NIL != var283) ? module0737.f45524(module0737.f45525(var281), Sequences.nreverse(var283)) : module0738.NIL);
    }
    
    public static SubLObject f45738(final SubLObject var13, SubLObject var36, SubLObject var313) {
        if (var36 == module0738.UNPROVIDED) {
            var36 = module0585.$g4447$.getDynamicValue();
        }
        if (var313 == module0738.UNPROVIDED) {
            var313 = (SubLObject)module0738.NIL;
        }
        SubLObject var314 = module0737.f45432(var13, module0737.f45538(), var36);
        if (module0738.NIL != module0035.f2013(var314)) {
            var314 = f45801(var314, var313);
        }
        return (SubLObject)((module0738.NIL != module0035.f2012(var314) && var36.eql((SubLObject)module0738.$ic94$)) ? f45738(var13, (SubLObject)module0738.$ic78$, (SubLObject)module0738.UNPROVIDED) : ((var314 == module0738.$ic95$) ? module0738.NIL : var314));
    }
    
    public static SubLObject f45801(final SubLObject var314, SubLObject var313) {
        if (var313 == module0738.UNPROVIDED) {
            var313 = (SubLObject)module0738.NIL;
        }
        return f45787(var314, var313);
    }
    
    public static SubLObject f45787(final SubLObject var314, SubLObject var313) {
        if (var313 == module0738.UNPROVIDED) {
            var313 = (SubLObject)module0738.NIL;
        }
        final SubLThread var315 = SubLProcess.currentSubLThread();
        SubLObject var316 = (SubLObject)module0738.NIL;
        final SubLObject var317 = module0738.$g5865$.currentBinding(var315);
        try {
            module0738.$g5865$.bind(var313, var315);
            var316 = Sequences.remove_if((SubLObject)module0738.$ic96$, var314, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED);
        }
        finally {
            module0738.$g5865$.rebind(var317, var315);
        }
        return var316;
    }
    
    public static SubLObject f45802(final SubLObject var153, SubLObject var313) {
        if (var313 == module0738.UNPROVIDED) {
            var313 = module0738.$g5865$.getDynamicValue();
        }
        if (module0738.NIL != module0584.f35772() && module0738.NIL != module0035.find_if_not((SubLObject)module0738.$ic97$, module0737.f45390(var153), Symbols.symbol_function((SubLObject)module0738.$ic98$), (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED)) {
            return (SubLObject)module0738.T;
        }
        if (module0738.NIL == f45803(var153, var313)) {
            return (SubLObject)module0738.T;
        }
        return (SubLObject)module0738.NIL;
    }
    
    public static SubLObject f45803(final SubLObject var6, SubLObject var313) {
        if (var313 == module0738.UNPROVIDED) {
            var313 = module0738.$g5865$.getDynamicValue();
        }
        final SubLThread var314 = SubLProcess.currentSubLThread();
        final SubLObject var315 = (module0738.NIL != var313) ? module0737.f45376(var6) : module0737.f45341(var6);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0738.NIL == var315 || module0738.NIL != module0731.f44644(module0584.$g4396$.getDynamicValue(var314), var315));
    }
    
    public static SubLObject f45804(final SubLObject var13) {
        final SubLObject var14 = module0079.f5416(module0737.f45538(), var13, (SubLObject)module0738.UNPROVIDED);
        final SubLObject var15 = f45805(var13, var14);
        return (module0738.NIL != var15) ? var15 : var13;
    }
    
    public static SubLObject f45805(final SubLObject var13, final SubLObject var317) {
        final SubLThread var318 = SubLProcess.currentSubLThread();
        SubLObject var319 = (SubLObject)module0738.NIL;
        if (var317.isCons()) {
            var319 = var317.first().first();
            if (var319.isString() && !var319.eql(var13)) {}
        }
        else if (module0738.NIL != module0079.f5404(var317)) {
            final SubLObject var320 = module0079.f5424(var317);
            SubLObject var323;
            for (SubLObject var321 = var319; module0738.NIL == var321; var321 = (SubLObject)SubLObjectFactory.makeBoolean(module0738.NIL == var323 || module0738.NIL != var319)) {
                var318.resetMultipleValues();
                final SubLObject var322 = module0052.f3693(var320);
                var323 = var318.secondMultipleValue();
                var318.resetMultipleValues();
                if (module0738.NIL != var323) {
                    SubLObject var325;
                    final SubLObject var324 = var325 = var322;
                    SubLObject var326 = (SubLObject)module0738.NIL;
                    SubLObject var327 = (SubLObject)module0738.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var325, var324, (SubLObject)module0738.$ic99$);
                    var326 = var325.first();
                    var325 = var325.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var325, var324, (SubLObject)module0738.$ic99$);
                    var327 = var325.first();
                    var325 = var325.rest();
                    if (module0738.NIL == var325) {
                        final SubLObject var328 = f45805(var13, var327);
                        if (module0738.NIL != Functions.funcall(module0087.f5958(module0737.f45538()), var328, var13)) {
                            var319 = var328;
                        }
                        else if (var328.isString()) {
                            Errors.warn((SubLObject)module0738.$ic100$, var328, var13);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var324, (SubLObject)module0738.$ic99$);
                    }
                }
            }
        }
        return var319;
    }
    
    public static SubLObject f45806(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0738.$ic101$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0738.NIL;
        SubLObject var7 = (SubLObject)module0738.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0738.$ic101$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0738.$ic101$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0738.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0738.NIL;
        SubLObject var332_333 = (SubLObject)module0738.NIL;
        while (module0738.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0738.$ic101$);
            var332_333 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0738.$ic101$);
            if (module0738.NIL == conses_high.member(var332_333, (SubLObject)module0738.$ic102$, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED)) {
                var10 = (SubLObject)module0738.T;
            }
            if (var332_333 == module0738.$ic2$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0738.NIL != var10 && module0738.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0738.$ic101$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0738.$ic4$, var4);
        final SubLObject var12 = (SubLObject)((module0738.NIL != var11) ? conses_high.cadr(var11) : module0738.NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)module0738.$ic103$;
        final SubLObject var15 = (SubLObject)module0738.$ic104$;
        return (SubLObject)ConsesLow.list((SubLObject)module0738.$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var14, (SubLObject)ConsesLow.list((SubLObject)module0738.$ic105$, var7)), (SubLObject)ConsesLow.list(var15, (SubLObject)ConsesLow.list((SubLObject)module0738.$ic106$, var7))), (SubLObject)ConsesLow.list((SubLObject)module0738.$ic107$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0738.$ic108$, var14), var15), (SubLObject)ConsesLow.listS((SubLObject)module0738.$ic26$, (SubLObject)ConsesLow.list((SubLObject)module0738.$ic27$, (SubLObject)ConsesLow.list((SubLObject)module0738.$ic109$, var12), (SubLObject)ConsesLow.list((SubLObject)module0738.$ic110$, var6, var14)), ConsesLow.append(var13, (SubLObject)module0738.NIL))));
    }
    
    public static SubLObject f45807(final SubLObject var6, final SubLObject var335) {
        SubLObject var336 = (SubLObject)module0738.NIL;
        SubLObject var338;
        final SubLObject var337 = var338 = module0205.f13180(var335, (SubLObject)module0738.UNPROVIDED);
        SubLObject var339 = (SubLObject)module0738.NIL;
        SubLObject var340 = (SubLObject)module0738.NIL;
        SubLObject var341 = (SubLObject)module0738.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var338, var337, (SubLObject)module0738.$ic112$);
        var339 = var338.first();
        var338 = var338.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var338, var337, (SubLObject)module0738.$ic112$);
        var340 = var338.first();
        var338 = var338.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var338, var337, (SubLObject)module0738.$ic112$);
        var341 = var338.first();
        var338 = var338.rest();
        if (module0738.NIL == var338) {
            if (var340.equal(module0737.f45495(var6, (SubLObject)module0738.NIL)) && var341.equal(module0737.f45336(var6)) && module0738.NIL == var336) {
                SubLObject var342;
                SubLObject var343;
                for (var342 = module0737.f45359(var6), var343 = (SubLObject)module0738.NIL, var343 = var342.first(); module0738.NIL == var336 && module0738.NIL != var342; var336 = module0731.f44702(var343, var339, (SubLObject)module0738.UNPROVIDED), var342 = var342.rest(), var343 = var342.first()) {}
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var337, (SubLObject)module0738.$ic112$);
        }
        return var336;
    }
    
    public static SubLObject f45808(final SubLObject var205) {
        final SubLThread var206 = SubLProcess.currentSubLThread();
        SubLObject var207 = (SubLObject)module0738.NIL;
        SubLObject var208 = (SubLObject)module0738.NIL;
        final SubLObject var209 = module0191.f11967(var205);
        final SubLObject var210 = module0191.f11976(var205);
        final SubLObject var211 = module0584.$g4396$.currentBinding(var206);
        try {
            module0584.$g4396$.bind(var210, var206);
            SubLObject var213;
            final SubLObject var212 = var213 = f45738(module0205.f13388(var209, (SubLObject)module0738.UNPROVIDED), module0585.$g4447$.getDynamicValue(var206), (SubLObject)module0738.NIL);
            SubLObject var214 = (SubLObject)module0738.NIL;
            var214 = var213.first();
            while (module0738.NIL != var213) {
                if ((module0738.$ic14$ == module0738.$ic37$ || module0737.f45335(var214) == module0738.$ic37$) && module0738.NIL != f45740(f45739(module0205.f13388(var209, (SubLObject)module0738.UNPROVIDED)), var214, module0205.f13388(var209, (SubLObject)module0738.UNPROVIDED)) && module0738.NIL != f45741(module0584.$g4389$.getDynamicValue(var206), var214) && module0738.NIL == var207 && module0738.NIL != f45807(var214, var209)) {
                    final SubLObject var215 = module0077.f5333(module0737.f45400(var214));
                    SubLObject var216;
                    SubLObject var217;
                    SubLObject var218;
                    for (var216 = module0032.f1741(var215), var217 = (SubLObject)module0738.NIL, var217 = module0032.f1742(var216, var215); module0738.NIL == module0032.f1744(var216, var217); var217 = module0032.f1743(var217)) {
                        var218 = module0032.f1745(var216, var217);
                        if (module0738.NIL != module0032.f1746(var217, var218)) {
                            if (module0738.NIL != module0191.f11950(var218)) {
                                var207 = (SubLObject)ConsesLow.cons(var218, var207);
                                var208 = module0191.f11968(var218);
                            }
                            else if (module0738.NIL != module0737.f45422(var218, (SubLObject)module0738.UNPROVIDED)) {
                                var207 = module0737.f45424(var218);
                                var208 = module0205.f13132(var218.first());
                            }
                        }
                    }
                }
                var213 = var213.rest();
                var214 = var213.first();
            }
        }
        finally {
            module0584.$g4396$.rebind(var211, var206);
        }
        if (module0738.NIL != var208) {
            final SubLObject var219 = module0191.f11968(var205);
            if (!var219.equal(var208)) {
                var207 = (SubLObject)ConsesLow.cons(module0435.f30621(var208, var219), var207);
            }
        }
        return var207;
    }
    
    public static SubLObject f45809(final SubLObject var205) {
        final SubLThread var206 = SubLProcess.currentSubLThread();
        SubLObject var207 = (SubLObject)module0738.NIL;
        SubLObject var208 = (SubLObject)module0738.NIL;
        SubLObject var209 = (SubLObject)module0738.NIL;
        SubLObject var210 = (SubLObject)module0738.NIL;
        SubLObject var211 = (SubLObject)module0738.NIL;
        SubLObject var212 = (SubLObject)module0738.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var205, var205, (SubLObject)module0738.$ic113$);
        var209 = var205.first();
        SubLObject var213 = var205.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var213, var205, (SubLObject)module0738.$ic113$);
        var210 = var213.first();
        var213 = var213.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var213, var205, (SubLObject)module0738.$ic113$);
        var211 = var213.first();
        var213 = var213.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var213, var205, (SubLObject)module0738.$ic113$);
        var212 = var213.first();
        var213 = var213.rest();
        if (module0738.NIL == var213) {
            final SubLObject var214 = var211;
            if (var214.eql(module0738.$ic63$)) {
                final SubLObject var215 = module0191.f11967(var205);
                final SubLObject var341_352 = module0191.f11976(var205);
                final SubLObject var216 = module0584.$g4396$.currentBinding(var206);
                try {
                    module0584.$g4396$.bind(var341_352, var206);
                    SubLObject var218;
                    final SubLObject var217 = var218 = f45738(module0205.f13388(var215, (SubLObject)module0738.UNPROVIDED), module0585.$g4447$.getDynamicValue(var206), (SubLObject)module0738.NIL);
                    SubLObject var219 = (SubLObject)module0738.NIL;
                    var219 = var218.first();
                    while (module0738.NIL != var218) {
                        if ((module0738.$ic14$ == module0738.$ic37$ || module0737.f45335(var219) == module0738.$ic37$) && module0738.NIL != f45740(f45739(module0205.f13388(var215, (SubLObject)module0738.UNPROVIDED)), var219, module0205.f13388(var215, (SubLObject)module0738.UNPROVIDED)) && module0738.NIL != f45741(module0584.$g4389$.getDynamicValue(var206), var219) && module0738.NIL != f45807(var219, var215)) {
                            final SubLObject var220 = module0737.f45341(var219);
                            if (module0738.NIL == conses_high.member(var220, var208, Symbols.symbol_function((SubLObject)module0738.EQL), Symbols.symbol_function((SubLObject)module0738.IDENTITY))) {
                                var208 = (SubLObject)ConsesLow.cons(var220, var208);
                            }
                        }
                        var218 = var218.rest();
                        var219 = var218.first();
                    }
                }
                finally {
                    module0584.$g4396$.rebind(var216, var206);
                }
            }
            else {
                var207 = (SubLObject)ConsesLow.list(var205);
            }
            SubLObject var221 = module0262.f17370(var208, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED);
            SubLObject var218_353 = (SubLObject)module0738.NIL;
            var218_353 = var221.first();
            while (module0738.NIL != var221) {
                var207 = (SubLObject)ConsesLow.cons(module0191.f11990(var209, var210, var218_353, var212), var207);
                var221 = var221.rest();
                var218_353 = var221.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var205, (SubLObject)module0738.$ic113$);
        }
        return var207;
    }
    
    public static SubLObject f45810(final SubLObject var155, final SubLObject var13, final SubLObject var354, final SubLObject var355, final SubLObject var218) {
        final SubLThread var356 = SubLProcess.currentSubLThread();
        final SubLObject var357 = module0077.f5313(Symbols.symbol_function((SubLObject)module0738.EQUAL), (SubLObject)module0738.UNPROVIDED);
        final SubLObject var358 = module0584.$g4396$.currentBinding(var356);
        try {
            module0584.$g4396$.bind(var218, var356);
            SubLObject var360;
            final SubLObject var359 = var360 = f45738(var13, (SubLObject)((module0738.NIL != var355) ? module0738.$ic78$ : module0738.$ic79$), (SubLObject)module0738.T);
            SubLObject var361 = (SubLObject)module0738.NIL;
            var361 = var360.first();
            while (module0738.NIL != var360) {
                if ((module0738.$ic14$ == module0738.$ic14$ || module0737.f45335(var361) == module0738.$ic14$) && module0738.NIL != f45740(f45739(var13), var361, var13) && module0738.NIL != f45741(module0584.$g4389$.getDynamicValue(var356), var361) && module0738.NIL != module0077.f5318(var357) && module0738.NIL != module0004.f104(var155, module0737.f45361(var361), Symbols.symbol_function((SubLObject)module0738.$ic114$), (SubLObject)module0738.UNPROVIDED) && module0738.NIL != f45811(var361, var354, var218)) {
                    f45812(var361, var357, var155, var354, var218);
                }
                var360 = var360.rest();
                var361 = var360.first();
            }
        }
        finally {
            module0584.$g4396$.rebind(var358, var356);
        }
        return module0077.f5312(var357);
    }
    
    public static SubLObject f45812(final SubLObject var6, final SubLObject var224, final SubLObject var155, final SubLObject var354, final SubLObject var218) {
        if (module0738.NIL != module0737.f45320(var6, (SubLObject)module0738.UNPROVIDED) && module0738.NIL != module0191.f11950(var6)) {
            final SubLObject var355 = module0737.f45373(var6, (SubLObject)module0738.UNPROVIDED);
            if (module0738.NIL != module0269.f17718(var354, var218) && !var355.eql(var354) && module0738.NIL != module0260.f17089(var355, var354, var218, (SubLObject)module0738.UNPROVIDED)) {
                module0077.f5326(module0435.f30621(var355, var354), var224);
            }
            module0077.f5326(var6, var224);
        }
        else if (module0738.NIL != module0737.f45321(var6, (SubLObject)module0738.UNPROVIDED)) {
            final SubLObject var356 = module0077.f5333(module0737.f45379(var6));
            SubLObject var357;
            SubLObject var358;
            SubLObject var359;
            for (var357 = module0032.f1741(var356), var358 = (SubLObject)module0738.NIL, var358 = module0032.f1742(var357, var356); module0738.NIL == module0032.f1744(var357, var358); var358 = module0032.f1743(var358)) {
                var359 = module0032.f1745(var357, var358);
                if (module0738.NIL != module0032.f1746(var358, var359) && module0738.NIL != module0004.f104(var155, module0737.f45480(var359, (SubLObject)module0738.UNPROVIDED), Symbols.symbol_function((SubLObject)module0738.EQUAL), (SubLObject)module0738.UNPROVIDED)) {
                    module0077.f5326(var359, var224);
                }
            }
            SubLObject var360 = (SubLObject)module0738.NIL;
            final SubLObject var361 = module0077.f5333(module0737.f45400(var6));
            SubLObject var362;
            SubLObject var363;
            SubLObject var364;
            SubLObject var365;
            SubLObject var366;
            for (var362 = module0032.f1741(var361), var363 = (SubLObject)module0738.NIL, var363 = module0032.f1742(var362, var361); module0738.NIL == module0032.f1744(var362, var363); var363 = module0032.f1743(var363)) {
                var364 = module0032.f1745(var362, var363);
                if (module0738.NIL != module0032.f1746(var363, var364)) {
                    var365 = module0737.f45439(var364);
                    var366 = module0731.f44690(var365, var218);
                    if (module0738.NIL == var366 || module0738.NIL == var360) {
                        if (module0738.NIL != var366 && !var365.eql(var354) && module0738.NIL != module0260.f17089(var365, var354, var218, (SubLObject)module0738.UNPROVIDED)) {
                            module0077.f5326(module0435.f30621(var365, var354), var224);
                        }
                        if (module0738.NIL != module0191.f11950(var364)) {
                            module0077.f5326(var364, var224);
                        }
                        else if (module0738.NIL != module0737.f45422(var364, (SubLObject)module0738.UNPROVIDED)) {
                            module0078.f5374(module0737.f45424(var364), var224);
                        }
                        if (module0738.NIL != var366) {
                            var360 = var365;
                        }
                    }
                }
            }
        }
        return var224;
    }
    
    public static SubLObject f45811(final SubLObject var6, final SubLObject var354, final SubLObject var218) {
        if (module0738.NIL != conses_high.member(var354, (SubLObject)module0738.$ic115$, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED)) {
            return (SubLObject)module0738.T;
        }
        if (module0738.NIL != module0737.f45320(var6, (SubLObject)module0738.UNPROVIDED)) {
            return (SubLObject)SubLObjectFactory.makeBoolean((module0738.NIL != module0737.f45519(var354) && module0738.NIL != module0260.f17089(module0737.f45373(var6, (SubLObject)module0738.UNPROVIDED), var354, var218, (SubLObject)module0738.UNPROVIDED)) || module0738.NIL != module0256.f16576(module0738.$ic116$, var354, var218, (SubLObject)module0738.UNPROVIDED) || module0738.NIL != module0256.f16576(module0738.$ic117$, var354, var218, (SubLObject)module0738.UNPROVIDED));
        }
        if (module0738.NIL != module0256.f16576(var354, module0738.$ic118$, var218, (SubLObject)module0738.UNPROVIDED)) {
            return (SubLObject)module0738.NIL;
        }
        if (module0738.NIL != module0737.f45321(var6, (SubLObject)module0738.UNPROVIDED) && module0738.NIL != module0220.f14548(var354, module0738.$ic119$, var218, (SubLObject)module0738.TWO_INTEGER, (SubLObject)module0738.UNPROVIDED)) {
            return f45811(var6, module0220.f14557(var354, module0738.$ic119$, var218, (SubLObject)module0738.TWO_INTEGER, (SubLObject)module0738.ONE_INTEGER, (SubLObject)module0738.UNPROVIDED), var218);
        }
        if (module0738.NIL != module0737.f45321(var6, (SubLObject)module0738.UNPROVIDED) && module0738.NIL != module0731.f44656(var354, var218)) {
            return module0731.f44713(module0737.f45358(var6), var354, var218);
        }
        if (module0738.NIL != module0737.f45321(var6, (SubLObject)module0738.UNPROVIDED) && module0738.NIL != module0731.f44690(var354, var218)) {
            SubLObject var355 = module0737.f45360(var6);
            SubLObject var356 = (SubLObject)module0738.NIL;
            var356 = var355.first();
            while (module0738.NIL != var355) {
                if (module0738.NIL != module0731.f44702(var356, var354, var218)) {
                    return (SubLObject)module0738.T;
                }
                var355 = var355.rest();
                var356 = var355.first();
            }
            return (SubLObject)module0738.NIL;
        }
        if (module0738.NIL != module0737.f45321(var6, (SubLObject)module0738.UNPROVIDED) && module0738.NIL != module0737.f45519(var354)) {
            return (SubLObject)module0738.NIL;
        }
        Errors.error((SubLObject)module0738.$ic120$, var354, var6);
        return (SubLObject)module0738.NIL;
    }
    
    public static SubLObject f45813(final SubLObject var13) {
        if (!var13.isString()) {
            Errors.warn((SubLObject)module0738.$ic124$, var13);
            return (SubLObject)module0738.NIL;
        }
        return module0038.f2754(var13, module0738.$g5870$.getGlobalValue(), module0738.$g5867$.getGlobalValue(), module0738.$g5869$.getGlobalValue(), (SubLObject)module0738.UNPROVIDED);
    }
    
    public static SubLObject f45814(final SubLObject var357, final SubLObject var358) {
        f45815(var357, var358, (SubLObject)module0738.ZERO_INTEGER);
        return (SubLObject)module0738.NIL;
    }
    
    public static SubLObject f45816(final SubLObject var357) {
        return (SubLObject)((var357.getClass() == $sX50013_native.class) ? module0738.T : module0738.NIL);
    }
    
    public static SubLObject f45817(final SubLObject var357) {
        assert module0738.NIL != f45816(var357) : var357;
        return var357.getField2();
    }
    
    public static SubLObject f45818(final SubLObject var357) {
        assert module0738.NIL != f45816(var357) : var357;
        return var357.getField3();
    }
    
    public static SubLObject f45819(final SubLObject var357) {
        assert module0738.NIL != f45816(var357) : var357;
        return var357.getField4();
    }
    
    public static SubLObject f45820(final SubLObject var357, final SubLObject var359) {
        assert module0738.NIL != f45816(var357) : var357;
        return var357.setField2(var359);
    }
    
    public static SubLObject f45821(final SubLObject var357, final SubLObject var359) {
        assert module0738.NIL != f45816(var357) : var357;
        return var357.setField3(var359);
    }
    
    public static SubLObject f45822(final SubLObject var357, final SubLObject var359) {
        assert module0738.NIL != f45816(var357) : var357;
        return var357.setField4(var359);
    }
    
    public static SubLObject f45823(SubLObject var360) {
        if (var360 == module0738.UNPROVIDED) {
            var360 = (SubLObject)module0738.NIL;
        }
        final SubLObject var361 = (SubLObject)new $sX50013_native();
        SubLObject var362;
        SubLObject var363;
        SubLObject var364;
        SubLObject var365;
        for (var362 = (SubLObject)module0738.NIL, var362 = var360; module0738.NIL != var362; var362 = conses_high.cddr(var362)) {
            var363 = var362.first();
            var364 = conses_high.cadr(var362);
            var365 = var363;
            if (var365.eql((SubLObject)module0738.$ic140$)) {
                f45820(var361, var364);
            }
            else if (var365.eql((SubLObject)module0738.$ic141$)) {
                f45821(var361, var364);
            }
            else if (var365.eql((SubLObject)module0738.$ic142$)) {
                f45822(var361, var364);
            }
            else {
                Errors.error((SubLObject)module0738.$ic143$, var363);
            }
        }
        return var361;
    }
    
    public static SubLObject f45824(final SubLObject var365, final SubLObject var366) {
        Functions.funcall(var366, var365, (SubLObject)module0738.$ic144$, (SubLObject)module0738.$ic145$, (SubLObject)module0738.THREE_INTEGER);
        Functions.funcall(var366, var365, (SubLObject)module0738.$ic146$, (SubLObject)module0738.$ic140$, f45817(var365));
        Functions.funcall(var366, var365, (SubLObject)module0738.$ic146$, (SubLObject)module0738.$ic141$, f45818(var365));
        Functions.funcall(var366, var365, (SubLObject)module0738.$ic146$, (SubLObject)module0738.$ic142$, f45819(var365));
        Functions.funcall(var366, var365, (SubLObject)module0738.$ic147$, (SubLObject)module0738.$ic145$, (SubLObject)module0738.THREE_INTEGER);
        return var365;
    }
    
    public static SubLObject f45825(final SubLObject var365, final SubLObject var366) {
        return f45824(var365, var366);
    }
    
    public static SubLObject f45826(final SubLObject var367, final SubLObject var368, final SubLObject var218) {
        final SubLObject var369 = f45823((SubLObject)module0738.UNPROVIDED);
        f45820(var369, var367);
        f45821(var369, var368);
        f45822(var369, var218);
        return var369;
    }
    
    public static SubLObject f45815(final SubLObject var370, final SubLObject var358, final SubLObject var371) {
        PrintLow.format(var358, (SubLObject)module0738.$ic149$, new SubLObject[] { f45817(var370), f45818(var370), f45819(var370) });
        return var370;
    }
    
    public static SubLObject f45827(final SubLObject var368, final SubLObject var372) {
        SubLObject var373 = (SubLObject)module0738.NIL;
        SubLObject var374 = var372;
        SubLObject var375 = (SubLObject)module0738.NIL;
        var375 = var374.first();
        while (module0738.NIL != var374) {
            var373 = Sequences.cconcatenate(var373, f45828(var368, var375));
            var374 = var374.rest();
            var375 = var374.first();
        }
        return var373;
    }
    
    public static SubLObject f45828(final SubLObject var368, final SubLObject var302) {
        SubLObject var369 = (SubLObject)module0738.NIL;
        final SubLObject var370 = module0737.f45341(var302);
        if (module0738.NIL != module0737.f45320(var302, (SubLObject)module0738.T)) {
            final SubLObject var371 = module0737.f45348(var302);
            var369 = (SubLObject)ConsesLow.cons(f45826(var371, var368, var370), var369);
        }
        else if (module0738.NIL != module0737.f45322(var302, (SubLObject)module0738.T)) {
            final SubLObject var371 = module0178.f11334(var302);
            var369 = (SubLObject)ConsesLow.cons(f45826(var371, var368, var370), var369);
        }
        else if (module0738.NIL != module0737.f45321(var302, (SubLObject)module0738.UNPROVIDED)) {
            final SubLObject var372 = module0737.f45374(var302, (SubLObject)module0738.NIL);
            final SubLObject var373 = (SubLObject)((module0738.NIL != module0212.f13762(var372)) ? module0732.f44992(var372) : module0738.NIL);
            if (var373.isInteger()) {
                final SubLObject var374 = module0077.f5333(module0737.f45379(var302));
                SubLObject var375;
                SubLObject var376;
                SubLObject var377;
                SubLObject var378;
                SubLObject var379;
                for (var375 = module0032.f1741(var374), var376 = (SubLObject)module0738.NIL, var376 = module0032.f1742(var375, var374); module0738.NIL == module0032.f1744(var375, var376); var376 = module0032.f1743(var376)) {
                    var377 = module0032.f1745(var375, var376);
                    if (module0738.NIL != module0032.f1746(var376, var377)) {
                        var378 = module0737.f45480(var377, var373);
                        var379 = (SubLObject)module0738.NIL;
                        var379 = var378.first();
                        while (module0738.NIL != var378) {
                            var369 = (SubLObject)ConsesLow.cons(f45826(var379, var368, var370), var369);
                            var378 = var378.rest();
                            var379 = var378.first();
                        }
                    }
                }
            }
        }
        return var369;
    }
    
    public static SubLObject f45829(SubLObject var377) {
        if (var377 == module0738.UNPROVIDED) {
            var377 = (SubLObject)module0738.NIL;
        }
        module0738.$g5866$.setGlobalValue((SubLObject)module0738.NIL);
        return f45830(var377);
    }
    
    public static SubLObject f45830(SubLObject var377) {
        if (var377 == module0738.UNPROVIDED) {
            var377 = (SubLObject)module0738.NIL;
        }
        if (module0738.NIL == f45831()) {
            module0738.$g5870$.setGlobalValue(module0063.f4560((SubLObject)module0738.T, (SubLObject)module0738.$ic150$, (SubLObject)module0738.T, Symbols.symbol_function((SubLObject)module0738.EQL)));
            SubLObject var378 = module0731.f44757((SubLObject)module0738.UNPROVIDED);
            SubLObject var379 = (SubLObject)module0738.NIL;
            var379 = var378.first();
            while (module0738.NIL != var378) {
                module0063.f4562(module0738.$g5870$.getGlobalValue(), var379, var379, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED);
                var378 = var378.rest();
                var379 = var378.first();
            }
            module0738.$g5866$.setGlobalValue(f45832(var377, (SubLObject)module0738.UNPROVIDED));
        }
        return (SubLObject)module0738.T;
    }
    
    public static SubLObject f45831() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0738.NIL != module0063.f4523(module0738.$g5866$.getGlobalValue()) && module0063.f4568(module0738.$g5866$.getGlobalValue()).numG((SubLObject)module0738.ZERO_INTEGER));
    }
    
    public static SubLObject f45833() {
        return (SubLObject)module0738.T;
    }
    
    public static SubLObject f45832(SubLObject var377, SubLObject var247) {
        if (var377 == module0738.UNPROVIDED) {
            var377 = (SubLObject)module0738.NIL;
        }
        if (var247 == module0738.UNPROVIDED) {
            var247 = module0737.f45538();
        }
        final SubLThread var378 = SubLProcess.currentSubLThread();
        final SubLObject var379 = module0063.f4560((SubLObject)module0738.NIL, (SubLObject)module0738.$ic151$, (SubLObject)module0738.T, Symbols.symbol_function((SubLObject)module0738.EQUALP));
        final SubLObject var380 = (module0738.NIL != var377) ? var377 : module0737.f45542(var247);
        final SubLObject var381 = Numbers.integerDivide(var380, (SubLObject)module0738.TEN_INTEGER);
        SubLObject var382 = (SubLObject)module0738.ZERO_INTEGER;
        SubLObject var383 = (SubLObject)module0738.NIL;
        final SubLObject var384 = module0139.$g1630$.getDynamicValue(var378);
        final SubLObject var385 = module0139.$g1631$.currentBinding(var378);
        final SubLObject var386 = module0139.$g1632$.currentBinding(var378);
        final SubLObject var387 = module0139.$g1630$.currentBinding(var378);
        try {
            module0139.$g1631$.bind(module0139.f9015(var384, (SubLObject)module0738.SIX_INTEGER), var378);
            module0139.$g1632$.bind(module0139.f9016(var384), var378);
            module0139.$g1630$.bind((SubLObject)module0738.T, var378);
            final SubLObject var388 = module0737.$g5846$.getGlobalValue();
            SubLObject var389 = (SubLObject)module0738.NIL;
            try {
                var389 = Locks.seize_lock(var388);
                final SubLObject var87_387 = module0096.$g1265$.currentBinding(var378);
                try {
                    module0096.$g1265$.bind(module0737.$g5827$.getGlobalValue(), var378);
                    final SubLObject var390 = module0054.f3968();
                    final SubLObject var391 = module0737.f45538();
                    final SubLObject var392 = (SubLObject)module0738.$ic152$;
                    SubLObject var393 = (SubLObject)module0738.ZERO_INTEGER;
                    final SubLObject var394 = module0079.f5406(var391);
                    assert module0738.NIL != Types.stringp(var392) : var392;
                    final SubLObject var87_388 = module0012.$g75$.currentBinding(var378);
                    final SubLObject var225_394 = module0012.$g76$.currentBinding(var378);
                    final SubLObject var384_395 = module0012.$g77$.currentBinding(var378);
                    final SubLObject var395 = module0012.$g78$.currentBinding(var378);
                    try {
                        module0012.$g75$.bind((SubLObject)module0738.ZERO_INTEGER, var378);
                        module0012.$g76$.bind((SubLObject)module0738.NIL, var378);
                        module0012.$g77$.bind((SubLObject)module0738.T, var378);
                        module0012.$g78$.bind(Time.get_universal_time(), var378);
                        module0012.f478(var392);
                        final SubLObject var396 = module0079.f5424(var391);
                        SubLObject var399;
                        for (SubLObject var397 = var383; module0738.NIL == var397; var397 = (SubLObject)SubLObjectFactory.makeBoolean(module0738.NIL == var399 || module0738.NIL != var383)) {
                            var378.resetMultipleValues();
                            final SubLObject var398 = module0052.f3693(var396);
                            var399 = var378.secondMultipleValue();
                            var378.resetMultipleValues();
                            if (module0738.NIL != var399) {
                                SubLObject var401;
                                final SubLObject var400 = var401 = var398;
                                SubLObject var402 = (SubLObject)module0738.NIL;
                                SubLObject var403 = (SubLObject)module0738.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var401, var400, (SubLObject)module0738.$ic153$);
                                var402 = var401.first();
                                var401 = var401.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var401, var400, (SubLObject)module0738.$ic153$);
                                var403 = var401.first();
                                var401 = var401.rest();
                                if (module0738.NIL == var401) {
                                    module0012.note_percent_progress(var393, var394);
                                    var393 = Numbers.add(var393, (SubLObject)module0738.ONE_INTEGER);
                                    if (module0738.NIL != module0079.f5404(var403)) {
                                        module0054.f3973(var403, var390);
                                        while (module0738.NIL == var383 && module0738.NIL == module0054.f3970(var390)) {
                                            final SubLObject var404 = module0054.f3974(var390);
                                            final SubLObject var319_402 = module0079.f5424(var404);
                                            SubLObject var322_405;
                                            for (SubLObject var320_403 = var383; module0738.NIL == var320_403; var320_403 = (SubLObject)SubLObjectFactory.makeBoolean(module0738.NIL == var322_405 || module0738.NIL != var383)) {
                                                var378.resetMultipleValues();
                                                final SubLObject var321_404 = module0052.f3693(var319_402);
                                                var322_405 = var378.secondMultipleValue();
                                                var378.resetMultipleValues();
                                                if (module0738.NIL != var322_405) {
                                                    SubLObject var408_409;
                                                    final SubLObject var406_407 = var408_409 = var321_404;
                                                    SubLObject var405 = (SubLObject)module0738.NIL;
                                                    SubLObject var406 = (SubLObject)module0738.NIL;
                                                    cdestructuring_bind.destructuring_bind_must_consp(var408_409, var406_407, (SubLObject)module0738.$ic154$);
                                                    var405 = var408_409.first();
                                                    var408_409 = var408_409.rest();
                                                    cdestructuring_bind.destructuring_bind_must_consp(var408_409, var406_407, (SubLObject)module0738.$ic154$);
                                                    var406 = var408_409.first();
                                                    var408_409 = var408_409.rest();
                                                    if (module0738.NIL == var408_409) {
                                                        if (module0738.NIL != module0079.f5404(var406)) {
                                                            module0054.f3973(var406, var390);
                                                        }
                                                        else if (var406.isCons()) {
                                                            final SubLObject var407 = var406.first();
                                                            final SubLObject var408 = var406.rest();
                                                            f45834(var408, (SubLObject)module0738.NIL, var379);
                                                            var382 = Numbers.add(var382, (SubLObject)module0738.ONE_INTEGER);
                                                            var383 = Numbers.numGE(var382, var380);
                                                        }
                                                    }
                                                    else {
                                                        cdestructuring_bind.cdestructuring_bind_error(var406_407, (SubLObject)module0738.$ic154$);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    else if (var403.isCons()) {
                                        final SubLObject var409 = var403.first();
                                        final SubLObject var410 = var403.rest();
                                        f45834(var410, (SubLObject)module0738.NIL, var379);
                                        var382 = Numbers.add(var382, (SubLObject)module0738.ONE_INTEGER);
                                        var383 = Numbers.numGE(var382, var380);
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var400, (SubLObject)module0738.$ic153$);
                                }
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var395, var378);
                        module0012.$g77$.rebind(var384_395, var378);
                        module0012.$g76$.rebind(var225_394, var378);
                        module0012.$g75$.rebind(var87_388, var378);
                    }
                }
                finally {
                    module0096.$g1265$.rebind(var87_387, var378);
                }
            }
            finally {
                if (module0738.NIL != var389) {
                    Locks.release_lock(var388);
                }
            }
        }
        finally {
            module0139.$g1630$.rebind(var387, var378);
            module0139.$g1632$.rebind(var386, var378);
            module0139.$g1631$.rebind(var385, var378);
        }
        return var379;
    }
    
    public static SubLObject f45834(final SubLObject var372, SubLObject var413, SubLObject var378) {
        if (var413 == module0738.UNPROVIDED) {
            var413 = (SubLObject)module0738.NIL;
        }
        if (var378 == module0738.UNPROVIDED) {
            var378 = module0738.$g5866$.getGlobalValue();
        }
        if (module0738.NIL != module0063.f4523(var378)) {
            SubLObject var414 = var372;
            SubLObject var415 = (SubLObject)module0738.NIL;
            var415 = var414.first();
            while (module0738.NIL != var414) {
                if (module0738.NIL == f45802(var415, (SubLObject)module0738.UNPROVIDED)) {
                    final SubLObject var416 = module0737.f45336(var415);
                    final SubLObject var417 = f45813(var416);
                    final SubLObject var418 = (module0738.NIL != var413) ? Symbols.symbol_function((SubLObject)module0738.$ic155$) : Symbols.symbol_function((SubLObject)module0738.$ic156$);
                    final SubLObject var419 = f45828(var416, var415);
                    SubLObject var94_417 = (SubLObject)ConsesLow.cons(var416, var417);
                    SubLObject var420 = (SubLObject)module0738.NIL;
                    var420 = var94_417.first();
                    while (module0738.NIL != var94_417) {
                        SubLObject var94_418 = var419;
                        SubLObject var421 = (SubLObject)module0738.NIL;
                        var421 = var94_418.first();
                        while (module0738.NIL != var94_418) {
                            Functions.funcall(var418, var378, module0777.f50092(module0737.f45705(var420)), var421);
                            var94_418 = var94_418.rest();
                            var421 = var94_418.first();
                        }
                        var94_417 = var94_417.rest();
                        var420 = var94_417.first();
                    }
                }
                var414 = var414.rest();
                var415 = var414.first();
            }
            return (SubLObject)module0738.T;
        }
        return (SubLObject)module0738.NIL;
    }
    
    public static SubLObject f45835(final SubLObject var421, final SubLObject var422) {
        if (var422.eql((SubLObject)module0738.$ic157$)) {
            return f45836(var421);
        }
        return f45837(var421, var422);
    }
    
    public static SubLObject f45837(final SubLObject var421, final SubLObject var422) {
        if (module0738.NIL != module0038.f2653(var421) && module0738.NIL != module0063.f4523(module0738.$g5866$.getGlobalValue())) {
            final SubLObject var423 = module0777.f50092(module0737.f45705(var421));
            final SubLObject var424 = module0063.f4584(module0738.$g5866$.getGlobalValue(), var423, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED);
            final SubLObject var425 = (SubLObject)((var422 == module0738.$ic158$) ? Symbols.symbol_function((SubLObject)module0738.$ic159$) : ((var422 == module0738.$ic160$) ? Symbols.symbol_function((SubLObject)module0738.$ic161$) : module0738.NIL));
            SubLObject var426 = var424;
            if (var422 != module0738.$ic157$) {
                var426 = (SubLObject)module0738.NIL;
                SubLObject var427 = Sequences.remove_duplicates(var424, Symbols.symbol_function((SubLObject)module0738.EQUAL), (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED);
                SubLObject var428 = (SubLObject)module0738.NIL;
                var428 = var427.first();
                while (module0738.NIL != var427) {
                    if (module0738.NIL != Functions.funcall(var425, f45818(var428), var421)) {
                        var426 = (SubLObject)ConsesLow.cons(var428, var426);
                    }
                    var427 = var427.rest();
                    var428 = var427.first();
                }
            }
            var426 = Sort.sort(var426, Symbols.symbol_function((SubLObject)module0738.$ic162$), Symbols.symbol_function((SubLObject)module0738.$ic136$));
            var426 = Sort.stable_sort(var426, Symbols.symbol_function((SubLObject)module0738.$ic163$), Symbols.symbol_function((SubLObject)module0738.$ic136$));
            return var426;
        }
        return (SubLObject)module0738.NIL;
    }
    
    public static SubLObject f45836(final SubLObject var427) {
        final SubLObject var428 = f45838(var427);
        final SubLObject var429 = Vectors.make_vector(Sequences.length(var428), (SubLObject)module0738.UNPROVIDED);
        SubLObject var430 = (SubLObject)module0738.NIL;
        SubLObject var431 = (SubLObject)module0738.NIL;
        SubLObject var432 = (SubLObject)module0738.NIL;
        var430 = var428;
        var431 = var430.first();
        for (var432 = (SubLObject)module0738.ZERO_INTEGER; module0738.NIL != var430; var430 = var430.rest(), var431 = var430.first(), var432 = Numbers.add((SubLObject)module0738.ONE_INTEGER, var432)) {
            Vectors.set_aref(var429, var432, module0067.f4880((SubLObject)module0738.EQUAL, (SubLObject)module0738.UNPROVIDED));
            final SubLObject var433 = Vectors.aref(var429, var432);
            SubLObject var435;
            final SubLObject var434 = var435 = f45837(var431, (SubLObject)module0738.$ic157$);
            SubLObject var436 = (SubLObject)module0738.NIL;
            var436 = var435.first();
            while (module0738.NIL != var435) {
                module0084.f5762(var433, f45817(var436), var436);
                var435 = var435.rest();
                var436 = var435.first();
            }
        }
        return f45839(var429, var428);
    }
    
    public static SubLObject f45839(final SubLObject var429, final SubLObject var436) {
        final SubLThread var437 = SubLProcess.currentSubLThread();
        SubLObject var438 = (SubLObject)module0738.NIL;
        final SubLObject var439 = Sequences.length(var436);
        SubLObject var440;
        for (var440 = module0066.f4838(module0067.f4891(Vectors.aref(var429, (SubLObject)module0738.ZERO_INTEGER))); module0738.NIL == module0066.f4841(var440); var440 = module0066.f4840(var440)) {
            var437.resetMultipleValues();
            final SubLObject var441 = module0066.f4839(var440);
            final SubLObject var442 = var437.secondMultipleValue();
            var437.resetMultipleValues();
            SubLObject var443 = (SubLObject)module0738.NIL;
            SubLObject var444;
            SubLObject var445;
            for (var444 = Numbers.subtract(Sequences.length(var429), (SubLObject)module0738.ONE_INTEGER), var445 = (SubLObject)module0738.NIL, var445 = (SubLObject)module0738.ZERO_INTEGER; var445.numL(var444); var445 = Numbers.add(var445, (SubLObject)module0738.ONE_INTEGER)) {
                if (module0738.NIL == module0067.f4885(Vectors.aref(var429, module0048.f_1X(var445)), var441, (SubLObject)module0738.UNPROVIDED)) {
                    var443 = (SubLObject)module0738.T;
                }
            }
            if (module0738.NIL == var443) {
                SubLObject var446 = var442;
                SubLObject var447 = (SubLObject)module0738.NIL;
                var447 = var446.first();
                while (module0738.NIL != var446) {
                    if (var439.eql((SubLObject)module0738.ONE_INTEGER) || module0738.NIL != module0038.f2859(var436, f45818(var447), (SubLObject)module0738.UNPROVIDED)) {
                        var438 = (SubLObject)ConsesLow.cons(var447, var438);
                    }
                    var446 = var446.rest();
                    var447 = var446.first();
                }
            }
        }
        module0066.f4842(var440);
        return var438;
    }
    
    public static SubLObject f45838(final SubLObject var421) {
        return (SubLObject)ConsesLow.list(module0777.f50092(module0737.f45705(var421)));
    }
    
    public static SubLObject f45840(SubLObject var358, SubLObject var441, SubLObject var442, SubLObject var443) {
        if (var358 == module0738.UNPROVIDED) {
            var358 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var441 == module0738.UNPROVIDED) {
            var441 = (SubLObject)module0738.T;
        }
        if (var442 == module0738.UNPROVIDED) {
            var442 = Symbols.symbol_function((SubLObject)module0738.EQUALP);
        }
        if (var443 == module0738.UNPROVIDED) {
            var443 = (SubLObject)Characters.CHAR_newline;
        }
        final SubLThread var444 = SubLProcess.currentSubLThread();
        if (module0738.NIL == Errors.$ignore_mustsP$.getDynamicValue(var444) && module0738.NIL == module0737.f45541((SubLObject)module0738.UNPROVIDED)) {
            Errors.error((SubLObject)module0738.$ic164$);
        }
        final SubLObject var445 = module0737.$g5846$.getGlobalValue();
        SubLObject var446 = (SubLObject)module0738.NIL;
        try {
            var446 = Locks.seize_lock(var445);
            final SubLObject var447 = (SubLObject)((module0738.NIL != var441) ? module0077.f5313(var442, (SubLObject)module0738.UNPROVIDED) : module0738.NIL);
            final SubLObject var448 = Sequences.delete_duplicates((SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_period, conses_high.union(module0038.f2819(), module0038.f2818(), (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED)), (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED);
            final SubLObject var448_449 = module0737.$g5846$.getGlobalValue();
            SubLObject var450_451 = (SubLObject)module0738.NIL;
            try {
                var450_451 = Locks.seize_lock(var448_449);
                final SubLObject var449 = module0096.$g1265$.currentBinding(var444);
                try {
                    module0096.$g1265$.bind(module0737.$g5827$.getGlobalValue(), var444);
                    final SubLObject var450 = module0054.f3968();
                    final SubLObject var451 = module0737.f45538();
                    final SubLObject var452 = (SubLObject)module0738.$ic165$;
                    SubLObject var453 = (SubLObject)module0738.ZERO_INTEGER;
                    final SubLObject var454 = module0079.f5406(var451);
                    assert module0738.NIL != Types.stringp(var452) : var452;
                    final SubLObject var87_452 = module0012.$g75$.currentBinding(var444);
                    final SubLObject var455 = module0012.$g76$.currentBinding(var444);
                    final SubLObject var456 = module0012.$g77$.currentBinding(var444);
                    final SubLObject var457 = module0012.$g78$.currentBinding(var444);
                    try {
                        module0012.$g75$.bind((SubLObject)module0738.ZERO_INTEGER, var444);
                        module0012.$g76$.bind((SubLObject)module0738.NIL, var444);
                        module0012.$g77$.bind((SubLObject)module0738.T, var444);
                        module0012.$g78$.bind(Time.get_universal_time(), var444);
                        module0012.f478(var452);
                        final SubLObject var458 = module0079.f5424(var451);
                        SubLObject var461;
                        for (SubLObject var459 = (SubLObject)module0738.NIL; module0738.NIL == var459; var459 = (SubLObject)SubLObjectFactory.makeBoolean(module0738.NIL == var461)) {
                            var444.resetMultipleValues();
                            final SubLObject var460 = module0052.f3693(var458);
                            var461 = var444.secondMultipleValue();
                            var444.resetMultipleValues();
                            if (module0738.NIL != var461) {
                                SubLObject var463;
                                final SubLObject var462 = var463 = var460;
                                SubLObject var464 = (SubLObject)module0738.NIL;
                                SubLObject var465 = (SubLObject)module0738.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var463, var462, (SubLObject)module0738.$ic153$);
                                var464 = var463.first();
                                var463 = var463.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var463, var462, (SubLObject)module0738.$ic153$);
                                var465 = var463.first();
                                var463 = var463.rest();
                                if (module0738.NIL == var463) {
                                    module0012.note_percent_progress(var453, var454);
                                    var453 = Numbers.add(var453, (SubLObject)module0738.ONE_INTEGER);
                                    if (module0738.NIL != module0079.f5404(var465)) {
                                        module0054.f3973(var465, var450);
                                        while (module0738.NIL == module0054.f3970(var450)) {
                                            final SubLObject var466 = module0054.f3974(var450);
                                            final SubLObject var319_455 = module0079.f5424(var466);
                                            SubLObject var322_458;
                                            for (SubLObject var320_456 = (SubLObject)module0738.NIL; module0738.NIL == var320_456; var320_456 = (SubLObject)SubLObjectFactory.makeBoolean(module0738.NIL == var322_458)) {
                                                var444.resetMultipleValues();
                                                final SubLObject var321_457 = module0052.f3693(var319_455);
                                                var322_458 = var444.secondMultipleValue();
                                                var444.resetMultipleValues();
                                                if (module0738.NIL != var322_458) {
                                                    SubLObject var461_462;
                                                    final SubLObject var459_460 = var461_462 = var321_457;
                                                    SubLObject var467 = (SubLObject)module0738.NIL;
                                                    SubLObject var468 = (SubLObject)module0738.NIL;
                                                    cdestructuring_bind.destructuring_bind_must_consp(var461_462, var459_460, (SubLObject)module0738.$ic154$);
                                                    var467 = var461_462.first();
                                                    var461_462 = var461_462.rest();
                                                    cdestructuring_bind.destructuring_bind_must_consp(var461_462, var459_460, (SubLObject)module0738.$ic154$);
                                                    var468 = var461_462.first();
                                                    var461_462 = var461_462.rest();
                                                    if (module0738.NIL == var461_462) {
                                                        if (module0738.NIL != module0079.f5404(var468)) {
                                                            module0054.f3973(var468, var450);
                                                        }
                                                        else if (var468.isCons()) {
                                                            final SubLObject var469 = var468.first();
                                                            SubLObject var471;
                                                            final SubLObject var470 = var471 = var468.rest();
                                                            SubLObject var6_463 = (SubLObject)module0738.NIL;
                                                            var6_463 = var471.first();
                                                            while (module0738.NIL != var471) {
                                                                SubLObject var94_464 = module0038.f2738(module0737.f45336(var6_463), var448, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED);
                                                                SubLObject var472 = (SubLObject)module0738.NIL;
                                                                var472 = var94_464.first();
                                                                while (module0738.NIL != var94_464) {
                                                                    if (module0738.NIL == var441 || module0738.NIL == module0077.f5320(var472, var447)) {
                                                                        print_high.princ(var472, var358);
                                                                        print_high.princ(var443, var358);
                                                                        if (module0738.NIL != var441) {
                                                                            module0077.f5326(var472, var447);
                                                                        }
                                                                    }
                                                                    var94_464 = var94_464.rest();
                                                                    var472 = var94_464.first();
                                                                }
                                                                var471 = var471.rest();
                                                                var6_463 = var471.first();
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        cdestructuring_bind.cdestructuring_bind_error(var459_460, (SubLObject)module0738.$ic154$);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    else if (var465.isCons()) {
                                        final SubLObject var473 = var465.first();
                                        SubLObject var475;
                                        final SubLObject var474 = var475 = var465.rest();
                                        SubLObject var476 = (SubLObject)module0738.NIL;
                                        var476 = var475.first();
                                        while (module0738.NIL != var475) {
                                            SubLObject var94_465 = module0038.f2738(module0737.f45336(var476), var448, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED);
                                            SubLObject var477 = (SubLObject)module0738.NIL;
                                            var477 = var94_465.first();
                                            while (module0738.NIL != var94_465) {
                                                if (module0738.NIL == var441 || module0738.NIL == module0077.f5320(var477, var447)) {
                                                    print_high.princ(var477, var358);
                                                    print_high.princ(var443, var358);
                                                    if (module0738.NIL != var441) {
                                                        module0077.f5326(var477, var447);
                                                    }
                                                }
                                                var94_465 = var94_465.rest();
                                                var477 = var94_465.first();
                                            }
                                            var475 = var475.rest();
                                            var476 = var475.first();
                                        }
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var462, (SubLObject)module0738.$ic153$);
                                }
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var457, var444);
                        module0012.$g77$.rebind(var456, var444);
                        module0012.$g76$.rebind(var455, var444);
                        module0012.$g75$.rebind(var87_452, var444);
                    }
                }
                finally {
                    module0096.$g1265$.rebind(var449, var444);
                }
            }
            finally {
                if (module0738.NIL != var450_451) {
                    Locks.release_lock(var448_449);
                }
            }
        }
        finally {
            if (module0738.NIL != var446) {
                Locks.release_lock(var445);
            }
        }
        return var358;
    }
    
    public static SubLObject f45841(SubLObject var466, SubLObject var467) {
        if (var466 == module0738.UNPROVIDED) {
            var466 = module0738.$g5872$.getGlobalValue();
        }
        if (var467 == module0738.UNPROVIDED) {
            var467 = module0738.$g5873$.getGlobalValue();
        }
        final SubLThread var468 = SubLProcess.currentSubLThread();
        final SubLObject var469 = module0059.f4283((SubLObject)module0738.$ic167$);
        SubLObject var470 = (SubLObject)module0738.NIL;
        SubLObject var471 = (SubLObject)module0738.NIL;
        SubLObject var472 = (SubLObject)module0738.NIL;
        module0096.f6998(module0737.f45538());
        Storage.gc((SubLObject)module0738.UNPROVIDED);
        final SubLObject var473 = (SubLObject)module0738.ZERO_INTEGER;
        SubLObject var474 = (SubLObject)module0738.NIL;
        final SubLObject var475 = module0738.$ic168$;
        if (module0738.NIL != module0158.f10038(var475)) {
            final SubLObject var476 = (SubLObject)module0738.NIL;
            final SubLObject var477 = module0012.$g73$.currentBinding(var468);
            final SubLObject var478 = module0012.$g65$.currentBinding(var468);
            final SubLObject var479 = module0012.$g67$.currentBinding(var468);
            final SubLObject var480 = module0012.$g68$.currentBinding(var468);
            final SubLObject var481 = module0012.$g66$.currentBinding(var468);
            final SubLObject var482 = module0012.$g69$.currentBinding(var468);
            final SubLObject var483 = module0012.$g70$.currentBinding(var468);
            final SubLObject var484 = module0012.$silent_progressP$.currentBinding(var468);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var468);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var468), var468);
                module0012.$g67$.bind((SubLObject)module0738.ONE_INTEGER, var468);
                module0012.$g68$.bind((SubLObject)module0738.ZERO_INTEGER, var468);
                module0012.$g66$.bind((SubLObject)module0738.ZERO_INTEGER, var468);
                module0012.$g69$.bind((SubLObject)module0738.ZERO_INTEGER, var468);
                module0012.$g70$.bind((SubLObject)module0738.T, var468);
                module0012.$silent_progressP$.bind((SubLObject)((module0738.NIL != var476) ? module0012.$silent_progressP$.getDynamicValue(var468) : module0738.T), var468);
                module0012.f474(var476);
                final SubLObject var485 = module0158.f10039(var475);
                SubLObject var486 = var474;
                final SubLObject var487 = (SubLObject)module0738.NIL;
                while (module0738.NIL == var486) {
                    final SubLObject var488 = module0052.f3695(var485, var487);
                    final SubLObject var489 = (SubLObject)SubLObjectFactory.makeBoolean(!var487.eql(var488));
                    if (module0738.NIL != var489) {
                        module0012.f476();
                        SubLObject var490 = (SubLObject)module0738.NIL;
                        try {
                            var490 = module0158.f10316(var488, (SubLObject)module0738.$ic169$, (SubLObject)module0738.NIL, (SubLObject)module0738.NIL);
                            SubLObject var480_485 = var474;
                            final SubLObject var481_486 = (SubLObject)module0738.NIL;
                            while (module0738.NIL == var480_485) {
                                final SubLObject var491 = module0052.f3695(var490, var481_486);
                                final SubLObject var483_488 = (SubLObject)SubLObjectFactory.makeBoolean(!var481_486.eql(var491));
                                if (module0738.NIL != var483_488) {
                                    var472 = (SubLObject)ConsesLow.cons(module0205.f13204(var491, (SubLObject)module0738.UNPROVIDED), var472);
                                    if (var473.numG(Numbers.multiply(var467, var466))) {
                                        var474 = (SubLObject)module0738.T;
                                    }
                                }
                                var480_485 = (SubLObject)SubLObjectFactory.makeBoolean(module0738.NIL == var483_488 || module0738.NIL != var474);
                            }
                        }
                        finally {
                            final SubLObject var87_489 = Threads.$is_thread_performing_cleanupP$.currentBinding(var468);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0738.T, var468);
                                if (module0738.NIL != var490) {
                                    module0158.f10319(var490);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var87_489, var468);
                            }
                        }
                    }
                    var486 = (SubLObject)SubLObjectFactory.makeBoolean(module0738.NIL == var489 || module0738.NIL != var474);
                }
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var484, var468);
                module0012.$g70$.rebind(var483, var468);
                module0012.$g69$.rebind(var482, var468);
                module0012.$g66$.rebind(var481, var468);
                module0012.$g68$.rebind(var480, var468);
                module0012.$g67$.rebind(var479, var468);
                module0012.$g65$.rebind(var478, var468);
                module0012.$g73$.rebind(var477, var468);
            }
        }
        SubLObject var492;
        SubLObject var493;
        SubLObject var494;
        for (var492 = (SubLObject)module0738.NIL, var492 = (SubLObject)module0738.ZERO_INTEGER; var492.numL(var466); var492 = Numbers.add(var492, (SubLObject)module0738.ONE_INTEGER)) {
            var493 = Sequences.cconcatenate((SubLObject)module0738.$ic170$, module0006.f203(Numbers.add((SubLObject)module0738.ONE_INTEGER, var492)));
            var494 = module0004.f78(var493, (SubLObject)module0738.$ic171$, (SubLObject)ConsesLow.list(Sequences.subseq(var472, Numbers.multiply(var492, var467), Numbers.multiply(Numbers.add((SubLObject)module0738.ONE_INTEGER, var492), var467)), var469, var493));
            var470 = (SubLObject)ConsesLow.cons(var494, var470);
        }
        while (Sequences.position_if((SubLObject)module0738.$ic172$, var470, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED).isNumber()) {
            Threads.sleep((SubLObject)module0738.ONE_INTEGER);
        }
        while (module0059.f4288(var469).isPositive()) {
            var471 = (SubLObject)ConsesLow.cons(module0059.f4285(var469), var471);
        }
        if (module0738.NIL != module0035.sublisp_boolean(var471)) {
            module0096.f6998(module0737.f45538());
        }
        return var471;
    }
    
    public static SubLObject f45842(final SubLObject var471, final SubLObject var468, final SubLObject var490) {
        final SubLThread var491 = SubLProcess.currentSubLThread();
        SubLObject var492 = var471;
        SubLObject var493 = (SubLObject)module0738.NIL;
        var493 = var492.first();
        while (module0738.NIL != var492) {
            SubLObject var494 = (SubLObject)module0738.NIL;
            try {
                var491.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var495 = Errors.$error_handler$.currentBinding(var491);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0738.$ic173$, var491);
                    try {
                        module0737.f45432(var493, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED);
                    }
                    catch (Throwable var496) {
                        Errors.handleThrowable(var496, (SubLObject)module0738.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var495, var491);
                }
            }
            catch (Throwable var497) {
                var494 = Errors.handleThrowable(var497, module0003.$g3$.getGlobalValue());
            }
            finally {
                var491.throwStack.pop();
            }
            if (var494.isString()) {
                module0059.f4284((SubLObject)ConsesLow.cons(var493, var494), var468);
            }
            var492 = var492.rest();
            var493 = var492.first();
        }
        return (SubLObject)module0738.$ic4$;
    }
    
    public static SubLObject f45843(SubLObject var466, SubLObject var467) {
        if (var466 == module0738.UNPROVIDED) {
            var466 = module0738.$g5872$.getGlobalValue();
        }
        if (var467 == module0738.UNPROVIDED) {
            var467 = module0738.$g5873$.getGlobalValue();
        }
        final SubLThread var468 = SubLProcess.currentSubLThread();
        final SubLObject var469 = module0059.f4283((SubLObject)module0738.$ic174$);
        SubLObject var470 = (SubLObject)module0738.NIL;
        SubLObject var471 = (SubLObject)module0738.NIL;
        SubLObject var472 = (SubLObject)module0738.NIL;
        module0096.f6998(module0737.f45538());
        Storage.gc((SubLObject)module0738.UNPROVIDED);
        final SubLObject var473 = (SubLObject)module0738.ZERO_INTEGER;
        SubLObject var474 = (SubLObject)module0738.NIL;
        final SubLObject var475 = module0738.$ic168$;
        if (module0738.NIL != module0158.f10038(var475)) {
            final SubLObject var476 = (SubLObject)module0738.NIL;
            final SubLObject var477 = module0012.$g73$.currentBinding(var468);
            final SubLObject var478 = module0012.$g65$.currentBinding(var468);
            final SubLObject var479 = module0012.$g67$.currentBinding(var468);
            final SubLObject var480 = module0012.$g68$.currentBinding(var468);
            final SubLObject var481 = module0012.$g66$.currentBinding(var468);
            final SubLObject var482 = module0012.$g69$.currentBinding(var468);
            final SubLObject var483 = module0012.$g70$.currentBinding(var468);
            final SubLObject var484 = module0012.$silent_progressP$.currentBinding(var468);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var468);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var468), var468);
                module0012.$g67$.bind((SubLObject)module0738.ONE_INTEGER, var468);
                module0012.$g68$.bind((SubLObject)module0738.ZERO_INTEGER, var468);
                module0012.$g66$.bind((SubLObject)module0738.ZERO_INTEGER, var468);
                module0012.$g69$.bind((SubLObject)module0738.ZERO_INTEGER, var468);
                module0012.$g70$.bind((SubLObject)module0738.T, var468);
                module0012.$silent_progressP$.bind((SubLObject)((module0738.NIL != var476) ? module0012.$silent_progressP$.getDynamicValue(var468) : module0738.T), var468);
                module0012.f474(var476);
                final SubLObject var485 = module0158.f10039(var475);
                SubLObject var486 = var474;
                final SubLObject var487 = (SubLObject)module0738.NIL;
                while (module0738.NIL == var486) {
                    final SubLObject var488 = module0052.f3695(var485, var487);
                    final SubLObject var489 = (SubLObject)SubLObjectFactory.makeBoolean(!var487.eql(var488));
                    if (module0738.NIL != var489) {
                        module0012.f476();
                        SubLObject var490 = (SubLObject)module0738.NIL;
                        try {
                            var490 = module0158.f10316(var488, (SubLObject)module0738.$ic169$, (SubLObject)module0738.NIL, (SubLObject)module0738.NIL);
                            SubLObject var480_495 = var474;
                            final SubLObject var481_496 = (SubLObject)module0738.NIL;
                            while (module0738.NIL == var480_495) {
                                final SubLObject var491 = module0052.f3695(var490, var481_496);
                                final SubLObject var483_497 = (SubLObject)SubLObjectFactory.makeBoolean(!var481_496.eql(var491));
                                if (module0738.NIL != var483_497) {
                                    var472 = (SubLObject)ConsesLow.cons(module0205.f13204(var491, (SubLObject)module0738.UNPROVIDED), var472);
                                    if (var473.numG(Numbers.multiply(var467, var466))) {
                                        var474 = (SubLObject)module0738.T;
                                    }
                                }
                                var480_495 = (SubLObject)SubLObjectFactory.makeBoolean(module0738.NIL == var483_497 || module0738.NIL != var474);
                            }
                        }
                        finally {
                            final SubLObject var87_498 = Threads.$is_thread_performing_cleanupP$.currentBinding(var468);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0738.T, var468);
                                if (module0738.NIL != var490) {
                                    module0158.f10319(var490);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var87_498, var468);
                            }
                        }
                    }
                    var486 = (SubLObject)SubLObjectFactory.makeBoolean(module0738.NIL == var489 || module0738.NIL != var474);
                }
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var484, var468);
                module0012.$g70$.rebind(var483, var468);
                module0012.$g69$.rebind(var482, var468);
                module0012.$g66$.rebind(var481, var468);
                module0012.$g68$.rebind(var480, var468);
                module0012.$g67$.rebind(var479, var468);
                module0012.$g65$.rebind(var478, var468);
                module0012.$g73$.rebind(var477, var468);
            }
        }
        SubLObject var492;
        SubLObject var493;
        SubLObject var494;
        for (var492 = (SubLObject)module0738.NIL, var492 = (SubLObject)module0738.ZERO_INTEGER; var492.numL(var466); var492 = Numbers.add(var492, (SubLObject)module0738.ONE_INTEGER)) {
            var493 = Sequences.cconcatenate((SubLObject)module0738.$ic175$, module0006.f203(Numbers.add((SubLObject)module0738.ONE_INTEGER, var492)));
            var494 = module0004.f78(var493, (SubLObject)module0738.$ic176$, (SubLObject)ConsesLow.list(Sequences.subseq(var472, Numbers.multiply(var492, var467), Numbers.multiply(Numbers.add((SubLObject)module0738.ONE_INTEGER, var492), var467)), var469, var493));
            var470 = (SubLObject)ConsesLow.cons(var494, var470);
        }
        while (Sequences.position_if((SubLObject)module0738.$ic172$, var470, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED, (SubLObject)module0738.UNPROVIDED).isNumber()) {
            Threads.sleep((SubLObject)module0738.ONE_INTEGER);
        }
        while (module0059.f4288(var469).isPositive()) {
            var471 = (SubLObject)ConsesLow.cons(module0059.f4285(var469), var471);
        }
        if (module0738.NIL != module0035.sublisp_boolean(var471)) {
            module0096.f6998(module0737.f45538());
        }
        return var471;
    }
    
    public static SubLObject f45844(final SubLObject var471, final SubLObject var468, final SubLObject var490) {
        final SubLThread var491 = SubLProcess.currentSubLThread();
        SubLObject var492 = var471;
        SubLObject var493 = (SubLObject)module0738.NIL;
        var493 = var492.first();
        while (module0738.NIL != var492) {
            SubLObject var494 = (SubLObject)module0738.NIL;
            try {
                var491.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var495 = Errors.$error_handler$.currentBinding(var491);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0738.$ic173$, var491);
                    try {
                        f45789(module0737.f45538(), module0737.f45705(var493), (SubLObject)module0738.UNPROVIDED);
                    }
                    catch (Throwable var496) {
                        Errors.handleThrowable(var496, (SubLObject)module0738.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var495, var491);
                }
            }
            catch (Throwable var497) {
                var494 = Errors.handleThrowable(var497, module0003.$g3$.getGlobalValue());
            }
            finally {
                var491.throwStack.pop();
            }
            if (var494.isString()) {
                module0059.f4284((SubLObject)ConsesLow.cons(var493, var494), var468);
            }
            var492 = var492.rest();
            var493 = var492.first();
        }
        return (SubLObject)module0738.$ic4$;
    }
    
    public static SubLObject f45845() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0738", "f45731", "S#50015");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0738", "f45732", "S#50016");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0738", "f45733", "S#50017");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0738", "f45734", "S#50018");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0738", "f45735", "S#50019");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0738", "f45736", "S#50020");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45737", "S#50021", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45742", "S#48861", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45743", "S#48742", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45744", "S#48600", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45746", "S#48854", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45747", "S#48856", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45748", "S#48858", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45749", "S#49152", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45750", "S#49154", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45751", "S#48859", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45752", "S#48863", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45753", "S#48876", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45755", "S#48877", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45754", "S#50022", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45757", "S#50023", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45759", "S#48873", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45761", "S#48882", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45762", "S#50024", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45763", "S#48880", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45764", "S#48878", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45765", "S#48884", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45766", "S#50025", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45756", "S#50026", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45769", "S#48889", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45771", "S#48892", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45772", "S#50027", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45773", "NL-TRIE-SEMTRANS-TEMPLATES-OF-STRING", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45774", "S#48890", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45775", "S#48891", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45770", "S#50028", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45776", "S#49448", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45777", "S#50029", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45778", "S#49442", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45758", "S#50030", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45779", "S#50031", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45768", "S#50032", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45760", "S#50033", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45780", "S#50034", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45781", "S#50035", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45782", "S#50036", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45783", "NL-TRIE-SENTENCE-TOKENIZE", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45785", "S#50037", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45784", "S#50038", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45786", "S#50039", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45788", "S#50040", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45789", "S#50041", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45793", "S#50042", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45794", "S#50043", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45791", "S#50044", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45767", "S#50045", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45795", "S#50046", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45790", "S#50047", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45792", "S#50048", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45796", "S#50049", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45797", "S#50050", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45798", "S#50051", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45799", "S#50052", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45741", "S#50053", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45739", "S#50054", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45740", "S#50055", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45745", "S#50056", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45800", "S#50057", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45738", "S#50058", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45801", "S#50059", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45787", "S#50060", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45802", "S#50012", 1, 1, false);
        new $f45802$UnaryFunction();
        new $f45802$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45803", "S#50061", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45804", "S#49562", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45805", "S#50062", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0738", "f45806", "S#50063");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45807", "S#50064", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45808", "S#49436", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45809", "S#49437", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45810", "S#49446", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45812", "S#50065", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45811", "S#50066", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45813", "S#50067", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45814", "S#50068", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45816", "S#50014", 1, 0, false);
        new $f45816$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45817", "NL-TRIE-INDEX-ITEM-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45818", "S#48872", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45819", "S#50069", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45820", "S#50070", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45821", "S#50071", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45822", "S#50072", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45823", "S#50073", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45824", "S#50074", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45825", "S#50075", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45826", "S#50076", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45815", "S#50077", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45827", "S#50078", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45828", "S#50079", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45829", "S#50080", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45830", "INITIALIZE-NL-TRIE-ROTATION-INDEX", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45831", "NL-TRIE-ROTATION-INDEX-INITIALIZED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45833", "S#50081", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45832", "S#50082", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45834", "S#49560", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45835", "NL-TRIE-MATCHING-PHRASES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45837", "S#50083", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45836", "S#50084", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45839", "S#50085", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45838", "S#50086", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45840", "S#50087", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45841", "S#50088", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45842", "S#50089", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45843", "S#50090", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0738", "f45844", "S#50091", 3, 0, false);
        return (SubLObject)module0738.NIL;
    }
    
    public static SubLObject f45846() {
        module0738.$g5863$ = SubLFiles.deflexical("S#50092", (SubLObject)module0738.$ic56$);
        module0738.$g5864$ = SubLFiles.deflexical("S#50093", Sequences.cconcatenate(module0738.$g5863$.getGlobalValue(), module0038.f2818()));
        module0738.$g5865$ = SubLFiles.defparameter("S#50094", (SubLObject)module0738.NIL);
        module0738.$g5866$ = SubLFiles.deflexical("*NL-TRIE-ROTATION-INDEX*", (SubLObject)((module0738.NIL != Symbols.boundp((SubLObject)module0738.$ic121$)) ? module0738.$g5866$.getGlobalValue() : module0738.NIL));
        module0738.$g5867$ = SubLFiles.deflexical("S#50095", (SubLObject)module0738.$ic122$);
        module0738.$g5868$ = SubLFiles.defconstant("S#50096", (SubLObject)Characters.CHAR_vertical);
        module0738.$g5869$ = SubLFiles.defconstant("S#50097", Strings.string(module0738.$g5868$.getGlobalValue()));
        module0738.$g5870$ = SubLFiles.deflexical("S#50098", (SubLObject)((module0738.NIL != Symbols.boundp((SubLObject)module0738.$ic123$)) ? module0738.$g5870$.getGlobalValue() : module0738.NIL));
        module0738.$g5871$ = SubLFiles.defconstant("S#50099", (SubLObject)module0738.$ic125$);
        module0738.$g5872$ = SubLFiles.deflexical("S#50100", (SubLObject)module0738.TWENTY_INTEGER);
        module0738.$g5873$ = SubLFiles.deflexical("S#50101", (SubLObject)module0738.$ic166$);
        return (SubLObject)module0738.NIL;
    }
    
    public static SubLObject f45847() {
        module0034.f1895((SubLObject)module0738.$ic52$);
        module0034.f1895((SubLObject)module0738.$ic88$);
        module0002.f50((SubLObject)module0738.$ic110$, (SubLObject)module0738.$ic111$);
        module0003.f57((SubLObject)module0738.$ic121$);
        module0003.f57((SubLObject)module0738.$ic123$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0738.$g5871$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0738.$ic132$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0738.$ic133$);
        Structures.def_csetf((SubLObject)module0738.$ic134$, (SubLObject)module0738.$ic135$);
        Structures.def_csetf((SubLObject)module0738.$ic136$, (SubLObject)module0738.$ic137$);
        Structures.def_csetf((SubLObject)module0738.$ic138$, (SubLObject)module0738.$ic139$);
        Equality.identity((SubLObject)module0738.$ic125$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0738.$g5871$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0738.$ic148$));
        return (SubLObject)module0738.NIL;
    }
    
    public void declareFunctions() {
        f45845();
    }
    
    public void initializeVariables() {
        f45846();
    }
    
    public void runTopLevelForms() {
        f45847();
    }
    
    static {
        me = (SubLFile)new module0738();
        module0738.$g5863$ = null;
        module0738.$g5864$ = null;
        module0738.$g5865$ = null;
        module0738.$g5866$ = null;
        module0738.$g5867$ = null;
        module0738.$g5868$ = null;
        module0738.$g5869$ = null;
        module0738.$g5870$ = null;
        module0738.$g5871$ = null;
        module0738.$g5872$ = null;
        module0738.$g5873$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#8600", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic2$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic3$ = SubLObjectFactory.makeKeyword("STRING");
        $ic4$ = SubLObjectFactory.makeKeyword("DONE");
        $ic5$ = SubLObjectFactory.makeUninternedSymbol("US#3165895");
        $ic6$ = SubLObjectFactory.makeUninternedSymbol("US#34B4C45");
        $ic7$ = SubLObjectFactory.makeSymbol("S#49758", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("CSOME");
        $ic9$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic10$ = SubLObjectFactory.makeSymbol("S#49444", "CYC");
        $ic11$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#50102", "CYC"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("S#48844", "CYC"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50103", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("ANY")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50104", "CYC"), (SubLObject)module0738.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48843", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#39485", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50105", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#39558", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50106", "CYC"), (SubLObject)module0738.NIL) }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-PERIOD?"), (SubLObject)SubLObjectFactory.makeKeyword("MISSPELLINGS?"), (SubLObject)SubLObjectFactory.makeKeyword("CASE-SENSITIVITY"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-SEMANTIC-MT?"));
        $ic13$ = SubLObjectFactory.makeKeyword("ENTRY-TYPE");
        $ic14$ = SubLObjectFactory.makeKeyword("ANY");
        $ic15$ = SubLObjectFactory.makeKeyword("CHECK-PERIOD?");
        $ic16$ = SubLObjectFactory.makeKeyword("MISSPELLINGS?");
        $ic17$ = SubLObjectFactory.makeSymbol("S#39485", "CYC");
        $ic18$ = SubLObjectFactory.makeKeyword("CASE-SENSITIVITY");
        $ic19$ = SubLObjectFactory.makeSymbol("S#39558", "CYC");
        $ic20$ = SubLObjectFactory.makeKeyword("CHECK-SEMANTIC-MT?");
        $ic21$ = SubLObjectFactory.makeUninternedSymbol("US#34B4C45");
        $ic22$ = SubLObjectFactory.makeSymbol("CLET");
        $ic23$ = SubLObjectFactory.makeSymbol("*LEXICON-LOOKUP-MT*");
        $ic24$ = SubLObjectFactory.makeSymbol("S#50058", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic26$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic27$ = SubLObjectFactory.makeSymbol("CAND");
        $ic28$ = SubLObjectFactory.makeSymbol("COR");
        $ic29$ = SubLObjectFactory.makeSymbol("S#49577", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("FIMPLIES");
        $ic31$ = SubLObjectFactory.makeSymbol("S#50055", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#50054", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#50053", "CYC");
        $ic34$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50102", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("S#48844", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50104", "CYC"), (SubLObject)module0738.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48843", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#39485", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50105", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#39558", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50106", "CYC"), (SubLObject)module0738.NIL)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic35$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CHECK-PERIOD?"), (SubLObject)SubLObjectFactory.makeKeyword("MISSPELLINGS?"), (SubLObject)SubLObjectFactory.makeKeyword("CASE-SENSITIVITY"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-SEMANTIC-MT?"));
        $ic36$ = SubLObjectFactory.makeSymbol("S#50016", "CYC");
        $ic37$ = SubLObjectFactory.makeKeyword("WORD");
        $ic38$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50102", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("S#48844", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50104", "CYC"), (SubLObject)module0738.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48843", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#39485", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50105", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#39558", "CYC")))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic39$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CHECK-PERIOD?"), (SubLObject)SubLObjectFactory.makeKeyword("MISSPELLINGS?"), (SubLObject)SubLObjectFactory.makeKeyword("CASE-SENSITIVITY"));
        $ic40$ = SubLObjectFactory.makeKeyword("NAME");
        $ic41$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50107", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50108", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50109", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50110", "CYC"), (SubLObject)module0738.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49134", "CYC"), (SubLObject)module0738.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49135", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DENOT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49136", "CYC"), (SubLObject)module0738.NIL));
        $ic42$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SKIP-CONSTRAINTS?"), (SubLObject)SubLObjectFactory.makeKeyword("ABBREV-TYPES"), (SubLObject)SubLObjectFactory.makeKeyword("DENOT-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("SKIP-NAMESTRINGS?"));
        $ic43$ = SubLObjectFactory.makeKeyword("SKIP-CONSTRAINTS?");
        $ic44$ = SubLObjectFactory.makeKeyword("ABBREV-TYPES");
        $ic45$ = SubLObjectFactory.makeKeyword("DENOT-TYPE");
        $ic46$ = SubLObjectFactory.makeKeyword("DENOT");
        $ic47$ = SubLObjectFactory.makeKeyword("SKIP-NAMESTRINGS?");
        $ic48$ = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-SETQ");
        $ic49$ = SubLObjectFactory.makeSymbol("S#50030", "CYC");
        $ic50$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50111", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50108", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50112", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50109", "CYC"));
        $ic51$ = SubLObjectFactory.makeSymbol("S#50032", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#48861", "CYC");
        $ic53$ = SubLObjectFactory.makeInteger(4096);
        $ic54$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic55$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("partOfSpeech"));
        $ic56$ = ConsesLow.list(new SubLObject[] { Characters.CHAR_comma, Characters.CHAR_period, Characters.CHAR_question, Characters.CHAR_exclamation, Characters.CHAR_ampersand, Characters.CHAR_exclamation, Characters.CHAR_quotation, Characters.CHAR_semicolon, Characters.CHAR_colon, Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_slash });
        $ic57$ = SubLObjectFactory.makeKeyword("GREEDY");
        $ic58$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ABBREVS"), (SubLObject)SubLObjectFactory.makeKeyword("ACRONYMS"));
        $ic59$ = SubLObjectFactory.makeSymbol("S#48593", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic61$ = SubLObjectFactory.makeString("the ");
        $ic62$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("acronymString"));
        $ic63$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic64$ = SubLObjectFactory.makeKeyword("SEMTRANS-TEMPLATE");
        $ic65$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("nameSpelling"));
        $ic66$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("commonNickname"));
        $ic67$ = SubLObjectFactory.makeSymbol("S#39429", "CYC");
        $ic68$ = SubLObjectFactory.makeSymbol("SPEC-POS-PRED?");
        $ic69$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic70$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic71$ = SubLObjectFactory.makeSymbol("S#12275", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("S#12280", "CYC");
        $ic73$ = SubLObjectFactory.makeSymbol("S#12278", "CYC");
        $ic74$ = SubLObjectFactory.makeKeyword("ACRONYMS");
        $ic75$ = SubLObjectFactory.makeKeyword("ABBREVS");
        $ic76$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("denotation")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("denotationRelatedTo")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("denotationPlaceholder")));
        $ic77$ = SubLObjectFactory.makeKeyword("INTERVAL");
        $ic78$ = SubLObjectFactory.makeKeyword("OFF");
        $ic79$ = SubLObjectFactory.makeKeyword("ON");
        $ic80$ = SubLObjectFactory.makeSymbol(">");
        $ic81$ = SubLObjectFactory.makeSymbol("S#50113", "CYC");
        $ic82$ = SubLObjectFactory.makeSymbol("<");
        $ic83$ = SubLObjectFactory.makeSymbol("S#49147", "CYC");
        $ic84$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50114", "CYC"));
        $ic85$ = SubLObjectFactory.makeSymbol("S#49754", "CYC");
        $ic86$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ON"), (SubLObject)SubLObjectFactory.makeKeyword("PREFERRED"));
        $ic87$ = SubLObjectFactory.makeString("Invalid case-sensitivity value for NL-TRIE-PREFIXES: ~S");
        $ic88$ = SubLObjectFactory.makeSymbol("S#50043", "CYC");
        $ic89$ = SubLObjectFactory.makeInteger(512);
        $ic90$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("titleOfWork"));
        $ic91$ = SubLObjectFactory.makeSymbol("S#50051", "CYC");
        $ic92$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CommonEnglishMisspellingsMt"));
        $ic93$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC")));
        $ic94$ = SubLObjectFactory.makeKeyword("PREFERRED");
        $ic95$ = SubLObjectFactory.makeKeyword("ABORTED");
        $ic96$ = SubLObjectFactory.makeSymbol("S#50012", "CYC");
        $ic97$ = SubLObjectFactory.makeSymbol("S#48559", "CYC");
        $ic98$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic99$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20270", "CYC"));
        $ic100$ = SubLObjectFactory.makeString("Found non-matching string: ~S vs. ~S");
        $ic101$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4322", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14595", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic102$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic103$ = SubLObjectFactory.makeUninternedSymbol("US#34E22DC");
        $ic104$ = SubLObjectFactory.makeUninternedSymbol("US#1526883");
        $ic105$ = SubLObjectFactory.makeSymbol("SUPPORT-SENTENCE");
        $ic106$ = SubLObjectFactory.makeSymbol("SUPPORT-MT");
        $ic107$ = SubLObjectFactory.makeSymbol("S#50017", "CYC");
        $ic108$ = SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-ARG2");
        $ic109$ = SubLObjectFactory.makeSymbol("CNOT");
        $ic110$ = SubLObjectFactory.makeSymbol("S#50064", "CYC");
        $ic111$ = SubLObjectFactory.makeSymbol("S#50063", "CYC");
        $ic112$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49531", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4322", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $ic113$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14781", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25111", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"));
        $ic114$ = SubLObjectFactory.makeSymbol("EQUALS-EL?");
        $ic115$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CharacterString")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SententialConstituent")));
        $ic116$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("NounPhrase"));
        $ic117$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ProperNameString"));
        $ic118$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("NLPhrase"));
        $ic119$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("phrase-Bar1"));
        $ic120$ = SubLObjectFactory.makeString("Don't know how to check ~S against ~S");
        $ic121$ = SubLObjectFactory.makeSymbol("*NL-TRIE-ROTATION-INDEX*");
        $ic122$ = ConsesLow.list((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_hyphen);
        $ic123$ = SubLObjectFactory.makeSymbol("S#50098", "CYC");
        $ic124$ = SubLObjectFactory.makeString("tried to determine rotations for a non-string: ~S~%");
        $ic125$ = SubLObjectFactory.makeSymbol("S#50013", "CYC");
        $ic126$ = SubLObjectFactory.makeSymbol("S#50014", "CYC");
        $ic127$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39298", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic128$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeKeyword("PHRASE"), (SubLObject)SubLObjectFactory.makeKeyword("MT"));
        $ic129$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-INDEX-ITEM-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("S#48872", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50069", "CYC"));
        $ic130$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50070", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50071", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50072", "CYC"));
        $ic131$ = SubLObjectFactory.makeSymbol("S#50077", "CYC");
        $ic132$ = SubLObjectFactory.makeSymbol("S#50068", "CYC");
        $ic133$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#50014", "CYC"));
        $ic134$ = SubLObjectFactory.makeSymbol("NL-TRIE-INDEX-ITEM-TERM");
        $ic135$ = SubLObjectFactory.makeSymbol("S#50070", "CYC");
        $ic136$ = SubLObjectFactory.makeSymbol("S#48872", "CYC");
        $ic137$ = SubLObjectFactory.makeSymbol("S#50071", "CYC");
        $ic138$ = SubLObjectFactory.makeSymbol("S#50069", "CYC");
        $ic139$ = SubLObjectFactory.makeSymbol("S#50072", "CYC");
        $ic140$ = SubLObjectFactory.makeKeyword("TERM");
        $ic141$ = SubLObjectFactory.makeKeyword("PHRASE");
        $ic142$ = SubLObjectFactory.makeKeyword("MT");
        $ic143$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic144$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic145$ = SubLObjectFactory.makeSymbol("S#50073", "CYC");
        $ic146$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic147$ = SubLObjectFactory.makeKeyword("END");
        $ic148$ = SubLObjectFactory.makeSymbol("S#50075", "CYC");
        $ic149$ = SubLObjectFactory.makeString("<NL-TRIE-INDEX-ITEM:~s:~s:~a>");
        $ic150$ = SubLObjectFactory.makeString("nl trie rotation stop list");
        $ic151$ = SubLObjectFactory.makeString("nl trie rotation index");
        $ic152$ = SubLObjectFactory.makeString("Creating NL trie rotation index...");
        $ic153$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#6CABE02"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#7901B45"));
        $ic154$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#794E61F"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#712B0A2"));
        $ic155$ = SubLObjectFactory.makeSymbol("S#6111", "CYC");
        $ic156$ = SubLObjectFactory.makeSymbol("S#6110", "CYC");
        $ic157$ = SubLObjectFactory.makeKeyword("INFIX");
        $ic158$ = SubLObjectFactory.makeKeyword("PREFIX");
        $ic159$ = SubLObjectFactory.makeSymbol("STARTS-WITH");
        $ic160$ = SubLObjectFactory.makeKeyword("SUFFIX");
        $ic161$ = SubLObjectFactory.makeSymbol("ENDS-WITH");
        $ic162$ = SubLObjectFactory.makeSymbol("STRING<");
        $ic163$ = SubLObjectFactory.makeSymbol("S#3338", "CYC");
        $ic164$ = SubLObjectFactory.makeString("The NL Trie must be initialized before it can be dumped.");
        $ic165$ = SubLObjectFactory.makeString("Dumping NL Trie spellchecker strings...");
        $ic166$ = SubLObjectFactory.makeInteger(500);
        $ic167$ = SubLObjectFactory.makeString("Concurrent NL-Trie Search Stress Test Problems");
        $ic168$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("nameString"));
        $ic169$ = SubLObjectFactory.makeKeyword("GAF");
        $ic170$ = SubLObjectFactory.makeString("Concurrent NL Trie Searches ");
        $ic171$ = SubLObjectFactory.makeSymbol("S#50089", "CYC");
        $ic172$ = SubLObjectFactory.makeSymbol("VALID-PROCESS-P");
        $ic173$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic174$ = SubLObjectFactory.makeString("Concurrent NL-Trie Prefixes Stress Test Problems");
        $ic175$ = SubLObjectFactory.makeString("Concurrent NL Trie Prefixes ");
        $ic176$ = SubLObjectFactory.makeSymbol("S#50091", "CYC");
    }
    
    public static final class $f45802$UnaryFunction extends UnaryFunction
    {
        public $f45802$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50012"));
        }
        
        public SubLObject processItem(final SubLObject var315) {
            return module0738.f45802(var315, (SubLObject)$f45802$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f45802$BinaryFunction extends BinaryFunction
    {
        public $f45802$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50012"));
        }
        
        public SubLObject processItem(final SubLObject var315, final SubLObject var316) {
            return module0738.f45802(var315, var316);
        }
    }
    
    public static final class $sX50013_native extends SubLStructNative
    {
        public SubLObject $term;
        public SubLObject $phrase;
        public SubLObject $mt;
        private static final SubLStructDeclNative structDecl;
        
        public $sX50013_native() {
            this.$term = (SubLObject)CommonSymbols.NIL;
            this.$phrase = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX50013_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$term;
        }
        
        public SubLObject getField3() {
            return this.$phrase;
        }
        
        public SubLObject getField4() {
            return this.$mt;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$term = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$phrase = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$mt = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX50013_native.class, module0738.$ic125$, module0738.$ic126$, module0738.$ic127$, module0738.$ic128$, new String[] { "$term", "$phrase", "$mt" }, module0738.$ic129$, module0738.$ic130$, module0738.$ic131$);
        }
    }
    
    public static final class $f45816$UnaryFunction extends UnaryFunction
    {
        public $f45816$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50014"));
        }
        
        public SubLObject processItem(final SubLObject var315) {
            return module0738.f45816(var315);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0738.class
	Total time: 1688 ms
	
	Decompiled with Procyon 0.5.32.
*/