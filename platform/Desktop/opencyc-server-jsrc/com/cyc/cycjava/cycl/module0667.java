package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0667 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0667";
    public static final String myFingerPrint = "f74fd0ef00aa7d7e5678984c01e09721d7f21bbfeb06b36c87028b439c59705e";
    public static SubLSymbol $g5265$;
    public static SubLSymbol $g5266$;
    public static SubLSymbol $g5267$;
    public static SubLSymbol $g5268$;
    public static SubLSymbol $g5269$;
    public static SubLSymbol $g5270$;
    public static SubLSymbol $g5271$;
    public static SubLSymbol $g5272$;
    public static SubLSymbol $g5273$;
    public static SubLSymbol $g5274$;
    public static SubLSymbol $g5275$;
    public static SubLSymbol $g5276$;
    public static SubLSymbol $g5277$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLInteger $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLInteger $ic9$;
    private static final SubLList $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
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
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLList $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLList $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLString $ic106$;
    private static final SubLString $ic107$;
    private static final SubLString $ic108$;
    private static final SubLList $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLString $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLInteger $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLObject $ic120$;
    private static final SubLString $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLString $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLString $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLString $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLString $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLString $ic141$;
    private static final SubLString $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLString $ic145$;
    private static final SubLString $ic146$;
    private static final SubLInteger $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLString $ic151$;
    private static final SubLString $ic152$;
    private static final SubLString $ic153$;
    private static final SubLString $ic154$;
    private static final SubLString $ic155$;
    private static final SubLString $ic156$;
    private static final SubLString $ic157$;
    private static final SubLString $ic158$;
    private static final SubLString $ic159$;
    private static final SubLString $ic160$;
    private static final SubLString $ic161$;
    private static final SubLString $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLString $ic164$;
    private static final SubLString $ic165$;
    private static final SubLString $ic166$;
    private static final SubLString $ic167$;
    private static final SubLString $ic168$;
    private static final SubLString $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLString $ic171$;
    private static final SubLString $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLString $ic177$;
    private static final SubLString $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    
    public static SubLObject f40542(SubLObject var1) {
        if (var1 == module0667.UNPROVIDED) {
            var1 = module0667.$g5271$.getGlobalValue();
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (!var1.isInteger()) {
            var1 = Sequences.length(module0667.$g5276$.getDynamicValue(var2));
        }
        return Vectors.make_vector(var1, (SubLObject)module0667.NIL);
    }
    
    public static SubLObject f40543(final SubLObject var3) {
        return Hashtables.gethash(var3, module0667.$g5272$.getGlobalValue(), (SubLObject)module0667.UNPROVIDED);
    }
    
    public static SubLObject f40544(final SubLObject var4) {
        return f40543(var4);
    }
    
    public static SubLObject f40545(SubLObject var5) {
        if (var5 == module0667.UNPROVIDED) {
            var5 = (SubLObject)module0667.NIL;
        }
        if (module0667.NIL != var5) {
            return Hashtables.gethash(var5, module0667.$g5273$.getGlobalValue(), (SubLObject)module0667.UNPROVIDED);
        }
        SubLObject var6 = (SubLObject)module0667.NIL;
        SubLObject var7 = (SubLObject)module0667.NIL;
        SubLObject var8 = (SubLObject)module0667.NIL;
        final Iterator var9 = Hashtables.getEntrySetIterator(module0667.$g5272$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(var9)) {
                final Map.Entry var10 = Hashtables.iteratorNextEntry(var9);
                var7 = Hashtables.getEntryKey(var10);
                var8 = Hashtables.getEntryValue(var10);
                if (var8.isVector()) {
                    var6 = (SubLObject)ConsesLow.cons(var7, var6);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var9);
        }
        return var6;
    }
    
    public static SubLObject f40546() {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)module0667.$ic13$), module0667.$g5275$.getGlobalValue());
    }
    
    public static SubLObject f40547(final SubLObject var4) {
        return Sequences.find(var4, f40546(), (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
    }
    
    public static SubLObject f40548(final SubLObject var3, final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = f40543(var3);
        final SubLObject var14 = conses_high.assoc(var11, module0667.$g5276$.getDynamicValue(var12), (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED).rest();
        final SubLObject var15 = (SubLObject)((var13.isVector() && var14.isInteger()) ? Vectors.aref(var13, var14) : module0667.NIL);
        return var15;
    }
    
    public static SubLObject f40549(final SubLObject var3, final SubLObject var11, final SubLObject var15, SubLObject var16, SubLObject var17) {
        if (var16 == module0667.UNPROVIDED) {
            var16 = (SubLObject)module0667.$ic14$;
        }
        if (var17 == module0667.UNPROVIDED) {
            var17 = Symbols.symbol_function((SubLObject)module0667.EQL);
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = f40543(var3);
        if (module0667.NIL == Errors.$ignore_mustsP$.getDynamicValue(var18) && !var19.isVector()) {
            Errors.error((SubLObject)module0667.$ic15$, (SubLObject)module0667.$ic6$, var3);
        }
        final SubLObject var20 = conses_high.assoc(var11, module0667.$g5276$.getDynamicValue(var18), (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED).rest();
        if (module0667.NIL == Errors.$ignore_mustsP$.getDynamicValue(var18) && !var20.isInteger()) {
            Errors.error((SubLObject)module0667.$ic16$, (SubLObject)module0667.$ic17$, var11);
        }
        final SubLObject var21 = Vectors.aref(var19, var20);
        final SubLObject var22 = var16;
        if (var22.eql((SubLObject)module0667.$ic14$)) {
            Vectors.set_aref(var19, var20, var15);
        }
        else if (var22.eql((SubLObject)module0667.$ic18$)) {
            Vectors.set_aref(var19, var20, (SubLObject)ConsesLow.cons(var15, var21));
        }
        else if (var22.eql((SubLObject)module0667.$ic19$)) {
            Vectors.set_aref(var19, var20, conses_high.adjoin(var15, var21, var17, (SubLObject)module0667.UNPROVIDED));
        }
        else if (var22.eql((SubLObject)module0667.$ic20$)) {
            Vectors.set_aref(var19, var20, ConsesLow.append(var15, var21));
        }
        else if (var22.eql((SubLObject)module0667.$ic21$)) {
            Vectors.set_aref(var19, var20, ConsesLow.nconc(var15, var21));
        }
        else if (var22.eql((SubLObject)module0667.$ic22$)) {
            Vectors.set_aref(var19, var20, conses_high.union(var15, var21, var17, (SubLObject)module0667.UNPROVIDED));
        }
        else {
            if (!var22.eql((SubLObject)module0667.$ic23$)) {
                Errors.error((SubLObject)module0667.$ic24$, var16, (SubLObject)module0667.$ic25$);
                return (SubLObject)module0667.NIL;
            }
            Vectors.set_aref(var19, var20, conses_high.intersection(var15, var21, var17, (SubLObject)module0667.UNPROVIDED));
        }
        return Vectors.aref(var19, var20);
    }
    
    public static SubLObject f40550(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = f40543(var3);
        SubLObject var6 = (SubLObject)module0667.NIL;
        if (var5.isVector()) {
            SubLObject var7 = module0667.$g5276$.getDynamicValue(var4);
            SubLObject var8 = (SubLObject)module0667.NIL;
            var8 = var7.first();
            while (module0667.NIL != var7) {
                var6 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var8.first(), Vectors.aref(var5, var8.rest())), var6);
                var7 = var7.rest();
                var8 = var7.first();
            }
        }
        return Sequences.nreverse(var6);
    }
    
    public static SubLObject f40551(final SubLObject var3) {
        final SubLObject var4 = f40550(var3);
        SubLObject var5 = (SubLObject)module0667.ZERO_INTEGER;
        SubLObject var6 = var4;
        SubLObject var7 = (SubLObject)module0667.NIL;
        var7 = var6.first();
        while (module0667.NIL != var6) {
            final SubLObject var8 = Sequences.length(PrintLow.format((SubLObject)module0667.NIL, (SubLObject)module0667.$ic26$, var7.first()));
            if (var8.numG(var5)) {
                var5 = var8;
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        var6 = var4;
        var7 = (SubLObject)module0667.NIL;
        var7 = var6.first();
        while (module0667.NIL != var6) {
            final SubLObject var9 = PrintLow.format((SubLObject)module0667.NIL, (SubLObject)module0667.$ic26$, var7.first());
            final SubLObject var10 = Sequences.length(var9);
            final SubLObject var11 = Strings.make_string(Numbers.subtract(var5, var10), (SubLObject)module0667.UNPROVIDED);
            PrintLow.format((SubLObject)module0667.T, (SubLObject)module0667.$ic27$, new SubLObject[] { var9, var11, conses_high.second(var7) });
            var6 = var6.rest();
            var7 = var6.first();
        }
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40552(final SubLObject var3, final SubLObject var27, final SubLObject var28, final SubLObject var29, final SubLObject var30, SubLObject var31, SubLObject var32, SubLObject var33, SubLObject var34, SubLObject var35, SubLObject var36, SubLObject var37, SubLObject var38) {
        if (var31 == module0667.UNPROVIDED) {
            var31 = module0015.$g292$.getGlobalValue();
        }
        if (var32 == module0667.UNPROVIDED) {
            var32 = (SubLObject)module0667.NIL;
        }
        if (var33 == module0667.UNPROVIDED) {
            var33 = (SubLObject)module0667.NIL;
        }
        if (var34 == module0667.UNPROVIDED) {
            var34 = (SubLObject)module0667.NIL;
        }
        if (var35 == module0667.UNPROVIDED) {
            var35 = (SubLObject)module0667.NIL;
        }
        if (var36 == module0667.UNPROVIDED) {
            var36 = (SubLObject)module0667.NIL;
        }
        if (var37 == module0667.UNPROVIDED) {
            var37 = (SubLObject)module0667.NIL;
        }
        if (var38 == module0667.UNPROVIDED) {
            var38 = (SubLObject)module0667.ZERO_INTEGER;
        }
        final SubLThread var39 = SubLProcess.currentSubLThread();
        if (module0667.NIL == Errors.$ignore_mustsP$.getDynamicValue(var39) && module0667.NIL == Sequences.find(var27, module0667.$g5274$.getGlobalValue(), (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED)) {
            Errors.error((SubLObject)module0667.$ic28$, new SubLObject[] { var3, module0667.$ic29$, module0667.$g5274$.getGlobalValue(), var27 });
        }
        if (module0667.NIL == Errors.$ignore_mustsP$.getDynamicValue(var39) && module0667.NIL == conses_high.intersection(var28, f40546(), (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED)) {
            Errors.error((SubLObject)module0667.$ic30$, var3, (SubLObject)module0667.$ic31$, f40546());
        }
        if (module0667.NIL == Errors.$ignore_mustsP$.getDynamicValue(var39) && module0667.NIL == ((module0667.NIL == var33) ? Types.integerp(var30) : module0667.T)) {
            Errors.error((SubLObject)module0667.$ic32$, var3, (SubLObject)module0667.$ic33$, var30);
        }
        if (module0667.NIL == Errors.$ignore_mustsP$.getDynamicValue(var39) && module0667.NIL == var29) {
            Errors.error((SubLObject)module0667.$ic34$, var3, (SubLObject)module0667.$ic35$, var29);
        }
        final SubLObject var40 = f40543(var3);
        if (!var40.isVector() || !Sequences.length(var40).numGE(Sequences.length(module0667.$g5276$.getDynamicValue(var39)))) {
            Hashtables.sethash(var3, module0667.$g5272$.getGlobalValue(), f40542((SubLObject)module0667.UNPROVIDED));
        }
        f40549(var3, (SubLObject)module0667.$ic36$, var27, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
        f40549(var3, (SubLObject)module0667.$ic37$, var28, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
        f40549(var3, (SubLObject)module0667.$ic38$, var29, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
        f40549(var3, (SubLObject)module0667.$ic39$, var30, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
        f40549(var3, (SubLObject)module0667.$ic40$, var31, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
        f40549(var3, (SubLObject)module0667.$ic41$, var32, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
        f40549(var3, (SubLObject)module0667.$ic42$, var33, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
        f40549(var3, (SubLObject)module0667.$ic43$, var34, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
        f40549(var3, (SubLObject)module0667.$ic44$, var35, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
        f40549(var3, (SubLObject)module0667.$ic45$, var36, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
        f40549(var3, (SubLObject)module0667.$ic46$, var37, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
        f40549(var3, (SubLObject)module0667.$ic47$, var38, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
        SubLObject var41 = var28;
        SubLObject var42 = (SubLObject)module0667.NIL;
        var42 = var41.first();
        while (module0667.NIL != var41) {
            final SubLObject var43 = Hashtables.gethash(var42, module0667.$g5273$.getGlobalValue(), (SubLObject)module0667.UNPROVIDED);
            final SubLObject var44 = conses_high.adjoin(var3, var43, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
            Hashtables.sethash(var42, module0667.$g5273$.getGlobalValue(), var44);
            var41 = var41.rest();
            var42 = var41.first();
        }
        module0667.$g5265$.setDynamicValue((SubLObject)module0667.NIL, var39);
        return f40543(var3);
    }
    
    public static SubLObject f40553(final SubLObject var3) {
        final SubLObject var4 = Hashtables.gethash(var3, module0667.$g5272$.getGlobalValue(), (SubLObject)module0667.UNPROVIDED);
        if (module0667.NIL != var4) {
            SubLObject var6;
            final SubLObject var5 = var6 = f40548(var3, (SubLObject)module0667.$ic37$);
            SubLObject var7 = (SubLObject)module0667.NIL;
            var7 = var6.first();
            while (module0667.NIL != var6) {
                final SubLObject var8 = Hashtables.gethash(var7, module0667.$g5273$.getGlobalValue(), (SubLObject)module0667.UNPROVIDED);
                Hashtables.sethash(var7, module0667.$g5273$.getGlobalValue(), Sequences.remove(var3, var8, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED));
                var6 = var6.rest();
                var7 = var6.first();
            }
        }
        Hashtables.sethash(var3, module0667.$g5272$.getGlobalValue(), (SubLObject)module0667.NIL);
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40554(final SubLObject var42) {
        SubLObject var43 = (SubLObject)module0667.NIL;
        var43 = ((var42.isSymbol() && module0667.NIL != Symbols.fboundp(var42)) ? Functions.funcall(var42) : (var42.isCons() ? Eval.eval(var42) : var42));
        return var43;
    }
    
    public static SubLObject f40555(final SubLObject var43) {
        SubLObject var44 = (SubLObject)module0667.NIL;
        if (module0667.NIL == var44) {
            SubLObject var45;
            SubLObject var46;
            for (var45 = (SubLObject)module0667.$ic48$, var46 = (SubLObject)module0667.NIL, var46 = var45.first(); module0667.NIL == var44 && module0667.NIL != var45; var44 = f40548(var43, var46), var45 = var45.rest(), var46 = var45.first()) {}
        }
        if (module0667.NIL == module0038.f2653(var44)) {
            var44 = f40554(var44);
        }
        if (module0667.NIL == module0038.f2653(var44)) {
            var44 = (SubLObject)module0667.$ic49$;
        }
        return var44;
    }
    
    public static SubLObject f40556(final SubLObject var46) {
        SubLObject var47 = conses_high.second(var46);
        if (module0667.NIL == module0038.f2653(var47)) {
            var47 = (SubLObject)module0667.$ic50$;
        }
        return var47;
    }
    
    public static SubLObject f40557() {
        module0667.$g5275$.setGlobalValue(Sort.sort(module0667.$g5275$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0667.$ic51$), Symbols.symbol_function((SubLObject)module0667.$ic52$)));
        SubLObject var19 = f40546();
        SubLObject var20 = (SubLObject)module0667.NIL;
        var20 = var19.first();
        while (module0667.NIL != var19) {
            SubLObject var21 = Hashtables.gethash(var20, module0667.$g5273$.getGlobalValue(), (SubLObject)module0667.UNPROVIDED);
            var21 = Sort.sort(var21, Symbols.symbol_function((SubLObject)module0667.$ic51$), Symbols.symbol_function((SubLObject)module0667.$ic53$));
            Hashtables.sethash(var20, module0667.$g5273$.getGlobalValue(), var21);
            var19 = var19.rest();
            var20 = var19.first();
        }
        module0667.$g5265$.setDynamicValue((SubLObject)module0667.T);
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40558(SubLObject var48) {
        if (var48 == module0667.UNPROVIDED) {
            var48 = (SubLObject)module0667.NIL;
        }
        final SubLObject var49 = var48.first();
        final SubLObject var50 = conses_high.second(var48);
        return PrintLow.format((SubLObject)module0667.NIL, var49, var50);
    }
    
    public static SubLObject f40559(SubLObject var48) {
        if (var48 == module0667.UNPROVIDED) {
            var48 = (SubLObject)module0667.NIL;
        }
        final SubLObject var49 = var48.first();
        return var49;
    }
    
    public static SubLObject f40560(SubLObject var48) {
        if (var48 == module0667.UNPROVIDED) {
            var48 = (SubLObject)module0667.NIL;
        }
        final SubLObject var49 = var48.first();
        return var49;
    }
    
    public static SubLObject f40561(final SubLObject var50) {
        SubLObject var51 = (SubLObject)module0667.NIL;
        if (var50.isSymbol() && module0667.NIL != Symbols.fboundp(var50)) {
            var51 = Functions.funcall(var50);
        }
        else if (var50.isCons()) {
            var51 = Eval.eval(var50);
        }
        else {
            var51 = var50;
        }
        return var51;
    }
    
    public static SubLObject f40562(final SubLObject var43, final SubLObject var51, final SubLObject var31, final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        final SubLObject var54 = f40548(var43, (SubLObject)module0667.$ic41$);
        final SubLObject var55 = f40561(var54);
        final SubLObject var56 = (module0667.NIL != module0038.f2653(var52)) ? var52 : ((module0667.NIL != module0038.f2653(var55)) ? var55 : PrintLow.format((SubLObject)module0667.NIL, (SubLObject)module0667.$ic55$, var43, (SubLObject)module0667.$ic56$));
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
        module0642.f39020(var51);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
        if (module0667.NIL != var31) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            module0642.f39020(var31);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
        final SubLObject var57 = module0015.$g533$.currentBinding(var53);
        try {
            module0015.$g533$.bind((SubLObject)module0667.T, var53);
            module0642.f39019(var56);
        }
        finally {
            module0015.$g533$.rebind(var57, var53);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40563(final SubLObject var55) {
        SubLObject var56 = (SubLObject)module0667.NIL;
        if (var55.isSymbol() && module0667.NIL != Symbols.fboundp(var55)) {
            var56 = Functions.funcall(var55);
        }
        else if (var55.isCons()) {
            var56 = Eval.eval(var55);
        }
        else {
            var56 = var55;
        }
        return var56;
    }
    
    public static SubLObject f40564(final SubLObject var56) {
        SubLObject var57 = (SubLObject)module0667.NIL;
        if (var56.isSymbol() && module0667.NIL != Symbols.fboundp(var56)) {
            var57 = Functions.funcall(var56);
        }
        else if (var56.isCons()) {
            var57 = Eval.eval(var56);
        }
        else {
            var57 = var56;
        }
        return var57;
    }
    
    public static SubLObject f40565(final SubLObject var43, final SubLObject var51, final SubLObject var31, final SubLObject var58, final SubLObject var59, final SubLObject var60, final SubLObject var61, final SubLObject var62) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        final SubLObject var64 = f40548(var43, (SubLObject)module0667.$ic43$);
        final SubLObject var65 = f40563(var64);
        final SubLObject var66 = f40548(var43, (SubLObject)module0667.$ic44$);
        final SubLObject var67 = f40548(var43, (SubLObject)module0667.$ic45$);
        final SubLObject var68 = f40564(var67);
        final SubLObject var69 = f40548(var43, (SubLObject)module0667.$ic46$);
        final SubLObject var70 = f40548(var43, (SubLObject)module0667.$ic47$);
        final SubLObject var71 = (module0667.NIL != var62) ? var62 : var66;
        final SubLObject var72 = (module0667.NIL != var58) ? var58 : var65;
        final SubLObject var73 = (module0667.NIL != var59) ? var59 : var68;
        final SubLObject var74 = (module0667.NIL != var60) ? var60 : var69;
        final SubLObject var75 = (module0667.NIL != var61) ? var61 : var70;
        final SubLObject var76 = var72.isKeyword() ? Sequences.cconcatenate(module0110.$g124$.getDynamicValue(var63), module0014.f698(var72)) : var72;
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
        module0642.f39020(var51);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
        if (module0667.NIL != var31) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            module0642.f39020(var31);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
        final SubLObject var77 = module0015.$g533$.currentBinding(var63);
        try {
            module0015.$g533$.bind((SubLObject)module0667.T, var63);
            module0642.f39020(module0015.$g431$.getGlobalValue());
            module0642.f39020(module0015.$g440$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            module0642.f39020(var76);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            if (module0667.NIL != var71) {
                module0642.f39046(module0015.$g434$.getGlobalValue());
            }
            if (module0667.NIL != var73) {
                module0642.f39020(module0015.$g437$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020(var73);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            }
            if (module0667.NIL != var74) {
                module0642.f39020(module0015.$g438$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020(module0642.f39049(var74));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            }
            if (module0667.NIL != var75) {
                module0642.f39020(module0015.$g439$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020(var75);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
            final SubLObject var54_69 = module0015.$g533$.currentBinding(var63);
            try {
                module0015.$g533$.bind((SubLObject)module0667.T, var63);
            }
            finally {
                module0015.$g533$.rebind(var54_69, var63);
            }
            module0642.f39020(module0015.$g432$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var77, var63);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40566(final SubLObject var43, final SubLObject var51, final SubLObject var27, final SubLObject var31, final SubLObject var52, final SubLObject var34, final SubLObject var59, final SubLObject var60, final SubLObject var61, final SubLObject var62) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        if (var27.eql((SubLObject)module0667.$ic57$)) {
            f40562(var43, var51, var31, var52);
        }
        else if (var27.eql((SubLObject)module0667.$ic58$)) {
            f40565(var43, var51, var31, var34, var59, var60, var61, var62);
        }
        else {
            module0642.f39020(module0015.$g219$.getGlobalValue());
            module0642.f39020(module0015.$g222$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            module0642.f39020(module0642.f39042((SubLObject)module0667.$ic59$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
            final SubLObject var64 = module0015.$g533$.currentBinding(var63);
            try {
                module0015.$g533$.bind((SubLObject)module0667.T, var63);
                PrintLow.format(module0015.$g131$.getDynamicValue(var63), (SubLObject)module0667.$ic60$, (SubLObject)module0667.$ic29$, module0667.$g5274$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var64, var63);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
        }
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40567(final SubLObject var70) {
        final SubLObject var71 = reader.read_from_string_ignoring_errors(var70.first(), (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
        f40568((SubLObject)module0667.$ic61$, PrintLow.format((SubLObject)module0667.NIL, (SubLObject)module0667.$ic62$, var71));
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40569(final SubLObject var43, final SubLObject var48, SubLObject var29, final SubLObject var33, final SubLObject var30, final SubLObject var49) {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        SubLObject var51 = (SubLObject)module0667.$ic64$;
        if (module0667.NIL == var33 && (module0667.NIL == var30 || !Sequences.length(var48).numE(var30))) {
            var51 = PrintLow.format((SubLObject)module0667.NIL, (SubLObject)module0667.$ic65$, var49, var43);
        }
        else if (module0667.NIL == var33) {
            var29 = Functions.apply(Symbols.symbol_function((SubLObject)module0667.$ic66$), (SubLObject)module0667.NIL, new SubLObject[] { var29, var48 });
            var51 = PrintLow.format((SubLObject)module0667.NIL, (SubLObject)module0667.$ic67$, var49, var29);
        }
        else {
            SubLObject var52 = var33;
            SubLObject var53 = (SubLObject)module0667.NIL;
            var53 = var52.first();
            while (module0667.NIL != var52) {
                final SubLObject var54 = (SubLObject)ConsesLow.list(var29, var49);
                final SubLObject var55 = conses_high.assoc(var53, module0667.$g5277$.getDynamicValue(var50), (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED).rest();
                if (module0667.NIL != Symbols.fboundp(var55)) {
                    var51 = Functions.funcall(var55, var54);
                }
                else {
                    var51 = var29;
                }
                var52 = var52.rest();
                var53 = var52.first();
            }
            if (module0667.NIL == module0038.f2653(var51)) {
                var51 = var29;
            }
        }
        return var51;
    }
    
    public static SubLObject f40570(final SubLObject var73) {
        SubLObject var74 = (SubLObject)module0667.NIL;
        if (var73.isSymbol() && module0667.NIL != Symbols.fboundp(var73)) {
            var74 = Functions.funcall(var73);
        }
        else if (var73.isCons()) {
            var74 = Eval.eval(var73);
        }
        else {
            var74 = var73;
        }
        return var74;
    }
    
    public static SubLObject f40571(final SubLObject var43, SubLObject var48, SubLObject var31, SubLObject var52, SubLObject var34, SubLObject var59, SubLObject var60, SubLObject var61, SubLObject var62) {
        if (var48 == module0667.UNPROVIDED) {
            var48 = (SubLObject)module0667.NIL;
        }
        if (var31 == module0667.UNPROVIDED) {
            var31 = (SubLObject)module0667.NIL;
        }
        if (var52 == module0667.UNPROVIDED) {
            var52 = (SubLObject)module0667.NIL;
        }
        if (var34 == module0667.UNPROVIDED) {
            var34 = (SubLObject)module0667.NIL;
        }
        if (var59 == module0667.UNPROVIDED) {
            var59 = (SubLObject)module0667.NIL;
        }
        if (var60 == module0667.UNPROVIDED) {
            var60 = (SubLObject)module0667.NIL;
        }
        if (var61 == module0667.UNPROVIDED) {
            var61 = (SubLObject)module0667.NIL;
        }
        if (var62 == module0667.UNPROVIDED) {
            var62 = (SubLObject)module0667.NIL;
        }
        final SubLThread var63 = SubLProcess.currentSubLThread();
        final SubLObject var64 = f40548(var43, (SubLObject)module0667.$ic36$);
        final SubLObject var65 = f40548(var43, (SubLObject)module0667.$ic38$);
        final SubLObject var66 = f40570(var65);
        final SubLObject var67 = f40548(var43, (SubLObject)module0667.$ic42$);
        final SubLObject var68 = f40548(var43, (SubLObject)module0667.$ic39$);
        final SubLObject var69 = f40548(var43, (SubLObject)module0667.$ic40$);
        final SubLObject var70 = (SubLObject)((module0667.NIL != module0038.f2653(module0110.$g570$.getDynamicValue(var63))) ? module0110.$g570$.getDynamicValue(var63) : module0667.$ic68$);
        final SubLObject var71 = f40569(var43, var48, var66, var67, var68, var70);
        if (module0667.NIL == var31) {
            var31 = var69;
        }
        if (!var31.isString()) {
            var31 = module0656.f39832(var31);
        }
        f40566(var43, var71, var64, var31, var52, var34, var59, var60, var61, var62);
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40572(final SubLObject var4) {
        return Types.vectorp(Hashtables.gethash(var4, module0667.$g5272$.getGlobalValue(), (SubLObject)module0667.UNPROVIDED));
    }
    
    public static SubLObject f40573(final SubLObject var39) {
        final SubLObject var40 = Hashtables.gethash(var39, module0667.$g5273$.getGlobalValue(), (SubLObject)module0667.UNPROVIDED);
        SubLObject var41 = (SubLObject)module0667.NIL;
        if (module0667.NIL == var41) {
            SubLObject var42;
            SubLObject var43;
            for (var42 = var40, var43 = (SubLObject)module0667.NIL, var43 = var42.first(); module0667.NIL == var41 && module0667.NIL != var42; var41 = f40572(var43), var42 = var42.rest(), var43 = var42.first()) {}
        }
        return var41;
    }
    
    public static SubLObject f40574(final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        final SubLObject var80 = (SubLObject)((module0667.NIL != Sequences.find(module0667.$g5266$.getDynamicValue(var79), (SubLObject)module0667.$ic69$, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED)) ? module0667.$g5266$.getDynamicValue(var79) : module0667.THREE_INTEGER);
        SubLObject var81 = (SubLObject)module0667.NIL;
        SubLObject var82 = (SubLObject)module0667.NIL;
        SubLObject var83 = (SubLObject)module0667.NIL;
        SubLObject var84 = (SubLObject)module0667.NIL;
        final SubLObject var85 = Sequences.length(var78);
        final SubLObject var86 = Numbers.ceiling(Numbers.divide(var85, var80), (SubLObject)module0667.UNPROVIDED);
        final SubLObject var87 = (SubLObject)(var80.numG((SubLObject)module0667.ONE_INTEGER) ? Numbers.ceiling(Numbers.divide(Numbers.subtract(var85, var86), Numbers.subtract(var80, (SubLObject)module0667.ONE_INTEGER)), (SubLObject)module0667.UNPROVIDED) : module0667.ZERO_INTEGER);
        final SubLObject var88 = (SubLObject)(var80.numG((SubLObject)module0667.TWO_INTEGER) ? Numbers.ceiling(Numbers.divide(Numbers.subtract(var85, var87), Numbers.subtract(var80, (SubLObject)module0667.ONE_INTEGER)), (SubLObject)module0667.UNPROVIDED) : module0667.ZERO_INTEGER);
        SubLObject var89 = (SubLObject)module0667.ONE_INTEGER;
        SubLObject var90 = (SubLObject)module0667.ONE_INTEGER;
        SubLObject var91 = var78;
        SubLObject var92 = (SubLObject)module0667.NIL;
        var92 = var91.first();
        while (module0667.NIL != var91) {
            final SubLObject var93 = var90;
            if (var93.eql((SubLObject)module0667.ONE_INTEGER)) {
                var81 = (SubLObject)ConsesLow.cons(var92, var81);
                if (var89.numGE(var86)) {
                    var89 = (SubLObject)module0667.ONE_INTEGER;
                    var90 = Numbers.add(var90, (SubLObject)module0667.ONE_INTEGER);
                }
                else {
                    var89 = Numbers.add(var89, (SubLObject)module0667.ONE_INTEGER);
                }
            }
            else if (var93.eql((SubLObject)module0667.TWO_INTEGER)) {
                var82 = (SubLObject)ConsesLow.cons(var92, var82);
                if (var89.numGE(var87)) {
                    var89 = (SubLObject)module0667.ONE_INTEGER;
                    var90 = Numbers.add(var90, (SubLObject)module0667.ONE_INTEGER);
                }
                else {
                    var89 = Numbers.add(var89, (SubLObject)module0667.ONE_INTEGER);
                }
            }
            else if (var93.eql((SubLObject)module0667.THREE_INTEGER)) {
                var83 = (SubLObject)ConsesLow.cons(var92, var83);
                if (var89.numGE(var88)) {
                    var89 = (SubLObject)module0667.ONE_INTEGER;
                    var90 = Numbers.add(var90, (SubLObject)module0667.ONE_INTEGER);
                }
                else {
                    var89 = Numbers.add(var89, (SubLObject)module0667.ONE_INTEGER);
                }
            }
            else if (var93.eql((SubLObject)module0667.FOUR_INTEGER)) {
                var84 = (SubLObject)ConsesLow.cons(var92, var84);
            }
            var91 = var91.rest();
            var92 = var91.first();
        }
        var81 = Sequences.nreverse(var81);
        var82 = Sequences.nreverse(var82);
        var83 = Sequences.nreverse(var83);
        var84 = Sequences.nreverse(var84);
        return (SubLObject)ConsesLow.list(var81, var82, var83, var84);
    }
    
    public static SubLObject f40575(final SubLObject var90, final SubLObject var91) {
        final SubLThread var92 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
        final SubLObject var93 = module0015.$g533$.currentBinding(var92);
        try {
            module0015.$g533$.bind((SubLObject)module0667.T, var92);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g370$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0667.$ic70$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
            final SubLObject var54_92 = module0015.$g533$.currentBinding(var92);
            try {
                module0015.$g533$.bind((SubLObject)module0667.T, var92);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019(var90);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39067();
                module0642.f39067();
            }
            finally {
                module0015.$g533$.rebind(var54_92, var92);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var93, var92);
        }
        module0642.f39020(module0015.$g365$.getGlobalValue());
        module0642.f39029((SubLObject)module0667.UNPROVIDED);
        SubLObject var94;
        SubLObject var95;
        SubLObject var96;
        SubLObject var97;
        SubLObject var98;
        SubLObject var99;
        SubLObject var100;
        SubLObject var101;
        SubLObject var102;
        SubLObject var54_93;
        SubLObject var54_94;
        SubLObject var54_95;
        SubLObject var54_96;
        SubLObject var54_97;
        SubLObject var54_98;
        SubLObject var54_99;
        for (var94 = (SubLObject)module0667.NIL, var95 = (SubLObject)module0667.NIL, var96 = (SubLObject)module0667.NIL, var97 = (SubLObject)module0667.NIL, var94 = var91.first(), var95 = conses_high.second(var91), var96 = conses_high.third(var91), var97 = conses_high.fourth(var91); module0667.NIL != var94 || module0667.NIL != var95 || module0667.NIL != var96 || module0667.NIL != var97; var94 = var94.rest(), var95 = var95.rest(), var96 = var96.rest(), var97 = var97.rest()) {
            var98 = var94.first();
            var99 = var95.first();
            var100 = var96.first();
            var101 = var97.first();
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
            var102 = module0015.$g533$.currentBinding(var92);
            try {
                module0015.$g533$.bind((SubLObject)module0667.T, var92);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0667.$ic70$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0667.$ic71$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                var54_93 = module0015.$g533$.currentBinding(var92);
                try {
                    module0015.$g533$.bind((SubLObject)module0667.T, var92);
                    f40571(var98, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
                    if (module0667.$g5269$.getDynamicValue(var92).equalp((SubLObject)module0667.$ic72$)) {
                        module0642.f39067();
                        module0642.f39067();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var54_93, var92);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                if (module0667.NIL != var99) {
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                    var54_94 = module0015.$g533$.currentBinding(var92);
                    try {
                        module0015.$g533$.bind((SubLObject)module0667.T, var92);
                        module0642.f39020(module0015.$g459$.getGlobalValue());
                        module0642.f39032(module0667.$g5267$.getDynamicValue(var92));
                        module0642.f39020(module0015.$g460$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var54_94, var92);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0667.$ic70$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0667.$ic71$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                    var54_95 = module0015.$g533$.currentBinding(var92);
                    try {
                        module0015.$g533$.bind((SubLObject)module0667.T, var92);
                        f40571(var99, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var54_95, var92);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    if (module0667.NIL != var100) {
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                        var54_96 = module0015.$g533$.currentBinding(var92);
                        try {
                            module0015.$g533$.bind((SubLObject)module0667.T, var92);
                            module0642.f39020(module0015.$g459$.getGlobalValue());
                            module0642.f39032(module0667.$g5267$.getDynamicValue(var92));
                            module0642.f39020(module0015.$g460$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var54_96, var92);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0667.$ic70$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0667.$ic71$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                        var54_97 = module0015.$g533$.currentBinding(var92);
                        try {
                            module0015.$g533$.bind((SubLObject)module0667.T, var92);
                            f40571(var100, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var54_97, var92);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        if (module0667.NIL != var101) {
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                            var54_98 = module0015.$g533$.currentBinding(var92);
                            try {
                                module0015.$g533$.bind((SubLObject)module0667.T, var92);
                                module0642.f39020(module0015.$g459$.getGlobalValue());
                                module0642.f39032(module0667.$g5267$.getDynamicValue(var92));
                                module0642.f39020(module0015.$g460$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var54_98, var92);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0667.$ic70$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0667.$ic71$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                            var54_99 = module0015.$g533$.currentBinding(var92);
                            try {
                                module0015.$g533$.bind((SubLObject)module0667.T, var92);
                                f40571(var101, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var54_99, var92);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                    }
                }
            }
            finally {
                module0015.$g533$.rebind(var102, var92);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
        }
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40576(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = var28.first();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        if (module0667.NIL != module0667.$g5270$.getDynamicValue(var29)) {
            module0642.f39020(module0015.$g352$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            module0642.f39020(module0667.$g5270$.getDynamicValue(var29));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
        final SubLObject var31 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)module0667.T, var29);
            SubLObject var32 = var28;
            SubLObject var33 = (SubLObject)module0667.NIL;
            var33 = var32.first();
            while (module0667.NIL != var32) {
                final SubLObject var34 = conses_high.assoc(var33, module0667.$g5275$.getGlobalValue(), (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
                SubLObject var35 = conses_high.second(var34);
                if (module0667.NIL == var35) {
                    var35 = (SubLObject)module0667.$ic73$;
                }
                if (module0667.NIL != conses_high.third(var34)) {
                    SubLObject var36 = Hashtables.gethash(var33, module0667.$g5273$.getGlobalValue(), (SubLObject)module0667.UNPROVIDED);
                    var36 = module0035.remove_if_not(Symbols.symbol_function((SubLObject)module0667.$ic74$), var36, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
                    if (module0667.NIL != var36) {
                        if (!var33.eql(var30) && !module0667.$g5269$.getDynamicValue(var29).equalp((SubLObject)module0667.$ic72$)) {
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                            final SubLObject var54_105 = module0015.$g533$.currentBinding(var29);
                            try {
                                module0015.$g533$.bind((SubLObject)module0667.T, var29);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                                final SubLObject var54_106 = module0015.$g533$.currentBinding(var29);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0667.T, var29);
                                    module0642.f39067();
                                }
                                finally {
                                    module0015.$g533$.rebind(var54_106, var29);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var54_105, var29);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0667.UNPROVIDED);
                        }
                        f40575(var35, f40574(var36));
                    }
                }
                var32 = var32.rest();
                var33 = var32.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var31, var29);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40577(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = (SubLObject)((module0667.NIL != Sequences.find(module0667.$g5266$.getDynamicValue(var29), (SubLObject)module0667.$ic69$, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED)) ? module0667.$g5266$.getDynamicValue(var29) : module0667.THREE_INTEGER);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        if (module0667.NIL != module0667.$g5270$.getDynamicValue(var29)) {
            module0642.f39020(module0015.$g352$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            module0642.f39020(module0667.$g5270$.getDynamicValue(var29));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
        final SubLObject var31 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)module0667.T, var29);
            SubLObject var32;
            SubLObject var33;
            SubLObject var54_109;
            SubLObject var34;
            SubLObject var35;
            SubLObject var36;
            SubLObject var37;
            SubLObject var38;
            SubLObject var54_110;
            SubLObject var19_111;
            SubLObject var39;
            SubLObject var54_111;
            for (var32 = (SubLObject)module0667.NIL, var33 = (SubLObject)module0667.NIL, var32 = var28, var33 = module0035.f2124(var30, var32); module0667.NIL != var33; var33 = module0035.f2124(var30, var32)) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                var54_109 = module0015.$g533$.currentBinding(var29);
                try {
                    module0015.$g533$.bind((SubLObject)module0667.T, var29);
                    var34 = var33;
                    var35 = (SubLObject)module0667.NIL;
                    var35 = var34.first();
                    while (module0667.NIL != var34) {
                        var36 = conses_high.assoc(var35, module0667.$g5275$.getGlobalValue(), (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
                        var37 = conses_high.second(var36);
                        if (module0667.NIL == var37) {
                            var37 = (SubLObject)module0667.$ic73$;
                        }
                        if (module0667.NIL != conses_high.third(var36)) {
                            var38 = Hashtables.gethash(var35, module0667.$g5273$.getGlobalValue(), (SubLObject)module0667.UNPROVIDED);
                            var38 = module0035.remove_if_not(Symbols.symbol_function((SubLObject)module0667.$ic74$), var38, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
                            if (module0667.NIL != var38) {
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0667.$ic70$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0667.$ic71$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                                var54_110 = module0015.$g533$.currentBinding(var29);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0667.T, var29);
                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                    PrintLow.format(module0015.$g131$.getDynamicValue(var29), var37);
                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                    module0642.f39067();
                                    var19_111 = var38;
                                    var39 = (SubLObject)module0667.NIL;
                                    var39 = var19_111.first();
                                    while (module0667.NIL != var19_111) {
                                        module0642.f39067();
                                        f40571(var39, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
                                        if (module0667.$g5269$.getDynamicValue(var29).equalp((SubLObject)module0667.$ic72$)) {
                                            module0642.f39067();
                                        }
                                        var19_111 = var19_111.rest();
                                        var39 = var19_111.first();
                                    }
                                    module0642.f39067();
                                    if (module0667.$g5269$.getDynamicValue(var29).equalp((SubLObject)module0667.$ic3$)) {
                                        module0642.f39067();
                                    }
                                }
                                finally {
                                    module0015.$g533$.rebind(var54_110, var29);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                                var54_111 = module0015.$g533$.currentBinding(var29);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0667.T, var29);
                                    module0642.f39026((SubLObject)module0667.UNPROVIDED);
                                    module0642.f39020(module0015.$g459$.getGlobalValue());
                                    module0642.f39032(module0667.$g5267$.getDynamicValue(var29));
                                    module0642.f39020(module0015.$g460$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var54_111, var29);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                        }
                        var34 = var34.rest();
                        var35 = var34.first();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var54_109, var29);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0667.UNPROVIDED);
                var32 = conses_high.nthcdr(var30, var32);
            }
        }
        finally {
            module0015.$g533$.rebind(var31, var29);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40578() {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)module0667.$ic13$), module0035.remove_if_not(Symbols.symbol_function((SubLObject)module0667.$ic77$), module0667.$g5275$.getGlobalValue(), (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED));
    }
    
    public static SubLObject f40579(SubLObject var70) {
        if (var70 == module0667.UNPROVIDED) {
            var70 = (SubLObject)module0667.NIL;
        }
        final SubLThread var71 = SubLProcess.currentSubLThread();
        if (module0667.NIL == module0667.$g5265$.getDynamicValue(var71)) {
            f40557();
        }
        SubLObject var72 = f40578();
        var72 = module0035.remove_if_not(Symbols.symbol_function((SubLObject)module0667.$ic78$), var72, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
        final SubLObject var73 = (SubLObject)module0667.$ic79$;
        final SubLObject var74 = module0015.$g538$.currentBinding(var71);
        try {
            module0015.$g538$.bind((module0667.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var71))) ? module0015.$g538$.getDynamicValue(var71) : module0057.f4173((SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED), var71);
            module0642.f39020((SubLObject)module0667.$ic80$);
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var71), module0655.$g5142$.getDynamicValue(var71));
            final SubLObject var75 = module0014.f672((SubLObject)module0667.$ic81$);
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            module0642.f39020((SubLObject)module0667.$ic82$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            if (module0667.NIL != var75) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020(var75);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            module0642.f39020((SubLObject)module0667.$ic83$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
            module0016.f941();
            if (module0667.NIL != var73) {
                module0642.f39029((SubLObject)module0667.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var73);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
            final SubLObject var54_115 = module0015.$g535$.currentBinding(var71);
            try {
                module0015.$g535$.bind((SubLObject)module0667.T, var71);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0667.NIL != module0015.$g132$.getDynamicValue(var71)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var71)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020((SubLObject)module0667.$ic86$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                final SubLObject var54_116 = module0015.$g533$.currentBinding(var71);
                try {
                    module0015.$g533$.bind((SubLObject)module0667.T, var71);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39020((SubLObject)module0667.$ic87$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                    final SubLObject var54_117 = module0015.$g533$.currentBinding(var71);
                    try {
                        module0015.$g533$.bind((SubLObject)module0667.T, var71);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020((SubLObject)module0667.$ic88$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020((SubLObject)module0667.$ic89$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39019((SubLObject)module0667.$ic90$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var54_117, var71);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0667.NIL != var73) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0667.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39019(var73);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0667.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var71));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                    final SubLObject var54_118 = module0015.$g533$.currentBinding(var71);
                    final SubLObject var76 = module0015.$g541$.currentBinding(var71);
                    final SubLObject var77 = module0015.$g539$.currentBinding(var71);
                    try {
                        module0015.$g533$.bind((SubLObject)module0667.T, var71);
                        module0015.$g541$.bind((SubLObject)module0667.T, var71);
                        module0015.$g539$.bind(module0015.f797(), var71);
                        module0642.f39032((SubLObject)module0667.TWO_INTEGER);
                        module0656.f39790((SubLObject)module0667.$ic91$, (SubLObject)module0667.$ic92$);
                        if (module0667.NIL != var72) {
                            module0642.f39020(module0015.$g346$.getGlobalValue());
                            module0642.f39020(module0015.$g352$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                            module0642.f39020((SubLObject)module0667.ZERO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                            final SubLObject var54_119 = module0015.$g533$.currentBinding(var71);
                            try {
                                module0015.$g533$.bind((SubLObject)module0667.T, var71);
                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                                final SubLObject var54_120 = module0015.$g533$.currentBinding(var71);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0667.T, var71);
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)module0667.$ic70$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                                    final SubLObject var54_121 = module0015.$g533$.currentBinding(var71);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0667.T, var71);
                                        if (module0667.NIL != module0667.$g5268$.getDynamicValue(var71)) {
                                            f40577(var72);
                                        }
                                        else {
                                            f40576(var72);
                                        }
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var54_121, var71);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var54_120, var71);
                                }
                                module0642.f39020(module0015.$g365$.getGlobalValue());
                                module0642.f39029((SubLObject)module0667.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var54_119, var71);
                            }
                            module0642.f39020(module0015.$g347$.getGlobalValue());
                        }
                        else {
                            module0642.f39067();
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            PrintLow.format(module0015.$g131$.getDynamicValue(var71), (SubLObject)module0667.$ic93$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)module0667.TWO_INTEGER);
                            module0656.f39790((SubLObject)module0667.$ic91$, (SubLObject)module0667.$ic94$);
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var71));
                    }
                    finally {
                        module0015.$g539$.rebind(var77, var71);
                        module0015.$g541$.rebind(var76, var71);
                        module0015.$g533$.rebind(var54_118, var71);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0667.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var54_116, var71);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0667.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var54_115, var71);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var74, var71);
        }
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40580(SubLObject var70) {
        if (var70 == module0667.UNPROVIDED) {
            var70 = (SubLObject)module0667.NIL;
        }
        final SubLThread var71 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
        module0642.f39020((SubLObject)module0667.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
        final SubLObject var72 = module0015.$g533$.currentBinding(var71);
        try {
            module0015.$g533$.bind((SubLObject)module0667.T, var71);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
            final SubLObject var54_124 = module0015.$g533$.currentBinding(var71);
            try {
                module0015.$g533$.bind((SubLObject)module0667.T, var71);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                final SubLObject var54_125 = module0015.$g533$.currentBinding(var71);
                try {
                    module0015.$g533$.bind((SubLObject)module0667.T, var71);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var71), (SubLObject)module0667.$ic50$);
                }
                finally {
                    module0015.$g533$.rebind(var54_125, var71);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var54_124, var71);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
            final SubLObject var54_126 = module0015.$g533$.currentBinding(var71);
            try {
                module0015.$g533$.bind((SubLObject)module0667.T, var71);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0667.$ic96$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                final SubLObject var54_127 = module0015.$g533$.currentBinding(var71);
                try {
                    module0015.$g533$.bind((SubLObject)module0667.T, var71);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var71), (SubLObject)module0667.$ic97$);
                }
                finally {
                    module0015.$g533$.rebind(var54_127, var71);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0667.$ic70$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                final SubLObject var54_128 = module0015.$g533$.currentBinding(var71);
                try {
                    module0015.$g533$.bind((SubLObject)module0667.T, var71);
                    module0642.f39020(module0015.$g318$.getGlobalValue());
                    final SubLObject var54_129 = module0015.$g533$.currentBinding(var71);
                    try {
                        module0015.$g533$.bind((SubLObject)module0667.NIL, var71);
                        module0642.f39020(module0015.$g320$.getGlobalValue());
                        PrintLow.format(module0015.$g131$.getDynamicValue(var71), (SubLObject)module0667.$ic98$);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                        final SubLObject var54_130 = module0015.$g533$.currentBinding(var71);
                        try {
                            module0015.$g533$.bind((SubLObject)module0667.T, var71);
                            final SubLObject var73 = module0667.$g5266$.getDynamicValue(var71);
                            SubLObject var74 = (SubLObject)module0667.$ic69$;
                            SubLObject var75 = (SubLObject)module0667.NIL;
                            var75 = var74.first();
                            while (module0667.NIL != var74) {
                                module0642.f39020(module0015.$g324$.getGlobalValue());
                                final SubLObject var54_131 = module0015.$g533$.currentBinding(var71);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0667.NIL, var71);
                                    if (var75.equal(var73)) {
                                        module0642.f39019(module0015.$g327$.getGlobalValue());
                                    }
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                                    final SubLObject var54_132 = module0015.$g533$.currentBinding(var71);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0667.T, var71);
                                        module0642.f39019(var75);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var54_132, var71);
                                    }
                                }
                                finally {
                                    module0015.$g533$.rebind(var54_131, var71);
                                }
                                module0642.f39020(module0015.$g325$.getGlobalValue());
                                var74 = var74.rest();
                                var75 = var74.first();
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var54_130, var71);
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var54_129, var71);
                    }
                    module0642.f39020(module0015.$g319$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var54_128, var71);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var54_126, var71);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
            final SubLObject var54_133 = module0015.$g533$.currentBinding(var71);
            try {
                module0015.$g533$.bind((SubLObject)module0667.T, var71);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                final SubLObject var54_134 = module0015.$g533$.currentBinding(var71);
                try {
                    module0015.$g533$.bind((SubLObject)module0667.T, var71);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var71), (SubLObject)module0667.$ic50$);
                }
                finally {
                    module0015.$g533$.rebind(var54_134, var71);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var54_133, var71);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
            final SubLObject var54_135 = module0015.$g533$.currentBinding(var71);
            try {
                module0015.$g533$.bind((SubLObject)module0667.T, var71);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0667.$ic96$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                final SubLObject var54_136 = module0015.$g533$.currentBinding(var71);
                try {
                    module0015.$g533$.bind((SubLObject)module0667.T, var71);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var71), (SubLObject)module0667.$ic99$);
                }
                finally {
                    module0015.$g533$.rebind(var54_136, var71);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0667.$ic70$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                final SubLObject var54_137 = module0015.$g533$.currentBinding(var71);
                try {
                    module0015.$g533$.bind((SubLObject)module0667.T, var71);
                    module0642.f39075((SubLObject)module0667.$ic100$, module0667.$g5267$.getDynamicValue(var71), (SubLObject)module0667.THREE_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var54_137, var71);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var54_135, var71);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
            final SubLObject var54_138 = module0015.$g533$.currentBinding(var71);
            try {
                module0015.$g533$.bind((SubLObject)module0667.T, var71);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                final SubLObject var54_139 = module0015.$g533$.currentBinding(var71);
                try {
                    module0015.$g533$.bind((SubLObject)module0667.T, var71);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var71), (SubLObject)module0667.$ic50$);
                }
                finally {
                    module0015.$g533$.rebind(var54_139, var71);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var54_138, var71);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
            final SubLObject var54_140 = module0015.$g533$.currentBinding(var71);
            try {
                module0015.$g533$.bind((SubLObject)module0667.T, var71);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0667.$ic96$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                final SubLObject var54_141 = module0015.$g533$.currentBinding(var71);
                try {
                    module0015.$g533$.bind((SubLObject)module0667.T, var71);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var71), (SubLObject)module0667.$ic101$);
                }
                finally {
                    module0015.$g533$.rebind(var54_141, var71);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0667.$ic70$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                final SubLObject var54_142 = module0015.$g533$.currentBinding(var71);
                try {
                    module0015.$g533$.bind((SubLObject)module0667.T, var71);
                    module0642.f39072((SubLObject)module0667.$ic102$, (SubLObject)module0667.$ic103$, module0667.$g5268$.getDynamicValue(var71), (SubLObject)module0667.UNPROVIDED);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var71), (SubLObject)module0667.$ic104$);
                    module0642.f39067();
                    module0642.f39072((SubLObject)module0667.$ic102$, (SubLObject)module0667.$ic105$, (SubLObject)SubLObjectFactory.makeBoolean(module0667.NIL == module0667.$g5268$.getDynamicValue(var71)), (SubLObject)module0667.UNPROVIDED);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var71), (SubLObject)module0667.$ic106$);
                }
                finally {
                    module0015.$g533$.rebind(var54_142, var71);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var54_140, var71);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
            final SubLObject var54_143 = module0015.$g533$.currentBinding(var71);
            try {
                module0015.$g533$.bind((SubLObject)module0667.T, var71);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                final SubLObject var54_144 = module0015.$g533$.currentBinding(var71);
                try {
                    module0015.$g533$.bind((SubLObject)module0667.T, var71);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var71), (SubLObject)module0667.$ic50$);
                }
                finally {
                    module0015.$g533$.rebind(var54_144, var71);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var54_143, var71);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
            final SubLObject var54_145 = module0015.$g533$.currentBinding(var71);
            try {
                module0015.$g533$.bind((SubLObject)module0667.T, var71);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0667.$ic96$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                final SubLObject var54_146 = module0015.$g533$.currentBinding(var71);
                try {
                    module0015.$g533$.bind((SubLObject)module0667.T, var71);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var71), (SubLObject)module0667.$ic107$);
                }
                finally {
                    module0015.$g533$.rebind(var54_146, var71);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0667.$ic70$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                final SubLObject var54_147 = module0015.$g533$.currentBinding(var71);
                try {
                    module0015.$g533$.bind((SubLObject)module0667.T, var71);
                    module0642.f39020(module0015.$g318$.getGlobalValue());
                    final SubLObject var54_148 = module0015.$g533$.currentBinding(var71);
                    try {
                        module0015.$g533$.bind((SubLObject)module0667.NIL, var71);
                        module0642.f39020(module0015.$g320$.getGlobalValue());
                        PrintLow.format(module0015.$g131$.getDynamicValue(var71), (SubLObject)module0667.$ic108$);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                        final SubLObject var54_149 = module0015.$g533$.currentBinding(var71);
                        try {
                            module0015.$g533$.bind((SubLObject)module0667.T, var71);
                            final SubLObject var73 = module0667.$g5269$.getDynamicValue(var71);
                            SubLObject var74 = (SubLObject)module0667.$ic109$;
                            SubLObject var76 = (SubLObject)module0667.NIL;
                            var76 = var74.first();
                            while (module0667.NIL != var74) {
                                module0642.f39020(module0015.$g324$.getGlobalValue());
                                final SubLObject var54_150 = module0015.$g533$.currentBinding(var71);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0667.NIL, var71);
                                    if (var76.equalp(var73)) {
                                        module0642.f39019(module0015.$g327$.getGlobalValue());
                                    }
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                                    final SubLObject var54_151 = module0015.$g533$.currentBinding(var71);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0667.T, var71);
                                        module0642.f39019(var76);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var54_151, var71);
                                    }
                                }
                                finally {
                                    module0015.$g533$.rebind(var54_150, var71);
                                }
                                module0642.f39020(module0015.$g325$.getGlobalValue());
                                var74 = var74.rest();
                                var76 = var74.first();
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var54_149, var71);
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var54_148, var71);
                    }
                    module0642.f39020(module0015.$g319$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var54_147, var71);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var54_145, var71);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var72, var71);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40581(SubLObject var70) {
        if (var70 == module0667.UNPROVIDED) {
            var70 = (SubLObject)module0667.NIL;
        }
        final SubLThread var71 = SubLProcess.currentSubLThread();
        final SubLObject var72 = (SubLObject)module0667.$ic111$;
        final SubLObject var73 = module0015.$g538$.currentBinding(var71);
        try {
            module0015.$g538$.bind((module0667.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var71))) ? module0015.$g538$.getDynamicValue(var71) : module0057.f4173((SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED), var71);
            module0642.f39020((SubLObject)module0667.$ic80$);
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var71), module0655.$g5142$.getDynamicValue(var71));
            final SubLObject var74 = module0014.f672((SubLObject)module0667.$ic81$);
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            module0642.f39020((SubLObject)module0667.$ic82$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            if (module0667.NIL != var74) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020(var74);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            module0642.f39020((SubLObject)module0667.$ic83$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
            module0016.f941();
            if (module0667.NIL != var72) {
                module0642.f39029((SubLObject)module0667.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var72);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
            final SubLObject var54_154 = module0015.$g535$.currentBinding(var71);
            try {
                module0015.$g535$.bind((SubLObject)module0667.T, var71);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0667.NIL != module0015.$g132$.getDynamicValue(var71)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var71)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020((SubLObject)module0667.$ic86$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                final SubLObject var54_155 = module0015.$g533$.currentBinding(var71);
                try {
                    module0015.$g533$.bind((SubLObject)module0667.T, var71);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39020((SubLObject)module0667.$ic87$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                    final SubLObject var54_156 = module0015.$g533$.currentBinding(var71);
                    try {
                        module0015.$g533$.bind((SubLObject)module0667.T, var71);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020((SubLObject)module0667.$ic88$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020((SubLObject)module0667.$ic89$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39019((SubLObject)module0667.$ic90$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var54_156, var71);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0667.NIL != var72) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0667.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39019(var72);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0667.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var71));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39020((SubLObject)module0667.$ic112$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    if (module0667.NIL != module0015.$g292$.getGlobalValue()) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020(module0015.$g292$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                    final SubLObject var54_157 = module0015.$g533$.currentBinding(var71);
                    final SubLObject var75 = module0015.$g541$.currentBinding(var71);
                    final SubLObject var76 = module0015.$g539$.currentBinding(var71);
                    try {
                        module0015.$g533$.bind((SubLObject)module0667.T, var71);
                        module0015.$g541$.bind((SubLObject)module0667.T, var71);
                        module0015.$g539$.bind(module0015.f797(), var71);
                        module0642.f39069((SubLObject)module0667.$ic113$, (SubLObject)module0667.T, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020((SubLObject)module0667.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                        final SubLObject var54_158 = module0015.$g533$.currentBinding(var71);
                        try {
                            module0015.$g533$.bind((SubLObject)module0667.T, var71);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                            final SubLObject var54_159 = module0015.$g533$.currentBinding(var71);
                            try {
                                module0015.$g533$.bind((SubLObject)module0667.T, var71);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0667.$ic114$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                                final SubLObject var54_160 = module0015.$g533$.currentBinding(var71);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0667.T, var71);
                                    module0642.f39073((SubLObject)module0667.$ic115$);
                                    module0642.f39074((SubLObject)module0667.$ic116$, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
                                    f40580((SubLObject)module0667.UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var54_160, var71);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var54_159, var71);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0667.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var54_158, var71);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                        module0015.f799(module0015.$g539$.getDynamicValue(var71));
                    }
                    finally {
                        module0015.$g539$.rebind(var76, var71);
                        module0015.$g541$.rebind(var75, var71);
                        module0015.$g533$.rebind(var54_157, var71);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0667.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var54_155, var71);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0667.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var54_154, var71);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var73, var71);
        }
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40582(SubLObject var70) {
        if (var70 == module0667.UNPROVIDED) {
            var70 = (SubLObject)module0667.NIL;
        }
        final SubLObject var71 = reader.read_from_string_ignoring_errors(module0642.f39104((SubLObject)module0667.$ic98$, var70), (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
        SubLObject var72 = module0642.f39104((SubLObject)module0667.$ic100$, var70);
        final SubLObject var73 = module0642.f39104((SubLObject)module0667.$ic102$, var70);
        final SubLObject var74 = module0642.f39104((SubLObject)module0667.$ic108$, var70);
        module0667.$g5266$.setDynamicValue(var71);
        if (module0667.NIL != module0038.f2653(var72)) {
            var72 = reader.read_from_string_ignoring_errors(var72, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
        }
        if (!var72.isInteger() || !var72.numGE((SubLObject)module0667.ZERO_INTEGER) || !var72.numLE((SubLObject)module0667.$ic118$)) {
            var72 = (SubLObject)module0667.FIVE_INTEGER;
        }
        module0667.$g5267$.setDynamicValue(var72);
        module0667.$g5268$.setDynamicValue(Equality.equalp(var73, (SubLObject)module0667.$ic103$));
        if (module0667.NIL != Sequences.find(var74, (SubLObject)module0667.$ic109$, Symbols.symbol_function((SubLObject)module0667.EQUALP), (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED)) {
            module0667.$g5269$.setDynamicValue(var74);
        }
        else {
            module0667.$g5269$.setDynamicValue((SubLObject)module0667.$ic3$);
        }
        return f40579((SubLObject)module0667.UNPROVIDED);
    }
    
    public static SubLObject f40583(SubLObject var164) {
        if (var164 == module0667.UNPROVIDED) {
            var164 = (SubLObject)module0667.NIL;
        }
        final SubLThread var165 = SubLProcess.currentSubLThread();
        if (module0574.f35152().equal(module0667.$ic120$)) {
            final SubLObject var166 = (SubLObject)module0667.$ic121$;
            final SubLObject var167 = module0015.$g538$.currentBinding(var165);
            try {
                module0015.$g538$.bind((module0667.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var165))) ? module0015.$g538$.getDynamicValue(var165) : module0057.f4173((SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED), var165);
                module0642.f39020((SubLObject)module0667.$ic80$);
                module0642.f39029((SubLObject)module0667.UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var165), module0655.$g5142$.getDynamicValue(var165));
                final SubLObject var168 = module0014.f672((SubLObject)module0667.$ic81$);
                module0642.f39029((SubLObject)module0667.UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020((SubLObject)module0667.$ic82$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                if (module0667.NIL != var168) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39020(var168);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020((SubLObject)module0667.$ic83$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                module0016.f941();
                if (module0667.NIL != var166) {
                    module0642.f39029((SubLObject)module0667.UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var166);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)module0667.UNPROVIDED);
                final SubLObject var54_165 = module0015.$g535$.currentBinding(var165);
                try {
                    module0015.$g535$.bind((SubLObject)module0667.T, var165);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (module0667.NIL != module0015.$g132$.getDynamicValue(var165)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var165)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39020((SubLObject)module0667.$ic86$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                    final SubLObject var54_166 = module0015.$g533$.currentBinding(var165);
                    try {
                        module0015.$g533$.bind((SubLObject)module0667.T, var165);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020((SubLObject)module0667.$ic87$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                        final SubLObject var54_167 = module0015.$g533$.currentBinding(var165);
                        try {
                            module0015.$g533$.bind((SubLObject)module0667.T, var165);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                            module0642.f39020((SubLObject)module0667.$ic88$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                            module0642.f39020((SubLObject)module0667.$ic89$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                            module0642.f39019((SubLObject)module0667.$ic90$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var54_167, var165);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (module0667.NIL != var166) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)module0667.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                            module0642.f39019(var166);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)module0667.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                        }
                        f40584(var164);
                        module0642.f39067();
                        module0642.f39029((SubLObject)module0667.UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var54_166, var165);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)module0667.UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var54_165, var165);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)module0667.UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var167, var165);
            }
        }
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40584(SubLObject var164) {
        if (var164 == module0667.UNPROVIDED) {
            var164 = (SubLObject)module0667.NIL;
        }
        final SubLThread var165 = SubLProcess.currentSubLThread();
        if (module0574.f35152().equal(module0667.$ic120$)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var165), (SubLObject)module0667.$ic123$, (SubLObject)((module0667.NIL != module0038.f2653(var164)) ? var164 : module0667.$ic124$));
            module0656.f39804(module0574.f35152(), (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
            module0642.f39019((SubLObject)module0667.$ic125$);
            f40571((SubLObject)module0667.$ic126$, (SubLObject)module0667.NIL, (SubLObject)module0667.NIL, (SubLObject)module0667.$ic127$, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
            module0642.f39019((SubLObject)module0667.$ic128$);
            module0642.f39067();
        }
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40585(SubLObject var164) {
        if (var164 == module0667.UNPROVIDED) {
            var164 = (SubLObject)module0667.NIL;
        }
        if (module0574.f35152().equal(module0667.$ic120$)) {
            SubLObject var165 = (SubLObject)module0667.NIL;
            SubLObject var166 = (SubLObject)module0667.NIL;
            try {
                var166 = streams_high.make_private_string_output_stream();
                PrintLow.format(var166, (SubLObject)module0667.$ic129$, (SubLObject)((module0667.NIL != module0038.f2653(var164)) ? var164 : module0667.$ic124$), module0574.f35152());
                PrintLow.format(var166, (SubLObject)module0667.$ic130$);
                var165 = streams_high.get_output_stream_string(var166);
            }
            finally {
                final SubLObject var167 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0667.T);
                    streams_high.close(var166, (SubLObject)module0667.UNPROVIDED);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var167);
                }
            }
            return var165;
        }
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40586(final SubLObject var47) {
        return module0038.f2840(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0667.$ic131$), module0038.f2661(var47, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED)));
    }
    
    public static SubLObject f40587(SubLObject var170) {
        if (var170 == module0667.UNPROVIDED) {
            var170 = (SubLObject)module0667.NIL;
        }
        final SubLThread var171 = SubLProcess.currentSubLThread();
        if (module0667.NIL == var170) {
            var170 = (SubLObject)module0667.$ic132$;
        }
        final SubLObject var172 = module0656.f39832((SubLObject)module0667.$ic133$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0667.$ic134$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
        if (module0667.NIL != var172) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            module0642.f39020(var172);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
        final SubLObject var173 = module0015.$g533$.currentBinding(var171);
        try {
            module0015.$g533$.bind((SubLObject)module0667.T, var171);
            module0642.f39019(var170);
        }
        finally {
            module0015.$g533$.rebind(var173, var171);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40588(SubLObject var70) {
        if (var70 == module0667.UNPROVIDED) {
            var70 = (SubLObject)module0667.NIL;
        }
        return f40589(var70);
    }
    
    public static SubLObject f40589(SubLObject var70) {
        if (var70 == module0667.UNPROVIDED) {
            var70 = (SubLObject)module0667.NIL;
        }
        final SubLThread var71 = SubLProcess.currentSubLThread();
        if (module0667.NIL == module0018.f967()) {
            module0018.f966();
        }
        if (module0667.NIL != module0543.f33698()) {
            f40583((SubLObject)module0667.$ic141$);
        }
        else {
            final SubLObject var72 = (SubLObject)module0667.$ic142$;
            final SubLObject var73 = module0015.$g538$.currentBinding(var71);
            try {
                module0015.$g538$.bind((module0667.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var71))) ? module0015.$g538$.getDynamicValue(var71) : module0057.f4173((SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED), var71);
                module0642.f39020((SubLObject)module0667.$ic80$);
                module0642.f39029((SubLObject)module0667.UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var71), module0655.$g5142$.getDynamicValue(var71));
                final SubLObject var74 = module0014.f672((SubLObject)module0667.$ic81$);
                module0642.f39029((SubLObject)module0667.UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020((SubLObject)module0667.$ic82$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                if (module0667.NIL != var74) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39020(var74);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020((SubLObject)module0667.$ic83$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                module0016.f941();
                if (module0667.NIL != var72) {
                    module0642.f39029((SubLObject)module0667.UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var72);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)module0667.UNPROVIDED);
                final SubLObject var54_172 = module0015.$g535$.currentBinding(var71);
                try {
                    module0015.$g535$.bind((SubLObject)module0667.T, var71);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (module0667.NIL != module0015.$g132$.getDynamicValue(var71)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var71)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39020((SubLObject)module0667.$ic86$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                    final SubLObject var54_173 = module0015.$g533$.currentBinding(var71);
                    try {
                        module0015.$g533$.bind((SubLObject)module0667.T, var71);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020((SubLObject)module0667.$ic87$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                        final SubLObject var54_174 = module0015.$g533$.currentBinding(var71);
                        try {
                            module0015.$g533$.bind((SubLObject)module0667.T, var71);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                            module0642.f39020((SubLObject)module0667.$ic88$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                            module0642.f39020((SubLObject)module0667.$ic89$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                            module0642.f39019((SubLObject)module0667.$ic90$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var54_174, var71);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (module0667.NIL != var72) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)module0667.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                            module0642.f39019(var72);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)module0667.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var71));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020(module0015.$g285$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020((SubLObject)module0667.$ic112$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        if (module0667.NIL != module0015.$g292$.getGlobalValue()) {
                            module0642.f39020(module0015.$g286$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                            module0642.f39020(module0015.$g292$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                        final SubLObject var54_175 = module0015.$g533$.currentBinding(var71);
                        final SubLObject var75 = module0015.$g541$.currentBinding(var71);
                        final SubLObject var76 = module0015.$g539$.currentBinding(var71);
                        try {
                            module0015.$g533$.bind((SubLObject)module0667.T, var71);
                            module0015.$g541$.bind((SubLObject)module0667.T, var71);
                            module0015.$g539$.bind(module0015.f797(), var71);
                            module0642.f39069((SubLObject)module0667.$ic143$, (SubLObject)module0667.T, (SubLObject)module0667.UNPROVIDED);
                            module0642.f39020(module0015.$g346$.getGlobalValue());
                            module0642.f39020(module0015.$g352$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                            module0642.f39020((SubLObject)module0667.ZERO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                            final SubLObject var54_176 = module0015.$g533$.currentBinding(var71);
                            try {
                                module0015.$g533$.bind((SubLObject)module0667.T, var71);
                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                                final SubLObject var54_177 = module0015.$g533$.currentBinding(var71);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0667.T, var71);
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)module0667.$ic144$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                                    final SubLObject var54_178 = module0015.$g533$.currentBinding(var71);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0667.T, var71);
                                        module0642.f39020(module0015.$g346$.getGlobalValue());
                                        module0642.f39020(module0015.$g352$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                                        module0642.f39020((SubLObject)module0667.ZERO_INTEGER);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                                        final SubLObject var54_179 = module0015.$g533$.currentBinding(var71);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0667.T, var71);
                                            module0642.f39020(module0015.$g364$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                                            final SubLObject var54_180 = module0015.$g533$.currentBinding(var71);
                                            try {
                                                module0015.$g533$.bind((SubLObject)module0667.T, var71);
                                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                                                module0642.f39020(module0642.f39049((SubLObject)module0667.$ic70$));
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                                                final SubLObject var54_181 = module0015.$g533$.currentBinding(var71);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)module0667.T, var71);
                                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                                    module0642.f39019((SubLObject)module0667.$ic145$);
                                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                                    module0642.f39067();
                                                    module0642.f39139((SubLObject)module0667.$ic146$, (SubLObject)module0667.$ic64$, (SubLObject)module0667.$ic147$);
                                                    PrintLow.format(module0015.$g131$.getDynamicValue(var71), (SubLObject)module0667.$ic50$);
                                                    module0642.f39073((SubLObject)module0667.$ic148$);
                                                    PrintLow.format(module0015.$g131$.getDynamicValue(var71), (SubLObject)module0667.$ic50$);
                                                    module0642.f39074((SubLObject)module0667.$ic149$, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var54_181, var71);
                                                }
                                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var54_180, var71);
                                            }
                                            module0642.f39020(module0015.$g365$.getGlobalValue());
                                            module0642.f39029((SubLObject)module0667.UNPROVIDED);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var54_179, var71);
                                        }
                                        module0642.f39020(module0015.$g347$.getGlobalValue());
                                        module0642.f39020(module0015.$g346$.getGlobalValue());
                                        module0642.f39020(module0015.$g352$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                                        module0642.f39020((SubLObject)module0667.ZERO_INTEGER);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                                        final SubLObject var54_182 = module0015.$g533$.currentBinding(var71);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0667.T, var71);
                                            module0642.f39020(module0015.$g364$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                                            final SubLObject var54_183 = module0015.$g533$.currentBinding(var71);
                                            try {
                                                module0015.$g533$.bind((SubLObject)module0667.T, var71);
                                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                                                module0642.f39020(module0642.f39049((SubLObject)module0667.$ic96$));
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                                                final SubLObject var54_184 = module0015.$g533$.currentBinding(var71);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)module0667.T, var71);
                                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                                    module0642.f39019((SubLObject)module0667.$ic150$);
                                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var54_184, var71);
                                                }
                                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                                                module0642.f39020(module0642.f39049((SubLObject)module0667.$ic70$));
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                                                final SubLObject var54_185 = module0015.$g533$.currentBinding(var71);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)module0667.T, var71);
                                                    module0642.f39072((SubLObject)module0667.$ic151$, (SubLObject)module0667.$ic152$, (SubLObject)module0667.T, (SubLObject)module0667.UNPROVIDED);
                                                    module0642.f39019((SubLObject)module0667.$ic153$);
                                                    module0642.f39067();
                                                    module0642.f39072((SubLObject)module0667.$ic151$, (SubLObject)module0667.$ic154$, (SubLObject)module0667.NIL, (SubLObject)module0667.UNPROVIDED);
                                                    module0642.f39019((SubLObject)module0667.$ic155$);
                                                    module0642.f39067();
                                                    module0642.f39072((SubLObject)module0667.$ic151$, (SubLObject)module0667.$ic156$, (SubLObject)module0667.NIL, (SubLObject)module0667.UNPROVIDED);
                                                    module0642.f39019((SubLObject)module0667.$ic157$);
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var54_185, var71);
                                                }
                                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var54_183, var71);
                                            }
                                            module0642.f39020(module0015.$g365$.getGlobalValue());
                                            module0642.f39029((SubLObject)module0667.UNPROVIDED);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var54_182, var71);
                                        }
                                        module0642.f39020(module0015.$g347$.getGlobalValue());
                                        module0642.f39020(module0015.$g346$.getGlobalValue());
                                        module0642.f39020(module0015.$g352$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                                        module0642.f39020((SubLObject)module0667.ZERO_INTEGER);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                                        final SubLObject var54_186 = module0015.$g533$.currentBinding(var71);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0667.T, var71);
                                            module0642.f39020(module0015.$g364$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                                            final SubLObject var54_187 = module0015.$g533$.currentBinding(var71);
                                            try {
                                                module0015.$g533$.bind((SubLObject)module0667.T, var71);
                                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                                                module0642.f39020(module0642.f39049((SubLObject)module0667.$ic70$));
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                                                final SubLObject var54_188 = module0015.$g533$.currentBinding(var71);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)module0667.T, var71);
                                                    module0642.f39068((SubLObject)module0667.$ic158$, (SubLObject)module0667.$ic103$, module0018.$g689$.getDynamicValue(var71), (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
                                                    PrintLow.format(module0015.$g131$.getDynamicValue(var71), (SubLObject)module0667.$ic159$);
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var54_188, var71);
                                                }
                                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var54_187, var71);
                                            }
                                            module0642.f39020(module0015.$g365$.getGlobalValue());
                                            module0642.f39029((SubLObject)module0667.UNPROVIDED);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var54_186, var71);
                                        }
                                        module0642.f39020(module0015.$g347$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var54_178, var71);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var54_177, var71);
                                }
                                module0642.f39020(module0015.$g365$.getGlobalValue());
                                module0642.f39029((SubLObject)module0667.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var54_176, var71);
                            }
                            module0642.f39020(module0015.$g347$.getGlobalValue());
                            module0642.f39067();
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            PrintLow.format(module0015.$g131$.getDynamicValue(var71), (SubLObject)module0667.$ic160$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            PrintLow.format(module0015.$g131$.getDynamicValue(var71), (SubLObject)module0667.$ic161$);
                            module0642.f39067();
                            module0642.f39067();
                            PrintLow.format(module0015.$g131$.getDynamicValue(var71), (SubLObject)module0667.$ic162$);
                            module0015.f799(module0015.$g539$.getDynamicValue(var71));
                        }
                        finally {
                            module0015.$g539$.rebind(var76, var71);
                            module0015.$g541$.rebind(var75, var71);
                            module0015.$g533$.rebind(var54_175, var71);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)module0667.UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var54_173, var71);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)module0667.UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var54_172, var71);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)module0667.UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var73, var71);
            }
        }
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40568(final SubLObject var90, final SubLObject var189) {
        final SubLThread var190 = SubLProcess.currentSubLThread();
        final SubLObject var191 = module0015.$g538$.currentBinding(var190);
        try {
            module0015.$g538$.bind((module0667.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var190))) ? module0015.$g538$.getDynamicValue(var190) : module0057.f4173((SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED), var190);
            module0642.f39020((SubLObject)module0667.$ic80$);
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var190), module0655.$g5142$.getDynamicValue(var190));
            final SubLObject var192 = module0014.f672((SubLObject)module0667.$ic81$);
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            module0642.f39020((SubLObject)module0667.$ic82$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            if (module0667.NIL != var192) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020(var192);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            module0642.f39020((SubLObject)module0667.$ic83$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
            module0016.f941();
            if (module0667.NIL != var90) {
                module0642.f39029((SubLObject)module0667.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var90);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
            final SubLObject var54_190 = module0015.$g535$.currentBinding(var190);
            try {
                module0015.$g535$.bind((SubLObject)module0667.T, var190);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0667.NIL != module0015.$g132$.getDynamicValue(var190)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var190)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020((SubLObject)module0667.$ic86$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                final SubLObject var54_191 = module0015.$g533$.currentBinding(var190);
                try {
                    module0015.$g533$.bind((SubLObject)module0667.T, var190);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39020((SubLObject)module0667.$ic87$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                    final SubLObject var54_192 = module0015.$g533$.currentBinding(var190);
                    try {
                        module0015.$g533$.bind((SubLObject)module0667.T, var190);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020((SubLObject)module0667.$ic88$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020((SubLObject)module0667.$ic89$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39019((SubLObject)module0667.$ic90$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var54_192, var190);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0667.NIL != var90) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0667.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39019(var90);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0667.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var190));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                    final SubLObject var54_193 = module0015.$g533$.currentBinding(var190);
                    final SubLObject var193 = module0015.$g541$.currentBinding(var190);
                    final SubLObject var194 = module0015.$g539$.currentBinding(var190);
                    try {
                        module0015.$g533$.bind((SubLObject)module0667.T, var190);
                        module0015.$g541$.bind((SubLObject)module0667.T, var190);
                        module0015.$g539$.bind(module0015.f797(), var190);
                        module0656.f39790((SubLObject)module0667.$ic91$, (SubLObject)module0667.$ic92$);
                        module0642.f39019(var189);
                        module0642.f39026((SubLObject)module0667.TWO_INTEGER);
                        module0015.f799(module0015.$g539$.getDynamicValue(var190));
                    }
                    finally {
                        module0015.$g539$.rebind(var194, var190);
                        module0015.$g541$.rebind(var193, var190);
                        module0015.$g533$.rebind(var54_193, var190);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0667.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var54_191, var190);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0667.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var54_190, var190);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var191, var190);
        }
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40590(final SubLObject var70) {
        final SubLObject var71 = module0038.f2735(module0642.f39104((SubLObject)module0667.$ic146$, var70));
        final SubLObject var72 = Equality.equalp((SubLObject)module0667.$ic103$, module0642.f39104((SubLObject)module0667.$ic158$, var70));
        final SubLObject var73 = reader.read_from_string_ignoring_errors(module0642.f39104((SubLObject)module0667.$ic151$, var70), (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
        final SubLObject var74 = Filesys.probe_file(var71);
        if (module0667.NIL != var74) {
            final SubLObject var75 = module0574.f35219(var71, var72, var73, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
            if (var75.isInteger()) {
                f40568((SubLObject)module0667.$ic164$, PrintLow.format((SubLObject)module0667.NIL, (SubLObject)module0667.$ic165$, new SubLObject[] { var71, var75, module0018.f967() }));
            }
            else {
                f40568((SubLObject)module0667.$ic166$, PrintLow.format((SubLObject)module0667.NIL, (SubLObject)module0667.$ic167$, var71, module0018.f967()));
            }
        }
        else {
            f40568((SubLObject)module0667.$ic168$, PrintLow.format((SubLObject)module0667.NIL, (SubLObject)module0667.$ic169$, var71));
        }
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40591(final SubLObject var199) {
        final SubLThread var200 = SubLProcess.currentSubLThread();
        final SubLObject var201 = (SubLObject)module0667.$ic168$;
        final SubLObject var202 = module0015.$g538$.currentBinding(var200);
        try {
            module0015.$g538$.bind((module0667.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var200))) ? module0015.$g538$.getDynamicValue(var200) : module0057.f4173((SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED), var200);
            module0642.f39020((SubLObject)module0667.$ic80$);
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var200), module0655.$g5142$.getDynamicValue(var200));
            final SubLObject var203 = module0014.f672((SubLObject)module0667.$ic81$);
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            module0642.f39020((SubLObject)module0667.$ic82$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            if (module0667.NIL != var203) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020(var203);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            module0642.f39020((SubLObject)module0667.$ic83$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
            module0016.f941();
            if (module0667.NIL != var201) {
                module0642.f39029((SubLObject)module0667.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var201);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
            final SubLObject var54_200 = module0015.$g535$.currentBinding(var200);
            try {
                module0015.$g535$.bind((SubLObject)module0667.T, var200);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0667.NIL != module0015.$g132$.getDynamicValue(var200)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var200)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39020((SubLObject)module0667.$ic86$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                final SubLObject var54_201 = module0015.$g533$.currentBinding(var200);
                try {
                    module0015.$g533$.bind((SubLObject)module0667.T, var200);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39020((SubLObject)module0667.$ic87$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                    final SubLObject var54_202 = module0015.$g533$.currentBinding(var200);
                    try {
                        module0015.$g533$.bind((SubLObject)module0667.T, var200);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020((SubLObject)module0667.$ic88$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020((SubLObject)module0667.$ic89$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39019((SubLObject)module0667.$ic90$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var54_202, var200);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0667.NIL != var201) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0667.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                        module0642.f39019(var201);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0667.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0667.UNPROVIDED);
                    }
                    module0642.f39019((SubLObject)module0667.$ic171$);
                    module0642.f39019(var199);
                    module0642.f39019((SubLObject)module0667.$ic172$);
                    module0642.f39067();
                    module0642.f39067();
                    module0642.f39029((SubLObject)module0667.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var54_201, var200);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0667.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var54_200, var200);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0667.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var202, var200);
        }
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40592(SubLObject var70) {
        if (var70 == module0667.UNPROVIDED) {
            var70 = (SubLObject)module0667.NIL;
        }
        final SubLThread var71 = SubLProcess.currentSubLThread();
        if (module0667.$ic174$ == module0018.$g707$.getDynamicValue(var71)) {
            module0018.$g707$.setDynamicValue((SubLObject)module0667.$ic175$, var71);
        }
        else {
            module0018.$g707$.setDynamicValue((SubLObject)module0667.$ic174$, var71);
        }
        return f40579((SubLObject)module0667.UNPROVIDED);
    }
    
    public static SubLObject f40593() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)((module0667.$ic174$ == module0018.$g707$.getDynamicValue(var2)) ? module0667.$ic177$ : module0667.$ic178$);
    }
    
    public static SubLObject f40594(SubLObject var70) {
        if (var70 == module0667.UNPROVIDED) {
            var70 = (SubLObject)module0667.NIL;
        }
        module0770.f49102((SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED);
        return f40579((SubLObject)module0667.UNPROVIDED);
    }
    
    public static SubLObject f40595(SubLObject var70) {
        if (var70 == module0667.UNPROVIDED) {
            var70 = (SubLObject)module0667.NIL;
        }
        f40596();
        return f40579((SubLObject)module0667.UNPROVIDED);
    }
    
    public static SubLObject f40596() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0667.NIL != module0067.f4852(module0655.$g5131$.getDynamicValue(var2))) {
            module0067.f4881(module0655.$g5131$.getDynamicValue(var2));
        }
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40597(SubLObject var70) {
        if (var70 == module0667.UNPROVIDED) {
            var70 = (SubLObject)module0667.NIL;
        }
        module0593.f36268((SubLObject)module0667.TWO_INTEGER);
        return module0678.f41424((SubLObject)module0667.UNPROVIDED);
    }
    
    public static SubLObject f40598(SubLObject var70) {
        if (var70 == module0667.UNPROVIDED) {
            var70 = (SubLObject)module0667.NIL;
        }
        module0593.f36279((SubLObject)module0667.TWO_INTEGER);
        return module0678.f41424((SubLObject)module0667.UNPROVIDED);
    }
    
    public static SubLObject f40599(SubLObject var70) {
        if (var70 == module0667.UNPROVIDED) {
            var70 = (SubLObject)module0667.NIL;
        }
        module0593.f36281((SubLObject)module0667.TWO_INTEGER);
        return module0678.f41424((SubLObject)module0667.UNPROVIDED);
    }
    
    public static SubLObject f40600() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40542", "S#44664", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40543", "S#44665", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40544", "S#44666", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40545", "S#44667", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40546", "S#44668", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40547", "S#44669", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40548", "S#44670", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40549", "S#44671", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40550", "S#44672", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40551", "S#44673", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40552", "S#44674", 5, 8, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40553", "S#44675", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40554", "S#44676", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40555", "S#44677", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40556", "S#44678", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40557", "S#44679", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40558", "S#44680", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40559", "S#44681", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40560", "S#44682", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40561", "S#44683", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40562", "S#44684", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40563", "S#44685", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40564", "S#44686", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40565", "S#44687", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40566", "S#44688", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40567", "NAV-MALFORMED-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40569", "S#44689", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40570", "S#44690", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40571", "S#44691", 1, 8, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40572", "S#44692", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40573", "S#44693", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40574", "S#44694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40575", "S#44695", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40576", "COLUMNIZE-BY-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40577", "COLUMNIZE-BY-CATEGORIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40578", "S#44696", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40579", "CYC-NAVIGATOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40580", "FORMAT-NAVIGATOR-PREFERENCES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40581", "SET-NAVIGATOR-PREFERENCES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40582", "HANDLE-NAVIGATOR-PREFERENCES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40583", "GUEST-WARN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40584", "S#44697", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40585", "S#44698", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40586", "S#44699", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40587", "S#44700", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40588", "HTML-LOAD-TRANSCRIPT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40589", "CB-LOAD-TRANSCRIPT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40568", "S#44701", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40590", "HANDLE-LOAD-TRANSCRIPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40591", "REPORT-FILE-NOT-AVAILABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40592", "MAYBE-USE-ENGLISH", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40593", "S#44702", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40594", "CLEAR-PG-CACHES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40595", "CYC-NAV-CLEAR-EL-FORMULAS-CACHE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40596", "S#44703", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40597", "HTML-START-AGENDA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40598", "HTML-HALT-AGENDA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0667", "f40599", "HTML-RESTART-AGENDA", 0, 1, false);
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40601() {
        module0667.$g5265$ = SubLFiles.defparameter("S#44704", (SubLObject)module0667.NIL);
        module0667.$g5266$ = SubLFiles.defparameter("S#44705", (SubLObject)module0667.THREE_INTEGER);
        module0667.$g5267$ = SubLFiles.defparameter("S#44706", (SubLObject)module0667.FIVE_INTEGER);
        module0667.$g5268$ = SubLFiles.defparameter("S#44707", (SubLObject)module0667.T);
        module0667.$g5269$ = SubLFiles.defparameter("S#44708", (SubLObject)module0667.$ic3$);
        module0667.$g5270$ = SubLFiles.defparameter("S#44709", (SubLObject)module0667.ZERO_INTEGER);
        module0667.$g5271$ = SubLFiles.deflexical("S#44710", (SubLObject)module0667.TWENTY_INTEGER);
        module0667.$g5272$ = SubLFiles.deflexical("S#44711", (module0667.NIL != Symbols.boundp((SubLObject)module0667.$ic6$)) ? module0667.$g5272$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0667.$ic7$, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED));
        module0667.$g5273$ = SubLFiles.deflexical("S#44712", (module0667.NIL != Symbols.boundp((SubLObject)module0667.$ic8$)) ? module0667.$g5273$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0667.$ic9$, (SubLObject)module0667.UNPROVIDED, (SubLObject)module0667.UNPROVIDED));
        module0667.$g5274$ = SubLFiles.deflexical("S#44713", (SubLObject)module0667.$ic10$);
        module0667.$g5275$ = SubLFiles.deflexical("S#44714", (SubLObject)module0667.$ic11$);
        module0667.$g5276$ = SubLFiles.defparameter("S#44715", (SubLObject)module0667.$ic12$);
        module0667.$g5277$ = SubLFiles.defparameter("S#44716", (SubLObject)module0667.$ic54$);
        return (SubLObject)module0667.NIL;
    }
    
    public static SubLObject f40602() {
        module0012.f441((SubLObject)module0667.$ic0$);
        module0012.f441((SubLObject)module0667.$ic1$);
        module0012.f441((SubLObject)module0667.$ic2$);
        module0012.f441((SubLObject)module0667.$ic4$);
        module0012.f441((SubLObject)module0667.$ic5$);
        module0003.f57((SubLObject)module0667.$ic6$);
        module0003.f57((SubLObject)module0667.$ic8$);
        module0015.f873((SubLObject)module0667.$ic63$);
        module0015.f873((SubLObject)module0667.$ic75$);
        module0015.f873((SubLObject)module0667.$ic76$);
        module0015.f873((SubLObject)module0667.$ic95$);
        module0015.f873((SubLObject)module0667.$ic110$);
        module0015.f873((SubLObject)module0667.$ic117$);
        module0015.f873((SubLObject)module0667.$ic119$);
        module0015.f873((SubLObject)module0667.$ic122$);
        module0656.f39840((SubLObject)module0667.$ic135$, (SubLObject)module0667.$ic136$, (SubLObject)module0667.ONE_INTEGER);
        module0656.f39819((SubLObject)module0667.$ic135$, (SubLObject)module0667.$ic137$, (SubLObject)module0667.$ic138$, (SubLObject)module0667.$ic139$);
        module0015.f873((SubLObject)module0667.$ic140$);
        module0015.f873((SubLObject)module0667.$ic163$);
        module0015.f873((SubLObject)module0667.$ic170$);
        module0015.f873((SubLObject)module0667.$ic173$);
        module0015.f873((SubLObject)module0667.$ic176$);
        module0015.f873((SubLObject)module0667.$ic179$);
        module0015.f873((SubLObject)module0667.$ic180$);
        module0015.f873((SubLObject)module0667.$ic181$);
        module0015.f873((SubLObject)module0667.$ic182$);
        module0015.f873((SubLObject)module0667.$ic183$);
        return (SubLObject)module0667.NIL;
    }
    
    public void declareFunctions() {
        f40600();
    }
    
    public void initializeVariables() {
        f40601();
    }
    
    public void runTopLevelForms() {
        f40602();
    }
    
    static {
        me = (SubLFile)new module0667();
        module0667.$g5265$ = null;
        module0667.$g5266$ = null;
        module0667.$g5267$ = null;
        module0667.$g5268$ = null;
        module0667.$g5269$ = null;
        module0667.$g5270$ = null;
        module0667.$g5271$ = null;
        module0667.$g5272$ = null;
        module0667.$g5273$ = null;
        module0667.$g5274$ = null;
        module0667.$g5275$ = null;
        module0667.$g5276$ = null;
        module0667.$g5277$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#44705", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#44706", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#44707", "CYC");
        $ic3$ = SubLObjectFactory.makeString("single");
        $ic4$ = SubLObjectFactory.makeSymbol("S#44708", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#44709", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#44711", "CYC");
        $ic7$ = SubLObjectFactory.makeInteger(100);
        $ic8$ = SubLObjectFactory.makeSymbol("S#44712", "CYC");
        $ic9$ = SubLObjectFactory.makeInteger(50);
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("IMAGE"));
        $ic11$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BROWSING-AND-EDITING"), (SubLObject)SubLObjectFactory.makeString("Browsing and Editing"), (SubLObject)module0667.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMMUNICATION-MODES"), (SubLObject)SubLObjectFactory.makeString("Communication Modes"), (SubLObject)module0667.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYC-MAIN-MENU"), (SubLObject)SubLObjectFactory.makeString("Cyc Main Menu"), (SubLObject)module0667.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYC-SYSTEM"), (SubLObject)SubLObjectFactory.makeString("Cyc System"), (SubLObject)module0667.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FILE-HANDLING"), (SubLObject)SubLObjectFactory.makeString("File Handling"), (SubLObject)module0667.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE"), (SubLObject)SubLObjectFactory.makeString("Inference"), (SubLObject)module0667.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NL-TOOLS"), (SubLObject)SubLObjectFactory.makeString("NL Tools"), (SubLObject)module0667.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFO-RETRIEVAL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HIERARCHY-BROWSER")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TELL-ASK")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OTHER")) });
        $ic12$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LINK-TYPE"), (SubLObject)module0667.ZERO_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CATEGORIES"), (SubLObject)module0667.ONE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("HREF-BASE-STRING"), (SubLObject)module0667.TWO_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NUMBER-OF-ARGS"), (SubLObject)module0667.THREE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("HREF-TAGS"), (SubLObject)module0667.FOUR_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("TARGET"), (SubLObject)module0667.FIVE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LINK-TEXT"), (SubLObject)module0667.SIX_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("IMAGE-SRC"), (SubLObject)module0667.SEVEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ISMAP"), (SubLObject)module0667.EIGHT_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ALT"), (SubLObject)module0667.NINE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ALIGN"), (SubLObject)module0667.TEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("BORDER"), (SubLObject)module0667.ELEVEN_INTEGER) });
        $ic13$ = SubLObjectFactory.makeSymbol("CAR");
        $ic14$ = SubLObjectFactory.makeKeyword("REPLACE");
        $ic15$ = SubLObjectFactory.makeString("No vector in ~s for the link key ~s");
        $ic16$ = SubLObjectFactory.makeString("No index in ~s for the definition key ~s");
        $ic17$ = SubLObjectFactory.makeSymbol("S#44715", "CYC");
        $ic18$ = SubLObjectFactory.makeKeyword("CONS");
        $ic19$ = SubLObjectFactory.makeKeyword("ADJOIN");
        $ic20$ = SubLObjectFactory.makeKeyword("APPEND");
        $ic21$ = SubLObjectFactory.makeKeyword("NCONC");
        $ic22$ = SubLObjectFactory.makeKeyword("UNION");
        $ic23$ = SubLObjectFactory.makeKeyword("INTERSECTION");
        $ic24$ = SubLObjectFactory.makeString("~s is not a supported method for ~s");
        $ic25$ = SubLObjectFactory.makeSymbol("S#44671", "CYC");
        $ic26$ = SubLObjectFactory.makeString("~s");
        $ic27$ = SubLObjectFactory.makeString("~%~a~a . ~s");
        $ic28$ = SubLObjectFactory.makeString("in def-navigator-link for ~s: ~s must be one of these, ~s, but is this: ~s");
        $ic29$ = SubLObjectFactory.makeSymbol("S#25412", "CYC");
        $ic30$ = SubLObjectFactory.makeString("in def-navigator-link for ~s: ~s must include one of these, and may include only these: ~s");
        $ic31$ = SubLObjectFactory.makeSymbol("S#1988", "CYC");
        $ic32$ = SubLObjectFactory.makeString("in def-navigator-link for ~s: ~s must be an integer, but is ~s");
        $ic33$ = SubLObjectFactory.makeSymbol("S#44717", "CYC");
        $ic34$ = SubLObjectFactory.makeString("in def-navigator-link for ~s: ~s must be a specified, and should be form which evaluates to a string, but is ~s");
        $ic35$ = SubLObjectFactory.makeSymbol("S#44718", "CYC");
        $ic36$ = SubLObjectFactory.makeKeyword("LINK-TYPE");
        $ic37$ = SubLObjectFactory.makeKeyword("CATEGORIES");
        $ic38$ = SubLObjectFactory.makeKeyword("HREF-BASE-STRING");
        $ic39$ = SubLObjectFactory.makeKeyword("NUMBER-OF-ARGS");
        $ic40$ = SubLObjectFactory.makeKeyword("TARGET");
        $ic41$ = SubLObjectFactory.makeKeyword("LINK-TEXT");
        $ic42$ = SubLObjectFactory.makeKeyword("HREF-TAGS");
        $ic43$ = SubLObjectFactory.makeKeyword("IMAGE-SRC");
        $ic44$ = SubLObjectFactory.makeKeyword("ISMAP");
        $ic45$ = SubLObjectFactory.makeKeyword("ALT");
        $ic46$ = SubLObjectFactory.makeKeyword("ALIGN");
        $ic47$ = SubLObjectFactory.makeKeyword("BORDER");
        $ic48$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LINK-TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("ALT"), (SubLObject)SubLObjectFactory.makeKeyword("HREF-BASE-STRING"));
        $ic49$ = SubLObjectFactory.makeString("1");
        $ic50$ = SubLObjectFactory.makeString(" ");
        $ic51$ = SubLObjectFactory.makeSymbol("STRING<");
        $ic52$ = SubLObjectFactory.makeSymbol("S#44678", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#44677", "CYC");
        $ic54$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SPLICE-IN-CGI-PROGRAM"), (SubLObject)SubLObjectFactory.makeSymbol("S#44680", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("STRING-IS-RELATIVE-URL"), (SubLObject)SubLObjectFactory.makeSymbol("S#44681", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("HREF-IS-BASE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("S#44682", "CYC")));
        $ic55$ = SubLObjectFactory.makeString("No link text found for ~s in call to ~s");
        $ic56$ = SubLObjectFactory.makeSymbol("S#44684", "CYC");
        $ic57$ = SubLObjectFactory.makeKeyword("TEXT");
        $ic58$ = SubLObjectFactory.makeKeyword("IMAGE");
        $ic59$ = SubLObjectFactory.makeKeyword("RED");
        $ic60$ = SubLObjectFactory.makeString("Error: ~a must be one of ~s, but is not.");
        $ic61$ = SubLObjectFactory.makeString("Malformed Navigator Link");
        $ic62$ = SubLObjectFactory.makeString("The navigator link ~s is malformed.");
        $ic63$ = SubLObjectFactory.makeSymbol("NAV-MALFORMED-LINK");
        $ic64$ = SubLObjectFactory.makeString("");
        $ic65$ = SubLObjectFactory.makeString("~a?nav-malformed-link&~s");
        $ic66$ = SubLObjectFactory.makeSymbol("FORMAT");
        $ic67$ = SubLObjectFactory.makeString("~a?~a");
        $ic68$ = SubLObjectFactory.makeString("cg");
        $ic69$ = ConsesLow.list((SubLObject)module0667.ONE_INTEGER, (SubLObject)module0667.TWO_INTEGER, (SubLObject)module0667.THREE_INTEGER, (SubLObject)module0667.FOUR_INTEGER);
        $ic70$ = SubLObjectFactory.makeString("left");
        $ic71$ = SubLObjectFactory.makeString("top");
        $ic72$ = SubLObjectFactory.makeString("double");
        $ic73$ = SubLObjectFactory.makeString("Untitled Category!");
        $ic74$ = SubLObjectFactory.makeSymbol("S#44692", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("COLUMNIZE-BY-LINKS");
        $ic76$ = SubLObjectFactory.makeSymbol("COLUMNIZE-BY-CATEGORIES");
        $ic77$ = SubLObjectFactory.makeSymbol("THIRD");
        $ic78$ = SubLObjectFactory.makeSymbol("S#44693", "CYC");
        $ic79$ = SubLObjectFactory.makeString("Cyc Navigator");
        $ic80$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic81$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic82$ = SubLObjectFactory.makeString("stylesheet");
        $ic83$ = SubLObjectFactory.makeString("text/css");
        $ic84$ = SubLObjectFactory.makeKeyword("SHA1");
        $ic85$ = SubLObjectFactory.makeString("text/javascript");
        $ic86$ = SubLObjectFactory.makeString("yui-skin-sam");
        $ic87$ = SubLObjectFactory.makeString("reloadFrameButton");
        $ic88$ = SubLObjectFactory.makeString("button");
        $ic89$ = SubLObjectFactory.makeString("reload");
        $ic90$ = SubLObjectFactory.makeString("Refresh Frames");
        $ic91$ = SubLObjectFactory.makeKeyword("SELF");
        $ic92$ = SubLObjectFactory.makeString("Back");
        $ic93$ = SubLObjectFactory.makeString("There are no Cyc Navigator links to display.");
        $ic94$ = SubLObjectFactory.makeString("Go Back");
        $ic95$ = SubLObjectFactory.makeSymbol("CYC-NAVIGATOR");
        $ic96$ = SubLObjectFactory.makeString("right");
        $ic97$ = SubLObjectFactory.makeString("Number of columns: ");
        $ic98$ = SubLObjectFactory.makeString("column-number");
        $ic99$ = SubLObjectFactory.makeString("Width between columns: ");
        $ic100$ = SubLObjectFactory.makeString("column-padding");
        $ic101$ = SubLObjectFactory.makeString("Link category arrangement: ");
        $ic102$ = SubLObjectFactory.makeString("columnize-by-category");
        $ic103$ = SubLObjectFactory.makeString("yes");
        $ic104$ = SubLObjectFactory.makeString(" one column per category");
        $ic105$ = SubLObjectFactory.makeString("no");
        $ic106$ = SubLObjectFactory.makeString(" multiple columns per category");
        $ic107$ = SubLObjectFactory.makeString("Line spacing: ");
        $ic108$ = SubLObjectFactory.makeString("line-spacing");
        $ic109$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("single"), (SubLObject)SubLObjectFactory.makeString("double"));
        $ic110$ = SubLObjectFactory.makeSymbol("FORMAT-NAVIGATOR-PREFERENCES");
        $ic111$ = SubLObjectFactory.makeString("Cyc Navigator Preferences");
        $ic112$ = SubLObjectFactory.makeString("post");
        $ic113$ = SubLObjectFactory.makeString("handle-navigator-preferences");
        $ic114$ = SubLObjectFactory.makeString("middle");
        $ic115$ = SubLObjectFactory.makeString("Current Values");
        $ic116$ = SubLObjectFactory.makeString("Update");
        $ic117$ = SubLObjectFactory.makeSymbol("SET-NAVIGATOR-PREFERENCES");
        $ic118$ = SubLObjectFactory.makeInteger(200);
        $ic119$ = SubLObjectFactory.makeSymbol("HANDLE-NAVIGATOR-PREFERENCES");
        $ic120$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Guest"));
        $ic121$ = SubLObjectFactory.makeString("Please Login Now");
        $ic122$ = SubLObjectFactory.makeSymbol("GUEST-WARN");
        $ic123$ = SubLObjectFactory.makeString("Sorry, ~a cannot be used by people logged in as ");
        $ic124$ = SubLObjectFactory.makeString("this facility");
        $ic125$ = SubLObjectFactory.makeString(".  Failure to login using your unique name might cause your actions to interfere with those of other users.  Please ");
        $ic126$ = SubLObjectFactory.makeKeyword("CB-LOGIN");
        $ic127$ = SubLObjectFactory.makeString("login");
        $ic128$ = SubLObjectFactory.makeString(" using your real name now.");
        $ic129$ = SubLObjectFactory.makeString("Sorry, ~a cannot be used by people logged in as ~S");
        $ic130$ = SubLObjectFactory.makeString(".  Failure to login using your unique name might cause your actions to interfere with those of other users.  Please login using your real name now.");
        $ic131$ = SubLObjectFactory.makeSymbol("STRING-CAPITALIZE");
        $ic132$ = SubLObjectFactory.makeString("Load Transcript");
        $ic133$ = SubLObjectFactory.makeKeyword("MAIN");
        $ic134$ = SubLObjectFactory.makeString("cb-load-transcript");
        $ic135$ = SubLObjectFactory.makeKeyword("LOAD-TRANSCRIPT");
        $ic136$ = SubLObjectFactory.makeSymbol("S#44700", "CYC");
        $ic137$ = SubLObjectFactory.makeString("Transcript Load");
        $ic138$ = SubLObjectFactory.makeString("TLoad");
        $ic139$ = SubLObjectFactory.makeString("Load transcript file");
        $ic140$ = SubLObjectFactory.makeSymbol("HTML-LOAD-TRANSCRIPT");
        $ic141$ = SubLObjectFactory.makeString("the Load Transcript File page");
        $ic142$ = SubLObjectFactory.makeString("Load Transcript File");
        $ic143$ = SubLObjectFactory.makeString("handle-load-transcript");
        $ic144$ = SubLObjectFactory.makeString("center");
        $ic145$ = SubLObjectFactory.makeString("Pathname:");
        $ic146$ = SubLObjectFactory.makeString("load_file");
        $ic147$ = SubLObjectFactory.makeInteger(40);
        $ic148$ = SubLObjectFactory.makeString("Clear");
        $ic149$ = SubLObjectFactory.makeString("Load");
        $ic150$ = SubLObjectFactory.makeString("Destination queue: ");
        $ic151$ = SubLObjectFactory.makeString("queue");
        $ic152$ = SubLObjectFactory.makeString(":aux");
        $ic153$ = SubLObjectFactory.makeString(" :AUXILIARY");
        $ic154$ = SubLObjectFactory.makeString(":local");
        $ic155$ = SubLObjectFactory.makeString(" :LOCAL");
        $ic156$ = SubLObjectFactory.makeString(":none");
        $ic157$ = SubLObjectFactory.makeString(" :NONE");
        $ic158$ = SubLObjectFactory.makeString("transcript");
        $ic159$ = SubLObjectFactory.makeString(" Transcript unenqueued (:NONE) operations");
        $ic160$ = SubLObjectFactory.makeString("READ THIS BEFORE LOADING A TRANSCRIPT FILE: ");
        $ic161$ = SubLObjectFactory.makeString("The possible values for the destination queue -- the place newly-loaded transcript operations are to be put for processing -- are :AUXILIARY, :LOCAL, and :NONE.  If you choose :AUXILIARY (the default), newly-loaded operations will be put in the *auxiliary-queue* and processed.  They will not be put in a (new) transcript file after they are processed.  If you choose :LOCAL, newly-loaded operations will be put in the *local-queue* and processed.  They will be put on the *transcript-queue* after they are processed, and will be saved in a new transcript file if you are in a communication mode which allows this.  If you choose :NONE, operations will simply be unencapsulated and evaluated in your local Cyc image.  They will not be put in any queue.  If you choose :NONE, and you want to have the newly-loaded operations saved in a new trancsript file, select the option \"Transcript unenqueued (:NONE) operations\".");
        $ic162$ = SubLObjectFactory.makeString("Loading a transcript file may have unintended consequences if you do not understand what you are doing.  Please ask an experienced Cyclist for advice if you still do not understand what the choices above mean.");
        $ic163$ = SubLObjectFactory.makeSymbol("CB-LOAD-TRANSCRIPT");
        $ic164$ = SubLObjectFactory.makeString("Transcript File Loaded");
        $ic165$ = SubLObjectFactory.makeString("The file ~s containing ~s operations was successfully loaded into the Cyc image ~a.");
        $ic166$ = SubLObjectFactory.makeString("Transcript File Problem");
        $ic167$ = SubLObjectFactory.makeString("The file ~s exists, but no operations were loaded into the Cyc image ~a.");
        $ic168$ = SubLObjectFactory.makeString("File Not Available");
        $ic169$ = SubLObjectFactory.makeString("The file ~s cannot be accessed.  Make sure that the file exists, or check to see if there is a file access permission problem.");
        $ic170$ = SubLObjectFactory.makeSymbol("HANDLE-LOAD-TRANSCRIPT");
        $ic171$ = SubLObjectFactory.makeString("The file ");
        $ic172$ = SubLObjectFactory.makeString(" does not exist, or cannot be accessed.  Make sure that the file exists, or check to see if there is a file access permission problem.");
        $ic173$ = SubLObjectFactory.makeSymbol("REPORT-FILE-NOT-AVAILABLE");
        $ic174$ = SubLObjectFactory.makeKeyword("CYCL");
        $ic175$ = SubLObjectFactory.makeKeyword("NL");
        $ic176$ = SubLObjectFactory.makeSymbol("MAYBE-USE-ENGLISH");
        $ic177$ = SubLObjectFactory.makeString("Show Assertions in English");
        $ic178$ = SubLObjectFactory.makeString("Show Assertions in CycL");
        $ic179$ = SubLObjectFactory.makeSymbol("CLEAR-PG-CACHES");
        $ic180$ = SubLObjectFactory.makeSymbol("CYC-NAV-CLEAR-EL-FORMULAS-CACHE");
        $ic181$ = SubLObjectFactory.makeSymbol("HTML-START-AGENDA");
        $ic182$ = SubLObjectFactory.makeSymbol("HTML-HALT-AGENDA");
        $ic183$ = SubLObjectFactory.makeSymbol("HTML-RESTART-AGENDA");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0667.class
	Total time: 1592 ms
	
	Decompiled with Procyon 0.5.32.
*/