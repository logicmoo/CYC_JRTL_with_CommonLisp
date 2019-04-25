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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        f12066(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12067(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $variable_native.class) ? T : NIL);
    }
    
    public static SubLObject f12068(final SubLObject var1) {
        assert NIL != f12067(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f12069(final SubLObject var1, final SubLObject var4) {
        assert NIL != f12067(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f12070(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $variable_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic12$)) {
                f12069(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic13$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f12071(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic14$, (SubLObject)$ic15$, (SubLObject)ONE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic16$, (SubLObject)$ic12$, f12068(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic17$, (SubLObject)$ic15$, (SubLObject)ONE_INTEGER);
        return var11;
    }
    
    public static SubLObject f12072(final SubLObject var11, final SubLObject var12) {
        return f12071(var11, var12);
    }
    
    public static SubLObject f12066(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = f12073(var13);
        final SubLObject var17 = ConsesLow.nth(var16, module0018.$g582$.getDynamicValue(var15));
        if (NIL != var17) {
            print_high.princ(var17, var2);
        }
        else {
            PrintLow.format(var2, (SubLObject)$ic19$, $g2257$.getGlobalValue(), var16);
        }
        return var13;
    }
    
    public static SubLObject f12074(final SubLObject var13) {
        final SubLObject var14 = f12068(var13);
        if (var14.isInteger()) {
            return var14;
        }
        return (SubLObject)$ic20$;
    }
    
    public static SubLObject f12075(final SubLObject var18) {
        assert NIL != Types.fixnump(var18) : var18;
        return Vectors.aref($g2261$.getGlobalValue(), var18);
    }
    
    public static SubLObject f12076() {
        if (!$g2261$.getGlobalValue().isVector()) {
            final SubLObject var19 = Vectors.make_vector($g2260$.getGlobalValue(), (SubLObject)NIL);
            SubLObject var20;
            SubLObject var21;
            for (var20 = (SubLObject)NIL, var20 = (SubLObject)ZERO_INTEGER; var20.numL($g2260$.getGlobalValue()); var20 = Numbers.add(var20, (SubLObject)ONE_INTEGER)) {
                var21 = f12070((SubLObject)UNPROVIDED);
                f12069(var21, var20);
                Vectors.set_aref(var19, var20, var21);
            }
            $g2261$.setGlobalValue(var19);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12077() {
        return $g2260$.getGlobalValue();
    }
    
    public static SubLObject f12078(final SubLObject var22, final SubLObject var23) {
        SubLObject var25;
        final SubLObject var24 = var25 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic31$);
        final SubLObject var26 = var25.rest();
        var25 = var25.first();
        SubLObject var27 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic31$);
        var27 = var25.first();
        var25 = var25.rest();
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = var25;
        SubLObject var30 = (SubLObject)NIL;
        SubLObject var31_32 = (SubLObject)NIL;
        while (NIL != var29) {
            cdestructuring_bind.destructuring_bind_must_consp(var29, var24, (SubLObject)$ic31$);
            var31_32 = var29.first();
            var29 = var29.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var29, var24, (SubLObject)$ic31$);
            if (NIL == conses_high.member(var31_32, (SubLObject)$ic32$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var30 = (SubLObject)T;
            }
            if (var31_32 == $ic33$) {
                var28 = var29.first();
            }
            var29 = var29.rest();
        }
        if (NIL != var30 && NIL == var28) {
            cdestructuring_bind.cdestructuring_bind_error(var24, (SubLObject)$ic31$);
        }
        final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)$ic34$, var25);
        final SubLObject var32 = (SubLObject)((NIL != var31) ? conses_high.cadr(var31) : NIL);
        final SubLObject var33;
        var25 = (var33 = var26);
        final SubLObject var34 = (SubLObject)$ic35$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic36$, (SubLObject)ConsesLow.list(var34, (SubLObject)$ic37$, (SubLObject)ZERO_INTEGER, (SubLObject)$ic17$, (SubLObject)$ic38$, (SubLObject)$ic34$, var32), (SubLObject)ConsesLow.listS((SubLObject)$ic39$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var27, (SubLObject)ConsesLow.list((SubLObject)$ic40$, var34))), ConsesLow.append(var33, (SubLObject)NIL)));
    }
    
    public static SubLObject f12073(final SubLObject var36) {
        assert NIL != f12067(var36) : var36;
        return f12068(var36);
    }
    
    public static SubLObject f12079(final SubLObject var16) {
        assert NIL != Types.integerp(var16) : var16;
        return f12075(var16);
    }
    
    public static SubLObject f12080(final SubLObject var37, final SubLObject var38) {
        return Numbers.numL(f12073(var37), f12073(var38));
    }
    
    public static SubLObject f12081() {
        if (NIL != $g2261$.getGlobalValue()) {
            return f12079(random.random(f12077()));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12082(final SubLObject var36) {
        assert NIL != f12067(var36) : var36;
        return f12083(var36);
    }
    
    public static SubLObject f12084() {
        final SubLObject var40 = $g2262$.getGlobalValue();
        if (NIL != var40) {
            module0034.f1818(var40);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12085(final SubLObject var36) {
        return module0034.f1829($g2262$.getGlobalValue(), (SubLObject)ConsesLow.list(var36), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12086(final SubLObject var36) {
        assert NIL != f12067(var36) : var36;
        final SubLObject var37 = module0201.f12550(print_high.prin1_to_string(var36));
        return var37;
    }
    
    public static SubLObject f12083(final SubLObject var36) {
        SubLObject var37 = $g2262$.getGlobalValue();
        if (NIL == var37) {
            var37 = module0034.f1934((SubLObject)$ic51$, (SubLObject)$ic52$, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var38 = module0034.f1814(var37, var36, (SubLObject)$ic53$);
        if (var38 == $ic53$) {
            var38 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f12086(var36)));
            module0034.f1816(var37, var36, var38, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var38);
    }
    
    public static SubLObject f12087(final SubLObject var18) {
        return module0201.f12550(Sequences.cconcatenate($g2258$.getGlobalValue(), module0038.f2618(var18)));
    }
    
    public static SubLObject f12088() {
        final SubLObject var40 = $g2263$.getGlobalValue();
        if (NIL != var40) {
            module0034.f1818(var40);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12089(final SubLObject var44) {
        return module0034.f1829($g2263$.getGlobalValue(), (SubLObject)ConsesLow.list(var44), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12090(final SubLObject var44) {
        assert NIL != module0201.f12546(var44) : var44;
        return f12079(reader.read_from_string_ignoring_errors(Symbols.symbol_name(var44), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)FOUR_INTEGER, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f12091(final SubLObject var44) {
        SubLObject var45 = $g2263$.getGlobalValue();
        if (NIL == var45) {
            var45 = module0034.f1934((SubLObject)$ic54$, (SubLObject)$ic56$, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var46 = module0034.f1814(var45, var44, (SubLObject)$ic53$);
        if (var46 == $ic53$) {
            var46 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f12090(var44)));
            module0034.f1816(var45, var44, var46, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var46);
    }
    
    public static SubLObject f12092(final SubLObject var45) {
        return Sort.sort(var45, (SubLObject)$ic57$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12093(final SubLObject var46) {
        return module0205.f13147(var46, (SubLObject)$ic58$, (SubLObject)$ic54$, (SubLObject)T, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12094(final SubLObject var46) {
        return module0205.f13147(var46, (SubLObject)$ic2$, (SubLObject)$ic49$, (SubLObject)T, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12095(final SubLObject var46) {
        f12096(var46);
        return f12093(var46);
    }
    
    public static SubLObject f12096(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0205.f13145((SubLObject)$ic59$, var46, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var47) && NIL != var48) {
            Errors.error((SubLObject)$ic60$, var46, var48);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12097(final SubLObject var48) {
        return module0201.f12546(var48);
    }
    
    public static SubLObject f12098(final SubLObject var49) {
        return module0035.f2399(var49, (SubLObject)$ic55$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12099(final SubLObject var50, final SubLObject var51) {
        final SubLObject var52 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic63$), var51, new SubLObject[] { Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic40$), module0035.f2160(Sequences.length(var51), (SubLObject)UNPROVIDED)) });
        return conses_high.sublis(var52, var50, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12100(final SubLObject var50, final SubLObject var53) {
        final SubLObject var54 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic63$), Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic40$), module0035.f2160(Sequences.length(var53), (SubLObject)UNPROVIDED)), new SubLObject[] { var53 });
        return conses_high.sublis(var54, var50, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12101(final SubLObject var54) {
        final SubLObject var55 = (SubLObject)ConsesLow.make_list(var54, (SubLObject)UNPROVIDED);
        SubLObject var56 = (SubLObject)NIL;
        SubLObject var57 = (SubLObject)NIL;
        var56 = (SubLObject)ZERO_INTEGER;
        for (var57 = var55; NIL != var57; var57 = var57.rest()) {
            ConsesLow.rplaca(var57, f12079(var56));
            var56 = Numbers.add(var56, (SubLObject)ONE_INTEGER);
        }
        return var55;
    }
    
    public static SubLObject f12102(final SubLObject var13) {
        return Sort.sort(module0035.f2399(var13, Symbols.symbol_function((SubLObject)$ic2$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)$ic64$), Symbols.symbol_function((SubLObject)$ic41$));
    }
    
    public static SubLObject f12103(final SubLObject var13) {
        return module0048.f3381(f12102(var13), Symbols.symbol_function((SubLObject)$ic41$));
    }
    
    public static SubLObject f12104(final SubLObject var13) {
        final SubLObject var14 = f12103(var13);
        return (SubLObject)((NIL != var14) ? f12073(var14) : NIL);
    }
    
    public static SubLObject f12105(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL == f12106(var13));
    }
    
    public static SubLObject f12106(final SubLObject var13) {
        if (var13.isAtom()) {
            return f12067(var13);
        }
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        var14 = var13;
        var15 = var14.first();
        while (!var14.rest().isAtom()) {
            if (NIL != f12106(var15)) {
                return (SubLObject)T;
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        return (SubLObject)makeBoolean(NIL != f12106(var15) || NIL != f12067(var14.rest()));
    }
    
    public static SubLObject f12107(final SubLObject var46) {
        return (SubLObject)makeBoolean(NIL == module0205.f13145((SubLObject)$ic69$, var46, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f12108(final SubLObject var46) {
        return (SubLObject)makeBoolean(NIL == module0205.f13145(Symbols.symbol_function((SubLObject)$ic2$), var46, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12110() {
        $g2257$ = SubLFiles.defconstant("S#14873", (SubLObject)Characters.CHAR_question);
        $g2258$ = SubLFiles.defconstant("S#14874", (SubLObject)$ic0$);
        $g2259$ = SubLFiles.defconstant("S#14875", (SubLObject)$ic1$);
        $g2260$ = SubLFiles.deflexical("S#14876", (SubLObject)$ic25$);
        $g2261$ = SubLFiles.deflexical("S#14877", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic26$)) ? $g2261$.getGlobalValue() : NIL));
        $g2262$ = SubLFiles.deflexical("S#14878", (SubLObject)NIL);
        $g2263$ = SubLFiles.deflexical("S#14879", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12111() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g2259$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic9$);
        Structures.def_csetf((SubLObject)$ic10$, (SubLObject)$ic11$);
        Equality.identity((SubLObject)$ic1$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g2259$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic18$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g2259$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic21$));
        module0012.f368((SubLObject)$ic2$, (SubLObject)$ic22$, (SubLObject)$ic23$, (SubLObject)NIL, (SubLObject)$ic24$);
        module0003.f57((SubLObject)$ic26$);
        f12076();
        module0012.f368((SubLObject)$ic28$, (SubLObject)NIL, (SubLObject)$ic29$, (SubLObject)NIL, (SubLObject)$ic30$);
        module0012.f368((SubLObject)$ic41$, (SubLObject)$ic42$, (SubLObject)$ic43$, (SubLObject)$ic44$, (SubLObject)$ic30$);
        module0012.f368((SubLObject)$ic40$, (SubLObject)$ic3$, (SubLObject)$ic46$, (SubLObject)$ic47$, (SubLObject)$ic48$);
        module0012.f368((SubLObject)$ic49$, (SubLObject)$ic42$, (SubLObject)$ic50$, (SubLObject)$ic44$, (SubLObject)NIL);
        module0034.f1909((SubLObject)$ic51$);
        module0034.f1909((SubLObject)$ic54$);
        module0002.f35((SubLObject)$ic61$, (SubLObject)$ic62$);
        module0012.f368((SubLObject)$ic65$, (SubLObject)$ic22$, (SubLObject)$ic66$, (SubLObject)NIL, (SubLObject)$ic24$);
        module0012.f368((SubLObject)$ic67$, (SubLObject)$ic22$, (SubLObject)$ic68$, (SubLObject)NIL, (SubLObject)$ic24$);
        return (SubLObject)NIL;
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
        $g2257$ = null;
        $g2258$ = null;
        $g2259$ = null;
        $g2260$ = null;
        $g2261$ = null;
        $g2262$ = null;
        $g2263$ = null;
        $ic0$ = makeString("?VAR");
        $ic1$ = makeSymbol("VARIABLE");
        $ic2$ = makeSymbol("VARIABLE-P");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("S#1519", "CYC"));
        $ic4$ = ConsesLow.list((SubLObject)makeKeyword("ID"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#14845", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#14846", "CYC"));
        $ic7$ = makeSymbol("S#14850", "CYC");
        $ic8$ = makeSymbol("S#14844", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("VARIABLE-P"));
        $ic10$ = makeSymbol("S#14845", "CYC");
        $ic11$ = makeSymbol("S#14846", "CYC");
        $ic12$ = makeKeyword("ID");
        $ic13$ = makeString("Invalid slot ~S for construction function");
        $ic14$ = makeKeyword("BEGIN");
        $ic15$ = makeSymbol("S#14847", "CYC");
        $ic16$ = makeKeyword("SLOT");
        $ic17$ = makeKeyword("END");
        $ic18$ = makeSymbol("S#14849", "CYC");
        $ic19$ = makeString("~Cvar~D");
        $ic20$ = makeInteger(99);
        $ic21$ = makeSymbol("S#14842", "CYC");
        $ic22$ = ConsesLow.list((SubLObject)makeSymbol("OBJECT", "CYC"));
        $ic23$ = makeString("Return T iff OBJECT is an HL variable.");
        $ic24$ = ConsesLow.list((SubLObject)makeSymbol("BOOLEANP"));
        $ic25$ = makeInteger(200);
        $ic26$ = makeSymbol("S#14877", "CYC");
        $ic27$ = makeSymbol("FIXNUMP");
        $ic28$ = makeSymbol("VARIABLE-COUNT");
        $ic29$ = makeString("Return the total number of HL variables.");
        $ic30$ = ConsesLow.list((SubLObject)makeSymbol("INTEGERP"));
        $ic31$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14880", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic32$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic33$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic34$ = makeKeyword("DONE");
        $ic35$ = makeUninternedSymbol("US#3567090");
        $ic36$ = makeSymbol("DO-NUMBERS");
        $ic37$ = makeKeyword("START");
        $ic38$ = ConsesLow.list((SubLObject)makeSymbol("VARIABLE-COUNT"));
        $ic39$ = makeSymbol("CLET");
        $ic40$ = makeSymbol("FIND-VARIABLE-BY-ID");
        $ic41$ = makeSymbol("VARIABLE-ID");
        $ic42$ = ConsesLow.list((SubLObject)makeSymbol("VARIABLE"));
        $ic43$ = makeString("Return id of HL variable VARIABLE.");
        $ic44$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VARIABLE"), (SubLObject)makeSymbol("VARIABLE-P")));
        $ic45$ = makeSymbol("INTEGERP");
        $ic46$ = makeString("Return the HL variable with ID, or NIL if not present.");
        $ic47$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)makeSymbol("INTEGERP")));
        $ic48$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#664", "CYC"), (SubLObject)makeSymbol("VARIABLE-P")));
        $ic49$ = makeSymbol("DEFAULT-EL-VAR-FOR-HL-VAR");
        $ic50$ = makeString("Return a readable EL var from HL var VARIABLE.");
        $ic51$ = makeSymbol("S#14857", "CYC");
        $ic52$ = makeSymbol("S#14878", "CYC");
        $ic53$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic54$ = makeSymbol("HL-VAR-FOR-DEFAULT-EL-VAR");
        $ic55$ = makeSymbol("EL-VAR?");
        $ic56$ = makeSymbol("S#14879", "CYC");
        $ic57$ = makeSymbol("S#14843", "CYC");
        $ic58$ = makeSymbol("DEFAULT-EL-VAR?");
        $ic59$ = makeSymbol("S#14881", "CYC");
        $ic60$ = makeString("~s contained the non-default EL variable ~s, which is not handled yet.");
        $ic61$ = makeSymbol("S#14866", "CYC");
        $ic62$ = ConsesLow.list((SubLObject)makeSymbol("EL-VAR?"));
        $ic63$ = makeSymbol("CONS");
        $ic64$ = makeSymbol("<");
        $ic65$ = makeSymbol("FULLY-BOUND-P");
        $ic66$ = makeString("Return T iff OBJECT contains no HL variables, and therefore is fully bound.");
        $ic67$ = makeSymbol("NOT-FULLY-BOUND-P");
        $ic68$ = makeString("Return T iff OBJECT contains some HL variable, and therefore is not fully bound.");
        $ic69$ = makeSymbol("S#12629", "CYC");
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
            structDecl = Structures.makeStructDeclNative((Class)$variable_native.class, $ic1$, $ic2$, $ic3$, $ic4$, new String[] { "$id" }, $ic5$, $ic6$, $ic7$);
        }
    }
    
    public static final class $f12067$UnaryFunction extends UnaryFunction
    {
        public $f12067$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("VARIABLE-P"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f12067(var3);
        }
    }
    
    public static final class $f12074$UnaryFunction extends UnaryFunction
    {
        public $f12074$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#14842"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f12074(var3);
        }
    }
    
    public static final class $f12080$BinaryFunction extends BinaryFunction
    {
        public $f12080$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#14843"));
        }
        
        public SubLObject processItem(final SubLObject var3, final SubLObject var39) {
            return f12080(var3, var39);
        }
    }
    
    public static final class $f12105$UnaryFunction extends UnaryFunction
    {
        public $f12105$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FULLY-BOUND-P"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f12105(var3);
        }
    }
    
    public static final class $f12106$UnaryFunction extends UnaryFunction
    {
        public $f12106$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NOT-FULLY-BOUND-P"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f12106(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 189 ms
	
	Decompiled with Procyon 0.5.32.
*/