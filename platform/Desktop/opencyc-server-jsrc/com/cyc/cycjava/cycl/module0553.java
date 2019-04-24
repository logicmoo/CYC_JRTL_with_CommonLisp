package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0553 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0553";
    public static final String myFingerPrint = "b1d99683a4520643561cb507dbdc1f2af2e23f1b149662ad54a2de0e531f8569";
    public static SubLSymbol $g4003$;
    public static SubLSymbol $g4004$;
    public static SubLSymbol $g4005$;
    public static SubLSymbol $g4006$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLInteger $ic9$;
    private static final SubLInteger $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    
    public static SubLObject f34174(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return module0107.f7604(var1, module0553.$g4003$.getDynamicValue(var3), var2, module0553.$g4005$.getDynamicValue(var3), (SubLObject)module0553.UNPROVIDED, (SubLObject)module0553.UNPROVIDED);
    }
    
    public static SubLObject f34175(final SubLObject var1, final SubLObject var2, SubLObject var4, SubLObject var5) {
        if (var4 == module0553.UNPROVIDED) {
            var4 = (SubLObject)module0553.$ic2$;
        }
        if (var5 == module0553.UNPROVIDED) {
            var5 = (SubLObject)module0553.NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        return module0107.f7603(var1, module0553.$g4003$.getDynamicValue(var6), var2, module0553.$g4005$.getDynamicValue(var6), var5, var4, Symbols.symbol_function((SubLObject)module0553.EQUAL), Symbols.symbol_function((SubLObject)module0553.EQUAL), Symbols.symbol_function((SubLObject)module0553.EQUAL));
    }
    
    public static SubLObject f34176(final SubLObject var6) {
        if (var6.isString()) {
            final SubLObject var7 = module0038.f2851(var6, (SubLObject)Characters.CHAR_lparen);
            final SubLObject var8 = module0038.f2851(var6, (SubLObject)Characters.CHAR_rparen);
            return Numbers.numE(var7, var8);
        }
        return (SubLObject)module0553.NIL;
    }
    
    public static SubLObject f34177(final SubLObject var6) {
        if (var6.isString()) {
            final SubLObject var7 = module0038.f2851(var6, (SubLObject)Characters.CHAR_quotation);
            return Numbers.evenp(var7);
        }
        return (SubLObject)module0553.NIL;
    }
    
    public static SubLObject f34178(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (!var6.isString() || !Sequences.length(var6).numG((SubLObject)module0553.ZERO_INTEGER)) {
            return (SubLObject)module0553.NIL;
        }
        final SubLObject var8 = Strings.make_string(Numbers.add((SubLObject)module0553.ONE_INTEGER, Numbers.multiply(Sequences.length(var6), (SubLObject)module0553.TWO_INTEGER)), (SubLObject)module0553.UNPROVIDED);
        SubLObject var9 = (SubLObject)module0553.ZERO_INTEGER;
        SubLObject var10 = (SubLObject)module0553.NIL;
        final SubLObject var11 = Sequences.length(var6);
        SubLObject var12 = (SubLObject)module0553.NIL;
        var12 = (SubLObject)module0553.ZERO_INTEGER;
        while (!var9.numGE(var11)) {
            final SubLObject var13 = Strings.sublisp_char(var6, var9);
            final SubLObject var14 = (SubLObject)(Numbers.subtract(var9, (SubLObject)module0553.ONE_INTEGER).numGE((SubLObject)module0553.ZERO_INTEGER) ? Strings.sublisp_char(var6, Numbers.subtract(var9, (SubLObject)module0553.ONE_INTEGER)) : module0553.NIL);
            final SubLObject var15 = (SubLObject)(Numbers.add(var9, (SubLObject)module0553.ONE_INTEGER).numL(var11) ? Strings.sublisp_char(var6, Numbers.add(var9, (SubLObject)module0553.ONE_INTEGER)) : module0553.NIL);
            final SubLObject var16 = (SubLObject)(Numbers.add(var9, (SubLObject)module0553.TWO_INTEGER).numL(var11) ? Strings.sublisp_char(var6, Numbers.add(var9, (SubLObject)module0553.TWO_INTEGER)) : module0553.NIL);
            final SubLObject var17 = (SubLObject)(Numbers.add(var9, (SubLObject)module0553.THREE_INTEGER).numL(var11) ? Strings.sublisp_char(var6, Numbers.add(var9, (SubLObject)module0553.THREE_INTEGER)) : module0553.NIL);
            if (module0553.NIL == Sequences.find(var13, module0553.$g4006$.getDynamicValue(var7), (SubLObject)module0553.UNPROVIDED, (SubLObject)module0553.UNPROVIDED, (SubLObject)module0553.UNPROVIDED, (SubLObject)module0553.UNPROVIDED) && (!var13.isChar() || module0553.NIL == Sequences.find(Characters.char_code(var13), (SubLObject)module0553.$ic3$, (SubLObject)module0553.UNPROVIDED, (SubLObject)module0553.UNPROVIDED, (SubLObject)module0553.UNPROVIDED, (SubLObject)module0553.UNPROVIDED)) && module0553.NIL == var10 && module0553.NIL == module0038.f2727(Sequences.subseq(var6, var9, Sequences.position_if(Symbols.symbol_function((SubLObject)module0553.$ic4$), var6, Symbols.symbol_function((SubLObject)module0553.IDENTITY), var9, (SubLObject)module0553.UNPROVIDED))) && (!var13.eql((SubLObject)Characters.CHAR_hyphen) || !var15.isChar() || module0553.NIL == Characters.digit_char_p(var15, (SubLObject)module0553.UNPROVIDED)) && (!module0038.f2856((SubLObject)ConsesLow.list(var13, var15, var16)).equalp((SubLObject)module0553.$ic5$) || module0553.NIL == Sequences.find(var17, (SubLObject)module0553.$ic6$, (SubLObject)module0553.UNPROVIDED, (SubLObject)module0553.UNPROVIDED, (SubLObject)module0553.UNPROVIDED, (SubLObject)module0553.UNPROVIDED)) && (module0553.NIL != Sequences.find(var14, (SubLObject)module0553.$ic7$, (SubLObject)module0553.UNPROVIDED, (SubLObject)module0553.UNPROVIDED, (SubLObject)module0553.UNPROVIDED, (SubLObject)module0553.UNPROVIDED) || module0553.NIL == var14)) {
                Vectors.set_aref(var8, var12, (SubLObject)Characters.CHAR_hash);
                var12 = Numbers.add(var12, (SubLObject)module0553.ONE_INTEGER);
                Vectors.set_aref(var8, var12, module0129.f8494());
                var12 = Numbers.add(var12, (SubLObject)module0553.ONE_INTEGER);
                Vectors.set_aref(var8, var12, var13);
                var9 = Numbers.add(var9, (SubLObject)module0553.ONE_INTEGER);
            }
            else if (module0553.NIL == var10 && var14.eql((SubLObject)Characters.CHAR_quote)) {
                var12 = Numbers.subtract(var12, (SubLObject)module0553.ONE_INTEGER);
                Vectors.set_aref(var8, var12, var13);
                var9 = Numbers.add(var9, (SubLObject)module0553.ONE_INTEGER);
            }
            else {
                Vectors.set_aref(var8, var12, var13);
                var9 = Numbers.add(var9, (SubLObject)module0553.ONE_INTEGER);
            }
            if (module0553.NIL != Characters.charE((SubLObject)Characters.CHAR_quotation, var13) && module0553.NIL == var10) {
                var10 = (SubLObject)module0553.T;
            }
            else if (module0553.NIL != Characters.charE((SubLObject)Characters.CHAR_quotation, var13) && module0553.NIL != var10) {
                var10 = (SubLObject)module0553.NIL;
            }
            var12 = Numbers.add(var12, (SubLObject)module0553.ONE_INTEGER);
        }
        final SubLObject var18 = module0038.f2784(var8, (SubLObject)module0553.UNPROVIDED);
        if (Sequences.length(var18).numGE((SubLObject)module0553.ZERO_INTEGER)) {
            return var18;
        }
        return (SubLObject)module0553.NIL;
    }
    
    public static SubLObject f34179(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (module0553.NIL != module0038.f2653(var6)) {
            if (module0553.NIL != module0126.f8389(var6)) {
                final SubLObject var8 = module0166.f10737(var6);
                if (module0553.NIL != module0128.f8463(var8, (SubLObject)module0553.UNPROVIDED)) {
                    return var8;
                }
            }
            if (module0553.NIL != module0213.f13916(var6)) {
                final SubLObject var9 = module0213.f13917(var6);
                if (module0553.NIL != module0206.f13444(var9)) {
                    return var9;
                }
            }
            else if (module0553.NIL != module0213.f13913(var6)) {
                final SubLObject var9 = module0213.f13921(var6);
                if (module0553.NIL != module0206.f13444(var9)) {
                    return var9;
                }
            }
            else if (module0553.NIL != Guids.guid_string_p(var6)) {
                final SubLObject var9 = module0166.f10747(var6);
                if (module0553.NIL != var9) {
                    return var9;
                }
            }
            else if (module0553.NIL != f34176(var6) && module0553.NIL != f34177(var6)) {
                final SubLObject var10 = module0018.$g571$.currentBinding(var7);
                try {
                    module0018.$g571$.bind((SubLObject)module0553.T, var7);
                    return reader.read_from_string_ignoring_errors(f34178(var6), (SubLObject)module0553.UNPROVIDED, (SubLObject)module0553.UNPROVIDED, (SubLObject)module0553.UNPROVIDED, (SubLObject)module0553.UNPROVIDED);
                }
                finally {
                    module0018.$g571$.rebind(var10, var7);
                }
            }
        }
        return (SubLObject)module0553.NIL;
    }
    
    public static SubLObject f34180(final SubLObject var6) {
        SubLObject var7 = f34179(var6);
        if (module0553.NIL != module0173.f10955(var7)) {
            return var7;
        }
        if (module0553.NIL != module0210.f13594(var7)) {
            var7 = module0172.f10921(var7);
            if (module0553.NIL != module0167.f10813(var7)) {
                return var7;
            }
        }
        return (SubLObject)module0553.NIL;
    }
    
    public static SubLObject f34181(final SubLObject var6) {
        final SubLObject var7 = f34179(var6);
        return f34182(var7);
    }
    
    public static SubLObject f34182(SubLObject var22) {
        if (module0553.NIL != module0167.f10813(var22)) {
            return var22;
        }
        if (module0553.NIL != module0210.f13594(var22)) {
            var22 = module0172.f10921(var22);
            if (module0553.NIL != module0167.f10813(var22)) {
                return var22;
            }
        }
        return (SubLObject)module0553.NIL;
    }
    
    public static SubLObject f34183(final SubLObject var6) {
        final SubLObject var7 = f34179(var6);
        final SubLObject var8 = f34182(var7);
        if (module0553.NIL != var8) {
            return var8;
        }
        if (module0553.NIL != module0210.f13595(var7, (SubLObject)module0553.UNPROVIDED)) {
            return var7;
        }
        return (SubLObject)module0553.NIL;
    }
    
    public static SubLObject f34184(final SubLObject var25) {
        final SubLObject var26 = Characters.char_code(var25);
        return (SubLObject)SubLObjectFactory.makeBoolean(var26.numG((SubLObject)module0553.$ic9$) && var26.numL((SubLObject)module0553.$ic10$));
    }
    
    public static SubLObject f34185(final SubLObject var6, SubLObject var27) {
        if (var27 == module0553.UNPROVIDED) {
            var27 = (SubLObject)module0553.NIL;
        }
        SubLObject var28 = (SubLObject)module0553.NIL;
        SubLObject var30_31;
        SubLObject var29;
        SubLObject var30;
        SubLObject var31;
        SubLObject var32;
        for (var29 = (var30_31 = Sequences.length(var6)), var30 = (SubLObject)module0553.NIL, var30 = (SubLObject)module0553.ZERO_INTEGER; !var30.numGE(var30_31); var30 = module0048.f_1X(var30)) {
            var31 = Strings.sublisp_char(var6, var30);
            var32 = Characters.char_code(var31);
            if (module0553.NIL != Characters.charE(var31, (SubLObject)Characters.CHAR_quotation)) {
                var28 = (SubLObject)SubLObjectFactory.makeBoolean(module0553.NIL == var28);
            }
            if (module0553.NIL == f34184(var31) && (module0553.NIL == var28 || module0553.NIL == conses_high.member(var32, (SubLObject)module0553.$ic3$, (SubLObject)module0553.UNPROVIDED, (SubLObject)module0553.UNPROVIDED) || module0553.NIL != var27)) {
                Strings.set_char(var6, var30, (SubLObject)Characters.CHAR_space);
            }
        }
        return var6;
    }
    
    public static SubLObject f34186(final SubLObject var33) {
        if (f34174(module0574.f35152(), (SubLObject)module0553.$ic11$).equal((SubLObject)module0553.$ic12$) && module0553.NIL != module0259.f16891(var33, module0553.$ic13$)) {
            return (SubLObject)module0553.$ic14$;
        }
        if (f34174(module0574.f35152(), (SubLObject)module0553.$ic11$) == module0553.$ic14$) {
            return (SubLObject)module0553.$ic14$;
        }
        return (SubLObject)module0553.$ic15$;
    }
    
    public static SubLObject f34187(final SubLObject var34) {
        SubLObject var35 = var34;
        SubLObject var36 = (SubLObject)module0553.NIL;
        var36 = var35.first();
        while (module0553.NIL != var35) {
            if (module0553.NIL == module0004.f104(var36, f34174(module0574.f35152(), (SubLObject)module0553.$ic16$), Symbols.symbol_function((SubLObject)module0553.EQUALP), (SubLObject)module0553.UNPROVIDED)) {
                module0543.f33618(var36);
                f34175(module0574.f35152(), (SubLObject)module0553.$ic16$, (SubLObject)module0553.$ic17$, var36);
            }
            var35 = var35.rest();
            var36 = var35.first();
        }
        return (SubLObject)module0553.NIL;
    }
    
    public static SubLObject f34188() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0553", "f34174", "S#37418", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0553", "f34175", "S#37419", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0553", "f34176", "S#37420", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0553", "f34177", "S#37421", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0553", "f34178", "S#37422", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0553", "f34179", "S#37423", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0553", "f34180", "S#37424", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0553", "f34181", "S#37425", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0553", "f34182", "S#37426", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0553", "f34183", "S#37427", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0553", "f34184", "S#37428", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0553", "f34185", "S#37429", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0553", "f34186", "S#37430", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0553", "f34187", "S#37431", 1, 0, false);
        return (SubLObject)module0553.NIL;
    }
    
    public static SubLObject f34189() {
        module0553.$g4003$ = SubLFiles.defparameter("S#37432", (SubLObject)module0553.NIL);
        module0553.$g4004$ = SubLFiles.defparameter("S#37433", (SubLObject)module0553.NIL);
        module0553.$g4005$ = SubLFiles.defparameter("S#37434", (SubLObject)module0553.$ic0$);
        module0553.$g4006$ = SubLFiles.defparameter("S#37435", (SubLObject)module0553.$ic1$);
        return (SubLObject)module0553.NIL;
    }
    
    public static SubLObject f34190() {
        return (SubLObject)module0553.NIL;
    }
    
    public void declareFunctions() {
        f34188();
    }
    
    public void initializeVariables() {
        f34189();
    }
    
    public void runTopLevelForms() {
        f34190();
    }
    
    static {
        me = (SubLFile)new module0553();
        module0553.$g4003$ = null;
        module0553.$g4004$ = null;
        module0553.$g4005$ = null;
        module0553.$g4006$ = null;
        $ic0$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)module0553.ZERO_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("TV"), (SubLObject)module0553.ONE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)module0553.TWO_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)module0553.THREE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("UNKNOWNS"), (SubLObject)module0553.FOUR_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ALREADY-CREATED"), (SubLObject)module0553.FIVE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("OK-TOKEN-FORMS"), (SubLObject)module0553.SIX_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("MALFORMED"), (SubLObject)module0553.SEVEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ALREADY-IN-KB"), (SubLObject)module0553.EIGHT_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORMS-TO-EVAL"), (SubLObject)module0553.NINE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("MODE"), (SubLObject)module0553.TEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("COMPOSE-HISTORY"), (SubLObject)module0553.ELEVEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NOT-IN-KB"), (SubLObject)module0553.TWELVE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NOT-VALID-CONSTANTS"), (SubLObject)module0553.THIRTEEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ALREADY-CONSTANTS"), (SubLObject)module0553.FOURTEEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("APPLICATION"), (SubLObject)module0553.FIFTEEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DEFAULT-MT"), (SubLObject)module0553.SIXTEEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DIALOG-SCRIPT"), (SubLObject)module0553.SEVENTEEN_INTEGER) });
        $ic1$ = ConsesLow.list(new SubLObject[] { Characters.CHAR_space, Characters.CHAR_quotation, Characters.CHAR_quote, Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_hash, Characters.CHAR_percent, Characters.CHAR_question, Characters.CHAR_dollar, Characters.CHAR_colon });
        $ic2$ = SubLObjectFactory.makeKeyword("REPLACE");
        $ic3$ = ConsesLow.list((SubLObject)module0553.NINE_INTEGER, (SubLObject)module0553.TEN_INTEGER, (SubLObject)module0553.THIRTEEN_INTEGER);
        $ic4$ = SubLObjectFactory.makeSymbol("S#10491", "CYC");
        $ic5$ = SubLObjectFactory.makeString("nil");
        $ic6$ = ConsesLow.list((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_rparen);
        $ic7$ = ConsesLow.list((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_lparen);
        $ic8$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic9$ = SubLObjectFactory.makeInteger(31);
        $ic10$ = SubLObjectFactory.makeInteger(127);
        $ic11$ = SubLObjectFactory.makeKeyword("TV");
        $ic12$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic13$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("DefaultMonotonicPredicate"));
        $ic14$ = SubLObjectFactory.makeKeyword("MONOTONIC");
        $ic15$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic16$ = SubLObjectFactory.makeKeyword("ALREADY-CREATED");
        $ic17$ = SubLObjectFactory.makeKeyword("CONS");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0553.class
	Total time: 134 ms
	
	Decompiled with Procyon 0.5.32.
*/