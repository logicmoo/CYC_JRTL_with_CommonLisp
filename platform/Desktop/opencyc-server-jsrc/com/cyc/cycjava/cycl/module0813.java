package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0813 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0813";
    public static final String myFingerPrint = "4af380de2912de634453053eaf80a214b5019dfbf53379d3634ba50caea6e095";
    private static SubLSymbol $g6449$;
    private static SubLSymbol $g6450$;
    private static SubLSymbol $g6451$;
    public static SubLSymbol $g6452$;
    private static SubLSymbol $g6453$;
    public static SubLSymbol $g6454$;
    public static SubLSymbol $g6455$;
    private static SubLSymbol $g6456$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
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
    private static final SubLSymbol $ic34$;
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
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLInteger $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLInteger $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLList $ic75$;
    private static final SubLList $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    private static final SubLString $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLList $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLList $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLString $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLString $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLString $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLList $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLString $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLString $ic127$;
    private static final SubLList $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLString $ic131$;
    private static final SubLString $ic132$;
    private static final SubLString $ic133$;
    private static final SubLString $ic134$;
    private static final SubLString $ic135$;
    private static final SubLString $ic136$;
    private static final SubLString $ic137$;
    private static final SubLString $ic138$;
    private static final SubLList $ic139$;
    private static final SubLList $ic140$;
    private static final SubLString $ic141$;
    private static final SubLString $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLString $ic145$;
    private static final SubLString $ic146$;
    private static final SubLString $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLString $ic151$;
    private static final SubLString $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLList $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLString $ic156$;
    
    
    public static SubLObject f52030() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0813.$g6449$.getDynamicValue(var1);
    }
    
    public static SubLObject f52031(final SubLObject var2) {
        return module0035.f2169(var2, module0813.$g6450$.getGlobalValue());
    }
    
    public static SubLObject f52032() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0813.$g6451$.getDynamicValue(var1);
    }
    
    public static SubLObject f52033() {
        final SubLObject var3 = f52032();
        if (module0813.NIL != var3) {
            return f52034(var3);
        }
        return (SubLObject)module0813.NIL;
    }
    
    public static SubLObject f52035() {
        final SubLObject var3 = f52032();
        return (SubLObject)((module0813.NIL != var3) ? f52036(var3) : module0813.$ic1$);
    }
    
    public static SubLObject f52037(final SubLObject var4, final SubLObject var5) {
        f52038(var4, var5, (SubLObject)module0813.ZERO_INTEGER);
        return (SubLObject)module0813.NIL;
    }
    
    public static SubLObject f52039(final SubLObject var4) {
        return (SubLObject)((var4.getClass() == $sX56856_native.class) ? module0813.T : module0813.NIL);
    }
    
    public static SubLObject f52040(final SubLObject var4) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.getField2();
    }
    
    public static SubLObject f52041(final SubLObject var4) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.getField3();
    }
    
    public static SubLObject f52042(final SubLObject var4) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.getField4();
    }
    
    public static SubLObject f52043(final SubLObject var4) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.getField5();
    }
    
    public static SubLObject f52044(final SubLObject var4) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.getField6();
    }
    
    public static SubLObject f52045(final SubLObject var4) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.getField7();
    }
    
    public static SubLObject f52046(final SubLObject var4) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.getField8();
    }
    
    public static SubLObject f52047(final SubLObject var4) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.getField9();
    }
    
    public static SubLObject f52048(final SubLObject var4) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.getField10();
    }
    
    public static SubLObject f52049(final SubLObject var4) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.getField11();
    }
    
    public static SubLObject f52050(final SubLObject var4) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.getField12();
    }
    
    public static SubLObject f52051(final SubLObject var4) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.getField13();
    }
    
    public static SubLObject f52052(final SubLObject var4) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.getField14();
    }
    
    public static SubLObject f52053(final SubLObject var4, final SubLObject var7) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.setField2(var7);
    }
    
    public static SubLObject f52054(final SubLObject var4, final SubLObject var7) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.setField3(var7);
    }
    
    public static SubLObject f52055(final SubLObject var4, final SubLObject var7) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.setField4(var7);
    }
    
    public static SubLObject f52056(final SubLObject var4, final SubLObject var7) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.setField5(var7);
    }
    
    public static SubLObject f52057(final SubLObject var4, final SubLObject var7) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.setField6(var7);
    }
    
    public static SubLObject f52058(final SubLObject var4, final SubLObject var7) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.setField7(var7);
    }
    
    public static SubLObject f52059(final SubLObject var4, final SubLObject var7) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.setField8(var7);
    }
    
    public static SubLObject f52060(final SubLObject var4, final SubLObject var7) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.setField9(var7);
    }
    
    public static SubLObject f52061(final SubLObject var4, final SubLObject var7) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.setField10(var7);
    }
    
    public static SubLObject f52062(final SubLObject var4, final SubLObject var7) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.setField11(var7);
    }
    
    public static SubLObject f52063(final SubLObject var4, final SubLObject var7) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.setField12(var7);
    }
    
    public static SubLObject f52064(final SubLObject var4, final SubLObject var7) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.setField13(var7);
    }
    
    public static SubLObject f52065(final SubLObject var4, final SubLObject var7) {
        assert module0813.NIL != f52039(var4) : var4;
        return var4.setField14(var7);
    }
    
    public static SubLObject f52066(SubLObject var8) {
        if (var8 == module0813.UNPROVIDED) {
            var8 = (SubLObject)module0813.NIL;
        }
        final SubLObject var9 = (SubLObject)new $sX56856_native();
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        for (var10 = (SubLObject)module0813.NIL, var10 = var8; module0813.NIL != var10; var10 = conses_high.cddr(var10)) {
            var11 = var10.first();
            var12 = conses_high.cadr(var10);
            var13 = var11;
            if (var13.eql((SubLObject)module0813.$ic37$)) {
                f52053(var9, var12);
            }
            else if (var13.eql((SubLObject)module0813.$ic38$)) {
                f52054(var9, var12);
            }
            else if (var13.eql((SubLObject)module0813.$ic39$)) {
                f52055(var9, var12);
            }
            else if (var13.eql((SubLObject)module0813.$ic40$)) {
                f52056(var9, var12);
            }
            else if (var13.eql((SubLObject)module0813.$ic41$)) {
                f52057(var9, var12);
            }
            else if (var13.eql((SubLObject)module0813.$ic42$)) {
                f52058(var9, var12);
            }
            else if (var13.eql((SubLObject)module0813.$ic43$)) {
                f52059(var9, var12);
            }
            else if (var13.eql((SubLObject)module0813.$ic44$)) {
                f52060(var9, var12);
            }
            else if (var13.eql((SubLObject)module0813.$ic45$)) {
                f52061(var9, var12);
            }
            else if (var13.eql((SubLObject)module0813.$ic46$)) {
                f52062(var9, var12);
            }
            else if (var13.eql((SubLObject)module0813.$ic47$)) {
                f52063(var9, var12);
            }
            else if (var13.eql((SubLObject)module0813.$ic48$)) {
                f52064(var9, var12);
            }
            else if (var13.eql((SubLObject)module0813.$ic49$)) {
                f52065(var9, var12);
            }
            else {
                Errors.error((SubLObject)module0813.$ic50$, var11);
            }
        }
        return var9;
    }
    
    public static SubLObject f52067(final SubLObject var14, final SubLObject var15) {
        Functions.funcall(var15, var14, (SubLObject)module0813.$ic51$, (SubLObject)module0813.$ic52$, (SubLObject)module0813.THIRTEEN_INTEGER);
        Functions.funcall(var15, var14, (SubLObject)module0813.$ic53$, (SubLObject)module0813.$ic37$, f52040(var14));
        Functions.funcall(var15, var14, (SubLObject)module0813.$ic53$, (SubLObject)module0813.$ic38$, f52041(var14));
        Functions.funcall(var15, var14, (SubLObject)module0813.$ic53$, (SubLObject)module0813.$ic39$, f52042(var14));
        Functions.funcall(var15, var14, (SubLObject)module0813.$ic53$, (SubLObject)module0813.$ic40$, f52043(var14));
        Functions.funcall(var15, var14, (SubLObject)module0813.$ic53$, (SubLObject)module0813.$ic41$, f52044(var14));
        Functions.funcall(var15, var14, (SubLObject)module0813.$ic53$, (SubLObject)module0813.$ic42$, f52045(var14));
        Functions.funcall(var15, var14, (SubLObject)module0813.$ic53$, (SubLObject)module0813.$ic43$, f52046(var14));
        Functions.funcall(var15, var14, (SubLObject)module0813.$ic53$, (SubLObject)module0813.$ic44$, f52047(var14));
        Functions.funcall(var15, var14, (SubLObject)module0813.$ic53$, (SubLObject)module0813.$ic45$, f52048(var14));
        Functions.funcall(var15, var14, (SubLObject)module0813.$ic53$, (SubLObject)module0813.$ic46$, f52049(var14));
        Functions.funcall(var15, var14, (SubLObject)module0813.$ic53$, (SubLObject)module0813.$ic47$, f52050(var14));
        Functions.funcall(var15, var14, (SubLObject)module0813.$ic53$, (SubLObject)module0813.$ic48$, f52051(var14));
        Functions.funcall(var15, var14, (SubLObject)module0813.$ic53$, (SubLObject)module0813.$ic49$, f52052(var14));
        Functions.funcall(var15, var14, (SubLObject)module0813.$ic54$, (SubLObject)module0813.$ic52$, (SubLObject)module0813.THIRTEEN_INTEGER);
        return var14;
    }
    
    public static SubLObject f52068(final SubLObject var14, final SubLObject var15) {
        return f52067(var14, var15);
    }
    
    public static SubLObject f52038(final SubLObject var2, final SubLObject var5, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (module0813.NIL != print_high.$print_readably$.getDynamicValue(var17)) {
            print_high.print_not_readable(var2, var5);
        }
        else {
            streams_high.write_string((SubLObject)module0813.$ic56$, var5, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var2), new SubLObject[] { module0813.$ic57$, var5 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var5);
            PrintLow.format(var5, (SubLObject)module0813.$ic58$, new SubLObject[] { (module0813.NIL != f52034(var2)) ? module0813.$ic59$ : module0813.$ic60$, f52040(var2), f52041(var2), Sequences.length(f52042(var2)), Sequences.length(f52046(var2)) });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var5);
            PrintLow.write(Equality.pointer(var2), new SubLObject[] { module0813.$ic57$, var5, module0813.$ic61$, module0813.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var5);
        }
        return var2;
    }
    
    public static SubLObject f52069(final SubLObject var21, final SubLObject var22, final SubLObject var23, final SubLObject var24, final SubLObject var25, final SubLObject var26, final SubLObject var27, final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        assert module0813.NIL != Types.stringp(var21) : var21;
        assert module0813.NIL != f52031(var22) : var22;
        assert module0813.NIL != module0035.f2015(var23) : var23;
        SubLObject var30 = var23;
        SubLObject var31 = (SubLObject)module0813.NIL;
        var31 = var30.first();
        while (module0813.NIL != var30) {
            assert module0813.NIL != Types.keywordp(var31) : var31;
            var30 = var30.rest();
            var31 = var30.first();
        }
        assert module0813.NIL != module0810.f51702(var24) : var24;
        assert module0813.NIL != Filesys.directory_p(var25) : var25;
        assert module0813.NIL != Filesys.directory_p(var26) : var26;
        if (module0813.NIL != var27 && !module0813.areAssertionsDisabledFor(me) && module0813.NIL == Types.stringp(var27)) {
            throw new AssertionError(var27);
        }
        if (module0813.NIL != module0810.f51704(var28) && module0813.NIL == Errors.$ignore_mustsP$.getDynamicValue(var29) && !var24.eql(module0810.f51732(var28))) {
            Errors.error((SubLObject)module0813.$ic68$, var24, module0810.f51732(var28), var28);
        }
        final SubLObject var32 = f52066((SubLObject)module0813.UNPROVIDED);
        f52053(var32, var21);
        f52054(var32, var22);
        f52055(var32, var23);
        f52056(var32, var25);
        f52057(var32, var26);
        f52058(var32, var27);
        f52060(var32, Hashtables.make_hash_table((SubLObject)module0813.$ic69$, Symbols.symbol_function((SubLObject)module0813.EQUAL), (SubLObject)module0813.UNPROVIDED));
        f52061(var32, Hashtables.make_hash_table((SubLObject)module0813.$ic69$, Symbols.symbol_function((SubLObject)module0813.EQUAL), (SubLObject)module0813.UNPROVIDED));
        f52062(var32, Hashtables.make_hash_table((SubLObject)module0813.$ic69$, Symbols.symbol_function((SubLObject)module0813.EQUAL), (SubLObject)module0813.UNPROVIDED));
        final SubLObject var33 = (module0813.NIL != module0810.f51704(var28)) ? var28 : module0810.f51728(var24);
        f52064(var32, var33);
        return var32;
    }
    
    public static SubLObject f52070(final SubLObject var3) {
        f52059(var3, (SubLObject)module0813.NIL);
        Hashtables.clrhash(f52047(var3));
        f52060(var3, (SubLObject)module0813.$ic70$);
        Hashtables.clrhash(f52048(var3));
        f52061(var3, (SubLObject)module0813.$ic70$);
        Hashtables.clrhash(f52049(var3));
        f52062(var3, (SubLObject)module0813.$ic70$);
        f52063(var3, (SubLObject)module0813.$ic70$);
        module0810.f51731(f52051(var3));
        f52064(var3, (SubLObject)module0813.$ic70$);
        f52065(var3, (SubLObject)module0813.$ic70$);
        return var3;
    }
    
    public static SubLObject f52071(final SubLObject var3) {
        return f52040(var3);
    }
    
    public static SubLObject f52072(final SubLObject var3) {
        return f52041(var3);
    }
    
    public static SubLObject f52073(final SubLObject var3) {
        return f52042(var3);
    }
    
    public static SubLObject f52074(final SubLObject var3) {
        return f52043(var3);
    }
    
    public static SubLObject f52075(final SubLObject var3) {
        return f52044(var3);
    }
    
    public static SubLObject f52076(final SubLObject var3) {
        return f52045(var3);
    }
    
    public static SubLObject f52077(final SubLObject var3) {
        return f52050(var3);
    }
    
    public static SubLObject f52078(final SubLObject var3) {
        return f52051(var3);
    }
    
    public static SubLObject f52079(final SubLObject var3) {
        return f52046(var3);
    }
    
    public static SubLObject f52080(final SubLObject var3, final SubLObject var33) {
        assert module0813.NIL != module0035.f2015(var33) : var33;
        SubLObject var34 = var33;
        SubLObject var35 = (SubLObject)module0813.NIL;
        var35 = var34.first();
        while (module0813.NIL != var34) {
            assert module0813.NIL != Types.stringp(var35) : var35;
            var34 = var34.rest();
            var35 = var34.first();
        }
        f52059(var3, var33);
        return var3;
    }
    
    public static SubLObject f52081(final SubLObject var3, SubLObject var34) {
        if (var34 == module0813.UNPROVIDED) {
            var34 = Time.get_universal_time();
        }
        assert module0813.NIL != module0051.f3549(var34) : var34;
        f52065(var3, var34);
        return var3;
    }
    
    public static SubLObject f52036(final SubLObject var3) {
        return module0810.f51732(f52051(var3));
    }
    
    public static SubLObject f52034(final SubLObject var3) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0813.$ic1$ != f52036(var3));
    }
    
    public static SubLObject f52082(final SubLObject var3, final SubLObject var35) {
        return module0035.sublisp_boolean(Hashtables.gethash_without_values(var35, f52047(var3), (SubLObject)module0813.NIL));
    }
    
    public static SubLObject f52083(final SubLObject var3, final SubLObject var35) {
        final SubLObject var36 = Hashtables.gethash_without_values(var35, f52047(var3), (SubLObject)module0813.NIL);
        return var36.first();
    }
    
    public static SubLObject f52084(final SubLObject var3, final SubLObject var35) {
        final SubLObject var36 = Hashtables.gethash_without_values(var35, f52047(var3), (SubLObject)module0813.NIL);
        return conses_high.second(var36);
    }
    
    public static SubLObject f52085(final SubLObject var3, final SubLObject var35) {
        final SubLObject var36 = f52074(var3);
        final SubLObject var37 = f52083(var3, var35);
        final SubLObject var38 = Sequences.search(var36, var37, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED);
        if (module0813.ZERO_INTEGER.numE(var38)) {
            final SubLObject var39 = Sequences.length(var36);
            final SubLObject var40 = Sequences.length(var37);
            final SubLObject var41 = module0038.f2623(var37, var39, var40);
            return var41;
        }
        return (SubLObject)module0813.NIL;
    }
    
    public static SubLObject f52086(final SubLObject var3, final SubLObject var35) {
        return Hashtables.gethash_without_values(var35, f52048(var3), (SubLObject)module0813.NIL);
    }
    
    public static SubLObject f52087(final SubLObject var3, final SubLObject var35) {
        return f52088(f52086(var3, var35), (SubLObject)ConsesLow.cons((SubLObject)module0813.$ic72$, f52073(var3)));
    }
    
    public static SubLObject f52089(final SubLObject var3, final SubLObject var35) {
        final SubLObject var36 = Hashtables.gethash_without_values(var35, f52049(var3), (SubLObject)module0813.NIL);
        return var36.first();
    }
    
    public static SubLObject f52090(final SubLObject var3, final SubLObject var35) {
        final SubLObject var36 = Hashtables.gethash_without_values(var35, f52049(var3), (SubLObject)module0813.NIL);
        return conses_high.second(var36);
    }
    
    public static SubLObject f52091(final SubLObject var3, final SubLObject var35) {
        final SubLObject var36 = Hashtables.gethash_without_values(var35, f52049(var3), (SubLObject)module0813.NIL);
        return conses_high.third(var36);
    }
    
    public static SubLObject f52092(final SubLObject var3) {
        SubLObject var4 = (SubLObject)module0813.NIL;
        SubLObject var5 = f52079(var3);
        SubLObject var6 = (SubLObject)module0813.NIL;
        var6 = var5.first();
        while (module0813.NIL != var5) {
            var4 = (SubLObject)ConsesLow.cons(f52089(var3, var6), var4);
            var4 = (SubLObject)ConsesLow.cons(f52090(var3, var6), var4);
            var4 = (SubLObject)ConsesLow.cons(f52091(var3, var6), var4);
            var5 = var5.rest();
            var6 = var5.first();
        }
        return Sequences.nreverse(var4);
    }
    
    public static SubLObject f52093(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = f52071(var3);
        final SubLObject var6 = f52072(var3);
        final SubLObject var7 = f52073(var3);
        final SubLObject var8 = f52076(var3);
        var4.resetMultipleValues();
        final SubLObject var9 = f52094(var5, var6, var7, var8);
        final SubLObject var10 = var4.secondMultipleValue();
        final SubLObject var11 = var4.thirdMultipleValue();
        var4.resetMultipleValues();
        return var11;
    }
    
    public static SubLObject f52095(final SubLObject var3, final SubLObject var35) {
        if (module0813.NIL != f52034(var3)) {
            final SubLObject var36 = f52078(var3);
            return module0810.f51755(var36, var35);
        }
        return (SubLObject)module0813.NIL;
    }
    
    public static SubLObject f52096(final SubLObject var3, final SubLObject var46) {
        if (module0813.NIL != f52034(var3)) {
            final SubLObject var47 = f52078(var3);
            return module0810.f51756(var47, var46);
        }
        return (SubLObject)module0813.NIL;
    }
    
    public static SubLObject f52097(final SubLObject var3, final SubLObject var47) {
        if (module0813.NIL != f52034(var3)) {
            final SubLObject var48 = f52078(var3);
            return module0810.f51757(var48, var47);
        }
        return (SubLObject)module0813.NIL;
    }
    
    public static SubLObject f52098(final SubLObject var3, final SubLObject var48) {
        if (module0813.NIL != f52034(var3)) {
            final SubLObject var49 = f52078(var3);
            return module0810.f51738(var49, var48);
        }
        return Symbols.symbol_name(var48);
    }
    
    public static SubLObject f52099(final SubLObject var48) {
        final SubLObject var49 = f52032();
        if (module0813.NIL != var49) {
            return f52098(var49, var48);
        }
        return Symbols.symbol_name(var48);
    }
    
    public static SubLObject f52100(final SubLObject var3, final SubLObject var35, final SubLObject var37, final SubLObject var49) {
        assert module0813.NIL != Types.stringp(var35) : var35;
        assert module0813.NIL != Types.stringp(var37) : var37;
        assert module0813.NIL != Types.stringp(var49) : var49;
        Hashtables.sethash(var35, f52047(var3), (SubLObject)ConsesLow.list(var37, var49));
        return var3;
    }
    
    public static SubLObject f52101(final SubLObject var3, final SubLObject var35, final SubLObject var50) {
        assert module0813.NIL != Types.stringp(var35) : var35;
        Hashtables.sethash(var35, f52048(var3), var50);
        return var3;
    }
    
    public static SubLObject f52102(final SubLObject var3) {
        return f52081(var3, Time.encode_universal_time((SubLObject)module0813.ZERO_INTEGER, (SubLObject)module0813.ZERO_INTEGER, (SubLObject)module0813.ZERO_INTEGER, (SubLObject)module0813.ONE_INTEGER, (SubLObject)module0813.ONE_INTEGER, (SubLObject)module0813.$ic73$, (SubLObject)module0813.UNPROVIDED));
    }
    
    public static SubLObject f52103() {
        final SubLObject var3 = f52032();
        if (module0813.NIL != var3) {
            final SubLObject var4 = f52076(var3);
            f52104(var4);
            return f52105(var3);
        }
        return (SubLObject)module0813.NIL;
    }
    
    public static SubLObject f52106(final SubLObject var35) {
        final SubLObject var36 = f52032();
        if (module0813.NIL != var36 && module0813.NIL != f52082(var36, var35)) {
            f52107(var36, var35);
            return (SubLObject)module0813.T;
        }
        return (SubLObject)module0813.NIL;
    }
    
    public static SubLObject f52108() {
        final SubLObject var3 = f52032();
        if (module0813.NIL != var3) {
            f52109(var3);
            return (SubLObject)module0813.T;
        }
        return (SubLObject)module0813.NIL;
    }
    
    public static SubLObject f52110() {
        final SubLObject var3 = f52032();
        if (module0813.NIL != var3) {
            f52111(var3);
            return (SubLObject)module0813.T;
        }
        return (SubLObject)module0813.NIL;
    }
    
    public static SubLObject f52112(final SubLObject var35, final SubLObject var51, final SubLObject var52, final SubLObject var53) {
        assert module0813.NIL != Types.stringp(var35) : var35;
        assert module0813.NIL != Types.symbolp(var51) : var51;
        assert module0813.NIL != Types.symbolp(var52) : var52;
        assert module0813.NIL != Types.symbolp(var53) : var53;
        final SubLObject var54 = f52032();
        if (module0813.NIL != var54) {
            Hashtables.sethash(var35, f52049(var54), (SubLObject)ConsesLow.list(var51, var52, var53));
        }
        return (SubLObject)module0813.NIL;
    }
    
    public static SubLObject f52113(final SubLObject var54) {
        SubLObject var55 = (SubLObject)module0813.NIL;
        SubLObject var56 = var54;
        SubLObject var57 = (SubLObject)module0813.NIL;
        SubLObject var60_61 = (SubLObject)module0813.NIL;
        while (module0813.NIL != var56) {
            cdestructuring_bind.destructuring_bind_must_consp(var56, var54, (SubLObject)module0813.$ic75$);
            var60_61 = var56.first();
            var56 = var56.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var56, var54, (SubLObject)module0813.$ic75$);
            if (module0813.NIL == conses_high.member(var60_61, (SubLObject)module0813.$ic76$, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED)) {
                var57 = (SubLObject)module0813.T;
            }
            if (var60_61 == module0813.$ic77$) {
                var55 = var56.first();
            }
            var56 = var56.rest();
        }
        if (module0813.NIL != var57 && module0813.NIL == var55) {
            cdestructuring_bind.cdestructuring_bind_error(var54, (SubLObject)module0813.$ic75$);
        }
        final SubLObject var58 = cdestructuring_bind.property_list_member((SubLObject)module0813.$ic37$, var54);
        final SubLObject var59 = (SubLObject)((module0813.NIL != var58) ? conses_high.cadr(var58) : module0813.NIL);
        final SubLObject var60 = cdestructuring_bind.property_list_member((SubLObject)module0813.$ic38$, var54);
        final SubLObject var61 = (SubLObject)((module0813.NIL != var60) ? conses_high.cadr(var60) : module0813.NIL);
        final SubLObject var62 = cdestructuring_bind.property_list_member((SubLObject)module0813.$ic39$, var54);
        final SubLObject var63 = (SubLObject)((module0813.NIL != var62) ? conses_high.cadr(var62) : module0813.NIL);
        final SubLObject var64 = cdestructuring_bind.property_list_member((SubLObject)module0813.$ic78$, var54);
        final SubLObject var65 = (SubLObject)((module0813.NIL != var64) ? conses_high.cadr(var64) : module0813.$ic1$);
        final SubLObject var66 = cdestructuring_bind.property_list_member((SubLObject)module0813.$ic40$, var54);
        final SubLObject var67 = (SubLObject)((module0813.NIL != var66) ? conses_high.cadr(var66) : module0813.NIL);
        final SubLObject var68 = cdestructuring_bind.property_list_member((SubLObject)module0813.$ic41$, var54);
        final SubLObject var69 = (SubLObject)((module0813.NIL != var68) ? conses_high.cadr(var68) : module0813.NIL);
        final SubLObject var70 = cdestructuring_bind.property_list_member((SubLObject)module0813.$ic79$, var54);
        final SubLObject var71 = (SubLObject)((module0813.NIL != var70) ? conses_high.cadr(var70) : module0813.NIL);
        final SubLObject var72 = cdestructuring_bind.property_list_member((SubLObject)module0813.$ic80$, var54);
        final SubLObject var73 = (SubLObject)((module0813.NIL != var72) ? conses_high.cadr(var72) : module0813.NIL);
        final SubLObject var74 = f52069(var59, var61, var63, var65, var67, var69, var71, var73);
        f52114(var74);
        f52105(var74);
        f52102(var74);
        f52115(var74);
        return var74;
    }
    
    public static SubLObject f52114(final SubLObject var3) {
        final SubLObject var4 = f52071(var3);
        final SubLObject var5 = f52073(var3);
        final SubLObject var6 = module0809.f51508(var4, var5);
        f52063(var3, var6);
        return var3;
    }
    
    public static SubLObject f52105(final SubLObject var3) {
        final SubLObject var4 = f52071(var3);
        final SubLObject var5 = f52072(var3);
        final SubLObject var6 = f52073(var3);
        final SubLObject var7 = f52074(var3);
        final SubLObject var8 = f52076(var3);
        final SubLObject var9 = f52116(var4, var5, var6, var8);
        SubLObject var10 = (SubLObject)module0813.NIL;
        SubLObject var11 = var9;
        SubLObject var12 = (SubLObject)module0813.NIL;
        var12 = var11.first();
        while (module0813.NIL != var11) {
            SubLObject var14;
            final SubLObject var13 = var14 = var12;
            SubLObject var15 = (SubLObject)module0813.NIL;
            SubLObject var16 = (SubLObject)module0813.NIL;
            SubLObject var17 = (SubLObject)module0813.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0813.$ic81$);
            var15 = var14.first();
            var14 = var14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0813.$ic81$);
            var16 = var14.first();
            var14 = var14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0813.$ic81$);
            var17 = var14.first();
            var14 = var14.rest();
            if (module0813.NIL == var14) {
                final SubLObject var18 = f52117(var7, var15, var16);
                final SubLObject var19 = f52118(var3, var15, var16);
                f52100(var3, var16, var18, var19);
                f52101(var3, var16, var17);
                var10 = (SubLObject)ConsesLow.cons(var16, var10);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0813.$ic81$);
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        f52119(var3);
        f52080(var3, Sequences.nreverse(var10));
        return Sequences.length(var9);
    }
    
    public static SubLObject f52116(final SubLObject var21, final SubLObject var22, final SubLObject var23, final SubLObject var27) {
        final SubLObject var28 = f52120(var27);
        final SubLObject var29 = f52121(var28, var21);
        final SubLObject var30 = f52122(var29);
        SubLObject var31 = (SubLObject)module0813.NIL;
        SubLObject var32 = f52123(var29);
        SubLObject var33 = (SubLObject)module0813.NIL;
        var33 = var32.first();
        while (module0813.NIL != var32) {
            if (module0813.NIL != f52124(var33, var22, var23)) {
                final SubLObject var34 = f52125(var29, var33);
                final SubLObject var35 = f52126(var33);
                final SubLObject var36 = f52127(var33);
                var31 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var34, var35, var36), var31);
            }
            var32 = var32.rest();
            var33 = var32.first();
        }
        return Values.values(Sequences.nreverse(var31), var30);
    }
    
    public static SubLObject f52117(final SubLObject var25, final SubLObject var77, final SubLObject var35) {
        return f52128(var25, var77, var35, (SubLObject)module0813.$ic82$);
    }
    
    public static SubLObject f52118(final SubLObject var3, final SubLObject var77, final SubLObject var35) {
        final SubLObject var78 = f52072(var3);
        final SubLObject var79 = f52036(var3);
        final SubLObject var80 = f52075(var3);
        final SubLObject var81 = f52129(var78, var77, var79);
        final SubLObject var82 = f52130(var3, var78, var35);
        final SubLObject var83 = f52131(var78);
        return f52128(var80, var81, var82, var83);
    }
    
    public static SubLObject f52129(final SubLObject var22, SubLObject var77, final SubLObject var24) {
        if (var22.eql((SubLObject)module0813.$ic83$)) {
            if (var77.equal((SubLObject)module0813.$ic84$)) {
                return (SubLObject)module0813.NIL;
            }
            return var77;
        }
        else {
            if (var22.eql((SubLObject)module0813.$ic85$)) {
                if (module0813.$ic1$ != var24) {
                    var77 = module0035.f2124((SubLObject)module0813.ONE_INTEGER, var77);
                }
                SubLObject var78 = (SubLObject)module0813.NIL;
                SubLObject var79 = var77;
                SubLObject var80 = (SubLObject)module0813.NIL;
                var80 = var79.first();
                while (module0813.NIL != var79) {
                    var78 = (SubLObject)ConsesLow.cons(module0819.f52449(var80), var78);
                    var79 = var79.rest();
                    var80 = var79.first();
                }
                return Sequences.nreverse(var78);
            }
            return (SubLObject)module0813.NIL;
        }
    }
    
    public static SubLObject f52131(final SubLObject var22) {
        if (var22.eql((SubLObject)module0813.$ic83$)) {
            return (SubLObject)module0813.$ic86$;
        }
        if (var22.eql((SubLObject)module0813.$ic85$)) {
            return (SubLObject)module0813.$ic87$;
        }
        return Errors.error((SubLObject)module0813.$ic88$, var22);
    }
    
    public static SubLObject f52130(final SubLObject var3, final SubLObject var22, final SubLObject var35) {
        final SubLObject var36 = f52095(var3, var35);
        if (var22.eql((SubLObject)module0813.$ic83$)) {
            return module0816.f52364(var35, var36);
        }
        if (var22.eql((SubLObject)module0813.$ic85$)) {
            return f52132(var35, var36);
        }
        return Errors.error((SubLObject)module0813.$ic89$, var22);
    }
    
    public static SubLObject f52132(final SubLObject var35, SubLObject var88) {
        if (var88 == module0813.UNPROVIDED) {
            var88 = (SubLObject)module0813.NIL;
        }
        if (module0813.NIL != var88) {
            return PrintLow.format((SubLObject)module0813.NIL, (SubLObject)module0813.$ic90$, var88);
        }
        return Sequences.nsubstitute((SubLObject)Characters.CHAR_underbar, (SubLObject)Characters.CHAR_hyphen, Strings.string_downcase(var35, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED), (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED);
    }
    
    public static SubLObject f52128(final SubLObject var89, final SubLObject var90, final SubLObject var85, final SubLObject var86) {
        final SubLObject var91 = module0075.f5179(var85, var86);
        final SubLObject var92 = Strings.string_downcase(module0075.f5194(var90, var91, (SubLObject)module0813.UNPROVIDED), (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED);
        final SubLObject var93 = module0075.f5176(var89, var92, (SubLObject)module0813.UNPROVIDED);
        return var93;
    }
    
    public static SubLObject f52088(final SubLObject var50, final SubLObject var94) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        if (module0813.NIL == var50) {
            return (SubLObject)module0813.T;
        }
        SubLObject var96 = (SubLObject)module0813.NIL;
        final SubLObject var97 = reader.$features$.currentBinding(var95);
        try {
            reader.$features$.bind(var94, var95);
            var96 = module0005.f169(var50);
        }
        finally {
            reader.$features$.rebind(var97, var95);
        }
        return var96;
    }
    
    public static SubLObject f52119(final SubLObject var3) {
        assert module0813.NIL != f52039(var3) : var3;
        final SubLObject var4 = f52077(var3);
        final SubLObject var5 = f52048(var3);
        SubLObject var6 = (SubLObject)module0813.NIL;
        SubLObject var7 = (SubLObject)module0813.NIL;
        final Iterator var8 = Hashtables.getEntrySetIterator(var5);
        try {
            while (Hashtables.iteratorHasNext(var8)) {
                final Map.Entry var9 = Hashtables.iteratorNextEntry(var8);
                var6 = Hashtables.getEntryKey(var9);
                var7 = Hashtables.getEntryValue(var9);
                module0809.f51517(var4, var6, var7);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var8);
        }
        return (SubLObject)module0813.NIL;
    }
    
    public static SubLObject f52133(final SubLObject var100, SubLObject var6, SubLObject var101, SubLObject var102) {
        if (var6 == module0813.UNPROVIDED) {
            var6 = (SubLObject)module0813.NIL;
        }
        if (var101 == module0813.UNPROVIDED) {
            var101 = (SubLObject)module0813.NIL;
        }
        if (var102 == module0813.UNPROVIDED) {
            var102 = (SubLObject)module0813.NIL;
        }
        final SubLThread var103 = SubLProcess.currentSubLThread();
        streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var103));
        streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(var103));
        module0006.f218(module0813.$g6453$.getDynamicValue(var103), var100, var6, var101, var102, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED);
        return (SubLObject)module0813.NIL;
    }
    
    public static SubLObject f52134(final SubLObject var103, final SubLObject var104) {
        SubLObject var106;
        final SubLObject var105 = var106 = var103.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var106, var105, (SubLObject)module0813.$ic91$);
        final SubLObject var107 = var106.rest();
        var106 = var106.first();
        SubLObject var108 = (SubLObject)module0813.NIL;
        SubLObject var109 = (SubLObject)module0813.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var106, var105, (SubLObject)module0813.$ic91$);
        var108 = var106.first();
        var106 = var106.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var106, var105, (SubLObject)module0813.$ic91$);
        var109 = var106.first();
        final SubLObject var110;
        var106 = (var110 = var106.rest());
        final SubLObject var111;
        var106 = (var111 = var107);
        final SubLObject var112 = (SubLObject)module0813.$ic92$;
        return (SubLObject)ConsesLow.list((SubLObject)module0813.$ic93$, (SubLObject)ConsesLow.list(var112), (SubLObject)ConsesLow.list((SubLObject)module0813.$ic94$, (SubLObject)ConsesLow.list((SubLObject)module0813.$ic95$, var112), (SubLObject)ConsesLow.listS((SubLObject)module0813.$ic96$, (SubLObject)ConsesLow.listS(var108, var109, ConsesLow.append(var110, (SubLObject)module0813.NIL)), ConsesLow.append(var111, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)module0813.$ic97$, var112, (SubLObject)module0813.$ic98$))))));
    }
    
    public static SubLObject f52115(final SubLObject var3) {
        final SubLObject var4 = f52071(var3);
        final SubLObject var5 = f52072(var3);
        final SubLObject var6 = f52073(var3);
        final SubLObject var7 = f52079(var3);
        f52133((SubLObject)module0813.$ic99$, var4, var5, var6);
        f52135(var3, var7);
        f52109(var3);
        f52111(var3);
        f52081(var3, (SubLObject)module0813.UNPROVIDED);
        return var3;
    }
    
    public static SubLObject f52135(final SubLObject var3, final SubLObject var33) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        f52133((SubLObject)module0813.$ic100$, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED);
        final SubLObject var35 = module0813.$g6449$.currentBinding(var34);
        final SubLObject var36 = module0813.$g6453$.currentBinding(var34);
        final SubLObject var37 = Errors.$ignore_warnsP$.currentBinding(var34);
        try {
            module0813.$g6449$.bind((SubLObject)module0813.NIL, var34);
            module0813.$g6453$.bind(StreamsLow.$null_output$.getDynamicValue(var34), var34);
            Errors.$ignore_warnsP$.bind((SubLObject)module0813.T, var34);
            module0012.$g82$.setDynamicValue((SubLObject)module0813.$ic101$, var34);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var34);
            module0012.$g83$.setDynamicValue(Sequences.length(var33), var34);
            module0012.$g84$.setDynamicValue((SubLObject)module0813.ZERO_INTEGER, var34);
            final SubLObject var96_114 = module0012.$g75$.currentBinding(var34);
            final SubLObject var111_115 = module0012.$g76$.currentBinding(var34);
            final SubLObject var112_116 = module0012.$g77$.currentBinding(var34);
            final SubLObject var38 = module0012.$g78$.currentBinding(var34);
            try {
                module0012.$g75$.bind((SubLObject)module0813.ZERO_INTEGER, var34);
                module0012.$g76$.bind((SubLObject)module0813.NIL, var34);
                module0012.$g77$.bind((SubLObject)module0813.T, var34);
                module0012.$g78$.bind(Time.get_universal_time(), var34);
                module0012.f478(module0012.$g82$.getDynamicValue(var34));
                SubLObject var39 = var33;
                SubLObject var40 = (SubLObject)module0813.NIL;
                var40 = var39.first();
                while (module0813.NIL != var39) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var34), module0012.$g83$.getDynamicValue(var34));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var34), (SubLObject)module0813.ONE_INTEGER), var34);
                    f52107(var3, var40);
                    var39 = var39.rest();
                    var40 = var39.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var38, var34);
                module0012.$g77$.rebind(var112_116, var34);
                module0012.$g76$.rebind(var111_115, var34);
                module0012.$g75$.rebind(var96_114, var34);
            }
        }
        finally {
            Errors.$ignore_warnsP$.rebind(var37, var34);
            module0813.$g6453$.rebind(var36, var34);
            module0813.$g6449$.rebind(var35, var34);
        }
        f52133((SubLObject)module0813.$ic102$, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED);
        SubLObject var41 = var33;
        SubLObject var42 = (SubLObject)module0813.NIL;
        var42 = var41.first();
        while (module0813.NIL != var41) {
            if (module0813.NIL != f52087(var3, var42)) {
                f52107(var3, var42);
            }
            var41 = var41.rest();
            var42 = var41.first();
        }
        return var3;
    }
    
    public static SubLObject f52136(final SubLObject var35) {
        return Sequences.cconcatenate(var35, new SubLObject[] { module0813.$ic104$, module0038.f2624(Time.get_universal_time()) });
    }
    
    public static SubLObject f52137(final SubLObject var35, final SubLObject var37, SubLObject var23) {
        if (var23 == module0813.UNPROVIDED) {
            var23 = (SubLObject)module0813.NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)module0813.NIL;
        final SubLObject var40 = module0060.f4439(module0813.$g6455$.getDynamicValue(var38), (SubLObject)ConsesLow.list(var37), (SubLObject)module0813.ZERO_INTEGER, StreamsLow.$null_input$.getDynamicValue(var38));
        final SubLObject var41 = var40.first();
        if (var41.isString()) {
            final SubLObject var42 = module0035.position_if_not((SubLObject)module0813.$ic105$, var41, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED);
            var39 = module0038.f2623(var41, (SubLObject)module0813.ZERO_INTEGER, var42);
        }
        if (!var39.isString()) {
            Errors.warn((SubLObject)module0813.$ic106$, module0813.$g6455$.getDynamicValue(var38), var35, var40);
            var39 = f52136(var35);
        }
        return var39;
    }
    
    public static SubLObject f52138(final SubLObject var35, final SubLObject var37, SubLObject var49, final SubLObject var22, final SubLObject var23) {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        assert module0813.NIL != Types.stringp(var35) : var35;
        assert module0813.NIL != Types.stringp(var37) : var37;
        assert module0813.NIL != Types.stringp(var49) : var49;
        assert module0813.NIL != f52031(var22) : var22;
        assert module0813.NIL != module0035.f2015(var23) : var23;
        SubLObject var51 = var23;
        SubLObject var52 = (SubLObject)module0813.NIL;
        var52 = var51.first();
        while (module0813.NIL != var51) {
            assert module0813.NIL != Types.keywordp(var52) : var52;
            var51 = var51.rest();
            var52 = var51.first();
        }
        SubLObject var53 = (SubLObject)module0813.NIL;
        SubLObject var54 = (SubLObject)module0813.NIL;
        final SubLObject var55 = (SubLObject)module0813.$ic107$;
        SubLObject var56 = (SubLObject)module0813.NIL;
        final SubLObject var57 = Errors.$restarts$.currentBinding(var50);
        try {
            Errors.$restarts$.bind((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var55, (SubLObject)module0813.$ic108$, var35), Errors.$restarts$.getDynamicValue(var50)), var50);
            try {
                var50.throwStack.push(var55);
                SubLObject var58 = (SubLObject)module0813.NIL;
                while (module0813.NIL == var58) {
                    final SubLObject var128_129 = (SubLObject)module0813.$ic109$;
                    SubLObject var130_131 = (SubLObject)module0813.NIL;
                    final SubLObject var96_132 = Errors.$restarts$.currentBinding(var50);
                    try {
                        Errors.$restarts$.bind((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var128_129, (SubLObject)module0813.$ic110$, var35), Errors.$restarts$.getDynamicValue(var50)), var50);
                        try {
                            var50.throwStack.push(var128_129);
                            try {
                                final SubLObject var96_133 = reader.$features$.currentBinding(var50);
                                try {
                                    reader.$features$.bind(conses_high.adjoin(var22, var23, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED), var50);
                                    SubLObject var59 = (SubLObject)module0813.NIL;
                                    f52133((SubLObject)module0813.$ic111$, var35, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED);
                                    var53 = module0812.f52017(var35, var37);
                                    if (module0813.NIL != f52030()) {
                                        if (module0813.NIL != module0813.$g6454$.getDynamicValue(var50)) {
                                            var59 = f52137(var35, var37, var23);
                                        }
                                    }
                                    else {
                                        var49 = (SubLObject)module0813.$ic112$;
                                    }
                                    if (var22.eql((SubLObject)module0813.$ic83$)) {
                                        module0816.f52219(var53, var49, var59);
                                    }
                                    else if (var22.eql((SubLObject)module0813.$ic85$)) {
                                        module0819.f52436(var53, var49, var59);
                                    }
                                    else {
                                        Errors.error((SubLObject)module0813.$ic113$, var22);
                                    }
                                    var54 = (SubLObject)module0813.T;
                                }
                                finally {
                                    reader.$features$.rebind(var96_133, var50);
                                }
                            }
                            finally {
                                final SubLObject var96_134 = Threads.$is_thread_performing_cleanupP$.currentBinding(var50);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0813.T, var50);
                                    if (module0813.NIL != module0812.f51933(var53)) {
                                        module0812.f51969(var53);
                                    }
                                    f52133((SubLObject)module0813.$ic114$, var35, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var96_134, var50);
                                }
                            }
                            var58 = (SubLObject)module0813.T;
                        }
                        catch (Throwable var60) {
                            var130_131 = Errors.handleThrowable(var60, var128_129);
                        }
                        finally {
                            var50.throwStack.pop();
                        }
                    }
                    finally {
                        Errors.$restarts$.rebind(var96_132, var50);
                    }
                }
            }
            catch (Throwable var61) {
                var56 = Errors.handleThrowable(var61, var55);
            }
            finally {
                var50.throwStack.pop();
            }
        }
        finally {
            Errors.$restarts$.rebind(var57, var50);
        }
        return var54;
    }
    
    public static SubLObject f52107(final SubLObject var3, final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        assert module0813.NIL != f52039(var3) : var3;
        assert module0813.NIL != Types.stringp(var35) : var35;
        final SubLObject var37 = f52072(var3);
        final SubLObject var38 = f52073(var3);
        final SubLObject var39 = f52083(var3, var35);
        final SubLObject var40 = f52084(var3, var35);
        SubLObject var41 = (SubLObject)module0813.NIL;
        final SubLObject var42 = module0813.$g6451$.currentBinding(var36);
        try {
            module0813.$g6451$.bind(var3, var36);
            var41 = f52138(var35, var39, var40, var37, var38);
        }
        finally {
            module0813.$g6451$.rebind(var42, var36);
        }
        return var41;
    }
    
    public static SubLObject f52120(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        assert module0813.NIL != Types.stringp(var27) : var27;
        if (module0813.NIL == Errors.$ignore_mustsP$.getDynamicValue(var28) && module0813.NIL == Filesys.probe_file(var27)) {
            Errors.error((SubLObject)module0813.$ic115$, var27);
        }
        SubLObject var29 = (SubLObject)module0813.NIL;
        SubLObject var30 = (SubLObject)module0813.NIL;
        try {
            final SubLObject var31 = stream_macros.$stream_requires_locking$.currentBinding(var28);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0813.NIL, var28);
                var30 = compatibility.open_text(var27, (SubLObject)module0813.$ic116$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var31, var28);
            }
            if (!var30.isStream()) {
                Errors.error((SubLObject)module0813.$ic117$, var27);
            }
            final SubLObject var5_139 = var30;
            final SubLObject var32 = Packages.$package$.currentBinding(var28);
            final SubLObject var33 = reader.$read_default_float_format$.currentBinding(var28);
            final SubLObject var34 = reader.$features$.currentBinding(var28);
            try {
                Packages.$package$.bind(module0018.$g576$.getGlobalValue(), var28);
                reader.$read_default_float_format$.bind((SubLObject)module0813.$ic118$, var28);
                reader.$features$.bind(Sequences.remove((SubLObject)module0813.$ic119$, reader.$features$.getDynamicValue(var28), (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED), var28);
                SubLObject var35 = (SubLObject)module0813.NIL;
                while (module0813.NIL == var35) {
                    final SubLObject var36 = reader.read_ignoring_errors(var5_139, (SubLObject)module0813.NIL, (SubLObject)module0813.$ic120$);
                    if (var36 == module0813.$ic120$) {
                        var35 = (SubLObject)module0813.T;
                    }
                    else {
                        var29 = (SubLObject)ConsesLow.cons(var36, var29);
                    }
                }
            }
            finally {
                reader.$features$.rebind(var34, var28);
                reader.$read_default_float_format$.rebind(var33, var28);
                Packages.$package$.rebind(var32, var28);
            }
        }
        finally {
            final SubLObject var37 = Threads.$is_thread_performing_cleanupP$.currentBinding(var28);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0813.T, var28);
                if (var30.isStream()) {
                    streams_high.close(var30, (SubLObject)module0813.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var37, var28);
            }
        }
        return Sequences.nreverse(var29);
    }
    
    public static SubLObject f52139(final SubLObject var103, final SubLObject var104) {
        SubLObject var106;
        final SubLObject var105 = var106 = var103.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var106, var105, (SubLObject)module0813.$ic121$);
        final SubLObject var107 = var106.rest();
        var106 = var106.first();
        SubLObject var108 = (SubLObject)module0813.NIL;
        SubLObject var109 = (SubLObject)module0813.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var106, var105, (SubLObject)module0813.$ic121$);
        var108 = var106.first();
        var106 = var106.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var106, var105, (SubLObject)module0813.$ic121$);
        var109 = var106.first();
        var106 = var106.rest();
        if (module0813.NIL == var106) {
            final SubLObject var110;
            var106 = (var110 = var107);
            return (SubLObject)ConsesLow.listS((SubLObject)module0813.$ic122$, (SubLObject)ConsesLow.list(var108, var109), ConsesLow.append(var110, (SubLObject)module0813.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var105, (SubLObject)module0813.$ic121$);
        return (SubLObject)module0813.NIL;
    }
    
    public static SubLObject f52140(final SubLObject var81) {
        return conses_high.second(var81);
    }
    
    public static SubLObject f52121(final SubLObject var80, final SubLObject var21) {
        SubLObject var81 = var80;
        SubLObject var82 = (SubLObject)module0813.NIL;
        var82 = var81.first();
        while (module0813.NIL != var81) {
            if (var21.equal(f52140(var82))) {
                return var82;
            }
            var81 = var81.rest();
            var82 = var81.first();
        }
        return (SubLObject)module0813.NIL;
    }
    
    public static SubLObject f52123(final SubLObject var81) {
        return conses_high.nthcdr((SubLObject)module0813.THREE_INTEGER, var81);
    }
    
    public static SubLObject f52122(final SubLObject var81) {
        return conses_high.getf(conses_high.third(var81), (SubLObject)module0813.$ic123$, (SubLObject)module0813.NIL);
    }
    
    public static SubLObject f52126(final SubLObject var83) {
        return var83.first();
    }
    
    public static SubLObject f52141(final SubLObject var83) {
        return conses_high.getf(var83.rest(), (SubLObject)module0813.$ic123$, (SubLObject)module0813.NIL);
    }
    
    public static SubLObject f52127(final SubLObject var83) {
        return conses_high.getf(var83.rest(), (SubLObject)module0813.$ic39$, (SubLObject)module0813.NIL);
    }
    
    public static SubLObject f52125(final SubLObject var81, final SubLObject var83) {
        final SubLObject var84 = f52122(var81);
        final SubLObject var85 = f52141(var83);
        return ConsesLow.append(var84, var85);
    }
    
    public static SubLObject f52124(final SubLObject var83, final SubLObject var22, final SubLObject var23) {
        final SubLObject var84 = f52127(var83);
        final SubLObject var85 = conses_high.adjoin(var22, var23, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED);
        return f52088(var84, var85);
    }
    
    public static SubLObject f52104(final SubLObject var27) {
        if (module0813.NIL != module0038.f2673(var27, (SubLObject)module0813.$ic124$, (SubLObject)module0813.UNPROVIDED)) {
            return f52142(var27);
        }
        return (SubLObject)module0813.NIL;
    }
    
    public static SubLObject f52142(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)module0813.NIL;
        SubLObject var30 = (SubLObject)module0813.NIL;
        try {
            final SubLObject var31 = stream_macros.$stream_requires_locking$.currentBinding(var28);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0813.NIL, var28);
                var30 = compatibility.open_text(var27, (SubLObject)module0813.$ic125$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var31, var28);
            }
            if (!var30.isStream()) {
                Errors.error((SubLObject)module0813.$ic117$, var27);
            }
            final SubLObject var5_148 = var30;
            f52143(var5_148);
            var29 = (SubLObject)module0813.T;
        }
        finally {
            final SubLObject var32 = Threads.$is_thread_performing_cleanupP$.currentBinding(var28);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0813.T, var28);
                if (var30.isStream()) {
                    streams_high.close(var30, (SubLObject)module0813.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var32, var28);
            }
        }
        return var29;
    }
    
    public static SubLObject f52143(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        assert module0813.NIL != Types.streamp(var5) : var5;
        final SubLObject var7 = print_high.$print_pretty$.currentBinding(var6);
        try {
            print_high.$print_pretty$.bind((SubLObject)module0813.NIL, var6);
            streams_high.write_string((SubLObject)module0813.$ic127$, var5, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED);
            SubLObject var9;
            final SubLObject var8 = var9 = (SubLObject)module0813.$ic128$;
            SubLObject var10 = (SubLObject)module0813.NIL;
            var10 = var9.first();
            while (module0813.NIL != var9) {
                streams_high.terpri(var5);
                streams_high.terpri(var5);
                f52144(var10, var5);
                var9 = var9.rest();
                var10 = var9.first();
            }
            streams_high.terpri(var5);
        }
        finally {
            print_high.$print_pretty$.rebind(var7, var6);
        }
        return (SubLObject)module0813.NIL;
    }
    
    public static SubLObject f52144(final SubLObject var21, final SubLObject var5) {
        PrintLow.format(var5, (SubLObject)module0813.$ic129$);
        PrintLow.format(var5, (SubLObject)module0813.$ic130$, var21);
        PrintLow.format(var5, (SubLObject)module0813.$ic131$);
        final SubLObject var22 = f52145(var21);
        PrintLow.format(var5, (SubLObject)module0813.$ic132$, var22);
        final SubLObject var23 = f52146(var21);
        PrintLow.format(var5, (SubLObject)module0813.$ic133$, var23);
        final SubLObject var24 = f52147(var21);
        PrintLow.format(var5, (SubLObject)module0813.$ic134$);
        PrintLow.format(var5, (SubLObject)module0813.$ic129$);
        SubLObject var25 = (SubLObject)module0813.NIL;
        SubLObject var26 = (SubLObject)module0813.NIL;
        SubLObject var27 = (SubLObject)module0813.NIL;
        var25 = var24;
        var26 = var25.first();
        for (var27 = (SubLObject)module0813.ZERO_INTEGER; module0813.NIL != var25; var25 = var25.rest(), var26 = var25.first(), var27 = Numbers.add((SubLObject)module0813.ONE_INTEGER, var27)) {
            if (!var27.isZero()) {
                PrintLow.format(var5, (SubLObject)module0813.$ic135$);
            }
            PrintLow.format(var5, (SubLObject)module0813.$ic136$, var26);
        }
        PrintLow.format(var5, (SubLObject)module0813.$ic137$);
        PrintLow.format(var5, (SubLObject)module0813.$ic138$);
        final SubLObject var28 = f52148(var21);
        SubLObject var29 = f52148(var21);
        SubLObject var30 = (SubLObject)module0813.NIL;
        var30 = var29.first();
        while (module0813.NIL != var29) {
            SubLObject var32;
            final SubLObject var31 = var32 = var30;
            SubLObject var33 = (SubLObject)module0813.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0813.$ic139$);
            var33 = var32.first();
            var32 = var32.rest();
            SubLObject var34 = (SubLObject)module0813.NIL;
            SubLObject var35 = var32;
            SubLObject var36 = (SubLObject)module0813.NIL;
            SubLObject var163_164 = (SubLObject)module0813.NIL;
            while (module0813.NIL != var35) {
                cdestructuring_bind.destructuring_bind_must_consp(var35, var31, (SubLObject)module0813.$ic139$);
                var163_164 = var35.first();
                var35 = var35.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var35, var31, (SubLObject)module0813.$ic139$);
                if (module0813.NIL == conses_high.member(var163_164, (SubLObject)module0813.$ic140$, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED)) {
                    var36 = (SubLObject)module0813.T;
                }
                if (var163_164 == module0813.$ic77$) {
                    var34 = var35.first();
                }
                var35 = var35.rest();
            }
            if (module0813.NIL != var36 && module0813.NIL == var34) {
                cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)module0813.$ic139$);
            }
            final SubLObject var37 = cdestructuring_bind.property_list_member((SubLObject)module0813.$ic123$, var32);
            final SubLObject var38 = (SubLObject)((module0813.NIL != var37) ? conses_high.cadr(var37) : module0813.NIL);
            final SubLObject var39 = cdestructuring_bind.property_list_member((SubLObject)module0813.$ic39$, var32);
            final SubLObject var40 = (SubLObject)((module0813.NIL != var39) ? conses_high.cadr(var39) : module0813.NIL);
            PrintLow.format(var5, (SubLObject)module0813.$ic141$, var33);
            if (module0813.NIL != var38) {
                PrintLow.format(var5, (SubLObject)module0813.$ic142$, var38);
            }
            if (module0813.NIL != var40) {
                PrintLow.format(var5, (SubLObject)module0813.$ic143$, var40);
            }
            PrintLow.format(var5, (SubLObject)module0813.$ic137$);
            var29 = var29.rest();
            var30 = var29.first();
        }
        PrintLow.format(var5, (SubLObject)module0813.$ic144$);
        return Sequences.length(var28);
    }
    
    public static SubLObject f52148(final SubLObject var21) {
        SubLObject var22 = (SubLObject)module0813.NIL;
        SubLObject var23 = f52149(var21);
        SubLObject var24 = (SubLObject)module0813.NIL;
        var24 = var23.first();
        while (module0813.NIL != var23) {
            final SubLObject var25 = f52150(var21, var24);
            final SubLObject var26 = f52151(var21, var24);
            var22 = (SubLObject)ConsesLow.cons(reader.bq_cons(var24, ConsesLow.append((SubLObject)((module0813.NIL != var25) ? ConsesLow.list((SubLObject)module0813.$ic123$, var25) : module0813.NIL), (SubLObject)((module0813.NIL != var26) ? ConsesLow.list((SubLObject)module0813.$ic39$, var26) : module0813.NIL), (SubLObject)module0813.NIL)), var22);
            var23 = var23.rest();
            var24 = var23.first();
        }
        return Sequences.nreverse(var22);
    }
    
    public static SubLObject f52145(final SubLObject var21) {
        return Errors.error((SubLObject)module0813.$ic145$);
    }
    
    public static SubLObject f52146(final SubLObject var21) {
        return Errors.error((SubLObject)module0813.$ic146$);
    }
    
    public static SubLObject f52147(final SubLObject var21) {
        return Errors.error((SubLObject)module0813.$ic147$);
    }
    
    public static SubLObject f52149(final SubLObject var21) {
        return Errors.error((SubLObject)module0813.$ic148$);
    }
    
    public static SubLObject f52150(final SubLObject var21, final SubLObject var35) {
        return Errors.error((SubLObject)module0813.$ic149$);
    }
    
    public static SubLObject f52151(final SubLObject var21, final SubLObject var35) {
        return Errors.error((SubLObject)module0813.$ic150$);
    }
    
    public static SubLObject f52152(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var2.isSymbol() && module0813.NIL != var2 && !var2.isKeyword());
    }
    
    public static SubLObject f52153(final SubLObject var48) {
        return Symbols.make_keyword(Symbols.symbol_name(var48));
    }
    
    public static SubLObject f52109(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = f52071(var3);
        final SubLObject var6 = f52072(var3);
        final SubLObject var7 = f52073(var3);
        final SubLObject var8 = f52076(var3);
        final SubLObject var9 = f52075(var3);
        final SubLObject var10 = f52092(var3);
        SubLObject var11 = (SubLObject)module0813.NIL;
        final SubLObject var12 = module0813.$g6451$.currentBinding(var4);
        try {
            module0813.$g6451$.bind(var3, var4);
            final SubLObject var13 = var6;
            if (var13.eql((SubLObject)module0813.$ic83$)) {
                if (!var5.equal((SubLObject)module0813.$ic151$)) {
                    var4.resetMultipleValues();
                    final SubLObject var14 = f52094(var5, var6, var7, var8);
                    final SubLObject var15 = var4.secondMultipleValue();
                    final SubLObject var16 = var4.thirdMultipleValue();
                    var4.resetMultipleValues();
                    var11 = module0816.f52357(var5, var9, var16, var10, var15, var14);
                }
            }
            else if (var13.eql((SubLObject)module0813.$ic85$)) {
                module0819.f52637(var3, (SubLObject)module0813.UNPROVIDED);
            }
            else {
                Errors.error((SubLObject)module0813.$ic113$, var6);
            }
        }
        finally {
            module0813.$g6451$.rebind(var12, var4);
        }
        return var11;
    }
    
    public static SubLObject f52111(final SubLObject var3) {
        if (module0813.NIL != f52034(var3)) {
            final SubLObject var4 = f52075(var3);
            final SubLObject var5 = f52078(var3);
            final SubLObject var6 = Sequences.cconcatenate(var4, module0813.$g6456$.getGlobalValue());
            module0810.f51742(var5, var6);
            return (SubLObject)module0813.T;
        }
        return (SubLObject)module0813.NIL;
    }
    
    public static SubLObject f52094(final SubLObject var21, final SubLObject var22, final SubLObject var23, final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        var28.resetMultipleValues();
        final SubLObject var29 = f52116(var21, var22, var23, var27);
        final SubLObject var30 = var28.secondMultipleValue();
        var28.resetMultipleValues();
        final SubLObject var31 = Sequences.length(var30);
        SubLObject var32 = (SubLObject)module0813.NIL;
        SubLObject var33 = (SubLObject)module0813.NIL;
        SubLObject var34 = var29;
        SubLObject var35 = (SubLObject)module0813.NIL;
        var35 = var34.first();
        while (module0813.NIL != var34) {
            SubLObject var37;
            final SubLObject var36 = var37 = var35;
            SubLObject var38 = (SubLObject)module0813.NIL;
            SubLObject var39 = (SubLObject)module0813.NIL;
            SubLObject var40 = (SubLObject)module0813.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var37, var36, (SubLObject)module0813.$ic81$);
            var38 = var37.first();
            var37 = var37.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var37, var36, (SubLObject)module0813.$ic81$);
            var39 = var37.first();
            var37 = var37.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var37, var36, (SubLObject)module0813.$ic81$);
            var40 = var37.first();
            var37 = var37.rest();
            if (module0813.NIL == var37) {
                var38 = conses_high.nthcdr(var31, var38);
                var32 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var38, var39), var32);
                SubLObject var41 = Sequences.find(var38, var33, Symbols.symbol_function((SubLObject)module0813.EQUAL), Symbols.symbol_function((SubLObject)module0813.$ic153$), (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED);
                if (module0813.NIL == var41) {
                    var41 = (SubLObject)ConsesLow.list(var38, (SubLObject)module0813.NIL);
                    var33 = (SubLObject)ConsesLow.cons(var41, var33);
                }
                ConsesLow.set_nth((SubLObject)module0813.ONE_INTEGER, var41, (SubLObject)ConsesLow.cons(var39, ConsesLow.nth((SubLObject)module0813.ONE_INTEGER, var41)));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var36, (SubLObject)module0813.$ic81$);
            }
            var34 = var34.rest();
            var35 = var34.first();
        }
        var34 = var33;
        SubLObject var42 = (SubLObject)module0813.NIL;
        var42 = var34.first();
        while (module0813.NIL != var34) {
            SubLObject var44;
            final SubLObject var43 = var44 = var42;
            SubLObject var38 = (SubLObject)module0813.NIL;
            SubLObject var45 = (SubLObject)module0813.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var44, var43, (SubLObject)module0813.$ic154$);
            var38 = var44.first();
            var44 = var44.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var44, var43, (SubLObject)module0813.$ic154$);
            var45 = var44.first();
            var44 = var44.rest();
            if (module0813.NIL == var44) {
                ConsesLow.set_nth((SubLObject)module0813.ONE_INTEGER, var42, Sequences.nreverse(var45));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var43, (SubLObject)module0813.$ic154$);
            }
            var34 = var34.rest();
            var42 = var34.first();
        }
        var33 = Sequences.nreverse(var33);
        var32 = Sequences.nreverse(var32);
        return Values.values(var33, var32, var30);
    }
    
    public static SubLObject f52154(final SubLObject var21, final SubLObject var43) {
        SubLObject var44 = (SubLObject)module0813.NIL;
        SubLObject var45 = var43;
        SubLObject var46 = (SubLObject)module0813.NIL;
        var46 = var45.first();
        while (module0813.NIL != var45) {
            SubLObject var48;
            final SubLObject var47 = var48 = var46;
            SubLObject var49 = (SubLObject)module0813.NIL;
            SubLObject var50 = (SubLObject)module0813.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var48, var47, (SubLObject)module0813.$ic154$);
            var49 = var48.first();
            var48 = var48.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var48, var47, (SubLObject)module0813.$ic154$);
            var50 = var48.first();
            var48 = var48.rest();
            if (module0813.NIL == var48) {
                final SubLObject var51 = (module0813.NIL != var49) ? module0035.f2114(var49) : var21;
                var44 = (SubLObject)ConsesLow.cons(var51, var44);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var47, (SubLObject)module0813.$ic154$);
            }
            var45 = var45.rest();
            var46 = var45.first();
        }
        return Sequences.nreverse(var44);
    }
    
    public static SubLObject f52155(final SubLObject var43) {
        SubLObject var44 = (SubLObject)module0813.NIL;
        SubLObject var45 = (SubLObject)module0813.NIL;
        SubLObject var46 = var43;
        SubLObject var47 = (SubLObject)module0813.NIL;
        var47 = var46.first();
        while (module0813.NIL != var46) {
            SubLObject var49;
            final SubLObject var48 = var49 = var47;
            SubLObject var50 = (SubLObject)module0813.NIL;
            SubLObject var51 = (SubLObject)module0813.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)module0813.$ic154$);
            var50 = var49.first();
            var49 = var49.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)module0813.$ic154$);
            var51 = var49.first();
            var49 = var49.rest();
            if (module0813.NIL == var49) {
                if (module0813.NIL != var50) {
                    final SubLObject var52 = var50;
                    if (module0813.NIL == conses_high.member(var52, var44, Symbols.symbol_function((SubLObject)module0813.EQUAL), Symbols.symbol_function((SubLObject)module0813.IDENTITY))) {
                        var44 = (SubLObject)ConsesLow.cons(var52, var44);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var48, (SubLObject)module0813.$ic154$);
            }
            var46 = var46.rest();
            var47 = var46.first();
        }
        var46 = var44;
        SubLObject var53 = (SubLObject)module0813.NIL;
        var53 = var46.first();
        while (module0813.NIL != var46) {
            SubLObject var54;
            SubLObject var55;
            SubLObject var57;
            SubLObject var56;
            for (var54 = Sequences.length(var53), var55 = (SubLObject)module0813.NIL, var55 = (SubLObject)module0813.ZERO_INTEGER; var55.numL(var54); var55 = Numbers.add(var55, (SubLObject)module0813.ONE_INTEGER)) {
                var56 = (var57 = Sequences.subseq(var53, (SubLObject)module0813.ZERO_INTEGER, module0048.f_1X(var55)));
                if (module0813.NIL == conses_high.member(var57, var45, Symbols.symbol_function((SubLObject)module0813.EQUAL), Symbols.symbol_function((SubLObject)module0813.IDENTITY))) {
                    var45 = (SubLObject)ConsesLow.cons(var57, var45);
                }
            }
            var46 = var46.rest();
            var53 = var46.first();
        }
        return module0213.f13926(var45, (SubLObject)module0813.NIL, (SubLObject)module0813.NIL, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED);
    }
    
    public static SubLObject f52156(final SubLObject var33) {
        final SubLObject var34 = f52032();
        f52135(var34, var33);
        f52111(var34);
        return var33;
    }
    
    public static SubLObject f52157(final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        SubLObject var37 = (SubLObject)module0813.NIL;
        if (module0813.NIL == var37) {
            SubLObject var38 = module0809.f51547(var35);
            SubLObject var39 = (SubLObject)module0813.NIL;
            var39 = var38.first();
            while (module0813.NIL == var37 && module0813.NIL != var38) {
                if (module0813.NIL != Symbols.fboundp(var39) && !var39.isMacroOperator()) {
                    SubLObject var40 = (SubLObject)module0813.NIL;
                    try {
                        var36.throwStack.push(module0003.$g3$.getGlobalValue());
                        final SubLObject var41 = Errors.$error_handler$.currentBinding(var36);
                        try {
                            Errors.$error_handler$.bind((SubLObject)module0813.$ic155$, var36);
                            try {
                                module0004.f86(var39);
                            }
                            catch (Throwable var42) {
                                Errors.handleThrowable(var42, (SubLObject)module0813.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(var41, var36);
                        }
                    }
                    catch (Throwable var43) {
                        var40 = Errors.handleThrowable(var43, module0003.$g3$.getGlobalValue());
                    }
                    finally {
                        var36.throwStack.pop();
                    }
                    if (module0813.NIL != var40) {
                        var37 = var39;
                    }
                }
                var38 = var38.rest();
                var39 = var38.first();
            }
        }
        return var37;
    }
    
    public static SubLObject f52158(final SubLObject var194, SubLObject var22, SubLObject var5, SubLObject var94) {
        if (var22 == module0813.UNPROVIDED) {
            var22 = (SubLObject)module0813.$ic83$;
        }
        if (var5 == module0813.UNPROVIDED) {
            var5 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var94 == module0813.UNPROVIDED) {
            var94 = (SubLObject)module0813.NIL;
        }
        final SubLThread var195 = SubLProcess.currentSubLThread();
        final SubLObject var196 = module0811.f51795(var194, var22, var94);
        final SubLObject var197 = reader.$features$.currentBinding(var195);
        try {
            reader.$features$.bind(conses_high.adjoin(var22, var94, (SubLObject)module0813.UNPROVIDED, (SubLObject)module0813.UNPROVIDED), var195);
            final SubLObject var198 = var22;
            if (var198.eql((SubLObject)module0813.$ic83$)) {
                module0816.f52253(var196, var5, (SubLObject)module0813.ZERO_INTEGER);
            }
            else if (var198.eql((SubLObject)module0813.$ic85$)) {
                module0819.f52474(var196, var5, (SubLObject)module0813.ZERO_INTEGER);
            }
            else {
                Errors.error((SubLObject)module0813.$ic156$, var22);
            }
        }
        finally {
            reader.$features$.rebind(var197, var195);
        }
        return (SubLObject)module0813.NIL;
    }
    
    public static SubLObject f52159(final SubLObject var194, SubLObject var22, SubLObject var94) {
        if (var22 == module0813.UNPROVIDED) {
            var22 = (SubLObject)module0813.$ic83$;
        }
        if (var94 == module0813.UNPROVIDED) {
            var94 = (SubLObject)module0813.NIL;
        }
        SubLObject var195 = (SubLObject)module0813.NIL;
        SubLObject var196 = (SubLObject)module0813.NIL;
        try {
            var196 = streams_high.make_private_string_output_stream();
            f52158(var194, var22, var196, var94);
            var195 = streams_high.get_output_stream_string(var196);
        }
        finally {
            final SubLObject var197 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0813.T);
                streams_high.close(var196, (SubLObject)module0813.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var197);
            }
        }
        return var195;
    }
    
    public static SubLObject f52160() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52030", "S#56866", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52031", "S#56867", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52032", "S#56043", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52033", "S#56868", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52035", "S#56869", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52037", "S#56870", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52039", "S#56857", 1, 0, false);
        new $f52039$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52040", "S#56871", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52041", "S#56872", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52042", "S#56873", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52043", "S#56874", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52044", "S#56875", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52045", "S#56876", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52046", "S#56877", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52047", "S#56878", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52048", "S#56879", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52049", "S#56880", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52050", "S#56881", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52051", "S#56882", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52052", "S#56883", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52053", "S#56884", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52054", "S#56885", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52055", "S#56886", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52056", "S#56887", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52057", "S#56888", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52058", "S#56889", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52059", "S#56890", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52060", "S#56891", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52061", "S#56892", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52062", "S#56893", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52063", "S#56894", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52064", "S#56895", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52065", "S#56896", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52066", "S#56897", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52067", "S#56898", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52068", "S#56899", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52038", "S#56900", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52069", "S#56901", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52070", "S#56902", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52071", "S#56903", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52072", "S#56050", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52073", "S#56046", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52074", "S#56904", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52075", "S#56905", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52076", "S#56906", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52077", "S#56044", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52078", "S#56416", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52079", "S#56045", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52080", "S#56907", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52081", "S#56908", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52036", "S#56909", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52034", "S#56910", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52082", "S#56047", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52083", "S#56049", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52084", "S#56911", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52085", "S#56057", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52086", "S#56048", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52087", "S#56912", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52089", "S#56740", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52090", "S#56741", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52091", "S#56742", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52092", "S#56913", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52093", "S#56914", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52095", "S#56915", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52096", "S#56916", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52097", "S#56917", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52098", "S#56918", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52099", "S#56919", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52100", "S#56920", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52101", "S#56921", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52102", "S#56922", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52103", "S#56923", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52106", "S#56924", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52108", "S#56925", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52110", "S#56926", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52112", "S#56739", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52113", "S#56927", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52114", "S#56928", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52105", "S#56929", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52116", "S#56930", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52117", "S#56931", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52118", "S#56932", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52129", "S#56933", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52131", "S#56934", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52130", "S#56935", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52132", "S#56936", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52128", "S#56937", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52088", "S#56938", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52119", "S#56939", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52133", "S#56940", 1, 3, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0813", "f52134", "S#56941");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52115", "S#56942", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52135", "S#56943", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52136", "S#56944", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52137", "S#56945", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52138", "S#56946", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52107", "S#56947", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52120", "S#56948", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0813", "f52139", "S#56949");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52140", "S#56950", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52121", "S#56951", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52123", "S#56952", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52122", "S#56953", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52126", "S#56954", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52141", "S#56955", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52127", "S#56956", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52125", "S#56957", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52124", "S#56958", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52104", "S#56959", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52142", "S#56960", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52143", "S#56961", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52144", "S#56962", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52148", "S#56963", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52145", "S#56964", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52146", "S#56965", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52147", "S#56966", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52149", "S#56967", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52150", "S#56968", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52151", "S#56969", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52152", "S#56970", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52153", "S#56971", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52109", "S#56972", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52111", "S#56973", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52094", "S#56974", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52154", "S#56975", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52155", "S#56976", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52156", "S#56417", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52157", "S#56977", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52158", "S#56978", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0813", "f52159", "S#56979", 1, 2, false);
        return (SubLObject)module0813.NIL;
    }
    
    public static SubLObject f52161() {
        module0813.$g6449$ = SubLFiles.defvar("S#56980", (SubLObject)module0813.T);
        module0813.$g6450$ = SubLFiles.deflexical("S#56981", (SubLObject)module0813.$ic0$);
        module0813.$g6451$ = SubLFiles.defvar("S#56982", (SubLObject)module0813.NIL);
        module0813.$g6452$ = SubLFiles.defconstant("S#56983", (SubLObject)module0813.$ic2$);
        module0813.$g6453$ = SubLFiles.defparameter("S#56984", (SubLObject)module0813.T);
        module0813.$g6454$ = SubLFiles.defparameter("S#56985", (SubLObject)module0813.NIL);
        module0813.$g6455$ = SubLFiles.defparameter("S#56986", (SubLObject)module0813.$ic103$);
        module0813.$g6456$ = SubLFiles.deflexical("S#56987", (SubLObject)module0813.$ic152$);
        return (SubLObject)module0813.NIL;
    }
    
    public static SubLObject f52162() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0813.$g6452$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0813.$ic9$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0813.$ic10$);
        Structures.def_csetf((SubLObject)module0813.$ic11$, (SubLObject)module0813.$ic12$);
        Structures.def_csetf((SubLObject)module0813.$ic13$, (SubLObject)module0813.$ic14$);
        Structures.def_csetf((SubLObject)module0813.$ic15$, (SubLObject)module0813.$ic16$);
        Structures.def_csetf((SubLObject)module0813.$ic17$, (SubLObject)module0813.$ic18$);
        Structures.def_csetf((SubLObject)module0813.$ic19$, (SubLObject)module0813.$ic20$);
        Structures.def_csetf((SubLObject)module0813.$ic21$, (SubLObject)module0813.$ic22$);
        Structures.def_csetf((SubLObject)module0813.$ic23$, (SubLObject)module0813.$ic24$);
        Structures.def_csetf((SubLObject)module0813.$ic25$, (SubLObject)module0813.$ic26$);
        Structures.def_csetf((SubLObject)module0813.$ic27$, (SubLObject)module0813.$ic28$);
        Structures.def_csetf((SubLObject)module0813.$ic29$, (SubLObject)module0813.$ic30$);
        Structures.def_csetf((SubLObject)module0813.$ic31$, (SubLObject)module0813.$ic32$);
        Structures.def_csetf((SubLObject)module0813.$ic33$, (SubLObject)module0813.$ic34$);
        Structures.def_csetf((SubLObject)module0813.$ic35$, (SubLObject)module0813.$ic36$);
        Equality.identity((SubLObject)module0813.$ic2$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0813.$g6452$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0813.$ic55$));
        return (SubLObject)module0813.NIL;
    }
    
    public void declareFunctions() {
        f52160();
    }
    
    public void initializeVariables() {
        f52161();
    }
    
    public void runTopLevelForms() {
        f52162();
    }
    
    static {
        me = (SubLFile)new module0813();
        module0813.$g6449$ = null;
        module0813.$g6450$ = null;
        module0813.$g6451$ = null;
        module0813.$g6452$ = null;
        module0813.$g6453$ = null;
        module0813.$g6454$ = null;
        module0813.$g6455$ = null;
        module0813.$g6456$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SL2C"), (SubLObject)SubLObjectFactory.makeKeyword("SL2JAVA"));
        $ic1$ = SubLObjectFactory.makeKeyword("NONE");
        $ic2$ = SubLObjectFactory.makeSymbol("S#56856", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#56857", "CYC");
        $ic4$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#208", "CYC"), SubLObjectFactory.makeSymbol("S#56988", "CYC"), SubLObjectFactory.makeSymbol("S#56381", "CYC"), SubLObjectFactory.makeSymbol("S#56989", "CYC"), SubLObjectFactory.makeSymbol("S#56990", "CYC"), SubLObjectFactory.makeSymbol("S#56991", "CYC"), SubLObjectFactory.makeSymbol("S#298", "CYC"), SubLObjectFactory.makeSymbol("S#56992", "CYC"), SubLObjectFactory.makeSymbol("S#56993", "CYC"), SubLObjectFactory.makeSymbol("S#56994", "CYC"), SubLObjectFactory.makeSymbol("S#56995", "CYC"), SubLObjectFactory.makeSymbol("S#56414", "CYC"), SubLObjectFactory.makeSymbol("S#56996", "CYC") });
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SYSTEM"), SubLObjectFactory.makeKeyword("BACKEND"), SubLObjectFactory.makeKeyword("FEATURES"), SubLObjectFactory.makeKeyword("INPUT-DIRECTORY"), SubLObjectFactory.makeKeyword("OUTPUT-DIRECTORY"), SubLObjectFactory.makeKeyword("MANIFEST-FILE"), SubLObjectFactory.makeKeyword("MODULES"), SubLObjectFactory.makeKeyword("MODULE-FILENAME-TABLE"), SubLObjectFactory.makeKeyword("MODULE-FEATURES-TABLE"), SubLObjectFactory.makeKeyword("MODULE-INITIALIZATION-TABLE"), SubLObjectFactory.makeKeyword("XREF-DATABASE"), SubLObjectFactory.makeKeyword("SECURE-ID-DATABASE"), SubLObjectFactory.makeKeyword("LAST-TRANSLATION-TIME") });
        $ic6$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#56871", "CYC"), SubLObjectFactory.makeSymbol("S#56872", "CYC"), SubLObjectFactory.makeSymbol("S#56873", "CYC"), SubLObjectFactory.makeSymbol("S#56874", "CYC"), SubLObjectFactory.makeSymbol("S#56875", "CYC"), SubLObjectFactory.makeSymbol("S#56876", "CYC"), SubLObjectFactory.makeSymbol("S#56877", "CYC"), SubLObjectFactory.makeSymbol("S#56878", "CYC"), SubLObjectFactory.makeSymbol("S#56879", "CYC"), SubLObjectFactory.makeSymbol("S#56880", "CYC"), SubLObjectFactory.makeSymbol("S#56881", "CYC"), SubLObjectFactory.makeSymbol("S#56882", "CYC"), SubLObjectFactory.makeSymbol("S#56883", "CYC") });
        $ic7$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#56884", "CYC"), SubLObjectFactory.makeSymbol("S#56885", "CYC"), SubLObjectFactory.makeSymbol("S#56886", "CYC"), SubLObjectFactory.makeSymbol("S#56887", "CYC"), SubLObjectFactory.makeSymbol("S#56888", "CYC"), SubLObjectFactory.makeSymbol("S#56889", "CYC"), SubLObjectFactory.makeSymbol("S#56890", "CYC"), SubLObjectFactory.makeSymbol("S#56891", "CYC"), SubLObjectFactory.makeSymbol("S#56892", "CYC"), SubLObjectFactory.makeSymbol("S#56893", "CYC"), SubLObjectFactory.makeSymbol("S#56894", "CYC"), SubLObjectFactory.makeSymbol("S#56895", "CYC"), SubLObjectFactory.makeSymbol("S#56896", "CYC") });
        $ic8$ = SubLObjectFactory.makeSymbol("S#56900", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#56870", "CYC");
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#56857", "CYC"));
        $ic11$ = SubLObjectFactory.makeSymbol("S#56871", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#56884", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#56872", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#56885", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#56873", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#56886", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#56874", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#56887", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#56875", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#56888", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#56876", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#56889", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#56877", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#56890", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#56878", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#56891", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#56879", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#56892", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#56880", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#56893", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#56881", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#56894", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#56882", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#56895", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#56883", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#56896", "CYC");
        $ic37$ = SubLObjectFactory.makeKeyword("SYSTEM");
        $ic38$ = SubLObjectFactory.makeKeyword("BACKEND");
        $ic39$ = SubLObjectFactory.makeKeyword("FEATURES");
        $ic40$ = SubLObjectFactory.makeKeyword("INPUT-DIRECTORY");
        $ic41$ = SubLObjectFactory.makeKeyword("OUTPUT-DIRECTORY");
        $ic42$ = SubLObjectFactory.makeKeyword("MANIFEST-FILE");
        $ic43$ = SubLObjectFactory.makeKeyword("MODULES");
        $ic44$ = SubLObjectFactory.makeKeyword("MODULE-FILENAME-TABLE");
        $ic45$ = SubLObjectFactory.makeKeyword("MODULE-FEATURES-TABLE");
        $ic46$ = SubLObjectFactory.makeKeyword("MODULE-INITIALIZATION-TABLE");
        $ic47$ = SubLObjectFactory.makeKeyword("XREF-DATABASE");
        $ic48$ = SubLObjectFactory.makeKeyword("SECURE-ID-DATABASE");
        $ic49$ = SubLObjectFactory.makeKeyword("LAST-TRANSLATION-TIME");
        $ic50$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic51$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic52$ = SubLObjectFactory.makeSymbol("S#56897", "CYC");
        $ic53$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic54$ = SubLObjectFactory.makeKeyword("END");
        $ic55$ = SubLObjectFactory.makeSymbol("S#56899", "CYC");
        $ic56$ = SubLObjectFactory.makeString("#<");
        $ic57$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic58$ = SubLObjectFactory.makeString("~A~A ~S ~S features, ~S modules");
        $ic59$ = SubLObjectFactory.makeString("secure ");
        $ic60$ = SubLObjectFactory.makeString("");
        $ic61$ = SubLObjectFactory.makeKeyword("BASE");
        $ic62$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic63$ = SubLObjectFactory.makeSymbol("S#56867", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#747", "CYC");
        $ic65$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic66$ = SubLObjectFactory.makeSymbol("S#56418", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("DIRECTORY-P");
        $ic68$ = SubLObjectFactory.makeString("Security level ~A does not match security level ~A of provided secure ID database.~%");
        $ic69$ = SubLObjectFactory.makeInteger(1000);
        $ic70$ = SubLObjectFactory.makeKeyword("FREE");
        $ic71$ = SubLObjectFactory.makeSymbol("S#4951", "CYC");
        $ic72$ = SubLObjectFactory.makeKeyword("CYC-TRANSLATE");
        $ic73$ = SubLObjectFactory.makeInteger(1970);
        $ic74$ = SubLObjectFactory.makeSymbol("SYMBOLP");
        $ic75$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("S#208", "CYC"), SubLObjectFactory.makeSymbol("S#56988", "CYC"), SubLObjectFactory.makeSymbol("S#56381", "CYC"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56504", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("NONE")), SubLObjectFactory.makeSymbol("S#56989", "CYC"), SubLObjectFactory.makeSymbol("S#56990", "CYC"), SubLObjectFactory.makeSymbol("S#56997", "CYC"), SubLObjectFactory.makeSymbol("S#56998", "CYC") });
        $ic76$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SYSTEM"), (SubLObject)SubLObjectFactory.makeKeyword("BACKEND"), (SubLObject)SubLObjectFactory.makeKeyword("FEATURES"), (SubLObject)SubLObjectFactory.makeKeyword("SECURITY-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT-DIRECTORY"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-DIRECTORY"), (SubLObject)SubLObjectFactory.makeKeyword("SYSTEM-MANIFEST"), (SubLObject)SubLObjectFactory.makeKeyword("INITIAL-SID-DB"));
        $ic77$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic78$ = SubLObjectFactory.makeKeyword("SECURITY-LEVEL");
        $ic79$ = SubLObjectFactory.makeKeyword("SYSTEM-MANIFEST");
        $ic80$ = SubLObjectFactory.makeKeyword("INITIAL-SID-DB");
        $ic81$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56999", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#57000", "CYC"));
        $ic82$ = SubLObjectFactory.makeString("lisp");
        $ic83$ = SubLObjectFactory.makeKeyword("SL2C");
        $ic84$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("SUBLISP"));
        $ic85$ = SubLObjectFactory.makeKeyword("SL2JAVA");
        $ic86$ = SubLObjectFactory.makeString("c");
        $ic87$ = SubLObjectFactory.makeString("java");
        $ic88$ = SubLObjectFactory.makeString("Time to specify the output file extension for backend ~S");
        $ic89$ = SubLObjectFactory.makeString("Time to specify the output module filename for backend ~S");
        $ic90$ = SubLObjectFactory.makeString("module~4,'0D");
        $ic91$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#200", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26276", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic92$ = SubLObjectFactory.makeUninternedSymbol("US#53E20D5");
        $ic93$ = SubLObjectFactory.makeSymbol("CLET");
        $ic94$ = SubLObjectFactory.makeSymbol("WHILE");
        $ic95$ = SubLObjectFactory.makeSymbol("CNOT");
        $ic96$ = SubLObjectFactory.makeSymbol("WITH-SIMPLE-RESTART");
        $ic97$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic98$ = ConsesLow.list((SubLObject)module0813.T);
        $ic99$ = SubLObjectFactory.makeString("~%Translating ~A to backend ~S with features :~%  ~S ");
        $ic100$ = SubLObjectFactory.makeString("~%Pass 1 : Populating XREF database");
        $ic101$ = SubLObjectFactory.makeString("Scanning modules");
        $ic102$ = SubLObjectFactory.makeString("~%Pass 2 : Translating");
        $ic103$ = SubLObjectFactory.makeString("/usr/bin/sha256sum");
        $ic104$ = SubLObjectFactory.makeString("-");
        $ic105$ = SubLObjectFactory.makeSymbol("ALPHANUMERICP");
        $ic106$ = SubLObjectFactory.makeString("~A failed to produce non-trivial finger-print for ~A: got ~A.");
        $ic107$ = SubLObjectFactory.makeSymbol("S#1545", "CYC");
        $ic108$ = SubLObjectFactory.makeString("Skip ~S");
        $ic109$ = SubLObjectFactory.makeSymbol("S#57001", "CYC");
        $ic110$ = SubLObjectFactory.makeString("Retranslate ~S");
        $ic111$ = SubLObjectFactory.makeString("~%[Starting ~A]");
        $ic112$ = SubLObjectFactory.makeString("/dev/null");
        $ic113$ = SubLObjectFactory.makeString("backend ~S is not yet supported");
        $ic114$ = SubLObjectFactory.makeString("~%[Finished ~A]");
        $ic115$ = SubLObjectFactory.makeString("The manifest file ~S is not available.");
        $ic116$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic117$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic118$ = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
        $ic119$ = SubLObjectFactory.makeKeyword("COMMON-LISP");
        $ic120$ = SubLObjectFactory.makeKeyword("EOF");
        $ic121$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#57002", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#57003", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic122$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic123$ = SubLObjectFactory.makeKeyword("DIRECTORY");
        $ic124$ = SubLObjectFactory.makeString("system-manifest.lisp");
        $ic125$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic126$ = SubLObjectFactory.makeSymbol("STREAMP");
        $ic127$ = SubLObjectFactory.makeString(";;; -*- Mode: LISP; Package: SUBLISP -*-");
        $ic128$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("SUBLISP"), (SubLObject)SubLObjectFactory.makeString("CYCL"));
        $ic129$ = SubLObjectFactory.makeString("(");
        $ic130$ = SubLObjectFactory.makeString(":system ~S");
        $ic131$ = SubLObjectFactory.makeString("~% (");
        $ic132$ = SubLObjectFactory.makeString("~%  :directory ~S");
        $ic133$ = SubLObjectFactory.makeString("~%  :package   ~S");
        $ic134$ = SubLObjectFactory.makeString("~%  :required-systems ");
        $ic135$ = SubLObjectFactory.makeString(" ");
        $ic136$ = SubLObjectFactory.makeString("~S");
        $ic137$ = SubLObjectFactory.makeString(")");
        $ic138$ = SubLObjectFactory.makeString("~% )");
        $ic139$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTORY"), (SubLObject)SubLObjectFactory.makeSymbol("S#56381", "CYC"));
        $ic140$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DIRECTORY"), (SubLObject)SubLObjectFactory.makeKeyword("FEATURES"));
        $ic141$ = SubLObjectFactory.makeString("~% (~S");
        $ic142$ = SubLObjectFactory.makeString(" :directory ~S");
        $ic143$ = SubLObjectFactory.makeString(" :features ~S");
        $ic144$ = SubLObjectFactory.makeString("~%)");
        $ic145$ = SubLObjectFactory.makeString("TRANSLATOR-SYSTEM-DIRECTORY is unimplemented");
        $ic146$ = SubLObjectFactory.makeString("TRANSLATOR-SYSTEM-PACKAGE is unimplemented");
        $ic147$ = SubLObjectFactory.makeString("TRANSLATOR-SYSTEM-REQUIRED-SYSTEMS is unimplemented");
        $ic148$ = SubLObjectFactory.makeString("TRANSLATOR-SYSTEM-MODULES is unimplemented");
        $ic149$ = SubLObjectFactory.makeString("TRANSLATOR-SYSTEM-MODULE-DIRECTORY is unimplemented");
        $ic150$ = SubLObjectFactory.makeString("TRANSLATOR-SYSTEM-MODULE-FEATURES is unimplemented");
        $ic151$ = SubLObjectFactory.makeString("SUBLISP");
        $ic152$ = SubLObjectFactory.makeString("translation-secure-id-database-file.cfasl");
        $ic153$ = SubLObjectFactory.makeSymbol("CAR");
        $ic154$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56999", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#298", "CYC"));
        $ic155$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic156$ = SubLObjectFactory.makeString("Unsupported backend : ~S");
    }
    
    public static final class $sX56856_native extends SubLStructNative
    {
        public SubLObject $system;
        public SubLObject $backend;
        public SubLObject $features;
        public SubLObject $input_directory;
        public SubLObject $output_directory;
        public SubLObject $manifest_file;
        public SubLObject $modules;
        public SubLObject $module_filename_table;
        public SubLObject $module_features_table;
        public SubLObject $module_initialization_table;
        public SubLObject $xref_database;
        public SubLObject $secure_id_database;
        public SubLObject $last_translation_time;
        private static final SubLStructDeclNative structDecl;
        
        public $sX56856_native() {
            this.$system = (SubLObject)CommonSymbols.NIL;
            this.$backend = (SubLObject)CommonSymbols.NIL;
            this.$features = (SubLObject)CommonSymbols.NIL;
            this.$input_directory = (SubLObject)CommonSymbols.NIL;
            this.$output_directory = (SubLObject)CommonSymbols.NIL;
            this.$manifest_file = (SubLObject)CommonSymbols.NIL;
            this.$modules = (SubLObject)CommonSymbols.NIL;
            this.$module_filename_table = (SubLObject)CommonSymbols.NIL;
            this.$module_features_table = (SubLObject)CommonSymbols.NIL;
            this.$module_initialization_table = (SubLObject)CommonSymbols.NIL;
            this.$xref_database = (SubLObject)CommonSymbols.NIL;
            this.$secure_id_database = (SubLObject)CommonSymbols.NIL;
            this.$last_translation_time = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX56856_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$system;
        }
        
        public SubLObject getField3() {
            return this.$backend;
        }
        
        public SubLObject getField4() {
            return this.$features;
        }
        
        public SubLObject getField5() {
            return this.$input_directory;
        }
        
        public SubLObject getField6() {
            return this.$output_directory;
        }
        
        public SubLObject getField7() {
            return this.$manifest_file;
        }
        
        public SubLObject getField8() {
            return this.$modules;
        }
        
        public SubLObject getField9() {
            return this.$module_filename_table;
        }
        
        public SubLObject getField10() {
            return this.$module_features_table;
        }
        
        public SubLObject getField11() {
            return this.$module_initialization_table;
        }
        
        public SubLObject getField12() {
            return this.$xref_database;
        }
        
        public SubLObject getField13() {
            return this.$secure_id_database;
        }
        
        public SubLObject getField14() {
            return this.$last_translation_time;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$system = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$backend = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$features = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$input_directory = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$output_directory = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$manifest_file = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$modules = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$module_filename_table = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$module_features_table = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$module_initialization_table = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$xref_database = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$secure_id_database = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$last_translation_time = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX56856_native.class, module0813.$ic2$, module0813.$ic3$, module0813.$ic4$, module0813.$ic5$, new String[] { "$system", "$backend", "$features", "$input_directory", "$output_directory", "$manifest_file", "$modules", "$module_filename_table", "$module_features_table", "$module_initialization_table", "$xref_database", "$secure_id_database", "$last_translation_time" }, module0813.$ic6$, module0813.$ic7$, module0813.$ic8$);
        }
    }
    
    public static final class $f52039$UnaryFunction extends UnaryFunction
    {
        public $f52039$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#56857"));
        }
        
        public SubLObject processItem(final SubLObject var6) {
            return module0813.f52039(var6);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0813.class
	Total time: 593 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/