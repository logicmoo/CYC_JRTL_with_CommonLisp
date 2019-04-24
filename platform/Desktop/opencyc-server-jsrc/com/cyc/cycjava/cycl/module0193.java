package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0193 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0193";
    public static final String myFingerPrint = "37a99268e080c3af65ca9e80f8c1ea43e07e01c8c7588d8e19db1a31b8c9a741";
    private static SubLSymbol $g2257$;
    private static SubLSymbol $g2258$;
    public static SubLSymbol $g2259$;
    private static SubLSymbol $g2260$;
    private static SubLSymbol $g2261$;
    private static SubLSymbol $g2262$;
    private static SubLSymbol $g2263$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLInteger $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLString $ic23$;
    private static final SubLList $ic24$;
    private static final SubLInteger $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLList $ic30$;
    private static final SubLList $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLString $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLList $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLString $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLSymbol $ic69$;
    
    public static SubLObject f12065(final SubLObject var1, final SubLObject var2) {
        f12066(var1, var2, (SubLObject)module0193.ZERO_INTEGER);
        return (SubLObject)module0193.NIL;
    }
    
    public static SubLObject f12067(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $variable_native.class) ? module0193.T : module0193.NIL);
    }
    
    public static SubLObject f12068(final SubLObject var1) {
        assert module0193.NIL != f12067(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f12069(final SubLObject var1, final SubLObject var4) {
        assert module0193.NIL != f12067(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f12070(SubLObject var5) {
        if (var5 == module0193.UNPROVIDED) {
            var5 = (SubLObject)module0193.NIL;
        }
        final SubLObject var6 = (SubLObject)new $variable_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0193.NIL, var7 = var5; module0193.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0193.$ic12$)) {
                f12069(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0193.$ic13$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f12071(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0193.$ic14$, (SubLObject)module0193.$ic15$, (SubLObject)module0193.ONE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0193.$ic16$, (SubLObject)module0193.$ic12$, f12068(var11));
        Functions.funcall(var12, var11, (SubLObject)module0193.$ic17$, (SubLObject)module0193.$ic15$, (SubLObject)module0193.ONE_INTEGER);
        return var11;
    }
    
    public static SubLObject f12072(final SubLObject var11, final SubLObject var12) {
        return f12071(var11, var12);
    }
    
    public static SubLObject f12066(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = f12073(var13);
        final SubLObject var17 = ConsesLow.nth(var16, module0018.$g582$.getDynamicValue(var15));
        if (module0193.NIL != var17) {
            print_high.princ(var17, var2);
        }
        else {
            PrintLow.format(var2, (SubLObject)module0193.$ic19$, module0193.$g2257$.getGlobalValue(), var16);
        }
        return var13;
    }
    
    public static SubLObject f12074(final SubLObject var13) {
        final SubLObject var14 = f12068(var13);
        if (var14.isInteger()) {
            return var14;
        }
        return (SubLObject)module0193.$ic20$;
    }
    
    public static SubLObject f12075(final SubLObject var18) {
        assert module0193.NIL != Types.fixnump(var18) : var18;
        return Vectors.aref(module0193.$g2261$.getGlobalValue(), var18);
    }
    
    public static SubLObject f12076() {
        if (!module0193.$g2261$.getGlobalValue().isVector()) {
            final SubLObject var19 = Vectors.make_vector(module0193.$g2260$.getGlobalValue(), (SubLObject)module0193.NIL);
            SubLObject var20;
            SubLObject var21;
            for (var20 = (SubLObject)module0193.NIL, var20 = (SubLObject)module0193.ZERO_INTEGER; var20.numL(module0193.$g2260$.getGlobalValue()); var20 = Numbers.add(var20, (SubLObject)module0193.ONE_INTEGER)) {
                var21 = f12070((SubLObject)module0193.UNPROVIDED);
                f12069(var21, var20);
                Vectors.set_aref(var19, var20, var21);
            }
            module0193.$g2261$.setGlobalValue(var19);
            return (SubLObject)module0193.T;
        }
        return (SubLObject)module0193.NIL;
    }
    
    public static SubLObject f12077() {
        return module0193.$g2260$.getGlobalValue();
    }
    
    public static SubLObject f12078(final SubLObject var22, final SubLObject var23) {
        SubLObject var25;
        final SubLObject var24 = var25 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)module0193.$ic31$);
        final SubLObject var26 = var25.rest();
        var25 = var25.first();
        SubLObject var27 = (SubLObject)module0193.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)module0193.$ic31$);
        var27 = var25.first();
        var25 = var25.rest();
        SubLObject var28 = (SubLObject)module0193.NIL;
        SubLObject var29 = var25;
        SubLObject var30 = (SubLObject)module0193.NIL;
        SubLObject var31_32 = (SubLObject)module0193.NIL;
        while (module0193.NIL != var29) {
            cdestructuring_bind.destructuring_bind_must_consp(var29, var24, (SubLObject)module0193.$ic31$);
            var31_32 = var29.first();
            var29 = var29.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var29, var24, (SubLObject)module0193.$ic31$);
            if (module0193.NIL == conses_high.member(var31_32, (SubLObject)module0193.$ic32$, (SubLObject)module0193.UNPROVIDED, (SubLObject)module0193.UNPROVIDED)) {
                var30 = (SubLObject)module0193.T;
            }
            if (var31_32 == module0193.$ic33$) {
                var28 = var29.first();
            }
            var29 = var29.rest();
        }
        if (module0193.NIL != var30 && module0193.NIL == var28) {
            cdestructuring_bind.cdestructuring_bind_error(var24, (SubLObject)module0193.$ic31$);
        }
        final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)module0193.$ic34$, var25);
        final SubLObject var32 = (SubLObject)((module0193.NIL != var31) ? conses_high.cadr(var31) : module0193.NIL);
        final SubLObject var33;
        var25 = (var33 = var26);
        final SubLObject var34 = (SubLObject)module0193.$ic35$;
        return (SubLObject)ConsesLow.list((SubLObject)module0193.$ic36$, (SubLObject)ConsesLow.list(var34, (SubLObject)module0193.$ic37$, (SubLObject)module0193.ZERO_INTEGER, (SubLObject)module0193.$ic17$, (SubLObject)module0193.$ic38$, (SubLObject)module0193.$ic34$, var32), (SubLObject)ConsesLow.listS((SubLObject)module0193.$ic39$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var27, (SubLObject)ConsesLow.list((SubLObject)module0193.$ic40$, var34))), ConsesLow.append(var33, (SubLObject)module0193.NIL)));
    }
    
    public static SubLObject f12073(final SubLObject var36) {
        assert module0193.NIL != f12067(var36) : var36;
        return f12068(var36);
    }
    
    public static SubLObject f12079(final SubLObject var16) {
        assert module0193.NIL != Types.integerp(var16) : var16;
        return f12075(var16);
    }
    
    public static SubLObject f12080(final SubLObject var37, final SubLObject var38) {
        return Numbers.numL(f12073(var37), f12073(var38));
    }
    
    public static SubLObject f12081() {
        if (module0193.NIL != module0193.$g2261$.getGlobalValue()) {
            return f12079(random.random(f12077()));
        }
        return (SubLObject)module0193.NIL;
    }
    
    public static SubLObject f12082(final SubLObject var36) {
        assert module0193.NIL != f12067(var36) : var36;
        return f12083(var36);
    }
    
    public static SubLObject f12084() {
        final SubLObject var40 = module0193.$g2262$.getGlobalValue();
        if (module0193.NIL != var40) {
            module0034.f1818(var40);
        }
        return (SubLObject)module0193.NIL;
    }
    
    public static SubLObject f12085(final SubLObject var36) {
        return module0034.f1829(module0193.$g2262$.getGlobalValue(), (SubLObject)ConsesLow.list(var36), (SubLObject)module0193.UNPROVIDED, (SubLObject)module0193.UNPROVIDED);
    }
    
    public static SubLObject f12086(final SubLObject var36) {
        assert module0193.NIL != f12067(var36) : var36;
        final SubLObject var37 = module0201.f12550(print_high.prin1_to_string(var36));
        return var37;
    }
    
    public static SubLObject f12083(final SubLObject var36) {
        SubLObject var37 = module0193.$g2262$.getGlobalValue();
        if (module0193.NIL == var37) {
            var37 = module0034.f1934((SubLObject)module0193.$ic51$, (SubLObject)module0193.$ic52$, (SubLObject)module0193.NIL, (SubLObject)module0193.EQ, (SubLObject)module0193.ONE_INTEGER, (SubLObject)module0193.ZERO_INTEGER);
        }
        SubLObject var38 = module0034.f1814(var37, var36, (SubLObject)module0193.$ic53$);
        if (var38 == module0193.$ic53$) {
            var38 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f12086(var36)));
            module0034.f1816(var37, var36, var38, (SubLObject)module0193.UNPROVIDED);
        }
        return module0034.f1959(var38);
    }
    
    public static SubLObject f12087(final SubLObject var18) {
        return module0201.f12550(Sequences.cconcatenate(module0193.$g2258$.getGlobalValue(), module0038.f2618(var18)));
    }
    
    public static SubLObject f12088() {
        final SubLObject var40 = module0193.$g2263$.getGlobalValue();
        if (module0193.NIL != var40) {
            module0034.f1818(var40);
        }
        return (SubLObject)module0193.NIL;
    }
    
    public static SubLObject f12089(final SubLObject var44) {
        return module0034.f1829(module0193.$g2263$.getGlobalValue(), (SubLObject)ConsesLow.list(var44), (SubLObject)module0193.UNPROVIDED, (SubLObject)module0193.UNPROVIDED);
    }
    
    public static SubLObject f12090(final SubLObject var44) {
        assert module0193.NIL != module0201.f12546(var44) : var44;
        return f12079(reader.read_from_string_ignoring_errors(Symbols.symbol_name(var44), (SubLObject)module0193.NIL, (SubLObject)module0193.NIL, (SubLObject)module0193.FOUR_INTEGER, (SubLObject)module0193.UNPROVIDED));
    }
    
    public static SubLObject f12091(final SubLObject var44) {
        SubLObject var45 = module0193.$g2263$.getGlobalValue();
        if (module0193.NIL == var45) {
            var45 = module0034.f1934((SubLObject)module0193.$ic54$, (SubLObject)module0193.$ic56$, (SubLObject)module0193.NIL, (SubLObject)module0193.EQ, (SubLObject)module0193.ONE_INTEGER, (SubLObject)module0193.ZERO_INTEGER);
        }
        SubLObject var46 = module0034.f1814(var45, var44, (SubLObject)module0193.$ic53$);
        if (var46 == module0193.$ic53$) {
            var46 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f12090(var44)));
            module0034.f1816(var45, var44, var46, (SubLObject)module0193.UNPROVIDED);
        }
        return module0034.f1959(var46);
    }
    
    public static SubLObject f12092(final SubLObject var45) {
        return Sort.sort(var45, (SubLObject)module0193.$ic57$, (SubLObject)module0193.UNPROVIDED);
    }
    
    public static SubLObject f12093(final SubLObject var46) {
        return module0205.f13147(var46, (SubLObject)module0193.$ic58$, (SubLObject)module0193.$ic54$, (SubLObject)module0193.T, (SubLObject)module0193.UNPROVIDED);
    }
    
    public static SubLObject f12094(final SubLObject var46) {
        return module0205.f13147(var46, (SubLObject)module0193.$ic2$, (SubLObject)module0193.$ic49$, (SubLObject)module0193.T, (SubLObject)module0193.UNPROVIDED);
    }
    
    public static SubLObject f12095(final SubLObject var46) {
        f12096(var46);
        return f12093(var46);
    }
    
    public static SubLObject f12096(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0205.f13145((SubLObject)module0193.$ic59$, var46, (SubLObject)module0193.UNPROVIDED, (SubLObject)module0193.UNPROVIDED);
        if (module0193.NIL == Errors.$ignore_mustsP$.getDynamicValue(var47) && module0193.NIL != var48) {
            Errors.error((SubLObject)module0193.$ic60$, var46, var48);
        }
        return (SubLObject)module0193.NIL;
    }
    
    public static SubLObject f12097(final SubLObject var48) {
        return module0201.f12546(var48);
    }
    
    public static SubLObject f12098(final SubLObject var49) {
        return module0035.f2399(var49, (SubLObject)module0193.$ic55$, (SubLObject)module0193.UNPROVIDED, (SubLObject)module0193.UNPROVIDED, (SubLObject)module0193.UNPROVIDED);
    }
    
    public static SubLObject f12099(final SubLObject var50, final SubLObject var51) {
        final SubLObject var52 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0193.$ic63$), var51, new SubLObject[] { Mapping.mapcar(Symbols.symbol_function((SubLObject)module0193.$ic40$), module0035.f2160(Sequences.length(var51), (SubLObject)module0193.UNPROVIDED)) });
        return conses_high.sublis(var52, var50, (SubLObject)module0193.UNPROVIDED, (SubLObject)module0193.UNPROVIDED);
    }
    
    public static SubLObject f12100(final SubLObject var50, final SubLObject var53) {
        final SubLObject var54 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0193.$ic63$), Mapping.mapcar(Symbols.symbol_function((SubLObject)module0193.$ic40$), module0035.f2160(Sequences.length(var53), (SubLObject)module0193.UNPROVIDED)), new SubLObject[] { var53 });
        return conses_high.sublis(var54, var50, (SubLObject)module0193.UNPROVIDED, (SubLObject)module0193.UNPROVIDED);
    }
    
    public static SubLObject f12101(final SubLObject var54) {
        final SubLObject var55 = (SubLObject)ConsesLow.make_list(var54, (SubLObject)module0193.UNPROVIDED);
        SubLObject var56 = (SubLObject)module0193.NIL;
        SubLObject var57 = (SubLObject)module0193.NIL;
        var56 = (SubLObject)module0193.ZERO_INTEGER;
        for (var57 = var55; module0193.NIL != var57; var57 = var57.rest()) {
            ConsesLow.rplaca(var57, f12079(var56));
            var56 = Numbers.add(var56, (SubLObject)module0193.ONE_INTEGER);
        }
        return var55;
    }
    
    public static SubLObject f12102(final SubLObject var13) {
        return Sort.sort(module0035.f2399(var13, Symbols.symbol_function((SubLObject)module0193.$ic2$), (SubLObject)module0193.UNPROVIDED, (SubLObject)module0193.UNPROVIDED, (SubLObject)module0193.UNPROVIDED), Symbols.symbol_function((SubLObject)module0193.$ic64$), Symbols.symbol_function((SubLObject)module0193.$ic41$));
    }
    
    public static SubLObject f12103(final SubLObject var13) {
        return module0048.f3381(f12102(var13), Symbols.symbol_function((SubLObject)module0193.$ic41$));
    }
    
    public static SubLObject f12104(final SubLObject var13) {
        final SubLObject var14 = f12103(var13);
        return (SubLObject)((module0193.NIL != var14) ? f12073(var14) : module0193.NIL);
    }
    
    public static SubLObject f12105(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0193.NIL == f12106(var13));
    }
    
    public static SubLObject f12106(final SubLObject var13) {
        if (var13.isAtom()) {
            return f12067(var13);
        }
        SubLObject var14 = (SubLObject)module0193.NIL;
        SubLObject var15 = (SubLObject)module0193.NIL;
        var14 = var13;
        var15 = var14.first();
        while (!var14.rest().isAtom()) {
            if (module0193.NIL != f12106(var15)) {
                return (SubLObject)module0193.T;
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0193.NIL != f12106(var15) || module0193.NIL != f12067(var14.rest()));
    }
    
    public static SubLObject f12107(final SubLObject var46) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0193.NIL == module0205.f13145((SubLObject)module0193.$ic69$, var46, (SubLObject)module0193.UNPROVIDED, (SubLObject)module0193.UNPROVIDED));
    }
    
    public static SubLObject f12108(final SubLObject var46) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0193.NIL == module0205.f13145(Symbols.symbol_function((SubLObject)module0193.$ic2$), var46, (SubLObject)module0193.UNPROVIDED, (SubLObject)module0193.UNPROVIDED));
    }
    
    public static SubLObject f12109() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12065", "S#14844", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12067", "VARIABLE-P", 1, 0, false);
        new $f12067$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12068", "S#14845", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12069", "S#14846", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12070", "S#14847", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12071", "S#14848", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12072", "S#14849", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12066", "S#14850", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12074", "S#14842", 1, 0, false);
        new $f12074$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12075", "GET-VARIABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12076", "S#14851", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12077", "VARIABLE-COUNT", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0193", "f12078", "S#14852");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12073", "VARIABLE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12079", "FIND-VARIABLE-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12080", "S#14843", 2, 0, false);
        new $f12080$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12081", "S#14853", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12082", "DEFAULT-EL-VAR-FOR-HL-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12084", "S#14854", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12085", "S#14855", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12086", "S#14856", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12083", "S#14857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12087", "S#14858", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12088", "S#14859", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12089", "S#14860", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12090", "S#14861", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12091", "HL-VAR-FOR-DEFAULT-EL-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12092", "S#14862", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12093", "CANONICALIZE-DEFAULT-EL-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12094", "S#14863", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12095", "S#14864", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12096", "S#14865", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12097", "S#14866", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12098", "S#14867", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12099", "S#14868", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12100", "S#14869", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12101", "S#1994", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12102", "S#14104", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12103", "S#14870", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12104", "S#14871", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12105", "FULLY-BOUND-P", 1, 0, false);
        new $f12105$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12106", "NOT-FULLY-BOUND-P", 1, 0, false);
        new $f12106$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12107", "S#13260", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0193", "f12108", "S#14872", 1, 0, false);
        return (SubLObject)module0193.NIL;
    }
    
    public static SubLObject f12110() {
        module0193.$g2257$ = SubLFiles.defconstant("S#14873", (SubLObject)Characters.CHAR_question);
        module0193.$g2258$ = SubLFiles.defconstant("S#14874", (SubLObject)module0193.$ic0$);
        module0193.$g2259$ = SubLFiles.defconstant("S#14875", (SubLObject)module0193.$ic1$);
        module0193.$g2260$ = SubLFiles.deflexical("S#14876", (SubLObject)module0193.$ic25$);
        module0193.$g2261$ = SubLFiles.deflexical("S#14877", (SubLObject)((module0193.NIL != Symbols.boundp((SubLObject)module0193.$ic26$)) ? module0193.$g2261$.getGlobalValue() : module0193.NIL));
        module0193.$g2262$ = SubLFiles.deflexical("S#14878", (SubLObject)module0193.NIL);
        module0193.$g2263$ = SubLFiles.deflexical("S#14879", (SubLObject)module0193.NIL);
        return (SubLObject)module0193.NIL;
    }
    
    public static SubLObject f12111() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0193.$g2259$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0193.$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0193.$ic9$);
        Structures.def_csetf((SubLObject)module0193.$ic10$, (SubLObject)module0193.$ic11$);
        Equality.identity((SubLObject)module0193.$ic1$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0193.$g2259$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0193.$ic18$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), module0193.$g2259$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0193.$ic21$));
        module0012.f368((SubLObject)module0193.$ic2$, (SubLObject)module0193.$ic22$, (SubLObject)module0193.$ic23$, (SubLObject)module0193.NIL, (SubLObject)module0193.$ic24$);
        module0003.f57((SubLObject)module0193.$ic26$);
        f12076();
        module0012.f368((SubLObject)module0193.$ic28$, (SubLObject)module0193.NIL, (SubLObject)module0193.$ic29$, (SubLObject)module0193.NIL, (SubLObject)module0193.$ic30$);
        module0012.f368((SubLObject)module0193.$ic41$, (SubLObject)module0193.$ic42$, (SubLObject)module0193.$ic43$, (SubLObject)module0193.$ic44$, (SubLObject)module0193.$ic30$);
        module0012.f368((SubLObject)module0193.$ic40$, (SubLObject)module0193.$ic3$, (SubLObject)module0193.$ic46$, (SubLObject)module0193.$ic47$, (SubLObject)module0193.$ic48$);
        module0012.f368((SubLObject)module0193.$ic49$, (SubLObject)module0193.$ic42$, (SubLObject)module0193.$ic50$, (SubLObject)module0193.$ic44$, (SubLObject)module0193.NIL);
        module0034.f1909((SubLObject)module0193.$ic51$);
        module0034.f1909((SubLObject)module0193.$ic54$);
        module0002.f35((SubLObject)module0193.$ic61$, (SubLObject)module0193.$ic62$);
        module0012.f368((SubLObject)module0193.$ic65$, (SubLObject)module0193.$ic22$, (SubLObject)module0193.$ic66$, (SubLObject)module0193.NIL, (SubLObject)module0193.$ic24$);
        module0012.f368((SubLObject)module0193.$ic67$, (SubLObject)module0193.$ic22$, (SubLObject)module0193.$ic68$, (SubLObject)module0193.NIL, (SubLObject)module0193.$ic24$);
        return (SubLObject)module0193.NIL;
    }
    
    public void declareFunctions() {
        f12109();
    }
    
    public void initializeVariables() {
        f12110();
    }
    
    public void runTopLevelForms() {
        f12111();
    }
    
    static {
        me = (SubLFile)new module0193();
        module0193.$g2257$ = null;
        module0193.$g2258$ = null;
        module0193.$g2259$ = null;
        module0193.$g2260$ = null;
        module0193.$g2261$ = null;
        module0193.$g2262$ = null;
        module0193.$g2263$ = null;
        $ic0$ = SubLObjectFactory.makeString("?VAR");
        $ic1$ = SubLObjectFactory.makeSymbol("VARIABLE");
        $ic2$ = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14845", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14846", "CYC"));
        $ic7$ = SubLObjectFactory.makeSymbol("S#14850", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#14844", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-P"));
        $ic10$ = SubLObjectFactory.makeSymbol("S#14845", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#14846", "CYC");
        $ic12$ = SubLObjectFactory.makeKeyword("ID");
        $ic13$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic14$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic15$ = SubLObjectFactory.makeSymbol("S#14847", "CYC");
        $ic16$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic17$ = SubLObjectFactory.makeKeyword("END");
        $ic18$ = SubLObjectFactory.makeSymbol("S#14849", "CYC");
        $ic19$ = SubLObjectFactory.makeString("~Cvar~D");
        $ic20$ = SubLObjectFactory.makeInteger(99);
        $ic21$ = SubLObjectFactory.makeSymbol("S#14842", "CYC");
        $ic22$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#154", "CYC"));
        $ic23$ = SubLObjectFactory.makeString("Return T iff OBJECT is an HL variable.");
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic25$ = SubLObjectFactory.makeInteger(200);
        $ic26$ = SubLObjectFactory.makeSymbol("S#14877", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("FIXNUMP");
        $ic28$ = SubLObjectFactory.makeSymbol("VARIABLE-COUNT");
        $ic29$ = SubLObjectFactory.makeString("Return the total number of HL variables.");
        $ic30$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"));
        $ic31$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14880", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic33$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic34$ = SubLObjectFactory.makeKeyword("DONE");
        $ic35$ = SubLObjectFactory.makeUninternedSymbol("US#3567090");
        $ic36$ = SubLObjectFactory.makeSymbol("DO-NUMBERS");
        $ic37$ = SubLObjectFactory.makeKeyword("START");
        $ic38$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-COUNT"));
        $ic39$ = SubLObjectFactory.makeSymbol("CLET");
        $ic40$ = SubLObjectFactory.makeSymbol("FIND-VARIABLE-BY-ID");
        $ic41$ = SubLObjectFactory.makeSymbol("VARIABLE-ID");
        $ic42$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"));
        $ic43$ = SubLObjectFactory.makeString("Return id of HL variable VARIABLE.");
        $ic44$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-P")));
        $ic45$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic46$ = SubLObjectFactory.makeString("Return the HL variable with ID, or NIL if not present.");
        $ic47$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")));
        $ic48$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-P")));
        $ic49$ = SubLObjectFactory.makeSymbol("DEFAULT-EL-VAR-FOR-HL-VAR");
        $ic50$ = SubLObjectFactory.makeString("Return a readable EL var from HL var VARIABLE.");
        $ic51$ = SubLObjectFactory.makeSymbol("S#14857", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#14878", "CYC");
        $ic53$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic54$ = SubLObjectFactory.makeSymbol("HL-VAR-FOR-DEFAULT-EL-VAR");
        $ic55$ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $ic56$ = SubLObjectFactory.makeSymbol("S#14879", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("S#14843", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("DEFAULT-EL-VAR?");
        $ic59$ = SubLObjectFactory.makeSymbol("S#14881", "CYC");
        $ic60$ = SubLObjectFactory.makeString("~s contained the non-default EL variable ~s, which is not handled yet.");
        $ic61$ = SubLObjectFactory.makeSymbol("S#14866", "CYC");
        $ic62$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?"));
        $ic63$ = SubLObjectFactory.makeSymbol("CONS");
        $ic64$ = SubLObjectFactory.makeSymbol("<");
        $ic65$ = SubLObjectFactory.makeSymbol("FULLY-BOUND-P");
        $ic66$ = SubLObjectFactory.makeString("Return T iff OBJECT contains no HL variables, and therefore is fully bound.");
        $ic67$ = SubLObjectFactory.makeSymbol("NOT-FULLY-BOUND-P");
        $ic68$ = SubLObjectFactory.makeString("Return T iff OBJECT contains some HL variable, and therefore is not fully bound.");
        $ic69$ = SubLObjectFactory.makeSymbol("S#12629", "CYC");
    }
    
    public static final class $variable_native extends SubLStructNative
    {
        public SubLObject $id;
        private static final SubLStructDeclNative structDecl;
        
        public $variable_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$variable_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$variable_native.class, module0193.$ic1$, module0193.$ic2$, module0193.$ic3$, module0193.$ic4$, new String[] { "$id" }, module0193.$ic5$, module0193.$ic6$, module0193.$ic7$);
        }
    }
    
    public static final class $f12067$UnaryFunction extends UnaryFunction
    {
        public $f12067$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("VARIABLE-P"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0193.f12067(var3);
        }
    }
    
    public static final class $f12074$UnaryFunction extends UnaryFunction
    {
        public $f12074$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#14842"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0193.f12074(var3);
        }
    }
    
    public static final class $f12080$BinaryFunction extends BinaryFunction
    {
        public $f12080$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#14843"));
        }
        
        public SubLObject processItem(final SubLObject var3, final SubLObject var39) {
            return module0193.f12080(var3, var39);
        }
    }
    
    public static final class $f12105$UnaryFunction extends UnaryFunction
    {
        public $f12105$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FULLY-BOUND-P"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0193.f12105(var3);
        }
    }
    
    public static final class $f12106$UnaryFunction extends UnaryFunction
    {
        public $f12106$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NOT-FULLY-BOUND-P"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0193.f12106(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0193.class
	Total time: 189 ms
	
	Decompiled with Procyon 0.5.32.
*/