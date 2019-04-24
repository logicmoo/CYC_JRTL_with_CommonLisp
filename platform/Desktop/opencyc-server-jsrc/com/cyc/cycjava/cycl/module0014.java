package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0014 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0014";
    public static final String myFingerPrint = "1aac7b85a4968b749d48a70fd69b1e4b2ecb8d3d195bd4079795bfb29dc613ec";
    public static SubLSymbol $g111$;
    private static SubLSymbol $g112$;
    public static SubLSymbol $g114$;
    private static SubLSymbol $g115$;
    public static SubLSymbol $g116$;
    private static SubLSymbol $g117$;
    private static SubLSymbol $g119$;
    public static SubLSymbol $g121$;
    private static SubLSymbol $g122$;
    private static SubLSymbol $g123$;
    public static SubLSymbol $g125$;
    private static SubLSymbol $g126$;
    public static SubLSymbol $g128$;
    private static SubLSymbol $g129$;
    private static SubLSymbol $g130$;
    private static final SubLSymbol $ic0$;
    private static final SubLInteger $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLString $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLList $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLList $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    
    public static SubLObject f651() {
        return module0030.f1625(module0014.$g111$.getGlobalValue());
    }
    
    public static SubLObject f652(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0014.NIL;
        SubLObject var6 = (SubLObject)module0014.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0014.$ic2$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0014.$ic2$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0014.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0014.$ic2$);
        var4 = var4.rest();
        if (module0014.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0014.$ic3$, var5, (SubLObject)module0014.$ic0$, (SubLObject)ConsesLow.list((SubLObject)module0014.$ic4$, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0014.$ic2$);
        return (SubLObject)module0014.NIL;
    }
    
    public static SubLObject f653(final SubLObject var5) {
        return Hashtables.gethash(var5, module0014.$g111$.getGlobalValue(), (SubLObject)module0014.UNPROVIDED).first();
    }
    
    public static SubLObject f654(final SubLObject var5) {
        return conses_high.second(Hashtables.gethash(var5, module0014.$g111$.getGlobalValue(), (SubLObject)module0014.UNPROVIDED));
    }
    
    public static SubLObject f655(final SubLObject var5) {
        return module0038.f2653(f653(var5));
    }
    
    public static SubLObject f656() {
        return module0014.$g112$.getGlobalValue();
    }
    
    public static SubLObject f657(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = f653(var5);
        return Sequences.cconcatenate(module0110.$g113$.getDynamicValue(var6), var7);
    }
    
    public static SubLObject f658(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0014.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0014.$ic6$);
        var5 = var4.first();
        var4 = var4.rest();
        SubLObject var6 = (SubLObject)module0014.NIL;
        SubLObject var7 = var4;
        SubLObject var8 = (SubLObject)module0014.NIL;
        SubLObject var15_16 = (SubLObject)module0014.NIL;
        while (module0014.NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0014.$ic6$);
            var15_16 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0014.$ic6$);
            if (module0014.NIL == conses_high.member(var15_16, (SubLObject)module0014.$ic7$, (SubLObject)module0014.UNPROVIDED, (SubLObject)module0014.UNPROVIDED)) {
                var8 = (SubLObject)module0014.T;
            }
            if (var15_16 == module0014.$ic8$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (module0014.NIL != var8 && module0014.NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0014.$ic6$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)module0014.$ic9$, var4);
        final SubLObject var10 = (SubLObject)((module0014.NIL != var9) ? conses_high.cadr(var9) : module0014.$ic10$);
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0014.$ic11$, var4);
        final SubLObject var12 = (SubLObject)((module0014.NIL != var11) ? conses_high.cadr(var11) : module0014.NIL);
        final SubLObject var13 = (SubLObject)module0014.$ic12$;
        return (SubLObject)ConsesLow.list((SubLObject)module0014.$ic13$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var13, (SubLObject)ConsesLow.list((SubLObject)module0014.$ic14$, var5))), (SubLObject)ConsesLow.list((SubLObject)module0014.$ic15$, (SubLObject)ConsesLow.list((SubLObject)module0014.$ic9$, var10, (SubLObject)module0014.$ic11$, var12, (SubLObject)module0014.$ic16$, var13)));
    }
    
    public static SubLObject f659() {
        return module0030.f1625(module0014.$g114$.getGlobalValue());
    }
    
    public static SubLObject f660(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0014.NIL;
        SubLObject var6 = (SubLObject)module0014.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0014.$ic18$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0014.$ic18$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0014.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0014.$ic18$);
        var4 = var4.rest();
        if (module0014.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0014.$ic3$, var5, (SubLObject)module0014.$ic17$, (SubLObject)ConsesLow.list((SubLObject)module0014.$ic4$, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0014.$ic18$);
        return (SubLObject)module0014.NIL;
    }
    
    public static SubLObject f661(final SubLObject var24) {
        return Hashtables.gethash(var24, module0014.$g114$.getGlobalValue(), (SubLObject)module0014.UNPROVIDED).first();
    }
    
    public static SubLObject f662(final SubLObject var24) {
        return conses_high.second(Hashtables.gethash(var24, module0014.$g114$.getGlobalValue(), (SubLObject)module0014.UNPROVIDED));
    }
    
    public static SubLObject f663(final SubLObject var24) {
        return module0038.f2653(f661(var24));
    }
    
    public static SubLObject f664() {
        return module0014.$g115$.getGlobalValue();
    }
    
    public static SubLObject f665(final SubLObject var24) {
        return f661(var24);
    }
    
    public static SubLObject f666() {
        return module0030.f1625(module0014.$g116$.getGlobalValue());
    }
    
    public static SubLObject f667(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0014.NIL;
        SubLObject var6 = (SubLObject)module0014.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0014.$ic20$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0014.$ic20$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0014.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0014.$ic20$);
        var4 = var4.rest();
        if (module0014.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0014.$ic3$, var5, (SubLObject)module0014.$ic19$, (SubLObject)ConsesLow.list((SubLObject)module0014.$ic4$, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0014.$ic20$);
        return (SubLObject)module0014.NIL;
    }
    
    public static SubLObject f668(final SubLObject var27) {
        return Hashtables.gethash(var27, module0014.$g116$.getGlobalValue(), (SubLObject)module0014.UNPROVIDED).first();
    }
    
    public static SubLObject f669(final SubLObject var27) {
        return conses_high.second(Hashtables.gethash(var27, module0014.$g116$.getGlobalValue(), (SubLObject)module0014.UNPROVIDED));
    }
    
    public static SubLObject f670(final SubLObject var27) {
        return module0038.f2653(f668(var27));
    }
    
    public static SubLObject f671() {
        return module0014.$g117$.getGlobalValue();
    }
    
    public static SubLObject f672(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        final SubLObject var29 = f668(var27);
        return Sequences.cconcatenate(module0110.$g118$.getDynamicValue(var28), var29);
    }
    
    public static SubLObject f673(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0014.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0014.$ic22$);
        var5 = var4.first();
        var4 = var4.rest();
        SubLObject var6 = (SubLObject)module0014.NIL;
        SubLObject var7 = var4;
        SubLObject var8 = (SubLObject)module0014.NIL;
        SubLObject var34_35 = (SubLObject)module0014.NIL;
        while (module0014.NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0014.$ic22$);
            var34_35 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0014.$ic22$);
            if (module0014.NIL == conses_high.member(var34_35, (SubLObject)module0014.$ic23$, (SubLObject)module0014.UNPROVIDED, (SubLObject)module0014.UNPROVIDED)) {
                var8 = (SubLObject)module0014.T;
            }
            if (var34_35 == module0014.$ic8$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (module0014.NIL != var8 && module0014.NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0014.$ic22$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)module0014.$ic9$, var4);
        final SubLObject var10 = (SubLObject)((module0014.NIL != var9) ? conses_high.cadr(var9) : module0014.$ic24$);
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0014.$ic25$, var4);
        final SubLObject var12 = (SubLObject)((module0014.NIL != var11) ? conses_high.cadr(var11) : module0014.$ic26$);
        final SubLObject var13 = (SubLObject)module0014.$ic27$;
        return (SubLObject)ConsesLow.list((SubLObject)module0014.$ic13$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var13, (SubLObject)ConsesLow.list((SubLObject)module0014.$ic28$, var5))), (SubLObject)ConsesLow.list((SubLObject)module0014.$ic29$, (SubLObject)ConsesLow.list((SubLObject)module0014.$ic9$, var10, (SubLObject)module0014.$ic30$, var13, (SubLObject)module0014.$ic25$, var12)));
    }
    
    public static SubLObject f674(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        return Sequences.cconcatenate(module0110.$g120$.getDynamicValue(var41), new SubLObject[] { module0014.$ic32$, module0014.$g119$.getGlobalValue(), var40, module0014.$ic33$ });
    }
    
    public static SubLObject f675(final SubLObject var40) {
        final SubLObject var41 = f674(var40);
        final SubLObject var42 = Filesys.directory(var41, (SubLObject)module0014.UNPROVIDED);
        SubLObject var43 = (SubLObject)module0014.NIL;
        SubLObject var44 = var42;
        SubLObject var45 = (SubLObject)module0014.NIL;
        var45 = var44.first();
        while (module0014.NIL != var44) {
            if (module0014.NIL != module0038.f2673(var45, (SubLObject)module0014.$ic34$, (SubLObject)module0014.UNPROVIDED)) {
                var43 = (SubLObject)ConsesLow.cons(Sequences.cconcatenate((SubLObject)module0014.$ic35$, var45), var43);
            }
            var44 = var44.rest();
            var45 = var44.first();
        }
        return module0038.f2761(var43, (SubLObject)Characters.CHAR_comma);
    }
    
    public static SubLObject f676() {
        return module0030.f1625(module0014.$g121$.getGlobalValue());
    }
    
    public static SubLObject f677(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0014.NIL;
        SubLObject var6 = (SubLObject)module0014.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0014.$ic37$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0014.$ic37$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0014.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0014.$ic37$);
        var4 = var4.rest();
        if (module0014.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0014.$ic3$, var5, (SubLObject)module0014.$ic36$, (SubLObject)ConsesLow.list((SubLObject)module0014.$ic4$, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0014.$ic37$);
        return (SubLObject)module0014.NIL;
    }
    
    public static SubLObject f678(final SubLObject var47) {
        return Hashtables.gethash(var47, module0014.$g121$.getGlobalValue(), (SubLObject)module0014.UNPROVIDED).first();
    }
    
    public static SubLObject f679(final SubLObject var47) {
        return conses_high.second(Hashtables.gethash(var47, module0014.$g121$.getGlobalValue(), (SubLObject)module0014.UNPROVIDED));
    }
    
    public static SubLObject f680(final SubLObject var47) {
        return module0038.f2653(f678(var47));
    }
    
    public static SubLObject f681() {
        return module0014.$g123$.getGlobalValue();
    }
    
    public static SubLObject f682(final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        final SubLObject var49 = f678(var47);
        return Sequences.cconcatenate(module0110.$g124$.getDynamicValue(var48), new SubLObject[] { module0014.$g122$.getGlobalValue(), var49.isString() ? var49 : f681() });
    }
    
    public static SubLObject f683(final SubLObject var47) {
        final SubLObject var48 = f678(var47);
        return Sequences.cconcatenate(module0014.$g122$.getGlobalValue(), var48.isString() ? var48 : f681());
    }
    
    public static SubLObject f684(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0014.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0014.$ic40$);
        var5 = var4.first();
        var4 = var4.rest();
        SubLObject var6 = (SubLObject)module0014.NIL;
        SubLObject var7 = var4;
        SubLObject var8 = (SubLObject)module0014.NIL;
        SubLObject var54_55 = (SubLObject)module0014.NIL;
        while (module0014.NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0014.$ic40$);
            var54_55 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0014.$ic40$);
            if (module0014.NIL == conses_high.member(var54_55, (SubLObject)module0014.$ic41$, (SubLObject)module0014.UNPROVIDED, (SubLObject)module0014.UNPROVIDED)) {
                var8 = (SubLObject)module0014.T;
            }
            if (var54_55 == module0014.$ic8$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (module0014.NIL != var8 && module0014.NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0014.$ic40$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)module0014.$ic42$, var4);
        final SubLObject var10 = (SubLObject)((module0014.NIL != var9) ? conses_high.cadr(var9) : module0014.NIL);
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0014.$ic43$, var4);
        final SubLObject var12 = (SubLObject)((module0014.NIL != var11) ? conses_high.cadr(var11) : module0014.NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0014.$ic44$, var4);
        final SubLObject var14 = (SubLObject)((module0014.NIL != var13) ? conses_high.cadr(var13) : module0014.NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)module0014.$ic45$, var4);
        final SubLObject var16 = (SubLObject)((module0014.NIL != var15) ? conses_high.cadr(var15) : module0014.NIL);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)module0014.$ic46$, var4);
        final SubLObject var18 = (SubLObject)((module0014.NIL != var17) ? conses_high.cadr(var17) : module0014.NIL);
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)module0014.$ic47$, var4);
        final SubLObject var20 = (SubLObject)((module0014.NIL != var19) ? conses_high.cadr(var19) : module0014.NIL);
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)module0014.$ic48$, var4);
        final SubLObject var22 = (SubLObject)((module0014.NIL != var21) ? conses_high.cadr(var21) : module0014.NIL);
        final SubLObject var23 = (SubLObject)module0014.$ic49$;
        final SubLObject var24 = (SubLObject)module0014.$ic50$;
        final SubLObject var25 = (SubLObject)module0014.$ic51$;
        final SubLObject var26 = (SubLObject)module0014.$ic52$;
        return (SubLObject)ConsesLow.list((SubLObject)module0014.$ic13$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var23, (SubLObject)ConsesLow.list((SubLObject)module0014.$ic53$, (SubLObject)module0014.$ic54$, (SubLObject)ConsesLow.list((SubLObject)module0014.$ic55$, var5))), (SubLObject)ConsesLow.list(var24, (SubLObject)ConsesLow.listS((SubLObject)module0014.$ic56$, var20, var20, (SubLObject)module0014.$ic57$)), (SubLObject)ConsesLow.list(var25, (SubLObject)ConsesLow.list((SubLObject)module0014.$ic56$, var18, var18, (SubLObject)ConsesLow.list((SubLObject)module0014.$ic58$, var5))), (SubLObject)ConsesLow.list(var26, (SubLObject)ConsesLow.listS((SubLObject)module0014.$ic56$, var22, var22, (SubLObject)module0014.$ic59$))), (SubLObject)ConsesLow.list(new SubLObject[] { module0014.$ic60$, var23, module0014.$ic42$, var10, module0014.$ic43$, var12, module0014.$ic44$, var14, module0014.$ic45$, var16, module0014.$ic61$, var25, module0014.$ic62$, var24, module0014.$ic63$, var26 }));
    }
    
    public static SubLObject f685() {
        return module0030.f1625(module0014.$g125$.getGlobalValue());
    }
    
    public static SubLObject f686(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0014.NIL;
        SubLObject var6 = (SubLObject)module0014.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0014.$ic65$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0014.$ic65$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0014.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0014.$ic65$);
        var4 = var4.rest();
        if (module0014.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0014.$ic3$, var5, (SubLObject)module0014.$ic64$, (SubLObject)ConsesLow.list((SubLObject)module0014.$ic4$, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0014.$ic65$);
        return (SubLObject)module0014.NIL;
    }
    
    public static SubLObject f687(final SubLObject var76) {
        return Hashtables.gethash(var76, module0014.$g125$.getGlobalValue(), (SubLObject)module0014.UNPROVIDED).first();
    }
    
    public static SubLObject f688(final SubLObject var76) {
        return conses_high.second(Hashtables.gethash(var76, module0014.$g125$.getGlobalValue(), (SubLObject)module0014.UNPROVIDED));
    }
    
    public static SubLObject f689(final SubLObject var76) {
        return module0038.f2653(f687(var76));
    }
    
    public static SubLObject f690(final SubLObject var76) {
        final SubLThread var77 = SubLProcess.currentSubLThread();
        final SubLObject var78 = f687(var76);
        if (!var78.isString()) {
            Errors.warn((SubLObject)module0014.$ic67$, var76);
        }
        return Sequences.cconcatenate(module0006.f203(module0110.$g127$.getDynamicValue(var77)), new SubLObject[] { module0014.$ic66$, module0006.f203(var78) });
    }
    
    public static SubLObject f691() {
        return module0030.f1625(module0014.$g128$.getGlobalValue());
    }
    
    public static SubLObject f692(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0014.NIL;
        SubLObject var6 = (SubLObject)module0014.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0014.$ic37$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0014.$ic37$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0014.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0014.$ic37$);
        var4 = var4.rest();
        if (module0014.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0014.$ic3$, var5, (SubLObject)module0014.$ic68$, (SubLObject)ConsesLow.list((SubLObject)module0014.$ic4$, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0014.$ic37$);
        return (SubLObject)module0014.NIL;
    }
    
    public static SubLObject f693(final SubLObject var47) {
        return Hashtables.gethash(var47, module0014.$g128$.getGlobalValue(), (SubLObject)module0014.UNPROVIDED).first();
    }
    
    public static SubLObject f694(final SubLObject var47) {
        return conses_high.second(Hashtables.gethash(var47, module0014.$g128$.getGlobalValue(), (SubLObject)module0014.UNPROVIDED));
    }
    
    public static SubLObject f695(final SubLObject var47) {
        return module0038.f2653(f693(var47));
    }
    
    public static SubLObject f696() {
        return module0014.$g130$.getGlobalValue();
    }
    
    public static SubLObject f697(final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        final SubLObject var49 = f693(var47);
        return Sequences.cconcatenate(module0110.$g124$.getDynamicValue(var48), new SubLObject[] { module0014.$g129$.getGlobalValue(), var49.isString() ? var49 : module0014.$g130$.getGlobalValue() });
    }
    
    public static SubLObject f698(final SubLObject var47) {
        final SubLObject var48 = f693(var47);
        return Sequences.cconcatenate(module0014.$g129$.getGlobalValue(), var48.isString() ? var48 : module0014.$g130$.getGlobalValue());
    }
    
    public static SubLObject f699(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0014.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0014.$ic40$);
        var5 = var4.first();
        var4 = var4.rest();
        SubLObject var6 = (SubLObject)module0014.NIL;
        SubLObject var7 = var4;
        SubLObject var8 = (SubLObject)module0014.NIL;
        SubLObject var86_87 = (SubLObject)module0014.NIL;
        while (module0014.NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0014.$ic40$);
            var86_87 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0014.$ic40$);
            if (module0014.NIL == conses_high.member(var86_87, (SubLObject)module0014.$ic41$, (SubLObject)module0014.UNPROVIDED, (SubLObject)module0014.UNPROVIDED)) {
                var8 = (SubLObject)module0014.T;
            }
            if (var86_87 == module0014.$ic8$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (module0014.NIL != var8 && module0014.NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0014.$ic40$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)module0014.$ic42$, var4);
        final SubLObject var10 = (SubLObject)((module0014.NIL != var9) ? conses_high.cadr(var9) : module0014.NIL);
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0014.$ic43$, var4);
        final SubLObject var12 = (SubLObject)((module0014.NIL != var11) ? conses_high.cadr(var11) : module0014.NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0014.$ic44$, var4);
        final SubLObject var14 = (SubLObject)((module0014.NIL != var13) ? conses_high.cadr(var13) : module0014.NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)module0014.$ic45$, var4);
        final SubLObject var16 = (SubLObject)((module0014.NIL != var15) ? conses_high.cadr(var15) : module0014.NIL);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)module0014.$ic46$, var4);
        final SubLObject var18 = (SubLObject)((module0014.NIL != var17) ? conses_high.cadr(var17) : module0014.NIL);
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)module0014.$ic47$, var4);
        final SubLObject var20 = (SubLObject)((module0014.NIL != var19) ? conses_high.cadr(var19) : module0014.NIL);
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)module0014.$ic48$, var4);
        final SubLObject var22 = (SubLObject)((module0014.NIL != var21) ? conses_high.cadr(var21) : module0014.NIL);
        final SubLObject var23 = (SubLObject)module0014.$ic70$;
        final SubLObject var24 = (SubLObject)module0014.$ic71$;
        final SubLObject var25 = (SubLObject)module0014.$ic72$;
        final SubLObject var26 = (SubLObject)module0014.$ic73$;
        return (SubLObject)ConsesLow.list((SubLObject)module0014.$ic13$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var23, (SubLObject)ConsesLow.list((SubLObject)module0014.$ic74$, var5)), (SubLObject)ConsesLow.list(var24, (SubLObject)ConsesLow.listS((SubLObject)module0014.$ic56$, var20, var20, (SubLObject)module0014.$ic75$)), (SubLObject)ConsesLow.list(var25, (SubLObject)ConsesLow.list((SubLObject)module0014.$ic56$, var18, var18, (SubLObject)ConsesLow.list((SubLObject)module0014.$ic76$, var5))), (SubLObject)ConsesLow.list(var26, (SubLObject)ConsesLow.listS((SubLObject)module0014.$ic56$, var22, var22, (SubLObject)module0014.$ic59$))), (SubLObject)ConsesLow.list(new SubLObject[] { module0014.$ic60$, var23, module0014.$ic42$, var10, module0014.$ic43$, var12, module0014.$ic44$, var14, module0014.$ic45$, var16, module0014.$ic61$, var25, module0014.$ic62$, var24, module0014.$ic63$, var26 }));
    }
    
    public static SubLObject f700(SubLObject var95) {
        if (var95 == module0014.UNPROVIDED) {
            var95 = (SubLObject)module0014.NIL;
        }
        final SubLObject var96 = f701();
        SubLObject var97 = (SubLObject)module0014.NIL;
        SubLObject var98 = var96;
        SubLObject var99 = (SubLObject)module0014.NIL;
        var99 = var98.first();
        while (module0014.NIL != var98) {
            SubLObject var101;
            final SubLObject var100 = var101 = var99;
            SubLObject var102 = (SubLObject)module0014.NIL;
            SubLObject var103 = (SubLObject)module0014.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var101, var100, (SubLObject)module0014.$ic78$);
            var102 = var101.first();
            var101 = var101.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var101, var100, (SubLObject)module0014.$ic78$);
            var103 = var101.first();
            var101 = var101.rest();
            if (module0014.NIL == var101) {
                SubLObject var44_104;
                final SubLObject var104 = var44_104 = Functions.funcall(var102);
                SubLObject var105 = (SubLObject)module0014.NIL;
                var105 = var44_104.first();
                while (module0014.NIL != var44_104) {
                    final SubLObject var106 = f702(var105, var103);
                    final SubLObject var107_108 = (SubLObject)((module0014.NIL != var95) ? ConsesLow.list(var106, var105, var102) : var106);
                    var97 = (SubLObject)ConsesLow.cons(var107_108, var97);
                    var44_104 = var44_104.rest();
                    var105 = var44_104.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var100, (SubLObject)module0014.$ic78$);
            }
            var98 = var98.rest();
            var99 = var98.first();
        }
        return Sequences.nreverse(var97);
    }
    
    public static SubLObject f701() {
        SubLObject var96 = (SubLObject)module0014.NIL;
        var96 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0014.$ic79$, (SubLObject)module0014.$ic14$), var96);
        var96 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0014.$ic80$, (SubLObject)module0014.$ic81$), var96);
        var96 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0014.$ic82$, (SubLObject)module0014.$ic83$), var96);
        var96 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0014.$ic84$, (SubLObject)module0014.$ic85$), var96);
        var96 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0014.$ic86$, (SubLObject)module0014.$ic74$), var96);
        var96 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0014.$ic87$, (SubLObject)module0014.$ic28$), var96);
        return Sequences.nreverse(var96);
    }
    
    public static SubLObject f702(final SubLObject var105, final SubLObject var109) {
        SubLObject var110 = Functions.funcall(var109, var105);
        if (module0014.NIL != Characters.charE((SubLObject)Characters.CHAR_slash, module0038.f2636(var110))) {
            var110 = module0038.f2654(var110);
        }
        return var110;
    }
    
    public static SubLObject f703(SubLObject var110) {
        if (var110 == module0014.UNPROVIDED) {
            var110 = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject var111 = f700((SubLObject)module0014.UNPROVIDED);
        SubLObject var112 = (SubLObject)module0014.NIL;
        var112 = var111.first();
        while (module0014.NIL != var111) {
            streams_high.write_string(var112, var110, (SubLObject)module0014.UNPROVIDED, (SubLObject)module0014.UNPROVIDED);
            streams_high.terpri(var110);
            var111 = var111.rest();
            var112 = var111.first();
        }
        return (SubLObject)module0014.NIL;
    }
    
    public static SubLObject f704() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f651", "S#818", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0014", "f652", "S#819");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f653", "S#820", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f654", "S#821", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f655", "S#822", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f656", "S#823", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f657", "S#824", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0014", "f658", "S#825");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f659", "S#826", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0014", "f660", "S#827");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f661", "S#828", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f662", "S#829", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f663", "S#830", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f664", "S#831", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f665", "S#832", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f666", "S#833", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0014", "f667", "S#834");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f668", "S#835", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f669", "S#836", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f670", "S#837", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f671", "S#838", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f672", "S#839", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0014", "f673", "S#840");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f674", "S#841", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f675", "S#842", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f676", "S#843", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0014", "f677", "S#844");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f678", "S#845", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f679", "S#846", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f680", "S#847", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f681", "S#848", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f682", "S#849", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f683", "S#850", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0014", "f684", "S#851");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f685", "S#852", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0014", "f686", "S#853");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f687", "S#854", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f688", "S#855", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f689", "S#856", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f690", "S#857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f691", "S#858", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0014", "f692", "S#859");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f693", "S#860", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f694", "S#861", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f695", "S#862", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f696", "S#863", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f697", "S#864", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f698", "S#865", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0014", "f699", "S#866");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f700", "COMPILE-CB-BROWSER-DEPENDENCIES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f701", "S#867", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f702", "S#868", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0014", "f703", "CB-BROWSER-DEPENDENCY-MANIFEST", 0, 1, false);
        return (SubLObject)module0014.NIL;
    }
    
    public static SubLObject f705() {
        module0014.$g111$ = SubLFiles.deflexical("S#869", (module0014.NIL != Symbols.boundp((SubLObject)module0014.$ic0$)) ? module0014.$g111$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0014.$ic1$, (SubLObject)module0014.UNPROVIDED, (SubLObject)module0014.UNPROVIDED));
        module0014.$g112$ = SubLFiles.deflexical("S#870", (SubLObject)module0014.$ic5$);
        module0014.$g114$ = SubLFiles.deflexical("S#871", (module0014.NIL != Symbols.boundp((SubLObject)module0014.$ic17$)) ? module0014.$g114$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0014.$ic1$, (SubLObject)module0014.UNPROVIDED, (SubLObject)module0014.UNPROVIDED));
        module0014.$g115$ = SubLFiles.deflexical("S#872", (SubLObject)module0014.$ic5$);
        module0014.$g116$ = SubLFiles.deflexical("S#873", (module0014.NIL != Symbols.boundp((SubLObject)module0014.$ic19$)) ? module0014.$g116$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0014.$ic1$, (SubLObject)module0014.UNPROVIDED, (SubLObject)module0014.UNPROVIDED));
        module0014.$g117$ = SubLFiles.deflexical("S#874", (SubLObject)module0014.$ic21$);
        module0014.$g119$ = SubLFiles.deflexical("S#875", (SubLObject)module0014.$ic31$);
        module0014.$g121$ = SubLFiles.deflexical("S#876", (module0014.NIL != Symbols.boundp((SubLObject)module0014.$ic36$)) ? module0014.$g121$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0014.$ic1$, (SubLObject)module0014.UNPROVIDED, (SubLObject)module0014.UNPROVIDED));
        module0014.$g122$ = SubLFiles.deflexical("S#877", (SubLObject)module0014.$ic38$);
        module0014.$g123$ = SubLFiles.deflexical("S#878", (SubLObject)module0014.$ic39$);
        module0014.$g125$ = SubLFiles.deflexical("S#879", (module0014.NIL != Symbols.boundp((SubLObject)module0014.$ic64$)) ? module0014.$g125$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0014.$ic1$, (SubLObject)module0014.UNPROVIDED, (SubLObject)module0014.UNPROVIDED));
        module0014.$g126$ = SubLFiles.deflexical("S#880", (SubLObject)module0014.$ic66$);
        module0014.$g128$ = SubLFiles.deflexical("S#881", (module0014.NIL != Symbols.boundp((SubLObject)module0014.$ic68$)) ? module0014.$g128$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0014.$ic1$, (SubLObject)module0014.UNPROVIDED, (SubLObject)module0014.UNPROVIDED));
        module0014.$g129$ = SubLFiles.deflexical("S#882", (SubLObject)module0014.$ic69$);
        module0014.$g130$ = SubLFiles.deflexical("S#883", (SubLObject)module0014.$ic39$);
        return (SubLObject)module0014.NIL;
    }
    
    public static SubLObject f706() {
        module0003.f57((SubLObject)module0014.$ic0$);
        module0003.f57((SubLObject)module0014.$ic17$);
        module0003.f57((SubLObject)module0014.$ic19$);
        module0003.f57((SubLObject)module0014.$ic36$);
        module0003.f57((SubLObject)module0014.$ic64$);
        module0003.f57((SubLObject)module0014.$ic68$);
        module0002.f38((SubLObject)module0014.$ic77$);
        module0002.f38((SubLObject)module0014.$ic88$);
        return (SubLObject)module0014.NIL;
    }
    
    public void declareFunctions() {
        f704();
    }
    
    public void initializeVariables() {
        f705();
    }
    
    public void runTopLevelForms() {
        f706();
    }
    
    static {
        me = (SubLFile)new module0014();
        module0014.$g111$ = null;
        module0014.$g112$ = null;
        module0014.$g114$ = null;
        module0014.$g115$ = null;
        module0014.$g116$ = null;
        module0014.$g117$ = null;
        module0014.$g119$ = null;
        module0014.$g121$ = null;
        module0014.$g122$ = null;
        module0014.$g123$ = null;
        module0014.$g125$ = null;
        module0014.$g126$ = null;
        module0014.$g128$ = null;
        module0014.$g129$ = null;
        module0014.$g130$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#869", "CYC");
        $ic1$ = SubLObjectFactory.makeInteger(32);
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#884", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#885", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#886", "CYC"));
        $ic3$ = SubLObjectFactory.makeSymbol("SETHASH");
        $ic4$ = SubLObjectFactory.makeSymbol("LIST");
        $ic5$ = SubLObjectFactory.makeString("missing.js");
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#884", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeString("text/javascript")), (SubLObject)SubLObjectFactory.makeSymbol("S#887", "CYC"));
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("LANGUAGE"));
        $ic8$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic9$ = SubLObjectFactory.makeKeyword("TYPE");
        $ic10$ = SubLObjectFactory.makeString("text/javascript");
        $ic11$ = SubLObjectFactory.makeKeyword("LANGUAGE");
        $ic12$ = SubLObjectFactory.makeUninternedSymbol("US#44DFB07");
        $ic13$ = SubLObjectFactory.makeSymbol("CLET");
        $ic14$ = SubLObjectFactory.makeSymbol("S#824", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#888", "CYC");
        $ic16$ = SubLObjectFactory.makeKeyword("SRC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#871", "CYC");
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#889", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#885", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#886", "CYC"));
        $ic19$ = SubLObjectFactory.makeSymbol("S#873", "CYC");
        $ic20$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#890", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#885", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#886", "CYC"));
        $ic21$ = SubLObjectFactory.makeString("missing.css");
        $ic22$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#890", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeString("text/css")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#891", "CYC"), (SubLObject)SubLObjectFactory.makeString("stylesheet")));
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("REL"));
        $ic24$ = SubLObjectFactory.makeString("text/css");
        $ic25$ = SubLObjectFactory.makeKeyword("REL");
        $ic26$ = SubLObjectFactory.makeString("stylesheet");
        $ic27$ = SubLObjectFactory.makeUninternedSymbol("US#7FABCDD");
        $ic28$ = SubLObjectFactory.makeSymbol("S#839", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#892", "CYC");
        $ic30$ = SubLObjectFactory.makeKeyword("HREF");
        $ic31$ = SubLObjectFactory.makeString("java/");
        $ic32$ = SubLObjectFactory.makeString("/");
        $ic33$ = SubLObjectFactory.makeString("/lib/");
        $ic34$ = SubLObjectFactory.makeString("jar");
        $ic35$ = SubLObjectFactory.makeString("lib/");
        $ic36$ = SubLObjectFactory.makeSymbol("S#876", "CYC");
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#893", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#885", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#886", "CYC"));
        $ic38$ = SubLObjectFactory.makeString("");
        $ic39$ = SubLObjectFactory.makeString("missing.gif");
        $ic40$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#893", "CYC"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("S#29", "CYC"), SubLObjectFactory.makeSymbol("S#894", "CYC"), SubLObjectFactory.makeSymbol("S#895", "CYC"), SubLObjectFactory.makeSymbol("S#896", "CYC"), SubLObjectFactory.makeSymbol("S#897", "CYC"), SubLObjectFactory.makeSymbol("S#898", "CYC"), SubLObjectFactory.makeSymbol("S#899", "CYC") });
        $ic41$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("ISMAP"), (SubLObject)SubLObjectFactory.makeKeyword("HEIGHT"), (SubLObject)SubLObjectFactory.makeKeyword("WIDTH"), (SubLObject)SubLObjectFactory.makeKeyword("ALT-OVERRIDE"), (SubLObject)SubLObjectFactory.makeKeyword("ALIGN-OVERRIDE"), (SubLObject)SubLObjectFactory.makeKeyword("BORDER-OVERRIDE"));
        $ic42$ = SubLObjectFactory.makeKeyword("NAME");
        $ic43$ = SubLObjectFactory.makeKeyword("ISMAP");
        $ic44$ = SubLObjectFactory.makeKeyword("HEIGHT");
        $ic45$ = SubLObjectFactory.makeKeyword("WIDTH");
        $ic46$ = SubLObjectFactory.makeKeyword("ALT-OVERRIDE");
        $ic47$ = SubLObjectFactory.makeKeyword("ALIGN-OVERRIDE");
        $ic48$ = SubLObjectFactory.makeKeyword("BORDER-OVERRIDE");
        $ic49$ = SubLObjectFactory.makeUninternedSymbol("US#155281F");
        $ic50$ = SubLObjectFactory.makeUninternedSymbol("US#3322FD6");
        $ic51$ = SubLObjectFactory.makeUninternedSymbol("US#1320896");
        $ic52$ = SubLObjectFactory.makeUninternedSymbol("US#52AB253");
        $ic53$ = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $ic54$ = SubLObjectFactory.makeSymbol("*HTML-IMAGE-DIRECTORY*");
        $ic55$ = SubLObjectFactory.makeSymbol("S#850", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("FIF");
        $ic57$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CENTER"));
        $ic58$ = SubLObjectFactory.makeSymbol("S#846", "CYC");
        $ic59$ = ConsesLow.list((SubLObject)module0014.ZERO_INTEGER);
        $ic60$ = SubLObjectFactory.makeSymbol("S#900", "CYC");
        $ic61$ = SubLObjectFactory.makeKeyword("ALT");
        $ic62$ = SubLObjectFactory.makeKeyword("ALIGN");
        $ic63$ = SubLObjectFactory.makeKeyword("BORDER");
        $ic64$ = SubLObjectFactory.makeSymbol("S#879", "CYC");
        $ic65$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#901", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#885", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#902", "CYC"));
        $ic66$ = SubLObjectFactory.makeString("help/");
        $ic67$ = SubLObjectFactory.makeString("Help file not found for ~A");
        $ic68$ = SubLObjectFactory.makeSymbol("S#881", "CYC");
        $ic69$ = SubLObjectFactory.makeString("cb/");
        $ic70$ = SubLObjectFactory.makeUninternedSymbol("US#155281F");
        $ic71$ = SubLObjectFactory.makeUninternedSymbol("US#3322FD6");
        $ic72$ = SubLObjectFactory.makeUninternedSymbol("US#1320896");
        $ic73$ = SubLObjectFactory.makeUninternedSymbol("US#52AB253");
        $ic74$ = SubLObjectFactory.makeSymbol("S#864", "CYC");
        $ic75$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TOP"));
        $ic76$ = SubLObjectFactory.makeSymbol("S#861", "CYC");
        $ic77$ = SubLObjectFactory.makeSymbol("COMPILE-CB-BROWSER-DEPENDENCIES");
        $ic78$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#903", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#904", "CYC"));
        $ic79$ = SubLObjectFactory.makeSymbol("S#818", "CYC");
        $ic80$ = SubLObjectFactory.makeSymbol("S#826", "CYC");
        $ic81$ = SubLObjectFactory.makeSymbol("S#832", "CYC");
        $ic82$ = SubLObjectFactory.makeSymbol("S#843", "CYC");
        $ic83$ = SubLObjectFactory.makeSymbol("S#849", "CYC");
        $ic84$ = SubLObjectFactory.makeSymbol("S#852", "CYC");
        $ic85$ = SubLObjectFactory.makeSymbol("S#857", "CYC");
        $ic86$ = SubLObjectFactory.makeSymbol("S#858", "CYC");
        $ic87$ = SubLObjectFactory.makeSymbol("S#833", "CYC");
        $ic88$ = SubLObjectFactory.makeSymbol("CB-BROWSER-DEPENDENCY-MANIFEST");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0014.class
	Total time: 194 ms
	
	Decompiled with Procyon 0.5.32.
*/