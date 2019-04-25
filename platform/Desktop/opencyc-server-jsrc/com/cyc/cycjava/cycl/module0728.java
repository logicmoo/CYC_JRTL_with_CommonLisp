package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0728 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0728";
    public static final String myFingerPrint = "9329464778e7ccdfffba2f81d62a40b73994328ad842ec0ecc614a7493887678";
    private static SubLSymbol $g5723$;
    private static SubLSymbol $g5724$;
    private static SubLSymbol $g5725$;
    private static SubLSymbol $g5726$;
    private static SubLSymbol $g5727$;
    private static SubLSymbol $g5728$;
    private static SubLSymbol $g5729$;
    private static SubLSymbol $g5730$;
    private static SubLSymbol $g5731$;
    private static SubLSymbol $g5732$;
    private static SubLSymbol $g5733$;
    private static SubLSymbol $g5734$;
    private static SubLSymbol $g5735$;
    private static SubLSymbol $g5736$;
    private static SubLSymbol $g5737$;
    private static SubLSymbol $g5738$;
    public static SubLSymbol $g5739$;
    private static SubLSymbol $g5740$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLString $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLInteger $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLList $ic33$;
    private static final SubLString $ic34$;
    private static final SubLObject $ic35$;
    private static final SubLList $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLString $ic45$;
    private static final SubLList $ic46$;
    private static final SubLList $ic47$;
    private static final SubLList $ic48$;
    private static final SubLList $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLList $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLList $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLObject $ic90$;
    private static final SubLObject $ic91$;
    private static final SubLObject $ic92$;
    private static final SubLObject $ic93$;
    private static final SubLObject $ic94$;
    private static final SubLObject $ic95$;
    private static final SubLObject $ic96$;
    private static final SubLObject $ic97$;
    private static final SubLList $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLObject $ic103$;
    private static final SubLObject $ic104$;
    private static final SubLString $ic105$;
    private static final SubLObject $ic106$;
    private static final SubLString $ic107$;
    private static final SubLList $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLList $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLInteger $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLList $ic118$;
    private static final SubLString $ic119$;
    private static final SubLString $ic120$;
    private static final SubLString $ic121$;
    private static final SubLString $ic122$;
    private static final SubLString $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLString $ic125$;
    private static final SubLList $ic126$;
    private static final SubLList $ic127$;
    private static final SubLObject $ic128$;
    private static final SubLString $ic129$;
    private static final SubLObject $ic130$;
    private static final SubLObject $ic131$;
    private static final SubLObject $ic132$;
    private static final SubLObject $ic133$;
    private static final SubLObject $ic134$;
    private static final SubLString $ic135$;
    private static final SubLString $ic136$;
    private static final SubLString $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLString $ic141$;
    private static final SubLString $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLString $ic145$;
    private static final SubLString $ic146$;
    private static final SubLString $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLString $ic151$;
    private static final SubLString $ic152$;
    private static final SubLString $ic153$;
    private static final SubLString $ic154$;
    private static final SubLString $ic155$;
    private static final SubLString $ic156$;
    private static final SubLString $ic157$;
    private static final SubLString $ic158$;
    private static final SubLString $ic159$;
    private static final SubLString $ic160$;
    private static final SubLString $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLString $ic164$;
    private static final SubLString $ic165$;
    private static final SubLString $ic166$;
    private static final SubLString $ic167$;
    private static final SubLString $ic168$;
    private static final SubLString $ic169$;
    private static final SubLString $ic170$;
    private static final SubLString $ic171$;
    private static final SubLString $ic172$;
    private static final SubLString $ic173$;
    private static final SubLString $ic174$;
    private static final SubLString $ic175$;
    private static final SubLString $ic176$;
    private static final SubLString $ic177$;
    private static final SubLString $ic178$;
    private static final SubLString $ic179$;
    private static final SubLString $ic180$;
    private static final SubLString $ic181$;
    private static final SubLString $ic182$;
    private static final SubLString $ic183$;
    private static final SubLString $ic184$;
    private static final SubLString $ic185$;
    private static final SubLString $ic186$;
    private static final SubLString $ic187$;
    private static final SubLString $ic188$;
    private static final SubLString $ic189$;
    private static final SubLList $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLObject $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLObject $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLObject $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLObject $ic199$;
    private static final SubLString $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLObject $ic203$;
    private static final SubLObject $ic204$;
    private static final SubLObject $ic205$;
    private static final SubLObject $ic206$;
    private static final SubLObject $ic207$;
    private static final SubLObject $ic208$;
    private static final SubLObject $ic209$;
    private static final SubLObject $ic210$;
    private static final SubLObject $ic211$;
    
    
    public static SubLObject f44426(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0728.NIL;
        SubLObject var5_6;
        SubLObject var3;
        SubLObject var4;
        SubLObject var5;
        for (var3 = (var5_6 = Sequences.length(var1)), var4 = (SubLObject)module0728.NIL, var4 = (SubLObject)module0728.ZERO_INTEGER; !var4.numGE(var5_6); var4 = module0048.f_1X(var4)) {
            var5 = Strings.sublisp_char(var1, var4);
            if ((module0728.NIL != f44427(var5, (SubLObject)module0728.UNPROVIDED) && (var4.isZero() || !var5.equalp((SubLObject)Characters.CHAR_u) || !Strings.sublisp_char(var1, module0048.f_1_(var4)).equalp((SubLObject)Characters.CHAR_q))) || (var5.equalp((SubLObject)Characters.CHAR_y) && module0728.NIL == f44427(module0038.f2631(var1, module0048.f_1_(var4)), (SubLObject)module0728.UNPROVIDED) && module0728.NIL == f44427(module0038.f2631(var1, module0048.f_1X(var4)), (SubLObject)module0728.UNPROVIDED))) {
                var2 = (SubLObject)ConsesLow.cons(var4, var2);
            }
        }
        return Sequences.nreverse(var2);
    }
    
    public static SubLObject f44428(final SubLObject var1) {
        final SubLObject var2 = f44426(var1);
        SubLObject var3 = (SubLObject)module0728.ZERO_INTEGER;
        SubLObject var4 = var2;
        SubLObject var5 = (SubLObject)module0728.NIL;
        var5 = var4.first();
        while (module0728.NIL != var4) {
            if ((module0728.NIL == module0004.f104(module0048.f_1_(var5), var2, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED) || module0728.NIL == conses_high.member(module0038.f2623(var1, module0048.f_1_(var5), module0048.f_1X(var5)), module0728.$g5724$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0728.EQUAL), (SubLObject)module0728.UNPROVIDED)) && (!Strings.sublisp_char(var1, var5).equalp((SubLObject)Characters.CHAR_e) || (module0728.NIL == module0035.f1995(var1, module0048.f_1X(var5), (SubLObject)module0728.UNPROVIDED) && module0728.NIL == module0038.f2760(Strings.sublisp_char(var1, module0048.f_1X(var5))) && !module0038.f2623(var1, module0048.f_1X(var5), (SubLObject)module0728.UNPROVIDED).equalp((SubLObject)module0728.$ic12$)))) {
                var3 = Numbers.add(var3, (SubLObject)module0728.ONE_INTEGER);
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        return var3;
    }
    
    public static SubLObject f44429(final SubLObject var1) {
        return Equality.equal(f44428(var1), (SubLObject)module0728.ONE_INTEGER);
    }
    
    public static SubLObject f44430(final SubLObject var1, SubLObject var13) {
        if (var13 == module0728.UNPROVIDED) {
            var13 = (SubLObject)module0728.TWO_INTEGER;
        }
        return Numbers.numGE(f44428(var1), var13);
    }
    
    public static SubLObject f44427(final SubLObject var14, SubLObject var15) {
        if (var15 == module0728.UNPROVIDED) {
            var15 = (SubLObject)module0728.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0728.NIL != Sequences.find(var14, module0728.$g5723$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0728.EQUALP), (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED) || (module0728.NIL != var15 && var14.equalp((SubLObject)Characters.CHAR_y)));
    }
    
    public static SubLObject f44431(final SubLObject var14) {
        return module0035.sublisp_boolean(Sequences.find(var14, module0728.$g5726$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0728.EQUALP), (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED));
    }
    
    public static SubLObject f44432(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0728.NIL;
        SubLObject var5_16;
        SubLObject var3;
        SubLObject var4;
        SubLObject var5;
        SubLObject var6;
        for (var3 = (var5_16 = Sequences.length(var1)), var4 = (SubLObject)module0728.NIL, var4 = (SubLObject)module0728.ZERO_INTEGER; !var4.numGE(var5_16); var4 = module0048.f_1X(var4)) {
            var5 = Strings.sublisp_char(var1, var4);
            if (module0728.NIL != f44431(var5)) {
                var6 = var4;
                if (module0728.NIL == conses_high.member(var6, var2, Symbols.symbol_function((SubLObject)module0728.EQL), Symbols.symbol_function((SubLObject)module0728.IDENTITY))) {
                    var2 = (SubLObject)ConsesLow.cons(var6, var2);
                }
            }
        }
        return Sequences.nreverse(var2);
    }
    
    public static SubLObject f44433(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0728.NIL != module0035.f2002(var1, (SubLObject)module0728.ZERO_INTEGER, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != f44427(module0038.f2637(var1), (SubLObject)module0728.T));
    }
    
    public static SubLObject f44434(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0728.NIL != module0035.f2002(var1, (SubLObject)module0728.ZERO_INTEGER, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != f44427(Strings.sublisp_char(var1, (SubLObject)module0728.ZERO_INTEGER), (SubLObject)module0728.UNPROVIDED));
    }
    
    public static SubLObject f44435(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0728.NIL != module0035.f2002(var1, (SubLObject)module0728.ZERO_INTEGER, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != f44431(module0038.f2637(var1)));
    }
    
    public static SubLObject f44436(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0728.NIL != module0035.f2002(var1, (SubLObject)module0728.ZERO_INTEGER, (SubLObject)module0728.UNPROVIDED) && (module0728.NIL != f44431(Strings.sublisp_char(var1, (SubLObject)module0728.ZERO_INTEGER)) || module0728.NIL != Sequences.find(Strings.sublisp_char(var1, (SubLObject)module0728.ZERO_INTEGER), (SubLObject)module0728.$ic13$, Symbols.symbol_function((SubLObject)module0728.EQUALP), (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED) || (Strings.sublisp_char(var1, (SubLObject)module0728.ZERO_INTEGER).equalp((SubLObject)Characters.CHAR_y) && module0728.NIL != f44427(Strings.sublisp_char(var1, (SubLObject)module0728.ONE_INTEGER), (SubLObject)module0728.UNPROVIDED))));
    }
    
    public static SubLObject f44437(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0728.NIL;
        final SubLObject var3 = Sequences.reverse(var1);
        var2 = (SubLObject)SubLObjectFactory.makeBoolean(module0728.NIL != module0035.f2002(var1, (SubLObject)module0728.ONE_INTEGER, (SubLObject)module0728.UNPROVIDED) && module0728.NIL == f44427(Strings.sublisp_char(var3, (SubLObject)module0728.ZERO_INTEGER), (SubLObject)module0728.UNPROVIDED) && module0728.NIL != f44427(Strings.sublisp_char(var3, (SubLObject)module0728.ONE_INTEGER), (SubLObject)module0728.T));
        return var2;
    }
    
    public static SubLObject f44438(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0728.NIL != module0035.f2002(var1, (SubLObject)module0728.ZERO_INTEGER, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != Sequences.find(module0038.f2637(var1), module0728.$g5727$.getGlobalValue(), (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED));
    }
    
    public static SubLObject f44439(final SubLObject var1) {
        SubLObject var2 = module0728.$g5728$.getGlobalValue();
        SubLObject var3 = (SubLObject)module0728.NIL;
        var3 = var2.first();
        while (module0728.NIL != var2) {
            if (module0728.NIL != module0038.f2684(var1, var3)) {
                return (SubLObject)module0728.T;
            }
            var2 = var2.rest();
            var3 = var2.first();
        }
        return (SubLObject)module0728.NIL;
    }
    
    public static SubLObject f44440(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0728.NIL;
        final SubLObject var3 = Sequences.reverse(var1);
        var2 = (SubLObject)SubLObjectFactory.makeBoolean(module0728.NIL != module0035.f2002(var1, (SubLObject)module0728.TWO_INTEGER, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != f44431(Strings.sublisp_char(var3, (SubLObject)module0728.ZERO_INTEGER)) && module0728.NIL != f44427(Strings.sublisp_char(var3, (SubLObject)module0728.ONE_INTEGER), (SubLObject)module0728.UNPROVIDED) && module0728.NIL == f44427(Strings.sublisp_char(var3, (SubLObject)module0728.TWO_INTEGER), (SubLObject)module0728.UNPROVIDED));
        return var2;
    }
    
    public static SubLObject f44441(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0728.NIL;
        final SubLObject var3 = Sequences.reverse(var1);
        var2 = (SubLObject)SubLObjectFactory.makeBoolean(module0728.NIL != module0035.f2002(var1, (SubLObject)module0728.THREE_INTEGER, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != Sequences.find(Strings.sublisp_char(var3, (SubLObject)module0728.THREE_INTEGER), (SubLObject)module0728.$ic14$, Symbols.symbol_function((SubLObject)module0728.EQUALP), (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != Sequences.find(Strings.sublisp_char(var3, (SubLObject)module0728.TWO_INTEGER), (SubLObject)module0728.$ic15$, Symbols.symbol_function((SubLObject)module0728.EQUALP), (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != f44431(Strings.sublisp_char(var3, (SubLObject)module0728.ZERO_INTEGER)) && module0728.NIL != f44427(Strings.sublisp_char(var3, (SubLObject)module0728.ONE_INTEGER), (SubLObject)module0728.UNPROVIDED));
        return var2;
    }
    
    public static SubLObject f44442(final SubLObject var1, final SubLObject var22) {
        if (module0728.NIL != module0035.f2002(var1, var22, (SubLObject)module0728.UNPROVIDED)) {
            return module0038.f2672(module0038.f2623(var1, var22, module0048.f_1X(var22)), var1, var22);
        }
        return (SubLObject)module0728.NIL;
    }
    
    public static SubLObject f44443(final SubLObject var1) {
        return f44442(var1, module0048.f_1_(Sequences.length(var1)));
    }
    
    public static SubLObject f44444(final SubLObject var23, final SubLObject var24) {
        if (module0728.NIL != module0038.f2807(var23)) {
            return Strings.string_downcase(var24, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED);
        }
        if (module0728.NIL != module0038.f2806(var23)) {
            return Strings.string_upcase(var24, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED);
        }
        if (module0728.NIL != module0038.f2777(var23)) {
            return Strings.string_capitalize(var24, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED);
        }
        return var24;
    }
    
    public static SubLObject f44445(final SubLObject var25) {
        if (var25.eql(module0728.$ic16$)) {
            return Symbols.symbol_function((SubLObject)module0728.$ic17$);
        }
        if (var25.eql(module0728.$ic18$)) {
            return Symbols.symbol_function((SubLObject)module0728.$ic19$);
        }
        if (var25.eql(module0728.$ic20$)) {
            return Symbols.symbol_function((SubLObject)module0728.$ic21$);
        }
        if (var25.eql(module0728.$ic22$)) {
            return Symbols.symbol_function((SubLObject)module0728.$ic23$);
        }
        return Symbols.symbol_function((SubLObject)module0728.IDENTITY);
    }
    
    public static SubLObject f44446(final SubLObject var25, SubLObject var27) {
        if (var27 == module0728.UNPROVIDED) {
            var27 = module0584.$g4396$.getDynamicValue();
        }
        assert module0728.NIL != module0173.f10955(var25) : var25;
        return (SubLObject)((module0728.NIL != module0731.f44690(var25, var27)) ? f44447(var25, var27, (SubLObject)module0728.UNPROVIDED) : module0728.NIL);
    }
    
    public static SubLObject f44448() {
        final SubLObject var28 = module0728.$g5732$.getGlobalValue();
        if (module0728.NIL != var28) {
            module0034.f1818(var28);
        }
        return (SubLObject)module0728.NIL;
    }
    
    public static SubLObject f44449(final SubLObject var25, final SubLObject var27, SubLObject var29) {
        if (var29 == module0728.UNPROVIDED) {
            var29 = (SubLObject)module0728.NIL;
        }
        return module0034.f1829(module0728.$g5732$.getGlobalValue(), (SubLObject)ConsesLow.list(var25, var27, var29), (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED);
    }
    
    public static SubLObject f44450(final SubLObject var25, final SubLObject var27, SubLObject var29) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        final SubLObject var31 = module0147.$g2094$.currentBinding(var30);
        final SubLObject var32 = module0147.$g2095$.currentBinding(var30);
        try {
            module0147.$g2094$.bind((SubLObject)module0728.$ic26$, var30);
            module0147.$g2095$.bind(var27, var30);
            SubLObject var33 = module0220.f14562(var25, module0728.$ic27$, (SubLObject)module0728.TWO_INTEGER, (SubLObject)module0728.ONE_INTEGER, (SubLObject)module0728.UNPROVIDED);
            SubLObject var34 = (SubLObject)module0728.NIL;
            var34 = var33.first();
            while (module0728.NIL != var33) {
                if (module0728.NIL == module0004.f104(var34, var29, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED)) {
                    var29 = (SubLObject)ConsesLow.cons(var34, var29);
                    SubLObject var11_34 = f44447(var34, var27, var29);
                    SubLObject var35 = (SubLObject)module0728.NIL;
                    var35 = var11_34.first();
                    while (module0728.NIL != var11_34) {
                        final SubLObject var36 = var35;
                        if (module0728.NIL == conses_high.member(var36, var29, Symbols.symbol_function((SubLObject)module0728.EQL), Symbols.symbol_function((SubLObject)module0728.IDENTITY))) {
                            var29 = (SubLObject)ConsesLow.cons(var36, var29);
                        }
                        var11_34 = var11_34.rest();
                        var35 = var11_34.first();
                    }
                }
                var33 = var33.rest();
                var34 = var33.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var32, var30);
            module0147.$g2094$.rebind(var31, var30);
        }
        return var29;
    }
    
    public static SubLObject f44447(final SubLObject var25, final SubLObject var27, SubLObject var29) {
        if (var29 == module0728.UNPROVIDED) {
            var29 = (SubLObject)module0728.NIL;
        }
        SubLObject var30 = module0728.$g5732$.getGlobalValue();
        if (module0728.NIL == var30) {
            var30 = module0034.f1934((SubLObject)module0728.$ic25$, (SubLObject)module0728.$ic28$, (SubLObject)module0728.NIL, (SubLObject)module0728.EQL, (SubLObject)module0728.THREE_INTEGER, (SubLObject)module0728.$ic29$);
        }
        final SubLObject var31 = module0034.f1781(var25, var27, var29);
        final SubLObject var32 = module0034.f1814(var30, var31, (SubLObject)module0728.UNPROVIDED);
        if (var32 != module0728.$ic30$) {
            SubLObject var33 = var32;
            SubLObject var34 = (SubLObject)module0728.NIL;
            var34 = var33.first();
            while (module0728.NIL != var33) {
                SubLObject var35 = var34.first();
                final SubLObject var36 = conses_high.second(var34);
                if (var25.eql(var35.first())) {
                    var35 = var35.rest();
                    if (var27.eql(var35.first())) {
                        var35 = var35.rest();
                        if (module0728.NIL != var35 && module0728.NIL == var35.rest() && var29.eql(var35.first())) {
                            return module0034.f1959(var36);
                        }
                    }
                }
                var33 = var33.rest();
                var34 = var33.first();
            }
        }
        final SubLObject var37 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44450(var25, var27, var29)));
        module0034.f1836(var30, var31, var32, var37, (SubLObject)ConsesLow.list(var25, var27, var29));
        return module0034.f1959(var37);
    }
    
    public static SubLObject f44451(final SubLObject var25) {
        if (module0728.NIL == f44452(var25, (SubLObject)module0728.UNPROVIDED)) {
            return (SubLObject)module0728.NIL;
        }
        SubLObject var26 = (SubLObject)module0728.NIL;
        final SubLObject var27 = module0731.f44691(var25);
        final SubLObject var28 = module0732.f44924(var27, (SubLObject)module0728.UNPROVIDED);
        if (module0728.NIL == var26) {
            SubLObject var29 = var28;
            SubLObject var30 = (SubLObject)module0728.NIL;
            var30 = var29.first();
            while (module0728.NIL == var26 && module0728.NIL != var29) {
                if (module0728.NIL != f44453(var30, (SubLObject)module0728.UNPROVIDED)) {
                    var26 = var30;
                }
                var29 = var29.rest();
                var30 = var29.first();
            }
        }
        return var26;
    }
    
    public static SubLObject f44452(final SubLObject var25, SubLObject var27) {
        if (var27 == module0728.UNPROVIDED) {
            var27 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)module0728.NIL;
        final SubLObject var30 = var27;
        final SubLObject var31 = module0147.$g2094$.currentBinding(var28);
        final SubLObject var32 = module0147.$g2095$.currentBinding(var28);
        try {
            module0147.$g2094$.bind(module0147.f9531(var30), var28);
            module0147.$g2095$.bind(module0147.f9534(var30), var28);
            var29 = (SubLObject)SubLObjectFactory.makeBoolean(module0728.NIL != module0173.f10955(var25) && module0728.NIL != module0260.f17091(var25, module0728.$ic31$, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED));
        }
        finally {
            module0147.$g2095$.rebind(var32, var28);
            module0147.$g2094$.rebind(var31, var28);
        }
        return var29;
    }
    
    public static SubLObject f44453(final SubLObject var25, SubLObject var27) {
        if (var27 == module0728.UNPROVIDED) {
            var27 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)module0728.NIL;
        final SubLObject var30 = var27;
        final SubLObject var31 = module0147.$g2094$.currentBinding(var28);
        final SubLObject var32 = module0147.$g2095$.currentBinding(var28);
        try {
            module0147.$g2094$.bind(module0147.f9531(var30), var28);
            module0147.$g2095$.bind(module0147.f9534(var30), var28);
            var29 = (SubLObject)SubLObjectFactory.makeBoolean(module0728.NIL != module0173.f10955(var25) && module0728.NIL != module0260.f17091(var25, module0728.$ic32$, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED));
        }
        finally {
            module0147.$g2095$.rebind(var32, var28);
            module0147.$g2094$.rebind(var31, var28);
        }
        return var29;
    }
    
    public static SubLObject f44454(final SubLObject var46, final SubLObject var25) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        SubLObject var48 = (SubLObject)module0728.NIL;
        if (module0728.NIL != Sequences.find(var25, (SubLObject)module0728.$ic33$, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED)) {
            final SubLObject var49 = module0147.$g2094$.currentBinding(var47);
            final SubLObject var50 = module0147.$g2095$.currentBinding(var47);
            try {
                module0147.$g2094$.bind((SubLObject)module0728.$ic26$, var47);
                module0147.$g2095$.bind(module0584.$g4396$.getDynamicValue(var47), var47);
                final SubLObject var51 = f44451(var25);
                final SubLObject var52 = (SubLObject)((module0728.NIL != var51) ? module0220.f14553(var46, var51, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED) : module0728.NIL);
                if (module0728.NIL != var52) {
                    var48 = Sequences.cconcatenate(var52, (SubLObject)module0728.$ic34$);
                }
            }
            finally {
                module0147.$g2095$.rebind(var50, var47);
                module0147.$g2094$.rebind(var49, var47);
            }
        }
        return var48;
    }
    
    public static SubLObject f44455(final SubLObject var25) {
        return module0219.f14510(var25, (SubLObject)module0728.ONE_INTEGER, module0728.$ic27$, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED);
    }
    
    public static SubLObject f44456(final SubLObject var49, final SubLObject var50, final SubLObject var51, SubLObject var52) {
        if (var52 == module0728.UNPROVIDED) {
            var52 = module0728.$ic35$;
        }
        return f44457(var49, var50, var51, var52, (SubLObject)module0728.T, (SubLObject)module0728.UNPROVIDED).first();
    }
    
    public static SubLObject f44457(final SubLObject var49, final SubLObject var50, final SubLObject var51, SubLObject var52, SubLObject var53, SubLObject var54) {
        if (var52 == module0728.UNPROVIDED) {
            var52 = module0728.$ic35$;
        }
        if (var53 == module0728.UNPROVIDED) {
            var53 = (SubLObject)module0728.NIL;
        }
        if (var54 == module0728.UNPROVIDED) {
            var54 = (SubLObject)module0728.NIL;
        }
        if (module0728.NIL != module0004.f104(var50, (SubLObject)module0728.$ic36$, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != conses_high.member(var49, (SubLObject)module0728.$ic37$, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED)) {
            final SubLObject var55 = f44445(var49);
            final SubLObject var56 = Functions.funcall(var55, var51);
            return (SubLObject)ConsesLow.list(var56);
        }
        return f44458(var49, var50, var51, var52, var53, var54);
    }
    
    public static SubLObject f44458(final SubLObject var49, final SubLObject var50, final SubLObject var51, final SubLObject var52, final SubLObject var53, final SubLObject var54) {
        final SubLThread var55 = SubLProcess.currentSubLThread();
        SubLObject var56 = (SubLObject)module0728.NIL;
        SubLObject var57 = (SubLObject)module0728.NIL;
        if (module0728.NIL != module0147.f9491(var52, (SubLObject)module0728.$ic38$)) {
            final SubLObject var58 = module0147.$g2094$.currentBinding(var55);
            final SubLObject var59 = module0147.$g2095$.currentBinding(var55);
            try {
                module0147.$g2094$.bind((SubLObject)module0728.$ic38$, var55);
                module0147.$g2095$.bind(module0728.$ic39$, var55);
                if (module0728.NIL == var57) {
                    SubLObject var60 = f44455(var49);
                    SubLObject var61 = (SubLObject)module0728.NIL;
                    var61 = var60.first();
                    while (module0728.NIL == var57 && module0728.NIL != var60) {
                        SubLObject var63;
                        final SubLObject var62 = var63 = module0178.f11330(var61).rest();
                        SubLObject var64 = (SubLObject)module0728.NIL;
                        SubLObject var65 = (SubLObject)module0728.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)module0728.$ic40$);
                        var64 = var63.first();
                        var63 = var63.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)module0728.$ic40$);
                        var65 = var63.first();
                        var63 = var63.rest();
                        if (module0728.NIL == var63) {
                            if (var64.eql(var50)) {
                                final SubLObject var66 = f44459(var51, var65);
                                if (module0728.NIL == conses_high.member(var66, var56, Symbols.symbol_function((SubLObject)module0728.EQL), Symbols.symbol_function((SubLObject)module0728.IDENTITY))) {
                                    var56 = (SubLObject)ConsesLow.cons(var66, var56);
                                }
                                var57 = var53;
                            }
                            else if (module0728.NIL == module0004.f104((SubLObject)ConsesLow.list(var64, var50), var54, Symbols.symbol_function((SubLObject)module0728.EQUAL), (SubLObject)module0728.UNPROVIDED)) {
                                final SubLObject var67 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var64, var50), var54);
                                final SubLObject var68 = f44457(var64, var50, var51, var52, (SubLObject)module0728.NIL, var67);
                                if (module0728.NIL == var57) {
                                    SubLObject var20_66 = var68;
                                    SubLObject var69 = (SubLObject)module0728.NIL;
                                    var69 = var20_66.first();
                                    while (module0728.NIL == var57 && module0728.NIL != var20_66) {
                                        final SubLObject var70 = f44459(var69, var65);
                                        if (module0728.NIL == conses_high.member(var70, var56, Symbols.symbol_function((SubLObject)module0728.EQL), Symbols.symbol_function((SubLObject)module0728.IDENTITY))) {
                                            var56 = (SubLObject)ConsesLow.cons(var70, var56);
                                        }
                                        var57 = var53;
                                        var20_66 = var20_66.rest();
                                        var69 = var20_66.first();
                                    }
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var62, (SubLObject)module0728.$ic40$);
                        }
                        var60 = var60.rest();
                        var61 = var60.first();
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var59, var55);
                module0147.$g2094$.rebind(var58, var55);
            }
        }
        else if (module0728.NIL != module0147.f9491(var52, (SubLObject)module0728.$ic41$)) {
            final SubLObject var58 = module0147.$g2094$.currentBinding(var55);
            final SubLObject var59 = module0147.$g2095$.currentBinding(var55);
            try {
                module0147.$g2094$.bind((SubLObject)module0728.$ic41$, var55);
                module0147.$g2095$.bind(module0728.$ic42$, var55);
                if (module0728.NIL == var57) {
                    SubLObject var60 = f44455(var49);
                    SubLObject var61 = (SubLObject)module0728.NIL;
                    var61 = var60.first();
                    while (module0728.NIL == var57 && module0728.NIL != var60) {
                        SubLObject var72;
                        final SubLObject var71 = var72 = module0178.f11330(var61).rest();
                        SubLObject var64 = (SubLObject)module0728.NIL;
                        SubLObject var65 = (SubLObject)module0728.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var72, var71, (SubLObject)module0728.$ic40$);
                        var64 = var72.first();
                        var72 = var72.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var72, var71, (SubLObject)module0728.$ic40$);
                        var65 = var72.first();
                        var72 = var72.rest();
                        if (module0728.NIL == var72) {
                            if (var64.eql(var50)) {
                                final SubLObject var66 = f44459(var51, var65);
                                if (module0728.NIL == conses_high.member(var66, var56, Symbols.symbol_function((SubLObject)module0728.EQL), Symbols.symbol_function((SubLObject)module0728.IDENTITY))) {
                                    var56 = (SubLObject)ConsesLow.cons(var66, var56);
                                }
                                var57 = var53;
                            }
                            else if (module0728.NIL == module0004.f104((SubLObject)ConsesLow.list(var64, var50), var54, Symbols.symbol_function((SubLObject)module0728.EQUAL), (SubLObject)module0728.UNPROVIDED)) {
                                final SubLObject var67 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var64, var50), var54);
                                final SubLObject var68 = f44457(var64, var50, var51, var52, (SubLObject)module0728.NIL, var67);
                                if (module0728.NIL == var57) {
                                    SubLObject var20_67 = var68;
                                    SubLObject var69 = (SubLObject)module0728.NIL;
                                    var69 = var20_67.first();
                                    while (module0728.NIL == var57 && module0728.NIL != var20_67) {
                                        final SubLObject var70 = f44459(var69, var65);
                                        if (module0728.NIL == conses_high.member(var70, var56, Symbols.symbol_function((SubLObject)module0728.EQL), Symbols.symbol_function((SubLObject)module0728.IDENTITY))) {
                                            var56 = (SubLObject)ConsesLow.cons(var70, var56);
                                        }
                                        var57 = var53;
                                        var20_67 = var20_67.rest();
                                        var69 = var20_67.first();
                                    }
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var71, (SubLObject)module0728.$ic40$);
                        }
                        var60 = var60.rest();
                        var61 = var60.first();
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var59, var55);
                module0147.$g2094$.rebind(var58, var55);
            }
        }
        else if (module0728.NIL != module0161.f10488(var52)) {
            final SubLObject var58 = module0147.$g2094$.currentBinding(var55);
            final SubLObject var59 = module0147.$g2096$.currentBinding(var55);
            try {
                module0147.$g2094$.bind((SubLObject)module0728.$ic43$, var55);
                module0147.$g2096$.bind(module0161.f10522(var52), var55);
                if (module0728.NIL == var57) {
                    SubLObject var60 = f44455(var49);
                    SubLObject var61 = (SubLObject)module0728.NIL;
                    var61 = var60.first();
                    while (module0728.NIL == var57 && module0728.NIL != var60) {
                        SubLObject var74;
                        final SubLObject var73 = var74 = module0178.f11330(var61).rest();
                        SubLObject var64 = (SubLObject)module0728.NIL;
                        SubLObject var65 = (SubLObject)module0728.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var74, var73, (SubLObject)module0728.$ic40$);
                        var64 = var74.first();
                        var74 = var74.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var74, var73, (SubLObject)module0728.$ic40$);
                        var65 = var74.first();
                        var74 = var74.rest();
                        if (module0728.NIL == var74) {
                            if (var64.eql(var50)) {
                                final SubLObject var66 = f44459(var51, var65);
                                if (module0728.NIL == conses_high.member(var66, var56, Symbols.symbol_function((SubLObject)module0728.EQL), Symbols.symbol_function((SubLObject)module0728.IDENTITY))) {
                                    var56 = (SubLObject)ConsesLow.cons(var66, var56);
                                }
                                var57 = var53;
                            }
                            else if (module0728.NIL == module0004.f104((SubLObject)ConsesLow.list(var64, var50), var54, Symbols.symbol_function((SubLObject)module0728.EQUAL), (SubLObject)module0728.UNPROVIDED)) {
                                final SubLObject var67 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var64, var50), var54);
                                final SubLObject var68 = f44457(var64, var50, var51, var52, (SubLObject)module0728.NIL, var67);
                                if (module0728.NIL == var57) {
                                    SubLObject var20_68 = var68;
                                    SubLObject var69 = (SubLObject)module0728.NIL;
                                    var69 = var20_68.first();
                                    while (module0728.NIL == var57 && module0728.NIL != var20_68) {
                                        final SubLObject var70 = f44459(var69, var65);
                                        if (module0728.NIL == conses_high.member(var70, var56, Symbols.symbol_function((SubLObject)module0728.EQL), Symbols.symbol_function((SubLObject)module0728.IDENTITY))) {
                                            var56 = (SubLObject)ConsesLow.cons(var70, var56);
                                        }
                                        var57 = var53;
                                        var20_68 = var20_68.rest();
                                        var69 = var20_68.first();
                                    }
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var73, (SubLObject)module0728.$ic40$);
                        }
                        var60 = var60.rest();
                        var61 = var60.first();
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var59, var55);
                module0147.$g2094$.rebind(var58, var55);
            }
        }
        else {
            final SubLObject var58 = module0147.$g2094$.currentBinding(var55);
            final SubLObject var59 = module0147.$g2095$.currentBinding(var55);
            try {
                module0147.$g2094$.bind((SubLObject)module0728.$ic26$, var55);
                module0147.$g2095$.bind(var52, var55);
                if (module0728.NIL == var57) {
                    SubLObject var60 = f44455(var49);
                    SubLObject var61 = (SubLObject)module0728.NIL;
                    var61 = var60.first();
                    while (module0728.NIL == var57 && module0728.NIL != var60) {
                        SubLObject var76;
                        final SubLObject var75 = var76 = module0178.f11330(var61).rest();
                        SubLObject var64 = (SubLObject)module0728.NIL;
                        SubLObject var65 = (SubLObject)module0728.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var76, var75, (SubLObject)module0728.$ic40$);
                        var64 = var76.first();
                        var76 = var76.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var76, var75, (SubLObject)module0728.$ic40$);
                        var65 = var76.first();
                        var76 = var76.rest();
                        if (module0728.NIL == var76) {
                            if (var64.eql(var50)) {
                                final SubLObject var66 = f44459(var51, var65);
                                if (module0728.NIL == conses_high.member(var66, var56, Symbols.symbol_function((SubLObject)module0728.EQL), Symbols.symbol_function((SubLObject)module0728.IDENTITY))) {
                                    var56 = (SubLObject)ConsesLow.cons(var66, var56);
                                }
                                var57 = var53;
                            }
                            else if (module0728.NIL == module0004.f104((SubLObject)ConsesLow.list(var64, var50), var54, Symbols.symbol_function((SubLObject)module0728.EQUAL), (SubLObject)module0728.UNPROVIDED)) {
                                final SubLObject var67 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var64, var50), var54);
                                final SubLObject var68 = f44457(var64, var50, var51, var52, (SubLObject)module0728.NIL, var67);
                                if (module0728.NIL == var57) {
                                    SubLObject var20_69 = var68;
                                    SubLObject var69 = (SubLObject)module0728.NIL;
                                    var69 = var20_69.first();
                                    while (module0728.NIL == var57 && module0728.NIL != var20_69) {
                                        final SubLObject var70 = f44459(var69, var65);
                                        if (module0728.NIL == conses_high.member(var70, var56, Symbols.symbol_function((SubLObject)module0728.EQL), Symbols.symbol_function((SubLObject)module0728.IDENTITY))) {
                                            var56 = (SubLObject)ConsesLow.cons(var70, var56);
                                        }
                                        var57 = var53;
                                        var20_69 = var20_69.rest();
                                        var69 = var20_69.first();
                                    }
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var75, (SubLObject)module0728.$ic40$);
                        }
                        var60 = var60.rest();
                        var61 = var60.first();
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var59, var55);
                module0147.$g2094$.rebind(var58, var55);
            }
        }
        return var56;
    }
    
    public static SubLObject f44459(SubLObject var77, SubLObject var63) {
        final SubLThread var78 = SubLProcess.currentSubLThread();
        assert module0728.NIL != module0209.f13550(var77) : var77;
        assert module0728.NIL != module0209.f13550(var63) : var63;
        if (var63.equal((SubLObject)module0728.$ic45$)) {
            return var77;
        }
        var78.resetMultipleValues();
        final SubLObject var78_79 = f44460(var77, var63);
        final SubLObject var80_81 = var78.secondMultipleValue();
        var78.resetMultipleValues();
        var77 = var78_79;
        var63 = var80_81;
        return module0038.f2634(var77, var63);
    }
    
    public static SubLObject f44460(final SubLObject var77, final SubLObject var63) {
        final SubLThread var78 = SubLProcess.currentSubLThread();
        SubLObject var79 = var63;
        SubLObject var80 = var77;
        SubLObject var81 = (SubLObject)module0728.NIL;
        SubLObject var82 = f44461();
        SubLObject var83 = (SubLObject)module0728.NIL;
        var83 = var82.first();
        while (module0728.NIL != var82) {
            SubLObject var85;
            final SubLObject var84 = var85 = var83;
            SubLObject var86 = (SubLObject)module0728.NIL;
            SubLObject var87 = (SubLObject)module0728.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0728.$ic46$);
            var86 = var85.first();
            var85 = (var87 = var85.rest());
            var78.resetMultipleValues();
            final SubLObject var88 = f44462(var80, var79, var86, var87);
            final SubLObject var89 = var78.secondMultipleValue();
            final SubLObject var90 = var78.thirdMultipleValue();
            var78.resetMultipleValues();
            if (module0728.NIL != var90) {
                var81 = (SubLObject)ConsesLow.cons(var86, var81);
                var80 = var88;
                var79 = var89;
            }
            var82 = var82.rest();
            var83 = var82.first();
        }
        return Values.values(var80, var79, var81);
    }
    
    public static SubLObject f44461() {
        return module0728.$g5733$.getGlobalValue();
    }
    
    public static SubLObject f44462(final SubLObject var77, final SubLObject var63, final SubLObject var88, final SubLObject var89) {
        final SubLThread var90 = SubLProcess.currentSubLThread();
        SubLObject var91 = var63;
        SubLObject var92 = var77;
        final SubLObject var93 = conses_high.member(var89, (SubLObject)module0728.$ic48$, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED);
        final SubLObject var94 = conses_high.member(var89, (SubLObject)module0728.$ic49$, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED);
        if (module0728.NIL != var93 && module0728.NIL != var94) {
            var90.resetMultipleValues();
            final SubLObject var95_96 = Functions.funcall(var88, var77, var63);
            final SubLObject var97_98 = var90.secondMultipleValue();
            var90.resetMultipleValues();
            var92 = var95_96;
            var91 = var97_98;
        }
        else if (module0728.NIL != var93) {
            var92 = Functions.funcall(var88, var77, var63);
        }
        else if (module0728.NIL != var94) {
            var91 = Functions.funcall(var88, var77, var63);
        }
        final SubLObject var95 = (SubLObject)SubLObjectFactory.makeBoolean(!var77.equal(var92) || !var63.equal(var91));
        return Values.values(var92, var91, var95);
    }
    
    public static SubLObject f44463(final SubLObject var1) {
        return module0038.f2679(var1, module0728.$g5725$.getGlobalValue());
    }
    
    public static SubLObject f44464(final SubLObject var77, SubLObject var63) {
        if (module0728.NIL != f44463(var77) && module0728.NIL != module0038.f2684(var63, (SubLObject)module0728.$ic50$)) {
            var63 = Sequences.cconcatenate((SubLObject)module0728.$ic51$, var63);
        }
        return var63;
    }
    
    public static SubLObject f44465(final SubLObject var77, SubLObject var63) {
        if (var63.equal((SubLObject)module0728.$ic52$) && module0728.NIL != module0038.f2679(var77, (SubLObject)module0728.$ic53$)) {
            var63 = (SubLObject)module0728.$ic54$;
        }
        return var63;
    }
    
    public static SubLObject f44466(SubLObject var77, SubLObject var63) {
        if (module0728.NIL != module0038.f2673(var77, (SubLObject)module0728.$ic11$, (SubLObject)module0728.UNPROVIDED) && module0728.NIL == module0038.f2684(var63, (SubLObject)module0728.$ic55$) && module0728.NIL == f44433(module0038.f2677(var77, (SubLObject)module0728.UNPROVIDED))) {
            var77 = Sequences.cconcatenate(module0038.f2677(var77, (SubLObject)module0728.UNPROVIDED), (SubLObject)module0728.$ic55$);
            if (module0728.NIL != module0035.f1995(var63, (SubLObject)module0728.ONE_INTEGER, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != f44436(var63)) {
                var63 = Sequences.cconcatenate((SubLObject)module0728.$ic51$, var63);
            }
        }
        return Values.values(var77, var63);
    }
    
    public static SubLObject f44467(SubLObject var77, final SubLObject var63) {
        if (var63.equalp((SubLObject)module0728.$ic56$) && module0728.NIL != module0038.f2673(var77, (SubLObject)module0728.$ic57$, (SubLObject)module0728.UNPROVIDED)) {
            var77 = Sequences.cconcatenate(module0038.f2677(var77, (SubLObject)module0728.TWO_INTEGER), (SubLObject)module0728.$ic58$);
        }
        return var77;
    }
    
    public static SubLObject f44468(SubLObject var77, final SubLObject var63) {
        if (module0728.NIL != module0038.f2684(var63, (SubLObject)module0728.$ic59$) && module0728.NIL != module0038.f2673(module0038.f2677(var77, (SubLObject)module0728.UNPROVIDED), (SubLObject)module0728.$ic60$, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != f44435(var77)) {
            var77 = Sequences.cconcatenate(module0006.f203(module0038.f2677(var77, (SubLObject)module0728.TWO_INTEGER)), module0006.f203(module0038.f2637(var77)));
        }
        return var77;
    }
    
    public static SubLObject f44469(SubLObject var77, final SubLObject var63) {
        if (module0728.NIL != module0035.f2002(var77, (SubLObject)module0728.ONE_INTEGER, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != module0038.f2673(var77, (SubLObject)module0728.$ic51$, (SubLObject)module0728.UNPROVIDED) && (module0728.NIL != module0038.f2684(var63, (SubLObject)module0728.$ic51$) || ((module0728.NIL != module0038.f2673(module0038.f2677(var77, (SubLObject)module0728.UNPROVIDED), (SubLObject)module0728.$ic15$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != f44435(module0038.f2677(var77, (SubLObject)module0728.UNPROVIDED))) && module0728.NIL != f44434(var63)))) {
            var77 = module0038.f2677(var77, (SubLObject)module0728.UNPROVIDED);
        }
        return var77;
    }
    
    public static SubLObject f44470(SubLObject var77, final SubLObject var63) {
        if (module0728.NIL != module0038.f2684(var63, (SubLObject)module0728.$ic55$) && !var63.equalp((SubLObject)module0728.$ic61$) && module0728.NIL != module0035.f2002(var63, (SubLObject)module0728.ONE_INTEGER, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != f44430(var77, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != f44436(module0038.f2623(var63, (SubLObject)module0728.ONE_INTEGER, (SubLObject)module0728.UNPROVIDED))) {
            while (module0728.NIL != f44433(var77)) {
                var77 = module0038.f2677(var77, (SubLObject)module0728.UNPROVIDED);
            }
        }
        return var77;
    }
    
    public static SubLObject f44471(SubLObject var77, final SubLObject var63) {
        if (module0728.NIL != module0038.f2673(var77, (SubLObject)module0728.$ic62$, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != module0038.f2684(var63, (SubLObject)module0728.$ic55$)) {
            var77 = Sequences.cconcatenate(module0038.f2677(var77, (SubLObject)module0728.TWO_INTEGER), (SubLObject)module0728.$ic11$);
        }
        return var77;
    }
    
    public static SubLObject f44472(SubLObject var77, final SubLObject var63) {
        if (module0728.NIL != module0038.f2673(var77, (SubLObject)module0728.$ic63$, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != Strings.string_equal(var63, (SubLObject)module0728.$ic64$, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED)) {
            var77 = module0038.f2667(var77, (SubLObject)module0728.$ic63$);
        }
        return var77;
    }
    
    public static SubLObject f44473(SubLObject var77, final SubLObject var63) {
        if (module0728.NIL != module0038.f2673(var77, (SubLObject)module0728.$ic65$, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != Strings.string_equal(var63, (SubLObject)module0728.$ic52$, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED)) {
            var77 = Sequences.cconcatenate(module0038.f2667(var77, (SubLObject)module0728.$ic66$), (SubLObject)module0728.$ic67$);
        }
        return var77;
    }
    
    public static SubLObject f44474(SubLObject var77, final SubLObject var63) {
        if (module0728.NIL != module0038.f2673(var77, (SubLObject)module0728.$ic68$, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != Strings.string_equal(var63, (SubLObject)module0728.$ic52$, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED)) {
            var77 = Sequences.cconcatenate(module0038.f2621(var77, (SubLObject)module0728.$ic68$, (SubLObject)module0728.UNPROVIDED), (SubLObject)module0728.$ic69$);
        }
        return var77;
    }
    
    public static SubLObject f44475(SubLObject var77, final SubLObject var63) {
        if (module0728.NIL != module0038.f2673(var77, (SubLObject)module0728.$ic70$, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != Strings.string_equal(var63, (SubLObject)module0728.$ic52$, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED)) {
            var77 = Sequences.cconcatenate(module0038.f2621(var77, (SubLObject)module0728.$ic51$, (SubLObject)module0728.UNPROVIDED), (SubLObject)module0728.$ic71$);
        }
        return var77;
    }
    
    public static SubLObject f44476(SubLObject var77, final SubLObject var63) {
        if ((module0728.NIL != module0038.f2673(var77, (SubLObject)module0728.$ic72$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var77, (SubLObject)module0728.$ic73$, (SubLObject)module0728.UNPROVIDED)) && module0728.NIL != Strings.string_equal(var63, (SubLObject)module0728.$ic12$, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED)) {
            var77 = module0038.f2667(var77, (SubLObject)module0728.$ic74$);
        }
        return var77;
    }
    
    public static SubLObject f44477(SubLObject var77, final SubLObject var63) {
        if ((module0728.NIL != module0038.f2673(var77, (SubLObject)module0728.$ic34$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != f44434(var63) || var63.equalp((SubLObject)module0728.$ic11$)) && module0728.NIL != f44438(var77) && module0728.NIL == f44478(var63) && (module0728.NIL != f44440(var77) || module0728.NIL != f44441(var77)) && ((!var63.equalp((SubLObject)module0728.$ic75$) && !var63.equalp((SubLObject)module0728.$ic76$)) || module0728.NIL != module0038.f2673(var77, (SubLObject)module0728.$ic77$, (SubLObject)module0728.UNPROVIDED)) && ((module0728.NIL == module0038.f2673(var77, (SubLObject)module0728.$ic78$, (SubLObject)module0728.UNPROVIDED) && module0728.NIL == module0038.f2673(var77, (SubLObject)module0728.$ic79$, (SubLObject)module0728.UNPROVIDED)) || (module0728.NIL != module0038.f2673(var77, (SubLObject)module0728.$ic80$, (SubLObject)module0728.UNPROVIDED) && module0728.NIL == module0038.f2673(var77, (SubLObject)module0728.$ic81$, (SubLObject)module0728.UNPROVIDED))) && (module0728.NIL == module0038.f2673(var77, (SubLObject)module0728.$ic82$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != f44429(var77)) && (module0728.NIL == module0038.f2679(var77, (SubLObject)module0728.$ic83$) || module0728.NIL != f44429(var77))) {
            var77 = f44443(var77);
        }
        return var77;
    }
    
    public static SubLObject f44478(final SubLObject var63) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var63.equalp((SubLObject)module0728.$ic72$) || var63.equalp((SubLObject)module0728.$ic56$) || var63.equalp((SubLObject)module0728.$ic84$));
    }
    
    public static SubLObject f44479(SubLObject var77, final SubLObject var63) {
        if (module0728.NIL == module0038.f2673(var77, (SubLObject)module0728.$ic85$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL == Strings.string_equal(var63, (SubLObject)module0728.$ic72$, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED)) {
            return var77;
        }
        if (f44428(var77).numLE((SubLObject)module0728.TWO_INTEGER)) {
            var77 = module0038.f2621(var77, (SubLObject)module0728.$ic51$, (SubLObject)module0728.UNPROVIDED);
            return var77;
        }
        if (module0728.NIL != module0004.f104(var77, module0728.$g5729$.getGlobalValue(), (SubLObject)module0728.EQUALP, (SubLObject)module0728.UNPROVIDED)) {
            var77 = module0038.f2667(var77, (SubLObject)module0728.$ic85$);
            return var77;
        }
        var77 = module0038.f2621(var77, (SubLObject)module0728.$ic51$, (SubLObject)module0728.UNPROVIDED);
        return var77;
    }
    
    public static SubLObject f44480(final SubLObject var51) {
        final SubLObject var52 = module0728.$g5734$.getGlobalValue();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0728.NIL == module0038.f2673(var51, (SubLObject)module0728.$ic86$, (SubLObject)module0728.UNPROVIDED) && f44428(var51).numLE(var52));
    }
    
    public static SubLObject f44481(final SubLObject var1) {
        return Sequences.cconcatenate(module0728.$g5736$.getGlobalValue(), var1);
    }
    
    public static SubLObject f44482(final SubLObject var1) {
        return Sequences.cconcatenate(module0728.$g5735$.getGlobalValue(), var1);
    }
    
    public static SubLObject f44483(final SubLObject var1) {
        return module0038.f2684(var1, module0728.$g5736$.getGlobalValue());
    }
    
    public static SubLObject f44484(final SubLObject var1) {
        return module0038.f2684(var1, module0728.$g5735$.getGlobalValue());
    }
    
    public static SubLObject f44485(final SubLObject var1, final SubLObject var25) {
        if (module0728.NIL != module0730.f44624(var25)) {
            return f44482(var1);
        }
        if (module0728.NIL != module0730.f44622(var25)) {
            return f44481(var1);
        }
        return f44482(var1);
    }
    
    public static SubLObject f44486(final SubLObject var1, final SubLObject var25) {
        if (module0728.NIL != module0730.f44624(var25)) {
            return f44484(var1);
        }
        if (module0728.NIL != module0730.f44622(var25)) {
            return f44483(var1);
        }
        return (SubLObject)module0728.NIL;
    }
    
    public static SubLObject f44487(final SubLObject var1) {
        if (module0728.NIL != f44480(var1)) {
            return f44459(var1, (SubLObject)module0728.$ic78$);
        }
        return f44482(var1);
    }
    
    public static SubLObject f44488(final SubLObject var1) {
        if (module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic12$, (SubLObject)module0728.UNPROVIDED)) {
            return f44482(var1);
        }
        return f44487(var1);
    }
    
    public static SubLObject f44489(final SubLObject var1) {
        if (module0728.NIL != f44480(var1)) {
            return f44459(var1, (SubLObject)module0728.$ic89$);
        }
        return f44481(var1);
    }
    
    public static SubLObject f44490(final SubLObject var1) {
        if (module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic12$, (SubLObject)module0728.UNPROVIDED)) {
            return f44481(var1);
        }
        return f44489(var1);
    }
    
    public static SubLObject f44491(final SubLObject var1) {
        return f44456(module0728.$ic90$, module0728.$ic91$, var1, (SubLObject)module0728.UNPROVIDED);
    }
    
    public static SubLObject f44492(final SubLObject var1) {
        return f44456(module0728.$ic92$, module0728.$ic91$, var1, (SubLObject)module0728.UNPROVIDED);
    }
    
    public static SubLObject f44493(final SubLObject var1) {
        return f44456(module0728.$ic93$, module0728.$ic91$, var1, (SubLObject)module0728.UNPROVIDED);
    }
    
    public static SubLObject f44494(final SubLObject var1) {
        return f44444(var1, f44456(module0728.$ic94$, module0728.$ic95$, var1, (SubLObject)module0728.UNPROVIDED));
    }
    
    public static SubLObject f44495(final SubLObject var1) {
        return module0038.f2782(f44496(var1, (SubLObject)module0728.UNPROVIDED), (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED);
    }
    
    public static SubLObject f44497(final SubLObject var1) {
        final SubLObject var2 = module0731.f44730(var1, module0728.$ic91$, (SubLObject)module0728.T, module0728.$ic96$, (SubLObject)module0728.UNPROVIDED);
        if (module0728.NIL != var2) {
            final SubLObject var3 = var2.first();
            final SubLObject var4 = module0732.f45050(var3, (SubLObject)module0728.UNPROVIDED);
            if (module0728.NIL != var4) {
                return var4;
            }
        }
        return f44456(module0728.$ic93$, module0728.$ic91$, var1, (SubLObject)module0728.UNPROVIDED);
    }
    
    public static SubLObject f44498(final SubLObject var1) {
        final SubLObject var2 = module0731.f44730(var1, module0728.$ic91$, (SubLObject)module0728.T, module0728.$ic96$, (SubLObject)module0728.UNPROVIDED);
        if (module0728.NIL != var2) {
            final SubLObject var3 = var2.first();
            final SubLObject var4 = module0732.f45058(var3, (SubLObject)module0728.UNPROVIDED);
            if (module0728.NIL != var4) {
                return var4;
            }
        }
        return f44456(module0728.$ic97$, module0728.$ic91$, var1, (SubLObject)module0728.UNPROVIDED);
    }
    
    public static SubLObject f44499(final SubLObject var1, SubLObject var105) {
        if (var105 == module0728.UNPROVIDED) {
            var105 = (SubLObject)module0728.NIL;
        }
        if (!var1.isString()) {
            return var1;
        }
        final SubLObject var106 = f44500(var1);
        if (var106.isString()) {
            return var106;
        }
        return Sequences.cconcatenate(var1, f44501(var1, var105));
    }
    
    public static SubLObject f44500(final SubLObject var1) {
        final SubLObject var2 = module0035.f2293(module0728.$g5737$.getGlobalValue(), var1, Symbols.symbol_function((SubLObject)module0728.EQUALP), (SubLObject)module0728.$ic99$);
        if (var2.isString()) {
            return var2;
        }
        return (SubLObject)module0728.NIL;
    }
    
    public static SubLObject f44501(final SubLObject var1, SubLObject var105) {
        if (var105 == module0728.UNPROVIDED) {
            var105 = (SubLObject)module0728.NIL;
        }
        SubLObject var106 = (SubLObject)module0728.NIL;
        if (module0728.NIL == var105 && module0728.NIL != f44502(var1)) {
            var105 = module0728.$ic31$;
        }
        if (module0728.NIL != module0173.f10955(var105) && module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic50$, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != module0731.f44702(var105, module0728.$ic31$, (SubLObject)module0728.UNPROVIDED)) {
            var106 = (SubLObject)module0728.$ic100$;
        }
        if (!var106.isString()) {
            var106 = (SubLObject)module0728.$ic101$;
        }
        return var106;
    }
    
    public static SubLObject f44503(final SubLObject var1, final SubLObject var108) {
        if (module0728.NIL != f44504(var1)) {
            return var1;
        }
        return Sequences.cconcatenate(f44505(var108), new SubLObject[] { module0728.$ic102$, var1 });
    }
    
    public static SubLObject f44504(final SubLObject var109) {
        if (!var109.isString()) {
            return (SubLObject)module0728.T;
        }
        SubLObject var110 = (SubLObject)module0728.NIL;
        if (module0728.NIL != module0004.f104(module0728.$ic103$, module0731.f44745(var109, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED), (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED)) {
            var110 = (SubLObject)module0728.T;
        }
        return var110;
    }
    
    public static SubLObject f44505(final SubLObject var108) {
        if (module0728.NIL != module0259.f16891(var108, module0728.$ic104$)) {
            return (SubLObject)module0728.$ic105$;
        }
        if (module0728.NIL != module0259.f16891(var108, module0728.$ic106$)) {
            return (SubLObject)module0728.$ic107$;
        }
        return (SubLObject)module0728.$ic105$;
    }
    
    public static SubLObject f44496(final SubLObject var1, SubLObject var27) {
        if (var27 == module0728.UNPROVIDED) {
            var27 = module0728.$ic96$;
        }
        SubLObject var28 = (SubLObject)module0728.NIL;
        var28 = f44506(var1, var27);
        if (module0728.NIL == var28) {
            final SubLObject var29 = module0737.f45705(var1);
            final SubLObject var30 = conses_high.last(var29, (SubLObject)module0728.UNPROVIDED).first();
            if (module0728.NIL != module0035.f2002(var29, (SubLObject)module0728.ONE_INTEGER, (SubLObject)module0728.UNPROVIDED)) {
                final SubLObject var31 = f44506(var30, var27);
                if (module0728.NIL != var31) {
                    var28 = Sequences.cconcatenate(Sequences.subseq(var1, (SubLObject)module0728.ZERO_INTEGER, Numbers.subtract(Sequences.length(var1), Sequences.length(var30))), var31);
                }
            }
        }
        if (module0728.NIL == var28) {
            var28 = f44494(var1);
        }
        return f44444(var1, var28);
    }
    
    public static SubLObject f44506(final SubLObject var1, final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)module0728.NIL;
        if (module0728.NIL != module0018.f984()) {
            final SubLObject var30 = module0731.f44730(var1, module0728.$ic32$, (SubLObject)module0728.T, var27, (SubLObject)module0728.UNPROVIDED);
            final SubLObject var31 = module0147.$g2094$.currentBinding(var28);
            final SubLObject var32 = module0147.$g2095$.currentBinding(var28);
            try {
                module0147.$g2094$.bind(module0147.f9531(var27), var28);
                module0147.$g2095$.bind(module0147.f9534(var27), var28);
                if (module0728.NIL == var29) {
                    SubLObject var33 = var30;
                    SubLObject var34 = (SubLObject)module0728.NIL;
                    var34 = var33.first();
                    while (module0728.NIL == var29 && module0728.NIL != var33) {
                        if (module0728.NIL == var29) {
                            SubLObject var20_113 = module0731.f44725(var1, var34, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED);
                            SubLObject var35 = (SubLObject)module0728.NIL;
                            var35 = var20_113.first();
                            while (module0728.NIL == var29 && module0728.NIL != var20_113) {
                                final SubLObject var36 = module0731.f44693(module0731.f44691(var35));
                                if (module0728.NIL != var36) {
                                    var29 = module0730.f44567(var34, var36, (SubLObject)module0728.UNPROVIDED);
                                }
                                var20_113 = var20_113.rest();
                                var35 = var20_113.first();
                            }
                        }
                        var33 = var33.rest();
                        var34 = var33.first();
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var32, var28);
                module0147.$g2094$.rebind(var31, var28);
            }
        }
        return (SubLObject)((module0728.NIL != var29) ? f44444(var1, var29) : module0728.NIL);
    }
    
    public static SubLObject f44507(final SubLObject var1, SubLObject var27) {
        if (var27 == module0728.UNPROVIDED) {
            var27 = module0728.$ic96$;
        }
        SubLObject var28 = (SubLObject)module0728.NIL;
        var28 = f44508(var1, var27);
        if (module0728.NIL == var28) {
            final SubLObject var29 = module0737.f45705(var1);
            final SubLObject var30 = conses_high.last(var29, (SubLObject)module0728.UNPROVIDED).first();
            if (module0728.NIL != module0035.f2002(var29, (SubLObject)module0728.ONE_INTEGER, (SubLObject)module0728.UNPROVIDED)) {
                final SubLObject var31 = f44508(var30, var27);
                if (module0728.NIL != var31) {
                    var28 = Sequences.cconcatenate(Sequences.subseq(var1, (SubLObject)module0728.ZERO_INTEGER, Numbers.subtract(Sequences.length(var1), Sequences.length(var30))), var31);
                }
            }
        }
        if (module0728.NIL == var28) {
            var28 = f44509(var1);
        }
        return f44444(var1, var28);
    }
    
    public static SubLObject f44508(final SubLObject var1, final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)module0728.NIL;
        if (module0728.NIL != module0018.f984()) {
            final SubLObject var30 = module0731.f44730(var1, module0728.$ic31$, (SubLObject)module0728.T, var27, (SubLObject)module0728.UNPROVIDED);
            final SubLObject var31 = module0147.$g2094$.currentBinding(var28);
            final SubLObject var32 = module0147.$g2095$.currentBinding(var28);
            try {
                module0147.$g2094$.bind(module0147.f9531(var27), var28);
                module0147.$g2095$.bind(module0147.f9534(var27), var28);
                if (module0728.NIL == var29) {
                    SubLObject var33 = var30;
                    SubLObject var34 = (SubLObject)module0728.NIL;
                    var34 = var33.first();
                    while (module0728.NIL == var29 && module0728.NIL != var33) {
                        if (module0728.NIL == var29) {
                            SubLObject var20_116 = module0731.f44725(var1, var34, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED);
                            SubLObject var35 = (SubLObject)module0728.NIL;
                            var35 = var20_116.first();
                            while (module0728.NIL == var29 && module0728.NIL != var20_116) {
                                final SubLObject var36 = module0731.f44692(module0731.f44691(var35));
                                if (module0728.NIL != var36) {
                                    var29 = module0730.f44567(var34, var36, (SubLObject)module0728.UNPROVIDED);
                                }
                                var20_116 = var20_116.rest();
                                var35 = var20_116.first();
                            }
                        }
                        var33 = var33.rest();
                        var34 = var33.first();
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var32, var28);
                module0147.$g2094$.rebind(var31, var28);
            }
        }
        return (SubLObject)((module0728.NIL != var29) ? f44444(var1, var29) : module0728.NIL);
    }
    
    public static SubLObject f44510(final SubLObject var1, final SubLObject var117) {
        SubLObject var118 = (SubLObject)module0728.NIL;
        if (module0728.NIL == module0038.f2611(var1)) {
            return (SubLObject)module0728.NIL;
        }
        if (module0728.NIL == var118) {
            SubLObject var119;
            SubLObject var120;
            for (var119 = module0777.f50085(var117), var120 = (SubLObject)module0728.NIL, var120 = var119.first(); module0728.NIL == var118 && module0728.NIL != var119; var118 = module0731.f44730(var1, var120, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED), var119 = var119.rest(), var120 = var119.first()) {}
        }
        return var118;
    }
    
    public static SubLObject f44511(final SubLObject var1, final SubLObject var119) {
        SubLObject var120 = (SubLObject)module0728.NIL;
        if (module0728.NIL == var120) {
            SubLObject var121;
            SubLObject var122;
            for (var121 = var119, var122 = (SubLObject)module0728.NIL, var122 = var121.first(); module0728.NIL == var120 && module0728.NIL != var121; var120 = f44510(var1, var122), var121 = var121.rest(), var122 = var121.first()) {}
        }
        return var120;
    }
    
    public static SubLObject f44512(final SubLObject var1) {
        return module0730.f44560(var1, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED);
    }
    
    public static SubLObject f44513(final SubLObject var1) {
        return f44511(var1, (SubLObject)module0728.$ic108$);
    }
    
    public static SubLObject f44514(final SubLObject var1) {
        return f44510(var1, (SubLObject)module0728.$ic109$);
    }
    
    public static SubLObject f44515(final SubLObject var1) {
        return f44511(var1, (SubLObject)module0728.$ic110$);
    }
    
    public static SubLObject f44516() {
        final SubLObject var28 = module0728.$g5738$.getGlobalValue();
        if (module0728.NIL != var28) {
            module0034.f1818(var28);
        }
        return (SubLObject)module0728.NIL;
    }
    
    public static SubLObject f44517(final SubLObject var24, SubLObject var117) {
        if (var117 == module0728.UNPROVIDED) {
            var117 = (SubLObject)module0728.$ic111$;
        }
        return module0034.f1829(module0728.$g5738$.getGlobalValue(), (SubLObject)ConsesLow.list(var24, var117), (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED);
    }
    
    public static SubLObject f44518(final SubLObject var24, final SubLObject var117) {
        return f44519(var24, var117);
    }
    
    public static SubLObject f44520(final SubLObject var24, SubLObject var117) {
        if (var117 == module0728.UNPROVIDED) {
            var117 = (SubLObject)module0728.$ic111$;
        }
        SubLObject var118 = module0728.$g5738$.getGlobalValue();
        if (module0728.NIL == var118) {
            var118 = module0034.f1934((SubLObject)module0728.$ic112$, (SubLObject)module0728.$ic113$, (SubLObject)module0728.$ic114$, (SubLObject)module0728.EQUAL, (SubLObject)module0728.TWO_INTEGER, (SubLObject)module0728.ZERO_INTEGER);
            module0034.f1940((SubLObject)module0728.$ic115$);
        }
        final SubLObject var119 = module0034.f1782(var24, var117);
        final SubLObject var120 = module0034.f1814(var118, var119, (SubLObject)module0728.UNPROVIDED);
        if (var120 != module0728.$ic30$) {
            SubLObject var121 = var120;
            SubLObject var122 = (SubLObject)module0728.NIL;
            var122 = var121.first();
            while (module0728.NIL != var121) {
                SubLObject var123 = var122.first();
                final SubLObject var124 = conses_high.second(var122);
                if (var24.equal(var123.first())) {
                    var123 = var123.rest();
                    if (module0728.NIL != var123 && module0728.NIL == var123.rest() && var117.equal(var123.first())) {
                        return module0034.f1959(var124);
                    }
                }
                var121 = var121.rest();
                var122 = var121.first();
            }
        }
        final SubLObject var125 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44518(var24, var117)));
        module0034.f1836(var118, var119, var120, var125, (SubLObject)ConsesLow.list(var24, var117));
        return module0034.f1959(var125);
    }
    
    public static SubLObject f44519(final SubLObject var1, SubLObject var117) {
        if (var117 == module0728.UNPROVIDED) {
            var117 = (SubLObject)module0728.$ic111$;
        }
        SubLObject var118 = (SubLObject)module0728.NIL;
        if (module0728.NIL == module0731.f44750(var1, (SubLObject)module0728.UNPROVIDED)) {
            if (module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic116$, (SubLObject)module0728.UNPROVIDED)) {
                final SubLObject var119 = module0038.f2634(module0038.f2709(var1, (SubLObject)module0728.$ic116$), (SubLObject)module0728.$ic11$);
                final SubLObject var120 = module0038.f2677(var1, (SubLObject)module0728.UNPROVIDED);
                if (module0728.NIL != f44515(var120)) {
                    var118 = var120;
                }
                else {
                    var118 = var119;
                }
            }
            else if (module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic50$, (SubLObject)module0728.UNPROVIDED)) {
                if (module0728.NIL == module0038.f2673(var1, (SubLObject)module0728.$ic117$, (SubLObject)module0728.UNPROVIDED)) {
                    final SubLObject var121 = module0038.f2677(var1, (SubLObject)module0728.UNPROVIDED);
                    final SubLObject var122 = (SubLObject)((module0728.NIL != module0038.f2673(var121, (SubLObject)module0728.$ic51$, (SubLObject)module0728.UNPROVIDED)) ? module0038.f2677(var121, (SubLObject)module0728.UNPROVIDED) : module0728.NIL);
                    if (module0728.NIL != f44515(var121)) {
                        var118 = var121;
                    }
                    else if (module0728.NIL != var122 && module0728.NIL != f44515(var122)) {
                        var118 = var122;
                    }
                    else if (module0728.NIL != var122) {
                        if (module0728.NIL == var118) {
                            SubLObject var123 = (SubLObject)module0728.$ic118$;
                            SubLObject var124 = (SubLObject)module0728.NIL;
                            var124 = var123.first();
                            while (module0728.NIL == var118 && module0728.NIL != var123) {
                                if (module0728.NIL != module0038.f2673(var122, var124, (SubLObject)module0728.UNPROVIDED)) {
                                    var118 = var122;
                                }
                                var123 = var123.rest();
                                var124 = var123.first();
                            }
                        }
                        if (module0728.NIL != module0038.f2673(var122, (SubLObject)module0728.$ic34$, (SubLObject)module0728.UNPROVIDED)) {
                            final SubLObject var125 = module0038.f2677(var122, (SubLObject)module0728.UNPROVIDED);
                            if (module0728.NIL != module0038.f2673(var125, (SubLObject)module0728.$ic34$, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != f44515(var125)) {
                                var118 = var125;
                            }
                        }
                        if (module0728.NIL == var118) {
                            var118 = var121;
                        }
                    }
                }
            }
            else if ((var117 == module0728.$ic111$ || var117 == module0728.$ic109$) && module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic61$, (SubLObject)module0728.UNPROVIDED)) {
                final SubLObject var126 = module0038.f2709(var1, (SubLObject)module0728.$ic61$);
                final SubLObject var127 = module0038.f2677(var126, (SubLObject)module0728.UNPROVIDED);
                final SubLObject var128 = module0038.f2634(var126, (SubLObject)module0728.$ic51$);
                SubLObject var129 = (SubLObject)ConsesLow.list(var126, var128);
                if (module0728.NIL != f44438(var126)) {
                    if (module0728.NIL != module0038.f2715(var126)) {
                        var129 = (SubLObject)ConsesLow.cons(var127, var129);
                        var129 = (SubLObject)ConsesLow.cons(var126, var129);
                    }
                    if (module0728.NIL != f44440(var126)) {
                        var129 = (SubLObject)ConsesLow.cons(var128, var129);
                    }
                }
                if (module0728.NIL == var118) {
                    SubLObject var130 = var129;
                    SubLObject var131 = (SubLObject)module0728.NIL;
                    var131 = var130.first();
                    while (module0728.NIL == var118 && module0728.NIL != var130) {
                        if (module0728.NIL != f44514(var131)) {
                            var118 = var131;
                        }
                        var130 = var130.rest();
                        var131 = var130.first();
                    }
                }
            }
            else if ((var117 == module0728.$ic111$ || var117 == module0728.$ic109$) && module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic86$, (SubLObject)module0728.UNPROVIDED)) {
                final SubLObject var132 = module0038.f2677(var1, (SubLObject)module0728.UNPROVIDED);
                final SubLObject var133 = module0038.f2709(var1, (SubLObject)module0728.$ic86$);
                final SubLObject var134 = module0038.f2677(var133, (SubLObject)module0728.UNPROVIDED);
                if (module0728.NIL != f44514(var132)) {
                    var118 = var132;
                }
                if (module0728.NIL == var118 && module0728.NIL != f44514(var133)) {
                    var118 = var133;
                }
                if (module0728.NIL == var118 && module0728.NIL != f44512(var1)) {
                    var118 = var1;
                }
                if (module0728.NIL == var118) {
                    if (module0728.NIL != f44438(var133) && module0728.NIL != module0038.f2715(var133)) {
                        var118 = var134;
                    }
                    else {
                        var118 = var132;
                    }
                }
            }
            else if (module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic34$, (SubLObject)module0728.UNPROVIDED) && (module0728.NIL != f44513(module0038.f2709(var1, (SubLObject)module0728.$ic34$)) || module0728.NIL != module0731.f44813(module0038.f2709(var1, (SubLObject)module0728.$ic34$), (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED))) {
                var118 = module0038.f2709(var1, (SubLObject)module0728.$ic34$);
            }
        }
        if (module0728.NIL == var118) {
            var118 = var1;
        }
        return var118;
    }
    
    public static SubLObject f44521(SubLObject var1) {
        SubLObject var2 = (SubLObject)module0728.NIL;
        if (module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic119$, (SubLObject)module0728.UNPROVIDED)) {
            var2 = module0038.f2709(var1, (SubLObject)module0728.$ic119$);
            var1 = module0038.f2634(var2, (SubLObject)module0728.$ic11$);
            return var1;
        }
        if (module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic116$, (SubLObject)module0728.UNPROVIDED)) {
            var2 = module0038.f2709(var1, (SubLObject)module0728.$ic116$);
            var1 = module0038.f2634(var2, (SubLObject)module0728.$ic11$);
            return var1;
        }
        if (module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic86$, (SubLObject)module0728.UNPROVIDED)) {
            var2 = module0038.f2709(var1, (SubLObject)module0728.$ic86$);
            if (module0728.NIL != module0038.f2673(var2, (SubLObject)module0728.$ic11$, (SubLObject)module0728.UNPROVIDED)) {
                return var2;
            }
            if (module0728.NIL == module0038.f2715(var2)) {
                return var2;
            }
            if (module0728.NIL != module0038.f2673(var2, (SubLObject)module0728.$ic120$, (SubLObject)module0728.UNPROVIDED)) {
                return var2;
            }
            return module0038.f2677(var2, (SubLObject)module0728.UNPROVIDED);
        }
        else {
            if (module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic121$, (SubLObject)module0728.UNPROVIDED)) {
                var1 = module0038.f2709(var1, (SubLObject)module0728.$ic121$);
            }
            if (module0728.NIL == module0038.f2673(var1, (SubLObject)module0728.$ic61$, (SubLObject)module0728.UNPROVIDED)) {
                if (module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic50$, (SubLObject)module0728.UNPROVIDED)) {
                    var1 = f44522(var1);
                }
                return var1;
            }
            var2 = module0038.f2709(var1, (SubLObject)module0728.$ic61$);
            if (module0728.NIL != module0038.f2715(var2) && module0728.NIL == module0038.f2673(var2, (SubLObject)module0728.$ic120$, (SubLObject)module0728.UNPROVIDED)) {
                return module0038.f2677(var2, (SubLObject)module0728.UNPROVIDED);
            }
            return var2;
        }
    }
    
    public static SubLObject f44523(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0728.NIL;
        if (module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic79$, (SubLObject)module0728.UNPROVIDED)) {
            return module0038.f2709(var1, (SubLObject)module0728.$ic79$);
        }
        if (module0728.NIL == module0038.f2673(var1, (SubLObject)module0728.$ic78$, (SubLObject)module0728.UNPROVIDED)) {
            return (SubLObject)module0728.NIL;
        }
        var2 = module0038.f2709(var1, (SubLObject)module0728.$ic78$);
        if (module0728.NIL != module0738.f45744(var2, module0728.$ic91$, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED)) {
            return var2;
        }
        return module0038.f2709(var1, (SubLObject)module0728.$ic122$);
    }
    
    public static SubLObject f44522(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0728.NIL;
        if (module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic116$, (SubLObject)module0728.UNPROVIDED)) {
            var2 = module0038.f2634(module0038.f2709(var1, (SubLObject)module0728.$ic116$), (SubLObject)module0728.$ic11$);
            return var2;
        }
        if (module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic123$, (SubLObject)module0728.UNPROVIDED)) {
            var2 = module0038.f2709(var1, (SubLObject)module0728.$ic123$);
            SubLObject var3 = module0728.$g5725$.getGlobalValue();
            SubLObject var4 = (SubLObject)module0728.NIL;
            var4 = var3.first();
            while (module0728.NIL != var3) {
                if (module0728.NIL != module0038.f2673(var2, var4, (SubLObject)module0728.UNPROVIDED)) {
                    return var2;
                }
                var3 = var3.rest();
                var4 = var3.first();
            }
        }
        if (module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic50$, (SubLObject)module0728.UNPROVIDED) && module0728.NIL == module0038.f2673(var1, (SubLObject)module0728.$ic117$, (SubLObject)module0728.UNPROVIDED)) {
            return module0038.f2709(var1, (SubLObject)module0728.$ic50$);
        }
        return var1;
    }
    
    public static SubLObject f44524(final SubLObject var1, SubLObject var27) {
        if (var27 == module0728.UNPROVIDED) {
            var27 = module0728.$ic96$;
        }
        return f44507(var1, var27);
    }
    
    public static SubLObject f44509(SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0728.NIL == module0728.$g5739$.getDynamicValue(var2)) {
            var1 = Strings.string_downcase(var1, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED);
        }
        SubLObject var3 = (SubLObject)module0728.NIL;
        if (module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic116$, (SubLObject)module0728.UNPROVIDED)) {
            var3 = module0038.f2709(var1, (SubLObject)module0728.$ic116$);
            var1 = module0038.f2634(var3, (SubLObject)module0728.$ic11$);
            return var1;
        }
        if (module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic123$, (SubLObject)module0728.UNPROVIDED)) {
            var3 = module0038.f2709(var1, (SubLObject)module0728.$ic123$);
            SubLObject var4 = module0728.$g5725$.getGlobalValue();
            SubLObject var5 = (SubLObject)module0728.NIL;
            var5 = var4.first();
            while (module0728.NIL != var4) {
                if (module0728.NIL != module0038.f2673(var3, var5, (SubLObject)module0728.UNPROVIDED)) {
                    var1 = var3;
                    return var1;
                }
                var4 = var4.rest();
                var5 = var4.first();
            }
        }
        if (module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic125$, (SubLObject)module0728.UNPROVIDED)) {
            if (var1.equal((SubLObject)module0728.$ic125$)) {
                return var1;
            }
            final SubLObject var6 = module0038.f2637(module0038.f2709(var1, (SubLObject)module0728.$ic125$));
            if (module0728.NIL != module0004.f104(var6, (SubLObject)module0728.$ic126$, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED)) {
                return var1;
            }
        }
        if (module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic50$, (SubLObject)module0728.UNPROVIDED) && module0728.NIL == module0038.f2673(var1, (SubLObject)module0728.$ic117$, (SubLObject)module0728.UNPROVIDED)) {
            var1 = module0038.f2709(var1, (SubLObject)module0728.$ic50$);
        }
        return var1;
    }
    
    public static SubLObject f44502(final SubLObject var1) {
        if (module0728.NIL == module0038.f2673(var1, (SubLObject)module0728.$ic50$, (SubLObject)module0728.UNPROVIDED)) {
            return (SubLObject)module0728.NIL;
        }
        final SubLObject var2 = module0038.f2677(var1, (SubLObject)module0728.UNPROVIDED);
        if (module0728.NIL != module0038.f2673(var2, (SubLObject)module0728.$ic50$, (SubLObject)module0728.UNPROVIDED)) {
            return (SubLObject)module0728.NIL;
        }
        if (module0728.NIL != module0038.f2673(var2, (SubLObject)module0728.$ic51$, (SubLObject)module0728.UNPROVIDED)) {
            return (SubLObject)module0728.T;
        }
        SubLObject var3 = (SubLObject)module0728.NIL;
        if (module0728.NIL == var3) {
            SubLObject var4;
            SubLObject var5;
            for (var4 = (SubLObject)module0728.$ic127$, var5 = (SubLObject)module0728.NIL, var5 = var4.first(); module0728.NIL == var3 && module0728.NIL != var4; var3 = module0038.f2673(var2, var5, (SubLObject)module0728.UNPROVIDED), var4 = var4.rest(), var5 = var4.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0728.NIL == var3);
    }
    
    public static SubLObject f44525(final SubLObject var1) {
        if (var1.eql(f44521(var1))) {
            return (SubLObject)module0728.T;
        }
        return (SubLObject)module0728.NIL;
    }
    
    public static SubLObject f44526(final SubLObject var1) {
        if (module0728.NIL == module0038.f2673(var1, (SubLObject)module0728.$ic61$, (SubLObject)module0728.UNPROVIDED)) {
            return (SubLObject)module0728.NIL;
        }
        final SubLObject var2 = f44519(var1, (SubLObject)module0728.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0728.NIL == Strings.string_equal(var2, var1, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != module0731.f44746(var2, module0728.$ic128$, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED));
    }
    
    public static SubLObject f44527(final SubLObject var1) {
        if (module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic86$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic129$, (SubLObject)module0728.UNPROVIDED)) {
            return (SubLObject)module0728.T;
        }
        return (SubLObject)module0728.NIL;
    }
    
    public static SubLObject f44528(final SubLObject var1) {
        return f44502(var1);
    }
    
    public static SubLObject f44529(final SubLObject var1) {
        if (reader.read_from_string_ignoring_errors(var1, (SubLObject)module0728.NIL, (SubLObject)module0728.NIL, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED).isNumber()) {
            return (SubLObject)module0728.T;
        }
        return (SubLObject)module0728.NIL;
    }
    
    public static SubLObject f44530(final SubLObject var1) {
        if (module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic78$, (SubLObject)module0728.UNPROVIDED)) {
            return (SubLObject)module0728.T;
        }
        return (SubLObject)module0728.NIL;
    }
    
    public static SubLObject f44531(final SubLObject var1) {
        if (module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic89$, (SubLObject)module0728.UNPROVIDED)) {
            return (SubLObject)module0728.T;
        }
        return (SubLObject)module0728.NIL;
    }
    
    public static SubLObject f44532(final SubLObject var46, final SubLObject var121) {
        SubLObject var123;
        final SubLObject var122 = var123 = module0731.f44729(var121, var46, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED);
        SubLObject var124 = (SubLObject)module0728.NIL;
        var124 = var123.first();
        while (module0728.NIL != var123) {
            if (var124.eql(module0728.$ic130$)) {
                return f44533(var46);
            }
            if (var124.eql(module0728.$ic128$)) {
                return f44534(var46);
            }
            var123 = var123.rest();
            var124 = var123.first();
        }
        return (SubLObject)module0728.NIL;
    }
    
    public static SubLObject f44533(final SubLObject var46) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0728.NIL != module0732.f45030(var46, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != module0732.f45032(var46, (SubLObject)module0728.UNPROVIDED));
    }
    
    public static SubLObject f44535(final SubLObject var46) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0728.NIL != module0732.f45042(var46, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != module0732.f45044(var46, (SubLObject)module0728.UNPROVIDED));
    }
    
    public static SubLObject f44534(final SubLObject var46) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0728.NIL != module0732.f45048(var46, (SubLObject)module0728.UNPROVIDED) && module0728.NIL != module0732.f45056(var46, (SubLObject)module0728.UNPROVIDED));
    }
    
    public static SubLObject f44536(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0728.NIL;
        if (module0728.NIL != f44529(var1)) {
            final SubLObject var4 = module0728.$ic131$;
            if (module0728.NIL == conses_high.member(var4, var3, Symbols.symbol_function((SubLObject)module0728.EQL), Symbols.symbol_function((SubLObject)module0728.IDENTITY))) {
                var3 = (SubLObject)ConsesLow.cons(var4, var3);
            }
        }
        if (module0728.NIL != module0018.$g726$.getGlobalValue()) {
            SubLObject var6;
            final SubLObject var5 = var6 = module0791.f50539(var1);
            SubLObject var7 = (SubLObject)module0728.NIL;
            var7 = var6.first();
            while (module0728.NIL != var6) {
                var3 = (SubLObject)ConsesLow.cons(conses_high.assoc(var7, module0584.$g4404$.getDynamicValue(var2), (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED).rest(), var3);
                var6 = var6.rest();
                var7 = var6.first();
            }
        }
        if (module0728.NIL == var3) {
            if (module0728.NIL != f44537(var1)) {
                final SubLObject var4 = module0728.$ic132$;
                if (module0728.NIL == conses_high.member(var4, var3, Symbols.symbol_function((SubLObject)module0728.EQL), Symbols.symbol_function((SubLObject)module0728.IDENTITY))) {
                    var3 = (SubLObject)ConsesLow.cons(var4, var3);
                }
            }
            if (module0728.NIL != f44538(var1)) {
                final SubLObject var4 = module0728.$ic130$;
                if (module0728.NIL == conses_high.member(var4, var3, Symbols.symbol_function((SubLObject)module0728.EQL), Symbols.symbol_function((SubLObject)module0728.IDENTITY))) {
                    var3 = (SubLObject)ConsesLow.cons(var4, var3);
                }
            }
            if (module0728.NIL != f44539(var1)) {
                final SubLObject var4 = module0728.$ic133$;
                if (module0728.NIL == conses_high.member(var4, var3, Symbols.symbol_function((SubLObject)module0728.EQL), Symbols.symbol_function((SubLObject)module0728.IDENTITY))) {
                    var3 = (SubLObject)ConsesLow.cons(var4, var3);
                }
            }
            if (module0728.NIL != f44540(var1)) {
                final SubLObject var4 = module0728.$ic128$;
                if (module0728.NIL == conses_high.member(var4, var3, Symbols.symbol_function((SubLObject)module0728.EQL), Symbols.symbol_function((SubLObject)module0728.IDENTITY))) {
                    var3 = (SubLObject)ConsesLow.cons(var4, var3);
                }
            }
            if (module0728.NIL != f44541(var1)) {
                final SubLObject var4 = module0728.$ic134$;
                if (module0728.NIL == conses_high.member(var4, var3, Symbols.symbol_function((SubLObject)module0728.EQL), Symbols.symbol_function((SubLObject)module0728.IDENTITY))) {
                    var3 = (SubLObject)ConsesLow.cons(var4, var3);
                }
            }
            if (module0728.NIL == var3) {
                SubLObject var4 = module0728.$ic128$;
                if (module0728.NIL == conses_high.member(var4, var3, Symbols.symbol_function((SubLObject)module0728.EQL), Symbols.symbol_function((SubLObject)module0728.IDENTITY))) {
                    var3 = (SubLObject)ConsesLow.cons(var4, var3);
                }
                var4 = module0728.$ic133$;
                if (module0728.NIL == conses_high.member(var4, var3, Symbols.symbol_function((SubLObject)module0728.EQL), Symbols.symbol_function((SubLObject)module0728.IDENTITY))) {
                    var3 = (SubLObject)ConsesLow.cons(var4, var3);
                }
                var4 = module0728.$ic130$;
                if (module0728.NIL == conses_high.member(var4, var3, Symbols.symbol_function((SubLObject)module0728.EQL), Symbols.symbol_function((SubLObject)module0728.IDENTITY))) {
                    var3 = (SubLObject)ConsesLow.cons(var4, var3);
                }
            }
        }
        return var3;
    }
    
    public static SubLObject f44537(final SubLObject var1) {
        if (Sequences.length(var1).numG((SubLObject)module0728.ZERO_INTEGER) && module0728.NIL != Characters.upper_case_p(Strings.sublisp_char(var1, (SubLObject)module0728.ZERO_INTEGER))) {
            return (SubLObject)module0728.T;
        }
        return (SubLObject)module0728.NIL;
    }
    
    public static SubLObject f44540(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0728.NIL;
        var2 = f44521(var1);
        if (module0728.NIL != module0038.f2673(var2, (SubLObject)module0728.$ic85$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var2, (SubLObject)module0728.$ic75$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var2, (SubLObject)module0728.$ic135$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var2, (SubLObject)module0728.$ic136$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var2, (SubLObject)module0728.$ic129$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic61$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic86$, (SubLObject)module0728.UNPROVIDED)) {
            return (SubLObject)module0728.T;
        }
        return (SubLObject)module0728.NIL;
    }
    
    public static SubLObject f44538(SubLObject var1) {
        var1 = f44524(var1, (SubLObject)module0728.UNPROVIDED);
        if (module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic137$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic138$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic139$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic140$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic56$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic141$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic52$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic64$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic142$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic143$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic144$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic145$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic63$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic146$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic147$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic148$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic149$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic150$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic151$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic152$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic153$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic154$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic155$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic156$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic157$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic158$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic159$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic160$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic161$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic162$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic163$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic164$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic165$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic140$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic166$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic167$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic168$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic169$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic170$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic56$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic171$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic172$, (SubLObject)module0728.UNPROVIDED)) {
            return (SubLObject)module0728.T;
        }
        return (SubLObject)module0728.NIL;
    }
    
    public static SubLObject f44539(final SubLObject var1) {
        if (module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic173$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic174$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic175$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic176$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic89$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic66$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic177$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic178$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic73$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic72$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic179$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic180$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic181$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic182$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic183$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic11$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic184$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic185$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic186$, (SubLObject)module0728.UNPROVIDED)) {
            return (SubLObject)module0728.T;
        }
        return (SubLObject)module0728.NIL;
    }
    
    public static SubLObject f44541(final SubLObject var1) {
        if (module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic12$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic187$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic188$, (SubLObject)module0728.UNPROVIDED) || module0728.NIL != module0038.f2673(var1, (SubLObject)module0728.$ic189$, (SubLObject)module0728.UNPROVIDED)) {
            return (SubLObject)module0728.T;
        }
        return (SubLObject)module0728.NIL;
    }
    
    public static SubLObject f44542(final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        return conses_high.member(var109, module0728.$g5740$.getDynamicValue(var110), (SubLObject)module0728.EQL, (SubLObject)module0728.UNPROVIDED);
    }
    
    public static SubLObject f44543(final SubLObject var12) {
        if (var12.eql((SubLObject)module0728.$ic191$)) {
            return module0728.$ic192$;
        }
        if (var12.eql((SubLObject)module0728.$ic193$)) {
            return module0728.$ic95$;
        }
        if (var12.eql((SubLObject)module0728.$ic109$)) {
            return module0728.$ic91$;
        }
        if (var12.eql((SubLObject)module0728.$ic194$)) {
            return module0728.$ic195$;
        }
        if (var12.eql((SubLObject)module0728.$ic196$)) {
            return module0728.$ic197$;
        }
        if (var12.eql((SubLObject)module0728.$ic198$)) {
            return module0728.$ic199$;
        }
        return (SubLObject)module0728.NIL;
    }
    
    public static SubLObject f44544(final SubLObject var24, SubLObject var117) {
        if (var117 == module0728.UNPROVIDED) {
            var117 = (SubLObject)module0728.NIL;
        }
        if (module0728.NIL != Strings.string_equal(var24, (SubLObject)module0728.$ic101$, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED) && (module0728.NIL == var117 || var117.eql((SubLObject)module0728.$ic109$))) {
            return (SubLObject)module0728.$ic200$;
        }
        return f44545(var24, var117);
    }
    
    public static SubLObject f44545(final SubLObject var24, SubLObject var117) {
        if (var117 == module0728.UNPROVIDED) {
            var117 = (SubLObject)module0728.NIL;
        }
        final SubLThread var118 = SubLProcess.currentSubLThread();
        assert module0728.NIL != Types.stringp(var24) : var24;
        if (module0728.NIL != var117 && !module0728.areAssertionsDisabledFor(me) && module0728.NIL == f44542(var117)) {
            throw new AssertionError(var117);
        }
        final SubLObject var119 = (SubLObject)((module0728.NIL != var117) ? ConsesLow.list(var117) : module0728.$g5740$.getDynamicValue(var118));
        SubLObject var120 = (SubLObject)module0728.NIL;
        SubLObject var121 = (SubLObject)module0728.NIL;
        if (module0728.NIL == var120) {
            SubLObject var122;
            SubLObject var123;
            SubLObject var124;
            for (var122 = var119, var123 = (SubLObject)module0728.NIL, var123 = var122.first(); module0728.NIL == var120 && module0728.NIL != var122; var120 = module0731.f44737(var24, var123, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED, (SubLObject)module0728.UNPROVIDED).first(), var124 = f44546(var120), var120 = ((module0728.NIL != var124) ? var124 : var120), var121 = (SubLObject)((module0728.NIL != var120) ? module0219.f14509(var120, (SubLObject)module0728.ONE_INTEGER, f44543(var123), module0728.$ic203$, (SubLObject)module0728.UNPROVIDED).first() : module0728.NIL), var122 = var122.rest(), var123 = var122.first()) {}
        }
        if (module0728.NIL != var121) {
            return module0178.f11335(var121);
        }
        SubLObject var125 = (SubLObject)module0728.NIL;
        if (module0728.NIL == var125) {
            SubLObject var126;
            SubLObject var127;
            for (var126 = var119, var127 = (SubLObject)module0728.NIL, var127 = var126.first(); module0728.NIL == var125 && module0728.NIL != var126; var125 = f44519(var24, var127), var126 = var126.rest(), var127 = var126.first()) {}
        }
        return var125;
    }
    
    public static SubLObject f44546(final SubLObject var46) {
        if (module0728.NIL == module0731.f44764(var46, (SubLObject)module0728.UNPROVIDED)) {
            return (SubLObject)module0728.NIL;
        }
        if (var46.eql(module0728.$ic204$)) {
            return module0728.$ic205$;
        }
        if (var46.eql(module0728.$ic206$)) {
            return module0728.$ic207$;
        }
        if (var46.eql(module0728.$ic208$)) {
            return module0728.$ic209$;
        }
        if (var46.eql(module0728.$ic210$)) {
            return module0728.$ic211$;
        }
        return (SubLObject)module0728.NIL;
    }
    
    public static SubLObject f44547() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44426", "S#48610", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44428", "S#48611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44429", "S#48612", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44430", "S#48613", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44427", "S#48614", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44431", "S#48615", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44432", "S#48616", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44433", "S#48617", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44434", "S#48618", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44435", "S#48619", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44436", "S#48620", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44437", "S#48621", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44438", "S#48622", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44439", "S#48623", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44440", "S#48624", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44441", "S#48625", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44442", "S#48626", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44443", "S#48627", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44444", "S#48628", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44445", "S#48629", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44446", "S#48630", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44448", "S#48631", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44449", "S#48632", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44450", "S#48633", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44447", "S#48634", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44451", "S#48635", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44452", "S#48636", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44453", "S#48637", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44454", "S#48638", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44455", "S#39570", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44456", "S#48639", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44457", "S#48640", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44458", "S#48641", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44459", "S#39912", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44460", "S#48642", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44461", "S#48643", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44462", "S#48644", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44463", "S#48645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44464", "S#48577", 2, 0, false);
        new $f44464$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44465", "S#48646", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44466", "S#48578", 2, 0, false);
        new $f44466$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44467", "S#48579", 2, 0, false);
        new $f44467$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44468", "S#48580", 2, 0, false);
        new $f44468$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44469", "S#48581", 2, 0, false);
        new $f44469$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44470", "S#48582", 2, 0, false);
        new $f44470$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44471", "S#48583", 2, 0, false);
        new $f44471$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44472", "S#48584", 2, 0, false);
        new $f44472$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44473", "S#48585", 2, 0, false);
        new $f44473$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44474", "S#48647", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44475", "S#48648", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44476", "S#48586", 2, 0, false);
        new $f44476$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44477", "S#48587", 2, 0, false);
        new $f44477$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44478", "S#48649", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44479", "S#48588", 2, 0, false);
        new $f44479$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44480", "S#48650", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44481", "S#48651", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44482", "S#48652", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44483", "S#48653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44484", "S#48654", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44485", "S#48655", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44486", "S#48656", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44487", "S#48657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44488", "S#48658", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44489", "S#48659", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44490", "S#48660", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44491", "S#48661", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44492", "S#48662", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44493", "S#48663", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44494", "S#48664", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44495", "S#48665", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44497", "S#48666", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44498", "S#48667", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44499", "S#48668", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44500", "S#48669", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44501", "S#48670", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44503", "S#48671", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44504", "S#48672", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44505", "S#48673", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44496", "S#48674", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44506", "S#48675", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44507", "S#48676", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44508", "S#48677", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44510", "S#48678", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44511", "S#48679", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44512", "S#48680", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44513", "S#48681", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44514", "S#48682", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44515", "S#48683", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44516", "S#48684", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44517", "S#48685", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44518", "S#48686", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44520", "S#48687", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44519", "S#48688", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44521", "S#48689", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44523", "S#48690", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44522", "S#48691", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44524", "PLURAL-NOUN-TO-SG", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44509", "S#48692", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44502", "S#47092", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44525", "S#48693", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44526", "S#48694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44527", "S#48695", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44528", "S#48696", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44529", "S#48697", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44530", "S#48698", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44531", "S#48699", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44532", "S#48700", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44533", "S#48701", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44535", "S#48702", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44534", "S#48703", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44536", "S#48704", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44537", "S#48705", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44540", "S#48706", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44538", "S#48707", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44539", "S#48708", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44541", "S#48709", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44542", "S#48710", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44543", "S#48711", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44544", "S#48712", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44545", "S#48713", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0728", "f44546", "S#48714", 1, 0, false);
        return (SubLObject)module0728.NIL;
    }
    
    public static SubLObject f44548() {
        module0728.$g5723$ = SubLFiles.defconstant("S#48715", (SubLObject)module0728.$ic3$);
        module0728.$g5724$ = SubLFiles.defconstant("S#48716", (SubLObject)module0728.$ic4$);
        module0728.$g5725$ = SubLFiles.defconstant("S#48717", (SubLObject)module0728.$ic5$);
        module0728.$g5726$ = SubLFiles.defconstant("S#48718", (SubLObject)module0728.$ic6$);
        module0728.$g5727$ = SubLFiles.defconstant("S#48719", (SubLObject)module0728.$ic7$);
        module0728.$g5728$ = SubLFiles.defconstant("S#48720", (SubLObject)module0728.$ic8$);
        module0728.$g5729$ = SubLFiles.defconstant("S#48721", (SubLObject)module0728.$ic9$);
        module0728.$g5730$ = SubLFiles.defconstant("S#48722", (SubLObject)module0728.$ic10$);
        module0728.$g5731$ = SubLFiles.defconstant("S#48723", Sequences.cconcatenate(module0728.$g5723$.getGlobalValue(), (SubLObject)module0728.$ic11$));
        module0728.$g5732$ = SubLFiles.deflexical("S#48724", (SubLObject)module0728.NIL);
        module0728.$g5733$ = SubLFiles.deflexical("S#48725", (SubLObject)module0728.$ic47$);
        module0728.$g5734$ = SubLFiles.deflexical("S#48726", (SubLObject)module0728.TWO_INTEGER);
        module0728.$g5735$ = SubLFiles.defconstant("S#48727", (SubLObject)module0728.$ic87$);
        module0728.$g5736$ = SubLFiles.defconstant("S#48728", (SubLObject)module0728.$ic88$);
        module0728.$g5737$ = SubLFiles.defconstant("S#48729", (SubLObject)module0728.$ic98$);
        module0728.$g5738$ = SubLFiles.deflexical("S#48730", (SubLObject)module0728.NIL);
        module0728.$g5739$ = SubLFiles.defparameter("S#48731", (SubLObject)module0728.NIL);
        module0728.$g5740$ = SubLFiles.defparameter("S#48732", (SubLObject)module0728.$ic190$);
        return (SubLObject)module0728.NIL;
    }
    
    public static SubLObject f44549() {
        module0584.$g4428$.setGlobalValue((SubLObject)module0728.$ic0$);
        module0584.f35817((SubLObject)module0728.$ic1$, (SubLObject)module0728.$ic2$);
        module0034.f1909((SubLObject)module0728.$ic25$);
        module0034.f1909((SubLObject)module0728.$ic112$);
        module0002.f38((SubLObject)module0728.$ic124$);
        return (SubLObject)module0728.NIL;
    }
    
    public void declareFunctions() {
        f44547();
    }
    
    public void initializeVariables() {
        f44548();
    }
    
    public void runTopLevelForms() {
        f44549();
    }
    
    static {
        me = (SubLFile)new module0728();
        module0728.$g5723$ = null;
        module0728.$g5724$ = null;
        module0728.$g5725$ = null;
        module0728.$g5726$ = null;
        module0728.$g5727$ = null;
        module0728.$g5728$ = null;
        module0728.$g5729$ = null;
        module0728.$g5730$ = null;
        module0728.$g5731$ = null;
        module0728.$g5732$ = null;
        module0728.$g5733$ = null;
        module0728.$g5734$ = null;
        module0728.$g5735$ = null;
        module0728.$g5736$ = null;
        module0728.$g5737$ = null;
        module0728.$g5738$ = null;
        module0728.$g5739$ = null;
        module0728.$g5740$ = null;
        $ic0$ = SubLObjectFactory.makeString("$Revision: 139508 $");
        $ic1$ = SubLObjectFactory.makeSymbol("*MORPHOLOGY-CODE-REVISION*");
        $ic2$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.137"), (SubLObject)SubLObjectFactory.makeString("1.138")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.138"), (SubLObject)SubLObjectFactory.makeString("1.139")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.139"), (SubLObject)SubLObjectFactory.makeString("1.140")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.140"), (SubLObject)SubLObjectFactory.makeString("1.141")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.141"), (SubLObject)SubLObjectFactory.makeString("1.142")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.142"), (SubLObject)SubLObjectFactory.makeString("1.143")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.143"), (SubLObject)SubLObjectFactory.makeString("1.144")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.145"), (SubLObject)SubLObjectFactory.makeString("1.146")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.146"), (SubLObject)SubLObjectFactory.makeString("1.147")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.147"), (SubLObject)SubLObjectFactory.makeString("1.148")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.148"), (SubLObject)SubLObjectFactory.makeString("1.149")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.149"), (SubLObject)SubLObjectFactory.makeString("1.150")) });
        $ic3$ = SubLObjectFactory.makeString("aeiou");
        $ic4$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("ai"), SubLObjectFactory.makeString("au"), SubLObjectFactory.makeString("ay"), SubLObjectFactory.makeString("ea"), SubLObjectFactory.makeString("ee"), SubLObjectFactory.makeString("ei"), SubLObjectFactory.makeString("eu"), SubLObjectFactory.makeString("ie"), SubLObjectFactory.makeString("io"), SubLObjectFactory.makeString("oa"), SubLObjectFactory.makeString("oi"), SubLObjectFactory.makeString("oo"), SubLObjectFactory.makeString("ou"), SubLObjectFactory.makeString("ow"), SubLObjectFactory.makeString("oy"), SubLObjectFactory.makeString("ui") });
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ss"), (SubLObject)SubLObjectFactory.makeString("x"), (SubLObject)SubLObjectFactory.makeString("sh"), (SubLObject)SubLObjectFactory.makeString("ch"), (SubLObject)SubLObjectFactory.makeString("z"), (SubLObject)SubLObjectFactory.makeString("s"));
        $ic6$ = SubLObjectFactory.makeString("bcdfghjklmnprstvxz");
        $ic7$ = SubLObjectFactory.makeString("bdfgklmnprtvz");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("re"), (SubLObject)SubLObjectFactory.makeString("de"), (SubLObject)SubLObjectFactory.makeString("dis"), (SubLObject)SubLObjectFactory.makeString("mis"), (SubLObject)SubLObjectFactory.makeString("un"), (SubLObject)SubLObjectFactory.makeString("in"), (SubLObject)SubLObjectFactory.makeString("ex"));
        $ic9$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("evaporate"), SubLObjectFactory.makeString("appreciate"), SubLObjectFactory.makeString("associate"), SubLObjectFactory.makeString("accommodate"), SubLObjectFactory.makeString("affiliate"), SubLObjectFactory.makeString("applicate"), SubLObjectFactory.makeString("navigate"), SubLObjectFactory.makeString("calculate"), SubLObjectFactory.makeString("abdicate"), SubLObjectFactory.makeString("estimate"), SubLObjectFactory.makeString("emulate"), SubLObjectFactory.makeString("educate") });
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("l"), (SubLObject)SubLObjectFactory.makeString("r"));
        $ic11$ = SubLObjectFactory.makeString("y");
        $ic12$ = SubLObjectFactory.makeString("ly");
        $ic13$ = SubLObjectFactory.makeString("qw");
        $ic14$ = SubLObjectFactory.makeString("q");
        $ic15$ = SubLObjectFactory.makeString("u");
        $ic16$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("comparativeDegree"));
        $ic17$ = SubLObjectFactory.makeSymbol("S#48657", "CYC");
        $ic18$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("superlativeDegree"));
        $ic19$ = SubLObjectFactory.makeSymbol("S#48659", "CYC");
        $ic20$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("comparativeAdverb"));
        $ic21$ = SubLObjectFactory.makeSymbol("S#48658", "CYC");
        $ic22$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("superlativeAdverb"));
        $ic23$ = SubLObjectFactory.makeSymbol("S#48660", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic25$ = SubLObjectFactory.makeSymbol("S#48634", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#12278", "CYC");
        $ic27$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regularSuffix"));
        $ic28$ = SubLObjectFactory.makeSymbol("S#48724", "CYC");
        $ic29$ = SubLObjectFactory.makeInteger(256);
        $ic30$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic31$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("plural-Generic"));
        $ic32$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("singular-Generic"));
        $ic33$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("plural")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pnPlural")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("agentive-Pl")));
        $ic34$ = SubLObjectFactory.makeString("z");
        $ic35$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EnglishLexiconMt"));
        $ic36$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regularDegree")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regularAdverb")));
        $ic37$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("comparativeDegree")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("superlativeDegree")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("comparativeAdverb")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("superlativeAdverb")));
        $ic38$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic39$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic40$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48733", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39569", "CYC"));
        $ic41$ = SubLObjectFactory.makeSymbol("S#12275", "CYC");
        $ic42$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic43$ = SubLObjectFactory.makeSymbol("S#12280", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#3935", "CYC");
        $ic45$ = SubLObjectFactory.makeString("");
        $ic46$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#48734", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"));
        $ic47$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#48578", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("BOTH")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#48588", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#48587", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#48579", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#48585", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#48647", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#48648", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#48580", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#48646", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("SUFFIX")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#48581", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#48582", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#48583", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#48584", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#48586", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#48577", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("SUFFIX")) });
        $ic48$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOTH"), (SubLObject)SubLObjectFactory.makeKeyword("BASE"));
        $ic49$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOTH"), (SubLObject)SubLObjectFactory.makeKeyword("SUFFIX"));
        $ic50$ = SubLObjectFactory.makeString("s");
        $ic51$ = SubLObjectFactory.makeString("e");
        $ic52$ = SubLObjectFactory.makeString("ion");
        $ic53$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("port"), SubLObjectFactory.makeString("apt"), SubLObjectFactory.makeString("cit"), SubLObjectFactory.makeString("cite"), SubLObjectFactory.makeString("est"), SubLObjectFactory.makeString("ant"), SubLObjectFactory.makeString("ment"), SubLObjectFactory.makeString("ient"), SubLObjectFactory.makeString("ont"), SubLObjectFactory.makeString("pute"), SubLObjectFactory.makeString("esent"), SubLObjectFactory.makeString("note"), SubLObjectFactory.makeString("mute"), SubLObjectFactory.makeString("et") });
        $ic54$ = SubLObjectFactory.makeString("ation");
        $ic55$ = SubLObjectFactory.makeString("i");
        $ic56$ = SubLObjectFactory.makeString("ity");
        $ic57$ = SubLObjectFactory.makeString("ble");
        $ic58$ = SubLObjectFactory.makeString("il");
        $ic59$ = SubLObjectFactory.makeString("at");
        $ic60$ = SubLObjectFactory.makeString("ai");
        $ic61$ = SubLObjectFactory.makeString("ing");
        $ic62$ = SubLObjectFactory.makeString("ie");
        $ic63$ = SubLObjectFactory.makeString("ism");
        $ic64$ = SubLObjectFactory.makeString("ist");
        $ic65$ = SubLObjectFactory.makeString("ceive");
        $ic66$ = SubLObjectFactory.makeString("ive");
        $ic67$ = SubLObjectFactory.makeString("pt");
        $ic68$ = SubLObjectFactory.makeString("vert");
        $ic69$ = SubLObjectFactory.makeString("vers");
        $ic70$ = SubLObjectFactory.makeString("duce");
        $ic71$ = SubLObjectFactory.makeString("t");
        $ic72$ = SubLObjectFactory.makeString("able");
        $ic73$ = SubLObjectFactory.makeString("ible");
        $ic74$ = SubLObjectFactory.makeString("le");
        $ic75$ = SubLObjectFactory.makeString("ize");
        $ic76$ = SubLObjectFactory.makeString("ise");
        $ic77$ = SubLObjectFactory.makeString("al");
        $ic78$ = SubLObjectFactory.makeString("er");
        $ic79$ = SubLObjectFactory.makeString("or");
        $ic80$ = SubLObjectFactory.makeString("fer");
        $ic81$ = SubLObjectFactory.makeString("ffer");
        $ic82$ = SubLObjectFactory.makeString("id");
        $ic83$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("n"), (SubLObject)SubLObjectFactory.makeString("l"), (SubLObject)SubLObjectFactory.makeString("t"));
        $ic84$ = SubLObjectFactory.makeString("alicious");
        $ic85$ = SubLObjectFactory.makeString("ate");
        $ic86$ = SubLObjectFactory.makeString("ed");
        $ic87$ = SubLObjectFactory.makeString("more ");
        $ic88$ = SubLObjectFactory.makeString("most ");
        $ic89$ = SubLObjectFactory.makeString("est");
        $ic90$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pastTense-Universal"));
        $ic91$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("infinitive"));
        $ic92$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("gerund"));
        $ic93$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("thirdPersonSg-Present"));
        $ic94$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("plural"));
        $ic95$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("singular"));
        $ic96$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EnglishMt"));
        $ic97$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("presentParticiple"));
        $ic98$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("I"), (SubLObject)SubLObjectFactory.makeString("my")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("me"), (SubLObject)SubLObjectFactory.makeString("my")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("you"), (SubLObject)SubLObjectFactory.makeString("your")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("he"), (SubLObject)SubLObjectFactory.makeString("his")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("him"), (SubLObject)SubLObjectFactory.makeString("his")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("him or her"), (SubLObject)SubLObjectFactory.makeString("his or her")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("he or she"), (SubLObject)SubLObjectFactory.makeString("his or her")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("she"), (SubLObject)SubLObjectFactory.makeString("her")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("her"), (SubLObject)SubLObjectFactory.makeString("her")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("it"), (SubLObject)SubLObjectFactory.makeString("its")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("we"), (SubLObject)SubLObjectFactory.makeString("our")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("us"), (SubLObject)SubLObjectFactory.makeString("our")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("they"), (SubLObject)SubLObjectFactory.makeString("their")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("them"), (SubLObject)SubLObjectFactory.makeString("their")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("there"), (SubLObject)SubLObjectFactory.makeString("that place's")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("here"), (SubLObject)SubLObjectFactory.makeString("this place's")) });
        $ic99$ = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $ic100$ = SubLObjectFactory.makeString("'");
        $ic101$ = SubLObjectFactory.makeString("'s");
        $ic102$ = SubLObjectFactory.makeString(" ");
        $ic103$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("QuantifyingIndexical"));
        $ic104$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("GeographicalRegion"));
        $ic105$ = SubLObjectFactory.makeString("in");
        $ic106$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SurfaceRegion-Underspecified"));
        $ic107$ = SubLObjectFactory.makeString("on");
        $ic108$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROPER-NOUN"), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"));
        $ic109$ = SubLObjectFactory.makeKeyword("VERB");
        $ic110$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeKeyword("PROPER-NOUN"), (SubLObject)SubLObjectFactory.makeKeyword("VERB"));
        $ic111$ = SubLObjectFactory.makeKeyword("ANY");
        $ic112$ = SubLObjectFactory.makeSymbol("S#48687", "CYC");
        $ic113$ = SubLObjectFactory.makeSymbol("S#48730", "CYC");
        $ic114$ = SubLObjectFactory.makeInteger(16384);
        $ic115$ = SubLObjectFactory.makeSymbol("S#48684", "CYC");
        $ic116$ = SubLObjectFactory.makeString("ies");
        $ic117$ = SubLObjectFactory.makeString("ss");
        $ic118$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("o"), (SubLObject)SubLObjectFactory.makeString("ch"), (SubLObject)SubLObjectFactory.makeString("x"), (SubLObject)SubLObjectFactory.makeString("sh"), (SubLObject)SubLObjectFactory.makeString("z"), (SubLObject)SubLObjectFactory.makeString("s"));
        $ic119$ = SubLObjectFactory.makeString("ied");
        $ic120$ = SubLObjectFactory.makeString("l");
        $ic121$ = SubLObjectFactory.makeString("d");
        $ic122$ = SubLObjectFactory.makeString("r");
        $ic123$ = SubLObjectFactory.makeString("es");
        $ic124$ = SubLObjectFactory.makeSymbol("PLURAL-NOUN-TO-SG");
        $ic125$ = SubLObjectFactory.makeString("us");
        $ic126$ = ConsesLow.list((SubLObject)Characters.CHAR_r, (SubLObject)Characters.CHAR_h, (SubLObject)Characters.CHAR_t, (SubLObject)Characters.CHAR_n);
        $ic127$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ch"), (SubLObject)SubLObjectFactory.makeString("sh"), (SubLObject)SubLObjectFactory.makeString("x"), (SubLObject)SubLObjectFactory.makeString("z"));
        $ic128$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Verb"));
        $ic129$ = SubLObjectFactory.makeString("en");
        $ic130$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CountNoun"));
        $ic131$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Number-SP"));
        $ic132$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ProperCountNoun"));
        $ic133$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Adjective"));
        $ic134$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Adverb"));
        $ic135$ = SubLObjectFactory.makeString("yze");
        $ic136$ = SubLObjectFactory.makeString("ify");
        $ic137$ = SubLObjectFactory.makeString("logy");
        $ic138$ = SubLObjectFactory.makeString("ette");
        $ic139$ = SubLObjectFactory.makeString("ess");
        $ic140$ = SubLObjectFactory.makeString("eer");
        $ic141$ = SubLObjectFactory.makeString("omy");
        $ic142$ = SubLObjectFactory.makeString("ics");
        $ic143$ = SubLObjectFactory.makeString("geny");
        $ic144$ = SubLObjectFactory.makeString("ium");
        $ic145$ = SubLObjectFactory.makeString("cracy");
        $ic146$ = SubLObjectFactory.makeString("itis");
        $ic147$ = SubLObjectFactory.makeString("oma");
        $ic148$ = SubLObjectFactory.makeString("lysis");
        $ic149$ = SubLObjectFactory.makeString("hood");
        $ic150$ = SubLObjectFactory.makeString("ship");
        $ic151$ = SubLObjectFactory.makeString("lty");
        $ic152$ = SubLObjectFactory.makeString("meter");
        $ic153$ = SubLObjectFactory.makeString("morph");
        $ic154$ = SubLObjectFactory.makeString("morphy");
        $ic155$ = SubLObjectFactory.makeString("osis");
        $ic156$ = SubLObjectFactory.makeString("stery");
        $ic157$ = SubLObjectFactory.makeString("ence");
        $ic158$ = SubLObjectFactory.makeString("tude");
        $ic159$ = SubLObjectFactory.makeString("ance");
        $ic160$ = SubLObjectFactory.makeString("graphy");
        $ic161$ = SubLObjectFactory.makeString("ment");
        $ic162$ = SubLObjectFactory.makeString("age");
        $ic163$ = SubLObjectFactory.makeString("dom");
        $ic164$ = SubLObjectFactory.makeString("ery");
        $ic165$ = SubLObjectFactory.makeString("ite");
        $ic166$ = SubLObjectFactory.makeString("let");
        $ic167$ = SubLObjectFactory.makeString("ling");
        $ic168$ = SubLObjectFactory.makeString("ster");
        $ic169$ = SubLObjectFactory.makeString("ant");
        $ic170$ = SubLObjectFactory.makeString("ee");
        $ic171$ = SubLObjectFactory.makeString("ese");
        $ic172$ = SubLObjectFactory.makeString("an");
        $ic173$ = SubLObjectFactory.makeString("ical");
        $ic174$ = SubLObjectFactory.makeString("ous");
        $ic175$ = SubLObjectFactory.makeString("less");
        $ic176$ = SubLObjectFactory.makeString("ier");
        $ic177$ = SubLObjectFactory.makeString("nant");
        $ic178$ = SubLObjectFactory.makeString("thic");
        $ic179$ = SubLObjectFactory.makeString("etic");
        $ic180$ = SubLObjectFactory.makeString("itic");
        $ic181$ = SubLObjectFactory.makeString("ful");
        $ic182$ = SubLObjectFactory.makeString("ish");
        $ic183$ = SubLObjectFactory.makeString("like");
        $ic184$ = SubLObjectFactory.makeString("ial");
        $ic185$ = SubLObjectFactory.makeString("esque");
        $ic186$ = SubLObjectFactory.makeString("ic");
        $ic187$ = SubLObjectFactory.makeString("wise");
        $ic188$ = SubLObjectFactory.makeString("ward");
        $ic189$ = SubLObjectFactory.makeString("wards");
        $ic190$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeKeyword("PROPER-NOUN"), (SubLObject)SubLObjectFactory.makeKeyword("VERB"), (SubLObject)SubLObjectFactory.makeKeyword("ADJECTIVE"), (SubLObject)SubLObjectFactory.makeKeyword("ADVERB"), (SubLObject)SubLObjectFactory.makeKeyword("PREPOSITION"));
        $ic191$ = SubLObjectFactory.makeKeyword("PROPER-NOUN");
        $ic192$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pnSingular"));
        $ic193$ = SubLObjectFactory.makeKeyword("NOUN");
        $ic194$ = SubLObjectFactory.makeKeyword("ADJECTIVE");
        $ic195$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regularDegree"));
        $ic196$ = SubLObjectFactory.makeKeyword("ADVERB");
        $ic197$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regularAdverb"));
        $ic198$ = SubLObjectFactory.makeKeyword("PREPOSITION");
        $ic199$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("prepositionStrings"));
        $ic200$ = SubLObjectFactory.makeString("be");
        $ic201$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic202$ = SubLObjectFactory.makeSymbol("S#48710", "CYC");
        $ic203$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("GeneralEnglishMt"));
        $ic204$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Be-Contracted"));
        $ic205$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Be-TheWord"));
        $ic206$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Will-Contracted"));
        $ic207$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Will-TheModal"));
        $ic208$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Have-Contracted"));
        $ic209$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Have-TheWord"));
        $ic210$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Would-Contracted"));
        $ic211$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Would-TheWord"));
    }
    
    public static final class $f44464$BinaryFunction extends BinaryFunction
    {
        public $f44464$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#48577"));
        }
        
        public SubLObject processItem(final SubLObject var99, final SubLObject var100) {
            return module0728.f44464(var99, var100);
        }
    }
    
    public static final class $f44466$BinaryFunction extends BinaryFunction
    {
        public $f44466$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#48578"));
        }
        
        public SubLObject processItem(final SubLObject var99, final SubLObject var100) {
            return module0728.f44466(var99, var100);
        }
    }
    
    public static final class $f44467$BinaryFunction extends BinaryFunction
    {
        public $f44467$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#48579"));
        }
        
        public SubLObject processItem(final SubLObject var99, final SubLObject var100) {
            return module0728.f44467(var99, var100);
        }
    }
    
    public static final class $f44468$BinaryFunction extends BinaryFunction
    {
        public $f44468$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#48580"));
        }
        
        public SubLObject processItem(final SubLObject var99, final SubLObject var100) {
            return module0728.f44468(var99, var100);
        }
    }
    
    public static final class $f44469$BinaryFunction extends BinaryFunction
    {
        public $f44469$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#48581"));
        }
        
        public SubLObject processItem(final SubLObject var99, final SubLObject var100) {
            return module0728.f44469(var99, var100);
        }
    }
    
    public static final class $f44470$BinaryFunction extends BinaryFunction
    {
        public $f44470$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#48582"));
        }
        
        public SubLObject processItem(final SubLObject var99, final SubLObject var100) {
            return module0728.f44470(var99, var100);
        }
    }
    
    public static final class $f44471$BinaryFunction extends BinaryFunction
    {
        public $f44471$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#48583"));
        }
        
        public SubLObject processItem(final SubLObject var99, final SubLObject var100) {
            return module0728.f44471(var99, var100);
        }
    }
    
    public static final class $f44472$BinaryFunction extends BinaryFunction
    {
        public $f44472$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#48584"));
        }
        
        public SubLObject processItem(final SubLObject var99, final SubLObject var100) {
            return module0728.f44472(var99, var100);
        }
    }
    
    public static final class $f44473$BinaryFunction extends BinaryFunction
    {
        public $f44473$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#48585"));
        }
        
        public SubLObject processItem(final SubLObject var99, final SubLObject var100) {
            return module0728.f44473(var99, var100);
        }
    }
    
    public static final class $f44476$BinaryFunction extends BinaryFunction
    {
        public $f44476$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#48586"));
        }
        
        public SubLObject processItem(final SubLObject var99, final SubLObject var100) {
            return module0728.f44476(var99, var100);
        }
    }
    
    public static final class $f44477$BinaryFunction extends BinaryFunction
    {
        public $f44477$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#48587"));
        }
        
        public SubLObject processItem(final SubLObject var99, final SubLObject var100) {
            return module0728.f44477(var99, var100);
        }
    }
    
    public static final class $f44479$BinaryFunction extends BinaryFunction
    {
        public $f44479$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#48588"));
        }
        
        public SubLObject processItem(final SubLObject var99, final SubLObject var100) {
            return module0728.f44479(var99, var100);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0728.class
	Total time: 828 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/