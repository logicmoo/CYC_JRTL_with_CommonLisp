package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0685 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0685";
    public static final String myFingerPrint = "ce53377e760225eaad88cdeef9a3d260e345a1c802cf02b2065bd18fabfbcec7";
    private static SubLSymbol $g5387$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLList $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLString $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLList $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLObject $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLString $ic106$;
    private static final SubLString $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLString $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLString $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLString $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLString $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLString $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLString $ic126$;
    private static final SubLList $ic127$;
    private static final SubLString $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLList $ic133$;
    private static final SubLSymbol $ic134$;
    
    public static SubLObject f41964(final SubLObject var1, SubLObject var2) {
        if (var2 == module0685.UNPROVIDED) {
            var2 = (SubLObject)module0685.T;
        }
        SubLObject var3 = module0369.f25423(var1);
        if (module0685.NIL == var3) {
            var3 = module0204.f13094(module0369.f25487(var1));
        }
        if (module0685.NIL != var2) {
            final SubLObject var4 = module0369.f25424(var1);
            if (module0685.NIL != var4) {
                module0642.f39021((SubLObject)module0685.$ic2$);
                module0642.f39032((SubLObject)module0685.UNPROVIDED);
                module0656.f39915(var4, (SubLObject)module0685.ZERO_INTEGER, (SubLObject)module0685.NIL);
                module0642.f39026((SubLObject)module0685.UNPROVIDED);
            }
        }
        module0642.f39021((SubLObject)module0685.$ic3$);
        module0642.f39026((SubLObject)module0685.UNPROVIDED);
        module0656.f39804(var3, (SubLObject)module0685.ZERO_INTEGER, (SubLObject)module0685.T);
        final SubLObject var5 = module0369.f25482(var1);
        if (module0685.NIL != var5) {
            module0642.f39026((SubLObject)module0685.UNPROVIDED);
            module0642.f39021((SubLObject)module0685.$ic4$);
            module0642.f39026((SubLObject)module0685.UNPROVIDED);
            module0656.f39804(var5, (SubLObject)module0685.ZERO_INTEGER, (SubLObject)module0685.T);
        }
        return var1;
    }
    
    public static SubLObject f41965(final SubLObject var6) {
        assert module0685.NIL != module0360.f23869(var6) : var6;
        if (var6.eql((SubLObject)module0685.$ic6$)) {
            module0642.f39019((SubLObject)module0685.$ic7$);
        }
        else if (var6.eql((SubLObject)module0685.$ic8$)) {
            module0642.f39019((SubLObject)module0685.$ic9$);
        }
        else if (var6.eql((SubLObject)module0685.$ic10$)) {
            module0642.f39019((SubLObject)module0685.$ic11$);
        }
        else if (var6.eql((SubLObject)module0685.$ic12$)) {
            module0642.f39019((SubLObject)module0685.$ic13$);
        }
        else if (var6.eql((SubLObject)module0685.$ic14$)) {
            module0642.f39019((SubLObject)module0685.$ic15$);
        }
        else if (var6.eql((SubLObject)module0685.$ic16$)) {
            module0642.f39019((SubLObject)module0685.$ic17$);
        }
        else if (var6.eql((SubLObject)module0685.$ic18$)) {
            module0642.f39019((SubLObject)module0685.$ic19$);
        }
        else if (var6.eql((SubLObject)module0685.$ic20$)) {
            module0642.f39019((SubLObject)module0685.$ic21$);
        }
        else if (var6.eql((SubLObject)module0685.$ic22$)) {
            module0642.f39019((SubLObject)module0685.$ic23$);
        }
        else {
            module0642.f39019(var6);
        }
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f41966(final SubLObject var8) {
        assert module0685.NIL != module0360.f23865(var8) : var8;
        if (var8.eql((SubLObject)module0685.$ic25$)) {
            module0642.f39019((SubLObject)module0685.$ic26$);
        }
        else if (var8.eql((SubLObject)module0685.$ic27$)) {
            module0642.f39019((SubLObject)module0685.$ic28$);
        }
        else if (var8.eql((SubLObject)module0685.$ic29$)) {
            module0642.f39019((SubLObject)module0685.$ic30$);
        }
        else if (var8.eql((SubLObject)module0685.$ic31$)) {
            module0642.f39019((SubLObject)module0685.$ic32$);
        }
        else if (var8.eql((SubLObject)module0685.$ic33$)) {
            module0642.f39019((SubLObject)module0685.$ic34$);
        }
        else if (var8.eql((SubLObject)module0685.$ic35$)) {
            module0642.f39019((SubLObject)module0685.$ic36$);
        }
        else if (var8.eql((SubLObject)module0685.$ic37$)) {
            module0642.f39019((SubLObject)module0685.$ic38$);
        }
        else if (var8.eql((SubLObject)module0685.$ic39$)) {
            module0642.f39019((SubLObject)module0685.$ic40$);
        }
        else if (var8.eql((SubLObject)module0685.$ic41$)) {
            module0642.f39019((SubLObject)module0685.$ic42$);
        }
        else {
            module0642.f39019(var8);
        }
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f41967(final SubLObject var9) {
        SubLObject var10 = (SubLObject)module0685.NIL;
        SubLObject var11 = (SubLObject)module0685.NIL;
        SubLObject var12 = (SubLObject)module0685.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var9, (SubLObject)module0685.$ic43$);
        var10 = var9.first();
        SubLObject var13 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var9, (SubLObject)module0685.$ic43$);
        var11 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var9, (SubLObject)module0685.$ic43$);
        var12 = var13.first();
        var13 = var13.rest();
        if (module0685.NIL != var13) {
            cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)module0685.$ic43$);
            return (SubLObject)module0685.NIL;
        }
        final SubLObject var14 = f41968(var10, var11, var12);
        if (module0685.NIL == module0369.f25684(var14)) {
            return module0656.f39789((SubLObject)module0685.$ic44$, var9, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED);
        }
        return f41969(var14);
    }
    
    public static SubLObject f41970(final SubLObject var15, SubLObject var16, SubLObject var17, SubLObject var18) {
        if (var16 == module0685.UNPROVIDED) {
            var16 = (SubLObject)module0685.NIL;
        }
        if (var17 == module0685.UNPROVIDED) {
            var17 = (SubLObject)module0685.NIL;
        }
        if (var18 == module0685.UNPROVIDED) {
            var18 = (SubLObject)module0685.NIL;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (module0685.NIL == var18) {
            var18 = (SubLObject)module0685.$ic46$;
        }
        if (module0685.NIL == var16) {
            var16 = (SubLObject)module0685.$ic47$;
        }
        final SubLObject var20 = module0369.f25732(var15);
        final SubLObject var21 = module0369.f25422(var20);
        final SubLObject var22 = module0369.f25421(var20);
        final SubLObject var23 = module0361.f23996(var22);
        final SubLObject var24 = module0369.f25629(var15);
        final SubLObject var25 = module0369.f25687(var15);
        if (module0685.NIL == var17) {
            final SubLObject var26 = var16;
            if (var26.eql((SubLObject)module0685.$ic48$)) {
                var17 = PrintLow.format((SubLObject)module0685.NIL, (SubLObject)module0685.$ic49$, new SubLObject[] { var23, var21, var24 });
            }
            else if (var26.eql((SubLObject)module0685.$ic47$)) {
                var17 = PrintLow.format((SubLObject)module0685.NIL, (SubLObject)module0685.$ic50$, new SubLObject[] { var23, var21, var24 });
            }
            else if (var26.eql((SubLObject)module0685.$ic51$)) {
                var17 = PrintLow.format((SubLObject)module0685.NIL, (SubLObject)module0685.$ic52$, new SubLObject[] { var23, var21, var24, var25 });
            }
        }
        module0642.f39020(module0015.$g459$.getGlobalValue());
        final SubLObject var27 = module0656.f39832(var18);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var19), (SubLObject)module0685.$ic53$, new SubLObject[] { var23, var21, var24 });
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        if (module0685.NIL != var27) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
            module0642.f39020(var27);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
        final SubLObject var28 = module0015.$g533$.currentBinding(var19);
        try {
            module0015.$g533$.bind((SubLObject)module0685.T, var19);
            module0642.f39019(var17);
        }
        finally {
            module0015.$g533$.rebind(var28, var19);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        module0642.f39020(module0015.$g460$.getGlobalValue());
        return var15;
    }
    
    public static SubLObject f41971(final SubLObject var27, SubLObject var28, SubLObject var29) {
        if (var28 == module0685.UNPROVIDED) {
            var28 = (SubLObject)module0685.NIL;
        }
        if (var29 == module0685.UNPROVIDED) {
            var29 = (SubLObject)module0685.NIL;
        }
        module0656.f39837((SubLObject)module0685.$ic54$, var27, (SubLObject)module0685.$ic51$, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED);
        return var27;
    }
    
    public static SubLObject f41968(final SubLObject var12, final SubLObject var13, final SubLObject var14) {
        final SubLObject var15 = module0038.f2642(var12);
        final SubLObject var16 = module0038.f2642(var13);
        final SubLObject var17 = module0038.f2642(var14);
        if (var16.isInteger() && var17.isInteger()) {
            final SubLObject var18 = module0369.f25617(var15, var16, var17);
            if (module0685.NIL != module0369.f25684(var18)) {
                return var18;
            }
        }
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f41972(final SubLObject var24, final SubLObject var30) {
        f41973(var24, var30);
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f41974(final SubLObject var15) {
        module0656.f39837((SubLObject)module0685.$ic54$, var15, (SubLObject)module0685.$ic47$, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED);
        module0642.f39026((SubLObject)module0685.UNPROVIDED);
        final SubLObject var16 = module0369.f25687(var15);
        f41975(var16, (SubLObject)module0685.UNPROVIDED);
        return var15;
    }
    
    public static SubLObject f41969(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)module0685.$ic57$);
        module0642.f39029((SubLObject)module0685.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0642.f39029((SubLObject)module0685.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)module0685.$ic58$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0685.UNPROVIDED);
        final SubLObject var17 = module0015.$g538$.currentBinding(var16);
        final SubLObject var18 = module0015.$g535$.currentBinding(var16);
        try {
            module0015.$g538$.bind((module0685.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var16))) ? module0015.$g538$.getDynamicValue(var16) : module0057.f4173((SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED), var16);
            module0015.$g535$.bind((SubLObject)module0685.T, var16);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
            final SubLObject var26_32 = module0015.$g533$.currentBinding(var16);
            try {
                module0015.$g533$.bind((SubLObject)module0685.T, var16);
                module0644.f39197();
                module0016.f941();
                module0642.f39021((SubLObject)module0685.$ic58$);
                module0642.f39032((SubLObject)module0685.UNPROVIDED);
                module0656.f39837((SubLObject)module0685.$ic54$, var15, (SubLObject)module0685.$ic47$, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED);
                module0642.f39032((SubLObject)module0685.FOUR_INTEGER);
                module0656.f39837((SubLObject)module0685.$ic59$, var15, (SubLObject)module0685.$ic60$, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED);
                module0642.f39032((SubLObject)module0685.TWO_INTEGER);
                module0642.f39051((SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED);
                f41964(module0369.f25732(var15), (SubLObject)module0685.UNPROVIDED);
                module0642.f39026((SubLObject)module0685.TWO_INTEGER);
                module0642.f39021((SubLObject)module0685.$ic61$);
                f41976(var15);
                module0642.f39026((SubLObject)module0685.UNPROVIDED);
                module0642.f39021((SubLObject)module0685.$ic62$);
                f41977(var15);
                module0642.f39026((SubLObject)module0685.UNPROVIDED);
                final SubLObject var19 = module0369.f25687(var15);
                final SubLObject var20 = module0369.f25749(var15);
                module0642.f39021((SubLObject)module0685.$ic63$);
                module0642.f39026((SubLObject)module0685.UNPROVIDED);
                f41972(var19, var20);
                module0642.f39026((SubLObject)module0685.UNPROVIDED);
                module0642.f39021((SubLObject)module0685.$ic64$);
                if (module0685.NIL != module0035.f1997(module0369.f25744(var15))) {
                    module0642.f39032((SubLObject)module0685.TWO_INTEGER);
                    module0656.f39837((SubLObject)module0685.$ic65$, module0369.f25744(var15).first(), (SubLObject)module0685.$ic47$, (SubLObject)module0685.$ic66$, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED);
                }
                SubLObject var21 = module0369.f25744(var15);
                SubLObject var22 = (SubLObject)module0685.NIL;
                var22 = var21.first();
                while (module0685.NIL != var21) {
                    module0642.f39026((SubLObject)module0685.UNPROVIDED);
                    f41978(var22);
                    var21 = var21.rest();
                    var22 = var21.first();
                }
                module0642.f39029((SubLObject)module0685.UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var26_32, var16);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0685.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var18, var16);
            module0015.$g538$.rebind(var17, var16);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0685.UNPROVIDED);
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f41976(final SubLObject var15) {
        final SubLObject var16 = module0369.f25750(var15);
        final SubLObject var17 = module0369.f25623(var15, (SubLObject)module0685.NIL);
        module0642.f39019((SubLObject)module0685.$ic67$);
        module0642.f39019(module0051.f3602(var17));
        module0642.f39019((SubLObject)module0685.$ic68$);
        f41979(var16);
        module0642.f39019((SubLObject)module0685.$ic69$);
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f41979(SubLObject var38) {
        if (var38 == module0685.UNPROVIDED) {
            var38 = Time.get_universal_time();
        }
        final SubLThread var39 = SubLProcess.currentSubLThread();
        assert module0685.NIL != module0051.f3549(var38) : var38;
        var39.resetMultipleValues();
        final SubLObject var40 = module0051.f3642(var38);
        final SubLObject var41 = var39.secondMultipleValue();
        var39.resetMultipleValues();
        module0642.f39019(module0051.f3634(var41));
        if (var40.numE(module0051.f3605())) {
            module0642.f39019((SubLObject)module0685.$ic71$);
        }
        else {
            PrintLow.format(module0015.$g131$.getDynamicValue(var39), (SubLObject)module0685.$ic72$, module0051.f3617(var40));
        }
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f41977(final SubLObject var15) {
        final SubLObject var16 = module0369.f25625(var15);
        module0642.f39019(var16);
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f41980(final SubLObject var9) {
        SubLObject var10 = (SubLObject)module0685.NIL;
        SubLObject var11 = (SubLObject)module0685.NIL;
        SubLObject var12 = (SubLObject)module0685.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var9, (SubLObject)module0685.$ic43$);
        var10 = var9.first();
        SubLObject var13 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var9, (SubLObject)module0685.$ic43$);
        var11 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var9, (SubLObject)module0685.$ic43$);
        var12 = var13.first();
        var13 = var13.rest();
        if (module0685.NIL != var13) {
            cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)module0685.$ic43$);
            return (SubLObject)module0685.NIL;
        }
        final SubLObject var14 = f41968(var10, var11, var12);
        if (module0685.NIL == module0369.f25684(var14)) {
            return module0656.f39789((SubLObject)module0685.$ic44$, var9, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED);
        }
        final SubLObject var15 = module0369.f25732(var14);
        final SubLObject var16 = module0369.f25756(var14);
        final SubLObject var17 = module0369.f25424(var15);
        final SubLObject var18 = (SubLObject)module0685.NIL;
        return module0683.f41802(var16, var17, var18);
    }
    
    public static SubLObject f41981(final SubLObject var44, SubLObject var17) {
        if (var17 == module0685.UNPROVIDED) {
            var17 = (SubLObject)module0685.NIL;
        }
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (module0685.NIL == var17) {
            var17 = (SubLObject)module0685.$ic60$;
        }
        final SubLObject var46 = module0369.f25629(var44);
        final SubLObject var47 = module0369.f25732(var44);
        final SubLObject var48 = module0369.f25422(var47);
        final SubLObject var49 = module0369.f25421(var47);
        final SubLObject var50 = module0361.f23996(var49);
        final SubLObject var51 = module0656.f39832((SubLObject)module0685.$ic74$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var45), (SubLObject)module0685.$ic75$, new SubLObject[] { var50, var48, var46 });
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        if (module0685.NIL != var51) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
            module0642.f39020(var51);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
        final SubLObject var52 = module0015.$g533$.currentBinding(var45);
        try {
            module0015.$g533$.bind((SubLObject)module0685.T, var45);
            module0642.f39019(var17);
        }
        finally {
            module0015.$g533$.rebind(var52, var45);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f41982(final SubLObject var9) {
        SubLObject var10 = (SubLObject)module0685.NIL;
        SubLObject var11 = (SubLObject)module0685.NIL;
        SubLObject var12 = (SubLObject)module0685.NIL;
        SubLObject var13 = (SubLObject)module0685.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var9, (SubLObject)module0685.$ic77$);
        var10 = var9.first();
        SubLObject var14 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var9, (SubLObject)module0685.$ic77$);
        var11 = var14.first();
        var14 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var9, (SubLObject)module0685.$ic77$);
        var12 = var14.first();
        var14 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var9, (SubLObject)module0685.$ic77$);
        var13 = var14.first();
        var14 = var14.rest();
        if (module0685.NIL != var14) {
            cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)module0685.$ic77$);
            return (SubLObject)module0685.NIL;
        }
        final SubLObject var15 = f41983(var10, var11, var12, var13);
        if (module0685.NIL == module0369.f25691(var15)) {
            return module0656.f39789((SubLObject)module0685.$ic78$, var9, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED);
        }
        return f41984(var15);
    }
    
    public static SubLObject f41985(final SubLObject var35, SubLObject var16, SubLObject var17, SubLObject var18) {
        if (var16 == module0685.UNPROVIDED) {
            var16 = (SubLObject)module0685.NIL;
        }
        if (var17 == module0685.UNPROVIDED) {
            var17 = (SubLObject)module0685.NIL;
        }
        if (var18 == module0685.UNPROVIDED) {
            var18 = (SubLObject)module0685.NIL;
        }
        final SubLThread var36 = SubLProcess.currentSubLThread();
        if (module0685.NIL == var18) {
            var18 = (SubLObject)module0685.$ic46$;
        }
        if (module0685.NIL == var16) {
            var16 = (SubLObject)module0685.$ic47$;
        }
        final SubLObject var37 = f41986(var35);
        final SubLObject var38 = module0369.f25782(var35);
        final SubLObject var39 = module0369.f25629(var38);
        final SubLObject var40 = module0369.f25732(var38);
        final SubLObject var41 = module0369.f25422(var40);
        final SubLObject var42 = module0369.f25421(var40);
        final SubLObject var43 = module0361.f23996(var42);
        final SubLObject var44 = module0369.f25687(var38);
        if (module0685.NIL == var17) {
            final SubLObject var45 = var16;
            if (var45.eql((SubLObject)module0685.$ic48$)) {
                var17 = PrintLow.format((SubLObject)module0685.NIL, (SubLObject)module0685.$ic80$, new SubLObject[] { var43, var41, var39, var37 });
            }
            else if (var45.eql((SubLObject)module0685.$ic47$)) {
                var17 = PrintLow.format((SubLObject)module0685.NIL, (SubLObject)module0685.$ic81$, new SubLObject[] { var43, var41, var39, var37 });
            }
            else if (var45.eql((SubLObject)module0685.$ic51$)) {
                var17 = PrintLow.format((SubLObject)module0685.NIL, (SubLObject)module0685.$ic82$, new SubLObject[] { var43, var41, var39, var37, var44 });
            }
        }
        module0642.f39020(module0015.$g459$.getGlobalValue());
        final SubLObject var46 = module0656.f39832(var18);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var36), (SubLObject)module0685.$ic83$, new SubLObject[] { var43, var41, var39, var37 });
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        if (module0685.NIL != var46) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
            module0642.f39020(var46);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
        final SubLObject var47 = module0015.$g533$.currentBinding(var36);
        try {
            module0015.$g533$.bind((SubLObject)module0685.T, var36);
            module0642.f39019(var17);
        }
        finally {
            module0015.$g533$.rebind(var47, var36);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        module0642.f39020(module0015.$g460$.getGlobalValue());
        return var38;
    }
    
    public static SubLObject f41986(final SubLObject var35) {
        final SubLObject var36 = module0369.f25782(var35);
        final SubLObject var37 = module0369.f25744(var36);
        return Sequences.position(var35, var37, Symbols.symbol_function((SubLObject)module0685.EQ), (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED);
    }
    
    public static SubLObject f41983(final SubLObject var12, final SubLObject var13, final SubLObject var14, final SubLObject var49) {
        final SubLObject var50 = f41968(var12, var13, var14);
        if (module0685.NIL != module0369.f25684(var50)) {
            final SubLObject var51 = reader.read_from_string_ignoring_errors(var49, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED);
            if (module0685.NIL != module0004.f106(var51)) {
                final SubLObject var52 = ConsesLow.nth(var51, module0369.f25744(var50));
                return var52;
            }
        }
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f41984(final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        final SubLObject var37 = module0369.f25782(var35);
        final SubLObject var38 = module0369.f25732(var37);
        final SubLObject var39 = module0369.f25421(var38);
        module0642.f39020((SubLObject)module0685.$ic57$);
        module0642.f39029((SubLObject)module0685.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0642.f39029((SubLObject)module0685.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)module0685.$ic85$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0685.UNPROVIDED);
        final SubLObject var40 = module0015.$g535$.currentBinding(var36);
        try {
            module0015.$g535$.bind((SubLObject)module0685.T, var36);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
            final SubLObject var26_53 = module0015.$g533$.currentBinding(var36);
            try {
                module0015.$g533$.bind((SubLObject)module0685.T, var36);
                module0644.f39197();
                module0642.f39021((SubLObject)module0685.$ic85$);
                module0642.f39032((SubLObject)module0685.UNPROVIDED);
                module0656.f39837((SubLObject)module0685.$ic65$, var35, (SubLObject)module0685.$ic48$, (SubLObject)module0685.NIL, (SubLObject)module0685.$ic74$, (SubLObject)module0685.UNPROVIDED);
                module0642.f39019((SubLObject)module0685.$ic86$);
                module0656.f39837((SubLObject)module0685.$ic54$, var37, (SubLObject)module0685.$ic48$, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED);
                module0642.f39051((SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED);
                f41964(var38, (SubLObject)module0685.UNPROVIDED);
                module0642.f39026((SubLObject)module0685.TWO_INTEGER);
                final SubLObject var41 = module0369.f25687(var37);
                final SubLObject var42 = module0369.f25749(var37);
                module0642.f39021((SubLObject)module0685.$ic63$);
                module0642.f39026((SubLObject)module0685.UNPROVIDED);
                f41972(var41, var42);
                final SubLObject var43 = Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("S#45965", "CYC"), var35);
                module0642.f39026((SubLObject)module0685.UNPROVIDED);
                module0642.f39021(PrintLow.format((SubLObject)module0685.NIL, (SubLObject)module0685.$ic87$, Sequences.length(var43)));
                if (module0685.NIL != var43) {
                    SubLObject var44 = var43;
                    SubLObject var45 = (SubLObject)module0685.NIL;
                    var45 = var44.first();
                    while (module0685.NIL != var44) {
                        module0656.f39804(var45, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED);
                        module0642.f39026((SubLObject)module0685.UNPROVIDED);
                        var44 = var44.rest();
                        var45 = var44.first();
                    }
                }
                else {
                    module0642.f39019((SubLObject)module0685.$ic88$);
                    module0642.f39026((SubLObject)module0685.UNPROVIDED);
                }
                module0642.f39026((SubLObject)module0685.UNPROVIDED);
                module0642.f39021((SubLObject)module0685.$ic89$);
                final SubLObject var46 = module0369.f25775(var35);
                final SubLObject var47 = module0333.f22430(var46);
                final SubLObject var48 = module0361.f24160(var39);
                module0671.f41013(var47, var48);
                module0642.f39029((SubLObject)module0685.UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var26_53, var36);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0685.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var40, var36);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0685.UNPROVIDED);
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f41978(final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
        final SubLObject var37 = module0015.$g533$.currentBinding(var36);
        try {
            module0015.$g533$.bind((SubLObject)module0685.T, var36);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
            final SubLObject var26_58 = module0015.$g533$.currentBinding(var36);
            try {
                module0015.$g533$.bind((SubLObject)module0685.T, var36);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0685.$ic90$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0685.$ic91$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
                final SubLObject var26_59 = module0015.$g533$.currentBinding(var36);
                try {
                    module0015.$g533$.bind((SubLObject)module0685.T, var36);
                    final SubLObject var38 = module0369.f25775(var35);
                    module0671.f41013(var38, module0361.f24160(module0369.f25792(var35)));
                }
                finally {
                    module0015.$g533$.rebind(var26_59, var36);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var26_58, var36);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0685.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var37, var36);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return var35;
    }
    
    public static SubLObject f41987(final SubLObject var1, final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        var61.resetMultipleValues();
        final SubLObject var62 = f41988(var1);
        final SubLObject var63 = var61.secondMultipleValue();
        final SubLObject var64 = var61.thirdMultipleValue();
        var61.resetMultipleValues();
        final SubLObject var65 = Sequences.length(var62);
        if (module0685.NIL == var63 && var65.isZero()) {
            if (module0685.NIL != module0369.f25429(var1)) {
                module0642.f39021((SubLObject)module0685.$ic92$);
            }
            else {
                module0642.f39021((SubLObject)module0685.$ic93$);
            }
        }
        else if (var65.isZero()) {
            module0642.f39021((SubLObject)module0685.$ic94$);
        }
        else if (module0685.NIL == var63 && module0685.ONE_INTEGER.numE(var65)) {
            final SubLObject var66 = var62.first();
            module0642.f39021((SubLObject)module0685.$ic95$);
            module0642.f39032((SubLObject)module0685.UNPROVIDED);
            module0656.f39915(module0685.$ic96$, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED);
            module0642.f39032((SubLObject)module0685.UNPROVIDED);
            f41989(var66, var64, var65);
        }
        else {
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39020(module0015.$g352$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
            module0642.f39020((SubLObject)module0685.ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
            module0642.f39020(module0015.$g353$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
            module0642.f39020((SubLObject)module0685.TWO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
            module0642.f39020(module0015.$g354$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
            module0642.f39020((SubLObject)module0685.TWO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
            final SubLObject var67 = module0015.$g533$.currentBinding(var61);
            try {
                module0015.$g533$.bind((SubLObject)module0685.T, var61);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
                final SubLObject var26_65 = module0015.$g533$.currentBinding(var61);
                try {
                    module0015.$g533$.bind((SubLObject)module0685.T, var61);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0685.$ic90$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0685.$ic91$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
                    final SubLObject var26_66 = module0015.$g533$.currentBinding(var61);
                    try {
                        module0015.$g533$.bind((SubLObject)module0685.T, var61);
                        module0642.f39021((SubLObject)module0685.$ic97$);
                    }
                    finally {
                        module0015.$g533$.rebind(var26_66, var61);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    f41990(var63, (SubLObject)module0685.NIL, (SubLObject)module0685.T);
                    if (module0685.NIL != module0685.$g5387$.getDynamicValue(var61)) {
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0685.$ic90$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0685.$ic91$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
                        final SubLObject var26_67 = module0015.$g533$.currentBinding(var61);
                        try {
                            module0015.$g533$.bind((SubLObject)module0685.T, var61);
                            module0642.f39021((SubLObject)module0685.$ic98$);
                        }
                        finally {
                            module0015.$g533$.rebind(var26_67, var61);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                }
                finally {
                    module0015.$g533$.rebind(var26_65, var61);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0685.UNPROVIDED);
                SubLObject var68 = (SubLObject)module0685.ZERO_INTEGER;
                SubLObject var69 = (SubLObject)module0685.NIL;
                if (module0685.NIL == var69) {
                    SubLObject var70 = var62;
                    SubLObject var71 = (SubLObject)module0685.NIL;
                    var71 = var70.first();
                    while (module0685.NIL == var69 && module0685.NIL != var70) {
                        if (module0685.NIL != var60 && var68.numGE(var60)) {
                            var69 = (SubLObject)module0685.T;
                        }
                        else {
                            var68 = Numbers.add(var68, (SubLObject)module0685.ONE_INTEGER);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
                            final SubLObject var26_68 = module0015.$g533$.currentBinding(var61);
                            try {
                                module0015.$g533$.bind((SubLObject)module0685.T, var61);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0685.$ic90$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0685.$ic91$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
                                final SubLObject var26_69 = module0015.$g533$.currentBinding(var61);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0685.T, var61);
                                    f41989(var71, var64, var65);
                                }
                                finally {
                                    module0015.$g533$.rebind(var26_69, var61);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                f41991(var71, var63);
                                if (module0685.NIL != module0685.$g5387$.getDynamicValue(var61)) {
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)module0685.$ic90$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)module0685.$ic91$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
                                    final SubLObject var26_70 = module0015.$g533$.currentBinding(var61);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0685.T, var61);
                                        final SubLObject var72 = Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("S#45966", "CYC"), var71);
                                        if (module0685.NIL != var72) {
                                            SubLObject var73 = var72;
                                            SubLObject var74 = (SubLObject)module0685.NIL;
                                            var74 = var73.first();
                                            while (module0685.NIL != var73) {
                                                module0656.f39804(var74, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED);
                                                module0642.f39026((SubLObject)module0685.UNPROVIDED);
                                                var73 = var73.rest();
                                                var74 = var73.first();
                                            }
                                        }
                                        else {
                                            module0642.f39019((SubLObject)module0685.$ic88$);
                                            module0642.f39026((SubLObject)module0685.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var26_70, var61);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var26_68, var61);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0685.UNPROVIDED);
                        }
                        var70 = var70.rest();
                        var71 = var70.first();
                    }
                }
            }
            finally {
                module0015.$g533$.rebind(var67, var61);
            }
            module0642.f39020(module0015.$g347$.getGlobalValue());
            if (module0685.NIL != module0655.$g5094$.getDynamicValue(var61) && module0685.NIL != module0411.f28576(var1)) {
                f41992(var1);
            }
        }
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f41989(final SubLObject var15, final SubLObject var63, final SubLObject var64) {
        final SubLObject var65 = (SubLObject)(module0685.ONE_INTEGER.numE(var64) ? module0685.$ic99$ : PrintLow.format((SubLObject)module0685.NIL, (SubLObject)module0685.$ic100$, module0369.f25629(var15)));
        final SubLObject var66 = f41993(var15, var63);
        f41994(var66);
        module0656.f39837((SubLObject)module0685.$ic54$, var15, (SubLObject)module0685.$ic48$, var65, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED);
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f41993(final SubLObject var15, final SubLObject var63) {
        if (module0685.NIL != module0369.f25754(var15)) {
            return (SubLObject)module0685.$ic101$;
        }
        if (module0685.NIL != f41995(var15, var63)) {
            return (SubLObject)module0685.$ic102$;
        }
        return (SubLObject)module0685.$ic103$;
    }
    
    public static SubLObject f41994(final SubLObject var74) {
        final SubLThread var75 = SubLProcess.currentSubLThread();
        final SubLObject var76 = f41996(var74);
        SubLObject var77 = (SubLObject)module0685.NIL;
        if (var74.eql((SubLObject)module0685.$ic103$)) {
            var77 = (SubLObject)module0685.$ic104$;
        }
        else if (var74.eql((SubLObject)module0685.$ic101$)) {
            var77 = (SubLObject)module0685.$ic105$;
        }
        else if (var74.eql((SubLObject)module0685.$ic102$)) {
            var77 = (SubLObject)module0685.$ic106$;
        }
        if (module0685.$ic103$ != var74) {
            module0642.f39020(module0015.$g240$.getGlobalValue());
            module0642.f39020(module0015.$g149$.getGlobalValue());
            module0642.f39020(module0015.$g152$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
            module0642.f39048(var76);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
            final SubLObject var78 = module0015.$g533$.currentBinding(var75);
            try {
                module0015.$g533$.bind((SubLObject)module0685.T, var75);
                module0683.f41675((SubLObject)module0685.$ic107$, var77, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var78, var75);
            }
            module0642.f39020(module0015.$g150$.getGlobalValue());
            module0642.f39020(module0015.$g241$.getGlobalValue());
        }
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f41995(final SubLObject var15, final SubLObject var77) {
        SubLObject var78 = module0369.f25744(var15);
        SubLObject var79 = (SubLObject)module0685.NIL;
        var79 = var78.first();
        while (module0685.NIL != var78) {
            if (module0685.NIL != module0077.f5320(var79, var77)) {
                return (SubLObject)module0685.T;
            }
            var78 = var78.rest();
            var79 = var78.first();
        }
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f41996(final SubLObject var74) {
        if (var74.eql((SubLObject)module0685.$ic103$)) {
            return (SubLObject)module0685.NIL;
        }
        if (var74.eql((SubLObject)module0685.$ic101$)) {
            return (SubLObject)module0685.$ic108$;
        }
        if (var74.eql((SubLObject)module0685.$ic102$)) {
            return (SubLObject)module0685.$ic109$;
        }
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f41988(final SubLObject var1) {
        final SubLObject var2 = module0369.f25590(var1);
        final SubLObject var3 = module0077.f5313(Symbols.symbol_function((SubLObject)module0685.EQ), module0369.f25665(var1));
        SubLObject var4 = module0055.f4034(module0369.f25495(var1));
        SubLObject var5 = (SubLObject)module0685.NIL;
        var5 = var4.first();
        while (module0685.NIL != var4) {
            module0077.f5326(var5, var3);
            var4 = var4.rest();
            var5 = var4.first();
        }
        SubLObject var6 = (SubLObject)module0685.NIL;
        final SubLObject var7 = module0369.f25492(var1);
        if (module0685.NIL == module0065.f4772(var7, (SubLObject)module0685.$ic110$)) {
            final SubLObject var79_80 = var7;
            if (module0685.NIL == module0065.f4775(var79_80, (SubLObject)module0685.$ic110$)) {
                final SubLObject var8 = module0065.f4740(var79_80);
                final SubLObject var9 = (SubLObject)module0685.NIL;
                SubLObject var10;
                SubLObject var11;
                SubLObject var12;
                SubLObject var13;
                for (var10 = Sequences.length(var8), var11 = (SubLObject)module0685.NIL, var11 = (SubLObject)module0685.ZERO_INTEGER; var11.numL(var10); var11 = Numbers.add(var11, (SubLObject)module0685.ONE_INTEGER)) {
                    var12 = ((module0685.NIL != var9) ? Numbers.subtract(var10, var11, (SubLObject)module0685.ONE_INTEGER) : var11);
                    var13 = Vectors.aref(var8, var12);
                    if (module0685.NIL == module0065.f4749(var13) || module0685.NIL == module0065.f4773((SubLObject)module0685.$ic110$)) {
                        if (module0685.NIL != module0065.f4749(var13)) {
                            var13 = (SubLObject)module0685.$ic110$;
                        }
                        var6 = (SubLObject)ConsesLow.cons(var13, var6);
                    }
                }
            }
            final SubLObject var86_87 = var7;
            if (module0685.NIL == module0065.f4777(var86_87)) {
                final SubLObject var14 = module0065.f4738(var86_87);
                SubLObject var15 = (SubLObject)module0685.NIL;
                SubLObject var16 = (SubLObject)module0685.NIL;
                final Iterator var17 = Hashtables.getEntrySetIterator(var14);
                try {
                    while (Hashtables.iteratorHasNext(var17)) {
                        final Map.Entry var18 = Hashtables.iteratorNextEntry(var17);
                        var15 = Hashtables.getEntryKey(var18);
                        var16 = Hashtables.getEntryValue(var18);
                        var6 = (SubLObject)ConsesLow.cons(var16, var6);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var17);
                }
            }
        }
        var6 = Sort.sort(var6, Symbols.symbol_function((SubLObject)module0685.$ic111$), Symbols.symbol_function((SubLObject)module0685.$ic112$));
        return Values.values(var6, var2, var3);
    }
    
    public static SubLObject f41991(final SubLObject var44, final SubLObject var62) {
        final SubLObject var63 = module0369.f25687(var44);
        f41997(var63, var62);
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f41992(final SubLObject var1) {
        final SubLObject var2 = module0411.f28578(var1);
        module0642.f39019((SubLObject)module0685.$ic113$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        f41998(var2);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f41998(final SubLObject var91) {
        if (var91.eql((SubLObject)module0685.$ic114$)) {
            module0642.f39019((SubLObject)module0685.$ic115$);
        }
        else if (var91.eql((SubLObject)module0685.$ic116$)) {
            module0642.f39019((SubLObject)module0685.$ic117$);
        }
        else if (var91.eql((SubLObject)module0685.$ic118$)) {
            module0642.f39019((SubLObject)module0685.$ic119$);
        }
        else if (var91.eql((SubLObject)module0685.$ic120$)) {
            module0642.f39019((SubLObject)module0685.$ic121$);
        }
        else if (var91.eql((SubLObject)module0685.$ic122$)) {
            module0642.f39019((SubLObject)module0685.$ic123$);
        }
        else {
            module0642.f39019((SubLObject)module0685.$ic124$);
        }
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f41975(final SubLObject var24, SubLObject var92) {
        if (var92 == module0685.UNPROVIDED) {
            var92 = (SubLObject)module0685.$ic125$;
        }
        module0642.f39019((SubLObject)module0685.$ic126$);
        if (module0685.$ic125$ == var92) {
            SubLObject var93 = var24;
            SubLObject var94 = (SubLObject)module0685.NIL;
            var94 = var93.first();
            while (module0685.NIL != var93) {
                if (!var94.eql(var24.first())) {
                    module0642.f39032((SubLObject)module0685.UNPROVIDED);
                }
                module0642.f39020(module0015.$g459$.getGlobalValue());
                f41999(var94);
                module0642.f39020(module0015.$g460$.getGlobalValue());
                var93 = var93.rest();
                var94 = var93.first();
            }
        }
        else {
            SubLObject var95 = (SubLObject)module0685.NIL;
            SubLObject var96 = var92;
            SubLObject var97 = (SubLObject)module0685.NIL;
            var97 = var96.first();
            while (module0685.NIL != var96) {
                final SubLObject var98 = module0233.f15368(var97, var24);
                if (module0685.NIL != var98) {
                    if (module0685.NIL != var95) {
                        module0642.f39032((SubLObject)module0685.UNPROVIDED);
                    }
                    else {
                        var95 = (SubLObject)module0685.T;
                    }
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    f41999(var98);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                var96 = var96.rest();
                var97 = var96.first();
            }
        }
        module0642.f39019((SubLObject)module0685.$ic69$);
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f41999(final SubLObject var93) {
        SubLObject var94 = (SubLObject)module0685.NIL;
        SubLObject var95 = (SubLObject)module0685.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var93, var93, (SubLObject)module0685.$ic127$);
        var94 = var93.first();
        final SubLObject var96 = var95 = var93.rest();
        module0642.f39019((SubLObject)module0685.$ic126$);
        module0656.f39915(var94, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED);
        module0642.f39019((SubLObject)module0685.$ic128$);
        module0656.f39915(var95, (SubLObject)module0685.UNPROVIDED, (SubLObject)module0685.UNPROVIDED);
        module0642.f39019((SubLObject)module0685.$ic69$);
        return var93;
    }
    
    public static SubLObject f41973(final SubLObject var24, SubLObject var92) {
        if (var92 == module0685.UNPROVIDED) {
            var92 = (SubLObject)module0685.$ic125$;
        }
        final SubLThread var93 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39020((SubLObject)module0685.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39020((SubLObject)module0685.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39020((SubLObject)module0685.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
        final SubLObject var94 = module0015.$g533$.currentBinding(var93);
        try {
            module0015.$g533$.bind((SubLObject)module0685.T, var93);
            if (module0685.$ic125$ == var92) {
                SubLObject var95 = var24;
                SubLObject var96 = (SubLObject)module0685.NIL;
                var96 = var95.first();
                while (module0685.NIL != var95) {
                    f42000(var96);
                    var95 = var95.rest();
                    var96 = var95.first();
                }
            }
            else {
                SubLObject var95 = var92;
                SubLObject var97 = (SubLObject)module0685.NIL;
                var97 = var95.first();
                while (module0685.NIL != var95) {
                    final SubLObject var98 = module0233.f15368(var97, var24);
                    if (module0685.NIL != var98) {
                        f42000(var98);
                    }
                    var95 = var95.rest();
                    var97 = var95.first();
                }
            }
        }
        finally {
            module0015.$g533$.rebind(var94, var93);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f42000(final SubLObject var93) {
        final SubLThread var94 = SubLProcess.currentSubLThread();
        SubLObject var95 = (SubLObject)module0685.NIL;
        SubLObject var96 = (SubLObject)module0685.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var93, var93, (SubLObject)module0685.$ic127$);
        var95 = var93.first();
        final SubLObject var97 = var96 = var93.rest();
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
        final SubLObject var98 = module0015.$g533$.currentBinding(var94);
        try {
            module0015.$g533$.bind((SubLObject)module0685.T, var94);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g370$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0685.$ic129$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0685.$ic91$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
            final SubLObject var26_102 = module0015.$g533$.currentBinding(var94);
            try {
                module0015.$g533$.bind((SubLObject)module0685.T, var94);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0642.f39019(var95);
                module0642.f39020(module0015.$g460$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var26_102, var94);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g370$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0685.$ic130$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0685.$ic91$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
            final SubLObject var26_103 = module0015.$g533$.currentBinding(var94);
            try {
                module0015.$g533$.bind((SubLObject)module0685.T, var94);
                module0642.f39027((SubLObject)module0685.$ic131$, (SubLObject)module0685.UNPROVIDED);
                module0642.f39027((SubLObject)module0685.$ic132$, (SubLObject)module0685.UNPROVIDED);
                module0642.f39027((SubLObject)module0685.$ic131$, (SubLObject)module0685.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var26_103, var94);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39046(module0015.$g369$.getGlobalValue());
            module0642.f39020(module0015.$g370$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0685.$ic90$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0685.$ic91$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
            final SubLObject var26_104 = module0015.$g533$.currentBinding(var94);
            try {
                module0015.$g533$.bind((SubLObject)module0685.T, var94);
                module0656.f39915(var96, (SubLObject)module0685.ZERO_INTEGER, (SubLObject)module0685.T);
            }
            finally {
                module0015.$g533$.rebind(var26_104, var94);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var98, var94);
        }
        module0642.f39020(module0015.$g365$.getGlobalValue());
        module0642.f39029((SubLObject)module0685.UNPROVIDED);
        return var93;
    }
    
    public static SubLObject f42001(final SubLObject var24, SubLObject var92) {
        if (var92 == module0685.UNPROVIDED) {
            var92 = (SubLObject)module0685.$ic125$;
        }
        final SubLThread var93 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39020((SubLObject)module0685.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39020((SubLObject)module0685.TWO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39020((SubLObject)module0685.FOUR_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
        final SubLObject var94 = module0015.$g533$.currentBinding(var93);
        try {
            module0015.$g533$.bind((SubLObject)module0685.T, var93);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
            final SubLObject var26_105 = module0015.$g533$.currentBinding(var93);
            try {
                module0015.$g533$.bind((SubLObject)module0685.T, var93);
                f41990(var92, var24, (SubLObject)module0685.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var26_105, var93);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0685.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
            final SubLObject var26_106 = module0015.$g533$.currentBinding(var93);
            try {
                module0015.$g533$.bind((SubLObject)module0685.T, var93);
                f41997(var24, var92);
            }
            finally {
                module0015.$g533$.rebind(var26_106, var93);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0685.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var94, var93);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f41990(final SubLObject var92, SubLObject var24, SubLObject var107) {
        if (var24 == module0685.UNPROVIDED) {
            var24 = (SubLObject)module0685.NIL;
        }
        if (var107 == module0685.UNPROVIDED) {
            var107 = (SubLObject)module0685.NIL;
        }
        if (module0685.$ic125$ == var92) {
            SubLObject var108 = var24;
            SubLObject var109 = (SubLObject)module0685.NIL;
            var109 = var108.first();
            while (module0685.NIL != var108) {
                f42002(module0233.f15355(var109), var107);
                var108 = var108.rest();
                var109 = var108.first();
            }
        }
        else {
            SubLObject var108 = var92;
            SubLObject var110 = (SubLObject)module0685.NIL;
            var110 = var108.first();
            while (module0685.NIL != var108) {
                f42002(var110, var107);
                var108 = var108.rest();
                var110 = var108.first();
            }
        }
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f41997(final SubLObject var24, SubLObject var92) {
        if (var92 == module0685.UNPROVIDED) {
            var92 = (SubLObject)module0685.$ic125$;
        }
        if (module0685.$ic125$ == var92) {
            SubLObject var93 = var24;
            SubLObject var94 = (SubLObject)module0685.NIL;
            var94 = var93.first();
            while (module0685.NIL != var93) {
                f42003(module0233.f15370(var94));
                var93 = var93.rest();
                var94 = var93.first();
            }
        }
        else {
            SubLObject var93 = var92;
            SubLObject var95 = (SubLObject)module0685.NIL;
            var95 = var93.first();
            while (module0685.NIL != var93) {
                final SubLObject var96 = module0233.f15368(var95, var24);
                if (module0685.NIL != var96) {
                    f42003(module0233.f15370(var96));
                }
                else {
                    f42004();
                }
                var93 = var93.rest();
                var95 = var93.first();
            }
        }
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f42002(final SubLObject var98, SubLObject var107) {
        if (var107 == module0685.UNPROVIDED) {
            var107 = (SubLObject)module0685.NIL;
        }
        final SubLThread var108 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39020(module0015.$g370$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39020(module0642.f39049((SubLObject)module0685.$ic90$));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39020(module0015.$g373$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39020(module0642.f39049((SubLObject)module0685.$ic91$));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
        final SubLObject var109 = module0015.$g533$.currentBinding(var108);
        try {
            module0015.$g533$.bind((SubLObject)module0685.T, var108);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            if (module0685.NIL != var107) {
                module0642.f39021(var98);
            }
            else {
                module0642.f39019(var98);
            }
            module0642.f39020(module0015.$g460$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var109, var108);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        return var98;
    }
    
    public static SubLObject f42003(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39020(module0015.$g370$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39020(module0642.f39049((SubLObject)module0685.$ic90$));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39020(module0015.$g373$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39020(module0642.f39049((SubLObject)module0685.$ic91$));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
        final SubLObject var101 = module0015.$g533$.currentBinding(var100);
        try {
            module0015.$g533$.bind((SubLObject)module0685.T, var100);
            module0656.f39915(var99, (SubLObject)module0685.ZERO_INTEGER, (SubLObject)module0685.T);
        }
        finally {
            module0015.$g533$.rebind(var101, var100);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        return var99;
    }
    
    public static SubLObject f42004() {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39020(module0015.$g370$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39020(module0642.f39049((SubLObject)module0685.$ic90$));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39020(module0015.$g373$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39020(module0642.f39049((SubLObject)module0685.$ic91$));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
        final SubLObject var20 = module0015.$g533$.currentBinding(var19);
        try {
            module0015.$g533$.bind((SubLObject)module0685.T, var19);
            module0642.f39032((SubLObject)module0685.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var20, var19);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f42005(final SubLObject var108) {
        final SubLThread var109 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39020((SubLObject)module0685.TWO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39020((SubLObject)module0685.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
        final SubLObject var110 = module0015.$g533$.currentBinding(var109);
        try {
            module0015.$g533$.bind((SubLObject)module0685.T, var109);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
            final SubLObject var26_109 = module0015.$g533$.currentBinding(var109);
            try {
                module0015.$g533$.bind((SubLObject)module0685.T, var109);
                SubLObject var111 = var108;
                SubLObject var112 = (SubLObject)module0685.NIL;
                var112 = var111.first();
                while (module0685.NIL != var111) {
                    SubLObject var114;
                    final SubLObject var113 = var114 = var112;
                    SubLObject var115 = (SubLObject)module0685.NIL;
                    SubLObject var116 = (SubLObject)module0685.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var114, var113, (SubLObject)module0685.$ic133$);
                    var115 = var114.first();
                    var114 = (var116 = var114.rest());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0685.$ic130$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0685.$ic91$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
                    final SubLObject var26_110 = module0015.$g533$.currentBinding(var109);
                    try {
                        module0015.$g533$.bind((SubLObject)module0685.T, var109);
                        module0642.f39020(module0015.$g459$.getGlobalValue());
                        module0642.f39019(var116);
                        module0642.f39020(module0015.$g460$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var26_110, var109);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    var111 = var111.rest();
                    var112 = var111.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var26_109, var109);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0685.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
            final SubLObject var26_111 = module0015.$g533$.currentBinding(var109);
            try {
                module0015.$g533$.bind((SubLObject)module0685.T, var109);
                SubLObject var111 = var108;
                SubLObject var112 = (SubLObject)module0685.NIL;
                var112 = var111.first();
                while (module0685.NIL != var111) {
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0685.$ic130$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0685.$ic91$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
                    final SubLObject var26_112 = module0015.$g533$.currentBinding(var109);
                    try {
                        module0015.$g533$.bind((SubLObject)module0685.T, var109);
                        module0642.f39027((SubLObject)module0685.$ic134$, (SubLObject)module0685.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var26_112, var109);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    var111 = var111.rest();
                    var112 = var111.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var26_111, var109);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0685.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
            final SubLObject var26_113 = module0015.$g533$.currentBinding(var109);
            try {
                module0015.$g533$.bind((SubLObject)module0685.T, var109);
                SubLObject var111 = var108;
                SubLObject var112 = (SubLObject)module0685.NIL;
                var112 = var111.first();
                while (module0685.NIL != var111) {
                    SubLObject var118;
                    final SubLObject var117 = var118 = var112;
                    SubLObject var115 = (SubLObject)module0685.NIL;
                    SubLObject var116 = (SubLObject)module0685.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var118, var117, (SubLObject)module0685.$ic133$);
                    var115 = var118.first();
                    var118 = (var116 = var118.rest());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0685.$ic130$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0685.$ic91$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0685.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0685.UNPROVIDED);
                    final SubLObject var26_114 = module0015.$g533$.currentBinding(var109);
                    try {
                        module0015.$g533$.bind((SubLObject)module0685.T, var109);
                        module0642.f39020(module0015.$g459$.getGlobalValue());
                        module0642.f39019(var115);
                        module0642.f39020(module0015.$g460$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var26_114, var109);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    var111 = var111.rest();
                    var112 = var111.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var26_113, var109);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0685.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var110, var109);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f42006() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41964", "S#45673", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41965", "S#45669", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41966", "S#45670", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41967", "CB-INFERENCE-ANSWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41970", "S#45967", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41971", "S#45968", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41968", "S#45969", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41972", "S#45970", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41974", "S#45971", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41969", "S#45972", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41976", "S#45973", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41979", "S#45974", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41977", "S#45975", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41980", "CB-SOCRATIC-QUERY-FROM-ANSWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41981", "S#45976", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41982", "CB-INFERENCE-ANSWER-FULL-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41985", "S#45977", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41986", "S#45978", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41983", "S#45979", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41984", "S#45980", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41978", "S#45981", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41987", "S#45676", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41989", "S#45683", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41993", "S#45982", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41994", "S#45983", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41995", "S#45984", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41996", "S#45985", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41988", "S#45681", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41991", "S#45684", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41992", "S#45986", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41998", "S#45987", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41975", "S#45988", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41999", "S#45989", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41973", "S#45990", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f42000", "S#45991", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f42001", "S#45992", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41990", "S#45682", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f41997", "S#45993", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f42002", "S#45994", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f42003", "S#45995", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f42004", "S#45996", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0685", "f42005", "S#45997", 1, 0, false);
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f42007() {
        module0685.$g5387$ = SubLFiles.defparameter("S#45998", (SubLObject)module0685.NIL);
        return (SubLObject)module0685.NIL;
    }
    
    public static SubLObject f42008() {
        module0015.f873((SubLObject)module0685.$ic45$);
        module0656.f39840((SubLObject)module0685.$ic54$, (SubLObject)module0685.$ic55$, (SubLObject)module0685.FOUR_INTEGER);
        Structures.register_method(module0656.$g5160$.getGlobalValue(), module0369.$g3151$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0685.$ic56$));
        module0015.f873((SubLObject)module0685.$ic73$);
        module0656.f39840((SubLObject)module0685.$ic59$, (SubLObject)module0685.$ic76$, (SubLObject)module0685.TWO_INTEGER);
        module0015.f873((SubLObject)module0685.$ic79$);
        module0656.f39840((SubLObject)module0685.$ic65$, (SubLObject)module0685.$ic84$, (SubLObject)module0685.FOUR_INTEGER);
        return (SubLObject)module0685.NIL;
    }
    
    public void declareFunctions() {
        f42006();
    }
    
    public void initializeVariables() {
        f42007();
    }
    
    public void runTopLevelForms() {
        f42008();
    }
    
    static {
        me = (SubLFile)new module0685();
        module0685.$g5387$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("SILK");
        $ic1$ = SubLObjectFactory.makeString("SILK Query :");
        $ic2$ = SubLObjectFactory.makeString("Mt :");
        $ic3$ = SubLObjectFactory.makeString("EL Query :");
        $ic4$ = SubLObjectFactory.makeString("Pragmatics :");
        $ic5$ = SubLObjectFactory.makeSymbol("S#26560", "CYC");
        $ic6$ = SubLObjectFactory.makeKeyword("NEW");
        $ic7$ = SubLObjectFactory.makeString("New");
        $ic8$ = SubLObjectFactory.makeKeyword("PREPARED");
        $ic9$ = SubLObjectFactory.makeString("Prepared");
        $ic10$ = SubLObjectFactory.makeKeyword("READY");
        $ic11$ = SubLObjectFactory.makeString("Ready");
        $ic12$ = SubLObjectFactory.makeKeyword("RUNNING");
        $ic13$ = SubLObjectFactory.makeString("Running");
        $ic14$ = SubLObjectFactory.makeKeyword("SUSPENDED");
        $ic15$ = SubLObjectFactory.makeString("Suspended");
        $ic16$ = SubLObjectFactory.makeKeyword("DEAD");
        $ic17$ = SubLObjectFactory.makeString("Dead");
        $ic18$ = SubLObjectFactory.makeKeyword("TAUTOLOGY");
        $ic19$ = SubLObjectFactory.makeString("Tautology");
        $ic20$ = SubLObjectFactory.makeKeyword("CONTRADICTION");
        $ic21$ = SubLObjectFactory.makeString("Contradiction");
        $ic22$ = SubLObjectFactory.makeKeyword("ILL-FORMED");
        $ic23$ = SubLObjectFactory.makeString("Ill-Formed");
        $ic24$ = SubLObjectFactory.makeSymbol("S#26563", "CYC");
        $ic25$ = SubLObjectFactory.makeKeyword("ABORT");
        $ic26$ = SubLObjectFactory.makeString("Abort");
        $ic27$ = SubLObjectFactory.makeKeyword("INTERRUPT");
        $ic28$ = SubLObjectFactory.makeString("Interrupt");
        $ic29$ = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $ic30$ = SubLObjectFactory.makeString("Max Number");
        $ic31$ = SubLObjectFactory.makeKeyword("MAX-TIME");
        $ic32$ = SubLObjectFactory.makeString("Max Time");
        $ic33$ = SubLObjectFactory.makeKeyword("MAX-STEP");
        $ic34$ = SubLObjectFactory.makeString("Max Step");
        $ic35$ = SubLObjectFactory.makeKeyword("MAX-PROBLEM-COUNT");
        $ic36$ = SubLObjectFactory.makeString("Max Problem Count");
        $ic37$ = SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $ic38$ = SubLObjectFactory.makeString("Probably Approximately Done");
        $ic39$ = SubLObjectFactory.makeKeyword("EXHAUST");
        $ic40$ = SubLObjectFactory.makeString("Exhaust");
        $ic41$ = SubLObjectFactory.makeKeyword("EXHAUST-TOTAL");
        $ic42$ = SubLObjectFactory.makeString("Exhaust Total");
        $ic43$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#45911", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45912", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45999", "CYC"));
        $ic44$ = SubLObjectFactory.makeString("~A did not specify an inference answer");
        $ic45$ = SubLObjectFactory.makeSymbol("CB-INFERENCE-ANSWER");
        $ic46$ = SubLObjectFactory.makeKeyword("MAIN");
        $ic47$ = SubLObjectFactory.makeKeyword("TERSE");
        $ic48$ = SubLObjectFactory.makeKeyword("MINIMAL");
        $ic49$ = SubLObjectFactory.makeString("[~A.~A.~A]");
        $ic50$ = SubLObjectFactory.makeString("[Inference Answer ~A.~A.~A]");
        $ic51$ = SubLObjectFactory.makeKeyword("VERBOSE");
        $ic52$ = SubLObjectFactory.makeString("[Inference Answer ~A.~A.~A ~A]");
        $ic53$ = SubLObjectFactory.makeString("cb-inference-answer&~A&~A&~A");
        $ic54$ = SubLObjectFactory.makeKeyword("INFERENCE-ANSWER");
        $ic55$ = SubLObjectFactory.makeSymbol("S#45967", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#45968", "CYC");
        $ic57$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic58$ = SubLObjectFactory.makeString("Inference Answer");
        $ic59$ = SubLObjectFactory.makeKeyword("SOCRATIC-QUERY-FROM-ANSWER");
        $ic60$ = SubLObjectFactory.makeString("[Socratic Query]");
        $ic61$ = SubLObjectFactory.makeString("Creation Time :  ");
        $ic62$ = SubLObjectFactory.makeString("Steps to This Answer :  ");
        $ic63$ = SubLObjectFactory.makeString("Answer Bindings :");
        $ic64$ = SubLObjectFactory.makeString("Justifications :");
        $ic65$ = SubLObjectFactory.makeKeyword("INFERENCE-ANSWER-FULL-JUSTIFICATION");
        $ic66$ = SubLObjectFactory.makeString("[Full]");
        $ic67$ = SubLObjectFactory.makeString("after");
        $ic68$ = SubLObjectFactory.makeString(" (at ");
        $ic69$ = SubLObjectFactory.makeString(")");
        $ic70$ = SubLObjectFactory.makeSymbol("S#4951", "CYC");
        $ic71$ = SubLObjectFactory.makeString(" today");
        $ic72$ = SubLObjectFactory.makeString(" on ~A");
        $ic73$ = SubLObjectFactory.makeSymbol("CB-SOCRATIC-QUERY-FROM-ANSWER");
        $ic74$ = SubLObjectFactory.makeKeyword("SELF");
        $ic75$ = SubLObjectFactory.makeString("cb-socratic-query-from-answer&~A&~A&~A");
        $ic76$ = SubLObjectFactory.makeSymbol("S#45976", "CYC");
        $ic77$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#45911", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45912", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45999", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46000", "CYC"));
        $ic78$ = SubLObjectFactory.makeString("~A did not specify an inference answer justification");
        $ic79$ = SubLObjectFactory.makeSymbol("CB-INFERENCE-ANSWER-FULL-JUSTIFICATION");
        $ic80$ = SubLObjectFactory.makeString("[~A.~A.~A.~A]");
        $ic81$ = SubLObjectFactory.makeString("[Inference Answer ~A.~A.~A.~A]");
        $ic82$ = SubLObjectFactory.makeString("[Inference Answer ~A.~A.~A.~A ~A]");
        $ic83$ = SubLObjectFactory.makeString("cb-inference-answer-full-justification&~A&~A&~A&~A");
        $ic84$ = SubLObjectFactory.makeSymbol("S#45977", "CYC");
        $ic85$ = SubLObjectFactory.makeString("Inference Answer Full Justification");
        $ic86$ = SubLObjectFactory.makeString(" for answer ");
        $ic87$ = SubLObjectFactory.makeString("Answer Justification Mt~p : ");
        $ic88$ = SubLObjectFactory.makeString("None found");
        $ic89$ = SubLObjectFactory.makeString("Full Justification :");
        $ic90$ = SubLObjectFactory.makeKeyword("LEFT");
        $ic91$ = SubLObjectFactory.makeKeyword("TOP");
        $ic92$ = SubLObjectFactory.makeString("Query was not yet proven");
        $ic93$ = SubLObjectFactory.makeString("Query was not proven");
        $ic94$ = SubLObjectFactory.makeString("No answers");
        $ic95$ = SubLObjectFactory.makeString("Query was proven");
        $ic96$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("True"));
        $ic97$ = SubLObjectFactory.makeString("Answer");
        $ic98$ = SubLObjectFactory.makeString("Answer Mt");
        $ic99$ = SubLObjectFactory.makeString("[Explain]");
        $ic100$ = SubLObjectFactory.makeString("[Explain #~A]");
        $ic101$ = SubLObjectFactory.makeKeyword("NEW-ANSWER");
        $ic102$ = SubLObjectFactory.makeKeyword("NEW-JUSTIFICATION");
        $ic103$ = SubLObjectFactory.makeKeyword("OLD");
        $ic104$ = SubLObjectFactory.makeString("Old answer");
        $ic105$ = SubLObjectFactory.makeString("New answer");
        $ic106$ = SubLObjectFactory.makeString("Old answer with a new justification");
        $ic107$ = SubLObjectFactory.makeString("*");
        $ic108$ = SubLObjectFactory.makeKeyword("YELLOW");
        $ic109$ = SubLObjectFactory.makeKeyword("GREEN");
        $ic110$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic111$ = SubLObjectFactory.makeSymbol(">");
        $ic112$ = SubLObjectFactory.makeSymbol("S#28653", "CYC");
        $ic113$ = SubLObjectFactory.makeString("Weighing these arguments yields an overall result of: ");
        $ic114$ = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $ic115$ = SubLObjectFactory.makeString("True (default)");
        $ic116$ = SubLObjectFactory.makeKeyword("TRUE-MON");
        $ic117$ = SubLObjectFactory.makeString("True (monotonic)");
        $ic118$ = SubLObjectFactory.makeKeyword("FALSE-DEF");
        $ic119$ = SubLObjectFactory.makeString("False (default)");
        $ic120$ = SubLObjectFactory.makeKeyword("FALSE-MON");
        $ic121$ = SubLObjectFactory.makeString("False (monotonic)");
        $ic122$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic123$ = SubLObjectFactory.makeString("Unknown");
        $ic124$ = SubLObjectFactory.makeString("???");
        $ic125$ = SubLObjectFactory.makeKeyword("ALL");
        $ic126$ = SubLObjectFactory.makeString("(");
        $ic127$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic128$ = SubLObjectFactory.makeString(" . ");
        $ic129$ = SubLObjectFactory.makeKeyword("RIGHT");
        $ic130$ = SubLObjectFactory.makeKeyword("CENTER");
        $ic131$ = SubLObjectFactory.makeKeyword("NBSP");
        $ic132$ = SubLObjectFactory.makeKeyword("RIGHTWARDS-ARROW");
        $ic133$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#46001", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46002", "CYC"));
        $ic134$ = SubLObjectFactory.makeKeyword("UPWARDS-ARROW");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0685.class
	Total time: 543 ms
	
	Decompiled with Procyon 0.5.32.
*/