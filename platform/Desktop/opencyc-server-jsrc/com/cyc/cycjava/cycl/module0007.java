package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        return (SubLObject)ConsesLow.listS((SubLObject)module0007.$ic1$, (SubLObject)module0007.$ic2$, ConsesLow.append(var5, (SubLObject)module0007.NIL));
    }
    
    public static SubLObject f223(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0007.$ic1$, (SubLObject)module0007.$ic4$, ConsesLow.append(var5, (SubLObject)module0007.NIL));
    }
    
    public static SubLObject f224(final SubLObject var8, final SubLObject var9) {
        f225(var8, var9, (SubLObject)module0007.ZERO_INTEGER);
        return (SubLObject)module0007.NIL;
    }
    
    public static SubLObject f226(final SubLObject var8) {
        return (SubLObject)((var8.getClass() == $sX205_native.class) ? module0007.T : module0007.NIL);
    }
    
    public static SubLObject f227(final SubLObject var8) {
        assert module0007.NIL != f226(var8) : var8;
        return var8.getField2();
    }
    
    public static SubLObject f228(final SubLObject var8) {
        assert module0007.NIL != f226(var8) : var8;
        return var8.getField3();
    }
    
    public static SubLObject f229(final SubLObject var8) {
        assert module0007.NIL != f226(var8) : var8;
        return var8.getField4();
    }
    
    public static SubLObject f230(final SubLObject var8) {
        assert module0007.NIL != f226(var8) : var8;
        return var8.getField5();
    }
    
    public static SubLObject f231(final SubLObject var8) {
        assert module0007.NIL != f226(var8) : var8;
        return var8.getField6();
    }
    
    public static SubLObject f232(final SubLObject var8) {
        assert module0007.NIL != f226(var8) : var8;
        return var8.getField7();
    }
    
    public static SubLObject f233(final SubLObject var8) {
        assert module0007.NIL != f226(var8) : var8;
        return var8.getField8();
    }
    
    public static SubLObject f234(final SubLObject var8, final SubLObject var11) {
        assert module0007.NIL != f226(var8) : var8;
        return var8.setField2(var11);
    }
    
    public static SubLObject f235(final SubLObject var8, final SubLObject var11) {
        assert module0007.NIL != f226(var8) : var8;
        return var8.setField3(var11);
    }
    
    public static SubLObject f236(final SubLObject var8, final SubLObject var11) {
        assert module0007.NIL != f226(var8) : var8;
        return var8.setField4(var11);
    }
    
    public static SubLObject f237(final SubLObject var8, final SubLObject var11) {
        assert module0007.NIL != f226(var8) : var8;
        return var8.setField5(var11);
    }
    
    public static SubLObject f238(final SubLObject var8, final SubLObject var11) {
        assert module0007.NIL != f226(var8) : var8;
        return var8.setField6(var11);
    }
    
    public static SubLObject f239(final SubLObject var8, final SubLObject var11) {
        assert module0007.NIL != f226(var8) : var8;
        return var8.setField7(var11);
    }
    
    public static SubLObject f240(final SubLObject var8, final SubLObject var11) {
        assert module0007.NIL != f226(var8) : var8;
        return var8.setField8(var11);
    }
    
    public static SubLObject f241(SubLObject var12) {
        if (var12 == module0007.UNPROVIDED) {
            var12 = (SubLObject)module0007.NIL;
        }
        final SubLObject var13 = (SubLObject)new $sX205_native();
        SubLObject var14;
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        for (var14 = (SubLObject)module0007.NIL, var14 = var12; module0007.NIL != var14; var14 = conses_high.cddr(var14)) {
            var15 = var14.first();
            var16 = conses_high.cadr(var14);
            var17 = var15;
            if (var17.eql((SubLObject)module0007.$ic28$)) {
                f234(var13, var16);
            }
            else if (var17.eql((SubLObject)module0007.$ic29$)) {
                f235(var13, var16);
            }
            else if (var17.eql((SubLObject)module0007.$ic30$)) {
                f236(var13, var16);
            }
            else if (var17.eql((SubLObject)module0007.$ic31$)) {
                f237(var13, var16);
            }
            else if (var17.eql((SubLObject)module0007.$ic32$)) {
                f238(var13, var16);
            }
            else if (var17.eql((SubLObject)module0007.$ic33$)) {
                f239(var13, var16);
            }
            else if (var17.eql((SubLObject)module0007.$ic34$)) {
                f240(var13, var16);
            }
            else {
                Errors.error((SubLObject)module0007.$ic35$, var15);
            }
        }
        return var13;
    }
    
    public static SubLObject f242(final SubLObject var18, final SubLObject var19) {
        Functions.funcall(var19, var18, (SubLObject)module0007.$ic36$, (SubLObject)module0007.$ic37$, (SubLObject)module0007.SEVEN_INTEGER);
        Functions.funcall(var19, var18, (SubLObject)module0007.$ic38$, (SubLObject)module0007.$ic28$, f227(var18));
        Functions.funcall(var19, var18, (SubLObject)module0007.$ic38$, (SubLObject)module0007.$ic29$, f228(var18));
        Functions.funcall(var19, var18, (SubLObject)module0007.$ic38$, (SubLObject)module0007.$ic30$, f229(var18));
        Functions.funcall(var19, var18, (SubLObject)module0007.$ic38$, (SubLObject)module0007.$ic31$, f230(var18));
        Functions.funcall(var19, var18, (SubLObject)module0007.$ic38$, (SubLObject)module0007.$ic32$, f231(var18));
        Functions.funcall(var19, var18, (SubLObject)module0007.$ic38$, (SubLObject)module0007.$ic33$, f232(var18));
        Functions.funcall(var19, var18, (SubLObject)module0007.$ic38$, (SubLObject)module0007.$ic34$, f233(var18));
        Functions.funcall(var19, var18, (SubLObject)module0007.$ic39$, (SubLObject)module0007.$ic37$, (SubLObject)module0007.SEVEN_INTEGER);
        return var18;
    }
    
    public static SubLObject f243(final SubLObject var18, final SubLObject var19) {
        return f242(var18, var19);
    }
    
    public static SubLObject f225(final SubLObject var20, final SubLObject var9, final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = f244(var20);
        final SubLObject var24 = f245(var20);
        if (module0007.NIL != print_high.$print_readably$.getDynamicValue(var22)) {
            print_high.print_not_readable(var20, var9);
        }
        else {
            streams_high.write_string((SubLObject)module0007.$ic41$, var9, (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var20), new SubLObject[] { module0007.$ic42$, var9 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var9);
            PrintLow.format(var9, (SubLObject)module0007.$ic43$, var23, var24);
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var9);
        }
        return var20;
    }
    
    public static SubLObject f246(final SubLObject var28) {
        return Numbers.logxor(Sxhash.sxhash(f244(var28)), Sxhash.sxhash(f245(var28)));
    }
    
    public static SubLObject f247(final SubLObject var20) {
        final SubLObject var21 = (SubLObject)ConsesLow.list(f244(var20), f245(var20));
        SubLObject var22 = (SubLObject)module0007.NIL;
        final SubLObject var23 = module0007.$g13$.getGlobalValue();
        SubLObject var24 = (SubLObject)module0007.NIL;
        try {
            var24 = Locks.seize_lock(var23);
            var22 = Hashtables.sethash(var21, module0007.$g16$.getGlobalValue(), var20);
        }
        finally {
            if (module0007.NIL != var24) {
                Locks.release_lock(var23);
            }
        }
        return var22;
    }
    
    public static SubLObject f248(final SubLObject var20) {
        final SubLObject var21 = (SubLObject)ConsesLow.list(f244(var20), f245(var20));
        SubLObject var22 = (SubLObject)module0007.NIL;
        final SubLObject var23 = module0007.$g13$.getGlobalValue();
        SubLObject var24 = (SubLObject)module0007.NIL;
        try {
            var24 = Locks.seize_lock(var23);
            var22 = Hashtables.remhash(var21, module0007.$g16$.getGlobalValue());
        }
        finally {
            if (module0007.NIL != var24) {
                Locks.release_lock(var23);
            }
        }
        return var22;
    }
    
    public static SubLObject f249(final SubLObject var23, final SubLObject var24) {
        assert module0007.NIL != Types.stringp(var23) : var23;
        assert module0007.NIL != Types.stringp(var24) : var24;
        final SubLObject var25 = (SubLObject)ConsesLow.list(var23, var24);
        final SubLObject var26 = Hashtables.gethash(var25, module0007.$g16$.getGlobalValue(), (SubLObject)module0007.UNPROVIDED);
        return var26;
    }
    
    public static SubLObject f250() {
        return module0030.f1627(module0007.$g16$.getGlobalValue());
    }
    
    public static SubLObject f251(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0007.$ic49$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0007.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0007.$ic49$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0007.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0007.NIL;
        SubLObject var42_43 = (SubLObject)module0007.NIL;
        while (module0007.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0007.$ic49$);
            var42_43 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0007.$ic49$);
            if (module0007.NIL == conses_high.member(var42_43, (SubLObject)module0007.$ic50$, (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED)) {
                var9 = (SubLObject)module0007.T;
            }
            if (var42_43 == module0007.$ic51$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0007.NIL != var9 && module0007.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0007.$ic49$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0007.$ic30$, var4);
        final SubLObject var11 = (SubLObject)((module0007.NIL != var10) ? conses_high.cadr(var10) : module0007.NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0007.$ic52$, var4);
        final SubLObject var13 = (SubLObject)((module0007.NIL != var12) ? conses_high.cadr(var12) : module0007.$ic53$);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)module0007.$ic54$;
        final SubLObject var16 = (SubLObject)module0007.$ic55$;
        final SubLObject var17 = (SubLObject)module0007.$ic56$;
        return (SubLObject)ConsesLow.list((SubLObject)module0007.$ic57$, (SubLObject)ConsesLow.list((SubLObject)module0007.$ic58$, (SubLObject)ConsesLow.list((SubLObject)module0007.$ic48$, var11), (SubLObject)ConsesLow.list((SubLObject)module0007.$ic59$, (SubLObject)ConsesLow.list((SubLObject)module0007.$ic60$, (SubLObject)ConsesLow.list((SubLObject)module0007.$ic61$, var11)), (SubLObject)ConsesLow.list((SubLObject)module0007.$ic62$, (SubLObject)module0007.$ic63$, var11))), (SubLObject)ConsesLow.list((SubLObject)module0007.$ic64$, (SubLObject)ConsesLow.list(var15, var6, (SubLObject)module0007.$ic65$, var13), (SubLObject)ConsesLow.list((SubLObject)module0007.$ic66$, (SubLObject)ConsesLow.list(var16, var17), var15, (SubLObject)ConsesLow.list((SubLObject)module0007.$ic67$, var16), (SubLObject)ConsesLow.listS((SubLObject)module0007.$ic58$, (SubLObject)ConsesLow.list((SubLObject)module0007.$ic68$, (SubLObject)ConsesLow.list((SubLObject)module0007.$ic69$, var11), (SubLObject)ConsesLow.list((SubLObject)module0007.$ic70$, var11, (SubLObject)ConsesLow.list((SubLObject)module0007.EQUAL, var17, var11))), ConsesLow.append(var14, (SubLObject)module0007.NIL)))));
    }
    
    public static SubLObject f252() {
        return module0007.$g16$.getGlobalValue();
    }
    
    public static SubLObject f253(SubLObject var49, SubLObject var24, SubLObject var50, SubLObject var51) {
        if (var50 == module0007.UNPROVIDED) {
            var50 = (SubLObject)module0007.NIL;
        }
        if (var51 == module0007.UNPROVIDED) {
            var51 = (SubLObject)module0007.NIL;
        }
        final SubLThread var52 = SubLProcess.currentSubLThread();
        assert module0007.NIL != Types.stringp(var49) : var49;
        assert module0007.NIL != Types.stringp(var24) : var24;
        final SubLObject var53 = f254(var24);
        if (module0007.NIL == Errors.$ignore_mustsP$.getDynamicValue(var52) && module0007.NIL == f255(var53)) {
            Errors.error((SubLObject)module0007.$ic73$, var24);
        }
        var49 = Strings.string_downcase(var49, (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED);
        var24 = Strings.string_downcase(var24, (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED);
        final SubLObject var54 = f241((SubLObject)module0007.UNPROVIDED);
        f235(var54, var49);
        f236(var54, var24);
        f247(var54);
        f256(var53, var54);
        return var54;
    }
    
    public static SubLObject f257(final SubLObject var23, final SubLObject var24, final SubLObject var51) {
        return (SubLObject)module0007.NIL;
    }
    
    public static SubLObject f258(final SubLObject var23, final SubLObject var24, final SubLObject var51) {
        return f253(var23, var24, (SubLObject)module0007.T, var51);
    }
    
    public static SubLObject f259(final SubLObject var23, final SubLObject var24) {
        assert module0007.NIL != Types.stringp(var23) : var23;
        assert module0007.NIL != Types.stringp(var24) : var24;
        return f253(var23, var24, (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED);
    }
    
    public static SubLObject f244(final SubLObject var20) {
        assert module0007.NIL != f226(var20) : var20;
        return f228(var20);
    }
    
    public static SubLObject f245(final SubLObject var20) {
        assert module0007.NIL != f226(var20) : var20;
        return f229(var20);
    }
    
    public static SubLObject f260(final SubLObject var20) {
        assert module0007.NIL != f226(var20) : var20;
        return f230(var20);
    }
    
    public static SubLObject f261(final SubLObject var20, final SubLObject var53) {
        assert module0007.NIL != f226(var20) : var20;
        assert module0007.NIL != Types.symbolp(var53) : var53;
        final SubLObject var54 = module0007.$g13$.getGlobalValue();
        SubLObject var55 = (SubLObject)module0007.NIL;
        try {
            var55 = Locks.seize_lock(var54);
            if (module0007.NIL == conses_high.member(var53, f231(var20), Symbols.symbol_function((SubLObject)module0007.EQL), Symbols.symbol_function((SubLObject)module0007.IDENTITY))) {
                f238(var20, (SubLObject)ConsesLow.cons(var53, f231(var20)));
            }
        }
        finally {
            if (module0007.NIL != var55) {
                Locks.release_lock(var54);
            }
        }
        return f231(var20);
    }
    
    public static SubLObject f262(final SubLObject var20, final SubLObject var53) {
        assert module0007.NIL != f226(var20) : var20;
        assert module0007.NIL != Types.symbolp(var53) : var53;
        final SubLObject var54 = module0007.$g13$.getGlobalValue();
        SubLObject var55 = (SubLObject)module0007.NIL;
        try {
            var55 = Locks.seize_lock(var54);
            f238(var20, Sequences.delete(var53, f231(var20), (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED));
        }
        finally {
            if (module0007.NIL != var55) {
                Locks.release_lock(var54);
            }
        }
        return f231(var20);
    }
    
    public static SubLObject f263(final SubLObject var20) {
        assert module0007.NIL != f226(var20) : var20;
        return f231(var20);
    }
    
    public static SubLObject f264(final SubLObject var20, final SubLObject var59) {
        assert module0007.NIL != f226(var20) : var20;
        assert module0007.NIL != Types.stringp(var59) : var59;
        final SubLObject var60 = module0007.$g13$.getGlobalValue();
        SubLObject var61 = (SubLObject)module0007.NIL;
        try {
            var61 = Locks.seize_lock(var60);
            if (module0007.NIL == conses_high.member(var59, f232(var20), Symbols.symbol_function((SubLObject)module0007.EQUAL), Symbols.symbol_function((SubLObject)module0007.IDENTITY))) {
                f239(var20, (SubLObject)ConsesLow.cons(var59, f232(var20)));
            }
        }
        finally {
            if (module0007.NIL != var61) {
                Locks.release_lock(var60);
            }
        }
        return f232(var20);
    }
    
    public static SubLObject f265(final SubLObject var20, final SubLObject var59) {
        assert module0007.NIL != f226(var20) : var20;
        assert module0007.NIL != Types.stringp(var59) : var59;
        final SubLObject var60 = module0007.$g13$.getGlobalValue();
        SubLObject var61 = (SubLObject)module0007.NIL;
        try {
            var61 = Locks.seize_lock(var60);
            f239(var20, Sequences.delete(var59, f232(var20), Symbols.symbol_function((SubLObject)module0007.EQUAL), (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED));
        }
        finally {
            if (module0007.NIL != var61) {
                Locks.release_lock(var60);
            }
        }
        return f232(var20);
    }
    
    public static SubLObject f266(final SubLObject var20) {
        assert module0007.NIL != f226(var20) : var20;
        return f232(var20);
    }
    
    public static SubLObject f267(final SubLObject var20) {
        assert module0007.NIL != f226(var20) : var20;
        return f233(var20);
    }
    
    public static SubLObject f268(final SubLObject var8, final SubLObject var9) {
        f269(var8, var9, (SubLObject)module0007.ZERO_INTEGER);
        return (SubLObject)module0007.NIL;
    }
    
    public static SubLObject f255(final SubLObject var8) {
        return (SubLObject)((var8.getClass() == $sX208_native.class) ? module0007.T : module0007.NIL);
    }
    
    public static SubLObject f270(final SubLObject var8) {
        assert module0007.NIL != f255(var8) : var8;
        return var8.getField2();
    }
    
    public static SubLObject f271(final SubLObject var8) {
        assert module0007.NIL != f255(var8) : var8;
        return var8.getField3();
    }
    
    public static SubLObject f272(final SubLObject var8) {
        assert module0007.NIL != f255(var8) : var8;
        return var8.getField4();
    }
    
    public static SubLObject f273(final SubLObject var8) {
        assert module0007.NIL != f255(var8) : var8;
        return var8.getField5();
    }
    
    public static SubLObject f274(final SubLObject var8) {
        assert module0007.NIL != f255(var8) : var8;
        return var8.getField6();
    }
    
    public static SubLObject f275(final SubLObject var8, final SubLObject var11) {
        assert module0007.NIL != f255(var8) : var8;
        return var8.setField2(var11);
    }
    
    public static SubLObject f276(final SubLObject var8, final SubLObject var11) {
        assert module0007.NIL != f255(var8) : var8;
        return var8.setField3(var11);
    }
    
    public static SubLObject f277(final SubLObject var8, final SubLObject var11) {
        assert module0007.NIL != f255(var8) : var8;
        return var8.setField4(var11);
    }
    
    public static SubLObject f278(final SubLObject var8, final SubLObject var11) {
        assert module0007.NIL != f255(var8) : var8;
        return var8.setField5(var11);
    }
    
    public static SubLObject f279(final SubLObject var8, final SubLObject var11) {
        assert module0007.NIL != f255(var8) : var8;
        return var8.setField6(var11);
    }
    
    public static SubLObject f280(SubLObject var12) {
        if (var12 == module0007.UNPROVIDED) {
            var12 = (SubLObject)module0007.NIL;
        }
        final SubLObject var13 = (SubLObject)new $sX208_native();
        SubLObject var14;
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        for (var14 = (SubLObject)module0007.NIL, var14 = var12; module0007.NIL != var14; var14 = conses_high.cddr(var14)) {
            var15 = var14.first();
            var16 = conses_high.cadr(var14);
            var17 = var15;
            if (var17.eql((SubLObject)module0007.$ic28$)) {
                f275(var13, var16);
            }
            else if (var17.eql((SubLObject)module0007.$ic29$)) {
                f276(var13, var16);
            }
            else if (var17.eql((SubLObject)module0007.$ic93$)) {
                f277(var13, var16);
            }
            else if (var17.eql((SubLObject)module0007.$ic94$)) {
                f278(var13, var16);
            }
            else if (var17.eql((SubLObject)module0007.$ic34$)) {
                f279(var13, var16);
            }
            else {
                Errors.error((SubLObject)module0007.$ic35$, var15);
            }
        }
        return var13;
    }
    
    public static SubLObject f281(final SubLObject var18, final SubLObject var19) {
        Functions.funcall(var19, var18, (SubLObject)module0007.$ic36$, (SubLObject)module0007.$ic95$, (SubLObject)module0007.FIVE_INTEGER);
        Functions.funcall(var19, var18, (SubLObject)module0007.$ic38$, (SubLObject)module0007.$ic28$, f270(var18));
        Functions.funcall(var19, var18, (SubLObject)module0007.$ic38$, (SubLObject)module0007.$ic29$, f271(var18));
        Functions.funcall(var19, var18, (SubLObject)module0007.$ic38$, (SubLObject)module0007.$ic93$, f272(var18));
        Functions.funcall(var19, var18, (SubLObject)module0007.$ic38$, (SubLObject)module0007.$ic94$, f273(var18));
        Functions.funcall(var19, var18, (SubLObject)module0007.$ic38$, (SubLObject)module0007.$ic34$, f274(var18));
        Functions.funcall(var19, var18, (SubLObject)module0007.$ic39$, (SubLObject)module0007.$ic95$, (SubLObject)module0007.FIVE_INTEGER);
        return var18;
    }
    
    public static SubLObject f282(final SubLObject var18, final SubLObject var19) {
        return f281(var18, var19);
    }
    
    public static SubLObject f269(final SubLObject var45, final SubLObject var9, final SubLObject var21) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        final SubLObject var47 = f283(var45);
        if (module0007.NIL != print_high.$print_readably$.getDynamicValue(var46)) {
            print_high.print_not_readable(var45, var9);
        }
        else {
            streams_high.write_string((SubLObject)module0007.$ic41$, var9, (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var45), new SubLObject[] { module0007.$ic42$, var9 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var9);
            PrintLow.format(var9, (SubLObject)module0007.$ic97$, var47);
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var9);
        }
        return var45;
    }
    
    public static SubLObject f284(final SubLObject var28) {
        return Sxhash.sxhash(f283(var28));
    }
    
    public static SubLObject f285(final SubLObject var45) {
        final SubLObject var46 = module0007.$g14$.getGlobalValue();
        SubLObject var47 = (SubLObject)module0007.NIL;
        try {
            var47 = Locks.seize_lock(var46);
            if (module0007.NIL == conses_high.member(var45, module0007.$g18$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0007.EQL), Symbols.symbol_function((SubLObject)module0007.IDENTITY))) {
                module0007.$g18$.setGlobalValue((SubLObject)ConsesLow.cons(var45, module0007.$g18$.getGlobalValue()));
            }
        }
        finally {
            if (module0007.NIL != var47) {
                Locks.release_lock(var46);
            }
        }
        return (SubLObject)module0007.NIL;
    }
    
    public static SubLObject f286(final SubLObject var45) {
        final SubLObject var46 = module0007.$g14$.getGlobalValue();
        SubLObject var47 = (SubLObject)module0007.NIL;
        try {
            var47 = Locks.seize_lock(var46);
            module0007.$g18$.setGlobalValue(Sequences.remove(var45, module0007.$g18$.getGlobalValue(), (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED));
        }
        finally {
            if (module0007.NIL != var47) {
                Locks.release_lock(var46);
            }
        }
        return (SubLObject)module0007.NIL;
    }
    
    public static SubLObject f254(final SubLObject var24) {
        assert module0007.NIL != Types.stringp(var24) : var24;
        return Sequences.find(var24, module0007.$g18$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0007.EQUAL), Symbols.symbol_function((SubLObject)module0007.$ic100$), (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED);
    }
    
    public static SubLObject f287() {
        return module0007.$g18$.getGlobalValue();
    }
    
    public static SubLObject f288(SubLObject var24, SubLObject var50, SubLObject var74) {
        if (var50 == module0007.UNPROVIDED) {
            var50 = (SubLObject)module0007.NIL;
        }
        if (var74 == module0007.UNPROVIDED) {
            var74 = (SubLObject)module0007.NIL;
        }
        assert module0007.NIL != Types.stringp(var24) : var24;
        var24 = Strings.string_downcase(var24, (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED);
        final SubLObject var75 = f280((SubLObject)module0007.UNPROVIDED);
        f276(var75, var24);
        f285(var75);
        return var75;
    }
    
    public static SubLObject f289(final SubLObject var24, final SubLObject var74) {
        assert module0007.NIL != Types.stringp(var24) : var24;
        assert module0007.NIL != Types.stringp(var74) : var74;
        final SubLObject var75 = f254(var24);
        if (module0007.NIL != f255(var75)) {
            return var75;
        }
        return f290(var24, var74);
    }
    
    public static SubLObject f290(final SubLObject var24, final SubLObject var74) {
        assert module0007.NIL != Types.stringp(var24) : var24;
        assert module0007.NIL != Types.stringp(var74) : var74;
        final SubLObject var75 = f254(var24);
        if (module0007.NIL != f255(var75)) {
            Errors.error((SubLObject)module0007.$ic101$, var24);
            return (SubLObject)module0007.NIL;
        }
        return f288(var24, (SubLObject)module0007.T, var74);
    }
    
    public static SubLObject f291(final SubLObject var24) {
        assert module0007.NIL != Types.stringp(var24) : var24;
        return f288(var24, (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED);
    }
    
    public static SubLObject f283(final SubLObject var45) {
        assert module0007.NIL != f255(var45) : var45;
        return f271(var45);
    }
    
    public static SubLObject f292(final SubLObject var45) {
        assert module0007.NIL != f255(var45) : var45;
        return f272(var45);
    }
    
    public static SubLObject f293(final SubLObject var45, SubLObject var76) {
        if (var76 == module0007.UNPROVIDED) {
            var76 = (SubLObject)module0007.NIL;
        }
        assert module0007.NIL != f255(var45) : var45;
        return Sequences.reverse(f273(var45));
    }
    
    public static SubLObject f256(final SubLObject var45, final SubLObject var20) {
        assert module0007.NIL != f255(var45) : var45;
        assert module0007.NIL != f226(var20) : var20;
        final SubLObject var46 = module0007.$g14$.getGlobalValue();
        SubLObject var47 = (SubLObject)module0007.NIL;
        try {
            var47 = Locks.seize_lock(var46);
            f278(var45, conses_high.adjoin(var20, f273(var45), (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED));
        }
        finally {
            if (module0007.NIL != var47) {
                Locks.release_lock(var46);
            }
        }
        return f273(var45);
    }
    
    public static SubLObject f294(final SubLObject var45, final SubLObject var20) {
        assert module0007.NIL != f255(var45) : var45;
        assert module0007.NIL != f226(var20) : var20;
        final SubLObject var46 = module0007.$g14$.getGlobalValue();
        SubLObject var47 = (SubLObject)module0007.NIL;
        try {
            var47 = Locks.seize_lock(var46);
            f278(var45, Sequences.delete(var20, f273(var45), (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED));
        }
        finally {
            if (module0007.NIL != var47) {
                Locks.release_lock(var46);
            }
        }
        return f273(var45);
    }
    
    public static SubLObject f295(final SubLObject var45) {
        assert module0007.NIL != f255(var45) : var45;
        return f274(var45);
    }
    
    public static SubLObject f296(final SubLObject var24, SubLObject var81) {
        if (var81 == module0007.UNPROVIDED) {
            var81 = (SubLObject)module0007.NIL;
        }
        final SubLThread var82 = SubLProcess.currentSubLThread();
        final SubLObject var83 = f254(var24);
        if (module0007.NIL == Errors.$ignore_mustsP$.getDynamicValue(var82) && module0007.NIL == f255(var83)) {
            Errors.error((SubLObject)module0007.$ic73$, var24);
        }
        SubLObject var84 = (SubLObject)module0007.NIL;
        if (module0007.NIL != f255(var83)) {
            SubLObject var85 = f293(var83, (SubLObject)module0007.UNPROVIDED);
            SubLObject var86 = (SubLObject)module0007.NIL;
            var86 = var85.first();
            while (module0007.NIL != var85) {
                var84 = (SubLObject)ConsesLow.cons(f244(var86), var84);
                var85 = var85.rest();
                var86 = var85.first();
            }
        }
        return Sequences.nreverse(var84);
    }
    
    public static SubLObject f297(SubLObject var81) {
        if (var81 == module0007.UNPROVIDED) {
            var81 = (SubLObject)module0007.NIL;
        }
        final SubLObject var82 = f287();
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)module0007.$ic100$), var82);
    }
    
    public static SubLObject f298(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        SubLObject var6 = (SubLObject)module0007.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0007.$ic102$);
        var6 = var5.first();
        var5 = var5.rest();
        if (module0007.NIL != var5) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0007.$ic102$);
            return (SubLObject)module0007.NIL;
        }
        if (module0007.NIL != Sequences.find((SubLObject)module0007.$ic103$, reader.$features$.getDynamicValue(var3), (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED, (SubLObject)module0007.UNPROVIDED)) {
            return (SubLObject)module0007.$ic104$;
        }
        final SubLObject var7 = f293(f254(var6), (SubLObject)module0007.UNPROVIDED);
        SubLObject var8 = (SubLObject)module0007.NIL;
        SubLObject var9 = var7;
        SubLObject var10 = (SubLObject)module0007.NIL;
        var10 = var9.first();
        while (module0007.NIL != var9) {
            final SubLObject var11 = f244(var10);
            var8 = (SubLObject)ConsesLow.cons(var11, var8);
            var9 = var9.rest();
            var10 = var9.first();
        }
        var8 = Sequences.nreverse(var8);
        return (SubLObject)ConsesLow.list((SubLObject)module0007.$ic57$, (SubLObject)module0007.$ic105$, (SubLObject)ConsesLow.list((SubLObject)module0007.$ic106$, (SubLObject)ConsesLow.list((SubLObject)module0007.$ic107$, (SubLObject)ConsesLow.list((SubLObject)module0007.$ic108$, var8)), (SubLObject)ConsesLow.list((SubLObject)module0007.$ic109$, (SubLObject)module0007.$ic107$, var6)));
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
        return (SubLObject)module0007.NIL;
    }
    
    public static SubLObject f300() {
        module0007.$g13$ = SubLFiles.deflexical("S#285", Locks.make_lock((SubLObject)module0007.$ic0$));
        module0007.$g14$ = SubLFiles.deflexical("S#286", Locks.make_lock((SubLObject)module0007.$ic3$));
        module0007.$g15$ = SubLFiles.defconstant("S#287", (SubLObject)module0007.$ic5$);
        module0007.$g16$ = SubLFiles.deflexical("S#288", (module0007.NIL != Symbols.boundp((SubLObject)module0007.$ic46$)) ? module0007.$g16$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0007.$ic47$, Symbols.symbol_function((SubLObject)module0007.EQUALP), (SubLObject)module0007.UNPROVIDED));
        module0007.$g17$ = SubLFiles.defconstant("S#289", (SubLObject)module0007.$ic75$);
        module0007.$g18$ = SubLFiles.deflexical("S#290", (SubLObject)((module0007.NIL != Symbols.boundp((SubLObject)module0007.$ic99$)) ? module0007.$g18$.getGlobalValue() : module0007.NIL));
        return (SubLObject)module0007.NIL;
    }
    
    public static SubLObject f301() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0007.$g15$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0007.$ic12$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0007.$ic13$);
        Structures.def_csetf((SubLObject)module0007.$ic14$, (SubLObject)module0007.$ic15$);
        Structures.def_csetf((SubLObject)module0007.$ic16$, (SubLObject)module0007.$ic17$);
        Structures.def_csetf((SubLObject)module0007.$ic18$, (SubLObject)module0007.$ic19$);
        Structures.def_csetf((SubLObject)module0007.$ic20$, (SubLObject)module0007.$ic21$);
        Structures.def_csetf((SubLObject)module0007.$ic22$, (SubLObject)module0007.$ic23$);
        Structures.def_csetf((SubLObject)module0007.$ic24$, (SubLObject)module0007.$ic25$);
        Structures.def_csetf((SubLObject)module0007.$ic26$, (SubLObject)module0007.$ic27$);
        Equality.identity((SubLObject)module0007.$ic5$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0007.$g15$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0007.$ic40$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), module0007.$g15$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0007.$ic45$));
        module0003.f57((SubLObject)module0007.$ic46$);
        module0002.f50((SubLObject)module0007.$ic71$, (SubLObject)module0007.$ic72$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0007.$g17$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0007.$ic81$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0007.$ic82$);
        Structures.def_csetf((SubLObject)module0007.$ic83$, (SubLObject)module0007.$ic84$);
        Structures.def_csetf((SubLObject)module0007.$ic85$, (SubLObject)module0007.$ic86$);
        Structures.def_csetf((SubLObject)module0007.$ic87$, (SubLObject)module0007.$ic88$);
        Structures.def_csetf((SubLObject)module0007.$ic89$, (SubLObject)module0007.$ic90$);
        Structures.def_csetf((SubLObject)module0007.$ic91$, (SubLObject)module0007.$ic92$);
        Equality.identity((SubLObject)module0007.$ic75$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0007.$g17$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0007.$ic96$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), module0007.$g17$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0007.$ic98$));
        module0003.f57((SubLObject)module0007.$ic99$);
        return (SubLObject)module0007.NIL;
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
        module0007.$g13$ = null;
        module0007.$g14$ = null;
        module0007.$g15$ = null;
        module0007.$g16$ = null;
        module0007.$g17$ = null;
        module0007.$g18$ = null;
        $ic0$ = SubLObjectFactory.makeString("Module Lock");
        $ic1$ = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#285", "CYC"));
        $ic3$ = SubLObjectFactory.makeString("System Lock");
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#286", "CYC"));
        $ic5$ = SubLObjectFactory.makeSymbol("S#205", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#206", "CYC");
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#291", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#208", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("PATHNAME"), (SubLObject)SubLObjectFactory.makeSymbol("S#292", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#293", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#294", "CYC"));
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BASIS"), (SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("SYSTEM"), (SubLObject)SubLObjectFactory.makeKeyword("PATHNAME"), (SubLObject)SubLObjectFactory.makeKeyword("TEST-CASES"), (SubLObject)SubLObjectFactory.makeKeyword("TEST-SUITES"), (SubLObject)SubLObjectFactory.makeKeyword("PROVISIONAL-P"));
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#213", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#214", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#215", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#216", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#217", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#218", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#219", "CYC"));
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#220", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#221", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#222", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#223", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#224", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#225", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#226", "CYC"));
        $ic11$ = SubLObjectFactory.makeSymbol("S#230", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#212", "CYC");
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#206", "CYC"));
        $ic14$ = SubLObjectFactory.makeSymbol("S#213", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#220", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#214", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#221", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#215", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#222", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#216", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#223", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#217", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#224", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#218", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#225", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#219", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#226", "CYC");
        $ic28$ = SubLObjectFactory.makeKeyword("BASIS");
        $ic29$ = SubLObjectFactory.makeKeyword("NAME");
        $ic30$ = SubLObjectFactory.makeKeyword("SYSTEM");
        $ic31$ = SubLObjectFactory.makeKeyword("PATHNAME");
        $ic32$ = SubLObjectFactory.makeKeyword("TEST-CASES");
        $ic33$ = SubLObjectFactory.makeKeyword("TEST-SUITES");
        $ic34$ = SubLObjectFactory.makeKeyword("PROVISIONAL-P");
        $ic35$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic36$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic37$ = SubLObjectFactory.makeSymbol("S#227", "CYC");
        $ic38$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic39$ = SubLObjectFactory.makeKeyword("END");
        $ic40$ = SubLObjectFactory.makeSymbol("S#229", "CYC");
        $ic41$ = SubLObjectFactory.makeString("#<");
        $ic42$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic43$ = SubLObjectFactory.makeString("~S in ~S");
        $ic44$ = SubLObjectFactory.makeKeyword("BASE");
        $ic45$ = SubLObjectFactory.makeSymbol("S#231", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#288", "CYC");
        $ic47$ = SubLObjectFactory.makeInteger(1024);
        $ic48$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic49$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#208", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#295", "CYC"), (SubLObject)SubLObjectFactory.makeString("mapping modules"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic50$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SYSTEM"), (SubLObject)SubLObjectFactory.makeKeyword("MESSAGE"));
        $ic51$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic52$ = SubLObjectFactory.makeKeyword("MESSAGE");
        $ic53$ = SubLObjectFactory.makeString("mapping modules");
        $ic54$ = SubLObjectFactory.makeUninternedSymbol("US#8E14BD");
        $ic55$ = SubLObjectFactory.makeUninternedSymbol("US#43881");
        $ic56$ = SubLObjectFactory.makeUninternedSymbol("US#65ECC05");
        $ic57$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic58$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic59$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic60$ = SubLObjectFactory.makeSymbol("S#209", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("S#270", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("ERROR");
        $ic63$ = SubLObjectFactory.makeString("~A is not a known system name.");
        $ic64$ = SubLObjectFactory.makeSymbol("S#296", "CYC");
        $ic65$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#237", "CYC"));
        $ic66$ = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $ic67$ = SubLObjectFactory.makeSymbol("IGNORE");
        $ic68$ = SubLObjectFactory.makeSymbol("COR");
        $ic69$ = SubLObjectFactory.makeSymbol("NULL");
        $ic70$ = SubLObjectFactory.makeSymbol("CAND");
        $ic71$ = SubLObjectFactory.makeSymbol("S#237", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("S#236", "CYC");
        $ic73$ = SubLObjectFactory.makeString("~A is not the name of a known system.");
        $ic74$ = SubLObjectFactory.makeSymbol("SYMBOLP");
        $ic75$ = SubLObjectFactory.makeSymbol("S#208", "CYC");
        $ic76$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#291", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#297", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#298", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#294", "CYC"));
        $ic77$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BASIS"), (SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT-PATHNAME"), (SubLObject)SubLObjectFactory.makeKeyword("MODULES"), (SubLObject)SubLObjectFactory.makeKeyword("PROVISIONAL-P"));
        $ic78$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#253", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#254", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#255", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#256", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#257", "CYC"));
        $ic79$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#258", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#259", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#260", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#261", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#262", "CYC"));
        $ic80$ = SubLObjectFactory.makeSymbol("S#266", "CYC");
        $ic81$ = SubLObjectFactory.makeSymbol("S#252", "CYC");
        $ic82$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#209", "CYC"));
        $ic83$ = SubLObjectFactory.makeSymbol("S#253", "CYC");
        $ic84$ = SubLObjectFactory.makeSymbol("S#258", "CYC");
        $ic85$ = SubLObjectFactory.makeSymbol("S#254", "CYC");
        $ic86$ = SubLObjectFactory.makeSymbol("S#259", "CYC");
        $ic87$ = SubLObjectFactory.makeSymbol("S#255", "CYC");
        $ic88$ = SubLObjectFactory.makeSymbol("S#260", "CYC");
        $ic89$ = SubLObjectFactory.makeSymbol("S#256", "CYC");
        $ic90$ = SubLObjectFactory.makeSymbol("S#261", "CYC");
        $ic91$ = SubLObjectFactory.makeSymbol("S#257", "CYC");
        $ic92$ = SubLObjectFactory.makeSymbol("S#262", "CYC");
        $ic93$ = SubLObjectFactory.makeKeyword("DEFAULT-PATHNAME");
        $ic94$ = SubLObjectFactory.makeKeyword("MODULES");
        $ic95$ = SubLObjectFactory.makeSymbol("S#263", "CYC");
        $ic96$ = SubLObjectFactory.makeSymbol("S#265", "CYC");
        $ic97$ = SubLObjectFactory.makeString("System ~S");
        $ic98$ = SubLObjectFactory.makeSymbol("S#267", "CYC");
        $ic99$ = SubLObjectFactory.makeSymbol("S#290", "CYC");
        $ic100$ = SubLObjectFactory.makeSymbol("S#276", "CYC");
        $ic101$ = SubLObjectFactory.makeString("~A is already the name of a known system.");
        $ic102$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#254", "CYC"));
        $ic103$ = SubLObjectFactory.makeKeyword("COMMON-LISP");
        $ic104$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"));
        $ic105$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#275", "CYC"), (SubLObject)SubLObjectFactory.makeString("cycl"));
        $ic106$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic107$ = SubLObjectFactory.makeSymbol("S#29", "CYC");
        $ic108$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic109$ = SubLObjectFactory.makeSymbol("S#241", "CYC");
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
        private static final SubLStructDeclNative structDecl;
        
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
            return (SubLStructDecl)$sX205_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$sX205_native.class, module0007.$ic5$, module0007.$ic6$, module0007.$ic7$, module0007.$ic8$, new String[] { "$basis", "$name", "$system", "$pathname", "$test_cases", "$test_suites", "$provisional_p" }, module0007.$ic9$, module0007.$ic10$, module0007.$ic11$);
        }
    }
    
    public static final class $f226$UnaryFunction extends UnaryFunction
    {
        public $f226$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#206"));
        }
        
        public SubLObject processItem(final SubLObject var10) {
            return module0007.f226(var10);
        }
    }
    
    public static final class $sX208_native extends SubLStructNative
    {
        public SubLObject $basis;
        public SubLObject $name;
        public SubLObject $default_pathname;
        public SubLObject $modules;
        public SubLObject $provisional_p;
        private static final SubLStructDeclNative structDecl;
        
        public $sX208_native() {
            this.$basis = (SubLObject)CommonSymbols.NIL;
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$default_pathname = (SubLObject)CommonSymbols.NIL;
            this.$modules = (SubLObject)CommonSymbols.NIL;
            this.$provisional_p = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX208_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$sX208_native.class, module0007.$ic75$, module0007.$ic60$, module0007.$ic76$, module0007.$ic77$, new String[] { "$basis", "$name", "$default_pathname", "$modules", "$provisional_p" }, module0007.$ic78$, module0007.$ic79$, module0007.$ic80$);
        }
    }
    
    public static final class $f255$UnaryFunction extends UnaryFunction
    {
        public $f255$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#209"));
        }
        
        public SubLObject processItem(final SubLObject var10) {
            return module0007.f255(var10);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0007.class
	Total time: 250 ms
	
	Decompiled with Procyon 0.5.32.
*/