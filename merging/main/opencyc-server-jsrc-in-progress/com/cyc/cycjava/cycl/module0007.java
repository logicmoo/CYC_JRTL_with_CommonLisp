package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0007 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0007";
    public static final String myFingerPrint = "275979802cb485ca4f7a11bbeead3ab8529bad07852cae77684b18f6fcb2f5af";
    private static SubLSymbol $g13$;
    private static SubLSymbol $g14$;
    public static SubLSymbol $g15$;
    private static SubLSymbol $g16$;
    public static SubLSymbol $g17$;
    private static SubLSymbol $g18$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLString $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
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
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLInteger $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLList $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLString $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLString $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLList $ic76$;
    private static final SubLList $ic77$;
    private static final SubLList $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLList $ic82$;
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
    private static final SubLString $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLString $ic101$;
    private static final SubLList $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLList $ic104$;
    private static final SubLList $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    
    public static SubLObject f222(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)$ic2$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f223(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)$ic4$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f224(final SubLObject var8, final SubLObject var9) {
        f225(var8, var9, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f226(final SubLObject var8) {
        return (SubLObject)((var8.getClass() == $sX205_native.class) ? T : NIL);
    }
    
    public static SubLObject f227(final SubLObject var8) {
        assert NIL != f226(var8) : var8;
        return var8.getField2();
    }
    
    public static SubLObject f228(final SubLObject var8) {
        assert NIL != f226(var8) : var8;
        return var8.getField3();
    }
    
    public static SubLObject f229(final SubLObject var8) {
        assert NIL != f226(var8) : var8;
        return var8.getField4();
    }
    
    public static SubLObject f230(final SubLObject var8) {
        assert NIL != f226(var8) : var8;
        return var8.getField5();
    }
    
    public static SubLObject f231(final SubLObject var8) {
        assert NIL != f226(var8) : var8;
        return var8.getField6();
    }
    
    public static SubLObject f232(final SubLObject var8) {
        assert NIL != f226(var8) : var8;
        return var8.getField7();
    }
    
    public static SubLObject f233(final SubLObject var8) {
        assert NIL != f226(var8) : var8;
        return var8.getField8();
    }
    
    public static SubLObject f234(final SubLObject var8, final SubLObject var11) {
        assert NIL != f226(var8) : var8;
        return var8.setField2(var11);
    }
    
    public static SubLObject f235(final SubLObject var8, final SubLObject var11) {
        assert NIL != f226(var8) : var8;
        return var8.setField3(var11);
    }
    
    public static SubLObject f236(final SubLObject var8, final SubLObject var11) {
        assert NIL != f226(var8) : var8;
        return var8.setField4(var11);
    }
    
    public static SubLObject f237(final SubLObject var8, final SubLObject var11) {
        assert NIL != f226(var8) : var8;
        return var8.setField5(var11);
    }
    
    public static SubLObject f238(final SubLObject var8, final SubLObject var11) {
        assert NIL != f226(var8) : var8;
        return var8.setField6(var11);
    }
    
    public static SubLObject f239(final SubLObject var8, final SubLObject var11) {
        assert NIL != f226(var8) : var8;
        return var8.setField7(var11);
    }
    
    public static SubLObject f240(final SubLObject var8, final SubLObject var11) {
        assert NIL != f226(var8) : var8;
        return var8.setField8(var11);
    }
    
    public static SubLObject f241(SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLObject var13 = (SubLObject)new $sX205_native();
        SubLObject var14;
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        for (var14 = (SubLObject)NIL, var14 = var12; NIL != var14; var14 = conses_high.cddr(var14)) {
            var15 = var14.first();
            var16 = conses_high.cadr(var14);
            var17 = var15;
            if (var17.eql((SubLObject)$ic28$)) {
                f234(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic29$)) {
                f235(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic30$)) {
                f236(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic31$)) {
                f237(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic32$)) {
                f238(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic33$)) {
                f239(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic34$)) {
                f240(var13, var16);
            }
            else {
                Errors.error((SubLObject)$ic35$, var15);
            }
        }
        return var13;
    }
    
    public static SubLObject f242(final SubLObject var18, final SubLObject var19) {
        Functions.funcall(var19, var18, (SubLObject)$ic36$, (SubLObject)$ic37$, (SubLObject)SEVEN_INTEGER);
        Functions.funcall(var19, var18, (SubLObject)$ic38$, (SubLObject)$ic28$, f227(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic38$, (SubLObject)$ic29$, f228(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic38$, (SubLObject)$ic30$, f229(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic38$, (SubLObject)$ic31$, f230(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic38$, (SubLObject)$ic32$, f231(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic38$, (SubLObject)$ic33$, f232(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic38$, (SubLObject)$ic34$, f233(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic39$, (SubLObject)$ic37$, (SubLObject)SEVEN_INTEGER);
        return var18;
    }
    
    public static SubLObject f243(final SubLObject var18, final SubLObject var19) {
        return f242(var18, var19);
    }
    
    public static SubLObject f225(final SubLObject var20, final SubLObject var9, final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = f244(var20);
        final SubLObject var24 = f245(var20);
        if (NIL != print_high.$print_readably$.getDynamicValue(var22)) {
            print_high.print_not_readable(var20, var9);
        }
        else {
            streams_high.write_string((SubLObject)$ic41$, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var20), new SubLObject[] { $ic42$, var9 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var9);
            PrintLow.format(var9, (SubLObject)$ic43$, var23, var24);
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var9);
        }
        return var20;
    }
    
    public static SubLObject f246(final SubLObject var28) {
        return Numbers.logxor(Sxhash.sxhash(f244(var28)), Sxhash.sxhash(f245(var28)));
    }
    
    public static SubLObject f247(final SubLObject var20) {
        final SubLObject var21 = (SubLObject)ConsesLow.list(f244(var20), f245(var20));
        SubLObject var22 = (SubLObject)NIL;
        final SubLObject var23 = $g13$.getGlobalValue();
        SubLObject var24 = (SubLObject)NIL;
        try {
            var24 = Locks.seize_lock(var23);
            var22 = Hashtables.sethash(var21, $g16$.getGlobalValue(), var20);
        }
        finally {
            if (NIL != var24) {
                Locks.release_lock(var23);
            }
        }
        return var22;
    }
    
    public static SubLObject f248(final SubLObject var20) {
        final SubLObject var21 = (SubLObject)ConsesLow.list(f244(var20), f245(var20));
        SubLObject var22 = (SubLObject)NIL;
        final SubLObject var23 = $g13$.getGlobalValue();
        SubLObject var24 = (SubLObject)NIL;
        try {
            var24 = Locks.seize_lock(var23);
            var22 = Hashtables.remhash(var21, $g16$.getGlobalValue());
        }
        finally {
            if (NIL != var24) {
                Locks.release_lock(var23);
            }
        }
        return var22;
    }
    
    public static SubLObject f249(final SubLObject var23, final SubLObject var24) {
        assert NIL != Types.stringp(var23) : var23;
        assert NIL != Types.stringp(var24) : var24;
        final SubLObject var25 = (SubLObject)ConsesLow.list(var23, var24);
        final SubLObject var26 = Hashtables.gethash(var25, $g16$.getGlobalValue(), (SubLObject)UNPROVIDED);
        return var26;
    }
    
    public static SubLObject f250() {
        return module0030.f1627($g16$.getGlobalValue());
    }
    
    public static SubLObject f251(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic49$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic49$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var42_43 = (SubLObject)NIL;
        while (NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic49$);
            var42_43 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic49$);
            if (NIL == conses_high.member(var42_43, (SubLObject)$ic50$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)T;
            }
            if (var42_43 == $ic51$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (NIL != var9 && NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic49$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)$ic30$, var4);
        final SubLObject var11 = (SubLObject)((NIL != var10) ? conses_high.cadr(var10) : NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic52$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : $ic53$);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)$ic54$;
        final SubLObject var16 = (SubLObject)$ic55$;
        final SubLObject var17 = (SubLObject)$ic56$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic57$, (SubLObject)ConsesLow.list((SubLObject)$ic58$, (SubLObject)ConsesLow.list((SubLObject)$ic48$, var11), (SubLObject)ConsesLow.list((SubLObject)$ic59$, (SubLObject)ConsesLow.list((SubLObject)$ic60$, (SubLObject)ConsesLow.list((SubLObject)$ic61$, var11)), (SubLObject)ConsesLow.list((SubLObject)$ic62$, (SubLObject)$ic63$, var11))), (SubLObject)ConsesLow.list((SubLObject)$ic64$, (SubLObject)ConsesLow.list(var15, var6, (SubLObject)$ic65$, var13), (SubLObject)ConsesLow.list((SubLObject)$ic66$, (SubLObject)ConsesLow.list(var16, var17), var15, (SubLObject)ConsesLow.list((SubLObject)$ic67$, var16), (SubLObject)ConsesLow.listS((SubLObject)$ic58$, (SubLObject)ConsesLow.list((SubLObject)$ic68$, (SubLObject)ConsesLow.list((SubLObject)$ic69$, var11), (SubLObject)ConsesLow.list((SubLObject)$ic70$, var11, (SubLObject)ConsesLow.list((SubLObject)EQUAL, var17, var11))), ConsesLow.append(var14, (SubLObject)NIL)))));
    }
    
    public static SubLObject f252() {
        return $g16$.getGlobalValue();
    }
    
    public static SubLObject f253(SubLObject var49, SubLObject var24, SubLObject var50, SubLObject var51) {
        if (var50 == UNPROVIDED) {
            var50 = (SubLObject)NIL;
        }
        if (var51 == UNPROVIDED) {
            var51 = (SubLObject)NIL;
        }
        final SubLThread var52 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var49) : var49;
        assert NIL != Types.stringp(var24) : var24;
        final SubLObject var53 = f254(var24);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var52) && NIL == f255(var53)) {
            Errors.error((SubLObject)$ic73$, var24);
        }
        var49 = Strings.string_downcase(var49, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var24 = Strings.string_downcase(var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var54 = f241((SubLObject)UNPROVIDED);
        f235(var54, var49);
        f236(var54, var24);
        f247(var54);
        f256(var53, var54);
        return var54;
    }
    
    public static SubLObject f257(final SubLObject var23, final SubLObject var24, final SubLObject var51) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f258(final SubLObject var23, final SubLObject var24, final SubLObject var51) {
        return f253(var23, var24, (SubLObject)T, var51);
    }
    
    public static SubLObject f259(final SubLObject var23, final SubLObject var24) {
        assert NIL != Types.stringp(var23) : var23;
        assert NIL != Types.stringp(var24) : var24;
        return f253(var23, var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f244(final SubLObject var20) {
        assert NIL != f226(var20) : var20;
        return f228(var20);
    }
    
    public static SubLObject f245(final SubLObject var20) {
        assert NIL != f226(var20) : var20;
        return f229(var20);
    }
    
    public static SubLObject f260(final SubLObject var20) {
        assert NIL != f226(var20) : var20;
        return f230(var20);
    }
    
    public static SubLObject f261(final SubLObject var20, final SubLObject var53) {
        assert NIL != f226(var20) : var20;
        assert NIL != Types.symbolp(var53) : var53;
        final SubLObject var54 = $g13$.getGlobalValue();
        SubLObject var55 = (SubLObject)NIL;
        try {
            var55 = Locks.seize_lock(var54);
            if (NIL == conses_high.member(var53, f231(var20), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                f238(var20, (SubLObject)ConsesLow.cons(var53, f231(var20)));
            }
        }
        finally {
            if (NIL != var55) {
                Locks.release_lock(var54);
            }
        }
        return f231(var20);
    }
    
    public static SubLObject f262(final SubLObject var20, final SubLObject var53) {
        assert NIL != f226(var20) : var20;
        assert NIL != Types.symbolp(var53) : var53;
        final SubLObject var54 = $g13$.getGlobalValue();
        SubLObject var55 = (SubLObject)NIL;
        try {
            var55 = Locks.seize_lock(var54);
            f238(var20, Sequences.delete(var53, f231(var20), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        finally {
            if (NIL != var55) {
                Locks.release_lock(var54);
            }
        }
        return f231(var20);
    }
    
    public static SubLObject f263(final SubLObject var20) {
        assert NIL != f226(var20) : var20;
        return f231(var20);
    }
    
    public static SubLObject f264(final SubLObject var20, final SubLObject var59) {
        assert NIL != f226(var20) : var20;
        assert NIL != Types.stringp(var59) : var59;
        final SubLObject var60 = $g13$.getGlobalValue();
        SubLObject var61 = (SubLObject)NIL;
        try {
            var61 = Locks.seize_lock(var60);
            if (NIL == conses_high.member(var59, f232(var20), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                f239(var20, (SubLObject)ConsesLow.cons(var59, f232(var20)));
            }
        }
        finally {
            if (NIL != var61) {
                Locks.release_lock(var60);
            }
        }
        return f232(var20);
    }
    
    public static SubLObject f265(final SubLObject var20, final SubLObject var59) {
        assert NIL != f226(var20) : var20;
        assert NIL != Types.stringp(var59) : var59;
        final SubLObject var60 = $g13$.getGlobalValue();
        SubLObject var61 = (SubLObject)NIL;
        try {
            var61 = Locks.seize_lock(var60);
            f239(var20, Sequences.delete(var59, f232(var20), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        finally {
            if (NIL != var61) {
                Locks.release_lock(var60);
            }
        }
        return f232(var20);
    }
    
    public static SubLObject f266(final SubLObject var20) {
        assert NIL != f226(var20) : var20;
        return f232(var20);
    }
    
    public static SubLObject f267(final SubLObject var20) {
        assert NIL != f226(var20) : var20;
        return f233(var20);
    }
    
    public static SubLObject f268(final SubLObject var8, final SubLObject var9) {
        f269(var8, var9, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f255(final SubLObject var8) {
        return (SubLObject)((var8.getClass() == $sX208_native.class) ? T : NIL);
    }
    
    public static SubLObject f270(final SubLObject var8) {
        assert NIL != f255(var8) : var8;
        return var8.getField2();
    }
    
    public static SubLObject f271(final SubLObject var8) {
        assert NIL != f255(var8) : var8;
        return var8.getField3();
    }
    
    public static SubLObject f272(final SubLObject var8) {
        assert NIL != f255(var8) : var8;
        return var8.getField4();
    }
    
    public static SubLObject f273(final SubLObject var8) {
        assert NIL != f255(var8) : var8;
        return var8.getField5();
    }
    
    public static SubLObject f274(final SubLObject var8) {
        assert NIL != f255(var8) : var8;
        return var8.getField6();
    }
    
    public static SubLObject f275(final SubLObject var8, final SubLObject var11) {
        assert NIL != f255(var8) : var8;
        return var8.setField2(var11);
    }
    
    public static SubLObject f276(final SubLObject var8, final SubLObject var11) {
        assert NIL != f255(var8) : var8;
        return var8.setField3(var11);
    }
    
    public static SubLObject f277(final SubLObject var8, final SubLObject var11) {
        assert NIL != f255(var8) : var8;
        return var8.setField4(var11);
    }
    
    public static SubLObject f278(final SubLObject var8, final SubLObject var11) {
        assert NIL != f255(var8) : var8;
        return var8.setField5(var11);
    }
    
    public static SubLObject f279(final SubLObject var8, final SubLObject var11) {
        assert NIL != f255(var8) : var8;
        return var8.setField6(var11);
    }
    
    public static SubLObject f280(SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLObject var13 = (SubLObject)new $sX208_native();
        SubLObject var14;
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        for (var14 = (SubLObject)NIL, var14 = var12; NIL != var14; var14 = conses_high.cddr(var14)) {
            var15 = var14.first();
            var16 = conses_high.cadr(var14);
            var17 = var15;
            if (var17.eql((SubLObject)$ic28$)) {
                f275(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic29$)) {
                f276(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic93$)) {
                f277(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic94$)) {
                f278(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic34$)) {
                f279(var13, var16);
            }
            else {
                Errors.error((SubLObject)$ic35$, var15);
            }
        }
        return var13;
    }
    
    public static SubLObject f281(final SubLObject var18, final SubLObject var19) {
        Functions.funcall(var19, var18, (SubLObject)$ic36$, (SubLObject)$ic95$, (SubLObject)FIVE_INTEGER);
        Functions.funcall(var19, var18, (SubLObject)$ic38$, (SubLObject)$ic28$, f270(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic38$, (SubLObject)$ic29$, f271(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic38$, (SubLObject)$ic93$, f272(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic38$, (SubLObject)$ic94$, f273(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic38$, (SubLObject)$ic34$, f274(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic39$, (SubLObject)$ic95$, (SubLObject)FIVE_INTEGER);
        return var18;
    }
    
    public static SubLObject f282(final SubLObject var18, final SubLObject var19) {
        return f281(var18, var19);
    }
    
    public static SubLObject f269(final SubLObject var45, final SubLObject var9, final SubLObject var21) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        final SubLObject var47 = f283(var45);
        if (NIL != print_high.$print_readably$.getDynamicValue(var46)) {
            print_high.print_not_readable(var45, var9);
        }
        else {
            streams_high.write_string((SubLObject)$ic41$, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var45), new SubLObject[] { $ic42$, var9 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var9);
            PrintLow.format(var9, (SubLObject)$ic97$, var47);
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var9);
        }
        return var45;
    }
    
    public static SubLObject f284(final SubLObject var28) {
        return Sxhash.sxhash(f283(var28));
    }
    
    public static SubLObject f285(final SubLObject var45) {
        final SubLObject var46 = $g14$.getGlobalValue();
        SubLObject var47 = (SubLObject)NIL;
        try {
            var47 = Locks.seize_lock(var46);
            if (NIL == conses_high.member(var45, $g18$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                $g18$.setGlobalValue((SubLObject)ConsesLow.cons(var45, $g18$.getGlobalValue()));
            }
        }
        finally {
            if (NIL != var47) {
                Locks.release_lock(var46);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f286(final SubLObject var45) {
        final SubLObject var46 = $g14$.getGlobalValue();
        SubLObject var47 = (SubLObject)NIL;
        try {
            var47 = Locks.seize_lock(var46);
            $g18$.setGlobalValue(Sequences.remove(var45, $g18$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        finally {
            if (NIL != var47) {
                Locks.release_lock(var46);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f254(final SubLObject var24) {
        assert NIL != Types.stringp(var24) : var24;
        return Sequences.find(var24, $g18$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic100$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f287() {
        return $g18$.getGlobalValue();
    }
    
    public static SubLObject f288(SubLObject var24, SubLObject var50, SubLObject var74) {
        if (var50 == UNPROVIDED) {
            var50 = (SubLObject)NIL;
        }
        if (var74 == UNPROVIDED) {
            var74 = (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var24) : var24;
        var24 = Strings.string_downcase(var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var75 = f280((SubLObject)UNPROVIDED);
        f276(var75, var24);
        f285(var75);
        return var75;
    }
    
    public static SubLObject f289(final SubLObject var24, final SubLObject var74) {
        assert NIL != Types.stringp(var24) : var24;
        assert NIL != Types.stringp(var74) : var74;
        final SubLObject var75 = f254(var24);
        if (NIL != f255(var75)) {
            return var75;
        }
        return f290(var24, var74);
    }
    
    public static SubLObject f290(final SubLObject var24, final SubLObject var74) {
        assert NIL != Types.stringp(var24) : var24;
        assert NIL != Types.stringp(var74) : var74;
        final SubLObject var75 = f254(var24);
        if (NIL != f255(var75)) {
            Errors.error((SubLObject)$ic101$, var24);
            return (SubLObject)NIL;
        }
        return f288(var24, (SubLObject)T, var74);
    }
    
    public static SubLObject f291(final SubLObject var24) {
        assert NIL != Types.stringp(var24) : var24;
        return f288(var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f283(final SubLObject var45) {
        assert NIL != f255(var45) : var45;
        return f271(var45);
    }
    
    public static SubLObject f292(final SubLObject var45) {
        assert NIL != f255(var45) : var45;
        return f272(var45);
    }
    
    public static SubLObject f293(final SubLObject var45, SubLObject var76) {
        if (var76 == UNPROVIDED) {
            var76 = (SubLObject)NIL;
        }
        assert NIL != f255(var45) : var45;
        return Sequences.reverse(f273(var45));
    }
    
    public static SubLObject f256(final SubLObject var45, final SubLObject var20) {
        assert NIL != f255(var45) : var45;
        assert NIL != f226(var20) : var20;
        final SubLObject var46 = $g14$.getGlobalValue();
        SubLObject var47 = (SubLObject)NIL;
        try {
            var47 = Locks.seize_lock(var46);
            f278(var45, conses_high.adjoin(var20, f273(var45), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        finally {
            if (NIL != var47) {
                Locks.release_lock(var46);
            }
        }
        return f273(var45);
    }
    
    public static SubLObject f294(final SubLObject var45, final SubLObject var20) {
        assert NIL != f255(var45) : var45;
        assert NIL != f226(var20) : var20;
        final SubLObject var46 = $g14$.getGlobalValue();
        SubLObject var47 = (SubLObject)NIL;
        try {
            var47 = Locks.seize_lock(var46);
            f278(var45, Sequences.delete(var20, f273(var45), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        finally {
            if (NIL != var47) {
                Locks.release_lock(var46);
            }
        }
        return f273(var45);
    }
    
    public static SubLObject f295(final SubLObject var45) {
        assert NIL != f255(var45) : var45;
        return f274(var45);
    }
    
    public static SubLObject f296(final SubLObject var24, SubLObject var81) {
        if (var81 == UNPROVIDED) {
            var81 = (SubLObject)NIL;
        }
        final SubLThread var82 = SubLProcess.currentSubLThread();
        final SubLObject var83 = f254(var24);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var82) && NIL == f255(var83)) {
            Errors.error((SubLObject)$ic73$, var24);
        }
        SubLObject var84 = (SubLObject)NIL;
        if (NIL != f255(var83)) {
            SubLObject var85 = f293(var83, (SubLObject)UNPROVIDED);
            SubLObject var86 = (SubLObject)NIL;
            var86 = var85.first();
            while (NIL != var85) {
                var84 = (SubLObject)ConsesLow.cons(f244(var86), var84);
                var85 = var85.rest();
                var86 = var85.first();
            }
        }
        return Sequences.nreverse(var84);
    }
    
    public static SubLObject f297(SubLObject var81) {
        if (var81 == UNPROVIDED) {
            var81 = (SubLObject)NIL;
        }
        final SubLObject var82 = f287();
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic100$), var82);
    }
    
    public static SubLObject f298(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic102$);
        var6 = var5.first();
        var5 = var5.rest();
        if (NIL != var5) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic102$);
            return (SubLObject)NIL;
        }
        if (NIL != Sequences.find((SubLObject)$ic103$, reader.$features$.getDynamicValue(var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)$ic104$;
        }
        final SubLObject var7 = f293(f254(var6), (SubLObject)UNPROVIDED);
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var7;
        SubLObject var10 = (SubLObject)NIL;
        var10 = var9.first();
        while (NIL != var9) {
            final SubLObject var11 = f244(var10);
            var8 = (SubLObject)ConsesLow.cons(var11, var8);
            var9 = var9.rest();
            var10 = var9.first();
        }
        var8 = Sequences.nreverse(var8);
        return (SubLObject)ConsesLow.list((SubLObject)$ic57$, (SubLObject)$ic105$, (SubLObject)ConsesLow.list((SubLObject)$ic106$, (SubLObject)ConsesLow.list((SubLObject)$ic107$, (SubLObject)ConsesLow.list((SubLObject)$ic108$, var8)), (SubLObject)ConsesLow.list((SubLObject)$ic109$, (SubLObject)$ic107$, var6)));
    }
    
    public static SubLObject f299() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0007", "f222", "S#210");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0007", "f223", "S#211");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f224", "S#212", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f226", "S#206", 1, 0, false);
        new $f226$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f227", "S#213", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f228", "S#214", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f229", "S#215", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f230", "S#216", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f231", "S#217", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f232", "S#218", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f233", "S#219", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f234", "S#220", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f235", "S#221", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f236", "S#222", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f237", "S#223", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f238", "S#224", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f239", "S#225", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f240", "S#226", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f241", "S#227", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f242", "S#228", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f243", "S#229", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f225", "S#230", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f246", "S#231", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f247", "S#232", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f248", "S#233", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f249", "S#234", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f250", "S#235", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0007", "f251", "S#236");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f252", "S#237", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f253", "S#238", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f257", "S#239", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f258", "S#240", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f259", "S#241", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f244", "S#242", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f245", "S#243", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f260", "S#244", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f261", "S#245", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f262", "S#246", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f263", "S#247", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f264", "S#248", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f265", "S#249", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f266", "S#250", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f267", "S#251", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f268", "S#252", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f255", "S#209", 1, 0, false);
        new $f255$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f270", "S#253", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f271", "S#254", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f272", "S#255", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f273", "S#256", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f274", "S#257", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f275", "S#258", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f276", "S#259", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f277", "S#260", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f278", "S#261", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f279", "S#262", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f280", "S#263", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f281", "S#264", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f282", "S#265", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f269", "S#266", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f284", "S#267", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f285", "S#268", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f286", "S#269", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f254", "S#270", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f287", "S#271", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f288", "S#272", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f289", "S#273", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f290", "S#274", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f291", "S#275", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f283", "S#276", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f292", "S#277", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f293", "S#278", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f256", "S#279", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f294", "S#280", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f295", "S#281", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f296", "S#282", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0007", "f297", "S#283", 0, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0007", "f298", "S#284");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f300() {
        $g13$ = SubLFiles.deflexical("S#285", Locks.make_lock((SubLObject)$ic0$));
        $g14$ = SubLFiles.deflexical("S#286", Locks.make_lock((SubLObject)$ic3$));
        $g15$ = SubLFiles.defconstant("S#287", (SubLObject)$ic5$);
        $g16$ = SubLFiles.deflexical("S#288", (NIL != Symbols.boundp((SubLObject)$ic46$)) ? $g16$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)$ic47$, Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED));
        $g17$ = SubLFiles.defconstant("S#289", (SubLObject)$ic75$);
        $g18$ = SubLFiles.deflexical("S#290", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic99$)) ? $g18$.getGlobalValue() : NIL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f301() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g15$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic12$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic13$);
        Structures.def_csetf((SubLObject)$ic14$, (SubLObject)$ic15$);
        Structures.def_csetf((SubLObject)$ic16$, (SubLObject)$ic17$);
        Structures.def_csetf((SubLObject)$ic18$, (SubLObject)$ic19$);
        Structures.def_csetf((SubLObject)$ic20$, (SubLObject)$ic21$);
        Structures.def_csetf((SubLObject)$ic22$, (SubLObject)$ic23$);
        Structures.def_csetf((SubLObject)$ic24$, (SubLObject)$ic25$);
        Structures.def_csetf((SubLObject)$ic26$, (SubLObject)$ic27$);
        Equality.identity((SubLObject)$ic5$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g15$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic40$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g15$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic45$));
        module0003.f57((SubLObject)$ic46$);
        module0002.f50((SubLObject)$ic71$, (SubLObject)$ic72$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g17$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic81$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic82$);
        Structures.def_csetf((SubLObject)$ic83$, (SubLObject)$ic84$);
        Structures.def_csetf((SubLObject)$ic85$, (SubLObject)$ic86$);
        Structures.def_csetf((SubLObject)$ic87$, (SubLObject)$ic88$);
        Structures.def_csetf((SubLObject)$ic89$, (SubLObject)$ic90$);
        Structures.def_csetf((SubLObject)$ic91$, (SubLObject)$ic92$);
        Equality.identity((SubLObject)$ic75$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g17$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic96$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g17$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic98$));
        module0003.f57((SubLObject)$ic99$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f299();
    }
    
    public void initializeVariables() {
        f300();
    }
    
    public void runTopLevelForms() {
        f301();
    }
    
    static {
        me = (SubLFile)new module0007();
        $g13$ = null;
        $g14$ = null;
        $g15$ = null;
        $g16$ = null;
        $g17$ = null;
        $g18$ = null;
        $ic0$ = makeString("Module Lock");
        $ic1$ = makeSymbol("WITH-LOCK-HELD");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#285", "CYC"));
        $ic3$ = makeString("System Lock");
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#286", "CYC"));
        $ic5$ = makeSymbol("S#205", "CYC");
        $ic6$ = makeSymbol("S#206", "CYC");
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("S#291", "CYC"), (SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#208", "CYC"), (SubLObject)makeSymbol("PATHNAME"), (SubLObject)makeSymbol("S#292", "CYC"), (SubLObject)makeSymbol("S#293", "CYC"), (SubLObject)makeSymbol("S#294", "CYC"));
        $ic8$ = ConsesLow.list((SubLObject)makeKeyword("BASIS"), (SubLObject)makeKeyword("NAME"), (SubLObject)makeKeyword("SYSTEM"), (SubLObject)makeKeyword("PATHNAME"), (SubLObject)makeKeyword("TEST-CASES"), (SubLObject)makeKeyword("TEST-SUITES"), (SubLObject)makeKeyword("PROVISIONAL-P"));
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("S#213", "CYC"), (SubLObject)makeSymbol("S#214", "CYC"), (SubLObject)makeSymbol("S#215", "CYC"), (SubLObject)makeSymbol("S#216", "CYC"), (SubLObject)makeSymbol("S#217", "CYC"), (SubLObject)makeSymbol("S#218", "CYC"), (SubLObject)makeSymbol("S#219", "CYC"));
        $ic10$ = ConsesLow.list((SubLObject)makeSymbol("S#220", "CYC"), (SubLObject)makeSymbol("S#221", "CYC"), (SubLObject)makeSymbol("S#222", "CYC"), (SubLObject)makeSymbol("S#223", "CYC"), (SubLObject)makeSymbol("S#224", "CYC"), (SubLObject)makeSymbol("S#225", "CYC"), (SubLObject)makeSymbol("S#226", "CYC"));
        $ic11$ = makeSymbol("S#230", "CYC");
        $ic12$ = makeSymbol("S#212", "CYC");
        $ic13$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#206", "CYC"));
        $ic14$ = makeSymbol("S#213", "CYC");
        $ic15$ = makeSymbol("S#220", "CYC");
        $ic16$ = makeSymbol("S#214", "CYC");
        $ic17$ = makeSymbol("S#221", "CYC");
        $ic18$ = makeSymbol("S#215", "CYC");
        $ic19$ = makeSymbol("S#222", "CYC");
        $ic20$ = makeSymbol("S#216", "CYC");
        $ic21$ = makeSymbol("S#223", "CYC");
        $ic22$ = makeSymbol("S#217", "CYC");
        $ic23$ = makeSymbol("S#224", "CYC");
        $ic24$ = makeSymbol("S#218", "CYC");
        $ic25$ = makeSymbol("S#225", "CYC");
        $ic26$ = makeSymbol("S#219", "CYC");
        $ic27$ = makeSymbol("S#226", "CYC");
        $ic28$ = makeKeyword("BASIS");
        $ic29$ = makeKeyword("NAME");
        $ic30$ = makeKeyword("SYSTEM");
        $ic31$ = makeKeyword("PATHNAME");
        $ic32$ = makeKeyword("TEST-CASES");
        $ic33$ = makeKeyword("TEST-SUITES");
        $ic34$ = makeKeyword("PROVISIONAL-P");
        $ic35$ = makeString("Invalid slot ~S for construction function");
        $ic36$ = makeKeyword("BEGIN");
        $ic37$ = makeSymbol("S#227", "CYC");
        $ic38$ = makeKeyword("SLOT");
        $ic39$ = makeKeyword("END");
        $ic40$ = makeSymbol("S#229", "CYC");
        $ic41$ = makeString("#<");
        $ic42$ = makeKeyword("STREAM");
        $ic43$ = makeString("~S in ~S");
        $ic44$ = makeKeyword("BASE");
        $ic45$ = makeSymbol("S#231", "CYC");
        $ic46$ = makeSymbol("S#288", "CYC");
        $ic47$ = makeInteger(1024);
        $ic48$ = makeSymbol("STRINGP");
        $ic49$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#208", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#295", "CYC"), (SubLObject)makeString("mapping modules"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic50$ = ConsesLow.list((SubLObject)makeKeyword("SYSTEM"), (SubLObject)makeKeyword("MESSAGE"));
        $ic51$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic52$ = makeKeyword("MESSAGE");
        $ic53$ = makeString("mapping modules");
        $ic54$ = makeUninternedSymbol("US#8E14BD");
        $ic55$ = makeUninternedSymbol("US#43881");
        $ic56$ = makeUninternedSymbol("US#65ECC05");
        $ic57$ = makeSymbol("PROGN");
        $ic58$ = makeSymbol("PWHEN");
        $ic59$ = makeSymbol("PUNLESS");
        $ic60$ = makeSymbol("S#209", "CYC");
        $ic61$ = makeSymbol("S#270", "CYC");
        $ic62$ = makeSymbol("ERROR");
        $ic63$ = makeString("~A is not a known system name.");
        $ic64$ = makeSymbol("S#296", "CYC");
        $ic65$ = ConsesLow.list((SubLObject)makeSymbol("S#237", "CYC"));
        $ic66$ = makeSymbol("CDESTRUCTURING-BIND");
        $ic67$ = makeSymbol("IGNORE");
        $ic68$ = makeSymbol("COR");
        $ic69$ = makeSymbol("NULL");
        $ic70$ = makeSymbol("CAND");
        $ic71$ = makeSymbol("S#237", "CYC");
        $ic72$ = makeSymbol("S#236", "CYC");
        $ic73$ = makeString("~A is not the name of a known system.");
        $ic74$ = makeSymbol("SYMBOLP");
        $ic75$ = makeSymbol("S#208", "CYC");
        $ic76$ = ConsesLow.list((SubLObject)makeSymbol("S#291", "CYC"), (SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#297", "CYC"), (SubLObject)makeSymbol("S#298", "CYC"), (SubLObject)makeSymbol("S#294", "CYC"));
        $ic77$ = ConsesLow.list((SubLObject)makeKeyword("BASIS"), (SubLObject)makeKeyword("NAME"), (SubLObject)makeKeyword("DEFAULT-PATHNAME"), (SubLObject)makeKeyword("MODULES"), (SubLObject)makeKeyword("PROVISIONAL-P"));
        $ic78$ = ConsesLow.list((SubLObject)makeSymbol("S#253", "CYC"), (SubLObject)makeSymbol("S#254", "CYC"), (SubLObject)makeSymbol("S#255", "CYC"), (SubLObject)makeSymbol("S#256", "CYC"), (SubLObject)makeSymbol("S#257", "CYC"));
        $ic79$ = ConsesLow.list((SubLObject)makeSymbol("S#258", "CYC"), (SubLObject)makeSymbol("S#259", "CYC"), (SubLObject)makeSymbol("S#260", "CYC"), (SubLObject)makeSymbol("S#261", "CYC"), (SubLObject)makeSymbol("S#262", "CYC"));
        $ic80$ = makeSymbol("S#266", "CYC");
        $ic81$ = makeSymbol("S#252", "CYC");
        $ic82$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#209", "CYC"));
        $ic83$ = makeSymbol("S#253", "CYC");
        $ic84$ = makeSymbol("S#258", "CYC");
        $ic85$ = makeSymbol("S#254", "CYC");
        $ic86$ = makeSymbol("S#259", "CYC");
        $ic87$ = makeSymbol("S#255", "CYC");
        $ic88$ = makeSymbol("S#260", "CYC");
        $ic89$ = makeSymbol("S#256", "CYC");
        $ic90$ = makeSymbol("S#261", "CYC");
        $ic91$ = makeSymbol("S#257", "CYC");
        $ic92$ = makeSymbol("S#262", "CYC");
        $ic93$ = makeKeyword("DEFAULT-PATHNAME");
        $ic94$ = makeKeyword("MODULES");
        $ic95$ = makeSymbol("S#263", "CYC");
        $ic96$ = makeSymbol("S#265", "CYC");
        $ic97$ = makeString("System ~S");
        $ic98$ = makeSymbol("S#267", "CYC");
        $ic99$ = makeSymbol("S#290", "CYC");
        $ic100$ = makeSymbol("S#276", "CYC");
        $ic101$ = makeString("~A is already the name of a known system.");
        $ic102$ = ConsesLow.list((SubLObject)makeSymbol("S#254", "CYC"));
        $ic103$ = makeKeyword("COMMON-LISP");
        $ic104$ = ConsesLow.list((SubLObject)makeSymbol("PROGN"));
        $ic105$ = ConsesLow.list((SubLObject)makeSymbol("S#275", "CYC"), (SubLObject)makeString("cycl"));
        $ic106$ = makeSymbol("CDOLIST");
        $ic107$ = makeSymbol("S#29", "CYC");
        $ic108$ = makeSymbol("QUOTE");
        $ic109$ = makeSymbol("S#241", "CYC");
    }
    
    public static final class $sX205_native extends SubLStructNative
    {
        public SubLObject $basis;
        public SubLObject $name;
        public SubLObject $system;
        public SubLObject $pathname;
        public SubLObject $test_cases;
        public SubLObject $test_suites;
        public SubLObject $provisional_p;
        public static final SubLStructDeclNative structDecl;
        
        public $sX205_native() {
            this.$basis = (SubLObject)CommonSymbols.NIL;
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$system = (SubLObject)CommonSymbols.NIL;
            this.$pathname = (SubLObject)CommonSymbols.NIL;
            this.$test_cases = (SubLObject)CommonSymbols.NIL;
            this.$test_suites = (SubLObject)CommonSymbols.NIL;
            this.$provisional_p = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$basis;
        }
        
        public SubLObject getField3() {
            return this.$name;
        }
        
        public SubLObject getField4() {
            return this.$system;
        }
        
        public SubLObject getField5() {
            return this.$pathname;
        }
        
        public SubLObject getField6() {
            return this.$test_cases;
        }
        
        public SubLObject getField7() {
            return this.$test_suites;
        }
        
        public SubLObject getField8() {
            return this.$provisional_p;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$basis = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$system = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$pathname = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$test_cases = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$test_suites = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$provisional_p = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX205_native.class, $ic5$, $ic6$, $ic7$, $ic8$, new String[] { "$basis", "$name", "$system", "$pathname", "$test_cases", "$test_suites", "$provisional_p" }, $ic9$, $ic10$, $ic11$);
        }
    }
    
    public static final class $f226$UnaryFunction extends UnaryFunction
    {
        public $f226$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#206"));
        }
        
        public SubLObject processItem(final SubLObject var10) {
            return f226(var10);
        }
    }
    
    public static final class $sX208_native extends SubLStructNative
    {
        public SubLObject $basis;
        public SubLObject $name;
        public SubLObject $default_pathname;
        public SubLObject $modules;
        public SubLObject $provisional_p;
        public static final SubLStructDeclNative structDecl;
        
        public $sX208_native() {
            this.$basis = (SubLObject)CommonSymbols.NIL;
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$default_pathname = (SubLObject)CommonSymbols.NIL;
            this.$modules = (SubLObject)CommonSymbols.NIL;
            this.$provisional_p = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$basis;
        }
        
        public SubLObject getField3() {
            return this.$name;
        }
        
        public SubLObject getField4() {
            return this.$default_pathname;
        }
        
        public SubLObject getField5() {
            return this.$modules;
        }
        
        public SubLObject getField6() {
            return this.$provisional_p;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$basis = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$default_pathname = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$modules = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$provisional_p = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX208_native.class, $ic75$, $ic60$, $ic76$, $ic77$, new String[] { "$basis", "$name", "$default_pathname", "$modules", "$provisional_p" }, $ic78$, $ic79$, $ic80$);
        }
    }
    
    public static final class $f255$UnaryFunction extends UnaryFunction
    {
        public $f255$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#209"));
        }
        
        public SubLObject processItem(final SubLObject var10) {
            return f255(var10);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 250 ms
	
	Decompiled with Procyon 0.5.32.
*/