package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0340 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0340";
    public static final String myFingerPrint = "cd316b448ad05b1392876fb0b263c97f20ed9594d94e21a511445db4123cde41";
    private static SubLSymbol $g2903$;
    private static SubLSymbol $g2904$;
    private static SubLSymbol $g2905$;
    private static SubLSymbol $g2906$;
    private static SubLSymbol $g2907$;
    public static SubLSymbol $g2908$;
    private static SubLSymbol $g2909$;
    private static SubLSymbol $g2910$;
    private static SubLSymbol $g2911$;
    private static SubLSymbol $g2912$;
    private static SubLSymbol $g2913$;
    private static SubLSymbol $g2914$;
    private static SubLSymbol $g2916$;
    private static SubLSymbol $g2917$;
    private static SubLSymbol $g2918$;
    private static SubLSymbol $g2915$;
    private static SubLSymbol $g2919$;
    private static SubLSymbol $g2920$;
    private static SubLSymbol $g2921$;
    private static SubLSymbol $g2922$;
    private static SubLSymbol $g2923$;
    private static SubLSymbol $g2924$;
    private static SubLSymbol $g2925$;
    private static SubLSymbol $g2926$;
    private static SubLSymbol $g2927$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
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
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLString $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLList $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLInteger $ic86$;
    private static final SubLList $ic87$;
    private static final SubLList $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLList $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLString $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
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
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
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
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLList $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLList $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLInteger $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLInteger $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLString $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLList $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLList $ic168$;
    private static final SubLList $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLList $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLList $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLList $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLList $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLString $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLList $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLInteger $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLSymbol $ic202$;
    
    public static SubLObject f22774(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isKeyword() && module0340.NIL != module0004.f104(var1, module0340.$g2904$.getGlobalValue(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED));
    }
    
    public static SubLObject f22775(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0340.$ic2$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)module0340.NIL;
        SubLObject var8 = (SubLObject)module0340.NIL;
        SubLObject var9 = (SubLObject)module0340.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0340.$ic2$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0340.$ic2$);
        var8 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0340.$ic2$);
        var9 = var5.first();
        var5 = var5.rest();
        if (module0340.NIL == var5) {
            final SubLObject var10;
            var5 = (var10 = var6);
            final SubLObject var11 = (SubLObject)module0340.$ic3$;
            return (SubLObject)ConsesLow.list((SubLObject)module0340.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var11, var9)), (SubLObject)ConsesLow.list((SubLObject)module0340.$ic5$, reader.bq_cons(var7, (SubLObject)module0340.$ic6$), (SubLObject)ConsesLow.list((SubLObject)module0340.$ic7$, (SubLObject)ConsesLow.list((SubLObject)module0340.$ic8$, var11, var7), (SubLObject)ConsesLow.listS((SubLObject)module0340.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var8, (SubLObject)ConsesLow.list((SubLObject)module0340.$ic9$, var11, var7))), ConsesLow.append(var10, (SubLObject)module0340.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0340.$ic2$);
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f22776() {
        return module0340.$g2904$.getGlobalValue();
    }
    
    public static SubLObject f22777() {
        return f22776();
    }
    
    public static SubLObject f22778(final SubLObject var1) {
        return module0004.f104(var1, module0340.$g2905$.getGlobalValue(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
    }
    
    public static SubLObject f22779(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0340.$ic15$ == var1 || module0340.NIL != f22780(var1) || module0340.NIL != f22781(var1) || module0340.NIL != f22782(var1) || module0340.NIL != f22783(var1) || module0340.NIL != f22784(var1) || module0340.NIL != f22785(var1) || module0340.NIL != f22786(var1));
    }
    
    public static SubLObject f22787(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0340.$ic15$ != var1 && module0340.NIL != f22779(var1));
    }
    
    public static SubLObject f22780(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isCons() && module0340.$ic16$ == var1.first() && module0340.NIL != module0035.f2192((SubLObject)module0340.$ic17$, var1.rest()));
    }
    
    public static SubLObject f22781(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isCons() && module0340.$ic18$ == var1.first() && module0340.NIL != module0035.f2192((SubLObject)module0340.$ic17$, var1.rest()));
    }
    
    public static SubLObject f22782(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isCons() && module0340.$ic19$ == var1.first() && module0340.NIL != module0035.f2192((SubLObject)module0340.$ic17$, var1.rest()));
    }
    
    public static SubLObject f22783(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0340.NIL != module0035.f1998(var1) && module0340.$ic20$ == var1.first());
    }
    
    public static SubLObject f22784(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0340.NIL != module0035.f1998(var1) && module0340.$ic13$ == var1.first());
    }
    
    public static SubLObject f22785(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0340.NIL != module0035.f1998(var1) && module0340.NIL != f22774(var1.first()));
    }
    
    public static SubLObject f22788(final SubLObject var9, final SubLObject var13) {
        assert module0340.NIL != f22789(var9) : var9;
        assert module0340.NIL != f22779(var13) : var13;
        return f22790(var9, var13);
    }
    
    public static SubLObject f22790(final SubLObject var9, final SubLObject var13) {
        if (module0340.$ic15$ == var13) {
            return (SubLObject)module0340.T;
        }
        if (module0340.NIL != f22780(var13)) {
            SubLObject var14 = var13.rest();
            SubLObject var15 = (SubLObject)module0340.NIL;
            var15 = var14.first();
            while (module0340.NIL != var14) {
                if (module0340.NIL != f22790(var9, var15)) {
                    return (SubLObject)module0340.T;
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
            return (SubLObject)module0340.NIL;
        }
        if (module0340.NIL != f22781(var13)) {
            SubLObject var14 = var13.rest();
            SubLObject var15 = (SubLObject)module0340.NIL;
            var15 = var14.first();
            while (module0340.NIL != var14) {
                if (module0340.NIL == f22790(var9, var15)) {
                    return (SubLObject)module0340.NIL;
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
            return (SubLObject)module0340.T;
        }
        if (module0340.NIL != f22782(var13)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0340.NIL == f22790(var9, conses_high.second(var13)));
        }
        if (module0340.NIL != f22783(var13)) {
            return Equality.eql(conses_high.second(var13), f22791(var9));
        }
        if (module0340.NIL != f22784(var13)) {
            return module0004.f104(conses_high.second(var13), f22792(var9), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
        }
        if (module0340.NIL != f22785(var13)) {
            final SubLObject var16 = var13.first();
            final SubLObject var17 = conses_high.second(var13);
            final SubLObject var18 = f22793(var9, var16);
            return Equality.equal(var17, var18);
        }
        return Equality.eql(var9, f22786(var13));
    }
    
    public static SubLObject f22794(final SubLObject var13) {
        if (module0340.NIL != f22786(var13)) {
            return (SubLObject)module0340.T;
        }
        if (module0340.NIL != f22780(var13)) {
            SubLObject var14 = var13.rest();
            SubLObject var15 = (SubLObject)module0340.NIL;
            var15 = var14.first();
            while (module0340.NIL != var14) {
                if (module0340.NIL == f22794(var15)) {
                    return (SubLObject)module0340.NIL;
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
            return (SubLObject)module0340.T;
        }
        if (module0340.NIL != f22781(var13)) {
            SubLObject var14 = var13.rest();
            SubLObject var15 = (SubLObject)module0340.NIL;
            var15 = var14.first();
            while (module0340.NIL != var14) {
                if (module0340.NIL == f22794(var15)) {
                    return (SubLObject)module0340.NIL;
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
            return (SubLObject)module0340.T;
        }
        if (module0340.$ic15$ == var13 || module0340.NIL != f22782(var13) || module0340.NIL != f22783(var13) || module0340.NIL != f22784(var13) || module0340.NIL != f22785(var13)) {
            return (SubLObject)module0340.NIL;
        }
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f22795(final SubLObject var13) {
        if (module0340.NIL != f22780(var13)) {
            SubLObject var14 = (SubLObject)module0340.NIL;
            SubLObject var15 = var13.rest();
            SubLObject var16 = (SubLObject)module0340.NIL;
            var16 = var15.first();
            while (module0340.NIL != var15) {
                var14 = ConsesLow.append(var14, f22795(var16));
                var15 = var15.rest();
                var16 = var15.first();
            }
            return var14;
        }
        if (module0340.NIL != f22781(var13)) {
            SubLObject var14 = (SubLObject)module0340.NIL;
            SubLObject var15 = var13.rest();
            SubLObject var16 = (SubLObject)module0340.NIL;
            var16 = var15.first();
            while (module0340.NIL != var15) {
                var14 = ConsesLow.append(var14, f22795(var16));
                var15 = var15.rest();
                var16 = var15.first();
            }
            return var14;
        }
        return (SubLObject)ConsesLow.list(f22786(var13));
    }
    
    public static SubLObject f22796(final SubLObject var20, final SubLObject var21) {
        f22797(var20, var21, (SubLObject)module0340.ZERO_INTEGER);
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f22789(final SubLObject var20) {
        return (SubLObject)((var20.getClass() == $sX14781_native.class) ? module0340.T : module0340.NIL);
    }
    
    public static SubLObject f22798(final SubLObject var20) {
        assert module0340.NIL != f22789(var20) : var20;
        return var20.getField2();
    }
    
    public static SubLObject f22799(final SubLObject var20) {
        assert module0340.NIL != f22789(var20) : var20;
        return var20.getField3();
    }
    
    public static SubLObject f22800(final SubLObject var20) {
        assert module0340.NIL != f22789(var20) : var20;
        return var20.getField4();
    }
    
    public static SubLObject f22801(final SubLObject var20) {
        assert module0340.NIL != f22789(var20) : var20;
        return var20.getField5();
    }
    
    public static SubLObject f22802(final SubLObject var20) {
        assert module0340.NIL != f22789(var20) : var20;
        return var20.getField6();
    }
    
    public static SubLObject f22803(final SubLObject var20) {
        assert module0340.NIL != f22789(var20) : var20;
        return var20.getField7();
    }
    
    public static SubLObject f22804(final SubLObject var20) {
        assert module0340.NIL != f22789(var20) : var20;
        return var20.getField8();
    }
    
    public static SubLObject f22805(final SubLObject var20) {
        assert module0340.NIL != f22789(var20) : var20;
        return var20.getField9();
    }
    
    public static SubLObject f22806(final SubLObject var20) {
        assert module0340.NIL != f22789(var20) : var20;
        return var20.getField10();
    }
    
    public static SubLObject f22807(final SubLObject var20) {
        assert module0340.NIL != f22789(var20) : var20;
        return var20.getField11();
    }
    
    public static SubLObject f22808(final SubLObject var20) {
        assert module0340.NIL != f22789(var20) : var20;
        return var20.getField12();
    }
    
    public static SubLObject f22809(final SubLObject var20) {
        assert module0340.NIL != f22789(var20) : var20;
        return var20.getField13();
    }
    
    public static SubLObject f22810(final SubLObject var20, final SubLObject var22) {
        assert module0340.NIL != f22789(var20) : var20;
        return var20.setField2(var22);
    }
    
    public static SubLObject f22811(final SubLObject var20, final SubLObject var22) {
        assert module0340.NIL != f22789(var20) : var20;
        return var20.setField3(var22);
    }
    
    public static SubLObject f22812(final SubLObject var20, final SubLObject var22) {
        assert module0340.NIL != f22789(var20) : var20;
        return var20.setField4(var22);
    }
    
    public static SubLObject f22813(final SubLObject var20, final SubLObject var22) {
        assert module0340.NIL != f22789(var20) : var20;
        return var20.setField5(var22);
    }
    
    public static SubLObject f22814(final SubLObject var20, final SubLObject var22) {
        assert module0340.NIL != f22789(var20) : var20;
        return var20.setField6(var22);
    }
    
    public static SubLObject f22815(final SubLObject var20, final SubLObject var22) {
        assert module0340.NIL != f22789(var20) : var20;
        return var20.setField7(var22);
    }
    
    public static SubLObject f22816(final SubLObject var20, final SubLObject var22) {
        assert module0340.NIL != f22789(var20) : var20;
        return var20.setField8(var22);
    }
    
    public static SubLObject f22817(final SubLObject var20, final SubLObject var22) {
        assert module0340.NIL != f22789(var20) : var20;
        return var20.setField9(var22);
    }
    
    public static SubLObject f22818(final SubLObject var20, final SubLObject var22) {
        assert module0340.NIL != f22789(var20) : var20;
        return var20.setField10(var22);
    }
    
    public static SubLObject f22819(final SubLObject var20, final SubLObject var22) {
        assert module0340.NIL != f22789(var20) : var20;
        return var20.setField11(var22);
    }
    
    public static SubLObject f22820(final SubLObject var20, final SubLObject var22) {
        assert module0340.NIL != f22789(var20) : var20;
        return var20.setField12(var22);
    }
    
    public static SubLObject f22821(final SubLObject var20, final SubLObject var22) {
        assert module0340.NIL != f22789(var20) : var20;
        return var20.setField13(var22);
    }
    
    public static SubLObject f22822(SubLObject var23) {
        if (var23 == module0340.UNPROVIDED) {
            var23 = (SubLObject)module0340.NIL;
        }
        final SubLObject var24 = (SubLObject)new $sX14781_native();
        SubLObject var25;
        SubLObject var26;
        SubLObject var27;
        SubLObject var28;
        for (var25 = (SubLObject)module0340.NIL, var25 = var23; module0340.NIL != var25; var25 = conses_high.cddr(var25)) {
            var26 = var25.first();
            var27 = conses_high.cadr(var25);
            var28 = var26;
            if (var28.eql((SubLObject)module0340.$ic54$)) {
                f22810(var24, var27);
            }
            else if (var28.eql((SubLObject)module0340.$ic55$)) {
                f22811(var24, var27);
            }
            else if (var28.eql((SubLObject)module0340.$ic56$)) {
                f22812(var24, var27);
            }
            else if (var28.eql((SubLObject)module0340.$ic57$)) {
                f22813(var24, var27);
            }
            else if (var28.eql((SubLObject)module0340.$ic58$)) {
                f22814(var24, var27);
            }
            else if (var28.eql((SubLObject)module0340.$ic59$)) {
                f22815(var24, var27);
            }
            else if (var28.eql((SubLObject)module0340.$ic60$)) {
                f22816(var24, var27);
            }
            else if (var28.eql((SubLObject)module0340.$ic61$)) {
                f22817(var24, var27);
            }
            else if (var28.eql((SubLObject)module0340.$ic62$)) {
                f22818(var24, var27);
            }
            else if (var28.eql((SubLObject)module0340.$ic63$)) {
                f22819(var24, var27);
            }
            else if (var28.eql((SubLObject)module0340.$ic64$)) {
                f22820(var24, var27);
            }
            else if (var28.eql((SubLObject)module0340.$ic65$)) {
                f22821(var24, var27);
            }
            else {
                Errors.error((SubLObject)module0340.$ic66$, var26);
            }
        }
        return var24;
    }
    
    public static SubLObject f22823(final SubLObject var29, final SubLObject var30) {
        Functions.funcall(var30, var29, (SubLObject)module0340.$ic67$, (SubLObject)module0340.$ic68$, (SubLObject)module0340.TWELVE_INTEGER);
        Functions.funcall(var30, var29, (SubLObject)module0340.$ic69$, (SubLObject)module0340.$ic54$, f22798(var29));
        Functions.funcall(var30, var29, (SubLObject)module0340.$ic69$, (SubLObject)module0340.$ic55$, f22799(var29));
        Functions.funcall(var30, var29, (SubLObject)module0340.$ic69$, (SubLObject)module0340.$ic56$, f22800(var29));
        Functions.funcall(var30, var29, (SubLObject)module0340.$ic69$, (SubLObject)module0340.$ic57$, f22801(var29));
        Functions.funcall(var30, var29, (SubLObject)module0340.$ic69$, (SubLObject)module0340.$ic58$, f22802(var29));
        Functions.funcall(var30, var29, (SubLObject)module0340.$ic69$, (SubLObject)module0340.$ic59$, f22803(var29));
        Functions.funcall(var30, var29, (SubLObject)module0340.$ic69$, (SubLObject)module0340.$ic60$, f22804(var29));
        Functions.funcall(var30, var29, (SubLObject)module0340.$ic69$, (SubLObject)module0340.$ic61$, f22805(var29));
        Functions.funcall(var30, var29, (SubLObject)module0340.$ic69$, (SubLObject)module0340.$ic62$, f22806(var29));
        Functions.funcall(var30, var29, (SubLObject)module0340.$ic69$, (SubLObject)module0340.$ic63$, f22807(var29));
        Functions.funcall(var30, var29, (SubLObject)module0340.$ic69$, (SubLObject)module0340.$ic64$, f22808(var29));
        Functions.funcall(var30, var29, (SubLObject)module0340.$ic69$, (SubLObject)module0340.$ic65$, f22809(var29));
        Functions.funcall(var30, var29, (SubLObject)module0340.$ic70$, (SubLObject)module0340.$ic68$, (SubLObject)module0340.TWELVE_INTEGER);
        return var29;
    }
    
    public static SubLObject f22824(final SubLObject var29, final SubLObject var30) {
        return f22823(var29, var30);
    }
    
    public static SubLObject f22797(final SubLObject var1, final SubLObject var21, final SubLObject var31) {
        final SubLObject var32 = f22825(var1);
        PrintLow.format(var21, (SubLObject)module0340.$ic72$, var32);
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f22826(final SubLObject var1) {
        return Sxhash.sxhash(f22798(var1));
    }
    
    public static SubLObject f22827(final SubLObject var33) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        assert module0340.NIL != module0035.f2327(var33) : var33;
        SubLObject var35 = (SubLObject)module0340.NIL;
        SubLObject var36;
        SubLObject var37;
        SubLObject var38;
        SubLObject var39;
        for (var36 = (SubLObject)module0340.NIL, var36 = var33; module0340.NIL != var36; var36 = conses_high.cddr(var36)) {
            var37 = var36.first();
            var38 = conses_high.cadr(var36);
            assert module0340.NIL != f22774(var37) : var37;
            var39 = var37;
            if (var39.eql((SubLObject)module0340.$ic76$)) {
                var35 = (SubLObject)module0340.T;
            }
        }
        for (var36 = (SubLObject)module0340.NIL, var36 = var33; module0340.NIL != var36; var36 = conses_high.cddr(var36)) {
            var37 = var36.first();
            var38 = conses_high.cadr(var36);
            var39 = var37;
            if (var39.eql((SubLObject)module0340.$ic77$) && module0340.NIL == Errors.$ignore_mustsP$.getDynamicValue(var34) && module0340.NIL == var35) {
                Errors.error((SubLObject)module0340.$ic78$, var33);
            }
        }
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f22828(final SubLObject var32, SubLObject var33) {
        f22827(var33);
        final SubLObject var34 = f22829(var32);
        var33 = f22830(var33);
        f22811(var34, var33);
        f22831(var34);
        return var34;
    }
    
    public static SubLObject f22832() {
        final SubLObject var38 = module0340.$g2909$.getGlobalValue();
        if (module0340.NIL != var38) {
            module0034.f1818(var38);
        }
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f22833(final SubLObject var32) {
        return module0034.f1829(module0340.$g2909$.getGlobalValue(), (SubLObject)ConsesLow.list(var32), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
    }
    
    public static SubLObject f22834(final SubLObject var32) {
        return f22828(var32, (SubLObject)module0340.$ic80$);
    }
    
    public static SubLObject f22835(final SubLObject var32) {
        SubLObject var33 = module0340.$g2909$.getGlobalValue();
        if (module0340.NIL == var33) {
            var33 = module0034.f1934((SubLObject)module0340.$ic79$, (SubLObject)module0340.$ic81$, (SubLObject)module0340.NIL, (SubLObject)module0340.EQUAL, (SubLObject)module0340.ONE_INTEGER, (SubLObject)module0340.ZERO_INTEGER);
        }
        SubLObject var34 = module0034.f1814(var33, var32, (SubLObject)module0340.$ic82$);
        if (var34 == module0340.$ic82$) {
            var34 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f22834(var32)));
            module0034.f1816(var33, var32, var34, (SubLObject)module0340.UNPROVIDED);
        }
        return module0034.f1959(var34);
    }
    
    public static SubLObject f22830(SubLObject var33) {
        final SubLObject var34 = conses_high.getf(var33, (SubLObject)module0340.$ic13$, (SubLObject)module0340.UNPROVIDED);
        if (!var34.isList()) {
            var33 = conses_high.putf(conses_high.copy_list(var33), (SubLObject)module0340.$ic13$, (SubLObject)ConsesLow.list(var34));
        }
        return var33;
    }
    
    public static SubLObject f22829(final SubLObject var32) {
        SubLObject var33 = f22786(var32);
        if (module0340.NIL != var33) {
            f22836(var33);
        }
        else {
            var33 = f22822((SubLObject)module0340.UNPROVIDED);
            f22810(var33, var32);
        }
        f22811(var33, (SubLObject)module0340.NIL);
        return var33;
    }
    
    public static SubLObject f22837(final SubLObject var9) {
        f22836(var9);
        f22811(var9, (SubLObject)module0340.$ic83$);
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f22825(final SubLObject var9) {
        assert module0340.NIL != f22789(var9) : var9;
        return f22798(var9);
    }
    
    public static SubLObject f22838(final SubLObject var9) {
        return f22799(var9);
    }
    
    public static SubLObject f22839(final SubLObject var9, final SubLObject var16) {
        final SubLObject var17 = f22838(var9);
        final SubLObject var18 = conses_high.getf(var17, var16, (SubLObject)module0340.$ic84$);
        if (var18 == module0340.$ic84$) {
            final SubLObject var19 = module0067.f4885(module0340.$g2907$.getGlobalValue(), var16, (SubLObject)module0340.UNPROVIDED);
            return Values.values(var19, (SubLObject)module0340.T);
        }
        return Values.values(var18, (SubLObject)module0340.NIL);
    }
    
    public static SubLObject f22793(final SubLObject var9, final SubLObject var16) {
        final SubLObject var17 = f22838(var9);
        SubLObject var18 = conses_high.getf(var17, var16, (SubLObject)module0340.$ic84$);
        if (var18 == module0340.$ic84$) {
            var18 = module0067.f4885(module0340.$g2907$.getGlobalValue(), var16, (SubLObject)module0340.UNPROVIDED);
        }
        return var18;
    }
    
    public static SubLObject f22840(final SubLObject var9, final SubLObject var16) {
        final SubLObject var17 = f22793(var9, var16);
        final SubLObject var18 = module0067.f4885(module0340.$g2907$.getGlobalValue(), var16, (SubLObject)module0340.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(!var17.equal(var18));
    }
    
    public static SubLObject f22841(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0340.$ic87$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)module0340.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0340.$ic87$);
        var7 = var5.first();
        var5 = var5.rest();
        SubLObject var8 = (SubLObject)module0340.NIL;
        SubLObject var9 = var5;
        SubLObject var10 = (SubLObject)module0340.NIL;
        SubLObject var50_51 = (SubLObject)module0340.NIL;
        while (module0340.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)module0340.$ic87$);
            var50_51 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)module0340.$ic87$);
            if (module0340.NIL == conses_high.member(var50_51, (SubLObject)module0340.$ic88$, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED)) {
                var10 = (SubLObject)module0340.T;
            }
            if (var50_51 == module0340.$ic89$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0340.NIL != var10 && module0340.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0340.$ic87$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0340.$ic90$, var5);
        final SubLObject var12 = (SubLObject)((module0340.NIL != var11) ? conses_high.cadr(var11) : module0340.NIL);
        final SubLObject var13;
        var5 = (var13 = var6);
        final SubLObject var14 = (SubLObject)module0340.$ic91$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0340.$ic92$, (SubLObject)ConsesLow.list(var14, var7, (SubLObject)module0340.$ic93$, (SubLObject)module0340.$ic90$, var12), (SubLObject)ConsesLow.list((SubLObject)module0340.$ic94$, var14), ConsesLow.append(var13, (SubLObject)module0340.NIL));
    }
    
    public static SubLObject f22842() {
        return module0340.$g2910$.getGlobalValue();
    }
    
    public static SubLObject f22786(final SubLObject var32) {
        final SubLObject var33 = Hashtables.gethash_without_values(var32, module0340.$g2910$.getGlobalValue(), (SubLObject)module0340.UNPROVIDED);
        return var33;
    }
    
    public static SubLObject f22831(final SubLObject var9) {
        final SubLObject var10 = f22825(var9);
        Hashtables.sethash(var10, module0340.$g2910$.getGlobalValue(), var9);
        return var9;
    }
    
    public static SubLObject f22836(final SubLObject var9) {
        final SubLObject var10 = f22825(var9);
        Hashtables.remhash(var10, module0340.$g2910$.getGlobalValue());
        return var9;
    }
    
    public static SubLObject f22843(final SubLObject var32, final SubLObject var55, final SubLObject var33) {
        SubLObject var56 = conses_high.copy_list(var33);
        var56 = conses_high.putf(var33, (SubLObject)module0340.$ic20$, var55);
        final SubLObject var57 = f22828(var32, var56);
        return var57;
    }
    
    public static SubLObject f22844(SubLObject var1) {
        if (var1 == module0340.UNPROVIDED) {
            var1 = (SubLObject)module0340.NIL;
        }
        return (SubLObject)module0340.ZERO_INTEGER;
    }
    
    public static SubLObject f22845(SubLObject var12, SubLObject var57) {
        if (var12 == module0340.UNPROVIDED) {
            var12 = (SubLObject)module0340.NIL;
        }
        if (var57 == module0340.UNPROVIDED) {
            var57 = (SubLObject)module0340.NIL;
        }
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f22791(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic20$);
    }
    
    public static SubLObject f22792(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic13$);
    }
    
    public static SubLObject f22846(final SubLObject var9) {
        return module0035.f2169((SubLObject)module0340.$ic97$, f22792(var9));
    }
    
    public static SubLObject f22847(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic98$);
    }
    
    public static SubLObject f22848(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic99$);
    }
    
    public static SubLObject f22849(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic56$);
    }
    
    public static SubLObject f22850(final SubLObject var9, final SubLObject var58) {
        final SubLObject var59 = f22849(var9);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0340.NIL == var59 || var59.eql(var58));
    }
    
    public static SubLObject f22851(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic61$);
    }
    
    public static SubLObject f22852(final SubLObject var9, final SubLObject var60) {
        final SubLObject var61 = f22851(var9);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0340.$ic100$ == var61 || module0340.NIL != module0337.f22628(var61, var60));
    }
    
    public static SubLObject f22853(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic62$);
    }
    
    public static SubLObject f22854(final SubLObject var9) {
        final SubLObject var10 = f22853(var9);
        if (module0340.NIL != var10) {
            return f22855(var10);
        }
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f22855(final SubLObject var63) {
        if (module0340.NIL != module0161.f10481(var63)) {
            return var63;
        }
        if (var63.isSymbol() && module0340.NIL != Symbols.boundp(var63)) {
            return Symbols.symbol_value(var63);
        }
        return module0112.f7691(var63);
    }
    
    public static SubLObject f22856(final SubLObject var9) {
        final SubLObject var10 = f22854(var9);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0340.NIL == var10 || module0340.NIL != module0147.f9507(var10));
    }
    
    public static SubLObject f22857(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic101$);
    }
    
    public static SubLObject f22858(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic102$);
    }
    
    public static SubLObject f22859(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic103$);
    }
    
    public static SubLObject f22860(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic104$);
    }
    
    public static SubLObject f22861(final SubLObject var9, final SubLObject var1, SubLObject var58) {
        if (var58 == module0340.UNPROVIDED) {
            var58 = (SubLObject)module0340.NIL;
        }
        SubLObject var59 = f22862(var9, var1);
        if (!var59.isNumber()) {
            var59 = f22863(var9);
            if (!var59.isNumber()) {
                var59 = f22864(var9, var1);
            }
        }
        return var59;
    }
    
    public static SubLObject f22865(final SubLObject var9, final SubLObject var60) {
        return f22861(var9, var60, (SubLObject)module0340.UNPROVIDED);
    }
    
    public static SubLObject f22866(final SubLObject var9, final SubLObject var66) {
        return f22861(var9, var66, (SubLObject)module0340.UNPROVIDED);
    }
    
    public static SubLObject f22862(final SubLObject var9, final SubLObject var67) {
        final SubLObject var68 = f22858(var9);
        if (module0340.NIL != var68) {
            return module0337.f22649(var68, var67, (SubLObject)module0340.UNPROVIDED);
        }
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f22863(final SubLObject var9) {
        final SubLObject var10 = f22859(var9);
        if (module0340.NIL == var10) {
            return (SubLObject)module0340.NIL;
        }
        if (var10.isNumber()) {
            return var10;
        }
        if (var10.isSymbol() && module0340.NIL != Symbols.boundp(var10)) {
            return Symbols.symbol_value(var10);
        }
        return module0112.f7691(var10);
    }
    
    public static SubLObject f22864(final SubLObject var9, final SubLObject var1) {
        final SubLObject var10 = f22860(var9);
        if (module0340.NIL != module0112.f7693(var10)) {
            final SubLObject var11 = module0112.f7695(var10, var1);
            return var11;
        }
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f22867(final SubLObject var9, final SubLObject var60) {
        return f22864(var9, var60);
    }
    
    public static SubLObject f22868(final SubLObject var9, final SubLObject var66) {
        return f22864(var9, var66);
    }
    
    public static SubLObject f22869(final SubLObject var9) {
        final SubLObject var10 = f22793(var9, (SubLObject)module0340.$ic105$);
        if (var10 == module0340.$ic106$) {
            return f22870(var9);
        }
        return module0035.sublisp_boolean(var10);
    }
    
    public static SubLObject f22870(final SubLObject var9) {
        final SubLObject var10 = f22851(var9);
        if (module0340.NIL != module0205.f13220((SubLObject)module0340.$ic107$, var10, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED)) {
            return (SubLObject)module0340.NIL;
        }
        final SubLObject var11 = module0038.f2638(f22825(var9));
        final SubLObject var12 = module0038.f2668((SubLObject)module0340.$ic108$, var11, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
        return var12;
    }
    
    public static SubLObject f22871(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic109$);
    }
    
    public static SubLObject f22872(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic110$);
    }
    
    public static SubLObject f22873(final SubLObject var9) {
        module0414.f28983(var9);
        final SubLObject var10 = f22793(var9, (SubLObject)module0340.$ic111$);
        if (module0340.$ic84$ == var10) {
            return f22874(var9);
        }
        return var10;
    }
    
    public static SubLObject f22874(final SubLObject var9) {
        if (module0340.$ic112$ != f22791(var9)) {
            return (SubLObject)module0340.$ic115$;
        }
        if (module0340.NIL != f22869(var9)) {
            return (SubLObject)module0340.$ic113$;
        }
        return (SubLObject)module0340.$ic114$;
    }
    
    public static SubLObject f22875(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic116$);
    }
    
    public static SubLObject f22876(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic117$);
    }
    
    public static SubLObject f22877(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic57$);
    }
    
    public static SubLObject f22878(final SubLObject var9, final SubLObject var75) {
        final SubLObject var76 = f22877(var9);
        if (module0340.NIL != var76) {
            return Equality.eql(var76, var75);
        }
        final SubLObject var77 = f22879(var9);
        if (module0340.NIL != var77) {
            return module0004.f104(var75, var77, (SubLObject)module0340.$ic118$, (SubLObject)module0340.UNPROVIDED);
        }
        return (SubLObject)module0340.T;
    }
    
    public static SubLObject f22880(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic59$);
    }
    
    public static SubLObject f22881(final SubLObject var9, final SubLObject var60) {
        final SubLObject var61 = f22880(var9);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0340.NIL == var61 || (module0340.NIL != module0202.f12715(var60) && var61.numE(Sequences.length(var60.rest()))));
    }
    
    public static SubLObject f22882(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic76$);
    }
    
    public static SubLObject f22883(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic77$);
    }
    
    public static SubLObject f22884(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic60$);
    }
    
    public static SubLObject f22885(final SubLObject var9) {
        if (module0340.NIL == module0131.f8587()) {
            return (SubLObject)module0340.T;
        }
        final SubLObject var10 = f22884(var9);
        return Equality.eq(var10, (SubLObject)module0340.$ic119$);
    }
    
    public static SubLObject f22886(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic120$);
    }
    
    public static SubLObject f22887(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic121$);
    }
    
    public static SubLObject f22888(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic122$);
    }
    
    public static SubLObject f22889(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic123$);
    }
    
    public static SubLObject f22890(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic124$);
    }
    
    public static SubLObject f22891(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic125$);
    }
    
    public static SubLObject f22892(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic126$);
    }
    
    public static SubLObject f22893(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic127$);
    }
    
    public static SubLObject f22894(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic128$);
    }
    
    public static SubLObject f22895(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic129$);
    }
    
    public static SubLObject f22896(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic130$);
    }
    
    public static SubLObject f22897(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        var10.resetMultipleValues();
        SubLObject var11 = f22839(var9, (SubLObject)module0340.$ic131$);
        final SubLObject var12 = var10.secondMultipleValue();
        var10.resetMultipleValues();
        if (module0340.NIL != var12) {
            var11 = module0147.f9496();
        }
        return var11;
    }
    
    public static SubLObject f22898(final SubLObject var9) {
        final SubLObject var10 = f22897(var9);
        return f22855(var10);
    }
    
    public static SubLObject f22899(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic132$);
    }
    
    public static SubLObject f22900(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic133$);
    }
    
    public static SubLObject f22901(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic134$);
    }
    
    public static SubLObject f22902(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic135$);
    }
    
    public static SubLObject f22879(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic58$);
    }
    
    public static SubLObject f22903(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic136$);
    }
    
    public static SubLObject f22904(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic137$);
    }
    
    public static SubLObject f22905(final SubLObject var9, final SubLObject var60) {
        return Equality.eq((SubLObject)module0340.$ic138$, f22906(var9, var60, (SubLObject)module0340.UNPROVIDED));
    }
    
    public static SubLObject f22907(final SubLObject var9, final SubLObject var60) {
        return Equality.eq((SubLObject)module0340.$ic139$, f22906(var9, var60, (SubLObject)module0340.UNPROVIDED));
    }
    
    public static SubLObject f22906(final SubLObject var9, final SubLObject var60, SubLObject var83) {
        if (var83 == module0340.UNPROVIDED) {
            var83 = (SubLObject)module0340.$ic139$;
        }
        final SubLObject var84 = f22793(var9, (SubLObject)module0340.$ic65$);
        if (module0340.NIL != var84) {
            return var84;
        }
        SubLObject var85 = f22793(var9, (SubLObject)module0340.$ic140$);
        if (module0340.NIL != var85 && module0340.NIL != module0337.f22628(var85, var60)) {
            return (SubLObject)module0340.$ic138$;
        }
        var85 = f22793(var9, (SubLObject)module0340.$ic141$);
        if (module0340.NIL != var85) {
            final SubLObject var86 = module0337.f22649(var85, var60, (SubLObject)module0340.UNPROVIDED);
            if (module0340.NIL != var86) {
                return var86;
            }
        }
        return var83;
    }
    
    public static SubLObject f22908(final SubLObject var9, final SubLObject var85) {
        final SubLObject var86 = f22793(var9, (SubLObject)module0340.$ic65$);
        if (module0340.NIL != var86) {
            return var86;
        }
        SubLObject var87 = f22793(var9, (SubLObject)module0340.$ic140$);
        if (module0340.NIL != var87 && module0340.NIL != module0337.f22628(var87, var85)) {
            return (SubLObject)module0340.$ic138$;
        }
        var87 = f22793(var9, (SubLObject)module0340.$ic141$);
        if (module0340.NIL != var87) {
            final SubLObject var88 = module0337.f22649(var87, var85, (SubLObject)module0340.UNPROVIDED);
            if (module0340.NIL != var88) {
                return var88;
            }
        }
        return (SubLObject)module0340.$ic139$;
    }
    
    public static SubLObject f22909(final SubLObject var9) {
        return f22793(var9, (SubLObject)module0340.$ic142$);
    }
    
    public static SubLObject f22910(final SubLObject var9, SubLObject var86) {
        if (var86 == module0340.UNPROVIDED) {
            var86 = (SubLObject)module0340.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0340.NIL == module0004.f104(var9, var86, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED));
    }
    
    public static SubLObject f22911(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0340.$ic144$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)module0340.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0340.$ic144$);
        var7 = var5.first();
        var5 = var5.rest();
        SubLObject var8 = (SubLObject)module0340.NIL;
        SubLObject var9 = var5;
        SubLObject var10 = (SubLObject)module0340.NIL;
        SubLObject var93_94 = (SubLObject)module0340.NIL;
        while (module0340.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)module0340.$ic144$);
            var93_94 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)module0340.$ic144$);
            if (module0340.NIL == conses_high.member(var93_94, (SubLObject)module0340.$ic88$, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED)) {
                var10 = (SubLObject)module0340.T;
            }
            if (var93_94 == module0340.$ic89$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0340.NIL != var10 && module0340.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0340.$ic144$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0340.$ic90$, var5);
        final SubLObject var12 = (SubLObject)((module0340.NIL != var11) ? conses_high.cadr(var11) : module0340.NIL);
        final SubLObject var13;
        var5 = (var13 = var6);
        return (SubLObject)ConsesLow.listS((SubLObject)module0340.$ic145$, (SubLObject)ConsesLow.list(var7, (SubLObject)module0340.$ic146$, (SubLObject)module0340.$ic90$, var12), ConsesLow.append(var13, (SubLObject)module0340.NIL));
    }
    
    public static SubLObject f22912() {
        return module0340.$g2911$.getGlobalValue();
    }
    
    public static SubLObject f22913(final SubLObject var1) {
        return module0077.f5320(var1, module0340.$g2911$.getGlobalValue());
    }
    
    public static SubLObject f22914() {
        return module0077.f5311(module0340.$g2911$.getGlobalValue());
    }
    
    public static SubLObject f22915() {
        return module0035.sublisp_boolean(module0340.$g2912$.getGlobalValue());
    }
    
    public static SubLObject f22916() {
        return module0340.$g2912$.getGlobalValue();
    }
    
    public static SubLObject f22917(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0340.NIL != f22913(var1) && module0340.NIL != module0004.f104(var1, module0340.$g2913$.getGlobalValue(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED));
    }
    
    public static SubLObject f22918() {
        return conses_high.copy_list(module0340.$g2913$.getGlobalValue());
    }
    
    public static SubLObject f22919(final SubLObject var58) {
        return Sequences.remove(module0130.f8517(var58), module0340.$g2913$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0340.EQL), (SubLObject)module0340.$ic151$, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
    }
    
    public static SubLObject f22920() {
        return Sequences.length(module0340.$g2913$.getGlobalValue());
    }
    
    public static SubLObject f22921() {
        return conses_high.copy_list(module0340.$g2914$.getGlobalValue());
    }
    
    public static SubLObject f22922(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0340.NIL != f22913(var1) && module0340.NIL != module0004.f104(var1, module0340.$g2914$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0340.EQL), (SubLObject)module0340.UNPROVIDED));
    }
    
    public static SubLObject f22923() {
        return Sequences.length(module0340.$g2914$.getGlobalValue());
    }
    
    public static SubLObject f22924(final SubLObject var96) {
        return module0035.f2293(module0340.$g2915$.getGlobalValue(), var96, Symbols.symbol_function((SubLObject)module0340.EQL), (SubLObject)module0340.UNPROVIDED);
    }
    
    public static SubLObject f22925(final SubLObject var96, final SubLObject var75) {
        return module0004.f104(var75, f22924(var96), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
    }
    
    public static SubLObject f22926(final SubLObject var75, final SubLObject var96) {
        if (module0340.NIL != module0173.f10955(var75) && module0340.NIL == f22925(var96, var75)) {
            return (SubLObject)module0340.NIL;
        }
        return (SubLObject)module0340.T;
    }
    
    public static SubLObject f22927(final SubLObject var58) {
        return Sequences.remove(module0130.f8517(var58), module0340.$g2914$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0340.EQL), (SubLObject)module0340.$ic151$, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
    }
    
    public static SubLObject f22928(final SubLObject var75) {
        assert module0340.NIL != module0173.f10955(var75) : var75;
        return conses_high.copy_list(Hashtables.gethash_without_values(var75, module0340.$g2916$.getGlobalValue(), (SubLObject)module0340.NIL));
    }
    
    public static SubLObject f22929(final SubLObject var75) {
        return module0035.sublisp_boolean(Hashtables.gethash_without_values(var75, module0340.$g2916$.getGlobalValue(), (SubLObject)module0340.NIL));
    }
    
    public static SubLObject f22930(final SubLObject var75, final SubLObject var58) {
        assert module0340.NIL != module0173.f10955(var75) : var75;
        return Sequences.remove(module0130.f8517(var58), Hashtables.gethash_without_values(var75, module0340.$g2916$.getGlobalValue(), (SubLObject)module0340.NIL), Symbols.symbol_function((SubLObject)module0340.EQL), (SubLObject)module0340.$ic151$, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
    }
    
    public static SubLObject f22931(final SubLObject var75, final SubLObject var58) {
        assert module0340.NIL != module0173.f10955(var75) : var75;
        SubLObject var76 = (SubLObject)module0340.NIL;
        SubLObject var77 = f22927(var58);
        SubLObject var78 = (SubLObject)module0340.NIL;
        var78 = var77.first();
        while (module0340.NIL != var77) {
            if (module0340.NIL == f22926(var75, var78)) {
                var76 = (SubLObject)ConsesLow.cons(var78, var76);
            }
            var77 = var77.rest();
            var78 = var77.first();
        }
        return Sequences.nreverse(var76);
    }
    
    public static SubLObject f22932() {
        return module0030.f1625(module0340.$g2916$.getGlobalValue());
    }
    
    public static SubLObject f22933() {
        return module0077.f5312(f22934());
    }
    
    public static SubLObject f22935() {
        return module0077.f5311(f22934());
    }
    
    public static SubLObject f22934() {
        final SubLObject var98 = module0077.f5313((SubLObject)module0340.EQL, f22914());
        SubLObject var99 = (SubLObject)module0340.NIL;
        SubLObject var100 = (SubLObject)module0340.NIL;
        final Iterator var101 = Hashtables.getEntrySetIterator(module0340.$g2916$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(var101)) {
                final Map.Entry var102 = Hashtables.iteratorNextEntry(var101);
                var99 = Hashtables.getEntryKey(var102);
                SubLObject var103;
                var100 = (var103 = Hashtables.getEntryValue(var102));
                SubLObject var104 = (SubLObject)module0340.NIL;
                var104 = var103.first();
                while (module0340.NIL != var103) {
                    if (module0340.NIL == f22917(var104)) {
                        module0077.f5326(var104, var98);
                    }
                    var103 = var103.rest();
                    var104 = var103.first();
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var101);
        }
        return var98;
    }
    
    public static SubLObject f22936() {
        module0077.f5328(module0340.$g2919$.getGlobalValue());
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f22937() {
        return module0077.f5339(module0340.$g2919$.getGlobalValue());
    }
    
    public static SubLObject f22938(final SubLObject var75) {
        return module0077.f5326(var75, module0340.$g2919$.getGlobalValue());
    }
    
    public static SubLObject f22939(final SubLObject var75) {
        return module0077.f5327(var75, module0340.$g2919$.getGlobalValue());
    }
    
    public static SubLObject f22940(final SubLObject var75) {
        return module0077.f5320(var75, module0340.$g2919$.getGlobalValue());
    }
    
    public static SubLObject f22941(final SubLObject var32, final SubLObject var33) {
        final SubLObject var34 = f22942(var32, var33);
        final SubLObject var35 = f22843(var32, (SubLObject)module0340.$ic112$, var34);
        module0077.f5326(var35, module0340.$g2911$.getGlobalValue());
        f22943(var35);
        return var35;
    }
    
    public static SubLObject f22944(final SubLObject var75, final SubLObject var32) {
        final SubLObject var76 = f22786(var32);
        if (module0340.NIL != var76) {
            SubLObject var77 = conses_high.assoc(var76, module0340.$g2917$.getGlobalValue(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
            if (module0340.NIL == var77) {
                var77 = (SubLObject)ConsesLow.list(var76);
                module0340.$g2917$.setGlobalValue((SubLObject)ConsesLow.cons(var77, module0340.$g2917$.getGlobalValue()));
            }
            ConsesLow.rplacd(var77, conses_high.adjoin(var75, var77.rest(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED));
            return f22945(var75, var76);
        }
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f22946(final SubLObject var75, final SubLObject var32) {
        final SubLObject var76 = f22786(var32);
        if (module0340.NIL != var76) {
            SubLObject var77 = conses_high.assoc(var76, module0340.$g2918$.getGlobalValue(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
            if (module0340.NIL == var77) {
                var77 = (SubLObject)ConsesLow.list(var76);
                module0340.$g2918$.setGlobalValue((SubLObject)ConsesLow.cons(var77, module0340.$g2918$.getGlobalValue()));
            }
            ConsesLow.rplacd(var77, conses_high.adjoin(var75, var77.rest(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED));
            return var76;
        }
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f22947(final SubLObject var75, final SubLObject var32) {
        final SubLObject var76 = f22786(var32);
        if (module0340.NIL != var76) {
            SubLObject var77 = conses_high.assoc(var76, module0340.$g2915$.getGlobalValue(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
            if (module0340.NIL == var77) {
                var77 = (SubLObject)ConsesLow.list(var76);
                module0340.$g2915$.setGlobalValue((SubLObject)ConsesLow.cons(var77, module0340.$g2915$.getGlobalValue()));
            }
            ConsesLow.rplacd(var77, conses_high.adjoin(var75, var77.rest(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED));
            return var76;
        }
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f22948(final SubLObject var32) {
        final SubLObject var33 = f22786(var32);
        if (module0340.NIL != var33) {
            module0077.f5326(var33, module0340.$g2911$.getGlobalValue());
            f22943(var33);
            return var33;
        }
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f22942(final SubLObject var32, SubLObject var33) {
        var33 = conses_high.copy_tree(var33);
        final SubLObject var35;
        final SubLObject var34 = var35 = conses_high.getf(var33, (SubLObject)module0340.$ic56$, (SubLObject)module0340.UNPROVIDED);
        if (!var35.eql((SubLObject)module0340.$ic161$)) {
            if (!var35.eql((SubLObject)module0340.$ic162$)) {
                Errors.error((SubLObject)module0340.$ic163$, var32);
            }
        }
        return var33;
    }
    
    public static SubLObject f22949(final SubLObject var32, SubLObject var105) {
        if (var105 == module0340.UNPROVIDED) {
            var105 = (SubLObject)module0340.T;
        }
        final SubLObject var106 = f22786(var32);
        if (module0340.NIL != var106) {
            f22836(var106);
            module0077.f5327(var106, module0340.$g2911$.getGlobalValue());
            module0340.$g2913$.setGlobalValue(Sequences.remove(var106, module0340.$g2913$.getGlobalValue(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED));
            module0340.$g2914$.setGlobalValue(Sequences.remove(var106, module0340.$g2914$.getGlobalValue(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED));
            module0340.$g2917$.setGlobalValue(Sequences.delete(var106, module0340.$g2917$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0340.EQL), Symbols.symbol_function((SubLObject)module0340.$ic164$), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED));
            module0340.$g2918$.setGlobalValue(Sequences.delete(var106, module0340.$g2918$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0340.EQL), Symbols.symbol_function((SubLObject)module0340.$ic164$), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED));
            module0340.$g2915$.setGlobalValue(Sequences.delete(var106, module0340.$g2915$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0340.EQL), Symbols.symbol_function((SubLObject)module0340.$ic164$), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED));
            if (module0340.NIL != var105) {
                f22950();
            }
            return var106;
        }
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f22951(final SubLObject var32) {
        final SubLObject var33 = f22786(var32);
        if (module0340.NIL != var33) {
            f22836(var33);
            module0077.f5327(var33, module0340.$g2903$.getGlobalValue());
        }
        return var33;
    }
    
    public static SubLObject f22952(final SubLObject var75, final SubLObject var32, SubLObject var105) {
        if (var105 == module0340.UNPROVIDED) {
            var105 = (SubLObject)module0340.NIL;
        }
        final SubLObject var106 = f22786(var32);
        if (module0340.NIL != var106) {
            final SubLObject var107 = conses_high.assoc(var106, module0340.$g2917$.getGlobalValue(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
            if (module0340.NIL != var107) {
                ConsesLow.rplacd(var107, Sequences.delete(var75, var107.rest(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED));
                if (module0340.NIL == var107.rest()) {
                    module0340.$g2917$.setGlobalValue(Sequences.delete(var107, module0340.$g2917$.getGlobalValue(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED));
                }
            }
            if (module0340.NIL != var105) {
                f22950();
            }
            return var106;
        }
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f22953(final SubLObject var75, final SubLObject var32, SubLObject var105) {
        if (var105 == module0340.UNPROVIDED) {
            var105 = (SubLObject)module0340.NIL;
        }
        final SubLObject var106 = f22786(var32);
        if (module0340.NIL != var106) {
            final SubLObject var107 = conses_high.assoc(var106, module0340.$g2918$.getGlobalValue(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
            if (module0340.NIL != var107) {
                ConsesLow.rplacd(var107, Sequences.delete(var75, var107.rest(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED));
                if (module0340.NIL == var107.rest()) {
                    module0340.$g2918$.setGlobalValue(Sequences.delete(var107, module0340.$g2918$.getGlobalValue(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED));
                }
            }
            if (module0340.NIL != var105) {
                f22950();
            }
            return var106;
        }
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f22954(final SubLObject var75, final SubLObject var32, SubLObject var105) {
        if (var105 == module0340.UNPROVIDED) {
            var105 = (SubLObject)module0340.NIL;
        }
        final SubLObject var106 = f22786(var32);
        if (module0340.NIL != var106) {
            final SubLObject var107 = conses_high.assoc(var106, module0340.$g2915$.getGlobalValue(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
            if (module0340.NIL != var107) {
                ConsesLow.rplacd(var107, Sequences.delete(var75, var107.rest(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED));
                if (module0340.NIL == var107.rest()) {
                    module0340.$g2915$.setGlobalValue(Sequences.delete(var107, module0340.$g2915$.getGlobalValue(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED));
                }
            }
            if (module0340.NIL != var105) {
                f22950();
            }
            return var106;
        }
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f22950() {
        f22955();
        f22937();
        SubLObject var14 = module0340.$g2917$.getGlobalValue();
        SubLObject var15 = (SubLObject)module0340.NIL;
        var15 = var14.first();
        while (module0340.NIL != var14) {
            SubLObject var17;
            final SubLObject var16 = var17 = var15;
            SubLObject var18 = (SubLObject)module0340.NIL;
            SubLObject var19 = (SubLObject)module0340.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0340.$ic165$);
            var18 = var17.first();
            var17 = var17.rest();
            SubLObject var14_110;
            var19 = (var14_110 = var17);
            SubLObject var20 = (SubLObject)module0340.NIL;
            var20 = var14_110.first();
            while (module0340.NIL != var14_110) {
                f22945(var20, var18);
                var14_110 = var14_110.rest();
                var20 = var14_110.first();
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        final SubLObject var21 = module0077.f5333(f22912());
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        for (var22 = module0032.f1741(var21), var23 = (SubLObject)module0340.NIL, var23 = module0032.f1742(var22, var21); module0340.NIL == module0032.f1744(var22, var23); var23 = module0032.f1743(var23)) {
            var24 = module0032.f1745(var22, var23);
            if (module0340.NIL != module0032.f1746(var23, var24)) {
                f22943(var24);
            }
        }
        module0358.f23694();
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f22955() {
        Hashtables.clrhash(module0340.$g2916$.getGlobalValue());
        module0340.$g2912$.setGlobalValue((SubLObject)module0340.NIL);
        module0340.$g2913$.setGlobalValue((SubLObject)module0340.NIL);
        module0340.$g2914$.setGlobalValue((SubLObject)module0340.NIL);
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f22943(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (module0340.NIL != f22909(var9)) {
            if (module0340.NIL != module0340.$g2920$.getDynamicValue(var10)) {
                module0340.$g2912$.setGlobalValue(module0035.f2243(var9, module0340.$g2912$.getGlobalValue(), (SubLObject)module0340.EQL, (SubLObject)module0340.$ic166$, (SubLObject)module0340.IDENTITY));
            }
            else if (module0340.NIL == conses_high.member(var9, module0340.$g2912$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0340.EQL), Symbols.symbol_function((SubLObject)module0340.IDENTITY))) {
                module0340.$g2912$.setGlobalValue((SubLObject)ConsesLow.cons(var9, module0340.$g2912$.getGlobalValue()));
            }
        }
        else {
            final SubLObject var11 = f22877(var9);
            final SubLObject var12 = f22847(var9);
            if (module0340.NIL != var12) {
                if (module0340.NIL != module0340.$g2920$.getDynamicValue(var10)) {
                    module0340.$g2914$.setGlobalValue(module0035.f2243(var9, module0340.$g2914$.getGlobalValue(), (SubLObject)module0340.EQL, (SubLObject)module0340.$ic166$, (SubLObject)module0340.IDENTITY));
                }
                else if (module0340.NIL == conses_high.member(var9, module0340.$g2914$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0340.EQL), Symbols.symbol_function((SubLObject)module0340.IDENTITY))) {
                    module0340.$g2914$.setGlobalValue((SubLObject)ConsesLow.cons(var9, module0340.$g2914$.getGlobalValue()));
                }
            }
            else if (module0340.NIL == var11) {
                if (module0340.NIL != module0340.$g2920$.getDynamicValue(var10)) {
                    module0340.$g2913$.setGlobalValue(module0035.f2243(var9, module0340.$g2913$.getGlobalValue(), (SubLObject)module0340.EQL, (SubLObject)module0340.$ic166$, (SubLObject)module0340.IDENTITY));
                }
                else if (module0340.NIL == conses_high.member(var9, module0340.$g2913$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0340.EQL), Symbols.symbol_function((SubLObject)module0340.IDENTITY))) {
                    module0340.$g2913$.setGlobalValue((SubLObject)ConsesLow.cons(var9, module0340.$g2913$.getGlobalValue()));
                }
            }
            else if (var11.isAtom()) {
                f22945(var11, var9);
            }
            else {
                SubLObject var13 = var11;
                SubLObject var14 = (SubLObject)module0340.NIL;
                var14 = var13.first();
                while (module0340.NIL != var13) {
                    f22945(var14, var9);
                    var13 = var13.rest();
                    var14 = var13.first();
                }
            }
        }
        return var9;
    }
    
    public static SubLObject f22945(final SubLObject var75, final SubLObject var9) {
        final SubLThread var76 = SubLProcess.currentSubLThread();
        Hashtables.sethash(var75, module0340.$g2916$.getGlobalValue(), (module0340.NIL != module0340.$g2920$.getDynamicValue(var76)) ? module0035.f2243(var9, Hashtables.gethash(var75, module0340.$g2916$.getGlobalValue(), (SubLObject)module0340.NIL), (SubLObject)module0340.EQL, (SubLObject)module0340.$ic166$, (SubLObject)module0340.IDENTITY) : conses_high.adjoin(var9, Hashtables.gethash(var75, module0340.$g2916$.getGlobalValue(), (SubLObject)module0340.NIL), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED));
        return var9;
    }
    
    public static SubLObject f22956(final SubLObject var117, final SubLObject var118) {
        final SubLObject var119 = conses_high.assoc(var117, module0340.$g2917$.getGlobalValue(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
        final SubLObject var120 = conses_high.assoc(var118, module0340.$g2917$.getGlobalValue(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
        final SubLObject var121 = module0038.f2638(f22825(var117));
        final SubLObject var122 = module0038.f2638(f22825(var118));
        final SubLObject var123 = Sequences.length(var121);
        final SubLObject var124 = Sequences.length(var122);
        if (module0340.NIL != var119 && module0340.NIL == var120) {
            return (SubLObject)module0340.NIL;
        }
        if (module0340.NIL == var119 && module0340.NIL != var120) {
            return (SubLObject)module0340.T;
        }
        if (var123.numL(var124)) {
            return (SubLObject)module0340.T;
        }
        if (var123.numG(var124)) {
            return (SubLObject)module0340.NIL;
        }
        return Strings.stringL(var121, var122, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
    }
    
    public static SubLObject f22957(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0340.$ic168$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)module0340.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0340.$ic168$);
        var7 = var5.first();
        var5 = var5.rest();
        SubLObject var8 = (SubLObject)module0340.NIL;
        SubLObject var9 = var5;
        SubLObject var10 = (SubLObject)module0340.NIL;
        SubLObject var132_133 = (SubLObject)module0340.NIL;
        while (module0340.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)module0340.$ic168$);
            var132_133 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)module0340.$ic168$);
            if (module0340.NIL == conses_high.member(var132_133, (SubLObject)module0340.$ic88$, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED)) {
                var10 = (SubLObject)module0340.T;
            }
            if (var132_133 == module0340.$ic89$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0340.NIL != var10 && module0340.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0340.$ic168$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0340.$ic90$, var5);
        final SubLObject var12 = (SubLObject)((module0340.NIL != var11) ? conses_high.cadr(var11) : module0340.NIL);
        final SubLObject var13;
        var5 = (var13 = var6);
        return (SubLObject)ConsesLow.listS((SubLObject)module0340.$ic145$, (SubLObject)ConsesLow.list(var7, (SubLObject)module0340.$ic169$, (SubLObject)module0340.$ic90$, var12), ConsesLow.append(var13, (SubLObject)module0340.NIL));
    }
    
    public static SubLObject f22958() {
        return module0340.$g2921$.getGlobalValue();
    }
    
    public static SubLObject f22959(final SubLObject var1) {
        return module0077.f5320(var1, module0340.$g2921$.getGlobalValue());
    }
    
    public static SubLObject f22960() {
        return module0077.f5311(module0340.$g2921$.getGlobalValue());
    }
    
    public static SubLObject f22961() {
        SubLObject var135 = (SubLObject)module0340.NIL;
        final SubLObject var136 = module0077.f5333(f22958());
        SubLObject var137;
        SubLObject var138;
        SubLObject var139;
        for (var137 = module0032.f1741(var136), var138 = (SubLObject)module0340.NIL, var138 = module0032.f1742(var137, var136); module0340.NIL == module0032.f1744(var137, var138); var138 = module0032.f1743(var138)) {
            var139 = module0032.f1745(var137, var138);
            if (module0340.NIL != module0032.f1746(var138, var139)) {
                var135 = (SubLObject)ConsesLow.cons(var139, var135);
            }
        }
        return var135;
    }
    
    public static SubLObject f22962(final SubLObject var32, final SubLObject var33) {
        final SubLObject var34 = f22843(var32, (SubLObject)module0340.$ic172$, var33);
        module0077.f5326(var34, module0340.$g2921$.getGlobalValue());
        return var34;
    }
    
    public static SubLObject f22963(final SubLObject var32) {
        final SubLObject var33 = f22786(var32);
        if (module0340.NIL != f22789(var33)) {
            f22836(var33);
            return module0077.f5327(var33, module0340.$g2921$.getGlobalValue());
        }
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f22964(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0340.$ic144$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)module0340.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0340.$ic144$);
        var7 = var5.first();
        var5 = var5.rest();
        SubLObject var8 = (SubLObject)module0340.NIL;
        SubLObject var9 = var5;
        SubLObject var10 = (SubLObject)module0340.NIL;
        SubLObject var142_143 = (SubLObject)module0340.NIL;
        while (module0340.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)module0340.$ic144$);
            var142_143 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)module0340.$ic144$);
            if (module0340.NIL == conses_high.member(var142_143, (SubLObject)module0340.$ic88$, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED)) {
                var10 = (SubLObject)module0340.T;
            }
            if (var142_143 == module0340.$ic89$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0340.NIL != var10 && module0340.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0340.$ic144$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0340.$ic90$, var5);
        final SubLObject var12 = (SubLObject)((module0340.NIL != var11) ? conses_high.cadr(var11) : module0340.NIL);
        final SubLObject var13;
        var5 = (var13 = var6);
        return (SubLObject)ConsesLow.listS((SubLObject)module0340.$ic5$, (SubLObject)ConsesLow.list(var7, (SubLObject)module0340.$ic173$, (SubLObject)module0340.$ic90$, var12), ConsesLow.append(var13, (SubLObject)module0340.NIL));
    }
    
    public static SubLObject f22965() {
        return module0340.$g2903$.getGlobalValue();
    }
    
    public static SubLObject f22966() {
        return conses_high.copy_list(module0340.$g2903$.getGlobalValue());
    }
    
    public static SubLObject f22967(final SubLObject var1) {
        SubLObject var2 = f22965();
        SubLObject var3 = (SubLObject)module0340.NIL;
        var3 = var2.first();
        while (module0340.NIL != var2) {
            if (var1.eql(var3)) {
                return (SubLObject)module0340.T;
            }
            var2 = var2.rest();
            var3 = var2.first();
        }
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f22968() {
        return Sequences.length(module0340.$g2903$.getGlobalValue());
    }
    
    public static SubLObject f22969(final SubLObject var145) {
        return module0035.f2293(module0340.$g2918$.getGlobalValue(), var145, Symbols.symbol_function((SubLObject)module0340.EQL), (SubLObject)module0340.UNPROVIDED);
    }
    
    public static SubLObject f22970(final SubLObject var145, final SubLObject var75) {
        return module0004.f104(var75, f22969(var145), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
    }
    
    public static SubLObject f22971(final SubLObject var75, final SubLObject var145) {
        if (module0340.NIL != module0173.f10955(var75) && module0340.NIL != f22940(var75) && module0340.NIL == f22970(var145, var75)) {
            return (SubLObject)module0340.NIL;
        }
        return (SubLObject)module0340.T;
    }
    
    public static SubLObject f22972(final SubLObject var32, SubLObject var33) {
        if (var33 == module0340.UNPROVIDED) {
            var33 = (SubLObject)module0340.NIL;
        }
        final SubLObject var35;
        final SubLObject var34 = var35 = f22843(var32, (SubLObject)module0340.$ic176$, var33);
        if (module0340.NIL == conses_high.member(var35, module0340.$g2903$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0340.EQL), Symbols.symbol_function((SubLObject)module0340.IDENTITY))) {
            module0340.$g2903$.setGlobalValue((SubLObject)ConsesLow.cons(var35, module0340.$g2903$.getGlobalValue()));
        }
        return var34;
    }
    
    public static SubLObject f22973(final SubLObject var9) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0340.NIL != f22913(var9) || module0340.NIL != f22959(var9));
    }
    
    public static SubLObject f22974(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0340.$ic144$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)module0340.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0340.$ic144$);
        var7 = var5.first();
        var5 = var5.rest();
        SubLObject var8 = (SubLObject)module0340.NIL;
        SubLObject var9 = var5;
        SubLObject var10 = (SubLObject)module0340.NIL;
        SubLObject var152_153 = (SubLObject)module0340.NIL;
        while (module0340.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)module0340.$ic144$);
            var152_153 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)module0340.$ic144$);
            if (module0340.NIL == conses_high.member(var152_153, (SubLObject)module0340.$ic88$, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED)) {
                var10 = (SubLObject)module0340.T;
            }
            if (var152_153 == module0340.$ic89$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0340.NIL != var10 && module0340.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0340.$ic144$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0340.$ic90$, var5);
        final SubLObject var12 = (SubLObject)((module0340.NIL != var11) ? conses_high.cadr(var11) : module0340.NIL);
        final SubLObject var13;
        var5 = (var13 = var6);
        return (SubLObject)ConsesLow.listS((SubLObject)module0340.$ic5$, (SubLObject)ConsesLow.list(var7, (SubLObject)module0340.$ic178$, (SubLObject)module0340.$ic90$, var12), ConsesLow.append(var13, (SubLObject)module0340.NIL));
    }
    
    public static SubLObject f22975() {
        return module0340.$g2922$.getGlobalValue();
    }
    
    public static SubLObject f22976(final SubLObject var1) {
        return module0004.f104(var1, module0340.$g2922$.getGlobalValue(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
    }
    
    public static SubLObject f22977() {
        return Sequences.length(module0340.$g2922$.getGlobalValue());
    }
    
    public static SubLObject f22978(final SubLObject var32, final SubLObject var33) {
        final SubLObject var35;
        final SubLObject var34 = var35 = f22843(var32, (SubLObject)module0340.$ic181$, var33);
        if (module0340.NIL == conses_high.member(var35, module0340.$g2922$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0340.EQL), Symbols.symbol_function((SubLObject)module0340.IDENTITY))) {
            module0340.$g2922$.setGlobalValue((SubLObject)ConsesLow.cons(var35, module0340.$g2922$.getGlobalValue()));
        }
        return var34;
    }
    
    public static SubLObject f22979(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0340.$ic144$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)module0340.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0340.$ic144$);
        var7 = var5.first();
        var5 = var5.rest();
        SubLObject var8 = (SubLObject)module0340.NIL;
        SubLObject var9 = var5;
        SubLObject var10 = (SubLObject)module0340.NIL;
        SubLObject var161_162 = (SubLObject)module0340.NIL;
        while (module0340.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)module0340.$ic144$);
            var161_162 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)module0340.$ic144$);
            if (module0340.NIL == conses_high.member(var161_162, (SubLObject)module0340.$ic88$, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED)) {
                var10 = (SubLObject)module0340.T;
            }
            if (var161_162 == module0340.$ic89$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0340.NIL != var10 && module0340.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0340.$ic144$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0340.$ic90$, var5);
        final SubLObject var12 = (SubLObject)((module0340.NIL != var11) ? conses_high.cadr(var11) : module0340.NIL);
        final SubLObject var13;
        var5 = (var13 = var6);
        return (SubLObject)ConsesLow.listS((SubLObject)module0340.$ic5$, (SubLObject)ConsesLow.list(var7, (SubLObject)module0340.$ic183$, (SubLObject)module0340.$ic90$, var12), ConsesLow.append(var13, (SubLObject)module0340.NIL));
    }
    
    public static SubLObject f22980() {
        return module0340.$g2923$.getGlobalValue();
    }
    
    public static SubLObject f22981(final SubLObject var1) {
        return module0004.f104(var1, module0340.$g2923$.getGlobalValue(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
    }
    
    public static SubLObject f22982() {
        return Sequences.length(module0340.$g2923$.getGlobalValue());
    }
    
    public static SubLObject f22983(final SubLObject var32, SubLObject var33) {
        if (var33 == module0340.UNPROVIDED) {
            var33 = (SubLObject)module0340.NIL;
        }
        final SubLObject var35;
        final SubLObject var34 = var35 = f22843(var32, (SubLObject)module0340.$ic186$, var33);
        if (module0340.NIL == conses_high.member(var35, module0340.$g2923$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0340.EQL), Symbols.symbol_function((SubLObject)module0340.IDENTITY))) {
            module0340.$g2923$.setGlobalValue((SubLObject)ConsesLow.cons(var35, module0340.$g2923$.getGlobalValue()));
        }
        return var34;
    }
    
    public static SubLObject f22984(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0340.$ic168$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)module0340.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0340.$ic168$);
        var7 = var5.first();
        var5 = var5.rest();
        SubLObject var8 = (SubLObject)module0340.NIL;
        SubLObject var9 = var5;
        SubLObject var10 = (SubLObject)module0340.NIL;
        SubLObject var170_171 = (SubLObject)module0340.NIL;
        while (module0340.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)module0340.$ic168$);
            var170_171 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)module0340.$ic168$);
            if (module0340.NIL == conses_high.member(var170_171, (SubLObject)module0340.$ic88$, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED)) {
                var10 = (SubLObject)module0340.T;
            }
            if (var170_171 == module0340.$ic89$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0340.NIL != var10 && module0340.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0340.$ic168$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0340.$ic90$, var5);
        final SubLObject var12 = (SubLObject)((module0340.NIL != var11) ? conses_high.cadr(var11) : module0340.NIL);
        final SubLObject var13;
        var5 = (var13 = var6);
        return (SubLObject)ConsesLow.listS((SubLObject)module0340.$ic5$, (SubLObject)ConsesLow.list(var7, (SubLObject)module0340.$ic188$, (SubLObject)module0340.$ic90$, var12), ConsesLow.append(var13, (SubLObject)module0340.NIL));
    }
    
    public static SubLObject f22985() {
        return conses_high.copy_list(module0340.$g2924$.getGlobalValue());
    }
    
    public static SubLObject f22986(final SubLObject var1) {
        return module0004.f104(var1, module0340.$g2924$.getGlobalValue(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
    }
    
    public static SubLObject f22987() {
        return Sequences.length(module0340.$g2924$.getGlobalValue());
    }
    
    public static SubLObject f22988(final SubLObject var128) {
        final SubLObject var129 = f22793(var128, (SubLObject)module0340.$ic189$);
        if (var129.isSymbol()) {
            return Symbols.symbol_value(var129);
        }
        return var129;
    }
    
    public static SubLObject f22989(final SubLObject var128) {
        return f22793(var128, (SubLObject)module0340.$ic190$);
    }
    
    public static SubLObject f22990(final SubLObject var32, final SubLObject var33) {
        final SubLObject var34 = f22991(var32, var33);
        final SubLObject var36;
        final SubLObject var35 = var36 = f22843(var32, (SubLObject)module0340.$ic191$, var34);
        if (module0340.NIL == conses_high.member(var36, module0340.$g2924$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0340.EQL), Symbols.symbol_function((SubLObject)module0340.IDENTITY))) {
            module0340.$g2924$.setGlobalValue((SubLObject)ConsesLow.cons(var36, module0340.$g2924$.getGlobalValue()));
        }
        return var35;
    }
    
    public static SubLObject f22992(final SubLObject var9) {
        return f22993(var9);
    }
    
    public static SubLObject f22994(final SubLObject var32) {
        return f22995(var32);
    }
    
    public static SubLObject f22993(final SubLObject var128) {
        f22836(var128);
        module0340.$g2924$.setGlobalValue(Sequences.remove(var128, module0340.$g2924$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0340.EQL), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED));
        return var128;
    }
    
    public static SubLObject f22995(final SubLObject var32) {
        final SubLObject var33 = f22786(var32);
        return f22993(var33);
    }
    
    public static SubLObject f22991(final SubLObject var32, SubLObject var33) {
        var33 = conses_high.copy_tree(var33);
        final SubLObject var35;
        final SubLObject var34 = var35 = conses_high.getf(var33, (SubLObject)module0340.$ic56$, (SubLObject)module0340.UNPROVIDED);
        if (!var35.eql((SubLObject)module0340.$ic161$)) {
            if (!var35.eql((SubLObject)module0340.$ic162$)) {
                Errors.error((SubLObject)module0340.$ic192$, var32);
            }
        }
        return var33;
    }
    
    public static SubLObject f22996(final SubLObject var1) {
        return module0004.f104(var1, module0340.$g2925$.getGlobalValue(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
    }
    
    public static SubLObject f22997(final SubLObject var32, SubLObject var33) {
        if (var33 == module0340.UNPROVIDED) {
            var33 = (SubLObject)module0340.NIL;
        }
        final SubLObject var35;
        final SubLObject var34 = var35 = f22843(var32, (SubLObject)module0340.$ic194$, var33);
        if (module0340.NIL == conses_high.member(var35, module0340.$g2925$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0340.EQL), Symbols.symbol_function((SubLObject)module0340.IDENTITY))) {
            module0340.$g2925$.setGlobalValue((SubLObject)ConsesLow.cons(var35, module0340.$g2925$.getGlobalValue()));
        }
        return var34;
    }
    
    public static SubLObject f22998() {
        return Sequences.length(module0340.$g2925$.getGlobalValue());
    }
    
    public static SubLObject f22999(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0340.$ic144$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)module0340.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0340.$ic144$);
        var7 = var5.first();
        var5 = var5.rest();
        SubLObject var8 = (SubLObject)module0340.NIL;
        SubLObject var9 = var5;
        SubLObject var10 = (SubLObject)module0340.NIL;
        SubLObject var180_181 = (SubLObject)module0340.NIL;
        while (module0340.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)module0340.$ic144$);
            var180_181 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)module0340.$ic144$);
            if (module0340.NIL == conses_high.member(var180_181, (SubLObject)module0340.$ic88$, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED)) {
                var10 = (SubLObject)module0340.T;
            }
            if (var180_181 == module0340.$ic89$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0340.NIL != var10 && module0340.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0340.$ic144$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0340.$ic90$, var5);
        final SubLObject var12 = (SubLObject)((module0340.NIL != var11) ? conses_high.cadr(var11) : module0340.NIL);
        final SubLObject var13;
        var5 = (var13 = var6);
        return (SubLObject)ConsesLow.listS((SubLObject)module0340.$ic5$, (SubLObject)ConsesLow.list(var7, (SubLObject)module0340.$ic196$, (SubLObject)module0340.$ic90$, var12), ConsesLow.append(var13, (SubLObject)module0340.NIL));
    }
    
    public static SubLObject f23000() {
        return module0340.$g2926$.getGlobalValue();
    }
    
    public static SubLObject f23001(final SubLObject var1) {
        return module0004.f104(var1, module0340.$g2926$.getGlobalValue(), (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
    }
    
    public static SubLObject f23002() {
        return Sequences.length(module0340.$g2926$.getGlobalValue());
    }
    
    public static SubLObject f23003(final SubLObject var32, SubLObject var33) {
        if (var33 == module0340.UNPROVIDED) {
            var33 = (SubLObject)module0340.NIL;
        }
        final SubLObject var35;
        final SubLObject var34 = var35 = f22843(var32, (SubLObject)module0340.$ic199$, var33);
        if (module0340.NIL == conses_high.member(var35, module0340.$g2926$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0340.EQL), Symbols.symbol_function((SubLObject)module0340.IDENTITY))) {
            module0340.$g2926$.setGlobalValue((SubLObject)ConsesLow.cons(var35, module0340.$g2926$.getGlobalValue()));
        }
        return var34;
    }
    
    public static SubLObject f23004(final SubLObject var1, final SubLObject var21) {
        return f23005(var1, var21);
    }
    
    public static SubLObject f23005(final SubLObject var9, final SubLObject var21) {
        module0021.f1110(module0340.$g2927$.getGlobalValue(), var21);
        f23006(var9, var21);
        return var9;
    }
    
    public static SubLObject f23006(final SubLObject var9, final SubLObject var21) {
        module0021.f1038(f22825(var9), var21);
        module0021.f1038(f22838(var9), var21);
        return var9;
    }
    
    public static SubLObject f23007(final SubLObject var21) {
        final SubLObject var22 = module0021.f1060(var21, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
        final SubLObject var23 = module0021.f1060(var21, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED);
        return f22828(var22, var23);
    }
    
    public static SubLObject f23008() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22774", "S#25445", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0340", "f22775", "S#25446");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22776", "S#25447", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22777", "S#25448", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22778", "S#25449", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22779", "S#25440", 1, 0, false);
        new $f22779$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22787", "S#25450", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22780", "S#25451", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22781", "S#25452", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22782", "S#25453", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22783", "S#25454", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22784", "S#25455", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22785", "S#25456", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22788", "S#25457", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22790", "S#25458", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22794", "S#25459", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22795", "S#25460", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22796", "S#25461", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22789", "S#14902", 1, 0, false);
        new $f22789$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22798", "S#25462", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22799", "S#25463", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22800", "S#25464", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22801", "S#25465", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22802", "S#25466", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22803", "S#25467", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22804", "S#25468", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22805", "S#25469", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22806", "S#25470", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22807", "S#25471", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22808", "S#25472", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22809", "S#25473", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22810", "S#25474", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22811", "S#25475", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22812", "S#25476", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22813", "S#25477", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22814", "S#25478", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22815", "S#25479", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22816", "S#25480", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22817", "S#25481", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22818", "S#25482", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22819", "S#25483", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22820", "S#25484", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22821", "S#25485", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22822", "S#25486", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22823", "S#25487", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22824", "S#25488", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22797", "S#25489", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22826", "S#25441", 1, 0, false);
        new $f22826$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22827", "S#25490", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22828", "S#25491", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22832", "S#25492", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22833", "S#25493", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22834", "S#25494", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22835", "S#25495", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22830", "S#25496", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22829", "S#25497", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22837", "S#25498", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22825", "HL-MODULE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22838", "S#25499", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22839", "S#14903", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22793", "S#25500", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22840", "S#25501", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0340", "f22841", "S#25502");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22842", "S#25503", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22786", "S#14901", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22831", "S#25504", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22836", "S#14904", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22843", "S#14905", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22844", "S#25505", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22845", "S#25506", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22791", "S#25507", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22792", "S#25508", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22846", "S#25509", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22847", "S#25510", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22848", "S#25511", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22849", "S#25442", 1, 0, false);
        new $f22849$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22850", "S#25512", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22851", "S#25513", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22852", "S#25514", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22853", "S#25515", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22854", "S#25516", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22855", "S#25517", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22856", "S#25518", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22857", "S#25519", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22858", "S#25520", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22859", "S#25521", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22860", "S#25522", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22861", "S#25523", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22865", "S#25524", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22866", "S#25525", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22862", "S#25526", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22863", "S#25527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22864", "S#25528", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22867", "S#25529", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22868", "S#25530", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22869", "S#25531", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22870", "S#25532", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22871", "S#25533", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22872", "S#25534", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22873", "S#25535", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22874", "S#25536", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22875", "S#25537", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22876", "S#25538", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22877", "S#25539", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22878", "S#25540", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22880", "S#25541", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22881", "S#25542", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22882", "S#25543", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22883", "S#25544", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22884", "S#25545", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22885", "S#25546", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22886", "S#25547", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22887", "S#25548", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22888", "S#25549", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22889", "S#25550", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22890", "S#25551", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22891", "S#25552", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22892", "S#25553", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22893", "S#25554", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22894", "S#25555", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22895", "S#25556", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22896", "S#25557", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22897", "S#25558", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22898", "S#25559", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22899", "S#25560", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22900", "S#25561", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22901", "S#25562", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22902", "S#25563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22879", "S#25564", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22903", "S#25565", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22904", "S#25566", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22905", "S#25567", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22907", "S#25568", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22906", "S#25569", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22908", "S#25570", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22909", "S#25571", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22910", "S#25572", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0340", "f22911", "S#25573");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22912", "S#25574", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22913", "S#25575", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22914", "S#25576", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22915", "S#25577", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22916", "S#25578", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22917", "S#25579", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22918", "S#25580", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22919", "S#25581", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22920", "S#25582", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22921", "S#25583", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22922", "S#25584", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22923", "S#25585", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22924", "S#25586", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22925", "S#25587", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22926", "S#25588", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22927", "S#25589", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22928", "S#25590", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22929", "S#25591", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22930", "S#25592", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22931", "S#25593", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22932", "S#25594", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22933", "S#25595", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22935", "S#25596", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22934", "S#25597", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22936", "S#25598", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22937", "S#25599", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22938", "REGISTER-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22939", "S#25600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22940", "S#25601", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22941", "INFERENCE-REMOVAL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22944", "S#25602", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22946", "S#25603", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22947", "S#25604", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22948", "REDECLARE-INFERENCE-REMOVAL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22942", "S#25605", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22949", "UNDECLARE-INFERENCE-REMOVAL-MODULE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22951", "S#25606", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22952", "S#25607", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22953", "S#25608", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22954", "S#25609", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22950", "RECLASSIFY-REMOVAL-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22955", "S#25610", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22943", "S#25611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22945", "S#25612", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22956", "S#25613", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0340", "f22957", "S#25614");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22958", "S#25615", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22959", "S#25616", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22960", "S#25617", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22961", "S#25618", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22962", "S#25619", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22963", "S#25620", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0340", "f22964", "S#25621");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22965", "S#25622", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22966", "S#25623", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22967", "S#25624", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22968", "S#25625", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22969", "S#25626", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22970", "S#25627", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22971", "S#25628", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22972", "S#25629", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22973", "S#25630", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0340", "f22974", "S#25631");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22975", "S#25632", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22976", "S#25633", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22977", "S#25634", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22978", "S#25635", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0340", "f22979", "S#25636");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22980", "S#25637", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22981", "S#25638", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22982", "S#25639", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22983", "S#25640", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0340", "f22984", "S#25641");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22985", "S#25642", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22986", "S#25643", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22987", "S#25644", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22988", "S#25645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22989", "S#25646", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22990", "INFERENCE-REWRITE-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22992", "S#25647", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22994", "S#25648", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22993", "S#25649", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22995", "S#25650", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22991", "S#25651", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22996", "S#25652", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22997", "S#25653", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22998", "S#25654", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0340", "f22999", "S#25655");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f23000", "S#25656", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f23001", "S#25657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f23002", "S#25658", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f23003", "S#25659", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f23004", "S#25660", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f23005", "S#25661", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f23006", "S#25662", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f23007", "S#25663", 1, 0, false);
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f23009() {
        module0340.$g2903$ = SubLFiles.deflexical("S#25664", (SubLObject)((module0340.NIL != Symbols.boundp((SubLObject)module0340.$ic0$)) ? module0340.$g2903$.getGlobalValue() : module0340.NIL));
        module0340.$g2904$ = SubLFiles.deflexical("S#25665", (SubLObject)module0340.$ic1$);
        module0340.$g2905$ = SubLFiles.deflexical("S#25666", (SubLObject)module0340.$ic10$);
        module0340.$g2906$ = SubLFiles.deflexical("S#25667", (SubLObject)module0340.$ic11$);
        module0340.$g2907$ = SubLFiles.deflexical("S#25668", module0084.f5781(Sequences.reverse((SubLObject)ConsesLow.listS((SubLObject)module0340.$ic12$, (SubLObject)ConsesLow.list((SubLObject)module0340.$ic13$, module0340.$g2906$.getGlobalValue()), (SubLObject)module0340.$ic14$)), Symbols.symbol_function((SubLObject)module0340.EQL)));
        module0340.$g2908$ = SubLFiles.defconstant("S#25669", (SubLObject)module0340.$ic22$);
        module0340.$g2909$ = SubLFiles.deflexical("S#25670", (SubLObject)module0340.NIL);
        module0340.$g2910$ = SubLFiles.deflexical("S#25671", (module0340.NIL != Symbols.boundp((SubLObject)module0340.$ic85$)) ? module0340.$g2910$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0340.$ic86$, Symbols.symbol_function((SubLObject)module0340.EQUAL), (SubLObject)module0340.UNPROVIDED));
        module0340.$g2911$ = SubLFiles.deflexical("S#25672", (module0340.NIL != Symbols.boundp((SubLObject)module0340.$ic143$)) ? module0340.$g2911$.getGlobalValue() : module0077.f5313(Symbols.symbol_function((SubLObject)module0340.EQL), (SubLObject)module0340.UNPROVIDED));
        module0340.$g2912$ = SubLFiles.deflexical("S#25673", (SubLObject)((module0340.NIL != Symbols.boundp((SubLObject)module0340.$ic149$)) ? module0340.$g2912$.getGlobalValue() : module0340.NIL));
        module0340.$g2913$ = SubLFiles.deflexical("S#25674", (SubLObject)((module0340.NIL != Symbols.boundp((SubLObject)module0340.$ic150$)) ? module0340.$g2913$.getGlobalValue() : module0340.NIL));
        module0340.$g2914$ = SubLFiles.deflexical("S#25675", (SubLObject)((module0340.NIL != Symbols.boundp((SubLObject)module0340.$ic152$)) ? module0340.$g2914$.getGlobalValue() : module0340.NIL));
        module0340.$g2916$ = SubLFiles.deflexical("S#25676", (module0340.NIL != Symbols.boundp((SubLObject)module0340.$ic153$)) ? module0340.$g2916$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0340.$ic154$, (SubLObject)module0340.UNPROVIDED, (SubLObject)module0340.UNPROVIDED));
        module0340.$g2917$ = SubLFiles.deflexical("S#25677", (SubLObject)((module0340.NIL != Symbols.boundp((SubLObject)module0340.$ic156$)) ? module0340.$g2917$.getGlobalValue() : module0340.NIL));
        module0340.$g2918$ = SubLFiles.deflexical("S#25678", (SubLObject)((module0340.NIL != Symbols.boundp((SubLObject)module0340.$ic157$)) ? module0340.$g2918$.getGlobalValue() : module0340.NIL));
        module0340.$g2915$ = SubLFiles.deflexical("S#25679", (SubLObject)((module0340.NIL != Symbols.boundp((SubLObject)module0340.$ic158$)) ? module0340.$g2915$.getGlobalValue() : module0340.NIL));
        module0340.$g2919$ = SubLFiles.deflexical("S#25680", (module0340.NIL != Symbols.boundp((SubLObject)module0340.$ic159$)) ? module0340.$g2919$.getGlobalValue() : module0077.f5313((SubLObject)module0340.EQL, (SubLObject)module0340.$ic160$));
        module0340.$g2920$ = SubLFiles.defparameter("S#25681", (SubLObject)module0340.T);
        module0340.$g2921$ = SubLFiles.deflexical("S#25682", (module0340.NIL != Symbols.boundp((SubLObject)module0340.$ic167$)) ? module0340.$g2921$.getGlobalValue() : module0077.f5313(Symbols.symbol_function((SubLObject)module0340.EQL), (SubLObject)module0340.UNPROVIDED));
        module0340.$g2922$ = SubLFiles.deflexical("S#25683", (SubLObject)((module0340.NIL != Symbols.boundp((SubLObject)module0340.$ic177$)) ? module0340.$g2922$.getGlobalValue() : module0340.NIL));
        module0340.$g2923$ = SubLFiles.deflexical("S#25684", (SubLObject)((module0340.NIL != Symbols.boundp((SubLObject)module0340.$ic182$)) ? module0340.$g2923$.getGlobalValue() : module0340.NIL));
        module0340.$g2924$ = SubLFiles.deflexical("*REWRITE-MODULES*", (SubLObject)((module0340.NIL != Symbols.boundp((SubLObject)module0340.$ic187$)) ? module0340.$g2924$.getGlobalValue() : module0340.NIL));
        module0340.$g2925$ = SubLFiles.deflexical("S#25685", (SubLObject)((module0340.NIL != Symbols.boundp((SubLObject)module0340.$ic193$)) ? module0340.$g2925$.getGlobalValue() : module0340.NIL));
        module0340.$g2926$ = SubLFiles.deflexical("S#25686", (SubLObject)((module0340.NIL != Symbols.boundp((SubLObject)module0340.$ic195$)) ? module0340.$g2926$.getGlobalValue() : module0340.NIL));
        module0340.$g2927$ = SubLFiles.defconstant("S#25687", (SubLObject)module0340.$ic200$);
        return (SubLObject)module0340.NIL;
    }
    
    public static SubLObject f23010() {
        module0003.f57((SubLObject)module0340.$ic0$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0340.$g2908$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0340.$ic28$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0340.$ic29$);
        Structures.def_csetf((SubLObject)module0340.$ic30$, (SubLObject)module0340.$ic31$);
        Structures.def_csetf((SubLObject)module0340.$ic32$, (SubLObject)module0340.$ic33$);
        Structures.def_csetf((SubLObject)module0340.$ic34$, (SubLObject)module0340.$ic35$);
        Structures.def_csetf((SubLObject)module0340.$ic36$, (SubLObject)module0340.$ic37$);
        Structures.def_csetf((SubLObject)module0340.$ic38$, (SubLObject)module0340.$ic39$);
        Structures.def_csetf((SubLObject)module0340.$ic40$, (SubLObject)module0340.$ic41$);
        Structures.def_csetf((SubLObject)module0340.$ic42$, (SubLObject)module0340.$ic43$);
        Structures.def_csetf((SubLObject)module0340.$ic44$, (SubLObject)module0340.$ic45$);
        Structures.def_csetf((SubLObject)module0340.$ic46$, (SubLObject)module0340.$ic47$);
        Structures.def_csetf((SubLObject)module0340.$ic48$, (SubLObject)module0340.$ic49$);
        Structures.def_csetf((SubLObject)module0340.$ic50$, (SubLObject)module0340.$ic51$);
        Structures.def_csetf((SubLObject)module0340.$ic52$, (SubLObject)module0340.$ic53$);
        Equality.identity((SubLObject)module0340.$ic22$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0340.$g2908$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0340.$ic71$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), module0340.$g2908$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0340.$ic73$));
        module0034.f1909((SubLObject)module0340.$ic79$);
        module0003.f57((SubLObject)module0340.$ic85$);
        module0002.f50((SubLObject)module0340.$ic95$, (SubLObject)module0340.$ic96$);
        module0003.f57((SubLObject)module0340.$ic143$);
        module0002.f50((SubLObject)module0340.$ic147$, (SubLObject)module0340.$ic148$);
        module0003.f57((SubLObject)module0340.$ic149$);
        module0003.f57((SubLObject)module0340.$ic150$);
        module0003.f57((SubLObject)module0340.$ic152$);
        module0003.f57((SubLObject)module0340.$ic153$);
        module0003.f57((SubLObject)module0340.$ic156$);
        module0003.f57((SubLObject)module0340.$ic157$);
        module0003.f57((SubLObject)module0340.$ic158$);
        module0003.f57((SubLObject)module0340.$ic159$);
        module0003.f57((SubLObject)module0340.$ic167$);
        module0002.f50((SubLObject)module0340.$ic170$, (SubLObject)module0340.$ic171$);
        module0002.f50((SubLObject)module0340.$ic174$, (SubLObject)module0340.$ic175$);
        module0003.f57((SubLObject)module0340.$ic177$);
        module0002.f50((SubLObject)module0340.$ic179$, (SubLObject)module0340.$ic180$);
        module0003.f57((SubLObject)module0340.$ic182$);
        module0002.f50((SubLObject)module0340.$ic184$, (SubLObject)module0340.$ic185$);
        module0003.f57((SubLObject)module0340.$ic187$);
        module0003.f57((SubLObject)module0340.$ic193$);
        module0003.f57((SubLObject)module0340.$ic195$);
        module0002.f50((SubLObject)module0340.$ic197$, (SubLObject)module0340.$ic198$);
        module0021.f1193(module0340.$g2927$.getGlobalValue(), (SubLObject)module0340.$ic201$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0340.$g2908$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0340.$ic202$));
        return (SubLObject)module0340.NIL;
    }
    
    public void declareFunctions() {
        f23008();
    }
    
    public void initializeVariables() {
        f23009();
    }
    
    public void runTopLevelForms() {
        f23010();
    }
    
    static {
        me = (SubLFile)new module0340();
        module0340.$g2903$ = null;
        module0340.$g2904$ = null;
        module0340.$g2905$ = null;
        module0340.$g2906$ = null;
        module0340.$g2907$ = null;
        module0340.$g2908$ = null;
        module0340.$g2909$ = null;
        module0340.$g2910$ = null;
        module0340.$g2911$ = null;
        module0340.$g2912$ = null;
        module0340.$g2913$ = null;
        module0340.$g2914$ = null;
        module0340.$g2916$ = null;
        module0340.$g2917$ = null;
        module0340.$g2918$ = null;
        module0340.$g2915$ = null;
        module0340.$g2919$ = null;
        module0340.$g2920$ = null;
        module0340.$g2921$ = null;
        module0340.$g2922$ = null;
        module0340.$g2923$ = null;
        module0340.$g2924$ = null;
        module0340.$g2925$ = null;
        module0340.$g2926$ = null;
        module0340.$g2927$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#25664", "CYC");
        $ic1$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MODULE-TYPE"), SubLObjectFactory.makeKeyword("MODULE-SUBTYPE"), SubLObjectFactory.makeKeyword("MODULE-SOURCE"), SubLObjectFactory.makeKeyword("CHECK"), SubLObjectFactory.makeKeyword("EXTERNAL"), SubLObjectFactory.makeKeyword("UNIVERSAL"), SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("DIRECTION"), SubLObjectFactory.makeKeyword("PREDICATE"), SubLObjectFactory.makeKeyword("EVERY-PREDICATES"), SubLObjectFactory.makeKeyword("ANY-PREDICATES"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), SubLObjectFactory.makeKeyword("REQUIRED-MT"), SubLObjectFactory.makeKeyword("ARITY"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeKeyword("SUPPLANTS"), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeKeyword("APPLICABILITY-PATTERN"), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeKeyword("COST-PATTERN"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE-PATTERN"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), SubLObjectFactory.makeKeyword("INPUT-VERIFY-PATTERN"), SubLObjectFactory.makeKeyword("INPUT-ENCODE-PATTERN"), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), SubLObjectFactory.makeKeyword("OUTPUT-VERIFY-PATTERN"), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND-ITERATIVE-PATTERN"), SubLObjectFactory.makeKeyword("EXPAND-PATTERN"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeKeyword("REWRITE-CLOSURE"), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("REWRITE-SUPPORT"), SubLObjectFactory.makeKeyword("ARGUMENT-TYPE"), SubLObjectFactory.makeKeyword("INCOMPLETENESS"), SubLObjectFactory.makeKeyword("ADD"), SubLObjectFactory.makeKeyword("REMOVE"), SubLObjectFactory.makeKeyword("REMOVE-ALL"), SubLObjectFactory.makeKeyword("PREFERRED-OVER"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeKeyword("PRETTY-NAME") });
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11211", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#149", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14781", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic3$ = SubLObjectFactory.makeUninternedSymbol("US#8E4499");
        $ic4$ = SubLObjectFactory.makeSymbol("CLET");
        $ic5$ = SubLObjectFactory.makeSymbol("DO-LIST");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25447", "CYC")));
        $ic7$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic8$ = SubLObjectFactory.makeSymbol("S#25501", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#25500", "CYC");
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SKSI"), (SubLObject)SubLObjectFactory.makeKeyword("KB"), (SubLObject)SubLObjectFactory.makeKeyword("ABDUCTION"));
        $ic11$ = SubLObjectFactory.makeKeyword("KB");
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODULE-TYPE"));
        $ic13$ = SubLObjectFactory.makeKeyword("MODULE-SUBTYPE");
        $ic14$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODULE-SOURCE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNIVERSAL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-MT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REQUIRED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST-PATTERN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST-EXPRESSION")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)SubLObjectFactory.makeSymbol("S#25505", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLETENESS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLETE-PATTERN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RULE-SELECT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("EXPAND"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPAND-PATTERN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPAND-ITERATIVE-PATTERN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREDICATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARITY")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXCLUSIVE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)SubLObjectFactory.makeKeyword("ALL")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("INPUT-VERIFY-PATTERN"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("INPUT-ENCODE-PATTERN"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-VERIFY-PATTERN"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPORT-PATTERN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPORT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPORT-MT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EVERY-PREDICATES")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("APPLICABILITY"), (SubLObject)SubLObjectFactory.makeSymbol("FALSE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("APPLICABILITY-PATTERN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANY-PREDICATES")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("EXAMPLE"), (SubLObject)SubLObjectFactory.makeString("")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXTERNAL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REWRITE-SUPPORT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REWRITE-CLOSURE")) });
        $ic15$ = SubLObjectFactory.makeKeyword("ALL");
        $ic16$ = SubLObjectFactory.makeKeyword("OR");
        $ic17$ = SubLObjectFactory.makeSymbol("S#25440", "CYC");
        $ic18$ = SubLObjectFactory.makeKeyword("AND");
        $ic19$ = SubLObjectFactory.makeKeyword("NOT");
        $ic20$ = SubLObjectFactory.makeKeyword("MODULE-TYPE");
        $ic21$ = SubLObjectFactory.makeSymbol("S#14902", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#14781", "CYC");
        $ic23$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#29", "CYC"), SubLObjectFactory.makeSymbol("S#138", "CYC"), SubLObjectFactory.makeSymbol("S#12397", "CYC"), SubLObjectFactory.makeSymbol("S#717", "CYC"), SubLObjectFactory.makeSymbol("S#15032", "CYC"), SubLObjectFactory.makeSymbol("ARITY"), SubLObjectFactory.makeSymbol("S#5432", "CYC"), SubLObjectFactory.makeSymbol("S#25688", "CYC"), SubLObjectFactory.makeSymbol("S#15031", "CYC"), SubLObjectFactory.makeSymbol("S#25689", "CYC"), SubLObjectFactory.makeSymbol("S#25690", "CYC"), SubLObjectFactory.makeSymbol("S#25691", "CYC") });
        $ic24$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeKeyword("PLIST"), SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("PREDICATE"), SubLObjectFactory.makeKeyword("ANY-PREDICATES"), SubLObjectFactory.makeKeyword("ARITY"), SubLObjectFactory.makeKeyword("DIRECTION"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), SubLObjectFactory.makeKeyword("REQUIRED-MT"), SubLObjectFactory.makeKeyword("EXCLUSIVE-FUNC"), SubLObjectFactory.makeKeyword("REQUIRED-FUNC"), SubLObjectFactory.makeKeyword("COMPLETENESS") });
        $ic25$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#25462", "CYC"), SubLObjectFactory.makeSymbol("S#25463", "CYC"), SubLObjectFactory.makeSymbol("S#25464", "CYC"), SubLObjectFactory.makeSymbol("S#25465", "CYC"), SubLObjectFactory.makeSymbol("S#25466", "CYC"), SubLObjectFactory.makeSymbol("S#25467", "CYC"), SubLObjectFactory.makeSymbol("S#25468", "CYC"), SubLObjectFactory.makeSymbol("S#25469", "CYC"), SubLObjectFactory.makeSymbol("S#25470", "CYC"), SubLObjectFactory.makeSymbol("S#25471", "CYC"), SubLObjectFactory.makeSymbol("S#25472", "CYC"), SubLObjectFactory.makeSymbol("S#25473", "CYC") });
        $ic26$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#25474", "CYC"), SubLObjectFactory.makeSymbol("S#25475", "CYC"), SubLObjectFactory.makeSymbol("S#25476", "CYC"), SubLObjectFactory.makeSymbol("S#25477", "CYC"), SubLObjectFactory.makeSymbol("S#25478", "CYC"), SubLObjectFactory.makeSymbol("S#25479", "CYC"), SubLObjectFactory.makeSymbol("S#25480", "CYC"), SubLObjectFactory.makeSymbol("S#25481", "CYC"), SubLObjectFactory.makeSymbol("S#25482", "CYC"), SubLObjectFactory.makeSymbol("S#25483", "CYC"), SubLObjectFactory.makeSymbol("S#25484", "CYC"), SubLObjectFactory.makeSymbol("S#25485", "CYC") });
        $ic27$ = SubLObjectFactory.makeSymbol("S#25489", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#25461", "CYC");
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#14902", "CYC"));
        $ic30$ = SubLObjectFactory.makeSymbol("S#25462", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#25474", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#25463", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#25475", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#25464", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#25476", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#25465", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#25477", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#25466", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#25478", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#25467", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#25479", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("S#25468", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("S#25480", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#25469", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("S#25481", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#25470", "CYC");
        $ic47$ = SubLObjectFactory.makeSymbol("S#25482", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("S#25471", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#25483", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#25472", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#25484", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#25473", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#25485", "CYC");
        $ic54$ = SubLObjectFactory.makeKeyword("NAME");
        $ic55$ = SubLObjectFactory.makeKeyword("PLIST");
        $ic56$ = SubLObjectFactory.makeKeyword("SENSE");
        $ic57$ = SubLObjectFactory.makeKeyword("PREDICATE");
        $ic58$ = SubLObjectFactory.makeKeyword("ANY-PREDICATES");
        $ic59$ = SubLObjectFactory.makeKeyword("ARITY");
        $ic60$ = SubLObjectFactory.makeKeyword("DIRECTION");
        $ic61$ = SubLObjectFactory.makeKeyword("REQUIRED-PATTERN");
        $ic62$ = SubLObjectFactory.makeKeyword("REQUIRED-MT");
        $ic63$ = SubLObjectFactory.makeKeyword("EXCLUSIVE-FUNC");
        $ic64$ = SubLObjectFactory.makeKeyword("REQUIRED-FUNC");
        $ic65$ = SubLObjectFactory.makeKeyword("COMPLETENESS");
        $ic66$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic67$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic68$ = SubLObjectFactory.makeSymbol("S#25486", "CYC");
        $ic69$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic70$ = SubLObjectFactory.makeKeyword("END");
        $ic71$ = SubLObjectFactory.makeSymbol("S#25488", "CYC");
        $ic72$ = SubLObjectFactory.makeString("[HL Module: ~a]");
        $ic73$ = SubLObjectFactory.makeSymbol("S#25441", "CYC");
        $ic74$ = SubLObjectFactory.makeSymbol("S#748", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("S#25445", "CYC");
        $ic76$ = SubLObjectFactory.makeKeyword("EXCLUSIVE");
        $ic77$ = SubLObjectFactory.makeKeyword("SUPPLANTS");
        $ic78$ = SubLObjectFactory.makeString(":supplants is meaningless without :exclusive being specified.  ~s contains a :supplants specification without an :exclusive.");
        $ic79$ = SubLObjectFactory.makeSymbol("S#25495", "CYC");
        $ic80$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODULE-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("INVALID"));
        $ic81$ = SubLObjectFactory.makeSymbol("S#25670", "CYC");
        $ic82$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic83$ = SubLObjectFactory.makeKeyword("FREE");
        $ic84$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic85$ = SubLObjectFactory.makeSymbol("S#25671", "CYC");
        $ic86$ = SubLObjectFactory.makeInteger(212);
        $ic87$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25692", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic88$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic89$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic90$ = SubLObjectFactory.makeKeyword("DONE");
        $ic91$ = SubLObjectFactory.makeUninternedSymbol("US#333F606");
        $ic92$ = SubLObjectFactory.makeSymbol("DO-HASH-TABLE");
        $ic93$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25503", "CYC"));
        $ic94$ = SubLObjectFactory.makeSymbol("IGNORE");
        $ic95$ = SubLObjectFactory.makeSymbol("S#25503", "CYC");
        $ic96$ = SubLObjectFactory.makeSymbol("S#25502", "CYC");
        $ic97$ = SubLObjectFactory.makeKeyword("ABDUCTION");
        $ic98$ = SubLObjectFactory.makeKeyword("UNIVERSAL");
        $ic99$ = SubLObjectFactory.makeKeyword("MODULE-SOURCE");
        $ic100$ = SubLObjectFactory.makeKeyword("ANYTHING");
        $ic101$ = SubLObjectFactory.makeKeyword("REQUIRED");
        $ic102$ = SubLObjectFactory.makeKeyword("COST-PATTERN");
        $ic103$ = SubLObjectFactory.makeKeyword("COST-EXPRESSION");
        $ic104$ = SubLObjectFactory.makeKeyword("COST");
        $ic105$ = SubLObjectFactory.makeKeyword("CHECK");
        $ic106$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic107$ = SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND");
        $ic108$ = SubLObjectFactory.makeString("check");
        $ic109$ = SubLObjectFactory.makeKeyword("RULE-SELECT");
        $ic110$ = SubLObjectFactory.makeKeyword("RULE-FILTER");
        $ic111$ = SubLObjectFactory.makeKeyword("EXPAND");
        $ic112$ = SubLObjectFactory.makeKeyword("REMOVAL");
        $ic113$ = SubLObjectFactory.makeSymbol("S#25693", "CYC");
        $ic114$ = SubLObjectFactory.makeSymbol("S#25694", "CYC");
        $ic115$ = SubLObjectFactory.makeSymbol("S#25506", "CYC");
        $ic116$ = SubLObjectFactory.makeKeyword("EXPAND-PATTERN");
        $ic117$ = SubLObjectFactory.makeKeyword("EXPAND-ITERATIVE-PATTERN");
        $ic118$ = SubLObjectFactory.makeSymbol("S#14908", "CYC");
        $ic119$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic120$ = SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN");
        $ic121$ = SubLObjectFactory.makeKeyword("INPUT-VERIFY-PATTERN");
        $ic122$ = SubLObjectFactory.makeKeyword("INPUT-ENCODE-PATTERN");
        $ic123$ = SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN");
        $ic124$ = SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN");
        $ic125$ = SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN");
        $ic126$ = SubLObjectFactory.makeKeyword("OUTPUT-VERIFY-PATTERN");
        $ic127$ = SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN");
        $ic128$ = SubLObjectFactory.makeKeyword("SUPPORT-PATTERN");
        $ic129$ = SubLObjectFactory.makeKeyword("SUPPORT");
        $ic130$ = SubLObjectFactory.makeKeyword("SUPPORT-MODULE");
        $ic131$ = SubLObjectFactory.makeKeyword("SUPPORT-MT");
        $ic132$ = SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH");
        $ic133$ = SubLObjectFactory.makeKeyword("EVERY-PREDICATES");
        $ic134$ = SubLObjectFactory.makeKeyword("APPLICABILITY");
        $ic135$ = SubLObjectFactory.makeKeyword("APPLICABILITY-PATTERN");
        $ic136$ = SubLObjectFactory.makeKeyword("DOCUMENTATION");
        $ic137$ = SubLObjectFactory.makeKeyword("EXAMPLE");
        $ic138$ = SubLObjectFactory.makeKeyword("COMPLETE");
        $ic139$ = SubLObjectFactory.makeKeyword("INCOMPLETE");
        $ic140$ = SubLObjectFactory.makeKeyword("COMPLETE-PATTERN");
        $ic141$ = SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN");
        $ic142$ = SubLObjectFactory.makeKeyword("EXTERNAL");
        $ic143$ = SubLObjectFactory.makeSymbol("S#25672", "CYC");
        $ic144$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14781", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic145$ = SubLObjectFactory.makeSymbol("S#708", "CYC");
        $ic146$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25574", "CYC"));
        $ic147$ = SubLObjectFactory.makeSymbol("S#25574", "CYC");
        $ic148$ = SubLObjectFactory.makeSymbol("S#25573", "CYC");
        $ic149$ = SubLObjectFactory.makeSymbol("S#25673", "CYC");
        $ic150$ = SubLObjectFactory.makeSymbol("S#25674", "CYC");
        $ic151$ = SubLObjectFactory.makeSymbol("S#25442", "CYC");
        $ic152$ = SubLObjectFactory.makeSymbol("S#25675", "CYC");
        $ic153$ = SubLObjectFactory.makeSymbol("S#25676", "CYC");
        $ic154$ = SubLObjectFactory.makeInteger(32);
        $ic155$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic156$ = SubLObjectFactory.makeSymbol("S#25677", "CYC");
        $ic157$ = SubLObjectFactory.makeSymbol("S#25678", "CYC");
        $ic158$ = SubLObjectFactory.makeSymbol("S#25679", "CYC");
        $ic159$ = SubLObjectFactory.makeSymbol("S#25680", "CYC");
        $ic160$ = SubLObjectFactory.makeInteger(50);
        $ic161$ = SubLObjectFactory.makeKeyword("POS");
        $ic162$ = SubLObjectFactory.makeKeyword("NEG");
        $ic163$ = SubLObjectFactory.makeString("removal module ~S must have a :SENSE of :POS or :NEG");
        $ic164$ = SubLObjectFactory.makeSymbol("CAR");
        $ic165$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#14781", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10994", "CYC"));
        $ic166$ = SubLObjectFactory.makeSymbol("S#25613", "CYC");
        $ic167$ = SubLObjectFactory.makeSymbol("S#25682", "CYC");
        $ic168$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic169$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25615", "CYC"));
        $ic170$ = SubLObjectFactory.makeSymbol("S#25615", "CYC");
        $ic171$ = SubLObjectFactory.makeSymbol("S#25614", "CYC");
        $ic172$ = SubLObjectFactory.makeKeyword("REMOVAL-CONJUNCTIVE");
        $ic173$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25622", "CYC"));
        $ic174$ = SubLObjectFactory.makeSymbol("S#25622", "CYC");
        $ic175$ = SubLObjectFactory.makeSymbol("S#25621", "CYC");
        $ic176$ = SubLObjectFactory.makeKeyword("META-REMOVAL");
        $ic177$ = SubLObjectFactory.makeSymbol("S#25683", "CYC");
        $ic178$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25632", "CYC"));
        $ic179$ = SubLObjectFactory.makeSymbol("S#25632", "CYC");
        $ic180$ = SubLObjectFactory.makeSymbol("S#25631", "CYC");
        $ic181$ = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $ic182$ = SubLObjectFactory.makeSymbol("S#25684", "CYC");
        $ic183$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25637", "CYC"));
        $ic184$ = SubLObjectFactory.makeSymbol("S#25637", "CYC");
        $ic185$ = SubLObjectFactory.makeSymbol("S#25636", "CYC");
        $ic186$ = SubLObjectFactory.makeKeyword("META-TRANSFORMATION");
        $ic187$ = SubLObjectFactory.makeSymbol("*REWRITE-MODULES*");
        $ic188$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25642", "CYC"));
        $ic189$ = SubLObjectFactory.makeKeyword("REWRITE-SUPPORT");
        $ic190$ = SubLObjectFactory.makeKeyword("REWRITE-CLOSURE");
        $ic191$ = SubLObjectFactory.makeKeyword("REWRITE");
        $ic192$ = SubLObjectFactory.makeString("rewrite module ~S must have a :SENSE of :POS or :NEG");
        $ic193$ = SubLObjectFactory.makeSymbol("S#25685", "CYC");
        $ic194$ = SubLObjectFactory.makeKeyword("STRUCTURAL");
        $ic195$ = SubLObjectFactory.makeSymbol("S#25686", "CYC");
        $ic196$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25656", "CYC"));
        $ic197$ = SubLObjectFactory.makeSymbol("S#25656", "CYC");
        $ic198$ = SubLObjectFactory.makeSymbol("S#25655", "CYC");
        $ic199$ = SubLObjectFactory.makeKeyword("META-STRUCTURAL");
        $ic200$ = SubLObjectFactory.makeInteger(256);
        $ic201$ = SubLObjectFactory.makeSymbol("S#25663", "CYC");
        $ic202$ = SubLObjectFactory.makeSymbol("S#25660", "CYC");
    }
    
    public static final class $f22779$UnaryFunction extends UnaryFunction
    {
        public $f22779$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#25440"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return module0340.f22779(var12);
        }
    }
    
    public static final class $sX14781_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $plist;
        public SubLObject $sense;
        public SubLObject $predicate;
        public SubLObject $any_predicates;
        public SubLObject $arity;
        public SubLObject $direction;
        public SubLObject $required_pattern;
        public SubLObject $required_mt;
        public SubLObject $exclusive_func;
        public SubLObject $required_func;
        public SubLObject $completeness;
        private static final SubLStructDeclNative structDecl;
        
        public $sX14781_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$plist = (SubLObject)CommonSymbols.NIL;
            this.$sense = (SubLObject)CommonSymbols.NIL;
            this.$predicate = (SubLObject)CommonSymbols.NIL;
            this.$any_predicates = (SubLObject)CommonSymbols.NIL;
            this.$arity = (SubLObject)CommonSymbols.NIL;
            this.$direction = (SubLObject)CommonSymbols.NIL;
            this.$required_pattern = (SubLObject)CommonSymbols.NIL;
            this.$required_mt = (SubLObject)CommonSymbols.NIL;
            this.$exclusive_func = (SubLObject)CommonSymbols.NIL;
            this.$required_func = (SubLObject)CommonSymbols.NIL;
            this.$completeness = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX14781_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$plist;
        }
        
        public SubLObject getField4() {
            return this.$sense;
        }
        
        public SubLObject getField5() {
            return this.$predicate;
        }
        
        public SubLObject getField6() {
            return this.$any_predicates;
        }
        
        public SubLObject getField7() {
            return this.$arity;
        }
        
        public SubLObject getField8() {
            return this.$direction;
        }
        
        public SubLObject getField9() {
            return this.$required_pattern;
        }
        
        public SubLObject getField10() {
            return this.$required_mt;
        }
        
        public SubLObject getField11() {
            return this.$exclusive_func;
        }
        
        public SubLObject getField12() {
            return this.$required_func;
        }
        
        public SubLObject getField13() {
            return this.$completeness;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$plist = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$sense = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$predicate = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$any_predicates = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$arity = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$direction = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$required_pattern = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$required_mt = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$exclusive_func = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$required_func = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$completeness = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX14781_native.class, module0340.$ic22$, module0340.$ic21$, module0340.$ic23$, module0340.$ic24$, new String[] { "$name", "$plist", "$sense", "$predicate", "$any_predicates", "$arity", "$direction", "$required_pattern", "$required_mt", "$exclusive_func", "$required_func", "$completeness" }, module0340.$ic25$, module0340.$ic26$, module0340.$ic27$);
        }
    }
    
    public static final class $f22789$UnaryFunction extends UnaryFunction
    {
        public $f22789$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#14902"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return module0340.f22789(var12);
        }
    }
    
    public static final class $f22826$UnaryFunction extends UnaryFunction
    {
        public $f22826$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#25441"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return module0340.f22826(var12);
        }
    }
    
    public static final class $f22849$UnaryFunction extends UnaryFunction
    {
        public $f22849$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#25442"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return module0340.f22849(var12);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0340.class
	Total time: 740 ms
	
	Decompiled with Procyon 0.5.32.
*/