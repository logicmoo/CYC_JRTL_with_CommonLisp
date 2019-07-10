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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0812 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0812";
    public static final String myFingerPrint = "b4fd021b446e81d7d56b52c973004c861ca4f1c979c64c12b13299802d63cb12";
    public static SubLSymbol $g6445$;
    public static SubLSymbol $g6446$;
    private static SubLSymbol $g6447$;
    private static SubLSymbol $g6448$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
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
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
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
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLList $ic73$;
    private static final SubLList $ic74$;
    private static final SubLList $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    private static final SubLString $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLList $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLString $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLList $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLList $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLList $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLList $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLString $ic122$;
    private static final SubLString $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLString $ic134$;
    private static final SubLList $ic135$;
    
    public static SubLObject f51930() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g6445$.getDynamicValue(var1);
    }
    
    public static SubLObject f51931(final SubLObject var2, final SubLObject var3) {
        f51932(var2, var3, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51933(final SubLObject var2) {
        return (SubLObject)((var2.getClass() == $sX56737_native.class) ? T : NIL);
    }
    
    public static SubLObject f51934(final SubLObject var2) {
        assert NIL != f51933(var2) : var2;
        return var2.getField2();
    }
    
    public static SubLObject f51935(final SubLObject var2) {
        assert NIL != f51933(var2) : var2;
        return var2.getField3();
    }
    
    public static SubLObject f51936(final SubLObject var2) {
        assert NIL != f51933(var2) : var2;
        return var2.getField4();
    }
    
    public static SubLObject f51937(final SubLObject var2) {
        assert NIL != f51933(var2) : var2;
        return var2.getField5();
    }
    
    public static SubLObject f51938(final SubLObject var2) {
        assert NIL != f51933(var2) : var2;
        return var2.getField6();
    }
    
    public static SubLObject f51939(final SubLObject var2) {
        assert NIL != f51933(var2) : var2;
        return var2.getField7();
    }
    
    public static SubLObject f51940(final SubLObject var2) {
        assert NIL != f51933(var2) : var2;
        return var2.getField8();
    }
    
    public static SubLObject f51941(final SubLObject var2) {
        assert NIL != f51933(var2) : var2;
        return var2.getField9();
    }
    
    public static SubLObject f51942(final SubLObject var2) {
        assert NIL != f51933(var2) : var2;
        return var2.getField10();
    }
    
    public static SubLObject f51943(final SubLObject var2) {
        assert NIL != f51933(var2) : var2;
        return var2.getField11();
    }
    
    public static SubLObject f51944(final SubLObject var2) {
        assert NIL != f51933(var2) : var2;
        return var2.getField12();
    }
    
    public static SubLObject f51945(final SubLObject var2) {
        assert NIL != f51933(var2) : var2;
        return var2.getField13();
    }
    
    public static SubLObject f51946(final SubLObject var2) {
        assert NIL != f51933(var2) : var2;
        return var2.getField14();
    }
    
    public static SubLObject f51947(final SubLObject var2) {
        assert NIL != f51933(var2) : var2;
        return var2.getField15();
    }
    
    public static SubLObject f51948(final SubLObject var2) {
        assert NIL != f51933(var2) : var2;
        return var2.getField16();
    }
    
    public static SubLObject f51949(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51933(var2) : var2;
        return var2.setField2(var5);
    }
    
    public static SubLObject f51950(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51933(var2) : var2;
        return var2.setField3(var5);
    }
    
    public static SubLObject f51951(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51933(var2) : var2;
        return var2.setField4(var5);
    }
    
    public static SubLObject f51952(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51933(var2) : var2;
        return var2.setField5(var5);
    }
    
    public static SubLObject f51953(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51933(var2) : var2;
        return var2.setField6(var5);
    }
    
    public static SubLObject f51954(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51933(var2) : var2;
        return var2.setField7(var5);
    }
    
    public static SubLObject f51955(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51933(var2) : var2;
        return var2.setField8(var5);
    }
    
    public static SubLObject f51956(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51933(var2) : var2;
        return var2.setField9(var5);
    }
    
    public static SubLObject f51957(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51933(var2) : var2;
        return var2.setField10(var5);
    }
    
    public static SubLObject f51958(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51933(var2) : var2;
        return var2.setField11(var5);
    }
    
    public static SubLObject f51959(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51933(var2) : var2;
        return var2.setField12(var5);
    }
    
    public static SubLObject f51960(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51933(var2) : var2;
        return var2.setField13(var5);
    }
    
    public static SubLObject f51961(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51933(var2) : var2;
        return var2.setField14(var5);
    }
    
    public static SubLObject f51962(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51933(var2) : var2;
        return var2.setField15(var5);
    }
    
    public static SubLObject f51963(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51933(var2) : var2;
        return var2.setField16(var5);
    }
    
    public static SubLObject f51964(SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLObject var7 = (SubLObject)new $sX56737_native();
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var8 = (SubLObject)NIL, var8 = var6; NIL != var8; var8 = conses_high.cddr(var8)) {
            var9 = var8.first();
            var10 = conses_high.cadr(var8);
            var11 = var9;
            if (var11.eql((SubLObject)$ic39$)) {
                f51949(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic40$)) {
                f51950(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic41$)) {
                f51951(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic42$)) {
                f51952(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic43$)) {
                f51953(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic44$)) {
                f51954(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic45$)) {
                f51955(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic46$)) {
                f51956(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic47$)) {
                f51957(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic48$)) {
                f51958(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic49$)) {
                f51959(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic50$)) {
                f51960(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic51$)) {
                f51961(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic52$)) {
                f51962(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic53$)) {
                f51963(var7, var10);
            }
            else {
                Errors.error((SubLObject)$ic54$, var9);
            }
        }
        return var7;
    }
    
    public static SubLObject f51965(final SubLObject var12, final SubLObject var13) {
        Functions.funcall(var13, var12, (SubLObject)$ic55$, (SubLObject)$ic56$, (SubLObject)FIFTEEN_INTEGER);
        Functions.funcall(var13, var12, (SubLObject)$ic57$, (SubLObject)$ic39$, f51934(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic57$, (SubLObject)$ic40$, f51935(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic57$, (SubLObject)$ic41$, f51936(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic57$, (SubLObject)$ic42$, f51937(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic57$, (SubLObject)$ic43$, f51938(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic57$, (SubLObject)$ic44$, f51939(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic57$, (SubLObject)$ic45$, f51940(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic57$, (SubLObject)$ic46$, f51941(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic57$, (SubLObject)$ic47$, f51942(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic57$, (SubLObject)$ic48$, f51943(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic57$, (SubLObject)$ic49$, f51944(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic57$, (SubLObject)$ic50$, f51945(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic57$, (SubLObject)$ic51$, f51946(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic57$, (SubLObject)$ic52$, f51947(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic57$, (SubLObject)$ic53$, f51948(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic58$, (SubLObject)$ic56$, (SubLObject)FIFTEEN_INTEGER);
        return var12;
    }
    
    public static SubLObject f51966(final SubLObject var12, final SubLObject var13) {
        return f51965(var12, var13);
    }
    
    public static SubLObject f51932(final SubLObject var14, final SubLObject var3, final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var16)) {
            print_high.print_not_readable(var14, var3);
        }
        else {
            streams_high.write_string((SubLObject)$ic60$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var14), new SubLObject[] { $ic61$, var3 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var3);
            print_high.princ(f51934(var14), var3);
            streams_high.write_char((SubLObject)Characters.CHAR_space, var3);
            PrintLow.write(Equality.pointer(var14), new SubLObject[] { $ic61$, var3, $ic62$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var3);
        }
        return var14;
    }
    
    public static SubLObject f51967(final SubLObject var14) {
        return Sxhash.sxhash(f51934(var14));
    }
    
    public static SubLObject f51968(final SubLObject var20, final SubLObject var21) {
        assert NIL != Types.stringp(var21) : var21;
        final SubLObject var22 = f51964((SubLObject)UNPROVIDED);
        f51949(var22, var20);
        f51950(var22, var21);
        f51951(var22, module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)ZERO_INTEGER));
        f51952(var22, module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)ZERO_INTEGER));
        f51953(var22, module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)ZERO_INTEGER));
        f51954(var22, (SubLObject)NIL);
        f51955(var22, (SubLObject)NIL);
        f51956(var22, (SubLObject)NIL);
        f51957(var22, (SubLObject)NIL);
        f51958(var22, (SubLObject)NIL);
        f51959(var22, module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)ZERO_INTEGER));
        f51960(var22, module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)ZERO_INTEGER));
        f51961(var22, module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)ZERO_INTEGER));
        f51962(var22, module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)ZERO_INTEGER));
        f51963(var22, module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)ZERO_INTEGER));
        return var22;
    }
    
    public static SubLObject f51969(final SubLObject var22) {
        f51950(var22, (SubLObject)$ic65$);
        module0067.f4881(f51936(var22));
        f51951(var22, (SubLObject)$ic65$);
        module0077.f5328(f51937(var22));
        f51952(var22, (SubLObject)$ic65$);
        module0077.f5328(f51938(var22));
        f51953(var22, (SubLObject)$ic65$);
        f51954(var22, (SubLObject)$ic65$);
        f51955(var22, (SubLObject)$ic65$);
        f51956(var22, (SubLObject)$ic65$);
        f51957(var22, (SubLObject)$ic65$);
        f51958(var22, (SubLObject)$ic65$);
        module0067.f4881(f51944(var22));
        f51959(var22, (SubLObject)$ic65$);
        module0067.f4881(f51945(var22));
        f51960(var22, (SubLObject)$ic65$);
        module0067.f4881(f51946(var22));
        f51961(var22, (SubLObject)$ic65$);
        module0067.f4881(f51947(var22));
        f51962(var22, (SubLObject)$ic65$);
        module0077.f5328(f51948(var22));
        f51963(var22, (SubLObject)$ic65$);
        return var22;
    }
    
    public static SubLObject f51970(final SubLObject var22) {
        return f51934(var22);
    }
    
    public static SubLObject f51971(final SubLObject var22) {
        return f51935(var22);
    }
    
    public static SubLObject f51972(final SubLObject var22) {
        return f51939(var22);
    }
    
    public static SubLObject f51973(final SubLObject var22) {
        return module0067.f4861(f51936(var22));
    }
    
    public static SubLObject f51974(final SubLObject var22) {
        return f51973(var22);
    }
    
    public static SubLObject f51975(final SubLObject var22) {
        return Sort.sort(module0084.f5780(f51936(var22)), Symbols.symbol_function((SubLObject)$ic66$), Symbols.symbol_function((SubLObject)$ic67$));
    }
    
    public static SubLObject f51976(final SubLObject var22) {
        return Sort.sort(module0077.f5312(f51937(var22)), Symbols.symbol_function((SubLObject)$ic68$), Symbols.symbol_function((SubLObject)$ic69$));
    }
    
    public static SubLObject f51977(final SubLObject var22) {
        return f51941(var22);
    }
    
    public static SubLObject f51978(final SubLObject var22) {
        return Sort.sort(module0077.f5312(f51938(var22)), Symbols.symbol_function((SubLObject)$ic68$), Symbols.symbol_function((SubLObject)$ic69$));
    }
    
    public static SubLObject f51979(final SubLObject var22) {
        return f51942(var22);
    }
    
    public static SubLObject f51980(final SubLObject var22) {
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = f51979(var22);
        SubLObject var25 = (SubLObject)NIL;
        var25 = var24.first();
        while (NIL != var24) {
            if (NIL != f51981(var22, var25)) {
                var23 = (SubLObject)ConsesLow.cons(var25, var23);
            }
            var24 = var24.rest();
            var25 = var24.first();
        }
        return Sequences.nreverse(var23);
    }
    
    public static SubLObject f51982(final SubLObject var22, final SubLObject var25) {
        return module0067.f4884(f51944(var22), var25, (SubLObject)$ic70$);
    }
    
    public static SubLObject f51983(final SubLObject var25) {
        final SubLObject var26 = f51930();
        return (SubLObject)((NIL != var26) ? f51982(var26, var25) : $ic70$);
    }
    
    public static SubLObject f51984(final SubLObject var22, final SubLObject var26) {
        return module0067.f4884(f51945(var22), var26, (SubLObject)$ic70$);
    }
    
    public static SubLObject f51985(final SubLObject var22, final SubLObject var26) {
        final SubLObject var27 = f51984(var22, var26);
        if (var27 != $ic70$) {
            return var27;
        }
        return module0811.f51812(var26);
    }
    
    public static SubLObject f51986(final SubLObject var26) {
        final SubLObject var27 = f51930();
        if (NIL != var27) {
            return f51985(var27, var26);
        }
        return module0811.f51812(var26);
    }
    
    public static SubLObject f51987(final SubLObject var22, final SubLObject var28) {
        return module0067.f4884(f51946(var22), var28, (SubLObject)$ic71$);
    }
    
    public static SubLObject f51981(final SubLObject var22, final SubLObject var28) {
        return Equality.eq((SubLObject)$ic72$, f51987(var22, var28));
    }
    
    public static SubLObject f51988(final SubLObject var28) {
        final SubLObject var29 = f51930();
        return (SubLObject)((NIL != var29) ? f51981(var29, var28) : NIL);
    }
    
    public static SubLObject f51989(final SubLObject var22, final SubLObject var26) {
        return module0067.f4884(f51947(var22), var26, (SubLObject)$ic71$);
    }
    
    public static SubLObject f51990(final SubLObject var22, final SubLObject var26) {
        return Equality.eq((SubLObject)$ic72$, f51989(var22, var26));
    }
    
    public static SubLObject f51991(final SubLObject var26) {
        final SubLObject var27 = f51930();
        return (SubLObject)((NIL != var27) ? f51990(var27, var26) : NIL);
    }
    
    public static SubLObject f51992(final SubLObject var22, final SubLObject var29) {
        if (var29.isCons()) {
            final SubLObject var30 = var29.first();
            if (NIL != module0035.f2169(var30, $g6447$.getGlobalValue())) {
                SubLObject var31 = (SubLObject)NIL;
                SubLObject var32 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var29, var29, (SubLObject)$ic74$);
                var31 = var29.first();
                SubLObject var33 = var29.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var33, var29, (SubLObject)$ic74$);
                var32 = var33.first();
                var33 = var33.rest();
                final SubLObject var34 = (SubLObject)(var33.isCons() ? var33.first() : NIL);
                cdestructuring_bind.destructuring_bind_must_listp(var33, var29, (SubLObject)$ic74$);
                var33 = var33.rest();
                final SubLObject var35 = (SubLObject)(var33.isCons() ? var33.first() : NIL);
                cdestructuring_bind.destructuring_bind_must_listp(var33, var29, (SubLObject)$ic74$);
                var33 = var33.rest();
                if (NIL == var33) {
                    return f51990(var22, var32);
                }
                cdestructuring_bind.cdestructuring_bind_error(var29, (SubLObject)$ic74$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51993(final SubLObject var22) {
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = f51972(var22);
        SubLObject var25 = (SubLObject)NIL;
        var25 = var24.first();
        while (NIL != var24) {
            if (NIL != f51992(var22, var25)) {
                var23 = (SubLObject)ConsesLow.cons(var25, var23);
            }
            var24 = var24.rest();
            var25 = var24.first();
        }
        return Sequences.nreverse(var23);
    }
    
    public static SubLObject f51994(final SubLObject var22, final SubLObject var28) {
        return module0077.f5320(var28, f51948(var22));
    }
    
    public static SubLObject f51995(final SubLObject var22, final SubLObject var37) {
        SubLObject var38 = module0067.f4885(f51936(var22), var37, (SubLObject)UNPROVIDED);
        if (NIL == var38) {
            var38 = f51974(var22);
            module0067.f4886(f51936(var22), var37, var38);
        }
        return var38;
    }
    
    public static SubLObject f51996(final SubLObject var22, final SubLObject var39, final SubLObject var40) {
        f51954(var22, (SubLObject)ConsesLow.cons(var40, f51939(var22)));
        f51957(var22, (SubLObject)ConsesLow.cons(var39, f51942(var22)));
        return var40;
    }
    
    public static SubLObject f51997(final SubLObject var22, final SubLObject var41, final SubLObject var40) {
        f51954(var22, (SubLObject)ConsesLow.cons(var40, f51939(var22)));
        f51958(var22, (SubLObject)ConsesLow.cons(var41, f51943(var22)));
        return var40;
    }
    
    public static SubLObject f51998(final SubLObject var22, final SubLObject var42, final SubLObject var40) {
        f51954(var22, (SubLObject)ConsesLow.cons(var40, f51939(var22)));
        f51956(var22, (SubLObject)ConsesLow.cons(var42, f51941(var22)));
        return var40;
    }
    
    public static SubLObject f51999(final SubLObject var22, final SubLObject var43, final SubLObject var40) {
        f51954(var22, (SubLObject)ConsesLow.cons(var40, f51939(var22)));
        return var40;
    }
    
    public static SubLObject f52000(final SubLObject var22, final SubLObject var40) {
        f51955(var22, (SubLObject)ConsesLow.cons(var40, f51940(var22)));
        return var40;
    }
    
    public static SubLObject f52001(final SubLObject var44, final SubLObject var45) {
        SubLObject var47;
        final SubLObject var46 = var47 = var44.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var47, var46, (SubLObject)$ic75$);
        final SubLObject var48 = var47.rest();
        var47 = var47.first();
        SubLObject var49 = (SubLObject)NIL;
        SubLObject var50 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var47, var46, (SubLObject)$ic75$);
        var49 = var47.first();
        var47 = var47.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var47, var46, (SubLObject)$ic75$);
        var50 = var47.first();
        var47 = var47.rest();
        if (NIL == var47) {
            final SubLObject var51;
            var47 = (var51 = var48);
            final SubLObject var52 = (SubLObject)$ic76$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic77$, (SubLObject)$ic78$, (SubLObject)ConsesLow.list((SubLObject)$ic79$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var52, var50)), (SubLObject)ConsesLow.listS((SubLObject)$ic80$, (SubLObject)ConsesLow.listS(var49, var52, (SubLObject)$ic81$), ConsesLow.append(var51, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var46, (SubLObject)$ic75$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52002(final SubLObject var21) {
        if (!var21.equal((SubLObject)$ic82$) && NIL != Filesys.probe_file(var21)) {
            Filesys.delete_file(var21);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52003(final SubLObject var22, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = print_high.$print_case$.currentBinding(var23);
        final SubLObject var25 = reader.$read_default_float_format$.currentBinding(var23);
        try {
            print_high.$print_case$.bind((SubLObject)$ic83$, var23);
            reader.$read_default_float_format$.bind((SubLObject)$ic84$, var23);
            PrintLow.format(var3, (SubLObject)$ic85$, f51934(var22));
            PrintLow.format(var3, (SubLObject)$ic86$, f51935(var22));
            final SubLObject var26 = f51976(var22);
            if (NIL != var26) {
                PrintLow.format(var3, (SubLObject)$ic87$);
                SubLObject var27 = var26;
                SubLObject var28 = (SubLObject)NIL;
                var28 = var27.first();
                while (NIL != var27) {
                    print_high.print(var28, var3);
                    var27 = var27.rest();
                    var28 = var27.first();
                }
            }
            final SubLObject var29 = f51978(var22);
            if (NIL != var29) {
                PrintLow.format(var3, (SubLObject)$ic88$);
                SubLObject var27 = var29;
                SubLObject var30 = (SubLObject)NIL;
                var30 = var27.first();
                while (NIL != var27) {
                    print_high.print(var30, var3);
                    var27 = var27.rest();
                    var30 = var27.first();
                }
            }
            final SubLObject var31 = f51975(var22);
            if (NIL != var31) {
                PrintLow.format(var3, (SubLObject)$ic89$);
                SubLObject var27 = var31;
                SubLObject var32 = (SubLObject)NIL;
                var32 = var27.first();
                while (NIL != var27) {
                    SubLObject var34;
                    final SubLObject var33 = var34 = var32;
                    SubLObject var35 = (SubLObject)NIL;
                    SubLObject var36 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)$ic90$);
                    var35 = var34.first();
                    var34 = (var36 = var34.rest());
                    PrintLow.format(var3, (SubLObject)$ic91$, var36, var35);
                    var27 = var27.rest();
                    var32 = var27.first();
                }
            }
            final SubLObject var37 = f51939(var22);
            if (NIL != var37) {
                PrintLow.format(var3, (SubLObject)$ic92$);
            }
            SubLObject var27 = var37;
            SubLObject var38 = (SubLObject)NIL;
            var38 = var27.first();
            while (NIL != var27) {
                streams_high.terpri((SubLObject)UNPROVIDED);
                f52004(var38, var3, (SubLObject)UNPROVIDED);
                var27 = var27.rest();
                var38 = var27.first();
            }
        }
        finally {
            reader.$read_default_float_format$.rebind(var25, var23);
            print_high.$print_case$.rebind(var24, var23);
        }
        return var22;
    }
    
    public static SubLObject f52004(final SubLObject var63, SubLObject var3, SubLObject var15) {
        if (var3 == UNPROVIDED) {
            var3 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)ZERO_INTEGER;
        }
        return module0194.f12114(var63, var3, var15);
    }
    
    public static SubLObject f52005(final SubLObject var64) {
        return f52006(module0004.f86(var64));
    }
    
    public static SubLObject f52006(final SubLObject var65) {
        final SubLObject var66 = Sequences.position((SubLObject)$ic93$, var65, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var67 = Sequences.position((SubLObject)$ic94$, var65, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var66) {
            if (NIL != var67) {
                return Values.values(var66, Numbers.subtract(var67, var66, (SubLObject)ONE_INTEGER), (SubLObject)T);
            }
            return Values.values(var66, Numbers.subtract(Sequences.length(var65), var66, (SubLObject)ONE_INTEGER), (SubLObject)NIL);
        }
        else {
            if (NIL != var67) {
                return Values.values(var67, (SubLObject)ZERO_INTEGER, (SubLObject)T);
            }
            return Values.values(Sequences.length(var65), (SubLObject)ZERO_INTEGER, (SubLObject)NIL);
        }
    }
    
    public static SubLObject f52007(final SubLObject var37) {
        final SubLObject var38 = f51930();
        if (NIL != f52008(var37)) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic95$, var37);
        }
        if (NIL == var38) {
            return f52009(var37);
        }
        final SubLObject var39 = f51995(var38, var37);
        return (SubLObject)ConsesLow.list((SubLObject)$ic96$, var39, var37);
    }
    
    public static SubLObject f52010(final SubLObject var26) {
        assert NIL != Types.symbolp(var26) : var26;
        final SubLObject var27 = f51930();
        if (NIL != var27) {
            module0077.f5326(var26, f51937(var27));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52011(final SubLObject var25) {
        assert NIL != Types.symbolp(var25) : var25;
        final SubLObject var26 = f51930();
        if (NIL != var26) {
            module0077.f5326(var25, f51938(var26));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52012(final SubLObject var25, final SubLObject var65) {
        assert NIL != Types.symbolp(var25) : var25;
        assert NIL != Types.listp(var65) : var65;
        final SubLObject var66 = f51930();
        if (NIL != var66) {
            module0067.f4886(f51944(var66), var25, var65);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52013(final SubLObject var26, final SubLObject var27) {
        assert NIL != Types.symbolp(var26) : var26;
        assert NIL != Types.keywordp(var27) : var27;
        final SubLObject var28 = f51930();
        if (NIL != var28) {
            module0067.f4886(f51945(var28), var26, var27);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52014(final SubLObject var28, final SubLObject var68) {
        assert NIL != Types.symbolp(var28) : var28;
        assert NIL != Types.symbolp(var68) : var68;
        final SubLObject var69 = f51930();
        if (NIL != var69) {
            module0067.f4886(f51946(var69), var28, var68);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52015(final SubLObject var26, final SubLObject var68) {
        assert NIL != Types.symbolp(var26) : var26;
        assert NIL != Types.symbolp(var68) : var68;
        final SubLObject var69 = f51930();
        if (NIL != var69) {
            module0067.f4886(f51947(var69), var26, var68);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52016(final SubLObject var28) {
        assert NIL != Types.symbolp(var28) : var28;
        final SubLObject var29 = f51930();
        if (NIL != var29) {
            module0077.f5326(var28, f51948(var29));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52017(final SubLObject var20, final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var20) : var20;
        assert NIL != Types.stringp(var21) : var21;
        SubLObject var23 = f51968(var20, var21);
        SubLObject var24 = (SubLObject)NIL;
        try {
            final SubLObject var25 = stream_macros.$stream_requires_locking$.currentBinding(var22);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var22);
                var24 = compatibility.open_text(var21, (SubLObject)$ic100$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var25, var22);
            }
            if (!var24.isStream()) {
                Errors.error((SubLObject)$ic101$, var21);
            }
            final SubLObject var3_70 = var24;
            final SubLObject var26 = (SubLObject)NIL;
            final SubLObject var27 = module0809.f51518();
            final SubLObject var28 = (SubLObject)((NIL != var27) ? module0809.f51431(var27, var20, var26) : NIL);
            final SubLObject var29 = module0809.$g6429$.currentBinding(var22);
            try {
                module0809.$g6429$.bind(var28, var22);
                assert NIL != Types.stringp(var20) : var20;
                final SubLObject var52_75 = module0809.$g6430$.currentBinding(var22);
                final SubLObject var30 = $g6445$.currentBinding(var22);
                final SubLObject var31 = Packages.$package$.currentBinding(var22);
                final SubLObject var32 = reader.$read_default_float_format$.currentBinding(var22);
                final SubLObject var33 = module0018.$g571$.currentBinding(var22);
                try {
                    module0809.$g6430$.bind(var20, var22);
                    $g6445$.bind(var23, var22);
                    Packages.$package$.bind(module0018.$g576$.getGlobalValue(), var22);
                    reader.$read_default_float_format$.bind((SubLObject)$ic84$, var22);
                    module0018.$g571$.bind((SubLObject)NIL, var22);
                    SubLObject var34 = (SubLObject)NIL;
                    SubLObject var35 = (SubLObject)NIL;
                    var34 = streams_high.file_position(var3_70, (SubLObject)UNPROVIDED);
                    for (var35 = reader.read(var3_70, (SubLObject)NIL, (SubLObject)$ic102$, (SubLObject)UNPROVIDED); var35 != $ic102$; var35 = reader.read(var3_70, (SubLObject)NIL, (SubLObject)$ic102$, (SubLObject)UNPROVIDED)) {
                        final SubLObject var36 = var34;
                        assert NIL != module0004.f106(var36) : var36;
                        final SubLObject var52_76 = module0809.$g6431$.currentBinding(var22);
                        try {
                            module0809.$g6431$.bind(var36, var22);
                            f52018(var23, var35);
                        }
                        finally {
                            module0809.$g6431$.rebind(var52_76, var22);
                        }
                        var34 = streams_high.file_position(var3_70, (SubLObject)UNPROVIDED);
                    }
                    var23 = f52019(var23);
                }
                finally {
                    module0018.$g571$.rebind(var33, var22);
                    reader.$read_default_float_format$.rebind(var32, var22);
                    Packages.$package$.rebind(var31, var22);
                    $g6445$.rebind(var30, var22);
                    module0809.$g6430$.rebind(var52_75, var22);
                }
            }
            finally {
                module0809.$g6429$.rebind(var29, var22);
            }
            if (NIL != var28) {
                module0809.f51630(var27, var28);
            }
        }
        finally {
            final SubLObject var37 = Threads.$is_thread_performing_cleanupP$.currentBinding(var22);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var22);
                if (var24.isStream()) {
                    streams_high.close(var24, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var37, var22);
            }
        }
        return var23;
    }
    
    public static SubLObject f52018(final SubLObject var22, final SubLObject var63) {
        final SubLObject var64 = module0811.f51788(var63);
        f52020(var22, var64);
        return var64;
    }
    
    public static SubLObject f52020(final SubLObject var22, final SubLObject var40) {
        if (var40.isCons()) {
            final SubLObject var41 = var40.first();
            if (var41 == $ic104$) {
                SubLObject var42 = var40.rest();
                SubLObject var43 = (SubLObject)NIL;
                var43 = var42.first();
                while (NIL != var42) {
                    f52020(var22, var43);
                    var42 = var42.rest();
                    var43 = var42.first();
                }
            }
            else if (var41 == $ic105$) {
                final SubLObject var44 = conses_high.second(var40);
                f51996(var22, var44, var40);
            }
            else if (var41 == $ic106$) {
                final SubLObject var44 = conses_high.second(var40);
                f51997(var22, var44, var40);
            }
            else if (var41 == $ic107$ || var41 == $ic108$ || var41 == $ic109$ || var41 == $ic110$) {
                final SubLObject var45 = conses_high.second(var40);
                f51998(var22, var45, var40);
            }
            else if (var41 == $ic111$) {
                final SubLObject var46 = conses_high.getf(var40.rest(), (SubLObject)$ic112$, (SubLObject)UNPROVIDED);
                f51999(var22, var46, var40);
            }
            else if (var41 == $ic113$) {
                final SubLObject var47 = conses_high.second(var40);
                Packages.$package$.setDynamicValue(Packages.find_package(var47));
            }
            else {
                f52000(var22, var40);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52019(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        f51954(var22, Sequences.nreverse(f51939(var22)));
        f51955(var22, Sequences.nreverse(f51940(var22)));
        f51956(var22, Sequences.nreverse(f51941(var22)));
        f51957(var22, Sequences.nreverse(f51942(var22)));
        f51958(var22, Sequences.nreverse(f51943(var22)));
        var23.resetMultipleValues();
        final SubLObject var24 = f52021(var22);
        final SubLObject var25 = var23.secondMultipleValue();
        final SubLObject var26 = var23.thirdMultipleValue();
        var23.resetMultipleValues();
        final SubLObject var27 = conses_high.second(var24);
        final SubLObject var28 = conses_high.second(var25);
        final SubLObject var29 = conses_high.second(var26);
        f51954(var22, ConsesLow.nconc(f51939(var22), (SubLObject)ConsesLow.list(var24, var25, var26)));
        f51957(var22, ConsesLow.nconc(f51942(var22), (SubLObject)ConsesLow.list(var27, var28, var29)));
        module0813.f52112(f51934(var22), var27, var28, var29);
        return var22;
    }
    
    public static SubLObject f52021(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = (SubLObject)NIL;
        final SubLObject var27 = f51934(var22);
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = f51975(var22);
        SubLObject var31 = (SubLObject)NIL;
        var31 = var30.first();
        while (NIL != var30) {
            SubLObject var33;
            final SubLObject var32 = var33 = var31;
            SubLObject var34 = (SubLObject)NIL;
            SubLObject var35 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)$ic114$);
            var34 = var33.first();
            var33 = (var35 = var33.rest());
            final SubLObject var36 = f52009(var34);
            var29 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic115$, var35, var34, var36), var29);
            var30 = var30.rest();
            var31 = var30.first();
        }
        var30 = f51939(var22);
        SubLObject var37 = (SubLObject)NIL;
        var37 = var30.first();
        while (NIL != var30) {
            SubLObject var39;
            final SubLObject var38 = var39 = var37;
            SubLObject var40 = (SubLObject)NIL;
            SubLObject var41 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var39, var38, (SubLObject)$ic116$);
            var40 = var39.first();
            var39 = var39.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var39, var38, (SubLObject)$ic116$);
            var41 = var39.first();
            final SubLObject var42;
            var39 = (var42 = var39.rest());
            if (var40 == $ic106$) {
                var28 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic117$, var41), var28);
            }
            else if (var40 == $ic105$) {
                SubLObject var103_104;
                final SubLObject var101_102 = var103_104 = var42;
                SubLObject var43 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var103_104, var101_102, (SubLObject)$ic118$);
                var43 = var103_104.first();
                final SubLObject var44;
                var103_104 = (var44 = var103_104.rest());
                var23.resetMultipleValues();
                final SubLObject var45 = f52006(var43);
                final SubLObject var46 = var23.secondMultipleValue();
                final SubLObject var47 = var23.thirdMultipleValue();
                var23.resetMultipleValues();
                var28 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic119$, var41, var45, var46, var47), var28);
            }
            else if (var40 == $ic107$ || var40 == $ic108$ || var40 == $ic109$ || var40 == $ic110$) {
                SubLObject var110_111;
                final SubLObject var108_109 = var110_111 = var42;
                SubLObject var48 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var110_111, var108_109, (SubLObject)$ic120$);
                var48 = var110_111.first();
                var110_111 = var110_111.rest();
                final SubLObject var49 = (SubLObject)(var110_111.isCons() ? var110_111.first() : NIL);
                cdestructuring_bind.destructuring_bind_must_listp(var110_111, var108_109, (SubLObject)$ic120$);
                var110_111 = var110_111.rest();
                if (NIL == var110_111) {
                    var29 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic121$, var40, var41, var48), var29);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var108_109, (SubLObject)$ic120$);
                }
            }
            var30 = var30.rest();
            var37 = var30.first();
        }
        final SubLObject var50 = Sequences.cconcatenate((SubLObject)$ic122$, new SubLObject[] { module0006.f203(var27), $ic123$ });
        final SubLObject var51 = Packages.intern(var50, Packages.$package$.getDynamicValue(var23));
        f52012(var51, (SubLObject)NIL);
        var24 = (SubLObject)ConsesLow.listS((SubLObject)$ic105$, var51, (SubLObject)NIL, ConsesLow.append(Sequences.nreverse(var28), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic124$, module0811.f51788((SubLObject)NIL)))));
        final SubLObject var52 = Sequences.cconcatenate((SubLObject)$ic125$, new SubLObject[] { module0006.f203(var27), $ic123$ });
        final SubLObject var53 = Packages.intern(var52, Packages.$package$.getDynamicValue(var23));
        f52012(var53, (SubLObject)NIL);
        var25 = (SubLObject)ConsesLow.listS((SubLObject)$ic105$, var53, (SubLObject)NIL, ConsesLow.append(Sequences.nreverse(var29), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic124$, module0811.f51788((SubLObject)NIL)))));
        final SubLObject var54 = Sequences.cconcatenate((SubLObject)$ic126$, new SubLObject[] { module0006.f203(var27), $ic123$ });
        final SubLObject var55 = Packages.intern(var54, Packages.$package$.getDynamicValue(var23));
        f52012(var55, (SubLObject)NIL);
        var26 = (SubLObject)ConsesLow.listS((SubLObject)$ic105$, var55, (SubLObject)NIL, ConsesLow.append(f51940(var22), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic124$, module0811.f51788((SubLObject)NIL)))));
        return Values.values(var24, var25, var26);
    }
    
    public static SubLObject f52022(final SubLObject var22) {
        final SubLObject var23 = module0813.f52032();
        if (NIL != var23) {
            final SubLObject var24 = f51970(var22);
            return module0813.f52089(var23, var24);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52023(final SubLObject var22) {
        final SubLObject var23 = module0813.f52032();
        if (NIL != var23) {
            final SubLObject var24 = f51970(var22);
            return module0813.f52090(var23, var24);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52024(final SubLObject var22) {
        final SubLObject var23 = module0813.f52032();
        if (NIL != var23) {
            final SubLObject var24 = f51970(var22);
            return module0813.f52091(var23, var24);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52025(final SubLObject var28) {
        if (var28.isSymbol()) {
            final SubLObject var29 = f51930();
            return (SubLObject)makeBoolean(NIL != var29 && (var28.eql(f52022(var29)) || var28.eql(f52023(var29)) || var28.eql(f52024(var29))));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52009(SubLObject var14) {
        if (var14.isVector()) {
            SubLObject var15 = (SubLObject)NIL;
            final SubLObject var16 = var14;
            final SubLObject var17 = (SubLObject)NIL;
            SubLObject var18;
            SubLObject var19;
            SubLObject var20;
            SubLObject var21;
            for (var18 = Sequences.length(var16), var19 = (SubLObject)NIL, var19 = (SubLObject)ZERO_INTEGER; var19.numL(var18); var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER)) {
                var20 = ((NIL != var17) ? Numbers.subtract(var18, var19, (SubLObject)ONE_INTEGER) : var19);
                var21 = Vectors.aref(var16, var20);
                var15 = (SubLObject)ConsesLow.cons(f52009(var21), var15);
            }
            return reader.bq_cons((SubLObject)$ic127$, ConsesLow.append(Sequences.nreverse(var15), (SubLObject)NIL));
        }
        if (var14.isCons()) {
            SubLObject var15 = (SubLObject)NIL;
            SubLObject var22 = (SubLObject)NIL;
            SubLObject var23;
            SubLObject var24;
            for (var23 = (SubLObject)NIL, var23 = var14; !var23.isAtom(); var23 = var23.rest()) {
                var24 = var23.first();
                var15 = (SubLObject)ConsesLow.cons(f52009(var24), var15);
            }
            if (NIL != module0035.f1996(var14)) {
                var22 = f52009(conses_high.last(var14, (SubLObject)UNPROVIDED).rest());
            }
            if (NIL == var22) {
                return reader.bq_cons((SubLObject)$ic128$, ConsesLow.append(Sequences.nreverse(var15), (SubLObject)NIL));
            }
            if (NIL != module0035.f1997(var15)) {
                return (SubLObject)ConsesLow.list((SubLObject)$ic129$, var15.first(), var22);
            }
            return reader.bq_cons((SubLObject)$ic130$, ConsesLow.append(Sequences.nreverse(var15), (SubLObject)ConsesLow.list(var22)));
        }
        else {
            if (NIL != f52008(var14)) {
                return (SubLObject)ConsesLow.list((SubLObject)$ic95$, var14);
            }
            if (var14.isFunction()) {
                final SubLObject var25 = f52026(var14);
                final SubLObject var26 = f52009(var25);
                return (SubLObject)ConsesLow.list((SubLObject)$ic131$, var26);
            }
            if (NIL != constant_handles_oc.f8449(var14)) {
                final SubLObject var27 = constants_high_oc.f10743(var14);
                f52011((SubLObject)$ic132$);
                return (SubLObject)ConsesLow.list((SubLObject)$ic132$, f52009(var27));
            }
            var14 = module0811.f51790(var14);
            return (SubLObject)ConsesLow.list((SubLObject)$ic133$, var14);
        }
    }
    
    public static SubLObject f52026(final SubLObject var14) {
        if (var14.eql(Symbols.symbol_function((SubLObject)EQ))) {
            return (SubLObject)EQ;
        }
        if (var14.eql(Symbols.symbol_function((SubLObject)EQL))) {
            return (SubLObject)EQL;
        }
        if (var14.eql(Symbols.symbol_function((SubLObject)EQUAL))) {
            return (SubLObject)EQUAL;
        }
        if (var14.eql(Symbols.symbol_function((SubLObject)EQUALP))) {
            return (SubLObject)EQUALP;
        }
        return Errors.error((SubLObject)$ic134$, var14);
    }
    
    public static SubLObject f52008(final SubLObject var14) {
        return module0035.f2169(var14, $g6448$.getGlobalValue());
    }
    
    public static SubLObject f52027() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51930", "S#56743", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51931", "S#56744", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51933", "S#56738", 1, 0, false);
        new $f51933$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51934", "S#56745", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51935", "S#56746", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51936", "S#56747", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51937", "S#56748", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51938", "S#56749", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51939", "S#56750", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51940", "S#56751", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51941", "S#56752", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51942", "S#56753", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51943", "S#56754", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51944", "S#56755", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51945", "S#56756", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51946", "S#56757", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51947", "S#56758", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51948", "S#56759", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51949", "S#56760", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51950", "S#56761", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51951", "S#56762", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51952", "S#56763", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51953", "S#56764", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51954", "S#56765", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51955", "S#56766", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51956", "S#56767", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51957", "S#56768", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51958", "S#56769", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51959", "S#56770", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51960", "S#56771", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51961", "S#56772", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51962", "S#56773", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51963", "S#56774", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51964", "S#56775", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51965", "S#56776", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51966", "S#56777", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51932", "S#56778", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51967", "S#56779", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51968", "S#56780", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51969", "S#56781", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51970", "S#56782", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51971", "S#56783", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51972", "S#56784", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51973", "S#56785", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51974", "S#56786", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51975", "S#56787", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51976", "S#56788", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51977", "S#56789", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51978", "S#56790", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51979", "S#56791", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51980", "S#56792", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51982", "S#56793", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51983", "S#56794", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51984", "S#56795", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51985", "S#56796", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51986", "S#56515", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51987", "S#56797", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51981", "S#56798", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51988", "S#56799", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51989", "S#56800", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51990", "S#56801", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51991", "S#56802", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51992", "S#56803", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51993", "S#56804", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51994", "S#56805", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51995", "S#56806", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51996", "S#56807", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51997", "S#56808", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51998", "S#56809", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f51999", "S#56810", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52000", "S#56811", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0812", "f52001", "S#56812");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52002", "S#56813", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52003", "S#56814", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52004", "S#56815", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52005", "S#56816", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52006", "S#56817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52007", "S#56514", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52010", "S#56516", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52011", "S#56517", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52012", "S#56527", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52013", "S#56526", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52014", "S#56531", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52015", "S#56532", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52016", "S#56534", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52017", "S#56818", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52018", "S#56819", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52020", "S#56820", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52019", "S#56821", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52021", "S#56822", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52022", "S#56823", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52023", "S#56824", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52024", "S#56825", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52025", "S#56826", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52009", "S#56827", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52026", "S#56828", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0812", "f52008", "S#56829", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52028() {
        $g6445$ = SubLFiles.defparameter("S#56830", (SubLObject)NIL);
        $g6446$ = SubLFiles.defconstant("S#56831", (SubLObject)$ic0$);
        $g6447$ = SubLFiles.deflexical("S#56832", (SubLObject)$ic73$);
        $g6448$ = SubLFiles.deflexical("S#56833", (SubLObject)$ic135$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52029() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g6446$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Structures.def_csetf((SubLObject)$ic17$, (SubLObject)$ic18$);
        Structures.def_csetf((SubLObject)$ic19$, (SubLObject)$ic20$);
        Structures.def_csetf((SubLObject)$ic21$, (SubLObject)$ic22$);
        Structures.def_csetf((SubLObject)$ic23$, (SubLObject)$ic24$);
        Structures.def_csetf((SubLObject)$ic25$, (SubLObject)$ic26$);
        Structures.def_csetf((SubLObject)$ic27$, (SubLObject)$ic28$);
        Structures.def_csetf((SubLObject)$ic29$, (SubLObject)$ic30$);
        Structures.def_csetf((SubLObject)$ic31$, (SubLObject)$ic32$);
        Structures.def_csetf((SubLObject)$ic33$, (SubLObject)$ic34$);
        Structures.def_csetf((SubLObject)$ic35$, (SubLObject)$ic36$);
        Structures.def_csetf((SubLObject)$ic37$, (SubLObject)$ic38$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g6446$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic59$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g6446$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic63$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f52027();
    }
    
    public void initializeVariables() {
        f52028();
    }
    
    public void runTopLevelForms() {
        f52029();
    }
    
    static {
        me = (SubLFile)new module0812();
        $g6445$ = null;
        $g6446$ = null;
        $g6447$ = null;
        $g6448$ = null;
        $ic0$ = makeSymbol("S#56737", "CYC");
        $ic1$ = makeSymbol("S#56738", "CYC");
        $ic2$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#214", "CYC"), makeSymbol("S#885", "CYC"), makeSymbol("S#56834", "CYC"), makeSymbol("S#56835", "CYC"), makeSymbol("S#56836", "CYC"), makeSymbol("S#56837", "CYC"), makeSymbol("S#56838", "CYC"), makeSymbol("S#56839", "CYC"), makeSymbol("S#56840", "CYC"), makeSymbol("S#56841", "CYC"), makeSymbol("S#56842", "CYC"), makeSymbol("S#56843", "CYC"), makeSymbol("S#56844", "CYC"), makeSymbol("S#56845", "CYC"), makeSymbol("S#56846", "CYC") });
        $ic3$ = ConsesLow.list(new SubLObject[] { makeKeyword("MODULE-NAME"), makeKeyword("FILENAME"), makeKeyword("INTERNAL-CONSTANTS"), makeKeyword("REFERENCED-GLOBALS"), makeKeyword("REFERENCED-FUNCTIONS"), makeKeyword("DEFINITIONS"), makeKeyword("TOP-LEVEL-FORMS"), makeKeyword("DEFINED-GLOBALS"), makeKeyword("DEFINED-FUNCTIONS"), makeKeyword("DEFINED-MACROS"), makeKeyword("ARGLIST-TABLE"), makeKeyword("BINDING-TYPE-TABLE"), makeKeyword("METHOD-VISIBILITY-TABLE"), makeKeyword("GLOBAL-VISIBILITY-TABLE"), makeKeyword("RWBC-METHODS") });
        $ic4$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#56745", "CYC"), makeSymbol("S#56746", "CYC"), makeSymbol("S#56747", "CYC"), makeSymbol("S#56748", "CYC"), makeSymbol("S#56749", "CYC"), makeSymbol("S#56750", "CYC"), makeSymbol("S#56751", "CYC"), makeSymbol("S#56752", "CYC"), makeSymbol("S#56753", "CYC"), makeSymbol("S#56754", "CYC"), makeSymbol("S#56755", "CYC"), makeSymbol("S#56756", "CYC"), makeSymbol("S#56757", "CYC"), makeSymbol("S#56758", "CYC"), makeSymbol("S#56759", "CYC") });
        $ic5$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#56760", "CYC"), makeSymbol("S#56761", "CYC"), makeSymbol("S#56762", "CYC"), makeSymbol("S#56763", "CYC"), makeSymbol("S#56764", "CYC"), makeSymbol("S#56765", "CYC"), makeSymbol("S#56766", "CYC"), makeSymbol("S#56767", "CYC"), makeSymbol("S#56768", "CYC"), makeSymbol("S#56769", "CYC"), makeSymbol("S#56770", "CYC"), makeSymbol("S#56771", "CYC"), makeSymbol("S#56772", "CYC"), makeSymbol("S#56773", "CYC"), makeSymbol("S#56774", "CYC") });
        $ic6$ = makeSymbol("S#56778", "CYC");
        $ic7$ = makeSymbol("S#56744", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#56738", "CYC"));
        $ic9$ = makeSymbol("S#56745", "CYC");
        $ic10$ = makeSymbol("S#56760", "CYC");
        $ic11$ = makeSymbol("S#56746", "CYC");
        $ic12$ = makeSymbol("S#56761", "CYC");
        $ic13$ = makeSymbol("S#56747", "CYC");
        $ic14$ = makeSymbol("S#56762", "CYC");
        $ic15$ = makeSymbol("S#56748", "CYC");
        $ic16$ = makeSymbol("S#56763", "CYC");
        $ic17$ = makeSymbol("S#56749", "CYC");
        $ic18$ = makeSymbol("S#56764", "CYC");
        $ic19$ = makeSymbol("S#56750", "CYC");
        $ic20$ = makeSymbol("S#56765", "CYC");
        $ic21$ = makeSymbol("S#56751", "CYC");
        $ic22$ = makeSymbol("S#56766", "CYC");
        $ic23$ = makeSymbol("S#56752", "CYC");
        $ic24$ = makeSymbol("S#56767", "CYC");
        $ic25$ = makeSymbol("S#56753", "CYC");
        $ic26$ = makeSymbol("S#56768", "CYC");
        $ic27$ = makeSymbol("S#56754", "CYC");
        $ic28$ = makeSymbol("S#56769", "CYC");
        $ic29$ = makeSymbol("S#56755", "CYC");
        $ic30$ = makeSymbol("S#56770", "CYC");
        $ic31$ = makeSymbol("S#56756", "CYC");
        $ic32$ = makeSymbol("S#56771", "CYC");
        $ic33$ = makeSymbol("S#56757", "CYC");
        $ic34$ = makeSymbol("S#56772", "CYC");
        $ic35$ = makeSymbol("S#56758", "CYC");
        $ic36$ = makeSymbol("S#56773", "CYC");
        $ic37$ = makeSymbol("S#56759", "CYC");
        $ic38$ = makeSymbol("S#56774", "CYC");
        $ic39$ = makeKeyword("MODULE-NAME");
        $ic40$ = makeKeyword("FILENAME");
        $ic41$ = makeKeyword("INTERNAL-CONSTANTS");
        $ic42$ = makeKeyword("REFERENCED-GLOBALS");
        $ic43$ = makeKeyword("REFERENCED-FUNCTIONS");
        $ic44$ = makeKeyword("DEFINITIONS");
        $ic45$ = makeKeyword("TOP-LEVEL-FORMS");
        $ic46$ = makeKeyword("DEFINED-GLOBALS");
        $ic47$ = makeKeyword("DEFINED-FUNCTIONS");
        $ic48$ = makeKeyword("DEFINED-MACROS");
        $ic49$ = makeKeyword("ARGLIST-TABLE");
        $ic50$ = makeKeyword("BINDING-TYPE-TABLE");
        $ic51$ = makeKeyword("METHOD-VISIBILITY-TABLE");
        $ic52$ = makeKeyword("GLOBAL-VISIBILITY-TABLE");
        $ic53$ = makeKeyword("RWBC-METHODS");
        $ic54$ = makeString("Invalid slot ~S for construction function");
        $ic55$ = makeKeyword("BEGIN");
        $ic56$ = makeSymbol("S#56775", "CYC");
        $ic57$ = makeKeyword("SLOT");
        $ic58$ = makeKeyword("END");
        $ic59$ = makeSymbol("S#56777", "CYC");
        $ic60$ = makeString("#<");
        $ic61$ = makeKeyword("STREAM");
        $ic62$ = makeKeyword("BASE");
        $ic63$ = makeSymbol("S#56779", "CYC");
        $ic64$ = makeSymbol("STRINGP");
        $ic65$ = makeKeyword("FREE");
        $ic66$ = makeSymbol("<");
        $ic67$ = makeSymbol("CDR");
        $ic68$ = makeSymbol("STRING-LESSP");
        $ic69$ = makeSymbol("SYMBOL-NAME");
        $ic70$ = makeKeyword("UNSPECIFIED");
        $ic71$ = makeSymbol("PROTECTED");
        $ic72$ = makeSymbol("PRIVATE");
        $ic73$ = ConsesLow.list((SubLObject)makeSymbol("DEFCONSTANT"), (SubLObject)makeSymbol("DEFLEXICAL"), (SubLObject)makeSymbol("S#34", "CYC"), (SubLObject)makeSymbol("DEFPARAMETER"), (SubLObject)makeSymbol("DEFVAR"));
        $ic74$ = ConsesLow.list((SubLObject)makeSymbol("S#752", "CYC"), (SubLObject)makeSymbol("S#673", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#56847", "CYC"), (SubLObject)makeSymbol("DOCUMENTATION"));
        $ic75$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6512", "CYC"), (SubLObject)makeSymbol("S#885", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic76$ = makeUninternedSymbol("US#2150FF3");
        $ic77$ = makeSymbol("S#6776", "CYC");
        $ic78$ = ConsesLow.list((SubLObject)makeInteger(1048576));
        $ic79$ = makeSymbol("CLET");
        $ic80$ = makeSymbol("WITH-PRIVATE-TEXT-FILE");
        $ic81$ = ConsesLow.list((SubLObject)makeKeyword("OUTPUT"));
        $ic82$ = makeString("/dev/null");
        $ic83$ = makeKeyword("DOWNCASE");
        $ic84$ = makeSymbol("DOUBLE-FLOAT");
        $ic85$ = makeString(";; Trans SubL File : ~S");
        $ic86$ = makeString("~%;; Location        : ~S");
        $ic87$ = makeString("~%~%;; Referenced Globals :");
        $ic88$ = makeString("~%~%;; Referenced Functions :");
        $ic89$ = makeString("~%~%;; Internal Constants :");
        $ic90$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("CONSTANT", "CYC"), (SubLObject)makeSymbol("S#10595", "CYC"));
        $ic91$ = makeString("~%~S : ~S");
        $ic92$ = makeString("~%~%;; Definitions :");
        $ic93$ = makeSymbol("&OPTIONAL");
        $ic94$ = makeSymbol("&REST");
        $ic95$ = makeSymbol("S#56848", "CYC");
        $ic96$ = makeSymbol("S#56849", "CYC");
        $ic97$ = makeSymbol("SYMBOLP");
        $ic98$ = makeSymbol("LISTP");
        $ic99$ = makeSymbol("KEYWORDP");
        $ic100$ = makeKeyword("INPUT");
        $ic101$ = makeString("Unable to open ~S");
        $ic102$ = makeKeyword("EOF");
        $ic103$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic104$ = makeSymbol("PROGN");
        $ic105$ = makeSymbol("DEFINE");
        $ic106$ = makeSymbol("S#56710", "CYC");
        $ic107$ = makeSymbol("DEFVAR");
        $ic108$ = makeSymbol("DEFPARAMETER");
        $ic109$ = makeSymbol("DEFLEXICAL");
        $ic110$ = makeSymbol("DEFCONSTANT");
        $ic111$ = makeSymbol("S#56711", "CYC");
        $ic112$ = makeKeyword("NAME");
        $ic113$ = makeSymbol("IN-PACKAGE");
        $ic114$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#56850", "CYC"), (SubLObject)makeSymbol("S#10595", "CYC"));
        $ic115$ = makeSymbol("S#56851", "CYC");
        $ic116$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("REST"));
        $ic117$ = makeSymbol("S#56852", "CYC");
        $ic118$ = ConsesLow.list((SubLObject)makeSymbol("S#30", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic119$ = makeSymbol("S#56853", "CYC");
        $ic120$ = ConsesLow.list((SubLObject)makeSymbol("S#33", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("DOCUMENTATION"));
        $ic121$ = makeSymbol("S#56854", "CYC");
        $ic122$ = makeString("DECLARE-");
        $ic123$ = makeString("-FILE");
        $ic124$ = makeSymbol("RET");
        $ic125$ = makeString("INIT-");
        $ic126$ = makeString("SETUP-");
        $ic127$ = makeSymbol("VECTOR");
        $ic128$ = makeSymbol("LIST");
        $ic129$ = makeSymbol("CONS");
        $ic130$ = makeSymbol("LIST*");
        $ic131$ = makeSymbol("SYMBOL-FUNCTION");
        $ic132$ = makeSymbol("S#10575", "CYC");
        $ic133$ = makeSymbol("S#56855", "CYC");
        $ic134$ = makeString("Time to implement function constant translation for ~S");
        $ic135$ = ConsesLow.list(new SubLObject[] { T, NIL, EQ, EQL, EQUAL, EQUALP, IDENTITY, MINUS_ONE_INTEGER, ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, Characters.CHAR_null, Characters.CHAR_backspace, Characters.CHAR_tab, Characters.CHAR_newline, Characters.CHAR_return, Characters.CHAR_page, Characters.CHAR_escape, Characters.CHAR_space, Characters.CHAR_exclamation, Characters.CHAR_quotation, Characters.CHAR_hash, Characters.CHAR_dollar, Characters.CHAR_percent, Characters.CHAR_ampersand, Characters.CHAR_quote, Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_asterisk, Characters.CHAR_plus, Characters.CHAR_comma, Characters.CHAR_hyphen, Characters.CHAR_period, Characters.CHAR_slash, Characters.CHAR_0, Characters.CHAR_1, Characters.CHAR_2, Characters.CHAR_3, Characters.CHAR_4, Characters.CHAR_5, Characters.CHAR_6, Characters.CHAR_7, Characters.CHAR_8, Characters.CHAR_9, Characters.CHAR_colon, Characters.CHAR_semicolon, Characters.CHAR_less, Characters.CHAR_equal, Characters.CHAR_greater, Characters.CHAR_question, Characters.CHAR_at, Characters.CHAR_A, Characters.CHAR_B, Characters.CHAR_C, Characters.CHAR_D, Characters.CHAR_E, Characters.CHAR_F, Characters.CHAR_G, Characters.CHAR_H, Characters.CHAR_I, Characters.CHAR_J, Characters.CHAR_K, Characters.CHAR_L, Characters.CHAR_M, Characters.CHAR_N, Characters.CHAR_O, Characters.CHAR_P, Characters.CHAR_Q, Characters.CHAR_R, Characters.CHAR_S, Characters.CHAR_T, Characters.CHAR_U, Characters.CHAR_V, Characters.CHAR_W, Characters.CHAR_X, Characters.CHAR_Y, Characters.CHAR_Z, Characters.CHAR_lbracket, Characters.CHAR_backslash, Characters.CHAR_rbracket, Characters.CHAR_caret, Characters.CHAR_underbar, Characters.CHAR_backquote, Characters.CHAR_a, Characters.CHAR_b, Characters.CHAR_c, Characters.CHAR_d, Characters.CHAR_e, Characters.CHAR_f, Characters.CHAR_g, Characters.CHAR_h, Characters.CHAR_i, Characters.CHAR_j, Characters.CHAR_k, Characters.CHAR_l, Characters.CHAR_m, Characters.CHAR_n, Characters.CHAR_o, Characters.CHAR_p, Characters.CHAR_q, Characters.CHAR_r, Characters.CHAR_s, Characters.CHAR_t, Characters.CHAR_u, Characters.CHAR_v, Characters.CHAR_w, Characters.CHAR_x, Characters.CHAR_y, Characters.CHAR_z, Characters.CHAR_lbrace, Characters.CHAR_vertical, Characters.CHAR_rbrace, Characters.CHAR_tilde, Characters.CHAR_rubout });
    }
    
    public static final class $sX56737_native extends SubLStructNative
    {
        public SubLObject $module_name;
        public SubLObject $filename;
        public SubLObject $internal_constants;
        public SubLObject $referenced_globals;
        public SubLObject $referenced_functions;
        public SubLObject $definitions;
        public SubLObject $top_level_forms;
        public SubLObject $defined_globals;
        public SubLObject $defined_functions;
        public SubLObject $defined_macros;
        public SubLObject $arglist_table;
        public SubLObject $binding_type_table;
        public SubLObject $method_visibility_table;
        public SubLObject $global_visibility_table;
        public SubLObject $rwbc_methods;
        public static final SubLStructDeclNative structDecl;
        
        public $sX56737_native() {
            this.$module_name = (SubLObject)CommonSymbols.NIL;
            this.$filename = (SubLObject)CommonSymbols.NIL;
            this.$internal_constants = (SubLObject)CommonSymbols.NIL;
            this.$referenced_globals = (SubLObject)CommonSymbols.NIL;
            this.$referenced_functions = (SubLObject)CommonSymbols.NIL;
            this.$definitions = (SubLObject)CommonSymbols.NIL;
            this.$top_level_forms = (SubLObject)CommonSymbols.NIL;
            this.$defined_globals = (SubLObject)CommonSymbols.NIL;
            this.$defined_functions = (SubLObject)CommonSymbols.NIL;
            this.$defined_macros = (SubLObject)CommonSymbols.NIL;
            this.$arglist_table = (SubLObject)CommonSymbols.NIL;
            this.$binding_type_table = (SubLObject)CommonSymbols.NIL;
            this.$method_visibility_table = (SubLObject)CommonSymbols.NIL;
            this.$global_visibility_table = (SubLObject)CommonSymbols.NIL;
            this.$rwbc_methods = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX56737_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$module_name;
        }
        
        public SubLObject getField3() {
            return this.$filename;
        }
        
        public SubLObject getField4() {
            return this.$internal_constants;
        }
        
        public SubLObject getField5() {
            return this.$referenced_globals;
        }
        
        public SubLObject getField6() {
            return this.$referenced_functions;
        }
        
        public SubLObject getField7() {
            return this.$definitions;
        }
        
        public SubLObject getField8() {
            return this.$top_level_forms;
        }
        
        public SubLObject getField9() {
            return this.$defined_globals;
        }
        
        public SubLObject getField10() {
            return this.$defined_functions;
        }
        
        public SubLObject getField11() {
            return this.$defined_macros;
        }
        
        public SubLObject getField12() {
            return this.$arglist_table;
        }
        
        public SubLObject getField13() {
            return this.$binding_type_table;
        }
        
        public SubLObject getField14() {
            return this.$method_visibility_table;
        }
        
        public SubLObject getField15() {
            return this.$global_visibility_table;
        }
        
        public SubLObject getField16() {
            return this.$rwbc_methods;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$module_name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$filename = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$internal_constants = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$referenced_globals = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$referenced_functions = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$definitions = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$top_level_forms = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$defined_globals = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$defined_functions = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$defined_macros = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$arglist_table = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$binding_type_table = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$method_visibility_table = value;
        }
        
        public SubLObject setField15(final SubLObject value) {
            return this.$global_visibility_table = value;
        }
        
        public SubLObject setField16(final SubLObject value) {
            return this.$rwbc_methods = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX56737_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$module_name", "$filename", "$internal_constants", "$referenced_globals", "$referenced_functions", "$definitions", "$top_level_forms", "$defined_globals", "$defined_functions", "$defined_macros", "$arglist_table", "$binding_type_table", "$method_visibility_table", "$global_visibility_table", "$rwbc_methods" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f51933$UnaryFunction extends UnaryFunction
    {
        public $f51933$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#56738"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return f51933(var4);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 400 ms
	
	Decompiled with Procyon 0.5.32.
*/