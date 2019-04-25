package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        if (var3 == UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)EQL);
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0100.f7254(var1, var2, var3);
        final SubLObject var6 = var4.secondMultipleValue();
        final SubLObject var7 = var4.thirdMultipleValue();
        var4.resetMultipleValues();
        f39223(var5, var6, var7);
        module0642.f39026((SubLObject)UNPROVIDED);
        f39224();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39225(final SubLObject var8, final SubLObject var9, final SubLObject var10, final SubLObject var11, final SubLObject var12) {
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic1$, var8), (SubLObject)ConsesLow.list((SubLObject)$ic2$, var9), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var10), (SubLObject)ConsesLow.list((SubLObject)$ic4$, var11), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var12));
    }
    
    public static SubLObject f39226(final SubLObject var13, final SubLObject var14) {
        SubLObject var16;
        final SubLObject var15 = var16 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)$ic6$);
        final SubLObject var17 = var16.rest();
        var16 = var16.first();
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = var16;
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21_22 = (SubLObject)NIL;
        while (NIL != var19) {
            cdestructuring_bind.destructuring_bind_must_consp(var19, var15, (SubLObject)$ic6$);
            var21_22 = var19.first();
            var19 = var19.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var19, var15, (SubLObject)$ic6$);
            if (NIL == conses_high.member(var21_22, (SubLObject)$ic7$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var20 = (SubLObject)T;
            }
            if (var21_22 == $ic8$) {
                var18 = var19.first();
            }
            var19 = var19.rest();
        }
        if (NIL != var20 && NIL == var18) {
            cdestructuring_bind.cdestructuring_bind_error(var15, (SubLObject)$ic6$);
        }
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)$ic9$, var16);
        final SubLObject var22 = (SubLObject)((NIL != var21) ? conses_high.cadr(var21) : NIL);
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var16);
        final SubLObject var24 = (SubLObject)((NIL != var23) ? conses_high.cadr(var23) : NIL);
        final SubLObject var25;
        var16 = (var25 = var17);
        final SubLObject var26 = (SubLObject)$ic10$;
        final SubLObject var27 = (SubLObject)$ic11$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var26, (SubLObject)ConsesLow.listS((SubLObject)$ic13$, var22, var22, (SubLObject)$ic14$)), (SubLObject)ConsesLow.list(var27, (SubLObject)ConsesLow.listS((SubLObject)$ic13$, var24, var24, (SubLObject)$ic15$)), (SubLObject)ConsesLow.list((SubLObject)$ic16$, var26), (SubLObject)ConsesLow.list((SubLObject)$ic17$, var27)), ConsesLow.append(var25, (SubLObject)NIL));
    }
    
    public static SubLObject f39223(final SubLObject var5, final SubLObject var6, final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = $g5026$.getDynamicValue(var8);
        final SubLObject var10 = $g5027$.getDynamicValue(var8);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ONE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var11 = module0015.$g533$.currentBinding(var8);
        try {
            module0015.$g533$.bind((SubLObject)T, var8);
            if (NIL != var7) {
                final SubLObject var12 = conses_high.second(conses_high.assoc((SubLObject)$ic1$, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var31_33 = module0015.$g533$.currentBinding(var8);
                try {
                    module0015.$g533$.bind((SubLObject)T, var8);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    if (NIL != var12) {
                        module0642.f39020(module0015.$g374$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var12);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var31_34 = module0015.$g533$.currentBinding(var8);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var8);
                        SubLObject var13 = var7;
                        SubLObject var14 = (SubLObject)NIL;
                        var14 = var13.first();
                        while (NIL != var13) {
                            SubLObject var16;
                            final SubLObject var15 = var16 = var14;
                            cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)$ic18$);
                            final SubLObject var17 = var16.rest();
                            var16 = var16.first();
                            SubLObject var18 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)$ic18$);
                            var18 = var16.first();
                            var16 = var16.rest();
                            if (NIL == var16) {
                                var16 = var17;
                                SubLObject var19 = (SubLObject)NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)$ic18$);
                                var19 = var16.first();
                                var16 = var16.rest();
                                if (NIL == var16) {
                                    Functions.funcall(var9, var18);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var15, (SubLObject)$ic18$);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var15, (SubLObject)$ic18$);
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
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            if (NIL != var6) {
                final SubLObject var12 = conses_high.second(conses_high.assoc((SubLObject)$ic2$, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var31_35 = module0015.$g533$.currentBinding(var8);
                try {
                    module0015.$g533$.bind((SubLObject)T, var8);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    if (NIL != var12) {
                        module0642.f39020(module0015.$g374$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var12);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var31_36 = module0015.$g533$.currentBinding(var8);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var8);
                        SubLObject var13 = var6;
                        SubLObject var14 = (SubLObject)NIL;
                        var14 = var13.first();
                        while (NIL != var13) {
                            SubLObject var21;
                            final SubLObject var20 = var21 = var14;
                            cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic18$);
                            final SubLObject var22 = var21.rest();
                            var21 = var21.first();
                            SubLObject var18 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic18$);
                            var18 = var21.first();
                            var21 = var21.rest();
                            if (NIL == var21) {
                                var21 = var22;
                                SubLObject var19 = (SubLObject)NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic18$);
                                var19 = var21.first();
                                var21 = var21.rest();
                                if (NIL == var21) {
                                    Functions.funcall(var9, var18);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic18$);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic18$);
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
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            if (NIL != var5) {
                final SubLObject var23 = (SubLObject)((NIL == var7 && NIL == var6 && NIL != module0035.f1997(var5)) ? $ic4$ : $ic3$);
                final SubLObject var24 = conses_high.second(conses_high.assoc(var23, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var31_37 = module0015.$g533$.currentBinding(var8);
                try {
                    module0015.$g533$.bind((SubLObject)T, var8);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    if (NIL != var24) {
                        module0642.f39020(module0015.$g374$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var24);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var31_38 = module0015.$g533$.currentBinding(var8);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var8);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g353$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g354$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var31_39 = module0015.$g533$.currentBinding(var8);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var8);
                            SubLObject var25 = var5;
                            SubLObject var26 = (SubLObject)NIL;
                            var26 = var25.first();
                            while (NIL != var25) {
                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var31_40 = module0015.$g533$.currentBinding(var8);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var8);
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var31_41 = module0015.$g533$.currentBinding(var8);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var8);
                                        SubLObject var28;
                                        final SubLObject var27 = var28 = var26;
                                        SubLObject var29 = (SubLObject)NIL;
                                        SubLObject var30 = (SubLObject)NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)$ic19$);
                                        var29 = var28.first();
                                        var28 = var28.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)$ic19$);
                                        var30 = var28.first();
                                        var28 = var28.rest();
                                        if (NIL == var28) {
                                            SubLObject var35_54 = var29;
                                            SubLObject var31 = (SubLObject)NIL;
                                            var31 = var35_54.first();
                                            while (NIL != var35_54) {
                                                Functions.funcall(var9, var31);
                                                var35_54 = var35_54.rest();
                                                var31 = var35_54.first();
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(var27, (SubLObject)$ic19$);
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
                                module0642.f39029((SubLObject)UNPROVIDED);
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
                module0642.f39029((SubLObject)UNPROVIDED);
            }
        }
        finally {
            module0015.$g533$.rebind(var11, var8);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39224() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = $g5027$.getDynamicValue(var4);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0015.$g533$.currentBinding(var4);
        try {
            module0015.$g533$.bind((SubLObject)T, var4);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var31_55 = module0015.$g533$.currentBinding(var4);
            try {
                module0015.$g533$.bind((SubLObject)T, var4);
                SubLObject var7 = conses_high.second(conses_high.assoc((SubLObject)$ic5$, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                module0642.f39020(module0015.$g360$.getGlobalValue());
                if (NIL != var7) {
                    module0642.f39020(module0015.$g374$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var7);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var31_56 = module0015.$g533$.currentBinding(var4);
                try {
                    module0015.$g533$.bind((SubLObject)T, var4);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var31_57 = module0015.$g533$.currentBinding(var4);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var4);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var31_58 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var4);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic20$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var31_59 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var4);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39020(module0015.$g242$.getGlobalValue());
                                module0642.f39019((SubLObject)$ic21$);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var31_60 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var4);
                            var7 = conses_high.second(conses_high.assoc((SubLObject)$ic1$, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            if (NIL != var7) {
                                module0642.f39020(module0015.$g374$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var7);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var31_61 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var4);
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                module0642.f39020(module0015.$g221$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)MINUS_ONE_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var31_62 = module0015.$g533$.currentBinding(var4);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var4);
                                    module0642.f39019((SubLObject)$ic22$);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var31_63 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var4);
                            var7 = conses_high.second(conses_high.assoc((SubLObject)$ic2$, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            if (NIL != var7) {
                                module0642.f39020(module0015.$g374$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var7);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var31_64 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var4);
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                module0642.f39020(module0015.$g221$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)MINUS_ONE_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var31_65 = module0015.$g533$.currentBinding(var4);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var4);
                                    module0642.f39019((SubLObject)$ic23$);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var31_66 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var4);
                            var7 = conses_high.second(conses_high.assoc((SubLObject)$ic3$, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            if (NIL != var7) {
                                module0642.f39020(module0015.$g374$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var7);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var31_67 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var4);
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                module0642.f39020(module0015.$g221$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)MINUS_ONE_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var31_68 = module0015.$g533$.currentBinding(var4);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var4);
                                    module0642.f39019((SubLObject)$ic24$);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var31_69 = module0015.$g533$.currentBinding(var4);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var4);
                            var7 = conses_high.second(conses_high.assoc((SubLObject)$ic4$, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            if (NIL != var7) {
                                module0642.f39020(module0015.$g374$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var7);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var31_70 = module0015.$g533$.currentBinding(var4);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var4);
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                module0642.f39020(module0015.$g221$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)MINUS_ONE_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var31_71 = module0015.$g533$.currentBinding(var4);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var4);
                                    module0642.f39019((SubLObject)$ic25$);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
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
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var6, var4);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39227(final SubLObject var40) {
        module0642.f39020(module0015.$g459$.getGlobalValue());
        module0642.f39019((SubLObject)$ic26$);
        module0642.f39019(var40);
        module0642.f39019((SubLObject)$ic27$);
        module0642.f39020(module0015.$g460$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39228() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0645", "f39222", "S#42999", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0645", "f39225", "S#43000", 5, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0645", "f39226", "S#43001");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0645", "f39223", "S#43002", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0645", "f39224", "S#43003", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0645", "f39227", "S#43004", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39229() {
        $g5026$ = SubLFiles.defparameter("S#43005", (SubLObject)$ic0$);
        $g5027$ = SubLFiles.defparameter("S#43006", (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic1$, module0015.$g495$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)$ic2$, module0015.$g510$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)$ic3$, module0015.$g501$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)$ic4$, module0015.$g488$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)$ic5$, module0015.$g492$.getGlobalValue())));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39230() {
        return (SubLObject)NIL;
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
        $g5026$ = null;
        $g5027$ = null;
        $ic0$ = makeSymbol("S#43004", "CYC");
        $ic1$ = makeKeyword("NAKED");
        $ic2$ = makeKeyword("ISOLATED");
        $ic3$ = makeKeyword("CONNECTED");
        $ic4$ = makeKeyword("ALL-CONNECTED");
        $ic5$ = makeKeyword("COLORMAP");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#43007", "CYC"), (SubLObject)makeSymbol("S#43008", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic7$ = ConsesLow.list((SubLObject)makeKeyword("RENDERFN"), (SubLObject)makeKeyword("COLORMAP"));
        $ic8$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic9$ = makeKeyword("RENDERFN");
        $ic10$ = makeUninternedSymbol("US#4A45A9C");
        $ic11$ = makeUninternedSymbol("US#12AF1DF");
        $ic12$ = makeSymbol("CLET");
        $ic13$ = makeSymbol("FIF");
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("S#43005", "CYC"));
        $ic15$ = ConsesLow.list((SubLObject)makeSymbol("S#43006", "CYC"));
        $ic16$ = makeSymbol("S#43005", "CYC");
        $ic17$ = makeSymbol("S#43006", "CYC");
        $ic18$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9182", "CYC")), (SubLObject)makeSymbol("S#9175", "CYC"));
        $ic19$ = ConsesLow.list((SubLObject)makeSymbol("S#2953", "CYC"), (SubLObject)makeSymbol("S#9175", "CYC"));
        $ic20$ = makeKeyword("CENTER");
        $ic21$ = makeString("Color Key");
        $ic22$ = makeString("Naked terms.");
        $ic23$ = makeString("Isolated terms.");
        $ic24$ = makeString("Connected terms.");
        $ic25$ = makeString("All connected.");
        $ic26$ = makeString("[");
        $ic27$ = makeString("]");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 376 ms
	
	Decompiled with Procyon 0.5.32.
*/