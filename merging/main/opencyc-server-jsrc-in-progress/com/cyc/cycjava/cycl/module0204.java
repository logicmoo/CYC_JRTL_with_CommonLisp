package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0204 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0204";
    public static final String myFingerPrint = "c786922ef5916abe37d1953a7368b0e4c679dc05e6a62a24f5869e3bbdcb8093";
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    
    public static SubLObject f13026(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            var4 = var5;
            SubLObject var8 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
            var8 = var4.first();
            final SubLObject var9;
            var4 = (var9 = var4.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list(var6, var7), var8, ConsesLow.append(var9, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13027(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic2$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic2$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic2$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic2$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic2$);
        var9 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var10;
            var4 = (var10 = var5);
            final SubLObject var11 = (SubLObject)$ic3$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list(var6, var11, var7, var8), (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)$ic6$, var11, var7, var9), ConsesLow.append(var10, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic2$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13028(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic2$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic2$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic2$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic2$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic2$);
        var9 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var10;
            var4 = (var10 = var5);
            final SubLObject var11 = (SubLObject)$ic7$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list(var6, var11, var7, var8), (SubLObject)ConsesLow.listS((SubLObject)$ic8$, (SubLObject)ConsesLow.list((SubLObject)$ic6$, var11, var7, var9), ConsesLow.append(var10, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic2$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13029(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic9$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic9$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic9$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            var4 = var5;
            SubLObject var8 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic9$);
            var8 = var4.first();
            final SubLObject var9;
            var4 = (var9 = var4.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list(var6, var7), var8, ConsesLow.append(var9, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic9$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13030(final SubLObject var6, final SubLObject var7, final SubLObject var8) {
        if (var6.eql(module0232.f15306(var8)) && var7.eql(module0232.f15308(var8))) {
            return var8;
        }
        return module0232.f15305(var6, var7);
    }
    
    public static SubLObject f13031(final SubLObject var6, final SubLObject var7, final SubLObject var8) {
        if (!var6.eql(module0232.f15306(var8))) {
            ConsesLow.set_nth((SubLObject)ZERO_INTEGER, var8, var6);
        }
        if (!var7.eql(module0232.f15308(var8))) {
            ConsesLow.set_nth((SubLObject)ONE_INTEGER, var8, var7);
        }
        return var8;
    }
    
    public static SubLObject f13032(final SubLObject var6, final SubLObject var7, final SubLObject var25) {
        return f13030(var6, var7, var25);
    }
    
    public static SubLObject f13033(final SubLObject var13) {
        return module0232.f15326((SubLObject)NIL, (SubLObject)ConsesLow.list(var13));
    }
    
    public static SubLObject f13034(final SubLObject var13) {
        return module0232.f15326((SubLObject)ConsesLow.list(var13), (SubLObject)NIL);
    }
    
    public static SubLObject f13035(final SubLObject var13) {
        return module0232.f15330((SubLObject)NIL, (SubLObject)ConsesLow.list(var13));
    }
    
    public static SubLObject f13036(final SubLObject var13) {
        return module0232.f15330((SubLObject)ConsesLow.list(var13), (SubLObject)NIL);
    }
    
    public static SubLObject f13037(final SubLObject var26, final SubLObject var27) {
        return ($ic10$ == var27) ? f13033(var26) : f13034(var26);
    }
    
    public static SubLObject f13038(final SubLObject var26, final SubLObject var27) {
        return ($ic10$ == var27) ? f13035(var26) : f13036(var26);
    }
    
    public static SubLObject f13039(final SubLObject var6, final SubLObject var7, final SubLObject var28) {
        return f13030(var6, var7, var28);
    }
    
    public static SubLObject f13040(final SubLObject var6, final SubLObject var7, final SubLObject var28) {
        return f13031(var6, var7, var28);
    }
    
    public static SubLObject f13041(final SubLObject var13, final SubLObject var14) {
        assert NIL != module0130.f8516(var14) : var14;
        return ($ic12$ == var14) ? module0205.f13338(var13) : var13;
    }
    
    public static SubLObject f13042(final SubLObject var29) {
        return module0035.f2169(var29, (SubLObject)$ic13$);
    }
    
    public static SubLObject f13043(final SubLObject var8, final SubLObject var30, final SubLObject var31) {
        return (SubLObject)makeBoolean(NIL != module0232.f15304(var8) && NIL != module0035.f1995(module0232.f15306(var8), var30, (SubLObject)UNPROVIDED) && NIL != module0035.f1995(module0232.f15308(var8), var31, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f13044(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != module0232.f15320(var25) && NIL != f13043(var25, (SubLObject)ZERO_INTEGER, (SubLObject)ONE_INTEGER));
    }
    
    public static SubLObject f13045(final SubLObject var8) {
        return f13043(var8, (SubLObject)ZERO_INTEGER, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f13046(final SubLObject var29, final SubLObject var32) {
        if (NIL != f13044(var29)) {
            final SubLObject var33 = f13047(var29);
            return module0202.f12589(var33, var32);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13048(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != module0232.f15320(var25) && NIL != f13043(var25, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER));
    }
    
    public static SubLObject f13049(final SubLObject var8) {
        return f13043(var8, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f13050(final SubLObject var29, final SubLObject var32) {
        if (NIL != f13048(var29)) {
            final SubLObject var33 = f13047(var29);
            return module0202.f12589(var33, var32);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13051(final SubLObject var8) {
        if (NIL != module0232.f15312(var8)) {
            final SubLObject var9 = f13052(var8);
            final SubLObject var10 = module0205.f13385(var9, (SubLObject)UNPROVIDED);
            if (NIL != module0035.f2370((SubLObject)$ic14$, var10, (SubLObject)UNPROVIDED)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13047(final SubLObject var25) {
        return module0232.f15308(var25).first();
    }
    
    public static SubLObject f13053(final SubLObject var8, final SubLObject var14) {
        assert NIL != module0130.f8516(var14) : var14;
        if (var14.eql((SubLObject)$ic15$)) {
            return module0232.f15308(var8);
        }
        if (var14.eql((SubLObject)$ic12$)) {
            return module0232.f15306(var8);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13054(final SubLObject var35) {
        return (NIL != f13044(var35)) ? module0232.f15308(var35).first() : module0232.f15306(var35).first();
    }
    
    public static SubLObject f13052(final SubLObject var35) {
        return (NIL != f13045(var35)) ? module0232.f15308(var35).first() : module0232.f15306(var35).first();
    }
    
    public static SubLObject f13055(final SubLObject var35) {
        final SubLObject var36 = f13054(var35);
        final SubLObject var37 = module0205.f13333(var36);
        return var37;
    }
    
    public static SubLObject f13056(final SubLObject var35) {
        final SubLObject var36 = f13052(var35);
        final SubLObject var37 = module0205.f13333(var36);
        return var37;
    }
    
    public static SubLObject f13057(final SubLObject var8) {
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var8, (SubLObject)$ic16$);
        var9 = var8.first();
        SubLObject var11 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var11, var8, (SubLObject)$ic16$);
        var10 = var11.first();
        var11 = var11.rest();
        if (NIL == var11) {
            return module0232.f15305(var10, var9);
        }
        cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic16$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13058(final SubLObject var39) {
        return Mapping.mapcar((SubLObject)$ic17$, var39);
    }
    
    public static SubLObject f13059(final SubLObject var29) {
        return (SubLObject)makeBoolean(var29.isCons() && NIL != module0035.f1997(var29) && NIL != module0232.f15312(var29.first()));
    }
    
    public static SubLObject f13060(final SubLObject var29) {
        return (SubLObject)makeBoolean(var29.isCons() && NIL != module0035.f1997(var29) && NIL != f13045(var29.first()));
    }
    
    public static SubLObject f13061(final SubLObject var29) {
        return (SubLObject)makeBoolean(var29.isCons() && NIL != module0035.f1997(var29) && NIL != f13049(var29.first()));
    }
    
    public static SubLObject f13062(final SubLObject var40) {
        return f13052(var40.first());
    }
    
    public static SubLObject f13063(final SubLObject var40) {
        return f13056(var40.first());
    }
    
    public static SubLObject f13064(final SubLObject var39, SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        final SubLObject var42 = Hashtables.make_hash_table(Sequences.length(var39), var41, (SubLObject)UNPROVIDED);
        SubLObject var43 = var39;
        SubLObject var44 = (SubLObject)NIL;
        var44 = var43.first();
        while (NIL != var43) {
            module0030.f1599(module0232.f15306(var44), var44, var42);
            var43 = var43.rest();
            var44 = var43.first();
        }
        return module0030.f1627(var42);
    }
    
    public static SubLObject f13065(final SubLObject var8) {
        return Values.values(module0232.f15306(var8), module0232.f15308(var8));
    }
    
    public static SubLObject f13066(final SubLObject var29) {
        return f13067(var29, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13067(final SubLObject var29, SubLObject var44) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)$ic14$;
        }
        return (SubLObject)makeBoolean(var29.isList() && Sequences.length(var29).numE((SubLObject)TWO_INTEGER) && NIL != f13068(var29.first(), var44) && NIL != f13068(conses_high.second(var29), var44));
    }
    
    public static SubLObject f13068(final SubLObject var29, SubLObject var44) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)$ic14$;
        }
        return (SubLObject)makeBoolean((var29.isList() && NIL != f13069(var29.first(), var44)) || NIL != Functions.funcall(var44, var29));
    }
    
    public static SubLObject f13069(final SubLObject var29, SubLObject var44) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)$ic14$;
        }
        return (SubLObject)makeBoolean(NIL != module0202.f12937(var29) || NIL != Functions.funcall(var44, var29));
    }
    
    public static SubLObject f13070(final SubLObject var8) {
        return Sequences.cconcatenate(Mapping.mapcar((SubLObject)$ic18$, module0232.f15306(var8)), module0232.f15308(var8));
    }
    
    public static SubLObject f13071(final SubLObject var25) {
        return f13070(var25);
    }
    
    public static SubLObject f13072(final SubLObject var28) {
        return f13070(var28);
    }
    
    public static SubLObject f13073(final SubLObject var45) {
        SubLObject var46 = (SubLObject)NIL;
        SubLObject var47 = (SubLObject)NIL;
        SubLObject var48 = var45;
        SubLObject var49 = (SubLObject)NIL;
        var49 = var48.first();
        while (NIL != var48) {
            if (NIL != module0205.f13337(var49)) {
                var46 = (SubLObject)ConsesLow.cons(var49, var46);
            }
            else {
                var47 = (SubLObject)ConsesLow.cons(var49, var47);
            }
            var48 = var48.rest();
            var49 = var48.first();
        }
        return module0232.f15305(Sequences.nreverse(var46), Sequences.nreverse(var47));
    }
    
    public static SubLObject f13074(final SubLObject var8) {
        return f13075(var8);
    }
    
    public static SubLObject f13075(final SubLObject var8) {
        SubLObject var9 = (SubLObject)ZERO_INTEGER;
        SubLObject var10 = module0232.f15306(var8);
        SubLObject var11 = (SubLObject)NIL;
        var11 = var10.first();
        while (NIL != var10) {
            var9 = Numbers.add(var9, (SubLObject)ONE_INTEGER);
            var10 = var10.rest();
            var11 = var10.first();
        }
        var10 = module0232.f15308(var8);
        var11 = (SubLObject)NIL;
        var11 = var10.first();
        while (NIL != var10) {
            var9 = Numbers.add(var9, (SubLObject)ONE_INTEGER);
            var10 = var10.rest();
            var11 = var10.first();
        }
        return var9;
    }
    
    public static SubLObject f13076(final SubLObject var8) {
        return Numbers.numE((SubLObject)ONE_INTEGER, f13074(var8));
    }
    
    public static SubLObject f13077(final SubLObject var8) {
        return Numbers.numE((SubLObject)TWO_INTEGER, f13074(var8));
    }
    
    public static SubLObject f13078(final SubLObject var8) {
        return Numbers.numE((SubLObject)THREE_INTEGER, f13074(var8));
    }
    
    public static SubLObject f13079(final SubLObject var8) {
        return ConsesLow.append(module0232.f15306(var8), module0232.f15308(var8));
    }
    
    public static SubLObject f13080(final SubLObject var25) {
        return module0035.f2216(module0202.f12844(module0232.f15306(var25)), module0202.f12844(module0232.f15308(var25)), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13081(final SubLObject var25) {
        return module0035.f2216(module0202.f12845(module0232.f15306(var25)), module0202.f12845(module0232.f15308(var25)), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13082(final SubLObject var25, final SubLObject var32) {
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = module0232.f15306(var25);
        SubLObject var35 = (SubLObject)NIL;
        var35 = var34.first();
        while (NIL != var34) {
            if (NIL != module0202.f12851(var35, var32)) {
                var33 = (SubLObject)ConsesLow.cons(var35, var33);
            }
            var34 = var34.rest();
            var35 = var34.first();
        }
        var34 = module0232.f15308(var25);
        var35 = (SubLObject)NIL;
        var35 = var34.first();
        while (NIL != var34) {
            if (NIL != module0202.f12851(var35, var32)) {
                var33 = (SubLObject)ConsesLow.cons(var35, var33);
            }
            var34 = var34.rest();
            var35 = var34.first();
        }
        return Sequences.nreverse(var33);
    }
    
    public static SubLObject f13083(final SubLObject var8) {
        final SubLObject var9 = module0232.f15308(var8);
        final SubLObject var10 = module0232.f15306(var8);
        return (SubLObject)makeBoolean(((NIL != module0035.f1997(var9) && NIL == var10) || (NIL != module0035.f1997(var10) && NIL == var9)) && NIL != module0202.f12689(var8, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f13084(final SubLObject var8, SubLObject var44) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)$ic14$;
        }
        SubLObject var45 = (SubLObject)NIL;
        SubLObject var46 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var8, (SubLObject)$ic16$);
        var45 = var8.first();
        SubLObject var47 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var47, var8, (SubLObject)$ic16$);
        var46 = var47.first();
        var47 = var47.rest();
        if (NIL == var47) {
            return conses_high.nunion(module0202.f12948(var45, var44), module0202.f12948(var46, var44), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic16$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13085(final SubLObject var8, SubLObject var44) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)$ic14$;
        }
        final SubLThread var45 = SubLProcess.currentSubLThread();
        SubLObject var46 = (SubLObject)NIL;
        SubLObject var47 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var8, (SubLObject)$ic16$);
        var46 = var8.first();
        SubLObject var48 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var48, var8, (SubLObject)$ic16$);
        var47 = var48.first();
        var48 = var48.rest();
        if (NIL != var48) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic16$);
            return (SubLObject)NIL;
        }
        final SubLObject var49 = (SubLObject)NIL;
        if (NIL != module0232.f15312(var8) && NIL != module0202.f12871(var47.first())) {
            SubLObject var50 = (SubLObject)NIL;
            final SubLObject var51 = module0144.$g1807$.currentBinding(var45);
            try {
                module0144.$g1807$.bind((SubLObject)T, var45);
                var50 = module0035.f2216(module0202.f12949(var46, var49, var44), module0202.f12949(var47, var49, var44), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0144.$g1807$.rebind(var51, var45);
            }
            return var50;
        }
        return module0035.f2216(module0202.f12949(var46, var49, var44), module0202.f12949(var47, var49, var44), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13086(final SubLObject var8, SubLObject var44) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)$ic14$;
        }
        return f13087(var8, var44, (SubLObject)NIL);
    }
    
    public static SubLObject f13087(final SubLObject var8, SubLObject var44, SubLObject var56) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)$ic14$;
        }
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)T;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        SubLObject var58 = (SubLObject)NIL;
        SubLObject var59 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var8, (SubLObject)$ic16$);
        var58 = var8.first();
        SubLObject var60 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var60, var8, (SubLObject)$ic16$);
        var59 = var60.first();
        var60 = var60.rest();
        if (NIL != var60) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic16$);
            return (SubLObject)NIL;
        }
        final SubLObject var61 = (SubLObject)NIL;
        if (NIL != module0232.f15312(var8) && NIL != module0202.f12871(var59.first())) {
            SubLObject var62 = (SubLObject)NIL;
            final SubLObject var63 = module0144.$g1807$.currentBinding(var57);
            try {
                module0144.$g1807$.bind((SubLObject)T, var57);
                var62 = module0035.f2216(module0202.f12969(var58, var61, var44, var56), module0202.f12969(var59, var61, var44, var56), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0144.$g1807$.rebind(var63, var57);
            }
            return var62;
        }
        return module0035.f2216(module0202.f12969(var58, var61, var44, var56), module0202.f12969(var59, var61, var44, var56), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13088(final SubLObject var59, final SubLObject var39, SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = Symbols.symbol_function((SubLObject)EQL);
        }
        SubLObject var60 = (SubLObject)NIL;
        SubLObject var61 = (SubLObject)NIL;
        SubLObject var62 = var39;
        SubLObject var63 = (SubLObject)NIL;
        var63 = var62.first();
        while (NIL != var62) {
            var61 = (SubLObject)NIL;
            if (NIL == var61) {
                SubLObject var64 = var59;
                SubLObject var65 = (SubLObject)NIL;
                var65 = var64.first();
                while (NIL == var61 && NIL != var64) {
                    if (NIL != module0035.f2428(var65, var63, var41, (SubLObject)UNPROVIDED)) {
                        var61 = (SubLObject)T;
                        var60 = (SubLObject)ConsesLow.cons(var63, var60);
                    }
                    var64 = var64.rest();
                    var65 = var64.first();
                }
            }
            var62 = var62.rest();
            var63 = var62.first();
        }
        return Sequences.nreverse(var60);
    }
    
    public static SubLObject f13089(final SubLObject var62, final SubLObject var39, SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = Symbols.symbol_function((SubLObject)EQL);
        }
        SubLObject var63 = (SubLObject)NIL;
        SubLObject var64 = var39;
        SubLObject var65 = (SubLObject)NIL;
        var65 = var64.first();
        while (NIL != var64) {
            if (NIL != module0035.f2428(var62, var65, var41, (SubLObject)UNPROVIDED)) {
                var63 = (SubLObject)ConsesLow.cons(var65, var63);
            }
            var64 = var64.rest();
            var65 = var64.first();
        }
        return Sequences.nreverse(var63);
    }
    
    public static SubLObject f13090(final SubLObject var62, final SubLObject var39, SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = Symbols.symbol_function((SubLObject)EQL);
        }
        SubLObject var63 = (SubLObject)NIL;
        SubLObject var64 = (SubLObject)NIL;
        SubLObject var65 = var39;
        SubLObject var66 = (SubLObject)NIL;
        var66 = var65.first();
        while (NIL != var65) {
            if (NIL != module0035.f2428(var62, var66, var41, (SubLObject)UNPROVIDED)) {
                var63 = (SubLObject)ConsesLow.cons(var66, var63);
            }
            else {
                var64 = (SubLObject)ConsesLow.cons(var66, var64);
            }
            var65 = var65.rest();
            var66 = var65.first();
        }
        return Sequences.nreverse(f13091(var63, var64, module0035.f2399(var63, (SubLObject)$ic14$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f13091(final SubLObject var64, final SubLObject var65, final SubLObject var66) {
        SubLObject var67 = (SubLObject)NIL;
        SubLObject var68 = (SubLObject)NIL;
        SubLObject var69 = (SubLObject)NIL;
        SubLObject var70 = var65;
        SubLObject var71 = (SubLObject)NIL;
        var71 = var70.first();
        while (NIL != var70) {
            SubLObject var72 = (SubLObject)NIL;
            if (NIL == var72) {
                SubLObject var73 = var66;
                SubLObject var74 = (SubLObject)NIL;
                var74 = var73.first();
                while (NIL == var72 && NIL != var73) {
                    if (NIL != module0035.f2428(var74, var71, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var67 = (SubLObject)ConsesLow.cons(var71, var67);
                        var72 = (SubLObject)T;
                        var69 = (SubLObject)T;
                    }
                    var73 = var73.rest();
                    var74 = var73.first();
                }
            }
            if (NIL == var72) {
                var68 = (SubLObject)ConsesLow.cons(var71, var68);
            }
            var70 = var70.rest();
            var71 = var70.first();
        }
        if (NIL != var69) {
            return f13091(ConsesLow.nconc(var64, var67), var68, module0035.f2399(var67, (SubLObject)$ic14$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return var64;
    }
    
    public static SubLObject f13092(final SubLObject var72) {
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var72, var72, (SubLObject)$ic19$);
        var73 = var72.first();
        SubLObject var75 = var72.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var75, var72, (SubLObject)$ic19$);
        var74 = var75.first();
        var75 = var75.rest();
        if (NIL == var75) {
            return (SubLObject)ConsesLow.list($ic20$, var73, var74);
        }
        cdestructuring_bind.cdestructuring_bind_error(var72, (SubLObject)$ic19$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13093(final SubLObject var28) {
        final SubLObject var29 = Mapping.mapcar((SubLObject)$ic21$, module0232.f15308(var28));
        final SubLObject var30 = Mapping.mapcar((SubLObject)$ic22$, Mapping.mapcar((SubLObject)$ic21$, module0232.f15306(var28)));
        if (NIL == var30) {
            if (NIL != var29.rest()) {
                return reader.bq_cons($ic23$, ConsesLow.append(var29, (SubLObject)NIL));
            }
            return var29.first();
        }
        else {
            if (NIL != var29) {
                return reader.bq_cons($ic23$, ConsesLow.append(ConsesLow.append(var30, var29), (SubLObject)NIL));
            }
            if (NIL != var30.rest()) {
                return reader.bq_cons($ic23$, ConsesLow.append(var30, (SubLObject)NIL));
            }
            return var30.first();
        }
    }
    
    public static SubLObject f13094(final SubLObject var75) {
        assert NIL != Types.listp(var75) : var75;
        if (Sequences.length(var75).numE((SubLObject)ONE_INTEGER)) {
            return f13093(var75.first());
        }
        return reader.bq_cons($ic25$, ConsesLow.append(Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic26$), var75), (SubLObject)NIL));
    }
    
    public static SubLObject f13095(final SubLObject var76) {
        final SubLObject var77 = Mapping.mapcar((SubLObject)$ic27$, module0232.f15306(var76));
        final SubLObject var78 = Mapping.mapcar((SubLObject)$ic27$, module0232.f15308(var76));
        return module0232.f15305(var77, var78);
    }
    
    public static SubLObject f13096(final SubLObject var77) {
        return Mapping.mapcar((SubLObject)$ic28$, var77);
    }
    
    public static SubLObject f13097(final SubLObject var29) {
        return (SubLObject)makeBoolean(NIL != module0035.f2014(var29) && NIL != module0035.f1995(var29, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0048.f3291(var29.first()) && NIL != module0048.f3291(conses_high.second(var29)));
    }
    
    public static SubLObject f13098(SubLObject var78, SubLObject var79) {
        SubLObject var80 = var78;
        assert NIL != module0035.f2015(var80) : var80;
        SubLObject var81 = var80;
        SubLObject var82 = (SubLObject)NIL;
        var82 = var81.first();
        while (NIL != var81) {
            assert NIL != module0004.f106(var82) : var82;
            var81 = var81.rest();
            var82 = var81.first();
        }
        var80 = var79;
        assert NIL != module0035.f2015(var80) : var80;
        var81 = var80;
        var82 = (SubLObject)NIL;
        var82 = var81.first();
        while (NIL != var81) {
            assert NIL != module0004.f106(var82) : var82;
            var81 = var81.rest();
            var82 = var81.first();
        }
        var78 = f13099(var78);
        var79 = f13099(var79);
        return (SubLObject)ConsesLow.list(var78, var79);
    }
    
    public static SubLObject f13100(final SubLObject var8) {
        final SubLObject var9 = module0035.f2160(Sequences.length(module0232.f15306(var8)), (SubLObject)UNPROVIDED);
        final SubLObject var10 = module0035.f2160(Sequences.length(module0232.f15308(var8)), (SubLObject)UNPROVIDED);
        return f13098(var9, var10);
    }
    
    public static SubLObject f13101(final SubLObject var79) {
        return f13098((SubLObject)NIL, var79);
    }
    
    public static SubLObject f13102(final SubLObject var78) {
        return f13098(var78, (SubLObject)NIL);
    }
    
    public static SubLObject f13103(final SubLObject var14, final SubLObject var16) {
        final SubLObject var17 = (SubLObject)((var14 == $ic12$) ? ConsesLow.list(var16) : NIL);
        final SubLObject var18 = (SubLObject)((var14 == $ic15$) ? ConsesLow.list(var16) : NIL);
        return f13098(var17, var18);
    }
    
    public static SubLObject f13104(final SubLObject var82) {
        return Sort.sort(var82, Symbols.symbol_function((SubLObject)$ic31$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13099(final SubLObject var82) {
        return f13104(conses_high.copy_list(var82));
    }
    
    public static SubLObject f13105(final SubLObject var15, final SubLObject var83) {
        final SubLObject var84 = Sequences.length(module0232.f15306(var83));
        final SubLObject var85 = Sequences.length(module0232.f15308(var83));
        SubLObject var86 = (SubLObject)NIL;
        SubLObject var87 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var15, var15, (SubLObject)$ic32$);
        var86 = var15.first();
        SubLObject var88 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var88, var15, (SubLObject)$ic32$);
        var87 = var88.first();
        var88 = var88.rest();
        if (NIL == var88) {
            SubLObject var89 = (SubLObject)NIL;
            SubLObject var90 = (SubLObject)NIL;
            SubLObject var91;
            for (var91 = (SubLObject)NIL, var91 = (SubLObject)ZERO_INTEGER; var91.numL(var84); var91 = Numbers.add(var91, (SubLObject)ONE_INTEGER)) {
                if (NIL == module0004.f104(var91, var86, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var89 = (SubLObject)ConsesLow.cons(var91, var89);
                }
            }
            SubLObject var92;
            for (var92 = (SubLObject)NIL, var92 = (SubLObject)ZERO_INTEGER; var92.numL(var85); var92 = Numbers.add(var92, (SubLObject)ONE_INTEGER)) {
                if (NIL == module0004.f104(var92, var87, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var90 = (SubLObject)ConsesLow.cons(var92, var90);
                }
            }
            return f13098(var89, var90);
        }
        cdestructuring_bind.cdestructuring_bind_error(var15, (SubLObject)$ic32$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13106(final SubLObject var15) {
        return var15.first();
    }
    
    public static SubLObject f13107(final SubLObject var15) {
        return conses_high.second(var15);
    }
    
    public static SubLObject f13108(final SubLObject var92, final SubLObject var93) {
        return (SubLObject)makeBoolean(NIL != conses_high.subsetp(f13107(var93), f13107(var92), Symbols.symbol_function((SubLObject)$ic33$), (SubLObject)UNPROVIDED) && NIL != conses_high.subsetp(f13106(var93), f13106(var92), Symbols.symbol_function((SubLObject)$ic33$), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f13109(final SubLObject var16, final SubLObject var14, final SubLObject var15) {
        return module0035.f2169(var16, ($ic12$ == var14) ? f13106(var15) : f13107(var15));
    }
    
    public static SubLObject f13110(final SubLObject var8, final SubLObject var15) {
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)ZERO_INTEGER;
        SubLObject var19 = module0232.f15306(var8);
        SubLObject var20 = (SubLObject)NIL;
        var20 = var19.first();
        while (NIL != var19) {
            final SubLObject var21 = (SubLObject)$ic12$;
            if (NIL != f13109(var18, var21, var15)) {
                if ($ic12$ == var21) {
                    var16 = (SubLObject)ConsesLow.cons(var20, var16);
                }
                else {
                    var17 = (SubLObject)ConsesLow.cons(var20, var17);
                }
            }
            var18 = Numbers.add(var18, (SubLObject)ONE_INTEGER);
            var19 = var19.rest();
            var20 = var19.first();
        }
        var18 = (SubLObject)ZERO_INTEGER;
        var19 = module0232.f15308(var8);
        var20 = (SubLObject)NIL;
        var20 = var19.first();
        while (NIL != var19) {
            final SubLObject var21 = (SubLObject)$ic15$;
            if (NIL != f13109(var18, var21, var15)) {
                if ($ic12$ == var21) {
                    var16 = (SubLObject)ConsesLow.cons(var20, var16);
                }
                else {
                    var17 = (SubLObject)ConsesLow.cons(var20, var17);
                }
            }
            var18 = Numbers.add(var18, (SubLObject)ONE_INTEGER);
            var19 = var19.rest();
            var20 = var19.first();
        }
        final SubLObject var22 = module0232.f15305(Sequences.nreverse(var16), Sequences.nreverse(var17));
        return var22;
    }
    
    public static SubLObject f13111(final SubLObject var8, final SubLObject var15) {
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)ZERO_INTEGER;
        SubLObject var19 = module0232.f15306(var8);
        SubLObject var20 = (SubLObject)NIL;
        var20 = var19.first();
        while (NIL != var19) {
            final SubLObject var21 = (SubLObject)$ic12$;
            if (NIL == f13109(var18, var21, var15)) {
                if ($ic12$ == var21) {
                    var16 = (SubLObject)ConsesLow.cons(var20, var16);
                }
                else {
                    var17 = (SubLObject)ConsesLow.cons(var20, var17);
                }
            }
            var18 = Numbers.add(var18, (SubLObject)ONE_INTEGER);
            var19 = var19.rest();
            var20 = var19.first();
        }
        var18 = (SubLObject)ZERO_INTEGER;
        var19 = module0232.f15308(var8);
        var20 = (SubLObject)NIL;
        var20 = var19.first();
        while (NIL != var19) {
            final SubLObject var21 = (SubLObject)$ic15$;
            if (NIL == f13109(var18, var21, var15)) {
                if ($ic12$ == var21) {
                    var16 = (SubLObject)ConsesLow.cons(var20, var16);
                }
                else {
                    var17 = (SubLObject)ConsesLow.cons(var20, var17);
                }
            }
            var18 = Numbers.add(var18, (SubLObject)ONE_INTEGER);
            var19 = var19.rest();
            var20 = var19.first();
        }
        final SubLObject var22 = module0232.f15305(Sequences.nreverse(var16), Sequences.nreverse(var17));
        return var22;
    }
    
    public static SubLObject f13112(final SubLObject var97, final SubLObject var98) {
        final SubLObject var99 = f13113(module0232.f15306(var97), module0232.f15306(var98));
        final SubLObject var100 = f13113(module0232.f15308(var97), module0232.f15308(var98));
        return f13098(var99, var100);
    }
    
    public static SubLObject f13113(final SubLObject var99, final SubLObject var100) {
        SubLObject var101 = (SubLObject)NIL;
        SubLObject var102 = var100;
        SubLObject var103 = (SubLObject)NIL;
        var103 = var102.first();
        while (NIL != var102) {
            final SubLObject var104 = Sequences.position(var103, var99, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var101 = (SubLObject)ConsesLow.cons(var104, var101);
            var102 = var102.rest();
            var103 = var102.first();
        }
        return Sequences.nreverse(var101);
    }
    
    public static SubLObject f13114(final SubLObject var15) {
        return Numbers.add(Sequences.length(f13107(var15)), Sequences.length(f13106(var15)));
    }
    
    public static SubLObject f13115(final SubLObject var15) {
        return Numbers.numE((SubLObject)ZERO_INTEGER, f13114(var15));
    }
    
    public static SubLObject f13116(final SubLObject var15) {
        return Numbers.numE((SubLObject)ONE_INTEGER, f13114(var15));
    }
    
    public static SubLObject f13117(final SubLObject var15) {
        return Numbers.numG(f13114(var15), (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f13118(final SubLObject var15, final SubLObject var8) {
        return (SubLObject)makeBoolean(Sequences.length(f13107(var15)).numE(Sequences.length(module0232.f15308(var8))) && Sequences.length(f13106(var15)).numE(Sequences.length(module0232.f15306(var8))));
    }
    
    public static SubLObject f13119(final SubLObject var8, final SubLObject var101) {
        final SubLObject var102 = module0232.f15306(var8);
        final SubLObject var103 = module0232.f15308(var8);
        final SubLObject var104 = module0232.f15306(var101);
        final SubLObject var105 = module0232.f15308(var101);
        SubLObject var106 = (SubLObject)NIL;
        SubLObject var107 = (SubLObject)NIL;
        SubLObject var108 = var102;
        SubLObject var109 = (SubLObject)NIL;
        var109 = var108.first();
        while (NIL != var108) {
            if (NIL == module0035.f2171(var109, var104)) {
                var106 = (SubLObject)ConsesLow.cons(var109, var106);
            }
            var108 = var108.rest();
            var109 = var108.first();
        }
        var106 = Sequences.nreverse(var106);
        var108 = var103;
        SubLObject var110 = (SubLObject)NIL;
        var110 = var108.first();
        while (NIL != var108) {
            if (NIL == module0035.f2171(var110, var105)) {
                var107 = (SubLObject)ConsesLow.cons(var110, var107);
            }
            var108 = var108.rest();
            var110 = var108.first();
        }
        var107 = Sequences.nreverse(var107);
        return module0232.f15305(var106, var107);
    }
    
    public static SubLObject f13120() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0204", "f13026", "S#15931");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0204", "f13027", "S#15932");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0204", "f13028", "S#15933");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0204", "f13029", "S#15934");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13030", "S#15935", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13031", "S#15936", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13032", "S#15937", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13033", "MAKE-GAF-CNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13034", "S#14092", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13035", "S#15938", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13036", "S#15939", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13037", "S#15940", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13038", "S#15941", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13039", "S#15942", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13040", "S#15943", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13041", "S#15506", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13042", "S#15944", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13043", "S#15945", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13044", "S#14906", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13045", "S#15946", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13046", "S#15947", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13048", "S#14907", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13049", "S#15948", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13050", "S#15949", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13051", "S#15950", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13047", "GAF-CNF-LITERAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13053", "S#15951", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13054", "S#15952", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13052", "S#15953", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13055", "S#14911", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13056", "S#15954", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13057", "S#15955", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13058", "S#15956", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13059", "S#15957", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13060", "S#15958", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13061", "S#15959", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13062", "S#15960", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13063", "S#15961", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13064", "S#15962", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13065", "S#15963", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13066", "S#15964", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13067", "S#15965", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13068", "S#15966", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13069", "S#15967", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13070", "S#15968", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13071", "S#15969", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13072", "S#15970", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13073", "S#15971", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13074", "S#15972", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13075", "S#15973", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13076", "S#15974", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13077", "S#15975", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13078", "S#15976", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13079", "S#15977", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13080", "S#15978", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13081", "S#15979", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13082", "S#15980", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13083", "S#15981", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13084", "S#15982", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13085", "S#15983", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13086", "S#15984", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13087", "S#15985", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13088", "S#15986", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13089", "S#15987", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13090", "S#15988", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13091", "S#15989", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13092", "S#15990", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13093", "S#15991", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13094", "S#15992", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13095", "S#15993", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13096", "S#15994", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13097", "S#15995", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13098", "S#15996", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13100", "S#15997", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13101", "S#15998", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13102", "S#15999", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13103", "S#16000", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13104", "S#16001", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13099", "S#16002", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13105", "S#16003", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13106", "S#16004", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13107", "S#16005", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13108", "S#16006", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13109", "S#16007", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13110", "S#16008", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13111", "S#16009", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13112", "S#16010", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13113", "S#16011", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13114", "S#16012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13115", "S#16013", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13116", "S#16014", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13117", "S#16015", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13118", "S#16016", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0204", "f13119", "S#16017", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13121() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13122() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f13120();
    }
    
    public void initializeVariables() {
        f13121();
    }
    
    public void runTopLevelForms() {
        f13122();
    }
    
    static {
        me = (SubLFile)new module0204();
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("NEG-LITS"), (SubLObject)makeSymbol("POS-LITS")), (SubLObject)makeSymbol("S#15215", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = makeSymbol("CDESTRUCTURING-BIND");
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#13100", "CYC"), (SubLObject)makeSymbol("S#12397", "CYC"), (SubLObject)makeSymbol("S#15215", "CYC"), (SubLObject)makeSymbol("S#16018", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic3$ = makeUninternedSymbol("US#13A64D7");
        $ic4$ = makeSymbol("S#15191", "CYC");
        $ic5$ = makeSymbol("PWHEN");
        $ic6$ = makeSymbol("S#16007", "CYC");
        $ic7$ = makeUninternedSymbol("US#13A64D7");
        $ic8$ = makeSymbol("PUNLESS");
        $ic9$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#13100", "CYC")), (SubLObject)makeSymbol("S#16019", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic10$ = makeKeyword("TRUE");
        $ic11$ = makeSymbol("SENSE-P");
        $ic12$ = makeKeyword("NEG");
        $ic13$ = ConsesLow.list((SubLObject)makeKeyword("CNF"), (SubLObject)makeKeyword("DNF"));
        $ic14$ = makeSymbol("S#12629", "CYC");
        $ic15$ = makeKeyword("POS");
        $ic16$ = ConsesLow.list((SubLObject)makeSymbol("NEG-LITS"), (SubLObject)makeSymbol("POS-LITS"));
        $ic17$ = makeSymbol("S#15955", "CYC");
        $ic18$ = makeSymbol("S#16020", "CYC");
        $ic19$ = ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#12398", "CYC"));
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("ist"));
        $ic21$ = makeSymbol("S#15990", "CYC");
        $ic22$ = makeSymbol("NEGATE");
        $ic23$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic24$ = makeSymbol("LISTP");
        $ic25$ = constant_handles_oc.f8479((SubLObject)makeString("or"));
        $ic26$ = makeSymbol("S#15991", "CYC");
        $ic27$ = makeSymbol("S#16021", "CYC");
        $ic28$ = makeSymbol("S#15993", "CYC");
        $ic29$ = makeSymbol("S#747", "CYC");
        $ic30$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic31$ = makeSymbol("<");
        $ic32$ = ConsesLow.list((SubLObject)makeSymbol("S#16022", "CYC"), (SubLObject)makeSymbol("S#16023", "CYC"));
        $ic33$ = makeSymbol("=");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 242 ms
	
	Decompiled with Procyon 0.5.32.
*/