package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0552 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0552";
    public static final String myFingerPrint = "d30d426f349458092dd328e2b8768ac3dd8d6790f1a4dea2d11c86233c18570b";
    private static SubLSymbol $g3992$;
    private static SubLSymbol $g3993$;
    private static SubLSymbol $g3994$;
    private static SubLSymbol $g3995$;
    private static SubLSymbol $g3996$;
    private static SubLSymbol $g3997$;
    private static SubLSymbol $g3998$;
    private static SubLSymbol $g3999$;
    private static SubLSymbol $g4000$;
    private static SubLSymbol $g4001$;
    private static SubLSymbol $g4002$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
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
    private static final SubLSymbol $ic20$;
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
    private static final SubLSymbol $ic66$;
    private static final SubLObject $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLObject $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLObject $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLObject $ic74$;
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
    private static final SubLFloat $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLFloat $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLFloat $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
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
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLObject $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLObject $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLInteger $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLObject $ic120$;
    private static final SubLObject $ic121$;
    private static final SubLObject $ic122$;
    private static final SubLObject $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLList $ic130$;
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
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLObject $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLObject $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLObject $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLObject $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLInteger $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLInteger $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLObject $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLList $ic182$;
    private static final SubLInteger $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLList $ic185$;
    private static final SubLInteger $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    
    public static SubLObject f33989(final SubLObject var1) {
        if (NIL != module0173.f10955(var1) && NIL != module0269.f17705(var1)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f33990(final SubLObject var1) {
        return module0206.f13464(var1);
    }
    
    public static SubLObject f33991(final SubLObject var1) {
        return module0207.f13528(var1);
    }
    
    public static SubLObject f33992(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0206.f13500(var1) || NIL != f33993(var1) || NIL != module0206.f13466(var1) || NIL != module0206.f13477(var1));
    }
    
    public static SubLObject f33994(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0206.f13444(var1) && NIL == module0202.f12691(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f33995(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0206.f13444(var1) && NIL != module0202.f12691(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f33996(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f33997(var1) || NIL != f33998(var1));
    }
    
    public static SubLObject f33999(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f33997(var1) || NIL != module0279.f18541(var1));
    }
    
    public static SubLObject f33997(final SubLObject var1) {
        return module0173.f10955(var1);
    }
    
    public static SubLObject f34000(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0206.f13438(var1) || NIL != module0206.f13477(var1));
    }
    
    public static SubLObject f34001(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f34000(var1) || NIL != f34002(var1));
    }
    
    public static SubLObject f34003(final SubLObject var1) {
        return module0206.f13466(var1);
    }
    
    public static SubLObject f34004(final SubLObject var1) {
        return Types.characterp(var1);
    }
    
    public static SubLObject f34005(final SubLObject var1) {
        return module0206.f13479(var1);
    }
    
    public static SubLObject f34006(final SubLObject var1) {
        return module0206.f13480(var1);
    }
    
    public static SubLObject f34007(final SubLObject var1) {
        return module0206.f13482(var1);
    }
    
    public static SubLObject f34008(final SubLObject var1) {
        if (NIL != module0202.f12590(var1)) {
            return (SubLObject)makeBoolean(NIL != module0202.f12641(var1) && module0205.f13203(var1, (SubLObject)UNPROVIDED).isSymbol());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34009(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0206.f13477(var1) || NIL != module0206.f13438(var1) || NIL != module0206.f13466(var1));
    }
    
    public static SubLObject f34010(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0206.f13466(var1) || NIL != module0206.f13477(var1));
    }
    
    public static SubLObject f34011(final SubLObject var1) {
        return module0167.f10813(var1);
    }
    
    public static SubLObject f34002(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f34011(var1) || NIL != f34012(var1));
    }
    
    public static SubLObject f34012(final SubLObject var1) {
        return module0207.f13526(var1);
    }
    
    public static SubLObject f33993(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f33997(var1) || NIL != f34013(var1));
    }
    
    public static SubLObject f34014(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f33993(var1) || NIL != f33998(var1) || NIL != f34015(var1));
    }
    
    public static SubLObject f34016(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f34011(var1) || (NIL != f34012(var1) && NIL == module0202.f12691(var1, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f34017(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f34011(var1) || (NIL != f34012(var1) && NIL != module0202.f12691(var1, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f34018(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f34011(var1) || NIL != f33998(var1));
    }
    
    public static SubLObject f34019(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f34011(var1) || NIL != module0279.f18541(var1));
    }
    
    public static SubLObject f33998(final SubLObject var1) {
        return module0155.f9779(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34020(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f33990(var1) && NIL != module0202.f12691(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34021(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f33990(var1) && NIL == module0202.f12691(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34022(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f34023(var1) || NIL != module0202.f12929(var1));
    }
    
    public static SubLObject f34024(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f34022(var1) && NIL == module0202.f12691(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34025(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f34022(var1) && NIL != module0202.f12691(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34023(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0167.f10813(var1) || NIL != assertion_handles_oc.f11035(var1));
    }
    
    public static SubLObject f34026(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var1) && NIL != module0206.f13438(module0205.f13132(var1)) && NIL != module0210.f13601(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34027(final SubLObject var1) {
        return module0206.f13425(var1);
    }
    
    public static SubLObject f34028(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f34027(var1) && NIL == module0202.f12691(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34029(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f34027(var1) && NIL != module0202.f12691(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34030(final SubLObject var1) {
        final SubLObject var2 = (SubLObject)$ic41$;
        return (SubLObject)makeBoolean(NIL != f34027(var1) && NIL != module0205.f13220(var2, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34031(final SubLObject var1) {
        return module0207.f13509(var1);
    }
    
    public static SubLObject f34032(final SubLObject var1) {
        return module0206.f13433(var1);
    }
    
    public static SubLObject f34033(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f34032(var1) && NIL != module0202.f12691(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34034(final SubLObject var1) {
        return f34035(var1);
    }
    
    public static SubLObject f34036(final SubLObject var1) {
        return module0274.f18101(var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34035(final SubLObject var1) {
        return module0274.f18060(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34037(final SubLObject var1) {
        return module0274.f18101(var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34038(final SubLObject var1) {
        return module0274.f18060(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34039(final SubLObject var1) {
        return module0206.f13453(var1);
    }
    
    public static SubLObject f34040(final SubLObject var1) {
        return (SubLObject)makeBoolean((NIL != f34011(var1) && NIL != module0274.f18172(module0205.f13143(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) || NIL != f34041(var1));
    }
    
    public static SubLObject f34042(final SubLObject var1) {
        return module0207.f13526(var1);
    }
    
    public static SubLObject f34041(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0207.f13526(var1) && NIL != module0274.f18172(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34043(final SubLObject var1) {
        return module0206.f13464(var1);
    }
    
    public static SubLObject f34044(final SubLObject var1) {
        return (SubLObject)makeBoolean((NIL != f33992(var1) && NIL != module0274.f18174(module0205.f13143(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) || NIL != f34045(var1));
    }
    
    public static SubLObject f34046(final SubLObject var1) {
        return module0207.f13528(var1);
    }
    
    public static SubLObject f34045(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0207.f13528(var1) && NIL != module0274.f18174(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34047(final SubLObject var1) {
        return f34036(var1);
    }
    
    public static SubLObject f34048(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f34013(var1) || NIL != f34015(var1));
    }
    
    public static SubLObject f34049(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f34048(var1) && ((NIL != f34013(var1) && NIL != module0202.f12925(module0178.f11303(var1))) || NIL != module0202.f12925(var1)));
    }
    
    public static SubLObject f34050(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0178.f11284(var1) || NIL != module0288.f19311(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34051(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0178.f11290(var1) || NIL != module0288.f19312(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34052(final SubLObject var1) {
        return (SubLObject)makeBoolean((NIL != f34013(var1) && NIL != module0178.f11375(var1)) || NIL != module0288.f19313(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34053(final SubLObject var1) {
        return (SubLObject)makeBoolean((NIL != f34013(var1) && NIL != module0178.f11376(var1)) || NIL != module0288.f19314(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34054(final SubLObject var1) {
        return (SubLObject)makeBoolean((NIL != f34013(var1) && NIL != module0211.f13640(var1)) || NIL != module0288.f19316(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34055(final SubLObject var1) {
        return (SubLObject)makeBoolean((NIL != module0178.f11284(var1) && NIL != f34055(module0178.f11285(var1))) || (NIL != module0202.f12590(var1) && NIL != f34032(var1) && NIL != module0259.f16854(module0205.f13132(var1), $ic67$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f34056(final SubLObject var1) {
        return (SubLObject)makeBoolean((NIL != module0178.f11284(var1) && NIL != f34056(module0178.f11285(var1))) || (NIL != module0202.f12590(var1) && NIL != f34032(var1) && NIL != module0259.f16854(module0205.f13132(var1), $ic69$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f34057(final SubLObject var1) {
        final SubLObject var2 = module0205.f13132(var1);
        final SubLObject var3 = module0288.f19338(var1, (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean((NIL != module0178.f11284(var1) && NIL != f34056(module0178.f11285(var1))) || (NIL != module0202.f12590(var1) && NIL != f34032(var1) && NIL != f34057(var3) && (NIL != module0259.f16854(var2, $ic71$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || $ic72$.eql(var2))));
    }
    
    public static SubLObject f34058(final SubLObject var1) {
        return (SubLObject)makeBoolean((NIL != module0178.f11284(var1) && NIL != f34058(module0178.f11285(var1))) || (NIL != module0202.f12590(var1) && NIL != f34032(var1) && NIL != module0259.f16854(module0205.f13132(var1), $ic74$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f34013(final SubLObject var1) {
        return assertion_handles_oc.f11035(var1);
    }
    
    public static SubLObject f34015(final SubLObject var1) {
        return module0288.f19309(var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34059(final SubLObject var6) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var6) || NIL != f34060(var6) || NIL != f34061(var6));
    }
    
    public static SubLObject f34061(final SubLObject var5) {
        return (SubLObject)makeBoolean(NIL != assertion_handles_oc.f11035(var5) || NIL != module0288.f19309(var5, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34062(final SubLObject var5) {
        return (SubLObject)makeBoolean(NIL != module0178.f11284(var5) || NIL != module0288.f19311(var5, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34063(final SubLObject var5) {
        return (SubLObject)makeBoolean(NIL != module0178.f11290(var5) || NIL != module0288.f19312(var5, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34064(final SubLObject var5) {
        return module0211.f13640(var5);
    }
    
    public static SubLObject f34065(final SubLObject var6) {
        return module0279.f18536(var6);
    }
    
    public static SubLObject f34066(final SubLObject var7) {
        return constant_handles_oc.f8449(var7);
    }
    
    public static SubLObject f34060(final SubLObject var8) {
        return module0279.f18537(var8);
    }
    
    public static SubLObject f34067(final SubLObject var9) {
        return module0202.f12938(var9);
    }
    
    public static SubLObject f34068(final SubLObject var10) {
        return module0202.f12925(var10);
    }
    
    public static SubLObject f34069(final SubLObject var11) {
        return module0210.f13598(var11);
    }
    
    public static SubLObject f34070(final SubLObject var6) {
        return module0210.f13621(var6, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34071(final SubLObject var6) {
        return module0210.f13622(var6, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34072(final SubLObject var6) {
        return module0210.f13623(var6, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34073(final SubLObject var6) {
        return module0210.f13624(var6, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34074(final SubLObject var12) {
        return module0206.f13480(var12);
    }
    
    public static SubLObject f34075(final SubLObject var12) {
        return Types.numberp(var12);
    }
    
    public static SubLObject f34076(final SubLObject var12) {
        return (SubLObject)makeBoolean(NIL != f34074(var12) && var12.isPositive());
    }
    
    public static SubLObject f34077(final SubLObject var12) {
        return (SubLObject)makeBoolean(NIL != f34074(var12) && var12.isNegative());
    }
    
    public static SubLObject f34078(final SubLObject var12) {
        return (SubLObject)makeBoolean(NIL != f34074(var12) && NIL == f34076(var12));
    }
    
    public static SubLObject f34079(final SubLObject var12) {
        return (SubLObject)makeBoolean(NIL != f34074(var12) && NIL == f34077(var12));
    }
    
    public static SubLObject f34080(final SubLObject var12) {
        return f34074(var12);
    }
    
    public static SubLObject f34081(final SubLObject var12) {
        return (SubLObject)makeBoolean(NIL != f34079(var12) && var12.numLE((SubLObject)$ic86$));
    }
    
    public static SubLObject f34082(final SubLObject var12) {
        return (SubLObject)makeBoolean(NIL != f34079(var12) && var12.numLE((SubLObject)$ic88$));
    }
    
    public static SubLObject f34083(final SubLObject var12) {
        return (SubLObject)makeBoolean(NIL != f34074(var12) && var12.numLE((SubLObject)$ic88$) && var12.numGE((SubLObject)$ic90$));
    }
    
    public static SubLObject f34084(final SubLObject var12) {
        return (SubLObject)makeBoolean(NIL != f34079(var12) && var12.numGE((SubLObject)$ic88$));
    }
    
    public static SubLObject f34085(final SubLObject var12) {
        return (SubLObject)makeBoolean(NIL != f34077(var12) || NIL != f34076(var12));
    }
    
    public static SubLObject f34086(final SubLObject var13) {
        return Types.floatp(var13);
    }
    
    public static SubLObject f34087(final SubLObject var14) {
        return f34088(var14);
    }
    
    public static SubLObject f34088(final SubLObject var14) {
        return Types.integerp(var14);
    }
    
    public static SubLObject f34089(final SubLObject var14) {
        return (SubLObject)makeBoolean(NIL != f34087(var14) && var14.isPositive());
    }
    
    public static SubLObject f34090(final SubLObject var1) {
        return module0048.f3414(var1);
    }
    
    public static SubLObject f34091(final SubLObject var1) {
        if (var1.eql((SubLObject)ONE_INTEGER)) {
            return (SubLObject)T;
        }
        if (NIL != module0205.f13145(Symbols.symbol_function((SubLObject)$ic99$), var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        return module0048.f3414(var1);
    }
    
    public static SubLObject f34092(final SubLObject var14) {
        return (SubLObject)makeBoolean(NIL != f34087(var14) && var14.isNegative());
    }
    
    public static SubLObject f34093(final SubLObject var14) {
        return (SubLObject)makeBoolean(NIL != f34087(var14) && NIL == f34089(var14));
    }
    
    public static SubLObject f34094(final SubLObject var14) {
        return (SubLObject)makeBoolean(NIL != f34087(var14) && NIL == f34092(var14));
    }
    
    public static SubLObject f34095(final SubLObject var14) {
        return (SubLObject)makeBoolean(NIL != f34087(var14) && NIL != Numbers.evenp(var14));
    }
    
    public static SubLObject f34096(final SubLObject var14) {
        return (SubLObject)makeBoolean(NIL != f34087(var14) && NIL != Numbers.oddp(var14));
    }
    
    public static SubLObject f34097(final SubLObject var15) {
        return module0051.f3603(var15);
    }
    
    public static SubLObject f34098(final SubLObject var16) {
        return module0051.f3631(var16);
    }
    
    public static SubLObject f34099(final SubLObject var17) {
        final SubLObject var18 = f34100(var17);
        if ($ic109$ == var18) {
            return (SubLObject)T;
        }
        return var18;
    }
    
    public static SubLObject f34101(final SubLObject var17) {
        final SubLObject var18 = f34100(var17);
        if ($ic109$ == var18) {
            return (SubLObject)NIL;
        }
        return var18;
    }
    
    public static SubLObject f34102(final SubLObject var19) {
        final SubLObject var20 = f34103(var19);
        if ($ic109$ == var20) {
            return (SubLObject)T;
        }
        return var20;
    }
    
    public static SubLObject f34104(final SubLObject var19) {
        final SubLObject var20 = f34103(var19);
        if ($ic109$ == var20) {
            return (SubLObject)NIL;
        }
        return var20;
    }
    
    public static SubLObject f34100(final SubLObject var17) {
        if (NIL != module0202.f12679(var17)) {
            return (SubLObject)T;
        }
        if (NIL != f34105(var17)) {
            final SubLObject var18 = module0144.f9460();
            if (NIL != module0173.f10955(var18)) {
                final SubLObject var19 = module0220.f14553(var18, $ic113$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != module0173.f10955(var19)) {
                    return f34106(var17, var19);
                }
            }
        }
        return (SubLObject)$ic109$;
    }
    
    public static SubLObject f34107() {
        final SubLObject var22 = $g3994$.getGlobalValue();
        if (NIL != var22) {
            module0034.f1818(var22);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34108(final SubLObject var1) {
        return module0034.f1829($g3994$.getGlobalValue(), (SubLObject)ConsesLow.list(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34109(final SubLObject var1) {
        return module0259.f16975(var1, $ic115$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34105(final SubLObject var1) {
        SubLObject var2 = $g3994$.getGlobalValue();
        if (NIL == var2) {
            var2 = module0034.f1934((SubLObject)$ic114$, (SubLObject)$ic116$, (SubLObject)$ic117$, (SubLObject)EQUAL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
            module0034.f1940((SubLObject)$ic118$);
        }
        SubLObject var3 = module0034.f1814(var2, var1, (SubLObject)$ic119$);
        if (var3 == $ic119$) {
            var3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f34109(var1)));
            module0034.f1816(var2, var1, var3, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var3);
    }
    
    public static SubLObject f34106(final SubLObject var17, final SubLObject var21) {
        if (NIL != module0202.f12590(var17)) {
            final SubLObject var22 = module0205.f13276(var17);
            if ($ic120$.eql(var22)) {
                final SubLObject var23 = module0205.f13304(var17, (SubLObject)UNPROVIDED);
                return f34110(var23, var21);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34103(final SubLObject var19) {
        if (NIL != module0202.f12672(var19)) {
            return (SubLObject)T;
        }
        if (NIL != module0259.f16975(var19, $ic121$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var20 = module0144.f9460();
            if (NIL != module0173.f10955(var20)) {
                final SubLObject var21 = module0220.f14553(var20, $ic122$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != module0173.f10955(var21)) {
                    return f34111(var19, var21);
                }
            }
        }
        return (SubLObject)$ic109$;
    }
    
    public static SubLObject f34111(final SubLObject var19, final SubLObject var21) {
        if (NIL != module0202.f12590(var19)) {
            final SubLObject var22 = module0205.f13276(var19);
            if ($ic123$.eql(var22)) {
                final SubLObject var23 = module0205.f13304(var19, (SubLObject)UNPROVIDED);
                return f34110(var23, var21);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34110(final SubLObject var19, final SubLObject var28) {
        SubLObject var29 = (SubLObject)NIL;
        if (NIL == var29) {
            SubLObject var30;
            SubLObject var31;
            for (var30 = var19, var31 = (SubLObject)NIL, var31 = var30.first(); NIL == var29 && NIL != var30; var29 = (SubLObject)makeBoolean(NIL == module0305.f20438(var31, var28, (SubLObject)UNPROVIDED) && (NIL == module0151.f9690() || NIL == module0309.f20945(var31))), var30 = var30.rest(), var31 = var30.first()) {
                module0305.f20348();
            }
        }
        return (SubLObject)makeBoolean(NIL == var29);
    }
    
    public static SubLObject f34112(final SubLObject var19) {
        if (NIL != module0202.f12674(var19)) {
            return module0035.f2223(module0202.f12751(var19), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34113(final SubLObject var31) {
        return module0038.f2731(var31);
    }
    
    public static SubLObject f34114(final SubLObject var31) {
        return module0038.f2727(var31);
    }
    
    public static SubLObject f34115(final SubLObject var31) {
        return f34114(var31);
    }
    
    public static SubLObject f34116(final SubLObject var31) {
        return module0048.f3410(var31);
    }
    
    public static SubLObject f34117(final SubLObject var31) {
        return (SubLObject)makeBoolean(NIL != module0038.f2727(var31) && NIL != module0035.f1995(var31, (SubLObject)FIVE_INTEGER, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34118(final SubLObject var31) {
        SubLObject var32 = (SubLObject)NIL;
        if (var31.isString() && NIL != module0035.f1995(var31, (SubLObject)TEN_INTEGER, (SubLObject)UNPROVIDED)) {
            final SubLObject var33 = module0038.f2738(var31, (SubLObject)$ic130$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != module0035.f1995(var33, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
                final SubLObject var34 = var33.first();
                final SubLObject var35 = conses_high.second(var33);
                var32 = (SubLObject)makeBoolean(NIL != module0035.f1995(var34, (SubLObject)FIVE_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0035.f1995(var35, (SubLObject)FOUR_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0038.f2727(var34) && NIL != module0038.f2727(var35));
            }
        }
        return var32;
    }
    
    public static SubLObject f34119(final SubLObject var31) {
        return Guids.guid_string_p(var31);
    }
    
    public static SubLObject f34120(final SubLObject var31) {
        return (SubLObject)makeBoolean(NIL != module0038.f2727(var31) && NIL != module0035.f1994(var31, (SubLObject)SIX_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0035.f2000(var31, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34121(final SubLObject var31) {
        return module0039.f3015(var31);
    }
    
    public static SubLObject f34122(final SubLObject var31) {
        return module0039.f3006(var31);
    }
    
    public static SubLObject f34123(final SubLObject var1) {
        return module0589.f35909(var1);
    }
    
    public static SubLObject f34124(final SubLObject var1) {
        return f34125(var1, (SubLObject)ELEVEN_INTEGER);
    }
    
    public static SubLObject f34125(final SubLObject var31, final SubLObject var36) {
        return (SubLObject)makeBoolean(var36.isNumber() && var31.isString() && var36.numE(Sequences.length(var31)) && NIL != f34115(var31));
    }
    
    public static SubLObject f34126(final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)NIL;
        final SubLObject var40 = module0271.$g2563$.currentBinding(var38);
        try {
            module0271.$g2563$.bind((SubLObject)NIL, var38);
            var39 = ((NIL != module0152.$g2120$.getDynamicValue(var38)) ? module0274.f18164(var37, (SubLObject)UNPROVIDED) : module0274.f18060(var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        finally {
            module0271.$g2563$.rebind(var40, var38);
        }
        return var39;
    }
    
    public static SubLObject f34127(final SubLObject var37) {
        return module0274.f18169(var37, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34128(final SubLObject var37) {
        return module0274.f18101(var37, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34129(final SubLObject var37) {
        return module0206.f13425(var37);
    }
    
    public static SubLObject f34130(final SubLObject var1) {
        return module0210.f13571(var1);
    }
    
    public static SubLObject f34131(final SubLObject var1) {
        return module0202.f12932(var1);
    }
    
    public static SubLObject f34132(final SubLObject var41) {
        return module0201.f12546(var41);
    }
    
    public static SubLObject f34133(final SubLObject var42) {
        return (SubLObject)T;
    }
    
    public static SubLObject f34134(final SubLObject var42) {
        return module0202.f12639(var42);
    }
    
    public static SubLObject f34135(final SubLObject var42) {
        return (SubLObject)T;
    }
    
    public static SubLObject f34136(final SubLObject var6, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = module0147.$g2095$.getDynamicValue();
        }
        if (NIL != module0608.f37152(var6)) {
            return (SubLObject)T;
        }
        if (NIL != module0131.f8560() && NIL != module0202.f12590(var6)) {
            if (NIL != module0202.f12734(var6, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
                return (SubLObject)makeBoolean(module0205.f13203(var6, (SubLObject)UNPROVIDED).isNumber() && NIL != f34137(module0205.f13136(var6), var43));
            }
            if (NIL != module0202.f12734(var6, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
                return (SubLObject)makeBoolean(module0205.f13203(var6, (SubLObject)UNPROVIDED).isNumber() && NIL != f34137(module0205.f13136(var6), var43) && module0205.f13204(var6, (SubLObject)UNPROVIDED).numGE(module0205.f13203(var6, (SubLObject)UNPROVIDED)));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34138(final SubLObject var6) {
        return f34136(var6, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34139(final SubLObject var6, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = module0147.$g2095$.getDynamicValue();
        }
        if (NIL != module0608.f37152(var6)) {
            return (SubLObject)T;
        }
        if (NIL != module0131.f8560() && NIL != module0202.f12590(var6) && NIL == module0202.f12673(var6)) {
            final SubLObject var44 = module0202.f12728(var6, (SubLObject)UNPROVIDED);
            return (SubLObject)makeBoolean(var44.numGE((SubLObject)TWO_INTEGER) && conses_high.second(var6).isNumber() && NIL != f34137(var6.first(), var43) && (var44.numE((SubLObject)TWO_INTEGER) || (var44.numE((SubLObject)THREE_INTEGER) && conses_high.third(var6).isNumber() && conses_high.third(var6).numE(conses_high.second(var6)))));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34140(final SubLObject var6, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = module0147.$g2095$.getDynamicValue();
        }
        if (var6.isNumber()) {
            return Numbers.numGE(var6, (SubLObject)ZERO_INTEGER);
        }
        if (NIL != module0131.f8560() && NIL != module0202.f12590(var6) && NIL == module0202.f12673(var6)) {
            final SubLObject var44 = module0202.f12728(var6, (SubLObject)UNPROVIDED);
            return (SubLObject)makeBoolean(var44.numGE((SubLObject)TWO_INTEGER) && conses_high.second(var6).isNumber() && conses_high.second(var6).numGE((SubLObject)ZERO_INTEGER) && NIL != f34137(var6.first(), var43) && (var44.numE((SubLObject)TWO_INTEGER) || (var44.numE((SubLObject)THREE_INTEGER) && conses_high.third(var6).isNumber() && conses_high.third(var6).numGE(conses_high.second(var6)))));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34141(final SubLObject var6, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = module0147.$g2095$.getDynamicValue();
        }
        if (var6.isNumber()) {
            return Numbers.numG(var6, (SubLObject)ZERO_INTEGER);
        }
        if (NIL != module0131.f8560() && NIL != module0202.f12590(var6) && NIL == module0202.f12673(var6)) {
            final SubLObject var44 = module0202.f12728(var6, (SubLObject)UNPROVIDED);
            return (SubLObject)makeBoolean(var44.numGE((SubLObject)TWO_INTEGER) && conses_high.second(var6).isNumber() && conses_high.second(var6).numG((SubLObject)ZERO_INTEGER) && NIL != f34137(var6.first(), var43) && (var44.numE((SubLObject)TWO_INTEGER) || (var44.numE((SubLObject)THREE_INTEGER) && conses_high.third(var6).isNumber() && conses_high.third(var6).numGE(conses_high.second(var6)))));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34142(final SubLObject var6, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = module0147.$g2095$.getDynamicValue();
        }
        if (var6.isNumber()) {
            return Numbers.numL(var6, (SubLObject)ZERO_INTEGER);
        }
        if (NIL != module0131.f8560() && NIL != module0202.f12590(var6) && NIL == module0202.f12673(var6)) {
            final SubLObject var44 = module0202.f12728(var6, (SubLObject)UNPROVIDED);
            return (SubLObject)makeBoolean(var44.numGE((SubLObject)TWO_INTEGER) && conses_high.second(var6).isNumber() && conses_high.second(var6).numL((SubLObject)ZERO_INTEGER) && NIL != f34137(var6.first(), var43) && (var44.numE((SubLObject)TWO_INTEGER) || (var44.numE((SubLObject)THREE_INTEGER) && conses_high.third(var6).isNumber() && conses_high.third(var6).numL((SubLObject)ZERO_INTEGER) && conses_high.third(var6).numGE(conses_high.second(var6)))));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34137(final SubLObject var6, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = module0147.$g2095$.getDynamicValue();
        }
        if (NIL != module0131.f8560()) {
            return module0259.f16854(var6, $ic153$, var43, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34143(final SubLObject var44) {
        if (NIL != module0202.f12590(var44) && NIL == module0202.f12673(var44) && NIL == module0035.f2194(var44, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
            SubLObject var45 = (SubLObject)NIL;
            if (NIL == var45) {
                SubLObject var46 = var44;
                SubLObject var47 = (SubLObject)NIL;
                var47 = var46.first();
                while (NIL == var45 && NIL != var46) {
                    if (NIL == module0210.f13573(var47)) {
                        var45 = (SubLObject)T;
                    }
                    var46 = var46.rest();
                    var47 = var46.first();
                }
            }
            return (SubLObject)makeBoolean(NIL == var45);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34144(final SubLObject var1) {
        if (NIL == var1 || NIL != module0035.f2014(var1)) {
            SubLObject var2 = (SubLObject)NIL;
            if (NIL == var2) {
                SubLObject var3 = var1;
                SubLObject var4 = (SubLObject)NIL;
                var4 = var3.first();
                while (NIL == var2 && NIL != var3) {
                    if (NIL == module0201.f12546(var4) && NIL == module0201.f12581(var4)) {
                        var2 = (SubLObject)T;
                    }
                    var3 = var3.rest();
                    var4 = var3.first();
                }
            }
            return (SubLObject)makeBoolean(NIL == var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34145(final SubLObject var1) {
        return module0202.f12940(var1);
    }
    
    public static SubLObject f34146(final SubLObject var1) {
        return (SubLObject)makeBoolean(!var1.isCons() && NIL == module0173.f10955(var1));
    }
    
    public static SubLObject f34147(final SubLObject var1) {
        if (NIL == module0202.f12590(var1)) {
            return (SubLObject)NIL;
        }
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = module0205.f13180(var1, (SubLObject)$ic158$);
        SubLObject var4;
        SubLObject var5;
        for (var4 = (SubLObject)NIL, var4 = var3; NIL == var2 && NIL != var4; var4 = var4.rest()) {
            var5 = var4.first();
            if (!var5.isList()) {
                var2 = (SubLObject)T;
            }
        }
        return (SubLObject)makeBoolean(NIL == var2);
    }
    
    public static SubLObject f34148(final SubLObject var31) {
        if (var31.isString()) {
            final SubLObject var32 = module0144.f9460();
            if (NIL != module0173.f10955(var32)) {
                final SubLObject var33 = module0220.f14553(var32, $ic161$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (var33.isInteger()) {
                    return Numbers.numE(var33, Sequences.length(var31));
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34149(final SubLObject var31) {
        if (var31.isString()) {
            final SubLObject var32 = module0144.f9460();
            if (NIL != module0173.f10955(var32)) {
                final SubLObject var33 = module0220.f14553(var32, $ic163$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (var33.isInteger()) {
                    return Numbers.numLE(var33, Sequences.length(var31));
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34150(final SubLObject var31) {
        if (var31.isString()) {
            final SubLObject var32 = module0144.f9460();
            if (NIL != module0173.f10955(var32)) {
                final SubLObject var33 = module0220.f14553(var32, $ic165$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (var33.isInteger()) {
                    return Numbers.numGE(var33, Sequences.length(var31));
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34151(final SubLObject var19) {
        if (var19.isList()) {
            final SubLObject var20 = module0144.f9460();
            if (NIL != module0173.f10955(var20)) {
                final SubLObject var21 = module0220.f14553(var20, $ic161$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (var21.isInteger()) {
                    return f34152(var19, var21);
                }
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34152(final SubLObject var19, final SubLObject var36) {
        if (!var19.isCons()) {
            return (SubLObject)NIL;
        }
        final SubLObject var37 = module0205.f13276(var19);
        if (!var37.eql($ic123$)) {
            return (SubLObject)NIL;
        }
        final SubLObject var38 = module0205.f13360(var19, (SubLObject)UNPROVIDED);
        return Numbers.numE(var38, var36);
    }
    
    public static SubLObject f34153(final SubLObject var6) {
        return module0793.f50777(var6);
    }
    
    public static SubLObject f34154(final SubLObject var1) {
        if (NIL != module0202.f12639(var1)) {
            return module0360.f23781(module0202.f12759(var1));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34155(final SubLObject var1) {
        if (NIL != module0202.f12639(var1)) {
            return module0130.f8520(module0202.f12759(var1));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34156(final SubLObject var1) {
        if (NIL != module0202.f12639(var1)) {
            return module0333.f22421(module0202.f12759(var1));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34157(final SubLObject var1) {
        if (NIL != module0202.f12639(var1)) {
            return module0191.f11939(module0202.f12759(var1));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34158(final SubLObject var1) {
        if (NIL != module0202.f12639(var1)) {
            return module0630.f38672(module0202.f12759(var1));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34159(final SubLObject var6) {
        return (SubLObject)makeBoolean(var6.isInteger() && var6.numG($g3995$.getGlobalValue()) && var6.numL($g3996$.getGlobalValue()));
    }
    
    public static SubLObject f34160(final SubLObject var6) {
        return (SubLObject)makeBoolean(var6.isInteger() && var6.numG($g3997$.getGlobalValue()) && var6.numL($g3998$.getGlobalValue()));
    }
    
    public static SubLObject f34161(final SubLObject var6) {
        return (SubLObject)makeBoolean(var6.isInteger() && var6.numG($g3999$.getGlobalValue()) && var6.numL($g4000$.getGlobalValue()));
    }
    
    public static SubLObject f34162(final SubLObject var6) {
        return (SubLObject)makeBoolean(var6.isInteger() && var6.numG($g4001$.getGlobalValue()) && var6.numL($g4002$.getGlobalValue()));
    }
    
    public static SubLObject f34163(final SubLObject var6) {
        return module0259.f16854(var6, $ic179$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34164(final SubLObject var6) {
        return (SubLObject)makeBoolean(var6.isList() && NIL != module0035.f2370((SubLObject)$ic180$, var6, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34165(final SubLObject var6) {
        if (!var6.isString()) {
            return (SubLObject)NIL;
        }
        final SubLObject var7 = module0038.f2738(var6, (SubLObject)$ic182$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == module0035.f1995(var7, (SubLObject)FOUR_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        SubLObject var8 = var7;
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            if (NIL != module0038.f2608(var9)) {
                return (SubLObject)NIL;
            }
            final SubLObject var10 = module0038.f2642(var9);
            if (!var10.isInteger() || !var10.numL((SubLObject)$ic183$) || !var10.numGE((SubLObject)ZERO_INTEGER)) {
                return (SubLObject)NIL;
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f34166(final SubLObject var6) {
        if (!var6.isString()) {
            return (SubLObject)NIL;
        }
        final SubLObject var7 = module0038.f2738(var6, (SubLObject)$ic185$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == module0035.f1994(var7, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) || NIL == module0035.f2002(var7, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f1997(var7)) {
            final SubLObject var8 = var7.first();
            return f34165(var8);
        }
        final SubLObject var9 = conses_high.second(var7);
        if (NIL != module0038.f2608(var9)) {
            return (SubLObject)NIL;
        }
        final SubLObject var10 = module0038.f2642(var9);
        if (!var10.isInteger()) {
            return (SubLObject)NIL;
        }
        if (var10.numGE((SubLObject)ZERO_INTEGER) && var10.numL((SubLObject)$ic186$)) {
            final SubLObject var11 = var7.first();
            return f34165(var11);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34167(final SubLObject var19) {
        if (var19.isList()) {
            final SubLObject var20 = module0144.f9460();
            if (NIL != module0173.f10955(var20)) {
                final SubLObject var21 = module0220.f14553(var20, $ic163$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (var21.isInteger()) {
                    return f34168(var19, var21);
                }
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34168(final SubLObject var19, final SubLObject var36) {
        if (!var19.isCons()) {
            return (SubLObject)NIL;
        }
        final SubLObject var37 = module0205.f13276(var19);
        if (!var37.eql($ic123$)) {
            return (SubLObject)NIL;
        }
        final SubLObject var38 = module0205.f13360(var19, (SubLObject)UNPROVIDED);
        return Numbers.numGE(var38, var36);
    }
    
    public static SubLObject f34169(final SubLObject var19) {
        if (var19.isList()) {
            final SubLObject var20 = module0144.f9460();
            if (NIL != module0173.f10955(var20)) {
                final SubLObject var21 = module0220.f14553(var20, $ic165$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (var21.isInteger()) {
                    return f34170(var19, var21);
                }
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34170(final SubLObject var19, final SubLObject var36) {
        if (!var19.isCons()) {
            return (SubLObject)NIL;
        }
        final SubLObject var37 = module0205.f13276(var19);
        if (!var37.eql($ic123$)) {
            return (SubLObject)NIL;
        }
        final SubLObject var38 = module0205.f13360(var19, (SubLObject)UNPROVIDED);
        return Numbers.numLE(var38, var36);
    }
    
    public static SubLObject f34171() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f33989", "CYC-INDIVIDUAL-NECESSARY", 1, 0, false);
        new $f33989$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f33990", "CYCL-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f33991", "EL-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f33992", "HL-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f33994", "CYCL-OPEN-DENOTATIONAL-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f33995", "CYCL-CLOSED-DENOTATIONAL-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f33996", "CYCL-REIFIABLE-DENOTATIONAL-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f33999", "CYCL-REIFIED-DENOTATIONAL-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f33997", "HL-CLOSED-DENOTATIONAL-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34000", "CYCL-REPRESENTED-ATOMIC-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34001", "CYCL-REPRESENTED-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34003", "CYC-SYSTEM-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34004", "CYC-SYSTEM-CHARACTER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34005", "CYC-SYSTEM-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34006", "CYC-SYSTEM-REAL-NUMBER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34007", "CYC-SYSTEM-NON-VARIABLE-SYMBOL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34008", "CYCL-SUBL-SYMBOL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34009", "CYCL-ATOMIC-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34010", "CYCL-CLOSED-ATOMIC-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34011", "HL-NON-ATOMIC-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34002", "CYCL-NON-ATOMIC-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34012", "EL-NON-ATOMIC-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f33993", "HL-INDEXED-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34014", "CYCL-INDEXED-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34016", "CYCL-OPEN-NON-ATOMIC-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34017", "CYCL-CLOSED-NON-ATOMIC-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34018", "CYCL-REIFIABLE-NON-ATOMIC-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34019", "CYCL-NON-ATOMIC-REIFIED-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f33998", "EL-REIFIABLE-NON-ATOMIC-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34020", "CYCL-CLOSED-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34021", "CYCL-OPEN-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34022", "CYCL-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34024", "CYCL-OPEN-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34025", "CYCL-CLOSED-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34023", "HL-FORMULA-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34026", "CYCL-UNBOUND-RELATION-FORMULA-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34027", "CYCL-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34028", "CYCL-OPEN-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34029", "CYCL-CLOSED-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34030", "CYC-TYPICALITY-REFERENCE-SET-PROPERTY?", 1, 0, false);
        new $f34030$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34031", "EL-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34032", "CYCL-ATOMIC-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34033", "CYCL-CLOSED-ATOMIC-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34034", "CYCL-PROPOSITIONAL-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34036", "CYCL-SENTENCE-ASKABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34035", "CYCL-SENTENCE-ASSERTIBLE?", 1, 0, false);
        new $f34035$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34037", "EL-SENTENCE-ASKABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34038", "EL-SENTENCE-ASSERTIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34039", "CYCL-NON-ATOMIC-TERM-ASKABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34040", "CYCL-NON-ATOMIC-TERM-ASSERTIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34042", "EL-NON-ATOMIC-TERM-ASKABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34041", "EL-NON-ATOMIC-TERM-ASSERTIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34043", "CYCL-EXPRESSION-ASKABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34044", "CYCL-EXPRESSION-ASSERTIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34046", "EL-EXPRESSION-ASKABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34045", "EL-EXPRESSION-ASSERTIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34047", "CYCL-QUERY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34048", "CYCL-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34049", "CYCL-ATOMIC-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34050", "CYCL-GAF-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34051", "CYCL-RULE-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34052", "CYCL-ASSERTED-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34053", "CYCL-DEDUCED-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34054", "CYCL-NL-SEMANTIC-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34055", "CYCL-CANONICALIZER-DIRECTIVE?", 1, 0, false);
        new $f34055$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34056", "CYCL-REFORMULATOR-DIRECTIVE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34057", "CYCL-REFORMULATOR-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34058", "CYCL-SIMPLIFIER-DIRECTIVE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34013", "HL-ASSERTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34015", "EL-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34059", "S#37380", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34061", "S#22924", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34062", "S#37381", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34063", "S#37382", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34064", "S#37383", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34065", "S#37384", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34066", "S#37385", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34060", "S#37386", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34067", "S#37387", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34068", "S#37388", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34069", "S#37389", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34070", "S#37390", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34071", "CYC-GROUND-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34072", "S#37391", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34073", "S#37392", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34074", "CYC-REAL-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34075", "CYC-SYSTEM-REAL-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34076", "CYC-POSITIVE-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34077", "CYC-NEGATIVE-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34078", "CYC-NON-POSITIVE-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34079", "CYC-NON-NEGATIVE-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34080", "CYC-RATIONAL-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34081", "CYC-REAL-0-100", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34082", "CYC-REAL-0-1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34083", "CYC-REAL-MINUS-1-TO-PLUS-1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34084", "CYC-REAL-1-INFINITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34085", "CYC-NONZERO-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34086", "CYC-SYSTEM-FLOAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34087", "CYC-INTEGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34088", "CYC-SYSTEM-INTEGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34089", "CYC-POSITIVE-INTEGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34090", "CYC-PRIME-NUMBER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34091", "CYC-MAYBE-PRIME-NUMBER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34092", "CYC-NEGATIVE-INTEGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34093", "CYC-NON-POSITIVE-INTEGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34094", "CYC-NON-NEGATIVE-INTEGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34095", "CYC-EVEN-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34096", "CYC-ODD-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34097", "CYC-UNIVERSAL-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34098", "CYC-UNIVERSAL-SECOND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34099", "CYC-SET-OF-TYPE-NECESSARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34101", "CYC-SET-OF-TYPE-SUFFICIENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34102", "CYC-LIST-OF-TYPE-NECESSARY", 1, 0, false);
        new $f34102$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34104", "CYC-LIST-OF-TYPE-SUFFICIENT", 1, 0, false);
        new $f34104$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34100", "S#37393", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34107", "S#37377", 0, 0, false);
        new $f34107$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34108", "S#37394", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34109", "S#37395", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34105", "S#37396", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34106", "S#37397", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34103", "S#37398", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34111", "S#37399", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34110", "S#37400", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34112", "CYC-LIST-WITHOUT-REPETITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34113", "CYC-NUMERIC-STRING-NECESSARY", 1, 0, false);
        new $f34113$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34114", "CYC-NUMERAL-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34115", "CYC-NUMERIC-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34116", "CYC-NUMBER-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34117", "CYC-ZIP-CODE-FIVE-DIGIT", 1, 0, false);
        new $f34117$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34118", "CYC-ZIP-CODE-NINE-DIGIT", 1, 0, false);
        new $f34118$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34119", "CYC-GUID-STRING-P", 1, 0, false);
        new $f34119$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34120", "CYC-NAICS-CODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34121", "CYC-UNICODE-DENOTING-ASCII-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34122", "CYC-ASCII-STRING-P", 1, 0, false);
        new $f34122$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34123", "CYC-URL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34124", "DOCTOR-ME-ID?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34125", "S#37401", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34126", "CLPE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34127", "CYC-QUERY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34128", "CYC-SYNTACTIC-FORMULA-ARITY-OK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34129", "CYC-SYNTACTIC-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34130", "FUNCTION-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34131", "CYC-RELATION-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34132", "EL-VARIABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34133", "CYC-SUBL-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34134", "CYC-SUBL-ESCAPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34135", "CYC-SUBL-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34136", "IBQE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34138", "S#37402", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34139", "SCALAR-POINT-VALUE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34140", "NON-NEGATIVE-SCALAR-INTERVAL?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34141", "POSITIVE-SCALAR-INTERVAL?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34142", "NEGATIVE-SCALAR-INTERVAL?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34137", "S#37403", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34143", "TERM-SET?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34144", "CYCL-VAR-LIST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34145", "CYC-EL-VAR-LIST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34146", "CYC-SYSTEM-ATOM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34147", "CYC-LIST-OF-LISTS", 1, 0, false);
        new $f34147$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34148", "CYC-STRING-IS-LENGTH", 1, 0, false);
        new $f34148$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34149", "CYC-STRING-IS-MINIMUM-LENGTH", 1, 0, false);
        new $f34149$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34150", "CYC-STRING-IS-MAXIMUM-LENGTH", 1, 0, false);
        new $f34150$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34151", "CYC-LIST-IS-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34152", "S#37404", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34153", "RTP-SYNTACTIC-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34154", "CYC-SUBL-QUERY-PROPERTY-P", 1, 0, false);
        new $f34154$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34155", "CYC-SUBL-TV-P", 1, 0, false);
        new $f34155$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34156", "CYC-SUBL-HL-SUPPORT-MODULE-P", 1, 0, false);
        new $f34156$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34157", "CYC-SUBL-ASSERTED-ARGUMENT-TOKEN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34158", "CYC-SUBL-KCT-METRIC-IDENTIFIER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34159", "CYC-8-BYTE-INTEGER", 1, 0, false);
        new $f34159$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34160", "CYC-4-BYTE-INTEGER", 1, 0, false);
        new $f34160$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34161", "CYC-2-BYTE-INTEGER", 1, 0, false);
        new $f34161$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34162", "CYC-1-BYTE-INTEGER", 1, 0, false);
        new $f34162$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34163", "CYC-BIT-DATATYPE", 1, 0, false);
        new $f34163$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34164", "CYC-BIT-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34165", "CYC-IP4-ADDRESS", 1, 0, false);
        new $f34165$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34166", "CYC-IP4-NETWORK-ADDRESS", 1, 0, false);
        new $f34166$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34167", "CYC-LIST-IS-MINIMUM-LENGTH", 1, 0, false);
        new $f34167$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34168", "S#37405", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34169", "CYC-LIST-IS-MAXIMUM-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0552", "f34170", "S#37406", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34172() {
        $g3992$ = SubLFiles.deflexical("S#37407", (SubLObject)$ic0$);
        $g3993$ = SubLFiles.deflexical("S#37408", (SubLObject)$ic1$);
        $g3994$ = SubLFiles.deflexical("S#37409", (SubLObject)NIL);
        $g3995$ = SubLFiles.defconstant("S#37410", Numbers.subtract(Numbers.minus(Numbers.expt((SubLObject)TWO_INTEGER, (SubLObject)$ic173$)), (SubLObject)ONE_INTEGER));
        $g3996$ = SubLFiles.defconstant("S#37411", Numbers.expt((SubLObject)TWO_INTEGER, (SubLObject)$ic173$));
        $g3997$ = SubLFiles.defconstant("S#37412", Numbers.subtract(Numbers.minus(Numbers.expt((SubLObject)TWO_INTEGER, (SubLObject)$ic175$)), (SubLObject)ONE_INTEGER));
        $g3998$ = SubLFiles.defconstant("S#37413", Numbers.expt((SubLObject)TWO_INTEGER, (SubLObject)$ic175$));
        $g3999$ = SubLFiles.defconstant("S#37414", Numbers.subtract(Numbers.minus(Numbers.expt((SubLObject)TWO_INTEGER, (SubLObject)FIFTEEN_INTEGER)), (SubLObject)ONE_INTEGER));
        $g4000$ = SubLFiles.defconstant("S#37415", Numbers.expt((SubLObject)TWO_INTEGER, (SubLObject)FIFTEEN_INTEGER));
        $g4001$ = SubLFiles.defconstant("S#37416", Numbers.subtract(Numbers.minus(Numbers.expt((SubLObject)TWO_INTEGER, (SubLObject)SEVEN_INTEGER)), (SubLObject)ONE_INTEGER));
        $g4002$ = SubLFiles.defconstant("S#37417", Numbers.expt((SubLObject)TWO_INTEGER, (SubLObject)SEVEN_INTEGER));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34173() {
        SubLObject var54 = $g3992$.getGlobalValue();
        SubLObject var55 = (SubLObject)NIL;
        var55 = var54.first();
        while (NIL != var54) {
            module0012.f416(var55);
            var54 = var54.rest();
            var55 = var54.first();
        }
        var54 = $g3993$.getGlobalValue();
        var55 = (SubLObject)NIL;
        var55 = var54.first();
        while (NIL != var54) {
            module0012.f416(var55);
            var54 = var54.rest();
            var55 = var54.first();
        }
        module0012.f416((SubLObject)$ic2$);
        module0012.f416((SubLObject)$ic3$);
        module0012.f416((SubLObject)$ic4$);
        module0012.f416((SubLObject)$ic5$);
        module0012.f416((SubLObject)$ic6$);
        module0012.f416((SubLObject)$ic7$);
        module0012.f416((SubLObject)$ic8$);
        module0012.f416((SubLObject)$ic9$);
        module0012.f416((SubLObject)$ic10$);
        module0012.f416((SubLObject)$ic11$);
        module0012.f416((SubLObject)$ic12$);
        module0012.f416((SubLObject)$ic13$);
        module0012.f416((SubLObject)$ic14$);
        module0012.f416((SubLObject)$ic15$);
        module0012.f416((SubLObject)$ic16$);
        module0012.f416((SubLObject)$ic17$);
        module0012.f416((SubLObject)$ic18$);
        module0012.f416((SubLObject)$ic19$);
        module0012.f416((SubLObject)$ic20$);
        module0012.f416((SubLObject)$ic21$);
        module0012.f416((SubLObject)$ic22$);
        module0012.f416((SubLObject)$ic23$);
        module0012.f416((SubLObject)$ic24$);
        module0012.f416((SubLObject)$ic25$);
        module0012.f416((SubLObject)$ic26$);
        module0012.f416((SubLObject)$ic27$);
        module0012.f416((SubLObject)$ic28$);
        module0012.f416((SubLObject)$ic29$);
        module0012.f416((SubLObject)$ic30$);
        module0012.f416((SubLObject)$ic31$);
        module0012.f416((SubLObject)$ic32$);
        module0012.f416((SubLObject)$ic33$);
        module0012.f416((SubLObject)$ic34$);
        module0012.f416((SubLObject)$ic35$);
        module0012.f416((SubLObject)$ic36$);
        module0012.f416((SubLObject)$ic37$);
        module0012.f416((SubLObject)$ic38$);
        module0012.f416((SubLObject)$ic39$);
        module0012.f416((SubLObject)$ic40$);
        module0012.f416((SubLObject)$ic42$);
        module0012.f416((SubLObject)$ic43$);
        module0012.f416((SubLObject)$ic44$);
        module0012.f416((SubLObject)$ic45$);
        module0012.f416((SubLObject)$ic46$);
        module0012.f416((SubLObject)$ic47$);
        module0012.f416((SubLObject)$ic48$);
        module0012.f416((SubLObject)$ic49$);
        module0012.f416((SubLObject)$ic50$);
        module0012.f416((SubLObject)$ic51$);
        module0012.f416((SubLObject)$ic52$);
        module0012.f416((SubLObject)$ic53$);
        module0012.f416((SubLObject)$ic54$);
        module0012.f416((SubLObject)$ic55$);
        module0012.f416((SubLObject)$ic56$);
        module0012.f416((SubLObject)$ic57$);
        module0012.f416((SubLObject)$ic58$);
        module0012.f416((SubLObject)$ic59$);
        module0012.f416((SubLObject)$ic60$);
        module0012.f416((SubLObject)$ic61$);
        module0012.f416((SubLObject)$ic62$);
        module0012.f416((SubLObject)$ic63$);
        module0012.f416((SubLObject)$ic64$);
        module0012.f416((SubLObject)$ic65$);
        module0012.f416((SubLObject)$ic66$);
        module0012.f416((SubLObject)$ic68$);
        module0012.f416((SubLObject)$ic70$);
        module0012.f416((SubLObject)$ic73$);
        module0012.f416((SubLObject)$ic75$);
        module0012.f416((SubLObject)$ic76$);
        module0012.f416((SubLObject)$ic77$);
        module0012.f416((SubLObject)$ic78$);
        module0012.f416((SubLObject)$ic79$);
        module0012.f416((SubLObject)$ic80$);
        module0012.f416((SubLObject)$ic81$);
        module0012.f416((SubLObject)$ic82$);
        module0012.f416((SubLObject)$ic83$);
        module0012.f416((SubLObject)$ic84$);
        module0012.f416((SubLObject)$ic85$);
        module0012.f416((SubLObject)$ic87$);
        module0012.f416((SubLObject)$ic89$);
        module0012.f416((SubLObject)$ic91$);
        module0012.f416((SubLObject)$ic92$);
        module0012.f416((SubLObject)$ic93$);
        module0012.f416((SubLObject)$ic94$);
        module0012.f416((SubLObject)$ic95$);
        module0012.f416((SubLObject)$ic96$);
        module0012.f416((SubLObject)$ic97$);
        module0012.f416((SubLObject)$ic98$);
        module0012.f416((SubLObject)$ic100$);
        module0012.f416((SubLObject)$ic101$);
        module0012.f416((SubLObject)$ic102$);
        module0012.f416((SubLObject)$ic103$);
        module0012.f416((SubLObject)$ic104$);
        module0012.f416((SubLObject)$ic105$);
        module0012.f416((SubLObject)$ic106$);
        module0012.f416((SubLObject)$ic107$);
        if ($ic108$.isSymbol()) {
            final SubLObject var56 = (SubLObject)$ic108$;
            if (NIL == conses_high.member(var56, module0144.$g1862$.getDynamicValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                module0144.$g1862$.setDynamicValue((SubLObject)ConsesLow.cons(var56, module0144.$g1862$.getDynamicValue()));
            }
        }
        module0012.f416((SubLObject)$ic108$);
        if ($ic110$.isSymbol()) {
            final SubLObject var56 = (SubLObject)$ic110$;
            if (NIL == conses_high.member(var56, module0144.$g1862$.getDynamicValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                module0144.$g1862$.setDynamicValue((SubLObject)ConsesLow.cons(var56, module0144.$g1862$.getDynamicValue()));
            }
        }
        module0012.f416((SubLObject)$ic110$);
        if ($ic111$.isSymbol()) {
            final SubLObject var56 = (SubLObject)$ic111$;
            if (NIL == conses_high.member(var56, module0144.$g1862$.getDynamicValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                module0144.$g1862$.setDynamicValue((SubLObject)ConsesLow.cons(var56, module0144.$g1862$.getDynamicValue()));
            }
        }
        module0012.f416((SubLObject)$ic111$);
        if ($ic112$.isSymbol()) {
            final SubLObject var56 = (SubLObject)$ic112$;
            if (NIL == conses_high.member(var56, module0144.$g1862$.getDynamicValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                module0144.$g1862$.setDynamicValue((SubLObject)ConsesLow.cons(var56, module0144.$g1862$.getDynamicValue()));
            }
        }
        module0012.f416((SubLObject)$ic112$);
        module0034.f1909((SubLObject)$ic114$);
        module0012.f416((SubLObject)$ic124$);
        module0012.f416((SubLObject)$ic125$);
        module0012.f416((SubLObject)$ic126$);
        module0012.f416((SubLObject)$ic127$);
        module0012.f416((SubLObject)$ic128$);
        module0012.f416((SubLObject)$ic129$);
        module0012.f416((SubLObject)$ic131$);
        module0012.f416((SubLObject)$ic132$);
        module0012.f416((SubLObject)$ic133$);
        module0012.f416((SubLObject)$ic134$);
        module0012.f416((SubLObject)$ic135$);
        module0012.f416((SubLObject)$ic136$);
        module0012.f416((SubLObject)$ic137$);
        module0012.f416((SubLObject)$ic138$);
        module0012.f416((SubLObject)$ic139$);
        module0012.f416((SubLObject)$ic140$);
        module0012.f416((SubLObject)$ic141$);
        module0012.f416((SubLObject)$ic142$);
        module0012.f416((SubLObject)$ic143$);
        module0012.f416((SubLObject)$ic144$);
        module0012.f416((SubLObject)$ic145$);
        module0012.f416((SubLObject)$ic146$);
        module0012.f416((SubLObject)$ic147$);
        module0012.f416((SubLObject)$ic148$);
        module0012.f416((SubLObject)$ic149$);
        module0012.f416((SubLObject)$ic150$);
        module0012.f416((SubLObject)$ic151$);
        module0012.f416((SubLObject)$ic152$);
        module0012.f416((SubLObject)$ic154$);
        module0012.f416((SubLObject)$ic155$);
        module0012.f416((SubLObject)$ic156$);
        module0012.f416((SubLObject)$ic157$);
        module0012.f416((SubLObject)$ic159$);
        if ($ic160$.isSymbol()) {
            final SubLObject var56 = (SubLObject)$ic160$;
            if (NIL == conses_high.member(var56, module0144.$g1862$.getDynamicValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                module0144.$g1862$.setDynamicValue((SubLObject)ConsesLow.cons(var56, module0144.$g1862$.getDynamicValue()));
            }
        }
        module0012.f416((SubLObject)$ic160$);
        if ($ic162$.isSymbol()) {
            final SubLObject var56 = (SubLObject)$ic162$;
            if (NIL == conses_high.member(var56, module0144.$g1862$.getDynamicValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                module0144.$g1862$.setDynamicValue((SubLObject)ConsesLow.cons(var56, module0144.$g1862$.getDynamicValue()));
            }
        }
        module0012.f416((SubLObject)$ic162$);
        if ($ic164$.isSymbol()) {
            final SubLObject var56 = (SubLObject)$ic164$;
            if (NIL == conses_high.member(var56, module0144.$g1862$.getDynamicValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                module0144.$g1862$.setDynamicValue((SubLObject)ConsesLow.cons(var56, module0144.$g1862$.getDynamicValue()));
            }
        }
        module0012.f416((SubLObject)$ic164$);
        if ($ic166$.isSymbol()) {
            final SubLObject var56 = (SubLObject)$ic166$;
            if (NIL == conses_high.member(var56, module0144.$g1862$.getDynamicValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                module0144.$g1862$.setDynamicValue((SubLObject)ConsesLow.cons(var56, module0144.$g1862$.getDynamicValue()));
            }
        }
        module0012.f416((SubLObject)$ic166$);
        module0012.f416((SubLObject)$ic167$);
        module0012.f416((SubLObject)$ic168$);
        module0012.f416((SubLObject)$ic169$);
        module0012.f416((SubLObject)$ic170$);
        module0012.f416((SubLObject)$ic171$);
        module0012.f416((SubLObject)$ic172$);
        module0012.f416((SubLObject)$ic174$);
        module0012.f416((SubLObject)$ic176$);
        module0012.f416((SubLObject)$ic177$);
        module0012.f416((SubLObject)$ic178$);
        module0012.f416((SubLObject)$ic181$);
        module0012.f416((SubLObject)$ic184$);
        module0012.f416((SubLObject)$ic187$);
        if ($ic188$.isSymbol()) {
            final SubLObject var56 = (SubLObject)$ic188$;
            if (NIL == conses_high.member(var56, module0144.$g1862$.getDynamicValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                module0144.$g1862$.setDynamicValue((SubLObject)ConsesLow.cons(var56, module0144.$g1862$.getDynamicValue()));
            }
        }
        module0012.f416((SubLObject)$ic188$);
        if ($ic189$.isSymbol()) {
            final SubLObject var56 = (SubLObject)$ic189$;
            if (NIL == conses_high.member(var56, module0144.$g1862$.getDynamicValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                module0144.$g1862$.setDynamicValue((SubLObject)ConsesLow.cons(var56, module0144.$g1862$.getDynamicValue()));
            }
        }
        module0012.f416((SubLObject)$ic189$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f34171();
    }
    
    public void initializeVariables() {
        f34172();
    }
    
    public void runTopLevelForms() {
        f34173();
    }
    
    static {
        me = (SubLFile)new module0552();
        $g3992$ = null;
        $g3993$ = null;
        $g3994$ = null;
        $g3995$ = null;
        $g3996$ = null;
        $g3997$ = null;
        $g3998$ = null;
        $g3999$ = null;
        $g4000$ = null;
        $g4001$ = null;
        $g4002$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("STRINGP"), (SubLObject)makeSymbol("INTEGERP"), (SubLObject)makeSymbol("KEYWORDP"), (SubLObject)makeSymbol("LISTP"), (SubLObject)makeSymbol("SYMBOLP"), (SubLObject)makeSymbol("TRUE"), (SubLObject)makeSymbol("FALSE"));
        $ic1$ = ConsesLow.list(new SubLObject[] { makeSymbol("CYCL-CONSTANT-P"), makeSymbol("CYCL-VARIABLE-P"), makeSymbol("EL-VARIABLE-P"), makeSymbol("HL-VARIABLE-P"), makeSymbol("CYCL-DENOTATIONAL-TERM-P"), makeSymbol("EL-RELATION-EXPRESSION?"), makeSymbol("GAF?"), makeSymbol("STRING-W/O-CONTROL-CHARS?"), makeSymbol("URL-P") });
        $ic2$ = makeSymbol("CYC-INDIVIDUAL-NECESSARY");
        $ic3$ = makeSymbol("CYCL-EXPRESSION?");
        $ic4$ = makeSymbol("EL-EXPRESSION?");
        $ic5$ = makeSymbol("HL-EXPRESSION-P");
        $ic6$ = makeSymbol("CYCL-OPEN-DENOTATIONAL-TERM?");
        $ic7$ = makeSymbol("CYCL-CLOSED-DENOTATIONAL-TERM?");
        $ic8$ = makeSymbol("CYCL-REIFIABLE-DENOTATIONAL-TERM?");
        $ic9$ = makeSymbol("CYCL-REIFIED-DENOTATIONAL-TERM?");
        $ic10$ = makeSymbol("HL-CLOSED-DENOTATIONAL-TERM-P");
        $ic11$ = makeSymbol("CYCL-REPRESENTED-ATOMIC-TERM-P");
        $ic12$ = makeSymbol("CYCL-REPRESENTED-TERM?");
        $ic13$ = makeSymbol("CYC-SYSTEM-TERM-P");
        $ic14$ = makeSymbol("CYC-SYSTEM-CHARACTER-P");
        $ic15$ = makeSymbol("CYC-SYSTEM-STRING-P");
        $ic16$ = makeSymbol("CYC-SYSTEM-REAL-NUMBER-P");
        $ic17$ = makeSymbol("CYC-SYSTEM-NON-VARIABLE-SYMBOL-P");
        $ic18$ = makeSymbol("CYCL-SUBL-SYMBOL-P");
        $ic19$ = makeSymbol("CYCL-ATOMIC-TERM-P");
        $ic20$ = makeSymbol("CYCL-CLOSED-ATOMIC-TERM-P");
        $ic21$ = makeSymbol("HL-NON-ATOMIC-TERM-P");
        $ic22$ = makeSymbol("CYCL-NON-ATOMIC-TERM?");
        $ic23$ = makeSymbol("EL-NON-ATOMIC-TERM?");
        $ic24$ = makeSymbol("HL-INDEXED-TERM-P");
        $ic25$ = makeSymbol("CYCL-INDEXED-TERM?");
        $ic26$ = makeSymbol("CYCL-OPEN-NON-ATOMIC-TERM?");
        $ic27$ = makeSymbol("CYCL-CLOSED-NON-ATOMIC-TERM?");
        $ic28$ = makeSymbol("CYCL-REIFIABLE-NON-ATOMIC-TERM?");
        $ic29$ = makeSymbol("CYCL-NON-ATOMIC-REIFIED-TERM?");
        $ic30$ = makeSymbol("EL-REIFIABLE-NON-ATOMIC-TERM?");
        $ic31$ = makeSymbol("CYCL-CLOSED-EXPRESSION?");
        $ic32$ = makeSymbol("CYCL-OPEN-EXPRESSION?");
        $ic33$ = makeSymbol("CYCL-FORMULA?");
        $ic34$ = makeSymbol("CYCL-OPEN-FORMULA?");
        $ic35$ = makeSymbol("CYCL-CLOSED-FORMULA?");
        $ic36$ = makeSymbol("HL-FORMULA-P");
        $ic37$ = makeSymbol("CYCL-UNBOUND-RELATION-FORMULA-P");
        $ic38$ = makeSymbol("CYCL-SENTENCE?");
        $ic39$ = makeSymbol("CYCL-OPEN-SENTENCE?");
        $ic40$ = makeSymbol("CYCL-CLOSED-SENTENCE?");
        $ic41$ = makeKeyword("TERM");
        $ic42$ = makeSymbol("CYC-TYPICALITY-REFERENCE-SET-PROPERTY?");
        $ic43$ = makeSymbol("EL-SENTENCE?");
        $ic44$ = makeSymbol("CYCL-ATOMIC-SENTENCE?");
        $ic45$ = makeSymbol("CYCL-CLOSED-ATOMIC-SENTENCE?");
        $ic46$ = makeSymbol("CYCL-PROPOSITIONAL-SENTENCE?");
        $ic47$ = makeSymbol("CYCL-SENTENCE-ASKABLE?");
        $ic48$ = makeSymbol("CYCL-SENTENCE-ASSERTIBLE?");
        $ic49$ = makeSymbol("EL-SENTENCE-ASKABLE?");
        $ic50$ = makeSymbol("EL-SENTENCE-ASSERTIBLE?");
        $ic51$ = makeSymbol("CYCL-NON-ATOMIC-TERM-ASKABLE?");
        $ic52$ = makeSymbol("CYCL-NON-ATOMIC-TERM-ASSERTIBLE?");
        $ic53$ = makeSymbol("EL-NON-ATOMIC-TERM-ASKABLE?");
        $ic54$ = makeSymbol("EL-NON-ATOMIC-TERM-ASSERTIBLE?");
        $ic55$ = makeSymbol("CYCL-EXPRESSION-ASKABLE?");
        $ic56$ = makeSymbol("CYCL-EXPRESSION-ASSERTIBLE?");
        $ic57$ = makeSymbol("EL-EXPRESSION-ASKABLE?");
        $ic58$ = makeSymbol("EL-EXPRESSION-ASSERTIBLE?");
        $ic59$ = makeSymbol("CYCL-QUERY?");
        $ic60$ = makeSymbol("CYCL-ASSERTION?");
        $ic61$ = makeSymbol("CYCL-ATOMIC-ASSERTION?");
        $ic62$ = makeSymbol("CYCL-GAF-ASSERTION?");
        $ic63$ = makeSymbol("CYCL-RULE-ASSERTION?");
        $ic64$ = makeSymbol("CYCL-ASSERTED-ASSERTION?");
        $ic65$ = makeSymbol("CYCL-DEDUCED-ASSERTION?");
        $ic66$ = makeSymbol("CYCL-NL-SEMANTIC-ASSERTION?");
        $ic67$ = constant_handles_oc.f8479((SubLObject)makeString("CanonicalizerDirectivePredicate"));
        $ic68$ = makeSymbol("CYCL-CANONICALIZER-DIRECTIVE?");
        $ic69$ = constant_handles_oc.f8479((SubLObject)makeString("ReformulatorDirectivePredicate"));
        $ic70$ = makeSymbol("CYCL-REFORMULATOR-DIRECTIVE?");
        $ic71$ = constant_handles_oc.f8479((SubLObject)makeString("CycLReformulationRulePredicate"));
        $ic72$ = constant_handles_oc.f8479((SubLObject)makeString("ist"));
        $ic73$ = makeSymbol("CYCL-REFORMULATOR-RULE?");
        $ic74$ = constant_handles_oc.f8479((SubLObject)makeString("SimplifierDirectivePredicate"));
        $ic75$ = makeSymbol("CYCL-SIMPLIFIER-DIRECTIVE?");
        $ic76$ = makeSymbol("HL-ASSERTION-P");
        $ic77$ = makeSymbol("EL-ASSERTION?");
        $ic78$ = makeSymbol("CYC-GROUND-TERM");
        $ic79$ = makeSymbol("CYC-REAL-NUMBER");
        $ic80$ = makeSymbol("CYC-SYSTEM-REAL-NUMBER");
        $ic81$ = makeSymbol("CYC-POSITIVE-NUMBER");
        $ic82$ = makeSymbol("CYC-NEGATIVE-NUMBER");
        $ic83$ = makeSymbol("CYC-NON-POSITIVE-NUMBER");
        $ic84$ = makeSymbol("CYC-NON-NEGATIVE-NUMBER");
        $ic85$ = makeSymbol("CYC-RATIONAL-NUMBER");
        $ic86$ = (SubLFloat)makeDouble(100.0);
        $ic87$ = makeSymbol("CYC-REAL-0-100");
        $ic88$ = (SubLFloat)makeDouble(1.0);
        $ic89$ = makeSymbol("CYC-REAL-0-1");
        $ic90$ = (SubLFloat)makeDouble(-1.0);
        $ic91$ = makeSymbol("CYC-REAL-MINUS-1-TO-PLUS-1");
        $ic92$ = makeSymbol("CYC-REAL-1-INFINITY");
        $ic93$ = makeSymbol("CYC-NONZERO-NUMBER");
        $ic94$ = makeSymbol("CYC-SYSTEM-FLOAT");
        $ic95$ = makeSymbol("CYC-INTEGER");
        $ic96$ = makeSymbol("CYC-SYSTEM-INTEGER");
        $ic97$ = makeSymbol("CYC-POSITIVE-INTEGER");
        $ic98$ = makeSymbol("CYC-PRIME-NUMBER?");
        $ic99$ = makeSymbol("CONSTANT-P");
        $ic100$ = makeSymbol("CYC-MAYBE-PRIME-NUMBER?");
        $ic101$ = makeSymbol("CYC-NEGATIVE-INTEGER");
        $ic102$ = makeSymbol("CYC-NON-POSITIVE-INTEGER");
        $ic103$ = makeSymbol("CYC-NON-NEGATIVE-INTEGER");
        $ic104$ = makeSymbol("CYC-EVEN-NUMBER");
        $ic105$ = makeSymbol("CYC-ODD-NUMBER");
        $ic106$ = makeSymbol("CYC-UNIVERSAL-DATE");
        $ic107$ = makeSymbol("CYC-UNIVERSAL-SECOND");
        $ic108$ = makeSymbol("CYC-SET-OF-TYPE-NECESSARY");
        $ic109$ = makeKeyword("AGNOSTIC");
        $ic110$ = makeSymbol("CYC-SET-OF-TYPE-SUFFICIENT");
        $ic111$ = makeSymbol("CYC-LIST-OF-TYPE-NECESSARY");
        $ic112$ = makeSymbol("CYC-LIST-OF-TYPE-SUFFICIENT");
        $ic113$ = constant_handles_oc.f8479((SubLObject)makeString("instanceElementType"));
        $ic114$ = makeSymbol("S#37396", "CYC");
        $ic115$ = constant_handles_oc.f8479((SubLObject)makeString("Set-Extensional"));
        $ic116$ = makeSymbol("S#37409", "CYC");
        $ic117$ = makeInteger(32);
        $ic118$ = makeSymbol("S#37377", "CYC");
        $ic119$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic120$ = constant_handles_oc.f8479((SubLObject)makeString("TheSet"));
        $ic121$ = constant_handles_oc.f8479((SubLObject)makeString("List-Extensional"));
        $ic122$ = constant_handles_oc.f8479((SubLObject)makeString("instanceListMemberType"));
        $ic123$ = constant_handles_oc.f8479((SubLObject)makeString("TheList"));
        $ic124$ = makeSymbol("CYC-LIST-WITHOUT-REPETITION");
        $ic125$ = makeSymbol("CYC-NUMERIC-STRING-NECESSARY");
        $ic126$ = makeSymbol("CYC-NUMERAL-STRING");
        $ic127$ = makeSymbol("CYC-NUMERIC-STRING");
        $ic128$ = makeSymbol("CYC-NUMBER-STRING");
        $ic129$ = makeSymbol("CYC-ZIP-CODE-FIVE-DIGIT");
        $ic130$ = ConsesLow.list((SubLObject)makeString("-"));
        $ic131$ = makeSymbol("CYC-ZIP-CODE-NINE-DIGIT");
        $ic132$ = makeSymbol("CYC-GUID-STRING-P");
        $ic133$ = makeSymbol("CYC-NAICS-CODE");
        $ic134$ = makeSymbol("CYC-UNICODE-DENOTING-ASCII-STRING-P");
        $ic135$ = makeSymbol("CYC-ASCII-STRING-P");
        $ic136$ = makeSymbol("CYC-URL");
        $ic137$ = makeSymbol("DOCTOR-ME-ID?");
        $ic138$ = makeSymbol("CLPE?");
        $ic139$ = makeSymbol("CYC-QUERY?");
        $ic140$ = makeSymbol("CYC-SYNTACTIC-FORMULA-ARITY-OK");
        $ic141$ = makeSymbol("CYC-SYNTACTIC-FORMULA");
        $ic142$ = makeSymbol("FUNCTION-EXPRESSION?");
        $ic143$ = makeSymbol("CYC-RELATION-EXPRESSION?");
        $ic144$ = makeSymbol("EL-VARIABLE?");
        $ic145$ = makeSymbol("CYC-SUBL-EXPRESSION");
        $ic146$ = makeSymbol("CYC-SUBL-ESCAPE");
        $ic147$ = makeSymbol("CYC-SUBL-TEMPLATE");
        $ic148$ = makeSymbol("IBQE?");
        $ic149$ = makeSymbol("SCALAR-POINT-VALUE?");
        $ic150$ = makeSymbol("NON-NEGATIVE-SCALAR-INTERVAL?");
        $ic151$ = makeSymbol("POSITIVE-SCALAR-INTERVAL?");
        $ic152$ = makeSymbol("NEGATIVE-SCALAR-INTERVAL?");
        $ic153$ = constant_handles_oc.f8479((SubLObject)makeString("UnitOfMeasure"));
        $ic154$ = makeSymbol("TERM-SET?");
        $ic155$ = makeSymbol("CYCL-VAR-LIST?");
        $ic156$ = makeSymbol("CYC-EL-VAR-LIST?");
        $ic157$ = makeSymbol("CYC-SYSTEM-ATOM");
        $ic158$ = makeKeyword("IGNORE");
        $ic159$ = makeSymbol("CYC-LIST-OF-LISTS");
        $ic160$ = makeSymbol("CYC-STRING-IS-LENGTH");
        $ic161$ = constant_handles_oc.f8479((SubLObject)makeString("instanceListLength"));
        $ic162$ = makeSymbol("CYC-STRING-IS-MINIMUM-LENGTH");
        $ic163$ = constant_handles_oc.f8479((SubLObject)makeString("instanceListMinLength"));
        $ic164$ = makeSymbol("CYC-STRING-IS-MAXIMUM-LENGTH");
        $ic165$ = constant_handles_oc.f8479((SubLObject)makeString("instanceListMaxLength"));
        $ic166$ = makeSymbol("CYC-LIST-IS-LENGTH");
        $ic167$ = makeSymbol("RTP-SYNTACTIC-CONSTRAINT");
        $ic168$ = makeSymbol("CYC-SUBL-QUERY-PROPERTY-P");
        $ic169$ = makeSymbol("CYC-SUBL-TV-P");
        $ic170$ = makeSymbol("CYC-SUBL-HL-SUPPORT-MODULE-P");
        $ic171$ = makeSymbol("CYC-SUBL-ASSERTED-ARGUMENT-TOKEN-P");
        $ic172$ = makeSymbol("CYC-SUBL-KCT-METRIC-IDENTIFIER-P");
        $ic173$ = makeInteger(63);
        $ic174$ = makeSymbol("CYC-8-BYTE-INTEGER");
        $ic175$ = makeInteger(31);
        $ic176$ = makeSymbol("CYC-4-BYTE-INTEGER");
        $ic177$ = makeSymbol("CYC-2-BYTE-INTEGER");
        $ic178$ = makeSymbol("CYC-1-BYTE-INTEGER");
        $ic179$ = constant_handles_oc.f8479((SubLObject)makeString("BitData"));
        $ic180$ = makeSymbol("CYC-BIT-DATATYPE");
        $ic181$ = makeSymbol("CYC-BIT-STRING");
        $ic182$ = ConsesLow.list((SubLObject)Characters.CHAR_period);
        $ic183$ = makeInteger(256);
        $ic184$ = makeSymbol("CYC-IP4-ADDRESS");
        $ic185$ = ConsesLow.list((SubLObject)Characters.CHAR_slash);
        $ic186$ = makeInteger(33);
        $ic187$ = makeSymbol("CYC-IP4-NETWORK-ADDRESS");
        $ic188$ = makeSymbol("CYC-LIST-IS-MINIMUM-LENGTH");
        $ic189$ = makeSymbol("CYC-LIST-IS-MAXIMUM-LENGTH");
    }
    
    public static final class $f33989$UnaryFunction extends UnaryFunction
    {
        public $f33989$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-INDIVIDUAL-NECESSARY"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f33989(var2);
        }
    }
    
    public static final class $f34030$UnaryFunction extends UnaryFunction
    {
        public $f34030$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-TYPICALITY-REFERENCE-SET-PROPERTY?"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34030(var2);
        }
    }
    
    public static final class $f34035$UnaryFunction extends UnaryFunction
    {
        public $f34035$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYCL-SENTENCE-ASSERTIBLE?"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34035(var2);
        }
    }
    
    public static final class $f34055$UnaryFunction extends UnaryFunction
    {
        public $f34055$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYCL-CANONICALIZER-DIRECTIVE?"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34055(var2);
        }
    }
    
    public static final class $f34102$UnaryFunction extends UnaryFunction
    {
        public $f34102$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-LIST-OF-TYPE-NECESSARY"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34102(var2);
        }
    }
    
    public static final class $f34104$UnaryFunction extends UnaryFunction
    {
        public $f34104$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-LIST-OF-TYPE-SUFFICIENT"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34104(var2);
        }
    }
    
    public static final class $f34107$ZeroArityFunction extends ZeroArityFunction
    {
        public $f34107$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#37377"));
        }
        
        public SubLObject processItem() {
            return f34107();
        }
    }
    
    public static final class $f34113$UnaryFunction extends UnaryFunction
    {
        public $f34113$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-NUMERIC-STRING-NECESSARY"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34113(var2);
        }
    }
    
    public static final class $f34117$UnaryFunction extends UnaryFunction
    {
        public $f34117$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-ZIP-CODE-FIVE-DIGIT"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34117(var2);
        }
    }
    
    public static final class $f34118$UnaryFunction extends UnaryFunction
    {
        public $f34118$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-ZIP-CODE-NINE-DIGIT"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34118(var2);
        }
    }
    
    public static final class $f34119$UnaryFunction extends UnaryFunction
    {
        public $f34119$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-GUID-STRING-P"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34119(var2);
        }
    }
    
    public static final class $f34122$UnaryFunction extends UnaryFunction
    {
        public $f34122$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-ASCII-STRING-P"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34122(var2);
        }
    }
    
    public static final class $f34147$UnaryFunction extends UnaryFunction
    {
        public $f34147$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-LIST-OF-LISTS"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34147(var2);
        }
    }
    
    public static final class $f34148$UnaryFunction extends UnaryFunction
    {
        public $f34148$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-STRING-IS-LENGTH"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34148(var2);
        }
    }
    
    public static final class $f34149$UnaryFunction extends UnaryFunction
    {
        public $f34149$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-STRING-IS-MINIMUM-LENGTH"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34149(var2);
        }
    }
    
    public static final class $f34150$UnaryFunction extends UnaryFunction
    {
        public $f34150$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-STRING-IS-MAXIMUM-LENGTH"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34150(var2);
        }
    }
    
    public static final class $f34154$UnaryFunction extends UnaryFunction
    {
        public $f34154$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-SUBL-QUERY-PROPERTY-P"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34154(var2);
        }
    }
    
    public static final class $f34155$UnaryFunction extends UnaryFunction
    {
        public $f34155$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-SUBL-TV-P"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34155(var2);
        }
    }
    
    public static final class $f34156$UnaryFunction extends UnaryFunction
    {
        public $f34156$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-SUBL-HL-SUPPORT-MODULE-P"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34156(var2);
        }
    }
    
    public static final class $f34159$UnaryFunction extends UnaryFunction
    {
        public $f34159$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-8-BYTE-INTEGER"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34159(var2);
        }
    }
    
    public static final class $f34160$UnaryFunction extends UnaryFunction
    {
        public $f34160$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-4-BYTE-INTEGER"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34160(var2);
        }
    }
    
    public static final class $f34161$UnaryFunction extends UnaryFunction
    {
        public $f34161$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-2-BYTE-INTEGER"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34161(var2);
        }
    }
    
    public static final class $f34162$UnaryFunction extends UnaryFunction
    {
        public $f34162$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-1-BYTE-INTEGER"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34162(var2);
        }
    }
    
    public static final class $f34163$UnaryFunction extends UnaryFunction
    {
        public $f34163$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-BIT-DATATYPE"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34163(var2);
        }
    }
    
    public static final class $f34165$UnaryFunction extends UnaryFunction
    {
        public $f34165$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-IP4-ADDRESS"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34165(var2);
        }
    }
    
    public static final class $f34166$UnaryFunction extends UnaryFunction
    {
        public $f34166$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-IP4-NETWORK-ADDRESS"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34166(var2);
        }
    }
    
    public static final class $f34167$UnaryFunction extends UnaryFunction
    {
        public $f34167$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-LIST-IS-MINIMUM-LENGTH"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f34167(var2);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 626 ms
	
	Decompiled with Procyon 0.5.32.
*/