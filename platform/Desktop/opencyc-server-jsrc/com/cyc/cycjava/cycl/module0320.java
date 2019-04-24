package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
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

public final class module0320 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0320";
    public static final String myFingerPrint = "64421200227de974a87fbe1219eb97d0c0636c7294525ea6d76d8c42f109ddd5";
    public static SubLSymbol $g2814$;
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
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLList $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
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
    private static final SubLList $ic67$;
    private static final SubLList $ic68$;
    private static final SubLObject $ic69$;
    private static final SubLObject $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLObject $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLString $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLString $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLSymbol $ic89$;
    
    public static SubLObject f21559(final SubLObject var1, final SubLObject var2) {
        f21560(var1, var2, (SubLObject)module0320.ZERO_INTEGER);
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21561(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX24106_native.class) ? module0320.T : module0320.NIL);
    }
    
    public static SubLObject f21562(final SubLObject var1) {
        assert module0320.NIL != f21561(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f21563(final SubLObject var1) {
        assert module0320.NIL != f21561(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f21564(final SubLObject var1) {
        assert module0320.NIL != f21561(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f21565(final SubLObject var1) {
        assert module0320.NIL != f21561(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f21566(final SubLObject var1) {
        assert module0320.NIL != f21561(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f21567(final SubLObject var1, final SubLObject var4) {
        assert module0320.NIL != f21561(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f21568(final SubLObject var1, final SubLObject var4) {
        assert module0320.NIL != f21561(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f21569(final SubLObject var1, final SubLObject var4) {
        assert module0320.NIL != f21561(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f21570(final SubLObject var1, final SubLObject var4) {
        assert module0320.NIL != f21561(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f21571(final SubLObject var1, final SubLObject var4) {
        assert module0320.NIL != f21561(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f21572(SubLObject var5) {
        if (var5 == module0320.UNPROVIDED) {
            var5 = (SubLObject)module0320.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX24106_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0320.NIL, var7 = var5; module0320.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0320.$ic19$)) {
                f21567(var6, var9);
            }
            else if (var10.eql((SubLObject)module0320.$ic20$)) {
                f21568(var6, var9);
            }
            else if (var10.eql((SubLObject)module0320.$ic21$)) {
                f21569(var6, var9);
            }
            else if (var10.eql((SubLObject)module0320.$ic22$)) {
                f21570(var6, var9);
            }
            else if (var10.eql((SubLObject)module0320.$ic23$)) {
                f21571(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0320.$ic24$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f21573(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0320.$ic25$, (SubLObject)module0320.$ic26$, (SubLObject)module0320.FIVE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0320.$ic27$, (SubLObject)module0320.$ic19$, f21562(var11));
        Functions.funcall(var12, var11, (SubLObject)module0320.$ic27$, (SubLObject)module0320.$ic20$, f21563(var11));
        Functions.funcall(var12, var11, (SubLObject)module0320.$ic27$, (SubLObject)module0320.$ic21$, f21564(var11));
        Functions.funcall(var12, var11, (SubLObject)module0320.$ic27$, (SubLObject)module0320.$ic22$, f21565(var11));
        Functions.funcall(var12, var11, (SubLObject)module0320.$ic27$, (SubLObject)module0320.$ic23$, f21566(var11));
        Functions.funcall(var12, var11, (SubLObject)module0320.$ic28$, (SubLObject)module0320.$ic26$, (SubLObject)module0320.FIVE_INTEGER);
        return var11;
    }
    
    public static SubLObject f21574(final SubLObject var11, final SubLObject var12) {
        return f21573(var11, var12);
    }
    
    public static SubLObject f21560(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0320.NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            f21575(var13, var2);
        }
        else if (module0320.NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)module0320.$ic30$, var2, (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { module0320.$ic31$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var13), new SubLObject[] { module0320.$ic31$, var2, module0320.$ic32$, module0320.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21575(final SubLObject var19, SubLObject var2) {
        if (var2 == module0320.UNPROVIDED) {
            var2 = (SubLObject)module0320.T;
        }
        PrintLow.format(var2, (SubLObject)module0320.$ic33$, var19);
        PrintLow.format(var2, (SubLObject)module0320.$ic34$, f21562(var19));
        PrintLow.format(var2, (SubLObject)module0320.$ic35$, f21563(var19));
        PrintLow.format(var2, (SubLObject)module0320.$ic36$, f21564(var19));
        PrintLow.format(var2, (SubLObject)module0320.$ic37$, f21566(var19));
        SubLObject var20 = (SubLObject)module0320.NIL;
        SubLObject var21 = (SubLObject)module0320.NIL;
        SubLObject var22 = (SubLObject)module0320.NIL;
        var20 = f21565(var19);
        var21 = var20.first();
        for (var22 = (SubLObject)module0320.ZERO_INTEGER; module0320.NIL != var20; var20 = var20.rest(), var21 = var20.first(), var22 = Numbers.add((SubLObject)module0320.ONE_INTEGER, var22)) {
            PrintLow.format(var2, (SubLObject)module0320.$ic38$, var22, var21);
            module0319.f21500(var21, var2);
            PrintLow.format(var2, (SubLObject)module0320.$ic39$);
        }
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21576() {
        return f21572((SubLObject)module0320.UNPROVIDED);
    }
    
    public static SubLObject f21577(final SubLObject var23) {
        final SubLObject var24 = f21572((SubLObject)module0320.UNPROVIDED);
        f21570(var24, var23);
        f21569(var24, module0321.f21687());
        return var24;
    }
    
    public static SubLObject f21578(final SubLObject var19) {
        return f21562(var19);
    }
    
    public static SubLObject f21579(final SubLObject var19) {
        return f21565(var19);
    }
    
    public static SubLObject f21580(final SubLObject var19) {
        return f21566(var19);
    }
    
    public static SubLObject f21581(final SubLObject var19) {
        return f21563(var19);
    }
    
    public static SubLObject f21582(final SubLObject var19) {
        return f21564(var19);
    }
    
    public static SubLObject f21583(final SubLObject var24, final SubLObject var25) {
        SubLObject var27;
        final SubLObject var26 = var27 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)module0320.$ic40$);
        final SubLObject var28 = var27.rest();
        var27 = var27.first();
        SubLObject var29 = (SubLObject)module0320.NIL;
        SubLObject var30 = (SubLObject)module0320.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)module0320.$ic40$);
        var29 = var27.first();
        var27 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)module0320.$ic40$);
        var30 = var27.first();
        var27 = var27.rest();
        if (module0320.NIL == var27) {
            final SubLObject var31;
            var27 = (var31 = var28);
            return (SubLObject)ConsesLow.listS((SubLObject)module0320.$ic41$, (SubLObject)ConsesLow.list(var29, (SubLObject)ConsesLow.list((SubLObject)module0320.$ic42$, var30)), ConsesLow.append(var31, (SubLObject)module0320.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var26, (SubLObject)module0320.$ic40$);
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21584(final SubLObject var24, final SubLObject var25) {
        SubLObject var27;
        final SubLObject var26 = var27 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)module0320.$ic43$);
        final SubLObject var28 = var27.rest();
        var27 = var27.first();
        SubLObject var29 = (SubLObject)module0320.NIL;
        SubLObject var30 = (SubLObject)module0320.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)module0320.$ic43$);
        var29 = var27.first();
        var27 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)module0320.$ic43$);
        var30 = var27.first();
        var27 = var27.rest();
        SubLObject var31 = (SubLObject)module0320.NIL;
        SubLObject var32 = var27;
        SubLObject var33 = (SubLObject)module0320.NIL;
        SubLObject var38_39 = (SubLObject)module0320.NIL;
        while (module0320.NIL != var32) {
            cdestructuring_bind.destructuring_bind_must_consp(var32, var26, (SubLObject)module0320.$ic43$);
            var38_39 = var32.first();
            var32 = var32.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var32, var26, (SubLObject)module0320.$ic43$);
            if (module0320.NIL == conses_high.member(var38_39, (SubLObject)module0320.$ic44$, (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED)) {
                var33 = (SubLObject)module0320.T;
            }
            if (var38_39 == module0320.$ic45$) {
                var31 = var32.first();
            }
            var32 = var32.rest();
        }
        if (module0320.NIL != var33 && module0320.NIL == var31) {
            cdestructuring_bind.cdestructuring_bind_error(var26, (SubLObject)module0320.$ic43$);
        }
        final SubLObject var34 = cdestructuring_bind.property_list_member((SubLObject)module0320.$ic46$, var27);
        final SubLObject var35 = (SubLObject)((module0320.NIL != var34) ? conses_high.cadr(var34) : module0320.NIL);
        final SubLObject var36;
        var27 = (var36 = var28);
        return (SubLObject)ConsesLow.listS((SubLObject)module0320.$ic47$, (SubLObject)ConsesLow.list(var29, (SubLObject)ConsesLow.list((SubLObject)module0320.$ic48$, var30), var35), ConsesLow.append(var36, (SubLObject)module0320.NIL));
    }
    
    public static SubLObject f21585(final SubLObject var24, final SubLObject var25) {
        SubLObject var27;
        final SubLObject var26 = var27 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)module0320.$ic49$);
        final SubLObject var28 = var27.rest();
        var27 = var27.first();
        SubLObject var29 = (SubLObject)module0320.NIL;
        SubLObject var30 = (SubLObject)module0320.NIL;
        SubLObject var31 = (SubLObject)module0320.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)module0320.$ic49$);
        var29 = var27.first();
        var27 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)module0320.$ic49$);
        var30 = var27.first();
        var27 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)module0320.$ic49$);
        var31 = var27.first();
        var27 = var27.rest();
        SubLObject var32 = (SubLObject)module0320.NIL;
        SubLObject var33 = var27;
        SubLObject var34 = (SubLObject)module0320.NIL;
        SubLObject var49_50 = (SubLObject)module0320.NIL;
        while (module0320.NIL != var33) {
            cdestructuring_bind.destructuring_bind_must_consp(var33, var26, (SubLObject)module0320.$ic49$);
            var49_50 = var33.first();
            var33 = var33.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var33, var26, (SubLObject)module0320.$ic49$);
            if (module0320.NIL == conses_high.member(var49_50, (SubLObject)module0320.$ic44$, (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED)) {
                var34 = (SubLObject)module0320.T;
            }
            if (var49_50 == module0320.$ic45$) {
                var32 = var33.first();
            }
            var33 = var33.rest();
        }
        if (module0320.NIL != var34 && module0320.NIL == var32) {
            cdestructuring_bind.cdestructuring_bind_error(var26, (SubLObject)module0320.$ic49$);
        }
        final SubLObject var35 = cdestructuring_bind.property_list_member((SubLObject)module0320.$ic46$, var27);
        final SubLObject var36 = (SubLObject)((module0320.NIL != var35) ? conses_high.cadr(var35) : module0320.NIL);
        final SubLObject var37;
        var27 = (var37 = var28);
        return (SubLObject)ConsesLow.listS((SubLObject)module0320.$ic47$, (SubLObject)ConsesLow.list(var29, (SubLObject)ConsesLow.list((SubLObject)module0320.$ic50$, (SubLObject)ConsesLow.list((SubLObject)module0320.$ic51$, var30, (SubLObject)ConsesLow.list((SubLObject)module0320.$ic48$, var31))), var36), ConsesLow.append(var37, (SubLObject)module0320.NIL));
    }
    
    public static SubLObject f21586(final SubLObject var24, final SubLObject var25) {
        SubLObject var27;
        final SubLObject var26 = var27 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)module0320.$ic52$);
        final SubLObject var28 = var27.rest();
        var27 = var27.first();
        SubLObject var29 = (SubLObject)module0320.NIL;
        SubLObject var30 = (SubLObject)module0320.NIL;
        SubLObject var31 = (SubLObject)module0320.NIL;
        SubLObject var32 = (SubLObject)module0320.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)module0320.$ic52$);
        var29 = var27.first();
        var27 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)module0320.$ic52$);
        var30 = var27.first();
        var27 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)module0320.$ic52$);
        var31 = var27.first();
        var27 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)module0320.$ic52$);
        var32 = var27.first();
        var27 = var27.rest();
        if (module0320.NIL == var27) {
            final SubLObject var33;
            var27 = (var33 = var28);
            final SubLObject var34 = (SubLObject)module0320.$ic53$;
            return (SubLObject)ConsesLow.list((SubLObject)module0320.$ic54$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var34, (SubLObject)ConsesLow.list((SubLObject)module0320.$ic48$, var31), (SubLObject)ConsesLow.list((SubLObject)module0320.$ic50$, var34)), (SubLObject)ConsesLow.list(var29, (SubLObject)ConsesLow.list((SubLObject)module0320.$ic55$, var34), (SubLObject)ConsesLow.list((SubLObject)module0320.$ic55$, var34))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0320.$ic56$, (SubLObject)ConsesLow.list((SubLObject)module0320.$ic57$, var34), var32)), (SubLObject)ConsesLow.list((SubLObject)module0320.$ic58$, (SubLObject)ConsesLow.list((SubLObject)module0320.$ic56$, (SubLObject)ConsesLow.list((SubLObject)module0320.$ic59$, var31, var29), (SubLObject)ConsesLow.list((SubLObject)module0320.$ic60$, var31, var29)), (SubLObject)ConsesLow.list((SubLObject)module0320.$ic61$, var31, var29), (SubLObject)ConsesLow.listS((SubLObject)module0320.$ic62$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var30, (SubLObject)ConsesLow.list((SubLObject)module0320.$ic63$, var29, (SubLObject)ConsesLow.list((SubLObject)module0320.$ic64$, var31)))), ConsesLow.append(var33, (SubLObject)module0320.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var26, (SubLObject)module0320.$ic52$);
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21587(final SubLObject var19) {
        return f21578(var19);
    }
    
    public static SubLObject f21588(final SubLObject var19) {
        return f21579(var19).first();
    }
    
    public static SubLObject f21589(final SubLObject var19) {
        return Types.sublisp_null(f21579(var19));
    }
    
    public static SubLObject f21590(final SubLObject var19, final SubLObject var21) {
        return module0004.f104(var21, f21580(var19), (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED);
    }
    
    public static SubLObject f21591(final SubLObject var19, final SubLObject var21) {
        return module0004.f104(module0319.f21517(var21, f21578(var19)), f21581(var19), (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED);
    }
    
    public static SubLObject f21592(final SubLObject var58, final SubLObject var59) {
        SubLObject var60 = (SubLObject)module0320.NIL;
        if (module0320.NIL == var60) {
            SubLObject var61 = f21579(var59);
            SubLObject var62 = (SubLObject)module0320.NIL;
            var62 = var61.first();
            while (module0320.NIL == var60 && module0320.NIL != var61) {
                SubLObject var63 = (SubLObject)module0320.NIL;
                if (module0320.NIL == var63) {
                    SubLObject var61_64 = f21579(var58);
                    SubLObject var64 = (SubLObject)module0320.NIL;
                    var64 = var61_64.first();
                    while (module0320.NIL == var63 && module0320.NIL != var61_64) {
                        if (module0320.NIL != module0319.f21532(var64, var62, (SubLObject)module0320.UNPROVIDED)) {
                            var63 = (SubLObject)module0320.T;
                        }
                        var61_64 = var61_64.rest();
                        var64 = var61_64.first();
                    }
                }
                if (module0320.NIL == var63) {
                    var60 = (SubLObject)module0320.T;
                }
                var61 = var61.rest();
                var62 = var61.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0320.NIL == var60);
    }
    
    public static SubLObject f21593(final SubLObject var21, final SubLObject var19) {
        SubLObject var22 = (SubLObject)module0320.NIL;
        if (module0320.NIL == var22) {
            SubLObject var23 = f21579(var19);
            SubLObject var24 = (SubLObject)module0320.NIL;
            var24 = var23.first();
            while (module0320.NIL == var22 && module0320.NIL != var23) {
                if (module0320.NIL != module0319.f21532(var24, var21, (SubLObject)module0320.UNPROVIDED)) {
                    var22 = (SubLObject)module0320.T;
                }
                var23 = var23.rest();
                var24 = var23.first();
            }
        }
        return var22;
    }
    
    public static SubLObject f21594(final SubLObject var19, final SubLObject var21) {
        final SubLObject var22 = f21578(var19);
        final SubLObject var23 = module0319.f21517(var21, var22);
        SubLObject var24 = (SubLObject)module0320.NIL;
        if (module0320.NIL == var24) {
            SubLObject var25 = conses_high.member(var21, f21579(var19), (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED).rest();
            SubLObject var26 = (SubLObject)module0320.NIL;
            var26 = var25.first();
            while (module0320.NIL == var24 && module0320.NIL != var25) {
                if (module0319.f21517(var26, var22).numE(var23)) {
                    var24 = (SubLObject)module0320.T;
                }
                var25 = var25.rest();
                var26 = var25.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0320.NIL == var24);
    }
    
    public static SubLObject f21595(final SubLObject var19) {
        return Types.sublisp_null(f21582(var19));
    }
    
    public static SubLObject f21596(final SubLObject var19) {
        final SubLObject var20 = ConsesLow.append(f21581(var19), f21582(var19));
        final SubLObject var21 = module0035.f2220(module0321.f21687(), var20, (SubLObject)module0320.UNPROVIDED);
        return Types.sublisp_null(var21);
    }
    
    public static SubLObject f21597(final SubLObject var19) {
        return Equality.eq(Sequences.length(f21579(var19)), Sequences.length(f21580(var19)));
    }
    
    public static SubLObject f21598(final SubLObject var19) {
        return Types.sublisp_null(module0035.f2220(module0321.f21687(), f21581(var19), (SubLObject)module0320.UNPROVIDED));
    }
    
    public static SubLObject f21599(final SubLObject var19) {
        final SubLObject var20 = f21580(var19);
        final SubLObject var21 = f21581(var19);
        final SubLObject var22 = f21582(var19);
        SubLObject var23 = (SubLObject)module0320.NIL;
        SubLObject var24 = (SubLObject)module0320.NIL;
        SubLObject var25 = (SubLObject)module0320.NIL;
        var24 = f21579(var19);
        var25 = var24.first();
        while (module0320.NIL != var24 && module0320.NIL == var23) {
            if (module0320.NIL == f21590(var19, var25) && module0320.NIL == f21591(var19, var25)) {
                f21600(var19, var25);
                final SubLObject var26 = module0319.f21517(var25, f21578(var19));
                if (module0320.NIL != module0319.f21527(var25)) {
                    var23 = (SubLObject)module0320.T;
                }
            }
            var24 = var24.rest();
            var25 = var24.first();
        }
        f21601(var19, var21, var22, var20);
        return var23;
    }
    
    public static SubLObject f21602(final SubLObject var19, final SubLObject var78) {
        f21567(var19, var78);
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21603(final SubLObject var19, final SubLObject var74) {
        f21568(var19, var74);
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21604(final SubLObject var19, final SubLObject var75) {
        f21569(var19, var75);
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21605(final SubLObject var19, final SubLObject var21) {
        f21570(var19, Sequences.remove(var21, f21565(var19), (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED));
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21606(final SubLObject var19, final SubLObject var23) {
        f21570(var19, var23);
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21607(final SubLObject var21, final SubLObject var19) {
        f21570(var19, (SubLObject)ConsesLow.cons(var21, f21565(var19)));
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21601(final SubLObject var19, final SubLObject var79, final SubLObject var80, final SubLObject var81) {
        f21568(var19, var79);
        f21569(var19, var80);
        f21571(var19, var81);
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21600(final SubLObject var19, final SubLObject var21) {
        f21571(var19, (SubLObject)ConsesLow.cons(var21, f21566(var19)));
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21608(final SubLObject var19, final SubLObject var68) {
        f21569(var19, (SubLObject)ConsesLow.cons(var68, f21564(var19)));
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21609(final SubLObject var19, final SubLObject var68) {
        f21569(var19, Sequences.remove(var68, f21564(var19), (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED));
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21610(final SubLObject var19, final SubLObject var68) {
        f21568(var19, (SubLObject)ConsesLow.cons(var68, f21563(var19)));
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21611(final SubLObject var19, final SubLObject var68) {
        f21568(var19, Sequences.remove(var68, f21563(var19), (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED));
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21612(final SubLObject var19, final SubLObject var82) {
        f21609(var19, var82);
        f21610(var19, var82);
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21613(final SubLObject var19, final SubLObject var82) {
        f21611(var19, var82);
        f21608(var19, var82);
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21614(final SubLObject var19, final SubLObject var21) {
        SubLObject var22 = (SubLObject)module0320.NIL;
        SubLObject var23 = f21579(var19);
        SubLObject var24 = (SubLObject)module0320.NIL;
        var24 = var23.first();
        while (module0320.NIL != var23) {
            if (module0320.NIL == module0319.f21532(var21, var24, (SubLObject)module0320.UNPROVIDED)) {
                var22 = (SubLObject)ConsesLow.cons(var24, var22);
            }
            var23 = var23.rest();
            var24 = var23.first();
        }
        f21606(var19, Sequences.nreverse(var22));
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21615(final SubLObject var19, final SubLObject var84) {
        final SubLObject var85 = f21578(var19);
        SubLObject var86 = f21582(var19);
        SubLObject var87 = (SubLObject)module0320.NIL;
        var87 = var86.first();
        while (module0320.NIL != var86) {
            final SubLObject var88 = module0318.f21429(var87, var85);
            if (module0321.f21688(var87).eql(module0205.f13384(var84, var88, (SubLObject)module0320.UNPROVIDED))) {
                f21612(var19, var87);
            }
            var86 = var86.rest();
            var87 = var86.first();
        }
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21616(final SubLObject var19, final SubLObject var87, final SubLObject var88) {
        final SubLObject var89 = f21576();
        SubLObject var90 = (SubLObject)module0320.NIL;
        SubLObject var91 = f21579(var19);
        SubLObject var92 = (SubLObject)module0320.NIL;
        var92 = var91.first();
        while (module0320.NIL != var91) {
            final SubLObject var93 = module0319.f21502(var92, var88);
            module0319.f21519(var93, var87);
            var90 = (SubLObject)ConsesLow.cons(var93, var90);
            var91 = var91.rest();
            var92 = var91.first();
        }
        f21606(var89, Sequences.nreverse(var90));
        f21603(var89, (SubLObject)module0320.NIL);
        f21604(var89, module0321.f21687());
        f21602(var89, module0141.f9195());
        return var89;
    }
    
    public static SubLObject f21617() {
        final SubLObject var87 = module0321.f21684();
        final SubLObject var88 = (SubLObject)module0320.NIL;
        SubLObject var89 = (SubLObject)module0320.NIL;
        SubLObject var90 = (SubLObject)module0320.NIL;
        final SubLObject var91 = (SubLObject)module0320.NIL;
        SubLObject var92 = module0321.f21687();
        SubLObject var93 = (SubLObject)module0320.NIL;
        var93 = var92.first();
        while (module0320.NIL != var92) {
            final SubLObject var94 = module0321.f21688(var93);
            if (module0320.NIL != module0313.f21137(var94)) {
                var89 = (SubLObject)ConsesLow.cons(module0319.f21501((SubLObject)module0320.NIL, var87, (SubLObject)module0320.NIL, var93, var94, (SubLObject)module0320.NIL, (SubLObject)module0320.$ic65$), var89);
                if (module0320.NIL == module0173.f10955(var94)) {
                    var90 = (SubLObject)ConsesLow.cons(module0319.f21501((SubLObject)module0320.NIL, var87, (SubLObject)module0320.NIL, var93, var94, (SubLObject)module0320.NIL, (SubLObject)module0320.$ic66$), var90);
                }
            }
            else if (module0320.NIL == module0537.f33304(var94)) {
                var90 = (SubLObject)ConsesLow.cons(module0319.f21501((SubLObject)module0320.NIL, var87, (SubLObject)module0320.NIL, var93, var94, (SubLObject)module0320.NIL, (SubLObject)module0320.$ic66$), var90);
            }
            var92 = var92.rest();
            var93 = var92.first();
        }
        return f21577(ConsesLow.nconc(new SubLObject[] { Sequences.nreverse(var88), Sequences.nreverse(var89), Sequences.nreverse(var90), Sequences.nreverse(var91) }));
    }
    
    public static SubLObject f21618(final SubLObject var24, final SubLObject var25) {
        SubLObject var27;
        final SubLObject var26 = var27 = var24.rest();
        SubLObject var28 = (SubLObject)module0320.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)module0320.$ic67$);
        var28 = var27.first();
        final SubLObject var29;
        var27 = (var29 = var27.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0320.$ic62$, (SubLObject)ConsesLow.list(reader.bq_cons(var28, (SubLObject)module0320.$ic68$)), ConsesLow.append(var29, (SubLObject)module0320.NIL));
    }
    
    public static SubLObject f21619() {
        return f21617();
    }
    
    public static SubLObject f21620(final SubLObject var21, final SubLObject var19) {
        final SubLObject var22 = f21588(var19);
        if (module0320.NIL != f21589(var19) || module0320.NIL != module0319.f21531(var21, var22)) {
            f21607(var21, var19);
        }
        else {
            SubLObject var23;
            SubLObject var24;
            for (var23 = (SubLObject)module0320.NIL, var24 = (SubLObject)module0320.NIL, var23 = f21579(var19), var24 = conses_high.second(var23); module0320.NIL != var24 && module0320.NIL == module0319.f21531(var21, var24); var24 = conses_high.second(var23)) {
                var23 = var23.rest();
            }
            ConsesLow.rplacd(var23, (SubLObject)ConsesLow.cons(var21, var23.rest()));
        }
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21621(final SubLObject var19, final SubLObject var68) {
        final SubLObject var69 = f21578(var19);
        final SubLObject var70 = module0318.f21429(var68, var69);
        SubLObject var71 = (SubLObject)module0320.NIL;
        SubLObject var72 = (SubLObject)module0320.NIL;
        if (module0320.NIL == var72) {
            SubLObject var73 = f21579(var19);
            SubLObject var74 = (SubLObject)module0320.NIL;
            var74 = var73.first();
            while (module0320.NIL == var72 && module0320.NIL != var73) {
                if (module0320.NIL != module0319.f21527(var74)) {
                    if (module0319.f21508(var74).numE(var70)) {
                        var71 = var74;
                        var72 = (SubLObject)module0320.T;
                    }
                }
                else {
                    var72 = (SubLObject)module0320.T;
                }
                var73 = var73.rest();
                var74 = var73.first();
            }
        }
        if (module0320.NIL != var71) {
            f21605(var19, var71);
        }
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21622(final SubLObject var87, final SubLObject var19, final SubLObject var88) {
        final SubLObject var89 = f21616(var19, var87, var88);
        final SubLObject var90 = f21578(var89);
        if (module0320.NIL != module0226.f14800(var87)) {
            if (module0320.NIL != module0004.f104((SubLObject)module0320.TWO_INTEGER, module0321.f21687(), (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED) && module0320.NIL != module0318.f21428(var87, module0320.$ic69$, var87, (SubLObject)module0320.TWO_INTEGER, var90)) {
                f21623(var89, module0320.$ic69$, var87, var87, module0318.f21429((SubLObject)module0320.TWO_INTEGER, var90));
            }
            if (module0320.NIL != module0004.f104((SubLObject)module0320.ONE_INTEGER, module0321.f21687(), (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED) && module0320.NIL != module0318.f21428(var87, module0320.$ic70$, var87, (SubLObject)module0320.ONE_INTEGER, var90)) {
                f21623(var89, module0320.$ic70$, var87, var87, module0318.f21429((SubLObject)module0320.ONE_INTEGER, var90));
            }
        }
        SubLObject var91 = module0318.f21423();
        SubLObject var92 = (SubLObject)module0320.NIL;
        var92 = var91.first();
        while (module0320.NIL != var91) {
            SubLObject var93 = module0321.f21687();
            SubLObject var94 = (SubLObject)module0320.NIL;
            var94 = var93.first();
            while (module0320.NIL != var93) {
                SubLObject var85_106 = module0318.f21455(var92, var87, var94, var90);
                SubLObject var95 = (SubLObject)module0320.NIL;
                var95 = var85_106.first();
                while (module0320.NIL != var85_106) {
                    if (module0320.NIL == module0318.f21428(var95, var92, var87, var94, var90)) {
                        return (SubLObject)module0320.NIL;
                    }
                    f21623(var89, var92, var87, var95, var94);
                    var85_106 = var85_106.rest();
                    var95 = var85_106.first();
                }
                var93 = var93.rest();
                var94 = var93.first();
            }
            var91 = var91.rest();
            var92 = var91.first();
        }
        return var89;
    }
    
    public static SubLObject f21623(final SubLObject var19, final SubLObject var105, final SubLObject var87, final SubLObject var107, final SubLObject var68) {
        final SubLObject var108 = f21578(var19);
        final SubLObject var109 = module0318.f21429(var68, var108);
        final SubLObject var110 = module0319.f21535(var105, var107, module0321.f21688(var68), var109);
        final SubLObject var111 = module0321.f21688(var68);
        final SubLObject var112 = module0319.f21501(var105, var87, var107, var109, var111, (SubLObject)module0320.NIL, var110);
        if (module0320.NIL != var110 && module0320.NIL != var105 && module0320.NIL == f21593(var112, var19)) {
            f21621(var19, var68);
            f21614(var19, var112);
            module0319.f21522(var112, var68);
            if (module0320.NIL != module0319.f21524(var112)) {
                f21620(var112, var19);
            }
        }
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21624(final SubLObject var110, final SubLObject var84, final SubLObject var111) {
        if (module0320.NIL == module0321.f21693()) {
            return var110;
        }
        final SubLObject var112 = (SubLObject)((module0320.NIL != module0174.f11035(var84)) ? var84 : module0320.NIL);
        return (SubLObject)ConsesLow.list(var110.first(), (SubLObject)ConsesLow.cons(var112, conses_high.second(var110)));
    }
    
    public static SubLObject f21625(final SubLObject var110, final SubLObject var21, final SubLObject var84, final SubLObject var82, final SubLObject var111) {
        if (module0320.NIL == module0321.f21693()) {
            return var110;
        }
        final SubLObject var112 = module0205.f13134(var84, SubLObjectFactory.makeBoolean(module0320.NIL == module0141.f9195()).eql((SubLObject)SubLObjectFactory.makeBoolean(module0320.NIL == module0319.f21507(var21))) ? var82 : module0107.f7613(var82), (SubLObject)module0320.UNPROVIDED);
        final SubLObject var113 = module0319.f21549(var21, var112, conses_high.second(var110));
        final SubLObject var114 = (SubLObject)ConsesLow.list(var110.first(), var113);
        return f21624(var114, var84, var111);
    }
    
    public static SubLObject f21626(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        SubLObject var21 = (SubLObject)module0320.NIL;
        SubLObject var22 = (SubLObject)module0320.NIL;
        SubLObject var23 = (SubLObject)module0320.NIL;
        SubLObject var24 = (SubLObject)module0320.NIL;
        var23 = f21579(var19);
        var24 = var23.first();
        while (module0320.NIL != var23 && module0320.NIL == var21) {
            if (module0320.NIL == f21590(var19, var24) && module0320.NIL == f21591(var19, var24)) {
                f21600(var19, var24);
                final SubLObject var25 = module0319.f21517(var24, f21578(var19));
                f21612(var19, var25);
                if (module0320.NIL == f21596(var19)) {
                    var21 = (SubLObject)module0320.T;
                }
                else if (module0320.NIL != module0319.f21527(var24)) {
                    final SubLObject var26 = module0319.f21508(var24);
                    final SubLObject var27 = module0319.f21509(var24);
                    final SubLObject var28 = module0319.f21479(var24);
                    final SubLObject var29 = (SubLObject)module0320.NIL;
                    final SubLObject var30 = var28;
                    if (module0320.NIL != module0158.f10010(var27, var26, var30)) {
                        final SubLObject var31 = module0158.f10011(var27, var26, var30);
                        SubLObject var32 = var21;
                        final SubLObject var33 = (SubLObject)module0320.NIL;
                        while (module0320.NIL == var32) {
                            final SubLObject var34 = module0052.f3695(var31, var33);
                            final SubLObject var35 = (SubLObject)SubLObjectFactory.makeBoolean(!var33.eql(var34));
                            if (module0320.NIL != var35) {
                                SubLObject var36 = (SubLObject)module0320.NIL;
                                try {
                                    var36 = module0158.f10316(var34, (SubLObject)module0320.$ic71$, (SubLObject)module0320.$ic72$, (SubLObject)module0320.NIL);
                                    SubLObject var120_125 = var21;
                                    final SubLObject var121_126 = (SubLObject)module0320.NIL;
                                    while (module0320.NIL == var120_125) {
                                        final SubLObject var37 = module0052.f3695(var36, var121_126);
                                        final SubLObject var123_127 = (SubLObject)SubLObjectFactory.makeBoolean(!var121_126.eql(var37));
                                        if (module0320.NIL != var123_127) {
                                            var20.resetMultipleValues();
                                            SubLObject var38 = f21627(var37, var19);
                                            final SubLObject var39 = var20.secondMultipleValue();
                                            var20.resetMultipleValues();
                                            var21 = var39;
                                            if (module0320.NIL != var38) {
                                                var38 = f21624(var38, var37, var29);
                                                var22 = (SubLObject)ConsesLow.cons(var38, var22);
                                            }
                                        }
                                        var120_125 = (SubLObject)SubLObjectFactory.makeBoolean(module0320.NIL == var123_127 || module0320.NIL != var21);
                                    }
                                }
                                finally {
                                    final SubLObject var40 = Threads.$is_thread_performing_cleanupP$.currentBinding(var20);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0320.T, var20);
                                        if (module0320.NIL != var36) {
                                            module0158.f10319(var36);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var40, var20);
                                    }
                                }
                            }
                            var32 = (SubLObject)SubLObjectFactory.makeBoolean(module0320.NIL == var35 || module0320.NIL != var21);
                        }
                    }
                }
                else if (module0320.NIL != module0319.f21528(var24)) {
                    final SubLObject var41 = module0319.f21508(var24);
                    final SubLObject var42 = module0319.f21479(var24);
                    if (module0320.NIL == var21) {
                        SubLObject var43 = (SubLObject)module0320.NIL;
                        try {
                            var20.throwStack.push(module0320.$ic73$);
                            final SubLObject var44 = module0319.f21512(var24);
                            SubLObject var45 = (SubLObject)module0320.NIL;
                            SubLObject var46 = (SubLObject)module0320.NIL;
                            final Iterator var47 = Hashtables.getEntrySetIterator(var44);
                            try {
                                while (Hashtables.iteratorHasNext(var47)) {
                                    final Map.Entry var48 = Hashtables.iteratorNextEntry(var47);
                                    var45 = Hashtables.getEntryKey(var48);
                                    var46 = Hashtables.getEntryValue(var48);
                                    module0005.f153(var21);
                                    final SubLObject var49 = (SubLObject)module0320.NIL;
                                    final SubLObject var50 = var42;
                                    if (module0320.NIL != module0158.f10010(var45, var41, var50)) {
                                        final SubLObject var51 = module0158.f10011(var45, var41, var50);
                                        SubLObject var52 = var21;
                                        final SubLObject var53 = (SubLObject)module0320.NIL;
                                        while (module0320.NIL == var52) {
                                            final SubLObject var54 = module0052.f3695(var51, var53);
                                            final SubLObject var55 = (SubLObject)SubLObjectFactory.makeBoolean(!var53.eql(var54));
                                            if (module0320.NIL != var55) {
                                                SubLObject var56 = (SubLObject)module0320.NIL;
                                                try {
                                                    var56 = module0158.f10316(var54, (SubLObject)module0320.$ic71$, (SubLObject)module0320.$ic72$, (SubLObject)module0320.NIL);
                                                    SubLObject var120_126 = var21;
                                                    final SubLObject var121_127 = (SubLObject)module0320.NIL;
                                                    while (module0320.NIL == var120_126) {
                                                        final SubLObject var57 = module0052.f3695(var56, var121_127);
                                                        final SubLObject var123_128 = (SubLObject)SubLObjectFactory.makeBoolean(!var121_127.eql(var57));
                                                        if (module0320.NIL != var123_128) {
                                                            var20.resetMultipleValues();
                                                            SubLObject var58 = f21627(var57, var19);
                                                            final SubLObject var59 = var20.secondMultipleValue();
                                                            var20.resetMultipleValues();
                                                            var21 = var59;
                                                            if (module0320.NIL != var58) {
                                                                var58 = f21625(var58, var24, var57, var25, var49);
                                                                var22 = (SubLObject)ConsesLow.cons(var58, var22);
                                                            }
                                                        }
                                                        var120_126 = (SubLObject)SubLObjectFactory.makeBoolean(module0320.NIL == var123_128 || module0320.NIL != var21);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var60 = Threads.$is_thread_performing_cleanupP$.currentBinding(var20);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0320.T, var20);
                                                        if (module0320.NIL != var56) {
                                                            module0158.f10319(var56);
                                                        }
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var60, var20);
                                                    }
                                                }
                                            }
                                            var52 = (SubLObject)SubLObjectFactory.makeBoolean(module0320.NIL == var55 || module0320.NIL != var21);
                                        }
                                    }
                                }
                            }
                            finally {
                                Hashtables.releaseEntrySetIterator(var47);
                            }
                        }
                        catch (Throwable var61) {
                            var43 = Errors.handleThrowable(var61, (SubLObject)module0320.$ic73$);
                        }
                        finally {
                            var20.throwStack.pop();
                        }
                    }
                }
                else if (module0320.NIL != module0319.f21529(var24)) {
                    final SubLObject var62 = module0319.f21509(var24);
                    final SubLObject var63 = module0319.f21505(var24);
                    final SubLObject var64 = module0318.f21460(module0319.f21503(var24));
                    final SubLObject var65 = module0319.f21508(var24);
                    final SubLObject var66 = module0319.f21479(var24);
                    if (var63.eql(module0320.$ic74$)) {
                        final SubLObject var67 = module0137.f8955(var63);
                        if (module0320.NIL == var21) {
                            final SubLObject var68 = var62;
                            final SubLObject var69 = (SubLObject)((module0320.$ic75$ == module0320.$ic75$) ? module0320.$ic76$ : module0320.$ic77$);
                            final SubLObject var70 = module0056.f4145(var69);
                            SubLObject var71 = (SubLObject)module0320.NIL;
                            final SubLObject var72 = module0139.$g1635$.currentBinding(var20);
                            try {
                                module0139.$g1635$.bind(module0139.f9007(), var20);
                                final SubLObject var73 = (SubLObject)module0320.NIL;
                                final SubLObject var129_153 = module0141.$g1714$.currentBinding(var20);
                                final SubLObject var74 = module0141.$g1715$.currentBinding(var20);
                                try {
                                    module0141.$g1714$.bind((module0320.NIL != var73) ? var73 : module0141.f9283(), var20);
                                    module0141.$g1715$.bind((SubLObject)((module0320.NIL != var73) ? module0320.$ic78$ : module0141.$g1715$.getDynamicValue(var20)), var20);
                                    if (module0320.NIL != var73 && module0320.NIL != module0136.f8864() && module0320.NIL == module0141.f9279(var73)) {
                                        final SubLObject var75 = module0136.$g1591$.getDynamicValue(var20);
                                        if (var75.eql((SubLObject)module0320.$ic79$)) {
                                            module0136.f8870((SubLObject)module0320.ONE_INTEGER, (SubLObject)module0320.$ic80$, var73, (SubLObject)module0320.$ic81$, (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED);
                                        }
                                        else if (var75.eql((SubLObject)module0320.$ic82$)) {
                                            module0136.f8871((SubLObject)module0320.ONE_INTEGER, (SubLObject)module0320.$ic83$, (SubLObject)module0320.$ic80$, var73, (SubLObject)module0320.$ic81$, (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED);
                                        }
                                        else if (var75.eql((SubLObject)module0320.$ic84$)) {
                                            Errors.warn((SubLObject)module0320.$ic80$, var73, (SubLObject)module0320.$ic81$);
                                        }
                                        else {
                                            Errors.warn((SubLObject)module0320.$ic85$, module0136.$g1591$.getDynamicValue(var20));
                                            Errors.cerror((SubLObject)module0320.$ic83$, (SubLObject)module0320.$ic80$, var73, (SubLObject)module0320.$ic81$);
                                        }
                                    }
                                    final SubLObject var129_154 = module0141.$g1670$.currentBinding(var20);
                                    final SubLObject var154_156 = module0141.$g1671$.currentBinding(var20);
                                    final SubLObject var76 = module0141.$g1672$.currentBinding(var20);
                                    final SubLObject var77 = module0141.$g1674$.currentBinding(var20);
                                    final SubLObject var78 = module0137.$g1605$.currentBinding(var20);
                                    try {
                                        module0141.$g1670$.bind(var67, var20);
                                        module0141.$g1671$.bind(module0244.f15739(var67), var20);
                                        module0141.$g1672$.bind(module0244.f15746(var67), var20);
                                        module0141.$g1674$.bind((SubLObject)module0320.NIL, var20);
                                        module0137.$g1605$.bind(var67, var20);
                                        if (module0320.NIL != module0136.f8865() || module0320.NIL != module0244.f15795(var62, module0137.f8955((SubLObject)module0320.UNPROVIDED))) {
                                            final SubLObject var129_155 = module0141.$g1677$.currentBinding(var20);
                                            final SubLObject var154_157 = module0138.$g1619$.currentBinding(var20);
                                            final SubLObject var157_162 = module0141.$g1674$.currentBinding(var20);
                                            try {
                                                module0141.$g1677$.bind(var64, var20);
                                                module0138.$g1619$.bind(module0244.f15782(var64, var67), var20);
                                                module0141.$g1674$.bind((SubLObject)module0320.NIL, var20);
                                                module0249.f16055(var68, (SubLObject)module0320.UNPROVIDED);
                                                for (var71 = (SubLObject)ConsesLow.list(var62, module0141.f9195()); module0320.NIL != var71 && module0320.NIL == var21; var71 = module0056.f4150(var70)) {
                                                    final SubLObject var148_163 = var71.first();
                                                    final SubLObject var79 = conses_high.second(var71);
                                                    final SubLObject var80 = var148_163;
                                                    final SubLObject var129_156 = module0141.$g1674$.currentBinding(var20);
                                                    try {
                                                        module0141.$g1674$.bind(var79, var20);
                                                        if (module0320.NIL != module0250.f16115(module0141.f9190(), var148_163)) {
                                                            final SubLObject var81 = (SubLObject)module0320.NIL;
                                                            final SubLObject var82 = var66;
                                                            if (module0320.NIL != module0158.f10010(var80, var65, var82)) {
                                                                final SubLObject var83 = module0158.f10011(var80, var65, var82);
                                                                SubLObject var84 = var21;
                                                                final SubLObject var85 = (SubLObject)module0320.NIL;
                                                                while (module0320.NIL == var84) {
                                                                    final SubLObject var86 = module0052.f3695(var83, var85);
                                                                    final SubLObject var87 = (SubLObject)SubLObjectFactory.makeBoolean(!var85.eql(var86));
                                                                    if (module0320.NIL != var87) {
                                                                        SubLObject var88 = (SubLObject)module0320.NIL;
                                                                        try {
                                                                            var88 = module0158.f10316(var86, (SubLObject)module0320.$ic71$, (SubLObject)module0320.$ic72$, (SubLObject)module0320.NIL);
                                                                            SubLObject var120_127 = var21;
                                                                            final SubLObject var121_128 = (SubLObject)module0320.NIL;
                                                                            while (module0320.NIL == var120_127) {
                                                                                final SubLObject var89 = module0052.f3695(var88, var121_128);
                                                                                final SubLObject var123_129 = (SubLObject)SubLObjectFactory.makeBoolean(!var121_128.eql(var89));
                                                                                if (module0320.NIL != var123_129) {
                                                                                    var20.resetMultipleValues();
                                                                                    SubLObject var90 = f21627(var89, var19);
                                                                                    final SubLObject var91 = var20.secondMultipleValue();
                                                                                    var20.resetMultipleValues();
                                                                                    var21 = var91;
                                                                                    if (module0320.NIL != var90) {
                                                                                        var90 = f21625(var90, var24, var89, var25, var81);
                                                                                        var22 = (SubLObject)ConsesLow.cons(var90, var22);
                                                                                    }
                                                                                }
                                                                                var120_127 = (SubLObject)SubLObjectFactory.makeBoolean(module0320.NIL == var123_129 || module0320.NIL != var21);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            final SubLObject var129_157 = Threads.$is_thread_performing_cleanupP$.currentBinding(var20);
                                                                            try {
                                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0320.T, var20);
                                                                                if (module0320.NIL != var88) {
                                                                                    module0158.f10319(var88);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                Threads.$is_thread_performing_cleanupP$.rebind(var129_157, var20);
                                                                            }
                                                                        }
                                                                    }
                                                                    var84 = (SubLObject)SubLObjectFactory.makeBoolean(module0320.NIL == var87 || module0320.NIL != var21);
                                                                }
                                                            }
                                                        }
                                                        final SubLObject var92 = module0200.f12443(var67);
                                                        SubLObject var93;
                                                        SubLObject var94;
                                                        SubLObject var129_158;
                                                        SubLObject var154_158;
                                                        SubLObject var95;
                                                        SubLObject var96;
                                                        SubLObject var97;
                                                        SubLObject var98;
                                                        SubLObject var99;
                                                        SubLObject var100;
                                                        SubLObject var129_159;
                                                        SubLObject var179_183;
                                                        SubLObject var101;
                                                        SubLObject var102;
                                                        SubLObject var129_160;
                                                        SubLObject var103;
                                                        SubLObject var104;
                                                        SubLObject var105;
                                                        SubLObject var106;
                                                        SubLObject var107;
                                                        SubLObject var108;
                                                        SubLObject var109;
                                                        SubLObject var110;
                                                        SubLObject var172_193;
                                                        SubLObject var111;
                                                        SubLObject var129_161;
                                                        SubLObject var113;
                                                        SubLObject var112;
                                                        SubLObject var114;
                                                        SubLObject var115;
                                                        SubLObject var116;
                                                        SubLObject var117;
                                                        SubLObject var118;
                                                        SubLObject var119;
                                                        for (var93 = (SubLObject)module0320.NIL, var93 = var92; module0320.NIL == var21 && module0320.NIL != var93; var93 = var93.rest()) {
                                                            var94 = var93.first();
                                                            var129_158 = module0137.$g1605$.currentBinding(var20);
                                                            var154_158 = module0141.$g1674$.currentBinding(var20);
                                                            try {
                                                                module0137.$g1605$.bind(var94, var20);
                                                                module0141.$g1674$.bind((SubLObject)((module0320.NIL != module0141.f9205((SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0320.NIL == module0141.$g1674$.getDynamicValue(var20)) : module0141.$g1674$.getDynamicValue(var20)), var20);
                                                                var95 = module0228.f15229(var148_163);
                                                                if (module0320.NIL != module0138.f8992(var95)) {
                                                                    var96 = module0242.f15664(var95, module0137.f8955((SubLObject)module0320.UNPROVIDED));
                                                                    if (module0320.NIL != var96) {
                                                                        var97 = module0245.f15834(var96, module0138.f8979(), module0137.f8955((SubLObject)module0320.UNPROVIDED));
                                                                        if (module0320.NIL != var97) {
                                                                            for (var98 = module0066.f4838(module0067.f4891(var97)); module0320.NIL == var21 && module0320.NIL == module0066.f4841(var98); var98 = module0066.f4840(var98)) {
                                                                                var20.resetMultipleValues();
                                                                                var99 = module0066.f4839(var98);
                                                                                var100 = var20.secondMultipleValue();
                                                                                var20.resetMultipleValues();
                                                                                if (module0320.NIL != module0147.f9507(var99)) {
                                                                                    var129_159 = module0138.$g1623$.currentBinding(var20);
                                                                                    try {
                                                                                        module0138.$g1623$.bind(var99, var20);
                                                                                        for (var179_183 = module0066.f4838(module0067.f4891(var100)); module0320.NIL == var21 && module0320.NIL == module0066.f4841(var179_183); var179_183 = module0066.f4840(var179_183)) {
                                                                                            var20.resetMultipleValues();
                                                                                            var101 = module0066.f4839(var179_183);
                                                                                            var102 = var20.secondMultipleValue();
                                                                                            var20.resetMultipleValues();
                                                                                            if (module0320.NIL != module0141.f9289(var101)) {
                                                                                                var129_160 = module0138.$g1624$.currentBinding(var20);
                                                                                                try {
                                                                                                    module0138.$g1624$.bind(var101, var20);
                                                                                                    var103 = var102;
                                                                                                    if (module0320.NIL != module0077.f5302(var103)) {
                                                                                                        var104 = module0077.f5333(var103);
                                                                                                        for (var105 = module0032.f1741(var104), var106 = (SubLObject)module0320.NIL, var106 = module0032.f1742(var105, var104); module0320.NIL == var21 && module0320.NIL == module0032.f1744(var105, var106); var106 = module0032.f1743(var106)) {
                                                                                                            var107 = module0032.f1745(var105, var106);
                                                                                                            if (module0320.NIL != module0032.f1746(var106, var107) && module0320.NIL == module0249.f16059(var107, (SubLObject)module0320.UNPROVIDED)) {
                                                                                                                module0249.f16055(var107, (SubLObject)module0320.UNPROVIDED);
                                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var107, module0141.f9195()), var70);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else if (var103.isList()) {
                                                                                                        if (module0320.NIL == var21) {
                                                                                                            var108 = var103;
                                                                                                            var109 = (SubLObject)module0320.NIL;
                                                                                                            var109 = var108.first();
                                                                                                            while (module0320.NIL == var21 && module0320.NIL != var108) {
                                                                                                                if (module0320.NIL == module0249.f16059(var109, (SubLObject)module0320.UNPROVIDED)) {
                                                                                                                    module0249.f16055(var109, (SubLObject)module0320.UNPROVIDED);
                                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var109, module0141.f9195()), var70);
                                                                                                                }
                                                                                                                var108 = var108.rest();
                                                                                                                var109 = var108.first();
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        Errors.error((SubLObject)module0320.$ic86$, var103);
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    module0138.$g1624$.rebind(var129_160, var20);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        module0066.f4842(var179_183);
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1623$.rebind(var129_159, var20);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var98);
                                                                        }
                                                                    }
                                                                    else {
                                                                        module0136.f8870((SubLObject)module0320.FIVE_INTEGER, (SubLObject)module0320.$ic87$, (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED);
                                                                    }
                                                                }
                                                                else if (module0320.NIL != module0155.f9785(var95, (SubLObject)module0320.UNPROVIDED)) {
                                                                    var110 = ((module0320.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var20), module0137.f8955((SubLObject)module0320.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var20), module0137.f8955((SubLObject)module0320.UNPROVIDED)));
                                                                    for (var172_193 = (SubLObject)module0320.NIL, var172_193 = var110; module0320.NIL == var21 && module0320.NIL != var172_193; var172_193 = var172_193.rest()) {
                                                                        var111 = var172_193.first();
                                                                        var129_161 = module0138.$g1625$.currentBinding(var20);
                                                                        try {
                                                                            module0138.$g1625$.bind(var111, var20);
                                                                            var112 = (var113 = Functions.funcall(var111, var95));
                                                                            if (module0320.NIL != module0077.f5302(var113)) {
                                                                                var114 = module0077.f5333(var113);
                                                                                for (var115 = module0032.f1741(var114), var116 = (SubLObject)module0320.NIL, var116 = module0032.f1742(var115, var114); module0320.NIL == var21 && module0320.NIL == module0032.f1744(var115, var116); var116 = module0032.f1743(var116)) {
                                                                                    var117 = module0032.f1745(var115, var116);
                                                                                    if (module0320.NIL != module0032.f1746(var116, var117) && module0320.NIL == module0249.f16059(var117, (SubLObject)module0320.UNPROVIDED)) {
                                                                                        module0249.f16055(var117, (SubLObject)module0320.UNPROVIDED);
                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var117, module0141.f9195()), var70);
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (var113.isList()) {
                                                                                if (module0320.NIL == var21) {
                                                                                    var118 = var113;
                                                                                    var119 = (SubLObject)module0320.NIL;
                                                                                    var119 = var118.first();
                                                                                    while (module0320.NIL == var21 && module0320.NIL != var118) {
                                                                                        if (module0320.NIL == module0249.f16059(var119, (SubLObject)module0320.UNPROVIDED)) {
                                                                                            module0249.f16055(var119, (SubLObject)module0320.UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var119, module0141.f9195()), var70);
                                                                                        }
                                                                                        var118 = var118.rest();
                                                                                        var119 = var118.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)module0320.$ic86$, var113);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1625$.rebind(var129_161, var20);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                module0141.$g1674$.rebind(var154_158, var20);
                                                                module0137.$g1605$.rebind(var129_158, var20);
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        module0141.$g1674$.rebind(var129_156, var20);
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var157_162, var20);
                                                module0138.$g1619$.rebind(var154_157, var20);
                                                module0141.$g1677$.rebind(var129_155, var20);
                                            }
                                        }
                                        else {
                                            module0136.f8872((SubLObject)module0320.TWO_INTEGER, (SubLObject)module0320.$ic88$, var62, module0244.f15748(module0137.f8955((SubLObject)module0320.UNPROVIDED)), (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED, (SubLObject)module0320.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        module0137.$g1605$.rebind(var78, var20);
                                        module0141.$g1674$.rebind(var77, var20);
                                        module0141.$g1672$.rebind(var76, var20);
                                        module0141.$g1671$.rebind(var154_156, var20);
                                        module0141.$g1670$.rebind(var129_154, var20);
                                    }
                                }
                                finally {
                                    module0141.$g1715$.rebind(var74, var20);
                                    module0141.$g1714$.rebind(var129_153, var20);
                                }
                                module0139.f9011(module0139.$g1635$.getDynamicValue(var20));
                            }
                            finally {
                                module0139.$g1635$.rebind(var72, var20);
                            }
                        }
                    }
                    else {
                        final SubLObject var120 = (SubLObject)module0320.NIL;
                        final SubLObject var121 = var66;
                        if (module0320.NIL != module0158.f10010(var62, var65, var121)) {
                            final SubLObject var122 = module0158.f10011(var62, var65, var121);
                            SubLObject var123 = var21;
                            final SubLObject var124 = (SubLObject)module0320.NIL;
                            while (module0320.NIL == var123) {
                                final SubLObject var125 = module0052.f3695(var122, var124);
                                final SubLObject var126 = (SubLObject)SubLObjectFactory.makeBoolean(!var124.eql(var125));
                                if (module0320.NIL != var126) {
                                    SubLObject var127 = (SubLObject)module0320.NIL;
                                    try {
                                        var127 = module0158.f10316(var125, (SubLObject)module0320.$ic71$, (SubLObject)module0320.$ic72$, (SubLObject)module0320.NIL);
                                        SubLObject var120_128 = var21;
                                        final SubLObject var121_129 = (SubLObject)module0320.NIL;
                                        while (module0320.NIL == var120_128) {
                                            final SubLObject var128 = module0052.f3695(var127, var121_129);
                                            final SubLObject var123_130 = (SubLObject)SubLObjectFactory.makeBoolean(!var121_129.eql(var128));
                                            if (module0320.NIL != var123_130) {
                                                var20.resetMultipleValues();
                                                SubLObject var129 = f21627(var128, var19);
                                                final SubLObject var130 = var20.secondMultipleValue();
                                                var20.resetMultipleValues();
                                                var21 = var130;
                                                if (module0320.NIL != var129) {
                                                    var129 = f21625(var129, var24, var128, var25, var120);
                                                    var22 = (SubLObject)ConsesLow.cons(var129, var22);
                                                }
                                            }
                                            var120_128 = (SubLObject)SubLObjectFactory.makeBoolean(module0320.NIL == var123_130 || module0320.NIL != var21);
                                        }
                                    }
                                    finally {
                                        final SubLObject var131 = Threads.$is_thread_performing_cleanupP$.currentBinding(var20);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0320.T, var20);
                                            if (module0320.NIL != var127) {
                                                module0158.f10319(var127);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var131, var20);
                                        }
                                    }
                                }
                                var123 = (SubLObject)SubLObjectFactory.makeBoolean(module0320.NIL == var126 || module0320.NIL != var21);
                            }
                        }
                        final SubLObject var132 = module0266.f17523(var63, var62, var64, (SubLObject)module0320.NIL, (SubLObject)module0320.NIL, (SubLObject)module0320.$ic89$, (SubLObject)module0320.UNPROVIDED);
                        SubLObject var135;
                        for (SubLObject var133 = var21; module0320.NIL == var133; var133 = (SubLObject)SubLObjectFactory.makeBoolean(module0320.NIL == var135 || module0320.NIL != var21)) {
                            var20.resetMultipleValues();
                            final SubLObject var134 = module0052.f3693(var132);
                            var135 = var20.secondMultipleValue();
                            var20.resetMultipleValues();
                            if (module0320.NIL != var135 && !var134.equal(var62)) {
                                final SubLObject var136 = (SubLObject)module0320.NIL;
                                final SubLObject var137 = var66;
                                if (module0320.NIL != module0158.f10010(var134, var65, var137)) {
                                    final SubLObject var138 = module0158.f10011(var134, var65, var137);
                                    SubLObject var120_129 = var21;
                                    final SubLObject var139 = (SubLObject)module0320.NIL;
                                    while (module0320.NIL == var120_129) {
                                        final SubLObject var140 = module0052.f3695(var138, var139);
                                        final SubLObject var123_131 = (SubLObject)SubLObjectFactory.makeBoolean(!var139.eql(var140));
                                        if (module0320.NIL != var123_131) {
                                            SubLObject var141 = (SubLObject)module0320.NIL;
                                            try {
                                                var141 = module0158.f10316(var140, (SubLObject)module0320.$ic71$, (SubLObject)module0320.$ic72$, (SubLObject)module0320.NIL);
                                                SubLObject var120_130 = var21;
                                                final SubLObject var121_130 = (SubLObject)module0320.NIL;
                                                while (module0320.NIL == var120_130) {
                                                    final SubLObject var142 = module0052.f3695(var141, var121_130);
                                                    final SubLObject var123_132 = (SubLObject)SubLObjectFactory.makeBoolean(!var121_130.eql(var142));
                                                    if (module0320.NIL != var123_132) {
                                                        var20.resetMultipleValues();
                                                        SubLObject var143 = f21627(var142, var19);
                                                        final SubLObject var144 = var20.secondMultipleValue();
                                                        var20.resetMultipleValues();
                                                        var21 = var144;
                                                        if (module0320.NIL != var143) {
                                                            var143 = f21625(var143, var24, var142, var25, var136);
                                                            var22 = (SubLObject)ConsesLow.cons(var143, var22);
                                                        }
                                                    }
                                                    var120_130 = (SubLObject)SubLObjectFactory.makeBoolean(module0320.NIL == var123_132 || module0320.NIL != var21);
                                                }
                                            }
                                            finally {
                                                final SubLObject var145 = Threads.$is_thread_performing_cleanupP$.currentBinding(var20);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0320.T, var20);
                                                    if (module0320.NIL != var141) {
                                                        module0158.f10319(var141);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var145, var20);
                                                }
                                            }
                                        }
                                        var120_129 = (SubLObject)SubLObjectFactory.makeBoolean(module0320.NIL == var123_131 || module0320.NIL != var21);
                                    }
                                }
                            }
                        }
                    }
                }
                else if (module0320.NIL != module0319.f21530(var24)) {
                    f21613(var19, var25);
                    final SubLObject var146 = module0319.f21479(var24);
                    final SubLObject var147 = (SubLObject)module0320.NIL;
                    if (module0320.NIL != module0318.f21426()) {
                        final SubLObject var148 = var146;
                        if (module0320.NIL != module0158.f10038(var148)) {
                            final SubLObject var149 = (SubLObject)module0320.NIL;
                            final SubLObject var150 = module0012.$g73$.currentBinding(var20);
                            final SubLObject var151 = module0012.$g65$.currentBinding(var20);
                            final SubLObject var152 = module0012.$g67$.currentBinding(var20);
                            final SubLObject var153 = module0012.$g68$.currentBinding(var20);
                            final SubLObject var154 = module0012.$g66$.currentBinding(var20);
                            final SubLObject var155 = module0012.$g69$.currentBinding(var20);
                            final SubLObject var156 = module0012.$g70$.currentBinding(var20);
                            final SubLObject var157 = module0012.$silent_progressP$.currentBinding(var20);
                            try {
                                module0012.$g73$.bind(Time.get_universal_time(), var20);
                                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var20), var20);
                                module0012.$g67$.bind((SubLObject)module0320.ONE_INTEGER, var20);
                                module0012.$g68$.bind((SubLObject)module0320.ZERO_INTEGER, var20);
                                module0012.$g66$.bind((SubLObject)module0320.ZERO_INTEGER, var20);
                                module0012.$g69$.bind((SubLObject)module0320.ZERO_INTEGER, var20);
                                module0012.$g70$.bind((SubLObject)module0320.T, var20);
                                module0012.$silent_progressP$.bind((SubLObject)((module0320.NIL != var149) ? module0012.$silent_progressP$.getDynamicValue(var20) : module0320.T), var20);
                                module0012.f474(var149);
                                final SubLObject var158 = module0158.f10039(var148);
                                SubLObject var159 = var21;
                                final SubLObject var160 = (SubLObject)module0320.NIL;
                                while (module0320.NIL == var159) {
                                    final SubLObject var161 = module0052.f3695(var158, var160);
                                    final SubLObject var162 = (SubLObject)SubLObjectFactory.makeBoolean(!var160.eql(var161));
                                    if (module0320.NIL != var162) {
                                        module0012.f476();
                                        SubLObject var163 = (SubLObject)module0320.NIL;
                                        try {
                                            var163 = module0158.f10316(var161, (SubLObject)module0320.$ic71$, (SubLObject)module0320.$ic72$, (SubLObject)module0320.NIL);
                                            SubLObject var120_131 = var21;
                                            final SubLObject var121_131 = (SubLObject)module0320.NIL;
                                            while (module0320.NIL == var120_131) {
                                                final SubLObject var164 = module0052.f3695(var163, var121_131);
                                                final SubLObject var123_133 = (SubLObject)SubLObjectFactory.makeBoolean(!var121_131.eql(var164));
                                                if (module0320.NIL != var123_133) {
                                                    var20.resetMultipleValues();
                                                    SubLObject var165 = f21627(var164, var19);
                                                    final SubLObject var166 = var20.secondMultipleValue();
                                                    var20.resetMultipleValues();
                                                    var21 = var166;
                                                    if (module0320.NIL != var165) {
                                                        var165 = f21624(var165, var164, var147);
                                                        var22 = (SubLObject)ConsesLow.cons(var165, var22);
                                                    }
                                                }
                                                var120_131 = (SubLObject)SubLObjectFactory.makeBoolean(module0320.NIL == var123_133 || module0320.NIL != var21);
                                            }
                                        }
                                        finally {
                                            final SubLObject var129_162 = Threads.$is_thread_performing_cleanupP$.currentBinding(var20);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0320.T, var20);
                                                if (module0320.NIL != var163) {
                                                    module0158.f10319(var163);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var129_162, var20);
                                            }
                                        }
                                    }
                                    var159 = (SubLObject)SubLObjectFactory.makeBoolean(module0320.NIL == var162 || module0320.NIL != var21);
                                }
                                module0012.f475();
                            }
                            finally {
                                module0012.$silent_progressP$.rebind(var157, var20);
                                module0012.$g70$.rebind(var156, var20);
                                module0012.$g69$.rebind(var155, var20);
                                module0012.$g66$.rebind(var154, var20);
                                module0012.$g68$.rebind(var153, var20);
                                module0012.$g67$.rebind(var152, var20);
                                module0012.$g65$.rebind(var151, var20);
                                module0012.$g73$.rebind(var150, var20);
                            }
                        }
                    }
                    var21 = (SubLObject)module0320.T;
                }
                if (module0320.NIL != f21594(var19, var24)) {
                    var21 = (SubLObject)module0320.T;
                }
                if (module0320.NIL == var21) {
                    f21613(var19, var25);
                }
            }
            var23 = var23.rest();
            var24 = var23.first();
        }
        return var22;
    }
    
    public static SubLObject f21627(final SubLObject var84, final SubLObject var19) {
        final SubLThread var85 = SubLProcess.currentSubLThread();
        final SubLObject var86 = f21580(var19);
        final SubLObject var87 = f21581(var19);
        final SubLObject var88 = f21582(var19);
        f21615(var19, var84);
        if (module0320.NIL != f21599(var19)) {
            f21601(var19, var87, var88, var86);
            return Values.values((SubLObject)module0320.NIL, (SubLObject)module0320.NIL);
        }
        if (module0320.NIL != f21598(var19)) {
            f21601(var19, var87, var88, var86);
            if (module0320.NIL != module0321.f21692()) {
                return Values.values((SubLObject)ConsesLow.list((SubLObject)module0320.T, (SubLObject)module0320.NIL), (SubLObject)module0320.T);
            }
            return Values.values((SubLObject)ConsesLow.list(module0318.f21466(var84), (SubLObject)module0320.NIL), (SubLObject)module0320.NIL);
        }
        else {
            SubLObject var89 = (SubLObject)module0320.NIL;
            SubLObject var90 = (SubLObject)module0320.NIL;
            if (module0320.ONE_INTEGER.eql(Sequences.length(f21579(var19))) && module0320.NIL != f21597(var19)) {
                final SubLObject var91 = var86.first();
                final SubLObject var92 = module0319.f21516(var84, var91);
                var85.resetMultipleValues();
                final SubLObject var93 = module0319.f21546(var91, var92, module0319.f21513(var91, (SubLObject)SubLObjectFactory.makeBoolean(!SubLObjectFactory.makeBoolean(module0320.NIL == module0141.f9195()).eql((SubLObject)SubLObjectFactory.makeBoolean(module0320.NIL == module0319.f21507(var91))))));
                final SubLObject var94 = var85.secondMultipleValue();
                var85.resetMultipleValues();
                if (module0320.NIL != var93) {
                    if (module0320.NIL != module0321.f21692()) {
                        return Values.values((SubLObject)ConsesLow.list((SubLObject)module0320.T, var94), (SubLObject)module0320.T);
                    }
                    return Values.values((SubLObject)ConsesLow.list(module0318.f21466(var84), var94), (SubLObject)module0320.NIL);
                }
            }
            else {
                SubLObject var95 = (SubLObject)module0320.NIL;
                SubLObject var96 = (SubLObject)module0320.NIL;
                var95 = f21579(var19);
                var96 = var95.first();
                while (module0320.NIL != var95 && module0320.NIL == var89) {
                    if (module0320.NIL == f21590(var19, var96) && module0320.NIL == f21591(var19, var96)) {
                        f21600(var19, var96);
                        final SubLObject var97 = module0319.f21517(var96, f21578(var19));
                        final SubLObject var98 = module0319.f21516(var84, var96);
                        SubLObject var99 = (SubLObject)module0320.NIL;
                        SubLObject var100 = (SubLObject)module0320.NIL;
                        if (module0320.NIL != module0319.f21528(var96)) {
                            var85.resetMultipleValues();
                            final SubLObject var221_222 = module0319.f21547(var96, var98, var97, var84);
                            final SubLObject var223_224 = var85.secondMultipleValue();
                            var85.resetMultipleValues();
                            var99 = var221_222;
                            var100 = var223_224;
                        }
                        else if (module0320.NIL != module0319.f21529(var96)) {
                            var85.resetMultipleValues();
                            final SubLObject var225_226 = module0319.f21550(var96, var98, var97, var84);
                            final SubLObject var227_228 = var85.secondMultipleValue();
                            var85.resetMultipleValues();
                            var99 = var225_226;
                            var100 = var227_228;
                        }
                        else if (module0320.NIL != module0319.f21530(var96)) {
                            var85.resetMultipleValues();
                            final SubLObject var229_230 = module0319.f21551(var96, var98, var97, var84);
                            final SubLObject var231_232 = var85.secondMultipleValue();
                            var85.resetMultipleValues();
                            var99 = var229_230;
                            var100 = var231_232;
                        }
                        if (module0320.NIL != var99) {
                            f21612(var19, var97);
                            if (module0320.NIL != module0321.f21692() && module0320.NIL != f21595(var19)) {
                                var89 = (SubLObject)module0320.T;
                            }
                            var90 = ConsesLow.nconc(var90, var100);
                        }
                        else if (module0320.NIL != f21594(var19, var96)) {
                            var89 = (SubLObject)module0320.T;
                        }
                    }
                    var95 = var95.rest();
                    var96 = var95.first();
                }
            }
            if (module0320.NIL == f21598(var19)) {
                f21601(var19, var87, var88, var86);
                return Values.values((SubLObject)module0320.NIL, (SubLObject)module0320.NIL);
            }
            f21601(var19, var87, var88, var86);
            if (module0320.NIL != module0321.f21692()) {
                return Values.values((SubLObject)ConsesLow.list((SubLObject)module0320.T, var90), (SubLObject)module0320.T);
            }
            return Values.values((SubLObject)ConsesLow.list(module0318.f21466(var84), var90), (SubLObject)module0320.NIL);
        }
    }
    
    public static SubLObject f21628() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21559", "S#24109", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21561", "S#24107", 1, 0, false);
        new $f21561$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21562", "S#24110", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21563", "S#24111", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21564", "S#24112", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21565", "S#24113", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21566", "S#24114", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21567", "S#24115", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21568", "S#24116", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21569", "S#24117", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21570", "S#24118", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21571", "S#24119", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21572", "S#24120", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21573", "S#24121", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21574", "S#24122", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21560", "S#24123", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21575", "S#24124", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21576", "S#24125", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21577", "S#24126", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21578", "S#24127", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21579", "S#24128", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21580", "S#24129", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21581", "S#24130", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21582", "S#24131", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0320", "f21583", "S#24132");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0320", "f21584", "S#24133");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0320", "f21585", "S#24134");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0320", "f21586", "S#24135");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21587", "S#24136", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21588", "S#24137", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21589", "S#24138", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21590", "S#24139", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21591", "S#24140", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21592", "S#24141", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21593", "S#24142", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21594", "S#24143", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21595", "S#24144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21596", "S#24145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21597", "S#24146", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21598", "S#24147", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21599", "S#24148", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21602", "S#24149", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21603", "S#24150", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21604", "S#24151", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21605", "S#24152", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21606", "S#24153", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21607", "S#24154", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21601", "S#24155", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21600", "S#24156", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21608", "S#24157", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21609", "S#24158", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21610", "S#24159", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21611", "S#24160", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21612", "S#24161", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21613", "S#24162", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21614", "S#24163", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21615", "S#24164", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21616", "S#24165", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21617", "S#24166", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0320", "f21618", "S#24167");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21619", "S#24168", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21620", "S#24169", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21621", "S#24170", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21622", "S#24171", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21623", "S#24172", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21624", "S#24173", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21625", "S#24174", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21626", "S#24175", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0320", "f21627", "S#24176", 2, 0, false);
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21629() {
        module0320.$g2814$ = SubLFiles.defconstant("S#24177", (SubLObject)module0320.$ic0$);
        return (SubLObject)module0320.NIL;
    }
    
    public static SubLObject f21630() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0320.$g2814$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0320.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0320.$ic8$);
        Structures.def_csetf((SubLObject)module0320.$ic9$, (SubLObject)module0320.$ic10$);
        Structures.def_csetf((SubLObject)module0320.$ic11$, (SubLObject)module0320.$ic12$);
        Structures.def_csetf((SubLObject)module0320.$ic13$, (SubLObject)module0320.$ic14$);
        Structures.def_csetf((SubLObject)module0320.$ic15$, (SubLObject)module0320.$ic16$);
        Structures.def_csetf((SubLObject)module0320.$ic17$, (SubLObject)module0320.$ic18$);
        Equality.identity((SubLObject)module0320.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0320.$g2814$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0320.$ic29$));
        return (SubLObject)module0320.NIL;
    }
    
    public void declareFunctions() {
        f21628();
    }
    
    public void initializeVariables() {
        f21629();
    }
    
    public void runTopLevelForms() {
        f21630();
    }
    
    static {
        me = (SubLFile)new module0320();
        module0320.$g2814$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#24106", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#24107", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15414", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24178", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24179", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24180", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24181", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INVERSE-MODE-P"), (SubLObject)SubLObjectFactory.makeKeyword("ARGNUMS-UNIFIED"), (SubLObject)SubLObjectFactory.makeKeyword("ARGNUMS-REMAINING"), (SubLObject)SubLObjectFactory.makeKeyword("TACTICS"), (SubLObject)SubLObjectFactory.makeKeyword("TACTICS-CONSIDERED"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24110", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24111", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24112", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24113", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24114", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24115", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24116", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24117", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24118", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24119", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("S#24123", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#24109", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#24107", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#24110", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#24115", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#24111", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#24116", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#24112", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#24117", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#24113", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#24118", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#24114", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#24119", "CYC");
        $ic19$ = SubLObjectFactory.makeKeyword("INVERSE-MODE-P");
        $ic20$ = SubLObjectFactory.makeKeyword("ARGNUMS-UNIFIED");
        $ic21$ = SubLObjectFactory.makeKeyword("ARGNUMS-REMAINING");
        $ic22$ = SubLObjectFactory.makeKeyword("TACTICS");
        $ic23$ = SubLObjectFactory.makeKeyword("TACTICS-CONSIDERED");
        $ic24$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic25$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic26$ = SubLObjectFactory.makeSymbol("S#24120", "CYC");
        $ic27$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic28$ = SubLObjectFactory.makeKeyword("END");
        $ic29$ = SubLObjectFactory.makeSymbol("S#24122", "CYC");
        $ic30$ = SubLObjectFactory.makeString("#<");
        $ic31$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic32$ = SubLObjectFactory.makeKeyword("BASE");
        $ic33$ = SubLObjectFactory.makeString("~%Strategy : ~a~%");
        $ic34$ = SubLObjectFactory.makeString("Strategy Inverse Mode? : ~a~%");
        $ic35$ = SubLObjectFactory.makeString("Argnums Unified :        ~a~%");
        $ic36$ = SubLObjectFactory.makeString("Argnums Remaining :      ~a~%");
        $ic37$ = SubLObjectFactory.makeString("Tactics Considered :     ~a~%~%");
        $ic38$ = SubLObjectFactory.makeString("Strategy Tactic ~a: ~a~%");
        $ic39$ = SubLObjectFactory.makeString("~%~%");
        $ic40$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15202", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8816", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic41$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic42$ = SubLObjectFactory.makeSymbol("S#24131", "CYC");
        $ic43$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24182", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8816", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic44$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic45$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic46$ = SubLObjectFactory.makeKeyword("DONE");
        $ic47$ = SubLObjectFactory.makeSymbol("CSOME");
        $ic48$ = SubLObjectFactory.makeSymbol("S#24128", "CYC");
        $ic49$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24182", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24183", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8816", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic50$ = SubLObjectFactory.makeSymbol("CDR");
        $ic51$ = SubLObjectFactory.makeSymbol("MEMBER");
        $ic52$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24182", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24184", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8816", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24098", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic53$ = SubLObjectFactory.makeUninternedSymbol("US#5D12CBD");
        $ic54$ = SubLObjectFactory.makeSymbol("CDO");
        $ic55$ = SubLObjectFactory.makeSymbol("CAR");
        $ic56$ = SubLObjectFactory.makeSymbol("COR");
        $ic57$ = SubLObjectFactory.makeSymbol("NULL");
        $ic58$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic59$ = SubLObjectFactory.makeSymbol("S#24139", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("S#24140", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("S#24156", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("CLET");
        $ic63$ = SubLObjectFactory.makeSymbol("S#24051", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#24127", "CYC");
        $ic65$ = SubLObjectFactory.makeKeyword("LOOKUP");
        $ic66$ = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $ic67$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24185", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic68$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24168", "CYC")));
        $ic69$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("transitiveViaArg"));
        $ic70$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("transitiveViaArgInverse"));
        $ic71$ = SubLObjectFactory.makeKeyword("GAF");
        $ic72$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic73$ = SubLObjectFactory.makeKeyword("DO-HASH-TABLE");
        $ic74$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic75$ = SubLObjectFactory.makeKeyword("DEPTH");
        $ic76$ = SubLObjectFactory.makeKeyword("STACK");
        $ic77$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic78$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic79$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic80$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic81$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic82$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic83$ = SubLObjectFactory.makeString("continue anyway");
        $ic84$ = SubLObjectFactory.makeKeyword("WARN");
        $ic85$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic86$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic87$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic88$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic89$ = SubLObjectFactory.makeKeyword("DEPTH-FIRST");
    }
    
    public static final class $sX24106_native extends SubLStructNative
    {
        public SubLObject $inverse_mode_p;
        public SubLObject $argnums_unified;
        public SubLObject $argnums_remaining;
        public SubLObject $tactics;
        public SubLObject $tactics_considered;
        private static final SubLStructDeclNative structDecl;
        
        public $sX24106_native() {
            this.$inverse_mode_p = (SubLObject)CommonSymbols.NIL;
            this.$argnums_unified = (SubLObject)CommonSymbols.NIL;
            this.$argnums_remaining = (SubLObject)CommonSymbols.NIL;
            this.$tactics = (SubLObject)CommonSymbols.NIL;
            this.$tactics_considered = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX24106_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$inverse_mode_p;
        }
        
        public SubLObject getField3() {
            return this.$argnums_unified;
        }
        
        public SubLObject getField4() {
            return this.$argnums_remaining;
        }
        
        public SubLObject getField5() {
            return this.$tactics;
        }
        
        public SubLObject getField6() {
            return this.$tactics_considered;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$inverse_mode_p = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$argnums_unified = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$argnums_remaining = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$tactics = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$tactics_considered = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX24106_native.class, module0320.$ic0$, module0320.$ic1$, module0320.$ic2$, module0320.$ic3$, new String[] { "$inverse_mode_p", "$argnums_unified", "$argnums_remaining", "$tactics", "$tactics_considered" }, module0320.$ic4$, module0320.$ic5$, module0320.$ic6$);
        }
    }
    
    public static final class $f21561$UnaryFunction extends UnaryFunction
    {
        public $f21561$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#24107"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0320.f21561(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0320.class
	Total time: 1989 ms
	
	Decompiled with Procyon 0.5.32.
*/