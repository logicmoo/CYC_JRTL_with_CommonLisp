package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0092 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0092";
    public static final String myFingerPrint = "6e50fdc0d910b51ea3c0d4412ae3195851b8c1fe2d7b783309632fb7a580da30";
    public static SubLSymbol $g1209$;
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
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
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
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLList $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLString $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLList $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLString $ic106$;
    
    public static SubLObject f6347(final SubLObject var1, final SubLObject var2) {
        f6348(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6349(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX8029_native.class) ? T : NIL);
    }
    
    public static SubLObject f6350(final SubLObject var1) {
        assert NIL != f6349(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f6351(final SubLObject var1) {
        assert NIL != f6349(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f6352(final SubLObject var1) {
        assert NIL != f6349(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f6353(final SubLObject var1) {
        assert NIL != f6349(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f6354(final SubLObject var1) {
        assert NIL != f6349(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f6355(final SubLObject var1) {
        assert NIL != f6349(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f6356(final SubLObject var1) {
        assert NIL != f6349(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f6357(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6349(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f6358(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6349(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f6359(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6349(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f6360(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6349(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f6361(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6349(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f6362(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6349(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f6363(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6349(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f6364(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX8029_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic23$)) {
                f6357(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic24$)) {
                f6358(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic25$)) {
                f6359(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic26$)) {
                f6360(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic27$)) {
                f6361(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic28$)) {
                f6362(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic29$)) {
                f6363(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic30$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f6365(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic31$, (SubLObject)$ic32$, (SubLObject)SEVEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic33$, (SubLObject)$ic23$, f6350(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic33$, (SubLObject)$ic24$, f6351(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic33$, (SubLObject)$ic25$, f6352(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic33$, (SubLObject)$ic26$, f6353(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic33$, (SubLObject)$ic27$, f6354(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic33$, (SubLObject)$ic28$, f6355(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic33$, (SubLObject)$ic29$, f6356(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic34$, (SubLObject)$ic32$, (SubLObject)SEVEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f6366(final SubLObject var11, final SubLObject var12) {
        return f6365(var11, var12);
    }
    
    public static SubLObject f6348(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)$ic36$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { $ic37$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            streams_high.write_string((SubLObject)$ic38$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f6367(var13), var2);
            streams_high.write_string((SubLObject)$ic39$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f6368(var13), var2);
            if (NIL != module0090.f6183(f6356(var13))) {
                streams_high.write_string((SubLObject)$ic38$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                print_high.princ(f6356(var13), var2);
                streams_high.write_string((SubLObject)$ic38$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var13), new SubLObject[] { $ic37$, var2, $ic40$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var13;
    }
    
    public static SubLObject f6369(final SubLObject var20, SubLObject var21) {
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)EQL;
        }
        final SubLObject var22 = f6364((SubLObject)UNPROVIDED);
        f6357(var22, var20);
        f6358(var22, Hashtables.make_hash_table(var20, var21, (SubLObject)UNPROVIDED));
        f6359(var22, Vectors.make_vector(Numbers.multiply((SubLObject)THREE_INTEGER, var20), (SubLObject)UNPROVIDED));
        f6370(var22);
        f6371(var22);
        f6363(var22, (SubLObject)NIL);
        return var22;
    }
    
    public static SubLObject f6372(final SubLObject var22) {
        f6370(var22);
        f6371(var22);
        Hashtables.clrhash(f6351(var22));
        return var22;
    }
    
    public static SubLObject f6367(final SubLObject var22) {
        return Hashtables.hash_table_count(f6351(var22));
    }
    
    public static SubLObject f6368(final SubLObject var22) {
        return f6350(var22);
    }
    
    public static SubLObject f6373(final SubLObject var22, final SubLObject var23) {
        return module0035.sublisp_boolean(Hashtables.gethash_without_values(var23, f6351(var22), (SubLObject)NIL));
    }
    
    public static SubLObject f6374(final SubLObject var22, final SubLObject var23) {
        if (NIL != f6373(var22, var23)) {
            f6375(var22, var23);
            return var23;
        }
        if (NIL != f6376(var22)) {
            final SubLObject var24 = f6377(var22, var23);
            final SubLObject var25 = f6351(var22);
            final SubLObject var26 = f6353(var22);
            Hashtables.remhash(var24, var25);
            Hashtables.sethash(var23, var25, var26);
            return var24;
        }
        final SubLObject var27 = f6378(var22, var23);
        Hashtables.sethash(var23, f6351(var22), var27);
        return var23;
    }
    
    public static SubLObject f6375(final SubLObject var22, final SubLObject var23) {
        final SubLObject var24 = Hashtables.gethash_without_values(var23, f6351(var22), (SubLObject)UNPROVIDED);
        if (NIL != var24) {
            if (!var24.numE(f6353(var22))) {
                if (var24.numE(f6354(var22))) {
                    f6379(var22);
                    if (!var24.numE(f6353(var22))) {
                        Errors.warn((SubLObject)$ic42$);
                        final SubLObject var25 = f6351(var22);
                        final SubLObject var26 = f6353(var22);
                        Hashtables.sethash(var23, var25, var26);
                    }
                }
                else {
                    final SubLObject var27 = f6380(var22, var24);
                    f6381(var22, var24, var27);
                }
            }
        }
        return var22;
    }
    
    public static SubLObject f6382(final SubLObject var22, final SubLObject var23) {
        final SubLObject var24 = f6351(var22);
        final SubLObject var25 = Hashtables.gethash_without_values(var23, var24, (SubLObject)UNPROVIDED);
        if (NIL != var25) {
            Hashtables.remhash(var23, var24);
            f6383(var22, var25);
        }
        return var23;
    }
    
    public static SubLObject f6384(final SubLObject var22, final SubLObject var28) {
        final SubLObject var29 = f6367(var22);
        if (var29.isZero()) {
            return (SubLObject)NIL;
        }
        if (!var28.numL(var29)) {
            return (SubLObject)NIL;
        }
        SubLObject var30 = f6353(var22);
        for (SubLObject var31 = (SubLObject)ZERO_INTEGER; var31.numL(var28); var31 = Numbers.add(var31, (SubLObject)ONE_INTEGER)) {
            var30 = f6385(var22, var30);
        }
        return f6386(var22, var30);
    }
    
    public static SubLObject f6387(final SubLObject var22) {
        return f6384(var22, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f6388(final SubLObject var22) {
        return f6389(var22, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f6389(final SubLObject var22, final SubLObject var28) {
        final SubLObject var29 = f6367(var22);
        if (var29.isZero()) {
            return (SubLObject)NIL;
        }
        if (!var28.numL(var29)) {
            return (SubLObject)NIL;
        }
        SubLObject var30 = f6354(var22);
        for (SubLObject var31 = (SubLObject)ZERO_INTEGER; var31.numL(var28); var31 = Numbers.add(var31, (SubLObject)ONE_INTEGER)) {
            var30 = f6390(var22, var30);
        }
        return f6386(var22, var30);
    }
    
    public static SubLObject f6391(final SubLObject var22) {
        final SubLObject var23 = f6367(var22);
        SubLObject var25;
        final SubLObject var24 = var25 = (SubLObject)ConsesLow.make_list(var23, (SubLObject)UNPROVIDED);
        SubLObject var26 = f6353(var22);
        SubLObject var27;
        for (var27 = (SubLObject)NIL, var27 = (SubLObject)ZERO_INTEGER; var27.numL(var23); var27 = Numbers.add(var27, (SubLObject)ONE_INTEGER)) {
            ConsesLow.rplaca(var25, f6386(var22, var26));
            var26 = f6385(var22, var26);
            var25 = var25.rest();
        }
        return var24;
    }
    
    public static SubLObject f6392(final SubLObject var22) {
        final SubLObject var23 = f6367(var22);
        SubLObject var25;
        final SubLObject var24 = var25 = (SubLObject)ConsesLow.make_list(var23, (SubLObject)UNPROVIDED);
        SubLObject var26 = f6354(var22);
        SubLObject var27;
        for (var27 = (SubLObject)NIL, var27 = (SubLObject)ZERO_INTEGER; var27.numL(var23); var27 = Numbers.add(var27, (SubLObject)ONE_INTEGER)) {
            ConsesLow.rplaca(var25, f6386(var22, var26));
            var26 = f6390(var22, var26);
            var25 = var25.rest();
        }
        return var24;
    }
    
    public static SubLObject f6393(final SubLObject var22, SubLObject var35) {
        if (var35 == UNPROVIDED) {
            var35 = (SubLObject)$ic43$;
        }
        final SubLObject var36 = ($ic43$ == var35) ? f6391(var22) : f6392(var22);
        return module0052.f3709(var36);
    }
    
    public static SubLObject f6394(final SubLObject var25) {
        return Numbers.multiply(var25, (SubLObject)THREE_INTEGER);
    }
    
    public static SubLObject f6395(final SubLObject var25) {
        return Numbers.add((SubLObject)ONE_INTEGER, Numbers.multiply(var25, (SubLObject)THREE_INTEGER));
    }
    
    public static SubLObject f6396(final SubLObject var25) {
        return Numbers.add((SubLObject)TWO_INTEGER, Numbers.multiply(var25, (SubLObject)THREE_INTEGER));
    }
    
    public static SubLObject f6397(final SubLObject var22) {
        return Sequences.length(f6352(var22));
    }
    
    public static SubLObject f6386(final SubLObject var22, final SubLObject var25) {
        final SubLObject var26 = f6352(var22);
        return Vectors.aref(var26, f6394(var25));
    }
    
    public static SubLObject f6390(final SubLObject var22, final SubLObject var25) {
        final SubLObject var26 = f6352(var22);
        return Vectors.aref(var26, f6395(var25));
    }
    
    public static SubLObject f6385(final SubLObject var22, final SubLObject var25) {
        final SubLObject var26 = f6352(var22);
        return Vectors.aref(var26, f6396(var25));
    }
    
    public static SubLObject f6398(final SubLObject var25) {
        final SubLObject var27;
        final SubLObject var26 = var27 = Numbers.mod(var25, (SubLObject)THREE_INTEGER);
        if (var27.eql((SubLObject)ZERO_INTEGER)) {
            return (SubLObject)$ic44$;
        }
        if (var27.eql((SubLObject)ONE_INTEGER)) {
            return (SubLObject)$ic45$;
        }
        if (var27.eql((SubLObject)TWO_INTEGER)) {
            return (SubLObject)$ic46$;
        }
        Errors.error((SubLObject)$ic47$);
        return (SubLObject)$ic48$;
    }
    
    public static SubLObject f6399(final SubLObject var36, final SubLObject var25, final SubLObject var38) {
        return Vectors.set_aref(var36, f6394(var25), var38);
    }
    
    public static SubLObject f6400(final SubLObject var36, final SubLObject var25, final SubLObject var38) {
        return Vectors.set_aref(var36, f6395(var25), var38);
    }
    
    public static SubLObject f6401(final SubLObject var36, final SubLObject var25, final SubLObject var38) {
        return Vectors.set_aref(var36, f6396(var25), var38);
    }
    
    public static SubLObject f6402(final SubLObject var22, final SubLObject var25, final SubLObject var38) {
        final SubLObject var39 = f6352(var22);
        return f6399(var39, var25, var38);
    }
    
    public static SubLObject f6403(final SubLObject var22, final SubLObject var25, final SubLObject var38) {
        final SubLObject var39 = f6352(var22);
        return f6400(var39, var25, var38);
    }
    
    public static SubLObject f6404(final SubLObject var22, final SubLObject var25, final SubLObject var38) {
        final SubLObject var39 = f6352(var22);
        return f6401(var39, var25, var38);
    }
    
    public static SubLObject f6370(final SubLObject var22) {
        f6360(var22, (SubLObject)NIL);
        f6361(var22, (SubLObject)NIL);
        return var22;
    }
    
    public static SubLObject f6380(final SubLObject var22, final SubLObject var25) {
        final SubLObject var26 = f6386(var22, var25);
        final SubLObject var27 = f6385(var22, var25);
        final SubLObject var28 = f6390(var22, var25);
        if (NIL == var27) {
            f6361(var22, var28);
        }
        else {
            f6403(var22, var27, var28);
        }
        if (NIL == var28) {
            f6360(var22, var27);
        }
        else {
            f6404(var22, var28, var27);
        }
        return var26;
    }
    
    public static SubLObject f6383(final SubLObject var22, final SubLObject var25) {
        SubLObject var26 = (SubLObject)NIL;
        var26 = f6380(var22, var25);
        f6405(var22, var25);
        return var26;
    }
    
    public static SubLObject f6378(final SubLObject var22, final SubLObject var38) {
        final SubLObject var39 = f6406(var22);
        return f6381(var22, var39, var38);
    }
    
    public static SubLObject f6381(final SubLObject var22, final SubLObject var25, final SubLObject var38) {
        f6407(var22, var25);
        f6402(var22, var25, var38);
        return var25;
    }
    
    public static SubLObject f6377(final SubLObject var22, final SubLObject var38) {
        final SubLObject var39 = f6379(var22);
        final SubLObject var40 = f6353(var22);
        f6402(var22, var40, var38);
        return var39;
    }
    
    public static SubLObject f6379(final SubLObject var22) {
        final SubLObject var23 = f6354(var22);
        final SubLObject var24 = f6390(var22, var23);
        final SubLObject var25 = f6386(var22, var23);
        f6403(var22, var23, (SubLObject)NIL);
        f6404(var22, var24, (SubLObject)NIL);
        f6361(var22, var24);
        f6407(var22, var23);
        return var25;
    }
    
    public static SubLObject f6407(final SubLObject var22, final SubLObject var41) {
        final SubLObject var42 = f6353(var22);
        f6403(var22, var41, (SubLObject)NIL);
        f6404(var22, var41, var42);
        if (NIL == var42) {
            f6361(var22, var41);
        }
        else {
            f6403(var22, var42, var41);
        }
        f6360(var22, var41);
        return var22;
    }
    
    public static SubLObject f6408(final SubLObject var22) {
        streams_high.write_string((SubLObject)$ic49$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        print_high.princ(f6353(var22), (SubLObject)UNPROVIDED);
        streams_high.write_string((SubLObject)$ic50$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var23 = f6352(var22);
        SubLObject var24;
        SubLObject var25;
        SubLObject var27;
        SubLObject var26;
        for (var24 = Sequences.length(var23), var25 = (SubLObject)NIL, var25 = (SubLObject)ZERO_INTEGER; var25.numL(var24); var25 = Numbers.add(var25, (SubLObject)ONE_INTEGER)) {
            var26 = (var27 = f6398(var25));
            if (var27.eql((SubLObject)$ic44$)) {
                streams_high.write_string((SubLObject)$ic51$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                print_high.princ(Numbers.integerDivide(var25, (SubLObject)THREE_INTEGER), (SubLObject)UNPROVIDED);
                streams_high.write_string((SubLObject)$ic52$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var27.eql((SubLObject)$ic45$)) {
                streams_high.write_string((SubLObject)$ic53$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var27.eql((SubLObject)$ic46$)) {
                streams_high.write_string((SubLObject)$ic54$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            print_high.princ(Vectors.aref(var23, var25), (SubLObject)UNPROVIDED);
            streams_high.write_string((SubLObject)$ic38$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        streams_high.write_string((SubLObject)$ic55$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        print_high.princ(f6354(var22), (SubLObject)UNPROVIDED);
        streams_high.terpri((SubLObject)UNPROVIDED);
        return var22;
    }
    
    public static SubLObject f6376(final SubLObject var22) {
        return Types.sublisp_null(f6355(var22));
    }
    
    public static SubLObject f6371(final SubLObject var22) {
        f6362(var22, (SubLObject)ZERO_INTEGER);
        SubLObject var23;
        SubLObject var24;
        for (var23 = f6350(var22), var24 = (SubLObject)NIL, var24 = (SubLObject)ZERO_INTEGER; var24.numL(var23); var24 = Numbers.add(var24, (SubLObject)ONE_INTEGER)) {
            f6403(var22, var24, Numbers.subtract(var24, (SubLObject)ONE_INTEGER));
            f6404(var22, var24, Numbers.add(var24, (SubLObject)ONE_INTEGER));
            f6402(var22, var24, (SubLObject)NIL);
        }
        f6403(var22, (SubLObject)ZERO_INTEGER, (SubLObject)NIL);
        final SubLObject var25 = Numbers.subtract(f6350(var22), (SubLObject)ONE_INTEGER);
        f6404(var22, var25, (SubLObject)NIL);
        return var22;
    }
    
    public static SubLObject f6406(final SubLObject var22) {
        final SubLObject var23 = f6355(var22);
        if (var23.isFixnum()) {
            f6362(var22, f6385(var22, var23));
        }
        return var23;
    }
    
    public static SubLObject f6405(final SubLObject var22, final SubLObject var25) {
        f6402(var22, var25, (SubLObject)NIL);
        f6403(var22, var25, (SubLObject)NIL);
        final SubLObject var26 = f6355(var22);
        f6362(var22, var25);
        f6404(var22, var25, var26);
        return var22;
    }
    
    public static SubLObject f6409(final SubLObject var51) {
        return (SubLObject)T;
    }
    
    public static SubLObject f6410(final SubLObject var51) {
        return f6411(var51);
    }
    
    public static SubLObject f6412(final SubLObject var51) {
        return f6413(var51);
    }
    
    public static SubLObject f6414(final SubLObject var51) {
        return f6415(var51);
    }
    
    public static SubLObject f6416(final SubLObject var51, final SubLObject var13) {
        return f6417(var51, var13);
    }
    
    public static SubLObject f6418(final SubLObject var51, final SubLObject var13) {
        return f6419(var51, var13);
    }
    
    public static SubLObject f6420(final SubLObject var51, final SubLObject var13) {
        return f6421(var51, var13);
    }
    
    public static SubLObject f6422(final SubLObject var51, final SubLObject var52) {
        return f6423(var51, var52);
    }
    
    public static SubLObject f6424(final SubLObject var51, final SubLObject var52, final SubLObject var53) {
        return f6425(var51, var52, var53);
    }
    
    public static SubLObject f6426(final SubLObject var51, final SubLObject var52, final SubLObject var53) {
        return f6427(var51, var52, var53);
    }
    
    public static SubLObject f6428(final SubLObject var51, final SubLObject var13) {
        return f6429(var51, var13);
    }
    
    public static SubLObject f6430(final SubLObject var51, final SubLObject var54) {
        return f6431(var51, var54);
    }
    
    public static SubLObject f6432(final SubLObject var51) {
        return f6433(var51);
    }
    
    public static SubLObject f6434(final SubLObject var51) {
        return f6435(var51);
    }
    
    public static SubLObject f6436(final SubLObject var51, final SubLObject var55) {
        return f6437(var51, var55);
    }
    
    public static SubLObject f6438(final SubLObject var51) {
        return f6439(var51);
    }
    
    public static SubLObject f6440(final SubLObject var51) {
        return f6441(var51);
    }
    
    public static SubLObject f6442(final SubLObject var51) {
        return f6443(var51);
    }
    
    public static SubLObject f6444(final SubLObject var51, final SubLObject var56) {
        return f6445(var51, var56);
    }
    
    public static SubLObject f6446(final SubLObject var51, final SubLObject var56) {
        return f6447(var51, var56);
    }
    
    public static SubLObject f6413(final SubLObject var51) {
        return f6368(var51);
    }
    
    public static SubLObject f6415(final SubLObject var51) {
        return f6367(var51);
    }
    
    public static SubLObject f6439(final SubLObject var51) {
        final SubLObject var52 = f6356(var51);
        f6363(var51, (SubLObject)NIL);
        return var52;
    }
    
    public static SubLObject f6437(final SubLObject var51, final SubLObject var55) {
        f6363(var51, var55);
        return var51;
    }
    
    public static SubLObject f6433(final SubLObject var51) {
        return f6356(var51);
    }
    
    public static SubLObject f6425(final SubLObject var51, final SubLObject var52, final SubLObject var53) {
        return var53;
    }
    
    public static SubLObject f6441(final SubLObject var51) {
        return module0090.f6183(f6356(var51));
    }
    
    public static SubLObject f6429(final SubLObject var51, final SubLObject var13) {
        return f6375(var51, var13);
    }
    
    public static SubLObject f6431(final SubLObject var51, final SubLObject var54) {
        return module0090.f6178(var51, var54);
    }
    
    public static SubLObject f6411(final SubLObject var51) {
        return f6372(var51);
    }
    
    public static SubLObject f6435(final SubLObject var51) {
        return module0090.f6193(f6356(var51));
    }
    
    public static SubLObject f6427(final SubLObject var51, final SubLObject var52, final SubLObject var53) {
        return var53;
    }
    
    public static SubLObject f6423(final SubLObject var51, final SubLObject var52) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6417(final SubLObject var51, final SubLObject var13) {
        return f6374(var51, var13);
    }
    
    public static SubLObject f6419(final SubLObject var51, final SubLObject var13) {
        return f6373(var51, var13);
    }
    
    public static SubLObject f6421(final SubLObject var51, final SubLObject var13) {
        return f6382(var51, var13);
    }
    
    public static SubLObject f6447(final SubLObject var51, final SubLObject var56) {
        return module0090.f6180(var51, var56);
    }
    
    public static SubLObject f6445(final SubLObject var51, final SubLObject var56) {
        return module0090.f6179(var51, var56);
    }
    
    public static SubLObject f6443(final SubLObject var51) {
        return f6393(var51, (SubLObject)$ic43$);
    }
    
    public static SubLObject f6448(SubLObject var20) {
        if (var20 == UNPROVIDED) {
            var20 = (SubLObject)TEN_INTEGER;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = f6369(var20, (SubLObject)UNPROVIDED);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var21) && !f6367(var22).isZero()) {
            Errors.error((SubLObject)$ic84$);
        }
        SubLObject var23;
        for (var23 = (SubLObject)NIL, var23 = (SubLObject)ZERO_INTEGER; var23.numL(var20); var23 = Numbers.add(var23, (SubLObject)ONE_INTEGER)) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var21) && !var23.numE(f6367(var22))) {
                Errors.error((SubLObject)$ic85$, var23, f6367(var22));
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var21) && NIL != f6373(var22, var23)) {
                Errors.error((SubLObject)$ic86$, var23);
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var21) && !var23.numE(f6374(var22, var23))) {
                Errors.error((SubLObject)$ic87$, var23);
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var21) && !var23.numE(f6387(var22))) {
                Errors.error((SubLObject)$ic88$, var23, f6387(var22));
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var21) && NIL == f6373(var22, var23)) {
                Errors.error((SubLObject)$ic89$, var23);
            }
        }
        f6449(var22);
        f6450(var22);
        for (var23 = (SubLObject)NIL, var23 = (SubLObject)ZERO_INTEGER; var23.numL(var20); var23 = Numbers.add(var23, (SubLObject)ONE_INTEGER)) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var21) && NIL == f6373(var22, var23)) {
                Errors.error((SubLObject)$ic89$, var23);
            }
            f6375(var22, var23);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var21) && !var23.numE(f6387(var22))) {
                Errors.error((SubLObject)$ic90$, var23, f6387(var22));
            }
            f6449(var22);
        }
        for (var23 = (SubLObject)NIL, var23 = (SubLObject)ZERO_INTEGER; var23.numL(var20); var23 = Numbers.add(var23, (SubLObject)ONE_INTEGER)) {
            if (NIL != Numbers.evenp(var23)) {
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var21) && NIL == f6373(var22, var23)) {
                    Errors.error((SubLObject)$ic89$, var23);
                }
                f6375(var22, var23);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var21) && !var23.numE(f6387(var22))) {
                    Errors.error((SubLObject)$ic90$, var23, f6387(var22));
                }
                f6449(var22);
            }
        }
        SubLObject var24 = Numbers.add(var20, var20);
        SubLObject var25 = Numbers.minus((SubLObject)ONE_INTEGER);
        SubLObject var26;
        SubLObject var27;
        SubLObject var28;
        SubLObject var29;
        for (var26 = Numbers.integerDivide(var20, (SubLObject)TWO_INTEGER), var27 = (SubLObject)NIL, var27 = (SubLObject)ZERO_INTEGER; var27.numL(var26); var27 = Numbers.add(var27, (SubLObject)ONE_INTEGER)) {
            var28 = f6384(var22, var27);
            var29 = f6389(var22, var27);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var21) && NIL == Numbers.evenp(var28)) {
                Errors.error((SubLObject)$ic91$, var27, var28);
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var21) && NIL == Numbers.oddp(var29)) {
                Errors.error((SubLObject)$ic92$, var27, var29);
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var21) && !var24.numG(var28)) {
                Errors.error((SubLObject)$ic93$, var27, var24, var28);
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var21) && !var29.numG(var25)) {
                Errors.error((SubLObject)$ic94$, var27, var25, var29);
            }
            var24 = var28;
            var25 = var29;
        }
        f6372(var22);
        module0090.f6311(var22);
        return (SubLObject)$ic95$;
    }
    
    public static SubLObject f6451(final SubLObject var20, SubLObject var61) {
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)TEN_INTEGER;
        }
        final SubLThread var62 = SubLProcess.currentSubLThread();
        final SubLObject var63 = f6369(var20, (SubLObject)UNPROVIDED);
        final SubLObject var64 = module0089.f6073(var20, (SubLObject)UNPROVIDED);
        SubLObject var66;
        final SubLObject var65 = var66 = module0090.f6315(var20, var61);
        SubLObject var67 = (SubLObject)NIL;
        var67 = var66.first();
        while (NIL != var66) {
            final SubLObject var68 = f6391(var63);
            SubLObject var69 = module0089.f6085(var64, var67, var67);
            final SubLObject var70 = f6374(var63, var67);
            if (NIL == var69) {
                var69 = var67;
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var62) && !var69.numE(var70)) {
                Errors.error((SubLObject)$ic98$, new SubLObject[] { var67, var69, var70, var68 });
            }
            var66 = var66.rest();
            var67 = var66.first();
        }
        return (SubLObject)$ic95$;
    }
    
    public static SubLObject f6452(final SubLObject var20, SubLObject var61, SubLObject var67) {
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)TEN_INTEGER;
        }
        if (var67 == UNPROVIDED) {
            var67 = (SubLObject)ONE_INTEGER;
        }
        final SubLThread var68 = SubLProcess.currentSubLThread();
        final SubLObject var69 = f6369(var20, (SubLObject)UNPROVIDED);
        final SubLObject var70 = module0089.f6073(var20, (SubLObject)UNPROVIDED);
        final SubLObject var71 = module0090.f6315(var20, var61);
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74;
        SubLObject var75;
        SubLObject var76;
        SubLObject var77;
        for (var74 = (SubLObject)NIL, var74 = (SubLObject)ZERO_INTEGER; var74.numL(var67); var74 = Numbers.add(var74, (SubLObject)ONE_INTEGER)) {
            Storage.gc((SubLObject)UNPROVIDED);
            var75 = Time.get_internal_real_time();
            var76 = var71;
            var77 = (SubLObject)NIL;
            var77 = var76.first();
            while (NIL != var76) {
                f6374(var69, var77);
                var76 = var76.rest();
                var77 = var76.first();
            }
            var72 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var75), time_high.$internal_time_units_per_second$.getGlobalValue());
            Storage.gc((SubLObject)UNPROVIDED);
            var75 = Time.get_internal_real_time();
            var76 = var71;
            var77 = (SubLObject)NIL;
            var77 = var76.first();
            while (NIL != var76) {
                module0089.f6085(var70, var77, var77);
                var76 = var76.rest();
                var77 = var76.first();
            }
            var73 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var75), time_high.$internal_time_units_per_second$.getGlobalValue());
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var68) && !var72.numL(var73)) {
                Errors.error((SubLObject)$ic101$, Numbers.add((SubLObject)ONE_INTEGER, var74), var73, var72);
            }
        }
        return Values.values((SubLObject)$ic95$, var72, var73);
    }
    
    public static SubLObject f6449(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = f6391(var22);
        final SubLObject var25 = f6392(var22);
        if (!var24.equalp(Sequences.reverse(var25))) {
            f6408(var22);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var23)) {
                Errors.error((SubLObject)$ic102$, var24, var25);
            }
        }
        return var22;
    }
    
    public static SubLObject f6450(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        SubLObject var24;
        SubLObject var25;
        SubLObject var26;
        SubLObject var27;
        SubLObject var28;
        SubLObject var29;
        for (var24 = f6368(var22), var25 = (SubLObject)NIL, var25 = (SubLObject)ZERO_INTEGER; var25.numL(var24); var25 = Numbers.add(var25, (SubLObject)ONE_INTEGER)) {
            var26 = Numbers.subtract(Numbers.subtract(var24, (SubLObject)ONE_INTEGER), var25);
            var27 = var25;
            var28 = f6384(var22, var25);
            var29 = f6389(var22, var25);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var23) && NIL == module0004.f106(var28)) {
                Errors.error((SubLObject)$ic103$, var25, var28);
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var23) && NIL == module0004.f106(var28)) {
                Errors.error((SubLObject)$ic104$, var25, var29);
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var23) && !var26.numE(var28)) {
                Errors.error((SubLObject)$ic105$, var25, var26, var28);
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var23) && !var27.numE(var29)) {
                Errors.error((SubLObject)$ic106$, var25, var27, var29);
            }
        }
        return var22;
    }
    
    public static SubLObject f6453() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6347", "S#8031", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6349", "S#8030", 1, 0, false);
        new $f6349$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6350", "S#8032", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6351", "S#8033", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6352", "S#8034", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6353", "S#8035", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6354", "S#8036", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6355", "S#8037", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6356", "S#8038", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6357", "S#8039", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6358", "S#8040", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6359", "S#8041", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6360", "S#8042", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6361", "S#8043", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6362", "S#8044", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6363", "S#8045", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6364", "S#8046", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6365", "S#8047", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6366", "S#8048", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6348", "S#8049", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6369", "S#8050", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6372", "S#8051", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6367", "S#8052", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6368", "S#8053", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6373", "S#8054", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6374", "S#8055", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6375", "S#8056", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6382", "S#8057", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6384", "S#8058", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6387", "S#8059", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6388", "S#8060", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6389", "S#8061", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6391", "S#8062", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6392", "S#8063", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6393", "S#8064", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6394", "S#8065", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6395", "S#8066", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6396", "S#8067", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6397", "S#8068", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6386", "S#8069", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6390", "S#8070", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6385", "S#8071", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6398", "S#8072", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6399", "S#8073", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6400", "S#8074", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6401", "S#8075", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6402", "S#8076", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6403", "S#8077", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6404", "S#8078", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6370", "S#8079", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6380", "S#8080", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6383", "S#8081", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6378", "S#8082", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6381", "S#8083", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6377", "S#8084", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6379", "S#8085", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6407", "S#8086", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6408", "S#8087", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6376", "S#8088", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6371", "S#8089", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6406", "S#8090", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6405", "S#8091", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6409", "S#8092", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6410", "S#8093", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6412", "S#8094", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6414", "S#8095", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6416", "S#8096", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6418", "S#8097", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6420", "S#8098", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6422", "S#8099", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6424", "S#8100", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6426", "S#8101", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6428", "S#8102", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6430", "S#8103", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6432", "S#8104", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6434", "S#8105", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6436", "S#8106", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6438", "S#8107", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6440", "S#8108", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6442", "S#8109", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6444", "S#8110", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6446", "S#8111", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6413", "S#8112", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6415", "S#8113", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6439", "S#8114", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6437", "S#8115", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6433", "S#8116", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6425", "S#8117", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6441", "S#8118", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6429", "S#8119", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6431", "S#8120", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6411", "S#8121", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6435", "S#8122", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6427", "S#8123", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6423", "S#8124", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6417", "S#8125", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6419", "S#8126", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6421", "S#8127", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6447", "S#8128", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6445", "S#8129", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6443", "S#8130", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6448", "S#8131", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6451", "S#8132", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6452", "S#8133", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6449", "S#8134", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0092", "f6450", "S#8135", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6454() {
        $g1209$ = SubLFiles.defconstant("S#8136", (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6455() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1209$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Structures.def_csetf((SubLObject)$ic17$, (SubLObject)$ic18$);
        Structures.def_csetf((SubLObject)$ic19$, (SubLObject)$ic20$);
        Structures.def_csetf((SubLObject)$ic21$, (SubLObject)$ic22$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1209$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic35$));
        Structures.register_method(module0090.$g1184$.getGlobalValue(), $g1209$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic56$));
        Structures.register_method(module0090.$g1185$.getGlobalValue(), $g1209$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic57$));
        Structures.register_method(module0090.$g1186$.getGlobalValue(), $g1209$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic58$));
        Structures.register_method(module0090.$g1187$.getGlobalValue(), $g1209$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic59$));
        Structures.register_method(module0090.$g1188$.getGlobalValue(), $g1209$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic60$));
        Structures.register_method(module0090.$g1189$.getGlobalValue(), $g1209$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic61$));
        Structures.register_method(module0090.$g1190$.getGlobalValue(), $g1209$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic62$));
        Structures.register_method(module0090.$g1191$.getGlobalValue(), $g1209$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic63$));
        Structures.register_method(module0090.$g1192$.getGlobalValue(), $g1209$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic64$));
        Structures.register_method(module0090.$g1193$.getGlobalValue(), $g1209$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic65$));
        Structures.register_method(module0090.$g1194$.getGlobalValue(), $g1209$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic66$));
        Structures.register_method(module0090.$g1195$.getGlobalValue(), $g1209$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic67$));
        Structures.register_method(module0090.$g1196$.getGlobalValue(), $g1209$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic68$));
        Structures.register_method(module0090.$g1197$.getGlobalValue(), $g1209$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic69$));
        Structures.register_method(module0090.$g1198$.getGlobalValue(), $g1209$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic70$));
        Structures.register_method(module0090.$g1199$.getGlobalValue(), $g1209$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic71$));
        Structures.register_method(module0090.$g1200$.getGlobalValue(), $g1209$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic72$));
        Structures.register_method(module0090.$g1201$.getGlobalValue(), $g1209$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic73$));
        Structures.register_method(module0090.$g1202$.getGlobalValue(), $g1209$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic74$));
        Structures.register_method(module0090.$g1203$.getGlobalValue(), $g1209$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic75$));
        module0027.f1449((SubLObject)$ic76$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic77$, NIL, $ic78$, NIL, $ic79$, NIL, $ic80$, $ic81$, $ic82$, T }), (SubLObject)$ic83$);
        module0027.f1449((SubLObject)$ic96$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic77$, NIL, $ic78$, NIL, $ic79$, NIL, $ic80$, $ic81$, $ic82$, NIL }), (SubLObject)$ic97$);
        module0027.f1449((SubLObject)$ic99$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic77$, NIL, $ic78$, NIL, $ic79$, NIL, $ic80$, $ic81$, $ic82$, NIL }), (SubLObject)$ic100$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f6453();
    }
    
    public void initializeVariables() {
        f6454();
    }
    
    public void runTopLevelForms() {
        f6455();
    }
    
    static {
        me = (SubLFile)new module0092();
        $g1209$ = null;
        $ic0$ = makeSymbol("S#8029", "CYC");
        $ic1$ = makeSymbol("S#8030", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#2959", "CYC"), (SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("S#5858", "CYC"), (SubLObject)makeSymbol("S#1503", "CYC"), (SubLObject)makeSymbol("S#144", "CYC"), (SubLObject)makeSymbol("S#8137", "CYC"), (SubLObject)makeSymbol("S#7998", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("CAPACITY"), (SubLObject)makeKeyword("INDEX"), (SubLObject)makeKeyword("PAYLOAD"), (SubLObject)makeKeyword("HEAD"), (SubLObject)makeKeyword("TAIL"), (SubLObject)makeKeyword("FREELIST-HEAD"), (SubLObject)makeKeyword("METRICS"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#8032", "CYC"), (SubLObject)makeSymbol("S#8033", "CYC"), (SubLObject)makeSymbol("S#8034", "CYC"), (SubLObject)makeSymbol("S#8035", "CYC"), (SubLObject)makeSymbol("S#8036", "CYC"), (SubLObject)makeSymbol("S#8037", "CYC"), (SubLObject)makeSymbol("S#8038", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#8039", "CYC"), (SubLObject)makeSymbol("S#8040", "CYC"), (SubLObject)makeSymbol("S#8041", "CYC"), (SubLObject)makeSymbol("S#8042", "CYC"), (SubLObject)makeSymbol("S#8043", "CYC"), (SubLObject)makeSymbol("S#8044", "CYC"), (SubLObject)makeSymbol("S#8045", "CYC"));
        $ic6$ = makeSymbol("S#8049", "CYC");
        $ic7$ = makeSymbol("S#8031", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#8030", "CYC"));
        $ic9$ = makeSymbol("S#8032", "CYC");
        $ic10$ = makeSymbol("S#8039", "CYC");
        $ic11$ = makeSymbol("S#8033", "CYC");
        $ic12$ = makeSymbol("S#8040", "CYC");
        $ic13$ = makeSymbol("S#8034", "CYC");
        $ic14$ = makeSymbol("S#8041", "CYC");
        $ic15$ = makeSymbol("S#8035", "CYC");
        $ic16$ = makeSymbol("S#8042", "CYC");
        $ic17$ = makeSymbol("S#8036", "CYC");
        $ic18$ = makeSymbol("S#8043", "CYC");
        $ic19$ = makeSymbol("S#8037", "CYC");
        $ic20$ = makeSymbol("S#8044", "CYC");
        $ic21$ = makeSymbol("S#8038", "CYC");
        $ic22$ = makeSymbol("S#8045", "CYC");
        $ic23$ = makeKeyword("CAPACITY");
        $ic24$ = makeKeyword("INDEX");
        $ic25$ = makeKeyword("PAYLOAD");
        $ic26$ = makeKeyword("HEAD");
        $ic27$ = makeKeyword("TAIL");
        $ic28$ = makeKeyword("FREELIST-HEAD");
        $ic29$ = makeKeyword("METRICS");
        $ic30$ = makeString("Invalid slot ~S for construction function");
        $ic31$ = makeKeyword("BEGIN");
        $ic32$ = makeSymbol("S#8046", "CYC");
        $ic33$ = makeKeyword("SLOT");
        $ic34$ = makeKeyword("END");
        $ic35$ = makeSymbol("S#8048", "CYC");
        $ic36$ = makeString("#<");
        $ic37$ = makeKeyword("STREAM");
        $ic38$ = makeString(" ");
        $ic39$ = makeString("/");
        $ic40$ = makeKeyword("BASE");
        $ic41$ = makeString("Invalid state transition in TRACK");
        $ic42$ = makeString("There is a situation where RECYCLE introduces a new spot--investigate!");
        $ic43$ = makeKeyword("FORWARD");
        $ic44$ = makeKeyword("DATUM");
        $ic45$ = makeKeyword("BACKREF");
        $ic46$ = makeKeyword("FWDREF");
        $ic47$ = makeString("Wow, MOD is broken ...!");
        $ic48$ = makeKeyword("ERROR");
        $ic49$ = makeString("Head: ");
        $ic50$ = makeString(" [");
        $ic51$ = makeString("| #");
        $ic52$ = makeString(": v=");
        $ic53$ = makeString(" <-M ");
        $ic54$ = makeString(" L-> ");
        $ic55$ = makeString("|] Tail: ");
        $ic56$ = makeSymbol("S#8092", "CYC");
        $ic57$ = makeSymbol("S#8093", "CYC");
        $ic58$ = makeSymbol("S#8094", "CYC");
        $ic59$ = makeSymbol("S#8095", "CYC");
        $ic60$ = makeSymbol("S#8096", "CYC");
        $ic61$ = makeSymbol("S#8097", "CYC");
        $ic62$ = makeSymbol("S#8098", "CYC");
        $ic63$ = makeSymbol("S#8099", "CYC");
        $ic64$ = makeSymbol("S#8100", "CYC");
        $ic65$ = makeSymbol("S#8101", "CYC");
        $ic66$ = makeSymbol("S#8102", "CYC");
        $ic67$ = makeSymbol("S#8103", "CYC");
        $ic68$ = makeSymbol("S#8104", "CYC");
        $ic69$ = makeSymbol("S#8105", "CYC");
        $ic70$ = makeSymbol("S#8106", "CYC");
        $ic71$ = makeSymbol("S#8107", "CYC");
        $ic72$ = makeSymbol("S#8108", "CYC");
        $ic73$ = makeSymbol("S#8109", "CYC");
        $ic74$ = makeSymbol("S#8110", "CYC");
        $ic75$ = makeSymbol("S#8111", "CYC");
        $ic76$ = makeSymbol("S#8131", "CYC");
        $ic77$ = makeKeyword("TEST");
        $ic78$ = makeKeyword("OWNER");
        $ic79$ = makeKeyword("CLASSES");
        $ic80$ = makeKeyword("KB");
        $ic81$ = makeKeyword("TINY");
        $ic82$ = makeKeyword("WORKING?");
        $ic83$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)TEN_INTEGER), (SubLObject)makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)TWENTY_INTEGER), (SubLObject)makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeInteger(50)), (SubLObject)makeKeyword("SUCCESS")));
        $ic84$ = makeString("The freshly allocated cache strategy is not empty.");
        $ic85$ = makeString("There are not ~A, but ~A items in the cache.");
        $ic86$ = makeString("The item ~A is being tracked before we added it.");
        $ic87$ = makeString("The addition of the item ~A to the cache did not result in that item being returned.");
        $ic88$ = makeString("The newly added item ~A is not the most recent item ~A.");
        $ic89$ = makeString("The item ~A is not tracked despite the fact that we just added it.");
        $ic90$ = makeString("The just-touched item ~A is not the most recent item ~A.");
        $ic91$ = makeString("The most-recent nth ~A is not even but ~A.");
        $ic92$ = makeString("The least-recent nth ~A is not odd but ~A.");
        $ic93$ = makeString("At ~A, the previous most-recent ~A is not larger than the current ~A.");
        $ic94$ = makeString("At ~A, the previous least-recent ~A is not smaller than the current ~A.");
        $ic95$ = makeKeyword("SUCCESS");
        $ic96$ = makeSymbol("S#8132", "CYC");
        $ic97$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)TEN_INTEGER, (SubLObject)TWO_INTEGER), (SubLObject)makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeInteger(100), (SubLObject)TWENTY_INTEGER), (SubLObject)makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeInteger(1000), (SubLObject)makeInteger(50)), (SubLObject)makeKeyword("SUCCESS")));
        $ic98$ = makeString("The CACHE-P and the SLRU-CACHE are out of sync. ~%Upon adding item ~A, CACHE-P returned ~A and SLRU-CACHE ~A~%Prior State: ~A~%");
        $ic99$ = makeSymbol("S#8133", "CYC");
        $ic100$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeInteger(1000), (SubLObject)makeInteger(50)), (SubLObject)makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeInteger(2000), (SubLObject)makeInteger(80)), (SubLObject)makeKeyword("SUCCESS")));
        $ic101$ = makeString("Sorry, but on run #~A CACHE-P took ~As and SLRU took ~As");
        $ic102$ = makeString("The most recent item list is ~A, but the least recent item list is ~A.");
        $ic103$ = makeString("At ~A, the most recent value should have been a NON-NEGATIVE-INTEGER-P but is ~A instead.");
        $ic104$ = makeString("At ~A, the least recent value should have been a NON-NEGATIVE-INTEGER-P but is ~A instead.");
        $ic105$ = makeString("The most-recent nth of ~A was supposed to be ~A but was ~A instead.");
        $ic106$ = makeString("The least-recent nth of ~A was supposed to be ~A but was ~A instead.");
    }
    
    public static final class $sX8029_native extends SubLStructNative
    {
        public SubLObject $capacity;
        public SubLObject $index;
        public SubLObject $payload;
        public SubLObject $head;
        public SubLObject $tail;
        public SubLObject $freelist_head;
        public SubLObject $metrics;
        private static final SubLStructDeclNative structDecl;
        
        public $sX8029_native() {
            this.$capacity = (SubLObject)CommonSymbols.NIL;
            this.$index = (SubLObject)CommonSymbols.NIL;
            this.$payload = (SubLObject)CommonSymbols.NIL;
            this.$head = (SubLObject)CommonSymbols.NIL;
            this.$tail = (SubLObject)CommonSymbols.NIL;
            this.$freelist_head = (SubLObject)CommonSymbols.NIL;
            this.$metrics = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX8029_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$capacity;
        }
        
        public SubLObject getField3() {
            return this.$index;
        }
        
        public SubLObject getField4() {
            return this.$payload;
        }
        
        public SubLObject getField5() {
            return this.$head;
        }
        
        public SubLObject getField6() {
            return this.$tail;
        }
        
        public SubLObject getField7() {
            return this.$freelist_head;
        }
        
        public SubLObject getField8() {
            return this.$metrics;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$capacity = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$index = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$payload = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$head = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$tail = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$freelist_head = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$metrics = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX8029_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$capacity", "$index", "$payload", "$head", "$tail", "$freelist_head", "$metrics" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f6349$UnaryFunction extends UnaryFunction
    {
        public $f6349$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#8030"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f6349(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 272 ms
	
	Decompiled with Procyon 0.5.32.
*/