package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0744 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0744";
    public static final String myFingerPrint = "69e8f22d236bc99d21380dba861e8087abf02d74be2f46cdf258bacef19d58f4";
    public static SubLSymbol $g5927$;
    public static SubLSymbol $g5928$;
    private static SubLSymbol $g5929$;
    public static SubLSymbol $g5930$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLInteger $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    
    
    public static SubLObject f46200(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)T;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = $g5929$.getGlobalValue();
        SubLObject var5 = (SubLObject)NIL;
        try {
            var5 = Locks.seize_lock(var4);
            if (NIL != $g5927$.getGlobalValue()) {
                var3 = (SubLObject)T;
            }
            if (NIL != var1 || NIL == $g5928$.getGlobalValue()) {
                $g5928$.setGlobalValue((SubLObject)T);
                if (NIL != Filesys.probe_file($g5930$.getDynamicValue(var2))) {
                    $g5927$.setGlobalValue(module0093.f6613($g5930$.getDynamicValue(var2), Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)$ic3$));
                    if (NIL != $g5927$.getGlobalValue()) {
                        var3 = (SubLObject)T;
                    }
                }
            }
        }
        finally {
            if (NIL != var5) {
                Locks.release_lock(var4);
            }
        }
        return var3;
    }
    
    public static SubLObject f46201() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = $g5929$.getGlobalValue();
        SubLObject var4 = (SubLObject)NIL;
        try {
            var4 = Locks.seize_lock(var3);
            $g5927$.setGlobalValue((SubLObject)NIL);
            if (NIL != Filesys.probe_file($g5930$.getDynamicValue(var2))) {
                Filesys.delete_file($g5930$.getDynamicValue(var2));
            }
        }
        finally {
            if (NIL != var4) {
                Locks.release_lock(var3);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f46202(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)NIL;
        final SubLObject var11 = $g5929$.getGlobalValue();
        SubLObject var12 = (SubLObject)NIL;
        try {
            var12 = Locks.seize_lock(var11);
            if (NIL != Filesys.probe_file($g5930$.getDynamicValue(var9))) {
                var10 = module0093.f6610($g5930$.getDynamicValue(var9), Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)$ic3$);
            }
            else {
                var10 = module0093.f6607($g5930$.getDynamicValue(var9), (SubLObject)$ic4$, (SubLObject)$ic4$, Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)$ic3$);
            }
        }
        finally {
            if (NIL != var12) {
                Locks.release_lock(var11);
            }
        }
        if (NIL == var10) {
            Errors.error((SubLObject)$ic5$, $g5930$.getDynamicValue(var9));
        }
        if (NIL == Filesys.probe_file(var8)) {
            Errors.error((SubLObject)$ic6$, var8);
        }
        final SubLObject var13 = StreamsLow.open(var8, EMPTY_SUBL_OBJECT_ARRAY);
        SubLObject var14 = (SubLObject)NIL;
        try {
            var14 = compatibility.open_text(var13, (SubLObject)$ic7$);
            if (!var14.isStream()) {
                Errors.error((SubLObject)$ic8$, var13);
            }
            final SubLObject var15 = var14;
            if (var15.isStream()) {
                SubLObject var16;
                SubLObject var17;
                SubLObject var18;
                SubLObject var19;
                SubLObject var20;
                SubLObject var21;
                SubLObject var22;
                SubLObject var22_23;
                SubLObject var23;
                SubLObject var24;
                SubLObject var25;
                SubLObject var26;
                SubLObject var15_28;
                SubLObject var27;
                SubLObject var28;
                SubLObject var29;
                SubLObject var31;
                SubLObject var30;
                SubLObject var32;
                SubLObject var35_36;
                SubLObject var37_38;
                SubLObject var33;
                SubLObject var34;
                SubLObject var35;
                SubLObject var36;
                SubLObject var37;
                SubLObject var38;
                SubLObject var39;
                SubLObject var40;
                SubLObject var41;
                SubLObject var42;
                for (var16 = (SubLObject)NIL, var16 = module0075.f5200(var15); NIL != var16; var16 = module0075.f5200(var15)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic9$, var16);
                    var17 = module0038.f2752(var16, (SubLObject)$ic10$);
                    var18 = var17.first();
                    var19 = module0038.f2642(conses_high.second(var17));
                    var20 = module0038.f2642(conses_high.third(var17));
                    var21 = module0038.f2642(conses_high.fourth(var17));
                    var22 = Mapping.mapcar((SubLObject)$ic11$, (SubLObject)(conses_high.fifth(var17).equal((SubLObject)$ic12$) ? NIL : conses_high.nthcdr((SubLObject)FOUR_INTEGER, var17)));
                    var22_23 = (SubLObject)NIL;
                    try {
                        var22_23 = compatibility.open_text(var18, (SubLObject)$ic7$);
                        if (!var22_23.isStream()) {
                            Errors.error((SubLObject)$ic8$, var18);
                        }
                        var23 = var22_23;
                        var24 = (SubLObject)MINUS_ONE_INTEGER;
                        var25 = (SubLObject)MINUS_ONE_INTEGER;
                        var26 = (SubLObject)MINUS_ONE_INTEGER;
                        var15_28 = (SubLObject)$ic13$;
                        while (var24.numL(var19)) {
                            var15_28 = module0038.f2835(var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            if (var15_28.equal((SubLObject)$ic14$)) {
                                var24 = Numbers.add((SubLObject)ONE_INTEGER, var24);
                            }
                        }
                        while (var25.numL(var20)) {
                            var15_28 = module0038.f2835(var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            if (var15_28.equal((SubLObject)$ic15$)) {
                                var25 = Numbers.add((SubLObject)ONE_INTEGER, var25);
                            }
                        }
                        while (var26.numL(var21)) {
                            var15_28 = module0038.f2835(var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            if (NIL != module0038.f2684(var15_28, (SubLObject)$ic16$)) {
                                var26 = Numbers.add((SubLObject)ONE_INTEGER, var26);
                            }
                        }
                        var27 = module0038.f2752(var15_28, (SubLObject)$ic10$);
                        var28 = conses_high.second(var27);
                        var29 = conses_high.third(var27);
                        var30 = (var31 = Mapping.mapcar((SubLObject)$ic11$, conses_high.nthcdr((SubLObject)THREE_INTEGER, var27)));
                        var32 = (SubLObject)NIL;
                        var32 = var31.first();
                        while (NIL != var31) {
                            var35_36 = $g5929$.getGlobalValue();
                            var37_38 = (SubLObject)NIL;
                            try {
                                var37_38 = Locks.seize_lock(var35_36);
                                var33 = module0093.f6621(var32, var10, (SubLObject)ConsesLow.list((SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER));
                                var34 = var33.first();
                                var35 = conses_high.second(var33);
                                var36 = Numbers.add((SubLObject)ONE_INTEGER, var35);
                                if (NIL != module0004.f104(var32, var22, (SubLObject)EQUAL, (SubLObject)UNPROVIDED)) {
                                    module0093.f6618(var32, var10, (SubLObject)ConsesLow.list(Numbers.add((SubLObject)ONE_INTEGER, var34), var36));
                                }
                                else {
                                    module0093.f6618(var32, var10, (SubLObject)ConsesLow.list(var34, var36));
                                }
                                var37 = (SubLObject)ConsesLow.list(var28, var32);
                                var38 = module0093.f6621(var37, var10, (SubLObject)ConsesLow.list((SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER));
                                var39 = var38.first();
                                var40 = conses_high.second(var38);
                                var41 = Numbers.add((SubLObject)ONE_INTEGER, var40);
                                if (NIL != module0004.f104(var32, var22, (SubLObject)EQUAL, (SubLObject)UNPROVIDED)) {
                                    module0093.f6618(var37, var10, (SubLObject)ConsesLow.list(Numbers.add((SubLObject)ONE_INTEGER, var39), var41));
                                }
                                else {
                                    module0093.f6618(var37, var10, (SubLObject)ConsesLow.list(var39, var41));
                                }
                            }
                            finally {
                                if (NIL != var37_38) {
                                    Locks.release_lock(var35_36);
                                }
                            }
                            var31 = var31.rest();
                            var32 = var31.first();
                        }
                    }
                    finally {
                        var42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var9);
                            if (var22_23.isStream()) {
                                streams_high.close(var22_23, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var42, var9);
                        }
                    }
                }
            }
        }
        finally {
            final SubLObject var43 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var9);
                if (var14.isStream()) {
                    streams_high.close(var14, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var43, var9);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f46203(final SubLObject var45) {
        if (NIL == f46200((SubLObject)NIL)) {
            return (SubLObject)NIL;
        }
        SubLObject var46 = (SubLObject)NIL;
        final SubLObject var47 = $g5929$.getGlobalValue();
        SubLObject var48 = (SubLObject)NIL;
        try {
            var48 = Locks.seize_lock(var47);
            final SubLObject var49 = module0093.f6621(var45, $g5927$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER));
            final SubLObject var50 = var49.first();
            final SubLObject var51 = conses_high.second(var49);
            if (var51.numG((SubLObject)ZERO_INTEGER)) {
                var46 = Numbers.divide(var50, var51);
            }
        }
        finally {
            if (NIL != var48) {
                Locks.release_lock(var47);
            }
        }
        return var46;
    }
    
    public static SubLObject f46204(final SubLObject var45, final SubLObject var30) {
        if (NIL == f46200((SubLObject)NIL)) {
            return (SubLObject)NIL;
        }
        SubLObject var46 = (SubLObject)NIL;
        final SubLObject var47 = $g5929$.getGlobalValue();
        SubLObject var48 = (SubLObject)NIL;
        try {
            var48 = Locks.seize_lock(var47);
            final SubLObject var49 = module0093.f6621((SubLObject)ConsesLow.list(var30, var45), $g5927$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER));
            final SubLObject var50 = var49.first();
            final SubLObject var51 = conses_high.second(var49);
            if (var51.numG((SubLObject)ZERO_INTEGER)) {
                var46 = Numbers.divide(var50, var51);
            }
        }
        finally {
            if (NIL != var48) {
                Locks.release_lock(var47);
            }
        }
        return var46;
    }
    
    public static SubLObject f46205(final SubLObject var20) {
        SubLObject var21 = module0743.f46037(var20);
        SubLObject var22 = (SubLObject)NIL;
        var22 = var21.first();
        while (NIL != var21) {
            final SubLObject var23 = module0727.f44407(var22);
            final SubLObject var24 = f46203(var23);
            if (NIL != var24) {
                var22 = conses_high.putf(var22, (SubLObject)$ic17$, var24);
            }
            var21 = var21.rest();
            var22 = var21.first();
        }
        return var20;
    }
    
    public static SubLObject f46206(final SubLObject var57) {
        SubLObject var58 = module0743.f46115(var57);
        SubLObject var59 = (SubLObject)NIL;
        var59 = var58.first();
        while (NIL != var58) {
            f46205(var59);
            var58 = var58.rest();
            var59 = var58.first();
        }
        return var57;
    }
    
    public static SubLObject f46207(final SubLObject var19) {
        final SubLObject var20 = module0743.f46139(var19);
        final SubLObject var21 = (SubLObject)NIL;
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        SubLObject var25;
        SubLObject var26;
        SubLObject var27;
        for (var22 = Sequences.length(var20), var23 = (SubLObject)NIL, var23 = (SubLObject)ZERO_INTEGER; var23.numL(var22); var23 = Numbers.add(var23, (SubLObject)ONE_INTEGER)) {
            var24 = ((NIL != var21) ? Numbers.subtract(var22, var23, (SubLObject)ONE_INTEGER) : var23);
            var25 = Vectors.aref(var20, var24);
            var26 = module0743.f46115(var25);
            var27 = (SubLObject)NIL;
            var27 = var26.first();
            while (NIL != var26) {
                f46205(var27);
                var26 = var26.rest();
                var27 = var26.first();
            }
        }
        return var19;
    }
    
    public static SubLObject f46208(final SubLObject var18) {
        final SubLObject var19 = module0743.f46161(var18);
        final SubLObject var20 = (SubLObject)NIL;
        SubLObject var21;
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        SubLObject var58_65;
        SubLObject var59_66;
        SubLObject var60_67;
        SubLObject var61_68;
        SubLObject var62_69;
        SubLObject var25;
        SubLObject var26;
        SubLObject var27;
        for (var21 = Sequences.length(var19), var22 = (SubLObject)NIL, var22 = (SubLObject)ZERO_INTEGER; var22.numL(var21); var22 = Numbers.add(var22, (SubLObject)ONE_INTEGER)) {
            var23 = ((NIL != var20) ? Numbers.subtract(var21, var22, (SubLObject)ONE_INTEGER) : var22);
            var24 = Vectors.aref(var19, var23);
            var58_65 = module0743.f46139(var24);
            var59_66 = (SubLObject)NIL;
            for (var60_67 = Sequences.length(var58_65), var61_68 = (SubLObject)NIL, var61_68 = (SubLObject)ZERO_INTEGER; var61_68.numL(var60_67); var61_68 = Numbers.add(var61_68, (SubLObject)ONE_INTEGER)) {
                var62_69 = ((NIL != var59_66) ? Numbers.subtract(var60_67, var61_68, (SubLObject)ONE_INTEGER) : var61_68);
                var25 = Vectors.aref(var58_65, var62_69);
                var26 = module0743.f46115(var25);
                var27 = (SubLObject)NIL;
                var27 = var26.first();
                while (NIL != var26) {
                    f46205(var27);
                    var26 = var26.rest();
                    var27 = var26.first();
                }
            }
        }
        return var18;
    }
    
    public static SubLObject f46209(final SubLObject var71) {
        assert NIL != Types.stringp(var71) : var71;
        final SubLObject var72 = module0024.f1251((SubLObject)$ic19$, (SubLObject)UNPROVIDED);
        return module0045.f3150(var72, (SubLObject)$ic20$, var71, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f46210(final SubLObject var73, final SubLObject var74, SubLObject var75) {
        if (var75 == UNPROVIDED) {
            var75 = (SubLObject)NIL;
        }
        final SubLThread var76 = SubLProcess.currentSubLThread();
        if (NIL != var75 && !areAssertionsDisabledFor(me) && NIL == Types.hash_table_p(var75)) {
            throw new AssertionError(var75);
        }
        if (NIL == Filesys.probe_file(var73)) {
            Errors.error((SubLObject)$ic22$, var73);
        }
        SubLObject var77 = (SubLObject)NIL;
        try {
            var77 = compatibility.open_text(var73, (SubLObject)$ic7$);
            if (!var77.isStream()) {
                Errors.error((SubLObject)$ic8$, var73);
            }
            final SubLObject var78 = var77;
            SubLObject var78_79 = (SubLObject)NIL;
            try {
                var78_79 = compatibility.open_text(var74, (SubLObject)$ic23$);
                if (!var78_79.isStream()) {
                    Errors.error((SubLObject)$ic8$, var74);
                }
                final SubLObject var79 = var78_79;
                SubLObject var81_82 = (SubLObject)NIL;
                try {
                    var81_82 = compatibility.open_text(var78, (SubLObject)$ic7$);
                    if (!var81_82.isStream()) {
                        Errors.error((SubLObject)$ic8$, var78);
                    }
                    final SubLObject var80 = var81_82;
                    if (var80.isStream()) {
                        SubLObject var81;
                        SubLObject var82;
                        SubLObject var83;
                        SubLObject var84;
                        SubLObject var85;
                        SubLObject var86;
                        SubLObject var87;
                        SubLObject var88;
                        SubLObject var33_85;
                        SubLObject var89;
                        for (var81 = (SubLObject)NIL, var81 = module0075.f5200(var80); NIL != var81; var81 = module0075.f5200(var80)) {
                            var82 = module0038.f2752(var81, (SubLObject)$ic10$);
                            if (var81.equal((SubLObject)$ic14$)) {
                                PrintLow.format(var79, (SubLObject)$ic24$);
                            }
                            else if (var81.equal((SubLObject)$ic15$)) {
                                PrintLow.format(var79, (SubLObject)$ic25$);
                            }
                            else if (var81.equal((SubLObject)$ic26$)) {
                                PrintLow.format(var79, (SubLObject)$ic27$);
                            }
                            else if (var82.first().equal((SubLObject)$ic16$)) {
                                PrintLow.format(var79, (SubLObject)$ic28$, new SubLObject[] { Characters.CHAR_tab, conses_high.second(var82), Characters.CHAR_tab, conses_high.third(var82) });
                                var83 = conses_high.nthcdr((SubLObject)THREE_INTEGER, var82);
                                var84 = (SubLObject)NIL;
                                var84 = var83.first();
                                while (NIL != var83) {
                                    var85 = (SubLObject)NIL;
                                    try {
                                        var76.throwStack.push(module0003.$g3$.getGlobalValue());
                                        var86 = Errors.$error_handler$.currentBinding(var76);
                                        try {
                                            Errors.$error_handler$.bind((SubLObject)$ic29$, var76);
                                            try {
                                                var87 = reader.read_from_string(f46209(var84), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                var88 = ((NIL != module0269.f17705(var87)) ? module0256.f16531(var87, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : module0259.f16840(var87, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                                                PrintLow.format(var79, (SubLObject)$ic30$, (SubLObject)Characters.CHAR_tab, module0205.f13144(var87));
                                                var33_85 = var88;
                                                var89 = (SubLObject)NIL;
                                                var89 = var33_85.first();
                                                while (NIL != var33_85) {
                                                    PrintLow.format(var79, (SubLObject)$ic31$, (SubLObject)Characters.CHAR_tab, module0205.f13144(var89));
                                                    var33_85 = var33_85.rest();
                                                    var89 = var33_85.first();
                                                }
                                            }
                                            catch (Throwable var90) {
                                                Errors.handleThrowable(var90, (SubLObject)NIL);
                                            }
                                        }
                                        finally {
                                            Errors.$error_handler$.rebind(var86, var76);
                                        }
                                    }
                                    catch (Throwable var91) {
                                        var85 = Errors.handleThrowable(var91, module0003.$g3$.getGlobalValue());
                                    }
                                    finally {
                                        var76.throwStack.pop();
                                    }
                                    if (NIL != var85) {
                                        if (NIL != var75) {
                                            Hashtables.sethash(var84, var75, (SubLObject)T);
                                        }
                                        else {
                                            Errors.warn((SubLObject)$ic32$, var85, var84);
                                        }
                                    }
                                    var83 = var83.rest();
                                    var84 = var83.first();
                                }
                                PrintLow.format(var79, (SubLObject)$ic33$);
                            }
                            else {
                                Errors.error((SubLObject)$ic34$, var81);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject var92 = Threads.$is_thread_performing_cleanupP$.currentBinding(var76);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var76);
                        if (var81_82.isStream()) {
                            streams_high.close(var81_82, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var92, var76);
                    }
                }
            }
            finally {
                final SubLObject var93 = Threads.$is_thread_performing_cleanupP$.currentBinding(var76);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var76);
                    if (var78_79.isStream()) {
                        streams_high.close(var78_79, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var93, var76);
                }
            }
        }
        finally {
            final SubLObject var94 = Threads.$is_thread_performing_cleanupP$.currentBinding(var76);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var76);
                if (var77.isStream()) {
                    streams_high.close(var77, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var94, var76);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f46211(final SubLObject var89, final SubLObject var90, SubLObject var75) {
        if (var75 == UNPROVIDED) {
            var75 = (SubLObject)NIL;
        }
        SubLObject var91 = Filesys.directory(var89, (SubLObject)UNPROVIDED);
        SubLObject var92 = (SubLObject)NIL;
        var92 = var91.first();
        while (NIL != var91) {
            final SubLObject var93 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic35$, var89, var92);
            final SubLObject var94 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic35$, var90, var92);
            PrintLow.format((SubLObject)T, (SubLObject)$ic36$, var93);
            f46210(var93, var94, var75);
            var91 = var91.rest();
            var92 = var91.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f46212() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0744", "f46200", "S#50499", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0744", "f46201", "S#50500", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0744", "f46202", "S#50501", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0744", "f46203", "S#50502", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0744", "f46204", "S#50503", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0744", "f46205", "S#50504", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0744", "f46206", "S#50505", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0744", "f46207", "S#50506", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0744", "f46208", "S#50507", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0744", "f46209", "S#50508", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0744", "f46210", "S#50509", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0744", "f46211", "S#50510", 2, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f46213() {
        $g5927$ = SubLFiles.deflexical("S#50511", (SubLObject)NIL);
        $g5928$ = SubLFiles.deflexical("S#50512", (SubLObject)NIL);
        $g5929$ = SubLFiles.deflexical("S#50513", (NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g5929$.getGlobalValue() : Locks.make_lock((SubLObject)$ic1$));
        $g5930$ = SubLFiles.defparameter("S#50514", (SubLObject)$ic2$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f46214() {
        module0003.f57((SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f46212();
    }
    
    public void initializeVariables() {
        f46213();
    }
    
    public void runTopLevelForms() {
        f46214();
    }
    
    static {
        me = (SubLFile)new module0744();
        $g5927$ = null;
        $g5928$ = null;
        $g5929$ = null;
        $g5930$ = null;
        $ic0$ = makeSymbol("S#50513", "CYC");
        $ic1$ = makeString("Disambiguation Term Counts Lock");
        $ic2$ = makeString("data/sense-disambiguation/disambiguation-term-counts.fht");
        $ic3$ = makeKeyword("IMAGE-INDEPENDENT-CFASL");
        $ic4$ = makeInteger(3000);
        $ic5$ = makeString("Unable to create disambiguation hash table (~A).");
        $ic6$ = makeString("Disambiguation training data file (~A) does not exist.");
        $ic7$ = makeKeyword("INPUT");
        $ic8$ = makeString("Unable to open ~S");
        $ic9$ = makeString("processing line ~S~%");
        $ic10$ = ConsesLow.list((SubLObject)Characters.CHAR_tab);
        $ic11$ = makeSymbol("S#37423", "CYC");
        $ic12$ = makeString(":NONE");
        $ic13$ = makeString("");
        $ic14$ = makeString("d");
        $ic15$ = makeString("p");
        $ic16$ = makeString("w");
        $ic17$ = makeKeyword("WEIGHT");
        $ic18$ = makeSymbol("STRINGP");
        $ic19$ = makeString(" ([^#()?]*[^#() ])( *[#()])");
        $ic20$ = makeString(" \"\\1\"\\2");
        $ic21$ = makeSymbol("HASH-TABLE-P");
        $ic22$ = makeString("Labelled file ~A does not exist.");
        $ic23$ = makeKeyword("OUTPUT");
        $ic24$ = makeString("d~%");
        $ic25$ = makeString("p~%");
        $ic26$ = makeString("s");
        $ic27$ = makeString("s~%");
        $ic28$ = makeString("w~A~A~A~A");
        $ic29$ = makeSymbol("S#38", "CYC");
        $ic30$ = makeString("~A~S");
        $ic31$ = makeString("~A^~S");
        $ic32$ = makeString("~A in term ~S");
        $ic33$ = makeString("~%");
        $ic34$ = makeString("Unable to understand line: ~S");
        $ic35$ = makeString("~A/~A");
        $ic36$ = makeString("Processing ~A~%");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 377 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/