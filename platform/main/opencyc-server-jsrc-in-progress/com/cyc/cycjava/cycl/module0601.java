package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0601 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0601";
    public static final String myFingerPrint = "e6ee66b7cc49ae6277a112165516d31128bbba2a38bf3e276a0b060d0454452b";
    public static SubLSymbol $g4651$;
    public static SubLSymbol $g4652$;
    public static SubLSymbol $g4653$;
    public static SubLSymbol $g4654$;
    private static SubLSymbol $g4655$;
    private static SubLSymbol $g4656$;
    private static SubLSymbol $g4657$;
    private static SubLSymbol $g4658$;
    public static SubLSymbol $g4659$;
    private static SubLSymbol $g4660$;
    private static final SubLFloat $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLList $ic37$;
    private static final SubLList $ic38$;
    private static final SubLList $ic39$;
    private static final SubLString $ic40$;
    private static final SubLInteger $ic41$;
    private static final SubLString $ic42$;
    private static final SubLInteger $ic43$;
    private static final SubLString $ic44$;
    private static final SubLInteger $ic45$;
    private static final SubLString $ic46$;
    private static final SubLInteger $ic47$;
    private static final SubLString $ic48$;
    private static final SubLInteger $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
    private static final SubLString $ic62$;
    private static final SubLList $ic63$;
    private static final SubLString $ic64$;
    private static final SubLList $ic65$;
    private static final SubLList $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLList $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLString $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    
    public static SubLObject f36743() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g4651$.getDynamicValue(var1);
    }
    
    public static SubLObject f36744(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0587.$g4457$.getDynamicValue();
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return module0038.f2648(var2, $g4652$.getDynamicValue(var3));
    }
    
    public static SubLObject f36745(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)$ic2$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f36746() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        streams_high.terpri(module0587.$g4457$.getDynamicValue(var1));
        f36744((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36747(final SubLObject var8, SubLObject var9, SubLObject var10) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)ZERO_INTEGER;
        }
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        if (NIL != module0035.find_if_not((SubLObject)$ic3$, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            SubLObject var13_14;
            SubLObject var12;
            SubLObject var13;
            SubLObject var14;
            for (var12 = (var13_14 = ((NIL != var10) ? var10 : Sequences.length(var8))), var13 = (SubLObject)NIL, var13 = var9; !var13.numGE(var13_14); var13 = module0048.f_1X(var13)) {
                var14 = Strings.sublisp_char(var8, var13);
                if (NIL != f36748(var14)) {
                    streams_high.write_char(var14, module0587.$g4457$.getDynamicValue(var11));
                }
                else {
                    Errors.warn((SubLObject)$ic4$, var14, var8);
                }
            }
        }
        else {
            streams_high.write_string(var8, module0587.$g4457$.getDynamicValue(var11), var9, var10);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36749(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        assert NIL != f36748(var16) : var16;
        streams_high.write_char(var16, module0587.$g4457$.getDynamicValue(var17));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36750(final SubLObject var8, SubLObject var9, SubLObject var10) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)ZERO_INTEGER;
        }
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        if (NIL == var10) {
            var10 = Sequences.length(var8);
        }
        while (var9.numL(var10)) {
            final SubLObject var11 = Sequences.position((SubLObject)Characters.CHAR_newline, var8, Symbols.symbol_function((SubLObject)$ic5$), Symbols.symbol_function((SubLObject)IDENTITY), var9, var10);
            final SubLObject var12 = var11.isFixnum() ? var11 : var10;
            f36747(var8, var9, var12);
            if (var11.isFixnum()) {
                f36746();
            }
            var9 = Numbers.add(var12, (SubLObject)ONE_INTEGER);
        }
        return var8;
    }
    
    public static SubLObject f36751(SubLObject var19, SubLObject var20, SubLObject var21) {
        if (var19 == UNPROVIDED) {
            var19 = $g4651$.getDynamicValue();
        }
        if (var20 == UNPROVIDED) {
            var20 = (SubLObject)$ic6$;
        }
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)T;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        assert NIL != Types.floatp(var19) : var19;
        assert NIL != Types.stringp(var20) : var20;
        assert NIL != Types.booleanp(var21) : var21;
        f36747((SubLObject)$ic10$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var23 = reader.$read_default_float_format$.currentBinding(var22);
        try {
            reader.$read_default_float_format$.bind((SubLObject)$ic11$, var22);
            print_high.prin1(print_high.prin1_to_string(var19), module0587.$g4457$.getDynamicValue(var22));
        }
        finally {
            reader.$read_default_float_format$.rebind(var23, var22);
        }
        f36747((SubLObject)$ic12$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        print_high.prin1(var20, module0587.$g4457$.getDynamicValue(var22));
        f36747((SubLObject)$ic13$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        print_high.prin1((SubLObject)((NIL != var21) ? $ic14$ : $ic15$), module0587.$g4457$.getDynamicValue(var22));
        f36747((SubLObject)$ic16$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        streams_high.terpri(module0587.$g4457$.getDynamicValue(var22));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36752() {
        return $g4655$.getGlobalValue();
    }
    
    public static SubLObject f36753() {
        return $g4656$.getGlobalValue();
    }
    
    public static SubLObject f36754(final SubLObject var8) {
        f36747(f36752(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f36747(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f36747(f36753(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36755(final SubLObject var8) {
        f36747(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36756(final SubLObject var8) {
        f36747((SubLObject)$ic19$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f36747(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f36747((SubLObject)$ic20$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36757(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic21$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic21$);
        var8 = var6.first();
        var6 = var6.rest();
        final SubLObject var9 = (SubLObject)(var6.isCons() ? var6.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var6, var5, (SubLObject)$ic21$);
        var6 = var6.rest();
        final SubLObject var10 = (SubLObject)(var6.isCons() ? var6.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var6, var5, (SubLObject)$ic21$);
        var6 = var6.rest();
        final SubLObject var11 = (SubLObject)(var6.isCons() ? var6.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var6, var5, (SubLObject)$ic21$);
        var6 = var6.rest();
        final SubLObject var12 = (SubLObject)(var6.isCons() ? var6.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var6, var5, (SubLObject)$ic21$);
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var13;
            var6 = (var13 = var7);
            return (SubLObject)ConsesLow.list((SubLObject)$ic22$, (SubLObject)ConsesLow.listS((SubLObject)$ic23$, (SubLObject)ConsesLow.list((SubLObject)$ic24$, var8, var9, var10, var12), ConsesLow.append(var13, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic25$, var10, (SubLObject)ConsesLow.listS((SubLObject)$ic25$, var11, (SubLObject)$ic26$), (SubLObject)ConsesLow.list((SubLObject)$ic27$, var8)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic21$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36758(final SubLObject var26, final SubLObject var27, final SubLObject var28, SubLObject var30) {
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)NIL;
        }
        f36749((SubLObject)Characters.CHAR_less);
        f36747(var26, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var31 = (SubLObject)NIL;
        SubLObject var32 = (SubLObject)NIL;
        SubLObject var33 = (SubLObject)NIL;
        var31 = var27;
        var32 = var31.first();
        var33 = conses_high.second(var31);
        while (NIL != var32) {
            f36749((SubLObject)Characters.CHAR_space);
            f36747(var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f36747((SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f36759(var33.isString() ? var33 : print_high.prin1_to_string(var33));
            f36749((SubLObject)Characters.CHAR_quotation);
            if (NIL != var30) {
                f36746();
            }
            var31 = conses_high.cddr(var31);
            var32 = var31.first();
            var33 = conses_high.second(var31);
        }
        if (NIL != var28) {
            f36747((SubLObject)$ic29$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            f36749((SubLObject)Characters.CHAR_greater);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36760(final SubLObject var26) {
        f36747((SubLObject)$ic30$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f36747(var26, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f36749((SubLObject)Characters.CHAR_greater);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36761(final SubLObject var34, SubLObject var35) {
        if (var35 == UNPROVIDED) {
            var35 = module0587.$g4458$.getDynamicValue();
        }
        f36762(module0038.f2624(var34), var35);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36763(final SubLObject var34, SubLObject var35) {
        if (var35 == UNPROVIDED) {
            var35 = module0587.$g4458$.getDynamicValue();
        }
        f36762(print_high.prin1_to_string(var34), var35);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36764(final SubLObject var34, SubLObject var35) {
        if (var35 == UNPROVIDED) {
            var35 = module0587.$g4458$.getDynamicValue();
        }
        f36765(module0038.f2624(var34), var35);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36766(final SubLObject var34, SubLObject var35) {
        if (var35 == UNPROVIDED) {
            var35 = module0587.$g4458$.getDynamicValue();
        }
        f36765(print_high.prin1_to_string(var34), var35);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36762(final SubLObject var8, SubLObject var35) {
        if (var35 == UNPROVIDED) {
            var35 = module0587.$g4458$.getDynamicValue();
        }
        assert NIL != Types.stringp(var8) : var8;
        SubLObject var36;
        SubLObject var37;
        SubLObject var38;
        SubLObject var39;
        for (var36 = Sequences.length(var8), var37 = (SubLObject)NIL, var37 = (SubLObject)ZERO_INTEGER; var37.numL(var36); var37 = Numbers.add(var37, (SubLObject)ONE_INTEGER)) {
            var38 = Strings.sublisp_char(var8, var37);
            var39 = conses_high.assoc(var38, var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var39) {
                f36747(Sequences.cconcatenate((SubLObject)$ic31$, new SubLObject[] { var39.rest(), $ic32$ }), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                f36749(var38);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36765(final SubLObject var8, SubLObject var35) {
        if (var35 == UNPROVIDED) {
            var35 = module0587.$g4458$.getDynamicValue();
        }
        assert NIL != Types.stringp(var8) : var8;
        f36762(var8, var35);
        f36749((SubLObject)Characters.CHAR_newline);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36767(final SubLObject var26) {
        return (SubLObject)makeBoolean(NIL != module0038.f2611(var26) && NIL != ((NIL != module0039.f3006(var26)) ? f36768(var26) : f36769(var26)));
    }
    
    public static SubLObject f36770(final SubLObject var26) {
        assert NIL != Types.stringp(var26) : var26;
        return (NIL != module0039.f3006(var26)) ? f36771(var26) : f36772(var26);
    }
    
    public static SubLObject f36768(final SubLObject var26) {
        return (SubLObject)makeBoolean(NIL != f36773(module0038.f2636(var26)) && NIL == module0035.find_if_not((SubLObject)$ic33$, var26, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f36773(final SubLObject var16) {
        return (SubLObject)makeBoolean(var16.eql((SubLObject)Characters.CHAR_underbar) || var16.eql((SubLObject)Characters.CHAR_colon) || NIL != f36774(var16));
    }
    
    public static SubLObject f36775(final SubLObject var40) {
        return (SubLObject)makeBoolean(var40.eql(Characters.char_code((SubLObject)Characters.CHAR_underbar)) || var40.eql(Characters.char_code((SubLObject)Characters.CHAR_colon)) || NIL != f36776(var40));
    }
    
    public static SubLObject f36769(final SubLObject var26) {
        final SubLObject var27 = module0039.f3044(var26);
        return (SubLObject)makeBoolean((module0038.f2636(var26).eql((SubLObject)Characters.CHAR_underbar) || module0038.f2636(var26).eql((SubLObject)Characters.CHAR_colon) || NIL != f36776(Vectors.aref(var27, (SubLObject)ZERO_INTEGER))) && NIL == module0035.find_if_not((SubLObject)$ic34$, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f36777(final SubLObject var16) {
        return f36778(Characters.char_code(var16));
    }
    
    public static SubLObject f36771(final SubLObject var26) {
        SubLObject var27;
        for (var27 = var26; NIL == module0038.f2608(var27) && NIL == f36773(module0038.f2636(var27)); var27 = module0038.f2623(var27, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {}
        return module0035.remove_if_not((SubLObject)$ic33$, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36772(final SubLObject var26) {
        SubLObject var27 = module0039.f3044(var26);
        SubLObject var28 = (SubLObject)NIL;
        while (NIL == module0035.f1995(var27, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED) && NIL == f36775(Vectors.aref(var27, (SubLObject)ZERO_INTEGER))) {
            var28 = (SubLObject)T;
            var27 = Sequences.subseq(var27, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        }
        if (NIL != var28 || NIL != module0035.find_if_not((SubLObject)$ic34$, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return module0039.f3048(module0039.f3018(module0035.delete_if_not((SubLObject)$ic34$, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return var26;
    }
    
    public static SubLObject f36778(final SubLObject var40) {
        return (SubLObject)makeBoolean(NIL != module0004.f106(var40) && (NIL != f36776(var40) || NIL != f36779(var40) || NIL != conses_high.member(var40, (SubLObject)$ic35$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f36779(final SubLObject var40) {
        return (SubLObject)makeBoolean(var40.numGE(Characters.char_code((SubLObject)Characters.CHAR_0)) && var40.numLE(Characters.char_code((SubLObject)Characters.CHAR_9)));
    }
    
    public static SubLObject f36774(final SubLObject var16) {
        return (SubLObject)makeBoolean(NIL != f36780(var16) || NIL != f36781(var16));
    }
    
    public static SubLObject f36776(final SubLObject var34) {
        return (SubLObject)makeBoolean(NIL != f36782(var34) || NIL != f36783(var34));
    }
    
    public static SubLObject f36780(final SubLObject var34) {
        return (SubLObject)makeBoolean(var34.isChar() && NIL != f36784(var34, $g4657$.getGlobalValue()));
    }
    
    public static SubLObject f36782(final SubLObject var34) {
        return (SubLObject)makeBoolean(var34.isNumber() && NIL != f36785(var34, $g4657$.getGlobalValue()));
    }
    
    public static SubLObject f36781(final SubLObject var34) {
        return (SubLObject)makeBoolean(var34.isChar() && NIL != f36784(var34, $g4658$.getGlobalValue()));
    }
    
    public static SubLObject f36783(final SubLObject var34) {
        return (SubLObject)makeBoolean(var34.isNumber() && NIL != f36785(var34, $g4658$.getGlobalValue()));
    }
    
    public static SubLObject f36748(final SubLObject var16) {
        return (SubLObject)makeBoolean(var16.isChar() && NIL != f36785(Characters.char_code(var16), module0587.$g4459$.getGlobalValue()));
    }
    
    public static SubLObject f36786(final SubLObject var44) {
        return (SubLObject)makeBoolean(var44.isNumber() && NIL != f36785(var44, module0587.$g4459$.getGlobalValue()));
    }
    
    public static SubLObject f36784(final SubLObject var16, final SubLObject var45) {
        return f36785(Characters.char_code(var16), var45);
    }
    
    public static SubLObject f36785(final SubLObject var44, final SubLObject var45) {
        SubLObject var46 = (SubLObject)NIL;
        if (NIL == var46) {
            SubLObject var47 = var45;
            SubLObject var48 = (SubLObject)NIL;
            var48 = var47.first();
            while (NIL == var46 && NIL != var47) {
                SubLObject var50;
                final SubLObject var49 = var50 = var48;
                SubLObject var51 = (SubLObject)NIL;
                SubLObject var52 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var50, var49, (SubLObject)$ic38$);
                var51 = var50.first();
                var50 = var50.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var50, var49, (SubLObject)$ic38$);
                var52 = var50.first();
                var50 = var50.rest();
                if (NIL == var50) {
                    if (var44.numGE(var51) && var44.numLE(var52)) {
                        var46 = (SubLObject)T;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var49, (SubLObject)$ic38$);
                }
                var47 = var47.rest();
                var48 = var47.first();
            }
        }
        return var46;
    }
    
    public static SubLObject f36787(final SubLObject var16) {
        return (SubLObject)makeBoolean(NIL != module0038.f2747(var16) || NIL != conses_high.member(var16, $g4659$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f36788(final SubLObject var16) {
        if (NIL != module0038.f2747(var16)) {
            return (SubLObject)$ic40$;
        }
        final SubLObject var17 = Characters.char_code(var16);
        if (var17.eql((SubLObject)$ic41$)) {
            return (SubLObject)$ic42$;
        }
        if (var17.eql((SubLObject)$ic43$)) {
            return (SubLObject)$ic44$;
        }
        if (var17.eql((SubLObject)$ic45$)) {
            return (SubLObject)$ic46$;
        }
        if (var17.eql((SubLObject)$ic47$)) {
            return (SubLObject)$ic48$;
        }
        if (var17.eql((SubLObject)$ic49$)) {
            return (SubLObject)$ic50$;
        }
        if (var17.eql((SubLObject)TEN_INTEGER)) {
            return (SubLObject)$ic40$;
        }
        return PrintLow.write_to_string(var16, EMPTY_SUBL_OBJECT_ARRAY);
    }
    
    public static SubLObject f36759(final SubLObject var8) {
        assert NIL != Types.stringp(var8) : var8;
        SubLObject var13_54;
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var9 = (var13_54 = Sequences.length(var8)), var10 = (SubLObject)NIL, var10 = (SubLObject)ZERO_INTEGER; !var10.numGE(var13_54); var10 = module0048.f_1X(var10)) {
            var11 = Strings.sublisp_char(var8, var10);
            if (var11.eql((SubLObject)Characters.CHAR_newline)) {
                f36749(var11);
            }
            else if (var11.eql((SubLObject)Characters.CHAR_ampersand) && NIL != f36789(var8, var10, (SubLObject)UNPROVIDED)) {
                f36749(var11);
            }
            else if (NIL != f36787(var11)) {
                f36747(f36788(var11), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (NIL == f36748(var11)) {
                f36749((SubLObject)Characters.CHAR_space);
            }
            else {
                f36749(var11);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36789(final SubLObject var8, SubLObject var9, SubLObject var10) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)ZERO_INTEGER;
        }
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        if (Strings.sublisp_char(var8, var9).eql((SubLObject)Characters.CHAR_ampersand) && NIL != module0035.f2002(var8, Numbers.add(var9, (SubLObject)TWO_INTEGER), (SubLObject)UNPROVIDED) && NIL != f36790(Strings.sublisp_char(var8, module0048.f_1X(var9)))) {
            final SubLObject var11 = streams_high.make_private_string_output_stream();
            print_high.princ(Strings.sublisp_char(var8, module0048.f_1X(var9)), var11);
            SubLObject var13_56;
            SubLObject var12;
            SubLObject var13;
            SubLObject var14;
            for (var12 = (var13_56 = Sequences.length(var8)), var13 = (SubLObject)NIL, var13 = Numbers.add(var9, (SubLObject)TWO_INTEGER); !var13.numGE(var13_56); var13 = module0048.f_1X(var13)) {
                var14 = Strings.sublisp_char(var8, var13);
                if (var14.eql((SubLObject)Characters.CHAR_semicolon)) {
                    return f36791(streams_high.get_output_stream_string(var11));
                }
                if (var10.isInteger() && var13.numG(var10)) {
                    return (SubLObject)NIL;
                }
                if (NIL == f36792(var14)) {
                    return (SubLObject)NIL;
                }
                print_high.princ(var14, var11);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36791(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (NIL != module0107.f7628(module0587.$g4461$.getDynamicValue(var9))) {
            return (SubLObject)T;
        }
        if (NIL != f36793(var8)) {
            return (SubLObject)T;
        }
        if (NIL != module0035.f2302(module0587.$g4460$.getGlobalValue(), var8, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        return module0004.f104(var8, module0587.$g4461$.getDynamicValue(var9), Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36793(final SubLObject var8) {
        SubLObject var9 = (SubLObject)NIL;
        if (module0038.f2636(var8).eql((SubLObject)Characters.CHAR_hash)) {
            if (NIL == module0035.find_if_not((SubLObject)$ic51$, var8, Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)T;
            }
            else if (Strings.sublisp_char(var8, (SubLObject)ONE_INTEGER).eql((SubLObject)Characters.CHAR_x) && NIL == module0035.find_if_not((SubLObject)$ic52$, var8, Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)T;
            }
        }
        return var9;
    }
    
    public static SubLObject f36790(final SubLObject var16) {
        return (SubLObject)makeBoolean(NIL != Characters.alpha_char_p(var16) || var16.eql((SubLObject)Characters.CHAR_underbar) || var16.eql((SubLObject)Characters.CHAR_colon));
    }
    
    public static SubLObject f36792(final SubLObject var16) {
        return (SubLObject)makeBoolean(NIL != f36790(var16) || NIL != Characters.digit_char_p(var16, (SubLObject)UNPROVIDED) || var16.eql((SubLObject)Characters.CHAR_period) || var16.eql((SubLObject)Characters.CHAR_hyphen));
    }
    
    public static SubLObject f36794(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic53$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic54$, var7)), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f36795(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic55$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        assert NIL != Types.symbolp(var7) : var7;
        final SubLObject var9 = (SubLObject)$ic57$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic58$, (SubLObject)ConsesLow.list(var9, var7), (SubLObject)ConsesLow.listS((SubLObject)$ic59$, var9, ConsesLow.append(var8, (SubLObject)NIL)));
    }
    
    public static SubLObject f36796(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0587.$g4457$.currentBinding(var3);
        try {
            module0587.$g4457$.bind(var2, var3);
            f36751(f36743(), (SubLObject)$ic6$, (SubLObject)NIL);
        }
        finally {
            module0587.$g4457$.rebind(var4, var3);
        }
        return var2;
    }
    
    public static SubLObject f36797(final SubLObject var63, final SubLObject var64, final SubLObject var2) {
        PrintLow.format(var2, (SubLObject)$ic62$, var63, var64);
        f36746();
        return var2;
    }
    
    public static SubLObject f36798(final SubLObject var65, final SubLObject var66) {
        final SubLThread var67 = SubLProcess.currentSubLThread();
        SubLObject var68 = module0038.f2658(var65);
        SubLObject var69 = (SubLObject)NIL;
        SubLObject var71;
        final SubLObject var70 = var71 = module0590.f36044(var65);
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var71, var70, (SubLObject)$ic63$);
        var72 = var71.first();
        var71 = (var73 = var71.rest());
        if (NIL != module0038.f2668((SubLObject)$ic64$, var65, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            SubLObject var74 = var73;
            SubLObject var75 = (SubLObject)NIL;
            var75 = var74.first();
            while (NIL != var74) {
                SubLObject var76_77;
                final SubLObject var74_75 = var76_77 = var75;
                SubLObject var76 = (SubLObject)NIL;
                SubLObject var77 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var76_77, var74_75, (SubLObject)$ic65$);
                var76 = var76_77.first();
                var76_77 = (var77 = var76_77.rest());
                if (NIL != module0038.f2684(var76, (SubLObject)$ic64$)) {
                    var69 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(module0038.f2623(var76, (SubLObject)SIX_INTEGER, Sequences.position((SubLObject)Characters.CHAR_equal, var76, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), var77), var69);
                }
                var74 = var74.rest();
                var75 = var74.first();
            }
        }
        final SubLObject var78 = f36799(var72, var69, var66);
        SubLObject var79 = module0038.f2611(var78);
        final SubLObject var80 = (NIL != var78) ? var78 : var72;
        SubLObject var81 = var73;
        SubLObject var82 = var73;
        SubLObject var83 = (SubLObject)NIL;
        var83 = var82.first();
        while (NIL != var82) {
            SubLObject var86_87;
            final SubLObject var84_85 = var86_87 = var83;
            SubLObject var84 = (SubLObject)NIL;
            SubLObject var85 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var86_87, var84_85, (SubLObject)$ic66$);
            var84 = var86_87.first();
            var86_87 = (var85 = var86_87.rest());
            final SubLObject var86 = f36799(var85, var69, var66);
            if (NIL != var86) {
                var81 = module0035.f2063(var81, var84, var86, Symbols.symbol_function((SubLObject)EQUAL));
                var79 = (SubLObject)T;
            }
            var82 = var82.rest();
            var83 = var82.first();
        }
        if (NIL != var79) {
            SubLObject var87 = (SubLObject)NIL;
            try {
                var87 = streams_high.make_private_string_output_stream();
                final SubLObject var88 = module0587.$g4457$.currentBinding(var67);
                try {
                    module0587.$g4457$.bind(var87, var67);
                    if (NIL != module0590.f36040(var65) || NIL != module0590.f36072(var65)) {
                        f36758(var80, module0035.f2338(var81), module0590.f36072(var65), (SubLObject)UNPROVIDED);
                    }
                    else {
                        f36760(var80);
                    }
                }
                finally {
                    module0587.$g4457$.rebind(var88, var67);
                }
                var68 = streams_high.get_output_stream_string(var87);
            }
            finally {
                final SubLObject var89 = Threads.$is_thread_performing_cleanupP$.currentBinding(var67);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var67);
                    streams_high.close(var87, (SubLObject)UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var89, var67);
                }
            }
        }
        return Values.values(var68, var69);
    }
    
    public static SubLObject f36799(final SubLObject var26, final SubLObject var68, final SubLObject var66) {
        return (SubLObject)((NIL != Sequences.find((SubLObject)Characters.CHAR_colon, var26, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0038.f2684(var26, (SubLObject)$ic64$) && NIL == module0038.f2684(var26, (SubLObject)$ic67$) && NIL == module0038.f2684(var26, (SubLObject)$ic68$)) ? f36800(var26, var68, var66) : NIL);
    }
    
    public static SubLObject f36800(final SubLObject var26, final SubLObject var68, final SubLObject var66) {
        final SubLObject var69 = module0590.f36047(var26);
        SubLObject var70 = module0035.f2294(var68, var69, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)NIL);
        if (NIL == var70) {
            SubLObject var71 = var66;
            SubLObject var72 = (SubLObject)NIL;
            var72 = var71.first();
            while (NIL == var70 && NIL != var71) {
                if (var72.isCons() && var69.equal(var72.first())) {
                    var70 = var72.rest();
                }
                var71 = var71.rest();
                var72 = var71.first();
            }
        }
        if (NIL == var70) {
            Errors.error((SubLObject)$ic69$, var26, var68, var66);
        }
        return Sequences.cconcatenate(var70, module0590.f36049(var26));
    }
    
    public static SubLObject f36801(final SubLObject var94) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        if (var94.isString()) {
            f36747(var94, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            final SubLObject var96 = (SubLObject)NIL;
            final SubLObject var97 = Types.sublisp_null(Sequences.find_if((SubLObject)$ic70$, module0590.f36094(var94, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            try {
                final SubLObject var98 = $g4652$.currentBinding(var95);
                final SubLObject var99 = $g4654$.currentBinding(var95);
                try {
                    $g4652$.bind(Numbers.add($g4653$.getDynamicValue(var95), $g4652$.getDynamicValue(var95)), var95);
                    $g4654$.bind($g4652$.getDynamicValue(var95), var95);
                    f36758(module0590.f36092(var94), f36802(var94), var96, (SubLObject)NIL);
                    f36803(var94, (SubLObject)UNPROVIDED);
                }
                finally {
                    $g4654$.rebind(var99, var95);
                    $g4652$.rebind(var98, var95);
                }
            }
            finally {
                final SubLObject var100 = Threads.$is_thread_performing_cleanupP$.currentBinding(var95);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var95);
                    if (NIL == var96) {
                        if (NIL == var97) {
                            f36746();
                        }
                        f36760(module0590.f36092(var94));
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var100, var95);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36803(final SubLObject var94, SubLObject var96) {
        if (var96 == UNPROVIDED) {
            var96 = (SubLObject)NIL;
        }
        final SubLObject var97 = module0590.f36094(var94, var96);
        SubLObject var98 = (SubLObject)NIL;
        SubLObject var99 = (SubLObject)NIL;
        SubLObject var100 = (SubLObject)NIL;
        var98 = var97;
        var99 = var98.first();
        for (var100 = (SubLObject)ZERO_INTEGER; NIL != var98; var98 = var98.rest(), var99 = var98.first(), var100 = Numbers.add((SubLObject)ONE_INTEGER, var100)) {
            f36801(var99);
            if (!var99.isString() && NIL == module0035.f1995(var97, module0048.f_1X(var100), (SubLObject)UNPROVIDED)) {
                f36746();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36802(final SubLObject var94) {
        return module0035.f2338(module0590.f36095(var94));
    }
    
    public static SubLObject f36804(final SubLObject var101) {
        final SubLThread var102 = SubLProcess.currentSubLThread();
        return module0035.f2293(var101, $g4660$.getDynamicValue(var102), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36805(final SubLObject var27) {
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30;
        SubLObject var31;
        SubLObject var32;
        for (var30 = (SubLObject)NIL, var30 = var27; NIL != var30; var30 = conses_high.cddr(var30)) {
            var31 = var30.first();
            var32 = conses_high.cadr(var30);
            if (var32.isString()) {
                var29 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var32, var32), var29);
            }
            var28 = (SubLObject)ConsesLow.cons(var32, var28);
        }
        return Values.values(var28, var29);
    }
    
    public static SubLObject f36806(final SubLObject var107, final SubLObject var108) {
        final SubLThread var109 = SubLProcess.currentSubLThread();
        SubLObject var110 = (SubLObject)NIL;
        final SubLObject var111 = $g4660$.currentBinding(var109);
        try {
            $g4660$.bind(var108, var109);
            var110 = Sort.sort(conses_high.copy_list(var107), Symbols.symbol_function((SubLObject)$ic71$), (SubLObject)$ic72$);
        }
        finally {
            $g4660$.rebind(var111, var109);
        }
        return var110;
    }
    
    public static SubLObject f36807(final SubLObject var110, final SubLObject var111, final SubLObject var112, final SubLObject var113, final SubLObject var114) {
        final SubLObject var115 = conses_high.getf(var111, (SubLObject)$ic73$, (SubLObject)UNPROVIDED);
        final SubLObject var116 = conses_high.getf(var111, (SubLObject)$ic74$, (SubLObject)UNPROVIDED);
        final SubLObject var117 = conses_high.getf(var111, (SubLObject)$ic75$, (SubLObject)UNPROVIDED);
        final SubLObject var118 = conses_high.getf(var111, (SubLObject)$ic76$, (SubLObject)UNPROVIDED);
        final SubLObject var119 = f36805(var116);
        SubLObject var120 = var110;
        SubLObject var121 = (SubLObject)NIL;
        var121 = var120.first();
        while (NIL != var120) {
            SubLObject var123;
            final SubLObject var122 = var123 = var121;
            SubLObject var124 = (SubLObject)NIL;
            SubLObject var125 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var123, var122, (SubLObject)$ic77$);
            var124 = var123.first();
            var123 = (var125 = var123.rest());
            module0038.f2648(var113, var112);
            PrintLow.format(var113, (SubLObject)$ic78$, var115);
            if (var124.isList()) {
                SubLObject var72_121 = var119;
                SubLObject var126 = (SubLObject)NIL;
                var126 = var72_121.first();
                while (NIL != var72_121) {
                    SubLObject var127 = module0006.f202(module0035.f2293(var124, var126, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                    if (NIL == var114) {
                        var127 = module0038.f2667(var127, (SubLObject)$ic79$);
                    }
                    PrintLow.format(var113, (SubLObject)$ic80$, conses_high.getf(Sequences.reverse(var116), var126, (SubLObject)UNPROVIDED), module0038.f2632(var127, (SubLObject)UNPROVIDED));
                    var72_121 = var72_121.rest();
                    var126 = var72_121.first();
                }
            }
            if (NIL != var117 || NIL != var118) {
                PrintLow.format(var113, (SubLObject)$ic81$);
                if (NIL != var118) {
                    module0038.f2648(var113, var112);
                    SubLObject var128 = module0006.f202(module0035.f2293(var124, var118, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                    if (NIL == var114) {
                        var128 = module0038.f2667(var128, (SubLObject)$ic79$);
                    }
                    PrintLow.format(var113, (SubLObject)$ic82$, var128);
                }
                if (NIL != var125) {
                    SubLObject var72_122 = var117;
                    SubLObject var129 = (SubLObject)NIL;
                    var129 = var72_122.first();
                    while (NIL != var72_122) {
                        f36808(var125, var129, Numbers.add(var112, (SubLObject)TWO_INTEGER), var113, var114);
                        var72_122 = var72_122.rest();
                        var129 = var72_122.first();
                    }
                }
                module0038.f2648(var113, var112);
                PrintLow.format(var113, (SubLObject)$ic83$, var115);
            }
            else {
                PrintLow.format(var113, (SubLObject)$ic84$);
            }
            var120 = var120.rest();
            var121 = var120.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36808(final SubLObject var124, final SubLObject var125, final SubLObject var112, final SubLObject var113, final SubLObject var114) {
        final SubLThread var126 = SubLProcess.currentSubLThread();
        SubLObject var127 = var124;
        final SubLObject var128 = conses_high.getf(var125, (SubLObject)$ic74$, (SubLObject)UNPROVIDED);
        final SubLObject var129 = conses_high.getf(var125, (SubLObject)$ic76$, (SubLObject)UNPROVIDED);
        final SubLObject var130 = conses_high.getf(var125, (SubLObject)$ic85$, (SubLObject)UNPROVIDED);
        final SubLObject var131 = conses_high.getf(var125, (SubLObject)$ic86$, (SubLObject)UNPROVIDED);
        SubLObject var132 = (SubLObject)ZERO_INTEGER;
        SubLObject var133 = (SubLObject)NIL;
        SubLObject var134 = (SubLObject)NIL;
        SubLObject var135 = (SubLObject)NIL;
        SubLObject var136 = (SubLObject)NIL;
        var126.resetMultipleValues();
        final SubLObject var133_134 = f36805(var128);
        final SubLObject var135_136 = var126.secondMultipleValue();
        var126.resetMultipleValues();
        var133 = var133_134;
        var134 = var135_136;
        var135 = var133;
        if (NIL != var130) {
            var127 = Sequences.reverse(f36806(var124, var130));
        }
        else if (NIL != var131) {
            var127 = f36806(var124, var131);
        }
        if (NIL != var129) {
            if (var129.isString()) {
                var134 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var129, var129), var134);
            }
            var135 = (SubLObject)ConsesLow.cons(var129, var135);
        }
        SubLObject var137 = var127;
        SubLObject var138 = (SubLObject)NIL;
        var138 = var137.first();
        while (NIL != var137) {
            if (NIL != var135) {
                SubLObject var139 = var134;
                SubLObject var72_138 = var138;
                SubLObject var140 = (SubLObject)NIL;
                var140 = var72_138.first();
                while (NIL != var72_138) {
                    final SubLObject var141 = var140.first();
                    if (NIL != module0035.f2169(var141, var135)) {
                        var139 = (SubLObject)ConsesLow.cons(var140, var139);
                    }
                    var72_138 = var72_138.rest();
                    var140 = var72_138.first();
                }
                var136 = module0035.f2313(var136, var139, var138, Symbols.symbol_function((SubLObject)EQUAL));
            }
            else {
                var136 = module0035.f2313(var136, var132, var138, Symbols.symbol_function((SubLObject)EQUAL));
                var132 = module0048.f_1X(var132);
            }
            var137 = var137.rest();
            var138 = var137.first();
        }
        f36807(var136, var125, var112, var113, var114);
        return (SubLObject)T;
    }
    
    public static SubLObject f36809(final SubLObject var140) {
        SubLObject var141 = Sequences.copy_seq((SubLObject)$ic87$);
        SubLObject var142 = var140;
        SubLObject var143 = (SubLObject)NIL;
        var143 = var142.first();
        while (NIL != var142) {
            var141 = Sequences.cconcatenate(module0006.f203(var141), new SubLObject[] { $ic88$, module0006.f203(Strings.string_downcase(module0201.f12563(var143), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), $ic89$, module0006.f203(var143), $ic90$ });
            var142 = var142.rest();
            var143 = var142.first();
        }
        var141 = Sequences.cconcatenate(module0006.f203(var141), (SubLObject)$ic91$);
        return reader.read_from_string(var141, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36810(final SubLObject var141, final SubLObject var111, final SubLObject var112, final SubLObject var2, SubLObject var114) {
        if (var114 == UNPROVIDED) {
            var114 = (SubLObject)T;
        }
        final SubLThread var142 = SubLProcess.currentSubLThread();
        final SubLObject var143 = module0587.$g4457$.currentBinding(var142);
        try {
            module0587.$g4457$.bind(var2, var142);
            f36751((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f36758((SubLObject)$ic92$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            f36746();
            f36808(var141, var111, var112, var2, var114);
            f36760((SubLObject)$ic92$);
        }
        finally {
            module0587.$g4457$.rebind(var143, var142);
        }
        return var2;
    }
    
    public static SubLObject f36811(final SubLObject var142, SubLObject var143, SubLObject var144, SubLObject var111, SubLObject var2) {
        if (var143 == UNPROVIDED) {
            var143 = (SubLObject)NIL;
        }
        if (var144 == UNPROVIDED) {
            var144 = (SubLObject)NIL;
        }
        if (var111 == UNPROVIDED) {
            var111 = (SubLObject)$ic94$;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)T;
        }
        if (var111.equal((SubLObject)$ic94$)) {
            final SubLObject var145 = module0202.f12911(var142, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var111 = f36809(var145);
        }
        final SubLObject var146 = module0409.f28506(var142, var143, var144);
        f36810(var146, var111, (SubLObject)TWO_INTEGER, var2, (SubLObject)UNPROVIDED);
        return var2;
    }
    
    public static SubLObject f36812(final SubLObject var142, final SubLObject var146, SubLObject var143, SubLObject var144, SubLObject var111) {
        if (var143 == UNPROVIDED) {
            var143 = (SubLObject)NIL;
        }
        if (var144 == UNPROVIDED) {
            var144 = (SubLObject)NIL;
        }
        if (var111 == UNPROVIDED) {
            var111 = (SubLObject)$ic94$;
        }
        SubLObject var147 = (SubLObject)NIL;
        try {
            var147 = compatibility.open_text(var146, (SubLObject)$ic96$);
            if (!var147.isStream()) {
                Errors.error((SubLObject)$ic97$, var146);
            }
            final SubLObject var148 = var147;
            f36811(var142, var143, var144, var111, var148);
        }
        finally {
            final SubLObject var149 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if (var147.isStream()) {
                    streams_high.close(var147, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var149);
            }
        }
        return var146;
    }
    
    public static SubLObject f36813(final SubLObject var142, SubLObject var143, SubLObject var144, SubLObject var111) {
        if (var143 == UNPROVIDED) {
            var143 = (SubLObject)NIL;
        }
        if (var144 == UNPROVIDED) {
            var144 = (SubLObject)NIL;
        }
        if (var111 == UNPROVIDED) {
            var111 = (SubLObject)$ic94$;
        }
        if (var111.equal((SubLObject)$ic94$)) {
            final SubLObject var145 = module0202.f12911(var142, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var111 = f36809(var145);
        }
        final SubLObject var146 = module0409.f28506(var142, var143, var144);
        SubLObject var147 = (SubLObject)NIL;
        SubLObject var148 = (SubLObject)NIL;
        try {
            var148 = streams_high.make_private_string_output_stream();
            f36810(var146, var111, (SubLObject)TWO_INTEGER, var148, (SubLObject)UNPROVIDED);
            var147 = streams_high.get_output_stream_string(var148);
        }
        finally {
            final SubLObject var149 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                streams_high.close(var148, (SubLObject)UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var149);
            }
        }
        return var147;
    }
    
    public static SubLObject f36814(final SubLObject var150) {
        return (SubLObject)((NIL != var150) ? $ic99$ : $ic100$);
    }
    
    public static SubLObject f36815() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36743", "S#39604", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36744", "S#40543", 0, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0601", "f36745", "S#40544");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36746", "S#40545", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36747", "S#39605", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36749", "S#40546", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36750", "S#40547", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36751", "S#39603", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36752", "S#39768", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36753", "S#39769", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36754", "S#40548", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36755", "S#40549", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36756", "S#40550", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0601", "f36757", "S#40551");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36758", "S#39596", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36760", "S#39597", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36761", "S#40552", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36763", "S#40553", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36764", "S#40554", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36766", "S#40555", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36762", "S#39606", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36765", "S#40556", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36767", "S#39767", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36770", "S#40557", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36768", "S#40558", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36773", "S#40559", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36775", "S#40560", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36769", "S#40561", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36777", "S#40562", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36771", "S#40563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36772", "S#40564", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36778", "S#40565", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36779", "S#40566", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36774", "S#40567", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36776", "S#40568", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36780", "S#40569", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36782", "S#40570", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36781", "S#40571", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36783", "S#40572", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36748", "S#40573", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36786", "S#40574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36784", "S#40575", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36785", "S#40576", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36787", "S#40577", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36788", "S#40578", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36759", "S#40579", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36789", "S#40580", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36791", "S#40581", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36793", "S#40582", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36790", "S#40583", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36792", "S#40584", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0601", "f36794", "S#40585");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0601", "f36795", "S#40586");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36796", "S#40587", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36797", "S#40588", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36798", "S#39765", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36799", "S#40589", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36800", "S#40590", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36801", "S#40591", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36803", "S#40592", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36802", "S#40593", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36804", "S#40594", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36805", "S#40595", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36806", "S#40596", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36807", "S#40597", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36808", "S#40598", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36809", "S#31687", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36810", "S#31688", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36811", "QUERY-RESULTS-TO-XML-STREAM", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36812", "QUERY-RESULTS-TO-XML-FILE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36813", "QUERY-RESULTS-TO-XML-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0601", "f36814", "S#40599", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36816() {
        $g4651$ = SubLFiles.defparameter("S#40600", (SubLObject)$ic0$);
        $g4652$ = SubLFiles.defparameter("S#40601", (SubLObject)ZERO_INTEGER);
        $g4653$ = SubLFiles.defparameter("S#40602", (SubLObject)ONE_INTEGER);
        $g4654$ = SubLFiles.defparameter("S#1767", (SubLObject)ZERO_INTEGER);
        $g4655$ = SubLFiles.deflexical("S#40603", (SubLObject)$ic17$);
        $g4656$ = SubLFiles.deflexical("S#40604", (SubLObject)$ic18$);
        $g4657$ = SubLFiles.deflexical("S#40605", $ic36$);
        $g4658$ = SubLFiles.deflexical("S#40606", (SubLObject)$ic37$);
        $g4659$ = SubLFiles.defconstant("S#40607", (SubLObject)$ic39$);
        $g4660$ = SubLFiles.defparameter("S#40608", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36817() {
        module0002.f35((SubLObject)$ic60$, (SubLObject)$ic61$);
        module0002.f38((SubLObject)$ic93$);
        module0002.f38((SubLObject)$ic95$);
        module0002.f38((SubLObject)$ic98$);
        return (SubLObject)NIL;
    }
    
    private static SubLObject _constant_36_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)makeInteger(65), (SubLObject)makeInteger(90)), ConsesLow.list((SubLObject)makeInteger(97), (SubLObject)makeInteger(122)), ConsesLow.list((SubLObject)makeInteger(192), (SubLObject)makeInteger(214)), ConsesLow.list((SubLObject)makeInteger(216), (SubLObject)makeInteger(246)), ConsesLow.list((SubLObject)makeInteger(248), (SubLObject)makeInteger(255)), ConsesLow.list((SubLObject)makeInteger(256), (SubLObject)makeInteger(305)), ConsesLow.list((SubLObject)makeInteger(308), (SubLObject)makeInteger(318)), ConsesLow.list((SubLObject)makeInteger(321), (SubLObject)makeInteger(328)), ConsesLow.list((SubLObject)makeInteger(330), (SubLObject)makeInteger(382)), ConsesLow.list((SubLObject)makeInteger(384), (SubLObject)makeInteger(451)), ConsesLow.list((SubLObject)makeInteger(461), (SubLObject)makeInteger(496)), ConsesLow.list((SubLObject)makeInteger(500), (SubLObject)makeInteger(501)), ConsesLow.list((SubLObject)makeInteger(506), (SubLObject)makeInteger(535)), ConsesLow.list((SubLObject)makeInteger(592), (SubLObject)makeInteger(680)), ConsesLow.list((SubLObject)makeInteger(699), (SubLObject)makeInteger(705)), ConsesLow.list((SubLObject)makeInteger(902), (SubLObject)makeInteger(902)), ConsesLow.list((SubLObject)makeInteger(904), (SubLObject)makeInteger(906)), ConsesLow.list((SubLObject)makeInteger(908), (SubLObject)makeInteger(908)), ConsesLow.list((SubLObject)makeInteger(910), (SubLObject)makeInteger(929)), ConsesLow.list((SubLObject)makeInteger(931), (SubLObject)makeInteger(974)), ConsesLow.list((SubLObject)makeInteger(976), (SubLObject)makeInteger(982)), ConsesLow.list((SubLObject)makeInteger(986), (SubLObject)makeInteger(986)), ConsesLow.list((SubLObject)makeInteger(988), (SubLObject)makeInteger(988)), ConsesLow.list((SubLObject)makeInteger(990), (SubLObject)makeInteger(990)), ConsesLow.list((SubLObject)makeInteger(992), (SubLObject)makeInteger(992)), ConsesLow.list((SubLObject)makeInteger(994), (SubLObject)makeInteger(1011)), ConsesLow.list((SubLObject)makeInteger(1025), (SubLObject)makeInteger(1036)), ConsesLow.list((SubLObject)makeInteger(1038), (SubLObject)makeInteger(1103)), ConsesLow.list((SubLObject)makeInteger(1105), (SubLObject)makeInteger(1116)), ConsesLow.list((SubLObject)makeInteger(1118), (SubLObject)makeInteger(1153)), ConsesLow.list((SubLObject)makeInteger(1168), (SubLObject)makeInteger(1220)), ConsesLow.list((SubLObject)makeInteger(1223), (SubLObject)makeInteger(1224)), ConsesLow.list((SubLObject)makeInteger(1227), (SubLObject)makeInteger(1228)), ConsesLow.list((SubLObject)makeInteger(1232), (SubLObject)makeInteger(1259)), ConsesLow.list((SubLObject)makeInteger(1262), (SubLObject)makeInteger(1269)), ConsesLow.list((SubLObject)makeInteger(1272), (SubLObject)makeInteger(1273)), ConsesLow.list((SubLObject)makeInteger(1329), (SubLObject)makeInteger(1366)), ConsesLow.list((SubLObject)makeInteger(1369), (SubLObject)makeInteger(1369)), ConsesLow.list((SubLObject)makeInteger(1377), (SubLObject)makeInteger(1414)), ConsesLow.list((SubLObject)makeInteger(1488), (SubLObject)makeInteger(1514)), ConsesLow.list((SubLObject)makeInteger(1520), (SubLObject)makeInteger(1522)), ConsesLow.list((SubLObject)makeInteger(1569), (SubLObject)makeInteger(1594)), ConsesLow.list((SubLObject)makeInteger(1601), (SubLObject)makeInteger(1610)), ConsesLow.list((SubLObject)makeInteger(1649), (SubLObject)makeInteger(1719)), ConsesLow.list((SubLObject)makeInteger(1722), (SubLObject)makeInteger(1726)), ConsesLow.list((SubLObject)makeInteger(1728), (SubLObject)makeInteger(1742)), ConsesLow.list((SubLObject)makeInteger(1744), (SubLObject)makeInteger(1747)), ConsesLow.list((SubLObject)makeInteger(1749), (SubLObject)makeInteger(1749)), ConsesLow.list((SubLObject)makeInteger(1765), (SubLObject)makeInteger(1766)), ConsesLow.list((SubLObject)makeInteger(2309), (SubLObject)makeInteger(2361)), ConsesLow.list((SubLObject)makeInteger(2365), (SubLObject)makeInteger(2365)), ConsesLow.list((SubLObject)makeInteger(2392), (SubLObject)makeInteger(2401)), ConsesLow.list((SubLObject)makeInteger(2437), (SubLObject)makeInteger(2444)), ConsesLow.list((SubLObject)makeInteger(2447), (SubLObject)makeInteger(2448)), ConsesLow.list((SubLObject)makeInteger(2451), (SubLObject)makeInteger(2472)), ConsesLow.list((SubLObject)makeInteger(2474), (SubLObject)makeInteger(2480)), ConsesLow.list((SubLObject)makeInteger(2482), (SubLObject)makeInteger(2482)), ConsesLow.list((SubLObject)makeInteger(2486), (SubLObject)makeInteger(2489)), ConsesLow.list((SubLObject)makeInteger(2524), (SubLObject)makeInteger(2525)), ConsesLow.list((SubLObject)makeInteger(2527), (SubLObject)makeInteger(2529)), ConsesLow.list((SubLObject)makeInteger(2544), (SubLObject)makeInteger(2545)), ConsesLow.list((SubLObject)makeInteger(2565), (SubLObject)makeInteger(2570)), ConsesLow.list((SubLObject)makeInteger(2575), (SubLObject)makeInteger(2576)), ConsesLow.list((SubLObject)makeInteger(2579), (SubLObject)makeInteger(2600)), ConsesLow.list((SubLObject)makeInteger(2602), (SubLObject)makeInteger(2608)), ConsesLow.list((SubLObject)makeInteger(2610), (SubLObject)makeInteger(2611)), ConsesLow.list((SubLObject)makeInteger(2613), (SubLObject)makeInteger(2614)), ConsesLow.list((SubLObject)makeInteger(2616), (SubLObject)makeInteger(2617)), ConsesLow.list((SubLObject)makeInteger(2649), (SubLObject)makeInteger(2652)), ConsesLow.list((SubLObject)makeInteger(2654), (SubLObject)makeInteger(2654)), ConsesLow.list((SubLObject)makeInteger(2674), (SubLObject)makeInteger(2676)), ConsesLow.list((SubLObject)makeInteger(2693), (SubLObject)makeInteger(2699)), ConsesLow.list((SubLObject)makeInteger(2701), (SubLObject)makeInteger(2701)), ConsesLow.list((SubLObject)makeInteger(2703), (SubLObject)makeInteger(2705)), ConsesLow.list((SubLObject)makeInteger(2707), (SubLObject)makeInteger(2728)), ConsesLow.list((SubLObject)makeInteger(2730), (SubLObject)makeInteger(2736)), ConsesLow.list((SubLObject)makeInteger(2738), (SubLObject)makeInteger(2739)), ConsesLow.list((SubLObject)makeInteger(2741), (SubLObject)makeInteger(2745)), ConsesLow.list((SubLObject)makeInteger(2749), (SubLObject)makeInteger(2749)), ConsesLow.list((SubLObject)makeInteger(2784), (SubLObject)makeInteger(2784)), ConsesLow.list((SubLObject)makeInteger(2821), (SubLObject)makeInteger(2828)), ConsesLow.list((SubLObject)makeInteger(2831), (SubLObject)makeInteger(2832)), ConsesLow.list((SubLObject)makeInteger(2835), (SubLObject)makeInteger(2856)), ConsesLow.list((SubLObject)makeInteger(2858), (SubLObject)makeInteger(2864)), ConsesLow.list((SubLObject)makeInteger(2866), (SubLObject)makeInteger(2867)), ConsesLow.list((SubLObject)makeInteger(2870), (SubLObject)makeInteger(2873)), ConsesLow.list((SubLObject)makeInteger(2877), (SubLObject)makeInteger(2877)), ConsesLow.list((SubLObject)makeInteger(2908), (SubLObject)makeInteger(2909)), ConsesLow.list((SubLObject)makeInteger(2911), (SubLObject)makeInteger(2913)), ConsesLow.list((SubLObject)makeInteger(2949), (SubLObject)makeInteger(2954)), ConsesLow.list((SubLObject)makeInteger(2958), (SubLObject)makeInteger(2960)), ConsesLow.list((SubLObject)makeInteger(2962), (SubLObject)makeInteger(2965)), ConsesLow.list((SubLObject)makeInteger(2969), (SubLObject)makeInteger(2970)), ConsesLow.list((SubLObject)makeInteger(2972), (SubLObject)makeInteger(2972)), ConsesLow.list((SubLObject)makeInteger(2974), (SubLObject)makeInteger(2975)), ConsesLow.list((SubLObject)makeInteger(2979), (SubLObject)makeInteger(2980)), ConsesLow.list((SubLObject)makeInteger(2984), (SubLObject)makeInteger(2986)), ConsesLow.list((SubLObject)makeInteger(2990), (SubLObject)makeInteger(2997)), ConsesLow.list((SubLObject)makeInteger(2999), (SubLObject)makeInteger(3001)), ConsesLow.list((SubLObject)makeInteger(3077), (SubLObject)makeInteger(3084)), ConsesLow.list((SubLObject)makeInteger(3086), (SubLObject)makeInteger(3088)), ConsesLow.list((SubLObject)makeInteger(3090), (SubLObject)makeInteger(3112)), ConsesLow.list((SubLObject)makeInteger(3114), (SubLObject)makeInteger(3123)), ConsesLow.list((SubLObject)makeInteger(3125), (SubLObject)makeInteger(3129)), ConsesLow.list((SubLObject)makeInteger(3168), (SubLObject)makeInteger(3169)), ConsesLow.list((SubLObject)makeInteger(3205), (SubLObject)makeInteger(3212)), ConsesLow.list((SubLObject)makeInteger(3214), (SubLObject)makeInteger(3216)), ConsesLow.list((SubLObject)makeInteger(3218), (SubLObject)makeInteger(3240)), ConsesLow.list((SubLObject)makeInteger(3242), (SubLObject)makeInteger(3251)), ConsesLow.list((SubLObject)makeInteger(3253), (SubLObject)makeInteger(3257)), ConsesLow.list((SubLObject)makeInteger(3294), (SubLObject)makeInteger(3294)), ConsesLow.list((SubLObject)makeInteger(3296), (SubLObject)makeInteger(3297)), ConsesLow.list((SubLObject)makeInteger(3333), (SubLObject)makeInteger(3340)), ConsesLow.list((SubLObject)makeInteger(3342), (SubLObject)makeInteger(3344)), ConsesLow.list((SubLObject)makeInteger(3346), (SubLObject)makeInteger(3368)), ConsesLow.list((SubLObject)makeInteger(3370), (SubLObject)makeInteger(3385)), ConsesLow.list((SubLObject)makeInteger(3424), (SubLObject)makeInteger(3425)), ConsesLow.list((SubLObject)makeInteger(3585), (SubLObject)makeInteger(3630)), ConsesLow.list((SubLObject)makeInteger(3632), (SubLObject)makeInteger(3632)), ConsesLow.list((SubLObject)makeInteger(3634), (SubLObject)makeInteger(3635)), ConsesLow.list((SubLObject)makeInteger(3648), (SubLObject)makeInteger(3653)), ConsesLow.list((SubLObject)makeInteger(3713), (SubLObject)makeInteger(3714)), ConsesLow.list((SubLObject)makeInteger(3716), (SubLObject)makeInteger(3716)), ConsesLow.list((SubLObject)makeInteger(3719), (SubLObject)makeInteger(3720)), ConsesLow.list((SubLObject)makeInteger(3722), (SubLObject)makeInteger(3722)), ConsesLow.list((SubLObject)makeInteger(3725), (SubLObject)makeInteger(3725)), ConsesLow.list((SubLObject)makeInteger(3732), (SubLObject)makeInteger(3735)), ConsesLow.list((SubLObject)makeInteger(3737), (SubLObject)makeInteger(3743)), ConsesLow.list((SubLObject)makeInteger(3745), (SubLObject)makeInteger(3747)), ConsesLow.list((SubLObject)makeInteger(3749), (SubLObject)makeInteger(3749)), ConsesLow.list((SubLObject)makeInteger(3751), (SubLObject)makeInteger(3751)), ConsesLow.list((SubLObject)makeInteger(3754), (SubLObject)makeInteger(3755)), ConsesLow.list((SubLObject)makeInteger(3757), (SubLObject)makeInteger(3758)), ConsesLow.list((SubLObject)makeInteger(3760), (SubLObject)makeInteger(3760)), ConsesLow.list((SubLObject)makeInteger(3762), (SubLObject)makeInteger(3763)), ConsesLow.list((SubLObject)makeInteger(3773), (SubLObject)makeInteger(3773)), ConsesLow.list((SubLObject)makeInteger(3776), (SubLObject)makeInteger(3780)), ConsesLow.list((SubLObject)makeInteger(3904), (SubLObject)makeInteger(3911)), ConsesLow.list((SubLObject)makeInteger(3913), (SubLObject)makeInteger(3945)), ConsesLow.list((SubLObject)makeInteger(4256), (SubLObject)makeInteger(4293)), ConsesLow.list((SubLObject)makeInteger(4304), (SubLObject)makeInteger(4342)), ConsesLow.list((SubLObject)makeInteger(4352), (SubLObject)makeInteger(4352)), ConsesLow.list((SubLObject)makeInteger(4354), (SubLObject)makeInteger(4355)), ConsesLow.list((SubLObject)makeInteger(4357), (SubLObject)makeInteger(4359)), ConsesLow.list((SubLObject)makeInteger(4361), (SubLObject)makeInteger(4361)), ConsesLow.list((SubLObject)makeInteger(4363), (SubLObject)makeInteger(4364)), ConsesLow.list((SubLObject)makeInteger(4366), (SubLObject)makeInteger(4370)), ConsesLow.list((SubLObject)makeInteger(4412), (SubLObject)makeInteger(4412)), ConsesLow.list((SubLObject)makeInteger(4414), (SubLObject)makeInteger(4414)), ConsesLow.list((SubLObject)makeInteger(4416), (SubLObject)makeInteger(4416)), ConsesLow.list((SubLObject)makeInteger(4428), (SubLObject)makeInteger(4428)), ConsesLow.list((SubLObject)makeInteger(4430), (SubLObject)makeInteger(4430)), ConsesLow.list((SubLObject)makeInteger(4432), (SubLObject)makeInteger(4432)), ConsesLow.list((SubLObject)makeInteger(4436), (SubLObject)makeInteger(4437)), ConsesLow.list((SubLObject)makeInteger(4441), (SubLObject)makeInteger(4441)), ConsesLow.list((SubLObject)makeInteger(4447), (SubLObject)makeInteger(4449)), ConsesLow.list((SubLObject)makeInteger(4451), (SubLObject)makeInteger(4451)), ConsesLow.list((SubLObject)makeInteger(4453), (SubLObject)makeInteger(4453)), ConsesLow.list((SubLObject)makeInteger(4455), (SubLObject)makeInteger(4455)), ConsesLow.list((SubLObject)makeInteger(4457), (SubLObject)makeInteger(4457)), ConsesLow.list((SubLObject)makeInteger(4461), (SubLObject)makeInteger(4462)), ConsesLow.list((SubLObject)makeInteger(4466), (SubLObject)makeInteger(4467)), ConsesLow.list((SubLObject)makeInteger(4469), (SubLObject)makeInteger(4469)), ConsesLow.list((SubLObject)makeInteger(4510), (SubLObject)makeInteger(4510)), ConsesLow.list((SubLObject)makeInteger(4520), (SubLObject)makeInteger(4520)), ConsesLow.list((SubLObject)makeInteger(4523), (SubLObject)makeInteger(4523)), ConsesLow.list((SubLObject)makeInteger(4526), (SubLObject)makeInteger(4527)), ConsesLow.list((SubLObject)makeInteger(4535), (SubLObject)makeInteger(4536)), ConsesLow.list((SubLObject)makeInteger(4538), (SubLObject)makeInteger(4538)), ConsesLow.list((SubLObject)makeInteger(4540), (SubLObject)makeInteger(4546)), ConsesLow.list((SubLObject)makeInteger(4587), (SubLObject)makeInteger(4587)), ConsesLow.list((SubLObject)makeInteger(4592), (SubLObject)makeInteger(4592)), ConsesLow.list((SubLObject)makeInteger(4601), (SubLObject)makeInteger(4601)), ConsesLow.list((SubLObject)makeInteger(7680), (SubLObject)makeInteger(7835)), ConsesLow.list((SubLObject)makeInteger(7840), (SubLObject)makeInteger(7929)), ConsesLow.list((SubLObject)makeInteger(7936), (SubLObject)makeInteger(7957)), ConsesLow.list((SubLObject)makeInteger(7960), (SubLObject)makeInteger(7965)), ConsesLow.list((SubLObject)makeInteger(7968), (SubLObject)makeInteger(8005)), ConsesLow.list((SubLObject)makeInteger(8008), (SubLObject)makeInteger(8013)), ConsesLow.list((SubLObject)makeInteger(8016), (SubLObject)makeInteger(8023)), ConsesLow.list((SubLObject)makeInteger(8025), (SubLObject)makeInteger(8025)), ConsesLow.list((SubLObject)makeInteger(8027), (SubLObject)makeInteger(8027)), ConsesLow.list((SubLObject)makeInteger(8029), (SubLObject)makeInteger(8029)), ConsesLow.list((SubLObject)makeInteger(8031), (SubLObject)makeInteger(8061)), ConsesLow.list((SubLObject)makeInteger(8064), (SubLObject)makeInteger(8116)), ConsesLow.list((SubLObject)makeInteger(8118), (SubLObject)makeInteger(8124)), ConsesLow.list((SubLObject)makeInteger(8126), (SubLObject)makeInteger(8126)), ConsesLow.list((SubLObject)makeInteger(8130), (SubLObject)makeInteger(8132)), ConsesLow.list((SubLObject)makeInteger(8134), (SubLObject)makeInteger(8140)), ConsesLow.list((SubLObject)makeInteger(8144), (SubLObject)makeInteger(8147)), ConsesLow.list((SubLObject)makeInteger(8150), (SubLObject)makeInteger(8155)), ConsesLow.list((SubLObject)makeInteger(8160), (SubLObject)makeInteger(8172)), ConsesLow.list((SubLObject)makeInteger(8178), (SubLObject)makeInteger(8180)), ConsesLow.list((SubLObject)makeInteger(8182), (SubLObject)makeInteger(8188)), ConsesLow.list((SubLObject)makeInteger(8486), (SubLObject)makeInteger(8486)), ConsesLow.list((SubLObject)makeInteger(8490), (SubLObject)makeInteger(8491)), ConsesLow.list((SubLObject)makeInteger(8494), (SubLObject)makeInteger(8494)), ConsesLow.list((SubLObject)makeInteger(8576), (SubLObject)makeInteger(8578)), ConsesLow.list((SubLObject)makeInteger(12353), (SubLObject)makeInteger(12436)), ConsesLow.list((SubLObject)makeInteger(12449), (SubLObject)makeInteger(12538)), ConsesLow.list((SubLObject)makeInteger(12549), (SubLObject)makeInteger(12588)), ConsesLow.list((SubLObject)makeInteger(44032), (SubLObject)makeInteger(55203)) });
    }
    
    public void declareFunctions() {
        f36815();
    }
    
    public void initializeVariables() {
        f36816();
    }
    
    public void runTopLevelForms() {
        f36817();
    }
    
    static {
        me = (SubLFile)new module0601();
        $g4651$ = null;
        $g4652$ = null;
        $g4653$ = null;
        $g4654$ = null;
        $g4655$ = null;
        $g4656$ = null;
        $g4657$ = null;
        $g4658$ = null;
        $g4659$ = null;
        $g4660$ = null;
        $ic0$ = (SubLFloat)makeDouble(1.0);
        $ic1$ = makeSymbol("CLET");
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#40601", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("+"), (SubLObject)makeSymbol("S#40602", "CYC"), (SubLObject)makeSymbol("S#40601", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1767", "CYC"), (SubLObject)makeSymbol("S#40601", "CYC")));
        $ic3$ = makeSymbol("S#40573", "CYC");
        $ic4$ = makeString("Skipping invalid xml character ~S in ~S");
        $ic5$ = makeSymbol("CHAR=");
        $ic6$ = makeString("US-ASCII");
        $ic7$ = makeSymbol("FLOATP");
        $ic8$ = makeSymbol("STRINGP");
        $ic9$ = makeSymbol("BOOLEANP");
        $ic10$ = makeString("<?xml version=");
        $ic11$ = makeSymbol("DOUBLE-FLOAT");
        $ic12$ = makeString(" encoding=");
        $ic13$ = makeString(" standalone=");
        $ic14$ = makeString("yes");
        $ic15$ = makeString("no");
        $ic16$ = makeString(" ?>");
        $ic17$ = makeString("<![CDATA[");
        $ic18$ = makeString("]]>");
        $ic19$ = makeString("<!--");
        $ic20$ = makeString("-->");
        $ic21$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#1762", "CYC"), (SubLObject)makeSymbol("S#23701", "CYC"), (SubLObject)makeSymbol("S#40609", "CYC"), (SubLObject)makeSymbol("S#40610", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic22$ = makeSymbol("CUNWIND-PROTECT");
        $ic23$ = makeSymbol("S#40544", "CYC");
        $ic24$ = makeSymbol("S#39596", "CYC");
        $ic25$ = makeSymbol("PUNLESS");
        $ic26$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#40545", "CYC")));
        $ic27$ = makeSymbol("S#39597", "CYC");
        $ic28$ = makeString("=\"");
        $ic29$ = makeString("/>");
        $ic30$ = makeString("</");
        $ic31$ = makeString("&");
        $ic32$ = makeString(";");
        $ic33$ = makeSymbol("S#40562", "CYC");
        $ic34$ = makeSymbol("S#40565", "CYC");
        $ic35$ = ConsesLow.list((SubLObject)makeInteger(46), (SubLObject)makeInteger(45), (SubLObject)makeInteger(95), (SubLObject)makeInteger(58));
        $ic36$ = _constant_36_initializer();
        $ic37$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeInteger(19968), (SubLObject)makeInteger(40869)), (SubLObject)ConsesLow.list((SubLObject)makeInteger(12295), (SubLObject)makeInteger(12295)), (SubLObject)ConsesLow.list((SubLObject)makeInteger(12321), (SubLObject)makeInteger(12329)));
        $ic38$ = ConsesLow.list((SubLObject)makeSymbol("S#35333", "CYC"), (SubLObject)makeSymbol("S#35334", "CYC"));
        $ic39$ = ConsesLow.list((SubLObject)Characters.CHAR_ampersand, (SubLObject)Characters.CHAR_quotation, (SubLObject)Characters.CHAR_quote, (SubLObject)Characters.CHAR_greater, (SubLObject)Characters.CHAR_less, (SubLObject)Characters.CHAR_newline);
        $ic40$ = makeString(" ");
        $ic41$ = makeInteger(34);
        $ic42$ = makeString("&quot;");
        $ic43$ = makeInteger(38);
        $ic44$ = makeString("&amp;");
        $ic45$ = makeInteger(39);
        $ic46$ = makeString("&apos;");
        $ic47$ = makeInteger(60);
        $ic48$ = makeString("&lt;");
        $ic49$ = makeInteger(62);
        $ic50$ = makeString("&gt;");
        $ic51$ = makeSymbol("DIGIT-CHAR-P");
        $ic52$ = makeSymbol("S#4118", "CYC");
        $ic53$ = ConsesLow.list((SubLObject)makeSymbol("STREAM"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic54$ = makeSymbol("S#1764", "CYC");
        $ic55$ = ConsesLow.list((SubLObject)makeSymbol("S#760", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic56$ = makeSymbol("SYMBOLP");
        $ic57$ = makeUninternedSymbol("US#541F852");
        $ic58$ = makeSymbol("CWITH-OUTPUT-TO-STRING");
        $ic59$ = makeSymbol("S#40585", "CYC");
        $ic60$ = makeSymbol("S#40587", "CYC");
        $ic61$ = ConsesLow.list((SubLObject)makeSymbol("S#39603", "CYC"));
        $ic62$ = makeString("<!DOCTYPE ~A SYSTEM ~S>");
        $ic63$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#39890", "CYC"), (SubLObject)makeSymbol("S#1762", "CYC"));
        $ic64$ = makeString("xmlns:");
        $ic65$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#1737", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic66$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic67$ = makeString("xml:");
        $ic68$ = makeString("http:");
        $ic69$ = makeString("Couldn't resolve ~S based on ~S and ~S.");
        $ic70$ = makeSymbol("LISTP");
        $ic71$ = makeSymbol("S#16759", "CYC");
        $ic72$ = makeSymbol("S#40594", "CYC");
        $ic73$ = makeKeyword("NAME");
        $ic74$ = makeKeyword("ATTRIBUTES");
        $ic75$ = makeKeyword("ELEMENTS");
        $ic76$ = makeKeyword("TEXT");
        $ic77$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#40611", "CYC"), (SubLObject)makeSymbol("S#40612", "CYC"));
        $ic78$ = makeString("<~A");
        $ic79$ = makeString("#$");
        $ic80$ = makeString(" ~A=~A");
        $ic81$ = makeString(">~%");
        $ic82$ = makeString("~A~%");
        $ic83$ = makeString("</~A>~%");
        $ic84$ = makeString("/>~%");
        $ic85$ = makeKeyword("SORT-ASC");
        $ic86$ = makeKeyword("SORT-DESC");
        $ic87$ = makeString("(:name \"binding\" :elements (");
        $ic88$ = makeString("(:name \"");
        $ic89$ = makeString("\" :text ");
        $ic90$ = makeString(") ");
        $ic91$ = makeString("))");
        $ic92$ = makeString("root");
        $ic93$ = makeSymbol("QUERY-RESULTS-TO-XML-STREAM");
        $ic94$ = makeKeyword("DEFAULT");
        $ic95$ = makeSymbol("QUERY-RESULTS-TO-XML-FILE");
        $ic96$ = makeKeyword("OUTPUT");
        $ic97$ = makeString("Unable to open ~S");
        $ic98$ = makeSymbol("QUERY-RESULTS-TO-XML-STRING");
        $ic99$ = makeString("true");
        $ic100$ = makeString("false");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 404 ms
	
	Decompiled with Procyon 0.5.32.
*/