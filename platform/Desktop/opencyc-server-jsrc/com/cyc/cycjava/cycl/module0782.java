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
        assert module0782.NIL != Types.stringp(var1) : var1;
        return f50294(var1, (SubLObject)module0782.UNPROVIDED, (SubLObject)module0782.UNPROVIDED, (SubLObject)module0782.UNPROVIDED);
    }
    
    public static SubLObject f50295(final SubLObject var2) {
        return f50296(var2);
    }
    
    public static SubLObject f50297(final SubLObject var1) {
        final SubLObject var2 = f50293(var1);
        return f50295(var2);
    }
    
    public static SubLObject f50298() {
        return conses_high.copy_list(module0782.$g6288$.getGlobalValue());
    }
    
    public static SubLObject f50299() {
        return conses_high.copy_list(module0782.$g6290$.getGlobalValue());
    }
    
    public static SubLObject f50294(final SubLObject var3, SubLObject var4, SubLObject var5, SubLObject var6) {
        if (var4 == module0782.UNPROVIDED) {
            var4 = module0782.$g6290$.getGlobalValue();
        }
        if (var5 == module0782.UNPROVIDED) {
            var5 = module0782.$g6288$.getGlobalValue();
        }
        if (var6 == module0782.UNPROVIDED) {
            var6 = module0782.$g6289$.getGlobalValue();
        }
        SubLObject var7 = (SubLObject)module0782.$ic3$;
        SubLObject var8 = (SubLObject)module0782.NIL;
        SubLObject var9 = (SubLObject)module0782.NIL;
        SubLObject var10 = (SubLObject)module0782.NIL;
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        SubLObject var15;
        SubLObject var14;
        SubLObject var15_16;
        SubLObject var15_17;
        SubLObject var15_18;
        SubLObject var15_19;
        for (var11 = Sequences.length(var3), var12 = (SubLObject)module0782.NIL, var12 = (SubLObject)module0782.ZERO_INTEGER; var12.numL(var11); var12 = Numbers.add(var12, (SubLObject)module0782.ONE_INTEGER)) {
            var13 = Vectors.aref(var3, var12);
            var14 = (var15 = f50300(var13, var4, var5, var6));
            if (var15.eql((SubLObject)module0782.$ic4$)) {
                var15_16 = var7;
                if (var15_16.eql((SubLObject)module0782.$ic5$)) {
                    var10 = var12;
                    var8 = (SubLObject)ConsesLow.cons(Sequences.subseq(var3, var9, var10), var8);
                    var9 = (SubLObject)module0782.NIL;
                    var10 = (SubLObject)module0782.NIL;
                    var7 = (SubLObject)module0782.$ic3$;
                }
            }
            else if (var15.eql((SubLObject)module0782.$ic6$)) {
                var15_17 = var7;
                if (var15_17.eql((SubLObject)module0782.$ic5$)) {
                    var10 = var12;
                    var8 = (SubLObject)ConsesLow.cons(Sequences.subseq(var3, var9, var10), var8);
                    var9 = (SubLObject)module0782.NIL;
                    var10 = (SubLObject)module0782.NIL;
                    var8 = (SubLObject)ConsesLow.cons(Sequences.subseq(var3, var12, Numbers.add(var12, (SubLObject)module0782.ONE_INTEGER)), var8);
                    var7 = (SubLObject)module0782.$ic3$;
                }
                else if (var15_17.eql((SubLObject)module0782.$ic3$)) {
                    var9 = var12;
                    var7 = (SubLObject)module0782.$ic5$;
                }
            }
            else if (var15.eql((SubLObject)module0782.$ic7$)) {
                var15_18 = var7;
                if (var15_18.eql((SubLObject)module0782.$ic5$)) {
                    var10 = var12;
                    var8 = (SubLObject)ConsesLow.cons(Sequences.subseq(var3, var9, var10), var8);
                    var9 = (SubLObject)module0782.NIL;
                    var10 = (SubLObject)module0782.NIL;
                    var8 = (SubLObject)ConsesLow.cons(Sequences.subseq(var3, var12, Numbers.add(var12, (SubLObject)module0782.ONE_INTEGER)), var8);
                    var7 = (SubLObject)module0782.$ic3$;
                }
                else if (var15_18.eql((SubLObject)module0782.$ic3$)) {
                    var8 = (SubLObject)ConsesLow.cons(Sequences.subseq(var3, var12, Numbers.add(var12, (SubLObject)module0782.ONE_INTEGER)), var8);
                }
            }
            else if (var15.eql((SubLObject)module0782.$ic8$)) {
                var15_19 = var7;
                if (var15_19.eql((SubLObject)module0782.$ic3$)) {
                    var9 = var12;
                    var7 = (SubLObject)module0782.$ic5$;
                }
            }
        }
        final SubLObject var16 = var7;
        if (var16.eql((SubLObject)module0782.$ic5$)) {
            var8 = (SubLObject)ConsesLow.cons(Sequences.subseq(var3, var9, (SubLObject)module0782.UNPROVIDED), var8);
        }
        return Sequences.nreverse(var8);
    }
    
    public static SubLObject f50300(final SubLObject var20, final SubLObject var4, final SubLObject var5, final SubLObject var6) {
        if (module0782.NIL != module0004.f104(var20, var4, (SubLObject)module0782.UNPROVIDED, (SubLObject)module0782.UNPROVIDED)) {
            return (SubLObject)module0782.$ic4$;
        }
        if (module0782.NIL != module0004.f104(var20, var6, (SubLObject)module0782.UNPROVIDED, (SubLObject)module0782.UNPROVIDED)) {
            return (SubLObject)module0782.$ic6$;
        }
        if (module0782.NIL != module0004.f104(var20, var5, (SubLObject)module0782.UNPROVIDED, (SubLObject)module0782.UNPROVIDED)) {
            return (SubLObject)module0782.$ic7$;
        }
        return (SubLObject)module0782.$ic8$;
    }
    
    public static SubLObject f50301(final SubLObject var21, final SubLObject var22) {
        f50302(var21, var22, (SubLObject)module0782.ZERO_INTEGER);
        return (SubLObject)module0782.NIL;
    }
    
    public static SubLObject f50303(final SubLObject var21) {
        return (SubLObject)((var21.getClass() == $sX54855_native.class) ? module0782.T : module0782.NIL);
    }
    
    public static SubLObject f50304(final SubLObject var21) {
        assert module0782.NIL != f50303(var21) : var21;
        return var21.getField2();
    }
    
    public static SubLObject f50305(final SubLObject var21) {
        assert module0782.NIL != f50303(var21) : var21;
        return var21.getField3();
    }
    
    public static SubLObject f50306(final SubLObject var21) {
        assert module0782.NIL != f50303(var21) : var21;
        return var21.getField4();
    }
    
    public static SubLObject f50307(final SubLObject var21) {
        assert module0782.NIL != f50303(var21) : var21;
        return var21.getField5();
    }
    
    public static SubLObject f50308(final SubLObject var21, final SubLObject var24) {
        assert module0782.NIL != f50303(var21) : var21;
        return var21.setField2(var24);
    }
    
    public static SubLObject f50309(final SubLObject var21, final SubLObject var24) {
        assert module0782.NIL != f50303(var21) : var21;
        return var21.setField3(var24);
    }
    
    public static SubLObject f50310(final SubLObject var21, final SubLObject var24) {
        assert module0782.NIL != f50303(var21) : var21;
        return var21.setField4(var24);
    }
    
    public static SubLObject f50311(final SubLObject var21, final SubLObject var24) {
        assert module0782.NIL != f50303(var21) : var21;
        return var21.setField5(var24);
    }
    
    public static SubLObject f50312(SubLObject var25) {
        if (var25 == module0782.UNPROVIDED) {
            var25 = (SubLObject)module0782.NIL;
        }
        final SubLObject var26 = (SubLObject)new $sX54855_native();
        SubLObject var27;
        SubLObject var28;
        SubLObject var29;
        SubLObject var30;
        for (var27 = (SubLObject)module0782.NIL, var27 = var25; module0782.NIL != var27; var27 = conses_high.cddr(var27)) {
            var28 = var27.first();
            var29 = conses_high.cadr(var27);
            var30 = var28;
            if (var30.eql((SubLObject)module0782.$ic26$)) {
                f50308(var26, var29);
            }
            else if (var30.eql((SubLObject)module0782.$ic27$)) {
                f50309(var26, var29);
            }
            else if (var30.eql((SubLObject)module0782.$ic28$)) {
                f50310(var26, var29);
            }
            else if (var30.eql((SubLObject)module0782.$ic29$)) {
                f50311(var26, var29);
            }
            else {
                Errors.error((SubLObject)module0782.$ic30$, var28);
            }
        }
        return var26;
    }
    
    public static SubLObject f50313(final SubLObject var30, final SubLObject var31) {
        Functions.funcall(var31, var30, (SubLObject)module0782.$ic31$, (SubLObject)module0782.$ic32$, (SubLObject)module0782.FOUR_INTEGER);
        Functions.funcall(var31, var30, (SubLObject)module0782.$ic33$, (SubLObject)module0782.$ic26$, f50304(var30));
        Functions.funcall(var31, var30, (SubLObject)module0782.$ic33$, (SubLObject)module0782.$ic27$, f50305(var30));
        Functions.funcall(var31, var30, (SubLObject)module0782.$ic33$, (SubLObject)module0782.$ic28$, f50306(var30));
        Functions.funcall(var31, var30, (SubLObject)module0782.$ic33$, (SubLObject)module0782.$ic29$, f50307(var30));
        Functions.funcall(var31, var30, (SubLObject)module0782.$ic34$, (SubLObject)module0782.$ic32$, (SubLObject)module0782.FOUR_INTEGER);
        return var30;
    }
    
    public static SubLObject f50314(final SubLObject var30, final SubLObject var31) {
        return f50313(var30, var31);
    }
    
    public static SubLObject f50302(final SubLObject var32, final SubLObject var22, final SubLObject var33) {
        PrintLow.format(var22, (SubLObject)module0782.$ic36$, f50304(var32));
        PrintLow.format(var22, (SubLObject)module0782.$ic37$, f50305(var32));
        PrintLow.format(var22, (SubLObject)module0782.$ic38$, f50306(var32));
        PrintLow.format(var22, (SubLObject)module0782.$ic39$, f50307(var32));
        return var32;
    }
    
    public static SubLObject f50296(final SubLObject var34) {
        if (module0782.NIL == var34) {
            return (SubLObject)module0782.NIL;
        }
        final SubLObject var35 = conses_high.last(var34, (SubLObject)module0782.UNPROVIDED).first();
        if (module0782.$ic40$.equal(var35)) {
            final SubLObject var36 = conses_high.butlast(var34, (SubLObject)module0782.UNPROVIDED);
            final SubLObject var37 = f50315(var36);
            final SubLObject var38 = f50316(var37);
            return ConsesLow.append(var38, (SubLObject)ConsesLow.list((SubLObject)module0782.$ic40$));
        }
        final SubLObject var39 = f50315(var34);
        return f50316(var39);
    }
    
    public static SubLObject f50315(final SubLObject var34) {
        final SubLObject var35 = f50312((SubLObject)module0782.UNPROVIDED);
        f50308(var35, (SubLObject)module0782.NIL);
        f50309(var35, var34);
        f50310(var35, (SubLObject)module0782.NIL);
        f50311(var35, (SubLObject)module0782.$ic41$);
        return var35;
    }
    
    public static SubLObject f50317(final SubLObject var1) {
        if (var1.equal((SubLObject)module0782.$ic40$)) {
            return (SubLObject)module0782.$ic42$;
        }
        if (module0782.NIL != module0038.f2727(var1)) {
            return (SubLObject)module0782.$ic43$;
        }
        if (!module0782.ONE_INTEGER.numE(Sequences.length(var1))) {
            return (SubLObject)module0782.$ic44$;
        }
        if (module0782.NIL != Characters.alpha_char_p(Strings.sublisp_char(var1, (SubLObject)module0782.ZERO_INTEGER))) {
            return (SubLObject)module0782.$ic44$;
        }
        return (SubLObject)module0782.$ic45$;
    }
    
    public static SubLObject f50316(final SubLObject var32) {
        if (module0782.$ic41$ == f50307(var32) && module0782.NIL == f50305(var32)) {
            return Sequences.nreverse(f50304(var32));
        }
        final SubLObject var34;
        final SubLObject var33 = var34 = f50307(var32);
        if (var34.eql((SubLObject)module0782.$ic41$)) {
            f50318(var32);
        }
        else if (var34.eql((SubLObject)module0782.$ic46$)) {
            f50319(var32);
        }
        else if (var34.eql((SubLObject)module0782.$ic47$)) {
            f50320(var32);
        }
        else if (var34.eql((SubLObject)module0782.$ic48$)) {
            f50321(var32);
        }
        else if (var34.eql((SubLObject)module0782.$ic49$)) {
            f50322(var32);
        }
        return f50316(var32);
    }
    
    public static SubLObject f50318(final SubLObject var32) {
        final SubLObject var33 = f50305(var32).first();
        final SubLObject var34 = f50317(var33);
        f50309(var32, f50305(var32).rest());
        final SubLObject var35 = var34;
        if (var35.eql((SubLObject)module0782.$ic42$)) {
            f50308(var32, (SubLObject)ConsesLow.cons(var33, f50304(var32)));
        }
        else if (var35.eql((SubLObject)module0782.$ic45$)) {
            f50308(var32, (SubLObject)ConsesLow.cons(var33, f50304(var32)));
        }
        else if (var35.eql((SubLObject)module0782.$ic43$)) {
            f50310(var32, (SubLObject)ConsesLow.cons(var33, f50306(var32)));
            f50311(var32, (SubLObject)module0782.$ic48$);
        }
        else if (var35.eql((SubLObject)module0782.$ic44$)) {
            f50310(var32, (SubLObject)ConsesLow.cons(var33, f50306(var32)));
            f50311(var32, (SubLObject)module0782.$ic46$);
        }
        return var32;
    }
    
    public static SubLObject f50319(final SubLObject var32) {
        final SubLObject var33 = f50305(var32).first();
        if (module0782.NIL != var33) {
            final SubLObject var34 = f50317(var33);
            f50309(var32, f50305(var32).rest());
            final SubLObject var35 = var34;
            if (var35.eql((SubLObject)module0782.$ic42$)) {
                f50310(var32, (SubLObject)ConsesLow.cons(var33, f50306(var32)));
                f50311(var32, (SubLObject)module0782.$ic47$);
            }
            else if (var35.eql((SubLObject)module0782.$ic45$)) {
                f50323(var32, (SubLObject)module0782.$ic46$);
                f50308(var32, (SubLObject)ConsesLow.cons(var33, f50304(var32)));
                f50311(var32, (SubLObject)module0782.$ic41$);
            }
            else if (var35.eql((SubLObject)module0782.$ic43$)) {
                f50323(var32, (SubLObject)module0782.$ic46$);
                f50310(var32, (SubLObject)ConsesLow.cons(var33, f50306(var32)));
                f50311(var32, (SubLObject)module0782.$ic48$);
            }
            else if (var35.eql((SubLObject)module0782.$ic44$)) {
                f50323(var32, (SubLObject)module0782.$ic46$);
                f50310(var32, (SubLObject)ConsesLow.cons(var33, f50306(var32)));
                f50311(var32, (SubLObject)module0782.$ic46$);
            }
        }
        else {
            f50323(var32, (SubLObject)module0782.$ic46$);
            f50311(var32, (SubLObject)module0782.$ic41$);
        }
        return var32;
    }
    
    public static SubLObject f50320(final SubLObject var32) {
        final SubLObject var33 = f50305(var32).first();
        if (module0782.NIL != var33) {
            final SubLObject var34 = f50317(var33);
            f50309(var32, f50305(var32).rest());
            final SubLObject var35 = var34;
            if (var35.eql((SubLObject)module0782.$ic42$)) {
                f50323(var32, (SubLObject)module0782.$ic47$);
                f50308(var32, (SubLObject)ConsesLow.cons(var33, f50304(var32)));
                f50311(var32, (SubLObject)module0782.$ic41$);
            }
            else if (var35.eql((SubLObject)module0782.$ic45$)) {
                f50323(var32, (SubLObject)module0782.$ic47$);
                f50308(var32, (SubLObject)ConsesLow.cons(var33, f50304(var32)));
                f50311(var32, (SubLObject)module0782.$ic41$);
            }
            else if (var35.eql((SubLObject)module0782.$ic43$)) {
                f50323(var32, (SubLObject)module0782.$ic47$);
                f50310(var32, (SubLObject)ConsesLow.cons(var33, f50306(var32)));
                f50311(var32, (SubLObject)module0782.$ic48$);
            }
            else if (var35.eql((SubLObject)module0782.$ic44$)) {
                f50310(var32, (SubLObject)ConsesLow.cons(var33, f50306(var32)));
                f50311(var32, (SubLObject)module0782.$ic46$);
            }
        }
        else {
            f50323(var32, (SubLObject)module0782.$ic47$);
            f50311(var32, (SubLObject)module0782.$ic41$);
        }
        return var32;
    }
    
    public static SubLObject f50321(final SubLObject var32) {
        final SubLObject var33 = f50305(var32).first();
        if (module0782.NIL != var33) {
            final SubLObject var34 = f50317(var33);
            f50309(var32, f50305(var32).rest());
            final SubLObject var35 = var34;
            if (var35.eql((SubLObject)module0782.$ic42$)) {
                f50310(var32, (SubLObject)ConsesLow.cons(var33, f50306(var32)));
                f50311(var32, (SubLObject)module0782.$ic49$);
            }
            else if (var35.eql((SubLObject)module0782.$ic45$)) {
                f50323(var32, (SubLObject)module0782.$ic48$);
                f50308(var32, (SubLObject)ConsesLow.cons(var33, f50304(var32)));
                f50311(var32, (SubLObject)module0782.$ic41$);
            }
            else if (var35.eql((SubLObject)module0782.$ic43$)) {
                f50323(var32, (SubLObject)module0782.$ic48$);
                f50310(var32, (SubLObject)ConsesLow.cons(var33, f50306(var32)));
                f50311(var32, (SubLObject)module0782.$ic48$);
            }
            else if (var35.eql((SubLObject)module0782.$ic44$)) {
                f50323(var32, (SubLObject)module0782.$ic48$);
                f50310(var32, (SubLObject)ConsesLow.cons(var33, f50306(var32)));
                f50311(var32, (SubLObject)module0782.$ic46$);
            }
        }
        else {
            f50323(var32, (SubLObject)module0782.$ic48$);
            f50311(var32, (SubLObject)module0782.$ic41$);
        }
        return var32;
    }
    
    public static SubLObject f50322(final SubLObject var32) {
        final SubLObject var33 = f50305(var32).first();
        if (module0782.NIL != var33) {
            final SubLObject var34 = f50317(var33);
            f50309(var32, f50305(var32).rest());
            final SubLObject var35 = var34;
            if (var35.eql((SubLObject)module0782.$ic42$)) {
                f50323(var32, (SubLObject)module0782.$ic49$);
                f50308(var32, (SubLObject)ConsesLow.cons(var33, f50304(var32)));
                f50311(var32, (SubLObject)module0782.$ic41$);
            }
            else if (var35.eql((SubLObject)module0782.$ic45$)) {
                f50323(var32, (SubLObject)module0782.$ic49$);
                f50308(var32, (SubLObject)ConsesLow.cons(var33, f50304(var32)));
                f50311(var32, (SubLObject)module0782.$ic41$);
            }
            else if (var35.eql((SubLObject)module0782.$ic43$)) {
                final SubLObject var36 = (SubLObject)ConsesLow.cons(var33, f50306(var32));
                final SubLObject var37 = Functions.apply(Symbols.symbol_function((SubLObject)module0782.$ic50$), Sequences.nreverse(var36));
                f50308(var32, (SubLObject)ConsesLow.cons(var37, f50304(var32)));
                f50310(var32, (SubLObject)module0782.NIL);
                f50311(var32, (SubLObject)module0782.$ic41$);
            }
            else if (var35.eql((SubLObject)module0782.$ic44$)) {
                f50323(var32, (SubLObject)module0782.$ic49$);
                f50310(var32, (SubLObject)ConsesLow.cons(var33, f50306(var32)));
                f50311(var32, (SubLObject)module0782.$ic46$);
            }
        }
        else {
            f50323(var32, (SubLObject)module0782.$ic49$);
            f50311(var32, (SubLObject)module0782.$ic41$);
        }
        return var32;
    }
    
    public static SubLObject f50323(final SubLObject var32, final SubLObject var7) {
        if (var7.eql((SubLObject)module0782.$ic46$)) {
            final SubLObject var33 = f50306(var32).first();
            final SubLObject var34 = f50306(var32).rest();
            final SubLObject var35 = (SubLObject)((module0782.NIL != var34) ? Functions.apply(Symbols.symbol_function((SubLObject)module0782.$ic50$), Sequences.nreverse(var34)) : module0782.NIL);
            final SubLObject var36 = (SubLObject)((module0782.NIL != var35) ? ConsesLow.cons(var33, (SubLObject)ConsesLow.list(var35)) : ConsesLow.list(var33));
            f50308(var32, ConsesLow.append(var36, f50304(var32)));
            f50310(var32, (SubLObject)module0782.NIL);
        }
        else if (var7.eql((SubLObject)module0782.$ic47$)) {
            f50308(var32, (SubLObject)ConsesLow.cons(Functions.apply(Symbols.symbol_function((SubLObject)module0782.$ic50$), Sequences.nreverse(f50306(var32))), f50304(var32)));
            f50310(var32, (SubLObject)module0782.NIL);
        }
        else if (var7.eql((SubLObject)module0782.$ic48$)) {
            final SubLObject var37 = f50306(var32).first();
            f50308(var32, (SubLObject)ConsesLow.cons(var37, f50304(var32)));
            f50310(var32, (SubLObject)module0782.NIL);
        }
        else if (var7.eql((SubLObject)module0782.$ic49$)) {
            f50308(var32, (SubLObject)ConsesLow.cons(Functions.apply(Symbols.symbol_function((SubLObject)module0782.$ic50$), Sequences.nreverse(f50306(var32))), f50304(var32)));
            f50310(var32, (SubLObject)module0782.NIL);
        }
        return var32;
    }
    
    public static SubLObject f50324(SubLObject var9, SubLObject var10, SubLObject var45) {
        if (var9 == module0782.UNPROVIDED) {
            var9 = (SubLObject)module0782.NIL;
        }
        if (var10 == module0782.UNPROVIDED) {
            var10 = (SubLObject)module0782.NIL;
        }
        if (var45 == module0782.UNPROVIDED) {
            var45 = (SubLObject)module0782.NIL;
        }
        final SubLThread var46 = SubLProcess.currentSubLThread();
        assert module0782.NIL != module0004.f106(var9) : var9;
        assert module0782.NIL != module0004.f106(var10) : var10;
        if (module0782.NIL == Errors.$ignore_mustsP$.getDynamicValue(var46) && !var10.numGE(var9)) {
            Errors.error((SubLObject)module0782.$ic52$, var10, var9);
        }
        final SubLObject var47 = Vectors.make_vector((SubLObject)module0782.THREE_INTEGER, (SubLObject)module0782.UNPROVIDED);
        Vectors.set_aref(var47, (SubLObject)module0782.ZERO_INTEGER, var9);
        Vectors.set_aref(var47, (SubLObject)module0782.ONE_INTEGER, var10);
        Vectors.set_aref(var47, (SubLObject)module0782.TWO_INTEGER, var45);
        return var47;
    }
    
    public static SubLObject f50325(final SubLObject var48) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var48.isVector() && Sequences.length(var48).eql((SubLObject)module0782.THREE_INTEGER));
    }
    
    public static SubLObject f50326(final SubLObject var47) {
        assert module0782.NIL != f50325(var47) : var47;
        return Vectors.aref(var47, (SubLObject)module0782.ZERO_INTEGER);
    }
    
    public static SubLObject f50327(final SubLObject var47) {
        assert module0782.NIL != f50325(var47) : var47;
        return Vectors.aref(var47, (SubLObject)module0782.ONE_INTEGER);
    }
    
    public static SubLObject f50328(final SubLObject var47) {
        assert module0782.NIL != f50325(var47) : var47;
        return Numbers.subtract(f50327(var47), f50326(var47));
    }
    
    public static SubLObject f50329(final SubLObject var47) {
        assert module0782.NIL != f50325(var47) : var47;
        return Vectors.aref(var47, (SubLObject)module0782.TWO_INTEGER);
    }
    
    public static SubLObject f50330(final SubLObject var47, final SubLObject var45) {
        assert module0782.NIL != f50325(var47) : var47;
        Vectors.set_aref(var47, (SubLObject)module0782.TWO_INTEGER, var45);
        return var45;
    }
    
    public static SubLObject f50331(final SubLObject var48) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var48.isCons() && var48.first().isString());
    }
    
    public static SubLObject f50332(SubLObject var1, SubLObject var45) {
        if (var1 == module0782.UNPROVIDED) {
            var1 = (SubLObject)module0782.NIL;
        }
        if (var45 == module0782.UNPROVIDED) {
            var45 = (SubLObject)module0782.NIL;
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
        return (SubLObject)module0782.NIL;
    }
    
    public static SubLObject f50339() {
        module0782.$g6288$ = SubLFiles.deflexical("S#54888", (SubLObject)module0782.$ic1$);
        module0782.$g6289$ = SubLFiles.deflexical("S#54889", (SubLObject)module0782.$ic2$);
        module0782.$g6290$ = SubLFiles.deflexical("S#54890", module0038.f2818());
        module0782.$g6291$ = SubLFiles.defconstant("S#54891", (SubLObject)module0782.$ic9$);
        return (SubLObject)module0782.NIL;
    }
    
    public static SubLObject f50340() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0782.$g6291$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0782.$ic16$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0782.$ic17$);
        Structures.def_csetf((SubLObject)module0782.$ic18$, (SubLObject)module0782.$ic19$);
        Structures.def_csetf((SubLObject)module0782.$ic20$, (SubLObject)module0782.$ic21$);
        Structures.def_csetf((SubLObject)module0782.$ic22$, (SubLObject)module0782.$ic23$);
        Structures.def_csetf((SubLObject)module0782.$ic24$, (SubLObject)module0782.$ic25$);
        Equality.identity((SubLObject)module0782.$ic9$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0782.$g6291$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0782.$ic35$));
        return (SubLObject)module0782.NIL;
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
        module0782.$g6288$ = null;
        module0782.$g6289$ = null;
        module0782.$g6290$ = null;
        module0782.$g6291$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic1$ = ConsesLow.list(new SubLObject[] { Characters.CHAR_semicolon, Characters.CHAR_comma, Characters.CHAR_colon, Characters.CHAR_quotation, Characters.CHAR_quote, Characters.CHAR_exclamation, Characters.CHAR_question, Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_percent, Characters.CHAR_dollar, Characters.CHAR_hyphen, Characters.CHAR_caret, Characters.CHAR_asterisk });
        $ic2$ = ConsesLow.list((SubLObject)Characters.CHAR_period);
        $ic3$ = SubLObjectFactory.makeKeyword("GOBBLE-WS");
        $ic4$ = SubLObjectFactory.makeKeyword("WHITE-SPACE");
        $ic5$ = SubLObjectFactory.makeKeyword("IN-WORD");
        $ic6$ = SubLObjectFactory.makeKeyword("WORD-FINAL-PUNCTUATION");
        $ic7$ = SubLObjectFactory.makeKeyword("PUNCTUATION");
        $ic8$ = SubLObjectFactory.makeKeyword("GENERIC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#54855", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#54856", "CYC");
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#700", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54892", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7309", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3266", "CYC"));
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FOUND"), (SubLObject)SubLObjectFactory.makeKeyword("REMAINS"), (SubLObject)SubLObjectFactory.makeKeyword("ACCUMULATOR"), (SubLObject)SubLObjectFactory.makeKeyword("STATE"));
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54862", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54863", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54864", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54865", "CYC"));
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54866", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54867", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54868", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54869", "CYC"));
        $ic15$ = SubLObjectFactory.makeSymbol("S#54873", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#54861", "CYC");
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#54856", "CYC"));
        $ic18$ = SubLObjectFactory.makeSymbol("S#54862", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#54866", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#54863", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#54867", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#54864", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#54868", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#54865", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#54869", "CYC");
        $ic26$ = SubLObjectFactory.makeKeyword("FOUND");
        $ic27$ = SubLObjectFactory.makeKeyword("REMAINS");
        $ic28$ = SubLObjectFactory.makeKeyword("ACCUMULATOR");
        $ic29$ = SubLObjectFactory.makeKeyword("STATE");
        $ic30$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic31$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic32$ = SubLObjectFactory.makeSymbol("S#54870", "CYC");
        $ic33$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic34$ = SubLObjectFactory.makeKeyword("END");
        $ic35$ = SubLObjectFactory.makeSymbol("S#54872", "CYC");
        $ic36$ = SubLObjectFactory.makeString("#<AP:Found        ~S~%");
        $ic37$ = SubLObjectFactory.makeString("     Remains      ~S~%");
        $ic38$ = SubLObjectFactory.makeString("     Accumulator  ~S~%");
        $ic39$ = SubLObjectFactory.makeString("     State        ~S>~%");
        $ic40$ = SubLObjectFactory.makeString(".");
        $ic41$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic42$ = SubLObjectFactory.makeKeyword("DOT");
        $ic43$ = SubLObjectFactory.makeKeyword("NUM");
        $ic44$ = SubLObjectFactory.makeKeyword("STRING");
        $ic45$ = SubLObjectFactory.makeKeyword("PUNCT");
        $ic46$ = SubLObjectFactory.makeKeyword("DOT-STRING-WANTED");
        $ic47$ = SubLObjectFactory.makeKeyword("STRING-WANTED");
        $ic48$ = SubLObjectFactory.makeKeyword("DOT-INTEGER-WANTED");
        $ic49$ = SubLObjectFactory.makeKeyword("INTEGER-WANTED");
        $ic50$ = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $ic51$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic52$ = SubLObjectFactory.makeString("~a is not greater than or equal to ~a");
        $ic53$ = SubLObjectFactory.makeSymbol("S#54884", "CYC");
    }
    
    public static final class $sX54855_native extends SubLStructNative
    {
        public SubLObject $found;
        public SubLObject $remains;
        public SubLObject $accumulator;
        public SubLObject $state;
        private static final SubLStructDeclNative structDecl;
        
        public $sX54855_native() {
            this.$found = (SubLObject)CommonSymbols.NIL;
            this.$remains = (SubLObject)CommonSymbols.NIL;
            this.$accumulator = (SubLObject)CommonSymbols.NIL;
            this.$state = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX54855_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$sX54855_native.class, module0782.$ic9$, module0782.$ic10$, module0782.$ic11$, module0782.$ic12$, new String[] { "$found", "$remains", "$accumulator", "$state" }, module0782.$ic13$, module0782.$ic14$, module0782.$ic15$);
        }
    }
    
    public static final class $f50303$UnaryFunction extends UnaryFunction
    {
        public $f50303$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#54856"));
        }
        
        public SubLObject processItem(final SubLObject var23) {
            return module0782.f50303(var23);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0782.class
	Total time: 156 ms
	
	Decompiled with Procyon 0.5.32.
*/