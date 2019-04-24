package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0117 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0117";
    public static final String myFingerPrint = "0e5df71e8b9e82aab9b5bb34d0fcb45e3e196ccf204271b150b32056199e96c8";
    public static SubLSymbol $g1457$;
    public static SubLSymbol $g1458$;
    public static SubLSymbol $g1459$;
    public static SubLSymbol $g1460$;
    public static SubLSymbol $g1461$;
    public static SubLSymbol $g1462$;
    private static SubLSymbol $g1463$;
    private static SubLSymbol $g1464$;
    private static SubLSymbol $g1465$;
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
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
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
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLList $ic42$;
    private static final SubLList $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
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
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLList $ic75$;
    private static final SubLList $ic76$;
    private static final SubLList $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLList $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLList $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLList $ic110$;
    private static final SubLList $ic111$;
    private static final SubLList $ic112$;
    private static final SubLList $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLList $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLString $ic131$;
    private static final SubLString $ic132$;
    private static final SubLString $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLList $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLList $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLString $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLString $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLString $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLString $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLString $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLString $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLString $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLString $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    
    public static SubLObject f8068(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)module0117.ZERO_INTEGER);
        return (SubLObject)module0117.NIL;
    }
    
    public static SubLObject f8069(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX10135_native.class) ? module0117.T : module0117.NIL);
    }
    
    public static SubLObject f8070(final SubLObject var1) {
        assert module0117.NIL != f8069(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f8071(final SubLObject var1, final SubLObject var4) {
        assert module0117.NIL != f8069(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f8072(SubLObject var5) {
        if (var5 == module0117.UNPROVIDED) {
            var5 = (SubLObject)module0117.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX10135_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0117.NIL, var7 = var5; module0117.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0117.$ic11$)) {
                f8071(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0117.$ic12$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f8073(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic13$, (SubLObject)module0117.$ic14$, (SubLObject)module0117.ONE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic15$, (SubLObject)module0117.$ic11$, f8070(var11));
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic16$, (SubLObject)module0117.$ic14$, (SubLObject)module0117.ONE_INTEGER);
        return var11;
    }
    
    public static SubLObject f8074(final SubLObject var11, final SubLObject var12) {
        return f8073(var11, var12);
    }
    
    public static SubLObject f8075(final SubLObject var13, SubLObject var2) {
        if (var2 == module0117.UNPROVIDED) {
            var2 = (SubLObject)module0117.T;
        }
        PrintLow.format(var2, (SubLObject)module0117.$ic18$, f8070(var13));
        return var13;
    }
    
    public static SubLObject f8076(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)module0117.ZERO_INTEGER);
        return (SubLObject)module0117.NIL;
    }
    
    public static SubLObject f8077(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX10137_native.class) ? module0117.T : module0117.NIL);
    }
    
    public static SubLObject f8078(final SubLObject var1) {
        assert module0117.NIL != f8077(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f8079(final SubLObject var1) {
        assert module0117.NIL != f8077(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f8080(final SubLObject var1) {
        assert module0117.NIL != f8077(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f8081(final SubLObject var1, final SubLObject var4) {
        assert module0117.NIL != f8077(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f8082(final SubLObject var1, final SubLObject var4) {
        assert module0117.NIL != f8077(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f8083(final SubLObject var1, final SubLObject var4) {
        assert module0117.NIL != f8077(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f8084(SubLObject var5) {
        if (var5 == module0117.UNPROVIDED) {
            var5 = (SubLObject)module0117.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX10137_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0117.NIL, var7 = var5; module0117.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0117.$ic33$)) {
                f8081(var6, var9);
            }
            else if (var10.eql((SubLObject)module0117.$ic34$)) {
                f8082(var6, var9);
            }
            else if (var10.eql((SubLObject)module0117.$ic35$)) {
                f8083(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0117.$ic12$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f8085(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic13$, (SubLObject)module0117.$ic36$, (SubLObject)module0117.THREE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic15$, (SubLObject)module0117.$ic33$, f8078(var11));
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic15$, (SubLObject)module0117.$ic34$, f8079(var11));
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic15$, (SubLObject)module0117.$ic35$, f8080(var11));
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic16$, (SubLObject)module0117.$ic36$, (SubLObject)module0117.THREE_INTEGER);
        return var11;
    }
    
    public static SubLObject f8086(final SubLObject var11, final SubLObject var12) {
        return f8085(var11, var12);
    }
    
    public static SubLObject f8087(final SubLObject var17, final SubLObject var18, SubLObject var19) {
        if (var19 == module0117.UNPROVIDED) {
            var19 = (SubLObject)module0117.NIL;
        }
        final SubLObject var20 = f8084((SubLObject)module0117.UNPROVIDED);
        f8081(var20, var17);
        f8082(var20, var18);
        if (module0117.NIL != var19) {
            f8083(var20, var19);
        }
        return var20;
    }
    
    public static SubLObject f8088(final SubLObject var20, SubLObject var2) {
        if (var2 == module0117.UNPROVIDED) {
            var2 = (SubLObject)module0117.T;
        }
        PrintLow.format(var2, (SubLObject)module0117.$ic38$, new SubLObject[] { f8078(var20), f8079(var20), f8080(var20) });
        return var20;
    }
    
    public static SubLObject f8089(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)module0117.ZERO_INTEGER);
        return (SubLObject)module0117.NIL;
    }
    
    public static SubLObject f8090(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX10139_native.class) ? module0117.T : module0117.NIL);
    }
    
    public static SubLObject f8091(final SubLObject var1) {
        assert module0117.NIL != f8090(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f8092(final SubLObject var1) {
        assert module0117.NIL != f8090(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f8093(final SubLObject var1) {
        assert module0117.NIL != f8090(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f8094(final SubLObject var1) {
        assert module0117.NIL != f8090(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f8095(final SubLObject var1) {
        assert module0117.NIL != f8090(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f8096(final SubLObject var1, final SubLObject var4) {
        assert module0117.NIL != f8090(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f8097(final SubLObject var1, final SubLObject var4) {
        assert module0117.NIL != f8090(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f8098(final SubLObject var1, final SubLObject var4) {
        assert module0117.NIL != f8090(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f8099(final SubLObject var1, final SubLObject var4) {
        assert module0117.NIL != f8090(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f8100(final SubLObject var1, final SubLObject var4) {
        assert module0117.NIL != f8090(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f8101(SubLObject var5) {
        if (var5 == module0117.UNPROVIDED) {
            var5 = (SubLObject)module0117.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX10139_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0117.NIL, var7 = var5; module0117.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0117.$ic57$)) {
                f8096(var6, var9);
            }
            else if (var10.eql((SubLObject)module0117.$ic58$)) {
                f8097(var6, var9);
            }
            else if (var10.eql((SubLObject)module0117.$ic59$)) {
                f8098(var6, var9);
            }
            else if (var10.eql((SubLObject)module0117.$ic60$)) {
                f8099(var6, var9);
            }
            else if (var10.eql((SubLObject)module0117.$ic61$)) {
                f8100(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0117.$ic12$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f8102(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic13$, (SubLObject)module0117.$ic62$, (SubLObject)module0117.FIVE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic15$, (SubLObject)module0117.$ic57$, f8091(var11));
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic15$, (SubLObject)module0117.$ic58$, f8092(var11));
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic15$, (SubLObject)module0117.$ic59$, f8093(var11));
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic15$, (SubLObject)module0117.$ic60$, f8094(var11));
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic15$, (SubLObject)module0117.$ic61$, f8095(var11));
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic16$, (SubLObject)module0117.$ic62$, (SubLObject)module0117.FIVE_INTEGER);
        return var11;
    }
    
    public static SubLObject f8103(final SubLObject var11, final SubLObject var12) {
        return f8102(var11, var12);
    }
    
    public static SubLObject f8104(final SubLObject var24, final SubLObject var25, SubLObject var26, SubLObject var27) {
        if (var26 == module0117.UNPROVIDED) {
            var26 = (SubLObject)module0117.NIL;
        }
        if (var27 == module0117.UNPROVIDED) {
            var27 = (SubLObject)module0117.$ic64$;
        }
        final SubLObject var28 = f8101((SubLObject)module0117.UNPROVIDED);
        final SubLObject var29 = f8072((SubLObject)module0117.UNPROVIDED);
        f8071(var29, var25);
        f8096(var28, var24);
        f8097(var28, (SubLObject)module0117.$ic65$);
        f8098(var28, var29);
        f8099(var28, var26);
        f8100(var28, var27);
        return var28;
    }
    
    public static SubLObject f8105(final SubLObject var24, final SubLObject var17, final SubLObject var18, SubLObject var26, SubLObject var27) {
        if (var26 == module0117.UNPROVIDED) {
            var26 = (SubLObject)module0117.NIL;
        }
        if (var27 == module0117.UNPROVIDED) {
            var27 = (SubLObject)module0117.$ic64$;
        }
        final SubLObject var28 = f8101((SubLObject)module0117.UNPROVIDED);
        final SubLObject var29 = f8084((SubLObject)module0117.UNPROVIDED);
        f8081(var29, var17);
        f8082(var29, var18);
        f8083(var29, (SubLObject)module0117.$ic66$);
        f8096(var28, var24);
        f8097(var28, (SubLObject)module0117.$ic67$);
        f8098(var28, var29);
        f8099(var28, var26);
        f8100(var28, var27);
        return var28;
    }
    
    public static SubLObject f8106(final SubLObject var30, SubLObject var2) {
        if (var2 == module0117.UNPROVIDED) {
            var2 = (SubLObject)module0117.T;
        }
        final SubLObject var31 = f8091(var30);
        final SubLObject var32 = f8092(var30);
        final SubLObject var33 = f8093(var30);
        final SubLObject var34 = f8095(var30);
        PrintLow.format(var2, (SubLObject)module0117.$ic68$, var31);
        final SubLObject var35 = var32;
        if (var35.eql((SubLObject)module0117.$ic67$)) {
            f8088(var33, var2);
        }
        else if (var35.eql((SubLObject)module0117.$ic65$)) {
            f8075(var33, var2);
        }
        else {
            PrintLow.format(var2, (SubLObject)module0117.$ic69$, var32);
        }
        PrintLow.format(var2, (SubLObject)module0117.$ic70$, f8094(var30));
        if (var34 != module0117.$ic64$) {
            PrintLow.format(var2, (SubLObject)module0117.$ic71$, var34);
        }
        streams_high.terpri(var2);
        return var30;
    }
    
    public static SubLObject f8107(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)module0117.ZERO_INTEGER);
        return (SubLObject)module0117.NIL;
    }
    
    public static SubLObject f8108(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX10141_native.class) ? module0117.T : module0117.NIL);
    }
    
    public static SubLObject f8109(final SubLObject var1) {
        assert module0117.NIL != f8108(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f8110(final SubLObject var1) {
        assert module0117.NIL != f8108(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f8111(final SubLObject var1) {
        assert module0117.NIL != f8108(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f8112(final SubLObject var1) {
        assert module0117.NIL != f8108(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f8113(final SubLObject var1) {
        assert module0117.NIL != f8108(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f8114(final SubLObject var1, final SubLObject var4) {
        assert module0117.NIL != f8108(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f8115(final SubLObject var1, final SubLObject var4) {
        assert module0117.NIL != f8108(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f8116(final SubLObject var1, final SubLObject var4) {
        assert module0117.NIL != f8108(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f8117(final SubLObject var1, final SubLObject var4) {
        assert module0117.NIL != f8108(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f8118(final SubLObject var1, final SubLObject var4) {
        assert module0117.NIL != f8108(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f8119(SubLObject var5) {
        if (var5 == module0117.UNPROVIDED) {
            var5 = (SubLObject)module0117.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX10141_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0117.NIL, var7 = var5; module0117.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0117.$ic90$)) {
                f8114(var6, var9);
            }
            else if (var10.eql((SubLObject)module0117.$ic91$)) {
                f8115(var6, var9);
            }
            else if (var10.eql((SubLObject)module0117.$ic92$)) {
                f8116(var6, var9);
            }
            else if (var10.eql((SubLObject)module0117.$ic93$)) {
                f8117(var6, var9);
            }
            else if (var10.eql((SubLObject)module0117.$ic94$)) {
                f8118(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0117.$ic12$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f8120(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic13$, (SubLObject)module0117.$ic95$, (SubLObject)module0117.FIVE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic15$, (SubLObject)module0117.$ic90$, f8109(var11));
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic15$, (SubLObject)module0117.$ic91$, f8110(var11));
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic15$, (SubLObject)module0117.$ic92$, f8111(var11));
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic15$, (SubLObject)module0117.$ic93$, f8112(var11));
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic15$, (SubLObject)module0117.$ic94$, f8113(var11));
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic16$, (SubLObject)module0117.$ic95$, (SubLObject)module0117.FIVE_INTEGER);
        return var11;
    }
    
    public static SubLObject f8121(final SubLObject var11, final SubLObject var12) {
        return f8120(var11, var12);
    }
    
    public static SubLObject f8122(final SubLObject var35, final SubLObject var36) {
        SubLObject var38;
        final SubLObject var37 = var38 = var35.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var38, var37, (SubLObject)module0117.$ic97$);
        final SubLObject var39 = var38.rest();
        var38 = var38.first();
        SubLObject var40 = (SubLObject)module0117.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var38, var37, (SubLObject)module0117.$ic97$);
        var40 = var38.first();
        var38 = var38.rest();
        if (module0117.NIL == var38) {
            final SubLObject var41;
            var38 = (var41 = var39);
            return (SubLObject)ConsesLow.listS((SubLObject)module0117.$ic98$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0117.$ic84$, var40)), ConsesLow.append(var41, (SubLObject)module0117.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var37, (SubLObject)module0117.$ic97$);
        return (SubLObject)module0117.NIL;
    }
    
    public static SubLObject f8123(final SubLObject var28, final SubLObject var42) {
        final SubLObject var43 = f8111(var42);
        SubLObject var44 = (SubLObject)module0117.NIL;
        try {
            var44 = Locks.seize_lock(var43);
            final SubLObject var45 = f8091(var28);
            final SubLObject var46 = f8110(var42);
            module0084.f5765(var46, var45, var28, Symbols.symbol_function((SubLObject)module0117.EQUALP), (SubLObject)module0117.UNPROVIDED);
        }
        finally {
            if (module0117.NIL != var44) {
                Locks.release_lock(var43);
            }
        }
        return var42;
    }
    
    public static SubLObject f8124(final SubLObject var28, final SubLObject var42) {
        final SubLObject var43 = f8111(var42);
        SubLObject var44 = (SubLObject)module0117.NIL;
        try {
            var44 = Locks.seize_lock(var43);
            final SubLObject var45 = f8091(var28);
            final SubLObject var46 = f8110(var42);
            module0084.f5771(var46, var45, var28, Symbols.symbol_function((SubLObject)module0117.EQUALP), (SubLObject)module0117.UNPROVIDED);
        }
        finally {
            if (module0117.NIL != var44) {
                Locks.release_lock(var43);
            }
        }
        return var42;
    }
    
    public static SubLObject f8125(final SubLObject var35, final SubLObject var36) {
        SubLObject var38;
        final SubLObject var37 = var38 = var35.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var38, var37, (SubLObject)module0117.$ic99$);
        final SubLObject var39 = var38.rest();
        var38 = var38.first();
        SubLObject var40 = (SubLObject)module0117.NIL;
        SubLObject var41 = (SubLObject)module0117.NIL;
        SubLObject var42 = (SubLObject)module0117.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var38, var37, (SubLObject)module0117.$ic99$);
        var40 = var38.first();
        var38 = var38.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var38, var37, (SubLObject)module0117.$ic99$);
        var41 = var38.first();
        var38 = var38.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var38, var37, (SubLObject)module0117.$ic99$);
        var42 = var38.first();
        var38 = var38.rest();
        if (module0117.NIL == var38) {
            final SubLObject var43;
            var38 = (var43 = var39);
            final SubLObject var44 = (SubLObject)module0117.$ic100$;
            final SubLObject var45 = (SubLObject)module0117.$ic101$;
            return (SubLObject)ConsesLow.list((SubLObject)module0117.$ic102$, (SubLObject)ConsesLow.list(var44, var45), (SubLObject)ConsesLow.list((SubLObject)module0117.$ic103$, (SubLObject)ConsesLow.list(var42), (SubLObject)ConsesLow.listS((SubLObject)module0117.$ic104$, var44, (SubLObject)module0117.$ic105$), (SubLObject)ConsesLow.list((SubLObject)module0117.$ic104$, var45, (SubLObject)ConsesLow.list((SubLObject)module0117.$ic106$, var44, var41))), (SubLObject)ConsesLow.listS((SubLObject)module0117.$ic107$, (SubLObject)ConsesLow.list(var40, var45), ConsesLow.append(var43, (SubLObject)module0117.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var37, (SubLObject)module0117.$ic99$);
        return (SubLObject)module0117.NIL;
    }
    
    public static SubLObject f8126(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)module0117.ZERO_INTEGER);
        return (SubLObject)module0117.NIL;
    }
    
    public static SubLObject f8127(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX10143_native.class) ? module0117.T : module0117.NIL);
    }
    
    public static SubLObject f8128(final SubLObject var1) {
        assert module0117.NIL != f8127(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f8129(final SubLObject var1) {
        assert module0117.NIL != f8127(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f8130(final SubLObject var1) {
        assert module0117.NIL != f8127(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f8131(final SubLObject var1, final SubLObject var4) {
        assert module0117.NIL != f8127(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f8132(final SubLObject var1, final SubLObject var4) {
        assert module0117.NIL != f8127(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f8133(final SubLObject var1, final SubLObject var4) {
        assert module0117.NIL != f8127(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f8134(SubLObject var5) {
        if (var5 == module0117.UNPROVIDED) {
            var5 = (SubLObject)module0117.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX10143_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0117.NIL, var7 = var5; module0117.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0117.$ic35$)) {
                f8131(var6, var9);
            }
            else if (var10.eql((SubLObject)module0117.$ic122$)) {
                f8132(var6, var9);
            }
            else if (var10.eql((SubLObject)module0117.$ic123$)) {
                f8133(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0117.$ic12$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f8135(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic13$, (SubLObject)module0117.$ic124$, (SubLObject)module0117.THREE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic15$, (SubLObject)module0117.$ic35$, f8128(var11));
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic15$, (SubLObject)module0117.$ic122$, f8129(var11));
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic15$, (SubLObject)module0117.$ic123$, f8130(var11));
        Functions.funcall(var12, var11, (SubLObject)module0117.$ic16$, (SubLObject)module0117.$ic124$, (SubLObject)module0117.THREE_INTEGER);
        return var11;
    }
    
    public static SubLObject f8136(final SubLObject var11, final SubLObject var12) {
        return f8135(var11, var12);
    }
    
    public static SubLObject f8137(final SubLObject var19, final SubLObject var55, SubLObject var56) {
        if (var56 == module0117.UNPROVIDED) {
            var56 = (SubLObject)module0117.NIL;
        }
        final SubLObject var57 = f8134((SubLObject)module0117.UNPROVIDED);
        f8131(var57, var19);
        f8132(var57, var55);
        f8133(var57, var56);
        return var57;
    }
    
    public static SubLObject f8138(final SubLObject var57, SubLObject var2) {
        if (var2 == module0117.UNPROVIDED) {
            var2 = (SubLObject)module0117.T;
        }
        PrintLow.format(var2, (SubLObject)module0117.$ic126$, new SubLObject[] { f8128(var57), f8129(var57), f8130(var57) });
        return (SubLObject)module0117.T;
    }
    
    public static SubLObject f8139(final SubLObject var42, final SubLObject var19, final SubLObject var58, SubLObject var59) {
        if (var59 == module0117.UNPROVIDED) {
            var59 = (SubLObject)module0117.NIL;
        }
        final SubLObject var60 = f8137(var19, var58, var59);
        final SubLObject var61 = f8111(var42);
        SubLObject var62 = (SubLObject)module0117.NIL;
        try {
            var62 = Locks.seize_lock(var61);
            final SubLObject var63 = f8113(var42);
            module0067.f4886(var63, var19, var60);
        }
        finally {
            if (module0117.NIL != var62) {
                Locks.release_lock(var61);
            }
        }
        return var42;
    }
    
    public static SubLObject f8140(final SubLObject var42, final SubLObject var19) {
        SubLObject var43 = (SubLObject)module0117.NIL;
        final SubLObject var44 = f8111(var42);
        SubLObject var45 = (SubLObject)module0117.NIL;
        try {
            var45 = Locks.seize_lock(var44);
            final SubLObject var46 = f8113(var42);
            var43 = module0067.f4884(var46, var19, (SubLObject)module0117.UNPROVIDED);
        }
        finally {
            if (module0117.NIL != var45) {
                Locks.release_lock(var44);
            }
        }
        return var43;
    }
    
    public static SubLObject f8141(final SubLObject var24, final SubLObject var2) {
        PrintLow.format(var2, (SubLObject)module0117.$ic127$, Symbols.symbol_name(module0116.f8053(var24)));
        final SubLObject var25 = module0051.f3552(module0116.f8054(var24));
        PrintLow.format(var2, (SubLObject)module0117.$ic128$, var25);
        if (module0117.NIL != module0116.f8055(var24)) {
            PrintLow.format(var2, (SubLObject)module0117.$ic129$, module0038.f2624(module0116.f8055(var24)));
        }
        PrintLow.format(var2, (SubLObject)module0117.$ic130$, module0038.f2624(module0116.f8056(var24)));
        module0038.f2833(var2);
        return var24;
    }
    
    public static SubLObject f8142(final SubLObject var26, final SubLObject var2) {
        PrintLow.format(var2, (SubLObject)module0117.$ic131$, module0038.f2624(var26));
        module0038.f2833(var2);
        return var26;
    }
    
    public static SubLObject f8143(SubLObject var67) {
        if (var67 == module0117.UNPROVIDED) {
            var67 = (SubLObject)module0117.NIL;
        }
        if (module0117.NIL == var67) {
            var67 = module0116.f8042();
        }
        final SubLObject var68 = f8119((SubLObject)module0117.UNPROVIDED);
        f8114(var68, var67);
        f8115(var68, module0067.f4880((SubLObject)module0117.UNPROVIDED, (SubLObject)module0117.UNPROVIDED));
        f8116(var68, Locks.make_lock((SubLObject)module0117.$ic132$));
        f8117(var68, module0059.f4283((SubLObject)module0117.$ic133$));
        f8118(var68, module0067.f4880((SubLObject)module0117.UNPROVIDED, (SubLObject)module0117.UNPROVIDED));
        f8139(var68, (SubLObject)module0117.$ic66$, (SubLObject)module0117.$ic134$, (SubLObject)module0117.$ic135$);
        return var68;
    }
    
    public static SubLObject f8144() {
        if (module0117.NIL == f8108(module0117.$g1463$.getGlobalValue())) {
            module0117.$g1463$.setGlobalValue(f8143((SubLObject)module0117.UNPROVIDED));
        }
        return module0117.$g1463$.getGlobalValue();
    }
    
    public static SubLObject f8145(final SubLObject var35, final SubLObject var36) {
        SubLObject var38;
        final SubLObject var37 = var38 = var35.rest();
        SubLObject var39 = (SubLObject)module0117.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var38, var37, (SubLObject)module0117.$ic137$);
        var39 = var38.first();
        var38 = var38.rest();
        if (module0117.NIL == var38) {
            return (SubLObject)ConsesLow.list((SubLObject)module0117.$ic138$, (SubLObject)ConsesLow.list((SubLObject)module0117.$ic139$, var39), (SubLObject)ConsesLow.listS((SubLObject)module0117.$ic104$, var39, (SubLObject)module0117.$ic140$));
        }
        cdestructuring_bind.cdestructuring_bind_error(var37, (SubLObject)module0117.$ic137$);
        return (SubLObject)module0117.NIL;
    }
    
    public static SubLObject f8146() {
        return module0117.$g1463$.getGlobalValue();
    }
    
    public static SubLObject f8147(final SubLObject var70, SubLObject var42) {
        if (var42 == module0117.UNPROVIDED) {
            var42 = (SubLObject)module0117.NIL;
        }
        if (module0117.NIL == var42) {
            var42 = f8144();
        }
        assert module0117.NIL != f8108(var42) : var42;
        SubLObject var71 = (SubLObject)module0117.NIL;
        SubLObject var72 = (SubLObject)module0117.NIL;
        final SubLObject var73 = f8111(var42);
        SubLObject var74 = (SubLObject)module0117.NIL;
        try {
            var74 = Locks.seize_lock(var73);
            var71 = f8110(var42);
            var72 = module0067.f4885(var71, var70, (SubLObject)module0117.UNPROVIDED);
        }
        finally {
            if (module0117.NIL != var74) {
                Locks.release_lock(var73);
            }
        }
        return module0035.sublisp_boolean(var72);
    }
    
    public static SubLObject f8148() {
        final SubLObject var73 = module0117.$g1464$.getGlobalValue();
        if (module0117.NIL != var73) {
            module0034.f1818(var73);
        }
        return (SubLObject)module0117.NIL;
    }
    
    public static SubLObject f8149(final SubLObject var70, SubLObject var42) {
        if (var42 == module0117.UNPROVIDED) {
            var42 = (SubLObject)module0117.NIL;
        }
        return module0034.f1829(module0117.$g1464$.getGlobalValue(), (SubLObject)ConsesLow.list(var70, var42), (SubLObject)module0117.UNPROVIDED, (SubLObject)module0117.UNPROVIDED);
    }
    
    public static SubLObject f8150(final SubLObject var70, final SubLObject var42) {
        return f8151(var70, var42);
    }
    
    public static SubLObject f8152(final SubLObject var70, SubLObject var42) {
        if (var42 == module0117.UNPROVIDED) {
            var42 = (SubLObject)module0117.NIL;
        }
        SubLObject var71 = module0117.$g1464$.getGlobalValue();
        if (module0117.NIL == var71) {
            var71 = module0034.f1934((SubLObject)module0117.$ic141$, (SubLObject)module0117.$ic142$, (SubLObject)module0117.NIL, (SubLObject)module0117.EQL, (SubLObject)module0117.TWO_INTEGER, (SubLObject)module0117.ZERO_INTEGER);
        }
        final SubLObject var72 = module0034.f1782(var70, var42);
        final SubLObject var73 = module0034.f1814(var71, var72, (SubLObject)module0117.UNPROVIDED);
        if (var73 != module0117.$ic143$) {
            SubLObject var74 = var73;
            SubLObject var75 = (SubLObject)module0117.NIL;
            var75 = var74.first();
            while (module0117.NIL != var74) {
                SubLObject var76 = var75.first();
                final SubLObject var77 = conses_high.second(var75);
                if (var70.eql(var76.first())) {
                    var76 = var76.rest();
                    if (module0117.NIL != var76 && module0117.NIL == var76.rest() && var42.eql(var76.first())) {
                        return module0034.f1959(var77);
                    }
                }
                var74 = var74.rest();
                var75 = var74.first();
            }
        }
        final SubLObject var78 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f8150(var70, var42)));
        module0034.f1836(var71, var72, var73, var78, (SubLObject)ConsesLow.list(var70, var42));
        return module0034.f1959(var78);
    }
    
    public static SubLObject f8151(final SubLObject var70, SubLObject var42) {
        if (var42 == module0117.UNPROVIDED) {
            var42 = (SubLObject)module0117.NIL;
        }
        if (module0117.NIL == var42) {
            var42 = f8144();
        }
        assert module0117.NIL != f8108(var42) : var42;
        final SubLObject var71 = f8109(var42);
        final SubLObject var72 = module0116.f8044(var70, var71);
        SubLObject var73 = (SubLObject)module0117.NIL;
        SubLObject var74 = (SubLObject)module0117.NIL;
        final SubLObject var75 = f8111(var42);
        SubLObject var76 = (SubLObject)module0117.NIL;
        try {
            var76 = Locks.seize_lock(var75);
            var73 = f8110(var42);
            SubLObject var77 = var72;
            while (module0117.NIL != var77) {
                if (module0117.NIL == var74) {
                    final SubLObject var78 = module0116.f8001(var77);
                    var74 = module0035.sublisp_boolean(module0067.f4885(var73, var78, (SubLObject)module0117.UNPROVIDED));
                }
                if (module0116.f8001(var77) == module0117.$ic144$) {
                    var77 = (SubLObject)module0117.NIL;
                }
                else {
                    var77 = module0116.f8034(var71, module0116.f8000(var77));
                }
            }
        }
        finally {
            if (module0117.NIL != var76) {
                Locks.release_lock(var75);
            }
        }
        return var74;
    }
    
    public static SubLObject f8153(SubLObject var42, SubLObject var2) {
        if (var42 == module0117.UNPROVIDED) {
            var42 = (SubLObject)module0117.NIL;
        }
        if (var2 == module0117.UNPROVIDED) {
            var2 = (SubLObject)module0117.T;
        }
        final SubLThread var43 = SubLProcess.currentSubLThread();
        if (module0117.NIL == var42) {
            var42 = f8144();
        }
        assert module0117.NIL != f8108(var42) : var42;
        PrintLow.format(var2, (SubLObject)module0117.$ic145$);
        SubLObject var44 = f8109(var42);
        final SubLObject var45 = module0055.f4017();
        SubLObject var46 = (SubLObject)module0117.NIL;
        if (module0117.NIL == var44) {
            var44 = module0116.f8037();
        }
        assert module0117.NIL != module0116.f8021(var44) : var44;
        module0055.f4021((SubLObject)module0117.$ic144$, var45);
        while (module0117.NIL == module0055.f4019(var45)) {
            final SubLObject var47 = module0055.f4023(var45);
            final SubLObject var48 = var46 = module0116.f8035(var47, var44);
            PrintLow.format(var2, (SubLObject)module0117.$ic147$, var47);
            SubLObject var49 = (SubLObject)module0117.NIL;
            SubLObject var50 = (SubLObject)module0117.NIL;
            final SubLObject var51 = f8111(var42);
            SubLObject var52 = (SubLObject)module0117.NIL;
            try {
                var52 = Locks.seize_lock(var51);
                var49 = f8110(var42);
                var50 = module0067.f4884(var49, var47, (SubLObject)module0117.UNPROVIDED);
            }
            finally {
                if (module0117.NIL != var52) {
                    Locks.release_lock(var51);
                }
            }
            SubLObject var53 = var50;
            SubLObject var54 = (SubLObject)module0117.NIL;
            var54 = var53.first();
            while (module0117.NIL != var53) {
                streams_high.write_string((SubLObject)module0117.$ic148$, var2, (SubLObject)module0117.UNPROVIDED, (SubLObject)module0117.UNPROVIDED);
                f8106(var54, var2);
                var53 = var53.rest();
                var54 = var53.first();
            }
            SubLObject var55 = var48;
            SubLObject var56 = (SubLObject)module0117.NIL;
            var56 = var55.first();
            while (module0117.NIL != var55) {
                module0055.f4021(module0116.f8001(var56), var45);
                var55 = var55.rest();
                var56 = var55.first();
            }
        }
        PrintLow.format(var2, (SubLObject)module0117.$ic149$);
        SubLObject var57;
        for (var57 = module0066.f4838(module0067.f4891(f8113(var42))); module0117.NIL == module0066.f4841(var57); var57 = module0066.f4840(var57)) {
            var43.resetMultipleValues();
            final SubLObject var58 = module0066.f4839(var57);
            final SubLObject var59 = var43.secondMultipleValue();
            var43.resetMultipleValues();
            streams_high.write_string((SubLObject)module0117.$ic150$, var2, (SubLObject)module0117.UNPROVIDED, (SubLObject)module0117.UNPROVIDED);
            f8138(var59, var2);
        }
        module0066.f4842(var57);
        return (SubLObject)module0117.T;
    }
    
    public static SubLObject f8154() {
        module0117.$g1463$.setGlobalValue(f8155(f8146()));
        return f8146();
    }
    
    public static SubLObject f8155(final SubLObject var42) {
        module0067.f4881(f8110(var42));
        f8117(var42, module0059.f4283((SubLObject)module0117.$ic133$));
        return var42;
    }
    
    public static SubLObject f8156(final SubLObject var30, SubLObject var42) {
        if (var42 == module0117.UNPROVIDED) {
            var42 = (SubLObject)module0117.NIL;
        }
        assert module0117.NIL != f8090(var30) : var30;
        if (module0117.NIL == var42) {
            var42 = f8144();
        }
        assert module0117.NIL != f8108(var42) : var42;
        if (module0117.NIL != f8123(var30, var42)) {
            f8157(var42, var30);
            f8148();
            return (SubLObject)module0117.T;
        }
        return (SubLObject)module0117.NIL;
    }
    
    public static SubLObject f8158(final SubLObject var30, SubLObject var42) {
        if (var42 == module0117.UNPROVIDED) {
            var42 = (SubLObject)module0117.NIL;
        }
        final SubLThread var43 = SubLProcess.currentSubLThread();
        assert module0117.NIL != f8090(var30) : var30;
        if (module0117.NIL == var42) {
            var42 = f8144();
        }
        assert module0117.NIL != f8108(var42) : var42;
        if (module0117.NIL != f8124(var30, var42)) {
            if (module0117.NIL == module0117.$g1465$.getDynamicValue(var43)) {
                f8159(var42, var30);
            }
            f8148();
            return (SubLObject)module0117.T;
        }
        return (SubLObject)module0117.NIL;
    }
    
    public static SubLObject f8160(final SubLObject var19, final SubLObject var55, SubLObject var98, SubLObject var42) {
        if (var98 == module0117.UNPROVIDED) {
            var98 = (SubLObject)module0117.NIL;
        }
        if (var42 == module0117.UNPROVIDED) {
            var42 = (SubLObject)module0117.NIL;
        }
        assert module0117.NIL != Types.keywordp(var19) : var19;
        if (module0117.NIL == var42) {
            var42 = f8144();
        }
        assert module0117.NIL != f8108(var42) : var42;
        return f8139(var42, var19, var55, var98);
    }
    
    public static SubLObject f8161(final SubLObject var24, SubLObject var42) {
        if (var42 == module0117.UNPROVIDED) {
            var42 = (SubLObject)module0117.NIL;
        }
        if (module0117.NIL == var42) {
            var42 = f8144();
        }
        assert module0117.NIL != f8108(var42) : var42;
        module0059.f4284(var24, f8112(var42));
        return var24;
    }
    
    public static SubLObject f8162(SubLObject var42) {
        if (var42 == module0117.UNPROVIDED) {
            var42 = (SubLObject)module0117.NIL;
        }
        if (module0117.NIL == var42) {
            var42 = f8144();
        }
        assert module0117.NIL != f8108(var42) : var42;
        SubLObject var43 = (SubLObject)module0117.NIL;
        var43 = module0059.f4285(f8112(var42));
        f8163(var42, var43);
        return var43;
    }
    
    public static SubLObject f8157(final SubLObject var42, final SubLObject var30) {
        final SubLObject var43 = module0116.f8064((SubLObject)module0117.$ic154$, (SubLObject)module0117.$ic159$, (SubLObject)module0117.$ic160$);
        f8164(var42, var43, var30);
        return var42;
    }
    
    public static SubLObject f8159(final SubLObject var42, final SubLObject var30) {
        final SubLObject var43 = module0116.f8064((SubLObject)module0117.$ic156$, (SubLObject)module0117.$ic159$, (SubLObject)module0117.$ic160$);
        f8164(var42, var43, var30);
        return var42;
    }
    
    public static SubLObject f8163(final SubLObject var42, final SubLObject var24) {
        final SubLObject var43 = module0116.f8053(var24);
        final SubLObject var44 = f8109(var42);
        SubLObject var46;
        final SubLObject var45 = var46 = module0116.f8044(var43, var44);
        while (module0117.NIL != var46) {
            final SubLObject var47 = module0116.f8001(var46);
            SubLObject var48 = (SubLObject)module0117.NIL;
            SubLObject var49 = (SubLObject)module0117.NIL;
            final SubLObject var50 = f8111(var42);
            SubLObject var51 = (SubLObject)module0117.NIL;
            try {
                var51 = Locks.seize_lock(var50);
                var48 = f8110(var42);
                var49 = module0067.f4884(var48, var47, (SubLObject)module0117.UNPROVIDED);
            }
            finally {
                if (module0117.NIL != var51) {
                    Locks.release_lock(var50);
                }
            }
            SubLObject var52 = var49;
            SubLObject var53 = (SubLObject)module0117.NIL;
            var53 = var52.first();
            while (module0117.NIL != var52) {
                f8164(var42, var24, var53);
                var52 = var52.rest();
                var53 = var52.first();
            }
            if (module0116.f8001(var46) == module0117.$ic144$) {
                var46 = (SubLObject)module0117.NIL;
            }
            else {
                var46 = module0116.f8034(var44, module0116.f8000(var46));
            }
        }
        return var42;
    }
    
    public static SubLObject f8165(final SubLObject var24, final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f8093(var28);
        final SubLObject var31 = f8094(var28);
        SubLObject var32 = (SubLObject)module0117.NIL;
        SubLObject var33 = (SubLObject)module0117.NIL;
        try {
            var29.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var34 = Errors.$error_handler$.currentBinding(var29);
            try {
                Errors.$error_handler$.bind((SubLObject)module0117.$ic161$, var29);
                try {
                    var32 = Functions.funcall(f8070(var30), var24, var31);
                }
                catch (Throwable var35) {
                    Errors.handleThrowable(var35, (SubLObject)module0117.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var34, var29);
            }
        }
        catch (Throwable var36) {
            var33 = Errors.handleThrowable(var36, module0003.$g3$.getGlobalValue());
        }
        finally {
            var29.throwStack.pop();
        }
        if (var33.isString()) {
            f8166(var24, var33);
            var32 = var33;
        }
        return var32;
    }
    
    public static SubLObject f8166(final SubLObject var24, final SubLObject var107) {
        assert module0117.NIL != module0116.f8052(var24) : var24;
        assert module0117.NIL != Types.stringp(var107) : var107;
        Functions.funcall((SubLObject)module0117.$ic164$, var24, var107);
        return (SubLObject)module0117.NIL;
    }
    
    public static SubLObject f8167(final SubLObject var24, final SubLObject var107) {
        final SubLThread var108 = SubLProcess.currentSubLThread();
        assert module0117.NIL != module0116.f8052(var24) : var24;
        assert module0117.NIL != Types.stringp(var107) : var107;
        if (module0117.NIL != module0117.$g1457$.getGlobalValue()) {
            PrintLow.format(StreamsLow.$error_output$.getDynamicValue(var108), (SubLObject)module0117.$ic165$, var24, var107);
            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(var108));
        }
        return (SubLObject)module0117.NIL;
    }
    
    public static SubLObject f8168(final SubLObject var24, final SubLObject var28, final SubLObject var57) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        SubLObject var59 = (SubLObject)module0117.NIL;
        final SubLObject var60 = f8093(var28);
        final SubLObject var61 = f8094(var28);
        final SubLObject var62 = f8078(var60);
        final SubLObject var63 = f8079(var60);
        final SubLObject var64 = f8129(var57);
        final SubLObject var65 = f8130(var57);
        try {
            var58.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var66 = Errors.$error_handler$.currentBinding(var58);
            try {
                Errors.$error_handler$.bind((SubLObject)module0117.$ic161$, var58);
                try {
                    SubLObject var67 = (SubLObject)module0117.NIL;
                    try {
                        var67 = module0004.f82(var62, var63, (SubLObject)module0117.NIL, (SubLObject)module0117.$ic166$);
                        if (module0117.NIL != module0003.f70(var67, var62, var63)) {
                            Functions.funcall(var64, var24, var67);
                            if (module0117.NIL != var65) {
                                Functions.funcall(var65, var61, var67);
                            }
                            streams_high.force_output(var67);
                        }
                    }
                    finally {
                        final SubLObject var104_109 = Threads.$is_thread_performing_cleanupP$.currentBinding(var58);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0117.T, var58);
                            if (module0117.NIL != var67) {
                                streams_high.close(var67, (SubLObject)module0117.UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var104_109, var58);
                        }
                    }
                }
                catch (Throwable var68) {
                    Errors.handleThrowable(var68, (SubLObject)module0117.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var66, var58);
            }
        }
        catch (Throwable var69) {
            var59 = Errors.handleThrowable(var69, module0003.$g3$.getGlobalValue());
        }
        finally {
            var58.throwStack.pop();
        }
        return var59;
    }
    
    public static SubLObject f8164(final SubLObject var42, final SubLObject var24, final SubLObject var28) {
        final SubLObject var44;
        final SubLObject var43 = var44 = f8092(var28);
        if (var44.eql((SubLObject)module0117.$ic65$)) {
            return f8165(var24, var28);
        }
        if (var44.eql((SubLObject)module0117.$ic67$)) {
            final SubLObject var45 = f8093(var28);
            final SubLObject var46 = f8080(var45);
            final SubLObject var47 = f8140(var42, var46);
            return f8168(var24, var28, var47);
        }
        Errors.warn((SubLObject)module0117.$ic167$, var43, var28);
        return var42;
    }
    
    public static SubLObject f8169(final SubLObject var24, final SubLObject var2) {
        final SubLObject var25 = (SubLObject)ConsesLow.list((SubLObject)module0117.$ic168$, module0116.f8053(var24), (SubLObject)module0117.$ic169$, module0051.f3552(module0116.f8054(var24)), (SubLObject)module0117.$ic170$, module0116.f8056(var24), (SubLObject)module0117.$ic171$, module0116.f8055(var24));
        module0021.f1038(var25, var2);
        return var24;
    }
    
    public static SubLObject f8170(final SubLObject var102, final SubLObject var2) {
        final SubLObject var103 = (SubLObject)ConsesLow.list((SubLObject)module0117.$ic60$, var102);
        module0021.f1038(var103, var2);
        return var102;
    }
    
    public static SubLObject f8171() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8068", "S#10145", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8069", "S#10136", 1, 0, false);
        new $f8069$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8070", "S#10146", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8071", "S#10147", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8072", "S#10148", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8073", "S#10149", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8074", "S#10150", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8075", "S#10151", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8076", "S#10152", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8077", "S#10138", 1, 0, false);
        new $f8077$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8078", "S#10153", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8079", "S#10154", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8080", "S#10155", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8081", "S#10156", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8082", "S#10157", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8083", "S#10158", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8084", "S#10159", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8085", "S#10160", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8086", "S#10161", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8087", "S#10162", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8088", "S#10163", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8089", "S#10164", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8090", "S#10140", 1, 0, false);
        new $f8090$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8091", "S#10165", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8092", "S#10166", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8093", "S#10167", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8094", "S#10168", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8095", "S#10169", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8096", "S#10170", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8097", "S#10171", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8098", "S#10172", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8099", "S#10173", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8100", "S#10174", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8101", "S#10175", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8102", "S#10176", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8103", "S#10177", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8104", "S#10178", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8105", "S#10179", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8106", "S#10180", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8107", "S#10181", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8108", "S#10142", 1, 0, false);
        new $f8108$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8109", "S#10182", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8110", "S#10183", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8111", "S#10184", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8112", "S#10185", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8113", "S#10186", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8114", "S#10187", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8115", "S#10188", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8116", "S#10189", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8117", "S#10190", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8118", "S#10191", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8119", "S#10192", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8120", "S#10193", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8121", "S#10194", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0117", "f8122", "S#10195");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8123", "S#10196", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8124", "S#10197", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0117", "f8125", "S#10198");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8126", "S#10199", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8127", "S#10144", 1, 0, false);
        new $f8127$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8128", "S#10200", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8129", "S#10201", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8130", "S#10202", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8131", "S#10203", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8132", "S#10204", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8133", "S#10205", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8134", "S#10206", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8135", "S#10207", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8136", "S#10208", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8137", "S#10209", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8138", "S#10210", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8139", "S#10211", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8140", "S#10212", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8141", "S#10213", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8142", "S#10214", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8143", "S#10215", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8144", "S#10216", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0117", "f8145", "S#10217");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8146", "S#10218", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8147", "S#10219", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8148", "S#10220", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8149", "S#10221", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8150", "S#10222", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8152", "S#10223", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8151", "S#10224", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8153", "S#10225", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8154", "S#9530", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8155", "S#10226", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8156", "S#10227", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8158", "S#10228", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8160", "S#10229", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8161", "S#10230", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8162", "S#10231", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8157", "S#10232", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8159", "S#10233", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8163", "S#10234", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8165", "S#10235", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8166", "S#10236", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8167", "S#10237", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8168", "S#10238", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8164", "S#10239", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8169", "S#10240", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0117", "f8170", "S#10241", 2, 0, false);
        return (SubLObject)module0117.NIL;
    }
    
    public static SubLObject f8172() {
        module0117.$g1457$ = SubLFiles.deflexical("S#10242", (SubLObject)module0117.NIL);
        module0117.$g1458$ = SubLFiles.defconstant("S#10243", (SubLObject)module0117.$ic0$);
        module0117.$g1459$ = SubLFiles.defconstant("S#10244", (SubLObject)module0117.$ic19$);
        module0117.$g1460$ = SubLFiles.defconstant("S#10245", (SubLObject)module0117.$ic39$);
        module0117.$g1461$ = SubLFiles.defconstant("S#10246", (SubLObject)module0117.$ic72$);
        module0117.$g1462$ = SubLFiles.defconstant("S#10247", (SubLObject)module0117.$ic108$);
        module0117.$g1463$ = SubLFiles.deflexical("S#10248", (SubLObject)((module0117.NIL != Symbols.boundp((SubLObject)module0117.$ic136$)) ? module0117.$g1463$.getGlobalValue() : module0117.NIL));
        module0117.$g1464$ = SubLFiles.deflexical("S#10249", (SubLObject)module0117.NIL);
        module0117.$g1465$ = SubLFiles.defparameter("S#10250", (SubLObject)module0117.NIL);
        return (SubLObject)module0117.NIL;
    }
    
    public static SubLObject f8173() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0117.$g1458$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0117.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0117.$ic8$);
        Structures.def_csetf((SubLObject)module0117.$ic9$, (SubLObject)module0117.$ic10$);
        Equality.identity((SubLObject)module0117.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0117.$g1458$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0117.$ic17$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0117.$g1459$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0117.$ic25$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0117.$ic26$);
        Structures.def_csetf((SubLObject)module0117.$ic27$, (SubLObject)module0117.$ic28$);
        Structures.def_csetf((SubLObject)module0117.$ic29$, (SubLObject)module0117.$ic30$);
        Structures.def_csetf((SubLObject)module0117.$ic31$, (SubLObject)module0117.$ic32$);
        Equality.identity((SubLObject)module0117.$ic19$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0117.$g1459$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0117.$ic37$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0117.$g1460$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0117.$ic45$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0117.$ic46$);
        Structures.def_csetf((SubLObject)module0117.$ic47$, (SubLObject)module0117.$ic48$);
        Structures.def_csetf((SubLObject)module0117.$ic49$, (SubLObject)module0117.$ic50$);
        Structures.def_csetf((SubLObject)module0117.$ic51$, (SubLObject)module0117.$ic52$);
        Structures.def_csetf((SubLObject)module0117.$ic53$, (SubLObject)module0117.$ic54$);
        Structures.def_csetf((SubLObject)module0117.$ic55$, (SubLObject)module0117.$ic56$);
        Equality.identity((SubLObject)module0117.$ic39$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0117.$g1460$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0117.$ic63$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0117.$g1461$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0117.$ic78$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0117.$ic79$);
        Structures.def_csetf((SubLObject)module0117.$ic80$, (SubLObject)module0117.$ic81$);
        Structures.def_csetf((SubLObject)module0117.$ic82$, (SubLObject)module0117.$ic83$);
        Structures.def_csetf((SubLObject)module0117.$ic84$, (SubLObject)module0117.$ic85$);
        Structures.def_csetf((SubLObject)module0117.$ic86$, (SubLObject)module0117.$ic87$);
        Structures.def_csetf((SubLObject)module0117.$ic88$, (SubLObject)module0117.$ic89$);
        Equality.identity((SubLObject)module0117.$ic72$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0117.$g1461$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0117.$ic96$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0117.$g1462$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0117.$ic114$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0117.$ic115$);
        Structures.def_csetf((SubLObject)module0117.$ic116$, (SubLObject)module0117.$ic117$);
        Structures.def_csetf((SubLObject)module0117.$ic118$, (SubLObject)module0117.$ic119$);
        Structures.def_csetf((SubLObject)module0117.$ic120$, (SubLObject)module0117.$ic121$);
        Equality.identity((SubLObject)module0117.$ic108$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0117.$g1462$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0117.$ic125$));
        module0003.f57((SubLObject)module0117.$ic136$);
        module0034.f1909((SubLObject)module0117.$ic141$);
        module0116.f8039((SubLObject)module0117.$ic151$, (SubLObject)module0117.$ic152$, (SubLObject)module0117.$ic153$, (SubLObject)module0117.NIL);
        module0116.f8039((SubLObject)module0117.$ic154$, (SubLObject)module0117.$ic151$, (SubLObject)module0117.$ic155$, (SubLObject)module0117.NIL);
        module0116.f8039((SubLObject)module0117.$ic156$, (SubLObject)module0117.$ic151$, (SubLObject)module0117.$ic157$, (SubLObject)module0117.NIL);
        f8160((SubLObject)module0117.$ic172$, (SubLObject)module0117.$ic173$, (SubLObject)module0117.$ic174$, (SubLObject)module0117.UNPROVIDED);
        return (SubLObject)module0117.NIL;
    }
    
    public void declareFunctions() {
        f8171();
    }
    
    public void initializeVariables() {
        f8172();
    }
    
    public void runTopLevelForms() {
        f8173();
    }
    
    static {
        me = (SubLFile)new module0117();
        module0117.$g1457$ = null;
        module0117.$g1458$ = null;
        module0117.$g1459$ = null;
        module0117.$g1460$ = null;
        module0117.$g1461$ = null;
        module0117.$g1462$ = null;
        module0117.$g1463$ = null;
        module0117.$g1464$ = null;
        module0117.$g1465$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#10135", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#10136", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FUNCTION"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10146", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10147", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = SubLObjectFactory.makeSymbol("S#10145", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10136", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#10146", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#10147", "CYC");
        $ic11$ = SubLObjectFactory.makeKeyword("FUNCTION");
        $ic12$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic13$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic14$ = SubLObjectFactory.makeSymbol("S#10148", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic16$ = SubLObjectFactory.makeKeyword("END");
        $ic17$ = SubLObjectFactory.makeSymbol("S#10150", "CYC");
        $ic18$ = SubLObjectFactory.makeString(":funcall ~S ");
        $ic19$ = SubLObjectFactory.makeSymbol("S#10137", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#10138", "CYC");
        $ic21$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#57", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#58", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9328", "CYC"));
        $ic22$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HOST"), (SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeKeyword("PROTOCOL"));
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10153", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10154", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10155", "CYC"));
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10156", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10157", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10158", "CYC"));
        $ic25$ = SubLObjectFactory.makeSymbol("S#10152", "CYC");
        $ic26$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10138", "CYC"));
        $ic27$ = SubLObjectFactory.makeSymbol("S#10153", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#10156", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#10154", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#10157", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#10155", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#10158", "CYC");
        $ic33$ = SubLObjectFactory.makeKeyword("HOST");
        $ic34$ = SubLObjectFactory.makeKeyword("PORT");
        $ic35$ = SubLObjectFactory.makeKeyword("PROTOCOL");
        $ic36$ = SubLObjectFactory.makeSymbol("S#10159", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#10161", "CYC");
        $ic38$ = SubLObjectFactory.makeString(":socket ~S ~S ~S ");
        $ic39$ = SubLObjectFactory.makeSymbol("S#10139", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#10140", "CYC");
        $ic41$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10058", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10251", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10252", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10253", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10254", "CYC"));
        $ic42$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EVENT"), (SubLObject)SubLObjectFactory.makeKeyword("INVOCATION-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("INVOCATION-INFO"), (SubLObject)SubLObjectFactory.makeKeyword("MY-PARAMS"), (SubLObject)SubLObjectFactory.makeKeyword("SOURCE-FILTER"));
        $ic43$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10165", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10167", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10168", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10169", "CYC"));
        $ic44$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10170", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10171", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10172", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10173", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10174", "CYC"));
        $ic45$ = SubLObjectFactory.makeSymbol("S#10164", "CYC");
        $ic46$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10140", "CYC"));
        $ic47$ = SubLObjectFactory.makeSymbol("S#10165", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("S#10170", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#10166", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#10171", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#10167", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#10172", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#10168", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("S#10173", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("S#10169", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#10174", "CYC");
        $ic57$ = SubLObjectFactory.makeKeyword("EVENT");
        $ic58$ = SubLObjectFactory.makeKeyword("INVOCATION-MODE");
        $ic59$ = SubLObjectFactory.makeKeyword("INVOCATION-INFO");
        $ic60$ = SubLObjectFactory.makeKeyword("MY-PARAMS");
        $ic61$ = SubLObjectFactory.makeKeyword("SOURCE-FILTER");
        $ic62$ = SubLObjectFactory.makeSymbol("S#10175", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#10177", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("FALSE");
        $ic65$ = SubLObjectFactory.makeKeyword("FUNCALL");
        $ic66$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic67$ = SubLObjectFactory.makeKeyword("SOCKET");
        $ic68$ = SubLObjectFactory.makeString("~S listener ");
        $ic69$ = SubLObjectFactory.makeString("~S (unknown mode) ");
        $ic70$ = SubLObjectFactory.makeString(" with parameters ~S ");
        $ic71$ = SubLObjectFactory.makeString(" source filtering ~S");
        $ic72$ = SubLObjectFactory.makeSymbol("S#10141", "CYC");
        $ic73$ = SubLObjectFactory.makeSymbol("S#10142", "CYC");
        $ic74$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10130", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10255", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#672", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10256", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10257", "CYC"));
        $ic75$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HIERARCHY"), (SubLObject)SubLObjectFactory.makeKeyword("LISTENERS"), (SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("POSTINGS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTOCOLS"));
        $ic76$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10182", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10183", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10184", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10185", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10186", "CYC"));
        $ic77$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10187", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10188", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10189", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10190", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10191", "CYC"));
        $ic78$ = SubLObjectFactory.makeSymbol("S#10181", "CYC");
        $ic79$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10142", "CYC"));
        $ic80$ = SubLObjectFactory.makeSymbol("S#10182", "CYC");
        $ic81$ = SubLObjectFactory.makeSymbol("S#10187", "CYC");
        $ic82$ = SubLObjectFactory.makeSymbol("S#10183", "CYC");
        $ic83$ = SubLObjectFactory.makeSymbol("S#10188", "CYC");
        $ic84$ = SubLObjectFactory.makeSymbol("S#10184", "CYC");
        $ic85$ = SubLObjectFactory.makeSymbol("S#10189", "CYC");
        $ic86$ = SubLObjectFactory.makeSymbol("S#10185", "CYC");
        $ic87$ = SubLObjectFactory.makeSymbol("S#10190", "CYC");
        $ic88$ = SubLObjectFactory.makeSymbol("S#10186", "CYC");
        $ic89$ = SubLObjectFactory.makeSymbol("S#10191", "CYC");
        $ic90$ = SubLObjectFactory.makeKeyword("HIERARCHY");
        $ic91$ = SubLObjectFactory.makeKeyword("LISTENERS");
        $ic92$ = SubLObjectFactory.makeKeyword("LOCK");
        $ic93$ = SubLObjectFactory.makeKeyword("POSTINGS");
        $ic94$ = SubLObjectFactory.makeKeyword("PROTOCOLS");
        $ic95$ = SubLObjectFactory.makeSymbol("S#10192", "CYC");
        $ic96$ = SubLObjectFactory.makeSymbol("S#10194", "CYC");
        $ic97$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10141", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic98$ = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $ic99$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10258", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10058", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10259", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic100$ = SubLObjectFactory.makeUninternedSymbol("US#795C088");
        $ic101$ = SubLObjectFactory.makeUninternedSymbol("US#45864C0");
        $ic102$ = SubLObjectFactory.makeSymbol("CLET");
        $ic103$ = SubLObjectFactory.makeSymbol("S#10195", "CYC");
        $ic104$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic105$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10183", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10259", "CYC")));
        $ic106$ = SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP");
        $ic107$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic108$ = SubLObjectFactory.makeSymbol("S#10143", "CYC");
        $ic109$ = SubLObjectFactory.makeSymbol("S#10144", "CYC");
        $ic110$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9328", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10260", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10261", "CYC"));
        $ic111$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTOCOL"), (SubLObject)SubLObjectFactory.makeKeyword("EVENT-SERIALIZE"), (SubLObject)SubLObjectFactory.makeKeyword("MY-PARAMS-SERIALIZE"));
        $ic112$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10200", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10201", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10202", "CYC"));
        $ic113$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10203", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10204", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10205", "CYC"));
        $ic114$ = SubLObjectFactory.makeSymbol("S#10199", "CYC");
        $ic115$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10144", "CYC"));
        $ic116$ = SubLObjectFactory.makeSymbol("S#10200", "CYC");
        $ic117$ = SubLObjectFactory.makeSymbol("S#10203", "CYC");
        $ic118$ = SubLObjectFactory.makeSymbol("S#10201", "CYC");
        $ic119$ = SubLObjectFactory.makeSymbol("S#10204", "CYC");
        $ic120$ = SubLObjectFactory.makeSymbol("S#10202", "CYC");
        $ic121$ = SubLObjectFactory.makeSymbol("S#10205", "CYC");
        $ic122$ = SubLObjectFactory.makeKeyword("EVENT-SERIALIZE");
        $ic123$ = SubLObjectFactory.makeKeyword("MY-PARAMS-SERIALIZE");
        $ic124$ = SubLObjectFactory.makeSymbol("S#10206", "CYC");
        $ic125$ = SubLObjectFactory.makeSymbol("S#10208", "CYC");
        $ic126$ = SubLObjectFactory.makeString("Protocol ~S // for Event: ~S // for Params: ~S");
        $ic127$ = SubLObjectFactory.makeString("<event code=~S ");
        $ic128$ = SubLObjectFactory.makeString("timestamp=~S ");
        $ic129$ = SubLObjectFactory.makeString("source=~S ");
        $ic130$ = SubLObjectFactory.makeString("message=~S/>");
        $ic131$ = SubLObjectFactory.makeString("<parameter key=\"mine\" value=~S/>");
        $ic132$ = SubLObjectFactory.makeString("Event Broker Lock");
        $ic133$ = SubLObjectFactory.makeString("Event Broker Queue");
        $ic134$ = SubLObjectFactory.makeSymbol("S#10213", "CYC");
        $ic135$ = SubLObjectFactory.makeSymbol("S#10214", "CYC");
        $ic136$ = SubLObjectFactory.makeSymbol("S#10248", "CYC");
        $ic137$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10141", "CYC"));
        $ic138$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic139$ = SubLObjectFactory.makeSymbol("NULL");
        $ic140$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10216", "CYC")));
        $ic141$ = SubLObjectFactory.makeSymbol("S#10223", "CYC");
        $ic142$ = SubLObjectFactory.makeSymbol("S#10249", "CYC");
        $ic143$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic144$ = SubLObjectFactory.makeKeyword("EVENT-ROOT");
        $ic145$ = SubLObjectFactory.makeString("Event Broker settings~%");
        $ic146$ = SubLObjectFactory.makeSymbol("S#10057", "CYC");
        $ic147$ = SubLObjectFactory.makeString("  Listening for ~S :~%");
        $ic148$ = SubLObjectFactory.makeString("  ");
        $ic149$ = SubLObjectFactory.makeString("  Defined protocols:~%");
        $ic150$ = SubLObjectFactory.makeString("    ");
        $ic151$ = SubLObjectFactory.makeKeyword("EVENT-BROKER-EVENT");
        $ic152$ = SubLObjectFactory.makeKeyword("SYSTEM-EVENT");
        $ic153$ = SubLObjectFactory.makeString("The parent for all events that the event broker uses for the meta-communication.");
        $ic154$ = SubLObjectFactory.makeKeyword("EVENT-HANDLER-REGISTERED");
        $ic155$ = SubLObjectFactory.makeString("The first message any event handler sees.");
        $ic156$ = SubLObjectFactory.makeKeyword("EVENT-HANDLER-DEREGISTERED");
        $ic157$ = SubLObjectFactory.makeString("The last message any event handler sees.");
        $ic158$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic159$ = SubLObjectFactory.makeString("success");
        $ic160$ = SubLObjectFactory.makeKeyword("BROKER");
        $ic161$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic162$ = SubLObjectFactory.makeSymbol("S#10059", "CYC");
        $ic163$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic164$ = SubLObjectFactory.makeSymbol("S#10237", "CYC");
        $ic165$ = SubLObjectFactory.makeString("Error during processing of event: ~A~%~A~%");
        $ic166$ = SubLObjectFactory.makeKeyword("PUBLIC");
        $ic167$ = SubLObjectFactory.makeString("Unknown mode of invocation ~S -- cannot dispatch event to listener ~S.");
        $ic168$ = SubLObjectFactory.makeKeyword("CLASS");
        $ic169$ = SubLObjectFactory.makeKeyword("TIMESTAMP");
        $ic170$ = SubLObjectFactory.makeKeyword("MESSAGE");
        $ic171$ = SubLObjectFactory.makeKeyword("SOURCE");
        $ic172$ = SubLObjectFactory.makeKeyword("CFASL");
        $ic173$ = SubLObjectFactory.makeSymbol("S#10240", "CYC");
        $ic174$ = SubLObjectFactory.makeSymbol("S#10241", "CYC");
    }
    
    public static final class $sX10135_native extends SubLStructNative
    {
        public SubLObject $function;
        private static final SubLStructDeclNative structDecl;
        
        public $sX10135_native() {
            this.$function = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX10135_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$function;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$function = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX10135_native.class, module0117.$ic0$, module0117.$ic1$, module0117.$ic2$, module0117.$ic3$, new String[] { "$function" }, module0117.$ic4$, module0117.$ic5$, module0117.$ic6$);
        }
    }
    
    public static final class $f8069$UnaryFunction extends UnaryFunction
    {
        public $f8069$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#10136"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0117.f8069(var3);
        }
    }
    
    public static final class $sX10137_native extends SubLStructNative
    {
        public SubLObject $host;
        public SubLObject $port;
        public SubLObject $protocol;
        private static final SubLStructDeclNative structDecl;
        
        public $sX10137_native() {
            this.$host = (SubLObject)CommonSymbols.NIL;
            this.$port = (SubLObject)CommonSymbols.NIL;
            this.$protocol = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX10137_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$host;
        }
        
        public SubLObject getField3() {
            return this.$port;
        }
        
        public SubLObject getField4() {
            return this.$protocol;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$host = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$port = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$protocol = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX10137_native.class, module0117.$ic19$, module0117.$ic20$, module0117.$ic21$, module0117.$ic22$, new String[] { "$host", "$port", "$protocol" }, module0117.$ic23$, module0117.$ic24$, module0117.$ic6$);
        }
    }
    
    public static final class $f8077$UnaryFunction extends UnaryFunction
    {
        public $f8077$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#10138"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0117.f8077(var3);
        }
    }
    
    public static final class $sX10139_native extends SubLStructNative
    {
        public SubLObject $event;
        public SubLObject $invocation_mode;
        public SubLObject $invocation_info;
        public SubLObject $my_params;
        public SubLObject $source_filter;
        private static final SubLStructDeclNative structDecl;
        
        public $sX10139_native() {
            this.$event = (SubLObject)CommonSymbols.NIL;
            this.$invocation_mode = (SubLObject)CommonSymbols.NIL;
            this.$invocation_info = (SubLObject)CommonSymbols.NIL;
            this.$my_params = (SubLObject)CommonSymbols.NIL;
            this.$source_filter = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX10139_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$event;
        }
        
        public SubLObject getField3() {
            return this.$invocation_mode;
        }
        
        public SubLObject getField4() {
            return this.$invocation_info;
        }
        
        public SubLObject getField5() {
            return this.$my_params;
        }
        
        public SubLObject getField6() {
            return this.$source_filter;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$event = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$invocation_mode = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$invocation_info = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$my_params = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$source_filter = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX10139_native.class, module0117.$ic39$, module0117.$ic40$, module0117.$ic41$, module0117.$ic42$, new String[] { "$event", "$invocation_mode", "$invocation_info", "$my_params", "$source_filter" }, module0117.$ic43$, module0117.$ic44$, module0117.$ic6$);
        }
    }
    
    public static final class $f8090$UnaryFunction extends UnaryFunction
    {
        public $f8090$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#10140"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0117.f8090(var3);
        }
    }
    
    public static final class $sX10141_native extends SubLStructNative
    {
        public SubLObject $hierarchy;
        public SubLObject $listeners;
        public SubLObject $lock;
        public SubLObject $postings;
        public SubLObject $protocols;
        private static final SubLStructDeclNative structDecl;
        
        public $sX10141_native() {
            this.$hierarchy = (SubLObject)CommonSymbols.NIL;
            this.$listeners = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$postings = (SubLObject)CommonSymbols.NIL;
            this.$protocols = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX10141_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$hierarchy;
        }
        
        public SubLObject getField3() {
            return this.$listeners;
        }
        
        public SubLObject getField4() {
            return this.$lock;
        }
        
        public SubLObject getField5() {
            return this.$postings;
        }
        
        public SubLObject getField6() {
            return this.$protocols;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$hierarchy = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$listeners = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$postings = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$protocols = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX10141_native.class, module0117.$ic72$, module0117.$ic73$, module0117.$ic74$, module0117.$ic75$, new String[] { "$hierarchy", "$listeners", "$lock", "$postings", "$protocols" }, module0117.$ic76$, module0117.$ic77$, module0117.$ic6$);
        }
    }
    
    public static final class $f8108$UnaryFunction extends UnaryFunction
    {
        public $f8108$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#10142"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0117.f8108(var3);
        }
    }
    
    public static final class $sX10143_native extends SubLStructNative
    {
        public SubLObject $protocol;
        public SubLObject $event_serialize;
        public SubLObject $my_params_serialize;
        private static final SubLStructDeclNative structDecl;
        
        public $sX10143_native() {
            this.$protocol = (SubLObject)CommonSymbols.NIL;
            this.$event_serialize = (SubLObject)CommonSymbols.NIL;
            this.$my_params_serialize = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX10143_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$protocol;
        }
        
        public SubLObject getField3() {
            return this.$event_serialize;
        }
        
        public SubLObject getField4() {
            return this.$my_params_serialize;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$protocol = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$event_serialize = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$my_params_serialize = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX10143_native.class, module0117.$ic108$, module0117.$ic109$, module0117.$ic110$, module0117.$ic111$, new String[] { "$protocol", "$event_serialize", "$my_params_serialize" }, module0117.$ic112$, module0117.$ic113$, module0117.$ic6$);
        }
    }
    
    public static final class $f8127$UnaryFunction extends UnaryFunction
    {
        public $f8127$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#10144"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0117.f8127(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0117.class
	Total time: 443 ms
	
	Decompiled with Procyon 0.5.32.
*/