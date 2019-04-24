package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0645 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0645";
    public static final String myFingerPrint = "bb4b114cf67aabfdf4481bfd6b4f91b833526b4b36d465ef65b933d006315c74";
    public static SubLSymbol $g5026$;
    public static SubLSymbol $g5027$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    
    public static SubLObject f39222(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == module0645.UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)module0645.EQL);
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0100.f7254(var1, var2, var3);
        final SubLObject var6 = var4.secondMultipleValue();
        final SubLObject var7 = var4.thirdMultipleValue();
        var4.resetMultipleValues();
        f39223(var5, var6, var7);
        module0642.f39026((SubLObject)module0645.UNPROVIDED);
        f39224();
        return (SubLObject)module0645.NIL;
    }
    
    public static SubLObject f39225(final SubLObject var8, final SubLObject var9, final SubLObject var10, final SubLObject var11, final SubLObject var12) {
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0645.$ic1$, var8), (SubLObject)ConsesLow.list((SubLObject)module0645.$ic2$, var9), (SubLObject)ConsesLow.list((SubLObject)module0645.$ic3$, var10), (SubLObject)ConsesLow.list((SubLObject)module0645.$ic4$, var11), (SubLObject)ConsesLow.list((SubLObject)module0645.$ic5$, var12));
    }
    
    public static SubLObject f39226(final SubLObject var13, final SubLObject var14) {
        SubLObject var16;
        final SubLObject var15 = var16 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)module0645.$ic6$);
        final SubLObject var17 = var16.rest();
        var16 = var16.first();
        SubLObject var18 = (SubLObject)module0645.NIL;
        SubLObject var19 = var16;
        SubLObject var20 = (SubLObject)module0645.NIL;
        SubLObject var21_22 = (SubLObject)module0645.NIL;
        while (module0645.NIL != var19) {
            cdestructuring_bind.destructuring_bind_must_consp(var19, var15, (SubLObject)module0645.$ic6$);
            var21_22 = var19.first();
            var19 = var19.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var19, var15, (SubLObject)module0645.$ic6$);
            if (module0645.NIL == conses_high.member(var21_22, (SubLObject)module0645.$ic7$, (SubLObject)module0645.UNPROVIDED, (SubLObject)module0645.UNPROVIDED)) {
                var20 = (SubLObject)module0645.T;
            }
            if (var21_22 == module0645.$ic8$) {
                var18 = var19.first();
            }
            var19 = var19.rest();
        }
        if (module0645.NIL != var20 && module0645.NIL == var18) {
            cdestructuring_bind.cdestructuring_bind_error(var15, (SubLObject)module0645.$ic6$);
        }
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)module0645.$ic9$, var16);
        final SubLObject var22 = (SubLObject)((module0645.NIL != var21) ? conses_high.cadr(var21) : module0645.NIL);
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)module0645.$ic5$, var16);
        final SubLObject var24 = (SubLObject)((module0645.NIL != var23) ? conses_high.cadr(var23) : module0645.NIL);
        final SubLObject var25;
        var16 = (var25 = var17);
        final SubLObject var26 = (SubLObject)module0645.$ic10$;
        final SubLObject var27 = (SubLObject)module0645.$ic11$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0645.$ic12$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var26, (SubLObject)ConsesLow.listS((SubLObject)module0645.$ic13$, var22, var22, (SubLObject)module0645.$ic14$)), (SubLObject)ConsesLow.list(var27, (SubLObject)ConsesLow.listS((SubLObject)module0645.$ic13$, var24, var24, (SubLObject)module0645.$ic15$)), (SubLObject)ConsesLow.list((SubLObject)module0645.$ic16$, var26), (SubLObject)ConsesLow.list((SubLObject)module0645.$ic17$, var27)), ConsesLow.append(var25, (SubLObject)module0645.NIL));
    }
    
    public static SubLObject f39223(final SubLObject var5, final SubLObject var6, final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = module0645.$g5026$.getDynamicValue(var8);
        final SubLObject var10 = module0645.$g5027$.getDynamicValue(var8);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
        module0642.f39020((SubLObject)module0645.ONE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
        module0642.f39020((SubLObject)module0645.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
        module0642.f39020((SubLObject)module0645.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
        final SubLObject var11 = module0015.$g533$.currentBinding(var8);
        try {
            module0015.$g533$.bind((SubLObject)module0645.T, var8);
            if (module0645.NIL != var7) {
                final SubLObject var12 = conses_high.second(conses_high.assoc((SubLObject)module0645.$ic1$, var10, (SubLObject)module0645.UNPROVIDED, (SubLObject)module0645.UNPROVIDED));
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                final SubLObject var31_33 = module0015.$g533$.currentBinding(var8);
                try {
                    module0015.$g533$.bind((SubLObject)module0645.T, var8);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    if (module0645.NIL != var12) {
                        module0642.f39020(module0015.$g374$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                        module0642.f39020(var12);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                    final SubLObject var31_34 = module0015.$g533$.currentBinding(var8);
                    try {
                        module0015.$g533$.bind((SubLObject)module0645.T, var8);
                        SubLObject var13 = var7;
                        SubLObject var14 = (SubLObject)module0645.NIL;
                        var14 = var13.first();
                        while (module0645.NIL != var13) {
                            SubLObject var16;
                            final SubLObject var15 = var16 = var14;
                            cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)module0645.$ic18$);
                            final SubLObject var17 = var16.rest();
                            var16 = var16.first();
                            SubLObject var18 = (SubLObject)module0645.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)module0645.$ic18$);
                            var18 = var16.first();
                            var16 = var16.rest();
                            if (module0645.NIL == var16) {
                                var16 = var17;
                                SubLObject var19 = (SubLObject)module0645.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)module0645.$ic18$);
                                var19 = var16.first();
                                var16 = var16.rest();
                                if (module0645.NIL == var16) {
                                    Functions.funcall(var9, var18);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var15, (SubLObject)module0645.$ic18$);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var15, (SubLObject)module0645.$ic18$);
                            }
                            var13 = var13.rest();
                            var14 = var13.first();
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var31_34, var8);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var31_33, var8);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0645.UNPROVIDED);
            }
            if (module0645.NIL != var6) {
                final SubLObject var12 = conses_high.second(conses_high.assoc((SubLObject)module0645.$ic2$, var10, (SubLObject)module0645.UNPROVIDED, (SubLObject)module0645.UNPROVIDED));
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                final SubLObject var31_35 = module0015.$g533$.currentBinding(var8);
                try {
                    module0015.$g533$.bind((SubLObject)module0645.T, var8);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    if (module0645.NIL != var12) {
                        module0642.f39020(module0015.$g374$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                        module0642.f39020(var12);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                    final SubLObject var31_36 = module0015.$g533$.currentBinding(var8);
                    try {
                        module0015.$g533$.bind((SubLObject)module0645.T, var8);
                        SubLObject var13 = var6;
                        SubLObject var14 = (SubLObject)module0645.NIL;
                        var14 = var13.first();
                        while (module0645.NIL != var13) {
                            SubLObject var21;
                            final SubLObject var20 = var21 = var14;
                            cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0645.$ic18$);
                            final SubLObject var22 = var21.rest();
                            var21 = var21.first();
                            SubLObject var18 = (SubLObject)module0645.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0645.$ic18$);
                            var18 = var21.first();
                            var21 = var21.rest();
                            if (module0645.NIL == var21) {
                                var21 = var22;
                                SubLObject var19 = (SubLObject)module0645.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0645.$ic18$);
                                var19 = var21.first();
                                var21 = var21.rest();
                                if (module0645.NIL == var21) {
                                    Functions.funcall(var9, var18);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0645.$ic18$);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0645.$ic18$);
                            }
                            var13 = var13.rest();
                            var14 = var13.first();
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var31_36, var8);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var31_35, var8);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0645.UNPROVIDED);
            }
            if (module0645.NIL != var5) {
                final SubLObject var23 = (SubLObject)((module0645.NIL == var7 && module0645.NIL == var6 && module0645.NIL != module0035.f1997(var5)) ? module0645.$ic4$ : module0645.$ic3$);
                final SubLObject var24 = conses_high.second(conses_high.assoc(var23, var10, (SubLObject)module0645.UNPROVIDED, (SubLObject)module0645.UNPROVIDED));
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                final SubLObject var31_37 = module0015.$g533$.currentBinding(var8);
                try {
                    module0015.$g533$.bind((SubLObject)module0645.T, var8);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    if (module0645.NIL != var24) {
                        module0642.f39020(module0015.$g374$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                        module0642.f39020(var24);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                    final SubLObject var31_38 = module0015.$g533$.currentBinding(var8);
                    try {
                        module0015.$g533$.bind((SubLObject)module0645.T, var8);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g353$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                        module0642.f39020((SubLObject)module0645.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                        module0642.f39020(module0015.$g354$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                        module0642.f39020((SubLObject)module0645.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                        final SubLObject var31_39 = module0015.$g533$.currentBinding(var8);
                        try {
                            module0015.$g533$.bind((SubLObject)module0645.T, var8);
                            SubLObject var25 = var5;
                            SubLObject var26 = (SubLObject)module0645.NIL;
                            var26 = var25.first();
                            while (module0645.NIL != var25) {
                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                                final SubLObject var31_40 = module0015.$g533$.currentBinding(var8);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0645.T, var8);
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                                    final SubLObject var31_41 = module0015.$g533$.currentBinding(var8);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0645.T, var8);
                                        SubLObject var28;
                                        final SubLObject var27 = var28 = var26;
                                        SubLObject var29 = (SubLObject)module0645.NIL;
                                        SubLObject var30 = (SubLObject)module0645.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0645.$ic19$);
                                        var29 = var28.first();
                                        var28 = var28.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0645.$ic19$);
                                        var30 = var28.first();
                                        var28 = var28.rest();
                                        if (module0645.NIL == var28) {
                                            SubLObject var35_54 = var29;
                                            SubLObject var31 = (SubLObject)module0645.NIL;
                                            var31 = var35_54.first();
                                            while (module0645.NIL != var35_54) {
                                                Functions.funcall(var9, var31);
                                                var35_54 = var35_54.rest();
                                                var31 = var35_54.first();
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(var27, (SubLObject)module0645.$ic19$);
                                        }
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var31_41, var8);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var31_40, var8);
                                }
                                module0642.f39020(module0015.$g365$.getGlobalValue());
                                module0642.f39029((SubLObject)module0645.UNPROVIDED);
                                var25 = var25.rest();
                                var26 = var25.first();
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var31_39, var8);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var31_38, var8);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var31_37, var8);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0645.UNPROVIDED);
            }
        }
        finally {
            module0015.$g533$.rebind(var11, var8);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0645.NIL;
    }
    
    public static SubLObject f39224() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0645.$g5027$.getDynamicValue(var4);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
        module0642.f39020((SubLObject)module0645.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
        final SubLObject var6 = module0015.$g533$.currentBinding(var4);
        try {
            module0015.$g533$.bind((SubLObject)module0645.T, var4);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
            final SubLObject var31_55 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)module0645.T, var4);
                SubLObject var7 = conses_high.second(conses_high.assoc((SubLObject)module0645.$ic5$, var5, (SubLObject)module0645.UNPROVIDED, (SubLObject)module0645.UNPROVIDED));
                module0642.f39020(module0015.$g360$.getGlobalValue());
                if (module0645.NIL != var7) {
                    module0642.f39020(module0015.$g374$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                    module0642.f39020(var7);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                final SubLObject var31_56 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)module0645.T, var4);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                    module0642.f39020((SubLObject)module0645.ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                    final SubLObject var31_57 = module0015.$g533$.currentBinding(var4);
                    try {
                        module0015.$g533$.bind((SubLObject)module0645.T, var4);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                        final SubLObject var31_58 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)module0645.T, var4);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0645.$ic20$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                            final SubLObject var31_59 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)module0645.T, var4);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39020(module0015.$g242$.getGlobalValue());
                                module0642.f39019((SubLObject)module0645.$ic21$);
                                module0642.f39020(module0015.$g243$.getGlobalValue());
                                module0642.f39020(module0015.$g210$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var31_59, var4);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var31_58, var4);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0645.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                        final SubLObject var31_60 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)module0645.T, var4);
                            var7 = conses_high.second(conses_high.assoc((SubLObject)module0645.$ic1$, var5, (SubLObject)module0645.UNPROVIDED, (SubLObject)module0645.UNPROVIDED));
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            if (module0645.NIL != var7) {
                                module0642.f39020(module0015.$g374$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                                module0642.f39020(var7);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                            final SubLObject var31_61 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)module0645.T, var4);
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                module0642.f39020(module0015.$g221$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                                module0642.f39020((SubLObject)module0645.MINUS_ONE_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                                final SubLObject var31_62 = module0015.$g533$.currentBinding(var4);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0645.T, var4);
                                    module0642.f39019((SubLObject)module0645.$ic22$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var31_62, var4);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var31_61, var4);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var31_60, var4);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0645.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                        final SubLObject var31_63 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)module0645.T, var4);
                            var7 = conses_high.second(conses_high.assoc((SubLObject)module0645.$ic2$, var5, (SubLObject)module0645.UNPROVIDED, (SubLObject)module0645.UNPROVIDED));
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            if (module0645.NIL != var7) {
                                module0642.f39020(module0015.$g374$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                                module0642.f39020(var7);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                            final SubLObject var31_64 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)module0645.T, var4);
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                module0642.f39020(module0015.$g221$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                                module0642.f39020((SubLObject)module0645.MINUS_ONE_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                                final SubLObject var31_65 = module0015.$g533$.currentBinding(var4);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0645.T, var4);
                                    module0642.f39019((SubLObject)module0645.$ic23$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var31_65, var4);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var31_64, var4);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var31_63, var4);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0645.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                        final SubLObject var31_66 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)module0645.T, var4);
                            var7 = conses_high.second(conses_high.assoc((SubLObject)module0645.$ic3$, var5, (SubLObject)module0645.UNPROVIDED, (SubLObject)module0645.UNPROVIDED));
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            if (module0645.NIL != var7) {
                                module0642.f39020(module0015.$g374$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                                module0642.f39020(var7);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                            final SubLObject var31_67 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)module0645.T, var4);
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                module0642.f39020(module0015.$g221$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                                module0642.f39020((SubLObject)module0645.MINUS_ONE_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                                final SubLObject var31_68 = module0015.$g533$.currentBinding(var4);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0645.T, var4);
                                    module0642.f39019((SubLObject)module0645.$ic24$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var31_68, var4);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var31_67, var4);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var31_66, var4);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0645.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                        final SubLObject var31_69 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)module0645.T, var4);
                            var7 = conses_high.second(conses_high.assoc((SubLObject)module0645.$ic4$, var5, (SubLObject)module0645.UNPROVIDED, (SubLObject)module0645.UNPROVIDED));
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            if (module0645.NIL != var7) {
                                module0642.f39020(module0015.$g374$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                                module0642.f39020(var7);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                            final SubLObject var31_70 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)module0645.T, var4);
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                module0642.f39020(module0015.$g221$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                                module0642.f39020((SubLObject)module0645.MINUS_ONE_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0645.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0645.UNPROVIDED);
                                final SubLObject var31_71 = module0015.$g533$.currentBinding(var4);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0645.T, var4);
                                    module0642.f39019((SubLObject)module0645.$ic25$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var31_71, var4);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var31_70, var4);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var31_69, var4);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0645.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var31_57, var4);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var31_56, var4);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var31_55, var4);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0645.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var6, var4);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0645.NIL;
    }
    
    public static SubLObject f39227(final SubLObject var40) {
        module0642.f39020(module0015.$g459$.getGlobalValue());
        module0642.f39019((SubLObject)module0645.$ic26$);
        module0642.f39019(var40);
        module0642.f39019((SubLObject)module0645.$ic27$);
        module0642.f39020(module0015.$g460$.getGlobalValue());
        return (SubLObject)module0645.NIL;
    }
    
    public static SubLObject f39228() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0645", "f39222", "S#42999", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0645", "f39225", "S#43000", 5, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0645", "f39226", "S#43001");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0645", "f39223", "S#43002", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0645", "f39224", "S#43003", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0645", "f39227", "S#43004", 1, 0, false);
        return (SubLObject)module0645.NIL;
    }
    
    public static SubLObject f39229() {
        module0645.$g5026$ = SubLFiles.defparameter("S#43005", (SubLObject)module0645.$ic0$);
        module0645.$g5027$ = SubLFiles.defparameter("S#43006", (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0645.$ic1$, module0015.$g495$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)module0645.$ic2$, module0015.$g510$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)module0645.$ic3$, module0015.$g501$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)module0645.$ic4$, module0015.$g488$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)module0645.$ic5$, module0015.$g492$.getGlobalValue())));
        return (SubLObject)module0645.NIL;
    }
    
    public static SubLObject f39230() {
        return (SubLObject)module0645.NIL;
    }
    
    public void declareFunctions() {
        f39228();
    }
    
    public void initializeVariables() {
        f39229();
    }
    
    public void runTopLevelForms() {
        f39230();
    }
    
    static {
        me = (SubLFile)new module0645();
        module0645.$g5026$ = null;
        module0645.$g5027$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#43004", "CYC");
        $ic1$ = SubLObjectFactory.makeKeyword("NAKED");
        $ic2$ = SubLObjectFactory.makeKeyword("ISOLATED");
        $ic3$ = SubLObjectFactory.makeKeyword("CONNECTED");
        $ic4$ = SubLObjectFactory.makeKeyword("ALL-CONNECTED");
        $ic5$ = SubLObjectFactory.makeKeyword("COLORMAP");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#43007", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43008", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RENDERFN"), (SubLObject)SubLObjectFactory.makeKeyword("COLORMAP"));
        $ic8$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic9$ = SubLObjectFactory.makeKeyword("RENDERFN");
        $ic10$ = SubLObjectFactory.makeUninternedSymbol("US#4A45A9C");
        $ic11$ = SubLObjectFactory.makeUninternedSymbol("US#12AF1DF");
        $ic12$ = SubLObjectFactory.makeSymbol("CLET");
        $ic13$ = SubLObjectFactory.makeSymbol("FIF");
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43005", "CYC"));
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43006", "CYC"));
        $ic16$ = SubLObjectFactory.makeSymbol("S#43005", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#43006", "CYC");
        $ic18$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9182", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#9175", "CYC"));
        $ic19$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2953", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9175", "CYC"));
        $ic20$ = SubLObjectFactory.makeKeyword("CENTER");
        $ic21$ = SubLObjectFactory.makeString("Color Key");
        $ic22$ = SubLObjectFactory.makeString("Naked terms.");
        $ic23$ = SubLObjectFactory.makeString("Isolated terms.");
        $ic24$ = SubLObjectFactory.makeString("Connected terms.");
        $ic25$ = SubLObjectFactory.makeString("All connected.");
        $ic26$ = SubLObjectFactory.makeString("[");
        $ic27$ = SubLObjectFactory.makeString("]");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0645.class
	Total time: 376 ms
	
	Decompiled with Procyon 0.5.32.
*/