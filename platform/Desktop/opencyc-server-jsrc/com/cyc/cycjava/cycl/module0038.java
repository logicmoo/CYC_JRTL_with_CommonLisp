package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0038 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0038";
    public static final String myFingerPrint = "84737255f37bccd5fe15e9129d8c7261544ca0e4b1936b642d94dc9afd4d140c";
    public static SubLSymbol $g913$;
    public static SubLSymbol $g914$;
    public static SubLSymbol $g915$;
    public static SubLSymbol $g916$;
    public static SubLSymbol $g917$;
    public static SubLSymbol $g918$;
    private static SubLSymbol $g920$;
    public static SubLSymbol $g921$;
    private static SubLSymbol $g922$;
    private static SubLSymbol $g923$;
    private static SubLSymbol $g924$;
    private static SubLSymbol $g925$;
    private static SubLSymbol $g926$;
    private static SubLSymbol $g927$;
    public static SubLSymbol $g928$;
    private static SubLSymbol $g929$;
    private static SubLSymbol $g930$;
    private static SubLSymbol $g931$;
    private static SubLSymbol $g932$;
    private static SubLSymbol $g933$;
    public static SubLSymbol $g934$;
    public static SubLSymbol $g935$;
    public static SubLSymbol $g936$;
    private static final SubLString $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLInteger $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLInteger $ic32$;
    private static final SubLInteger $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLList $ic49$;
    private static final SubLList $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLList $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLList $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLInteger $ic63$;
    private static final SubLInteger $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLList $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLList $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLString $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLInteger $ic89$;
    private static final SubLInteger $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLInteger $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLList $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLList $ic103$;
    private static final SubLList $ic104$;
    private static final SubLList $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLList $ic107$;
    private static final SubLList $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLString $ic111$;
    private static final SubLString $ic112$;
    private static final SubLInteger $ic113$;
    private static final SubLList $ic114$;
    private static final SubLFloat $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLInteger $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLInteger $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLString $ic123$;
    private static final SubLList $ic124$;
    private static final SubLList $ic125$;
    private static final SubLList $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLList $ic129$;
    private static final SubLList $ic130$;
    private static final SubLList $ic131$;
    private static final SubLList $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLList $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLString $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLString $ic179$;
    private static final SubLInteger $ic180$;
    private static final SubLString $ic181$;
    private static final SubLString $ic182$;
    private static final SubLFloat $ic183$;
    private static final SubLString $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLString $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLString $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLString $ic195$;
    private static final SubLString $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLString $ic198$;
    private static final SubLString $ic199$;
    private static final SubLInteger $ic200$;
    private static final SubLInteger $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLString $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLString $ic207$;
    
    public static SubLObject f2606(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0035.f1965(var1, $g918$.getDynamicValue(var2));
    }
    
    public static SubLObject f2607(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic1$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic1$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic1$);
        var9 = var6.first();
        var6 = var6.rest();
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = var6;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13_14 = (SubLObject)NIL;
        while (NIL != var11) {
            cdestructuring_bind.destructuring_bind_must_consp(var11, var5, (SubLObject)$ic1$);
            var13_14 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var5, (SubLObject)$ic1$);
            if (NIL == conses_high.member(var13_14, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var12 = (SubLObject)T;
            }
            if (var13_14 == $ic3$) {
                var10 = var11.first();
            }
            var11 = var11.rest();
        }
        if (NIL != var12 && NIL == var10) {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic1$);
        }
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var6);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : $ic5$);
        final SubLObject var15;
        var6 = (var15 = var7);
        final SubLObject var16 = (SubLObject)$ic6$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic8$, var14), (SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.listS((SubLObject)$ic9$, var9, (SubLObject)$ic10$))), (SubLObject)ConsesLow.listS((SubLObject)$ic11$, (SubLObject)ConsesLow.list(var8, var16), ConsesLow.append(var15, (SubLObject)NIL)));
    }
    
    public static SubLObject f2608(final SubLObject var19) {
        return Equality.equal($g916$.getGlobalValue(), var19);
    }
    
    public static SubLObject f2609(final SubLObject var19) {
        return (SubLObject)makeBoolean(NIL != f2608(var19) || module0208.$g919$.getGlobalValue().equal(var19));
    }
    
    public static SubLObject f2610(final SubLObject var9) {
        return f2608(var9);
    }
    
    public static SubLObject f2611(final SubLObject var19) {
        return (SubLObject)makeBoolean(var19.isString() && NIL == f2608(var19));
    }
    
    public static SubLObject f2612(final SubLObject var20, final SubLObject var9, SubLObject var21) {
        if (var21 == UNPROVIDED) {
            var21 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        SubLObject var22 = (SubLObject)NIL;
        if (var21.eql(Symbols.symbol_function((SubLObject)IDENTITY)) || var21 == IDENTITY) {
            final SubLObject var23 = Sequences.length(var9);
            if (NIL == var22) {
                SubLObject var25_26;
                SubLObject var24;
                SubLObject var25;
                for (var25_26 = var23, var24 = (SubLObject)NIL, var24 = (SubLObject)ZERO_INTEGER; NIL == var22 && !var24.numGE(var25_26); var22 = (SubLObject)makeBoolean(NIL == Functions.funcall(var20, var25)), var24 = module0048.f_1X(var24)) {
                    var25 = Strings.sublisp_char(var9, var24);
                }
            }
        }
        else {
            final SubLObject var23 = Sequences.length(var9);
            if (NIL == var22) {
                SubLObject var24;
                SubLObject var25;
                SubLObject var25_27;
                for (var25_27 = var23, var24 = (SubLObject)NIL, var24 = (SubLObject)ZERO_INTEGER; NIL == var22 && !var24.numGE(var25_27); var22 = (SubLObject)makeBoolean(NIL == Functions.funcall(var20, Functions.funcall(var21, var25))), var24 = module0048.f_1X(var24)) {
                    var25 = Strings.sublisp_char(var9, var24);
                }
            }
        }
        return (SubLObject)makeBoolean(NIL == var22);
    }
    
    public static SubLObject f2613(final SubLObject var20, final SubLObject var9, SubLObject var21) {
        if (var21 == UNPROVIDED) {
            var21 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        SubLObject var22 = (SubLObject)NIL;
        if (var21.eql(Symbols.symbol_function((SubLObject)IDENTITY)) || var21 == IDENTITY) {
            final SubLObject var23 = Sequences.length(var9);
            if (NIL == var22) {
                SubLObject var25_30;
                SubLObject var24;
                SubLObject var25;
                for (var25_30 = var23, var24 = (SubLObject)NIL, var24 = (SubLObject)ZERO_INTEGER; NIL == var22 && !var24.numGE(var25_30); var22 = Functions.funcall(var20, var25), var24 = module0048.f_1X(var24)) {
                    var25 = Strings.sublisp_char(var9, var24);
                }
            }
        }
        else {
            final SubLObject var23 = Sequences.length(var9);
            if (NIL == var22) {
                SubLObject var24;
                SubLObject var25;
                SubLObject var25_31;
                for (var25_31 = var23, var24 = (SubLObject)NIL, var24 = (SubLObject)ZERO_INTEGER; NIL == var22 && !var24.numGE(var25_31); var22 = Functions.funcall(var20, Functions.funcall(var21, var25)), var24 = module0048.f_1X(var24)) {
                    var25 = Strings.sublisp_char(var9, var24);
                }
            }
        }
        return var22;
    }
    
    public static SubLObject f2614(final SubLObject var19) {
        return module0035.f2192(Symbols.symbol_function((SubLObject)$ic12$), var19);
    }
    
    public static SubLObject f2615() {
        final SubLObject var32 = $g920$.getGlobalValue();
        if (NIL != var32) {
            module0034.f1818(var32);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2616(final SubLObject var19) {
        return module0034.f1829($g920$.getGlobalValue(), (SubLObject)ConsesLow.list(var19), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2617(final SubLObject var19) {
        return print_high.princ_to_string(var19);
    }
    
    public static SubLObject f2618(final SubLObject var19) {
        SubLObject var20 = $g920$.getGlobalValue();
        if (NIL == var20) {
            var20 = module0034.f1934((SubLObject)$ic13$, (SubLObject)$ic14$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)$ic15$);
        }
        SubLObject var21 = module0034.f1814(var20, var19, (SubLObject)$ic16$);
        if (var21 == $ic16$) {
            var21 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f2617(var19)));
            module0034.f1816(var20, var19, var21, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var21);
    }
    
    public static SubLObject f2619(final SubLObject var35) {
        if (NIL != constant_handles_oc.f8449(var35)) {
            return f2618(var35);
        }
        if (NIL != module0167.f10813(var35)) {
            return f2618(module0172.f10920(var35));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2620(final SubLObject var36) {
        if (var36.isSymbol()) {
            return Symbols.symbol_name(var36);
        }
        if (var36.isFunction()) {
            return f2621(f2622(f2623(print_high.princ_to_string(var36), (SubLObject)ELEVEN_INTEGER, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED), (SubLObject)$ic17$, (SubLObject)UNPROVIDED);
        }
        return print_high.princ_to_string(var36);
    }
    
    public static SubLObject f2624(final SubLObject var37) {
        return print_high.princ_to_string(var37);
    }
    
    public static SubLObject f2625(final SubLObject var37) {
        if (NIL != var37) {
            return f2624(var37);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2626(final SubLObject var37) {
        return f2627(print_high.prin1_to_string(var37));
    }
    
    public static SubLObject f2628(final SubLObject var19, final SubLObject var38) {
        final SubLObject var39 = f2624(var19);
        final SubLObject var40 = Sequences.length(var39);
        return var40.numGE(var38) ? f2629(var38, var39) : Sequences.cconcatenate(var39, Strings.make_string(Numbers.subtract(var38, var40), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f2630(final SubLObject var40, final SubLObject var41) {
        SubLObject var42 = (SubLObject)NIL;
        final SubLObject var43 = module0048.f_1_(Sequences.length(var40));
        SubLObject var44 = (SubLObject)NIL;
        try {
            var44 = streams_high.make_private_string_output_stream();
            streams_high.write_string((SubLObject)$ic18$, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var45;
            SubLObject var46;
            for (var45 = module0048.f3382((SubLObject)ConsesLow.list(var41, Sequences.length(var40)), (SubLObject)UNPROVIDED), var46 = (SubLObject)NIL, var46 = (SubLObject)ZERO_INTEGER; var46.numL(var45); var46 = Numbers.add(var46, (SubLObject)ONE_INTEGER)) {
                streams_high.write_string(f2624(Sequences.elt(var40, var46)), var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (!var46.eql(var43)) {
                    streams_high.write_string((SubLObject)$ic19$, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            if (var41.numL(Sequences.length(var40))) {
                streams_high.write_string((SubLObject)$ic20$, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            streams_high.write_string((SubLObject)$ic21$, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var42 = streams_high.get_output_stream_string(var44);
        }
        finally {
            final SubLObject var47 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                streams_high.close(var44, (SubLObject)UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var47);
            }
        }
        return var42;
    }
    
    public static SubLObject f2631(final SubLObject var9, final SubLObject var46) {
        if (var46.numGE((SubLObject)ZERO_INTEGER) && var46.numL(Sequences.length(var9))) {
            return Strings.sublisp_char(var9, var46);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2632(final SubLObject var9, SubLObject var48) {
        if (var48 == UNPROVIDED) {
            var48 = (SubLObject)$ic22$;
        }
        return f2633(f2634(var9, var48), var48);
    }
    
    public static SubLObject f2627(final SubLObject var9) {
        SubLObject var10 = var9;
        if (NIL != f2635(var9)) {
            var10 = f2623(var10, (SubLObject)ONE_INTEGER, module0048.f_1_(Sequences.length(var9)));
        }
        return var10;
    }
    
    public static SubLObject f2635(final SubLObject var9) {
        assert NIL != Types.stringp(var9) : var9;
        if (NIL != module0035.f1994(var9, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        final SubLObject var10 = f2636(var9);
        final SubLObject var11 = (SubLObject)makeBoolean((var10.eql((SubLObject)Characters.CHAR_quote) || var10.eql((SubLObject)Characters.CHAR_quotation)) && var10.eql(f2637(var9)));
        return var11;
    }
    
    public static SubLObject f2638(final SubLObject var19) {
        return module0006.f202(var19);
    }
    
    public static SubLObject f2639(final SubLObject var51, final SubLObject var52, SubLObject var53) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        return Functions.funcall(var53, module0036.f2547(var51, Symbols.symbol_function((SubLObject)$ic23$), Symbols.symbol_function((SubLObject)$ic24$), Symbols.symbol_function((SubLObject)$ic13$), (SubLObject)UNPROVIDED), module0036.f2547(var52, Symbols.symbol_function((SubLObject)$ic23$), Symbols.symbol_function((SubLObject)$ic24$), Symbols.symbol_function((SubLObject)$ic13$), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f2640(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        final SubLObject var21 = f2618(var19);
        var20.resetMultipleValues();
        final SubLObject var22 = reader.read_from_string_ignoring_errors(var21, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var23 = var20.secondMultipleValue();
        var20.resetMultipleValues();
        return (SubLObject)makeBoolean(!var23.eql((SubLObject)$ic25$));
    }
    
    public static SubLObject f2641(final SubLObject var9) {
        final SubLObject var10 = reader.read_from_string_ignoring_errors(var9, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)(var10.isNumber() ? var10 : NIL);
    }
    
    public static SubLObject f2642(final SubLObject var9) {
        final SubLObject var10 = reader.read_from_string_ignoring_errors(var9, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)(var10.isInteger() ? var10 : NIL);
    }
    
    public static SubLObject f2643(final SubLObject var9) {
        return f2642(var9);
    }
    
    public static SubLObject f2644(final SubLObject var56, final SubLObject var57) {
        final SubLObject var58 = f2642(var56);
        final SubLObject var59 = f2642(var57);
        if (NIL == var59) {
            return (SubLObject)T;
        }
        if (NIL == var58) {
            return (SubLObject)NIL;
        }
        return Numbers.numL(var58, var59);
    }
    
    public static SubLObject f2645(final SubLObject var60) {
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic26$, var60);
    }
    
    public static SubLObject f2646(final SubLObject var9) {
        final SubLObject var10 = Sequences.length(var9);
        return reader.parse_integer(var9, (SubLObject)TWO_INTEGER, var10, (SubLObject)SIXTEEN_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2647(final SubLObject var62, final SubLObject var63) {
        return Numbers.numL(Sequences.length(var62), Sequences.length(var63));
    }
    
    public static SubLObject f2648(final SubLObject var44, final SubLObject var41) {
        SubLObject var45;
        for (var45 = (SubLObject)NIL, var45 = (SubLObject)ZERO_INTEGER; var45.numL(var41); var45 = Numbers.add(var45, (SubLObject)ONE_INTEGER)) {
            streams_high.write_char((SubLObject)Characters.CHAR_space, var44);
        }
        return var44;
    }
    
    public static SubLObject f2649(final SubLObject var65, SubLObject var46) {
        assert NIL != Types.fixnump(var46) : var46;
        var46 = Numbers.subtract(Sequences.length(var65), var46, (SubLObject)ONE_INTEGER);
        return Vectors.aref(var65, var46);
    }
    
    public static SubLObject f2650(final SubLObject var9, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var9) : var9;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var47) && NIL == module0035.f2000(var9, var46, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic28$, var9, var46);
        }
        return f2649(var9, var46);
    }
    
    public static SubLObject f2636(final SubLObject var9) {
        return Strings.sublisp_char(var9, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f2651(final SubLObject var9) {
        return f2629((SubLObject)ONE_INTEGER, var9);
    }
    
    public static SubLObject f2652(final SubLObject var9) {
        assert NIL != f2653(var9) : var9;
        return f2654(var9);
    }
    
    public static SubLObject f2637(final SubLObject var9) {
        return f2650(var9, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f2655(final SubLObject var28, final SubLObject var9) {
        return Sequences.replace(Strings.make_string(module0048.f_1X(Sequences.length(var9)), var28), var9, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2656(final SubLObject var28, final SubLObject var9) {
        return Sequences.replace(Strings.make_string(module0048.f_1X(Sequences.length(var9)), var28), var9, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2657(final SubLObject var28, final SubLObject var9) {
        return Sequences.replace(Strings.make_string(Numbers.add((SubLObject)TWO_INTEGER, Sequences.length(var9)), var28), var9, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2658(final SubLObject var9) {
        assert NIL != Types.stringp(var9) : var9;
        return Sequences.copy_seq(var9);
    }
    
    public static SubLObject f2659(final SubLObject var66, final SubLObject var67, final SubLObject var9, SubLObject var53) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        assert NIL != Types.stringp(var66) : var66;
        assert NIL != Types.stringp(var67) : var67;
        assert NIL != Types.stringp(var9) : var9;
        if (NIL == Sequences.search(var67, var9, var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return var9;
        }
        final SubLObject var68 = Sequences.length(var67);
        if (ZERO_INTEGER.numE(var68) && NIL == Functions.funcall(var53, var67, (SubLObject)$ic0$)) {
            return var9;
        }
        SubLObject var69 = (SubLObject)NIL;
        SubLObject var70 = (SubLObject)NIL;
        try {
            var70 = streams_high.make_private_string_output_stream();
            final SubLObject var71 = Sequences.length(var9);
            if (ZERO_INTEGER.numE(var68)) {
                SubLObject var72;
                SubLObject var73;
                for (var72 = (SubLObject)NIL, var72 = (SubLObject)ZERO_INTEGER; var72.numL(var71); var72 = Numbers.add(var72, (SubLObject)ONE_INTEGER)) {
                    var73 = Numbers.add((SubLObject)ONE_INTEGER, var72);
                    streams_high.write_string(var66, var70, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    streams_high.write_string(var9, var70, var72, var73);
                }
                streams_high.write_string(var66, var70, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                SubLObject var72;
                SubLObject var73;
                for (var72 = (SubLObject)NIL, var73 = (SubLObject)NIL, var72 = (SubLObject)ZERO_INTEGER, var73 = Sequences.search(var67, var9, var53, Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, var68, var72, var71); NIL != var73; var73 = Sequences.search(var67, var9, var53, Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, var68, var72, var71)) {
                    streams_high.write_string(var9, var70, var72, var73);
                    streams_high.write_string(var66, var70, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var72 = Numbers.add(var73, var68);
                }
                streams_high.write_string(var9, var70, var72, (SubLObject)UNPROVIDED);
            }
            var69 = streams_high.get_output_stream_string(var70);
        }
        finally {
            final SubLObject var74 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                streams_high.close(var70, (SubLObject)UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var74);
            }
        }
        return var69;
    }
    
    public static SubLObject f2660(final SubLObject var66, final SubLObject var8, final SubLObject var9, SubLObject var53, SubLObject var71) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        if (var71 == UNPROVIDED) {
            var71 = $g914$.getGlobalValue();
        }
        final SubLThread var72 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var66) : var66;
        assert NIL != Types.stringp(var8) : var8;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var72) && NIL != Sequences.find(var71, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic30$, var8, var71);
        }
        assert NIL != Types.stringp(var9) : var9;
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = (SubLObject)NIL;
        try {
            var74 = streams_high.make_private_string_output_stream();
            final SubLObject var75 = $g918$.currentBinding(var72);
            try {
                $g918$.bind(var71, var72);
                SubLObject var77;
                final SubLObject var76 = var77 = f2661(var9, (SubLObject)$ic31$, (SubLObject)UNPROVIDED);
                SubLObject var78 = (SubLObject)NIL;
                var78 = var77.first();
                while (NIL != var77) {
                    if (NIL != Functions.funcall(var53, var78, var8)) {
                        streams_high.write_string(var66, var74, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else {
                        streams_high.write_string(var78, var74, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    streams_high.write_char(var71, var74);
                    var77 = var77.rest();
                    var78 = var77.first();
                }
            }
            finally {
                $g918$.rebind(var75, var72);
            }
            var73 = streams_high.get_output_stream_string(var74);
        }
        finally {
            final SubLObject var79 = Threads.$is_thread_performing_cleanupP$.currentBinding(var72);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var72);
                streams_high.close(var74, (SubLObject)UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var79, var72);
            }
        }
        return f2662(var73);
    }
    
    public static SubLObject f2663(final SubLObject var9, final SubLObject var75, SubLObject var53) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (Sequences.length(var9).numE((SubLObject)ZERO_INTEGER)) {
            return var9;
        }
        SubLObject var76 = Strings.make_string(Numbers.max((SubLObject)$ic32$, Numbers.multiply((SubLObject)FOUR_INTEGER, Sequences.length(var9))), (SubLObject)UNPROVIDED);
        SubLObject var77 = (SubLObject)ZERO_INTEGER;
        SubLObject var79;
        SubLObject var78 = var79 = (SubLObject)ZERO_INTEGER;
        SubLObject var80 = (SubLObject)NIL;
        for (SubLObject var81 = (SubLObject)NIL; NIL == var81; var81 = Numbers.numGE(var79, Sequences.length(var9))) {
            SubLObject var82 = (SubLObject)NIL;
            SubLObject var83 = (SubLObject)NIL;
            if (NIL == var82) {
                SubLObject var84 = var75;
                SubLObject var85 = (SubLObject)NIL;
                var85 = var84.first();
                while (NIL == var82 && NIL != var84) {
                    var83 = Sequences.search(var85.first(), var9, var53, Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, (SubLObject)NIL, var79, (SubLObject)NIL);
                    if (NIL != var83) {
                        var82 = var85;
                    }
                    var84 = var84.rest();
                    var85 = var84.first();
                }
            }
            if (NIL != var82) {
                var80 = (SubLObject)T;
                var76 = Sequences.replace(var76, var9, var77, (SubLObject)NIL, var78, var83);
                var77 = Numbers.add(var77, Numbers.subtract(var83, var78));
                var76 = Sequences.replace(var76, var82.rest(), var77, (SubLObject)NIL, (SubLObject)ZERO_INTEGER, Sequences.length(var82.rest()));
                var77 = Numbers.add(var77, Sequences.length(var82.rest()));
                var78 = (var79 = Numbers.add(var83, Sequences.length(var82.first())));
            }
            else {
                var79 = Numbers.add(var79, (SubLObject)ONE_INTEGER);
            }
        }
        if (NIL != var80) {
            Sequences.replace(var76, var9, var77, (SubLObject)NIL, var78, var79);
            var77 = Numbers.add(var77, Numbers.subtract(var79, var78));
            var76 = Sequences.subseq(var76, (SubLObject)ZERO_INTEGER, var77);
        }
        else {
            var76 = var9;
        }
        return var76;
    }
    
    public static SubLObject f2664(final SubLObject var9, final SubLObject var75, SubLObject var53) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (Sequences.length(var9).numE((SubLObject)ZERO_INTEGER)) {
            return var9;
        }
        SubLObject var76 = Strings.make_string(Numbers.max((SubLObject)$ic33$, Numbers.multiply((SubLObject)FOUR_INTEGER, Sequences.length(var9))), (SubLObject)UNPROVIDED);
        SubLObject var77 = (SubLObject)ZERO_INTEGER;
        SubLObject var79;
        SubLObject var78 = var79 = (SubLObject)ZERO_INTEGER;
        SubLObject var80 = (SubLObject)NIL;
        for (SubLObject var81 = (SubLObject)NIL; NIL == var81; var81 = Numbers.numGE(var79, Sequences.length(var9))) {
            SubLObject var82 = Sequences.length(var9);
            SubLObject var83 = (SubLObject)NIL;
            SubLObject var84 = (SubLObject)NIL;
            SubLObject var85 = var75;
            SubLObject var86 = (SubLObject)NIL;
            var86 = var85.first();
            while (NIL != var85) {
                var84 = Sequences.search(var86.first(), var9, var53, Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, (SubLObject)NIL, var79, (SubLObject)NIL);
                if (NIL != var84 && var84.numL(var82)) {
                    var82 = var84;
                    var83 = var86;
                }
                var85 = var85.rest();
                var86 = var85.first();
            }
            if (NIL != var83) {
                var80 = (SubLObject)T;
                var76 = Sequences.replace(var76, var9, var77, (SubLObject)NIL, var78, var82);
                var77 = Numbers.add(var77, Numbers.subtract(var82, var78));
                var76 = Sequences.replace(var76, var83.rest(), var77, (SubLObject)NIL, (SubLObject)ZERO_INTEGER, Sequences.length(var83.rest()));
                var77 = Numbers.add(var77, Sequences.length(var83.rest()));
                var78 = (var79 = Numbers.add(var82, Sequences.length(var83.first())));
            }
            else {
                var79 = Numbers.add(var79, (SubLObject)ONE_INTEGER);
            }
        }
        if (NIL != var80) {
            Sequences.replace(var76, var9, var77, (SubLObject)NIL, var78, var79);
            var77 = Numbers.add(var77, Numbers.subtract(var79, var78));
            var76 = Sequences.subseq(var76, (SubLObject)ZERO_INTEGER, var77);
        }
        else {
            var76 = var9;
        }
        return var76;
    }
    
    public static SubLObject f2665(final SubLObject var85, final SubLObject var9) {
        final SubLThread var86 = SubLProcess.currentSubLThread();
        assert NIL != Types.listp(var85) : var85;
        assert NIL != Types.stringp(var9) : var9;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var86) && NIL == module0035.f2370(Symbols.symbol_function((SubLObject)$ic35$), var85, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic36$, var85);
        }
        if (NIL == var85) {
            return var9;
        }
        if (var9.equal((SubLObject)$ic0$)) {
            return var9;
        }
        SubLObject var87 = (SubLObject)ZERO_INTEGER;
        SubLObject var25_87;
        SubLObject var88;
        SubLObject var89;
        SubLObject var90;
        for (var88 = (var25_87 = Sequences.length(var9)), var89 = (SubLObject)NIL, var89 = (SubLObject)ZERO_INTEGER; !var89.numGE(var25_87); var89 = module0048.f_1X(var89)) {
            var90 = Strings.sublisp_char(var9, var89);
            if (NIL != module0004.f104(var90, var85, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var87 = Numbers.add(var87, (SubLObject)ONE_INTEGER);
            }
        }
        if (var87.numE((SubLObject)ZERO_INTEGER)) {
            return var9;
        }
        final SubLObject var91 = Strings.make_string(Numbers.add(Sequences.length(var9), var87), (SubLObject)UNPROVIDED);
        SubLObject var92 = (SubLObject)ZERO_INTEGER;
        SubLObject var93 = (SubLObject)ZERO_INTEGER;
        SubLObject var25_88;
        SubLObject var94;
        SubLObject var95;
        SubLObject var96;
        for (var94 = (var25_88 = Sequences.length(var9)), var95 = (SubLObject)NIL, var95 = (SubLObject)ZERO_INTEGER; !var95.numGE(var25_88); var95 = module0048.f_1X(var95)) {
            var96 = Strings.sublisp_char(var9, var95);
            if (NIL != module0004.f104(var96, var85, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                Strings.set_char(var91, Numbers.add(var92, var93), (SubLObject)Characters.CHAR_backslash);
                var93 = Numbers.add(var93, (SubLObject)ONE_INTEGER);
            }
            Strings.set_char(var91, Numbers.add(var92, var93), Sequences.elt(var9, var92));
            var92 = Numbers.add(var92, (SubLObject)ONE_INTEGER);
        }
        return var91;
    }
    
    public static SubLObject f2666(final SubLObject var9, SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)ONE_INTEGER;
        }
        return f2623(var9, (SubLObject)ZERO_INTEGER, Numbers.subtract(Sequences.length(var9), var41));
    }
    
    public static SubLObject f2667(final SubLObject var9, final SubLObject var92) {
        if (NIL != f2668(var92, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return f2664(var9, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(var92, $g916$.getGlobalValue())), (SubLObject)UNPROVIDED);
        }
        return var9;
    }
    
    public static SubLObject f2669(final SubLObject var9, final SubLObject var92, final SubLObject var66) {
        if (NIL != f2668(var92, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return f2664(var9, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(var92, var66)), (SubLObject)UNPROVIDED);
        }
        return var9;
    }
    
    public static SubLObject f2670(final SubLObject var9, final SubLObject var92, final SubLObject var66, SubLObject var77) {
        if (var77 == UNPROVIDED) {
            var77 = (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var93 = Sequences.search(var92, var9, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, (SubLObject)NIL, var77, (SubLObject)UNPROVIDED);
        if (NIL != var93) {
            final SubLObject var94 = Sequences.cconcatenate(f2623(var9, (SubLObject)ZERO_INTEGER, var93), new SubLObject[] { var66, f2623(var9, Numbers.add(var93, Sequences.length(var92)), (SubLObject)UNPROVIDED) });
            return var94;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2671(final SubLObject var9, final SubLObject var77, final SubLObject var38, final SubLObject var66) {
        assert NIL != Types.stringp(var9) : var9;
        assert NIL != module0004.f106(var77) : var77;
        assert NIL != module0004.f106(var38) : var38;
        assert NIL != Types.stringp(var66) : var66;
        if (NIL != module0035.f1995(var66, var38, (SubLObject)UNPROVIDED)) {
            SubLObject var25_94;
            SubLObject var78;
            SubLObject var79;
            SubLObject var80;
            for (var78 = (var25_94 = Sequences.length(var66)), var79 = (SubLObject)NIL, var79 = (SubLObject)ZERO_INTEGER; !var79.numGE(var25_94); var79 = module0048.f_1X(var79)) {
                var80 = Strings.sublisp_char(var66, var79);
                Strings.set_char(var9, Numbers.add(var77, var79), var80);
            }
            return var9;
        }
        return Sequences.cconcatenate(f2623(var9, (SubLObject)ZERO_INTEGER, var77), new SubLObject[] { var66, f2623(var9, Numbers.add(var77, var38), (SubLObject)UNPROVIDED) });
    }
    
    public static SubLObject f2672(final SubLObject var96, final SubLObject var97, final SubLObject var98) {
        if (Sequences.length(var97).numG(var98)) {
            return Sequences.cconcatenate(f2623(var97, (SubLObject)ZERO_INTEGER, Numbers.add(var98, (SubLObject)ONE_INTEGER)), new SubLObject[] { var96, f2623(var97, Numbers.add(var98, (SubLObject)ONE_INTEGER), Sequences.length(var97)) });
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2634(final SubLObject var99, final SubLObject var100) {
        return Sequences.cconcatenate(var99, var100);
    }
    
    public static SubLObject f2633(final SubLObject var99, final SubLObject var100) {
        return Sequences.cconcatenate(var100, var99);
    }
    
    public static SubLObject f2621(final SubLObject var99, final SubLObject var100, SubLObject var53) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        final SubLObject var101 = Sequences.length(var100);
        final SubLObject var102 = Sequences.length(var99);
        return (NIL != f2673(var99, var100, var53)) ? f2623(var99, (SubLObject)ZERO_INTEGER, Numbers.subtract(var102, var101)) : var99;
    }
    
    public static SubLObject f2674(final SubLObject var99, final SubLObject var100, SubLObject var53) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        return (NIL != f2675(var99, var100, var53)) ? f2623(var99, Sequences.length(var100), (SubLObject)UNPROVIDED) : var99;
    }
    
    public static SubLObject f2623(final SubLObject var9, final SubLObject var77, SubLObject var61) {
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var9) : var9;
        return Sequences.subseq(var9, var77, var61);
    }
    
    public static SubLObject f2629(final SubLObject var41, final SubLObject var9) {
        final SubLObject var42 = Numbers.min(var41, Sequences.length(var9));
        return f2623(var9, (SubLObject)ZERO_INTEGER, var42);
    }
    
    public static SubLObject f2676(final SubLObject var41, final SubLObject var9) {
        final SubLObject var42 = Sequences.length(var9);
        final SubLObject var43 = Numbers.subtract(var42, Numbers.min(var41, var42));
        return f2623(var9, var43, var42);
    }
    
    public static SubLObject f2662(final SubLObject var9) {
        return f2677(var9, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2673(final SubLObject var99, final SubLObject var104, SubLObject var53) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        return (SubLObject)makeBoolean(NIL != module0035.f2008(var99, var104) && NIL != f2678(var99, var104, Numbers.subtract(Sequences.length(var99), Sequences.length(var104)), var53));
    }
    
    public static SubLObject f2679(final SubLObject var9, final SubLObject var105) {
        SubLObject var106 = (SubLObject)NIL;
        SubLObject var107 = (SubLObject)NIL;
        if (NIL == var106) {
            SubLObject var108 = var105;
            SubLObject var109 = (SubLObject)NIL;
            var109 = var108.first();
            while (NIL == var106 && NIL != var108) {
                var106 = f2673(var9, var109, (SubLObject)UNPROVIDED);
                if (NIL != var106) {
                    var107 = var109;
                }
                var108 = var108.rest();
                var109 = var108.first();
            }
        }
        return Values.values(var106, var107);
    }
    
    public static SubLObject f2680(final SubLObject var109) {
        final SubLObject var110 = Sequences.length(var109);
        final SubLObject var111 = Strings.sublisp_char(var109, Numbers.subtract(var110, (SubLObject)ONE_INTEGER));
        return f2681(var111);
    }
    
    public static SubLObject f2682(final SubLObject var111) {
        return Characters.digit_char_p(f2637(var111), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2683(final SubLObject var111) {
        SubLObject var112 = (SubLObject)NIL;
        SubLObject var113 = (SubLObject)NIL;
        final SubLObject var114 = Sequences.reverse(var111);
        final SubLObject var115 = Sequences.length(var114);
        if (NIL == var113) {
            SubLObject var25_113;
            SubLObject var116;
            SubLObject var117;
            for (var25_113 = var115, var116 = (SubLObject)NIL, var116 = (SubLObject)ZERO_INTEGER; NIL == var113 && !var116.numGE(var25_113); var116 = module0048.f_1X(var116)) {
                var117 = Strings.sublisp_char(var114, var116);
                if (NIL != Characters.digit_char_p(var117, (SubLObject)UNPROVIDED)) {
                    var112 = var116;
                }
                else {
                    var113 = (SubLObject)T;
                }
            }
        }
        if (NIL == var112) {
            return (SubLObject)NIL;
        }
        final SubLObject var118 = Sequences.subseq(var111, Numbers.subtract(Sequences.length(var111), (SubLObject)ONE_INTEGER, var112), (SubLObject)UNPROVIDED);
        final SubLObject var119 = reader.read_from_string(var118, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var119;
    }
    
    public static SubLObject f2684(final SubLObject var99, final SubLObject var116) {
        return (SubLObject)makeBoolean(NIL != module0035.f2008(var99, var116) && NIL != f2678(var99, var116, (SubLObject)ZERO_INTEGER, Symbols.symbol_function((SubLObject)EQUAL)));
    }
    
    public static SubLObject f2685(final SubLObject var9, final SubLObject var117) {
        SubLObject var118 = (SubLObject)NIL;
        if (NIL == var118) {
            SubLObject var119;
            SubLObject var120;
            for (var119 = var117, var120 = (SubLObject)NIL, var120 = var119.first(); NIL == var118 && NIL != var119; var118 = f2684(var9, var120), var119 = var119.rest(), var120 = var119.first()) {}
        }
        return var118;
    }
    
    public static SubLObject f2675(final SubLObject var9, final SubLObject var116, SubLObject var53) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQUALP);
        }
        return (SubLObject)makeBoolean(NIL != module0035.f2008(var9, var116) && NIL != f2678(var9, var116, (SubLObject)ZERO_INTEGER, var53));
    }
    
    public static SubLObject f2686(final SubLObject var9, final SubLObject var117, SubLObject var53) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQUALP);
        }
        SubLObject var118 = (SubLObject)NIL;
        if (NIL == var118) {
            SubLObject var119;
            SubLObject var120;
            for (var119 = var117, var120 = (SubLObject)NIL, var120 = var119.first(); NIL == var118 && NIL != var119; var118 = f2675(var9, var120, var53), var119 = var119.rest(), var120 = var119.first()) {}
        }
        return var118;
    }
    
    public static SubLObject f2687(final SubLObject var9, final SubLObject var119, SubLObject var53) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQUALP);
        }
        return (SubLObject)((NIL != f2675(var9, var119, var53)) ? var119 : NIL);
    }
    
    public static SubLObject f2688(final SubLObject var62, final SubLObject var63, SubLObject var53, SubLObject var120) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQUALP);
        }
        if (var120 == UNPROVIDED) {
            var120 = (SubLObject)NIL;
        }
        SubLObject var121 = (SubLObject)ConsesLow.list((SubLObject)ZERO_INTEGER);
        if (NIL != var120) {
            SubLObject var122 = var120;
            SubLObject var123 = (SubLObject)NIL;
            var123 = var122.first();
            while (NIL != var122) {
                final SubLObject var124 = Sequences.length(var123);
                SubLObject var73_124 = f2689(var123, var62, var53, (SubLObject)UNPROVIDED);
                SubLObject var125 = (SubLObject)NIL;
                var125 = var73_124.first();
                while (NIL != var73_124) {
                    var121 = (SubLObject)ConsesLow.cons(Numbers.add(var125, var124), var121);
                    var73_124 = var73_124.rest();
                    var125 = var73_124.first();
                }
                var122 = var122.rest();
                var123 = var122.first();
            }
            var121 = Sort.sort(var121, (SubLObject)$ic38$, (SubLObject)UNPROVIDED);
        }
        else {
            var121 = module0035.f2160(Sequences.length(var63), (SubLObject)UNPROVIDED);
        }
        SubLObject var122 = var121;
        SubLObject var126 = (SubLObject)NIL;
        var126 = var122.first();
        while (NIL != var122) {
            final SubLObject var127 = f2623(var62, var126, (SubLObject)UNPROVIDED);
            if (NIL != f2687(var63, var127, var53)) {
                return var127;
            }
            var122 = var122.rest();
            var126 = var122.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2690(final SubLObject var9) {
        SubLObject var10 = (SubLObject)ZERO_INTEGER;
        SubLObject var25_127;
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        for (var11 = (var25_127 = Sequences.length(var9)), var12 = (SubLObject)NIL, var12 = (SubLObject)ZERO_INTEGER; !var12.numGE(var25_127); var12 = module0048.f_1X(var12)) {
            var13 = Strings.sublisp_char(var9, var12);
            if (var13.eql((SubLObject)Characters.CHAR_comma)) {
                var10 = Numbers.add(var10, (SubLObject)ONE_INTEGER);
            }
        }
        return var10;
    }
    
    public static SubLObject f2691(final SubLObject var9) {
        SubLObject var10 = (SubLObject)NIL;
        if (f2690(var9).numG((SubLObject)ZERO_INTEGER)) {
            final SubLObject var11 = f2689((SubLObject)$ic47$, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var12 = var11.first();
            final SubLObject var13 = f2692(var9, Numbers.add(var12, (SubLObject)ONE_INTEGER));
            final SubLObject var14 = var10 = Strings.string_left_trim((SubLObject)$ic48$, var13);
            return var10;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2693(final SubLObject var131) {
        SubLObject var132 = (SubLObject)NIL;
        SubLObject var133 = (SubLObject)NIL;
        SubLObject var134 = var131;
        SubLObject var135 = (SubLObject)NIL;
        var135 = var134.first();
        while (NIL != var134) {
            if (var135.isString()) {
                if (NIL != var133) {
                    var133 = Sequences.cconcatenate(var133, var135);
                }
                else {
                    var133 = var135;
                }
            }
            else {
                final SubLObject var136 = var133;
                if (NIL != var136) {
                    var132 = (SubLObject)ConsesLow.cons(var136, var132);
                }
                var132 = (SubLObject)ConsesLow.cons(var135, var132);
                var133 = (SubLObject)NIL;
            }
            var134 = var134.rest();
            var135 = var134.first();
        }
        final SubLObject var136 = var133;
        if (NIL != var136) {
            var132 = (SubLObject)ConsesLow.cons(var136, var132);
        }
        return Sequences.nreverse(var132);
    }
    
    public static SubLObject f2694(final SubLObject var9) {
        assert NIL != Types.stringp(var9) : var9;
        return f2684(var9, constant_reader_oc.f8495());
    }
    
    public static SubLObject f2695(final SubLObject var9) {
        assert NIL != Types.stringp(var9) : var9;
        return f2668(constant_reader_oc.f8495(), var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2696(final SubLObject var9) {
        assert NIL != Types.stringp(var9) : var9;
        return Sequences.cconcatenate(constant_reader_oc.f8495(), var9);
    }
    
    public static SubLObject f2697(final SubLObject var9) {
        assert NIL != Types.stringp(var9) : var9;
        return f2674(var9, constant_reader_oc.f8495(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2698(final SubLObject var9) {
        assert NIL != Types.stringp(var9) : var9;
        return f2699($g916$.getGlobalValue(), constant_reader_oc.f8495(), var9, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2700(final SubLObject var9, final SubLObject var117, SubLObject var53) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQUALP);
        }
        SubLObject var118 = (SubLObject)NIL;
        if (NIL == var118) {
            SubLObject var119;
            SubLObject var120;
            for (var119 = var117, var120 = (SubLObject)NIL, var120 = var119.first(); NIL == var118 && NIL != var119; var118 = f2687(var9, var120, var53), var119 = var119.rest(), var120 = var119.first()) {}
        }
        return var118;
    }
    
    public static SubLObject f2701(final SubLObject var136, SubLObject var21, SubLObject var77) {
        if (var21 == UNPROVIDED) {
            var21 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (var77 == UNPROVIDED) {
            var77 = (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var137 = Functions.funcall(var21, var136.first());
        SubLObject var138 = var136.rest();
        assert NIL != Types.stringp(var137) : var137;
        final SubLObject var139 = var137;
        final SubLObject var140 = var77;
        SubLObject var141 = Sequences.length(var139);
        while (!var140.numE(var141) && NIL != var138) {
            final SubLObject var142 = Functions.funcall(var21, var138.first());
            assert NIL != Types.stringp(var142) : var142;
            var138 = var138.rest();
            final SubLObject var143 = Strings.stringNE(var139, var142, var140, var141, var140, Sequences.length(var142));
            if (!var143.isNumber()) {
                continue;
            }
            var141 = var143;
        }
        return f2623(var139, var140, var141);
    }
    
    public static SubLObject f2702(final SubLObject var28, final SubLObject var9, SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)ZERO_INTEGER;
        }
        return Sequences.position(var28, var9, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY), var41, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2622(final SubLObject var9, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)Characters.CHAR_space;
        }
        final SubLObject var29 = f2702(var28, var9, (SubLObject)UNPROVIDED);
        if (NIL != var29) {
            return Sequences.subseq(var9, (SubLObject)ZERO_INTEGER, var29);
        }
        return var9;
    }
    
    public static SubLObject f2703(final SubLObject var9, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)Characters.CHAR_space;
        }
        final SubLObject var29 = f2702(var28, var9, (SubLObject)UNPROVIDED);
        if (NIL != var29) {
            return Sequences.subseq(var9, Numbers.add(var29, (SubLObject)ONE_INTEGER), (SubLObject)UNPROVIDED);
        }
        return $g916$.getGlobalValue();
    }
    
    public static SubLObject f2704(final SubLObject var9, SubLObject var144, SubLObject var77) {
        if (var144 == UNPROVIDED) {
            var144 = (SubLObject)$ic49$;
        }
        if (var77 == UNPROVIDED) {
            var77 = (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var145 = f2702(var144.first(), var9, var77);
        final SubLObject var146 = (SubLObject)((NIL != var145) ? f2702(conses_high.cadr(var144), var9, var145) : NIL);
        if (NIL != var146 && var146.numL(Sequences.length(var9))) {
            return Sequences.subseq(var9, Numbers.add((SubLObject)ONE_INTEGER, var145), var146);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2705(final SubLObject var9, final SubLObject var147, final SubLObject var148, SubLObject var145, SubLObject var146) {
        if (var145 == UNPROVIDED) {
            var145 = (SubLObject)ZERO_INTEGER;
        }
        if (var146 == UNPROVIDED) {
            var146 = (SubLObject)NIL;
        }
        SubLObject var149 = (SubLObject)NIL;
        SubLObject var150 = (SubLObject)NIL;
        var145 = Sequences.search(var147, var9, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, (SubLObject)NIL, var145, var146);
        if (NIL == var145) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL);
        }
        if (NIL != var148) {
            var150 = Sequences.search(var148, var9, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, (SubLObject)NIL, Numbers.add(Sequences.length(var147), var145), var146);
        }
        if (NIL == var150) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL);
        }
        var146 = f2706(var148, var150, var146, Sequences.length(var9));
        var149 = f2623(var9, Numbers.add(var145, Sequences.length(var147)), var146);
        return Values.values(var149, var146);
    }
    
    public static SubLObject f2707(final SubLObject var9, final SubLObject var147, final SubLObject var148, SubLObject var145, SubLObject var146) {
        if (var145 == UNPROVIDED) {
            var145 = (SubLObject)ZERO_INTEGER;
        }
        if (var146 == UNPROVIDED) {
            var146 = (SubLObject)NIL;
        }
        final SubLThread var149 = SubLProcess.currentSubLThread();
        var149.resetMultipleValues();
        final SubLObject var150 = f2705(var9, var147, var148, var145, var146);
        final SubLObject var151 = var149.secondMultipleValue();
        var149.resetMultipleValues();
        return (SubLObject)ConsesLow.list(var150, var151);
    }
    
    public static SubLObject f2706(final SubLObject var148, final SubLObject var151, final SubLObject var152, final SubLObject var153) {
        return (NIL != var151 && NIL != var148) ? var151 : ((NIL != var152) ? var152 : var153);
    }
    
    public static SubLObject f2708(final SubLObject var9, final SubLObject var154) {
        if (NIL != f2684(var9, var154)) {
            return Sequences.subseq(var9, Sequences.length(var154), (SubLObject)UNPROVIDED);
        }
        return var9;
    }
    
    public static SubLObject f2709(final SubLObject var9, final SubLObject var155) {
        if (NIL != f2673(var9, var155, (SubLObject)UNPROVIDED)) {
            return Sequences.subseq(var9, (SubLObject)ZERO_INTEGER, Numbers.subtract(Sequences.length(var9), Sequences.length(var155)));
        }
        return var9;
    }
    
    public static SubLObject f2654(final SubLObject var9) {
        if (Sequences.length(var9).numG((SubLObject)ZERO_INTEGER)) {
            return Sequences.subseq(var9, (SubLObject)ONE_INTEGER, Sequences.length(var9));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2677(final SubLObject var9, SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)ONE_INTEGER;
        }
        if (NIL != module0035.f2000(var9, var41, (SubLObject)UNPROVIDED)) {
            return Sequences.subseq(var9, (SubLObject)ZERO_INTEGER, Numbers.subtract(Sequences.length(var9), var41));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2710(final SubLObject var9, final SubLObject var28) {
        if (Sequences.length(var9).numG((SubLObject)ZERO_INTEGER) && NIL != Characters.charE(var28, Strings.sublisp_char(var9, (SubLObject)ZERO_INTEGER))) {
            return Sequences.subseq(var9, (SubLObject)ONE_INTEGER, Sequences.length(var9));
        }
        return var9;
    }
    
    public static SubLObject f2711(final SubLObject var9, final SubLObject var28) {
        if (Sequences.length(var9).numG((SubLObject)ZERO_INTEGER) && NIL != Characters.charE(var28, Strings.sublisp_char(var9, Numbers.subtract(Sequences.length(var9), (SubLObject)ONE_INTEGER)))) {
            return Sequences.subseq(var9, (SubLObject)ZERO_INTEGER, Numbers.subtract(Sequences.length(var9), (SubLObject)ONE_INTEGER));
        }
        return var9;
    }
    
    public static SubLObject f2692(final SubLObject var9, final SubLObject var41) {
        final SubLObject var42 = Sequences.length(var9);
        if (var42.numGE(var41)) {
            return Sequences.subseq(var9, var41, var42);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2712(final SubLObject var9, final SubLObject var41) {
        final SubLObject var42 = Sequences.length(var9);
        if (var42.numGE(var41)) {
            return Sequences.subseq(var9, (SubLObject)ZERO_INTEGER, Numbers.subtract(var42, var41));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2713(SubLObject var9) {
        while (NIL != f2611(var9) && NIL != f2681(f2636(var9))) {
            var9 = f2654(var9);
        }
        while (NIL != f2611(var9) && NIL != f2681(f2637(var9))) {
            var9 = f2677(var9, (SubLObject)UNPROVIDED);
        }
        return var9;
    }
    
    public static SubLObject f2714(final SubLObject var157) {
        if (NIL != f2679(var157, (SubLObject)$ic50$)) {
            return f2677(var157, (SubLObject)UNPROVIDED);
        }
        return var157;
    }
    
    public static SubLObject f2715(final SubLObject var9) {
        final SubLObject var10 = Numbers.subtract(Sequences.length(var9), (SubLObject)ONE_INTEGER);
        final SubLObject var11 = Numbers.subtract(Sequences.length(var9), (SubLObject)TWO_INTEGER);
        if (var10.numG((SubLObject)ZERO_INTEGER) && Vectors.aref(var9, var10).eql(Vectors.aref(var9, var11))) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2716(final SubLObject var19) {
        return f2608(var19);
    }
    
    public static SubLObject f2653(final SubLObject var19) {
        return f2717(var19);
    }
    
    public static SubLObject f2718(final SubLObject var19) {
        return (SubLObject)makeBoolean(NIL != module0209.f13550(var19) && NIL == f2608(var19));
    }
    
    public static SubLObject f2717(final SubLObject var19) {
        return (SubLObject)makeBoolean(var19.isString() && NIL == f2608(var19));
    }
    
    public static SubLObject f2719(final SubLObject var160, final SubLObject var9, SubLObject var77, SubLObject var61) {
        if (var77 == UNPROVIDED) {
            var77 = (SubLObject)ZERO_INTEGER;
        }
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)NIL;
        }
        final SubLThread var161 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var9) : var9;
        SubLObject var162 = (SubLObject)NIL;
        final SubLObject var163 = $g921$.currentBinding(var161);
        try {
            $g921$.bind(var160, var161);
            var162 = Sequences.position_if(Symbols.symbol_function((SubLObject)$ic52$), var9, Symbols.symbol_function((SubLObject)IDENTITY), var77, var61);
        }
        finally {
            $g921$.rebind(var163, var161);
        }
        return var162;
    }
    
    public static SubLObject f2720(final SubLObject var161, final SubLObject var9, SubLObject var77, SubLObject var61) {
        if (var77 == UNPROVIDED) {
            var77 = (SubLObject)ZERO_INTEGER;
        }
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var9) : var9;
        return Sequences.position_if(var161, var9, Symbols.symbol_function((SubLObject)IDENTITY), var77, var61);
    }
    
    public static SubLObject f2721(final SubLObject var19) {
        return Equality.eql($g914$.getGlobalValue(), var19);
    }
    
    public static SubLObject f2722(final SubLObject var19) {
        return (SubLObject)makeBoolean(var19.isChar() && NIL == f2721(var19));
    }
    
    public static SubLObject f2723(final SubLObject var19) {
        return Equality.eql($g915$.getGlobalValue(), var19);
    }
    
    public static SubLObject f2724(final SubLObject var19) {
        return (SubLObject)makeBoolean(var19.isChar() && NIL == f2723(var19));
    }
    
    public static SubLObject f2725(final SubLObject var162) {
        return (SubLObject)makeBoolean(NIL == Characters.digit_char_p(var162, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f2726(final SubLObject var162) {
        return (SubLObject)makeBoolean(var162.isChar() && NIL != Characters.digit_char_p(var162, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f2727(final SubLObject var19) {
        return (SubLObject)makeBoolean(var19.isString() && NIL == module0035.find_if_not((SubLObject)$ic53$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f2728(final SubLObject var19) {
        return (SubLObject)makeBoolean(var19.isString() && NIL == module0035.find_if_not((SubLObject)$ic54$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f2729(final SubLObject var19) {
        return (SubLObject)makeBoolean(var19.isChar() && NIL != Characters.alphanumericp(var19));
    }
    
    public static SubLObject f2730(final SubLObject var19) {
        return (SubLObject)makeBoolean(var19.isChar() && NIL != Characters.alpha_char_p(var19));
    }
    
    public static SubLObject f2731(final SubLObject var19) {
        return (SubLObject)makeBoolean(var19.isString() && NIL != Sequences.find_if((SubLObject)$ic53$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f2732(final SubLObject var19) {
        return (SubLObject)makeBoolean(var19.isString() && NIL != Sequences.find_if((SubLObject)$ic55$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f2733(final SubLObject var19) {
        return (SubLObject)makeBoolean(var19.isString() && NIL == Sequences.find_if((SubLObject)$ic55$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f2734(final SubLObject var9) {
        return module0552.f34115(f2735(var9));
    }
    
    public static SubLObject f2736(final SubLObject var9) {
        return f2737(var9);
    }
    
    public static SubLObject f2737(final SubLObject var9) {
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        if (NIL != f2702((SubLObject)Characters.CHAR_hyphen, var9, (SubLObject)UNPROVIDED)) {
            var10 = f2738(var9, (SubLObject)$ic56$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (!Sequences.length(var11).numE((SubLObject)TWO_INTEGER)) {
                var11 = (SubLObject)NIL;
            }
        }
        else if (NIL != f2702((SubLObject)Characters.CHAR_comma, var9, (SubLObject)UNPROVIDED)) {
            var10 = f2738(var9, (SubLObject)$ic57$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != f2734(var9)) {
            var10 = (SubLObject)ConsesLow.list(var9);
        }
        if (NIL != var10 && NIL != module0035.f2370(Symbols.symbol_function((SubLObject)$ic58$), var10, (SubLObject)UNPROVIDED)) {
            var11 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic59$), var10);
        }
        return var11;
    }
    
    public static SubLObject f2739(final SubLObject var166) {
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic60$, var166);
    }
    
    public static SubLObject f2740(final SubLObject var9) {
        final SubLObject var10 = f2679(var9, (SubLObject)$ic61$);
        return (SubLObject)((NIL != var10) ? module0048.f3407(f2741(var9)) : NIL);
    }
    
    public static SubLObject f2741(final SubLObject var9) {
        return f2712(var9, (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f2742(final SubLObject var9) {
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        for (var11 = (SubLObject)NIL, var12 = (SubLObject)NIL, var12 = Numbers.subtract(Sequences.length(var9), (SubLObject)ONE_INTEGER); NIL == var11 && !var12.numL((SubLObject)ZERO_INTEGER); var12 = Numbers.subtract(var12, (SubLObject)ONE_INTEGER)) {
            var13 = Vectors.aref(var9, var12);
            if (NIL != Characters.digit_char_p(var13, (SubLObject)UNPROVIDED)) {
                var10 = var12;
            }
            else {
                var11 = (SubLObject)T;
            }
        }
        if (var10.isInteger()) {
            return f2642(Sequences.subseq(var9, var10, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2743(final SubLObject var41, final SubLObject var9, final SubLObject var170, SubLObject var171) {
        if (var171 == UNPROVIDED) {
            var171 = (SubLObject)T;
        }
        if (NIL != var171) {
            assert NIL != Types.stringp(var9) : var9;
            assert NIL != module0004.f106(var41) : var41;
            assert NIL != Types.characterp(var170) : var170;
        }
        if (NIL == var171 || NIL != module0035.f2002(var9, var41, (SubLObject)UNPROVIDED)) {
            Strings.set_char(var9, var41, var170);
        }
        return var9;
    }
    
    public static SubLObject f2744(final SubLObject var9, SubLObject var53) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)$ic62$);
        }
        return f2745(var9, (SubLObject)Characters.CHAR_space, var53);
    }
    
    public static SubLObject f2745(final SubLObject var9, final SubLObject var170, SubLObject var53) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)$ic62$);
        }
        assert NIL != Types.stringp(var9) : var9;
        final SubLObject var172;
        final SubLObject var171 = var172 = f2658(var9);
        SubLObject var25_173;
        SubLObject var173;
        SubLObject var174;
        SubLObject var175;
        for (var173 = (var25_173 = Sequences.length(var172)), var174 = (SubLObject)NIL, var174 = (SubLObject)ZERO_INTEGER; !var174.numGE(var25_173); var174 = module0048.f_1X(var174)) {
            var175 = Strings.sublisp_char(var172, var174);
            if (NIL != Functions.funcall(var53, var175)) {
                f2743(var174, var171, var170, (SubLObject)UNPROVIDED);
            }
        }
        return var171;
    }
    
    public static SubLObject f2746(final SubLObject var9) {
        return (SubLObject)makeBoolean(var9.isString() && NIL == Sequences.find_if(Symbols.symbol_function((SubLObject)$ic62$), var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f2747(final SubLObject var28) {
        return (SubLObject)makeBoolean(var28.isChar() && Characters.char_code(var28).numL((SubLObject)$ic63$));
    }
    
    public static SubLObject f2748(final SubLObject var19) {
        return (SubLObject)makeBoolean(var19.isChar() && Characters.char_code(var19).numGE((SubLObject)$ic64$));
    }
    
    public static SubLObject f2749(final SubLObject var28) {
        return (SubLObject)makeBoolean(var28.isChar() && NIL != Characters.digit_char_p(var28, (SubLObject)TEN_INTEGER));
    }
    
    public static SubLObject f2750(final SubLObject var9, final SubLObject var28) {
        return (SubLObject)makeBoolean(NIL != Sequences.position(var28, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f2751(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        return Sequences.find(var28, $g921$.getDynamicValue(var29), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2752(final SubLObject var9, SubLObject var160) {
        if (var160 == UNPROVIDED) {
            var160 = (SubLObject)$ic65$;
        }
        SubLObject var161 = (SubLObject)NIL;
        SubLObject var162;
        SubLObject var163;
        for (var162 = (SubLObject)NIL, var163 = (SubLObject)NIL, var162 = (SubLObject)NIL, var163 = f2719(var160, var9, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED); NIL != var163; var163 = f2719(var160, var9, Numbers.add(var162, (SubLObject)ONE_INTEGER), (SubLObject)UNPROVIDED)) {
            var161 = (SubLObject)ConsesLow.cons(f2623(var9, (SubLObject)((NIL != var162) ? Numbers.add(var162, (SubLObject)ONE_INTEGER) : ZERO_INTEGER), var163), var161);
            var162 = var163;
        }
        if (NIL != var162) {
            var161 = (SubLObject)ConsesLow.cons(f2623(var9, Numbers.add(var162, (SubLObject)ONE_INTEGER), (SubLObject)UNPROVIDED), var161);
        }
        else {
            var161 = (SubLObject)ConsesLow.list(var9);
        }
        return Sequences.nreverse(var161);
    }
    
    public static SubLObject f2753(final SubLObject var9, final SubLObject var176) {
        SubLObject var177 = (SubLObject)NIL;
        SubLObject var178 = var9;
        for (SubLObject var179 = Sequences.search(var176, var178, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED); NIL != var179; var179 = Sequences.search(var176, var178, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var177 = (SubLObject)ConsesLow.cons(f2623(var178, (SubLObject)ZERO_INTEGER, var179), var177);
            var178 = f2623(var178, Numbers.add(var179, Sequences.length(var176)), (SubLObject)UNPROVIDED);
        }
        var177 = (SubLObject)ConsesLow.cons(var178, var177);
        var178 = (SubLObject)NIL;
        return Sequences.nreverse(var177);
    }
    
    public static SubLObject f2754(final SubLObject var9, SubLObject var178, SubLObject var179, SubLObject var180, SubLObject var181) {
        if (var178 == UNPROVIDED) {
            var178 = (SubLObject)NIL;
        }
        if (var179 == UNPROVIDED) {
            var179 = (SubLObject)$ic65$;
        }
        if (var180 == UNPROVIDED) {
            var180 = (SubLObject)$ic48$;
        }
        if (var181 == UNPROVIDED) {
            var181 = Symbols.symbol_function((SubLObject)$ic55$);
        }
        assert NIL != Types.stringp(var9) : var9;
        assert NIL != Types.stringp(var180) : var180;
        SubLObject var182 = (SubLObject)NIL;
        SubLObject var183;
        SubLObject var184;
        SubLObject var185;
        for (var183 = (SubLObject)NIL, var184 = (SubLObject)NIL, var183 = (SubLObject)NIL, var184 = f2719(var179, var9, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED); NIL != var184; var184 = f2719(var179, var9, Numbers.add(var183, (SubLObject)ONE_INTEGER), (SubLObject)UNPROVIDED)) {
            var185 = f2755(var9, Numbers.add(var184, (SubLObject)ONE_INTEGER), var178, var179, var180, var181);
            if (NIL != var185) {
                var182 = (SubLObject)ConsesLow.cons(var185, var182);
            }
            var183 = var184;
        }
        return Sequences.nreverse(var182);
    }
    
    public static SubLObject f2755(final SubLObject var9, final SubLObject var81, final SubLObject var178, final SubLObject var179, final SubLObject var180, final SubLObject var181) {
        final SubLObject var182 = Sequences.length(var9);
        final SubLObject var183 = Sequences.length(var180);
        final SubLObject var184 = Numbers.subtract(Sequences.length(var9), var81);
        final SubLObject var185 = Numbers.add(var184, var183);
        if (var81.numGE(var182)) {
            return (SubLObject)NIL;
        }
        if (NIL == Functions.funcall(var181, Strings.sublisp_char(var9, var81))) {
            return (SubLObject)NIL;
        }
        if (NIL != module0063.f4523(var178)) {
            final SubLObject var186 = f2719(var179, var9, Numbers.add(var81, (SubLObject)ONE_INTEGER), (SubLObject)UNPROVIDED);
            if (NIL != module0063.f4581(var178, var9, (SubLObject)NIL, var81, var186)) {
                return (SubLObject)NIL;
            }
        }
        final SubLObject var187 = Strings.make_string(Numbers.subtract(Numbers.add(var182, var183), (SubLObject)ONE_INTEGER), (SubLObject)UNPROVIDED);
        Sequences.replace(var187, var9, (SubLObject)ZERO_INTEGER, var184, var81, (SubLObject)NIL);
        Sequences.replace(var187, var180, var184, var185, (SubLObject)ZERO_INTEGER, (SubLObject)NIL);
        Sequences.replace(var187, var9, var185, (SubLObject)NIL, (SubLObject)ZERO_INTEGER, var81);
        return var187;
    }
    
    public static SubLObject f2668(final SubLObject var190, final SubLObject var191, SubLObject var53, SubLObject var192, SubLObject var193) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQUALP);
        }
        if (var192 == UNPROVIDED) {
            var192 = (SubLObject)ZERO_INTEGER;
        }
        if (var193 == UNPROVIDED) {
            var193 = (SubLObject)NIL;
        }
        if (!var190.isString() || !var191.isString()) {
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f1995(var190, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
            return Sequences.find(f2636(var190), var191, var53, Symbols.symbol_function((SubLObject)IDENTITY), var192, var193);
        }
        return Sequences.search(var190, var191, var53, Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, (SubLObject)NIL, var192, var193);
    }
    
    public static SubLObject f2756(final SubLObject var191, final SubLObject var190, SubLObject var53, SubLObject var192) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQUALP);
        }
        if (var192 == UNPROVIDED) {
            var192 = (SubLObject)ZERO_INTEGER;
        }
        return f2668(var190, var191, var53, var192, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2757(final SubLObject var191, final SubLObject var190, SubLObject var53, SubLObject var192) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQUALP);
        }
        if (var192 == UNPROVIDED) {
            var192 = (SubLObject)ZERO_INTEGER;
        }
        return (SubLObject)makeBoolean(NIL == Functions.funcall(var53, var191, var190) && NIL != f2668(var190, var191, var53, var192, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f2678(final SubLObject var191, final SubLObject var190, final SubLObject var77, SubLObject var53) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        final SubLObject var192 = Numbers.add(var77, Sequences.length(var190));
        return (SubLObject)makeBoolean(NIL != module0035.f2000(var191, var192, (SubLObject)UNPROVIDED) && NIL != f2668(var190, var191, var53, var77, var192));
    }
    
    public static SubLObject f2689(final SubLObject var194, final SubLObject var195, SubLObject var53, SubLObject var21) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var21 == UNPROVIDED) {
            var21 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        final SubLObject var196 = Sequences.length(var195);
        SubLObject var197 = (SubLObject)ZERO_INTEGER;
        SubLObject var198 = (SubLObject)NIL;
        SubLObject var199 = (SubLObject)NIL;
        while (var197.numLE(var196) && NIL == var198) {
            final SubLObject var200 = Sequences.search(var194, var195, var53, var21, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, var197, (SubLObject)UNPROVIDED);
            if (NIL != var200) {
                var199 = (SubLObject)ConsesLow.cons(var200, var199);
                var197 = module0048.f_1X(var200);
            }
            else {
                var198 = (SubLObject)T;
            }
        }
        return Sequences.nreverse(var199);
    }
    
    public static SubLObject f2758(final SubLObject var194, final SubLObject var195, SubLObject var53, SubLObject var21) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var21 == UNPROVIDED) {
            var21 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        final SubLObject var196 = Sequences.length(var195);
        SubLObject var197 = (SubLObject)ZERO_INTEGER;
        SubLObject var198 = (SubLObject)ZERO_INTEGER;
        SubLObject var199 = (SubLObject)NIL;
        if (NIL != f2608(var194)) {
            return module0048.f_1X(var196);
        }
        while (var197.numLE(var196) && NIL == var199) {
            final SubLObject var200 = Sequences.search(var194, var195, var53, var21, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, var197, (SubLObject)UNPROVIDED);
            if (NIL != var200) {
                var198 = Numbers.add(var198, (SubLObject)ONE_INTEGER);
                var197 = module0048.f_1X(var200);
            }
            else {
                var199 = (SubLObject)T;
            }
        }
        return var198;
    }
    
    public static SubLObject f2759(final SubLObject var92, final SubLObject var9, SubLObject var197, SubLObject var53) {
        if (var197 == UNPROVIDED) {
            var197 = (SubLObject)NIL;
        }
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQUALP);
        }
        SubLObject var198;
        for (var198 = (SubLObject)NIL, var198 = (SubLObject)ZERO_INTEGER; NIL == module0035.f1994(var92, var198, (SubLObject)UNPROVIDED) && NIL != Sequences.find(Strings.sublisp_char(var92, var198), var197, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED); var198 = Numbers.add(var198, (SubLObject)ONE_INTEGER)) {}
        SubLObject var199;
        for (var199 = f2623(var92, var198, (SubLObject)UNPROVIDED), var198 = (SubLObject)NIL, var198 = Numbers.subtract(Sequences.length(var199), (SubLObject)ONE_INTEGER); !var198.numLE((SubLObject)ZERO_INTEGER) && NIL != Sequences.find(Strings.sublisp_char(var199, var198), var197, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED); var198 = Numbers.subtract(var198, (SubLObject)ONE_INTEGER)) {}
        var199 = f2623(var199, (SubLObject)ZERO_INTEGER, module0048.f_1X(var198));
        if (NIL != f2716(var9) || NIL != f2716(var199)) {
            return (SubLObject)NIL;
        }
        final SubLObject var200 = Sequences.length(var9);
        final SubLObject var201 = Sequences.length(var199);
        SubLObject var202 = (SubLObject)NIL;
        SubLObject var203 = (SubLObject)NIL;
        SubLObject var204 = (SubLObject)NIL;
        SubLObject var205 = (SubLObject)NIL;
        var203 = Sequences.search(var199, var9, var53, Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, var201, (SubLObject)ZERO_INTEGER, var200);
        var204 = ((NIL != var203) ? var203 : var200);
        var205 = Numbers.add(var201, var204);
        while (!var204.numGE(var200)) {
            var202 = (SubLObject)makeBoolean(NIL != (var204.numE((SubLObject)ZERO_INTEGER) ? T : makeBoolean(NIL != Sequences.find(Strings.sublisp_char(var9, Numbers.subtract(var204, (SubLObject)ONE_INTEGER)), var197, var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != f2760(Strings.sublisp_char(var9, Numbers.subtract(var204, (SubLObject)ONE_INTEGER))))) && NIL != (var205.numE(var200) ? T : makeBoolean(NIL != Sequences.find(Strings.sublisp_char(var9, var205), var197, var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != f2760(Strings.sublisp_char(var9, var205)))));
            if (NIL != var202) {
                return (SubLObject)T;
            }
            var203 = Sequences.search(var199, var9, var53, Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, var201, var205, var200);
            var204 = ((NIL != var203) ? var203 : var200);
            var205 = Numbers.add(var201, var204);
        }
        return var202;
    }
    
    public static SubLObject f2761(SubLObject var136, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)Characters.CHAR_space;
        }
        assert NIL != Types.characterp(var28) : var28;
        var136 = Sequences.delete($g916$.getGlobalValue(), Sequences.delete((SubLObject)NIL, var136, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var137 = Sequences.length(var136);
        if (var137.numE((SubLObject)ZERO_INTEGER)) {
            return $g916$.getGlobalValue();
        }
        if (var137.numE((SubLObject)ONE_INTEGER)) {
            return var136.first();
        }
        SubLObject var138 = (SubLObject)ZERO_INTEGER;
        SubLObject var139 = var136;
        SubLObject var140 = (SubLObject)NIL;
        var140 = var139.first();
        while (NIL != var139) {
            var138 = Numbers.add(var138, Sequences.length(var140));
            var139 = var139.rest();
            var140 = var139.first();
        }
        var138 = Numbers.add(var138, Numbers.subtract(var137, (SubLObject)ONE_INTEGER));
        final SubLObject var141 = Strings.make_string(var138, var28);
        SubLObject var142 = (SubLObject)ZERO_INTEGER;
        Sequences.replace(var141, var136.first(), var142, (SubLObject)NIL, (SubLObject)ZERO_INTEGER, (SubLObject)NIL);
        var142 = Numbers.add(var142, Sequences.length(var136.first()));
        SubLObject var143 = var136.rest();
        SubLObject var144 = (SubLObject)NIL;
        var144 = var143.first();
        while (NIL != var143) {
            var142 = Numbers.add(var142, (SubLObject)ONE_INTEGER);
            Sequences.replace(var141, var144, var142, (SubLObject)NIL, (SubLObject)ZERO_INTEGER, (SubLObject)NIL);
            var142 = Numbers.add(var142, Sequences.length(var144));
            var143 = var143.rest();
            var144 = var143.first();
        }
        return var141;
    }
    
    public static SubLObject f2762(SubLObject var136, SubLObject var205) {
        if (var205 == UNPROVIDED) {
            var205 = (SubLObject)$ic19$;
        }
        assert NIL != Strings.string(var205) : var205;
        var136 = Sequences.delete($g916$.getGlobalValue(), Sequences.delete((SubLObject)NIL, var136, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var206 = Sequences.length(var136);
        if (var206.numE((SubLObject)ZERO_INTEGER)) {
            return $g916$.getGlobalValue();
        }
        if (var206.numE((SubLObject)ONE_INTEGER)) {
            return var136.first();
        }
        SubLObject var207 = (SubLObject)ZERO_INTEGER;
        final SubLObject var208 = Sequences.length(var205);
        SubLObject var209 = var136;
        SubLObject var210 = (SubLObject)NIL;
        var210 = var209.first();
        while (NIL != var209) {
            var207 = Numbers.add(var207, Sequences.length(var210));
            var209 = var209.rest();
            var210 = var209.first();
        }
        var207 = Numbers.add(var207, Numbers.multiply(var208, Numbers.subtract(var206, (SubLObject)ONE_INTEGER)));
        final SubLObject var211 = Strings.make_string(var207, (SubLObject)UNPROVIDED);
        SubLObject var212 = (SubLObject)ZERO_INTEGER;
        Sequences.replace(var211, var136.first(), var212, (SubLObject)NIL, (SubLObject)ZERO_INTEGER, (SubLObject)NIL);
        var212 = Numbers.add(var212, Sequences.length(var136.first()));
        SubLObject var213 = var136.rest();
        SubLObject var214 = (SubLObject)NIL;
        var214 = var213.first();
        while (NIL != var213) {
            Sequences.replace(var211, var205, var212, (SubLObject)NIL, (SubLObject)ZERO_INTEGER, (SubLObject)NIL);
            var212 = Numbers.add(var212, var208);
            Sequences.replace(var211, var214, var212, (SubLObject)NIL, (SubLObject)ZERO_INTEGER, (SubLObject)NIL);
            var212 = Numbers.add(var212, Sequences.length(var214));
            var213 = var213.rest();
            var214 = var213.first();
        }
        return var211;
    }
    
    public static SubLObject f2763(final SubLObject var207, final SubLObject var9) {
        if (NIL != module0035.f1995(var207, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL != f2681(f2636(var207))) {
            return f2689(var207, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var208 = module0045.f3158(var207);
        SubLObject var209 = Sequences.cconcatenate((SubLObject)$ic67$, new SubLObject[] { module0006.f203(var208), $ic67$ });
        SubLObject var210 = module0035.f2062(module0045.f3140(var209, var9, (SubLObject)$ic68$, (SubLObject)UNPROVIDED));
        if (NIL == var210) {
            var209 = module0006.f202(var208);
            var210 = module0035.f2062(module0045.f3140(var209, var9, (SubLObject)$ic68$, (SubLObject)UNPROVIDED));
        }
        return var210;
    }
    
    public static SubLObject f2764(final SubLObject var9, final SubLObject var211) {
        SubLObject var25_212;
        SubLObject var212;
        SubLObject var213;
        SubLObject var214;
        for (var212 = (var25_212 = Sequences.length(var9)), var213 = (SubLObject)NIL, var213 = (SubLObject)ZERO_INTEGER; !var213.numGE(var25_212); var213 = module0048.f_1X(var213)) {
            var214 = Strings.sublisp_char(var9, var213);
            if (NIL == module0004.f104(var214, var211, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)NIL;
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f2765(SubLObject var213, final SubLObject var9, SubLObject var214, SubLObject var28, SubLObject var215) {
        if (var214 == UNPROVIDED) {
            var214 = (SubLObject)$ic65$;
        }
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)Characters.CHAR_space;
        }
        if (var215 == UNPROVIDED) {
            var215 = (SubLObject)NIL;
        }
        assert NIL != Types.listp(var213) : var213;
        assert NIL != Types.stringp(var9) : var9;
        var213 = Sequences.delete($g916$.getGlobalValue(), Sequences.delete((SubLObject)NIL, var213, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var213) {
            return (SubLObject)$ic0$;
        }
        if (NIL != module0035.f1997(var213)) {
            return var213.first();
        }
        final SubLObject var216 = var213.first();
        SubLObject var217 = Sequences.length(var216);
        SubLObject var218 = f2763(var216, var9);
        if (NIL == var218) {
            Errors.error((SubLObject)$ic69$, var216, var9);
        }
        SubLObject var219 = var213.rest();
        SubLObject var220 = (SubLObject)NIL;
        var220 = var219.first();
        while (NIL != var219) {
            final SubLObject var221 = f2763(var220, var9);
            SubLObject var222 = (SubLObject)NIL;
            SubLObject var223 = (SubLObject)NIL;
            if (NIL == var221) {
                Errors.error((SubLObject)$ic69$, var220, var9);
            }
            SubLObject var73_223 = var221;
            SubLObject var224 = (SubLObject)NIL;
            var224 = var73_223.first();
            while (NIL != var73_223) {
                SubLObject var73_224 = var218;
                SubLObject var225 = (SubLObject)NIL;
                var225 = var73_224.first();
                while (NIL != var73_224) {
                    final SubLObject var226 = Numbers.add(var225, var217);
                    if (var224.numGE(var226) && NIL != f2764(f2623(var9, var226, var224), var214)) {
                        final SubLObject var227 = var225;
                        if (NIL == conses_high.member(var227, var223, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                            var223 = (SubLObject)ConsesLow.cons(var227, var223);
                        }
                        if (NIL == var222) {
                            var222 = Numbers.add(Numbers.subtract(var224, var225), Sequences.length(var220));
                        }
                    }
                    var73_224 = var73_224.rest();
                    var225 = var73_224.first();
                }
                var73_223 = var73_223.rest();
                var224 = var73_223.first();
            }
            var218 = var223;
            var217 = var222;
            var219 = var219.rest();
            var220 = var219.first();
        }
        if (NIL == var218 && NIL == var217) {
            final SubLObject var228 = (SubLObject)((NIL != var28) ? f2761(var213, var28) : NIL);
            if (NIL != var215) {
                Errors.warn((SubLObject)$ic70$, var213, var9, var228);
            }
            return var228;
        }
        final SubLObject var229 = var218.first();
        final SubLObject var230 = Numbers.add(var229, var217);
        return f2623(var9, var229, var230);
    }
    
    public static SubLObject f2766(final SubLObject var229, final SubLObject var9) {
        final SubLThread var230 = SubLProcess.currentSubLThread();
        SubLObject var231 = (SubLObject)NIL;
        SubLObject var232 = (SubLObject)NIL;
        try {
            var230.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var233 = Errors.$error_handler$.currentBinding(var230);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic71$, var230);
                try {
                    var231 = f2765(var229, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                catch (Throwable var234) {
                    Errors.handleThrowable(var234, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var233, var230);
            }
        }
        catch (Throwable var235) {
            var232 = Errors.handleThrowable(var235, module0003.$g3$.getGlobalValue());
        }
        finally {
            var230.throwStack.pop();
        }
        if (NIL != var232 || NIL == var231) {
            var231 = f2761(var229, (SubLObject)UNPROVIDED);
        }
        return var231;
    }
    
    public static SubLObject f2767(final SubLObject var233, SubLObject var234) {
        if (var234 == UNPROVIDED) {
            var234 = (SubLObject)$ic48$;
        }
        final SubLObject var235 = var233.first();
        final SubLObject var236 = var233.rest();
        SubLObject var237 = (SubLObject)((NIL != var235) ? var235 : $ic0$);
        SubLObject var238 = var236;
        SubLObject var239 = (SubLObject)NIL;
        var239 = var238.first();
        while (NIL != var238) {
            var237 = Sequences.cconcatenate(var237, new SubLObject[] { var234, var239 });
            var238 = var238.rest();
            var239 = var238.first();
        }
        return var237;
    }
    
    public static SubLObject f2768(final SubLObject var233, SubLObject var237, SubLObject var234) {
        if (var237 == UNPROVIDED) {
            var237 = (SubLObject)Characters.CHAR_quotation;
        }
        if (var234 == UNPROVIDED) {
            var234 = (SubLObject)$ic48$;
        }
        SubLObject var238 = (SubLObject)$ic0$;
        if (NIL != var233) {
            final SubLObject var239 = Strings.string(var237);
            final SubLObject var240 = Sequences.cconcatenate(var239, new SubLObject[] { var234, var239 });
            final SubLObject var241 = f2767(var233, var240);
            var238 = Sequences.cconcatenate(var239, new SubLObject[] { var241, var239 });
        }
        return var238;
    }
    
    public static SubLObject f2769(final SubLObject var9) {
        SubLObject var10 = (SubLObject)Characters.CHAR_A;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        try {
            var12 = streams_high.make_private_string_output_stream();
            SubLObject var25_241;
            SubLObject var13;
            SubLObject var14;
            SubLObject var15;
            for (var13 = (var25_241 = Sequences.length(var9)), var14 = (SubLObject)NIL, var14 = (SubLObject)ZERO_INTEGER; !var14.numGE(var25_241); var14 = module0048.f_1X(var14)) {
                var15 = Strings.sublisp_char(var9, var14);
                if (NIL != Characters.upper_case_p(var15)) {
                    if (NIL != Characters.lower_case_p(var10)) {
                        streams_high.write_char((SubLObject)Characters.CHAR_underbar, var12);
                    }
                    streams_high.write_char(Characters.char_downcase(var15), var12);
                }
                else {
                    streams_high.write_char(var15, var12);
                }
                var10 = var15;
            }
            var11 = streams_high.get_output_stream_string(var12);
        }
        finally {
            final SubLObject var16 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                streams_high.close(var12, (SubLObject)UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var16);
            }
        }
        return var11;
    }
    
    public static SubLObject f2770(final SubLObject var9) {
        return Sequences.cconcatenate(f2638(Characters.char_upcase(Strings.sublisp_char(var9, (SubLObject)ZERO_INTEGER))), f2623(var9, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f2771(final SubLObject var9) {
        return Sequences.cconcatenate(f2638(Characters.char_downcase(Strings.sublisp_char(var9, (SubLObject)ZERO_INTEGER))), f2623(var9, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f2772(final SubLObject var242, final SubLObject var9) {
        final SubLThread var243 = SubLProcess.currentSubLThread();
        SubLObject var244 = (SubLObject)ZERO_INTEGER;
        SubLObject var245 = (SubLObject)NIL;
        final SubLObject var246 = $g918$.currentBinding(var243);
        try {
            $g918$.bind($g914$.getGlobalValue(), var243);
            SubLObject var248;
            final SubLObject var247 = var248 = f2661(var9, (SubLObject)$ic31$, (SubLObject)UNPROVIDED);
            SubLObject var249 = (SubLObject)NIL;
            var249 = var248.first();
            while (NIL != var248) {
                if (NIL == var245 && var242.numE(var244)) {
                    var245 = var249;
                }
                var244 = Numbers.add(var244, (SubLObject)ONE_INTEGER);
                var248 = var248.rest();
                var249 = var248.first();
            }
        }
        finally {
            $g918$.rebind(var246, var243);
        }
        return var245;
    }
    
    public static SubLObject f2773(final SubLObject var9) {
        final SubLObject var10 = f2738(var9, (SubLObject)$ic72$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f2774(var10.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var11 = var10.rest();
        SubLObject var12 = (SubLObject)NIL;
        var12 = var11.first();
        while (NIL != var11) {
            if (NIL == module0731.f44752(var12, (SubLObject)UNPROVIDED)) {
                f2774(var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        return f2761(var10, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2775(final SubLObject var9) {
        final SubLObject var10 = Strings.string_downcase(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return f2773(var10);
    }
    
    public static SubLObject f2776(final SubLObject var9) {
        final SubLObject var10 = f2773(var9);
        return Equality.equal(var9, var10);
    }
    
    public static SubLObject f2777(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (!var9.isString()) {
            return (SubLObject)NIL;
        }
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        final SubLObject var13 = $g918$.currentBinding(var10);
        try {
            $g918$.bind($g914$.getGlobalValue(), var10);
            SubLObject var15;
            final SubLObject var14 = var15 = f2661(var9, (SubLObject)$ic31$, (SubLObject)UNPROVIDED);
            SubLObject var16 = (SubLObject)NIL;
            var16 = var15.first();
            while (NIL != var15) {
                final SubLObject var17 = f2636(var16);
                if (NIL == module0731.f44750(var16, (SubLObject)UNPROVIDED) && NIL != Characters.lower_case_p(var17)) {
                    var11 = (SubLObject)T;
                }
                if (NIL != Characters.upper_case_p(var17) && NIL != Sequences.find_if(Symbols.symbol_function((SubLObject)$ic73$), var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var12 = (SubLObject)T;
                }
                var15 = var15.rest();
                var16 = var15.first();
            }
        }
        finally {
            $g918$.rebind(var13, var10);
        }
        return (SubLObject)makeBoolean(NIL != var12 && NIL == var11);
    }
    
    public static SubLObject f2778(final SubLObject var9) {
        SubLObject var10 = (SubLObject)ZERO_INTEGER;
        SubLObject var11 = (SubLObject)ONE_INTEGER;
        SubLObject var25_251;
        SubLObject var12;
        SubLObject var13;
        SubLObject var14;
        for (var12 = (var25_251 = Sequences.length(var9)), var13 = (SubLObject)NIL, var13 = (SubLObject)ZERO_INTEGER; !var13.numGE(var25_251); var13 = module0048.f_1X(var13)) {
            var14 = Strings.sublisp_char(var9, var13);
            if (NIL != Characters.upper_case_p(var14)) {
                var10 = Numbers.add(var10, var11);
            }
            var11 = Numbers.multiply((SubLObject)TWO_INTEGER, var11);
        }
        return var10;
    }
    
    public static SubLObject f2779(final SubLObject var9, final SubLObject var252) {
        return f2780(var9, var252);
    }
    
    public static SubLObject f2780(final SubLObject var9, final SubLObject var252) {
        SubLObject var253 = var252;
        SubLObject var254 = (SubLObject)ONE_INTEGER;
        SubLObject var255 = (SubLObject)NIL;
        final SubLObject var256 = Sequences.length(var9);
        if (NIL == var255) {
            SubLObject var25_255;
            SubLObject var257;
            SubLObject var258;
            for (var25_255 = var256, var257 = (SubLObject)NIL, var257 = (SubLObject)ZERO_INTEGER; NIL == var255 && !var257.numGE(var25_255); var257 = module0048.f_1X(var257)) {
                var258 = Strings.sublisp_char(var9, var257);
                if (NIL != Characters.upper_case_p(var258)) {
                    var253 = Numbers.subtract(var253, var254);
                }
                var254 = Numbers.multiply((SubLObject)TWO_INTEGER, var254);
                if (NIL == module0048.f3312(var253, var254)) {
                    var255 = (SubLObject)T;
                }
            }
        }
        if (!var253.isZero()) {
            var255 = (SubLObject)T;
        }
        return (SubLObject)makeBoolean(NIL == var255);
    }
    
    public static SubLObject f2781(final SubLObject var9, final SubLObject var252) {
        SubLObject var253 = var252;
        SubLObject var254 = Numbers.expt((SubLObject)TWO_INTEGER, module0048.f_1_(Sequences.length(var9)));
        SubLObject var255 = (SubLObject)NIL;
        final SubLObject var256 = Sequences.reverse(var9);
        final SubLObject var257 = Sequences.length(var256);
        if (NIL == var255) {
            SubLObject var25_256;
            SubLObject var258;
            SubLObject var259;
            for (var25_256 = var257, var258 = (SubLObject)NIL, var258 = (SubLObject)ZERO_INTEGER; NIL == var255 && !var258.numGE(var25_256); var258 = module0048.f_1X(var258)) {
                var259 = Strings.sublisp_char(var256, var258);
                if (NIL != Characters.upper_case_p(var259)) {
                    var253 = Numbers.subtract(var253, var254);
                }
                if (!var253.numGE((SubLObject)ZERO_INTEGER) || !var253.numL(var254)) {
                    var255 = (SubLObject)T;
                }
                var254 = Numbers.divide(var254, (SubLObject)TWO_INTEGER);
            }
        }
        if (!var253.isZero()) {
            var255 = (SubLObject)T;
        }
        return (SubLObject)makeBoolean(NIL == var255);
    }
    
    public static SubLObject f2774(final SubLObject var9, SubLObject var77, SubLObject var61, SubLObject var53, SubLObject var257) {
        if (var77 == UNPROVIDED) {
            var77 = (SubLObject)ZERO_INTEGER;
        }
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)NIL;
        }
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)$ic74$);
        }
        if (var257 == UNPROVIDED) {
            var257 = (SubLObject)T;
        }
        SubLObject var258 = Sequences.length(var9);
        if (NIL != var61 && var61.isNumber() && var61.numLE(var258)) {
            var258 = var61;
        }
        if (var77.numG(var258)) {
            return var9;
        }
        SubLObject var259;
        for (var259 = (SubLObject)NIL, var259 = var77; !var259.numE(var258); var259 = Numbers.add(var259, (SubLObject)ONE_INTEGER)) {
            if (NIL != var257) {
                Vectors.set_aref(var9, var259, Characters.char_upcase(Vectors.aref(var9, var259)));
                var257 = (SubLObject)NIL;
            }
            if (NIL != Functions.funcall(var53, Vectors.aref(var9, var259))) {
                var257 = (SubLObject)T;
            }
        }
        return var9;
    }
    
    public static SubLObject f2782(final SubLObject var9, SubLObject var77, SubLObject var61, SubLObject var53, SubLObject var257) {
        if (var77 == UNPROVIDED) {
            var77 = (SubLObject)ZERO_INTEGER;
        }
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)NIL;
        }
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)$ic74$);
        }
        if (var257 == UNPROVIDED) {
            var257 = (SubLObject)T;
        }
        return f2774(f2658(var9), var77, var61, var53, var257);
    }
    
    public static SubLObject f2783(final SubLObject var9) {
        assert NIL != Types.stringp(var9) : var9;
        final SubLObject var10 = Sequences.length(var9);
        if (var10.numE((SubLObject)ZERO_INTEGER)) {
            return var9;
        }
        final SubLObject var11 = Sequences.count_if(Symbols.symbol_function((SubLObject)$ic75$), var9, Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        final SubLObject var12 = Sequences.count_if(Symbols.symbol_function((SubLObject)$ic53$), var9, Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        final SubLObject var13 = Sequences.count_if(Symbols.symbol_function((SubLObject)$ic76$), var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var14 = Numbers.add(var11, var12, var13);
        if (var14.numE((SubLObject)ZERO_INTEGER)) {
            return var9;
        }
        final SubLObject var15 = Numbers.add(var10, var14);
        final SubLObject var16 = Strings.make_string(var15, (SubLObject)UNPROVIDED);
        SubLObject var17 = (SubLObject)ZERO_INTEGER;
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        var18 = (var19 = (SubLObject)ZERO_INTEGER);
        var20 = (var21 = Strings.sublisp_char(var9, var18));
        while (!var18.numE(Numbers.subtract(var10, (SubLObject)ONE_INTEGER))) {
            if ((NIL != Characters.upper_case_p(var20) || NIL != f2681(var20) || (NIL != Characters.digit_char_p(var20, (SubLObject)UNPROVIDED) && NIL == Characters.digit_char_p(var21, (SubLObject)UNPROVIDED))) && !var18.numE((SubLObject)ZERO_INTEGER)) {
                var17 = Numbers.add(var17, (SubLObject)ONE_INTEGER);
            }
            f2743(var17, var16, Characters.char_downcase(var20), (SubLObject)UNPROVIDED);
            var17 = Numbers.add(var17, (SubLObject)ONE_INTEGER);
            var18 = Numbers.add(var18, (SubLObject)ONE_INTEGER);
            var19 = Numbers.subtract(var18, (SubLObject)ONE_INTEGER);
            var20 = Strings.sublisp_char(var9, var18);
            var21 = Strings.sublisp_char(var9, var19);
        }
        if ((NIL != Characters.upper_case_p(var20) || NIL != f2681(var20) || (NIL != Characters.digit_char_p(var20, (SubLObject)UNPROVIDED) && NIL == Characters.digit_char_p(var21, (SubLObject)UNPROVIDED))) && !var18.numE((SubLObject)ZERO_INTEGER)) {
            var17 = Numbers.add(var17, (SubLObject)ONE_INTEGER);
        }
        f2743(var17, var16, Characters.char_downcase(var20), (SubLObject)UNPROVIDED);
        return f2784(var16, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2785(final SubLObject var9) {
        assert NIL != Types.stringp(var9) : var9;
        final SubLObject var10 = Sequences.length(var9);
        SubLObject var11 = (SubLObject)(var10.isZero() ? var9 : NIL);
        if (NIL == var11) {
            final SubLObject var12 = Sequences.count_if(Symbols.symbol_function((SubLObject)$ic75$), var9, Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
            final SubLObject var13 = Sequences.count_if(Symbols.symbol_function((SubLObject)$ic53$), var9, Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
            final SubLObject var14 = Sequences.count_if(Symbols.symbol_function((SubLObject)$ic77$), var9, Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
            final SubLObject var15 = Numbers.subtract(Numbers.add(var12, var13), var14);
            if (var15.isZero()) {
                var11 = var9;
            }
            if (NIL == var11) {
                final SubLObject var16 = Numbers.add(var10, var15);
                final SubLObject var17 = Strings.make_string(var16, (SubLObject)UNPROVIDED);
                SubLObject var18 = (SubLObject)ZERO_INTEGER;
                SubLObject var19 = (SubLObject)NIL;
                SubLObject var20 = (SubLObject)NIL;
                SubLObject var21 = (SubLObject)NIL;
                SubLObject var22 = (SubLObject)NIL;
                var20 = (SubLObject)ZERO_INTEGER;
                var21 = Strings.sublisp_char(var9, var20);
                var22 = Strings.sublisp_char(var9, module0048.f_1X(var20));
                while (!var20.numE(Numbers.subtract(var10, (SubLObject)ONE_INTEGER))) {
                    if (NIL != Characters.lower_case_p(var21) && NIL == var19 && NIL != f2786(var21, var22)) {
                        var21 = Characters.char_upcase(var21);
                    }
                    if (NIL == f2787(var21)) {
                        if (NIL != f2788(var21, var19, var22) && !var20.numE((SubLObject)ZERO_INTEGER)) {
                            var18 = Numbers.add(var18, (SubLObject)ONE_INTEGER);
                        }
                        f2743(var18, var17, var21, (SubLObject)UNPROVIDED);
                        var18 = Numbers.add(var18, (SubLObject)ONE_INTEGER);
                    }
                    var19 = var21;
                    var20 = Numbers.add(var20, (SubLObject)ONE_INTEGER);
                    var21 = Strings.sublisp_char(var9, var20);
                    var22 = (SubLObject)(var20.numL(module0048.f_1_(var10)) ? Strings.sublisp_char(var9, module0048.f_1X(var20)) : NIL);
                }
                if (NIL != f2788(var21, var19, var22) && !var20.numE((SubLObject)ZERO_INTEGER)) {
                    var18 = Numbers.add(var18, (SubLObject)ONE_INTEGER);
                }
                f2743(var18, var17, var21, (SubLObject)UNPROVIDED);
                var11 = f2784(var17, (SubLObject)UNPROVIDED);
            }
        }
        return var11;
    }
    
    public static SubLObject f2788(final SubLObject var28, final SubLObject var265, final SubLObject var267) {
        return (SubLObject)makeBoolean((NIL != Characters.upper_case_p(var28) && ((NIL != var265 && NIL == Characters.upper_case_p(var265)) || (var267.isChar() && NIL != Characters.lower_case_p(var267) && !var267.eql((SubLObject)Characters.CHAR_s)))) || (NIL != Characters.digit_char_p(var28, (SubLObject)UNPROVIDED) && (NIL == var265 || NIL == Characters.digit_char_p(var265, (SubLObject)UNPROVIDED))));
    }
    
    public static SubLObject f2787(final SubLObject var28) {
        return Equality.eq(var28, (SubLObject)Characters.CHAR_hyphen);
    }
    
    public static SubLObject f2786(final SubLObject var28, final SubLObject var267) {
        return (SubLObject)makeBoolean(NIL != Characters.lower_case_p(var28) && NIL != Characters.upper_case_p(var267));
    }
    
    public static SubLObject f2789(final SubLObject var9) {
        return f2790(f2658(var9));
    }
    
    public static SubLObject f2790(final SubLObject var9) {
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)T;
        while (NIL != var11) {
            var11 = (SubLObject)NIL;
            var10 = (SubLObject)NIL;
            SubLObject var25_269;
            SubLObject var12;
            SubLObject var13;
            SubLObject var14;
            for (var12 = (var25_269 = Sequences.length(var9)), var13 = (SubLObject)NIL, var13 = (SubLObject)ZERO_INTEGER; !var13.numGE(var25_269); var13 = module0048.f_1X(var13)) {
                var14 = Strings.sublisp_char(var9, var13);
                if (var10.isChar()) {
                    if (NIL != Characters.upper_case_p(var10) && NIL != Characters.lower_case_p(var14) && (!var14.eql((SubLObject)Characters.CHAR_s) || var13.numL((SubLObject)TWO_INTEGER) || NIL != f2760(Strings.sublisp_char(var9, Numbers.subtract(var13, (SubLObject)TWO_INTEGER))) || (NIL == module0035.f1994(var9, module0048.f_1X(var13), (SubLObject)UNPROVIDED) && NIL == f2760(Strings.sublisp_char(var9, module0048.f_1X(var13)))))) {
                        f2743(module0048.f_1_(var13), var9, Characters.char_downcase(var10), (SubLObject)UNPROVIDED);
                        var11 = (SubLObject)T;
                    }
                    else if (NIL != Characters.upper_case_p(var14) && NIL != Characters.lower_case_p(var10)) {
                        f2743(var13, var9, Characters.char_downcase(var14), (SubLObject)UNPROVIDED);
                        var11 = (SubLObject)T;
                    }
                    else if (NIL != Characters.upper_case_p(var14) && NIL != f2760(var10) && NIL != module0035.f2002(var9, module0048.f_1X(var13), (SubLObject)UNPROVIDED) && NIL != f2760(Strings.sublisp_char(var9, module0048.f_1X(var13)))) {
                        f2743(var13, var9, Characters.char_downcase(var14), (SubLObject)UNPROVIDED);
                        var11 = (SubLObject)T;
                    }
                }
                var10 = var14;
            }
        }
        return var9;
    }
    
    public static SubLObject f2791(final SubLObject var19) {
        return (SubLObject)makeBoolean(var19.isChar() && NIL != module0035.sublisp_boolean(Characters.digit_char_p(var19, (SubLObject)SIXTEEN_INTEGER)));
    }
    
    public static SubLObject f2792(final SubLObject var37) {
        assert NIL != Types.integerp(var37) : var37;
        return Strings.sublisp_char((SubLObject)$ic79$, var37);
    }
    
    public static SubLObject f2793(final SubLObject var271) {
        assert NIL != f2791(var271) : var271;
        return Characters.digit_char_p(var271, (SubLObject)SIXTEEN_INTEGER);
    }
    
    public static SubLObject f2794(final SubLObject var19) {
        return f2795(var19, (SubLObject)T);
    }
    
    public static SubLObject f2796(final SubLObject var19) {
        return f2795(var19, (SubLObject)NIL);
    }
    
    public static SubLObject f2795(final SubLObject var19, final SubLObject var272) {
        if (var19.isString()) {
            final SubLObject var273 = Sequences.length(var19);
            if (NIL == var272 || NIL != Numbers.evenp(var273)) {
                SubLObject var274;
                for (var274 = (SubLObject)NIL, var274 = (SubLObject)ZERO_INTEGER; var274.numL(var273); var274 = Numbers.add(var274, (SubLObject)ONE_INTEGER)) {
                    if (NIL == f2791(Strings.sublisp_char(var19, var274))) {
                        return (SubLObject)NIL;
                    }
                }
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2797(final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        assert NIL != Types.integerp(var60) : var60;
        SubLObject var62 = (SubLObject)NIL;
        final SubLObject var63 = print_high.$print_base$.currentBinding(var61);
        try {
            print_high.$print_base$.bind((SubLObject)SIXTEEN_INTEGER, var61);
            var62 = print_high.princ_to_string(var60);
        }
        finally {
            print_high.$print_base$.rebind(var63, var61);
        }
        return var62;
    }
    
    public static SubLObject f2798(final SubLObject var19) {
        return (SubLObject)makeBoolean(var19.isChar() && NIL != Hashtables.gethash(var19, $g924$.getGlobalValue(), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f2799(final SubLObject var37) {
        assert NIL != Types.integerp(var37) : var37;
        final SubLObject var38 = Hashtables.gethash(var37, $g923$.getGlobalValue(), (SubLObject)UNPROVIDED);
        return var38;
    }
    
    public static SubLObject f2800(final SubLObject var28) {
        assert NIL != Types.characterp(var28) : var28;
        final SubLObject var29 = Hashtables.gethash(var28, $g924$.getGlobalValue(), (SubLObject)UNPROVIDED);
        return var29;
    }
    
    public static SubLObject f2801(final SubLObject var19) {
        if (var19.isString()) {
            SubLObject var25_274;
            SubLObject var20;
            SubLObject var21;
            SubLObject var22;
            for (var20 = (var25_274 = Sequences.length(var19)), var21 = (SubLObject)NIL, var21 = (SubLObject)ZERO_INTEGER; !var21.numGE(var25_274); var21 = module0048.f_1X(var21)) {
                var22 = Strings.sublisp_char(var19, var21);
                if (NIL == f2798(var22) && !Characters.CHAR_equal.eql(var22)) {
                    return (SubLObject)NIL;
                }
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2802(final SubLObject var19) {
        return (SubLObject)makeBoolean(NIL != Characters.upper_case_p(var19) || NIL != Characters.digit_char_p(var19, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f2681(final SubLObject var28) {
        return (SubLObject)makeBoolean(var28.isChar() && NIL != Sequences.find(var28, (SubLObject)$ic82$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f2803(final SubLObject var28) {
        return (SubLObject)makeBoolean(var28.isChar() && NIL != Sequences.find(var28, (SubLObject)$ic83$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f2804(final SubLObject var9) {
        return (SubLObject)makeBoolean(Sequences.length(var9).numE((SubLObject)ONE_INTEGER) && NIL != f2681(f2636(var9)));
    }
    
    public static SubLObject f2805(final SubLObject var9) {
        return Sequences.remove_if(Symbols.symbol_function((SubLObject)$ic84$), var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2806(final SubLObject var9) {
        SubLObject var25_275;
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        for (var10 = (var25_275 = Sequences.length(var9)), var11 = (SubLObject)NIL, var11 = (SubLObject)ZERO_INTEGER; !var11.numGE(var25_275); var11 = module0048.f_1X(var11)) {
            var12 = Strings.sublisp_char(var9, var11);
            if (NIL != Characters.alpha_char_p(var12) && NIL != Characters.lower_case_p(var12)) {
                return (SubLObject)NIL;
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f2807(final SubLObject var9) {
        SubLObject var25_276;
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        for (var10 = (var25_276 = Sequences.length(var9)), var11 = (SubLObject)NIL, var11 = (SubLObject)ZERO_INTEGER; !var11.numGE(var25_276); var11 = module0048.f_1X(var11)) {
            var12 = Strings.sublisp_char(var9, var11);
            if (NIL != Characters.alpha_char_p(var12) && NIL != Characters.upper_case_p(var12)) {
                return (SubLObject)NIL;
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f2808(final SubLObject var233) {
        SubLObject var234 = (SubLObject)NIL;
        SubLObject var235 = var233;
        SubLObject var236 = (SubLObject)NIL;
        var236 = var235.first();
        while (NIL != var235) {
            if (var236.isString()) {
                var234 = (SubLObject)ConsesLow.cons(Strings.string_downcase(var236, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var234);
            }
            else {
                var234 = (SubLObject)ConsesLow.cons(var236, var234);
            }
            var235 = var235.rest();
            var236 = var235.first();
        }
        return Sequences.nreverse(var234);
    }
    
    public static SubLObject f2809(final SubLObject var233) {
        SubLObject var234 = (SubLObject)NIL;
        SubLObject var235 = var233;
        SubLObject var236 = (SubLObject)NIL;
        var236 = var235.first();
        while (NIL != var235) {
            if (var236.isString()) {
                var234 = (SubLObject)ConsesLow.cons(Strings.string_upcase(var236, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var234);
            }
            else {
                var234 = (SubLObject)ConsesLow.cons(var236, var234);
            }
            var235 = var235.rest();
            var236 = var235.first();
        }
        return Sequences.nreverse(var234);
    }
    
    public static SubLObject f2810(final SubLObject var9, final SubLObject var41, SubLObject var171) {
        if (var171 == UNPROVIDED) {
            var171 = (SubLObject)T;
        }
        if (NIL != var171) {
            assert NIL != module0004.f106(var41) : var41;
            assert NIL != Types.stringp(var9) : var9;
        }
        if (NIL == var171 || NIL != module0035.f2002(var9, var41, (SubLObject)UNPROVIDED)) {
            f2743(var41, var9, Characters.char_upcase(Strings.sublisp_char(var9, var41)), (SubLObject)NIL);
        }
        return var9;
    }
    
    public static SubLObject f2811(final SubLObject var9) {
        return f2810(var9, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2812(final SubLObject var9) {
        return f2811(f2658(var9));
    }
    
    public static SubLObject f2813(final SubLObject var9, final SubLObject var41, SubLObject var171) {
        if (var171 == UNPROVIDED) {
            var171 = (SubLObject)T;
        }
        if (NIL != var171) {
            assert NIL != module0004.f106(var41) : var41;
            assert NIL != Types.stringp(var9) : var9;
        }
        if (NIL == var171 || NIL != module0035.f2002(var9, var41, (SubLObject)UNPROVIDED)) {
            f2743(var41, var9, Characters.char_downcase(Strings.sublisp_char(var9, var41)), (SubLObject)UNPROVIDED);
        }
        return var9;
    }
    
    public static SubLObject f2814(final SubLObject var9) {
        return f2813(var9, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2815(final SubLObject var9) {
        return f2814(f2658(var9));
    }
    
    public static SubLObject f2816(final SubLObject var174, final SubLObject var9) {
        final SubLObject var175 = Sequences.length(var9);
        SubLObject var176 = (SubLObject)T;
        if (var175.numG((SubLObject)ZERO_INTEGER)) {
            SubLObject var177;
            for (var177 = (SubLObject)NIL, var177 = (SubLObject)ZERO_INTEGER; !var177.numE(var175) && NIL != var176; var177 = Numbers.add(var177, (SubLObject)ONE_INTEGER)) {
                if (NIL == Characters.charE(var174, Strings.sublisp_char(var9, var177))) {
                    var176 = (SubLObject)NIL;
                }
            }
            return var176;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2817(final SubLObject var9, final SubLObject var277) {
        SubLObject var278 = (SubLObject)NIL;
        final SubLObject var279 = Sequences.length(var9);
        if (NIL == var278) {
            SubLObject var25_279;
            SubLObject var280;
            SubLObject var281;
            for (var25_279 = var279, var280 = (SubLObject)NIL, var280 = (SubLObject)ZERO_INTEGER; NIL == var278 && !var280.numGE(var25_279); var280 = module0048.f_1X(var280)) {
                var281 = Strings.sublisp_char(var9, var280);
                if (NIL == module0004.f104(var281, var277, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var278 = (SubLObject)T;
                }
            }
        }
        return (SubLObject)makeBoolean(NIL == var278);
    }
    
    public static SubLObject f2818() {
        return conses_high.copy_list($g926$.getGlobalValue());
    }
    
    public static SubLObject f2819() {
        return conses_high.copy_list($g927$.getGlobalValue());
    }
    
    public static SubLObject f2735(final SubLObject var9) {
        assert NIL != Types.stringp(var9) : var9;
        return Strings.string_trim($g926$.getGlobalValue(), var9);
    }
    
    public static SubLObject f2820(final SubLObject var9) {
        assert NIL != Types.stringp(var9) : var9;
        return Strings.string_left_trim($g926$.getGlobalValue(), var9);
    }
    
    public static SubLObject f2821(final SubLObject var9) {
        assert NIL != Types.stringp(var9) : var9;
        return Strings.string_right_trim($g926$.getGlobalValue(), var9);
    }
    
    public static SubLObject f2822(final SubLObject var19) {
        if (var19.isString()) {
            return Strings.string_trim($g926$.getGlobalValue(), var19);
        }
        return (SubLObject)$ic0$;
    }
    
    public static SubLObject f2823(SubLObject var9) {
        if (NIL != module0039.f3008(var9)) {
            var9 = module0039.f3048(module0039.f3018(Sequences.nsubstitute_if((SubLObject)$ic63$, (SubLObject)$ic88$, module0039.f3044(var9), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        final SubLObject var10 = var9;
        SubLObject var25_280;
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        for (var11 = (var25_280 = Sequences.length(var10)), var12 = (SubLObject)NIL, var12 = (SubLObject)ZERO_INTEGER; !var12.numGE(var25_280); var12 = module0048.f_1X(var12)) {
            var13 = Strings.sublisp_char(var10, var12);
            if (NIL != module0004.f104(var13, $g926$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && !var13.eql((SubLObject)Characters.CHAR_space)) {
                f2743(var12, var9, (SubLObject)Characters.CHAR_space, (SubLObject)UNPROVIDED);
            }
        }
        return var9;
    }
    
    public static SubLObject f2824(final SubLObject var9) {
        return f2823(f2658(var9));
    }
    
    public static SubLObject f2760(final SubLObject var28) {
        return (SubLObject)makeBoolean(var28.isChar() && (NIL != Sequences.find(var28, $g926$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || (NIL != module0039.f3010(var28) && NIL != f2825(Characters.char_code(var28)))));
    }
    
    public static SubLObject f2825(final SubLObject var281) {
        return (SubLObject)makeBoolean(var281.numGE((SubLObject)$ic89$) && var281.numLE((SubLObject)$ic90$));
    }
    
    public static SubLObject f2826(final SubLObject var28) {
        return (SubLObject)makeBoolean(NIL == f2760(var28));
    }
    
    public static SubLObject f2827(SubLObject var44, SubLObject var282, SubLObject var283) {
        if (var44 == UNPROVIDED) {
            var44 = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (var282 == UNPROVIDED) {
            var282 = (SubLObject)T;
        }
        if (var283 == UNPROVIDED) {
            var283 = (SubLObject)NIL;
        }
        SubLObject var284;
        for (var284 = (SubLObject)NIL, var284 = streams_high.read_char_no_hang(var44, var282, var283, (SubLObject)UNPROVIDED); NIL != var284 && NIL != f2760(var284); var284 = streams_high.read_char_no_hang(var44, var282, var283, (SubLObject)UNPROVIDED)) {}
        if (var284.isChar()) {
            streams_high.unread_char(var284, var44);
        }
        return var284;
    }
    
    public static SubLObject f2828(final SubLObject var9) {
        return f2817(var9, $g926$.getGlobalValue());
    }
    
    public static SubLObject f2829(SubLObject var9, SubLObject var284) {
        if (var284 == UNPROVIDED) {
            var284 = (SubLObject)$ic22$;
        }
        if (NIL != f2684(var9, var284)) {
            var9 = Sequences.subseq(var9, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        }
        if (NIL != f2673(var9, var284, (SubLObject)UNPROVIDED)) {
            var9 = Sequences.subseq(var9, (SubLObject)ZERO_INTEGER, Numbers.subtract(Sequences.length(var9), (SubLObject)ONE_INTEGER));
        }
        return var9;
    }
    
    public static SubLObject f2830(final SubLObject var9) {
        return Sequences.remove_if((SubLObject)$ic74$, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2831(final SubLObject var62, final SubLObject var63) {
        return Equality.equal(f2830(var62), f2830(var63));
    }
    
    public static SubLObject f2832(final SubLObject var62, final SubLObject var63) {
        return Equality.equalp(f2830(var62), f2830(var63));
    }
    
    public static SubLObject f2833(final SubLObject var44) {
        streams_high.write_char(Characters.code_char((SubLObject)THIRTEEN_INTEGER), var44);
        streams_high.terpri(var44);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2834(final SubLObject var28, SubLObject var285, final SubLObject var286) {
        final SubLObject var287 = Sequences.length(var285);
        if (var286.numGE(var287)) {
            final SubLObject var288 = Strings.make_string(Numbers.multiply(var287, (SubLObject)TWO_INTEGER), (SubLObject)UNPROVIDED);
            SubLObject var289;
            for (var289 = (SubLObject)NIL, var289 = (SubLObject)ZERO_INTEGER; var289.numL(var287); var289 = Numbers.add(var289, (SubLObject)ONE_INTEGER)) {
                f2743(var289, var288, Strings.sublisp_char(var285, var289), (SubLObject)UNPROVIDED);
            }
            var285 = var288;
        }
        f2743(var286, var285, var28, (SubLObject)UNPROVIDED);
        return var285;
    }
    
    public static SubLObject f2835(SubLObject var44, SubLObject var282, SubLObject var283, SubLObject var288) {
        if (var44 == UNPROVIDED) {
            var44 = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (var282 == UNPROVIDED) {
            var282 = (SubLObject)T;
        }
        if (var283 == UNPROVIDED) {
            var283 = (SubLObject)$ic91$;
        }
        if (var288 == UNPROVIDED) {
            var288 = (SubLObject)NIL;
        }
        final SubLObject var289 = (SubLObject)$ic92$;
        SubLObject var290 = Strings.make_string(var289, (SubLObject)UNPROVIDED);
        SubLObject var291 = (SubLObject)ZERO_INTEGER;
        SubLObject var292 = (SubLObject)$ic93$;
        SubLObject var293 = (SubLObject)NIL;
        while (NIL == var293) {
            final SubLObject var294 = streams_high.read_char(var44, var282, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            if (NIL != var294) {
                if (NIL != Characters.charE(var294, Characters.code_char((SubLObject)THIRTEEN_INTEGER))) {
                    final SubLObject var295 = var292;
                    if (var295.eql((SubLObject)$ic93$)) {
                        var292 = (SubLObject)$ic94$;
                    }
                    else {
                        if (!var295.eql((SubLObject)$ic94$)) {
                            continue;
                        }
                        var290 = f2834(Characters.code_char((SubLObject)THIRTEEN_INTEGER), var290, var291);
                        var291 = Numbers.add(var291, (SubLObject)ONE_INTEGER);
                    }
                }
                else if (NIL != Characters.charE(var294, Characters.code_char((SubLObject)TEN_INTEGER))) {
                    final SubLObject var295 = var292;
                    if (var295.eql((SubLObject)$ic93$)) {
                        var293 = (SubLObject)T;
                    }
                    else {
                        if (!var295.eql((SubLObject)$ic94$)) {
                            continue;
                        }
                        var293 = (SubLObject)T;
                    }
                }
                else {
                    final SubLObject var295 = var292;
                    if (var295.eql((SubLObject)$ic93$)) {
                        var290 = f2834(var294, var290, var291);
                        var291 = Numbers.add(var291, (SubLObject)ONE_INTEGER);
                    }
                    else {
                        if (!var295.eql((SubLObject)$ic94$)) {
                            continue;
                        }
                        var290 = f2834(Characters.code_char((SubLObject)THIRTEEN_INTEGER), var290, var291);
                        var291 = Numbers.add(var291, (SubLObject)ONE_INTEGER);
                        var290 = f2834(var294, var290, var291);
                        var291 = Numbers.add(var291, (SubLObject)ONE_INTEGER);
                        var292 = (SubLObject)$ic93$;
                    }
                }
            }
            else {
                if (NIL == var288 || !var291.isPositive()) {
                    return Values.values(var283, (SubLObject)T);
                }
                var293 = (SubLObject)T;
            }
        }
        return Values.values(f2623(var290, (SubLObject)ZERO_INTEGER, var291), (SubLObject)NIL);
    }
    
    public static SubLObject f2836(SubLObject var44, SubLObject var282, SubLObject var283) {
        if (var44 == UNPROVIDED) {
            var44 = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (var282 == UNPROVIDED) {
            var282 = (SubLObject)T;
        }
        if (var283 == UNPROVIDED) {
            var283 = (SubLObject)$ic91$;
        }
        SubLObject var284 = (SubLObject)NIL;
        SubLObject var285 = (SubLObject)$ic93$;
        while (true) {
            final SubLObject var286 = f2835(var44, var282, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            if (NIL == var286) {
                return Values.values(var283, (SubLObject)T);
            }
            final SubLObject var287 = var286;
            SubLObject var25_293;
            SubLObject var288;
            SubLObject var289;
            SubLObject var290;
            SubLObject var291;
            SubLObject var290_294;
            SubLObject var290_295;
            for (var288 = (var25_293 = Sequences.length(var287)), var289 = (SubLObject)NIL, var289 = (SubLObject)ZERO_INTEGER; !var289.numGE(var25_293); var289 = module0048.f_1X(var289)) {
                var290 = Strings.sublisp_char(var287, var289);
                var291 = var285;
                if (var291.eql((SubLObject)$ic93$)) {
                    var290_294 = var290;
                    if (var290_294.eql((SubLObject)Characters.CHAR_quotation)) {
                        var285 = (SubLObject)$ic95$;
                    }
                }
                else if (var291.eql((SubLObject)$ic95$)) {
                    var290_295 = var290;
                    if (var290_295.eql((SubLObject)Characters.CHAR_quotation)) {
                        var285 = (SubLObject)$ic93$;
                    }
                    else if (var290_295.eql((SubLObject)Characters.CHAR_backslash)) {
                        var285 = (SubLObject)$ic96$;
                    }
                }
                else if (var291.eql((SubLObject)$ic96$)) {
                    var285 = (SubLObject)$ic95$;
                }
            }
            if (var285 == $ic93$) {
                if (NIL != var284) {
                    SubLObject var292 = (SubLObject)ConsesLow.list(var286);
                    SubLObject var293 = var284;
                    SubLObject var294 = (SubLObject)NIL;
                    var294 = var293.first();
                    while (NIL != var293) {
                        var292 = (SubLObject)ConsesLow.cons(Strings.make_string((SubLObject)ONE_INTEGER, (SubLObject)Characters.CHAR_newline), var292);
                        var292 = (SubLObject)ConsesLow.cons(var294, var292);
                        var293 = var293.rest();
                        var294 = var293.first();
                    }
                    return Values.values(Functions.apply(Symbols.symbol_function((SubLObject)$ic97$), var292), (SubLObject)NIL);
                }
                return Values.values(var286, (SubLObject)NIL);
            }
            else {
                var284 = (SubLObject)ConsesLow.cons(var286, var284);
            }
        }
    }
    
    public static SubLObject f2837(final SubLObject var9, final SubLObject var298, SubLObject var53, SubLObject var77) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var77 == UNPROVIDED) {
            var77 = (SubLObject)ZERO_INTEGER;
        }
        SubLObject var299 = Sequences.length(var9);
        SubLObject var300 = (SubLObject)NIL;
        SubLObject var301 = (SubLObject)NIL;
        if (NIL == var301) {
            SubLObject var302 = var298;
            SubLObject var303 = (SubLObject)NIL;
            var303 = var302.first();
            while (NIL == var301 && NIL != var302) {
                final SubLObject var304 = Sequences.search(var303, var9, var53, Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, (SubLObject)NIL, var77, var299);
                if (NIL != var304 && var304.numL(var299)) {
                    var299 = var304;
                    var300 = var303;
                }
                var301 = Numbers.numE(var299, var77);
                var302 = var302.rest();
                var303 = var302.first();
            }
        }
        return Values.values((SubLObject)((NIL != var300) ? var299 : NIL), var300);
    }
    
    public static SubLObject f2838(final SubLObject var194, final SubLObject var195, SubLObject var53, SubLObject var21) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var21 == UNPROVIDED) {
            var21 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        return module0035.f2114(f2689(var194, var195, var53, var21));
    }
    
    public static SubLObject f2839(final SubLObject var9, final SubLObject var44, SubLObject var77, SubLObject var61) {
        if (var77 == UNPROVIDED) {
            var77 = (SubLObject)ZERO_INTEGER;
        }
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var9) : var9;
        if (NIL == var61) {
            var61 = Sequences.length(var9);
        }
        final SubLObject var78 = Numbers.subtract(var61, var77);
        if (var78.isPositive()) {
            SubLObject var79;
            for (var79 = (SubLObject)NIL, var79 = (SubLObject)ZERO_INTEGER; var79.numL(var78); var79 = Numbers.add(var79, (SubLObject)ONE_INTEGER)) {
                streams_high.write_char(Strings.sublisp_char(var9, Numbers.add(var77, var79)), var44);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2840(final SubLObject var233) {
        if (NIL == var233) {
            return (SubLObject)NIL;
        }
        return Functions.apply(Symbols.symbol_function((SubLObject)$ic97$), var233);
    }
    
    public static SubLObject f2841(final SubLObject var66, final SubLObject var67, final SubLObject var9) {
        assert NIL != Types.characterp(var66) : var66;
        assert NIL != Types.characterp(var67) : var67;
        assert NIL != Types.stringp(var9) : var9;
        SubLObject var25_303;
        SubLObject var68;
        SubLObject var69;
        SubLObject var70;
        for (var68 = (var25_303 = Sequences.length(var9)), var69 = (SubLObject)NIL, var69 = (SubLObject)ZERO_INTEGER; !var69.numGE(var25_303); var69 = module0048.f_1X(var69)) {
            var70 = Strings.sublisp_char(var9, var69);
            if (var70.eql(var67)) {
                f2743(var69, var9, var66, (SubLObject)UNPROVIDED);
            }
        }
        return var9;
    }
    
    public static SubLObject f2842(final SubLObject var66, final SubLObject var67, final SubLObject var9) {
        return f2841(var66, var67, f2658(var9));
    }
    
    public static SubLObject f2843(final SubLObject var66, final SubLObject var53, final SubLObject var9) {
        assert NIL != Types.characterp(var66) : var66;
        assert NIL != Symbols.fboundp(var53) : var53;
        assert NIL != Types.stringp(var9) : var9;
        SubLObject var25_304;
        SubLObject var67;
        SubLObject var68;
        SubLObject var69;
        for (var67 = (var25_304 = Sequences.length(var9)), var68 = (SubLObject)NIL, var68 = (SubLObject)ZERO_INTEGER; !var68.numGE(var25_304); var68 = module0048.f_1X(var68)) {
            var69 = Strings.sublisp_char(var9, var68);
            if (NIL != Functions.funcall(var53, var69)) {
                f2743(var68, var9, var66, (SubLObject)UNPROVIDED);
            }
        }
        return var9;
    }
    
    public static SubLObject f2844(final SubLObject var66, final SubLObject var53, final SubLObject var9) {
        return f2843(var66, var53, f2658(var9));
    }
    
    public static SubLObject f2845(final SubLObject var66, final SubLObject var53, final SubLObject var9) {
        assert NIL != Types.characterp(var66) : var66;
        assert NIL != Symbols.fboundp(var53) : var53;
        assert NIL != Types.stringp(var9) : var9;
        SubLObject var25_305;
        SubLObject var67;
        SubLObject var68;
        SubLObject var69;
        for (var67 = (var25_305 = Sequences.length(var9)), var68 = (SubLObject)NIL, var68 = (SubLObject)ZERO_INTEGER; !var68.numGE(var25_305); var68 = module0048.f_1X(var68)) {
            var69 = Strings.sublisp_char(var9, var68);
            if (NIL == Functions.funcall(var53, var69)) {
                f2743(var68, var9, var66, (SubLObject)UNPROVIDED);
            }
        }
        return var9;
    }
    
    public static SubLObject f2846(final SubLObject var66, final SubLObject var53, final SubLObject var9) {
        return f2845(var66, var53, f2658(var9));
    }
    
    public static SubLObject f2699(final SubLObject var66, final SubLObject var67, final SubLObject var9, SubLObject var53) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQUALP);
        }
        assert NIL != Types.stringp(var66) : var66;
        assert NIL != f2611(var67) : var67;
        assert NIL != Types.stringp(var9) : var9;
        final SubLObject var68 = Sequences.length(var66);
        final SubLObject var69 = Sequences.length(var67);
        SubLObject var70 = (SubLObject)ZERO_INTEGER;
        SubLObject var71;
        SubLObject var72;
        for (var71 = (SubLObject)NIL, var72 = (SubLObject)NIL, var71 = (SubLObject)ZERO_INTEGER, var72 = Sequences.search(var67, var9, var53, Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, (SubLObject)NIL, var71, (SubLObject)NIL); NIL != var72; var72 = Sequences.search(var67, var9, var53, Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, (SubLObject)NIL, var71, (SubLObject)NIL)) {
            var70 = Numbers.add(var70, (SubLObject)ONE_INTEGER);
            var71 = Numbers.add(var72, var69);
        }
        if (var70.numE((SubLObject)ZERO_INTEGER)) {
            return var9;
        }
        final SubLObject var73 = Sequences.length(var9);
        final SubLObject var74 = Numbers.multiply(var70, Numbers.subtract(var68, var69));
        final SubLObject var75 = Numbers.add(var73, var74);
        final SubLObject var76 = Strings.make_string(var75, (SubLObject)Characters.CHAR_space);
        SubLObject var77 = (SubLObject)ZERO_INTEGER;
        SubLObject var78 = (SubLObject)ZERO_INTEGER;
        SubLObject var79;
        SubLObject var80;
        SubLObject var81;
        for (var79 = (SubLObject)NIL, var80 = (SubLObject)NIL, var79 = (SubLObject)ZERO_INTEGER, var80 = Sequences.search(var67, var9, var53, Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, (SubLObject)NIL, var79, (SubLObject)NIL); NIL != var80; var80 = Sequences.search(var67, var9, var53, Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, (SubLObject)NIL, var79, (SubLObject)NIL)) {
            var81 = Numbers.subtract(var80, var77);
            Sequences.replace(var76, var9, var78, Numbers.add(var78, var81), var77, var80);
            var77 = Numbers.add(var77, var81);
            var78 = Numbers.add(var78, var81);
            Sequences.replace(var76, var66, var78, Numbers.add(var78, var68), (SubLObject)ZERO_INTEGER, var68);
            var77 = Numbers.add(var77, var69);
            var78 = Numbers.add(var78, var68);
            var79 = Numbers.add(var80, var69);
        }
        if (!var78.numE(var75)) {
            Sequences.replace(var76, var9, var78, (SubLObject)NIL, var77, (SubLObject)NIL);
        }
        return var76;
    }
    
    public static SubLObject f2784(final SubLObject var9, SubLObject var314) {
        if (var314 == UNPROVIDED) {
            var314 = (SubLObject)Characters.CHAR_space;
        }
        SubLObject var315 = (SubLObject)(var9.isString() ? Strings.string_trim((SubLObject)ConsesLow.list(var314), var9) : NIL);
        if (NIL != f2608(var315)) {
            var315 = (SubLObject)NIL;
        }
        return var315;
    }
    
    public static SubLObject f2847(final SubLObject var174) {
        return (SubLObject)makeBoolean(NIL != Characters.digit_char_p(var174, (SubLObject)UNPROVIDED) || NIL != Sequences.find(var174, (SubLObject)$ic100$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f2848(final SubLObject var277, final SubLObject var9, SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)NIL;
        }
        if (ZERO_INTEGER.eql(var41)) {
            return var9;
        }
        final SubLObject var278 = Sequences.length(var9);
        if (TWO_INTEGER.numG(var278)) {
            return var9;
        }
        final SubLObject var279 = Strings.sublisp_char(var9, (SubLObject)ZERO_INTEGER);
        if (NIL != module0004.f104(var279, var277, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var280 = Strings.sublisp_char(var9, Numbers.subtract(var278, (SubLObject)ONE_INTEGER));
            if (NIL != Characters.charE(var279, var280)) {
                final SubLObject var281 = f2623(var9, (SubLObject)ONE_INTEGER, Numbers.subtract(var278, (SubLObject)ONE_INTEGER));
                if (NIL == var41) {
                    return f2848(var277, var281, (SubLObject)UNPROVIDED);
                }
                if (var41.numE((SubLObject)ZERO_INTEGER)) {
                    return var281;
                }
                return f2848(var277, var281, Numbers.subtract(var41, (SubLObject)ONE_INTEGER));
            }
        }
        return var9;
    }
    
    public static SubLObject f2661(final SubLObject var9, SubLObject var317, SubLObject var318) {
        if (var317 == UNPROVIDED) {
            var317 = Symbols.symbol_function((SubLObject)$ic101$);
        }
        if (var318 == UNPROVIDED) {
            var318 = (SubLObject)NIL;
        }
        final SubLObject var319 = Sequences.length(var9);
        SubLObject var320 = (SubLObject)ZERO_INTEGER;
        SubLObject var321 = (SubLObject)ONE_INTEGER;
        SubLObject var322 = (SubLObject)NIL;
        SubLObject var323 = (SubLObject)NIL;
        while (!var321.numG(var319)) {
            final SubLObject var324 = Numbers.subtract(var321, (SubLObject)ONE_INTEGER);
            final SubLObject var325 = Strings.sublisp_char(var9, var320);
            final SubLObject var326 = (SubLObject)(var321.numL(var319) ? Strings.sublisp_char(var9, var321) : NIL);
            final SubLObject var327 = Strings.sublisp_char(var9, var324);
            final SubLObject var328 = (SubLObject)makeBoolean(var325.isChar() && (NIL == var318 || NIL == Characters.charE(var325, (SubLObject)Characters.CHAR_quotation)) && NIL == Functions.funcall(var317, var325));
            final SubLObject var329 = (SubLObject)makeBoolean(var326.isChar() && (NIL == var318 || NIL == Characters.charE(var326, (SubLObject)Characters.CHAR_quotation)) && NIL == Functions.funcall(var317, var326));
            if (NIL != Characters.charE(var325, (SubLObject)Characters.CHAR_quotation) && NIL != var318) {
                if (NIL != var323) {
                    if (NIL != Characters.charE(var327, (SubLObject)Characters.CHAR_quotation) && !var320.numE(var324)) {
                        var323 = (SubLObject)NIL;
                    }
                }
                else {
                    var323 = (SubLObject)T;
                }
            }
            if (var321.numE(var319) && NIL == var328) {
                var322 = (SubLObject)ConsesLow.cons(Sequences.subseq(var9, var320, var321), var322);
                var321 = Numbers.add(var321, (SubLObject)ONE_INTEGER);
            }
            else if (NIL != var328) {
                var320 = Numbers.add(var320, (SubLObject)ONE_INTEGER);
                var321 = Numbers.add(var320, (SubLObject)ONE_INTEGER);
            }
            else if (NIL == var328 && NIL == var329) {
                var321 = Numbers.add(var321, (SubLObject)ONE_INTEGER);
            }
            else if (NIL == var328 && NIL == var323 && NIL != var329) {
                var322 = (SubLObject)ConsesLow.cons(Sequences.subseq(var9, var320, var321), var322);
                var320 = Numbers.add(var321, (SubLObject)ONE_INTEGER);
                var321 = Numbers.add(var320, (SubLObject)ONE_INTEGER);
            }
            else {
                if (NIL != var328 || NIL == var323 || NIL == var329) {
                    continue;
                }
                var321 = Numbers.add(var321, (SubLObject)ONE_INTEGER);
            }
        }
        return Sequences.nreverse(var322);
    }
    
    public static SubLObject f2849(final SubLObject var9) {
        SubLObject var10 = (SubLObject)NIL;
        final SubLObject var11 = module0035.f2112((SubLObject)Characters.CHAR_space, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var12 = (SubLObject)ConsesLow.cons((SubLObject)ZERO_INTEGER, Mapping.mapcar((SubLObject)$ic102$, var11));
        SubLObject var13 = (SubLObject)NIL;
        var13 = var12.first();
        while (NIL != var12) {
            SubLObject var73_329 = (SubLObject)ConsesLow.cons((SubLObject)NIL, var11);
            SubLObject var14 = (SubLObject)NIL;
            var14 = var73_329.first();
            while (NIL != var73_329) {
                if (NIL == var14 || var14.numG(var13)) {
                    final SubLObject var15 = f2623(var9, var13, var14);
                    if (NIL == conses_high.member(var15, var10, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var10 = (SubLObject)ConsesLow.cons(var15, var10);
                    }
                }
                var73_329 = var73_329.rest();
                var14 = var73_329.first();
            }
            var12 = var12.rest();
            var13 = var12.first();
        }
        return var10;
    }
    
    public static SubLObject f2850(final SubLObject var9) {
        return Numbers.add((SubLObject)ONE_INTEGER, f2851(f2735(var9), (SubLObject)Characters.CHAR_space));
    }
    
    public static SubLObject f2852(final SubLObject var9, SubLObject var71) {
        if (var71 == UNPROVIDED) {
            var71 = $g914$.getGlobalValue();
        }
        assert NIL != Types.stringp(var9) : var9;
        assert NIL != Types.characterp(var71) : var71;
        return f2622(var9, var71);
    }
    
    public static SubLObject f2853(final SubLObject var9, final SubLObject var136) {
        SubLObject var137 = (SubLObject)NIL;
        SubLObject var138;
        SubLObject var139;
        SubLObject var140;
        SubLObject var141;
        SubLObject var142;
        for (var138 = Sequences.length(var9), var139 = (SubLObject)NIL, var139 = (SubLObject)ZERO_INTEGER; var139.numL(var138); var139 = Numbers.add(var139, (SubLObject)ONE_INTEGER)) {
            var140 = (SubLObject)NIL;
            if (NIL == var140) {
                var141 = var136;
                var142 = (SubLObject)NIL;
                var142 = var141.first();
                while (NIL == var140 && NIL != var141) {
                    if (NIL != f2684(Sequences.subseq(var9, var139, (SubLObject)UNPROVIDED), var142)) {
                        var137 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var139, var142), var137);
                        var140 = (SubLObject)T;
                    }
                    var141 = var141.rest();
                    var142 = var141.first();
                }
            }
        }
        return Sequences.nreverse(var137);
    }
    
    public static SubLObject f2854(final SubLObject var9, final SubLObject var332) {
        SubLObject var333 = (SubLObject)NIL;
        final SubLObject var334 = Sequences.length(var9);
        final SubLObject var335 = f2853(var9, var332);
        SubLObject var336 = (SubLObject)ZERO_INTEGER;
        SubLObject var337 = (SubLObject)ZERO_INTEGER;
        while (!var337.numG(var334)) {
            final SubLObject var338 = conses_high.assoc(var337, var335, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var339 = conses_high.second(var338);
            final SubLObject var340 = Sequences.length(var339);
            if (var337.numE(var334) && var336.numL(var337)) {
                var333 = (SubLObject)ConsesLow.cons(Sequences.subseq(var9, var336, var337), var333);
                var337 = (var336 = Numbers.add(var337, (SubLObject)ONE_INTEGER));
            }
            else if (NIL != var339) {
                var333 = (SubLObject)ConsesLow.cons(Sequences.subseq(var9, var336, var337), var333);
                var333 = (SubLObject)ConsesLow.cons(var339, var333);
                var337 = (var336 = Numbers.add(var337, var340));
            }
            else {
                var337 = Numbers.add(var337, (SubLObject)ONE_INTEGER);
            }
        }
        return Sequences.nreverse(var333);
    }
    
    public static SubLObject f2855(final SubLObject var9) {
        assert NIL != Types.stringp(var9) : var9;
        SubLObject var10 = var9;
        SubLObject var11 = (SubLObject)NIL;
        if (NIL == var11) {
            SubLObject var12 = (SubLObject)$ic103$;
            SubLObject var13 = (SubLObject)NIL;
            var13 = var12.first();
            while (NIL == var11 && NIL != var12) {
                if (NIL != f2668(var13, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var11 = (SubLObject)T;
                }
                var12 = var12.rest();
                var13 = var12.first();
            }
        }
        if (NIL == var11) {
            final SubLObject var14 = f2738(var9, (SubLObject)$ic104$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (Sequences.length(var14).numE((SubLObject)TWO_INTEGER)) {
                var10 = f2761(Sequences.reverse(var14), (SubLObject)UNPROVIDED);
            }
        }
        return var10;
    }
    
    public static SubLObject f2856(final SubLObject var85) {
        final SubLObject var86 = Sequences.length(var85);
        SubLObject var87 = (SubLObject)ZERO_INTEGER;
        final SubLObject var88 = Strings.make_string(var86, (SubLObject)UNPROVIDED);
        SubLObject var89 = var85;
        SubLObject var90 = (SubLObject)NIL;
        var90 = var89.first();
        while (NIL != var89) {
            final SubLObject var91 = (SubLObject)(var90.isChar() ? var90 : Characters.CHAR_space);
            f2743(var87, var88, var91, (SubLObject)NIL);
            var87 = Numbers.add(var87, (SubLObject)ONE_INTEGER);
            var89 = var89.rest();
            var90 = var89.first();
        }
        return var88;
    }
    
    public static SubLObject f2857(final SubLObject var9) {
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11;
        for (var11 = (SubLObject)NIL, var11 = (SubLObject)ZERO_INTEGER; !var11.eql(Sequences.length(var9)); var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER)) {
            var10 = (SubLObject)ConsesLow.cons(Sequences.elt(var9, var11), var10);
        }
        return Sequences.nreverse(var10);
    }
    
    public static SubLObject f2851(final SubLObject var9, final SubLObject var340) {
        return Sequences.count(var340, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2858(final SubLObject var341, final SubLObject var9, SubLObject var53) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQUALP);
        }
        SubLObject var342 = (SubLObject)NIL;
        if (NIL == var342) {
            SubLObject var343 = var341;
            SubLObject var344 = (SubLObject)NIL;
            var344 = var343.first();
            while (NIL == var342 && NIL != var343) {
                if (NIL != f2668(var344, var9, var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var342 = (SubLObject)T;
                }
                var343 = var343.rest();
                var344 = var343.first();
            }
        }
        return var342;
    }
    
    public static SubLObject f2859(final SubLObject var341, final SubLObject var9, SubLObject var53) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQUALP);
        }
        SubLObject var342 = (SubLObject)NIL;
        if (NIL == var342) {
            SubLObject var343 = var341;
            SubLObject var344 = (SubLObject)NIL;
            var344 = var343.first();
            while (NIL == var342 && NIL != var343) {
                if (NIL == f2668(var344, var9, var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var342 = (SubLObject)T;
                }
                var343 = var343.rest();
                var344 = var343.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var342);
    }
    
    public static SubLObject f2860(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        return conses_high.member(var28, $g928$.getDynamicValue(var29), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2861(final SubLObject var9, SubLObject var343) {
        if (var343 == UNPROVIDED) {
            var343 = (SubLObject)$ic105$;
        }
        final SubLThread var344 = SubLProcess.currentSubLThread();
        SubLObject var345 = (SubLObject)NIL;
        final SubLObject var346 = $g928$.currentBinding(var344);
        try {
            $g928$.bind(var343, var344);
            SubLObject var347;
            SubLObject var348;
            for (var347 = (SubLObject)NIL, var348 = (SubLObject)NIL, var347 = (SubLObject)ZERO_INTEGER, var348 = Sequences.position_if(Symbols.symbol_function((SubLObject)$ic106$), var9, Symbols.symbol_function((SubLObject)IDENTITY), var347, (SubLObject)UNPROVIDED); NIL != var348 && !var348.eql(Sequences.length(var9)); var348 = Sequences.position_if(Symbols.symbol_function((SubLObject)$ic106$), var9, Symbols.symbol_function((SubLObject)IDENTITY), var347, (SubLObject)UNPROVIDED)) {
                var345 = (SubLObject)ConsesLow.cons(f2735(Sequences.subseq(var9, var347, Numbers.add(var348, (SubLObject)ONE_INTEGER))), var345);
                var347 = Numbers.add(var348, (SubLObject)ONE_INTEGER);
            }
            var345 = (SubLObject)ConsesLow.cons(f2735(Sequences.subseq(var9, var347, (SubLObject)UNPROVIDED)), var345);
        }
        finally {
            $g928$.rebind(var346, var344);
        }
        return Sequences.nreverse(Sequences.delete($g916$.getGlobalValue(), var345, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f2862(final SubLObject var9) {
        if (NIL != var9) {
            final SubLObject var10 = f2752(var9, (SubLObject)$ic107$);
            SubLObject var11 = (SubLObject)NIL;
            SubLObject var12 = var10;
            SubLObject var13 = (SubLObject)NIL;
            var13 = var12.first();
            while (NIL != var12) {
                final SubLObject var14 = Strings.string_trim((SubLObject)$ic65$, var13);
                if (NIL == f2608(var14)) {
                    var11 = (SubLObject)ConsesLow.cons(var14, var11);
                }
                var12 = var12.rest();
                var13 = var12.first();
            }
            return Sequences.nreverse(var11);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2863(final SubLObject var291) {
        SubLObject var292 = (SubLObject)ZERO_INTEGER;
        SubLObject var293 = var291;
        SubLObject var294 = (SubLObject)NIL;
        var294 = var293.first();
        while (NIL != var293) {
            var292 = Numbers.add(var292, Sequences.length(var294));
            var293 = var293.rest();
            var294 = var293.first();
        }
        var292 = Numbers.add(var292, Sequences.length(var291));
        final SubLObject var295 = Strings.make_string(var292, (SubLObject)UNPROVIDED);
        SubLObject var296 = (SubLObject)ZERO_INTEGER;
        SubLObject var297 = var291;
        SubLObject var298 = (SubLObject)NIL;
        var298 = var297.first();
        while (NIL != var297) {
            SubLObject var299;
            SubLObject var300;
            for (var299 = Sequences.length(var298), var300 = (SubLObject)NIL, var300 = (SubLObject)ZERO_INTEGER; var300.numL(var299); var300 = Numbers.add(var300, (SubLObject)ONE_INTEGER)) {
                f2743(var296, var295, Strings.sublisp_char(var298, var300), (SubLObject)UNPROVIDED);
                var296 = Numbers.add(var296, (SubLObject)ONE_INTEGER);
            }
            f2743(var296, var295, (SubLObject)Characters.CHAR_newline, (SubLObject)UNPROVIDED);
            var296 = Numbers.add(var296, (SubLObject)ONE_INTEGER);
            var297 = var297.rest();
            var298 = var297.first();
        }
        return var295;
    }
    
    public static SubLObject f2864(final SubLObject var9) {
        final SubLObject var10 = (SubLObject)$ic108$;
        SubLObject var12;
        final SubLObject var11 = var12 = Sequences.length(var9);
        SubLObject var25_349;
        SubLObject var13;
        SubLObject var14;
        SubLObject var15;
        for (var13 = (var25_349 = Sequences.length(var9)), var14 = (SubLObject)NIL, var14 = (SubLObject)ZERO_INTEGER; !var14.numGE(var25_349); var14 = module0048.f_1X(var14)) {
            var15 = Strings.sublisp_char(var9, var14);
            if (NIL != module0004.f104(var15, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var12 = Numbers.add(var12, (SubLObject)ONE_INTEGER);
            }
        }
        final SubLObject var16 = Strings.make_string(var12, (SubLObject)UNPROVIDED);
        SubLObject var17 = (SubLObject)ZERO_INTEGER;
        SubLObject var25_350;
        SubLObject var18;
        SubLObject var19;
        SubLObject var20;
        for (var18 = (var25_350 = Sequences.length(var9)), var19 = (SubLObject)NIL, var19 = (SubLObject)ZERO_INTEGER; !var19.numGE(var25_350); var19 = module0048.f_1X(var19)) {
            var20 = Strings.sublisp_char(var9, var19);
            if (NIL != module0004.f104(var20, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                Strings.set_char(var16, var17, (SubLObject)Characters.CHAR_backslash);
                var17 = Numbers.add(var17, (SubLObject)ONE_INTEGER);
            }
            f2743(var17, var16, var20, (SubLObject)UNPROVIDED);
            var17 = Numbers.add(var17, (SubLObject)ONE_INTEGER);
        }
        return var16;
    }
    
    public static SubLObject f2865(final SubLObject var9) {
        final SubLObject var10 = Sequences.length(var9);
        final SubLObject var11 = f2689(Strings.make_string((SubLObject)ONE_INTEGER, (SubLObject)Characters.CHAR_newline), var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)ZERO_INTEGER;
        SubLObject var14 = var11;
        SubLObject var15 = (SubLObject)NIL;
        var15 = var14.first();
        while (NIL != var14) {
            var12 = (SubLObject)ConsesLow.cons(Numbers.subtract(var15, var13), var12);
            var13 = Numbers.add(var15, (SubLObject)ONE_INTEGER);
            var14 = var14.rest();
            var15 = var14.first();
        }
        var12 = (SubLObject)ConsesLow.cons(Numbers.subtract(var10, var13), var12);
        return Sequences.nreverse(var12);
    }
    
    public static SubLObject f2866(final SubLObject var355) {
        SubLObject var356 = (SubLObject)NIL;
        SubLObject var357 = (SubLObject)NIL;
        SubLObject var25_358;
        SubLObject var358;
        SubLObject var359;
        SubLObject var360;
        for (var358 = (var25_358 = Sequences.length(var355)), var359 = (SubLObject)NIL, var359 = (SubLObject)ZERO_INTEGER; !var359.numGE(var25_358); var359 = module0048.f_1X(var359)) {
            var360 = Strings.sublisp_char(var355, var359);
            if (NIL != Characters.upper_case_p(var360) || NIL == Characters.alphanumericp(var360)) {
                if (NIL != var357) {
                    var356 = (SubLObject)ConsesLow.cons(Functions.apply(Symbols.symbol_function((SubLObject)$ic97$), Sequences.nreverse(var357)), var356);
                    var357 = (SubLObject)NIL;
                }
                if (NIL != Characters.upper_case_p(var360)) {
                    var360 = Characters.char_downcase(var360);
                }
            }
            if (NIL != Characters.alphanumericp(var360)) {
                var357 = (SubLObject)ConsesLow.cons(Strings.make_string((SubLObject)ONE_INTEGER, var360), var357);
            }
        }
        if (NIL != var357) {
            var356 = (SubLObject)ConsesLow.cons(Functions.apply(Symbols.symbol_function((SubLObject)$ic97$), Sequences.nreverse(var357)), var356);
            var357 = (SubLObject)NIL;
        }
        return Sequences.nreverse(var356);
    }
    
    public static SubLObject f2867(final SubLObject var355, SubLObject var360) {
        if (var360 == UNPROVIDED) {
            var360 = (SubLObject)T;
        }
        SubLObject var361 = (SubLObject)NIL;
        SubLObject var362 = var360;
        SubLObject var25_362;
        SubLObject var363;
        SubLObject var364;
        SubLObject var365;
        for (var363 = (var25_362 = Sequences.length(var355)), var364 = (SubLObject)NIL, var364 = (SubLObject)ZERO_INTEGER; !var364.numGE(var25_362); var364 = module0048.f_1X(var364)) {
            var365 = Strings.sublisp_char(var355, var364);
            if (NIL != module0126.f8387(var365)) {
                if (NIL != Characters.alphanumericp(var365)) {
                    if (NIL != var362) {
                        var361 = (SubLObject)ConsesLow.cons(Strings.string_upcase(Strings.make_string((SubLObject)ONE_INTEGER, var365), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var361);
                        var362 = (SubLObject)NIL;
                    }
                    else {
                        var361 = (SubLObject)ConsesLow.cons(Strings.make_string((SubLObject)ONE_INTEGER, var365), var361);
                    }
                }
                else {
                    var361 = (SubLObject)ConsesLow.cons(Strings.make_string((SubLObject)ONE_INTEGER, var365), var361);
                    var362 = (SubLObject)T;
                }
            }
            else {
                var362 = (SubLObject)T;
            }
        }
        return Functions.apply(Symbols.symbol_function((SubLObject)$ic97$), Sequences.nreverse(var361));
    }
    
    public static SubLObject f2868(final SubLObject var355, SubLObject var363, SubLObject var364, SubLObject var365, SubLObject var366, SubLObject var367, SubLObject var368) {
        if (var363 == UNPROVIDED) {
            var363 = $g926$.getGlobalValue();
        }
        if (var364 == UNPROVIDED) {
            var364 = (SubLObject)NIL;
        }
        if (var365 == UNPROVIDED) {
            var365 = (SubLObject)NIL;
        }
        if (var366 == UNPROVIDED) {
            var366 = (SubLObject)NIL;
        }
        if (var367 == UNPROVIDED) {
            var367 = (SubLObject)NIL;
        }
        if (var368 == UNPROVIDED) {
            var368 = $g927$.getGlobalValue();
        }
        return f2869(var355, var363, var368, var364, var365, var366, var367);
    }
    
    public static SubLObject f2738(final SubLObject var355, SubLObject var363, SubLObject var364, SubLObject var365, SubLObject var366, SubLObject var367, SubLObject var368) {
        if (var363 == UNPROVIDED) {
            var363 = $g926$.getGlobalValue();
        }
        if (var364 == UNPROVIDED) {
            var364 = (SubLObject)NIL;
        }
        if (var365 == UNPROVIDED) {
            var365 = (SubLObject)NIL;
        }
        if (var366 == UNPROVIDED) {
            var366 = (SubLObject)NIL;
        }
        if (var367 == UNPROVIDED) {
            var367 = (SubLObject)NIL;
        }
        if (var368 == UNPROVIDED) {
            var368 = (SubLObject)NIL;
        }
        return f2869(var355, var363, var368, var364, var365, var366, var367);
    }
    
    public static SubLObject f2869(final SubLObject var355, SubLObject var363, SubLObject var368, SubLObject var364, SubLObject var365, SubLObject var366, SubLObject var367) {
        if (var363 == UNPROVIDED) {
            var363 = $g926$.getGlobalValue();
        }
        if (var368 == UNPROVIDED) {
            var368 = (SubLObject)NIL;
        }
        if (var364 == UNPROVIDED) {
            var364 = (SubLObject)NIL;
        }
        if (var365 == UNPROVIDED) {
            var365 = (SubLObject)NIL;
        }
        if (var366 == UNPROVIDED) {
            var366 = (SubLObject)NIL;
        }
        if (var367 == UNPROVIDED) {
            var367 = (SubLObject)NIL;
        }
        if ($ic109$.eql(var363)) {
            var363 = $g926$.getGlobalValue();
        }
        SubLObject var369 = (SubLObject)NIL;
        SubLObject var370 = $g916$.getGlobalValue();
        SubLObject var371 = (SubLObject)NIL;
        SubLObject var372 = (SubLObject)NIL;
        SubLObject var373 = (SubLObject)NIL;
        final SubLObject var374 = Sequences.cconcatenate(var368, var363);
        SubLObject var25_375;
        SubLObject var375;
        SubLObject var376;
        SubLObject var377;
        SubLObject var378;
        SubLObject var379;
        SubLObject var380;
        SubLObject var381;
        SubLObject var382;
        SubLObject var383;
        SubLObject var384;
        SubLObject var385;
        SubLObject var386;
        SubLObject var387;
        SubLObject var388;
        SubLObject var389;
        for (var375 = (var25_375 = Sequences.length(var355)), var376 = (SubLObject)NIL, var376 = (SubLObject)ZERO_INTEGER; !var376.numGE(var25_375); var376 = module0048.f_1X(var376)) {
            var377 = Strings.sublisp_char(var355, var376);
            if (NIL != var373) {
                var373 = (SubLObject)NIL;
                var371 = (SubLObject)ConsesLow.cons(var377, var371);
            }
            else if (NIL != conses_high.member(var377, var367, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var373 = (SubLObject)T;
                var371 = (SubLObject)ConsesLow.cons(var377, var371);
            }
            else {
                var378 = var364;
                var379 = (SubLObject)NIL;
                var379 = var378.first();
                while (NIL != var378) {
                    var380 = f2636(var379.first());
                    var381 = f2637(conses_high.second(var379));
                    if (var377.eql(var380)) {
                        var382 = (SubLObject)NIL;
                        var383 = (SubLObject)NIL;
                        var384 = (SubLObject)NIL;
                        var382 = module0048.f_1X(var376);
                        var383 = (SubLObject)NIL;
                        for (var384 = (SubLObject)NIL; NIL == var384 && NIL == module0035.f1995(var355, var382, (SubLObject)UNPROVIDED); var382 = module0048.f_1X(var382), var383 = var383, var384 = var384) {
                            var371 = (SubLObject)ConsesLow.cons(var377, var371);
                            var376 = var382;
                            var377 = Strings.sublisp_char(var355, var376);
                            if (NIL != var383) {
                                var383 = (SubLObject)NIL;
                            }
                            else if (var377.eql(var381)) {
                                var384 = (SubLObject)T;
                            }
                            else if (NIL != conses_high.member(var377, var367, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                var383 = (SubLObject)T;
                            }
                        }
                    }
                    var378 = var378.rest();
                    var379 = var378.first();
                }
                var385 = (SubLObject)NIL;
                if (NIL == var385) {
                    var386 = var374;
                    var387 = (SubLObject)NIL;
                    var387 = var386.first();
                    while (NIL == var385 && NIL != var386) {
                        var388 = f2870(var387);
                        var389 = Numbers.add(var376, var388);
                        if (var388.isPositive() && NIL != module0035.f2000(var355, var389, (SubLObject)UNPROVIDED) && NIL != f2871(var355, var387, var376)) {
                            var385 = (SubLObject)T;
                            var370 = f2856(Sequences.nreverse(var371));
                            if (NIL == var366 || NIL == f2608(var370)) {
                                var369 = (SubLObject)ConsesLow.cons(var370, var369);
                            }
                            var371 = (SubLObject)NIL;
                            if (NIL != var365 || NIL != conses_high.member(var387, var368, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                var369 = (SubLObject)ConsesLow.cons(module0006.f202(var387), var369);
                            }
                            var376 = module0048.f_1_(var389);
                            var377 = Strings.sublisp_char(var355, var376);
                            var372 = (SubLObject)T;
                        }
                        var386 = var386.rest();
                        var387 = var386.first();
                    }
                }
                if (NIL != var372) {
                    var372 = (SubLObject)NIL;
                }
                else {
                    var371 = (SubLObject)ConsesLow.cons(var377, var371);
                }
            }
        }
        var370 = f2856(Sequences.nreverse(var371));
        if (NIL == var366 || NIL == f2608(var370)) {
            var369 = (SubLObject)ConsesLow.cons(var370, var369);
        }
        if (NIL == var369 && NIL == var366) {
            var369 = (SubLObject)ConsesLow.list($g916$.getGlobalValue());
        }
        return Sequences.nreverse(var369);
    }
    
    public static SubLObject f2870(final SubLObject var385) {
        if (var385.isChar()) {
            return (SubLObject)ONE_INTEGER;
        }
        return Sequences.length(var385);
    }
    
    public static SubLObject f2871(final SubLObject var355, final SubLObject var385, final SubLObject var93) {
        if (var385.isChar()) {
            return Characters.charE(Strings.sublisp_char(var355, var93), var385);
        }
        return f2678(var355, var385, var93, (SubLObject)$ic110$);
    }
    
    public static SubLObject f2872(final SubLObject var9, SubLObject var386) {
        if (var386 == UNPROVIDED) {
            var386 = $g926$.getGlobalValue();
        }
        SubLObject var387 = (SubLObject)NIL;
        SubLObject var388 = (SubLObject)NIL;
        SubLObject var389 = (SubLObject)NIL;
        SubLObject var390 = (SubLObject)ZERO_INTEGER;
        SubLObject var391 = (SubLObject)NIL;
        SubLObject var392 = (SubLObject)NIL;
        SubLObject var393 = (SubLObject)NIL;
        SubLObject var25_393;
        SubLObject var394;
        SubLObject var395;
        SubLObject var396;
        for (var394 = (var25_393 = Sequences.length(var9)), var395 = (SubLObject)NIL, var395 = (SubLObject)ZERO_INTEGER; !var395.numGE(var25_393); var395 = module0048.f_1X(var395)) {
            var396 = Strings.sublisp_char(var9, var395);
            if (T.equal(var387)) {
                var391 = (SubLObject)ConsesLow.cons(var396, var391);
                var387 = (SubLObject)NIL;
            }
            else if (var396.eql((SubLObject)Characters.CHAR_backslash)) {
                var387 = (SubLObject)T;
            }
            else if (T.equal(var388)) {
                var391 = (SubLObject)ConsesLow.cons(var396, var391);
                if (var396.eql((SubLObject)Characters.CHAR_quotation)) {
                    var388 = (SubLObject)NIL;
                }
            }
            else if (var396.eql((SubLObject)Characters.CHAR_quotation)) {
                var391 = (SubLObject)ConsesLow.cons(var396, var391);
                var388 = (SubLObject)T;
            }
            else if (var396.eql((SubLObject)Characters.CHAR_lparen)) {
                var390 = Numbers.add(var390, (SubLObject)ONE_INTEGER);
                if (NIL != var391) {
                    var393 = module0035.f2487(var393, f2856(Sequences.nreverse(var391)));
                    var391 = (SubLObject)NIL;
                }
                var393 = (SubLObject)ConsesLow.cons((SubLObject)NIL, var393);
            }
            else if (var396.eql((SubLObject)Characters.CHAR_rparen)) {
                var390 = Numbers.subtract(var390, (SubLObject)ONE_INTEGER);
                if (ZERO_INTEGER.numG(var390)) {
                    var389 = (SubLObject)T;
                }
                if (NIL != var391) {
                    var393 = module0035.f2487(var393, f2856(Sequences.nreverse(var391)));
                    var391 = (SubLObject)NIL;
                }
                var393 = module0035.f2488(var393);
            }
            else if (NIL != module0004.f104(var396, var386, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                if (NIL != var391) {
                    var393 = module0035.f2487(var393, f2856(Sequences.nreverse(var391)));
                    var391 = (SubLObject)NIL;
                }
            }
            else {
                var391 = (SubLObject)ConsesLow.cons(var396, var391);
            }
        }
        if (NIL != var391) {
            var393 = module0035.f2487(var393, f2856(Sequences.nreverse(var391)));
            var391 = (SubLObject)NIL;
        }
        if (ZERO_INTEGER.numL(var390)) {
            var392 = (SubLObject)ConsesLow.cons((SubLObject)$ic111$, var392);
        }
        else if (NIL != var389 || ZERO_INTEGER.numG(var390)) {
            var392 = (SubLObject)ConsesLow.cons((SubLObject)$ic112$, var392);
        }
        if (NIL != var392) {
            return Values.values((SubLObject)NIL, var392);
        }
        return Values.values(Sequences.nreverse(var393.first()), (SubLObject)NIL);
    }
    
    public static SubLObject f2873(final SubLObject var9, SubLObject var77, SubLObject var61) {
        if (var77 == UNPROVIDED) {
            var77 = (SubLObject)ZERO_INTEGER;
        }
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)NIL;
        }
        SubLObject var78 = (SubLObject)NIL;
        SubLObject var79 = (SubLObject)ZERO_INTEGER;
        SubLObject var80 = (SubLObject)NIL;
        SubLObject var81 = (SubLObject)NIL;
        final SubLObject var82 = (NIL != var61) ? var61 : Sequences.length(var9);
        if (NIL == var78) {
            SubLObject var25_398;
            SubLObject var83;
            SubLObject var85;
            SubLObject var84;
            for (var25_398 = var82, var83 = (SubLObject)NIL, var83 = var77; NIL == var78 && !var83.numGE(var25_398); var83 = module0048.f_1X(var83)) {
                var84 = (var85 = Strings.sublisp_char(var9, var83));
                if (var85.eql((SubLObject)Characters.CHAR_lparen)) {
                    if (NIL == var80) {
                        var79 = Numbers.add(var79, (SubLObject)ONE_INTEGER);
                    }
                    var81 = (SubLObject)NIL;
                }
                else if (var85.eql((SubLObject)Characters.CHAR_rparen)) {
                    if (NIL == var80) {
                        if (var79.isPositive()) {
                            var79 = Numbers.subtract(var79, (SubLObject)ONE_INTEGER);
                        }
                        else {
                            var78 = (SubLObject)T;
                        }
                    }
                    var81 = (SubLObject)NIL;
                }
                else if (var85.eql((SubLObject)Characters.CHAR_quotation)) {
                    if (NIL == var81) {
                        var80 = (SubLObject)makeBoolean(NIL == var80);
                    }
                    var81 = (SubLObject)NIL;
                }
                else if (var85.eql((SubLObject)Characters.CHAR_backslash)) {
                    if (NIL != var81) {
                        var81 = (SubLObject)NIL;
                    }
                    else {
                        var81 = (SubLObject)T;
                    }
                }
                else {
                    var81 = (SubLObject)NIL;
                }
            }
        }
        if (!var79.isZero()) {
            var78 = (SubLObject)T;
        }
        return (SubLObject)makeBoolean(NIL == var78);
    }
    
    public static SubLObject f2874(final SubLObject var9, SubLObject var77, SubLObject var61) {
        if (var77 == UNPROVIDED) {
            var77 = (SubLObject)ZERO_INTEGER;
        }
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)NIL;
        }
        SubLObject var78 = (SubLObject)NIL;
        final SubLObject var79 = module0054.f3968();
        SubLObject var80 = (SubLObject)NIL;
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var25_401;
        SubLObject var82;
        SubLObject var83;
        SubLObject var85;
        SubLObject var84;
        for (var82 = (var25_401 = ((NIL != var61) ? var61 : Sequences.length(var9))), var83 = (SubLObject)NIL, var83 = var77; !var83.numGE(var25_401); var83 = module0048.f_1X(var83)) {
            var84 = (var85 = Strings.sublisp_char(var9, var83));
            if (var85.eql((SubLObject)Characters.CHAR_lparen)) {
                if (NIL == var80) {
                    module0054.f3973(var83, var79);
                }
                var81 = (SubLObject)NIL;
            }
            else if (var85.eql((SubLObject)Characters.CHAR_rparen)) {
                if (NIL == var80) {
                    if (NIL == module0054.f3970(var79)) {
                        module0054.f3974(var79);
                    }
                    else {
                        var78 = (SubLObject)ConsesLow.cons(var83, var78);
                    }
                }
                var81 = (SubLObject)NIL;
            }
            else if (var85.eql((SubLObject)Characters.CHAR_quotation)) {
                if (NIL == var81) {
                    var80 = (SubLObject)makeBoolean(NIL == var80);
                }
                var81 = (SubLObject)NIL;
            }
            else if (var85.eql((SubLObject)Characters.CHAR_backslash)) {
                if (NIL != var81) {
                    var81 = (SubLObject)NIL;
                }
                else {
                    var81 = (SubLObject)T;
                }
            }
            else {
                var81 = (SubLObject)NIL;
            }
        }
        while (NIL == module0054.f3970(var79)) {
            var78 = (SubLObject)ConsesLow.cons(module0054.f3974(var79), var78);
        }
        return Sequences.nreverse(var78);
    }
    
    public static SubLObject f2875(final SubLObject var9, SubLObject var77, SubLObject var61) {
        if (var77 == UNPROVIDED) {
            var77 = (SubLObject)ZERO_INTEGER;
        }
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)NIL;
        }
        final SubLObject var78 = f2874(var9, var77, var61);
        final SubLObject var79 = Strings.make_string(Sequences.length(var78), (SubLObject)UNPROVIDED);
        SubLObject var80 = (SubLObject)NIL;
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        var80 = var78;
        var81 = var80.first();
        for (var82 = (SubLObject)ZERO_INTEGER; NIL != var80; var80 = var80.rest(), var81 = var80.first(), var82 = Numbers.add((SubLObject)ONE_INTEGER, var82)) {
            Strings.set_char(var79, var82, Strings.sublisp_char(var9, var81));
        }
        return var79;
    }
    
    public static SubLObject f2876(final SubLObject var19) {
        if (var19.isString()) {
            final SubLObject var20 = f2642(var19);
            return (SubLObject)makeBoolean(var20.numGE((SubLObject)ZERO_INTEGER) && var20.numLE((SubLObject)$ic113$));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2877(final SubLObject var19) {
        if (!var19.isString()) {
            return (SubLObject)NIL;
        }
        final SubLObject var20 = f2738(var19, (SubLObject)$ic114$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == module0035.f1995(var20, (SubLObject)FOUR_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        SubLObject var21 = var20;
        SubLObject var22 = (SubLObject)NIL;
        var22 = var21.first();
        while (NIL != var21) {
            if (NIL == f2876(var22)) {
                return (SubLObject)NIL;
            }
            var21 = var21.rest();
            var22 = var21.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f2878(final SubLObject var407, final SubLObject var408) {
        final SubLObject var409 = f2738(var407, (SubLObject)$ic114$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var410 = f2738(var408, (SubLObject)$ic114$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == module0035.f1995(var409, (SubLObject)FOUR_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL == module0035.f1995(var410, (SubLObject)FOUR_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        SubLObject var411 = (SubLObject)NIL;
        SubLObject var412_413 = (SubLObject)NIL;
        SubLObject var412 = (SubLObject)NIL;
        SubLObject var415_416 = (SubLObject)NIL;
        var411 = var409;
        var412_413 = var411.first();
        var412 = var410;
        var415_416 = var412.first();
        while (NIL != var412 || NIL != var411) {
            if (NIL != f2644(var412_413, var415_416)) {
                return (SubLObject)T;
            }
            if (!var412_413.equal(var415_416)) {
                return (SubLObject)NIL;
            }
            var411 = var411.rest();
            var412_413 = var411.first();
            var412 = var412.rest();
            var415_416 = var412.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2879() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return $g929$.getDynamicValue(var2);
    }
    
    public static SubLObject f2880(SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)$ic115$;
        }
        final SubLThread var42 = SubLProcess.currentSubLThread();
        $g929$.setDynamicValue((SubLObject)((var41.isNumber() && var41.numG((SubLObject)ZERO_INTEGER) && var41.numLE((SubLObject)ONE_INTEGER)) ? var41 : $ic115$), var42);
        return $g929$.getDynamicValue(var42);
    }
    
    public static SubLObject f2881() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        if (NIL == var3) {
            SubLObject var4 = $g930$.getDynamicValue(var2);
            SubLObject var5 = (SubLObject)NIL;
            var5 = var4.first();
            while (NIL == var3 && NIL != var4) {
                if (NIL != Hashtables.gethash((SubLObject)$ic116$, var5, (SubLObject)UNPROVIDED)) {
                    Hashtables.sethash((SubLObject)$ic116$, var5, (SubLObject)NIL);
                    var3 = var5;
                }
                var4 = var4.rest();
                var5 = var4.first();
            }
        }
        if (NIL == var3) {
            final SubLObject var6 = Hashtables.make_hash_table((SubLObject)$ic117$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            $g930$.setDynamicValue((SubLObject)ConsesLow.cons(var6, $g930$.getDynamicValue(var2)), var2);
            var3 = var6;
        }
        return var3;
    }
    
    public static SubLObject f2882(final SubLObject var417) {
        if (var417.isHashtable()) {
            Hashtables.clrhash(var417);
            Hashtables.sethash((SubLObject)$ic116$, var417, (SubLObject)T);
            return var417;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2883(final SubLObject var9) {
        final SubLObject var10 = Sequences.length(var9);
        if (var10.numLE((SubLObject)TWO_INTEGER)) {
            return (SubLObject)ZERO_INTEGER;
        }
        if (Sequences.subseq(var9, Numbers.subtract(var10, (SubLObject)TWO_INTEGER), var10).equalp((SubLObject)$ic118$)) {
            return (SubLObject)TWO_INTEGER;
        }
        if (Sequences.subseq(var9, Numbers.subtract(var10, (SubLObject)ONE_INTEGER), var10).equalp((SubLObject)$ic119$)) {
            return (SubLObject)ONE_INTEGER;
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f2884(final SubLObject var418, final SubLObject var417) {
        SubLObject var419 = Hashtables.gethash(var418, var417, (SubLObject)UNPROVIDED);
        if (var419.isInteger()) {
            var419 = Numbers.add(var419, (SubLObject)ONE_INTEGER);
        }
        else {
            var419 = (SubLObject)ONE_INTEGER;
        }
        Hashtables.sethash(var418, var417, var419);
        return var418;
    }
    
    public static SubLObject f2885(final SubLObject var420, final SubLObject var421, final SubLObject var422) {
        return Numbers.add(var420, Numbers.multiply((SubLObject)$ic15$, var421), Numbers.multiply((SubLObject)$ic120$, var422));
    }
    
    public static SubLObject f2886(final SubLObject var62, final SubLObject var63, SubLObject var423, SubLObject var424) {
        if (var423 == UNPROVIDED) {
            var423 = (SubLObject)NIL;
        }
        if (var424 == UNPROVIDED) {
            var424 = f2879();
        }
        if (!var62.isString() || !var63.isString()) {
            return (SubLObject)NIL;
        }
        if (!var424.isNumber()) {
            f2880((SubLObject)UNPROVIDED);
        }
        final SubLObject var425 = f2881();
        final SubLObject var426 = Numbers.subtract(Sequences.length(var62), f2883(var62));
        final SubLObject var427 = Numbers.subtract(Sequences.length(var63), f2883(var63));
        SubLObject var428 = (SubLObject)ZERO_INTEGER;
        SubLObject var429 = (SubLObject)ZERO_INTEGER;
        SubLObject var430 = (SubLObject)ZERO_INTEGER;
        SubLObject var431 = (SubLObject)ZERO_INTEGER;
        SubLObject var432 = (SubLObject)ZERO_INTEGER;
        SubLObject var433 = (SubLObject)ZERO_INTEGER;
        SubLObject var434 = (SubLObject)ZERO_INTEGER;
        SubLObject var435;
        SubLObject var436;
        SubLObject var437;
        for (var435 = (SubLObject)NIL, var435 = (SubLObject)ZERO_INTEGER; var435.numL(var426); var435 = Numbers.add(var435, (SubLObject)ONE_INTEGER)) {
            var436 = ((NIL != var423) ? Strings.sublisp_char(var62, var435) : Characters.char_downcase(Strings.sublisp_char(var62, var435)));
            if (NIL != Characters.alphanumericp(var436)) {
                var437 = var431;
                if (var437.eql((SubLObject)ZERO_INTEGER)) {
                    var432 = Characters.char_code(var436);
                    var431 = Numbers.add(var431, (SubLObject)ONE_INTEGER);
                }
                else if (var437.eql((SubLObject)ONE_INTEGER)) {
                    var433 = Characters.char_code(var436);
                    var431 = Numbers.add(var431, (SubLObject)ONE_INTEGER);
                }
                else if (var437.eql((SubLObject)TWO_INTEGER)) {
                    var434 = Characters.char_code(var436);
                    f2884(f2885(var432, var433, var434), var425);
                    var428 = Numbers.add(var428, (SubLObject)ONE_INTEGER);
                    var431 = Numbers.add(var431, (SubLObject)ONE_INTEGER);
                }
                else {
                    var432 = var433;
                    var433 = var434;
                    var434 = Characters.char_code(var436);
                    f2884(f2885(var432, var433, var434), var425);
                    var428 = Numbers.add(var428, (SubLObject)ONE_INTEGER);
                    var431 = Numbers.add(var431, (SubLObject)ONE_INTEGER);
                }
            }
        }
        if (var431.numGE((SubLObject)ZERO_INTEGER) && var431.numL((SubLObject)THREE_INTEGER)) {
            f2884(f2885(var432, var433, var434), var425);
            var428 = Numbers.add(var428, (SubLObject)ONE_INTEGER);
        }
        var431 = (SubLObject)ZERO_INTEGER;
        var432 = (SubLObject)ZERO_INTEGER;
        var433 = (SubLObject)ZERO_INTEGER;
        var434 = (SubLObject)ZERO_INTEGER;
        SubLObject var438;
        SubLObject var439;
        for (var435 = (SubLObject)NIL, var435 = (SubLObject)ZERO_INTEGER; var435.numL(var427); var435 = Numbers.add(var435, (SubLObject)ONE_INTEGER)) {
            var436 = ((NIL != var423) ? Strings.sublisp_char(var63, var435) : Characters.char_downcase(Strings.sublisp_char(var63, var435)));
            if (NIL != Characters.alphanumericp(var436)) {
                var437 = var431;
                if (var437.eql((SubLObject)ZERO_INTEGER)) {
                    var432 = Characters.char_code(var436);
                    var431 = Numbers.add(var431, (SubLObject)ONE_INTEGER);
                }
                else if (var437.eql((SubLObject)ONE_INTEGER)) {
                    var433 = Characters.char_code(var436);
                    var431 = Numbers.add(var431, (SubLObject)ONE_INTEGER);
                }
                else if (var437.eql((SubLObject)TWO_INTEGER)) {
                    var434 = Characters.char_code(var436);
                    var438 = f2885(var432, var433, var434);
                    var439 = Hashtables.gethash(var438, var425, (SubLObject)UNPROVIDED);
                    if (var439.isInteger() && var439.numG((SubLObject)ZERO_INTEGER)) {
                        var430 = Numbers.add(var430, (SubLObject)ONE_INTEGER);
                        Hashtables.sethash(var438, var425, Numbers.subtract(var439, (SubLObject)ONE_INTEGER));
                    }
                    var429 = Numbers.add(var429, (SubLObject)ONE_INTEGER);
                    var431 = Numbers.add(var431, (SubLObject)ONE_INTEGER);
                }
                else {
                    var432 = var433;
                    var433 = var434;
                    var434 = Characters.char_code(var436);
                    var438 = f2885(var432, var433, var434);
                    var439 = Hashtables.gethash(var438, var425, (SubLObject)UNPROVIDED);
                    if (var439.isInteger() && var439.numG((SubLObject)ZERO_INTEGER)) {
                        var430 = Numbers.add(var430, (SubLObject)ONE_INTEGER);
                        Hashtables.sethash(var438, var425, Numbers.subtract(var439, (SubLObject)ONE_INTEGER));
                    }
                    var429 = Numbers.add(var429, (SubLObject)ONE_INTEGER);
                    var431 = Numbers.add(var431, (SubLObject)ONE_INTEGER);
                }
            }
        }
        if (var431.numGE((SubLObject)ZERO_INTEGER) && var431.numL((SubLObject)THREE_INTEGER)) {
            final SubLObject var440 = f2885(var432, var433, var434);
            final SubLObject var441 = Hashtables.gethash(var440, var425, (SubLObject)UNPROVIDED);
            if (var441.isInteger() && var441.numG((SubLObject)ZERO_INTEGER)) {
                var430 = Numbers.add(var430, (SubLObject)ONE_INTEGER);
                Hashtables.sethash(var440, var425, Numbers.subtract(var441, (SubLObject)ONE_INTEGER));
            }
            var429 = Numbers.add(var429, (SubLObject)ONE_INTEGER);
        }
        f2882(var425);
        return (SubLObject)makeBoolean(var428.numG((SubLObject)ZERO_INTEGER) && var429.numG((SubLObject)ZERO_INTEGER) && Numbers.divide(var430, var428).numGE(var424) && Numbers.divide(var430, var429).numGE(var424));
    }
    
    public static SubLObject f2887(final SubLObject var431, SubLObject var432, SubLObject var433) {
        if (var432 == UNPROVIDED) {
            var432 = (SubLObject)$ic19$;
        }
        if (var433 == UNPROVIDED) {
            var433 = var432;
        }
        return f2888(var431, Symbols.symbol_function((SubLObject)$ic121$), var432, var433);
    }
    
    public static SubLObject f2889(final SubLObject var35) {
        if (NIL != module0167.f10813(var35)) {
            return f2638(module0172.f10915(var35));
        }
        if (NIL != constant_handles_oc.f8449(var35)) {
            return constants_high_oc.f10743(var35);
        }
        return f2638(var35);
    }
    
    public static SubLObject f2888(final SubLObject var131, SubLObject var434, SubLObject var432, SubLObject var433) {
        if (var434 == UNPROVIDED) {
            var434 = Symbols.symbol_function((SubLObject)$ic122$);
        }
        if (var432 == UNPROVIDED) {
            var432 = (SubLObject)$ic19$;
        }
        if (var433 == UNPROVIDED) {
            var433 = var432;
        }
        if (NIL == var131) {
            return $g916$.getGlobalValue();
        }
        if (NIL != module0035.f1997(var131)) {
            return f2890(Functions.funcall(var434, var131.first()));
        }
        final SubLObject var435 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic122$), Mapping.mapcar(var434, Sequences.reverse(var131)));
        SubLObject var436 = Sequences.cconcatenate(conses_high.second(var435), new SubLObject[] { var433, var435.first() });
        SubLObject var437 = conses_high.cddr(var435);
        SubLObject var438 = (SubLObject)NIL;
        var438 = var437.first();
        while (NIL != var437) {
            var436 = Sequences.cconcatenate(var438, new SubLObject[] { var432, var436 });
            var437 = var437.rest();
            var438 = var437.first();
        }
        return PrintLow.format((SubLObject)NIL, var436);
    }
    
    public static SubLObject f2890(final SubLObject var19) {
        if (var19.isString()) {
            return var19;
        }
        if (NIL != constant_handles_oc.f8449(var19)) {
            return constants_high_oc.f10743(var19);
        }
        return f2638(var19);
    }
    
    public static SubLObject f2891(final SubLObject var292, final SubLObject var437, SubLObject var438, SubLObject var344) {
        if (var438 == UNPROVIDED) {
            var438 = $g916$.getGlobalValue();
        }
        if (var344 == UNPROVIDED) {
            var344 = (SubLObject)$ic123$;
        }
        if (NIL != f2608(var437)) {
            return var292;
        }
        return Sequences.cconcatenate(var437, new SubLObject[] { var344, var438, var292 });
    }
    
    public static SubLObject f2892(final SubLObject var439, final SubLObject var44) {
        compatibility.default_struct_print_function(var439, var44, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2893(final SubLObject var439) {
        return (SubLObject)((var439.getClass() == $sX3956_native.class) ? T : NIL);
    }
    
    public static SubLObject f2894(final SubLObject var439) {
        assert NIL != f2893(var439) : var439;
        return var439.getField2();
    }
    
    public static SubLObject f2895(final SubLObject var439) {
        assert NIL != f2893(var439) : var439;
        return var439.getField3();
    }
    
    public static SubLObject f2896(final SubLObject var439) {
        assert NIL != f2893(var439) : var439;
        return var439.getField4();
    }
    
    public static SubLObject f2897(final SubLObject var439) {
        assert NIL != f2893(var439) : var439;
        return var439.getField5();
    }
    
    public static SubLObject f2898(final SubLObject var439) {
        assert NIL != f2893(var439) : var439;
        return var439.getField6();
    }
    
    public static SubLObject f2899(final SubLObject var439) {
        assert NIL != f2893(var439) : var439;
        return var439.getField7();
    }
    
    public static SubLObject f2900(final SubLObject var439) {
        assert NIL != f2893(var439) : var439;
        return var439.getField8();
    }
    
    public static SubLObject f2901(final SubLObject var439) {
        assert NIL != f2893(var439) : var439;
        return var439.getField9();
    }
    
    public static SubLObject f2902(final SubLObject var439) {
        assert NIL != f2893(var439) : var439;
        return var439.getField10();
    }
    
    public static SubLObject f2903(final SubLObject var439) {
        assert NIL != f2893(var439) : var439;
        return var439.getField11();
    }
    
    public static SubLObject f2904(final SubLObject var439) {
        assert NIL != f2893(var439) : var439;
        return var439.getField12();
    }
    
    public static SubLObject f2905(final SubLObject var439) {
        assert NIL != f2893(var439) : var439;
        return var439.getField13();
    }
    
    public static SubLObject f2906(final SubLObject var439, final SubLObject var440) {
        assert NIL != f2893(var439) : var439;
        return var439.setField2(var440);
    }
    
    public static SubLObject f2907(final SubLObject var439, final SubLObject var440) {
        assert NIL != f2893(var439) : var439;
        return var439.setField3(var440);
    }
    
    public static SubLObject f2908(final SubLObject var439, final SubLObject var440) {
        assert NIL != f2893(var439) : var439;
        return var439.setField4(var440);
    }
    
    public static SubLObject f2909(final SubLObject var439, final SubLObject var440) {
        assert NIL != f2893(var439) : var439;
        return var439.setField5(var440);
    }
    
    public static SubLObject f2910(final SubLObject var439, final SubLObject var440) {
        assert NIL != f2893(var439) : var439;
        return var439.setField6(var440);
    }
    
    public static SubLObject f2911(final SubLObject var439, final SubLObject var440) {
        assert NIL != f2893(var439) : var439;
        return var439.setField7(var440);
    }
    
    public static SubLObject f2912(final SubLObject var439, final SubLObject var440) {
        assert NIL != f2893(var439) : var439;
        return var439.setField8(var440);
    }
    
    public static SubLObject f2913(final SubLObject var439, final SubLObject var440) {
        assert NIL != f2893(var439) : var439;
        return var439.setField9(var440);
    }
    
    public static SubLObject f2914(final SubLObject var439, final SubLObject var440) {
        assert NIL != f2893(var439) : var439;
        return var439.setField10(var440);
    }
    
    public static SubLObject f2915(final SubLObject var439, final SubLObject var440) {
        assert NIL != f2893(var439) : var439;
        return var439.setField11(var440);
    }
    
    public static SubLObject f2916(final SubLObject var439, final SubLObject var440) {
        assert NIL != f2893(var439) : var439;
        return var439.setField12(var440);
    }
    
    public static SubLObject f2917(final SubLObject var439, final SubLObject var440) {
        assert NIL != f2893(var439) : var439;
        return var439.setField13(var440);
    }
    
    public static SubLObject f2918(SubLObject var441) {
        if (var441 == UNPROVIDED) {
            var441 = (SubLObject)NIL;
        }
        final SubLObject var442 = (SubLObject)new $sX3956_native();
        SubLObject var443;
        SubLObject var444;
        SubLObject var445;
        SubLObject var446;
        for (var443 = (SubLObject)NIL, var443 = var441; NIL != var443; var443 = conses_high.cddr(var443)) {
            var444 = var443.first();
            var445 = conses_high.cadr(var443);
            var446 = var444;
            if (var446.eql((SubLObject)$ic160$)) {
                f2906(var442, var445);
            }
            else if (var446.eql((SubLObject)$ic161$)) {
                f2907(var442, var445);
            }
            else if (var446.eql((SubLObject)$ic162$)) {
                f2908(var442, var445);
            }
            else if (var446.eql((SubLObject)$ic163$)) {
                f2909(var442, var445);
            }
            else if (var446.eql((SubLObject)$ic164$)) {
                f2910(var442, var445);
            }
            else if (var446.eql((SubLObject)$ic165$)) {
                f2911(var442, var445);
            }
            else if (var446.eql((SubLObject)$ic166$)) {
                f2912(var442, var445);
            }
            else if (var446.eql((SubLObject)$ic167$)) {
                f2913(var442, var445);
            }
            else if (var446.eql((SubLObject)$ic168$)) {
                f2914(var442, var445);
            }
            else if (var446.eql((SubLObject)$ic169$)) {
                f2915(var442, var445);
            }
            else if (var446.eql((SubLObject)$ic170$)) {
                f2916(var442, var445);
            }
            else if (var446.eql((SubLObject)$ic171$)) {
                f2917(var442, var445);
            }
            else {
                Errors.error((SubLObject)$ic172$, var444);
            }
        }
        return var442;
    }
    
    public static SubLObject f2919(final SubLObject var446, final SubLObject var447) {
        Functions.funcall(var447, var446, (SubLObject)$ic173$, (SubLObject)$ic174$, (SubLObject)TWELVE_INTEGER);
        Functions.funcall(var447, var446, (SubLObject)$ic175$, (SubLObject)$ic160$, f2894(var446));
        Functions.funcall(var447, var446, (SubLObject)$ic175$, (SubLObject)$ic161$, f2895(var446));
        Functions.funcall(var447, var446, (SubLObject)$ic175$, (SubLObject)$ic162$, f2896(var446));
        Functions.funcall(var447, var446, (SubLObject)$ic175$, (SubLObject)$ic163$, f2897(var446));
        Functions.funcall(var447, var446, (SubLObject)$ic175$, (SubLObject)$ic164$, f2898(var446));
        Functions.funcall(var447, var446, (SubLObject)$ic175$, (SubLObject)$ic165$, f2899(var446));
        Functions.funcall(var447, var446, (SubLObject)$ic175$, (SubLObject)$ic166$, f2900(var446));
        Functions.funcall(var447, var446, (SubLObject)$ic175$, (SubLObject)$ic167$, f2901(var446));
        Functions.funcall(var447, var446, (SubLObject)$ic175$, (SubLObject)$ic168$, f2902(var446));
        Functions.funcall(var447, var446, (SubLObject)$ic175$, (SubLObject)$ic169$, f2903(var446));
        Functions.funcall(var447, var446, (SubLObject)$ic175$, (SubLObject)$ic170$, f2904(var446));
        Functions.funcall(var447, var446, (SubLObject)$ic175$, (SubLObject)$ic171$, f2905(var446));
        Functions.funcall(var447, var446, (SubLObject)$ic176$, (SubLObject)$ic174$, (SubLObject)TWELVE_INTEGER);
        return var446;
    }
    
    public static SubLObject f2920(final SubLObject var446, final SubLObject var447) {
        return f2919(var446, var447);
    }
    
    public static SubLObject f2921() {
        final SubLObject var448 = f2918((SubLObject)UNPROVIDED);
        f2906(var448, (SubLObject)NIL);
        f2907(var448, (SubLObject)NIL);
        f2908(var448, (SubLObject)NIL);
        f2909(var448, (SubLObject)NIL);
        f2910(var448, (SubLObject)NIL);
        f2911(var448, (SubLObject)NIL);
        f2912(var448, (SubLObject)NIL);
        f2913(var448, (SubLObject)NIL);
        f2914(var448, (SubLObject)NIL);
        f2915(var448, (SubLObject)NIL);
        f2916(var448, (SubLObject)NIL);
        f2917(var448, (SubLObject)ZERO_INTEGER);
        return var448;
    }
    
    public static SubLObject f2922(SubLObject var370, final SubLObject var448) {
        if (NIL == f2896(var448) && NIL == f2897(var448) && NIL == f2898(var448) && NIL == f2903(var448) && NIL == f2900(var448) && NIL != module0126.f8394(var370, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var449 = constants_high_oc.f10737(var370);
            if (NIL == conses_high.member(var449, f2895(var448), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                f2907(var448, (SubLObject)ConsesLow.cons(var449, f2895(var448)));
            }
            var370 = f2696(var370);
        }
        return Values.values(var370, var448);
    }
    
    public static SubLObject f2923(final SubLObject var448) {
        return (SubLObject)makeBoolean(NIL == f2896(var448) && NIL == f2899(var448));
    }
    
    public static SubLObject f2924(final SubLObject var359, final SubLObject var448) {
        return (SubLObject)makeBoolean(NIL != Characters.charE(var359, (SubLObject)Characters.CHAR_quotation) && NIL == f2899(var448));
    }
    
    public static SubLObject f2925(final SubLObject var359, final SubLObject var448) {
        return (SubLObject)makeBoolean(NIL != f2923(var448) && NIL != Characters.charE(var359, (SubLObject)Characters.CHAR_lparen));
    }
    
    public static SubLObject f2926(final SubLObject var359, final SubLObject var448) {
        return (SubLObject)makeBoolean(NIL != f2923(var448) && NIL != Characters.charE(var359, (SubLObject)Characters.CHAR_rparen));
    }
    
    public static SubLObject f2927(final SubLObject var9, final SubLObject var448) {
        f2906(var448, (SubLObject)ConsesLow.cons(var9, f2894(var448)));
        return var448;
    }
    
    public static SubLObject f2928(final SubLObject var370, final SubLObject var448) {
        final SubLThread var449 = SubLProcess.currentSubLThread();
        if (NIL != f2904(var448) && NIL == f2896(var448) && NIL == f2900(var448) && NIL == f2903(var448)) {
            if (NIL != module0004.f104(var370, $g932$.getDynamicValue(var449), (SubLObject)EQUAL, (SubLObject)UNPROVIDED)) {
                f2912(var448, (SubLObject)T);
                f2917(var448, (SubLObject)ONE_INTEGER);
            }
            if (NIL != module0004.f104(var370, $g931$.getDynamicValue(var449), (SubLObject)EQUAL, (SubLObject)UNPROVIDED)) {
                f2913(var448, (SubLObject)T);
                f2917(var448, (SubLObject)ONE_INTEGER);
                f2914(var448, (SubLObject)NIL);
                f2915(var448, (SubLObject)NIL);
            }
        }
        return var448;
    }
    
    public static SubLObject f2929(SubLObject var448, final SubLObject var355, final SubLObject var449) {
        final SubLThread var450 = SubLProcess.currentSubLThread();
        SubLObject var451 = f2623(var355, var449, (SubLObject)UNPROVIDED);
        var450.resetMultipleValues();
        final SubLObject var450_451 = f2922(var451, var448);
        final SubLObject var452_453 = var450.secondMultipleValue();
        var450.resetMultipleValues();
        var451 = var450_451;
        var448 = var452_453;
        f2910(var448, (SubLObject)NIL);
        f2927(var451, var448);
        return var448;
    }
    
    public static SubLObject f2930(final SubLObject var448) {
        f2917(var448, Numbers.add(f2905(var448), (SubLObject)ONE_INTEGER));
        f2916(var448, (SubLObject)T);
        if (NIL != f2901(var448) && f2905(var448).numE((SubLObject)TWO_INTEGER)) {
            if (NIL == f2902(var448)) {}
            f2914(var448, (SubLObject)T);
        }
        return var448;
    }
    
    public static SubLObject f2931(final SubLObject var448) {
        f2916(var448, (SubLObject)NIL);
        f2917(var448, Numbers.subtract(f2905(var448), (SubLObject)ONE_INTEGER));
        if (NIL != f2900(var448) && f2905(var448).numE((SubLObject)ZERO_INTEGER)) {
            f2912(var448, (SubLObject)NIL);
        }
        if (NIL != f2901(var448)) {
            if (f2905(var448).numE((SubLObject)ZERO_INTEGER)) {
                f2913(var448, (SubLObject)NIL);
                f2914(var448, (SubLObject)NIL);
                f2915(var448, (SubLObject)NIL);
            }
            else if (f2905(var448).numE((SubLObject)ONE_INTEGER) && NIL != f2902(var448)) {
                f2914(var448, (SubLObject)NIL);
                f2915(var448, (SubLObject)T);
            }
        }
        return var448;
    }
    
    public static SubLObject f2932(SubLObject var448, final SubLObject var355, SubLObject var449, final SubLObject var376, final SubLObject var359) {
        final SubLThread var450 = SubLProcess.currentSubLThread();
        SubLObject var451 = f2623(var355, var449, var376);
        var450.resetMultipleValues();
        final SubLObject var454_455 = f2922(var451, var448);
        final SubLObject var456_457 = var450.secondMultipleValue();
        var450.resetMultipleValues();
        var451 = var454_455;
        var448 = var456_457;
        var448 = f2928(var451, var448);
        if (NIL != f2924(var359, var448)) {
            f2908(var448, (SubLObject)makeBoolean(NIL == f2896(var448)));
        }
        if (NIL != f2925(var359, var448)) {
            var448 = f2930(var448);
        }
        if (NIL != f2926(var359, var448)) {
            var448 = f2931(var448);
        }
        if (NIL == Characters.charE(var359, module0201.f12538())) {
            f2909(var448, (SubLObject)NIL);
        }
        f2910(var448, (SubLObject)NIL);
        var451 = Sequences.cconcatenate(var451, f2638(var359));
        f2927(var451, var448);
        var449 = module0048.f_1X(var376);
        return Values.values(var448, var449);
    }
    
    public static SubLObject f2933(final SubLObject var355) {
        final SubLThread var356 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var355) : var355;
        final SubLObject var357 = module0048.f_1_(Sequences.length(var355));
        SubLObject var358 = (SubLObject)ZERO_INTEGER;
        SubLObject var359 = f2921();
        SubLObject var25_458;
        SubLObject var360;
        SubLObject var361;
        SubLObject var362;
        SubLObject var363;
        SubLObject var460_461;
        SubLObject var462_463;
        SubLObject var364;
        for (var360 = (var25_458 = Sequences.length(var355)), var361 = (SubLObject)NIL, var361 = (SubLObject)ZERO_INTEGER; !var361.numGE(var25_458); var361 = module0048.f_1X(var361)) {
            var362 = Strings.sublisp_char(var355, var361);
            var363 = Equality.eql(var361, var357);
            if (NIL != var363 || NIL == module0126.f8387(var362)) {
                if (NIL != module0126.f8387(var362)) {
                    var359 = f2929(var359, var355, var358);
                }
                else if (var361.numG(var358)) {
                    var356.resetMultipleValues();
                    var460_461 = f2932(var359, var355, var358, var361, var362);
                    var462_463 = var356.secondMultipleValue();
                    var356.resetMultipleValues();
                    var359 = var460_461;
                    var358 = var462_463;
                }
                else if (NIL != var363) {
                    f2927(f2638(var362), var359);
                    var358 = Numbers.add(var358, (SubLObject)ONE_INTEGER);
                }
                else if (NIL != Characters.charE(var362, (SubLObject)Characters.CHAR_hash) && NIL != Characters.charE(Strings.sublisp_char(var355, module0048.f_1X(var361)), constant_reader_oc.f8494())) {
                    f2910(var359, (SubLObject)T);
                    f2927(f2638(var362), var359);
                    var358 = Numbers.add(var358, (SubLObject)ONE_INTEGER);
                }
                else if (NIL != f2924(var362, var359)) {
                    if (NIL != f2896(var359)) {
                        var364 = f2623(var355, var358, var361);
                        f2908(var359, (SubLObject)NIL);
                        f2927(var364, var359);
                        var358 = var361;
                    }
                    else {
                        f2908(var359, (SubLObject)T);
                    }
                }
                else if (NIL != f2925(var362, var359)) {
                    var359 = f2930(var359);
                    f2927(f2638(var362), var359);
                    var358 = Numbers.add(var358, (SubLObject)ONE_INTEGER);
                }
                else if (NIL != f2926(var362, var359)) {
                    var359 = f2931(var359);
                    f2927(f2638(var362), var359);
                    var358 = Numbers.add(var358, (SubLObject)ONE_INTEGER);
                }
                else if (NIL != Characters.charE(var362, module0201.f12538())) {
                    f2909(var359, (SubLObject)T);
                }
                else {
                    f2927(f2638(var362), var359);
                    var358 = Numbers.add(var358, (SubLObject)ONE_INTEGER);
                }
                f2911(var359, (SubLObject)makeBoolean(NIL != module0004.f104(var362, $g933$.getDynamicValue(var356), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == f2899(var359)));
            }
        }
        return Values.values((NIL != f2894(var359)) ? Functions.apply(Symbols.symbol_function((SubLObject)$ic97$), Sequences.nreverse(f2894(var359))) : $g916$.getGlobalValue(), Sequences.nreverse(f2895(var359)));
    }
    
    public static SubLObject f2934(final SubLObject var9, SubLObject var464) {
        if (var464 == UNPROVIDED) {
            var464 = (SubLObject)NIL;
        }
        final SubLObject var465 = Sequences.length(var9);
        SubLObject var466 = (SubLObject)ZERO_INTEGER;
        SubLObject var467 = (SubLObject)NIL;
        SubLObject var468 = (SubLObject)NIL;
        SubLObject var469;
        SubLObject var470;
        SubLObject var471;
        SubLObject var472;
        SubLObject var473;
        SubLObject var474;
        SubLObject var475;
        for (var469 = (SubLObject)NIL, var469 = Sequences.position((SubLObject)Characters.CHAR_hash, var9, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY), var466, (SubLObject)UNPROVIDED); NIL != var469; var469 = Sequences.position((SubLObject)Characters.CHAR_hash, var9, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY), var466, (SubLObject)UNPROVIDED)) {
            var470 = Numbers.add(var469, (SubLObject)ONE_INTEGER);
            if (var470.numE(var465) || !Strings.sublisp_char(var9, var470).eql(constant_reader_oc.f8494())) {
                var466 = var470;
            }
            else {
                var471 = Numbers.add(var470, (SubLObject)ONE_INTEGER);
                var472 = module0035.position_if_not(Symbols.symbol_function((SubLObject)$ic101$), var9, Symbols.symbol_function((SubLObject)IDENTITY), var471, (SubLObject)UNPROVIDED);
                var473 = (SubLObject)NIL;
                var474 = (SubLObject)NIL;
                if (NIL == var472) {
                    var472 = var465;
                }
                var473 = Numbers.subtract(var472, (SubLObject)ONE_INTEGER);
                var474 = module0126.f8394(var9, var471, var472);
                if (NIL == var474 && NIL == var464) {
                    if (var473.numG(var471) && NIL != Characters.char_equal((SubLObject)Characters.CHAR_s, Strings.sublisp_char(var9, var473))) {
                        var474 = module0126.f8394(var9, var471, var473);
                        if (NIL != var474) {
                            var472 = var473;
                        }
                        else {
                            var473 = Numbers.subtract(var473, (SubLObject)ONE_INTEGER);
                            if (var473.numG(var471) && NIL != Characters.char_equal((SubLObject)Characters.CHAR_e, Strings.sublisp_char(var9, var473))) {
                                var474 = module0126.f8394(var9, var471, var473);
                                if (NIL != var474) {
                                    var472 = var473;
                                }
                            }
                        }
                    }
                    else if (var473.numG(var471) && NIL != Characters.char_equal((SubLObject)Characters.CHAR_question, Strings.sublisp_char(var9, var473))) {
                        var474 = module0126.f8394(var9, var471, var473);
                    }
                }
                if (NIL != var474) {
                    var475 = constants_high_oc.f10743(var474);
                    if (NIL == conses_high.member(var475, var467, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var467 = (SubLObject)ConsesLow.cons(var475, var467);
                    }
                }
                else {
                    var475 = f2623(var9, var471, var472);
                    if (NIL == conses_high.member(var475, var468, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var468 = (SubLObject)ConsesLow.cons(var475, var468);
                    }
                }
                var466 = var472;
            }
        }
        return Values.values(Sequences.nreverse(var467), Sequences.nreverse(var468));
    }
    
    public static SubLObject f2935(final SubLObject var9, SubLObject var474) {
        if (var474 == UNPROVIDED) {
            var474 = (SubLObject)NIL;
        }
        final SubLThread var475 = SubLProcess.currentSubLThread();
        var475.resetMultipleValues();
        final SubLObject var476 = f2934(var9, var474);
        final SubLObject var477 = var475.secondMultipleValue();
        var475.resetMultipleValues();
        return var477;
    }
    
    public static SubLObject f2936(final SubLObject var9, SubLObject var474) {
        if (var474 == UNPROVIDED) {
            var474 = (SubLObject)NIL;
        }
        return module0035.sublisp_boolean(f2935(var9, var474));
    }
    
    public static SubLObject f2937(final SubLObject var28) {
        if (var28.isChar()) {
            return (SubLObject)makeBoolean(NIL == f2760(var28) && NIL == Sequences.find(var28, (SubLObject)$ic179$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2938(final SubLObject var44, final SubLObject var477, SubLObject var283) {
        if (var283 == UNPROVIDED) {
            var283 = (SubLObject)$ic91$;
        }
        SubLThread var478;
        SubLObject var479;
        SubLObject var480;
        for (var478 = SubLProcess.currentSubLThread(), var479 = (SubLObject)ZERO_INTEGER, var480 = (SubLObject)NIL, var480 = streams_high.read_char(var44, (SubLObject)NIL, var283, (SubLObject)UNPROVIDED); !var479.eql($g935$.getDynamicValue(var478)) && !var480.eql(var283) && !var480.eql(var477); var479 = Numbers.add(var479, (SubLObject)ONE_INTEGER), var480 = streams_high.read_char(var44, (SubLObject)NIL, var283, (SubLObject)UNPROVIDED)) {
            Vectors.set_aref($g936$.getDynamicValue(var478), var479, var480);
        }
        if (var479.eql($g935$.getDynamicValue(var478))) {
            Errors.cerror((SubLObject)$ic181$, (SubLObject)$ic182$, $g935$.getDynamicValue(var478));
            return var283;
        }
        final SubLObject var481 = Strings.make_string(var479, (SubLObject)UNPROVIDED);
        SubLObject var482;
        for (var482 = (SubLObject)NIL, var482 = (SubLObject)ZERO_INTEGER; var482.numL(var479); var482 = Numbers.add(var482, (SubLObject)ONE_INTEGER)) {
            f2743(var482, var481, Vectors.aref($g936$.getDynamicValue(var478), var482), (SubLObject)UNPROVIDED);
        }
        if (NIL == f2608(var481)) {
            return var481;
        }
        if (var480.eql(var283)) {
            return var283;
        }
        return var481;
    }
    
    public static SubLObject f2939(SubLObject var9, final SubLObject var28, final SubLObject var479, final SubLObject var480, SubLObject var481) {
        if (var481 == UNPROVIDED) {
            var481 = (SubLObject)$ic19$;
        }
        final SubLObject var482 = f2702(var28, var9, (SubLObject)UNPROVIDED);
        final SubLObject var483 = Sequences.length(var9);
        final SubLObject var484 = Numbers.subtract(var479, var483);
        SubLObject var485;
        SubLObject var486;
        for (var485 = Numbers.min(var484, Numbers.subtract(var480, var482, (SubLObject)ONE_INTEGER)), var486 = (SubLObject)NIL, var486 = (SubLObject)ZERO_INTEGER; var486.numL(var485); var486 = Numbers.add(var486, (SubLObject)ONE_INTEGER)) {
            var9 = Sequences.cconcatenate(var481, var9);
        }
        for (var485 = Numbers.min(var484, Numbers.subtract(var479, Numbers.add(Numbers.subtract(var483, var482, (SubLObject)ONE_INTEGER), var480))), var486 = (SubLObject)NIL, var486 = (SubLObject)ZERO_INTEGER; var486.numL(var485); var486 = Numbers.add(var486, (SubLObject)ONE_INTEGER)) {
            var9 = Sequences.cconcatenate(var9, var481);
        }
        return var9;
    }
    
    public static SubLObject f2940(SubLObject var9, final SubLObject var479, SubLObject var481) {
        if (var481 == UNPROVIDED) {
            var481 = (SubLObject)$ic19$;
        }
        SubLObject var482;
        SubLObject var483;
        for (var482 = Numbers.subtract(var479, Sequences.length(var9)), var483 = (SubLObject)NIL, var483 = (SubLObject)ZERO_INTEGER; var483.numL(var482); var483 = Numbers.add(var483, (SubLObject)ONE_INTEGER)) {
            var9 = Sequences.cconcatenate(var481, var9);
        }
        return var9;
    }
    
    public static SubLObject f2941(SubLObject var9, final SubLObject var479, SubLObject var481) {
        if (var481 == UNPROVIDED) {
            var481 = (SubLObject)$ic19$;
        }
        SubLObject var482;
        SubLObject var483;
        for (var482 = Numbers.subtract(var479, Sequences.length(var9)), var483 = (SubLObject)NIL, var483 = (SubLObject)ZERO_INTEGER; var483.numL(var482); var483 = Numbers.add(var483, (SubLObject)ONE_INTEGER)) {
            var9 = Sequences.cconcatenate(var9, var481);
        }
        return var9;
    }
    
    public static SubLObject f2942(SubLObject var9, final SubLObject var479, SubLObject var481) {
        if (var481 == UNPROVIDED) {
            var481 = (SubLObject)$ic19$;
        }
        final SubLObject var482 = Sequences.length(var9);
        final SubLObject var483 = Numbers.truncate(Numbers.add((SubLObject)$ic183$, Numbers.divide(Numbers.subtract(var479, var482), (SubLObject)TWO_INTEGER)), (SubLObject)UNPROVIDED);
        final SubLObject var484 = Numbers.subtract(var479, var482, var483);
        SubLObject var485;
        for (var485 = (SubLObject)NIL, var485 = (SubLObject)ZERO_INTEGER; var485.numL(var483); var485 = Numbers.add(var485, (SubLObject)ONE_INTEGER)) {
            var9 = Sequences.cconcatenate(var481, var9);
        }
        for (var485 = (SubLObject)NIL, var485 = (SubLObject)ZERO_INTEGER; var485.numL(var484); var485 = Numbers.add(var485, (SubLObject)ONE_INTEGER)) {
            var9 = Sequences.cconcatenate(var9, var481);
        }
        return var9;
    }
    
    public static SubLObject f2943(final SubLObject var19) {
        if (var19.isString()) {
            return Sequences.length(var19);
        }
        return Sequences.length(PrintLow.format((SubLObject)NIL, (SubLObject)$ic184$, var19));
    }
    
    public static SubLObject f2944(final SubLObject var485, SubLObject var44, SubLObject var486, SubLObject var481, SubLObject var487) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)T;
        }
        if (var486 == UNPROVIDED) {
            var486 = (SubLObject)NIL;
        }
        if (var481 == UNPROVIDED) {
            var481 = (SubLObject)$ic19$;
        }
        if (var487 == UNPROVIDED) {
            var487 = (SubLObject)ONE_INTEGER;
        }
        if (NIL != var486) {
            PrintLow.format(var44, (SubLObject)$ic123$);
        }
        SubLObject var488;
        for (var488 = (SubLObject)NIL, var488 = (SubLObject)ZERO_INTEGER; var488.numL(var485); var488 = Numbers.add(var488, (SubLObject)ONE_INTEGER)) {
            if (Numbers.mod(var488, var487).eql((SubLObject)ZERO_INTEGER)) {
                PrintLow.format(var44, var481);
            }
            else {
                PrintLow.format(var44, (SubLObject)$ic19$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2945(final SubLObject var485, SubLObject var481) {
        if (var481 == UNPROVIDED) {
            var481 = (SubLObject)$ic19$;
        }
        SubLObject var486 = $g916$.getGlobalValue();
        SubLObject var487;
        for (var487 = (SubLObject)NIL, var487 = (SubLObject)ZERO_INTEGER; var487.numL(var485); var487 = Numbers.add(var487, (SubLObject)ONE_INTEGER)) {
            var486 = Sequences.cconcatenate(var486, var481);
        }
        return var486;
    }
    
    public static SubLObject f2946(SubLObject var9) {
        assert NIL != Types.stringp(var9) : var9;
        final SubLObject var10 = f2947(var9);
        if (!var10.numE(Sequences.length(var9))) {
            final SubLObject var11 = Strings.make_string(var10, (SubLObject)UNPROVIDED);
            SubLObject var12 = (SubLObject)$ic185$;
            SubLObject var13 = (SubLObject)ZERO_INTEGER;
            final SubLObject var14 = var9;
            SubLObject var25_489;
            SubLObject var15;
            SubLObject var16;
            SubLObject var17;
            SubLObject var18;
            for (var15 = (var25_489 = Sequences.length(var14)), var16 = (SubLObject)NIL, var16 = (SubLObject)ZERO_INTEGER; !var16.numGE(var25_489); var16 = module0048.f_1X(var16)) {
                var17 = Strings.sublisp_char(var14, var16);
                var18 = f2760(var17);
                if (var12 == $ic185$) {
                    if (NIL == var18) {
                        f2743(var13, var11, var17, (SubLObject)UNPROVIDED);
                        var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER);
                        var12 = (SubLObject)$ic186$;
                    }
                }
                else if (var12 == $ic186$) {
                    if (NIL != var18) {
                        var12 = (SubLObject)$ic187$;
                    }
                    else {
                        f2743(var13, var11, var17, (SubLObject)UNPROVIDED);
                        var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER);
                    }
                }
                else if (var12 == $ic187$) {
                    if (NIL != var18) {
                        var12 = (SubLObject)$ic188$;
                    }
                    else {
                        f2743(var13, var11, (SubLObject)Characters.CHAR_space, (SubLObject)UNPROVIDED);
                        var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER);
                        f2743(var13, var11, var17, (SubLObject)UNPROVIDED);
                        var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER);
                        var12 = (SubLObject)$ic186$;
                    }
                }
                else {
                    if (var12 != $ic188$) {
                        Errors.cerror((SubLObject)$ic189$, var12);
                        return var9;
                    }
                    if (NIL == var18) {
                        f2743(var13, var11, (SubLObject)Characters.CHAR_space, (SubLObject)UNPROVIDED);
                        var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER);
                        f2743(var13, var11, var17, (SubLObject)UNPROVIDED);
                        var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER);
                        var12 = (SubLObject)$ic186$;
                    }
                }
            }
            var9 = var11;
        }
        return var9;
    }
    
    public static SubLObject f2947(final SubLObject var9) {
        assert NIL != Types.stringp(var9) : var9;
        SubLObject var10 = (SubLObject)$ic185$;
        SubLObject var11 = (SubLObject)ZERO_INTEGER;
        SubLObject var25_492;
        SubLObject var12;
        SubLObject var13;
        SubLObject var14;
        SubLObject var15;
        for (var12 = (var25_492 = Sequences.length(var9)), var13 = (SubLObject)NIL, var13 = (SubLObject)ZERO_INTEGER; !var13.numGE(var25_492); var13 = module0048.f_1X(var13)) {
            var14 = Strings.sublisp_char(var9, var13);
            var15 = f2760(var14);
            if (var10 == $ic185$) {
                if (NIL != var15) {
                    var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER);
                }
                else {
                    var10 = (SubLObject)$ic186$;
                }
            }
            else if (var10 == $ic186$) {
                if (NIL != var15) {
                    var10 = (SubLObject)$ic187$;
                }
            }
            else if (var10 == $ic187$) {
                if (NIL != var15) {
                    var10 = (SubLObject)$ic190$;
                }
                else {
                    var10 = (SubLObject)$ic186$;
                }
            }
            else {
                if (var10 != $ic190$) {
                    Errors.cerror((SubLObject)$ic191$, var10);
                    return Sequences.length(var9);
                }
                var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER);
                if (NIL == var15) {
                    var10 = (SubLObject)$ic186$;
                }
            }
        }
        if (var10 == $ic187$) {
            var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER);
        }
        else if (var10 == $ic190$) {
            var11 = Numbers.add(var11, (SubLObject)TWO_INTEGER);
        }
        return Numbers.subtract(Sequences.length(var9), var11);
    }
    
    public static SubLObject f2948(final SubLObject var19) {
        return (SubLObject)makeBoolean(var19.isString() && NIL == f2949(var19));
    }
    
    public static SubLObject f2949(final SubLObject var9) {
        assert NIL != Types.stringp(var9) : var9;
        final SubLObject var10 = module0035.position_if_not(Symbols.symbol_function((SubLObject)$ic74$), var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var10) {
            return (SubLObject)NIL;
        }
        final SubLObject var11 = Sequences.position_if(Symbols.symbol_function((SubLObject)$ic74$), var9, Symbols.symbol_function((SubLObject)IDENTITY), var10, (SubLObject)UNPROVIDED);
        if (NIL == var11) {
            return (SubLObject)NIL;
        }
        return Types.integerp(module0035.position_if_not(Symbols.symbol_function((SubLObject)$ic74$), var9, Symbols.symbol_function((SubLObject)IDENTITY), var11, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f2950(final SubLObject var9) {
        if (NIL != f2949(var9)) {
            return Sequences.cconcatenate((SubLObject)$ic22$, new SubLObject[] { var9, $ic22$ });
        }
        return var9;
    }
    
    public static SubLObject f2951(final SubLObject var495, final SubLObject var496, final SubLObject var497, SubLObject var498, SubLObject var499) {
        if (var498 == UNPROVIDED) {
            var498 = (SubLObject)NIL;
        }
        if (var499 == UNPROVIDED) {
            var499 = (SubLObject)$ic192$;
        }
        assert NIL != module0004.f85(var497) : var497;
        assert NIL != module0004.f85(var496) : var496;
        assert NIL != module0004.f85(var499) : var499;
        SubLObject var500 = (SubLObject)NIL;
        try {
            var500 = compatibility.open_text(var495, (SubLObject)$ic194$);
            if (!var500.isStream()) {
                Errors.error((SubLObject)$ic195$, var495);
            }
            final SubLObject var501 = var500;
            if (!var501.isStream()) {
                Errors.error((SubLObject)$ic196$, var495);
            }
            SubLObject var502 = (SubLObject)NIL;
            try {
                if (var498.isString()) {
                    var502 = compatibility.open_text(var498, (SubLObject)$ic197$);
                }
                SubLObject var503 = (SubLObject)NIL;
                while (NIL == var503) {
                    SubLObject var504 = (SubLObject)NIL;
                    var504 = Functions.funcall(var496, var501);
                    if (var504 == $ic91$) {
                        var503 = (SubLObject)T;
                    }
                    else {
                        SubLObject var505 = (SubLObject)NIL;
                        var505 = Functions.funcall(var497, var504);
                        if (!var502.isStream()) {
                            continue;
                        }
                        Functions.funcall(var499, var505, var502);
                    }
                }
            }
            finally {
                final SubLObject var506 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    if (var502.isStream()) {
                        streams_high.close(var502, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var506);
                }
            }
        }
        finally {
            final SubLObject var507 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if (var500.isStream()) {
                    streams_high.close(var500, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var507);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2952(final SubLObject var495, final SubLObject var44, SubLObject var503, SubLObject var504) {
        if (var503 == UNPROVIDED) {
            var503 = (SubLObject)NIL;
        }
        if (var504 == UNPROVIDED) {
            var504 = (SubLObject)NIL;
        }
        final SubLThread var505 = SubLProcess.currentSubLThread();
        final SubLObject var506 = (SubLObject)((NIL != var503) ? $ic19$ : PrintLow.format((SubLObject)NIL, (SubLObject)$ic123$));
        SubLObject var507 = (SubLObject)NIL;
        SubLObject var508 = (SubLObject)NIL;
        SubLObject var506_507 = (SubLObject)NIL;
        try {
            var506_507 = compatibility.open_text(var495, (SubLObject)$ic194$);
            if (!var506_507.isStream()) {
                Errors.error((SubLObject)$ic195$, var495);
            }
            final SubLObject var509 = var506_507;
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var505) && !var509.isStream()) {
                Errors.error((SubLObject)$ic198$, var495);
            }
            if (NIL != module0004.f105(var504)) {
                SubLObject var510;
                for (var510 = (SubLObject)NIL, var510 = (SubLObject)ZERO_INTEGER; var510.numL(var504); var510 = Numbers.add(var510, (SubLObject)ONE_INTEGER)) {
                    if (NIL == var508) {
                        var507 = streams_high.read_line(var509, (SubLObject)NIL, (SubLObject)$ic91$, (SubLObject)UNPROVIDED);
                        if (var507 == $ic91$) {
                            var508 = (SubLObject)T;
                        }
                    }
                }
            }
            while (NIL == var508) {
                var507 = streams_high.read_line(var509, (SubLObject)NIL, (SubLObject)$ic91$, (SubLObject)UNPROVIDED);
                if (var507 == $ic91$) {
                    var508 = (SubLObject)T;
                }
                else {
                    print_high.princ(var507, var44);
                    print_high.princ(var506, var44);
                }
            }
        }
        finally {
            final SubLObject var511 = Threads.$is_thread_performing_cleanupP$.currentBinding(var505);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var505);
                if (var506_507.isStream()) {
                    streams_high.close(var506_507, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var511, var505);
            }
        }
        return var495;
    }
    
    public static SubLObject f2953(final SubLObject var495, SubLObject var503, SubLObject var504) {
        if (var503 == UNPROVIDED) {
            var503 = (SubLObject)NIL;
        }
        if (var504 == UNPROVIDED) {
            var504 = (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var495) : var495;
        SubLObject var505 = (SubLObject)NIL;
        SubLObject var506 = (SubLObject)NIL;
        try {
            var506 = streams_high.make_private_string_output_stream();
            f2952(var495, var506, var503, var504);
            var505 = streams_high.get_output_stream_string(var506);
        }
        finally {
            final SubLObject var507 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                streams_high.close(var506, (SubLObject)UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var507);
            }
        }
        return var505;
    }
    
    public static SubLObject f2954(final SubLObject var9, final SubLObject var235, SubLObject var53, SubLObject var509) {
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        if (var509 == UNPROVIDED) {
            var509 = (SubLObject)$ic199$;
        }
        return f2955(var9, module0078.f5367(var235, var53, (SubLObject)UNPROVIDED), var509);
    }
    
    public static SubLObject f2955(final SubLObject var9, final SubLObject var510, SubLObject var509) {
        if (var509 == UNPROVIDED) {
            var509 = (SubLObject)$ic199$;
        }
        SubLObject var511 = var9;
        for (SubLObject var512 = (SubLObject)ONE_INTEGER; NIL != module0077.f5320(var511, var510); var511 = Sequences.cconcatenate(var9, new SubLObject[] { var509, f2638(var512) })) {
            var512 = Numbers.add(var512, (SubLObject)ONE_INTEGER);
        }
        return var511;
    }
    
    public static SubLObject f2956(final SubLObject var9, final SubLObject var513) {
        return (NIL != var513) ? reader.read_from_string_ignoring_errors(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : var9;
    }
    
    public static SubLObject f2957(final SubLObject var38) {
        final SubLObject var39 = Strings.make_string(var38, (SubLObject)UNPROVIDED);
        SubLObject var40;
        for (var40 = (SubLObject)NIL, var40 = (SubLObject)ZERO_INTEGER; var40.numL(var38); var40 = Numbers.add(var40, (SubLObject)ONE_INTEGER)) {
            Vectors.set_aref(var39, var40, Characters.code_char(Numbers.add((SubLObject)$ic200$, random.random((SubLObject)$ic201$))));
        }
        return var39;
    }
    
    public static SubLObject f2958(final SubLObject var9) {
        return module0035.remove_if_not((SubLObject)$ic55$, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2959(final SubLObject var9) {
        return module0035.remove_if_not((SubLObject)$ic54$, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2960(final SubLObject var28) {
        return (SubLObject)makeBoolean(NIL != Characters.alphanumericp(var28) || var28.eql((SubLObject)Characters.CHAR_hyphen));
    }
    
    public static SubLObject f2961(final SubLObject var28) {
        return (SubLObject)makeBoolean(NIL != Characters.alpha_char_p(var28) || var28.eql((SubLObject)Characters.CHAR_underbar));
    }
    
    public static SubLObject f2962(final SubLObject var9) {
        return module0035.remove_if_not((SubLObject)$ic202$, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2963(final SubLObject var41) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        assert NIL != module0004.f106(var41) : var41;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var42) && !var41.numL((SubLObject)$ic201$)) {
            Errors.error((SubLObject)$ic203$, var41);
        }
        return Characters.code_char(Numbers.add(Characters.char_code((SubLObject)Characters.CHAR_a), var41));
    }
    
    public static SubLObject f2964(final SubLObject var41) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        assert NIL != module0004.f106(var41) : var41;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var42) && !var41.numL((SubLObject)$ic201$)) {
            Errors.error((SubLObject)$ic203$, var41);
        }
        return Characters.code_char(Numbers.add(Characters.char_code((SubLObject)Characters.CHAR_A), var41));
    }
    
    public static SubLObject f2965(final SubLObject var9) {
        if (var9.isString() && Sequences.length(var9).numG((SubLObject)ZERO_INTEGER)) {
            return Symbols.make_keyword(var9);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2966(final SubLObject var9) {
        final SubLObject var10 = Strings.string_upcase(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var11 = f2745(var10, (SubLObject)Characters.CHAR_hyphen, (SubLObject)$ic204$);
        return f2965(var11);
    }
    
    public static SubLObject f2967(final SubLObject var28) {
        return (SubLObject)makeBoolean(NIL == Characters.alphanumericp(var28));
    }
    
    public static SubLObject f2968(final SubLObject var516) {
        if (var516.isKeyword()) {
            return Symbols.symbol_name(var516);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2969(final SubLObject var19) {
        if (var19.isSymbol() && !var19.isKeyword()) {
            final SubLObject var20 = Symbols.symbol_name(var19);
            return (SubLObject)makeBoolean(ZERO_INTEGER.numL(Sequences.length(var20)) && NIL != Characters.charE((SubLObject)Characters.CHAR_colon, Strings.sublisp_char(var20, (SubLObject)ZERO_INTEGER)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2970(final SubLObject var517) {
        assert NIL != f2969(var517) : var517;
        final SubLObject var518 = Symbols.symbol_name(var517);
        return Symbols.make_keyword(f2623(var518, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f2971(final SubLObject var19) {
        if (var19.isKeyword()) {
            return var19;
        }
        if (var19.isString()) {
            return f2965(var19);
        }
        if (NIL != f2969(var19)) {
            return f2970(var19);
        }
        if (var19.isSymbol()) {
            return f2965(Symbols.symbol_name(var19));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2972(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)ZERO_INTEGER;
        SubLObject var13 = (SubLObject)NIL;
        while (NIL == var13) {
            var10.resetMultipleValues();
            final SubLObject var14 = reader.read_from_string_ignoring_errors(var9, (SubLObject)NIL, (SubLObject)$ic91$, var12, (SubLObject)UNPROVIDED);
            final SubLObject var15 = var10.secondMultipleValue();
            var10.resetMultipleValues();
            if (var14.eql((SubLObject)$ic91$)) {
                var13 = (SubLObject)T;
            }
            else {
                var11 = (SubLObject)ConsesLow.cons(var14, var11);
                var12 = var15;
            }
        }
        var11 = reader.bq_cons((SubLObject)$ic206$, ConsesLow.append(Sequences.nreverse(var11), (SubLObject)NIL));
        return var11;
    }
    
    public static SubLObject f2973(final SubLObject var523, final SubLObject var524) {
        SubLObject var525 = (SubLObject)ZERO_INTEGER;
        SubLObject var526 = (SubLObject)ZERO_INTEGER;
        for (SubLObject var527 = Numbers.add(Numbers.max(Sequences.length(var523), Sequences.length(var524)), (SubLObject)ONE_INTEGER), var528 = (SubLObject)ZERO_INTEGER, var529 = (SubLObject)NIL; NIL == var529; var529 = Numbers.numL(var527, var528)) {
            final SubLObject var530 = Sequences.position_if((SubLObject)$ic54$, var523, (SubLObject)IDENTITY, var525, (SubLObject)UNPROVIDED);
            final SubLObject var531 = Sequences.position_if((SubLObject)$ic54$, var524, (SubLObject)IDENTITY, var526, (SubLObject)UNPROVIDED);
            if (NIL == var530 && NIL == var531) {
                return (SubLObject)T;
            }
            if (NIL == var530 || NIL == var531) {
                return (SubLObject)NIL;
            }
            if (NIL == Characters.char_equal(Strings.sublisp_char(var523, var530), Strings.sublisp_char(var524, var531))) {
                return (SubLObject)NIL;
            }
            var528 = Numbers.add(var528, (SubLObject)ONE_INTEGER);
            var525 = Numbers.add(var530, (SubLObject)ONE_INTEGER);
            var526 = Numbers.add(var531, (SubLObject)ONE_INTEGER);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2974(final SubLObject var40) {
        SubLObject var41 = (SubLObject)NIL;
        SubLObject var42 = (SubLObject)NIL;
        try {
            var42 = streams_high.make_private_string_output_stream();
            final SubLObject var43 = var40.first();
            PrintLow.format(var42, (SubLObject)$ic184$, var43);
            SubLObject var44 = var40.rest();
            SubLObject var45 = (SubLObject)NIL;
            var45 = var44.first();
            while (NIL != var44) {
                PrintLow.format(var42, (SubLObject)$ic207$, var45);
                var44 = var44.rest();
                var45 = var44.first();
            }
            var41 = streams_high.get_output_stream_string(var42);
        }
        finally {
            final SubLObject var46 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                streams_high.close(var42, (SubLObject)UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var46);
            }
        }
        return var41;
    }
    
    public static SubLObject f2975() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2606", "S#3960", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0038", "f2607", "S#3961");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2608", "S#3962", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2609", "S#3963", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2610", "S#3964", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2611", "S#3965", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2612", "S#3966", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2613", "S#3967", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2614", "S#3298", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2615", "S#3968", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2616", "S#3969", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2617", "S#3970", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2618", "OBJECT-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2619", "S#3971", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2620", "S#3972", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2624", "S#746", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2625", "S#3973", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2626", "S#3974", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2628", "S#3295", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2630", "S#3975", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2631", "S#3976", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2632", "S#3977", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2627", "S#3978", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2635", "S#3979", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2638", "S#3851", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2639", "PRINTED-FORMS-EQUAL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2640", "S#3980", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2641", "S#3981", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2642", "S#3982", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2643", "S#3983", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2644", "S#3984", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2645", "S#3985", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2646", "S#3986", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2647", "S#3987", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2648", "S#3988", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2649", "S#3989", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2650", "S#3990", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2636", "FIRST-CHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2651", "S#3991", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2652", "S#3992", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2637", "S#3993", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2655", "S#3994", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2656", "S#3995", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2657", "S#3996", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2658", "S#3997", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2659", "STRING-SUBSTITUTE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2660", "S#3998", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2663", "S#3999", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2664", "S#4000", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2665", "S#4001", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2666", "S#4002", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2667", "S#4003", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2669", "S#4004", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2670", "S#4005", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2671", "S#4006", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2672", "S#4007", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2634", "S#4008", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2633", "S#4009", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2621", "S#2681", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2674", "S#4010", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2623", "S#368", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2629", "S#4011", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2676", "S#4012", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2662", "S#4013", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2673", "ENDS-WITH", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2679", "S#4014", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2680", "S#4015", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2682", "S#4016", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2683", "S#4017", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2684", "STARTS-WITH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2685", "S#4018", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2675", "S#4019", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2686", "S#4020", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2687", "S#4021", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2688", "S#4022", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2690", "S#4023", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2691", "S#4024", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2693", "S#4025", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2694", "S#4026", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2695", "S#4027", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2696", "S#4028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2697", "S#4029", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2698", "S#4030", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2700", "S#4031", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2701", "S#4032", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2702", "S#4033", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2622", "S#1768", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2703", "S#4034", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2704", "S#4035", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2705", "S#4036", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2707", "S#4037", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2706", "S#4038", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2708", "S#4039", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2709", "S#4040", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2654", "S#817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2677", "S#4041", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2710", "S#4042", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2711", "S#4043", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2692", "S#4044", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2712", "S#4045", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2713", "S#4046", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2714", "S#4047", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2715", "S#4048", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2716", "S#4049", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2653", "NON-EMPTY-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2718", "S#4050", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2717", "S#4051", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2719", "S#4052", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2720", "S#4053", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2721", "S#4054", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2722", "S#4055", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2723", "S#4056", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2724", "S#4057", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2725", "S#3936", 1, 0, false);
        new $f2725$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2726", "S#4058", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2727", "S#4059", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2728", "S#4060", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2729", "S#4061", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2730", "S#4062", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2731", "S#4063", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2732", "S#4064", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2733", "S#4065", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2734", "S#4066", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2736", "S#4067", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2737", "S#4068", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2739", "S#4069", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2740", "S#4070", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2741", "S#4071", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2742", "S#4072", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2743", "S#4073", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2744", "S#4074", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2745", "S#4075", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2746", "STRING-W/O-CONTROL-CHARS?", 1, 0, false);
        new $f2746$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2747", "S#4076", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2748", "S#4077", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2749", "S#4078", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2750", "S#4079", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2751", "S#3938", 1, 0, false);
        new $f2751$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2752", "S#4080", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2753", "S#4081", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2754", "S#4082", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2755", "S#4083", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2668", "SUBSTRING?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2756", "S#4084", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2757", "S#4085", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2678", "S#4086", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2689", "S#4087", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2758", "S#4088", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2759", "S#4089", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2761", "S#816", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2762", "S#4090", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2763", "S#4091", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2764", "S#4092", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2765", "S#4093", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2766", "S#4094", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2767", "S#4095", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2768", "S#4096", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2769", "S#4097", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2770", "S#4098", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2771", "S#4099", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2772", "S#4100", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2773", "S#4101", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2775", "S#4102", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2776", "S#4103", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2777", "S#4104", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2778", "S#4105", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2779", "S#4106", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2780", "S#4107", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2781", "S#4108", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2774", "S#4109", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2782", "S#4110", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2783", "S#4111", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2785", "S#4112", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2788", "S#4113", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2787", "S#4114", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2786", "S#4115", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2789", "S#4116", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2790", "S#4117", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2791", "S#4118", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2792", "S#3892", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2793", "S#3893", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2794", "S#3891", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2796", "S#4119", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2795", "S#4120", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2797", "S#4121", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2798", "S#4122", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2799", "S#3894", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2800", "S#3895", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2801", "S#3896", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2802", "S#4123", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2681", "S#4124", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2803", "S#4125", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2804", "S#4126", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2805", "S#4127", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2806", "S#4128", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2807", "S#4129", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2808", "S#4130", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2809", "S#4131", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2810", "S#4132", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2811", "S#4133", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2812", "S#4134", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2813", "S#4135", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2814", "S#4136", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2815", "S#4137", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2816", "S#4138", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2817", "S#4139", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2818", "S#4140", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2819", "S#4141", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2735", "S#4142", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2820", "S#4143", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2821", "S#4144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2822", "S#4145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2823", "S#4146", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2824", "S#4147", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2760", "S#3951", 1, 0, false);
        new $f2760$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2825", "S#4148", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2826", "S#4149", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2827", "S#4150", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2828", "S#4151", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2829", "S#4152", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2830", "S#4153", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2831", "S#4154", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2832", "S#4155", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2833", "S#4156", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2834", "S#4157", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2835", "S#4158", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2836", "S#4159", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2837", "S#4160", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2838", "S#4161", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2839", "S#4162", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2840", "S#4163", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2841", "S#4164", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2842", "S#4165", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2843", "S#4166", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2844", "S#4167", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2845", "S#4168", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2846", "S#4169", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2699", "S#4170", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2784", "S#4171", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2847", "S#4172", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2848", "S#4173", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2661", "S#4174", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2849", "S#4175", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2850", "S#4176", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2852", "S#4177", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2853", "S#4178", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2854", "S#4179", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2855", "S#4180", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2856", "S#4181", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2857", "S#4182", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2851", "S#4183", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2858", "S#4184", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2859", "S#4185", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2860", "S#4186", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2861", "S#4187", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2862", "S#4188", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2863", "S#4189", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2864", "S#4190", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2865", "S#4191", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2866", "S#4192", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2867", "S#4193", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2868", "S#4194", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2738", "S#4195", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2869", "S#4196", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2870", "S#4197", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2871", "S#4198", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2872", "S#4199", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2873", "S#4200", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2874", "S#4201", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2875", "S#4202", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2876", "S#4203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2877", "S#4204", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2878", "S#4205", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2879", "S#4206", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2880", "S#4207", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2881", "S#4208", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2882", "S#4209", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2883", "S#4210", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2884", "S#4211", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2885", "S#4212", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2886", "S#4213", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2887", "S#4214", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2889", "S#4215", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2888", "S#4216", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2890", "S#4217", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2891", "S#4218", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2892", "S#4219", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2893", "S#3957", 1, 0, false);
        new $f2893$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2894", "S#4220", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2895", "S#4221", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2896", "S#4222", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2897", "S#4223", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2898", "S#4224", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2899", "S#4225", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2900", "S#4226", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2901", "S#4227", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2902", "S#4228", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2903", "S#4229", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2904", "S#4230", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2905", "S#4231", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2906", "S#4232", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2907", "S#4233", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2908", "S#4234", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2909", "S#4235", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2910", "S#4236", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2911", "S#4237", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2912", "S#4238", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2913", "S#4239", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2914", "S#4240", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2915", "S#4241", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2916", "S#4242", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2917", "S#4243", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2918", "S#4244", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2919", "S#4245", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2920", "S#4246", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2921", "S#4247", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2922", "S#4248", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2923", "S#4249", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2924", "S#4250", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2925", "S#4251", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2926", "S#4252", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2927", "S#4253", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2928", "S#4254", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2929", "S#4255", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2930", "S#4256", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2931", "S#4257", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2932", "S#4258", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2933", "CYCLIFY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2934", "S#4259", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2935", "S#4260", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2936", "S#4261", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2937", "S#4262", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2938", "S#4263", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2939", "S#4264", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2940", "S#4265", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2941", "S#4266", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2942", "S#4267", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2943", "S#4268", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2944", "S#4269", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2945", "S#4270", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2946", "S#4271", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2947", "S#4272", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2948", "S#4273", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2949", "S#4274", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2950", "S#4275", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2951", "S#4276", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2952", "S#4277", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2953", "S#4278", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2954", "S#4279", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2955", "S#4280", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2956", "S#4281", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2957", "S#4282", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2958", "S#4283", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2959", "S#4284", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2960", "S#4285", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2961", "S#4286", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2962", "S#4287", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2963", "S#4288", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2964", "S#4289", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2965", "S#4290", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2966", "S#4291", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2967", "S#4292", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2968", "S#4293", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2969", "S#4294", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2970", "S#4295", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2971", "S#4296", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2972", "S#4297", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2973", "S#4298", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0038", "f2974", "S#4299", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2976() {
        $g913$ = SubLFiles.defconstant("S#4300", (SubLObject)Characters.CHAR_period);
        $g914$ = SubLFiles.defconstant("S#4301", (SubLObject)Characters.CHAR_space);
        $g915$ = SubLFiles.defconstant("S#4302", (SubLObject)Characters.CHAR_tab);
        $g916$ = SubLFiles.defconstant("S#1647", (SubLObject)$ic0$);
        $g917$ = SubLFiles.defconstant("S#4303", Strings.make_string((SubLObject)ONE_INTEGER, (SubLObject)Characters.CHAR_newline));
        $g918$ = SubLFiles.defvar("S#4304", (SubLObject)NIL);
        $g920$ = SubLFiles.deflexical("S#4305", (SubLObject)NIL);
        $g921$ = SubLFiles.defparameter("S#4306", (SubLObject)NIL);
        $g922$ = SubLFiles.defconstant("S#4307", (SubLObject)$ic81$);
        $g923$ = SubLFiles.deflexical("S#4308", module0035.f2323($g922$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL)));
        $g924$ = SubLFiles.deflexical("S#4309", module0035.f2324($g922$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL)));
        $g925$ = SubLFiles.deflexical("S#4310", (SubLObject)$ic85$);
        $g926$ = SubLFiles.deflexical("S#4311", Sequences.delete_duplicates($g925$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic86$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g927$ = SubLFiles.deflexical("S#4312", (SubLObject)$ic87$);
        $g928$ = SubLFiles.defparameter("S#4313", (SubLObject)NIL);
        $g929$ = SubLFiles.defparameter("S#4314", (SubLObject)$ic115$);
        $g930$ = SubLFiles.defparameter("S#4315", (SubLObject)NIL);
        $g931$ = SubLFiles.defvar("S#4316", (SubLObject)$ic124$);
        $g932$ = SubLFiles.defvar("S#4317", (SubLObject)$ic125$);
        $g933$ = SubLFiles.defvar("S#4318", (SubLObject)$ic126$);
        $g934$ = SubLFiles.defconstant("S#4319", (SubLObject)$ic127$);
        $g935$ = SubLFiles.defparameter("S#4320", (SubLObject)$ic180$);
        $g936$ = SubLFiles.defparameter("S#4321", Vectors.make_vector($g935$.getDynamicValue(), (SubLObject)Characters.CHAR_space));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2977() {
        module0034.f1909((SubLObject)$ic13$);
        module0027.f1449((SubLObject)$ic39$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic40$, EQUAL, $ic41$, NIL, $ic42$, NIL, $ic43$, $ic44$, $ic45$, T }), (SubLObject)$ic46$);
        module0002.f35((SubLObject)$ic29$, (SubLObject)$ic51$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g934$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic134$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic135$);
        Structures.def_csetf((SubLObject)$ic136$, (SubLObject)$ic137$);
        Structures.def_csetf((SubLObject)$ic138$, (SubLObject)$ic139$);
        Structures.def_csetf((SubLObject)$ic140$, (SubLObject)$ic141$);
        Structures.def_csetf((SubLObject)$ic142$, (SubLObject)$ic143$);
        Structures.def_csetf((SubLObject)$ic144$, (SubLObject)$ic145$);
        Structures.def_csetf((SubLObject)$ic146$, (SubLObject)$ic147$);
        Structures.def_csetf((SubLObject)$ic148$, (SubLObject)$ic149$);
        Structures.def_csetf((SubLObject)$ic150$, (SubLObject)$ic151$);
        Structures.def_csetf((SubLObject)$ic152$, (SubLObject)$ic153$);
        Structures.def_csetf((SubLObject)$ic154$, (SubLObject)$ic155$);
        Structures.def_csetf((SubLObject)$ic156$, (SubLObject)$ic157$);
        Structures.def_csetf((SubLObject)$ic158$, (SubLObject)$ic159$);
        Equality.identity((SubLObject)$ic127$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g934$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic177$));
        module0002.f38((SubLObject)$ic178$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f2975();
    }
    
    public void initializeVariables() {
        f2976();
    }
    
    public void runTopLevelForms() {
        f2977();
    }
    
    static {
        me = (SubLFile)new module0038();
        $g913$ = null;
        $g914$ = null;
        $g915$ = null;
        $g916$ = null;
        $g917$ = null;
        $g918$ = null;
        $g920$ = null;
        $g921$ = null;
        $g922$ = null;
        $g923$ = null;
        $g924$ = null;
        $g925$ = null;
        $g926$ = null;
        $g927$ = null;
        $g928$ = null;
        $g929$ = null;
        $g930$ = null;
        $g931$ = null;
        $g932$ = null;
        $g933$ = null;
        $g934$ = null;
        $g935$ = null;
        $g936$ = null;
        $ic0$ = makeString("");
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#4322", "CYC"), (SubLObject)makeSymbol("STRING"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#4323", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#4301", "CYC")))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic2$ = ConsesLow.list((SubLObject)makeKeyword("BREAK-CHAR"));
        $ic3$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic4$ = makeKeyword("BREAK-CHAR");
        $ic5$ = makeSymbol("S#4301", "CYC");
        $ic6$ = makeUninternedSymbol("US#5A188FB");
        $ic7$ = makeSymbol("CLET");
        $ic8$ = makeSymbol("S#4304", "CYC");
        $ic9$ = makeSymbol("S#4174", "CYC");
        $ic10$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#3960", "CYC")));
        $ic11$ = makeSymbol("CDOLIST");
        $ic12$ = makeSymbol("STRINGP");
        $ic13$ = makeSymbol("OBJECT-TO-STRING");
        $ic14$ = makeSymbol("S#4305", "CYC");
        $ic15$ = makeInteger(1000);
        $ic16$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic17$ = makeString(">");
        $ic18$ = makeString("(");
        $ic19$ = makeString(" ");
        $ic20$ = makeString("...");
        $ic21$ = makeString(")");
        $ic22$ = makeString("\"");
        $ic23$ = makeSymbol("S#3980", "CYC");
        $ic24$ = makeSymbol("READ-FROM-STRING-IGNORING-ERRORS");
        $ic25$ = makeKeyword("ERROR");
        $ic26$ = makeString("~X");
        $ic27$ = makeSymbol("FIXNUMP");
        $ic28$ = makeString("~S is too short to remove ~D characters.");
        $ic29$ = makeSymbol("NON-EMPTY-STRING?");
        $ic30$ = makeString("~S must be a single word - cannot contain ~S");
        $ic31$ = makeSymbol("S#3960", "CYC");
        $ic32$ = makeInteger(100);
        $ic33$ = makeInteger(256);
        $ic34$ = makeSymbol("LISTP");
        $ic35$ = makeSymbol("CHARACTERP");
        $ic36$ = makeString("Some element of ~A is not characterp.");
        $ic37$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic38$ = makeSymbol("<");
        $ic39$ = makeSymbol("S#4022", "CYC");
        $ic40$ = makeKeyword("TEST");
        $ic41$ = makeKeyword("OWNER");
        $ic42$ = makeKeyword("CLASSES");
        $ic43$ = makeKeyword("KB");
        $ic44$ = makeKeyword("TINY");
        $ic45$ = makeKeyword("WORKING?");
        $ic46$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("Author Harriet"), (SubLObject)makeString("Harriet Beecher Stowe"), (SubLObject)EQUALP), (SubLObject)makeString("Harriet")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("Author Harriet Beecher Stowe"), (SubLObject)makeString("Harriet Beecher Stowe"), (SubLObject)EQUALP), (SubLObject)makeString("Harriet Beecher Stowe")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("Author Harriet Beecher Stowes"), (SubLObject)makeString("Harriet Beecher Stowe"), (SubLObject)EQUALP), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("Author Harriet Beecher Sto"), (SubLObject)makeString("Harriet Beecher Stowe"), (SubLObject)EQUALP), (SubLObject)makeString("Harriet Beecher Sto")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("Author Harriet Beecher Sto"), (SubLObject)makeString("riet Beecher Stowe"), (SubLObject)EQUALP, (SubLObject)ConsesLow.list((SubLObject)makeString(" "))), (SubLObject)NIL));
        $ic47$ = makeString(",");
        $ic48$ = makeString(", ");
        $ic49$ = ConsesLow.list((SubLObject)Characters.CHAR_lparen, (SubLObject)Characters.CHAR_rparen);
        $ic50$ = ConsesLow.list((SubLObject)makeString("."), (SubLObject)makeString("?"), (SubLObject)makeString("!"));
        $ic51$ = ConsesLow.list((SubLObject)makeSymbol("S#4050", "CYC"), (SubLObject)makeSymbol("S#4324", "CYC"));
        $ic52$ = makeSymbol("S#3938", "CYC");
        $ic53$ = makeSymbol("DIGIT-CHAR-P");
        $ic54$ = makeSymbol("ALPHANUMERICP");
        $ic55$ = makeSymbol("ALPHA-CHAR-P");
        $ic56$ = ConsesLow.list((SubLObject)makeString("-"));
        $ic57$ = ConsesLow.list((SubLObject)makeString(","));
        $ic58$ = makeSymbol("S#4066", "CYC");
        $ic59$ = makeSymbol("PARSE-INTEGER");
        $ic60$ = makeString("~:R");
        $ic61$ = ConsesLow.list((SubLObject)makeString("st"), (SubLObject)makeString("nd"), (SubLObject)makeString("rd"), (SubLObject)makeString("th"));
        $ic62$ = makeSymbol("S#4076", "CYC");
        $ic63$ = makeInteger(32);
        $ic64$ = makeInteger(128);
        $ic65$ = ConsesLow.list((SubLObject)Characters.CHAR_space);
        $ic66$ = makeSymbol("STRING");
        $ic67$ = makeString("\\b");
        $ic68$ = ConsesLow.list((SubLObject)makeKeyword("CASELESS"));
        $ic69$ = makeString("~S is not a part of the reference string: ~S");
        $ic70$ = makeString("Failed to bunge ~S according to ~S.  Returning: ~S");
        $ic71$ = makeSymbol("S#38", "CYC");
        $ic72$ = ConsesLow.list((SubLObject)makeString(" "));
        $ic73$ = makeSymbol("LOWER-CASE-P");
        $ic74$ = makeSymbol("S#3951", "CYC");
        $ic75$ = makeSymbol("UPPER-CASE-P");
        $ic76$ = makeSymbol("S#4124", "CYC");
        $ic77$ = makeSymbol("S#4114", "CYC");
        $ic78$ = makeSymbol("INTEGERP");
        $ic79$ = makeString("0123456789ABCDEF");
        $ic80$ = makeSymbol("S#4118", "CYC");
        $ic81$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)ZERO_INTEGER, (SubLObject)Characters.CHAR_A), ConsesLow.cons((SubLObject)ONE_INTEGER, (SubLObject)Characters.CHAR_B), ConsesLow.cons((SubLObject)TWO_INTEGER, (SubLObject)Characters.CHAR_C), ConsesLow.cons((SubLObject)THREE_INTEGER, (SubLObject)Characters.CHAR_D), ConsesLow.cons((SubLObject)FOUR_INTEGER, (SubLObject)Characters.CHAR_E), ConsesLow.cons((SubLObject)FIVE_INTEGER, (SubLObject)Characters.CHAR_F), ConsesLow.cons((SubLObject)SIX_INTEGER, (SubLObject)Characters.CHAR_G), ConsesLow.cons((SubLObject)SEVEN_INTEGER, (SubLObject)Characters.CHAR_H), ConsesLow.cons((SubLObject)EIGHT_INTEGER, (SubLObject)Characters.CHAR_I), ConsesLow.cons((SubLObject)NINE_INTEGER, (SubLObject)Characters.CHAR_J), ConsesLow.cons((SubLObject)TEN_INTEGER, (SubLObject)Characters.CHAR_K), ConsesLow.cons((SubLObject)ELEVEN_INTEGER, (SubLObject)Characters.CHAR_L), ConsesLow.cons((SubLObject)TWELVE_INTEGER, (SubLObject)Characters.CHAR_M), ConsesLow.cons((SubLObject)THIRTEEN_INTEGER, (SubLObject)Characters.CHAR_N), ConsesLow.cons((SubLObject)FOURTEEN_INTEGER, (SubLObject)Characters.CHAR_O), ConsesLow.cons((SubLObject)FIFTEEN_INTEGER, (SubLObject)Characters.CHAR_P), ConsesLow.cons((SubLObject)SIXTEEN_INTEGER, (SubLObject)Characters.CHAR_Q), ConsesLow.cons((SubLObject)SEVENTEEN_INTEGER, (SubLObject)Characters.CHAR_R), ConsesLow.cons((SubLObject)EIGHTEEN_INTEGER, (SubLObject)Characters.CHAR_S), ConsesLow.cons((SubLObject)NINETEEN_INTEGER, (SubLObject)Characters.CHAR_T), ConsesLow.cons((SubLObject)TWENTY_INTEGER, (SubLObject)Characters.CHAR_U), ConsesLow.cons((SubLObject)makeInteger(21), (SubLObject)Characters.CHAR_V), ConsesLow.cons((SubLObject)makeInteger(22), (SubLObject)Characters.CHAR_W), ConsesLow.cons((SubLObject)makeInteger(23), (SubLObject)Characters.CHAR_X), ConsesLow.cons((SubLObject)makeInteger(24), (SubLObject)Characters.CHAR_Y), ConsesLow.cons((SubLObject)makeInteger(25), (SubLObject)Characters.CHAR_Z), ConsesLow.cons((SubLObject)makeInteger(26), (SubLObject)Characters.CHAR_a), ConsesLow.cons((SubLObject)makeInteger(27), (SubLObject)Characters.CHAR_b), ConsesLow.cons((SubLObject)makeInteger(28), (SubLObject)Characters.CHAR_c), ConsesLow.cons((SubLObject)makeInteger(29), (SubLObject)Characters.CHAR_d), ConsesLow.cons((SubLObject)makeInteger(30), (SubLObject)Characters.CHAR_e), ConsesLow.cons((SubLObject)makeInteger(31), (SubLObject)Characters.CHAR_f), ConsesLow.cons((SubLObject)makeInteger(32), (SubLObject)Characters.CHAR_g), ConsesLow.cons((SubLObject)makeInteger(33), (SubLObject)Characters.CHAR_h), ConsesLow.cons((SubLObject)makeInteger(34), (SubLObject)Characters.CHAR_i), ConsesLow.cons((SubLObject)makeInteger(35), (SubLObject)Characters.CHAR_j), ConsesLow.cons((SubLObject)makeInteger(36), (SubLObject)Characters.CHAR_k), ConsesLow.cons((SubLObject)makeInteger(37), (SubLObject)Characters.CHAR_l), ConsesLow.cons((SubLObject)makeInteger(38), (SubLObject)Characters.CHAR_m), ConsesLow.cons((SubLObject)makeInteger(39), (SubLObject)Characters.CHAR_n), ConsesLow.cons((SubLObject)makeInteger(40), (SubLObject)Characters.CHAR_o), ConsesLow.cons((SubLObject)makeInteger(41), (SubLObject)Characters.CHAR_p), ConsesLow.cons((SubLObject)makeInteger(42), (SubLObject)Characters.CHAR_q), ConsesLow.cons((SubLObject)makeInteger(43), (SubLObject)Characters.CHAR_r), ConsesLow.cons((SubLObject)makeInteger(44), (SubLObject)Characters.CHAR_s), ConsesLow.cons((SubLObject)makeInteger(45), (SubLObject)Characters.CHAR_t), ConsesLow.cons((SubLObject)makeInteger(46), (SubLObject)Characters.CHAR_u), ConsesLow.cons((SubLObject)makeInteger(47), (SubLObject)Characters.CHAR_v), ConsesLow.cons((SubLObject)makeInteger(48), (SubLObject)Characters.CHAR_w), ConsesLow.cons((SubLObject)makeInteger(49), (SubLObject)Characters.CHAR_x), ConsesLow.cons((SubLObject)makeInteger(50), (SubLObject)Characters.CHAR_y), ConsesLow.cons((SubLObject)makeInteger(51), (SubLObject)Characters.CHAR_z), ConsesLow.cons((SubLObject)makeInteger(52), (SubLObject)Characters.CHAR_0), ConsesLow.cons((SubLObject)makeInteger(53), (SubLObject)Characters.CHAR_1), ConsesLow.cons((SubLObject)makeInteger(54), (SubLObject)Characters.CHAR_2), ConsesLow.cons((SubLObject)makeInteger(55), (SubLObject)Characters.CHAR_3), ConsesLow.cons((SubLObject)makeInteger(56), (SubLObject)Characters.CHAR_4), ConsesLow.cons((SubLObject)makeInteger(57), (SubLObject)Characters.CHAR_5), ConsesLow.cons((SubLObject)makeInteger(58), (SubLObject)Characters.CHAR_6), ConsesLow.cons((SubLObject)makeInteger(59), (SubLObject)Characters.CHAR_7), ConsesLow.cons((SubLObject)makeInteger(60), (SubLObject)Characters.CHAR_8), ConsesLow.cons((SubLObject)makeInteger(61), (SubLObject)Characters.CHAR_9), ConsesLow.cons((SubLObject)makeInteger(62), (SubLObject)Characters.CHAR_plus), ConsesLow.cons((SubLObject)makeInteger(63), (SubLObject)Characters.CHAR_slash), ConsesLow.cons((SubLObject)makeInteger(62), (SubLObject)Characters.CHAR_hyphen), ConsesLow.cons((SubLObject)makeInteger(63), (SubLObject)Characters.CHAR_underbar) });
        $ic82$ = makeString(",.?!&'\";:()-");
        $ic83$ = makeString(",.?!&'\";:()-/");
        $ic84$ = makeSymbol("S#4125", "CYC");
        $ic85$ = ConsesLow.list((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_tab, (SubLObject)Characters.CHAR_return, (SubLObject)Characters.CHAR_newline, (SubLObject)Characters.CHAR_newline);
        $ic86$ = makeSymbol("CHAR-EQUAL");
        $ic87$ = ConsesLow.list(new SubLObject[] { Characters.CHAR_comma, Characters.CHAR_question, Characters.CHAR_exclamation, Characters.CHAR_ampersand, Characters.CHAR_backslash, Characters.CHAR_slash, Characters.CHAR_quotation, Characters.CHAR_semicolon, Characters.CHAR_colon, Characters.CHAR_lparen, Characters.CHAR_rparen });
        $ic88$ = makeSymbol("S#4148", "CYC");
        $ic89$ = makeInteger(8192);
        $ic90$ = makeInteger(8203);
        $ic91$ = makeKeyword("EOF");
        $ic92$ = makeInteger(64);
        $ic93$ = makeKeyword("NORMAL");
        $ic94$ = makeKeyword("CR");
        $ic95$ = makeKeyword("STRING");
        $ic96$ = makeKeyword("SLASH");
        $ic97$ = makeSymbol("CCONCATENATE");
        $ic98$ = makeSymbol("FBOUNDP");
        $ic99$ = makeSymbol("S#3965", "CYC");
        $ic100$ = ConsesLow.list((SubLObject)Characters.CHAR_colon, (SubLObject)Characters.CHAR_slash);
        $ic101$ = makeSymbol("VALID-CONSTANT-NAME-CHAR-P");
        $ic102$ = makeSymbol("1+");
        $ic103$ = ConsesLow.list((SubLObject)makeString(" and "), (SubLObject)makeString(" or "));
        $ic104$ = ConsesLow.list((SubLObject)makeString(", "));
        $ic105$ = ConsesLow.list((SubLObject)Characters.CHAR_period, (SubLObject)Characters.CHAR_question, (SubLObject)Characters.CHAR_exclamation);
        $ic106$ = makeSymbol("S#4186", "CYC");
        $ic107$ = ConsesLow.list((SubLObject)Characters.CHAR_newline, (SubLObject)Characters.CHAR_return);
        $ic108$ = ConsesLow.list((SubLObject)Characters.CHAR_quotation, (SubLObject)Characters.CHAR_backslash, (SubLObject)Characters.CHAR_asterisk, (SubLObject)Characters.CHAR_question, (SubLObject)Characters.CHAR_lbracket, (SubLObject)Characters.CHAR_rbracket, (SubLObject)Characters.CHAR_quote);
        $ic109$ = makeKeyword("DEFAULT");
        $ic110$ = makeSymbol("CHAR=");
        $ic111$ = makeString("Unmatched open parenthesis");
        $ic112$ = makeString("Unmatched close parenthesis");
        $ic113$ = makeInteger(255);
        $ic114$ = ConsesLow.list((SubLObject)makeString("."));
        $ic115$ = (SubLFloat)makeDouble(0.8);
        $ic116$ = makeKeyword("FREE");
        $ic117$ = makeInteger(50);
        $ic118$ = makeString("es");
        $ic119$ = makeString("s");
        $ic120$ = makeInteger(1000000);
        $ic121$ = makeSymbol("S#4215", "CYC");
        $ic122$ = makeSymbol("S#4217", "CYC");
        $ic123$ = makeString("~%");
        $ic124$ = ConsesLow.list((SubLObject)makeString("#$ExpandSubLFn"), (SubLObject)makeString("ExpandSubLFn"));
        $ic125$ = ConsesLow.list((SubLObject)makeString("#$SubLQuoteFn"), (SubLObject)makeString("SubLQuoteFn"));
        $ic126$ = ConsesLow.list((SubLObject)Characters.CHAR_backslash);
        $ic127$ = makeSymbol("S#3956", "CYC");
        $ic128$ = makeSymbol("S#3957", "CYC");
        $ic129$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#4325", "CYC"), makeSymbol("S#4326", "CYC"), makeSymbol("S#4327", "CYC"), makeSymbol("S#4328", "CYC"), makeSymbol("S#4329", "CYC"), makeSymbol("S#4330", "CYC"), makeSymbol("S#4331", "CYC"), makeSymbol("S#4332", "CYC"), makeSymbol("S#4333", "CYC"), makeSymbol("S#4334", "CYC"), makeSymbol("S#4335", "CYC"), makeSymbol("S#4336", "CYC") });
        $ic130$ = ConsesLow.list(new SubLObject[] { makeKeyword("OUT-STRING-LIST"), makeKeyword("REFERENCES-ADDED"), makeKeyword("INSIDE-QUOTE?"), makeKeyword("INSIDE-EL-VAR-NAME?"), makeKeyword("ALREADY-CYCLIFIED?"), makeKeyword("ESCAPE?"), makeKeyword("INSIDE-SUBL-QUOTE-FN?"), makeKeyword("INSIDE-EXPAND-SUBL-FN?"), makeKeyword("INSIDE-EXPAND-SUBL-FN-ARG1?"), makeKeyword("INSIDE-EXPAND-SUBL-FN-ARG2?"), makeKeyword("IMMEDIATELY-FOLLOWING-PAREN?"), makeKeyword("PAREN-COUNT") });
        $ic131$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#4220", "CYC"), makeSymbol("S#4221", "CYC"), makeSymbol("S#4222", "CYC"), makeSymbol("S#4223", "CYC"), makeSymbol("S#4224", "CYC"), makeSymbol("S#4225", "CYC"), makeSymbol("S#4226", "CYC"), makeSymbol("S#4227", "CYC"), makeSymbol("S#4228", "CYC"), makeSymbol("S#4229", "CYC"), makeSymbol("S#4230", "CYC"), makeSymbol("S#4231", "CYC") });
        $ic132$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#4232", "CYC"), makeSymbol("S#4233", "CYC"), makeSymbol("S#4234", "CYC"), makeSymbol("S#4235", "CYC"), makeSymbol("S#4236", "CYC"), makeSymbol("S#4237", "CYC"), makeSymbol("S#4238", "CYC"), makeSymbol("S#4239", "CYC"), makeSymbol("S#4240", "CYC"), makeSymbol("S#4241", "CYC"), makeSymbol("S#4242", "CYC"), makeSymbol("S#4243", "CYC") });
        $ic133$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic134$ = makeSymbol("S#4219", "CYC");
        $ic135$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#3957", "CYC"));
        $ic136$ = makeSymbol("S#4220", "CYC");
        $ic137$ = makeSymbol("S#4232", "CYC");
        $ic138$ = makeSymbol("S#4221", "CYC");
        $ic139$ = makeSymbol("S#4233", "CYC");
        $ic140$ = makeSymbol("S#4222", "CYC");
        $ic141$ = makeSymbol("S#4234", "CYC");
        $ic142$ = makeSymbol("S#4223", "CYC");
        $ic143$ = makeSymbol("S#4235", "CYC");
        $ic144$ = makeSymbol("S#4224", "CYC");
        $ic145$ = makeSymbol("S#4236", "CYC");
        $ic146$ = makeSymbol("S#4225", "CYC");
        $ic147$ = makeSymbol("S#4237", "CYC");
        $ic148$ = makeSymbol("S#4226", "CYC");
        $ic149$ = makeSymbol("S#4238", "CYC");
        $ic150$ = makeSymbol("S#4227", "CYC");
        $ic151$ = makeSymbol("S#4239", "CYC");
        $ic152$ = makeSymbol("S#4228", "CYC");
        $ic153$ = makeSymbol("S#4240", "CYC");
        $ic154$ = makeSymbol("S#4229", "CYC");
        $ic155$ = makeSymbol("S#4241", "CYC");
        $ic156$ = makeSymbol("S#4230", "CYC");
        $ic157$ = makeSymbol("S#4242", "CYC");
        $ic158$ = makeSymbol("S#4231", "CYC");
        $ic159$ = makeSymbol("S#4243", "CYC");
        $ic160$ = makeKeyword("OUT-STRING-LIST");
        $ic161$ = makeKeyword("REFERENCES-ADDED");
        $ic162$ = makeKeyword("INSIDE-QUOTE?");
        $ic163$ = makeKeyword("INSIDE-EL-VAR-NAME?");
        $ic164$ = makeKeyword("ALREADY-CYCLIFIED?");
        $ic165$ = makeKeyword("ESCAPE?");
        $ic166$ = makeKeyword("INSIDE-SUBL-QUOTE-FN?");
        $ic167$ = makeKeyword("INSIDE-EXPAND-SUBL-FN?");
        $ic168$ = makeKeyword("INSIDE-EXPAND-SUBL-FN-ARG1?");
        $ic169$ = makeKeyword("INSIDE-EXPAND-SUBL-FN-ARG2?");
        $ic170$ = makeKeyword("IMMEDIATELY-FOLLOWING-PAREN?");
        $ic171$ = makeKeyword("PAREN-COUNT");
        $ic172$ = makeString("Invalid slot ~S for construction function");
        $ic173$ = makeKeyword("BEGIN");
        $ic174$ = makeSymbol("S#4244", "CYC");
        $ic175$ = makeKeyword("SLOT");
        $ic176$ = makeKeyword("END");
        $ic177$ = makeSymbol("S#4246", "CYC");
        $ic178$ = makeSymbol("CYCLIFY-STRING");
        $ic179$ = makeString("_-");
        $ic180$ = makeInteger(1024);
        $ic181$ = makeString("quit reading file");
        $ic182$ = makeString("string read larger than buffer size of ~S");
        $ic183$ = (SubLFloat)makeDouble(0.5);
        $ic184$ = makeString("~a");
        $ic185$ = makeKeyword("BEFORE");
        $ic186$ = makeKeyword("WORD");
        $ic187$ = makeKeyword("KEEP-BLANK");
        $ic188$ = makeKeyword("SKIP-BLANKS");
        $ic189$ = makeString("Unknown State ~S: Flaw in state machine design.");
        $ic190$ = makeKeyword("SPACE");
        $ic191$ = makeString("Unknown state ~S: Design flaw in state machine.");
        $ic192$ = makeSymbol("PRIN1");
        $ic193$ = makeSymbol("S#73", "CYC");
        $ic194$ = makeKeyword("INPUT");
        $ic195$ = makeString("Unable to open ~S");
        $ic196$ = makeString("Could not open an input stream for ~S.");
        $ic197$ = makeKeyword("OUTPUT");
        $ic198$ = makeString("~%Cannot open input stream for ~A");
        $ic199$ = makeString("_");
        $ic200$ = makeInteger(97);
        $ic201$ = makeInteger(26);
        $ic202$ = makeSymbol("S#4285", "CYC");
        $ic203$ = makeString("~a is not a number between 0 and 25");
        $ic204$ = makeSymbol("S#4292", "CYC");
        $ic205$ = makeSymbol("S#4294", "CYC");
        $ic206$ = makeSymbol("PROGN");
        $ic207$ = makeString(",~a");
    }
    
    public static final class $f2725$UnaryFunction extends UnaryFunction
    {
        public $f2725$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#3936"));
        }
        
        public SubLObject processItem(final SubLObject var163) {
            return f2725(var163);
        }
    }
    
    public static final class $f2746$UnaryFunction extends UnaryFunction
    {
        public $f2746$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("STRING-W/O-CONTROL-CHARS?"));
        }
        
        public SubLObject processItem(final SubLObject var163) {
            return f2746(var163);
        }
    }
    
    public static final class $f2751$UnaryFunction extends UnaryFunction
    {
        public $f2751$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#3938"));
        }
        
        public SubLObject processItem(final SubLObject var163) {
            return f2751(var163);
        }
    }
    
    public static final class $f2760$UnaryFunction extends UnaryFunction
    {
        public $f2760$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#3951"));
        }
        
        public SubLObject processItem(final SubLObject var163) {
            return f2760(var163);
        }
    }
    
    public static final class $sX3956_native extends SubLStructNative
    {
        public SubLObject $out_string_list;
        public SubLObject $references_added;
        public SubLObject $inside_quoteP;
        public SubLObject $inside_el_var_nameP;
        public SubLObject $already_cyclifiedP;
        public SubLObject $escapeP;
        public SubLObject $inside_subl_quote_fnP;
        public SubLObject $inside_expand_subl_fnP;
        public SubLObject $inside_expand_subl_fn_arg1P;
        public SubLObject $inside_expand_subl_fn_arg2P;
        public SubLObject $immediately_following_parenP;
        public SubLObject $paren_count;
        private static final SubLStructDeclNative structDecl;
        
        public $sX3956_native() {
            this.$out_string_list = (SubLObject)CommonSymbols.NIL;
            this.$references_added = (SubLObject)CommonSymbols.NIL;
            this.$inside_quoteP = (SubLObject)CommonSymbols.NIL;
            this.$inside_el_var_nameP = (SubLObject)CommonSymbols.NIL;
            this.$already_cyclifiedP = (SubLObject)CommonSymbols.NIL;
            this.$escapeP = (SubLObject)CommonSymbols.NIL;
            this.$inside_subl_quote_fnP = (SubLObject)CommonSymbols.NIL;
            this.$inside_expand_subl_fnP = (SubLObject)CommonSymbols.NIL;
            this.$inside_expand_subl_fn_arg1P = (SubLObject)CommonSymbols.NIL;
            this.$inside_expand_subl_fn_arg2P = (SubLObject)CommonSymbols.NIL;
            this.$immediately_following_parenP = (SubLObject)CommonSymbols.NIL;
            this.$paren_count = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX3956_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$out_string_list;
        }
        
        public SubLObject getField3() {
            return this.$references_added;
        }
        
        public SubLObject getField4() {
            return this.$inside_quoteP;
        }
        
        public SubLObject getField5() {
            return this.$inside_el_var_nameP;
        }
        
        public SubLObject getField6() {
            return this.$already_cyclifiedP;
        }
        
        public SubLObject getField7() {
            return this.$escapeP;
        }
        
        public SubLObject getField8() {
            return this.$inside_subl_quote_fnP;
        }
        
        public SubLObject getField9() {
            return this.$inside_expand_subl_fnP;
        }
        
        public SubLObject getField10() {
            return this.$inside_expand_subl_fn_arg1P;
        }
        
        public SubLObject getField11() {
            return this.$inside_expand_subl_fn_arg2P;
        }
        
        public SubLObject getField12() {
            return this.$immediately_following_parenP;
        }
        
        public SubLObject getField13() {
            return this.$paren_count;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$out_string_list = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$references_added = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$inside_quoteP = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$inside_el_var_nameP = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$already_cyclifiedP = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$escapeP = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$inside_subl_quote_fnP = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$inside_expand_subl_fnP = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$inside_expand_subl_fn_arg1P = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$inside_expand_subl_fn_arg2P = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$immediately_following_parenP = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$paren_count = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX3956_native.class, $ic127$, $ic128$, $ic129$, $ic130$, new String[] { "$out_string_list", "$references_added", "$inside_quoteP", "$inside_el_var_nameP", "$already_cyclifiedP", "$escapeP", "$inside_subl_quote_fnP", "$inside_expand_subl_fnP", "$inside_expand_subl_fn_arg1P", "$inside_expand_subl_fn_arg2P", "$immediately_following_parenP", "$paren_count" }, $ic131$, $ic132$, $ic133$);
        }
    }
    
    public static final class $f2893$UnaryFunction extends UnaryFunction
    {
        public $f2893$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#3957"));
        }
        
        public SubLObject processItem(final SubLObject var163) {
            return f2893(var163);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1937 ms
	
	Decompiled with Procyon 0.5.32.
*/