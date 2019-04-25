package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0371 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0371";
    public static final String myFingerPrint = "d03b7fced54157a5c89f707d22ad3bed34ecf41f60e0c8504a0412a9a9f66bde";
    private static SubLSymbol $g3160$;
    private static SubLSymbol $g3161$;
    private static SubLSymbol $g3163$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
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
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLList $ic32$;
    private static final SubLList $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLList $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLString $ic74$;
    private static final SubLList $ic75$;
    private static final SubLList $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLList $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLList $ic90$;
    private static final SubLList $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLList $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLString $ic96$;
    private static final SubLList $ic97$;
    private static final SubLObject $ic98$;
    private static final SubLString $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLList $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLInteger $ic106$;
    private static final SubLString $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLString $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLString $ic111$;
    private static final SubLList $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLList $ic116$;
    private static final SubLList $ic117$;
    private static final SubLList $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLString $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLString $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLList $ic140$;
    private static final SubLList $ic141$;
    private static final SubLList $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLString $ic145$;
    private static final SubLList $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLObject $ic149$;
    private static final SubLList $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLList $ic157$;
    private static final SubLList $ic158$;
    
    public static SubLObject f25933(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0371.$ic0$ == var1 || module0371.$ic1$ == var1 || (var1.isCons() && module0371.$ic2$ == var1.first() && module0371.NIL != module0035.f2192((SubLObject)module0371.$ic3$, var1.rest())) || module0371.NIL != f25934(var1) || module0371.NIL != f25935(var1));
    }
    
    public static SubLObject f25934(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0371.NIL != f25936(var1) || module0371.NIL != f25937(var1) || module0371.NIL != f25938(var1) || module0371.NIL != f25939(var1) || module0371.NIL != f25940(var1) || module0371.NIL != f25941(var1));
    }
    
    public static SubLObject f25936(final SubLObject var1) {
        return f25942((SubLObject)module0371.$ic4$, var1);
    }
    
    public static SubLObject f25938(final SubLObject var1) {
        return f25942((SubLObject)module0371.$ic5$, var1);
    }
    
    public static SubLObject f25939(final SubLObject var1) {
        return f25942((SubLObject)module0371.$ic6$, var1);
    }
    
    public static SubLObject f25940(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isCons() && module0371.$ic7$ == var1.first() && module0371.NIL != module0035.f1995(var1, (SubLObject)module0371.TWO_INTEGER, (SubLObject)module0371.UNPROVIDED) && module0371.NIL != f25933(conses_high.second(var1)));
    }
    
    public static SubLObject f25937(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isCons() && module0371.$ic8$ == var1.first() && module0371.NIL != module0035.f1995(var1, (SubLObject)module0371.THREE_INTEGER, (SubLObject)module0371.UNPROVIDED) && module0371.NIL != f25933(conses_high.second(var1)) && module0371.NIL != f25933(conses_high.third(var1)));
    }
    
    public static SubLObject f25935(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0371.NIL != f25943(var1) || module0371.NIL != f25944(var1) || module0371.NIL != f25945(var1));
    }
    
    public static SubLObject f25943(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isCons() && module0371.$ic9$ == var1.first() && module0371.NIL != module0035.f1995(var1, (SubLObject)module0371.THREE_INTEGER, (SubLObject)module0371.UNPROVIDED) && module0371.NIL != f25946(conses_high.second(var1)) && module0371.NIL != f25947(conses_high.third(var1)));
    }
    
    public static SubLObject f25941(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isCons() && module0371.$ic10$ == var1.first() && module0371.NIL != module0035.f1995(var1, (SubLObject)module0371.THREE_INTEGER, (SubLObject)module0371.UNPROVIDED) && module0371.NIL != f25948(conses_high.second(var1)) && module0371.NIL != f25940(conses_high.third(var1)));
    }
    
    public static SubLObject f25944(final SubLObject var1) {
        return f25949((SubLObject)module0371.$ic11$, var1);
    }
    
    public static SubLObject f25945(final SubLObject var1) {
        return f25949((SubLObject)module0371.$ic12$, var1);
    }
    
    public static SubLObject f25950(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isCons() && module0371.$ic13$ == var1.first() && module0371.NIL != module0035.f1995(var1, (SubLObject)module0371.FOUR_INTEGER, (SubLObject)module0371.UNPROVIDED) && conses_high.third(var1).isKeyword());
    }
    
    public static SubLObject f25947(final SubLObject var2) {
        return f25951(var2, (SubLObject)module0371.$ic14$, (SubLObject)module0371.$ic15$);
    }
    
    public static SubLObject f25948(final SubLObject var2) {
        return f25951(var2, (SubLObject)module0371.$ic16$, (SubLObject)module0371.$ic17$);
    }
    
    public static SubLObject f25952(final SubLObject var2) {
        return f25951(var2, (SubLObject)module0371.$ic18$, (SubLObject)module0371.$ic19$);
    }
    
    public static SubLObject f25946(final SubLObject var3) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0371.NIL != module0206.f13433(var3) || (var3.isCons() && module0371.NIL != module0035.f1995(var3, (SubLObject)module0371.TWO_INTEGER, (SubLObject)module0371.UNPROVIDED) && module0371.$ic20$.eql(var3.first()) && module0371.NIL != module0206.f13433(conses_high.second(var3))));
    }
    
    public static SubLObject f25953(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0371.NIL != f25950(var1) || module0371.NIL != f25943(var1) || module0371.NIL != f25944(var1));
    }
    
    public static SubLObject f25954(final SubLObject var4) {
        return module0340.f22973(module0340.f22786(var4));
    }
    
    public static SubLObject f25955(final SubLObject var4) {
        return module0340.f22959(module0340.f22786(var4));
    }
    
    public static SubLObject f25956(final SubLObject var4) {
        return module0340.f22976(module0340.f22786(var4));
    }
    
    public static SubLObject f25957(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0371.$ic1$ == var1 || module0371.NIL != f25933(var1));
    }
    
    public static SubLObject f25958(final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0371.$ic0$ == var5 || module0371.NIL != module0178.f11290(var5));
    }
    
    public static SubLObject f25949(final SubLObject var6, final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isCons() && var6.eql(var1.first()) && module0371.NIL != module0035.f1995(var1, (SubLObject)module0371.FIVE_INTEGER, (SubLObject)module0371.UNPROVIDED) && module0371.NIL != f25946(conses_high.second(var1)) && module0371.NIL != f25952(conses_high.third(var1)) && module0371.NIL != f25958(conses_high.fourth(var1)) && module0371.NIL != f25957(conses_high.fifth(var1)));
    }
    
    public static SubLObject f25942(final SubLObject var7, final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var7.eql(var1.first()) && module0371.NIL != module0035.f2002(var1.rest(), (SubLObject)module0371.ZERO_INTEGER, (SubLObject)module0371.UNPROVIDED) && module0371.NIL != module0035.f2192((SubLObject)module0371.$ic3$, var1.rest()));
    }
    
    public static SubLObject f25951(final SubLObject var2, final SubLObject var8, final SubLObject var9) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0371.$ic0$ == var2 || module0371.NIL != Functions.funcall(var8, var2) || (var2.isCons() && (module0371.NIL != f25959(var2, var9) || module0371.NIL != f25960(var2, var9) || module0371.NIL != f25961(var2, var9))));
    }
    
    public static SubLObject f25959(final SubLObject var2, final SubLObject var9) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var2.isCons() && module0371.$ic21$ == var2.first() && module0371.NIL != module0035.f1995(var2, (SubLObject)module0371.TWO_INTEGER, (SubLObject)module0371.UNPROVIDED) && module0371.NIL != Functions.funcall(var9, conses_high.second(var2)));
    }
    
    public static SubLObject f25960(final SubLObject var2, final SubLObject var9) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var2.isCons() && module0371.$ic22$ == var2.first() && module0371.NIL != module0035.f2002(var2, (SubLObject)module0371.ONE_INTEGER, (SubLObject)module0371.UNPROVIDED) && module0371.NIL != module0035.f2192(var9, var2.rest()));
    }
    
    public static SubLObject f25961(final SubLObject var2, final SubLObject var9) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var2.isCons() && module0371.$ic2$ == var2.first() && module0371.NIL != module0035.f2002(var2, (SubLObject)module0371.ONE_INTEGER, (SubLObject)module0371.UNPROVIDED) && module0371.NIL != module0035.f2192(var9, var2.rest()));
    }
    
    public static SubLObject f25962(final SubLObject var1) {
        assert module0371.NIL != f25953(var1) : var1;
        return conses_high.second(var1);
    }
    
    public static SubLObject f25963(final SubLObject var1) {
        assert module0371.NIL != f25940(var1) : var1;
        return conses_high.second(var1);
    }
    
    public static SubLObject f25964(final SubLObject var1) {
        assert module0371.NIL != f25937(var1) : var1;
        return conses_high.third(var1);
    }
    
    public static SubLObject f25965(final SubLObject var1) {
        assert module0371.NIL != f25939(var1) : var1;
        return var1.rest();
    }
    
    public static SubLObject f25966(final SubLObject var1) {
        assert module0371.NIL != f25937(var1) : var1;
        return conses_high.second(var1);
    }
    
    public static SubLObject f25967(final SubLObject var1) {
        assert module0371.NIL != f25936(var1) : var1;
        return conses_high.second(var1);
    }
    
    public static SubLObject f25968(final SubLObject var10) {
        assert module0371.NIL != f25933(var10) : var10;
        SubLObject var11 = (SubLObject)module0371.NIL;
        final SubLObject var12 = (SubLObject)module0371.NIL;
        if (module0371.NIL != f25953(var10)) {
            var11 = f25962(var10);
        }
        else {
            final SubLObject var13 = conses_high.second(conses_high.third(var10));
            final SubLObject var14 = var13.rest();
            var11 = module0276.f18287(Mapping.mapcar((SubLObject)module0371.$ic28$, var14), (SubLObject)module0371.UNPROVIDED);
        }
        return var11;
    }
    
    public static SubLObject f25969(final SubLObject var1) {
        assert module0371.NIL != f25944(var1) : var1;
        return conses_high.fourth(var1);
    }
    
    public static SubLObject f25970(final SubLObject var1) {
        assert module0371.NIL != f25944(var1) : var1;
        return conses_high.fifth(var1);
    }
    
    public static SubLObject f25971(final SubLObject var1) {
        assert module0371.NIL != f25945(var1) : var1;
        return conses_high.fourth(var1);
    }
    
    public static SubLObject f25972(final SubLObject var1) {
        assert module0371.NIL != f25945(var1) : var1;
        return conses_high.fifth(var1);
    }
    
    public static SubLObject f25973(final SubLObject var1) {
        if (module0371.NIL != f25943(var1)) {
            return f25962(var1);
        }
        if (module0371.NIL != f25944(var1)) {
            return f25962(var1);
        }
        if (module0371.NIL != f25945(var1)) {
            return f25962(var1);
        }
        return (SubLObject)module0371.NIL;
    }
    
    public static SubLObject f25974(final SubLObject var15) {
        SubLObject var16 = (SubLObject)module0371.NIL;
        SubLObject var17 = (SubLObject)module0371.NIL;
        SubLObject var18 = (SubLObject)module0371.NIL;
        SubLObject var19 = (SubLObject)module0371.NIL;
        SubLObject var20 = (SubLObject)module0371.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var15, var15, (SubLObject)module0371.$ic31$);
        var16 = var15.first();
        SubLObject var21 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var15, (SubLObject)module0371.$ic31$);
        var17 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var15, (SubLObject)module0371.$ic31$);
        var18 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var15, (SubLObject)module0371.$ic31$);
        var19 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var15, (SubLObject)module0371.$ic31$);
        var20 = var21.first();
        var21 = var21.rest();
        if (module0371.NIL == var21) {
            final SubLObject var22 = (SubLObject)ConsesLow.listS((SubLObject)module0371.$ic11$, var17, var18, var19, (SubLObject)module0371.$ic32$);
            final SubLObject var23 = (SubLObject)ConsesLow.listS((SubLObject)module0371.$ic8$, var22, (SubLObject)module0371.$ic32$);
            return var23;
        }
        cdestructuring_bind.cdestructuring_bind_error(var15, (SubLObject)module0371.$ic31$);
        return (SubLObject)module0371.NIL;
    }
    
    public static SubLObject f25975(final SubLObject var1, final SubLObject var25) {
        if (module0371.NIL != Functions.funcall(var25, var1)) {
            return var1;
        }
        if (module0371.NIL == f25976(var1)) {
            return (SubLObject)module0371.NIL;
        }
        SubLObject var26 = (SubLObject)module0371.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0371.$ic33$);
        var26 = var1.first();
        final SubLObject var28;
        final SubLObject var27 = var28 = var1.rest();
        SubLObject var29 = (SubLObject)module0371.NIL;
        SubLObject var30 = var28;
        SubLObject var31 = (SubLObject)module0371.NIL;
        var31 = var30.first();
        while (module0371.NIL != var30) {
            final SubLObject var32 = f25975(var31, var25);
            if (module0371.NIL != f25976(var32)) {
                SubLObject var34_35;
                final SubLObject var32_33 = var34_35 = var32;
                SubLObject var7_36 = (SubLObject)module0371.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var34_35, var32_33, (SubLObject)module0371.$ic34$);
                var7_36 = var34_35.first();
                var34_35 = var34_35.rest();
                SubLObject var30_38;
                final SubLObject var33 = var30_38 = var34_35;
                SubLObject var34 = (SubLObject)module0371.NIL;
                var34 = var30_38.first();
                while (module0371.NIL != var30_38) {
                    var29 = (SubLObject)ConsesLow.cons(var34, var29);
                    var30_38 = var30_38.rest();
                    var34 = var30_38.first();
                }
            }
            else if (module0371.NIL != var32) {
                var29 = (SubLObject)ConsesLow.cons(var32, var29);
            }
            var30 = var30.rest();
            var31 = var30.first();
        }
        if (module0371.NIL != var29) {
            return f25977(var29);
        }
        return (SubLObject)module0371.NIL;
    }
    
    public static SubLObject f25978(final SubLObject var40) {
        assert module0371.NIL != module0366.f24916(var40) : var40;
        return f25979(var40);
    }
    
    public static SubLObject f25979(final SubLObject var40) {
        if (module0371.NIL != module0376.f26656(var40)) {
            return f25980(var40);
        }
        if (module0371.NIL != module0377.f26776(var40)) {
            return f25981(var40);
        }
        if (module0371.NIL != module0378.f26897(var40)) {
            return f25982(var40);
        }
        if (module0371.NIL != f25983(var40)) {
            return f25984(var40);
        }
        if (module0371.NIL != module0373.f26173(var40)) {
            return f25985(var40);
        }
        if (module0371.NIL != module0379.f26936(var40)) {
            return f25986(var40);
        }
        return Errors.error((SubLObject)module0371.$ic36$, module0366.f24989(var40));
    }
    
    public static SubLObject f25980(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        var41.resetMultipleValues();
        final SubLObject var42 = f25987(var40);
        final SubLObject var43 = var41.secondMultipleValue();
        var41.resetMultipleValues();
        return (SubLObject)ConsesLow.list((SubLObject)module0371.$ic9$, var42, var43);
    }
    
    public static SubLObject f25981(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        var41.resetMultipleValues();
        final SubLObject var42 = f25987(var40);
        final SubLObject var43 = var41.secondMultipleValue();
        var41.resetMultipleValues();
        final SubLObject var44 = module0377.f26777(var40);
        final SubLObject var45 = module0377.f26779(var40);
        SubLObject var46 = (SubLObject)module0371.$ic1$;
        if (module0371.NIL != var45) {
            var46 = f25979(var45);
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0371.$ic11$, var42, var43, var44, var46);
    }
    
    public static SubLObject f25986(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        var41.resetMultipleValues();
        final SubLObject var42 = f25987(var40);
        final SubLObject var43 = var41.secondMultipleValue();
        var41.resetMultipleValues();
        final SubLObject var44 = module0366.f24975(var40);
        final SubLObject var45 = f25979(var44);
        return (SubLObject)ConsesLow.list((SubLObject)module0371.$ic13$, var42, var43, var45);
    }
    
    public static SubLObject f25982(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        final SubLObject var42 = module0373.f26181(var40);
        final SubLObject var43 = module0340.f22825(var42);
        final SubLObject var44 = module0366.f24934(var40);
        final SubLObject var45 = module0366.f24937(var40);
        final SubLObject var46 = module0378.f26872(var45);
        final SubLObject var47 = module0381.f27031(var46);
        final SubLObject var48 = module0363.f24509(module0364.f24736(var47));
        final SubLObject var49 = module0364.f24737(var47);
        final SubLObject var50 = module0233.f15362(var49, var48);
        final SubLObject var51 = module0233.f15362(var44, var50);
        var41.resetMultipleValues();
        final SubLObject var52 = module0362.f24467(var51);
        final SubLObject var53 = var41.secondMultipleValue();
        final SubLObject var54 = var41.thirdMultipleValue();
        var41.resetMultipleValues();
        final SubLObject var55 = module0204.f13041(var53, var54);
        final SubLObject var56 = module0202.f12782(var52, var55);
        final SubLObject var57 = module0378.f26898(var40);
        final SubLObject var58 = module0378.f26893(var40);
        final SubLObject var59 = f25979(var58);
        return (SubLObject)ConsesLow.list((SubLObject)module0371.$ic12$, var56, var43, var57, var59);
    }
    
    public static SubLObject f25983(final SubLObject var5) {
        if (module0371.NIL != module0375.f26583(var5)) {
            final SubLObject var6 = module0375.f26585(var5);
            if (module0371.NIL != var6) {
                return module0340.f22959(var6);
            }
        }
        return (SubLObject)module0371.NIL;
    }
    
    public static SubLObject f25984(final SubLObject var40) {
        final SubLObject var41 = module0375.f26585(var40);
        final SubLObject var42 = module0340.f22825(var41);
        final SubLObject var43 = f25985(var40);
        return (SubLObject)ConsesLow.list((SubLObject)module0371.$ic10$, var42, var43);
    }
    
    public static SubLObject f25987(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        final SubLObject var42 = module0373.f26181(var40);
        final SubLObject var43 = module0340.f22825(var42);
        final SubLObject var44 = module0373.f26241(var40);
        var41.resetMultipleValues();
        final SubLObject var45 = module0362.f24467(var44);
        final SubLObject var46 = var41.secondMultipleValue();
        final SubLObject var47 = var41.thirdMultipleValue();
        var41.resetMultipleValues();
        final SubLObject var48 = module0204.f13041(var46, var47);
        final SubLObject var49 = module0202.f12782(var45, var48);
        return Values.values(var49, var43);
    }
    
    public static SubLObject f25985(final SubLObject var40) {
        assert module0371.NIL != module0373.f26173(var40) : var40;
        final SubLObject var41 = module0366.f24989(var40);
        SubLObject var42 = (SubLObject)module0371.NIL;
        SubLObject var43 = module0366.f24938(var40);
        SubLObject var44 = (SubLObject)module0371.NIL;
        var44 = var43.first();
        while (module0371.NIL != var43) {
            final SubLObject var45 = f25979(var44);
            var42 = (SubLObject)ConsesLow.cons(var45, var42);
            var43 = var43.rest();
            var44 = var43.first();
        }
        return reader.bq_cons(var41, ConsesLow.append(Sequences.nreverse(var42), (SubLObject)module0371.NIL));
    }
    
    public static SubLObject f25988(final SubLObject var61) {
        return f25977(f25989(var61));
    }
    
    public static SubLObject f25990(final SubLObject var61) {
        assert module0371.NIL != oc_inference_datastructures_inference.f25275(var61) : var61;
        return f25978(oc_inference_datastructures_inference.f25791(var61));
    }
    
    public static SubLObject f25989(final SubLObject var61) {
        assert module0371.NIL != oc_inference_datastructures_inference.f25275(var61) : var61;
        final SubLObject var62 = oc_inference_datastructures_inference.f25808(var61);
        SubLObject var63 = (SubLObject)module0371.NIL;
        SubLObject var64 = var62;
        SubLObject var65 = (SubLObject)module0371.NIL;
        var65 = var64.first();
        while (module0371.NIL != var64) {
            var63 = (SubLObject)ConsesLow.cons(f25978(var65), var63);
            var64 = var64.rest();
            var65 = var64.first();
        }
        return Sequences.nreverse(var63);
    }
    
    public static SubLObject f25991(final SubLObject var61) {
        final SubLObject var62 = module0077.f5313((SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED);
        final SubLObject var63 = oc_inference_datastructures_inference.f25597(var61);
        if (module0371.NIL != f25992(var63)) {
            return f25993(var63, var62);
        }
        return f25994(var63, var62);
    }
    
    public static SubLObject f25992(final SubLObject var66) {
        return module0383.f27235(module0363.f24618(var66).first());
    }
    
    public static SubLObject f25995(final SubLObject var67, final SubLObject var68) {
        SubLObject var70;
        final SubLObject var69 = var70 = var67.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var70, var69, (SubLObject)module0371.$ic39$);
        final SubLObject var71 = var70.rest();
        var70 = var70.first();
        SubLObject var72 = (SubLObject)module0371.NIL;
        SubLObject var73 = (SubLObject)module0371.NIL;
        SubLObject var74 = (SubLObject)module0371.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var70, var69, (SubLObject)module0371.$ic39$);
        var72 = var70.first();
        var70 = var70.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var70, var69, (SubLObject)module0371.$ic39$);
        var73 = var70.first();
        var70 = var70.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var70, var69, (SubLObject)module0371.$ic39$);
        var74 = var70.first();
        var70 = var70.rest();
        final SubLObject var75 = (SubLObject)(var70.isCons() ? var70.first() : module0371.$ic2$);
        cdestructuring_bind.destructuring_bind_must_listp(var70, var69, (SubLObject)module0371.$ic39$);
        var70 = var70.rest();
        if (module0371.NIL == var70) {
            final SubLObject var76;
            var70 = (var76 = var71);
            return (SubLObject)ConsesLow.list((SubLObject)module0371.$ic40$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var72)), (SubLObject)ConsesLow.list((SubLObject)module0371.$ic41$, var73, var74), reader.bq_cons((SubLObject)module0371.$ic42$, ConsesLow.append(var76, (SubLObject)module0371.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0371.$ic43$, var72, (SubLObject)ConsesLow.list((SubLObject)module0371.$ic44$, (SubLObject)module0371.$ic45$, var72)), (SubLObject)ConsesLow.list((SubLObject)module0371.$ic46$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0371.$ic47$, var72), (SubLObject)ConsesLow.listS((SubLObject)module0371.$ic43$, var72, (SubLObject)module0371.$ic48$)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0371.$ic49$, var72), (SubLObject)ConsesLow.list((SubLObject)module0371.$ic43$, var72, (SubLObject)ConsesLow.list((SubLObject)module0371.$ic50$, var72))), (SubLObject)ConsesLow.list((SubLObject)module0371.T, (SubLObject)ConsesLow.list((SubLObject)module0371.$ic43$, var72, (SubLObject)ConsesLow.list((SubLObject)module0371.$ic51$, var72)), (SubLObject)ConsesLow.list((SubLObject)module0371.$ic52$, var75, var72))), (SubLObject)ConsesLow.list((SubLObject)module0371.$ic53$, var72));
        }
        cdestructuring_bind.cdestructuring_bind_error(var69, (SubLObject)module0371.$ic39$);
        return (SubLObject)module0371.NIL;
    }
    
    public static SubLObject f25993(final SubLObject var66, final SubLObject var65) {
        final SubLThread var67 = SubLProcess.currentSubLThread();
        SubLObject var68 = (SubLObject)module0371.NIL;
        module0077.f5326(var66, var65);
        SubLObject var69 = module0363.f24618(var66);
        SubLObject var70 = (SubLObject)module0371.NIL;
        var70 = var69.first();
        while (module0371.NIL != var69) {
            if (module0371.NIL == Errors.$ignore_mustsP$.getDynamicValue(var67) && module0371.NIL == module0383.f27235(var70)) {
                Errors.error((SubLObject)module0371.$ic54$, var70);
            }
            final SubLObject var71 = module0383.f27234(var70, (SubLObject)module0371.NIL);
            final SubLObject var72 = module0364.f24736(var71);
            var68 = (SubLObject)ConsesLow.cons(f25994(var72, var65), var68);
            var69 = var69.rest();
            var70 = var69.first();
        }
        var68 = Sequences.delete((SubLObject)module0371.$ic45$, var68, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED);
        if (module0371.NIL == var68) {
            var68 = (SubLObject)module0371.$ic0$;
        }
        else if (module0371.NIL != module0035.f1997(var68)) {
            var68 = var68.first();
        }
        else {
            var68 = Sequences.nreverse(var68);
            var68 = (SubLObject)ConsesLow.cons((SubLObject)module0371.$ic4$, var68);
        }
        return var68;
    }
    
    public static SubLObject f25994(final SubLObject var76, final SubLObject var65) {
        final SubLThread var77 = SubLProcess.currentSubLThread();
        SubLObject var78 = (SubLObject)module0371.NIL;
        module0077.f5326(var76, var65);
        if (module0363.f24643(var76, (SubLObject)module0371.UNPROVIDED).isPositive()) {
            SubLObject var79 = (SubLObject)module0371.NIL;
            SubLObject var80;
            for (var80 = module0066.f4838(module0363.f24537(var76)); module0371.NIL == module0066.f4841(var80); var80 = module0066.f4840(var80)) {
                var77.resetMultipleValues();
                final SubLObject var81 = module0066.f4839(var80);
                final SubLObject var82 = var77.secondMultipleValue();
                var77.resetMultipleValues();
                SubLObject var83 = var82;
                SubLObject var84 = (SubLObject)module0371.NIL;
                var84 = var83.first();
                while (module0371.NIL != var83) {
                    var79 = (SubLObject)ConsesLow.cons(f25978(var84), var79);
                    var83 = var83.rest();
                    var84 = var83.first();
                }
            }
            module0066.f4842(var80);
            var78 = (SubLObject)ConsesLow.cons(f25977(var79), var78);
        }
        else {
            final SubLObject var85 = module0363.f24527(var76);
            SubLObject var86;
            SubLObject var87;
            SubLObject var88;
            for (var86 = module0032.f1741(var85), var87 = (SubLObject)module0371.NIL, var87 = module0032.f1742(var86, var85); module0371.NIL == module0032.f1744(var86, var87); var87 = module0032.f1743(var87)) {
                var88 = module0032.f1745(var86, var87);
                if (module0371.NIL != module0032.f1746(var87, var88) && module0371.NIL == module0077.f5320(var88, var65) && module0371.NIL != f25996(var88)) {
                    var78 = (SubLObject)ConsesLow.cons(f25997(var88, var65), var78);
                }
            }
        }
        var78 = Sequences.delete((SubLObject)module0371.$ic45$, var78, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED);
        if (module0371.NIL == var78) {
            var78 = (SubLObject)module0371.$ic0$;
        }
        else if (module0371.NIL != module0035.f1997(var78)) {
            var78 = var78.first();
        }
        else {
            var78 = Sequences.nreverse(var78);
            var78 = (SubLObject)ConsesLow.cons((SubLObject)module0371.$ic2$, var78);
        }
        return var78;
    }
    
    public static SubLObject f25997(final SubLObject var83, final SubLObject var65) {
        SubLObject var84 = (SubLObject)module0371.NIL;
        module0077.f5326(var83, var65);
        final SubLObject var86;
        final SubLObject var85 = var86 = module0364.f24721(var83);
        if (var86.eql((SubLObject)module0371.$ic9$)) {
            return f25998(var83, var65);
        }
        if (var86.eql((SubLObject)module0371.$ic13$)) {
            return f25999(var83, var65);
        }
        if (var86.eql((SubLObject)module0371.$ic11$)) {
            return f26000(var83, var65);
        }
        if (var86.eql((SubLObject)module0371.$ic55$)) {
            return f26001(var83, var65);
        }
        if (var86.eql((SubLObject)module0371.$ic7$)) {
            return f26002(var83, var65);
        }
        if (var86.eql((SubLObject)module0371.$ic6$)) {
            return f26003(var83, var65);
        }
        if (var86.eql((SubLObject)module0371.$ic8$)) {
            return f26004(var83, var65);
        }
        if (var86.eql((SubLObject)module0371.$ic5$)) {
            return f26005(var83, var65);
        }
        if (var86.eql((SubLObject)module0371.$ic4$)) {
            return f26006(var83, var65);
        }
        if (var86.eql((SubLObject)module0371.$ic12$)) {
            return f26007(var83, var65);
        }
        Errors.error((SubLObject)module0371.$ic56$, var85);
        var84 = Sequences.delete((SubLObject)module0371.$ic45$, var84, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED);
        if (module0371.NIL == var84) {
            var84 = (SubLObject)module0371.$ic0$;
        }
        else if (module0371.NIL != module0035.f1997(var84)) {
            var84 = var84.first();
        }
        else {
            var84 = Sequences.nreverse(var84);
            var84 = (SubLObject)ConsesLow.cons((SubLObject)module0371.$ic2$, var84);
        }
        return var84;
    }
    
    public static SubLObject f25996(final SubLObject var83) {
        final SubLObject var85;
        final SubLObject var84 = var85 = module0364.f24721(var83);
        if (var85.eql((SubLObject)module0371.$ic9$)) {
            return f26008(module0376.f26616(var83));
        }
        if (var85.eql((SubLObject)module0371.$ic13$)) {
            return f26008(module0379.f26930(var83));
        }
        if (var85.eql((SubLObject)module0371.$ic11$)) {
            return f26008(module0377.f26752(var83));
        }
        if (var85.eql((SubLObject)module0371.$ic55$)) {
            Errors.error((SubLObject)module0371.$ic57$);
        }
        else {
            if (var85.eql((SubLObject)module0371.$ic7$)) {
                return f26008(module0375.f26579(var83));
            }
            if (var85.eql((SubLObject)module0371.$ic6$)) {
                return Sequences.find_if((SubLObject)module0371.$ic58$, module0380.f26965(var83), (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED);
            }
            if (var85.eql((SubLObject)module0371.$ic8$)) {
                return f26008(module0381.f27034(var83));
            }
            if (var85.eql((SubLObject)module0371.$ic5$)) {
                return f26008(module0382.f27194(var83));
            }
            if (var85.eql((SubLObject)module0371.$ic4$)) {
                return f26008(module0383.f27233(var83));
            }
            if (var85.eql((SubLObject)module0371.$ic12$)) {
                return f25996(module0378.f26873(var83));
            }
            Errors.error((SubLObject)module0371.$ic56$, var84);
        }
        return (SubLObject)module0371.NIL;
    }
    
    public static SubLObject f26008(final SubLObject var5) {
        if (module0371.NIL != module0365.f24819(var5)) {
            return module0365.f24885(var5);
        }
        return (SubLObject)module0371.NIL;
    }
    
    public static SubLObject f25998(final SubLObject var83, final SubLObject var65) {
        SubLObject var84 = (SubLObject)module0371.NIL;
        module0077.f5326(var83, var65);
        final SubLObject var85 = module0376.f26616(var83);
        var84 = (SubLObject)ConsesLow.cons(f26009(var85, var65), var84);
        var84 = Sequences.delete((SubLObject)module0371.$ic45$, var84, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED);
        if (module0371.NIL == var84) {
            var84 = (SubLObject)module0371.$ic0$;
        }
        else if (module0371.NIL != module0035.f1997(var84)) {
            var84 = var84.first();
        }
        else {
            var84 = Sequences.nreverse(var84);
            var84 = (SubLObject)ConsesLow.cons((SubLObject)module0371.$ic2$, var84);
        }
        return var84;
    }
    
    public static SubLObject f25999(final SubLObject var83, final SubLObject var65) {
        SubLObject var84 = (SubLObject)module0371.NIL;
        module0077.f5326(var83, var65);
        final SubLObject var85 = module0379.f26930(var83);
        var84 = (SubLObject)ConsesLow.cons(f26010(var85, var65), var84);
        var84 = Sequences.delete((SubLObject)module0371.$ic45$, var84, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED);
        if (module0371.NIL == var84) {
            var84 = (SubLObject)module0371.$ic0$;
        }
        else if (module0371.NIL != module0035.f1997(var84)) {
            var84 = var84.first();
        }
        else {
            var84 = Sequences.nreverse(var84);
            var84 = (SubLObject)ConsesLow.cons((SubLObject)module0371.$ic2$, var84);
        }
        return var84;
    }
    
    public static SubLObject f26000(final SubLObject var83, final SubLObject var65) {
        SubLObject var84 = (SubLObject)module0371.NIL;
        module0077.f5326(var83, var65);
        final SubLObject var85 = module0377.f26752(var83);
        var84 = (SubLObject)ConsesLow.cons(f26011(var85, var65), var84);
        var84 = Sequences.delete((SubLObject)module0371.$ic45$, var84, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED);
        if (module0371.NIL == var84) {
            var84 = (SubLObject)module0371.$ic0$;
        }
        else if (module0371.NIL != module0035.f1997(var84)) {
            var84 = var84.first();
        }
        else {
            var84 = Sequences.nreverse(var84);
            var84 = (SubLObject)ConsesLow.cons((SubLObject)module0371.$ic2$, var84);
        }
        return var84;
    }
    
    public static SubLObject f26001(final SubLObject var83, final SubLObject var65) {
        SubLObject var84 = (SubLObject)module0371.NIL;
        module0077.f5326(var83, var65);
        Errors.error((SubLObject)module0371.$ic59$);
        var84 = Sequences.delete((SubLObject)module0371.$ic45$, var84, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED);
        if (module0371.NIL == var84) {
            var84 = (SubLObject)module0371.$ic0$;
        }
        else if (module0371.NIL != module0035.f1997(var84)) {
            var84 = var84.first();
        }
        else {
            var84 = Sequences.nreverse(var84);
            var84 = (SubLObject)ConsesLow.cons((SubLObject)module0371.$ic2$, var84);
        }
        return var84;
    }
    
    public static SubLObject f26002(final SubLObject var83, final SubLObject var65) {
        SubLObject var84 = (SubLObject)module0371.NIL;
        module0077.f5326(var83, var65);
        final SubLObject var85 = module0375.f26579(var83);
        var84 = (SubLObject)ConsesLow.cons(f26012(var85, var65), var84);
        var84 = Sequences.delete((SubLObject)module0371.$ic45$, var84, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED);
        if (module0371.NIL == var84) {
            var84 = (SubLObject)module0371.$ic0$;
        }
        else if (module0371.NIL != module0035.f1997(var84)) {
            var84 = var84.first();
        }
        else {
            var84 = Sequences.nreverse(var84);
            var84 = (SubLObject)ConsesLow.cons((SubLObject)module0371.$ic2$, var84);
        }
        return var84;
    }
    
    public static SubLObject f26003(final SubLObject var83, final SubLObject var65) {
        SubLObject var84 = (SubLObject)module0371.NIL;
        module0077.f5326(var83, var65);
        SubLObject var86;
        final SubLObject var85 = var86 = module0380.f26965(var83);
        SubLObject var87 = (SubLObject)module0371.NIL;
        var87 = var86.first();
        while (module0371.NIL != var86) {
            if (module0371.NIL != module0365.f24885(var87)) {
                var84 = (SubLObject)ConsesLow.cons(f26013(var87, var65), var84);
            }
            var86 = var86.rest();
            var87 = var86.first();
        }
        var84 = Sequences.delete((SubLObject)module0371.$ic45$, var84, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED);
        if (module0371.NIL == var84) {
            var84 = (SubLObject)module0371.$ic0$;
        }
        else if (module0371.NIL != module0035.f1997(var84)) {
            var84 = var84.first();
        }
        else {
            var84 = Sequences.nreverse(var84);
            var84 = (SubLObject)ConsesLow.cons((SubLObject)module0371.$ic2$, var84);
        }
        return var84;
    }
    
    public static SubLObject f26005(final SubLObject var83, final SubLObject var65) {
        SubLObject var84 = (SubLObject)module0371.NIL;
        module0077.f5326(var83, var65);
        final SubLObject var85 = module0382.f27194(var83);
        var84 = (SubLObject)ConsesLow.cons(f26014(var85, var65), var84);
        var84 = Sequences.delete((SubLObject)module0371.$ic45$, var84, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED);
        if (module0371.NIL == var84) {
            var84 = (SubLObject)module0371.$ic0$;
        }
        else if (module0371.NIL != module0035.f1997(var84)) {
            var84 = var84.first();
        }
        else {
            var84 = Sequences.nreverse(var84);
            var84 = (SubLObject)ConsesLow.cons((SubLObject)module0371.$ic2$, var84);
        }
        return var84;
    }
    
    public static SubLObject f26004(final SubLObject var83, final SubLObject var65) {
        SubLObject var84 = (SubLObject)module0371.NIL;
        module0077.f5326(var83, var65);
        final SubLObject var85 = module0381.f27034(var83);
        var84 = (SubLObject)ConsesLow.cons(f26015(var85, var65), var84);
        var84 = Sequences.delete((SubLObject)module0371.$ic45$, var84, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED);
        if (module0371.NIL == var84) {
            var84 = (SubLObject)module0371.$ic0$;
        }
        else if (module0371.NIL != module0035.f1997(var84)) {
            var84 = var84.first();
        }
        else {
            var84 = Sequences.nreverse(var84);
            var84 = (SubLObject)ConsesLow.cons((SubLObject)module0371.$ic2$, var84);
        }
        return var84;
    }
    
    public static SubLObject f26006(final SubLObject var83, final SubLObject var65) {
        SubLObject var84 = (SubLObject)module0371.NIL;
        module0077.f5326(var83, var65);
        Errors.error((SubLObject)module0371.$ic60$);
        var84 = Sequences.delete((SubLObject)module0371.$ic45$, var84, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED);
        if (module0371.NIL == var84) {
            var84 = (SubLObject)module0371.$ic0$;
        }
        else if (module0371.NIL != module0035.f1997(var84)) {
            var84 = var84.first();
        }
        else {
            var84 = Sequences.nreverse(var84);
            var84 = (SubLObject)ConsesLow.cons((SubLObject)module0371.$ic2$, var84);
        }
        return var84;
    }
    
    public static SubLObject f26007(final SubLObject var83, final SubLObject var65) {
        final SubLThread var84 = SubLProcess.currentSubLThread();
        SubLObject var85 = (SubLObject)module0371.NIL;
        module0077.f5326(var83, var65);
        final SubLObject var86 = module0378.f26872(var83);
        final SubLObject var87 = module0381.f27031(var86);
        final SubLObject var88 = module0363.f24509(module0364.f24736(var87));
        final SubLObject var89 = module0364.f24737(var87);
        final SubLObject var90 = module0233.f15362(var89, var88);
        SubLObject var91 = (SubLObject)module0371.$ic0$;
        SubLObject var92 = (SubLObject)module0371.$ic0$;
        final SubLObject var93 = module0378.f26873(var83);
        final SubLObject var94 = module0377.f26752(var93);
        final SubLObject var95 = module0365.f24865(var94);
        final SubLObject var96 = module0340.f22825(var95);
        final SubLObject var97 = module0377.f26775(var94);
        if (module0371.NIL != var96) {
            var91 = var96;
        }
        if (module0371.NIL != var97) {
            var92 = var97;
        }
        var84.resetMultipleValues();
        final SubLObject var98 = module0362.f24467(var90);
        final SubLObject var99 = var84.secondMultipleValue();
        final SubLObject var100 = var84.thirdMultipleValue();
        var84.resetMultipleValues();
        final SubLObject var101 = module0204.f13041(var99, var100);
        final SubLObject var102 = module0202.f12782(var98, var101);
        final SubLObject var103 = (SubLObject)ConsesLow.list((SubLObject)module0371.$ic12$, var102, var91, var92, (SubLObject)module0371.$ic1$);
        var85 = (SubLObject)ConsesLow.cons(var103, var85);
        var85 = Sequences.delete((SubLObject)module0371.$ic45$, var85, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED);
        if (module0371.NIL == var85) {
            var85 = (SubLObject)module0371.$ic0$;
        }
        else if (module0371.NIL != module0035.f1997(var85)) {
            var85 = var85.first();
        }
        else {
            var85 = Sequences.nreverse(var85);
            var85 = (SubLObject)ConsesLow.cons((SubLObject)module0371.$ic2$, var85);
        }
        return var85;
    }
    
    public static SubLObject f26016(final SubLObject var74, final SubLObject var65) {
        if (module0371.NIL != module0376.f26619(var74)) {
            return f26009(var74, var65);
        }
        if (module0371.NIL != module0380.f26969(var74)) {
            return f26013(var74, var65);
        }
        if (module0371.NIL != module0381.f27067(var74)) {
            return f26015(var74, var65);
        }
        if (module0371.NIL != module0382.f27206(var74)) {
            return f26014(var74, var65);
        }
        if (module0371.NIL != module0383.f27235(var74)) {
            Errors.error((SubLObject)module0371.$ic61$);
        }
        else {
            if (module0371.NIL != module0377.f26771(var74)) {
                return f26011(var74, var65);
            }
            if (module0371.NIL != module0379.f26934(var74)) {
                return f26010(var74, var65);
            }
            Errors.error((SubLObject)module0371.$ic62$, var74);
        }
        return (SubLObject)module0371.$ic0$;
    }
    
    public static SubLObject f26009(final SubLObject var74, final SubLObject var65) {
        SubLObject var75 = (SubLObject)module0371.NIL;
        module0077.f5326(var74, var65);
        final SubLObject var76 = module0365.f24865(var74);
        final SubLObject var77 = module0340.f22825(var76);
        final SubLObject var78 = module0363.f24509(module0365.f24850(var74));
        final SubLObject var79 = f26017(var78);
        var75 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0371.$ic9$, var79, var77), var75);
        var75 = Sequences.delete((SubLObject)module0371.$ic45$, var75, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED);
        if (module0371.NIL == var75) {
            var75 = (SubLObject)module0371.$ic0$;
        }
        else if (module0371.NIL != module0035.f1997(var75)) {
            var75 = var75.first();
        }
        else {
            var75 = Sequences.nreverse(var75);
            var75 = (SubLObject)ConsesLow.cons((SubLObject)module0371.$ic2$, var75);
        }
        return var75;
    }
    
    public static SubLObject f26013(final SubLObject var74, final SubLObject var65) {
        SubLObject var75 = (SubLObject)module0371.NIL;
        module0077.f5326(var74, var65);
        var75 = Sequences.delete((SubLObject)module0371.$ic45$, var75, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED);
        if (module0371.NIL == var75) {
            var75 = (SubLObject)module0371.$ic0$;
        }
        else if (module0371.NIL != module0035.f1997(var75)) {
            var75 = var75.first();
        }
        else {
            var75 = Sequences.nreverse(var75);
            var75 = (SubLObject)ConsesLow.cons((SubLObject)module0371.$ic6$, var75);
        }
        return var75;
    }
    
    public static SubLObject f26015(final SubLObject var74, final SubLObject var65) {
        SubLObject var75 = (SubLObject)module0371.NIL;
        module0077.f5326(var74, var65);
        final SubLObject var76 = module0381.f27071(var74);
        final SubLObject var77 = module0381.f27072(var74);
        final SubLObject var78 = module0364.f24736(var76);
        final SubLObject var79 = module0364.f24736(var77);
        var75 = (SubLObject)ConsesLow.cons(f25994(var78, var65), var75);
        var75 = (SubLObject)ConsesLow.cons(f25994(var79, var65), var75);
        var75 = Sequences.delete((SubLObject)module0371.$ic45$, var75, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED);
        if (module0371.NIL == var75) {
            var75 = (SubLObject)module0371.$ic0$;
        }
        else if (module0371.NIL != module0035.f1997(var75)) {
            var75 = var75.first();
        }
        else {
            var75 = Sequences.nreverse(var75);
            var75 = (SubLObject)ConsesLow.cons((SubLObject)module0371.$ic8$, var75);
        }
        return var75;
    }
    
    public static SubLObject f26014(final SubLObject var74, final SubLObject var65) {
        SubLObject var75 = (SubLObject)module0371.NIL;
        module0077.f5326(var74, var65);
        SubLObject var76 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(module0382.f27212(var74)));
        SubLObject var77 = (SubLObject)module0371.NIL;
        var77 = var76.first();
        while (module0371.NIL != var76) {
            final SubLObject var78 = module0364.f24736(var77);
            var75 = (SubLObject)ConsesLow.cons(f25994(var78, var65), var75);
            var76 = var76.rest();
            var77 = var76.first();
        }
        var75 = Sequences.delete((SubLObject)module0371.$ic45$, var75, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED);
        if (module0371.NIL == var75) {
            var75 = (SubLObject)module0371.$ic0$;
        }
        else if (module0371.NIL != module0035.f1997(var75)) {
            var75 = var75.first();
        }
        else {
            var75 = Sequences.nreverse(var75);
            var75 = (SubLObject)ConsesLow.cons((SubLObject)module0371.$ic5$, var75);
        }
        return var75;
    }
    
    public static SubLObject f26011(final SubLObject var74, final SubLObject var65) {
        SubLObject var75 = (SubLObject)module0371.NIL;
        module0077.f5326(var74, var65);
        final SubLObject var76 = module0365.f24865(var74);
        final SubLObject var77 = module0340.f22825(var76);
        final SubLObject var78 = module0363.f24509(module0365.f24850(var74));
        final SubLObject var79 = f26017(var78);
        final SubLObject var80 = module0377.f26775(var74);
        SubLObject var81 = (SubLObject)module0371.NIL;
        if (module0371.NIL == var80) {
            return (SubLObject)module0371.$ic45$;
        }
        if (module0371.NIL == var81) {
            var81 = (SubLObject)module0371.$ic1$;
        }
        var75 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0371.$ic11$, var79, var77, var80, var81), var75);
        var75 = Sequences.delete((SubLObject)module0371.$ic45$, var75, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED);
        if (module0371.NIL == var75) {
            var75 = (SubLObject)module0371.$ic0$;
        }
        else if (module0371.NIL != module0035.f1997(var75)) {
            var75 = var75.first();
        }
        else {
            var75 = Sequences.nreverse(var75);
            var75 = (SubLObject)ConsesLow.cons((SubLObject)module0371.$ic2$, var75);
        }
        return var75;
    }
    
    public static SubLObject f26010(final SubLObject var74, final SubLObject var65) {
        SubLObject var75 = (SubLObject)module0371.NIL;
        module0077.f5326(var74, var65);
        var75 = Sequences.delete((SubLObject)module0371.$ic45$, var75, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED);
        if (module0371.NIL == var75) {
            var75 = (SubLObject)module0371.$ic0$;
        }
        else if (module0371.NIL != module0035.f1997(var75)) {
            var75 = var75.first();
        }
        else {
            var75 = Sequences.nreverse(var75);
            var75 = (SubLObject)ConsesLow.cons((SubLObject)module0371.$ic2$, var75);
        }
        return var75;
    }
    
    public static SubLObject f26012(final SubLObject var74, final SubLObject var65) {
        SubLObject var75 = (SubLObject)module0371.NIL;
        module0077.f5326(var74, var65);
        var75 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0371.$ic7$, (SubLObject)module0371.$ic0$), var75);
        var75 = Sequences.delete((SubLObject)module0371.$ic45$, var75, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED);
        if (module0371.NIL == var75) {
            var75 = (SubLObject)module0371.$ic0$;
        }
        else if (module0371.NIL != module0035.f1997(var75)) {
            var75 = var75.first();
        }
        else {
            var75 = Sequences.nreverse(var75);
            var75 = (SubLObject)ConsesLow.cons((SubLObject)module0371.$ic2$, var75);
        }
        return var75;
    }
    
    public static SubLObject f26017(final SubLObject var91) {
        final SubLThread var92 = SubLProcess.currentSubLThread();
        var92.resetMultipleValues();
        final SubLObject var93 = module0362.f24467(var91);
        final SubLObject var94 = var92.secondMultipleValue();
        final SubLObject var95 = var92.thirdMultipleValue();
        var92.resetMultipleValues();
        final SubLObject var96 = module0204.f13041(var94, var95);
        final SubLObject var97 = module0202.f12782(var93, var96);
        return var97;
    }
    
    public static SubLObject f25977(final SubLObject var63) {
        return Sequences.creduce(Symbols.symbol_function((SubLObject)module0371.$ic63$), var63, (SubLObject)module0371.ZERO_INTEGER, (SubLObject)module0371.NIL, (SubLObject)module0371.$ic1$);
    }
    
    public static SubLObject f26018(final SubLObject var98, final SubLObject var99) {
        if (var98.equal(var99)) {
            return var98;
        }
        if (var98 == module0371.$ic1$) {
            return var99;
        }
        if (var99 == module0371.$ic1$) {
            return var98;
        }
        if (var98 == module0371.$ic0$) {
            return (SubLObject)module0371.$ic0$;
        }
        if (var99 == module0371.$ic0$) {
            return (SubLObject)module0371.$ic0$;
        }
        if (var98.isAtom() || var99.isAtom()) {
            return f26019(var98, var99);
        }
        if (module0371.$ic9$ == f26020(var98) && module0371.$ic9$ == f26020(var99)) {
            return f26021(var98, var99);
        }
        if (module0371.$ic11$ == f26020(var98) && module0371.$ic11$ == f26020(var99)) {
            return f26022(var98, var99);
        }
        if (module0371.$ic12$ == f26020(var98) && module0371.$ic12$ == f26020(var99)) {
            return f26023(var98, var99);
        }
        if (module0371.NIL != f25976(var98) && module0371.NIL != f25976(var99)) {
            return f26019(var98, var99);
        }
        if (!SubLObjectFactory.makeBoolean(module0371.NIL == f25976(var98)).eql((SubLObject)SubLObjectFactory.makeBoolean(module0371.NIL == f25976(var99)))) {
            return f26024(var98, var99);
        }
        if (module0371.NIL != f26025(var98, var99)) {
            final SubLObject var100 = f26020(var98);
            SubLObject var101 = (SubLObject)module0371.NIL;
            SubLObject var102 = (SubLObject)module0371.NIL;
            SubLObject var102_103 = (SubLObject)module0371.NIL;
            SubLObject var103 = (SubLObject)module0371.NIL;
            SubLObject var105_106 = (SubLObject)module0371.NIL;
            var102 = var98.rest();
            var102_103 = var102.first();
            var103 = var99.rest();
            var105_106 = var103.first();
            while (module0371.NIL != var103 || module0371.NIL != var102) {
                var101 = (SubLObject)ConsesLow.cons(f26018(var102_103, var105_106), var101);
                var102 = var102.rest();
                var102_103 = var102.first();
                var103 = var103.rest();
                var105_106 = var103.first();
            }
            return reader.bq_cons(var100, ConsesLow.append(Sequences.nreverse(var101), (SubLObject)module0371.NIL));
        }
        return f26019(var98, var99);
    }
    
    public static SubLObject f26024(final SubLObject var98, final SubLObject var99) {
        final SubLObject var100 = f25976(var98);
        final SubLObject var101 = (module0371.NIL != var100) ? var98 : var99;
        final SubLObject var102 = (module0371.NIL != var100) ? var99 : var98;
        SubLObject var103 = (SubLObject)module0371.NIL;
        SubLObject var104 = (SubLObject)module0371.NIL;
        SubLObject var105 = (SubLObject)module0371.NIL;
        var103 = var101;
        var104 = var103.first();
        for (var105 = (SubLObject)module0371.ZERO_INTEGER; module0371.NIL != var103; var103 = var103.rest(), var104 = var103.first(), var105 = Numbers.add((SubLObject)module0371.ONE_INTEGER, var105)) {
            if (var105.isPositive() && module0371.NIL != f26025(var104, var102)) {
                final SubLObject var106 = f26018(var104, var102);
                if (module0371.NIL == f25976(var106)) {
                    return module0035.f2151(var105, var106, var101);
                }
            }
        }
        return f26019(var98, var99);
    }
    
    public static SubLObject f26025(final SubLObject var98, final SubLObject var99) {
        return (SubLObject)SubLObjectFactory.makeBoolean(f26020(var98).eql(f26020(var99)) && module0371.NIL != module0035.f2004(var98, var99));
    }
    
    public static SubLObject f26020(final SubLObject var1) {
        if (var1.isCons()) {
            return var1.first();
        }
        return (SubLObject)module0371.NIL;
    }
    
    public static SubLObject f26021(final SubLObject var113, final SubLObject var114) {
        SubLObject var116;
        final SubLObject var115 = var116 = var113.rest();
        SubLObject var117 = (SubLObject)module0371.NIL;
        SubLObject var118 = (SubLObject)module0371.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var115, (SubLObject)module0371.$ic64$);
        var117 = var116.first();
        var116 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var116, var115, (SubLObject)module0371.$ic64$);
        var118 = var116.first();
        var116 = var116.rest();
        if (module0371.NIL == var116) {
            SubLObject var121_122;
            final SubLObject var119_120 = var121_122 = var114.rest();
            SubLObject var119 = (SubLObject)module0371.NIL;
            SubLObject var120 = (SubLObject)module0371.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var121_122, var119_120, (SubLObject)module0371.$ic65$);
            var119 = var121_122.first();
            var121_122 = var121_122.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var121_122, var119_120, (SubLObject)module0371.$ic65$);
            var120 = var121_122.first();
            var121_122 = var121_122.rest();
            if (module0371.NIL == var121_122) {
                final SubLObject var121 = f26026(var117, var119);
                if (module0371.$ic66$ == var121) {
                    return f26019(var113, var114);
                }
                final SubLObject var122 = f26027(var118, var120);
                return (SubLObject)ConsesLow.list((SubLObject)module0371.$ic9$, var121, var122);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var119_120, (SubLObject)module0371.$ic65$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var115, (SubLObject)module0371.$ic64$);
        }
        return (SubLObject)module0371.NIL;
    }
    
    public static SubLObject f26022(final SubLObject var127, final SubLObject var128) {
        return f26028(var127, var128, (SubLObject)module0371.$ic11$);
    }
    
    public static SubLObject f26023(final SubLObject var129, final SubLObject var130) {
        return f26028(var129, var130, (SubLObject)module0371.$ic12$);
    }
    
    public static SubLObject f26028(final SubLObject var127, final SubLObject var128, final SubLObject var59) {
        SubLObject var130;
        final SubLObject var129 = var130 = var127.rest();
        SubLObject var131 = (SubLObject)module0371.NIL;
        SubLObject var132 = (SubLObject)module0371.NIL;
        SubLObject var133 = (SubLObject)module0371.NIL;
        SubLObject var134 = (SubLObject)module0371.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var130, var129, (SubLObject)module0371.$ic67$);
        var131 = var130.first();
        var130 = var130.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var130, var129, (SubLObject)module0371.$ic67$);
        var132 = var130.first();
        var130 = var130.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var130, var129, (SubLObject)module0371.$ic67$);
        var133 = var130.first();
        var130 = var130.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var130, var129, (SubLObject)module0371.$ic67$);
        var134 = var130.first();
        var130 = var130.rest();
        if (module0371.NIL == var130) {
            SubLObject var137_138;
            final SubLObject var135_136 = var137_138 = var128.rest();
            SubLObject var135 = (SubLObject)module0371.NIL;
            SubLObject var136 = (SubLObject)module0371.NIL;
            SubLObject var137 = (SubLObject)module0371.NIL;
            SubLObject var138 = (SubLObject)module0371.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var137_138, var135_136, (SubLObject)module0371.$ic68$);
            var135 = var137_138.first();
            var137_138 = var137_138.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var137_138, var135_136, (SubLObject)module0371.$ic68$);
            var136 = var137_138.first();
            var137_138 = var137_138.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var137_138, var135_136, (SubLObject)module0371.$ic68$);
            var137 = var137_138.first();
            var137_138 = var137_138.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var137_138, var135_136, (SubLObject)module0371.$ic68$);
            var138 = var137_138.first();
            var137_138 = var137_138.rest();
            if (module0371.NIL == var137_138) {
                final SubLObject var139 = (SubLObject)(var133.eql(var137) ? f26026(var131, var135) : module0371.$ic66$);
                if (module0371.$ic66$ == var139) {
                    return f26019(var127, var128);
                }
                final SubLObject var140 = f26027(var132, var136);
                final SubLObject var141 = f26018(var134, var138);
                return (SubLObject)ConsesLow.list(var59, var139, var140, var133, var141);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var135_136, (SubLObject)module0371.$ic68$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var129, (SubLObject)module0371.$ic67$);
        }
        return (SubLObject)module0371.NIL;
    }
    
    public static SubLObject f26026(final SubLObject var117, final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        var124.resetMultipleValues();
        final SubLObject var125 = f26029(var117);
        final SubLObject var126 = var124.secondMultipleValue();
        final SubLObject var127 = var124.thirdMultipleValue();
        var124.resetMultipleValues();
        var124.resetMultipleValues();
        final SubLObject var128 = f26029(var123);
        final SubLObject var129 = var124.secondMultipleValue();
        final SubLObject var130 = var124.thirdMultipleValue();
        var124.resetMultipleValues();
        final SubLObject var131 = module0205.f13136(var126);
        final SubLObject var132 = module0205.f13136(var129);
        if (!var127.eql(var130) || !var131.equal(var132) || !module0202.f12725(var126, (SubLObject)module0371.UNPROVIDED).eql(module0202.f12725(var129, (SubLObject)module0371.UNPROVIDED))) {
            return (SubLObject)module0371.$ic66$;
        }
        final SubLObject var133 = module0205.f13207(var126, (SubLObject)module0371.UNPROVIDED);
        final SubLObject var134 = module0205.f13207(var129, (SubLObject)module0371.UNPROVIDED);
        final SubLObject var135 = f26030(var125, var128);
        final SubLObject var136 = var131;
        final SubLObject var137 = f26031(var133, var134);
        final SubLObject var138 = module0202.f12720(var136, var137, (SubLObject)module0371.UNPROVIDED);
        final SubLObject var139 = var127;
        final SubLObject var140 = module0202.f12783(var135, var138, var139);
        return var140;
    }
    
    public static SubLObject f26029(final SubLObject var156) {
        final SubLThread var157 = SubLProcess.currentSubLThread();
        assert module0371.NIL != module0202.f12883(var156, (SubLObject)module0371.UNPROVIDED) : var156;
        var157.resetMultipleValues();
        final SubLObject var158 = module0202.f12796(var156);
        final SubLObject var159 = var157.secondMultipleValue();
        final SubLObject var160 = var157.thirdMultipleValue();
        var157.resetMultipleValues();
        if (module0371.NIL != module0202.f12592(var160)) {
            return Values.values(var159, module0205.f13379(var160, (SubLObject)module0371.UNPROVIDED), (SubLObject)module0371.$ic70$);
        }
        return Values.values(var159, var160, (SubLObject)module0371.$ic71$);
    }
    
    public static SubLObject f26027(final SubLObject var118, final SubLObject var124) {
        if (var118.eql(var124)) {
            return var118;
        }
        if (module0371.NIL != module0062.f4491(var118, var124)) {
            return var118;
        }
        if (module0371.NIL != module0062.f4491(var124, var118)) {
            return var124;
        }
        return f26019(var118, var124);
    }
    
    public static SubLObject f26019(final SubLObject var158, final SubLObject var159) {
        final SubLObject var160 = (SubLObject)((module0371.NIL != f25976(var158)) ? var158.rest() : ConsesLow.list(var158));
        final SubLObject var161 = (SubLObject)((module0371.NIL != f25976(var159)) ? var159.rest() : ConsesLow.list(var159));
        final SubLObject var162 = conses_high.union(var160, var161, Symbols.symbol_function((SubLObject)module0371.EQUAL), (SubLObject)module0371.UNPROVIDED);
        return reader.bq_cons((SubLObject)module0371.$ic2$, ConsesLow.append(var162, (SubLObject)module0371.NIL));
    }
    
    public static SubLObject f25976(final SubLObject var163) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var163.isCons() && module0371.$ic2$ == var163.first());
    }
    
    public static SubLObject f26031(final SubLObject var164, final SubLObject var165) {
        SubLObject var166 = (SubLObject)module0371.NIL;
        SubLObject var167 = (SubLObject)module0371.NIL;
        SubLObject var168_169 = (SubLObject)module0371.NIL;
        SubLObject var168 = (SubLObject)module0371.NIL;
        SubLObject var171_172 = (SubLObject)module0371.NIL;
        var167 = var164;
        var168_169 = var167.first();
        var168 = var165;
        var171_172 = var168.first();
        while (module0371.NIL != var168 || module0371.NIL != var167) {
            var166 = (SubLObject)ConsesLow.cons(f26030(var168_169, var171_172), var166);
            var167 = var167.rest();
            var168_169 = var167.first();
            var168 = var168.rest();
            var171_172 = var168.first();
        }
        return Sequences.nreverse(var166);
    }
    
    public static SubLObject f26030(final SubLObject var168, final SubLObject var171) {
        if (var168.equal(var171)) {
            return var168;
        }
        if (module0371.NIL != module0062.f4491(var168, var171)) {
            return var168;
        }
        if (module0371.NIL != module0062.f4491(var171, var168)) {
            return var171;
        }
        return (SubLObject)module0371.$ic0$;
    }
    
    public static SubLObject f26032(final SubLObject var1) {
        return module0036.f2547(var1, Symbols.symbol_function((SubLObject)module0371.$ic72$), Symbols.symbol_function((SubLObject)module0371.$ic73$), (SubLObject)module0371.UNPROVIDED, (SubLObject)module0371.UNPROVIDED);
    }
    
    public static SubLObject f26033(final SubLObject var1) {
        if (module0371.NIL != f25943(var1)) {
            return f26034(var1);
        }
        if (module0371.NIL != f25944(var1)) {
            return f26035(var1);
        }
        if (module0371.NIL != f25945(var1)) {
            return f26036(var1);
        }
        return Errors.error((SubLObject)module0371.$ic74$, var1);
    }
    
    public static SubLObject f26034(final SubLObject var173) {
        SubLObject var175;
        final SubLObject var174 = var175 = var173.rest();
        SubLObject var176 = (SubLObject)module0371.NIL;
        SubLObject var177 = (SubLObject)module0371.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var175, var174, (SubLObject)module0371.$ic75$);
        var176 = var175.first();
        var175 = var175.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var175, var174, (SubLObject)module0371.$ic75$);
        var177 = var175.first();
        var175 = var175.rest();
        if (module0371.NIL == var175) {
            final SubLObject var178 = f26037(var176);
            final SubLObject var179 = var177;
            return (SubLObject)ConsesLow.list((SubLObject)module0371.$ic9$, var178, var179);
        }
        cdestructuring_bind.cdestructuring_bind_error(var174, (SubLObject)module0371.$ic75$);
        return (SubLObject)module0371.NIL;
    }
    
    public static SubLObject f26035(final SubLObject var179) {
        return f26038(var179, (SubLObject)module0371.$ic11$);
    }
    
    public static SubLObject f26036(final SubLObject var179) {
        return f26038(var179, (SubLObject)module0371.$ic12$);
    }
    
    public static SubLObject f26038(final SubLObject var179, final SubLObject var59) {
        SubLObject var181;
        final SubLObject var180 = var181 = var179.rest();
        SubLObject var182 = (SubLObject)module0371.NIL;
        SubLObject var183 = (SubLObject)module0371.NIL;
        SubLObject var184 = (SubLObject)module0371.NIL;
        SubLObject var185 = (SubLObject)module0371.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var181, var180, (SubLObject)module0371.$ic76$);
        var182 = var181.first();
        var181 = var181.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var181, var180, (SubLObject)module0371.$ic76$);
        var183 = var181.first();
        var181 = var181.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var181, var180, (SubLObject)module0371.$ic76$);
        var184 = var181.first();
        var181 = var181.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var181, var180, (SubLObject)module0371.$ic76$);
        var185 = var181.first();
        var181 = var181.rest();
        if (module0371.NIL == var181) {
            final SubLObject var186 = f26037(var182);
            final SubLObject var187 = var183;
            final SubLObject var188 = var184;
            final SubLObject var189 = f26032(var185);
            return (SubLObject)ConsesLow.list(var59, var186, var187, var188, var189);
        }
        cdestructuring_bind.cdestructuring_bind_error(var180, (SubLObject)module0371.$ic76$);
        return (SubLObject)module0371.NIL;
    }
    
    public static SubLObject f26037(final SubLObject var156) {
        final SubLThread var157 = SubLProcess.currentSubLThread();
        var157.resetMultipleValues();
        final SubLObject var158 = f26029(var156);
        final SubLObject var159 = var157.secondMultipleValue();
        final SubLObject var160 = var157.thirdMultipleValue();
        var157.resetMultipleValues();
        final SubLObject var161 = module0205.f13136(var159);
        final SubLObject var162 = module0205.f13207(var159, (SubLObject)module0371.UNPROVIDED);
        final SubLObject var163 = f26039(var158);
        final SubLObject var164 = f26040(var162);
        final SubLObject var165 = module0202.f12720(var161, var164, (SubLObject)module0371.UNPROVIDED);
        final SubLObject var166 = var160;
        final SubLObject var167 = module0202.f12783(var163, var165, var166);
        return var167;
    }
    
    public static SubLObject f26040(final SubLObject var190) {
        SubLObject var191 = (SubLObject)module0371.NIL;
        SubLObject var192 = var190;
        SubLObject var193 = (SubLObject)module0371.NIL;
        var193 = var192.first();
        while (module0371.NIL != var192) {
            var191 = (SubLObject)ConsesLow.cons(f26039(var193), var191);
            var192 = var192.rest();
            var193 = var192.first();
        }
        return Sequences.nreverse(var191);
    }
    
    public static SubLObject f26039(final SubLObject var192) {
        if (var192 == module0371.$ic0$) {
            return var192;
        }
        return (SubLObject)module0371.$ic77$;
    }
    
    public static SubLObject f26041(final SubLObject var91) {
        SubLObject var92 = (SubLObject)module0371.NIL;
        SubLObject var93 = var91;
        SubLObject var94 = (SubLObject)module0371.NIL;
        var94 = var93.first();
        while (module0371.NIL != var93) {
            var92 = (SubLObject)ConsesLow.cons(f26042(var94), var92);
            var93 = var93.rest();
            var94 = var93.first();
        }
        return Sequences.nreverse(var92);
    }
    
    public static SubLObject f26042(final SubLObject var195) {
        SubLObject var196 = (SubLObject)module0371.NIL;
        SubLObject var197 = (SubLObject)module0371.NIL;
        SubLObject var198 = module0232.f15306(var195);
        SubLObject var199 = (SubLObject)module0371.NIL;
        var199 = var198.first();
        while (module0371.NIL != var198) {
            var196 = (SubLObject)ConsesLow.cons(f26043(var199), var196);
            var198 = var198.rest();
            var199 = var198.first();
        }
        var198 = module0232.f15308(var195);
        var199 = (SubLObject)module0371.NIL;
        var199 = var198.first();
        while (module0371.NIL != var198) {
            var197 = (SubLObject)ConsesLow.cons(f26043(var199), var197);
            var198 = var198.rest();
            var199 = var198.first();
        }
        return module0232.f15305(Sequences.nreverse(var196), Sequences.nreverse(var197));
    }
    
    public static SubLObject f26043(final SubLObject var198) {
        SubLObject var199 = (SubLObject)module0371.NIL;
        SubLObject var200 = (SubLObject)module0371.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var198, var198, (SubLObject)module0371.$ic78$);
        var199 = var198.first();
        SubLObject var201 = var198.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var201, var198, (SubLObject)module0371.$ic78$);
        var200 = var201.first();
        var201 = var201.rest();
        if (module0371.NIL == var201) {
            final SubLObject var202 = f26044(var199);
            final SubLObject var203 = f26045(var200);
            return module0362.f24434(var202, var203);
        }
        cdestructuring_bind.cdestructuring_bind_error(var198, (SubLObject)module0371.$ic78$);
        return (SubLObject)module0371.NIL;
    }
    
    public static SubLObject f26045(final SubLObject var201) {
        final SubLObject var202 = module0205.f13136(var201);
        final SubLObject var203 = module0205.f13207(var201, (SubLObject)module0371.UNPROVIDED);
        final SubLObject var204 = f26046(var203);
        final SubLObject var205 = module0202.f12720(var202, var204, (SubLObject)module0371.UNPROVIDED);
        return var205;
    }
    
    public static SubLObject f26046(final SubLObject var185) {
        SubLObject var186 = (SubLObject)module0371.NIL;
        SubLObject var187 = var185;
        SubLObject var188 = (SubLObject)module0371.NIL;
        var188 = var187.first();
        while (module0371.NIL != var187) {
            var186 = (SubLObject)ConsesLow.cons(f26044(var188), var186);
            var187 = var187.rest();
            var188 = var187.first();
        }
        return Sequences.nreverse(var186);
    }
    
    public static SubLObject f26044(final SubLObject var192) {
        if (module0371.NIL != module0173.f10955(var192)) {
            return (SubLObject)module0371.$ic77$;
        }
        if (var192.isInteger()) {
            return (SubLObject)module0371.$ic79$;
        }
        if (var192.isDouble()) {
            return (SubLObject)module0371.$ic80$;
        }
        if (var192.isString()) {
            return (SubLObject)module0371.$ic81$;
        }
        if (module0371.NIL != module0202.f12590(var192)) {
            return f26045(var192);
        }
        return var192;
    }
    
    public static SubLObject f26047(final SubLObject var1, final SubLObject var76) {
        if (module0371.$ic1$ == var1) {
            return (SubLObject)module0371.NIL;
        }
        if (module0371.$ic0$ == var1) {
            return (SubLObject)module0371.T;
        }
        if (module0371.NIL != f25943(var1)) {
            if (module0371.NIL != module0363.f24562(var76)) {
                final SubLObject var77 = f25973(var1);
                return module0384.f27391(var77, var76);
            }
            return (SubLObject)module0371.NIL;
        }
        else {
            if (module0371.NIL == f25940(var1)) {
                return (SubLObject)module0371.T;
            }
            if (module0371.NIL != module0363.f24555(var76)) {
                final SubLObject var78 = f25963(var1);
                return f26047(var78, var76);
            }
            return (SubLObject)module0371.NIL;
        }
    }
    
    public static SubLObject f26048(final SubLObject var1) {
        return (SubLObject)ConsesLow.list((SubLObject)module0371.$ic82$, var1);
    }
    
    public static SubLObject f26049(final SubLObject var1) {
        final SubLObject var2 = module0077.f5313(Symbols.symbol_function((SubLObject)module0371.EQL), (SubLObject)module0371.ZERO_INTEGER);
        final SubLObject var3 = module0077.f5313(Symbols.symbol_function((SubLObject)module0371.EQL), (SubLObject)module0371.ZERO_INTEGER);
        f26050(var1, var2, var3);
        final SubLObject var4 = module0077.f5312(var2);
        final SubLObject var5 = module0077.f5312(var3);
        return ConsesLow.append((SubLObject)((module0371.NIL != var4) ? ConsesLow.list((SubLObject)module0371.$ic83$, reader.bq_cons((SubLObject)module0371.$ic2$, ConsesLow.append(var4, (SubLObject)module0371.NIL))) : module0371.NIL), (SubLObject)((module0371.NIL != var5) ? ConsesLow.list((SubLObject)module0371.$ic84$, var5) : module0371.NIL), (SubLObject)module0371.NIL);
    }
    
    public static SubLObject f26050(final SubLObject var1, final SubLObject var206, final SubLObject var207) {
        if (!var1.isAtom()) {
            if (module0371.NIL != f25976(var1)) {
                SubLObject var208 = (SubLObject)module0371.NIL;
                SubLObject var209 = (SubLObject)module0371.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0371.$ic85$);
                var208 = var1.first();
                final SubLObject var210 = var1.rest();
                SubLObject var211;
                var209 = (var211 = var210);
                SubLObject var212 = (SubLObject)module0371.NIL;
                var212 = var211.first();
                while (module0371.NIL != var211) {
                    f26050(var212, var206, var207);
                    var211 = var211.rest();
                    var212 = var211.first();
                }
            }
            else if (module0371.NIL != f25943(var1)) {
                SubLObject var213 = (SubLObject)module0371.NIL;
                SubLObject var214 = (SubLObject)module0371.NIL;
                SubLObject var215 = (SubLObject)module0371.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0371.$ic86$);
                var213 = var1.first();
                SubLObject var216 = var1.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var216, var1, (SubLObject)module0371.$ic86$);
                var214 = var216.first();
                var216 = var216.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var216, var1, (SubLObject)module0371.$ic86$);
                var215 = var216.first();
                var216 = var216.rest();
                if (module0371.NIL == var216) {
                    f26051(var215, var206);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0371.$ic86$);
                }
            }
            else if (module0371.NIL != f25944(var1)) {
                SubLObject var217 = (SubLObject)module0371.NIL;
                SubLObject var214 = (SubLObject)module0371.NIL;
                SubLObject var215 = (SubLObject)module0371.NIL;
                SubLObject var218 = (SubLObject)module0371.NIL;
                SubLObject var219 = (SubLObject)module0371.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0371.$ic87$);
                var217 = var1.first();
                SubLObject var220 = var1.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var220, var1, (SubLObject)module0371.$ic87$);
                var214 = var220.first();
                var220 = var220.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var220, var1, (SubLObject)module0371.$ic87$);
                var215 = var220.first();
                var220 = var220.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var220, var1, (SubLObject)module0371.$ic87$);
                var218 = var220.first();
                var220 = var220.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var220, var1, (SubLObject)module0371.$ic87$);
                var219 = var220.first();
                var220 = var220.rest();
                if (module0371.NIL == var220) {
                    module0077.f5326(var218, var207);
                    module0077.f5326((SubLObject)module0371.$ic88$, var206);
                    f26051(var215, var206);
                    f26050(var219, var206, var207);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0371.$ic87$);
                }
            }
            else if (module0371.NIL != f25945(var1)) {
                SubLObject var221 = (SubLObject)module0371.NIL;
                SubLObject var214 = (SubLObject)module0371.NIL;
                SubLObject var215 = (SubLObject)module0371.NIL;
                SubLObject var218 = (SubLObject)module0371.NIL;
                SubLObject var219 = (SubLObject)module0371.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0371.$ic89$);
                var221 = var1.first();
                SubLObject var222 = var1.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var222, var1, (SubLObject)module0371.$ic89$);
                var214 = var222.first();
                var222 = var222.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var222, var1, (SubLObject)module0371.$ic89$);
                var215 = var222.first();
                var222 = var222.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var222, var1, (SubLObject)module0371.$ic89$);
                var218 = var222.first();
                var222 = var222.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var222, var1, (SubLObject)module0371.$ic89$);
                var219 = var222.first();
                var222 = var222.rest();
                if (module0371.NIL == var222) {
                    module0077.f5326(var218, var207);
                    module0077.f5326((SubLObject)module0371.$ic8$, var206);
                    f26051(var215, var206);
                    f26050(var219, var206, var207);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0371.$ic89$);
                }
            }
            else {
                SubLObject var223 = (SubLObject)module0371.NIL;
                SubLObject var209 = (SubLObject)module0371.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0371.$ic90$);
                var223 = var1.first();
                final SubLObject var224 = var209 = var1.rest();
                if (module0371.NIL != module0035.f2169(var223, (SubLObject)module0371.$ic91$)) {
                    module0077.f5326(var223, var206);
                }
                if (var223 == module0371.$ic6$) {
                    module0077.f5326((SubLObject)module0371.$ic92$, var206);
                }
                SubLObject var211 = var209;
                SubLObject var212 = (SubLObject)module0371.NIL;
                var212 = var211.first();
                while (module0371.NIL != var211) {
                    f26050(var212, var206, var207);
                    var211 = var211.rest();
                    var212 = var211.first();
                }
            }
        }
        return (SubLObject)module0371.NIL;
    }
    
    public static SubLObject f26051(final SubLObject var176, final SubLObject var206) {
        if (var176.isAtom()) {
            module0077.f5326(var176, var206);
        }
        else if (module0371.NIL != f25976(var176)) {
            SubLObject var207 = (SubLObject)module0371.NIL;
            SubLObject var208 = (SubLObject)module0371.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var176, var176, (SubLObject)module0371.$ic93$);
            var207 = var176.first();
            final SubLObject var209 = var176.rest();
            SubLObject var210;
            var208 = (var210 = var209);
            SubLObject var211 = (SubLObject)module0371.NIL;
            var211 = var210.first();
            while (module0371.NIL != var210) {
                f26051(var211, var206);
                var210 = var210.rest();
                var211 = var210.first();
            }
        }
        return (SubLObject)module0371.NIL;
    }
    
    public static SubLObject f26052() {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        return module0371.$g3161$.getDynamicValue(var41);
    }
    
    public static SubLObject f26053(final SubLObject var231) {
        module0067.f4881(module0371.$g3160$.getGlobalValue());
        final SubLObject var232 = module0424.f29696(module0424.f29795(var231));
        SubLObject var233 = module0424.f29678(var232);
        SubLObject var234 = (SubLObject)module0371.NIL;
        var234 = var233.first();
        while (module0371.NIL != var233) {
            final SubLObject var235 = module0424.f29629(var234);
            final SubLObject var236 = module0424.f29640(var234, (SubLObject)module0371.$ic95$, (SubLObject)module0371.UNPROVIDED);
            if (!var236.isCons()) {
                Errors.warn((SubLObject)module0371.$ic96$, var236);
            }
            module0067.f4886(module0371.$g3160$.getGlobalValue(), var235, var236);
            var233 = var233.rest();
            var234 = var233.first();
        }
        return module0371.$g3160$.getGlobalValue();
    }
    
    public static SubLObject f26054(final SubLObject var234) {
        final SubLObject var235 = module0067.f4884(module0371.$g3160$.getGlobalValue(), var234, (SubLObject)module0371.UNPROVIDED);
        if (module0371.NIL != var235) {
            return f26048(var235);
        }
        return (SubLObject)module0371.$ic97$;
    }
    
    public static SubLObject f26055(final SubLObject var235, SubLObject var231) {
        if (var231 == module0371.UNPROVIDED) {
            var231 = (SubLObject)module0371.NIL;
        }
        final SubLThread var236 = SubLProcess.currentSubLThread();
        module0067.f4881(module0371.$g3160$.getGlobalValue());
        final SubLObject var238;
        final SubLObject var237 = var238 = module0035.f2097(module0424.f29760(var235, module0371.$ic98$));
        module0012.$g82$.setDynamicValue((SubLObject)module0371.$ic99$, var236);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var236);
        module0012.$g83$.setDynamicValue(Sequences.length(var238), var236);
        module0012.$g84$.setDynamicValue((SubLObject)module0371.ZERO_INTEGER, var236);
        final SubLObject var239 = module0012.$g75$.currentBinding(var236);
        final SubLObject var240 = module0012.$g76$.currentBinding(var236);
        final SubLObject var241 = module0012.$g77$.currentBinding(var236);
        final SubLObject var242 = module0012.$g78$.currentBinding(var236);
        try {
            module0012.$g75$.bind((SubLObject)module0371.ZERO_INTEGER, var236);
            module0012.$g76$.bind((SubLObject)module0371.NIL, var236);
            module0012.$g77$.bind((SubLObject)module0371.T, var236);
            module0012.$g78$.bind(Time.get_universal_time(), var236);
            module0012.f478(module0012.$g82$.getDynamicValue(var236));
            SubLObject var243 = var238;
            SubLObject var244 = (SubLObject)module0371.NIL;
            var244 = var243.first();
            while (module0371.NIL != var243) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var236), module0012.$g83$.getDynamicValue(var236));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var236), (SubLObject)module0371.ONE_INTEGER), var236);
                final SubLObject var245 = f26056(var244);
                if (module0371.NIL != var245) {
                    module0067.f4886(module0371.$g3160$.getGlobalValue(), var244, var245);
                    if (var231.isString()) {
                        module0069.f4937(module0371.$g3160$.getGlobalValue(), var231);
                    }
                }
                var243 = var243.rest();
                var244 = var243.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var242, var236);
            module0012.$g77$.rebind(var241, var236);
            module0012.$g76$.rebind(var240, var236);
            module0012.$g75$.rebind(var239, var236);
        }
        return module0371.$g3160$.getGlobalValue();
    }
    
    public static SubLObject f26056(final SubLObject var243) {
        final SubLObject var244 = f26057(var243);
        if (module0371.NIL != var244) {
            final SubLObject var245 = ConsesLow.nth((SubLObject)module0371.THREE_INTEGER, var244);
            return var245;
        }
        return (SubLObject)module0371.NIL;
    }
    
    public static SubLObject f26057(final SubLObject var243) {
        final SubLThread var244 = SubLProcess.currentSubLThread();
        SubLObject var245 = (SubLObject)module0371.NIL;
        SubLObject var246 = (SubLObject)module0371.NIL;
        SubLObject var247 = (SubLObject)module0371.NIL;
        SubLObject var248 = (SubLObject)module0371.NIL;
        try {
            var244.throwStack.push(module0371.$ic100$);
            final SubLObject var249 = Errors.$error_handler$.currentBinding(var244);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0371.$ic101$), var244);
                try {
                    SubLObject var250 = (SubLObject)module0371.NIL;
                    var245 = module0423.f29563(var243);
                    var246 = module0423.f29569(var243);
                    var250 = module0423.f29573(var243);
                    var247 = conses_high.putf(conses_high.putf(conses_high.putf(conses_high.copy_list(var250), (SubLObject)module0371.$ic102$, (SubLObject)module0371.$ic103$), (SubLObject)module0371.$ic104$, (SubLObject)module0371.T), (SubLObject)module0371.$ic105$, (SubLObject)module0371.$ic106$);
                    PrintLow.format((SubLObject)module0371.T, (SubLObject)module0371.$ic107$, module0051.f3552((SubLObject)module0371.UNPROVIDED), var243);
                    streams_high.force_output((SubLObject)module0371.T);
                }
                catch (Throwable var251) {
                    Errors.handleThrowable(var251, (SubLObject)module0371.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var249, var244);
            }
        }
        catch (Throwable var252) {
            var248 = Errors.handleThrowable(var252, (SubLObject)module0371.$ic100$);
        }
        finally {
            var244.throwStack.pop();
        }
        if (module0371.NIL != module0035.sublisp_boolean(var245) && module0371.NIL != module0035.sublisp_boolean(var246) && module0371.NIL != module0035.sublisp_boolean(var247)) {
            final SubLObject var253 = Values.arg2(var244.resetMultipleValues(), (SubLObject)Values.multiple_value_list(module0409.f28506(var245, var246, var247)));
            return var253;
        }
        return (SubLObject)module0371.NIL;
    }
    
    public static SubLObject f26058(final SubLObject var231) {
        final SubLThread var232 = SubLProcess.currentSubLThread();
        final SubLObject var233 = module0067.f4880(Symbols.symbol_function((SubLObject)module0371.EQUAL), (SubLObject)module0371.UNPROVIDED);
        SubLObject var234 = (SubLObject)module0371.NIL;
        SubLObject var235 = (SubLObject)module0371.ZERO_INTEGER;
        SubLObject var236 = (SubLObject)module0371.NIL;
        try {
            final SubLObject var237 = stream_macros.$stream_requires_locking$.currentBinding(var232);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0371.NIL, var232);
                var236 = compatibility.open_binary(var231, (SubLObject)module0371.$ic108$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var237, var232);
            }
            if (!var236.isStream()) {
                Errors.error((SubLObject)module0371.$ic109$, var231);
            }
            final SubLObject var238 = var236;
            final SubLObject var239 = module0021.$g777$.currentBinding(var232);
            try {
                module0021.$g777$.bind((SubLObject)module0371.NIL, var232);
                module0021.f1149(module0414.f28992());
                while (module0371.NIL == var234) {
                    final SubLObject var240 = module0414.f28993(var238);
                    if (module0371.$ic110$ == var240) {
                        var234 = (SubLObject)module0371.T;
                    }
                    else if (var240.isString()) {
                        Errors.warn((SubLObject)module0371.$ic111$, var240);
                    }
                    else {
                        SubLObject var242;
                        final SubLObject var241 = var242 = var240;
                        SubLObject var243 = (SubLObject)module0371.NIL;
                        SubLObject var244 = (SubLObject)module0371.NIL;
                        SubLObject var245 = (SubLObject)module0371.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var242, var241, (SubLObject)module0371.$ic112$);
                        var243 = var242.first();
                        var242 = var242.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var242, var241, (SubLObject)module0371.$ic112$);
                        var244 = var242.first();
                        var242 = var242.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var242, var241, (SubLObject)module0371.$ic112$);
                        var245 = var242.first();
                        var242 = var242.rest();
                        if (module0371.NIL == var242) {
                            if (module0371.NIL == module0362.f24446(var243)) {
                                var243 = module0370.f25894(var243, var244, (SubLObject)module0371.$ic45$);
                            }
                            if (module0371.NIL != module0362.f24446(var243)) {
                                module0084.f5775(var233, (SubLObject)ConsesLow.cons(var244, f26041(var243)), (SubLObject)module0371.UNPROVIDED);
                            }
                            else {
                                print_high.print(var243, (SubLObject)module0371.UNPROVIDED);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var241, (SubLObject)module0371.$ic112$);
                        }
                        var235 = Numbers.add(var235, (SubLObject)module0371.ONE_INTEGER);
                    }
                }
            }
            finally {
                module0021.$g777$.rebind(var239, var232);
            }
        }
        finally {
            final SubLObject var246 = Threads.$is_thread_performing_cleanupP$.currentBinding(var232);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0371.T, var232);
                if (var236.isStream()) {
                    streams_high.close(var236, (SubLObject)module0371.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var246, var232);
            }
        }
        return var233;
    }
    
    public static SubLObject f26059(final SubLObject var259, final SubLObject var260, SubLObject var261) {
        if (var261 == module0371.UNPROVIDED) {
            var261 = (SubLObject)module0371.NIL;
        }
        final SubLThread var262 = SubLProcess.currentSubLThread();
        SubLObject var263 = (SubLObject)module0371.NIL;
        try {
            final SubLObject var264 = stream_macros.$stream_requires_locking$.currentBinding(var262);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0371.NIL, var262);
                var263 = compatibility.open_binary(var259, (SubLObject)module0371.$ic113$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var264, var262);
            }
            if (!var263.isStream()) {
                Errors.error((SubLObject)module0371.$ic109$, var259);
            }
            final SubLObject var263_264 = var263;
            module0012.$g82$.setDynamicValue((SubLObject)module0371.$ic114$, var262);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var262);
            module0012.$g83$.setDynamicValue(Sequences.length(var260), var262);
            module0012.$g84$.setDynamicValue((SubLObject)module0371.ZERO_INTEGER, var262);
            final SubLObject var265 = module0012.$g75$.currentBinding(var262);
            final SubLObject var266 = module0012.$g76$.currentBinding(var262);
            final SubLObject var267 = module0012.$g77$.currentBinding(var262);
            final SubLObject var268 = module0012.$g78$.currentBinding(var262);
            try {
                module0012.$g75$.bind((SubLObject)module0371.ZERO_INTEGER, var262);
                module0012.$g76$.bind((SubLObject)module0371.NIL, var262);
                module0012.$g77$.bind((SubLObject)module0371.T, var262);
                module0012.$g78$.bind(Time.get_universal_time(), var262);
                module0012.f478(module0012.$g82$.getDynamicValue(var262));
                SubLObject var269 = var260;
                SubLObject var270 = (SubLObject)module0371.NIL;
                var270 = var269.first();
                while (module0371.NIL != var269) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var262), module0012.$g83$.getDynamicValue(var262));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var262), (SubLObject)module0371.ONE_INTEGER), var262);
                    SubLObject var271 = (SubLObject)module0371.NIL;
                    SubLObject var272 = (SubLObject)module0371.NIL;
                    try {
                        var262.throwStack.push(module0371.$ic100$);
                        final SubLObject var238_267 = Errors.$error_handler$.currentBinding(var262);
                        try {
                            Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0371.$ic101$), var262);
                            try {
                                final SubLObject var273 = module0003.f61();
                                try {
                                    var262.throwStack.push(var273);
                                    final SubLObject var238_268 = module0003.$g4$.currentBinding(var262);
                                    try {
                                        module0003.$g4$.bind((SubLObject)module0371.T, var262);
                                        SubLObject var274 = (SubLObject)module0371.NIL;
                                        try {
                                            final SubLObject var238_269 = module0003.$g5$.currentBinding(var262);
                                            try {
                                                module0003.$g5$.bind(Numbers.add((SubLObject)module0371.ONE_INTEGER, module0003.$g5$.getDynamicValue(var262)), var262);
                                                var274 = module0003.f62(module0424.$g3162$.getGlobalValue(), var273);
                                                f26060(var263_264, var270, var261);
                                            }
                                            finally {
                                                module0003.$g5$.rebind(var238_269, var262);
                                            }
                                        }
                                        finally {
                                            final SubLObject var238_270 = Threads.$is_thread_performing_cleanupP$.currentBinding(var262);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0371.T, var262);
                                                module0003.f64(var274);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var238_270, var262);
                                            }
                                        }
                                    }
                                    finally {
                                        module0003.$g4$.rebind(var238_268, var262);
                                    }
                                }
                                catch (Throwable var275) {
                                    var271 = Errors.handleThrowable(var275, var273);
                                }
                                finally {
                                    var262.throwStack.pop();
                                }
                            }
                            catch (Throwable var276) {
                                Errors.handleThrowable(var276, (SubLObject)module0371.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(var238_267, var262);
                        }
                    }
                    catch (Throwable var277) {
                        var272 = Errors.handleThrowable(var277, (SubLObject)module0371.$ic100$);
                    }
                    finally {
                        var262.throwStack.pop();
                    }
                    if (module0371.NIL != var271) {
                        Errors.warn((SubLObject)module0371.$ic115$, var270);
                    }
                    var269 = var269.rest();
                    var270 = var269.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var268, var262);
                module0012.$g77$.rebind(var267, var262);
                module0012.$g76$.rebind(var266, var262);
                module0012.$g75$.rebind(var265, var262);
            }
        }
        finally {
            final SubLObject var278 = Threads.$is_thread_performing_cleanupP$.currentBinding(var262);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0371.T, var262);
                if (var263.isStream()) {
                    streams_high.close(var263, (SubLObject)module0371.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var278, var262);
            }
        }
        return var259;
    }
    
    public static SubLObject f26060(final SubLObject var263, final SubLObject var234, SubLObject var261) {
        if (var261 == module0371.UNPROVIDED) {
            var261 = (SubLObject)module0371.NIL;
        }
        final SubLThread var264 = SubLProcess.currentSubLThread();
        var264.resetMultipleValues();
        final SubLObject var265 = f26061(var234, var261);
        final SubLObject var266 = var264.secondMultipleValue();
        final SubLObject var267 = var264.thirdMultipleValue();
        final SubLObject var268 = var264.fourthMultipleValue();
        var264.resetMultipleValues();
        SubLObject var270;
        final SubLObject var269 = var270 = var265;
        SubLObject var271 = (SubLObject)module0371.NIL;
        SubLObject var272 = (SubLObject)module0371.NIL;
        SubLObject var273 = (SubLObject)module0371.NIL;
        SubLObject var274 = (SubLObject)module0371.NIL;
        SubLObject var275 = (SubLObject)module0371.NIL;
        SubLObject var276 = (SubLObject)module0371.NIL;
        SubLObject var277 = (SubLObject)module0371.NIL;
        SubLObject var278 = (SubLObject)module0371.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var270, var269, (SubLObject)module0371.$ic116$);
        var271 = var270.first();
        var270 = var270.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var270, var269, (SubLObject)module0371.$ic116$);
        var272 = var270.first();
        var270 = var270.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var270, var269, (SubLObject)module0371.$ic116$);
        var273 = var270.first();
        var270 = var270.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var270, var269, (SubLObject)module0371.$ic116$);
        var274 = var270.first();
        var270 = var270.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var270, var269, (SubLObject)module0371.$ic116$);
        var275 = var270.first();
        var270 = var270.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var270, var269, (SubLObject)module0371.$ic116$);
        var276 = var270.first();
        var270 = var270.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var270, var269, (SubLObject)module0371.$ic116$);
        var277 = var270.first();
        var270 = var270.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var270, var269, (SubLObject)module0371.$ic116$);
        var278 = var270.first();
        var270 = var270.rest();
        if (module0371.NIL == var270) {
            SubLObject var289_290;
            final SubLObject var287_288 = var289_290 = var266;
            SubLObject var279 = (SubLObject)module0371.NIL;
            SubLObject var280 = (SubLObject)module0371.NIL;
            SubLObject var281 = (SubLObject)module0371.NIL;
            SubLObject var282 = (SubLObject)module0371.NIL;
            SubLObject var283 = (SubLObject)module0371.NIL;
            SubLObject var284 = (SubLObject)module0371.NIL;
            SubLObject var285 = (SubLObject)module0371.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var289_290, var287_288, (SubLObject)module0371.$ic117$);
            var279 = var289_290.first();
            var289_290 = var289_290.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var289_290, var287_288, (SubLObject)module0371.$ic117$);
            var280 = var289_290.first();
            var289_290 = var289_290.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var289_290, var287_288, (SubLObject)module0371.$ic117$);
            var281 = var289_290.first();
            var289_290 = var289_290.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var289_290, var287_288, (SubLObject)module0371.$ic117$);
            var282 = var289_290.first();
            var289_290 = var289_290.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var289_290, var287_288, (SubLObject)module0371.$ic117$);
            var283 = var289_290.first();
            var289_290 = var289_290.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var289_290, var287_288, (SubLObject)module0371.$ic117$);
            var284 = var289_290.first();
            var289_290 = var289_290.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var289_290, var287_288, (SubLObject)module0371.$ic117$);
            var285 = var289_290.first();
            var289_290 = var289_290.rest();
            if (module0371.NIL == var289_290) {
                final SubLObject var298_299 = (SubLObject)ConsesLow.list(new SubLObject[] { var272, var273, var274, var275, var276, var277, var278, var267, var279, var280, var281, var282, var283, var284, var285, var268 });
                module0021.f1040(var298_299, var263);
                streams_high.force_output(var263);
                return var298_299;
            }
            cdestructuring_bind.cdestructuring_bind_error(var287_288, (SubLObject)module0371.$ic117$);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var269, (SubLObject)module0371.$ic116$);
        }
        return (SubLObject)module0371.NIL;
    }
    
    public static SubLObject f26062(final SubLObject var231) {
        final SubLThread var232 = SubLProcess.currentSubLThread();
        SubLObject var233 = (SubLObject)module0371.NIL;
        SubLObject var234 = (SubLObject)module0371.NIL;
        try {
            final SubLObject var235 = stream_macros.$stream_requires_locking$.currentBinding(var232);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0371.NIL, var232);
                var234 = compatibility.open_binary(var231, (SubLObject)module0371.$ic108$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var235, var232);
            }
            if (!var234.isStream()) {
                Errors.error((SubLObject)module0371.$ic109$, var231);
            }
            final SubLObject var263_302 = var234;
            SubLObject var236 = (SubLObject)module0371.NIL;
            while (module0371.$ic110$ != var236) {
                var236 = module0021.f1060(var263_302, (SubLObject)module0371.NIL, (SubLObject)module0371.$ic110$);
                if (module0371.$ic110$ != var236) {
                    var233 = (SubLObject)ConsesLow.cons(var236, var233);
                }
            }
        }
        finally {
            final SubLObject var237 = Threads.$is_thread_performing_cleanupP$.currentBinding(var232);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0371.T, var232);
                if (var234.isStream()) {
                    streams_high.close(var234, (SubLObject)module0371.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var237, var232);
            }
        }
        return Sequences.nreverse(var233);
    }
    
    public static SubLObject f26063(final SubLObject var303) {
        if (var303.eql((SubLObject)module0371.$ic119$)) {
            return Values.values((SubLObject)module0371.ZERO_INTEGER, (SubLObject)module0371.EIGHT_INTEGER);
        }
        if (var303.eql((SubLObject)module0371.$ic120$)) {
            return Values.values((SubLObject)module0371.ONE_INTEGER, (SubLObject)module0371.NINE_INTEGER);
        }
        if (var303.eql((SubLObject)module0371.$ic121$)) {
            return Values.values((SubLObject)module0371.TWO_INTEGER, (SubLObject)module0371.TEN_INTEGER);
        }
        if (var303.eql((SubLObject)module0371.$ic122$)) {
            return Values.values((SubLObject)module0371.THREE_INTEGER, (SubLObject)module0371.ELEVEN_INTEGER);
        }
        if (var303.eql((SubLObject)module0371.$ic123$)) {
            return Values.values((SubLObject)module0371.FOUR_INTEGER, (SubLObject)module0371.TWELVE_INTEGER);
        }
        if (var303.eql((SubLObject)module0371.$ic124$)) {
            return Values.values((SubLObject)module0371.FIVE_INTEGER, (SubLObject)module0371.THIRTEEN_INTEGER);
        }
        if (var303.eql((SubLObject)module0371.$ic125$)) {
            return Values.values((SubLObject)module0371.SIX_INTEGER, (SubLObject)module0371.FOURTEEN_INTEGER);
        }
        if (var303.eql((SubLObject)module0371.$ic126$)) {
            return Values.values((SubLObject)module0371.SEVEN_INTEGER, (SubLObject)module0371.FIFTEEN_INTEGER);
        }
        return Errors.error((SubLObject)module0371.$ic127$, var303);
    }
    
    public static SubLObject f26064(final SubLObject var298, final SubLObject var303) {
        final SubLThread var304 = SubLProcess.currentSubLThread();
        var304.resetMultipleValues();
        final SubLObject var305 = f26063(var303);
        final SubLObject var306 = var304.secondMultipleValue();
        var304.resetMultipleValues();
        return Values.values(ConsesLow.nth(var305, var298), ConsesLow.nth(var306, var298));
    }
    
    public static SubLObject f26065(final SubLObject var231) {
        final SubLThread var232 = SubLProcess.currentSubLThread();
        final SubLObject var233 = module0067.f4880(Symbols.symbol_function((SubLObject)module0371.EQL), (SubLObject)module0371.UNPROVIDED);
        final SubLObject var234 = f26062(var231);
        if (var234.isCons()) {
            SubLObject var235 = var234;
            SubLObject var236 = (SubLObject)module0371.NIL;
            var236 = var235.first();
            while (module0371.NIL != var235) {
                var232.resetMultipleValues();
                final SubLObject var237 = f26064(var236, (SubLObject)module0371.$ic125$);
                final SubLObject var238 = var232.secondMultipleValue();
                var232.resetMultipleValues();
                final SubLObject var239 = module0004.f105(var237);
                final SubLObject var240 = module0004.f105(var238);
                if (module0371.NIL != var239) {
                    if (module0371.NIL != var240) {
                        module0084.f5775(var233, (SubLObject)module0371.$ic128$, (SubLObject)module0371.UNPROVIDED);
                    }
                    else {
                        module0084.f5775(var233, (SubLObject)module0371.$ic129$, (SubLObject)module0371.UNPROVIDED);
                    }
                }
                else if (module0371.NIL != var240) {
                    module0084.f5775(var233, (SubLObject)module0371.$ic130$, (SubLObject)module0371.UNPROVIDED);
                }
                else {
                    module0084.f5775(var233, (SubLObject)module0371.$ic131$, (SubLObject)module0371.UNPROVIDED);
                }
                var235 = var235.rest();
                var236 = var235.first();
            }
        }
        return var233;
    }
    
    public static SubLObject f26066(final SubLObject var231, final SubLObject var303, SubLObject var310, SubLObject var311) {
        if (var310 == module0371.UNPROVIDED) {
            var310 = (SubLObject)module0371.NIL;
        }
        if (var311 == module0371.UNPROVIDED) {
            var311 = (SubLObject)module0371.NIL;
        }
        final SubLThread var312 = SubLProcess.currentSubLThread();
        final SubLObject var313 = f26062(var231);
        SubLObject var314 = (SubLObject)module0371.NIL;
        SubLObject var315 = (SubLObject)module0371.NIL;
        if (var313.isCons()) {
            SubLObject var316 = var313;
            SubLObject var317 = (SubLObject)module0371.NIL;
            var317 = var316.first();
            while (module0371.NIL != var316) {
                var312.resetMultipleValues();
                final SubLObject var318 = f26064(var317, (SubLObject)module0371.$ic125$);
                final SubLObject var319 = var312.secondMultipleValue();
                var312.resetMultipleValues();
                final SubLObject var320 = module0004.f105(var318);
                final SubLObject var321 = module0004.f105(var319);
                if (module0371.NIL != var320 && module0371.NIL != var321) {
                    var312.resetMultipleValues();
                    final SubLObject var322 = f26064(var317, var303);
                    final SubLObject var323 = var312.secondMultipleValue();
                    var312.resetMultipleValues();
                    var314 = (SubLObject)ConsesLow.cons(var322, var314);
                    var315 = (SubLObject)ConsesLow.cons(var323, var315);
                }
                var316 = var316.rest();
                var317 = var316.first();
            }
        }
        final SubLObject var324 = var311;
        if (var324.eql((SubLObject)module0371.$ic132$)) {
            var314 = Sort.sort(var314, Symbols.symbol_function((SubLObject)module0371.$ic133$), (SubLObject)module0371.UNPROVIDED);
            var315 = Sort.sort(var315, Symbols.symbol_function((SubLObject)module0371.$ic133$), (SubLObject)module0371.UNPROVIDED);
        }
        else if (var324.eql((SubLObject)module0371.$ic134$)) {
            SubLObject var325 = (SubLObject)module0371.NIL;
            SubLObject var326 = (SubLObject)module0371.NIL;
            SubLObject var314_318 = (SubLObject)module0371.NIL;
            SubLObject var327 = (SubLObject)module0371.NIL;
            SubLObject var315_320 = (SubLObject)module0371.NIL;
            var326 = var314;
            var314_318 = var326.first();
            var327 = var315;
            var315_320 = var327.first();
            while (module0371.NIL != var327 || module0371.NIL != var326) {
                var325 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var314_318, var315_320), var325);
                var326 = var326.rest();
                var314_318 = var326.first();
                var327 = var327.rest();
                var315_320 = var327.first();
            }
            var325 = Sort.sort(var325, Symbols.symbol_function((SubLObject)module0371.$ic133$), Symbols.symbol_function((SubLObject)module0371.$ic135$));
            var314 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0371.$ic135$), var325);
            var315 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0371.$ic136$), var325);
        }
        else if (var324.eql((SubLObject)module0371.$ic137$)) {
            SubLObject var325 = (SubLObject)module0371.NIL;
            SubLObject var328 = (SubLObject)module0371.NIL;
            SubLObject var314_319 = (SubLObject)module0371.NIL;
            SubLObject var329 = (SubLObject)module0371.NIL;
            SubLObject var315_321 = (SubLObject)module0371.NIL;
            var328 = var314;
            var314_319 = var328.first();
            var329 = var315;
            var315_321 = var329.first();
            while (module0371.NIL != var329 || module0371.NIL != var328) {
                var325 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var314_319, var315_321), var325);
                var328 = var328.rest();
                var314_319 = var328.first();
                var329 = var329.rest();
                var315_321 = var329.first();
            }
            var325 = Sort.sort(var325, Symbols.symbol_function((SubLObject)module0371.$ic133$), Symbols.symbol_function((SubLObject)module0371.$ic136$));
            var314 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0371.$ic135$), var325);
            var315 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0371.$ic136$), var325);
        }
        else {
            Errors.error((SubLObject)module0371.$ic138$, var311);
        }
        final SubLObject var330 = Mapping.mapcar((SubLObject)module0371.$ic139$, (SubLObject)ConsesLow.list(var314, var315));
        if (var311 == module0371.$ic132$) {
            module0548.f33818(var330, var310);
        }
        else {
            module0548.f33829(var330, var310);
        }
        return (SubLObject)module0371.NIL;
    }
    
    public static SubLObject f26061(final SubLObject var234, SubLObject var261) {
        if (var261 == module0371.UNPROVIDED) {
            var261 = (SubLObject)module0371.NIL;
        }
        final SubLThread var262 = SubLProcess.currentSubLThread();
        final SubLObject var263 = module0423.f29563(var234);
        final SubLObject var264 = module0423.f29569(var234);
        SubLObject var265 = module0423.f29573(var234);
        var265 = module0035.f2341(var265, var261);
        var262.resetMultipleValues();
        final SubLObject var266 = f26067(var263, var264, var265, module0371.$g3163$.getGlobalValue());
        final SubLObject var267 = var262.secondMultipleValue();
        final SubLObject var268 = var262.thirdMultipleValue();
        final SubLObject var269 = var262.fourthMultipleValue();
        final SubLObject var270 = var262.fifthMultipleValue();
        final SubLObject var271 = var262.sixthMultipleValue();
        final SubLObject var272 = var262.seventhMultipleValue();
        final SubLObject var273 = var262.eighthMultipleValue();
        var262.resetMultipleValues();
        return Values.values(var272, var273, var270, var271);
    }
    
    public static SubLObject f26068(final SubLObject var234, SubLObject var261) {
        if (var261 == module0371.UNPROVIDED) {
            var261 = (SubLObject)module0371.NIL;
        }
        final SubLObject var262 = module0423.f29563(var234);
        final SubLObject var263 = module0423.f29569(var234);
        SubLObject var264 = module0423.f29573(var234);
        var264 = module0035.f2341(var264, var261);
        return f26069(var262, var263, var264);
    }
    
    public static SubLObject f26069(final SubLObject var245, final SubLObject var54, SubLObject var246) {
        if (var246 == module0371.UNPROVIDED) {
            var246 = (SubLObject)module0371.NIL;
        }
        final SubLThread var247 = SubLProcess.currentSubLThread();
        var247.resetMultipleValues();
        final SubLObject var248 = f26067(var245, var54, var246, (SubLObject)module0371.$ic140$);
        SubLObject var249 = var247.secondMultipleValue();
        final SubLObject var250 = var247.thirdMultipleValue();
        final SubLObject var251 = var247.fourthMultipleValue();
        final SubLObject var252 = var247.fifthMultipleValue();
        final SubLObject var253 = var247.sixthMultipleValue();
        final SubLObject var254 = var247.seventhMultipleValue();
        final SubLObject var255 = var247.eighthMultipleValue();
        var247.resetMultipleValues();
        SubLObject var257;
        final SubLObject var256 = var257 = var254;
        SubLObject var258 = (SubLObject)module0371.NIL;
        SubLObject var259 = (SubLObject)module0371.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var257, var256, (SubLObject)module0371.$ic141$);
        var258 = var257.first();
        var257 = var257.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var257, var256, (SubLObject)module0371.$ic141$);
        var259 = var257.first();
        var257 = var257.rest();
        if (module0371.NIL == var257) {
            SubLObject var334_335;
            final SubLObject var332_333 = var334_335 = var255;
            SubLObject var260 = (SubLObject)module0371.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var334_335, var332_333, (SubLObject)module0371.$ic142$);
            var260 = var334_335.first();
            var334_335 = var334_335.rest();
            if (module0371.NIL == var334_335) {
                if (!var260.numLE(var259)) {
                    var249 = (SubLObject)module0371.T;
                    Errors.warn((SubLObject)module0371.$ic143$, var259, var260);
                }
                return (SubLObject)ConsesLow.list(new SubLObject[] { var248, var249, var258, var250, var251, var252, var253, var259, var260 });
            }
            cdestructuring_bind.cdestructuring_bind_error(var332_333, (SubLObject)module0371.$ic142$);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var256, (SubLObject)module0371.$ic141$);
        }
        return (SubLObject)module0371.NIL;
    }
    
    public static SubLObject f26067(final SubLObject var245, final SubLObject var54, SubLObject var246, final SubLObject var336) {
        final SubLThread var337 = SubLProcess.currentSubLThread();
        var246 = conses_high.putf(conses_high.copy_list(var246), (SubLObject)module0371.$ic102$, (SubLObject)ConsesLow.cons((SubLObject)module0371.$ic95$, var336));
        var337.resetMultipleValues();
        final SubLObject var338 = module0409.f28506(var245, var54, var246);
        final SubLObject var339 = var337.secondMultipleValue();
        final SubLObject var340 = var337.thirdMultipleValue();
        final SubLObject var341 = var337.fourthMultipleValue();
        var337.resetMultipleValues();
        final SubLObject var342 = var341.first();
        final SubLObject var343 = f26048(var342);
        SubLObject var344 = module0035.f2341(var246, var343);
        var344 = conses_high.putf(conses_high.copy_list(var344), (SubLObject)module0371.$ic102$, var336);
        var337.resetMultipleValues();
        final SubLObject var345 = module0409.f28506(var245, var54, var344);
        final SubLObject var346 = var337.secondMultipleValue();
        final SubLObject var347 = var337.thirdMultipleValue();
        final SubLObject var348 = var337.fourthMultipleValue();
        var337.resetMultipleValues();
        var337.resetMultipleValues();
        final SubLObject var349 = module0233.f15366(var338, var345);
        final SubLObject var350 = var337.secondMultipleValue();
        var337.resetMultipleValues();
        SubLObject var351 = (SubLObject)module0371.NIL;
        final SubLObject var352 = (SubLObject)module0371.NIL;
        if (module0371.NIL != var349) {
            var351 = (SubLObject)module0371.T;
            Errors.warn((SubLObject)module0371.$ic144$, var349);
        }
        if (module0371.NIL != var350) {
            Errors.warn((SubLObject)module0371.$ic145$, var350);
        }
        oc_inference_datastructures_inference.f25476(var340);
        oc_inference_datastructures_inference.f25476(var347);
        return Values.values(var351, var352, var338, var345, var339, var346, var341, var348);
    }
    
    public static SubLObject f26070(final SubLObject var234, final SubLObject var343) {
        final SubLObject var344 = module0423.f29563(var234);
        final SubLObject var345 = module0423.f29569(var234);
        final SubLObject var346 = module0423.f29573(var234);
        return f26071(var344, var345, var346, var343);
    }
    
    public static SubLObject f26071(final SubLObject var245, final SubLObject var54, final SubLObject var246, final SubLObject var343) {
        SubLObject var344 = (SubLObject)module0371.NIL;
        SubLObject var345 = (SubLObject)module0371.NIL;
        SubLObject var346 = (SubLObject)module0371.NIL;
        SubLObject var347 = (SubLObject)module0371.NIL;
        SubLObject var348 = (SubLObject)module0371.NIL;
        SubLObject var349 = (SubLObject)module0371.NIL;
        SubLObject var350 = (SubLObject)module0371.NIL;
        SubLObject var351 = (SubLObject)module0371.NIL;
        SubLObject var352 = (SubLObject)module0371.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var343, var343, (SubLObject)module0371.$ic146$);
        var344 = var343.first();
        SubLObject var353 = var343.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var353, var343, (SubLObject)module0371.$ic146$);
        var345 = var353.first();
        var353 = var353.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var353, var343, (SubLObject)module0371.$ic146$);
        var346 = var353.first();
        var353 = var353.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var353, var343, (SubLObject)module0371.$ic146$);
        var347 = var353.first();
        var353 = var353.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var353, var343, (SubLObject)module0371.$ic146$);
        var348 = var353.first();
        var353 = var353.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var353, var343, (SubLObject)module0371.$ic146$);
        var349 = var353.first();
        var353 = var353.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var353, var343, (SubLObject)module0371.$ic146$);
        var350 = var353.first();
        var353 = var353.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var353, var343, (SubLObject)module0371.$ic146$);
        var351 = var353.first();
        var353 = var353.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var353, var343, (SubLObject)module0371.$ic146$);
        var352 = var353.first();
        var353 = var353.rest();
        if (module0371.NIL == var353) {
            final SubLObject var354 = f26048(var346);
            SubLObject var355 = module0035.f2341(var246, var354);
            var355 = conses_high.putf(conses_high.copy_list(var355), (SubLObject)module0371.$ic104$, (SubLObject)module0371.T);
            return module0409.f28506(var245, var54, var355);
        }
        cdestructuring_bind.cdestructuring_bind_error(var343, (SubLObject)module0371.$ic146$);
        return (SubLObject)module0371.NIL;
    }
    
    public static SubLObject f26072(SubLObject var346) {
        if (var346 == module0371.UNPROVIDED) {
            var346 = (SubLObject)module0371.$ic147$;
        }
        final SubLThread var347 = SubLProcess.currentSubLThread();
        module0027.f1434((SubLObject)module0371.$ic148$, StreamsLow.$standard_output$.getDynamicValue(var347), var346, (SubLObject)module0371.UNPROVIDED);
        module0027.f1434((SubLObject)module0371.$ic63$, StreamsLow.$standard_output$.getDynamicValue(var347), var346, (SubLObject)module0371.UNPROVIDED);
        return (SubLObject)module0371.NIL;
    }
    
    public static SubLObject f26073(final SubLObject var243) {
        return module0193.f12094(module0035.f2113(Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)module0371.THREE_INTEGER), module0409.f28506(var243, module0371.$ic149$, (SubLObject)module0371.$ic150$))).first());
    }
    
    public static SubLObject f26074() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25933", "S#27900", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25934", "S#28963", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25936", "S#28964", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25938", "S#28965", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25939", "S#28966", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25940", "S#28967", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25937", "S#28968", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25935", "S#28969", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25943", "S#28970", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25941", "S#28971", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25944", "S#28972", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25945", "S#28973", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25950", "S#28974", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25947", "S#28975", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25948", "S#28976", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25952", "S#28977", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25946", "S#28978", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25953", "S#28979", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25954", "S#28980", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25955", "S#28981", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25956", "S#28982", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25957", "S#28983", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25958", "S#28984", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25949", "S#28985", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25942", "S#28986", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25951", "S#28987", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25959", "S#28988", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25960", "S#28989", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25961", "S#28990", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25962", "S#28991", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25963", "S#28992", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25964", "S#28993", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25965", "S#28994", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25966", "S#28995", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25967", "S#28996", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25968", "S#28997", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25969", "S#28998", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25970", "S#28999", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25971", "S#29000", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25972", "S#29001", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25973", "S#29002", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25974", "S#29003", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25975", "S#29004", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25978", "S#29005", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25979", "S#29006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25980", "S#29007", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25981", "S#29008", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25986", "S#29009", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25982", "S#29010", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25983", "S#29011", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25984", "S#29012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25987", "S#29013", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25985", "S#29014", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25988", "S#29015", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25990", "S#29016", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25989", "S#29017", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25991", "S#29018", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25992", "S#29019", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0371", "f25995", "S#29020");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25993", "S#29021", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25994", "S#29022", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25997", "S#29023", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25996", "S#29024", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26008", "S#29025", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25998", "S#29026", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25999", "S#29027", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26000", "S#29028", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26001", "S#29029", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26002", "S#29030", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26003", "S#29031", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26005", "S#29032", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26004", "S#29033", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26006", "S#29034", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26007", "S#29035", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26016", "S#29036", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26009", "S#29037", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26013", "S#29038", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26015", "S#29039", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26014", "S#29040", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26011", "S#29041", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26010", "S#29042", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26012", "S#29043", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26017", "S#29044", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25977", "S#29045", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26018", "S#27907", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26024", "S#29046", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26025", "S#29047", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26020", "S#29048", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26021", "S#29049", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26022", "S#29050", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26023", "S#29051", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26028", "S#29052", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26026", "S#29053", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26029", "S#29054", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26027", "S#29055", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26019", "S#29056", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f25976", "S#25429", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26031", "S#29057", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26030", "S#29058", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26032", "S#29059", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26033", "S#29060", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26034", "S#29061", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26035", "S#29062", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26036", "S#29063", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26038", "S#29064", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26037", "S#29065", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26040", "S#29066", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26039", "S#29067", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26041", "S#29068", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26042", "S#29069", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26043", "S#29070", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26045", "S#29071", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26046", "S#29072", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26044", "S#29073", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26047", "S#29074", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26048", "S#29075", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26049", "S#29076", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26050", "S#29077", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26051", "S#29078", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26052", "S#29079", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26053", "S#29080", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26054", "S#29081", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26055", "S#29082", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26056", "S#29083", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26057", "S#29084", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26058", "S#29085", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26059", "S#29086", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26060", "S#29087", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26062", "S#29088", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26063", "S#29089", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26064", "S#29090", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26065", "S#29091", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26066", "S#29092", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26061", "S#29093", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26068", "S#29094", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26069", "S#29095", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26067", "S#29096", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26070", "S#29097", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26071", "S#29098", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26072", "S#29099", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0371", "f26073", "S#29100", 1, 0, false);
        return (SubLObject)module0371.NIL;
    }
    
    public static SubLObject f26075() {
        module0371.$g3160$ = SubLFiles.deflexical("S#29101", (module0371.NIL != Symbols.boundp((SubLObject)module0371.$ic94$)) ? module0371.$g3160$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0371.EQL), (SubLObject)module0371.UNPROVIDED));
        module0371.$g3161$ = SubLFiles.defparameter("S#29102", (SubLObject)module0371.NIL);
        module0371.$g3163$ = SubLFiles.deflexical("S#29103", (SubLObject)module0371.$ic118$);
        return (SubLObject)module0371.NIL;
    }
    
    public static SubLObject f26076() {
        module0003.f57((SubLObject)module0371.$ic94$);
        module0027.f1449((SubLObject)module0371.$ic148$, (SubLObject)ConsesLow.list(new SubLObject[] { module0371.$ic151$, Symbols.symbol_function((SubLObject)module0371.EQUAL), module0371.$ic152$, module0371.NIL, module0371.$ic153$, module0371.NIL, module0371.$ic154$, module0371.$ic155$, module0371.$ic156$, module0371.T }), (SubLObject)module0371.$ic157$);
        module0027.f1449((SubLObject)module0371.$ic63$, (SubLObject)ConsesLow.list(new SubLObject[] { module0371.$ic151$, Symbols.symbol_function((SubLObject)module0371.EQUAL), module0371.$ic152$, module0371.NIL, module0371.$ic153$, module0371.NIL, module0371.$ic154$, module0371.$ic155$, module0371.$ic156$, module0371.T }), (SubLObject)module0371.$ic158$);
        return (SubLObject)module0371.NIL;
    }
    
    public void declareFunctions() {
        f26074();
    }
    
    public void initializeVariables() {
        f26075();
    }
    
    public void runTopLevelForms() {
        f26076();
    }
    
    static {
        me = (SubLFile)new module0371();
        module0371.$g3160$ = null;
        module0371.$g3161$ = null;
        module0371.$g3163$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("ANYTHING");
        $ic1$ = SubLObjectFactory.makeKeyword("NOTHING");
        $ic2$ = SubLObjectFactory.makeKeyword("OR");
        $ic3$ = SubLObjectFactory.makeSymbol("S#27900", "CYC");
        $ic4$ = SubLObjectFactory.makeKeyword("UNION");
        $ic5$ = SubLObjectFactory.makeKeyword("JOIN");
        $ic6$ = SubLObjectFactory.makeKeyword("SPLIT");
        $ic7$ = SubLObjectFactory.makeKeyword("RESTRICTION");
        $ic8$ = SubLObjectFactory.makeKeyword("JOIN-ORDERED");
        $ic9$ = SubLObjectFactory.makeKeyword("REMOVAL");
        $ic10$ = SubLObjectFactory.makeKeyword("CONJUNCTIVE-REMOVAL");
        $ic11$ = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $ic12$ = SubLObjectFactory.makeKeyword("RESIDUAL-TRANSFORMATION");
        $ic13$ = SubLObjectFactory.makeKeyword("REWRITE");
        $ic14$ = SubLObjectFactory.makeSymbol("S#28980", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#28975", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#28981", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#28976", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#28982", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#28977", "CYC");
        $ic20$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("not"));
        $ic21$ = SubLObjectFactory.makeKeyword("NOT");
        $ic22$ = SubLObjectFactory.makeKeyword("AND");
        $ic23$ = SubLObjectFactory.makeSymbol("S#28979", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#28967", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#28968", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#28966", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#28964", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic29$ = SubLObjectFactory.makeSymbol("S#28972", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#28973", "CYC");
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29104", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29105", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29106", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29107", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29108", "CYC"));
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOTHING"));
        $ic33$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#29109", "CYC"));
        $ic34$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#29110", "CYC"));
        $ic35$ = SubLObjectFactory.makeSymbol("S#26816", "CYC");
        $ic36$ = SubLObjectFactory.makeString("time to support ~S proofs");
        $ic37$ = SubLObjectFactory.makeSymbol("S#28927", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $ic39$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28165", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29111", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29112", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OR"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic40$ = SubLObjectFactory.makeSymbol("CLET");
        $ic41$ = SubLObjectFactory.makeSymbol("SET-ADD");
        $ic42$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic43$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic44$ = SubLObjectFactory.makeSymbol("DELETE");
        $ic45$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic46$ = SubLObjectFactory.makeSymbol("PCOND");
        $ic47$ = SubLObjectFactory.makeSymbol("NULL");
        $ic48$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic49$ = SubLObjectFactory.makeSymbol("SINGLETON?");
        $ic50$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic51$ = SubLObjectFactory.makeSymbol("NREVERSE");
        $ic52$ = SubLObjectFactory.makeSymbol("CPUSH");
        $ic53$ = SubLObjectFactory.makeSymbol("RET");
        $ic54$ = SubLObjectFactory.makeString("Non-union tactic ~A mixed in with union tactics at the top level.");
        $ic55$ = SubLObjectFactory.makeKeyword("ANSWER");
        $ic56$ = SubLObjectFactory.makeString("Dont know how to handle problem link type ~A.");
        $ic57$ = SubLObjectFactory.makeString("What is an answer link doing here????");
        $ic58$ = SubLObjectFactory.makeSymbol("S#27584", "CYC");
        $ic59$ = SubLObjectFactory.makeString("This should never be called.");
        $ic60$ = SubLObjectFactory.makeString("This should only occur at the top level.");
        $ic61$ = SubLObjectFactory.makeString("Union tactics can only occur at the top level. Talk to the canonicalizer.");
        $ic62$ = SubLObjectFactory.makeString("Dont know how to compute the proof-spec for tactic ~A.");
        $ic63$ = SubLObjectFactory.makeSymbol("S#27907", "CYC");
        $ic64$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29113", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29114", "CYC"));
        $ic65$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29115", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29116", "CYC"));
        $ic66$ = SubLObjectFactory.makeKeyword("UNMERGEABLE");
        $ic67$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29113", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29114", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25164", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29117", "CYC"));
        $ic68$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29115", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29116", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25165", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29118", "CYC"));
        $ic69$ = SubLObjectFactory.makeSymbol("S#13483", "CYC");
        $ic70$ = SubLObjectFactory.makeKeyword("NEG");
        $ic71$ = SubLObjectFactory.makeKeyword("POS");
        $ic72$ = SubLObjectFactory.makeSymbol("S#28969", "CYC");
        $ic73$ = SubLObjectFactory.makeSymbol("S#29060", "CYC");
        $ic74$ = SubLObjectFactory.makeString("Time to handle proof spec ~s");
        $ic75$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29119", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29120", "CYC"));
        $ic76$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29119", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29120", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13097", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29121", "CYC"));
        $ic77$ = SubLObjectFactory.makeKeyword("FULLY-BOUND");
        $ic78$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"));
        $ic79$ = SubLObjectFactory.makeKeyword("INTEGER");
        $ic80$ = SubLObjectFactory.makeKeyword("NUMBER");
        $ic81$ = SubLObjectFactory.makeKeyword("STRING");
        $ic82$ = SubLObjectFactory.makeKeyword("PROOF-SPEC");
        $ic83$ = SubLObjectFactory.makeKeyword("ALLOWED-MODULES");
        $ic84$ = SubLObjectFactory.makeKeyword("ALLOWED-RULES");
        $ic85$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("OR"), (SubLObject)SubLObjectFactory.makeSymbol("S#29122", "CYC"));
        $ic86$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29123", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29119", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29120", "CYC"));
        $ic87$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29124", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29119", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29120", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13097", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29125", "CYC"));
        $ic88$ = SubLObjectFactory.makeKeyword("DETERMINE-NEW-TRANSFORMATION-TACTICS");
        $ic89$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29126", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29119", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29120", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13097", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29125", "CYC"));
        $ic90$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#29127", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29122", "CYC"));
        $ic91$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JOIN-ORDERED"), (SubLObject)SubLObjectFactory.makeKeyword("JOIN"), (SubLObject)SubLObjectFactory.makeKeyword("SPLIT"), (SubLObject)SubLObjectFactory.makeKeyword("UNION"));
        $ic92$ = SubLObjectFactory.makeKeyword("DETERMINE-NEW-SPLIT-TACTICS");
        $ic93$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("OR"), (SubLObject)SubLObjectFactory.makeSymbol("S#29128", "CYC"));
        $ic94$ = SubLObjectFactory.makeSymbol("S#29101", "CYC");
        $ic95$ = SubLObjectFactory.makeKeyword("INFERENCE-PROOF-SPEC");
        $ic96$ = SubLObjectFactory.makeString("possibly ill-formed proof-spec: ~s");
        $ic97$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-STEP"), (SubLObject)module0371.ZERO_INTEGER);
        $ic98$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic99$ = SubLObjectFactory.makeString("Doing inference for all elements of KBQ query set ....");
        $ic100$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic101$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic102$ = SubLObjectFactory.makeKeyword("METRICS");
        $ic103$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TOTAL-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-PROOF-SPEC"));
        $ic104$ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $ic105$ = SubLObjectFactory.makeKeyword("MAX-TIME");
        $ic106$ = SubLObjectFactory.makeInteger(30);
        $ic107$ = SubLObjectFactory.makeString("~&~A: ~A~%");
        $ic108$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic109$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic110$ = SubLObjectFactory.makeKeyword("EOF");
        $ic111$ = SubLObjectFactory.makeString("Read invalid query info ~s");
        $ic112$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#26083", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5852", "CYC"));
        $ic113$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic114$ = SubLObjectFactory.makeString("Running experiments...");
        $ic115$ = SubLObjectFactory.makeString("Timeout: ~s");
        $ic116$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29129", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29130", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29133", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29134", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29135", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29136", "CYC"));
        $ic117$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29137", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29138", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29139", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29140", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29142", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29143", "CYC"));
        $ic118$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TIME-TO-FIRST-ANSWER"), (SubLObject)SubLObjectFactory.makeKeyword("TOTAL-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("TIME-PER-ANSWER"), (SubLObject)SubLObjectFactory.makeKeyword("TIME-TO-LAST-ANSWER"), (SubLObject)SubLObjectFactory.makeKeyword("TACTIC-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("EXECUTED-TACTIC-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-COUNT"));
        $ic119$ = SubLObjectFactory.makeKeyword("TIME-TO-FIRST-ANSWER");
        $ic120$ = SubLObjectFactory.makeKeyword("TOTAL-TIME");
        $ic121$ = SubLObjectFactory.makeKeyword("TIME-PER-ANSWER");
        $ic122$ = SubLObjectFactory.makeKeyword("TIME-TO-LAST-ANSWER");
        $ic123$ = SubLObjectFactory.makeKeyword("TACTIC-COUNT");
        $ic124$ = SubLObjectFactory.makeKeyword("EXECUTED-TACTIC-COUNT");
        $ic125$ = SubLObjectFactory.makeKeyword("ANSWER-COUNT");
        $ic126$ = SubLObjectFactory.makeKeyword("HALT-REASON");
        $ic127$ = SubLObjectFactory.makeString("unhandled metric ~s");
        $ic128$ = SubLObjectFactory.makeKeyword("BOTH-ANSWERABLE");
        $ic129$ = SubLObjectFactory.makeKeyword("ONLY-BASELINE-ANSWERABLE");
        $ic130$ = SubLObjectFactory.makeKeyword("ONLY-PROOF-SPEC-ANSWERABLE");
        $ic131$ = SubLObjectFactory.makeKeyword("NEITHER-ANSWERABLE");
        $ic132$ = SubLObjectFactory.makeKeyword("BOTH");
        $ic133$ = SubLObjectFactory.makeSymbol("<");
        $ic134$ = SubLObjectFactory.makeKeyword("BASELINE");
        $ic135$ = SubLObjectFactory.makeSymbol("CAR");
        $ic136$ = SubLObjectFactory.makeSymbol("CDR");
        $ic137$ = SubLObjectFactory.makeKeyword("EXPERIMENT");
        $ic138$ = SubLObjectFactory.makeString("unhandled sort-by ~s");
        $ic139$ = SubLObjectFactory.makeSymbol("S#29144", "CYC");
        $ic140$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TOTAL-TIME"));
        $ic141$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28165", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29131", "CYC"));
        $ic142$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29138", "CYC"));
        $ic143$ = SubLObjectFactory.makeString("Proof-spec query is slower: ~s vs. ~s");
        $ic144$ = SubLObjectFactory.makeString("Proof-spec query failed to get ~s");
        $ic145$ = SubLObjectFactory.makeString("Proof-spec query got additional answers: ~s");
        $ic146$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#29145", "CYC"), SubLObjectFactory.makeSymbol("S#29146", "CYC"), SubLObjectFactory.makeSymbol("S#28165", "CYC"), SubLObjectFactory.makeSymbol("S#29147", "CYC"), SubLObjectFactory.makeSymbol("S#29148", "CYC"), SubLObjectFactory.makeSymbol("S#29149", "CYC"), SubLObjectFactory.makeSymbol("S#29150", "CYC"), SubLObjectFactory.makeSymbol("S#29131", "CYC"), SubLObjectFactory.makeSymbol("S#29138", "CYC") });
        $ic147$ = SubLObjectFactory.makeKeyword("TERSE");
        $ic148$ = SubLObjectFactory.makeSymbol("S#29100", "CYC");
        $ic149$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic150$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BROWSABLE?"), (SubLObject)module0371.T, (SubLObject)SubLObjectFactory.makeKeyword("METRICS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-PROOF-SPECS")));
        $ic151$ = SubLObjectFactory.makeKeyword("TEST");
        $ic152$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic153$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic154$ = SubLObjectFactory.makeKeyword("KB");
        $ic155$ = SubLObjectFactory.makeKeyword("TINY");
        $ic156$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic157$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BinaryPredicate")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BinaryPredicate")))), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-POS"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheSet")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("elementOf")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheSet")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"))))), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-ELEMENTOF-UNIFY"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BinaryPredicate"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)module0371.ONE_INTEGER, constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PositiveInteger"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SPLIT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BinaryPredicate")))), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-POS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)module0371.ONE_INTEGER, constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PositiveInteger")))), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-ISA-DEFN-POS")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("integerBetween")), (SubLObject)module0371.MINUS_ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?N"), (SubLObject)module0371.ONE_INTEGER), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?N"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PositiveInteger"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JOIN-ORDERED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("integerBetween")), (SubLObject)module0371.MINUS_ONE_INTEGER, (SubLObject)module0371.ONE_INTEGER, (SubLObject)module0371.ONE_INTEGER)), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-INTEGER-BETWEEN-UNIFY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RESTRICTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)module0371.ONE_INTEGER, constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PositiveInteger")))), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-ISA-DEFN-POS"))))));
        $ic158$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BinaryPredicate")))), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-POS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BinaryPredicate")))), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-POS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BinaryPredicate")))), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-POS"))));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0371.class
	Total time: 885 ms
	
	Decompiled with Procyon 0.5.32.
*/