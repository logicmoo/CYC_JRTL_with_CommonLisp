package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0549 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0549";
    public static final String myFingerPrint = "41807a94283eabaeb1d91a14817bfd44326aea741630f4a9085e7b2cb7edd8ac";
    private static SubLSymbol $g3981$;
    private static SubLSymbol $g3983$;
    private static SubLSymbol $g3985$;
    private static SubLSymbol $g3982$;
    private static SubLSymbol $g3984$;
    private static SubLSymbol $g3986$;
    private static SubLSymbol $g3987$;
    private static SubLSymbol $g3988$;
    private static SubLSymbol $g3989$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
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
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLList $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLString $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLString $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLString $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLList $ic53$;
    private static final SubLString $ic54$;
    private static final SubLList $ic55$;
    private static final SubLString $ic56$;
    private static final SubLList $ic57$;
    private static final SubLString $ic58$;
    private static final SubLInteger $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    
    public static SubLObject f33887() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0549.NIL != module0549.$g3981$.getGlobalValue() && module0549.NIL == module0030.f1594(module0549.$g3981$.getGlobalValue()) && module0549.NIL != module0549.$g3981$.getGlobalValue() && module0549.NIL == module0030.f1594(module0549.$g3981$.getGlobalValue()) && module0549.NIL != module0549.$g3982$.getGlobalValue() && module0549.NIL == module0030.f1594(module0549.$g3982$.getGlobalValue()) && module0549.NIL != module0549.$g3983$.getGlobalValue() && module0549.NIL == module0030.f1594(module0549.$g3983$.getGlobalValue()) && module0549.NIL != module0549.$g3984$.getGlobalValue() && module0549.NIL == module0030.f1594(module0549.$g3984$.getGlobalValue()) && module0549.NIL != module0549.$g3985$.getGlobalValue() && module0549.NIL == module0030.f1594(module0549.$g3985$.getGlobalValue()) && module0549.NIL != module0549.$g3986$.getGlobalValue() && module0549.NIL == module0030.f1594(module0549.$g3986$.getGlobalValue()) && module0549.NIL != module0549.$g3987$.getGlobalValue() && module0549.NIL == module0030.f1594(module0549.$g3987$.getGlobalValue()) && module0549.NIL != module0549.$g3988$.getGlobalValue() && module0549.NIL == module0030.f1594(module0549.$g3988$.getGlobalValue()));
    }
    
    public static SubLObject f33888() {
        f33889();
        return (SubLObject)module0549.NIL;
    }
    
    public static SubLObject f33889() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        f33890(constant_handles_oc.f8433());
        SubLObject var2 = module0139.f9019((SubLObject)module0549.SIX_INTEGER);
        final SubLObject var3 = module0139.$g1632$.currentBinding(var1);
        final SubLObject var4 = module0139.$g1630$.currentBinding(var1);
        final SubLObject var5 = module0139.$g1631$.currentBinding(var1);
        try {
            module0139.$g1632$.bind(var2, var1);
            module0139.$g1630$.bind((SubLObject)module0549.T, var1);
            module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var1)), var1);
            f33891();
            f33892();
            f33893();
            var2 = module0139.$g1632$.getDynamicValue(var1);
        }
        finally {
            module0139.$g1631$.rebind(var5, var1);
            module0139.$g1630$.rebind(var4, var1);
            module0139.$g1632$.rebind(var3, var1);
        }
        return (SubLObject)module0549.NIL;
    }
    
    public static SubLObject f33894(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        assert module0549.NIL != module0161.f10482(var6) : var6;
        return module0018.$g664$.getDynamicValue(var7);
    }
    
    public static SubLObject f33895(final SubLObject var6) {
        assert module0549.NIL != module0173.f10955(var6) : var6;
        return f33896(var6);
    }
    
    public static SubLObject f33897(final SubLObject var6) {
        assert module0549.NIL != module0173.f10955(var6) : var6;
        return f33898(var6);
    }
    
    public static SubLObject f33899(final SubLObject var6) {
        assert module0549.NIL != module0161.f10482(var6) : var6;
        return f33900(var6);
    }
    
    public static SubLObject f33901(SubLObject var6) {
        assert module0549.NIL != module0161.f10482(var6) : var6;
        if (module0549.NIL != module0161.f10489(var6)) {
            var6 = module0161.f10557(var6);
        }
        return f33902(var6);
    }
    
    public static SubLObject f33903(final SubLObject var6) {
        assert module0549.NIL != module0161.f10482(var6) : var6;
        return Numbers.add(f33895(var6), f33901(var6));
    }
    
    public static SubLObject f33904(final SubLObject var7, final SubLObject var8) {
        final SubLObject var9 = f33901(var7);
        final SubLObject var10 = f33901(var8);
        if (var9.isNumber() && var10.isNumber() && var9.numG(var10)) {
            return var8;
        }
        return var7;
    }
    
    public static SubLObject f33905(final SubLObject var7, final SubLObject var8) {
        final SubLObject var9 = f33899(var7);
        final SubLObject var10 = f33899(var8);
        if (var9.isNumber() && var10.isNumber() && var9.numG(var10)) {
            return var8;
        }
        return var7;
    }
    
    public static SubLObject f33906(final SubLObject var6) {
        if (module0549.NIL == module0161.f10482(var6)) {
            return (SubLObject)module0549.ZERO_INTEGER;
        }
        return f33907(var6);
    }
    
    public static SubLObject f33908(final SubLObject var14, SubLObject var15) {
        if (var15 == module0549.UNPROVIDED) {
            var15 = (SubLObject)module0549.$ic2$;
        }
        final SubLObject var16 = var15;
        if (var16.eql((SubLObject)module0549.$ic2$)) {
            return Sort.sort(var14, Symbols.symbol_function((SubLObject)module0549.$ic3$), Symbols.symbol_function((SubLObject)module0549.$ic4$));
        }
        if (var16.eql((SubLObject)module0549.$ic5$)) {
            return Sort.sort(var14, Symbols.symbol_function((SubLObject)module0549.$ic6$), Symbols.symbol_function((SubLObject)module0549.$ic4$));
        }
        return var14;
    }
    
    public static SubLObject f33909(final SubLObject var14, SubLObject var15) {
        if (var15 == module0549.UNPROVIDED) {
            var15 = (SubLObject)module0549.$ic2$;
        }
        final SubLObject var16 = var15;
        if (var16.eql((SubLObject)module0549.$ic2$)) {
            return Sort.stable_sort(var14, Symbols.symbol_function((SubLObject)module0549.$ic3$), Symbols.symbol_function((SubLObject)module0549.$ic4$));
        }
        if (var16.eql((SubLObject)module0549.$ic5$)) {
            return Sort.stable_sort(var14, Symbols.symbol_function((SubLObject)module0549.$ic6$), Symbols.symbol_function((SubLObject)module0549.$ic4$));
        }
        return var14;
    }
    
    public static SubLObject f33910(final SubLObject var17, final SubLObject var18) {
        return Numbers.numL(f33906(var17), f33906(var18));
    }
    
    public static SubLObject f33911(final SubLObject var17, final SubLObject var18) {
        return Numbers.numG(f33906(var17), f33906(var18));
    }
    
    public static SubLObject f33912(final SubLObject var6) {
        assert module0549.NIL != module0173.f10955(var6) : var6;
        return f33895(var6);
    }
    
    public static SubLObject f33913(final SubLObject var6) {
        assert module0549.NIL != module0173.f10955(var6) : var6;
        return f33897(var6);
    }
    
    public static SubLObject f33914() {
        f33915();
        f33916();
        f33917();
        return (SubLObject)module0549.NIL;
    }
    
    public static SubLObject f33918(final SubLObject var6) {
        return Hashtables.gethash_without_values(var6, module0549.$g3981$.getGlobalValue(), (SubLObject)module0549.ZERO_INTEGER);
    }
    
    public static SubLObject f33919(final SubLObject var6, final SubLObject var19) {
        Hashtables.sethash(var6, module0549.$g3981$.getGlobalValue(), var19);
        return var6;
    }
    
    public static SubLObject f33920(final SubLObject var6, final SubLObject var20) {
        return f33919(var6, Numbers.add(f33918(var6), var20));
    }
    
    public static SubLObject f33921(final SubLObject var6) {
        return Hashtables.gethash_without_values(var6, module0549.$g3983$.getGlobalValue(), (SubLObject)module0549.ZERO_INTEGER);
    }
    
    public static SubLObject f33922(final SubLObject var6, final SubLObject var19) {
        Hashtables.sethash(var6, module0549.$g3983$.getGlobalValue(), var19);
        return var6;
    }
    
    public static SubLObject f33923(final SubLObject var6, final SubLObject var20) {
        return f33922(var6, Numbers.add(f33921(var6), var20));
    }
    
    public static SubLObject f33924(final SubLObject var6) {
        return Hashtables.gethash_without_values(var6, module0549.$g3985$.getGlobalValue(), (SubLObject)module0549.ZERO_INTEGER);
    }
    
    public static SubLObject f33925(final SubLObject var6, final SubLObject var19) {
        Hashtables.sethash(var6, module0549.$g3985$.getGlobalValue(), var19);
        return var6;
    }
    
    public static SubLObject f33896(final SubLObject var6) {
        return Hashtables.gethash_without_values(var6, module0549.$g3982$.getGlobalValue(), (SubLObject)module0549.ZERO_INTEGER);
    }
    
    public static SubLObject f33926(final SubLObject var6, final SubLObject var19) {
        Hashtables.sethash(var6, module0549.$g3982$.getGlobalValue(), var19);
        return var6;
    }
    
    public static SubLObject f33927(final SubLObject var6, final SubLObject var20) {
        return f33926(var6, Numbers.add(f33896(var6), var20));
    }
    
    public static SubLObject f33898(final SubLObject var6) {
        return Hashtables.gethash_without_values(var6, module0549.$g3984$.getGlobalValue(), (SubLObject)module0549.ZERO_INTEGER);
    }
    
    public static SubLObject f33928(final SubLObject var6, final SubLObject var19) {
        Hashtables.sethash(var6, module0549.$g3984$.getGlobalValue(), var19);
        return var6;
    }
    
    public static SubLObject f33929(final SubLObject var6, final SubLObject var20) {
        return f33928(var6, Numbers.add(f33898(var6), var20));
    }
    
    public static SubLObject f33902(final SubLObject var6) {
        return Hashtables.gethash_without_values(var6, module0549.$g3986$.getGlobalValue(), (SubLObject)module0549.ZERO_INTEGER);
    }
    
    public static SubLObject f33930(final SubLObject var6, final SubLObject var19) {
        Hashtables.sethash(var6, module0549.$g3986$.getGlobalValue(), var19);
        return var6;
    }
    
    public static SubLObject f33931(final SubLObject var6, final SubLObject var20) {
        return f33930(var6, Numbers.add(f33902(var6), var20));
    }
    
    public static SubLObject f33900(final SubLObject var6) {
        return Hashtables.gethash_without_values(var6, module0549.$g3987$.getGlobalValue(), (SubLObject)module0549.ZERO_INTEGER);
    }
    
    public static SubLObject f33932(final SubLObject var6, final SubLObject var19) {
        Hashtables.sethash(var6, module0549.$g3987$.getGlobalValue(), var19);
        return var6;
    }
    
    public static SubLObject f33907(final SubLObject var6) {
        if (!module0549.$g3988$.getGlobalValue().isHashtable()) {
            return f33933(var6);
        }
        return Hashtables.gethash_without_values(var6, module0549.$g3988$.getGlobalValue(), (SubLObject)module0549.ZERO_INTEGER);
    }
    
    public static SubLObject f33934(final SubLObject var6, final SubLObject var21) {
        Hashtables.sethash(var6, module0549.$g3988$.getGlobalValue(), var21);
        return var6;
    }
    
    public static SubLObject f33890(final SubLObject var22) {
        final SubLObject var24;
        final SubLObject var23 = var24 = Numbers.integerDivide(var22, (SubLObject)module0549.TEN_INTEGER);
        final SubLObject var26;
        final SubLObject var25 = var26 = Numbers.integerDivide(var22, (SubLObject)module0549.TEN_INTEGER);
        final SubLObject var28;
        final SubLObject var27 = var28 = Numbers.integerDivide(var22, (SubLObject)module0549.TEN_INTEGER);
        final SubLObject var30;
        final SubLObject var29 = var30 = var28;
        if (!module0549.$g3981$.getGlobalValue().isHashtable()) {
            module0549.$g3981$.setGlobalValue(Hashtables.make_hash_table(var23, Symbols.symbol_function((SubLObject)module0549.EQL), module0018.$g572$.getGlobalValue()));
        }
        if (!module0549.$g3982$.getGlobalValue().isHashtable()) {
            module0549.$g3982$.setGlobalValue(Hashtables.make_hash_table(var24, Symbols.symbol_function((SubLObject)module0549.EQL), module0018.$g572$.getGlobalValue()));
        }
        if (!module0549.$g3983$.getGlobalValue().isHashtable()) {
            module0549.$g3983$.setGlobalValue(Hashtables.make_hash_table(var25, Symbols.symbol_function((SubLObject)module0549.EQL), module0018.$g572$.getGlobalValue()));
        }
        if (!module0549.$g3984$.getGlobalValue().isHashtable()) {
            module0549.$g3984$.setGlobalValue(Hashtables.make_hash_table(var26, Symbols.symbol_function((SubLObject)module0549.EQL), module0018.$g572$.getGlobalValue()));
        }
        if (!module0549.$g3985$.getGlobalValue().isHashtable()) {
            module0549.$g3985$.setGlobalValue(Hashtables.make_hash_table(var27, Symbols.symbol_function((SubLObject)module0549.EQL), module0018.$g572$.getGlobalValue()));
        }
        if (!module0549.$g3986$.getGlobalValue().isHashtable()) {
            module0549.$g3986$.setGlobalValue(Hashtables.make_hash_table(var28, Symbols.symbol_function((SubLObject)module0549.EQL), module0018.$g572$.getGlobalValue()));
        }
        if (!module0549.$g3987$.getGlobalValue().isHashtable()) {
            module0549.$g3987$.setGlobalValue(Hashtables.make_hash_table(var29, Symbols.symbol_function((SubLObject)module0549.EQL), module0018.$g572$.getGlobalValue()));
        }
        if (!module0549.$g3988$.getGlobalValue().isHashtable()) {
            module0549.$g3988$.setGlobalValue(Hashtables.make_hash_table(var30, Symbols.symbol_function((SubLObject)module0549.EQL), module0018.$g572$.getGlobalValue()));
        }
        return var22;
    }
    
    public static SubLObject f33915() {
        Hashtables.clrhash(module0549.$g3981$.getGlobalValue());
        Hashtables.clrhash(module0549.$g3983$.getGlobalValue());
        Hashtables.clrhash(module0549.$g3985$.getGlobalValue());
        return (SubLObject)module0549.NIL;
    }
    
    public static SubLObject f33891() {
        f33915();
        f33935();
        f33936();
        f33937();
        f33938();
        f33939();
        f33940();
        return (SubLObject)module0549.NIL;
    }
    
    public static SubLObject f33941(final SubLObject var31, final SubLObject var32) {
        SubLObject var34;
        final SubLObject var33 = var34 = var31.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0549.$ic15$);
        final SubLObject var35 = var34.rest();
        var34 = var34.first();
        SubLObject var36 = (SubLObject)module0549.NIL;
        SubLObject var37 = (SubLObject)module0549.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0549.$ic15$);
        var36 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0549.$ic15$);
        var37 = var34.first();
        var34 = var34.rest();
        SubLObject var38 = (SubLObject)module0549.NIL;
        SubLObject var39 = var34;
        SubLObject var40 = (SubLObject)module0549.NIL;
        SubLObject var41_42 = (SubLObject)module0549.NIL;
        while (module0549.NIL != var39) {
            cdestructuring_bind.destructuring_bind_must_consp(var39, var33, (SubLObject)module0549.$ic15$);
            var41_42 = var39.first();
            var39 = var39.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var39, var33, (SubLObject)module0549.$ic15$);
            if (module0549.NIL == conses_high.member(var41_42, (SubLObject)module0549.$ic16$, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED)) {
                var40 = (SubLObject)module0549.T;
            }
            if (var41_42 == module0549.$ic17$) {
                var38 = var39.first();
            }
            var39 = var39.rest();
        }
        if (module0549.NIL != var40 && module0549.NIL == var38) {
            cdestructuring_bind.cdestructuring_bind_error(var33, (SubLObject)module0549.$ic15$);
        }
        final SubLObject var41 = cdestructuring_bind.property_list_member((SubLObject)module0549.$ic18$, var34);
        final SubLObject var42 = (SubLObject)((module0549.NIL != var41) ? conses_high.cadr(var41) : module0549.NIL);
        final SubLObject var43 = cdestructuring_bind.property_list_member((SubLObject)module0549.$ic19$, var34);
        final SubLObject var44 = (SubLObject)((module0549.NIL != var43) ? conses_high.cadr(var43) : module0549.NIL);
        final SubLObject var45;
        var34 = (var45 = var35);
        if (module0549.NIL != var42) {
            final SubLObject var46 = (SubLObject)module0549.$ic20$;
            final SubLObject var47 = (SubLObject)module0549.$ic21$;
            final SubLObject var48 = (SubLObject)module0549.$ic22$;
            final SubLObject var49 = (SubLObject)module0549.$ic23$;
            return (SubLObject)ConsesLow.list((SubLObject)module0549.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var46, var42), (SubLObject)ConsesLow.list(var47, var37), (SubLObject)ConsesLow.list(var48, (SubLObject)ConsesLow.list((SubLObject)module0549.$ic25$, var47)), reader.bq_cons(var49, (SubLObject)module0549.$ic26$)), (SubLObject)ConsesLow.list((SubLObject)module0549.$ic27$, var46, (SubLObject)ConsesLow.listS((SubLObject)module0549.$ic28$, (SubLObject)ConsesLow.list(var36, var47, (SubLObject)module0549.$ic19$, var44), (SubLObject)ConsesLow.list((SubLObject)module0549.$ic29$, var49, var48), (SubLObject)ConsesLow.list((SubLObject)module0549.$ic30$, var48), ConsesLow.append(var45, (SubLObject)module0549.NIL))));
        }
        if (!var37.isSymbol()) {
            final SubLObject var50 = (SubLObject)module0549.$ic31$;
            return (SubLObject)ConsesLow.list((SubLObject)module0549.$ic24$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var50, var37)), (SubLObject)ConsesLow.listS((SubLObject)module0549.$ic28$, (SubLObject)ConsesLow.list(var36, var50, (SubLObject)module0549.$ic19$, var44), ConsesLow.append(var45, (SubLObject)module0549.NIL)));
        }
        final SubLObject var51 = (SubLObject)module0549.$ic32$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0549.$ic33$, (SubLObject)ConsesLow.list(var36, var51, (SubLObject)module0549.$ic34$, var37, (SubLObject)module0549.$ic19$, var44), (SubLObject)ConsesLow.list((SubLObject)module0549.$ic35$, var51), ConsesLow.append(var45, (SubLObject)module0549.NIL));
    }
    
    public static SubLObject f33942(final SubLObject var37) {
        return Hashtables.hash_table_count(module0244.f15766(var37));
    }
    
    public static SubLObject f33935() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = (SubLObject)module0549.$ic36$;
        final SubLObject var3 = module0137.f8955(module0549.$ic37$);
        SubLObject var4 = (SubLObject)module0549.ZERO_INTEGER;
        final SubLObject var5 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var1);
        try {
            module0147.$g2094$.bind((SubLObject)module0549.$ic38$, var1);
            module0147.$g2095$.bind(module0549.$ic39$, var1);
            final SubLObject var7 = var2;
            final SubLObject var8 = var3;
            SubLObject var9 = f33942(var8);
            final SubLObject var10 = (SubLObject)module0549.ZERO_INTEGER;
            final SubLObject var3_58 = module0012.$g75$.currentBinding(var1);
            final SubLObject var4_59 = module0012.$g76$.currentBinding(var1);
            final SubLObject var11 = module0012.$g77$.currentBinding(var1);
            final SubLObject var12 = module0012.$g78$.currentBinding(var1);
            try {
                module0012.$g75$.bind((SubLObject)module0549.ZERO_INTEGER, var1);
                module0012.$g76$.bind((SubLObject)module0549.NIL, var1);
                module0012.$g77$.bind((SubLObject)module0549.T, var1);
                module0012.$g78$.bind(Time.get_universal_time(), var1);
                module0012.f478(var7);
                final SubLObject var3_59 = module0096.$g1262$.currentBinding(var1);
                final SubLObject var4_60 = module0021.$g777$.currentBinding(var1);
                try {
                    module0096.$g1262$.bind(module0242.$g2454$.getGlobalValue(), var1);
                    module0021.$g777$.bind((SubLObject)module0549.NIL, var1);
                    module0021.f1151(module0107.f7590());
                    final SubLObject var13 = module0244.f15766(var8);
                    SubLObject var14 = (SubLObject)module0549.NIL;
                    final SubLObject var15 = module0079.f5424(var13);
                    SubLObject var18;
                    for (SubLObject var16 = (SubLObject)module0549.NIL; module0549.NIL == var16; var16 = (SubLObject)SubLObjectFactory.makeBoolean(module0549.NIL == var18)) {
                        var1.resetMultipleValues();
                        final SubLObject var17 = module0052.f3693(var15);
                        var18 = var1.secondMultipleValue();
                        var1.resetMultipleValues();
                        if (module0549.NIL != var18) {
                            SubLObject var20;
                            final SubLObject var19 = var20 = var17;
                            SubLObject var21 = (SubLObject)module0549.NIL;
                            SubLObject var22 = (SubLObject)module0549.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0549.$ic40$);
                            var21 = var20.first();
                            var20 = var20.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0549.$ic40$);
                            var22 = var20.first();
                            var20 = var20.rest();
                            if (module0549.NIL == var20) {
                                if (module0549.NIL == module0096.f6883(var22) || module0549.NIL == module0096.f6910(var22)) {
                                    var14 = module0096.f6925(var13, module0242.$g2449$.getGlobalValue(), (SubLObject)module0549.NIL, var21, (SubLObject)module0549.UNPROVIDED);
                                    module0012.note_percent_progress(var10, var9);
                                    var9 = Numbers.add(var9, (SubLObject)module0549.ONE_INTEGER);
                                    if (module0549.NIL != module0269.f17710(var21)) {
                                        SubLObject var23 = (SubLObject)module0549.ZERO_INTEGER;
                                        final SubLObject var3_60 = module0137.$g1605$.currentBinding(var1);
                                        try {
                                            module0137.$g1605$.bind((module0549.NIL != module0137.f8955(module0549.$ic37$)) ? module0137.f8955(module0549.$ic37$) : module0137.$g1605$.getDynamicValue(var1), var1);
                                            final SubLObject var24 = module0242.f15664(var21, module0137.f8955(module0549.$ic37$));
                                            if (module0549.NIL != var24) {
                                                SubLObject var25 = module0244.f15784(module0137.f8955(module0549.$ic37$));
                                                SubLObject var26 = (SubLObject)module0549.NIL;
                                                var26 = var25.first();
                                                while (module0549.NIL != var25) {
                                                    final SubLObject var27 = module0245.f15834(var24, var26, module0137.f8955(module0549.$ic37$));
                                                    if (module0549.NIL != var27 && var26.eql(module0244.f15780(module0137.f8955(module0549.$ic37$)))) {
                                                        SubLObject var28;
                                                        for (var28 = module0066.f4838(module0067.f4891(var27)); module0549.NIL == module0066.f4841(var28); var28 = module0066.f4840(var28)) {
                                                            var1.resetMultipleValues();
                                                            final SubLObject var29 = module0066.f4839(var28);
                                                            final SubLObject var30 = var1.secondMultipleValue();
                                                            var1.resetMultipleValues();
                                                            SubLObject var78_81;
                                                            for (var78_81 = module0066.f4838(module0067.f4891(var30)); module0549.NIL == module0066.f4841(var78_81); var78_81 = module0066.f4840(var78_81)) {
                                                                var1.resetMultipleValues();
                                                                final SubLObject var31 = module0066.f4839(var78_81);
                                                                final SubLObject var32 = var1.secondMultipleValue();
                                                                var1.resetMultipleValues();
                                                                if (module0549.NIL != module0141.f9279(var31)) {
                                                                    final SubLObject var33 = var32;
                                                                    if (module0549.NIL != module0077.f5302(var33)) {
                                                                        final SubLObject var34 = module0077.f5333(var33);
                                                                        SubLObject var35;
                                                                        SubLObject var36;
                                                                        SubLObject var37;
                                                                        for (var35 = module0032.f1741(var34), var36 = (SubLObject)module0549.NIL, var36 = module0032.f1742(var35, var34); module0549.NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                                                            var37 = module0032.f1745(var35, var36);
                                                                            if (module0549.NIL != module0032.f1746(var36, var37)) {
                                                                                var23 = Numbers.add(var23, (SubLObject)module0549.ONE_INTEGER);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (var33.isList()) {
                                                                        SubLObject var38 = var33;
                                                                        SubLObject var39 = (SubLObject)module0549.NIL;
                                                                        var39 = var38.first();
                                                                        while (module0549.NIL != var38) {
                                                                            var23 = Numbers.add(var23, (SubLObject)module0549.ONE_INTEGER);
                                                                            var38 = var38.rest();
                                                                            var39 = var38.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)module0549.$ic41$, var33);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var78_81);
                                                        }
                                                        module0066.f4842(var28);
                                                    }
                                                    var25 = var25.rest();
                                                    var26 = var25.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0137.$g1605$.rebind(var3_60, var1);
                                        }
                                        if (var23.isPositive()) {
                                            var4 = Numbers.add(var4, (SubLObject)module0549.ONE_INTEGER);
                                            f33925(var21, var23);
                                        }
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var19, (SubLObject)module0549.$ic40$);
                            }
                        }
                    }
                }
                finally {
                    module0021.$g777$.rebind(var4_60, var1);
                    module0096.$g1262$.rebind(var3_59, var1);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var12, var1);
                module0012.$g77$.rebind(var11, var1);
                module0012.$g76$.rebind(var4_59, var1);
                module0012.$g75$.rebind(var3_58, var1);
            }
        }
        finally {
            module0147.$g2095$.rebind(var6, var1);
            module0147.$g2094$.rebind(var5, var1);
        }
        return var4;
    }
    
    public static SubLObject f33936() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = (SubLObject)module0549.$ic42$;
        final SubLObject var3 = module0137.f8955(module0549.$ic43$);
        SubLObject var4 = (SubLObject)module0549.ZERO_INTEGER;
        final SubLObject var5 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var1);
        try {
            module0147.$g2094$.bind((SubLObject)module0549.$ic38$, var1);
            module0147.$g2095$.bind(module0549.$ic39$, var1);
            final SubLObject var7 = var2;
            final SubLObject var8 = var3;
            SubLObject var9 = f33942(var8);
            final SubLObject var10 = (SubLObject)module0549.ZERO_INTEGER;
            final SubLObject var3_90 = module0012.$g75$.currentBinding(var1);
            final SubLObject var4_91 = module0012.$g76$.currentBinding(var1);
            final SubLObject var11 = module0012.$g77$.currentBinding(var1);
            final SubLObject var12 = module0012.$g78$.currentBinding(var1);
            try {
                module0012.$g75$.bind((SubLObject)module0549.ZERO_INTEGER, var1);
                module0012.$g76$.bind((SubLObject)module0549.NIL, var1);
                module0012.$g77$.bind((SubLObject)module0549.T, var1);
                module0012.$g78$.bind(Time.get_universal_time(), var1);
                module0012.f478(var7);
                final SubLObject var3_91 = module0096.$g1262$.currentBinding(var1);
                final SubLObject var4_92 = module0021.$g777$.currentBinding(var1);
                try {
                    module0096.$g1262$.bind(module0242.$g2454$.getGlobalValue(), var1);
                    module0021.$g777$.bind((SubLObject)module0549.NIL, var1);
                    module0021.f1151(module0107.f7590());
                    final SubLObject var13 = module0244.f15766(var8);
                    SubLObject var14 = (SubLObject)module0549.NIL;
                    final SubLObject var15 = module0079.f5424(var13);
                    SubLObject var18;
                    for (SubLObject var16 = (SubLObject)module0549.NIL; module0549.NIL == var16; var16 = (SubLObject)SubLObjectFactory.makeBoolean(module0549.NIL == var18)) {
                        var1.resetMultipleValues();
                        final SubLObject var17 = module0052.f3693(var15);
                        var18 = var1.secondMultipleValue();
                        var1.resetMultipleValues();
                        if (module0549.NIL != var18) {
                            SubLObject var20;
                            final SubLObject var19 = var20 = var17;
                            SubLObject var21 = (SubLObject)module0549.NIL;
                            SubLObject var22 = (SubLObject)module0549.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0549.$ic40$);
                            var21 = var20.first();
                            var20 = var20.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0549.$ic40$);
                            var22 = var20.first();
                            var20 = var20.rest();
                            if (module0549.NIL == var20) {
                                if (module0549.NIL == module0096.f6883(var22) || module0549.NIL == module0096.f6910(var22)) {
                                    var14 = module0096.f6925(var13, module0242.$g2449$.getGlobalValue(), (SubLObject)module0549.NIL, var21, (SubLObject)module0549.UNPROVIDED);
                                    module0012.note_percent_progress(var10, var9);
                                    var9 = Numbers.add(var9, (SubLObject)module0549.ONE_INTEGER);
                                    if (module0549.NIL != module0269.f17710(var21)) {
                                        SubLObject var23 = (SubLObject)module0549.ZERO_INTEGER;
                                        final SubLObject var3_92 = module0137.$g1605$.currentBinding(var1);
                                        try {
                                            module0137.$g1605$.bind((module0549.NIL != module0137.f8955(module0549.$ic43$)) ? module0137.f8955(module0549.$ic43$) : module0137.$g1605$.getDynamicValue(var1), var1);
                                            final SubLObject var24 = module0242.f15664(var21, module0137.f8955(module0549.$ic43$));
                                            if (module0549.NIL != var24) {
                                                SubLObject var25 = module0244.f15784(module0137.f8955(module0549.$ic43$));
                                                SubLObject var26 = (SubLObject)module0549.NIL;
                                                var26 = var25.first();
                                                while (module0549.NIL != var25) {
                                                    final SubLObject var27 = module0245.f15834(var24, var26, module0137.f8955(module0549.$ic43$));
                                                    if (module0549.NIL != var27 && var26.eql(module0244.f15780(module0137.f8955(module0549.$ic43$)))) {
                                                        SubLObject var28;
                                                        for (var28 = module0066.f4838(module0067.f4891(var27)); module0549.NIL == module0066.f4841(var28); var28 = module0066.f4840(var28)) {
                                                            var1.resetMultipleValues();
                                                            final SubLObject var29 = module0066.f4839(var28);
                                                            final SubLObject var30 = var1.secondMultipleValue();
                                                            var1.resetMultipleValues();
                                                            SubLObject var78_98;
                                                            for (var78_98 = module0066.f4838(module0067.f4891(var30)); module0549.NIL == module0066.f4841(var78_98); var78_98 = module0066.f4840(var78_98)) {
                                                                var1.resetMultipleValues();
                                                                final SubLObject var31 = module0066.f4839(var78_98);
                                                                final SubLObject var32 = var1.secondMultipleValue();
                                                                var1.resetMultipleValues();
                                                                if (module0549.NIL != module0141.f9279(var31)) {
                                                                    final SubLObject var33 = var32;
                                                                    if (module0549.NIL != module0077.f5302(var33)) {
                                                                        final SubLObject var34 = module0077.f5333(var33);
                                                                        SubLObject var35;
                                                                        SubLObject var36;
                                                                        SubLObject var37;
                                                                        for (var35 = module0032.f1741(var34), var36 = (SubLObject)module0549.NIL, var36 = module0032.f1742(var35, var34); module0549.NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                                                            var37 = module0032.f1745(var35, var36);
                                                                            if (module0549.NIL != module0032.f1746(var36, var37)) {
                                                                                var23 = Numbers.add(var23, (SubLObject)module0549.ONE_INTEGER);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (var33.isList()) {
                                                                        SubLObject var38 = var33;
                                                                        SubLObject var39 = (SubLObject)module0549.NIL;
                                                                        var39 = var38.first();
                                                                        while (module0549.NIL != var38) {
                                                                            var23 = Numbers.add(var23, (SubLObject)module0549.ONE_INTEGER);
                                                                            var38 = var38.rest();
                                                                            var39 = var38.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)module0549.$ic41$, var33);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var78_98);
                                                        }
                                                        module0066.f4842(var28);
                                                    }
                                                    var25 = var25.rest();
                                                    var26 = var25.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0137.$g1605$.rebind(var3_92, var1);
                                        }
                                        if (var23.isPositive()) {
                                            var4 = Numbers.add(var4, (SubLObject)module0549.ONE_INTEGER);
                                            f33919(var21, var23);
                                        }
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var19, (SubLObject)module0549.$ic40$);
                            }
                        }
                    }
                }
                finally {
                    module0021.$g777$.rebind(var4_92, var1);
                    module0096.$g1262$.rebind(var3_91, var1);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var12, var1);
                module0012.$g77$.rebind(var11, var1);
                module0012.$g76$.rebind(var4_91, var1);
                module0012.$g75$.rebind(var3_90, var1);
            }
        }
        finally {
            module0147.$g2095$.rebind(var6, var1);
            module0147.$g2094$.rebind(var5, var1);
        }
        return var4;
    }
    
    public static SubLObject f33937() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = (SubLObject)module0549.$ic44$;
        final SubLObject var3 = module0137.f8955(module0549.$ic45$);
        SubLObject var4 = (SubLObject)module0549.ZERO_INTEGER;
        final SubLObject var5 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var1);
        try {
            module0147.$g2094$.bind((SubLObject)module0549.$ic38$, var1);
            module0147.$g2095$.bind(module0549.$ic39$, var1);
            final SubLObject var7 = var2;
            final SubLObject var8 = var3;
            SubLObject var9 = f33942(var8);
            final SubLObject var10 = (SubLObject)module0549.ZERO_INTEGER;
            final SubLObject var3_100 = module0012.$g75$.currentBinding(var1);
            final SubLObject var4_101 = module0012.$g76$.currentBinding(var1);
            final SubLObject var11 = module0012.$g77$.currentBinding(var1);
            final SubLObject var12 = module0012.$g78$.currentBinding(var1);
            try {
                module0012.$g75$.bind((SubLObject)module0549.ZERO_INTEGER, var1);
                module0012.$g76$.bind((SubLObject)module0549.NIL, var1);
                module0012.$g77$.bind((SubLObject)module0549.T, var1);
                module0012.$g78$.bind(Time.get_universal_time(), var1);
                module0012.f478(var7);
                final SubLObject var3_101 = module0096.$g1262$.currentBinding(var1);
                final SubLObject var4_102 = module0021.$g777$.currentBinding(var1);
                try {
                    module0096.$g1262$.bind(module0242.$g2454$.getGlobalValue(), var1);
                    module0021.$g777$.bind((SubLObject)module0549.NIL, var1);
                    module0021.f1151(module0107.f7590());
                    final SubLObject var13 = module0244.f15766(var8);
                    SubLObject var14 = (SubLObject)module0549.NIL;
                    final SubLObject var15 = module0079.f5424(var13);
                    SubLObject var18;
                    for (SubLObject var16 = (SubLObject)module0549.NIL; module0549.NIL == var16; var16 = (SubLObject)SubLObjectFactory.makeBoolean(module0549.NIL == var18)) {
                        var1.resetMultipleValues();
                        final SubLObject var17 = module0052.f3693(var15);
                        var18 = var1.secondMultipleValue();
                        var1.resetMultipleValues();
                        if (module0549.NIL != var18) {
                            SubLObject var20;
                            final SubLObject var19 = var20 = var17;
                            SubLObject var21 = (SubLObject)module0549.NIL;
                            SubLObject var22 = (SubLObject)module0549.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0549.$ic40$);
                            var21 = var20.first();
                            var20 = var20.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0549.$ic40$);
                            var22 = var20.first();
                            var20 = var20.rest();
                            if (module0549.NIL == var20) {
                                if (module0549.NIL == module0096.f6883(var22) || module0549.NIL == module0096.f6910(var22)) {
                                    var14 = module0096.f6925(var13, module0242.$g2449$.getGlobalValue(), (SubLObject)module0549.NIL, var21, (SubLObject)module0549.UNPROVIDED);
                                    module0012.note_percent_progress(var10, var9);
                                    var9 = Numbers.add(var9, (SubLObject)module0549.ONE_INTEGER);
                                    if (module0549.NIL != module0269.f17710(var21)) {
                                        SubLObject var23 = (SubLObject)module0549.ZERO_INTEGER;
                                        final SubLObject var3_102 = module0137.$g1605$.currentBinding(var1);
                                        try {
                                            module0137.$g1605$.bind((module0549.NIL != module0137.f8955(module0549.$ic45$)) ? module0137.f8955(module0549.$ic45$) : module0137.$g1605$.getDynamicValue(var1), var1);
                                            final SubLObject var24 = module0242.f15664(var21, module0137.f8955(module0549.$ic45$));
                                            if (module0549.NIL != var24) {
                                                SubLObject var25 = module0244.f15784(module0137.f8955(module0549.$ic45$));
                                                SubLObject var26 = (SubLObject)module0549.NIL;
                                                var26 = var25.first();
                                                while (module0549.NIL != var25) {
                                                    final SubLObject var27 = module0245.f15834(var24, var26, module0137.f8955(module0549.$ic45$));
                                                    if (module0549.NIL != var27 && var26.eql(module0244.f15780(module0137.f8955(module0549.$ic45$)))) {
                                                        SubLObject var28;
                                                        for (var28 = module0066.f4838(module0067.f4891(var27)); module0549.NIL == module0066.f4841(var28); var28 = module0066.f4840(var28)) {
                                                            var1.resetMultipleValues();
                                                            final SubLObject var29 = module0066.f4839(var28);
                                                            final SubLObject var30 = var1.secondMultipleValue();
                                                            var1.resetMultipleValues();
                                                            SubLObject var78_108;
                                                            for (var78_108 = module0066.f4838(module0067.f4891(var30)); module0549.NIL == module0066.f4841(var78_108); var78_108 = module0066.f4840(var78_108)) {
                                                                var1.resetMultipleValues();
                                                                final SubLObject var31 = module0066.f4839(var78_108);
                                                                final SubLObject var32 = var1.secondMultipleValue();
                                                                var1.resetMultipleValues();
                                                                if (module0549.NIL != module0141.f9279(var31)) {
                                                                    final SubLObject var33 = var32;
                                                                    if (module0549.NIL != module0077.f5302(var33)) {
                                                                        final SubLObject var34 = module0077.f5333(var33);
                                                                        SubLObject var35;
                                                                        SubLObject var36;
                                                                        SubLObject var37;
                                                                        for (var35 = module0032.f1741(var34), var36 = (SubLObject)module0549.NIL, var36 = module0032.f1742(var35, var34); module0549.NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                                                            var37 = module0032.f1745(var35, var36);
                                                                            if (module0549.NIL != module0032.f1746(var36, var37)) {
                                                                                var23 = Numbers.add(var23, (SubLObject)module0549.ONE_INTEGER);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (var33.isList()) {
                                                                        SubLObject var38 = var33;
                                                                        SubLObject var39 = (SubLObject)module0549.NIL;
                                                                        var39 = var38.first();
                                                                        while (module0549.NIL != var38) {
                                                                            var23 = Numbers.add(var23, (SubLObject)module0549.ONE_INTEGER);
                                                                            var38 = var38.rest();
                                                                            var39 = var38.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)module0549.$ic41$, var33);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var78_108);
                                                        }
                                                        module0066.f4842(var28);
                                                    }
                                                    var25 = var25.rest();
                                                    var26 = var25.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0137.$g1605$.rebind(var3_102, var1);
                                        }
                                        if (var23.isPositive()) {
                                            var4 = Numbers.add(var4, (SubLObject)module0549.ONE_INTEGER);
                                            f33922(var21, var23);
                                        }
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var19, (SubLObject)module0549.$ic40$);
                            }
                        }
                    }
                }
                finally {
                    module0021.$g777$.rebind(var4_102, var1);
                    module0096.$g1262$.rebind(var3_101, var1);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var12, var1);
                module0012.$g77$.rebind(var11, var1);
                module0012.$g76$.rebind(var4_101, var1);
                module0012.$g75$.rebind(var3_100, var1);
            }
        }
        finally {
            module0147.$g2095$.rebind(var6, var1);
            module0147.$g2094$.rebind(var5, var1);
        }
        return var4;
    }
    
    public static SubLObject f33938() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = (SubLObject)module0549.$ic46$;
        final SubLObject var3 = module0137.f8955(module0549.$ic47$);
        SubLObject var4 = (SubLObject)module0549.ZERO_INTEGER;
        final SubLObject var5 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var1);
        try {
            module0147.$g2094$.bind((SubLObject)module0549.$ic38$, var1);
            module0147.$g2095$.bind(module0549.$ic39$, var1);
            final SubLObject var7 = var2;
            final SubLObject var8 = var3;
            SubLObject var9 = f33942(var8);
            final SubLObject var10 = (SubLObject)module0549.ZERO_INTEGER;
            final SubLObject var3_110 = module0012.$g75$.currentBinding(var1);
            final SubLObject var4_111 = module0012.$g76$.currentBinding(var1);
            final SubLObject var11 = module0012.$g77$.currentBinding(var1);
            final SubLObject var12 = module0012.$g78$.currentBinding(var1);
            try {
                module0012.$g75$.bind((SubLObject)module0549.ZERO_INTEGER, var1);
                module0012.$g76$.bind((SubLObject)module0549.NIL, var1);
                module0012.$g77$.bind((SubLObject)module0549.T, var1);
                module0012.$g78$.bind(Time.get_universal_time(), var1);
                module0012.f478(var7);
                final SubLObject var3_111 = module0096.$g1262$.currentBinding(var1);
                final SubLObject var4_112 = module0021.$g777$.currentBinding(var1);
                try {
                    module0096.$g1262$.bind(module0242.$g2454$.getGlobalValue(), var1);
                    module0021.$g777$.bind((SubLObject)module0549.NIL, var1);
                    module0021.f1151(module0107.f7590());
                    final SubLObject var13 = module0244.f15766(var8);
                    SubLObject var14 = (SubLObject)module0549.NIL;
                    final SubLObject var15 = module0079.f5424(var13);
                    SubLObject var18;
                    for (SubLObject var16 = (SubLObject)module0549.NIL; module0549.NIL == var16; var16 = (SubLObject)SubLObjectFactory.makeBoolean(module0549.NIL == var18)) {
                        var1.resetMultipleValues();
                        final SubLObject var17 = module0052.f3693(var15);
                        var18 = var1.secondMultipleValue();
                        var1.resetMultipleValues();
                        if (module0549.NIL != var18) {
                            SubLObject var20;
                            final SubLObject var19 = var20 = var17;
                            SubLObject var21 = (SubLObject)module0549.NIL;
                            SubLObject var22 = (SubLObject)module0549.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0549.$ic40$);
                            var21 = var20.first();
                            var20 = var20.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0549.$ic40$);
                            var22 = var20.first();
                            var20 = var20.rest();
                            if (module0549.NIL == var20) {
                                if (module0549.NIL == module0096.f6883(var22) || module0549.NIL == module0096.f6910(var22)) {
                                    var14 = module0096.f6925(var13, module0242.$g2449$.getGlobalValue(), (SubLObject)module0549.NIL, var21, (SubLObject)module0549.UNPROVIDED);
                                    module0012.note_percent_progress(var10, var9);
                                    var9 = Numbers.add(var9, (SubLObject)module0549.ONE_INTEGER);
                                    if (module0549.NIL != module0269.f17716(var21)) {
                                        var4 = Numbers.add(var4, (SubLObject)module0549.ONE_INTEGER);
                                        SubLObject var23 = (SubLObject)module0549.ZERO_INTEGER;
                                        final SubLObject var3_112 = module0137.$g1605$.currentBinding(var1);
                                        try {
                                            module0137.$g1605$.bind((module0549.NIL != module0137.f8955(module0549.$ic47$)) ? module0137.f8955(module0549.$ic47$) : module0137.$g1605$.getDynamicValue(var1), var1);
                                            final SubLObject var24 = module0242.f15664(var21, module0137.f8955(module0549.$ic47$));
                                            if (module0549.NIL != var24) {
                                                SubLObject var25 = module0244.f15784(module0137.f8955(module0549.$ic47$));
                                                SubLObject var26 = (SubLObject)module0549.NIL;
                                                var26 = var25.first();
                                                while (module0549.NIL != var25) {
                                                    final SubLObject var27 = module0245.f15834(var24, var26, module0137.f8955(module0549.$ic47$));
                                                    if (module0549.NIL != var27 && var26.eql(module0244.f15780(module0137.f8955(module0549.$ic47$)))) {
                                                        SubLObject var28;
                                                        for (var28 = module0066.f4838(module0067.f4891(var27)); module0549.NIL == module0066.f4841(var28); var28 = module0066.f4840(var28)) {
                                                            var1.resetMultipleValues();
                                                            final SubLObject var29 = module0066.f4839(var28);
                                                            final SubLObject var30 = var1.secondMultipleValue();
                                                            var1.resetMultipleValues();
                                                            SubLObject var78_117;
                                                            for (var78_117 = module0066.f4838(module0067.f4891(var30)); module0549.NIL == module0066.f4841(var78_117); var78_117 = module0066.f4840(var78_117)) {
                                                                var1.resetMultipleValues();
                                                                final SubLObject var31 = module0066.f4839(var78_117);
                                                                final SubLObject var32 = var1.secondMultipleValue();
                                                                var1.resetMultipleValues();
                                                                if (module0549.NIL != module0141.f9279(var31)) {
                                                                    final SubLObject var33 = var32;
                                                                    if (module0549.NIL != module0077.f5302(var33)) {
                                                                        final SubLObject var34 = module0077.f5333(var33);
                                                                        SubLObject var35;
                                                                        SubLObject var36;
                                                                        SubLObject var37;
                                                                        for (var35 = module0032.f1741(var34), var36 = (SubLObject)module0549.NIL, var36 = module0032.f1742(var35, var34); module0549.NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                                                            var37 = module0032.f1745(var35, var36);
                                                                            if (module0549.NIL != module0032.f1746(var36, var37)) {
                                                                                var23 = Numbers.add(var23, (SubLObject)module0549.ONE_INTEGER);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (var33.isList()) {
                                                                        SubLObject var38 = var33;
                                                                        SubLObject var39 = (SubLObject)module0549.NIL;
                                                                        var39 = var38.first();
                                                                        while (module0549.NIL != var38) {
                                                                            var23 = Numbers.add(var23, (SubLObject)module0549.ONE_INTEGER);
                                                                            var38 = var38.rest();
                                                                            var39 = var38.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)module0549.$ic41$, var33);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var78_117);
                                                        }
                                                        module0066.f4842(var28);
                                                    }
                                                    var25 = var25.rest();
                                                    var26 = var25.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0137.$g1605$.rebind(var3_112, var1);
                                        }
                                        f33925(var21, var23);
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var19, (SubLObject)module0549.$ic40$);
                            }
                        }
                    }
                }
                finally {
                    module0021.$g777$.rebind(var4_112, var1);
                    module0096.$g1262$.rebind(var3_111, var1);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var12, var1);
                module0012.$g77$.rebind(var11, var1);
                module0012.$g76$.rebind(var4_111, var1);
                module0012.$g75$.rebind(var3_110, var1);
            }
        }
        finally {
            module0147.$g2095$.rebind(var6, var1);
            module0147.$g2094$.rebind(var5, var1);
        }
        return var4;
    }
    
    public static SubLObject f33939() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = (SubLObject)module0549.$ic48$;
        final SubLObject var3 = module0137.f8955(module0549.$ic49$);
        SubLObject var4 = (SubLObject)module0549.ZERO_INTEGER;
        final SubLObject var5 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var1);
        try {
            module0147.$g2094$.bind((SubLObject)module0549.$ic38$, var1);
            module0147.$g2095$.bind(module0549.$ic39$, var1);
            final SubLObject var7 = var2;
            final SubLObject var8 = var3;
            SubLObject var9 = f33942(var8);
            final SubLObject var10 = (SubLObject)module0549.ZERO_INTEGER;
            final SubLObject var3_119 = module0012.$g75$.currentBinding(var1);
            final SubLObject var4_120 = module0012.$g76$.currentBinding(var1);
            final SubLObject var11 = module0012.$g77$.currentBinding(var1);
            final SubLObject var12 = module0012.$g78$.currentBinding(var1);
            try {
                module0012.$g75$.bind((SubLObject)module0549.ZERO_INTEGER, var1);
                module0012.$g76$.bind((SubLObject)module0549.NIL, var1);
                module0012.$g77$.bind((SubLObject)module0549.T, var1);
                module0012.$g78$.bind(Time.get_universal_time(), var1);
                module0012.f478(var7);
                final SubLObject var3_120 = module0096.$g1262$.currentBinding(var1);
                final SubLObject var4_121 = module0021.$g777$.currentBinding(var1);
                try {
                    module0096.$g1262$.bind(module0242.$g2454$.getGlobalValue(), var1);
                    module0021.$g777$.bind((SubLObject)module0549.NIL, var1);
                    module0021.f1151(module0107.f7590());
                    final SubLObject var13 = module0244.f15766(var8);
                    SubLObject var14 = (SubLObject)module0549.NIL;
                    final SubLObject var15 = module0079.f5424(var13);
                    SubLObject var18;
                    for (SubLObject var16 = (SubLObject)module0549.NIL; module0549.NIL == var16; var16 = (SubLObject)SubLObjectFactory.makeBoolean(module0549.NIL == var18)) {
                        var1.resetMultipleValues();
                        final SubLObject var17 = module0052.f3693(var15);
                        var18 = var1.secondMultipleValue();
                        var1.resetMultipleValues();
                        if (module0549.NIL != var18) {
                            SubLObject var20;
                            final SubLObject var19 = var20 = var17;
                            SubLObject var21 = (SubLObject)module0549.NIL;
                            SubLObject var22 = (SubLObject)module0549.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0549.$ic40$);
                            var21 = var20.first();
                            var20 = var20.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0549.$ic40$);
                            var22 = var20.first();
                            var20 = var20.rest();
                            if (module0549.NIL == var20) {
                                if (module0549.NIL == module0096.f6883(var22) || module0549.NIL == module0096.f6910(var22)) {
                                    var14 = module0096.f6925(var13, module0242.$g2449$.getGlobalValue(), (SubLObject)module0549.NIL, var21, (SubLObject)module0549.UNPROVIDED);
                                    module0012.note_percent_progress(var10, var9);
                                    var9 = Numbers.add(var9, (SubLObject)module0549.ONE_INTEGER);
                                    if (module0549.NIL != module0269.f17731(var21)) {
                                        var4 = Numbers.add(var4, (SubLObject)module0549.ONE_INTEGER);
                                        SubLObject var23 = (SubLObject)module0549.ZERO_INTEGER;
                                        final SubLObject var3_121 = module0137.$g1605$.currentBinding(var1);
                                        try {
                                            module0137.$g1605$.bind((module0549.NIL != module0137.f8955(module0549.$ic49$)) ? module0137.f8955(module0549.$ic49$) : module0137.$g1605$.getDynamicValue(var1), var1);
                                            final SubLObject var24 = module0242.f15664(var21, module0137.f8955(module0549.$ic49$));
                                            if (module0549.NIL != var24) {
                                                SubLObject var25 = module0244.f15784(module0137.f8955(module0549.$ic49$));
                                                SubLObject var26 = (SubLObject)module0549.NIL;
                                                var26 = var25.first();
                                                while (module0549.NIL != var25) {
                                                    final SubLObject var27 = module0245.f15834(var24, var26, module0137.f8955(module0549.$ic49$));
                                                    if (module0549.NIL != var27 && var26.eql(module0244.f15780(module0137.f8955(module0549.$ic49$)))) {
                                                        SubLObject var28;
                                                        for (var28 = module0066.f4838(module0067.f4891(var27)); module0549.NIL == module0066.f4841(var28); var28 = module0066.f4840(var28)) {
                                                            var1.resetMultipleValues();
                                                            final SubLObject var29 = module0066.f4839(var28);
                                                            final SubLObject var30 = var1.secondMultipleValue();
                                                            var1.resetMultipleValues();
                                                            SubLObject var78_126;
                                                            for (var78_126 = module0066.f4838(module0067.f4891(var30)); module0549.NIL == module0066.f4841(var78_126); var78_126 = module0066.f4840(var78_126)) {
                                                                var1.resetMultipleValues();
                                                                final SubLObject var31 = module0066.f4839(var78_126);
                                                                final SubLObject var32 = var1.secondMultipleValue();
                                                                var1.resetMultipleValues();
                                                                if (module0549.NIL != module0141.f9279(var31)) {
                                                                    final SubLObject var33 = var32;
                                                                    if (module0549.NIL != module0077.f5302(var33)) {
                                                                        final SubLObject var34 = module0077.f5333(var33);
                                                                        SubLObject var35;
                                                                        SubLObject var36;
                                                                        SubLObject var37;
                                                                        for (var35 = module0032.f1741(var34), var36 = (SubLObject)module0549.NIL, var36 = module0032.f1742(var35, var34); module0549.NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                                                            var37 = module0032.f1745(var35, var36);
                                                                            if (module0549.NIL != module0032.f1746(var36, var37)) {
                                                                                var23 = Numbers.add(var23, (SubLObject)module0549.ONE_INTEGER);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (var33.isList()) {
                                                                        SubLObject var38 = var33;
                                                                        SubLObject var39 = (SubLObject)module0549.NIL;
                                                                        var39 = var38.first();
                                                                        while (module0549.NIL != var38) {
                                                                            var23 = Numbers.add(var23, (SubLObject)module0549.ONE_INTEGER);
                                                                            var38 = var38.rest();
                                                                            var39 = var38.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)module0549.$ic41$, var33);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var78_126);
                                                        }
                                                        module0066.f4842(var28);
                                                    }
                                                    var25 = var25.rest();
                                                    var26 = var25.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0137.$g1605$.rebind(var3_121, var1);
                                        }
                                        f33925(var21, var23);
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var19, (SubLObject)module0549.$ic40$);
                            }
                        }
                    }
                }
                finally {
                    module0021.$g777$.rebind(var4_121, var1);
                    module0096.$g1262$.rebind(var3_120, var1);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var12, var1);
                module0012.$g77$.rebind(var11, var1);
                module0012.$g76$.rebind(var4_120, var1);
                module0012.$g75$.rebind(var3_119, var1);
            }
        }
        finally {
            module0147.$g2095$.rebind(var6, var1);
            module0147.$g2094$.rebind(var5, var1);
        }
        return var4;
    }
    
    public static SubLObject f33940() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = (SubLObject)module0549.$ic50$;
        SubLObject var3 = (SubLObject)module0549.ZERO_INTEGER;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var1);
        try {
            module0147.$g2094$.bind((SubLObject)module0549.$ic38$, var1);
            module0147.$g2095$.bind(module0549.$ic39$, var1);
            final SubLObject var127_128 = var2;
            final SubLObject var6 = module0173.f10962();
            SubLObject var7 = (SubLObject)module0549.ZERO_INTEGER;
            final SubLObject var3_131 = module0012.$g75$.currentBinding(var1);
            final SubLObject var4_132 = module0012.$g76$.currentBinding(var1);
            final SubLObject var8 = module0012.$g77$.currentBinding(var1);
            final SubLObject var9 = module0012.$g78$.currentBinding(var1);
            try {
                module0012.$g75$.bind((SubLObject)module0549.ZERO_INTEGER, var1);
                module0012.$g76$.bind((SubLObject)module0549.NIL, var1);
                module0012.$g77$.bind((SubLObject)module0549.T, var1);
                module0012.$g78$.bind(Time.get_universal_time(), var1);
                module0012.f478(var127_128);
                SubLObject var10 = module0173.f10961();
                SubLObject var11 = (SubLObject)module0549.NIL;
                var11 = var10.first();
                while (module0549.NIL != var10) {
                    final SubLObject var12 = var11;
                    if (module0549.NIL == module0065.f4772(var12, (SubLObject)module0549.$ic51$)) {
                        final SubLObject var135_136 = var12;
                        if (module0549.NIL == module0065.f4775(var135_136, (SubLObject)module0549.$ic51$)) {
                            final SubLObject var13 = module0065.f4740(var135_136);
                            final SubLObject var14 = (SubLObject)module0549.NIL;
                            SubLObject var15;
                            SubLObject var16;
                            SubLObject var17;
                            SubLObject var18;
                            SubLObject var19;
                            for (var15 = Sequences.length(var13), var16 = (SubLObject)module0549.NIL, var16 = (SubLObject)module0549.ZERO_INTEGER; var16.numL(var15); var16 = Numbers.add(var16, (SubLObject)module0549.ONE_INTEGER)) {
                                var17 = ((module0549.NIL != var14) ? Numbers.subtract(var15, var16, (SubLObject)module0549.ONE_INTEGER) : var16);
                                var18 = Vectors.aref(var13, var17);
                                if (module0549.NIL == module0065.f4749(var18) || module0549.NIL == module0065.f4773((SubLObject)module0549.$ic51$)) {
                                    if (module0549.NIL != module0065.f4749(var18)) {
                                        var18 = (SubLObject)module0549.$ic51$;
                                    }
                                    var7 = Numbers.add(var7, (SubLObject)module0549.ONE_INTEGER);
                                    module0012.note_percent_progress(var7, var6);
                                    var19 = (SubLObject)module0549.ZERO_INTEGER;
                                    if (module0549.NIL != module0269.f17716(var18)) {
                                        var19 = module0217.f14247(var18, (SubLObject)module0549.UNPROVIDED);
                                    }
                                    else if (module0549.NIL != module0269.f17731(var18)) {
                                        var19 = module0217.f14336(var18);
                                    }
                                    else if (module0549.NIL != module0269.f17708(var18)) {
                                        var19 = module0217.f14257(var18);
                                    }
                                    if (var19.numG((SubLObject)module0549.ZERO_INTEGER)) {
                                        var3 = Numbers.add(var3, (SubLObject)module0549.ONE_INTEGER);
                                        f33919(var18, var19);
                                    }
                                }
                            }
                        }
                        final SubLObject var143_144 = var12;
                        if (module0549.NIL == module0065.f4777(var143_144) || module0549.NIL == module0065.f4773((SubLObject)module0549.$ic51$)) {
                            final SubLObject var20 = module0065.f4738(var143_144);
                            SubLObject var21 = module0065.f4739(var143_144);
                            final SubLObject var22 = module0065.f4734(var143_144);
                            final SubLObject var23 = (SubLObject)((module0549.NIL != module0065.f4773((SubLObject)module0549.$ic51$)) ? module0549.NIL : module0549.$ic51$);
                            while (var21.numL(var22)) {
                                final SubLObject var24 = Hashtables.gethash_without_values(var21, var20, var23);
                                if (module0549.NIL == module0065.f4773((SubLObject)module0549.$ic51$) || module0549.NIL == module0065.f4749(var24)) {
                                    var7 = Numbers.add(var7, (SubLObject)module0549.ONE_INTEGER);
                                    module0012.note_percent_progress(var7, var6);
                                    SubLObject var25 = (SubLObject)module0549.ZERO_INTEGER;
                                    if (module0549.NIL != module0269.f17716(var24)) {
                                        var25 = module0217.f14247(var24, (SubLObject)module0549.UNPROVIDED);
                                    }
                                    else if (module0549.NIL != module0269.f17731(var24)) {
                                        var25 = module0217.f14336(var24);
                                    }
                                    else if (module0549.NIL != module0269.f17708(var24)) {
                                        var25 = module0217.f14257(var24);
                                    }
                                    if (var25.numG((SubLObject)module0549.ZERO_INTEGER)) {
                                        var3 = Numbers.add(var3, (SubLObject)module0549.ONE_INTEGER);
                                        f33919(var24, var25);
                                    }
                                }
                                var21 = Numbers.add(var21, (SubLObject)module0549.ONE_INTEGER);
                            }
                        }
                    }
                    var10 = var10.rest();
                    var11 = var10.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var9, var1);
                module0012.$g77$.rebind(var8, var1);
                module0012.$g76$.rebind(var4_132, var1);
                module0012.$g75$.rebind(var3_131, var1);
            }
        }
        finally {
            module0147.$g2095$.rebind(var5, var1);
            module0147.$g2094$.rebind(var4, var1);
        }
        return var3;
    }
    
    public static SubLObject f33916() {
        Hashtables.clrhash(module0549.$g3982$.getGlobalValue());
        Hashtables.clrhash(module0549.$g3984$.getGlobalValue());
        Hashtables.clrhash(module0549.$g3986$.getGlobalValue());
        Hashtables.clrhash(module0549.$g3987$.getGlobalValue());
        return (SubLObject)module0549.NIL;
    }
    
    public static SubLObject f33892() {
        f33916();
        f33943();
        f33944();
        f33945();
        return (SubLObject)module0549.NIL;
    }
    
    public static SubLObject f33943() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = (SubLObject)module0549.$ic52$;
        final SubLObject var3 = module0137.f8955(module0549.$ic37$);
        SubLObject var4 = (SubLObject)module0549.ZERO_INTEGER;
        final SubLObject var5 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var1);
        try {
            module0147.$g2094$.bind((SubLObject)module0549.$ic38$, var1);
            module0147.$g2095$.bind(module0549.$ic39$, var1);
            final SubLObject var7 = var2;
            final SubLObject var8 = var3;
            SubLObject var9 = f33942(var8);
            final SubLObject var10 = (SubLObject)module0549.ZERO_INTEGER;
            final SubLObject var3_148 = module0012.$g75$.currentBinding(var1);
            final SubLObject var4_149 = module0012.$g76$.currentBinding(var1);
            final SubLObject var11 = module0012.$g77$.currentBinding(var1);
            final SubLObject var12 = module0012.$g78$.currentBinding(var1);
            try {
                module0012.$g75$.bind((SubLObject)module0549.ZERO_INTEGER, var1);
                module0012.$g76$.bind((SubLObject)module0549.NIL, var1);
                module0012.$g77$.bind((SubLObject)module0549.T, var1);
                module0012.$g78$.bind(Time.get_universal_time(), var1);
                module0012.f478(var7);
                final SubLObject var3_149 = module0096.$g1262$.currentBinding(var1);
                final SubLObject var4_150 = module0021.$g777$.currentBinding(var1);
                try {
                    module0096.$g1262$.bind(module0242.$g2454$.getGlobalValue(), var1);
                    module0021.$g777$.bind((SubLObject)module0549.NIL, var1);
                    module0021.f1151(module0107.f7590());
                    final SubLObject var13 = module0244.f15766(var8);
                    SubLObject var14 = (SubLObject)module0549.NIL;
                    final SubLObject var15 = module0079.f5424(var13);
                    SubLObject var18;
                    for (SubLObject var16 = (SubLObject)module0549.NIL; module0549.NIL == var16; var16 = (SubLObject)SubLObjectFactory.makeBoolean(module0549.NIL == var18)) {
                        var1.resetMultipleValues();
                        final SubLObject var17 = module0052.f3693(var15);
                        var18 = var1.secondMultipleValue();
                        var1.resetMultipleValues();
                        if (module0549.NIL != var18) {
                            SubLObject var20;
                            final SubLObject var19 = var20 = var17;
                            SubLObject var21 = (SubLObject)module0549.NIL;
                            SubLObject var22 = (SubLObject)module0549.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0549.$ic53$);
                            var21 = var20.first();
                            var20 = var20.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0549.$ic53$);
                            var22 = var20.first();
                            var20 = var20.rest();
                            if (module0549.NIL == var20) {
                                if (module0549.NIL == module0096.f6883(var22) || module0549.NIL == module0096.f6910(var22)) {
                                    var14 = module0096.f6925(var13, module0242.$g2449$.getGlobalValue(), (SubLObject)module0549.NIL, var21, (SubLObject)module0549.UNPROVIDED);
                                    module0012.note_percent_progress(var10, var9);
                                    var9 = Numbers.add(var9, (SubLObject)module0549.ONE_INTEGER);
                                    if (module0549.NIL != module0269.f17710(var21)) {
                                        var4 = Numbers.add(var4, (SubLObject)module0549.ONE_INTEGER);
                                        final SubLObject var23 = module0252.f16245(var3, var21, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED);
                                        final SubLObject var24 = Sequences.length(var23);
                                        f33932(var21, var24);
                                        final SubLObject var25 = f33924(var21);
                                        if (!var25.isZero()) {
                                            SubLObject var26 = var23;
                                            SubLObject var27 = (SubLObject)module0549.NIL;
                                            var27 = var26.first();
                                            while (module0549.NIL != var26) {
                                                f33931(var27, var25);
                                                var26 = var26.rest();
                                                var27 = var26.first();
                                            }
                                        }
                                        f33931(var21, (SubLObject)module0549.ONE_INTEGER);
                                        final SubLObject var28 = f33918(var21);
                                        if (!var28.isZero()) {
                                            SubLObject var26 = var23;
                                            SubLObject var27 = (SubLObject)module0549.NIL;
                                            var27 = var26.first();
                                            while (module0549.NIL != var26) {
                                                f33927(var27, var28);
                                                var26 = var26.rest();
                                                var27 = var26.first();
                                            }
                                        }
                                        final SubLObject var29 = f33921(var21);
                                        if (!var29.isZero()) {
                                            SubLObject var26 = var23;
                                            SubLObject var27 = (SubLObject)module0549.NIL;
                                            var27 = var26.first();
                                            while (module0549.NIL != var26) {
                                                f33929(var27, var29);
                                                var26 = var26.rest();
                                                var27 = var26.first();
                                            }
                                        }
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var19, (SubLObject)module0549.$ic53$);
                            }
                        }
                    }
                }
                finally {
                    module0021.$g777$.rebind(var4_150, var1);
                    module0096.$g1262$.rebind(var3_149, var1);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var12, var1);
                module0012.$g77$.rebind(var11, var1);
                module0012.$g76$.rebind(var4_149, var1);
                module0012.$g75$.rebind(var3_148, var1);
            }
        }
        finally {
            module0147.$g2095$.rebind(var6, var1);
            module0147.$g2094$.rebind(var5, var1);
        }
        return var4;
    }
    
    public static SubLObject f33944() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = (SubLObject)module0549.$ic54$;
        final SubLObject var3 = module0137.f8955(module0549.$ic47$);
        SubLObject var4 = (SubLObject)module0549.ZERO_INTEGER;
        final SubLObject var5 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var1);
        try {
            module0147.$g2094$.bind((SubLObject)module0549.$ic38$, var1);
            module0147.$g2095$.bind(module0549.$ic39$, var1);
            final SubLObject var7 = var2;
            final SubLObject var8 = var3;
            SubLObject var9 = f33942(var8);
            final SubLObject var10 = (SubLObject)module0549.ZERO_INTEGER;
            final SubLObject var3_161 = module0012.$g75$.currentBinding(var1);
            final SubLObject var4_162 = module0012.$g76$.currentBinding(var1);
            final SubLObject var11 = module0012.$g77$.currentBinding(var1);
            final SubLObject var12 = module0012.$g78$.currentBinding(var1);
            try {
                module0012.$g75$.bind((SubLObject)module0549.ZERO_INTEGER, var1);
                module0012.$g76$.bind((SubLObject)module0549.NIL, var1);
                module0012.$g77$.bind((SubLObject)module0549.T, var1);
                module0012.$g78$.bind(Time.get_universal_time(), var1);
                module0012.f478(var7);
                final SubLObject var3_162 = module0096.$g1262$.currentBinding(var1);
                final SubLObject var4_163 = module0021.$g777$.currentBinding(var1);
                try {
                    module0096.$g1262$.bind(module0242.$g2454$.getGlobalValue(), var1);
                    module0021.$g777$.bind((SubLObject)module0549.NIL, var1);
                    module0021.f1151(module0107.f7590());
                    final SubLObject var13 = module0244.f15766(var8);
                    SubLObject var14 = (SubLObject)module0549.NIL;
                    final SubLObject var15 = module0079.f5424(var13);
                    SubLObject var18;
                    for (SubLObject var16 = (SubLObject)module0549.NIL; module0549.NIL == var16; var16 = (SubLObject)SubLObjectFactory.makeBoolean(module0549.NIL == var18)) {
                        var1.resetMultipleValues();
                        final SubLObject var17 = module0052.f3693(var15);
                        var18 = var1.secondMultipleValue();
                        var1.resetMultipleValues();
                        if (module0549.NIL != var18) {
                            SubLObject var20;
                            final SubLObject var19 = var20 = var17;
                            SubLObject var21 = (SubLObject)module0549.NIL;
                            SubLObject var22 = (SubLObject)module0549.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0549.$ic55$);
                            var21 = var20.first();
                            var20 = var20.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0549.$ic55$);
                            var22 = var20.first();
                            var20 = var20.rest();
                            if (module0549.NIL == var20) {
                                if (module0549.NIL == module0096.f6883(var22) || module0549.NIL == module0096.f6910(var22)) {
                                    var14 = module0096.f6925(var13, module0242.$g2449$.getGlobalValue(), (SubLObject)module0549.NIL, var21, (SubLObject)module0549.UNPROVIDED);
                                    module0012.note_percent_progress(var10, var9);
                                    var9 = Numbers.add(var9, (SubLObject)module0549.ONE_INTEGER);
                                    if (module0549.NIL != module0269.f17716(var21)) {
                                        var4 = Numbers.add(var4, (SubLObject)module0549.ONE_INTEGER);
                                        final SubLObject var23 = module0252.f16245(var3, var21, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED);
                                        final SubLObject var24 = Sequences.length(var23);
                                        f33932(var21, var24);
                                        final SubLObject var25 = f33924(var21);
                                        if (!var25.isZero()) {
                                            SubLObject var26 = var23;
                                            SubLObject var27 = (SubLObject)module0549.NIL;
                                            var27 = var26.first();
                                            while (module0549.NIL != var26) {
                                                f33931(var27, var25);
                                                var26 = var26.rest();
                                                var27 = var26.first();
                                            }
                                        }
                                        f33931(var21, (SubLObject)module0549.ONE_INTEGER);
                                        final SubLObject var28 = f33918(var21);
                                        if (!var28.isZero()) {
                                            SubLObject var26 = var23;
                                            SubLObject var27 = (SubLObject)module0549.NIL;
                                            var27 = var26.first();
                                            while (module0549.NIL != var26) {
                                                f33927(var27, var28);
                                                var26 = var26.rest();
                                                var27 = var26.first();
                                            }
                                        }
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var19, (SubLObject)module0549.$ic55$);
                            }
                        }
                    }
                }
                finally {
                    module0021.$g777$.rebind(var4_163, var1);
                    module0096.$g1262$.rebind(var3_162, var1);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var12, var1);
                module0012.$g77$.rebind(var11, var1);
                module0012.$g76$.rebind(var4_162, var1);
                module0012.$g75$.rebind(var3_161, var1);
            }
        }
        finally {
            module0147.$g2095$.rebind(var6, var1);
            module0147.$g2094$.rebind(var5, var1);
        }
        return var4;
    }
    
    public static SubLObject f33945() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = (SubLObject)module0549.$ic56$;
        final SubLObject var3 = module0137.f8955(module0549.$ic49$);
        SubLObject var4 = (SubLObject)module0549.ZERO_INTEGER;
        final SubLObject var5 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var1);
        try {
            module0147.$g2094$.bind((SubLObject)module0549.$ic38$, var1);
            module0147.$g2095$.bind(module0549.$ic39$, var1);
            final SubLObject var7 = var2;
            final SubLObject var8 = var3;
            SubLObject var9 = f33942(var8);
            final SubLObject var10 = (SubLObject)module0549.ZERO_INTEGER;
            final SubLObject var3_170 = module0012.$g75$.currentBinding(var1);
            final SubLObject var4_171 = module0012.$g76$.currentBinding(var1);
            final SubLObject var11 = module0012.$g77$.currentBinding(var1);
            final SubLObject var12 = module0012.$g78$.currentBinding(var1);
            try {
                module0012.$g75$.bind((SubLObject)module0549.ZERO_INTEGER, var1);
                module0012.$g76$.bind((SubLObject)module0549.NIL, var1);
                module0012.$g77$.bind((SubLObject)module0549.T, var1);
                module0012.$g78$.bind(Time.get_universal_time(), var1);
                module0012.f478(var7);
                final SubLObject var3_171 = module0096.$g1262$.currentBinding(var1);
                final SubLObject var4_172 = module0021.$g777$.currentBinding(var1);
                try {
                    module0096.$g1262$.bind(module0242.$g2454$.getGlobalValue(), var1);
                    module0021.$g777$.bind((SubLObject)module0549.NIL, var1);
                    module0021.f1151(module0107.f7590());
                    final SubLObject var13 = module0244.f15766(var8);
                    SubLObject var14 = (SubLObject)module0549.NIL;
                    final SubLObject var15 = module0079.f5424(var13);
                    SubLObject var18;
                    for (SubLObject var16 = (SubLObject)module0549.NIL; module0549.NIL == var16; var16 = (SubLObject)SubLObjectFactory.makeBoolean(module0549.NIL == var18)) {
                        var1.resetMultipleValues();
                        final SubLObject var17 = module0052.f3693(var15);
                        var18 = var1.secondMultipleValue();
                        var1.resetMultipleValues();
                        if (module0549.NIL != var18) {
                            SubLObject var20;
                            final SubLObject var19 = var20 = var17;
                            SubLObject var21 = (SubLObject)module0549.NIL;
                            SubLObject var22 = (SubLObject)module0549.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0549.$ic57$);
                            var21 = var20.first();
                            var20 = var20.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)module0549.$ic57$);
                            var22 = var20.first();
                            var20 = var20.rest();
                            if (module0549.NIL == var20) {
                                if (module0549.NIL == module0096.f6883(var22) || module0549.NIL == module0096.f6910(var22)) {
                                    var14 = module0096.f6925(var13, module0242.$g2449$.getGlobalValue(), (SubLObject)module0549.NIL, var21, (SubLObject)module0549.UNPROVIDED);
                                    module0012.note_percent_progress(var10, var9);
                                    var9 = Numbers.add(var9, (SubLObject)module0549.ONE_INTEGER);
                                    if (module0549.NIL != module0269.f17731(var21)) {
                                        var4 = Numbers.add(var4, (SubLObject)module0549.ONE_INTEGER);
                                        final SubLObject var23 = module0252.f16245(var3, var21, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED);
                                        final SubLObject var24 = Sequences.length(var23);
                                        f33932(var21, var24);
                                        final SubLObject var25 = f33924(var21);
                                        if (!var25.isZero()) {
                                            SubLObject var26 = var23;
                                            SubLObject var27 = (SubLObject)module0549.NIL;
                                            var27 = var26.first();
                                            while (module0549.NIL != var26) {
                                                f33931(var27, var25);
                                                var26 = var26.rest();
                                                var27 = var26.first();
                                            }
                                        }
                                        f33931(var21, (SubLObject)module0549.ONE_INTEGER);
                                        final SubLObject var28 = f33918(var21);
                                        if (!var28.isZero()) {
                                            SubLObject var26 = var23;
                                            SubLObject var27 = (SubLObject)module0549.NIL;
                                            var27 = var26.first();
                                            while (module0549.NIL != var26) {
                                                f33927(var27, var28);
                                                var26 = var26.rest();
                                                var27 = var26.first();
                                            }
                                        }
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var19, (SubLObject)module0549.$ic57$);
                            }
                        }
                    }
                }
                finally {
                    module0021.$g777$.rebind(var4_172, var1);
                    module0096.$g1262$.rebind(var3_171, var1);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var12, var1);
                module0012.$g77$.rebind(var11, var1);
                module0012.$g76$.rebind(var4_171, var1);
                module0012.$g75$.rebind(var3_170, var1);
            }
        }
        finally {
            module0147.$g2095$.rebind(var6, var1);
            module0147.$g2094$.rebind(var5, var1);
        }
        return var4;
    }
    
    public static SubLObject f33917() {
        Hashtables.clrhash(module0549.$g3988$.getGlobalValue());
        return (SubLObject)module0549.NIL;
    }
    
    public static SubLObject f33893() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        f33917();
        final SubLObject var2 = module0549.$g3987$.getGlobalValue();
        module0012.$g82$.setDynamicValue((SubLObject)module0549.$ic58$, var1);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var1);
        module0012.$g83$.setDynamicValue(Hashtables.hash_table_count(var2), var1);
        module0012.$g84$.setDynamicValue((SubLObject)module0549.ZERO_INTEGER, var1);
        final SubLObject var3 = module0012.$g75$.currentBinding(var1);
        final SubLObject var4 = module0012.$g76$.currentBinding(var1);
        final SubLObject var5 = module0012.$g77$.currentBinding(var1);
        final SubLObject var6 = module0012.$g78$.currentBinding(var1);
        try {
            module0012.$g75$.bind((SubLObject)module0549.ZERO_INTEGER, var1);
            module0012.$g76$.bind((SubLObject)module0549.NIL, var1);
            module0012.$g77$.bind((SubLObject)module0549.T, var1);
            module0012.$g78$.bind(Time.get_universal_time(), var1);
            module0012.f478(module0012.$g82$.getDynamicValue(var1));
            SubLObject var7 = (SubLObject)module0549.NIL;
            SubLObject var8 = (SubLObject)module0549.NIL;
            final Iterator var9 = Hashtables.getEntrySetIterator(var2);
            try {
                while (Hashtables.iteratorHasNext(var9)) {
                    final Map.Entry var10 = Hashtables.iteratorNextEntry(var9);
                    var7 = Hashtables.getEntryKey(var10);
                    var8 = Hashtables.getEntryValue(var10);
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var1), module0012.$g83$.getDynamicValue(var1));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var1), (SubLObject)module0549.ONE_INTEGER), var1);
                    f33946(var7);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var9);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var6, var1);
            module0012.$g77$.rebind(var5, var1);
            module0012.$g76$.rebind(var4, var1);
            module0012.$g75$.rebind(var3, var1);
        }
        return (SubLObject)module0549.NIL;
    }
    
    public static SubLObject f33947(final SubLObject var181) {
        module0021.f1038(module0549.$g3981$.getGlobalValue(), var181);
        module0021.f1038(module0549.$g3983$.getGlobalValue(), var181);
        module0021.f1038(module0549.$g3985$.getGlobalValue(), var181);
        module0021.f1038(module0549.$g3982$.getGlobalValue(), var181);
        module0021.f1038(module0549.$g3984$.getGlobalValue(), var181);
        module0021.f1038(module0549.$g3986$.getGlobalValue(), var181);
        module0021.f1038(module0549.$g3987$.getGlobalValue(), var181);
        module0021.f1038(module0549.$g3988$.getGlobalValue(), var181);
        return (SubLObject)module0549.NIL;
    }
    
    public static SubLObject f33948(final SubLObject var181) {
        module0549.$g3981$.setGlobalValue(module0021.f1060(var181, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED));
        module0549.$g3983$.setGlobalValue(module0021.f1060(var181, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED));
        module0549.$g3985$.setGlobalValue(module0021.f1060(var181, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED));
        module0549.$g3982$.setGlobalValue(module0021.f1060(var181, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED));
        module0549.$g3984$.setGlobalValue(module0021.f1060(var181, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED));
        module0549.$g3986$.setGlobalValue(module0021.f1060(var181, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED));
        module0549.$g3987$.setGlobalValue(module0021.f1060(var181, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED));
        module0549.$g3988$.setGlobalValue(module0021.f1060(var181, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED));
        return (SubLObject)module0549.NIL;
    }
    
    public static SubLObject f33949(final SubLObject var88, final SubLObject var158) {
        assert module0549.NIL != module0161.f10482(var88) : var88;
        assert module0549.NIL != module0161.f10482(var158) : var158;
        f33950(var88, var158);
        f33951(var88, var158);
        f33952(var88, var158);
        f33946(var88);
        f33946(var158);
        return (SubLObject)module0549.NIL;
    }
    
    public static SubLObject f33953(final SubLObject var6) {
        Hashtables.remhash(var6, module0549.$g3981$.getGlobalValue());
        Hashtables.remhash(var6, module0549.$g3983$.getGlobalValue());
        Hashtables.remhash(var6, module0549.$g3985$.getGlobalValue());
        Hashtables.remhash(var6, module0549.$g3982$.getGlobalValue());
        Hashtables.remhash(var6, module0549.$g3984$.getGlobalValue());
        Hashtables.remhash(var6, module0549.$g3986$.getGlobalValue());
        Hashtables.remhash(var6, module0549.$g3987$.getGlobalValue());
        Hashtables.remhash(var6, module0549.$g3988$.getGlobalValue());
        return var6;
    }
    
    public static SubLObject f33950(final SubLObject var88, final SubLObject var158) {
        SubLObject var159 = f33896(var88);
        SubLObject var160 = f33896(var158);
        if (var159.numG(var160)) {
            f33926(var158, var159);
        }
        var159 = f33898(var88);
        var160 = f33898(var158);
        if (var159.numG(var160)) {
            f33928(var158, var159);
        }
        return (SubLObject)module0549.NIL;
    }
    
    public static SubLObject f33951(final SubLObject var88, final SubLObject var158) {
        final SubLObject var159 = f33902(var88);
        final SubLObject var160 = f33902(var158);
        final SubLObject var161 = module0048.f_1X(var159);
        if (var161.numG(var160)) {
            f33930(var158, var161);
        }
        return (SubLObject)module0549.NIL;
    }
    
    public static SubLObject f33952(final SubLObject var88, final SubLObject var158) {
        final SubLObject var159 = f33900(var88);
        final SubLObject var160 = f33900(var158);
        final SubLObject var161 = module0048.f_1X(var160);
        if (var161.numG(var159)) {
            f33932(var88, var161);
        }
        return (SubLObject)module0549.NIL;
    }
    
    public static SubLObject f33946(final SubLObject var6) {
        final SubLObject var7 = f33933(var6);
        f33934(var6, var7);
        return var7;
    }
    
    public static SubLObject f33933(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0549.$g3989$.getDynamicValue(var7);
        final SubLObject var9 = Numbers.multiply(var8, f33903(var6));
        final SubLObject var10 = Numbers.max(f33899(var6), (SubLObject)module0549.ONE_INTEGER);
        return Values.values(Numbers.truncate(var9, var10));
    }
    
    public static SubLObject f33954(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0147.$g2094$.currentBinding(var15);
        final SubLObject var17 = module0147.$g2095$.currentBinding(var15);
        try {
            module0147.$g2094$.bind((SubLObject)module0549.$ic38$, var15);
            module0147.$g2095$.bind(module0549.$ic39$, var15);
            SubLObject var18 = var14;
            SubLObject var19 = (SubLObject)module0549.NIL;
            var19 = var18.first();
            while (module0549.NIL != var18) {
                f33920(var19, Sequences.length(Sequences.remove_duplicates(module0259.f16829(var19, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED), (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED)));
                f33923(var19, Sequences.length(Sequences.remove_duplicates(module0259.f16983(var19, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED), (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED)));
                f33926(var19, Sequences.length(module0259.f16848(var19, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED)));
                f33928(var19, Sequences.length(module0259.f16985(var19, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED)));
                final SubLObject var20 = module0244.f15797(var19, (SubLObject)module0549.UNPROVIDED);
                f33925(var19, Sequences.length(module0248.f15933(var20, var19, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED)));
                f33930(var19, Sequences.length(module0252.f16248(var20, var19, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED)));
                f33932(var19, Sequences.length(module0252.f16245(var20, var19, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED)));
                f33946(var19);
                var18 = var18.rest();
                var19 = var18.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var17, var15);
            module0147.$g2094$.rebind(var16, var15);
        }
        return (SubLObject)module0549.NIL;
    }
    
    public static SubLObject f33955(final SubLObject var191, final SubLObject var192) {
        final SubLObject var193 = f33895(var191);
        final SubLObject var194 = f33895(var192);
        final SubLObject var195 = module0048.f_1X(f33901(var191));
        final SubLObject var196 = module0048.f_1X(f33901(var192));
        final SubLObject var197 = Numbers.add(Numbers.multiply(var193, var196), Numbers.multiply(var194, var195), Numbers.multiply(var195, var196));
        return var197;
    }
    
    public static SubLObject f33956(final SubLObject var198, final SubLObject var199) {
        final SubLThread var200 = SubLProcess.currentSubLThread();
        if (module0549.NIL == module0173.f10955(var199)) {
            return (SubLObject)module0549.ZERO_INTEGER;
        }
        SubLObject var201 = (SubLObject)((module0549.NIL != module0269.f17788(var198)) ? module0549.ONE_INTEGER : module0549.ZERO_INTEGER);
        final SubLObject var202 = (SubLObject)module0549.$ic62$;
        final SubLObject var203 = module0056.f4145(var202);
        SubLObject var204 = (SubLObject)module0549.NIL;
        final SubLObject var205 = module0139.$g1635$.currentBinding(var200);
        try {
            module0139.$g1635$.bind(module0139.f9007(), var200);
            final SubLObject var206 = (SubLObject)module0549.NIL;
            final SubLObject var3_205 = module0141.$g1714$.currentBinding(var200);
            final SubLObject var207 = module0141.$g1715$.currentBinding(var200);
            try {
                module0141.$g1714$.bind((module0549.NIL != var206) ? var206 : module0141.f9283(), var200);
                module0141.$g1715$.bind((SubLObject)((module0549.NIL != var206) ? module0549.$ic63$ : module0141.$g1715$.getDynamicValue(var200)), var200);
                if (module0549.NIL != var206 && module0549.NIL != module0136.f8864() && module0549.NIL == module0141.f9279(var206)) {
                    final SubLObject var208 = module0136.$g1591$.getDynamicValue(var200);
                    if (var208.eql((SubLObject)module0549.$ic64$)) {
                        module0136.f8870((SubLObject)module0549.ONE_INTEGER, (SubLObject)module0549.$ic65$, var206, (SubLObject)module0549.$ic66$, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED);
                    }
                    else if (var208.eql((SubLObject)module0549.$ic67$)) {
                        module0136.f8871((SubLObject)module0549.ONE_INTEGER, (SubLObject)module0549.$ic68$, (SubLObject)module0549.$ic65$, var206, (SubLObject)module0549.$ic66$, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED);
                    }
                    else if (var208.eql((SubLObject)module0549.$ic69$)) {
                        Errors.warn((SubLObject)module0549.$ic65$, var206, (SubLObject)module0549.$ic66$);
                    }
                    else {
                        Errors.warn((SubLObject)module0549.$ic70$, module0136.$g1591$.getDynamicValue(var200));
                        Errors.cerror((SubLObject)module0549.$ic68$, (SubLObject)module0549.$ic65$, var206, (SubLObject)module0549.$ic66$);
                    }
                }
                final SubLObject var3_206 = module0141.$g1670$.currentBinding(var200);
                final SubLObject var4_207 = module0141.$g1671$.currentBinding(var200);
                final SubLObject var209 = module0141.$g1672$.currentBinding(var200);
                final SubLObject var210 = module0141.$g1674$.currentBinding(var200);
                final SubLObject var211 = module0137.$g1605$.currentBinding(var200);
                try {
                    module0141.$g1670$.bind(module0137.f8955(module0549.$ic47$), var200);
                    module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0549.$ic47$)), var200);
                    module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0549.$ic47$)), var200);
                    module0141.$g1674$.bind((SubLObject)module0549.NIL, var200);
                    module0137.$g1605$.bind(module0137.f8955(module0549.$ic47$), var200);
                    if (module0549.NIL != module0136.f8865() || module0549.NIL != module0244.f15795(var198, module0137.f8955((SubLObject)module0549.UNPROVIDED))) {
                        final SubLObject var3_207 = module0141.$g1677$.currentBinding(var200);
                        final SubLObject var4_208 = module0138.$g1619$.currentBinding(var200);
                        final SubLObject var5_211 = module0141.$g1674$.currentBinding(var200);
                        try {
                            module0141.$g1677$.bind(module0141.f9210(), var200);
                            module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0549.$ic47$)), var200);
                            module0141.$g1674$.bind((SubLObject)module0549.NIL, var200);
                            module0249.f16055(var198, (SubLObject)module0549.UNPROVIDED);
                            for (var204 = (SubLObject)ConsesLow.list(var198, module0141.f9195()); module0549.NIL != var204; var204 = module0056.f4150(var203)) {
                                final SubLObject var200_212 = var204.first();
                                final SubLObject var212 = conses_high.second(var204);
                                final SubLObject var213 = var200_212;
                                final SubLObject var3_208 = module0141.$g1674$.currentBinding(var200);
                                try {
                                    module0141.$g1674$.bind(var212, var200);
                                    final SubLObject var214 = var212;
                                    if (module0549.NIL != var214) {
                                        var201 = Numbers.add(var201, module0217.f14221(var199, (SubLObject)module0549.ONE_INTEGER, var213, (SubLObject)module0549.UNPROVIDED));
                                    }
                                    else {
                                        var201 = Numbers.add(var201, module0217.f14221(var199, (SubLObject)module0549.TWO_INTEGER, var213, (SubLObject)module0549.UNPROVIDED));
                                    }
                                    SubLObject var216;
                                    final SubLObject var215 = var216 = module0200.f12443(module0137.f8955(module0549.$ic47$));
                                    SubLObject var217 = (SubLObject)module0549.NIL;
                                    var217 = var216.first();
                                    while (module0549.NIL != var216) {
                                        final SubLObject var3_209 = module0137.$g1605$.currentBinding(var200);
                                        final SubLObject var4_209 = module0141.$g1674$.currentBinding(var200);
                                        try {
                                            module0137.$g1605$.bind(var217, var200);
                                            module0141.$g1674$.bind((SubLObject)((module0549.NIL != module0141.f9205((SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0549.NIL == module0141.$g1674$.getDynamicValue(var200)) : module0141.$g1674$.getDynamicValue(var200)), var200);
                                            final SubLObject var220_221 = module0228.f15229(var200_212);
                                            if (module0549.NIL != module0138.f8992(var220_221)) {
                                                final SubLObject var218 = module0242.f15664(var220_221, module0137.f8955((SubLObject)module0549.UNPROVIDED));
                                                if (module0549.NIL != var218) {
                                                    final SubLObject var219 = module0245.f15834(var218, module0138.f8979(), module0137.f8955((SubLObject)module0549.UNPROVIDED));
                                                    if (module0549.NIL != var219) {
                                                        SubLObject var220;
                                                        for (var220 = module0066.f4838(module0067.f4891(var219)); module0549.NIL == module0066.f4841(var220); var220 = module0066.f4840(var220)) {
                                                            var200.resetMultipleValues();
                                                            final SubLObject var221 = module0066.f4839(var220);
                                                            final SubLObject var222 = var200.secondMultipleValue();
                                                            var200.resetMultipleValues();
                                                            if (module0549.NIL != module0147.f9507(var221)) {
                                                                final SubLObject var3_210 = module0138.$g1623$.currentBinding(var200);
                                                                try {
                                                                    module0138.$g1623$.bind(var221, var200);
                                                                    SubLObject var78_227;
                                                                    for (var78_227 = module0066.f4838(module0067.f4891(var222)); module0549.NIL == module0066.f4841(var78_227); var78_227 = module0066.f4840(var78_227)) {
                                                                        var200.resetMultipleValues();
                                                                        final SubLObject var223 = module0066.f4839(var78_227);
                                                                        final SubLObject var224 = var200.secondMultipleValue();
                                                                        var200.resetMultipleValues();
                                                                        if (module0549.NIL != module0141.f9289(var223)) {
                                                                            final SubLObject var3_211 = module0138.$g1624$.currentBinding(var200);
                                                                            try {
                                                                                module0138.$g1624$.bind(var223, var200);
                                                                                final SubLObject var225 = var224;
                                                                                if (module0549.NIL != module0077.f5302(var225)) {
                                                                                    final SubLObject var226 = module0077.f5333(var225);
                                                                                    SubLObject var227;
                                                                                    SubLObject var228;
                                                                                    SubLObject var229;
                                                                                    for (var227 = module0032.f1741(var226), var228 = (SubLObject)module0549.NIL, var228 = module0032.f1742(var227, var226); module0549.NIL == module0032.f1744(var227, var228); var228 = module0032.f1743(var228)) {
                                                                                        var229 = module0032.f1745(var227, var228);
                                                                                        if (module0549.NIL != module0032.f1746(var228, var229) && module0549.NIL == module0249.f16059(var229, (SubLObject)module0549.UNPROVIDED)) {
                                                                                            module0249.f16055(var229, (SubLObject)module0549.UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var229, module0141.f9195()), var203);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var225.isList()) {
                                                                                    SubLObject var230 = var225;
                                                                                    SubLObject var231 = (SubLObject)module0549.NIL;
                                                                                    var231 = var230.first();
                                                                                    while (module0549.NIL != var230) {
                                                                                        if (module0549.NIL == module0249.f16059(var231, (SubLObject)module0549.UNPROVIDED)) {
                                                                                            module0249.f16055(var231, (SubLObject)module0549.UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var231, module0141.f9195()), var203);
                                                                                        }
                                                                                        var230 = var230.rest();
                                                                                        var231 = var230.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0549.$ic41$, var225);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var3_211, var200);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var78_227);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var3_210, var200);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var220);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0549.FIVE_INTEGER, (SubLObject)module0549.$ic71$, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED);
                                                }
                                            }
                                            else if (module0549.NIL != module0155.f9785(var220_221, (SubLObject)module0549.UNPROVIDED)) {
                                                SubLObject var75_233;
                                                final SubLObject var232 = var75_233 = ((module0549.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var200), module0137.f8955((SubLObject)module0549.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var200), module0137.f8955((SubLObject)module0549.UNPROVIDED)));
                                                SubLObject var233 = (SubLObject)module0549.NIL;
                                                var233 = var75_233.first();
                                                while (module0549.NIL != var75_233) {
                                                    final SubLObject var3_212 = module0138.$g1625$.currentBinding(var200);
                                                    try {
                                                        module0138.$g1625$.bind(var233, var200);
                                                        final SubLObject var235;
                                                        final SubLObject var234 = var235 = Functions.funcall(var233, var220_221);
                                                        if (module0549.NIL != module0077.f5302(var235)) {
                                                            final SubLObject var236 = module0077.f5333(var235);
                                                            SubLObject var237;
                                                            SubLObject var238;
                                                            SubLObject var239;
                                                            for (var237 = module0032.f1741(var236), var238 = (SubLObject)module0549.NIL, var238 = module0032.f1742(var237, var236); module0549.NIL == module0032.f1744(var237, var238); var238 = module0032.f1743(var238)) {
                                                                var239 = module0032.f1745(var237, var238);
                                                                if (module0549.NIL != module0032.f1746(var238, var239) && module0549.NIL == module0249.f16059(var239, (SubLObject)module0549.UNPROVIDED)) {
                                                                    module0249.f16055(var239, (SubLObject)module0549.UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var239, module0141.f9195()), var203);
                                                                }
                                                            }
                                                        }
                                                        else if (var235.isList()) {
                                                            SubLObject var240 = var235;
                                                            SubLObject var241 = (SubLObject)module0549.NIL;
                                                            var241 = var240.first();
                                                            while (module0549.NIL != var240) {
                                                                if (module0549.NIL == module0249.f16059(var241, (SubLObject)module0549.UNPROVIDED)) {
                                                                    module0249.f16055(var241, (SubLObject)module0549.UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var241, module0141.f9195()), var203);
                                                                }
                                                                var240 = var240.rest();
                                                                var241 = var240.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0549.$ic41$, var235);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var3_212, var200);
                                                    }
                                                    var75_233 = var75_233.rest();
                                                    var233 = var75_233.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var4_209, var200);
                                            module0137.$g1605$.rebind(var3_209, var200);
                                        }
                                        var216 = var216.rest();
                                        var217 = var216.first();
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var3_208, var200);
                                }
                            }
                        }
                        finally {
                            module0141.$g1674$.rebind(var5_211, var200);
                            module0138.$g1619$.rebind(var4_208, var200);
                            module0141.$g1677$.rebind(var3_207, var200);
                        }
                    }
                    else {
                        module0136.f8872((SubLObject)module0549.TWO_INTEGER, (SubLObject)module0549.$ic72$, var198, module0244.f15748(module0137.f8955((SubLObject)module0549.UNPROVIDED)), (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED);
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var211, var200);
                    module0141.$g1674$.rebind(var210, var200);
                    module0141.$g1672$.rebind(var209, var200);
                    module0141.$g1671$.rebind(var4_207, var200);
                    module0141.$g1670$.rebind(var3_206, var200);
                }
            }
            finally {
                module0141.$g1715$.rebind(var207, var200);
                module0141.$g1714$.rebind(var3_205, var200);
            }
            module0139.f9011(module0139.$g1635$.getDynamicValue(var200));
        }
        finally {
            module0139.$g1635$.rebind(var205, var200);
        }
        return var201;
    }
    
    public static SubLObject f33957(final SubLObject var198, final SubLObject var199) {
        final SubLThread var200 = SubLProcess.currentSubLThread();
        if (module0549.NIL == module0173.f10955(var199)) {
            return (SubLObject)module0549.ZERO_INTEGER;
        }
        SubLObject var201 = (SubLObject)((module0549.NIL != module0269.f17788(var198)) ? module0549.ONE_INTEGER : module0549.ZERO_INTEGER);
        final SubLObject var202 = (SubLObject)module0549.$ic62$;
        final SubLObject var203 = module0056.f4145(var202);
        SubLObject var204 = (SubLObject)module0549.NIL;
        final SubLObject var205 = module0139.$g1635$.currentBinding(var200);
        try {
            module0139.$g1635$.bind(module0139.f9007(), var200);
            final SubLObject var206 = (SubLObject)module0549.NIL;
            final SubLObject var3_236 = module0141.$g1714$.currentBinding(var200);
            final SubLObject var207 = module0141.$g1715$.currentBinding(var200);
            try {
                module0141.$g1714$.bind((module0549.NIL != var206) ? var206 : module0141.f9283(), var200);
                module0141.$g1715$.bind((SubLObject)((module0549.NIL != var206) ? module0549.$ic63$ : module0141.$g1715$.getDynamicValue(var200)), var200);
                if (module0549.NIL != var206 && module0549.NIL != module0136.f8864() && module0549.NIL == module0141.f9279(var206)) {
                    final SubLObject var208 = module0136.$g1591$.getDynamicValue(var200);
                    if (var208.eql((SubLObject)module0549.$ic64$)) {
                        module0136.f8870((SubLObject)module0549.ONE_INTEGER, (SubLObject)module0549.$ic65$, var206, (SubLObject)module0549.$ic66$, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED);
                    }
                    else if (var208.eql((SubLObject)module0549.$ic67$)) {
                        module0136.f8871((SubLObject)module0549.ONE_INTEGER, (SubLObject)module0549.$ic68$, (SubLObject)module0549.$ic65$, var206, (SubLObject)module0549.$ic66$, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED);
                    }
                    else if (var208.eql((SubLObject)module0549.$ic69$)) {
                        Errors.warn((SubLObject)module0549.$ic65$, var206, (SubLObject)module0549.$ic66$);
                    }
                    else {
                        Errors.warn((SubLObject)module0549.$ic70$, module0136.$g1591$.getDynamicValue(var200));
                        Errors.cerror((SubLObject)module0549.$ic68$, (SubLObject)module0549.$ic65$, var206, (SubLObject)module0549.$ic66$);
                    }
                }
                final SubLObject var3_237 = module0141.$g1670$.currentBinding(var200);
                final SubLObject var4_238 = module0141.$g1671$.currentBinding(var200);
                final SubLObject var209 = module0141.$g1672$.currentBinding(var200);
                final SubLObject var210 = module0141.$g1674$.currentBinding(var200);
                final SubLObject var211 = module0137.$g1605$.currentBinding(var200);
                try {
                    module0141.$g1670$.bind(module0137.f8955(module0549.$ic47$), var200);
                    module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0549.$ic47$)), var200);
                    module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0549.$ic47$)), var200);
                    module0141.$g1674$.bind((SubLObject)module0549.NIL, var200);
                    module0137.$g1605$.bind(module0137.f8955(module0549.$ic47$), var200);
                    if (module0549.NIL != module0136.f8865() || module0549.NIL != module0244.f15795(var198, module0137.f8955((SubLObject)module0549.UNPROVIDED))) {
                        final SubLObject var3_238 = module0141.$g1677$.currentBinding(var200);
                        final SubLObject var4_239 = module0138.$g1619$.currentBinding(var200);
                        final SubLObject var5_241 = module0141.$g1674$.currentBinding(var200);
                        try {
                            module0141.$g1677$.bind(module0141.f9210(), var200);
                            module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0549.$ic47$)), var200);
                            module0141.$g1674$.bind((SubLObject)module0549.NIL, var200);
                            module0249.f16055(var198, (SubLObject)module0549.UNPROVIDED);
                            for (var204 = (SubLObject)ConsesLow.list(var198, module0141.f9195()); module0549.NIL != var204; var204 = module0056.f4150(var203)) {
                                final SubLObject var200_242 = var204.first();
                                final SubLObject var212 = conses_high.second(var204);
                                final SubLObject var213 = var200_242;
                                final SubLObject var3_239 = module0141.$g1674$.currentBinding(var200);
                                try {
                                    module0141.$g1674$.bind(var212, var200);
                                    final SubLObject var214 = var212;
                                    if (module0549.NIL != var214) {
                                        var201 = Numbers.add(var201, module0217.f14221(var199, (SubLObject)module0549.TWO_INTEGER, var213, (SubLObject)module0549.UNPROVIDED));
                                    }
                                    else {
                                        var201 = Numbers.add(var201, module0217.f14221(var199, (SubLObject)module0549.ONE_INTEGER, var213, (SubLObject)module0549.UNPROVIDED));
                                    }
                                    SubLObject var216;
                                    final SubLObject var215 = var216 = module0200.f12443(module0137.f8955(module0549.$ic47$));
                                    SubLObject var217 = (SubLObject)module0549.NIL;
                                    var217 = var216.first();
                                    while (module0549.NIL != var216) {
                                        final SubLObject var3_240 = module0137.$g1605$.currentBinding(var200);
                                        final SubLObject var4_240 = module0141.$g1674$.currentBinding(var200);
                                        try {
                                            module0137.$g1605$.bind(var217, var200);
                                            module0141.$g1674$.bind((SubLObject)((module0549.NIL != module0141.f9205((SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0549.NIL == module0141.$g1674$.getDynamicValue(var200)) : module0141.$g1674$.getDynamicValue(var200)), var200);
                                            final SubLObject var220_246 = module0228.f15229(var200_242);
                                            if (module0549.NIL != module0138.f8992(var220_246)) {
                                                final SubLObject var218 = module0242.f15664(var220_246, module0137.f8955((SubLObject)module0549.UNPROVIDED));
                                                if (module0549.NIL != var218) {
                                                    final SubLObject var219 = module0245.f15834(var218, module0138.f8979(), module0137.f8955((SubLObject)module0549.UNPROVIDED));
                                                    if (module0549.NIL != var219) {
                                                        SubLObject var220;
                                                        for (var220 = module0066.f4838(module0067.f4891(var219)); module0549.NIL == module0066.f4841(var220); var220 = module0066.f4840(var220)) {
                                                            var200.resetMultipleValues();
                                                            final SubLObject var221 = module0066.f4839(var220);
                                                            final SubLObject var222 = var200.secondMultipleValue();
                                                            var200.resetMultipleValues();
                                                            if (module0549.NIL != module0147.f9507(var221)) {
                                                                final SubLObject var3_241 = module0138.$g1623$.currentBinding(var200);
                                                                try {
                                                                    module0138.$g1623$.bind(var221, var200);
                                                                    SubLObject var78_248;
                                                                    for (var78_248 = module0066.f4838(module0067.f4891(var222)); module0549.NIL == module0066.f4841(var78_248); var78_248 = module0066.f4840(var78_248)) {
                                                                        var200.resetMultipleValues();
                                                                        final SubLObject var223 = module0066.f4839(var78_248);
                                                                        final SubLObject var224 = var200.secondMultipleValue();
                                                                        var200.resetMultipleValues();
                                                                        if (module0549.NIL != module0141.f9289(var223)) {
                                                                            final SubLObject var3_242 = module0138.$g1624$.currentBinding(var200);
                                                                            try {
                                                                                module0138.$g1624$.bind(var223, var200);
                                                                                final SubLObject var225 = var224;
                                                                                if (module0549.NIL != module0077.f5302(var225)) {
                                                                                    final SubLObject var226 = module0077.f5333(var225);
                                                                                    SubLObject var227;
                                                                                    SubLObject var228;
                                                                                    SubLObject var229;
                                                                                    for (var227 = module0032.f1741(var226), var228 = (SubLObject)module0549.NIL, var228 = module0032.f1742(var227, var226); module0549.NIL == module0032.f1744(var227, var228); var228 = module0032.f1743(var228)) {
                                                                                        var229 = module0032.f1745(var227, var228);
                                                                                        if (module0549.NIL != module0032.f1746(var228, var229) && module0549.NIL == module0249.f16059(var229, (SubLObject)module0549.UNPROVIDED)) {
                                                                                            module0249.f16055(var229, (SubLObject)module0549.UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var229, module0141.f9195()), var203);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var225.isList()) {
                                                                                    SubLObject var230 = var225;
                                                                                    SubLObject var231 = (SubLObject)module0549.NIL;
                                                                                    var231 = var230.first();
                                                                                    while (module0549.NIL != var230) {
                                                                                        if (module0549.NIL == module0249.f16059(var231, (SubLObject)module0549.UNPROVIDED)) {
                                                                                            module0249.f16055(var231, (SubLObject)module0549.UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var231, module0141.f9195()), var203);
                                                                                        }
                                                                                        var230 = var230.rest();
                                                                                        var231 = var230.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0549.$ic41$, var225);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var3_242, var200);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var78_248);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var3_241, var200);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var220);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0549.FIVE_INTEGER, (SubLObject)module0549.$ic71$, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED);
                                                }
                                            }
                                            else if (module0549.NIL != module0155.f9785(var220_246, (SubLObject)module0549.UNPROVIDED)) {
                                                SubLObject var75_250;
                                                final SubLObject var232 = var75_250 = ((module0549.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var200), module0137.f8955((SubLObject)module0549.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var200), module0137.f8955((SubLObject)module0549.UNPROVIDED)));
                                                SubLObject var233 = (SubLObject)module0549.NIL;
                                                var233 = var75_250.first();
                                                while (module0549.NIL != var75_250) {
                                                    final SubLObject var3_243 = module0138.$g1625$.currentBinding(var200);
                                                    try {
                                                        module0138.$g1625$.bind(var233, var200);
                                                        final SubLObject var235;
                                                        final SubLObject var234 = var235 = Functions.funcall(var233, var220_246);
                                                        if (module0549.NIL != module0077.f5302(var235)) {
                                                            final SubLObject var236 = module0077.f5333(var235);
                                                            SubLObject var237;
                                                            SubLObject var238;
                                                            SubLObject var239;
                                                            for (var237 = module0032.f1741(var236), var238 = (SubLObject)module0549.NIL, var238 = module0032.f1742(var237, var236); module0549.NIL == module0032.f1744(var237, var238); var238 = module0032.f1743(var238)) {
                                                                var239 = module0032.f1745(var237, var238);
                                                                if (module0549.NIL != module0032.f1746(var238, var239) && module0549.NIL == module0249.f16059(var239, (SubLObject)module0549.UNPROVIDED)) {
                                                                    module0249.f16055(var239, (SubLObject)module0549.UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var239, module0141.f9195()), var203);
                                                                }
                                                            }
                                                        }
                                                        else if (var235.isList()) {
                                                            SubLObject var240 = var235;
                                                            SubLObject var241 = (SubLObject)module0549.NIL;
                                                            var241 = var240.first();
                                                            while (module0549.NIL != var240) {
                                                                if (module0549.NIL == module0249.f16059(var241, (SubLObject)module0549.UNPROVIDED)) {
                                                                    module0249.f16055(var241, (SubLObject)module0549.UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var241, module0141.f9195()), var203);
                                                                }
                                                                var240 = var240.rest();
                                                                var241 = var240.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0549.$ic41$, var235);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var3_243, var200);
                                                    }
                                                    var75_250 = var75_250.rest();
                                                    var233 = var75_250.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var4_240, var200);
                                            module0137.$g1605$.rebind(var3_240, var200);
                                        }
                                        var216 = var216.rest();
                                        var217 = var216.first();
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var3_239, var200);
                                }
                            }
                        }
                        finally {
                            module0141.$g1674$.rebind(var5_241, var200);
                            module0138.$g1619$.rebind(var4_239, var200);
                            module0141.$g1677$.rebind(var3_238, var200);
                        }
                    }
                    else {
                        module0136.f8872((SubLObject)module0549.TWO_INTEGER, (SubLObject)module0549.$ic72$, var198, module0244.f15748(module0137.f8955((SubLObject)module0549.UNPROVIDED)), (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED);
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var211, var200);
                    module0141.$g1674$.rebind(var210, var200);
                    module0141.$g1672$.rebind(var209, var200);
                    module0141.$g1671$.rebind(var4_238, var200);
                    module0141.$g1670$.rebind(var3_237, var200);
                }
            }
            finally {
                module0141.$g1715$.rebind(var207, var200);
                module0141.$g1714$.rebind(var3_236, var200);
            }
            module0139.f9011(module0139.$g1635$.getDynamicValue(var200));
        }
        finally {
            module0139.$g1635$.rebind(var205, var200);
        }
        return var201;
    }
    
    public static SubLObject f33958(final SubLObject var198) {
        final SubLThread var199 = SubLProcess.currentSubLThread();
        if (module0549.NIL == module0173.f10955(var198)) {
            return (SubLObject)module0549.ZERO_INTEGER;
        }
        SubLObject var200 = (SubLObject)module0549.ZERO_INTEGER;
        final SubLObject var201 = (SubLObject)module0549.$ic62$;
        final SubLObject var202 = module0056.f4145(var201);
        SubLObject var203 = (SubLObject)module0549.NIL;
        final SubLObject var204 = module0139.$g1635$.currentBinding(var199);
        try {
            module0139.$g1635$.bind(module0139.f9007(), var199);
            final SubLObject var205 = (SubLObject)module0549.NIL;
            final SubLObject var3_252 = module0141.$g1714$.currentBinding(var199);
            final SubLObject var206 = module0141.$g1715$.currentBinding(var199);
            try {
                module0141.$g1714$.bind((module0549.NIL != var205) ? var205 : module0141.f9283(), var199);
                module0141.$g1715$.bind((SubLObject)((module0549.NIL != var205) ? module0549.$ic63$ : module0141.$g1715$.getDynamicValue(var199)), var199);
                if (module0549.NIL != var205 && module0549.NIL != module0136.f8864() && module0549.NIL == module0141.f9279(var205)) {
                    final SubLObject var207 = module0136.$g1591$.getDynamicValue(var199);
                    if (var207.eql((SubLObject)module0549.$ic64$)) {
                        module0136.f8870((SubLObject)module0549.ONE_INTEGER, (SubLObject)module0549.$ic65$, var205, (SubLObject)module0549.$ic66$, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED);
                    }
                    else if (var207.eql((SubLObject)module0549.$ic67$)) {
                        module0136.f8871((SubLObject)module0549.ONE_INTEGER, (SubLObject)module0549.$ic68$, (SubLObject)module0549.$ic65$, var205, (SubLObject)module0549.$ic66$, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED);
                    }
                    else if (var207.eql((SubLObject)module0549.$ic69$)) {
                        Errors.warn((SubLObject)module0549.$ic65$, var205, (SubLObject)module0549.$ic66$);
                    }
                    else {
                        Errors.warn((SubLObject)module0549.$ic70$, module0136.$g1591$.getDynamicValue(var199));
                        Errors.cerror((SubLObject)module0549.$ic68$, (SubLObject)module0549.$ic65$, var205, (SubLObject)module0549.$ic66$);
                    }
                }
                final SubLObject var3_253 = module0141.$g1670$.currentBinding(var199);
                final SubLObject var4_254 = module0141.$g1671$.currentBinding(var199);
                final SubLObject var208 = module0141.$g1672$.currentBinding(var199);
                final SubLObject var209 = module0141.$g1674$.currentBinding(var199);
                final SubLObject var210 = module0137.$g1605$.currentBinding(var199);
                try {
                    module0141.$g1670$.bind(module0137.f8955(module0549.$ic47$), var199);
                    module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0549.$ic47$)), var199);
                    module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0549.$ic47$)), var199);
                    module0141.$g1674$.bind((SubLObject)module0549.NIL, var199);
                    module0137.$g1605$.bind(module0137.f8955(module0549.$ic47$), var199);
                    if (module0549.NIL != module0136.f8865() || module0549.NIL != module0244.f15795(var198, module0137.f8955((SubLObject)module0549.UNPROVIDED))) {
                        final SubLObject var3_254 = module0141.$g1677$.currentBinding(var199);
                        final SubLObject var4_255 = module0138.$g1619$.currentBinding(var199);
                        final SubLObject var5_257 = module0141.$g1674$.currentBinding(var199);
                        try {
                            module0141.$g1677$.bind(module0141.f9210(), var199);
                            module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0549.$ic47$)), var199);
                            module0141.$g1674$.bind((SubLObject)module0549.NIL, var199);
                            module0249.f16055(var198, (SubLObject)module0549.UNPROVIDED);
                            for (var203 = (SubLObject)ConsesLow.list(var198, module0141.f9195()); module0549.NIL != var203; var203 = module0056.f4150(var202)) {
                                final SubLObject var200_258 = var203.first();
                                final SubLObject var211 = conses_high.second(var203);
                                final SubLObject var212 = var200_258;
                                final SubLObject var3_255 = module0141.$g1674$.currentBinding(var199);
                                try {
                                    module0141.$g1674$.bind(var211, var199);
                                    final SubLObject var213 = var211;
                                    var200 = Numbers.add(var200, module0217.f14247(var212, (SubLObject)module0549.UNPROVIDED));
                                    SubLObject var215;
                                    final SubLObject var214 = var215 = module0200.f12443(module0137.f8955(module0549.$ic47$));
                                    SubLObject var216 = (SubLObject)module0549.NIL;
                                    var216 = var215.first();
                                    while (module0549.NIL != var215) {
                                        final SubLObject var3_256 = module0137.$g1605$.currentBinding(var199);
                                        final SubLObject var4_256 = module0141.$g1674$.currentBinding(var199);
                                        try {
                                            module0137.$g1605$.bind(var216, var199);
                                            module0141.$g1674$.bind((SubLObject)((module0549.NIL != module0141.f9205((SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0549.NIL == module0141.$g1674$.getDynamicValue(var199)) : module0141.$g1674$.getDynamicValue(var199)), var199);
                                            final SubLObject var217 = module0228.f15229(var200_258);
                                            if (module0549.NIL != module0138.f8992(var217)) {
                                                final SubLObject var218 = module0242.f15664(var217, module0137.f8955((SubLObject)module0549.UNPROVIDED));
                                                if (module0549.NIL != var218) {
                                                    final SubLObject var219 = module0245.f15834(var218, module0138.f8979(), module0137.f8955((SubLObject)module0549.UNPROVIDED));
                                                    if (module0549.NIL != var219) {
                                                        SubLObject var220;
                                                        for (var220 = module0066.f4838(module0067.f4891(var219)); module0549.NIL == module0066.f4841(var220); var220 = module0066.f4840(var220)) {
                                                            var199.resetMultipleValues();
                                                            final SubLObject var221 = module0066.f4839(var220);
                                                            final SubLObject var222 = var199.secondMultipleValue();
                                                            var199.resetMultipleValues();
                                                            if (module0549.NIL != module0147.f9507(var221)) {
                                                                final SubLObject var3_257 = module0138.$g1623$.currentBinding(var199);
                                                                try {
                                                                    module0138.$g1623$.bind(var221, var199);
                                                                    SubLObject var78_263;
                                                                    for (var78_263 = module0066.f4838(module0067.f4891(var222)); module0549.NIL == module0066.f4841(var78_263); var78_263 = module0066.f4840(var78_263)) {
                                                                        var199.resetMultipleValues();
                                                                        final SubLObject var223 = module0066.f4839(var78_263);
                                                                        final SubLObject var224 = var199.secondMultipleValue();
                                                                        var199.resetMultipleValues();
                                                                        if (module0549.NIL != module0141.f9289(var223)) {
                                                                            final SubLObject var3_258 = module0138.$g1624$.currentBinding(var199);
                                                                            try {
                                                                                module0138.$g1624$.bind(var223, var199);
                                                                                final SubLObject var225 = var224;
                                                                                if (module0549.NIL != module0077.f5302(var225)) {
                                                                                    final SubLObject var226 = module0077.f5333(var225);
                                                                                    SubLObject var227;
                                                                                    SubLObject var228;
                                                                                    SubLObject var229;
                                                                                    for (var227 = module0032.f1741(var226), var228 = (SubLObject)module0549.NIL, var228 = module0032.f1742(var227, var226); module0549.NIL == module0032.f1744(var227, var228); var228 = module0032.f1743(var228)) {
                                                                                        var229 = module0032.f1745(var227, var228);
                                                                                        if (module0549.NIL != module0032.f1746(var228, var229) && module0549.NIL == module0249.f16059(var229, (SubLObject)module0549.UNPROVIDED)) {
                                                                                            module0249.f16055(var229, (SubLObject)module0549.UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var229, module0141.f9195()), var202);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var225.isList()) {
                                                                                    SubLObject var230 = var225;
                                                                                    SubLObject var231 = (SubLObject)module0549.NIL;
                                                                                    var231 = var230.first();
                                                                                    while (module0549.NIL != var230) {
                                                                                        if (module0549.NIL == module0249.f16059(var231, (SubLObject)module0549.UNPROVIDED)) {
                                                                                            module0249.f16055(var231, (SubLObject)module0549.UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var231, module0141.f9195()), var202);
                                                                                        }
                                                                                        var230 = var230.rest();
                                                                                        var231 = var230.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0549.$ic41$, var225);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var3_258, var199);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var78_263);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var3_257, var199);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var220);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0549.FIVE_INTEGER, (SubLObject)module0549.$ic71$, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED);
                                                }
                                            }
                                            else if (module0549.NIL != module0155.f9785(var217, (SubLObject)module0549.UNPROVIDED)) {
                                                SubLObject var75_265;
                                                final SubLObject var232 = var75_265 = ((module0549.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var199), module0137.f8955((SubLObject)module0549.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var199), module0137.f8955((SubLObject)module0549.UNPROVIDED)));
                                                SubLObject var233 = (SubLObject)module0549.NIL;
                                                var233 = var75_265.first();
                                                while (module0549.NIL != var75_265) {
                                                    final SubLObject var3_259 = module0138.$g1625$.currentBinding(var199);
                                                    try {
                                                        module0138.$g1625$.bind(var233, var199);
                                                        final SubLObject var235;
                                                        final SubLObject var234 = var235 = Functions.funcall(var233, var217);
                                                        if (module0549.NIL != module0077.f5302(var235)) {
                                                            final SubLObject var236 = module0077.f5333(var235);
                                                            SubLObject var237;
                                                            SubLObject var238;
                                                            SubLObject var239;
                                                            for (var237 = module0032.f1741(var236), var238 = (SubLObject)module0549.NIL, var238 = module0032.f1742(var237, var236); module0549.NIL == module0032.f1744(var237, var238); var238 = module0032.f1743(var238)) {
                                                                var239 = module0032.f1745(var237, var238);
                                                                if (module0549.NIL != module0032.f1746(var238, var239) && module0549.NIL == module0249.f16059(var239, (SubLObject)module0549.UNPROVIDED)) {
                                                                    module0249.f16055(var239, (SubLObject)module0549.UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var239, module0141.f9195()), var202);
                                                                }
                                                            }
                                                        }
                                                        else if (var235.isList()) {
                                                            SubLObject var240 = var235;
                                                            SubLObject var241 = (SubLObject)module0549.NIL;
                                                            var241 = var240.first();
                                                            while (module0549.NIL != var240) {
                                                                if (module0549.NIL == module0249.f16059(var241, (SubLObject)module0549.UNPROVIDED)) {
                                                                    module0249.f16055(var241, (SubLObject)module0549.UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var241, module0141.f9195()), var202);
                                                                }
                                                                var240 = var240.rest();
                                                                var241 = var240.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0549.$ic41$, var235);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var3_259, var199);
                                                    }
                                                    var75_265 = var75_265.rest();
                                                    var233 = var75_265.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var4_256, var199);
                                            module0137.$g1605$.rebind(var3_256, var199);
                                        }
                                        var215 = var215.rest();
                                        var216 = var215.first();
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var3_255, var199);
                                }
                            }
                        }
                        finally {
                            module0141.$g1674$.rebind(var5_257, var199);
                            module0138.$g1619$.rebind(var4_255, var199);
                            module0141.$g1677$.rebind(var3_254, var199);
                        }
                    }
                    else {
                        module0136.f8872((SubLObject)module0549.TWO_INTEGER, (SubLObject)module0549.$ic72$, var198, module0244.f15748(module0137.f8955((SubLObject)module0549.UNPROVIDED)), (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED);
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var210, var199);
                    module0141.$g1674$.rebind(var209, var199);
                    module0141.$g1672$.rebind(var208, var199);
                    module0141.$g1671$.rebind(var4_254, var199);
                    module0141.$g1670$.rebind(var3_253, var199);
                }
            }
            finally {
                module0141.$g1715$.rebind(var206, var199);
                module0141.$g1714$.rebind(var3_252, var199);
            }
            module0139.f9011(module0139.$g1635$.getDynamicValue(var199));
        }
        finally {
            module0139.$g1635$.rebind(var204, var199);
        }
        return var200;
    }
    
    public static SubLObject f33959(final SubLObject var154, SubLObject var79) {
        if (var79 == module0549.UNPROVIDED) {
            var79 = (SubLObject)module0549.NIL;
        }
        final SubLThread var155 = SubLProcess.currentSubLThread();
        SubLObject var156 = (SubLObject)module0549.ZERO_INTEGER;
        final SubLObject var157 = var79;
        final SubLObject var158 = module0147.$g2095$.currentBinding(var155);
        final SubLObject var159 = module0147.$g2094$.currentBinding(var155);
        final SubLObject var160 = module0147.$g2096$.currentBinding(var155);
        try {
            module0147.$g2095$.bind(module0147.f9545(var157), var155);
            module0147.$g2094$.bind(module0147.f9546(var157), var155);
            module0147.$g2096$.bind(module0147.f9549(var157), var155);
            final SubLObject var161 = module0077.f5313(Symbols.symbol_function((SubLObject)module0549.EQL), (SubLObject)module0549.UNPROVIDED);
            SubLObject var162 = var154;
            final SubLObject var163 = (SubLObject)module0549.$ic61$;
            final SubLObject var164 = module0056.f4145(var163);
            final SubLObject var3_272 = module0139.$g1635$.currentBinding(var155);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var155);
                final SubLObject var165 = (SubLObject)module0549.NIL;
                final SubLObject var3_273 = module0141.$g1714$.currentBinding(var155);
                final SubLObject var4_274 = module0141.$g1715$.currentBinding(var155);
                try {
                    module0141.$g1714$.bind((module0549.NIL != var165) ? var165 : module0141.f9283(), var155);
                    module0141.$g1715$.bind((SubLObject)((module0549.NIL != var165) ? module0549.$ic63$ : module0141.$g1715$.getDynamicValue(var155)), var155);
                    if (module0549.NIL != var165 && module0549.NIL != module0136.f8864() && module0549.NIL == module0141.f9279(var165)) {
                        final SubLObject var166 = module0136.$g1591$.getDynamicValue(var155);
                        if (var166.eql((SubLObject)module0549.$ic64$)) {
                            module0136.f8870((SubLObject)module0549.ONE_INTEGER, (SubLObject)module0549.$ic65$, var165, (SubLObject)module0549.$ic66$, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED);
                        }
                        else if (var166.eql((SubLObject)module0549.$ic67$)) {
                            module0136.f8871((SubLObject)module0549.ONE_INTEGER, (SubLObject)module0549.$ic68$, (SubLObject)module0549.$ic65$, var165, (SubLObject)module0549.$ic66$, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED);
                        }
                        else if (var166.eql((SubLObject)module0549.$ic69$)) {
                            Errors.warn((SubLObject)module0549.$ic65$, var165, (SubLObject)module0549.$ic66$);
                        }
                        else {
                            Errors.warn((SubLObject)module0549.$ic70$, module0136.$g1591$.getDynamicValue(var155));
                            Errors.cerror((SubLObject)module0549.$ic68$, (SubLObject)module0549.$ic65$, var165, (SubLObject)module0549.$ic66$);
                        }
                    }
                    final SubLObject var3_274 = module0141.$g1670$.currentBinding(var155);
                    final SubLObject var4_275 = module0141.$g1671$.currentBinding(var155);
                    final SubLObject var5_277 = module0141.$g1672$.currentBinding(var155);
                    final SubLObject var167 = module0141.$g1674$.currentBinding(var155);
                    final SubLObject var168 = module0137.$g1605$.currentBinding(var155);
                    try {
                        module0141.$g1670$.bind(module0137.f8955(module0549.$ic37$), var155);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0549.$ic37$)), var155);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0549.$ic37$)), var155);
                        module0141.$g1674$.bind((SubLObject)module0549.NIL, var155);
                        module0137.$g1605$.bind(module0137.f8955(module0549.$ic37$), var155);
                        if (module0549.NIL != module0136.f8865() || module0549.NIL != module0244.f15795(var154, module0137.f8955((SubLObject)module0549.UNPROVIDED))) {
                            final SubLObject var3_275 = module0141.$g1677$.currentBinding(var155);
                            final SubLObject var4_276 = module0138.$g1619$.currentBinding(var155);
                            final SubLObject var5_278 = module0141.$g1674$.currentBinding(var155);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var155);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0549.$ic37$)), var155);
                                module0141.$g1674$.bind((SubLObject)module0549.NIL, var155);
                                module0249.f16055(var162, (SubLObject)module0549.UNPROVIDED);
                                while (module0549.NIL != var162) {
                                    final SubLObject var169 = var162;
                                    if (module0549.NIL != module0158.f10282(var169, (SubLObject)module0549.NIL)) {
                                        final SubLObject var170 = module0158.f10283(var169, (SubLObject)module0549.NIL);
                                        SubLObject var171 = (SubLObject)module0549.NIL;
                                        final SubLObject var172 = (SubLObject)module0549.NIL;
                                        while (module0549.NIL == var171) {
                                            final SubLObject var173 = module0052.f3695(var170, var172);
                                            final SubLObject var174 = (SubLObject)SubLObjectFactory.makeBoolean(!var172.eql(var173));
                                            if (module0549.NIL != var174) {
                                                SubLObject var175 = (SubLObject)module0549.NIL;
                                                try {
                                                    var175 = module0158.f10316(var173, (SubLObject)module0549.NIL, (SubLObject)module0549.NIL, (SubLObject)module0549.NIL);
                                                    SubLObject var282_287 = (SubLObject)module0549.NIL;
                                                    final SubLObject var283_288 = (SubLObject)module0549.NIL;
                                                    while (module0549.NIL == var282_287) {
                                                        final SubLObject var176 = module0052.f3695(var175, var283_288);
                                                        final SubLObject var285_290 = (SubLObject)SubLObjectFactory.makeBoolean(!var283_288.eql(var176));
                                                        if (module0549.NIL != var285_290 && module0549.NIL != module0158.f10284(var176, var173)) {
                                                            module0077.f5326(var176, var161);
                                                        }
                                                        var282_287 = (SubLObject)SubLObjectFactory.makeBoolean(module0549.NIL == var285_290);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var3_276 = Threads.$is_thread_performing_cleanupP$.currentBinding(var155);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0549.T, var155);
                                                        if (module0549.NIL != var175) {
                                                            module0158.f10319(var175);
                                                        }
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_276, var155);
                                                    }
                                                }
                                            }
                                            var171 = (SubLObject)SubLObjectFactory.makeBoolean(module0549.NIL == var174);
                                        }
                                    }
                                    SubLObject var178;
                                    final SubLObject var177 = var178 = module0200.f12443(module0137.f8955(module0549.$ic37$));
                                    SubLObject var179 = (SubLObject)module0549.NIL;
                                    var179 = var178.first();
                                    while (module0549.NIL != var178) {
                                        final SubLObject var3_277 = module0137.$g1605$.currentBinding(var155);
                                        final SubLObject var4_277 = module0141.$g1674$.currentBinding(var155);
                                        try {
                                            module0137.$g1605$.bind(var179, var155);
                                            module0141.$g1674$.bind((SubLObject)((module0549.NIL != module0141.f9205((SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0549.NIL == module0141.$g1674$.getDynamicValue(var155)) : module0141.$g1674$.getDynamicValue(var155)), var155);
                                            final SubLObject var180 = module0228.f15229(var162);
                                            if (module0549.NIL != module0138.f8992(var180)) {
                                                final SubLObject var181 = module0242.f15664(var180, module0137.f8955((SubLObject)module0549.UNPROVIDED));
                                                if (module0549.NIL != var181) {
                                                    final SubLObject var182 = module0245.f15834(var181, module0138.f8979(), module0137.f8955((SubLObject)module0549.UNPROVIDED));
                                                    if (module0549.NIL != var182) {
                                                        SubLObject var183;
                                                        for (var183 = module0066.f4838(module0067.f4891(var182)); module0549.NIL == module0066.f4841(var183); var183 = module0066.f4840(var183)) {
                                                            var155.resetMultipleValues();
                                                            final SubLObject var224_294 = module0066.f4839(var183);
                                                            final SubLObject var184 = var155.secondMultipleValue();
                                                            var155.resetMultipleValues();
                                                            if (module0549.NIL != module0147.f9507(var224_294)) {
                                                                final SubLObject var3_278 = module0138.$g1623$.currentBinding(var155);
                                                                try {
                                                                    module0138.$g1623$.bind(var224_294, var155);
                                                                    SubLObject var78_296;
                                                                    for (var78_296 = module0066.f4838(module0067.f4891(var184)); module0549.NIL == module0066.f4841(var78_296); var78_296 = module0066.f4840(var78_296)) {
                                                                        var155.resetMultipleValues();
                                                                        final SubLObject var185 = module0066.f4839(var78_296);
                                                                        final SubLObject var186 = var155.secondMultipleValue();
                                                                        var155.resetMultipleValues();
                                                                        if (module0549.NIL != module0141.f9289(var185)) {
                                                                            final SubLObject var3_279 = module0138.$g1624$.currentBinding(var155);
                                                                            try {
                                                                                module0138.$g1624$.bind(var185, var155);
                                                                                final SubLObject var187 = var186;
                                                                                if (module0549.NIL != module0077.f5302(var187)) {
                                                                                    final SubLObject var188 = module0077.f5333(var187);
                                                                                    SubLObject var189;
                                                                                    SubLObject var190;
                                                                                    SubLObject var191;
                                                                                    for (var189 = module0032.f1741(var188), var190 = (SubLObject)module0549.NIL, var190 = module0032.f1742(var189, var188); module0549.NIL == module0032.f1744(var189, var190); var190 = module0032.f1743(var190)) {
                                                                                        var191 = module0032.f1745(var189, var190);
                                                                                        if (module0549.NIL != module0032.f1746(var190, var191) && module0549.NIL == module0249.f16059(var191, (SubLObject)module0549.UNPROVIDED)) {
                                                                                            module0249.f16055(var191, (SubLObject)module0549.UNPROVIDED);
                                                                                            module0056.f4149(var191, var164);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var187.isList()) {
                                                                                    SubLObject var192 = var187;
                                                                                    SubLObject var193 = (SubLObject)module0549.NIL;
                                                                                    var193 = var192.first();
                                                                                    while (module0549.NIL != var192) {
                                                                                        if (module0549.NIL == module0249.f16059(var193, (SubLObject)module0549.UNPROVIDED)) {
                                                                                            module0249.f16055(var193, (SubLObject)module0549.UNPROVIDED);
                                                                                            module0056.f4149(var193, var164);
                                                                                        }
                                                                                        var192 = var192.rest();
                                                                                        var193 = var192.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0549.$ic41$, var187);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var3_279, var155);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var78_296);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var3_278, var155);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var183);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0549.FIVE_INTEGER, (SubLObject)module0549.$ic71$, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED);
                                                }
                                            }
                                            else if (module0549.NIL != module0155.f9785(var180, (SubLObject)module0549.UNPROVIDED)) {
                                                SubLObject var75_299;
                                                final SubLObject var194 = var75_299 = ((module0549.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var155), module0137.f8955((SubLObject)module0549.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var155), module0137.f8955((SubLObject)module0549.UNPROVIDED)));
                                                SubLObject var195 = (SubLObject)module0549.NIL;
                                                var195 = var75_299.first();
                                                while (module0549.NIL != var75_299) {
                                                    final SubLObject var3_280 = module0138.$g1625$.currentBinding(var155);
                                                    try {
                                                        module0138.$g1625$.bind(var195, var155);
                                                        final SubLObject var197;
                                                        final SubLObject var196 = var197 = Functions.funcall(var195, var180);
                                                        if (module0549.NIL != module0077.f5302(var197)) {
                                                            final SubLObject var198 = module0077.f5333(var197);
                                                            SubLObject var199;
                                                            SubLObject var200;
                                                            SubLObject var201;
                                                            for (var199 = module0032.f1741(var198), var200 = (SubLObject)module0549.NIL, var200 = module0032.f1742(var199, var198); module0549.NIL == module0032.f1744(var199, var200); var200 = module0032.f1743(var200)) {
                                                                var201 = module0032.f1745(var199, var200);
                                                                if (module0549.NIL != module0032.f1746(var200, var201) && module0549.NIL == module0249.f16059(var201, (SubLObject)module0549.UNPROVIDED)) {
                                                                    module0249.f16055(var201, (SubLObject)module0549.UNPROVIDED);
                                                                    module0056.f4149(var201, var164);
                                                                }
                                                            }
                                                        }
                                                        else if (var197.isList()) {
                                                            SubLObject var202 = var197;
                                                            SubLObject var203 = (SubLObject)module0549.NIL;
                                                            var203 = var202.first();
                                                            while (module0549.NIL != var202) {
                                                                if (module0549.NIL == module0249.f16059(var203, (SubLObject)module0549.UNPROVIDED)) {
                                                                    module0249.f16055(var203, (SubLObject)module0549.UNPROVIDED);
                                                                    module0056.f4149(var203, var164);
                                                                }
                                                                var202 = var202.rest();
                                                                var203 = var202.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0549.$ic41$, var197);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var3_280, var155);
                                                    }
                                                    var75_299 = var75_299.rest();
                                                    var195 = var75_299.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var4_277, var155);
                                            module0137.$g1605$.rebind(var3_277, var155);
                                        }
                                        var178 = var178.rest();
                                        var179 = var178.first();
                                    }
                                    var162 = module0056.f4150(var164);
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var5_278, var155);
                                module0138.$g1619$.rebind(var4_276, var155);
                                module0141.$g1677$.rebind(var3_275, var155);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)module0549.TWO_INTEGER, (SubLObject)module0549.$ic72$, var154, module0244.f15748(module0137.f8955((SubLObject)module0549.UNPROVIDED)), (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED, (SubLObject)module0549.UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var168, var155);
                        module0141.$g1674$.rebind(var167, var155);
                        module0141.$g1672$.rebind(var5_277, var155);
                        module0141.$g1671$.rebind(var4_275, var155);
                        module0141.$g1670$.rebind(var3_274, var155);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var4_274, var155);
                    module0141.$g1714$.rebind(var3_273, var155);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var155));
            }
            finally {
                module0139.$g1635$.rebind(var3_272, var155);
            }
            var156 = module0077.f5311(var161);
        }
        finally {
            module0147.$g2096$.rebind(var160, var155);
            module0147.$g2094$.rebind(var159, var155);
            module0147.$g2095$.rebind(var158, var155);
        }
        return var156;
    }
    
    public static SubLObject f33960(final SubLObject var14, SubLObject var79, SubLObject var301) {
        if (var79 == module0549.UNPROVIDED) {
            var79 = (SubLObject)module0549.NIL;
        }
        if (var301 == module0549.UNPROVIDED) {
            var301 = (SubLObject)module0549.NIL;
        }
        final SubLThread var302 = SubLProcess.currentSubLThread();
        SubLObject var303 = (SubLObject)module0549.ZERO_INTEGER;
        final SubLObject var304 = var79;
        final SubLObject var305 = module0147.$g2095$.currentBinding(var302);
        final SubLObject var306 = module0147.$g2094$.currentBinding(var302);
        final SubLObject var307 = module0147.$g2096$.currentBinding(var302);
        try {
            module0147.$g2095$.bind(module0147.f9545(var304), var302);
            module0147.$g2094$.bind(module0147.f9546(var304), var302);
            module0147.$g2096$.bind(module0147.f9549(var304), var302);
            final SubLObject var308 = module0077.f5313(Symbols.symbol_function((SubLObject)module0549.EQL), (SubLObject)module0549.UNPROVIDED);
            SubLObject var309 = var14;
            SubLObject var310 = (SubLObject)module0549.NIL;
            var310 = var309.first();
            while (module0549.NIL != var309) {
                if (module0549.NIL != module0158.f10282(var310, (SubLObject)module0549.NIL)) {
                    final SubLObject var311 = module0158.f10283(var310, (SubLObject)module0549.NIL);
                    SubLObject var312 = (SubLObject)module0549.NIL;
                    final SubLObject var313 = (SubLObject)module0549.NIL;
                    while (module0549.NIL == var312) {
                        final SubLObject var314 = module0052.f3695(var311, var313);
                        final SubLObject var315 = (SubLObject)SubLObjectFactory.makeBoolean(!var313.eql(var314));
                        if (module0549.NIL != var315) {
                            SubLObject var316 = (SubLObject)module0549.NIL;
                            try {
                                var316 = module0158.f10316(var314, (SubLObject)module0549.NIL, (SubLObject)module0549.NIL, (SubLObject)module0549.NIL);
                                SubLObject var282_302 = (SubLObject)module0549.NIL;
                                final SubLObject var283_303 = (SubLObject)module0549.NIL;
                                while (module0549.NIL == var282_302) {
                                    final SubLObject var317 = module0052.f3695(var316, var283_303);
                                    final SubLObject var285_304 = (SubLObject)SubLObjectFactory.makeBoolean(!var283_303.eql(var317));
                                    if (module0549.NIL != var285_304 && module0549.NIL != module0158.f10284(var317, var314)) {
                                        module0077.f5326(var317, var308);
                                    }
                                    var282_302 = (SubLObject)SubLObjectFactory.makeBoolean(module0549.NIL == var285_304);
                                }
                            }
                            finally {
                                final SubLObject var3_305 = Threads.$is_thread_performing_cleanupP$.currentBinding(var302);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0549.T, var302);
                                    if (module0549.NIL != var316) {
                                        module0158.f10319(var316);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var3_305, var302);
                                }
                            }
                        }
                        var312 = (SubLObject)SubLObjectFactory.makeBoolean(module0549.NIL == var315);
                    }
                }
                var309 = var309.rest();
                var310 = var309.first();
            }
            if (var301.isFunctionSpec()) {
                final SubLObject var318 = module0077.f5333(var308);
                SubLObject var319;
                SubLObject var320;
                SubLObject var321;
                for (var319 = module0032.f1741(var318), var320 = (SubLObject)module0549.NIL, var320 = module0032.f1742(var319, var318); module0549.NIL == module0032.f1744(var319, var320); var320 = module0032.f1743(var320)) {
                    var321 = module0032.f1745(var319, var320);
                    if (module0549.NIL != module0032.f1746(var320, var321) && module0549.NIL != Functions.funcall(var301, var321)) {
                        module0077.f5327(var321, var308);
                    }
                }
            }
            var303 = module0077.f5311(var308);
        }
        finally {
            module0147.$g2096$.rebind(var307, var302);
            module0147.$g2094$.rebind(var306, var302);
            module0147.$g2095$.rebind(var305, var302);
        }
        return var303;
    }
    
    public static SubLObject f33961() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33887", "S#37281", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33888", "S#37282", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33889", "S#37283", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33894", "S#37284", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33895", "S#17475", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33897", "S#17476", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33899", "GENL-CARDINALITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33901", "SPEC-CARDINALITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33903", "S#37285", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33904", "S#19268", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33905", "S#19269", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33906", "S#17474", 1, 0, false);
        new $f33906$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33908", "S#15404", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33909", "S#37286", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33910", "S#17515", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33911", "S#18496", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33912", "S#33967", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33913", "S#34329", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33914", "S#37287", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33918", "S#37288", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33919", "S#37289", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33920", "S#37290", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33921", "S#37291", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33922", "S#37292", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33923", "S#37293", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33924", "S#37294", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33925", "S#37295", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33896", "S#37296", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33926", "S#37297", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33927", "S#37298", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33898", "S#37299", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33928", "S#37300", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33929", "S#37301", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33902", "S#37302", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33930", "S#37303", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33931", "S#37304", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33900", "S#37305", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33932", "S#37306", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33907", "S#37307", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33934", "S#37308", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33890", "S#16678", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33915", "S#37309", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33891", "S#37310", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0549", "f33941", "S#37311");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33942", "S#37312", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33935", "S#37313", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33936", "S#37314", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33937", "S#37315", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33938", "S#37316", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33939", "S#37317", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33940", "S#37318", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33916", "S#37319", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33892", "S#37320", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33943", "S#37321", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33944", "S#37322", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33945", "S#37323", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33917", "S#37324", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33893", "S#37325", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33947", "S#37326", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33948", "S#37327", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33949", "S#19276", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33953", "S#13559", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33950", "S#37328", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33951", "S#37329", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33952", "S#37330", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33946", "S#37331", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33933", "S#37332", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33954", "INITIALIZE-INFERENCE-TEST-CARDINALITIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33955", "S#37333", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33956", "S#18389", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33957", "S#18391", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33958", "S#37334", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33959", "S#37335", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0549", "f33960", "S#35961", 1, 2, false);
        return (SubLObject)module0549.NIL;
    }
    
    public static SubLObject f33962() {
        module0549.$g3981$ = SubLFiles.deflexical("S#37336", (SubLObject)((module0549.NIL != Symbols.boundp((SubLObject)module0549.$ic7$)) ? module0549.$g3981$.getGlobalValue() : module0549.NIL));
        module0549.$g3983$ = SubLFiles.deflexical("S#37337", (SubLObject)((module0549.NIL != Symbols.boundp((SubLObject)module0549.$ic8$)) ? module0549.$g3983$.getGlobalValue() : module0549.NIL));
        module0549.$g3985$ = SubLFiles.deflexical("S#37338", (SubLObject)((module0549.NIL != Symbols.boundp((SubLObject)module0549.$ic9$)) ? module0549.$g3985$.getGlobalValue() : module0549.NIL));
        module0549.$g3982$ = SubLFiles.deflexical("S#37339", (SubLObject)((module0549.NIL != Symbols.boundp((SubLObject)module0549.$ic10$)) ? module0549.$g3982$.getGlobalValue() : module0549.NIL));
        module0549.$g3984$ = SubLFiles.deflexical("S#37340", (SubLObject)((module0549.NIL != Symbols.boundp((SubLObject)module0549.$ic11$)) ? module0549.$g3984$.getGlobalValue() : module0549.NIL));
        module0549.$g3986$ = SubLFiles.deflexical("S#37341", (SubLObject)((module0549.NIL != Symbols.boundp((SubLObject)module0549.$ic12$)) ? module0549.$g3986$.getGlobalValue() : module0549.NIL));
        module0549.$g3987$ = SubLFiles.deflexical("S#37342", (SubLObject)((module0549.NIL != Symbols.boundp((SubLObject)module0549.$ic13$)) ? module0549.$g3987$.getGlobalValue() : module0549.NIL));
        module0549.$g3988$ = SubLFiles.deflexical("S#37343", (SubLObject)((module0549.NIL != Symbols.boundp((SubLObject)module0549.$ic14$)) ? module0549.$g3988$.getGlobalValue() : module0549.NIL));
        module0549.$g3989$ = SubLFiles.defparameter("S#37344", (SubLObject)module0549.$ic59$);
        return (SubLObject)module0549.NIL;
    }
    
    public static SubLObject f33963() {
        module0003.f57((SubLObject)module0549.$ic7$);
        module0003.f57((SubLObject)module0549.$ic8$);
        module0003.f57((SubLObject)module0549.$ic9$);
        module0003.f57((SubLObject)module0549.$ic10$);
        module0003.f57((SubLObject)module0549.$ic11$);
        module0003.f57((SubLObject)module0549.$ic12$);
        module0003.f57((SubLObject)module0549.$ic13$);
        module0003.f57((SubLObject)module0549.$ic14$);
        return (SubLObject)module0549.NIL;
    }
    
    public void declareFunctions() {
        f33961();
    }
    
    public void initializeVariables() {
        f33962();
    }
    
    public void runTopLevelForms() {
        f33963();
    }
    
    static {
        me = (SubLFile)new module0549();
        module0549.$g3981$ = null;
        module0549.$g3983$ = null;
        module0549.$g3985$ = null;
        module0549.$g3982$ = null;
        module0549.$g3984$ = null;
        module0549.$g3986$ = null;
        module0549.$g3987$ = null;
        module0549.$g3988$ = null;
        module0549.$g3989$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#13286", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic2$ = SubLObjectFactory.makeKeyword("ASCENDING");
        $ic3$ = SubLObjectFactory.makeSymbol("<");
        $ic4$ = SubLObjectFactory.makeSymbol("S#17474", "CYC");
        $ic5$ = SubLObjectFactory.makeKeyword("DESCENDING");
        $ic6$ = SubLObjectFactory.makeSymbol(">");
        $ic7$ = SubLObjectFactory.makeSymbol("S#37336", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#37337", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#37338", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#37339", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#37340", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#37341", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#37342", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#37343", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11392", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic16$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic17$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic18$ = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $ic19$ = SubLObjectFactory.makeKeyword("DONE");
        $ic20$ = SubLObjectFactory.makeUninternedSymbol("US#7028EF8");
        $ic21$ = SubLObjectFactory.makeUninternedSymbol("US#8E4499");
        $ic22$ = SubLObjectFactory.makeUninternedSymbol("US#13E86D7");
        $ic23$ = SubLObjectFactory.makeUninternedSymbol("US#53EB1D3");
        $ic24$ = SubLObjectFactory.makeSymbol("CLET");
        $ic25$ = SubLObjectFactory.makeSymbol("S#37312", "CYC");
        $ic26$ = ConsesLow.list((SubLObject)module0549.ZERO_INTEGER);
        $ic27$ = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $ic28$ = SubLObjectFactory.makeSymbol("S#37311", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $ic30$ = SubLObjectFactory.makeSymbol("CINC");
        $ic31$ = SubLObjectFactory.makeUninternedSymbol("US#8E4499");
        $ic32$ = SubLObjectFactory.makeUninternedSymbol("US#513E608");
        $ic33$ = SubLObjectFactory.makeSymbol("S#15377", "CYC");
        $ic34$ = SubLObjectFactory.makeKeyword("MODULE");
        $ic35$ = SubLObjectFactory.makeSymbol("IGNORE");
        $ic36$ = SubLObjectFactory.makeString("Calculating collection local spec cardinalities");
        $ic37$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic38$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic39$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic40$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#102D8BE"));
        $ic41$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic42$ = SubLObjectFactory.makeString("Calculating collection local instance cardinalities");
        $ic43$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic44$ = SubLObjectFactory.makeString("Calculating collection local quoted instance cardinalities");
        $ic45$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $ic46$ = SubLObjectFactory.makeString("Calculating predicate local spec cardinalities");
        $ic47$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic48$ = SubLObjectFactory.makeString("Calculating microtheory local spec cardinalities");
        $ic49$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $ic50$ = SubLObjectFactory.makeString("Calculating other local instance cardinalities");
        $ic51$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic52$ = SubLObjectFactory.makeString("Calculating collection total cardinalities");
        $ic53$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#102D8BE"));
        $ic54$ = SubLObjectFactory.makeString("Calculating predicate total cardinalities");
        $ic55$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#717", "CYC"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#102D8BE"));
        $ic56$ = SubLObjectFactory.makeString("Calculating microtheory total cardinalities");
        $ic57$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#102D8BE"));
        $ic58$ = SubLObjectFactory.makeString("Calculating generality estimates");
        $ic59$ = SubLObjectFactory.makeInteger(100);
        $ic60$ = SubLObjectFactory.makeKeyword("DEPTH");
        $ic61$ = SubLObjectFactory.makeKeyword("STACK");
        $ic62$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic63$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic64$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic65$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic66$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic67$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic68$ = SubLObjectFactory.makeString("continue anyway");
        $ic69$ = SubLObjectFactory.makeKeyword("WARN");
        $ic70$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic71$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic72$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic73$ = SubLObjectFactory.makeKeyword("BREADTH");
    }
    
    public static final class $f33906$UnaryFunction extends UnaryFunction
    {
        public $f33906$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#17474"));
        }
        
        public SubLObject processItem(final SubLObject var13) {
            return module0549.f33906(var13);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0549.class
	Total time: 1883 ms
	
	Decompiled with Procyon 0.5.32.
*/