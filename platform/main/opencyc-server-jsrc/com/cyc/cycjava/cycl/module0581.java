package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0581 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0581";
    public static final String myFingerPrint = "e08fc0c277cea70e29ba59ea18496c53d2e01a9afe539e619f3ffdf58e36a674";
    private static SubLSymbol $g4378$;
    private static SubLSymbol $g4379$;
    private static SubLSymbol $g4380$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
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
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLInteger $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLInteger $ic34$;
    
    public static SubLObject f35647(final SubLObject var1, final SubLObject var2) {
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
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11_12 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic0$);
            var11_12 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic0$);
            if (NIL == conses_high.member(var11_12, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var11_12 == $ic2$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic3$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : ZERO_INTEGER);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)$ic6$, var4);
        final SubLObject var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : NIL);
        final SubLObject var19;
        var4 = (var19 = var5);
        final SubLObject var20 = (SubLObject)$ic7$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic8$, (SubLObject)ConsesLow.list(var20, var7, (SubLObject)$ic9$, var16, (SubLObject)$ic6$, var18), (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic11$, (SubLObject)ConsesLow.list((SubLObject)$ic12$, var16), (SubLObject)ConsesLow.list((SubLObject)$ic13$, var16, var12)), (SubLObject)ConsesLow.list((SubLObject)$ic14$, var20)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic11$, (SubLObject)ConsesLow.list((SubLObject)$ic12$, var14), (SubLObject)ConsesLow.list((SubLObject)$ic12$, var16), (SubLObject)ConsesLow.list((SubLObject)$ic15$, var16, var14)), (SubLObject)ConsesLow.list((SubLObject)$ic14$, var20)), (SubLObject)ConsesLow.list((SubLObject)T, (SubLObject)ConsesLow.listS((SubLObject)$ic16$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic17$, (SubLObject)ConsesLow.list((SubLObject)$ic18$, var20), var20, (SubLObject)ConsesLow.list((SubLObject)$ic19$, var20)))), ConsesLow.append(var19, (SubLObject)NIL)))));
    }
    
    public static SubLObject f35648(final SubLObject var23) {
        return (SubLObject)makeBoolean(var23.isString() || NIL != module0039.f2999(var23));
    }
    
    public static SubLObject f35649() {
        final SubLObject var24 = $g4378$.getGlobalValue();
        if (NIL != var24) {
            module0034.f1818(var24);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35650(final SubLObject var25) {
        return module0034.f1829($g4378$.getGlobalValue(), (SubLObject)ConsesLow.list(var25), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f35651(final SubLObject var25) {
        return (NIL != module0039.f3008(var25)) ? f35652(module0208.f13539(var25)) : var25;
    }
    
    public static SubLObject f35653(final SubLObject var25) {
        SubLObject var26 = $g4378$.getGlobalValue();
        if (NIL == var26) {
            var26 = module0034.f1934((SubLObject)$ic20$, (SubLObject)$ic21$, (SubLObject)$ic22$, (SubLObject)EQUAL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var27 = module0034.f1814(var26, var25, (SubLObject)$ic23$);
        if (var27 == $ic23$) {
            var27 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f35651(var25)));
            module0034.f1816(var26, var25, var27, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var27);
    }
    
    public static SubLObject f35654(final SubLObject var28) {
        return module0039.f3000(module0205.f13277(var28, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f35652(final SubLObject var29) {
        if (var29.isString()) {
            return var29;
        }
        if (NIL != module0208.f13537(var29, (SubLObject)UNPROVIDED)) {
            return f35654(var29);
        }
        final SubLObject var30 = Sequences.cconcatenate((SubLObject)$ic24$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic25$, module0006.f203((SubLObject)$ic26$) });
        module0578.f35476(var30, (SubLObject)ConsesLow.list(var29));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35655(final SubLObject var7, final SubLObject var14, SubLObject var31) {
        if (var31 == UNPROVIDED) {
            var31 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        if (var7.isString()) {
            return module0038.f2675(var7, var14, var31);
        }
        return module0038.f2675(module0039.f3048(module0039.f3018(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), var14, var31);
    }
    
    public static SubLObject f35656(final SubLObject var7, final SubLObject var16, SubLObject var31) {
        if (var31 == UNPROVIDED) {
            var31 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        if (var7.isString()) {
            return module0038.f2673(var7, var16, var31);
        }
        return module0038.f2673(module0039.f3048(module0039.f3018(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), var16, var31);
    }
    
    public static SubLObject f35657(final SubLObject var7, final SubLObject var14, SubLObject var31) {
        if (var31 == UNPROVIDED) {
            var31 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        if (NIL != f35655(var7, var14, var31)) {
            return Sequences.subseq(var7, Sequences.length(var14), (SubLObject)UNPROVIDED);
        }
        return var7;
    }
    
    public static SubLObject f35658(final SubLObject var7) {
        return Sequences.copy_seq(var7);
    }
    
    public static SubLObject f35659(final SubLObject var6) {
        if (var6.isChar()) {
            return Characters.char_downcase(var6);
        }
        if (NIL != module0039.f3009(f35660(var6))) {
            return Characters.char_code(Characters.char_downcase(f35660(var6)));
        }
        return var6;
    }
    
    public static SubLObject f35661(final SubLObject var7) {
        Vectors.set_aref(var7, (SubLObject)ZERO_INTEGER, f35659(Vectors.aref(var7, (SubLObject)ZERO_INTEGER)));
        return var7;
    }
    
    public static SubLObject f35662(final SubLObject var7, final SubLObject var32) {
        if (var7.isString()) {
            return module0038.f2685(var7, var32);
        }
        SubLObject var33 = var32;
        SubLObject var34 = (SubLObject)NIL;
        var34 = var33.first();
        while (NIL != var33) {
            if (NIL != f35655(var7, var34, Symbols.symbol_function((SubLObject)EQUAL))) {
                return (SubLObject)T;
            }
            var33 = var33.rest();
            var34 = var33.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35663(final SubLObject var34, final SubLObject var35) {
        if (var34.isString() && var35.isString()) {
            return Equality.equal(var34, var35);
        }
        return Equality.equalp(f35664(var34), f35664(var35));
    }
    
    public static SubLObject f35665(final SubLObject var34, final SubLObject var35) {
        if (var34.isString() && var35.isString()) {
            return Sequences.cconcatenate(var34, var35);
        }
        if (NIL != module0035.f1995(var34, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED)) {
            return var35;
        }
        if (NIL != module0035.f1995(var35, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED)) {
            return var34;
        }
        return Sequences.cconcatenate(f35664(var34), f35664(var35));
    }
    
    public static SubLObject f35666(final SubLObject var36, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = module0038.f2818();
        }
        if (var36.isString()) {
            return module0038.f2738(var36, var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39 = (SubLObject)NIL;
        for (SubLObject var40 = var36, var41 = (SubLObject)(var40.isList() ? NIL : Sequences.length(var40)), var42 = (SubLObject)ZERO_INTEGER, var43 = module0005.f149(var42, var41, var40); NIL == var43; var43 = module0005.f149(var42, var41, var40)) {
            final SubLObject var44 = module0005.f150(var42, var40);
            if (!var42.isInteger() || !var42.numL((SubLObject)ZERO_INTEGER)) {
                if (!NIL.isInteger() || !var42.isInteger() || !var42.numGE((SubLObject)NIL)) {
                    final SubLObject var45 = var44.isChar() ? var44 : f35660(var44);
                    if (NIL != module0004.f104(var45, var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        if (NIL != module0035.f2013(var39)) {
                            var38 = (SubLObject)ConsesLow.cons(f35667(Sequences.nreverse(var39)), var38);
                            var39 = (SubLObject)NIL;
                        }
                    }
                    else {
                        var39 = (SubLObject)ConsesLow.cons(var45, var39);
                    }
                }
            }
            var40 = module0005.f151(var40);
            var42 = Numbers.add(var42, (SubLObject)ONE_INTEGER);
        }
        if (NIL != module0035.f2013(var39)) {
            var38 = (SubLObject)ConsesLow.cons(f35667(Sequences.nreverse(var39)), var38);
        }
        return Sequences.nreverse(var38);
    }
    
    public static SubLObject f35667(final SubLObject var45) {
        if (NIL != module0035.find_if_not((SubLObject)$ic18$, var45, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return module0035.f2105(Mapping.mapcar((SubLObject)$ic27$, var45));
        }
        return module0039.f3035(var45, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f35668(final SubLObject var7, SubLObject var46) {
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        if (var7.isString()) {
            return module0732.f45117(var7, var46, module0579.$g4260$.getDynamicValue(var47), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35669(final SubLObject var7) {
        if (var7.isString()) {
            return module0038.f2637(var7);
        }
        return f35670(var7, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f35670(final SubLObject var7, final SubLObject var48) {
        if (var7.isString()) {
            return module0038.f2650(var7, var48);
        }
        return f35671(var7, Numbers.subtract(Sequences.length(var7), module0048.f_1X(var48)));
    }
    
    public static SubLObject f35672(final SubLObject var49) {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        if (NIL == $g4380$.getDynamicValue(var50) && NIL != module0035.f2192((SubLObject)$ic28$, var49)) {
            return module0038.f2761(var49, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0035.f2012(var49)) {
            return (SubLObject)((NIL != $g4380$.getDynamicValue(var50)) ? $ic29$ : $ic30$);
        }
        if (NIL != module0035.find_if_not((SubLObject)$ic31$, var49, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return f35672(module0035.remove_if_not((SubLObject)$ic31$, var49, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        final SubLObject var51 = var49.first();
        SubLObject var52 = f35664(var51);
        SubLObject var53 = var49.rest();
        SubLObject var54 = (SubLObject)NIL;
        var54 = var53.first();
        while (NIL != var53) {
            var52 = Sequences.cconcatenate(var52, new SubLObject[] { $g4379$.getGlobalValue(), f35664(var54) });
            var53 = var53.rest();
            var54 = var53.first();
        }
        return var52;
    }
    
    public static SubLObject f35673(final SubLObject var31, final SubLObject var7) {
        if (var7.isString()) {
            return Sequences.find_if(var31, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var32 = Sequences.find_if(var31, var7, (SubLObject)$ic32$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)((NIL != var32) ? f35660(var32) : NIL);
    }
    
    public static SubLObject f35674(final SubLObject var6, final SubLObject var7, SubLObject var31, SubLObject var53, SubLObject var14, SubLObject var16) {
        if (var31 == UNPROVIDED) {
            var31 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var53 == UNPROVIDED) {
            var53 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)ZERO_INTEGER;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        if (var7.isString()) {
            return Sequences.position(var6, var7, var31, var53, var14, var16);
        }
        return Sequences.position(f35675(var6), var7, var31, var53, var14, var16);
    }
    
    public static SubLObject f35671(final SubLObject var7, final SubLObject var48) {
        if (var7.isString()) {
            return Strings.sublisp_char(var7, var48);
        }
        return f35660(Vectors.aref(var7, var48));
    }
    
    public static SubLObject f35676(final SubLObject var54, final SubLObject var55) {
        if (var54.isChar() && var55.isChar()) {
            return Characters.charE(var54, var55);
        }
        return Equality.eql(f35675(var54), f35675(var55));
    }
    
    public static SubLObject f35677(final SubLObject var56, final SubLObject var7, final SubLObject var57, SubLObject var58) {
        if (var58 == UNPROVIDED) {
            var58 = (SubLObject)NIL;
        }
        if (var7.isString() && var57.isChar()) {
            return module0038.f2743(var56, var7, var57, var58);
        }
        if (NIL == var58 || NIL != module0035.f2002(var7, var56, (SubLObject)UNPROVIDED)) {
            Vectors.set_aref(var7, var56, f35675(var57));
            return var7;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35678(final SubLObject var59, final SubLObject var60, SubLObject var31, SubLObject var14, SubLObject var16) {
        if (var31 == UNPROVIDED) {
            var31 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)ZERO_INTEGER;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        if (var59.isString() && var60.isString()) {
            return module0035.sublisp_boolean(module0038.f2668(var59, var60, var31, var14, var16));
        }
        if (NIL != module0035.f2008(var60, var59)) {
            return module0035.sublisp_boolean(Sequences.search(f35664(var59), f35664(var60), Symbols.symbol_function((SubLObject)EQUALP), Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, (SubLObject)NIL, var14, var16));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35679(final SubLObject var7, final SubLObject var14, SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        if (var7.isString()) {
            return module0038.f2623(var7, var14, var16);
        }
        return Sequences.subseq(var7, var14, var16);
    }
    
    public static SubLObject f35680(final SubLObject var7) {
        if (var7.isString()) {
            return var7;
        }
        return module0039.f3001(var7);
    }
    
    public static SubLObject f35681(final SubLObject var7, SubLObject var61) {
        if (var61 == UNPROVIDED) {
            var61 = module0579.$g4259$.getDynamicValue();
        }
        return (NIL == var7) ? var7 : f35682(var7, var61);
    }
    
    public static SubLObject f35683(final SubLObject var7) {
        if (var7.isString()) {
            return var7;
        }
        if (NIL != module0039.f3030(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return module0039.f3048(module0039.f3018(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return module0208.f13538(module0039.f3001(var7));
    }
    
    public static SubLObject f35682(final SubLObject var7, SubLObject var61) {
        if (var61 == UNPROVIDED) {
            var61 = module0579.$g4259$.getDynamicValue();
        }
        final SubLThread var62 = SubLProcess.currentSubLThread();
        if (var7.isString()) {
            return var7;
        }
        if (var61 == $ic33$ || NIL != module0579.$g4299$.getDynamicValue(var62) || NIL != module0039.f3030(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return module0039.f3048(module0039.f3018(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return module0208.f13538(module0039.f3001(var7));
    }
    
    public static SubLObject f35684(final SubLObject var7) {
        return (NIL == var7) ? var7 : f35685(var7);
    }
    
    public static SubLObject f35685(final SubLObject var7) {
        if (var7.isString()) {
            return var7;
        }
        return module0039.f3048(module0039.f3018(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f35686(final SubLObject var23) {
        return (SubLObject)makeBoolean(NIL != f35648(var23) && NIL != module0035.f2002(var23, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f35664(final SubLObject var7) {
        return var7.isString() ? module0039.f3044(var7) : var7;
    }
    
    public static SubLObject f35687(final SubLObject var7, final SubLObject var56, SubLObject var58) {
        if (var58 == UNPROVIDED) {
            var58 = (SubLObject)T;
        }
        if (var7.isString()) {
            return module0038.f2810(var7, var56, var58);
        }
        if (NIL == var58 || NIL != module0035.f2002(var7, var56, (SubLObject)UNPROVIDED)) {
            final SubLObject var59 = f35660(Vectors.aref(var7, var56));
            if (var59.isChar()) {
                Vectors.set_aref(var7, var56, Characters.char_code(Characters.char_upcase(var59)));
            }
        }
        return var7;
    }
    
    public static SubLObject f35688(final SubLObject var7) {
        if (var7.isString()) {
            return Strings.string_downcase(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var8 = module0037.f2559(var7);
        for (SubLObject var9 = var7, var10 = (SubLObject)(var9.isList() ? NIL : Sequences.length(var9)), var11 = (SubLObject)ZERO_INTEGER, var12 = module0005.f149(var11, var10, var9); NIL == var12; var12 = module0005.f149(var11, var10, var9)) {
            final SubLObject var13 = module0005.f150(var11, var9);
            final SubLObject var14 = f35659(f35660(var13));
            Vectors.set_aref(var8, var11, var14.isChar() ? Characters.char_code(var14) : var14);
            var9 = module0005.f151(var9);
            var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER);
        }
        return var8;
    }
    
    public static SubLObject f35660(final SubLObject var52) {
        return var52.numLE((SubLObject)$ic34$) ? Characters.code_char(var52) : f35689(var52);
    }
    
    public static SubLObject f35675(final SubLObject var6) {
        return var6.isChar() ? Characters.char_code(var6) : f35690(var6);
    }
    
    public static SubLObject f35689(final SubLObject var52) {
        return var52;
    }
    
    public static SubLObject f35690(final SubLObject var6) {
        return var6;
    }
    
    public static SubLObject f35691() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0581", "f35647", "S#39327");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35648", "S#39070", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35649", "S#39328", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35650", "S#39329", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35651", "S#39330", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35653", "S#39331", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35654", "S#39332", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35652", "S#39333", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35655", "S#39334", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35656", "S#39335", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35657", "S#39336", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35658", "S#39337", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35659", "S#39338", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35661", "S#39339", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35662", "S#39340", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35663", "S#39341", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35665", "S#39342", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35666", "S#39343", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35667", "S#39344", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35668", "S#39345", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35669", "S#39346", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35670", "S#39347", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35672", "S#39348", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35673", "S#39349", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35674", "S#39072", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35671", "S#39073", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35676", "S#39280", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35677", "S#39350", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35678", "S#39351", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35679", "S#39075", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35680", "S#39352", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35681", "S#39074", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35683", "S#39353", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35682", "S#39354", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35684", "S#39355", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35685", "S#39356", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35686", "S#39357", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35664", "S#39358", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35687", "S#39359", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35688", "S#39360", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35660", "S#39361", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35675", "S#39362", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35689", "S#39363", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0581", "f35690", "S#39364", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35692() {
        $g4378$ = SubLFiles.deflexical("S#39365", (SubLObject)NIL);
        $g4379$ = SubLFiles.deflexical("S#39366", Vectors.make_vector((SubLObject)ONE_INTEGER, Characters.char_code((SubLObject)Characters.CHAR_space)));
        $g4380$ = SubLFiles.defparameter("S#39367", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35693() {
        module0034.f1909((SubLObject)$ic20$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f35691();
    }
    
    public void initializeVariables() {
        f35692();
    }
    
    public void runTopLevelForms() {
        f35693();
    }
    
    static {
        me = (SubLFile)new module0581();
        $g4378$ = null;
        $g4379$ = null;
        $g4380$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CHAR"), (SubLObject)makeSymbol("STRING"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)ZERO_INTEGER), (SubLObject)makeSymbol("S#125", "CYC"), (SubLObject)makeSymbol("S#145", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)makeKeyword("START"), (SubLObject)makeKeyword("END"), (SubLObject)makeKeyword("CHAR-NUM"), (SubLObject)makeKeyword("DONE"));
        $ic2$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic3$ = makeKeyword("START");
        $ic4$ = makeKeyword("END");
        $ic5$ = makeKeyword("CHAR-NUM");
        $ic6$ = makeKeyword("DONE");
        $ic7$ = makeUninternedSymbol("US#35248DF");
        $ic8$ = makeSymbol("DO-SEQUENCE");
        $ic9$ = makeKeyword("ELEMENT-NUM");
        $ic10$ = makeSymbol("PCOND");
        $ic11$ = makeSymbol("CAND");
        $ic12$ = makeSymbol("INTEGERP");
        $ic13$ = makeSymbol("<");
        $ic14$ = makeSymbol("IGNORE");
        $ic15$ = makeSymbol(">=");
        $ic16$ = makeSymbol("CLET");
        $ic17$ = makeSymbol("FIF");
        $ic18$ = makeSymbol("CHARACTERP");
        $ic19$ = makeSymbol("S#39361", "CYC");
        $ic20$ = makeSymbol("S#39331", "CYC");
        $ic21$ = makeSymbol("S#39365", "CYC");
        $ic22$ = makeInteger(256);
        $ic23$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic24$ = makeString("(PPH error level ");
        $ic25$ = makeString(") ");
        $ic26$ = makeString("Can't make a PPH string from ~S");
        $ic27$ = makeSymbol("S#39362", "CYC");
        $ic28$ = makeSymbol("STRINGP");
        $ic29$ = Vectors.vector(EMPTY_SUBL_OBJECT_ARRAY);
        $ic30$ = makeString("");
        $ic31$ = makeSymbol("S#39357", "CYC");
        $ic32$ = makeSymbol("CODE-CHAR");
        $ic33$ = makeKeyword("HTML");
        $ic34$ = makeInteger(255);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 177 ms
	
	Decompiled with Procyon 0.5.32.
*/