package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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

public final class module0366 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0366";
    public static final String myFingerPrint = "2d354011b53d86a731c464b90162a4511f676dda02bad781db3a8b9776d03041";
    public static SubLSymbol $g3139$;
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
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
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
    
    public static SubLObject f24914(final SubLObject var1, final SubLObject var2) {
        f24915(var1, var2, (SubLObject)module0366.ZERO_INTEGER);
        return (SubLObject)module0366.NIL;
    }
    
    public static SubLObject f24916(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX27811_native.class) ? module0366.T : module0366.NIL);
    }
    
    public static SubLObject f24917(final SubLObject var1) {
        assert module0366.NIL != f24916(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f24918(final SubLObject var1) {
        assert module0366.NIL != f24916(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f24919(final SubLObject var1) {
        assert module0366.NIL != f24916(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f24920(final SubLObject var1) {
        assert module0366.NIL != f24916(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f24921(final SubLObject var1) {
        assert module0366.NIL != f24916(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f24922(final SubLObject var1) {
        assert module0366.NIL != f24916(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f24923(final SubLObject var1, final SubLObject var4) {
        assert module0366.NIL != f24916(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f24924(final SubLObject var1, final SubLObject var4) {
        assert module0366.NIL != f24916(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f24925(final SubLObject var1, final SubLObject var4) {
        assert module0366.NIL != f24916(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f24926(final SubLObject var1, final SubLObject var4) {
        assert module0366.NIL != f24916(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f24927(final SubLObject var1, final SubLObject var4) {
        assert module0366.NIL != f24916(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f24928(final SubLObject var1, final SubLObject var4) {
        assert module0366.NIL != f24916(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f24929(SubLObject var5) {
        if (var5 == module0366.UNPROVIDED) {
            var5 = (SubLObject)module0366.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX27811_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0366.NIL, var7 = var5; module0366.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0366.$ic22$)) {
                f24923(var6, var9);
            }
            else if (var10.eql((SubLObject)module0366.$ic23$)) {
                f24924(var6, var9);
            }
            else if (var10.eql((SubLObject)module0366.$ic24$)) {
                f24925(var6, var9);
            }
            else if (var10.eql((SubLObject)module0366.$ic25$)) {
                f24926(var6, var9);
            }
            else if (var10.eql((SubLObject)module0366.$ic26$)) {
                f24927(var6, var9);
            }
            else if (var10.eql((SubLObject)module0366.$ic27$)) {
                f24928(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0366.$ic28$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f24930(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0366.$ic29$, (SubLObject)module0366.$ic30$, (SubLObject)module0366.SIX_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0366.$ic31$, (SubLObject)module0366.$ic22$, f24917(var11));
        Functions.funcall(var12, var11, (SubLObject)module0366.$ic31$, (SubLObject)module0366.$ic23$, f24918(var11));
        Functions.funcall(var12, var11, (SubLObject)module0366.$ic31$, (SubLObject)module0366.$ic24$, f24919(var11));
        Functions.funcall(var12, var11, (SubLObject)module0366.$ic31$, (SubLObject)module0366.$ic25$, f24920(var11));
        Functions.funcall(var12, var11, (SubLObject)module0366.$ic31$, (SubLObject)module0366.$ic26$, f24921(var11));
        Functions.funcall(var12, var11, (SubLObject)module0366.$ic31$, (SubLObject)module0366.$ic27$, f24922(var11));
        Functions.funcall(var12, var11, (SubLObject)module0366.$ic32$, (SubLObject)module0366.$ic30$, (SubLObject)module0366.SIX_INTEGER);
        return var11;
    }
    
    public static SubLObject f24931(final SubLObject var11, final SubLObject var12) {
        return f24930(var11, var12);
    }
    
    public static SubLObject f24932(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0366.NIL != f24916(var13) && module0366.NIL == f24933(var13));
    }
    
    public static SubLObject f24933(final SubLObject var14) {
        return Equality.eq((SubLObject)module0366.$ic34$, f24934(var14));
    }
    
    public static SubLObject f24915(final SubLObject var13, final SubLObject var2, final SubLObject var15) {
        if (module0366.NIL != f24933(var13)) {
            PrintLow.format(var2, (SubLObject)module0366.$ic35$, f24917(var13));
        }
        else {
            final SubLObject var16 = f24935(var13);
            final SubLObject var17 = module0361.f23996(f24936(var13));
            final SubLObject var18 = module0364.f24723(f24937(var13));
            final SubLObject var19 = f24938(var13);
            final SubLObject var20 = Mapping.mapcar((SubLObject)module0366.$ic36$, var19);
            final SubLObject var21 = f24939(var13, (SubLObject)module0366.UNPROVIDED);
            final SubLObject var22 = Mapping.mapcar((SubLObject)module0366.$ic36$, var21);
            PrintLow.format(var2, (SubLObject)module0366.$ic37$, new SubLObject[] { var17, var16, var17, var18, var20, var22 });
        }
        return (SubLObject)module0366.NIL;
    }
    
    public static SubLObject f24940(final SubLObject var13) {
        return f24917(var13);
    }
    
    public static SubLObject f24941(final SubLObject var13) {
        if (module0366.NIL != module0035.f2015(var13)) {
            SubLObject var14 = var13;
            SubLObject var15 = (SubLObject)module0366.NIL;
            var15 = var14.first();
            while (module0366.NIL != var14) {
                if (module0366.NIL == f24916(var15)) {
                    return (SubLObject)module0366.NIL;
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
            return (SubLObject)module0366.T;
        }
        return (SubLObject)module0366.NIL;
    }
    
    public static SubLObject f24942(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var13.isCons() && module0366.NIL != f24941(var13));
    }
    
    public static SubLObject f24943(final SubLObject var25, final SubLObject var26) {
        SubLObject var28;
        final SubLObject var27 = var28 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0366.$ic39$);
        final SubLObject var29 = var28.rest();
        var28 = var28.first();
        SubLObject var30 = (SubLObject)module0366.NIL;
        SubLObject var31 = (SubLObject)module0366.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0366.$ic39$);
        var30 = var28.first();
        var28 = var28.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0366.$ic39$);
        var31 = var28.first();
        var28 = var28.rest();
        if (module0366.NIL == var28) {
            final SubLObject var32;
            var28 = (var32 = var29);
            return (SubLObject)ConsesLow.listS((SubLObject)module0366.$ic40$, (SubLObject)ConsesLow.list(var30, (SubLObject)ConsesLow.list((SubLObject)module0366.$ic41$, var31)), ConsesLow.append(var32, (SubLObject)module0366.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var27, (SubLObject)module0366.$ic39$);
        return (SubLObject)module0366.NIL;
    }
    
    public static SubLObject f24944(final SubLObject var25, final SubLObject var26) {
        SubLObject var28;
        final SubLObject var27 = var28 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0366.$ic42$);
        final SubLObject var29 = var28.rest();
        var28 = var28.first();
        SubLObject var30 = (SubLObject)module0366.NIL;
        SubLObject var31 = (SubLObject)module0366.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0366.$ic42$);
        var30 = var28.first();
        var28 = var28.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0366.$ic42$);
        var31 = var28.first();
        var28 = var28.rest();
        SubLObject var32 = (SubLObject)module0366.NIL;
        SubLObject var33 = var28;
        SubLObject var34 = (SubLObject)module0366.NIL;
        SubLObject var38_39 = (SubLObject)module0366.NIL;
        while (module0366.NIL != var33) {
            cdestructuring_bind.destructuring_bind_must_consp(var33, var27, (SubLObject)module0366.$ic42$);
            var38_39 = var33.first();
            var33 = var33.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var33, var27, (SubLObject)module0366.$ic42$);
            if (module0366.NIL == conses_high.member(var38_39, (SubLObject)module0366.$ic43$, (SubLObject)module0366.UNPROVIDED, (SubLObject)module0366.UNPROVIDED)) {
                var34 = (SubLObject)module0366.T;
            }
            if (var38_39 == module0366.$ic44$) {
                var32 = var33.first();
            }
            var33 = var33.rest();
        }
        if (module0366.NIL != var34 && module0366.NIL == var32) {
            cdestructuring_bind.cdestructuring_bind_error(var27, (SubLObject)module0366.$ic42$);
        }
        final SubLObject var35 = cdestructuring_bind.property_list_member((SubLObject)module0366.$ic45$, var28);
        final SubLObject var36 = (SubLObject)((module0366.NIL != var35) ? conses_high.cadr(var35) : module0366.NIL);
        final SubLObject var37;
        var28 = (var37 = var29);
        return (SubLObject)ConsesLow.listS((SubLObject)module0366.$ic40$, (SubLObject)ConsesLow.list(var30, (SubLObject)ConsesLow.list((SubLObject)module0366.$ic46$, var31), (SubLObject)module0366.$ic45$, var36), ConsesLow.append(var37, (SubLObject)module0366.NIL));
    }
    
    public static SubLObject f24945(final SubLObject var25, final SubLObject var26) {
        SubLObject var28;
        final SubLObject var27 = var28 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0366.$ic47$);
        final SubLObject var29 = var28.rest();
        var28 = var28.first();
        SubLObject var30 = (SubLObject)module0366.NIL;
        SubLObject var31 = (SubLObject)module0366.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0366.$ic47$);
        var30 = var28.first();
        var28 = var28.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0366.$ic47$);
        var31 = var28.first();
        var28 = var28.rest();
        SubLObject var32 = (SubLObject)module0366.NIL;
        SubLObject var33 = var28;
        SubLObject var34 = (SubLObject)module0366.NIL;
        SubLObject var49_50 = (SubLObject)module0366.NIL;
        while (module0366.NIL != var33) {
            cdestructuring_bind.destructuring_bind_must_consp(var33, var27, (SubLObject)module0366.$ic47$);
            var49_50 = var33.first();
            var33 = var33.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var33, var27, (SubLObject)module0366.$ic47$);
            if (module0366.NIL == conses_high.member(var49_50, (SubLObject)module0366.$ic48$, (SubLObject)module0366.UNPROVIDED, (SubLObject)module0366.UNPROVIDED)) {
                var34 = (SubLObject)module0366.T;
            }
            if (var49_50 == module0366.$ic44$) {
                var32 = var33.first();
            }
            var33 = var33.rest();
        }
        if (module0366.NIL != var34 && module0366.NIL == var32) {
            cdestructuring_bind.cdestructuring_bind_error(var27, (SubLObject)module0366.$ic47$);
        }
        final SubLObject var35 = cdestructuring_bind.property_list_member((SubLObject)module0366.$ic49$, var28);
        final SubLObject var36 = (SubLObject)((module0366.NIL != var35) ? conses_high.cadr(var35) : module0366.NIL);
        final SubLObject var37 = cdestructuring_bind.property_list_member((SubLObject)module0366.$ic45$, var28);
        final SubLObject var38 = (SubLObject)((module0366.NIL != var37) ? conses_high.cadr(var37) : module0366.NIL);
        final SubLObject var39;
        var28 = (var39 = var29);
        return (SubLObject)ConsesLow.list((SubLObject)module0366.$ic50$, (SubLObject)ConsesLow.list(var30, (SubLObject)ConsesLow.list((SubLObject)module0366.$ic51$, var31), var38), (SubLObject)ConsesLow.listS((SubLObject)module0366.$ic52$, (SubLObject)ConsesLow.list((SubLObject)module0366.$ic53$, var30, var36), ConsesLow.append(var39, (SubLObject)module0366.NIL)));
    }
    
    public static SubLObject f24946(final SubLObject var54, final SubLObject var19) {
        assert module0366.NIL != module0364.f24699(var54) : var54;
        assert module0366.NIL != f24941(var19) : var19;
        final SubLObject var55 = f24929((SubLObject)module0366.UNPROVIDED);
        final SubLObject var56 = module0364.f24722(var54);
        final SubLObject var57 = module0361.f24360(var56);
        module0413.f28808();
        f24923(var55, var57);
        f24925(var55, var54);
        f24926(var55, var19);
        f24928(var55, (SubLObject)module0366.NIL);
        return var55;
    }
    
    public static SubLObject f24947(final SubLObject var54, final SubLObject var57, final SubLObject var19) {
        final SubLObject var58 = f24946(var54, var19);
        f24948(var58, var57);
        f24949(var58);
        return var58;
    }
    
    public static SubLObject f24949(final SubLObject var14) {
        final SubLObject var15 = f24937(var14);
        final SubLObject var16 = module0364.f24725(var15);
        final SubLObject var17 = module0364.f24722(var15);
        module0363.f24668(var16, var14);
        module0361.f24374(var17, var14);
        module0364.f24745(var15, var14);
        f24950(var14);
        return var14;
    }
    
    public static SubLObject f24950(final SubLObject var14) {
        SubLObject var15 = f24938(var14);
        SubLObject var16 = (SubLObject)module0366.NIL;
        var16 = var15.first();
        while (module0366.NIL != var15) {
            f24951(var16, var14);
            var15 = var15.rest();
            var16 = var15.first();
        }
        return (SubLObject)module0366.NIL;
    }
    
    public static SubLObject f24952(final SubLObject var14) {
        if (module0366.NIL != f24932(var14)) {
            final SubLObject var15 = f24937(var14);
            final SubLObject var16 = f24934(var14);
            final SubLObject var17 = f24936(var14);
            f24953(var14);
            if (module0366.NIL != f24932(var14)) {
                f24954(var14);
                module0369.f25799(var14);
                SubLObject var18 = f24938(var14);
                SubLObject var19 = (SubLObject)module0366.NIL;
                var19 = var18.first();
                while (module0366.NIL != var18) {
                    f24955(var19, var14);
                    var18 = var18.rest();
                    var19 = var18.first();
                }
                final SubLObject var20 = f24956(var14);
                if (module0366.NIL != module0363.f24504(var20)) {
                    module0373.f26499(var20);
                    module0363.f24650(var20);
                    module0363.f24670(var20, var14, var16);
                }
                if (module0366.NIL != f24957(var14)) {
                    module0361.f24376(var17, var14);
                }
                if (module0366.NIL != f24958(var14)) {
                    module0361.f24378(var17, var14);
                }
                module0364.f24746(var15, var14);
                module0361.f24375(var17, var14);
            }
            return f24959(var14);
        }
        return (SubLObject)module0366.NIL;
    }
    
    public static SubLObject f24953(final SubLObject var14) {
        final SubLObject var15 = f24956(var14);
        if (module0366.NIL != module0363.f24504(var15)) {
            SubLObject var17;
            final SubLObject var16 = var17 = f24939(var14, (SubLObject)module0366.UNPROVIDED);
            SubLObject var18 = (SubLObject)module0366.NIL;
            var18 = var17.first();
            while (module0366.NIL != var17) {
                f24952(var18);
                var17 = var17.rest();
                var18 = var17.first();
            }
        }
        return (SubLObject)module0366.NIL;
    }
    
    public static SubLObject f24960(final SubLObject var14) {
        if (module0366.NIL != f24932(var14)) {
            f24954(var14);
            return f24959(var14);
        }
        return (SubLObject)module0366.NIL;
    }
    
    public static SubLObject f24959(final SubLObject var14) {
        f24928(var14, (SubLObject)module0366.$ic34$);
        f24926(var14, (SubLObject)module0366.$ic34$);
        f24927(var14, (SubLObject)module0366.$ic34$);
        f24925(var14, (SubLObject)module0366.$ic34$);
        return (SubLObject)module0366.NIL;
    }
    
    public static SubLObject f24954(final SubLObject var14) {
        f24924(var14, (SubLObject)module0366.$ic34$);
        return var14;
    }
    
    public static SubLObject f24935(final SubLObject var14) {
        assert module0366.NIL != f24916(var14) : var14;
        return f24917(var14);
    }
    
    public static SubLObject f24934(final SubLObject var14) {
        assert module0366.NIL != f24916(var14) : var14;
        return f24918(var14);
    }
    
    public static SubLObject f24937(final SubLObject var14) {
        assert module0366.NIL != f24916(var14) : var14;
        return f24919(var14);
    }
    
    public static SubLObject f24938(final SubLObject var14) {
        assert module0366.NIL != f24916(var14) : var14;
        return f24920(var14);
    }
    
    public static SubLObject f24961(final SubLObject var14) {
        assert module0366.NIL != f24916(var14) : var14;
        return f24921(var14);
    }
    
    public static SubLObject f24948(final SubLObject var14, final SubLObject var57) {
        assert module0366.NIL != f24916(var14) : var14;
        assert module0366.NIL != module0233.f15350(var57) : var57;
        f24924(var14, var57);
        return var14;
    }
    
    public static SubLObject f24951(final SubLObject var14, final SubLObject var63) {
        SubLObject var64 = f24921(var14);
        if (module0366.NIL == conses_high.member(var63, var64, Symbols.symbol_function((SubLObject)module0366.EQL), Symbols.symbol_function((SubLObject)module0366.IDENTITY))) {
            var64 = (SubLObject)ConsesLow.cons(var63, var64);
        }
        f24927(var14, var64);
        return var64;
    }
    
    public static SubLObject f24955(final SubLObject var14, final SubLObject var65) {
        if (module0366.NIL != f24932(var14)) {
            SubLObject var66 = f24921(var14);
            var66 = Sequences.delete(var65, var66, (SubLObject)module0366.UNPROVIDED, (SubLObject)module0366.UNPROVIDED, (SubLObject)module0366.UNPROVIDED, (SubLObject)module0366.UNPROVIDED, (SubLObject)module0366.UNPROVIDED);
            f24927(var14, var66);
            return var66;
        }
        return (SubLObject)module0366.NIL;
    }
    
    public static SubLObject f24962(final SubLObject var14) {
        f24928(var14, (SubLObject)module0366.T);
        module0361.f24377(f24936(var14), var14);
        return var14;
    }
    
    public static SubLObject f24963(final SubLObject var14) {
        f24928(var14, (SubLObject)module0366.NIL);
        module0361.f24378(f24936(var14), var14);
        return var14;
    }
    
    public static SubLObject f24936(final SubLObject var14) {
        final SubLObject var15 = f24937(var14);
        final SubLObject var16 = module0364.f24722(var15);
        return var16;
    }
    
    public static SubLObject f24956(final SubLObject var14) {
        final SubLObject var15 = f24937(var14);
        return module0364.f24725(var15);
    }
    
    public static SubLObject f24964(final SubLObject var14) {
        final SubLObject var15 = f24956(var14);
        final SubLObject var16 = module0363.f24509(var15);
        return var16;
    }
    
    public static SubLObject f24965(final SubLObject var14) {
        return module0373.f26175(f24937(var14));
    }
    
    public static SubLObject f24966(final SubLObject var14) {
        final SubLObject var15 = f24937(var14);
        if (module0366.NIL != module0373.f26175(var15)) {
            final SubLObject var16 = module0373.f26178(var15);
            return var16;
        }
        return (SubLObject)module0366.NIL;
    }
    
    public static SubLObject f24967(final SubLObject var14) {
        return f24968(var14);
    }
    
    public static SubLObject f24969(final SubLObject var54, final SubLObject var19) {
        return f24970(var54, var19);
    }
    
    public static SubLObject f24968(final SubLObject var14) {
        final SubLObject var15 = f24937(var14);
        final SubLObject var16 = f24938(var14);
        return f24970(var15, var16);
    }
    
    public static SubLObject f24970(final SubLObject var54, final SubLObject var19) {
        final SubLThread var55 = SubLProcess.currentSubLThread();
        if (module0366.NIL != module0361.f24171(module0364.f24722(var54)) && module0366.NIL != module0377.f26746(var54)) {
            if (module0366.NIL == Errors.$ignore_mustsP$.getDynamicValue(var55) && module0366.NIL == module0035.f1997(var19)) {
                Errors.error((SubLObject)module0366.$ic57$, var54);
            }
            final SubLObject var56 = var19.first();
            return ConsesLow.append(module0373.f26178(var54), f24968(var56));
        }
        if (module0366.NIL != module0373.f26175(var54)) {
            return module0373.f26178(var54);
        }
        if (module0366.NIL != module0375.f26571(var54) || module0366.NIL != module0383.f27227(var54)) {
            if (module0366.NIL == Errors.$ignore_mustsP$.getDynamicValue(var55) && module0366.NIL == module0035.f1997(var19)) {
                Errors.error((SubLObject)module0366.$ic57$, var54);
            }
            final SubLObject var56 = var19.first();
            return f24968(var56);
        }
        if (module0366.NIL != module0373.f26154(var54)) {
            SubLObject var57 = (SubLObject)module0366.NIL;
            SubLObject var58 = var19;
            SubLObject var59 = (SubLObject)module0366.NIL;
            var59 = var58.first();
            while (module0366.NIL != var58) {
                SubLObject var23_70 = f24968(var59);
                SubLObject var60 = (SubLObject)module0366.NIL;
                var60 = var23_70.first();
                while (module0366.NIL != var23_70) {
                    var57 = (SubLObject)ConsesLow.cons(var60, var57);
                    var23_70 = var23_70.rest();
                    var60 = var23_70.first();
                }
                var58 = var58.rest();
                var59 = var58.first();
            }
            return Sequences.nreverse(var57);
        }
        Errors.error((SubLObject)module0366.$ic58$, var54);
        return (SubLObject)module0366.NIL;
    }
    
    public static SubLObject f24971(final SubLObject var14) {
        return Sequences.nreverse(f24972(var14, (SubLObject)module0366.NIL));
    }
    
    public static SubLObject f24972(final SubLObject var14, SubLObject var67) {
        SubLObject var69;
        final SubLObject var68 = var69 = f24966(var14);
        SubLObject var70 = (SubLObject)module0366.NIL;
        var70 = var69.first();
        while (module0366.NIL != var69) {
            final SubLObject var71 = var70;
            if (module0366.NIL == conses_high.member(var71, var67, (SubLObject)module0366.$ic59$, Symbols.symbol_function((SubLObject)module0366.IDENTITY))) {
                var67 = (SubLObject)ConsesLow.cons(var71, var67);
            }
            var69 = var69.rest();
            var70 = var69.first();
        }
        SubLObject var72 = f24938(var14);
        SubLObject var73 = (SubLObject)module0366.NIL;
        var73 = var72.first();
        while (module0366.NIL != var72) {
            var67 = f24972(var73, var67);
            var72 = var72.rest();
            var73 = var72.first();
        }
        return var67;
    }
    
    public static SubLObject f24973(final SubLObject var74) {
        SubLObject var75 = (SubLObject)module0366.NIL;
        SubLObject var76 = var74;
        SubLObject var77 = (SubLObject)module0366.NIL;
        var77 = var76.first();
        while (module0366.NIL != var76) {
            var75 = ConsesLow.nconc(f24971(var77), var75);
            var76 = var76.rest();
            var77 = var76.first();
        }
        return module0035.f2269(var75, (SubLObject)module0366.UNPROVIDED, (SubLObject)module0366.UNPROVIDED, (SubLObject)module0366.UNPROVIDED, (SubLObject)module0366.UNPROVIDED, (SubLObject)module0366.UNPROVIDED);
    }
    
    public static SubLObject f24974(final SubLObject var14) {
        return module0035.sublisp_boolean(f24938(var14));
    }
    
    public static SubLObject f24975(final SubLObject var14) {
        SubLObject var15 = (SubLObject)module0366.NIL;
        SubLObject var16 = f24938(var14);
        SubLObject var17 = (SubLObject)module0366.NIL;
        var17 = var16.first();
        while (module0366.NIL != var16) {
            if (module0366.NIL != var15) {
                Errors.error((SubLObject)module0366.$ic60$, var14);
            }
            else {
                var15 = var17;
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        return var15;
    }
    
    public static SubLObject f24976(final SubLObject var14) {
        final SubLObject var15 = f24938(var14);
        SubLObject var16 = (SubLObject)module0366.NIL;
        var16 = var15.first();
        if (module0366.NIL != var15) {
            return var16;
        }
        return (SubLObject)module0366.NIL;
    }
    
    public static SubLObject f24977(final SubLObject var14) {
        SubLObject var15 = module0032.f1726((SubLObject)module0366.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0366.EQ));
        var15 = f24978(var14, var15);
        return module0032.f1753(var15);
    }
    
    public static SubLObject f24978(final SubLObject var14, SubLObject var77) {
        if (module0366.NIL == module0032.f1731(var14, var77, Symbols.symbol_function((SubLObject)module0366.EQ))) {
            var77 = module0032.f1736(var14, var77, Symbols.symbol_function((SubLObject)module0366.EQ));
            SubLObject var78 = f24938(var14);
            SubLObject var79 = (SubLObject)module0366.NIL;
            var79 = var78.first();
            while (module0366.NIL != var78) {
                var77 = f24978(var79, var77);
                var78 = var78.rest();
                var79 = var78.first();
            }
        }
        return var77;
    }
    
    public static SubLObject f24979(final SubLObject var14) {
        final SubLObject var15 = f24977(var14);
        SubLObject var16 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0366.$ic61$), var15);
        var16 = Sort.sort(var16, Symbols.symbol_function((SubLObject)module0366.$ic62$), Symbols.symbol_function((SubLObject)module0366.$ic63$));
        var16 = module0035.f2288(var16, Symbols.symbol_function((SubLObject)module0366.EQ));
        return var16;
    }
    
    public static SubLObject f24980(final SubLObject var14) {
        SubLObject var15 = f24961(var14);
        SubLObject var16 = (SubLObject)module0366.NIL;
        var16 = var15.first();
        while (module0366.NIL != var15) {
            if (module0366.NIL != module0363.f24538(var16, (SubLObject)module0366.NIL)) {
                return (SubLObject)module0366.T;
            }
            var15 = var15.rest();
            var16 = var15.first();
        }
        return (SubLObject)module0366.NIL;
    }
    
    public static SubLObject f24939(final SubLObject var14, SubLObject var52) {
        if (var52 == module0366.UNPROVIDED) {
            var52 = (SubLObject)module0366.NIL;
        }
        SubLObject var53 = (SubLObject)module0366.NIL;
        SubLObject var54 = f24961(var14);
        SubLObject var55 = (SubLObject)module0366.NIL;
        var55 = var54.first();
        while (module0366.NIL != var54) {
            if (module0366.NIL != module0363.f24538(var55, var52)) {
                var53 = (SubLObject)ConsesLow.cons(var55, var53);
            }
            var54 = var54.rest();
            var55 = var54.first();
        }
        return Sequences.nreverse(var53);
    }
    
    public static SubLObject f24981(final SubLObject var14) {
        if (module0366.NIL != f24957(var14)) {
            return (SubLObject)module0366.$ic64$;
        }
        return (SubLObject)module0366.$ic65$;
    }
    
    public static SubLObject f24957(final SubLObject var14) {
        final SubLObject var15 = f24936(var14);
        final SubLObject var16 = module0361.f24148(var15);
        return module0084.f5808(var16, var14);
    }
    
    public static SubLObject f24982(final SubLObject var14) {
        final SubLObject var15 = f24936(var14);
        final SubLObject var16 = module0361.f24148(var15);
        return module0067.f4884(var16, var14, (SubLObject)module0366.UNPROVIDED);
    }
    
    public static SubLObject f24983(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0366.NIL == f24957(var14));
    }
    
    public static SubLObject f24958(final SubLObject var14) {
        return f24922(var14);
    }
    
    public static SubLObject f24984(final SubLObject var14) {
        return module0363.f24653(f24956(var14));
    }
    
    public static SubLObject f24985(final SubLObject var14) {
        return module0363.f24651(f24956(var14));
    }
    
    public static SubLObject f24986(final SubLObject var14) {
        return module0363.f24652(f24956(var14));
    }
    
    public static SubLObject f24987(final SubLObject var14, final SubLObject var81) {
        assert module0366.NIL != module0360.f23951(var81) : var81;
        final SubLObject var82 = f24936(var14);
        final SubLObject var83 = module0361.f24148(var82);
        module0067.f4886(var83, var14, var81);
        return var14;
    }
    
    public static SubLObject f24988(final SubLObject var14) {
        final SubLObject var15 = f24936(var14);
        final SubLObject var16 = module0361.f24148(var15);
        if (module0366.$ic67$ == module0067.f4884(var16, var14, (SubLObject)module0366.UNPROVIDED)) {
            return (SubLObject)module0366.T;
        }
        return (SubLObject)module0366.NIL;
    }
    
    public static SubLObject f24989(final SubLObject var14) {
        if (module0366.NIL != module0373.f26177(var14)) {
            return module0373.f26181(var14);
        }
        return module0373.f26174(var14);
    }
    
    public static SubLObject f24990(final SubLObject var82, final SubLObject var83) {
        assert module0366.NIL != f24916(var82) : var82;
        assert module0366.NIL != f24916(var83) : var83;
        if (var82.eql(var83)) {
            return (SubLObject)module0366.T;
        }
        final SubLObject var84 = f24956(var83);
        final SubLObject var85 = f24934(var83);
        final SubLObject var86 = f24967(var83);
        return f24991(var82, var84, var85, var86);
    }
    
    public static SubLObject f24991(final SubLObject var84, final SubLObject var58, final SubLObject var85, final SubLObject var86) {
        assert module0366.NIL != f24916(var84) : var84;
        assert module0366.NIL != module0363.f24478(var58) : var58;
        if (!f24956(var84).eql(var58)) {
            return (SubLObject)module0366.NIL;
        }
        if (module0366.NIL == module0373.f26235(f24934(var84), var85)) {
            return (SubLObject)module0366.NIL;
        }
        return module0191.f11997(f24967(var84), var86);
    }
    
    public static SubLObject f24992() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24914", "S#27824", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24916", "S#26816", 1, 0, false);
        new $f24916$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24917", "S#27825", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24918", "S#27826", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24919", "S#27827", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24920", "S#27828", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24921", "S#27829", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24922", "S#27830", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24923", "S#27831", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24924", "S#27832", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24925", "S#27833", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24926", "S#27834", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24927", "S#27835", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24928", "S#27836", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24929", "S#27837", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24930", "S#27838", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24931", "S#27839", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24932", "S#27596", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24933", "S#27840", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24915", "S#27841", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24940", "S#27812", 1, 0, false);
        new $f24940$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24941", "S#27842", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24942", "S#27843", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0366", "f24943", "S#27844");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0366", "f24944", "S#27845");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0366", "f24945", "S#27846");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24946", "S#27847", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24947", "S#27848", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24949", "S#27849", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24950", "S#27850", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24952", "S#27597", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24953", "S#27851", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24960", "S#26787", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24959", "S#27852", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24954", "S#27853", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24935", "PROOF-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24934", "S#27387", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24937", "S#27854", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24938", "S#27855", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24961", "S#27856", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24948", "S#27857", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24951", "S#27858", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24955", "S#27859", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24962", "S#27860", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24963", "S#27861", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24936", "S#26817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24956", "S#27862", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24964", "S#27863", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24965", "S#27864", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24966", "S#27865", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24967", "S#27866", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24969", "S#27867", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24968", "S#27868", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24970", "S#27869", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24971", "S#27870", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24972", "S#27871", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24973", "S#27872", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24974", "S#27873", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24975", "S#27874", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24976", "S#27875", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24977", "S#27876", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24978", "S#27877", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24979", "S#27878", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24980", "S#27879", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24939", "S#27880", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24981", "S#25416", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24957", "PROOF-REJECTED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24982", "S#27881", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24983", "S#27819", 1, 0, false);
        new $f24983$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24958", "S#27882", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24984", "S#27883", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24985", "S#27884", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24986", "S#27885", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24987", "S#27886", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24988", "S#27887", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24989", "S#27888", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24990", "S#27889", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0366", "f24991", "S#27890", 4, 0, false);
        return (SubLObject)module0366.NIL;
    }
    
    public static SubLObject f24993() {
        module0366.$g3139$ = SubLFiles.defconstant("S#27891", (SubLObject)module0366.$ic0$);
        return (SubLObject)module0366.NIL;
    }
    
    public static SubLObject f24994() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0366.$g3139$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0366.$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0366.$ic9$);
        Structures.def_csetf((SubLObject)module0366.$ic10$, (SubLObject)module0366.$ic11$);
        Structures.def_csetf((SubLObject)module0366.$ic12$, (SubLObject)module0366.$ic13$);
        Structures.def_csetf((SubLObject)module0366.$ic14$, (SubLObject)module0366.$ic15$);
        Structures.def_csetf((SubLObject)module0366.$ic16$, (SubLObject)module0366.$ic17$);
        Structures.def_csetf((SubLObject)module0366.$ic18$, (SubLObject)module0366.$ic19$);
        Structures.def_csetf((SubLObject)module0366.$ic20$, (SubLObject)module0366.$ic21$);
        Equality.identity((SubLObject)module0366.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0366.$g3139$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0366.$ic33$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), module0366.$g3139$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0366.$ic38$));
        return (SubLObject)module0366.NIL;
    }
    
    public void declareFunctions() {
        f24992();
    }
    
    public void initializeVariables() {
        f24993();
    }
    
    public void runTopLevelForms() {
        f24994();
    }
    
    static {
        me = (SubLFile)new module0366();
        module0366.$g3139$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#27811", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#26816", "CYC");
        $ic2$ = SubLObjectFactory.makeInteger(211);
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10593", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24487", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#27892", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14274", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#27893", "CYC"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUID"), (SubLObject)SubLObjectFactory.makeKeyword("BINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("LINK"), (SubLObject)SubLObjectFactory.makeKeyword("SUBPROOFS"), (SubLObject)SubLObjectFactory.makeKeyword("DEPENDENTS"), (SubLObject)SubLObjectFactory.makeKeyword("PROCESSED?"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#27825", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#27826", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#27827", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#27828", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#27829", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#27830", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#27831", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#27832", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#27833", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#27834", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#27835", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#27836", "CYC"));
        $ic7$ = SubLObjectFactory.makeSymbol("S#27841", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#27824", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#26816", "CYC"));
        $ic10$ = SubLObjectFactory.makeSymbol("S#27825", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#27831", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#27826", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#27832", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#27827", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#27833", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#27828", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#27834", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#27829", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#27835", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#27830", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#27836", "CYC");
        $ic22$ = SubLObjectFactory.makeKeyword("SUID");
        $ic23$ = SubLObjectFactory.makeKeyword("BINDINGS");
        $ic24$ = SubLObjectFactory.makeKeyword("LINK");
        $ic25$ = SubLObjectFactory.makeKeyword("SUBPROOFS");
        $ic26$ = SubLObjectFactory.makeKeyword("DEPENDENTS");
        $ic27$ = SubLObjectFactory.makeKeyword("PROCESSED?");
        $ic28$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic29$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic30$ = SubLObjectFactory.makeSymbol("S#27837", "CYC");
        $ic31$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic32$ = SubLObjectFactory.makeKeyword("END");
        $ic33$ = SubLObjectFactory.makeSymbol("S#27839", "CYC");
        $ic34$ = SubLObjectFactory.makeKeyword("FREE");
        $ic35$ = SubLObjectFactory.makeString("<Invalid PROOF ~s>");
        $ic36$ = SubLObjectFactory.makeSymbol("PROOF-SUID");
        $ic37$ = SubLObjectFactory.makeString("<PROOF ~a.~a for link ~a.~a supported by ~a, supporting ~a>");
        $ic38$ = SubLObjectFactory.makeSymbol("S#27812", "CYC");
        $ic39$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#27894", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#27811", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic40$ = SubLObjectFactory.makeSymbol("DO-LIST");
        $ic41$ = SubLObjectFactory.makeSymbol("S#27855", "CYC");
        $ic42$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#27894", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#27811", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic43$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic44$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic45$ = SubLObjectFactory.makeKeyword("DONE");
        $ic46$ = SubLObjectFactory.makeSymbol("S#27876", "CYC");
        $ic47$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#27895", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#27811", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#25416", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic48$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROOF-STATUS"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic49$ = SubLObjectFactory.makeKeyword("PROOF-STATUS");
        $ic50$ = SubLObjectFactory.makeSymbol("CSOME");
        $ic51$ = SubLObjectFactory.makeSymbol("S#27856", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic53$ = SubLObjectFactory.makeSymbol("S#25418", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("S#27381", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("S#27842", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#18088", "CYC");
        $ic57$ = SubLObjectFactory.makeString("Expected link ~a to have exactly one subproof");
        $ic58$ = SubLObjectFactory.makeString("Unexpected link type for proof: ~a");
        $ic59$ = SubLObjectFactory.makeSymbol("S#14596", "CYC");
        $ic60$ = SubLObjectFactory.makeString("Expected ~s to have at most one subproof, but it had more");
        $ic61$ = SubLObjectFactory.makeSymbol("S#27862", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("<");
        $ic63$ = SubLObjectFactory.makeSymbol("S#26813", "CYC");
        $ic64$ = SubLObjectFactory.makeKeyword("REJECTED");
        $ic65$ = SubLObjectFactory.makeKeyword("PROVEN");
        $ic66$ = SubLObjectFactory.makeSymbol("S#26642", "CYC");
        $ic67$ = SubLObjectFactory.makeKeyword("ILL-FORMED");
        $ic68$ = SubLObjectFactory.makeSymbol("S#26082", "CYC");
    }
    
    public static final class $sX27811_native extends SubLStructNative
    {
        public SubLObject $suid;
        public SubLObject $bindings;
        public SubLObject $link;
        public SubLObject $subproofs;
        public SubLObject $dependents;
        public SubLObject $processedP;
        private static final SubLStructDeclNative structDecl;
        
        public $sX27811_native() {
            this.$suid = (SubLObject)CommonSymbols.NIL;
            this.$bindings = (SubLObject)CommonSymbols.NIL;
            this.$link = (SubLObject)CommonSymbols.NIL;
            this.$subproofs = (SubLObject)CommonSymbols.NIL;
            this.$dependents = (SubLObject)CommonSymbols.NIL;
            this.$processedP = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX27811_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$suid;
        }
        
        public SubLObject getField3() {
            return this.$bindings;
        }
        
        public SubLObject getField4() {
            return this.$link;
        }
        
        public SubLObject getField5() {
            return this.$subproofs;
        }
        
        public SubLObject getField6() {
            return this.$dependents;
        }
        
        public SubLObject getField7() {
            return this.$processedP;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$suid = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$bindings = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$link = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$subproofs = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$dependents = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$processedP = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX27811_native.class, module0366.$ic0$, module0366.$ic1$, module0366.$ic3$, module0366.$ic4$, new String[] { "$suid", "$bindings", "$link", "$subproofs", "$dependents", "$processedP" }, module0366.$ic5$, module0366.$ic6$, module0366.$ic7$);
        }
    }
    
    public static final class $f24916$UnaryFunction extends UnaryFunction
    {
        public $f24916$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#26816"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0366.f24916(var3);
        }
    }
    
    public static final class $f24940$UnaryFunction extends UnaryFunction
    {
        public $f24940$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#27812"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0366.f24940(var3);
        }
    }
    
    public static final class $f24983$UnaryFunction extends UnaryFunction
    {
        public $f24983$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#27819"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0366.f24983(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0366.class
	Total time: 268 ms
	
	Decompiled with Procyon 0.5.32.
*/