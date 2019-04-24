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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0067 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0067";
    public static final String myFingerPrint = "94f63653917ec9fe5df80a0a4abb09c06504c992fc3d6287c737293d62df11c8";
    private static SubLSymbol $g1085$;
    private static SubLSymbol $g1086$;
    public static SubLSymbol $g1087$;
    private static SubLSymbol $g1088$;
    private static SubLSymbol $g1089$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLInteger $ic2$;
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
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLList $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLInteger $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLInteger $ic60$;
    private static final SubLSymbol $ic61$;
    
    public static SubLObject f4850(final SubLObject var1, final SubLObject var2) {
        f4851(var1, var2, (SubLObject)module0067.ZERO_INTEGER);
        return (SubLObject)module0067.NIL;
    }
    
    public static SubLObject f4852(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX6423_native.class) ? module0067.T : module0067.NIL);
    }
    
    public static SubLObject f4853(final SubLObject var1) {
        assert module0067.NIL != f4852(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f4854(final SubLObject var1) {
        assert module0067.NIL != f4852(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f4855(final SubLObject var1, final SubLObject var4) {
        assert module0067.NIL != f4852(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f4856(final SubLObject var1, final SubLObject var4) {
        assert module0067.NIL != f4852(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f4857(SubLObject var5) {
        if (var5 == module0067.UNPROVIDED) {
            var5 = (SubLObject)module0067.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX6423_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0067.NIL, var7 = var5; module0067.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0067.$ic14$)) {
                f4855(var6, var9);
            }
            else if (var10.eql((SubLObject)module0067.$ic15$)) {
                f4856(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0067.$ic16$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f4858(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0067.$ic17$, (SubLObject)module0067.$ic18$, (SubLObject)module0067.TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0067.$ic19$, (SubLObject)module0067.$ic14$, f4853(var11));
        Functions.funcall(var12, var11, (SubLObject)module0067.$ic19$, (SubLObject)module0067.$ic15$, f4854(var11));
        Functions.funcall(var12, var11, (SubLObject)module0067.$ic20$, (SubLObject)module0067.$ic18$, (SubLObject)module0067.TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f4859(final SubLObject var11, final SubLObject var12) {
        return f4858(var11, var12);
    }
    
    public static SubLObject f4851(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0067.NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)module0067.$ic22$, var2, (SubLObject)module0067.UNPROVIDED, (SubLObject)module0067.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { module0067.$ic23$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            streams_high.write_string((SubLObject)module0067.$ic24$, var2, (SubLObject)module0067.UNPROVIDED, (SubLObject)module0067.UNPROVIDED);
            print_high.princ(module0030.f1592(f4854(var13)), var2);
            streams_high.write_string((SubLObject)module0067.$ic25$, var2, (SubLObject)module0067.UNPROVIDED, (SubLObject)module0067.UNPROVIDED);
            streams_high.write_string(Symbols.symbol_name(f4860(var13)), var2, (SubLObject)module0067.UNPROVIDED, (SubLObject)module0067.UNPROVIDED);
            streams_high.write_string((SubLObject)module0067.$ic26$, var2, (SubLObject)module0067.UNPROVIDED, (SubLObject)module0067.UNPROVIDED);
            streams_high.write_string((SubLObject)module0067.$ic27$, var2, (SubLObject)module0067.UNPROVIDED, (SubLObject)module0067.UNPROVIDED);
            print_high.princ(f4861(var13), var2);
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var13), new SubLObject[] { module0067.$ic23$, var2, module0067.$ic28$, module0067.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var13;
    }
    
    public static SubLObject f4862(final SubLObject var20) {
        if (var20.isList()) {
            return (SubLObject)module0067.$ic30$;
        }
        if (var20.isHashtable()) {
            return (SubLObject)module0067.$ic31$;
        }
        return (SubLObject)module0067.$ic32$;
    }
    
    public static SubLObject f4860(final SubLObject var21) {
        return f4862(f4853(var21));
    }
    
    public static SubLObject f4863(final SubLObject var21) {
        return Errors.error((SubLObject)module0067.$ic33$, f4860(var21));
    }
    
    public static SubLObject f4864(final SubLObject var21, final SubLObject var22) {
        return Types.sublisp_null(var22);
    }
    
    public static SubLObject f4865(final SubLObject var21, final SubLObject var22) {
        return Sequences.length(var22);
    }
    
    public static SubLObject f4866(final SubLObject var21, final SubLObject var22, final SubLObject var23, final SubLObject var24) {
        final SubLObject var25 = f4854(var21);
        return module0035.f2293(var22, var23, var25, var24);
    }
    
    public static SubLObject f4867(final SubLObject var21, final SubLObject var22, final SubLObject var23, final SubLObject var24) {
        final SubLObject var25 = f4854(var21);
        return module0035.f2294(var22, var23, var25, var24);
    }
    
    public static SubLObject f4868(final SubLObject var21, final SubLObject var22, final SubLObject var23, final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        final SubLObject var28 = f4854(var21);
        var27.resetMultipleValues();
        final SubLObject var29 = module0035.f2063(var22, var23, var26, var28);
        final SubLObject var30 = var27.secondMultipleValue();
        var27.resetMultipleValues();
        if (module0067.NIL == var30) {
            f4855(var21, var29);
            if (f4861(var21).numG(module0067.$g1085$.getGlobalValue())) {
                f4869(var21, var29);
            }
        }
        return var23;
    }
    
    public static SubLObject f4870(final SubLObject var21, final SubLObject var22, final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = f4854(var21);
        var24.resetMultipleValues();
        final SubLObject var26 = module0035.f2309(var22, var23, var25);
        final SubLObject var27 = var24.secondMultipleValue();
        var24.resetMultipleValues();
        if (module0067.NIL != var27) {
            f4855(var21, var26);
        }
        return var23;
    }
    
    public static SubLObject f4871(final SubLObject var21, final SubLObject var22, final SubLObject var30) {
        final SubLObject var31 = module0035.f2320(var22, var30);
        f4855(var21, var31);
        return var21;
    }
    
    public static SubLObject f4869(final SubLObject var21, final SubLObject var32) {
        final SubLObject var33 = f4854(var21);
        final SubLObject var34 = module0035.f2323(var32, var33);
        f4855(var21, var34);
        return var21;
    }
    
    public static SubLObject f4872(final SubLObject var21, final SubLObject var33) {
        return module0030.f1594(var33);
    }
    
    public static SubLObject f4873(final SubLObject var21, final SubLObject var33) {
        return Hashtables.hash_table_count(var33);
    }
    
    public static SubLObject f4874(final SubLObject var21, final SubLObject var34, final SubLObject var23, final SubLObject var24) {
        return Hashtables.gethash(var23, var34, var24);
    }
    
    public static SubLObject f4875(final SubLObject var21, final SubLObject var34, final SubLObject var23, final SubLObject var24) {
        return Hashtables.gethash_without_values(var23, var34, var24);
    }
    
    public static SubLObject f4876(final SubLObject var21, final SubLObject var34, final SubLObject var23, final SubLObject var26) {
        Hashtables.sethash(var23, var34, var26);
        return var23;
    }
    
    public static SubLObject f4877(final SubLObject var21, final SubLObject var34, final SubLObject var23) {
        final SubLObject var35 = Hashtables.remhash(var23, var34);
        if (module0067.NIL != var35 && f4861(var21).numL(module0067.$g1086$.getGlobalValue())) {
            f4878(var21, var34);
        }
        return var23;
    }
    
    public static SubLObject f4879(final SubLObject var21, final SubLObject var34, final SubLObject var30) {
        return var21;
    }
    
    public static SubLObject f4878(final SubLObject var21, final SubLObject var32) {
        final SubLObject var33 = module0030.f1630(var32);
        f4855(var21, var33);
        return var21;
    }
    
    public static SubLObject f4880(SubLObject var25, SubLObject var35) {
        if (var25 == module0067.UNPROVIDED) {
            var25 = Symbols.symbol_function((SubLObject)module0067.EQL);
        }
        if (var35 == module0067.UNPROVIDED) {
            var35 = (SubLObject)module0067.ZERO_INTEGER;
        }
        assert module0067.NIL != module0030.f1591(var25) : var25;
        assert module0067.NIL != Types.integerp(var35) : var35;
        if (var25.isSymbol()) {
            var25 = Symbols.symbol_function(var25);
        }
        final SubLObject var36 = f4857((SubLObject)module0067.UNPROVIDED);
        f4881(var36);
        f4856(var36, var25);
        if (var35.numG(module0067.$g1085$.getGlobalValue())) {
            f4855(var36, Hashtables.make_hash_table(var35, var25, (SubLObject)module0067.UNPROVIDED));
        }
        return var36;
    }
    
    public static SubLObject f4881(final SubLObject var21) {
        assert module0067.NIL != f4852(var21) : var21;
        f4855(var21, (SubLObject)module0067.NIL);
        return var21;
    }
    
    public static SubLObject f4861(final SubLObject var21) {
        assert module0067.NIL != f4852(var21) : var21;
        final SubLObject var22 = f4853(var21);
        final SubLObject var23 = f4862(var22);
        if (var23.eql((SubLObject)module0067.$ic30$)) {
            return f4865(var21, var22);
        }
        if (var23.eql((SubLObject)module0067.$ic31$)) {
            return f4873(var21, var22);
        }
        return f4863(var21);
    }
    
    public static SubLObject f4882(final SubLObject var21) {
        assert module0067.NIL != f4852(var21) : var21;
        final SubLObject var22 = f4853(var21);
        final SubLObject var23 = f4862(var22);
        if (var23.eql((SubLObject)module0067.$ic30$)) {
            return f4864(var21, var22);
        }
        if (var23.eql((SubLObject)module0067.$ic31$)) {
            return f4872(var21, var22);
        }
        return f4863(var21);
    }
    
    public static SubLObject f4883(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0067.NIL != f4852(var13) && module0067.NIL == f4882(var13));
    }
    
    public static SubLObject f4884(final SubLObject var21, final SubLObject var23, SubLObject var24) {
        if (var24 == module0067.UNPROVIDED) {
            var24 = (SubLObject)module0067.NIL;
        }
        assert module0067.NIL != f4852(var21) : var21;
        final SubLObject var25 = f4853(var21);
        final SubLObject var26 = f4862(var25);
        if (var26.eql((SubLObject)module0067.$ic30$)) {
            return f4866(var21, var25, var23, var24);
        }
        if (var26.eql((SubLObject)module0067.$ic31$)) {
            return f4874(var21, var25, var23, var24);
        }
        return f4863(var21);
    }
    
    public static SubLObject f4885(final SubLObject var21, final SubLObject var23, SubLObject var24) {
        if (var24 == module0067.UNPROVIDED) {
            var24 = (SubLObject)module0067.NIL;
        }
        assert module0067.NIL != f4852(var21) : var21;
        final SubLObject var25 = f4853(var21);
        final SubLObject var26 = f4862(var25);
        if (var26.eql((SubLObject)module0067.$ic30$)) {
            return f4867(var21, var25, var23, var24);
        }
        if (var26.eql((SubLObject)module0067.$ic31$)) {
            return f4875(var21, var25, var23, var24);
        }
        return f4863(var21);
    }
    
    public static SubLObject f4886(final SubLObject var21, final SubLObject var23, final SubLObject var26) {
        assert module0067.NIL != f4852(var21) : var21;
        final SubLObject var27 = f4853(var21);
        final SubLObject var28 = f4862(var27);
        if (var28.eql((SubLObject)module0067.$ic30$)) {
            return f4868(var21, var27, var23, var26);
        }
        if (var28.eql((SubLObject)module0067.$ic31$)) {
            return f4876(var21, var27, var23, var26);
        }
        return f4863(var21);
    }
    
    public static SubLObject f4887(final SubLObject var21, final SubLObject var23) {
        assert module0067.NIL != f4852(var21) : var21;
        final SubLObject var24 = f4853(var21);
        final SubLObject var25 = f4862(var24);
        if (var25.eql((SubLObject)module0067.$ic30$)) {
            return f4870(var21, var24, var23);
        }
        if (var25.eql((SubLObject)module0067.$ic31$)) {
            return f4877(var21, var24, var23);
        }
        return f4863(var21);
    }
    
    public static SubLObject f4888(final SubLObject var21, final SubLObject var30) {
        assert module0067.NIL != f4852(var21) : var21;
        final SubLObject var31 = f4853(var21);
        final SubLObject var32 = f4862(var31);
        if (var32.eql((SubLObject)module0067.$ic30$)) {
            return f4871(var21, var31, var30);
        }
        if (var32.eql((SubLObject)module0067.$ic31$)) {
            return f4879(var21, var31, var30);
        }
        return f4863(var21);
    }
    
    public static SubLObject f4889(final SubLObject var21) {
        assert module0067.NIL != f4852(var21) : var21;
        final SubLObject var22 = f4853(var21);
        final SubLObject var23 = f4862(var22);
        if (var23.eql((SubLObject)module0067.$ic30$)) {
            return module0052.f3723(var22);
        }
        if (var23.eql((SubLObject)module0067.$ic31$)) {
            return module0052.f3732(var22);
        }
        return f4863(var21);
    }
    
    public static SubLObject f4890(final SubLObject var37, final SubLObject var38) {
        SubLObject var40;
        final SubLObject var39 = var40 = var37.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0067.$ic38$);
        final SubLObject var41 = var40.rest();
        var40 = var40.first();
        SubLObject var42 = (SubLObject)module0067.NIL;
        SubLObject var43 = (SubLObject)module0067.NIL;
        SubLObject var44 = (SubLObject)module0067.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0067.$ic38$);
        var42 = var40.first();
        var40 = var40.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0067.$ic38$);
        var43 = var40.first();
        var40 = var40.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0067.$ic38$);
        var44 = var40.first();
        var40 = var40.rest();
        final SubLObject var45 = (SubLObject)(var40.isCons() ? var40.first() : module0067.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var40, var39, (SubLObject)module0067.$ic38$);
        var40 = var40.rest();
        if (module0067.NIL == var40) {
            final SubLObject var46;
            var40 = (var46 = var41);
            return (SubLObject)ConsesLow.listS((SubLObject)module0067.$ic39$, (SubLObject)ConsesLow.list(var42, var43, (SubLObject)ConsesLow.list((SubLObject)module0067.$ic40$, var44), (SubLObject)module0067.$ic41$, var45), ConsesLow.append(var46, (SubLObject)module0067.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var39, (SubLObject)module0067.$ic38$);
        return (SubLObject)module0067.NIL;
    }
    
    public static SubLObject f4891(final SubLObject var21) {
        assert module0067.NIL != f4852(var21) : var21;
        return f4853(var21);
    }
    
    public static SubLObject f4892(final SubLObject var37, final SubLObject var38) {
        SubLObject var40;
        final SubLObject var39 = var40 = var37.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0067.$ic43$);
        final SubLObject var41 = var40.rest();
        var40 = var40.first();
        SubLObject var42 = (SubLObject)module0067.NIL;
        SubLObject var43 = (SubLObject)module0067.NIL;
        SubLObject var44 = (SubLObject)module0067.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0067.$ic43$);
        var42 = var40.first();
        var40 = var40.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0067.$ic43$);
        var43 = var40.first();
        var40 = var40.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0067.$ic43$);
        var44 = var40.first();
        var40 = var40.rest();
        SubLObject var45 = (SubLObject)module0067.NIL;
        SubLObject var46 = var40;
        SubLObject var47 = (SubLObject)module0067.NIL;
        SubLObject var50_51 = (SubLObject)module0067.NIL;
        while (module0067.NIL != var46) {
            cdestructuring_bind.destructuring_bind_must_consp(var46, var39, (SubLObject)module0067.$ic43$);
            var50_51 = var46.first();
            var46 = var46.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var46, var39, (SubLObject)module0067.$ic43$);
            if (module0067.NIL == conses_high.member(var50_51, (SubLObject)module0067.$ic44$, (SubLObject)module0067.UNPROVIDED, (SubLObject)module0067.UNPROVIDED)) {
                var47 = (SubLObject)module0067.T;
            }
            if (var50_51 == module0067.$ic45$) {
                var45 = var46.first();
            }
            var46 = var46.rest();
        }
        if (module0067.NIL != var47 && module0067.NIL == var45) {
            cdestructuring_bind.cdestructuring_bind_error(var39, (SubLObject)module0067.$ic43$);
        }
        final SubLObject var48 = cdestructuring_bind.property_list_member((SubLObject)module0067.$ic41$, var40);
        final SubLObject var49 = (SubLObject)((module0067.NIL != var48) ? conses_high.cadr(var48) : module0067.NIL);
        final SubLObject var50 = cdestructuring_bind.property_list_member((SubLObject)module0067.$ic46$, var40);
        final SubLObject var51 = (SubLObject)((module0067.NIL != var50) ? conses_high.cadr(var50) : module0067.$ic47$);
        final SubLObject var52;
        var40 = (var52 = var41);
        final SubLObject var53 = (SubLObject)module0067.$ic48$;
        final SubLObject var54 = (SubLObject)module0067.$ic49$;
        return (SubLObject)ConsesLow.list((SubLObject)module0067.$ic50$, (SubLObject)ConsesLow.list(reader.bq_cons(var53, (SubLObject)module0067.$ic51$), (SubLObject)ConsesLow.list(var54, (SubLObject)ConsesLow.list((SubLObject)module0067.$ic52$, var44))), (SubLObject)ConsesLow.list((SubLObject)module0067.$ic53$, var51, (SubLObject)ConsesLow.listS((SubLObject)module0067.$ic42$, (SubLObject)ConsesLow.list(var42, var43, var44, var49), ConsesLow.append(var52, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0067.$ic54$, var53), (SubLObject)ConsesLow.list((SubLObject)module0067.$ic55$, var53, var54))))));
    }
    
    public static SubLObject f4893(final SubLObject var21, final SubLObject var57) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        assert module0067.NIL != f4852(var21) : var21;
        assert module0067.NIL != Types.function_spec_p(var57) : var57;
        SubLObject var59;
        for (var59 = module0066.f4838(f4891(var21)); module0067.NIL == module0066.f4841(var59); var59 = module0066.f4840(var59)) {
            var58.resetMultipleValues();
            final SubLObject var60 = module0066.f4839(var59);
            final SubLObject var61 = var58.secondMultipleValue();
            var58.resetMultipleValues();
            Functions.funcall(var57, var60, var61);
        }
        module0066.f4842(var59);
        return (SubLObject)module0067.NIL;
    }
    
    public static SubLObject f4894(final SubLObject var21, final SubLObject var57, final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        assert module0067.NIL != f4852(var21) : var21;
        assert module0067.NIL != Types.function_spec_p(var57) : var57;
        SubLObject var61;
        for (var61 = module0066.f4838(f4891(var21)); module0067.NIL == module0066.f4841(var61); var61 = module0066.f4840(var61)) {
            var60.resetMultipleValues();
            final SubLObject var62 = module0066.f4839(var61);
            final SubLObject var63 = var60.secondMultipleValue();
            var60.resetMultipleValues();
            Functions.funcall(var57, var62, var63, var59);
        }
        module0066.f4842(var61);
        return (SubLObject)module0067.NIL;
    }
    
    public static SubLObject f4895(final SubLObject var13, final SubLObject var2) {
        return f4896(var13, var2);
    }
    
    public static SubLObject f4896(final SubLObject var13, final SubLObject var2) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        module0021.f1086(module0067.$g1088$.getGlobalValue(), var2);
        final SubLObject var15 = module0030.f1592(f4854(var13));
        final SubLObject var16 = f4861(var13);
        module0021.f1038(var15, var2);
        module0021.f1038(var16, var2);
        SubLObject var17;
        for (var17 = module0066.f4838(f4891(var13)); module0067.NIL == module0066.f4841(var17); var17 = module0066.f4840(var17)) {
            var14.resetMultipleValues();
            final SubLObject var18 = module0066.f4839(var17);
            final SubLObject var19 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            module0021.f1038(var18, var2);
            module0021.f1038(var19, var2);
        }
        module0066.f4842(var17);
        return var13;
    }
    
    public static SubLObject f4897(final SubLObject var2) {
        SubLObject var3 = module0021.f1060(var2, (SubLObject)module0067.UNPROVIDED, (SubLObject)module0067.UNPROVIDED);
        final SubLObject var4 = module0021.f1060(var2, (SubLObject)module0067.UNPROVIDED, (SubLObject)module0067.UNPROVIDED);
        SubLObject var5 = (SubLObject)module0067.NIL;
        SubLObject var6 = var3;
        if (var6.eql((SubLObject)module0067.EQ) || var6.eql((SubLObject)module0067.EQL) || var6.eql((SubLObject)module0067.EQUAL) || var6.eql((SubLObject)module0067.EQUALP)) {
            var3 = Symbols.symbol_function(var3);
        }
        var5 = f4880(var3, var4);
        var6 = f4860(var5);
        if (var6.eql((SubLObject)module0067.$ic30$)) {
            f4898(var5, var4, var2);
        }
        else if (var6.eql((SubLObject)module0067.$ic31$)) {
            f4899(var5, var4, var2);
        }
        else {
            f4900(var5, var4, var2);
        }
        return var5;
    }
    
    public static SubLObject f4898(final SubLObject var21, final SubLObject var35, final SubLObject var2) {
        SubLObject var36 = (SubLObject)module0067.NIL;
        var36 = (SubLObject)ConsesLow.make_list(var35, (SubLObject)module0067.NIL);
        SubLObject var37;
        SubLObject var38;
        SubLObject var39;
        SubLObject var40;
        for (var37 = (SubLObject)module0067.NIL, var37 = var36; !var37.isAtom(); var37 = var37.rest()) {
            var38 = module0021.f1060(var2, (SubLObject)module0067.UNPROVIDED, (SubLObject)module0067.UNPROVIDED);
            var39 = module0021.f1060(var2, (SubLObject)module0067.UNPROVIDED, (SubLObject)module0067.UNPROVIDED);
            var40 = (SubLObject)module0067.NIL;
            var40 = (SubLObject)ConsesLow.cons(var38, var39);
            ConsesLow.rplaca(var37, var40);
        }
        f4855(var21, var36);
        return var21;
    }
    
    public static SubLObject f4899(final SubLObject var21, final SubLObject var35, final SubLObject var2) {
        return f4900(var21, var35, var2);
    }
    
    public static SubLObject f4900(final SubLObject var21, final SubLObject var35, final SubLObject var2) {
        SubLObject var36;
        SubLObject var37;
        SubLObject var38;
        for (var36 = (SubLObject)module0067.NIL, var36 = (SubLObject)module0067.ZERO_INTEGER; var36.numL(var35); var36 = Numbers.add(var36, (SubLObject)module0067.ONE_INTEGER)) {
            var37 = module0021.f1060(var2, (SubLObject)module0067.UNPROVIDED, (SubLObject)module0067.UNPROVIDED);
            var38 = module0021.f1060(var2, (SubLObject)module0067.UNPROVIDED, (SubLObject)module0067.UNPROVIDED);
            f4886(var21, var37, var38);
        }
        return var21;
    }
    
    public static SubLObject f4901(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0067.NIL;
        var3 = f4880((SubLObject)module0067.UNPROVIDED, (SubLObject)module0067.UNPROVIDED);
        module0021.f1090(var2);
        f4855(var3, module0021.f1090(var2));
        f4856(var3, Symbols.symbol_function(module0021.f1090(var2)));
        return var3;
    }
    
    public static SubLObject f4902(final SubLObject var21) {
        assert module0067.NIL != f4852(var21) : var21;
        final SubLObject var22 = f4853(var21);
        final SubLObject var23 = f4862(var22);
        if (var23.eql((SubLObject)module0067.$ic30$)) {
            return module0035.f2062(var22);
        }
        if (var23.eql((SubLObject)module0067.$ic31$)) {
            return module0030.f1625(var22);
        }
        return f4863(var21);
    }
    
    public static SubLObject f4903(final SubLObject var21) {
        assert module0067.NIL != f4852(var21) : var21;
        final SubLObject var22 = f4853(var21);
        final SubLObject var23 = f4862(var22);
        if (var23.eql((SubLObject)module0067.$ic30$)) {
            return module0035.f2319(var22);
        }
        if (var23.eql((SubLObject)module0067.$ic31$)) {
            return module0030.f1627(var22);
        }
        return f4863(var21);
    }
    
    public static SubLObject f4904(final SubLObject var21) {
        assert module0067.NIL != f4852(var21) : var21;
        final SubLObject var22 = f4853(var21);
        final SubLObject var23 = f4862(var22);
        if (var23.eql((SubLObject)module0067.$ic30$)) {
            return var21;
        }
        if (var23.eql((SubLObject)module0067.$ic31$)) {
            module0030.f1595(var22);
            return var21;
        }
        return f4863(var21);
    }
    
    public static SubLObject f4905() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4850", "S#6426", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4852", "S#6424", 1, 0, false);
        new $f4852$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4853", "S#6427", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4854", "S#3045", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4855", "S#6428", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4856", "S#6429", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4857", "S#6430", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4858", "S#6431", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4859", "S#6432", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4851", "S#6433", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4862", "S#6434", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4860", "S#6435", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4863", "S#6436", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4864", "S#6437", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4865", "S#6438", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4866", "S#6439", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4867", "S#6440", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4868", "S#6441", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4870", "S#6442", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4871", "S#6443", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4869", "S#6444", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4872", "S#6445", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4873", "S#6446", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4874", "S#6447", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4875", "S#6448", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4876", "S#6449", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4877", "S#6450", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4879", "S#6451", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4878", "S#6452", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4880", "NEW-DICTIONARY", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4881", "CLEAR-DICTIONARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4861", "DICTIONARY-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4882", "S#6453", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4883", "S#6454", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4884", "DICTIONARY-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4885", "S#3034", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4886", "DICTIONARY-ENTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4887", "DICTIONARY-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4888", "S#6455", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4889", "S#6456", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0067", "f4890", "DO-DICTIONARY");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4891", "S#6422", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0067", "f4892", "S#6457");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4893", "S#6458", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4894", "S#6459", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4895", "S#6460", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4896", "S#6461", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4897", "S#6425", 1, 0, false);
        new $f4897$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4898", "S#6462", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4899", "S#6463", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4900", "S#6464", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4901", "S#6465", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4902", "DICTIONARY-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4903", "DICTIONARY-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0067", "f4904", "S#6466", 1, 0, false);
        return (SubLObject)module0067.NIL;
    }
    
    public static SubLObject f4906() {
        module0067.$g1085$ = SubLFiles.deflexical("S#6467", (SubLObject)module0067.TWELVE_INTEGER);
        module0067.$g1086$ = SubLFiles.deflexical("S#6468", (SubLObject)module0067.EIGHT_INTEGER);
        module0067.$g1087$ = SubLFiles.defconstant("S#6469", (SubLObject)module0067.$ic0$);
        module0067.$g1088$ = SubLFiles.defconstant("S#6470", (SubLObject)module0067.$ic57$);
        module0067.$g1089$ = SubLFiles.defconstant("S#6471", (SubLObject)module0067.$ic60$);
        return (SubLObject)module0067.NIL;
    }
    
    public static SubLObject f4907() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0067.$g1087$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0067.$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0067.$ic9$);
        Structures.def_csetf((SubLObject)module0067.$ic10$, (SubLObject)module0067.$ic11$);
        Structures.def_csetf((SubLObject)module0067.$ic12$, (SubLObject)module0067.$ic13$);
        Equality.identity((SubLObject)module0067.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0067.$g1087$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0067.$ic21$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0067.$ic29$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0067.$ic34$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0067.$ic35$);
        module0002.f50((SubLObject)module0067.$ic40$, (SubLObject)module0067.$ic42$);
        module0021.f1098(module0067.$g1088$.getGlobalValue(), (SubLObject)module0067.$ic58$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0067.$g1087$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0067.$ic59$));
        module0021.f1098(module0067.$g1089$.getGlobalValue(), (SubLObject)module0067.$ic61$);
        return (SubLObject)module0067.NIL;
    }
    
    public void declareFunctions() {
        f4905();
    }
    
    public void initializeVariables() {
        f4906();
    }
    
    public void runTopLevelForms() {
        f4907();
    }
    
    static {
        me = (SubLFile)new module0067();
        module0067.$g1085$ = null;
        module0067.$g1086$ = null;
        module0067.$g1087$ = null;
        module0067.$g1088$ = null;
        module0067.$g1089$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#6423", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#6424", "CYC");
        $ic2$ = SubLObjectFactory.makeInteger(133);
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6472", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DATABASE"), (SubLObject)SubLObjectFactory.makeKeyword("TEST"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6427", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3045", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6428", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6429", "CYC"));
        $ic7$ = SubLObjectFactory.makeSymbol("S#6433", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#6426", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#6424", "CYC"));
        $ic10$ = SubLObjectFactory.makeSymbol("S#6427", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#6428", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#3045", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#6429", "CYC");
        $ic14$ = SubLObjectFactory.makeKeyword("DATABASE");
        $ic15$ = SubLObjectFactory.makeKeyword("TEST");
        $ic16$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic17$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic18$ = SubLObjectFactory.makeSymbol("S#6430", "CYC");
        $ic19$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic20$ = SubLObjectFactory.makeKeyword("END");
        $ic21$ = SubLObjectFactory.makeSymbol("S#6432", "CYC");
        $ic22$ = SubLObjectFactory.makeString("#<");
        $ic23$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic24$ = SubLObjectFactory.makeString("(");
        $ic25$ = SubLObjectFactory.makeString(" ");
        $ic26$ = SubLObjectFactory.makeString(")");
        $ic27$ = SubLObjectFactory.makeString(" size=");
        $ic28$ = SubLObjectFactory.makeKeyword("BASE");
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#6434", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6435", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6436", "CYC"));
        $ic30$ = SubLObjectFactory.makeKeyword("ALIST");
        $ic31$ = SubLObjectFactory.makeKeyword("HASHTABLE");
        $ic32$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic33$ = SubLObjectFactory.makeString("Corrupted dictionary; unsupported style ~S.~%");
        $ic34$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("INLINE"), SubLObjectFactory.makeSymbol("S#6437", "CYC"), SubLObjectFactory.makeSymbol("S#6438", "CYC"), SubLObjectFactory.makeSymbol("S#6439", "CYC"), SubLObjectFactory.makeSymbol("S#6440", "CYC"), SubLObjectFactory.makeSymbol("S#6441", "CYC"), SubLObjectFactory.makeSymbol("S#6442", "CYC"), SubLObjectFactory.makeSymbol("S#6443", "CYC"), SubLObjectFactory.makeSymbol("S#6444", "CYC") });
        $ic35$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("INLINE"), SubLObjectFactory.makeSymbol("S#6445", "CYC"), SubLObjectFactory.makeSymbol("S#6446", "CYC"), SubLObjectFactory.makeSymbol("S#6447", "CYC"), SubLObjectFactory.makeSymbol("S#6448", "CYC"), SubLObjectFactory.makeSymbol("S#6449", "CYC"), SubLObjectFactory.makeSymbol("S#6450", "CYC"), SubLObjectFactory.makeSymbol("S#6451", "CYC"), SubLObjectFactory.makeSymbol("S#6452", "CYC") });
        $ic36$ = SubLObjectFactory.makeSymbol("S#2831", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic38$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6423", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic39$ = SubLObjectFactory.makeSymbol("S#6410", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#6422", "CYC");
        $ic41$ = SubLObjectFactory.makeKeyword("DONE");
        $ic42$ = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $ic43$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6423", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6473", "CYC"), (SubLObject)SubLObjectFactory.makeString("Mapping dictionary..."))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic44$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-NOTE"));
        $ic45$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic46$ = SubLObjectFactory.makeKeyword("PROGRESS-NOTE");
        $ic47$ = SubLObjectFactory.makeString("Mapping dictionary...");
        $ic48$ = SubLObjectFactory.makeUninternedSymbol("US#32A3846");
        $ic49$ = SubLObjectFactory.makeUninternedSymbol("US#13E86D7");
        $ic50$ = SubLObjectFactory.makeSymbol("CLET");
        $ic51$ = ConsesLow.list((SubLObject)module0067.ZERO_INTEGER);
        $ic52$ = SubLObjectFactory.makeSymbol("DICTIONARY-LENGTH");
        $ic53$ = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $ic54$ = SubLObjectFactory.makeSymbol("CINC");
        $ic55$ = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $ic56$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic57$ = SubLObjectFactory.makeInteger(61);
        $ic58$ = SubLObjectFactory.makeSymbol("S#6425", "CYC");
        $ic59$ = SubLObjectFactory.makeSymbol("S#6460", "CYC");
        $ic60$ = SubLObjectFactory.makeInteger(64);
        $ic61$ = SubLObjectFactory.makeSymbol("S#6465", "CYC");
    }
    
    public static final class $sX6423_native extends SubLStructNative
    {
        public SubLObject $database;
        public SubLObject $test;
        private static final SubLStructDeclNative structDecl;
        
        public $sX6423_native() {
            this.$database = (SubLObject)CommonSymbols.NIL;
            this.$test = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX6423_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$database;
        }
        
        public SubLObject getField3() {
            return this.$test;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$database = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$test = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX6423_native.class, module0067.$ic0$, module0067.$ic1$, module0067.$ic3$, module0067.$ic4$, new String[] { "$database", "$test" }, module0067.$ic5$, module0067.$ic6$, module0067.$ic7$);
        }
    }
    
    public static final class $f4852$UnaryFunction extends UnaryFunction
    {
        public $f4852$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#6424"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0067.f4852(var3);
        }
    }
    
    public static final class $f4897$UnaryFunction extends UnaryFunction
    {
        public $f4897$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#6425"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0067.f4897(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0067.class
	Total time: 194 ms
	
	Decompiled with Procyon 0.5.32.
*/