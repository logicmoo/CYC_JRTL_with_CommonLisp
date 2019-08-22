package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0782 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0782";
    public static final String myFingerPrint = "82fcc910db7544150218c0c5b50b0d8ee7880f4b5a2f471ad8baf178680741da";
    private static SubLSymbol $g6288$;
    private static SubLSymbol $g6289$;
    private static SubLSymbol $g6290$;
    public static SubLSymbol $g6291$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLList $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
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
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
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
    private static final SubLString $ic52$;
    private static final SubLSymbol $ic53$;
    
    public static SubLObject f50293(final SubLObject var1) {
        assert NIL != Types.stringp(var1) : var1;
        return f50294(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50295(final SubLObject var2) {
        return f50296(var2);
    }
    
    public static SubLObject f50297(final SubLObject var1) {
        final SubLObject var2 = f50293(var1);
        return f50295(var2);
    }
    
    public static SubLObject f50298() {
        return conses_high.copy_list($g6288$.getGlobalValue());
    }
    
    public static SubLObject f50299() {
        return conses_high.copy_list($g6290$.getGlobalValue());
    }
    
    public static SubLObject f50294(final SubLObject var3, SubLObject var4, SubLObject var5, SubLObject var6) {
        if (var4 == UNPROVIDED) {
            var4 = $g6290$.getGlobalValue();
        }
        if (var5 == UNPROVIDED) {
            var5 = $g6288$.getGlobalValue();
        }
        if (var6 == UNPROVIDED) {
            var6 = $g6289$.getGlobalValue();
        }
        SubLObject var7 = (SubLObject)$ic3$;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        SubLObject var15;
        SubLObject var14;
        SubLObject var15_16;
        SubLObject var15_17;
        SubLObject var15_18;
        SubLObject var15_19;
        for (var11 = Sequences.length(var3), var12 = (SubLObject)NIL, var12 = (SubLObject)ZERO_INTEGER; var12.numL(var11); var12 = Numbers.add(var12, (SubLObject)ONE_INTEGER)) {
            var13 = Vectors.aref(var3, var12);
            var14 = (var15 = f50300(var13, var4, var5, var6));
            if (var15.eql((SubLObject)$ic4$)) {
                var15_16 = var7;
                if (var15_16.eql((SubLObject)$ic5$)) {
                    var10 = var12;
                    var8 = (SubLObject)ConsesLow.cons(Sequences.subseq(var3, var9, var10), var8);
                    var9 = (SubLObject)NIL;
                    var10 = (SubLObject)NIL;
                    var7 = (SubLObject)$ic3$;
                }
            }
            else if (var15.eql((SubLObject)$ic6$)) {
                var15_17 = var7;
                if (var15_17.eql((SubLObject)$ic5$)) {
                    var10 = var12;
                    var8 = (SubLObject)ConsesLow.cons(Sequences.subseq(var3, var9, var10), var8);
                    var9 = (SubLObject)NIL;
                    var10 = (SubLObject)NIL;
                    var8 = (SubLObject)ConsesLow.cons(Sequences.subseq(var3, var12, Numbers.add(var12, (SubLObject)ONE_INTEGER)), var8);
                    var7 = (SubLObject)$ic3$;
                }
                else if (var15_17.eql((SubLObject)$ic3$)) {
                    var9 = var12;
                    var7 = (SubLObject)$ic5$;
                }
            }
            else if (var15.eql((SubLObject)$ic7$)) {
                var15_18 = var7;
                if (var15_18.eql((SubLObject)$ic5$)) {
                    var10 = var12;
                    var8 = (SubLObject)ConsesLow.cons(Sequences.subseq(var3, var9, var10), var8);
                    var9 = (SubLObject)NIL;
                    var10 = (SubLObject)NIL;
                    var8 = (SubLObject)ConsesLow.cons(Sequences.subseq(var3, var12, Numbers.add(var12, (SubLObject)ONE_INTEGER)), var8);
                    var7 = (SubLObject)$ic3$;
                }
                else if (var15_18.eql((SubLObject)$ic3$)) {
                    var8 = (SubLObject)ConsesLow.cons(Sequences.subseq(var3, var12, Numbers.add(var12, (SubLObject)ONE_INTEGER)), var8);
                }
            }
            else if (var15.eql((SubLObject)$ic8$)) {
                var15_19 = var7;
                if (var15_19.eql((SubLObject)$ic3$)) {
                    var9 = var12;
                    var7 = (SubLObject)$ic5$;
                }
            }
        }
        final SubLObject var16 = var7;
        if (var16.eql((SubLObject)$ic5$)) {
            var8 = (SubLObject)ConsesLow.cons(Sequences.subseq(var3, var9, (SubLObject)UNPROVIDED), var8);
        }
        return Sequences.nreverse(var8);
    }
    
    public static SubLObject f50300(final SubLObject var20, final SubLObject var4, final SubLObject var5, final SubLObject var6) {
        if (NIL != module0004.f104(var20, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)$ic4$;
        }
        if (NIL != module0004.f104(var20, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)$ic6$;
        }
        if (NIL != module0004.f104(var20, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)$ic7$;
        }
        return (SubLObject)$ic8$;
    }
    
    public static SubLObject f50301(final SubLObject var21, final SubLObject var22) {
        f50302(var21, var22, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50303(final SubLObject var21) {
        return (SubLObject)((var21.getClass() == $sX54855_native.class) ? T : NIL);
    }
    
    public static SubLObject f50304(final SubLObject var21) {
        assert NIL != f50303(var21) : var21;
        return var21.getField2();
    }
    
    public static SubLObject f50305(final SubLObject var21) {
        assert NIL != f50303(var21) : var21;
        return var21.getField3();
    }
    
    public static SubLObject f50306(final SubLObject var21) {
        assert NIL != f50303(var21) : var21;
        return var21.getField4();
    }
    
    public static SubLObject f50307(final SubLObject var21) {
        assert NIL != f50303(var21) : var21;
        return var21.getField5();
    }
    
    public static SubLObject f50308(final SubLObject var21, final SubLObject var24) {
        assert NIL != f50303(var21) : var21;
        return var21.setField2(var24);
    }
    
    public static SubLObject f50309(final SubLObject var21, final SubLObject var24) {
        assert NIL != f50303(var21) : var21;
        return var21.setField3(var24);
    }
    
    public static SubLObject f50310(final SubLObject var21, final SubLObject var24) {
        assert NIL != f50303(var21) : var21;
        return var21.setField4(var24);
    }
    
    public static SubLObject f50311(final SubLObject var21, final SubLObject var24) {
        assert NIL != f50303(var21) : var21;
        return var21.setField5(var24);
    }
    
    public static SubLObject f50312(SubLObject var25) {
        if (var25 == UNPROVIDED) {
            var25 = (SubLObject)NIL;
        }
        final SubLObject var26 = (SubLObject)new $sX54855_native();
        SubLObject var27;
        SubLObject var28;
        SubLObject var29;
        SubLObject var30;
        for (var27 = (SubLObject)NIL, var27 = var25; NIL != var27; var27 = conses_high.cddr(var27)) {
            var28 = var27.first();
            var29 = conses_high.cadr(var27);
            var30 = var28;
            if (var30.eql((SubLObject)$ic26$)) {
                f50308(var26, var29);
            }
            else if (var30.eql((SubLObject)$ic27$)) {
                f50309(var26, var29);
            }
            else if (var30.eql((SubLObject)$ic28$)) {
                f50310(var26, var29);
            }
            else if (var30.eql((SubLObject)$ic29$)) {
                f50311(var26, var29);
            }
            else {
                Errors.error((SubLObject)$ic30$, var28);
            }
        }
        return var26;
    }
    
    public static SubLObject f50313(final SubLObject var30, final SubLObject var31) {
        Functions.funcall(var31, var30, (SubLObject)$ic31$, (SubLObject)$ic32$, (SubLObject)FOUR_INTEGER);
        Functions.funcall(var31, var30, (SubLObject)$ic33$, (SubLObject)$ic26$, f50304(var30));
        Functions.funcall(var31, var30, (SubLObject)$ic33$, (SubLObject)$ic27$, f50305(var30));
        Functions.funcall(var31, var30, (SubLObject)$ic33$, (SubLObject)$ic28$, f50306(var30));
        Functions.funcall(var31, var30, (SubLObject)$ic33$, (SubLObject)$ic29$, f50307(var30));
        Functions.funcall(var31, var30, (SubLObject)$ic34$, (SubLObject)$ic32$, (SubLObject)FOUR_INTEGER);
        return var30;
    }
    
    public static SubLObject f50314(final SubLObject var30, final SubLObject var31) {
        return f50313(var30, var31);
    }
    
    public static SubLObject f50302(final SubLObject var32, final SubLObject var22, final SubLObject var33) {
        PrintLow.format(var22, (SubLObject)$ic36$, f50304(var32));
        PrintLow.format(var22, (SubLObject)$ic37$, f50305(var32));
        PrintLow.format(var22, (SubLObject)$ic38$, f50306(var32));
        PrintLow.format(var22, (SubLObject)$ic39$, f50307(var32));
        return var32;
    }
    
    public static SubLObject f50296(final SubLObject var34) {
        if (NIL == var34) {
            return (SubLObject)NIL;
        }
        final SubLObject var35 = conses_high.last(var34, (SubLObject)UNPROVIDED).first();
        if ($ic40$.equal(var35)) {
            final SubLObject var36 = conses_high.butlast(var34, (SubLObject)UNPROVIDED);
            final SubLObject var37 = f50315(var36);
            final SubLObject var38 = f50316(var37);
            return ConsesLow.append(var38, (SubLObject)ConsesLow.list((SubLObject)$ic40$));
        }
        final SubLObject var39 = f50315(var34);
        return f50316(var39);
    }
    
    public static SubLObject f50315(final SubLObject var34) {
        final SubLObject var35 = f50312((SubLObject)UNPROVIDED);
        f50308(var35, (SubLObject)NIL);
        f50309(var35, var34);
        f50310(var35, (SubLObject)NIL);
        f50311(var35, (SubLObject)$ic41$);
        return var35;
    }
    
    public static SubLObject f50317(final SubLObject var1) {
        if (var1.equal((SubLObject)$ic40$)) {
            return (SubLObject)$ic42$;
        }
        if (NIL != module0038.f2727(var1)) {
            return (SubLObject)$ic43$;
        }
        if (!ONE_INTEGER.numE(Sequences.length(var1))) {
            return (SubLObject)$ic44$;
        }
        if (NIL != Characters.alpha_char_p(Strings.sublisp_char(var1, (SubLObject)ZERO_INTEGER))) {
            return (SubLObject)$ic44$;
        }
        return (SubLObject)$ic45$;
    }
    
    public static SubLObject f50316(final SubLObject var32) {
        if ($ic41$ == f50307(var32) && NIL == f50305(var32)) {
            return Sequences.nreverse(f50304(var32));
        }
        final SubLObject var34;
        final SubLObject var33 = var34 = f50307(var32);
        if (var34.eql((SubLObject)$ic41$)) {
            f50318(var32);
        }
        else if (var34.eql((SubLObject)$ic46$)) {
            f50319(var32);
        }
        else if (var34.eql((SubLObject)$ic47$)) {
            f50320(var32);
        }
        else if (var34.eql((SubLObject)$ic48$)) {
            f50321(var32);
        }
        else if (var34.eql((SubLObject)$ic49$)) {
            f50322(var32);
        }
        return f50316(var32);
    }
    
    public static SubLObject f50318(final SubLObject var32) {
        final SubLObject var33 = f50305(var32).first();
        final SubLObject var34 = f50317(var33);
        f50309(var32, f50305(var32).rest());
        final SubLObject var35 = var34;
        if (var35.eql((SubLObject)$ic42$)) {
            f50308(var32, (SubLObject)ConsesLow.cons(var33, f50304(var32)));
        }
        else if (var35.eql((SubLObject)$ic45$)) {
            f50308(var32, (SubLObject)ConsesLow.cons(var33, f50304(var32)));
        }
        else if (var35.eql((SubLObject)$ic43$)) {
            f50310(var32, (SubLObject)ConsesLow.cons(var33, f50306(var32)));
            f50311(var32, (SubLObject)$ic48$);
        }
        else if (var35.eql((SubLObject)$ic44$)) {
            f50310(var32, (SubLObject)ConsesLow.cons(var33, f50306(var32)));
            f50311(var32, (SubLObject)$ic46$);
        }
        return var32;
    }
    
    public static SubLObject f50319(final SubLObject var32) {
        final SubLObject var33 = f50305(var32).first();
        if (NIL != var33) {
            final SubLObject var34 = f50317(var33);
            f50309(var32, f50305(var32).rest());
            final SubLObject var35 = var34;
            if (var35.eql((SubLObject)$ic42$)) {
                f50310(var32, (SubLObject)ConsesLow.cons(var33, f50306(var32)));
                f50311(var32, (SubLObject)$ic47$);
            }
            else if (var35.eql((SubLObject)$ic45$)) {
                f50323(var32, (SubLObject)$ic46$);
                f50308(var32, (SubLObject)ConsesLow.cons(var33, f50304(var32)));
                f50311(var32, (SubLObject)$ic41$);
            }
            else if (var35.eql((SubLObject)$ic43$)) {
                f50323(var32, (SubLObject)$ic46$);
                f50310(var32, (SubLObject)ConsesLow.cons(var33, f50306(var32)));
                f50311(var32, (SubLObject)$ic48$);
            }
            else if (var35.eql((SubLObject)$ic44$)) {
                f50323(var32, (SubLObject)$ic46$);
                f50310(var32, (SubLObject)ConsesLow.cons(var33, f50306(var32)));
                f50311(var32, (SubLObject)$ic46$);
            }
        }
        else {
            f50323(var32, (SubLObject)$ic46$);
            f50311(var32, (SubLObject)$ic41$);
        }
        return var32;
    }
    
    public static SubLObject f50320(final SubLObject var32) {
        final SubLObject var33 = f50305(var32).first();
        if (NIL != var33) {
            final SubLObject var34 = f50317(var33);
            f50309(var32, f50305(var32).rest());
            final SubLObject var35 = var34;
            if (var35.eql((SubLObject)$ic42$)) {
                f50323(var32, (SubLObject)$ic47$);
                f50308(var32, (SubLObject)ConsesLow.cons(var33, f50304(var32)));
                f50311(var32, (SubLObject)$ic41$);
            }
            else if (var35.eql((SubLObject)$ic45$)) {
                f50323(var32, (SubLObject)$ic47$);
                f50308(var32, (SubLObject)ConsesLow.cons(var33, f50304(var32)));
                f50311(var32, (SubLObject)$ic41$);
            }
            else if (var35.eql((SubLObject)$ic43$)) {
                f50323(var32, (SubLObject)$ic47$);
                f50310(var32, (SubLObject)ConsesLow.cons(var33, f50306(var32)));
                f50311(var32, (SubLObject)$ic48$);
            }
            else if (var35.eql((SubLObject)$ic44$)) {
                f50310(var32, (SubLObject)ConsesLow.cons(var33, f50306(var32)));
                f50311(var32, (SubLObject)$ic46$);
            }
        }
        else {
            f50323(var32, (SubLObject)$ic47$);
            f50311(var32, (SubLObject)$ic41$);
        }
        return var32;
    }
    
    public static SubLObject f50321(final SubLObject var32) {
        final SubLObject var33 = f50305(var32).first();
        if (NIL != var33) {
            final SubLObject var34 = f50317(var33);
            f50309(var32, f50305(var32).rest());
            final SubLObject var35 = var34;
            if (var35.eql((SubLObject)$ic42$)) {
                f50310(var32, (SubLObject)ConsesLow.cons(var33, f50306(var32)));
                f50311(var32, (SubLObject)$ic49$);
            }
            else if (var35.eql((SubLObject)$ic45$)) {
                f50323(var32, (SubLObject)$ic48$);
                f50308(var32, (SubLObject)ConsesLow.cons(var33, f50304(var32)));
                f50311(var32, (SubLObject)$ic41$);
            }
            else if (var35.eql((SubLObject)$ic43$)) {
                f50323(var32, (SubLObject)$ic48$);
                f50310(var32, (SubLObject)ConsesLow.cons(var33, f50306(var32)));
                f50311(var32, (SubLObject)$ic48$);
            }
            else if (var35.eql((SubLObject)$ic44$)) {
                f50323(var32, (SubLObject)$ic48$);
                f50310(var32, (SubLObject)ConsesLow.cons(var33, f50306(var32)));
                f50311(var32, (SubLObject)$ic46$);
            }
        }
        else {
            f50323(var32, (SubLObject)$ic48$);
            f50311(var32, (SubLObject)$ic41$);
        }
        return var32;
    }
    
    public static SubLObject f50322(final SubLObject var32) {
        final SubLObject var33 = f50305(var32).first();
        if (NIL != var33) {
            final SubLObject var34 = f50317(var33);
            f50309(var32, f50305(var32).rest());
            final SubLObject var35 = var34;
            if (var35.eql((SubLObject)$ic42$)) {
                f50323(var32, (SubLObject)$ic49$);
                f50308(var32, (SubLObject)ConsesLow.cons(var33, f50304(var32)));
                f50311(var32, (SubLObject)$ic41$);
            }
            else if (var35.eql((SubLObject)$ic45$)) {
                f50323(var32, (SubLObject)$ic49$);
                f50308(var32, (SubLObject)ConsesLow.cons(var33, f50304(var32)));
                f50311(var32, (SubLObject)$ic41$);
            }
            else if (var35.eql((SubLObject)$ic43$)) {
                final SubLObject var36 = (SubLObject)ConsesLow.cons(var33, f50306(var32));
                final SubLObject var37 = Functions.apply(Symbols.symbol_function((SubLObject)$ic50$), Sequences.nreverse(var36));
                f50308(var32, (SubLObject)ConsesLow.cons(var37, f50304(var32)));
                f50310(var32, (SubLObject)NIL);
                f50311(var32, (SubLObject)$ic41$);
            }
            else if (var35.eql((SubLObject)$ic44$)) {
                f50323(var32, (SubLObject)$ic49$);
                f50310(var32, (SubLObject)ConsesLow.cons(var33, f50306(var32)));
                f50311(var32, (SubLObject)$ic46$);
            }
        }
        else {
            f50323(var32, (SubLObject)$ic49$);
            f50311(var32, (SubLObject)$ic41$);
        }
        return var32;
    }
    
    public static SubLObject f50323(final SubLObject var32, final SubLObject var7) {
        if (var7.eql((SubLObject)$ic46$)) {
            final SubLObject var33 = f50306(var32).first();
            final SubLObject var34 = f50306(var32).rest();
            final SubLObject var35 = (SubLObject)((NIL != var34) ? Functions.apply(Symbols.symbol_function((SubLObject)$ic50$), Sequences.nreverse(var34)) : NIL);
            final SubLObject var36 = (SubLObject)((NIL != var35) ? ConsesLow.cons(var33, (SubLObject)ConsesLow.list(var35)) : ConsesLow.list(var33));
            f50308(var32, ConsesLow.append(var36, f50304(var32)));
            f50310(var32, (SubLObject)NIL);
        }
        else if (var7.eql((SubLObject)$ic47$)) {
            f50308(var32, (SubLObject)ConsesLow.cons(Functions.apply(Symbols.symbol_function((SubLObject)$ic50$), Sequences.nreverse(f50306(var32))), f50304(var32)));
            f50310(var32, (SubLObject)NIL);
        }
        else if (var7.eql((SubLObject)$ic48$)) {
            final SubLObject var37 = f50306(var32).first();
            f50308(var32, (SubLObject)ConsesLow.cons(var37, f50304(var32)));
            f50310(var32, (SubLObject)NIL);
        }
        else if (var7.eql((SubLObject)$ic49$)) {
            f50308(var32, (SubLObject)ConsesLow.cons(Functions.apply(Symbols.symbol_function((SubLObject)$ic50$), Sequences.nreverse(f50306(var32))), f50304(var32)));
            f50310(var32, (SubLObject)NIL);
        }
        return var32;
    }
    
    public static SubLObject f50324(SubLObject var9, SubLObject var10, SubLObject var45) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        if (var45 == UNPROVIDED) {
            var45 = (SubLObject)NIL;
        }
        final SubLThread var46 = SubLProcess.currentSubLThread();
        assert NIL != module0004.f106(var9) : var9;
        assert NIL != module0004.f106(var10) : var10;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var46) && !var10.numGE(var9)) {
            Errors.error((SubLObject)$ic52$, var10, var9);
        }
        final SubLObject var47 = Vectors.make_vector((SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
        Vectors.set_aref(var47, (SubLObject)ZERO_INTEGER, var9);
        Vectors.set_aref(var47, (SubLObject)ONE_INTEGER, var10);
        Vectors.set_aref(var47, (SubLObject)TWO_INTEGER, var45);
        return var47;
    }
    
    public static SubLObject f50325(final SubLObject var48) {
        return (SubLObject)makeBoolean(var48.isVector() && Sequences.length(var48).eql((SubLObject)THREE_INTEGER));
    }
    
    public static SubLObject f50326(final SubLObject var47) {
        assert NIL != f50325(var47) : var47;
        return Vectors.aref(var47, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f50327(final SubLObject var47) {
        assert NIL != f50325(var47) : var47;
        return Vectors.aref(var47, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f50328(final SubLObject var47) {
        assert NIL != f50325(var47) : var47;
        return Numbers.subtract(f50327(var47), f50326(var47));
    }
    
    public static SubLObject f50329(final SubLObject var47) {
        assert NIL != f50325(var47) : var47;
        return Vectors.aref(var47, (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f50330(final SubLObject var47, final SubLObject var45) {
        assert NIL != f50325(var47) : var47;
        Vectors.set_aref(var47, (SubLObject)TWO_INTEGER, var45);
        return var45;
    }
    
    public static SubLObject f50331(final SubLObject var48) {
        return (SubLObject)makeBoolean(var48.isCons() && var48.first().isString());
    }
    
    public static SubLObject f50332(SubLObject var1, SubLObject var45) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        if (var45 == UNPROVIDED) {
            var45 = (SubLObject)NIL;
        }
        return (SubLObject)ConsesLow.cons(var1, var45);
    }
    
    public static SubLObject f50333(final SubLObject var49) {
        return var49.first();
    }
    
    public static SubLObject f50334(final SubLObject var49) {
        return var49.rest();
    }
    
    public static SubLObject f50335(final SubLObject var49) {
        return f50332(f50333(var49), f50334(var49));
    }
    
    public static SubLObject f50336(final SubLObject var49, final SubLObject var1) {
        return ConsesLow.rplaca(var49, var1);
    }
    
    public static SubLObject f50337(final SubLObject var49, final SubLObject var45) {
        return ConsesLow.rplacd(var49, var45);
    }
    
    public static SubLObject f50338() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50293", "S#54857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50295", "S#54858", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50297", "S#50011", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50298", "S#50246", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50299", "S#54859", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50294", "S#50249", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50300", "S#54860", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50301", "S#54861", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50303", "S#54856", 1, 0, false);
        new $f50303$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50304", "S#54862", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50305", "S#54863", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50306", "S#54864", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50307", "S#54865", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50308", "S#54866", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50309", "S#54867", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50310", "S#54868", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50311", "S#54869", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50312", "S#54870", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50313", "S#54871", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50314", "S#54872", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50302", "S#54873", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50296", "S#54874", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50315", "S#54875", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50317", "S#54876", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50316", "S#54877", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50318", "S#54878", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50319", "S#54879", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50320", "S#54880", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50321", "S#54881", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50322", "S#54882", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50323", "S#54883", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50324", "S#49145", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50325", "S#54884", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50326", "S#49147", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50327", "S#49146", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50328", "S#50113", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50329", "INTERVAL-TOKEN-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50330", "S#54885", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50331", "S#49140", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50332", "S#48875", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50333", "S#48874", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50334", "STRING-TOKEN-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50335", "S#54886", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50336", "S#54887", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0782", "f50337", "S#50010", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50339() {
        $g6288$ = SubLFiles.deflexical("S#54888", (SubLObject)$ic1$);
        $g6289$ = SubLFiles.deflexical("S#54889", (SubLObject)$ic2$);
        $g6290$ = SubLFiles.deflexical("S#54890", module0038.f2818());
        $g6291$ = SubLFiles.defconstant("S#54891", (SubLObject)$ic9$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50340() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g6291$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic16$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic17$);
        Structures.def_csetf((SubLObject)$ic18$, (SubLObject)$ic19$);
        Structures.def_csetf((SubLObject)$ic20$, (SubLObject)$ic21$);
        Structures.def_csetf((SubLObject)$ic22$, (SubLObject)$ic23$);
        Structures.def_csetf((SubLObject)$ic24$, (SubLObject)$ic25$);
        Equality.identity((SubLObject)$ic9$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g6291$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic35$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f50338();
    }
    
    public void initializeVariables() {
        f50339();
    }
    
    public void runTopLevelForms() {
        f50340();
    }
    
    static {
        me = (SubLFile)new module0782();
        $g6288$ = null;
        $g6289$ = null;
        $g6290$ = null;
        $g6291$ = null;
        $ic0$ = makeSymbol("STRINGP");
        $ic1$ = ConsesLow.list(new SubLObject[] { Characters.CHAR_semicolon, Characters.CHAR_comma, Characters.CHAR_colon, Characters.CHAR_quotation, Characters.CHAR_quote, Characters.CHAR_exclamation, Characters.CHAR_question, Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_percent, Characters.CHAR_dollar, Characters.CHAR_hyphen, Characters.CHAR_caret, Characters.CHAR_asterisk });
        $ic2$ = ConsesLow.list((SubLObject)Characters.CHAR_period);
        $ic3$ = makeKeyword("GOBBLE-WS");
        $ic4$ = makeKeyword("WHITE-SPACE");
        $ic5$ = makeKeyword("IN-WORD");
        $ic6$ = makeKeyword("WORD-FINAL-PUNCTUATION");
        $ic7$ = makeKeyword("PUNCTUATION");
        $ic8$ = makeKeyword("GENERIC");
        $ic9$ = makeSymbol("S#54855", "CYC");
        $ic10$ = makeSymbol("S#54856", "CYC");
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("S#700", "CYC"), (SubLObject)makeSymbol("S#54892", "CYC"), (SubLObject)makeSymbol("S#7309", "CYC"), (SubLObject)makeSymbol("S#3266", "CYC"));
        $ic12$ = ConsesLow.list((SubLObject)makeKeyword("FOUND"), (SubLObject)makeKeyword("REMAINS"), (SubLObject)makeKeyword("ACCUMULATOR"), (SubLObject)makeKeyword("STATE"));
        $ic13$ = ConsesLow.list((SubLObject)makeSymbol("S#54862", "CYC"), (SubLObject)makeSymbol("S#54863", "CYC"), (SubLObject)makeSymbol("S#54864", "CYC"), (SubLObject)makeSymbol("S#54865", "CYC"));
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("S#54866", "CYC"), (SubLObject)makeSymbol("S#54867", "CYC"), (SubLObject)makeSymbol("S#54868", "CYC"), (SubLObject)makeSymbol("S#54869", "CYC"));
        $ic15$ = makeSymbol("S#54873", "CYC");
        $ic16$ = makeSymbol("S#54861", "CYC");
        $ic17$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#54856", "CYC"));
        $ic18$ = makeSymbol("S#54862", "CYC");
        $ic19$ = makeSymbol("S#54866", "CYC");
        $ic20$ = makeSymbol("S#54863", "CYC");
        $ic21$ = makeSymbol("S#54867", "CYC");
        $ic22$ = makeSymbol("S#54864", "CYC");
        $ic23$ = makeSymbol("S#54868", "CYC");
        $ic24$ = makeSymbol("S#54865", "CYC");
        $ic25$ = makeSymbol("S#54869", "CYC");
        $ic26$ = makeKeyword("FOUND");
        $ic27$ = makeKeyword("REMAINS");
        $ic28$ = makeKeyword("ACCUMULATOR");
        $ic29$ = makeKeyword("STATE");
        $ic30$ = makeString("Invalid slot ~S for construction function");
        $ic31$ = makeKeyword("BEGIN");
        $ic32$ = makeSymbol("S#54870", "CYC");
        $ic33$ = makeKeyword("SLOT");
        $ic34$ = makeKeyword("END");
        $ic35$ = makeSymbol("S#54872", "CYC");
        $ic36$ = makeString("#<AP:Found        ~S~%");
        $ic37$ = makeString("     Remains      ~S~%");
        $ic38$ = makeString("     Accumulator  ~S~%");
        $ic39$ = makeString("     State        ~S>~%");
        $ic40$ = makeString(".");
        $ic41$ = makeKeyword("DEFAULT");
        $ic42$ = makeKeyword("DOT");
        $ic43$ = makeKeyword("NUM");
        $ic44$ = makeKeyword("STRING");
        $ic45$ = makeKeyword("PUNCT");
        $ic46$ = makeKeyword("DOT-STRING-WANTED");
        $ic47$ = makeKeyword("STRING-WANTED");
        $ic48$ = makeKeyword("DOT-INTEGER-WANTED");
        $ic49$ = makeKeyword("INTEGER-WANTED");
        $ic50$ = makeSymbol("CCONCATENATE");
        $ic51$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic52$ = makeString("~a is not greater than or equal to ~a");
        $ic53$ = makeSymbol("S#54884", "CYC");
    }
    
    public static final class $sX54855_native extends SubLStructNative
    {
        public SubLObject $found;
        public SubLObject $remains;
        public SubLObject $accumulator;
        public SubLObject $state;
        public static final SubLStructDeclNative structDecl;
        
        public $sX54855_native() {
            this.$found = (SubLObject)CommonSymbols.NIL;
            this.$remains = (SubLObject)CommonSymbols.NIL;
            this.$accumulator = (SubLObject)CommonSymbols.NIL;
            this.$state = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$found;
        }
        
        public SubLObject getField3() {
            return this.$remains;
        }
        
        public SubLObject getField4() {
            return this.$accumulator;
        }
        
        public SubLObject getField5() {
            return this.$state;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$found = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$remains = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$accumulator = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$state = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX54855_native.class, $ic9$, $ic10$, $ic11$, $ic12$, new String[] { "$found", "$remains", "$accumulator", "$state" }, $ic13$, $ic14$, $ic15$);
        }
    }
    
    public static final class $f50303$UnaryFunction extends UnaryFunction
    {
        public $f50303$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#54856"));
        }
        
        public SubLObject processItem(final SubLObject var23) {
            return f50303(var23);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 156 ms
	
	Decompiled with Procyon 0.5.32.
*/