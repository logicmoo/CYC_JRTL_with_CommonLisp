package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0661 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0661";
    public static final String myFingerPrint = "2737239001bdba2be17ef7e7168862e2b6de257ca7f23b16f26d38ff0b84460f";
    private static SubLSymbol $g5209$;
    public static SubLSymbol $g5210$;
    public static SubLSymbol $g5211$;
    public static SubLSymbol $g5212$;
    private static SubLSymbol $g5213$;
    private static SubLSymbol $g5214$;
    private static SubLSymbol $g5215$;
    public static SubLSymbol $g5216$;
    public static SubLSymbol $g5217$;
    public static SubLSymbol $g5218$;
    public static SubLSymbol $g5219$;
    public static SubLSymbol $g5220$;
    public static SubLSymbol $g5221$;
    public static SubLSymbol $g5222$;
    public static SubLSymbol $g5223$;
    public static SubLSymbol $g5224$;
    public static SubLSymbol $g5225$;
    public static SubLSymbol $g5226$;
    public static SubLSymbol $g5227$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
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
    private static final SubLString $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLList $ic73$;
    private static final SubLList $ic74$;
    private static final SubLList $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLString $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLString $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLObject $ic92$;
    private static final SubLInteger $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLObject $ic99$;
    private static final SubLObject $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLString $ic106$;
    private static final SubLList $ic107$;
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLString $ic120$;
    private static final SubLString $ic121$;
    private static final SubLString $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLString $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLList $ic131$;
    private static final SubLString $ic132$;
    private static final SubLString $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLString $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLString $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLString $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLString $ic145$;
    private static final SubLString $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLString $ic151$;
    private static final SubLString $ic152$;
    private static final SubLString $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLString $ic155$;
    private static final SubLString $ic156$;
    private static final SubLString $ic157$;
    private static final SubLString $ic158$;
    private static final SubLString $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLList $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLString $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLList $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLList $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLList $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLList $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLList $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLList $ic201$;
    private static final SubLList $ic202$;
    private static final SubLList $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLSymbol $ic208$;
    private static final SubLList $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLList $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLList $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLSymbol $ic216$;
    private static final SubLList $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLString $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLString $ic222$;
    private static final SubLString $ic223$;
    private static final SubLString $ic224$;
    private static final SubLSymbol $ic225$;
    
    public static SubLObject f40212(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_level$.getDynamicValue(var4) && var3.numG(print_high.$print_level$.getDynamicValue(var4))) {
            print_high.princ((SubLObject)$ic0$, var2);
        }
        else if (NIL != print_high.$print_readably$.getDynamicValue(var4)) {
            print_high.print_not_readable(var1, var2);
        }
        else {
            streams_high.write_string((SubLObject)$ic1$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var1), new SubLObject[] { $ic2$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            print_high.princ(f40213(var1), var2);
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var1;
    }
    
    public static SubLObject f40214(final SubLObject var9, final SubLObject var2) {
        f40212(var9, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40215(final SubLObject var9) {
        return (SubLObject)((var9.getClass() == $sX44265_native.class) ? T : NIL);
    }
    
    public static SubLObject f40213(final SubLObject var9) {
        assert NIL != f40215(var9) : var9;
        return var9.getField2();
    }
    
    public static SubLObject f40216(final SubLObject var9) {
        assert NIL != f40215(var9) : var9;
        return var9.getField3();
    }
    
    public static SubLObject f40217(final SubLObject var9) {
        assert NIL != f40215(var9) : var9;
        return var9.getField4();
    }
    
    public static SubLObject f40218(final SubLObject var9) {
        assert NIL != f40215(var9) : var9;
        return var9.getField5();
    }
    
    public static SubLObject f40219(final SubLObject var9) {
        assert NIL != f40215(var9) : var9;
        return var9.getField6();
    }
    
    public static SubLObject f40220(final SubLObject var9) {
        assert NIL != f40215(var9) : var9;
        return var9.getField7();
    }
    
    public static SubLObject f40221(final SubLObject var9) {
        assert NIL != f40215(var9) : var9;
        return var9.getField8();
    }
    
    public static SubLObject f40222(final SubLObject var9) {
        assert NIL != f40215(var9) : var9;
        return var9.getField9();
    }
    
    public static SubLObject f40223(final SubLObject var9) {
        assert NIL != f40215(var9) : var9;
        return var9.getField10();
    }
    
    public static SubLObject f40224(final SubLObject var9) {
        assert NIL != f40215(var9) : var9;
        return var9.getField11();
    }
    
    public static SubLObject f40225(final SubLObject var9) {
        assert NIL != f40215(var9) : var9;
        return var9.getField12();
    }
    
    public static SubLObject f40226(final SubLObject var9) {
        assert NIL != f40215(var9) : var9;
        return var9.getField13();
    }
    
    public static SubLObject f40227(final SubLObject var9) {
        assert NIL != f40215(var9) : var9;
        return var9.getField14();
    }
    
    public static SubLObject f40228(final SubLObject var9, final SubLObject var11) {
        assert NIL != f40215(var9) : var9;
        return var9.setField2(var11);
    }
    
    public static SubLObject f40229(final SubLObject var9, final SubLObject var11) {
        assert NIL != f40215(var9) : var9;
        return var9.setField3(var11);
    }
    
    public static SubLObject f40230(final SubLObject var9, final SubLObject var11) {
        assert NIL != f40215(var9) : var9;
        return var9.setField4(var11);
    }
    
    public static SubLObject f40231(final SubLObject var9, final SubLObject var11) {
        assert NIL != f40215(var9) : var9;
        return var9.setField5(var11);
    }
    
    public static SubLObject f40232(final SubLObject var9, final SubLObject var11) {
        assert NIL != f40215(var9) : var9;
        return var9.setField6(var11);
    }
    
    public static SubLObject f40233(final SubLObject var9, final SubLObject var11) {
        assert NIL != f40215(var9) : var9;
        return var9.setField7(var11);
    }
    
    public static SubLObject f40234(final SubLObject var9, final SubLObject var11) {
        assert NIL != f40215(var9) : var9;
        return var9.setField8(var11);
    }
    
    public static SubLObject f40235(final SubLObject var9, final SubLObject var11) {
        assert NIL != f40215(var9) : var9;
        return var9.setField9(var11);
    }
    
    public static SubLObject f40236(final SubLObject var9, final SubLObject var11) {
        assert NIL != f40215(var9) : var9;
        return var9.setField10(var11);
    }
    
    public static SubLObject f40237(final SubLObject var9, final SubLObject var11) {
        assert NIL != f40215(var9) : var9;
        return var9.setField11(var11);
    }
    
    public static SubLObject f40238(final SubLObject var9, final SubLObject var11) {
        assert NIL != f40215(var9) : var9;
        return var9.setField12(var11);
    }
    
    public static SubLObject f40239(final SubLObject var9, final SubLObject var11) {
        assert NIL != f40215(var9) : var9;
        return var9.setField13(var11);
    }
    
    public static SubLObject f40240(final SubLObject var9, final SubLObject var11) {
        assert NIL != f40215(var9) : var9;
        return var9.setField14(var11);
    }
    
    public static SubLObject f40241(SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLObject var13 = (SubLObject)new $sX44265_native();
        SubLObject var14;
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        for (var14 = (SubLObject)NIL, var14 = var12; NIL != var14; var14 = conses_high.cddr(var14)) {
            var15 = var14.first();
            var16 = conses_high.cadr(var14);
            var17 = var15;
            if (var17.eql((SubLObject)$ic39$)) {
                f40228(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic40$)) {
                f40229(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic41$)) {
                f40230(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic42$)) {
                f40231(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic43$)) {
                f40232(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic44$)) {
                f40233(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic45$)) {
                f40234(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic46$)) {
                f40235(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic47$)) {
                f40236(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic48$)) {
                f40237(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic49$)) {
                f40238(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic50$)) {
                f40239(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic51$)) {
                f40240(var13, var16);
            }
            else {
                Errors.error((SubLObject)$ic52$, var15);
            }
        }
        return var13;
    }
    
    public static SubLObject f40242(final SubLObject var18, final SubLObject var19) {
        Functions.funcall(var19, var18, (SubLObject)$ic53$, (SubLObject)$ic54$, (SubLObject)THIRTEEN_INTEGER);
        Functions.funcall(var19, var18, (SubLObject)$ic55$, (SubLObject)$ic39$, f40213(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic55$, (SubLObject)$ic40$, f40216(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic55$, (SubLObject)$ic41$, f40217(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic55$, (SubLObject)$ic42$, f40218(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic55$, (SubLObject)$ic43$, f40219(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic55$, (SubLObject)$ic44$, f40220(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic55$, (SubLObject)$ic45$, f40221(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic55$, (SubLObject)$ic46$, f40222(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic55$, (SubLObject)$ic47$, f40223(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic55$, (SubLObject)$ic48$, f40224(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic55$, (SubLObject)$ic49$, f40225(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic55$, (SubLObject)$ic50$, f40226(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic55$, (SubLObject)$ic51$, f40227(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic56$, (SubLObject)$ic54$, (SubLObject)THIRTEEN_INTEGER);
        return var18;
    }
    
    public static SubLObject f40243(final SubLObject var18, final SubLObject var19) {
        return f40242(var18, var19);
    }
    
    public static SubLObject f40244(final SubLObject var20) {
        return Sequences.find(var20, $g5211$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic13$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40245(final SubLObject var21) {
        final SubLObject var22 = f40244(var21);
        if (NIL != var22) {
            return f40222(var22);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40246(final SubLObject var22, SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = $g5209$.getDynamicValue();
        }
        if (NIL != var23) {
            if (NIL != f40245(var22) && f40221(var22).eql(var23)) {
                return (SubLObject)ConsesLow.list(var22);
            }
        }
        else if (NIL != f40222(var22)) {
            return (SubLObject)ConsesLow.list(var22);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40247() {
        $g5214$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40248(SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = conses_high.assoc(var23, $g5214$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).rest();
        if (NIL != var25) {
            return var25;
        }
        SubLObject var26 = (SubLObject)NIL;
        final SubLObject var27 = $g5209$.currentBinding(var24);
        try {
            $g5209$.bind(var23, var24);
            var26 = Mapping.mapcan(Symbols.symbol_function((SubLObject)$ic60$), $g5211$.getGlobalValue(), EMPTY_SUBL_OBJECT_ARRAY);
        }
        finally {
            $g5209$.rebind(var27, var24);
        }
        if (NIL != var26) {
            $g5214$.setGlobalValue(conses_high.acons(var23, var26, $g5214$.getGlobalValue()));
        }
        return var26;
    }
    
    public static SubLObject f40249(final SubLObject var27, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)T;
        }
        f40247();
        final SubLObject var29 = f40244(var27);
        if (NIL != var29) {
            f40235(var29, var28);
            return var28;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40250(final SubLObject var29) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean((NIL != module0655.$g5140$.getDynamicValue(var30) && NIL != module0659.f40064(var29)) || (NIL != module0655.$g5141$.getDynamicValue(var30) && NIL != module0659.f40063(var29)));
    }
    
    public static SubLObject f40251(final SubLObject var30, final SubLObject var31) {
        SubLObject var33;
        final SubLObject var32 = var33 = var30.rest();
        SubLObject var34 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)$ic61$);
        var34 = var33.first();
        final SubLObject var35;
        var33 = (var35 = var33.rest());
        final SubLObject var36 = Packages.intern(PrintLow.format((SubLObject)NIL, (SubLObject)$ic62$, Strings.string_upcase(Strings.string(var34), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED);
        final SubLObject var37 = Packages.intern(PrintLow.format((SubLObject)NIL, (SubLObject)$ic63$, var36), (SubLObject)UNPROVIDED);
        final SubLObject var38 = Packages.intern(PrintLow.format((SubLObject)NIL, (SubLObject)$ic64$, var37), (SubLObject)UNPROVIDED);
        final SubLObject var39 = Packages.intern(PrintLow.format((SubLObject)NIL, (SubLObject)$ic65$, var34), (SubLObject)UNPROVIDED);
        final SubLObject var40 = module0653.f39726((SubLObject)$ic45$, var35, (SubLObject)UNPROVIDED);
        return (SubLObject)ConsesLow.list((SubLObject)$ic66$, (SubLObject)ConsesLow.listS((SubLObject)$ic67$, var36, (SubLObject)$ic68$), (SubLObject)((NIL != module0653.f39726((SubLObject)$ic51$, var35, (SubLObject)UNPROVIDED)) ? ((var40 == $ic69$) ? ConsesLow.list((SubLObject)$ic66$, (SubLObject)ConsesLow.list((SubLObject)$ic70$, (SubLObject)ConsesLow.list((SubLObject)$ic71$, var34), (SubLObject)ConsesLow.list((SubLObject)$ic71$, var35), (SubLObject)ConsesLow.list((SubLObject)$ic71$, var37), (SubLObject)ConsesLow.list((SubLObject)$ic71$, var38), (SubLObject)ConsesLow.list((SubLObject)$ic71$, var39)), (SubLObject)ConsesLow.list((SubLObject)$ic72$, var39, (SubLObject)$ic73$, (SubLObject)$ic74$, (SubLObject)$ic75$, (SubLObject)ConsesLow.listS((SubLObject)$ic76$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic77$, (SubLObject)ConsesLow.list((SubLObject)$ic71$, var34)))), (SubLObject)$ic78$))) : ConsesLow.listS((SubLObject)$ic70$, (SubLObject)ConsesLow.list((SubLObject)$ic71$, var34), (SubLObject)ConsesLow.list((SubLObject)$ic71$, var35), (SubLObject)ConsesLow.list((SubLObject)$ic71$, var37), (SubLObject)ConsesLow.list((SubLObject)$ic71$, var38), (SubLObject)$ic79$)) : ConsesLow.listS((SubLObject)$ic70$, (SubLObject)ConsesLow.list((SubLObject)$ic71$, var34), (SubLObject)ConsesLow.list((SubLObject)$ic71$, var35), (SubLObject)ConsesLow.list((SubLObject)$ic71$, var37), (SubLObject)ConsesLow.list((SubLObject)$ic71$, var38), (SubLObject)$ic79$)));
    }
    
    public static SubLObject f40252(final SubLObject var20, final SubLObject var34, final SubLObject var36, final SubLObject var37, final SubLObject var38) {
        f40247();
        final SubLObject var39 = $g5211$.getGlobalValue();
        final SubLObject var40 = f40241(var34);
        f40228(var40, var20);
        if (NIL == f40216(var40)) {
            f40229(var40, var20);
        }
        f40232(var40, var36);
        f40233(var40, var37);
        Functions.funcall(var37, f40226(var40));
        $g5211$.setGlobalValue((SubLObject)ConsesLow.cons(var40, Sequences.delete(var20, var39, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic13$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
        $g5212$.setGlobalValue(conses_high.acons(f40216(var40), (SubLObject)ConsesLow.cons(var40, Sequences.delete(var20, conses_high.assoc(f40216(var40), $g5212$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).rest(), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic13$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), Sequences.delete(f40216(var40), $g5212$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic80$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
        if (NIL != var38) {
            f40236(var40, var38);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40253(final SubLObject var22, SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)NIL;
        }
        final SubLThread var42 = SubLProcess.currentSubLThread();
        if (NIL != var41) {
            final SubLObject var43 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic81$, f40213(var22));
            module0642.f39068(var43, var43, f40246(var22, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)UNPROVIDED);
        }
        else {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)TWO_INTEGER);
        }
        if (NIL != f40218(var22)) {
            module0642.f39019(f40218(var22));
        }
        module0656.f39804(f40217(var22), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic82$);
        final SubLObject var45;
        final SubLObject var44 = var45 = f40221(var22);
        if (var45.eql((SubLObject)$ic69$)) {
            SubLObject var46 = Functions.funcall(f40219(var22));
            SubLObject var47 = (SubLObject)NIL;
            var47 = var46.first();
            while (NIL != var46) {
                module0642.f39027((SubLObject)$ic83$, (SubLObject)UNPROVIDED);
                module0656.f39804(var47, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != var41) {
                    module0642.f39026((SubLObject)UNPROVIDED);
                }
                else {
                    module0642.f39032((SubLObject)UNPROVIDED);
                }
                var46 = var46.rest();
                var47 = var46.first();
            }
        }
        else if (var45.eql((SubLObject)$ic84$)) {
            module0642.f39027((SubLObject)$ic83$, (SubLObject)UNPROVIDED);
            PrintLow.format(module0015.$g131$.getDynamicValue(var42), (SubLObject)$ic85$, Functions.funcall(f40219(var22)));
        }
        if (NIL != var41) {
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0656.f39837((SubLObject)$ic86$, var22, (SubLObject)$ic87$, module0656.f39931($g5213$.getDynamicValue(var42)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != var41) {
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40254() {
        if (NIL != f40248((SubLObject)UNPROVIDED)) {
            module0642.f39019((SubLObject)$ic82$);
            Mapping.mapc(Symbols.symbol_function((SubLObject)$ic88$), f40248((SubLObject)UNPROVIDED), EMPTY_SUBL_OBJECT_ARRAY);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40255(final SubLObject var45, final SubLObject var23, final SubLObject var46, final SubLObject var47) {
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)THREE_INTEGER);
        module0666.f40467(var45, (SubLObject)$ic89$, var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0642.f39075(var45, var46, var47);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0644.f39184(var45, (SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40256(final SubLObject var48, SubLObject var49, SubLObject var50, SubLObject var51) {
        if (var49 == UNPROVIDED) {
            var49 = (SubLObject)$ic90$;
        }
        if (var50 == UNPROVIDED) {
            var50 = (SubLObject)$ic90$;
        }
        if (var51 == UNPROVIDED) {
            var51 = (SubLObject)$ic90$;
        }
        f40255(PrintLow.format((SubLObject)NIL, (SubLObject)$ic91$, var48), $ic92$, var49, (SubLObject)$ic93$);
        f40255(PrintLow.format((SubLObject)NIL, (SubLObject)$ic94$, var48), $ic92$, var50, (SubLObject)$ic93$);
        f40255(PrintLow.format((SubLObject)NIL, (SubLObject)$ic95$, var48), $ic92$, var51, (SubLObject)$ic93$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40257(final SubLObject var52, final SubLObject var53, final SubLObject var54) {
        SubLObject var55 = module0038.f2735(module0642.f39104(var52, var53));
        if ($ic90$.equalp(var55) || $g5215$.getGlobalValue().equalp(var55)) {
            var55 = (SubLObject)NIL;
        }
        else {
            var55 = module0656.f39943(var55, (SubLObject)UNPROVIDED);
            if (NIL == module0173.f10955(var55)) {
                module0656.f39789((SubLObject)$ic97$, var54, var55, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                return (SubLObject)NIL;
            }
        }
        return var55;
    }
    
    public static SubLObject f40258(final SubLObject var48, final SubLObject var53) {
        return Sequences.delete((SubLObject)NIL, (SubLObject)ConsesLow.list(f40257(PrintLow.format((SubLObject)NIL, (SubLObject)$ic91$, var48), var53, (SubLObject)$ic98$), f40257(PrintLow.format((SubLObject)NIL, (SubLObject)$ic94$, var48), var53, (SubLObject)$ic98$), f40257(PrintLow.format((SubLObject)NIL, (SubLObject)$ic95$, var48), var53, (SubLObject)$ic98$)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40259(final SubLObject var48, SubLObject var49, SubLObject var50, SubLObject var51) {
        if (var49 == UNPROVIDED) {
            var49 = $g5215$.getGlobalValue();
        }
        if (var50 == UNPROVIDED) {
            var50 = $g5215$.getGlobalValue();
        }
        if (var51 == UNPROVIDED) {
            var51 = $g5215$.getGlobalValue();
        }
        final SubLObject var52 = (SubLObject)ConsesLow.cons($g5215$.getGlobalValue(), module0220.f14565($ic99$, $ic100$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED));
        module0642.f39106(PrintLow.format((SubLObject)NIL, (SubLObject)$ic101$, var48), var49, var52, (SubLObject)UNPROVIDED);
        module0642.f39106(PrintLow.format((SubLObject)NIL, (SubLObject)$ic102$, var48), var50, var52, (SubLObject)UNPROVIDED);
        module0642.f39106(PrintLow.format((SubLObject)NIL, (SubLObject)$ic103$, var48), var51, var52, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40260(final SubLObject var48, final SubLObject var53) {
        return Sequences.delete((SubLObject)NIL, (SubLObject)ConsesLow.list(f40257(PrintLow.format((SubLObject)NIL, (SubLObject)$ic101$, var48), var53, (SubLObject)$ic104$), f40257(PrintLow.format((SubLObject)NIL, (SubLObject)$ic102$, var48), var53, (SubLObject)$ic104$), f40257(PrintLow.format((SubLObject)NIL, (SubLObject)$ic103$, var48), var53, (SubLObject)$ic104$)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40261(final SubLObject var57) {
        return f40253(var57, (SubLObject)T);
    }
    
    public static SubLObject f40262(SubLObject var53) {
        if (var53 == UNPROVIDED) {
            var53 = (SubLObject)NIL;
        }
        final SubLThread var54 = SubLProcess.currentSubLThread();
        SubLObject var56;
        final SubLObject var55 = var56 = var53;
        SubLObject var57 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)$ic107$);
        var57 = var56.first();
        var56 = var56.rest();
        if (NIL == var56) {
            final SubLObject var58 = module0656.f39969(var57);
            if (NIL == module0656.f39930(var58)) {
                module0656.f39789((SubLObject)$ic108$, var58, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                return (SubLObject)NIL;
            }
            final SubLObject var59 = (SubLObject)$ic109$;
            final SubLObject var60 = module0015.$g538$.currentBinding(var54);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var54))) ? module0015.$g538$.getDynamicValue(var54) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var54);
                module0642.f39020((SubLObject)$ic110$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var54), module0655.$g5142$.getDynamicValue(var54));
                final SubLObject var61 = module0014.f672((SubLObject)$ic111$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic112$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var61) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var61);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic113$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0016.f941();
                if (NIL != var59) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var59);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var26_64 = module0015.$g535$.currentBinding(var54);
                try {
                    module0015.$g535$.bind((SubLObject)T, var54);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var54)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var54)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic116$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var26_65 = module0015.$g533$.currentBinding(var54);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var54);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic117$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var26_66 = module0015.$g533$.currentBinding(var54);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var54);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic118$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic119$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic120$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var26_66, var54);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (NIL != var59) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            module0642.f39019(var59);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        final SubLObject var62 = module0656.f39832((SubLObject)NIL);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var54));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g285$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic121$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        if (NIL != var62) {
                            module0642.f39020(module0015.$g286$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var62);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var26_67 = module0015.$g533$.currentBinding(var54);
                        final SubLObject var63 = module0015.$g541$.currentBinding(var54);
                        final SubLObject var64 = module0015.$g539$.currentBinding(var54);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var54);
                            module0015.$g541$.bind((SubLObject)T, var54);
                            module0015.$g539$.bind(module0015.f797(), var54);
                            module0642.f39069((SubLObject)$ic122$, (SubLObject)T, (SubLObject)UNPROVIDED);
                            module0656.f39870((SubLObject)$ic105$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0642.f39073((SubLObject)$ic123$);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39074((SubLObject)$ic124$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0659.f40134(var58);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39068((SubLObject)$ic125$, (SubLObject)$ic125$, module0655.$g5140$.getDynamicValue(var54), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39027((SubLObject)$ic83$, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic126$);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39068((SubLObject)$ic127$, (SubLObject)$ic127$, module0655.$g5141$.getDynamicValue(var54), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39027((SubLObject)$ic83$, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic128$);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            SubLObject var65 = $g5212$.getGlobalValue();
                            SubLObject var66 = (SubLObject)NIL;
                            var66 = var65.first();
                            while (NIL != var65) {
                                final SubLObject var26_68 = $g5213$.currentBinding(var54);
                                try {
                                    $g5213$.bind(var58, var54);
                                    if (NIL != conses_high.endp(conses_high.cddr(var66))) {
                                        f40253(conses_high.cadr(var66), (SubLObject)T);
                                    }
                                    else {
                                        Mapping.mapc(Symbols.symbol_function((SubLObject)$ic129$), var66.rest(), EMPTY_SUBL_OBJECT_ARRAY);
                                    }
                                }
                                finally {
                                    $g5213$.rebind(var26_68, var54);
                                }
                                module0642.f39026((SubLObject)UNPROVIDED);
                                var65 = var65.rest();
                                var66 = var65.first();
                            }
                            module0015.f799(module0015.$g539$.getDynamicValue(var54));
                        }
                        finally {
                            module0015.$g539$.rebind(var64, var54);
                            module0015.$g541$.rebind(var63, var54);
                            module0015.$g533$.rebind(var26_67, var54);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var26_65, var54);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var26_64, var54);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var60, var54);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var55, (SubLObject)$ic107$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40263(SubLObject var53) {
        if (var53 == UNPROVIDED) {
            var53 = (SubLObject)NIL;
        }
        final SubLThread var54 = SubLProcess.currentSubLThread();
        SubLObject var56;
        final SubLObject var55 = var56 = var53;
        SubLObject var57 = (SubLObject)NIL;
        SubLObject var58 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)$ic131$);
        var57 = var56.first();
        var56 = var56.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)$ic131$);
        var58 = var56.first();
        var56 = var56.rest();
        if (NIL == var56) {
            final SubLObject var59 = module0656.f39969(var58);
            final SubLObject var60 = conses_high.assoc(Packages.intern(var57, (SubLObject)UNPROVIDED), $g5212$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).rest();
            if (NIL == module0656.f39930(var59)) {
                module0656.f39789((SubLObject)$ic108$, var59, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                return (SubLObject)NIL;
            }
            final SubLObject var61 = (SubLObject)$ic132$;
            final SubLObject var62 = module0015.$g538$.currentBinding(var54);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var54))) ? module0015.$g538$.getDynamicValue(var54) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var54);
                module0642.f39020((SubLObject)$ic110$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var54), module0655.$g5142$.getDynamicValue(var54));
                final SubLObject var63 = module0014.f672((SubLObject)$ic111$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic112$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var63) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var63);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic113$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0016.f941();
                if (NIL != var61) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var61);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0666.f40471();
                module0666.f40487();
                module0666.f40535();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var26_77 = module0015.$g535$.currentBinding(var54);
                try {
                    module0015.$g535$.bind((SubLObject)T, var54);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var54)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var54)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic116$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var26_78 = module0015.$g533$.currentBinding(var54);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var54);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic117$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var26_79 = module0015.$g533$.currentBinding(var54);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var54);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic118$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic119$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic120$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var26_79, var54);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (NIL != var61) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            module0642.f39019(var61);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        final SubLObject var64 = module0656.f39832((SubLObject)NIL);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var54));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g285$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic121$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        if (NIL != var64) {
                            module0642.f39020(module0015.$g286$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var64);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var26_80 = module0015.$g533$.currentBinding(var54);
                        final SubLObject var65 = module0015.$g541$.currentBinding(var54);
                        final SubLObject var66 = module0015.$g539$.currentBinding(var54);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var54);
                            module0015.$g541$.bind((SubLObject)T, var54);
                            module0015.$g539$.bind(module0015.f797(), var54);
                            module0642.f39069((SubLObject)$ic133$, (SubLObject)ConsesLow.list(var57, var58), (SubLObject)UNPROVIDED);
                            module0656.f39790((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39073((SubLObject)$ic123$);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39074((SubLObject)$ic124$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            SubLObject var67 = var60;
                            SubLObject var68 = (SubLObject)NIL;
                            var68 = var67.first();
                            while (NIL != var67) {
                                if (NIL != f40224(var68)) {
                                    Functions.funcall(f40224(var68), var68, var59);
                                }
                                var67 = var67.rest();
                                var68 = var67.first();
                            }
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39073((SubLObject)$ic123$);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39074((SubLObject)$ic124$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0015.f799(module0015.$g539$.getDynamicValue(var54));
                        }
                        finally {
                            module0015.$g539$.rebind(var66, var54);
                            module0015.$g541$.rebind(var65, var54);
                            module0015.$g533$.rebind(var26_80, var54);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var26_78, var54);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var26_77, var54);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var62, var54);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var55, (SubLObject)$ic131$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40264(final SubLObject var53) {
        module0655.$g5140$.setDynamicValue((SubLObject)makeBoolean(NIL != module0642.f39104((SubLObject)$ic125$, var53)));
        module0655.$g5141$.setDynamicValue((SubLObject)makeBoolean(NIL != module0642.f39104((SubLObject)$ic127$, var53)));
        SubLObject var54 = $g5211$.getGlobalValue();
        SubLObject var55 = (SubLObject)NIL;
        var55 = var54.first();
        while (NIL != var54) {
            f40235(var55, (SubLObject)makeBoolean(NIL != module0642.f39104(PrintLow.format((SubLObject)NIL, (SubLObject)$ic81$, f40213(var55)), var53)));
            var54 = var54.rest();
            var55 = var54.first();
        }
        f40247();
        module0656.f39793((SubLObject)$ic135$, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40265(final SubLObject var53) {
        final SubLObject var54 = reader.read_from_string(var53.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var55 = Strings.string(var54.first());
        final SubLObject var56 = conses_high.cadr(var54);
        SubLObject var58;
        final SubLObject var57 = var58 = conses_high.assoc(Packages.intern(var55, (SubLObject)UNPROVIDED), $g5212$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).rest();
        SubLObject var59 = (SubLObject)NIL;
        var59 = var58.first();
        while (NIL != var58) {
            if (NIL != f40225(var59)) {
                Functions.funcall(f40225(var59), var59, var53);
            }
            var58 = var58.rest();
            var59 = var58.first();
        }
        f40247();
        f40262((SubLObject)ConsesLow.list(var56));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40266(final SubLObject var61, SubLObject var82) {
        if (var82 == UNPROVIDED) {
            var82 = (SubLObject)NIL;
        }
        final SubLThread var83 = SubLProcess.currentSubLThread();
        if (NIL == var82) {
            var82 = (SubLObject)$ic138$;
        }
        final SubLObject var84 = module0656.f39832((SubLObject)$ic139$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var83), (SubLObject)$ic140$, module0656.f39931(var61));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var84) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var84);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var85 = module0015.$g533$.currentBinding(var83);
        try {
            module0015.$g533$.bind((SubLObject)T, var83);
            module0642.f39019(var82);
        }
        finally {
            module0015.$g533$.rebind(var85, var83);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var61;
    }
    
    public static SubLObject f40267(final SubLObject var22, final SubLObject var61) {
        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        if (NIL != f40218(var22)) {
            module0642.f39019(f40218(var22));
        }
        module0642.f39019((SubLObject)$ic143$);
        module0656.f39804(f40217(var22), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic144$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40268(final SubLObject var22, final SubLObject var61) {
        f40267(var22, var61);
        module0642.f39032((SubLObject)TWO_INTEGER);
        module0642.f39019((SubLObject)$ic145$);
        module0656.f39804(f40217(var22), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic146$);
        module0642.f39026((SubLObject)UNPROVIDED);
        Functions.apply(Symbols.symbol_function((SubLObject)$ic147$), (SubLObject)ConsesLow.cons(f40213(var22), Functions.funcall(f40219(var22))));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40269(final SubLObject var22, final SubLObject var61) {
        f40267(var22, var61);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic148$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)SIX_INTEGER);
        module0642.f39068(PrintLow.format((SubLObject)NIL, (SubLObject)$ic149$, f40213(var22)), (SubLObject)$ic150$, f40222(var22), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)FOUR_INTEGER);
        module0656.f39972(Functions.funcall(f40219(var22)), PrintLow.format((SubLObject)NIL, (SubLObject)$ic151$, f40213(var22)));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40270(final SubLObject var22, final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        f40267(var22, var61);
        module0642.f39026((SubLObject)UNPROVIDED);
        final SubLObject var63 = module0217.f14363(var61);
        final SubLObject var64 = conses_high.copy_list(var63);
        final SubLObject var65 = module0213.f13926(conses_high.union(var64, conses_high.copy_list(f40271()), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var66 = module0015.$g533$.currentBinding(var62);
        final SubLObject var67 = module0015.$g542$.currentBinding(var62);
        try {
            module0015.$g533$.bind((SubLObject)T, var62);
            module0015.$g542$.bind((SubLObject)THREE_INTEGER, var62);
            SubLObject var68 = (SubLObject)ZERO_INTEGER;
            SubLObject var69 = Numbers.max((SubLObject)ONE_INTEGER, Numbers.subtract(module0015.$g542$.getDynamicValue(var62), var68));
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var26_89 = module0015.$g533$.currentBinding(var62);
            try {
                module0015.$g533$.bind((SubLObject)T, var62);
                module0642.f39084(var68);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                if (NIL != var69) {
                    module0642.f39020(module0015.$g371$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var69);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var26_90 = module0015.$g533$.currentBinding(var62);
                try {
                    module0015.$g533$.bind((SubLObject)T, var62);
                    module0642.f39072((SubLObject)$ic152$, (SubLObject)$ic153$, (SubLObject)makeBoolean(NIL == f40245((SubLObject)$ic154$)), (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic155$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0642.f39072((SubLObject)$ic152$, (SubLObject)$ic150$, f40245((SubLObject)$ic154$), (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic156$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var26_90, var62);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var26_89, var62);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            var68 = (SubLObject)ONE_INTEGER;
            var69 = Numbers.max((SubLObject)ONE_INTEGER, Numbers.subtract(module0015.$g542$.getDynamicValue(var62), var68));
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var26_91 = module0015.$g533$.currentBinding(var62);
            try {
                module0015.$g533$.bind((SubLObject)T, var62);
                module0642.f39084(var68);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                if (NIL != var69) {
                    module0642.f39020(module0015.$g371$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var69);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var26_92 = module0015.$g533$.currentBinding(var62);
                try {
                    module0015.$g533$.bind((SubLObject)T, var62);
                    module0642.f39068((SubLObject)$ic157$, (SubLObject)$ic153$, module0655.f39751(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic158$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39026((SubLObject)UNPROVIDED);
                    SubLObject var70 = var65;
                    SubLObject var71 = (SubLObject)NIL;
                    var71 = var70.first();
                    while (NIL != var70) {
                        module0642.f39020(module0015.$g459$.getGlobalValue());
                        module0642.f39068((SubLObject)$ic159$, var71, conses_high.member(var71, f40271(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g460$.getGlobalValue());
                        if (NIL != module0004.f104(var71, var63, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0656.f39804(var71, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                        }
                        else {
                            module0656.f39804(var71, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39032((SubLObject)TWO_INTEGER);
                        var70 = var70.rest();
                        var71 = var70.first();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var26_92, var62);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var26_91, var62);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39083((SubLObject)THREE_INTEGER);
        }
        finally {
            module0015.$g542$.rebind(var67, var62);
            module0015.$g533$.rebind(var66, var62);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40272(final SubLObject var22, final SubLObject var61) {
        f40267(var22, var61);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic145$);
        module0656.f39804(f40217(var22), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic146$);
        module0642.f39026((SubLObject)UNPROVIDED);
        Functions.apply(Symbols.symbol_function((SubLObject)$ic160$), (SubLObject)ConsesLow.cons(f40213(var22), Functions.funcall(f40219(var22))));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40273(final SubLObject var22, final SubLObject var53) {
        final SubLObject var54 = f40258(f40213(var22), var53);
        Functions.funcall(f40220(var22), var54);
        f40235(var22, (SubLObject)makeBoolean(NIL != var54));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40274(final SubLObject var22, final SubLObject var53) {
        final SubLObject var54 = f40260(f40213(var22), var53);
        Functions.funcall(f40220(var22), var54);
        f40235(var22, (SubLObject)makeBoolean(NIL != var54));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40275(final SubLObject var22, final SubLObject var53) {
        final SubLObject var54 = module0642.f39104(PrintLow.format((SubLObject)NIL, (SubLObject)$ic149$, f40213(var22)), var53);
        if (var54.equal((SubLObject)$ic150$)) {
            f40235(var22, (SubLObject)T);
            Functions.funcall(f40220(var22), module0656.f39973(PrintLow.format((SubLObject)NIL, (SubLObject)$ic151$, f40213(var22)), var53));
        }
        else {
            f40235(var22, (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40276(final SubLObject var22, final SubLObject var53) {
        final SubLObject var54 = module0642.f39104((SubLObject)$ic152$, var53);
        final SubLObject var55 = module0642.f39104((SubLObject)$ic157$, var53);
        final SubLObject var56 = module0642.f39109((SubLObject)$ic159$, var53);
        if (NIL != var55) {
            module0655.f39752((SubLObject)T);
        }
        else {
            module0655.f39752((SubLObject)NIL);
        }
        if (var54.equal((SubLObject)$ic153$)) {
            f40235(var22, (SubLObject)NIL);
            Functions.funcall(f40220(var22), (SubLObject)NIL);
        }
        else {
            f40235(var22, (SubLObject)T);
            Functions.funcall(f40220(var22), (SubLObject)NIL);
            SubLObject var57 = var56;
            SubLObject var58 = (SubLObject)NIL;
            var58 = var57.first();
            while (NIL != var57) {
                Functions.funcall(f40220(var22), (SubLObject)ConsesLow.cons(module0656.f39943(var58, (SubLObject)UNPROVIDED), Functions.funcall(f40219(var22))));
                var57 = var57.rest();
                var58 = var57.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40277(final SubLObject var29) {
        return (SubLObject)makeBoolean(NIL != f40250(var29) || NIL == module0178.f11296(var29) || module0178.f11296(var29).numLE(f40278()));
    }
    
    public static SubLObject f40279(final SubLObject var29) {
        return (SubLObject)makeBoolean(NIL != f40250(var29) || NIL == module0178.f11296(var29) || f40280().numLE(module0178.f11296(var29)));
    }
    
    public static SubLObject f40281() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return $g5216$.getDynamicValue(var4);
    }
    
    public static SubLObject f40282(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        $g5216$.setDynamicValue(var99, var100);
        return $g5216$.getDynamicValue(var100);
    }
    
    public static SubLObject f40283() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return $g5217$.getDynamicValue(var4);
    }
    
    public static SubLObject f40284(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        $g5217$.setDynamicValue(var99, var100);
        return $g5217$.getDynamicValue(var100);
    }
    
    public static SubLObject f40285(final SubLObject var29) {
        if (NIL == assertion_handles_oc.f11035(var29)) {
            Errors.sublisp_break((SubLObject)$ic168$, EMPTY_SUBL_OBJECT_ARRAY);
        }
        if (NIL != f40250(var29)) {
            return (SubLObject)T;
        }
        final SubLObject var30 = f40244((SubLObject)$ic163$);
        return conses_high.member(Functions.funcall(f40227(var30), var29), Functions.funcall(f40219(var30)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40286() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return $g5218$.getDynamicValue(var4);
    }
    
    public static SubLObject f40287(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        $g5218$.setDynamicValue(var99, var100);
        return $g5218$.getDynamicValue(var100);
    }
    
    public static SubLObject f40288() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return $g5219$.getDynamicValue(var4);
    }
    
    public static SubLObject f40289(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        $g5219$.setDynamicValue(var99, var100);
        return $g5219$.getDynamicValue(var100);
    }
    
    public static SubLObject f40290(final SubLObject var29) {
        if (NIL == assertion_handles_oc.f11035(var29)) {
            Errors.sublisp_break((SubLObject)$ic168$, EMPTY_SUBL_OBJECT_ARRAY);
        }
        if (NIL != f40250(var29)) {
            return (SubLObject)T;
        }
        final SubLObject var30 = f40244((SubLObject)$ic171$);
        return conses_high.member(Functions.funcall(f40227(var30), var29), Functions.funcall(f40219(var30)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40291() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return $g5220$.getDynamicValue(var4);
    }
    
    public static SubLObject f40292(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        $g5220$.setDynamicValue(var99, var100);
        return $g5220$.getDynamicValue(var100);
    }
    
    public static SubLObject f40280() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return $g5221$.getDynamicValue(var4);
    }
    
    public static SubLObject f40293(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        $g5221$.setDynamicValue(var99, var100);
        return $g5221$.getDynamicValue(var100);
    }
    
    public static SubLObject f40294() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return $g5222$.getDynamicValue(var4);
    }
    
    public static SubLObject f40295(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        $g5222$.setDynamicValue(var99, var100);
        return $g5222$.getDynamicValue(var100);
    }
    
    public static SubLObject f40278() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return $g5223$.getDynamicValue(var4);
    }
    
    public static SubLObject f40296(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        $g5223$.setDynamicValue(var99, var100);
        return $g5223$.getDynamicValue(var100);
    }
    
    public static SubLObject f40297() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return $g5224$.getDynamicValue(var4);
    }
    
    public static SubLObject f40298(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        $g5224$.setDynamicValue(var99, var100);
        return $g5224$.getDynamicValue(var100);
    }
    
    public static SubLObject f40271() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return $g5225$.getDynamicValue(var4);
    }
    
    public static SubLObject f40299(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        $g5225$.setDynamicValue(var99, var100);
        return $g5225$.getDynamicValue(var100);
    }
    
    public static SubLObject f40300() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return $g5226$.getDynamicValue(var4);
    }
    
    public static SubLObject f40301(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        $g5226$.setDynamicValue(var99, var100);
        return $g5226$.getDynamicValue(var100);
    }
    
    public static SubLObject f40302() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return $g5227$.getDynamicValue(var4);
    }
    
    public static SubLObject f40303(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        $g5227$.setDynamicValue(var99, var100);
        return $g5227$.getDynamicValue(var100);
    }
    
    public static SubLObject f40304(final SubLObject var29) {
        if (NIL == assertion_handles_oc.f11035(var29)) {
            Errors.sublisp_break((SubLObject)$ic168$, EMPTY_SUBL_OBJECT_ARRAY);
        }
        if (NIL != f40250(var29)) {
            return (SubLObject)T;
        }
        final SubLObject var30 = f40244((SubLObject)$ic195$);
        return conses_high.member(Functions.funcall(f40227(var30), var29), Functions.funcall(f40219(var30)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40305() {
        final SubLObject var100 = f40248((SubLObject)UNPROVIDED);
        if (NIL == var100) {
            return (SubLObject)NIL;
        }
        if (NIL != conses_high.endp(var100.rest())) {
            return f40223(var100.first());
        }
        return (SubLObject)$ic200$;
    }
    
    public static SubLObject f40306(final SubLObject var29) {
        SubLObject var31;
        final SubLObject var30 = var31 = f40248((SubLObject)UNPROVIDED);
        SubLObject var32 = (SubLObject)NIL;
        var32 = var31.first();
        while (NIL != var31) {
            if (NIL == Functions.funcall(f40223(var32), var29)) {
                return (SubLObject)NIL;
            }
            var31 = var31.rest();
            var32 = var31.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f40307(final SubLObject var30, final SubLObject var31) {
        final SubLObject var32 = var30.rest();
        final SubLObject var34;
        final SubLObject var33 = var34 = var32;
        return (SubLObject)ConsesLow.list((SubLObject)$ic76$, (SubLObject)$ic201$, reader.bq_cons((SubLObject)$ic66$, ConsesLow.append(var34, (SubLObject)NIL)));
    }
    
    public static SubLObject f40308(final SubLObject var30, final SubLObject var31) {
        SubLObject var33;
        final SubLObject var32 = var33 = var30.rest();
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)$ic202$);
        var34 = var33.first();
        var33 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)$ic202$);
        var35 = var33.first();
        var33 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)$ic202$);
        var36 = var33.first();
        var33 = var33.rest();
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var38 = var33;
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var113_114 = (SubLObject)NIL;
        while (NIL != var38) {
            cdestructuring_bind.destructuring_bind_must_consp(var38, var32, (SubLObject)$ic202$);
            var113_114 = var38.first();
            var38 = var38.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var38, var32, (SubLObject)$ic202$);
            if (NIL == conses_high.member(var113_114, (SubLObject)$ic203$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var39 = (SubLObject)T;
            }
            if (var113_114 == $ic204$) {
                var37 = var38.first();
            }
            var38 = var38.rest();
        }
        if (NIL != var39 && NIL == var37) {
            cdestructuring_bind.cdestructuring_bind_error(var32, (SubLObject)$ic202$);
        }
        final SubLObject var40 = cdestructuring_bind.property_list_member((SubLObject)$ic205$, var33);
        final SubLObject var41 = (SubLObject)((NIL != var40) ? conses_high.cadr(var40) : NIL);
        return (SubLObject)ConsesLow.list((SubLObject)$ic206$, (SubLObject)ConsesLow.list((SubLObject)$ic207$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic208$, (SubLObject)$ic209$, (SubLObject)ConsesLow.list((SubLObject)$ic210$, var41)), (SubLObject)ConsesLow.list((SubLObject)$ic211$, (SubLObject)$ic212$, (SubLObject)ConsesLow.list((SubLObject)$ic213$, (SubLObject)$ic214$, (SubLObject)ConsesLow.list((SubLObject)$ic215$, var34, var35)), (SubLObject)ConsesLow.list((SubLObject)$ic216$, (SubLObject)$ic214$, (SubLObject)ConsesLow.list((SubLObject)$ic215$, var34, var35)))), (SubLObject)ConsesLow.list((SubLObject)T, (SubLObject)ConsesLow.list((SubLObject)$ic215$, var34, var36))));
    }
    
    public static SubLObject f40309(final SubLObject var30, final SubLObject var31) {
        SubLObject var33;
        final SubLObject var32 = var33 = var30.rest();
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)$ic217$);
        var34 = var33.first();
        var33 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)$ic217$);
        var35 = var33.first();
        var33 = var33.rest();
        if (NIL == var33) {
            final SubLObject var36 = (SubLObject)$ic218$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic76$, (SubLObject)ConsesLow.list(var36), (SubLObject)ConsesLow.list((SubLObject)$ic206$, (SubLObject)ConsesLow.list((SubLObject)$ic211$, (SubLObject)$ic209$, (SubLObject)ConsesLow.list((SubLObject)$ic215$, var36, var34), (SubLObject)ConsesLow.list((SubLObject)$ic215$, var36, var35))), (SubLObject)ConsesLow.list((SubLObject)$ic219$, var36));
        }
        cdestructuring_bind.cdestructuring_bind_error(var32, (SubLObject)$ic217$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40310(final SubLObject var22, SubLObject var82, SubLObject var61) {
        if (var82 == UNPROVIDED) {
            var82 = (SubLObject)NIL;
        }
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)NIL;
        }
        final SubLThread var83 = SubLProcess.currentSubLThread();
        if (NIL == var82) {
            var82 = f40213(var22);
        }
        SubLObject var84 = (SubLObject)$ic220$;
        final SubLObject var85 = module0655.$g5132$.getDynamicValue(var83);
        if (var85 == $ic221$) {
            var84 = (SubLObject)$ic222$;
        }
        final SubLObject var86 = module0656.f39832(var85);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        if (NIL != var61) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var83), (SubLObject)$ic223$, new SubLObject[] { var84, f40216(var22), var61 });
        }
        else {
            PrintLow.format(module0015.$g131$.getDynamicValue(var83), (SubLObject)$ic224$, var84, f40216(var22));
        }
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var86) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var86);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var87 = module0015.$g533$.currentBinding(var83);
        try {
            module0015.$g533$.bind((SubLObject)T, var83);
            module0642.f39019(var82);
        }
        finally {
            module0015.$g533$.rebind(var87, var83);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var22;
    }
    
    public static SubLObject f40311() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40212", "S#44267", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40214", "S#44268", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40215", "S#44266", 1, 0, false);
        new $f40215$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40213", "S#44269", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40216", "S#44270", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40217", "S#44271", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40218", "S#44272", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40219", "S#44273", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40220", "S#44274", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40221", "S#44275", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40222", "S#44276", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40223", "S#44277", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40224", "S#44278", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40225", "S#44279", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40226", "S#44280", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40227", "S#44281", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40228", "S#44282", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40229", "S#44283", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40230", "S#44284", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40231", "S#44285", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40232", "S#44286", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40233", "S#44287", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40234", "S#44288", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40235", "S#44289", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40236", "S#44290", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40237", "S#44291", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40238", "S#44292", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40239", "S#44293", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40240", "S#44294", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40241", "S#44295", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40242", "S#44296", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40243", "S#44297", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40244", "S#44298", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40245", "S#44299", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40246", "S#44300", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40247", "S#44301", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40248", "S#44302", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40249", "S#44303", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40250", "S#44304", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0661", "f40251", "S#44305");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40252", "S#44306", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40253", "S#44307", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40254", "S#44308", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40255", "S#44309", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40256", "S#44310", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40257", "S#44311", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40258", "S#44312", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40259", "S#44313", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40260", "S#44314", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40261", "S#44315", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40262", "CB-VIEWPOINT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40263", "CB-EV", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40264", "CB-VIEWPOINT-SUMMARY-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40265", "CB-VIEWPOINT-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40266", "S#44316", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40267", "S#44317", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40268", "S#44318", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40269", "S#44319", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40270", "S#44320", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40272", "S#44321", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40273", "S#44322", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40274", "S#44323", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40275", "S#44324", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40276", "S#44325", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40277", "S#44326", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40279", "S#44327", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40281", "S#44328", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40282", "S#44329", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40283", "S#44330", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40284", "S#44331", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40285", "S#44332", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40286", "S#44333", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40287", "S#44334", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40288", "S#44335", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40289", "S#44336", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40290", "S#44337", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40291", "S#44338", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40292", "S#44339", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40280", "S#44340", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40293", "S#44341", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40294", "S#44342", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40295", "S#44343", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40278", "S#44344", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40296", "S#44345", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40297", "S#44346", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40298", "S#44347", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40271", "S#44348", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40299", "S#44349", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40300", "S#44350", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40301", "S#44351", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40302", "S#44352", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40303", "S#44353", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40304", "S#44354", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40305", "S#44355", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40306", "S#44356", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0661", "f40307", "S#44357");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0661", "f40308", "S#44358");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0661", "f40309", "S#44359");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0661", "f40310", "S#44360", 1, 2, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40312() {
        $g5209$ = SubLFiles.defparameter("S#44361", (SubLObject)NIL);
        $g5210$ = SubLFiles.defconstant("S#44362", (SubLObject)$ic4$);
        $g5211$ = SubLFiles.deflexical("S#44363", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic58$)) ? $g5211$.getGlobalValue() : NIL));
        $g5212$ = SubLFiles.deflexical("S#44364", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic59$)) ? $g5212$.getGlobalValue() : NIL));
        $g5213$ = SubLFiles.defparameter("S#44365", (SubLObject)NIL);
        $g5214$ = SubLFiles.deflexical("S#44366", (SubLObject)NIL);
        $g5215$ = SubLFiles.deflexical("S#44367", (SubLObject)$ic96$);
        $g5216$ = SubLFiles.defparameter("S#44368", (SubLObject)NIL);
        $g5217$ = SubLFiles.defparameter("S#44369", (SubLObject)NIL);
        $g5218$ = SubLFiles.defparameter("S#44370", (SubLObject)NIL);
        $g5219$ = SubLFiles.defparameter("S#44371", (SubLObject)NIL);
        $g5220$ = SubLFiles.defparameter("S#44372", (SubLObject)NIL);
        $g5221$ = SubLFiles.defparameter("S#44373", (SubLObject)NIL);
        $g5222$ = SubLFiles.defparameter("S#44374", (SubLObject)NIL);
        $g5223$ = SubLFiles.defparameter("S#44375", (SubLObject)NIL);
        $g5224$ = SubLFiles.defparameter("S#44376", (SubLObject)NIL);
        $g5225$ = SubLFiles.defparameter("S#44377", (SubLObject)NIL);
        $g5226$ = SubLFiles.defparameter("S#44378", (SubLObject)NIL);
        $g5227$ = SubLFiles.defparameter("S#44379", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40313() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g5210$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic11$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Structures.def_csetf((SubLObject)$ic17$, (SubLObject)$ic18$);
        Structures.def_csetf((SubLObject)$ic19$, (SubLObject)$ic20$);
        Structures.def_csetf((SubLObject)$ic21$, (SubLObject)$ic22$);
        Structures.def_csetf((SubLObject)$ic23$, (SubLObject)$ic24$);
        Structures.def_csetf((SubLObject)$ic25$, (SubLObject)$ic26$);
        Structures.def_csetf((SubLObject)$ic27$, (SubLObject)$ic28$);
        Structures.def_csetf((SubLObject)$ic29$, (SubLObject)$ic30$);
        Structures.def_csetf((SubLObject)$ic31$, (SubLObject)$ic32$);
        Structures.def_csetf((SubLObject)$ic33$, (SubLObject)$ic34$);
        Structures.def_csetf((SubLObject)$ic35$, (SubLObject)$ic36$);
        Structures.def_csetf((SubLObject)$ic37$, (SubLObject)$ic38$);
        Equality.identity((SubLObject)$ic4$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g5210$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic57$));
        module0003.f57((SubLObject)$ic58$);
        module0003.f57((SubLObject)$ic59$);
        Hashtables.sethash((SubLObject)$ic105$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic106$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic130$);
        module0015.f873((SubLObject)$ic134$);
        module0015.f873((SubLObject)$ic136$);
        module0015.f873((SubLObject)$ic137$);
        module0656.f39840((SubLObject)$ic141$, (SubLObject)$ic142$, (SubLObject)TWO_INTEGER);
        module0012.f441((SubLObject)$ic161$);
        module0012.f441((SubLObject)$ic162$);
        f40252((SubLObject)$ic163$, (SubLObject)$ic164$, (SubLObject)$ic165$, (SubLObject)$ic166$, (SubLObject)$ic167$);
        module0012.f441((SubLObject)$ic169$);
        module0012.f441((SubLObject)$ic170$);
        f40252((SubLObject)$ic171$, (SubLObject)$ic172$, (SubLObject)$ic173$, (SubLObject)$ic174$, (SubLObject)$ic175$);
        module0012.f441((SubLObject)$ic176$);
        module0012.f441((SubLObject)$ic177$);
        f40252((SubLObject)$ic178$, (SubLObject)$ic179$, (SubLObject)$ic180$, (SubLObject)$ic181$, (SubLObject)NIL);
        module0012.f441((SubLObject)$ic182$);
        module0012.f441((SubLObject)$ic183$);
        f40252((SubLObject)$ic184$, (SubLObject)$ic185$, (SubLObject)$ic186$, (SubLObject)$ic187$, (SubLObject)NIL);
        module0012.f441((SubLObject)$ic188$);
        module0012.f441((SubLObject)$ic189$);
        f40252((SubLObject)$ic154$, (SubLObject)$ic190$, (SubLObject)$ic191$, (SubLObject)$ic192$, (SubLObject)NIL);
        module0012.f441((SubLObject)$ic193$);
        module0012.f441((SubLObject)$ic194$);
        f40252((SubLObject)$ic195$, (SubLObject)$ic196$, (SubLObject)$ic197$, (SubLObject)$ic198$, (SubLObject)$ic199$);
        module0656.f39840((SubLObject)$ic86$, (SubLObject)$ic225$, (SubLObject)THREE_INTEGER);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f40311();
    }
    
    public void initializeVariables() {
        f40312();
    }
    
    public void runTopLevelForms() {
        f40313();
    }
    
    static {
        me = (SubLFile)new module0661();
        $g5209$ = null;
        $g5210$ = null;
        $g5211$ = null;
        $g5212$ = null;
        $g5213$ = null;
        $g5214$ = null;
        $g5215$ = null;
        $g5216$ = null;
        $g5217$ = null;
        $g5218$ = null;
        $g5219$ = null;
        $g5220$ = null;
        $g5221$ = null;
        $g5222$ = null;
        $g5223$ = null;
        $g5224$ = null;
        $g5225$ = null;
        $g5226$ = null;
        $g5227$ = null;
        $ic0$ = makeString("#");
        $ic1$ = makeString("#<");
        $ic2$ = makeKeyword("STREAM");
        $ic3$ = makeKeyword("BASE");
        $ic4$ = makeSymbol("S#44265", "CYC");
        $ic5$ = makeSymbol("S#44266", "CYC");
        $ic6$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#29", "CYC"), makeSymbol("S#44380", "CYC"), makeSymbol("S#44381", "CYC"), makeSymbol("S#44382", "CYC"), makeSymbol("S#44383", "CYC"), makeSymbol("S#44384", "CYC"), makeSymbol("TYPE"), makeSymbol("S#44171", "CYC"), makeSymbol("S#44176", "CYC"), makeSymbol("S#44385", "CYC"), makeSymbol("S#44386", "CYC"), makeSymbol("S#44387", "CYC"), makeSymbol("S#44388", "CYC") });
        $ic7$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeKeyword("SUMMARY-NAME"), makeKeyword("LINKABLE-NAME"), makeKeyword("LINKNAME-PREFIX"), makeKeyword("FILTER-GETTER"), makeKeyword("FILTER-SETTER"), makeKeyword("TYPE"), makeKeyword("ACTIVE-P"), makeKeyword("EFFECTIVE-FN"), makeKeyword("VALUE-PROMPT-FN"), makeKeyword("VALUE-UPDATE-FN"), makeKeyword("INITIAL-FILTER-VALUE"), makeKeyword("EFFECTIVE-FN-SLOTNAME") });
        $ic8$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#44269", "CYC"), makeSymbol("S#44270", "CYC"), makeSymbol("S#44271", "CYC"), makeSymbol("S#44272", "CYC"), makeSymbol("S#44273", "CYC"), makeSymbol("S#44274", "CYC"), makeSymbol("S#44275", "CYC"), makeSymbol("S#44276", "CYC"), makeSymbol("S#44277", "CYC"), makeSymbol("S#44278", "CYC"), makeSymbol("S#44279", "CYC"), makeSymbol("S#44280", "CYC"), makeSymbol("S#44281", "CYC") });
        $ic9$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#44282", "CYC"), makeSymbol("S#44283", "CYC"), makeSymbol("S#44284", "CYC"), makeSymbol("S#44285", "CYC"), makeSymbol("S#44286", "CYC"), makeSymbol("S#44287", "CYC"), makeSymbol("S#44288", "CYC"), makeSymbol("S#44289", "CYC"), makeSymbol("S#44290", "CYC"), makeSymbol("S#44291", "CYC"), makeSymbol("S#44292", "CYC"), makeSymbol("S#44293", "CYC"), makeSymbol("S#44294", "CYC") });
        $ic10$ = makeSymbol("S#44267", "CYC");
        $ic11$ = makeSymbol("S#44268", "CYC");
        $ic12$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#44266", "CYC"));
        $ic13$ = makeSymbol("S#44269", "CYC");
        $ic14$ = makeSymbol("S#44282", "CYC");
        $ic15$ = makeSymbol("S#44270", "CYC");
        $ic16$ = makeSymbol("S#44283", "CYC");
        $ic17$ = makeSymbol("S#44271", "CYC");
        $ic18$ = makeSymbol("S#44284", "CYC");
        $ic19$ = makeSymbol("S#44272", "CYC");
        $ic20$ = makeSymbol("S#44285", "CYC");
        $ic21$ = makeSymbol("S#44273", "CYC");
        $ic22$ = makeSymbol("S#44286", "CYC");
        $ic23$ = makeSymbol("S#44274", "CYC");
        $ic24$ = makeSymbol("S#44287", "CYC");
        $ic25$ = makeSymbol("S#44275", "CYC");
        $ic26$ = makeSymbol("S#44288", "CYC");
        $ic27$ = makeSymbol("S#44276", "CYC");
        $ic28$ = makeSymbol("S#44289", "CYC");
        $ic29$ = makeSymbol("S#44277", "CYC");
        $ic30$ = makeSymbol("S#44290", "CYC");
        $ic31$ = makeSymbol("S#44278", "CYC");
        $ic32$ = makeSymbol("S#44291", "CYC");
        $ic33$ = makeSymbol("S#44279", "CYC");
        $ic34$ = makeSymbol("S#44292", "CYC");
        $ic35$ = makeSymbol("S#44280", "CYC");
        $ic36$ = makeSymbol("S#44293", "CYC");
        $ic37$ = makeSymbol("S#44281", "CYC");
        $ic38$ = makeSymbol("S#44294", "CYC");
        $ic39$ = makeKeyword("NAME");
        $ic40$ = makeKeyword("SUMMARY-NAME");
        $ic41$ = makeKeyword("LINKABLE-NAME");
        $ic42$ = makeKeyword("LINKNAME-PREFIX");
        $ic43$ = makeKeyword("FILTER-GETTER");
        $ic44$ = makeKeyword("FILTER-SETTER");
        $ic45$ = makeKeyword("TYPE");
        $ic46$ = makeKeyword("ACTIVE-P");
        $ic47$ = makeKeyword("EFFECTIVE-FN");
        $ic48$ = makeKeyword("VALUE-PROMPT-FN");
        $ic49$ = makeKeyword("VALUE-UPDATE-FN");
        $ic50$ = makeKeyword("INITIAL-FILTER-VALUE");
        $ic51$ = makeKeyword("EFFECTIVE-FN-SLOTNAME");
        $ic52$ = makeString("Invalid slot ~S for construction function");
        $ic53$ = makeKeyword("BEGIN");
        $ic54$ = makeSymbol("S#44295", "CYC");
        $ic55$ = makeKeyword("SLOT");
        $ic56$ = makeKeyword("END");
        $ic57$ = makeSymbol("S#44297", "CYC");
        $ic58$ = makeSymbol("S#44363", "CYC");
        $ic59$ = makeSymbol("S#44364", "CYC");
        $ic60$ = makeSymbol("S#44300", "CYC");
        $ic61$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#30", "CYC"));
        $ic62$ = makeString("~A-FILTER");
        $ic63$ = makeString("CB-~A");
        $ic64$ = makeString("SET-~A");
        $ic65$ = makeString("~A-EFFECTIVE-FN");
        $ic66$ = makeSymbol("PROGN");
        $ic67$ = makeSymbol("S#43625", "CYC");
        $ic68$ = ConsesLow.list((SubLObject)NIL, (SubLObject)makeString("Automatically generated filter"));
        $ic69$ = makeKeyword("LIST-OF-FORMS");
        $ic70$ = makeSymbol("S#44306", "CYC");
        $ic71$ = makeSymbol("QUOTE");
        $ic72$ = makeSymbol("DEFINE");
        $ic73$ = ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"));
        $ic74$ = ConsesLow.list((SubLObject)makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ASSERTION-P"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("BREAK"), (SubLObject)makeString("not an assertion")));
        $ic75$ = ConsesLow.list((SubLObject)makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#44304", "CYC"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("RET"), (SubLObject)T));
        $ic76$ = makeSymbol("CLET");
        $ic77$ = makeSymbol("S#44298", "CYC");
        $ic78$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCALL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#44281", "CYC"), (SubLObject)makeSymbol("S#44265", "CYC")), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCALL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#44273", "CYC"), (SubLObject)makeSymbol("S#44265", "CYC"))))));
        $ic79$ = ConsesLow.list((SubLObject)NIL);
        $ic80$ = makeSymbol("CAR");
        $ic81$ = makeString("activate-~A");
        $ic82$ = makeString(":");
        $ic83$ = makeKeyword("NBSP");
        $ic84$ = makeKeyword("SINGLE-SIMPLE-DATE");
        $ic85$ = makeString("~D");
        $ic86$ = makeKeyword("EDIT-VIEWPOINT");
        $ic87$ = makeString("Edit");
        $ic88$ = makeSymbol("S#44307", "CYC");
        $ic89$ = makeString("Complete");
        $ic90$ = makeString("");
        $ic91$ = makeString("cb-show-cyclist-~A");
        $ic92$ = constant_handles_oc.f8479((SubLObject)makeString("Cyclist"));
        $ic93$ = makeInteger(24);
        $ic94$ = makeString("cb-show-cyclist1-~A");
        $ic95$ = makeString("cb-show-cyclist2-~A");
        $ic96$ = makeString("--------");
        $ic97$ = makeString("Unknown ~A: ~S");
        $ic98$ = makeString("cyclist");
        $ic99$ = constant_handles_oc.f8479((SubLObject)makeString("Cyc-BasedProject"));
        $ic100$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic101$ = makeString("project1-~A");
        $ic102$ = makeString("project2-~A");
        $ic103$ = makeString("project3-~A");
        $ic104$ = makeString("project");
        $ic105$ = makeKeyword("CB-VIEWPOINT");
        $ic106$ = makeString("cb-viewpoint.html");
        $ic107$ = ConsesLow.list((SubLObject)makeSymbol("S#44182", "CYC"));
        $ic108$ = makeString("~a does not specify an index");
        $ic109$ = makeString("Viewpoint Filter Summary");
        $ic110$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic111$ = makeKeyword("CB-CYC");
        $ic112$ = makeString("stylesheet");
        $ic113$ = makeString("text/css");
        $ic114$ = makeKeyword("SHA1");
        $ic115$ = makeString("text/javascript");
        $ic116$ = makeString("yui-skin-sam");
        $ic117$ = makeString("reloadFrameButton");
        $ic118$ = makeString("button");
        $ic119$ = makeString("reload");
        $ic120$ = makeString("Refresh Frames");
        $ic121$ = makeString("post");
        $ic122$ = makeString("cb-viewpoint-summary-handler");
        $ic123$ = makeString("Current Values");
        $ic124$ = makeString("Update Filter Settings");
        $ic125$ = makeString("always-show-comments");
        $ic126$ = makeString("Always show comments, regardless of other filter settings.");
        $ic127$ = makeString("always-show-bookkeeping");
        $ic128$ = makeString("Always show bookkeeping predicates, regardless of other filter settings.");
        $ic129$ = makeSymbol("S#44315", "CYC");
        $ic130$ = makeSymbol("CB-VIEWPOINT");
        $ic131$ = ConsesLow.list((SubLObject)makeSymbol("S#44380", "CYC"), (SubLObject)makeSymbol("S#44182", "CYC"));
        $ic132$ = makeString("Viewpoint Filters");
        $ic133$ = makeString("cb-viewpoint-handler");
        $ic134$ = makeSymbol("CB-EV");
        $ic135$ = makeString("Summary filters have been changed");
        $ic136$ = makeSymbol("CB-VIEWPOINT-SUMMARY-HANDLER");
        $ic137$ = makeSymbol("CB-VIEWPOINT-HANDLER");
        $ic138$ = makeString("[Viewpoint]");
        $ic139$ = makeKeyword("MAIN");
        $ic140$ = makeString("cb-viewpoint&~A");
        $ic141$ = makeKeyword("VIEWPOINT");
        $ic142$ = makeSymbol("S#44316", "CYC");
        $ic143$ = makeString(" ");
        $ic144$ = makeString(" Filter");
        $ic145$ = makeString("(Only those terms whose ");
        $ic146$ = makeString(" field has a value equal to a term below will be presented. Leave blank to disable this filter.)");
        $ic147$ = makeSymbol("S#44310", "CYC");
        $ic148$ = makeString("Activate Filter");
        $ic149$ = makeString("all-dates-~A");
        $ic150$ = makeString("no");
        $ic151$ = makeString("cb-show-start-~A");
        $ic152$ = makeString("all");
        $ic153$ = makeString("yes");
        $ic154$ = makeSymbol("S#12701", "CYC");
        $ic155$ = makeString("All Mts");
        $ic156$ = makeString("Specify Mts");
        $ic157$ = makeString("use-genl-mt");
        $ic158$ = makeString("Include All Genl Mts");
        $ic159$ = makeString("new-mt");
        $ic160$ = makeSymbol("S#44313", "CYC");
        $ic161$ = makeSymbol("S#44368", "CYC");
        $ic162$ = makeSymbol("S#44369", "CYC");
        $ic163$ = makeSymbol("S#44389", "CYC");
        $ic164$ = ConsesLow.list(new SubLObject[] { makeKeyword("LINKABLE-NAME"), constant_handles_oc.f8479((SubLObject)makeString("myCreator")), makeKeyword("TYPE"), makeKeyword("LIST-OF-FORMS"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("VALUE-PROMPT-FN"), makeSymbol("S#44318", "CYC"), makeKeyword("VALUE-UPDATE-FN"), makeSymbol("S#44322", "CYC"), makeKeyword("EFFECTIVE-FN-SLOTNAME"), makeSymbol("ASSERTED-BY") });
        $ic165$ = makeSymbol("S#44330", "CYC");
        $ic166$ = makeSymbol("S#44331", "CYC");
        $ic167$ = makeSymbol("S#44332", "CYC");
        $ic168$ = makeString("not an assertion");
        $ic169$ = makeSymbol("S#44370", "CYC");
        $ic170$ = makeSymbol("S#44371", "CYC");
        $ic171$ = makeSymbol("S#44390", "CYC");
        $ic172$ = ConsesLow.list(new SubLObject[] { makeKeyword("LINKABLE-NAME"), constant_handles_oc.f8479((SubLObject)makeString("myReviewer")), makeKeyword("TYPE"), makeKeyword("LIST-OF-FORMS"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("EFFECTIVE-FN-SLOTNAME"), makeSymbol("S#43931", "CYC"), makeKeyword("VALUE-PROMPT-FN"), makeSymbol("S#44318", "CYC"), makeKeyword("VALUE-UPDATE-FN"), makeSymbol("S#44322", "CYC") });
        $ic173$ = makeSymbol("S#44335", "CYC");
        $ic174$ = makeSymbol("S#44336", "CYC");
        $ic175$ = makeSymbol("S#44337", "CYC");
        $ic176$ = makeSymbol("S#44372", "CYC");
        $ic177$ = makeSymbol("S#44373", "CYC");
        $ic178$ = makeSymbol("S#44391", "CYC");
        $ic179$ = ConsesLow.list(new SubLObject[] { makeKeyword("LINKNAME-PREFIX"), makeString("After "), makeKeyword("LINKABLE-NAME"), constant_handles_oc.f8479((SubLObject)makeString("myCreationTime")), makeKeyword("TYPE"), makeKeyword("SINGLE-SIMPLE-DATE"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("EFFECTIVE-FN"), makeSymbol("S#44327", "CYC"), makeKeyword("VALUE-PROMPT-FN"), makeSymbol("S#44319", "CYC"), makeKeyword("VALUE-UPDATE-FN"), makeSymbol("S#44324", "CYC"), makeKeyword("INITIAL-FILTER-VALUE"), makeInteger(19800101) });
        $ic180$ = makeSymbol("S#44340", "CYC");
        $ic181$ = makeSymbol("S#44341", "CYC");
        $ic182$ = makeSymbol("S#44374", "CYC");
        $ic183$ = makeSymbol("S#44375", "CYC");
        $ic184$ = makeSymbol("S#44392", "CYC");
        $ic185$ = ConsesLow.list(new SubLObject[] { makeKeyword("LINKNAME-PREFIX"), makeString("Before "), makeKeyword("LINKABLE-NAME"), constant_handles_oc.f8479((SubLObject)makeString("myCreationTime")), makeKeyword("TYPE"), makeKeyword("SINGLE-SIMPLE-DATE"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("EFFECTIVE-FN"), makeSymbol("S#44326", "CYC"), makeKeyword("VALUE-PROMPT-FN"), makeSymbol("S#44319", "CYC"), makeKeyword("VALUE-UPDATE-FN"), makeSymbol("S#44324", "CYC"), makeKeyword("INITIAL-FILTER-VALUE"), makeInteger(29991231) });
        $ic186$ = makeSymbol("S#44344", "CYC");
        $ic187$ = makeSymbol("S#44345", "CYC");
        $ic188$ = makeSymbol("S#44376", "CYC");
        $ic189$ = makeSymbol("S#44377", "CYC");
        $ic190$ = ConsesLow.list(new SubLObject[] { makeKeyword("LINKABLE-NAME"), constant_handles_oc.f8479((SubLObject)makeString("Microtheory")), makeKeyword("TYPE"), makeKeyword("LIST-OF-FORMS"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("EFFECTIVE-FN"), NIL, makeKeyword("VALUE-PROMPT-FN"), makeSymbol("S#44320", "CYC"), makeKeyword("VALUE-UPDATE-FN"), makeSymbol("S#44325", "CYC") });
        $ic191$ = makeSymbol("S#44348", "CYC");
        $ic192$ = makeSymbol("S#44349", "CYC");
        $ic193$ = makeSymbol("S#44378", "CYC");
        $ic194$ = makeSymbol("S#44379", "CYC");
        $ic195$ = makeSymbol("S#44393", "CYC");
        $ic196$ = ConsesLow.list(new SubLObject[] { makeKeyword("LINKABLE-NAME"), constant_handles_oc.f8479((SubLObject)makeString("myCreationPurpose")), makeKeyword("TYPE"), makeKeyword("LIST-OF-FORMS"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("VALUE-PROMPT-FN"), makeSymbol("S#44321", "CYC"), makeKeyword("VALUE-UPDATE-FN"), makeSymbol("S#44323", "CYC"), makeKeyword("EFFECTIVE-FN-SLOTNAME"), makeSymbol("ASSERTED-WHY") });
        $ic197$ = makeSymbol("S#44352", "CYC");
        $ic198$ = makeSymbol("S#44353", "CYC");
        $ic199$ = makeSymbol("S#44354", "CYC");
        $ic200$ = makeSymbol("S#44356", "CYC");
        $ic201$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#43972", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#44355", "CYC"))));
        $ic202$ = ConsesLow.list((SubLObject)makeSymbol("S#44394", "CYC"), (SubLObject)makeSymbol("S#44395", "CYC"), (SubLObject)makeSymbol("S#755", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#44396", "CYC"));
        $ic203$ = ConsesLow.list((SubLObject)makeKeyword("SPECIFIED-MT"));
        $ic204$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic205$ = makeKeyword("SPECIFIED-MT");
        $ic206$ = makeSymbol("S#44357", "CYC");
        $ic207$ = makeSymbol("PCOND");
        $ic208$ = makeSymbol("CAND");
        $ic209$ = ConsesLow.list((SubLObject)makeSymbol("S#44299", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#12701", "CYC")));
        $ic210$ = makeSymbol("CNOT");
        $ic211$ = makeSymbol("PIF");
        $ic212$ = ConsesLow.list((SubLObject)makeSymbol("S#43648", "CYC"));
        $ic213$ = makeSymbol("S#12292", "CYC");
        $ic214$ = ConsesLow.list((SubLObject)makeSymbol("S#44348", "CYC"));
        $ic215$ = makeSymbol("CSETQ");
        $ic216$ = makeSymbol("WITH-MT-LIST");
        $ic217$ = ConsesLow.list((SubLObject)makeSymbol("S#44397", "CYC"), (SubLObject)makeSymbol("S#44398", "CYC"));
        $ic218$ = makeUninternedSymbol("US#703B6C2");
        $ic219$ = makeSymbol("RET");
        $ic220$ = makeString("cb-ev");
        $ic221$ = makeKeyword("TOP");
        $ic222$ = makeString("cb-start|cb-ev");
        $ic223$ = makeString("~a&~a&~a");
        $ic224$ = makeString("~a&~a");
        $ic225$ = makeSymbol("S#44360", "CYC");
    }
    
    public static final class $sX44265_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $summary_name;
        public SubLObject $linkable_name;
        public SubLObject $linkname_prefix;
        public SubLObject $filter_getter;
        public SubLObject $filter_setter;
        public SubLObject $type;
        public SubLObject $active_p;
        public SubLObject $effective_fn;
        public SubLObject $value_prompt_fn;
        public SubLObject $value_update_fn;
        public SubLObject $initial_filter_value;
        public SubLObject $effective_fn_slotname;
        private static final SubLStructDeclNative structDecl;
        
        public $sX44265_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$summary_name = (SubLObject)CommonSymbols.NIL;
            this.$linkable_name = (SubLObject)CommonSymbols.NIL;
            this.$linkname_prefix = (SubLObject)CommonSymbols.NIL;
            this.$filter_getter = (SubLObject)CommonSymbols.NIL;
            this.$filter_setter = (SubLObject)CommonSymbols.NIL;
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$active_p = (SubLObject)CommonSymbols.NIL;
            this.$effective_fn = (SubLObject)CommonSymbols.NIL;
            this.$value_prompt_fn = (SubLObject)CommonSymbols.NIL;
            this.$value_update_fn = (SubLObject)CommonSymbols.NIL;
            this.$initial_filter_value = (SubLObject)CommonSymbols.NIL;
            this.$effective_fn_slotname = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX44265_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$summary_name;
        }
        
        public SubLObject getField4() {
            return this.$linkable_name;
        }
        
        public SubLObject getField5() {
            return this.$linkname_prefix;
        }
        
        public SubLObject getField6() {
            return this.$filter_getter;
        }
        
        public SubLObject getField7() {
            return this.$filter_setter;
        }
        
        public SubLObject getField8() {
            return this.$type;
        }
        
        public SubLObject getField9() {
            return this.$active_p;
        }
        
        public SubLObject getField10() {
            return this.$effective_fn;
        }
        
        public SubLObject getField11() {
            return this.$value_prompt_fn;
        }
        
        public SubLObject getField12() {
            return this.$value_update_fn;
        }
        
        public SubLObject getField13() {
            return this.$initial_filter_value;
        }
        
        public SubLObject getField14() {
            return this.$effective_fn_slotname;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$summary_name = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$linkable_name = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$linkname_prefix = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$filter_getter = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$filter_setter = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$type = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$active_p = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$effective_fn = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$value_prompt_fn = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$value_update_fn = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$initial_filter_value = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$effective_fn_slotname = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX44265_native.class, $ic4$, $ic5$, $ic6$, $ic7$, new String[] { "$name", "$summary_name", "$linkable_name", "$linkname_prefix", "$filter_getter", "$filter_setter", "$type", "$active_p", "$effective_fn", "$value_prompt_fn", "$value_update_fn", "$initial_filter_value", "$effective_fn_slotname" }, $ic8$, $ic9$, $ic10$);
        }
    }
    
    public static final class $f40215$UnaryFunction extends UnaryFunction
    {
        public $f40215$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#44266"));
        }
        
        public SubLObject processItem(final SubLObject var10) {
            return f40215(var10);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 712 ms
	
	Decompiled with Procyon 0.5.32.
*/