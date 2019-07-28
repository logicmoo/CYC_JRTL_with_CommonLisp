package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0081 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0081";
    public static final String myFingerPrint = "70fcfd1edec2c251ea139afe430b22849d81a16a900fcc68bb17bbbeff9dd4e6";
    public static SubLSymbol $g1163$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
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
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    
    public static SubLObject f5548(final SubLObject var1) {
        assert NIL != module0079.f5404(var1) : var1;
        return f5549(var1);
    }
    
    public static SubLObject f5550(final SubLObject var2, final SubLObject var3) {
        f5551(var2, var3, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5552(final SubLObject var2) {
        return (SubLObject)((var2.getClass() == $sX7173_native.class) ? T : NIL);
    }
    
    public static SubLObject f5553(final SubLObject var2) {
        assert NIL != f5552(var2) : var2;
        return var2.getField2();
    }
    
    public static SubLObject f5554(final SubLObject var2) {
        assert NIL != f5552(var2) : var2;
        return var2.getField3();
    }
    
    public static SubLObject f5555(final SubLObject var2, final SubLObject var5) {
        assert NIL != f5552(var2) : var2;
        return var2.setField2(var5);
    }
    
    public static SubLObject f5556(final SubLObject var2, final SubLObject var5) {
        assert NIL != f5552(var2) : var2;
        return var2.setField3(var5);
    }
    
    public static SubLObject f5557(SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLObject var7 = (SubLObject)new $sX7173_native();
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var8 = (SubLObject)NIL, var8 = var6; NIL != var8; var8 = conses_high.cddr(var8)) {
            var9 = var8.first();
            var10 = conses_high.cadr(var8);
            var11 = var9;
            if (var11.eql((SubLObject)$ic14$)) {
                f5555(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic15$)) {
                f5556(var7, var10);
            }
            else {
                Errors.error((SubLObject)$ic16$, var9);
            }
        }
        return var7;
    }
    
    public static SubLObject f5558(final SubLObject var12, final SubLObject var13) {
        Functions.funcall(var13, var12, (SubLObject)$ic17$, (SubLObject)$ic18$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var13, var12, (SubLObject)$ic19$, (SubLObject)$ic14$, f5553(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic19$, (SubLObject)$ic15$, f5554(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic20$, (SubLObject)$ic18$, (SubLObject)TWO_INTEGER);
        return var12;
    }
    
    public static SubLObject f5559(final SubLObject var12, final SubLObject var13) {
        return f5558(var12, var13);
    }
    
    public static SubLObject f5551(final SubLObject var14, final SubLObject var3, final SubLObject var15) {
        PrintLow.format(var3, (SubLObject)$ic22$, f5560(var14));
        return var14;
    }
    
    public static SubLObject f5561(final SubLObject var14) {
        return (SubLObject)T;
    }
    
    public static SubLObject f5562(final SubLObject var14) {
        SubLObject var15 = (SubLObject)NIL;
        final SubLObject var16 = f5563(var14);
        SubLObject var17 = (SubLObject)NIL;
        try {
            var17 = ReadWriteLocks.rw_lock_seize_read_lock(var16);
            var15 = module0079.f5406(f5560(var14));
        }
        finally {
            if (NIL != var17) {
                ReadWriteLocks.rw_lock_release_read_lock(var16);
            }
        }
        return var15;
    }
    
    public static SubLObject f5564(final SubLObject var14) {
        SubLObject var15 = (SubLObject)NIL;
        final SubLObject var16 = f5563(var14);
        SubLObject var17 = (SubLObject)NIL;
        try {
            var17 = ReadWriteLocks.rw_lock_seize_read_lock(var16);
            var15 = module0079.f5408(f5560(var14));
        }
        finally {
            if (NIL != var17) {
                ReadWriteLocks.rw_lock_release_read_lock(var16);
            }
        }
        return var15;
    }
    
    public static SubLObject f5565(final SubLObject var14, final SubLObject var20, final SubLObject var21) {
        return f5566(var14, var20, var21);
    }
    
    public static SubLObject f5566(final SubLObject var22, final SubLObject var20, final SubLObject var21) {
        SubLObject var23 = (SubLObject)NIL;
        final SubLObject var24 = f5563(var22);
        SubLObject var25 = (SubLObject)NIL;
        try {
            var25 = ReadWriteLocks.rw_lock_seize_write_lock(var24);
            var23 = module0079.f5412(f5560(var22), var20, var21);
        }
        finally {
            if (NIL != var25) {
                ReadWriteLocks.rw_lock_release_write_lock(var24);
            }
        }
        return var23;
    }
    
    public static SubLObject f5567(final SubLObject var14, final SubLObject var20, final SubLObject var26) {
        return f5568(var14, var20, var26);
    }
    
    public static SubLObject f5568(final SubLObject var22, final SubLObject var20, final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = (SubLObject)NIL;
        final SubLObject var30 = f5563(var22);
        SubLObject var31 = (SubLObject)NIL;
        try {
            var31 = ReadWriteLocks.rw_lock_seize_read_lock(var30);
            var27.resetMultipleValues();
            final SubLObject var29_30 = module0079.f5414(f5560(var22), var20, var26);
            final SubLObject var31_32 = var27.secondMultipleValue();
            var27.resetMultipleValues();
            var28 = var29_30;
            var29 = var31_32;
        }
        finally {
            if (NIL != var31) {
                ReadWriteLocks.rw_lock_release_read_lock(var30);
            }
        }
        return Values.values(var28, var29);
    }
    
    public static SubLObject f5569(final SubLObject var14, final SubLObject var20, final SubLObject var26) {
        return f5570(var14, var20, var26);
    }
    
    public static SubLObject f5570(final SubLObject var22, final SubLObject var20, final SubLObject var26) {
        SubLObject var27 = (SubLObject)NIL;
        final SubLObject var28 = f5563(var22);
        SubLObject var29 = (SubLObject)NIL;
        try {
            var29 = ReadWriteLocks.rw_lock_seize_read_lock(var28);
            var27 = module0079.f5416(f5560(var22), var20, var26);
        }
        finally {
            if (NIL != var29) {
                ReadWriteLocks.rw_lock_release_read_lock(var28);
            }
        }
        return var27;
    }
    
    public static SubLObject f5571(final SubLObject var14, final SubLObject var20) {
        return f5572(var14, var20);
    }
    
    public static SubLObject f5572(final SubLObject var22, final SubLObject var20) {
        SubLObject var23 = (SubLObject)NIL;
        final SubLObject var24 = f5563(var22);
        SubLObject var25 = (SubLObject)NIL;
        try {
            var25 = ReadWriteLocks.rw_lock_seize_write_lock(var24);
            var23 = module0079.f5418(f5560(var22), var20);
        }
        finally {
            if (NIL != var25) {
                ReadWriteLocks.rw_lock_release_write_lock(var24);
            }
        }
        return var23;
    }
    
    public static SubLObject f5573(final SubLObject var14, final SubLObject var19, final SubLObject var16) {
        SubLObject var20 = (SubLObject)NIL;
        final SubLObject var21 = f5563(var14);
        SubLObject var22 = (SubLObject)NIL;
        try {
            var22 = ReadWriteLocks.rw_lock_seize_read_lock(var21);
            var20 = f5549(module0079.f5427(f5560(var14)));
        }
        finally {
            if (NIL != var22) {
                ReadWriteLocks.rw_lock_release_read_lock(var21);
            }
        }
        return var20;
    }
    
    public static SubLObject f5574(final SubLObject var14) {
        SubLObject var15 = (SubLObject)NIL;
        final SubLObject var16 = f5563(var14);
        SubLObject var17 = (SubLObject)NIL;
        try {
            var17 = ReadWriteLocks.rw_lock_seize_read_lock(var16);
            var15 = module0079.f5430(f5560(var14), (SubLObject)UNPROVIDED);
        }
        finally {
            if (NIL != var17) {
                ReadWriteLocks.rw_lock_release_read_lock(var16);
            }
        }
        return var15;
    }
    
    public static SubLObject f5575(final SubLObject var14) {
        SubLObject var15 = (SubLObject)NIL;
        final SubLObject var16 = f5563(var14);
        SubLObject var17 = (SubLObject)NIL;
        try {
            var17 = ReadWriteLocks.rw_lock_seize_read_lock(var16);
            var15 = module0079.f5424(f5560(var14));
        }
        finally {
            if (NIL != var17) {
                ReadWriteLocks.rw_lock_release_read_lock(var16);
            }
        }
        return var15;
    }
    
    public static SubLObject f5576(final SubLObject var14) {
        return f5577(var14);
    }
    
    public static SubLObject f5577(final SubLObject var22) {
        SubLObject var23 = (SubLObject)NIL;
        final SubLObject var24 = f5563(var22);
        SubLObject var25 = (SubLObject)NIL;
        try {
            var25 = ReadWriteLocks.rw_lock_seize_write_lock(var24);
            var23 = module0079.f5420(f5560(var22));
        }
        finally {
            if (NIL != var25) {
                ReadWriteLocks.rw_lock_release_write_lock(var24);
            }
        }
        return var23;
    }
    
    public static SubLObject f5578(final SubLObject var14) {
        SubLObject var15 = (SubLObject)NIL;
        final SubLObject var16 = f5563(var14);
        SubLObject var17 = (SubLObject)NIL;
        try {
            var17 = ReadWriteLocks.rw_lock_seize_read_lock(var16);
            var15 = module0079.f5433(f5560(var14));
        }
        finally {
            if (NIL != var17) {
                ReadWriteLocks.rw_lock_release_read_lock(var16);
            }
        }
        return var15;
    }
    
    public static SubLObject f5579(final SubLObject var14) {
        SubLObject var15 = (SubLObject)NIL;
        final SubLObject var16 = f5563(var14);
        SubLObject var17 = (SubLObject)NIL;
        try {
            var17 = ReadWriteLocks.rw_lock_seize_read_lock(var16);
            var15 = module0079.f5435(f5560(var14));
        }
        finally {
            if (NIL != var17) {
                ReadWriteLocks.rw_lock_release_read_lock(var16);
            }
        }
        return var15;
    }
    
    public static SubLObject f5549(final SubLObject var1) {
        final SubLObject var2 = f5557((SubLObject)UNPROVIDED);
        f5555(var2, var1);
        f5556(var2, ReadWriteLocks.new_rw_lock((SubLObject)$ic36$));
        return var2;
    }
    
    public static SubLObject f5560(final SubLObject var1) {
        assert NIL != f5552(var1) : var1;
        return f5553(var1);
    }
    
    public static SubLObject f5563(final SubLObject var1) {
        assert NIL != f5552(var1) : var1;
        return f5554(var1);
    }
    
    public static SubLObject f5580(final SubLObject var33, final SubLObject var34) {
        SubLObject var36;
        final SubLObject var35 = var36 = var33.rest();
        SubLObject var37 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic37$);
        var37 = var36.first();
        final SubLObject var38;
        var36 = (var38 = var36.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic38$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic39$, var37)), ConsesLow.append(var38, (SubLObject)NIL));
    }
    
    public static SubLObject f5581(final SubLObject var33, final SubLObject var34) {
        SubLObject var36;
        final SubLObject var35 = var36 = var33.rest();
        SubLObject var37 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic37$);
        var37 = var36.first();
        final SubLObject var38;
        var36 = (var38 = var36.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic40$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic39$, var37)), ConsesLow.append(var38, (SubLObject)NIL));
    }
    
    public static SubLObject f5582(final SubLObject var14) {
        return f5583(var14);
    }
    
    public static SubLObject f5583(final SubLObject var1) {
        return Sxhash.sxhash(f5553(var1));
    }
    
    public static SubLObject f5584() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5548", "S#7175", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5550", "S#7176", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5552", "S#7174", 1, 0, false);
        new $f5552$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5553", "S#7177", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5554", "S#7178", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5555", "S#7179", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5556", "S#7180", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5557", "S#7181", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5558", "S#7182", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5559", "S#7183", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5551", "S#7184", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5561", "S#7185", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5562", "S#7186", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5564", "S#7187", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5565", "S#7188", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5566", "S#7189", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5567", "S#7190", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5568", "S#7191", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5569", "S#7192", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5570", "S#7193", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5571", "S#7194", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5572", "S#7195", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5573", "S#7196", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5574", "S#7197", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5575", "S#7198", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5576", "S#7199", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5577", "S#7200", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5578", "S#7201", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5579", "S#7202", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5549", "S#7203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5560", "S#7204", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5563", "S#7205", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0081", "f5580", "S#7206");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0081", "f5581", "S#7207");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5582", "S#7208", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0081", "f5583", "S#7209", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5585() {
        $g1163$ = SubLFiles.defconstant("S#7210", (SubLObject)$ic1$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5586() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1163$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic9$);
        Structures.def_csetf((SubLObject)$ic10$, (SubLObject)$ic11$);
        Structures.def_csetf((SubLObject)$ic12$, (SubLObject)$ic13$);
        Equality.identity((SubLObject)$ic1$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1163$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic21$));
        module0012.f419((SubLObject)$ic7$);
        Structures.register_method(module0079.$g1148$.getGlobalValue(), $g1163$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic23$));
        Structures.register_method(module0079.$g1149$.getGlobalValue(), $g1163$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic24$));
        Structures.register_method(module0079.$g1150$.getGlobalValue(), $g1163$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic25$));
        Structures.register_method(module0079.$g1151$.getGlobalValue(), $g1163$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic26$));
        Structures.register_method(module0079.$g1152$.getGlobalValue(), $g1163$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic27$));
        Structures.register_method(module0079.$g1153$.getGlobalValue(), $g1163$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic28$));
        Structures.register_method(module0079.$g1154$.getGlobalValue(), $g1163$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic29$));
        Structures.register_method(module0079.$g1156$.getGlobalValue(), $g1163$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic30$));
        Structures.register_method(module0079.$g1157$.getGlobalValue(), $g1163$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic31$));
        Structures.register_method(module0079.$g1158$.getGlobalValue(), $g1163$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic32$));
        Structures.register_method(module0079.$g1159$.getGlobalValue(), $g1163$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic33$));
        Structures.register_method(module0079.$g1160$.getGlobalValue(), $g1163$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic34$));
        Structures.register_method(module0079.$g1161$.getGlobalValue(), $g1163$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic35$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g1163$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic41$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f5584();
    }
    
    public void initializeVariables() {
        f5585();
    }
    
    public void runTopLevelForms() {
        f5586();
    }
    
    static {
        me = (SubLFile)new module0081();
        $g1163$ = null;
        $ic0$ = makeSymbol("S#3046", "CYC");
        $ic1$ = makeSymbol("S#7173", "CYC");
        $ic2$ = makeSymbol("S#7174", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("MAP"), (SubLObject)makeSymbol("S#672", "CYC"));
        $ic4$ = ConsesLow.list((SubLObject)makeKeyword("MAP"), (SubLObject)makeKeyword("LOCK"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#7177", "CYC"), (SubLObject)makeSymbol("S#7178", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#7179", "CYC"), (SubLObject)makeSymbol("S#7180", "CYC"));
        $ic7$ = makeSymbol("S#7184", "CYC");
        $ic8$ = makeSymbol("S#7176", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#7174", "CYC"));
        $ic10$ = makeSymbol("S#7177", "CYC");
        $ic11$ = makeSymbol("S#7179", "CYC");
        $ic12$ = makeSymbol("S#7178", "CYC");
        $ic13$ = makeSymbol("S#7180", "CYC");
        $ic14$ = makeKeyword("MAP");
        $ic15$ = makeKeyword("LOCK");
        $ic16$ = makeString("Invalid slot ~S for construction function");
        $ic17$ = makeKeyword("BEGIN");
        $ic18$ = makeSymbol("S#7181", "CYC");
        $ic19$ = makeKeyword("SLOT");
        $ic20$ = makeKeyword("END");
        $ic21$ = makeSymbol("S#7183", "CYC");
        $ic22$ = makeString("<LOCKING-MAP ~A>");
        $ic23$ = makeSymbol("S#7185", "CYC");
        $ic24$ = makeSymbol("S#7186", "CYC");
        $ic25$ = makeSymbol("S#7187", "CYC");
        $ic26$ = makeSymbol("S#7188", "CYC");
        $ic27$ = makeSymbol("S#7190", "CYC");
        $ic28$ = makeSymbol("S#7192", "CYC");
        $ic29$ = makeSymbol("S#7194", "CYC");
        $ic30$ = makeSymbol("S#7196", "CYC");
        $ic31$ = makeSymbol("S#7197", "CYC");
        $ic32$ = makeSymbol("S#7198", "CYC");
        $ic33$ = makeSymbol("S#7199", "CYC");
        $ic34$ = makeSymbol("S#7201", "CYC");
        $ic35$ = makeSymbol("S#7202", "CYC");
        $ic36$ = makeString("Locking Map");
        $ic37$ = ConsesLow.list((SubLObject)makeSymbol("MAP"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic38$ = makeSymbol("S#3018", "CYC");
        $ic39$ = makeSymbol("S#7205", "CYC");
        $ic40$ = makeSymbol("S#3019", "CYC");
        $ic41$ = makeSymbol("S#7208", "CYC");
    }
    
    public static final class $sX7173_native extends SubLStructNative
    {
        public SubLObject $map;
        public SubLObject $lock;
        public static final SubLStructDeclNative structDecl;
        
        public $sX7173_native() {
            this.$map = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$map;
        }
        
        public SubLObject getField3() {
            return this.$lock;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$map = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$lock = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX7173_native.class, $ic1$, $ic2$, $ic3$, $ic4$, new String[] { "$map", "$lock" }, $ic5$, $ic6$, $ic7$);
        }
    }
    
    public static final class $f5552$UnaryFunction extends UnaryFunction
    {
        public $f5552$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#7174"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return f5552(var4);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 121 ms
	
	Decompiled with Procyon 0.5.32.
*/