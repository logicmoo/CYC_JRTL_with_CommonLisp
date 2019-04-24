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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Tcp;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0061 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0061";
    public static final String myFingerPrint = "5c06230f382735d8b7c10df4c584d016a06063309309a38610598bd2e7810651";
    private static SubLSymbol $g1055$;
    public static SubLSymbol $remote_address$;
    public static SubLSymbol $remote_hostname$;
    public static SubLSymbol $g1056$;
    private static SubLSymbol $g1057$;
    private static SubLSymbol $g1058$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLInteger $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    
    public static SubLObject f4447(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0061.$ic1$, (SubLObject)module0061.$ic2$, ConsesLow.append(var5, (SubLObject)module0061.NIL));
    }
    
    public static SubLObject f4448(final SubLObject var6) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var6.isFixnum() && module0061.ZERO_INTEGER.numLE(var6) && var6.numLE((SubLObject)module0061.$ic3$));
    }
    
    public static SubLObject f4449(final SubLObject var6) {
        return module0004.f104(var6, (SubLObject)module0061.$ic4$, (SubLObject)module0061.UNPROVIDED, (SubLObject)module0061.UNPROVIDED);
    }
    
    public static SubLObject f4450(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0061.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0061.$ic5$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0061.$ic5$);
        final SubLObject var6 = var4.rest();
        var4 = var4.first();
        SubLObject var7 = (SubLObject)module0061.NIL;
        SubLObject var8 = (SubLObject)module0061.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0061.$ic5$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0061.$ic5$);
        var8 = var4.first();
        var4 = var4.rest();
        if (module0061.NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0061.$ic5$);
            return (SubLObject)module0061.NIL;
        }
        var4 = var6;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0061.$ic5$);
        final SubLObject var13_14 = var4.rest();
        var4 = var4.first();
        SubLObject var9 = (SubLObject)module0061.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0061.NIL;
        SubLObject var18_19 = (SubLObject)module0061.NIL;
        while (module0061.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0061.$ic5$);
            var18_19 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0061.$ic5$);
            if (module0061.NIL == conses_high.member(var18_19, (SubLObject)module0061.$ic6$, (SubLObject)module0061.UNPROVIDED, (SubLObject)module0061.UNPROVIDED)) {
                var11 = (SubLObject)module0061.T;
            }
            if (var18_19 == module0061.$ic7$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0061.NIL != var11 && module0061.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0061.$ic5$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0061.$ic8$, var4);
        final SubLObject var13 = (SubLObject)((module0061.NIL != var12) ? conses_high.cadr(var12) : module0061.NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0061.$ic9$, var4);
        final SubLObject var15 = (SubLObject)((module0061.NIL != var14) ? conses_high.cadr(var14) : module0061.$ic10$);
        final SubLObject var16;
        var4 = (var16 = var13_14);
        assert module0061.NIL != f4449(var15) : var15;
        return (SubLObject)ConsesLow.list((SubLObject)module0061.$ic12$, f4451(var5, var7, var8, var13, var15, var16), (SubLObject)ConsesLow.list((SubLObject)module0061.$ic13$, (SubLObject)ConsesLow.list((SubLObject)module0061.$ic14$, var13), (SubLObject)ConsesLow.list((SubLObject)module0061.$ic14$, var5), (SubLObject)ConsesLow.list((SubLObject)module0061.$ic14$, var15)));
    }
    
    public static SubLObject f4452(final SubLObject var21, final SubLObject var24) {
        assert module0061.NIL != f4448(var24) : var24;
        if (f4453(var24).numG((SubLObject)module0061.ZERO_INTEGER)) {
            Threads.sleep((SubLObject)module0061.ONE_INTEGER);
        }
        final SubLObject var25 = f4454(var21, var24);
        f4455(var25);
        return var25;
    }
    
    public static SubLObject f4453(final SubLObject var26) {
        if (module0061.NIL != f4456(var26)) {
            f4457(var26);
            f4458(var26);
            return (SubLObject)module0061.ONE_INTEGER;
        }
        if (module0061.NIL == f4448(var26)) {
            SubLObject var27 = (SubLObject)module0061.ZERO_INTEGER;
            SubLObject var28 = f4460();
            SubLObject var29 = (SubLObject)module0061.NIL;
            var29 = var28.first();
            while (module0061.NIL != var28) {
                if (var26.eql(f4461(var29))) {
                    var27 = Numbers.add(var27, f4453(var29));
                }
                var28 = var28.rest();
                var29 = var28.first();
            }
            return var27;
        }
        final SubLObject var30 = f4459(var26);
        if (module0061.NIL != var30) {
            return f4453(var30);
        }
        return (SubLObject)module0061.ZERO_INTEGER;
    }
    
    public static SubLObject f4462() {
        SubLObject var27 = (SubLObject)module0061.ZERO_INTEGER;
        SubLObject var28 = f4460();
        SubLObject var29 = (SubLObject)module0061.NIL;
        var29 = var28.first();
        while (module0061.NIL != var28) {
            var27 = Numbers.add(var27, f4453(var29));
            var28 = var28.rest();
            var29 = var28.first();
        }
        return var27;
    }
    
    public static SubLObject f4463() {
        SubLObject var27 = (SubLObject)module0061.ZERO_INTEGER;
        SubLObject var28 = f4460();
        SubLObject var29 = (SubLObject)module0061.NIL;
        var29 = var28.first();
        while (module0061.NIL != var28) {
            if (module0061.NIL == Threads.valid_process_p(f4464(var29))) {
                var27 = Numbers.add(var27, f4453(var29));
            }
            var28 = var28.rest();
            var29 = var28.first();
        }
        return var27;
    }
    
    public static SubLObject f4465() {
        SubLObject var27 = (SubLObject)module0061.ZERO_INTEGER;
        SubLObject var28 = f4460();
        SubLObject var29 = (SubLObject)module0061.NIL;
        var29 = var28.first();
        while (module0061.NIL != var28) {
            final SubLObject var30 = f4466(var29);
            final SubLObject var31 = f4461(var29);
            f4453(var30);
            Threads.sleep((SubLObject)module0061.ONE_INTEGER);
            f4452(var31, var30);
            var27 = Numbers.add(var27, (SubLObject)module0061.ONE_INTEGER);
            var28 = var28.rest();
            var29 = var28.first();
        }
        return var27;
    }
    
    public static SubLObject f4467(final SubLObject var29, final SubLObject var30) {
        f4468(var29, var30, (SubLObject)module0061.ZERO_INTEGER);
        return (SubLObject)module0061.NIL;
    }
    
    public static SubLObject f4456(final SubLObject var29) {
        return (SubLObject)((var29.getClass() == $sX5966_native.class) ? module0061.T : module0061.NIL);
    }
    
    public static SubLObject f4469(final SubLObject var29) {
        assert module0061.NIL != f4456(var29) : var29;
        return var29.getField2();
    }
    
    public static SubLObject f4470(final SubLObject var29) {
        assert module0061.NIL != f4456(var29) : var29;
        return var29.getField3();
    }
    
    public static SubLObject f4471(final SubLObject var29) {
        assert module0061.NIL != f4456(var29) : var29;
        return var29.getField4();
    }
    
    public static SubLObject f4472(final SubLObject var29, final SubLObject var32) {
        assert module0061.NIL != f4456(var29) : var29;
        return var29.setField2(var32);
    }
    
    public static SubLObject f4473(final SubLObject var29, final SubLObject var32) {
        assert module0061.NIL != f4456(var29) : var29;
        return var29.setField3(var32);
    }
    
    public static SubLObject f4474(final SubLObject var29, final SubLObject var32) {
        assert module0061.NIL != f4456(var29) : var29;
        return var29.setField4(var32);
    }
    
    public static SubLObject f4475(SubLObject var33) {
        if (var33 == module0061.UNPROVIDED) {
            var33 = (SubLObject)module0061.NIL;
        }
        final SubLObject var34 = (SubLObject)new $sX5966_native();
        SubLObject var35;
        SubLObject var36;
        SubLObject var37;
        SubLObject var38;
        for (var35 = (SubLObject)module0061.NIL, var35 = var33; module0061.NIL != var35; var35 = conses_high.cddr(var35)) {
            var36 = var35.first();
            var37 = conses_high.cadr(var35);
            var38 = var36;
            if (var38.eql((SubLObject)module0061.$ic8$)) {
                f4472(var34, var37);
            }
            else if (var38.eql((SubLObject)module0061.$ic31$)) {
                f4473(var34, var37);
            }
            else if (var38.eql((SubLObject)module0061.$ic32$)) {
                f4474(var34, var37);
            }
            else {
                Errors.error((SubLObject)module0061.$ic33$, var36);
            }
        }
        return var34;
    }
    
    public static SubLObject f4476(final SubLObject var39, final SubLObject var40) {
        Functions.funcall(var40, var39, (SubLObject)module0061.$ic34$, (SubLObject)module0061.$ic35$, (SubLObject)module0061.THREE_INTEGER);
        Functions.funcall(var40, var39, (SubLObject)module0061.$ic36$, (SubLObject)module0061.$ic8$, f4469(var39));
        Functions.funcall(var40, var39, (SubLObject)module0061.$ic36$, (SubLObject)module0061.$ic31$, f4470(var39));
        Functions.funcall(var40, var39, (SubLObject)module0061.$ic36$, (SubLObject)module0061.$ic32$, f4471(var39));
        Functions.funcall(var40, var39, (SubLObject)module0061.$ic37$, (SubLObject)module0061.$ic35$, (SubLObject)module0061.THREE_INTEGER);
        return var39;
    }
    
    public static SubLObject f4477(final SubLObject var39, final SubLObject var40) {
        return f4476(var39, var40);
    }
    
    public static SubLObject f4468(final SubLObject var6, final SubLObject var30, final SubLObject var41) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        if (module0061.NIL != print_high.$print_readably$.getDynamicValue(var42)) {
            print_high.print_not_readable(var6, var30);
        }
        else {
            streams_high.write_string((SubLObject)module0061.$ic39$, var30, (SubLObject)module0061.UNPROVIDED, (SubLObject)module0061.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var6), new SubLObject[] { module0061.$ic40$, var30 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var30);
            print_high.princ(f4470(var6), var30);
            print_high.princ((SubLObject)module0061.$ic41$, var30);
            final SubLObject var43 = f4469(var6);
            if (var43.isKeyword()) {
                print_high.princ(module0038.f2968(var43), var30);
            }
            else {
                print_high.princ(var43, var30);
            }
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var30);
        }
        return var6;
    }
    
    public static SubLObject f4461(final SubLObject var25) {
        assert module0061.NIL != f4456(var25) : var25;
        return f4469(var25);
    }
    
    public static SubLObject f4466(final SubLObject var25) {
        assert module0061.NIL != f4456(var25) : var25;
        return f4470(var25);
    }
    
    public static SubLObject f4464(final SubLObject var25) {
        assert module0061.NIL != f4456(var25) : var25;
        return f4471(var25);
    }
    
    public static SubLObject f4454(final SubLObject var21, final SubLObject var24) {
        final SubLObject var25 = f4478(var21);
        final SubLObject var26 = f4475((SubLObject)module0061.UNPROVIDED);
        f4472(var26, var21);
        f4473(var26, var24);
        f4474(var26, f4479(var21, var24, var25));
        return var26;
    }
    
    public static SubLObject f4458(final SubLObject var25) {
        assert module0061.NIL != f4456(var25) : var25;
        f4480(var25);
        f4473(var25, (SubLObject)module0061.NIL);
        f4474(var25, (SubLObject)module0061.NIL);
        return (SubLObject)module0061.NIL;
    }
    
    public static SubLObject f4459(final SubLObject var24) {
        assert module0061.NIL != f4448(var24) : var24;
        return Sequences.find(var24, module0061.$g1057$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0061.EQL), Symbols.symbol_function((SubLObject)module0061.$ic44$), (SubLObject)module0061.UNPROVIDED, (SubLObject)module0061.UNPROVIDED);
    }
    
    public static SubLObject f4460() {
        return conses_high.copy_list(module0061.$g1057$.getGlobalValue());
    }
    
    public static SubLObject f4455(final SubLObject var25) {
        final SubLObject var26 = module0061.$g1055$.getGlobalValue();
        SubLObject var27 = (SubLObject)module0061.NIL;
        try {
            var27 = Locks.seize_lock(var26);
            module0061.$g1057$.setGlobalValue((SubLObject)ConsesLow.cons(var25, module0061.$g1057$.getGlobalValue()));
        }
        finally {
            if (module0061.NIL != var27) {
                Locks.release_lock(var26);
            }
        }
        return var25;
    }
    
    public static SubLObject f4457(final SubLObject var25) {
        final SubLObject var26 = module0061.$g1055$.getGlobalValue();
        SubLObject var27 = (SubLObject)module0061.NIL;
        try {
            var27 = Locks.seize_lock(var26);
            module0061.$g1057$.setGlobalValue(Sequences.delete(var25, module0061.$g1057$.getGlobalValue(), (SubLObject)module0061.UNPROVIDED, (SubLObject)module0061.UNPROVIDED, (SubLObject)module0061.UNPROVIDED, (SubLObject)module0061.UNPROVIDED, (SubLObject)module0061.UNPROVIDED));
        }
        finally {
            if (module0061.NIL != var27) {
                Locks.release_lock(var26);
            }
        }
        return var25;
    }
    
    public static SubLObject f4481(final SubLObject var21, final SubLObject var47, SubLObject var23) {
        if (var23 == module0061.UNPROVIDED) {
            var23 = (SubLObject)module0061.$ic10$;
        }
        assert module0061.NIL != f4482(var47) : var47;
        assert module0061.NIL != f4449(var23) : var23;
        f4483(var21);
        final SubLObject var48 = module0061.$g1055$.getGlobalValue();
        SubLObject var49 = (SubLObject)module0061.NIL;
        try {
            var49 = Locks.seize_lock(var48);
            module0061.$g1058$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var21, var47, var23), module0061.$g1058$.getGlobalValue()));
        }
        finally {
            if (module0061.NIL != var49) {
                Locks.release_lock(var48);
            }
        }
        return var21;
    }
    
    public static SubLObject f4482(final SubLObject var6) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var6.isFunctionSpec() || module0061.NIL != f4484(var6));
    }
    
    public static SubLObject f4484(final SubLObject var6) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var6.isList() && module0061.NIL != module0035.f1995(var6, (SubLObject)module0061.TWO_INTEGER, (SubLObject)module0061.UNPROVIDED) && module0061.$ic47$ == var6.first() && conses_high.second(var6).isFunctionSpec());
    }
    
    public static SubLObject f4483(final SubLObject var21) {
        final SubLObject var22 = module0061.$g1055$.getGlobalValue();
        SubLObject var23 = (SubLObject)module0061.NIL;
        try {
            var23 = Locks.seize_lock(var22);
            module0061.$g1058$.setGlobalValue(Sequences.delete(var21, module0061.$g1058$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0061.EQL), Symbols.symbol_function((SubLObject)module0061.$ic48$), (SubLObject)module0061.UNPROVIDED, (SubLObject)module0061.UNPROVIDED, (SubLObject)module0061.UNPROVIDED));
        }
        finally {
            if (module0061.NIL != var23) {
                Locks.release_lock(var22);
            }
        }
        return var21;
    }
    
    public static SubLObject f4478(final SubLObject var21) {
        return conses_high.second(Sequences.find(var21, module0061.$g1058$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0061.EQL), Symbols.symbol_function((SubLObject)module0061.$ic48$), (SubLObject)module0061.UNPROVIDED, (SubLObject)module0061.UNPROVIDED));
    }
    
    public static SubLObject f4485(final SubLObject var21) {
        return conses_high.third(Sequences.find(var21, module0061.$g1058$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0061.EQL), Symbols.symbol_function((SubLObject)module0061.$ic48$), (SubLObject)module0061.UNPROVIDED, (SubLObject)module0061.UNPROVIDED));
    }
    
    public static SubLObject f4451(final SubLObject var9, final SubLObject var11, final SubLObject var12, final SubLObject var21, final SubLObject var23, final SubLObject var5) {
        return (SubLObject)ConsesLow.list((SubLObject)module0061.$ic12$, (SubLObject)ConsesLow.listS((SubLObject)module0061.$ic49$, var9, (SubLObject)ConsesLow.list(var11, var12), ConsesLow.append(var5, (SubLObject)module0061.NIL)));
    }
    
    public static SubLObject f4479(final SubLObject var21, final SubLObject var24, final SubLObject var47) {
        if (module0061.NIL != f4484(var47)) {
            return Functions.funcall(conses_high.second(var47), var24);
        }
        return Functions.funcall((SubLObject)module0061.$ic50$, var24, var47);
    }
    
    public static SubLObject f4480(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        final SubLObject var27 = f4464(var25);
        if (module0061.NIL != module0060.f4399(var27)) {
            module0060.f4434(var27);
            return (SubLObject)module0061.T;
        }
        final SubLObject var28 = f4466(var25);
        SubLObject var29 = (SubLObject)module0061.NIL;
        try {
            var26.throwStack.push(module0061.$ic51$);
            final SubLObject var30 = Errors.$error_handler$.currentBinding(var26);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0061.$ic52$), var26);
                try {
                    Functions.funcall((SubLObject)module0061.$ic53$, var28);
                }
                catch (Throwable var31) {
                    Errors.handleThrowable(var31, (SubLObject)module0061.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var30, var26);
            }
        }
        catch (Throwable var32) {
            var29 = Errors.handleThrowable(var32, (SubLObject)module0061.$ic51$);
        }
        finally {
            var26.throwStack.pop();
        }
        return (SubLObject)module0061.T;
    }
    
    public static SubLObject f4486() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0061", "f4447", "S#5968");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4448", "S#5969", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4449", "S#5970", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0061", "f4450", "S#5971");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4452", "ENABLE-TCP-SERVER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4453", "S#5972", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4462", "S#5973", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4463", "S#5974", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4465", "S#5975", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4467", "S#5976", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4456", "S#5967", 1, 0, false);
        new $f4456$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4469", "S#5977", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4470", "S#5978", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4471", "S#5979", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4472", "S#5980", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4473", "S#5981", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4474", "S#5982", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4475", "S#5983", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4476", "S#5984", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4477", "S#5985", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4468", "S#5986", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4461", "S#5987", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4466", "S#5988", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4464", "S#5989", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4454", "S#5990", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4458", "S#5991", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4459", "S#5992", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4460", "S#5993", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4455", "S#5994", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4457", "S#5995", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4481", "S#5996", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4482", "S#5997", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4484", "S#5998", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4483", "S#5999", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4478", "S#6000", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4485", "S#6001", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4451", "S#6002", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4479", "S#6003", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0061", "f4480", "S#6004", 1, 0, false);
        return (SubLObject)module0061.NIL;
    }
    
    public static SubLObject f4487() {
        module0061.$g1055$ = SubLFiles.deflexical("S#6005", Locks.make_lock((SubLObject)module0061.$ic0$));
        Tcp.$remote_address$ = SubLFiles.defparameter("*REMOTE-ADDRESS*", (SubLObject)module0061.NIL);
        Tcp.$remote_hostname$ = SubLFiles.defparameter("*REMOTE-HOSTNAME*", (SubLObject)module0061.NIL);
        module0061.$g1056$ = SubLFiles.defconstant("S#6006", (SubLObject)module0061.$ic16$);
        module0061.$g1057$ = SubLFiles.deflexical("S#6007", (SubLObject)((module0061.NIL != Symbols.boundp((SubLObject)module0061.$ic43$)) ? module0061.$g1057$.getGlobalValue() : module0061.NIL));
        module0061.$g1058$ = SubLFiles.deflexical("S#6008", (SubLObject)((module0061.NIL != Symbols.boundp((SubLObject)module0061.$ic45$)) ? module0061.$g1058$.getGlobalValue() : module0061.NIL));
        return (SubLObject)module0061.NIL;
    }
    
    public static SubLObject f4488() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0061.$g1056$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0061.$ic23$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0061.$ic24$);
        Structures.def_csetf((SubLObject)module0061.$ic25$, (SubLObject)module0061.$ic26$);
        Structures.def_csetf((SubLObject)module0061.$ic27$, (SubLObject)module0061.$ic28$);
        Structures.def_csetf((SubLObject)module0061.$ic29$, (SubLObject)module0061.$ic30$);
        Equality.identity((SubLObject)module0061.$ic16$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0061.$g1056$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0061.$ic38$));
        module0003.f57((SubLObject)module0061.$ic43$);
        module0003.f57((SubLObject)module0061.$ic45$);
        return (SubLObject)module0061.NIL;
    }
    
    public void declareFunctions() {
        f4486();
    }
    
    public void initializeVariables() {
        f4487();
    }
    
    public void runTopLevelForms() {
        f4488();
    }
    
    static {
        me = (SubLFile)new module0061();
        module0061.$g1055$ = null;
        module0061.$remote_address$ = null;
        module0061.$remote_hostname$ = null;
        module0061.$g1056$ = null;
        module0061.$g1057$ = null;
        module0061.$g1058$ = null;
        $ic0$ = SubLObjectFactory.makeString("TCP Server Lock");
        $ic1$ = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6005", "CYC"));
        $ic3$ = SubLObjectFactory.makeInteger(65535);
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("BINARY"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6009", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6010", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4785", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("MODE"));
        $ic7$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic8$ = SubLObjectFactory.makeKeyword("TYPE");
        $ic9$ = SubLObjectFactory.makeKeyword("MODE");
        $ic10$ = SubLObjectFactory.makeKeyword("TEXT");
        $ic11$ = SubLObjectFactory.makeSymbol("S#5970", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic13$ = SubLObjectFactory.makeSymbol("S#5996", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic15$ = SubLObjectFactory.makeSymbol("S#5969", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#5966", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#5967", "CYC");
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#58", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#104", "CYC"));
        $ic19$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeKeyword("PROCESS"));
        $ic20$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5977", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5978", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5979", "CYC"));
        $ic21$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5980", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5981", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5982", "CYC"));
        $ic22$ = SubLObjectFactory.makeSymbol("S#5986", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#5976", "CYC");
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#5967", "CYC"));
        $ic25$ = SubLObjectFactory.makeSymbol("S#5977", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#5980", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#5978", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#5981", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#5979", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#5982", "CYC");
        $ic31$ = SubLObjectFactory.makeKeyword("PORT");
        $ic32$ = SubLObjectFactory.makeKeyword("PROCESS");
        $ic33$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic34$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic35$ = SubLObjectFactory.makeSymbol("S#5983", "CYC");
        $ic36$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic37$ = SubLObjectFactory.makeKeyword("END");
        $ic38$ = SubLObjectFactory.makeSymbol("S#5985", "CYC");
        $ic39$ = SubLObjectFactory.makeString("#<");
        $ic40$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic41$ = SubLObjectFactory.makeString("/");
        $ic42$ = SubLObjectFactory.makeKeyword("BASE");
        $ic43$ = SubLObjectFactory.makeSymbol("S#6007", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#5988", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("S#6008", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#5997", "CYC");
        $ic47$ = SubLObjectFactory.makeKeyword("EXTERNAL");
        $ic48$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic49$ = SubLObjectFactory.makeSymbol("DEFINE");
        $ic50$ = SubLObjectFactory.makeSymbol("START-TCP-SERVER", "SUBLISP");
        $ic51$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic52$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic53$ = SubLObjectFactory.makeSymbol("STOP-TCP-SERVER", "SUBLISP");
    }
    
    public static final class $sX5966_native extends SubLStructNative
    {
        public SubLObject $type;
        public SubLObject $port;
        public SubLObject $process;
        private static final SubLStructDeclNative structDecl;
        
        public $sX5966_native() {
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$port = (SubLObject)CommonSymbols.NIL;
            this.$process = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX5966_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$type;
        }
        
        public SubLObject getField3() {
            return this.$port;
        }
        
        public SubLObject getField4() {
            return this.$process;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$type = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$port = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$process = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX5966_native.class, module0061.$ic16$, module0061.$ic17$, module0061.$ic18$, module0061.$ic19$, new String[] { "$type", "$port", "$process" }, module0061.$ic20$, module0061.$ic21$, module0061.$ic22$);
        }
    }
    
    public static final class $f4456$UnaryFunction extends UnaryFunction
    {
        public $f4456$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5967"));
        }
        
        public SubLObject processItem(final SubLObject var31) {
            return module0061.f4456(var31);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0061.class
	Total time: 162 ms
	
	Decompiled with Procyon 0.5.32.
*/