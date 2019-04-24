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
        if (module0661.NIL != print_high.$print_level$.getDynamicValue(var4) && var3.numG(print_high.$print_level$.getDynamicValue(var4))) {
            print_high.princ((SubLObject)module0661.$ic0$, var2);
        }
        else if (module0661.NIL != print_high.$print_readably$.getDynamicValue(var4)) {
            print_high.print_not_readable(var1, var2);
        }
        else {
            streams_high.write_string((SubLObject)module0661.$ic1$, var2, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var1), new SubLObject[] { module0661.$ic2$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            print_high.princ(f40213(var1), var2);
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var1;
    }
    
    public static SubLObject f40214(final SubLObject var9, final SubLObject var2) {
        f40212(var9, var2, (SubLObject)module0661.ZERO_INTEGER);
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40215(final SubLObject var9) {
        return (SubLObject)((var9.getClass() == $sX44265_native.class) ? module0661.T : module0661.NIL);
    }
    
    public static SubLObject f40213(final SubLObject var9) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.getField2();
    }
    
    public static SubLObject f40216(final SubLObject var9) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.getField3();
    }
    
    public static SubLObject f40217(final SubLObject var9) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.getField4();
    }
    
    public static SubLObject f40218(final SubLObject var9) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.getField5();
    }
    
    public static SubLObject f40219(final SubLObject var9) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.getField6();
    }
    
    public static SubLObject f40220(final SubLObject var9) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.getField7();
    }
    
    public static SubLObject f40221(final SubLObject var9) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.getField8();
    }
    
    public static SubLObject f40222(final SubLObject var9) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.getField9();
    }
    
    public static SubLObject f40223(final SubLObject var9) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.getField10();
    }
    
    public static SubLObject f40224(final SubLObject var9) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.getField11();
    }
    
    public static SubLObject f40225(final SubLObject var9) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.getField12();
    }
    
    public static SubLObject f40226(final SubLObject var9) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.getField13();
    }
    
    public static SubLObject f40227(final SubLObject var9) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.getField14();
    }
    
    public static SubLObject f40228(final SubLObject var9, final SubLObject var11) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.setField2(var11);
    }
    
    public static SubLObject f40229(final SubLObject var9, final SubLObject var11) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.setField3(var11);
    }
    
    public static SubLObject f40230(final SubLObject var9, final SubLObject var11) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.setField4(var11);
    }
    
    public static SubLObject f40231(final SubLObject var9, final SubLObject var11) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.setField5(var11);
    }
    
    public static SubLObject f40232(final SubLObject var9, final SubLObject var11) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.setField6(var11);
    }
    
    public static SubLObject f40233(final SubLObject var9, final SubLObject var11) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.setField7(var11);
    }
    
    public static SubLObject f40234(final SubLObject var9, final SubLObject var11) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.setField8(var11);
    }
    
    public static SubLObject f40235(final SubLObject var9, final SubLObject var11) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.setField9(var11);
    }
    
    public static SubLObject f40236(final SubLObject var9, final SubLObject var11) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.setField10(var11);
    }
    
    public static SubLObject f40237(final SubLObject var9, final SubLObject var11) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.setField11(var11);
    }
    
    public static SubLObject f40238(final SubLObject var9, final SubLObject var11) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.setField12(var11);
    }
    
    public static SubLObject f40239(final SubLObject var9, final SubLObject var11) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.setField13(var11);
    }
    
    public static SubLObject f40240(final SubLObject var9, final SubLObject var11) {
        assert module0661.NIL != f40215(var9) : var9;
        return var9.setField14(var11);
    }
    
    public static SubLObject f40241(SubLObject var12) {
        if (var12 == module0661.UNPROVIDED) {
            var12 = (SubLObject)module0661.NIL;
        }
        final SubLObject var13 = (SubLObject)new $sX44265_native();
        SubLObject var14;
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        for (var14 = (SubLObject)module0661.NIL, var14 = var12; module0661.NIL != var14; var14 = conses_high.cddr(var14)) {
            var15 = var14.first();
            var16 = conses_high.cadr(var14);
            var17 = var15;
            if (var17.eql((SubLObject)module0661.$ic39$)) {
                f40228(var13, var16);
            }
            else if (var17.eql((SubLObject)module0661.$ic40$)) {
                f40229(var13, var16);
            }
            else if (var17.eql((SubLObject)module0661.$ic41$)) {
                f40230(var13, var16);
            }
            else if (var17.eql((SubLObject)module0661.$ic42$)) {
                f40231(var13, var16);
            }
            else if (var17.eql((SubLObject)module0661.$ic43$)) {
                f40232(var13, var16);
            }
            else if (var17.eql((SubLObject)module0661.$ic44$)) {
                f40233(var13, var16);
            }
            else if (var17.eql((SubLObject)module0661.$ic45$)) {
                f40234(var13, var16);
            }
            else if (var17.eql((SubLObject)module0661.$ic46$)) {
                f40235(var13, var16);
            }
            else if (var17.eql((SubLObject)module0661.$ic47$)) {
                f40236(var13, var16);
            }
            else if (var17.eql((SubLObject)module0661.$ic48$)) {
                f40237(var13, var16);
            }
            else if (var17.eql((SubLObject)module0661.$ic49$)) {
                f40238(var13, var16);
            }
            else if (var17.eql((SubLObject)module0661.$ic50$)) {
                f40239(var13, var16);
            }
            else if (var17.eql((SubLObject)module0661.$ic51$)) {
                f40240(var13, var16);
            }
            else {
                Errors.error((SubLObject)module0661.$ic52$, var15);
            }
        }
        return var13;
    }
    
    public static SubLObject f40242(final SubLObject var18, final SubLObject var19) {
        Functions.funcall(var19, var18, (SubLObject)module0661.$ic53$, (SubLObject)module0661.$ic54$, (SubLObject)module0661.THIRTEEN_INTEGER);
        Functions.funcall(var19, var18, (SubLObject)module0661.$ic55$, (SubLObject)module0661.$ic39$, f40213(var18));
        Functions.funcall(var19, var18, (SubLObject)module0661.$ic55$, (SubLObject)module0661.$ic40$, f40216(var18));
        Functions.funcall(var19, var18, (SubLObject)module0661.$ic55$, (SubLObject)module0661.$ic41$, f40217(var18));
        Functions.funcall(var19, var18, (SubLObject)module0661.$ic55$, (SubLObject)module0661.$ic42$, f40218(var18));
        Functions.funcall(var19, var18, (SubLObject)module0661.$ic55$, (SubLObject)module0661.$ic43$, f40219(var18));
        Functions.funcall(var19, var18, (SubLObject)module0661.$ic55$, (SubLObject)module0661.$ic44$, f40220(var18));
        Functions.funcall(var19, var18, (SubLObject)module0661.$ic55$, (SubLObject)module0661.$ic45$, f40221(var18));
        Functions.funcall(var19, var18, (SubLObject)module0661.$ic55$, (SubLObject)module0661.$ic46$, f40222(var18));
        Functions.funcall(var19, var18, (SubLObject)module0661.$ic55$, (SubLObject)module0661.$ic47$, f40223(var18));
        Functions.funcall(var19, var18, (SubLObject)module0661.$ic55$, (SubLObject)module0661.$ic48$, f40224(var18));
        Functions.funcall(var19, var18, (SubLObject)module0661.$ic55$, (SubLObject)module0661.$ic49$, f40225(var18));
        Functions.funcall(var19, var18, (SubLObject)module0661.$ic55$, (SubLObject)module0661.$ic50$, f40226(var18));
        Functions.funcall(var19, var18, (SubLObject)module0661.$ic55$, (SubLObject)module0661.$ic51$, f40227(var18));
        Functions.funcall(var19, var18, (SubLObject)module0661.$ic56$, (SubLObject)module0661.$ic54$, (SubLObject)module0661.THIRTEEN_INTEGER);
        return var18;
    }
    
    public static SubLObject f40243(final SubLObject var18, final SubLObject var19) {
        return f40242(var18, var19);
    }
    
    public static SubLObject f40244(final SubLObject var20) {
        return Sequences.find(var20, module0661.$g5211$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0661.EQUAL), Symbols.symbol_function((SubLObject)module0661.$ic13$), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
    }
    
    public static SubLObject f40245(final SubLObject var21) {
        final SubLObject var22 = f40244(var21);
        if (module0661.NIL != var22) {
            return f40222(var22);
        }
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40246(final SubLObject var22, SubLObject var23) {
        if (var23 == module0661.UNPROVIDED) {
            var23 = module0661.$g5209$.getDynamicValue();
        }
        if (module0661.NIL != var23) {
            if (module0661.NIL != f40245(var22) && f40221(var22).eql(var23)) {
                return (SubLObject)ConsesLow.list(var22);
            }
        }
        else if (module0661.NIL != f40222(var22)) {
            return (SubLObject)ConsesLow.list(var22);
        }
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40247() {
        module0661.$g5214$.setGlobalValue((SubLObject)module0661.NIL);
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40248(SubLObject var23) {
        if (var23 == module0661.UNPROVIDED) {
            var23 = (SubLObject)module0661.NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = conses_high.assoc(var23, module0661.$g5214$.getGlobalValue(), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED).rest();
        if (module0661.NIL != var25) {
            return var25;
        }
        SubLObject var26 = (SubLObject)module0661.NIL;
        final SubLObject var27 = module0661.$g5209$.currentBinding(var24);
        try {
            module0661.$g5209$.bind(var23, var24);
            var26 = Mapping.mapcan(Symbols.symbol_function((SubLObject)module0661.$ic60$), module0661.$g5211$.getGlobalValue(), module0661.EMPTY_SUBL_OBJECT_ARRAY);
        }
        finally {
            module0661.$g5209$.rebind(var27, var24);
        }
        if (module0661.NIL != var26) {
            module0661.$g5214$.setGlobalValue(conses_high.acons(var23, var26, module0661.$g5214$.getGlobalValue()));
        }
        return var26;
    }
    
    public static SubLObject f40249(final SubLObject var27, SubLObject var28) {
        if (var28 == module0661.UNPROVIDED) {
            var28 = (SubLObject)module0661.T;
        }
        f40247();
        final SubLObject var29 = f40244(var27);
        if (module0661.NIL != var29) {
            f40235(var29, var28);
            return var28;
        }
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40250(final SubLObject var29) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean((module0661.NIL != module0655.$g5140$.getDynamicValue(var30) && module0661.NIL != module0659.f40064(var29)) || (module0661.NIL != module0655.$g5141$.getDynamicValue(var30) && module0661.NIL != module0659.f40063(var29)));
    }
    
    public static SubLObject f40251(final SubLObject var30, final SubLObject var31) {
        SubLObject var33;
        final SubLObject var32 = var33 = var30.rest();
        SubLObject var34 = (SubLObject)module0661.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0661.$ic61$);
        var34 = var33.first();
        final SubLObject var35;
        var33 = (var35 = var33.rest());
        final SubLObject var36 = Packages.intern(PrintLow.format((SubLObject)module0661.NIL, (SubLObject)module0661.$ic62$, Strings.string_upcase(Strings.string(var34), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED)), (SubLObject)module0661.UNPROVIDED);
        final SubLObject var37 = Packages.intern(PrintLow.format((SubLObject)module0661.NIL, (SubLObject)module0661.$ic63$, var36), (SubLObject)module0661.UNPROVIDED);
        final SubLObject var38 = Packages.intern(PrintLow.format((SubLObject)module0661.NIL, (SubLObject)module0661.$ic64$, var37), (SubLObject)module0661.UNPROVIDED);
        final SubLObject var39 = Packages.intern(PrintLow.format((SubLObject)module0661.NIL, (SubLObject)module0661.$ic65$, var34), (SubLObject)module0661.UNPROVIDED);
        final SubLObject var40 = module0653.f39726((SubLObject)module0661.$ic45$, var35, (SubLObject)module0661.UNPROVIDED);
        return (SubLObject)ConsesLow.list((SubLObject)module0661.$ic66$, (SubLObject)ConsesLow.listS((SubLObject)module0661.$ic67$, var36, (SubLObject)module0661.$ic68$), (SubLObject)((module0661.NIL != module0653.f39726((SubLObject)module0661.$ic51$, var35, (SubLObject)module0661.UNPROVIDED)) ? ((var40 == module0661.$ic69$) ? ConsesLow.list((SubLObject)module0661.$ic66$, (SubLObject)ConsesLow.list((SubLObject)module0661.$ic70$, (SubLObject)ConsesLow.list((SubLObject)module0661.$ic71$, var34), (SubLObject)ConsesLow.list((SubLObject)module0661.$ic71$, var35), (SubLObject)ConsesLow.list((SubLObject)module0661.$ic71$, var37), (SubLObject)ConsesLow.list((SubLObject)module0661.$ic71$, var38), (SubLObject)ConsesLow.list((SubLObject)module0661.$ic71$, var39)), (SubLObject)ConsesLow.list((SubLObject)module0661.$ic72$, var39, (SubLObject)module0661.$ic73$, (SubLObject)module0661.$ic74$, (SubLObject)module0661.$ic75$, (SubLObject)ConsesLow.listS((SubLObject)module0661.$ic76$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0661.$ic4$, (SubLObject)ConsesLow.list((SubLObject)module0661.$ic77$, (SubLObject)ConsesLow.list((SubLObject)module0661.$ic71$, var34)))), (SubLObject)module0661.$ic78$))) : ConsesLow.listS((SubLObject)module0661.$ic70$, (SubLObject)ConsesLow.list((SubLObject)module0661.$ic71$, var34), (SubLObject)ConsesLow.list((SubLObject)module0661.$ic71$, var35), (SubLObject)ConsesLow.list((SubLObject)module0661.$ic71$, var37), (SubLObject)ConsesLow.list((SubLObject)module0661.$ic71$, var38), (SubLObject)module0661.$ic79$)) : ConsesLow.listS((SubLObject)module0661.$ic70$, (SubLObject)ConsesLow.list((SubLObject)module0661.$ic71$, var34), (SubLObject)ConsesLow.list((SubLObject)module0661.$ic71$, var35), (SubLObject)ConsesLow.list((SubLObject)module0661.$ic71$, var37), (SubLObject)ConsesLow.list((SubLObject)module0661.$ic71$, var38), (SubLObject)module0661.$ic79$)));
    }
    
    public static SubLObject f40252(final SubLObject var20, final SubLObject var34, final SubLObject var36, final SubLObject var37, final SubLObject var38) {
        f40247();
        final SubLObject var39 = module0661.$g5211$.getGlobalValue();
        final SubLObject var40 = f40241(var34);
        f40228(var40, var20);
        if (module0661.NIL == f40216(var40)) {
            f40229(var40, var20);
        }
        f40232(var40, var36);
        f40233(var40, var37);
        Functions.funcall(var37, f40226(var40));
        module0661.$g5211$.setGlobalValue((SubLObject)ConsesLow.cons(var40, Sequences.delete(var20, var39, Symbols.symbol_function((SubLObject)module0661.EQUAL), Symbols.symbol_function((SubLObject)module0661.$ic13$), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED)));
        module0661.$g5212$.setGlobalValue(conses_high.acons(f40216(var40), (SubLObject)ConsesLow.cons(var40, Sequences.delete(var20, conses_high.assoc(f40216(var40), module0661.$g5212$.getGlobalValue(), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED).rest(), Symbols.symbol_function((SubLObject)module0661.EQUAL), Symbols.symbol_function((SubLObject)module0661.$ic13$), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED)), Sequences.delete(f40216(var40), module0661.$g5212$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0661.EQUAL), Symbols.symbol_function((SubLObject)module0661.$ic80$), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED)));
        if (module0661.NIL != var38) {
            f40236(var40, var38);
        }
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40253(final SubLObject var22, SubLObject var41) {
        if (var41 == module0661.UNPROVIDED) {
            var41 = (SubLObject)module0661.NIL;
        }
        final SubLThread var42 = SubLProcess.currentSubLThread();
        if (module0661.NIL != var41) {
            final SubLObject var43 = PrintLow.format((SubLObject)module0661.NIL, (SubLObject)module0661.$ic81$, f40213(var22));
            module0642.f39068(var43, var43, f40246(var22, (SubLObject)module0661.UNPROVIDED), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
            module0642.f39032((SubLObject)module0661.UNPROVIDED);
        }
        else {
            module0642.f39026((SubLObject)module0661.UNPROVIDED);
            module0642.f39032((SubLObject)module0661.TWO_INTEGER);
        }
        if (module0661.NIL != f40218(var22)) {
            module0642.f39019(f40218(var22));
        }
        module0656.f39804(f40217(var22), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
        module0642.f39019((SubLObject)module0661.$ic82$);
        final SubLObject var45;
        final SubLObject var44 = var45 = f40221(var22);
        if (var45.eql((SubLObject)module0661.$ic69$)) {
            SubLObject var46 = Functions.funcall(f40219(var22));
            SubLObject var47 = (SubLObject)module0661.NIL;
            var47 = var46.first();
            while (module0661.NIL != var46) {
                module0642.f39027((SubLObject)module0661.$ic83$, (SubLObject)module0661.UNPROVIDED);
                module0656.f39804(var47, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
                if (module0661.NIL != var41) {
                    module0642.f39026((SubLObject)module0661.UNPROVIDED);
                }
                else {
                    module0642.f39032((SubLObject)module0661.UNPROVIDED);
                }
                var46 = var46.rest();
                var47 = var46.first();
            }
        }
        else if (var45.eql((SubLObject)module0661.$ic84$)) {
            module0642.f39027((SubLObject)module0661.$ic83$, (SubLObject)module0661.UNPROVIDED);
            PrintLow.format(module0015.$g131$.getDynamicValue(var42), (SubLObject)module0661.$ic85$, Functions.funcall(f40219(var22)));
        }
        if (module0661.NIL != var41) {
            module0642.f39032((SubLObject)module0661.TWO_INTEGER);
            module0656.f39837((SubLObject)module0661.$ic86$, var22, (SubLObject)module0661.$ic87$, module0656.f39931(module0661.$g5213$.getDynamicValue(var42)), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
        }
        if (module0661.NIL != var41) {
            module0642.f39026((SubLObject)module0661.UNPROVIDED);
        }
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40254() {
        if (module0661.NIL != f40248((SubLObject)module0661.UNPROVIDED)) {
            module0642.f39019((SubLObject)module0661.$ic82$);
            Mapping.mapc(Symbols.symbol_function((SubLObject)module0661.$ic88$), f40248((SubLObject)module0661.UNPROVIDED), module0661.EMPTY_SUBL_OBJECT_ARRAY);
        }
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40255(final SubLObject var45, final SubLObject var23, final SubLObject var46, final SubLObject var47) {
        module0642.f39026((SubLObject)module0661.UNPROVIDED);
        module0642.f39032((SubLObject)module0661.THREE_INTEGER);
        module0666.f40467(var45, (SubLObject)module0661.$ic89$, var23, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
        module0642.f39032((SubLObject)module0661.UNPROVIDED);
        module0642.f39075(var45, var46, var47);
        module0642.f39032((SubLObject)module0661.UNPROVIDED);
        module0644.f39184(var45, (SubLObject)module0661.UNPROVIDED);
        module0642.f39026((SubLObject)module0661.UNPROVIDED);
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40256(final SubLObject var48, SubLObject var49, SubLObject var50, SubLObject var51) {
        if (var49 == module0661.UNPROVIDED) {
            var49 = (SubLObject)module0661.$ic90$;
        }
        if (var50 == module0661.UNPROVIDED) {
            var50 = (SubLObject)module0661.$ic90$;
        }
        if (var51 == module0661.UNPROVIDED) {
            var51 = (SubLObject)module0661.$ic90$;
        }
        f40255(PrintLow.format((SubLObject)module0661.NIL, (SubLObject)module0661.$ic91$, var48), module0661.$ic92$, var49, (SubLObject)module0661.$ic93$);
        f40255(PrintLow.format((SubLObject)module0661.NIL, (SubLObject)module0661.$ic94$, var48), module0661.$ic92$, var50, (SubLObject)module0661.$ic93$);
        f40255(PrintLow.format((SubLObject)module0661.NIL, (SubLObject)module0661.$ic95$, var48), module0661.$ic92$, var51, (SubLObject)module0661.$ic93$);
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40257(final SubLObject var52, final SubLObject var53, final SubLObject var54) {
        SubLObject var55 = module0038.f2735(module0642.f39104(var52, var53));
        if (module0661.$ic90$.equalp(var55) || module0661.$g5215$.getGlobalValue().equalp(var55)) {
            var55 = (SubLObject)module0661.NIL;
        }
        else {
            var55 = module0656.f39943(var55, (SubLObject)module0661.UNPROVIDED);
            if (module0661.NIL == module0173.f10955(var55)) {
                module0656.f39789((SubLObject)module0661.$ic97$, var54, var55, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
                return (SubLObject)module0661.NIL;
            }
        }
        return var55;
    }
    
    public static SubLObject f40258(final SubLObject var48, final SubLObject var53) {
        return Sequences.delete((SubLObject)module0661.NIL, (SubLObject)ConsesLow.list(f40257(PrintLow.format((SubLObject)module0661.NIL, (SubLObject)module0661.$ic91$, var48), var53, (SubLObject)module0661.$ic98$), f40257(PrintLow.format((SubLObject)module0661.NIL, (SubLObject)module0661.$ic94$, var48), var53, (SubLObject)module0661.$ic98$), f40257(PrintLow.format((SubLObject)module0661.NIL, (SubLObject)module0661.$ic95$, var48), var53, (SubLObject)module0661.$ic98$)), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
    }
    
    public static SubLObject f40259(final SubLObject var48, SubLObject var49, SubLObject var50, SubLObject var51) {
        if (var49 == module0661.UNPROVIDED) {
            var49 = module0661.$g5215$.getGlobalValue();
        }
        if (var50 == module0661.UNPROVIDED) {
            var50 = module0661.$g5215$.getGlobalValue();
        }
        if (var51 == module0661.UNPROVIDED) {
            var51 = module0661.$g5215$.getGlobalValue();
        }
        final SubLObject var52 = (SubLObject)ConsesLow.cons(module0661.$g5215$.getGlobalValue(), module0220.f14565(module0661.$ic99$, module0661.$ic100$, (SubLObject)module0661.TWO_INTEGER, (SubLObject)module0661.ONE_INTEGER, (SubLObject)module0661.UNPROVIDED));
        module0642.f39106(PrintLow.format((SubLObject)module0661.NIL, (SubLObject)module0661.$ic101$, var48), var49, var52, (SubLObject)module0661.UNPROVIDED);
        module0642.f39106(PrintLow.format((SubLObject)module0661.NIL, (SubLObject)module0661.$ic102$, var48), var50, var52, (SubLObject)module0661.UNPROVIDED);
        module0642.f39106(PrintLow.format((SubLObject)module0661.NIL, (SubLObject)module0661.$ic103$, var48), var51, var52, (SubLObject)module0661.UNPROVIDED);
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40260(final SubLObject var48, final SubLObject var53) {
        return Sequences.delete((SubLObject)module0661.NIL, (SubLObject)ConsesLow.list(f40257(PrintLow.format((SubLObject)module0661.NIL, (SubLObject)module0661.$ic101$, var48), var53, (SubLObject)module0661.$ic104$), f40257(PrintLow.format((SubLObject)module0661.NIL, (SubLObject)module0661.$ic102$, var48), var53, (SubLObject)module0661.$ic104$), f40257(PrintLow.format((SubLObject)module0661.NIL, (SubLObject)module0661.$ic103$, var48), var53, (SubLObject)module0661.$ic104$)), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
    }
    
    public static SubLObject f40261(final SubLObject var57) {
        return f40253(var57, (SubLObject)module0661.T);
    }
    
    public static SubLObject f40262(SubLObject var53) {
        if (var53 == module0661.UNPROVIDED) {
            var53 = (SubLObject)module0661.NIL;
        }
        final SubLThread var54 = SubLProcess.currentSubLThread();
        SubLObject var56;
        final SubLObject var55 = var56 = var53;
        SubLObject var57 = (SubLObject)module0661.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)module0661.$ic107$);
        var57 = var56.first();
        var56 = var56.rest();
        if (module0661.NIL == var56) {
            final SubLObject var58 = module0656.f39969(var57);
            if (module0661.NIL == module0656.f39930(var58)) {
                module0656.f39789((SubLObject)module0661.$ic108$, var58, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
                return (SubLObject)module0661.NIL;
            }
            final SubLObject var59 = (SubLObject)module0661.$ic109$;
            final SubLObject var60 = module0015.$g538$.currentBinding(var54);
            try {
                module0015.$g538$.bind((module0661.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var54))) ? module0015.$g538$.getDynamicValue(var54) : module0057.f4173((SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED), var54);
                module0642.f39020((SubLObject)module0661.$ic110$);
                module0642.f39029((SubLObject)module0661.UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var54), module0655.$g5142$.getDynamicValue(var54));
                final SubLObject var61 = module0014.f672((SubLObject)module0661.$ic111$);
                module0642.f39029((SubLObject)module0661.UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                module0642.f39020((SubLObject)module0661.$ic112$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                if (module0661.NIL != var61) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                    module0642.f39020(var61);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                module0642.f39020((SubLObject)module0661.$ic113$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0661.UNPROVIDED);
                module0016.f941();
                if (module0661.NIL != var59) {
                    module0642.f39029((SubLObject)module0661.UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var59);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)module0661.UNPROVIDED);
                final SubLObject var26_64 = module0015.$g535$.currentBinding(var54);
                try {
                    module0015.$g535$.bind((SubLObject)module0661.T, var54);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (module0661.NIL != module0015.$g132$.getDynamicValue(var54)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var54)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                    module0642.f39020((SubLObject)module0661.$ic116$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0661.UNPROVIDED);
                    final SubLObject var26_65 = module0015.$g533$.currentBinding(var54);
                    try {
                        module0015.$g533$.bind((SubLObject)module0661.T, var54);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                        module0642.f39020((SubLObject)module0661.$ic117$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0661.UNPROVIDED);
                        final SubLObject var26_66 = module0015.$g533$.currentBinding(var54);
                        try {
                            module0015.$g533$.bind((SubLObject)module0661.T, var54);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39020((SubLObject)module0661.$ic118$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39020((SubLObject)module0661.$ic119$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39019((SubLObject)module0661.$ic120$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0661.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var26_66, var54);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (module0661.NIL != var59) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)module0661.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39019(var59);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)module0661.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0661.UNPROVIDED);
                        }
                        final SubLObject var62 = module0656.f39832((SubLObject)module0661.NIL);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var54));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                        module0642.f39020(module0015.$g285$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                        module0642.f39020((SubLObject)module0661.$ic121$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                        if (module0661.NIL != var62) {
                            module0642.f39020(module0015.$g286$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39020(var62);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0661.UNPROVIDED);
                        final SubLObject var26_67 = module0015.$g533$.currentBinding(var54);
                        final SubLObject var63 = module0015.$g541$.currentBinding(var54);
                        final SubLObject var64 = module0015.$g539$.currentBinding(var54);
                        try {
                            module0015.$g533$.bind((SubLObject)module0661.T, var54);
                            module0015.$g541$.bind((SubLObject)module0661.T, var54);
                            module0015.$g539$.bind(module0015.f797(), var54);
                            module0642.f39069((SubLObject)module0661.$ic122$, (SubLObject)module0661.T, (SubLObject)module0661.UNPROVIDED);
                            module0656.f39870((SubLObject)module0661.$ic105$, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39026((SubLObject)module0661.TWO_INTEGER);
                            module0642.f39073((SubLObject)module0661.$ic123$);
                            module0642.f39032((SubLObject)module0661.UNPROVIDED);
                            module0642.f39074((SubLObject)module0661.$ic124$, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39026((SubLObject)module0661.UNPROVIDED);
                            module0659.f40134(var58);
                            module0642.f39026((SubLObject)module0661.UNPROVIDED);
                            module0642.f39068((SubLObject)module0661.$ic125$, (SubLObject)module0661.$ic125$, module0655.$g5140$.getDynamicValue(var54), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39027((SubLObject)module0661.$ic83$, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39019((SubLObject)module0661.$ic126$);
                            module0642.f39026((SubLObject)module0661.UNPROVIDED);
                            module0642.f39068((SubLObject)module0661.$ic127$, (SubLObject)module0661.$ic127$, module0655.$g5141$.getDynamicValue(var54), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39027((SubLObject)module0661.$ic83$, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39019((SubLObject)module0661.$ic128$);
                            module0642.f39026((SubLObject)module0661.TWO_INTEGER);
                            SubLObject var65 = module0661.$g5212$.getGlobalValue();
                            SubLObject var66 = (SubLObject)module0661.NIL;
                            var66 = var65.first();
                            while (module0661.NIL != var65) {
                                final SubLObject var26_68 = module0661.$g5213$.currentBinding(var54);
                                try {
                                    module0661.$g5213$.bind(var58, var54);
                                    if (module0661.NIL != conses_high.endp(conses_high.cddr(var66))) {
                                        f40253(conses_high.cadr(var66), (SubLObject)module0661.T);
                                    }
                                    else {
                                        Mapping.mapc(Symbols.symbol_function((SubLObject)module0661.$ic129$), var66.rest(), module0661.EMPTY_SUBL_OBJECT_ARRAY);
                                    }
                                }
                                finally {
                                    module0661.$g5213$.rebind(var26_68, var54);
                                }
                                module0642.f39026((SubLObject)module0661.UNPROVIDED);
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
                        module0642.f39029((SubLObject)module0661.UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var26_65, var54);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)module0661.UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var26_64, var54);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)module0661.UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var60, var54);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var55, (SubLObject)module0661.$ic107$);
        }
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40263(SubLObject var53) {
        if (var53 == module0661.UNPROVIDED) {
            var53 = (SubLObject)module0661.NIL;
        }
        final SubLThread var54 = SubLProcess.currentSubLThread();
        SubLObject var56;
        final SubLObject var55 = var56 = var53;
        SubLObject var57 = (SubLObject)module0661.NIL;
        SubLObject var58 = (SubLObject)module0661.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)module0661.$ic131$);
        var57 = var56.first();
        var56 = var56.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)module0661.$ic131$);
        var58 = var56.first();
        var56 = var56.rest();
        if (module0661.NIL == var56) {
            final SubLObject var59 = module0656.f39969(var58);
            final SubLObject var60 = conses_high.assoc(Packages.intern(var57, (SubLObject)module0661.UNPROVIDED), module0661.$g5212$.getGlobalValue(), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED).rest();
            if (module0661.NIL == module0656.f39930(var59)) {
                module0656.f39789((SubLObject)module0661.$ic108$, var59, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
                return (SubLObject)module0661.NIL;
            }
            final SubLObject var61 = (SubLObject)module0661.$ic132$;
            final SubLObject var62 = module0015.$g538$.currentBinding(var54);
            try {
                module0015.$g538$.bind((module0661.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var54))) ? module0015.$g538$.getDynamicValue(var54) : module0057.f4173((SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED), var54);
                module0642.f39020((SubLObject)module0661.$ic110$);
                module0642.f39029((SubLObject)module0661.UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var54), module0655.$g5142$.getDynamicValue(var54));
                final SubLObject var63 = module0014.f672((SubLObject)module0661.$ic111$);
                module0642.f39029((SubLObject)module0661.UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                module0642.f39020((SubLObject)module0661.$ic112$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                if (module0661.NIL != var63) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                    module0642.f39020(var63);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                module0642.f39020((SubLObject)module0661.$ic113$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0661.UNPROVIDED);
                module0016.f941();
                if (module0661.NIL != var61) {
                    module0642.f39029((SubLObject)module0661.UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var61);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0666.f40471();
                module0666.f40487();
                module0666.f40535();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)module0661.UNPROVIDED);
                final SubLObject var26_77 = module0015.$g535$.currentBinding(var54);
                try {
                    module0015.$g535$.bind((SubLObject)module0661.T, var54);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (module0661.NIL != module0015.$g132$.getDynamicValue(var54)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var54)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                    module0642.f39020((SubLObject)module0661.$ic116$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0661.UNPROVIDED);
                    final SubLObject var26_78 = module0015.$g533$.currentBinding(var54);
                    try {
                        module0015.$g533$.bind((SubLObject)module0661.T, var54);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                        module0642.f39020((SubLObject)module0661.$ic117$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0661.UNPROVIDED);
                        final SubLObject var26_79 = module0015.$g533$.currentBinding(var54);
                        try {
                            module0015.$g533$.bind((SubLObject)module0661.T, var54);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39020((SubLObject)module0661.$ic118$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39020((SubLObject)module0661.$ic119$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39019((SubLObject)module0661.$ic120$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0661.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var26_79, var54);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (module0661.NIL != var61) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)module0661.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39019(var61);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)module0661.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0661.UNPROVIDED);
                        }
                        final SubLObject var64 = module0656.f39832((SubLObject)module0661.NIL);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var54));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                        module0642.f39020(module0015.$g285$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                        module0642.f39020((SubLObject)module0661.$ic121$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                        if (module0661.NIL != var64) {
                            module0642.f39020(module0015.$g286$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39020(var64);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0661.UNPROVIDED);
                        final SubLObject var26_80 = module0015.$g533$.currentBinding(var54);
                        final SubLObject var65 = module0015.$g541$.currentBinding(var54);
                        final SubLObject var66 = module0015.$g539$.currentBinding(var54);
                        try {
                            module0015.$g533$.bind((SubLObject)module0661.T, var54);
                            module0015.$g541$.bind((SubLObject)module0661.T, var54);
                            module0015.$g539$.bind(module0015.f797(), var54);
                            module0642.f39069((SubLObject)module0661.$ic133$, (SubLObject)ConsesLow.list(var57, var58), (SubLObject)module0661.UNPROVIDED);
                            module0656.f39790((SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39032((SubLObject)module0661.UNPROVIDED);
                            module0642.f39073((SubLObject)module0661.$ic123$);
                            module0642.f39032((SubLObject)module0661.UNPROVIDED);
                            module0642.f39074((SubLObject)module0661.$ic124$, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39026((SubLObject)module0661.UNPROVIDED);
                            SubLObject var67 = var60;
                            SubLObject var68 = (SubLObject)module0661.NIL;
                            var68 = var67.first();
                            while (module0661.NIL != var67) {
                                if (module0661.NIL != f40224(var68)) {
                                    Functions.funcall(f40224(var68), var68, var59);
                                }
                                var67 = var67.rest();
                                var68 = var67.first();
                            }
                            module0642.f39026((SubLObject)module0661.UNPROVIDED);
                            module0642.f39051((SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39026((SubLObject)module0661.UNPROVIDED);
                            module0642.f39073((SubLObject)module0661.$ic123$);
                            module0642.f39032((SubLObject)module0661.UNPROVIDED);
                            module0642.f39074((SubLObject)module0661.$ic124$, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
                            module0015.f799(module0015.$g539$.getDynamicValue(var54));
                        }
                        finally {
                            module0015.$g539$.rebind(var66, var54);
                            module0015.$g541$.rebind(var65, var54);
                            module0015.$g533$.rebind(var26_80, var54);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)module0661.UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var26_78, var54);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)module0661.UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var26_77, var54);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)module0661.UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var62, var54);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var55, (SubLObject)module0661.$ic131$);
        }
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40264(final SubLObject var53) {
        module0655.$g5140$.setDynamicValue((SubLObject)SubLObjectFactory.makeBoolean(module0661.NIL != module0642.f39104((SubLObject)module0661.$ic125$, var53)));
        module0655.$g5141$.setDynamicValue((SubLObject)SubLObjectFactory.makeBoolean(module0661.NIL != module0642.f39104((SubLObject)module0661.$ic127$, var53)));
        SubLObject var54 = module0661.$g5211$.getGlobalValue();
        SubLObject var55 = (SubLObject)module0661.NIL;
        var55 = var54.first();
        while (module0661.NIL != var54) {
            f40235(var55, (SubLObject)SubLObjectFactory.makeBoolean(module0661.NIL != module0642.f39104(PrintLow.format((SubLObject)module0661.NIL, (SubLObject)module0661.$ic81$, f40213(var55)), var53)));
            var54 = var54.rest();
            var55 = var54.first();
        }
        f40247();
        module0656.f39793((SubLObject)module0661.$ic135$, (SubLObject)module0661.UNPROVIDED);
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40265(final SubLObject var53) {
        final SubLObject var54 = reader.read_from_string(var53.first(), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
        final SubLObject var55 = Strings.string(var54.first());
        final SubLObject var56 = conses_high.cadr(var54);
        SubLObject var58;
        final SubLObject var57 = var58 = conses_high.assoc(Packages.intern(var55, (SubLObject)module0661.UNPROVIDED), module0661.$g5212$.getGlobalValue(), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED).rest();
        SubLObject var59 = (SubLObject)module0661.NIL;
        var59 = var58.first();
        while (module0661.NIL != var58) {
            if (module0661.NIL != f40225(var59)) {
                Functions.funcall(f40225(var59), var59, var53);
            }
            var58 = var58.rest();
            var59 = var58.first();
        }
        f40247();
        f40262((SubLObject)ConsesLow.list(var56));
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40266(final SubLObject var61, SubLObject var82) {
        if (var82 == module0661.UNPROVIDED) {
            var82 = (SubLObject)module0661.NIL;
        }
        final SubLThread var83 = SubLProcess.currentSubLThread();
        if (module0661.NIL == var82) {
            var82 = (SubLObject)module0661.$ic138$;
        }
        final SubLObject var84 = module0656.f39832((SubLObject)module0661.$ic139$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var83), (SubLObject)module0661.$ic140$, module0656.f39931(var61));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
        if (module0661.NIL != var84) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
            module0642.f39020(var84);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0661.UNPROVIDED);
        final SubLObject var85 = module0015.$g533$.currentBinding(var83);
        try {
            module0015.$g533$.bind((SubLObject)module0661.T, var83);
            module0642.f39019(var82);
        }
        finally {
            module0015.$g533$.rebind(var85, var83);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var61;
    }
    
    public static SubLObject f40267(final SubLObject var22, final SubLObject var61) {
        module0642.f39051((SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        if (module0661.NIL != f40218(var22)) {
            module0642.f39019(f40218(var22));
        }
        module0642.f39019((SubLObject)module0661.$ic143$);
        module0656.f39804(f40217(var22), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
        module0642.f39019((SubLObject)module0661.$ic144$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)module0661.UNPROVIDED);
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40268(final SubLObject var22, final SubLObject var61) {
        f40267(var22, var61);
        module0642.f39032((SubLObject)module0661.TWO_INTEGER);
        module0642.f39019((SubLObject)module0661.$ic145$);
        module0656.f39804(f40217(var22), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
        module0642.f39019((SubLObject)module0661.$ic146$);
        module0642.f39026((SubLObject)module0661.UNPROVIDED);
        Functions.apply(Symbols.symbol_function((SubLObject)module0661.$ic147$), (SubLObject)ConsesLow.cons(f40213(var22), Functions.funcall(f40219(var22))));
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40269(final SubLObject var22, final SubLObject var61) {
        f40267(var22, var61);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0661.$ic148$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)module0661.UNPROVIDED);
        module0642.f39032((SubLObject)module0661.SIX_INTEGER);
        module0642.f39068(PrintLow.format((SubLObject)module0661.NIL, (SubLObject)module0661.$ic149$, f40213(var22)), (SubLObject)module0661.$ic150$, f40222(var22), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
        module0642.f39032((SubLObject)module0661.FOUR_INTEGER);
        module0656.f39972(Functions.funcall(f40219(var22)), PrintLow.format((SubLObject)module0661.NIL, (SubLObject)module0661.$ic151$, f40213(var22)));
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40270(final SubLObject var22, final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        f40267(var22, var61);
        module0642.f39026((SubLObject)module0661.UNPROVIDED);
        final SubLObject var63 = module0217.f14363(var61);
        final SubLObject var64 = conses_high.copy_list(var63);
        final SubLObject var65 = module0213.f13926(conses_high.union(var64, conses_high.copy_list(f40271()), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED), (SubLObject)module0661.NIL, (SubLObject)module0661.NIL, (SubLObject)module0661.T, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
        module0642.f39020((SubLObject)module0661.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
        module0642.f39020((SubLObject)module0661.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
        module0642.f39020((SubLObject)module0661.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0661.UNPROVIDED);
        final SubLObject var66 = module0015.$g533$.currentBinding(var62);
        final SubLObject var67 = module0015.$g542$.currentBinding(var62);
        try {
            module0015.$g533$.bind((SubLObject)module0661.T, var62);
            module0015.$g542$.bind((SubLObject)module0661.THREE_INTEGER, var62);
            SubLObject var68 = (SubLObject)module0661.ZERO_INTEGER;
            SubLObject var69 = Numbers.max((SubLObject)module0661.ONE_INTEGER, Numbers.subtract(module0015.$g542$.getDynamicValue(var62), var68));
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0661.UNPROVIDED);
            final SubLObject var26_89 = module0015.$g533$.currentBinding(var62);
            try {
                module0015.$g533$.bind((SubLObject)module0661.T, var62);
                module0642.f39084(var68);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                if (module0661.NIL != var69) {
                    module0642.f39020(module0015.$g371$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                    module0642.f39020(var69);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0661.UNPROVIDED);
                final SubLObject var26_90 = module0015.$g533$.currentBinding(var62);
                try {
                    module0015.$g533$.bind((SubLObject)module0661.T, var62);
                    module0642.f39072((SubLObject)module0661.$ic152$, (SubLObject)module0661.$ic153$, (SubLObject)SubLObjectFactory.makeBoolean(module0661.NIL == f40245((SubLObject)module0661.$ic154$)), (SubLObject)module0661.UNPROVIDED);
                    module0642.f39032((SubLObject)module0661.UNPROVIDED);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)module0661.$ic155$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39026((SubLObject)module0661.UNPROVIDED);
                    module0642.f39072((SubLObject)module0661.$ic152$, (SubLObject)module0661.$ic150$, f40245((SubLObject)module0661.$ic154$), (SubLObject)module0661.UNPROVIDED);
                    module0642.f39032((SubLObject)module0661.UNPROVIDED);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)module0661.$ic156$);
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
            module0642.f39029((SubLObject)module0661.UNPROVIDED);
            var68 = (SubLObject)module0661.ONE_INTEGER;
            var69 = Numbers.max((SubLObject)module0661.ONE_INTEGER, Numbers.subtract(module0015.$g542$.getDynamicValue(var62), var68));
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0661.UNPROVIDED);
            final SubLObject var26_91 = module0015.$g533$.currentBinding(var62);
            try {
                module0015.$g533$.bind((SubLObject)module0661.T, var62);
                module0642.f39084(var68);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                if (module0661.NIL != var69) {
                    module0642.f39020(module0015.$g371$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                    module0642.f39020(var69);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0661.UNPROVIDED);
                final SubLObject var26_92 = module0015.$g533$.currentBinding(var62);
                try {
                    module0015.$g533$.bind((SubLObject)module0661.T, var62);
                    module0642.f39068((SubLObject)module0661.$ic157$, (SubLObject)module0661.$ic153$, module0655.f39751(), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
                    module0642.f39032((SubLObject)module0661.UNPROVIDED);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)module0661.$ic158$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39026((SubLObject)module0661.UNPROVIDED);
                    SubLObject var70 = var65;
                    SubLObject var71 = (SubLObject)module0661.NIL;
                    var71 = var70.first();
                    while (module0661.NIL != var70) {
                        module0642.f39020(module0015.$g459$.getGlobalValue());
                        module0642.f39068((SubLObject)module0661.$ic159$, var71, conses_high.member(var71, f40271(), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
                        module0642.f39020(module0015.$g460$.getGlobalValue());
                        if (module0661.NIL != module0004.f104(var71, var63, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED)) {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0656.f39804(var71, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                        }
                        else {
                            module0656.f39804(var71, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
                        }
                        module0642.f39032((SubLObject)module0661.TWO_INTEGER);
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
            module0642.f39029((SubLObject)module0661.UNPROVIDED);
            module0642.f39083((SubLObject)module0661.THREE_INTEGER);
        }
        finally {
            module0015.$g542$.rebind(var67, var62);
            module0015.$g533$.rebind(var66, var62);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40272(final SubLObject var22, final SubLObject var61) {
        f40267(var22, var61);
        module0642.f39026((SubLObject)module0661.UNPROVIDED);
        module0642.f39019((SubLObject)module0661.$ic145$);
        module0656.f39804(f40217(var22), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
        module0642.f39019((SubLObject)module0661.$ic146$);
        module0642.f39026((SubLObject)module0661.UNPROVIDED);
        Functions.apply(Symbols.symbol_function((SubLObject)module0661.$ic160$), (SubLObject)ConsesLow.cons(f40213(var22), Functions.funcall(f40219(var22))));
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40273(final SubLObject var22, final SubLObject var53) {
        final SubLObject var54 = f40258(f40213(var22), var53);
        Functions.funcall(f40220(var22), var54);
        f40235(var22, (SubLObject)SubLObjectFactory.makeBoolean(module0661.NIL != var54));
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40274(final SubLObject var22, final SubLObject var53) {
        final SubLObject var54 = f40260(f40213(var22), var53);
        Functions.funcall(f40220(var22), var54);
        f40235(var22, (SubLObject)SubLObjectFactory.makeBoolean(module0661.NIL != var54));
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40275(final SubLObject var22, final SubLObject var53) {
        final SubLObject var54 = module0642.f39104(PrintLow.format((SubLObject)module0661.NIL, (SubLObject)module0661.$ic149$, f40213(var22)), var53);
        if (var54.equal((SubLObject)module0661.$ic150$)) {
            f40235(var22, (SubLObject)module0661.T);
            Functions.funcall(f40220(var22), module0656.f39973(PrintLow.format((SubLObject)module0661.NIL, (SubLObject)module0661.$ic151$, f40213(var22)), var53));
        }
        else {
            f40235(var22, (SubLObject)module0661.NIL);
        }
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40276(final SubLObject var22, final SubLObject var53) {
        final SubLObject var54 = module0642.f39104((SubLObject)module0661.$ic152$, var53);
        final SubLObject var55 = module0642.f39104((SubLObject)module0661.$ic157$, var53);
        final SubLObject var56 = module0642.f39109((SubLObject)module0661.$ic159$, var53);
        if (module0661.NIL != var55) {
            module0655.f39752((SubLObject)module0661.T);
        }
        else {
            module0655.f39752((SubLObject)module0661.NIL);
        }
        if (var54.equal((SubLObject)module0661.$ic153$)) {
            f40235(var22, (SubLObject)module0661.NIL);
            Functions.funcall(f40220(var22), (SubLObject)module0661.NIL);
        }
        else {
            f40235(var22, (SubLObject)module0661.T);
            Functions.funcall(f40220(var22), (SubLObject)module0661.NIL);
            SubLObject var57 = var56;
            SubLObject var58 = (SubLObject)module0661.NIL;
            var58 = var57.first();
            while (module0661.NIL != var57) {
                Functions.funcall(f40220(var22), (SubLObject)ConsesLow.cons(module0656.f39943(var58, (SubLObject)module0661.UNPROVIDED), Functions.funcall(f40219(var22))));
                var57 = var57.rest();
                var58 = var57.first();
            }
        }
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40277(final SubLObject var29) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0661.NIL != f40250(var29) || module0661.NIL == module0178.f11296(var29) || module0178.f11296(var29).numLE(f40278()));
    }
    
    public static SubLObject f40279(final SubLObject var29) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0661.NIL != f40250(var29) || module0661.NIL == module0178.f11296(var29) || f40280().numLE(module0178.f11296(var29)));
    }
    
    public static SubLObject f40281() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0661.$g5216$.getDynamicValue(var4);
    }
    
    public static SubLObject f40282(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        module0661.$g5216$.setDynamicValue(var99, var100);
        return module0661.$g5216$.getDynamicValue(var100);
    }
    
    public static SubLObject f40283() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0661.$g5217$.getDynamicValue(var4);
    }
    
    public static SubLObject f40284(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        module0661.$g5217$.setDynamicValue(var99, var100);
        return module0661.$g5217$.getDynamicValue(var100);
    }
    
    public static SubLObject f40285(final SubLObject var29) {
        if (module0661.NIL == module0174.f11035(var29)) {
            Errors.sublisp_break((SubLObject)module0661.$ic168$, module0661.EMPTY_SUBL_OBJECT_ARRAY);
        }
        if (module0661.NIL != f40250(var29)) {
            return (SubLObject)module0661.T;
        }
        final SubLObject var30 = f40244((SubLObject)module0661.$ic163$);
        return conses_high.member(Functions.funcall(f40227(var30), var29), Functions.funcall(f40219(var30)), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
    }
    
    public static SubLObject f40286() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0661.$g5218$.getDynamicValue(var4);
    }
    
    public static SubLObject f40287(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        module0661.$g5218$.setDynamicValue(var99, var100);
        return module0661.$g5218$.getDynamicValue(var100);
    }
    
    public static SubLObject f40288() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0661.$g5219$.getDynamicValue(var4);
    }
    
    public static SubLObject f40289(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        module0661.$g5219$.setDynamicValue(var99, var100);
        return module0661.$g5219$.getDynamicValue(var100);
    }
    
    public static SubLObject f40290(final SubLObject var29) {
        if (module0661.NIL == module0174.f11035(var29)) {
            Errors.sublisp_break((SubLObject)module0661.$ic168$, module0661.EMPTY_SUBL_OBJECT_ARRAY);
        }
        if (module0661.NIL != f40250(var29)) {
            return (SubLObject)module0661.T;
        }
        final SubLObject var30 = f40244((SubLObject)module0661.$ic171$);
        return conses_high.member(Functions.funcall(f40227(var30), var29), Functions.funcall(f40219(var30)), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
    }
    
    public static SubLObject f40291() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0661.$g5220$.getDynamicValue(var4);
    }
    
    public static SubLObject f40292(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        module0661.$g5220$.setDynamicValue(var99, var100);
        return module0661.$g5220$.getDynamicValue(var100);
    }
    
    public static SubLObject f40280() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0661.$g5221$.getDynamicValue(var4);
    }
    
    public static SubLObject f40293(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        module0661.$g5221$.setDynamicValue(var99, var100);
        return module0661.$g5221$.getDynamicValue(var100);
    }
    
    public static SubLObject f40294() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0661.$g5222$.getDynamicValue(var4);
    }
    
    public static SubLObject f40295(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        module0661.$g5222$.setDynamicValue(var99, var100);
        return module0661.$g5222$.getDynamicValue(var100);
    }
    
    public static SubLObject f40278() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0661.$g5223$.getDynamicValue(var4);
    }
    
    public static SubLObject f40296(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        module0661.$g5223$.setDynamicValue(var99, var100);
        return module0661.$g5223$.getDynamicValue(var100);
    }
    
    public static SubLObject f40297() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0661.$g5224$.getDynamicValue(var4);
    }
    
    public static SubLObject f40298(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        module0661.$g5224$.setDynamicValue(var99, var100);
        return module0661.$g5224$.getDynamicValue(var100);
    }
    
    public static SubLObject f40271() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0661.$g5225$.getDynamicValue(var4);
    }
    
    public static SubLObject f40299(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        module0661.$g5225$.setDynamicValue(var99, var100);
        return module0661.$g5225$.getDynamicValue(var100);
    }
    
    public static SubLObject f40300() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0661.$g5226$.getDynamicValue(var4);
    }
    
    public static SubLObject f40301(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        module0661.$g5226$.setDynamicValue(var99, var100);
        return module0661.$g5226$.getDynamicValue(var100);
    }
    
    public static SubLObject f40302() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0661.$g5227$.getDynamicValue(var4);
    }
    
    public static SubLObject f40303(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        module0661.$g5227$.setDynamicValue(var99, var100);
        return module0661.$g5227$.getDynamicValue(var100);
    }
    
    public static SubLObject f40304(final SubLObject var29) {
        if (module0661.NIL == module0174.f11035(var29)) {
            Errors.sublisp_break((SubLObject)module0661.$ic168$, module0661.EMPTY_SUBL_OBJECT_ARRAY);
        }
        if (module0661.NIL != f40250(var29)) {
            return (SubLObject)module0661.T;
        }
        final SubLObject var30 = f40244((SubLObject)module0661.$ic195$);
        return conses_high.member(Functions.funcall(f40227(var30), var29), Functions.funcall(f40219(var30)), (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED);
    }
    
    public static SubLObject f40305() {
        final SubLObject var100 = f40248((SubLObject)module0661.UNPROVIDED);
        if (module0661.NIL == var100) {
            return (SubLObject)module0661.NIL;
        }
        if (module0661.NIL != conses_high.endp(var100.rest())) {
            return f40223(var100.first());
        }
        return (SubLObject)module0661.$ic200$;
    }
    
    public static SubLObject f40306(final SubLObject var29) {
        SubLObject var31;
        final SubLObject var30 = var31 = f40248((SubLObject)module0661.UNPROVIDED);
        SubLObject var32 = (SubLObject)module0661.NIL;
        var32 = var31.first();
        while (module0661.NIL != var31) {
            if (module0661.NIL == Functions.funcall(f40223(var32), var29)) {
                return (SubLObject)module0661.NIL;
            }
            var31 = var31.rest();
            var32 = var31.first();
        }
        return (SubLObject)module0661.T;
    }
    
    public static SubLObject f40307(final SubLObject var30, final SubLObject var31) {
        final SubLObject var32 = var30.rest();
        final SubLObject var34;
        final SubLObject var33 = var34 = var32;
        return (SubLObject)ConsesLow.list((SubLObject)module0661.$ic76$, (SubLObject)module0661.$ic201$, reader.bq_cons((SubLObject)module0661.$ic66$, ConsesLow.append(var34, (SubLObject)module0661.NIL)));
    }
    
    public static SubLObject f40308(final SubLObject var30, final SubLObject var31) {
        SubLObject var33;
        final SubLObject var32 = var33 = var30.rest();
        SubLObject var34 = (SubLObject)module0661.NIL;
        SubLObject var35 = (SubLObject)module0661.NIL;
        SubLObject var36 = (SubLObject)module0661.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0661.$ic202$);
        var34 = var33.first();
        var33 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0661.$ic202$);
        var35 = var33.first();
        var33 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0661.$ic202$);
        var36 = var33.first();
        var33 = var33.rest();
        SubLObject var37 = (SubLObject)module0661.NIL;
        SubLObject var38 = var33;
        SubLObject var39 = (SubLObject)module0661.NIL;
        SubLObject var113_114 = (SubLObject)module0661.NIL;
        while (module0661.NIL != var38) {
            cdestructuring_bind.destructuring_bind_must_consp(var38, var32, (SubLObject)module0661.$ic202$);
            var113_114 = var38.first();
            var38 = var38.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var38, var32, (SubLObject)module0661.$ic202$);
            if (module0661.NIL == conses_high.member(var113_114, (SubLObject)module0661.$ic203$, (SubLObject)module0661.UNPROVIDED, (SubLObject)module0661.UNPROVIDED)) {
                var39 = (SubLObject)module0661.T;
            }
            if (var113_114 == module0661.$ic204$) {
                var37 = var38.first();
            }
            var38 = var38.rest();
        }
        if (module0661.NIL != var39 && module0661.NIL == var37) {
            cdestructuring_bind.cdestructuring_bind_error(var32, (SubLObject)module0661.$ic202$);
        }
        final SubLObject var40 = cdestructuring_bind.property_list_member((SubLObject)module0661.$ic205$, var33);
        final SubLObject var41 = (SubLObject)((module0661.NIL != var40) ? conses_high.cadr(var40) : module0661.NIL);
        return (SubLObject)ConsesLow.list((SubLObject)module0661.$ic206$, (SubLObject)ConsesLow.list((SubLObject)module0661.$ic207$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0661.$ic208$, (SubLObject)module0661.$ic209$, (SubLObject)ConsesLow.list((SubLObject)module0661.$ic210$, var41)), (SubLObject)ConsesLow.list((SubLObject)module0661.$ic211$, (SubLObject)module0661.$ic212$, (SubLObject)ConsesLow.list((SubLObject)module0661.$ic213$, (SubLObject)module0661.$ic214$, (SubLObject)ConsesLow.list((SubLObject)module0661.$ic215$, var34, var35)), (SubLObject)ConsesLow.list((SubLObject)module0661.$ic216$, (SubLObject)module0661.$ic214$, (SubLObject)ConsesLow.list((SubLObject)module0661.$ic215$, var34, var35)))), (SubLObject)ConsesLow.list((SubLObject)module0661.T, (SubLObject)ConsesLow.list((SubLObject)module0661.$ic215$, var34, var36))));
    }
    
    public static SubLObject f40309(final SubLObject var30, final SubLObject var31) {
        SubLObject var33;
        final SubLObject var32 = var33 = var30.rest();
        SubLObject var34 = (SubLObject)module0661.NIL;
        SubLObject var35 = (SubLObject)module0661.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0661.$ic217$);
        var34 = var33.first();
        var33 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0661.$ic217$);
        var35 = var33.first();
        var33 = var33.rest();
        if (module0661.NIL == var33) {
            final SubLObject var36 = (SubLObject)module0661.$ic218$;
            return (SubLObject)ConsesLow.list((SubLObject)module0661.$ic76$, (SubLObject)ConsesLow.list(var36), (SubLObject)ConsesLow.list((SubLObject)module0661.$ic206$, (SubLObject)ConsesLow.list((SubLObject)module0661.$ic211$, (SubLObject)module0661.$ic209$, (SubLObject)ConsesLow.list((SubLObject)module0661.$ic215$, var36, var34), (SubLObject)ConsesLow.list((SubLObject)module0661.$ic215$, var36, var35))), (SubLObject)ConsesLow.list((SubLObject)module0661.$ic219$, var36));
        }
        cdestructuring_bind.cdestructuring_bind_error(var32, (SubLObject)module0661.$ic217$);
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40310(final SubLObject var22, SubLObject var82, SubLObject var61) {
        if (var82 == module0661.UNPROVIDED) {
            var82 = (SubLObject)module0661.NIL;
        }
        if (var61 == module0661.UNPROVIDED) {
            var61 = (SubLObject)module0661.NIL;
        }
        final SubLThread var83 = SubLProcess.currentSubLThread();
        if (module0661.NIL == var82) {
            var82 = f40213(var22);
        }
        SubLObject var84 = (SubLObject)module0661.$ic220$;
        final SubLObject var85 = module0655.$g5132$.getDynamicValue(var83);
        if (var85 == module0661.$ic221$) {
            var84 = (SubLObject)module0661.$ic222$;
        }
        final SubLObject var86 = module0656.f39832(var85);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
        module0655.f39768();
        if (module0661.NIL != var61) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var83), (SubLObject)module0661.$ic223$, new SubLObject[] { var84, f40216(var22), var61 });
        }
        else {
            PrintLow.format(module0015.$g131$.getDynamicValue(var83), (SubLObject)module0661.$ic224$, var84, f40216(var22));
        }
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
        if (module0661.NIL != var86) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
            module0642.f39020(var86);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0661.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0661.UNPROVIDED);
        final SubLObject var87 = module0015.$g533$.currentBinding(var83);
        try {
            module0015.$g533$.bind((SubLObject)module0661.T, var83);
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
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40312() {
        module0661.$g5209$ = SubLFiles.defparameter("S#44361", (SubLObject)module0661.NIL);
        module0661.$g5210$ = SubLFiles.defconstant("S#44362", (SubLObject)module0661.$ic4$);
        module0661.$g5211$ = SubLFiles.deflexical("S#44363", (SubLObject)((module0661.NIL != Symbols.boundp((SubLObject)module0661.$ic58$)) ? module0661.$g5211$.getGlobalValue() : module0661.NIL));
        module0661.$g5212$ = SubLFiles.deflexical("S#44364", (SubLObject)((module0661.NIL != Symbols.boundp((SubLObject)module0661.$ic59$)) ? module0661.$g5212$.getGlobalValue() : module0661.NIL));
        module0661.$g5213$ = SubLFiles.defparameter("S#44365", (SubLObject)module0661.NIL);
        module0661.$g5214$ = SubLFiles.deflexical("S#44366", (SubLObject)module0661.NIL);
        module0661.$g5215$ = SubLFiles.deflexical("S#44367", (SubLObject)module0661.$ic96$);
        module0661.$g5216$ = SubLFiles.defparameter("S#44368", (SubLObject)module0661.NIL);
        module0661.$g5217$ = SubLFiles.defparameter("S#44369", (SubLObject)module0661.NIL);
        module0661.$g5218$ = SubLFiles.defparameter("S#44370", (SubLObject)module0661.NIL);
        module0661.$g5219$ = SubLFiles.defparameter("S#44371", (SubLObject)module0661.NIL);
        module0661.$g5220$ = SubLFiles.defparameter("S#44372", (SubLObject)module0661.NIL);
        module0661.$g5221$ = SubLFiles.defparameter("S#44373", (SubLObject)module0661.NIL);
        module0661.$g5222$ = SubLFiles.defparameter("S#44374", (SubLObject)module0661.NIL);
        module0661.$g5223$ = SubLFiles.defparameter("S#44375", (SubLObject)module0661.NIL);
        module0661.$g5224$ = SubLFiles.defparameter("S#44376", (SubLObject)module0661.NIL);
        module0661.$g5225$ = SubLFiles.defparameter("S#44377", (SubLObject)module0661.NIL);
        module0661.$g5226$ = SubLFiles.defparameter("S#44378", (SubLObject)module0661.NIL);
        module0661.$g5227$ = SubLFiles.defparameter("S#44379", (SubLObject)module0661.NIL);
        return (SubLObject)module0661.NIL;
    }
    
    public static SubLObject f40313() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0661.$g5210$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0661.$ic11$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0661.$ic12$);
        Structures.def_csetf((SubLObject)module0661.$ic13$, (SubLObject)module0661.$ic14$);
        Structures.def_csetf((SubLObject)module0661.$ic15$, (SubLObject)module0661.$ic16$);
        Structures.def_csetf((SubLObject)module0661.$ic17$, (SubLObject)module0661.$ic18$);
        Structures.def_csetf((SubLObject)module0661.$ic19$, (SubLObject)module0661.$ic20$);
        Structures.def_csetf((SubLObject)module0661.$ic21$, (SubLObject)module0661.$ic22$);
        Structures.def_csetf((SubLObject)module0661.$ic23$, (SubLObject)module0661.$ic24$);
        Structures.def_csetf((SubLObject)module0661.$ic25$, (SubLObject)module0661.$ic26$);
        Structures.def_csetf((SubLObject)module0661.$ic27$, (SubLObject)module0661.$ic28$);
        Structures.def_csetf((SubLObject)module0661.$ic29$, (SubLObject)module0661.$ic30$);
        Structures.def_csetf((SubLObject)module0661.$ic31$, (SubLObject)module0661.$ic32$);
        Structures.def_csetf((SubLObject)module0661.$ic33$, (SubLObject)module0661.$ic34$);
        Structures.def_csetf((SubLObject)module0661.$ic35$, (SubLObject)module0661.$ic36$);
        Structures.def_csetf((SubLObject)module0661.$ic37$, (SubLObject)module0661.$ic38$);
        Equality.identity((SubLObject)module0661.$ic4$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0661.$g5210$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0661.$ic57$));
        module0003.f57((SubLObject)module0661.$ic58$);
        module0003.f57((SubLObject)module0661.$ic59$);
        Hashtables.sethash((SubLObject)module0661.$ic105$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0661.$ic106$, (SubLObject)module0661.NIL));
        module0015.f873((SubLObject)module0661.$ic130$);
        module0015.f873((SubLObject)module0661.$ic134$);
        module0015.f873((SubLObject)module0661.$ic136$);
        module0015.f873((SubLObject)module0661.$ic137$);
        module0656.f39840((SubLObject)module0661.$ic141$, (SubLObject)module0661.$ic142$, (SubLObject)module0661.TWO_INTEGER);
        module0012.f441((SubLObject)module0661.$ic161$);
        module0012.f441((SubLObject)module0661.$ic162$);
        f40252((SubLObject)module0661.$ic163$, (SubLObject)module0661.$ic164$, (SubLObject)module0661.$ic165$, (SubLObject)module0661.$ic166$, (SubLObject)module0661.$ic167$);
        module0012.f441((SubLObject)module0661.$ic169$);
        module0012.f441((SubLObject)module0661.$ic170$);
        f40252((SubLObject)module0661.$ic171$, (SubLObject)module0661.$ic172$, (SubLObject)module0661.$ic173$, (SubLObject)module0661.$ic174$, (SubLObject)module0661.$ic175$);
        module0012.f441((SubLObject)module0661.$ic176$);
        module0012.f441((SubLObject)module0661.$ic177$);
        f40252((SubLObject)module0661.$ic178$, (SubLObject)module0661.$ic179$, (SubLObject)module0661.$ic180$, (SubLObject)module0661.$ic181$, (SubLObject)module0661.NIL);
        module0012.f441((SubLObject)module0661.$ic182$);
        module0012.f441((SubLObject)module0661.$ic183$);
        f40252((SubLObject)module0661.$ic184$, (SubLObject)module0661.$ic185$, (SubLObject)module0661.$ic186$, (SubLObject)module0661.$ic187$, (SubLObject)module0661.NIL);
        module0012.f441((SubLObject)module0661.$ic188$);
        module0012.f441((SubLObject)module0661.$ic189$);
        f40252((SubLObject)module0661.$ic154$, (SubLObject)module0661.$ic190$, (SubLObject)module0661.$ic191$, (SubLObject)module0661.$ic192$, (SubLObject)module0661.NIL);
        module0012.f441((SubLObject)module0661.$ic193$);
        module0012.f441((SubLObject)module0661.$ic194$);
        f40252((SubLObject)module0661.$ic195$, (SubLObject)module0661.$ic196$, (SubLObject)module0661.$ic197$, (SubLObject)module0661.$ic198$, (SubLObject)module0661.$ic199$);
        module0656.f39840((SubLObject)module0661.$ic86$, (SubLObject)module0661.$ic225$, (SubLObject)module0661.THREE_INTEGER);
        return (SubLObject)module0661.NIL;
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
        module0661.$g5209$ = null;
        module0661.$g5210$ = null;
        module0661.$g5211$ = null;
        module0661.$g5212$ = null;
        module0661.$g5213$ = null;
        module0661.$g5214$ = null;
        module0661.$g5215$ = null;
        module0661.$g5216$ = null;
        module0661.$g5217$ = null;
        module0661.$g5218$ = null;
        module0661.$g5219$ = null;
        module0661.$g5220$ = null;
        module0661.$g5221$ = null;
        module0661.$g5222$ = null;
        module0661.$g5223$ = null;
        module0661.$g5224$ = null;
        module0661.$g5225$ = null;
        module0661.$g5226$ = null;
        module0661.$g5227$ = null;
        $ic0$ = SubLObjectFactory.makeString("#");
        $ic1$ = SubLObjectFactory.makeString("#<");
        $ic2$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic3$ = SubLObjectFactory.makeKeyword("BASE");
        $ic4$ = SubLObjectFactory.makeSymbol("S#44265", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#44266", "CYC");
        $ic6$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#29", "CYC"), SubLObjectFactory.makeSymbol("S#44380", "CYC"), SubLObjectFactory.makeSymbol("S#44381", "CYC"), SubLObjectFactory.makeSymbol("S#44382", "CYC"), SubLObjectFactory.makeSymbol("S#44383", "CYC"), SubLObjectFactory.makeSymbol("S#44384", "CYC"), SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("S#44171", "CYC"), SubLObjectFactory.makeSymbol("S#44176", "CYC"), SubLObjectFactory.makeSymbol("S#44385", "CYC"), SubLObjectFactory.makeSymbol("S#44386", "CYC"), SubLObjectFactory.makeSymbol("S#44387", "CYC"), SubLObjectFactory.makeSymbol("S#44388", "CYC") });
        $ic7$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeKeyword("SUMMARY-NAME"), SubLObjectFactory.makeKeyword("LINKABLE-NAME"), SubLObjectFactory.makeKeyword("LINKNAME-PREFIX"), SubLObjectFactory.makeKeyword("FILTER-GETTER"), SubLObjectFactory.makeKeyword("FILTER-SETTER"), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("ACTIVE-P"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeKeyword("VALUE-PROMPT-FN"), SubLObjectFactory.makeKeyword("VALUE-UPDATE-FN"), SubLObjectFactory.makeKeyword("INITIAL-FILTER-VALUE"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN-SLOTNAME") });
        $ic8$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#44269", "CYC"), SubLObjectFactory.makeSymbol("S#44270", "CYC"), SubLObjectFactory.makeSymbol("S#44271", "CYC"), SubLObjectFactory.makeSymbol("S#44272", "CYC"), SubLObjectFactory.makeSymbol("S#44273", "CYC"), SubLObjectFactory.makeSymbol("S#44274", "CYC"), SubLObjectFactory.makeSymbol("S#44275", "CYC"), SubLObjectFactory.makeSymbol("S#44276", "CYC"), SubLObjectFactory.makeSymbol("S#44277", "CYC"), SubLObjectFactory.makeSymbol("S#44278", "CYC"), SubLObjectFactory.makeSymbol("S#44279", "CYC"), SubLObjectFactory.makeSymbol("S#44280", "CYC"), SubLObjectFactory.makeSymbol("S#44281", "CYC") });
        $ic9$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#44282", "CYC"), SubLObjectFactory.makeSymbol("S#44283", "CYC"), SubLObjectFactory.makeSymbol("S#44284", "CYC"), SubLObjectFactory.makeSymbol("S#44285", "CYC"), SubLObjectFactory.makeSymbol("S#44286", "CYC"), SubLObjectFactory.makeSymbol("S#44287", "CYC"), SubLObjectFactory.makeSymbol("S#44288", "CYC"), SubLObjectFactory.makeSymbol("S#44289", "CYC"), SubLObjectFactory.makeSymbol("S#44290", "CYC"), SubLObjectFactory.makeSymbol("S#44291", "CYC"), SubLObjectFactory.makeSymbol("S#44292", "CYC"), SubLObjectFactory.makeSymbol("S#44293", "CYC"), SubLObjectFactory.makeSymbol("S#44294", "CYC") });
        $ic10$ = SubLObjectFactory.makeSymbol("S#44267", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#44268", "CYC");
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#44266", "CYC"));
        $ic13$ = SubLObjectFactory.makeSymbol("S#44269", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#44282", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#44270", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#44283", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#44271", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#44284", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#44272", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#44285", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#44273", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#44286", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#44274", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#44287", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#44275", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#44288", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#44276", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#44289", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#44277", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#44290", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#44278", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#44291", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#44279", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#44292", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#44280", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#44293", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#44281", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#44294", "CYC");
        $ic39$ = SubLObjectFactory.makeKeyword("NAME");
        $ic40$ = SubLObjectFactory.makeKeyword("SUMMARY-NAME");
        $ic41$ = SubLObjectFactory.makeKeyword("LINKABLE-NAME");
        $ic42$ = SubLObjectFactory.makeKeyword("LINKNAME-PREFIX");
        $ic43$ = SubLObjectFactory.makeKeyword("FILTER-GETTER");
        $ic44$ = SubLObjectFactory.makeKeyword("FILTER-SETTER");
        $ic45$ = SubLObjectFactory.makeKeyword("TYPE");
        $ic46$ = SubLObjectFactory.makeKeyword("ACTIVE-P");
        $ic47$ = SubLObjectFactory.makeKeyword("EFFECTIVE-FN");
        $ic48$ = SubLObjectFactory.makeKeyword("VALUE-PROMPT-FN");
        $ic49$ = SubLObjectFactory.makeKeyword("VALUE-UPDATE-FN");
        $ic50$ = SubLObjectFactory.makeKeyword("INITIAL-FILTER-VALUE");
        $ic51$ = SubLObjectFactory.makeKeyword("EFFECTIVE-FN-SLOTNAME");
        $ic52$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic53$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic54$ = SubLObjectFactory.makeSymbol("S#44295", "CYC");
        $ic55$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic56$ = SubLObjectFactory.makeKeyword("END");
        $ic57$ = SubLObjectFactory.makeSymbol("S#44297", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("S#44363", "CYC");
        $ic59$ = SubLObjectFactory.makeSymbol("S#44364", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("S#44300", "CYC");
        $ic61$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#30", "CYC"));
        $ic62$ = SubLObjectFactory.makeString("~A-FILTER");
        $ic63$ = SubLObjectFactory.makeString("CB-~A");
        $ic64$ = SubLObjectFactory.makeString("SET-~A");
        $ic65$ = SubLObjectFactory.makeString("~A-EFFECTIVE-FN");
        $ic66$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic67$ = SubLObjectFactory.makeSymbol("S#43625", "CYC");
        $ic68$ = ConsesLow.list((SubLObject)module0661.NIL, (SubLObject)SubLObjectFactory.makeString("Automatically generated filter"));
        $ic69$ = SubLObjectFactory.makeKeyword("LIST-OF-FORMS");
        $ic70$ = SubLObjectFactory.makeSymbol("S#44306", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic72$ = SubLObjectFactory.makeSymbol("DEFINE");
        $ic73$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"));
        $ic74$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BREAK"), (SubLObject)SubLObjectFactory.makeString("not an assertion")));
        $ic75$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44304", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)module0661.T));
        $ic76$ = SubLObjectFactory.makeSymbol("CLET");
        $ic77$ = SubLObjectFactory.makeSymbol("S#44298", "CYC");
        $ic78$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44281", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44265", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44273", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44265", "CYC"))))));
        $ic79$ = ConsesLow.list((SubLObject)module0661.NIL);
        $ic80$ = SubLObjectFactory.makeSymbol("CAR");
        $ic81$ = SubLObjectFactory.makeString("activate-~A");
        $ic82$ = SubLObjectFactory.makeString(":");
        $ic83$ = SubLObjectFactory.makeKeyword("NBSP");
        $ic84$ = SubLObjectFactory.makeKeyword("SINGLE-SIMPLE-DATE");
        $ic85$ = SubLObjectFactory.makeString("~D");
        $ic86$ = SubLObjectFactory.makeKeyword("EDIT-VIEWPOINT");
        $ic87$ = SubLObjectFactory.makeString("Edit");
        $ic88$ = SubLObjectFactory.makeSymbol("S#44307", "CYC");
        $ic89$ = SubLObjectFactory.makeString("Complete");
        $ic90$ = SubLObjectFactory.makeString("");
        $ic91$ = SubLObjectFactory.makeString("cb-show-cyclist-~A");
        $ic92$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Cyclist"));
        $ic93$ = SubLObjectFactory.makeInteger(24);
        $ic94$ = SubLObjectFactory.makeString("cb-show-cyclist1-~A");
        $ic95$ = SubLObjectFactory.makeString("cb-show-cyclist2-~A");
        $ic96$ = SubLObjectFactory.makeString("--------");
        $ic97$ = SubLObjectFactory.makeString("Unknown ~A: ~S");
        $ic98$ = SubLObjectFactory.makeString("cyclist");
        $ic99$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Cyc-BasedProject"));
        $ic100$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic101$ = SubLObjectFactory.makeString("project1-~A");
        $ic102$ = SubLObjectFactory.makeString("project2-~A");
        $ic103$ = SubLObjectFactory.makeString("project3-~A");
        $ic104$ = SubLObjectFactory.makeString("project");
        $ic105$ = SubLObjectFactory.makeKeyword("CB-VIEWPOINT");
        $ic106$ = SubLObjectFactory.makeString("cb-viewpoint.html");
        $ic107$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44182", "CYC"));
        $ic108$ = SubLObjectFactory.makeString("~a does not specify an index");
        $ic109$ = SubLObjectFactory.makeString("Viewpoint Filter Summary");
        $ic110$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic111$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic112$ = SubLObjectFactory.makeString("stylesheet");
        $ic113$ = SubLObjectFactory.makeString("text/css");
        $ic114$ = SubLObjectFactory.makeKeyword("SHA1");
        $ic115$ = SubLObjectFactory.makeString("text/javascript");
        $ic116$ = SubLObjectFactory.makeString("yui-skin-sam");
        $ic117$ = SubLObjectFactory.makeString("reloadFrameButton");
        $ic118$ = SubLObjectFactory.makeString("button");
        $ic119$ = SubLObjectFactory.makeString("reload");
        $ic120$ = SubLObjectFactory.makeString("Refresh Frames");
        $ic121$ = SubLObjectFactory.makeString("post");
        $ic122$ = SubLObjectFactory.makeString("cb-viewpoint-summary-handler");
        $ic123$ = SubLObjectFactory.makeString("Current Values");
        $ic124$ = SubLObjectFactory.makeString("Update Filter Settings");
        $ic125$ = SubLObjectFactory.makeString("always-show-comments");
        $ic126$ = SubLObjectFactory.makeString("Always show comments, regardless of other filter settings.");
        $ic127$ = SubLObjectFactory.makeString("always-show-bookkeeping");
        $ic128$ = SubLObjectFactory.makeString("Always show bookkeeping predicates, regardless of other filter settings.");
        $ic129$ = SubLObjectFactory.makeSymbol("S#44315", "CYC");
        $ic130$ = SubLObjectFactory.makeSymbol("CB-VIEWPOINT");
        $ic131$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44380", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44182", "CYC"));
        $ic132$ = SubLObjectFactory.makeString("Viewpoint Filters");
        $ic133$ = SubLObjectFactory.makeString("cb-viewpoint-handler");
        $ic134$ = SubLObjectFactory.makeSymbol("CB-EV");
        $ic135$ = SubLObjectFactory.makeString("Summary filters have been changed");
        $ic136$ = SubLObjectFactory.makeSymbol("CB-VIEWPOINT-SUMMARY-HANDLER");
        $ic137$ = SubLObjectFactory.makeSymbol("CB-VIEWPOINT-HANDLER");
        $ic138$ = SubLObjectFactory.makeString("[Viewpoint]");
        $ic139$ = SubLObjectFactory.makeKeyword("MAIN");
        $ic140$ = SubLObjectFactory.makeString("cb-viewpoint&~A");
        $ic141$ = SubLObjectFactory.makeKeyword("VIEWPOINT");
        $ic142$ = SubLObjectFactory.makeSymbol("S#44316", "CYC");
        $ic143$ = SubLObjectFactory.makeString(" ");
        $ic144$ = SubLObjectFactory.makeString(" Filter");
        $ic145$ = SubLObjectFactory.makeString("(Only those terms whose ");
        $ic146$ = SubLObjectFactory.makeString(" field has a value equal to a term below will be presented. Leave blank to disable this filter.)");
        $ic147$ = SubLObjectFactory.makeSymbol("S#44310", "CYC");
        $ic148$ = SubLObjectFactory.makeString("Activate Filter");
        $ic149$ = SubLObjectFactory.makeString("all-dates-~A");
        $ic150$ = SubLObjectFactory.makeString("no");
        $ic151$ = SubLObjectFactory.makeString("cb-show-start-~A");
        $ic152$ = SubLObjectFactory.makeString("all");
        $ic153$ = SubLObjectFactory.makeString("yes");
        $ic154$ = SubLObjectFactory.makeSymbol("S#12701", "CYC");
        $ic155$ = SubLObjectFactory.makeString("All Mts");
        $ic156$ = SubLObjectFactory.makeString("Specify Mts");
        $ic157$ = SubLObjectFactory.makeString("use-genl-mt");
        $ic158$ = SubLObjectFactory.makeString("Include All Genl Mts");
        $ic159$ = SubLObjectFactory.makeString("new-mt");
        $ic160$ = SubLObjectFactory.makeSymbol("S#44313", "CYC");
        $ic161$ = SubLObjectFactory.makeSymbol("S#44368", "CYC");
        $ic162$ = SubLObjectFactory.makeSymbol("S#44369", "CYC");
        $ic163$ = SubLObjectFactory.makeSymbol("S#44389", "CYC");
        $ic164$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("LINKABLE-NAME"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreator")), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("LIST-OF-FORMS"), SubLObjectFactory.makeKeyword("ACTIVE-P"), module0661.NIL, SubLObjectFactory.makeKeyword("VALUE-PROMPT-FN"), SubLObjectFactory.makeSymbol("S#44318", "CYC"), SubLObjectFactory.makeKeyword("VALUE-UPDATE-FN"), SubLObjectFactory.makeSymbol("S#44322", "CYC"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN-SLOTNAME"), SubLObjectFactory.makeSymbol("ASSERTED-BY") });
        $ic165$ = SubLObjectFactory.makeSymbol("S#44330", "CYC");
        $ic166$ = SubLObjectFactory.makeSymbol("S#44331", "CYC");
        $ic167$ = SubLObjectFactory.makeSymbol("S#44332", "CYC");
        $ic168$ = SubLObjectFactory.makeString("not an assertion");
        $ic169$ = SubLObjectFactory.makeSymbol("S#44370", "CYC");
        $ic170$ = SubLObjectFactory.makeSymbol("S#44371", "CYC");
        $ic171$ = SubLObjectFactory.makeSymbol("S#44390", "CYC");
        $ic172$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("LINKABLE-NAME"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("myReviewer")), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("LIST-OF-FORMS"), SubLObjectFactory.makeKeyword("ACTIVE-P"), module0661.NIL, SubLObjectFactory.makeKeyword("EFFECTIVE-FN-SLOTNAME"), SubLObjectFactory.makeSymbol("S#43931", "CYC"), SubLObjectFactory.makeKeyword("VALUE-PROMPT-FN"), SubLObjectFactory.makeSymbol("S#44318", "CYC"), SubLObjectFactory.makeKeyword("VALUE-UPDATE-FN"), SubLObjectFactory.makeSymbol("S#44322", "CYC") });
        $ic173$ = SubLObjectFactory.makeSymbol("S#44335", "CYC");
        $ic174$ = SubLObjectFactory.makeSymbol("S#44336", "CYC");
        $ic175$ = SubLObjectFactory.makeSymbol("S#44337", "CYC");
        $ic176$ = SubLObjectFactory.makeSymbol("S#44372", "CYC");
        $ic177$ = SubLObjectFactory.makeSymbol("S#44373", "CYC");
        $ic178$ = SubLObjectFactory.makeSymbol("S#44391", "CYC");
        $ic179$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("LINKNAME-PREFIX"), SubLObjectFactory.makeString("After "), SubLObjectFactory.makeKeyword("LINKABLE-NAME"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationTime")), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("SINGLE-SIMPLE-DATE"), SubLObjectFactory.makeKeyword("ACTIVE-P"), module0661.NIL, SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("S#44327", "CYC"), SubLObjectFactory.makeKeyword("VALUE-PROMPT-FN"), SubLObjectFactory.makeSymbol("S#44319", "CYC"), SubLObjectFactory.makeKeyword("VALUE-UPDATE-FN"), SubLObjectFactory.makeSymbol("S#44324", "CYC"), SubLObjectFactory.makeKeyword("INITIAL-FILTER-VALUE"), SubLObjectFactory.makeInteger(19800101) });
        $ic180$ = SubLObjectFactory.makeSymbol("S#44340", "CYC");
        $ic181$ = SubLObjectFactory.makeSymbol("S#44341", "CYC");
        $ic182$ = SubLObjectFactory.makeSymbol("S#44374", "CYC");
        $ic183$ = SubLObjectFactory.makeSymbol("S#44375", "CYC");
        $ic184$ = SubLObjectFactory.makeSymbol("S#44392", "CYC");
        $ic185$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("LINKNAME-PREFIX"), SubLObjectFactory.makeString("Before "), SubLObjectFactory.makeKeyword("LINKABLE-NAME"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationTime")), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("SINGLE-SIMPLE-DATE"), SubLObjectFactory.makeKeyword("ACTIVE-P"), module0661.NIL, SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("S#44326", "CYC"), SubLObjectFactory.makeKeyword("VALUE-PROMPT-FN"), SubLObjectFactory.makeSymbol("S#44319", "CYC"), SubLObjectFactory.makeKeyword("VALUE-UPDATE-FN"), SubLObjectFactory.makeSymbol("S#44324", "CYC"), SubLObjectFactory.makeKeyword("INITIAL-FILTER-VALUE"), SubLObjectFactory.makeInteger(29991231) });
        $ic186$ = SubLObjectFactory.makeSymbol("S#44344", "CYC");
        $ic187$ = SubLObjectFactory.makeSymbol("S#44345", "CYC");
        $ic188$ = SubLObjectFactory.makeSymbol("S#44376", "CYC");
        $ic189$ = SubLObjectFactory.makeSymbol("S#44377", "CYC");
        $ic190$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("LINKABLE-NAME"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Microtheory")), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("LIST-OF-FORMS"), SubLObjectFactory.makeKeyword("ACTIVE-P"), module0661.NIL, SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), module0661.NIL, SubLObjectFactory.makeKeyword("VALUE-PROMPT-FN"), SubLObjectFactory.makeSymbol("S#44320", "CYC"), SubLObjectFactory.makeKeyword("VALUE-UPDATE-FN"), SubLObjectFactory.makeSymbol("S#44325", "CYC") });
        $ic191$ = SubLObjectFactory.makeSymbol("S#44348", "CYC");
        $ic192$ = SubLObjectFactory.makeSymbol("S#44349", "CYC");
        $ic193$ = SubLObjectFactory.makeSymbol("S#44378", "CYC");
        $ic194$ = SubLObjectFactory.makeSymbol("S#44379", "CYC");
        $ic195$ = SubLObjectFactory.makeSymbol("S#44393", "CYC");
        $ic196$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("LINKABLE-NAME"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationPurpose")), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("LIST-OF-FORMS"), SubLObjectFactory.makeKeyword("ACTIVE-P"), module0661.NIL, SubLObjectFactory.makeKeyword("VALUE-PROMPT-FN"), SubLObjectFactory.makeSymbol("S#44321", "CYC"), SubLObjectFactory.makeKeyword("VALUE-UPDATE-FN"), SubLObjectFactory.makeSymbol("S#44323", "CYC"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN-SLOTNAME"), SubLObjectFactory.makeSymbol("ASSERTED-WHY") });
        $ic197$ = SubLObjectFactory.makeSymbol("S#44352", "CYC");
        $ic198$ = SubLObjectFactory.makeSymbol("S#44353", "CYC");
        $ic199$ = SubLObjectFactory.makeSymbol("S#44354", "CYC");
        $ic200$ = SubLObjectFactory.makeSymbol("S#44356", "CYC");
        $ic201$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43972", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44355", "CYC"))));
        $ic202$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44394", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44395", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#755", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#44396", "CYC"));
        $ic203$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SPECIFIED-MT"));
        $ic204$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic205$ = SubLObjectFactory.makeKeyword("SPECIFIED-MT");
        $ic206$ = SubLObjectFactory.makeSymbol("S#44357", "CYC");
        $ic207$ = SubLObjectFactory.makeSymbol("PCOND");
        $ic208$ = SubLObjectFactory.makeSymbol("CAND");
        $ic209$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44299", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12701", "CYC")));
        $ic210$ = SubLObjectFactory.makeSymbol("CNOT");
        $ic211$ = SubLObjectFactory.makeSymbol("PIF");
        $ic212$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#43648", "CYC"));
        $ic213$ = SubLObjectFactory.makeSymbol("S#12292", "CYC");
        $ic214$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44348", "CYC"));
        $ic215$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic216$ = SubLObjectFactory.makeSymbol("WITH-MT-LIST");
        $ic217$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44397", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44398", "CYC"));
        $ic218$ = SubLObjectFactory.makeUninternedSymbol("US#703B6C2");
        $ic219$ = SubLObjectFactory.makeSymbol("RET");
        $ic220$ = SubLObjectFactory.makeString("cb-ev");
        $ic221$ = SubLObjectFactory.makeKeyword("TOP");
        $ic222$ = SubLObjectFactory.makeString("cb-start|cb-ev");
        $ic223$ = SubLObjectFactory.makeString("~a&~a&~a");
        $ic224$ = SubLObjectFactory.makeString("~a&~a");
        $ic225$ = SubLObjectFactory.makeSymbol("S#44360", "CYC");
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
            structDecl = Structures.makeStructDeclNative((Class)$sX44265_native.class, module0661.$ic4$, module0661.$ic5$, module0661.$ic6$, module0661.$ic7$, new String[] { "$name", "$summary_name", "$linkable_name", "$linkname_prefix", "$filter_getter", "$filter_setter", "$type", "$active_p", "$effective_fn", "$value_prompt_fn", "$value_update_fn", "$initial_filter_value", "$effective_fn_slotname" }, module0661.$ic8$, module0661.$ic9$, module0661.$ic10$);
        }
    }
    
    public static final class $f40215$UnaryFunction extends UnaryFunction
    {
        public $f40215$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#44266"));
        }
        
        public SubLObject processItem(final SubLObject var10) {
            return module0661.f40215(var10);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0661.class
	Total time: 712 ms
	
	Decompiled with Procyon 0.5.32.
*/