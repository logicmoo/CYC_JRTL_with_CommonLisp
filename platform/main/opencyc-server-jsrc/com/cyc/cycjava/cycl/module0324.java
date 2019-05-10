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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0324 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0324";
    public static final String myFingerPrint = "9d07f8a7c16a13df94f3b0e81e576ecd53bf31967252a356c6d7c2828cdfc7b2";
    private static SubLSymbol $g2833$;
    private static SubLSymbol $g2834$;
    private static SubLSymbol $g2835$;
    private static SubLSymbol $g2836$;
    private static SubLSymbol $g2837$;
    public static SubLSymbol $g2838$;
    public static SubLSymbol $g2839$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLInteger $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLList $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLObject $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLObject $ic53$;
    private static final SubLObject $ic54$;
    private static final SubLObject $ic55$;
    private static final SubLObject $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLList $ic58$;
    private static final SubLList $ic59$;
    private static final SubLObject $ic60$;
    private static final SubLInteger $ic61$;
    private static final SubLObject $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLInteger $ic64$;
    private static final SubLObject $ic65$;
    private static final SubLInteger $ic66$;
    private static final SubLObject $ic67$;
    private static final SubLObject $ic68$;
    private static final SubLObject $ic69$;
    private static final SubLObject $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLObject $ic72$;
    private static final SubLList $ic73$;
    
    public static SubLObject f21912() {
        if (NIL != module0035.f2370((SubLObject)$ic1$, $g2833$.getGlobalValue(), (SubLObject)UNPROVIDED)) {
            module0131.f8564();
        }
        else {
            module0131.f8565();
        }
        return module0131.f8563();
    }
    
    public static SubLObject f21913() {
        final SubLObject var1 = $g2834$.getGlobalValue();
        SubLObject var2 = (SubLObject)NIL;
        try {
            var2 = Locks.seize_lock(var1);
            $g2835$.setGlobalValue(Hashtables.make_hash_table((SubLObject)$ic5$, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        }
        finally {
            if (NIL != var2) {
                Locks.release_lock(var1);
            }
        }
        final SubLObject var3 = $g2836$.getGlobalValue();
        SubLObject var4 = (SubLObject)NIL;
        try {
            var4 = Locks.seize_lock(var3);
            $g2837$.setGlobalValue(Hashtables.make_hash_table((SubLObject)$ic5$, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        }
        finally {
            if (NIL != var4) {
                Locks.release_lock(var3);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21914(final SubLObject var5, final SubLObject var6) {
        f21915(var5, var6, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21916(final SubLObject var5) {
        return (SubLObject)((var5.getClass() == $sX18656_native.class) ? T : NIL);
    }
    
    public static SubLObject f21917(final SubLObject var5) {
        assert NIL != f21916(var5) : var5;
        return var5.getField2();
    }
    
    public static SubLObject f21918(final SubLObject var5, final SubLObject var8) {
        assert NIL != f21916(var5) : var5;
        return var5.setField2(var8);
    }
    
    public static SubLObject f21919(SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        final SubLObject var10 = (SubLObject)new $sX18656_native();
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        SubLObject var14;
        for (var11 = (SubLObject)NIL, var11 = var9; NIL != var11; var11 = conses_high.cddr(var11)) {
            var12 = var11.first();
            var13 = conses_high.cadr(var11);
            var14 = var12;
            if (var14.eql((SubLObject)$ic20$)) {
                f21918(var10, var13);
            }
            else {
                Errors.error((SubLObject)$ic21$, var12);
            }
        }
        return var10;
    }
    
    public static SubLObject f21920(final SubLObject var15, final SubLObject var16) {
        Functions.funcall(var16, var15, (SubLObject)$ic22$, (SubLObject)$ic23$, (SubLObject)ONE_INTEGER);
        Functions.funcall(var16, var15, (SubLObject)$ic24$, (SubLObject)$ic20$, f21917(var15));
        Functions.funcall(var16, var15, (SubLObject)$ic25$, (SubLObject)$ic23$, (SubLObject)ONE_INTEGER);
        return var15;
    }
    
    public static SubLObject f21921(final SubLObject var15, final SubLObject var16) {
        return f21920(var15, var16);
    }
    
    public static SubLObject f21922(final SubLObject var17) {
        return Sxhash.sxhash(f21917(var17));
    }
    
    public static SubLObject f21923(final SubLObject var5, final SubLObject var6) {
        f21915(var5, var6, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21924(final SubLObject var5) {
        return (SubLObject)((var5.getClass() == $sX18657_native.class) ? T : NIL);
    }
    
    public static SubLObject f21925(final SubLObject var5) {
        assert NIL != f21924(var5) : var5;
        return var5.getField2();
    }
    
    public static SubLObject f21926(final SubLObject var5, final SubLObject var8) {
        assert NIL != f21924(var5) : var5;
        return var5.setField2(var8);
    }
    
    public static SubLObject f21927(SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        final SubLObject var10 = (SubLObject)new $sX18657_native();
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        SubLObject var14;
        for (var11 = (SubLObject)NIL, var11 = var9; NIL != var11; var11 = conses_high.cddr(var11)) {
            var12 = var11.first();
            var13 = conses_high.cadr(var11);
            var14 = var12;
            if (var14.eql((SubLObject)$ic20$)) {
                f21926(var10, var13);
            }
            else {
                Errors.error((SubLObject)$ic21$, var12);
            }
        }
        return var10;
    }
    
    public static SubLObject f21928(final SubLObject var15, final SubLObject var16) {
        Functions.funcall(var16, var15, (SubLObject)$ic22$, (SubLObject)$ic36$, (SubLObject)ONE_INTEGER);
        Functions.funcall(var16, var15, (SubLObject)$ic24$, (SubLObject)$ic20$, f21925(var15));
        Functions.funcall(var16, var15, (SubLObject)$ic25$, (SubLObject)$ic36$, (SubLObject)ONE_INTEGER);
        return var15;
    }
    
    public static SubLObject f21929(final SubLObject var15, final SubLObject var16) {
        return f21928(var15, var16);
    }
    
    public static SubLObject f21930(final SubLObject var17) {
        return Sxhash.sxhash(f21925(var17));
    }
    
    public static SubLObject f21915(final SubLObject var21, final SubLObject var6, final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var23)) {
            print_high.print_not_readable(var21, var6);
        }
        else {
            streams_high.write_string((SubLObject)$ic39$, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var21), new SubLObject[] { $ic40$, var6 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var6);
            PrintLow.format(var6, (SubLObject)$ic41$, f21931(var21));
            streams_high.write_char((SubLObject)Characters.CHAR_space, var6);
            PrintLow.write(Equality.pointer(var21), new SubLObject[] { $ic40$, var6, $ic42$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var6);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21932(final SubLObject var27) {
        final SubLObject var28 = f21919((SubLObject)UNPROVIDED);
        f21918(var28, var27);
        final SubLObject var29 = $g2834$.getGlobalValue();
        SubLObject var30 = (SubLObject)NIL;
        try {
            var30 = Locks.seize_lock(var29);
            Hashtables.sethash(var27, $g2835$.getGlobalValue(), var28);
        }
        finally {
            if (NIL != var30) {
                Locks.release_lock(var29);
            }
        }
        return var28;
    }
    
    public static SubLObject f21933(final SubLObject var27) {
        final SubLObject var28 = f21927((SubLObject)UNPROVIDED);
        f21926(var28, var27);
        final SubLObject var29 = $g2836$.getGlobalValue();
        SubLObject var30 = (SubLObject)NIL;
        try {
            var30 = Locks.seize_lock(var29);
            Hashtables.sethash(var27, $g2837$.getGlobalValue(), var28);
        }
        finally {
            if (NIL != var30) {
                Locks.release_lock(var29);
            }
        }
        return var28;
    }
    
    public static SubLObject f21934(final SubLObject var17) {
        return (SubLObject)makeBoolean(NIL != f21916(var17) || NIL != f21924(var17));
    }
    
    public static SubLObject f21935(final SubLObject var17) {
        return f21934(var17);
    }
    
    public static SubLObject f21931(final SubLObject var34) {
        if (NIL != f21916(var34)) {
            return f21917(var34);
        }
        if (NIL != f21924(var34)) {
            return f21925(var34);
        }
        module0136.f8870((SubLObject)$ic43$, var34, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21936(final SubLObject var35) {
        SubLObject var36 = (SubLObject)NIL;
        final SubLObject var37 = $g2834$.getGlobalValue();
        SubLObject var38 = (SubLObject)NIL;
        try {
            var38 = Locks.seize_lock(var37);
            var36 = Hashtables.gethash(var35, $g2835$.getGlobalValue(), (SubLObject)UNPROVIDED);
        }
        finally {
            if (NIL != var38) {
                Locks.release_lock(var37);
            }
        }
        return var36;
    }
    
    public static SubLObject f21937(final SubLObject var35) {
        SubLObject var36 = (SubLObject)NIL;
        final SubLObject var37 = $g2836$.getGlobalValue();
        SubLObject var38 = (SubLObject)NIL;
        try {
            var38 = Locks.seize_lock(var37);
            var36 = Hashtables.gethash(var35, $g2837$.getGlobalValue(), (SubLObject)UNPROVIDED);
        }
        finally {
            if (NIL != var38) {
                Locks.release_lock(var37);
            }
        }
        return var36;
    }
    
    public static SubLObject f21938(final SubLObject var35, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLObject var36 = $g2834$.getGlobalValue();
        SubLObject var37 = (SubLObject)NIL;
        try {
            var37 = Locks.seize_lock(var36);
            if (NIL == var28) {
                var28 = Hashtables.gethash(var35, $g2835$.getGlobalValue(), (SubLObject)UNPROVIDED);
            }
            Hashtables.remhash(var35, $g2835$.getGlobalValue());
        }
        finally {
            if (NIL != var37) {
                Locks.release_lock(var36);
            }
        }
        f21939(var28);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21940(final SubLObject var35, SubLObject var31) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        final SubLObject var36 = $g2836$.getGlobalValue();
        SubLObject var37 = (SubLObject)NIL;
        try {
            var37 = Locks.seize_lock(var36);
            if (NIL == var31) {
                var31 = Hashtables.gethash(var35, $g2837$.getGlobalValue(), (SubLObject)UNPROVIDED);
            }
            Hashtables.remhash(var35, $g2837$.getGlobalValue());
        }
        finally {
            if (NIL != var37) {
                Locks.release_lock(var36);
            }
        }
        f21939(var31);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21941(final SubLObject var45) {
        assert NIL != f21934(var45) : var45;
        if (NIL != f21916(var45)) {
            f21938(f21931(var45), (SubLObject)UNPROVIDED);
        }
        else {
            f21940(f21931(var45), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21939(final SubLObject var45) {
        assert NIL != f21934(var45) : var45;
        SubLObject var46 = module0142.f9322();
        SubLObject var47 = (SubLObject)NIL;
        var47 = var46.first();
        while (NIL != var46) {
            final SubLObject var48 = module0137.f8955(var47);
            module0242.f15667(var45, var48);
            var46 = var46.rest();
            var47 = var46.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21942(final SubLObject var35) {
        return (SubLObject)makeBoolean(NIL != f21936(var35) || NIL != f21937(var35));
    }
    
    public static SubLObject f21943(final SubLObject var35) {
        final SubLObject var36 = f21936(var35);
        if (NIL != var36) {
            return var36;
        }
        return f21932(var35);
    }
    
    public static SubLObject f21944(final SubLObject var35) {
        final SubLObject var36 = f21937(var35);
        if (NIL != var36) {
            return var36;
        }
        return f21933(var35);
    }
    
    public static SubLObject f21945(final SubLObject var49) {
        return f21944(module0051.f3650(var49));
    }
    
    public static SubLObject f21946(final SubLObject var49) {
        return f21943(module0051.f3652(var49));
    }
    
    public static SubLObject f21947(final SubLObject var17) {
        return module0202.f12689(var17, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21948(final SubLObject var17) {
        return (SubLObject)makeBoolean(NIL != f21947(var17) && (NIL != module0614.f37617(var17) || NIL != f21949(f21943(var17)) || NIL != f21949(f21944(var17))));
    }
    
    public static SubLObject f21950(final SubLObject var50) {
        SubLObject var52;
        final SubLObject var51 = var52 = module0202.f12829(var50, (SubLObject)UNPROVIDED);
        SubLObject var53 = (SubLObject)NIL;
        SubLObject var54 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var52, var51, (SubLObject)$ic45$);
        var53 = var52.first();
        var52 = var52.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var52, var51, (SubLObject)$ic45$);
        var54 = var52.first();
        var52 = var52.rest();
        if (NIL == var52) {
            return Values.values(module0612.f37519(var53), module0612.f37519(var54));
        }
        cdestructuring_bind.cdestructuring_bind_error(var51, (SubLObject)$ic45$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21949(final SubLObject var54) {
        if (NIL != f21935(var54)) {
            SubLObject var55;
            SubLObject var56;
            SubLObject var57;
            for (var55 = (SubLObject)NIL, var56 = (SubLObject)NIL, var56 = module0142.f9322(); NIL == var55 && NIL != var56; var56 = var56.rest()) {
                var57 = var56.first();
                if (NIL != Hashtables.gethash(var54, module0137.f8919(module0137.f8955(var57)), (SubLObject)UNPROVIDED)) {
                    var55 = (SubLObject)T;
                }
            }
            return var55;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21951(final SubLObject var54) {
        return module0035.sublisp_boolean(Hashtables.gethash(var54, module0142.$g1722$.getGlobalValue(), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f21952(final SubLObject var58) {
        return (SubLObject)makeBoolean(NIL != f21949(f21943(var58)) || NIL != f21949(f21944(var58)) || NIL != f21951(f21943(var58)) || NIL != f21951(f21944(var58)) || NIL != f21934(var58));
    }
    
    public static SubLObject f21953(final SubLObject var57, final SubLObject var7, final SubLObject var53) {
        return (SubLObject)makeBoolean(NIL != module0142.f9311() && NIL != f21954(var57) && NIL != f21947(var7) && NIL != f21947(var53));
    }
    
    public static SubLObject f21955(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (NIL != module0142.$g1728$.getDynamicValue(var60) && NIL != module0612.f37380(f21931(var59))) {
            return (SubLObject)NIL;
        }
        if (module0142.$g1729$.getDynamicValue(var60) == $ic46$) {
            return f21916(var59);
        }
        if (module0142.$g1729$.getDynamicValue(var60) == $ic25$) {
            return f21924(var59);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f21956(final SubLObject var60) {
        SubLObject var61 = (SubLObject)NIL;
        SubLObject var62 = var60;
        SubLObject var63 = (SubLObject)NIL;
        var63 = var62.first();
        while (NIL != var62) {
            var61 = (SubLObject)ConsesLow.cons(f21931(var63), var61);
            var62 = var62.rest();
            var63 = var62.first();
        }
        return var61;
    }
    
    public static SubLObject f21957(final SubLObject var58) {
        return f21934(var58);
    }
    
    public static SubLObject f21958(final SubLObject var35) {
        return (SubLObject)ConsesLow.list((SubLObject)$ic46$, f21959(var35));
    }
    
    public static SubLObject f21960(final SubLObject var35) {
        return (SubLObject)ConsesLow.list((SubLObject)$ic46$, f21961(var35));
    }
    
    public static SubLObject f21962(final SubLObject var35) {
        return (SubLObject)ConsesLow.list((SubLObject)$ic46$, f21963(var35));
    }
    
    public static SubLObject f21964(final SubLObject var35) {
        return (SubLObject)ConsesLow.list((SubLObject)$ic25$, f21965(var35));
    }
    
    public static SubLObject f21966(final SubLObject var35) {
        return (SubLObject)ConsesLow.list((SubLObject)$ic25$, f21967(var35));
    }
    
    public static SubLObject f21968(final SubLObject var35) {
        return (SubLObject)ConsesLow.list((SubLObject)$ic25$, f21969(var35));
    }
    
    public static SubLObject f21954(final SubLObject var62) {
        return module0004.f104(var62, module0142.$g1724$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21970(final SubLObject var57) {
        if (NIL == f21954(var57)) {
            return (SubLObject)NIL;
        }
        final SubLObject var58 = module0328.f22143(var57, (SubLObject)$ic47$, (SubLObject)$ic48$);
        if (NIL == Types.booleanp(var58)) {
            return (SubLObject)NIL;
        }
        return var58;
    }
    
    public static SubLObject f21971(final SubLObject var57) {
        if (NIL == f21954(var57)) {
            return (SubLObject)NIL;
        }
        final SubLObject var58 = module0328.f22143(var57, (SubLObject)$ic47$, (SubLObject)$ic48$);
        if (NIL == Types.booleanp(var58)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL == var58);
    }
    
    public static SubLObject f21961(final SubLObject var35) {
        final SubLObject var36 = module0205.f13136(var35);
        if (var36.eql($ic49$)) {
            return f21961(module0205.f13277(var35, (SubLObject)UNPROVIDED));
        }
        return f21959(var35);
    }
    
    public static SubLObject f21963(final SubLObject var35) {
        final SubLObject var36 = module0205.f13136(var35);
        if (var36.eql($ic49$)) {
            return f21967(module0205.f13277(var35, (SubLObject)UNPROVIDED));
        }
        return f21959(var35);
    }
    
    public static SubLObject f21959(final SubLObject var35) {
        if (NIL != f21972(var35)) {
            final SubLObject var36 = module0205.f13136(var35);
            if (var36.eql($ic50$)) {
                return f21959(module0205.f13203(var35, (SubLObject)UNPROVIDED));
            }
            if (var36.eql($ic51$)) {
                return module0051.f3652(f21965(module0205.f13203(var35, (SubLObject)UNPROVIDED)));
            }
            if (var36.eql($ic52$)) {
                return f21959(module0205.f13203(var35, (SubLObject)UNPROVIDED));
            }
            if (var36.eql($ic53$)) {
                return f21965(module0205.f13203(var35, (SubLObject)UNPROVIDED));
            }
            if (var36.eql($ic54$)) {
                return module0051.f3652(f21965(module0205.f13203(var35, (SubLObject)UNPROVIDED)));
            }
            if (var36.eql($ic55$)) {
                return f21959(module0205.f13203(var35, (SubLObject)UNPROVIDED));
            }
            if (var36.eql($ic56$)) {
                return module0612.$g2464$.getGlobalValue();
            }
            if (var36.eql($ic57$)) {
                return module0612.$g2464$.getGlobalValue();
            }
        }
        else if (NIL != f21973(var35)) {
            final SubLObject var36 = module0205.f13136(var35);
            if (var36.eql($ic50$)) {
                return f21959(module0205.f13203(var35, (SubLObject)UNPROVIDED));
            }
            if (var36.eql($ic52$)) {
                return f21959(module0205.f13203(var35, (SubLObject)UNPROVIDED));
            }
            if (var36.eql($ic53$)) {
                return f21965(module0205.f13203(var35, (SubLObject)UNPROVIDED));
            }
            if (var36.eql($ic55$)) {
                return f21959(module0205.f13203(var35, (SubLObject)UNPROVIDED));
            }
            if (var36.eql($ic56$)) {
                return module0612.$g2464$.getGlobalValue();
            }
            if (var36.eql($ic57$)) {
                return module0612.$g2464$.getGlobalValue();
            }
        }
        else {
            if (NIL != module0612.f37390(var35)) {
                return module0612.$g2464$.getGlobalValue();
            }
            if (NIL != module0612.f37389(var35)) {
                return var35;
            }
            if (NIL != module0612.f37388(var35)) {
                return var35;
            }
            if (NIL != f21974(var35)) {
                return module0612.f37512(var35);
            }
            if (NIL != module0202.f12689(var35, (SubLObject)UNPROVIDED)) {
                return var35;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21969(final SubLObject var35) {
        final SubLObject var36 = module0205.f13136(var35);
        if (var36.eql($ic49$)) {
            return f21961(module0205.f13277(var35, (SubLObject)UNPROVIDED));
        }
        return f21965(var35);
    }
    
    public static SubLObject f21967(final SubLObject var35) {
        final SubLObject var36 = module0205.f13136(var35);
        if (var36.eql($ic49$)) {
            return f21967(module0205.f13277(var35, (SubLObject)UNPROVIDED));
        }
        return f21965(var35);
    }
    
    public static SubLObject f21965(final SubLObject var35) {
        if (NIL != f21972(var35)) {
            final SubLObject var36 = module0205.f13136(var35);
            if (var36.eql($ic50$)) {
                return f21965(module0205.f13204(var35, (SubLObject)UNPROVIDED));
            }
            if (var36.eql($ic51$)) {
                return module0051.f3650(f21959(module0205.f13204(var35, (SubLObject)UNPROVIDED)));
            }
            if (var36.eql($ic52$)) {
                return f21959(module0205.f13203(var35, (SubLObject)UNPROVIDED));
            }
            if (var36.eql($ic53$)) {
                return f21965(module0205.f13203(var35, (SubLObject)UNPROVIDED));
            }
            if (var36.eql($ic54$)) {
                return module0612.$g2466$.getGlobalValue();
            }
            if (var36.eql($ic55$)) {
                return module0612.$g2466$.getGlobalValue();
            }
            if (var36.eql($ic56$)) {
                return module0051.f3650(f21959(module0205.f13203(var35, (SubLObject)UNPROVIDED)));
            }
            if (var36.eql($ic57$)) {
                return f21965(module0205.f13203(var35, (SubLObject)UNPROVIDED));
            }
        }
        else if (NIL != f21975(var35)) {
            final SubLObject var36 = module0205.f13136(var35);
            if (var36.eql($ic50$)) {
                return f21965(module0205.f13204(var35, (SubLObject)UNPROVIDED));
            }
            if (var36.eql($ic52$)) {
                return f21959(module0205.f13203(var35, (SubLObject)UNPROVIDED));
            }
            if (var36.eql($ic53$)) {
                return f21965(module0205.f13203(var35, (SubLObject)UNPROVIDED));
            }
            if (var36.eql($ic54$)) {
                return module0612.$g2466$.getGlobalValue();
            }
            if (var36.eql($ic55$)) {
                return module0612.$g2466$.getGlobalValue();
            }
            if (var36.eql($ic57$)) {
                return f21965(module0205.f13203(var35, (SubLObject)UNPROVIDED));
            }
        }
        else {
            if (NIL != module0612.f37390(var35)) {
                return module0612.$g2466$.getGlobalValue();
            }
            if (NIL != module0612.f37389(var35)) {
                return var35;
            }
            if (NIL != module0612.f37388(var35)) {
                return var35;
            }
            if (NIL != f21974(var35)) {
                return module0612.f37538(var35);
            }
            if (NIL != module0202.f12689(var35, (SubLObject)UNPROVIDED)) {
                return var35;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21976(final SubLObject var17) {
        return (SubLObject)makeBoolean(NIL != f21934(var17) && NIL != module0323.f21850(f21931(var17)));
    }
    
    public static SubLObject f21972(final SubLObject var35) {
        if (NIL == module0206.f13453(var35)) {
            return (SubLObject)NIL;
        }
        final SubLObject var36 = module0205.f13136(var35);
        if (var36.eql($ic50$) || var36.eql($ic51$)) {
            final SubLObject var37 = module0205.f13203(var35, (SubLObject)UNPROVIDED);
            final SubLObject var38 = module0205.f13204(var35, (SubLObject)UNPROVIDED);
            return (SubLObject)makeBoolean((NIL != f21974(var37) || NIL != f21972(var37)) && (NIL != f21974(var38) || NIL != f21972(var38)));
        }
        if (var36.eql($ic52$) || var36.eql($ic53$) || var36.eql($ic54$) || var36.eql($ic56$) || var36.eql($ic55$) || var36.eql($ic57$)) {
            final SubLObject var37 = module0205.f13203(var35, (SubLObject)UNPROVIDED);
            return (SubLObject)makeBoolean(NIL != f21974(var37) || NIL != f21972(var37));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21973(final SubLObject var35) {
        return (SubLObject)makeBoolean(NIL != module0206.f13453(var35) && NIL != conses_high.member(module0205.f13136(var35), (SubLObject)$ic58$, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f21975(final SubLObject var35) {
        return (SubLObject)makeBoolean(NIL != module0206.f13453(var35) && NIL != module0004.f104(module0205.f13136(var35), (SubLObject)$ic59$, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f21974(final SubLObject var17) {
        return f21977(var17, (SubLObject)NIL);
    }
    
    public static SubLObject f21977(final SubLObject var17, final SubLObject var64) {
        if (NIL == module0202.f12659(var17)) {
            return (SubLObject)NIL;
        }
        final SubLObject var65 = module0205.f13136(var17);
        if (NIL != var64 && !var65.eql(var64)) {
            return (SubLObject)NIL;
        }
        final SubLObject var66 = var65;
        if (var66.eql($ic60$)) {
            final SubLObject var67 = module0205.f13203(var17, (SubLObject)UNPROVIDED);
            return (SubLObject)makeBoolean(var67.isInteger() && ZERO_INTEGER.numLE(var67) && var67.numLE((SubLObject)$ic61$) && NIL != f21977(module0205.f13204(var17, (SubLObject)UNPROVIDED), $ic62$));
        }
        if (var66.eql($ic62$)) {
            final SubLObject var68 = module0205.f13203(var17, (SubLObject)UNPROVIDED);
            return (SubLObject)makeBoolean(var68.isInteger() && ZERO_INTEGER.numLE(var68) && var68.numLE((SubLObject)$ic61$) && NIL != f21977(module0205.f13204(var17, (SubLObject)UNPROVIDED), $ic63$));
        }
        if (var66.eql($ic63$)) {
            final SubLObject var69 = module0205.f13203(var17, (SubLObject)UNPROVIDED);
            return (SubLObject)makeBoolean(var69.isInteger() && ZERO_INTEGER.numLE(var69) && var69.numLE((SubLObject)$ic64$) && NIL != f21977(module0205.f13204(var17, (SubLObject)UNPROVIDED), $ic65$));
        }
        if (var66.eql($ic65$)) {
            final SubLObject var70 = module0205.f13203(var17, (SubLObject)UNPROVIDED);
            return (SubLObject)makeBoolean(var70.isInteger() && ONE_INTEGER.numLE(var70) && var70.numLE((SubLObject)$ic66$) && NIL != f21977(module0205.f13204(var17, (SubLObject)UNPROVIDED), $ic67$));
        }
        if (var66.eql($ic67$)) {
            final SubLObject var71 = module0205.f13203(var17, (SubLObject)UNPROVIDED);
            return (SubLObject)makeBoolean(NIL != module0612.f37436(var71) && NIL != f21977(module0205.f13204(var17, (SubLObject)UNPROVIDED), $ic68$));
        }
        if (var66.eql($ic69$)) {
            final SubLObject var72 = module0205.f13203(var17, (SubLObject)UNPROVIDED);
            return (SubLObject)makeBoolean(var72.isInteger() && ONE_INTEGER.numLE(var72) && var72.numLE((SubLObject)FOUR_INTEGER) && NIL != f21977(module0205.f13204(var17, (SubLObject)UNPROVIDED), $ic68$));
        }
        if (var66.eql($ic68$)) {
            return Types.integerp(module0205.f13203(var17, (SubLObject)UNPROVIDED));
        }
        if (var66.eql($ic70$)) {
            return Types.integerp(module0205.f13203(var17, (SubLObject)UNPROVIDED));
        }
        if (var66.eql($ic71$)) {
            return Types.integerp(module0205.f13203(var17, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21978() {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        SubLObject var24 = (SubLObject)NIL;
        final SubLObject var25 = module0137.f8955($ic72$);
        module0242.f15669(var25);
        final SubLObject var26 = module0079.f5424(module0137.f8919(var25));
        SubLObject var29;
        for (SubLObject var27 = (SubLObject)NIL; NIL == var27; var27 = (SubLObject)makeBoolean(NIL == var29)) {
            var23.resetMultipleValues();
            final SubLObject var28 = module0052.f3693(var26);
            var29 = var23.secondMultipleValue();
            var23.resetMultipleValues();
            if (NIL != var29) {
                SubLObject var31;
                final SubLObject var30 = var31 = var28;
                SubLObject var32 = (SubLObject)NIL;
                SubLObject var33 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic73$);
                var32 = var31.first();
                var31 = var31.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic73$);
                var33 = var31.first();
                var31 = var31.rest();
                if (NIL == var31) {
                    SubLObject var34 = (SubLObject)NIL;
                    if (NIL != f21916(var32)) {
                        var34 = f21917(var32);
                    }
                    else if (NIL != f21924(var32)) {
                        var34 = f21925(var32);
                    }
                    if (NIL == module0172.f10917(var34) && NIL == module0173.f10969(var34)) {
                        var24 = (SubLObject)ConsesLow.cons(var34, var24);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)$ic73$);
                }
            }
        }
        return Sequences.nreverse(var24);
    }
    
    public static SubLObject f21979() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21912", "S#24505", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21913", "S#24506", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21914", "S#24507", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21916", "S#24496", 1, 0, false);
        new $f21916$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21917", "S#24508", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21918", "S#24509", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21919", "S#24510", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21920", "S#24511", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21921", "S#24512", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21922", "S#24497", 1, 0, false);
        new $f21922$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21923", "S#24513", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21924", "S#24498", 1, 0, false);
        new $f21924$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21925", "S#24514", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21926", "S#24515", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21927", "S#24516", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21928", "S#24517", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21929", "S#24518", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21930", "S#24499", 1, 0, false);
        new $f21930$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21915", "S#24519", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21932", "S#24520", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21933", "S#24521", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21934", "S#24522", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21935", "S#11213", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21931", "S#24432", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21936", "S#24523", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21937", "S#24524", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21938", "S#24525", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21940", "S#24526", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21941", "S#24527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21939", "S#24528", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21942", "S#24529", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21943", "S#18656", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21944", "S#18657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21945", "S#24530", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21946", "S#24531", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21947", "S#24532", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21948", "S#24533", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21950", "S#24534", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21949", "S#24535", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21951", "S#24536", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21952", "S#13554", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21953", "S#24537", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21955", "S#18844", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21956", "S#24538", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21957", "S#24539", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21958", "S#24540", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21960", "S#24541", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21962", "S#24542", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21964", "S#24543", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21966", "S#24544", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21968", "S#24545", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21954", "S#18658", 1, 0, false);
        new $f21954$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21970", "S#24546", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21971", "S#24547", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21961", "S#24548", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21963", "S#24549", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21959", "S#24550", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21969", "S#24551", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21967", "S#24552", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21965", "S#24553", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21976", "S#15386", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21972", "S#24554", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21973", "S#24555", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21975", "S#24556", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21974", "S#24557", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21977", "S#24558", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0324", "f21978", "S#24559", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21980() {
        $g2833$ = SubLFiles.deflexical("S#24560", (SubLObject)$ic0$);
        $g2834$ = SubLFiles.deflexical("S#24561", (NIL != Symbols.boundp((SubLObject)$ic2$)) ? $g2834$.getGlobalValue() : Locks.make_lock((SubLObject)$ic3$));
        $g2835$ = SubLFiles.deflexical("S#24562", (NIL != Symbols.boundp((SubLObject)$ic4$)) ? $g2835$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)$ic5$, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        $g2836$ = SubLFiles.deflexical("S#24563", (NIL != Symbols.boundp((SubLObject)$ic6$)) ? $g2836$.getGlobalValue() : Locks.make_lock((SubLObject)$ic7$));
        $g2837$ = SubLFiles.deflexical("S#24564", (NIL != Symbols.boundp((SubLObject)$ic8$)) ? $g2837$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)$ic5$, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        $g2838$ = SubLFiles.defconstant("S#24565", (SubLObject)$ic9$);
        $g2839$ = SubLFiles.defconstant("S#24566", (SubLObject)$ic28$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21981() {
        module0003.f57((SubLObject)$ic2$);
        module0003.f57((SubLObject)$ic4$);
        module0003.f57((SubLObject)$ic6$);
        module0003.f57((SubLObject)$ic8$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g2838$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic16$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic17$);
        Structures.def_csetf((SubLObject)$ic18$, (SubLObject)$ic19$);
        Equality.identity((SubLObject)$ic9$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g2838$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic26$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g2838$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic27$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g2839$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic32$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic33$);
        Structures.def_csetf((SubLObject)$ic34$, (SubLObject)$ic35$);
        Equality.identity((SubLObject)$ic28$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g2839$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic37$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g2839$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic38$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f21979();
    }
    
    public void initializeVariables() {
        f21980();
    }
    
    public void runTopLevelForms() {
        f21981();
    }
    
    static {
        me = (SubLFile)new module0324();
        $g2833$ = null;
        $g2834$ = null;
        $g2835$ = null;
        $g2836$ = null;
        $g2837$ = null;
        $g2838$ = null;
        $g2839$ = null;
        $ic0$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("weak-HL-TimePrecedence")), constant_handles_oc.f8479((SubLObject)makeString("strict-HL-TimePrecedence")), constant_handles_oc.f8479((SubLObject)makeString("successorStrict-HL-TimePrecedence")), constant_handles_oc.f8479((SubLObject)makeString("weakSuccessor-HL-TimePrecedence")));
        $ic1$ = makeSymbol("VALID-CONSTANT?");
        $ic2$ = makeSymbol("S#24561", "CYC");
        $ic3$ = makeString("*hl-start-table-lock*");
        $ic4$ = makeSymbol("S#24562", "CYC");
        $ic5$ = makeInteger(100);
        $ic6$ = makeSymbol("S#24563", "CYC");
        $ic7$ = makeString("*hl-end-table-lock*");
        $ic8$ = makeSymbol("S#24564", "CYC");
        $ic9$ = makeSymbol("S#18656", "CYC");
        $ic10$ = makeSymbol("S#24496", "CYC");
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("S#24567", "CYC"));
        $ic12$ = ConsesLow.list((SubLObject)makeKeyword("INTERVAL"));
        $ic13$ = ConsesLow.list((SubLObject)makeSymbol("S#24508", "CYC"));
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("S#24509", "CYC"));
        $ic15$ = makeSymbol("S#24519", "CYC");
        $ic16$ = makeSymbol("S#24507", "CYC");
        $ic17$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#24496", "CYC"));
        $ic18$ = makeSymbol("S#24508", "CYC");
        $ic19$ = makeSymbol("S#24509", "CYC");
        $ic20$ = makeKeyword("INTERVAL");
        $ic21$ = makeString("Invalid slot ~S for construction function");
        $ic22$ = makeKeyword("BEGIN");
        $ic23$ = makeSymbol("S#24510", "CYC");
        $ic24$ = makeKeyword("SLOT");
        $ic25$ = makeKeyword("END");
        $ic26$ = makeSymbol("S#24512", "CYC");
        $ic27$ = makeSymbol("S#24497", "CYC");
        $ic28$ = makeSymbol("S#18657", "CYC");
        $ic29$ = makeSymbol("S#24498", "CYC");
        $ic30$ = ConsesLow.list((SubLObject)makeSymbol("S#24514", "CYC"));
        $ic31$ = ConsesLow.list((SubLObject)makeSymbol("S#24515", "CYC"));
        $ic32$ = makeSymbol("S#24513", "CYC");
        $ic33$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#24498", "CYC"));
        $ic34$ = makeSymbol("S#24514", "CYC");
        $ic35$ = makeSymbol("S#24515", "CYC");
        $ic36$ = makeSymbol("S#24516", "CYC");
        $ic37$ = makeSymbol("S#24518", "CYC");
        $ic38$ = makeSymbol("S#24499", "CYC");
        $ic39$ = makeString("#<");
        $ic40$ = makeKeyword("STREAM");
        $ic41$ = makeString("~a");
        $ic42$ = makeKeyword("BASE");
        $ic43$ = makeString("~a is not a valid endpoint-p.");
        $ic44$ = makeSymbol("S#24522", "CYC");
        $ic45$ = ConsesLow.list((SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"));
        $ic46$ = makeKeyword("START");
        $ic47$ = makeKeyword("CONJUNCTIVE?");
        $ic48$ = makeKeyword("NOT-FOUND");
        $ic49$ = constant_handles_oc.f8479((SubLObject)makeString("SomeTimeInIntervalFn"));
        $ic50$ = constant_handles_oc.f8479((SubLObject)makeString("TimeIntervalInclusiveFn"));
        $ic51$ = constant_handles_oc.f8479((SubLObject)makeString("TimeIntervalBetweenFn"));
        $ic52$ = constant_handles_oc.f8479((SubLObject)makeString("StartFn"));
        $ic53$ = constant_handles_oc.f8479((SubLObject)makeString("EndFn"));
        $ic54$ = constant_handles_oc.f8479((SubLObject)makeString("IntervalStartedByFn"));
        $ic55$ = constant_handles_oc.f8479((SubLObject)makeString("IntervalStartedByFn-Inclusive"));
        $ic56$ = constant_handles_oc.f8479((SubLObject)makeString("IntervalEndedByFn"));
        $ic57$ = constant_handles_oc.f8479((SubLObject)makeString("IntervalEndedByFn-Inclusive"));
        $ic58$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TimeIntervalInclusiveFn")), constant_handles_oc.f8479((SubLObject)makeString("StartFn")), constant_handles_oc.f8479((SubLObject)makeString("EndFn")), constant_handles_oc.f8479((SubLObject)makeString("IntervalEndedByFn")), constant_handles_oc.f8479((SubLObject)makeString("IntervalStartedByFn-Inclusive")), constant_handles_oc.f8479((SubLObject)makeString("IntervalEndedByFn-Inclusive")));
        $ic59$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TimeIntervalInclusiveFn")), constant_handles_oc.f8479((SubLObject)makeString("StartFn")), constant_handles_oc.f8479((SubLObject)makeString("EndFn")), constant_handles_oc.f8479((SubLObject)makeString("IntervalStartedByFn")), constant_handles_oc.f8479((SubLObject)makeString("IntervalStartedByFn-Inclusive")), constant_handles_oc.f8479((SubLObject)makeString("IntervalEndedByFn-Inclusive")));
        $ic60$ = constant_handles_oc.f8479((SubLObject)makeString("SecondFn"));
        $ic61$ = makeInteger(59);
        $ic62$ = constant_handles_oc.f8479((SubLObject)makeString("MinuteFn"));
        $ic63$ = constant_handles_oc.f8479((SubLObject)makeString("HourFn"));
        $ic64$ = makeInteger(23);
        $ic65$ = constant_handles_oc.f8479((SubLObject)makeString("DayFn"));
        $ic66$ = makeInteger(31);
        $ic67$ = constant_handles_oc.f8479((SubLObject)makeString("MonthFn"));
        $ic68$ = constant_handles_oc.f8479((SubLObject)makeString("YearFn"));
        $ic69$ = constant_handles_oc.f8479((SubLObject)makeString("QuarterFn"));
        $ic70$ = constant_handles_oc.f8479((SubLObject)makeString("DecadeFn"));
        $ic71$ = constant_handles_oc.f8479((SubLObject)makeString("CenturyFn"));
        $ic72$ = constant_handles_oc.f8479((SubLObject)makeString("weak-HL-TimePrecedence"));
        $ic73$ = ConsesLow.list((SubLObject)makeSymbol("S#9182", "CYC"), (SubLObject)makeSymbol("S#24487", "CYC"));
    }
    
    public static final class $sX18656_native extends SubLStructNative
    {
        public SubLObject $interval;
        private static final SubLStructDeclNative structDecl;
        
        public $sX18656_native() {
            this.$interval = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX18656_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$interval;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$interval = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX18656_native.class, $ic9$, $ic10$, $ic11$, $ic12$, new String[] { "$interval" }, $ic13$, $ic14$, $ic15$);
        }
    }
    
    public static final class $f21916$UnaryFunction extends UnaryFunction
    {
        public $f21916$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#24496"));
        }
        
        public SubLObject processItem(final SubLObject var7) {
            return f21916(var7);
        }
    }
    
    public static final class $f21922$UnaryFunction extends UnaryFunction
    {
        public $f21922$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#24497"));
        }
        
        public SubLObject processItem(final SubLObject var7) {
            return f21922(var7);
        }
    }
    
    public static final class $sX18657_native extends SubLStructNative
    {
        public SubLObject $interval;
        private static final SubLStructDeclNative structDecl;
        
        public $sX18657_native() {
            this.$interval = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX18657_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$interval;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$interval = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX18657_native.class, $ic28$, $ic29$, $ic11$, $ic12$, new String[] { "$interval" }, $ic30$, $ic31$, $ic15$);
        }
    }
    
    public static final class $f21924$UnaryFunction extends UnaryFunction
    {
        public $f21924$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#24498"));
        }
        
        public SubLObject processItem(final SubLObject var7) {
            return f21924(var7);
        }
    }
    
    public static final class $f21930$UnaryFunction extends UnaryFunction
    {
        public $f21930$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#24499"));
        }
        
        public SubLObject processItem(final SubLObject var7) {
            return f21930(var7);
        }
    }
    
    public static final class $f21954$UnaryFunction extends UnaryFunction
    {
        public $f21954$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#18658"));
        }
        
        public SubLObject processItem(final SubLObject var7) {
            return f21954(var7);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 294 ms
	
	Decompiled with Procyon 0.5.32.
*/