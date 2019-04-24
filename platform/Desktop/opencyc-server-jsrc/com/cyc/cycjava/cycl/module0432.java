package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0432 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0432";
    public static final String myFingerPrint = "507c212b0098613272b39c641a3ca09b712091f78911804dc284923e08e21a98";
    private static SubLSymbol $g3512$;
    private static SubLSymbol $g3513$;
    private static SubLSymbol $g3514$;
    private static SubLSymbol $g3515$;
    private static SubLSymbol $g3516$;
    private static SubLSymbol $g3517$;
    private static SubLSymbol $g3518$;
    private static SubLSymbol $g3519$;
    private static SubLSymbol $g3520$;
    private static SubLSymbol $g3521$;
    private static SubLSymbol $g3523$;
    private static SubLSymbol $g3524$;
    private static SubLSymbol $g3522$;
    private static SubLSymbol $g3525$;
    private static SubLSymbol $g3526$;
    private static SubLSymbol $g3527$;
    private static final SubLInteger $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLList $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLList $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLList $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLList $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLList $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLObject $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLString $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLObject $ic53$;
    private static final SubLList $ic54$;
    private static final SubLObject $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLObject $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLList $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLInteger $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLList $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLObject $ic88$;
    private static final SubLObject $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLObject $ic98$;
    private static final SubLList $ic99$;
    private static final SubLObject $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLList $ic102$;
    private static final SubLObject $ic103$;
    private static final SubLObject $ic104$;
    private static final SubLObject $ic105$;
    private static final SubLObject $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLList $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLString $ic122$;
    private static final SubLObject $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLList $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLObject $ic131$;
    private static final SubLObject $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLString $ic134$;
    private static final SubLString $ic135$;
    private static final SubLString $ic136$;
    private static final SubLString $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLString $ic141$;
    private static final SubLList $ic142$;
    private static final SubLList $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLObject $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLObject $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLList $ic155$;
    private static final SubLString $ic156$;
    private static final SubLObject $ic157$;
    private static final SubLObject $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLString $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLString $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLString $ic169$;
    private static final SubLString $ic170$;
    private static final SubLString $ic171$;
    private static final SubLObject $ic172$;
    private static final SubLString $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLString $ic176$;
    private static final SubLString $ic177$;
    private static final SubLString $ic178$;
    private static final SubLString $ic179$;
    private static final SubLString $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLObject $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLObject $ic184$;
    private static final SubLObject $ic185$;
    private static final SubLObject $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLObject $ic188$;
    private static final SubLString $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLString $ic191$;
    private static final SubLSymbol $ic192$;
    
    public static SubLObject f30473(SubLObject var1) {
        if (var1 == module0432.UNPROVIDED) {
            var1 = (SubLObject)module0432.$ic0$;
        }
        final SubLObject var2 = f30474();
        f30475(var1);
        return var2;
    }
    
    public static SubLObject f30475(final SubLObject var1) {
        return (SubLObject)module0432.NIL;
    }
    
    public static SubLObject f30476() {
        f30477((SubLObject)module0432.NIL);
        f30478();
        return (SubLObject)module0432.NIL;
    }
    
    public static SubLObject f30479(final SubLObject var3, final SubLObject var4, SubLObject var5, SubLObject var6, SubLObject var7, SubLObject var8) {
        if (var5 == module0432.UNPROVIDED) {
            var5 = (SubLObject)module0432.NIL;
        }
        if (var6 == module0432.UNPROVIDED) {
            var6 = (SubLObject)module0432.NIL;
        }
        if (var7 == module0432.UNPROVIDED) {
            var7 = module0574.f35152();
        }
        if (var8 == module0432.UNPROVIDED) {
            var8 = Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("S#33713", "CYC"));
        }
        assert module0432.NIL != module0212.f13762(var3) : var3;
        SubLObject var9 = var5;
        assert module0432.NIL != module0035.f2015(var9) : var9;
        SubLObject var10 = var9;
        SubLObject var11 = (SubLObject)module0432.NIL;
        var11 = var10.first();
        while (module0432.NIL != var10) {
            assert module0432.NIL != Types.stringp(var11) : var11;
            var10 = var10.rest();
            var11 = var10.first();
        }
        var9 = var6;
        assert module0432.NIL != module0035.f2015(var9) : var9;
        var10 = var9;
        var11 = (SubLObject)module0432.NIL;
        var11 = var10.first();
        while (module0432.NIL != var10) {
            assert module0432.NIL != Types.stringp(var11) : var11;
            var10 = var10.rest();
            var11 = var10.first();
        }
        final SubLObject var12 = f30480(var3, var4, var5, var6, var7, var8);
        if (module0432.NIL != var12) {
            f30481(var12);
        }
        return var12;
    }
    
    public static SubLObject f30480(final SubLObject var3, final SubLObject var4, SubLObject var5, SubLObject var6, SubLObject var7, SubLObject var8) {
        if (var5 == module0432.UNPROVIDED) {
            var5 = (SubLObject)module0432.NIL;
        }
        if (var6 == module0432.UNPROVIDED) {
            var6 = (SubLObject)module0432.NIL;
        }
        if (var7 == module0432.UNPROVIDED) {
            var7 = module0574.f35152();
        }
        if (var8 == module0432.UNPROVIDED) {
            var8 = Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("S#33713", "CYC"));
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = f30482(var7, var8);
        final SubLObject var11 = module0543.f33623((SubLObject)module0432.$ic5$, (SubLObject)module0432.UNPROVIDED);
        SubLObject var12 = Types.sublisp_null(var11);
        f30483(var11);
        final SubLObject var13 = module0111.$g1405$.currentBinding(var9);
        try {
            module0111.$g1405$.bind((SubLObject)module0432.NIL, var9);
            module0574.f35153(var7);
            SubLObject var14 = (SubLObject)module0432.$ic8$;
            SubLObject var15 = (SubLObject)module0432.NIL;
            var15 = var14.first();
            while (module0432.NIL != var14) {
                module0543.f33631((SubLObject)ConsesLow.list(module0432.$ic6$, var11, var15), module0432.$ic7$, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
                var14 = var14.rest();
                var15 = var14.first();
            }
            var14 = var5;
            SubLObject var16 = (SubLObject)module0432.NIL;
            var16 = var14.first();
            while (module0432.NIL != var14) {
                module0543.f33631((SubLObject)ConsesLow.list(f30484(), var11, var16), var10, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
                var14 = var14.rest();
                var16 = var14.first();
            }
            var14 = var6;
            var16 = (SubLObject)module0432.NIL;
            var16 = var14.first();
            while (module0432.NIL != var14) {
                module0543.f33631((SubLObject)ConsesLow.list(module0432.$ic9$, var11, var16), var10, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
                var14 = var14.rest();
                var16 = var14.first();
            }
            var14 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0432.$ic6$, var11, f30485(var3, var7)), (SubLObject)ConsesLow.listS(module0432.$ic6$, var11, (SubLObject)module0432.$ic10$), (SubLObject)ConsesLow.list(module0432.$ic11$, var11, var10), (SubLObject)ConsesLow.list(module0432.$ic12$, var11, var4));
            SubLObject var17 = (SubLObject)module0432.NIL;
            var17 = var14.first();
            while (module0432.NIL != var14) {
                if (module0432.NIL == module0543.f33631(var17, var10, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED)) {
                    var12 = (SubLObject)module0432.T;
                }
                var14 = var14.rest();
                var17 = var14.first();
            }
        }
        finally {
            module0111.$g1405$.rebind(var13, var9);
        }
        return (SubLObject)((module0432.NIL != var12) ? module0432.NIL : var11);
    }
    
    public static SubLObject f30481(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)module0432.NIL;
        final SubLObject var23 = module0111.$g1405$.currentBinding(var21);
        try {
            module0111.$g1405$.bind((SubLObject)module0432.NIL, var21);
            module0574.f35153(module0432.$ic13$);
            if (module0432.NIL == module0543.f33631((SubLObject)ConsesLow.list(module0432.$ic14$, var20), module0432.$ic7$, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED)) {
                var22 = (SubLObject)module0432.T;
            }
        }
        finally {
            module0111.$g1405$.rebind(var23, var21);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0432.NIL == var22);
    }
    
    public static SubLObject f30486(final SubLObject var3, final SubLObject var21, SubLObject var5, SubLObject var6, SubLObject var7, SubLObject var8) {
        if (var5 == module0432.UNPROVIDED) {
            var5 = (SubLObject)module0432.NIL;
        }
        if (var6 == module0432.UNPROVIDED) {
            var6 = (SubLObject)module0432.NIL;
        }
        if (var7 == module0432.UNPROVIDED) {
            var7 = module0574.f35152();
        }
        if (var8 == module0432.UNPROVIDED) {
            var8 = Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("S#33713", "CYC"));
        }
        assert module0432.NIL != module0212.f13762(var3) : var3;
        SubLObject var22 = var5;
        assert module0432.NIL != module0035.f2015(var22) : var22;
        SubLObject var23 = var22;
        SubLObject var24 = (SubLObject)module0432.NIL;
        var24 = var23.first();
        while (module0432.NIL != var23) {
            assert module0432.NIL != Types.stringp(var24) : var24;
            var23 = var23.rest();
            var24 = var23.first();
        }
        var22 = var6;
        assert module0432.NIL != module0035.f2015(var22) : var22;
        var23 = var22;
        var24 = (SubLObject)module0432.NIL;
        var24 = var23.first();
        while (module0432.NIL != var23) {
            assert module0432.NIL != Types.stringp(var24) : var24;
            var23 = var23.rest();
            var24 = var23.first();
        }
        final SubLObject var25 = f30487(var3, var21, var5, var6, var7, var8);
        if (module0432.NIL != var25) {
            f30481(var25);
        }
        return var25;
    }
    
    public static SubLObject f30487(final SubLObject var3, final SubLObject var21, SubLObject var5, SubLObject var6, SubLObject var7, SubLObject var8) {
        if (var5 == module0432.UNPROVIDED) {
            var5 = (SubLObject)module0432.NIL;
        }
        if (var6 == module0432.UNPROVIDED) {
            var6 = (SubLObject)module0432.NIL;
        }
        if (var7 == module0432.UNPROVIDED) {
            var7 = module0574.f35152();
        }
        if (var8 == module0432.UNPROVIDED) {
            var8 = Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("S#33713", "CYC"));
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = f30482(var7, var8);
        final SubLObject var24 = module0543.f33623((SubLObject)module0432.$ic16$, (SubLObject)module0432.UNPROVIDED);
        SubLObject var25 = Types.sublisp_null(var24);
        f30483(var24);
        final SubLObject var26 = module0111.$g1405$.currentBinding(var22);
        try {
            module0111.$g1405$.bind((SubLObject)module0432.NIL, var22);
            module0574.f35153(var7);
            SubLObject var27 = (SubLObject)module0432.$ic17$;
            SubLObject var28 = (SubLObject)module0432.NIL;
            var28 = var27.first();
            while (module0432.NIL != var27) {
                module0543.f33631((SubLObject)ConsesLow.list(module0432.$ic6$, var24, var28), module0432.$ic7$, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
                var27 = var27.rest();
                var28 = var27.first();
            }
            var27 = var5;
            SubLObject var29 = (SubLObject)module0432.NIL;
            var29 = var27.first();
            while (module0432.NIL != var27) {
                module0543.f33631((SubLObject)ConsesLow.list(f30484(), var24, var29), var23, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
                var27 = var27.rest();
                var29 = var27.first();
            }
            var27 = var6;
            var29 = (SubLObject)module0432.NIL;
            var29 = var27.first();
            while (module0432.NIL != var27) {
                module0543.f33631((SubLObject)ConsesLow.list(module0432.$ic9$, var24, var29), var23, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
                var27 = var27.rest();
                var29 = var27.first();
            }
            var27 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0432.$ic6$, var24, (SubLObject)ConsesLow.list(module0432.$ic18$, (SubLObject)ConsesLow.list(module0432.$ic19$, var3))), (SubLObject)ConsesLow.list(module0432.$ic20$, var24, var21), (SubLObject)ConsesLow.list(module0432.$ic11$, var24, var23), (SubLObject)ConsesLow.listS(module0432.$ic21$, var24, (SubLObject)module0432.$ic22$), (SubLObject)ConsesLow.list(module0432.$ic23$, var24, var7));
            SubLObject var30 = (SubLObject)module0432.NIL;
            var30 = var27.first();
            while (module0432.NIL != var27) {
                if (module0432.NIL == module0543.f33631(var30, var23, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED)) {
                    var25 = (SubLObject)module0432.T;
                }
                var27 = var27.rest();
                var30 = var27.first();
            }
        }
        finally {
            module0111.$g1405$.rebind(var26, var22);
        }
        return (SubLObject)((module0432.NIL != var25) ? module0432.NIL : var24);
    }
    
    public static SubLObject f30488(final SubLObject var3, final SubLObject var4, SubLObject var7, SubLObject var8) {
        if (var7 == module0432.UNPROVIDED) {
            var7 = module0574.f35152();
        }
        if (var8 == module0432.UNPROVIDED) {
            var8 = Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("S#33713", "CYC"));
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        assert module0432.NIL != module0212.f13762(var3) : var3;
        SubLObject var10 = module0595.f36374(module0432.$ic26$, var3, (SubLObject)module0432.$ic27$);
        SubLObject var11 = (SubLObject)module0432.NIL;
        var11 = var10.first();
        while (module0432.NIL != var10) {
            SubLObject var13;
            final SubLObject var12 = var13 = var11;
            SubLObject var14 = (SubLObject)module0432.NIL;
            SubLObject var15 = (SubLObject)module0432.NIL;
            SubLObject var16 = (SubLObject)module0432.NIL;
            SubLObject var17 = (SubLObject)module0432.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0432.$ic25$);
            var14 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0432.$ic25$);
            var15 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0432.$ic25$);
            var16 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0432.$ic25$);
            var17 = var13.first();
            var13 = var13.rest();
            if (module0432.NIL == var13) {
                if (var14.equal(var7) && var17.equal(var8) && var16.equal(var4)) {
                    f30489(var15);
                    final SubLObject var18 = module0111.$g1405$.currentBinding(var9);
                    try {
                        module0111.$g1405$.bind((SubLObject)module0432.NIL, var9);
                        module0574.f35153(var7);
                        module0543.f33632(var15);
                    }
                    finally {
                        module0111.$g1405$.rebind(var18, var9);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)module0432.$ic25$);
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        return (SubLObject)module0432.NIL;
    }
    
    public static SubLObject f30490(final SubLObject var3, final SubLObject var21, SubLObject var7, SubLObject var8) {
        if (var7 == module0432.UNPROVIDED) {
            var7 = module0574.f35152();
        }
        if (var8 == module0432.UNPROVIDED) {
            var8 = Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("S#33713", "CYC"));
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        assert module0432.NIL != module0212.f13762(var3) : var3;
        SubLObject var23 = module0595.f36374(module0432.$ic30$, var3, (SubLObject)module0432.$ic31$);
        SubLObject var24 = (SubLObject)module0432.NIL;
        var24 = var23.first();
        while (module0432.NIL != var23) {
            SubLObject var26;
            final SubLObject var25 = var26 = var24;
            SubLObject var27 = (SubLObject)module0432.NIL;
            SubLObject var28 = (SubLObject)module0432.NIL;
            SubLObject var29 = (SubLObject)module0432.NIL;
            SubLObject var30 = (SubLObject)module0432.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)module0432.$ic29$);
            var27 = var26.first();
            var26 = var26.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)module0432.$ic29$);
            var28 = var26.first();
            var26 = var26.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)module0432.$ic29$);
            var29 = var26.first();
            var26 = var26.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)module0432.$ic29$);
            var30 = var26.first();
            var26 = var26.rest();
            if (module0432.NIL == var26) {
                if (var27.equal(var7) && var30.equal(var8) && var29.equal(var21)) {
                    f30489(var28);
                    final SubLObject var31 = module0111.$g1405$.currentBinding(var22);
                    try {
                        module0111.$g1405$.bind((SubLObject)module0432.NIL, var22);
                        module0574.f35153(var7);
                        module0543.f33632(var28);
                    }
                    finally {
                        module0111.$g1405$.rebind(var31, var22);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var25, (SubLObject)module0432.$ic29$);
            }
            var23 = var23.rest();
            var24 = var23.first();
        }
        return (SubLObject)module0432.NIL;
    }
    
    public static SubLObject f30485(final SubLObject var3, final SubLObject var7) {
        return (SubLObject)ConsesLow.list(module0432.$ic32$, (SubLObject)ConsesLow.listS(module0432.$ic33$, (SubLObject)ConsesLow.list(module0432.$ic33$, (SubLObject)ConsesLow.list(module0432.$ic18$, (SubLObject)ConsesLow.list(module0432.$ic19$, var3)), module0432.$ic23$, var7), (SubLObject)module0432.$ic34$));
    }
    
    public static SubLObject f30491(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        final SubLObject var14 = f30485((SubLObject)module0432.$ic35$, (SubLObject)module0432.$ic36$);
        SubLObject var15 = (SubLObject)module0432.NIL;
        final SubLObject var16 = module0147.$g2094$.currentBinding(var13);
        final SubLObject var17 = module0147.$g2095$.currentBinding(var13);
        try {
            module0147.$g2094$.bind((SubLObject)module0432.$ic37$, var13);
            module0147.$g2095$.bind(module0432.$ic38$, var13);
            SubLObject var18 = (SubLObject)module0432.NIL;
            final SubLObject var19 = module0432.$ic6$;
            if (module0432.NIL != module0158.f10010(var12, (SubLObject)module0432.ONE_INTEGER, var19)) {
                final SubLObject var20 = module0158.f10011(var12, (SubLObject)module0432.ONE_INTEGER, var19);
                SubLObject var21 = var15;
                final SubLObject var22 = (SubLObject)module0432.NIL;
                while (module0432.NIL == var21) {
                    final SubLObject var23 = module0052.f3695(var20, var22);
                    final SubLObject var24 = (SubLObject)SubLObjectFactory.makeBoolean(!var22.eql(var23));
                    if (module0432.NIL != var24) {
                        SubLObject var25 = (SubLObject)module0432.NIL;
                        try {
                            var25 = module0158.f10316(var23, (SubLObject)module0432.$ic39$, (SubLObject)module0432.NIL, (SubLObject)module0432.NIL);
                            SubLObject var40_45 = var15;
                            final SubLObject var41_46 = (SubLObject)module0432.NIL;
                            while (module0432.NIL == var40_45) {
                                final SubLObject var26 = module0052.f3695(var25, var41_46);
                                final SubLObject var43_48 = (SubLObject)SubLObjectFactory.makeBoolean(!var41_46.eql(var26));
                                if (module0432.NIL != var43_48) {
                                    var18 = module0178.f11331(var26, (SubLObject)module0432.TWO_INTEGER);
                                    var13.resetMultipleValues();
                                    final SubLObject var27 = module0337.f22630(module0205.f13144(var18), var14);
                                    final SubLObject var28 = var13.secondMultipleValue();
                                    var13.resetMultipleValues();
                                    if (module0432.NIL != var27) {
                                        final SubLObject var29 = var15 = module0035.f2294(var28, (SubLObject)module0432.$ic40$, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
                                    }
                                }
                                var40_45 = (SubLObject)SubLObjectFactory.makeBoolean(module0432.NIL == var43_48 || module0432.NIL != var15);
                            }
                        }
                        finally {
                            final SubLObject var16_52 = Threads.$is_thread_performing_cleanupP$.currentBinding(var13);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0432.T, var13);
                                if (module0432.NIL != var25) {
                                    module0158.f10319(var25);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var16_52, var13);
                            }
                        }
                    }
                    var21 = (SubLObject)SubLObjectFactory.makeBoolean(module0432.NIL == var24 || module0432.NIL != var15);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var17, var13);
            module0147.$g2094$.rebind(var16, var13);
        }
        return var15;
    }
    
    public static SubLObject f30482(SubLObject var7, SubLObject var8) {
        if (var7 == module0432.UNPROVIDED) {
            var7 = module0574.f35152();
        }
        if (var8 == module0432.UNPROVIDED) {
            var8 = Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("S#33713", "CYC"));
        }
        if (module0432.NIL != var7 && module0432.NIL != var8) {
            return module0162.f10628(module0202.f12768(module0432.$ic41$, var7, var8));
        }
        return module0432.$ic42$;
    }
    
    public static SubLObject f30492(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        assert module0432.NIL != module0212.f13762(var3) : var3;
        SubLObject var5 = (SubLObject)module0432.NIL;
        final SubLObject var6 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var7 = module0147.$g2095$.currentBinding(var4);
        try {
            module0147.$g2094$.bind((SubLObject)module0432.$ic37$, var4);
            module0147.$g2095$.bind(module0432.$ic38$, var4);
            SubLObject var8 = (SubLObject)module0432.NIL;
            final SubLObject var9 = module0432.$ic44$;
            if (module0432.NIL != module0158.f10010(var3, (SubLObject)module0432.ONE_INTEGER, var9)) {
                final SubLObject var10 = module0158.f10011(var3, (SubLObject)module0432.ONE_INTEGER, var9);
                SubLObject var11 = (SubLObject)module0432.NIL;
                final SubLObject var12 = (SubLObject)module0432.NIL;
                while (module0432.NIL == var11) {
                    final SubLObject var13 = module0052.f3695(var10, var12);
                    final SubLObject var14 = (SubLObject)SubLObjectFactory.makeBoolean(!var12.eql(var13));
                    if (module0432.NIL != var14) {
                        SubLObject var15 = (SubLObject)module0432.NIL;
                        try {
                            var15 = module0158.f10316(var13, (SubLObject)module0432.$ic39$, (SubLObject)module0432.NIL, (SubLObject)module0432.NIL);
                            SubLObject var40_55 = (SubLObject)module0432.NIL;
                            final SubLObject var41_56 = (SubLObject)module0432.NIL;
                            while (module0432.NIL == var40_55) {
                                final SubLObject var16 = module0052.f3695(var15, var41_56);
                                final SubLObject var43_57 = (SubLObject)SubLObjectFactory.makeBoolean(!var41_56.eql(var16));
                                if (module0432.NIL != var43_57) {
                                    var8 = module0178.f11331(var16, (SubLObject)module0432.TWO_INTEGER);
                                    if (module0432.NIL != module0212.f13762(var8)) {
                                        final SubLObject var17 = module0220.f14553(var8, module0432.$ic45$, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
                                        final SubLObject var18 = f30493(var8);
                                        final SubLObject var19 = module0220.f14553(var8, module0432.$ic46$, (SubLObject)module0432.TWO_INTEGER, (SubLObject)module0432.ONE_INTEGER, (SubLObject)module0432.UNPROVIDED);
                                        SubLObject var20 = (SubLObject)module0432.NIL;
                                        SubLObject var21 = (SubLObject)module0432.NIL;
                                        SubLObject var22 = (SubLObject)module0432.NIL;
                                        if (module0432.NIL != module0212.f13762(var19) && var18.isInteger()) {
                                            SubLObject var23 = (SubLObject)module0432.NIL;
                                            final SubLObject var38_64 = module0432.$ic47$;
                                            if (module0432.NIL != module0158.f10010(var19, (SubLObject)module0432.NIL, var38_64)) {
                                                final SubLObject var39_65 = module0158.f10011(var19, (SubLObject)module0432.NIL, var38_64);
                                                SubLObject var40_56 = (SubLObject)module0432.NIL;
                                                final SubLObject var41_57 = (SubLObject)module0432.NIL;
                                                while (module0432.NIL == var40_56) {
                                                    final SubLObject var42_68 = module0052.f3695(var39_65, var41_57);
                                                    final SubLObject var43_58 = (SubLObject)SubLObjectFactory.makeBoolean(!var41_57.eql(var42_68));
                                                    if (module0432.NIL != var43_58) {
                                                        SubLObject var44_70 = (SubLObject)module0432.NIL;
                                                        try {
                                                            var44_70 = module0158.f10316(var42_68, (SubLObject)module0432.$ic39$, (SubLObject)module0432.NIL, (SubLObject)module0432.NIL);
                                                            SubLObject var40_57 = (SubLObject)module0432.NIL;
                                                            final SubLObject var41_58 = (SubLObject)module0432.NIL;
                                                            while (module0432.NIL == var40_57) {
                                                                final SubLObject var47_73 = module0052.f3695(var44_70, var41_58);
                                                                final SubLObject var43_59 = (SubLObject)SubLObjectFactory.makeBoolean(!var41_58.eql(var47_73));
                                                                if (module0432.NIL != var43_59) {
                                                                    var23 = module0178.f11331(var47_73, (SubLObject)module0432.TWO_INTEGER);
                                                                    if (module0432.NIL != module0075.f5218(var23)) {
                                                                        final SubLObject var24 = Filesys.file_write_date(var23);
                                                                        if (module0432.NIL == var20 || module0432.NIL == var21 || (module0432.NIL != var24 && var24.numL(var21))) {
                                                                            var20 = var23;
                                                                            var21 = var24;
                                                                        }
                                                                    }
                                                                }
                                                                var40_57 = (SubLObject)SubLObjectFactory.makeBoolean(module0432.NIL == var43_59);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject var16_76 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0432.T, var4);
                                                                if (module0432.NIL != var44_70) {
                                                                    module0158.f10319(var44_70);
                                                                }
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(var16_76, var4);
                                                            }
                                                        }
                                                    }
                                                    var40_56 = (SubLObject)SubLObjectFactory.makeBoolean(module0432.NIL == var43_58);
                                                }
                                            }
                                            if (module0432.NIL != var20) {
                                                final SubLObject var25 = (SubLObject)((module0432.NIL != var21) ? var21 : ((module0432.NIL != var17) ? module0612.f37427(var17) : module0432.NIL));
                                                if (module0432.NIL != var25) {
                                                    var22 = Sequences.cconcatenate(module0051.f3617(module0051.f3557(var25, (SubLObject)module0432.UNPROVIDED)), new SubLObject[] { module0432.$ic48$, module0051.f3634(module0051.f3558(var25)) });
                                                }
                                                var5 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0432.$ic49$, var22, (SubLObject)module0432.$ic50$, var18, (SubLObject)module0432.$ic51$, var20), var5);
                                            }
                                        }
                                    }
                                }
                                var40_55 = (SubLObject)SubLObjectFactory.makeBoolean(module0432.NIL == var43_57);
                            }
                        }
                        finally {
                            final SubLObject var16_77 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0432.T, var4);
                                if (module0432.NIL != var15) {
                                    module0158.f10319(var15);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var16_77, var4);
                            }
                        }
                    }
                    var11 = (SubLObject)SubLObjectFactory.makeBoolean(module0432.NIL == var14);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var7, var4);
            module0147.$g2094$.rebind(var6, var4);
        }
        return var5;
    }
    
    public static SubLObject f30493(final SubLObject var54) {
        SubLObject var55 = module0434.f30578((SubLObject)module0432.$ic52$, (SubLObject)ConsesLow.listS(module0432.$ic53$, var54, (SubLObject)module0432.$ic54$), module0432.$ic55$, (SubLObject)module0432.$ic56$).first();
        if (module0432.NIL == var55) {
            SubLObject var56;
            SubLObject var57;
            for (var56 = module0434.f30578((SubLObject)module0432.$ic57$, (SubLObject)ConsesLow.listS(module0432.$ic58$, var54, (SubLObject)module0432.$ic59$), module0432.$ic55$, (SubLObject)module0432.$ic56$), var57 = (SubLObject)module0432.NIL, var57 = var56.first(); module0432.NIL == var55 && module0432.NIL != var56; var55 = (SubLObject)((module0432.NIL != module0202.f12676(var57)) ? Sequences.length(module0202.f12792(var57)) : module0432.NIL), var56 = var56.rest(), var57 = var56.first()) {}
        }
        return var55;
    }
    
    public static SubLObject f30494(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        assert module0432.NIL != module0212.f13762(var3) : var3;
        SubLObject var5 = (SubLObject)module0432.NIL;
        final SubLObject var6 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var7 = module0147.$g2095$.currentBinding(var4);
        try {
            module0147.$g2094$.bind((SubLObject)module0432.$ic37$, var4);
            module0147.$g2095$.bind(module0432.$ic38$, var4);
            SubLObject var8 = (SubLObject)module0432.NIL;
            final SubLObject var9 = module0432.$ic61$;
            if (module0432.NIL != module0158.f10010(var3, (SubLObject)module0432.TWO_INTEGER, var9)) {
                final SubLObject var10 = module0158.f10011(var3, (SubLObject)module0432.TWO_INTEGER, var9);
                SubLObject var11 = (SubLObject)module0432.NIL;
                final SubLObject var12 = (SubLObject)module0432.NIL;
                while (module0432.NIL == var11) {
                    final SubLObject var13 = module0052.f3695(var10, var12);
                    final SubLObject var14 = (SubLObject)SubLObjectFactory.makeBoolean(!var12.eql(var13));
                    if (module0432.NIL != var14) {
                        SubLObject var15 = (SubLObject)module0432.NIL;
                        try {
                            var15 = module0158.f10316(var13, (SubLObject)module0432.$ic39$, (SubLObject)module0432.NIL, (SubLObject)module0432.NIL);
                            SubLObject var40_83 = (SubLObject)module0432.NIL;
                            final SubLObject var41_84 = (SubLObject)module0432.NIL;
                            while (module0432.NIL == var40_83) {
                                final SubLObject var16 = module0052.f3695(var15, var41_84);
                                final SubLObject var43_85 = (SubLObject)SubLObjectFactory.makeBoolean(!var41_84.eql(var16));
                                if (module0432.NIL != var43_85) {
                                    var8 = module0178.f11331(var16, (SubLObject)module0432.ONE_INTEGER);
                                    final SubLObject var17 = f30495(var8, (SubLObject)module0432.NIL);
                                    SubLObject var18 = (SubLObject)module0432.NIL;
                                    if (module0432.NIL != var17) {
                                        var18 = conses_high.putf(var18, (SubLObject)module0432.$ic62$, var17);
                                        if (module0432.NIL != module0259.f16891(var8, module0432.$ic63$)) {
                                            final SubLObject var19 = module0220.f14553(var8, module0432.$ic12$, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
                                            if (module0432.NIL != var19) {
                                                var18 = conses_high.putf(var18, (SubLObject)module0432.$ic64$, var19);
                                            }
                                        }
                                        SubLObject var20 = (SubLObject)module0432.NIL;
                                        SubLObject var90_91 = (SubLObject)module0432.NIL;
                                        SubLObject var21 = (SubLObject)module0432.NIL;
                                        SubLObject var93_94 = (SubLObject)module0432.NIL;
                                        var20 = reader.bq_cons(f30484(), (SubLObject)module0432.$ic65$);
                                        var90_91 = var20.first();
                                        var21 = (SubLObject)module0432.$ic66$;
                                        var93_94 = var21.first();
                                        while (module0432.NIL != var21 || module0432.NIL != var20) {
                                            final SubLObject var22 = module0220.f14562(var8, var90_91, (SubLObject)module0432.ONE_INTEGER, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
                                            if (module0432.NIL != module0035.f2013(var22)) {
                                                var18 = conses_high.putf(var18, var93_94, var22);
                                            }
                                            var20 = var20.rest();
                                            var90_91 = var20.first();
                                            var21 = var21.rest();
                                            var93_94 = var21.first();
                                        }
                                        var5 = (SubLObject)ConsesLow.cons(var18, var5);
                                    }
                                }
                                var40_83 = (SubLObject)SubLObjectFactory.makeBoolean(module0432.NIL == var43_85);
                            }
                        }
                        finally {
                            final SubLObject var16_96 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0432.T, var4);
                                if (module0432.NIL != var15) {
                                    module0158.f10319(var15);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var16_96, var4);
                            }
                        }
                    }
                    var11 = (SubLObject)SubLObjectFactory.makeBoolean(module0432.NIL == var14);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var7, var4);
            module0147.$g2094$.rebind(var6, var4);
        }
        return var5;
    }
    
    public static SubLObject f30496(SubLObject var97, SubLObject var98) {
        if (var97 == module0432.UNPROVIDED) {
            var97 = (SubLObject)module0432.NIL;
        }
        if (var98 == module0432.UNPROVIDED) {
            var98 = (SubLObject)module0432.NIL;
        }
        final SubLThread var99 = SubLProcess.currentSubLThread();
        SubLObject var100 = (SubLObject)module0432.NIL;
        if (module0432.NIL != var97 && module0432.NIL != var98) {
            SubLObject var101 = (SubLObject)module0432.NIL;
            try {
                var99.throwStack.push(module0432.$ic71$);
                final SubLObject var102 = Errors.$error_handler$.currentBinding(var99);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0432.$ic72$), var99);
                    try {
                        final SubLObject var103 = module0103.f7393(module0103.f7380(var97, var98, (SubLObject)module0432.UNPROVIDED));
                        try {
                            module0103.f7394(var103);
                            final SubLObject var16_102 = module0103.$g1343$.currentBinding(var99);
                            try {
                                module0103.$g1343$.bind(var103, var99);
                                var100 = module0103.f7405((SubLObject)module0432.$ic73$);
                            }
                            finally {
                                module0103.$g1343$.rebind(var16_102, var99);
                            }
                        }
                        finally {
                            final SubLObject var16_103 = Threads.$is_thread_performing_cleanupP$.currentBinding(var99);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0432.T, var99);
                                module0103.f7397(var103);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var16_103, var99);
                            }
                        }
                    }
                    catch (Throwable var104) {
                        Errors.handleThrowable(var104, (SubLObject)module0432.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var102, var99);
                }
            }
            catch (Throwable var105) {
                var101 = Errors.handleThrowable(var105, (SubLObject)module0432.$ic71$);
            }
            finally {
                var99.throwStack.pop();
            }
        }
        else {
            SubLObject var106 = module0055.f4071(module0432.$g3512$.getGlobalValue());
            SubLObject var107 = (SubLObject)module0432.NIL;
            var107 = var106.first();
            while (module0432.NIL != var106) {
                if (module0432.NIL == Sequences.find_if((SubLObject)module0432.$ic74$, var107, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED)) {
                    var100 = (SubLObject)ConsesLow.cons(f30497(var107), var100);
                }
                var106 = var106.rest();
                var107 = var106.first();
            }
        }
        SubLObject var109;
        final SubLObject var108 = var109 = ConsesLow.append(f30498(var97, var98), var100);
        SubLObject var110 = (SubLObject)module0432.NIL;
        var110 = var109.first();
        while (module0432.NIL != var109) {
            module0036.f2532(var110, (SubLObject)module0432.$ic74$, Symbols.symbol_function((SubLObject)module0432.$ic75$), (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
            var109 = var109.rest();
            var110 = var109.first();
        }
        return Sequences.delete_duplicates(var108, Symbols.symbol_function((SubLObject)module0432.EQUAL), (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
    }
    
    public static SubLObject f30478() {
        while (module0432.NIL == module0055.f4061(module0432.$g3512$.getGlobalValue())) {
            module0055.f4068(module0432.$g3512$.getGlobalValue(), (SubLObject)module0432.UNPROVIDED);
        }
        return module0432.$g3512$.getGlobalValue();
    }
    
    public static SubLObject f30497(final SubLObject var106) {
        SubLObject var107 = (SubLObject)module0432.NIL;
        final SubLObject var108 = f30499(var106);
        final SubLObject var109 = f30500(var106);
        final SubLObject var110 = module0612.f37426(var109);
        final SubLObject var111 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(Time.decode_universal_time(var109, (SubLObject)module0432.UNPROVIDED)));
        final SubLObject var112 = f30501(var106);
        var107 = conses_high.putf(var107, (SubLObject)module0432.$ic76$, f30502(var106));
        var107 = conses_high.putf(var107, (SubLObject)module0432.$ic77$, var108);
        var107 = conses_high.putf(var107, (SubLObject)module0432.$ic78$, module0423.f29571(var108).first());
        var107 = conses_high.putf(var107, (SubLObject)module0432.$ic79$, var109);
        var107 = conses_high.putf(var107, (SubLObject)module0432.$ic80$, Numbers.subtract(var109, module0432.$g3514$.getGlobalValue()));
        var107 = conses_high.putf(var107, (SubLObject)module0432.$ic81$, var110);
        var107 = conses_high.putf(var107, (SubLObject)module0432.$ic82$, var111);
        if (module0432.NIL != module0259.f16891(var112, module0432.$ic63$)) {
            var107 = conses_high.putf(var107, (SubLObject)module0432.$ic83$, (SubLObject)module0432.T);
            var107 = conses_high.putf(var107, (SubLObject)module0432.$ic84$, f30491(var112));
            var107 = conses_high.putf(var107, (SubLObject)module0432.$ic85$, var112);
            var107 = conses_high.putf(var107, (SubLObject)module0432.$ic86$, module0220.f14556(var112, module0432.$ic12$, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED));
        }
        else {
            var107 = conses_high.putf(var107, (SubLObject)module0432.$ic83$, (SubLObject)module0432.NIL);
            var107 = conses_high.putf(var107, (SubLObject)module0432.$ic87$, var112);
            var107 = conses_high.putf(var107, (SubLObject)module0432.$ic84$, module0220.f14556(var112, module0432.$ic23$, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED));
        }
        if (module0432.NIL != module0220.f14547(var112, module0432.$ic88$, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED)) {
            final SubLObject var113 = module0220.f14556(var112, module0432.$ic88$, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
            final SubLObject var114 = module0220.f14556(var113, module0432.$ic89$, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
            var107 = conses_high.putf(var107, (SubLObject)module0432.$ic90$, var113);
            var107 = conses_high.putf(var107, (SubLObject)module0432.$ic91$, var114);
            var107 = conses_high.putf(var107, (SubLObject)module0432.$ic92$, module0770.f49049(var114, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED));
        }
        return var107;
    }
    
    public static SubLObject f30502(final SubLObject var106) {
        final SubLObject var107 = Guids.guid_to_string(Guids.new_guid());
        module0067.f4886(module0432.$g3515$.getGlobalValue(), var107, var106);
        return var107;
    }
    
    public static SubLObject f30503(final SubLObject var113) {
        return module0067.f4885(module0432.$g3515$.getGlobalValue(), var113, (SubLObject)module0432.UNPROVIDED);
    }
    
    public static SubLObject f30504(final SubLObject var114) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var114.isList() && module0432.NIL != module0035.f1995(var114, (SubLObject)module0432.THREE_INTEGER, (SubLObject)module0432.UNPROVIDED));
    }
    
    public static SubLObject f30499(final SubLObject var106) {
        assert module0432.NIL != f30504(var106) : var106;
        return var106.first();
    }
    
    public static SubLObject f30500(final SubLObject var106) {
        assert module0432.NIL != f30504(var106) : var106;
        return conses_high.second(var106);
    }
    
    public static SubLObject f30501(final SubLObject var106) {
        assert module0432.NIL != f30504(var106) : var106;
        return conses_high.third(var106);
    }
    
    public static SubLObject f30505(final SubLObject var108, final SubLObject var115, final SubLObject var82) {
        assert module0432.NIL != module0173.f10955(var108) : var108;
        assert module0432.NIL != module0051.f3549(var115) : var115;
        assert module0432.NIL != module0173.f10955(var82) : var82;
        return (SubLObject)ConsesLow.list(var108, var115, var82);
    }
    
    public static SubLObject f30489(final SubLObject var116) {
        SubLObject var117 = (SubLObject)module0432.NIL;
        final SubLObject var118 = module0432.$g3513$.getGlobalValue();
        SubLObject var119 = (SubLObject)module0432.NIL;
        try {
            var119 = Locks.seize_lock(var118);
            while (module0432.NIL == module0055.f4061(module0432.$g3512$.getGlobalValue())) {
                final SubLObject var120 = module0055.f4068(module0432.$g3512$.getGlobalValue(), (SubLObject)module0432.UNPROVIDED);
                if (!var116.equal(f30501(var120))) {
                    var117 = (SubLObject)ConsesLow.cons(var120, var117);
                }
            }
            SubLObject var121 = var117;
            SubLObject var122 = (SubLObject)module0432.NIL;
            var122 = var121.first();
            while (module0432.NIL != var121) {
                module0055.f4067(var122, module0432.$g3512$.getGlobalValue());
                var121 = var121.rest();
                var122 = var121.first();
            }
        }
        finally {
            if (module0432.NIL != var119) {
                Locks.release_lock(var118);
            }
        }
        return module0432.$g3512$.getGlobalValue();
    }
    
    public static SubLObject f30506(final SubLObject var121) {
        SubLObject var122 = (SubLObject)module0432.NIL;
        final SubLObject var123 = module0432.$g3513$.getGlobalValue();
        SubLObject var124 = (SubLObject)module0432.NIL;
        try {
            var124 = Locks.seize_lock(var123);
            if (module0432.NIL == module0055.f4072(var121, module0432.$g3512$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0432.EQUAL), (SubLObject)module0432.UNPROVIDED)) {
                var122 = module0055.f4067(var121, module0432.$g3512$.getGlobalValue());
            }
        }
        finally {
            if (module0432.NIL != var124) {
                Locks.release_lock(var123);
            }
        }
        return var122;
    }
    
    public static SubLObject f30507() {
        SubLObject var3 = (SubLObject)module0432.NIL;
        final SubLObject var4 = module0432.$g3513$.getGlobalValue();
        SubLObject var5 = (SubLObject)module0432.NIL;
        try {
            var5 = Locks.seize_lock(var4);
            var3 = module0055.f4068(module0432.$g3512$.getGlobalValue(), (SubLObject)module0432.UNPROVIDED);
            f30508(f30499(var3));
        }
        finally {
            if (module0432.NIL != var5) {
                Locks.release_lock(var4);
            }
        }
        return var3;
    }
    
    public static SubLObject f30509() {
        SubLObject var3 = (SubLObject)module0432.NIL;
        final SubLObject var4 = module0432.$g3513$.getGlobalValue();
        SubLObject var5 = (SubLObject)module0432.NIL;
        try {
            var5 = Locks.seize_lock(var4);
            var3 = module0055.f4063(module0432.$g3512$.getGlobalValue());
        }
        finally {
            if (module0432.NIL != var5) {
                Locks.release_lock(var4);
            }
        }
        return var3;
    }
    
    public static SubLObject f30510() {
        final SubLObject var128 = module0432.$g3513$.getGlobalValue();
        SubLObject var129 = (SubLObject)module0432.NIL;
        try {
            var129 = Locks.seize_lock(var128);
            f30478();
            SubLObject var130 = module0423.f29608(module0432.$ic98$, (SubLObject)module0432.UNPROVIDED);
            SubLObject var131 = (SubLObject)module0432.NIL;
            var131 = var130.first();
            while (module0432.NIL != var130) {
                SubLObject var133;
                final SubLObject var132 = var133 = var131;
                SubLObject var134 = (SubLObject)module0432.NIL;
                SubLObject var135 = (SubLObject)module0432.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var133, var132, (SubLObject)module0432.$ic97$);
                var134 = var133.first();
                var133 = var133.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var133, var132, (SubLObject)module0432.$ic97$);
                var135 = var133.first();
                var133 = var133.rest();
                if (module0432.NIL == var133) {
                    f30511(var135, var134, (SubLObject)module0432.UNPROVIDED);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var132, (SubLObject)module0432.$ic97$);
                }
                var130 = var130.rest();
                var131 = var130.first();
            }
            var130 = module0423.f29608(module0432.$ic100$, (SubLObject)module0432.UNPROVIDED);
            var131 = (SubLObject)module0432.NIL;
            var131 = var130.first();
            while (module0432.NIL != var130) {
                SubLObject var137;
                final SubLObject var136 = var137 = var131;
                SubLObject var138 = (SubLObject)module0432.NIL;
                SubLObject var135 = (SubLObject)module0432.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var137, var136, (SubLObject)module0432.$ic99$);
                var138 = var137.first();
                var137 = var137.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var137, var136, (SubLObject)module0432.$ic99$);
                var135 = var137.first();
                var137 = var137.rest();
                if (module0432.NIL == var137) {
                    f30511(var135, var138, (SubLObject)module0432.UNPROVIDED);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var136, (SubLObject)module0432.$ic99$);
                }
                var130 = var130.rest();
                var131 = var130.first();
            }
        }
        finally {
            if (module0432.NIL != var129) {
                Locks.release_lock(var128);
            }
        }
        return module0432.$g3512$.getGlobalValue();
    }
    
    public static SubLObject f30511(final SubLObject var108, final SubLObject var82, SubLObject var135) {
        if (var135 == module0432.UNPROVIDED) {
            var135 = (SubLObject)module0432.NIL;
        }
        final SubLObject var136 = f30512(var82, var135);
        if (module0432.NIL != module0051.f3549(var136)) {
            final SubLObject var137 = f30505(var108, var136, var82);
            f30506(var137);
        }
        return var136;
    }
    
    public static SubLObject f30513(final SubLObject var137, final SubLObject var138) {
        if (module0432.NIL != f30514()) {
            f30515();
            final SubLObject var139 = module0178.f11334(var138);
            final SubLObject var140 = f30516(var139);
            if (module0432.NIL != var140) {
                f30511(var140, var139, (SubLObject)module0432.UNPROVIDED);
            }
        }
        return (SubLObject)module0432.NIL;
    }
    
    public static SubLObject f30512(final SubLObject var82, final SubLObject var135) {
        final SubLObject var136 = f30495(var82, var135);
        return (SubLObject)((module0432.NIL != var136 && module0432.NIL == module0612.f37487(var136, module0612.f37450(module0612.f37527(), (SubLObject)module0432.$ic102$))) ? module0612.f37427(var136) : module0432.NIL);
    }
    
    public static SubLObject f30495(final SubLObject var82, final SubLObject var135) {
        return (module0432.NIL != module0259.f16891(var82, module0432.$ic63$)) ? f30517(var82, var135) : f30518(var82);
    }
    
    public static SubLObject f30517(final SubLObject var28, final SubLObject var135) {
        final SubLObject var136 = (module0432.NIL != var135) ? module0432.$ic103$ : module0432.$ic104$;
        final SubLObject var137 = module0595.f36374(var136, var28, (SubLObject)module0432.UNPROVIDED).first();
        return var137;
    }
    
    public static SubLObject f30518(final SubLObject var33) {
        final SubLObject var34 = module0595.f36374(module0432.$ic105$, var33, (SubLObject)module0432.UNPROVIDED).first();
        return var34;
    }
    
    public static SubLObject f30516(final SubLObject var82) {
        return module0595.f36374(module0432.$ic106$, var82, (SubLObject)module0432.UNPROVIDED).first();
    }
    
    public static SubLObject f30498(SubLObject var97, SubLObject var98) {
        if (var97 == module0432.UNPROVIDED) {
            var97 = (SubLObject)module0432.NIL;
        }
        if (var98 == module0432.UNPROVIDED) {
            var98 = (SubLObject)module0432.NIL;
        }
        final SubLThread var99 = SubLProcess.currentSubLThread();
        SubLObject var100 = (SubLObject)module0432.NIL;
        if (module0432.NIL != var97 && module0432.NIL != var98) {
            SubLObject var101 = (SubLObject)module0432.NIL;
            try {
                var99.throwStack.push(module0432.$ic71$);
                final SubLObject var102 = Errors.$error_handler$.currentBinding(var99);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0432.$ic72$), var99);
                    try {
                        final SubLObject var103 = module0103.f7393(module0103.f7380(var97, var98, (SubLObject)module0432.UNPROVIDED));
                        try {
                            module0103.f7394(var103);
                            final SubLObject var16_140 = module0103.$g1343$.currentBinding(var99);
                            try {
                                module0103.$g1343$.bind(var103, var99);
                                var100 = f30519();
                            }
                            finally {
                                module0103.$g1343$.rebind(var16_140, var99);
                            }
                        }
                        finally {
                            final SubLObject var16_141 = Threads.$is_thread_performing_cleanupP$.currentBinding(var99);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0432.T, var99);
                                module0103.f7397(var103);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var16_141, var99);
                            }
                        }
                    }
                    catch (Throwable var104) {
                        Errors.handleThrowable(var104, (SubLObject)module0432.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var102, var99);
                }
            }
            catch (Throwable var105) {
                var101 = Errors.handleThrowable(var105, (SubLObject)module0432.$ic71$);
            }
            finally {
                var99.throwStack.pop();
            }
        }
        else {
            var100 = f30519();
        }
        return var100;
    }
    
    public static SubLObject f30519() {
        SubLObject var53 = (SubLObject)module0432.NIL;
        SubLObject var54 = module0432.$g3519$.getGlobalValue();
        SubLObject var55 = (SubLObject)module0432.NIL;
        var55 = var54.first();
        while (module0432.NIL != var54) {
            SubLObject var57;
            final SubLObject var56 = var57 = var55;
            SubLObject var58 = (SubLObject)module0432.NIL;
            SubLObject var59 = (SubLObject)module0432.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)module0432.$ic110$);
            var58 = var57.first();
            var57 = (var59 = var57.rest());
            if (module0432.NIL != module0361.f24109(var59)) {
                SubLObject var60 = f30497(var58);
                var60 = conses_high.putf(var60, (SubLObject)module0432.$ic111$, module0361.f23996(var59));
                var60 = conses_high.putf(var60, (SubLObject)module0432.$ic112$, f30520(var59));
                var53 = (SubLObject)ConsesLow.cons(var60, var53);
            }
            var54 = var54.rest();
            var55 = var54.first();
        }
        return var53;
    }
    
    public static SubLObject f30520(final SubLObject var60) {
        SubLObject var61 = (SubLObject)module0432.NIL;
        final SubLObject var62 = module0361.f24123(var60);
        if (module0432.NIL == module0065.f4772(var62, (SubLObject)module0432.$ic113$)) {
            final SubLObject var146_147 = var62;
            if (module0432.NIL == module0065.f4775(var146_147, (SubLObject)module0432.$ic113$)) {
                final SubLObject var63 = module0065.f4740(var146_147);
                final SubLObject var64 = (SubLObject)module0432.NIL;
                SubLObject var65;
                SubLObject var66;
                SubLObject var67;
                SubLObject var68;
                for (var65 = Sequences.length(var63), var66 = (SubLObject)module0432.NIL, var66 = (SubLObject)module0432.ZERO_INTEGER; var66.numL(var65); var66 = Numbers.add(var66, (SubLObject)module0432.ONE_INTEGER)) {
                    var67 = ((module0432.NIL != var64) ? Numbers.subtract(var65, var66, (SubLObject)module0432.ONE_INTEGER) : var66);
                    var68 = Vectors.aref(var63, var67);
                    if (module0432.NIL == module0065.f4749(var68) || module0432.NIL == module0065.f4773((SubLObject)module0432.$ic113$)) {
                        if (module0432.NIL != module0065.f4749(var68)) {
                            var68 = (SubLObject)module0432.$ic113$;
                        }
                        var61 = (SubLObject)ConsesLow.cons(f30521(var68), var61);
                    }
                }
            }
            final SubLObject var153_154 = var62;
            if (module0432.NIL == module0065.f4777(var153_154)) {
                final SubLObject var69 = module0065.f4738(var153_154);
                SubLObject var70 = (SubLObject)module0432.NIL;
                SubLObject var71 = (SubLObject)module0432.NIL;
                final Iterator var72 = Hashtables.getEntrySetIterator(var69);
                try {
                    while (Hashtables.iteratorHasNext(var72)) {
                        final Map.Entry var73 = Hashtables.iteratorNextEntry(var72);
                        var70 = Hashtables.getEntryKey(var73);
                        var71 = Hashtables.getEntryValue(var73);
                        var61 = (SubLObject)ConsesLow.cons(f30521(var71), var61);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var72);
                }
            }
        }
        return var61;
    }
    
    public static SubLObject f30521(final SubLObject var54) {
        SubLObject var55 = (SubLObject)ConsesLow.list((SubLObject)module0432.$ic114$, module0369.f25422(var54));
        var55 = conses_high.putf(var55, (SubLObject)module0432.$ic115$, module0369.f25702(var54, (SubLObject)module0432.UNPROVIDED));
        var55 = conses_high.putf(var55, (SubLObject)module0432.$ic50$, module0369.f25653(var54));
        var55 = conses_high.putf(var55, (SubLObject)module0432.$ic116$, module0369.f25420(var54));
        return var55;
    }
    
    public static SubLObject f30522(final SubLObject var113, SubLObject var97, SubLObject var98) {
        if (var97 == module0432.UNPROVIDED) {
            var97 = (SubLObject)module0432.NIL;
        }
        if (var98 == module0432.UNPROVIDED) {
            var98 = (SubLObject)module0432.NIL;
        }
        final SubLThread var114 = SubLProcess.currentSubLThread();
        if (module0432.NIL != var97 && module0432.NIL != var98) {
            SubLObject var115 = (SubLObject)module0432.NIL;
            try {
                var114.throwStack.push(module0432.$ic71$);
                final SubLObject var116 = Errors.$error_handler$.currentBinding(var114);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0432.$ic72$), var114);
                    try {
                        final SubLObject var117 = module0103.f7393(module0103.f7380(var97, var98, (SubLObject)module0432.UNPROVIDED));
                        try {
                            module0103.f7394(var117);
                            final SubLObject var16_159 = module0103.$g1343$.currentBinding(var114);
                            try {
                                module0103.$g1343$.bind(var117, var114);
                                f30522(var113, (SubLObject)module0432.NIL, (SubLObject)module0432.NIL);
                            }
                            finally {
                                module0103.$g1343$.rebind(var16_159, var114);
                            }
                        }
                        finally {
                            final SubLObject var16_160 = Threads.$is_thread_performing_cleanupP$.currentBinding(var114);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0432.T, var114);
                                module0103.f7397(var117);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var16_160, var114);
                            }
                        }
                    }
                    catch (Throwable var118) {
                        Errors.handleThrowable(var118, (SubLObject)module0432.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var116, var114);
                }
            }
            catch (Throwable var119) {
                var115 = Errors.handleThrowable(var119, (SubLObject)module0432.$ic71$);
            }
            finally {
                var114.throwStack.pop();
            }
        }
        else {
            final SubLObject var120 = f30503(var113);
            if (module0432.NIL != var120) {
                f30523(var120);
            }
        }
        return (SubLObject)module0432.NIL;
    }
    
    public static SubLObject f30524() {
        SubLObject var10 = module0432.$g3519$.getGlobalValue();
        SubLObject var11 = (SubLObject)module0432.NIL;
        var11 = var10.first();
        while (module0432.NIL != var10) {
            SubLObject var13;
            final SubLObject var12 = var13 = var11;
            SubLObject var14 = (SubLObject)module0432.NIL;
            SubLObject var15 = (SubLObject)module0432.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0432.$ic110$);
            var14 = var13.first();
            var13 = (var15 = var13.rest());
            f30523(var14);
            var10 = var10.rest();
            var11 = var10.first();
        }
        return (SubLObject)module0432.NIL;
    }
    
    public static SubLObject f30523(final SubLObject var23) {
        module0432.$g3520$.setGlobalValue((SubLObject)ConsesLow.cons(var23, module0432.$g3520$.getGlobalValue()));
        final SubLObject var24 = module0035.f2294(module0432.$g3519$.getGlobalValue(), var23, Symbols.symbol_function((SubLObject)module0432.EQUAL), (SubLObject)module0432.UNPROVIDED);
        if (module0432.NIL != var24) {
            final SubLObject var25 = module0361.f24123(var24);
            if (module0432.NIL == module0065.f4772(var25, (SubLObject)module0432.$ic113$)) {
                final SubLObject var146_163 = var25;
                if (module0432.NIL == module0065.f4775(var146_163, (SubLObject)module0432.$ic113$)) {
                    final SubLObject var26 = module0065.f4740(var146_163);
                    final SubLObject var27 = (SubLObject)module0432.NIL;
                    SubLObject var28;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var31;
                    for (var28 = Sequences.length(var26), var29 = (SubLObject)module0432.NIL, var29 = (SubLObject)module0432.ZERO_INTEGER; var29.numL(var28); var29 = Numbers.add(var29, (SubLObject)module0432.ONE_INTEGER)) {
                        var30 = ((module0432.NIL != var27) ? Numbers.subtract(var28, var29, (SubLObject)module0432.ONE_INTEGER) : var29);
                        var31 = Vectors.aref(var26, var30);
                        if (module0432.NIL == module0065.f4749(var31) || module0432.NIL == module0065.f4773((SubLObject)module0432.$ic113$)) {
                            if (module0432.NIL != module0065.f4749(var31)) {
                                var31 = (SubLObject)module0432.$ic113$;
                            }
                            module0408.f28440(var31);
                        }
                    }
                }
                final SubLObject var153_164 = var25;
                if (module0432.NIL == module0065.f4777(var153_164)) {
                    final SubLObject var32 = module0065.f4738(var153_164);
                    SubLObject var33 = (SubLObject)module0432.NIL;
                    SubLObject var34 = (SubLObject)module0432.NIL;
                    final Iterator var35 = Hashtables.getEntrySetIterator(var32);
                    try {
                        while (Hashtables.iteratorHasNext(var35)) {
                            final Map.Entry var36 = Hashtables.iteratorNextEntry(var35);
                            var33 = Hashtables.getEntryKey(var36);
                            var34 = Hashtables.getEntryValue(var36);
                            module0408.f28440(var34);
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var35);
                    }
                }
            }
        }
        SubLObject var37 = (SubLObject)module0432.NIL;
        final SubLObject var38 = module0432.$g3513$.getGlobalValue();
        SubLObject var39 = (SubLObject)module0432.NIL;
        try {
            var39 = Locks.seize_lock(var38);
            while (module0432.NIL == module0055.f4061(module0432.$g3512$.getGlobalValue())) {
                final SubLObject var40 = module0055.f4068(module0432.$g3512$.getGlobalValue(), (SubLObject)module0432.UNPROVIDED);
                if (!var23.equal(var40)) {
                    var37 = (SubLObject)ConsesLow.cons(var40, var37);
                }
            }
            SubLObject var41 = var37;
            SubLObject var42 = (SubLObject)module0432.NIL;
            var42 = var41.first();
            while (module0432.NIL != var41) {
                module0055.f4067(var42, module0432.$g3512$.getGlobalValue());
                var41 = var41.rest();
                var42 = var41.first();
            }
        }
        finally {
            if (module0432.NIL != var39) {
                Locks.release_lock(var38);
            }
        }
        return (SubLObject)module0432.NIL;
    }
    
    public static SubLObject f30525(final SubLObject var23) {
        return module0004.f104(var23, module0432.$g3520$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0432.EQUAL), (SubLObject)module0432.UNPROVIDED);
    }
    
    public static SubLObject f30508(final SubLObject var108) {
        module0432.$g3516$.setGlobalValue((SubLObject)ConsesLow.cons(var108, module0432.$g3516$.getGlobalValue()));
        return module0432.$g3516$.getGlobalValue();
    }
    
    public static SubLObject f30526(final SubLObject var108) {
        module0432.$g3516$.setGlobalValue(Sequences.remove(var108, module0432.$g3516$.getGlobalValue(), (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED));
        module0432.$g3519$.setGlobalValue(module0035.remove_if_not((SubLObject)module0432.$ic119$, module0432.$g3519$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0432.$ic120$), (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED));
        module0432.$g3517$.setGlobalValue((SubLObject)ConsesLow.cons(var108, module0432.$g3517$.getGlobalValue()));
        return module0432.$g3516$.getGlobalValue();
    }
    
    public static SubLObject f30527(final SubLObject var108) {
        SubLObject var109 = (SubLObject)module0432.NIL;
        final SubLObject var110 = module0432.$g3513$.getGlobalValue();
        SubLObject var111 = (SubLObject)module0432.NIL;
        try {
            var111 = Locks.seize_lock(var110);
            var109 = module0004.f104(var108, module0432.$g3516$.getGlobalValue(), (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
        }
        finally {
            if (module0432.NIL != var111) {
                Locks.release_lock(var110);
            }
        }
        return var109;
    }
    
    public static SubLObject f30528(final SubLObject var121) {
        final SubLThread var122 = SubLProcess.currentSubLThread();
        SubLObject var123 = (SubLObject)module0432.NIL;
        if (module0432.NIL != var121) {
            SubLObject var124 = (SubLObject)module0432.NIL;
            try {
                var122.throwStack.push(module0432.$ic71$);
                final SubLObject var125 = Errors.$error_handler$.currentBinding(var122);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0432.$ic72$), var122);
                    try {
                        final SubLObject var126 = f30499(var121);
                        final SubLObject var127 = f30501(var121);
                        if (module0432.NIL != module0173.f10969(var127)) {
                            final SubLObject var16_171 = module0111.$g1405$.currentBinding(var122);
                            try {
                                module0111.$g1405$.bind((SubLObject)module0432.NIL, var122);
                                module0574.f35153(module0432.$ic13$);
                                if (module0432.NIL == f30525(var121)) {
                                    try {
                                        final SubLObject var128 = module0035.f2329(module0423.f29573(var126), (SubLObject)module0432.$ic121$);
                                        SubLObject var129 = (SubLObject)module0432.NIL;
                                        try {
                                            var129 = module0361.f24136(var128);
                                            module0432.$g3519$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var121, var129), module0432.$g3519$.getGlobalValue()));
                                            var123 = f30529(var121, var129);
                                        }
                                        finally {
                                            final SubLObject var16_172 = Threads.$is_thread_performing_cleanupP$.currentBinding(var122);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0432.T, var122);
                                                module0361.f24005(var129);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var16_172, var122);
                                            }
                                        }
                                    }
                                    finally {
                                        final SubLObject var16_173 = Threads.$is_thread_performing_cleanupP$.currentBinding(var122);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0432.T, var122);
                                            f30526(var126);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var16_173, var122);
                                        }
                                    }
                                }
                                if (module0432.NIL == var123 || module0432.NIL != module0259.f16891(var127, module0432.$ic63$)) {
                                    f30511(var126, var127, (SubLObject)module0432.T);
                                }
                                else {
                                    f30530(var127);
                                }
                            }
                            finally {
                                module0111.$g1405$.rebind(var16_171, var122);
                            }
                        }
                    }
                    catch (Throwable var130) {
                        Errors.handleThrowable(var130, (SubLObject)module0432.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var125, var122);
                }
            }
            catch (Throwable var131) {
                var124 = Errors.handleThrowable(var131, (SubLObject)module0432.$ic71$);
            }
            finally {
                var122.throwStack.pop();
            }
        }
        return var123;
    }
    
    public static SubLObject f30530(final SubLObject var33) {
        final SubLObject var34 = module0432.$g3521$.getGlobalValue();
        SubLObject var35 = (SubLObject)module0432.NIL;
        try {
            var35 = Locks.seize_lock(var34);
            if (module0432.NIL != module0173.f10969(var33)) {
                module0543.f33626(var33);
            }
        }
        finally {
            if (module0432.NIL != var35) {
                Locks.release_lock(var34);
            }
        }
        return var33;
    }
    
    public static SubLObject f30529(final SubLObject var121, final SubLObject var173) {
        final SubLObject var174 = f30499(var121);
        final SubLObject var175 = f30501(var121);
        SubLObject var176 = (SubLObject)module0432.NIL;
        final SubLObject var177 = f30531(var174, var173);
        final SubLObject var178 = f30532(var173);
        if (module0432.NIL != var177) {
            module0415.f29011(var173, var178, (SubLObject)module0432.UNPROVIDED);
            final SubLObject var179 = module0226.f15152(var175);
            final SubLObject var180 = (module0432.NIL != var179) ? var179 : module0432.$g3522$.getGlobalValue();
            final SubLObject var181 = module0411.f28629(var177);
            module0543.f33631((SubLObject)ConsesLow.list(module0432.$ic47$, module0411.f28627(var173), var178), var180, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
            module0411.f28633(var173, var180, (SubLObject)module0432.UNPROVIDED);
            module0411.f28634(var177, var180, (SubLObject)module0432.UNPROVIDED);
            module0543.f33631((SubLObject)ConsesLow.list(module0432.$ic44$, var174, var181), var180, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
            if (module0432.NIL != module0259.f16891(var175, module0432.$ic63$)) {
                module0543.f33631((SubLObject)ConsesLow.list(module0432.$ic123$, f30533(var175, var179), var181), var180, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
            }
            f30534(var175, var177);
            var176 = (SubLObject)module0432.T;
        }
        return var176;
    }
    
    public static SubLObject f30535(final SubLObject var181) {
        if (var181.eql((SubLObject)Characters.CHAR_comma)) {
            return (SubLObject)module0432.$ic124$;
        }
        if (var181.eql((SubLObject)Characters.CHAR_tab)) {
            return (SubLObject)module0432.$ic125$;
        }
        return (SubLObject)module0432.$ic126$;
    }
    
    public static SubLObject f30536(final SubLObject var183) {
        final SubLThread var184 = SubLProcess.currentSubLThread();
        SubLObject var185 = (SubLObject)module0432.NIL;
        final SubLObject var186 = module0147.$g2094$.currentBinding(var184);
        final SubLObject var187 = module0147.$g2095$.currentBinding(var184);
        try {
            module0147.$g2094$.bind((SubLObject)module0432.$ic37$, var184);
            module0147.$g2095$.bind(module0432.$ic38$, var184);
            if (module0432.NIL == var185) {
                SubLObject var188 = (SubLObject)module0432.$ic128$;
                SubLObject var189 = (SubLObject)module0432.NIL;
                var189 = var188.first();
                while (module0432.NIL == var185 && module0432.NIL != var188) {
                    SubLObject var190 = (SubLObject)module0432.NIL;
                    final SubLObject var191 = var189;
                    if (module0432.NIL != module0158.f10010(var183, (SubLObject)module0432.NIL, var191)) {
                        final SubLObject var192 = module0158.f10011(var183, (SubLObject)module0432.NIL, var191);
                        SubLObject var193 = (SubLObject)module0432.NIL;
                        final SubLObject var194 = (SubLObject)module0432.NIL;
                        while (module0432.NIL == var193) {
                            final SubLObject var195 = module0052.f3695(var192, var194);
                            final SubLObject var196 = (SubLObject)SubLObjectFactory.makeBoolean(!var194.eql(var195));
                            if (module0432.NIL != var196) {
                                SubLObject var197 = (SubLObject)module0432.NIL;
                                try {
                                    var197 = module0158.f10316(var195, (SubLObject)module0432.$ic39$, (SubLObject)module0432.$ic127$, (SubLObject)module0432.NIL);
                                    SubLObject var40_186 = (SubLObject)module0432.NIL;
                                    final SubLObject var41_187 = (SubLObject)module0432.NIL;
                                    while (module0432.NIL == var40_186) {
                                        final SubLObject var198 = module0052.f3695(var197, var41_187);
                                        final SubLObject var43_188 = (SubLObject)SubLObjectFactory.makeBoolean(!var41_187.eql(var198));
                                        if (module0432.NIL != var43_188) {
                                            var190 = module0178.f11331(var198, (SubLObject)module0432.TWO_INTEGER);
                                            if (module0432.NIL != module0035.f1995(var190, (SubLObject)module0432.ONE_INTEGER, (SubLObject)module0432.UNPROVIDED)) {
                                                var185 = module0038.f2636(var190);
                                            }
                                        }
                                        var40_186 = (SubLObject)SubLObjectFactory.makeBoolean(module0432.NIL == var43_188);
                                    }
                                }
                                finally {
                                    final SubLObject var16_189 = Threads.$is_thread_performing_cleanupP$.currentBinding(var184);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0432.T, var184);
                                        if (module0432.NIL != var197) {
                                            module0158.f10319(var197);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var16_189, var184);
                                    }
                                }
                            }
                            var193 = (SubLObject)SubLObjectFactory.makeBoolean(module0432.NIL == var196);
                        }
                    }
                    var188 = var188.rest();
                    var189 = var188.first();
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var187, var184);
            module0147.$g2094$.rebind(var186, var184);
        }
        return var185;
    }
    
    public static SubLObject f30534(final SubLObject var82, final SubLObject var54) {
        final SubLObject var83 = f30537(var82);
        final SubLObject var84 = f30538(var82);
        final SubLObject var85 = module0220.f14556(var82, module0432.$ic23$, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
        if (module0432.NIL != var85 && module0432.NIL != module0035.f2013(var83)) {
            f30539(var82, var54, var83, var84, var85);
        }
        return (SubLObject)module0432.NIL;
    }
    
    public static SubLObject f30484() {
        return module0166.f10747((SubLObject)module0432.$ic129$);
    }
    
    public static SubLObject f30537(final SubLObject var82) {
        return module0220.f14565(var82, f30484(), (SubLObject)module0432.ONE_INTEGER, (SubLObject)module0432.TWO_INTEGER, (SubLObject)module0432.UNPROVIDED);
    }
    
    public static SubLObject f30538(final SubLObject var82) {
        return module0220.f14565(var82, module0432.$ic9$, (SubLObject)module0432.ONE_INTEGER, (SubLObject)module0432.TWO_INTEGER, (SubLObject)module0432.UNPROVIDED);
    }
    
    public static SubLObject f30540(final SubLObject var82, final SubLObject var54) {
        final SubLObject var83 = module0595.f36374(module0432.$ic131$, var82, (SubLObject)module0432.UNPROVIDED).first();
        final SubLObject var84 = module0595.f36374(module0432.$ic132$, var82, (SubLObject)module0432.UNPROVIDED).first();
        final SubLObject var85 = module0770.f49067(module0202.f12644(var84), (SubLObject)module0432.$ic133$, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
        final SubLObject var86 = module0369.f25653(var54);
        SubLObject var87 = (SubLObject)module0432.NIL;
        SubLObject var88 = (SubLObject)module0432.NIL;
        try {
            var88 = streams_high.make_private_string_output_stream();
            PrintLow.format(var88, module0432.$g3523$.getGlobalValue(), new SubLObject[] { var83, module0209.f13552(var85), var86 });
            streams_high.terpri(var88);
            module0574.f35220(var88);
            var87 = streams_high.get_output_stream_string(var88);
        }
        finally {
            final SubLObject var89 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0432.T);
                streams_high.close(var88, (SubLObject)module0432.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var89);
            }
        }
        return var87;
    }
    
    public static SubLObject f30541(final SubLObject var82, final SubLObject var54) {
        final SubLObject var83 = module0595.f36374(module0432.$ic131$, var82, (SubLObject)module0432.UNPROVIDED).first();
        final SubLObject var84 = module0369.f25653(var54);
        return Sequences.cconcatenate((SubLObject)module0432.$ic134$, new SubLObject[] { module0006.f207(var84), module0432.$ic135$, module0006.f205(var83) });
    }
    
    public static SubLObject f30542(final SubLObject var181) {
        if (var181.eql((SubLObject)Characters.CHAR_tab)) {
            return (SubLObject)module0432.$ic136$;
        }
        if (var181.eql((SubLObject)Characters.CHAR_comma)) {
            return (SubLObject)module0432.$ic137$;
        }
        return (SubLObject)module0432.$ic138$;
    }
    
    public static SubLObject f30543(final SubLObject var196, final SubLObject var169, final SubLObject var197) {
        final SubLObject var198 = Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("S#33717", "CYC"), var197);
        return (SubLObject)((module0432.NIL != var169 && var198.isZero()) ? module0432.$ic139$ : Sequences.cconcatenate((SubLObject)module0432.$ic140$, new SubLObject[] { module0006.f207(var198), module0432.$ic141$ }));
    }
    
    public static SubLObject f30544(final SubLObject var199, final SubLObject var200) {
        SubLObject var202;
        final SubLObject var201 = var202 = var199.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var202, var201, (SubLObject)module0432.$ic142$);
        final SubLObject var203 = var202.rest();
        var202 = var202.first();
        SubLObject var204 = (SubLObject)module0432.NIL;
        SubLObject var205 = (SubLObject)module0432.NIL;
        SubLObject var206 = (SubLObject)module0432.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var202, var201, (SubLObject)module0432.$ic142$);
        var204 = var202.first();
        var202 = var202.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var202, var201, (SubLObject)module0432.$ic142$);
        var205 = var202.first();
        var202 = var202.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var202, var201, (SubLObject)module0432.$ic142$);
        var206 = var202.first();
        var202 = var202.rest();
        SubLObject var207 = (SubLObject)module0432.NIL;
        SubLObject var208 = var202;
        SubLObject var209 = (SubLObject)module0432.NIL;
        SubLObject var208_209 = (SubLObject)module0432.NIL;
        while (module0432.NIL != var208) {
            cdestructuring_bind.destructuring_bind_must_consp(var208, var201, (SubLObject)module0432.$ic142$);
            var208_209 = var208.first();
            var208 = var208.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var208, var201, (SubLObject)module0432.$ic142$);
            if (module0432.NIL == conses_high.member(var208_209, (SubLObject)module0432.$ic143$, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED)) {
                var209 = (SubLObject)module0432.T;
            }
            if (var208_209 == module0432.$ic144$) {
                var207 = var208.first();
            }
            var208 = var208.rest();
        }
        if (module0432.NIL != var209 && module0432.NIL == var207) {
            cdestructuring_bind.cdestructuring_bind_error(var201, (SubLObject)module0432.$ic142$);
        }
        final SubLObject var210 = cdestructuring_bind.property_list_member((SubLObject)module0432.$ic145$, var202);
        final SubLObject var211 = (SubLObject)((module0432.NIL != var210) ? conses_high.cadr(var210) : module0432.NIL);
        final SubLObject var212;
        var202 = (var212 = var203);
        final SubLObject var213 = (SubLObject)module0432.$ic146$;
        final SubLObject var214 = (SubLObject)module0432.$ic147$;
        final SubLObject var215 = (SubLObject)module0432.$ic148$;
        return (SubLObject)ConsesLow.list((SubLObject)module0432.$ic149$, (SubLObject)ConsesLow.list(var213, (SubLObject)ConsesLow.list((SubLObject)module0432.$ic150$, module0432.$ic151$, var204), var211), (SubLObject)ConsesLow.list((SubLObject)module0432.$ic149$, (SubLObject)ConsesLow.list(var214, (SubLObject)ConsesLow.list((SubLObject)module0432.$ic152$, var213), var211), (SubLObject)ConsesLow.list((SubLObject)module0432.$ic149$, (SubLObject)ConsesLow.list(var215, (SubLObject)ConsesLow.list((SubLObject)module0432.$ic150$, module0432.$ic153$, var214), var211), (SubLObject)ConsesLow.listS((SubLObject)module0432.$ic154$, reader.bq_cons(var206, var205), var215, ConsesLow.append(var212, (SubLObject)module0432.NIL)))));
    }
    
    public static SubLObject f30539(final SubLObject var82, final SubLObject var54, final SubLObject var190, final SubLObject var191, final SubLObject var7) {
        SubLObject var192 = (SubLObject)module0432.NIL;
        if (module0432.NIL == var192) {
            SubLObject var193 = module0595.f36374(module0432.$ic151$, var7, (SubLObject)module0432.UNPROVIDED);
            SubLObject var194 = (SubLObject)module0432.NIL;
            var194 = var193.first();
            while (module0432.NIL == var192 && module0432.NIL != var193) {
                if (module0432.NIL == var192) {
                    SubLObject var80_218 = module0202.f12751(var194);
                    SubLObject var195 = (SubLObject)module0432.NIL;
                    var195 = var80_218.first();
                    while (module0432.NIL == var192 && module0432.NIL != var80_218) {
                        if (module0432.NIL == var192) {
                            SubLObject var80_219 = module0595.f36374(module0432.$ic153$, var195, (SubLObject)module0432.UNPROVIDED);
                            SubLObject var196 = (SubLObject)module0432.NIL;
                            var196 = var80_219.first();
                            while (module0432.NIL == var192 && module0432.NIL != var80_219) {
                                SubLObject var198;
                                final SubLObject var197 = var198 = var196;
                                SubLObject var199 = (SubLObject)module0432.NIL;
                                SubLObject var200 = (SubLObject)module0432.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var198, var197, (SubLObject)module0432.$ic155$);
                                var199 = var198.first();
                                var198 = (var200 = var198.rest());
                                var192 = f30545(var82, var54, var190, var191, var200, var199);
                                var80_219 = var80_219.rest();
                                var196 = var80_219.first();
                            }
                        }
                        var80_218 = var80_218.rest();
                        var195 = var80_218.first();
                    }
                }
                var193 = var193.rest();
                var194 = var193.first();
            }
        }
        return var192;
    }
    
    public static SubLObject f30545(final SubLObject var82, final SubLObject var54, final SubLObject var190, final SubLObject var191, final SubLObject var204, final SubLObject var98) {
        final SubLObject var205 = f30540(var82, var54);
        final SubLObject var206 = f30541(var82, var54);
        return module0046.f3173((SubLObject)module0432.$ic156$, var190, var205, var206, var204, (SubLObject)module0432.NIL, var98, (SubLObject)module0432.TEN_INTEGER, var191, (SubLObject)module0432.NIL);
    }
    
    public static SubLObject f30533(final SubLObject var28, final SubLObject var179) {
        final SubLObject var180 = module0543.f33623((SubLObject)module0432.$ic16$, (SubLObject)module0432.UNPROVIDED);
        f30483(var180);
        module0543.f33631((SubLObject)ConsesLow.list(module0432.$ic6$, var180, f30546(var28)), var179, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
        module0543.f33631((SubLObject)ConsesLow.list(module0432.$ic157$, var28, var180), var179, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
        return var180;
    }
    
    public static SubLObject f30546(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = module0432.$ic158$;
        final SubLObject var31 = module0147.$g2094$.currentBinding(var29);
        final SubLObject var32 = module0147.$g2095$.currentBinding(var29);
        try {
            module0147.$g2094$.bind((SubLObject)module0432.$ic37$, var29);
            module0147.$g2095$.bind(module0432.$ic38$, var29);
            final SubLObject var33 = (SubLObject)module0432.$ic161$;
            final SubLObject var34 = module0056.f4145(var33);
            final SubLObject var16_230 = module0139.$g1635$.currentBinding(var29);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var29);
                final SubLObject var35 = (SubLObject)module0432.NIL;
                final SubLObject var16_231 = module0141.$g1714$.currentBinding(var29);
                final SubLObject var37_233 = module0141.$g1715$.currentBinding(var29);
                try {
                    module0141.$g1714$.bind((module0432.NIL != var35) ? var35 : module0141.f9283(), var29);
                    module0141.$g1715$.bind((SubLObject)((module0432.NIL != var35) ? module0432.$ic162$ : module0141.$g1715$.getDynamicValue(var29)), var29);
                    if (module0432.NIL != var35 && module0432.NIL != module0136.f8864() && module0432.NIL == module0141.f9279(var35)) {
                        final SubLObject var36 = module0136.$g1591$.getDynamicValue(var29);
                        if (var36.eql((SubLObject)module0432.$ic163$)) {
                            module0136.f8870((SubLObject)module0432.ONE_INTEGER, (SubLObject)module0432.$ic164$, var35, (SubLObject)module0432.$ic165$, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
                        }
                        else if (var36.eql((SubLObject)module0432.$ic166$)) {
                            module0136.f8871((SubLObject)module0432.ONE_INTEGER, (SubLObject)module0432.$ic167$, (SubLObject)module0432.$ic164$, var35, (SubLObject)module0432.$ic165$, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
                        }
                        else if (var36.eql((SubLObject)module0432.$ic168$)) {
                            Errors.warn((SubLObject)module0432.$ic164$, var35, (SubLObject)module0432.$ic165$);
                        }
                        else {
                            Errors.warn((SubLObject)module0432.$ic169$, module0136.$g1591$.getDynamicValue(var29));
                            Errors.cerror((SubLObject)module0432.$ic167$, (SubLObject)module0432.$ic164$, var35, (SubLObject)module0432.$ic165$);
                        }
                    }
                    final SubLObject var16_232 = module0141.$g1670$.currentBinding(var29);
                    final SubLObject var37_234 = module0141.$g1671$.currentBinding(var29);
                    final SubLObject var37 = module0141.$g1672$.currentBinding(var29);
                    final SubLObject var38 = module0141.$g1674$.currentBinding(var29);
                    final SubLObject var39 = module0137.$g1605$.currentBinding(var29);
                    try {
                        module0141.$g1670$.bind(module0137.f8955(module0432.$ic6$), var29);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0432.$ic6$)), var29);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0432.$ic6$)), var29);
                        module0141.$g1674$.bind((SubLObject)module0432.NIL, var29);
                        module0137.$g1605$.bind(module0137.f8955(module0432.$ic6$), var29);
                        if (module0432.NIL != module0136.f8865() || module0432.NIL != module0244.f15795(var28, module0137.f8955((SubLObject)module0432.UNPROVIDED))) {
                            final SubLObject var16_233 = module0141.$g1677$.currentBinding(var29);
                            final SubLObject var37_235 = module0138.$g1619$.currentBinding(var29);
                            final SubLObject var236_241 = module0141.$g1674$.currentBinding(var29);
                            try {
                                module0141.$g1677$.bind(module0141.f9208(), var29);
                                module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0432.UNPROVIDED)), var29);
                                module0141.$g1674$.bind((SubLObject)module0432.NIL, var29);
                                SubLObject var41;
                                final SubLObject var40 = var41 = module0200.f12443(module0137.f8955(module0432.$ic6$));
                                SubLObject var42 = (SubLObject)module0432.NIL;
                                var42 = var41.first();
                                while (module0432.NIL != var41) {
                                    final SubLObject var16_234 = module0137.$g1605$.currentBinding(var29);
                                    final SubLObject var37_236 = module0141.$g1674$.currentBinding(var29);
                                    try {
                                        module0137.$g1605$.bind(var42, var29);
                                        module0141.$g1674$.bind((SubLObject)((module0432.NIL != module0141.f9205((SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0432.NIL == module0141.$g1674$.getDynamicValue(var29)) : module0141.$g1674$.getDynamicValue(var29)), var29);
                                        final SubLObject var43 = module0228.f15229(var28);
                                        if (module0432.NIL != module0138.f8992(var43)) {
                                            final SubLObject var44 = module0242.f15664(var43, module0137.f8955((SubLObject)module0432.UNPROVIDED));
                                            if (module0432.NIL != var44) {
                                                final SubLObject var45 = module0245.f15834(var44, module0138.f8979(), module0137.f8955((SubLObject)module0432.UNPROVIDED));
                                                if (module0432.NIL != var45) {
                                                    SubLObject var46;
                                                    for (var46 = module0066.f4838(module0067.f4891(var45)); module0432.NIL == module0066.f4841(var46); var46 = module0066.f4840(var46)) {
                                                        var29.resetMultipleValues();
                                                        final SubLObject var47 = module0066.f4839(var46);
                                                        final SubLObject var48 = var29.secondMultipleValue();
                                                        var29.resetMultipleValues();
                                                        if (module0432.NIL != module0147.f9507(var47)) {
                                                            final SubLObject var16_235 = module0138.$g1623$.currentBinding(var29);
                                                            try {
                                                                module0138.$g1623$.bind(var47, var29);
                                                                SubLObject var249_253;
                                                                for (var249_253 = module0066.f4838(module0067.f4891(var48)); module0432.NIL == module0066.f4841(var249_253); var249_253 = module0066.f4840(var249_253)) {
                                                                    var29.resetMultipleValues();
                                                                    final SubLObject var49 = module0066.f4839(var249_253);
                                                                    final SubLObject var50 = var29.secondMultipleValue();
                                                                    var29.resetMultipleValues();
                                                                    if (module0432.NIL != module0141.f9289(var49)) {
                                                                        final SubLObject var16_236 = module0138.$g1624$.currentBinding(var29);
                                                                        try {
                                                                            module0138.$g1624$.bind(var49, var29);
                                                                            final SubLObject var51 = var50;
                                                                            if (module0432.NIL != module0077.f5302(var51)) {
                                                                                final SubLObject var52 = module0077.f5333(var51);
                                                                                SubLObject var53;
                                                                                SubLObject var54;
                                                                                SubLObject var55;
                                                                                for (var53 = module0032.f1741(var52), var54 = (SubLObject)module0432.NIL, var54 = module0032.f1742(var53, var52); module0432.NIL == module0032.f1744(var53, var54); var54 = module0032.f1743(var54)) {
                                                                                    var55 = module0032.f1745(var53, var54);
                                                                                    if (module0432.NIL != module0032.f1746(var54, var55) && module0432.NIL == module0249.f16059(var55, (SubLObject)module0432.UNPROVIDED)) {
                                                                                        module0249.f16055(var55, (SubLObject)module0432.UNPROVIDED);
                                                                                        module0056.f4149(var55, var34);
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (var51.isList()) {
                                                                                SubLObject var56 = var51;
                                                                                SubLObject var57 = (SubLObject)module0432.NIL;
                                                                                var57 = var56.first();
                                                                                while (module0432.NIL != var56) {
                                                                                    if (module0432.NIL == module0249.f16059(var57, (SubLObject)module0432.UNPROVIDED)) {
                                                                                        module0249.f16055(var57, (SubLObject)module0432.UNPROVIDED);
                                                                                        module0056.f4149(var57, var34);
                                                                                    }
                                                                                    var56 = var56.rest();
                                                                                    var57 = var56.first();
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)module0432.$ic170$, var51);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1624$.rebind(var16_236, var29);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var249_253);
                                                            }
                                                            finally {
                                                                module0138.$g1623$.rebind(var16_235, var29);
                                                            }
                                                        }
                                                    }
                                                    module0066.f4842(var46);
                                                }
                                            }
                                            else {
                                                module0136.f8870((SubLObject)module0432.FIVE_INTEGER, (SubLObject)module0432.$ic171$, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
                                            }
                                        }
                                        else if (module0432.NIL != module0155.f9785(var43, (SubLObject)module0432.UNPROVIDED)) {
                                            SubLObject var10_263;
                                            final SubLObject var58 = var10_263 = ((module0432.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var29), module0137.f8955((SubLObject)module0432.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var29), module0137.f8955((SubLObject)module0432.UNPROVIDED)));
                                            SubLObject var59 = (SubLObject)module0432.NIL;
                                            var59 = var10_263.first();
                                            while (module0432.NIL != var10_263) {
                                                final SubLObject var16_237 = module0138.$g1625$.currentBinding(var29);
                                                try {
                                                    module0138.$g1625$.bind(var59, var29);
                                                    final SubLObject var61;
                                                    final SubLObject var60 = var61 = Functions.funcall(var59, var43);
                                                    if (module0432.NIL != module0077.f5302(var61)) {
                                                        final SubLObject var62 = module0077.f5333(var61);
                                                        SubLObject var63;
                                                        SubLObject var64;
                                                        SubLObject var65;
                                                        for (var63 = module0032.f1741(var62), var64 = (SubLObject)module0432.NIL, var64 = module0032.f1742(var63, var62); module0432.NIL == module0032.f1744(var63, var64); var64 = module0032.f1743(var64)) {
                                                            var65 = module0032.f1745(var63, var64);
                                                            if (module0432.NIL != module0032.f1746(var64, var65) && module0432.NIL == module0249.f16059(var65, (SubLObject)module0432.UNPROVIDED)) {
                                                                module0249.f16055(var65, (SubLObject)module0432.UNPROVIDED);
                                                                module0056.f4149(var65, var34);
                                                            }
                                                        }
                                                    }
                                                    else if (var61.isList()) {
                                                        SubLObject var66 = var61;
                                                        SubLObject var67 = (SubLObject)module0432.NIL;
                                                        var67 = var66.first();
                                                        while (module0432.NIL != var66) {
                                                            if (module0432.NIL == module0249.f16059(var67, (SubLObject)module0432.UNPROVIDED)) {
                                                                module0249.f16055(var67, (SubLObject)module0432.UNPROVIDED);
                                                                module0056.f4149(var67, var34);
                                                            }
                                                            var66 = var66.rest();
                                                            var67 = var66.first();
                                                        }
                                                    }
                                                    else {
                                                        Errors.error((SubLObject)module0432.$ic170$, var61);
                                                    }
                                                }
                                                finally {
                                                    module0138.$g1625$.rebind(var16_237, var29);
                                                }
                                                var10_263 = var10_263.rest();
                                                var59 = var10_263.first();
                                            }
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var37_236, var29);
                                        module0137.$g1605$.rebind(var16_234, var29);
                                    }
                                    var41 = var41.rest();
                                    var42 = var41.first();
                                }
                                SubLObject var68 = module0056.f4150(var34);
                                final SubLObject var16_238 = module0137.$g1605$.currentBinding(var29);
                                final SubLObject var37_237 = module0141.$g1674$.currentBinding(var29);
                                final SubLObject var236_242 = module0138.$g1619$.currentBinding(var29);
                                try {
                                    module0137.$g1605$.bind(module0244.f15771(module0141.f9188()), var29);
                                    module0141.$g1674$.bind((SubLObject)module0432.NIL, var29);
                                    module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0432.UNPROVIDED)), var29);
                                    while (module0432.NIL != var68) {
                                        final SubLObject var69 = var68;
                                        SubLObject var70 = (SubLObject)module0432.NIL;
                                        final SubLObject var71 = module0432.$ic172$;
                                        if (module0432.NIL != module0158.f10010(var69, (SubLObject)module0432.TWO_INTEGER, var71)) {
                                            final SubLObject var72 = module0158.f10011(var69, (SubLObject)module0432.TWO_INTEGER, var71);
                                            SubLObject var73 = (SubLObject)module0432.NIL;
                                            final SubLObject var74 = (SubLObject)module0432.NIL;
                                            while (module0432.NIL == var73) {
                                                final SubLObject var75 = module0052.f3695(var72, var74);
                                                final SubLObject var76 = (SubLObject)SubLObjectFactory.makeBoolean(!var74.eql(var75));
                                                if (module0432.NIL != var76) {
                                                    SubLObject var77 = (SubLObject)module0432.NIL;
                                                    try {
                                                        var77 = module0158.f10316(var75, (SubLObject)module0432.$ic39$, (SubLObject)module0432.NIL, (SubLObject)module0432.NIL);
                                                        SubLObject var40_271 = (SubLObject)module0432.NIL;
                                                        final SubLObject var41_272 = (SubLObject)module0432.NIL;
                                                        while (module0432.NIL == var40_271) {
                                                            final SubLObject var78 = module0052.f3695(var77, var41_272);
                                                            final SubLObject var43_273 = (SubLObject)SubLObjectFactory.makeBoolean(!var41_272.eql(var78));
                                                            if (module0432.NIL != var43_273) {
                                                                var70 = module0178.f11331(var78, (SubLObject)module0432.ONE_INTEGER);
                                                                if (module0432.NIL != module0256.f16576(var70, var30, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED) && module0432.NIL == module0256.f16576(var30, var70, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED)) {
                                                                    var30 = var70;
                                                                }
                                                            }
                                                            var40_271 = (SubLObject)SubLObjectFactory.makeBoolean(module0432.NIL == var43_273);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject var16_239 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0432.T, var29);
                                                            if (module0432.NIL != var77) {
                                                                module0158.f10319(var77);
                                                            }
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(var16_239, var29);
                                                        }
                                                    }
                                                }
                                                var73 = (SubLObject)SubLObjectFactory.makeBoolean(module0432.NIL == var76);
                                            }
                                        }
                                        SubLObject var80;
                                        final SubLObject var79 = var80 = module0200.f12443(module0137.f8955((SubLObject)module0432.UNPROVIDED));
                                        SubLObject var81 = (SubLObject)module0432.NIL;
                                        var81 = var80.first();
                                        while (module0432.NIL != var80) {
                                            final SubLObject var16_240 = module0137.$g1605$.currentBinding(var29);
                                            final SubLObject var37_238 = module0141.$g1674$.currentBinding(var29);
                                            try {
                                                module0137.$g1605$.bind(var81, var29);
                                                module0141.$g1674$.bind((SubLObject)((module0432.NIL != module0141.f9205((SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0432.NIL == module0141.$g1674$.getDynamicValue(var29)) : module0141.$g1674$.getDynamicValue(var29)), var29);
                                                final SubLObject var82 = module0228.f15229(var68);
                                                if (module0432.NIL != module0138.f8992(var82)) {
                                                    final SubLObject var83 = module0242.f15664(var82, module0137.f8955((SubLObject)module0432.UNPROVIDED));
                                                    if (module0432.NIL != var83) {
                                                        final SubLObject var84 = module0245.f15834(var83, module0138.f8979(), module0137.f8955((SubLObject)module0432.UNPROVIDED));
                                                        if (module0432.NIL != var84) {
                                                            SubLObject var85;
                                                            for (var85 = module0066.f4838(module0067.f4891(var84)); module0432.NIL == module0066.f4841(var85); var85 = module0066.f4840(var85)) {
                                                                var29.resetMultipleValues();
                                                                final SubLObject var86 = module0066.f4839(var85);
                                                                final SubLObject var87 = var29.secondMultipleValue();
                                                                var29.resetMultipleValues();
                                                                if (module0432.NIL != module0147.f9507(var86)) {
                                                                    final SubLObject var16_241 = module0138.$g1623$.currentBinding(var29);
                                                                    try {
                                                                        module0138.$g1623$.bind(var86, var29);
                                                                        SubLObject var249_254;
                                                                        for (var249_254 = module0066.f4838(module0067.f4891(var87)); module0432.NIL == module0066.f4841(var249_254); var249_254 = module0066.f4840(var249_254)) {
                                                                            var29.resetMultipleValues();
                                                                            final SubLObject var88 = module0066.f4839(var249_254);
                                                                            final SubLObject var89 = var29.secondMultipleValue();
                                                                            var29.resetMultipleValues();
                                                                            if (module0432.NIL != module0141.f9289(var88)) {
                                                                                final SubLObject var16_242 = module0138.$g1624$.currentBinding(var29);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var88, var29);
                                                                                    final SubLObject var90 = var89;
                                                                                    if (module0432.NIL != module0077.f5302(var90)) {
                                                                                        final SubLObject var91 = module0077.f5333(var90);
                                                                                        SubLObject var92;
                                                                                        SubLObject var93;
                                                                                        SubLObject var94;
                                                                                        for (var92 = module0032.f1741(var91), var93 = (SubLObject)module0432.NIL, var93 = module0032.f1742(var92, var91); module0432.NIL == module0032.f1744(var92, var93); var93 = module0032.f1743(var93)) {
                                                                                            var94 = module0032.f1745(var92, var93);
                                                                                            if (module0432.NIL != module0032.f1746(var93, var94) && module0432.NIL == module0249.f16059(var94, (SubLObject)module0432.UNPROVIDED)) {
                                                                                                module0249.f16055(var94, (SubLObject)module0432.UNPROVIDED);
                                                                                                module0056.f4149(var94, var34);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var90.isList()) {
                                                                                        SubLObject var95 = var90;
                                                                                        SubLObject var96 = (SubLObject)module0432.NIL;
                                                                                        var96 = var95.first();
                                                                                        while (module0432.NIL != var95) {
                                                                                            if (module0432.NIL == module0249.f16059(var96, (SubLObject)module0432.UNPROVIDED)) {
                                                                                                module0249.f16055(var96, (SubLObject)module0432.UNPROVIDED);
                                                                                                module0056.f4149(var96, var34);
                                                                                            }
                                                                                            var95 = var95.rest();
                                                                                            var96 = var95.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0432.$ic170$, var90);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var16_242, var29);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var249_254);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var16_241, var29);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var85);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0432.FIVE_INTEGER, (SubLObject)module0432.$ic171$, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0432.NIL != module0155.f9785(var82, (SubLObject)module0432.UNPROVIDED)) {
                                                    SubLObject var10_264;
                                                    final SubLObject var97 = var10_264 = ((module0432.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var29), module0137.f8955((SubLObject)module0432.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var29), module0137.f8955((SubLObject)module0432.UNPROVIDED)));
                                                    SubLObject var98 = (SubLObject)module0432.NIL;
                                                    var98 = var10_264.first();
                                                    while (module0432.NIL != var10_264) {
                                                        final SubLObject var16_243 = module0138.$g1625$.currentBinding(var29);
                                                        try {
                                                            module0138.$g1625$.bind(var98, var29);
                                                            final SubLObject var100;
                                                            final SubLObject var99 = var100 = Functions.funcall(var98, var82);
                                                            if (module0432.NIL != module0077.f5302(var100)) {
                                                                final SubLObject var101 = module0077.f5333(var100);
                                                                SubLObject var57;
                                                                SubLObject var102;
                                                                SubLObject var103;
                                                                for (var102 = module0032.f1741(var101), var103 = (SubLObject)module0432.NIL, var103 = module0032.f1742(var102, var101); module0432.NIL == module0032.f1744(var102, var103); var103 = module0032.f1743(var103)) {
                                                                    var57 = module0032.f1745(var102, var103);
                                                                    if (module0432.NIL != module0032.f1746(var103, var57) && module0432.NIL == module0249.f16059(var57, (SubLObject)module0432.UNPROVIDED)) {
                                                                        module0249.f16055(var57, (SubLObject)module0432.UNPROVIDED);
                                                                        module0056.f4149(var57, var34);
                                                                    }
                                                                }
                                                            }
                                                            else if (var100.isList()) {
                                                                SubLObject var104 = var100;
                                                                SubLObject var105 = (SubLObject)module0432.NIL;
                                                                var105 = var104.first();
                                                                while (module0432.NIL != var104) {
                                                                    if (module0432.NIL == module0249.f16059(var105, (SubLObject)module0432.UNPROVIDED)) {
                                                                        module0249.f16055(var105, (SubLObject)module0432.UNPROVIDED);
                                                                        module0056.f4149(var105, var34);
                                                                    }
                                                                    var104 = var104.rest();
                                                                    var105 = var104.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0432.$ic170$, var100);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var16_243, var29);
                                                        }
                                                        var10_264 = var10_264.rest();
                                                        var98 = var10_264.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var37_238, var29);
                                                module0137.$g1605$.rebind(var16_240, var29);
                                            }
                                            var80 = var80.rest();
                                            var81 = var80.first();
                                        }
                                        var68 = module0056.f4150(var34);
                                    }
                                }
                                finally {
                                    module0138.$g1619$.rebind(var236_242, var29);
                                    module0141.$g1674$.rebind(var37_237, var29);
                                    module0137.$g1605$.rebind(var16_238, var29);
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var236_241, var29);
                                module0138.$g1619$.rebind(var37_235, var29);
                                module0141.$g1677$.rebind(var16_233, var29);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)module0432.TWO_INTEGER, (SubLObject)module0432.$ic173$, var28, module0244.f15748(module0137.f8955((SubLObject)module0432.UNPROVIDED)), (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var39, var29);
                        module0141.$g1674$.rebind(var38, var29);
                        module0141.$g1672$.rebind(var37, var29);
                        module0141.$g1671$.rebind(var37_234, var29);
                        module0141.$g1670$.rebind(var16_232, var29);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var37_233, var29);
                    module0141.$g1714$.rebind(var16_231, var29);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var29));
            }
            finally {
                module0139.$g1635$.rebind(var16_230, var29);
            }
        }
        finally {
            module0147.$g2095$.rebind(var32, var29);
            module0147.$g2094$.rebind(var31, var29);
        }
        return var30;
    }
    
    public static SubLObject f30531(final SubLObject var108, final SubLObject var173) {
        final SubLThread var174 = SubLProcess.currentSubLThread();
        var174.resetMultipleValues();
        final SubLObject var175 = module0423.f29608(var108, (SubLObject)ConsesLow.list((SubLObject)module0432.$ic174$, var173, (SubLObject)module0432.$ic175$, (SubLObject)module0432.T));
        final SubLObject var176 = var174.secondMultipleValue();
        final SubLObject var177 = var174.thirdMultipleValue();
        final SubLObject var178 = var174.fourthMultipleValue();
        var174.resetMultipleValues();
        return var177;
    }
    
    public static SubLObject f30547() {
        final SubLObject var284 = (SubLObject)module0432.$ic176$;
        if (module0432.NIL == Filesys.directory_p(var284)) {
            module0075.f5241(var284, (SubLObject)module0432.NIL, (SubLObject)module0432.$ic177$);
        }
        return var284;
    }
    
    public static SubLObject f30532(final SubLObject var173) {
        final SubLObject var174 = Sequences.cconcatenate(f30547(), new SubLObject[] { module0038.f2842((SubLObject)Characters.CHAR_slash, (SubLObject)Characters.CHAR_hyphen, module0018.f967()), module0432.$ic178$ });
        if (module0432.NIL == Filesys.directory_p(var174)) {
            module0075.f5241(var174, (SubLObject)module0432.NIL, (SubLObject)module0432.$ic177$);
        }
        return Sequences.cconcatenate(var174, new SubLObject[] { module0432.$ic179$, print_high.princ_to_string(module0361.f23996(var173)), module0432.$ic180$ });
    }
    
    public static SubLObject f30474() {
        module0411.f28632(module0432.$g3522$.getGlobalValue(), module0432.$ic13$);
        f30477((SubLObject)module0432.T);
        final SubLObject var99 = f30510();
        f30515();
        return module0055.f4058(var99);
    }
    
    public static SubLObject f30477(final SubLObject var285) {
        final SubLThread var286 = SubLProcess.currentSubLThread();
        module0432.$g3525$.setGlobalValue(module0035.sublisp_boolean(var285));
        final SubLObject var287 = module0432.$g3522$.getGlobalValue();
        final SubLObject var288 = module0411.f28632(var287, module0432.$ic13$);
        final SubLObject var289 = (SubLObject)ConsesLow.list(module0432.$ic184$, module0432.$ic185$, module0432.$ic186$, module0115.f7982(), var288);
        final SubLObject var290 = module0111.$g1405$.currentBinding(var286);
        try {
            module0111.$g1405$.bind((SubLObject)module0432.NIL, var286);
            module0574.f35153(module0432.$ic13$);
            if (module0432.NIL != var285) {
                module0543.f33628(var289, var287, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED);
            }
            else {
                module0543.f33657(var289, var287);
            }
        }
        finally {
            module0111.$g1405$.rebind(var290, var286);
        }
        return module0432.$g3525$.getGlobalValue();
    }
    
    public static SubLObject f30548() {
        return module0423.f29608(module0432.$ic188$, (SubLObject)module0432.UNPROVIDED);
    }
    
    public static SubLObject f30514() {
        return module0035.sublisp_boolean(module0432.$g3525$.getGlobalValue());
    }
    
    public static SubLObject f30515() {
        if (module0432.NIL == Threads.valid_process_p(module0432.$g3524$.getGlobalValue())) {
            module0432.$g3524$.setGlobalValue(f30549());
        }
        return module0432.$g3524$.getGlobalValue();
    }
    
    public static SubLObject f30550(final SubLObject var121) {
        final SubLObject var122 = module0057.f4175(module0432.$g3526$.getGlobalValue());
        final SubLObject var123 = Sequences.cconcatenate((SubLObject)module0432.$ic189$, module0006.f207(var122));
        final SubLObject var124 = module0059.f4332(var123, (SubLObject)module0432.$ic190$, (SubLObject)ConsesLow.list(var121));
        return var124;
    }
    
    public static SubLObject f30549() {
        final SubLObject var192 = Sequences.copy_seq((SubLObject)module0432.$ic191$);
        return module0059.f4352(var192, (SubLObject)module0432.$ic192$);
    }
    
    public static SubLObject f30551() {
        while (module0432.NIL != f30514()) {
            while (module0432.NIL != module0055.f4061(module0432.$g3512$.getGlobalValue())) {
                Threads.sleep((SubLObject)module0432.ONE_INTEGER);
            }
            if (module0432.NIL != f30514()) {
                f30552();
                Threads.sleep((SubLObject)module0432.ONE_INTEGER);
            }
        }
        return (SubLObject)module0432.NIL;
    }
    
    public static SubLObject f30552() {
        if (module0432.NIL == module0035.f2000(module0432.$g3519$.getGlobalValue(), module0432.$g3518$.getGlobalValue(), (SubLObject)module0432.UNPROVIDED)) {
            final SubLObject var289 = module0432.$g3513$.getGlobalValue();
            SubLObject var290 = (SubLObject)module0432.NIL;
            try {
                var290 = Locks.seize_lock(var289);
                final SubLObject var291 = f30509();
                if (module0432.NIL != var291) {
                    final SubLObject var292 = f30500(var291);
                    final SubLObject var293 = Numbers.subtract(var292, Time.get_universal_time());
                    if (!var293.isPositive()) {
                        f30550(f30507());
                    }
                }
            }
            finally {
                if (module0432.NIL != var290) {
                    Locks.release_lock(var289);
                }
            }
        }
        return (SubLObject)module0432.NIL;
    }
    
    public static SubLObject f30483(final SubLObject var292) {
        final SubLThread var293 = SubLProcess.currentSubLThread();
        return (SubLObject)((module0432.NIL != module0107.f7629(module0432.$g3527$.getDynamicValue(var293))) ? module0055.f4021(var292, module0432.$g3527$.getDynamicValue(var293)) : module0432.NIL);
    }
    
    public static SubLObject f30553() {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (module0432.NIL != module0107.f7629(module0432.$g3527$.getDynamicValue(var13))) {
            while (module0432.NIL == module0055.f4019(module0432.$g3527$.getDynamicValue(var13))) {
                f30530(module0055.f4023(module0432.$g3527$.getDynamicValue(var13)));
            }
        }
        return module0432.$g3527$.getDynamicValue(var13);
    }
    
    public static SubLObject f30554() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30473", "S#33718", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30475", "S#33719", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30476", "S#33720", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30479", "ADD-RECURRING-QUERY-SCHEDULE", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30480", "S#33721", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30481", "S#33722", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30486", "ADD-SINGLE-QUERY-SCHEDULE", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30487", "S#33723", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30488", "REMOVE-RECURRING-QUERY-SCHEDULE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30490", "REMOVE-SINGLE-QUERY-SCHEDULE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30485", "S#33724", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30491", "S#33725", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30482", "S#33726", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30492", "GET-CACHED-RESULTS-FOR-CYCL-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30493", "S#33727", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30494", "GET-SCHEDULES-FOR-CYCL-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30496", "GET-SCHEDULED-QUERY-QUEUE", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30478", "S#33728", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30497", "S#33729", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30502", "S#33730", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30503", "S#33731", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30504", "S#33732", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30499", "S#33733", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30500", "S#33734", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30501", "S#33735", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30505", "S#33736", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30489", "S#33737", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30506", "S#33738", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30507", "S#33739", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30509", "S#33740", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30510", "S#33741", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30511", "S#33742", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30513", "ADD-SCHEDULED-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30512", "S#33743", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30495", "S#33744", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30517", "S#33745", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30518", "S#33746", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30516", "S#33747", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30498", "GET-CURRENTLY-RUNNING-SCHEDULED-QUERIES", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30519", "S#33748", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30520", "S#33749", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30521", "S#33750", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30522", "ABORT-SCHEDULED-QUERY", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30524", "S#33751", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30523", "S#33752", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30525", "S#33753", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30508", "S#33754", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30526", "S#33755", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30527", "S#33756", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30528", "S#33757", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30530", "S#33758", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30529", "S#33759", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30535", "S#33760", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30536", "S#33761", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30534", "S#33762", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30484", "S#33763", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30537", "S#33764", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30538", "S#33765", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30540", "S#33766", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30541", "S#33767", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30542", "S#33768", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30543", "S#33769", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0432", "f30544", "S#33770");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30539", "S#33771", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30545", "S#33772", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30533", "S#33773", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30546", "S#33774", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30531", "S#33775", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30547", "S#33776", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30532", "S#33777", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30474", "S#33778", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30477", "S#33779", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30548", "FIND-POSSIBLE-SCHEDULED-QUERY-DAEMON-IMAGES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30514", "S#33780", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30515", "S#33781", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30550", "S#33782", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30549", "S#33783", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30551", "S#33784", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30552", "S#33785", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30483", "S#33786", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0432", "f30553", "S#33787", 0, 0, false);
        return (SubLObject)module0432.NIL;
    }
    
    public static SubLObject f30555() {
        module0432.$g3512$ = SubLFiles.deflexical("S#33788", module0055.f4059((SubLObject)module0432.NIL, (SubLObject)module0432.$ic67$, (SubLObject)module0432.UNPROVIDED));
        module0432.$g3513$ = SubLFiles.deflexical("S#33789", Locks.make_lock((SubLObject)module0432.$ic68$));
        module0432.$g3514$ = SubLFiles.deflexical("S#33790", (SubLObject)module0432.$ic69$);
        module0432.$g3515$ = SubLFiles.deflexical("S#33791", (module0432.NIL != Symbols.boundp((SubLObject)module0432.$ic93$)) ? module0432.$g3515$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0432.EQUAL), (SubLObject)module0432.UNPROVIDED));
        module0432.$g3516$ = SubLFiles.deflexical("S#33792", (SubLObject)module0432.NIL);
        module0432.$g3517$ = SubLFiles.deflexical("S#33793", (SubLObject)module0432.NIL);
        module0432.$g3518$ = SubLFiles.deflexical("S#33794", (SubLObject)((module0432.NIL != Symbols.boundp((SubLObject)module0432.$ic107$)) ? module0432.$g3518$.getGlobalValue() : module0432.ONE_INTEGER));
        module0432.$g3519$ = SubLFiles.deflexical("S#33795", (SubLObject)((module0432.NIL != Symbols.boundp((SubLObject)module0432.$ic108$)) ? module0432.$g3519$.getGlobalValue() : module0432.NIL));
        module0432.$g3520$ = SubLFiles.deflexical("S#33796", (SubLObject)((module0432.NIL != Symbols.boundp((SubLObject)module0432.$ic117$)) ? module0432.$g3520$.getGlobalValue() : module0432.NIL));
        module0432.$g3521$ = SubLFiles.deflexical("S#33797", Locks.make_lock((SubLObject)module0432.$ic122$));
        module0432.$g3523$ = SubLFiles.deflexical("S#33798", (SubLObject)module0432.$ic130$);
        module0432.$g3524$ = SubLFiles.deflexical("S#33799", (module0432.NIL != Symbols.boundp((SubLObject)module0432.$ic181$)) ? module0432.$g3524$.getGlobalValue() : module0107.f7627());
        module0432.$g3522$ = SubLFiles.deflexical("S#33800", module0432.$ic182$);
        module0432.$g3525$ = SubLFiles.deflexical("S#33801", (SubLObject)((module0432.NIL != Symbols.boundp((SubLObject)module0432.$ic183$)) ? module0432.$g3525$.getGlobalValue() : module0432.NIL));
        module0432.$g3526$ = SubLFiles.deflexical("S#33802", module0057.f4173((SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED, (SubLObject)module0432.UNPROVIDED));
        module0432.$g3527$ = SubLFiles.defparameter("S#33803", module0107.f7627());
        return (SubLObject)module0432.NIL;
    }
    
    public static SubLObject f30556() {
        module0002.f38((SubLObject)module0432.$ic1$);
        module0002.f38((SubLObject)module0432.$ic15$);
        module0002.f38((SubLObject)module0432.$ic24$);
        module0002.f38((SubLObject)module0432.$ic28$);
        module0002.f38((SubLObject)module0432.$ic43$);
        module0002.f38((SubLObject)module0432.$ic60$);
        module0002.f38((SubLObject)module0432.$ic70$);
        module0003.f57((SubLObject)module0432.$ic93$);
        module0012.f416((SubLObject)module0432.$ic101$);
        module0003.f57((SubLObject)module0432.$ic107$);
        module0003.f57((SubLObject)module0432.$ic108$);
        module0002.f38((SubLObject)module0432.$ic109$);
        module0003.f57((SubLObject)module0432.$ic117$);
        module0002.f38((SubLObject)module0432.$ic118$);
        module0003.f57((SubLObject)module0432.$ic181$);
        module0003.f57((SubLObject)module0432.$ic183$);
        module0002.f38((SubLObject)module0432.$ic187$);
        return (SubLObject)module0432.NIL;
    }
    
    public void declareFunctions() {
        f30554();
    }
    
    public void initializeVariables() {
        f30555();
    }
    
    public void runTopLevelForms() {
        f30556();
    }
    
    static {
        me = (SubLFile)new module0432();
        module0432.$g3512$ = null;
        module0432.$g3513$ = null;
        module0432.$g3514$ = null;
        module0432.$g3515$ = null;
        module0432.$g3516$ = null;
        module0432.$g3517$ = null;
        module0432.$g3518$ = null;
        module0432.$g3519$ = null;
        module0432.$g3520$ = null;
        module0432.$g3521$ = null;
        module0432.$g3523$ = null;
        module0432.$g3524$ = null;
        module0432.$g3522$ = null;
        module0432.$g3525$ = null;
        module0432.$g3526$ = null;
        module0432.$g3527$ = null;
        $ic0$ = SubLObjectFactory.makeInteger(30);
        $ic1$ = SubLObjectFactory.makeSymbol("ADD-RECURRING-QUERY-SCHEDULE");
        $ic2$ = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $ic3$ = SubLObjectFactory.makeSymbol("S#747", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic5$ = SubLObjectFactory.makeString("ScheduledQuerySeries");
        $ic6$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic7$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $ic8$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("PeriodicEventSeries")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("PurposefulAction")));
        $ic9$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("resultsShouldBeEmailedToAddress-CC"));
        $ic10$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("InformationGathering")));
        $ic11$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("definingMt"));
        $ic12$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("intervalTypeOfPeriodicSeries"));
        $ic13$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ScheduledQueryDaemon"));
        $ic14$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("querySchedulingComplete"));
        $ic15$ = SubLObjectFactory.makeSymbol("ADD-SINGLE-QUERY-SCHEDULE");
        $ic16$ = SubLObjectFactory.makeString("ScheduledQuery");
        $ic17$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycQueryRunning")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ScheduledAction")));
        $ic18$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ScheduledFn"));
        $ic19$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycQueryRunningFromFn"));
        $ic20$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("scheduledStartingDate"));
        $ic21$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("directingAgent"));
        $ic22$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("ScheduledQueryDaemon")));
        $ic23$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("scheduledBy"));
        $ic24$ = SubLObjectFactory.makeSymbol("REMOVE-RECURRING-QUERY-SCHEDULE");
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33804", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33805", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33806", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33807", "CYC"));
        $ic26$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBQ-FindScheduledQuerySeries"));
        $ic27$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RETURN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?CYCLIST"), (SubLObject)SubLObjectFactory.makeSymbol("?SERIES"), (SubLObject)SubLObjectFactory.makeSymbol("?INTERVAL-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("?TASK"))));
        $ic28$ = SubLObjectFactory.makeSymbol("REMOVE-SINGLE-QUERY-SCHEDULE");
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33804", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33808", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33809", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33807", "CYC"));
        $ic30$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBQ-FindScheduledQueries"));
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RETURN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?CYCLIST"), (SubLObject)SubLObjectFactory.makeSymbol("?QUERY-EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE"), (SubLObject)SubLObjectFactory.makeSymbol("?TASK"))));
        $ic32$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SeriesOfTypeFn"));
        $ic33$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn"));
        $ic34$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("directingAgent")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ScheduledQueryDaemon")));
        $ic35$ = SubLObjectFactory.makeKeyword("ANYTHING");
        $ic36$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#33810", "CYC"));
        $ic37$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic38$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic39$ = SubLObjectFactory.makeKeyword("GAF");
        $ic40$ = SubLObjectFactory.makeSymbol("S#33810", "CYC");
        $ic41$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ModelMtByUserAndTaskFn"));
        $ic42$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic43$ = SubLObjectFactory.makeSymbol("GET-CACHED-RESULTS-FOR-CYCL-QUERY");
        $ic44$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("queryInferences"));
        $ic45$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("inferenceStartTime"));
        $ic46$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("cycProblemStoreInferences"));
        $ic47$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("problemStoreSnapshotPathnames"));
        $ic48$ = SubLObjectFactory.makeString(" ");
        $ic49$ = SubLObjectFactory.makeKeyword("DATE");
        $ic50$ = SubLObjectFactory.makeKeyword("ANSWER-COUNT");
        $ic51$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE-FILE");
        $ic52$ = SubLObjectFactory.makeSymbol("?COUNT");
        $ic53$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("inferenceAnswerCount"));
        $ic54$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?COUNT"));
        $ic55$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic56$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)module0432.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), (SubLObject)module0432.NIL);
        $ic57$ = SubLObjectFactory.makeSymbol("?BINDINGS");
        $ic58$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("inferenceBindings"));
        $ic59$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?BINDINGS"));
        $ic60$ = SubLObjectFactory.makeSymbol("GET-SCHEDULES-FOR-CYCL-QUERY");
        $ic61$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("scheduledQuerySpecification"));
        $ic62$ = SubLObjectFactory.makeKeyword("NEXT-RUN-DATE");
        $ic63$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Series"));
        $ic64$ = SubLObjectFactory.makeKeyword("RECURRENCE-INTERVAL");
        $ic65$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("resultsShouldBeEmailedToAddress-CC")));
        $ic66$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMAIL-RECIPIENTS"), (SubLObject)SubLObjectFactory.makeKeyword("EMAIL-CC"));
        $ic67$ = SubLObjectFactory.makeSymbol("S#33734", "CYC");
        $ic68$ = SubLObjectFactory.makeString("Scheduled Query Queue Lock");
        $ic69$ = SubLObjectFactory.makeInteger("2208988800");
        $ic70$ = SubLObjectFactory.makeSymbol("GET-SCHEDULED-QUERY-QUEUE");
        $ic71$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic72$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic73$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SCHEDULED-QUERY-QUEUE"), (SubLObject)module0432.NIL, (SubLObject)module0432.NIL);
        $ic74$ = SubLObjectFactory.makeSymbol("S#13755", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("NULL");
        $ic76$ = SubLObjectFactory.makeKeyword("GUID-STRING");
        $ic77$ = SubLObjectFactory.makeKeyword("KBQ");
        $ic78$ = SubLObjectFactory.makeKeyword("GLOSS");
        $ic79$ = SubLObjectFactory.makeKeyword("SCHEDULED-RUN-TIME-UNIVERSAL");
        $ic80$ = SubLObjectFactory.makeKeyword("SCHEDULED-RUN-TIME-UNIX");
        $ic81$ = SubLObjectFactory.makeKeyword("SCHEDULED-RUN-TIME-CYCL");
        $ic82$ = SubLObjectFactory.makeKeyword("SCHEDULED-RUN-TIME-DECODED");
        $ic83$ = SubLObjectFactory.makeKeyword("RECURRING?");
        $ic84$ = SubLObjectFactory.makeKeyword("SCHEDULER");
        $ic85$ = SubLObjectFactory.makeKeyword("SERIES");
        $ic86$ = SubLObjectFactory.makeKeyword("INTERVAL-TYPE");
        $ic87$ = SubLObjectFactory.makeKeyword("EVENT");
        $ic88$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("scheduledReportSpecification"));
        $ic89$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("reportSpecificationTemplate"));
        $ic90$ = SubLObjectFactory.makeKeyword("REPORT");
        $ic91$ = SubLObjectFactory.makeKeyword("REPORT-TEMPLATE");
        $ic92$ = SubLObjectFactory.makeKeyword("REPORT-TEMPLATE-GLOSS");
        $ic93$ = SubLObjectFactory.makeSymbol("S#33791", "CYC");
        $ic94$ = SubLObjectFactory.makeSymbol("S#33732", "CYC");
        $ic95$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic96$ = SubLObjectFactory.makeSymbol("S#4951", "CYC");
        $ic97$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33811", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33812", "CYC"));
        $ic98$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBQ-FindOneTimeScheduledQueries"));
        $ic99$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33813", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33812", "CYC"));
        $ic100$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBQ-FindRepeatingScheduledQueries"));
        $ic101$ = SubLObjectFactory.makeSymbol("ADD-SCHEDULED-QUERY");
        $ic102$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("DaysDuration")), (SubLObject)module0432.SEVEN_INTEGER);
        $ic103$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBQ-FindNextFutureStartDateForQueryInSeries"));
        $ic104$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBQ-FindNextStartDateForQueryInSeries"));
        $ic105$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBQ-FindStartDateForScheduledQuery"));
        $ic106$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBQ-FindScheduledKBQ"));
        $ic107$ = SubLObjectFactory.makeSymbol("S#33794", "CYC");
        $ic108$ = SubLObjectFactory.makeSymbol("S#33795", "CYC");
        $ic109$ = SubLObjectFactory.makeSymbol("GET-CURRENTLY-RUNNING-SCHEDULED-QUERIES");
        $ic110$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#33814", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-STORE"));
        $ic111$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE-ID");
        $ic112$ = SubLObjectFactory.makeKeyword("INFERENCES");
        $ic113$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic114$ = SubLObjectFactory.makeKeyword("INFERENCE-ID");
        $ic115$ = SubLObjectFactory.makeKeyword("TIME-SO-FAR");
        $ic116$ = SubLObjectFactory.makeKeyword("STATUS");
        $ic117$ = SubLObjectFactory.makeSymbol("S#33796", "CYC");
        $ic118$ = SubLObjectFactory.makeSymbol("ABORT-SCHEDULED-QUERY");
        $ic119$ = SubLObjectFactory.makeSymbol("S#26316", "CYC");
        $ic120$ = SubLObjectFactory.makeSymbol("CDR");
        $ic121$ = SubLObjectFactory.makeSymbol("PROBLEM-STORE-PROPERTY-P");
        $ic122$ = SubLObjectFactory.makeString("Scheduled Query Cleanup Lock");
        $ic123$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("inferenceDatastructure"));
        $ic124$ = SubLObjectFactory.makeString("text/csv");
        $ic125$ = SubLObjectFactory.makeString("text/tsv");
        $ic126$ = SubLObjectFactory.makeString("text/plain");
        $ic127$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic128$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("stringVersionOfCharacter")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("termStrings")));
        $ic129$ = SubLObjectFactory.makeString("6cb141db-9948-4a5b-b7ae-a86899c41036");
        $ic130$ = SubLObjectFactory.makeString("The following query has been run:\n\nName: ~S\nParaphrase: ~S\nResults: ~D~%");
        $ic131$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBQ-FindGlossForScheduledQuery"));
        $ic132$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBQ-FindFormulaForScheduledQuery"));
        $ic133$ = SubLObjectFactory.makeKeyword("INTERROGATIVE");
        $ic134$ = SubLObjectFactory.makeString("Scheduled Query Results: ");
        $ic135$ = SubLObjectFactory.makeString(" answers for ");
        $ic136$ = SubLObjectFactory.makeString("tsv");
        $ic137$ = SubLObjectFactory.makeString("csv");
        $ic138$ = SubLObjectFactory.makeString("txt");
        $ic139$ = SubLObjectFactory.makeString("Report run successfully");
        $ic140$ = SubLObjectFactory.makeString("Report generation failed (");
        $ic141$ = SubLObjectFactory.makeString(" problems)");
        $ic142$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#710", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#57", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#58", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic143$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic144$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic145$ = SubLObjectFactory.makeKeyword("DONE");
        $ic146$ = SubLObjectFactory.makeUninternedSymbol("US#1A6CC4D");
        $ic147$ = SubLObjectFactory.makeUninternedSymbol("US#5DB8876");
        $ic148$ = SubLObjectFactory.makeUninternedSymbol("US#53A48DD");
        $ic149$ = SubLObjectFactory.makeSymbol("CSOME");
        $ic150$ = SubLObjectFactory.makeSymbol("S#33714", "CYC");
        $ic151$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBQ-FindSMTPAccountsForCyclist"));
        $ic152$ = SubLObjectFactory.makeSymbol("S#15664", "CYC");
        $ic153$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBQ-FindSMTPInfoForAccount"));
        $ic154$ = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $ic155$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#58", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#57", "CYC"));
        $ic156$ = SubLObjectFactory.makeString("scheduled-query-daemon@cyc.com");
        $ic157$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("seriesMembers"));
        $ic158$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycQueryRunning"));
        $ic159$ = SubLObjectFactory.makeKeyword("DEPTH");
        $ic160$ = SubLObjectFactory.makeKeyword("STACK");
        $ic161$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic162$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic163$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic164$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic165$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic166$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic167$ = SubLObjectFactory.makeString("continue anyway");
        $ic168$ = SubLObjectFactory.makeKeyword("WARN");
        $ic169$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic170$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic171$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic172$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("seriesOfType"));
        $ic173$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic174$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $ic175$ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $ic176$ = SubLObjectFactory.makeString("data/problem-stores/");
        $ic177$ = SubLObjectFactory.makeString("0775");
        $ic178$ = SubLObjectFactory.makeString("/");
        $ic179$ = SubLObjectFactory.makeString("store-");
        $ic180$ = SubLObjectFactory.makeString(".cfasl");
        $ic181$ = SubLObjectFactory.makeSymbol("S#33799", "CYC");
        $ic182$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("QuerySchedulerDaemonComputersMt"));
        $ic183$ = SubLObjectFactory.makeSymbol("S#33801", "CYC");
        $ic184$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("programOnPort"));
        $ic185$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ScheduledQueryDaemon-CW"));
        $ic186$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CFASLProtocol"));
        $ic187$ = SubLObjectFactory.makeSymbol("FIND-POSSIBLE-SCHEDULED-QUERY-DAEMON-IMAGES");
        $ic188$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("FindRunningScheduledQueryDaemons"));
        $ic189$ = SubLObjectFactory.makeString("Scheduled Query Runner ");
        $ic190$ = SubLObjectFactory.makeSymbol("S#33757", "CYC");
        $ic191$ = SubLObjectFactory.makeString("Scheduled Query Daemon");
        $ic192$ = SubLObjectFactory.makeSymbol("S#33784", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0432.class
	Total time: 1563 ms
	
	Decompiled with Procyon 0.5.32.
*/