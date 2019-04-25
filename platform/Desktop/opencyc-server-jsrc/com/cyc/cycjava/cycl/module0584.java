package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0584 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0584";
    public static final String myFingerPrint = "f38e16426b5e5806b2bfba95267ff13b1c057577e56076a0a151dce80cf7cb5c";
    public static SubLSymbol $g4384$;
    public static SubLSymbol $g4385$;
    public static SubLSymbol $g4386$;
    public static SubLSymbol $g4387$;
    public static SubLSymbol $g4388$;
    public static SubLSymbol $g4389$;
    public static SubLSymbol $g4390$;
    private static SubLSymbol $g4391$;
    public static SubLSymbol $g4392$;
    public static SubLSymbol $g4393$;
    public static SubLSymbol $g4394$;
    public static SubLSymbol $g4395$;
    public static SubLSymbol $g4396$;
    public static SubLSymbol $g4397$;
    public static SubLSymbol $g4398$;
    public static SubLSymbol $g4399$;
    public static SubLSymbol $g4400$;
    public static SubLSymbol $g4401$;
    public static SubLSymbol $g4402$;
    public static SubLSymbol $g4403$;
    public static SubLSymbol $g4404$;
    private static SubLSymbol $g4410$;
    private static SubLSymbol $g4405$;
    public static SubLSymbol $g4411$;
    private static SubLSymbol $g4412$;
    private static SubLSymbol $g4413$;
    private static SubLSymbol $g4406$;
    private static SubLSymbol $g4407$;
    private static SubLSymbol $g4414$;
    private static SubLSymbol $g4415$;
    public static SubLSymbol $g4416$;
    public static SubLSymbol $g4417$;
    public static SubLSymbol $g4418$;
    public static SubLSymbol $g4419$;
    public static SubLSymbol $g4420$;
    public static SubLSymbol $g4421$;
    public static SubLSymbol $g4422$;
    public static SubLSymbol $g4423$;
    public static SubLSymbol $g4424$;
    private static SubLSymbol $g4408$;
    private static SubLSymbol $g4409$;
    public static SubLSymbol $g4425$;
    public static SubLSymbol $g4426$;
    public static SubLSymbol $g4427$;
    public static SubLSymbol $g4428$;
    public static SubLSymbol $g4429$;
    private static SubLSymbol $g4430$;
    private static SubLSymbol $g4431$;
    public static SubLSymbol $g4432$;
    public static SubLSymbol $g4433$;
    public static SubLSymbol $g4434$;
    public static SubLSymbol $g4435$;
    public static SubLSymbol $g4436$;
    public static SubLSymbol $g4437$;
    public static SubLSymbol $g4438$;
    public static SubLSymbol $g4439$;
    public static SubLSymbol $g4440$;
    public static SubLSymbol $g4441$;
    public static SubLSymbol $g4442$;
    public static SubLSymbol $g4443$;
    public static SubLSymbol $g4444$;
    public static SubLSymbol $g4445$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLInteger $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLInteger $ic36$;
    private static final SubLList $ic37$;
    private static final SubLList $ic38$;
    private static final SubLList $ic39$;
    private static final SubLList $ic40$;
    private static final SubLList $ic41$;
    private static final SubLList $ic42$;
    private static final SubLList $ic43$;
    private static final SubLList $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLList $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLList $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLObject $ic59$;
    private static final SubLList $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLString $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLSymbol $ic69$;
    
    public static SubLObject f35771(final SubLObject var1) {
        return conses_high.member(var1, module0584.$g4391$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0584.EQ), (SubLObject)module0584.UNPROVIDED);
    }
    
    public static SubLObject f35772() {
        return module0035.sublisp_boolean(f35773());
    }
    
    public static SubLObject f35774() {
        return (SubLObject)module0584.$ic3$;
    }
    
    public static SubLObject f35773() {
        return module0035.remove_if_not((SubLObject)module0584.$ic4$, f35774(), (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED);
    }
    
    public static SubLObject f35775(final SubLObject var2) {
        return module0035.sublisp_boolean(Eval.eval(var2));
    }
    
    public static SubLObject f35776() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return module0147.f9553(module0584.$g4396$.getDynamicValue(var3));
    }
    
    public static SubLObject f35777(final SubLObject var4) {
        if (var4 == module0584.$ic8$) {
            module0584.$g4397$.setDynamicValue((SubLObject)module0584.T);
            module0584.$g4400$.setDynamicValue((SubLObject)module0584.NIL);
            module0584.$g4401$.setDynamicValue((SubLObject)module0584.NIL);
            module0018.$g704$.setDynamicValue((SubLObject)module0584.T);
            module0584.$g4386$.setDynamicValue((SubLObject)module0584.$ic9$);
        }
        return (SubLObject)module0584.NIL;
    }
    
    public static SubLObject f35778() {
        f35779(module0584.$g4405$.getGlobalValue());
        f35779(module0584.$g4406$.getGlobalValue());
        f35779(module0584.$g4407$.getGlobalValue());
        module0584.$g4408$.setGlobalValue(module0107.f7627());
        module0584.$g4409$.setGlobalValue((SubLObject)module0584.NIL);
        f35779(module0584.$g4410$.getGlobalValue());
        return (SubLObject)module0584.NIL;
    }
    
    public static SubLObject f35780(final SubLObject var1) {
        return module0081.f5552(var1);
    }
    
    public static SubLObject f35781(final SubLObject var5) {
        final SubLObject var6 = module0081.f5563(var5);
        SubLObject var7 = (SubLObject)module0584.NIL;
        try {
            var7 = ReadWriteLocks.rw_lock_seize_read_lock(var6);
            return (SubLObject)SubLObjectFactory.makeBoolean(module0079.f5406(var5).eql((SubLObject)module0584.ONE_INTEGER) && module0584.NIL != module0079.f5437(var5, module0107.f7627()));
        }
        finally {
            if (module0584.NIL != var7) {
                ReadWriteLocks.rw_lock_release_read_lock(var6);
            }
        }
    }
    
    public static SubLObject f35779(final SubLObject var5) {
        final SubLObject var6 = module0081.f5563(var5);
        SubLObject var7 = (SubLObject)module0584.NIL;
        try {
            var7 = ReadWriteLocks.rw_lock_seize_write_lock(var6);
            module0079.f5420(var5);
            module0079.f5412(var5, module0107.f7627(), (SubLObject)module0584.T);
        }
        finally {
            if (module0584.NIL != var7) {
                ReadWriteLocks.rw_lock_release_write_lock(var6);
            }
        }
        return var5;
    }
    
    public static SubLObject f35782() {
        return module0081.f5548(module0078.f5369(module0107.f7627(), Symbols.symbol_function((SubLObject)module0584.EQL)));
    }
    
    public static SubLObject f35783(final SubLObject var10, final SubLObject var5) {
        return module0079.f5437(var5, var10);
    }
    
    public static SubLObject f35784(final SubLObject var5) {
        return module0079.f5433(var5);
    }
    
    public static SubLObject f35785() {
        final SubLObject var8 = module0081.f5563(module0584.$g4410$.getGlobalValue());
        SubLObject var9 = (SubLObject)module0584.NIL;
        try {
            var9 = ReadWriteLocks.rw_lock_seize_write_lock(var8);
            module0079.f5420(module0584.$g4410$.getGlobalValue());
            SubLObject var10 = module0259.f16850(module0584.$ic12$);
            SubLObject var11 = (SubLObject)module0584.NIL;
            var11 = var10.first();
            while (module0584.NIL != var10) {
                module0079.f5412(module0584.$g4410$.getGlobalValue(), var11, (SubLObject)module0584.T);
                var10 = var10.rest();
                var11 = var10.first();
            }
        }
        finally {
            if (module0584.NIL != var9) {
                ReadWriteLocks.rw_lock_release_write_lock(var8);
            }
        }
        return module0584.$g4410$.getGlobalValue();
    }
    
    public static SubLObject f35786(final SubLObject var12) {
        final SubLObject var13 = module0081.f5563(module0584.$g4410$.getGlobalValue());
        SubLObject var14 = (SubLObject)module0584.NIL;
        try {
            var14 = ReadWriteLocks.rw_lock_seize_write_lock(var13);
            if (module0584.NIL != f35781(module0584.$g4410$.getGlobalValue())) {
                f35785();
            }
            return f35783(var12, module0584.$g4410$.getGlobalValue());
        }
        finally {
            if (module0584.NIL != var14) {
                ReadWriteLocks.rw_lock_release_write_lock(var13);
            }
        }
    }
    
    public static SubLObject f35787() {
        final SubLObject var8 = module0081.f5563(module0584.$g4405$.getGlobalValue());
        SubLObject var9 = (SubLObject)module0584.NIL;
        try {
            var9 = ReadWriteLocks.rw_lock_seize_write_lock(var8);
            if (module0584.NIL != f35781(module0584.$g4405$.getGlobalValue())) {
                f35788();
            }
            return f35784(module0584.$g4405$.getGlobalValue());
        }
        finally {
            if (module0584.NIL != var9) {
                ReadWriteLocks.rw_lock_release_write_lock(var8);
            }
        }
    }
    
    public static SubLObject f35788() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0081.f5563(module0584.$g4405$.getGlobalValue());
        SubLObject var5 = (SubLObject)module0584.NIL;
        try {
            var5 = ReadWriteLocks.rw_lock_seize_write_lock(var4);
            f35789();
            module0079.f5420(module0584.$g4405$.getGlobalValue());
            final SubLObject var6 = module0147.$g2094$.currentBinding(var3);
            final SubLObject var7 = module0147.$g2095$.currentBinding(var3);
            try {
                module0147.$g2094$.bind((SubLObject)module0584.$ic13$, var3);
                module0147.$g2095$.bind(module0584.$ic14$, var3);
                if (module0584.NIL != constant_handles_oc.f8463(module0584.$ic15$, (SubLObject)module0584.UNPROVIDED)) {
                    SubLObject var8 = module0259.f16848(module0584.$ic15$, (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED);
                    SubLObject var9 = (SubLObject)module0584.NIL;
                    var9 = var8.first();
                    while (module0584.NIL != var8) {
                        if (module0584.NIL == module0533.f33218(var9)) {
                            module0079.f5412(module0584.$g4405$.getGlobalValue(), var9, (SubLObject)module0584.T);
                        }
                        var8 = var8.rest();
                        var9 = var8.first();
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var7, var3);
                module0147.$g2094$.rebind(var6, var3);
            }
        }
        finally {
            if (module0584.NIL != var5) {
                ReadWriteLocks.rw_lock_release_write_lock(var4);
            }
        }
        return module0584.$g4405$.getGlobalValue();
    }
    
    public static SubLObject f35790() {
        final SubLObject var8 = module0081.f5563(module0584.$g4412$.getGlobalValue());
        SubLObject var9 = (SubLObject)module0584.NIL;
        try {
            var9 = ReadWriteLocks.rw_lock_seize_write_lock(var8);
            if (module0584.NIL != f35781(module0584.$g4412$.getGlobalValue())) {
                module0079.f5420(module0584.$g4412$.getGlobalValue());
                SubLObject var10 = (SubLObject)module0584.$ic18$;
                SubLObject var11 = (SubLObject)module0584.NIL;
                var11 = var10.first();
                while (module0584.NIL != var10) {
                    SubLObject var11_16 = module0260.f17034(var11, (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED);
                    SubLObject var12 = (SubLObject)module0584.NIL;
                    var12 = var11_16.first();
                    while (module0584.NIL != var11_16) {
                        module0079.f5412(module0584.$g4412$.getGlobalValue(), var12, (SubLObject)module0584.T);
                        var11_16 = var11_16.rest();
                        var12 = var11_16.first();
                    }
                    var10 = var10.rest();
                    var11 = var10.first();
                }
            }
        }
        finally {
            if (module0584.NIL != var9) {
                ReadWriteLocks.rw_lock_release_write_lock(var8);
            }
        }
        return f35784(module0584.$g4412$.getGlobalValue());
    }
    
    public static SubLObject f35791() {
        final SubLObject var8 = module0081.f5563(module0584.$g4413$.getGlobalValue());
        SubLObject var9 = (SubLObject)module0584.NIL;
        try {
            var9 = ReadWriteLocks.rw_lock_seize_write_lock(var8);
            if (module0584.NIL != f35781(module0584.$g4413$.getGlobalValue())) {
                SubLObject var10 = module0260.f17034(module0584.$ic20$, (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED);
                SubLObject var11 = (SubLObject)module0584.NIL;
                var11 = var10.first();
                while (module0584.NIL != var10) {
                    module0079.f5412(module0584.$g4413$.getGlobalValue(), var11, (SubLObject)module0584.T);
                    var10 = var10.rest();
                    var11 = var10.first();
                }
            }
        }
        finally {
            if (module0584.NIL != var9) {
                ReadWriteLocks.rw_lock_release_write_lock(var8);
            }
        }
        return f35784(module0584.$g4413$.getGlobalValue());
    }
    
    public static SubLObject f35792(SubLObject var17) {
        if (var17 == module0584.UNPROVIDED) {
            var17 = (SubLObject)module0584.NIL;
        }
        return f35784(f35793(var17));
    }
    
    public static SubLObject f35793(SubLObject var17) {
        if (var17 == module0584.UNPROVIDED) {
            var17 = (SubLObject)module0584.NIL;
        }
        final SubLObject var18 = module0081.f5563(module0584.$g4406$.getGlobalValue());
        SubLObject var19 = (SubLObject)module0584.NIL;
        try {
            var19 = ReadWriteLocks.rw_lock_seize_write_lock(var18);
            if (module0584.NIL != f35781(module0584.$g4406$.getGlobalValue()) || module0584.NIL != var17) {
                f35794();
            }
        }
        finally {
            if (module0584.NIL != var19) {
                ReadWriteLocks.rw_lock_release_write_lock(var18);
            }
        }
        return module0584.$g4406$.getGlobalValue();
    }
    
    public static SubLObject f35794() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0081.f5563(module0584.$g4406$.getGlobalValue());
        SubLObject var5 = (SubLObject)module0584.NIL;
        try {
            var5 = ReadWriteLocks.rw_lock_seize_write_lock(var4);
            module0079.f5420(module0584.$g4406$.getGlobalValue());
            final SubLObject var6 = module0147.$g2094$.currentBinding(var3);
            final SubLObject var7 = module0147.$g2095$.currentBinding(var3);
            try {
                module0147.$g2094$.bind((SubLObject)module0584.$ic13$, var3);
                module0147.$g2095$.bind(module0584.$ic14$, var3);
                if (module0584.NIL != constant_handles_oc.f8463(module0584.$ic22$, (SubLObject)module0584.UNPROVIDED)) {
                    SubLObject var8 = module0260.f17033(module0584.$ic22$, (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED);
                    SubLObject var9 = (SubLObject)module0584.NIL;
                    var9 = var8.first();
                    while (module0584.NIL != var8) {
                        module0079.f5412(module0584.$g4406$.getGlobalValue(), var9, (SubLObject)module0584.T);
                        var8 = var8.rest();
                        var9 = var8.first();
                    }
                }
                if (module0584.NIL != constant_handles_oc.f8463(module0584.$ic23$, (SubLObject)module0584.UNPROVIDED)) {
                    SubLObject var8 = module0259.f16848(module0584.$ic23$, (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED);
                    SubLObject var10 = (SubLObject)module0584.NIL;
                    var10 = var8.first();
                    while (module0584.NIL != var8) {
                        module0079.f5412(module0584.$g4406$.getGlobalValue(), var10, (SubLObject)module0584.T);
                        var8 = var8.rest();
                        var10 = var8.first();
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var7, var3);
                module0147.$g2094$.rebind(var6, var3);
            }
        }
        finally {
            if (module0584.NIL != var5) {
                ReadWriteLocks.rw_lock_release_write_lock(var4);
            }
        }
        return module0584.$g4406$.getGlobalValue();
    }
    
    public static SubLObject f35795(final SubLObject var19) {
        final SubLObject var20 = module0081.f5563(module0584.$g4406$.getGlobalValue());
        SubLObject var21 = (SubLObject)module0584.NIL;
        try {
            var21 = ReadWriteLocks.rw_lock_seize_write_lock(var20);
            if (module0584.NIL != f35781(module0584.$g4406$.getGlobalValue())) {
                f35794();
            }
            return f35783(var19, module0584.$g4406$.getGlobalValue());
        }
        finally {
            if (module0584.NIL != var21) {
                ReadWriteLocks.rw_lock_release_write_lock(var20);
            }
        }
    }
    
    public static SubLObject f35796(SubLObject var17) {
        if (var17 == module0584.UNPROVIDED) {
            var17 = (SubLObject)module0584.NIL;
        }
        return f35784(f35797(var17));
    }
    
    public static SubLObject f35797(SubLObject var17) {
        if (var17 == module0584.UNPROVIDED) {
            var17 = (SubLObject)module0584.NIL;
        }
        final SubLObject var18 = module0081.f5563(module0584.$g4407$.getGlobalValue());
        SubLObject var19 = (SubLObject)module0584.NIL;
        try {
            var19 = ReadWriteLocks.rw_lock_seize_write_lock(var18);
            if (module0584.NIL != f35781(module0584.$g4407$.getGlobalValue()) || module0584.NIL != var17) {
                f35798();
            }
        }
        finally {
            if (module0584.NIL != var19) {
                ReadWriteLocks.rw_lock_release_write_lock(var18);
            }
        }
        return module0584.$g4407$.getGlobalValue();
    }
    
    public static SubLObject f35798() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        f35794();
        final SubLObject var4 = module0081.f5563(module0584.$g4407$.getGlobalValue());
        SubLObject var5 = (SubLObject)module0584.NIL;
        try {
            var5 = ReadWriteLocks.rw_lock_seize_write_lock(var4);
            module0079.f5420(module0584.$g4407$.getGlobalValue());
            final SubLObject var6 = module0147.$g2094$.currentBinding(var3);
            final SubLObject var7 = module0147.$g2095$.currentBinding(var3);
            try {
                module0147.$g2094$.bind((SubLObject)module0584.$ic13$, var3);
                module0147.$g2095$.bind(module0584.$ic14$, var3);
                if (module0584.NIL != constant_handles_oc.f8463(module0584.$ic25$, (SubLObject)module0584.UNPROVIDED)) {
                    SubLObject var8 = module0260.f17034(module0584.$ic25$, (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED);
                    SubLObject var9 = (SubLObject)module0584.NIL;
                    var9 = var8.first();
                    while (module0584.NIL != var8) {
                        if (module0584.NIL == f35795(var9)) {
                            module0079.f5412(module0584.$g4407$.getGlobalValue(), var9, (SubLObject)module0584.T);
                        }
                        var8 = var8.rest();
                        var9 = var8.first();
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var7, var3);
                module0147.$g2094$.rebind(var6, var3);
            }
        }
        finally {
            if (module0584.NIL != var5) {
                ReadWriteLocks.rw_lock_release_write_lock(var4);
            }
        }
        return module0584.$g4407$.getGlobalValue();
    }
    
    public static SubLObject f35799(final SubLObject var19) {
        final SubLObject var20 = module0081.f5563(module0584.$g4407$.getGlobalValue());
        SubLObject var21 = (SubLObject)module0584.NIL;
        try {
            var21 = ReadWriteLocks.rw_lock_seize_write_lock(var20);
            if (module0584.NIL != f35781(module0584.$g4407$.getGlobalValue())) {
                f35798();
            }
            return f35783(var19, module0584.$g4407$.getGlobalValue());
        }
        finally {
            if (module0584.NIL != var21) {
                ReadWriteLocks.rw_lock_release_write_lock(var20);
            }
        }
    }
    
    public static SubLObject f35800(final SubLObject var19) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0584.NIL != f35795(var19) || module0584.NIL != f35799(var19));
    }
    
    public static SubLObject f35801(final SubLObject var19) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0584.NIL != f35800(var19) || module0584.NIL != module0731.f44690(var19, (SubLObject)module0584.UNPROVIDED));
    }
    
    public static SubLObject f35802(final SubLObject var10) {
        return f35803(var10, module0584.$ic26$);
    }
    
    public static SubLObject f35804(final SubLObject var10) {
        return f35803(var10, module0584.$ic27$);
    }
    
    public static SubLObject f35805(final SubLObject var10) {
        return f35803(var10, module0584.$ic28$);
    }
    
    public static SubLObject f35789() {
        final SubLObject var20 = module0584.$g4414$.getGlobalValue();
        if (module0584.NIL != var20) {
            module0034.f1818(var20);
        }
        return (SubLObject)module0584.NIL;
    }
    
    public static SubLObject f35806(final SubLObject var10, final SubLObject var21) {
        return module0034.f1829(module0584.$g4414$.getGlobalValue(), (SubLObject)ConsesLow.list(var10, var21), (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED);
    }
    
    public static SubLObject f35807(final SubLObject var10, final SubLObject var21) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0584.NIL != constant_handles_oc.f8463(var10, (SubLObject)module0584.UNPROVIDED) && module0584.NIL != constant_handles_oc.f8463(var21, (SubLObject)module0584.UNPROVIDED) && module0584.NIL != module0259.f16891(var10, var21));
    }
    
    public static SubLObject f35803(final SubLObject var10, final SubLObject var21) {
        SubLObject var22 = module0584.$g4414$.getGlobalValue();
        if (module0584.NIL == var22) {
            var22 = module0034.f1934((SubLObject)module0584.$ic29$, (SubLObject)module0584.$ic30$, (SubLObject)module0584.NIL, (SubLObject)module0584.EQL, (SubLObject)module0584.TWO_INTEGER, (SubLObject)module0584.$ic31$);
        }
        final SubLObject var23 = module0034.f1782(var10, var21);
        final SubLObject var24 = module0034.f1814(var22, var23, (SubLObject)module0584.UNPROVIDED);
        if (var24 != module0584.$ic32$) {
            SubLObject var25 = var24;
            SubLObject var26 = (SubLObject)module0584.NIL;
            var26 = var25.first();
            while (module0584.NIL != var25) {
                SubLObject var27 = var26.first();
                final SubLObject var28 = conses_high.second(var26);
                if (var10.eql(var27.first())) {
                    var27 = var27.rest();
                    if (module0584.NIL != var27 && module0584.NIL == var27.rest() && var21.eql(var27.first())) {
                        return module0034.f1959(var28);
                    }
                }
                var25 = var25.rest();
                var26 = var25.first();
            }
        }
        final SubLObject var29 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f35807(var10, var21)));
        module0034.f1836(var22, var23, var24, var29, (SubLObject)ConsesLow.list(var10, var21));
        return module0034.f1959(var29);
    }
    
    public static SubLObject f35808() {
        final SubLObject var20 = module0584.$g4415$.getGlobalValue();
        if (module0584.NIL != var20) {
            module0034.f1818(var20);
        }
        return (SubLObject)module0584.NIL;
    }
    
    public static SubLObject f35809(SubLObject var29) {
        if (var29 == module0584.UNPROVIDED) {
            var29 = module0584.$g4396$.getDynamicValue();
        }
        return module0034.f1829(module0584.$g4415$.getGlobalValue(), (SubLObject)ConsesLow.list(var29), (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED);
    }
    
    public static SubLObject f35810(final SubLObject var29) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        SubLObject var31 = (SubLObject)module0584.NIL;
        final SubLObject var32 = module0147.f9540(var29);
        final SubLObject var33 = module0147.$g2095$.currentBinding(var30);
        final SubLObject var34 = module0147.$g2094$.currentBinding(var30);
        final SubLObject var35 = module0147.$g2096$.currentBinding(var30);
        try {
            module0147.$g2095$.bind(module0147.f9545(var32), var30);
            module0147.$g2094$.bind(module0147.f9546(var32), var30);
            module0147.$g2096$.bind(module0147.f9549(var32), var30);
            var31 = module0220.f14567(module0584.$ic34$, (SubLObject)module0584.THREE_INTEGER, (SubLObject)module0584.UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var35, var30);
            module0147.$g2094$.rebind(var34, var30);
            module0147.$g2095$.rebind(var33, var30);
        }
        return var31;
    }
    
    public static SubLObject f35811(SubLObject var29) {
        if (var29 == module0584.UNPROVIDED) {
            var29 = module0584.$g4396$.getDynamicValue();
        }
        SubLObject var30 = module0584.$g4415$.getGlobalValue();
        if (module0584.NIL == var30) {
            var30 = module0034.f1934((SubLObject)module0584.$ic33$, (SubLObject)module0584.$ic35$, (SubLObject)module0584.$ic36$, (SubLObject)module0584.EQUAL, (SubLObject)module0584.ONE_INTEGER, (SubLObject)module0584.ZERO_INTEGER);
        }
        SubLObject var31 = module0034.f1814(var30, var29, (SubLObject)module0584.$ic32$);
        if (var31 == module0584.$ic32$) {
            var31 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f35810(var29)));
            module0034.f1816(var30, var29, var31, (SubLObject)module0584.UNPROVIDED);
        }
        return module0034.f1959(var31);
    }
    
    public static SubLObject f35812() {
        if (module0584.$ic46$ == module0584.$g4408$.getGlobalValue()) {
            f35813();
        }
        return module0584.$g4408$.getGlobalValue();
    }
    
    public static SubLObject f35813() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var3);
        try {
            module0147.$g2094$.bind((SubLObject)module0584.$ic13$, var3);
            module0147.$g2095$.bind(module0584.$ic14$, var3);
            module0584.$g4408$.setGlobalValue(module0035.remove_if_not((SubLObject)module0584.$ic47$, (SubLObject)module0584.$ic48$, (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED));
            module0584.$g4408$.setGlobalValue(ConsesLow.append(module0584.$g4408$.getGlobalValue(), conses_high.set_difference(module0731.f44700((SubLObject)module0584.UNPROVIDED), module0584.$g4408$.getGlobalValue(), (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED)));
        }
        finally {
            module0147.$g2095$.rebind(var5, var3);
            module0147.$g2094$.rebind(var4, var3);
        }
        return f35812();
    }
    
    public static SubLObject f35814() {
        if (module0584.NIL == module0584.$g4409$.getGlobalValue()) {
            f35815();
        }
        return module0584.$g4409$.getGlobalValue();
    }
    
    public static SubLObject f35815() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var3);
        try {
            module0147.$g2094$.bind((SubLObject)module0584.$ic13$, var3);
            module0147.$g2095$.bind(module0584.$ic14$, var3);
            module0584.$g4409$.setGlobalValue(ConsesLow.append(module0035.remove_if_not((SubLObject)module0584.$ic47$, (SubLObject)module0584.$ic49$, (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED), f35812()));
        }
        finally {
            module0147.$g2095$.rebind(var5, var3);
            module0147.$g2094$.rebind(var4, var3);
        }
        return module0584.$g4409$.getGlobalValue();
    }
    
    public static SubLObject f35816() {
        f35813();
        f35815();
        return module0584.$g4408$.getGlobalValue();
    }
    
    public static SubLObject f35817(final SubLObject var35, final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        SubLObject var38 = var36;
        SubLObject var39 = (SubLObject)module0584.NIL;
        var39 = var38.first();
        while (module0584.NIL != var38) {
            if (module0584.NIL == Errors.$ignore_mustsP$.getDynamicValue(var37) && (module0584.NIL == module0035.f1998(var39) || module0584.NIL == module0038.f2614(var39))) {
                Errors.error((SubLObject)module0584.$ic56$, var39);
            }
            SubLObject var41;
            final SubLObject var40 = var41 = var39;
            SubLObject var42 = (SubLObject)module0584.NIL;
            SubLObject var43 = (SubLObject)module0584.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)module0584.$ic57$);
            var42 = var41.first();
            var41 = var41.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)module0584.$ic57$);
            var43 = var41.first();
            var41 = var41.rest();
            if (module0584.NIL == var41) {
                SubLObject var44 = module0035.f2293(module0584.$g4430$.getGlobalValue(), var35, (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED);
                var44 = module0035.f2313(var44, var42, var43, Symbols.symbol_function((SubLObject)module0584.EQUAL));
                module0584.$g4430$.setGlobalValue(module0035.f2063(module0584.$g4430$.getGlobalValue(), var35, var44, (SubLObject)module0584.UNPROVIDED));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var40, (SubLObject)module0584.$ic57$);
            }
            var38 = var38.rest();
            var39 = var38.first();
        }
        return module0584.$g4430$.getGlobalValue();
    }
    
    public static SubLObject f35818(final SubLObject var35, final SubLObject var43, final SubLObject var44) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        SubLObject var46 = (SubLObject)module0584.NIL;
        final SubLObject var47 = module0584.$g4431$.currentBinding(var45);
        try {
            module0584.$g4431$.bind((SubLObject)module0584.NIL, var45);
            var46 = f35819(var35, var43, var44);
        }
        finally {
            module0584.$g4431$.rebind(var47, var45);
        }
        return var46;
    }
    
    public static SubLObject f35819(final SubLObject var35, final SubLObject var43, final SubLObject var44) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (module0584.NIL != module0038.f2668(var43, var44, (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED)) {
            return (SubLObject)module0584.T;
        }
        if (module0584.NIL != module0004.f104(var43, module0584.$g4431$.getDynamicValue(var45), (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED)) {
            return (SubLObject)module0584.NIL;
        }
        module0584.$g4431$.setDynamicValue((SubLObject)ConsesLow.cons(var43, module0584.$g4431$.getDynamicValue(var45)), var45);
        final SubLObject var46 = f35820(var35, var43);
        SubLObject var47 = (SubLObject)module0584.NIL;
        if (module0584.NIL == var47) {
            SubLObject var48;
            SubLObject var49;
            for (var48 = var46, var49 = (SubLObject)module0584.NIL, var49 = var48.first(); module0584.NIL == var47 && module0584.NIL != var48; var47 = f35819(var35, var49, var44), var48 = var48.rest(), var49 = var48.first()) {}
        }
        return var47;
    }
    
    public static SubLObject f35820(final SubLObject var35, final SubLObject var43) {
        final SubLObject var44 = module0035.f2293(module0584.$g4430$.getGlobalValue(), var35, (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED);
        return module0035.f2293(var44, var43, Symbols.symbol_function((SubLObject)module0584.$ic58$), (SubLObject)module0584.UNPROVIDED);
    }
    
    public static SubLObject f35821(final SubLObject var19) {
        return module0004.f104(var19, module0584.$g4440$.getGlobalValue(), (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED);
    }
    
    public static SubLObject f35822() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35771", "S#39431", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35772", "S#39432", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35774", "S#39433", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35773", "S#39434", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35775", "S#39435", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35776", "S#39436", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35777", "S#39437", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35778", "S#39438", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35780", "S#39439", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35781", "S#39440", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35779", "S#39441", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35782", "S#39442", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35783", "S#39443", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35784", "S#39444", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35785", "S#39445", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35786", "S#39446", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35787", "S#39447", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35788", "S#39448", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35790", "S#39449", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35791", "S#39450", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35792", "S#39451", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35793", "S#39452", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35794", "S#39453", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35795", "S#39454", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35796", "S#39455", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35797", "S#39456", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35798", "S#39457", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35799", "S#39458", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35800", "S#15525", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35801", "S#39459", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35802", "S#39460", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35804", "S#39461", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35805", "S#39462", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35789", "S#39463", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35806", "S#39464", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35807", "S#39465", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35803", "S#39466", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35808", "S#39467", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35809", "S#39468", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35810", "S#39469", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35811", "S#39470", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35812", "ALL-LEXICON-STRING-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35813", "S#39471", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35814", "S#39472", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35815", "S#39473", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35816", "S#39474", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35817", "S#39475", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35818", "S#39476", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35819", "S#39477", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35820", "S#39478", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0584", "f35821", "S#39479", 1, 0, false);
        return (SubLObject)module0584.NIL;
    }
    
    public static SubLObject f35823() {
        module0584.$g4384$ = SubLFiles.defparameter("S#39480", (SubLObject)module0584.NIL);
        module0584.$g4385$ = SubLFiles.defparameter("S#39481", (SubLObject)module0584.NIL);
        module0584.$g4386$ = SubLFiles.defparameter("S#39482", (SubLObject)module0584.NIL);
        module0584.$g4387$ = SubLFiles.defparameter("S#39483", (SubLObject)module0584.NIL);
        module0584.$g4388$ = SubLFiles.defparameter("S#39484", (SubLObject)module0584.$ic0$);
        module0584.$g4389$ = SubLFiles.defparameter("S#39485", (SubLObject)module0584.NIL);
        module0584.$g4390$ = SubLFiles.defparameter("S#39486", (SubLObject)module0584.$ic1$);
        module0584.$g4391$ = SubLFiles.deflexical("S#39487", (SubLObject)module0584.$ic2$);
        module0584.$g4392$ = SubLFiles.defparameter("S#39488", (SubLObject)module0584.NIL);
        module0584.$g4393$ = SubLFiles.defparameter("S#39489", (SubLObject)module0584.NIL);
        module0584.$g4394$ = SubLFiles.defparameter("S#39490", (SubLObject)module0584.NIL);
        module0584.$g4395$ = SubLFiles.defparameter("S#39491", (SubLObject)module0584.NIL);
        module0584.$g4396$ = SubLFiles.defvar("*LEXICON-LOOKUP-MT*", module0584.$ic5$);
        module0584.$g4397$ = SubLFiles.defparameter("S#39492", (SubLObject)module0584.T);
        module0584.$g4398$ = SubLFiles.defparameter("S#39493", (SubLObject)module0584.NIL);
        module0584.$g4399$ = SubLFiles.defparameter("S#39494", (SubLObject)module0584.TEN_INTEGER);
        module0584.$g4400$ = SubLFiles.defparameter("S#39495", (SubLObject)module0584.NIL);
        module0584.$g4401$ = SubLFiles.defparameter("S#39496", (SubLObject)module0584.NIL);
        module0584.$g4402$ = SubLFiles.defparameter("S#39497", (SubLObject)module0584.T);
        module0584.$g4403$ = SubLFiles.defparameter("S#39498", (SubLObject)module0584.T);
        module0584.$g4404$ = SubLFiles.defparameter("S#39499", (SubLObject)module0584.$ic7$);
        module0584.$g4410$ = SubLFiles.deflexical("S#39500", (module0584.NIL != Symbols.boundp((SubLObject)module0584.$ic11$)) ? module0584.$g4410$.getGlobalValue() : f35782());
        module0584.$g4405$ = SubLFiles.deflexical("S#39501", f35782());
        module0584.$g4411$ = SubLFiles.defparameter("S#39502", module0078.f5367((SubLObject)module0584.$ic16$, (SubLObject)module0584.UNPROVIDED, (SubLObject)module0584.UNPROVIDED));
        module0584.$g4412$ = SubLFiles.deflexical("S#39503", (module0584.NIL != Symbols.boundp((SubLObject)module0584.$ic17$)) ? module0584.$g4412$.getGlobalValue() : f35782());
        module0584.$g4413$ = SubLFiles.deflexical("S#39504", (module0584.NIL != Symbols.boundp((SubLObject)module0584.$ic19$)) ? module0584.$g4413$.getGlobalValue() : f35782());
        module0584.$g4406$ = SubLFiles.deflexical("S#39505", (module0584.NIL != Symbols.boundp((SubLObject)module0584.$ic21$)) ? module0584.$g4406$.getGlobalValue() : f35782());
        module0584.$g4407$ = SubLFiles.deflexical("S#39506", (module0584.NIL != Symbols.boundp((SubLObject)module0584.$ic24$)) ? module0584.$g4407$.getGlobalValue() : f35782());
        module0584.$g4414$ = SubLFiles.deflexical("S#39507", (SubLObject)module0584.NIL);
        module0584.$g4415$ = SubLFiles.deflexical("S#39508", (SubLObject)module0584.NIL);
        module0584.$g4416$ = SubLFiles.defparameter("S#39509", (SubLObject)module0584.$ic37$);
        module0584.$g4417$ = SubLFiles.defparameter("S#39510", (SubLObject)module0584.$ic38$);
        module0584.$g4418$ = SubLFiles.defparameter("S#39511", (SubLObject)module0584.$ic39$);
        module0584.$g4419$ = SubLFiles.defparameter("S#39512", (SubLObject)module0584.$ic40$);
        module0584.$g4420$ = SubLFiles.defparameter("S#39513", (SubLObject)module0584.$ic41$);
        module0584.$g4421$ = SubLFiles.defparameter("S#39514", (SubLObject)module0584.$ic42$);
        module0584.$g4422$ = SubLFiles.defparameter("S#39515", (SubLObject)module0584.$ic43$);
        module0584.$g4423$ = SubLFiles.defparameter("S#39516", (SubLObject)module0584.$ic44$);
        module0584.$g4424$ = SubLFiles.defparameter("S#39517", (SubLObject)module0584.$ic45$);
        module0584.$g4408$ = SubLFiles.deflexical("S#39518", (SubLObject)module0584.$ic46$);
        module0584.$g4409$ = SubLFiles.deflexical("S#39519", (SubLObject)module0584.NIL);
        module0584.$g4425$ = SubLFiles.defconstant("S#39520", module0584.$ic50$);
        module0584.$g4426$ = SubLFiles.deflexical("S#39521", (SubLObject)module0584.$ic51$);
        module0584.$g4427$ = SubLFiles.deflexical("*LEXICON-CACHE-CODE-REVISION*", (SubLObject)((module0584.NIL != Symbols.boundp((SubLObject)module0584.$ic52$)) ? module0584.$g4427$.getGlobalValue() : module0584.NIL));
        module0584.$g4428$ = SubLFiles.deflexical("*MORPHOLOGY-CODE-REVISION*", (SubLObject)((module0584.NIL != Symbols.boundp((SubLObject)module0584.$ic53$)) ? module0584.$g4428$.getGlobalValue() : module0584.NIL));
        module0584.$g4429$ = SubLFiles.deflexical("*NL-TRIE-CODE-REVISION*", (SubLObject)((module0584.NIL != Symbols.boundp((SubLObject)module0584.$ic54$)) ? module0584.$g4429$.getGlobalValue() : module0584.NIL));
        module0584.$g4430$ = SubLFiles.deflexical("S#39522", (SubLObject)((module0584.NIL != Symbols.boundp((SubLObject)module0584.$ic55$)) ? module0584.$g4430$.getGlobalValue() : module0584.NIL));
        module0584.$g4431$ = SubLFiles.defparameter("S#39523", (SubLObject)module0584.NIL);
        module0584.$g4432$ = SubLFiles.defparameter("S#39524", (SubLObject)module0584.NIL);
        module0584.$g4433$ = SubLFiles.defparameter("S#39525", (SubLObject)module0584.NIL);
        module0584.$g4434$ = SubLFiles.defparameter("S#39526", (SubLObject)module0584.NIL);
        module0584.$g4435$ = SubLFiles.defparameter("S#39527", module0584.$ic59$);
        module0584.$g4436$ = SubLFiles.defparameter("S#39528", module0584.$ic59$);
        module0584.$g4437$ = SubLFiles.defparameter("S#39529", module0584.$ic59$);
        module0584.$g4438$ = SubLFiles.defparameter("S#39530", (SubLObject)module0584.ONE_INTEGER);
        module0584.$g4439$ = SubLFiles.defparameter("S#39531", (SubLObject)module0584.NIL);
        module0584.$g4440$ = SubLFiles.defconstant("S#39532", (SubLObject)module0584.$ic60$);
        module0584.$g4441$ = SubLFiles.defvar("S#39533", (SubLObject)module0584.$ic61$);
        module0584.$g4442$ = SubLFiles.defvar("S#39534", (SubLObject)module0584.$ic61$);
        module0584.$g4443$ = SubLFiles.defvar("S#39535", (SubLObject)module0584.$ic64$);
        module0584.$g4444$ = SubLFiles.defvar("S#39536", (SubLObject)module0584.$ic66$);
        module0584.$g4445$ = SubLFiles.defvar("S#39537", (SubLObject)module0584.$ic68$);
        return (SubLObject)module0584.NIL;
    }
    
    public static SubLObject f35824() {
        module0132.f8593((SubLObject)module0584.$ic6$, (SubLObject)module0584.UNPROVIDED);
        module0003.f57((SubLObject)module0584.$ic11$);
        module0003.f57((SubLObject)module0584.$ic17$);
        module0003.f57((SubLObject)module0584.$ic19$);
        module0003.f57((SubLObject)module0584.$ic21$);
        module0003.f57((SubLObject)module0584.$ic24$);
        module0034.f1909((SubLObject)module0584.$ic29$);
        module0034.f1909((SubLObject)module0584.$ic33$);
        module0003.f57((SubLObject)module0584.$ic52$);
        module0003.f57((SubLObject)module0584.$ic53$);
        module0003.f57((SubLObject)module0584.$ic54$);
        module0003.f57((SubLObject)module0584.$ic55$);
        module0012.f441((SubLObject)module0584.$ic62$);
        module0012.f444((SubLObject)module0584.$ic62$);
        module0012.f441((SubLObject)module0584.$ic63$);
        module0012.f444((SubLObject)module0584.$ic63$);
        module0012.f441((SubLObject)module0584.$ic65$);
        module0012.f444((SubLObject)module0584.$ic65$);
        module0012.f441((SubLObject)module0584.$ic67$);
        module0012.f444((SubLObject)module0584.$ic67$);
        module0012.f441((SubLObject)module0584.$ic69$);
        module0012.f444((SubLObject)module0584.$ic69$);
        return (SubLObject)module0584.NIL;
    }
    
    public void declareFunctions() {
        f35822();
    }
    
    public void initializeVariables() {
        f35823();
    }
    
    public void runTopLevelForms() {
        f35824();
    }
    
    static {
        me = (SubLFile)new module0584();
        module0584.$g4384$ = null;
        module0584.$g4385$ = null;
        module0584.$g4386$ = null;
        module0584.$g4387$ = null;
        module0584.$g4388$ = null;
        module0584.$g4389$ = null;
        module0584.$g4390$ = null;
        module0584.$g4391$ = null;
        module0584.$g4392$ = null;
        module0584.$g4393$ = null;
        module0584.$g4394$ = null;
        module0584.$g4395$ = null;
        module0584.$g4396$ = null;
        module0584.$g4397$ = null;
        module0584.$g4398$ = null;
        module0584.$g4399$ = null;
        module0584.$g4400$ = null;
        module0584.$g4401$ = null;
        module0584.$g4402$ = null;
        module0584.$g4403$ = null;
        module0584.$g4404$ = null;
        module0584.$g4410$ = null;
        module0584.$g4405$ = null;
        module0584.$g4411$ = null;
        module0584.$g4412$ = null;
        module0584.$g4413$ = null;
        module0584.$g4406$ = null;
        module0584.$g4407$ = null;
        module0584.$g4414$ = null;
        module0584.$g4415$ = null;
        module0584.$g4416$ = null;
        module0584.$g4417$ = null;
        module0584.$g4418$ = null;
        module0584.$g4419$ = null;
        module0584.$g4420$ = null;
        module0584.$g4421$ = null;
        module0584.$g4422$ = null;
        module0584.$g4423$ = null;
        module0584.$g4424$ = null;
        module0584.$g4408$ = null;
        module0584.$g4409$ = null;
        module0584.$g4425$ = null;
        module0584.$g4426$ = null;
        module0584.$g4427$ = null;
        module0584.$g4428$ = null;
        module0584.$g4429$ = null;
        module0584.$g4430$ = null;
        module0584.$g4431$ = null;
        module0584.$g4432$ = null;
        module0584.$g4433$ = null;
        module0584.$g4434$ = null;
        module0584.$g4435$ = null;
        module0584.$g4436$ = null;
        module0584.$g4437$ = null;
        module0584.$g4438$ = null;
        module0584.$g4439$ = null;
        module0584.$g4440$ = null;
        module0584.$g4441$ = null;
        module0584.$g4442$ = null;
        module0584.$g4443$ = null;
        module0584.$g4444$ = null;
        module0584.$g4445$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("GENERATION");
        $ic1$ = SubLObjectFactory.makeKeyword("AS-FALLBACK");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALWAYS"), (SubLObject)SubLObjectFactory.makeKeyword("ONLY"), (SubLObject)SubLObjectFactory.makeKeyword("AS-FALLBACK"), (SubLObject)SubLObjectFactory.makeKeyword("NEVER"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39488", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39489", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39490", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39491", "CYC"));
        $ic4$ = SubLObjectFactory.makeSymbol("S#39435", "CYC");
        $ic5$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic6$ = SubLObjectFactory.makeSymbol("*LEXICON-LOOKUP-MT*");
        $ic7$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CountNoun"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AgentiveNoun"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ProperCountNoun"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ProperMassNoun"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MassNoun"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("VERB"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Verb"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ADJECTIVE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Adjective"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ADVERB"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Adverb"))));
        $ic8$ = SubLObjectFactory.makeKeyword("IMAGE-DEMO");
        $ic9$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EnglishMt")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB")));
        $ic10$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#39500", "CYC");
        $ic12$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SemTransPred"));
        $ic13$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic14$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic15$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MultiWordForConstantPred"));
        $ic16$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("termStrings")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("termStrings-GuessedFromName")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("denotationPlaceholder")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("givenNames")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("middleName")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("familyName")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("firstName")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("lastName")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("middleNameInitial")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("initialsString")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("denotationRelatedTo")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("stockTickerSymbol")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("epistleAddresseeText")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("gospelName-Short")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nicknames")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("atomicSymbol")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("titleOfWork")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("sectionTitle")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("referenceWorkEntryTitle")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("executableProgramName")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("countryCodeDigraph")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("internetCountryCode")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("folderTitle")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ksTermString")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("rdfs:label")) });
        $ic17$ = SubLObjectFactory.makeSymbol("S#39503", "CYC");
        $ic18$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("abbreviationString-PN")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("abbreviationForLexicalWord")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("abbreviationForMultiWordString")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("abbreviationForCompoundString")));
        $ic19$ = SubLObjectFactory.makeSymbol("S#39504", "CYC");
        $ic20$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("acronymString"));
        $ic21$ = SubLObjectFactory.makeSymbol("S#39505", "CYC");
        $ic22$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("properNameStrings"));
        $ic23$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ProperNamePredicate-General"));
        $ic24$ = SubLObjectFactory.makeSymbol("S#39506", "CYC");
        $ic25$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("termStrings"));
        $ic26$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("HeadMedialMultiWordForConstantPred"));
        $ic27$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("HeadInitialMultiWordForConstantPred"));
        $ic28$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("HeadFinalMultiWordForConstantPred"));
        $ic29$ = SubLObjectFactory.makeSymbol("S#39466", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#39507", "CYC");
        $ic31$ = SubLObjectFactory.makeInteger(256);
        $ic32$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic33$ = SubLObjectFactory.makeSymbol("S#39470", "CYC");
        $ic34$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("verbSemTrans"));
        $ic35$ = SubLObjectFactory.makeSymbol("S#39508", "CYC");
        $ic36$ = SubLObjectFactory.makeInteger(128);
        $ic37$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("singular")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("plural")));
        $ic38$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pnSingular")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pnPlural")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pnMassNumber")));
        $ic39$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pnMassNumber")));
        $ic40$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pnSingular")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pnPlural")));
        $ic41$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("agentive-Sg")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("agentive-Pl")));
        $ic42$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("massNumber")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("agentive-Mass")));
        $ic43$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("infinitive")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pastTense-Universal")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("presentParticiple")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("perfect")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("thirdPersonSg-Past")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("secondPersonSg-Past")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("firstPersonSg-Past")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pluralVerb-Past")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("thirdPersonSg-Present")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("firstPersonSg-Present")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("secondPersonSg-Present")) });
        $ic44$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regularDegree")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("comparativeDegree")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("superlativeDegree")));
        $ic45$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regularAdverb")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("comparativeAdverb")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("superlativeAdverb")));
        $ic46$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic47$ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $ic48$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("properNameStrings")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("massNumber")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("plural")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("singular")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pnMassNumber")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pnPlural")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pnSingular")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("gerund")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("presentParticiple")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("infinitive")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("secondPersonSg-Present")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("firstPersonSg-Present")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("thirdPersonSg-Present")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("perfect")), SubLObjectFactory.makeSymbol("S#39538", "CYC"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("thirdPersonSg-Past")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("secondPersonSg-Past")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("firstPersonSg-Past")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pluralVerb-Past")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("agentive-Mass")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("agentive-Pl")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("agentive-Sg")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regularAdverb")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("comparativeAdverb")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("superlativeAdverb")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regularDegree")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("comparativeDegree")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("superlativeDegree")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pnNonPlural-Generic")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nonSingular-Generic")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("massNumber-Generic")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("plural-Generic")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("singular-Generic")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("singular-Feminine")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("singular-Masculine")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("plural-Feminine")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("plural-Masculine")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("singular-Neuter")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("plural-Neuter")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nonThirdSg-Present")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("perfective-Generic")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("wordStrings")) });
        $ic49$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("partOfSpeech")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("subcatFrame")));
        $ic50$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("wordStrings"));
        $ic51$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("infinitive")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("singular")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("massNumber")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regularDegree")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nonGradableAdjectiveForm")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regularAdverb")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pnMassNumber")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pnSingular")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("agentive-Sg")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("agentive-Mass")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("gerund")) });
        $ic52$ = SubLObjectFactory.makeSymbol("*LEXICON-CACHE-CODE-REVISION*");
        $ic53$ = SubLObjectFactory.makeSymbol("*MORPHOLOGY-CODE-REVISION*");
        $ic54$ = SubLObjectFactory.makeSymbol("*NL-TRIE-CODE-REVISION*");
        $ic55$ = SubLObjectFactory.makeSymbol("S#39522", "CYC");
        $ic56$ = SubLObjectFactory.makeString("Lexicon global noop-updates must be lists of two strings, which ~S isn't.");
        $ic57$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39539", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39540", "CYC"));
        $ic58$ = SubLObjectFactory.makeSymbol("S#4084", "CYC");
        $ic59$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EnglishMt"));
        $ic60$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DERIV"), (SubLObject)SubLObjectFactory.makeKeyword("INFL"));
        $ic61$ = SubLObjectFactory.makeString("GeneralEnglishMt");
        $ic62$ = SubLObjectFactory.makeSymbol("S#39533", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#39534", "CYC");
        $ic64$ = SubLObjectFactory.makeString("EnglishParaphraseMt");
        $ic65$ = SubLObjectFactory.makeSymbol("S#39535", "CYC");
        $ic66$ = SubLObjectFactory.makeString("EnglishTemplateMt");
        $ic67$ = SubLObjectFactory.makeSymbol("S#39536", "CYC");
        $ic68$ = SubLObjectFactory.makeString("RelationParaphraseMt");
        $ic69$ = SubLObjectFactory.makeSymbol("S#39537", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0584.class
	Total time: 306 ms
	
	Decompiled with Procyon 0.5.32.
*/