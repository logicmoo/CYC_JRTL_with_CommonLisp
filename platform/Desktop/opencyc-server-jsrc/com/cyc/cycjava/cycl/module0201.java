package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0201 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0201";
    public static final String myFingerPrint = "6e9e6638714627aa795908aeb0682869b5dc53e01e74b5c30a9c9cd56c8f9349";
    private static SubLSymbol $g2287$;
    private static SubLSymbol $g2288$;
    private static SubLSymbol $g2289$;
    private static SubLSymbol $g2290$;
    public static SubLSymbol $g2291$;
    private static SubLSymbol $g2292$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLString $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLInteger $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
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
    private static final SubLList $ic25$;
    
    public static SubLObject f12538() {
        return $g2287$.getGlobalValue();
    }
    
    public static SubLObject f12539() {
        return $g2288$.getGlobalValue();
    }
    
    public static SubLObject f12540() {
        return $g2289$.getGlobalValue();
    }
    
    public static SubLObject f12541(final SubLObject var1) {
        return Characters.charE(var1, f12538());
    }
    
    public static SubLObject f12542(final SubLObject var2) {
        return f12541(Strings.sublisp_char(var2, (SubLObject)ZERO_INTEGER));
    }
    
    public static SubLObject f12543(final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL != f12541(Strings.sublisp_char(var2, (SubLObject)ZERO_INTEGER)) && NIL != f12541(Strings.sublisp_char(var2, (SubLObject)ONE_INTEGER)));
    }
    
    public static SubLObject f12544(final SubLObject var1) {
        return Characters.charE(var1, f12540());
    }
    
    public static SubLObject f12545(final SubLObject var3) {
        return (SubLObject)makeBoolean(NIL != module0038.f2802(var3) || NIL != f12544(var3) || NIL != f12541(var3));
    }
    
    public static SubLObject f12546(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isSymbol() && NIL != var1 && !var1.isKeyword() && NIL != f12547(f12548(var1)));
    }
    
    public static SubLObject f12549(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f12546(var1) && NIL != f12547(Sequences.subseq(f12548(var1), (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f12548(final SubLObject var5) {
        assert NIL != Types.symbolp(var5) : var5;
        return Symbols.symbol_name(var5);
    }
    
    public static SubLObject f12547(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isString() && NIL != module0035.f2002(var1, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL != f12542(var1));
    }
    
    public static SubLObject f12550(final SubLObject var1) {
        final SubLObject var2 = f12551(var1);
        return var2;
    }
    
    public static SubLObject f12552(final SubLObject var1) {
        if (NIL != f12547(var1)) {
            return Strings.string_upcase(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return Strings.string_upcase(Sequences.cconcatenate(module0006.f203(f12539()), module0006.f203(var1)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12553(final SubLObject var1) {
        if (NIL != f12554(var1)) {
            return var1;
        }
        final SubLObject var2 = module0202.f12699(var1);
        if (NIL != var2) {
            return var2;
        }
        return f12552(var1);
    }
    
    public static SubLObject f12555(final SubLObject var1) {
        return Packages.intern(f12553(var1), module0018.$g577$.getGlobalValue());
    }
    
    public static SubLObject f12556(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL == module0038.f2802(var1) && NIL == f12544(var1));
    }
    
    public static SubLObject f12557(final SubLObject var1) {
        if (var1.isSymbol() && !var1.isKeyword()) {
            return f12554(f12548(var1));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12554(final SubLObject var1) {
        if (!var1.isString() || NIL != module0038.f2608(var1) || NIL == f12542(var1)) {
            return (SubLObject)NIL;
        }
        final SubLObject var2 = Sequences.length(var1);
        SubLObject var3 = Numbers.subtract(var2, (SubLObject)ONE_INTEGER);
        SubLObject var4 = (SubLObject)ONE_INTEGER;
        if (!var2.numG((SubLObject)ONE_INTEGER)) {
            return (SubLObject)NIL;
        }
        if (NIL != f12543(var1)) {
            if (!var2.numG((SubLObject)TWO_INTEGER)) {
                return (SubLObject)NIL;
            }
            var4 = (SubLObject)TWO_INTEGER;
        }
        if (var3.numLE(var4)) {
            var3 = Numbers.add(var4, (SubLObject)ONE_INTEGER);
        }
        if (NIL != f12558(Sequences.subseq(var1, var4, var3))) {
            return module0038.f2802(Strings.sublisp_char(var1, Numbers.subtract(var2, (SubLObject)ONE_INTEGER)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12558(final SubLObject var1) {
        if (NIL != module0035.f2002(var1, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)makeBoolean(NIL != Characters.upper_case_p(Strings.sublisp_char(var1, (SubLObject)ZERO_INTEGER)) && NIL == Sequences.find_if((SubLObject)$ic7$, Sequences.subseq(var1, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == Sequences.search(f12559(), var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12559() {
        return $g2290$.getGlobalValue();
    }
    
    public static SubLObject f12560(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = Packages.$package$.currentBinding(var2);
        try {
            Packages.$package$.bind(module0018.$g577$.getGlobalValue(), var2);
            var3 = Symbols.gensym(f12552(var1));
        }
        finally {
            Packages.$package$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f12561(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = Packages.$package$.currentBinding(var2);
        try {
            Packages.$package$.bind(module0018.$g577$.getGlobalValue(), var2);
            var3 = Symbols.gentemp(f12552(var1));
        }
        finally {
            Packages.$package$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f12551(final SubLObject var1) {
        return Packages.intern(f12552(var1), module0018.$g577$.getGlobalValue());
    }
    
    public static SubLObject f12562(final SubLObject var2, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = f12538();
        }
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)T;
        final SubLObject var17 = Sequences.length(var2);
        final SubLObject var18 = Numbers.subtract(var17, (SubLObject)ONE_INTEGER);
        SubLObject var19_20;
        SubLObject var19;
        SubLObject var20;
        SubLObject var21;
        SubLObject var22;
        for (var19 = (var19_20 = Sequences.length(var2)), var20 = (SubLObject)NIL, var20 = (SubLObject)ZERO_INTEGER; !var20.numGE(var19_20); var20 = module0048.f_1X(var20)) {
            var21 = Strings.sublisp_char(var2, var20);
            if (NIL != var16 && NIL != Characters.charE(var21, var12)) {
                var14 = var20;
                var15 = (SubLObject)T;
            }
            else if (NIL != var15 && (NIL != module0038.f2681(var21) || NIL != module0038.f2760(var21) || var20.numE(var18))) {
                var15 = (SubLObject)NIL;
                var16 = (SubLObject)T;
                var22 = Sequences.subseq(var2, var14, var20.numE(var18) ? Numbers.add((SubLObject)ONE_INTEGER, var20) : var20);
                if (NIL == conses_high.member(var22, var13, Symbols.symbol_function((SubLObject)$ic8$), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var13 = (SubLObject)ConsesLow.cons(var22, var13);
                }
            }
            else if (NIL != module0038.f2681(var21) || NIL != module0038.f2760(var21)) {
                var16 = (SubLObject)T;
            }
            else {
                var16 = (SubLObject)NIL;
            }
        }
        return var13;
    }
    
    public static SubLObject f12563(final SubLObject var5) {
        return f12564(f12548(var5));
    }
    
    public static SubLObject f12564(final SubLObject var2) {
        if (!var2.isString()) {
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f2002(var2, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && Vectors.aref(var2, (SubLObject)ONE_INTEGER).eql(f12538())) {
            return Sequences.subseq(var2, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
        }
        return Sequences.subseq(var2, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12565(final SubLObject var24) {
        if (NIL != f12546(var24) && Sequences.length(Symbols.symbol_name(var24)).numG((SubLObject)FOUR_INTEGER)) {
            final SubLObject var25 = reader.read_from_string_ignoring_errors(Symbols.symbol_name(var24), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)FOUR_INTEGER, (SubLObject)UNPROVIDED);
            return (SubLObject)makeBoolean(var25.isFixnum() && var25.numGE((SubLObject)ZERO_INTEGER) && var25.numLE((SubLObject)$ic9$) && var24.eql(module0193.f12082(module0193.f12075(var25))));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12566(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f12546(var1) && NIL == f12565(var1));
    }
    
    public static SubLObject f12567() {
        return $g2292$.getGlobalValue();
    }
    
    public static SubLObject f12568(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0152.$g2120$.getDynamicValue(var27) && var26.isKeyword());
    }
    
    public static SubLObject f12569(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean((NIL == module0152.$g2120$.getDynamicValue(var2) && var1.isKeyword()) || (NIL == module0152.$g2121$.getDynamicValue(var2) && NIL != module0304.f20296(var1)));
    }
    
    public static SubLObject f12570(final SubLObject var26) {
        return Types.keywordp(var26);
    }
    
    public static SubLObject f12571(final SubLObject var27) {
        assert NIL != Types.symbolp(var27) : var27;
        return Symbols.symbol_name(var27);
    }
    
    public static SubLObject f12572(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isString() && Sequences.length(var1).numG((SubLObject)ONE_INTEGER) && NIL != Characters.charE(Strings.sublisp_char(var1, (SubLObject)ZERO_INTEGER), f12567()));
    }
    
    public static SubLObject f12573(final SubLObject var2) {
        return Symbols.make_keyword(Strings.string_upcase(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f12574(final SubLObject var1) {
        if (NIL != f12572(var1)) {
            return Strings.string_upcase(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return Strings.string_upcase(PrintLow.format((SubLObject)NIL, (SubLObject)$ic10$, f12567(), var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12575(final SubLObject var24) {
        return (SubLObject)makeBoolean(NIL != module0552.f34132(var24) || var24.isKeyword());
    }
    
    public static SubLObject f12576(final SubLObject var28) {
        if (NIL != module0193.f12067(var28)) {
            return f12576(module0193.f12082(var28));
        }
        if (NIL != f12546(var28)) {
            return f12548(var28);
        }
        if (NIL != f12570(var28)) {
            return f12571(var28);
        }
        return module0038.f2618(var28);
    }
    
    public static SubLObject f12577(final SubLObject var28) {
        if (NIL != module0193.f12067(var28)) {
            return f12577(module0193.f12082(var28));
        }
        if (NIL != f12546(var28)) {
            return f12563(var28);
        }
        return f12564(module0038.f2618(var28));
    }
    
    public static SubLObject f12578(final SubLObject var24) {
        return f12546(var24);
    }
    
    public static SubLObject f12579(final SubLObject var29) {
        return (SubLObject)makeBoolean(NIL != f12546(var29) || NIL != module0304.f20296(var29));
    }
    
    public static SubLObject f12580(final SubLObject var26) {
        return (SubLObject)makeBoolean(NIL != f12546(var26) || NIL != f12581(var26) || NIL != module0290.f19518(var26) || NIL != f12568(var26) || NIL != f12582(var26));
    }
    
    public static SubLObject f12582(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0152.$g2121$.getDynamicValue(var27) && NIL != module0304.f20296(var26));
    }
    
    public static SubLObject f12583(final SubLObject var28) {
        if (NIL != f12584(var28)) {
            return (SubLObject)$ic13$;
        }
        if (NIL != f12546(var28)) {
            return (SubLObject)$ic2$;
        }
        if (NIL != module0290.f19518(var28)) {
            return (SubLObject)$ic14$;
        }
        if (NIL != f12568(var28)) {
            return (SubLObject)$ic15$;
        }
        if (NIL != f12582(var28)) {
            return (SubLObject)$ic16$;
        }
        return (SubLObject)$ic17$;
    }
    
    public static SubLObject f12581(final SubLObject var24) {
        return f12585(var24);
    }
    
    public static SubLObject f12585(final SubLObject var24) {
        return module0193.f12067(var24);
    }
    
    public static SubLObject f12584(final SubLObject var26) {
        return module0193.f12067(var26);
    }
    
    public static SubLObject f12586() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12538", "S#3958", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12539", "S#15434", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12540", "S#15435", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12541", "S#15436", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12542", "S#15437", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12543", "S#15438", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12544", "S#15439", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12545", "S#15440", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12546", "EL-VAR?", 1, 0, false);
        new $f12546$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12549", "S#15441", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12548", "S#14106", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12547", "S#15442", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12550", "MAKE-EL-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12552", "S#15443", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12553", "S#15444", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12555", "S#15445", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12556", "S#15430", 1, 0, false);
        new $f12556$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12557", "VALID-EL-VAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12554", "S#15446", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12558", "S#15447", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12559", "S#15448", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12560", "S#15449", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12561", "S#15450", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12551", "S#14185", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12562", "VAR-NAMES-IN-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12563", "S#15451", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12564", "S#15452", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12565", "DEFAULT-EL-VAR?", 1, 0, false);
        new $f12565$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12566", "S#14881", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12567", "S#15453", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12568", "S#15454", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12569", "S#15455", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12570", "S#15456", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12571", "S#15457", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12572", "S#15458", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12573", "S#15459", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12574", "S#15460", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12575", "S#15461", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12576", "S#15462", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12577", "S#15463", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12578", "S#15464", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12579", "S#15465", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12580", "S#12629", 1, 0, false);
        new $f12580$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12582", "S#15466", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12583", "S#15467", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12581", "S#15468", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12585", "S#15469", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0201", "f12584", "S#15433", 1, 0, false);
        new $f12584$UnaryFunction();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12587() {
        $g2287$ = SubLFiles.defconstant("S#15470", (SubLObject)Characters.CHAR_question);
        $g2288$ = SubLFiles.defconstant("S#15471", (SubLObject)$ic0$);
        $g2289$ = SubLFiles.defconstant("S#15472", (SubLObject)Characters.CHAR_hyphen);
        $g2290$ = SubLFiles.defconstant("S#15473", Strings.make_string((SubLObject)TWO_INTEGER, $g2289$.getGlobalValue()));
        $g2291$ = SubLFiles.defconstant("S#15474", (SubLObject)$ic1$);
        $g2292$ = SubLFiles.defconstant("S#15475", (SubLObject)Characters.CHAR_colon);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12588() {
        module0012.f368((SubLObject)$ic2$, (SubLObject)$ic3$, (SubLObject)$ic4$, (SubLObject)NIL, (SubLObject)$ic5$);
        module0002.f35((SubLObject)$ic11$, (SubLObject)$ic12$);
        module0027.f1449((SubLObject)$ic18$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic19$, NIL, $ic20$, NIL, $ic21$, NIL, $ic22$, $ic23$, $ic24$, T }), (SubLObject)$ic25$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f12586();
    }
    
    public void initializeVariables() {
        f12587();
    }
    
    public void runTopLevelForms() {
        f12588();
    }
    
    static {
        me = (SubLFile)new module0201();
        $g2287$ = null;
        $g2288$ = null;
        $g2289$ = null;
        $g2290$ = null;
        $g2291$ = null;
        $g2292$ = null;
        $ic0$ = makeString("?");
        $ic1$ = makeString("([?]|[?][?]) [A-Z] ([A-Z]|[0-9])* ([-] ([A-Z]|[0-9])+)*");
        $ic2$ = makeSymbol("EL-VAR?");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("OBJECT", "CYC"));
        $ic4$ = makeString("Return T iff OBJECT is a symbol which can be interpreted as an EL variable.");
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("BOOLEANP"));
        $ic6$ = makeSymbol("SYMBOLP");
        $ic7$ = makeSymbol("S#15430", "CYC");
        $ic8$ = makeSymbol("STRING=");
        $ic9$ = makeInteger(200);
        $ic10$ = makeString("~C~A");
        $ic11$ = makeSymbol("S#15464", "CYC");
        $ic12$ = ConsesLow.list((SubLObject)makeSymbol("EL-VAR?"));
        $ic13$ = makeSymbol("S#15433", "CYC");
        $ic14$ = makeSymbol("S#15432", "CYC");
        $ic15$ = makeSymbol("S#15456", "CYC");
        $ic16$ = makeSymbol("S#15466", "CYC");
        $ic17$ = makeSymbol("FALSE");
        $ic18$ = makeSymbol("S#15446", "CYC");
        $ic19$ = makeKeyword("TEST");
        $ic20$ = makeKeyword("OWNER");
        $ic21$ = makeKeyword("CLASSES");
        $ic22$ = makeKeyword("KB");
        $ic23$ = makeKeyword("TINY");
        $ic24$ = makeKeyword("WORKING?");
        $ic25$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("FOO")), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("?FOO")), (SubLObject)T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("??FOO")), (SubLObject)T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("???FOO")), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("?X")), (SubLObject)T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("?x")), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("??X")), (SubLObject)T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("??x")), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("?1")), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("")), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("?")), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("??")), (SubLObject)NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("???")), (SubLObject)NIL) });
    }
    
    public static final class $f12546$UnaryFunction extends UnaryFunction
    {
        public $f12546$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("EL-VAR?"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return f12546(var4);
        }
    }
    
    public static final class $f12556$UnaryFunction extends UnaryFunction
    {
        public $f12556$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#15430"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return f12556(var4);
        }
    }
    
    public static final class $f12565$UnaryFunction extends UnaryFunction
    {
        public $f12565$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("DEFAULT-EL-VAR?"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return f12565(var4);
        }
    }
    
    public static final class $f12580$UnaryFunction extends UnaryFunction
    {
        public $f12580$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#12629"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return f12580(var4);
        }
    }
    
    public static final class $f12584$UnaryFunction extends UnaryFunction
    {
        public $f12584$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#15433"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return f12584(var4);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 171 ms
	
	Decompiled with Procyon 0.5.32.
*/