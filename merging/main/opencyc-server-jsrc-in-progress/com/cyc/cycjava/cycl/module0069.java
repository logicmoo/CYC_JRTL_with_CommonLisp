package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0069 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0069";
    public static final String myFingerPrint = "537150a5289dc3bb3d432289f183176b22b94bb567e3196310716b63260f2e89";
    private static SubLSymbol $g1101$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    
    public static SubLObject f4937(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var2) : var2;
        SubLObject var4 = (SubLObject)NIL;
        try {
            final SubLObject var5 = stream_macros.$stream_requires_locking$.currentBinding(var3);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var3);
                var4 = compatibility.open_binary(var2, (SubLObject)$ic1$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var5, var3);
            }
            if (!var4.isStream()) {
                Errors.error((SubLObject)$ic2$, var2);
            }
            final SubLObject var6_7 = var4;
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && !var6_7.isStream()) {
                Errors.error((SubLObject)$ic3$, var2);
            }
            module0021.f1038(var1, var6_7);
        }
        finally {
            final SubLObject var6 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                if (var4.isStream()) {
                    streams_high.close(var4, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var6, var3);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f4938(final SubLObject var8, final SubLObject var2) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var2) : var2;
        SubLObject var10 = (SubLObject)NIL;
        try {
            final SubLObject var11 = stream_macros.$stream_requires_locking$.currentBinding(var9);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var9);
                var10 = compatibility.open_binary(var2, (SubLObject)$ic1$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var11, var9);
            }
            if (!var10.isStream()) {
                Errors.error((SubLObject)$ic2$, var2);
            }
            final SubLObject var6_10 = var10;
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var9) && !var6_10.isStream()) {
                Errors.error((SubLObject)$ic3$, var2);
            }
            SubLObject var12 = var8;
            SubLObject var13 = (SubLObject)NIL;
            var13 = var12.first();
            while (NIL != var12) {
                module0021.f1038(var13, var6_10);
                var12 = var12.rest();
                var13 = var12.first();
            }
        }
        finally {
            final SubLObject var14 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var9);
                if (var10.isStream()) {
                    streams_high.close(var10, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var14, var9);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f4939(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var2) : var2;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        try {
            final SubLObject var6 = stream_macros.$stream_requires_locking$.currentBinding(var3);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var3);
                var5 = compatibility.open_binary(var2, (SubLObject)$ic4$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var6, var3);
            }
            if (!var5.isStream()) {
                Errors.error((SubLObject)$ic2$, var2);
            }
            final SubLObject var6_13 = var5;
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && !var6_13.isStream()) {
                Errors.error((SubLObject)$ic3$, var2);
            }
            var4 = module0021.f1060(var6_13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            final SubLObject var7 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                if (var5.isStream()) {
                    streams_high.close(var5, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var7, var3);
            }
        }
        return var4;
    }
    
    public static SubLObject f4940(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var2) : var2;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        try {
            final SubLObject var7 = stream_macros.$stream_requires_locking$.currentBinding(var3);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var3);
                var6 = compatibility.open_binary(var2, (SubLObject)$ic4$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var7, var3);
            }
            if (!var6.isStream()) {
                Errors.error((SubLObject)$ic2$, var2);
            }
            final SubLObject var6_16 = var6;
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && !var6_16.isStream()) {
                Errors.error((SubLObject)$ic3$, var2);
            }
            while (NIL == var5) {
                final SubLObject var8 = module0021.f1060(var6_16, (SubLObject)NIL, (SubLObject)$ic5$);
                if (var8 == $ic5$) {
                    var5 = (SubLObject)T;
                }
                else {
                    var4 = (SubLObject)ConsesLow.cons(var8, var4);
                }
            }
        }
        finally {
            final SubLObject var9 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                if (var6.isStream()) {
                    streams_high.close(var6, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var9, var3);
            }
        }
        return var4;
    }
    
    public static SubLObject f4941(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var2) : var2;
        SubLObject var4 = (SubLObject)NIL;
        try {
            final SubLObject var5 = stream_macros.$stream_requires_locking$.currentBinding(var3);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var3);
                var4 = compatibility.open_binary(var2, (SubLObject)$ic1$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var5, var3);
            }
            if (!var4.isStream()) {
                Errors.error((SubLObject)$ic2$, var2);
            }
            final SubLObject var6_18 = var4;
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && !var6_18.isStream()) {
                Errors.error((SubLObject)$ic3$, var2);
            }
            module0021.f1040(var1, var6_18);
        }
        finally {
            final SubLObject var6 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                if (var4.isStream()) {
                    streams_high.close(var4, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var6, var3);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f4942(final SubLObject var1, final SubLObject var2, final SubLObject var19) {
        if (NIL != var19) {
            return f4941(var1, var2);
        }
        return f4937(var1, var2);
    }
    
    public static SubLObject f4943(final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        final SubLObject var22 = module0021.f1053(var20);
        try {
            SubLObject var23;
            for (var23 = (SubLObject)NIL, var23 = module0021.f1060(var22, (SubLObject)NIL, (SubLObject)$ic5$); var23 != $ic5$; var23 = module0021.f1060(var22, (SubLObject)NIL, (SubLObject)$ic5$)) {
                var21 = (SubLObject)ConsesLow.cons(var23, var21);
            }
        }
        finally {
            final SubLObject var24 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                module0021.f1057(var22);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var24);
            }
        }
        return var21;
    }
    
    public static SubLObject f4944(final SubLObject var1, final SubLObject var6, SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = $g1101$.getGlobalValue();
        }
        return f4945(var1, var6, (SubLObject)NIL, var23);
    }
    
    public static SubLObject f4946(final SubLObject var1, final SubLObject var6, SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = $g1101$.getGlobalValue();
        }
        return f4945(var1, var6, (SubLObject)T, var23);
    }
    
    public static SubLObject f4947(final SubLObject var1, final SubLObject var6, final SubLObject var19, SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = $g1101$.getGlobalValue();
        }
        return f4945(var1, var6, var19, var23);
    }
    
    public static SubLObject f4945(final SubLObject var1, final SubLObject var6, final SubLObject var19, SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        var23 = conses_high.copy_list(var23);
        SubLObject var25 = conses_high.getf(var23, (SubLObject)$ic7$, (SubLObject)UNPROVIDED);
        var25 = (SubLObject)ConsesLow.cons(var1, var25);
        var23 = conses_high.putf(var23, (SubLObject)$ic7$, var25);
        final SubLObject var26 = conses_high.getf(var23, (SubLObject)$ic8$, (SubLObject)UNPROVIDED);
        if ($ic9$ == var26) {
            var23 = conses_high.putf(var23, (SubLObject)$ic8$, var1);
        }
        final SubLObject var27 = module0068.$g1096$.currentBinding(var24);
        final SubLObject var28 = module0068.$g1098$.currentBinding(var24);
        final SubLObject var29 = module0068.$g1097$.currentBinding(var24);
        try {
            module0068.$g1096$.bind(var23, var24);
            module0068.$g1098$.bind(module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var24);
            module0068.$g1097$.bind(module0068.f4920(var6), var24);
            module0068.f4921(var6);
            module0021.f1081(var1, var6, var19);
            module0068.f4924(var6);
        }
        finally {
            module0068.$g1097$.rebind(var29, var24);
            module0068.$g1098$.rebind(var28, var24);
            module0068.$g1096$.rebind(var27, var24);
        }
        return var1;
    }
    
    public static SubLObject f4948(final SubLObject var1, final SubLObject var2, SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = $g1101$.getGlobalValue();
        }
        return f4949(var1, var2, (SubLObject)NIL, var23);
    }
    
    public static SubLObject f4950(final SubLObject var1, final SubLObject var2, SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = $g1101$.getGlobalValue();
        }
        return f4949(var1, var2, (SubLObject)T, var23);
    }
    
    public static SubLObject f4951(final SubLObject var1, final SubLObject var2, final SubLObject var19, SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = $g1101$.getGlobalValue();
        }
        return f4949(var1, var2, var19, var23);
    }
    
    public static SubLObject f4949(final SubLObject var1, final SubLObject var2, final SubLObject var19, SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = $g1101$.getGlobalValue();
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = (SubLObject)NIL;
        try {
            final SubLObject var27 = stream_macros.$stream_requires_locking$.currentBinding(var24);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var24);
                var26 = compatibility.open_binary(var2, (SubLObject)$ic1$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var27, var24);
            }
            if (!var26.isStream()) {
                Errors.error((SubLObject)$ic2$, var2);
            }
            final SubLObject var6_30 = var26;
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var24) && !var6_30.isStream()) {
                Errors.error((SubLObject)$ic3$, var2);
            }
            var25 = f4945(var1, var6_30, var19, var23);
        }
        finally {
            final SubLObject var28 = Threads.$is_thread_performing_cleanupP$.currentBinding(var24);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var24);
                if (var26.isStream()) {
                    streams_high.close(var26, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var28, var24);
            }
        }
        return var25;
    }
    
    public static SubLObject f4952(final SubLObject var8, final SubLObject var2, SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = $g1101$.getGlobalValue();
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var2) : var2;
        SubLObject var25 = (SubLObject)NIL;
        try {
            final SubLObject var26 = stream_macros.$stream_requires_locking$.currentBinding(var24);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var24);
                var25 = compatibility.open_binary(var2, (SubLObject)$ic1$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var26, var24);
            }
            if (!var25.isStream()) {
                Errors.error((SubLObject)$ic2$, var2);
            }
            final SubLObject var6_32 = var25;
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var24) && !var6_32.isStream()) {
                Errors.error((SubLObject)$ic3$, var2);
            }
            final SubLObject var27 = module0068.$g1096$.currentBinding(var24);
            final SubLObject var28 = module0068.$g1098$.currentBinding(var24);
            final SubLObject var29 = module0068.$g1097$.currentBinding(var24);
            try {
                module0068.$g1096$.bind(var23, var24);
                module0068.$g1098$.bind(module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var24);
                module0068.$g1097$.bind(module0068.f4920(var6_32), var24);
                module0068.f4921(var6_32);
                SubLObject var30 = var8;
                SubLObject var31 = (SubLObject)NIL;
                var31 = var30.first();
                while (NIL != var30) {
                    module0021.f1038(var31, var6_32);
                    var30 = var30.rest();
                    var31 = var30.first();
                }
                module0068.f4924(var6_32);
            }
            finally {
                module0068.$g1097$.rebind(var29, var24);
                module0068.$g1098$.rebind(var28, var24);
                module0068.$g1096$.rebind(var27, var24);
            }
        }
        finally {
            final SubLObject var32 = Threads.$is_thread_performing_cleanupP$.currentBinding(var24);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var24);
                if (var25.isStream()) {
                    streams_high.close(var25, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var32, var24);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f4953(final SubLObject var2, final SubLObject var33, SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = $g1101$.getGlobalValue();
        }
        final SubLObject var34 = f4940(var2);
        f4952(var34, var33, var23);
        return var33;
    }
    
    public static SubLObject f4954(final SubLObject var34, final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var34) : var34;
        assert NIL != Types.stringp(var35) : var35;
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var38 = (SubLObject)NIL;
        try {
            final SubLObject var39 = stream_macros.$stream_requires_locking$.currentBinding(var36);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var36);
                var38 = compatibility.open_text(var34, (SubLObject)$ic4$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var39, var36);
            }
            if (!var38.isStream()) {
                Errors.error((SubLObject)$ic2$, var34);
            }
            final SubLObject var40 = var38;
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var36) && !var40.isStream()) {
                Errors.error((SubLObject)$ic3$, var34);
            }
            SubLObject var39_40 = (SubLObject)NIL;
            try {
                final SubLObject var41 = stream_macros.$stream_requires_locking$.currentBinding(var36);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var36);
                    var39_40 = compatibility.open_binary(var35, (SubLObject)$ic1$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var41, var36);
                }
                if (!var39_40.isStream()) {
                    Errors.error((SubLObject)$ic2$, var35);
                }
                final SubLObject var42 = var39_40;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var36) && !var42.isStream()) {
                    Errors.error((SubLObject)$ic3$, var35);
                }
                SubLObject var43;
                for (var43 = (SubLObject)NIL, var43 = reader.read(var40, (SubLObject)NIL, (SubLObject)$ic5$, (SubLObject)UNPROVIDED); $ic5$ != var43; var43 = reader.read(var40, (SubLObject)NIL, (SubLObject)$ic5$, (SubLObject)UNPROVIDED)) {
                    module0021.f1038(var43, var42);
                }
                var37 = (SubLObject)T;
            }
            finally {
                final SubLObject var44 = Threads.$is_thread_performing_cleanupP$.currentBinding(var36);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var36);
                    if (var39_40.isStream()) {
                        streams_high.close(var39_40, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var44, var36);
                }
            }
        }
        finally {
            final SubLObject var45 = Threads.$is_thread_performing_cleanupP$.currentBinding(var36);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var36);
                if (var38.isStream()) {
                    streams_high.close(var38, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var45, var36);
            }
        }
        return var37;
    }
    
    public static SubLObject f4955(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var2) : var2;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        try {
            final SubLObject var6 = stream_macros.$stream_requires_locking$.currentBinding(var3);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var3);
                var5 = compatibility.open_binary(var2, (SubLObject)$ic4$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var6, var3);
            }
            if (!var5.isStream()) {
                Errors.error((SubLObject)$ic2$, var2);
            }
            final SubLObject var6_44 = var5;
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && !var6_44.isStream()) {
                Errors.error((SubLObject)$ic3$, var2);
            }
            SubLObject var7;
            for (var7 = (SubLObject)NIL, var7 = module0021.f1060(var6_44, (SubLObject)NIL, (SubLObject)$ic5$); $ic5$ != var7; var7 = module0021.f1060(var6_44, (SubLObject)NIL, (SubLObject)$ic5$)) {
                Eval.eval(var7);
            }
            var4 = (SubLObject)T;
        }
        finally {
            final SubLObject var8 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                if (var5.isStream()) {
                    streams_high.close(var5, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var8, var3);
            }
        }
        return var4;
    }
    
    public static SubLObject f4956(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = module0021.f1031();
        try {
            module0021.f1038(var1, var4);
            var2 = module0021.f1033(var4);
        }
        finally {
            final SubLObject var5 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                module0021.f1034(var4);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var5);
            }
        }
        var4 = module0021.f1055(var2);
        try {
            var3 = module0021.f1060(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            final SubLObject var6 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                module0021.f1057(var4);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var6);
            }
        }
        return var3;
    }
    
    public static SubLObject f4957(final SubLObject var48) {
        final SubLObject var49 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var50 = module0021.f1053(var48);
        try {
            SubLObject var51 = (SubLObject)NIL;
            SubLObject var52 = (SubLObject)NIL;
            var51 = module0021.f1062(var50);
            for (var52 = module0021.f1060(var50, (SubLObject)NIL, (SubLObject)$ic5$); var52 != $ic5$; var52 = module0021.f1060(var50, (SubLObject)NIL, (SubLObject)$ic5$)) {
                module0079.f5412(var49, var51, var52);
                var51 = module0021.f1062(var50);
            }
        }
        finally {
            final SubLObject var53 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                module0021.f1057(var50);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var53);
            }
        }
        return var49;
    }
    
    public static SubLObject f4958(final SubLObject var8, final SubLObject var51) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        SubLObject var53 = (SubLObject)ZERO_INTEGER;
        SubLObject var54 = (SubLObject)NIL;
        SubLObject var55 = (SubLObject)NIL;
        SubLObject var56 = (SubLObject)NIL;
        try {
            var56 = streams_high.make_private_string_output_stream();
            SubLObject var57 = var8;
            SubLObject var58 = (SubLObject)NIL;
            var58 = var57.first();
            while (NIL != var57) {
                SubLObject var59 = (SubLObject)NIL;
                final SubLObject var60 = module0021.f1031();
                try {
                    module0021.f1038(var58, var60);
                    var59 = module0021.f1029(var60);
                }
                finally {
                    final SubLObject var61 = Threads.$is_thread_performing_cleanupP$.currentBinding(var52);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var52);
                        module0021.f1034(var60);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var61, var52);
                    }
                }
                var55 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic18$, var53, (SubLObject)$ic9$, var58), var55);
                streams_high.write_string(var59, var56, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var53 = Numbers.add(var53, Sequences.length(var59));
                var57 = var57.rest();
                var58 = var57.first();
            }
            var54 = streams_high.get_output_stream_string(var56);
        }
        finally {
            final SubLObject var62 = Threads.$is_thread_performing_cleanupP$.currentBinding(var52);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var52);
                streams_high.close(var56, (SubLObject)UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var62, var52);
            }
        }
        var55 = Sequences.nreverse(var55);
        final SubLObject var63 = module0021.f1053(var54);
        try {
            SubLObject var64 = var55;
            SubLObject var65 = (SubLObject)NIL;
            var65 = var64.first();
            while (NIL != var64) {
                final SubLObject var67;
                final SubLObject var66 = var67 = var65;
                SubLObject var68 = (SubLObject)NIL;
                SubLObject var69 = var67;
                SubLObject var70 = (SubLObject)NIL;
                SubLObject var61_62 = (SubLObject)NIL;
                while (NIL != var69) {
                    cdestructuring_bind.destructuring_bind_must_consp(var69, var66, (SubLObject)$ic19$);
                    var61_62 = var69.first();
                    var69 = var69.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var69, var66, (SubLObject)$ic19$);
                    if (NIL == conses_high.member(var61_62, (SubLObject)$ic20$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var70 = (SubLObject)T;
                    }
                    if (var61_62 == $ic21$) {
                        var68 = var69.first();
                    }
                    var69 = var69.rest();
                }
                if (NIL != var70 && NIL == var68) {
                    cdestructuring_bind.cdestructuring_bind_error(var66, (SubLObject)$ic19$);
                }
                final SubLObject var71 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var67);
                final SubLObject var72 = (SubLObject)((NIL != var71) ? conses_high.cadr(var71) : NIL);
                final SubLObject var73 = cdestructuring_bind.property_list_member((SubLObject)$ic9$, var67);
                final SubLObject var74 = (SubLObject)((NIL != var73) ? conses_high.cadr(var73) : NIL);
                final SubLObject var75 = module0021.f1062(var63);
                final SubLObject var76 = module0021.f1060(var63, (SubLObject)NIL, (SubLObject)$ic5$);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var52) && NIL == Functions.funcall(var51, var74, var76)) {
                    Errors.error((SubLObject)$ic22$, var74, var76);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var52) && !var75.numE(var72)) {
                    Errors.error((SubLObject)$ic23$, var72, var75);
                }
                var64 = var64.rest();
                var65 = var64.first();
            }
            final SubLObject var77 = Sequences.length(var54);
            final SubLObject var78 = module0021.f1062(var63);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var52) && !var77.numE(var78)) {
                Errors.error((SubLObject)$ic24$, var77, var78);
            }
        }
        finally {
            final SubLObject var79 = Threads.$is_thread_performing_cleanupP$.currentBinding(var52);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var52);
                module0021.f1057(var63);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var79, var52);
            }
        }
        return (SubLObject)$ic25$;
    }
    
    public static SubLObject f4959() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0069", "f4937", "S#6514", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0069", "f4938", "S#6515", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0069", "f4939", "CFASL-LOAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0069", "f4940", "S#6516", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0069", "f4941", "S#6517", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0069", "f4942", "S#6518", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0069", "f4943", "S#6519", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0069", "f4944", "S#6520", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0069", "f4946", "S#6521", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0069", "f4947", "S#6522", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0069", "f4945", "S#6523", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0069", "f4948", "S#6524", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0069", "f4950", "S#6525", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0069", "f4951", "S#6526", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0069", "f4949", "S#6527", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0069", "f4952", "S#6528", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0069", "f4953", "S#6529", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0069", "f4954", "S#6530", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0069", "f4955", "S#6531", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0069", "f4956", "S#6284", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0069", "f4957", "S#6532", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0069", "f4958", "S#6533", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4960() {
        $g1101$ = SubLFiles.deflexical("S#6534", (SubLObject)$ic6$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4961() {
        module0027.f1449((SubLObject)$ic10$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic11$, NIL, $ic12$, NIL, $ic13$, NIL, $ic14$, $ic15$, $ic16$, T }), (SubLObject)$ic17$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f4959();
    }
    
    public void initializeVariables() {
        f4960();
    }
    
    public void runTopLevelForms() {
        f4961();
    }
    
    static {
        me = (SubLFile)new module0069();
        $g1101$ = null;
        $ic0$ = makeSymbol("STRINGP");
        $ic1$ = makeKeyword("OUTPUT");
        $ic2$ = makeString("Unable to open ~S");
        $ic3$ = makeString("Cannot open ~A");
        $ic4$ = makeKeyword("INPUT");
        $ic5$ = makeKeyword("EOF");
        $ic6$ = ConsesLow.list((SubLObject)makeKeyword("ANALYZE"), (SubLObject)makeKeyword("OBJECT"));
        $ic7$ = makeKeyword("NOT");
        $ic8$ = makeKeyword("ANALYZE");
        $ic9$ = makeKeyword("OBJECT");
        $ic10$ = makeSymbol("S#6533", "CYC");
        $ic11$ = makeKeyword("TEST");
        $ic12$ = makeKeyword("OWNER");
        $ic13$ = makeKeyword("CLASSES");
        $ic14$ = makeKeyword("KB");
        $ic15$ = makeKeyword("TINY");
        $ic16$ = makeKeyword("WORKING?");
        $ic17$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("abc"), (SubLObject)makeInteger(123), (SubLObject)ConsesLow.list((SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)THREE_INTEGER)), (SubLObject)EQUAL), (SubLObject)makeKeyword("SUCCESS")));
        $ic18$ = makeKeyword("POSITION");
        $ic19$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("POSITION"), (SubLObject)makeSymbol("OBJECT", "CYC"));
        $ic20$ = ConsesLow.list((SubLObject)makeKeyword("POSITION"), (SubLObject)makeKeyword("OBJECT"));
        $ic21$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic22$ = makeString("Expected ~A, got back ~A.");
        $ic23$ = makeString("Expected stream position ~A, got back ~A.");
        $ic24$ = makeString("Expected to have read ~A hex-chars from stream, got ~A.");
        $ic25$ = makeKeyword("SUCCESS");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 270 ms
	
	Decompiled with Procyon 0.5.32.
*/