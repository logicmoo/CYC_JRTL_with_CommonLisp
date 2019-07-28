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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0059 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0059";
    public static final String myFingerPrint = "bba5f6908b56099819dd260b45d30dc5b2ad1855d8d5c7fc9869c98463e699e4";
    public static SubLSymbol $g1042$;
    public static SubLSymbol $g1043$;
    private static SubLSymbol $g1044$;
    public static SubLSymbol $g1045$;
    public static SubLSymbol $g1046$;
    private static SubLSymbol $g1047$;
    public static SubLSymbol $g1048$;
    private static SubLSymbol $g1049$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
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
    private static final SubLList $ic35$;
    private static final SubLList $ic36$;
    private static final SubLList $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
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
    private static final SubLList $ic82$;
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
    private static final SubLString $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLString $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLList $ic104$;
    private static final SubLList $ic105$;
    private static final SubLList $ic106$;
    private static final SubLList $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLList $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLString $ic120$;
    private static final SubLInteger $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLFloat $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLList $ic126$;
    private static final SubLList $ic127$;
    private static final SubLList $ic128$;
    private static final SubLList $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLList $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLString $ic145$;
    private static final SubLString $ic146$;
    private static final SubLString $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLList $ic149$;
    private static final SubLString $ic150$;
    private static final SubLList $ic151$;
    private static final SubLList $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLList $ic160$;
    private static final SubLList $ic161$;
    private static final SubLList $ic162$;
    private static final SubLList $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLList $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLList $ic191$;
    
    
    public static SubLObject f4194() {
        final SubLObject var1 = module0004.f95();
        if (NIL != Threads.valid_process_p(var1)) {
            return Threads.debug_process(var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4195() {
        return f4194();
    }
    
    public static SubLObject f4196(final SubLObject var2) {
        final SubLObject var3 = Threads.process_whostate(var2);
        return (SubLObject)makeBoolean(NIL != module0038.f2684(var3, (SubLObject)$ic2$) || NIL != module0038.f2684(var3, (SubLObject)$ic3$));
    }
    
    public static SubLObject f4197(final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL != f4198(var2) || NIL != f4199(var2));
    }
    
    public static SubLObject f4199(final SubLObject var2) {
        final SubLObject var3 = Threads.process_whostate(var2);
        return (SubLObject)makeBoolean(Sequences.search((SubLObject)$ic4$, var3, (SubLObject)EQUALP, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).isFixnum() || Sequences.search((SubLObject)$ic5$, var3, (SubLObject)EQUALP, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).isFixnum());
    }
    
    public static SubLObject f4198(final SubLObject var2) {
        final SubLObject var3 = Threads.process_whostate(var2);
        return Sequences.search((SubLObject)$ic6$, var3, (SubLObject)EQUALP, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f4200(final SubLObject var4, final SubLObject var5) {
        compatibility.default_struct_print_function(var4, var5, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4201(final SubLObject var4) {
        return (SubLObject)((var4.getClass() == $sX5671_native.class) ? T : NIL);
    }
    
    public static SubLObject f4202(final SubLObject var4) {
        assert NIL != f4201(var4) : var4;
        return var4.getField2();
    }
    
    public static SubLObject f4203(final SubLObject var4) {
        assert NIL != f4201(var4) : var4;
        return var4.getField3();
    }
    
    public static SubLObject f4204(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4201(var4) : var4;
        return var4.setField2(var7);
    }
    
    public static SubLObject f4205(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4201(var4) : var4;
        return var4.setField3(var7);
    }
    
    public static SubLObject f4206(SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        final SubLObject var9 = (SubLObject)new $sX5671_native();
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        for (var10 = (SubLObject)NIL, var10 = var8; NIL != var10; var10 = conses_high.cddr(var10)) {
            var11 = var10.first();
            var12 = conses_high.cadr(var10);
            var13 = var11;
            if (var13.eql((SubLObject)$ic20$)) {
                f4204(var9, var12);
            }
            else if (var13.eql((SubLObject)$ic21$)) {
                f4205(var9, var12);
            }
            else {
                Errors.error((SubLObject)$ic22$, var11);
            }
        }
        return var9;
    }
    
    public static SubLObject f4207(final SubLObject var14, final SubLObject var15) {
        Functions.funcall(var15, var14, (SubLObject)$ic23$, (SubLObject)$ic24$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic20$, f4202(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic21$, f4203(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic26$, (SubLObject)$ic24$, (SubLObject)TWO_INTEGER);
        return var14;
    }
    
    public static SubLObject f4208(final SubLObject var14, final SubLObject var15) {
        return f4207(var14, var15);
    }
    
    public static SubLObject f4209(final SubLObject var16, final SubLObject var17, SubLObject var18, SubLObject var19) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLObject var20 = f4206((SubLObject)UNPROVIDED);
        final SubLObject var21 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic28$), Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic29$), var19));
        final SubLObject var22 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic30$), var19);
        module0004.f78(var16, Symbols.symbol_function((SubLObject)$ic31$), (SubLObject)ConsesLow.list(var20, var17, var18, var21, var22));
        return var20;
    }
    
    public static SubLObject f4210(final SubLObject var20, final SubLObject var17, final SubLObject var18, final SubLObject var21, final SubLObject var22) {
        try {
            final SubLObject var23 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic32$), var21);
            final ArrayList var24 = Dynamic.extract_dynamic_values(var23);
            try {
                Dynamic.bind_dynamic_vars(var23, var22);
                f4204(var20, Threads.current_process());
                Functions.apply(var17, var18);
            }
            finally {
                Dynamic.rebind_dynamic_vars(var23, var24);
            }
        }
        finally {
            final SubLObject var25 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                f4205(var20, (SubLObject)T);
                f4204(var20, (SubLObject)NIL);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var25);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4211(final SubLObject var4, final SubLObject var5) {
        compatibility.default_struct_print_function(var4, var5, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4212(final SubLObject var4) {
        return (SubLObject)((var4.getClass() == $sX5673_native.class) ? T : NIL);
    }
    
    public static SubLObject f4213(final SubLObject var4) {
        assert NIL != f4212(var4) : var4;
        return var4.getField2();
    }
    
    public static SubLObject f4214(final SubLObject var4) {
        assert NIL != f4212(var4) : var4;
        return var4.getField3();
    }
    
    public static SubLObject f4215(final SubLObject var4) {
        assert NIL != f4212(var4) : var4;
        return var4.getField4();
    }
    
    public static SubLObject f4216(final SubLObject var4) {
        assert NIL != f4212(var4) : var4;
        return var4.getField5();
    }
    
    public static SubLObject f4217(final SubLObject var4) {
        assert NIL != f4212(var4) : var4;
        return var4.getField6();
    }
    
    public static SubLObject f4218(final SubLObject var4) {
        assert NIL != f4212(var4) : var4;
        return var4.getField7();
    }
    
    public static SubLObject f4219(final SubLObject var4) {
        assert NIL != f4212(var4) : var4;
        return var4.getField8();
    }
    
    public static SubLObject f4220(final SubLObject var4) {
        assert NIL != f4212(var4) : var4;
        return var4.getField9();
    }
    
    public static SubLObject f4221(final SubLObject var4) {
        assert NIL != f4212(var4) : var4;
        return var4.getField10();
    }
    
    public static SubLObject f4222(final SubLObject var4) {
        assert NIL != f4212(var4) : var4;
        return var4.getField11();
    }
    
    public static SubLObject f4223(final SubLObject var4) {
        assert NIL != f4212(var4) : var4;
        return var4.getField12();
    }
    
    public static SubLObject f4224(final SubLObject var4) {
        assert NIL != f4212(var4) : var4;
        return var4.getField13();
    }
    
    public static SubLObject f4225(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4212(var4) : var4;
        return var4.setField2(var7);
    }
    
    public static SubLObject f4226(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4212(var4) : var4;
        return var4.setField3(var7);
    }
    
    public static SubLObject f4227(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4212(var4) : var4;
        return var4.setField4(var7);
    }
    
    public static SubLObject f4228(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4212(var4) : var4;
        return var4.setField5(var7);
    }
    
    public static SubLObject f4229(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4212(var4) : var4;
        return var4.setField6(var7);
    }
    
    public static SubLObject f4230(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4212(var4) : var4;
        return var4.setField7(var7);
    }
    
    public static SubLObject f4231(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4212(var4) : var4;
        return var4.setField8(var7);
    }
    
    public static SubLObject f4232(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4212(var4) : var4;
        return var4.setField9(var7);
    }
    
    public static SubLObject f4233(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4212(var4) : var4;
        return var4.setField10(var7);
    }
    
    public static SubLObject f4234(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4212(var4) : var4;
        return var4.setField11(var7);
    }
    
    public static SubLObject f4235(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4212(var4) : var4;
        return var4.setField12(var7);
    }
    
    public static SubLObject f4236(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4212(var4) : var4;
        return var4.setField13(var7);
    }
    
    public static SubLObject f4237(SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        final SubLObject var9 = (SubLObject)new $sX5673_native();
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        for (var10 = (SubLObject)NIL, var10 = var8; NIL != var10; var10 = conses_high.cddr(var10)) {
            var11 = var10.first();
            var12 = conses_high.cadr(var10);
            var13 = var11;
            if (var13.eql((SubLObject)$ic65$)) {
                f4225(var9, var12);
            }
            else if (var13.eql((SubLObject)$ic66$)) {
                f4226(var9, var12);
            }
            else if (var13.eql((SubLObject)$ic67$)) {
                f4227(var9, var12);
            }
            else if (var13.eql((SubLObject)$ic68$)) {
                f4228(var9, var12);
            }
            else if (var13.eql((SubLObject)$ic69$)) {
                f4229(var9, var12);
            }
            else if (var13.eql((SubLObject)$ic70$)) {
                f4230(var9, var12);
            }
            else if (var13.eql((SubLObject)$ic71$)) {
                f4231(var9, var12);
            }
            else if (var13.eql((SubLObject)$ic72$)) {
                f4232(var9, var12);
            }
            else if (var13.eql((SubLObject)$ic73$)) {
                f4233(var9, var12);
            }
            else if (var13.eql((SubLObject)$ic74$)) {
                f4234(var9, var12);
            }
            else if (var13.eql((SubLObject)$ic75$)) {
                f4235(var9, var12);
            }
            else if (var13.eql((SubLObject)$ic76$)) {
                f4236(var9, var12);
            }
            else {
                Errors.error((SubLObject)$ic22$, var11);
            }
        }
        return var9;
    }
    
    public static SubLObject f4238(final SubLObject var14, final SubLObject var15) {
        Functions.funcall(var15, var14, (SubLObject)$ic23$, (SubLObject)$ic77$, (SubLObject)TWELVE_INTEGER);
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic65$, f4213(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic66$, f4214(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic67$, f4215(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic68$, f4216(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic69$, f4217(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic70$, f4218(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic71$, f4219(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic72$, f4220(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic73$, f4221(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic74$, f4222(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic75$, f4223(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic76$, f4224(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic26$, (SubLObject)$ic77$, (SubLObject)TWELVE_INTEGER);
        return var14;
    }
    
    public static SubLObject f4239(final SubLObject var14, final SubLObject var15) {
        return f4238(var14, var15);
    }
    
    public static SubLObject f4240(final SubLObject var16, final SubLObject var29, SubLObject var30) {
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var16) : var16;
        assert NIL != Types.stringp(var29) : var29;
        if (NIL != var30 && !areAssertionsDisabledFor(me) && NIL == module0035.f2327(var30)) {
            throw new AssertionError(var30);
        }
        final SubLObject var31 = f4237((SubLObject)UNPROVIDED);
        final SubLObject var32 = Locks.make_lock(var16);
        f4229(var31, var29);
        f4227(var31, var16);
        f4225(var31, var32);
        f4228(var31, (SubLObject)$ic81$);
        if (NIL != var30) {
            f4236(var31, var30);
        }
        return var31;
    }
    
    public static SubLObject f4241(final SubLObject var33, final SubLObject var34) {
        SubLObject var36;
        final SubLObject var35 = var36 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic82$);
        final SubLObject var37 = var36.rest();
        var36 = var36.first();
        SubLObject var38 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic82$);
        var38 = var36.first();
        var36 = var36.rest();
        if (NIL == var36) {
            final SubLObject var39;
            var36 = (var39 = var37);
            final SubLObject var40 = (SubLObject)$ic83$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic84$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var40, (SubLObject)ConsesLow.list((SubLObject)$ic85$, var38))), (SubLObject)ConsesLow.listS((SubLObject)$ic86$, (SubLObject)ConsesLow.list(var40), ConsesLow.append(var39, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var35, (SubLObject)$ic82$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4242(final SubLObject var31, final SubLObject var39) {
        assert NIL != f4212(var31) : var31;
        assert NIL != Types.processp(var39) : var39;
        final SubLObject var41_42;
        final SubLObject var40 = var41_42 = f4243(var31);
        SubLObject var41 = (SubLObject)NIL;
        try {
            var41 = Locks.seize_lock(var41_42);
            f4226(var31, var39);
        }
        finally {
            if (NIL != var41) {
                Locks.release_lock(var41_42);
            }
        }
        return var31;
    }
    
    public static SubLObject f4244(final SubLObject var31) {
        assert NIL != f4212(var31) : var31;
        f4226(var31, (SubLObject)NIL);
        return var31;
    }
    
    public static SubLObject f4245(final SubLObject var31, final SubLObject var44) {
        assert NIL != f4212(var31) : var31;
        assert NIL != Types.keywordp(var44) : var44;
        final SubLObject var45_46;
        final SubLObject var45 = var45_46 = f4243(var31);
        SubLObject var46 = (SubLObject)NIL;
        try {
            var46 = Locks.seize_lock(var45_46);
            f4228(var31, var44);
        }
        finally {
            if (NIL != var46) {
                Locks.release_lock(var45_46);
            }
        }
        return var31;
    }
    
    public static SubLObject f4246(final SubLObject var31, final SubLObject var48) {
        assert NIL != f4212(var31) : var31;
        assert NIL != Types.stringp(var48) : var48;
        final SubLObject var49_50;
        final SubLObject var49 = var49_50 = f4243(var31);
        SubLObject var50 = (SubLObject)NIL;
        try {
            var50 = Locks.seize_lock(var49_50);
            f4229(var31, var48);
        }
        finally {
            if (NIL != var50) {
                Locks.release_lock(var49_50);
            }
        }
        return var31;
    }
    
    public static SubLObject f4247(final SubLObject var31, final SubLObject var52) {
        assert NIL != f4212(var31) : var31;
        assert NIL != Types.integerp(var52) : var52;
        final SubLObject var53_54;
        final SubLObject var53 = var53_54 = f4243(var31);
        SubLObject var54 = (SubLObject)NIL;
        try {
            var54 = Locks.seize_lock(var53_54);
            f4230(var31, var52);
        }
        finally {
            if (NIL != var54) {
                Locks.release_lock(var53_54);
            }
        }
        return var31;
    }
    
    public static SubLObject f4248(final SubLObject var31, final SubLObject var56) {
        assert NIL != f4212(var31) : var31;
        assert NIL != Types.integerp(var56) : var56;
        final SubLObject var57_58;
        final SubLObject var57 = var57_58 = f4243(var31);
        SubLObject var58 = (SubLObject)NIL;
        try {
            var58 = Locks.seize_lock(var57_58);
            f4231(var31, var56);
        }
        finally {
            if (NIL != var58) {
                Locks.release_lock(var57_58);
            }
        }
        return var31;
    }
    
    public static SubLObject f4249(final SubLObject var31, final SubLObject var60) {
        assert NIL != f4212(var31) : var31;
        assert NIL != module0051.f3549(var60) : var60;
        final SubLObject var61_62;
        final SubLObject var61 = var61_62 = f4243(var31);
        SubLObject var62 = (SubLObject)NIL;
        try {
            var62 = Locks.seize_lock(var61_62);
            f4232(var31, var60);
        }
        finally {
            if (NIL != var62) {
                Locks.release_lock(var61_62);
            }
        }
        return var31;
    }
    
    public static SubLObject f4250(final SubLObject var31, final SubLObject var60) {
        assert NIL != f4212(var31) : var31;
        assert NIL != module0051.f3549(var60) : var60;
        final SubLObject var64_65;
        final SubLObject var61 = var64_65 = f4243(var31);
        SubLObject var62 = (SubLObject)NIL;
        try {
            var62 = Locks.seize_lock(var64_65);
            f4233(var31, var60);
        }
        finally {
            if (NIL != var62) {
                Locks.release_lock(var64_65);
            }
        }
        return var31;
    }
    
    public static SubLObject f4251(final SubLObject var31, final SubLObject var67) {
        assert NIL != f4212(var31) : var31;
        final SubLObject var68_69;
        final SubLObject var68 = var68_69 = f4243(var31);
        SubLObject var69 = (SubLObject)NIL;
        try {
            var69 = Locks.seize_lock(var68_69);
            f4234(var31, var67);
        }
        finally {
            if (NIL != var69) {
                Locks.release_lock(var68_69);
            }
        }
        return var31;
    }
    
    public static SubLObject f4252(final SubLObject var31, final SubLObject var71) {
        assert NIL != f4212(var31) : var31;
        assert NIL != Types.stringp(var71) : var71;
        final SubLObject var72_73;
        final SubLObject var72 = var72_73 = f4243(var31);
        SubLObject var73 = (SubLObject)NIL;
        try {
            var73 = Locks.seize_lock(var72_73);
            f4235(var31, var71);
        }
        finally {
            if (NIL != var73) {
                Locks.release_lock(var72_73);
            }
        }
        return var31;
    }
    
    public static SubLObject f4253(final SubLObject var31, final SubLObject var75, final SubLObject var76) {
        assert NIL != f4212(var31) : var31;
        assert NIL != Types.keywordp(var75) : var75;
        final SubLObject var77_78;
        final SubLObject var77 = var77_78 = f4243(var31);
        SubLObject var78 = (SubLObject)NIL;
        try {
            var78 = Locks.seize_lock(var77_78);
            f4236(var31, conses_high.putf(f4224(var31), var75, var76));
        }
        finally {
            if (NIL != var78) {
                Locks.release_lock(var77_78);
            }
        }
        return var31;
    }
    
    public static SubLObject f4243(final SubLObject var31) {
        assert NIL != f4212(var31) : var31;
        return f4213(var31);
    }
    
    public static SubLObject f4254(final SubLObject var31) {
        assert NIL != f4212(var31) : var31;
        return f4214(var31);
    }
    
    public static SubLObject f4255(final SubLObject var31) {
        assert NIL != f4212(var31) : var31;
        return f4215(var31);
    }
    
    public static SubLObject f4256(final SubLObject var31) {
        assert NIL != f4212(var31) : var31;
        return f4216(var31);
    }
    
    public static SubLObject f4257(final SubLObject var31) {
        assert NIL != f4212(var31) : var31;
        return f4217(var31);
    }
    
    public static SubLObject f4258(final SubLObject var31) {
        assert NIL != f4212(var31) : var31;
        return f4218(var31);
    }
    
    public static SubLObject f4259(final SubLObject var31) {
        assert NIL != f4212(var31) : var31;
        return f4219(var31);
    }
    
    public static SubLObject f4260(final SubLObject var31) {
        assert NIL != f4212(var31) : var31;
        return f4220(var31);
    }
    
    public static SubLObject f4261(final SubLObject var31) {
        assert NIL != f4212(var31) : var31;
        return f4221(var31);
    }
    
    public static SubLObject f4262(final SubLObject var31) {
        assert NIL != f4212(var31) : var31;
        return f4222(var31);
    }
    
    public static SubLObject f4263(final SubLObject var31) {
        assert NIL != f4212(var31) : var31;
        return f4223(var31);
    }
    
    public static SubLObject f4264(final SubLObject var31, final SubLObject var75) {
        assert NIL != f4212(var31) : var31;
        assert NIL != Types.keywordp(var75) : var75;
        return conses_high.getf(f4224(var31), var75, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f4265(final SubLObject var31) {
        assert NIL != f4212(var31) : var31;
        return conses_high.copy_list(f4224(var31));
    }
    
    public static SubLObject f4266() {
        final SubLThread var80 = SubLProcess.currentSubLThread();
        return $g1044$.getDynamicValue(var80);
    }
    
    public static SubLObject f4267(final SubLObject var31, final SubLObject var17, final SubLObject var81) {
        assert NIL != f4212(var31) : var31;
        assert NIL != Types.function_spec_p(var17) : var17;
        assert NIL != Types.listp(var81) : var81;
        SubLObject var82 = (SubLObject)NIL;
        final SubLObject var83_84;
        final SubLObject var83 = var83_84 = f4243(var31);
        SubLObject var84 = (SubLObject)NIL;
        try {
            var84 = Locks.seize_lock(var83_84);
            SubLObject var85 = f4254(var31);
            if (NIL == var85) {
                final SubLObject var86 = (SubLObject)ConsesLow.list(var31, var17, var81);
                final SubLObject var87 = f4255(var31);
                var85 = module0004.f78(var87, (SubLObject)$ic93$, var86);
                f4245(var31, (SubLObject)$ic94$);
                var82 = var85;
            }
        }
        finally {
            if (NIL != var84) {
                Locks.release_lock(var83_84);
            }
        }
        return var82;
    }
    
    public static SubLObject f4268(final SubLObject var31) {
        assert NIL != f4212(var31) : var31;
        SubLObject var32 = (SubLObject)NIL;
        final SubLObject var87_88;
        final SubLObject var33 = var87_88 = f4243(var31);
        SubLObject var34 = (SubLObject)NIL;
        try {
            var34 = Locks.seize_lock(var87_88);
            final SubLObject var35 = f4254(var31);
            if (NIL != Types.processp(var35)) {
                try {
                    if (NIL != Threads.valid_process_p(var35)) {
                        Threads.kill_process(var35);
                    }
                    var32 = (SubLObject)T;
                }
                finally {
                    final SubLObject var36 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                    try {
                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                        if (NIL == f4261(var31)) {
                            f4250(var31, Time.get_universal_time());
                        }
                        f4244(var31);
                        f4245(var31, (SubLObject)$ic95$);
                    }
                    finally {
                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var36);
                    }
                }
            }
        }
        finally {
            if (NIL != var34) {
                Locks.release_lock(var87_88);
            }
        }
        return var32;
    }
    
    public static SubLObject f4269(final SubLObject var31, final SubLObject var17, final SubLObject var18) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = (SubLObject)NIL;
        final SubLObject var37 = Packages.$package$.currentBinding(var32);
        try {
            Packages.$package$.bind(Packages.find_package((SubLObject)$ic96$), var32);
            f4270(var31);
            try {
                var36 = (SubLObject)T;
                final SubLObject var25_92 = $g1044$.currentBinding(var32);
                try {
                    $g1044$.bind(var31, var32);
                    try {
                        var32.throwStack.push(module0003.$g3$.getGlobalValue());
                        final SubLObject var25_93 = Errors.$error_handler$.currentBinding(var32);
                        try {
                            Errors.$error_handler$.bind((SubLObject)$ic97$, var32);
                            try {
                                final SubLObject var25_94 = Errors.$continue_cerrorP$.currentBinding(var32);
                                try {
                                    Errors.$continue_cerrorP$.bind((SubLObject)T, var32);
                                    f4245(var31, (SubLObject)$ic98$);
                                    var33 = Functions.apply(var17, var18);
                                }
                                finally {
                                    Errors.$continue_cerrorP$.rebind(var25_94, var32);
                                }
                                var34 = (SubLObject)T;
                                var36 = (SubLObject)NIL;
                            }
                            catch (Throwable var38) {
                                Errors.handleThrowable(var38, (SubLObject)NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(var25_93, var32);
                        }
                    }
                    catch (Throwable var39) {
                        var35 = Errors.handleThrowable(var39, module0003.$g3$.getGlobalValue());
                    }
                    finally {
                        var32.throwStack.pop();
                    }
                }
                finally {
                    $g1044$.rebind(var25_92, var32);
                }
            }
            finally {
                final SubLObject var25_95 = Threads.$is_thread_performing_cleanupP$.currentBinding(var32);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var32);
                    if (NIL != var36 && f4256(var31) != $ic95$ && NIL == var35) {
                        var35 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic99$, var17, f4255(var31));
                    }
                    f4271(var31, var33, var34, var35);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var25_95, var32);
                }
            }
        }
        finally {
            Packages.$package$.rebind(var37, var32);
        }
        return Values.values(var33, var34, var35);
    }
    
    public static SubLObject f4270(final SubLObject var31) {
        f4249(var31, Time.get_universal_time());
        final SubLObject var32 = Threads.current_process();
        f4242(var31, var32);
        return var31;
    }
    
    public static SubLObject f4271(final SubLObject var31, final SubLObject var67, final SubLObject var90, final SubLObject var71) {
        final SubLObject var91 = (SubLObject)((f4256(var31) == $ic95$) ? T : NIL);
        if (NIL != var90) {
            f4251(var31, var67);
        }
        else if (NIL != var71) {
            f4252(var31, var71);
        }
        f4250(var31, Time.get_universal_time());
        f4244(var31);
        if (NIL == var91) {
            f4245(var31, (SubLObject)((NIL != var71) ? $ic100$ : $ic101$));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4272(final SubLObject var4, final SubLObject var5) {
        compatibility.default_struct_print_function(var4, var5, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4273(final SubLObject var4) {
        return (SubLObject)((var4.getClass() == $sX5675_native.class) ? T : NIL);
    }
    
    public static SubLObject f4274(final SubLObject var4) {
        assert NIL != f4273(var4) : var4;
        return var4.getField2();
    }
    
    public static SubLObject f4275(final SubLObject var4) {
        assert NIL != f4273(var4) : var4;
        return var4.getField3();
    }
    
    public static SubLObject f4276(final SubLObject var4) {
        assert NIL != f4273(var4) : var4;
        return var4.getField4();
    }
    
    public static SubLObject f4277(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4273(var4) : var4;
        return var4.setField2(var7);
    }
    
    public static SubLObject f4278(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4273(var4) : var4;
        return var4.setField3(var7);
    }
    
    public static SubLObject f4279(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4273(var4) : var4;
        return var4.setField4(var7);
    }
    
    public static SubLObject f4280(SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        final SubLObject var9 = (SubLObject)new $sX5675_native();
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        for (var10 = (SubLObject)NIL, var10 = var8; NIL != var10; var10 = conses_high.cddr(var10)) {
            var11 = var10.first();
            var12 = conses_high.cadr(var10);
            var13 = var11;
            if (var13.eql((SubLObject)$ic65$)) {
                f4277(var9, var12);
            }
            else if (var13.eql((SubLObject)$ic116$)) {
                f4278(var9, var12);
            }
            else if (var13.eql((SubLObject)$ic117$)) {
                f4279(var9, var12);
            }
            else {
                Errors.error((SubLObject)$ic22$, var11);
            }
        }
        return var9;
    }
    
    public static SubLObject f4281(final SubLObject var14, final SubLObject var15) {
        Functions.funcall(var15, var14, (SubLObject)$ic23$, (SubLObject)$ic118$, (SubLObject)THREE_INTEGER);
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic65$, f4274(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic116$, f4275(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic117$, f4276(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic26$, (SubLObject)$ic118$, (SubLObject)THREE_INTEGER);
        return var14;
    }
    
    public static SubLObject f4282(final SubLObject var14, final SubLObject var15) {
        return f4281(var14, var15);
    }
    
    public static SubLObject f4283(final SubLObject var16) {
        final SubLObject var17 = f4280((SubLObject)UNPROVIDED);
        final SubLObject var18 = Sequences.cconcatenate((SubLObject)$ic120$, var16);
        f4277(var17, Locks.make_lock(var18));
        f4278(var17, Semaphores.new_semaphore(var16, (SubLObject)ZERO_INTEGER));
        f4279(var17, module0055.f4017());
        return var17;
    }
    
    public static SubLObject f4284(final SubLObject var104, final SubLObject var105) {
        final SubLObject var106 = f4274(var105);
        final SubLObject var107 = f4276(var105);
        final SubLObject var107_108 = var106;
        SubLObject var108 = (SubLObject)NIL;
        try {
            var108 = Locks.seize_lock(var107_108);
            module0055.f4021(var104, var107);
        }
        finally {
            if (NIL != var108) {
                Locks.release_lock(var107_108);
            }
        }
        Semaphores.semaphore_signal(f4275(var105));
        return var105;
    }
    
    public static SubLObject f4285(final SubLObject var105) {
        SubLObject var106 = (SubLObject)NIL;
        final SubLObject var107 = f4274(var105);
        final SubLObject var108 = f4276(var105);
        SubLObject var109 = (SubLObject)NIL;
        try {
            Semaphores.semaphore_wait(f4275(var105));
            var109 = (SubLObject)T;
        }
        finally {
            final SubLObject var110 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if (NIL != var109) {
                    final SubLObject var111_112 = var107;
                    SubLObject var111 = (SubLObject)NIL;
                    try {
                        var111 = Locks.seize_lock(var111_112);
                        var106 = module0055.f4023(var108);
                    }
                    finally {
                        if (NIL != var111) {
                            Locks.release_lock(var111_112);
                        }
                    }
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var110);
            }
        }
        return var106;
    }
    
    public static SubLObject f4286(final SubLObject var105, SubLObject var114) {
        if (var114 == UNPROVIDED) {
            var114 = (SubLObject)$ic121$;
        }
        assert NIL != module0004.f105(var114) : var114;
        assert NIL != f4273(var105) : var105;
        if (var114.numE((SubLObject)ONE_INTEGER)) {
            return f4285(var105);
        }
        SubLObject var115 = (SubLObject)NIL;
        final SubLObject var116 = f4274(var105);
        final SubLObject var117 = f4276(var105);
        SubLObject var118 = (SubLObject)NIL;
        try {
            Semaphores.semaphore_wait(f4275(var105));
            var118 = (SubLObject)T;
        }
        finally {
            final SubLObject var119 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if (NIL != var118) {
                    final SubLObject var115_116 = var116;
                    SubLObject var120 = (SubLObject)NIL;
                    try {
                        var120 = Locks.seize_lock(var115_116);
                        for (SubLObject var121 = module0055.f4023(var117), var122 = (SubLObject)ZERO_INTEGER; NIL != var121 && var122.numL(var114); var121 = module0055.f4023(var117), var122 = Numbers.add(var122, (SubLObject)ONE_INTEGER)) {
                            var115 = (SubLObject)ConsesLow.cons(var121, var115);
                        }
                    }
                    finally {
                        if (NIL != var120) {
                            Locks.release_lock(var115_116);
                        }
                    }
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var119);
            }
        }
        return Sequences.nreverse(var115);
    }
    
    public static SubLObject f4287(final SubLObject var105, final SubLObject var120, SubLObject var121) {
        if (var121 == UNPROVIDED) {
            var121 = (SubLObject)$ic123$;
        }
        final SubLObject var122 = module0051.f3570(var120);
        final SubLObject var123 = Numbers.add(var122, Time.get_internal_real_time());
        while (Time.get_internal_real_time().numL(var123)) {
            if (f4288(var105).isPositive()) {
                return Values.values(f4285(var105), (SubLObject)NIL);
            }
            Threads.sleep(var121);
        }
        return Values.values((SubLObject)NIL, (SubLObject)T);
    }
    
    public static SubLObject f4288(final SubLObject var105) {
        SubLObject var106 = (SubLObject)NIL;
        SubLObject var107 = (SubLObject)NIL;
        final SubLObject var108 = f4274(var105);
        final SubLObject var109 = f4276(var105);
        final SubLObject var125_126 = var108;
        SubLObject var110 = (SubLObject)NIL;
        try {
            var110 = Locks.seize_lock(var125_126);
            var107 = Time.get_universal_time();
            var106 = module0055.f4016(var109);
        }
        finally {
            if (NIL != var110) {
                Locks.release_lock(var125_126);
            }
        }
        return Values.values(var106, var107);
    }
    
    public static SubLObject f4289(final SubLObject var105) {
        SubLObject var106 = (SubLObject)NIL;
        SubLObject var107 = (SubLObject)NIL;
        final SubLObject var108 = f4274(var105);
        final SubLObject var109 = f4276(var105);
        final SubLObject var128_129 = var108;
        SubLObject var110 = (SubLObject)NIL;
        try {
            var110 = Locks.seize_lock(var128_129);
            var107 = Time.get_universal_time();
            var106 = module0055.f4020(var109);
        }
        finally {
            if (NIL != var110) {
                Locks.release_lock(var128_129);
            }
        }
        return Values.values(var106, var107);
    }
    
    public static SubLObject f4290(final SubLObject var4, final SubLObject var5) {
        compatibility.default_struct_print_function(var4, var5, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4291(final SubLObject var4) {
        return (SubLObject)((var4.getClass() == $sX5677_native.class) ? T : NIL);
    }
    
    public static SubLObject f4292(final SubLObject var4) {
        assert NIL != f4291(var4) : var4;
        return var4.getField2();
    }
    
    public static SubLObject f4293(final SubLObject var4) {
        assert NIL != f4291(var4) : var4;
        return var4.getField3();
    }
    
    public static SubLObject f4294(final SubLObject var4) {
        assert NIL != f4291(var4) : var4;
        return var4.getField4();
    }
    
    public static SubLObject f4295(final SubLObject var4) {
        assert NIL != f4291(var4) : var4;
        return var4.getField5();
    }
    
    public static SubLObject f4296(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4291(var4) : var4;
        return var4.setField2(var7);
    }
    
    public static SubLObject f4297(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4291(var4) : var4;
        return var4.setField3(var7);
    }
    
    public static SubLObject f4298(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4291(var4) : var4;
        return var4.setField4(var7);
    }
    
    public static SubLObject f4299(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4291(var4) : var4;
        return var4.setField5(var7);
    }
    
    public static SubLObject f4300(SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        final SubLObject var9 = (SubLObject)new $sX5677_native();
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        for (var10 = (SubLObject)NIL, var10 = var8; NIL != var10; var10 = conses_high.cddr(var10)) {
            var11 = var10.first();
            var12 = conses_high.cadr(var10);
            var13 = var11;
            if (var13.eql((SubLObject)$ic65$)) {
                f4296(var9, var12);
            }
            else if (var13.eql((SubLObject)$ic140$)) {
                f4297(var9, var12);
            }
            else if (var13.eql((SubLObject)$ic141$)) {
                f4298(var9, var12);
            }
            else if (var13.eql((SubLObject)$ic142$)) {
                f4299(var9, var12);
            }
            else {
                Errors.error((SubLObject)$ic22$, var11);
            }
        }
        return var9;
    }
    
    public static SubLObject f4301(final SubLObject var14, final SubLObject var15) {
        Functions.funcall(var15, var14, (SubLObject)$ic23$, (SubLObject)$ic143$, (SubLObject)FOUR_INTEGER);
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic65$, f4292(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic140$, f4293(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic141$, f4294(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic142$, f4295(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic26$, (SubLObject)$ic143$, (SubLObject)FOUR_INTEGER);
        return var14;
    }
    
    public static SubLObject f4302(final SubLObject var14, final SubLObject var15) {
        return f4301(var14, var15);
    }
    
    public static SubLObject f4303(final SubLObject var16, SubLObject var134) {
        if (var134 == UNPROVIDED) {
            var134 = (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var16) : var16;
        final SubLObject var135 = f4300((SubLObject)UNPROVIDED);
        final SubLObject var136 = Sequences.cconcatenate((SubLObject)$ic146$, var16);
        f4296(var135, Locks.make_lock(var136));
        f4297(var135, module0057.f4173((SubLObject)ZERO_INTEGER, var134, (SubLObject)UNPROVIDED));
        f4298(var135, module0057.f4173((SubLObject)ZERO_INTEGER, var134, (SubLObject)UNPROVIDED));
        f4299(var135, module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return var135;
    }
    
    public static SubLObject f4304(final SubLObject var104, final SubLObject var135) {
        assert NIL != f4291(var135) : var135;
        final SubLObject var136 = module0057.f4175(f4293(var135));
        final SubLObject var137 = f4292(var135);
        final SubLObject var138 = f4295(var135);
        SubLObject var139 = (SubLObject)NIL;
        final SubLObject var139_140 = var137;
        SubLObject var140 = (SubLObject)NIL;
        try {
            var140 = Locks.seize_lock(var139_140);
            final SubLObject var141 = module0067.f4884(var138, var136, $g1047$.getGlobalValue());
            module0067.f4886(var138, var136, var104);
            if ($g1047$.getGlobalValue().eql(var141)) {
                var139 = (SubLObject)NIL;
            }
            else if (NIL != Threads.valid_process_p(var141)) {
                Threads.process_unblock(var141);
                var139 = (SubLObject)T;
            }
            else if (NIL != Types.processp(var141)) {
                var139 = f4304(var104, var135);
            }
            else {
                Errors.error((SubLObject)$ic147$, var141, var135);
            }
        }
        finally {
            if (NIL != var140) {
                Locks.release_lock(var139_140);
            }
        }
        return var139;
    }
    
    public static SubLObject f4305(final SubLObject var135) {
        assert NIL != f4291(var135) : var135;
        final SubLObject var136 = module0057.f4175(f4294(var135));
        final SubLObject var137 = f4292(var135);
        final SubLObject var138 = f4295(var135);
        SubLObject var139 = $g1047$.getGlobalValue();
        SubLObject var140 = (SubLObject)NIL;
        while ($g1047$.getGlobalValue().eql(var139)) {
            final SubLObject var144_145 = var137;
            SubLObject var141 = (SubLObject)NIL;
            try {
                var141 = Locks.seize_lock(var144_145);
                var139 = module0067.f4884(var138, var136, $g1047$.getGlobalValue());
                if ($g1047$.getGlobalValue().eql(var139)) {
                    module0067.f4886(var138, var136, Threads.current_process());
                    var140 = (SubLObject)T;
                }
                else {
                    module0067.f4887(var138, var136);
                }
            }
            finally {
                if (NIL != var141) {
                    Locks.release_lock(var144_145);
                }
            }
            if (NIL != var140) {
                Threads.process_block();
            }
        }
        return var139;
    }
    
    public static SubLObject f4306(final SubLObject var135) {
        assert NIL != f4291(var135) : var135;
        return Sequences.length(f4307(var135));
    }
    
    public static SubLObject f4307(final SubLObject var135) {
        assert NIL != f4291(var135) : var135;
        return Sequences.remove_if((SubLObject)$ic87$, module0067.f4903(f4295(var135)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f4308(final SubLObject var16) {
        assert NIL != Types.stringp(var16) : var16;
        SubLObject var17 = Threads.all_processes();
        SubLObject var18 = (SubLObject)NIL;
        var18 = var17.first();
        while (NIL != var17) {
            final SubLObject var19 = Threads.process_name(var18);
            if (NIL != Strings.stringE(var16, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                Threads.kill_process(var18);
            }
            var17 = var17.rest();
            var18 = var17.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4309(final SubLObject var16) {
        assert NIL != Types.stringp(var16) : var16;
        SubLObject var17 = Threads.all_processes();
        SubLObject var18 = (SubLObject)NIL;
        var18 = var17.first();
        while (NIL != var17) {
            final SubLObject var19 = Threads.process_name(var18);
            if (NIL != Strings.stringE(var16, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return var18;
            }
            var17 = var17.rest();
            var18 = var17.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4310() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4311(final SubLObject var16) {
        return Threads.make_process(var16, (SubLObject)$ic153$);
    }
    
    public static SubLObject f4312(final SubLObject var149, final SubLObject var150) {
        return f4313(var149, var150);
    }
    
    public static SubLObject f4313(final SubLObject var2, final SubLObject var150) {
        Functions.funcall(var150, var2, (SubLObject)$ic23$, (SubLObject)$ic155$, (SubLObject)ONE_INTEGER);
        Functions.funcall(var150, var2, (SubLObject)$ic25$, (SubLObject)$ic67$, Threads.process_name(var2));
        Functions.funcall(var150, var2, (SubLObject)$ic26$, (SubLObject)$ic155$, (SubLObject)ONE_INTEGER);
        return var2;
    }
    
    public static SubLObject f4314(final SubLObject var149, final SubLObject var150) {
        return f4315(var149, var150);
    }
    
    public static SubLObject f4315(final SubLObject var32, final SubLObject var150) {
        Functions.funcall(var150, var32, (SubLObject)$ic23$, (SubLObject)$ic157$, (SubLObject)ONE_INTEGER);
        Functions.funcall(var150, var32, (SubLObject)$ic25$, (SubLObject)$ic67$, Locks.lock_name(var32));
        Functions.funcall(var150, var32, (SubLObject)$ic26$, (SubLObject)$ic157$, (SubLObject)ONE_INTEGER);
        return var32;
    }
    
    public static SubLObject f4316(final SubLObject var4, final SubLObject var5) {
        compatibility.default_struct_print_function(var4, var5, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4317(final SubLObject var4) {
        return (SubLObject)((var4.getClass() == $sX5679_native.class) ? T : NIL);
    }
    
    public static SubLObject f4318(final SubLObject var4) {
        assert NIL != f4317(var4) : var4;
        return var4.getField2();
    }
    
    public static SubLObject f4319(final SubLObject var4) {
        assert NIL != f4317(var4) : var4;
        return var4.getField3();
    }
    
    public static SubLObject f4320(final SubLObject var4) {
        assert NIL != f4317(var4) : var4;
        return var4.getField4();
    }
    
    public static SubLObject f4321(final SubLObject var4) {
        assert NIL != f4317(var4) : var4;
        return var4.getField5();
    }
    
    public static SubLObject f4322(final SubLObject var4) {
        assert NIL != f4317(var4) : var4;
        return var4.getField6();
    }
    
    public static SubLObject f4323(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4317(var4) : var4;
        return var4.setField2(var7);
    }
    
    public static SubLObject f4324(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4317(var4) : var4;
        return var4.setField3(var7);
    }
    
    public static SubLObject f4325(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4317(var4) : var4;
        return var4.setField4(var7);
    }
    
    public static SubLObject f4326(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4317(var4) : var4;
        return var4.setField5(var7);
    }
    
    public static SubLObject f4327(final SubLObject var4, final SubLObject var7) {
        assert NIL != f4317(var4) : var4;
        return var4.setField6(var7);
    }
    
    public static SubLObject f4328(SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        final SubLObject var9 = (SubLObject)new $sX5679_native();
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        for (var10 = (SubLObject)NIL, var10 = var8; NIL != var10; var10 = conses_high.cddr(var10)) {
            var11 = var10.first();
            var12 = conses_high.cadr(var10);
            var13 = var11;
            if (var13.eql((SubLObject)$ic176$)) {
                f4323(var9, var12);
            }
            else if (var13.eql((SubLObject)$ic20$)) {
                f4324(var9, var12);
            }
            else if (var13.eql((SubLObject)$ic177$)) {
                f4325(var9, var12);
            }
            else if (var13.eql((SubLObject)$ic65$)) {
                f4326(var9, var12);
            }
            else if (var13.eql((SubLObject)$ic178$)) {
                f4327(var9, var12);
            }
            else {
                Errors.error((SubLObject)$ic22$, var11);
            }
        }
        return var9;
    }
    
    public static SubLObject f4329(final SubLObject var14, final SubLObject var15) {
        Functions.funcall(var15, var14, (SubLObject)$ic23$, (SubLObject)$ic179$, (SubLObject)FIVE_INTEGER);
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic176$, f4318(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic20$, f4319(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic177$, f4320(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic65$, f4321(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic25$, (SubLObject)$ic178$, f4322(var14));
        Functions.funcall(var15, var14, (SubLObject)$ic26$, (SubLObject)$ic179$, (SubLObject)FIVE_INTEGER);
        return var14;
    }
    
    public static SubLObject f4330(final SubLObject var14, final SubLObject var15) {
        return f4329(var14, var15);
    }
    
    public static SubLObject f4331(final SubLObject var16, final SubLObject var154, SubLObject var155) {
        if (var155 == UNPROVIDED) {
            var155 = (SubLObject)NIL;
        }
        final SubLObject var156 = Locks.make_lock(var16);
        SubLObject var157 = (SubLObject)NIL;
        final SubLObject var158 = var156;
        SubLObject var159 = (SubLObject)NIL;
        try {
            var159 = Locks.seize_lock(var158);
            var157 = f4328((SubLObject)ConsesLow.list((SubLObject)$ic65$, var156, (SubLObject)$ic177$, (SubLObject)$ic182$, (SubLObject)$ic176$, module0057.f4175($g1049$.getGlobalValue())));
            final SubLObject var160 = f4332(var16, (SubLObject)$ic183$, (SubLObject)ConsesLow.list(var157, var154, var155));
            f4324(var157, var160);
            f4325(var157, (SubLObject)$ic98$);
        }
        finally {
            if (NIL != var159) {
                Locks.release_lock(var158);
            }
        }
        return var157;
    }
    
    public static SubLObject f4333(final SubLObject var157, final SubLObject var154, final SubLObject var155) {
        SubLObject var158 = (SubLObject)NIL;
        var158 = Functions.apply(var154, (SubLObject)ConsesLow.cons(var157, var155));
        final SubLObject var160_161;
        final SubLObject var159 = var160_161 = f4321(var157);
        SubLObject var160 = (SubLObject)NIL;
        try {
            var160 = Locks.seize_lock(var160_161);
            f4325(var157, (SubLObject)$ic21$);
            f4324(var157, (SubLObject)NIL);
        }
        finally {
            if (NIL != var160) {
                Locks.release_lock(var160_161);
            }
        }
        return var158;
    }
    
    public static SubLObject f4334(final SubLObject var157) {
        return f4318(var157);
    }
    
    public static SubLObject f4335(final SubLObject var157) {
        return f4319(var157);
    }
    
    public static SubLObject f4336(final SubLObject var157) {
        return f4320(var157);
    }
    
    public static SubLObject f4337(final SubLObject var157) {
        return f4321(var157);
    }
    
    public static SubLObject f4338(final SubLObject var157) {
        return conses_high.copy_list(f4322(var157));
    }
    
    public static SubLObject f4339(final SubLObject var157) {
        return Equality.eq(f4320(var157), (SubLObject)$ic182$);
    }
    
    public static SubLObject f4340(final SubLObject var157) {
        return Equality.eq(f4320(var157), (SubLObject)$ic98$);
    }
    
    public static SubLObject f4341(final SubLObject var157) {
        return Equality.eq(f4320(var157), (SubLObject)$ic21$);
    }
    
    public static SubLObject f4342(final SubLObject var157) {
        return Equality.eq(f4320(var157), (SubLObject)$ic184$);
    }
    
    public static SubLObject f4343(final SubLObject var157) {
        return Equality.eq(f4320(var157), (SubLObject)$ic185$);
    }
    
    public static SubLObject f4344(final SubLObject var157) {
        return Equality.eq(f4320(var157), (SubLObject)$ic186$);
    }
    
    public static SubLObject f4345(final SubLObject var157) {
        final SubLObject var158 = f4321(var157);
        final SubLObject var159 = (SubLObject)NIL;
        final SubLObject var163_164 = var158;
        SubLObject var160 = (SubLObject)NIL;
        try {
            var160 = Locks.seize_lock(var163_164);
            final SubLObject var161 = f4320(var157);
            if (var161.eql((SubLObject)$ic98$)) {
                f4325(var157, (SubLObject)$ic185$);
            }
        }
        finally {
            if (NIL != var160) {
                Locks.release_lock(var163_164);
            }
        }
        return var159;
    }
    
    public static SubLObject f4346(final SubLObject var157) {
        final SubLObject var158 = f4321(var157);
        final SubLObject var159 = (SubLObject)NIL;
        final SubLObject var166_167 = var158;
        SubLObject var160 = (SubLObject)NIL;
        try {
            var160 = Locks.seize_lock(var166_167);
            final SubLObject var161 = f4320(var157);
            if (var161.eql((SubLObject)$ic185$)) {
                f4325(var157, (SubLObject)$ic98$);
            }
            else if (var161.eql((SubLObject)$ic186$)) {
                Threads.process_unblock(f4319(var157));
                f4325(var157, (SubLObject)$ic98$);
            }
        }
        finally {
            if (NIL != var160) {
                Locks.release_lock(var166_167);
            }
        }
        return var159;
    }
    
    public static SubLObject f4347(final SubLObject var157) {
        if (Threads.current_process().eql(f4319(var157))) {
            final SubLObject var158 = f4321(var157);
            SubLObject var159 = (SubLObject)NIL;
            final SubLObject var170_171 = var158;
            SubLObject var160 = (SubLObject)NIL;
            try {
                var160 = Locks.seize_lock(var170_171);
                final SubLObject var161 = f4320(var157);
                if (var161.eql((SubLObject)$ic185$)) {
                    f4325(var157, (SubLObject)$ic186$);
                    var159 = (SubLObject)T;
                }
            }
            finally {
                if (NIL != var160) {
                    Locks.release_lock(var170_171);
                }
            }
            if (NIL != var159) {
                Threads.process_block();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4348(final SubLObject var157) {
        if (Threads.current_process().eql(f4319(var157))) {
            final SubLObject var173_174;
            final SubLObject var158 = var173_174 = f4321(var157);
            SubLObject var159 = (SubLObject)NIL;
            try {
                var159 = Locks.seize_lock(var173_174);
                f4325(var157, (SubLObject)$ic186$);
            }
            finally {
                if (NIL != var159) {
                    Locks.release_lock(var173_174);
                }
            }
            Threads.process_block();
            return (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4349(final SubLObject var157) {
        final SubLObject var158 = f4321(var157);
        final SubLObject var159 = Equality.eq(Threads.current_process(), f4319(var157));
        SubLObject var160 = (SubLObject)NIL;
        final SubLObject var177_178 = var158;
        SubLObject var161 = (SubLObject)NIL;
        try {
            var161 = Locks.seize_lock(var177_178);
            f4325(var157, (SubLObject)$ic184$);
            if (NIL == var159) {
                var160 = Threads.kill_process(f4319(var157));
                f4324(var157, (SubLObject)NIL);
            }
        }
        finally {
            if (NIL != var161) {
                Locks.release_lock(var177_178);
            }
        }
        if (NIL != var159) {
            var160 = Threads.kill_process(f4319(var157));
            f4324(var157, (SubLObject)NIL);
        }
        return var160;
    }
    
    public static SubLObject f4350(final SubLObject var157, final SubLObject var180, final SubLObject var76) {
        final SubLObject var181 = f4321(var157);
        SubLObject var182 = (SubLObject)NIL;
        final SubLObject var181_182 = var181;
        SubLObject var183 = (SubLObject)NIL;
        try {
            var183 = Locks.seize_lock(var181_182);
            final SubLObject var184 = f4322(var157);
            var182 = conses_high.putf(var184, var180, var76);
            f4327(var157, var182);
        }
        finally {
            if (NIL != var183) {
                Locks.release_lock(var181_182);
            }
        }
        return var182;
    }
    
    public static SubLObject f4351(final SubLObject var157, final SubLObject var180, SubLObject var185) {
        if (var185 == UNPROVIDED) {
            var185 = (SubLObject)NIL;
        }
        final SubLObject var186 = f4321(var157);
        SubLObject var187 = (SubLObject)NIL;
        final SubLObject var186_187 = var186;
        SubLObject var188 = (SubLObject)NIL;
        try {
            var188 = Locks.seize_lock(var186_187);
            var187 = conses_high.getf(f4322(var157), var180, var185);
        }
        finally {
            if (NIL != var188) {
                Locks.release_lock(var186_187);
            }
        }
        return var187;
    }
    
    public static SubLObject f4352(final SubLObject var16, final SubLObject var17) {
        return module0004.f78(var16, (SubLObject)$ic187$, (SubLObject)ConsesLow.list(var17));
    }
    
    public static SubLObject f4353(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = Packages.$package$.currentBinding(var18);
        final SubLObject var20 = reader.$read_default_float_format$.currentBinding(var18);
        final SubLObject var21 = print_high.$print_readably$.currentBinding(var18);
        final SubLObject var22 = reader.$read_eval$.currentBinding(var18);
        try {
            Packages.$package$.bind(Packages.find_package((SubLObject)$ic96$), var18);
            reader.$read_default_float_format$.bind((SubLObject)$ic188$, var18);
            print_high.$print_readably$.bind((SubLObject)NIL, var18);
            reader.$read_eval$.bind((SubLObject)NIL, var18);
            final SubLObject var23 = Threads.process_priority(Threads.current_process());
            try {
                Threads.set_process_priority(Threads.current_process(), Threads.$process_normal_priority$.getGlobalValue());
                return Functions.funcall(var17);
            }
            finally {
                final SubLObject var25_193 = Threads.$is_thread_performing_cleanupP$.currentBinding(var18);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var18);
                    Threads.set_process_priority(Threads.current_process(), var23);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var25_193, var18);
                }
            }
        }
        finally {
            reader.$read_eval$.rebind(var22, var18);
            print_high.$print_readably$.rebind(var21, var18);
            reader.$read_default_float_format$.rebind(var20, var18);
            Packages.$package$.rebind(var19, var18);
        }
    }
    
    public static SubLObject f4332(final SubLObject var16, final SubLObject var17, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        return module0004.f78(var16, (SubLObject)$ic190$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(var17, var18)));
    }
    
    public static SubLObject f4354(final SubLObject var194) {
        final SubLThread var195 = SubLProcess.currentSubLThread();
        SubLObject var196 = (SubLObject)NIL;
        SubLObject var197 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var194, var194, (SubLObject)$ic191$);
        var196 = var194.first();
        final SubLObject var198 = var197 = var194.rest();
        final SubLObject var199 = Packages.$package$.currentBinding(var195);
        final SubLObject var200 = reader.$read_default_float_format$.currentBinding(var195);
        final SubLObject var201 = print_high.$print_readably$.currentBinding(var195);
        final SubLObject var202 = reader.$read_eval$.currentBinding(var195);
        try {
            Packages.$package$.bind(Packages.find_package((SubLObject)$ic96$), var195);
            reader.$read_default_float_format$.bind((SubLObject)$ic188$, var195);
            print_high.$print_readably$.bind((SubLObject)NIL, var195);
            reader.$read_eval$.bind((SubLObject)NIL, var195);
            final SubLObject var203 = Threads.process_priority(Threads.current_process());
            try {
                Threads.set_process_priority(Threads.current_process(), Threads.$process_normal_priority$.getGlobalValue());
                return Functions.apply(var196, var197);
            }
            finally {
                final SubLObject var25_197 = Threads.$is_thread_performing_cleanupP$.currentBinding(var195);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var195);
                    Threads.set_process_priority(Threads.current_process(), var203);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var25_197, var195);
                }
            }
        }
        finally {
            reader.$read_eval$.rebind(var202, var195);
            print_high.$print_readably$.rebind(var201, var195);
            reader.$read_default_float_format$.rebind(var200, var195);
            Packages.$package$.rebind(var199, var195);
        }
    }
    
    public static SubLObject f4355() {
        return Sequences.length(Threads.all_processes());
    }
    
    public static SubLObject f4356() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4194", "S#5681", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4195", "S#5682", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4196", "S#5683", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4197", "S#5684", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4199", "S#5685", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4198", "S#5686", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4200", "S#5687", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4201", "S#5672", 1, 0, false);
        new $f4201$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4202", "S#5688", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4203", "S#5689", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4204", "S#5690", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4205", "S#5691", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4206", "S#5692", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4207", "S#5693", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4208", "S#5694", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4209", "S#5695", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4210", "S#5696", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4211", "S#5697", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4212", "S#5674", 1, 0, false);
        new $f4212$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4213", "S#5698", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4214", "S#5699", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4215", "S#5700", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4216", "S#5701", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4217", "S#5702", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4218", "S#5703", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4219", "S#5704", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4220", "S#5705", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4221", "S#5706", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4222", "S#5707", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4223", "S#5708", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4224", "S#5709", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4225", "S#5710", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4226", "S#5711", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4227", "S#5712", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4228", "S#5713", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4229", "S#5714", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4230", "S#5715", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4231", "S#5716", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4232", "S#5717", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4233", "S#5718", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4234", "S#5719", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4235", "S#5720", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4236", "S#5721", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4237", "S#5722", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4238", "S#5723", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4239", "S#5724", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4240", "S#5725", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0059", "f4241", "S#5726");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4242", "S#5727", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4244", "S#5728", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4245", "S#5729", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4246", "S#5730", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4247", "S#5731", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4248", "S#5732", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4249", "S#5733", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4250", "S#5734", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4251", "S#5735", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4252", "S#5736", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4253", "S#5737", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4243", "S#5738", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4254", "S#5739", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4255", "S#5740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4256", "S#5741", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4257", "S#5742", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4258", "S#5743", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4259", "S#5744", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4260", "S#5745", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4261", "S#5746", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4262", "S#5747", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4263", "S#5748", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4264", "S#5749", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4265", "S#5750", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4266", "S#5673", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4267", "S#5751", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4268", "S#5752", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4269", "S#5753", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4270", "S#5754", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4271", "S#5755", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4272", "S#5756", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4273", "S#5676", 1, 0, false);
        new $f4273$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4274", "S#5757", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4275", "S#5758", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4276", "S#5759", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4277", "S#5760", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4278", "S#5761", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4279", "S#5762", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4280", "S#5763", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4281", "S#5764", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4282", "S#5765", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4283", "S#5766", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4284", "S#5767", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4285", "S#5768", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4286", "S#5769", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4287", "S#5770", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4288", "S#5771", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4289", "S#5772", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4290", "S#5773", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4291", "S#5678", 1, 0, false);
        new $f4291$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4292", "S#5774", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4293", "S#5775", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4294", "S#5776", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4295", "S#5777", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4296", "S#5778", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4297", "S#5779", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4298", "S#5780", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4299", "S#5781", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4300", "S#5782", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4301", "S#5783", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4302", "S#5784", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4303", "S#5785", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4304", "S#5786", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4305", "S#5787", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4306", "S#5788", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4307", "S#5789", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4308", "KILL-PROCESS-NAMED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4309", "S#5790", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4310", "S#5791", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4311", "S#5792", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4312", "S#5793", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4313", "S#5794", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4314", "S#5795", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4315", "S#5796", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4316", "S#5797", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4317", "S#5680", 1, 0, false);
        new $f4317$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4318", "S#5798", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4319", "S#5799", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4320", "S#5800", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4321", "S#5801", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4322", "S#5802", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4323", "S#5803", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4324", "S#5804", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4325", "S#5805", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4326", "S#5806", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4327", "S#5807", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4328", "S#5808", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4329", "S#5809", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4330", "S#5810", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4331", "S#5811", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4333", "S#5812", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4334", "S#5813", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4335", "S#5814", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4336", "S#5815", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4337", "S#5816", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4338", "S#5817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4339", "S#5818", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4340", "S#5819", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4341", "S#5820", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4342", "S#5821", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4343", "S#5822", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4344", "S#5823", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4345", "S#5824", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4346", "S#5825", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4347", "S#5826", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4348", "S#5827", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4349", "S#5828", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4350", "S#5829", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4351", "S#5830", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4352", "S#5831", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4353", "S#5832", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4332", "S#5833", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4354", "S#5834", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0059", "f4355", "S#5835", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4357() {
        $g1042$ = SubLFiles.defconstant("S#5836", (SubLObject)$ic7$);
        $g1043$ = SubLFiles.defconstant("S#5837", (SubLObject)$ic33$);
        $g1044$ = SubLFiles.defparameter("S#5838", (SubLObject)NIL);
        $g1045$ = SubLFiles.defconstant("S#5839", (SubLObject)$ic102$);
        $g1046$ = SubLFiles.defconstant("S#5840", (SubLObject)$ic124$);
        $g1047$ = SubLFiles.defconstant("S#5841", Symbols.make_symbol((SubLObject)$ic145$));
        $g1048$ = SubLFiles.defconstant("S#5842", (SubLObject)$ic158$);
        $g1049$ = SubLFiles.deflexical("S#5843", (NIL != Symbols.boundp((SubLObject)$ic181$)) ? $g1049$.getGlobalValue() : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4358() {
        module0002.f35((SubLObject)$ic0$, (SubLObject)$ic1$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1042$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic14$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic15$);
        Structures.def_csetf((SubLObject)$ic16$, (SubLObject)$ic17$);
        Structures.def_csetf((SubLObject)$ic18$, (SubLObject)$ic19$);
        Equality.identity((SubLObject)$ic7$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1042$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic27$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1043$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic39$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic40$);
        Structures.def_csetf((SubLObject)$ic41$, (SubLObject)$ic42$);
        Structures.def_csetf((SubLObject)$ic43$, (SubLObject)$ic44$);
        Structures.def_csetf((SubLObject)$ic45$, (SubLObject)$ic46$);
        Structures.def_csetf((SubLObject)$ic47$, (SubLObject)$ic48$);
        Structures.def_csetf((SubLObject)$ic49$, (SubLObject)$ic50$);
        Structures.def_csetf((SubLObject)$ic51$, (SubLObject)$ic52$);
        Structures.def_csetf((SubLObject)$ic53$, (SubLObject)$ic54$);
        Structures.def_csetf((SubLObject)$ic55$, (SubLObject)$ic56$);
        Structures.def_csetf((SubLObject)$ic57$, (SubLObject)$ic58$);
        Structures.def_csetf((SubLObject)$ic59$, (SubLObject)$ic60$);
        Structures.def_csetf((SubLObject)$ic61$, (SubLObject)$ic62$);
        Structures.def_csetf((SubLObject)$ic63$, (SubLObject)$ic64$);
        Equality.identity((SubLObject)$ic33$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1043$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic78$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1045$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic108$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic109$);
        Structures.def_csetf((SubLObject)$ic110$, (SubLObject)$ic111$);
        Structures.def_csetf((SubLObject)$ic112$, (SubLObject)$ic113$);
        Structures.def_csetf((SubLObject)$ic114$, (SubLObject)$ic115$);
        Equality.identity((SubLObject)$ic102$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1045$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic119$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1046$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic130$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic131$);
        Structures.def_csetf((SubLObject)$ic132$, (SubLObject)$ic133$);
        Structures.def_csetf((SubLObject)$ic134$, (SubLObject)$ic135$);
        Structures.def_csetf((SubLObject)$ic136$, (SubLObject)$ic137$);
        Structures.def_csetf((SubLObject)$ic138$, (SubLObject)$ic139$);
        Equality.identity((SubLObject)$ic124$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1046$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic144$));
        module0012.f368((SubLObject)$ic148$, (SubLObject)$ic149$, (SubLObject)$ic150$, (SubLObject)$ic151$, (SubLObject)$ic152$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), Types.$dtp_process$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic154$));
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), Types.$dtp_lock$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic156$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1048$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic164$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic165$);
        Structures.def_csetf((SubLObject)$ic166$, (SubLObject)$ic167$);
        Structures.def_csetf((SubLObject)$ic168$, (SubLObject)$ic169$);
        Structures.def_csetf((SubLObject)$ic170$, (SubLObject)$ic171$);
        Structures.def_csetf((SubLObject)$ic172$, (SubLObject)$ic173$);
        Structures.def_csetf((SubLObject)$ic174$, (SubLObject)$ic175$);
        Equality.identity((SubLObject)$ic158$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1048$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic180$));
        module0003.f57((SubLObject)$ic181$);
        module0012.f419((SubLObject)$ic187$);
        module0012.f419((SubLObject)$ic190$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f4356();
    }
    
    public void initializeVariables() {
        f4357();
    }
    
    public void runTopLevelForms() {
        f4358();
    }
    
    static {
        me = (SubLFile)new module0059();
        $g1042$ = null;
        $g1043$ = null;
        $g1044$ = null;
        $g1045$ = null;
        $g1046$ = null;
        $g1047$ = null;
        $g1048$ = null;
        $g1049$ = null;
        $ic0$ = makeSymbol("S#5682", "CYC");
        $ic1$ = ConsesLow.list((SubLObject)makeSymbol("S#5681", "CYC"));
        $ic2$ = makeString("Idle");
        $ic3$ = makeString("Sleep");
        $ic4$ = makeString("wait");
        $ic5$ = makeString("blocked");
        $ic6$ = makeString("run");
        $ic7$ = makeSymbol("S#5671", "CYC");
        $ic8$ = makeSymbol("S#5672", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("S#104", "CYC"), (SubLObject)makeSymbol("S#5844", "CYC"));
        $ic10$ = ConsesLow.list((SubLObject)makeKeyword("PROCESS"), (SubLObject)makeKeyword("COMPLETED"));
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("S#5688", "CYC"), (SubLObject)makeSymbol("S#5689", "CYC"));
        $ic12$ = ConsesLow.list((SubLObject)makeSymbol("S#5690", "CYC"), (SubLObject)makeSymbol("S#5691", "CYC"));
        $ic13$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic14$ = makeSymbol("S#5687", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#5672", "CYC"));
        $ic16$ = makeSymbol("S#5688", "CYC");
        $ic17$ = makeSymbol("S#5690", "CYC");
        $ic18$ = makeSymbol("S#5689", "CYC");
        $ic19$ = makeSymbol("S#5691", "CYC");
        $ic20$ = makeKeyword("PROCESS");
        $ic21$ = makeKeyword("COMPLETED");
        $ic22$ = makeString("Invalid slot ~S for construction function");
        $ic23$ = makeKeyword("BEGIN");
        $ic24$ = makeSymbol("S#5692", "CYC");
        $ic25$ = makeKeyword("SLOT");
        $ic26$ = makeKeyword("END");
        $ic27$ = makeSymbol("S#5694", "CYC");
        $ic28$ = makeSymbol("SYMBOL-NAME");
        $ic29$ = makeSymbol("CAR");
        $ic30$ = makeSymbol("CADR");
        $ic31$ = makeSymbol("S#5696", "CYC");
        $ic32$ = makeSymbol("FIND-SYMBOL");
        $ic33$ = makeSymbol("S#5673", "CYC");
        $ic34$ = makeSymbol("S#5674", "CYC");
        $ic35$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#672", "CYC"), makeSymbol("S#5845", "CYC"), makeSymbol("S#29", "CYC"), makeSymbol("S#5846", "CYC"), makeSymbol("S#130", "CYC"), makeSymbol("S#5847", "CYC"), makeSymbol("S#5848", "CYC"), makeSymbol("S#5849", "CYC"), makeSymbol("S#5850", "CYC"), makeSymbol("S#3267", "CYC"), makeSymbol("S#5851", "CYC"), makeSymbol("S#5852", "CYC") });
        $ic36$ = ConsesLow.list(new SubLObject[] { makeKeyword("LOCK"), makeKeyword("THREAD"), makeKeyword("NAME"), makeKeyword("STATUS"), makeKeyword("PROGRESS-MESSAGE"), makeKeyword("PROGRESS-SOFAR"), makeKeyword("PROGRESS-TOTAL"), makeKeyword("START-TIME"), makeKeyword("FINISH-TIME"), makeKeyword("RESULT"), makeKeyword("ERROR-MESSAGE"), makeKeyword("PROPERTIES") });
        $ic37$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#5698", "CYC"), makeSymbol("S#5699", "CYC"), makeSymbol("S#5700", "CYC"), makeSymbol("S#5701", "CYC"), makeSymbol("S#5702", "CYC"), makeSymbol("S#5703", "CYC"), makeSymbol("S#5704", "CYC"), makeSymbol("S#5705", "CYC"), makeSymbol("S#5706", "CYC"), makeSymbol("S#5707", "CYC"), makeSymbol("S#5708", "CYC"), makeSymbol("S#5709", "CYC") });
        $ic38$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#5710", "CYC"), makeSymbol("S#5711", "CYC"), makeSymbol("S#5712", "CYC"), makeSymbol("S#5713", "CYC"), makeSymbol("S#5714", "CYC"), makeSymbol("S#5715", "CYC"), makeSymbol("S#5716", "CYC"), makeSymbol("S#5717", "CYC"), makeSymbol("S#5718", "CYC"), makeSymbol("S#5719", "CYC"), makeSymbol("S#5720", "CYC"), makeSymbol("S#5721", "CYC") });
        $ic39$ = makeSymbol("S#5697", "CYC");
        $ic40$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#5674", "CYC"));
        $ic41$ = makeSymbol("S#5698", "CYC");
        $ic42$ = makeSymbol("S#5710", "CYC");
        $ic43$ = makeSymbol("S#5699", "CYC");
        $ic44$ = makeSymbol("S#5711", "CYC");
        $ic45$ = makeSymbol("S#5700", "CYC");
        $ic46$ = makeSymbol("S#5712", "CYC");
        $ic47$ = makeSymbol("S#5701", "CYC");
        $ic48$ = makeSymbol("S#5713", "CYC");
        $ic49$ = makeSymbol("S#5702", "CYC");
        $ic50$ = makeSymbol("S#5714", "CYC");
        $ic51$ = makeSymbol("S#5703", "CYC");
        $ic52$ = makeSymbol("S#5715", "CYC");
        $ic53$ = makeSymbol("S#5704", "CYC");
        $ic54$ = makeSymbol("S#5716", "CYC");
        $ic55$ = makeSymbol("S#5705", "CYC");
        $ic56$ = makeSymbol("S#5717", "CYC");
        $ic57$ = makeSymbol("S#5706", "CYC");
        $ic58$ = makeSymbol("S#5718", "CYC");
        $ic59$ = makeSymbol("S#5707", "CYC");
        $ic60$ = makeSymbol("S#5719", "CYC");
        $ic61$ = makeSymbol("S#5708", "CYC");
        $ic62$ = makeSymbol("S#5720", "CYC");
        $ic63$ = makeSymbol("S#5709", "CYC");
        $ic64$ = makeSymbol("S#5721", "CYC");
        $ic65$ = makeKeyword("LOCK");
        $ic66$ = makeKeyword("THREAD");
        $ic67$ = makeKeyword("NAME");
        $ic68$ = makeKeyword("STATUS");
        $ic69$ = makeKeyword("PROGRESS-MESSAGE");
        $ic70$ = makeKeyword("PROGRESS-SOFAR");
        $ic71$ = makeKeyword("PROGRESS-TOTAL");
        $ic72$ = makeKeyword("START-TIME");
        $ic73$ = makeKeyword("FINISH-TIME");
        $ic74$ = makeKeyword("RESULT");
        $ic75$ = makeKeyword("ERROR-MESSAGE");
        $ic76$ = makeKeyword("PROPERTIES");
        $ic77$ = makeSymbol("S#5722", "CYC");
        $ic78$ = makeSymbol("S#5724", "CYC");
        $ic79$ = makeSymbol("STRINGP");
        $ic80$ = makeSymbol("S#748", "CYC");
        $ic81$ = makeKeyword("NONE");
        $ic82$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#5853", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic83$ = makeUninternedSymbol("US#73E60D8");
        $ic84$ = makeSymbol("CLET");
        $ic85$ = makeSymbol("S#5738", "CYC");
        $ic86$ = makeSymbol("WITH-LOCK-HELD");
        $ic87$ = makeSymbol("PROCESSP");
        $ic88$ = makeSymbol("KEYWORDP");
        $ic89$ = makeSymbol("INTEGERP");
        $ic90$ = makeSymbol("S#4951", "CYC");
        $ic91$ = makeSymbol("FUNCTION-SPEC-P");
        $ic92$ = makeSymbol("LISTP");
        $ic93$ = makeSymbol("S#5753", "CYC");
        $ic94$ = makeKeyword("STARTED");
        $ic95$ = makeKeyword("STOPPED");
        $ic96$ = makeString("CYC");
        $ic97$ = makeSymbol("S#38", "CYC");
        $ic98$ = makeKeyword("RUNNING");
        $ic99$ = makeString("Function ~A in thread ~A terminated by uncaught THROW.");
        $ic100$ = makeKeyword("ERROR");
        $ic101$ = makeKeyword("FINISHED");
        $ic102$ = makeSymbol("S#5675", "CYC");
        $ic103$ = makeSymbol("S#5676", "CYC");
        $ic104$ = ConsesLow.list((SubLObject)makeSymbol("S#672", "CYC"), (SubLObject)makeSymbol("S#5854", "CYC"), (SubLObject)makeSymbol("S#5855", "CYC"));
        $ic105$ = ConsesLow.list((SubLObject)makeKeyword("LOCK"), (SubLObject)makeKeyword("SEMAPHORE"), (SubLObject)makeKeyword("DATA-QUEUE"));
        $ic106$ = ConsesLow.list((SubLObject)makeSymbol("S#5757", "CYC"), (SubLObject)makeSymbol("S#5758", "CYC"), (SubLObject)makeSymbol("S#5759", "CYC"));
        $ic107$ = ConsesLow.list((SubLObject)makeSymbol("S#5760", "CYC"), (SubLObject)makeSymbol("S#5761", "CYC"), (SubLObject)makeSymbol("S#5762", "CYC"));
        $ic108$ = makeSymbol("S#5756", "CYC");
        $ic109$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#5676", "CYC"));
        $ic110$ = makeSymbol("S#5757", "CYC");
        $ic111$ = makeSymbol("S#5760", "CYC");
        $ic112$ = makeSymbol("S#5758", "CYC");
        $ic113$ = makeSymbol("S#5761", "CYC");
        $ic114$ = makeSymbol("S#5759", "CYC");
        $ic115$ = makeSymbol("S#5762", "CYC");
        $ic116$ = makeKeyword("SEMAPHORE");
        $ic117$ = makeKeyword("DATA-QUEUE");
        $ic118$ = makeSymbol("S#5763", "CYC");
        $ic119$ = makeSymbol("S#5765", "CYC");
        $ic120$ = makeString("Lock for Queue ");
        $ic121$ = makeInteger(100);
        $ic122$ = makeSymbol("POSITIVE-INTEGER-P");
        $ic123$ = (SubLFloat)makeDouble(0.01);
        $ic124$ = makeSymbol("S#5677", "CYC");
        $ic125$ = makeSymbol("S#5678", "CYC");
        $ic126$ = ConsesLow.list((SubLObject)makeSymbol("S#672", "CYC"), (SubLObject)makeSymbol("S#5856", "CYC"), (SubLObject)makeSymbol("S#5857", "CYC"), (SubLObject)makeSymbol("S#5858", "CYC"));
        $ic127$ = ConsesLow.list((SubLObject)makeKeyword("LOCK"), (SubLObject)makeKeyword("PRODUCER-ISG"), (SubLObject)makeKeyword("CONSUMER-ISG"), (SubLObject)makeKeyword("PAYLOAD"));
        $ic128$ = ConsesLow.list((SubLObject)makeSymbol("S#5774", "CYC"), (SubLObject)makeSymbol("S#5775", "CYC"), (SubLObject)makeSymbol("S#5776", "CYC"), (SubLObject)makeSymbol("S#5777", "CYC"));
        $ic129$ = ConsesLow.list((SubLObject)makeSymbol("S#5778", "CYC"), (SubLObject)makeSymbol("S#5779", "CYC"), (SubLObject)makeSymbol("S#5780", "CYC"), (SubLObject)makeSymbol("S#5781", "CYC"));
        $ic130$ = makeSymbol("S#5773", "CYC");
        $ic131$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#5678", "CYC"));
        $ic132$ = makeSymbol("S#5774", "CYC");
        $ic133$ = makeSymbol("S#5778", "CYC");
        $ic134$ = makeSymbol("S#5775", "CYC");
        $ic135$ = makeSymbol("S#5779", "CYC");
        $ic136$ = makeSymbol("S#5776", "CYC");
        $ic137$ = makeSymbol("S#5780", "CYC");
        $ic138$ = makeSymbol("S#5777", "CYC");
        $ic139$ = makeSymbol("S#5781", "CYC");
        $ic140$ = makeKeyword("PRODUCER-ISG");
        $ic141$ = makeKeyword("CONSUMER-ISG");
        $ic142$ = makeKeyword("PAYLOAD");
        $ic143$ = makeSymbol("S#5782", "CYC");
        $ic144$ = makeSymbol("S#5784", "CYC");
        $ic145$ = makeString("empty ordered IPC queue entry");
        $ic146$ = makeString("Lock for Ordered IPC Queue ");
        $ic147$ = makeString("Unexpected entry ~A in the payload of ordered IPC queue ~A: expected nothing or waiting process.");
        $ic148$ = makeSymbol("KILL-PROCESS-NAMED");
        $ic149$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"));
        $ic150$ = makeString("@param NAME; stringp\n   Kills any process having the given process name. Note\n   that kill-process is not yet supported on Win32.");
        $ic151$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("STRINGP")));
        $ic152$ = ConsesLow.list((SubLObject)NIL);
        $ic153$ = makeSymbol("S#5791", "CYC");
        $ic154$ = makeSymbol("S#5793", "CYC");
        $ic155$ = makeSymbol("S#5792", "CYC");
        $ic156$ = makeSymbol("S#5795", "CYC");
        $ic157$ = makeSymbol("MAKE-LOCK");
        $ic158$ = makeSymbol("S#5679", "CYC");
        $ic159$ = makeSymbol("S#5680", "CYC");
        $ic160$ = ConsesLow.list((SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)makeSymbol("S#104", "CYC"), (SubLObject)makeSymbol("S#3266", "CYC"), (SubLObject)makeSymbol("S#672", "CYC"), (SubLObject)makeSymbol("S#138", "CYC"));
        $ic161$ = ConsesLow.list((SubLObject)makeKeyword("ID"), (SubLObject)makeKeyword("PROCESS"), (SubLObject)makeKeyword("STATE"), (SubLObject)makeKeyword("LOCK"), (SubLObject)makeKeyword("PLIST"));
        $ic162$ = ConsesLow.list((SubLObject)makeSymbol("S#5798", "CYC"), (SubLObject)makeSymbol("S#5799", "CYC"), (SubLObject)makeSymbol("S#5800", "CYC"), (SubLObject)makeSymbol("S#5801", "CYC"), (SubLObject)makeSymbol("S#5802", "CYC"));
        $ic163$ = ConsesLow.list((SubLObject)makeSymbol("S#5803", "CYC"), (SubLObject)makeSymbol("S#5804", "CYC"), (SubLObject)makeSymbol("S#5805", "CYC"), (SubLObject)makeSymbol("S#5806", "CYC"), (SubLObject)makeSymbol("S#5807", "CYC"));
        $ic164$ = makeSymbol("S#5797", "CYC");
        $ic165$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#5680", "CYC"));
        $ic166$ = makeSymbol("S#5798", "CYC");
        $ic167$ = makeSymbol("S#5803", "CYC");
        $ic168$ = makeSymbol("S#5799", "CYC");
        $ic169$ = makeSymbol("S#5804", "CYC");
        $ic170$ = makeSymbol("S#5800", "CYC");
        $ic171$ = makeSymbol("S#5805", "CYC");
        $ic172$ = makeSymbol("S#5801", "CYC");
        $ic173$ = makeSymbol("S#5806", "CYC");
        $ic174$ = makeSymbol("S#5802", "CYC");
        $ic175$ = makeSymbol("S#5807", "CYC");
        $ic176$ = makeKeyword("ID");
        $ic177$ = makeKeyword("STATE");
        $ic178$ = makeKeyword("PLIST");
        $ic179$ = makeSymbol("S#5808", "CYC");
        $ic180$ = makeSymbol("S#5810", "CYC");
        $ic181$ = makeSymbol("S#5843", "CYC");
        $ic182$ = makeKeyword("STARTING");
        $ic183$ = makeSymbol("S#5812", "CYC");
        $ic184$ = makeKeyword("ABORTED");
        $ic185$ = makeKeyword("PAUSING");
        $ic186$ = makeKeyword("PAUSED");
        $ic187$ = makeSymbol("S#5832", "CYC");
        $ic188$ = makeSymbol("DOUBLE-FLOAT");
        $ic189$ = makeSymbol("S#5859", "CYC");
        $ic190$ = makeSymbol("S#5834", "CYC");
        $ic191$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#105", "CYC"));
    }
    
    public static final class $sX5671_native extends SubLStructNative
    {
        public SubLObject $process;
        public SubLObject $completed;
        public static final SubLStructDeclNative structDecl;
        
        public $sX5671_native() {
            this.$process = (SubLObject)CommonSymbols.NIL;
            this.$completed = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$process;
        }
        
        public SubLObject getField3() {
            return this.$completed;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$process = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$completed = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX5671_native.class, $ic7$, $ic8$, $ic9$, $ic10$, new String[] { "$process", "$completed" }, $ic11$, $ic12$, $ic13$);
        }
    }
    
    public static final class $f4201$UnaryFunction extends UnaryFunction
    {
        public $f4201$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5672"));
        }
        
        public SubLObject processItem(final SubLObject var6) {
            return f4201(var6);
        }
    }
    
    public static final class $sX5673_native extends SubLStructNative
    {
        public SubLObject $lock;
        public SubLObject $thread;
        public SubLObject $name;
        public SubLObject $status;
        public SubLObject $progress_message;
        public SubLObject $progress_sofar;
        public SubLObject $progress_total;
        public SubLObject $start_time;
        public SubLObject $finish_time;
        public SubLObject $result;
        public SubLObject $error_message;
        public SubLObject $properties;
        public static final SubLStructDeclNative structDecl;
        
        public $sX5673_native() {
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$thread = (SubLObject)CommonSymbols.NIL;
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$status = (SubLObject)CommonSymbols.NIL;
            this.$progress_message = (SubLObject)CommonSymbols.NIL;
            this.$progress_sofar = (SubLObject)CommonSymbols.NIL;
            this.$progress_total = (SubLObject)CommonSymbols.NIL;
            this.$start_time = (SubLObject)CommonSymbols.NIL;
            this.$finish_time = (SubLObject)CommonSymbols.NIL;
            this.$result = (SubLObject)CommonSymbols.NIL;
            this.$error_message = (SubLObject)CommonSymbols.NIL;
            this.$properties = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$lock;
        }
        
        public SubLObject getField3() {
            return this.$thread;
        }
        
        public SubLObject getField4() {
            return this.$name;
        }
        
        public SubLObject getField5() {
            return this.$status;
        }
        
        public SubLObject getField6() {
            return this.$progress_message;
        }
        
        public SubLObject getField7() {
            return this.$progress_sofar;
        }
        
        public SubLObject getField8() {
            return this.$progress_total;
        }
        
        public SubLObject getField9() {
            return this.$start_time;
        }
        
        public SubLObject getField10() {
            return this.$finish_time;
        }
        
        public SubLObject getField11() {
            return this.$result;
        }
        
        public SubLObject getField12() {
            return this.$error_message;
        }
        
        public SubLObject getField13() {
            return this.$properties;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$thread = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$status = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$progress_message = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$progress_sofar = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$progress_total = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$start_time = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$finish_time = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$result = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$error_message = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$properties = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX5673_native.class, $ic33$, $ic34$, $ic35$, $ic36$, new String[] { "$lock", "$thread", "$name", "$status", "$progress_message", "$progress_sofar", "$progress_total", "$start_time", "$finish_time", "$result", "$error_message", "$properties" }, $ic37$, $ic38$, $ic13$);
        }
    }
    
    public static final class $f4212$UnaryFunction extends UnaryFunction
    {
        public $f4212$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5674"));
        }
        
        public SubLObject processItem(final SubLObject var6) {
            return f4212(var6);
        }
    }
    
    public static final class $sX5675_native extends SubLStructNative
    {
        public SubLObject $lock;
        public SubLObject $semaphore;
        public SubLObject $data_queue;
        public static final SubLStructDeclNative structDecl;
        
        public $sX5675_native() {
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$semaphore = (SubLObject)CommonSymbols.NIL;
            this.$data_queue = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$lock;
        }
        
        public SubLObject getField3() {
            return this.$semaphore;
        }
        
        public SubLObject getField4() {
            return this.$data_queue;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$semaphore = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$data_queue = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX5675_native.class, $ic102$, $ic103$, $ic104$, $ic105$, new String[] { "$lock", "$semaphore", "$data_queue" }, $ic106$, $ic107$, $ic13$);
        }
    }
    
    public static final class $f4273$UnaryFunction extends UnaryFunction
    {
        public $f4273$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5676"));
        }
        
        public SubLObject processItem(final SubLObject var6) {
            return f4273(var6);
        }
    }
    
    public static final class $sX5677_native extends SubLStructNative
    {
        public SubLObject $lock;
        public SubLObject $producer_isg;
        public SubLObject $consumer_isg;
        public SubLObject $payload;
        public static final SubLStructDeclNative structDecl;
        
        public $sX5677_native() {
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$producer_isg = (SubLObject)CommonSymbols.NIL;
            this.$consumer_isg = (SubLObject)CommonSymbols.NIL;
            this.$payload = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$lock;
        }
        
        public SubLObject getField3() {
            return this.$producer_isg;
        }
        
        public SubLObject getField4() {
            return this.$consumer_isg;
        }
        
        public SubLObject getField5() {
            return this.$payload;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$producer_isg = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$consumer_isg = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$payload = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX5677_native.class, $ic124$, $ic125$, $ic126$, $ic127$, new String[] { "$lock", "$producer_isg", "$consumer_isg", "$payload" }, $ic128$, $ic129$, $ic13$);
        }
    }
    
    public static final class $f4291$UnaryFunction extends UnaryFunction
    {
        public $f4291$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5678"));
        }
        
        public SubLObject processItem(final SubLObject var6) {
            return f4291(var6);
        }
    }
    
    public static final class $sX5679_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $process;
        public SubLObject $state;
        public SubLObject $lock;
        public SubLObject $plist;
        public static final SubLStructDeclNative structDecl;
        
        public $sX5679_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$process = (SubLObject)CommonSymbols.NIL;
            this.$state = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$plist = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$process;
        }
        
        public SubLObject getField4() {
            return this.$state;
        }
        
        public SubLObject getField5() {
            return this.$lock;
        }
        
        public SubLObject getField6() {
            return this.$plist;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$process = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$state = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$plist = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX5679_native.class, $ic158$, $ic159$, $ic160$, $ic161$, new String[] { "$id", "$process", "$state", "$lock", "$plist" }, $ic162$, $ic163$, $ic13$);
        }
    }
    
    public static final class $f4317$UnaryFunction extends UnaryFunction
    {
        public $f4317$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5680"));
        }
        
        public SubLObject processItem(final SubLObject var6) {
            return f4317(var6);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 632 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/