package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0202 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0202";
    public static final String myFingerPrint = "668c22eb216167226d16a6b8216c25cf5945ef150566c177f5cf59c851cff83c";
    public static SubLSymbol $g2293$;
    public static SubLSymbol $g2294$;
    public static SubLSymbol $g2295$;
    public static SubLSymbol $g2296$;
    public static SubLSymbol $g2297$;
    public static SubLSymbol $g2298$;
    public static SubLSymbol $g2299$;
    public static SubLSymbol $g2300$;
    public static SubLSymbol $g2301$;
    public static SubLSymbol $g2302$;
    public static SubLSymbol $g2303$;
    public static SubLSymbol $g2304$;
    private static SubLSymbol $g2305$;
    private static SubLSymbol $g2306$;
    private static SubLSymbol $g2307$;
    private static SubLSymbol $g2308$;
    private static SubLSymbol $g2309$;
    private static SubLSymbol $g2310$;
    private static SubLSymbol $g2311$;
    private static SubLSymbol $g2312$;
    private static SubLSymbol $g2313$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLList $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLList $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLList $ic16$;
    private static final SubLList $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLObject $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLString $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLObject $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLList $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLObject $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLObject $ic76$;
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
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLObject $ic91$;
    private static final SubLObject $ic92$;
    private static final SubLObject $ic93$;
    private static final SubLObject $ic94$;
    private static final SubLObject $ic95$;
    private static final SubLObject $ic96$;
    private static final SubLObject $ic97$;
    private static final SubLObject $ic98$;
    private static final SubLObject $ic99$;
    private static final SubLObject $ic100$;
    private static final SubLObject $ic101$;
    private static final SubLObject $ic102$;
    private static final SubLObject $ic103$;
    private static final SubLObject $ic104$;
    private static final SubLObject $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLObject $ic107$;
    private static final SubLObject $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLObject $ic110$;
    private static final SubLObject $ic111$;
    private static final SubLObject $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLString $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLObject $ic117$;
    private static final SubLObject $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLString $ic121$;
    private static final SubLObject $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLObject $ic124$;
    private static final SubLString $ic125$;
    private static final SubLObject $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLString $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLObject $ic138$;
    private static final SubLObject $ic139$;
    private static final SubLList $ic140$;
    private static final SubLList $ic141$;
    private static final SubLString $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLString $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLObject $ic148$;
    private static final SubLObject $ic149$;
    private static final SubLString $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLList $ic152$;
    private static final SubLList $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLList $ic162$;
    
    public static SubLObject f12589(final SubLObject var1, final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12590(var1) && var2.equal(module0205.f13342(var1)));
    }
    
    public static SubLObject f12591(final SubLObject var1, final SubLObject var3) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12590(var1) && module0202.NIL != module0004.f104(module0205.f13342(var1), var3, Symbols.symbol_function((SubLObject)module0202.EQUAL), (SubLObject)module0202.UNPROVIDED));
    }
    
    public static SubLObject f12592(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12589(var4, module0202.$ic3$) && module0202.NIL != f12593(var4));
    }
    
    public static SubLObject f12594(final SubLObject var4) {
        return f12589(var4, module0202.$ic5$);
    }
    
    public static SubLObject f12595(final SubLObject var4) {
        return f12589(var4, module0202.$ic7$);
    }
    
    public static SubLObject f12596(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12595(var1) || module0202.NIL != f12594(var1));
    }
    
    public static SubLObject f12597(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12589(var4, module0202.$ic8$) && module0202.NIL != f12598(var4));
    }
    
    public static SubLObject f12599(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12589(var4, module0202.$ic9$) && module0202.NIL != f12598(var4));
    }
    
    public static SubLObject f12600(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12589(var4, module0202.$ic10$) && module0202.NIL != f12598(var4));
    }
    
    public static SubLObject f12601(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.$ic8$.eql(var4) || module0202.$ic9$.eql(var4));
    }
    
    public static SubLObject f12602(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12590(var4) && module0202.NIL != f12601(module0205.f13342(var4)) && module0202.NIL != f12598(var4));
    }
    
    public static SubLObject f12603(final SubLObject var4) {
        return f12597(module0279.f18578(var4, (SubLObject)module0202.UNPROVIDED));
    }
    
    public static SubLObject f12604(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12589(var4, module0202.$ic11$) && module0202.NIL != f12598(var4) && module0202.NIL != module0201.f12546(module0205.f13343(var4, (SubLObject)module0202.UNPROVIDED)));
    }
    
    public static SubLObject f12605(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12589(var4, module0202.$ic11$) && module0202.NIL != f12598(var4) && module0202.NIL != module0201.f12580(module0205.f13343(var4, (SubLObject)module0202.UNPROVIDED)));
    }
    
    public static SubLObject f12606(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12589(var4, module0202.$ic12$) && module0202.NIL != f12598(var4) && module0202.NIL != module0201.f12546(module0205.f13343(var4, (SubLObject)module0202.UNPROVIDED)));
    }
    
    public static SubLObject f12607(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12589(var4, module0202.$ic13$) && module0202.NIL != f12608(var4));
    }
    
    public static SubLObject f12609(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12589(var4, module0202.$ic14$) && module0202.NIL != f12608(var4));
    }
    
    public static SubLObject f12610(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12589(var4, module0202.$ic15$) && module0202.NIL != f12608(var4));
    }
    
    public static SubLObject f12611(final SubLObject var4) {
        return Equality.eql(var4, module0202.$ic3$);
    }
    
    public static SubLObject f12612(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var4.eql(module0202.$ic8$) || var4.eql(module0202.$ic10$) || var4.eql(module0202.$ic9$));
    }
    
    public static SubLObject f12613(final SubLObject var4) {
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12614(final SubLObject var4) {
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12615(final SubLObject var4) {
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12616(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var4.eql(module0202.$ic7$) || var4.eql(module0202.$ic5$));
    }
    
    public static SubLObject f12617(final SubLObject var4) {
        return Equality.eql(var4, module0202.$ic12$);
    }
    
    public static SubLObject f12618(final SubLObject var4) {
        return Equality.eql(var4, module0202.$ic11$);
    }
    
    public static SubLObject f12619(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12617(var4) || module0202.NIL != f12618(var4));
    }
    
    public static SubLObject f12620(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12598(var4) && module0202.NIL != f12619(module0205.f13378(var4)));
    }
    
    public static SubLObject f12621(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var4.eql(module0202.$ic15$) || var4.eql(module0202.$ic14$) || var4.eql(module0202.$ic13$));
    }
    
    public static SubLObject f12622(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != module0173.f10955(var4) && module0202.NIL == f12621(var4) && module0202.NIL != module0269.f17833(var4));
    }
    
    public static SubLObject f12623(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12590(var4) && module0202.NIL != f12621(module0205.f13342(var4)) && module0202.NIL != f12608(var4));
    }
    
    public static SubLObject f12624(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var4.eql(module0202.$ic12$) || module0202.NIL != f12621(var4));
    }
    
    public static SubLObject f12625(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12606(var4) || module0202.NIL != f12623(var4));
    }
    
    public static SubLObject f12626(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12619(var4) || module0202.NIL != f12621(var4));
    }
    
    public static SubLObject f12627(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12620(var4) || module0202.NIL != f12623(var4));
    }
    
    public static SubLObject f12628(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12611(var4) || module0202.NIL != f12612(var4) || module0202.NIL != f12613(var4) || module0202.NIL != f12614(var4) || module0202.NIL != f12615(var4) || module0202.NIL != f12616(var4));
    }
    
    public static SubLObject f12629(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != module0173.f10955(var4) && module0202.NIL == f12628(var4) && module0202.NIL != module0269.f17737(var4));
    }
    
    public static SubLObject f12630(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12622(var4) || module0202.NIL != f12629(var4));
    }
    
    public static SubLObject f12631(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var4.eql(module0202.$ic18$) || var4.eql(module0202.$ic19$) || var4.eql(module0202.$ic20$) || var4.eql(module0202.$ic21$));
    }
    
    public static SubLObject f12632(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var4.eql(module0202.$ic22$) || var4.eql(module0202.$ic23$));
    }
    
    public static SubLObject f12633(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12631(var4) || module0202.NIL != f12632(var4));
    }
    
    public static SubLObject f12634(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12628(var4) || module0202.NIL != f12626(var4));
    }
    
    public static SubLObject f12635(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12590(var4) && module0202.NIL != f12628(module0205.f13342(var4)));
    }
    
    public static SubLObject f12636(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12590(var4) && module0202.NIL != f12637(var4, (SubLObject)module0202.ZERO_INTEGER, (SubLObject)module0202.UNPROVIDED));
    }
    
    public static SubLObject f12593(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12590(var4) && module0202.NIL != f12637(var4, (SubLObject)module0202.ONE_INTEGER, (SubLObject)module0202.UNPROVIDED));
    }
    
    public static SubLObject f12598(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12590(var4) && module0202.NIL != f12637(var4, (SubLObject)module0202.TWO_INTEGER, (SubLObject)module0202.UNPROVIDED));
    }
    
    public static SubLObject f12608(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12590(var4) && module0202.NIL != f12637(var4, (SubLObject)module0202.THREE_INTEGER, (SubLObject)module0202.UNPROVIDED));
    }
    
    public static SubLObject f12638(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12590(var4) && module0202.NIL != f12637(var4, (SubLObject)module0202.FOUR_INTEGER, (SubLObject)module0202.UNPROVIDED));
    }
    
    public static SubLObject f12639(final SubLObject var4) {
        if (module0202.NIL != f12590(var4)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12640(var4) || module0202.NIL != f12641(var4));
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12640(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12589(var4, module0202.$ic24$) && module0202.NIL != f12637(var4, (SubLObject)module0202.TWO_INTEGER, (SubLObject)module0202.UNPROVIDED) && module0205.f13343(var4, (SubLObject)module0202.UNPROVIDED).isList() && module0202.NIL != module0552.f34135(module0205.f13344(var4, (SubLObject)module0202.UNPROVIDED)));
    }
    
    public static SubLObject f12641(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12589(var4, module0202.$ic25$) && module0202.NIL != f12637(var4, (SubLObject)module0202.ONE_INTEGER, (SubLObject)module0202.UNPROVIDED) && module0202.NIL != module0552.f34135(module0205.f13343(var4, (SubLObject)module0202.UNPROVIDED)));
    }
    
    public static SubLObject f12642(final SubLObject var6) {
        return f12643(module0202.$ic26$, var6);
    }
    
    public static SubLObject f12644(final SubLObject var1) {
        if (module0202.NIL != f12589(var1, module0202.$ic26$)) {
            return module0205.f13343(var1, (SubLObject)module0202.UNPROVIDED);
        }
        return var1;
    }
    
    public static SubLObject f12645(final SubLObject var1) {
        if (module0202.NIL == f12589(var1, module0202.$ic26$)) {
            return f12642(var1);
        }
        return var1;
    }
    
    public static SubLObject f12646(final SubLObject var4) {
        return Types.sublisp_null(var4);
    }
    
    public static SubLObject f12647(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var4.eql(module0202.$ic27$) || var4.eql(module0202.$ic28$));
    }
    
    public static SubLObject f12648(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12598(var4) && module0202.NIL != f12647(module0205.f13342(var4)));
    }
    
    public static SubLObject f12649(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12589(var4, module0202.$ic29$) && module0202.NIL != f12598(var4));
    }
    
    public static SubLObject f12650(final SubLObject var4) {
        return Equality.eql(var4, module0202.$ic30$);
    }
    
    public static SubLObject f12651(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12598(var4) && module0202.NIL != f12650(module0205.f13342(var4)));
    }
    
    public static SubLObject f12652(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12589(var4, module0202.$ic31$) && module0202.NIL != f12598(var4));
    }
    
    public static SubLObject f12653(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12589(var4, module0202.$ic32$) && module0202.NIL != f12593(var4));
    }
    
    public static SubLObject f12654(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12648(var4) || module0202.NIL != f12651(var4));
    }
    
    public static SubLObject f12655(final SubLObject var4) {
        return Types.consp(var4);
    }
    
    public static SubLObject f12590(final SubLObject var4) {
        return f12655(var4);
    }
    
    public static SubLObject f12656(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12590(var4) && module0202.NIL != module0173.f10955(module0205.f13342(var4)));
    }
    
    public static SubLObject f12657(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != module0173.f10955(var4) || module0202.NIL != f12656(var4));
    }
    
    public static SubLObject f12658(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != module0167.f10813(var4) || module0202.NIL != f12659(var4));
    }
    
    public static SubLObject f12659(final SubLObject var4) {
        return f12590(var4);
    }
    
    public static SubLObject f12660(final SubLObject var4) {
        return f12590(var4);
    }
    
    public static SubLObject f12661(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12660(var4) || module0202.NIL != module0206.f13427(var4));
    }
    
    public static SubLObject f12662(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12660(var4) || module0202.NIL != module0206.f13438(var4));
    }
    
    public static SubLObject f12663(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12661(var4) || module0202.NIL != module0206.f13497(var4));
    }
    
    public static SubLObject f12664(final SubLObject var4) {
        return f12590(var4);
    }
    
    public static SubLObject f12665(final SubLObject var4) {
        if (module0202.NIL != f12590(var4)) {
            SubLObject var6;
            final SubLObject var5 = var6 = module0205.f13180(var4, (SubLObject)module0202.$ic33$);
            SubLObject var7 = (SubLObject)module0202.NIL;
            var7 = var6.first();
            while (module0202.NIL != var6) {
                if (module0202.NIL != f12590(var7)) {
                    return (SubLObject)module0202.T;
                }
                var6 = var6.rest();
                var7 = var6.first();
            }
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12666(final SubLObject var1) {
        return module0205.f13188(var1, (SubLObject)module0202.$ic34$, (SubLObject)module0202.NIL, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12667(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12625(var1) && module0202.NIL != f12592(f12668(var1)));
    }
    
    public static SubLObject f12669(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12604(var1) && module0202.NIL != f12592(f12668(var1)));
    }
    
    public static SubLObject f12670(final SubLObject var1) {
        if (module0202.NIL != f12627(var1)) {
            final SubLObject var2 = f12668(var1);
            if (module0202.NIL != f12592(var2)) {
                return (SubLObject)module0202.T;
            }
            if (module0202.NIL != f12595(var2) || module0202.NIL != f12594(var2)) {
                SubLObject var3 = (SubLObject)module0202.NIL;
                final SubLObject var4 = module0205.f13207(module0205.f13207(var2, (SubLObject)module0202.UNPROVIDED), (SubLObject)module0202.$ic33$);
                SubLObject var5;
                SubLObject var6;
                for (var5 = (SubLObject)module0202.NIL, var5 = var4; module0202.NIL == var3 && module0202.NIL != var5; var3 = (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL == f12592(var6)), var5 = var5.rest()) {
                    var6 = var5.first();
                }
                return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL == var3);
            }
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12671(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12589(var14, module0202.$ic35$) && module0202.NIL != module0205.f13348(var14, (SubLObject)module0202.$ic36$));
    }
    
    public static SubLObject f12672(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var14.eql(module0202.$ic37$) || (module0202.NIL != f12589(var14, module0202.$ic35$) && module0202.NIL == f12673(var14) && module0202.NIL == module0205.f13348(var14, (SubLObject)module0202.UNPROVIDED)));
    }
    
    public static SubLObject f12674(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12671(var14) || module0202.NIL != f12672(var14));
    }
    
    public static SubLObject f12675(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean((module0202.NIL != module0173.f10955(var4) && module0202.NIL != module0269.f17705(var4)) || module0202.NIL != f12676(var4));
    }
    
    public static SubLObject f12676(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12677(var4) || module0202.NIL != f12678(var4));
    }
    
    public static SubLObject f12677(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12679(var4) || module0202.NIL != f12680(var4));
    }
    
    public static SubLObject f12679(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var4.eql(module0202.$ic38$) || (module0202.NIL != f12589(var4, module0202.$ic39$) && module0202.NIL == f12673(var4) && module0202.NIL == module0205.f13348(var4, (SubLObject)module0202.UNPROVIDED)));
    }
    
    public static SubLObject f12680(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12589(var4, module0202.$ic39$) && module0202.NIL != module0205.f13348(var4, (SubLObject)module0202.$ic36$));
    }
    
    public static SubLObject f12678(final SubLObject var4) {
        return f12589(var4, module0202.$ic40$);
    }
    
    public static SubLObject f12681(final SubLObject var15) {
        assert module0202.NIL != Types.listp(var15) : var15;
        if (module0202.NIL == var15) {
            return module0202.$ic38$;
        }
        return f12682(var15);
    }
    
    public static SubLObject f12682(final SubLObject var15) {
        if (module0202.NIL == module0131.f8560()) {
            Errors.error((SubLObject)module0202.$ic42$);
        }
        final SubLObject var16 = module0285.f18946(Sequences.remove_duplicates(var15, Symbols.symbol_function((SubLObject)module0202.EQUAL), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED));
        return f12683(module0202.$ic39$, var16, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12684(final SubLObject var17) {
        if (var17.eql(module0202.$ic38$)) {
            return (SubLObject)module0202.NIL;
        }
        if (module0205.f13276(var17).eql(module0202.$ic39$)) {
            return Sequences.remove_duplicates(module0205.f13304(var17, (SubLObject)module0202.UNPROVIDED), (SubLObject)module0202.EQUAL, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12685(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12659(var14) && module0205.f13276(var14).eql(module0202.$ic43$));
    }
    
    public static SubLObject f12686(final SubLObject var18) {
        return module0205.f13277(var18, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12687(final SubLObject var4) {
        return Types.consp(var4);
    }
    
    public static SubLObject f12688(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12687(var4) && module0202.NIL == conses_high.last(var4, (SubLObject)module0202.UNPROVIDED).rest());
    }
    
    public static SubLObject f12689(final SubLObject var19, SubLObject var20) {
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        return Types.sublisp_null(module0205.f13145(var20, var19, (SubLObject)module0202.NIL, (SubLObject)module0202.UNPROVIDED));
    }
    
    public static SubLObject f12690(final SubLObject var21) {
        return module0193.f12105(var21);
    }
    
    public static SubLObject f12691(final SubLObject var19, SubLObject var20) {
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12689(var19, var20) || module0202.NIL != f12692(var19, var20));
    }
    
    public static SubLObject f12692(final SubLObject var19, SubLObject var20) {
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        return Types.sublisp_null(f12693(var19, (SubLObject)module0202.NIL, var20, (SubLObject)module0202.UNPROVIDED));
    }
    
    public static SubLObject f12694(final SubLObject var22) {
        if (module0202.NIL != module0201.f12554(var22)) {
            return module0038.f2658(var22);
        }
        final SubLObject var23 = f12695(var22, (SubLObject)module0202.NIL);
        return f12695(var22, var23);
    }
    
    public static SubLObject f12695(final SubLObject var22, final SubLObject var23) {
        SubLObject var24 = (SubLObject)Characters.CHAR_hyphen;
        SubLObject var25 = (SubLObject)module0202.ZERO_INTEGER;
        final SubLObject var26 = (SubLObject)((module0202.NIL != var23) ? Strings.make_string(var23, (SubLObject)module0202.UNPROVIDED) : module0202.NIL);
        SubLObject var29_30;
        SubLObject var27;
        SubLObject var28;
        SubLObject var29;
        for (var27 = (var29_30 = Sequences.length(var22)), var28 = (SubLObject)module0202.NIL, var28 = (SubLObject)module0202.ZERO_INTEGER; !var28.numGE(var29_30); var28 = module0048.f_1X(var28)) {
            var29 = Strings.sublisp_char(var22, var28);
            if (module0202.NIL != Characters.lower_case_p(var29)) {
                if (module0202.NIL != var23) {
                    Vectors.set_aref(var26, var25, Characters.char_upcase(var29));
                }
                var25 = Numbers.add(var25, (SubLObject)module0202.ONE_INTEGER);
            }
            else if (module0202.NIL != Characters.alphanumericp(var29)) {
                if (module0202.NIL != var23) {
                    Vectors.set_aref(var26, var25, var29);
                }
                var25 = Numbers.add(var25, (SubLObject)module0202.ONE_INTEGER);
            }
            else if ((var29.eql((SubLObject)Characters.CHAR_space) || var29.eql((SubLObject)Characters.CHAR_hyphen)) && !var24.eql((SubLObject)Characters.CHAR_hyphen) && !var24.eql((SubLObject)Characters.CHAR_space)) {
                if (module0202.NIL != var23) {
                    Vectors.set_aref(var26, var25, (SubLObject)Characters.CHAR_hyphen);
                }
                var25 = Numbers.add(var25, (SubLObject)module0202.ONE_INTEGER);
            }
            var24 = var29;
        }
        if (module0202.NIL != var23) {
            return var26;
        }
        return var25;
    }
    
    public static SubLObject f12696(final SubLObject var1, SubLObject var33, SubLObject var34, SubLObject var35) {
        if (var33 == module0202.UNPROVIDED) {
            var33 = (SubLObject)module0202.NIL;
        }
        if (var34 == module0202.UNPROVIDED) {
            var34 = (SubLObject)module0202.NIL;
        }
        if (var35 == module0202.UNPROVIDED) {
            var35 = (SubLObject)module0202.NIL;
        }
        assert module0202.NIL != f12590(var1) : var1;
        if (module0202.NIL == var33) {
            var33 = module0579.f35490();
        }
        if (module0202.NIL == var34) {
            var34 = module0579.f35491();
        }
        return module0751.f46882(var1, var33, var34, var35);
    }
    
    public static SubLObject f12697(final SubLObject var1, SubLObject var33, SubLObject var34, SubLObject var35) {
        if (var33 == module0202.UNPROVIDED) {
            var33 = (SubLObject)module0202.NIL;
        }
        if (var34 == module0202.UNPROVIDED) {
            var34 = (SubLObject)module0202.NIL;
        }
        if (var35 == module0202.UNPROVIDED) {
            var35 = (SubLObject)module0202.NIL;
        }
        assert module0202.NIL != f12590(var1) : var1;
        if (module0202.NIL == var33) {
            var33 = module0579.f35490();
        }
        if (module0202.NIL == var34) {
            var34 = module0579.f35491();
        }
        return module0751.f46883(var1, var33, var34, var35);
    }
    
    public static SubLObject f12698(final SubLObject var36, final SubLObject var1, SubLObject var33, SubLObject var34) {
        if (var33 == module0202.UNPROVIDED) {
            var33 = (SubLObject)module0202.NIL;
        }
        if (var34 == module0202.UNPROVIDED) {
            var34 = (SubLObject)module0202.NIL;
        }
        assert module0202.NIL != module0201.f12546(var36) : var36;
        assert module0202.NIL != f12590(var1) : var1;
        if (module0202.NIL == var33) {
            var33 = module0579.f35490();
        }
        if (module0202.NIL == var34) {
            var34 = module0579.f35491();
        }
        return module0201.f12548(f12699(module0201.f12550(Sequences.substitute((SubLObject)Characters.CHAR_hyphen, (SubLObject)Characters.CHAR_space, module0751.f46887(var36, var1, var33, var34, (SubLObject)module0202.UNPROVIDED), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED))));
    }
    
    public static SubLObject f12700(final SubLObject var37) {
        SubLObject var38 = (SubLObject)module0202.NIL;
        SubLObject var39 = var37;
        SubLObject var40 = (SubLObject)module0202.NIL;
        var40 = var39.first();
        while (module0202.NIL != var39) {
            final SubLObject var41 = f12699(var40);
            if (module0202.NIL != var41) {
                var38 = module0035.f2063(var38, var40, var41, (SubLObject)module0202.EQL);
            }
            var39 = var39.rest();
            var40 = var39.first();
        }
        return var38;
    }
    
    public static SubLObject f12701(final SubLObject var41) {
        assert module0202.NIL != module0207.f13509(var41) : var41;
        SubLObject var42 = f12702(var41);
        final SubLObject var43 = module0155.f9796(var41, (SubLObject)module0202.$ic51$, (SubLObject)module0202.UNPROVIDED);
        SubLObject var44 = conses_high.copy_list(var43);
        SubLObject var45 = var43;
        SubLObject var46 = (SubLObject)module0202.NIL;
        var46 = var45.first();
        while (module0202.NIL != var45) {
            final SubLObject var47 = Sequences.delete(var46, var44, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
            final SubLObject var48 = f12703(var47, var46);
            var42 = module0205.f13251(var48, var46, var42, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
            var44 = (SubLObject)ConsesLow.cons(var48, var47);
            var45 = var45.rest();
            var46 = var45.first();
        }
        return var42;
    }
    
    public static SubLObject f12703(final SubLObject var47, final SubLObject var48) {
        SubLObject var49 = module0202.$g2305$.getGlobalValue();
        SubLObject var50 = (SubLObject)module0202.NIL;
        var50 = var49.first();
        while (module0202.NIL != var49) {
            if (module0202.NIL == conses_high.member(var50, var47, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
                return var50;
            }
            var49 = var49.rest();
            var50 = var49.first();
        }
        return module0201.f12550(Sequences.cconcatenate(module0038.f2638(var48), (SubLObject)module0202.$ic54$));
    }
    
    public static SubLObject f12699(final SubLObject var39) {
        SubLObject var40 = (SubLObject)module0202.NIL;
        var40 = Sequences.substitute((SubLObject)Characters.CHAR_hyphen, (SubLObject)Characters.CHAR_underbar, Strings.string_upcase(module0201.f12548(var39), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
        if (module0202.NIL != Characters.charE(Strings.sublisp_char(var40, (SubLObject)module0202.ONE_INTEGER), (SubLObject)Characters.CHAR_question)) {
            var40 = Sequences.cconcatenate(Sequences.subseq(var40, (SubLObject)module0202.ZERO_INTEGER, (SubLObject)module0202.TWO_INTEGER), Sequences.remove_if((SubLObject)module0202.$ic55$, Sequences.subseq(var40, (SubLObject)module0202.TWO_INTEGER, (SubLObject)module0202.UNPROVIDED), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED));
        }
        else {
            var40 = Sequences.cconcatenate(Sequences.subseq(var40, (SubLObject)module0202.ZERO_INTEGER, (SubLObject)module0202.ONE_INTEGER), Sequences.remove_if((SubLObject)module0202.$ic55$, Sequences.subseq(var40, (SubLObject)module0202.ONE_INTEGER, (SubLObject)module0202.UNPROVIDED), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED));
        }
        var40 = module0201.f12550(var40);
        if (module0202.NIL == module0201.f12557(var40)) {
            return (SubLObject)module0202.NIL;
        }
        return var40;
    }
    
    public static SubLObject f12704(final SubLObject var50, final SubLObject var51) {
        final SubLObject var52 = module0289.f19396(var50);
        final SubLObject var53 = module0178.f11348(var50);
        final SubLObject var54 = module0035.f2062(var51);
        if (module0202.NIL != f12705(var52, module0178.f11287(var50))) {
            return (SubLObject)module0202.T;
        }
        if (module0202.NIL != module0035.f2194(var54, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
            return (SubLObject)module0202.T;
        }
        final SubLObject var55 = module0035.f2061(var51, var53);
        final SubLObject var56 = module0035.f2319(var55);
        return module0035.f2194(var56, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12705(final SubLObject var1, final SubLObject var56) {
        SubLObject var58;
        final SubLObject var57 = var58 = module0259.f16848(module0202.$ic56$, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
        SubLObject var59 = (SubLObject)module0202.NIL;
        var59 = var58.first();
        while (module0202.NIL != var58) {
            if (module0202.NIL != module0035.f2428(var59, var1, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
                final SubLObject var60 = module0288.f19342(var1, var56);
                if (module0202.NIL == module0035.f1997(var60)) {
                    return (SubLObject)module0202.T;
                }
            }
            var58 = var58.rest();
            var59 = var58.first();
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12706(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0202.NIL != module0146.$g1981$.getDynamicValue(var2)) {
            if (module0202.NIL != f12590(var1)) {
                return conses_high.last(var1, (SubLObject)module0202.UNPROVIDED).rest();
            }
            if (module0202.NIL != module0167.f10813(var1)) {
                return (SubLObject)module0202.NIL;
            }
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12707(final SubLObject var61, SubLObject var20) {
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        final SubLObject var62 = f12706(var61);
        if (module0202.NIL == var62) {
            return (SubLObject)module0202.NIL;
        }
        if (var20.eql((SubLObject)module0202.$ic44$)) {
            if (module0202.NIL != module0201.f12580(var62)) {
                return var62;
            }
            return (SubLObject)module0202.NIL;
        }
        else {
            if (module0202.NIL != Functions.funcall(var20, var62)) {
                return var62;
            }
            return (SubLObject)module0202.NIL;
        }
    }
    
    public static SubLObject f12708(final SubLObject var61, SubLObject var20) {
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        final SubLObject var62 = f12706(var61);
        if (module0202.NIL == var62) {
            return (SubLObject)module0202.NIL;
        }
        if (module0202.NIL != Functions.funcall(var20, var62)) {
            return (SubLObject)module0202.NIL;
        }
        return var62;
    }
    
    public static SubLObject f12709(final SubLObject var63, final SubLObject var1) {
        return (module0202.NIL != var63) ? module0035.f2020(var63, var1) : var1;
    }
    
    public static SubLObject f12710(final SubLObject var63, final SubLObject var1) {
        return module0035.f2020(var63, var1);
    }
    
    public static SubLObject f12711(final SubLObject var63, final SubLObject var1) {
        return module0035.f2021(var63, var1);
    }
    
    public static SubLObject f12712(final SubLObject var1) {
        return module0035.f2018(var1);
    }
    
    public static SubLObject f12713(final SubLObject var1) {
        return (module0202.NIL != f12707(var1, (SubLObject)module0202.UNPROVIDED)) ? f12712(var1) : var1;
    }
    
    public static SubLObject f12714(final SubLObject var1) {
        return module0035.sublisp_boolean(f12706(var1));
    }
    
    public static SubLObject f12715(final SubLObject var1) {
        return module0035.f2014(var1);
    }
    
    public static SubLObject f12673(final SubLObject var1) {
        return module0035.sublisp_boolean(f12707(var1, (SubLObject)module0202.UNPROVIDED));
    }
    
    public static SubLObject f12716(final SubLObject var1) {
        return module0035.sublisp_boolean(f12708(var1, (SubLObject)module0202.UNPROVIDED));
    }
    
    public static SubLObject f12717(final SubLObject var1) {
        return (module0202.NIL != f12707(var1, (SubLObject)module0202.UNPROVIDED)) ? f12712(var1) : var1;
    }
    
    public static SubLObject f12718(final SubLObject var1) {
        final SubLObject var2 = f12707(var1, (SubLObject)module0202.UNPROVIDED);
        return (module0202.NIL != var2) ? ConsesLow.append(f12712(var1), (SubLObject)ConsesLow.list(var2)) : var1;
    }
    
    public static SubLObject f12719(final SubLObject var64) {
        assert module0202.NIL != f12639(var64) : var64;
        final SubLObject var65 = module0205.f13342(var64);
        if (var65.eql(module0202.$ic24$)) {
            return f12720(module0202.$ic24$, (SubLObject)module0202.$ic58$, (SubLObject)module0202.UNPROVIDED);
        }
        if (var65.eql(module0202.$ic25$)) {
            return f12720(module0202.$ic25$, (SubLObject)module0202.$ic59$, (SubLObject)module0202.UNPROVIDED);
        }
        Errors.error((SubLObject)module0202.$ic60$, var64);
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12721(final SubLObject var19) {
        return (module0202.NIL != f12590(var19) && module0202.NIL != module0035.f2439((SubLObject)module0202.$ic57$, var19, (SubLObject)module0202.UNPROVIDED)) ? module0205.f13233(var19, (SubLObject)module0202.$ic57$, (SubLObject)module0202.$ic61$, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED) : var19;
    }
    
    public static SubLObject f12722(final SubLObject var1) {
        return module0205.f13234(var1, (SubLObject)module0202.$ic57$, (SubLObject)module0202.$ic61$, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12723(final SubLObject var6, final SubLObject var1) {
        SubLObject var7 = (SubLObject)module0202.NIL;
        final SubLObject var8 = module0205.f13207(var1, (SubLObject)module0202.$ic33$);
        SubLObject var9;
        SubLObject var10;
        for (var9 = (SubLObject)module0202.NIL, var9 = var8; module0202.NIL == var7 && module0202.NIL != var9; var9 = var9.rest()) {
            var10 = var9.first();
            if (var6.equal(var10)) {
                var7 = (SubLObject)module0202.T;
            }
        }
        return var7;
    }
    
    public static SubLObject f12724(final SubLObject var6, final SubLObject var1, SubLObject var68) {
        if (var68 == module0202.UNPROVIDED) {
            var68 = Symbols.symbol_function((SubLObject)module0202.EQL);
        }
        return Sequences.position(var6, module0205.f13180(var1, (SubLObject)module0202.UNPROVIDED), var68, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12725(final SubLObject var1, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        if (module0202.NIL != module0205.f13336(var1)) {
            return Sequences.length(module0205.f13207(var1, var69));
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12726(final SubLObject var70, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        if (module0202.NIL != f12590(var70)) {
            return Sequences.length(module0205.f13180(var70, var69));
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12727(final SubLObject var71, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return f12725(var71, var69);
    }
    
    public static SubLObject f12728(final SubLObject var1, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return Sequences.length(module0205.f13180(var1, var69));
    }
    
    public static SubLObject f12729(final SubLObject var1, final SubLObject var72, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != module0205.f13336(var1) && module0202.NIL != module0004.f105(var72) && module0202.NIL != module0035.f1993(module0205.f13207(var1, var69), var72, (SubLObject)module0202.NIL));
    }
    
    public static SubLObject f12730(final SubLObject var1, final SubLObject var72, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != module0205.f13336(var1) && var72.isInteger() && module0202.NIL != module0035.f1994(module0205.f13207(var1, var69), var72, (SubLObject)module0202.NIL));
    }
    
    public static SubLObject f12731(final SubLObject var1, final SubLObject var72, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != module0205.f13336(var1) && var72.isInteger() && module0202.NIL != module0035.f2002(module0205.f13207(var1, var69), var72, (SubLObject)module0202.NIL));
    }
    
    public static SubLObject f12732(final SubLObject var1, final SubLObject var72, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != module0205.f13336(var1) && var72.isInteger() && module0202.NIL != module0035.f2000(module0205.f13207(var1, var69), var72, (SubLObject)module0202.NIL));
    }
    
    public static SubLObject f12733(final SubLObject var52, final SubLObject var72, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12590(var52) && var72.isInteger() && module0202.NIL != module0035.f2000(module0205.f13348(var52, var69), var72, (SubLObject)module0202.NIL));
    }
    
    public static SubLObject f12734(final SubLObject var1, final SubLObject var72, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != module0205.f13336(var1) && var72.isInteger() && module0202.NIL != module0035.f1995(module0205.f13207(var1, var69), var72, (SubLObject)module0202.NIL));
    }
    
    public static SubLObject f12637(final SubLObject var52, final SubLObject var72, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12590(var52) && var72.isInteger() && module0202.NIL != module0035.f1995(module0205.f13348(var52, var69), var72, (SubLObject)module0202.NIL));
    }
    
    public static SubLObject f12735(final SubLObject var73, final SubLObject var74, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != module0205.f13336(var73) && module0202.NIL != module0205.f13336(var74) && module0202.NIL != module0035.f2007(module0205.f13207(var73, var69), module0205.f13207(var74, var69)));
    }
    
    public static SubLObject f12736(final SubLObject var73, final SubLObject var74, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != module0205.f13336(var73) && module0202.NIL != module0205.f13336(var74) && module0202.NIL != module0035.f2004(module0205.f13207(var73, var69), module0205.f13207(var74, var69)));
    }
    
    public static SubLObject f12737(final SubLObject var73, final SubLObject var74, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != module0205.f13336(var73) && module0202.NIL != module0205.f13336(var74) && module0202.NIL != module0035.f2008(module0205.f13207(var73, var69), module0205.f13207(var74, var69)));
    }
    
    public static SubLObject f12738(final SubLObject var73, final SubLObject var74, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != module0205.f13336(var73) && module0202.NIL != module0205.f13336(var74) && module0202.NIL != module0035.f2010(module0205.f13207(var73, var69), module0205.f13207(var74, var69)));
    }
    
    public static SubLObject f12739(final SubLObject var73, final SubLObject var74, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != module0205.f13336(var73) && module0202.NIL != module0205.f13336(var74) && module0202.NIL != module0035.f2011(module0205.f13207(var73, var69), module0205.f13207(var74, var69)));
    }
    
    public static SubLObject f12740(final SubLObject var73, final SubLObject var74) {
        final SubLObject var75 = f12673(var73);
        final SubLObject var76 = f12673(var74);
        if (module0202.NIL == var75 && module0202.NIL == var76) {
            return f12736(var73, var74, (SubLObject)module0202.UNPROVIDED);
        }
        if (module0202.NIL != var75 && module0202.NIL != var76) {
            return (SubLObject)module0202.T;
        }
        final SubLObject var77 = (module0202.NIL != var75) ? var73 : var74;
        final SubLObject var78 = f12725(var77, (SubLObject)module0202.$ic33$);
        final SubLObject var79 = (module0202.NIL != var75) ? var74 : var73;
        return f12732(var79, var78, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12741(final SubLObject var80) {
        if (module0202.NIL != f12687(var80)) {
            return var80.first();
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12742(final SubLObject var80) {
        if (module0202.NIL != f12687(var80)) {
            return var80.rest();
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12743(final SubLObject var81) {
        if (module0202.NIL != f12627(var81)) {
            return module0205.f13378(var81);
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12744(final SubLObject var81) {
        if (module0202.NIL != module0206.f13442(var81)) {
            return module0205.f13380(var81, (SubLObject)module0202.UNPROVIDED);
        }
        if (module0202.NIL != f12620(var81)) {
            return module0205.f13379(var81, (SubLObject)module0202.UNPROVIDED);
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12745(final SubLObject var81) {
        return f12746(module0205.f13378(var81));
    }
    
    public static SubLObject f12746(final SubLObject var2) {
        if (module0202.NIL != module0206.f13441(var2)) {
            return (SubLObject)module0202.ONE_INTEGER;
        }
        if (module0202.NIL != module0206.f13443(var2)) {
            return (SubLObject)module0202.TWO_INTEGER;
        }
        f12747((SubLObject)module0202.FOUR_INTEGER, (SubLObject)module0202.$ic62$, var2, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12748(final SubLObject var81) {
        if (module0202.NIL != module0206.f13442(var81)) {
            return module0205.f13379(var81, (SubLObject)module0202.UNPROVIDED);
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12668(final SubLObject var81) {
        if (module0202.NIL != f12620(var81)) {
            return module0205.f13380(var81, (SubLObject)module0202.UNPROVIDED);
        }
        if (module0202.NIL != module0206.f13442(var81)) {
            return module0205.f13381(var81, (SubLObject)module0202.UNPROVIDED);
        }
        f12747((SubLObject)module0202.FOUR_INTEGER, (SubLObject)module0202.$ic63$, var81, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12749(final SubLObject var81) {
        return f12750(module0205.f13378(var81));
    }
    
    public static SubLObject f12750(final SubLObject var2) {
        if (module0202.NIL != module0206.f13441(var2)) {
            return (SubLObject)module0202.TWO_INTEGER;
        }
        if (module0202.NIL != module0206.f13443(var2)) {
            return (SubLObject)module0202.THREE_INTEGER;
        }
        f12747((SubLObject)module0202.FOUR_INTEGER, (SubLObject)module0202.$ic62$, var2, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12751(final SubLObject var82) {
        assert module0202.NIL != f12674(var82) : var82;
        if (var82.eql(module0202.$ic37$)) {
            return (SubLObject)module0202.NIL;
        }
        return module0205.f13348(var82, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12752(final SubLObject var82) {
        assert module0202.NIL != f12674(var82) : var82;
        if (var82.eql(module0202.$ic37$)) {
            return (SubLObject)module0202.ZERO_INTEGER;
        }
        return f12725(var82, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12753(final SubLObject var83, final SubLObject var84) {
        SubLObject var86;
        final SubLObject var85 = var86 = var83.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var86, var85, (SubLObject)module0202.$ic65$);
        final SubLObject var87 = var86.rest();
        var86 = var86.first();
        SubLObject var88 = (SubLObject)module0202.NIL;
        SubLObject var89 = (SubLObject)module0202.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var86, var85, (SubLObject)module0202.$ic65$);
        var88 = var86.first();
        var86 = var86.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var86, var85, (SubLObject)module0202.$ic65$);
        var89 = var86.first();
        var86 = var86.rest();
        if (module0202.NIL == var86) {
            final SubLObject var90;
            var86 = (var90 = var87);
            return (SubLObject)ConsesLow.listS((SubLObject)module0202.$ic66$, (SubLObject)ConsesLow.list(var88, (SubLObject)ConsesLow.list((SubLObject)module0202.$ic67$, var89)), ConsesLow.append(var90, (SubLObject)module0202.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var85, (SubLObject)module0202.$ic65$);
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12754(final SubLObject var83, final SubLObject var84) {
        SubLObject var86;
        final SubLObject var85 = var86 = var83.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var86, var85, (SubLObject)module0202.$ic68$);
        final SubLObject var87 = var86.rest();
        var86 = var86.first();
        SubLObject var88 = (SubLObject)module0202.NIL;
        SubLObject var89 = (SubLObject)module0202.NIL;
        SubLObject var90 = (SubLObject)module0202.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var86, var85, (SubLObject)module0202.$ic68$);
        var88 = var86.first();
        var86 = var86.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var86, var85, (SubLObject)module0202.$ic68$);
        var89 = var86.first();
        var86 = var86.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var86, var85, (SubLObject)module0202.$ic68$);
        var90 = var86.first();
        var86 = var86.rest();
        if (module0202.NIL == var86) {
            final SubLObject var91;
            var86 = (var91 = var87);
            return (SubLObject)ConsesLow.listS((SubLObject)module0202.$ic69$, (SubLObject)ConsesLow.list(var88, var89, (SubLObject)ConsesLow.list((SubLObject)module0202.$ic67$, var90)), ConsesLow.append(var91, (SubLObject)module0202.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var85, (SubLObject)module0202.$ic68$);
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12755(final SubLObject var82) {
        assert module0202.NIL != f12674(var82) : var82;
        return f12756(var82);
    }
    
    public static SubLObject f12756(final SubLObject var82) {
        SubLObject var83 = (SubLObject)module0202.NIL;
        SubLObject var84 = f12751(var82);
        SubLObject var85 = (SubLObject)module0202.NIL;
        var85 = var84.first();
        while (module0202.NIL != var84) {
            if (module0202.NIL != f12674(var85)) {
                var83 = (SubLObject)ConsesLow.cons(f12756(var85), var83);
            }
            else {
                var83 = (SubLObject)ConsesLow.cons(var85, var83);
            }
            var84 = var84.rest();
            var85 = var84.first();
        }
        return Sequences.nreverse(var83);
    }
    
    public static SubLObject f12757(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (module0202.NIL != module0552.f34008(var4)) {
            return module0205.f13203(var4, (SubLObject)module0202.UNPROVIDED);
        }
        if (module0202.NIL != module0202.$g2306$.getDynamicValue(var5)) {
            return var4;
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12758(final SubLObject var96) {
        if (!var96.isList()) {
            return (SubLObject)module0202.NIL;
        }
        SubLObject var97 = (SubLObject)module0202.NIL;
        SubLObject var98 = var96;
        SubLObject var99 = (SubLObject)module0202.NIL;
        var99 = var98.first();
        while (module0202.NIL != var98) {
            var97 = (SubLObject)ConsesLow.cons(f12757(var99), var97);
            var98 = var98.rest();
            var99 = var98.first();
        }
        return Sequences.nreverse(var97);
    }
    
    public static SubLObject f12759(final SubLObject var64) {
        if (module0202.NIL != f12639(var64)) {
            final SubLObject var65 = module0205.f13136(var64);
            if (var65.eql(module0202.$ic24$)) {
                return module0205.f13204(var64, (SubLObject)module0202.UNPROVIDED);
            }
            if (var65.eql(module0202.$ic25$)) {
                return module0205.f13203(var64, (SubLObject)module0202.UNPROVIDED);
            }
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12760(final SubLObject var17) {
        assert module0202.NIL != f12676(var17) : var17;
        if (var17.eql(module0202.$ic38$)) {
            return (SubLObject)module0202.NIL;
        }
        return module0205.f13348(var17, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12761(final SubLObject var98) {
        assert module0202.NIL != Types.consp(var98) : var98;
        return var98;
    }
    
    public static SubLObject f12762(final SubLObject var1) {
        assert module0202.NIL != f12655(var1) : var1;
        return var1;
    }
    
    public static SubLObject f12683(final SubLObject var2, final SubLObject var99, SubLObject var100) {
        if (var100 == module0202.UNPROVIDED) {
            var100 = (SubLObject)module0202.NIL;
        }
        return (SubLObject)((module0202.NIL != var100) ? ConsesLow.append((SubLObject)ConsesLow.cons(var2, conses_high.copy_list(var99)), var100) : ConsesLow.cons(var2, conses_high.copy_list(var99)));
    }
    
    public static SubLObject f12720(final SubLObject var2, final SubLObject var99, SubLObject var100) {
        if (var100 == module0202.UNPROVIDED) {
            var100 = (SubLObject)module0202.NIL;
        }
        return f12683(var2, var99, var100);
    }
    
    public static SubLObject f12763(final SubLObject var1) {
        return conses_high.copy_tree(var1);
    }
    
    public static SubLObject f12764(final SubLObject var81) {
        return conses_high.copy_tree(var81);
    }
    
    public static SubLObject f12765(final SubLObject var101) {
        return conses_high.copy_tree(var101);
    }
    
    public static SubLObject f12766(final SubLObject var102) {
        return conses_high.copy_tree(var102);
    }
    
    public static SubLObject f12702(final SubLObject var19) {
        return conses_high.copy_tree(var19);
    }
    
    public static SubLObject f12767(final SubLObject var103, final SubLObject var99, SubLObject var100) {
        if (var100 == module0202.UNPROVIDED) {
            var100 = (SubLObject)module0202.NIL;
        }
        return f12683(var103, var99, var100);
    }
    
    public static SubLObject f12643(final SubLObject var2, final SubLObject var67) {
        return (SubLObject)ConsesLow.list(var2, var67);
    }
    
    public static SubLObject f12768(final SubLObject var2, final SubLObject var5, final SubLObject var104) {
        return (SubLObject)ConsesLow.list(var2, var5, var104);
    }
    
    public static SubLObject f12769(final SubLObject var2, final SubLObject var5, final SubLObject var104, final SubLObject var105) {
        return (SubLObject)ConsesLow.list(var2, var5, var104, var105);
    }
    
    public static SubLObject f12770(final SubLObject var2, final SubLObject var5, final SubLObject var104, final SubLObject var105, final SubLObject var106) {
        return (SubLObject)ConsesLow.list(var2, var5, var104, var105, var106);
    }
    
    public static SubLObject f12771(final SubLObject var81) {
        return f12643(module0202.$ic3$, var81);
    }
    
    public static SubLObject f12772(final SubLObject var99) {
        return f12720(module0202.$ic5$, var99, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12773(final SubLObject var99) {
        return f12720(module0202.$ic7$, var99, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12774(final SubLObject var107, final SubLObject var108) {
        return f12768(module0202.$ic8$, var107, var108);
    }
    
    public static SubLObject f12775(final SubLObject var36, final SubLObject var81) {
        return f12768(module0202.$ic11$, var36, var81);
    }
    
    public static SubLObject f12776(final SubLObject var36, final SubLObject var81) {
        return f12768(module0202.$ic12$, var36, var81);
    }
    
    public static SubLObject f12777(final SubLObject var109, final SubLObject var36, final SubLObject var110) {
        return f12768(var109, var36, var110);
    }
    
    public static SubLObject f12778(final SubLObject var109, final SubLObject var111, final SubLObject var36, final SubLObject var110) {
        return f12769(var109, var111, var36, var110);
    }
    
    public static SubLObject f12779(final SubLObject var112, final SubLObject var36, final SubLObject var81) {
        return f12778(module0202.$ic13$, var112, var36, var81);
    }
    
    public static SubLObject f12780(final SubLObject var112, final SubLObject var36, final SubLObject var81) {
        return f12778(module0202.$ic14$, var112, var36, var81);
    }
    
    public static SubLObject f12781(final SubLObject var112, final SubLObject var36, final SubLObject var81) {
        return f12778(module0202.$ic15$, var112, var36, var81);
    }
    
    public static SubLObject f12782(final SubLObject var56, final SubLObject var81) {
        return f12768(module0202.$ic74$, var56, var81);
    }
    
    public static SubLObject f12783(final SubLObject var56, final SubLObject var113, final SubLObject var114) {
        final SubLObject var115 = module0204.f13041(var113, var114);
        return f12782(var56, var115);
    }
    
    public static SubLObject f12784(final SubLObject var116, final SubLObject var67) {
        return f12643(var116, var67);
    }
    
    public static SubLObject f12785(final SubLObject var116, final SubLObject var5, final SubLObject var104) {
        return f12768(var116, var5, var104);
    }
    
    public static SubLObject f12786(final SubLObject var116, final SubLObject var99) {
        return f12720(var116, var99, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12787(final SubLObject var98, SubLObject var100) {
        if (var100 == module0202.UNPROVIDED) {
            var100 = (SubLObject)module0202.NIL;
        }
        assert module0202.NIL != Types.listp(var98) : var98;
        if (module0202.NIL != var98) {
            return f12683(module0202.$ic35$, var98, var100);
        }
        if (module0202.NIL != var100) {
            return f12683(module0202.$ic35$, (SubLObject)module0202.NIL, var100);
        }
        return module0202.$ic37$;
    }
    
    public static SubLObject f12788(final SubLObject var98, SubLObject var100) {
        if (var100 == module0202.UNPROVIDED) {
            var100 = (SubLObject)module0202.NIL;
        }
        assert module0202.NIL != Types.listp(var98) : var98;
        if (module0202.NIL != var98) {
            return f12789(var98, var100);
        }
        if (module0202.NIL != var100) {
            return f12683(module0202.$ic35$, (SubLObject)module0202.NIL, var100);
        }
        return module0202.$ic37$;
    }
    
    public static SubLObject f12789(final SubLObject var4, SubLObject var100) {
        if (var100 == module0202.UNPROVIDED) {
            var100 = (SubLObject)module0202.NIL;
        }
        SubLObject var101 = (SubLObject)module0202.NIL;
        if (var4.isList()) {
            SubLObject var102 = var4;
            SubLObject var103 = (SubLObject)module0202.NIL;
            var103 = var102.first();
            while (module0202.NIL != var102) {
                var101 = (SubLObject)ConsesLow.cons(f12789(var103, (SubLObject)module0202.UNPROVIDED), var101);
                var102 = var102.rest();
                var103 = var102.first();
            }
            return f12787(Sequences.nreverse(var101), var100);
        }
        return var4;
    }
    
    public static SubLObject f12790(final SubLObject var118) {
        if (var118.isSymbol()) {
            return f12643(module0202.$ic25$, var118);
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12791(final SubLObject var119, SubLObject var100) {
        if (var100 == module0202.UNPROVIDED) {
            var100 = (SubLObject)module0202.NIL;
        }
        assert module0202.NIL != module0035.f2223(var119, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED) : var119;
        if (module0202.NIL != var119) {
            return f12683(module0202.$ic39$, var119, var100);
        }
        if (module0202.NIL != var100) {
            return f12683(module0202.$ic39$, (SubLObject)module0202.NIL, var100);
        }
        return module0202.$ic38$;
    }
    
    public static SubLObject f12792(final SubLObject var17) {
        assert module0202.NIL != f12676(var17) : var17;
        if (var17.eql(module0202.$ic38$)) {
            return (SubLObject)module0202.NIL;
        }
        return module0205.f13348(var17, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12793(final SubLObject var120, final SubLObject var121) {
        return f12768(module0202.$ic76$, var120, var121);
    }
    
    public static SubLObject f12794(final SubLObject var121) {
        return f12643(module0202.$ic43$, var121);
    }
    
    public static SubLObject f12795(final SubLObject var1) {
        return Values.values(module0205.f13132(var1), module0205.f13203(var1, (SubLObject)module0202.UNPROVIDED));
    }
    
    public static SubLObject f12796(final SubLObject var1) {
        return Values.values(module0205.f13132(var1), module0205.f13203(var1, (SubLObject)module0202.UNPROVIDED), module0205.f13204(var1, (SubLObject)module0202.UNPROVIDED));
    }
    
    public static SubLObject f12797(final SubLObject var1) {
        return Values.values(module0205.f13132(var1), module0205.f13203(var1, (SubLObject)module0202.UNPROVIDED), module0205.f13204(var1, (SubLObject)module0202.UNPROVIDED), module0205.f13205(var1, (SubLObject)module0202.UNPROVIDED));
    }
    
    public static SubLObject f12798(final SubLObject var1) {
        return Values.values(module0205.f13132(var1), module0205.f13203(var1, (SubLObject)module0202.UNPROVIDED), module0205.f13204(var1, (SubLObject)module0202.UNPROVIDED), module0205.f13205(var1, (SubLObject)module0202.UNPROVIDED), module0205.f13345(var1, (SubLObject)module0202.UNPROVIDED));
    }
    
    public static SubLObject f12799(final SubLObject var122, final SubLObject var1, SubLObject var123) {
        if (var123 == module0202.UNPROVIDED) {
            var123 = (SubLObject)module0202.NIL;
        }
        if (module0202.NIL == f12590(var1)) {
            return (SubLObject)module0202.NIL;
        }
        final SubLObject var124 = module0205.f13207(var1, (SubLObject)module0202.$ic36$);
        if (!var124.isCons()) {
            return var1;
        }
        SubLObject var125 = (SubLObject)module0202.NIL;
        SubLObject var126 = (SubLObject)module0202.NIL;
        SubLObject var127 = (SubLObject)module0202.NIL;
        SubLObject var128 = (SubLObject)module0202.NIL;
        var126 = var124.first();
        for (var127 = var124.rest(), var128 = (SubLObject)module0202.ONE_INTEGER; module0202.NIL != var127 && !var127.isAtom(); var127 = var127.rest(), var128 = Numbers.add((SubLObject)module0202.ONE_INTEGER, var128)) {
            var125 = (SubLObject)ConsesLow.cons((module0202.NIL != module0205.f13126(var1, var128)) ? var126 : Functions.funcall(var122, var126), var125);
            var126 = var127.first();
        }
        var125 = (SubLObject)ConsesLow.cons((module0202.NIL != module0205.f13126(var1, var128)) ? var126 : Functions.funcall(var122, var126), var125);
        if (module0202.NIL != var127) {
            SubLObject var129 = (module0202.NIL != var123 && module0202.NIL == module0205.f13130(var1)) ? Functions.funcall(var122, var127) : var127;
            SubLObject var130 = var125;
            SubLObject var131 = (SubLObject)module0202.NIL;
            var131 = var130.first();
            while (module0202.NIL != var130) {
                var129 = (SubLObject)ConsesLow.cons(var131, var129);
                var130 = var130.rest();
                var131 = var130.first();
            }
            return f12720(module0205.f13132(var1), var129, (SubLObject)module0202.UNPROVIDED);
        }
        return f12720(module0205.f13132(var1), Sequences.nreverse(var125), (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12800(final SubLObject var122, final SubLObject var1, SubLObject var123) {
        if (var123 == module0202.UNPROVIDED) {
            var123 = (SubLObject)module0202.NIL;
        }
        if (module0202.NIL != f12590(var1)) {
            final SubLObject var124 = module0205.f13207(var1, (SubLObject)module0202.$ic36$);
            if (var124.isCons()) {
                SubLObject var125 = (SubLObject)module0202.NIL;
                SubLObject var126 = (SubLObject)module0202.NIL;
                SubLObject var127 = (SubLObject)module0202.NIL;
                SubLObject var128 = (SubLObject)module0202.NIL;
                var125 = var124;
                var126 = var125.first();
                var127 = (SubLObject)module0202.ONE_INTEGER;
                for (var128 = var125.rest(); module0202.NIL != var128 && !var128.isAtom(); var128 = var125.rest()) {
                    ConsesLow.rplaca(var125, (module0202.NIL != module0205.f13126(var1, var127)) ? var126 : Functions.funcall(var122, var126));
                    var125 = var125.rest();
                    var126 = var125.first();
                    var127 = Numbers.add((SubLObject)module0202.ONE_INTEGER, var127);
                }
                ConsesLow.rplaca(var125, (module0202.NIL != module0205.f13126(var1, var127)) ? var126 : Functions.funcall(var122, var126));
                if (module0202.NIL != var128 && module0202.NIL != var123 && module0202.NIL == module0205.f13130(var1)) {
                    ConsesLow.rplacd(var125, Functions.funcall(var122, var128));
                }
            }
            return var1;
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12801(final SubLObject var122, final SubLObject var1, SubLObject var123) {
        if (var123 == module0202.UNPROVIDED) {
            var123 = (SubLObject)module0202.NIL;
        }
        if (module0202.NIL == f12590(var1)) {
            return (SubLObject)module0202.NIL;
        }
        final SubLObject var124 = module0205.f13180(var1, (SubLObject)module0202.$ic36$);
        if (!var124.isCons()) {
            return var1;
        }
        SubLObject var125 = (SubLObject)module0202.NIL;
        SubLObject var126 = (SubLObject)module0202.NIL;
        SubLObject var127 = (SubLObject)module0202.NIL;
        SubLObject var128 = (SubLObject)module0202.NIL;
        var126 = var124.first();
        for (var127 = var124.rest(), var128 = (SubLObject)module0202.ZERO_INTEGER; module0202.NIL != var127 && !var127.isAtom(); var127 = var127.rest(), var128 = Numbers.add((SubLObject)module0202.ONE_INTEGER, var128)) {
            var125 = (SubLObject)ConsesLow.cons((module0202.NIL != module0205.f13126(var1, var128)) ? var126 : Functions.funcall(var122, var126), var125);
            var126 = var127.first();
        }
        var125 = (SubLObject)ConsesLow.cons((module0202.NIL != module0205.f13126(var1, var128)) ? var126 : Functions.funcall(var122, var126), var125);
        if (module0202.NIL != var127) {
            SubLObject var129 = (module0202.NIL != var123 && module0202.NIL == module0205.f13130(var1)) ? Functions.funcall(var122, var127) : var127;
            SubLObject var130 = var125;
            SubLObject var131 = (SubLObject)module0202.NIL;
            var131 = var130.first();
            while (module0202.NIL != var130) {
                var129 = (SubLObject)ConsesLow.cons(var131, var129);
                var130 = var130.rest();
                var131 = var130.first();
            }
            return f12761(var129);
        }
        return f12761(Sequences.nreverse(var125));
    }
    
    public static SubLObject f12802(final SubLObject var122, final SubLObject var1, SubLObject var123) {
        if (var123 == module0202.UNPROVIDED) {
            var123 = (SubLObject)module0202.NIL;
        }
        if (module0202.NIL != f12590(var1)) {
            final SubLObject var124 = module0205.f13180(var1, (SubLObject)module0202.$ic36$);
            if (var124.isCons()) {
                SubLObject var125 = (SubLObject)module0202.NIL;
                SubLObject var126 = (SubLObject)module0202.NIL;
                SubLObject var127 = (SubLObject)module0202.NIL;
                SubLObject var128 = (SubLObject)module0202.NIL;
                var125 = var124;
                var126 = var125.first();
                var127 = (SubLObject)module0202.ZERO_INTEGER;
                for (var128 = var125.rest(); module0202.NIL != var128 && !var128.isAtom(); var128 = var125.rest()) {
                    ConsesLow.rplaca(var125, (module0202.NIL != module0205.f13126(var1, var127)) ? var126 : Functions.funcall(var122, var126));
                    var125 = var125.rest();
                    var126 = var125.first();
                    var127 = Numbers.add((SubLObject)module0202.ONE_INTEGER, var127);
                }
                ConsesLow.rplaca(var125, (module0202.NIL != module0205.f13126(var1, var127)) ? var126 : Functions.funcall(var122, var126));
                if (module0202.NIL != var128 && module0202.NIL != var123 && module0202.NIL == module0205.f13130(var1)) {
                    ConsesLow.rplacd(var125, Functions.funcall(var122, var128));
                }
            }
            return var1;
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12803(final SubLObject var122, final SubLObject var1, final SubLObject var68, SubLObject var123) {
        if (var123 == module0202.UNPROVIDED) {
            var123 = (SubLObject)module0202.NIL;
        }
        if (module0202.NIL == f12590(var1)) {
            return (SubLObject)module0202.NIL;
        }
        final SubLObject var124 = module0205.f13180(var1, (SubLObject)module0202.$ic36$);
        if (!var124.isCons()) {
            return var1;
        }
        SubLObject var125 = (SubLObject)module0202.NIL;
        SubLObject var126 = (SubLObject)module0202.NIL;
        SubLObject var127 = (SubLObject)module0202.NIL;
        SubLObject var128 = (SubLObject)module0202.NIL;
        var126 = var124.first();
        for (var127 = var124.rest(), var128 = (SubLObject)module0202.ZERO_INTEGER; module0202.NIL != var127 && !var127.isAtom(); var127 = var127.rest(), var128 = Numbers.add((SubLObject)module0202.ONE_INTEGER, var128)) {
            var125 = (SubLObject)ConsesLow.cons((module0202.NIL == module0205.f13126(var1, var128) && module0202.NIL != Functions.funcall(var68, var126)) ? Functions.funcall(var122, var126) : var126, var125);
            var126 = var127.first();
        }
        var125 = (SubLObject)ConsesLow.cons((module0202.NIL == module0205.f13126(var1, var128) && module0202.NIL != Functions.funcall(var68, var126)) ? Functions.funcall(var122, var126) : var126, var125);
        if (module0202.NIL != var127) {
            SubLObject var129 = (module0202.NIL != var123 && module0202.NIL == module0205.f13130(var1) && module0202.NIL != Functions.funcall(var68, var127)) ? Functions.funcall(var122, var127) : var127;
            SubLObject var130 = var125;
            SubLObject var131 = (SubLObject)module0202.NIL;
            var131 = var130.first();
            while (module0202.NIL != var130) {
                var129 = (SubLObject)ConsesLow.cons(var131, var129);
                var130 = var130.rest();
                var131 = var130.first();
            }
            return f12761(var129);
        }
        return f12761(var125);
    }
    
    public static SubLObject f12804(final SubLObject var122, final SubLObject var1, final SubLObject var68, SubLObject var123) {
        if (var123 == module0202.UNPROVIDED) {
            var123 = (SubLObject)module0202.NIL;
        }
        if (module0202.NIL == f12590(var1)) {
            return (SubLObject)module0202.NIL;
        }
        final SubLObject var124 = module0205.f13180(var1, (SubLObject)module0202.$ic36$);
        if (!var124.isCons()) {
            return var1;
        }
        SubLObject var125 = (SubLObject)module0202.NIL;
        SubLObject var126 = (SubLObject)module0202.NIL;
        SubLObject var127 = (SubLObject)module0202.NIL;
        SubLObject var128 = (SubLObject)module0202.NIL;
        var126 = var124.first();
        var127 = (SubLObject)module0202.ZERO_INTEGER;
        for (var128 = var124.rest(); module0202.NIL != var128 && !var128.isAtom(); var128 = var128.rest()) {
            var125 = (SubLObject)ConsesLow.cons((module0202.NIL != module0205.f13126(var1, var127) || module0202.NIL != Functions.funcall(var68, var126)) ? var126 : Functions.funcall(var122, var126), var125);
            var126 = var128.first();
            var127 = Numbers.add((SubLObject)module0202.ONE_INTEGER, var127);
        }
        var125 = (SubLObject)ConsesLow.cons((module0202.NIL != module0205.f13126(var1, var127) || module0202.NIL != Functions.funcall(var68, var126)) ? var126 : Functions.funcall(var122, var126), var125);
        if (module0202.NIL != var128) {
            SubLObject var129 = (module0202.NIL == var123 || module0202.NIL != module0205.f13130(var1) || module0202.NIL != Functions.funcall(var68, var128)) ? var128 : Functions.funcall(var122, var128);
            SubLObject var130 = var125;
            SubLObject var131 = (SubLObject)module0202.NIL;
            var131 = var130.first();
            while (module0202.NIL != var130) {
                var129 = (SubLObject)ConsesLow.cons(var131, var129);
                var130 = var130.rest();
                var131 = var130.first();
            }
            return f12761(var129);
        }
        return f12761(var125);
    }
    
    public static SubLObject f12805(final SubLObject var136, final SubLObject var1) {
        final SubLThread var137 = SubLProcess.currentSubLThread();
        if (module0202.NIL != f12592(var1) && module0202.NIL == module0205.f13126(var1, (SubLObject)module0202.ONE_INTEGER)) {
            SubLObject var138 = (SubLObject)module0202.NIL;
            final SubLObject var139 = module0146.$g2032$.currentBinding(var137);
            try {
                module0146.$g2032$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL == module0146.$g2032$.getDynamicValue(var137)), var137);
                var138 = f12771(Functions.funcall(var136, module0205.f13203(var1, (SubLObject)module0202.UNPROVIDED)));
            }
            finally {
                module0146.$g2032$.rebind(var139, var137);
            }
            return Values.values(var138, (SubLObject)module0202.T);
        }
        return Values.values(var1, (SubLObject)module0202.NIL);
    }
    
    public static SubLObject f12806(final SubLObject var136, final SubLObject var1) {
        final SubLThread var137 = SubLProcess.currentSubLThread();
        if (module0202.NIL != f12594(var1)) {
            SubLObject var138 = (SubLObject)module0202.NIL;
            final SubLObject var139 = module0144.$g1801$.currentBinding(var137);
            final SubLObject var140 = module0144.$g1803$.currentBinding(var137);
            try {
                module0144.$g1801$.bind((SubLObject)module0202.T, var137);
                module0144.$g1803$.bind(module0146.$g2032$.getDynamicValue(var137), var137);
                var138 = f12800(var136, var1, (SubLObject)module0202.UNPROVIDED);
            }
            finally {
                module0144.$g1803$.rebind(var140, var137);
                module0144.$g1801$.rebind(var139, var137);
            }
            return Values.values(var138, (SubLObject)module0202.T);
        }
        return Values.values(var1, (SubLObject)module0202.NIL);
    }
    
    public static SubLObject f12807(final SubLObject var136, final SubLObject var1) {
        if (module0202.NIL != f12595(var1)) {
            return Values.values(f12800(var136, var1, (SubLObject)module0202.UNPROVIDED), (SubLObject)module0202.T);
        }
        return Values.values(var1, (SubLObject)module0202.NIL);
    }
    
    public static SubLObject f12808(final SubLObject var136, final SubLObject var1) {
        if (module0202.NIL != f12620(var1) && module0202.NIL == module0205.f13126(var1, f12749(var1))) {
            return Values.values(f12777(f12743(var1), f12744(var1), Functions.funcall(var136, f12668(var1))), (SubLObject)module0202.T);
        }
        return Values.values(var1, (SubLObject)module0202.NIL);
    }
    
    public static SubLObject f12809(final SubLObject var136, final SubLObject var1) {
        if (module0202.NIL != f12623(var1) && module0202.NIL == module0205.f13126(var1, f12749(var1))) {
            return Values.values(f12778(f12743(var1), f12748(var1), f12744(var1), Functions.funcall(var136, f12668(var1))));
        }
        return Values.values(var1, (SubLObject)module0202.NIL);
    }
    
    public static SubLObject f12810(final SubLObject var136, final SubLObject var1) {
        final SubLThread var137 = SubLProcess.currentSubLThread();
        var137.resetMultipleValues();
        final SubLObject var138 = f12806(var136, var1);
        final SubLObject var139 = var137.secondMultipleValue();
        var137.resetMultipleValues();
        if (module0202.NIL != var139) {
            return Values.values(var138, var139);
        }
        return f12807(var136, var1);
    }
    
    public static SubLObject f12811(final SubLObject var136, final SubLObject var1) {
        final SubLThread var137 = SubLProcess.currentSubLThread();
        if (module0202.NIL == f12635(var1)) {
            return Values.values(var1, (SubLObject)module0202.NIL);
        }
        var137.resetMultipleValues();
        final SubLObject var138 = f12805(var136, var1);
        final SubLObject var139 = var137.secondMultipleValue();
        var137.resetMultipleValues();
        if (module0202.NIL != var139) {
            return Values.values(var138, (SubLObject)module0202.T);
        }
        var137.resetMultipleValues();
        final SubLObject var140 = f12810(var136, var1);
        final SubLObject var141 = var137.secondMultipleValue();
        var137.resetMultipleValues();
        if (module0202.NIL != var141) {
            return Values.values(var140, (SubLObject)module0202.T);
        }
        return Values.values(f12800(var136, var1, (SubLObject)module0202.UNPROVIDED), (SubLObject)module0202.T);
    }
    
    public static SubLObject f12812(final SubLObject var136, final SubLObject var1) {
        final SubLThread var137 = SubLProcess.currentSubLThread();
        var137.resetMultipleValues();
        final SubLObject var138 = f12808(var136, var1);
        final SubLObject var139 = var137.secondMultipleValue();
        var137.resetMultipleValues();
        if (module0202.NIL != var139) {
            return Values.values(var138, (SubLObject)module0202.T);
        }
        return f12809(var136, var1);
    }
    
    public static SubLObject f12813(final SubLObject var136, final SubLObject var1) {
        final SubLThread var137 = SubLProcess.currentSubLThread();
        var137.resetMultipleValues();
        final SubLObject var138 = f12811(var136, var1);
        final SubLObject var139 = var137.secondMultipleValue();
        var137.resetMultipleValues();
        if (module0202.NIL != var139) {
            return Values.values(var138, (SubLObject)module0202.T);
        }
        return f12812(var136, var1);
    }
    
    public static SubLObject f12814(final SubLObject var136, final SubLObject var1) {
        final SubLThread var137 = SubLProcess.currentSubLThread();
        var137.resetMultipleValues();
        final SubLObject var138 = f12813(var136, var1);
        final SubLObject var139 = var137.secondMultipleValue();
        var137.resetMultipleValues();
        if (module0202.NIL != var139) {
            return Values.values(var138, (SubLObject)module0202.T);
        }
        if (module0202.NIL != module0210.f13601(var1, (SubLObject)module0202.UNPROVIDED)) {
            return Values.values(f12802(var136, var1, (SubLObject)module0202.UNPROVIDED), (SubLObject)module0202.T);
        }
        return Values.values(var1, (SubLObject)module0202.NIL);
    }
    
    public static SubLObject f12815(final SubLObject var136, final SubLObject var1, final SubLObject var126) {
        final SubLObject var137 = module0205.f13134(var1, var126, (SubLObject)module0202.UNPROVIDED);
        if (module0202.NIL != module0205.f13126(var1, var126)) {
            return var137;
        }
        return Functions.funcall(var136, var137);
    }
    
    public static SubLObject f12816(final SubLObject var136, final SubLObject var1, final SubLObject var126, final SubLObject var143) {
        final SubLObject var144 = module0205.f13134(var1, var126, (SubLObject)module0202.UNPROVIDED);
        if (module0202.NIL != module0205.f13126(var1, var126)) {
            return var144;
        }
        return Functions.funcall(var136, var144, var143);
    }
    
    public static SubLObject f12817(final SubLObject var126, final SubLObject var128, final SubLObject var1) {
        SubLObject var129 = (SubLObject)module0202.NIL;
        final SubLObject var130 = f12707(var1, (SubLObject)module0202.UNPROVIDED);
        final SubLObject var131 = module0205.f13180(var1, (SubLObject)module0202.$ic33$);
        SubLObject var132 = (SubLObject)module0202.NIL;
        SubLObject var133 = (SubLObject)module0202.NIL;
        SubLObject var134 = (SubLObject)module0202.NIL;
        var132 = var131;
        var133 = var132.first();
        for (var134 = (SubLObject)module0202.ZERO_INTEGER; module0202.NIL != var132; var132 = var132.rest(), var133 = var132.first(), var134 = module0048.f_1X(var134)) {
            if (var134.numE(var126)) {
                var129 = (SubLObject)ConsesLow.cons(var128, var129);
            }
            else {
                var129 = (SubLObject)ConsesLow.cons(var133, var129);
            }
        }
        final SubLObject var135 = Sequences.nreverse(var129);
        final SubLObject var136 = module0205.f13136(var135);
        final SubLObject var137 = module0205.f13207(var135, (SubLObject)module0202.UNPROVIDED);
        return f12720(var136, var137, var130);
    }
    
    public static SubLObject f12818(final SubLObject var126, final SubLObject var128, final SubLObject var1) {
        final SubLObject var129 = f12707(var1, (SubLObject)module0202.UNPROVIDED);
        final SubLObject var1_151 = (module0202.NIL != var129) ? f12712(var1) : var1;
        SubLObject var130 = (SubLObject)module0202.NIL;
        var130 = module0035.f2044(var126, var128, var1_151);
        if (module0202.NIL != var129) {
            return f12711(var129, var130);
        }
        return var130;
    }
    
    public static SubLObject f12819(final SubLObject var126, final SubLObject var1) {
        SubLObject var127 = (SubLObject)module0202.NIL;
        final SubLObject var128 = f12707(var1, (SubLObject)module0202.UNPROVIDED);
        final SubLObject var129 = module0205.f13180(var1, (SubLObject)module0202.$ic33$);
        SubLObject var130 = (SubLObject)module0202.NIL;
        SubLObject var131 = (SubLObject)module0202.NIL;
        SubLObject var132 = (SubLObject)module0202.NIL;
        var130 = var129;
        var131 = var130.first();
        for (var132 = (SubLObject)module0202.ZERO_INTEGER; module0202.NIL != var130; var130 = var130.rest(), var131 = var130.first(), var132 = module0048.f_1X(var132)) {
            if (!var132.numE(var126)) {
                var127 = (SubLObject)ConsesLow.cons(var131, var127);
            }
        }
        final SubLObject var133 = Sequences.nreverse(var127);
        final SubLObject var134 = module0205.f13136(var133);
        final SubLObject var135 = module0205.f13207(var133, (SubLObject)module0202.UNPROVIDED);
        return f12720(var134, var135, var128);
    }
    
    public static SubLObject f12820(final SubLObject var152, final SubLObject var128, final SubLObject var1) {
        final SubLObject var153 = f12762(var1);
        final SubLObject var154 = module0035.f2039(var153, var152, var128);
        final SubLObject var155 = f12761(var154);
        return var155;
    }
    
    public static SubLObject f12821(final SubLObject var152, final SubLObject var128, final SubLObject var1) {
        final SubLObject var153 = f12762(var1);
        final SubLObject var154 = module0035.f2040(var153, var152, var128);
        final SubLObject var155 = f12761(var154);
        return var155;
    }
    
    public static SubLObject f12822(final SubLObject var1, final SubLObject var152) {
        return module0035.f2038(f12762(var1), var152);
    }
    
    public static SubLObject f12823(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12589(var4, module0202.$g2307$.getDynamicValue(var5)) && module0202.$g2309$.getDynamicValue(var5).equal(module0205.f13134(var4, module0202.$g2308$.getDynamicValue(var5), (SubLObject)module0202.UNPROVIDED)));
    }
    
    public static SubLObject f12824(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return f12817(module0202.$g2308$.getDynamicValue(var5), module0202.$g2310$.getDynamicValue(var5), var4);
    }
    
    public static SubLObject f12825(final SubLObject var21, final SubLObject var154, final SubLObject var126, final SubLObject var67, final SubLObject var128) {
        final SubLThread var155 = SubLProcess.currentSubLThread();
        SubLObject var156 = (SubLObject)module0202.NIL;
        final SubLObject var157 = module0202.$g2307$.currentBinding(var155);
        final SubLObject var158 = module0202.$g2308$.currentBinding(var155);
        final SubLObject var159 = module0202.$g2309$.currentBinding(var155);
        final SubLObject var160 = module0202.$g2310$.currentBinding(var155);
        try {
            module0202.$g2307$.bind(var154, var155);
            module0202.$g2308$.bind(var126, var155);
            module0202.$g2309$.bind(var67, var155);
            module0202.$g2310$.bind(var128, var155);
            var156 = module0036.f2531(var21, (SubLObject)module0202.$ic79$, (SubLObject)module0202.$ic80$, (SubLObject)module0202.UNPROVIDED);
        }
        finally {
            module0202.$g2310$.rebind(var160, var155);
            module0202.$g2309$.rebind(var159, var155);
            module0202.$g2308$.rebind(var158, var155);
            module0202.$g2307$.rebind(var157, var155);
        }
        return var156;
    }
    
    public static SubLObject f12826(final SubLObject var115) {
        if (module0202.NIL == f12590(var115)) {
            return (SubLObject)module0202.NIL;
        }
        if (module0202.NIL != f12592(var115)) {
            return module0205.f13203(var115, (SubLObject)module0202.$ic81$);
        }
        return var115;
    }
    
    public static SubLObject f12827(final SubLObject var115) {
        if (module0202.NIL != f12592(var115)) {
            return (SubLObject)module0202.$ic82$;
        }
        return (SubLObject)module0202.$ic83$;
    }
    
    public static SubLObject f12828(final SubLObject var115) {
        return module0130.f8513(f12827(var115));
    }
    
    public static SubLObject f12829(final SubLObject var115, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return module0205.f13207(f12826(var115), var69);
    }
    
    public static SubLObject f12830(final SubLObject var115, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return module0205.f13180(f12826(var115), var69);
    }
    
    public static SubLObject f12831(final SubLObject var115, final SubLObject var126, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return module0205.f13134(f12826(var115), var126, var69);
    }
    
    public static SubLObject f12832(final SubLObject var115, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return f12833(var115, var69);
    }
    
    public static SubLObject f12833(final SubLObject var115, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return module0205.f13132(f12826(var115));
    }
    
    public static SubLObject f12834(final SubLObject var115, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return f12831(var115, (SubLObject)module0202.ONE_INTEGER, var69);
    }
    
    public static SubLObject f12835(final SubLObject var115, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return f12831(var115, (SubLObject)module0202.TWO_INTEGER, var69);
    }
    
    public static SubLObject f12836(final SubLObject var115, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return f12831(var115, (SubLObject)module0202.THREE_INTEGER, var69);
    }
    
    public static SubLObject f12837(final SubLObject var115, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return f12831(var115, (SubLObject)module0202.FOUR_INTEGER, var69);
    }
    
    public static SubLObject f12838(final SubLObject var115, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return f12831(var115, (SubLObject)module0202.FIVE_INTEGER, var69);
    }
    
    public static SubLObject f12839(final SubLObject var115, SubLObject var69) {
        if (var69 == module0202.UNPROVIDED) {
            var69 = (SubLObject)module0202.$ic33$;
        }
        return f12725(f12826(var115), var69);
    }
    
    public static SubLObject f12840(final SubLObject var113, final SubLObject var114) {
        return f12841(var113, module0130.f8518(var114));
    }
    
    public static SubLObject f12841(final SubLObject var113, final SubLObject var157) {
        return (module0202.$ic82$ == var157) ? module0205.f13338(var113) : var113;
    }
    
    public static SubLObject f12842(final SubLObject var158) {
        return module0035.remove_if_not((SubLObject)module0202.$ic84$, var158, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12843(final SubLObject var158) {
        return Sequences.remove_if((SubLObject)module0202.$ic84$, var158, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12844(final SubLObject var159) {
        return module0035.remove_if_not((SubLObject)module0202.$ic85$, var159, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12845(final SubLObject var159) {
        return module0035.remove_if_not((SubLObject)module0202.$ic86$, var159, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12846(final SubLObject var159) {
        return module0035.remove_if_not((SubLObject)module0202.$ic87$, var159, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12847(final SubLObject var159) {
        return module0035.remove_if_not((SubLObject)module0202.$ic88$, var159, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12848(final SubLObject var159) {
        return module0035.remove_if_not((SubLObject)module0202.$ic89$, var159, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12849(final SubLObject var160) {
        return module0035.remove_if_not((SubLObject)module0202.$ic90$, var160, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12850(final SubLObject var159, final SubLObject var154) {
        SubLObject var160 = (SubLObject)module0202.NIL;
        SubLObject var161 = var159;
        SubLObject var162 = (SubLObject)module0202.NIL;
        var162 = var161.first();
        while (module0202.NIL != var161) {
            if (module0202.NIL != f12851(var162, var154)) {
                var160 = (SubLObject)ConsesLow.cons(var162, var160);
            }
            var161 = var161.rest();
            var162 = var161.first();
        }
        return Sequences.nreverse(var160);
    }
    
    public static SubLObject f12852(final SubLObject var159) {
        SubLObject var160 = (SubLObject)module0202.NIL;
        SubLObject var161 = var159;
        SubLObject var162 = (SubLObject)module0202.NIL;
        var162 = var161.first();
        while (module0202.NIL != var161) {
            if (module0202.NIL != f12853(var162)) {
                var160 = (SubLObject)ConsesLow.cons(var162, var160);
            }
            var161 = var161.rest();
            var162 = var161.first();
        }
        return Sequences.nreverse(var160);
    }
    
    public static SubLObject f12854(final SubLObject var163) {
        return Sequences.remove_if((SubLObject)module0202.$ic86$, var163, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12855(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12592(var4) && module0202.NIL != module0207.f13522(var4));
    }
    
    public static SubLObject f12856(final SubLObject var115) {
        return f12593(f12826(var115));
    }
    
    public static SubLObject f12857(final SubLObject var115) {
        return f12598(f12826(var115));
    }
    
    public static SubLObject f12851(final SubLObject var115, final SubLObject var154) {
        if (module0202.NIL != f12590(var115) && module0202.NIL == f12592(var115)) {
            return Equality.eql(f12833(var115, (SubLObject)module0202.UNPROVIDED), var154);
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12858(final SubLObject var162) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12851(var162, module0202.$ic29$) && module0202.NIL != f12857(var162));
    }
    
    public static SubLObject f12859(final SubLObject var162) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12851(var162, module0202.$ic91$) && module0202.NIL != f12857(var162));
    }
    
    public static SubLObject f12860(final SubLObject var162) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12851(var162, module0202.$ic91$) && module0202.NIL != f12857(var162) && module0202.NIL != module0201.f12580(module0205.f13203(var162, (SubLObject)module0202.UNPROVIDED)) && module0202.NIL != module0173.f10955(module0205.f13204(var162, (SubLObject)module0202.UNPROVIDED)));
    }
    
    public static SubLObject f12861(final SubLObject var162) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12851(var162, module0202.$ic91$) && module0202.NIL != f12857(var162) && module0202.NIL != module0201.f12580(module0205.f13203(var162, (SubLObject)module0202.UNPROVIDED)) && module0202.NIL != module0201.f12580(module0205.f13204(var162, (SubLObject)module0202.UNPROVIDED)));
    }
    
    public static SubLObject f12862(final SubLObject var162) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12851(var162, module0202.$ic91$) && module0202.NIL != f12857(var162) && module0202.NIL != module0206.f13500(module0205.f13203(var162, (SubLObject)module0202.UNPROVIDED)) && module0202.NIL != module0206.f13500(module0205.f13204(var162, (SubLObject)module0202.UNPROVIDED)));
    }
    
    public static SubLObject f12863(final SubLObject var162) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12851(var162, module0202.$ic91$) && module0202.NIL != f12857(var162) && module0202.NIL != module0193.f12067(module0205.f13203(var162, (SubLObject)module0202.UNPROVIDED)) && module0202.$ic92$.eql(module0205.f13204(var162, (SubLObject)module0202.UNPROVIDED)));
    }
    
    public static SubLObject f12864(final SubLObject var162) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12851(var162, module0202.$ic93$) && module0202.NIL != f12857(var162));
    }
    
    public static SubLObject f12865(final SubLObject var162) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12851(var162, module0202.$ic94$) && module0202.NIL != f12857(var162));
    }
    
    public static SubLObject f12866(final SubLObject var162) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12851(var162, module0202.$ic95$) && module0202.NIL != f12857(var162));
    }
    
    public static SubLObject f12867(final SubLObject var162) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12851(var162, module0202.$ic96$) && module0202.NIL != f12857(var162));
    }
    
    public static SubLObject f12868(final SubLObject var162) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12851(var162, module0202.$ic97$) && module0202.NIL != f12857(var162));
    }
    
    public static SubLObject f12869(final SubLObject var162) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12851(var162, module0202.$ic98$) && module0202.NIL != f12857(var162));
    }
    
    public static SubLObject f12870(final SubLObject var162) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12851(var162, module0202.$ic99$) && module0202.NIL != f12857(var162));
    }
    
    public static SubLObject f12871(final SubLObject var162) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12851(var162, module0202.$ic100$) && module0202.NIL != f12857(var162));
    }
    
    public static SubLObject f12872(final SubLObject var113) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12598(var113) && module0202.NIL != module0205.f13332(var113, module0202.$ic100$));
    }
    
    public static SubLObject f12873(final SubLObject var162) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12851(var162, module0202.$ic101$) && module0202.NIL != f12857(var162));
    }
    
    public static SubLObject f12874(final SubLObject var115) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12851(var115, module0202.$ic102$) && module0202.NIL != f12857(var115));
    }
    
    public static SubLObject f12875(final SubLObject var115) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12851(var115, module0202.$ic103$) && module0202.NIL != f12856(var115));
    }
    
    public static SubLObject f12876(final SubLObject var115) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12851(var115, module0202.$ic104$) && module0202.NIL != f12856(var115));
    }
    
    public static SubLObject f12877(final SubLObject var115, SubLObject var20) {
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12851(var115, module0202.$ic105$) && module0202.NIL != f12857(var115) && module0202.NIL != module0210.f13576(f12835(var115, (SubLObject)module0202.UNPROVIDED), var20) && (module0202.NIL != Functions.funcall(var20, f12834(var115, (SubLObject)module0202.UNPROVIDED)) || module0202.NIL != f12878(f12834(var115, (SubLObject)module0202.UNPROVIDED))));
    }
    
    public static SubLObject f12879(final SubLObject var113) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.$ic105$.eql(module0205.f13333(var113)) && module0202.NIL != module0193.f12105(module0205.f13388(var113, (SubLObject)module0202.UNPROVIDED)));
    }
    
    public static SubLObject f12880(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12590(var4) && module0202.NIL != module0229.f15234(module0205.f13132(var4)) && module0202.NIL != f12691(var4, Symbols.symbol_function((SubLObject)module0202.$ic51$)));
    }
    
    public static SubLObject f12878(final SubLObject var118) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var118.isString() || var118.isNumber());
    }
    
    public static SubLObject f12881(final SubLObject var162) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != module0004.f104(f12833(var162, (SubLObject)module0202.UNPROVIDED), module0146.$g1968$.getGlobalValue(), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED) && module0202.NIL != f12857(var162));
    }
    
    public static SubLObject f12853(final SubLObject var162) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12857(var162) && f12834(var162, (SubLObject)module0202.UNPROVIDED).equal(f12835(var162, (SubLObject)module0202.UNPROVIDED)));
    }
    
    public static SubLObject f12882(final SubLObject var162) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12873(var162) && module0202.NIL != module0210.f13576(f12835(var162, (SubLObject)module0202.UNPROVIDED), (SubLObject)module0202.UNPROVIDED));
    }
    
    public static SubLObject f12883(final SubLObject var81, SubLObject var164) {
        if (var164 == module0202.UNPROVIDED) {
            var164 = (SubLObject)module0202.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12660(var81) && (module0202.$ic74$.eql(module0205.f13378(var81)) || (module0202.NIL != var164 && module0202.NIL != module0260.f17091(module0205.f13378(var81), module0202.$ic74$, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED))) && module0202.NIL != f12598(var81));
    }
    
    public static SubLObject f12884(final SubLObject var81) {
        return f12885(var81, (SubLObject)module0202.NIL);
    }
    
    public static SubLObject f12886(final SubLObject var81, final SubLObject var154) {
        return f12885(var81, var154);
    }
    
    public static SubLObject f12885(final SubLObject var81, final SubLObject var154) {
        if (module0202.NIL != f12883(var81, (SubLObject)module0202.UNPROVIDED)) {
            final SubLObject var155 = f12887(var81);
            if (module0202.NIL != f12664(var155)) {
                final SubLObject var156 = module0205.f13333(var155);
                if (module0202.NIL != var154) {
                    return Equality.eql(var154, var156);
                }
                return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != module0173.f10955(var156) && module0202.NIL != module0269.f17706(var156));
            }
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12888(final SubLObject var81) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12883(var81, (SubLObject)module0202.UNPROVIDED) && module0202.NIL != module0161.f10484(module0205.f13379(var81, (SubLObject)module0202.UNPROVIDED)));
    }
    
    public static SubLObject f12889(final SubLObject var81) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12660(var81) && module0202.$ic103$.eql(module0205.f13378(var81)) && module0202.NIL != f12593(var81));
    }
    
    public static SubLObject f12890(final SubLObject var81) {
        if (module0202.NIL != f12889(var81)) {
            final SubLObject var82 = module0205.f13379(var81, (SubLObject)module0202.UNPROVIDED);
            if (module0202.NIL != f12660(var82)) {
                final SubLObject var83 = module0205.f13378(var82);
                return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != module0173.f10955(var83) && module0202.NIL != module0269.f17706(var83));
            }
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12891(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12592(var4) && module0202.NIL != f12889(module0205.f13203(var4, (SubLObject)module0202.UNPROVIDED)));
    }
    
    public static SubLObject f12892(final SubLObject var166) {
        SubLObject var167 = (SubLObject)module0202.ZERO_INTEGER;
        SubLObject var168 = (SubLObject)module0202.NIL;
        SubLObject var169 = var166;
        SubLObject var170 = (SubLObject)module0202.NIL;
        var170 = var169.first();
        while (module0202.NIL != var169) {
            final SubLObject var171 = f12893(var170);
            if (var171.numG(var167)) {
                var167 = var171;
                var168 = var170;
            }
            var169 = var169.rest();
            var170 = var169.first();
        }
        return Values.values(var167, var168);
    }
    
    public static SubLObject f12893(final SubLObject var169) {
        return module0035.f2451((SubLObject)module0202.$ic106$, var169, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12894(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12664(var4) && module0202.NIL != f12895(module0205.f13333(var4)));
    }
    
    public static SubLObject f12895(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12589(var4, module0202.$ic107$) && module0202.NIL != f12598(var4) && module0202.NIL != module0035.f2192((SubLObject)module0202.$ic51$, module0205.f13277(var4, (SubLObject)module0202.UNPROVIDED)));
    }
    
    public static SubLObject f12896(final SubLObject var171) {
        return module0205.f13277(var171, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12897(final SubLObject var171) {
        return Sequences.length(f12896(var171));
    }
    
    public static SubLObject f12898(final SubLObject var171) {
        return module0205.f13368(var171, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12899(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12589(var4, module0202.$ic108$) && module0202.NIL != f12598(var4) && module0202.NIL != module0035.f2192((SubLObject)module0202.$ic51$, module0205.f13277(var4, (SubLObject)module0202.UNPROVIDED)));
    }
    
    public static SubLObject f12900(final SubLObject var171) {
        return module0205.f13277(var171, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12901(final SubLObject var171) {
        return Sequences.length(f12900(var171));
    }
    
    public static SubLObject f12902(final SubLObject var171) {
        return module0205.f13368(var171, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12903(final SubLObject var115) {
        final SubLThread var116 = SubLProcess.currentSubLThread();
        SubLObject var117 = (SubLObject)module0202.NIL;
        final SubLObject var118 = module0147.$g2094$.currentBinding(var116);
        final SubLObject var119 = module0147.$g2095$.currentBinding(var116);
        try {
            module0147.$g2094$.bind((SubLObject)module0202.$ic109$, var116);
            module0147.$g2095$.bind(module0202.$ic110$, var116);
            var117 = (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12590(var115) && module0202.NIL != module0210.f13570(f12833(var115, (SubLObject)module0202.UNPROVIDED)));
        }
        finally {
            module0147.$g2095$.rebind(var119, var116);
            module0147.$g2094$.rebind(var118, var116);
        }
        return var117;
    }
    
    public static SubLObject f12904(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0202.NIL;
        final SubLObject var7 = module0147.$g2094$.currentBinding(var5);
        final SubLObject var8 = module0147.$g2095$.currentBinding(var5);
        try {
            module0147.$g2094$.bind((SubLObject)module0202.$ic109$, var5);
            module0147.$g2095$.bind(module0202.$ic110$, var5);
            var6 = (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12590(var4) && module0202.NIL != module0210.f13570(module0205.f13132(var4)));
        }
        finally {
            module0147.$g2095$.rebind(var8, var5);
            module0147.$g2094$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f12905(final SubLObject var115) {
        final SubLObject var116 = f12832(var115, (SubLObject)module0202.UNPROVIDED);
        if (module0202.$ic74$.eql(var116)) {
            return (SubLObject)module0202.ONE_INTEGER;
        }
        return module0220.f14556(var116, module0202.$ic111$, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12906(final SubLObject var115) {
        return f12831(var115, f12905(var115), (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12907(final SubLObject var115) {
        final SubLObject var116 = f12832(var115, (SubLObject)module0202.UNPROVIDED);
        if (module0202.$ic74$.eql(var116)) {
            return (SubLObject)module0202.TWO_INTEGER;
        }
        return module0220.f14556(var116, module0202.$ic112$, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12887(final SubLObject var115) {
        return f12831(var115, f12907(var115), (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12908(final SubLObject var67) {
        return f12909(var67);
    }
    
    public static SubLObject f12909(final SubLObject var72) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var72.isInteger() && var72.numGE((SubLObject)module0202.ZERO_INTEGER));
    }
    
    public static SubLObject f12910(SubLObject var81) {
        SubLObject var83;
        final SubLObject var82 = var83 = f12911(var81, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
        SubLObject var84 = (SubLObject)module0202.NIL;
        var84 = var83.first();
        while (module0202.NIL != var83) {
            var81 = f12775(var84, var81);
            var83 = var83.rest();
            var84 = var83.first();
        }
        return var81;
    }
    
    public static SubLObject f12912(SubLObject var81) {
        while (module0202.NIL != f12604(var81)) {
            var81 = f12668(var81);
        }
        return var81;
    }
    
    public static SubLObject f12913(SubLObject var81) {
        SubLObject var83;
        final SubLObject var82 = var83 = f12911(var81, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
        SubLObject var84 = (SubLObject)module0202.NIL;
        var84 = var83.first();
        while (module0202.NIL != var83) {
            var81 = f12776(var84, var81);
            var83 = var83.rest();
            var84 = var83.first();
        }
        return var81;
    }
    
    public static SubLObject f12914(final SubLObject var1) {
        return f12915(var1, f12911(var1, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED));
    }
    
    public static SubLObject f12915(final SubLObject var1, SubLObject var173) {
        if (var173 == module0202.UNPROVIDED) {
            var173 = f12911(var1, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
        }
        SubLObject var174 = var1;
        SubLObject var175 = var173;
        SubLObject var176 = (SubLObject)module0202.NIL;
        var176 = var175.first();
        while (module0202.NIL != var175) {
            var174 = f12776(var176, var174);
            var175 = var175.rest();
            var176 = var175.first();
        }
        return var174;
    }
    
    public static SubLObject f12916(final SubLObject var1) {
        assert module0202.NIL != f12917(var1) : var1;
        final SubLObject var2 = f12918(var1, (SubLObject)module0202.UNPROVIDED);
        SubLObject var3 = (SubLObject)module0202.NIL;
        SubLObject var4 = (SubLObject)module0202.NIL;
        SubLObject var5 = (SubLObject)module0202.NIL;
        var3 = var2;
        var4 = var3.first();
        for (var5 = (SubLObject)module0202.ZERO_INTEGER; module0202.NIL != var3; var3 = var3.rest(), var4 = var3.first(), var5 = Numbers.add((SubLObject)module0202.ONE_INTEGER, var5)) {
            if (module0202.ONE_INTEGER.numE(module0035.f2448(var4, var1)) && module0202.NIL == module0201.f12549(var4)) {
                return var4;
            }
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12919(final SubLObject var1) {
        assert module0202.NIL != f12917(var1) : var1;
        final SubLObject var2 = f12918(var1, (SubLObject)module0202.UNPROVIDED);
        SubLObject var3 = (SubLObject)module0202.NIL;
        SubLObject var4 = (SubLObject)module0202.NIL;
        SubLObject var5 = (SubLObject)module0202.NIL;
        SubLObject var6 = (SubLObject)module0202.NIL;
        var4 = var2;
        var5 = var4.first();
        for (var6 = (SubLObject)module0202.ZERO_INTEGER; module0202.NIL != var4; var4 = var4.rest(), var5 = var4.first(), var6 = Numbers.add((SubLObject)module0202.ONE_INTEGER, var6)) {
            if (module0202.ONE_INTEGER.numE(module0035.f2448(var5, var1)) && module0202.NIL == module0201.f12549(var5)) {
                var3 = (SubLObject)ConsesLow.cons(var5, var3);
            }
        }
        return Sequences.nreverse(var3);
    }
    
    public static SubLObject f12920(final SubLObject var171) {
        final SubLObject var172 = module0205.f13276(var171);
        if (module0202.NIL != module0173.f10955(var172)) {
            return var172;
        }
        if (module0202.NIL != f12590(var172)) {
            return f12920(var171);
        }
        f12747((SubLObject)module0202.THREE_INTEGER, (SubLObject)module0202.$ic115$, var171, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
        return var172;
    }
    
    public static SubLObject f12921(final SubLObject var6, SubLObject var177) {
        if (var177 == module0202.UNPROVIDED) {
            var177 = Symbols.symbol_function((SubLObject)module0202.$ic116$);
        }
        if (module0202.NIL != module0269.f17706(var6)) {
            return (SubLObject)module0202.T;
        }
        if (module0202.NIL != Functions.funcall(var177, var6)) {
            return (SubLObject)module0202.T;
        }
        if (module0202.NIL == module0210.f13571(var6)) {
            return (SubLObject)module0202.NIL;
        }
        final SubLObject var178 = module0205.f13327(var6);
        if (module0202.NIL != module0173.f10955(var178)) {
            return module0269.f17706(var178);
        }
        return module0259.f16892(var178, module0202.$ic117$, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12922(final SubLObject var6, SubLObject var177) {
        if (var177 == module0202.UNPROVIDED) {
            var177 = Symbols.symbol_function((SubLObject)module0202.$ic116$);
        }
        if (module0202.NIL != module0269.f17724(var6)) {
            return (SubLObject)module0202.T;
        }
        if (module0202.NIL != Functions.funcall(var177, var6)) {
            return (SubLObject)module0202.T;
        }
        if (module0202.NIL == module0210.f13571(var6)) {
            return (SubLObject)module0202.NIL;
        }
        final SubLObject var178 = module0205.f13327(var6);
        if (module0202.NIL != module0173.f10955(var178)) {
            return module0269.f17724(var178);
        }
        return module0256.f16604(module0202.$ic118$, module0226.f14990(module0205.f13276(var6), module0132.$g1555$.getGlobalValue()), module0132.$g1555$.getGlobalValue(), (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12923(final SubLObject var115) {
        final SubLThread var116 = SubLProcess.currentSubLThread();
        final SubLObject var117 = Sequences.reverse(module0205.f13207(var115, (SubLObject)module0202.UNPROVIDED));
        SubLObject var118 = (SubLObject)module0202.NIL;
        SubLObject var119 = (SubLObject)module0202.NIL;
        SubLObject var120;
        SubLObject var121;
        for (var120 = (SubLObject)module0202.NIL, var120 = var117; !var120.isAtom(); var120 = var120.rest()) {
            var121 = Sequences.reverse(var120);
            if (module0202.NIL != module0035.f2002(var121, (SubLObject)module0202.ONE_INTEGER, (SubLObject)module0202.UNPROVIDED)) {
                var118 = (SubLObject)ConsesLow.cons(module0276.f18287(var121, (SubLObject)module0202.UNPROVIDED), var118);
            }
            else {
                var118 = (SubLObject)ConsesLow.cons(var121.first(), var118);
            }
        }
        if (module0202.NIL != var118) {
            var119 = module0276.f18280(var118, (SubLObject)module0202.UNPROVIDED);
        }
        return Values.values(var119, module0147.$g2095$.getDynamicValue(var116));
    }
    
    public static SubLObject f12924(final SubLObject var113) {
        final SubLThread var114 = SubLProcess.currentSubLThread();
        if (module0202.NIL == f12925(var113) || module0202.NIL == f12734(var113, (SubLObject)module0202.ONE_INTEGER, (SubLObject)module0202.UNPROVIDED)) {
            return Values.values(var113, module0147.$g2095$.getDynamicValue(var114));
        }
        final SubLObject var115 = module0205.f13387(var113, (SubLObject)module0202.UNPROVIDED);
        return f12926(var115);
    }
    
    public static SubLObject f12926(final SubLObject var183) {
        final SubLThread var184 = SubLProcess.currentSubLThread();
        final SubLObject var185 = module0147.$g2095$.getDynamicValue(var184);
        final SubLObject var186 = constants_high_oc.f10737((SubLObject)module0202.$ic121$);
        final SubLObject var187 = module0202.$ic122$;
        SubLObject var188 = (SubLObject)module0202.NIL;
        if (module0202.NIL != f12595(var183)) {
            SubLObject var189 = (SubLObject)module0202.NIL;
            SubLObject var191;
            final SubLObject var190 = var191 = module0205.f13207(var183, (SubLObject)module0202.$ic33$);
            SubLObject var192 = (SubLObject)module0202.NIL;
            var192 = var191.first();
            while (module0202.NIL != var191) {
                var189 = (SubLObject)ConsesLow.cons(f12926(var192), var189);
                var191 = var191.rest();
                var192 = var191.first();
            }
            var188 = f12773(Sequences.nreverse(var189));
        }
        else if (module0202.NIL != f12594(var183)) {
            SubLObject var193 = (SubLObject)module0202.NIL;
            SubLObject var191;
            final SubLObject var190 = var191 = module0205.f13207(var183, (SubLObject)module0202.$ic33$);
            SubLObject var194 = (SubLObject)module0202.NIL;
            var194 = var191.first();
            while (module0202.NIL != var191) {
                var193 = (SubLObject)ConsesLow.cons(f12926(var194), var193);
                var191 = var191.rest();
                var194 = var191.first();
            }
            var188 = f12772(Sequences.nreverse(var193));
        }
        else if (module0202.NIL == Sequences.find_if((SubLObject)module0202.$ic123$, module0205.f13207(var183, (SubLObject)module0202.UNPROVIDED), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
            var188 = f12643(module0202.$ic103$, var183);
        }
        else if (module0202.NIL != module0205.f13332(var183, var187)) {
            var188 = f12817((SubLObject)module0202.ZERO_INTEGER, var186, var183);
        }
        else if (module0202.NIL != module0205.f13332(var183, var186)) {
            var188 = var183;
        }
        else if (module0202.NIL != f12734(var183, (SubLObject)module0202.TWO_INTEGER, (SubLObject)module0202.UNPROVIDED) && module0202.NIL != module0584.f35800(module0205.f13333(var183))) {
            var188 = f12769(var186, module0205.f13387(var183, (SubLObject)module0202.UNPROVIDED), module0205.f13333(var183), module0205.f13388(var183, (SubLObject)module0202.UNPROVIDED));
        }
        else if (module0202.NIL != module0205.f13332(var183, module0202.$ic124$)) {
            final SubLObject var195 = constants_high_oc.f10737((SubLObject)module0202.$ic125$);
            if (module0202.NIL != constant_handles_oc.f8465(var195, (SubLObject)module0202.UNPROVIDED)) {
                var188 = f12817((SubLObject)module0202.ZERO_INTEGER, var195, var183);
            }
            else {
                var188 = var183;
            }
        }
        else {
            var188 = f12643(module0202.$ic126$, var183);
        }
        return Values.values(var188, var185);
    }
    
    public static SubLObject f12927(final SubLObject var81) {
        final SubLObject var82 = f12926(var81);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL == module0205.f13220(module0202.$ic126$, var82, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED));
    }
    
    public static SubLObject f12928(final SubLObject var81) {
        final SubLObject var82 = f12926(var81);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL == module0205.f13220(module0202.$ic126$, var82, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED) && !var82.equal(f12643(module0202.$ic103$, var81)));
    }
    
    public static SubLObject f12929(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12930(var4) || module0202.NIL != module0210.f13571(var4));
    }
    
    public static SubLObject f12931(final SubLObject var4) {
        return module0167.f10813(var4);
    }
    
    public static SubLObject f12932(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12929(var4) || module0202.NIL != f12931(var4));
    }
    
    public static SubLObject f12930(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12933(var1) && (module0202.NIL != f12934(var1) || module0202.NIL != f12935(var1)));
    }
    
    public static SubLObject f12934(final SubLObject var1) {
        return f12925(var1);
    }
    
    public static SubLObject f12935(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12590(var1) && module0202.NIL != module0303.f20136(module0205.f13132(var1)));
    }
    
    public static SubLObject f12936(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != module0206.f13433(var1) && module0202.NIL != f12691(var1, (SubLObject)module0202.UNPROVIDED));
    }
    
    public static SubLObject f12917(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL == f12936(var1));
    }
    
    public static SubLObject f12937(final SubLObject var1) {
        if (var1.isAtom()) {
            return (SubLObject)module0202.NIL;
        }
        if (module0202.NIL != f12925(var1)) {
            return (SubLObject)module0202.T;
        }
        if (module0202.NIL != f12592(var1) && module0202.NIL != f12925(module0205.f13203(var1, (SubLObject)module0202.UNPROVIDED))) {
            return (SubLObject)module0202.T;
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12925(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12590(var4) && module0202.NIL != f12921(module0205.f13132(var4), (SubLObject)module0202.UNPROVIDED) && module0202.NIL != module0210.f13601(var4, (SubLObject)module0202.UNPROVIDED));
    }
    
    public static SubLObject f12938(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12925(var1) && module0202.NIL != f12689(var1, (SubLObject)module0202.UNPROVIDED));
    }
    
    public static SubLObject f12939(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != f12925(var1) && module0202.NIL != f12691(var1, (SubLObject)module0202.UNPROVIDED));
    }
    
    public static SubLObject f12940(final SubLObject var4) {
        if (module0202.NIL == var4 || module0202.NIL != module0035.f2014(var4)) {
            SubLObject var5 = (SubLObject)module0202.NIL;
            if (module0202.NIL == var5) {
                SubLObject var6 = var4;
                SubLObject var7 = (SubLObject)module0202.NIL;
                var7 = var6.first();
                while (module0202.NIL == var5 && module0202.NIL != var6) {
                    if (module0202.NIL == module0201.f12546(var7)) {
                        var5 = (SubLObject)module0202.T;
                    }
                    var6 = var6.rest();
                    var7 = var6.first();
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL == var5);
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12941(final SubLObject var1, SubLObject var20) {
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        return Sequences.remove_if(var20, module0035.f2119(var1), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12942(final SubLObject var1, SubLObject var20) {
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        return module0205.f13188(var1, var20, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12943(final SubLObject var81, SubLObject var20, SubLObject var196) {
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        if (var196 == module0202.UNPROVIDED) {
            var196 = (SubLObject)module0202.T;
        }
        final SubLThread var197 = SubLProcess.currentSubLThread();
        if (module0202.NIL != Functions.funcall(var20, var81)) {
            return (SubLObject)ConsesLow.list(var81);
        }
        if (!var81.isAtom()) {
            if (module0202.NIL != f12592(var81)) {
                return f12943(module0205.f13379(var81, (SubLObject)module0202.UNPROVIDED), var20, var196);
            }
            if (module0202.NIL != f12595(var81) || module0202.NIL != f12594(var81)) {
                SubLObject var198 = (SubLObject)module0202.NIL;
                SubLObject var199 = module0205.f13377(var81, (SubLObject)((module0202.NIL != var196) ? module0202.$ic81$ : module0202.$ic33$));
                SubLObject var200 = (SubLObject)module0202.NIL;
                var200 = var199.first();
                while (module0202.NIL != var199) {
                    SubLObject var8_197 = f12943(var200, var20, var196);
                    SubLObject var201 = (SubLObject)module0202.NIL;
                    var201 = var8_197.first();
                    while (module0202.NIL != var8_197) {
                        final SubLObject var202 = var201;
                        if (module0202.NIL == conses_high.member(var202, var198, Symbols.symbol_function((SubLObject)module0202.EQL), Symbols.symbol_function((SubLObject)module0202.IDENTITY))) {
                            var198 = (SubLObject)ConsesLow.cons(var202, var198);
                        }
                        var8_197 = var8_197.rest();
                        var201 = var8_197.first();
                    }
                    var199 = var199.rest();
                    var200 = var199.first();
                }
                return var198;
            }
            if (module0202.NIL != f12597(var81) || module0202.NIL != f12648(var81)) {
                return module0035.f2216(f12943(module0205.f13379(var81, (SubLObject)module0202.UNPROVIDED), var20, var196), f12943(module0205.f13380(var81, (SubLObject)module0202.UNPROVIDED), var20, var196), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
            }
            if (module0202.NIL != f12604(var81) || module0202.NIL != f12606(var81)) {
                return conses_high.adjoin(module0205.f13379(var81, (SubLObject)module0202.UNPROVIDED), f12943(module0205.f13380(var81, (SubLObject)module0202.UNPROVIDED), var20, var196), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
            }
            if (module0202.NIL != f12623(var81)) {
                return conses_high.adjoin(module0205.f13380(var81, (SubLObject)module0202.UNPROVIDED), f12943(module0205.f13381(var81, (SubLObject)module0202.UNPROVIDED), var20, var196), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
            }
            if (module0202.NIL != f12903(var81)) {
                final SubLObject var203 = f12906(var81);
                final SubLObject var204 = module0269.f17707(var203);
                final SubLObject var205 = f12887(var81);
                SubLObject var206 = (SubLObject)module0202.NIL;
                final SubLObject var207 = (SubLObject)((module0202.NIL != var204) ? var203 : module0202.NIL);
                final SubLObject var208 = module0147.$g2094$.currentBinding(var197);
                final SubLObject var209 = module0147.$g2095$.currentBinding(var197);
                try {
                    module0147.$g2094$.bind(module0147.f9531(var207), var197);
                    module0147.$g2095$.bind(module0147.f9534(var207), var197);
                    var206 = f12943(var205, var20, var196);
                }
                finally {
                    module0147.$g2095$.rebind(var209, var197);
                    module0147.$g2094$.rebind(var208, var197);
                }
                if (module0202.NIL == var204) {
                    var206 = ConsesLow.append(var206, f12944(var203, var20, var196));
                }
                return var206;
            }
            if (module0202.NIL != f12925(var81)) {
                return f12945(var81, var20, var196);
            }
            f12747((SubLObject)module0202.FOUR_INTEGER, (SubLObject)module0202.$ic128$, var81, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12945(final SubLObject var61, SubLObject var20, SubLObject var196) {
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        if (var196 == module0202.UNPROVIDED) {
            var196 = (SubLObject)module0202.T;
        }
        return f12946(var61, var20, var196);
    }
    
    public static SubLObject f12944(final SubLObject var201, SubLObject var20, SubLObject var196) {
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        if (var196 == module0202.UNPROVIDED) {
            var196 = (SubLObject)module0202.T;
        }
        return f12946(var201, var20, var196);
    }
    
    public static SubLObject f12946(final SubLObject var115, SubLObject var20, SubLObject var196) {
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        if (var196 == module0202.UNPROVIDED) {
            var196 = (SubLObject)module0202.T;
        }
        if (module0202.NIL != Functions.funcall(var20, var115)) {
            return (SubLObject)ConsesLow.list(var115);
        }
        if (module0202.NIL != f12592(var115)) {
            return f12945(module0205.f13203(var115, (SubLObject)module0202.UNPROVIDED), var20, (SubLObject)module0202.UNPROVIDED);
        }
        SubLObject var197 = (SubLObject)module0202.ZERO_INTEGER;
        SubLObject var198 = (SubLObject)module0202.NIL;
        SubLObject var200;
        final SubLObject var199 = var200 = module0205.f13180(var115, (SubLObject)((module0202.NIL != var196) ? module0202.$ic81$ : module0202.$ic33$));
        SubLObject var201 = (SubLObject)module0202.NIL;
        var201 = var200.first();
        while (module0202.NIL != var200) {
            if (module0202.NIL == module0004.f104(var201, var198, Symbols.symbol_function((SubLObject)module0202.EQUAL), (SubLObject)module0202.UNPROVIDED)) {
                if (module0202.NIL != Functions.funcall(var20, var201)) {
                    var198 = (SubLObject)ConsesLow.cons(var201, var198);
                }
                else if (module0202.NIL != module0210.f13589(var201)) {
                    var198 = (SubLObject)ConsesLow.cons(var201, var198);
                }
                else if (module0202.NIL != module0210.f13576(var201, var20)) {
                    SubLObject var8_203 = f12944(var201, var20, var196);
                    SubLObject var202 = (SubLObject)module0202.NIL;
                    var202 = var8_203.first();
                    while (module0202.NIL != var8_203) {
                        if (module0202.NIL == module0004.f104(var202, var198, Symbols.symbol_function((SubLObject)module0202.EQUAL), (SubLObject)module0202.UNPROVIDED)) {
                            var198 = (SubLObject)ConsesLow.cons(var202, var198);
                        }
                        var8_203 = var8_203.rest();
                        var202 = var8_203.first();
                    }
                }
                else if (module0202.NIL != module0210.f13606(var201, var20)) {
                    SubLObject var8_204 = f12943(var201, var20, var196);
                    SubLObject var202 = (SubLObject)module0202.NIL;
                    var202 = var8_204.first();
                    while (module0202.NIL != var8_204) {
                        if (module0202.NIL == module0004.f104(var202, var198, Symbols.symbol_function((SubLObject)module0202.EQUAL), (SubLObject)module0202.UNPROVIDED)) {
                            var198 = (SubLObject)ConsesLow.cons(var202, var198);
                        }
                        var8_204 = var8_204.rest();
                        var202 = var8_204.first();
                    }
                }
            }
            var197 = Numbers.add(var197, (SubLObject)module0202.ONE_INTEGER);
            var200 = var200.rest();
            var201 = var200.first();
        }
        return Sequences.reverse(var198);
    }
    
    public static SubLObject f12947(final SubLObject var1, SubLObject var20) {
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        final SubLObject var21 = module0205.f13136(var1);
        SubLObject var22 = (SubLObject)module0202.NIL;
        if (module0202.NIL != module0173.f10955(var21)) {
            SubLObject var23 = module0226.f15099(var21, (SubLObject)module0202.UNPROVIDED);
            SubLObject var24 = (SubLObject)module0202.NIL;
            var24 = var23.first();
            while (module0202.NIL != var23) {
                final SubLObject var25 = module0205.f13134(var1, var24, (SubLObject)module0202.UNPROVIDED);
                if (module0202.NIL != Functions.funcall(var20, var25)) {
                    var22 = (SubLObject)ConsesLow.cons(var25, var22);
                }
                else if (var25.isCons()) {
                    SubLObject var8_207 = module0205.f13180(var25, (SubLObject)module0202.UNPROVIDED);
                    SubLObject var26 = (SubLObject)module0202.NIL;
                    var26 = var8_207.first();
                    while (module0202.NIL != var8_207) {
                        if (module0202.NIL != Functions.funcall(var20, var26)) {
                            var22 = (SubLObject)ConsesLow.cons(var26, var22);
                        }
                        var8_207 = var8_207.rest();
                        var26 = var8_207.first();
                    }
                }
                var23 = var23.rest();
                var24 = var23.first();
            }
        }
        return Sequences.nreverse(var22);
    }
    
    public static SubLObject f12948(final SubLObject var159, SubLObject var20) {
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        SubLObject var160 = (SubLObject)module0202.NIL;
        SubLObject var161 = var159;
        SubLObject var162 = (SubLObject)module0202.NIL;
        var162 = var161.first();
        while (module0202.NIL != var161) {
            var160 = module0035.f2216(var160, f12945(var162, var20, (SubLObject)module0202.UNPROVIDED), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
            var161 = var161.rest();
            var162 = var161.first();
        }
        return var160;
    }
    
    public static SubLObject f12949(final SubLObject var159, SubLObject var209, SubLObject var20) {
        if (var209 == module0202.UNPROVIDED) {
            var209 = (SubLObject)module0202.NIL;
        }
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        SubLObject var210 = (SubLObject)module0202.NIL;
        if (var159.isCons()) {
            SubLObject var211 = var159;
            SubLObject var212 = (SubLObject)module0202.NIL;
            var212 = var211.first();
            while (module0202.NIL != var211) {
                var210 = module0035.f2216(var210, f12950(var212, var209, var20), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
                var211 = var211.rest();
                var212 = var211.first();
            }
        }
        else if (module0202.NIL == module0004.f104(var159, var209, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
            if (module0202.NIL != Functions.funcall(var20, var159)) {
                var210 = (SubLObject)ConsesLow.cons(var159, var210);
            }
        }
        return var210;
    }
    
    public static SubLObject f12950(final SubLObject var115, SubLObject var210, SubLObject var20) {
        if (var210 == module0202.UNPROVIDED) {
            var210 = (SubLObject)module0202.NIL;
        }
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        return f12951(var115, var210, var20);
    }
    
    public static SubLObject f12952(final SubLObject var201, SubLObject var210, SubLObject var20) {
        if (var210 == module0202.UNPROVIDED) {
            var210 = (SubLObject)module0202.NIL;
        }
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        return f12951(var201, var210, var20);
    }
    
    public static SubLObject f12953(final SubLObject var1) {
        return module0035.f2439((SubLObject)module0202.$ic129$, var1, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12951(final SubLObject var61, SubLObject var210, SubLObject var20) {
        if (var210 == module0202.UNPROVIDED) {
            var210 = (SubLObject)module0202.NIL;
        }
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        if (module0202.NIL == f12953(var61)) {
            return (SubLObject)module0202.NIL;
        }
        if (module0202.NIL == module0004.f104(var61, var210, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
            if (module0202.NIL != Functions.funcall(var20, var61)) {
                return (SubLObject)module0202.NIL;
            }
            if (module0202.NIL != f12592(var61)) {
                return f12951(module0205.f13203(var61, (SubLObject)module0202.UNPROVIDED), var210, var20);
            }
            if (module0202.NIL != f12590(var61)) {
                final SubLObject var211 = module0205.f13132(var61);
                final SubLObject var212 = f12947(var61, var20);
                final SubLObject var213 = conses_high.union(var210, var212, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
                SubLObject var214 = (SubLObject)module0202.ZERO_INTEGER;
                final SubLObject var215 = f12707(var61, var20);
                SubLObject var216 = (SubLObject)module0202.NIL;
                if (module0202.NIL != var215 && module0202.NIL == module0004.f104(var215, var213, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
                    final SubLObject var217 = var215;
                    if (module0202.NIL == conses_high.member(var217, var216, Symbols.symbol_function((SubLObject)module0202.EQL), Symbols.symbol_function((SubLObject)module0202.IDENTITY))) {
                        var216 = (SubLObject)ConsesLow.cons(var217, var216);
                    }
                }
                SubLObject var219;
                final SubLObject var218 = var219 = module0205.f13180(var61, (SubLObject)module0202.$ic33$);
                SubLObject var220 = (SubLObject)module0202.NIL;
                var220 = var219.first();
                while (module0202.NIL != var219) {
                    if (module0202.NIL == module0004.f104(var220, var213, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
                        if (module0202.NIL == module0035.f2014(var220) || module0202.NIL == conses_high.subsetp(var220, var213, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
                            if (module0202.NIL == module0279.f18486(var211, var214, (SubLObject)module0202.UNPROVIDED)) {
                                if (module0202.NIL == Functions.funcall(var20, var220)) {
                                    if (module0202.NIL == module0144.f9455() || !var214.eql((SubLObject)module0202.TWO_INTEGER)) {
                                        if (module0202.NIL != module0210.f13589(var220)) {
                                            final SubLObject var221 = f12707(conses_high.second(var220), (SubLObject)module0202.UNPROVIDED);
                                            if (module0202.NIL == module0004.f104(var221, var213, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED) && module0202.NIL != Functions.funcall(var20, var221)) {
                                                final SubLObject var222 = var221;
                                                if (module0202.NIL == conses_high.member(var222, var216, Symbols.symbol_function((SubLObject)module0202.EQL), Symbols.symbol_function((SubLObject)module0202.IDENTITY))) {
                                                    var216 = (SubLObject)ConsesLow.cons(var222, var216);
                                                }
                                            }
                                        }
                                        else if (module0202.NIL != module0210.f13576(var220, var20)) {
                                            SubLObject var8_214 = f12952(var220, var213, var20);
                                            SubLObject var223 = (SubLObject)module0202.NIL;
                                            var223 = var8_214.first();
                                            while (module0202.NIL != var8_214) {
                                                final SubLObject var224 = var223;
                                                if (module0202.NIL == conses_high.member(var224, var216, Symbols.symbol_function((SubLObject)module0202.EQL), Symbols.symbol_function((SubLObject)module0202.IDENTITY))) {
                                                    var216 = (SubLObject)ConsesLow.cons(var224, var216);
                                                }
                                                var8_214 = var8_214.rest();
                                                var223 = var8_214.first();
                                            }
                                        }
                                        else if (module0202.NIL != module0210.f13606(var220, var20) || module0202.NIL != module0205.f13145(Symbols.symbol_function((SubLObject)module0202.$ic130$), var220, (SubLObject)module0202.NIL, (SubLObject)module0202.UNPROVIDED)) {
                                            SubLObject var8_215 = f12954(var220, var213, var20);
                                            SubLObject var223 = (SubLObject)module0202.NIL;
                                            var223 = var8_215.first();
                                            while (module0202.NIL != var8_215) {
                                                final SubLObject var224 = var223;
                                                if (module0202.NIL == conses_high.member(var224, var216, Symbols.symbol_function((SubLObject)module0202.EQL), Symbols.symbol_function((SubLObject)module0202.IDENTITY))) {
                                                    var216 = (SubLObject)ConsesLow.cons(var224, var216);
                                                }
                                                var8_215 = var8_215.rest();
                                                var223 = var8_215.first();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    var214 = Numbers.add(var214, (SubLObject)module0202.ONE_INTEGER);
                    var219 = var219.rest();
                    var220 = var219.first();
                }
                return Sequences.nreverse(var216);
            }
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12955(final SubLObject var1, SubLObject var209, SubLObject var20) {
        if (var209 == module0202.UNPROVIDED) {
            var209 = (SubLObject)module0202.NIL;
        }
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        return f12911(var1, var209, var20, (SubLObject)module0202.NIL);
    }
    
    public static SubLObject f12954(final SubLObject var81, SubLObject var209, SubLObject var20) {
        if (var209 == module0202.UNPROVIDED) {
            var209 = (SubLObject)module0202.NIL;
        }
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        final SubLThread var210 = SubLProcess.currentSubLThread();
        if (module0202.NIL == f12953(var81)) {
            return (SubLObject)module0202.NIL;
        }
        SubLObject var211 = (SubLObject)module0202.NIL;
        final SubLObject var212 = f12707(var81, (SubLObject)module0202.UNPROVIDED);
        if (module0202.NIL != var212 && module0202.NIL == module0004.f104(var212, var209, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
            final SubLObject var213 = var212;
            if (module0202.NIL == conses_high.member(var213, var211, Symbols.symbol_function((SubLObject)module0202.EQL), Symbols.symbol_function((SubLObject)module0202.IDENTITY))) {
                var211 = (SubLObject)ConsesLow.cons(var213, var211);
            }
        }
        if (module0202.NIL == module0004.f104(var81, var209, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
            if (module0202.NIL != Functions.funcall(var20, var81)) {
                return var211;
            }
            if (!var81.isAtom()) {
                if (module0202.NIL != f12592(var81)) {
                    return ConsesLow.append(var211, f12954(module0205.f13379(var81, (SubLObject)module0202.UNPROVIDED), var209, var20));
                }
                if (module0202.NIL != f12595(var81) || module0202.NIL != f12594(var81)) {
                    SubLObject var214 = module0205.f13377(var81, (SubLObject)module0202.$ic33$);
                    SubLObject var215 = (SubLObject)module0202.NIL;
                    var215 = var214.first();
                    while (module0202.NIL != var214) {
                        SubLObject var8_216 = f12954(var215, var209, var20);
                        SubLObject var216 = (SubLObject)module0202.NIL;
                        var216 = var8_216.first();
                        while (module0202.NIL != var8_216) {
                            final SubLObject var217 = var216;
                            if (module0202.NIL == conses_high.member(var217, var211, Symbols.symbol_function((SubLObject)module0202.EQL), Symbols.symbol_function((SubLObject)module0202.IDENTITY))) {
                                var211 = (SubLObject)ConsesLow.cons(var217, var211);
                            }
                            var8_216 = var8_216.rest();
                            var216 = var8_216.first();
                        }
                        var214 = var214.rest();
                        var215 = var214.first();
                    }
                    return var211;
                }
                if (module0202.NIL != f12597(var81) || module0202.NIL != f12648(var81)) {
                    var211 = ConsesLow.append(var211, Sequences.nreverse(f12954(module0205.f13379(var81, (SubLObject)module0202.UNPROVIDED), var209, var20)));
                    SubLObject var214 = f12954(module0205.f13380(var81, (SubLObject)module0202.UNPROVIDED), var209, var20);
                    SubLObject var218 = (SubLObject)module0202.NIL;
                    var218 = var214.first();
                    while (module0202.NIL != var214) {
                        final SubLObject var219 = var218;
                        if (module0202.NIL == conses_high.member(var219, var211, Symbols.symbol_function((SubLObject)module0202.EQL), Symbols.symbol_function((SubLObject)module0202.IDENTITY))) {
                            var211 = (SubLObject)ConsesLow.cons(var219, var211);
                        }
                        var214 = var214.rest();
                        var218 = var214.first();
                    }
                    return Sequences.nreverse(var211);
                }
                if (module0202.NIL != f12627(var81)) {
                    return ConsesLow.append(var211, f12954(f12668(var81), (SubLObject)ConsesLow.cons(f12744(var81), var209), var20));
                }
                if (module0202.NIL != f12903(var81)) {
                    final SubLObject var220 = f12906(var81);
                    final SubLObject var221 = module0269.f17707(var220);
                    final SubLObject var222 = f12887(var81);
                    SubLObject var137_217 = (SubLObject)module0202.NIL;
                    final SubLObject var223 = (SubLObject)((module0202.NIL != var221) ? var220 : module0202.NIL);
                    final SubLObject var224 = module0147.$g2094$.currentBinding(var210);
                    final SubLObject var225 = module0147.$g2095$.currentBinding(var210);
                    try {
                        module0147.$g2094$.bind(module0147.f9531(var223), var210);
                        module0147.$g2095$.bind(module0147.f9534(var223), var210);
                        var137_217 = f12954(var222, var209, var20);
                    }
                    finally {
                        module0147.$g2095$.rebind(var225, var210);
                        module0147.$g2094$.rebind(var224, var210);
                    }
                    if (module0202.NIL == var221) {
                        var137_217 = ConsesLow.append(var137_217, f12952(var220, var209, var20));
                    }
                    return var137_217;
                }
                if (module0202.NIL != f12925(var81)) {
                    return ConsesLow.append(var211, f12950(var81, var209, var20));
                }
                if (module0202.NIL != f12590(var81) && module0202.NIL != Functions.funcall(var20, module0205.f13378(var81))) {
                    return ConsesLow.append(var211, f12950(var81, var209, var20));
                }
                if (module0202.NIL != f12932(var81)) {
                    return ConsesLow.append(var211, f12951(var81, var209, var20));
                }
            }
        }
        return var211;
    }
    
    public static SubLObject f12956(final SubLObject var36, final SubLObject var81) {
        return module0004.f104(var36, f12957(var81, (SubLObject)module0202.UNPROVIDED), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12958(final SubLObject var36, final SubLObject var81) {
        return module0004.f104(var36, f12918(var81, (SubLObject)module0202.UNPROVIDED), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12959(final SubLObject var36, final SubLObject var101) {
        SubLObject var102 = module0232.f15306(var101);
        SubLObject var103 = (SubLObject)module0202.NIL;
        var103 = var102.first();
        while (module0202.NIL != var102) {
            if (module0202.NIL != module0004.f104(var36, f12957(var103, (SubLObject)module0202.UNPROVIDED), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
                return (SubLObject)module0202.T;
            }
            var102 = var102.rest();
            var103 = var102.first();
        }
        var102 = module0232.f15308(var101);
        var103 = (SubLObject)module0202.NIL;
        var103 = var102.first();
        while (module0202.NIL != var102) {
            if (module0202.NIL != module0004.f104(var36, f12957(var103, (SubLObject)module0202.UNPROVIDED), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
                return (SubLObject)module0202.T;
            }
            var102 = var102.rest();
            var103 = var102.first();
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12960(final SubLObject var36, final SubLObject var101) {
        SubLObject var102 = module0232.f15306(var101);
        SubLObject var103 = (SubLObject)module0202.NIL;
        var103 = var102.first();
        while (module0202.NIL != var102) {
            if (module0202.NIL != module0004.f104(var36, f12918(var103, (SubLObject)module0202.UNPROVIDED), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
                return (SubLObject)module0202.T;
            }
            var102 = var102.rest();
            var103 = var102.first();
        }
        var102 = module0232.f15308(var101);
        var103 = (SubLObject)module0202.NIL;
        var103 = var102.first();
        while (module0202.NIL != var102) {
            if (module0202.NIL != module0004.f104(var36, f12918(var103, (SubLObject)module0202.UNPROVIDED), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
                return (SubLObject)module0202.T;
            }
            var102 = var102.rest();
            var103 = var102.first();
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12961(final SubLObject var1, final SubLObject var6, final SubLObject var126) {
        final SubLObject var127 = module0205.f13134(var1, var126, (SubLObject)module0202.UNPROVIDED);
        return Equality.equal(var6, var127);
    }
    
    public static SubLObject f12962(final SubLObject var6, final SubLObject var1) {
        SubLObject var7 = (SubLObject)module0202.NIL;
        SubLObject var8 = (SubLObject)module0202.ZERO_INTEGER;
        final SubLObject var9 = module0205.f13207(var1, (SubLObject)module0202.$ic33$);
        SubLObject var10;
        SubLObject var11;
        for (var10 = (SubLObject)module0202.NIL, var10 = var9; module0202.NIL == var7 && module0202.NIL != var10; var10 = var10.rest()) {
            var11 = var10.first();
            var8 = Numbers.add(var8, (SubLObject)module0202.ONE_INTEGER);
            if (var6.equal(var11)) {
                var7 = var8;
            }
        }
        return var7;
    }
    
    public static SubLObject f12963(final SubLObject var1) {
        final SubLObject var2 = f12911(var1, (SubLObject)module0202.NIL, (SubLObject)module0202.$ic44$, (SubLObject)module0202.T);
        final SubLObject var3 = f12911(var1, (SubLObject)module0202.NIL, (SubLObject)module0202.$ic44$, (SubLObject)module0202.NIL);
        final SubLObject var4 = conses_high.nset_difference(var2, var3, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
        return conses_high.nintersection(var4, var3, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12964(final SubLObject var1) {
        final SubLObject var2 = f12707(var1, (SubLObject)module0202.UNPROVIDED);
        if (module0202.NIL != var2) {
            SubLObject var4;
            final SubLObject var3 = var4 = module0205.f13207(var1, (SubLObject)module0202.$ic33$);
            SubLObject var5 = (SubLObject)module0202.NIL;
            var5 = var4.first();
            while (module0202.NIL != var4) {
                if (var5.eql(var2)) {
                    return (SubLObject)module0202.T;
                }
                var4 = var4.rest();
                var5 = var4.first();
            }
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12918(final SubLObject var1, SubLObject var20) {
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        return f12943(var1, var20, (SubLObject)module0202.NIL);
    }
    
    public static SubLObject f12957(final SubLObject var1, SubLObject var20) {
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        final SubLObject var21 = f12707(var1, var20);
        SubLObject var22 = (SubLObject)((module0202.NIL != var21) ? ConsesLow.list(var21) : module0202.NIL);
        if (module0202.NIL != f12590(var1)) {
            SubLObject var24;
            final SubLObject var23 = var24 = module0205.f13180(var1, (SubLObject)module0202.$ic33$);
            SubLObject var25 = (SubLObject)module0202.NIL;
            var25 = var24.first();
            while (module0202.NIL != var24) {
                var22 = ConsesLow.append(var22, f12957(var25, (SubLObject)module0202.UNPROVIDED));
                var24 = var24.rest();
                var25 = var24.first();
            }
        }
        return module0035.f2269(var22, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12933(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL == f12716(var1));
    }
    
    public static SubLObject f12965(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL == module0205.f13215((SubLObject)module0202.$ic131$, var1, (SubLObject)module0202.NIL, (SubLObject)module0202.UNPROVIDED));
    }
    
    public static SubLObject f12966(final SubLObject var81, SubLObject var209, SubLObject var177, SubLObject var196) {
        if (var209 == module0202.UNPROVIDED) {
            var209 = (SubLObject)module0202.NIL;
        }
        if (var177 == module0202.UNPROVIDED) {
            var177 = (SubLObject)module0202.$ic44$;
        }
        if (var196 == module0202.UNPROVIDED) {
            var196 = (SubLObject)module0202.T;
        }
        assert module0202.NIL != f12597(var81) : var81;
        final SubLObject var210 = module0205.f13379(var81, (SubLObject)module0202.UNPROVIDED);
        final SubLObject var211 = f12911(var210, var209, var177, var196);
        final SubLObject var212 = module0205.f13380(var81, (SubLObject)module0202.UNPROVIDED);
        final SubLObject var213 = f12911(var212, var209, var177, var196);
        return conses_high.set_difference(var213, var211, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12911(final SubLObject var81, SubLObject var209, SubLObject var177, SubLObject var196) {
        if (var209 == module0202.UNPROVIDED) {
            var209 = (SubLObject)module0202.NIL;
        }
        if (var177 == module0202.UNPROVIDED) {
            var177 = (SubLObject)module0202.$ic44$;
        }
        if (var196 == module0202.UNPROVIDED) {
            var196 = (SubLObject)module0202.T;
        }
        if (module0202.NIL != var196 && module0202.NIL == module0035.f2439((SubLObject)module0202.$ic133$, var81, (SubLObject)module0202.UNPROVIDED) && module0202.NIL == module0035.f2439((SubLObject)module0202.$ic134$, var81, (SubLObject)module0202.UNPROVIDED) && module0202.NIL == module0035.f2439((SubLObject)module0202.$ic135$, var81, (SubLObject)module0202.UNPROVIDED)) {
            return conses_high.set_difference(module0205.f13183(var81, var177, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED), var209, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
        }
        return f12967(var81, var209, var177, var196);
    }
    
    public static SubLObject f12967(final SubLObject var81, SubLObject var209, SubLObject var177, SubLObject var196) {
        if (var209 == module0202.UNPROVIDED) {
            var209 = (SubLObject)module0202.NIL;
        }
        if (var177 == module0202.UNPROVIDED) {
            var177 = (SubLObject)module0202.$ic44$;
        }
        if (var196 == module0202.UNPROVIDED) {
            var196 = (SubLObject)module0202.T;
        }
        final SubLThread var210 = SubLProcess.currentSubLThread();
        if (module0202.NIL == module0146.$g1984$.getDynamicValue(var210) || module0202.NIL != module0205.f13145(Symbols.symbol_function((SubLObject)module0202.$ic136$), var81, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
            if (module0202.NIL == module0004.f104(var81, var209, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
                if (module0202.NIL != Functions.funcall(var177, var81)) {
                    return (SubLObject)ConsesLow.list(var81);
                }
                if (!var81.isAtom()) {
                    if (module0202.NIL != module0035.f2439(var177, var81, (SubLObject)module0202.UNPROVIDED)) {
                        if (module0202.NIL != f12592(var81)) {
                            return f12967(module0205.f13379(var81, (SubLObject)module0202.UNPROVIDED), var209, var177, var196);
                        }
                        if (module0202.NIL != f12595(var81) || module0202.NIL != f12594(var81)) {
                            SubLObject var211 = (SubLObject)module0202.NIL;
                            SubLObject var212 = module0205.f13377(var81, (SubLObject)((module0202.NIL != var196) ? module0202.$ic81$ : module0202.$ic33$));
                            SubLObject var213 = (SubLObject)module0202.NIL;
                            var213 = var212.first();
                            while (module0202.NIL != var212) {
                                SubLObject var8_226 = f12967(var213, var209, var177, var196);
                                SubLObject var214 = (SubLObject)module0202.NIL;
                                var214 = var8_226.first();
                                while (module0202.NIL != var8_226) {
                                    final SubLObject var215 = var214;
                                    if (module0202.NIL == conses_high.member(var215, var211, Symbols.symbol_function((SubLObject)module0202.EQL), Symbols.symbol_function((SubLObject)module0202.IDENTITY))) {
                                        var211 = (SubLObject)ConsesLow.cons(var215, var211);
                                    }
                                    var8_226 = var8_226.rest();
                                    var214 = var8_226.first();
                                }
                                var212 = var212.rest();
                                var213 = var212.first();
                            }
                            return var211;
                        }
                        if (module0202.NIL != f12602(var81) || module0202.NIL != f12648(var81)) {
                            SubLObject var211 = Sequences.nreverse(f12967(module0205.f13379(var81, (SubLObject)module0202.UNPROVIDED), var209, var177, var196));
                            SubLObject var212 = f12967(module0205.f13380(var81, (SubLObject)module0202.UNPROVIDED), var209, var177, var196);
                            SubLObject var216 = (SubLObject)module0202.NIL;
                            var216 = var212.first();
                            while (module0202.NIL != var212) {
                                final SubLObject var217 = var216;
                                if (module0202.NIL == conses_high.member(var217, var211, Symbols.symbol_function((SubLObject)module0202.EQL), Symbols.symbol_function((SubLObject)module0202.IDENTITY))) {
                                    var211 = (SubLObject)ConsesLow.cons(var217, var211);
                                }
                                var212 = var212.rest();
                                var216 = var212.first();
                            }
                            return Sequences.nreverse(var211);
                        }
                        if (module0202.NIL != f12620(var81)) {
                            return f12967(f12668(var81), (SubLObject)ConsesLow.cons(f12744(var81), var209), var177, var196);
                        }
                        if (module0202.NIL != module0206.f13442(var81)) {
                            SubLObject var211 = Sequences.nreverse(f12967(f12668(var81), (SubLObject)ConsesLow.cons(f12744(var81), var209), var177, var196));
                            final SubLObject var218 = f12748(var81);
                            if (module0202.NIL != module0201.f12580(var218)) {
                                var211 = (SubLObject)ConsesLow.cons(var218, var211);
                            }
                            return Sequences.nreverse(var211);
                        }
                        if (module0202.NIL != f12903(var81)) {
                            final SubLObject var219 = f12906(var81);
                            final SubLObject var220 = module0269.f17707(var219);
                            final SubLObject var221 = f12887(var81);
                            SubLObject var222 = (SubLObject)module0202.NIL;
                            final SubLObject var223 = (SubLObject)((module0202.NIL != var220) ? var219 : module0202.NIL);
                            final SubLObject var224 = module0147.$g2094$.currentBinding(var210);
                            final SubLObject var225 = module0147.$g2095$.currentBinding(var210);
                            try {
                                module0147.$g2094$.bind(module0147.f9531(var223), var210);
                                module0147.$g2095$.bind(module0147.f9534(var223), var210);
                                var222 = f12967(var221, var209, var177, var196);
                            }
                            finally {
                                module0147.$g2095$.rebind(var225, var210);
                                module0147.$g2094$.rebind(var224, var210);
                            }
                            if (module0202.NIL == var220) {
                                var222 = ConsesLow.append(var222, f12968(var219, var209, var177, var196));
                            }
                            return var222;
                        }
                        if (module0202.NIL != f12925(var81)) {
                            return f12693(var81, var209, var177, var196);
                        }
                        if (module0202.NIL != f12590(var81) && module0202.NIL != Functions.funcall(var177, module0205.f13378(var81))) {
                            return f12693(var81, var209, var177, var196);
                        }
                        SubLObject var211 = (SubLObject)module0202.NIL;
                        SubLObject var212 = module0205.f13188(var81, var177, (SubLObject)module0202.NIL, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
                        SubLObject var216 = (SubLObject)module0202.NIL;
                        var216 = var212.first();
                        while (module0202.NIL != var212) {
                            if (module0202.NIL == module0004.f104(var216, var209, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
                                final SubLObject var217 = var216;
                                if (module0202.NIL == conses_high.member(var217, var211, Symbols.symbol_function((SubLObject)module0202.EQL), Symbols.symbol_function((SubLObject)module0202.IDENTITY))) {
                                    var211 = (SubLObject)ConsesLow.cons(var217, var211);
                                }
                            }
                            var212 = var212.rest();
                            var216 = var212.first();
                        }
                        return var211;
                    }
                }
            }
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12969(final SubLObject var159, SubLObject var209, SubLObject var20, SubLObject var196) {
        if (var209 == module0202.UNPROVIDED) {
            var209 = (SubLObject)module0202.NIL;
        }
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        if (var196 == module0202.UNPROVIDED) {
            var196 = (SubLObject)module0202.T;
        }
        SubLObject var210 = (SubLObject)module0202.NIL;
        if (var159.isCons()) {
            SubLObject var211 = var159;
            SubLObject var212 = (SubLObject)module0202.NIL;
            var212 = var211.first();
            while (module0202.NIL != var211) {
                var210 = module0035.f2216(var210, f12693(var212, var209, var20, var196), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
                var211 = var211.rest();
                var212 = var211.first();
            }
        }
        else if (module0202.NIL == module0004.f104(var159, var209, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
            if (module0202.NIL != Functions.funcall(var20, var159)) {
                var210 = (SubLObject)ConsesLow.cons(var159, var210);
            }
        }
        return var210;
    }
    
    public static SubLObject f12693(final SubLObject var115, SubLObject var210, SubLObject var20, SubLObject var196) {
        if (var210 == module0202.UNPROVIDED) {
            var210 = (SubLObject)module0202.NIL;
        }
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        if (var196 == module0202.UNPROVIDED) {
            var196 = (SubLObject)module0202.T;
        }
        return f12970(var115, var210, var20, var196);
    }
    
    public static SubLObject f12968(final SubLObject var201, SubLObject var210, SubLObject var20, SubLObject var196) {
        if (var210 == module0202.UNPROVIDED) {
            var210 = (SubLObject)module0202.NIL;
        }
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        if (var196 == module0202.UNPROVIDED) {
            var196 = (SubLObject)module0202.T;
        }
        return f12970(var201, var210, var20, var196);
    }
    
    public static SubLObject f12970(final SubLObject var61, SubLObject var210, SubLObject var20, SubLObject var196) {
        if (var210 == module0202.UNPROVIDED) {
            var210 = (SubLObject)module0202.NIL;
        }
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        if (var196 == module0202.UNPROVIDED) {
            var196 = (SubLObject)module0202.T;
        }
        final SubLThread var211 = SubLProcess.currentSubLThread();
        if (module0202.NIL == f12641(var61)) {
            if (module0202.NIL != f12640(var61)) {
                return f12970(module0205.f13203(var61, (SubLObject)module0202.UNPROVIDED), var210, var20, var196);
            }
            if (module0202.NIL != module0206.f13473(var61)) {
                SubLObject var212 = (SubLObject)module0202.NIL;
                final SubLObject var213 = module0146.$g1984$.currentBinding(var211);
                try {
                    module0146.$g1984$.bind((SubLObject)module0202.NIL, var211);
                    var212 = f12970(module0205.f13203(var61, (SubLObject)module0202.UNPROVIDED), var210, var20, var196);
                }
                finally {
                    module0146.$g1984$.rebind(var213, var211);
                }
                return var212;
            }
            if (module0202.NIL == module0004.f104(var61, var210, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
                if (module0202.NIL == module0146.$g1984$.getDynamicValue(var211) && module0202.NIL != Functions.funcall(var20, var61)) {
                    return (SubLObject)ConsesLow.list(var61);
                }
                if (module0202.NIL != module0206.f13472(var61)) {
                    SubLObject var212 = (SubLObject)module0202.NIL;
                    final SubLObject var213 = module0146.$g1984$.currentBinding(var211);
                    try {
                        module0146.$g1984$.bind((SubLObject)module0202.T, var211);
                        var212 = f12970(module0205.f13203(var61, (SubLObject)module0202.UNPROVIDED), var210, var20, var196);
                    }
                    finally {
                        module0146.$g1984$.rebind(var213, var211);
                    }
                    return var212;
                }
                if (module0202.NIL != f12592(var61)) {
                    return f12970(module0205.f13203(var61, (SubLObject)module0202.UNPROVIDED), var210, var20, var196);
                }
                if (module0202.NIL != f12590(var61)) {
                    final SubLObject var214 = module0205.f13132(var61);
                    final SubLObject var215 = f12947(var61, var20);
                    final SubLObject var216 = conses_high.union(var210, var215, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
                    SubLObject var217 = (SubLObject)module0202.NIL;
                    final SubLObject var218 = module0205.f13180(var61, (SubLObject)((module0202.NIL != var196) ? module0202.$ic81$ : module0202.$ic33$));
                    SubLObject var219 = (SubLObject)module0202.NIL;
                    SubLObject var220 = (SubLObject)module0202.NIL;
                    SubLObject var221 = (SubLObject)module0202.NIL;
                    var219 = var218;
                    var220 = var219.first();
                    for (var221 = (SubLObject)module0202.ZERO_INTEGER; module0202.NIL != var219; var219 = var219.rest(), var220 = var219.first(), var221 = module0048.f_1X(var221)) {
                        if (module0202.NIL == module0004.f104(var220, var216, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
                            if (module0202.NIL == module0035.f2014(var220) || module0202.NIL == conses_high.subsetp(var220, var216, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
                                if ((module0202.NIL != module0018.$g699$.getDynamicValue(var211) && module0202.NIL != module0146.$g2007$.getDynamicValue(var211)) || module0202.NIL == module0279.f18486(var214, var221, (SubLObject)module0202.UNPROVIDED)) {
                                    if (module0202.NIL == module0146.$g1984$.getDynamicValue(var211) && module0202.NIL != Functions.funcall(var20, var220)) {
                                        final SubLObject var222 = var220;
                                        if (module0202.NIL == conses_high.member(var222, var217, Symbols.symbol_function((SubLObject)module0202.EQL), Symbols.symbol_function((SubLObject)module0202.IDENTITY))) {
                                            var217 = (SubLObject)ConsesLow.cons(var222, var217);
                                        }
                                    }
                                    else if (module0202.NIL == module0144.f9455() || !var221.eql((SubLObject)module0202.TWO_INTEGER)) {
                                        if (module0202.NIL == module0146.$g1984$.getDynamicValue(var211) && module0202.NIL != module0210.f13589(var220)) {
                                            SubLObject var223 = conses_high.second(var220);
                                            SubLObject var224 = (SubLObject)module0202.NIL;
                                            var224 = var223.first();
                                            while (module0202.NIL != var223) {
                                                if (module0202.NIL == module0004.f104(var224, var216, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED) && module0202.NIL != Functions.funcall(var20, var224)) {
                                                    final SubLObject var225 = var224;
                                                    if (module0202.NIL == conses_high.member(var225, var217, Symbols.symbol_function((SubLObject)module0202.EQL), Symbols.symbol_function((SubLObject)module0202.IDENTITY))) {
                                                        var217 = (SubLObject)ConsesLow.cons(var225, var217);
                                                    }
                                                }
                                                var223 = var223.rest();
                                                var224 = var223.first();
                                            }
                                        }
                                        else if (module0202.NIL != module0210.f13576(var220, var20)) {
                                            SubLObject var223 = f12968(var220, var216, var20, var196);
                                            SubLObject var224 = (SubLObject)module0202.NIL;
                                            var224 = var223.first();
                                            while (module0202.NIL != var223) {
                                                final SubLObject var225 = var224;
                                                if (module0202.NIL == conses_high.member(var225, var217, Symbols.symbol_function((SubLObject)module0202.EQL), Symbols.symbol_function((SubLObject)module0202.IDENTITY))) {
                                                    var217 = (SubLObject)ConsesLow.cons(var225, var217);
                                                }
                                                var223 = var223.rest();
                                                var224 = var223.first();
                                            }
                                        }
                                        else if (module0202.NIL != module0210.f13606(var220, var20) || module0202.NIL != module0205.f13145(Symbols.symbol_function((SubLObject)module0202.$ic130$), var220, (SubLObject)module0202.NIL, (SubLObject)module0202.UNPROVIDED)) {
                                            SubLObject var223 = f12967(var220, var216, var20, var196);
                                            SubLObject var224 = (SubLObject)module0202.NIL;
                                            var224 = var223.first();
                                            while (module0202.NIL != var223) {
                                                final SubLObject var225 = var224;
                                                if (module0202.NIL == conses_high.member(var225, var217, Symbols.symbol_function((SubLObject)module0202.EQL), Symbols.symbol_function((SubLObject)module0202.IDENTITY))) {
                                                    var217 = (SubLObject)ConsesLow.cons(var225, var217);
                                                }
                                                var223 = var223.rest();
                                                var224 = var223.first();
                                            }
                                        }
                                        else if (module0202.NIL == module0146.$g1984$.getDynamicValue(var211)) {
                                            SubLObject var223 = module0205.f13183(var220, var20, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
                                            SubLObject var224 = (SubLObject)module0202.NIL;
                                            var224 = var223.first();
                                            while (module0202.NIL != var223) {
                                                if (module0202.NIL == module0004.f104(var224, var216, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
                                                    final SubLObject var225 = var224;
                                                    if (module0202.NIL == conses_high.member(var225, var217, Symbols.symbol_function((SubLObject)module0202.EQL), Symbols.symbol_function((SubLObject)module0202.IDENTITY))) {
                                                        var217 = (SubLObject)ConsesLow.cons(var225, var217);
                                                    }
                                                }
                                                var223 = var223.rest();
                                                var224 = var223.first();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return Sequences.nreverse(var217);
                }
            }
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12971(final SubLObject var61, SubLObject var20) {
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        final SubLObject var62 = f12946(var61, var20, (SubLObject)module0202.UNPROVIDED);
        final SubLObject var63 = (SubLObject)((module0202.NIL != var62) ? f12970(var61, (SubLObject)module0202.NIL, var20, (SubLObject)module0202.UNPROVIDED) : module0202.NIL);
        SubLObject var64 = (SubLObject)module0202.NIL;
        SubLObject var65 = var62;
        SubLObject var66 = (SubLObject)module0202.NIL;
        var66 = var65.first();
        while (module0202.NIL != var65) {
            if (module0202.NIL == module0004.f104(var66, var63, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
                var64 = (SubLObject)ConsesLow.cons(var66, var64);
            }
            var65 = var65.rest();
            var66 = var65.first();
        }
        return Sequences.nreverse(var64);
    }
    
    public static SubLObject f12972(final SubLObject var19, SubLObject var20) {
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        if (module0202.NIL != f12590(var19)) {
            return f12970(var19, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
        }
        if (module0202.NIL != Functions.funcall(var20, var19)) {
            return (SubLObject)ConsesLow.list(var19);
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12973(final SubLObject var228, final SubLObject var229, SubLObject var20) {
        if (var20 == module0202.UNPROVIDED) {
            var20 = Symbols.symbol_function((SubLObject)module0202.$ic51$);
        }
        return conses_high.nintersection(f12972(var228, var20), f12972(var229, var20), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12974(final SubLObject var1) {
        return Sequences.remove_duplicates(f12975(var1), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12975(final SubLObject var1) {
        if (!var1.isAtom()) {
            if (module0202.NIL != f12592(var1)) {
                return f12975(module0205.f13203(var1, (SubLObject)module0202.UNPROVIDED));
            }
            if (module0202.NIL != f12595(var1) || module0202.NIL != f12594(var1)) {
                return module0035.f2077((SubLObject)module0202.$ic137$, module0205.f13207(var1, (SubLObject)module0202.$ic81$));
            }
            if (module0202.NIL != f12597(var1)) {
                return ConsesLow.nconc(f12975(module0205.f13203(var1, (SubLObject)module0202.UNPROVIDED)), f12975(module0205.f13204(var1, (SubLObject)module0202.UNPROVIDED)));
            }
            if (module0202.NIL != f12606(var1) || module0202.NIL != f12604(var1)) {
                return (SubLObject)ConsesLow.cons(module0205.f13203(var1, (SubLObject)module0202.UNPROVIDED), f12975(module0205.f13204(var1, (SubLObject)module0202.UNPROVIDED)));
            }
            if (module0202.NIL != f12623(var1)) {
                return (SubLObject)ConsesLow.cons(module0205.f13204(var1, (SubLObject)module0202.UNPROVIDED), f12975(module0205.f13205(var1, (SubLObject)module0202.UNPROVIDED)));
            }
            if (module0202.NIL != f12590(var1)) {
                return module0035.f2077((SubLObject)module0202.$ic137$, var1);
            }
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12976(final SubLObject var46, final SubLObject var36, final SubLObject var1) {
        if (var1.eql(var36)) {
            return var46;
        }
        if (module0202.NIL != f12977(var1) && module0202.NIL != conses_high.member(var36, f12947(var1, (SubLObject)module0202.UNPROVIDED), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
            return var1;
        }
        if (module0202.NIL != f12590(var1)) {
            SubLObject var47 = (SubLObject)module0202.NIL;
            SubLObject var49;
            final SubLObject var48 = var49 = module0205.f13180(var1, (SubLObject)module0202.$ic33$);
            SubLObject var50 = (SubLObject)module0202.NIL;
            var50 = var49.first();
            while (module0202.NIL != var49) {
                var47 = (SubLObject)ConsesLow.cons(f12976(var46, var36, var50), var47);
                var49 = var49.rest();
                var50 = var49.first();
            }
            var47 = Sequences.nreverse(var47);
            return f12720(var47.first(), var47.rest(), f12976(var46, var36, f12707(var1, (SubLObject)module0202.UNPROVIDED)));
        }
        return var1;
    }
    
    public static SubLObject f12978(final SubLObject var121) {
        return module0256.f16576(var121, module0202.$ic138$, module0132.$g1555$.getGlobalValue(), (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12979(final SubLObject var121) {
        return module0256.f16576(var121, module0202.$ic139$, module0132.$g1555$.getGlobalValue(), (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f12977(final SubLObject var19) {
        if (module0202.NIL != f12932(var19)) {
            final SubLObject var20 = module0205.f13136(var19);
            return module0269.f17794(var20);
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12980(final SubLObject var1, final SubLObject var230) {
        return f12981(module0205.f13136(var1), var230);
    }
    
    public static SubLObject f12981(final SubLObject var231, final SubLObject var230) {
        if (var231.eql(module0202.$ic100$) && var230.eql((SubLObject)module0202.TWO_INTEGER)) {
            return (SubLObject)module0202.T;
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12982(final SubLObject var231, final SubLObject var230) {
        if (var230.eql((SubLObject)module0202.ONE_INTEGER)) {
            return module0004.f104(var231, module0202.$g2311$.getGlobalValue(), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
        }
        if (var230.eql((SubLObject)module0202.TWO_INTEGER)) {
            return module0004.f104(var231, module0202.$g2312$.getGlobalValue(), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12983(final SubLObject var232, SubLObject var233, SubLObject var234) {
        if (var233 == module0202.UNPROVIDED) {
            var233 = (SubLObject)module0202.NIL;
        }
        if (var234 == module0202.UNPROVIDED) {
            var234 = (SubLObject)module0202.NIL;
        }
        SubLObject var235 = (SubLObject)module0202.$ic142$;
        if (module0202.NIL != var233) {
            var235 = Sequences.cconcatenate(var235, (SubLObject)module0202.$ic143$);
        }
        if (module0202.NIL != var234) {
            var235 = Sequences.cconcatenate(var235, (SubLObject)module0202.$ic144$);
        }
        if (module0202.NIL != var234 && module0202.NIL == var233) {
            Errors.warn(var235, var232, var234);
        }
        else {
            Errors.warn(var235, var232, var233, var234);
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12747(final SubLObject var236, final SubLObject var237, SubLObject var5, SubLObject var104, SubLObject var105) {
        if (var5 == module0202.UNPROVIDED) {
            var5 = (SubLObject)module0202.NIL;
        }
        if (var104 == module0202.UNPROVIDED) {
            var104 = (SubLObject)module0202.NIL;
        }
        if (var105 == module0202.UNPROVIDED) {
            var105 = (SubLObject)module0202.NIL;
        }
        final SubLThread var238 = SubLProcess.currentSubLThread();
        if (module0146.$g1989$.getDynamicValue(var238).numGE(var236)) {
            Errors.cerror((SubLObject)module0202.$ic145$, var237, var5, var104, var105);
        }
        else if (Numbers.add((SubLObject)module0202.TWO_INTEGER, module0146.$g1989$.getDynamicValue(var238)).numGE(var236)) {
            Errors.warn(var237, var5, var104, var105);
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12984(final SubLObject var236, final SubLObject var237, SubLObject var5, SubLObject var104, SubLObject var105) {
        if (var5 == module0202.UNPROVIDED) {
            var5 = (SubLObject)module0202.NIL;
        }
        if (var104 == module0202.UNPROVIDED) {
            var104 = (SubLObject)module0202.NIL;
        }
        if (var105 == module0202.UNPROVIDED) {
            var105 = (SubLObject)module0202.NIL;
        }
        if (module0202.NIL != f12985(var236)) {
            Errors.warn(var237, var5, var104, var105);
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12985(SubLObject var236) {
        if (var236 == module0202.UNPROVIDED) {
            var236 = (SubLObject)module0202.ONE_INTEGER;
        }
        final SubLThread var237 = SubLProcess.currentSubLThread();
        return Numbers.numGE(module0146.$g1989$.getDynamicValue(var237), var236);
    }
    
    public static SubLObject f12986(SubLObject var19) {
        while (module0202.NIL != f12606(var19)) {
            var19 = f12668(var19);
        }
        return var19;
    }
    
    public static SubLObject f12987(SubLObject var19) {
        var19 = module0282.f18690(var19);
        var19 = f12988(var19, f12911(var19, (SubLObject)module0202.NIL, (SubLObject)module0202.$ic146$, (SubLObject)module0202.UNPROVIDED));
        var19 = f12989(var19);
        var19 = f12990(var19);
        var19 = f12991(var19);
        return var19;
    }
    
    public static SubLObject f12988(final SubLObject var19, final SubLObject var238) {
        final SubLThread var239 = SubLProcess.currentSubLThread();
        if (module0202.NIL != f12606(var19)) {
            final SubLObject var240 = f12744(var19);
            SubLObject var241 = f12668(var19);
            SubLObject var242 = (SubLObject)module0202.NIL;
            if (module0202.NIL == var242) {
                SubLObject var243 = var238;
                SubLObject var244 = (SubLObject)module0202.NIL;
                var244 = var243.first();
                while (module0202.NIL == var242 && module0202.NIL != var243) {
                    if (module0202.NIL != f12992(var241, var240, var244)) {
                        var242 = var244;
                    }
                    var243 = var243.rest();
                    var244 = var243.first();
                }
            }
            if (module0202.NIL != var242) {
                var241 = conses_high.sublis(conses_high.acons(var240, var242, (SubLObject)module0202.NIL), var241, Symbols.symbol_function((SubLObject)module0202.EQUAL), (SubLObject)module0202.UNPROVIDED);
                var239.resetMultipleValues();
                final SubLObject var245 = f12988(var241, var238);
                final SubLObject var246 = var239.secondMultipleValue();
                var239.resetMultipleValues();
                return Values.values(var245, conses_high.acons(var240, var242, var246));
            }
            var239.resetMultipleValues();
            final SubLObject var245 = f12988(var241, (SubLObject)ConsesLow.cons(var240, var238));
            final SubLObject var246 = var239.secondMultipleValue();
            var239.resetMultipleValues();
            return Values.values(f12776(var240, var245), var246);
        }
        else {
            if (module0202.NIL != f12604(var19)) {
                final SubLObject var240 = f12744(var19);
                final SubLObject var241 = f12668(var19);
                var239.resetMultipleValues();
                final SubLObject var247 = f12988(var241, (SubLObject)ConsesLow.cons(var240, var238));
                final SubLObject var248 = var239.secondMultipleValue();
                var239.resetMultipleValues();
                return Values.values(f12775(var240, var247), var248);
            }
            if (module0202.NIL != f12590(var19)) {
                final SubLObject var249 = module0205.f13136(var19);
                SubLObject var250 = (SubLObject)module0202.NIL;
                SubLObject var251 = (SubLObject)module0202.NIL;
                SubLObject var253;
                final SubLObject var252 = var253 = module0205.f13207(var19, (SubLObject)module0202.$ic33$);
                SubLObject var254 = (SubLObject)module0202.NIL;
                var254 = var253.first();
                while (module0202.NIL != var253) {
                    var239.resetMultipleValues();
                    final SubLObject var255 = f12988(var254, var238);
                    final SubLObject var256 = var239.secondMultipleValue();
                    var239.resetMultipleValues();
                    var250 = (SubLObject)ConsesLow.cons(var255, var250);
                    var251 = ConsesLow.append(var251, var256);
                    var253 = var253.rest();
                    var254 = var253.first();
                }
                var250 = Sequences.nreverse(var250);
                return Values.values((SubLObject)ConsesLow.cons(var249, var250), var251);
            }
            return Values.values(var19, (SubLObject)module0202.NIL);
        }
    }
    
    public static SubLObject f12989(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (module0202.NIL != f12606(var19)) {
            final SubLObject var21 = f12744(var19);
            SubLObject var22 = f12668(var19);
            final SubLObject var23 = f12993(var22, var21);
            if (module0202.NIL != var23) {
                var22 = conses_high.sublis(conses_high.acons(var21, var23, (SubLObject)module0202.NIL), var22, Symbols.symbol_function((SubLObject)module0202.EQUAL), (SubLObject)module0202.UNPROVIDED);
                var20.resetMultipleValues();
                final SubLObject var24 = f12989(var22);
                final SubLObject var25 = var20.secondMultipleValue();
                var20.resetMultipleValues();
                return Values.values(var24, conses_high.acons(var21, var23, var25));
            }
            var20.resetMultipleValues();
            final SubLObject var24 = f12989(var22);
            final SubLObject var25 = var20.secondMultipleValue();
            var20.resetMultipleValues();
            return Values.values(f12776(var21, var24), var25);
        }
        else {
            if (module0202.NIL != f12604(var19)) {
                final SubLObject var21 = f12744(var19);
                final SubLObject var22 = f12668(var19);
                var20.resetMultipleValues();
                final SubLObject var26 = f12989(var22);
                final SubLObject var27 = var20.secondMultipleValue();
                var20.resetMultipleValues();
                return Values.values(f12775(var21, var26), var27);
            }
            if (module0202.NIL != f12590(var19)) {
                final SubLObject var28 = module0205.f13136(var19);
                SubLObject var29 = (SubLObject)module0202.NIL;
                SubLObject var30 = (SubLObject)module0202.NIL;
                SubLObject var32;
                final SubLObject var31 = var32 = module0205.f13207(var19, (SubLObject)module0202.$ic33$);
                SubLObject var33 = (SubLObject)module0202.NIL;
                var33 = var32.first();
                while (module0202.NIL != var32) {
                    var20.resetMultipleValues();
                    final SubLObject var34 = f12989(var33);
                    final SubLObject var35 = var20.secondMultipleValue();
                    var20.resetMultipleValues();
                    var29 = (SubLObject)ConsesLow.cons(var34, var29);
                    var30 = ConsesLow.append(var30, var35);
                    var32 = var32.rest();
                    var33 = var32.first();
                }
                var29 = Sequences.nreverse(var29);
                return Values.values((SubLObject)ConsesLow.cons(var28, var29), var30);
            }
            return Values.values(var19, (SubLObject)module0202.NIL);
        }
    }
    
    public static SubLObject f12990(final SubLObject var19) {
        if (module0202.NIL != f12873(var19)) {
            return f12834(var19, (SubLObject)module0202.UNPROVIDED).equal(f12835(var19, (SubLObject)module0202.UNPROVIDED)) ? (f12828(var19).eql((SubLObject)module0202.$ic147$) ? module0202.$ic148$ : module0202.$ic149$) : var19;
        }
        if (module0202.NIL != f12590(var19)) {
            final SubLObject var20 = module0205.f13136(var19);
            SubLObject var21 = (SubLObject)module0202.NIL;
            SubLObject var23;
            final SubLObject var22 = var23 = module0205.f13207(var19, (SubLObject)module0202.$ic33$);
            SubLObject var24 = (SubLObject)module0202.NIL;
            var24 = var23.first();
            while (module0202.NIL != var23) {
                var21 = (SubLObject)ConsesLow.cons(f12990(var24), var21);
                var23 = var23.rest();
                var24 = var23.first();
            }
            var21 = Sequences.nreverse(var21);
            return (SubLObject)ConsesLow.cons(var20, var21);
        }
        return var19;
    }
    
    public static SubLObject f12991(final SubLObject var19) {
        if (module0202.NIL != f12595(var19)) {
            SubLObject var20 = (SubLObject)module0202.NIL;
            SubLObject var22;
            final SubLObject var21 = var22 = module0205.f13207(var19, (SubLObject)module0202.$ic33$);
            SubLObject var23 = (SubLObject)module0202.NIL;
            var23 = var22.first();
            while (module0202.NIL != var22) {
                final SubLObject var24 = f12991(var23);
                if (module0202.NIL != f12595(var24)) {
                    SubLObject var8_249;
                    final SubLObject var11_248 = var8_249 = module0205.f13207(var24, (SubLObject)module0202.$ic33$);
                    SubLObject var25 = (SubLObject)module0202.NIL;
                    var25 = var8_249.first();
                    while (module0202.NIL != var8_249) {
                        if (!var25.eql(module0202.$ic148$)) {
                            var20 = (SubLObject)ConsesLow.cons(var25, var20);
                        }
                        var8_249 = var8_249.rest();
                        var25 = var8_249.first();
                    }
                }
                else if (!var24.eql(module0202.$ic148$)) {
                    var20 = (SubLObject)ConsesLow.cons(var24, var20);
                }
                var22 = var22.rest();
                var23 = var22.first();
            }
            var20 = Sequences.nreverse(var20);
            if (module0202.NIL == var20) {
                return module0202.$ic148$;
            }
            if (module0202.NIL != module0035.f1997(var20)) {
                return var20.first();
            }
            if (module0202.NIL != module0004.f104(module0202.$ic149$, var20, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
                return module0202.$ic149$;
            }
            return f12773(var20);
        }
        else {
            if (module0202.NIL != f12590(var19)) {
                final SubLObject var26 = module0205.f13136(var19);
                SubLObject var27 = (SubLObject)module0202.NIL;
                SubLObject var29;
                final SubLObject var28 = var29 = module0205.f13207(var19, (SubLObject)module0202.$ic33$);
                SubLObject var30 = (SubLObject)module0202.NIL;
                var30 = var29.first();
                while (module0202.NIL != var29) {
                    var27 = (SubLObject)ConsesLow.cons(f12991(var30), var27);
                    var29 = var29.rest();
                    var30 = var29.first();
                }
                var27 = Sequences.nreverse(var27);
                return (SubLObject)ConsesLow.cons(var26, var27);
            }
            return var19;
        }
    }
    
    public static SubLObject f12992(final SubLObject var19, final SubLObject var250, final SubLObject var251) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var250.equal(var251) || module0202.NIL != f12994(var19, var250, var251));
    }
    
    public static SubLObject f12994(final SubLObject var19, final SubLObject var250, final SubLObject var251) {
        if (module0202.NIL != f12873(var19)) {
            final SubLObject var252 = f12834(var19, (SubLObject)module0202.UNPROVIDED);
            final SubLObject var253 = f12835(var19, (SubLObject)module0202.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean((var250.equal(var252) && var251.equal(var253)) || (var250.equal(var253) && var251.equal(var252)));
        }
        if (module0202.NIL != f12595(var19)) {
            SubLObject var254 = (SubLObject)module0202.NIL;
            final SubLObject var255 = module0205.f13207(var19, (SubLObject)module0202.$ic33$);
            SubLObject var256;
            SubLObject var257;
            for (var256 = (SubLObject)module0202.NIL, var256 = var255; module0202.NIL == var254 && module0202.NIL != var256; var256 = var256.rest()) {
                var257 = var256.first();
                if (module0202.NIL != f12994(var257, var250, var251)) {
                    var254 = (SubLObject)module0202.T;
                }
            }
            return var254;
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f12993(final SubLObject var19, final SubLObject var36) {
        if (module0202.NIL != f12873(var19)) {
            final SubLObject var37 = f12834(var19, (SubLObject)module0202.UNPROVIDED);
            final SubLObject var38 = f12835(var19, (SubLObject)module0202.UNPROVIDED);
            if (var36.equal(var37) && !var36.equal(var38)) {
                return var38;
            }
            if (!var36.equal(var37) && var36.equal(var38)) {
                return var37;
            }
            return (SubLObject)module0202.NIL;
        }
        else {
            if (module0202.NIL != f12595(var19)) {
                SubLObject var39 = (SubLObject)module0202.NIL;
                final SubLObject var40 = module0205.f13207(var19, (SubLObject)module0202.$ic33$);
                SubLObject var41;
                SubLObject var42;
                for (var41 = (SubLObject)module0202.NIL, var41 = var40; module0202.NIL == var39 && module0202.NIL != var41; var39 = f12993(var42, var36), var41 = var41.rest()) {
                    var42 = var41.first();
                }
                return var39;
            }
            return (SubLObject)module0202.NIL;
        }
    }
    
    public static SubLObject f12995(final SubLObject var80, SubLObject var253, SubLObject var254, SubLObject var255) {
        if (var253 == module0202.UNPROVIDED) {
            var253 = Symbols.symbol_function((SubLObject)module0202.IDENTITY);
        }
        if (var254 == module0202.UNPROVIDED) {
            var254 = (SubLObject)module0202.ZERO_INTEGER;
        }
        if (var255 == module0202.UNPROVIDED) {
            var255 = (SubLObject)module0202.NIL;
        }
        final SubLThread var256 = SubLProcess.currentSubLThread();
        SubLObject var257 = (SubLObject)module0202.NIL;
        final SubLObject var258 = module0139.$g1630$.getDynamicValue(var256);
        final SubLObject var259 = module0139.$g1631$.currentBinding(var256);
        final SubLObject var260 = module0139.$g1632$.currentBinding(var256);
        final SubLObject var261 = module0139.$g1630$.currentBinding(var256);
        try {
            module0139.$g1631$.bind(module0139.f9015(var258, (SubLObject)module0202.SIX_INTEGER), var256);
            module0139.$g1632$.bind(module0139.f9016(var258), var256);
            module0139.$g1630$.bind((SubLObject)module0202.T, var256);
            final SubLObject var263;
            final SubLObject var262 = var263 = module0034.f1888();
            final SubLObject var138_259 = module0034.$g879$.currentBinding(var256);
            try {
                module0034.$g879$.bind(var263, var256);
                SubLObject var264 = (SubLObject)module0202.NIL;
                if (module0202.NIL != var263 && module0202.NIL == module0034.f1842(var263)) {
                    var264 = module0034.f1869(var263);
                    final SubLObject var265 = Threads.current_process();
                    if (module0202.NIL == var264) {
                        module0034.f1873(var263, var265);
                    }
                    else if (!var264.eql(var265)) {
                        Errors.error((SubLObject)module0202.$ic150$);
                    }
                }
                try {
                    var257 = Sequences.remove_duplicates(var80, (SubLObject)module0202.$ic151$, var253, var254, var255);
                }
                finally {
                    final SubLObject var138_260 = Threads.$is_thread_performing_cleanupP$.currentBinding(var256);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0202.T, var256);
                        if (module0202.NIL != var263 && module0202.NIL == var264) {
                            module0034.f1873(var263, (SubLObject)module0202.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var138_260, var256);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var138_259, var256);
            }
        }
        finally {
            module0139.$g1630$.rebind(var261, var256);
            module0139.$g1632$.rebind(var260, var256);
            module0139.$g1631$.rebind(var259, var256);
        }
        return var257;
    }
    
    public static SubLObject f12996(final SubLObject var263) {
        SubLObject var264 = (SubLObject)module0202.NIL;
        SubLObject var265 = var263;
        SubLObject var266 = (SubLObject)module0202.NIL;
        var266 = var265.first();
        while (module0202.NIL != var265) {
            SubLObject var267 = (SubLObject)module0202.NIL;
            SubLObject var8_267 = var266;
            SubLObject var268 = (SubLObject)module0202.NIL;
            var268 = var8_267.first();
            while (module0202.NIL != var8_267) {
                SubLObject var270;
                final SubLObject var269 = var270 = var268;
                SubLObject var271 = (SubLObject)module0202.NIL;
                SubLObject var272 = (SubLObject)module0202.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var270, var269, (SubLObject)module0202.$ic152$);
                var271 = var270.first();
                var270 = (var272 = var270.rest());
                var267 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var271, var272), var267);
                var8_267 = var8_267.rest();
                var268 = var8_267.first();
            }
            var264 = (SubLObject)ConsesLow.cons(Sequences.nreverse(var267), var264);
            var265 = var265.rest();
            var266 = var265.first();
        }
        return Sequences.nreverse(var264);
    }
    
    public static SubLObject f12997(final SubLObject var264) {
        SubLObject var265 = (SubLObject)module0202.NIL;
        SubLObject var266 = var264;
        SubLObject var267 = (SubLObject)module0202.NIL;
        var267 = var266.first();
        while (module0202.NIL != var266) {
            SubLObject var268 = (SubLObject)module0202.NIL;
            SubLObject var8_272 = var267;
            SubLObject var269 = (SubLObject)module0202.NIL;
            var269 = var8_272.first();
            while (module0202.NIL != var8_272) {
                SubLObject var271;
                final SubLObject var270 = var271 = var269;
                SubLObject var272 = (SubLObject)module0202.NIL;
                SubLObject var273 = (SubLObject)module0202.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var271, var270, (SubLObject)module0202.$ic153$);
                var272 = var271.first();
                var271 = var271.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var271, var270, (SubLObject)module0202.$ic153$);
                var273 = var271.first();
                var271 = var271.rest();
                if (module0202.NIL == var271) {
                    var268 = (SubLObject)ConsesLow.cons(module0233.f15340(var272, var273), var268);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var270, (SubLObject)module0202.$ic153$);
                }
                var8_272 = var8_272.rest();
                var269 = var8_272.first();
            }
            var265 = (SubLObject)ConsesLow.cons(Sequences.nreverse(var268), var265);
            var266 = var266.rest();
            var267 = var266.first();
        }
        return Sequences.nreverse(var265);
    }
    
    public static SubLObject f12998(final SubLObject var4, final SubLObject var120) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != constant_handles_oc.f8449(var4) && constants_high_oc.f10743(var4).equal(var120));
    }
    
    public static SubLObject f12999(final SubLObject var4, final SubLObject var276) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0202.NIL != constant_handles_oc.f8449(var4) && module0202.NIL != module0035.f2171(constants_high_oc.f10743(var4), var276));
    }
    
    public static SubLObject f13000(final SubLObject var1) {
        if (module0202.NIL == f12590(var1)) {
            return (SubLObject)module0202.NIL;
        }
        return module0205.f13145((SubLObject)module0202.$ic51$, var1, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f13001(final SubLObject var4, SubLObject var20) {
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic44$;
        }
        if (module0202.NIL != f12590(var4)) {
            SubLObject var22;
            final SubLObject var21 = var22 = module0205.f13180(var4, (SubLObject)module0202.$ic33$);
            SubLObject var23 = (SubLObject)module0202.NIL;
            var23 = var22.first();
            while (module0202.NIL != var22) {
                if (module0202.NIL != f12590(var23)) {
                    SubLObject var8_278;
                    final SubLObject var7_277 = var8_278 = module0205.f13180(var23, (SubLObject)module0202.$ic33$);
                    SubLObject var24 = (SubLObject)module0202.NIL;
                    var24 = var8_278.first();
                    while (module0202.NIL != var8_278) {
                        if (module0202.NIL != module0205.f13145(var20, var24, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED)) {
                            return (SubLObject)module0202.T;
                        }
                        var8_278 = var8_278.rest();
                        var24 = var8_278.first();
                    }
                }
                var22 = var22.rest();
                var23 = var22.first();
            }
        }
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f13002(final SubLObject var1) {
        if (module0202.NIL == f12590(var1)) {
            return (SubLObject)module0202.NIL;
        }
        return module0205.f13145((SubLObject)module0202.$ic154$, var1, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f13003(final SubLObject var4) {
        return f13001(var4, (SubLObject)module0202.$ic154$);
    }
    
    public static SubLObject f13004(final SubLObject var1) {
        return f13005(var1, (SubLObject)module0202.$ic154$);
    }
    
    public static SubLObject f13006(final SubLObject var52) {
        return f13005(var52, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f13005(final SubLObject var4, SubLObject var20) {
        if (var20 == module0202.UNPROVIDED) {
            var20 = (SubLObject)module0202.$ic155$;
        }
        if (var4.isCons()) {
            SubLObject var21 = var4.first();
            SubLObject var22 = var4.rest();
            SubLObject var23 = (SubLObject)module0202.NIL;
            while (var22.isCons()) {
                var23 = (SubLObject)ConsesLow.cons(f13005(var21, var20), var23);
                var21 = var22.first();
                var22 = var22.rest();
            }
            var23 = (SubLObject)ConsesLow.cons(f13005(var21, var20), var23);
            if (module0202.NIL != module0035.sublisp_boolean(var22)) {
                var23 = (SubLObject)ConsesLow.cons((SubLObject)module0202.$ic156$, var23);
            }
            if (module0202.NIL != module0035.f2370((SubLObject)module0202.$ic157$, var23, (SubLObject)module0202.UNPROVIDED)) {
                return (SubLObject)module0202.$ic158$;
            }
            return Sequences.nreverse(var23);
        }
        else {
            if (module0202.NIL != Functions.funcall(var20, var4)) {
                return (SubLObject)module0202.$ic159$;
            }
            return (SubLObject)module0202.$ic158$;
        }
    }
    
    public static SubLObject f13007(final SubLObject var4) {
        return Equality.eq((SubLObject)module0202.$ic160$, var4);
    }
    
    public static SubLObject f13008(final SubLObject var282) {
        final SubLObject var283 = module0035.f2030((SubLObject)module0202.$ic158$, var282, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
        if (module0202.NIL == var283) {
            return (SubLObject)module0202.NIL;
        }
        return Sort.sort(var283, (SubLObject)module0202.$ic161$, (SubLObject)module0202.UNPROVIDED);
    }
    
    public static SubLObject f13009(final SubLObject var284, final SubLObject var285) {
        if (var284.isInteger() && var285.isInteger()) {
            final SubLObject var286 = Sequences.position(var284, module0202.$g2313$.getGlobalValue(), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
            final SubLObject var287 = Sequences.position(var285, module0202.$g2313$.getGlobalValue(), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
            return Numbers.numL(var286, var287);
        }
        if (var284.isInteger()) {
            return (SubLObject)module0202.T;
        }
        if (var285.isInteger()) {
            return (SubLObject)module0202.NIL;
        }
        if (module0202.NIL != module0035.f2010(var284, var285)) {
            return (SubLObject)module0202.T;
        }
        if (module0202.NIL != module0035.f2007(var284, var285)) {
            return (SubLObject)module0202.NIL;
        }
        final SubLObject var288 = var284.first();
        final SubLObject var289 = var285.first();
        final SubLObject var290 = Sequences.position(var288, module0202.$g2313$.getGlobalValue(), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
        final SubLObject var291 = Sequences.position(var289, module0202.$g2313$.getGlobalValue(), (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED, (SubLObject)module0202.UNPROVIDED);
        if (var288.eql(var289)) {
            return f13009(var284.rest(), var285.rest());
        }
        return Numbers.numL(var290, var291);
    }
    
    public static SubLObject f13010(final SubLObject var4) {
        final SubLObject var5 = f13004(var4);
        final SubLObject var6 = f13008(var5);
        final SubLObject var7 = module0035.f2036(var6, var4);
        return Values.values(var7, var6);
    }
    
    public static SubLObject f13011() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12589", "S#15539", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12591", "S#15540", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12592", "S#13439", 1, 0, false);
        new $f12592$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12594", "S#15477", 1, 0, false);
        new $f12594$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12595", "S#13276", 1, 0, false);
        new $f12595$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12596", "S#15541", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12597", "S#15542", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12599", "S#15543", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12600", "S#15544", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12601", "S#15545", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12602", "S#15546", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12603", "S#15547", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12604", "S#15548", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12605", "S#15549", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12606", "S#13455", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12607", "S#15550", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12609", "S#15551", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12610", "S#15552", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12611", "S#15553", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12612", "S#15554", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12613", "S#15555", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12614", "S#15556", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12615", "S#15557", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12616", "S#15558", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12617", "S#15559", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12618", "S#15560", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12619", "S#15561", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12620", "S#15562", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12621", "S#15563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12622", "S#15564", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12623", "S#15565", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12624", "S#15480", 1, 0, false);
        new $f12624$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12625", "S#15566", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12626", "S#15567", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12627", "S#15568", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12628", "S#15569", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12629", "S#15570", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12630", "S#15571", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12631", "S#13441", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12632", "S#13443", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12633", "S#15572", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12634", "S#15573", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12635", "S#15574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12636", "EL-ZERO-ARITY-FORMULA-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12593", "EL-UNARY-FORMULA-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12598", "EL-BINARY-FORMULA-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12608", "S#15575", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12638", "S#15576", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12639", "SUBL-ESCAPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12640", "S#15483", 1, 0, false);
        new $f12640$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12641", "S#15577", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12642", "S#15578", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12644", "S#15579", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12645", "S#15580", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12646", "S#15581", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12647", "S#15582", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12648", "S#15583", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12649", "S#15584", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12650", "S#15585", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12651", "S#15586", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12652", "S#15484", 1, 0, false);
        new $f12652$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12653", "S#15587", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12654", "S#15485", 1, 0, false);
        new $f12654$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12655", "S#15588", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12590", "S#12753", 1, 0, false);
        new $f12590$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12656", "S#13259", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12657", "S#15589", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12658", "S#13274", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12659", "S#12761", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12660", "S#13920", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12661", "S#14712", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12662", "S#15590", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12663", "S#15591", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12664", "S#15592", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12665", "S#15593", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12666", "S#15594", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12667", "S#15595", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12669", "S#15596", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12670", "S#15597", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12671", "S#15598", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12672", "S#15599", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12674", "S#15600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12675", "S#15601", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12676", "S#15602", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12677", "S#15603", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12679", "S#15604", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12680", "S#15605", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12678", "S#15606", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12681", "S#15607", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12682", "S#15608", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12684", "S#15609", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12685", "S#15610", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12686", "S#15611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12687", "S#15612", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12688", "S#15613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12689", "GROUND?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12690", "S#15614", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12691", "S#15615", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12692", "S#15616", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12694", "S#15617", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12695", "S#15618", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12696", "S#15619", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12697", "S#15620", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12698", "OPTIMIZE-EL-FORMULA-VARIABLE-NAME", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12700", "S#15621", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12701", "S#15622", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12703", "S#15623", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12699", "S#15429", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12704", "S#15624", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12705", "S#15625", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12706", "S#15626", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12707", "S#15196", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12708", "S#15627", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12709", "S#15628", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12710", "S#15629", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12711", "S#15198", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12712", "S#15197", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12713", "S#15630", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12714", "S#15497", 1, 0, false);
        new $f12714$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12715", "S#15631", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12673", "S#15632", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12716", "S#15633", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12717", "S#15634", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12718", "S#15635", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12719", "S#15636", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12721", "S#15637", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12722", "S#15638", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12723", "S#12754", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12724", "S#15639", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12725", "S#15640", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12726", "S#15641", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12727", "S#15642", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12728", "S#15643", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12729", "S#15644", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12730", "S#15645", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12731", "FORMULA-ARITY>", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12732", "S#15646", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12733", "S#15647", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12734", "S#12760", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12637", "S#15648", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12735", "S#15649", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12736", "S#15650", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12737", "S#15651", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12738", "S#15652", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12739", "S#15653", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12740", "S#15654", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12741", "S#15655", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12742", "S#15656", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12743", "S#15657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12744", "S#15658", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12745", "S#15659", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12746", "S#15660", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12748", "S#15661", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12668", "S#13456", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12749", "S#15662", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12750", "S#15663", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12751", "S#15664", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12752", "S#15665", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0202", "f12753", "S#15666");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0202", "f12754", "S#15667");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12755", "S#15668", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12756", "S#15669", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12757", "CYCL-SUBL-SYMBOL-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12758", "S#15670", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12759", "S#667", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12760", "S#15671", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12761", "S#15672", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12762", "S#14356", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12683", "MAKE-EL-FORMULA", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12720", "MAKE-FORMULA", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12763", "COPY-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12764", "S#15673", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12765", "S#15674", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12766", "S#15675", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12702", "S#15676", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12767", "S#15677", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12643", "MAKE-UNARY-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12768", "MAKE-BINARY-FORMULA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12769", "MAKE-TERNARY-FORMULA", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12770", "S#15678", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12771", "S#13442", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12772", "MAKE-DISJUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12773", "MAKE-CONJUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12774", "S#15679", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12775", "S#15680", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12776", "MAKE-EXISTENTIAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12777", "S#15681", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12778", "S#15682", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12779", "MAKE-EXISTENTIAL-MIN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12780", "MAKE-EXISTENTIAL-MAX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12781", "MAKE-EXISTENTIAL-EXACT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12782", "S#14355", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12783", "S#15683", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12784", "S#15684", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12785", "S#15685", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12786", "S#13270", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12787", "S#15686", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12788", "S#15687", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12789", "S#15688", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12790", "S#15689", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12791", "S#15690", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12792", "S#15691", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12793", "S#15692", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12794", "S#15693", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12795", "S#15694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12796", "S#15695", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12797", "S#13446", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12798", "S#15696", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12799", "S#15697", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12800", "S#15698", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12801", "S#15699", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12802", "S#15700", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12803", "S#15701", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12804", "S#15702", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12805", "S#15703", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12806", "S#15704", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12807", "S#15705", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12808", "S#15706", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12809", "S#15707", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12810", "S#15708", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12811", "S#15709", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12812", "S#15710", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12813", "S#15711", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12814", "S#15712", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12815", "S#15713", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12816", "S#15714", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12817", "S#15715", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12818", "S#15716", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12819", "S#15717", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12820", "S#15718", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12821", "S#15719", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12822", "S#15720", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12823", "S#15721", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12824", "S#15722", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12825", "S#15723", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12826", "S#15724", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12827", "S#15725", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12828", "S#15726", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12829", "S#15205", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12830", "S#15206", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12831", "S#15727", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12832", "S#12337", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12833", "S#15728", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12834", "S#15729", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12835", "S#15730", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12836", "S#15731", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12837", "S#15732", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12838", "S#15733", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12839", "S#15734", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12840", "S#15735", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12841", "S#15736", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12842", "S#15737", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12843", "S#15738", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12844", "S#15739", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12845", "S#15740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12846", "S#15741", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12847", "S#15742", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12848", "S#15743", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12849", "S#15744", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12850", "S#15745", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12852", "S#15746", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12854", "S#15747", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12855", "S#15748", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12856", "S#15749", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12857", "S#15750", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12851", "S#15751", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12858", "S#15752", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12859", "S#15753", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12860", "S#15754", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12861", "S#15755", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12862", "S#15756", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12863", "S#15757", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12864", "S#15758", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12865", "S#15759", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12866", "S#15760", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12867", "S#15761", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12868", "S#15762", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12869", "S#15763", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12870", "S#15764", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12871", "S#15765", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12872", "S#15766", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12873", "S#15767", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12874", "S#15768", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12875", "S#15769", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12876", "S#15515", 1, 0, false);
        new $f12876$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12877", "S#15770", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12879", "S#15771", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12880", "S#15772", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12878", "S#15773", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12881", "S#15774", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12853", "S#15775", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12882", "S#15776", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12883", "S#13483", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12884", "S#15777", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12886", "S#15778", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12885", "S#15779", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12888", "S#15780", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12889", "S#15781", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12890", "S#15782", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12891", "S#15783", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12892", "S#15784", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12893", "S#15785", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12894", "S#15786", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12895", "S#15519", 1, 0, false);
        new $f12895$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12896", "S#15787", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12897", "S#15788", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12898", "S#15789", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12899", "S#15790", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12900", "S#15791", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12901", "S#15792", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12902", "S#15793", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12903", "S#15794", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12904", "S#15795", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12905", "S#15796", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12906", "S#15797", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12907", "S#15798", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12887", "S#15799", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12908", "S#15800", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12909", "S#15801", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12910", "S#15802", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12912", "S#15803", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12913", "S#15804", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12914", "BIND-ALL-FREE-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12915", "S#15805", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12916", "S#15806", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12919", "S#15807", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12920", "S#15808", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12921", "S#15809", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12922", "S#15810", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12923", "EXPAND-JOIN-LEFT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12924", "TRUE-SENTENCE-CASE-INSENSITIVE-EXPANSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12926", "S#15811", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12927", "S#15812", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12928", "S#15813", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12929", "EL-RELATION-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12931", "S#15814", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12932", "S#15815", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12930", "S#15816", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12934", "S#15817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12935", "S#15818", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12936", "S#15819", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12917", "S#15820", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12937", "S#15207", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12925", "S#15821", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12938", "GAF?", 1, 0, false);
        new $f12938$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12939", "S#15822", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12940", "S#15823", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12941", "S#15824", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12942", "S#15825", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12943", "SENTENCE-VARIABLES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12945", "S#15826", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12944", "S#15827", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12946", "S#15828", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12947", "S#15829", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12948", "S#15830", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12949", "S#15831", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12950", "S#15832", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12952", "S#15833", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12953", "S#15834", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12951", "S#15835", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12955", "S#15836", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12954", "SENTENCE-FREE-SEQUENCE-VARIABLES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12956", "S#15837", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12958", "S#15838", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12959", "S#15839", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12960", "S#15840", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12961", "S#12755", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12962", "S#15841", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12963", "S#15842", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12964", "S#15843", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12918", "S#15844", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12957", "S#15845", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12933", "S#15846", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12965", "S#15847", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12966", "S#15848", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12911", "SENTENCE-FREE-VARIABLES", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12967", "S#15849", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12969", "S#15850", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12693", "S#15851", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12968", "S#15852", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12970", "S#15853", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12971", "S#15854", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12972", "S#15855", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12973", "S#15856", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12974", "S#15857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12975", "S#15858", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12976", "S#15859", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12978", "S#15860", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12979", "S#15861", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12977", "S#15537", 1, 0, false);
        new $f12977$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12980", "S#15862", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12981", "S#15863", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12982", "S#15864", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12983", "S#15865", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12747", "S#15866", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12984", "S#15867", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12985", "S#15868", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12986", "S#15869", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12987", "S#15870", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12988", "S#15871", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12989", "S#15872", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12990", "S#15873", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12991", "S#15874", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12992", "S#15875", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12994", "S#15876", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12993", "S#15877", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12995", "S#15878", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12996", "S#15879", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12997", "S#15880", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12998", "S#15881", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f12999", "S#15882", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f13000", "S#15883", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f13001", "S#15884", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f13002", "S#15885", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f13003", "S#15886", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f13004", "S#15887", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f13006", "S#15888", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f13005", "S#15889", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f13007", "S#15890", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f13008", "S#15891", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f13009", "S#15892", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0202", "f13010", "S#15893", 1, 0, false);
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f13012() {
        module0202.$g2293$ = SubLFiles.defconstant("S#15894", (SubLObject)ConsesLow.list(module0202.$ic3$));
        module0202.$g2294$ = SubLFiles.defconstant("S#15895", (SubLObject)ConsesLow.list(module0202.$ic8$, module0202.$ic10$, module0202.$ic9$));
        module0202.$g2295$ = SubLFiles.defconstant("S#15896", (SubLObject)module0202.NIL);
        module0202.$g2296$ = SubLFiles.defconstant("S#15897", (SubLObject)module0202.NIL);
        module0202.$g2297$ = SubLFiles.defconstant("S#15898", (SubLObject)module0202.NIL);
        module0202.$g2298$ = SubLFiles.defconstant("S#15899", (SubLObject)ConsesLow.list(module0202.$ic7$, module0202.$ic5$));
        module0202.$g2299$ = SubLFiles.defconstant("S#15900", (SubLObject)ConsesLow.list(module0202.$ic12$, module0202.$ic11$));
        module0202.$g2300$ = SubLFiles.defconstant("S#15901", (SubLObject)ConsesLow.list(module0202.$ic15$, module0202.$ic14$, module0202.$ic13$));
        module0202.$g2301$ = SubLFiles.defconstant("S#15902", (SubLObject)module0202.$ic16$);
        module0202.$g2302$ = SubLFiles.defconstant("S#15903", (SubLObject)module0202.$ic17$);
        module0202.$g2303$ = SubLFiles.defconstant("S#15904", (SubLObject)ConsesLow.list(module0202.$ic27$, module0202.$ic28$));
        module0202.$g2304$ = SubLFiles.defconstant("S#15905", (SubLObject)ConsesLow.list(module0202.$ic30$));
        module0202.$g2305$ = SubLFiles.deflexical("S#15906", (SubLObject)module0202.$ic53$);
        module0202.$g2306$ = SubLFiles.defparameter("S#15907", (SubLObject)module0202.T);
        module0202.$g2307$ = SubLFiles.defparameter("S#15908", (SubLObject)module0202.$ic78$);
        module0202.$g2308$ = SubLFiles.defparameter("S#15909", (SubLObject)module0202.$ic78$);
        module0202.$g2309$ = SubLFiles.defparameter("S#15910", (SubLObject)module0202.$ic78$);
        module0202.$g2310$ = SubLFiles.defparameter("S#15911", (SubLObject)module0202.$ic78$);
        module0202.$g2311$ = SubLFiles.deflexical("S#15912", (SubLObject)module0202.$ic140$);
        module0202.$g2312$ = SubLFiles.deflexical("S#15913", (SubLObject)module0202.$ic141$);
        module0202.$g2313$ = SubLFiles.deflexical("S#15914", (SubLObject)module0202.$ic162$);
        return (SubLObject)module0202.NIL;
    }
    
    public static SubLObject f13013() {
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0202.$ic0$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0202.$ic1$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0202.$ic2$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0202.$ic4$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0202.$ic6$);
        module0012.f368((SubLObject)module0202.$ic45$, (SubLObject)module0202.$ic46$, (SubLObject)module0202.$ic47$, (SubLObject)module0202.NIL, (SubLObject)module0202.$ic48$);
        module0002.f38((SubLObject)module0202.$ic50$);
        module0002.f38((SubLObject)module0202.$ic73$);
        module0002.f38((SubLObject)module0202.$ic113$);
        module0012.f416((SubLObject)module0202.$ic119$);
        module0012.f416((SubLObject)module0202.$ic120$);
        module0012.f416((SubLObject)module0202.$ic127$);
        return (SubLObject)module0202.NIL;
    }
    
    public void declareFunctions() {
        f13011();
    }
    
    public void initializeVariables() {
        f13012();
    }
    
    public void runTopLevelForms() {
        f13013();
    }
    
    static {
        me = (SubLFile)new module0202();
        module0202.$g2293$ = null;
        module0202.$g2294$ = null;
        module0202.$g2295$ = null;
        module0202.$g2296$ = null;
        module0202.$g2297$ = null;
        module0202.$g2298$ = null;
        module0202.$g2299$ = null;
        module0202.$g2300$ = null;
        module0202.$g2301$ = null;
        module0202.$g2302$ = null;
        module0202.$g2303$ = null;
        module0202.$g2304$ = null;
        module0202.$g2305$ = null;
        module0202.$g2306$ = null;
        module0202.$g2307$ = null;
        module0202.$g2308$ = null;
        module0202.$g2309$ = null;
        module0202.$g2310$ = null;
        module0202.$g2311$ = null;
        module0202.$g2312$ = null;
        module0202.$g2313$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#15539", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#15540", "CYC"));
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13439", "CYC"));
        $ic3$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("not"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#15477", "CYC"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("or"));
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13276", "CYC"));
        $ic7$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("and"));
        $ic8$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies"));
        $ic9$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equiv"));
        $ic10$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("xor"));
        $ic11$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("forAll"));
        $ic12$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $ic13$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("thereExistAtLeast"));
        $ic14$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("thereExistAtMost"));
        $ic15$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("thereExistExactly"));
        $ic16$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("was")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("hasAlwaysBeen")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("willBe")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("willAlwaysBe")));
        $ic17$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("was-Metric")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("willBe-Metric")));
        $ic18$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("was"));
        $ic19$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("hasAlwaysBeen"));
        $ic20$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("willBe"));
        $ic21$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("willAlwaysBe"));
        $ic22$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("was-Metric"));
        $ic23$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("willBe-Metric"));
        $ic24$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn"));
        $ic25$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn"));
        $ic26$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Quote"));
        $ic27$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("exceptFor"));
        $ic28$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("exceptWhen"));
        $ic29$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("abnormal"));
        $ic30$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pragmaticRequirement"));
        $ic31$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("meetsPragmaticRequirement"));
        $ic32$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("querySentence"));
        $ic33$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic34$ = SubLObjectFactory.makeSymbol("EL-RELATION-EXPRESSION?");
        $ic35$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheList"));
        $ic36$ = SubLObjectFactory.makeKeyword("INCLUDE");
        $ic37$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheEmptyList"));
        $ic38$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheEmptySet"));
        $ic39$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $ic40$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $ic41$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic42$ = SubLObjectFactory.makeString("A KB-dependent numerical quantification function was called, but the current Cyc KB does not contain knowledge about numerical quantification.");
        $ic43$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SpecsFn"));
        $ic44$ = SubLObjectFactory.makeSymbol("S#12629", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("GROUND?");
        $ic46$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#63", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#175", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12629", "CYC"))));
        $ic47$ = SubLObjectFactory.makeString("Returns whether EXPRESSION is free of any variables?");
        $ic48$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic49$ = SubLObjectFactory.makeSymbol("S#12753", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("OPTIMIZE-EL-FORMULA-VARIABLE-NAME");
        $ic51$ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $ic52$ = SubLObjectFactory.makeSymbol("S#15496", "CYC");
        $ic53$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("?X"), SubLObjectFactory.makeSymbol("?Y"), SubLObjectFactory.makeSymbol("?Z"), SubLObjectFactory.makeSymbol("?W"), SubLObjectFactory.makeSymbol("?V"), SubLObjectFactory.makeSymbol("?U"), SubLObjectFactory.makeSymbol("?A"), SubLObjectFactory.makeSymbol("?B"), SubLObjectFactory.makeSymbol("?C"), SubLObjectFactory.makeSymbol("?D"), SubLObjectFactory.makeSymbol("?E"), SubLObjectFactory.makeSymbol("?F"), SubLObjectFactory.makeSymbol("?G"), SubLObjectFactory.makeSymbol("?H"), SubLObjectFactory.makeSymbol("?I"), SubLObjectFactory.makeSymbol("?J"), SubLObjectFactory.makeSymbol("?K"), SubLObjectFactory.makeSymbol("?L"), SubLObjectFactory.makeSymbol("?M"), SubLObjectFactory.makeSymbol("?N"), SubLObjectFactory.makeSymbol("?O"), SubLObjectFactory.makeSymbol("?P"), SubLObjectFactory.makeSymbol("?Q"), SubLObjectFactory.makeSymbol("?R"), SubLObjectFactory.makeSymbol("?S"), SubLObjectFactory.makeSymbol("?T") });
        $ic54$ = SubLObjectFactory.makeString("-1");
        $ic55$ = SubLObjectFactory.makeSymbol("S#15430", "CYC");
        $ic56$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ExistentialQuantifier"));
        $ic57$ = SubLObjectFactory.makeSymbol("SUBL-ESCAPE-P");
        $ic58$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OPAQUE-EL-VARIABLE-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE-SUBL-TEMPLATE"));
        $ic59$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OPAQUE-SUBL-TEMPLATE"));
        $ic60$ = SubLObjectFactory.makeString("unexpected subl escape type ~s");
        $ic61$ = SubLObjectFactory.makeSymbol("S#15636", "CYC");
        $ic62$ = SubLObjectFactory.makeString("not a known quantifier: ~s");
        $ic63$ = SubLObjectFactory.makeString("not quantified sentence: ~s");
        $ic64$ = SubLObjectFactory.makeSymbol("S#15600", "CYC");
        $ic65$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#715", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15915", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic66$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic67$ = SubLObjectFactory.makeSymbol("S#15664", "CYC");
        $ic68$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#715", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#123", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15915", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic69$ = SubLObjectFactory.makeSymbol("S#1601", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("S#15602", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("CONSP");
        $ic72$ = SubLObjectFactory.makeSymbol("S#15588", "CYC");
        $ic73$ = SubLObjectFactory.makeSymbol("MAKE-EL-FORMULA");
        $ic74$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic75$ = SubLObjectFactory.makeSymbol("S#3529", "CYC");
        $ic76$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn"));
        $ic77$ = SubLObjectFactory.makeKeyword("HELLO-YOU-SILLY-COMPILER");
        $ic78$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic79$ = SubLObjectFactory.makeSymbol("S#15721", "CYC");
        $ic80$ = SubLObjectFactory.makeSymbol("S#15722", "CYC");
        $ic81$ = SubLObjectFactory.makeKeyword("REGULARIZE");
        $ic82$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic83$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic84$ = SubLObjectFactory.makeSymbol("S#13439", "CYC");
        $ic85$ = SubLObjectFactory.makeSymbol("S#15753", "CYC");
        $ic86$ = SubLObjectFactory.makeSymbol("S#15765", "CYC");
        $ic87$ = SubLObjectFactory.makeSymbol("S#15767", "CYC");
        $ic88$ = SubLObjectFactory.makeSymbol("S#15770", "CYC");
        $ic89$ = SubLObjectFactory.makeSymbol("S#15752", "CYC");
        $ic90$ = SubLObjectFactory.makeSymbol("S#15484", "CYC");
        $ic91$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic92$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic93$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $ic94$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic95$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic96$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $ic97$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $ic98$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("resultIsa"));
        $ic99$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("resultGenl"));
        $ic100$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $ic101$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals"));
        $ic102$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("holdsIn"));
        $ic103$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence"));
        $ic104$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("forwardNonTriggerLiteral"));
        $ic105$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $ic106$ = SubLObjectFactory.makeSymbol("S#15916", "CYC");
        $ic107$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Kappa"));
        $ic108$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Lambda"));
        $ic109$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic110$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic111$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("microtheoryDesignationArgnum"));
        $ic112$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("sentenceDesignationArgnum"));
        $ic113$ = SubLObjectFactory.makeSymbol("BIND-ALL-FREE-VARS");
        $ic114$ = SubLObjectFactory.makeSymbol("S#15820", "CYC");
        $ic115$ = SubLObjectFactory.makeString("Tried to recursively determine the functor of ~A, but it was not either a fort or an EL formula.");
        $ic116$ = SubLObjectFactory.makeSymbol("S#15917", "CYC");
        $ic117$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Predicate"));
        $ic118$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Function-Denotational"));
        $ic119$ = SubLObjectFactory.makeSymbol("EXPAND-JOIN-LEFT");
        $ic120$ = SubLObjectFactory.makeSymbol("TRUE-SENTENCE-CASE-INSENSITIVE-EXPANSION");
        $ic121$ = SubLObjectFactory.makeString("termPhrases-CaseInsensitive");
        $ic122$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("termPhrases"));
        $ic123$ = SubLObjectFactory.makeSymbol("S#4064", "CYC");
        $ic124$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regexStringMatch"));
        $ic125$ = SubLObjectFactory.makeString("regexStringMatch-CaseInsensitive");
        $ic126$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence-CaseInsensitive"));
        $ic127$ = SubLObjectFactory.makeSymbol("GAF?");
        $ic128$ = SubLObjectFactory.makeString("~S is not well formed.");
        $ic129$ = SubLObjectFactory.makeSymbol("S#3285", "CYC");
        $ic130$ = SubLObjectFactory.makeSymbol("S#15537", "CYC");
        $ic131$ = SubLObjectFactory.makeSymbol("S#15633", "CYC");
        $ic132$ = SubLObjectFactory.makeSymbol("S#15542", "CYC");
        $ic133$ = SubLObjectFactory.makeSymbol("S#15536", "CYC");
        $ic134$ = SubLObjectFactory.makeSymbol("S#15918", "CYC");
        $ic135$ = SubLObjectFactory.makeSymbol("S#15483", "CYC");
        $ic136$ = SubLObjectFactory.makeSymbol("S#15534", "CYC");
        $ic137$ = SubLObjectFactory.makeSymbol("S#15858", "CYC");
        $ic138$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycLFormula"));
        $ic139$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycLSentence"));
        $ic140$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SkolemFunctionFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SkolemFuncNFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Lambda")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Kappa")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("initialSublists")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NestedDagFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SubDagFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UnifyFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DagFn")) });
        $ic141$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("initialSublists")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("accessSlotForType")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ksImportationTemplate")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NestedDagFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SubDagFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UnifyFn")));
        $ic142$ = SubLObjectFactory.makeString("You're calling the function '~A' which is going to be killed!");
        $ic143$ = SubLObjectFactory.makeString("  Replace all calls to it with '~A' instead!");
        $ic144$ = SubLObjectFactory.makeString("  Notify ~A if you receive this warning and do not know how to fix it.");
        $ic145$ = SubLObjectFactory.makeString("continue anyway");
        $ic146$ = SubLObjectFactory.makeSymbol("EL-VARIABLE?");
        $ic147$ = SubLObjectFactory.makeKeyword("POS");
        $ic148$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("True"));
        $ic149$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("False"));
        $ic150$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic151$ = SubLObjectFactory.makeSymbol("S#15919", "CYC");
        $ic152$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic153$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic154$ = SubLObjectFactory.makeSymbol("S#15433", "CYC");
        $ic155$ = SubLObjectFactory.makeSymbol("EL-VARIABLE-P");
        $ic156$ = SubLObjectFactory.makeKeyword("UNBOUND-SEQ");
        $ic157$ = SubLObjectFactory.makeSymbol("S#15890", "CYC");
        $ic158$ = SubLObjectFactory.makeKeyword("BOUND");
        $ic159$ = SubLObjectFactory.makeKeyword("UNBOUND");
        $ic160$ = SubLObjectFactory.makeKeyword("TERM");
        $ic161$ = SubLObjectFactory.makeSymbol("S#15892", "CYC");
        $ic162$ = ConsesLow.list(new SubLObject[] { module0202.ONE_INTEGER, module0202.THREE_INTEGER, module0202.TWO_INTEGER, module0202.ZERO_INTEGER, module0202.FOUR_INTEGER, module0202.FIVE_INTEGER, module0202.SIX_INTEGER, module0202.SEVEN_INTEGER, module0202.EIGHT_INTEGER, module0202.NINE_INTEGER, module0202.TEN_INTEGER });
    }
    
    public static final class $f12592$UnaryFunction extends UnaryFunction
    {
        public $f12592$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#13439"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0202.f12592(var5);
        }
    }
    
    public static final class $f12594$UnaryFunction extends UnaryFunction
    {
        public $f12594$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#15477"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0202.f12594(var5);
        }
    }
    
    public static final class $f12595$UnaryFunction extends UnaryFunction
    {
        public $f12595$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#13276"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0202.f12595(var5);
        }
    }
    
    public static final class $f12624$UnaryFunction extends UnaryFunction
    {
        public $f12624$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#15480"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0202.f12624(var5);
        }
    }
    
    public static final class $f12640$UnaryFunction extends UnaryFunction
    {
        public $f12640$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#15483"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0202.f12640(var5);
        }
    }
    
    public static final class $f12652$UnaryFunction extends UnaryFunction
    {
        public $f12652$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#15484"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0202.f12652(var5);
        }
    }
    
    public static final class $f12654$UnaryFunction extends UnaryFunction
    {
        public $f12654$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#15485"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0202.f12654(var5);
        }
    }
    
    public static final class $f12590$UnaryFunction extends UnaryFunction
    {
        public $f12590$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#12753"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0202.f12590(var5);
        }
    }
    
    public static final class $f12714$UnaryFunction extends UnaryFunction
    {
        public $f12714$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#15497"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0202.f12714(var5);
        }
    }
    
    public static final class $f12876$UnaryFunction extends UnaryFunction
    {
        public $f12876$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#15515"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0202.f12876(var5);
        }
    }
    
    public static final class $f12895$UnaryFunction extends UnaryFunction
    {
        public $f12895$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#15519"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0202.f12895(var5);
        }
    }
    
    public static final class $f12938$UnaryFunction extends UnaryFunction
    {
        public $f12938$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("GAF?"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0202.f12938(var5);
        }
    }
    
    public static final class $f12977$UnaryFunction extends UnaryFunction
    {
        public $f12977$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#15537"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0202.f12977(var5);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0202.class
	Total time: 1628 ms
	
	Decompiled with Procyon 0.5.32.
*/