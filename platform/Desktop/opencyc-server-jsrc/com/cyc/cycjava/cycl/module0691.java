package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0691 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0691";
    public static final String myFingerPrint = "f902a76ede6edeee341747b76d704ec76e3246f94b92d01750a21120e7dbd76c";
    public static SubLSymbol $g5444$;
    private static SubLSymbol $g5445$;
    private static SubLSymbol $g5446$;
    private static SubLSymbol $g5447$;
    public static SubLSymbol $g5448$;
    public static SubLSymbol $g5449$;
    private static SubLSymbol $g5450$;
    private static SubLSymbol $g5451$;
    private static SubLSymbol $g5452$;
    private static SubLSymbol $g5453$;
    private static SubLSymbol $g5454$;
    public static SubLSymbol $g5455$;
    private static final SubLSymbol $ic0$;
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
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLObject $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLInteger $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLObject $ic59$;
    private static final SubLList $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLObject $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLList $ic68$;
    private static final SubLObject $ic69$;
    private static final SubLObject $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLObject $ic72$;
    private static final SubLList $ic73$;
    private static final SubLObject $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLObject $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLList $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLObject $ic86$;
    private static final SubLObject $ic87$;
    private static final SubLObject $ic88$;
    private static final SubLObject $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLString $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLList $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLString $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLList $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLList $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLList $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLString $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
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
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLString $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLString $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLList $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLSymbol $ic186$;
    
    public static SubLObject f42265(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0691.NIL;
        SubLObject var6 = (SubLObject)module0691.NIL;
        SubLObject var7 = (SubLObject)module0691.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0691.$ic1$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0691.$ic1$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0691.$ic1$);
        var7 = var4.first();
        final SubLObject var8;
        var4 = (var8 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0691.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0691.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0691.$ic4$, var5), (SubLObject)module0691.$ic0$, (SubLObject)ConsesLow.list((SubLObject)module0691.$ic4$, var7)), (SubLObject)ConsesLow.listS((SubLObject)module0691.$ic5$, var5, var6, ConsesLow.append(var8, (SubLObject)module0691.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0691.$ic6$, (SubLObject)ConsesLow.list((SubLObject)module0691.$ic4$, var5)));
    }
    
    public static SubLObject f42266() {
        return module0030.f1625(module0691.$g5444$.getGlobalValue());
    }
    
    public static SubLObject f42267(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        var10.resetMultipleValues();
        final SubLObject var11 = Hashtables.gethash(var9, module0691.$g5444$.getGlobalValue(), (SubLObject)module0691.UNPROVIDED);
        final SubLObject var12 = var10.secondMultipleValue();
        var10.resetMultipleValues();
        return Values.values(var11, var12);
    }
    
    public static SubLObject f42268(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        var10.resetMultipleValues();
        final SubLObject var11 = f42267(var9);
        final SubLObject var12 = var10.secondMultipleValue();
        var10.resetMultipleValues();
        if (module0691.NIL != var12) {
            return (SubLObject)module0691.T;
        }
        return (SubLObject)module0691.NIL;
    }
    
    public static SubLObject f42269(final SubLObject var9) {
        final SubLObject var10 = f42267(var9);
        final SubLObject var11 = conses_high.getf(var10, (SubLObject)module0691.$ic8$, (SubLObject)module0691.UNPROVIDED);
        return var11.isInteger() ? var11 : module0691.$g5445$.getGlobalValue();
    }
    
    public static SubLObject f42270(final SubLObject var9) {
        final SubLObject var10 = f42267(var9);
        final SubLObject var11 = conses_high.getf(var10, (SubLObject)module0691.$ic10$, (SubLObject)module0691.UNPROVIDED);
        return var11.isInteger() ? var11 : module0691.$g5446$.getGlobalValue();
    }
    
    public static SubLObject f42271(final SubLObject var9) {
        final SubLObject var10 = f42267(var9);
        final SubLObject var11 = conses_high.getf(var10, (SubLObject)module0691.$ic12$, (SubLObject)module0691.UNPROVIDED);
        return var11.isKeyword() ? var11 : module0691.$g5447$.getGlobalValue();
    }
    
    public static SubLObject f42272(final SubLObject var9, final SubLObject var17, final SubLObject var18, SubLObject var16) {
        if (var16 == module0691.UNPROVIDED) {
            var16 = (SubLObject)module0691.NIL;
        }
        if (module0691.NIL == f42268(var9)) {
            Errors.warn((SubLObject)module0691.$ic13$, var9);
            return (SubLObject)module0691.NIL;
        }
        if (f42271(var9).eql(var16)) {
            return Functions.funcall(var9, var17, var18);
        }
        return var17;
    }
    
    public static SubLObject f42273(SubLObject var19) {
        if (var19 == module0691.UNPROVIDED) {
            var19 = f42266();
        }
        return Sort.sort(var19, Symbols.symbol_function((SubLObject)module0691.$ic14$), Symbols.symbol_function((SubLObject)module0691.$ic15$));
    }
    
    public static SubLObject f42274(final SubLObject var20, final SubLObject var19, final SubLObject var18, SubLObject var16) {
        if (var16 == module0691.UNPROVIDED) {
            var16 = (SubLObject)module0691.NIL;
        }
        final SubLObject var21 = f42273(var19);
        SubLObject var22 = var20;
        SubLObject var23 = var21;
        SubLObject var24 = (SubLObject)module0691.NIL;
        var24 = var23.first();
        while (module0691.NIL != var23) {
            var22 = f42272(var24, var22, var18, var16);
            var23 = var23.rest();
            var24 = var23.first();
        }
        return var22;
    }
    
    public static SubLObject f42275(SubLObject var19) {
        if (var19 == module0691.UNPROVIDED) {
            var19 = f42266();
        }
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)module0691.$ic16$), f42273(var19));
    }
    
    public static SubLObject f42276(final SubLObject var24) {
        final SubLObject var25 = Packages.intern(module0038.f2968(var24), (SubLObject)module0691.UNPROVIDED);
        if (module0691.NIL != Hashtables.gethash(var25, module0691.$g5444$.getGlobalValue(), (SubLObject)module0691.UNPROVIDED) && var25.isFunctionSpec()) {
            return var25;
        }
        return (SubLObject)module0691.NIL;
    }
    
    public static SubLObject f42277(final SubLObject var26, final SubLObject var18) {
        SubLObject var27 = (SubLObject)module0691.NIL;
        SubLObject var28 = var26;
        SubLObject var29 = (SubLObject)module0691.NIL;
        var29 = var28.first();
        while (module0691.NIL != var28) {
            if (module0691.NIL == module0259.f16891(var29, module0691.$ic19$)) {
                var27 = (SubLObject)ConsesLow.cons(var29, var27);
            }
            var28 = var28.rest();
            var29 = var28.first();
        }
        return var27;
    }
    
    public static SubLObject f42278(final SubLObject var26, final SubLObject var18) {
        SubLObject var27 = (SubLObject)module0691.NIL;
        SubLObject var28 = var26;
        SubLObject var29 = (SubLObject)module0691.NIL;
        var29 = var28.first();
        while (module0691.NIL != var28) {
            if (module0691.NIL == module0259.f16891(var29, module0691.$ic21$)) {
                var27 = (SubLObject)ConsesLow.cons(var29, var27);
            }
            var28 = var28.rest();
            var29 = var28.first();
        }
        return var27;
    }
    
    public static SubLObject f42279(final SubLObject var26, final SubLObject var18) {
        return module0035.f2124((SubLObject)module0691.FIVE_INTEGER, Sort.sort(var26, Symbols.symbol_function((SubLObject)module0691.$ic24$), (SubLObject)module0691.UNPROVIDED));
    }
    
    public static SubLObject f42280(final SubLObject var26, final SubLObject var18) {
        return module0035.f2124((SubLObject)module0691.TEN_INTEGER, Sort.sort(var26, Symbols.symbol_function((SubLObject)module0691.$ic24$), (SubLObject)module0691.UNPROVIDED));
    }
    
    public static SubLObject f42281(final SubLObject var26, final SubLObject var18) {
        return module0035.f2124((SubLObject)module0691.TWENTY_INTEGER, Sort.sort(var26, Symbols.symbol_function((SubLObject)module0691.$ic24$), (SubLObject)module0691.UNPROVIDED));
    }
    
    public static SubLObject f42282(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0691.NIL;
        SubLObject var6 = (SubLObject)module0691.NIL;
        SubLObject var7 = (SubLObject)module0691.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0691.$ic1$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0691.$ic1$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0691.$ic1$);
        var7 = var4.first();
        final SubLObject var8;
        var4 = (var8 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0691.$ic2$, (SubLObject)ConsesLow.listS((SubLObject)module0691.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0691.$ic4$, var5), (SubLObject)module0691.$ic31$), (SubLObject)ConsesLow.list((SubLObject)module0691.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0691.$ic4$, var5), (SubLObject)module0691.$ic30$, (SubLObject)ConsesLow.list((SubLObject)module0691.$ic4$, var7)), (SubLObject)ConsesLow.listS((SubLObject)module0691.$ic5$, var5, var6, ConsesLow.append(var8, (SubLObject)module0691.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0691.$ic6$, (SubLObject)ConsesLow.list((SubLObject)module0691.$ic4$, var5)));
    }
    
    public static SubLObject f42283(final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        var32.resetMultipleValues();
        final SubLObject var33 = Hashtables.gethash(var31, module0691.$g5448$.getGlobalValue(), (SubLObject)module0691.UNPROVIDED);
        final SubLObject var34 = var32.secondMultipleValue();
        var32.resetMultipleValues();
        return Values.values(var33, var34);
    }
    
    public static SubLObject f42284(final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        var32.resetMultipleValues();
        final SubLObject var33 = f42283(var31);
        final SubLObject var34 = var32.secondMultipleValue();
        var32.resetMultipleValues();
        if (module0691.NIL != var34) {
            return (SubLObject)module0691.T;
        }
        return (SubLObject)module0691.NIL;
    }
    
    public static SubLObject f42285(final SubLObject var31, final SubLObject var33) {
        if (module0691.NIL != f42284(var31)) {
            return Functions.funcall(var31, var33);
        }
        Errors.warn((SubLObject)module0691.$ic32$, var31);
        return (SubLObject)module0691.NIL;
    }
    
    public static SubLObject f42286() {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)module0691.$ic16$), Sort.sort(module0030.f1625(module0691.$g5448$.getGlobalValue()), (SubLObject)module0691.$ic33$, (SubLObject)module0691.$ic34$));
    }
    
    public static SubLObject f42287(final SubLObject var24) {
        final SubLObject var25 = Packages.intern(module0038.f2968(var24), (SubLObject)module0691.UNPROVIDED);
        if (module0691.NIL != Hashtables.gethash(var25, module0691.$g5448$.getGlobalValue(), (SubLObject)module0691.UNPROVIDED) && var25.isFunctionSpec()) {
            return var25;
        }
        return (SubLObject)module0691.NIL;
    }
    
    public static SubLObject f42288(final SubLObject var24, final SubLObject var34) {
        final SubLObject var35 = f42287(var24);
        if (module0691.NIL != f42284(var35)) {
            return conses_high.getf(Hashtables.gethash(var35, module0691.$g5449$.getGlobalValue(), (SubLObject)module0691.UNPROVIDED), var34, (SubLObject)module0691.UNPROVIDED);
        }
        return (SubLObject)module0691.NIL;
    }
    
    public static SubLObject f42289(final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        final SubLObject var38 = conses_high.getf(var36, (SubLObject)module0691.$ic37$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var39 = conses_high.getf(var36, (SubLObject)module0691.$ic38$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var40 = conses_high.getf(var36, (SubLObject)module0691.$ic39$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var41 = conses_high.getf(var36, (SubLObject)module0691.$ic40$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var42 = conses_high.getf(var36, (SubLObject)module0691.$ic41$, (SubLObject)module0691.UNPROVIDED);
        SubLObject var43 = (SubLObject)module0691.NIL;
        SubLObject var44 = (SubLObject)module0691.NIL;
        SubLObject var45 = var39;
        SubLObject var46 = (SubLObject)module0691.NIL;
        var46 = var45.first();
        while (module0691.NIL != var45) {
            SubLObject var23_44 = var38;
            SubLObject var47 = (SubLObject)module0691.NIL;
            var47 = var23_44.first();
            while (module0691.NIL != var23_44) {
                var37.resetMultipleValues();
                final SubLObject var48 = f42290(var47, var46, var40, var41, var42, (SubLObject)module0691.UNPROVIDED);
                final SubLObject var49 = var37.secondMultipleValue();
                var37.resetMultipleValues();
                SubLObject var23_45 = var49;
                SubLObject var50 = (SubLObject)module0691.NIL;
                var50 = var23_45.first();
                while (module0691.NIL != var23_45) {
                    var43 = (SubLObject)ConsesLow.cons(f42291(var50, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), var43);
                    var23_45 = var23_45.rest();
                    var50 = var23_45.first();
                }
                SubLObject var23_46 = var48;
                SubLObject var51 = (SubLObject)module0691.NIL;
                var51 = var23_46.first();
                while (module0691.NIL != var23_46) {
                    var44 = (SubLObject)ConsesLow.cons(f42292(var47, var51.first(), conses_high.second(var51), var40, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), var44);
                    var23_46 = var23_46.rest();
                    var51 = var23_46.first();
                }
                var23_44 = var23_44.rest();
                var47 = var23_44.first();
            }
            var45 = var45.rest();
            var46 = var45.first();
        }
        return f42293(var43, var44, (SubLObject)ConsesLow.list((SubLObject)module0691.$ic39$, var40));
    }
    
    public static SubLObject f42290(final SubLObject var45, final SubLObject var52, final SubLObject var18, final SubLObject var39, SubLObject var40, SubLObject var53) {
        if (var53 == module0691.UNPROVIDED) {
            var53 = (SubLObject)module0691.NIL;
        }
        final SubLThread var54 = SubLProcess.currentSubLThread();
        SubLObject var55 = (SubLObject)module0691.NIL;
        SubLObject var56 = (SubLObject)module0691.NIL;
        SubLObject var57 = (SubLObject)module0691.NIL;
        SubLObject var58 = (SubLObject)module0691.NIL;
        var57 = ((module0691.NIL != module0226.f14800(var45)) ? module0315.f21257(var45, var52, var18) : module0220.f14563(var52, var45, var18, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED));
        if (module0691.NIL != var57) {
            var57 = f42274(var57, var39, var18, (SubLObject)module0691.UNPROVIDED);
            if (module0691.NIL != var57) {
                var58 = conses_high.intersection(var57, (module0691.NIL != module0226.f14800(var45)) ? module0315.f21262(var45, var52, var18) : module0220.f14563(var52, var45, var18, (SubLObject)module0691.TWO_INTEGER, (SubLObject)module0691.ONE_INTEGER, (SubLObject)module0691.UNPROVIDED), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                var57 = conses_high.set_difference(var57, var58, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                var58 = conses_high.set_difference(var58, (SubLObject)ConsesLow.list(var52), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
            }
        }
        SubLObject var59;
        var57 = (var59 = f42274(var57, var39, var18, (SubLObject)module0691.$ic42$));
        SubLObject var60 = (SubLObject)module0691.NIL;
        var60 = var59.first();
        while (module0691.NIL != var59) {
            var56 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var52, var60), var56);
            var59 = var59.rest();
            var60 = var59.first();
        }
        var59 = var58;
        SubLObject var61 = (SubLObject)module0691.NIL;
        var61 = var59.first();
        while (module0691.NIL != var59) {
            var56 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var52, var61), var56);
            var56 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var61, var52), var56);
            SubLObject var23_59 = var58;
            SubLObject var62 = (SubLObject)module0691.NIL;
            var62 = var23_59.first();
            while (module0691.NIL != var23_59) {
                if (!var61.eql(var62)) {
                    var56 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var61, var62), var56);
                }
                var23_59 = var23_59.rest();
                var62 = var23_59.first();
            }
            var59 = var59.rest();
            var61 = var59.first();
        }
        var59 = var57;
        var60 = (SubLObject)module0691.NIL;
        var60 = var59.first();
        while (module0691.NIL != var59) {
            SubLObject var23_60 = var58;
            SubLObject var63 = (SubLObject)module0691.NIL;
            var63 = var23_60.first();
            while (module0691.NIL != var23_60) {
                var56 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var63, var60), var56);
                var23_60 = var23_60.rest();
                var63 = var23_60.first();
            }
            var59 = var59.rest();
            var60 = var59.first();
        }
        if (var40.numE((SubLObject)module0691.ONE_INTEGER)) {
            var55 = (SubLObject)module0691.NIL;
        }
        else {
            var55 = (SubLObject)module0691.T;
            var40 = Numbers.subtract(var40, (SubLObject)module0691.ONE_INTEGER);
        }
        if (module0691.NIL != var55) {
            var59 = var57;
            SubLObject var64 = (SubLObject)module0691.NIL;
            var64 = var59.first();
            while (module0691.NIL != var59) {
                if (module0691.NIL == module0004.f104(var64, var53, Symbols.symbol_function((SubLObject)module0691.EQUAL), (SubLObject)module0691.UNPROVIDED)) {
                    var53 = (SubLObject)ConsesLow.cons(var64, var53);
                    var54.resetMultipleValues();
                    SubLObject var65 = f42290(var45, var64, var18, var39, var40, var53);
                    final SubLObject var66 = var54.secondMultipleValue();
                    var54.resetMultipleValues();
                    var53 = var66;
                    SubLObject var23_61;
                    var65 = (var23_61 = Sequences.remove_duplicates(var65, Symbols.symbol_function((SubLObject)module0691.EQUAL), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED));
                    SubLObject var67 = (SubLObject)module0691.NIL;
                    var67 = var23_61.first();
                    while (module0691.NIL != var23_61) {
                        var56 = (SubLObject)ConsesLow.cons(var67, var56);
                        var23_61 = var23_61.rest();
                        var67 = var23_61.first();
                    }
                }
                var59 = var59.rest();
                var64 = var59.first();
            }
        }
        return Values.values(var56, var53);
    }
    
    public static SubLObject f42294(final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        final SubLObject var38 = conses_high.getf(var36, (SubLObject)module0691.$ic37$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var39 = conses_high.getf(var36, (SubLObject)module0691.$ic38$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var40 = conses_high.getf(var36, (SubLObject)module0691.$ic39$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var41 = conses_high.getf(var36, (SubLObject)module0691.$ic40$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var42 = conses_high.getf(var36, (SubLObject)module0691.$ic41$, (SubLObject)module0691.UNPROVIDED);
        SubLObject var43 = (SubLObject)module0691.NIL;
        SubLObject var44 = (SubLObject)module0691.NIL;
        SubLObject var45 = var39;
        SubLObject var46 = (SubLObject)module0691.NIL;
        var46 = var45.first();
        while (module0691.NIL != var45) {
            SubLObject var23_67 = var38;
            SubLObject var47 = (SubLObject)module0691.NIL;
            var47 = var23_67.first();
            while (module0691.NIL != var23_67) {
                var37.resetMultipleValues();
                final SubLObject var48 = f42295(var47, var46, var40, var41, var42, (SubLObject)module0691.UNPROVIDED);
                final SubLObject var49 = var37.secondMultipleValue();
                var37.resetMultipleValues();
                SubLObject var23_68 = var49;
                SubLObject var50 = (SubLObject)module0691.NIL;
                var50 = var23_68.first();
                while (module0691.NIL != var23_68) {
                    var43 = (SubLObject)ConsesLow.cons(f42291(var50, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), var43);
                    var23_68 = var23_68.rest();
                    var50 = var23_68.first();
                }
                SubLObject var23_69 = var48;
                SubLObject var51 = (SubLObject)module0691.NIL;
                var51 = var23_69.first();
                while (module0691.NIL != var23_69) {
                    var44 = (SubLObject)ConsesLow.cons(f42292(var47, var51.first(), conses_high.second(var51), var40, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), var44);
                    var23_69 = var23_69.rest();
                    var51 = var23_69.first();
                }
                var23_67 = var23_67.rest();
                var47 = var23_67.first();
            }
            var45 = var45.rest();
            var46 = var45.first();
        }
        return f42293(var43, var44, (SubLObject)ConsesLow.list((SubLObject)module0691.$ic39$, var40));
    }
    
    public static SubLObject f42295(final SubLObject var45, final SubLObject var57, final SubLObject var18, final SubLObject var39, SubLObject var40, SubLObject var70) {
        if (var70 == module0691.UNPROVIDED) {
            var70 = (SubLObject)module0691.NIL;
        }
        final SubLThread var71 = SubLProcess.currentSubLThread();
        SubLObject var72 = (SubLObject)module0691.NIL;
        SubLObject var73 = (SubLObject)module0691.NIL;
        SubLObject var74 = (SubLObject)module0691.NIL;
        SubLObject var75 = (SubLObject)module0691.NIL;
        var74 = ((module0691.NIL != module0226.f14800(var45)) ? module0315.f21262(var45, var57, var18) : module0220.f14563(var57, var45, var18, (SubLObject)module0691.TWO_INTEGER, (SubLObject)module0691.ONE_INTEGER, (SubLObject)module0691.UNPROVIDED));
        if (module0691.NIL != var74) {
            var74 = f42274(var74, var39, var18, (SubLObject)module0691.UNPROVIDED);
            if (module0691.NIL != var74) {
                var75 = conses_high.intersection(var74, (module0691.NIL != module0226.f14800(var45)) ? module0315.f21257(var45, var57, var18) : module0220.f14563(var57, var45, var18, (SubLObject)module0691.ONE_INTEGER, (SubLObject)module0691.TWO_INTEGER, (SubLObject)module0691.UNPROVIDED), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                var74 = conses_high.set_difference(var74, var75, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                var75 = conses_high.set_difference(var75, (SubLObject)ConsesLow.list(var57), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
            }
        }
        SubLObject var76;
        var74 = (var76 = f42274(var74, var39, var18, (SubLObject)module0691.$ic42$));
        SubLObject var77 = (SubLObject)module0691.NIL;
        var77 = var76.first();
        while (module0691.NIL != var76) {
            var73 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var77, var57), var73);
            var76 = var76.rest();
            var77 = var76.first();
        }
        var76 = var75;
        SubLObject var78 = (SubLObject)module0691.NIL;
        var78 = var76.first();
        while (module0691.NIL != var76) {
            var73 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var57, var78), var73);
            var73 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var78, var57), var73);
            var76 = var76.rest();
            var78 = var76.first();
        }
        if (var40.numE((SubLObject)module0691.ONE_INTEGER)) {
            var72 = (SubLObject)module0691.NIL;
        }
        else {
            var72 = (SubLObject)module0691.T;
            var40 = Numbers.subtract(var40, (SubLObject)module0691.ONE_INTEGER);
        }
        if (module0691.NIL != var72) {
            var76 = var74;
            SubLObject var79 = (SubLObject)module0691.NIL;
            var79 = var76.first();
            while (module0691.NIL != var76) {
                if (module0691.NIL == module0004.f104(var79, var70, Symbols.symbol_function((SubLObject)module0691.EQUAL), (SubLObject)module0691.UNPROVIDED)) {
                    var70 = (SubLObject)ConsesLow.cons(var79, var70);
                    var71.resetMultipleValues();
                    SubLObject var80 = f42295(var45, var79, var18, var39, var40, var70);
                    final SubLObject var81 = var71.secondMultipleValue();
                    var71.resetMultipleValues();
                    var70 = var81;
                    SubLObject var23_76;
                    var80 = (var23_76 = Sequences.remove_duplicates(var80, Symbols.symbol_function((SubLObject)module0691.EQUAL), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED));
                    SubLObject var82 = (SubLObject)module0691.NIL;
                    var82 = var23_76.first();
                    while (module0691.NIL != var23_76) {
                        var73 = (SubLObject)ConsesLow.cons(var82, var73);
                        var23_76 = var23_76.rest();
                        var82 = var23_76.first();
                    }
                }
                var76 = var76.rest();
                var79 = var76.first();
            }
        }
        return Values.values(var73, var70);
    }
    
    public static SubLObject f42296(final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        final SubLObject var38 = conses_high.getf(var36, (SubLObject)module0691.$ic37$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var39 = conses_high.getf(var36, (SubLObject)module0691.$ic38$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var40 = conses_high.getf(var36, (SubLObject)module0691.$ic39$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var41 = conses_high.getf(var36, (SubLObject)module0691.$ic40$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var42 = conses_high.getf(var36, (SubLObject)module0691.$ic41$, (SubLObject)module0691.UNPROVIDED);
        SubLObject var43 = (SubLObject)module0691.NIL;
        SubLObject var44 = (SubLObject)module0691.NIL;
        SubLObject var45 = var39;
        SubLObject var46 = (SubLObject)module0691.NIL;
        var46 = var45.first();
        while (module0691.NIL != var45) {
            SubLObject var23_77 = var38;
            SubLObject var47 = (SubLObject)module0691.NIL;
            var47 = var23_77.first();
            while (module0691.NIL != var23_77) {
                var37.resetMultipleValues();
                final SubLObject var48 = f42297(var47, var46, var40, var41, var42, (SubLObject)module0691.UNPROVIDED);
                final SubLObject var49 = var37.secondMultipleValue();
                var37.resetMultipleValues();
                SubLObject var23_78 = var49;
                SubLObject var50 = (SubLObject)module0691.NIL;
                var50 = var23_78.first();
                while (module0691.NIL != var23_78) {
                    var43 = (SubLObject)ConsesLow.cons(f42291(var50, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), var43);
                    var23_78 = var23_78.rest();
                    var50 = var23_78.first();
                }
                SubLObject var23_79 = var48;
                SubLObject var51 = (SubLObject)module0691.NIL;
                var51 = var23_79.first();
                while (module0691.NIL != var23_79) {
                    var44 = (SubLObject)ConsesLow.cons(f42292(var47, var51.first(), conses_high.second(var51), var40, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), var44);
                    var23_79 = var23_79.rest();
                    var51 = var23_79.first();
                }
                var23_77 = var23_77.rest();
                var47 = var23_77.first();
            }
            var45 = var45.rest();
            var46 = var45.first();
        }
        return f42293(var43, var44, (SubLObject)ConsesLow.list((SubLObject)module0691.$ic39$, var40));
    }
    
    public static SubLObject f42297(final SubLObject var45, final SubLObject var52, final SubLObject var18, final SubLObject var39, SubLObject var40, SubLObject var53) {
        if (var53 == module0691.UNPROVIDED) {
            var53 = (SubLObject)module0691.NIL;
        }
        final SubLThread var54 = SubLProcess.currentSubLThread();
        SubLObject var55 = (SubLObject)module0691.NIL;
        SubLObject var56 = (SubLObject)module0691.NIL;
        SubLObject var57 = (SubLObject)module0691.NIL;
        SubLObject var58 = (SubLObject)module0691.NIL;
        if (module0691.NIL != module0244.f15730(var45)) {
            var57 = module0252.f16245(module0137.f8955(var45), var52, var18, (SubLObject)module0691.UNPROVIDED);
            if (module0691.NIL != var57) {
                var57 = f42274(var57, var39, var18, (SubLObject)module0691.UNPROVIDED);
                if (module0691.NIL != var57) {
                    var58 = module0252.f16334(module0137.f8955(var45), var52, var57, var18, (SubLObject)module0691.UNPROVIDED);
                    var57 = conses_high.set_difference(var57, var58, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                    var58 = conses_high.set_difference(var58, (SubLObject)ConsesLow.list(var52), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                    if (Sequences.length(var57).numG((SubLObject)module0691.ONE_INTEGER)) {
                        var57 = module0252.f16262(module0244.f15774(module0137.f8955(var45)), var57, var18, (SubLObject)module0691.UNPROVIDED);
                    }
                    if (Sequences.length(var58).numG((SubLObject)module0691.ONE_INTEGER)) {
                        var58 = module0252.f16262(module0244.f15774(module0137.f8955(var45)), var58, var18, (SubLObject)module0691.UNPROVIDED);
                    }
                }
            }
        }
        SubLObject var59;
        var57 = (var59 = f42274(var57, var39, var18, (SubLObject)module0691.$ic42$));
        SubLObject var60 = (SubLObject)module0691.NIL;
        var60 = var59.first();
        while (module0691.NIL != var59) {
            var56 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var52, var60), var56);
            var59 = var59.rest();
            var60 = var59.first();
        }
        var59 = var58;
        SubLObject var61 = (SubLObject)module0691.NIL;
        var61 = var59.first();
        while (module0691.NIL != var59) {
            var56 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var52, var61), var56);
            var56 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var61, var52), var56);
            SubLObject var23_80 = var58;
            SubLObject var62 = (SubLObject)module0691.NIL;
            var62 = var23_80.first();
            while (module0691.NIL != var23_80) {
                if (!var61.eql(var62)) {
                    var56 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var61, var62), var56);
                }
                var23_80 = var23_80.rest();
                var62 = var23_80.first();
            }
            var59 = var59.rest();
            var61 = var59.first();
        }
        var59 = var57;
        var60 = (SubLObject)module0691.NIL;
        var60 = var59.first();
        while (module0691.NIL != var59) {
            SubLObject var23_81 = var58;
            SubLObject var63 = (SubLObject)module0691.NIL;
            var63 = var23_81.first();
            while (module0691.NIL != var23_81) {
                var56 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var63, var60), var56);
                var23_81 = var23_81.rest();
                var63 = var23_81.first();
            }
            var59 = var59.rest();
            var60 = var59.first();
        }
        if (var40.numE((SubLObject)module0691.ONE_INTEGER)) {
            var55 = (SubLObject)module0691.NIL;
        }
        else {
            var55 = (SubLObject)module0691.T;
            var40 = Numbers.subtract(var40, (SubLObject)module0691.ONE_INTEGER);
        }
        if (module0691.NIL != var55) {
            var59 = var57;
            SubLObject var64 = (SubLObject)module0691.NIL;
            var64 = var59.first();
            while (module0691.NIL != var59) {
                if (module0691.NIL == module0004.f104(var64, var53, Symbols.symbol_function((SubLObject)module0691.EQUAL), (SubLObject)module0691.UNPROVIDED)) {
                    var53 = (SubLObject)ConsesLow.cons(var64, var53);
                    var54.resetMultipleValues();
                    SubLObject var65 = f42297(var45, var64, var18, var39, var40, var53);
                    final SubLObject var66 = var54.secondMultipleValue();
                    var54.resetMultipleValues();
                    var53 = var66;
                    SubLObject var23_82;
                    var65 = (var23_82 = Sequences.remove_duplicates(var65, Symbols.symbol_function((SubLObject)module0691.EQUAL), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED));
                    SubLObject var67 = (SubLObject)module0691.NIL;
                    var67 = var23_82.first();
                    while (module0691.NIL != var23_82) {
                        var56 = (SubLObject)ConsesLow.cons(var67, var56);
                        var23_82 = var23_82.rest();
                        var67 = var23_82.first();
                    }
                }
                var59 = var59.rest();
                var64 = var59.first();
            }
        }
        return Values.values(var56, var53);
    }
    
    public static SubLObject f42298(final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        final SubLObject var38 = conses_high.getf(var36, (SubLObject)module0691.$ic37$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var39 = conses_high.getf(var36, (SubLObject)module0691.$ic38$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var40 = conses_high.getf(var36, (SubLObject)module0691.$ic39$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var41 = conses_high.getf(var36, (SubLObject)module0691.$ic40$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var42 = conses_high.getf(var36, (SubLObject)module0691.$ic41$, (SubLObject)module0691.UNPROVIDED);
        SubLObject var43 = (SubLObject)module0691.NIL;
        SubLObject var44 = (SubLObject)module0691.NIL;
        SubLObject var45 = var39;
        SubLObject var46 = (SubLObject)module0691.NIL;
        var46 = var45.first();
        while (module0691.NIL != var45) {
            SubLObject var23_83 = var38;
            SubLObject var47 = (SubLObject)module0691.NIL;
            var47 = var23_83.first();
            while (module0691.NIL != var23_83) {
                var37.resetMultipleValues();
                final SubLObject var48 = f42299(var47, var46, var40, var41, var42, (SubLObject)module0691.UNPROVIDED);
                final SubLObject var49 = var37.secondMultipleValue();
                var37.resetMultipleValues();
                SubLObject var23_84 = var49;
                SubLObject var50 = (SubLObject)module0691.NIL;
                var50 = var23_84.first();
                while (module0691.NIL != var23_84) {
                    var43 = (SubLObject)ConsesLow.cons(f42291(var50, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), var43);
                    var23_84 = var23_84.rest();
                    var50 = var23_84.first();
                }
                SubLObject var23_85 = var48;
                SubLObject var51 = (SubLObject)module0691.NIL;
                var51 = var23_85.first();
                while (module0691.NIL != var23_85) {
                    var44 = (SubLObject)ConsesLow.cons(f42292(var47, var51.first(), conses_high.second(var51), var40, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), var44);
                    var23_85 = var23_85.rest();
                    var51 = var23_85.first();
                }
                var23_83 = var23_83.rest();
                var47 = var23_83.first();
            }
            var45 = var45.rest();
            var46 = var45.first();
        }
        return f42293(var43, var44, (SubLObject)ConsesLow.list((SubLObject)module0691.$ic39$, var40));
    }
    
    public static SubLObject f42299(final SubLObject var45, final SubLObject var57, final SubLObject var18, final SubLObject var39, SubLObject var40, SubLObject var70) {
        if (var70 == module0691.UNPROVIDED) {
            var70 = (SubLObject)module0691.NIL;
        }
        final SubLThread var71 = SubLProcess.currentSubLThread();
        SubLObject var72 = (SubLObject)module0691.NIL;
        SubLObject var73 = (SubLObject)module0691.NIL;
        SubLObject var74 = (SubLObject)module0691.NIL;
        SubLObject var75 = (SubLObject)module0691.NIL;
        if (module0691.NIL != module0244.f15730(var45)) {
            var74 = module0252.f16248(module0137.f8955(var45), var57, var18, (SubLObject)module0691.UNPROVIDED);
            if (module0691.NIL != var74) {
                var74 = f42274(var74, var39, var18, (SubLObject)module0691.UNPROVIDED);
                if (module0691.NIL != var74) {
                    var75 = module0252.f16332(module0137.f8955(var45), var57, var74, var18, (SubLObject)module0691.UNPROVIDED);
                    var74 = conses_high.set_difference(var74, var75, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                    var75 = conses_high.set_difference(var75, (SubLObject)ConsesLow.list(var57), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                    if (Sequences.length(var74).numG((SubLObject)module0691.ONE_INTEGER)) {
                        var74 = module0252.f16260(module0244.f15774(module0137.f8955(var45)), var74, var18, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                    }
                    if (Sequences.length(var75).numG((SubLObject)module0691.ONE_INTEGER)) {
                        var75 = module0252.f16260(module0244.f15774(module0137.f8955(var45)), var75, var18, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                    }
                }
            }
        }
        SubLObject var76;
        var74 = (var76 = f42274(var74, var39, var18, (SubLObject)module0691.$ic42$));
        SubLObject var77 = (SubLObject)module0691.NIL;
        var77 = var76.first();
        while (module0691.NIL != var76) {
            var73 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var77, var57), var73);
            var76 = var76.rest();
            var77 = var76.first();
        }
        var76 = var75;
        SubLObject var78 = (SubLObject)module0691.NIL;
        var78 = var76.first();
        while (module0691.NIL != var76) {
            var73 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var57, var78), var73);
            var73 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var78, var57), var73);
            var76 = var76.rest();
            var78 = var76.first();
        }
        if (var40.numE((SubLObject)module0691.ONE_INTEGER)) {
            var72 = (SubLObject)module0691.NIL;
        }
        else {
            var72 = (SubLObject)module0691.T;
            var40 = Numbers.subtract(var40, (SubLObject)module0691.ONE_INTEGER);
        }
        if (module0691.NIL != var72) {
            var76 = var74;
            SubLObject var79 = (SubLObject)module0691.NIL;
            var79 = var76.first();
            while (module0691.NIL != var76) {
                if (module0691.NIL == module0004.f104(var79, var70, Symbols.symbol_function((SubLObject)module0691.EQUAL), (SubLObject)module0691.UNPROVIDED)) {
                    var70 = (SubLObject)ConsesLow.cons(var79, var70);
                    var71.resetMultipleValues();
                    SubLObject var80 = f42299(var45, var79, var18, var39, var40, var70);
                    final SubLObject var81 = var71.secondMultipleValue();
                    var71.resetMultipleValues();
                    var70 = var81;
                    SubLObject var23_86;
                    var80 = (var23_86 = Sequences.remove_duplicates(var80, Symbols.symbol_function((SubLObject)module0691.EQUAL), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED));
                    SubLObject var82 = (SubLObject)module0691.NIL;
                    var82 = var23_86.first();
                    while (module0691.NIL != var23_86) {
                        var73 = (SubLObject)ConsesLow.cons(var82, var73);
                        var23_86 = var23_86.rest();
                        var82 = var23_86.first();
                    }
                }
                var76 = var76.rest();
                var79 = var76.first();
            }
        }
        return Values.values(var73, var70);
    }
    
    public static SubLObject f42300(final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        final SubLObject var38 = conses_high.getf(var36, (SubLObject)module0691.$ic37$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var39 = conses_high.getf(var36, (SubLObject)module0691.$ic38$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var40 = conses_high.getf(var36, (SubLObject)module0691.$ic39$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var41 = conses_high.getf(var36, (SubLObject)module0691.$ic40$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var42 = conses_high.getf(var36, (SubLObject)module0691.$ic41$, (SubLObject)module0691.UNPROVIDED);
        SubLObject var43 = (SubLObject)module0691.NIL;
        SubLObject var44 = (SubLObject)module0691.NIL;
        SubLObject var45 = var38;
        SubLObject var46 = (SubLObject)module0691.NIL;
        var46 = var45.first();
        while (module0691.NIL != var45) {
            var37.resetMultipleValues();
            final SubLObject var47 = f42301(var46, var39, var40, var41, var42, (SubLObject)module0691.UNPROVIDED);
            final SubLObject var48 = var37.secondMultipleValue();
            var37.resetMultipleValues();
            SubLObject var23_87 = var48;
            SubLObject var49 = (SubLObject)module0691.NIL;
            var49 = var23_87.first();
            while (module0691.NIL != var23_87) {
                var43 = (SubLObject)ConsesLow.cons(f42291(var49, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), var43);
                var23_87 = var23_87.rest();
                var49 = var23_87.first();
            }
            SubLObject var23_88 = var47;
            SubLObject var50 = (SubLObject)module0691.NIL;
            var50 = var23_88.first();
            while (module0691.NIL != var23_88) {
                var44 = (SubLObject)ConsesLow.cons(f42292(var46, var50.first(), conses_high.second(var50), var40, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), var44);
                var23_88 = var23_88.rest();
                var50 = var23_88.first();
            }
            var45 = var45.rest();
            var46 = var45.first();
        }
        return f42293(var43, var44, (SubLObject)ConsesLow.list((SubLObject)module0691.$ic39$, var40));
    }
    
    public static SubLObject f42301(final SubLObject var45, final SubLObject var89, final SubLObject var18, final SubLObject var39, SubLObject var40, SubLObject var90) {
        if (var90 == module0691.UNPROVIDED) {
            var90 = (SubLObject)module0691.NIL;
        }
        final SubLThread var91 = SubLProcess.currentSubLThread();
        if (module0691.NIL == var89 || Sequences.length(var89).numLE((SubLObject)module0691.ONE_INTEGER)) {
            return Values.values((SubLObject)module0691.NIL, var90);
        }
        SubLObject var92 = (SubLObject)module0691.NIL;
        SubLObject var93 = (SubLObject)module0691.NIL;
        SubLObject var94 = (SubLObject)module0691.NIL;
        if (module0691.NIL != module0244.f15730(var45)) {
            SubLObject var95 = (SubLObject)module0691.NIL;
            SubLObject var96 = (SubLObject)module0691.NIL;
            var95 = var89.first();
            for (var96 = var89.rest(); module0691.NIL != var96; var96 = var96.rest()) {
                SubLObject var97 = var96;
                SubLObject var98 = (SubLObject)module0691.NIL;
                var98 = var97.first();
                while (module0691.NIL != var97) {
                    SubLObject var99 = (SubLObject)module0691.NIL;
                    var99 = module0252.f16315(module0137.f8955(var45), (SubLObject)ConsesLow.list(var95, var98), (SubLObject)module0691.NIL, var18, module0691.$ic51$);
                    if (module0691.NIL != var99) {
                        var99 = f42274(var99, var39, var18, (SubLObject)module0691.UNPROVIDED);
                        var99 = conses_high.set_difference(var99, var89, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                        if (Sequences.length(var99).numG((SubLObject)module0691.ONE_INTEGER)) {
                            var99 = module0252.f16262(module0244.f15774(module0137.f8955(var45)), var99, var18, module0691.$ic51$);
                        }
                    }
                    SubLObject var23_96;
                    var99 = (var23_96 = f42274(var99, var39, var18, (SubLObject)module0691.$ic42$));
                    SubLObject var100 = (SubLObject)module0691.NIL;
                    var100 = var23_96.first();
                    while (module0691.NIL != var23_96) {
                        var94 = (SubLObject)ConsesLow.cons(var100, var94);
                        var93 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var95, var100), var93);
                        var93 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var98, var100), var93);
                        var23_96 = var23_96.rest();
                        var100 = var23_96.first();
                    }
                    var97 = var97.rest();
                    var98 = var97.first();
                }
                var95 = var96.first();
            }
            var93 = Sequences.remove_duplicates(var93, Symbols.symbol_function((SubLObject)module0691.EQUAL), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
            var94 = Sequences.remove_duplicates(var94, Symbols.symbol_function((SubLObject)module0691.EQUAL), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
        }
        if (var40.numE((SubLObject)module0691.ONE_INTEGER)) {
            var92 = (SubLObject)module0691.NIL;
        }
        else {
            var92 = (SubLObject)module0691.T;
            var40 = Numbers.subtract(var40, (SubLObject)module0691.ONE_INTEGER);
        }
        if (module0691.NIL != var92) {
            var90 = var89;
            var91.resetMultipleValues();
            SubLObject var101 = f42301(var45, var94, var18, var39, var40, var90);
            final SubLObject var102 = var91.secondMultipleValue();
            var91.resetMultipleValues();
            SubLObject var97;
            var101 = (var97 = Sequences.remove_duplicates(var101, Symbols.symbol_function((SubLObject)module0691.EQUAL), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED));
            SubLObject var103 = (SubLObject)module0691.NIL;
            var103 = var97.first();
            while (module0691.NIL != var97) {
                var93 = (SubLObject)ConsesLow.cons(var103, var93);
                var97 = var97.rest();
                var103 = var97.first();
            }
        }
        return Values.values(var93, var90);
    }
    
    public static SubLObject f42302(final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        final SubLObject var38 = conses_high.getf(var36, (SubLObject)module0691.$ic37$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var39 = conses_high.getf(var36, (SubLObject)module0691.$ic38$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var40 = conses_high.getf(var36, (SubLObject)module0691.$ic39$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var41 = conses_high.getf(var36, (SubLObject)module0691.$ic40$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var42 = conses_high.getf(var36, (SubLObject)module0691.$ic41$, (SubLObject)module0691.UNPROVIDED);
        SubLObject var43 = (SubLObject)module0691.NIL;
        SubLObject var44 = (SubLObject)module0691.NIL;
        var37.resetMultipleValues();
        final SubLObject var45 = f42303(var38, var40, var41, var42, var39);
        final SubLObject var46 = var37.secondMultipleValue();
        var37.resetMultipleValues();
        SubLObject var47 = var46;
        SubLObject var48 = (SubLObject)module0691.NIL;
        var48 = var47.first();
        while (module0691.NIL != var47) {
            var43 = (SubLObject)ConsesLow.cons(f42291(var48, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), var43);
            var47 = var47.rest();
            var48 = var47.first();
        }
        var47 = var45;
        SubLObject var49 = (SubLObject)module0691.NIL;
        var49 = var47.first();
        while (module0691.NIL != var47) {
            var44 = (SubLObject)ConsesLow.cons(f42292(var49.first(), conses_high.second(var49), conses_high.third(var49), var40, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), var44);
            var47 = var47.rest();
            var49 = var47.first();
        }
        return f42293(var43, var44, (SubLObject)ConsesLow.list((SubLObject)module0691.$ic39$, var40));
    }
    
    public static SubLObject f42303(final SubLObject var37, final SubLObject var18, final SubLObject var39, final SubLObject var40, final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        if (module0691.NIL == var99) {
            return Values.values((SubLObject)module0691.NIL, (SubLObject)module0691.NIL);
        }
        final SubLObject var101 = (SubLObject)ConsesLow.list(var99);
        var100.resetMultipleValues();
        final SubLObject var102 = f42304(var37, var18, var39, var40, var101, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var103 = var100.secondMultipleValue();
        var100.resetMultipleValues();
        SubLObject var104 = (SubLObject)module0691.NIL;
        SubLObject var105 = (SubLObject)module0691.NIL;
        SubLObject var106 = (SubLObject)module0691.NIL;
        SubLObject var107 = (SubLObject)module0691.NIL;
        final Iterator var108 = Hashtables.getEntrySetIterator(var102);
        try {
            while (Hashtables.iteratorHasNext(var108)) {
                final Map.Entry var109 = Hashtables.iteratorNextEntry(var108);
                var106 = Hashtables.getEntryKey(var109);
                SubLObject var110;
                var107 = (var110 = Hashtables.getEntryValue(var109));
                SubLObject var111 = (SubLObject)module0691.NIL;
                var111 = var110.first();
                while (module0691.NIL != var110) {
                    final SubLObject var112 = var111.first();
                    final SubLObject var113 = conses_high.second(var111);
                    var104 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var112, var113, var106), var104);
                    var110 = var110.rest();
                    var111 = var110.first();
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var108);
        }
        SubLObject var114 = (SubLObject)module0691.NIL;
        SubLObject var115 = (SubLObject)module0691.NIL;
        final Iterator var105_111 = Hashtables.getEntrySetIterator(var103);
        try {
            while (Hashtables.iteratorHasNext(var105_111)) {
                final Map.Entry var106_112 = Hashtables.iteratorNextEntry(var105_111);
                var114 = Hashtables.getEntryKey(var106_112);
                var115 = Hashtables.getEntryValue(var106_112);
                var105 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var114, var115), var105);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var105_111);
        }
        return Values.values(var104, var105);
    }
    
    public static SubLObject f42304(final SubLObject var37, final SubLObject var18, final SubLObject var39, SubLObject var40, SubLObject var100, SubLObject var101, SubLObject var102) {
        if (var101 == module0691.UNPROVIDED) {
            var101 = (SubLObject)module0691.NIL;
        }
        if (var102 == module0691.UNPROVIDED) {
            var102 = (SubLObject)module0691.NIL;
        }
        final SubLThread var103 = SubLProcess.currentSubLThread();
        if (!var101.isHashtable()) {
            var101 = Hashtables.make_hash_table((SubLObject)module0691.$ic54$, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
        }
        if (!var102.isHashtable()) {
            var102 = Hashtables.make_hash_table((SubLObject)module0691.$ic54$, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
            SubLObject var104 = var100.first();
            SubLObject var105 = (SubLObject)module0691.NIL;
            var105 = var104.first();
            while (module0691.NIL != var104) {
                Hashtables.sethash(var105, var102, var40);
                var104 = var104.rest();
                var105 = var104.first();
            }
        }
        SubLObject var106 = (SubLObject)module0691.NIL;
        SubLObject var107 = (SubLObject)module0691.NIL;
        SubLObject var108 = (SubLObject)module0691.NIL;
        SubLObject var109 = var37;
        SubLObject var110 = (SubLObject)module0691.NIL;
        var110 = var109.first();
        while (module0691.NIL != var109) {
            if (module0691.NIL != module0244.f15730(var110)) {
                SubLObject var23_116;
                final SubLObject var111 = var23_116 = var100.first();
                SubLObject var112 = (SubLObject)module0691.NIL;
                var112 = var23_116.first();
                while (module0691.NIL != var23_116) {
                    SubLObject var113 = (SubLObject)module0691.NIL;
                    var113 = module0252.f16245(module0137.f8955(var110), var112, var18, (SubLObject)module0691.UNPROVIDED);
                    if (module0691.NIL != var113) {
                        var113 = f42274(var113, var39, var18, (SubLObject)module0691.UNPROVIDED);
                        if (Sequences.length(var113).numG((SubLObject)module0691.ONE_INTEGER)) {
                            var113 = module0252.f16262(module0244.f15774(module0137.f8955(var110)), var113, var18, (SubLObject)module0691.UNPROVIDED);
                        }
                    }
                    SubLObject var23_117 = var113;
                    SubLObject var114 = (SubLObject)module0691.NIL;
                    var114 = var23_117.first();
                    while (module0691.NIL != var23_117) {
                        module0030.f1600(var112, (SubLObject)ConsesLow.list(var110, var114), var101, (SubLObject)module0691.UNPROVIDED);
                        var23_117 = var23_117.rest();
                        var114 = var23_117.first();
                    }
                    var108 = (SubLObject)ConsesLow.cons(var113, var108);
                    SubLObject var115 = (SubLObject)module0691.NIL;
                    var115 = module0252.f16248(module0137.f8955(var110), var112, var18, (SubLObject)module0691.UNPROVIDED);
                    if (module0691.NIL != var115) {
                        var115 = f42274(var115, var39, var18, (SubLObject)module0691.UNPROVIDED);
                        if (Sequences.length(var115).numG((SubLObject)module0691.ONE_INTEGER)) {
                            var115 = module0252.f16260(module0244.f15774(module0137.f8955(var110)), var115, var18, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                        }
                    }
                    SubLObject var23_118 = var115;
                    SubLObject var116 = (SubLObject)module0691.NIL;
                    var116 = var23_118.first();
                    while (module0691.NIL != var23_118) {
                        module0030.f1599(var116, (SubLObject)ConsesLow.list(var110, var112), var101);
                        var23_118 = var23_118.rest();
                        var116 = var23_118.first();
                    }
                    var108 = (SubLObject)ConsesLow.cons(var115, var108);
                    var23_116 = var23_116.rest();
                    var112 = var23_116.first();
                }
            }
            var109 = var109.rest();
            var110 = var109.first();
        }
        var107 = Sequences.remove_duplicates(Functions.apply(Symbols.symbol_function((SubLObject)module0691.$ic55$), var108), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
        var107 = Sequences.remove_duplicates(var107, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
        var107 = f42274(var107, var39, var18, (SubLObject)module0691.$ic42$);
        var107 = conses_high.set_difference(var107, Functions.apply(Symbols.symbol_function((SubLObject)module0691.$ic55$), var100), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
        var100 = (SubLObject)ConsesLow.cons(var107, var100);
        if (var40.numG((SubLObject)module0691.ONE_INTEGER)) {
            var106 = (SubLObject)module0691.T;
        }
        var40 = Numbers.subtract(var40, (SubLObject)module0691.ONE_INTEGER);
        var109 = var107;
        SubLObject var117 = (SubLObject)module0691.NIL;
        var117 = var109.first();
        while (module0691.NIL != var109) {
            final SubLObject var118 = Hashtables.gethash(var117, var102, (SubLObject)module0691.UNPROVIDED);
            if (!var118.isInteger() || !var118.numG(var40)) {
                Hashtables.sethash(var117, var102, var40);
            }
            var109 = var109.rest();
            var117 = var109.first();
        }
        if (module0691.NIL != var106) {
            var103.resetMultipleValues();
            final SubLObject var119 = f42304(var37, var18, var39, var40, var100, var101, var102);
            final SubLObject var120 = var103.secondMultipleValue();
            var103.resetMultipleValues();
            var101 = var119;
            var102 = var120;
        }
        return Values.values(var101, var102);
    }
    
    public static SubLObject f42305(final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        final SubLObject var38 = conses_high.getf(var36, (SubLObject)module0691.$ic38$, (SubLObject)module0691.UNPROVIDED);
        SubLObject var39 = conses_high.getf(var36, (SubLObject)module0691.$ic39$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var40 = var38.first();
        SubLObject var41 = (SubLObject)module0691.NIL;
        SubLObject var42 = (SubLObject)module0691.NIL;
        if (module0691.NIL == var39) {
            var39 = module0226.f15152(var40);
        }
        if (module0691.NIL == var39) {
            var39 = module0691.$ic58$;
        }
        final SubLObject var43 = module0147.f9540(var39);
        final SubLObject var44 = module0147.$g2095$.currentBinding(var37);
        final SubLObject var45 = module0147.$g2094$.currentBinding(var37);
        final SubLObject var46 = module0147.$g2096$.currentBinding(var37);
        try {
            module0147.$g2095$.bind(module0147.f9545(var43), var37);
            module0147.$g2094$.bind(module0147.f9546(var43), var37);
            module0147.$g2096$.bind(module0147.f9549(var43), var37);
            SubLObject var47 = module0035.remove_if_not((SubLObject)module0691.$ic61$, module0259.f16848(module0691.$ic62$, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
            SubLObject var48 = (SubLObject)module0691.NIL;
            var48 = var47.first();
            while (module0691.NIL != var47) {
                SubLObject var23_128 = module0220.f14598(var40, var48, (SubLObject)module0691.ONE_INTEGER, (SubLObject)module0691.$ic60$, (SubLObject)module0691.UNPROVIDED);
                SubLObject var49 = (SubLObject)module0691.NIL;
                var49 = var23_128.first();
                while (module0691.NIL != var23_128) {
                    final SubLObject var50 = var49.first();
                    final SubLObject var51 = conses_high.second(var49);
                    final SubLObject var52 = f42291(var50, module0691.$ic59$, (SubLObject)module0691.UNPROVIDED);
                    final SubLObject var53 = f42291(var51, module0691.$ic59$, (SubLObject)module0691.UNPROVIDED);
                    var41 = (SubLObject)ConsesLow.cons(var53, var41);
                    var41 = (SubLObject)ConsesLow.cons(var52, var41);
                    var42 = (SubLObject)ConsesLow.cons(f42306(var48, var53, var52, var39, (SubLObject)module0691.NIL, (SubLObject)module0691.UNPROVIDED), var42);
                    var23_128 = var23_128.rest();
                    var49 = var23_128.first();
                }
                var47 = var47.rest();
                var48 = var47.first();
            }
            var47 = module0259.f16848(module0691.$ic69$, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
            SubLObject var54 = (SubLObject)module0691.NIL;
            var54 = var47.first();
            while (module0691.NIL != var47) {
                SubLObject var23_129 = module0220.f14598(var40, var54, (SubLObject)module0691.ONE_INTEGER, (SubLObject)module0691.$ic68$, (SubLObject)module0691.UNPROVIDED);
                SubLObject var55 = (SubLObject)module0691.NIL;
                var55 = var23_129.first();
                while (module0691.NIL != var23_129) {
                    final SubLObject var56 = var55.first();
                    final SubLObject var57 = conses_high.second(var55);
                    final SubLObject var58 = conses_high.third(var55);
                    final SubLObject var59 = f42291(var57, module0691.$ic59$, (SubLObject)module0691.UNPROVIDED);
                    final SubLObject var60 = f42291((SubLObject)ConsesLow.list(var56, var58, var57), module0691.$ic63$, (SubLObject)ConsesLow.list((SubLObject)module0691.$ic64$, var56, (SubLObject)module0691.$ic65$, var58, (SubLObject)module0691.$ic66$, var57));
                    var41 = (SubLObject)ConsesLow.cons(var59, var41);
                    var41 = (SubLObject)ConsesLow.cons(var60, var41);
                    var42 = (SubLObject)ConsesLow.cons(f42306(var58, var59, var60, var39, (SubLObject)module0691.NIL, (SubLObject)ConsesLow.list((SubLObject)module0691.$ic67$, var54)), var42);
                    var23_129 = var23_129.rest();
                    var55 = var23_129.first();
                }
                var47 = var47.rest();
                var54 = var47.first();
            }
            final SubLObject var61 = module0691.$ic70$;
            final SubLObject var62 = module0067.f4880((SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
            SubLObject var63 = module0220.f14598(var40, var61, (SubLObject)module0691.ONE_INTEGER, (SubLObject)module0691.$ic68$, (SubLObject)module0691.UNPROVIDED);
            SubLObject var55 = (SubLObject)module0691.NIL;
            var55 = var63.first();
            while (module0691.NIL != var63) {
                final SubLObject var56 = var55.first();
                final SubLObject var57 = conses_high.second(var55);
                final SubLObject var58 = conses_high.third(var55);
                final SubLObject var59 = f42291(var57, module0691.$ic59$, (SubLObject)module0691.UNPROVIDED);
                SubLObject var60 = module0067.f4884(var62, var56, (SubLObject)module0691.UNPROVIDED);
                if (module0691.NIL == var60) {
                    var60 = f42291((SubLObject)ConsesLow.list(var56, var58, var57), module0691.$ic71$, (SubLObject)ConsesLow.list((SubLObject)module0691.$ic64$, var56, (SubLObject)module0691.$ic65$, var58, (SubLObject)module0691.$ic66$, var57));
                    module0067.f4886(var62, var56, var60);
                }
                var41 = (SubLObject)ConsesLow.cons(var59, var41);
                var41 = (SubLObject)ConsesLow.cons(var60, var41);
                var42 = (SubLObject)ConsesLow.cons(f42306(var58, var59, var60, var39, (SubLObject)module0691.NIL, (SubLObject)ConsesLow.list((SubLObject)module0691.$ic67$, var61)), var42);
                var63 = var63.rest();
                var55 = var63.first();
            }
            var47 = module0259.f16848(module0691.$ic72$, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
            SubLObject var64 = (SubLObject)module0691.NIL;
            var64 = var47.first();
            while (module0691.NIL != var47) {
                SubLObject var23_130 = module0220.f14562(var40, var64, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                SubLObject var65 = (SubLObject)module0691.NIL;
                var65 = var23_130.first();
                while (module0691.NIL != var23_130) {
                    var41 = (SubLObject)ConsesLow.cons(f42291(var65, module0691.$ic59$, (SubLObject)module0691.UNPROVIDED), var41);
                    var23_130 = var23_130.rest();
                    var65 = var23_130.first();
                }
                var47 = var47.rest();
                var64 = var47.first();
            }
            var47 = module0259.f16850(module0691.$ic74$);
            SubLObject var66 = (SubLObject)module0691.NIL;
            var66 = var47.first();
            while (module0691.NIL != var47) {
                SubLObject var23_131 = module0220.f14598(var40, var66, (SubLObject)module0691.ONE_INTEGER, (SubLObject)module0691.$ic73$, (SubLObject)module0691.UNPROVIDED);
                SubLObject var67 = (SubLObject)module0691.NIL;
                var67 = var23_131.first();
                while (module0691.NIL != var23_131) {
                    final SubLObject var68 = var67.first();
                    final SubLObject var69 = conses_high.second(var67);
                    final SubLObject var70 = conses_high.third(var67);
                    final SubLObject var71 = conses_high.fourth(var67);
                    final SubLObject var72 = conses_high.fifth(var67);
                    final SubLObject var73 = f42291((SubLObject)ConsesLow.list(var72, var69, var68), module0691.$ic63$, (SubLObject)ConsesLow.list((SubLObject)module0691.$ic64$, var72, (SubLObject)module0691.$ic65$, var69, (SubLObject)module0691.$ic66$, var68));
                    final SubLObject var74 = f42291((SubLObject)ConsesLow.list(var72, var71, var70), module0691.$ic63$, (SubLObject)ConsesLow.list((SubLObject)module0691.$ic64$, var72, (SubLObject)module0691.$ic65$, var71, (SubLObject)module0691.$ic66$, var70));
                    final SubLObject var75 = f42306(var66, var73, var74, var39, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                    var41 = (SubLObject)ConsesLow.cons(var73, var41);
                    var41 = (SubLObject)ConsesLow.cons(var74, var41);
                    var42 = (SubLObject)ConsesLow.cons(var75, var42);
                    var23_131 = var23_131.rest();
                    var67 = var23_131.first();
                }
                var47 = var47.rest();
                var66 = var47.first();
            }
            SubLObject var76 = (SubLObject)module0691.NIL;
            SubLObject var77 = var42;
            SubLObject var78 = (SubLObject)module0691.NIL;
            var78 = var77.first();
            while (module0691.NIL != var77) {
                SubLObject var23_132 = var42;
                SubLObject var79 = (SubLObject)module0691.NIL;
                var79 = var23_132.first();
                while (module0691.NIL != var23_132) {
                    if (conses_high.getf(var78, (SubLObject)module0691.$ic75$, (SubLObject)module0691.UNPROVIDED).equal(conses_high.getf(var79, (SubLObject)module0691.$ic75$, (SubLObject)module0691.UNPROVIDED)) && conses_high.getf(var78, (SubLObject)module0691.$ic76$, (SubLObject)module0691.UNPROVIDED).equal(conses_high.getf(var79, (SubLObject)module0691.$ic76$, (SubLObject)module0691.UNPROVIDED)) && !conses_high.getf(var78, (SubLObject)module0691.$ic77$, (SubLObject)module0691.UNPROVIDED).equal(conses_high.getf(var79, (SubLObject)module0691.$ic77$, (SubLObject)module0691.UNPROVIDED))) {
                        if (module0691.NIL != module0260.f17089(conses_high.getf(var78, (SubLObject)module0691.$ic77$, (SubLObject)module0691.UNPROVIDED), conses_high.getf(var79, (SubLObject)module0691.$ic77$, (SubLObject)module0691.UNPROVIDED), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED)) {
                            final SubLObject var80 = var79;
                            if (module0691.NIL == conses_high.member(var80, var76, (SubLObject)module0691.EQUAL, Symbols.symbol_function((SubLObject)module0691.IDENTITY))) {
                                var76 = (SubLObject)ConsesLow.cons(var80, var76);
                            }
                        }
                        else {
                            final SubLObject var80 = var78;
                            if (module0691.NIL == conses_high.member(var80, var76, (SubLObject)module0691.EQUAL, Symbols.symbol_function((SubLObject)module0691.IDENTITY))) {
                                var76 = (SubLObject)ConsesLow.cons(var80, var76);
                            }
                        }
                    }
                    var23_132 = var23_132.rest();
                    var79 = var23_132.first();
                }
                var77 = var77.rest();
                var78 = var77.first();
            }
            SubLObject var81 = (SubLObject)module0691.NIL;
            var63 = var42;
            SubLObject var82 = (SubLObject)module0691.NIL;
            var82 = var63.first();
            while (module0691.NIL != var63) {
                if (module0691.NIL == module0004.f104(var82, var76, (SubLObject)module0691.EQUAL, (SubLObject)module0691.UNPROVIDED)) {
                    var81 = (SubLObject)ConsesLow.cons(var82, var81);
                }
                var63 = var63.rest();
                var82 = var63.first();
            }
            var42 = var81;
        }
        finally {
            module0147.$g2096$.rebind(var46, var37);
            module0147.$g2094$.rebind(var45, var37);
            module0147.$g2095$.rebind(var44, var37);
        }
        return f42293(module0035.f2267(var41, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), module0035.f2267(var42, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), (SubLObject)(var39.eql(module0691.$ic78$) ? module0691.NIL : ConsesLow.list((SubLObject)module0691.$ic39$, var39)));
    }
    
    public static SubLObject f42307(final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        final SubLObject var38 = conses_high.getf(var36, (SubLObject)module0691.$ic81$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var39 = conses_high.getf(var38, (SubLObject)module0691.$ic82$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var40 = conses_high.getf(var38, (SubLObject)module0691.$ic83$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var41 = module0361.f24195(var39, var40);
        final SubLObject var42 = f42308(var41);
        final SubLObject var43 = (SubLObject)module0691.NIL;
        SubLObject var44 = (SubLObject)module0691.NIL;
        var37.resetMultipleValues();
        final SubLObject var45 = module0685.f41988(var41);
        final SubLObject var46 = var37.secondMultipleValue();
        final SubLObject var47 = var37.thirdMultipleValue();
        var37.resetMultipleValues();
        SubLObject var48 = var45;
        SubLObject var49 = (SubLObject)module0691.NIL;
        var49 = var48.first();
        while (module0691.NIL != var48) {
            final SubLObject var50 = module0369.f25687(var49);
            SubLObject var23_167 = var42;
            SubLObject var51 = (SubLObject)module0691.NIL;
            var51 = var23_167.first();
            while (module0691.NIL != var23_167) {
                final SubLObject var52 = (module0691.NIL != module0201.f12546(conses_high.third(var51))) ? module0035.f2293(var50, conses_high.third(var51), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED) : conses_high.third(var51);
                final SubLObject var53 = f42291(module0035.f2293(var50, var51.first(), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                final SubLObject var54 = f42291(module0035.f2293(var50, conses_high.second(var51), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                final SubLObject var55 = conses_high.fourth(var51);
                final SubLObject var56 = (SubLObject)module0691.NIL;
                final SubLObject var57 = (SubLObject)((module0691.NIL != module0269.f17760(var52)) ? ConsesLow.list((SubLObject)module0691.$ic84$, (SubLObject)module0691.$ic85$) : module0691.NIL);
                var44 = (SubLObject)ConsesLow.cons(f42306(var52, var53, var54, var55, var56, var57), var44);
                var23_167 = var23_167.rest();
                var51 = var23_167.first();
            }
            var48 = var48.rest();
            var49 = var48.first();
        }
        return f42293(module0035.f2267(var43, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), module0035.f2267(var44, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), (SubLObject)((module0691.NIL != module0369.f25484(var41)) ? ConsesLow.list((SubLObject)module0691.$ic39$, module0369.f25484(var41)) : module0691.NIL));
    }
    
    public static SubLObject f42308(final SubLObject var160) {
        final SubLObject var161 = module0369.f25486(var160);
        final SubLObject var162 = module0369.f25590(var160);
        SubLObject var163 = (SubLObject)module0691.NIL;
        SubLObject var164 = module0369.f25487(var160);
        SubLObject var165 = (SubLObject)module0691.NIL;
        var165 = var164.first();
        while (module0691.NIL != var164) {
            SubLObject var23_174 = module0232.f15306(var165);
            SubLObject var166 = (SubLObject)module0691.NIL;
            var166 = var23_174.first();
            while (module0691.NIL != var23_174) {
                SubLObject var167 = module0362.f24436(var166);
                final SubLObject var168 = module0362.f24435(var166);
                final SubLObject var169 = var167.first();
                if (module0691.NIL != module0173.f10955(var169) && module0220.f14556(var169, module0691.$ic87$, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED).eql(module0691.$ic88$)) {
                    var167 = conses_high.second(var167);
                }
                SubLObject var170 = (SubLObject)module0691.NIL;
                SubLObject var171 = (SubLObject)module0691.NIL;
                SubLObject var172 = (SubLObject)module0691.NIL;
                var170 = module0205.f13377(var167, (SubLObject)module0691.UNPROVIDED);
                var171 = var170.first();
                for (var172 = (SubLObject)module0691.ZERO_INTEGER; module0691.NIL != var170; var170 = var170.rest(), var171 = var170.first(), var172 = Numbers.add((SubLObject)module0691.ONE_INTEGER, var172)) {
                    SubLObject var178_181 = (SubLObject)module0691.NIL;
                    SubLObject var173 = (SubLObject)module0691.NIL;
                    SubLObject var174 = (SubLObject)module0691.NIL;
                    var178_181 = module0205.f13377(var167, (SubLObject)module0691.UNPROVIDED);
                    var173 = var178_181.first();
                    for (var174 = (SubLObject)module0691.ZERO_INTEGER; module0691.NIL != var178_181; var178_181 = var178_181.rest(), var173 = var178_181.first(), var174 = Numbers.add((SubLObject)module0691.ONE_INTEGER, var174)) {
                        if (var172.numL(var174) && module0691.NIL != module0206.f13500(var171) && module0691.NIL != module0206.f13500(var173)) {
                            final SubLObject var175 = module0035.f2304(var161, var171, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                            final SubLObject var176 = module0035.f2304(var161, var173, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                            if (module0691.NIL != module0004.f104(var175, var162, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED) && module0691.NIL != module0004.f104(var176, var162, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED)) {
                                SubLObject var45_186 = (module0691.NIL != module0206.f13500(module0205.f13378(var167))) ? module0035.f2304(var161, module0205.f13378(var167), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED) : module0205.f13378(var167);
                                if (var45_186.eql(module0691.$ic89$)) {
                                    var45_186 = module0691.$g5450$.getGlobalValue();
                                }
                                var163 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var175, var176, var45_186, var168), var163);
                            }
                        }
                    }
                }
                var23_174 = var23_174.rest();
                var166 = var23_174.first();
            }
            SubLObject var23_175 = module0232.f15308(var165);
            var166 = (SubLObject)module0691.NIL;
            var166 = var23_175.first();
            while (module0691.NIL != var23_175) {
                SubLObject var167 = module0362.f24436(var166);
                final SubLObject var168 = module0362.f24435(var166);
                final SubLObject var169 = var167.first();
                if (module0691.NIL != module0173.f10955(var169) && module0220.f14556(var169, module0691.$ic87$, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED).eql(module0691.$ic88$)) {
                    var167 = conses_high.second(var167);
                }
                SubLObject var170 = (SubLObject)module0691.NIL;
                SubLObject var171 = (SubLObject)module0691.NIL;
                SubLObject var172 = (SubLObject)module0691.NIL;
                var170 = module0205.f13377(var167, (SubLObject)module0691.UNPROVIDED);
                var171 = var170.first();
                for (var172 = (SubLObject)module0691.ZERO_INTEGER; module0691.NIL != var170; var170 = var170.rest(), var171 = var170.first(), var172 = Numbers.add((SubLObject)module0691.ONE_INTEGER, var172)) {
                    SubLObject var178_182 = (SubLObject)module0691.NIL;
                    SubLObject var173 = (SubLObject)module0691.NIL;
                    SubLObject var174 = (SubLObject)module0691.NIL;
                    var178_182 = module0205.f13377(var167, (SubLObject)module0691.UNPROVIDED);
                    var173 = var178_182.first();
                    for (var174 = (SubLObject)module0691.ZERO_INTEGER; module0691.NIL != var178_182; var178_182 = var178_182.rest(), var173 = var178_182.first(), var174 = Numbers.add((SubLObject)module0691.ONE_INTEGER, var174)) {
                        if (var172.numL(var174) && module0691.NIL != module0206.f13500(var171) && module0691.NIL != module0206.f13500(var173)) {
                            final SubLObject var175 = module0035.f2304(var161, var171, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                            final SubLObject var176 = module0035.f2304(var161, var173, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                            if (module0691.NIL != module0004.f104(var175, var162, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED) && module0691.NIL != module0004.f104(var176, var162, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED)) {
                                SubLObject var45_187 = (module0691.NIL != module0206.f13500(module0205.f13378(var167))) ? module0035.f2304(var161, module0205.f13378(var167), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED) : module0205.f13378(var167);
                                if (var45_187.eql(module0691.$ic89$)) {
                                    var45_187 = module0691.$g5450$.getGlobalValue();
                                }
                                var163 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var175, var176, var45_187, var168), var163);
                            }
                        }
                    }
                }
                var23_175 = var23_175.rest();
                var166 = var23_175.first();
            }
            var164 = var164.rest();
            var165 = var164.first();
        }
        if (module0691.NIL == var163) {
            final SubLObject var177 = var162.first();
            SubLObject var179;
            final SubLObject var178 = var179 = var162.rest();
            SubLObject var180 = (SubLObject)module0691.NIL;
            var180 = var179.first();
            while (module0691.NIL != var179) {
                var163 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var177, var180, module0691.$g5450$.getGlobalValue(), module0691.$ic78$), var163);
                var179 = var179.rest();
                var180 = var179.first();
            }
        }
        return var163;
    }
    
    public static SubLObject f42309(final SubLObject var160) {
        final SubLThread var161 = SubLProcess.currentSubLThread();
        final SubLObject var162 = f42308(var160);
        final SubLObject var163 = module0369.f25485(var160);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0691.UNPROVIDED);
        module0642.f39020((SubLObject)module0691.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0691.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0691.UNPROVIDED);
        module0642.f39020((SubLObject)module0691.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0691.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var164 = module0015.$g533$.currentBinding(var161);
        try {
            module0015.$g533$.bind((SubLObject)module0691.T, var161);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0691.UNPROVIDED);
            final SubLObject var124_194 = module0015.$g533$.currentBinding(var161);
            try {
                module0015.$g533$.bind((SubLObject)module0691.T, var161);
                module0642.f39020(module0015.$g362$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0691.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0691.$ic90$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0691.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0691.UNPROVIDED);
                final SubLObject var124_195 = module0015.$g533$.currentBinding(var161);
                try {
                    module0015.$g533$.bind((SubLObject)module0691.T, var161);
                    module0642.f39019((SubLObject)module0691.$ic91$);
                }
                finally {
                    module0015.$g533$.rebind(var124_195, var161);
                }
                module0642.f39020(module0015.$g363$.getGlobalValue());
                module0642.f39020(module0015.$g362$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0691.UNPROVIDED);
                final SubLObject var124_196 = module0015.$g533$.currentBinding(var161);
                try {
                    module0015.$g533$.bind((SubLObject)module0691.T, var161);
                    module0642.f39027((SubLObject)module0691.$ic92$, (SubLObject)module0691.THREE_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var124_196, var161);
                }
                module0642.f39020(module0015.$g363$.getGlobalValue());
                module0642.f39020(module0015.$g362$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0691.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0691.$ic90$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0691.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0691.UNPROVIDED);
                final SubLObject var124_197 = module0015.$g533$.currentBinding(var161);
                try {
                    module0015.$g533$.bind((SubLObject)module0691.T, var161);
                    module0642.f39019((SubLObject)module0691.$ic93$);
                }
                finally {
                    module0015.$g533$.rebind(var124_197, var161);
                }
                module0642.f39020(module0015.$g363$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var124_194, var161);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0691.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0691.UNPROVIDED);
            final SubLObject var124_198 = module0015.$g533$.currentBinding(var161);
            try {
                module0015.$g533$.bind((SubLObject)module0691.T, var161);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0691.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0691.$ic94$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0691.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0691.UNPROVIDED);
                final SubLObject var124_199 = module0015.$g533$.currentBinding(var161);
                try {
                    module0015.$g533$.bind((SubLObject)module0691.T, var161);
                    final SubLObject var165 = (SubLObject)module0691.ONE_INTEGER;
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (module0691.NIL != var165) {
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0691.UNPROVIDED);
                        module0642.f39020(var165);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0691.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0691.UNPROVIDED);
                    final SubLObject var124_200 = module0015.$g533$.currentBinding(var161);
                    try {
                        module0015.$g533$.bind((SubLObject)module0691.T, var161);
                        module0656.f39804(var163, (SubLObject)module0691.ZERO_INTEGER, (SubLObject)module0691.T);
                    }
                    finally {
                        module0015.$g533$.rebind(var124_200, var161);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var124_199, var161);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0691.UNPROVIDED);
                final SubLObject var124_201 = module0015.$g533$.currentBinding(var161);
                try {
                    module0015.$g533$.bind((SubLObject)module0691.T, var161);
                    module0642.f39027((SubLObject)module0691.$ic92$, (SubLObject)module0691.THREE_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var124_201, var161);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0691.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0691.$ic94$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0691.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0691.UNPROVIDED);
                final SubLObject var124_202 = module0015.$g533$.currentBinding(var161);
                try {
                    module0015.$g533$.bind((SubLObject)module0691.T, var161);
                    final SubLObject var165 = (SubLObject)module0691.ONE_INTEGER;
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (module0691.NIL != var165) {
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0691.UNPROVIDED);
                        module0642.f39020(var165);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0691.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0691.UNPROVIDED);
                    final SubLObject var124_203 = module0015.$g533$.currentBinding(var161);
                    try {
                        module0015.$g533$.bind((SubLObject)module0691.T, var161);
                        SubLObject var166 = var162;
                        SubLObject var167 = (SubLObject)module0691.NIL;
                        var167 = var166.first();
                        while (module0691.NIL != var166) {
                            module0642.f39020(module0015.$g459$.getGlobalValue());
                            module0656.f39804(var167.first(), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                            module0642.f39019((SubLObject)module0691.$ic95$);
                            module0656.f39804(conses_high.third(var167), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                            if (module0691.NIL != module0269.f17760(conses_high.third(var167))) {
                                module0642.f39019((SubLObject)module0691.$ic95$);
                            }
                            else {
                                module0642.f39019((SubLObject)module0691.$ic96$);
                            }
                            module0656.f39804(conses_high.second(var167), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                            module0642.f39020(module0015.$g460$.getGlobalValue());
                            module0642.f39067();
                            var166 = var166.rest();
                            var167 = var166.first();
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var124_203, var161);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var124_202, var161);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var124_198, var161);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0691.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var164, var161);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0691.NIL;
    }
    
    public static SubLObject f42310(final SubLObject var36) {
        final SubLObject var37 = conses_high.getf(var36, (SubLObject)module0691.$ic81$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var38 = conses_high.getf(var37, (SubLObject)module0691.$ic99$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var39 = conses_high.getf(var37, (SubLObject)module0691.$ic100$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var40 = module0361.f24195(var38, var39);
        if (module0691.NIL == module0369.f25275(var40)) {
            Errors.error((SubLObject)module0691.$ic101$);
        }
        final SubLObject var41 = module0369.f25484(var40);
        final SubLObject var42 = module0369.f25487(var40);
        final SubLObject var43 = f42311(var40);
        final SubLObject var44 = (SubLObject)module0691.NIL;
        SubLObject var45 = (SubLObject)module0691.NIL;
        SubLObject var46 = var42;
        SubLObject var47 = (SubLObject)module0691.NIL;
        var47 = var46.first();
        while (module0691.NIL != var46) {
            SubLObject var48 = (SubLObject)module0691.$ic102$;
            SubLObject var49 = (SubLObject)module0691.ZERO_INTEGER;
            SubLObject var23_213 = module0232.f15306(var47);
            SubLObject var50 = (SubLObject)module0691.NIL;
            var50 = var23_213.first();
            while (module0691.NIL != var23_213) {
                SubLObject var52;
                final SubLObject var51 = var52 = var50;
                SubLObject var53 = (SubLObject)module0691.NIL;
                SubLObject var54 = (SubLObject)module0691.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var52, var51, (SubLObject)module0691.$ic103$);
                var53 = var52.first();
                var52 = var52.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var52, var51, (SubLObject)module0691.$ic103$);
                var54 = var52.first();
                var52 = var52.rest();
                if (module0691.NIL == var52) {
                    var45 = (SubLObject)ConsesLow.cons(f42312(var54, var43, var53), var45);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var51, (SubLObject)module0691.$ic103$);
                }
                var49 = Numbers.add(var49, (SubLObject)module0691.ONE_INTEGER);
                var23_213 = var23_213.rest();
                var50 = var23_213.first();
            }
            var48 = (SubLObject)module0691.$ic104$;
            var49 = (SubLObject)module0691.ZERO_INTEGER;
            SubLObject var23_214 = module0232.f15308(var47);
            var50 = (SubLObject)module0691.NIL;
            var50 = var23_214.first();
            while (module0691.NIL != var23_214) {
                SubLObject var56;
                final SubLObject var55 = var56 = var50;
                SubLObject var53 = (SubLObject)module0691.NIL;
                SubLObject var54 = (SubLObject)module0691.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)module0691.$ic103$);
                var53 = var56.first();
                var56 = var56.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)module0691.$ic103$);
                var54 = var56.first();
                var56 = var56.rest();
                if (module0691.NIL == var56) {
                    var45 = (SubLObject)ConsesLow.cons(f42312(var54, var43, var53), var45);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var55, (SubLObject)module0691.$ic103$);
                }
                var49 = Numbers.add(var49, (SubLObject)module0691.ONE_INTEGER);
                var23_214 = var23_214.rest();
                var50 = var23_214.first();
            }
            var46 = var46.rest();
            var47 = var46.first();
        }
        return f42293(module0035.f2267(var44, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), module0035.f2267(var45, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)module0691.$ic39$, var41));
    }
    
    public static SubLObject f42313(final SubLObject var36) {
        final SubLObject var37 = conses_high.getf(var36, (SubLObject)module0691.$ic107$, (SubLObject)module0691.UNPROVIDED);
        SubLObject var38 = (SubLObject)module0691.NIL;
        final SubLObject var39 = (SubLObject)module0691.NIL;
        SubLObject var40 = (SubLObject)module0691.NIL;
        SubLObject var41 = var37;
        SubLObject var42 = (SubLObject)module0691.NIL;
        var42 = var41.first();
        while (module0691.NIL != var41) {
            var38 = module0178.f11287(var42);
            final SubLObject var43 = module0178.f11282(var42);
            final SubLObject var44 = module0232.f15306(var43);
            final SubLObject var45 = module0232.f15308(var43);
            final SubLObject var46 = f42314(var42);
            SubLObject var23_226 = var44;
            SubLObject var47 = (SubLObject)module0691.NIL;
            var47 = var23_226.first();
            while (module0691.NIL != var23_226) {
                var40 = (SubLObject)ConsesLow.cons(f42312(var47, var46, var38), var40);
                var23_226 = var23_226.rest();
                var47 = var23_226.first();
            }
            SubLObject var23_227 = var45;
            SubLObject var48 = (SubLObject)module0691.NIL;
            var48 = var23_227.first();
            while (module0691.NIL != var23_227) {
                var40 = (SubLObject)ConsesLow.cons(f42312(var48, var46, var38), var40);
                var23_227 = var23_227.rest();
                var48 = var23_227.first();
            }
            var41 = var41.rest();
            var42 = var41.first();
        }
        return f42293(module0035.f2267(var39, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), module0035.f2267(var40, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)module0691.$ic39$, var38));
    }
    
    public static SubLObject f42312(final SubLObject var175, final SubLObject var209, final SubLObject var18) {
        if (module0691.NIL != module0202.f12856(var175)) {
            return (SubLObject)module0691.NIL;
        }
        final SubLObject var210 = module0205.f13132(var175);
        SubLObject var211 = module0202.f12834(var175, (SubLObject)module0691.UNPROVIDED);
        SubLObject var212 = (module0691.NIL != module0202.f12857(var175)) ? module0202.f12835(var175, (SubLObject)module0691.UNPROVIDED) : module0202.f12829(var175, (SubLObject)module0691.UNPROVIDED).rest();
        SubLObject var213 = (SubLObject)module0691.NIL;
        SubLObject var214 = (SubLObject)module0691.NIL;
        SubLObject var215 = (SubLObject)module0691.NIL;
        var213 = var209;
        var214 = var213.first();
        for (var215 = (SubLObject)module0691.ZERO_INTEGER; module0691.NIL != var213; var213 = var213.rest(), var214 = var213.first(), var215 = Numbers.add((SubLObject)module0691.ONE_INTEGER, var215)) {
            final SubLObject var216 = module0193.f12075(var215);
            var211 = module0035.f2457((SubLObject)ConsesLow.list(var211), var216, var214).first();
            var212 = module0035.f2457((SubLObject)ConsesLow.list(var212), var216, var214).first();
        }
        final SubLObject var217 = f42291(var211, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var218 = f42291(var212, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
        return f42306(var210, var217, var218, var18, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
    }
    
    public static SubLObject f42311(final SubLObject var160) {
        final SubLObject var161 = module0369.f25486(var160);
        SubLObject var162 = (SubLObject)module0691.ZERO_INTEGER;
        SubLObject var163 = (SubLObject)module0691.NIL;
        SubLObject var164 = var161;
        SubLObject var165 = (SubLObject)module0691.NIL;
        var165 = var164.first();
        while (module0691.NIL != var164) {
            SubLObject var167;
            final SubLObject var166 = var167 = var165;
            SubLObject var168 = (SubLObject)module0691.NIL;
            SubLObject var169 = (SubLObject)module0691.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var167, var166, (SubLObject)module0691.$ic108$);
            var168 = var167.first();
            var167 = (var169 = var167.rest());
            final SubLObject var170 = Numbers.add((SubLObject)module0691.ONE_INTEGER, module0193.f12073(var169));
            if (var170.numG(var162)) {
                var162 = var170;
            }
            var164 = var164.rest();
            var165 = var164.first();
        }
        var163 = (SubLObject)ConsesLow.make_list(var162, (SubLObject)module0691.UNPROVIDED);
        var164 = var161;
        var165 = (SubLObject)module0691.NIL;
        var165 = var164.first();
        while (module0691.NIL != var164) {
            SubLObject var172;
            final SubLObject var171 = var172 = var165;
            SubLObject var168 = (SubLObject)module0691.NIL;
            SubLObject var169 = (SubLObject)module0691.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var172, var171, (SubLObject)module0691.$ic108$);
            var168 = var172.first();
            var172 = (var169 = var172.rest());
            ConsesLow.set_nth(module0193.f12073(var169), var163, var168);
            var164 = var164.rest();
            var165 = var164.first();
        }
        return var163;
    }
    
    public static SubLObject f42314(final SubLObject var222) {
        return Mapping.mapcar((SubLObject)module0691.$ic109$, module0178.f11294(var222));
    }
    
    public static SubLObject f42315(final SubLObject var222) {
        if (module0691.NIL == module0174.f11035(var222)) {
            return (SubLObject)module0691.NIL;
        }
        final SubLObject var223 = module0178.f11303(var222);
        return f42292(module0205.f13132(var223), module0205.f13203(var223, (SubLObject)module0691.UNPROVIDED), module0205.f13204(var223, (SubLObject)module0691.UNPROVIDED), module0178.f11287(var222), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
    }
    
    public static SubLObject f42293(SubLObject var243, final SubLObject var244, SubLObject var171) {
        if (var171 == module0691.UNPROVIDED) {
            var171 = (SubLObject)module0691.NIL;
        }
        if (module0691.NIL != var244 && module0691.NIL == var243) {
            SubLObject var245 = var244;
            SubLObject var246 = (SubLObject)module0691.NIL;
            var246 = var245.first();
            while (module0691.NIL != var245) {
                var243 = (SubLObject)ConsesLow.cons(conses_high.getf(var246, (SubLObject)module0691.$ic75$, (SubLObject)module0691.UNPROVIDED), var243);
                var243 = (SubLObject)ConsesLow.cons(conses_high.getf(var246, (SubLObject)module0691.$ic76$, (SubLObject)module0691.UNPROVIDED), var243);
                var245 = var245.rest();
                var246 = var245.first();
            }
            var243 = module0035.f2267(var243, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0691.$ic110$, var243, (SubLObject)module0691.$ic111$, var244, (SubLObject)module0691.$ic112$, var171);
    }
    
    public static SubLObject f42292(final SubLObject var45, final SubLObject var103, final SubLObject var108, SubLObject var18, SubLObject var16, SubLObject var245, SubLObject var246, SubLObject var171) {
        if (var16 == module0691.UNPROVIDED) {
            var16 = (SubLObject)module0691.NIL;
        }
        if (var245 == module0691.UNPROVIDED) {
            var245 = (SubLObject)module0691.NIL;
        }
        if (var246 == module0691.UNPROVIDED) {
            var246 = (SubLObject)module0691.NIL;
        }
        if (var171 == module0691.UNPROVIDED) {
            var171 = (SubLObject)module0691.NIL;
        }
        final SubLObject var247 = module0217.f14424((SubLObject)ConsesLow.list(var45, var103, var108), var18);
        SubLObject var248 = (SubLObject)module0691.T;
        SubLObject var249 = (SubLObject)module0691.NIL;
        SubLObject var250 = (SubLObject)module0691.$ic113$;
        if (module0691.NIL != module0174.f11035(var247)) {
            var248 = (SubLObject)((module0178.f11292(var247) == module0691.$ic114$) ? module0691.T : module0691.NIL);
            var249 = module0178.f11375(var247);
            var250 = module0178.f11293(var247);
            var18 = module0178.f11287(var247);
        }
        else if (module0691.NIL != module0244.f15730(var45)) {
            var18 = module0253.f16446(module0137.f8955(var45), var103, var108, module0691.$ic51$).first();
        }
        return (SubLObject)ConsesLow.list(new SubLObject[] { module0691.$ic77$, var45, module0691.$ic76$, f42291(var103, var245, (SubLObject)module0691.UNPROVIDED), module0691.$ic75$, f42291(var108, var246, (SubLObject)module0691.UNPROVIDED), module0691.$ic39$, var18, module0691.$ic115$, var248, module0691.$ic116$, var249, module0691.$ic10$, var250, module0691.$ic12$, var16, module0691.$ic112$, var171 });
    }
    
    public static SubLObject f42306(final SubLObject var45, final SubLObject var169, final SubLObject var170, final SubLObject var18, SubLObject var16, SubLObject var171) {
        if (var16 == module0691.UNPROVIDED) {
            var16 = (SubLObject)module0691.NIL;
        }
        if (var171 == module0691.UNPROVIDED) {
            var171 = (SubLObject)module0691.NIL;
        }
        return (SubLObject)ConsesLow.list(new SubLObject[] { module0691.$ic77$, var45, module0691.$ic76$, var169, module0691.$ic75$, var170, module0691.$ic39$, var18, module0691.$ic12$, var16, module0691.$ic112$, var171 });
    }
    
    public static SubLObject f42291(final SubLObject var250, SubLObject var16, SubLObject var171) {
        if (var16 == module0691.UNPROVIDED) {
            var16 = (SubLObject)module0691.NIL;
        }
        if (var171 == module0691.UNPROVIDED) {
            var171 = (SubLObject)module0691.NIL;
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0691.$ic117$, var250, (SubLObject)module0691.$ic12$, var16, (SubLObject)module0691.$ic112$, var171);
    }
    
    public static SubLObject f42316() {
        return module0118.f8175((SubLObject)module0691.$ic122$);
    }
    
    public static SubLObject f42317() {
        if (module0691.NIL == f42316()) {
            f42318();
        }
        return module0118.f8177();
    }
    
    public static SubLObject f42319(final SubLObject var251) {
        final SubLObject var252 = module0691.$g5451$.getGlobalValue();
        SubLObject var253 = (SubLObject)module0691.NIL;
        try {
            var253 = Locks.seize_lock(var252);
            if (module0691.NIL == Sequences.find(var251, module0691.$g5452$.getGlobalValue(), (SubLObject)module0691.EQUALP, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED)) {
                module0691.$g5452$.setGlobalValue((SubLObject)ConsesLow.cons(var251, module0691.$g5452$.getGlobalValue()));
                if (module0691.NIL != f42316()) {
                    module0117.f8156(var251, (SubLObject)module0691.NIL);
                }
            }
        }
        finally {
            if (module0691.NIL != var253) {
                Locks.release_lock(var252);
            }
        }
        return var251;
    }
    
    public static SubLObject f42320(final SubLObject var254) {
        final SubLObject var255 = module0691.$g5451$.getGlobalValue();
        SubLObject var256 = (SubLObject)module0691.NIL;
        try {
            var256 = Locks.seize_lock(var255);
            module0691.$g5452$.setGlobalValue(Sequences.remove(var254, module0691.$g5452$.getGlobalValue(), (SubLObject)module0691.EQUALP, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED));
            if (module0691.NIL != f42316()) {
                module0117.f8158(var254, (SubLObject)module0691.NIL);
            }
        }
        finally {
            if (module0691.NIL != var256) {
                Locks.release_lock(var255);
            }
        }
        return var254;
    }
    
    public static SubLObject f42321() {
        return module0118.f8181((SubLObject)module0691.$ic122$);
    }
    
    public static SubLObject f42318() {
        return module0118.f8178((SubLObject)module0691.$ic122$);
    }
    
    public static SubLObject f42322(final SubLObject var257, final SubLObject var258) {
        f42317();
        final SubLObject var259 = module0116.f8064((SubLObject)module0691.$ic120$, var258, var257);
        return module0117.f8161(var259, module0117.f8146());
    }
    
    public static SubLObject f42323(final SubLObject var257) {
        SubLObject var258 = module0119.f8235(var257);
        if (module0691.NIL != module0038.f2608(var258)) {
            var258 = (SubLObject)module0691.NIL;
        }
        return var258;
    }
    
    public static SubLObject f42324(final SubLObject var257) {
        return f42323(var257);
    }
    
    public static SubLObject f42325() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        return module0691.$g5453$.getDynamicValue(var10);
    }
    
    public static SubLObject f42326(final SubLObject var261) {
        final SubLObject var262 = f42325();
        module0119.f8233(var261, var262);
        return var261;
    }
    
    public static SubLObject f42327(final SubLObject var259) {
        final SubLObject var260 = module0116.f8055(var259);
        final SubLObject var261 = module0116.f8056(var259);
        module0119.f8232(var260, var261, (SubLObject)module0691.UNPROVIDED);
        return var259;
    }
    
    public static SubLObject f42328(final SubLObject var259, SubLObject var157) {
        if (var157 == module0691.UNPROVIDED) {
            var157 = (SubLObject)module0691.NIL;
        }
        f42327(var259);
        return var259;
    }
    
    public static SubLObject f42329(final SubLObject var264, final SubLObject var265) {
        compatibility.default_struct_print_function(var264, var265, (SubLObject)module0691.ZERO_INTEGER);
        return (SubLObject)module0691.NIL;
    }
    
    public static SubLObject f42330(final SubLObject var264) {
        return (SubLObject)((var264.getClass() == $sX46272_native.class) ? module0691.T : module0691.NIL);
    }
    
    public static SubLObject f42331(final SubLObject var264) {
        assert module0691.NIL != f42330(var264) : var264;
        return var264.getField2();
    }
    
    public static SubLObject f42332(final SubLObject var264) {
        assert module0691.NIL != f42330(var264) : var264;
        return var264.getField3();
    }
    
    public static SubLObject f42333(final SubLObject var264) {
        assert module0691.NIL != f42330(var264) : var264;
        return var264.getField4();
    }
    
    public static SubLObject f42334(final SubLObject var264) {
        assert module0691.NIL != f42330(var264) : var264;
        return var264.getField5();
    }
    
    public static SubLObject f42335(final SubLObject var264) {
        assert module0691.NIL != f42330(var264) : var264;
        return var264.getField6();
    }
    
    public static SubLObject f42336(final SubLObject var264) {
        assert module0691.NIL != f42330(var264) : var264;
        return var264.getField7();
    }
    
    public static SubLObject f42337(final SubLObject var264) {
        assert module0691.NIL != f42330(var264) : var264;
        return var264.getField8();
    }
    
    public static SubLObject f42338(final SubLObject var264) {
        assert module0691.NIL != f42330(var264) : var264;
        return var264.getField9();
    }
    
    public static SubLObject f42339(final SubLObject var264, final SubLObject var266) {
        assert module0691.NIL != f42330(var264) : var264;
        return var264.setField2(var266);
    }
    
    public static SubLObject f42340(final SubLObject var264, final SubLObject var266) {
        assert module0691.NIL != f42330(var264) : var264;
        return var264.setField3(var266);
    }
    
    public static SubLObject f42341(final SubLObject var264, final SubLObject var266) {
        assert module0691.NIL != f42330(var264) : var264;
        return var264.setField4(var266);
    }
    
    public static SubLObject f42342(final SubLObject var264, final SubLObject var266) {
        assert module0691.NIL != f42330(var264) : var264;
        return var264.setField5(var266);
    }
    
    public static SubLObject f42343(final SubLObject var264, final SubLObject var266) {
        assert module0691.NIL != f42330(var264) : var264;
        return var264.setField6(var266);
    }
    
    public static SubLObject f42344(final SubLObject var264, final SubLObject var266) {
        assert module0691.NIL != f42330(var264) : var264;
        return var264.setField7(var266);
    }
    
    public static SubLObject f42345(final SubLObject var264, final SubLObject var266) {
        assert module0691.NIL != f42330(var264) : var264;
        return var264.setField8(var266);
    }
    
    public static SubLObject f42346(final SubLObject var264, final SubLObject var266) {
        assert module0691.NIL != f42330(var264) : var264;
        return var264.setField9(var266);
    }
    
    public static SubLObject f42347(SubLObject var267) {
        if (var267 == module0691.UNPROVIDED) {
            var267 = (SubLObject)module0691.NIL;
        }
        final SubLObject var268 = (SubLObject)new $sX46272_native();
        SubLObject var269;
        SubLObject var270;
        SubLObject var271;
        SubLObject var272;
        for (var269 = (SubLObject)module0691.NIL, var269 = var267; module0691.NIL != var269; var269 = conses_high.cddr(var269)) {
            var270 = var269.first();
            var271 = conses_high.cadr(var269);
            var272 = var270;
            if (var272.eql((SubLObject)module0691.$ic150$)) {
                f42339(var268, var271);
            }
            else if (var272.eql((SubLObject)module0691.$ic151$)) {
                f42340(var268, var271);
            }
            else if (var272.eql((SubLObject)module0691.$ic110$)) {
                f42341(var268, var271);
            }
            else if (var272.eql((SubLObject)module0691.$ic152$)) {
                f42342(var268, var271);
            }
            else if (var272.eql((SubLObject)module0691.$ic111$)) {
                f42343(var268, var271);
            }
            else if (var272.eql((SubLObject)module0691.$ic153$)) {
                f42344(var268, var271);
            }
            else if (var272.eql((SubLObject)module0691.$ic154$)) {
                f42345(var268, var271);
            }
            else if (var272.eql((SubLObject)module0691.$ic155$)) {
                f42346(var268, var271);
            }
            else {
                Errors.error((SubLObject)module0691.$ic156$, var270);
            }
        }
        return var268;
    }
    
    public static SubLObject f42348(final SubLObject var273, final SubLObject var274) {
        Functions.funcall(var274, var273, (SubLObject)module0691.$ic157$, (SubLObject)module0691.$ic158$, (SubLObject)module0691.EIGHT_INTEGER);
        Functions.funcall(var274, var273, (SubLObject)module0691.$ic159$, (SubLObject)module0691.$ic150$, f42331(var273));
        Functions.funcall(var274, var273, (SubLObject)module0691.$ic159$, (SubLObject)module0691.$ic151$, f42332(var273));
        Functions.funcall(var274, var273, (SubLObject)module0691.$ic159$, (SubLObject)module0691.$ic110$, f42333(var273));
        Functions.funcall(var274, var273, (SubLObject)module0691.$ic159$, (SubLObject)module0691.$ic152$, f42334(var273));
        Functions.funcall(var274, var273, (SubLObject)module0691.$ic159$, (SubLObject)module0691.$ic111$, f42335(var273));
        Functions.funcall(var274, var273, (SubLObject)module0691.$ic159$, (SubLObject)module0691.$ic153$, f42336(var273));
        Functions.funcall(var274, var273, (SubLObject)module0691.$ic159$, (SubLObject)module0691.$ic154$, f42337(var273));
        Functions.funcall(var274, var273, (SubLObject)module0691.$ic159$, (SubLObject)module0691.$ic155$, f42338(var273));
        Functions.funcall(var274, var273, (SubLObject)module0691.$ic160$, (SubLObject)module0691.$ic158$, (SubLObject)module0691.EIGHT_INTEGER);
        return var273;
    }
    
    public static SubLObject f42349(final SubLObject var273, final SubLObject var274) {
        return f42348(var273, var274);
    }
    
    public static SubLObject f42350() {
        final SubLObject var275 = f42347((SubLObject)module0691.UNPROVIDED);
        f42339(var275, module0057.f4173((SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED));
        f42340(var275, module0067.f4880((SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED));
        f42342(var275, module0067.f4880((SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED));
        f42343(var275, (SubLObject)module0691.NIL);
        f42341(var275, module0067.f4880((SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED));
        f42344(var275, module0067.f4880((SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED));
        f42345(var275, module0067.f4880((SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED));
        f42346(var275, module0067.f4880((SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED));
        return var275;
    }
    
    public static SubLObject f42351(final SubLObject var275, final SubLObject var16, final SubLObject var276) {
        final SubLObject var277 = f42336(var275);
        module0067.f4886(var277, var16, (SubLObject)ConsesLow.list((SubLObject)module0691.$ic162$, var276));
        return var275;
    }
    
    public static SubLObject f42352(final SubLObject var275, final SubLObject var16, final SubLObject var276, SubLObject var278) {
        if (var278 == module0691.UNPROVIDED) {
            var278 = (SubLObject)module0691.$ic113$;
        }
        final SubLObject var279 = f42337(var275);
        module0067.f4886(var279, var16, (SubLObject)ConsesLow.list((SubLObject)module0691.$ic162$, var276, (SubLObject)module0691.$ic163$, var278));
        return var275;
    }
    
    public static SubLObject f42353(final SubLObject var275, final SubLObject var280, final SubLObject var281) {
        final SubLObject var282 = f42338(var275);
        module0067.f4886(var282, var280, var281);
        return var275;
    }
    
    public static SubLObject f42354(final SubLObject var275, SubLObject var16, SubLObject var283) {
        if (var16 == module0691.UNPROVIDED) {
            var16 = (SubLObject)module0691.$ic113$;
        }
        if (var283 == module0691.UNPROVIDED) {
            var283 = (SubLObject)module0691.$ic164$;
        }
        final SubLObject var284 = f42355(var275);
        final SubLObject var285 = f42333(var275);
        final SubLObject var286 = f42332(var275);
        final SubLObject var287 = (SubLObject)ConsesLow.list((SubLObject)module0691.$ic165$, var284, (SubLObject)module0691.$ic12$, var16, (SubLObject)module0691.$ic166$, var283);
        module0067.f4886(var285, var284, var287);
        if (module0691.NIL == module0038.f2608(var283)) {
            module0067.f4886(var286, var283, var287);
        }
        return var275;
    }
    
    public static SubLObject f42356(final SubLObject var286) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var286.isList() && f42357(var286).isFixnum());
    }
    
    public static SubLObject f42358(final SubLObject var275, final SubLObject var283, SubLObject var16) {
        if (var16 == module0691.UNPROVIDED) {
            var16 = (SubLObject)module0691.$ic113$;
        }
        if (module0691.NIL == f42356(f42359(var275, var283))) {
            f42354(var275, var16, var283);
        }
        return var275;
    }
    
    public static SubLObject f42357(final SubLObject var286) {
        return conses_high.getf(var286, (SubLObject)module0691.$ic165$, (SubLObject)module0691.UNPROVIDED);
    }
    
    public static SubLObject f42360(final SubLObject var286) {
        return conses_high.getf(var286, (SubLObject)module0691.$ic12$, (SubLObject)module0691.$ic113$);
    }
    
    public static SubLObject f42361(final SubLObject var286) {
        return conses_high.getf(var286, (SubLObject)module0691.$ic166$, (SubLObject)module0691.$ic164$);
    }
    
    public static SubLObject f42362(final SubLObject var275, final SubLObject var287) {
        final SubLObject var288 = f42333(var275);
        return module0067.f4884(var288, var287, (SubLObject)module0691.UNPROVIDED);
    }
    
    public static SubLObject f42359(final SubLObject var275, final SubLObject var283) {
        final SubLObject var284 = f42332(var275);
        return module0067.f4884(var284, var283, (SubLObject)module0691.UNPROVIDED);
    }
    
    public static SubLObject f42363(final SubLObject var275, final SubLObject var283) {
        final SubLObject var284 = f42359(var275, var283);
        return f42357(var284);
    }
    
    public static SubLObject f42364(final SubLObject var150) {
        return conses_high.getf(var150, (SubLObject)module0691.$ic167$, (SubLObject)module0691.UNPROVIDED);
    }
    
    public static SubLObject f42365(final SubLObject var150) {
        return conses_high.getf(var150, (SubLObject)module0691.$ic168$, (SubLObject)module0691.UNPROVIDED);
    }
    
    public static SubLObject f42366(final SubLObject var150) {
        return conses_high.getf(var150, (SubLObject)module0691.$ic12$, (SubLObject)module0691.$ic113$);
    }
    
    public static SubLObject f42367(final SubLObject var150) {
        return conses_high.getf(var150, (SubLObject)module0691.$ic166$, (SubLObject)module0691.$ic164$);
    }
    
    public static SubLObject f42368(final SubLObject var275, SubLObject var288, SubLObject var289, SubLObject var16, SubLObject var283) {
        if (var16 == module0691.UNPROVIDED) {
            var16 = (SubLObject)module0691.$ic113$;
        }
        if (var283 == module0691.UNPROVIDED) {
            var283 = (SubLObject)module0691.$ic164$;
        }
        SubLObject var290 = f42335(var275);
        final SubLObject var291 = f42334(var275);
        SubLObject var292 = (SubLObject)module0691.NIL;
        if (var288.isString()) {
            var288 = f42363(var275, var288);
        }
        if (var289.isString()) {
            var289 = f42363(var275, var289);
        }
        var292 = (SubLObject)ConsesLow.list((SubLObject)module0691.$ic167$, var288, (SubLObject)module0691.$ic168$, var289, (SubLObject)module0691.$ic12$, var16, (SubLObject)module0691.$ic166$, var283);
        var290 = (SubLObject)ConsesLow.cons(var292, var290);
        f42343(var275, var290);
        if (module0691.NIL == module0038.f2608(var283)) {
            module0084.f5762(var291, var283, var292);
        }
        return var275;
    }
    
    public static SubLObject f42355(final SubLObject var275) {
        final SubLObject var276 = f42331(var275);
        return module0057.f4175(var276);
    }
    
    public static SubLObject f42369(final SubLObject var275) {
        return (SubLObject)ConsesLow.listS(f42370(var275), f42371(var275), ConsesLow.append(f42372(var275), f42373(var275), (SubLObject)module0691.NIL));
    }
    
    public static SubLObject f42370(final SubLObject var275) {
        final SubLThread var276 = SubLProcess.currentSubLThread();
        SubLObject var277 = (SubLObject)module0691.NIL;
        SubLObject var278;
        for (var278 = module0066.f4838(module0067.f4891(f42336(var275))); module0691.NIL == module0066.f4841(var278); var278 = module0066.f4840(var278)) {
            var276.resetMultipleValues();
            final SubLObject var279 = module0066.f4839(var278);
            final SubLObject var280 = var276.secondMultipleValue();
            var276.resetMultipleValues();
            var277 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)module0691.$ic169$, var279, ConsesLow.append(var280, (SubLObject)module0691.NIL)), var277);
        }
        module0066.f4842(var278);
        for (var278 = module0066.f4838(module0067.f4891(f42337(var275))); module0691.NIL == module0066.f4841(var278); var278 = module0066.f4840(var278)) {
            var276.resetMultipleValues();
            final SubLObject var279 = module0066.f4839(var278);
            final SubLObject var280 = var276.secondMultipleValue();
            var276.resetMultipleValues();
            var277 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)module0691.$ic170$, var279, ConsesLow.append(var280, (SubLObject)module0691.NIL)), var277);
        }
        module0066.f4842(var278);
        return (SubLObject)ConsesLow.list((SubLObject)module0691.$ic171$, var277);
    }
    
    public static SubLObject f42371(final SubLObject var275) {
        final SubLThread var276 = SubLProcess.currentSubLThread();
        SubLObject var277 = (SubLObject)module0691.NIL;
        SubLObject var278;
        for (var278 = module0066.f4838(module0067.f4891(f42338(var275))); module0691.NIL == module0066.f4841(var278); var278 = module0066.f4840(var278)) {
            var276.resetMultipleValues();
            final SubLObject var279 = module0066.f4839(var278);
            final SubLObject var280 = var276.secondMultipleValue();
            var276.resetMultipleValues();
            var277 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var279, var280), var277);
        }
        module0066.f4842(var278);
        return (SubLObject)ConsesLow.list((SubLObject)module0691.$ic155$, var277);
    }
    
    public static SubLObject f42372(final SubLObject var275) {
        final SubLThread var276 = SubLProcess.currentSubLThread();
        SubLObject var277 = (SubLObject)module0691.NIL;
        SubLObject var278;
        for (var278 = module0066.f4838(module0067.f4891(f42333(var275))); module0691.NIL == module0066.f4841(var278); var278 = module0066.f4840(var278)) {
            var276.resetMultipleValues();
            final SubLObject var279 = module0066.f4839(var278);
            final SubLObject var280 = var276.secondMultipleValue();
            var276.resetMultipleValues();
            var277 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0691.$ic172$, var280), var277);
        }
        module0066.f4842(var278);
        return var277;
    }
    
    public static SubLObject f42373(final SubLObject var275) {
        SubLObject var276 = (SubLObject)module0691.NIL;
        SubLObject var277 = f42335(var275);
        SubLObject var278 = (SubLObject)module0691.NIL;
        var278 = var277.first();
        while (module0691.NIL != var277) {
            var276 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0691.$ic173$, var278), var276);
            var277 = var277.rest();
            var278 = var277.first();
        }
        return var276;
    }
    
    public static SubLObject f42374(final SubLObject var36) {
        final SubLObject var37 = conses_high.getf(var36, (SubLObject)module0691.$ic81$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var38 = conses_high.getf(var37, (SubLObject)module0691.$ic176$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var39 = conses_high.getf(var37, (SubLObject)module0691.$ic177$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var40 = conses_high.getf(var37, (SubLObject)module0691.$ic83$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var41 = module0035.f2439((SubLObject)module0691.$ic178$, var38, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var42 = conses_high.fourth(var41);
        SubLObject var43 = (SubLObject)module0691.NIL;
        final SubLObject var44 = module0361.f24195(var39, var40);
        final SubLObject var45 = module0369.f25484(var44);
        SubLObject var46 = (SubLObject)module0691.NIL;
        var43 = module0078.f5367(var42.rest(), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
        SubLObject var47 = var42;
        SubLObject var48 = (SubLObject)module0691.NIL;
        var48 = var47.first();
        while (module0691.NIL != var47) {
            module0078.f5374(module0260.f17034(var48, var45, (SubLObject)module0691.UNPROVIDED), var43);
            var47 = var47.rest();
            var48 = var47.first();
        }
        final SubLObject var49 = module0369.f25492(var44);
        if (module0691.NIL == module0065.f4772(var49, (SubLObject)module0691.$ic179$)) {
            final SubLObject var303_304 = var49;
            if (module0691.NIL == module0065.f4775(var303_304, (SubLObject)module0691.$ic179$)) {
                final SubLObject var50 = module0065.f4740(var303_304);
                final SubLObject var51 = (SubLObject)module0691.NIL;
                SubLObject var52;
                SubLObject var53;
                SubLObject var54;
                SubLObject var55;
                SubLObject var57;
                SubLObject var56;
                SubLObject var58;
                SubLObject var59;
                SubLObject var23_315;
                SubLObject var60;
                SubLObject var61;
                for (var52 = Sequences.length(var50), var53 = (SubLObject)module0691.NIL, var53 = (SubLObject)module0691.ZERO_INTEGER; var53.numL(var52); var53 = Numbers.add(var53, (SubLObject)module0691.ONE_INTEGER)) {
                    var54 = ((module0691.NIL != var51) ? Numbers.subtract(var52, var53, (SubLObject)module0691.ONE_INTEGER) : var53);
                    var55 = Vectors.aref(var50, var54);
                    if (module0691.NIL == module0065.f4749(var55) || module0691.NIL == module0065.f4773((SubLObject)module0691.$ic179$)) {
                        if (module0691.NIL != module0065.f4749(var55)) {
                            var55 = (SubLObject)module0691.$ic179$;
                        }
                        var56 = (var57 = module0775.f49679(var55));
                        var58 = (SubLObject)module0691.NIL;
                        var58 = var57.first();
                        while (module0691.NIL != var57) {
                            var59 = module0773.f49487(var58, var55, var45);
                            var60 = (var23_315 = module0773.f49311(var59));
                            var61 = (SubLObject)module0691.NIL;
                            var61 = var23_315.first();
                            while (module0691.NIL != var23_315) {
                                if (module0691.NIL != f42375(module0178.f11303(var61), var43)) {
                                    var46 = (SubLObject)ConsesLow.cons(f42315(var61), var46);
                                }
                                var23_315 = var23_315.rest();
                                var61 = var23_315.first();
                            }
                            var57 = var57.rest();
                            var58 = var57.first();
                        }
                    }
                }
            }
            final SubLObject var317_318 = var49;
            if (module0691.NIL == module0065.f4777(var317_318)) {
                final SubLObject var62 = module0065.f4738(var317_318);
                SubLObject var63 = (SubLObject)module0691.NIL;
                SubLObject var64 = (SubLObject)module0691.NIL;
                final Iterator var65 = Hashtables.getEntrySetIterator(var62);
                try {
                    while (Hashtables.iteratorHasNext(var65)) {
                        final Map.Entry var66 = Hashtables.iteratorNextEntry(var65);
                        var63 = Hashtables.getEntryKey(var66);
                        var64 = Hashtables.getEntryValue(var66);
                        SubLObject var68;
                        final SubLObject var67 = var68 = module0775.f49679(var64);
                        SubLObject var69 = (SubLObject)module0691.NIL;
                        var69 = var68.first();
                        while (module0691.NIL != var68) {
                            final SubLObject var70 = module0773.f49487(var69, var64, var45);
                            SubLObject var23_316;
                            final SubLObject var71 = var23_316 = module0773.f49311(var70);
                            SubLObject var72 = (SubLObject)module0691.NIL;
                            var72 = var23_316.first();
                            while (module0691.NIL != var23_316) {
                                if (module0691.NIL != f42375(module0178.f11303(var72), var43)) {
                                    var46 = (SubLObject)ConsesLow.cons(f42315(var72), var46);
                                }
                                var23_316 = var23_316.rest();
                                var72 = var23_316.first();
                            }
                            var68 = var68.rest();
                            var69 = var68.first();
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var65);
                }
            }
        }
        return f42293((SubLObject)module0691.NIL, module0035.f2267(var46, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)module0691.$ic39$, var45));
    }
    
    public static SubLObject f42376(final SubLObject var36) {
        final SubLObject var37 = conses_high.getf(var36, (SubLObject)module0691.$ic81$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var38 = conses_high.getf(var36, (SubLObject)module0691.$ic39$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var39 = conses_high.getf(var37, (SubLObject)module0691.$ic176$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var40 = conses_high.getf(var37, (SubLObject)module0691.$ic181$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var41 = conses_high.getf(var37, (SubLObject)module0691.$ic182$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var42 = module0035.f2439((SubLObject)module0691.$ic178$, var39, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var43 = module0205.f13203(var42, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var44 = module0205.f13204(var42, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var45 = module0205.f13345(var42, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var46 = module0202.f12760(module0205.f13205(var42, (SubLObject)module0691.UNPROVIDED));
        SubLObject var47 = (SubLObject)module0691.NIL;
        SubLObject var48 = (SubLObject)module0691.NIL;
        SubLObject var49 = module0077.f5313((SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
        SubLObject var50 = module0077.f5313((SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var51 = module0077.f5313((SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
        SubLObject var52 = (SubLObject)module0691.NIL;
        SubLObject var53 = (SubLObject)module0691.NIL;
        SubLObject var54 = (SubLObject)module0691.NIL;
        if (Sequences.length(var40).numG(Sequences.length(var41))) {
            var52 = var40;
            var53 = var41;
            var54 = var43;
        }
        else {
            var52 = var41;
            var53 = var40;
            var54 = var44;
        }
        var50 = module0078.f5367(var46, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
        SubLObject var55 = var46;
        SubLObject var56 = (SubLObject)module0691.NIL;
        var56 = var55.first();
        while (module0691.NIL != var55) {
            module0078.f5374(module0260.f17034(var56, var38, (SubLObject)module0691.UNPROVIDED), var50);
            var55 = var55.rest();
            var56 = var55.first();
        }
        var55 = var53;
        SubLObject var57 = (SubLObject)module0691.NIL;
        var57 = var55.first();
        while (module0691.NIL != var55) {
            var47 = module0035.f2457(var39, var54, var57);
            var48 = Sequences.remove_duplicates(module0501.f32327(var57, var47, var46, var45, var38), Symbols.symbol_function((SubLObject)module0691.EQUAL), Symbols.symbol_function((SubLObject)module0691.$ic183$), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
            module0078.f5374(var48, var49);
            var55 = var55.rest();
            var57 = var55.first();
        }
        var49 = f42377(var49, var50);
        final SubLObject var58 = module0077.f5333(var49);
        SubLObject var59;
        SubLObject var60;
        SubLObject var61;
        for (var59 = module0032.f1741(var58), var60 = (SubLObject)module0691.NIL, var60 = module0032.f1742(var59, var58); module0691.NIL == module0032.f1744(var59, var60); var60 = module0032.f1743(var60)) {
            var61 = module0032.f1745(var59, var60);
            if (module0691.NIL != module0032.f1746(var60, var61)) {
                module0077.f5326(f42315(var61), var51);
            }
        }
        return f42293((SubLObject)module0691.NIL, module0077.f5312(var51), (SubLObject)ConsesLow.list((SubLObject)module0691.$ic39$, var38));
    }
    
    public static SubLObject f42378(final SubLObject var36) {
        final SubLObject var37 = conses_high.getf(var36, (SubLObject)module0691.$ic81$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var38 = conses_high.getf(var37, (SubLObject)module0691.$ic176$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var39 = module0078.f5367(conses_high.getf(var37, (SubLObject)module0691.$ic185$, (SubLObject)module0691.UNPROVIDED), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var40 = conses_high.getf(var37, (SubLObject)module0691.$ic177$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var41 = conses_high.getf(var37, (SubLObject)module0691.$ic83$, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var42 = module0035.f2439((SubLObject)module0691.$ic178$, var38, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var43 = conses_high.fourth(var42);
        SubLObject var44 = (SubLObject)module0691.NIL;
        final SubLObject var45 = module0361.f24195(var40, var41);
        final SubLObject var46 = module0369.f25484(var45);
        SubLObject var47 = (SubLObject)module0691.NIL;
        SubLObject var48 = (SubLObject)module0691.NIL;
        final SubLObject var49 = module0077.f5313((SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
        SubLObject var50 = module0077.f5313((SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
        var44 = module0078.f5367(var43.rest(), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
        SubLObject var51 = var43;
        SubLObject var52 = (SubLObject)module0691.NIL;
        var52 = var51.first();
        while (module0691.NIL != var51) {
            module0078.f5374(module0260.f17034(var52, var46, (SubLObject)module0691.UNPROVIDED), var44);
            var51 = var51.rest();
            var52 = var51.first();
        }
        final SubLObject var53 = module0369.f25492(var45);
        if (module0691.NIL == module0065.f4772(var53, (SubLObject)module0691.$ic179$)) {
            final SubLObject var303_340 = var53;
            if (module0691.NIL == module0065.f4775(var303_340, (SubLObject)module0691.$ic179$)) {
                final SubLObject var54 = module0065.f4740(var303_340);
                final SubLObject var55 = (SubLObject)module0691.NIL;
                SubLObject var56;
                SubLObject var57;
                SubLObject var58;
                SubLObject var59;
                SubLObject var60;
                SubLObject var61;
                SubLObject var23_342;
                SubLObject var62;
                SubLObject var23_343;
                SubLObject var63;
                for (var56 = Sequences.length(var54), var57 = (SubLObject)module0691.NIL, var57 = (SubLObject)module0691.ZERO_INTEGER; var57.numL(var56); var57 = Numbers.add(var57, (SubLObject)module0691.ONE_INTEGER)) {
                    var58 = ((module0691.NIL != var55) ? Numbers.subtract(var56, var57, (SubLObject)module0691.ONE_INTEGER) : var57);
                    var59 = Vectors.aref(var54, var58);
                    if (module0691.NIL == module0065.f4749(var59) || module0691.NIL == module0065.f4773((SubLObject)module0691.$ic179$)) {
                        if (module0691.NIL != module0065.f4749(var59)) {
                            var59 = (SubLObject)module0691.$ic179$;
                        }
                        var50 = module0078.f5367(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0691.$ic186$), module0369.f25687(var59)), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                        if (module0691.NIL != module0077.f5319(module0078.f5351((SubLObject)ConsesLow.list(var39, var50), (SubLObject)module0691.UNPROVIDED))) {
                            var60 = module0369.f25744(var59);
                            var61 = (SubLObject)module0691.NIL;
                            var61 = var60.first();
                            while (module0691.NIL != var60) {
                                var47 = (var23_342 = module0369.f25775(var61));
                                var62 = (SubLObject)module0691.NIL;
                                var62 = var23_342.first();
                                while (module0691.NIL != var23_342) {
                                    var48 = (var23_343 = module0191.f11977(var62));
                                    var63 = (SubLObject)module0691.NIL;
                                    var63 = var23_343.first();
                                    while (module0691.NIL != var23_343) {
                                        if (module0691.NIL != module0174.f11035(var63) && module0691.NIL != f42375(module0178.f11303(var63), var44)) {
                                            module0077.f5326(f42315(var63), var49);
                                        }
                                        var23_343 = var23_343.rest();
                                        var63 = var23_343.first();
                                    }
                                    var23_342 = var23_342.rest();
                                    var62 = var23_342.first();
                                }
                                var60 = var60.rest();
                                var61 = var60.first();
                            }
                        }
                    }
                }
            }
            final SubLObject var317_346 = var53;
            if (module0691.NIL == module0065.f4777(var317_346)) {
                final SubLObject var64 = module0065.f4738(var317_346);
                SubLObject var65 = (SubLObject)module0691.NIL;
                SubLObject var66 = (SubLObject)module0691.NIL;
                final Iterator var67 = Hashtables.getEntrySetIterator(var64);
                try {
                    while (Hashtables.iteratorHasNext(var67)) {
                        final Map.Entry var68 = Hashtables.iteratorNextEntry(var67);
                        var65 = Hashtables.getEntryKey(var68);
                        var66 = Hashtables.getEntryValue(var68);
                        var50 = module0078.f5367(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0691.$ic186$), module0369.f25687(var66)), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
                        if (module0691.NIL != module0077.f5319(module0078.f5351((SubLObject)ConsesLow.list(var39, var50), (SubLObject)module0691.UNPROVIDED))) {
                            SubLObject var69 = module0369.f25744(var66);
                            SubLObject var70 = (SubLObject)module0691.NIL;
                            var70 = var69.first();
                            while (module0691.NIL != var69) {
                                SubLObject var23_344;
                                var47 = (var23_344 = module0369.f25775(var70));
                                SubLObject var71 = (SubLObject)module0691.NIL;
                                var71 = var23_344.first();
                                while (module0691.NIL != var23_344) {
                                    SubLObject var23_345;
                                    var48 = (var23_345 = module0191.f11977(var71));
                                    SubLObject var72 = (SubLObject)module0691.NIL;
                                    var72 = var23_345.first();
                                    while (module0691.NIL != var23_345) {
                                        if (module0691.NIL != module0174.f11035(var72) && module0691.NIL != f42375(module0178.f11303(var72), var44)) {
                                            module0077.f5326(f42315(var72), var49);
                                        }
                                        var23_345 = var23_345.rest();
                                        var72 = var23_345.first();
                                    }
                                    var23_344 = var23_344.rest();
                                    var71 = var23_344.first();
                                }
                                var69 = var69.rest();
                                var70 = var69.first();
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var67);
                }
            }
        }
        return f42293((SubLObject)module0691.NIL, module0035.f2267(module0077.f5312(var49), (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)module0691.$ic39$, var46));
    }
    
    public static SubLObject f42375(final SubLObject var242, final SubLObject var349) {
        if (module0691.NIL != module0077.f5320(module0205.f13132(var242), var349)) {
            return (SubLObject)module0691.T;
        }
        return (SubLObject)module0691.NIL;
    }
    
    public static SubLObject f42377(final SubLObject var327, final SubLObject var349) {
        final SubLObject var350 = module0077.f5313((SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED);
        final SubLObject var351 = module0077.f5333(var327);
        SubLObject var352;
        SubLObject var353;
        SubLObject var354;
        for (var352 = module0032.f1741(var351), var353 = (SubLObject)module0691.NIL, var353 = module0032.f1742(var352, var351); module0691.NIL == module0032.f1744(var352, var353); var353 = module0032.f1743(var353)) {
            var354 = module0032.f1745(var352, var353);
            if (module0691.NIL != module0032.f1746(var353, var354) && module0691.NIL != f42375(module0178.f11303(var354), var349)) {
                module0077.f5326(var354, var350);
            }
        }
        return var350;
    }
    
    public static SubLObject f42379() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0691", "f42265", "S#46276");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42266", "S#46277", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42267", "S#46278", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42268", "S#46279", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42269", "S#46280", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42270", "S#46281", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42271", "S#46282", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42272", "S#46283", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42273", "S#46284", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42274", "S#46285", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42275", "S#46286", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42276", "S#46287", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42277", "BFF-ARBITRARY-UNIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42278", "BFF-CYC-KB-SUBSET-COLLECTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42279", "BFF-MOST-GENERAL-5", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42280", "BFF-MOST-GENERAL-10", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42281", "BFF-MOST-GENERAL-20", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0691", "f42282", "S#46288");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42283", "S#46289", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42284", "S#46290", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42285", "S#46291", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42286", "S#46292", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42287", "S#46293", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42288", "S#46294", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42289", "BBF-FORWARD-TRUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42290", "S#46295", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42294", "BBF-BACKWARD-TRUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42295", "S#46296", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42296", "BBF-MIN-FORWARD-TRUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42297", "S#46297", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42298", "BBF-MIN-BACKWARD-TRUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42299", "S#46298", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42300", "BBF-MIN-CEILINGS-FORWARD-TRUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42301", "S#46299", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42302", "BBF-MIN-FORWARD-AND-BACKWARD-TRUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42303", "S#46300", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42304", "S#46301", 5, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42305", "BBF-SCRIPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42307", "BBF-INFERENCE-ANSWERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42308", "S#45677", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42309", "S#45679", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42310", "BBF-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42313", "BBF-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42312", "S#46302", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42311", "S#46303", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42314", "S#46304", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42315", "S#46305", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42293", "S#46306", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42292", "S#46307", 4, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42306", "S#46308", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42291", "S#46309", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42316", "S#46310", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42317", "S#46311", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42319", "S#46312", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42320", "S#46313", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42321", "S#46314", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42318", "S#46315", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42322", "S#44724", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42323", "BLUE-FETCH-EVENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42324", "BLUE-FETCH-UIA-BLUE-EVENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42325", "S#46316", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42326", "S#46317", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42327", "S#46318", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42328", "S#46319", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42329", "S#46320", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42330", "S#46273", 1, 0, false);
        new $f42330$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42331", "S#46321", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42332", "S#46322", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42333", "S#46323", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42334", "S#46324", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42335", "S#46325", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42336", "S#46326", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42337", "S#46327", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42338", "S#46328", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42339", "S#46329", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42340", "S#46330", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42341", "S#46331", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42342", "S#46332", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42343", "S#46333", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42344", "S#46334", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42345", "S#46335", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42346", "S#46336", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42347", "S#46337", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42348", "S#46338", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42349", "S#46339", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42350", "S#46340", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42351", "S#46341", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42352", "S#46342", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42353", "S#46343", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42354", "S#46344", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42356", "S#46345", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42358", "S#46346", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42357", "S#46347", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42360", "S#46348", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42361", "S#46349", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42362", "S#46350", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42359", "S#46351", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42363", "S#46352", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42364", "S#46353", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42365", "S#46354", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42366", "S#46355", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42367", "S#46356", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42368", "S#46357", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42355", "S#46358", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42369", "S#46359", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42370", "S#46360", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42371", "S#46361", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42372", "S#46362", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42373", "S#46363", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42374", "BBF-RTV-FROM-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42376", "BBF-RTV-UNBOUND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42378", "BBF-RTV-FROM-INFERENCE-NEW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42375", "S#46364", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0691", "f42377", "S#46365", 2, 0, false);
        return (SubLObject)module0691.NIL;
    }
    
    public static SubLObject f42380() {
        module0691.$g5444$ = SubLFiles.deflexical("S#46366", (module0691.NIL != Symbols.boundp((SubLObject)module0691.$ic0$)) ? module0691.$g5444$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0691.SIXTEEN_INTEGER, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED));
        module0691.$g5445$ = SubLFiles.deflexical("S#46367", (SubLObject)((module0691.NIL != Symbols.boundp((SubLObject)module0691.$ic7$)) ? module0691.$g5445$.getGlobalValue() : module0691.ZERO_INTEGER));
        module0691.$g5446$ = SubLFiles.deflexical("S#46368", (SubLObject)((module0691.NIL != Symbols.boundp((SubLObject)module0691.$ic9$)) ? module0691.$g5446$.getGlobalValue() : module0691.ZERO_INTEGER));
        module0691.$g5447$ = SubLFiles.deflexical("S#46369", (SubLObject)((module0691.NIL != Symbols.boundp((SubLObject)module0691.$ic11$)) ? module0691.$g5447$.getGlobalValue() : module0691.NIL));
        module0691.$g5448$ = SubLFiles.deflexical("S#46370", (module0691.NIL != Symbols.boundp((SubLObject)module0691.$ic29$)) ? module0691.$g5448$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0691.SIXTEEN_INTEGER, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED));
        module0691.$g5449$ = SubLFiles.deflexical("S#46371", (module0691.NIL != Symbols.boundp((SubLObject)module0691.$ic30$)) ? module0691.$g5449$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0691.SIXTEEN_INTEGER, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED));
        module0691.$g5450$ = SubLFiles.deflexical("S#46372", module0691.$ic86$);
        module0691.$g5451$ = SubLFiles.deflexical("S#46373", Locks.make_lock((SubLObject)module0691.$ic121$));
        module0691.$g5452$ = SubLFiles.deflexical("S#46374", (SubLObject)((module0691.NIL != Symbols.boundp((SubLObject)module0691.$ic122$)) ? module0691.$g5452$.getGlobalValue() : module0691.NIL));
        module0691.$g5453$ = SubLFiles.defparameter("S#46375", module0119.f8219());
        module0691.$g5454$ = SubLFiles.deflexical("S#46376", module0117.f8104((SubLObject)module0691.$ic120$, (SubLObject)module0691.$ic124$, (SubLObject)module0691.UNPROVIDED, (SubLObject)module0691.UNPROVIDED));
        module0691.$g5455$ = SubLFiles.defconstant("S#46377", (SubLObject)module0691.$ic125$);
        return (SubLObject)module0691.NIL;
    }
    
    public static SubLObject f42381() {
        module0003.f57((SubLObject)module0691.$ic0$);
        module0003.f57((SubLObject)module0691.$ic7$);
        module0003.f57((SubLObject)module0691.$ic9$);
        module0003.f57((SubLObject)module0691.$ic11$);
        Hashtables.sethash((SubLObject)module0691.$ic17$, module0691.$g5444$.getGlobalValue(), (SubLObject)module0691.$ic18$);
        module0012.f369((SubLObject)module0691.$ic17$);
        Hashtables.sethash((SubLObject)module0691.$ic20$, module0691.$g5444$.getGlobalValue(), (SubLObject)module0691.$ic18$);
        module0012.f369((SubLObject)module0691.$ic20$);
        Hashtables.sethash((SubLObject)module0691.$ic22$, module0691.$g5444$.getGlobalValue(), (SubLObject)module0691.$ic23$);
        module0012.f369((SubLObject)module0691.$ic22$);
        Hashtables.sethash((SubLObject)module0691.$ic25$, module0691.$g5444$.getGlobalValue(), (SubLObject)module0691.$ic26$);
        module0012.f369((SubLObject)module0691.$ic25$);
        Hashtables.sethash((SubLObject)module0691.$ic27$, module0691.$g5444$.getGlobalValue(), (SubLObject)module0691.$ic28$);
        module0012.f369((SubLObject)module0691.$ic27$);
        module0003.f57((SubLObject)module0691.$ic29$);
        module0003.f57((SubLObject)module0691.$ic30$);
        Hashtables.sethash((SubLObject)module0691.$ic35$, module0691.$g5448$.getGlobalValue(), (SubLObject)module0691.T);
        Hashtables.sethash((SubLObject)module0691.$ic35$, module0691.$g5449$.getGlobalValue(), (SubLObject)module0691.$ic36$);
        module0012.f369((SubLObject)module0691.$ic35$);
        Hashtables.sethash((SubLObject)module0691.$ic43$, module0691.$g5448$.getGlobalValue(), (SubLObject)module0691.T);
        Hashtables.sethash((SubLObject)module0691.$ic43$, module0691.$g5449$.getGlobalValue(), (SubLObject)module0691.$ic44$);
        module0012.f369((SubLObject)module0691.$ic43$);
        Hashtables.sethash((SubLObject)module0691.$ic45$, module0691.$g5448$.getGlobalValue(), (SubLObject)module0691.T);
        Hashtables.sethash((SubLObject)module0691.$ic45$, module0691.$g5449$.getGlobalValue(), (SubLObject)module0691.$ic46$);
        module0012.f369((SubLObject)module0691.$ic45$);
        Hashtables.sethash((SubLObject)module0691.$ic47$, module0691.$g5448$.getGlobalValue(), (SubLObject)module0691.T);
        Hashtables.sethash((SubLObject)module0691.$ic47$, module0691.$g5449$.getGlobalValue(), (SubLObject)module0691.$ic48$);
        module0012.f369((SubLObject)module0691.$ic47$);
        Hashtables.sethash((SubLObject)module0691.$ic49$, module0691.$g5448$.getGlobalValue(), (SubLObject)module0691.T);
        Hashtables.sethash((SubLObject)module0691.$ic49$, module0691.$g5449$.getGlobalValue(), (SubLObject)module0691.$ic50$);
        module0012.f369((SubLObject)module0691.$ic49$);
        Hashtables.sethash((SubLObject)module0691.$ic52$, module0691.$g5448$.getGlobalValue(), (SubLObject)module0691.T);
        Hashtables.sethash((SubLObject)module0691.$ic52$, module0691.$g5449$.getGlobalValue(), (SubLObject)module0691.$ic53$);
        module0012.f369((SubLObject)module0691.$ic52$);
        Hashtables.sethash((SubLObject)module0691.$ic56$, module0691.$g5448$.getGlobalValue(), (SubLObject)module0691.T);
        Hashtables.sethash((SubLObject)module0691.$ic56$, module0691.$g5449$.getGlobalValue(), (SubLObject)module0691.$ic57$);
        module0012.f369((SubLObject)module0691.$ic56$);
        Hashtables.sethash((SubLObject)module0691.$ic79$, module0691.$g5448$.getGlobalValue(), (SubLObject)module0691.T);
        Hashtables.sethash((SubLObject)module0691.$ic79$, module0691.$g5449$.getGlobalValue(), (SubLObject)module0691.$ic80$);
        module0012.f369((SubLObject)module0691.$ic79$);
        Hashtables.sethash((SubLObject)module0691.$ic97$, module0691.$g5448$.getGlobalValue(), (SubLObject)module0691.T);
        Hashtables.sethash((SubLObject)module0691.$ic97$, module0691.$g5449$.getGlobalValue(), (SubLObject)module0691.$ic98$);
        module0012.f369((SubLObject)module0691.$ic97$);
        Hashtables.sethash((SubLObject)module0691.$ic105$, module0691.$g5448$.getGlobalValue(), (SubLObject)module0691.T);
        Hashtables.sethash((SubLObject)module0691.$ic105$, module0691.$g5449$.getGlobalValue(), (SubLObject)module0691.$ic106$);
        module0012.f369((SubLObject)module0691.$ic105$);
        module0116.f8043((SubLObject)module0691.$ic118$, (SubLObject)module0691.$ic119$, (SubLObject)module0691.NIL);
        module0116.f8043((SubLObject)module0691.$ic120$, (SubLObject)module0691.$ic118$, (SubLObject)module0691.NIL);
        module0003.f57((SubLObject)module0691.$ic122$);
        module0002.f38((SubLObject)module0691.$ic123$);
        f42319(module0691.$g5454$.getGlobalValue());
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0691.$g5455$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0691.$ic132$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0691.$ic133$);
        Structures.def_csetf((SubLObject)module0691.$ic134$, (SubLObject)module0691.$ic135$);
        Structures.def_csetf((SubLObject)module0691.$ic136$, (SubLObject)module0691.$ic137$);
        Structures.def_csetf((SubLObject)module0691.$ic138$, (SubLObject)module0691.$ic139$);
        Structures.def_csetf((SubLObject)module0691.$ic140$, (SubLObject)module0691.$ic141$);
        Structures.def_csetf((SubLObject)module0691.$ic142$, (SubLObject)module0691.$ic143$);
        Structures.def_csetf((SubLObject)module0691.$ic144$, (SubLObject)module0691.$ic145$);
        Structures.def_csetf((SubLObject)module0691.$ic146$, (SubLObject)module0691.$ic147$);
        Structures.def_csetf((SubLObject)module0691.$ic148$, (SubLObject)module0691.$ic149$);
        Equality.identity((SubLObject)module0691.$ic125$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0691.$g5455$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0691.$ic161$));
        Hashtables.sethash((SubLObject)module0691.$ic174$, module0691.$g5448$.getGlobalValue(), (SubLObject)module0691.T);
        Hashtables.sethash((SubLObject)module0691.$ic174$, module0691.$g5449$.getGlobalValue(), (SubLObject)module0691.$ic175$);
        module0012.f369((SubLObject)module0691.$ic174$);
        Hashtables.sethash((SubLObject)module0691.$ic180$, module0691.$g5448$.getGlobalValue(), (SubLObject)module0691.T);
        Hashtables.sethash((SubLObject)module0691.$ic180$, module0691.$g5449$.getGlobalValue(), (SubLObject)module0691.$ic175$);
        module0012.f369((SubLObject)module0691.$ic180$);
        Hashtables.sethash((SubLObject)module0691.$ic184$, module0691.$g5448$.getGlobalValue(), (SubLObject)module0691.T);
        Hashtables.sethash((SubLObject)module0691.$ic184$, module0691.$g5449$.getGlobalValue(), (SubLObject)module0691.$ic175$);
        module0012.f369((SubLObject)module0691.$ic184$);
        return (SubLObject)module0691.NIL;
    }
    
    public void declareFunctions() {
        f42379();
    }
    
    public void initializeVariables() {
        f42380();
    }
    
    public void runTopLevelForms() {
        f42381();
    }
    
    static {
        me = (SubLFile)new module0691();
        module0691.$g5444$ = null;
        module0691.$g5445$ = null;
        module0691.$g5446$ = null;
        module0691.$g5447$ = null;
        module0691.$g5448$ = null;
        module0691.$g5449$ = null;
        module0691.$g5450$ = null;
        module0691.$g5451$ = null;
        module0691.$g5452$ = null;
        module0691.$g5453$ = null;
        module0691.$g5454$ = null;
        module0691.$g5455$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#46366", "CYC");
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46378", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic2$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic3$ = SubLObjectFactory.makeSymbol("SETHASH");
        $ic4$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic5$ = SubLObjectFactory.makeSymbol("DEFINE-PROTECTED");
        $ic6$ = SubLObjectFactory.makeSymbol("S#380", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#46367", "CYC");
        $ic8$ = SubLObjectFactory.makeKeyword("COST");
        $ic9$ = SubLObjectFactory.makeSymbol("S#46368", "CYC");
        $ic10$ = SubLObjectFactory.makeKeyword("STRENGTH");
        $ic11$ = SubLObjectFactory.makeSymbol("S#46369", "CYC");
        $ic12$ = SubLObjectFactory.makeKeyword("TYPE");
        $ic13$ = SubLObjectFactory.makeString("APPLY-BLUE-FILTER-FN: ~A is not a blue-filter-fn-p");
        $ic14$ = SubLObjectFactory.makeSymbol("<");
        $ic15$ = SubLObjectFactory.makeSymbol("S#46281", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("MAKE-KEYWORD");
        $ic17$ = SubLObjectFactory.makeSymbol("BFF-ARBITRARY-UNIONS");
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)module0691.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("STRENGTH"), (SubLObject)module0691.TEN_INTEGER);
        $ic19$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ArbitraryUnion"));
        $ic20$ = SubLObjectFactory.makeSymbol("BFF-CYC-KB-SUBSET-COLLECTIONS");
        $ic21$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycKBSubsetCollection"));
        $ic22$ = SubLObjectFactory.makeSymbol("BFF-MOST-GENERAL-5");
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)module0691.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("STRENGTH"), (SubLObject)SubLObjectFactory.makeInteger(500), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("POST-MINIMIZATION"));
        $ic24$ = SubLObjectFactory.makeSymbol("S#18496", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("BFF-MOST-GENERAL-10");
        $ic26$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)module0691.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("STRENGTH"), (SubLObject)SubLObjectFactory.makeInteger(1000), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("POST-MINIMIZATION"));
        $ic27$ = SubLObjectFactory.makeSymbol("BFF-MOST-GENERAL-20");
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)module0691.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("STRENGTH"), (SubLObject)SubLObjectFactory.makeInteger(2000), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("POST-MINIMIZATION"));
        $ic29$ = SubLObjectFactory.makeSymbol("S#46370", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#46371", "CYC");
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#46370", "CYC"), (SubLObject)module0691.T);
        $ic32$ = SubLObjectFactory.makeString("BLUE-BUILDER: ~A is not a blue-builder-fn-p");
        $ic33$ = SubLObjectFactory.makeSymbol("STRING<");
        $ic34$ = SubLObjectFactory.makeSymbol("SYMBOL-NAME");
        $ic35$ = SubLObjectFactory.makeSymbol("BBF-FORWARD-TRUE");
        $ic36$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString("Show forward edges from FORTS (nodes) through PREDS (edges) in MT to DEPTH.  (Forts failing FILTER-FNS are not shown.)"));
        $ic37$ = SubLObjectFactory.makeKeyword("PREDS");
        $ic38$ = SubLObjectFactory.makeKeyword("FORTS");
        $ic39$ = SubLObjectFactory.makeKeyword("MT");
        $ic40$ = SubLObjectFactory.makeKeyword("FILTER-FNS");
        $ic41$ = SubLObjectFactory.makeKeyword("DEPTH");
        $ic42$ = SubLObjectFactory.makeKeyword("POST-MINIMIZATION");
        $ic43$ = SubLObjectFactory.makeSymbol("BBF-BACKWARD-TRUE");
        $ic44$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString("Show backward edges from FORTS (nodes) through PREDS (edges) in MT to DEPTH.  (Forts failing FILTER-FNS are not shown.)"));
        $ic45$ = SubLObjectFactory.makeSymbol("BBF-MIN-FORWARD-TRUE");
        $ic46$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString("Show minimum forward edges from FORTS (nodes) through PREDS (edges) in MT to DEPTH.  (Forts failing FILTER-FNS are not shown.)"));
        $ic47$ = SubLObjectFactory.makeSymbol("BBF-MIN-BACKWARD-TRUE");
        $ic48$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString("Show minimum backward edges from FORTS (nodes) through PREDS (edges) in MT to DEPTH.  (Forts failing FILTER-FNS are not shown.)"));
        $ic49$ = SubLObjectFactory.makeSymbol("BBF-MIN-CEILINGS-FORWARD-TRUE");
        $ic50$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString("Show the minimal ceilings of all forward edges from FORTS (nodes) through PREDS (edges) in MT and iterate DEPTH times.  (Forts failing FILTER-FNS are not shown.) (EXPERIMENTAL)"));
        $ic51$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $ic52$ = SubLObjectFactory.makeSymbol("BBF-MIN-FORWARD-AND-BACKWARD-TRUE");
        $ic53$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString("Show minimum forward and backward edges from FORTS (nodes) through PREDS (edges) in MT to DEPTH.  (Forts failing FILTER-FNS are not shown.)  (Note that this is *expensive* for higher depths) (EXPERIMENTAL)"));
        $ic54$ = SubLObjectFactory.makeInteger(32);
        $ic55$ = SubLObjectFactory.makeSymbol("APPEND");
        $ic56$ = SubLObjectFactory.makeSymbol("BBF-SCRIPT");
        $ic57$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString("Create a graph representation of a script (a spec of #$Situation) that shows the temporal ordering of scenes and the actors and roles involved in each scene.  FORTS must be a singleton containing the script term."));
        $ic58$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric"));
        $ic59$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Situation"));
        $ic60$ = ConsesLow.list((SubLObject)module0691.TWO_INTEGER, (SubLObject)module0691.THREE_INTEGER);
        $ic61$ = SubLObjectFactory.makeSymbol("S#17608", "CYC");
        $ic62$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("QuasiTemporalSubSituationTypesPredicate"));
        $ic63$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SomethingExisting"));
        $ic64$ = SubLObjectFactory.makeKeyword("ACTOR");
        $ic65$ = SubLObjectFactory.makeKeyword("ROLE");
        $ic66$ = SubLObjectFactory.makeKeyword("SCENE");
        $ic67$ = SubLObjectFactory.makeKeyword("ORIGINAL-PREDICATE");
        $ic68$ = ConsesLow.list((SubLObject)module0691.TWO_INTEGER, (SubLObject)module0691.THREE_INTEGER, (SubLObject)module0691.FOUR_INTEGER);
        $ic69$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SituationTypeRelation-BasicActorTypesAndRolesForSubSitTypes"));
        $ic70$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("individualPlaysRoleInSubSituationType"));
        $ic71$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Individual"));
        $ic72$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SituationTypeRelation-SitTypeToSubSitTypeBasic"));
        $ic73$ = ConsesLow.list((SubLObject)module0691.TWO_INTEGER, (SubLObject)module0691.THREE_INTEGER, (SubLObject)module0691.FOUR_INTEGER, (SubLObject)module0691.FIVE_INTEGER, (SubLObject)module0691.SIX_INTEGER);
        $ic74$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("GraphicallyEditableRoleMappingPredicate"));
        $ic75$ = SubLObjectFactory.makeKeyword("HEAD");
        $ic76$ = SubLObjectFactory.makeKeyword("TAIL");
        $ic77$ = SubLObjectFactory.makeKeyword("RELATION");
        $ic78$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic79$ = SubLObjectFactory.makeSymbol("BBF-INFERENCE-ANSWERS");
        $ic80$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString("Graph the results of an inference by graphing the GAFs the result when filling in the bindings back into the query."));
        $ic81$ = SubLObjectFactory.makeKeyword("PARAMS");
        $ic82$ = SubLObjectFactory.makeKeyword("INFERENCE-STORE-ID");
        $ic83$ = SubLObjectFactory.makeKeyword("INFERENCE-ID");
        $ic84$ = SubLObjectFactory.makeKeyword("DIRECTION");
        $ic85$ = SubLObjectFactory.makeKeyword("UNDIRECTED");
        $ic86$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated"));
        $ic87$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg1Isa"));
        $ic88$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLSentence-Assertible"));
        $ic89$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("different"));
        $ic90$ = SubLObjectFactory.makeKeyword("LEFT");
        $ic91$ = SubLObjectFactory.makeString("Query");
        $ic92$ = SubLObjectFactory.makeKeyword("NBSP");
        $ic93$ = SubLObjectFactory.makeString("Edge Templates");
        $ic94$ = SubLObjectFactory.makeKeyword("TOP");
        $ic95$ = SubLObjectFactory.makeString(" --- ");
        $ic96$ = SubLObjectFactory.makeString(" ---> ");
        $ic97$ = SubLObjectFactory.makeSymbol("BBF-INFERENCE");
        $ic98$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString("Graph an inference query formula by taking the neg-lits and pos-lits, converting the HL vars to EL, then treating them as edges."));
        $ic99$ = SubLObjectFactory.makeKeyword("STORE-SUID");
        $ic100$ = SubLObjectFactory.makeKeyword("INFERENCE-SUID");
        $ic101$ = SubLObjectFactory.makeString("Inference not found.");
        $ic102$ = SubLObjectFactory.makeKeyword("NEG");
        $ic103$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"));
        $ic104$ = SubLObjectFactory.makeKeyword("POS");
        $ic105$ = SubLObjectFactory.makeSymbol("BBF-RULE");
        $ic106$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString("Graph a rule by taking the neg-lits and pos-lits, converting the HL vars to EL, then treating them as edges."));
        $ic107$ = SubLObjectFactory.makeKeyword("ASSERTIONS");
        $ic108$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#35842", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14880", "CYC"));
        $ic109$ = SubLObjectFactory.makeSymbol("S#14185", "CYC");
        $ic110$ = SubLObjectFactory.makeKeyword("NODES");
        $ic111$ = SubLObjectFactory.makeKeyword("EDGES");
        $ic112$ = SubLObjectFactory.makeKeyword("PROPERTIES");
        $ic113$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic114$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic115$ = SubLObjectFactory.makeKeyword("TRUE?");
        $ic116$ = SubLObjectFactory.makeKeyword("ASSERTED?");
        $ic117$ = SubLObjectFactory.makeKeyword("CORE");
        $ic118$ = SubLObjectFactory.makeKeyword("BLUE-GRAPHER-BASE-EVENT");
        $ic119$ = SubLObjectFactory.makeKeyword("CYC-APPLICATION-EVENT");
        $ic120$ = SubLObjectFactory.makeKeyword("BLUE-EVENT");
        $ic121$ = SubLObjectFactory.makeString("BLUE-EVENT-DISPATCHER Lock");
        $ic122$ = SubLObjectFactory.makeSymbol("S#46374", "CYC");
        $ic123$ = SubLObjectFactory.makeSymbol("BLUE-FETCH-EVENT");
        $ic124$ = SubLObjectFactory.makeSymbol("S#46319", "CYC");
        $ic125$ = SubLObjectFactory.makeSymbol("S#46272", "CYC");
        $ic126$ = SubLObjectFactory.makeSymbol("S#46273", "CYC");
        $ic127$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#46379", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46380", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2953", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46381", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46382", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46383", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46384", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6511", "CYC"));
        $ic128$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISG"), (SubLObject)SubLObjectFactory.makeKeyword("NODE-LABEL-MAP"), (SubLObject)SubLObjectFactory.makeKeyword("NODES"), (SubLObject)SubLObjectFactory.makeKeyword("EDGE-LABEL-MAP"), (SubLObject)SubLObjectFactory.makeKeyword("EDGES"), (SubLObject)SubLObjectFactory.makeKeyword("NODE-DEFINITIONS"), (SubLObject)SubLObjectFactory.makeKeyword("EDGE-DEFINITIONS"), (SubLObject)SubLObjectFactory.makeKeyword("OPTIONS"));
        $ic129$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#46321", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46322", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46323", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46324", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46325", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46326", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46327", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46328", "CYC"));
        $ic130$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#46329", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46330", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46331", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46332", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46333", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46334", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46335", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46336", "CYC"));
        $ic131$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic132$ = SubLObjectFactory.makeSymbol("S#46320", "CYC");
        $ic133$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#46273", "CYC"));
        $ic134$ = SubLObjectFactory.makeSymbol("S#46321", "CYC");
        $ic135$ = SubLObjectFactory.makeSymbol("S#46329", "CYC");
        $ic136$ = SubLObjectFactory.makeSymbol("S#46322", "CYC");
        $ic137$ = SubLObjectFactory.makeSymbol("S#46330", "CYC");
        $ic138$ = SubLObjectFactory.makeSymbol("S#46323", "CYC");
        $ic139$ = SubLObjectFactory.makeSymbol("S#46331", "CYC");
        $ic140$ = SubLObjectFactory.makeSymbol("S#46324", "CYC");
        $ic141$ = SubLObjectFactory.makeSymbol("S#46332", "CYC");
        $ic142$ = SubLObjectFactory.makeSymbol("S#46325", "CYC");
        $ic143$ = SubLObjectFactory.makeSymbol("S#46333", "CYC");
        $ic144$ = SubLObjectFactory.makeSymbol("S#46326", "CYC");
        $ic145$ = SubLObjectFactory.makeSymbol("S#46334", "CYC");
        $ic146$ = SubLObjectFactory.makeSymbol("S#46327", "CYC");
        $ic147$ = SubLObjectFactory.makeSymbol("S#46335", "CYC");
        $ic148$ = SubLObjectFactory.makeSymbol("S#46328", "CYC");
        $ic149$ = SubLObjectFactory.makeSymbol("S#46336", "CYC");
        $ic150$ = SubLObjectFactory.makeKeyword("ISG");
        $ic151$ = SubLObjectFactory.makeKeyword("NODE-LABEL-MAP");
        $ic152$ = SubLObjectFactory.makeKeyword("EDGE-LABEL-MAP");
        $ic153$ = SubLObjectFactory.makeKeyword("NODE-DEFINITIONS");
        $ic154$ = SubLObjectFactory.makeKeyword("EDGE-DEFINITIONS");
        $ic155$ = SubLObjectFactory.makeKeyword("OPTIONS");
        $ic156$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic157$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic158$ = SubLObjectFactory.makeSymbol("S#46337", "CYC");
        $ic159$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic160$ = SubLObjectFactory.makeKeyword("END");
        $ic161$ = SubLObjectFactory.makeSymbol("S#46339", "CYC");
        $ic162$ = SubLObjectFactory.makeKeyword("COLOR");
        $ic163$ = SubLObjectFactory.makeKeyword("ORIENTATION");
        $ic164$ = SubLObjectFactory.makeString("");
        $ic165$ = SubLObjectFactory.makeKeyword("ID");
        $ic166$ = SubLObjectFactory.makeKeyword("LABEL");
        $ic167$ = SubLObjectFactory.makeKeyword("FROM");
        $ic168$ = SubLObjectFactory.makeKeyword("TO");
        $ic169$ = SubLObjectFactory.makeKeyword("NODE-TYPE");
        $ic170$ = SubLObjectFactory.makeKeyword("EDGE-TYPE");
        $ic171$ = SubLObjectFactory.makeKeyword("DEFINITIONS");
        $ic172$ = SubLObjectFactory.makeKeyword("NODE");
        $ic173$ = SubLObjectFactory.makeKeyword("EDGE");
        $ic174$ = SubLObjectFactory.makeSymbol("BBF-RTV-FROM-INFERENCE");
        $ic175$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString(""));
        $ic176$ = SubLObjectFactory.makeKeyword("FORMULA");
        $ic177$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE-ID");
        $ic178$ = SubLObjectFactory.makeSymbol("S#35710", "CYC");
        $ic179$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic180$ = SubLObjectFactory.makeSymbol("BBF-RTV-UNBOUND");
        $ic181$ = SubLObjectFactory.makeKeyword("ARG1-ANSWERS");
        $ic182$ = SubLObjectFactory.makeKeyword("ARG2-ANSWERS");
        $ic183$ = SubLObjectFactory.makeSymbol("ASSERTION-FORMULA");
        $ic184$ = SubLObjectFactory.makeSymbol("BBF-RTV-FROM-INFERENCE-NEW");
        $ic185$ = SubLObjectFactory.makeKeyword("ANSWERS");
        $ic186$ = SubLObjectFactory.makeSymbol("CDR");
    }
    
    public static final class $sX46272_native extends SubLStructNative
    {
        public SubLObject $isg;
        public SubLObject $node_label_map;
        public SubLObject $nodes;
        public SubLObject $edge_label_map;
        public SubLObject $edges;
        public SubLObject $node_definitions;
        public SubLObject $edge_definitions;
        public SubLObject $options;
        private static final SubLStructDeclNative structDecl;
        
        public $sX46272_native() {
            this.$isg = (SubLObject)CommonSymbols.NIL;
            this.$node_label_map = (SubLObject)CommonSymbols.NIL;
            this.$nodes = (SubLObject)CommonSymbols.NIL;
            this.$edge_label_map = (SubLObject)CommonSymbols.NIL;
            this.$edges = (SubLObject)CommonSymbols.NIL;
            this.$node_definitions = (SubLObject)CommonSymbols.NIL;
            this.$edge_definitions = (SubLObject)CommonSymbols.NIL;
            this.$options = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX46272_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$isg;
        }
        
        public SubLObject getField3() {
            return this.$node_label_map;
        }
        
        public SubLObject getField4() {
            return this.$nodes;
        }
        
        public SubLObject getField5() {
            return this.$edge_label_map;
        }
        
        public SubLObject getField6() {
            return this.$edges;
        }
        
        public SubLObject getField7() {
            return this.$node_definitions;
        }
        
        public SubLObject getField8() {
            return this.$edge_definitions;
        }
        
        public SubLObject getField9() {
            return this.$options;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$isg = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$node_label_map = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$nodes = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$edge_label_map = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$edges = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$node_definitions = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$edge_definitions = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$options = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX46272_native.class, module0691.$ic125$, module0691.$ic126$, module0691.$ic127$, module0691.$ic128$, new String[] { "$isg", "$node_label_map", "$nodes", "$edge_label_map", "$edges", "$node_definitions", "$edge_definitions", "$options" }, module0691.$ic129$, module0691.$ic130$, module0691.$ic131$);
        }
    }
    
    public static final class $f42330$UnaryFunction extends UnaryFunction
    {
        public $f42330$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#46273"));
        }
        
        public SubLObject processItem(final SubLObject var179) {
            return module0691.f42330(var179);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0691.class
	Total time: 1182 ms
	
	Decompiled with Procyon 0.5.32.
*/