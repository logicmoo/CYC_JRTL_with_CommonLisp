package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0617 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0617";
    public static final String myFingerPrint = "c8ca59f42f73ca72a04f758e04558fa549ef4b9e51164c2285789277e5b20e6b";
    private static SubLSymbol $g4734$;
    private static SubLSymbol $g4735$;
    private static SubLSymbol $g4736$;
    private static SubLSymbol $g4737$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLString $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLList $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLList $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLList $ic36$;
    private static final SubLList $ic37$;
    private static final SubLList $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLList $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
    private static final SubLString $ic53$;
    private static final SubLList $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLString $ic57$;
    private static final SubLList $ic58$;
    private static final SubLInteger $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLObject $ic73$;
    private static final SubLObject $ic74$;
    private static final SubLList $ic75$;
    private static final SubLObject $ic76$;
    private static final SubLObject $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLList $ic81$;
    
    public static SubLObject f37816(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0161.f10481(var4) : var4;
        SubLObject var6 = (SubLObject)NIL;
        hl_interface_infrastructure_oc.f8308();
        hl_interface_infrastructure_oc.f8341((SubLObject)$ic2$, var1, var2, var3, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != hl_interface_infrastructure_oc.f8288()) {
            var6 = hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var1), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var2), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var3), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var4)));
        }
        if (NIL != hl_interface_infrastructure_oc.f8287()) {
            final SubLObject var7 = hl_interface_infrastructure_oc.$g1483$.currentBinding(var5);
            try {
                hl_interface_infrastructure_oc.$g1483$.bind((SubLObject)T, var5);
                final SubLObject var8 = module0018.$g573$.getGlobalValue();
                SubLObject var9 = (SubLObject)NIL;
                try {
                    var9 = Locks.seize_lock(var8);
                    return f37817(var1, var2, var3, var4);
                }
                finally {
                    if (NIL != var9) {
                        Locks.release_lock(var8);
                    }
                }
            }
            finally {
                hl_interface_infrastructure_oc.$g1483$.rebind(var7, var5);
            }
        }
        return var6;
    }
    
    public static SubLObject f37818(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0161.f10481(var4) : var4;
        SubLObject var6 = (SubLObject)NIL;
        hl_interface_infrastructure_oc.f8308();
        hl_interface_infrastructure_oc.f8341((SubLObject)$ic9$, var1, var2, var3, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != hl_interface_infrastructure_oc.f8288()) {
            var6 = hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var1), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var2), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var3), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var4)));
        }
        if (NIL != hl_interface_infrastructure_oc.f8287()) {
            final SubLObject var7 = hl_interface_infrastructure_oc.$g1483$.currentBinding(var5);
            try {
                hl_interface_infrastructure_oc.$g1483$.bind((SubLObject)T, var5);
                final SubLObject var8 = module0018.$g573$.getGlobalValue();
                SubLObject var9 = (SubLObject)NIL;
                try {
                    var9 = Locks.seize_lock(var8);
                    return f37819(var1, var2, var3, var4);
                }
                finally {
                    if (NIL != var9) {
                        Locks.release_lock(var8);
                    }
                }
            }
            finally {
                hl_interface_infrastructure_oc.$g1483$.rebind(var7, var5);
            }
        }
        return var6;
    }
    
    public static SubLObject f37820(final SubLObject var12, final SubLObject var13, final SubLObject var4, final SubLObject var14, final SubLObject var15) {
        if (NIL != module0204.f13044(var13)) {
            final SubLObject var16 = module0204.f13047(var13);
            if (NIL != module0202.f12598(var16) && NIL == module0202.f12706(var16) && NIL != module0161.f10513(var4, $ic11$)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37821(final SubLObject var12, final SubLObject var13, final SubLObject var4, final SubLObject var14, final SubLObject var15) {
        assert NIL != module0191.f11933(var12) : var12;
        SubLObject var16 = (SubLObject)NIL;
        final SubLObject var17 = module0191.f11943(var12);
        if ($ic13$ != var17) {
            var16 = (SubLObject)ConsesLow.cons((SubLObject)$ic14$, var16);
        }
        if ($ic15$ != var14) {
            var16 = (SubLObject)ConsesLow.cons((SubLObject)$ic16$, var16);
        }
        return var16;
    }
    
    public static SubLObject f37822(final SubLObject var12, final SubLObject var13, final SubLObject var4, final SubLObject var14, final SubLObject var15) {
        final SubLObject var16 = module0204.f13047(var13);
        final SubLObject var17 = module0205.f13333(var16);
        final SubLObject var18 = module0205.f13379(var16, (SubLObject)UNPROVIDED);
        final SubLObject var19 = module0205.f13380(var16, (SubLObject)UNPROVIDED);
        return f37816(var17, var18, var19, var4);
    }
    
    public static SubLObject f37823(final SubLObject var12, final SubLObject var13, final SubLObject var4) {
        final SubLObject var14 = module0204.f13047(var13);
        final SubLObject var15 = module0205.f13333(var14);
        final SubLObject var16 = module0205.f13379(var14, (SubLObject)UNPROVIDED);
        final SubLObject var17 = module0205.f13380(var14, (SubLObject)UNPROVIDED);
        return f37818(var15, var16, var17, var4);
    }
    
    public static SubLObject f37824(final SubLObject var12, final SubLObject var13, final SubLObject var4, final SubLObject var14, final SubLObject var15) {
        if (NIL != f37820(var12, var13, var4, var14, var15)) {
            final SubLObject var16 = module0204.f13047(var13);
            return module0337.f22626((SubLObject)$ic20$, var16);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37825(final SubLObject var12, final SubLObject var13, final SubLObject var4, final SubLObject var14, final SubLObject var15) {
        if (NIL != f37820(var12, var13, var4, var14, var15)) {
            final SubLObject var16 = module0204.f13047(var13);
            return module0337.f22626((SubLObject)$ic24$, var16);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37826(final SubLObject var12, final SubLObject var13, final SubLObject var4, final SubLObject var14, final SubLObject var15) {
        if (NIL != f37820(var12, var13, var4, var14, var15)) {
            final SubLObject var16 = module0204.f13047(var13);
            return module0337.f22626((SubLObject)$ic28$, var16);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37827(final SubLObject var12, final SubLObject var13, final SubLObject var4, final SubLObject var14, final SubLObject var15) {
        if (NIL != f37820(var12, var13, var4, var14, var15)) {
            final SubLObject var16 = module0204.f13047(var13);
            return module0337.f22626((SubLObject)$ic32$, var16);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37828(final SubLObject var12, final SubLObject var13, final SubLObject var4, final SubLObject var14, final SubLObject var15) {
        if (NIL != f37820(var12, var13, var4, var14, var15)) {
            final SubLObject var16 = module0204.f13047(var13);
            return module0337.f22626((SubLObject)$ic36$, var16);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37829(final SubLObject var12, final SubLObject var13, final SubLObject var4, final SubLObject var14, final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        final SubLObject var17 = module0204.f13047(var13);
        final SubLObject var18 = module0205.f13333(var17);
        final SubLObject var19 = module0205.f13379(var17, (SubLObject)UNPROVIDED);
        final SubLObject var20 = module0205.f13380(var17, (SubLObject)UNPROVIDED);
        final SubLObject var21 = module0612.f37427(var20);
        if (NIL != module0051.f3549(var21)) {
            var16.resetMultipleValues();
            final SubLObject var22 = module0051.f3642(var21);
            final SubLObject var23 = var16.secondMultipleValue();
            var16.resetMultipleValues();
            return (SubLObject)makeBoolean(var22.isPositive() && NIL != f37816($ic21$, var19, var22, var4) && (!var23.isPositive() || NIL != f37816($ic29$, var19, var23, var4)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37830(final SubLObject var12, final SubLObject var13, final SubLObject var4) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0204.f13047(var13);
        final SubLObject var16 = module0205.f13333(var15);
        final SubLObject var17 = module0205.f13379(var15, (SubLObject)UNPROVIDED);
        final SubLObject var18 = module0205.f13380(var15, (SubLObject)UNPROVIDED);
        final SubLObject var19 = module0612.f37427(var18);
        if (NIL != module0051.f3549(var19)) {
            var14.resetMultipleValues();
            final SubLObject var20 = module0051.f3642(var19);
            final SubLObject var21 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            return (SubLObject)makeBoolean(var20.isPositive() && NIL != f37818($ic21$, var17, var20, var4) && (!var21.isPositive() || NIL != f37818($ic29$, var17, var21, var4)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37831(final SubLObject var23, final SubLObject var24) {
        SubLObject var26;
        final SubLObject var25 = var26 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic39$);
        final SubLObject var27 = var26.rest();
        var26 = var26.first();
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic39$);
        var28 = var26.first();
        var26 = var26.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic39$);
        var29 = var26.first();
        var26 = var26.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic39$);
        var30 = var26.first();
        var26 = var26.rest();
        if (NIL == var26) {
            final SubLObject var31;
            var26 = (var31 = var27);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic40$, (SubLObject)ConsesLow.list(var28, var29, var30), ConsesLow.append(var31, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var25, (SubLObject)$ic39$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37832() {
        return conses_high.copy_list($g4734$.getGlobalValue());
    }
    
    public static SubLObject f37833() {
        return conses_high.copy_list($g4735$.getGlobalValue());
    }
    
    public static SubLObject f37834(final SubLObject var1) {
        return module0004.f104(var1, f37833(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37835(final SubLObject var32) {
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = var32;
        SubLObject var35 = (SubLObject)NIL;
        var35 = var34.first();
        while (NIL != var34) {
            final SubLObject var36 = f37836();
            var33 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var35, var36), var33);
            var34 = var34.rest();
            var35 = var34.first();
        }
        return Sequences.nreverse(var33);
    }
    
    public static SubLObject f37837(final SubLObject var35, final SubLObject var28) {
        return conses_high.assoc(var28, var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).rest();
    }
    
    public static SubLObject f37838(final SubLObject var35, final SubLObject var36, final SubLObject var37, final SubLObject var38, final SubLObject var39) {
        final SubLObject var40 = f37837(var35, var36);
        return f37839(var40, var37, var38, var39);
    }
    
    public static SubLObject f37840(final SubLObject var35, final SubLObject var36, final SubLObject var37, final SubLObject var38, final SubLObject var39) {
        final SubLObject var40 = f37837(var35, var36);
        return f37841(var40, var37, var38, var39);
    }
    
    public static SubLObject f37842(final SubLObject var35) {
        SubLObject var36 = (SubLObject)ZERO_INTEGER;
        SubLObject var37 = var35;
        SubLObject var38 = (SubLObject)NIL;
        var38 = var37.first();
        while (NIL != var37) {
            SubLObject var40;
            final SubLObject var39 = var40 = var38;
            SubLObject var41 = (SubLObject)NIL;
            SubLObject var42 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)$ic41$);
            var41 = var40.first();
            var40 = (var42 = var40.rest());
            var36 = Numbers.add(var36, f37843(var42));
            var37 = var37.rest();
            var38 = var37.first();
        }
        return var36;
    }
    
    public static SubLObject f37844(final SubLObject var23, final SubLObject var24) {
        SubLObject var26;
        final SubLObject var25 = var26 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic42$);
        final SubLObject var27 = var26.rest();
        var26 = var26.first();
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic42$);
        var28 = var26.first();
        var26 = var26.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic42$);
        var29 = var26.first();
        var26 = var26.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic42$);
        var30 = var26.first();
        var26 = var26.rest();
        if (NIL == var26) {
            final SubLObject var31;
            var26 = (var31 = var27);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var28, var29, var30), ConsesLow.append(var31, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var25, (SubLObject)$ic42$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37836() {
        return module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37845(final SubLObject var35, final SubLObject var28) {
        return module0067.f4884(var35, var28, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37846(final SubLObject var35) {
        return module0067.f4861(var35);
    }
    
    public static SubLObject f37847(final SubLObject var35, final SubLObject var28, final SubLObject var34) {
        return module0067.f4886(var35, var28, var34);
    }
    
    public static SubLObject f37848(final SubLObject var35, final SubLObject var28, final SubLObject var34) {
        SubLObject var36 = f37845(var35, var28);
        if (NIL == var36) {
            var36 = module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0077.f5326(var34, var36);
        module0067.f4886(var35, var28, var36);
        return (SubLObject)T;
    }
    
    public static SubLObject f37849(final SubLObject var35, final SubLObject var28) {
        return module0067.f4887(var35, var28);
    }
    
    public static SubLObject f37839(final SubLObject var35, final SubLObject var28, final SubLObject var34, final SubLObject var39) {
        if (NIL != var39) {
            return f37847(var35, var28, var34);
        }
        return f37848(var35, var28, var34);
    }
    
    public static SubLObject f37841(final SubLObject var35, final SubLObject var28, final SubLObject var34, final SubLObject var39) {
        final SubLObject var40 = f37845(var35, var28);
        if (NIL != var40) {
            if (NIL == var39) {
                return module0077.f5327(var34, var40);
            }
            if (var40.eql(var34)) {
                f37849(var35, var28);
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37843(final SubLObject var35) {
        return module0067.f4861(var35);
    }
    
    public static SubLObject f37850() {
        $g4736$.setGlobalValue(f37835($g4734$.getGlobalValue()));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37851() {
        return Sequences.length(f37852());
    }
    
    public static SubLObject f37853(final SubLObject var23, final SubLObject var24) {
        SubLObject var26;
        final SubLObject var25 = var26 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic46$);
        final SubLObject var27 = var26.rest();
        var26 = var26.first();
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic46$);
        var28 = var26.first();
        var26 = var26.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic46$);
        var29 = var26.first();
        var26 = var26.rest();
        if (NIL == var26) {
            final SubLObject var30;
            var26 = (var30 = var27);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic47$, (SubLObject)ConsesLow.listS(var28, var29, (SubLObject)$ic48$), ConsesLow.append(var30, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var25, (SubLObject)$ic46$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37854(final SubLObject var35) {
        return f37846(var35);
    }
    
    public static SubLObject f37855(final SubLObject var23, final SubLObject var24) {
        SubLObject var26;
        final SubLObject var25 = var26 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic49$);
        final SubLObject var27 = var26.rest();
        var26 = var26.first();
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic49$);
        var28 = var26.first();
        var26 = var26.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic49$);
        var29 = var26.first();
        var26 = var26.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic49$);
        var30 = var26.first();
        var26 = var26.rest();
        if (NIL == var26) {
            final SubLObject var31;
            var26 = (var31 = var27);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic50$, (SubLObject)ConsesLow.list(var28, var29, var30), ConsesLow.append(var31, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var25, (SubLObject)$ic49$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37852() {
        return f37856();
    }
    
    public static SubLObject f37857() {
        return f37850();
    }
    
    public static SubLObject f37858(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return f37859(var1, var2, var3);
    }
    
    public static SubLObject f37860() {
        return f37861();
    }
    
    public static SubLObject f37862(final SubLObject var35) {
        $g4737$.setGlobalValue(var35);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37856() {
        return $g4736$.getGlobalValue();
    }
    
    public static SubLObject f37861() {
        return $g4737$.getGlobalValue();
    }
    
    public static SubLObject f37817(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        if (NIL == module0161.f10513(var4, $ic11$)) {
            return (SubLObject)NIL;
        }
        final SubLObject var5 = f37863(var1, var2, (SubLObject)UNPROVIDED);
        if (NIL != var5 && !var3.equal(var5)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != f37859(var1, var2, var3) && NIL != f37864(var1, var2, var3));
    }
    
    public static SubLObject f37859(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return f37838(f37856(), var1, var2, var3, (SubLObject)T);
    }
    
    public static SubLObject f37864(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return (SubLObject)makeBoolean(NIL == f37834(var1) || NIL != f37838(f37861(), var1, var3, var2, (SubLObject)NIL));
    }
    
    public static SubLObject f37819(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        if (NIL != module0161.f10513(var4, $ic11$)) {
            return (SubLObject)makeBoolean(NIL != f37865(var1, var2, var3) && NIL != f37866(var1, var2, var3));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37865(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return f37840(f37856(), var1, var2, var3, (SubLObject)T);
    }
    
    public static SubLObject f37866(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return (SubLObject)makeBoolean(NIL == f37834(var1) || NIL != f37840(f37861(), var1, var3, var2, (SubLObject)NIL));
    }
    
    public static SubLObject f37867(final SubLObject var57) {
        SubLObject var58 = (SubLObject)T;
        SubLObject var59 = f37856();
        SubLObject var60 = (SubLObject)NIL;
        var60 = var59.first();
        while (NIL != var59) {
            SubLObject var62;
            final SubLObject var61 = var62 = var60;
            SubLObject var63 = (SubLObject)NIL;
            SubLObject var64 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)$ic41$);
            var63 = var62.first();
            var62 = (var64 = var62.rest());
            final SubLObject var65 = f37845(var64, var57);
            if (NIL != var65 && NIL == f37818(var63, var57, var65, $ic11$)) {
                var58 = (SubLObject)NIL;
            }
            var59 = var59.rest();
            var60 = var59.first();
        }
        SubLObject var67;
        SubLObject var66 = var67 = f37868(var57, (SubLObject)UNPROVIDED);
        SubLObject var68 = (SubLObject)NIL;
        var68 = var67.first();
        while (NIL != var67) {
            if (NIL == f37818($ic17$, var68, var57, $ic11$)) {
                var58 = (SubLObject)NIL;
            }
            var67 = var67.rest();
            var68 = var67.first();
        }
        var66 = (var67 = f37869(var57, (SubLObject)UNPROVIDED));
        var68 = (SubLObject)NIL;
        var68 = var67.first();
        while (NIL != var67) {
            if (NIL == f37818($ic25$, var68, var57, $ic11$)) {
                var58 = (SubLObject)NIL;
            }
            var67 = var67.rest();
            var68 = var67.first();
        }
        return var58;
    }
    
    public static SubLObject f37870(final SubLObject var1) {
        return module0067.f4881(f37837(f37856(), var1));
    }
    
    public static SubLObject f37871(final SubLObject var63, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = $ic11$;
        }
        assert NIL != module0173.f10955(var63) : var63;
        assert NIL != module0161.f10481(var4) : var4;
        return f37863($ic17$, var63, var4);
    }
    
    public static SubLObject f37872(final SubLObject var63, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = $ic11$;
        }
        assert NIL != module0173.f10955(var63) : var63;
        assert NIL != module0161.f10481(var4) : var4;
        return f37863($ic21$, var63, var4);
    }
    
    public static SubLObject f37873(final SubLObject var63, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = $ic11$;
        }
        return f37872(var63, var4);
    }
    
    public static SubLObject f37874(final SubLObject var63, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = $ic11$;
        }
        return f37863($ic25$, var63, var4);
    }
    
    public static SubLObject f37875(final SubLObject var63, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = $ic11$;
        }
        return f37863($ic29$, var63, var4);
    }
    
    public static SubLObject f37876(final SubLObject var63, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = $ic11$;
        }
        final SubLObject var64 = f37872(var63, var4);
        final SubLObject var65 = f37875(var63, var4);
        if (var65.isInteger() && var64.isInteger()) {
            return Numbers.add(Numbers.multiply((SubLObject)$ic59$, var64), var65);
        }
        if (var64.isInteger()) {
            return Numbers.multiply((SubLObject)$ic59$, var64);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37877(final SubLObject var63) {
        return module0500.f32279(var63);
    }
    
    public static SubLObject f37868(final SubLObject var66, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = $ic11$;
        }
        return f37878($ic17$, var66, var4);
    }
    
    public static SubLObject f37869(final SubLObject var67, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = $ic11$;
        }
        return f37878($ic25$, var67, var4);
    }
    
    public static SubLObject f37879(final SubLObject var66, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = $ic11$;
        }
        return f37880($ic17$, var66, var4);
    }
    
    public static SubLObject f37881(final SubLObject var67, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = $ic11$;
        }
        return f37880($ic25$, var67, var4);
    }
    
    public static SubLObject f37882(final SubLObject var57) {
        SubLObject var58 = (SubLObject)NIL;
        SubLObject var59 = f37856();
        SubLObject var60 = (SubLObject)NIL;
        var60 = var59.first();
        while (NIL != var59) {
            SubLObject var62;
            final SubLObject var61 = var62 = var60;
            SubLObject var63 = (SubLObject)NIL;
            SubLObject var64 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)$ic41$);
            var63 = var62.first();
            var62 = (var64 = var62.rest());
            final SubLObject var65 = f37845(var64, var57);
            if (NIL != var65) {
                final SubLObject var66 = module0202.f12768(var63, var57, var65);
                var58 = (SubLObject)ConsesLow.cons(var66, var58);
            }
            var59 = var59.rest();
            var60 = var59.first();
        }
        return var58;
    }
    
    public static SubLObject f37883(final SubLObject var57) {
        SubLObject var58 = (SubLObject)NIL;
        SubLObject var60;
        final SubLObject var59 = var60 = f37882(var57);
        SubLObject var61 = (SubLObject)NIL;
        var61 = var60.first();
        while (NIL != var60) {
            final SubLObject var62 = module0204.f13033(var61);
            final SubLObject var63 = $ic11$;
            final SubLObject var64 = (SubLObject)$ic13$;
            final SubLObject var65 = (SubLObject)$ic15$;
            final SubLObject var66 = (SubLObject)NIL;
            final SubLObject var67 = (SubLObject)ConsesLow.list(var62, var63, var64, var65, var66);
            var58 = (SubLObject)ConsesLow.cons(var67, var58);
            var60 = var60.rest();
            var61 = var60.first();
        }
        return var58;
    }
    
    public static SubLObject f37884(final SubLObject var57) {
        final SubLObject var58 = f37882(var57);
        return Mapping.mapcar((SubLObject)$ic60$, var58);
    }
    
    public static SubLObject f37885(final SubLObject var57) {
        final SubLObject var58 = f37882(var57);
        return Mapping.mapcar((SubLObject)$ic61$, var58);
    }
    
    public static SubLObject f37886(final SubLObject var16) {
        final SubLObject var17 = module0204.f13033(var16);
        final SubLObject var18 = $ic11$;
        final SubLObject var19 = (SubLObject)$ic15$;
        final SubLObject var20 = (SubLObject)NIL;
        final SubLObject var21 = module0195.f12200(var17, var18, var19, var20);
        return var21;
    }
    
    public static SubLObject f37887(final SubLObject var16) {
        final SubLObject var17 = f37886(var16);
        final SubLObject var18 = (SubLObject)$ic13$;
        final SubLObject var19 = module0191.f11940(var18);
        final SubLObject var20 = module0195.f12208(var17, var19);
        return var20;
    }
    
    public static SubLObject f37888() {
        return f37842(f37856());
    }
    
    public static SubLObject f37889(final SubLObject var57) {
        SubLObject var58 = (SubLObject)ZERO_INTEGER;
        SubLObject var59 = f37856();
        SubLObject var60 = (SubLObject)NIL;
        var60 = var59.first();
        while (NIL != var59) {
            SubLObject var62;
            final SubLObject var61 = var62 = var60;
            SubLObject var63 = (SubLObject)NIL;
            SubLObject var64 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)$ic41$);
            var63 = var62.first();
            var62 = (var64 = var62.rest());
            if (NIL != f37845(var64, var57)) {
                var58 = Numbers.add(var58, (SubLObject)ONE_INTEGER);
            }
            var59 = var59.rest();
            var60 = var59.first();
        }
        return var58;
    }
    
    public static SubLObject f37890(final SubLObject var57) {
        SubLObject var58 = f37856();
        SubLObject var59 = (SubLObject)NIL;
        var59 = var58.first();
        while (NIL != var58) {
            SubLObject var61;
            final SubLObject var60 = var61 = var59;
            SubLObject var62 = (SubLObject)NIL;
            SubLObject var63 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var61, var60, (SubLObject)$ic41$);
            var62 = var61.first();
            var61 = (var63 = var61.rest());
            if (NIL != f37845(var63, var57)) {
                return (SubLObject)T;
            }
            var58 = var58.rest();
            var59 = var58.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37891(final SubLObject var23, final SubLObject var24) {
        SubLObject var26;
        final SubLObject var25 = var26 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic62$);
        final SubLObject var27 = var26.rest();
        var26 = var26.first();
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic62$);
        var28 = var26.first();
        var26 = var26.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic62$);
        var29 = var26.first();
        var26 = var26.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic62$);
        var30 = var26.first();
        var26 = var26.rest();
        if (NIL == var26) {
            final SubLObject var31;
            var26 = (var31 = var27);
            final SubLObject var32 = (SubLObject)$ic63$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)ConsesLow.listS(var28, var32, (SubLObject)$ic64$), (SubLObject)ConsesLow.listS((SubLObject)$ic50$, (SubLObject)ConsesLow.list(var29, var30, var32), ConsesLow.append(var31, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var25, (SubLObject)$ic62$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37892(final SubLObject var23, final SubLObject var24) {
        SubLObject var26;
        final SubLObject var25 = var26 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic65$);
        final SubLObject var27 = var26.rest();
        var26 = var26.first();
        SubLObject var28 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)$ic65$);
        var28 = var26.first();
        var26 = var26.rest();
        if (NIL == var26) {
            final SubLObject var29;
            var26 = (var29 = var27);
            final SubLObject var30 = (SubLObject)$ic66$;
            final SubLObject var31 = (SubLObject)$ic67$;
            final SubLObject var32 = (SubLObject)$ic68$;
            final SubLObject var33 = (SubLObject)$ic69$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)ConsesLow.listS(var31, var30, (SubLObject)$ic64$), (SubLObject)ConsesLow.list((SubLObject)$ic50$, (SubLObject)ConsesLow.list(var32, var33, var30), (SubLObject)ConsesLow.listS((SubLObject)$ic70$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var28, (SubLObject)ConsesLow.list((SubLObject)$ic71$, var31, var32, var33))), ConsesLow.append(var29, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var25, (SubLObject)$ic65$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37893(final SubLObject var57) {
        SubLObject var58 = (SubLObject)ZERO_INTEGER;
        var58 = Numbers.add(var58, module0217.f14357(var57));
        var58 = Numbers.add(var58, f37889(var57));
        return var58;
    }
    
    public static SubLObject f37894(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        var17.resetMultipleValues();
        final SubLObject var18 = module0202.f12796(var16);
        final SubLObject var19 = var17.secondMultipleValue();
        final SubLObject var20 = var17.thirdMultipleValue();
        var17.resetMultipleValues();
        return f37895(var18, var19, var20);
    }
    
    public static SubLObject f37895(final SubLObject var85, final SubLObject var2, final SubLObject var3) {
        if (var85.eql($ic17$)) {
            return module0130.f8515(Equality.eq(var3, f37871(var2, (SubLObject)UNPROVIDED)));
        }
        if (var85.eql($ic25$)) {
            return module0130.f8515(Equality.eq(var3, f37874(var2, (SubLObject)UNPROVIDED)));
        }
        if (var85.eql($ic21$)) {
            return module0130.f8515(Equality.eql(var3, f37872(var2, (SubLObject)UNPROVIDED)));
        }
        if (var85.eql($ic29$)) {
            return module0130.f8515(Equality.eql(var3, f37875(var2, (SubLObject)UNPROVIDED)));
        }
        return (SubLObject)$ic72$;
    }
    
    public static SubLObject f37896(final SubLObject var57) {
        SubLObject var58 = (SubLObject)NIL;
        var58 = (SubLObject)ConsesLow.cons($ic11$, var58);
        SubLObject var59 = f37856();
        SubLObject var60 = (SubLObject)NIL;
        var60 = var59.first();
        while (NIL != var59) {
            SubLObject var62;
            final SubLObject var61 = var62 = var60;
            SubLObject var63 = (SubLObject)NIL;
            SubLObject var64 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)$ic41$);
            var63 = var62.first();
            var62 = (var64 = var62.rest());
            if (NIL != module0212.f13762(var63)) {
                var58 = (SubLObject)ConsesLow.cons(var63, var58);
            }
            final SubLObject var65 = f37845(var64, var57);
            if (NIL != module0212.f13762(var65)) {
                var58 = (SubLObject)ConsesLow.cons(var65, var58);
            }
            var59 = var59.rest();
            var60 = var59.first();
        }
        return module0035.f2269(var58, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37897(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        var17.resetMultipleValues();
        final SubLObject var18 = module0202.f12796(var16);
        final SubLObject var19 = var17.secondMultipleValue();
        final SubLObject var20 = var17.thirdMultipleValue();
        var17.resetMultipleValues();
        SubLObject var21 = (SubLObject)NIL;
        final SubLObject var22 = var18;
        if (var22.eql($ic17$)) {
            var21 = f37871(var19, (SubLObject)UNPROVIDED);
        }
        else if (var22.eql($ic25$)) {
            var21 = f37874(var19, (SubLObject)UNPROVIDED);
        }
        else if (var22.eql($ic21$)) {
            var21 = f37872(var19, (SubLObject)UNPROVIDED);
        }
        else if (var22.eql($ic29$)) {
            var21 = f37875(var19, (SubLObject)UNPROVIDED);
        }
        if (NIL != var21) {
            final SubLObject var23 = module0202.f12817((SubLObject)TWO_INTEGER, var21, var16);
            final SubLObject var24 = (SubLObject)ConsesLow.list($ic73$, var20, var21);
            final SubLObject var25 = (SubLObject)ConsesLow.listS($ic74$, var18, (SubLObject)$ic75$);
            return (SubLObject)ConsesLow.list(var23, var24, var25);
        }
        final SubLObject var26 = (SubLObject)ConsesLow.list($ic76$, var16);
        final SubLObject var27 = (SubLObject)ConsesLow.list($ic77$, var18);
        return (SubLObject)ConsesLow.list(var26, var27);
    }
    
    public static SubLObject f37863(final SubLObject var1, final SubLObject var2, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = $ic11$;
        }
        if (NIL != module0161.f10513(var4, $ic11$)) {
            return f37898(var1, var2);
        }
        return module0220.f14554(var2, var1, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37898(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = f37837(f37856(), var1);
        if (NIL != var3) {
            final SubLObject var4 = f37845(var3, var2);
            return var4;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37878(final SubLObject var1, final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = $ic11$;
        }
        if (NIL != module0161.f10513(var4, $ic11$)) {
            return f37899(var1, var3);
        }
        return module0220.f14563(var3, var1, var4, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37899(final SubLObject var1, final SubLObject var3) {
        final SubLObject var4 = f37837(f37861(), var1);
        if (NIL == var4) {
            return (SubLObject)NIL;
        }
        final SubLObject var5 = f37845(var4, var3);
        if (NIL != var5) {
            return module0077.f5312(var5);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37880(final SubLObject var1, final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = $ic11$;
        }
        if (NIL != module0161.f10513(var4, $ic11$)) {
            return f37900(var1, var3);
        }
        return module0217.f14247(var1, var4);
    }
    
    public static SubLObject f37900(final SubLObject var1, final SubLObject var3) {
        final SubLObject var4 = f37837(f37861(), var1);
        if (NIL == var4) {
            return (SubLObject)NIL;
        }
        final SubLObject var5 = f37845(var4, var3);
        if (NIL != var5) {
            return module0077.f5311(var5);
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f37901() {
        SubLObject var41 = (SubLObject)ZERO_INTEGER;
        SubLObject var42 = f37832();
        SubLObject var43 = (SubLObject)NIL;
        var43 = var42.first();
        while (NIL != var42) {
            var41 = Numbers.add(var41, f37902(var43));
            var42 = var42.rest();
            var43 = var42.first();
        }
        return var41;
    }
    
    public static SubLObject f37902(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = f37837(f37856(), var1);
        SubLObject var4 = (SubLObject)NIL;
        module0012.$g82$.setDynamicValue(PrintLow.format((SubLObject)NIL, (SubLObject)$ic78$, var1), var2);
        module0012.$g83$.setDynamicValue(f37846(var3), var2);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var2);
        SubLObject var5;
        for (var5 = module0066.f4838(module0067.f4891(var3)); NIL == module0066.f4841(var5); var5 = module0066.f4840(var5)) {
            var2.resetMultipleValues();
            final SubLObject var6 = module0066.f4839(var5);
            final SubLObject var7 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            var4 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var6, var7), var4);
        }
        module0066.f4842(var5);
        f37870(var1);
        final SubLObject var8 = var4;
        module0012.$g82$.setDynamicValue(Sequences.cconcatenate((SubLObject)$ic79$, new SubLObject[] { module0006.f205(var1), $ic80$ }), var2);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var2);
        module0012.$g83$.setDynamicValue(Sequences.length(var8), var2);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var2);
        final SubLObject var9 = module0012.$g75$.currentBinding(var2);
        final SubLObject var10 = module0012.$g76$.currentBinding(var2);
        final SubLObject var11 = module0012.$g77$.currentBinding(var2);
        final SubLObject var12 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(module0012.$g82$.getDynamicValue(var2));
            SubLObject var13 = var8;
            SubLObject var14 = (SubLObject)NIL;
            var14 = var13.first();
            while (NIL != var13) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var2), module0012.$g83$.getDynamicValue(var2));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var2), (SubLObject)ONE_INTEGER), var2);
                SubLObject var16;
                final SubLObject var15 = var16 = var14;
                SubLObject var17 = (SubLObject)NIL;
                SubLObject var18 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)$ic81$);
                var17 = var16.first();
                var16 = var16.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)$ic81$);
                var18 = var16.first();
                var16 = var16.rest();
                if (NIL == var16) {
                    f37816(var1, var17, var18, $ic11$);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var15, (SubLObject)$ic81$);
                }
                var13 = var13.rest();
                var14 = var13.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var12, var2);
            module0012.$g77$.rebind(var11, var2);
            module0012.$g76$.rebind(var10, var2);
            module0012.$g75$.rebind(var9, var2);
        }
        return Sequences.length(var4);
    }
    
    public static SubLObject f37903() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37816", "HL-ASSERT-BOOKKEEPING-BINARY-GAF", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37818", "HL-UNASSERT-BOOKKEEPING-BINARY-GAF", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37820", "S#41421", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37821", "S#41422", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37822", "S#41423", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37823", "S#41424", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37824", "S#41377", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37825", "S#41378", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37826", "S#41379", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37827", "S#41380", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37828", "S#41425", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37829", "S#41426", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37830", "S#41427", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0617", "f37831", "S#41428");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37832", "S#41429", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37833", "S#41430", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37834", "S#41431", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37835", "S#41432", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37837", "S#41433", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37838", "S#41434", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37840", "S#41435", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37842", "S#41436", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0617", "f37844", "S#41437");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37836", "S#41438", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37845", "S#41439", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37846", "S#41440", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37847", "S#41441", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37848", "S#41442", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37849", "S#41443", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37839", "S#41444", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37841", "S#41445", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37843", "S#41446", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37850", "S#16679", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37851", "S#41447", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0617", "f37853", "S#41448");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37854", "S#41449", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0617", "f37855", "S#41450");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37852", "S#41451", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37857", "S#41452", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37858", "S#41453", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37860", "S#41454", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37862", "S#41455", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37856", "S#41456", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37861", "S#41457", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37817", "S#41458", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37859", "S#41459", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37864", "S#41460", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37819", "S#41461", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37865", "S#41462", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37866", "S#41463", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37867", "S#13557", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37870", "S#41464", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37871", "CREATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37872", "CREATION-TIME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37873", "S#32373", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37874", "S#35628", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37875", "S#16706", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37876", "S#41465", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37877", "S#41466", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37868", "S#16705", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37869", "S#35630", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37879", "S#35627", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37881", "S#35629", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37882", "S#37838", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37883", "S#37600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37884", "S#41467", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37885", "S#41468", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37886", "S#15044", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37887", "S#15047", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37888", "S#16676", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37889", "S#41469", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37890", "S#41470", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0617", "f37891", "S#41471");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0617", "f37892", "S#15043");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37893", "S#41472", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37894", "S#24929", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37895", "S#41473", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37896", "S#37597", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37897", "S#24930", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37863", "S#41474", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37898", "S#41475", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37878", "S#41476", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37899", "S#41477", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37880", "S#41478", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37900", "S#41479", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37901", "S#41480", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0617", "f37902", "S#41481", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37904() {
        $g4734$ = SubLFiles.deflexical("S#41482", (SubLObject)$ic37$);
        $g4735$ = SubLFiles.deflexical("S#41483", (SubLObject)$ic38$);
        $g4736$ = SubLFiles.deflexical("S#41484", (NIL != Symbols.boundp((SubLObject)$ic44$)) ? $g4736$.getGlobalValue() : f37835($g4734$.getGlobalValue()));
        $g4737$ = SubLFiles.deflexical("S#41485", (NIL != Symbols.boundp((SubLObject)$ic45$)) ? $g4737$.getGlobalValue() : f37835($g4735$.getGlobalValue()));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37905() {
        module0012.f368((SubLObject)$ic2$, (SubLObject)$ic5$, (SubLObject)$ic6$, (SubLObject)$ic7$, (SubLObject)$ic8$);
        module0012.f368((SubLObject)$ic9$, (SubLObject)$ic5$, (SubLObject)$ic10$, (SubLObject)$ic7$, (SubLObject)$ic8$);
        module0195.f12196($ic17$);
        module0195.f12128((SubLObject)$ic18$, (SubLObject)$ic19$);
        module0195.f12196($ic21$);
        module0195.f12128((SubLObject)$ic22$, (SubLObject)$ic23$);
        module0195.f12196($ic25$);
        module0195.f12128((SubLObject)$ic26$, (SubLObject)$ic27$);
        module0195.f12196($ic29$);
        module0195.f12128((SubLObject)$ic30$, (SubLObject)$ic31$);
        module0195.f12196($ic33$);
        module0195.f12128((SubLObject)$ic34$, (SubLObject)$ic35$);
        module0003.f57((SubLObject)$ic44$);
        module0003.f57((SubLObject)$ic45$);
        module0012.f368((SubLObject)$ic51$, (SubLObject)$ic52$, (SubLObject)$ic53$, (SubLObject)$ic54$, (SubLObject)$ic55$);
        module0012.f368((SubLObject)$ic56$, (SubLObject)$ic52$, (SubLObject)$ic57$, (SubLObject)$ic54$, (SubLObject)$ic58$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f37903();
    }
    
    public void initializeVariables() {
        f37904();
    }
    
    public void runTopLevelForms() {
        f37905();
    }
    
    static {
        me = (SubLFile)new module0617();
        $g4734$ = null;
        $g4735$ = null;
        $g4736$ = null;
        $g4737$ = null;
        $ic0$ = makeSymbol("FORT-P");
        $ic1$ = makeSymbol("S#12263", "CYC");
        $ic2$ = makeSymbol("HL-ASSERT-BOOKKEEPING-BINARY-GAF");
        $ic3$ = makeSymbol("QUOTE");
        $ic4$ = makeSymbol("S#5859", "CYC");
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic6$ = makeString("Assert (PRED ARG1 ARG2) in MT to the bookkeeping store.");
        $ic7$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#12263", "CYC")));
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("BOOLEAN"));
        $ic9$ = makeSymbol("HL-UNASSERT-BOOKKEEPING-BINARY-GAF");
        $ic10$ = makeString("Unassert (PRED ARG1 ARG2) in MT from the bookkeeping store.");
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("BookkeepingMt"));
        $ic12$ = makeSymbol("S#14731", "CYC");
        $ic13$ = makeKeyword("MONOTONIC");
        $ic14$ = makeKeyword("STRENGTH");
        $ic15$ = makeKeyword("BACKWARD");
        $ic16$ = makeKeyword("DIRECTION");
        $ic17$ = constant_handles_oc.f8479((SubLObject)makeString("myCreator"));
        $ic18$ = makeKeyword("MY-CREATOR");
        $ic19$ = ConsesLow.list(new SubLObject[] { makeKeyword("PRETTY-NAME"), makeString("myCreator"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ASSERTED-ARGUMENT"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("myCreator")), makeKeyword("APPLICABILITY"), makeSymbol("S#41377", "CYC"), makeKeyword("INCOMPLETENESS"), makeSymbol("S#41422", "CYC"), makeKeyword("ADD"), makeSymbol("S#41423", "CYC"), makeKeyword("REMOVE"), makeSymbol("S#41424", "CYC"), makeKeyword("REMOVE-ALL"), makeSymbol("S#41424", "CYC") });
        $ic20$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreator")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"));
        $ic21$ = constant_handles_oc.f8479((SubLObject)makeString("myCreationTime"));
        $ic22$ = makeKeyword("MY-CREATION-TIME");
        $ic23$ = ConsesLow.list(new SubLObject[] { makeKeyword("PRETTY-NAME"), makeString("myCreationTime"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ASSERTED-ARGUMENT"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("myCreationTime")), makeKeyword("APPLICABILITY"), makeSymbol("S#41378", "CYC"), makeKeyword("INCOMPLETENESS"), makeSymbol("S#41422", "CYC"), makeKeyword("ADD"), makeSymbol("S#41423", "CYC"), makeKeyword("REMOVE"), makeSymbol("S#41424", "CYC"), makeKeyword("REMOVE-ALL"), makeSymbol("S#41424", "CYC") });
        $ic24$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreationTime")), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#4999", "CYC")));
        $ic25$ = constant_handles_oc.f8479((SubLObject)makeString("myCreationPurpose"));
        $ic26$ = makeKeyword("MY-CREATION-PURPOSE");
        $ic27$ = ConsesLow.list(new SubLObject[] { makeKeyword("PRETTY-NAME"), makeString("myCreationPurpose"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ASSERTED-ARGUMENT"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("myCreationPurpose")), makeKeyword("APPLICABILITY"), makeSymbol("S#41379", "CYC"), makeKeyword("INCOMPLETENESS"), makeSymbol("S#41422", "CYC"), makeKeyword("ADD"), makeSymbol("S#41423", "CYC"), makeKeyword("REMOVE"), makeSymbol("S#41424", "CYC"), makeKeyword("REMOVE-ALL"), makeSymbol("S#41424", "CYC") });
        $ic28$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreationPurpose")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"));
        $ic29$ = constant_handles_oc.f8479((SubLObject)makeString("myCreationSecond"));
        $ic30$ = makeKeyword("MY-CREATION-SECOND");
        $ic31$ = ConsesLow.list(new SubLObject[] { makeKeyword("PRETTY-NAME"), makeString("myCreationSecond"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ASSERTED-ARGUMENT"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("myCreationSecond")), makeKeyword("APPLICABILITY"), makeSymbol("S#41380", "CYC"), makeKeyword("INCOMPLETENESS"), makeSymbol("S#41422", "CYC"), makeKeyword("ADD"), makeSymbol("S#41423", "CYC"), makeKeyword("REMOVE"), makeSymbol("S#41424", "CYC"), makeKeyword("REMOVE-ALL"), makeSymbol("S#41424", "CYC") });
        $ic32$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreationSecond")), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#5028", "CYC")));
        $ic33$ = constant_handles_oc.f8479((SubLObject)makeString("myCreationDate"));
        $ic34$ = makeKeyword("MY-CREATION-DATE");
        $ic35$ = ConsesLow.list(new SubLObject[] { makeKeyword("PRETTY-NAME"), makeString("myCreationDate"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ASSERTED-ARGUMENT"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("myCreationDate")), makeKeyword("APPLICABILITY"), makeSymbol("S#41425", "CYC"), makeKeyword("INCOMPLETENESS"), makeSymbol("S#41422", "CYC"), makeKeyword("ADD"), makeSymbol("S#41426", "CYC"), makeKeyword("REMOVE"), makeSymbol("S#41427", "CYC"), makeKeyword("REMOVE-ALL"), makeSymbol("S#41427", "CYC") });
        $ic36$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreationDate")), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24728", "CYC")));
        $ic37$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreator")), constant_handles_oc.f8479((SubLObject)makeString("myCreationPurpose")), constant_handles_oc.f8479((SubLObject)makeString("myCreationTime")), constant_handles_oc.f8479((SubLObject)makeString("myCreationSecond")));
        $ic38$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreator")), constant_handles_oc.f8479((SubLObject)makeString("myCreationPurpose")));
        $ic39$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#17133", "CYC"), (SubLObject)makeSymbol("S#41486", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic40$ = makeSymbol("DO-ALIST");
        $ic41$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#17133", "CYC"));
        $ic42$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("S#134", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic43$ = makeSymbol("DO-DICTIONARY");
        $ic44$ = makeSymbol("S#41484", "CYC");
        $ic45$ = makeSymbol("S#41485", "CYC");
        $ic46$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#17133", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic47$ = makeSymbol("S#41428", "CYC");
        $ic48$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#41451", "CYC")));
        $ic49$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"), (SubLObject)makeSymbol("S#134", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic50$ = makeSymbol("S#41437", "CYC");
        $ic51$ = makeSymbol("CREATOR");
        $ic52$ = ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), constant_handles_oc.f8479((SubLObject)makeString("BookkeepingMt"))));
        $ic53$ = makeString("Identify the cyclist who created FORT.");
        $ic54$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#12263", "CYC")));
        $ic55$ = ConsesLow.list((SubLObject)makeSymbol("FORT-P"));
        $ic56$ = makeSymbol("CREATION-TIME");
        $ic57$ = makeString("Identify when FORT was created.");
        $ic58$ = ConsesLow.list((SubLObject)makeSymbol("INTEGERP"));
        $ic59$ = makeInteger(1000000);
        $ic60$ = makeSymbol("S#15044", "CYC");
        $ic61$ = makeSymbol("S#15047", "CYC");
        $ic62$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#751", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic63$ = makeUninternedSymbol("US#5E7BF83");
        $ic64$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#41456", "CYC")));
        $ic65$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#13100", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic66$ = makeUninternedSymbol("US#5E7BF83");
        $ic67$ = makeUninternedSymbol("US#34A80D6");
        $ic68$ = makeUninternedSymbol("US#74A0883");
        $ic69$ = makeUninternedSymbol("US#74A0880");
        $ic70$ = makeSymbol("CLET");
        $ic71$ = makeSymbol("MAKE-BINARY-FORMULA");
        $ic72$ = makeKeyword("UNKNOWN");
        $ic73$ = constant_handles_oc.f8479((SubLObject)makeString("different"));
        $ic74$ = constant_handles_oc.f8479((SubLObject)makeString("arg2Format"));
        $ic75$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("singleEntryFormatInArgs")));
        $ic76$ = constant_handles_oc.f8479((SubLObject)makeString("unknownSentence"));
        $ic77$ = constant_handles_oc.f8479((SubLObject)makeString("completeExtentEnumerable"));
        $ic78$ = makeString("Gathering all ~s assertions");
        $ic79$ = makeString("Reindexing all ");
        $ic80$ = makeString(" assertions");
        $ic81$ = ConsesLow.list((SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 331 ms
	
	Decompiled with Procyon 0.5.32.
*/