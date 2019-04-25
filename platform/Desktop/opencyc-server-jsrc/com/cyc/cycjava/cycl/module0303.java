package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0303 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0303";
    public static final String myFingerPrint = "5517c7403ed192825d604208c05df28f266db92abb21eb516f823fd7ddab7106";
    private static SubLSymbol $g2706$;
    private static SubLSymbol $g2707$;
    private static SubLSymbol $g2708$;
    private static SubLSymbol $g2709$;
    private static SubLSymbol $g2710$;
    private static SubLSymbol $g2711$;
    private static SubLSymbol $g2712$;
    private static final SubLObject $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLString $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLObject $ic17$;
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
    private static final SubLList $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLString $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLObject $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLString $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLString $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLString $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLObject $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLString $ic53$;
    private static final SubLObject $ic54$;
    private static final SubLObject $ic55$;
    private static final SubLString $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLObject $ic59$;
    private static final SubLObject $ic60$;
    private static final SubLObject $ic61$;
    private static final SubLObject $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLObject $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLObject $ic67$;
    private static final SubLObject $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLObject $ic79$;
    private static final SubLString $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLObject $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLString $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLString $ic98$;
    private static final SubLObject $ic99$;
    private static final SubLObject $ic100$;
    private static final SubLString $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLString $ic107$;
    private static final SubLString $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLString $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLObject $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLList $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLObject $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLObject $ic132$;
    private static final SubLList $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLObject $ic135$;
    private static final SubLList $ic136$;
    private static final SubLList $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLInteger $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLInteger $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLObject $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLObject $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLString $ic151$;
    private static final SubLString $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLObject $ic155$;
    private static final SubLObject $ic156$;
    private static final SubLObject $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLObject $ic159$;
    private static final SubLObject $ic160$;
    private static final SubLObject $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLObject $ic163$;
    private static final SubLObject $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLObject $ic168$;
    private static final SubLList $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLInteger $ic172$;
    private static final SubLFloat $ic173$;
    private static final SubLObject $ic174$;
    
    public static SubLObject f20117(final SubLObject var1) {
        if (var1.eql((SubLObject)ONE_INTEGER)) {
            return $ic0$;
        }
        if (var1.eql((SubLObject)TWO_INTEGER)) {
            return $ic1$;
        }
        if (var1.eql((SubLObject)THREE_INTEGER)) {
            return $ic2$;
        }
        if (var1.eql((SubLObject)FOUR_INTEGER)) {
            return $ic3$;
        }
        if (var1.eql((SubLObject)FIVE_INTEGER)) {
            return $ic4$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20118(final SubLObject var3, final SubLObject var4, final SubLObject var5, final SubLObject var6) {
        if (var5.numE((SubLObject)TWO_INTEGER) && NIL != module0269.f17707(var4.first()) && NIL != module0210.f13570(var3)) {
            return var4.first();
        }
        return var6;
    }
    
    public static SubLObject f20119(final SubLObject var7) {
        return module0035.f2294($g2706$.getGlobalValue(), var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20120(final SubLObject var8) {
        return conses_high.rassoc(var8, $g2706$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic6$), (SubLObject)UNPROVIDED).first();
    }
    
    public static SubLObject f20121(final SubLObject var9, final SubLObject var7) {
        $g2706$.setGlobalValue(module0035.f2063($g2706$.getGlobalValue(), var7, var9, (SubLObject)UNPROVIDED));
        return var9;
    }
    
    public static SubLObject f20122(final SubLObject var10) {
        return module0035.sublisp_boolean(conses_high.rassoc(var10, $g2706$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic6$), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f20123(final SubLObject var7) {
        final SubLObject var8 = f20119(var7);
        if (var8.isKeyword()) {
            return var8;
        }
        final SubLObject var9 = Symbols.make_keyword(Sequences.cconcatenate((SubLObject)$ic7$, PrintLow.format((SubLObject)NIL, (SubLObject)$ic8$, var7)));
        f20121(var9, var7);
        return var9;
    }
    
    public static SubLObject f20124(final SubLObject var10) {
        if (NIL == f20125(var10)) {
            return (SubLObject)NIL;
        }
        if (NIL != f20122(var10)) {
            return f20120(var10);
        }
        final SubLObject var11 = module0038.f2623(Symbols.symbol_name(var10), (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
        final SubLObject var12 = reader.read_from_string(var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var13 = Types.integerp(var12);
        if (NIL != var13) {
            f20121(var10, var12);
        }
        return var13;
    }
    
    public static SubLObject f20125(final SubLObject var10) {
        if (!var10.isKeyword()) {
            return (SubLObject)NIL;
        }
        if (NIL != f20122(var10)) {
            return (SubLObject)T;
        }
        if (NIL != module0035.f1994(Symbols.symbol_name(var10), (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        final SubLObject var11 = Symbols.symbol_name(var10);
        final SubLObject var12 = module0038.f2623(var11, (SubLObject)ZERO_INTEGER, (SubLObject)THREE_INTEGER);
        final SubLObject var13 = module0038.f2623(var11, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
        final SubLObject var14 = (SubLObject)makeBoolean($ic7$.equalp(var12) && NIL != module0038.f2727(var13));
        if (NIL != var14) {
            f20121(var10, reader.read_from_string(var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return var14;
    }
    
    public static SubLObject f20126(final SubLObject var17, final SubLObject var18) {
        if (var17.eql((SubLObject)ONE_INTEGER)) {
            if (var18.eql((SubLObject)TWO_INTEGER)) {
                return $ic9$;
            }
            if (var18.eql((SubLObject)THREE_INTEGER)) {
                return $ic10$;
            }
            if (var18.eql((SubLObject)FOUR_INTEGER)) {
                return $ic11$;
            }
            if (var18.eql((SubLObject)FIVE_INTEGER)) {
                return $ic12$;
            }
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic13$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else if (var17.eql((SubLObject)TWO_INTEGER)) {
            if (var18.eql((SubLObject)ONE_INTEGER)) {
                return $ic14$;
            }
            if (var18.eql((SubLObject)THREE_INTEGER)) {
                return $ic15$;
            }
            if (var18.eql((SubLObject)FOUR_INTEGER)) {
                return $ic16$;
            }
            if (var18.eql((SubLObject)FIVE_INTEGER)) {
                return $ic17$;
            }
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic13$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else if (var17.eql((SubLObject)THREE_INTEGER)) {
            if (var18.eql((SubLObject)ONE_INTEGER)) {
                return $ic18$;
            }
            if (var18.eql((SubLObject)TWO_INTEGER)) {
                return $ic19$;
            }
            if (var18.eql((SubLObject)FOUR_INTEGER)) {
                return $ic20$;
            }
            if (var18.eql((SubLObject)FIVE_INTEGER)) {
                return $ic21$;
            }
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic13$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else if (var17.eql((SubLObject)FOUR_INTEGER)) {
            if (var18.eql((SubLObject)ONE_INTEGER)) {
                return $ic22$;
            }
            if (var18.eql((SubLObject)TWO_INTEGER)) {
                return $ic23$;
            }
            if (var18.eql((SubLObject)THREE_INTEGER)) {
                return $ic24$;
            }
            if (var18.eql((SubLObject)FIVE_INTEGER)) {
                return $ic25$;
            }
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic13$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else if (var17.eql((SubLObject)FIVE_INTEGER)) {
            if (var18.eql((SubLObject)ONE_INTEGER)) {
                return $ic26$;
            }
            if (var18.eql((SubLObject)TWO_INTEGER)) {
                return $ic27$;
            }
            if (var18.eql((SubLObject)THREE_INTEGER)) {
                return $ic28$;
            }
            if (var18.eql((SubLObject)FOUR_INTEGER)) {
                return $ic29$;
            }
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic13$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else {
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic13$, var17, var18, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20127(final SubLObject var17, final SubLObject var18) {
        if (NIL != module0004.f104(var17, (SubLObject)$ic30$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0004.f104(var18, (SubLObject)$ic30$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return f20126(var18, var17);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20128(final SubLObject var17, final SubLObject var18) {
        if (var17.eql((SubLObject)ONE_INTEGER)) {
            if (var18.eql((SubLObject)TWO_INTEGER)) {
                return $ic31$;
            }
            if (var18.eql((SubLObject)THREE_INTEGER)) {
                return $ic32$;
            }
            if (var18.eql((SubLObject)FOUR_INTEGER)) {
                return $ic33$;
            }
            if (var18.eql((SubLObject)FIVE_INTEGER)) {
                return $ic34$;
            }
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic35$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else if (var17.eql((SubLObject)TWO_INTEGER)) {
            if (var18.eql((SubLObject)THREE_INTEGER)) {
                return $ic36$;
            }
            if (var18.eql((SubLObject)FOUR_INTEGER)) {
                return $ic37$;
            }
            if (var18.eql((SubLObject)FIVE_INTEGER)) {
                return $ic38$;
            }
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic35$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else if (var17.eql((SubLObject)THREE_INTEGER)) {
            if (var18.eql((SubLObject)FOUR_INTEGER)) {
                return $ic39$;
            }
            if (var18.eql((SubLObject)FIVE_INTEGER)) {
                return $ic40$;
            }
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic35$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else if (var17.eql((SubLObject)FOUR_INTEGER)) {
            if (var18.eql((SubLObject)FIVE_INTEGER)) {
                return $ic41$;
            }
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic35$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else if (var17.eql((SubLObject)FIVE_INTEGER)) {
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic35$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else {
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic35$, var17, var18, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20129(final SubLObject var17, final SubLObject var18) {
        if (NIL != module0004.f104(var17, (SubLObject)$ic30$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0004.f104(var18, (SubLObject)$ic30$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return f20128(var18, var17);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20130(final SubLObject var17, final SubLObject var18) {
        if (var17.eql((SubLObject)ONE_INTEGER)) {
            if (var18.eql((SubLObject)TWO_INTEGER)) {
                return $ic42$;
            }
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic43$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else if (var17.eql((SubLObject)TWO_INTEGER)) {
            if (var18.eql((SubLObject)ONE_INTEGER)) {
                return $ic44$;
            }
            if (var18.eql((SubLObject)FOUR_INTEGER)) {
                return $ic45$;
            }
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic43$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else if (var17.eql((SubLObject)THREE_INTEGER)) {
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic43$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else if (var17.eql((SubLObject)FOUR_INTEGER)) {
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic43$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else if (var17.eql((SubLObject)FIVE_INTEGER)) {
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic43$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else {
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic43$, var17, var18, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20131(final SubLObject var17, final SubLObject var18) {
        if (var17.eql((SubLObject)ONE_INTEGER)) {
            if (var18.eql((SubLObject)TWO_INTEGER)) {
                return $ic46$;
            }
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic47$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else if (var17.eql((SubLObject)TWO_INTEGER)) {
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic47$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else if (var17.eql((SubLObject)THREE_INTEGER)) {
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic47$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else if (var17.eql((SubLObject)FOUR_INTEGER)) {
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic47$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else if (var17.eql((SubLObject)FIVE_INTEGER)) {
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic47$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else {
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic47$, var17, var18, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20132(final SubLObject var17, final SubLObject var18) {
        if (var17.eql((SubLObject)ONE_INTEGER)) {
            if (var18.eql((SubLObject)TWO_INTEGER)) {
                return $ic48$;
            }
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic49$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else if (var17.eql((SubLObject)TWO_INTEGER)) {
            if (var18.eql((SubLObject)ONE_INTEGER)) {
                return $ic50$;
            }
            if (var18.eql((SubLObject)THREE_INTEGER)) {
                return $ic51$;
            }
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic49$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else if (var17.eql((SubLObject)THREE_INTEGER)) {
            if (var18.eql((SubLObject)TWO_INTEGER)) {
                return $ic52$;
            }
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic49$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else if (var17.eql((SubLObject)FOUR_INTEGER)) {
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic49$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else if (var17.eql((SubLObject)FIVE_INTEGER)) {
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic49$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else {
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic49$, var17, var18, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20133(final SubLObject var17, final SubLObject var18) {
        if (var17.eql((SubLObject)ONE_INTEGER)) {
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic53$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else if (var17.eql((SubLObject)TWO_INTEGER)) {
            if (var18.eql((SubLObject)ONE_INTEGER)) {
                return $ic54$;
            }
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic53$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else if (var17.eql((SubLObject)THREE_INTEGER)) {
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic53$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else if (var17.eql((SubLObject)FOUR_INTEGER)) {
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic53$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else if (var17.eql((SubLObject)FIVE_INTEGER)) {
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic53$, var17, var18, (SubLObject)UNPROVIDED);
        }
        else {
            module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic53$, var17, var18, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20134(final SubLObject var17, final SubLObject var18) {
        if (NIL != module0004.f104(var17, (SubLObject)$ic30$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0004.f104(var18, (SubLObject)$ic30$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return f20130(var18, var17);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20135(final SubLObject var49) {
        return module0004.f104(var49, module0146.$g1965$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic6$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20136(final SubLObject var49) {
        return (SubLObject)makeBoolean(NIL != module0269.f17778(var49, module0132.$g1555$.getGlobalValue()) || NIL != module0269.f17787(var49, module0132.$g1555$.getGlobalValue()));
    }
    
    public static SubLObject f20137(final SubLObject var10) {
        return module0259.f16854(var10, $ic55$, module0132.$g1555$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20138() {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        SubLObject var51 = (SubLObject)ZERO_INTEGER;
        final SubLObject var52 = (SubLObject)$ic56$;
        final SubLObject var53 = module0012.$g73$.currentBinding(var50);
        final SubLObject var54 = module0012.$g65$.currentBinding(var50);
        final SubLObject var55 = module0012.$g67$.currentBinding(var50);
        final SubLObject var56 = module0012.$g68$.currentBinding(var50);
        final SubLObject var57 = module0012.$g66$.currentBinding(var50);
        final SubLObject var58 = module0012.$g69$.currentBinding(var50);
        final SubLObject var59 = module0012.$g70$.currentBinding(var50);
        final SubLObject var60 = module0012.$silent_progressP$.currentBinding(var50);
        try {
            module0012.$g73$.bind(Time.get_universal_time(), var50);
            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var50), var50);
            module0012.$g67$.bind((SubLObject)ONE_INTEGER, var50);
            module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var50);
            module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var50);
            module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var50);
            module0012.$g70$.bind((SubLObject)T, var50);
            module0012.$silent_progressP$.bind((SubLObject)((NIL != var52) ? module0012.$silent_progressP$.getDynamicValue(var50) : T), var50);
            module0012.f474(var52);
            var51 = Numbers.add(var51, f20139());
            var51 = Numbers.add(var51, f20140());
            module0012.f475();
        }
        finally {
            module0012.$silent_progressP$.rebind(var60, var50);
            module0012.$g70$.rebind(var59, var50);
            module0012.$g69$.rebind(var58, var50);
            module0012.$g66$.rebind(var57, var50);
            module0012.$g68$.rebind(var56, var50);
            module0012.$g67$.rebind(var55, var50);
            module0012.$g65$.rebind(var54, var50);
            module0012.$g73$.rebind(var53, var50);
        }
        return var51;
    }
    
    public static SubLObject f20141() {
        f20142();
        f20143();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20144(final SubLObject var10, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != module0004.f104(var10, module0146.$g1968$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic6$), (SubLObject)UNPROVIDED) || NIL != module0259.f16854(var10, $ic57$, var6, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f20145(final SubLObject var10, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != module0004.f104(var10, module0146.$g1969$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic6$), (SubLObject)UNPROVIDED) || NIL != module0259.f16854(var10, $ic58$, var6, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f20146(final SubLObject var10, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != module0004.f104(var10, module0146.$g1968$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic6$), (SubLObject)UNPROVIDED) || NIL != module0004.f104(var10, module0146.$g1969$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic6$), (SubLObject)UNPROVIDED) || NIL != module0259.f16854(var10, $ic59$, var6, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f20147(final SubLObject var10, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != module0004.f104(var10, module0146.$g1974$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic6$), (SubLObject)UNPROVIDED) || NIL != module0259.f16854(var10, $ic60$, var6, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f20148(final SubLObject var10, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != module0004.f104(var10, module0146.$g1975$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic6$), (SubLObject)UNPROVIDED) || NIL != module0259.f16854(var10, $ic61$, var6, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f20149(final SubLObject var10, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != module0004.f104(var10, module0146.$g1974$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic6$), (SubLObject)UNPROVIDED) || NIL != module0004.f104(var10, module0146.$g1975$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic6$), (SubLObject)UNPROVIDED) || NIL != module0259.f16854(var10, $ic62$, var6, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f20150(final SubLObject var10, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (NIL != module0202.f12932(var10)) {
            return f20151(module0205.f13276(var10), var6);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20151(final SubLObject var61, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (NIL != module0210.f13576(var61, (SubLObject)UNPROVIDED)) {
            return f20151(module0172.f10921(var61), var6);
        }
        if (NIL != module0173.f10955(var61)) {
            SubLObject var62 = (SubLObject)NIL;
            if (NIL == var62) {
                SubLObject var63;
                SubLObject var64;
                for (var63 = module0226.f14990(var61, var6), var64 = (SubLObject)NIL, var64 = var63.first(); NIL == var62 && NIL != var63; var62 = module0202.f12978(var64), var63 = var63.rest(), var64 = var63.first()) {}
            }
            return var62;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20152(final SubLObject var10, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (NIL != module0202.f12932(var10)) {
            return f20153(module0205.f13276(var10), var6);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20153(final SubLObject var61, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (NIL != module0210.f13576(var61, (SubLObject)UNPROVIDED)) {
            return f20153(module0172.f10921(var61), var6);
        }
        if (NIL != module0173.f10955(var61)) {
            SubLObject var62 = (SubLObject)NIL;
            if (NIL == var62) {
                SubLObject var63;
                SubLObject var64;
                for (var63 = module0226.f14990(var61, var6), var64 = (SubLObject)NIL, var64 = var63.first(); NIL == var62 && NIL != var63; var62 = module0202.f12979(var64), var63 = var63.rest(), var64 = var63.first()) {}
            }
            return var62;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20154(final SubLObject var3, final SubLObject var5, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        assert NIL != Types.integerp(var5) : var5;
        final SubLObject var7 = module0226.f14882(var3, var5, var6);
        SubLObject var8 = (SubLObject)NIL;
        if (NIL == var8) {
            SubLObject var9;
            SubLObject var10;
            for (var9 = var7, var10 = (SubLObject)NIL, var10 = var9.first(); NIL == var8 && NIL != var9; var8 = module0256.f16576(var10, $ic64$, var6, (SubLObject)UNPROVIDED), var9 = var9.rest(), var10 = var9.first()) {}
        }
        return var8;
    }
    
    public static SubLObject f20155(final SubLObject var69, final SubLObject var5, final SubLObject var70, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        return module0304.f20297(var69, var5, module0260.f17032(var70, var6, (SubLObject)UNPROVIDED), var6);
    }
    
    public static SubLObject f20156(final SubLObject var71, final SubLObject var72, final SubLObject var5, SubLObject var6, SubLObject var73, SubLObject var74) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (var73 == UNPROVIDED) {
            var73 = (SubLObject)NIL;
        }
        if (var74 == UNPROVIDED) {
            var74 = (SubLObject)NIL;
        }
        final SubLThread var75 = SubLProcess.currentSubLThread();
        if (NIL != var71) {
            final SubLObject var76 = (SubLObject)makeBoolean(NIL == module0144.$g1749$.getDynamicValue(var75));
            final SubLObject var77 = (SubLObject)makeBoolean(NIL == module0144.$g1748$.getDynamicValue(var75));
            SubLObject var78 = (SubLObject)NIL;
            SubLObject var79 = (SubLObject)NIL;
            if (NIL != var76 && NIL != var77) {
                var78 = var71;
            }
            else {
                final SubLObject var80 = var6;
                final SubLObject var81 = module0147.$g2094$.currentBinding(var75);
                final SubLObject var82 = module0147.$g2095$.currentBinding(var75);
                try {
                    module0147.$g2094$.bind(module0147.f9531(var80), var75);
                    module0147.$g2095$.bind(module0147.f9534(var80), var75);
                    final SubLObject var83 = (SubLObject)((NIL != module0173.f10955(var72)) ? makeBoolean(NIL != module0260.f17006(var72, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0260.f17008(var72, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) : NIL);
                    final SubLObject var53_81 = module0144.$g1831$.currentBinding(var75);
                    final SubLObject var54_82 = module0144.$g1843$.currentBinding(var75);
                    final SubLObject var84 = module0144.$g1844$.currentBinding(var75);
                    try {
                        module0144.$g1831$.bind(var72, var75);
                        module0144.$g1843$.bind((SubLObject)makeBoolean(NIL != module0144.$g1781$.getDynamicValue(var75) && NIL != var83), var75);
                        module0144.$g1844$.bind((SubLObject)makeBoolean(NIL != module0144.$g1782$.getDynamicValue(var75) && NIL != var83), var75);
                        assert NIL != Types.integerp(var5) : var5;
                        final SubLObject var53_82 = module0144.$g1833$.currentBinding(var75);
                        final SubLObject var54_83 = module0144.$g1826$.currentBinding(var75);
                        try {
                            module0144.$g1833$.bind(var5, var75);
                            module0144.$g1826$.bind((SubLObject)$ic65$, var75);
                            if (NIL != var76) {
                                var79 = var71;
                            }
                            else {
                                SubLObject var85 = var71;
                                SubLObject var86 = (SubLObject)NIL;
                                var86 = var85.first();
                                while (NIL != var85) {
                                    if (NIL != module0173.f10955(var86)) {
                                        final SubLObject var53_83 = module0144.$g1832$.currentBinding(var75);
                                        final SubLObject var54_84 = module0144.$g1881$.currentBinding(var75);
                                        final SubLObject var55_88 = module0144.$g1882$.currentBinding(var75);
                                        final SubLObject var87 = module0144.$g1879$.currentBinding(var75);
                                        final SubLObject var88 = module0144.$g1880$.currentBinding(var75);
                                        try {
                                            module0144.$g1832$.bind(var86, var75);
                                            module0144.$g1881$.bind(module0149.f9622(), var75);
                                            module0144.$g1882$.bind(module0149.f9623(), var75);
                                            module0144.$g1879$.bind(module0149.f9624(), var75);
                                            module0144.$g1880$.bind(module0149.f9625(), var75);
                                            try {
                                                final SubLObject var89 = module0139.f9008();
                                                final SubLObject var53_84 = module0139.$g1630$.currentBinding(var75);
                                                final SubLObject var54_85 = module0139.$g1659$.currentBinding(var75);
                                                try {
                                                    module0139.$g1630$.bind((SubLObject)NIL, var75);
                                                    module0139.$g1659$.bind(module0139.f9007(), var75);
                                                    final SubLObject var53_85 = module0144.$g1855$.currentBinding(var75);
                                                    final SubLObject var54_86 = module0139.$g1630$.currentBinding(var75);
                                                    try {
                                                        module0144.$g1855$.bind(module0139.$g1659$.getDynamicValue(var75), var75);
                                                        module0139.$g1630$.bind(var89, var75);
                                                        module0259.f16875(var86, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        if (NIL != module0309.f20981(var72, var86, var5, (SubLObject)$ic66$) && (NIL == module0144.$g1755$.getDynamicValue(var75) || NIL == var73 || NIL == var74 || NIL == module0309.f20988(var72, var73, var74, var86, var5, (SubLObject)$ic66$))) {
                                                            var79 = (SubLObject)ConsesLow.cons(var86, var79);
                                                        }
                                                    }
                                                    finally {
                                                        module0139.$g1630$.rebind(var54_86, var75);
                                                        module0144.$g1855$.rebind(var53_85, var75);
                                                    }
                                                    module0139.f9011(module0139.$g1659$.getDynamicValue(var75));
                                                }
                                                finally {
                                                    module0139.$g1659$.rebind(var54_85, var75);
                                                    module0139.$g1630$.rebind(var53_84, var75);
                                                }
                                            }
                                            finally {
                                                final SubLObject var53_86 = Threads.$is_thread_performing_cleanupP$.currentBinding(var75);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var75);
                                                    module0305.f20348();
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var53_86, var75);
                                                }
                                            }
                                        }
                                        finally {
                                            module0144.$g1880$.rebind(var88, var75);
                                            module0144.$g1879$.rebind(var87, var75);
                                            module0144.$g1882$.rebind(var55_88, var75);
                                            module0144.$g1881$.rebind(var54_84, var75);
                                            module0144.$g1832$.rebind(var53_83, var75);
                                        }
                                    }
                                    var85 = var85.rest();
                                    var86 = var85.first();
                                }
                            }
                            if (NIL != var77) {
                                var78 = var79;
                            }
                            else {
                                SubLObject var85 = var79;
                                SubLObject var86 = (SubLObject)NIL;
                                var86 = var85.first();
                                while (NIL != var85) {
                                    final SubLObject var53_87 = module0144.$g1832$.currentBinding(var75);
                                    try {
                                        module0144.$g1832$.bind(var86, var75);
                                        final SubLObject var90 = module0139.f9008();
                                        final SubLObject var53_88 = module0139.$g1630$.currentBinding(var75);
                                        final SubLObject var54_87 = module0139.$g1659$.currentBinding(var75);
                                        try {
                                            module0139.$g1630$.bind((SubLObject)NIL, var75);
                                            module0139.$g1659$.bind(module0139.f9007(), var75);
                                            final SubLObject var53_89 = module0144.$g1856$.currentBinding(var75);
                                            final SubLObject var54_88 = module0139.$g1630$.currentBinding(var75);
                                            try {
                                                module0144.$g1856$.bind(module0139.$g1659$.getDynamicValue(var75), var75);
                                                module0139.$g1630$.bind(var90, var75);
                                                final SubLObject var91 = module0269.f17705(var86);
                                                if (NIL != var91) {
                                                    module0251.f16232(module0137.f8955($ic67$), var86, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    module0251.f16238($ic68$, (SubLObject)UNPROVIDED);
                                                }
                                                final SubLObject var80_101 = (SubLObject)((NIL != module0173.f10955(var72)) ? makeBoolean(NIL != module0260.f17006(var72, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0260.f17008(var72, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) : NIL);
                                                final SubLObject var53_90 = module0144.$g1831$.currentBinding(var75);
                                                final SubLObject var54_89 = module0144.$g1843$.currentBinding(var75);
                                                final SubLObject var55_89 = module0144.$g1844$.currentBinding(var75);
                                                try {
                                                    module0144.$g1831$.bind(var72, var75);
                                                    module0144.$g1843$.bind((SubLObject)makeBoolean(NIL != module0144.$g1781$.getDynamicValue(var75) && NIL != var80_101), var75);
                                                    module0144.$g1844$.bind((SubLObject)makeBoolean(NIL != module0144.$g1782$.getDynamicValue(var75) && NIL != var80_101), var75);
                                                    if (NIL != module0309.f20981(var72, var86, var5, (SubLObject)$ic69$)) {
                                                        var78 = (SubLObject)ConsesLow.cons(var86, var78);
                                                    }
                                                }
                                                finally {
                                                    module0144.$g1844$.rebind(var55_89, var75);
                                                    module0144.$g1843$.rebind(var54_89, var75);
                                                    module0144.$g1831$.rebind(var53_90, var75);
                                                }
                                            }
                                            finally {
                                                module0139.$g1630$.rebind(var54_88, var75);
                                                module0144.$g1856$.rebind(var53_89, var75);
                                            }
                                            module0139.f9011(module0139.$g1659$.getDynamicValue(var75));
                                        }
                                        finally {
                                            module0139.$g1659$.rebind(var54_87, var75);
                                            module0139.$g1630$.rebind(var53_88, var75);
                                        }
                                    }
                                    finally {
                                        module0144.$g1832$.rebind(var53_87, var75);
                                    }
                                    var85 = var85.rest();
                                    var86 = var85.first();
                                }
                            }
                        }
                        finally {
                            module0144.$g1826$.rebind(var54_83, var75);
                            module0144.$g1833$.rebind(var53_82, var75);
                        }
                    }
                    finally {
                        module0144.$g1844$.rebind(var84, var75);
                        module0144.$g1843$.rebind(var54_82, var75);
                        module0144.$g1831$.rebind(var53_81, var75);
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var82, var75);
                    module0147.$g2094$.rebind(var81, var75);
                }
            }
            return var78;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20157(final SubLObject var69, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLObject var70 = module0226.f15143(var69, var6);
        return f20158(var69, var70, var6, (SubLObject)T);
    }
    
    public static SubLObject f20158(final SubLObject var106, final SubLObject var107, SubLObject var6, SubLObject var108) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (var108 == UNPROVIDED) {
            var108 = (SubLObject)NIL;
        }
        final SubLThread var109 = SubLProcess.currentSubLThread();
        var109.resetMultipleValues();
        final SubLObject var110 = f20159(var106, var107, var6, var108);
        final SubLObject var111 = var109.secondMultipleValue();
        var109.resetMultipleValues();
        return var110;
    }
    
    public static SubLObject f20160(final SubLObject var106, final SubLObject var107, SubLObject var6, SubLObject var108) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (var108 == UNPROVIDED) {
            var108 = (SubLObject)NIL;
        }
        final SubLThread var109 = SubLProcess.currentSubLThread();
        var109.resetMultipleValues();
        final SubLObject var110 = f20159(var106, var107, var6, var108);
        final SubLObject var111 = var109.secondMultipleValue();
        var109.resetMultipleValues();
        return var111;
    }
    
    public static SubLObject f20159(final SubLObject var106, final SubLObject var107, SubLObject var6, SubLObject var108) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (var108 == UNPROVIDED) {
            var108 = (SubLObject)T;
        }
        final SubLThread var109 = SubLProcess.currentSubLThread();
        SubLObject var110 = (SubLObject)NIL;
        SubLObject var111 = (SubLObject)NIL;
        SubLObject var112 = var107;
        SubLObject var113 = (SubLObject)NIL;
        var113 = var112.first();
        while (NIL != var112) {
            var109.resetMultipleValues();
            final SubLObject var114 = f20161(var106, var113, var6);
            final SubLObject var115 = var109.secondMultipleValue();
            var109.resetMultipleValues();
            if (NIL != var108) {
                var110 = module0256.f16529(ConsesLow.nconc(var110, var114), var6, (SubLObject)UNPROVIDED);
                var111 = module0256.f16529(ConsesLow.nconc(var111, var115), var6, (SubLObject)UNPROVIDED);
            }
            else {
                var110 = conses_high.nunion(var110, var114, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var111 = conses_high.nunion(var111, var115, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            var112 = var112.rest();
            var113 = var112.first();
        }
        return Values.values(var110, var111);
    }
    
    public static SubLObject f20162(final SubLObject var106, final SubLObject var114, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLThread var115 = SubLProcess.currentSubLThread();
        SubLObject var116 = (SubLObject)NIL;
        final SubLObject var117 = module0144.$g1799$.currentBinding(var115);
        try {
            module0144.$g1799$.bind(module0309.f20967(var114), var115);
            SubLObject var118 = module0232.f15306(var114);
            SubLObject var119 = (SubLObject)NIL;
            var119 = var118.first();
            while (NIL != var118) {
                var116 = conses_high.nunion(f20163(var106, var119, var6), var116, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var118 = var118.rest();
                var119 = var118.first();
            }
            var118 = module0232.f15308(var114);
            var119 = (SubLObject)NIL;
            var119 = var118.first();
            while (NIL != var118) {
                var116 = conses_high.nunion(f20163(var106, var119, var6), var116, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var118 = var118.rest();
                var119 = var118.first();
            }
        }
        finally {
            module0144.$g1799$.rebind(var117, var115);
        }
        return var116;
    }
    
    public static SubLObject f20163(final SubLObject var106, final SubLObject var111, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLThread var112 = SubLProcess.currentSubLThread();
        SubLObject var113 = (SubLObject)NIL;
        final SubLObject var114 = module0152.$g2108$.currentBinding(var112);
        final SubLObject var115 = module0144.$g1857$.currentBinding(var112);
        final SubLObject var116 = module0144.$g1748$.currentBinding(var112);
        try {
            module0152.$g2108$.bind((SubLObject)NIL, var112);
            module0144.$g1857$.bind((SubLObject)NIL, var112);
            module0144.$g1748$.bind((SubLObject)NIL, var112);
            final SubLObject var117 = var6;
            final SubLObject var53_116 = module0147.$g2094$.currentBinding(var112);
            final SubLObject var54_117 = module0147.$g2095$.currentBinding(var112);
            final SubLObject var55_118 = module0144.$g1785$.currentBinding(var112);
            try {
                module0147.$g2094$.bind(module0147.f9531(var117), var112);
                module0147.$g2095$.bind(module0147.f9534(var117), var112);
                module0144.$g1785$.bind((SubLObject)T, var112);
                final SubLObject var53_117 = module0144.$g1833$.currentBinding(var112);
                final SubLObject var54_118 = module0144.$g1831$.currentBinding(var112);
                final SubLObject var55_119 = module0144.$g1828$.currentBinding(var112);
                try {
                    module0144.$g1833$.bind((SubLObject)ZERO_INTEGER, var112);
                    module0144.$g1831$.bind(module0205.f13132(var111), var112);
                    module0144.$g1828$.bind(var111, var112);
                    if (NIL != module0173.f10955(module0144.$g1831$.getDynamicValue(var112))) {
                        SubLObject var118 = module0205.f13207(var111, (SubLObject)UNPROVIDED);
                        final SubLObject var53_118 = module0144.$g1832$.currentBinding(var112);
                        try {
                            module0144.$g1832$.bind((SubLObject)NIL, var112);
                            module0144.$g1832$.setDynamicValue(var118.first(), var112);
                            while (NIL != var118) {
                                module0144.$g1833$.setDynamicValue(Numbers.add(module0144.$g1833$.getDynamicValue(var112), (SubLObject)ONE_INTEGER), var112);
                                if (module0144.$g1832$.getDynamicValue(var112).equal(var106)) {
                                    module0309.f20944(module0144.$g1831$.getDynamicValue(var112), var106, module0144.$g1833$.getDynamicValue(var112), var6);
                                }
                                var118 = var118.rest();
                                module0144.$g1832$.setDynamicValue(var118.first(), var112);
                            }
                        }
                        finally {
                            module0144.$g1832$.rebind(var53_118, var112);
                        }
                    }
                }
                finally {
                    module0144.$g1828$.rebind(var55_119, var112);
                    module0144.$g1831$.rebind(var54_118, var112);
                    module0144.$g1833$.rebind(var53_117, var112);
                }
                var113 = Hashtables.gethash(var106, module0144.$g1816$.getDynamicValue(var112), (SubLObject)UNPROVIDED);
                Hashtables.clrhash(module0144.$g1816$.getDynamicValue(var112));
                Hashtables.clrhash(module0144.$g1817$.getDynamicValue(var112));
            }
            finally {
                module0144.$g1785$.rebind(var55_118, var112);
                module0147.$g2095$.rebind(var54_117, var112);
                module0147.$g2094$.rebind(var53_116, var112);
            }
        }
        finally {
            module0144.$g1748$.rebind(var116, var112);
            module0144.$g1857$.rebind(var115, var112);
            module0152.$g2108$.rebind(var114, var112);
        }
        return var113;
    }
    
    public static SubLObject f20164(final SubLObject var106, final SubLObject var123, SubLObject var6, SubLObject var124) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (var124 == UNPROVIDED) {
            var124 = (SubLObject)NIL;
        }
        final SubLThread var125 = SubLProcess.currentSubLThread();
        SubLObject var126 = (SubLObject)NIL;
        final SubLObject var127 = module0152.$g2108$.currentBinding(var125);
        final SubLObject var128 = module0144.$g1857$.currentBinding(var125);
        final SubLObject var129 = module0144.$g1748$.currentBinding(var125);
        try {
            module0152.$g2108$.bind((SubLObject)NIL, var125);
            module0144.$g1857$.bind(var124, var125);
            module0144.$g1748$.bind((SubLObject)NIL, var125);
            final SubLObject var130 = var6;
            final SubLObject var53_125 = module0147.$g2094$.currentBinding(var125);
            final SubLObject var54_126 = module0147.$g2095$.currentBinding(var125);
            final SubLObject var55_127 = module0144.$g1785$.currentBinding(var125);
            try {
                module0147.$g2094$.bind(module0147.f9531(var130), var125);
                module0147.$g2095$.bind(module0147.f9534(var130), var125);
                module0144.$g1785$.bind((SubLObject)T, var125);
                final SubLObject var53_126 = module0144.$g1845$.currentBinding(var125);
                final SubLObject var54_127 = module0144.$g1833$.currentBinding(var125);
                final SubLObject var55_128 = module0144.$g1831$.currentBinding(var125);
                final SubLObject var131 = module0144.$g1828$.currentBinding(var125);
                try {
                    module0144.$g1845$.bind(var106, var125);
                    module0144.$g1833$.bind((SubLObject)ZERO_INTEGER, var125);
                    module0144.$g1831$.bind(module0205.f13132(var123), var125);
                    module0144.$g1828$.bind(var123, var125);
                    if (NIL != module0173.f10955(module0144.$g1831$.getDynamicValue(var125))) {
                        SubLObject var132 = module0205.f13207(var123, (SubLObject)UNPROVIDED);
                        final SubLObject var53_127 = module0144.$g1832$.currentBinding(var125);
                        try {
                            module0144.$g1832$.bind((SubLObject)NIL, var125);
                            module0144.$g1832$.setDynamicValue(var132.first(), var125);
                            while (NIL != var132) {
                                module0144.$g1833$.setDynamicValue(Numbers.add(module0144.$g1833$.getDynamicValue(var125), (SubLObject)ONE_INTEGER), var125);
                                if (NIL != ((NIL != var124) ? module0205.f13220(var106, module0144.$g1832$.getDynamicValue(var125), (SubLObject)NIL, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED) : Equality.equal(var106, module0144.$g1832$.getDynamicValue(var125)))) {
                                    module0309.f20944(module0144.$g1831$.getDynamicValue(var125), module0144.$g1832$.getDynamicValue(var125), module0144.$g1833$.getDynamicValue(var125), var6);
                                }
                                var132 = var132.rest();
                                module0144.$g1832$.setDynamicValue(var132.first(), var125);
                            }
                        }
                        finally {
                            module0144.$g1832$.rebind(var53_127, var125);
                        }
                    }
                }
                finally {
                    module0144.$g1828$.rebind(var131, var125);
                    module0144.$g1831$.rebind(var55_128, var125);
                    module0144.$g1833$.rebind(var54_127, var125);
                    module0144.$g1845$.rebind(var53_126, var125);
                }
                var126 = Hashtables.gethash(var106, module0144.$g1816$.getDynamicValue(var125), (SubLObject)UNPROVIDED);
                Hashtables.clrhash(module0144.$g1816$.getDynamicValue(var125));
                Hashtables.clrhash(module0144.$g1817$.getDynamicValue(var125));
            }
            finally {
                module0144.$g1785$.rebind(var55_127, var125);
                module0147.$g2095$.rebind(var54_126, var125);
                module0147.$g2094$.rebind(var53_125, var125);
            }
        }
        finally {
            module0144.$g1748$.rebind(var129, var125);
            module0144.$g1857$.rebind(var128, var125);
            module0152.$g2108$.rebind(var127, var125);
        }
        return var126;
    }
    
    public static SubLObject f20165(final SubLObject var106, final SubLObject var111, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLThread var112 = SubLProcess.currentSubLThread();
        SubLObject var113 = (SubLObject)NIL;
        final SubLObject var114 = module0152.$g2108$.currentBinding(var112);
        final SubLObject var115 = module0144.$g1857$.currentBinding(var112);
        final SubLObject var116 = module0144.$g1749$.currentBinding(var112);
        try {
            module0152.$g2108$.bind((SubLObject)NIL, var112);
            module0144.$g1857$.bind((SubLObject)NIL, var112);
            module0144.$g1749$.bind((SubLObject)NIL, var112);
            final SubLObject var117 = var6;
            final SubLObject var53_132 = module0147.$g2094$.currentBinding(var112);
            final SubLObject var54_133 = module0147.$g2095$.currentBinding(var112);
            final SubLObject var55_134 = module0144.$g1785$.currentBinding(var112);
            try {
                module0147.$g2094$.bind(module0147.f9531(var117), var112);
                module0147.$g2095$.bind(module0147.f9534(var117), var112);
                module0144.$g1785$.bind((SubLObject)T, var112);
                final SubLObject var53_133 = module0144.$g1833$.currentBinding(var112);
                final SubLObject var54_134 = module0144.$g1831$.currentBinding(var112);
                final SubLObject var55_135 = module0144.$g1828$.currentBinding(var112);
                try {
                    module0144.$g1833$.bind((SubLObject)ZERO_INTEGER, var112);
                    module0144.$g1831$.bind(module0205.f13132(var111), var112);
                    module0144.$g1828$.bind(var111, var112);
                    if (NIL != module0173.f10955(module0144.$g1831$.getDynamicValue(var112))) {
                        SubLObject var118 = module0205.f13207(var111, (SubLObject)UNPROVIDED);
                        final SubLObject var53_134 = module0144.$g1832$.currentBinding(var112);
                        try {
                            module0144.$g1832$.bind((SubLObject)NIL, var112);
                            module0144.$g1832$.setDynamicValue(var118.first(), var112);
                            while (NIL != var118) {
                                module0144.$g1833$.setDynamicValue(Numbers.add(module0144.$g1833$.getDynamicValue(var112), (SubLObject)ONE_INTEGER), var112);
                                if (module0144.$g1832$.getDynamicValue(var112).equal(var106)) {
                                    module0309.f20944(module0144.$g1831$.getDynamicValue(var112), var106, module0144.$g1833$.getDynamicValue(var112), var6);
                                }
                                var118 = var118.rest();
                                module0144.$g1832$.setDynamicValue(var118.first(), var112);
                            }
                        }
                        finally {
                            module0144.$g1832$.rebind(var53_134, var112);
                        }
                    }
                }
                finally {
                    module0144.$g1828$.rebind(var55_135, var112);
                    module0144.$g1831$.rebind(var54_134, var112);
                    module0144.$g1833$.rebind(var53_133, var112);
                }
                var113 = Hashtables.gethash(var106, module0144.$g1817$.getDynamicValue(var112), (SubLObject)UNPROVIDED);
                Hashtables.clrhash(module0144.$g1816$.getDynamicValue(var112));
                Hashtables.clrhash(module0144.$g1817$.getDynamicValue(var112));
            }
            finally {
                module0144.$g1785$.rebind(var55_134, var112);
                module0147.$g2095$.rebind(var54_133, var112);
                module0147.$g2094$.rebind(var53_132, var112);
            }
        }
        finally {
            module0144.$g1749$.rebind(var116, var112);
            module0144.$g1857$.rebind(var115, var112);
            module0152.$g2108$.rebind(var114, var112);
        }
        return var113;
    }
    
    public static SubLObject f20166(final SubLObject var139, final SubLObject var140) {
        assert NIL != module0035.f2034(var139) : var139;
        assert NIL != module0552.f34022(var140) : var140;
        if (ONE_INTEGER.equal(Sequences.length(var139))) {
            return var140;
        }
        return module0035.f2037(var140, module0035.f2132(conses_high.copy_list(var139)), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20167(final SubLObject var139, final SubLObject var140, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLThread var141 = SubLProcess.currentSubLThread();
        assert NIL != module0035.f2034(var139) : var139;
        assert NIL != module0552.f34022(var140) : var140;
        SubLObject var142 = (SubLObject)NIL;
        SubLObject var143 = (SubLObject)NIL;
        SubLObject var144 = (SubLObject)NIL;
        final SubLObject var145 = f20166(var139, var140);
        final SubLObject var146 = module0152.$g2108$.currentBinding(var141);
        final SubLObject var147 = module0144.$g1857$.currentBinding(var141);
        try {
            module0152.$g2108$.bind((SubLObject)NIL, var141);
            module0144.$g1857$.bind((SubLObject)NIL, var141);
            final SubLObject var148 = var6;
            final SubLObject var53_143 = module0147.$g2094$.currentBinding(var141);
            final SubLObject var54_144 = module0147.$g2095$.currentBinding(var141);
            final SubLObject var149 = module0144.$g1785$.currentBinding(var141);
            try {
                module0147.$g2094$.bind(module0147.f9531(var148), var141);
                module0147.$g2095$.bind(module0147.f9534(var148), var141);
                module0144.$g1785$.bind((SubLObject)T, var141);
                final SubLObject var53_144 = module0144.$g1833$.currentBinding(var141);
                final SubLObject var54_145 = module0144.$g1831$.currentBinding(var141);
                final SubLObject var55_147 = module0144.$g1828$.currentBinding(var141);
                try {
                    module0144.$g1833$.bind(conses_high.last(var139, (SubLObject)UNPROVIDED).first(), var141);
                    module0144.$g1831$.bind(module0205.f13132(var145), var141);
                    module0144.$g1828$.bind(var145, var141);
                    var142 = ConsesLow.nth(module0144.$g1833$.getDynamicValue(var141), var145);
                    if (NIL != module0173.f10955(module0144.$g1831$.getDynamicValue(var141))) {
                        module0309.f20944(module0144.$g1831$.getDynamicValue(var141), var142, module0144.$g1833$.getDynamicValue(var141), var6);
                    }
                }
                finally {
                    module0144.$g1828$.rebind(var55_147, var141);
                    module0144.$g1831$.rebind(var54_145, var141);
                    module0144.$g1833$.rebind(var53_144, var141);
                }
                var143 = Hashtables.gethash(var142, module0144.$g1816$.getDynamicValue(var141), (SubLObject)UNPROVIDED);
                var144 = Hashtables.gethash(var142, module0144.$g1817$.getDynamicValue(var141), (SubLObject)UNPROVIDED);
                Hashtables.clrhash(module0144.$g1816$.getDynamicValue(var141));
                Hashtables.clrhash(module0144.$g1817$.getDynamicValue(var141));
            }
            finally {
                module0144.$g1785$.rebind(var149, var141);
                module0147.$g2095$.rebind(var54_144, var141);
                module0147.$g2094$.rebind(var53_143, var141);
            }
        }
        finally {
            module0144.$g1857$.rebind(var147, var141);
            module0152.$g2108$.rebind(var146, var141);
        }
        return Values.values(module0256.f16529(var143, var6, (SubLObject)UNPROVIDED), module0256.f16529(var144, var6, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f20161(final SubLObject var106, final SubLObject var111, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLThread var112 = SubLProcess.currentSubLThread();
        SubLObject var113 = (SubLObject)NIL;
        SubLObject var114 = (SubLObject)NIL;
        final SubLObject var115 = module0152.$g2108$.currentBinding(var112);
        final SubLObject var116 = module0144.$g1857$.currentBinding(var112);
        try {
            module0152.$g2108$.bind((SubLObject)NIL, var112);
            module0144.$g1857$.bind((SubLObject)NIL, var112);
            final SubLObject var117 = var6;
            final SubLObject var53_148 = module0147.$g2094$.currentBinding(var112);
            final SubLObject var54_149 = module0147.$g2095$.currentBinding(var112);
            final SubLObject var118 = module0144.$g1785$.currentBinding(var112);
            try {
                module0147.$g2094$.bind(module0147.f9531(var117), var112);
                module0147.$g2095$.bind(module0147.f9534(var117), var112);
                module0144.$g1785$.bind((SubLObject)T, var112);
                final SubLObject var53_149 = module0144.$g1833$.currentBinding(var112);
                final SubLObject var54_150 = module0144.$g1831$.currentBinding(var112);
                final SubLObject var55_152 = module0144.$g1828$.currentBinding(var112);
                try {
                    module0144.$g1833$.bind((SubLObject)ZERO_INTEGER, var112);
                    module0144.$g1831$.bind(module0205.f13132(var111), var112);
                    module0144.$g1828$.bind(var111, var112);
                    if (NIL != module0173.f10955(module0144.$g1831$.getDynamicValue(var112))) {
                        SubLObject var119 = module0205.f13207(var111, (SubLObject)UNPROVIDED);
                        final SubLObject var53_150 = module0144.$g1832$.currentBinding(var112);
                        try {
                            module0144.$g1832$.bind((SubLObject)NIL, var112);
                            module0144.$g1832$.setDynamicValue(var119.first(), var112);
                            while (NIL != var119) {
                                module0144.$g1833$.setDynamicValue(Numbers.add(module0144.$g1833$.getDynamicValue(var112), (SubLObject)ONE_INTEGER), var112);
                                if (module0144.$g1832$.getDynamicValue(var112).equal(var106)) {
                                    module0309.f20944(module0144.$g1831$.getDynamicValue(var112), var106, module0144.$g1833$.getDynamicValue(var112), var6);
                                }
                                var119 = var119.rest();
                                module0144.$g1832$.setDynamicValue(var119.first(), var112);
                            }
                        }
                        finally {
                            module0144.$g1832$.rebind(var53_150, var112);
                        }
                    }
                }
                finally {
                    module0144.$g1828$.rebind(var55_152, var112);
                    module0144.$g1831$.rebind(var54_150, var112);
                    module0144.$g1833$.rebind(var53_149, var112);
                }
                var113 = Hashtables.gethash(var106, module0144.$g1816$.getDynamicValue(var112), (SubLObject)UNPROVIDED);
                var114 = Hashtables.gethash(var106, module0144.$g1817$.getDynamicValue(var112), (SubLObject)UNPROVIDED);
                Hashtables.clrhash(module0144.$g1816$.getDynamicValue(var112));
                Hashtables.clrhash(module0144.$g1817$.getDynamicValue(var112));
            }
            finally {
                module0144.$g1785$.rebind(var118, var112);
                module0147.$g2095$.rebind(var54_149, var112);
                module0147.$g2094$.rebind(var53_148, var112);
            }
        }
        finally {
            module0144.$g1857$.rebind(var116, var112);
            module0152.$g2108$.rebind(var115, var112);
        }
        return Values.values(var113, var114);
    }
    
    public static SubLObject f20168(final SubLObject var15, final SubLObject var111, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLObject var112 = module0205.f13134(var111, var15, (SubLObject)UNPROVIDED);
        return f20163(var112, var111, var6);
    }
    
    public static SubLObject f20169(final SubLObject var154, final SubLObject var155, final SubLObject var15, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLThread var156 = SubLProcess.currentSubLThread();
        SubLObject var157 = (SubLObject)NIL;
        final SubLObject var158 = f20170(var154);
        final SubLObject var159 = module0144.$g1828$.currentBinding(var156);
        final SubLObject var160 = module0144.$g1832$.currentBinding(var156);
        final SubLObject var161 = module0144.$g1833$.currentBinding(var156);
        final SubLObject var162 = module0152.$g2108$.currentBinding(var156);
        final SubLObject var163 = module0144.$g1857$.currentBinding(var156);
        final SubLObject var164 = module0144.$g1748$.currentBinding(var156);
        try {
            module0144.$g1828$.bind(module0035.f2151(var15, var155, var158), var156);
            module0144.$g1832$.bind(var155, var156);
            module0144.$g1833$.bind(var15, var156);
            module0152.$g2108$.bind((SubLObject)NIL, var156);
            module0144.$g1857$.bind((SubLObject)NIL, var156);
            module0144.$g1748$.bind((SubLObject)NIL, var156);
            final SubLObject var165 = var6;
            final SubLObject var53_156 = module0147.$g2094$.currentBinding(var156);
            final SubLObject var54_157 = module0147.$g2095$.currentBinding(var156);
            final SubLObject var55_158 = module0144.$g1785$.currentBinding(var156);
            try {
                module0147.$g2094$.bind(module0147.f9531(var165), var156);
                module0147.$g2095$.bind(module0147.f9534(var165), var156);
                module0144.$g1785$.bind((SubLObject)T, var156);
                final SubLObject var53_157 = module0144.$g1831$.currentBinding(var156);
                final SubLObject var54_158 = module0144.$g1828$.currentBinding(var156);
                try {
                    module0144.$g1831$.bind(module0205.f13132(module0144.$g1828$.getDynamicValue(var156)), var156);
                    module0144.$g1828$.bind(module0144.$g1828$.getDynamicValue(var156), var156);
                    SubLObject var166 = (SubLObject)ZERO_INTEGER;
                    SubLObject var167 = module0202.f12829(module0144.$g1828$.getDynamicValue(var156), (SubLObject)UNPROVIDED);
                    SubLObject var168 = (SubLObject)NIL;
                    var168 = var167.first();
                    while (NIL != var167) {
                        var166 = Numbers.add(var166, (SubLObject)ONE_INTEGER);
                        if (var166.numE(var15)) {
                            module0309.f20984(var154, var168, var15, var6);
                        }
                        else {
                            module0309.f20944(var154, var168, var166, (SubLObject)UNPROVIDED);
                        }
                        var167 = var167.rest();
                        var168 = var167.first();
                    }
                    var166 = (SubLObject)ZERO_INTEGER;
                    var167 = module0202.f12829(module0144.$g1828$.getDynamicValue(var156), (SubLObject)UNPROVIDED);
                    var168 = (SubLObject)NIL;
                    var168 = var167.first();
                    while (NIL != var167) {
                        var166 = Numbers.add(var166, (SubLObject)ONE_INTEGER);
                        if (!var155.eql(var168)) {
                            var157 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var166, module0256.f16529(module0035.f2272(Hashtables.gethash(var168, module0144.$g1816$.getDynamicValue(var156), (SubLObject)UNPROVIDED)), var6, (SubLObject)UNPROVIDED)), var157);
                        }
                        var167 = var167.rest();
                        var168 = var167.first();
                    }
                }
                finally {
                    module0144.$g1828$.rebind(var54_158, var156);
                    module0144.$g1831$.rebind(var53_157, var156);
                }
                Hashtables.clrhash(module0144.$g1816$.getDynamicValue(var156));
                Hashtables.clrhash(module0144.$g1817$.getDynamicValue(var156));
            }
            finally {
                module0144.$g1785$.rebind(var55_158, var156);
                module0147.$g2095$.rebind(var54_157, var156);
                module0147.$g2094$.rebind(var53_156, var156);
            }
        }
        finally {
            module0144.$g1748$.rebind(var164, var156);
            module0144.$g1857$.rebind(var163, var156);
            module0152.$g2108$.rebind(var162, var156);
            module0144.$g1833$.rebind(var161, var156);
            module0144.$g1832$.rebind(var160, var156);
            module0144.$g1828$.rebind(var159, var156);
        }
        return Sequences.nreverse(var157);
    }
    
    public static SubLObject f20170(final SubLObject var154) {
        final SubLObject var155 = module0225.f14739(var154);
        SubLObject var156 = (SubLObject)ConsesLow.list(var154);
        if (NIL != module0202.f12909(var155)) {
            SubLObject var157;
            for (var157 = (SubLObject)NIL, var157 = (SubLObject)ZERO_INTEGER; var157.numL(var155); var157 = Numbers.add(var157, (SubLObject)ONE_INTEGER)) {
                var156 = (SubLObject)ConsesLow.cons(module0279.f18441(var157, (SubLObject)$ic72$), var156);
            }
        }
        return Sequences.nreverse(var156);
    }
    
    public static SubLObject f20171(final SubLObject var163) {
        final SubLThread var164 = SubLProcess.currentSubLThread();
        final SubLObject var165 = module0178.f11287(var163);
        final SubLObject var166 = module0178.f11334(var163);
        SubLObject var167 = (SubLObject)NIL;
        if (NIL != module0173.f10955(var166)) {
            final SubLObject var168 = module0018.$g584$.currentBinding(var164);
            try {
                module0018.$g584$.bind((SubLObject)NIL, var164);
                if (NIL != module0269.f17706(var166)) {
                    final SubLObject var53_164 = module0147.$g2094$.currentBinding(var164);
                    final SubLObject var169 = module0147.$g2095$.currentBinding(var164);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic73$, var164);
                        module0147.$g2095$.bind(var165, var164);
                        module0260.f17063(var166, (SubLObject)$ic74$, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0147.$g2095$.rebind(var169, var164);
                        module0147.$g2094$.rebind(var53_164, var164);
                    }
                }
                else {
                    final SubLObject var53_165 = module0147.$g2094$.currentBinding(var164);
                    final SubLObject var169 = module0147.$g2095$.currentBinding(var164);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic73$, var164);
                        module0147.$g2095$.bind(var165, var164);
                        module0219.f14478((SubLObject)$ic75$, var166, (SubLObject)$ic76$, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0147.$g2095$.rebind(var169, var164);
                        module0147.$g2094$.rebind(var53_165, var164);
                    }
                }
                var167 = module0018.$g584$.getDynamicValue(var164);
            }
            finally {
                module0018.$g584$.rebind(var168, var164);
            }
        }
        return var167;
    }
    
    public static SubLObject f20172(final SubLObject var70) {
        if (NIL != module0173.f10955(var70)) {
            module0219.f14478((SubLObject)$ic75$, var70, (SubLObject)$ic76$, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20173() {
        return module0077.f5302($g2707$.getGlobalValue());
    }
    
    public static SubLObject f20174(final SubLObject var72) {
        return module0077.f5326(var72, $g2707$.getGlobalValue());
    }
    
    public static SubLObject f20175(final SubLObject var72) {
        return module0077.f5327(var72, $g2707$.getGlobalValue());
    }
    
    public static SubLObject f20176(final SubLObject var72) {
        SubLObject var73 = (SubLObject)ZERO_INTEGER;
        SubLObject var74 = module0146.$g1959$.getGlobalValue();
        SubLObject var75 = (SubLObject)NIL;
        var75 = var74.first();
        while (NIL != var74) {
            SubLObject var85_166 = module0146.$g1959$.getGlobalValue();
            SubLObject var76 = (SubLObject)NIL;
            var76 = var85_166.first();
            while (NIL != var85_166) {
                final SubLObject var77 = f20126(var75, var76);
                if (NIL != var77) {
                    var73 = Numbers.add(var73, module0217.f14221(var72, (SubLObject)ONE_INTEGER, var77, (SubLObject)UNPROVIDED));
                }
                var85_166 = var85_166.rest();
                var76 = var85_166.first();
            }
            var74 = var74.rest();
            var75 = var74.first();
        }
        if (var73.numLE((SubLObject)ONE_INTEGER)) {
            return f20175(var72);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20177(final SubLObject var72) {
        if (NIL != f20173()) {
            return f20174(var72);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20178(final SubLObject var72) {
        if (NIL != f20173()) {
            return f20176(var72);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20142() {
        if (NIL != module0077.f5302($g2707$.getGlobalValue())) {
            module0077.f5328($g2707$.getGlobalValue());
        }
        else {
            $g2707$.setGlobalValue(module0077.f5313((SubLObject)EQL, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20139() {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        f20142();
        final SubLObject var51 = module0147.$g2094$.currentBinding(var50);
        final SubLObject var52 = module0147.$g2095$.currentBinding(var50);
        try {
            module0147.$g2094$.bind((SubLObject)$ic78$, var50);
            module0147.$g2095$.bind($ic79$, var50);
            final SubLObject var53 = module0146.$g1959$.getGlobalValue();
            module0012.$g82$.setDynamicValue((SubLObject)$ic80$, var50);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var50);
            module0012.$g83$.setDynamicValue(Sequences.length(var53), var50);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var50);
            final SubLObject var53_170 = module0012.$g75$.currentBinding(var50);
            final SubLObject var54_171 = module0012.$g76$.currentBinding(var50);
            final SubLObject var54 = module0012.$g77$.currentBinding(var50);
            final SubLObject var55 = module0012.$g78$.currentBinding(var50);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var50);
                module0012.$g76$.bind((SubLObject)NIL, var50);
                module0012.$g77$.bind((SubLObject)T, var50);
                module0012.$g78$.bind(Time.get_universal_time(), var50);
                module0012.f478(module0012.$g82$.getDynamicValue(var50));
                SubLObject var56 = var53;
                SubLObject var57 = (SubLObject)NIL;
                var57 = var56.first();
                while (NIL != var56) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var50), module0012.$g83$.getDynamicValue(var50));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var50), (SubLObject)ONE_INTEGER), var50);
                    SubLObject var58 = module0146.$g1959$.getGlobalValue();
                    SubLObject var59 = (SubLObject)NIL;
                    var59 = var58.first();
                    while (NIL != var58) {
                        if (!var57.eql(var59)) {
                            final SubLObject var60 = f20126(var57, var59);
                            if (NIL != var60) {
                                final SubLObject var61 = var60;
                                if (NIL != module0158.f10038(var61)) {
                                    final SubLObject var62 = (SubLObject)NIL;
                                    final SubLObject var53_171 = module0012.$g73$.currentBinding(var50);
                                    final SubLObject var54_172 = module0012.$g65$.currentBinding(var50);
                                    final SubLObject var55_175 = module0012.$g67$.currentBinding(var50);
                                    final SubLObject var56_176 = module0012.$g68$.currentBinding(var50);
                                    final SubLObject var63 = module0012.$g66$.currentBinding(var50);
                                    final SubLObject var64 = module0012.$g69$.currentBinding(var50);
                                    final SubLObject var65 = module0012.$g70$.currentBinding(var50);
                                    final SubLObject var66 = module0012.$silent_progressP$.currentBinding(var50);
                                    try {
                                        module0012.$g73$.bind(Time.get_universal_time(), var50);
                                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var50), var50);
                                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var50);
                                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var50);
                                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var50);
                                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var50);
                                        module0012.$g70$.bind((SubLObject)T, var50);
                                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var62) ? module0012.$silent_progressP$.getDynamicValue(var50) : T), var50);
                                        module0012.f474(var62);
                                        final SubLObject var67 = module0158.f10039(var61);
                                        SubLObject var68 = (SubLObject)NIL;
                                        final SubLObject var69 = (SubLObject)NIL;
                                        while (NIL == var68) {
                                            final SubLObject var70 = module0052.f3695(var67, var69);
                                            final SubLObject var71 = (SubLObject)makeBoolean(!var69.eql(var70));
                                            if (NIL != var71) {
                                                module0012.f476();
                                                SubLObject var72 = (SubLObject)NIL;
                                                try {
                                                    var72 = module0158.f10316(var70, (SubLObject)$ic81$, (SubLObject)$ic76$, (SubLObject)NIL);
                                                    SubLObject var178_183 = (SubLObject)NIL;
                                                    final SubLObject var179_184 = (SubLObject)NIL;
                                                    while (NIL == var178_183) {
                                                        final SubLObject var73 = module0052.f3695(var72, var179_184);
                                                        final SubLObject var181_186 = (SubLObject)makeBoolean(!var179_184.eql(var73));
                                                        if (NIL != var181_186) {
                                                            final SubLObject var74 = module0178.f11334(var73);
                                                            f20174(var74);
                                                        }
                                                        var178_183 = (SubLObject)makeBoolean(NIL == var181_186);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var53_172 = Threads.$is_thread_performing_cleanupP$.currentBinding(var50);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var50);
                                                        if (NIL != var72) {
                                                            module0158.f10319(var72);
                                                        }
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var53_172, var50);
                                                    }
                                                }
                                            }
                                            var68 = (SubLObject)makeBoolean(NIL == var71);
                                        }
                                        module0012.f475();
                                    }
                                    finally {
                                        module0012.$silent_progressP$.rebind(var66, var50);
                                        module0012.$g70$.rebind(var65, var50);
                                        module0012.$g69$.rebind(var64, var50);
                                        module0012.$g66$.rebind(var63, var50);
                                        module0012.$g68$.rebind(var56_176, var50);
                                        module0012.$g67$.rebind(var55_175, var50);
                                        module0012.$g65$.rebind(var54_172, var50);
                                        module0012.$g73$.rebind(var53_171, var50);
                                    }
                                }
                            }
                        }
                        var58 = var58.rest();
                        var59 = var58.first();
                    }
                    var56 = var56.rest();
                    var57 = var56.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var55, var50);
                module0012.$g77$.rebind(var54, var50);
                module0012.$g76$.rebind(var54_171, var50);
                module0012.$g75$.rebind(var53_170, var50);
            }
        }
        finally {
            module0147.$g2095$.rebind(var52, var50);
            module0147.$g2094$.rebind(var51, var50);
        }
        return module0077.f5311($g2707$.getGlobalValue());
    }
    
    public static SubLObject f20179(final SubLObject var72) {
        return module0077.f5320(var72, $g2707$.getGlobalValue());
    }
    
    public static SubLObject f20180(final SubLObject var72) {
        final SubLThread var73 = SubLProcess.currentSubLThread();
        SubLObject var74 = (SubLObject)NIL;
        if (NIL != module0269.f17706(var72)) {
            if (NIL == var74) {
                final SubLObject var75 = module0137.f8955($ic82$);
                final SubLObject var76 = (SubLObject)(($ic83$ == $ic83$) ? $ic84$ : $ic85$);
                final SubLObject var77 = module0056.f4145(var76);
                SubLObject var78 = (SubLObject)NIL;
                final SubLObject var79 = module0139.$g1635$.currentBinding(var73);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var73);
                    final SubLObject var80 = (SubLObject)NIL;
                    final SubLObject var53_195 = module0141.$g1714$.currentBinding(var73);
                    final SubLObject var81 = module0141.$g1715$.currentBinding(var73);
                    try {
                        module0141.$g1714$.bind((NIL != var80) ? var80 : module0141.f9283(), var73);
                        module0141.$g1715$.bind((SubLObject)((NIL != var80) ? $ic86$ : module0141.$g1715$.getDynamicValue(var73)), var73);
                        if (NIL != var80 && NIL != module0136.f8864() && NIL == module0141.f9279(var80)) {
                            final SubLObject var82 = module0136.$g1591$.getDynamicValue(var73);
                            if (var82.eql((SubLObject)$ic87$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic88$, var80, (SubLObject)$ic89$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var82.eql((SubLObject)$ic90$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic91$, (SubLObject)$ic88$, var80, (SubLObject)$ic89$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var82.eql((SubLObject)$ic92$)) {
                                Errors.warn((SubLObject)$ic88$, var80, (SubLObject)$ic89$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic93$, module0136.$g1591$.getDynamicValue(var73));
                                Errors.cerror((SubLObject)$ic91$, (SubLObject)$ic88$, var80, (SubLObject)$ic89$);
                            }
                        }
                        final SubLObject var53_196 = module0141.$g1670$.currentBinding(var73);
                        final SubLObject var54_197 = module0141.$g1671$.currentBinding(var73);
                        final SubLObject var83 = module0141.$g1672$.currentBinding(var73);
                        final SubLObject var84 = module0141.$g1674$.currentBinding(var73);
                        final SubLObject var85 = module0137.$g1605$.currentBinding(var73);
                        try {
                            module0141.$g1670$.bind(var75, var73);
                            module0141.$g1671$.bind(module0244.f15739(var75), var73);
                            module0141.$g1672$.bind(module0244.f15746(var75), var73);
                            module0141.$g1674$.bind((SubLObject)NIL, var73);
                            module0137.$g1605$.bind(var75, var73);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var72, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var53_197 = module0141.$g1677$.currentBinding(var73);
                                final SubLObject var54_198 = module0138.$g1619$.currentBinding(var73);
                                final SubLObject var55_200 = module0141.$g1674$.currentBinding(var73);
                                try {
                                    module0141.$g1677$.bind(module0141.f9208(), var73);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), var75), var73);
                                    module0141.$g1674$.bind((SubLObject)NIL, var73);
                                    module0249.f16055(var72, (SubLObject)UNPROVIDED);
                                    for (var78 = (SubLObject)ConsesLow.list(var72, module0141.f9195()); NIL != var78 && NIL == var74; var78 = module0056.f4150(var77)) {
                                        final SubLObject var190_201 = var78.first();
                                        final SubLObject var86 = conses_high.second(var78);
                                        final SubLObject var87 = var190_201;
                                        final SubLObject var53_198 = module0141.$g1674$.currentBinding(var73);
                                        try {
                                            module0141.$g1674$.bind(var86, var73);
                                            final SubLObject var88 = var86;
                                            if (NIL != f20179(var87)) {
                                                var74 = (SubLObject)T;
                                            }
                                            final SubLObject var89 = module0200.f12443(var75);
                                            SubLObject var90;
                                            SubLObject var91;
                                            SubLObject var53_199;
                                            SubLObject var54_199;
                                            SubLObject var92;
                                            SubLObject var93;
                                            SubLObject var94;
                                            SubLObject var95;
                                            SubLObject var96;
                                            SubLObject var97;
                                            SubLObject var53_200;
                                            SubLObject var214_218;
                                            SubLObject var98;
                                            SubLObject var99;
                                            SubLObject var53_201;
                                            SubLObject var100;
                                            SubLObject var101;
                                            SubLObject var102;
                                            SubLObject var103;
                                            SubLObject var104;
                                            SubLObject var105;
                                            SubLObject var106;
                                            SubLObject var107;
                                            SubLObject var207_228;
                                            SubLObject var108;
                                            SubLObject var53_202;
                                            SubLObject var110;
                                            SubLObject var109;
                                            SubLObject var111;
                                            SubLObject var112;
                                            SubLObject var113;
                                            SubLObject var114;
                                            SubLObject var115;
                                            SubLObject var116;
                                            for (var90 = (SubLObject)NIL, var90 = var89; NIL == var74 && NIL != var90; var90 = var90.rest()) {
                                                var91 = var90.first();
                                                var53_199 = module0137.$g1605$.currentBinding(var73);
                                                var54_199 = module0141.$g1674$.currentBinding(var73);
                                                try {
                                                    module0137.$g1605$.bind(var91, var73);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var73)) : module0141.$g1674$.getDynamicValue(var73)), var73);
                                                    var92 = module0228.f15229(var190_201);
                                                    if (NIL != module0138.f8992(var92)) {
                                                        var93 = module0242.f15664(var92, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var93) {
                                                            var94 = module0245.f15834(var93, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var94) {
                                                                for (var95 = module0066.f4838(module0067.f4891(var94)); NIL == var74 && NIL == module0066.f4841(var95); var95 = module0066.f4840(var95)) {
                                                                    var73.resetMultipleValues();
                                                                    var96 = module0066.f4839(var95);
                                                                    var97 = var73.secondMultipleValue();
                                                                    var73.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var96)) {
                                                                        var53_200 = module0138.$g1623$.currentBinding(var73);
                                                                        try {
                                                                            module0138.$g1623$.bind(var96, var73);
                                                                            for (var214_218 = module0066.f4838(module0067.f4891(var97)); NIL == var74 && NIL == module0066.f4841(var214_218); var214_218 = module0066.f4840(var214_218)) {
                                                                                var73.resetMultipleValues();
                                                                                var98 = module0066.f4839(var214_218);
                                                                                var99 = var73.secondMultipleValue();
                                                                                var73.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var98)) {
                                                                                    var53_201 = module0138.$g1624$.currentBinding(var73);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var98, var73);
                                                                                        var100 = var99;
                                                                                        if (NIL != module0077.f5302(var100)) {
                                                                                            var101 = module0077.f5333(var100);
                                                                                            for (var102 = module0032.f1741(var101), var103 = (SubLObject)NIL, var103 = module0032.f1742(var102, var101); NIL == var74 && NIL == module0032.f1744(var102, var103); var103 = module0032.f1743(var103)) {
                                                                                                var104 = module0032.f1745(var102, var103);
                                                                                                if (NIL != module0032.f1746(var103, var104) && NIL == module0249.f16059(var104, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var104, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var104, module0141.f9195()), var77);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var100.isList()) {
                                                                                            if (NIL == var74) {
                                                                                                var105 = var100;
                                                                                                var106 = (SubLObject)NIL;
                                                                                                var106 = var105.first();
                                                                                                while (NIL == var74 && NIL != var105) {
                                                                                                    if (NIL == module0249.f16059(var106, (SubLObject)UNPROVIDED)) {
                                                                                                        module0249.f16055(var106, (SubLObject)UNPROVIDED);
                                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var106, module0141.f9195()), var77);
                                                                                                    }
                                                                                                    var105 = var105.rest();
                                                                                                    var106 = var105.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic94$, var100);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var53_201, var73);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var214_218);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var53_200, var73);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var95);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic95$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var92, (SubLObject)UNPROVIDED)) {
                                                        var107 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var73), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var73), module0137.f8955((SubLObject)UNPROVIDED)));
                                                        for (var207_228 = (SubLObject)NIL, var207_228 = var107; NIL == var74 && NIL != var207_228; var207_228 = var207_228.rest()) {
                                                            var108 = var207_228.first();
                                                            var53_202 = module0138.$g1625$.currentBinding(var73);
                                                            try {
                                                                module0138.$g1625$.bind(var108, var73);
                                                                var109 = (var110 = Functions.funcall(var108, var92));
                                                                if (NIL != module0077.f5302(var110)) {
                                                                    var111 = module0077.f5333(var110);
                                                                    for (var112 = module0032.f1741(var111), var113 = (SubLObject)NIL, var113 = module0032.f1742(var112, var111); NIL == var74 && NIL == module0032.f1744(var112, var113); var113 = module0032.f1743(var113)) {
                                                                        var114 = module0032.f1745(var112, var113);
                                                                        if (NIL != module0032.f1746(var113, var114) && NIL == module0249.f16059(var114, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var114, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var114, module0141.f9195()), var77);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var110.isList()) {
                                                                    if (NIL == var74) {
                                                                        var115 = var110;
                                                                        var116 = (SubLObject)NIL;
                                                                        var116 = var115.first();
                                                                        while (NIL == var74 && NIL != var115) {
                                                                            if (NIL == module0249.f16059(var116, (SubLObject)UNPROVIDED)) {
                                                                                module0249.f16055(var116, (SubLObject)UNPROVIDED);
                                                                                module0056.f4149((SubLObject)ConsesLow.list(var116, module0141.f9195()), var77);
                                                                            }
                                                                            var115 = var115.rest();
                                                                            var116 = var115.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic94$, var110);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var53_202, var73);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var54_199, var73);
                                                    module0137.$g1605$.rebind(var53_199, var73);
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var53_198, var73);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var55_200, var73);
                                    module0138.$g1619$.rebind(var54_198, var73);
                                    module0141.$g1677$.rebind(var53_197, var73);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic96$, var72, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var85, var73);
                            module0141.$g1674$.rebind(var84, var73);
                            module0141.$g1672$.rebind(var83, var73);
                            module0141.$g1671$.rebind(var54_197, var73);
                            module0141.$g1670$.rebind(var53_196, var73);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var81, var73);
                        module0141.$g1714$.rebind(var53_195, var73);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var73));
                }
                finally {
                    module0139.$g1635$.rebind(var79, var73);
                }
            }
        }
        else {
            var74 = f20179(var72);
        }
        return var74;
    }
    
    public static SubLObject f20181() {
        return module0077.f5302($g2708$.getGlobalValue());
    }
    
    public static SubLObject f20182(final SubLObject var72) {
        return module0077.f5326(var72, $g2708$.getGlobalValue());
    }
    
    public static SubLObject f20183(final SubLObject var72) {
        return module0077.f5327(var72, $g2708$.getGlobalValue());
    }
    
    public static SubLObject f20184(final SubLObject var72) {
        SubLObject var73 = (SubLObject)ZERO_INTEGER;
        SubLObject var74 = module0146.$g1959$.getGlobalValue();
        SubLObject var75 = (SubLObject)NIL;
        var75 = var74.first();
        while (NIL != var74) {
            SubLObject var85_231 = module0146.$g1959$.getGlobalValue();
            SubLObject var76 = (SubLObject)NIL;
            var76 = var85_231.first();
            while (NIL != var85_231) {
                final SubLObject var77 = module0226.f15051(var75, var76);
                if (NIL != var77) {
                    var73 = Numbers.add(var73, module0217.f14221(var72, (SubLObject)ONE_INTEGER, var77, (SubLObject)UNPROVIDED));
                }
                var85_231 = var85_231.rest();
                var76 = var85_231.first();
            }
            var74 = var74.rest();
            var75 = var74.first();
        }
        if (var73.numLE((SubLObject)ONE_INTEGER)) {
            return f20183(var72);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20185(final SubLObject var72) {
        if (NIL != f20181()) {
            return f20182(var72);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20186(final SubLObject var72) {
        if (NIL != f20181()) {
            return f20184(var72);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20143() {
        if (NIL != module0077.f5302($g2708$.getGlobalValue())) {
            module0077.f5328($g2708$.getGlobalValue());
        }
        else {
            $g2708$.setGlobalValue(module0077.f5313((SubLObject)EQL, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20140() {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        f20143();
        final SubLObject var51 = module0147.$g2094$.currentBinding(var50);
        final SubLObject var52 = module0147.$g2095$.currentBinding(var50);
        try {
            module0147.$g2094$.bind((SubLObject)$ic78$, var50);
            module0147.$g2095$.bind($ic79$, var50);
            final SubLObject var53 = module0146.$g1959$.getGlobalValue();
            module0012.$g82$.setDynamicValue((SubLObject)$ic98$, var50);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var50);
            module0012.$g83$.setDynamicValue(Sequences.length(var53), var50);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var50);
            final SubLObject var53_233 = module0012.$g75$.currentBinding(var50);
            final SubLObject var54_234 = module0012.$g76$.currentBinding(var50);
            final SubLObject var54 = module0012.$g77$.currentBinding(var50);
            final SubLObject var55 = module0012.$g78$.currentBinding(var50);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var50);
                module0012.$g76$.bind((SubLObject)NIL, var50);
                module0012.$g77$.bind((SubLObject)T, var50);
                module0012.$g78$.bind(Time.get_universal_time(), var50);
                module0012.f478(module0012.$g82$.getDynamicValue(var50));
                SubLObject var56 = var53;
                SubLObject var57 = (SubLObject)NIL;
                var57 = var56.first();
                while (NIL != var56) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var50), module0012.$g83$.getDynamicValue(var50));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var50), (SubLObject)ONE_INTEGER), var50);
                    SubLObject var58 = module0146.$g1959$.getGlobalValue();
                    SubLObject var59 = (SubLObject)NIL;
                    var59 = var58.first();
                    while (NIL != var58) {
                        final SubLObject var60 = module0226.f15051(var57, var59);
                        if (NIL != var60) {
                            final SubLObject var61 = var60;
                            if (NIL != module0158.f10038(var61)) {
                                final SubLObject var62 = (SubLObject)NIL;
                                final SubLObject var53_234 = module0012.$g73$.currentBinding(var50);
                                final SubLObject var54_235 = module0012.$g65$.currentBinding(var50);
                                final SubLObject var55_237 = module0012.$g67$.currentBinding(var50);
                                final SubLObject var56_238 = module0012.$g68$.currentBinding(var50);
                                final SubLObject var63 = module0012.$g66$.currentBinding(var50);
                                final SubLObject var64 = module0012.$g69$.currentBinding(var50);
                                final SubLObject var65 = module0012.$g70$.currentBinding(var50);
                                final SubLObject var66 = module0012.$silent_progressP$.currentBinding(var50);
                                try {
                                    module0012.$g73$.bind(Time.get_universal_time(), var50);
                                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var50), var50);
                                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var50);
                                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var50);
                                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var50);
                                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var50);
                                    module0012.$g70$.bind((SubLObject)T, var50);
                                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var62) ? module0012.$silent_progressP$.getDynamicValue(var50) : T), var50);
                                    module0012.f474(var62);
                                    final SubLObject var67 = module0158.f10039(var61);
                                    SubLObject var68 = (SubLObject)NIL;
                                    final SubLObject var69 = (SubLObject)NIL;
                                    while (NIL == var68) {
                                        final SubLObject var70 = module0052.f3695(var67, var69);
                                        final SubLObject var71 = (SubLObject)makeBoolean(!var69.eql(var70));
                                        if (NIL != var71) {
                                            module0012.f476();
                                            SubLObject var72 = (SubLObject)NIL;
                                            try {
                                                var72 = module0158.f10316(var70, (SubLObject)$ic81$, (SubLObject)$ic76$, (SubLObject)NIL);
                                                SubLObject var178_239 = (SubLObject)NIL;
                                                final SubLObject var179_240 = (SubLObject)NIL;
                                                while (NIL == var178_239) {
                                                    final SubLObject var73 = module0052.f3695(var72, var179_240);
                                                    final SubLObject var181_241 = (SubLObject)makeBoolean(!var179_240.eql(var73));
                                                    if (NIL != var181_241) {
                                                        final SubLObject var74 = module0178.f11334(var73);
                                                        f20182(var74);
                                                    }
                                                    var178_239 = (SubLObject)makeBoolean(NIL == var181_241);
                                                }
                                            }
                                            finally {
                                                final SubLObject var53_235 = Threads.$is_thread_performing_cleanupP$.currentBinding(var50);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var50);
                                                    if (NIL != var72) {
                                                        module0158.f10319(var72);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var53_235, var50);
                                                }
                                            }
                                        }
                                        var68 = (SubLObject)makeBoolean(NIL == var71);
                                    }
                                    module0012.f475();
                                }
                                finally {
                                    module0012.$silent_progressP$.rebind(var66, var50);
                                    module0012.$g70$.rebind(var65, var50);
                                    module0012.$g69$.rebind(var64, var50);
                                    module0012.$g66$.rebind(var63, var50);
                                    module0012.$g68$.rebind(var56_238, var50);
                                    module0012.$g67$.rebind(var55_237, var50);
                                    module0012.$g65$.rebind(var54_235, var50);
                                    module0012.$g73$.rebind(var53_234, var50);
                                }
                            }
                        }
                        var58 = var58.rest();
                        var59 = var58.first();
                    }
                    var56 = var56.rest();
                    var57 = var56.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var55, var50);
                module0012.$g77$.rebind(var54, var50);
                module0012.$g76$.rebind(var54_234, var50);
                module0012.$g75$.rebind(var53_233, var50);
            }
        }
        finally {
            module0147.$g2095$.rebind(var52, var50);
            module0147.$g2094$.rebind(var51, var50);
        }
        return module0077.f5311($g2708$.getGlobalValue());
    }
    
    public static SubLObject f20187(final SubLObject var72) {
        return module0077.f5320(var72, $g2708$.getGlobalValue());
    }
    
    public static SubLObject f20188(final SubLObject var72) {
        final SubLThread var73 = SubLProcess.currentSubLThread();
        SubLObject var74 = (SubLObject)NIL;
        if (NIL != module0269.f17706(var72)) {
            if (NIL == var74) {
                final SubLObject var75 = module0137.f8955($ic82$);
                final SubLObject var76 = (SubLObject)(($ic83$ == $ic83$) ? $ic84$ : $ic85$);
                final SubLObject var77 = module0056.f4145(var76);
                SubLObject var78 = (SubLObject)NIL;
                final SubLObject var79 = module0139.$g1635$.currentBinding(var73);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var73);
                    final SubLObject var80 = (SubLObject)NIL;
                    final SubLObject var53_243 = module0141.$g1714$.currentBinding(var73);
                    final SubLObject var81 = module0141.$g1715$.currentBinding(var73);
                    try {
                        module0141.$g1714$.bind((NIL != var80) ? var80 : module0141.f9283(), var73);
                        module0141.$g1715$.bind((SubLObject)((NIL != var80) ? $ic86$ : module0141.$g1715$.getDynamicValue(var73)), var73);
                        if (NIL != var80 && NIL != module0136.f8864() && NIL == module0141.f9279(var80)) {
                            final SubLObject var82 = module0136.$g1591$.getDynamicValue(var73);
                            if (var82.eql((SubLObject)$ic87$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic88$, var80, (SubLObject)$ic89$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var82.eql((SubLObject)$ic90$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic91$, (SubLObject)$ic88$, var80, (SubLObject)$ic89$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var82.eql((SubLObject)$ic92$)) {
                                Errors.warn((SubLObject)$ic88$, var80, (SubLObject)$ic89$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic93$, module0136.$g1591$.getDynamicValue(var73));
                                Errors.cerror((SubLObject)$ic91$, (SubLObject)$ic88$, var80, (SubLObject)$ic89$);
                            }
                        }
                        final SubLObject var53_244 = module0141.$g1670$.currentBinding(var73);
                        final SubLObject var54_245 = module0141.$g1671$.currentBinding(var73);
                        final SubLObject var83 = module0141.$g1672$.currentBinding(var73);
                        final SubLObject var84 = module0141.$g1674$.currentBinding(var73);
                        final SubLObject var85 = module0137.$g1605$.currentBinding(var73);
                        try {
                            module0141.$g1670$.bind(var75, var73);
                            module0141.$g1671$.bind(module0244.f15739(var75), var73);
                            module0141.$g1672$.bind(module0244.f15746(var75), var73);
                            module0141.$g1674$.bind((SubLObject)NIL, var73);
                            module0137.$g1605$.bind(var75, var73);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var72, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var53_245 = module0141.$g1677$.currentBinding(var73);
                                final SubLObject var54_246 = module0138.$g1619$.currentBinding(var73);
                                final SubLObject var55_248 = module0141.$g1674$.currentBinding(var73);
                                try {
                                    module0141.$g1677$.bind(module0141.f9208(), var73);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), var75), var73);
                                    module0141.$g1674$.bind((SubLObject)NIL, var73);
                                    module0249.f16055(var72, (SubLObject)UNPROVIDED);
                                    for (var78 = (SubLObject)ConsesLow.list(var72, module0141.f9195()); NIL != var78 && NIL == var74; var78 = module0056.f4150(var77)) {
                                        final SubLObject var190_249 = var78.first();
                                        final SubLObject var86 = conses_high.second(var78);
                                        final SubLObject var87 = var190_249;
                                        final SubLObject var53_246 = module0141.$g1674$.currentBinding(var73);
                                        try {
                                            module0141.$g1674$.bind(var86, var73);
                                            final SubLObject var88 = var86;
                                            if (NIL != f20187(var87)) {
                                                var74 = (SubLObject)T;
                                            }
                                            final SubLObject var89 = module0200.f12443(var75);
                                            SubLObject var90;
                                            SubLObject var91;
                                            SubLObject var53_247;
                                            SubLObject var54_247;
                                            SubLObject var92;
                                            SubLObject var93;
                                            SubLObject var94;
                                            SubLObject var95;
                                            SubLObject var96;
                                            SubLObject var97;
                                            SubLObject var53_248;
                                            SubLObject var214_254;
                                            SubLObject var98;
                                            SubLObject var99;
                                            SubLObject var53_249;
                                            SubLObject var100;
                                            SubLObject var101;
                                            SubLObject var102;
                                            SubLObject var103;
                                            SubLObject var104;
                                            SubLObject var105;
                                            SubLObject var106;
                                            SubLObject var107;
                                            SubLObject var207_256;
                                            SubLObject var108;
                                            SubLObject var53_250;
                                            SubLObject var110;
                                            SubLObject var109;
                                            SubLObject var111;
                                            SubLObject var112;
                                            SubLObject var113;
                                            SubLObject var114;
                                            SubLObject var115;
                                            SubLObject var116;
                                            for (var90 = (SubLObject)NIL, var90 = var89; NIL == var74 && NIL != var90; var90 = var90.rest()) {
                                                var91 = var90.first();
                                                var53_247 = module0137.$g1605$.currentBinding(var73);
                                                var54_247 = module0141.$g1674$.currentBinding(var73);
                                                try {
                                                    module0137.$g1605$.bind(var91, var73);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var73)) : module0141.$g1674$.getDynamicValue(var73)), var73);
                                                    var92 = module0228.f15229(var190_249);
                                                    if (NIL != module0138.f8992(var92)) {
                                                        var93 = module0242.f15664(var92, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var93) {
                                                            var94 = module0245.f15834(var93, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var94) {
                                                                for (var95 = module0066.f4838(module0067.f4891(var94)); NIL == var74 && NIL == module0066.f4841(var95); var95 = module0066.f4840(var95)) {
                                                                    var73.resetMultipleValues();
                                                                    var96 = module0066.f4839(var95);
                                                                    var97 = var73.secondMultipleValue();
                                                                    var73.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var96)) {
                                                                        var53_248 = module0138.$g1623$.currentBinding(var73);
                                                                        try {
                                                                            module0138.$g1623$.bind(var96, var73);
                                                                            for (var214_254 = module0066.f4838(module0067.f4891(var97)); NIL == var74 && NIL == module0066.f4841(var214_254); var214_254 = module0066.f4840(var214_254)) {
                                                                                var73.resetMultipleValues();
                                                                                var98 = module0066.f4839(var214_254);
                                                                                var99 = var73.secondMultipleValue();
                                                                                var73.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var98)) {
                                                                                    var53_249 = module0138.$g1624$.currentBinding(var73);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var98, var73);
                                                                                        var100 = var99;
                                                                                        if (NIL != module0077.f5302(var100)) {
                                                                                            var101 = module0077.f5333(var100);
                                                                                            for (var102 = module0032.f1741(var101), var103 = (SubLObject)NIL, var103 = module0032.f1742(var102, var101); NIL == var74 && NIL == module0032.f1744(var102, var103); var103 = module0032.f1743(var103)) {
                                                                                                var104 = module0032.f1745(var102, var103);
                                                                                                if (NIL != module0032.f1746(var103, var104) && NIL == module0249.f16059(var104, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var104, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var104, module0141.f9195()), var77);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var100.isList()) {
                                                                                            if (NIL == var74) {
                                                                                                var105 = var100;
                                                                                                var106 = (SubLObject)NIL;
                                                                                                var106 = var105.first();
                                                                                                while (NIL == var74 && NIL != var105) {
                                                                                                    if (NIL == module0249.f16059(var106, (SubLObject)UNPROVIDED)) {
                                                                                                        module0249.f16055(var106, (SubLObject)UNPROVIDED);
                                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var106, module0141.f9195()), var77);
                                                                                                    }
                                                                                                    var105 = var105.rest();
                                                                                                    var106 = var105.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic94$, var100);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var53_249, var73);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var214_254);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var53_248, var73);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var95);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic95$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var92, (SubLObject)UNPROVIDED)) {
                                                        var107 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var73), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var73), module0137.f8955((SubLObject)UNPROVIDED)));
                                                        for (var207_256 = (SubLObject)NIL, var207_256 = var107; NIL == var74 && NIL != var207_256; var207_256 = var207_256.rest()) {
                                                            var108 = var207_256.first();
                                                            var53_250 = module0138.$g1625$.currentBinding(var73);
                                                            try {
                                                                module0138.$g1625$.bind(var108, var73);
                                                                var109 = (var110 = Functions.funcall(var108, var92));
                                                                if (NIL != module0077.f5302(var110)) {
                                                                    var111 = module0077.f5333(var110);
                                                                    for (var112 = module0032.f1741(var111), var113 = (SubLObject)NIL, var113 = module0032.f1742(var112, var111); NIL == var74 && NIL == module0032.f1744(var112, var113); var113 = module0032.f1743(var113)) {
                                                                        var114 = module0032.f1745(var112, var113);
                                                                        if (NIL != module0032.f1746(var113, var114) && NIL == module0249.f16059(var114, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var114, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var114, module0141.f9195()), var77);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var110.isList()) {
                                                                    if (NIL == var74) {
                                                                        var115 = var110;
                                                                        var116 = (SubLObject)NIL;
                                                                        var116 = var115.first();
                                                                        while (NIL == var74 && NIL != var115) {
                                                                            if (NIL == module0249.f16059(var116, (SubLObject)UNPROVIDED)) {
                                                                                module0249.f16055(var116, (SubLObject)UNPROVIDED);
                                                                                module0056.f4149((SubLObject)ConsesLow.list(var116, module0141.f9195()), var77);
                                                                            }
                                                                            var115 = var115.rest();
                                                                            var116 = var115.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic94$, var110);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var53_250, var73);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var54_247, var73);
                                                    module0137.$g1605$.rebind(var53_247, var73);
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var53_246, var73);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var55_248, var73);
                                    module0138.$g1619$.rebind(var54_246, var73);
                                    module0141.$g1677$.rebind(var53_245, var73);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic96$, var72, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var85, var73);
                            module0141.$g1674$.rebind(var84, var73);
                            module0141.$g1672$.rebind(var83, var73);
                            module0141.$g1671$.rebind(var54_245, var73);
                            module0141.$g1670$.rebind(var53_244, var73);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var81, var73);
                        module0141.$g1714$.rebind(var53_243, var73);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var73));
                }
                finally {
                    module0139.$g1635$.rebind(var79, var73);
                }
            }
        }
        else {
            var74 = f20187(var72);
        }
        return var74;
    }
    
    public static SubLObject f20189(final SubLObject var3, final SubLObject var258) {
        return f20190(var3, var258, $ic99$);
    }
    
    public static SubLObject f20191(final SubLObject var3, final SubLObject var258) {
        return f20190(var3, var258, $ic100$);
    }
    
    public static SubLObject f20190(final SubLObject var3, final SubLObject var258, final SubLObject var259) {
        final SubLThread var260 = SubLProcess.currentSubLThread();
        if (NIL != module0173.f10955(var258)) {
            SubLObject var261 = f20192(var258);
            if (NIL == var261) {
                var261 = (SubLObject)TWO_INTEGER;
            }
            return module0256.f16626(var259, var3, var258, module0147.$g2095$.getDynamicValue(var260), (SubLObject)ONE_INTEGER, var261, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20192(final SubLObject var154) {
        if (NIL != module0004.f104(var154, module0146.$g1968$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0004.f104(var154, module0146.$g1970$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0004.f104(var154, module0146.$g1972$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0004.f104(var154, module0146.$g1974$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0004.f104(var154, module0146.$g1976$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)TWO_INTEGER;
        }
        if (NIL != module0004.f104(var154, module0146.$g1969$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0004.f104(var154, module0146.$g1971$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0004.f104(var154, module0146.$g1973$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0004.f104(var154, module0146.$g1975$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0004.f104(var154, module0146.$g1977$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)THREE_INTEGER;
        }
        if (NIL != module0269.f17745(var154, module0132.$g1555$.getGlobalValue()) || NIL != module0269.f17746(var154, module0132.$g1555$.getGlobalValue()) || NIL != module0269.f17747(var154, module0132.$g1555$.getGlobalValue())) {
            return (SubLObject)TWO_INTEGER;
        }
        if (NIL != module0269.f17749(var154, module0132.$g1555$.getGlobalValue()) || NIL != module0269.f17750(var154, module0132.$g1555$.getGlobalValue()) || NIL != module0269.f17751(var154, module0132.$g1555$.getGlobalValue())) {
            return (SubLObject)THREE_INTEGER;
        }
        f20193((SubLObject)THREE_INTEGER, (SubLObject)$ic101$, var154, module0132.$g1555$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20194(final SubLObject var163) {
        final SubLObject var164 = f20192(module0178.f11331(var163, (SubLObject)ZERO_INTEGER));
        if (var164.isInteger()) {
            return module0178.f11331(var163, var164);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20195(final SubLObject var163, final SubLObject var261, SubLObject var68, SubLObject var106) {
        if (var68 == UNPROVIDED) {
            var68 = (SubLObject)$ic66$;
        }
        if (var106 == UNPROVIDED) {
            var106 = module0144.$g1832$.getDynamicValue();
        }
        final SubLThread var262 = SubLProcess.currentSubLThread();
        if (NIL == module0144.$g1792$.getDynamicValue(var262)) {
            f20196(var261, var68, var106);
            f20197(var163, var68, var106);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20198(final SubLObject var163, SubLObject var68, SubLObject var106) {
        if (var68 == UNPROVIDED) {
            var68 = module0144.$g1825$.getDynamicValue();
        }
        if (var106 == UNPROVIDED) {
            var106 = module0144.$g1832$.getDynamicValue();
        }
        final SubLThread var164 = SubLProcess.currentSubLThread();
        if (NIL == module0144.$g1792$.getDynamicValue(var164)) {
            f20197(var163, var68, var106);
            if (module0018.$g590$.getDynamicValue(var164).isInteger()) {
                final SubLObject var165 = module0178.f11331(var163, module0018.$g590$.getDynamicValue(var164));
                if (NIL != module0173.f10955(var165)) {
                    f20196(var165, var68, var106);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20196(final SubLObject var261, SubLObject var68, SubLObject var106) {
        if (var68 == UNPROVIDED) {
            var68 = (SubLObject)$ic66$;
        }
        if (var106 == UNPROVIDED) {
            var106 = module0144.$g1832$.getDynamicValue();
        }
        final SubLThread var262 = SubLProcess.currentSubLThread();
        if (NIL != module0144.$g1785$.getDynamicValue(var262) && (NIL == module0144.$g1845$.getDynamicValue(var262) || var106.equal(module0144.$g1845$.getDynamicValue(var262)))) {
            final SubLObject var263 = var68;
            if (var263.eql((SubLObject)$ic66$)) {
                module0030.f1599(var106, var261, module0144.$g1816$.getDynamicValue(var262));
            }
            else if (var263.eql((SubLObject)$ic69$)) {
                module0030.f1599(var106, var261, module0144.$g1817$.getDynamicValue(var262));
            }
            else if (var263.eql((SubLObject)$ic102$)) {
                module0030.f1599(var106, var261, module0144.$g1818$.getDynamicValue(var262));
            }
            else if (var263.eql((SubLObject)$ic103$)) {
                module0030.f1599(var106, var261, module0144.$g1819$.getDynamicValue(var262));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20197(final SubLObject var261, SubLObject var68, SubLObject var106) {
        if (var68 == UNPROVIDED) {
            var68 = (SubLObject)$ic66$;
        }
        if (var106 == UNPROVIDED) {
            var106 = module0144.$g1832$.getDynamicValue();
        }
        final SubLThread var262 = SubLProcess.currentSubLThread();
        if (NIL != module0144.$g1786$.getDynamicValue(var262) && (NIL == module0144.$g1845$.getDynamicValue(var262) || var106.equal(module0144.$g1845$.getDynamicValue(var262)))) {
            final SubLObject var263 = var68;
            if (var263.eql((SubLObject)$ic66$)) {
                module0030.f1599(var106, var261, module0144.$g1820$.getDynamicValue(var262));
            }
            else if (var263.eql((SubLObject)$ic69$)) {
                module0030.f1599(var106, var261, module0144.$g1821$.getDynamicValue(var262));
            }
            else if (var263.eql((SubLObject)$ic102$)) {
                module0030.f1599(var106, var261, module0144.$g1822$.getDynamicValue(var262));
            }
            else if (var263.eql((SubLObject)$ic103$)) {
                module0030.f1599(var106, var261, module0144.$g1819$.getDynamicValue(var262));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20199(SubLObject var262) {
        if (var262 == UNPROVIDED) {
            var262 = module0144.$g1812$.getDynamicValue();
        }
        final SubLThread var263 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != var262 && NIL == module0144.$g1795$.getDynamicValue(var263) && NIL == module0144.$g1785$.getDynamicValue(var263));
    }
    
    public static SubLObject f20200(SubLObject var77) {
        if (var77 == UNPROVIDED) {
            var77 = (SubLObject)NIL;
        }
        if (NIL != var77) {
            module0144.$g1812$.setDynamicValue(var77);
        }
        f20201();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20201() {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        if (NIL != module0144.$g1793$.getDynamicValue(var50)) {
            Dynamic.sublisp_throw((SubLObject)$ic104$, (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20202(final SubLObject var261) {
        final SubLThread var262 = SubLProcess.currentSubLThread();
        module0144.$g1812$.setDynamicValue((SubLObject)T, var262);
        if (NIL == module0144.$g1792$.getDynamicValue(var262)) {
            final SubLObject var263 = (NIL != module0144.$g1794$.getDynamicValue(var262)) ? Symbols.symbol_function((SubLObject)$ic105$) : Symbols.symbol_function((SubLObject)$ic106$);
            final SubLObject var264 = (SubLObject)((NIL != module0144.$g1794$.getDynamicValue(var262)) ? ONE_INTEGER : THREE_INTEGER);
            if (ZERO_INTEGER.numE(module0144.$g1833$.getDynamicValue(var262))) {
                Functions.funcall(var263, var264, (SubLObject)$ic107$, module0144.$g1831$.getDynamicValue(var262), module0144.$g1829$.getDynamicValue(var262), var261);
            }
            else {
                Functions.funcall(var263, new SubLObject[] { var264, $ic108$, module0144.$g1832$.getDynamicValue(var262), module0144.$g1829$.getDynamicValue(var262), var261, module0144.$g1833$.getDynamicValue(var262), module0144.$g1831$.getDynamicValue(var262) });
            }
            if (NIL != module0144.$g1796$.getDynamicValue(var262)) {
                f20203(f20204(var261));
            }
        }
        if (NIL == module0144.$g1795$.getDynamicValue(var262)) {
            f20200((SubLObject)UNPROVIDED);
        }
        return module0144.$g1812$.getDynamicValue(var262);
    }
    
    public static SubLObject f20204(final SubLObject var261) {
        final SubLThread var262 = SubLProcess.currentSubLThread();
        final SubLObject var263 = module0144.$g1824$.getDynamicValue(var262);
        if (var263.eql((SubLObject)$ic109$)) {
            return f20205(var261, module0147.$g2095$.getDynamicValue(var262));
        }
        if (var263.eql((SubLObject)$ic110$)) {
            return f20205(var261, module0147.$g2095$.getDynamicValue(var262));
        }
        if (var263.eql((SubLObject)$ic111$)) {
            return f20205(var261, module0147.$g2095$.getDynamicValue(var262));
        }
        if (var263.eql((SubLObject)$ic112$)) {
            return f20205(var261, module0147.$g2095$.getDynamicValue(var262));
        }
        if (var263.eql((SubLObject)$ic113$)) {
            return f20206(var261, module0147.$g2095$.getDynamicValue(var262));
        }
        if (var263.eql((SubLObject)$ic114$)) {
            return f20206(var261, module0147.$g2095$.getDynamicValue(var262));
        }
        f20193((SubLObject)FIVE_INTEGER, (SubLObject)$ic115$, module0144.$g1824$.getDynamicValue(var262), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20205(final SubLObject var265, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLThread var266 = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.list((SubLObject)$ic116$, module0144.$g1831$.getDynamicValue(var266), var265, var6, module0144.$g1774$.getDynamicValue(var266));
    }
    
    public static SubLObject f20206(final SubLObject var266, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLThread var267 = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.list((SubLObject)$ic117$, module0144.$g1831$.getDynamicValue(var267), module0144.$g1829$.getDynamicValue(var267), var266, var6, module0144.$g1774$.getDynamicValue(var267));
    }
    
    public static SubLObject f20207() {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        return Sequences.nreverse(Sequences.cconcatenate(module0152.$g2130$.getDynamicValue(var50), new SubLObject[] { module0144.$g1853$.getDynamicValue(var50), module0146.$g1961$.getDynamicValue(var50) }));
    }
    
    public static SubLObject f20208() {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0144.$g1796$.getDynamicValue(var50) && (NIL == module0144.$g1853$.getDynamicValue(var50) || NIL != module0144.$g1795$.getDynamicValue(var50)));
    }
    
    public static SubLObject f20203(final SubLObject var267) {
        final SubLThread var268 = SubLProcess.currentSubLThread();
        if (NIL != module0152.f9714()) {
            print_high.print(var267, (SubLObject)UNPROVIDED);
        }
        if (NIL != f20208()) {
            module0144.$g1852$.setDynamicValue(var267, var268);
            if (NIL == f20209(var267) && NIL == conses_high.member(var267, module0144.$g1853$.getDynamicValue(var268), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                module0144.$g1853$.setDynamicValue((SubLObject)ConsesLow.cons(var267, module0144.$g1853$.getDynamicValue(var268)), var268);
            }
        }
        return module0144.$g1853$.getDynamicValue(var268);
    }
    
    public static SubLObject f20209(final SubLObject var267) {
        final SubLObject var268 = var267.first();
        if (var268.eql((SubLObject)$ic118$)) {
            return Equality.eql(conses_high.fifth(var267), $ic119$);
        }
        if (var268.eql((SubLObject)$ic120$)) {
            return Equality.eql(conses_high.third(var267), $ic119$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20210(SubLObject var269) {
        if (var269 == UNPROVIDED) {
            var269 = (SubLObject)NIL;
        }
        final SubLThread var270 = SubLProcess.currentSubLThread();
        if (NIL != var269) {
            module0144.$g1853$.setDynamicValue((SubLObject)NIL, var270);
        }
        else if (NIL == module0144.$g1795$.getDynamicValue(var270)) {
            if (NIL != module0144.$g1796$.getDynamicValue(var270)) {
                module0144.$g1853$.setDynamicValue((SubLObject)NIL, var270);
            }
        }
        return module0144.$g1853$.getDynamicValue(var270);
    }
    
    public static SubLObject f20211(SubLObject var269) {
        if (var269 == UNPROVIDED) {
            var269 = (SubLObject)NIL;
        }
        final SubLThread var270 = SubLProcess.currentSubLThread();
        if (NIL != var269) {
            module0152.$g2130$.setDynamicValue((SubLObject)NIL, var270);
        }
        else if (NIL == module0144.$g1795$.getDynamicValue(var270)) {
            if (NIL != module0144.$g1796$.getDynamicValue(var270)) {
                module0152.$g2130$.setDynamicValue((SubLObject)NIL, var270);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20212(SubLObject var269) {
        if (var269 == UNPROVIDED) {
            var269 = (SubLObject)NIL;
        }
        module0146.$g1961$.setDynamicValue((SubLObject)NIL);
        f20210(var269);
        f20211(var269);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20213() {
        f20211((SubLObject)T);
        f20210((SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20214(final SubLObject var123, final SubLObject var6) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        final SubLObject var125 = module0144.$g1792$.currentBinding(var124);
        final SubLObject var126 = module0152.$g2131$.currentBinding(var124);
        final SubLObject var127 = module0144.$g1785$.currentBinding(var124);
        final SubLObject var128 = module0144.$g1796$.currentBinding(var124);
        try {
            module0144.$g1792$.bind((SubLObject)T, var124);
            module0152.$g2131$.bind((SubLObject)NIL, var124);
            module0144.$g1785$.bind((SubLObject)NIL, var124);
            module0144.$g1796$.bind((SubLObject)NIL, var124);
            final SubLObject var129 = module0144.$g1853$.getDynamicValue(var124);
            final SubLObject var53_271 = module0152.$g2129$.currentBinding(var124);
            try {
                module0152.$g2129$.bind((SubLObject)NIL, var124);
                final SubLObject var130 = f20215(var123);
                if (NIL != var130) {
                    module0274.f18089((SubLObject)ConsesLow.list((SubLObject)$ic121$, var123, var6, var130));
                }
                SubLObject var131 = f20216(var129);
                SubLObject var132 = (SubLObject)NIL;
                var132 = var131.first();
                while (NIL != var131) {
                    f20217(var132);
                    var131 = var131.rest();
                    var132 = var131.first();
                }
                var131 = f20218(var129);
                SubLObject var133 = (SubLObject)NIL;
                var133 = var131.first();
                while (NIL != var131) {
                    f20219(var133);
                    var131 = var131.rest();
                    var133 = var131.first();
                }
                var131 = f20220(var129);
                SubLObject var134 = (SubLObject)NIL;
                var134 = var131.first();
                while (NIL != var131) {
                    f20221(var134);
                    var131 = var131.rest();
                    var134 = var131.first();
                }
            }
            finally {
                module0152.$g2129$.rebind(var53_271, var124);
            }
        }
        finally {
            module0144.$g1796$.rebind(var128, var124);
            module0144.$g1785$.rebind(var127, var124);
            module0152.$g2131$.rebind(var126, var124);
            module0144.$g1792$.rebind(var125, var124);
        }
        return module0274.f18180();
    }
    
    public static SubLObject f20216(final SubLObject var270) {
        return module0035.remove_if_not(Symbols.symbol_function((SubLObject)$ic122$), var270, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20218(final SubLObject var270) {
        return module0035.remove_if_not(Symbols.symbol_function((SubLObject)$ic123$), var270, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20220(final SubLObject var270) {
        return module0035.remove_if_not(Symbols.symbol_function((SubLObject)$ic124$), var270, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20222(final SubLObject var276) {
        final SubLObject var277 = f20223(var276);
        if (var277.eql((SubLObject)$ic125$)) {
            SubLObject var279;
            final SubLObject var278 = var279 = var276.rest();
            SubLObject var280 = (SubLObject)NIL;
            SubLObject var281 = (SubLObject)NIL;
            SubLObject var282 = (SubLObject)NIL;
            SubLObject var283 = (SubLObject)NIL;
            SubLObject var284 = (SubLObject)NIL;
            SubLObject var285 = (SubLObject)NIL;
            SubLObject var286 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var279, var278, (SubLObject)$ic126$);
            var280 = var279.first();
            var279 = var279.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var279, var278, (SubLObject)$ic126$);
            var281 = var279.first();
            var279 = var279.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var279, var278, (SubLObject)$ic126$);
            var282 = var279.first();
            var279 = var279.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var279, var278, (SubLObject)$ic126$);
            var283 = var279.first();
            var279 = var279.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var279, var278, (SubLObject)$ic126$);
            var284 = var279.first();
            var279 = var279.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var279, var278, (SubLObject)$ic126$);
            var285 = var279.first();
            var279 = (var286 = var279.rest());
            return (SubLObject)makeBoolean(NIL != module0213.f14081(var284, (SubLObject)$ic127$) || NIL != f20224(var283, var285));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20224(final SubLObject var281, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (var281.eql($ic128$)) {
            return (SubLObject)T;
        }
        SubLObject var282 = (SubLObject)NIL;
        var282 = module0256.f16576(var281, $ic128$, var6, (SubLObject)UNPROVIDED);
        return var282;
    }
    
    public static SubLObject f20225(final SubLObject var276) {
        final SubLObject var277 = f20223(var276);
        if (var277.eql((SubLObject)$ic129$)) {
            return (SubLObject)T;
        }
        if (var277.eql((SubLObject)$ic130$)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20226(final SubLObject var276) {
        final SubLObject var277 = f20223(var276);
        if (var277.eql((SubLObject)$ic116$)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20217(final SubLObject var276) {
        final SubLThread var277 = SubLProcess.currentSubLThread();
        SubLObject var279;
        final SubLObject var278 = var279 = var276.rest();
        SubLObject var280 = (SubLObject)NIL;
        SubLObject var281 = (SubLObject)NIL;
        SubLObject var282 = (SubLObject)NIL;
        SubLObject var283 = (SubLObject)NIL;
        SubLObject var284 = (SubLObject)NIL;
        SubLObject var285 = (SubLObject)NIL;
        SubLObject var286 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var279, var278, (SubLObject)$ic126$);
        var280 = var279.first();
        var279 = var279.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var279, var278, (SubLObject)$ic126$);
        var281 = var279.first();
        var279 = var279.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var279, var278, (SubLObject)$ic126$);
        var282 = var279.first();
        var279 = var279.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var279, var278, (SubLObject)$ic126$);
        var283 = var279.first();
        var279 = var279.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var279, var278, (SubLObject)$ic126$);
        var284 = var279.first();
        var279 = var279.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var279, var278, (SubLObject)$ic126$);
        var285 = var279.first();
        var279 = (var286 = var279.rest());
        final SubLObject var287 = f20227(var280, (SubLObject)UNPROVIDED);
        SubLObject var288 = (SubLObject)NIL;
        SubLObject var289 = (SubLObject)NIL;
        final SubLObject var290 = module0147.$g2094$.currentBinding(var277);
        final SubLObject var291 = module0147.$g2095$.currentBinding(var277);
        try {
            module0147.$g2094$.bind((SubLObject)$ic78$, var277);
            module0147.$g2095$.bind($ic79$, var277);
            var288 = module0288.f19342(var287, module0147.$g2095$.getDynamicValue(var277));
        }
        finally {
            module0147.$g2095$.rebind(var291, var277);
            module0147.$g2094$.rebind(var290, var277);
        }
        SubLObject var292 = var288;
        SubLObject var293 = (SubLObject)NIL;
        var293 = var292.first();
        while (NIL != var292) {
            var289 = (SubLObject)ConsesLow.cons(module0178.f11287(var293), var289);
            var292 = var292.rest();
            var293 = var292.first();
        }
        var292 = var289;
        SubLObject var294 = (SubLObject)NIL;
        var294 = var292.first();
        while (NIL != var292) {
            module0274.f18089((SubLObject)ConsesLow.list((SubLObject)$ic131$, var280, module0202.f12768($ic132$, var294, var287)));
            var292 = var292.rest();
            var294 = var292.first();
        }
        return module0274.f18180();
    }
    
    public static SubLObject f20227(final SubLObject var123, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLThread var124 = SubLProcess.currentSubLThread();
        SubLObject var125 = (SubLObject)NIL;
        final SubLObject var126 = var6;
        final SubLObject var127 = module0147.$g2094$.currentBinding(var124);
        final SubLObject var128 = module0147.$g2095$.currentBinding(var124);
        try {
            module0147.$g2094$.bind(module0147.f9531(var126), var124);
            module0147.$g2095$.bind(module0147.f9534(var126), var124);
            if (NIL != module0202.f12903(var123) && NIL != module0269.f17707(module0202.f12906(var123))) {
                var125 = f20227(module0202.f12887(var123), module0202.f12906(var123));
            }
            else {
                var125 = var123;
            }
        }
        finally {
            module0147.$g2095$.rebind(var128, var124);
            module0147.$g2094$.rebind(var127, var124);
        }
        return var125;
    }
    
    public static SubLObject f20219(final SubLObject var276) {
        final SubLObject var277 = f20223(var276);
        if (var277.eql((SubLObject)$ic129$)) {
            SubLObject var279;
            final SubLObject var278 = var279 = var276.rest();
            SubLObject var280 = (SubLObject)NIL;
            SubLObject var281 = (SubLObject)NIL;
            SubLObject var282 = (SubLObject)NIL;
            SubLObject var283 = (SubLObject)NIL;
            SubLObject var284 = (SubLObject)NIL;
            SubLObject var285 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var279, var278, (SubLObject)$ic133$);
            var280 = var279.first();
            var279 = var279.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var279, var278, (SubLObject)$ic133$);
            var281 = var279.first();
            var279 = var279.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var279, var278, (SubLObject)$ic133$);
            var282 = var279.first();
            var279 = var279.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var279, var278, (SubLObject)$ic133$);
            var283 = var279.first();
            var279 = var279.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var279, var278, (SubLObject)$ic133$);
            var284 = var279.first();
            var279 = var279.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var279, var278, (SubLObject)$ic133$);
            var285 = var279.first();
            var279 = var279.rest();
            final SubLObject var286 = (SubLObject)(var279.isCons() ? var279.first() : NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var279, var278, (SubLObject)$ic133$);
            var279 = var279.rest();
            if (NIL == var279) {
                if (NIL != module0173.f10955(var280)) {
                    SubLObject var287 = var285;
                    SubLObject var288 = (SubLObject)NIL;
                    var288 = var287.first();
                    while (NIL != var287) {
                        final SubLObject var289 = module0178.f11331(var288, var282);
                        module0274.f18089((SubLObject)ConsesLow.list((SubLObject)$ic134$, (SubLObject)ConsesLow.list($ic135$, var280, var289), var284));
                        var287 = var287.rest();
                        var288 = var287.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var278, (SubLObject)$ic133$);
            }
        }
        else if (var277.eql((SubLObject)$ic130$)) {
            SubLObject var291;
            final SubLObject var290 = var291 = var276.rest();
            SubLObject var280 = (SubLObject)NIL;
            SubLObject var281 = (SubLObject)NIL;
            SubLObject var282 = (SubLObject)NIL;
            SubLObject var283 = (SubLObject)NIL;
            SubLObject var292 = (SubLObject)NIL;
            SubLObject var293 = (SubLObject)NIL;
            SubLObject var294 = (SubLObject)NIL;
            SubLObject var295 = (SubLObject)NIL;
            SubLObject var296 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var291, var290, (SubLObject)$ic136$);
            var280 = var291.first();
            var291 = var291.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var291, var290, (SubLObject)$ic136$);
            var281 = var291.first();
            var291 = var291.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var291, var290, (SubLObject)$ic136$);
            var282 = var291.first();
            var291 = var291.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var291, var290, (SubLObject)$ic136$);
            var283 = var291.first();
            var291 = var291.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var291, var290, (SubLObject)$ic136$);
            var292 = var291.first();
            var291 = var291.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var291, var290, (SubLObject)$ic136$);
            var293 = var291.first();
            var291 = var291.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var291, var290, (SubLObject)$ic136$);
            var294 = var291.first();
            var291 = var291.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var291, var290, (SubLObject)$ic136$);
            var295 = var291.first();
            var291 = var291.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var291, var290, (SubLObject)$ic136$);
            var296 = var291.first();
            var291 = var291.rest();
            final SubLObject var297 = (SubLObject)(var291.isCons() ? var291.first() : NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var291, var290, (SubLObject)$ic136$);
            var291 = var291.rest();
            if (NIL == var291) {
                if (NIL != module0173.f10955(var280)) {
                    SubLObject var298 = var296;
                    SubLObject var299 = (SubLObject)NIL;
                    var299 = var298.first();
                    while (NIL != var298) {
                        final SubLObject var300 = module0178.f11331(var299, var282);
                        module0274.f18089((SubLObject)ConsesLow.list((SubLObject)$ic134$, (SubLObject)ConsesLow.list($ic135$, var280, var300), var295));
                        var298 = var298.rest();
                        var299 = var298.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var290, (SubLObject)$ic136$);
            }
        }
        return module0274.f18180();
    }
    
    public static SubLObject f20221(final SubLObject var276) {
        final SubLObject var277 = f20223(var276);
        if (var277.eql((SubLObject)$ic116$)) {
            SubLObject var279;
            final SubLObject var278 = var279 = var276.rest();
            SubLObject var280 = (SubLObject)NIL;
            SubLObject var281 = (SubLObject)NIL;
            SubLObject var282 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var279, var278, (SubLObject)$ic137$);
            var280 = var279.first();
            var279 = var279.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var279, var278, (SubLObject)$ic137$);
            var281 = var279.first();
            var279 = var279.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var279, var278, (SubLObject)$ic137$);
            var282 = var279.first();
            var279 = var279.rest();
            final SubLObject var283 = (SubLObject)(var279.isCons() ? var279.first() : NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var279, var278, (SubLObject)$ic137$);
            var279 = var279.rest();
            if (NIL == var279) {
                SubLObject var284 = var283;
                SubLObject var285 = (SubLObject)NIL;
                var285 = var284.first();
                while (NIL != var284) {
                    module0274.f18089((SubLObject)ConsesLow.list((SubLObject)$ic138$, module0538.f33480(var285, (SubLObject)UNPROVIDED)));
                    var284 = var284.rest();
                    var285 = var284.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var278, (SubLObject)$ic137$);
            }
        }
        return module0274.f18180();
    }
    
    public static SubLObject f20223(final SubLObject var276) {
        if (var276.isCons()) {
            return var276.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20215(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        SubLObject var125 = (SubLObject)NIL;
        SubLObject var126 = (SubLObject)NIL;
        SubLObject var127 = module0035.f2399(var123, Symbols.symbol_function((SubLObject)$ic140$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var128 = (SubLObject)NIL;
        var128 = var127.first();
        while (NIL != var127) {
            var126 = ConsesLow.nconc(var126, module0259.f16924(var128), module0256.f16655(var128));
            var127 = var127.rest();
            var128 = var127.first();
        }
        var126 = Sort.sort(module0035.f2272(var126), (SubLObject)$ic141$, (SubLObject)$ic142$);
        final SubLObject var129 = module0144.$g1796$.currentBinding(var124);
        final SubLObject var130 = module0144.$g1795$.currentBinding(var124);
        final SubLObject var131 = module0152.$g2116$.currentBinding(var124);
        final SubLObject var132 = module0152.$g2115$.currentBinding(var124);
        final SubLObject var133 = module0152.$g2131$.currentBinding(var124);
        try {
            module0144.$g1796$.bind((SubLObject)NIL, var124);
            module0144.$g1795$.bind((SubLObject)NIL, var124);
            module0152.$g2116$.bind((SubLObject)NIL, var124);
            module0152.$g2115$.bind((SubLObject)NIL, var124);
            module0152.$g2131$.bind((SubLObject)NIL, var124);
            if ($g2709$.getDynamicValue(var124).isInteger() && NIL != module0035.f2002(var126, $g2709$.getDynamicValue(var124), (SubLObject)UNPROVIDED)) {
                var126 = module0035.f2124($g2709$.getDynamicValue(var124), var126);
            }
            SubLObject var134 = var126;
            SubLObject var135 = (SubLObject)NIL;
            var135 = var134.first();
            while (NIL != var134) {
                if (NIL == module0262.f17342(var135, var125, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0202.f12930(var123) && NIL != module0274.f18060(var123, var135, (SubLObject)UNPROVIDED)) {
                    var125 = (SubLObject)ConsesLow.cons(var135, var125);
                }
                var134 = var134.rest();
                var135 = var134.first();
            }
        }
        finally {
            module0152.$g2131$.rebind(var133, var124);
            module0152.$g2115$.rebind(var132, var124);
            module0152.$g2116$.rebind(var131, var124);
            module0144.$g1795$.rebind(var130, var124);
            module0144.$g1796$.rebind(var129, var124);
        }
        return module0262.f17367(var125, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20228(final SubLObject var303, SubLObject var304, SubLObject var305) {
        if (var304 == UNPROVIDED) {
            var304 = (SubLObject)NIL;
        }
        if (var305 == UNPROVIDED) {
            var305 = module0152.f9727();
        }
        return module0035.sublisp_boolean(f20229(var303, var304, var305));
    }
    
    public static SubLObject f20229(final SubLObject var303, SubLObject var304, SubLObject var305) {
        if (var304 == UNPROVIDED) {
            var304 = (SubLObject)NIL;
        }
        if (var305 == UNPROVIDED) {
            var305 = module0152.f9727();
        }
        final SubLThread var306 = SubLProcess.currentSubLThread();
        if (NIL != module0167.f10813(var303)) {
            return f20229(module0172.f10915(var303), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL == module0202.f12590(var303)) {
            return (SubLObject)NIL;
        }
        if (NIL != var305) {
            final SubLObject var307 = module0274.f18100(var303, $ic79$);
            SubLObject var308 = (SubLObject)NIL;
            final SubLObject var309 = module0144.$g1808$.currentBinding(var306);
            final SubLObject var310 = module0152.$g2134$.currentBinding(var306);
            final SubLObject var311 = module0152.$g2122$.currentBinding(var306);
            final SubLObject var312 = module0152.$g2133$.currentBinding(var306);
            try {
                module0144.$g1808$.bind((SubLObject)NIL, var306);
                module0152.$g2134$.bind(var303, var306);
                module0152.$g2122$.bind((SubLObject)NIL, var306);
                module0152.$g2133$.bind((SubLObject)T, var306);
                var308 = f20229(var307, var304, (SubLObject)NIL);
            }
            finally {
                module0152.$g2133$.rebind(var312, var306);
                module0152.$g2122$.rebind(var311, var306);
                module0152.$g2134$.rebind(var310, var306);
                module0144.$g1808$.rebind(var309, var306);
            }
            return var308;
        }
        if (NIL != var304) {
            SubLObject var313 = (SubLObject)NIL;
            if (NIL == var313) {
                SubLObject var314 = var304;
                SubLObject var315 = (SubLObject)NIL;
                var315 = var314.first();
                while (NIL == var313 && NIL != var314) {
                    if (NIL != module0274.f18171(var303, var315) && (NIL == module0152.f9726() || var303.equal(module0152.f9728()) || NIL != module0274.f18171(module0152.f9728(), var315))) {
                        var313 = var315;
                    }
                    var314 = var314.rest();
                    var315 = var314.first();
                }
            }
            return var313;
        }
        final SubLObject var304_308 = f20230(var303, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var308 = (SubLObject)NIL;
        if (NIL == var308) {
            SubLObject var316 = var304_308;
            SubLObject var317 = (SubLObject)NIL;
            var317 = var316.first();
            while (NIL == var308 && NIL != var316) {
                if (NIL != module0274.f18171(var303, var317) && (NIL == module0152.f9726() || var303.equal(module0152.f9728()) || NIL != module0274.f18171(module0152.f9728(), var317))) {
                    var308 = var317;
                }
                var316 = var316.rest();
                var317 = var316.first();
            }
        }
        if (NIL == var308) {
            final SubLObject var309 = $g2710$.currentBinding(var306);
            try {
                $g2710$.bind(var304_308, var306);
                var308 = f20231(var303, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)ONE_INTEGER);
            }
            finally {
                $g2710$.rebind(var309, var306);
            }
        }
        return var308;
    }
    
    public static SubLObject f20230(final SubLObject var303, SubLObject var309, SubLObject var310) {
        if (var309 == UNPROVIDED) {
            var309 = (SubLObject)NIL;
        }
        if (var310 == UNPROVIDED) {
            var310 = (SubLObject)NIL;
        }
        if (NIL != var309) {
            return module0262.f17364(f20232(var303, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        }
        SubLObject var311 = (SubLObject)NIL;
        SubLObject var312 = (SubLObject)NIL;
        SubLObject var313 = module0035.f2272(module0205.f13191(var303, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        SubLObject var314 = (SubLObject)NIL;
        var314 = var313.first();
        while (NIL != var313) {
            if (NIL == module0212.f13761(var314) || NIL != var310) {
                final SubLObject var315 = module0285.f19001(module0259.f16924(var314));
                if (NIL != var315) {
                    final SubLObject var316 = var315;
                    if (NIL == conses_high.member(var316, var311, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var311 = (SubLObject)ConsesLow.cons(var316, var311);
                    }
                }
            }
            var313 = var313.rest();
            var314 = var313.first();
        }
        var313 = module0035.f2468(var311);
        SubLObject var317 = (SubLObject)NIL;
        var317 = var313.first();
        while (NIL != var313) {
            var312 = ConsesLow.nconc(var312, module0262.f17370(module0035.f2272(var317), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            var313 = var313.rest();
            var317 = var313.first();
        }
        return module0262.f17364(module0035.f2272(var312), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20232(final SubLObject var123, SubLObject var310) {
        if (var310 == UNPROVIDED) {
            var310 = (SubLObject)NIL;
        }
        SubLObject var311 = (SubLObject)NIL;
        SubLObject var312 = module0035.f2272(module0205.f13191(var123, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        SubLObject var313 = (SubLObject)NIL;
        var313 = var312.first();
        while (NIL != var312) {
            if (NIL == module0212.f13761(var313) || NIL != var310) {
                var311 = ConsesLow.nconc(var311, module0259.f16924(var313));
            }
            var312 = var312.rest();
            var313 = var312.first();
        }
        return module0035.f2272(var311);
    }
    
    public static SubLObject f20233(final SubLObject var6) {
        return module0132.f8595(var6);
    }
    
    public static SubLObject f20234(final SubLObject var303, SubLObject var305, SubLObject var7) {
        if (var305 == UNPROVIDED) {
            var305 = module0152.f9727();
        }
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        return f20231(var303, (SubLObject)NIL, var305, var7);
    }
    
    public static SubLObject f20231(final SubLObject var303, SubLObject var6, SubLObject var305, SubLObject var7) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (var305 == UNPROVIDED) {
            var305 = module0152.f9727();
        }
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        return f20235(var303, var6, var305, var7);
    }
    
    public static SubLObject f20236() {
        final SubLObject var314 = $g2711$.getGlobalValue();
        if (NIL != var314) {
            module0034.f1818(var314);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20237(final SubLObject var315, final SubLObject var6, final SubLObject var305, final SubLObject var7) {
        return module0034.f1829($g2711$.getGlobalValue(), (SubLObject)ConsesLow.list(var315, var6, var305, var7), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20238(final SubLObject var315, final SubLObject var6, final SubLObject var305, final SubLObject var7) {
        return f20235(var315, var6, var305, var7);
    }
    
    public static SubLObject f20239(final SubLObject var315, final SubLObject var6, final SubLObject var305, final SubLObject var7) {
        SubLObject var316 = $g2711$.getGlobalValue();
        if (NIL == var316) {
            var316 = module0034.f1934((SubLObject)$ic143$, (SubLObject)$ic144$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)FOUR_INTEGER, (SubLObject)$ic145$);
        }
        final SubLObject var317 = module0034.f1780(var315, var6, var305, var7);
        final SubLObject var318 = module0034.f1814(var316, var317, (SubLObject)UNPROVIDED);
        if (var318 != $ic146$) {
            SubLObject var319 = var318;
            SubLObject var320 = (SubLObject)NIL;
            var320 = var319.first();
            while (NIL != var319) {
                SubLObject var321 = var320.first();
                final SubLObject var322 = conses_high.second(var320);
                if (var315.eql(var321.first())) {
                    var321 = var321.rest();
                    if (var6.eql(var321.first())) {
                        var321 = var321.rest();
                        if (var305.eql(var321.first())) {
                            var321 = var321.rest();
                            if (NIL != var321 && NIL == var321.rest() && var7.eql(var321.first())) {
                                return module0034.f1959(var322);
                            }
                        }
                    }
                }
                var319 = var319.rest();
                var320 = var319.first();
            }
        }
        final SubLObject var323 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f20238(var315, var6, var305, var7)));
        module0034.f1836(var316, var317, var318, var323, (SubLObject)ConsesLow.list(var315, var6, var305, var7));
        return module0034.f1959(var323);
    }
    
    public static SubLObject f20240(final SubLObject var303, SubLObject var305) {
        if (var305 == UNPROVIDED) {
            var305 = module0152.f9727();
        }
        final SubLThread var306 = SubLProcess.currentSubLThread();
        if (NIL != module0167.f10813(var303)) {
            return f20240(module0172.f10915(var303), var305);
        }
        final SubLObject var307 = f20230(var303, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var308 = f20241(var303, var307, (SubLObject)UNPROVIDED);
        final SubLObject var309 = $g2710$.currentBinding(var306);
        try {
            $g2710$.bind(var307, var306);
            if (NIL == var308) {
                var308 = f20235(var303, (SubLObject)NIL, var305, (SubLObject)UNPROVIDED);
            }
        }
        finally {
            $g2710$.rebind(var309, var306);
        }
        return var308;
    }
    
    public static SubLObject f20235(final SubLObject var315, SubLObject var6, SubLObject var305, SubLObject var7) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (var305 == UNPROVIDED) {
            var305 = module0152.f9727();
        }
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        return f20242((NIL != module0167.f10813(var315)) ? module0172.f10915(var315) : var315, var6, var305, var7);
    }
    
    public static SubLObject f20242(final SubLObject var323, final SubLObject var6, final SubLObject var305, final SubLObject var7) {
        final SubLThread var324 = SubLProcess.currentSubLThread();
        if (NIL != module0202.f12590(var323)) {
            if (NIL != var305) {
                final SubLObject var325 = (NIL != var6) ? var6 : $ic79$;
                final SubLObject var326 = module0274.f18100(var323, var325);
                if (NIL == var326 || var323.equal(var326)) {
                    return f20242(var323, var6, (SubLObject)NIL, var7);
                }
                SubLObject var327 = (SubLObject)NIL;
                final SubLObject var328 = module0144.$g1808$.currentBinding(var324);
                final SubLObject var329 = module0152.$g2134$.currentBinding(var324);
                final SubLObject var330 = module0152.$g2122$.currentBinding(var324);
                final SubLObject var331 = module0152.$g2133$.currentBinding(var324);
                try {
                    module0144.$g1808$.bind((SubLObject)NIL, var324);
                    module0152.$g2134$.bind(var323, var324);
                    module0152.$g2122$.bind((SubLObject)NIL, var324);
                    module0152.$g2133$.bind((SubLObject)T, var324);
                    var327 = f20235(var326, var6, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0152.$g2133$.rebind(var331, var324);
                    module0152.$g2122$.rebind(var330, var324);
                    module0152.$g2134$.rebind(var329, var324);
                    module0144.$g1808$.rebind(var328, var324);
                }
                return f20241(var323, var327, var7);
            }
            else {
                if (NIL == module0210.f13618(var323)) {
                    if (NIL == module0152.f9726()) {
                        return (SubLObject)NIL;
                    }
                    if (NIL == module0210.f13618(module0152.f9728())) {
                        return (SubLObject)NIL;
                    }
                }
                if (NIL != module0259.f16896(module0205.f13365(var323), $ic147$, var6) && NIL == f20233(var6)) {
                    return f20242(var323, module0132.$g1548$.getGlobalValue(), var305, var7);
                }
                return f20243(var323, var6, var7);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20243(final SubLObject var323, final SubLObject var6, final SubLObject var7) {
        final SubLObject var324 = module0205.f13276(var323);
        final SubLObject var325 = f20244(var324);
        SubLObject var326 = (SubLObject)ConsesLow.list(var325);
        SubLObject var327 = (NIL != var6) ? f20245(var325, var6) : var325;
        if (NIL == var325) {
            return (SubLObject)NIL;
        }
        SubLObject var328 = (SubLObject)ZERO_INTEGER;
        SubLObject var330;
        final SubLObject var329 = var330 = module0205.f13207(var323, (SubLObject)$ic148$);
        SubLObject var331 = (SubLObject)NIL;
        var331 = var330.first();
        while (NIL != var330) {
            var328 = Numbers.add(var328, (SubLObject)ONE_INTEGER);
            if (var324.eql($ic149$) && var328.eql((SubLObject)ONE_INTEGER)) {
                if (NIL == module0552.f34144(var331)) {
                    return (SubLObject)NIL;
                }
            }
            else {
                final SubLObject var332 = f20246(var331, var328, var324, var6);
                if (NIL == var332) {
                    return (SubLObject)NIL;
                }
                var326 = ConsesLow.append(var326, var332);
            }
            var330 = var330.rest();
            var331 = var330.first();
        }
        SubLObject var333 = module0035.f2468(module0035.f2269(var326, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        SubLObject var334 = (SubLObject)NIL;
        var334 = var333.first();
        while (NIL != var333) {
            var327 = ConsesLow.append(var327, module0262.f17370(var334, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            var333 = var333.rest();
            var334 = var333.first();
        }
        var327 = f20247(module0035.f2272(var327));
        return f20241(var323, var327, var7);
    }
    
    public static SubLObject f20246(SubLObject var15, final SubLObject var5, final SubLObject var72, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLThread var73 = SubLProcess.currentSubLThread();
        SubLObject var74 = (SubLObject)NIL;
        if (NIL != module0167.f10813(var15) || NIL != module0210.f13576(var15, (SubLObject)UNPROVIDED)) {
            SubLObject var75 = (SubLObject)NIL;
            final SubLObject var76 = $g2712$.currentBinding(var73);
            try {
                $g2712$.bind((SubLObject)T, var73);
                var75 = f20235(var15, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                $g2712$.rebind(var76, var73);
            }
            if (NIL == var75) {
                return (SubLObject)NIL;
            }
            var74 = (SubLObject)ConsesLow.cons(var75, var74);
        }
        else if (NIL != module0210.f13606(var15, (SubLObject)UNPROVIDED)) {
            final SubLObject var77 = f20248(var15);
            if (NIL == var77) {
                return (SubLObject)NIL;
            }
            var74 = (SubLObject)ConsesLow.cons(var77, var74);
        }
        if (NIL != module0228.f15225(var15)) {
            final SubLObject var78 = module0172.f10921(var15);
            if (NIL != var78) {
                var15 = var78;
            }
        }
        SubLObject var79 = (SubLObject)NIL;
        if (NIL != var6) {
            var79 = module0226.f14897(var72, var5, var6);
        }
        else {
            final SubLObject var76 = module0147.$g2094$.currentBinding(var73);
            final SubLObject var80 = module0147.$g2095$.currentBinding(var73);
            try {
                module0147.$g2094$.bind((SubLObject)$ic78$, var73);
                module0147.$g2095$.bind($ic79$, var73);
                var79 = module0226.f14897(var72, var5, (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var80, var73);
                module0147.$g2094$.rebind(var76, var73);
            }
        }
        SubLObject var81 = var79;
        SubLObject var82 = (SubLObject)NIL;
        var82 = var81.first();
        while (NIL != var81) {
            if (var82.eql($ic68$)) {
                var74 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0132.$g1560$.getGlobalValue()), var74);
            }
            else {
                final SubLObject var83 = f20249(var15, var82);
                if (NIL != var83) {
                    var74 = (SubLObject)ConsesLow.cons(var83, var74);
                }
                else if (NIL == $g2710$.getDynamicValue(var73) && NIL == module0144.$g1811$.getDynamicValue(var73)) {
                    return (SubLObject)NIL;
                }
            }
            var81 = var81.rest();
            var82 = var81.first();
        }
        if (NIL != module0173.f10955(var15) || NIL != module0210.f13598(var15)) {
            var79 = (SubLObject)NIL;
            if (NIL != var6) {
                var79 = module0226.f14935(var72, var5, var6);
            }
            else {
                final SubLObject var76 = module0147.$g2094$.currentBinding(var73);
                final SubLObject var80 = module0147.$g2095$.currentBinding(var73);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic78$, var73);
                    module0147.$g2095$.bind($ic79$, var73);
                    var79 = module0226.f14935(var72, var5, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0147.$g2095$.rebind(var80, var73);
                    module0147.$g2094$.rebind(var76, var73);
                }
            }
            var81 = var79;
            var82 = (SubLObject)NIL;
            var82 = var81.first();
            while (NIL != var81) {
                final SubLObject var83 = f20250(var15, var82);
                if (NIL != var83) {
                    var74 = (SubLObject)ConsesLow.cons(var83, var74);
                }
                else if (NIL == $g2710$.getDynamicValue(var73) && NIL == module0144.$g1811$.getDynamicValue(var73)) {
                    return (SubLObject)NIL;
                }
                var81 = var81.rest();
                var82 = var81.first();
            }
        }
        return var74;
    }
    
    public static SubLObject f20241(final SubLObject var315, SubLObject var286, SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        final SubLThread var316 = SubLProcess.currentSubLThread();
        SubLObject var317 = (SubLObject)NIL;
        if (NIL != $g2712$.getDynamicValue(var316)) {
            return module0132.f8603(var286);
        }
        SubLObject var318 = (SubLObject)ZERO_INTEGER;
        SubLObject var319 = (SubLObject)NIL;
        final SubLObject var320 = module0147.$g2094$.currentBinding(var316);
        final SubLObject var321 = module0147.$g2095$.currentBinding(var316);
        try {
            module0147.$g2094$.bind((SubLObject)$ic150$, var316);
            module0147.$g2095$.bind(module0147.$g2095$.getDynamicValue(var316), var316);
            while (NIL != var286 && NIL == var319) {
                SubLObject var322 = module0262.f17367(var286, (SubLObject)UNPROVIDED);
                if (NIL == var322) {
                    var322 = var286;
                }
                if (NIL == var319) {
                    SubLObject var323 = var322;
                    SubLObject var324 = (SubLObject)NIL;
                    var324 = var323.first();
                    while (NIL == var319 && NIL != var323) {
                        var286 = Sequences.delete(var324, var286, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        if (NIL == module0262.f17342(var324, var317, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0274.f18171(var315, var324)) {
                            var317 = (SubLObject)ConsesLow.cons(var324, var317);
                            if (NIL != module0004.f105(var7)) {
                                var318 = Numbers.add(var318, (SubLObject)ONE_INTEGER);
                                var319 = Numbers.numGE(var318, var7);
                            }
                        }
                        var323 = var323.rest();
                        var324 = var323.first();
                    }
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var321, var316);
            module0147.$g2094$.rebind(var320, var316);
        }
        return module0262.f17367(var317, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20251(final SubLObject var15, final SubLObject var5, final SubLObject var72, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLObject var73 = f20252(var72);
        if (NIL != var73) {
            final SubLObject var74 = f20246(var15, var5, var72, var6);
            if (NIL != var74) {
                final SubLObject var75 = (SubLObject)ConsesLow.cons(var73, var74);
                SubLObject var76 = (SubLObject)NIL;
                SubLObject var77 = module0035.f2468(Sequences.delete_duplicates(var75, (SubLObject)EQUAL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                SubLObject var78 = (SubLObject)NIL;
                var78 = var77.first();
                while (NIL != var77) {
                    var76 = ConsesLow.append(var76, module0262.f17370(var78, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                    var77 = var77.rest();
                    var78 = var77.first();
                }
                var76 = module0035.f2272(var76);
                if (NIL != module0167.f10813(var15) || NIL != module0202.f12659(var15)) {
                    return f20241(var15, var76, (SubLObject)UNPROVIDED);
                }
                return module0262.f17367(var76, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20253(final SubLObject var1) {
        final SubLObject var2 = f20254(var1);
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = Time.get_internal_real_time();
        final SubLObject var5 = module0077.f5333(var2);
        SubLObject var6;
        SubLObject var7;
        SubLObject var8;
        for (var6 = module0032.f1741(var5), var7 = (SubLObject)NIL, var7 = module0032.f1742(var6, var5); NIL == module0032.f1744(var6, var7); var7 = module0032.f1743(var7)) {
            var8 = module0032.f1745(var6, var7);
            if (NIL != module0032.f1746(var7, var8)) {
                f20235(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        var3 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var4), time_high.$internal_time_units_per_second$.getGlobalValue());
        return module0048.f3307(Numbers.divide(var3, var1), (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f20254(final SubLObject var1) {
        final SubLObject var2 = module0077.f5313((SubLObject)EQL, var1);
        while (var1.numG(module0077.f5311(var2))) {
            final SubLObject var3 = module0172.f10923((SubLObject)UNPROVIDED);
            if (NIL == module0077.f5320(var3, var2)) {
                module0077.f5326(var3, var2);
            }
        }
        return var2;
    }
    
    public static SubLObject f20255(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        final SubLObject var2 = f20256();
        final SubLObject var3 = Sequences.length(var2);
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = Time.get_internal_real_time();
        SubLObject var7 = var1.isInteger() ? module0035.f2124(var1, var2) : var2;
        SubLObject var8 = (SubLObject)NIL;
        var8 = var7.first();
        while (NIL != var7) {
            final SubLObject var9 = var8.first();
            final SubLObject var10 = conses_high.third(var8);
            final SubLObject var11 = module0205.f13379(var10, (SubLObject)UNPROVIDED);
            final SubLObject var12 = module0205.f13380(var10, (SubLObject)UNPROVIDED);
            final SubLObject var13 = module0205.f13381(var10, (SubLObject)UNPROVIDED);
            final SubLObject var14 = f20251(var11, var12, var13, (SubLObject)UNPROVIDED);
            if (NIL == module0035.f1997(var14) || NIL == module0262.f17336(module0178.f11287(var9), var14.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var5 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var9, var10, var14), var5);
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        var4 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var6), time_high.$internal_time_units_per_second$.getGlobalValue());
        var7 = var5;
        SubLObject var15 = (SubLObject)NIL;
        var15 = var7.first();
        while (NIL != var7) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic151$, new SubLObject[] { var15.first(), conses_high.second(var15), conses_high.third(var15) });
            var7 = var7.rest();
            var15 = var7.first();
        }
        print_high.print(Sequences.length(var2), (SubLObject)UNPROVIDED);
        return module0048.f3307(Numbers.divide(var4, var3), (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f20256() {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        SubLObject var51 = (SubLObject)NIL;
        final SubLObject var52 = assertion_handles_oc.f11010();
        final SubLObject var53 = (SubLObject)$ic152$;
        final SubLObject var54 = module0065.f4733(var52);
        SubLObject var55 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var53) : var53;
        final SubLObject var56 = module0012.$g75$.currentBinding(var50);
        final SubLObject var57 = module0012.$g76$.currentBinding(var50);
        final SubLObject var58 = module0012.$g77$.currentBinding(var50);
        final SubLObject var59 = module0012.$g78$.currentBinding(var50);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var50);
            module0012.$g76$.bind((SubLObject)NIL, var50);
            module0012.$g77$.bind((SubLObject)T, var50);
            module0012.$g78$.bind(Time.get_universal_time(), var50);
            module0012.f478(var53);
            final SubLObject var350_351 = var52;
            if (NIL == module0065.f4772(var350_351, (SubLObject)$ic154$)) {
                final SubLObject var352_353 = var350_351;
                if (NIL == module0065.f4775(var352_353, (SubLObject)$ic154$)) {
                    final SubLObject var60 = module0065.f4740(var352_353);
                    final SubLObject var61 = (SubLObject)NIL;
                    SubLObject var62;
                    SubLObject var63;
                    SubLObject var64;
                    SubLObject var65;
                    SubLObject var66;
                    SubLObject var67;
                    SubLObject var85_360;
                    SubLObject var68;
                    SubLObject var69;
                    SubLObject var70;
                    for (var62 = Sequences.length(var60), var63 = (SubLObject)NIL, var63 = (SubLObject)ZERO_INTEGER; var63.numL(var62); var63 = Numbers.add(var63, (SubLObject)ONE_INTEGER)) {
                        var64 = ((NIL != var61) ? Numbers.subtract(var62, var63, (SubLObject)ONE_INTEGER) : var63);
                        var65 = Vectors.aref(var60, var64);
                        if (NIL == module0065.f4749(var65) || NIL == module0065.f4773((SubLObject)$ic154$)) {
                            if (NIL != module0065.f4749(var65)) {
                                var65 = (SubLObject)$ic154$;
                            }
                            module0012.note_percent_progress(var55, var54);
                            var55 = Numbers.add(var55, (SubLObject)ONE_INTEGER);
                            var66 = module0178.f11299(var65);
                            var67 = (SubLObject)NIL;
                            var67 = var66.first();
                            while (NIL != var66) {
                                if (NIL != deduction_handles_oc.f11659(var67)) {
                                    var85_360 = module0188.f11770(var67);
                                    var68 = (SubLObject)NIL;
                                    var68 = var85_360.first();
                                    while (NIL != var85_360) {
                                        if (NIL == assertion_handles_oc.f11035(var68) && NIL != module0191.f11952(var68)) {
                                            var69 = module0191.f11967(var68);
                                            var70 = module0191.f11976(var68);
                                            if ($ic155$.eql(module0205.f13378(var69))) {
                                                var51 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var65, var70, var69), var51);
                                            }
                                        }
                                        var85_360 = var85_360.rest();
                                        var68 = var85_360.first();
                                    }
                                }
                                var66 = var66.rest();
                                var67 = var66.first();
                            }
                        }
                    }
                }
                final SubLObject var363_364 = var350_351;
                if (NIL == module0065.f4777(var363_364) || NIL == module0065.f4773((SubLObject)$ic154$)) {
                    final SubLObject var71 = module0065.f4738(var363_364);
                    SubLObject var72 = module0065.f4739(var363_364);
                    final SubLObject var73 = module0065.f4734(var363_364);
                    final SubLObject var74 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic154$)) ? NIL : $ic154$);
                    while (var72.numL(var73)) {
                        final SubLObject var75 = Hashtables.gethash_without_values(var72, var71, var74);
                        if (NIL == module0065.f4773((SubLObject)$ic154$) || NIL == module0065.f4749(var75)) {
                            module0012.note_percent_progress(var55, var54);
                            var55 = Numbers.add(var55, (SubLObject)ONE_INTEGER);
                            SubLObject var76 = module0178.f11299(var75);
                            SubLObject var77 = (SubLObject)NIL;
                            var77 = var76.first();
                            while (NIL != var76) {
                                if (NIL != deduction_handles_oc.f11659(var77)) {
                                    SubLObject var85_361 = module0188.f11770(var77);
                                    SubLObject var78 = (SubLObject)NIL;
                                    var78 = var85_361.first();
                                    while (NIL != var85_361) {
                                        if (NIL == assertion_handles_oc.f11035(var78) && NIL != module0191.f11952(var78)) {
                                            final SubLObject var79 = module0191.f11967(var78);
                                            final SubLObject var80 = module0191.f11976(var78);
                                            if ($ic155$.eql(module0205.f13378(var79))) {
                                                var51 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var75, var80, var79), var51);
                                            }
                                        }
                                        var85_361 = var85_361.rest();
                                        var78 = var85_361.first();
                                    }
                                }
                                var76 = var76.rest();
                                var77 = var76.first();
                            }
                        }
                        var72 = Numbers.add(var72, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var59, var50);
            module0012.$g77$.rebind(var58, var50);
            module0012.$g76$.rebind(var57, var50);
            module0012.$g75$.rebind(var56, var50);
        }
        return Sequences.delete_duplicates(var51, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20248(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        SubLObject var125 = (SubLObject)NIL;
        final SubLObject var126 = module0144.$g1796$.currentBinding(var124);
        final SubLObject var127 = module0144.$g1795$.currentBinding(var124);
        final SubLObject var128 = module0152.$g2116$.currentBinding(var124);
        final SubLObject var129 = module0152.$g2115$.currentBinding(var124);
        final SubLObject var130 = module0152.$g2131$.currentBinding(var124);
        try {
            module0144.$g1796$.bind((SubLObject)NIL, var124);
            module0144.$g1795$.bind((SubLObject)NIL, var124);
            module0152.$g2116$.bind((SubLObject)NIL, var124);
            module0152.$g2115$.bind((SubLObject)NIL, var124);
            module0152.$g2131$.bind((SubLObject)NIL, var124);
            var125 = f20247(f20215(var123));
        }
        finally {
            module0152.$g2131$.rebind(var130, var124);
            module0152.$g2115$.rebind(var129, var124);
            module0152.$g2116$.rebind(var128, var124);
            module0144.$g1795$.rebind(var127, var124);
            module0144.$g1796$.rebind(var126, var124);
        }
        return var125;
    }
    
    public static SubLObject f20244(final SubLObject var326) {
        return module0259.f16932(var326, $ic156$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20252(final SubLObject var72) {
        return module0259.f16932(var72, $ic157$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20245(final SubLObject var369, final SubLObject var6) {
        SubLObject var370 = (SubLObject)NIL;
        SubLObject var371 = var369;
        SubLObject var372 = (SubLObject)NIL;
        var372 = var371.first();
        while (NIL != var371) {
            var370 = ConsesLow.append(var370, module0262.f17370((SubLObject)ConsesLow.list(var6, var372), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            var371 = var371.rest();
            var372 = var371.first();
        }
        var370 = module0035.f2272(var370);
        return var370;
    }
    
    public static SubLObject f20249(final SubLObject var15, final SubLObject var265) {
        return module0259.f16932(var15, var265, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20250(final SubLObject var15, final SubLObject var265) {
        return module0256.f16650(var15, var265, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20247(final SubLObject var304) {
        final SubLThread var305 = SubLProcess.currentSubLThread();
        if (NIL != $g2710$.getDynamicValue(var305)) {
            SubLObject var306 = (SubLObject)NIL;
            SubLObject var307 = var304;
            SubLObject var308 = (SubLObject)NIL;
            var308 = var307.first();
            while (NIL != var307) {
                if (NIL == module0004.f104(var308, $g2710$.getDynamicValue(var305), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var306 = (SubLObject)ConsesLow.cons(var308, var306);
                }
                var307 = var307.rest();
                var308 = var307.first();
            }
            return var306;
        }
        return var304;
    }
    
    public static SubLObject f20257(final SubLObject var371, final SubLObject var372, SubLObject var373, SubLObject var374, SubLObject var375, SubLObject var376, SubLObject var377) {
        if (var373 == UNPROVIDED) {
            var373 = (SubLObject)NIL;
        }
        if (var374 == UNPROVIDED) {
            var374 = (SubLObject)NIL;
        }
        if (var375 == UNPROVIDED) {
            var375 = (SubLObject)NIL;
        }
        if (var376 == UNPROVIDED) {
            var376 = (SubLObject)NIL;
        }
        if (var377 == UNPROVIDED) {
            var377 = (SubLObject)NIL;
        }
        final SubLThread var378 = SubLProcess.currentSubLThread();
        if (module0144.$g1797$.getDynamicValue(var378).numGE(var371)) {
            PrintLow.format((SubLObject)T, var372, new SubLObject[] { var373, var374, var375, var376, var377 });
            return (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20193(final SubLObject var371, final SubLObject var372, SubLObject var373, SubLObject var374, SubLObject var375, SubLObject var376, SubLObject var377) {
        if (var373 == UNPROVIDED) {
            var373 = (SubLObject)NIL;
        }
        if (var374 == UNPROVIDED) {
            var374 = (SubLObject)NIL;
        }
        if (var375 == UNPROVIDED) {
            var375 = (SubLObject)NIL;
        }
        if (var376 == UNPROVIDED) {
            var376 = (SubLObject)NIL;
        }
        if (var377 == UNPROVIDED) {
            var377 = (SubLObject)NIL;
        }
        final SubLThread var378 = SubLProcess.currentSubLThread();
        if (module0144.$g1797$.getDynamicValue(var378).numGE(var371)) {
            Errors.cerror((SubLObject)$ic91$, var372, new SubLObject[] { var373, var374, var375, var376, var377 });
        }
        else if (Numbers.add((SubLObject)TWO_INTEGER, module0144.$g1797$.getDynamicValue(var378)).numGE(var371)) {
            Errors.warn(var372, new SubLObject[] { var373, var374, var375, var376, var377 });
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20258(final SubLObject var371, final SubLObject var378, final SubLObject var372, SubLObject var373, SubLObject var374, SubLObject var375, SubLObject var376, SubLObject var377) {
        if (var373 == UNPROVIDED) {
            var373 = (SubLObject)NIL;
        }
        if (var374 == UNPROVIDED) {
            var374 = (SubLObject)NIL;
        }
        if (var375 == UNPROVIDED) {
            var375 = (SubLObject)NIL;
        }
        if (var376 == UNPROVIDED) {
            var376 = (SubLObject)NIL;
        }
        if (var377 == UNPROVIDED) {
            var377 = (SubLObject)NIL;
        }
        final SubLThread var379 = SubLProcess.currentSubLThread();
        if (module0144.$g1797$.getDynamicValue(var379).numGE(var371)) {
            Errors.cerror(var378, var372, new SubLObject[] { var373, var374, var375, var376, var377 });
        }
        else if (Numbers.add((SubLObject)TWO_INTEGER, module0144.$g1797$.getDynamicValue(var379)).numGE(var371)) {
            Errors.warn(var372, new SubLObject[] { var373, var374, var375, var376, var377 });
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20259(final SubLObject var371, final SubLObject var372, SubLObject var373, SubLObject var374, SubLObject var375, SubLObject var376, SubLObject var377) {
        if (var373 == UNPROVIDED) {
            var373 = (SubLObject)NIL;
        }
        if (var374 == UNPROVIDED) {
            var374 = (SubLObject)NIL;
        }
        if (var375 == UNPROVIDED) {
            var375 = (SubLObject)NIL;
        }
        if (var376 == UNPROVIDED) {
            var376 = (SubLObject)NIL;
        }
        if (var377 == UNPROVIDED) {
            var377 = (SubLObject)NIL;
        }
        final SubLThread var378 = SubLProcess.currentSubLThread();
        if (module0144.$g1797$.getDynamicValue(var378).numGE(var371)) {
            Functions.apply((SubLObject)$ic158$, var372, new SubLObject[] { var373, var374, var375, var376, var377 });
            return (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20260(final SubLObject var265, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        return module0256.f16530(var265, $ic159$, var6, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20261(final SubLObject var334, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        return module0256.f16566(var334, $ic159$, var6, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20262(final SubLObject var3, final SubLObject var5, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var9;
        SubLObject var8 = var9 = module0226.f14897(var3, var5, var6);
        SubLObject var10 = (SubLObject)NIL;
        var10 = var9.first();
        while (NIL != var9) {
            var7 = (SubLObject)ConsesLow.cons(module0202.f12769($ic160$, var3, var5, var10), var7);
            var9 = var9.rest();
            var10 = var9.first();
        }
        var8 = (var9 = module0226.f14935(var3, var5, var6));
        var10 = (SubLObject)NIL;
        var10 = var9.first();
        while (NIL != var9) {
            var7 = (SubLObject)ConsesLow.cons(module0202.f12769($ic161$, var3, var5, var10), var7);
            var9 = var9.rest();
            var10 = var9.first();
        }
        return Sequences.nreverse(var7);
    }
    
    public static SubLObject f20263(final SubLObject var3, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        assert NIL != module0269.f17721(var3) : var3;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var9;
        final SubLObject var8 = var9 = module0226.f14888(var3, var6);
        SubLObject var10 = (SubLObject)NIL;
        var10 = var9.first();
        while (NIL != var9) {
            var7 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic163$, var3, var10), var7);
            var9 = var9.rest();
            var10 = var9.first();
        }
        final SubLObject var11 = var9 = module0226.f14941(var3, var6);
        var10 = (SubLObject)NIL;
        var10 = var9.first();
        while (NIL != var9) {
            var7 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic164$, var3, var10), var7);
            var9 = var9.rest();
            var10 = var9.first();
        }
        return Sequences.nreverse(var7);
    }
    
    public static SubLObject f20264(final SubLObject var3, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        assert NIL != module0269.f17734(var3) : var3;
        SubLObject var7 = (SubLObject)NIL;
        final SubLObject var8 = module0225.f14773(var3);
        if (NIL != var8) {
            SubLObject var9;
            SubLObject var10;
            SubLObject var11;
            for (var9 = module0048.f_1X(var8), var10 = (SubLObject)NIL, var10 = (SubLObject)ONE_INTEGER; !var10.numGE(var9); var10 = module0048.f_1X(var10)) {
                var11 = f20262(var3, var10, var6);
                var7 = ConsesLow.nconc(Sequences.nreverse(var11), var7);
            }
        }
        else {
            var7 = f20263(var3, var6);
        }
        return Sequences.nreverse(var7);
    }
    
    public static SubLObject f20265(final SubLObject var3, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (NIL == module0269.f17734(var3)) {
            return (SubLObject)NIL;
        }
        return ConsesLow.nconc(module0225.f14784(var3), f20264(var3, var6));
    }
    
    public static SubLObject f20266(final SubLObject var3, final SubLObject var106, final SubLObject var5, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var3) : var3;
        assert NIL != module0004.f105(var5) : var5;
        SubLObject var107 = (SubLObject)NIL;
        SubLObject var109;
        SubLObject var108 = var109 = module0226.f14882(var3, var5, var6);
        SubLObject var110 = (SubLObject)NIL;
        var110 = var109.first();
        while (NIL != var109) {
            var107 = (SubLObject)ConsesLow.cons(module0202.f12768($ic168$, var106, var110), var107);
            var109 = var109.rest();
            var110 = var109.first();
        }
        var108 = (var109 = module0226.f14935(var3, var5, var6));
        var110 = (SubLObject)NIL;
        var110 = var109.first();
        while (NIL != var109) {
            var107 = (SubLObject)ConsesLow.cons(module0202.f12768($ic67$, var106, var110), var107);
            var109 = var109.rest();
            var110 = var109.first();
        }
        return Sequences.nreverse(var107);
    }
    
    public static SubLObject f20267(final SubLObject var123, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        SubLObject var124 = (SubLObject)NIL;
        final SubLObject var125 = module0205.f13136(var123);
        if (NIL == module0173.f10955(var125)) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS($ic168$, var125, (SubLObject)$ic169$));
        }
        SubLObject var126 = (SubLObject)ZERO_INTEGER;
        SubLObject var128;
        final SubLObject var127 = var128 = module0205.f13207(var123, (SubLObject)$ic148$);
        SubLObject var129 = (SubLObject)NIL;
        var129 = var128.first();
        while (NIL != var128) {
            var126 = Numbers.add(var126, (SubLObject)ONE_INTEGER);
            final SubLObject var130 = f20266(var125, var129, var126, var6);
            var124 = ConsesLow.nconc(Sequences.nreverse(var130), var124);
            var128 = var128.rest();
            var129 = var128.first();
        }
        return Sequences.nreverse(var124);
    }
    
    public static SubLObject f20268(final SubLObject var123, final SubLObject var6) {
        final SubLObject var124 = module0307.f20760(var123, var6, (SubLObject)UNPROVIDED);
        final SubLObject var125 = f20269(var124, var6);
        return var125;
    }
    
    public static SubLObject f20269(final SubLObject var385, final SubLObject var6) {
        final SubLThread var386 = SubLProcess.currentSubLThread();
        final SubLObject var387 = module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        final SubLObject var388 = (NIL != module0202.f12595(var385)) ? var385 : module0276.f18287((SubLObject)ConsesLow.list(var385), (SubLObject)UNPROVIDED);
        SubLObject var390;
        final SubLObject var389 = var390 = module0205.f13207(var388, (SubLObject)$ic148$);
        SubLObject var391 = (SubLObject)NIL;
        var391 = var390.first();
        while (NIL != var390) {
            if (NIL != module0202.f12589(var391, $ic168$)) {
                final SubLObject var392 = module0205.f13387(var391, (SubLObject)UNPROVIDED);
                final SubLObject var393 = module0205.f13388(var391, (SubLObject)UNPROVIDED);
                assert NIL != module0201.f12580(var392) : var392;
                module0084.f5762(var387, var392, var393);
            }
            var390 = var390.rest();
            var391 = var390.first();
        }
        SubLObject var394 = (SubLObject)NIL;
        SubLObject var395;
        for (var395 = module0066.f4838(module0067.f4891(var387)); NIL == module0066.f4841(var395); var395 = module0066.f4840(var395)) {
            var386.resetMultipleValues();
            final SubLObject var396 = module0066.f4839(var395);
            final SubLObject var397 = var386.secondMultipleValue();
            var386.resetMultipleValues();
            var394 = module0035.f2063(var394, var396, module0256.f16529(var397, var6, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        }
        module0066.f4842(var395);
        return var394;
    }
    
    public static SubLObject f20270(final SubLObject var123, final SubLObject var392, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        SubLObject var393 = (SubLObject)NIL;
        final SubLObject var394 = module0307.f20765(var123, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var395 = module0307.f20765(var392, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var396 = (SubLObject)NIL;
        SubLObject var397 = (SubLObject)NIL;
        SubLObject var398 = (SubLObject)NIL;
        SubLObject var399 = (SubLObject)NIL;
        SubLObject var400 = (SubLObject)NIL;
        SubLObject var401 = (SubLObject)NIL;
        SubLObject var402 = (SubLObject)NIL;
        final SubLObject var403 = module0202.f12911(var123, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var404 = module0202.f12911(var392, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var405 = module0067.f4880((SubLObject)EQL, Sequences.length(var403));
        SubLObject var406 = var403;
        SubLObject var407 = (SubLObject)NIL;
        var407 = var406.first();
        while (NIL != var406) {
            final SubLObject var408 = module0067.f4884(var394, var407, (SubLObject)UNPROVIDED);
            var396 = var408.first();
            var397 = conses_high.cadr(var408);
            SubLObject var85_406 = var404;
            SubLObject var409 = (SubLObject)NIL;
            var409 = var85_406.first();
            while (NIL != var85_406) {
                final SubLObject var410 = module0067.f4884(var395, var409, (SubLObject)UNPROVIDED);
                var400 = var410.first();
                var401 = conses_high.cadr(var410);
                var402 = conses_high.cddr(var410).first();
                if (NIL == module0257.f16693(var396, var400, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0257.f16693(var397, var401, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var398 = f20271(var396, var400, var397, var401, var6);
                    module0084.f5762(var405, var407, (SubLObject)ConsesLow.list(var409, var398));
                }
                var85_406 = var85_406.rest();
                var409 = var85_406.first();
            }
            var406 = var406.rest();
            var407 = var406.first();
        }
        var399 = (var406 = f20272(var405, (SubLObject)NIL, (SubLObject)NIL));
        SubLObject var411 = (SubLObject)NIL;
        var411 = var406.first();
        while (NIL != var406) {
            var393 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(f20273(var411, var123, var392, var6), var411), var393);
            var406 = var406.rest();
            var411 = var406.first();
        }
        return Sort.sort(var393, Symbols.symbol_function((SubLObject)$ic171$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f20274(final SubLObject var410, final SubLObject var411) {
        return Functions.funcall(Symbols.symbol_function((SubLObject)$ic141$), var410.first(), var411.first());
    }
    
    public static SubLObject f20272(SubLObject var412, SubLObject var398, SubLObject var413) {
        final SubLThread var414 = SubLProcess.currentSubLThread();
        var412 = module0084.f5760(var412);
        SubLObject var415;
        for (var415 = module0066.f4838(module0067.f4891(var412)); NIL == module0066.f4841(var415); var415 = module0066.f4840(var415)) {
            var414.resetMultipleValues();
            final SubLObject var416 = module0066.f4839(var415);
            final SubLObject var417 = var414.secondMultipleValue();
            var414.resetMultipleValues();
            module0067.f4887(var412, var416);
            SubLObject var418 = var417;
            SubLObject var419 = (SubLObject)NIL;
            var419 = var418.first();
            while (NIL != var418) {
                var419 = (SubLObject)ConsesLow.cons(var416, var419);
                var413 = (SubLObject)ConsesLow.cons(var419, var413);
                var398 = f20272(module0084.f5760(var412), var398, var413);
                var398 = (SubLObject)ConsesLow.cons(var413, var398);
                var413 = var413.rest();
                var418 = var418.rest();
                var419 = var418.first();
            }
        }
        module0066.f4842(var415);
        return var398;
    }
    
    public static SubLObject f20275(final SubLObject var416) {
        SubLObject var417 = (SubLObject)NIL;
        SubLObject var418 = var416;
        SubLObject var419 = (SubLObject)NIL;
        var419 = var418.first();
        while (NIL != var418) {
            var417 = (SubLObject)ConsesLow.cons(conses_high.second(var419), var417);
            var418 = var418.rest();
            var419 = var418.first();
        }
        return Sequences.length(Sequences.remove_duplicates(var417, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f20273(final SubLObject var416, final SubLObject var123, final SubLObject var392, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (NIL == var416) {
            return (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var417 = Sequences.length(module0202.f12945(var123, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        final SubLObject var418 = Sequences.length(module0202.f12945(var392, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        final SubLObject var419 = Sequences.length(var416);
        final SubLObject var420 = f20275(var416);
        SubLObject var421 = (SubLObject)ZERO_INTEGER;
        SubLObject var422 = (SubLObject)ZERO_INTEGER;
        SubLObject var423 = (SubLObject)ZERO_INTEGER;
        if (var417.eql((SubLObject)ZERO_INTEGER)) {
            var422 = (SubLObject)$ic172$;
        }
        else {
            var422 = Numbers.multiply((SubLObject)$ic172$, Numbers.divide(var419, var417));
        }
        if (var418.eql((SubLObject)ZERO_INTEGER)) {
            var423 = (SubLObject)$ic172$;
        }
        else {
            var423 = Numbers.multiply((SubLObject)$ic172$, Numbers.divide(var420, var417));
        }
        SubLObject var424 = var416;
        SubLObject var425 = (SubLObject)NIL;
        var425 = var424.first();
        while (NIL != var424) {
            var421 = Numbers.add(var421, conses_high.third(var425));
            var424 = var424.rest();
            var425 = var424.first();
        }
        var421 = Numbers.divide(var421, var419);
        return Numbers.divide(Numbers.add(var421, Numbers.divide(Numbers.add(var422, var423), (SubLObject)TWO_INTEGER)), (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f20276(final SubLObject var425, final SubLObject var426, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (NIL == var425 || NIL == var426) {
            return (SubLObject)ONE_INTEGER;
        }
        final SubLObject var427 = Numbers.log(module0549.f33906($ic68$), (SubLObject)UNPROVIDED);
        final SubLObject var428 = Numbers.max((SubLObject)ONE_INTEGER, module0549.f33906(var425.first()));
        final SubLObject var429 = Numbers.max((SubLObject)ONE_INTEGER, module0549.f33906(var426.first()));
        if (var428.numL(var429)) {
            return (SubLObject)ONE_INTEGER;
        }
        final SubLObject var430 = Numbers.abs(Numbers.subtract(Numbers.log(var428, (SubLObject)UNPROVIDED), Numbers.log(var429, (SubLObject)UNPROVIDED)));
        SubLObject var431 = Numbers.subtract((SubLObject)$ic172$, Numbers.multiply(Numbers.divide(var430, var427), (SubLObject)$ic172$));
        if (var430.numL((SubLObject)$ic173$)) {
            var431 = (SubLObject)$ic172$;
        }
        return var431;
    }
    
    public static SubLObject f20277(final SubLObject var432, final SubLObject var433, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        return f20276(var432, var433, var6);
    }
    
    public static SubLObject f20278(final SubLObject var434, final SubLObject var435, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        return f20276(var434, var435, var6);
    }
    
    public static SubLObject f20271(final SubLObject var432, final SubLObject var433, final SubLObject var434, final SubLObject var435, final SubLObject var6) {
        if (NIL == var432 && NIL == var433 && NIL == var434 && NIL == var435) {
            return (SubLObject)ONE_INTEGER;
        }
        if (NIL == var432 && NIL == var433) {
            return f20278(var434, var435, var6);
        }
        if (NIL == var434 && NIL == var435) {
            return f20277(var432, var433, var6);
        }
        final SubLObject var436 = f20277(var432, var433, var6);
        final SubLObject var437 = f20278(var434, var435, var6);
        return Numbers.divide(Numbers.add(var436, var437), (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f20279(final SubLObject var438, final SubLObject var439, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (NIL != var6 && NIL != module0259.f16854(var438, var439, var6, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        if (NIL != var6 && NIL != module0256.f16596(var438, var439, var6, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        if (NIL != var6 && NIL != module0173.f10955(var438) && NIL != module0260.f17089(var438, var439, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        if (NIL != module0259.f16891(var438, var439)) {
            return (SubLObject)T;
        }
        if (NIL != module0256.f16598(var438, var439)) {
            return (SubLObject)T;
        }
        if (NIL != module0173.f10955(var438) && NIL != module0260.f17090(var438, var439)) {
            return (SubLObject)T;
        }
        if (NIL != module0256.f16598(var439, $ic174$) && var438.isNumber()) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20280() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20117", "S#22786", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20118", "S#22787", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20119", "S#22788", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20120", "S#22789", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20121", "S#22790", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20122", "S#22791", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20123", "S#20510", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20124", "S#20632", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20125", "S#22792", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20126", "S#20504", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20127", "S#20505", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20128", "S#20506", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20129", "S#20507", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20130", "S#20508", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20131", "S#22688", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20132", "S#22689", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20133", "S#22690", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20134", "S#20509", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20135", "S#22793", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20136", "S#15526", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20137", "S#22794", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20138", "S#16698", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20141", "S#16695", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20144", "S#22795", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20145", "S#22796", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20146", "S#22797", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20147", "S#22798", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20148", "S#22799", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20149", "S#22800", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20150", "S#20871", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20151", "S#22801", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20152", "S#22802", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20153", "S#22803", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20154", "S#22804", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20155", "S#20824", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20156", "S#22805", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20157", "S#22806", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20158", "S#22807", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20160", "S#22808", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20159", "S#22809", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20162", "S#21475", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20163", "S#22810", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20164", "S#22811", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20165", "S#22812", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20166", "S#22813", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20167", "S#22814", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20161", "S#22815", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20168", "S#22816", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20169", "S#22817", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20170", "S#22818", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20171", "S#22819", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20172", "S#22820", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20173", "S#22680", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20174", "S#22821", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20175", "S#22822", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20176", "S#22823", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20177", "S#22824", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20178", "S#22825", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20142", "S#22826", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20139", "S#22827", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20179", "S#22828", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20180", "S#22681", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20181", "S#22682", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20182", "S#22829", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20183", "S#22830", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20184", "S#22831", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20185", "S#22832", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20186", "S#22833", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20143", "S#22834", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20140", "S#22835", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20187", "S#22836", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20188", "S#22683", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20189", "S#21480", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20191", "S#21481", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20190", "S#22837", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20192", "S#22686", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20194", "S#22838", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20195", "S#22839", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20198", "S#22840", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20196", "S#22841", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20197", "S#22842", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20199", "S#22671", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20200", "S#22843", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20201", "S#22844", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20202", "S#22845", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20204", "S#22846", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20205", "S#22847", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20206", "S#22848", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20207", "S#20638", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20208", "S#22849", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20203", "S#22673", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20209", "S#22850", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20210", "S#22851", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20211", "S#22852", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20212", "S#20657", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20213", "S#20635", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20214", "S#22853", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20216", "S#22854", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20218", "S#22855", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20220", "S#22856", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20222", "S#22857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20224", "S#22858", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20225", "S#22859", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20226", "S#22860", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20217", "S#22861", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20227", "S#22862", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20219", "S#22863", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20221", "S#22864", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20223", "S#20668", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20215", "S#22865", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20228", "S#22866", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20229", "S#22867", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20230", "S#22868", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20232", "S#22869", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20233", "S#22870", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20234", "S#22871", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20231", "S#22872", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20236", "S#22873", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20237", "S#22874", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20238", "S#22875", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20239", "S#22876", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20240", "S#22877", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20235", "MAX-FLOOR-MTS-OF-NAT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20242", "S#22878", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20243", "S#22879", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20246", "S#22880", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20241", "S#22881", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20251", "S#22882", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20253", "S#22883", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20254", "S#22884", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20255", "S#22885", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20256", "S#22886", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20248", "S#22887", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20244", "S#22888", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20252", "S#22889", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20245", "S#22890", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20249", "S#22891", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20250", "S#22892", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20247", "S#22893", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20257", "S#22894", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20193", "S#22895", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20258", "S#22896", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20259", "S#22897", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20260", "S#22898", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20261", "S#22899", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20262", "S#22900", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20263", "S#22901", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20264", "S#22902", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20265", "ALL-RELATION-CONSTRAINT-SENTENCES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20266", "S#22903", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20267", "S#22904", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20268", "S#22905", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20269", "S#22906", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20270", "S#22907", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20274", "S#22908", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20272", "S#22909", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20275", "S#22910", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20273", "S#22911", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20276", "S#22912", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20277", "S#22913", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20278", "S#22914", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20271", "S#22915", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0303", "f20279", "S#22916", 2, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20281() {
        $g2706$ = SubLFiles.deflexical("S#22917", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic5$)) ? $g2706$.getGlobalValue() : NIL));
        $g2707$ = SubLFiles.deflexical("S#22918", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic77$)) ? $g2707$.getGlobalValue() : NIL));
        $g2708$ = SubLFiles.deflexical("S#22919", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic97$)) ? $g2708$.getGlobalValue() : NIL));
        $g2709$ = SubLFiles.defparameter("S#22920", (SubLObject)$ic139$);
        $g2710$ = SubLFiles.defparameter("S#22921", (SubLObject)NIL);
        $g2711$ = SubLFiles.deflexical("S#22922", (SubLObject)NIL);
        $g2712$ = SubLFiles.defparameter("S#22923", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20282() {
        module0003.f57((SubLObject)$ic5$);
        module0003.f57((SubLObject)$ic77$);
        module0003.f57((SubLObject)$ic97$);
        module0034.f1909((SubLObject)$ic143$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f20280();
    }
    
    public void initializeVariables() {
        f20281();
    }
    
    public void runTopLevelForms() {
        f20282();
    }
    
    static {
        me = (SubLFile)new module0303();
        $g2706$ = null;
        $g2707$ = null;
        $g2708$ = null;
        $g2709$ = null;
        $g2710$ = null;
        $g2711$ = null;
        $g2712$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("arg1Isa"));
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("arg2Isa"));
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("arg3Isa"));
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("arg4Isa"));
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("arg5Isa"));
        $ic5$ = makeSymbol("S#22917", "CYC");
        $ic6$ = makeSymbol("S#2879", "CYC");
        $ic7$ = makeString("ARG");
        $ic8$ = makeString("~S");
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa1-2"));
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa1-3"));
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa1-4"));
        $ic12$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa1-5"));
        $ic13$ = makeString("invalid arg-isa-pred index: ~s-~s");
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa2-1"));
        $ic15$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa2-3"));
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa2-4"));
        $ic17$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa2-5"));
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa3-1"));
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa3-2"));
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa3-4"));
        $ic21$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa3-5"));
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa4-1"));
        $ic23$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa4-2"));
        $ic24$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa4-3"));
        $ic25$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa4-5"));
        $ic26$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa5-1"));
        $ic27$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa5-2"));
        $ic28$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa5-3"));
        $ic29$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa5-4"));
        $ic30$ = ConsesLow.list((SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER);
        $ic31$ = constant_handles_oc.f8479((SubLObject)makeString("interArgNotIsa1-2"));
        $ic32$ = constant_handles_oc.f8479((SubLObject)makeString("interArgNotIsa1-3"));
        $ic33$ = constant_handles_oc.f8479((SubLObject)makeString("interArgNotIsa1-4"));
        $ic34$ = constant_handles_oc.f8479((SubLObject)makeString("interArgNotIsa1-5"));
        $ic35$ = makeString("invalid arg-not-isa-pred index: ~s-~s");
        $ic36$ = constant_handles_oc.f8479((SubLObject)makeString("interArgNotIsa2-3"));
        $ic37$ = constant_handles_oc.f8479((SubLObject)makeString("interArgNotIsa2-4"));
        $ic38$ = constant_handles_oc.f8479((SubLObject)makeString("interArgNotIsa2-5"));
        $ic39$ = constant_handles_oc.f8479((SubLObject)makeString("interArgNotIsa3-4"));
        $ic40$ = constant_handles_oc.f8479((SubLObject)makeString("interArgNotIsa3-5"));
        $ic41$ = constant_handles_oc.f8479((SubLObject)makeString("interArgNotIsa4-5"));
        $ic42$ = constant_handles_oc.f8479((SubLObject)makeString("interArgGenl1-2"));
        $ic43$ = makeString("invalid arg-genl-pred index: ~s-~s");
        $ic44$ = constant_handles_oc.f8479((SubLObject)makeString("interArgGenl2-1"));
        $ic45$ = constant_handles_oc.f8479((SubLObject)makeString("interArgGenl2-4"));
        $ic46$ = constant_handles_oc.f8479((SubLObject)makeString("interArgNotGenl1-2"));
        $ic47$ = makeString("invalid arg-not-genl-pred index: ~s-~s");
        $ic48$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsaGenl1-2"));
        $ic49$ = makeString("invalid arg-isa-genl-pred index: ~s-~s");
        $ic50$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsaGenl2-1"));
        $ic51$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsaGenl2-3"));
        $ic52$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsaGenl3-2"));
        $ic53$ = makeString("invalid arg-genl-isa-pred index: ~s-~s");
        $ic54$ = constant_handles_oc.f8479((SubLObject)makeString("interArgGenlIsa2-1"));
        $ic55$ = constant_handles_oc.f8479((SubLObject)makeString("TruthFunction"));
        $ic56$ = makeString("Initializing all arg type predicate caches...");
        $ic57$ = constant_handles_oc.f8479((SubLObject)makeString("ArgIsaBinaryPredicate"));
        $ic58$ = constant_handles_oc.f8479((SubLObject)makeString("ArgIsaTernaryPredicate"));
        $ic59$ = constant_handles_oc.f8479((SubLObject)makeString("ArgIsaPredicate"));
        $ic60$ = constant_handles_oc.f8479((SubLObject)makeString("ArgGenlBinaryPredicate"));
        $ic61$ = constant_handles_oc.f8479((SubLObject)makeString("ArgGenlTernaryPredicate"));
        $ic62$ = constant_handles_oc.f8479((SubLObject)makeString("ArgGenlPredicate"));
        $ic63$ = makeSymbol("INTEGERP");
        $ic64$ = constant_handles_oc.f8479((SubLObject)makeString("Collection"));
        $ic65$ = makeKeyword("STRONG-FORT");
        $ic66$ = makeKeyword("ISA");
        $ic67$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic68$ = constant_handles_oc.f8479((SubLObject)makeString("Thing"));
        $ic69$ = makeKeyword("GENLS");
        $ic70$ = makeSymbol("S#3358", "CYC");
        $ic71$ = makeSymbol("CYCL-FORMULA?");
        $ic72$ = makeKeyword("EL-VAR");
        $ic73$ = makeSymbol("S#12279", "CYC");
        $ic74$ = makeSymbol("S#22820", "CYC");
        $ic75$ = makeSymbol("S#17324", "CYC");
        $ic76$ = makeKeyword("TRUE");
        $ic77$ = makeSymbol("S#22918", "CYC");
        $ic78$ = makeSymbol("S#12274", "CYC");
        $ic79$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic80$ = makeString("Initializing #$interArgIsa cache");
        $ic81$ = makeKeyword("GAF");
        $ic82$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic83$ = makeKeyword("DEPTH");
        $ic84$ = makeKeyword("STACK");
        $ic85$ = makeKeyword("QUEUE");
        $ic86$ = makeSymbol("S#11450", "CYC");
        $ic87$ = makeKeyword("ERROR");
        $ic88$ = makeString("~A is not a ~A");
        $ic89$ = makeSymbol("S#11592", "CYC");
        $ic90$ = makeKeyword("CERROR");
        $ic91$ = makeString("continue anyway");
        $ic92$ = makeKeyword("WARN");
        $ic93$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic94$ = makeString("~A is neither SET-P nor LISTP.");
        $ic95$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic96$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic97$ = makeSymbol("S#22919", "CYC");
        $ic98$ = makeString("Initializing #$interArgFormat cache");
        $ic99$ = constant_handles_oc.f8479((SubLObject)makeString("GenericArgTemplate"));
        $ic100$ = constant_handles_oc.f8479((SubLObject)makeString("KeywordVariableTemplate"));
        $ic101$ = makeString("got an arg-type predicate (~s) that's neither binary nor ternary in ~s");
        $ic102$ = makeKeyword("FORMAT");
        $ic103$ = makeKeyword("DIFFERENT");
        $ic104$ = makeKeyword("AT-MAPPING-DONE");
        $ic105$ = makeSymbol("S#22895", "CYC");
        $ic106$ = makeSymbol("S#22894", "CYC");
        $ic107$ = makeString("~%at test fails: ~s fails ~s constraint ~s");
        $ic108$ = makeString("~%at test fails: ~s fails ~s constraint ~s for arg ~s of reln ~s");
        $ic109$ = makeKeyword("IRREFLEXIVE-PREDICATE");
        $ic110$ = makeKeyword("ASYMMETRIC-PREDICATE");
        $ic111$ = makeKeyword("ANTI-SYMMETRIC-PREDICATE");
        $ic112$ = makeKeyword("ANTI-TRANSITIVE-PREDICATE");
        $ic113$ = makeKeyword("NEGATION-PREDS");
        $ic114$ = makeKeyword("NEGATION-INVERSES");
        $ic115$ = makeString("illegal value of *at-mode*: ~s");
        $ic116$ = makeKeyword("PREDICATE-ISA-VIOLATION");
        $ic117$ = makeKeyword("META-PREDICATE-VIOLATION");
        $ic118$ = makeKeyword("MAL-ARG-WRT-COL-DEFN");
        $ic119$ = constant_handles_oc.f8479((SubLObject)makeString("CycLSentence-Assertible"));
        $ic120$ = makeKeyword("MAL-ARG-WRT-NEC-DEFN");
        $ic121$ = makeKeyword("CHANGE-MT");
        $ic122$ = makeSymbol("S#22857", "CYC");
        $ic123$ = makeSymbol("S#22859", "CYC");
        $ic124$ = makeSymbol("S#22860", "CYC");
        $ic125$ = makeKeyword("MAL-ARG-WRT-IFF-DEFN");
        $ic126$ = ConsesLow.listS((SubLObject)makeSymbol("S#202", "CYC"), new SubLObject[] { makeSymbol("S#12457", "CYC"), makeSymbol("S#15200", "CYC"), makeSymbol("S#12455", "CYC"), makeSymbol("S#12453", "CYC"), makeSymbol("S#11445", "CYC"), makeSymbol("S#1625", "CYC") });
        $ic127$ = makeSymbol("S#22924", "CYC");
        $ic128$ = constant_handles_oc.f8479((SubLObject)makeString("CycLAssertion"));
        $ic129$ = makeKeyword("MAL-ARG-WRT-ARG-FORMAT");
        $ic130$ = makeKeyword("MAL-ARG-WRT-INTER-ARG-FORMAT");
        $ic131$ = makeKeyword("REPLACE-TERM");
        $ic132$ = constant_handles_oc.f8479((SubLObject)makeString("ist"));
        $ic133$ = ConsesLow.list((SubLObject)makeSymbol("S#202", "CYC"), (SubLObject)makeSymbol("S#891", "CYC"), (SubLObject)makeSymbol("S#20618", "CYC"), (SubLObject)makeSymbol("FORMAT"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#20624", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#20622", "CYC"));
        $ic134$ = makeKeyword("ASSERT");
        $ic135$ = constant_handles_oc.f8479((SubLObject)makeString("equals"));
        $ic136$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#202", "CYC"), makeSymbol("S#891", "CYC"), makeSymbol("S#20618", "CYC"), makeSymbol("FORMAT"), makeSymbol("S#20619", "CYC"), makeSymbol("S#20620", "CYC"), makeSymbol("S#20621", "CYC"), makeSymbol("S#11445", "CYC"), makeSymbol("S#20624", "CYC"), makeSymbol("&OPTIONAL"), makeSymbol("S#20622", "CYC") });
        $ic137$ = ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("ISA"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#20624", "CYC"));
        $ic138$ = makeKeyword("UNASSERT");
        $ic139$ = makeInteger(40);
        $ic140$ = makeSymbol("CONSTANT-P");
        $ic141$ = makeSymbol(">");
        $ic142$ = makeSymbol("SPEC-CARDINALITY");
        $ic143$ = makeSymbol("S#22876", "CYC");
        $ic144$ = makeSymbol("S#22922", "CYC");
        $ic145$ = makeInteger(64);
        $ic146$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic147$ = constant_handles_oc.f8479((SubLObject)makeString("Microtheory"));
        $ic148$ = makeKeyword("IGNORE");
        $ic149$ = constant_handles_oc.f8479((SubLObject)makeString("Kappa"));
        $ic150$ = makeSymbol("S#12278", "CYC");
        $ic151$ = makeString("~&~S~%  ~S~%  ~s~%");
        $ic152$ = makeString("mapping Cyc arguments");
        $ic153$ = makeSymbol("STRINGP");
        $ic154$ = makeKeyword("SKIP");
        $ic155$ = constant_handles_oc.f8479((SubLObject)makeString("admittedArgument"));
        $ic156$ = constant_handles_oc.f8479((SubLObject)makeString("Function-Denotational"));
        $ic157$ = constant_handles_oc.f8479((SubLObject)makeString("Relation"));
        $ic158$ = makeSymbol("WARN");
        $ic159$ = constant_handles_oc.f8479((SubLObject)makeString("AtemporalNecessarilyEssentialCollectionType"));
        $ic160$ = constant_handles_oc.f8479((SubLObject)makeString("argIsa"));
        $ic161$ = constant_handles_oc.f8479((SubLObject)makeString("argGenl"));
        $ic162$ = makeSymbol("S#17518", "CYC");
        $ic163$ = constant_handles_oc.f8479((SubLObject)makeString("argsIsa"));
        $ic164$ = constant_handles_oc.f8479((SubLObject)makeString("argsGenl"));
        $ic165$ = makeSymbol("RELATION-P");
        $ic166$ = makeSymbol("FORT-P");
        $ic167$ = makeSymbol("POSITIVE-INTEGER-P");
        $ic168$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic169$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Relation")));
        $ic170$ = makeSymbol("S#12629", "CYC");
        $ic171$ = makeSymbol("S#22908", "CYC");
        $ic172$ = makeInteger(100);
        $ic173$ = (SubLFloat)makeDouble(0.01);
        $ic174$ = constant_handles_oc.f8479((SubLObject)makeString("Number-General"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 2070 ms
	
	Decompiled with Procyon 0.5.32.
*/