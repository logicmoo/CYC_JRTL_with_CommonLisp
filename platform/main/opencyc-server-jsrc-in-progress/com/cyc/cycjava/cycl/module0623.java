package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0623 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0623";
    public static final String myFingerPrint = "fed6d1c9e50605ea4242d5954939a528eabd64beedf069a308e57dc1725cc07c";
    private static SubLSymbol $g4770$;
    public static SubLSymbol $g4771$;
    public static SubLSymbol $g4772$;
    private static SubLSymbol $g4773$;
    public static SubLSymbol $g4774$;
    public static SubLSymbol $g4775$;
    public static SubLSymbol $g4776$;
    private static SubLSymbol $g4777$;
    private static SubLSymbol $g4778$;
    private static SubLSymbol $g4779$;
    private static SubLSymbol $g4780$;
    private static SubLSymbol $g4781$;
    private static SubLSymbol $g4782$;
    private static SubLSymbol $g4783$;
    private static SubLSymbol $g4784$;
    private static SubLSymbol $g4785$;
    private static SubLSymbol $g4786$;
    private static SubLSymbol $g4787$;
    public static SubLSymbol $g4788$;
    public static SubLSymbol $g4789$;
    public static SubLSymbol $g4790$;
    public static SubLSymbol $g4791$;
    public static SubLSymbol $g1441$;
    private static SubLSymbol $g4792$;
    public static SubLSymbol $g4793$;
    public static SubLSymbol $g4794$;
    private static SubLSymbol $g4795$;
    private static SubLSymbol $g4796$;
    public static SubLSymbol $g4797$;
    public static SubLSymbol $g4798$;
    private static SubLSymbol $g4799$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
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
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLList $ic66$;
    private static final SubLList $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
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
    private static final SubLList $ic86$;
    private static final SubLList $ic87$;
    private static final SubLList $ic88$;
    private static final SubLList $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLList $ic92$;
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
    private static final SubLString $ic106$;
    private static final SubLString $ic107$;
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLList $ic113$;
    private static final SubLList $ic114$;
    private static final SubLList $ic115$;
    private static final SubLList $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLList $ic119$;
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
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLString $ic146$;
    private static final SubLString $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLString $ic151$;
    private static final SubLString $ic152$;
    private static final SubLString $ic153$;
    private static final SubLInteger $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLString $ic159$;
    private static final SubLString $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLString $ic167$;
    private static final SubLString $ic168$;
    private static final SubLString $ic169$;
    private static final SubLString $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLString $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLString $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLList $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLString $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLList $ic195$;
    private static final SubLString $ic196$;
    private static final SubLFloat $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLString $ic199$;
    private static final SubLString $ic200$;
    private static final SubLString $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLString $ic203$;
    private static final SubLString $ic204$;
    private static final SubLString $ic205$;
    private static final SubLString $ic206$;
    private static final SubLInteger $ic207$;
    private static final SubLString $ic208$;
    private static final SubLString $ic209$;
    private static final SubLString $ic210$;
    private static final SubLString $ic211$;
    private static final SubLString $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLString $ic216$;
    private static final SubLString $ic217$;
    private static final SubLString $ic218$;
    private static final SubLString $ic219$;
    private static final SubLString $ic220$;
    private static final SubLString $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLList $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLList $ic225$;
    private static final SubLList $ic226$;
    private static final SubLList $ic227$;
    private static final SubLString $ic228$;
    private static final SubLString $ic229$;
    private static final SubLString $ic230$;
    private static final SubLSymbol $ic231$;
    private static final SubLList $ic232$;
    private static final SubLSymbol $ic233$;
    private static final SubLList $ic234$;
    private static final SubLSymbol $ic235$;
    private static final SubLString $ic236$;
    private static final SubLString $ic237$;
    private static final SubLSymbol $ic238$;
    private static final SubLSymbol $ic239$;
    private static final SubLString $ic240$;
    private static final SubLString $ic241$;
    private static final SubLString $ic242$;
    private static final SubLSymbol $ic243$;
    private static final SubLSymbol $ic244$;
    private static final SubLList $ic245$;
    private static final SubLSymbol $ic246$;
    private static final SubLSymbol $ic247$;
    private static final SubLList $ic248$;
    private static final SubLList $ic249$;
    private static final SubLString $ic250$;
    private static final SubLString $ic251$;
    private static final SubLSymbol $ic252$;
    private static final SubLList $ic253$;
    private static final SubLString $ic254$;
    private static final SubLString $ic255$;
    private static final SubLString $ic256$;
    private static final SubLString $ic257$;
    private static final SubLString $ic258$;
    private static final SubLSymbol $ic259$;
    private static final SubLList $ic260$;
    private static final SubLString $ic261$;
    private static final SubLList $ic262$;
    private static final SubLSymbol $ic263$;
    private static final SubLSymbol $ic264$;
    private static final SubLList $ic265$;
    private static final SubLString $ic266$;
    private static final SubLString $ic267$;
    private static final SubLList $ic268$;
    private static final SubLSymbol $ic269$;
    private static final SubLSymbol $ic270$;
    private static final SubLString $ic271$;
    private static final SubLString $ic272$;
    private static final SubLString $ic273$;
    private static final SubLSymbol $ic274$;
    private static final SubLString $ic275$;
    private static final SubLSymbol $ic276$;
    private static final SubLString $ic277$;
    private static final SubLSymbol $ic278$;
    private static final SubLSymbol $ic279$;
    private static final SubLSymbol $ic280$;
    private static final SubLSymbol $ic281$;
    private static final SubLSymbol $ic282$;
    private static final SubLSymbol $ic283$;
    private static final SubLSymbol $ic284$;
    private static final SubLSymbol $ic285$;
    private static final SubLString $ic286$;
    private static final SubLSymbol $ic287$;
    private static final SubLString $ic288$;
    private static final SubLString $ic289$;
    private static final SubLSymbol $ic290$;
    private static final SubLSymbol $ic291$;
    private static final SubLSymbol $ic292$;
    private static final SubLSymbol $ic293$;
    private static final SubLSymbol $ic294$;
    private static final SubLSymbol $ic295$;
    private static final SubLSymbol $ic296$;
    private static final SubLString $ic297$;
    private static final SubLString $ic298$;
    private static final SubLSymbol $ic299$;
    private static final SubLString $ic300$;
    private static final SubLString $ic301$;
    private static final SubLSymbol $ic302$;
    private static final SubLString $ic303$;
    private static final SubLSymbol $ic304$;
    private static final SubLSymbol $ic305$;
    private static final SubLString $ic306$;
    private static final SubLString $ic307$;
    private static final SubLSymbol $ic308$;
    
    
    public static SubLObject f38276() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g4770$.getDynamicValue(var1);
    }
    
    public static SubLObject f38277(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        assert NIL != Types.integerp(var2) : var2;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && (!MINUS_ONE_INTEGER.numL(var2) || !var2.numL((SubLObject)TEN_INTEGER))) {
            Errors.error((SubLObject)$ic2$, var2);
        }
        $g4770$.setDynamicValue(var2, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38278(final SubLObject var3, final SubLObject var4) {
        f38279(var3, var4, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38280(final SubLObject var3) {
        return (SubLObject)((var3.getClass() == $sX41864_native.class) ? T : NIL);
    }
    
    public static SubLObject f38281(final SubLObject var3) {
        assert NIL != f38280(var3) : var3;
        return var3.getField2();
    }
    
    public static SubLObject f38282(final SubLObject var3) {
        assert NIL != f38280(var3) : var3;
        return var3.getField3();
    }
    
    public static SubLObject f38283(final SubLObject var3) {
        assert NIL != f38280(var3) : var3;
        return var3.getField4();
    }
    
    public static SubLObject f38284(final SubLObject var3) {
        assert NIL != f38280(var3) : var3;
        return var3.getField5();
    }
    
    public static SubLObject f38285(final SubLObject var3) {
        assert NIL != f38280(var3) : var3;
        return var3.getField6();
    }
    
    public static SubLObject f38286(final SubLObject var3) {
        assert NIL != f38280(var3) : var3;
        return var3.getField7();
    }
    
    public static SubLObject f38287(final SubLObject var3) {
        assert NIL != f38280(var3) : var3;
        return var3.getField8();
    }
    
    public static SubLObject f38288(final SubLObject var3) {
        assert NIL != f38280(var3) : var3;
        return var3.getField9();
    }
    
    public static SubLObject f38289(final SubLObject var3) {
        assert NIL != f38280(var3) : var3;
        return var3.getField10();
    }
    
    public static SubLObject f38290(final SubLObject var3) {
        assert NIL != f38280(var3) : var3;
        return var3.getField11();
    }
    
    public static SubLObject f38291(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38280(var3) : var3;
        return var3.setField2(var6);
    }
    
    public static SubLObject f38292(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38280(var3) : var3;
        return var3.setField3(var6);
    }
    
    public static SubLObject f38293(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38280(var3) : var3;
        return var3.setField4(var6);
    }
    
    public static SubLObject f38294(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38280(var3) : var3;
        return var3.setField5(var6);
    }
    
    public static SubLObject f38295(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38280(var3) : var3;
        return var3.setField6(var6);
    }
    
    public static SubLObject f38296(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38280(var3) : var3;
        return var3.setField7(var6);
    }
    
    public static SubLObject f38297(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38280(var3) : var3;
        return var3.setField8(var6);
    }
    
    public static SubLObject f38298(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38280(var3) : var3;
        return var3.setField9(var6);
    }
    
    public static SubLObject f38299(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38280(var3) : var3;
        return var3.setField10(var6);
    }
    
    public static SubLObject f38300(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38280(var3) : var3;
        return var3.setField11(var6);
    }
    
    public static SubLObject f38301(SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        final SubLObject var8 = (SubLObject)new $sX41864_native();
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        for (var9 = (SubLObject)NIL, var9 = var7; NIL != var9; var9 = conses_high.cddr(var9)) {
            var10 = var9.first();
            var11 = conses_high.cadr(var9);
            var12 = var10;
            if (var12.eql((SubLObject)$ic32$)) {
                f38291(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic33$)) {
                f38292(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic34$)) {
                f38293(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic35$)) {
                f38294(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic36$)) {
                f38295(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic37$)) {
                f38296(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic38$)) {
                f38297(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic39$)) {
                f38298(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic40$)) {
                f38299(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic41$)) {
                f38300(var8, var11);
            }
            else {
                Errors.error((SubLObject)$ic42$, var10);
            }
        }
        return var8;
    }
    
    public static SubLObject f38302(final SubLObject var13, final SubLObject var14) {
        Functions.funcall(var14, var13, (SubLObject)$ic43$, (SubLObject)$ic44$, (SubLObject)TEN_INTEGER);
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic32$, f38281(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic33$, f38282(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic34$, f38283(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic35$, f38284(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic36$, f38285(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic37$, f38286(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic38$, f38287(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic39$, f38288(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic40$, f38289(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic41$, f38290(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic46$, (SubLObject)$ic44$, (SubLObject)TEN_INTEGER);
        return var13;
    }
    
    public static SubLObject f38303(final SubLObject var13, final SubLObject var14) {
        return f38302(var13, var14);
    }
    
    public static SubLObject f38304(final SubLObject var15) {
        assert NIL != f38280(var15) : var15;
        return f38281(var15);
    }
    
    public static SubLObject f38305(final SubLObject var16, final SubLObject var15) {
        assert NIL != Types.symbolp(var16) : var16;
        assert NIL != f38280(var15) : var15;
        f38291(var15, var16);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38306(final SubLObject var15) {
        assert NIL != f38280(var15) : var15;
        return f38282(var15);
    }
    
    public static SubLObject f38307(final SubLObject var17, final SubLObject var15) {
        assert NIL != Types.integerp(var17) : var17;
        assert NIL != f38280(var15) : var15;
        f38292(var15, var17);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38308(final SubLObject var15) {
        assert NIL != f38280(var15) : var15;
        return f38283(var15);
    }
    
    public static SubLObject f38309(final SubLObject var18, final SubLObject var15) {
        assert NIL != Types.integerp(var18) : var18;
        assert NIL != f38280(var15) : var15;
        f38293(var15, var18);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38310(final SubLObject var15) {
        assert NIL != f38280(var15) : var15;
        return f38284(var15);
    }
    
    public static SubLObject f38311(final SubLObject var19, final SubLObject var15) {
        assert NIL != Types.stringp(var19) : var19;
        assert NIL != f38280(var15) : var15;
        f38294(var15, var19);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38312(final SubLObject var15) {
        assert NIL != f38280(var15) : var15;
        return f38285(var15);
    }
    
    public static SubLObject f38313(final SubLObject var20, final SubLObject var15) {
        assert NIL != f38280(var15) : var15;
        f38295(var15, var20);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38314(final SubLObject var15) {
        assert NIL != f38280(var15) : var15;
        return f38286(var15);
    }
    
    public static SubLObject f38315(final SubLObject var21, final SubLObject var15) {
        assert NIL != f38280(var15) : var15;
        f38296(var15, var21);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38316(final SubLObject var15) {
        assert NIL != f38280(var15) : var15;
        return f38287(var15);
    }
    
    public static SubLObject f38317(final SubLObject var22, final SubLObject var15) {
        assert NIL != f38280(var15) : var15;
        f38297(var15, var22);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38318(final SubLObject var15) {
        assert NIL != f38280(var15) : var15;
        return f38288(var15);
    }
    
    public static SubLObject f38319(final SubLObject var23, final SubLObject var15) {
        assert NIL != f38280(var15) : var15;
        f38298(var15, var23);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38320(final SubLObject var15) {
        assert NIL != f38280(var15) : var15;
        return f38289(var15);
    }
    
    public static SubLObject f38321(final SubLObject var24, final SubLObject var15) {
        assert NIL != f38280(var15) : var15;
        f38299(var15, var24);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38322(final SubLObject var15) {
        assert NIL != f38280(var15) : var15;
        return f38290(var15);
    }
    
    public static SubLObject f38323(final SubLObject var25, final SubLObject var15) {
        assert NIL != Types.stringp(var25) : var25;
        assert NIL != f38280(var15) : var15;
        f38300(var15, var25);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38279(final SubLObject var15, final SubLObject var4, final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        assert NIL != f38280(var15) : var15;
        assert NIL != Types.streamp(var4) : var4;
        streams_high.terpri(var4);
        if (NIL != print_high.$print_readably$.getDynamicValue(var27)) {
            print_high.print_not_readable(var15, var4);
        }
        else {
            streams_high.write_string((SubLObject)$ic51$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var15), new SubLObject[] { $ic52$, var4 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var4);
            streams_high.write_string((SubLObject)$ic53$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f38281(var15), var4);
            streams_high.write_string((SubLObject)$ic54$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f38282(var15), var4);
            streams_high.write_string((SubLObject)$ic55$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f38283(var15), var4);
            streams_high.write_string((SubLObject)$ic56$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f38284(var15), var4);
            streams_high.write_string((SubLObject)$ic57$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f38285(var15), var4);
            streams_high.terpri(var4);
            streams_high.write_string((SubLObject)$ic58$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f38286(var15), var4);
            streams_high.terpri(var4);
            streams_high.write_string((SubLObject)$ic59$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f38287(var15), var4);
            streams_high.terpri(var4);
            streams_high.write_string((SubLObject)$ic60$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f38288(var15), var4);
            streams_high.terpri(var4);
            streams_high.write_string((SubLObject)$ic61$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f38289(var15), var4);
            streams_high.write_char((SubLObject)Characters.CHAR_space, var4);
            PrintLow.write(Equality.pointer(var15), new SubLObject[] { $ic52$, var4, $ic62$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var4);
        }
        return var15;
    }
    
    public static SubLObject f38324(final SubLObject var3, final SubLObject var4) {
        compatibility.default_struct_print_function(var3, var4, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38325(final SubLObject var3) {
        return (SubLObject)((var3.getClass() == $sX41866_native.class) ? T : NIL);
    }
    
    public static SubLObject f38326(final SubLObject var3) {
        assert NIL != f38325(var3) : var3;
        return var3.getField2();
    }
    
    public static SubLObject f38327(final SubLObject var3) {
        assert NIL != f38325(var3) : var3;
        return var3.getField3();
    }
    
    public static SubLObject f38328(final SubLObject var3) {
        assert NIL != f38325(var3) : var3;
        return var3.getField4();
    }
    
    public static SubLObject f38329(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38325(var3) : var3;
        return var3.setField2(var6);
    }
    
    public static SubLObject f38330(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38325(var3) : var3;
        return var3.setField3(var6);
    }
    
    public static SubLObject f38331(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38325(var3) : var3;
        return var3.setField4(var6);
    }
    
    public static SubLObject f38332(SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        final SubLObject var8 = (SubLObject)new $sX41866_native();
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        for (var9 = (SubLObject)NIL, var9 = var7; NIL != var9; var9 = conses_high.cddr(var9)) {
            var10 = var9.first();
            var11 = conses_high.cadr(var9);
            var12 = var10;
            if (var12.eql((SubLObject)$ic78$)) {
                f38329(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic79$)) {
                f38330(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic80$)) {
                f38331(var8, var11);
            }
            else {
                Errors.error((SubLObject)$ic42$, var10);
            }
        }
        return var8;
    }
    
    public static SubLObject f38333(final SubLObject var13, final SubLObject var14) {
        Functions.funcall(var14, var13, (SubLObject)$ic43$, (SubLObject)$ic81$, (SubLObject)THREE_INTEGER);
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic78$, f38326(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic79$, f38327(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic80$, f38328(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic46$, (SubLObject)$ic81$, (SubLObject)THREE_INTEGER);
        return var13;
    }
    
    public static SubLObject f38334(final SubLObject var13, final SubLObject var14) {
        return f38333(var13, var14);
    }
    
    public static SubLObject f38335(final SubLObject var33, final SubLObject var15, final SubLObject var34) {
        assert NIL != Types.booleanp(var34) : var34;
        final SubLObject var35 = f38332((SubLObject)UNPROVIDED);
        f38329(var35, var33);
        f38330(var35, var15);
        f38331(var35, var34);
        return var35;
    }
    
    public static SubLObject f38336(final SubLObject var36) {
        return f38283(f38327(var36));
    }
    
    public static SubLObject f38337(final SubLObject var3, final SubLObject var4) {
        f38338(var3, var4, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38339(final SubLObject var3) {
        return (SubLObject)((var3.getClass() == $sX41868_native.class) ? T : NIL);
    }
    
    public static SubLObject f38340(final SubLObject var3) {
        assert NIL != f38339(var3) : var3;
        return var3.getField2();
    }
    
    public static SubLObject f38341(final SubLObject var3) {
        assert NIL != f38339(var3) : var3;
        return var3.getField3();
    }
    
    public static SubLObject f38342(final SubLObject var3) {
        assert NIL != f38339(var3) : var3;
        return var3.getField4();
    }
    
    public static SubLObject f38343(final SubLObject var3) {
        assert NIL != f38339(var3) : var3;
        return var3.getField5();
    }
    
    public static SubLObject f38344(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38339(var3) : var3;
        return var3.setField2(var6);
    }
    
    public static SubLObject f38345(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38339(var3) : var3;
        return var3.setField3(var6);
    }
    
    public static SubLObject f38346(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38339(var3) : var3;
        return var3.setField4(var6);
    }
    
    public static SubLObject f38347(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38339(var3) : var3;
        return var3.setField5(var6);
    }
    
    public static SubLObject f38348(SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        final SubLObject var8 = (SubLObject)new $sX41868_native();
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        for (var9 = (SubLObject)NIL, var9 = var7; NIL != var9; var9 = conses_high.cddr(var9)) {
            var10 = var9.first();
            var11 = conses_high.cadr(var9);
            var12 = var10;
            if (var12.eql((SubLObject)$ic101$)) {
                f38344(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic102$)) {
                f38345(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic103$)) {
                f38346(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic79$)) {
                f38347(var8, var11);
            }
            else {
                Errors.error((SubLObject)$ic42$, var10);
            }
        }
        return var8;
    }
    
    public static SubLObject f38349(final SubLObject var13, final SubLObject var14) {
        Functions.funcall(var14, var13, (SubLObject)$ic43$, (SubLObject)$ic104$, (SubLObject)FOUR_INTEGER);
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic101$, f38340(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic102$, f38341(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic103$, f38342(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic79$, f38343(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic46$, (SubLObject)$ic104$, (SubLObject)FOUR_INTEGER);
        return var13;
    }
    
    public static SubLObject f38350(final SubLObject var13, final SubLObject var14) {
        return f38349(var13, var14);
    }
    
    public static SubLObject f38338(final SubLObject var40, final SubLObject var4, final SubLObject var26) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var41)) {
            print_high.print_not_readable(var40, var4);
        }
        else {
            streams_high.write_string((SubLObject)$ic51$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var40), new SubLObject[] { $ic52$, var4 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var4);
            streams_high.write_string((SubLObject)$ic106$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f38340(var40), var4);
            streams_high.terpri(var4);
            streams_high.write_string((SubLObject)$ic107$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f38341(var40), var4);
            streams_high.terpri(var4);
            streams_high.write_string((SubLObject)$ic108$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(Threads.process_whostate(f38341(var40)), var4);
            streams_high.write_string((SubLObject)$ic109$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f38342(var40), var4);
            streams_high.terpri(var4);
            if (NIL != f38343(var40)) {
                streams_high.write_string((SubLObject)$ic59$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0194.f12114(f38287(f38343(var40)), var4, (SubLObject)UNPROVIDED);
                streams_high.terpri(var4);
                if (NIL != f38288(f38343(var40))) {
                    streams_high.write_string((SubLObject)$ic110$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0194.f12114(f38288(f38343(var40)), var4, (SubLObject)UNPROVIDED);
                    streams_high.terpri(var4);
                }
            }
            streams_high.write_char((SubLObject)Characters.CHAR_space, var4);
            PrintLow.write(Equality.pointer(var40), new SubLObject[] { $ic52$, var4, $ic62$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var4);
        }
        return var40;
    }
    
    public static SubLObject f38351(final SubLObject var3, final SubLObject var4) {
        f38352(var3, var4, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38353(final SubLObject var3) {
        return (SubLObject)((var3.getClass() == $sX41870_native.class) ? T : NIL);
    }
    
    public static SubLObject f38354(final SubLObject var3) {
        assert NIL != f38353(var3) : var3;
        return var3.getField2();
    }
    
    public static SubLObject f38355(final SubLObject var3) {
        assert NIL != f38353(var3) : var3;
        return var3.getField3();
    }
    
    public static SubLObject f38356(final SubLObject var3) {
        assert NIL != f38353(var3) : var3;
        return var3.getField4();
    }
    
    public static SubLObject f38357(final SubLObject var3) {
        assert NIL != f38353(var3) : var3;
        return var3.getField5();
    }
    
    public static SubLObject f38358(final SubLObject var3) {
        assert NIL != f38353(var3) : var3;
        return var3.getField6();
    }
    
    public static SubLObject f38359(final SubLObject var3) {
        assert NIL != f38353(var3) : var3;
        return var3.getField7();
    }
    
    public static SubLObject f38360(final SubLObject var3) {
        assert NIL != f38353(var3) : var3;
        return var3.getField8();
    }
    
    public static SubLObject f38361(final SubLObject var3) {
        assert NIL != f38353(var3) : var3;
        return var3.getField9();
    }
    
    public static SubLObject f38362(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38353(var3) : var3;
        return var3.setField2(var6);
    }
    
    public static SubLObject f38363(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38353(var3) : var3;
        return var3.setField3(var6);
    }
    
    public static SubLObject f38364(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38353(var3) : var3;
        return var3.setField4(var6);
    }
    
    public static SubLObject f38365(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38353(var3) : var3;
        return var3.setField5(var6);
    }
    
    public static SubLObject f38366(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38353(var3) : var3;
        return var3.setField6(var6);
    }
    
    public static SubLObject f38367(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38353(var3) : var3;
        return var3.setField7(var6);
    }
    
    public static SubLObject f38368(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38353(var3) : var3;
        return var3.setField8(var6);
    }
    
    public static SubLObject f38369(final SubLObject var3, final SubLObject var6) {
        assert NIL != f38353(var3) : var3;
        return var3.setField9(var6);
    }
    
    public static SubLObject f38370(SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        final SubLObject var8 = (SubLObject)new $sX41870_native();
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        for (var9 = (SubLObject)NIL, var9 = var7; NIL != var9; var9 = conses_high.cddr(var9)) {
            var10 = var9.first();
            var11 = conses_high.cadr(var9);
            var12 = var10;
            if (var12.eql((SubLObject)$ic136$)) {
                f38362(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic137$)) {
                f38363(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic138$)) {
                f38364(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic139$)) {
                f38365(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic140$)) {
                f38366(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic141$)) {
                f38367(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic142$)) {
                f38368(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic143$)) {
                f38369(var8, var11);
            }
            else {
                Errors.error((SubLObject)$ic42$, var10);
            }
        }
        return var8;
    }
    
    public static SubLObject f38371(final SubLObject var13, final SubLObject var14) {
        Functions.funcall(var14, var13, (SubLObject)$ic43$, (SubLObject)$ic144$, (SubLObject)EIGHT_INTEGER);
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic136$, f38354(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic137$, f38355(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic138$, f38356(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic139$, f38357(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic140$, f38358(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic141$, f38359(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic142$, f38360(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic45$, (SubLObject)$ic143$, f38361(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic46$, (SubLObject)$ic144$, (SubLObject)EIGHT_INTEGER);
        return var13;
    }
    
    public static SubLObject f38372(final SubLObject var13, final SubLObject var14) {
        return f38371(var13, var14);
    }
    
    public static SubLObject f38352(final SubLObject var47, final SubLObject var4, final SubLObject var26) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var48)) {
            print_high.print_not_readable(var47, var4);
        }
        else {
            streams_high.write_string((SubLObject)$ic51$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var47), new SubLObject[] { $ic52$, var4 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var4);
            streams_high.write_string((SubLObject)$ic146$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f38355(var47), var4);
            streams_high.terpri(var4);
            streams_high.write_string((SubLObject)$ic147$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f38357(var47), var4);
            streams_high.terpri(var4);
            streams_high.write_string((SubLObject)$ic148$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f38373(var47), var4);
            streams_high.terpri(var4);
            streams_high.write_string((SubLObject)$ic149$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f38374(var47), var4);
            streams_high.terpri(var4);
            streams_high.write_string((SubLObject)$ic150$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f38375(var47), var4);
            streams_high.terpri(var4);
            streams_high.write_char((SubLObject)Characters.CHAR_space, var4);
            PrintLow.write(Equality.pointer(var47), new SubLObject[] { $ic52$, var4, $ic62$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var4);
        }
        return var47;
    }
    
    public static SubLObject f38376(final SubLObject var47, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert NIL != f38353(var47) : var47;
        assert NIL != Types.streamp(var4) : var4;
        if (NIL != f38357(var47)) {
            SubLObject var48 = f38357(var47);
            SubLObject var49 = (SubLObject)NIL;
            var49 = var48.first();
            while (NIL != var48) {
                print_high.print(var49, var4);
                var48 = var48.rest();
                var49 = var48.first();
            }
        }
        else {
            print_high.princ((SubLObject)$ic151$, var4);
            streams_high.terpri(var4);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38377(SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject var5 = Threads.all_processes();
        SubLObject var6 = (SubLObject)NIL;
        var6 = var5.first();
        while (NIL != var5) {
            final SubLObject var7 = f38378(var6);
            final SubLObject var8 = (SubLObject)((NIL != var7) ? f38357(var7) : NIL);
            SubLObject var9 = (SubLObject)NIL;
            if (NIL == var9) {
                SubLObject var10 = var8;
                SubLObject var11 = (SubLObject)NIL;
                var11 = var10.first();
                while (NIL == var9 && NIL != var10) {
                    if (f38341(var11).equal(var6) && NIL != f38343(var11) && NIL != f38287(f38343(var11))) {
                        var9 = (SubLObject)T;
                        PrintLow.format(var4, (SubLObject)$ic152$, var6);
                        PrintLow.format(var4, (SubLObject)$ic153$, f38287(f38343(var11)));
                    }
                    var10 = var10.rest();
                    var11 = var10.first();
                }
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38379(final SubLObject var47) {
        if (NIL == f38353(var47)) {
            return (SubLObject)NIL;
        }
        return Types.listp(f38357(var47));
    }
    
    public static SubLObject f38380(final SubLObject var47) {
        assert NIL != f38353(var47) : var47;
        return f38354(var47);
    }
    
    public static SubLObject f38381(final SubLObject var58, final SubLObject var47) {
        assert NIL != Types.lock_p(var58) : var58;
        assert NIL != f38353(var47) : var47;
        f38362(var47, var58);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38382(final SubLObject var47) {
        assert NIL != f38353(var47) : var47;
        return f38355(var47);
    }
    
    public static SubLObject f38383(final SubLObject var59, final SubLObject var47) {
        assert NIL != module0055.f4044(var59) : var59;
        assert NIL != f38353(var47) : var47;
        f38363(var47, var59);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38384(final SubLObject var47) {
        assert NIL != f38353(var47) : var47;
        return f38357(var47);
    }
    
    public static SubLObject f38385(final SubLObject var47) {
        assert NIL != f38353(var47) : var47;
        return Sequences.length(f38357(var47));
    }
    
    public static SubLObject f38386(final SubLObject var40, final SubLObject var47) {
        assert NIL != f38339(var40) : var40;
        assert NIL != f38353(var47) : var47;
        SubLObject var48 = f38357(var47);
        var48 = (SubLObject)ConsesLow.cons(var40, var48);
        f38365(var47, var48);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38387(final SubLObject var60, final SubLObject var47) {
        assert NIL != Types.listp(var60) : var60;
        assert NIL != f38353(var47) : var47;
        f38365(var47, var60);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38388(final SubLObject var61) {
        assert NIL != Types.stringp(var61) : var61;
        $g4777$.setGlobalValue(var61);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38389(final SubLObject var62, final SubLObject var47) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var62) : var62;
        if (NIL != var47 && !areAssertionsDisabledFor(me) && NIL == f38353(var47)) {
            throw new AssertionError(var47);
        }
        if (NIL == $g4779$.getGlobalValue()) {
            $g4779$.setGlobalValue(Locks.make_lock((SubLObject)$ic159$));
        }
        final SubLObject var64 = $g4779$.getGlobalValue();
        SubLObject var65 = (SubLObject)NIL;
        try {
            var65 = Locks.seize_lock(var64);
            if (NIL != $g4777$.getGlobalValue()) {
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var63) && !$g4777$.getGlobalValue().isString()) {
                    Errors.error((SubLObject)$ic160$, $g4777$.getGlobalValue());
                }
                if (NIL == $g4778$.getGlobalValue()) {
                    $g4778$.setGlobalValue(StreamsLow.open($g4777$.getGlobalValue(), new SubLObject[] { $ic161$, $ic162$, $ic163$, $ic164$, $ic165$, $ic166$ }));
                }
                print_high.princ((SubLObject)$ic167$, $g4778$.getGlobalValue());
                print_high.princ(Threads.process_name(Threads.current_process()), $g4778$.getGlobalValue());
                print_high.princ((SubLObject)$ic168$, $g4778$.getGlobalValue());
                streams_high.terpri($g4778$.getGlobalValue());
                print_high.princ((SubLObject)$ic169$, $g4778$.getGlobalValue());
                print_high.princ(var62, $g4778$.getGlobalValue());
                streams_high.terpri($g4778$.getGlobalValue());
                streams_high.force_output($g4778$.getGlobalValue());
            }
            else if (NIL != var47) {
                SubLObject var66 = (SubLObject)NIL;
                var66 = f38358(var47);
                var66 = (SubLObject)ConsesLow.cons(Sequences.cconcatenate(module0051.f3552((SubLObject)UNPROVIDED), new SubLObject[] { $ic170$, var62 }), var66);
                f38366(var47, var66);
            }
        }
        finally {
            if (NIL != var65) {
                Locks.release_lock(var64);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38390(final SubLObject var47) {
        assert NIL != f38353(var47) : var47;
        SubLObject var48 = Sequences.nreverse(f38358(var47));
        SubLObject var49 = (SubLObject)NIL;
        var49 = var48.first();
        while (NIL != var48) {
            print_high.princ(var49, (SubLObject)UNPROVIDED);
            var48 = var48.rest();
            var49 = var48.first();
        }
        f38366(var47, (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38391(final SubLObject var66) {
        assert NIL != Types.stringp(var66) : var66;
        f38390(f38392(var66));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38393(final SubLObject var67, final SubLObject var47) {
        assert NIL != Types.stringp(var67) : var67;
        assert NIL != f38353(var47) : var47;
        f38367(var47, var67);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38373(final SubLObject var47) {
        assert NIL != f38353(var47) : var47;
        return f38359(var47);
    }
    
    public static SubLObject f38394(final SubLObject var68, final SubLObject var47) {
        assert NIL != Types.integerp(var68) : var68;
        assert NIL != f38353(var47) : var47;
        f38368(var47, var68);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38374(final SubLObject var47) {
        assert NIL != f38353(var47) : var47;
        return f38360(var47);
    }
    
    public static SubLObject f38395(final SubLObject var69, final SubLObject var47) {
        assert NIL != Types.integerp(var69) : var69;
        assert NIL != f38353(var47) : var47;
        f38369(var47, var69);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38375(final SubLObject var47) {
        assert NIL != f38353(var47) : var47;
        return f38361(var47);
    }
    
    public static SubLObject f38396(final SubLObject var47) {
        return Sequences.length(f38357(var47));
    }
    
    public static SubLObject f38397(final SubLObject var21, final SubLObject var70, final SubLObject var71) {
        final SubLThread var72 = SubLProcess.currentSubLThread();
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = (SubLObject)NIL;
        final SubLObject var75 = $g4780$.currentBinding(var72);
        try {
            $g4780$.bind((SubLObject)NIL, var72);
            var74 = (SubLObject)ConsesLow.list((SubLObject)$ic171$, ConsesLow.append(var21, (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)$ic172$, (SubLObject)$ic173$, var70));
            if (Symbols.symbol_function((SubLObject)$ic174$).eql(var71)) {
                module0112.f7688(var74);
            }
            else if (Symbols.symbol_function((SubLObject)$ic175$).eql(var71)) {
                Eval.eval(var74);
            }
            else {
                Functions.funcall(var71, var74);
            }
            var73 = $g4780$.getDynamicValue(var72);
        }
        finally {
            $g4780$.rebind(var75, var72);
        }
        return var73;
    }
    
    public static SubLObject f38378(final SubLObject var52) {
        assert NIL != Types.processp(var52) : var52;
        return module0084.f5831($g4781$.getGlobalValue(), var52, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f38398(final SubLObject var52, final SubLObject var47) {
        assert NIL != Types.processp(var52) : var52;
        assert NIL != f38353(var47) : var47;
        return module0084.f5829($g4781$.getGlobalValue(), var52, var47);
    }
    
    public static SubLObject f38399(final SubLObject var52) {
        assert NIL != Types.processp(var52) : var52;
        return module0084.f5830($g4781$.getGlobalValue(), var52);
    }
    
    public static SubLObject f38400() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = $g4782$.getGlobalValue();
        SubLObject var3 = (SubLObject)NIL;
        try {
            var3 = Locks.seize_lock(var2);
            if (NIL == module0089.f6045($g4783$.getGlobalValue())) {
                $g4783$.setGlobalValue(module0089.f6070($g4784$.getDynamicValue(var1), Symbols.symbol_function((SubLObject)EQUAL)));
            }
        }
        finally {
            if (NIL != var3) {
                Locks.release_lock(var2);
            }
        }
        return $g4783$.getGlobalValue();
    }
    
    public static SubLObject f38401(final SubLObject var15) {
        return f38402(f38306(var15), f38312(var15));
    }
    
    public static SubLObject f38402(final SubLObject var76, final SubLObject var20) {
        return (SubLObject)ConsesLow.cons(var76, var20);
    }
    
    public static SubLObject f38403(final SubLObject var77) {
        return var77.rest();
    }
    
    public static SubLObject f38404(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        final SubLObject var17 = f38401(var15);
        final SubLObject var18 = Threads.current_process();
        SubLObject var19 = (SubLObject)NIL;
        final SubLObject var20 = $g4782$.getGlobalValue();
        SubLObject var21 = (SubLObject)NIL;
        try {
            var21 = Locks.seize_lock(var20);
            f38400();
            var16.resetMultipleValues();
            final SubLObject var22 = module0089.f6077($g4783$.getGlobalValue(), var17);
            final SubLObject var23 = var16.secondMultipleValue();
            var16.resetMultipleValues();
            if (NIL == var23) {
                module0089.f6082($g4783$.getGlobalValue(), var17, var18);
            }
            else {
                var19 = var22;
            }
        }
        finally {
            if (NIL != var21) {
                Locks.release_lock(var20);
            }
        }
        return var19;
    }
    
    public static SubLObject f38405(final SubLObject var15) {
        final SubLObject var16 = f38401(var15);
        final SubLObject var17 = $g4782$.getGlobalValue();
        SubLObject var18 = (SubLObject)NIL;
        try {
            var18 = Locks.seize_lock(var17);
            if (NIL != module0089.f6045($g4783$.getGlobalValue())) {
                module0089.f6087($g4783$.getGlobalValue(), var16);
            }
        }
        finally {
            if (NIL != var18) {
                Locks.release_lock(var17);
            }
        }
        return var15;
    }
    
    public static SubLObject f38406(final SubLObject var86) {
        return (SubLObject)makeBoolean(var86.isKeyword() && (var86 == $ic178$ || var86 == $ic179$));
    }
    
    public static SubLObject f38407(final SubLObject var76, final SubLObject var87, final SubLObject var86) {
        final SubLThread var88 = SubLProcess.currentSubLThread();
        assert NIL != f38406(var86) : var86;
        final SubLObject var89 = f38402(var76, var87);
        final SubLObject var90 = $g4782$.getGlobalValue();
        SubLObject var91 = (SubLObject)NIL;
        try {
            var91 = Locks.seize_lock(var90);
            f38400();
            var88.resetMultipleValues();
            final SubLObject var92 = module0089.f6077($g4783$.getGlobalValue(), var89);
            final SubLObject var93 = var88.secondMultipleValue();
            var88.resetMultipleValues();
            if (NIL != var93) {
                f38408(var92, var86, var76, var87);
            }
            else {
                module0089.f6082($g4783$.getGlobalValue(), var89, var86);
            }
        }
        finally {
            if (NIL != var91) {
                Locks.release_lock(var90);
            }
        }
        return var86;
    }
    
    public static SubLObject f38409(final SubLObject var87) {
        final SubLThread var88 = SubLProcess.currentSubLThread();
        final SubLObject var89 = $g4782$.getGlobalValue();
        SubLObject var90 = (SubLObject)NIL;
        try {
            var90 = Locks.seize_lock(var89);
            if (NIL != module0089.f6045($g4783$.getGlobalValue())) {
                final SubLObject var91 = $g4783$.getGlobalValue();
                final SubLObject var92 = (SubLObject)$ic181$;
                SubLObject var93 = module0089.f6097(var91, var92);
                SubLObject var94 = (SubLObject)NIL;
                SubLObject var95 = (SubLObject)NIL;
                while (NIL == module0089.f6098(var91, var93)) {
                    var94 = module0089.f6099(var93);
                    var95 = module0089.f6100(var93);
                    var93 = module0089.f6101(var93, var92);
                    final SubLObject var96 = f38403(var94);
                    if (var96.equal(var87) && NIL != Threads.valid_process_p(var95)) {
                        SubLObject var97 = (SubLObject)NIL;
                        try {
                            var88.throwStack.push($ic182$);
                            final SubLObject var98 = Errors.$error_handler$.currentBinding(var88);
                            try {
                                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic183$), var88);
                                try {
                                    f38408(var95, (SubLObject)$ic178$, (SubLObject)MINUS_ONE_INTEGER, var87);
                                }
                                catch (Throwable var99) {
                                    Errors.handleThrowable(var99, (SubLObject)NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(var98, var88);
                            }
                        }
                        catch (Throwable var100) {
                            var97 = Errors.handleThrowable(var100, (SubLObject)$ic182$);
                        }
                        finally {
                            var88.throwStack.pop();
                        }
                    }
                }
            }
        }
        finally {
            if (NIL != var90) {
                Locks.release_lock(var89);
            }
        }
        return var87;
    }
    
    public static SubLObject f38408(final SubLObject var52, final SubLObject var86, final SubLObject var76, final SubLObject var87) {
        if (var86.eql((SubLObject)$ic178$)) {
            module0004.f80(var52, Symbols.symbol_function((SubLObject)$ic184$), (SubLObject)ConsesLow.list(var76, var87));
        }
        else if (var86.eql((SubLObject)$ic179$)) {
            module0004.f80(var52, Symbols.symbol_function((SubLObject)$ic185$), (SubLObject)ConsesLow.list(var76, var87));
        }
        else {
            Errors.error((SubLObject)$ic186$, var86);
        }
        return var86;
    }
    
    public static SubLObject f38410(final SubLObject var76, final SubLObject var100) {
        final SubLObject var101 = f38411();
        if (NIL == var101) {
            return (SubLObject)NIL;
        }
        if (!var100.equal(f38285(var101))) {
            return (SubLObject)NIL;
        }
        if (var76.numGE((SubLObject)ZERO_INTEGER) && !var76.eql(f38282(var101))) {
            return (SubLObject)NIL;
        }
        Dynamic.sublisp_throw((SubLObject)$ic187$, (SubLObject)$ic178$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38412(final SubLObject var76, final SubLObject var100) {
        final SubLObject var101 = f38411();
        if (NIL == var101) {
            return (SubLObject)NIL;
        }
        if (!var100.equal(f38285(var101))) {
            return (SubLObject)NIL;
        }
        if (var76.numGE((SubLObject)ZERO_INTEGER) && !var76.eql(f38282(var101))) {
            return (SubLObject)NIL;
        }
        Dynamic.sublisp_throw((SubLObject)$ic187$, (SubLObject)$ic179$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38413(final SubLObject var101, final SubLObject var102) {
        SubLObject var104;
        final SubLObject var103 = var104 = var101.rest();
        SubLObject var105 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var104, var103, (SubLObject)$ic188$);
        var105 = var104.first();
        final SubLObject var106;
        var104 = (var106 = var104.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic189$, (SubLObject)$ic187$, var105, reader.bq_cons((SubLObject)$ic190$, ConsesLow.append(var106, (SubLObject)NIL)));
    }
    
    public static SubLObject f38414(final SubLObject var101, final SubLObject var102) {
        final SubLObject var103 = var101.rest();
        final SubLObject var105;
        final SubLObject var104 = var105 = var103;
        final SubLObject var106 = (SubLObject)$ic193$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic191$, var106, reader.bq_cons((SubLObject)$ic190$, ConsesLow.append(var105, (SubLObject)NIL)));
    }
    
    public static SubLObject f38411() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g4787$.getDynamicValue(var1);
    }
    
    public static SubLObject f38415() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (NIL != $g4787$.getDynamicValue(var1)) {
            return f38312($g4787$.getDynamicValue(var1));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38416(final SubLObject var18) {
        return Numbers.max(Threads.$process_min_priority$.getGlobalValue(), Numbers.min(var18, Threads.$process_max_priority$.getGlobalValue()));
    }
    
    public static SubLObject f38417() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        for (SubLObject var2 = f38378(Threads.current_process()); NIL == var2; var2 = f38378(Threads.current_process())) {
            Threads.sleep((SubLObject)$ic197$);
        }
        SubLObject var3 = (SubLObject)NIL;
        try {
            var1.throwStack.push($ic198$);
            final SubLObject var4 = f38378(Threads.current_process());
            final SubLObject var5 = f38418(Threads.process_name(Threads.current_process()), var4);
            SubLObject var6 = (SubLObject)NIL;
            SubLObject var7 = (SubLObject)NIL;
            SubLObject var8 = (SubLObject)NIL;
            SubLObject var9 = (SubLObject)NIL;
            final SubLObject var10 = (SubLObject)NIL;
            SubLObject var11 = (SubLObject)NIL;
            SubLObject var12 = (SubLObject)NIL;
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var1) && NIL == f38339(var5)) {
                Errors.error((SubLObject)$ic199$);
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var1) && NIL == f38353(var4)) {
                Errors.error((SubLObject)$ic200$);
            }
            while (true) {
                var7 = (SubLObject)NIL;
                var9 = (SubLObject)NIL;
                var11 = (SubLObject)NIL;
                try {
                    var1.throwStack.push($ic187$);
                    f38346(var5, (SubLObject)NIL);
                    Semaphores.semaphore_wait(f38356(var4));
                    final SubLObject var13 = f38380(var4);
                    SubLObject var14 = (SubLObject)NIL;
                    try {
                        var14 = Locks.seize_lock(var13);
                        var7 = module0055.f4068(f38355(var4), (SubLObject)UNPROVIDED);
                    }
                    finally {
                        if (NIL != var14) {
                            Locks.release_lock(var13);
                        }
                    }
                    if ($g4770$.getDynamicValue(var1).numG((SubLObject)TWO_INTEGER)) {
                        f38389(PrintLow.format((SubLObject)NIL, (SubLObject)$ic201$, var7), var4);
                    }
                    var8 = f38287(var7);
                    f38300(var7, f38340(var5));
                    f38347(var5, var7);
                    var6 = module0067.f4884($g4785$.getGlobalValue(), f38281(var7), (SubLObject)UNPROVIDED);
                    try {
                        final SubLObject var15 = $g4787$.currentBinding(var1);
                        try {
                            $g4787$.bind(var7, var1);
                            SubLObject var16 = f38404(var7);
                            final SubLObject var17 = f38308(var7);
                            Threads.set_process_priority(Threads.current_process(), f38416(var17));
                            if (NIL == var16) {
                                try {
                                    var1.throwStack.push($ic187$);
                                    try {
                                        var1.throwStack.push(module0003.$g3$.getGlobalValue());
                                        final SubLObject var73_115 = Errors.$error_handler$.currentBinding(var1);
                                        try {
                                            Errors.$error_handler$.bind((SubLObject)$ic202$, var1);
                                            try {
                                                var9 = f38397(f38286(var7), var8, var6);
                                            }
                                            catch (Throwable var98_116) {
                                                Errors.handleThrowable(var98_116, (SubLObject)NIL);
                                            }
                                        }
                                        finally {
                                            Errors.$error_handler$.rebind(var73_115, var1);
                                        }
                                    }
                                    catch (Throwable var18) {
                                        var11 = Errors.handleThrowable(var18, module0003.$g3$.getGlobalValue());
                                    }
                                    finally {
                                        var1.throwStack.pop();
                                    }
                                }
                                catch (Throwable var18) {
                                    var16 = Errors.handleThrowable(var18, (SubLObject)$ic187$);
                                }
                                finally {
                                    var1.throwStack.pop();
                                }
                                if (NIL != var16) {
                                    var11 = var16;
                                }
                                if ($g4770$.getDynamicValue(var1).numG((SubLObject)TWO_INTEGER)) {
                                    f38389(PrintLow.format((SubLObject)NIL, (SubLObject)$ic203$, var9), var4);
                                    if (var11.isString()) {
                                        f38389(PrintLow.format((SubLObject)NIL, (SubLObject)$ic204$, var11), var4);
                                    }
                                }
                                f38298(var7, var9);
                                if (var16 != $ic178$) {
                                    f38299(var7, var11);
                                }
                                try {
                                    var1.throwStack.push($ic187$);
                                    f38419(var7, (SubLObject)T);
                                }
                                catch (Throwable var18) {
                                    var16 = Errors.handleThrowable(var18, (SubLObject)$ic187$);
                                }
                                finally {
                                    var1.throwStack.pop();
                                }
                            }
                        }
                        finally {
                            $g4787$.rebind(var15, var1);
                        }
                    }
                    finally {
                        final SubLObject var19 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var1);
                            f38405(var7);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var19, var1);
                        }
                    }
                }
                catch (Throwable var20) {
                    var12 = Errors.handleThrowable(var20, (SubLObject)$ic187$);
                }
                finally {
                    var1.throwStack.pop();
                }
            }
        }
        catch (Throwable var21) {
            var3 = Errors.handleThrowable(var21, (SubLObject)$ic198$);
        }
        finally {
            var1.throwStack.pop();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38420(final SubLObject var117) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        assert NIL != Types.listp(var117) : var117;
        final SubLObject var119 = f38378(Threads.current_process());
        if ($g4770$.getDynamicValue(var118).numG((SubLObject)TWO_INTEGER)) {
            f38389(PrintLow.format((SubLObject)NIL, (SubLObject)$ic205$, var117, module0051.f3552(Time.get_universal_time())), var119);
        }
        return f38421(var119, var117);
    }
    
    public static SubLObject f38421(final SubLObject var47, final SubLObject var117) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        if (NIL == f38353(var47)) {
            Errors.error((SubLObject)$ic206$, Threads.current_process());
        }
        final SubLObject var119 = f38411();
        final SubLObject var120 = $g4786$.currentBinding(var118);
        try {
            $g4786$.bind((SubLObject)NIL, var118);
            f38298(var119, var117);
            f38419(var119, (SubLObject)NIL);
        }
        finally {
            $g4786$.rebind(var120, var118);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f38422(SubLObject var67, SubLObject var68, SubLObject var69) {
        if (var67 == UNPROVIDED) {
            var67 = (SubLObject)$ic208$;
        }
        if (var68 == UNPROVIDED) {
            var68 = $g4789$.getGlobalValue();
        }
        if (var69 == UNPROVIDED) {
            var69 = $g4790$.getGlobalValue();
        }
        final SubLThread var70 = SubLProcess.currentSubLThread();
        assert NIL != Types.integerp(var68) : var68;
        assert NIL != Types.integerp(var69) : var69;
        assert NIL != Types.stringp(var67) : var67;
        $g4788$.setDynamicValue(StreamsLow.$standard_output$.getDynamicValue(var70), var70);
        SubLObject var71 = (SubLObject)NIL;
        var71 = f38370((SubLObject)UNPROVIDED);
        f38393(var67, var71);
        f38394(var68, var71);
        f38395(var69, var71);
        if ($g4770$.getDynamicValue(var70).numG((SubLObject)TWO_INTEGER)) {
            f38389(PrintLow.format((SubLObject)NIL, (SubLObject)$ic209$), var71);
        }
        f38381(Locks.make_lock(PrintLow.format((SubLObject)NIL, (SubLObject)$ic210$, var67)), var71);
        f38364(var71, Semaphores.new_semaphore((SubLObject)$ic211$, (SubLObject)ZERO_INTEGER));
        f38383(module0055.f4059($g4776$.getGlobalValue(), (SubLObject)$ic16$, (SubLObject)UNPROVIDED), var71);
        SubLObject var72;
        for (var72 = (SubLObject)NIL, var72 = (SubLObject)ZERO_INTEGER; var72.numL(var68); var72 = Numbers.add(var72, (SubLObject)ONE_INTEGER)) {
            f38423(var71);
        }
        return var71;
    }
    
    public static SubLObject f38423(final SubLObject var47) {
        assert NIL != f38353(var47) : var47;
        final SubLObject var48 = f38348((SubLObject)UNPROVIDED);
        final SubLObject var49 = f38373(var47);
        final SubLObject var50 = f38396(var47);
        f38344(var48, PrintLow.format((SubLObject)NIL, (SubLObject)$ic212$, var49, Numbers.add(var50, (SubLObject)ONE_INTEGER)));
        f38345(var48, Threads.make_process(f38340(var48), Symbols.symbol_function((SubLObject)$ic213$)));
        f38386(var48, var47);
        f38398(f38341(var48), var47);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38424(final SubLObject var47) {
        assert NIL != f38353(var47) : var47;
        SubLObject var48 = f38357(var47);
        SubLObject var49 = (SubLObject)NIL;
        var49 = var48.first();
        while (NIL != var48) {
            f38425(var49);
            f38399(f38341(var49));
            var48 = var48.rest();
            var49 = var48.first();
        }
        f38365(var47, (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38425(final SubLObject var40) {
        assert NIL != f38339(var40) : var40;
        SubLObject var41 = f38341(var40);
        if (NIL != Threads.valid_process_p(var41)) {
            f38426(var41);
        }
        f38399(var41);
        var41 = (SubLObject)NIL;
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38426(final SubLObject var52) {
        return Threads.interrupt_process(var52, Symbols.symbol_function((SubLObject)$ic214$));
    }
    
    public static SubLObject f38427(final SubLObject var16) {
        assert NIL != Types.stringp(var16) : var16;
        final SubLObject var17 = Sequences.cconcatenate(var16, (SubLObject)$ic216$);
        SubLObject var18 = Threads.all_processes();
        SubLObject var19 = (SubLObject)NIL;
        var19 = var18.first();
        while (NIL != var18) {
            final SubLObject var20 = Threads.process_name(var19);
            if (NIL != module0038.f2684(var20, var17)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic217$, var20);
                Threads.kill_process(var19);
            }
            var18 = var18.rest();
            var19 = var18.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38428() {
        Dynamic.sublisp_throw((SubLObject)$ic198$, (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38418(final SubLObject var66, final SubLObject var47) {
        assert NIL != Types.stringp(var66) : var66;
        assert NIL != f38353(var47) : var47;
        SubLObject var67 = f38357(var47);
        SubLObject var68 = (SubLObject)NIL;
        var68 = var67.first();
        while (NIL != var67) {
            if (NIL != Strings.stringE(var66, f38340(var68), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return var68;
            }
            var67 = var67.rest();
            var68 = var67.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38392(final SubLObject var66) {
        assert NIL != Types.stringp(var66) : var66;
        SubLObject var67 = Threads.all_processes();
        SubLObject var68 = (SubLObject)NIL;
        var68 = var67.first();
        while (NIL != var67) {
            final SubLObject var69 = Threads.process_name(var68);
            if (NIL != Strings.stringE(var66, var69, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return f38378(var68);
            }
            var67 = var67.rest();
            var68 = var67.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38429(final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        if (f38396(var47).numL(f38375(var47))) {
            if ($g4770$.getDynamicValue(var48).numG((SubLObject)TWO_INTEGER)) {
                f38389(PrintLow.format((SubLObject)NIL, (SubLObject)$ic218$), var47);
            }
            f38423(var47);
        }
        f38389(PrintLow.format((SubLObject)NIL, (SubLObject)$ic219$), var47);
        Semaphores.semaphore_signal(f38356(var47));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38430(final SubLObject var15, final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        assert NIL != f38280(var15) : var15;
        assert NIL != f38353(var47) : var47;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var48) && NIL == f38357(var47)) {
            Errors.error((SubLObject)$ic220$);
        }
        final SubLObject var49 = f38354(var47);
        SubLObject var50 = (SubLObject)NIL;
        try {
            var50 = Locks.seize_lock(var49);
            var48.resetMultipleValues();
            final SubLObject var51 = module0055.f4067(var15, f38355(var47));
            final SubLObject var52 = var48.secondMultipleValue();
            final SubLObject var53 = var48.thirdMultipleValue();
            var48.resetMultipleValues();
            if (NIL != var52) {
                Errors.cerror((SubLObject)$ic221$, var53);
            }
            f38429(var47);
        }
        finally {
            if (NIL != var50) {
                Locks.release_lock(var49);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38431(final SubLObject var101, final SubLObject var102) {
        final SubLObject var103 = var101.rest();
        final SubLObject var105;
        final SubLObject var104 = var105 = var103;
        return (SubLObject)ConsesLow.list((SubLObject)$ic171$, (SubLObject)$ic223$, (SubLObject)ConsesLow.listS((SubLObject)$ic224$, (SubLObject)ConsesLow.listS((SubLObject)$ic190$, (SubLObject)$ic225$, ConsesLow.append(var105, (SubLObject)NIL)), (SubLObject)$ic226$));
    }
    
    public static SubLObject f38432(final SubLObject var101, final SubLObject var102) {
        SubLObject var104;
        final SubLObject var103 = var104 = var101.rest();
        SubLObject var105 = (SubLObject)NIL;
        SubLObject var106 = (SubLObject)NIL;
        SubLObject var107 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var104, var103, (SubLObject)$ic227$);
        var105 = var104.first();
        var104 = var104.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var104, var103, (SubLObject)$ic227$);
        var106 = var104.first();
        var104 = var104.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var104, var103, (SubLObject)$ic227$);
        var107 = var104.first();
        var104 = var104.rest();
        if (NIL != var104) {
            cdestructuring_bind.cdestructuring_bind_error(var103, (SubLObject)$ic227$);
            return (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var105) : var105;
        assert NIL != Types.integerp(var106) : var106;
        assert NIL != Types.integerp(var107) : var107;
        final SubLObject var108 = Packages.intern(Sequences.cconcatenate((SubLObject)$ic228$, new SubLObject[] { var105, $ic229$ }), (SubLObject)UNPROVIDED);
        final SubLObject var109 = Packages.intern(Sequences.cconcatenate((SubLObject)$ic228$, new SubLObject[] { var105, $ic230$ }), (SubLObject)UNPROVIDED);
        return (SubLObject)ConsesLow.list((SubLObject)$ic190$, (SubLObject)ConsesLow.listS((SubLObject)$ic231$, var108, (SubLObject)$ic232$), (SubLObject)ConsesLow.listS((SubLObject)$ic233$, var109, (SubLObject)$ic234$), (SubLObject)ConsesLow.list((SubLObject)$ic235$, Packages.intern(Sequences.cconcatenate(var105, (SubLObject)$ic236$), (SubLObject)UNPROVIDED), (SubLObject)NIL, (SubLObject)$ic237$, (SubLObject)ConsesLow.list((SubLObject)$ic238$, (SubLObject)ConsesLow.list((SubLObject)$ic239$, var108))), (SubLObject)ConsesLow.listS((SubLObject)$ic235$, Packages.intern(Sequences.cconcatenate((SubLObject)$ic240$, new SubLObject[] { var105, $ic241$ }), (SubLObject)UNPROVIDED), (SubLObject)NIL, (SubLObject)$ic242$, (SubLObject)ConsesLow.list((SubLObject)$ic243$, (SubLObject)ConsesLow.list(var109), (SubLObject)ConsesLow.listS((SubLObject)$ic244$, var108, (SubLObject)$ic245$), (SubLObject)ConsesLow.list((SubLObject)$ic172$, var108, (SubLObject)ConsesLow.list((SubLObject)$ic246$, (SubLObject)ConsesLow.listS((SubLObject)$ic247$, var105, (SubLObject)$ic248$), var106, var107))), (SubLObject)$ic249$), (SubLObject)ConsesLow.listS((SubLObject)$ic235$, Packages.intern(Sequences.cconcatenate((SubLObject)$ic250$, new SubLObject[] { var105, $ic241$ }), (SubLObject)UNPROVIDED), (SubLObject)NIL, (SubLObject)$ic251$, (SubLObject)ConsesLow.list((SubLObject)$ic243$, (SubLObject)ConsesLow.list(var109), (SubLObject)ConsesLow.list((SubLObject)$ic244$, var108, (SubLObject)ConsesLow.list((SubLObject)$ic252$, var108), (SubLObject)ConsesLow.listS((SubLObject)$ic172$, var108, (SubLObject)$ic253$), (SubLObject)ConsesLow.list((SubLObject)$ic215$, var105))), (SubLObject)$ic249$), (SubLObject)ConsesLow.listS((SubLObject)$ic235$, Packages.intern(Sequences.cconcatenate((SubLObject)$ic254$, new SubLObject[] { var105, $ic241$ }), (SubLObject)UNPROVIDED), (SubLObject)NIL, (SubLObject)$ic255$, (SubLObject)ConsesLow.list((SubLObject)$ic243$, (SubLObject)ConsesLow.list(var109), (SubLObject)ConsesLow.list((SubLObject)$ic244$, var108, (SubLObject)ConsesLow.list((SubLObject)$ic252$, var108), (SubLObject)ConsesLow.listS((SubLObject)$ic172$, var108, (SubLObject)$ic253$), (SubLObject)ConsesLow.list((SubLObject)$ic215$, var105)), (SubLObject)ConsesLow.list((SubLObject)$ic172$, var108, (SubLObject)ConsesLow.list((SubLObject)$ic246$, (SubLObject)ConsesLow.listS((SubLObject)$ic247$, var105, (SubLObject)$ic248$), var106, var107))), (SubLObject)$ic249$), (SubLObject)ConsesLow.listS((SubLObject)$ic235$, Packages.intern(Sequences.cconcatenate((SubLObject)$ic256$, new SubLObject[] { var105, $ic257$ }), (SubLObject)UNPROVIDED), (SubLObject)NIL, (SubLObject)$ic258$, (SubLObject)ConsesLow.list((SubLObject)$ic244$, var108, (SubLObject)ConsesLow.list((SubLObject)$ic259$, var108)), (SubLObject)$ic249$));
    }
    
    public static SubLObject f38433(final SubLObject var101, final SubLObject var102) {
        SubLObject var104;
        final SubLObject var103 = var104 = var101.rest();
        SubLObject var105 = (SubLObject)NIL;
        SubLObject var106 = (SubLObject)NIL;
        SubLObject var107 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var104, var103, (SubLObject)$ic260$);
        var105 = var104.first();
        var104 = var104.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var104, var103, (SubLObject)$ic260$);
        var106 = var104.first();
        var104 = var104.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var104, var103, (SubLObject)$ic260$);
        var107 = var104.first();
        final SubLObject var108;
        var104 = (var108 = var104.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic190$, (SubLObject)ConsesLow.listS((SubLObject)$ic235$, Packages.intern(Sequences.cconcatenate(var105, (SubLObject)$ic261$), (SubLObject)UNPROVIDED), var107, ConsesLow.append(var108, (SubLObject)NIL)), (SubLObject)$ic262$, (SubLObject)ConsesLow.list((SubLObject)$ic263$, (SubLObject)$ic264$, Symbols.make_keyword(var105), var106));
    }
    
    public static SubLObject f38434(final SubLObject var101, final SubLObject var102) {
        SubLObject var104;
        final SubLObject var103 = var104 = var101.rest();
        SubLObject var105 = (SubLObject)NIL;
        SubLObject var106 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var104, var103, (SubLObject)$ic265$);
        var105 = var104.first();
        var104 = var104.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var104, var103, (SubLObject)$ic265$);
        var106 = var104.first();
        final SubLObject var107;
        var104 = (var107 = var104.rest());
        final SubLObject var108 = Packages.intern(Sequences.cconcatenate((SubLObject)$ic266$, new SubLObject[] { var105, $ic267$ }), (SubLObject)UNPROVIDED);
        return (SubLObject)ConsesLow.list((SubLObject)$ic190$, (SubLObject)ConsesLow.listS((SubLObject)$ic235$, var108, var106, ConsesLow.append(var107, (SubLObject)NIL)), (SubLObject)$ic268$, (SubLObject)ConsesLow.list((SubLObject)$ic263$, (SubLObject)$ic269$, Symbols.make_keyword(var105), (SubLObject)ConsesLow.list((SubLObject)$ic270$, var108)));
    }
    
    public static SubLObject f38435() {
        return f38379($g4791$.getGlobalValue());
    }
    
    public static SubLObject f38436() {
        final SubLObject var137 = $g1441$.getGlobalValue();
        SubLObject var138 = (SubLObject)NIL;
        try {
            var138 = Locks.seize_lock(var137);
            if (NIL != $g4791$.getGlobalValue()) {
                Errors.error((SubLObject)$ic272$);
            }
            $g4791$.setGlobalValue(f38422(Sequences.cconcatenate((SubLObject)$ic273$, (SubLObject)$ic216$), (SubLObject)FIVE_INTEGER, (SubLObject)$ic207$));
        }
        finally {
            if (NIL != var138) {
                Locks.release_lock(var137);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38437() {
        final SubLObject var139 = $g1441$.getGlobalValue();
        SubLObject var140 = (SubLObject)NIL;
        try {
            var140 = Locks.seize_lock(var139);
            if (NIL != $g4791$.getGlobalValue()) {
                f38424($g4791$.getGlobalValue());
                $g4791$.setGlobalValue((SubLObject)NIL);
                f38427((SubLObject)$ic273$);
            }
        }
        finally {
            if (NIL != var140) {
                Locks.release_lock(var139);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38438() {
        final SubLObject var141 = $g1441$.getGlobalValue();
        SubLObject var142 = (SubLObject)NIL;
        try {
            var142 = Locks.seize_lock(var141);
            if (NIL != $g4791$.getGlobalValue()) {
                f38424($g4791$.getGlobalValue());
                $g4791$.setGlobalValue((SubLObject)NIL);
                f38427((SubLObject)$ic273$);
            }
            $g4791$.setGlobalValue(f38422(Sequences.cconcatenate((SubLObject)$ic273$, (SubLObject)$ic216$), (SubLObject)FIVE_INTEGER, (SubLObject)$ic207$));
        }
        finally {
            if (NIL != var142) {
                Locks.release_lock(var141);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38439() {
        if (NIL != $g4791$.getGlobalValue()) {
            f38390($g4791$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38440() {
        f38441();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38441() {
        if (NIL != $g4791$.getGlobalValue()) {
            f38376($g4791$.getGlobalValue(), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38442(SubLObject var22, final SubLObject var17, final SubLObject var18, final SubLObject var19, final SubLObject var21, final SubLObject var143) {
        final SubLObject var144 = Equality.eq(var22.first(), (SubLObject)$ic283$);
        final SubLObject var145 = f38301((SubLObject)UNPROVIDED);
        if (NIL != var144) {
            var22 = conses_high.second(var22);
        }
        f38305((SubLObject)$ic284$, var145);
        f38307(var17, var145);
        f38309(var18, var145);
        f38311(var19, var145);
        f38313(var143, var145);
        f38315(var21, var145);
        f38317(var22, var145);
        f38430(var145, $g4791$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38443(final SubLObject var145) {
        assert NIL != Types.booleanp(var145) : var145;
        $g4792$.setGlobalValue(var145);
        return $g4792$.getGlobalValue();
    }
    
    public static SubLObject f38444() {
        return $g4792$.getGlobalValue();
    }
    
    public static SubLObject f38419(final SubLObject var15, SubLObject var34) {
        if (var34 == UNPROVIDED) {
            var34 = (SubLObject)T;
        }
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if (NIL != $g4786$.getDynamicValue(var35)) {
            f38317((SubLObject)NIL, var15);
        }
        Functions.funcall(module0067.f4884($g4773$.getGlobalValue(), f38281(var15), (SubLObject)UNPROVIDED), var15, var34);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38445(final SubLObject var15, SubLObject var34) {
        if (var34 == UNPROVIDED) {
            var34 = (SubLObject)T;
        }
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if ($g4770$.getDynamicValue(var35).numG((SubLObject)ZERO_INTEGER)) {
            f38389(PrintLow.format((SubLObject)NIL, (SubLObject)$ic286$, var15), $g4791$.getGlobalValue());
        }
        final SubLObject var36 = f38312(var15);
        final SubLObject var37 = (SubLObject)ConsesLow.list((SubLObject)$ic287$, f38316(var15), f38306(var15), f38308(var15), f38310(var15), f38318(var15), f38320(var15), var34);
        final SubLObject var38 = module0624.f38486(var36);
        final SubLObject var39 = module0624.f38487(var36);
        final SubLObject var40 = module0338.$g2879$.currentBinding(var35);
        try {
            module0338.$g2879$.bind((SubLObject)T, var35);
            if (var38.isStream() && NIL != streams_high.open_stream_p(var38)) {
                module0115.f7977();
                if (f38276().numG((SubLObject)ZERO_INTEGER)) {
                    f38389(PrintLow.format((SubLObject)NIL, (SubLObject)$ic288$, new SubLObject[] { f38318(var15), var38, var36 }), $g4791$.getGlobalValue());
                }
                final SubLObject var148_149 = var39;
                SubLObject var41 = (SubLObject)NIL;
                try {
                    var41 = Locks.seize_lock(var148_149);
                    module0115.f7985(var38, var37, (SubLObject)NIL);
                }
                finally {
                    if (NIL != var41) {
                        Locks.release_lock(var148_149);
                    }
                }
            }
            else if (f38276().numG((SubLObject)ZERO_INTEGER)) {
                f38389(PrintLow.format((SubLObject)NIL, (SubLObject)$ic289$, new SubLObject[] { var37, var38, var36 }), $g4791$.getGlobalValue());
            }
        }
        finally {
            module0338.$g2879$.rebind(var40, var35);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38446(final SubLObject var151) {
        return module0083.f5696(var151, (SubLObject)$ic291$, (SubLObject)$ic292$, (SubLObject)$ic293$, (SubLObject)$ic294$, (SubLObject)$ic295$, (SubLObject)$ic296$);
    }
    
    public static SubLObject f38447(final SubLObject var152, final SubLObject var153) {
        final SubLThread var154 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var154) && NIL == f38353(f38378(Threads.current_process()))) {
            Errors.error(Errors.error((SubLObject)$ic297$));
        }
        module0083.f5698(var152, var153);
        f38420((SubLObject)ConsesLow.list(var153));
        return var152;
    }
    
    public static SubLObject f38448(final SubLObject var152, final SubLObject var154) {
        final SubLThread var155 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var155) && NIL == f38353(f38378(Threads.current_process()))) {
            Errors.error(Errors.error((SubLObject)$ic297$));
        }
        module0083.f5699(var152, var154);
        f38420(var154);
        return var152;
    }
    
    public static SubLObject f38449(final SubLObject var155) {
        module0083.f5697(var155);
        return var155;
    }
    
    public static SubLObject f38450(final SubLObject var152) {
        return module0083.f5695(var152);
    }
    
    public static SubLObject f38451(final SubLObject var152, SubLObject var156) {
        if (var156 == UNPROVIDED) {
            var156 = (SubLObject)NIL;
        }
        return module0083.f5700(var152, var156);
    }
    
    public static SubLObject f38452(final SubLObject var152) {
        return module0083.f5702(var152);
    }
    
    public static SubLObject f38453() {
        return f38379($g4793$.getGlobalValue());
    }
    
    public static SubLObject f38454() {
        final SubLObject var157 = $g4794$.getGlobalValue();
        SubLObject var158 = (SubLObject)NIL;
        try {
            var158 = Locks.seize_lock(var157);
            if (NIL != $g4793$.getGlobalValue()) {
                Errors.error((SubLObject)$ic272$);
            }
            $g4793$.setGlobalValue(f38422(Sequences.cconcatenate((SubLObject)$ic298$, (SubLObject)$ic216$), (SubLObject)TWO_INTEGER, (SubLObject)TWO_INTEGER));
        }
        finally {
            if (NIL != var158) {
                Locks.release_lock(var157);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38455() {
        final SubLObject var159 = $g4794$.getGlobalValue();
        SubLObject var160 = (SubLObject)NIL;
        try {
            var160 = Locks.seize_lock(var159);
            if (NIL != $g4793$.getGlobalValue()) {
                f38424($g4793$.getGlobalValue());
                $g4793$.setGlobalValue((SubLObject)NIL);
                f38427((SubLObject)$ic298$);
            }
        }
        finally {
            if (NIL != var160) {
                Locks.release_lock(var159);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38456() {
        final SubLObject var161 = $g4794$.getGlobalValue();
        SubLObject var162 = (SubLObject)NIL;
        try {
            var162 = Locks.seize_lock(var161);
            if (NIL != $g4793$.getGlobalValue()) {
                f38424($g4793$.getGlobalValue());
                $g4793$.setGlobalValue((SubLObject)NIL);
                f38427((SubLObject)$ic298$);
            }
            $g4793$.setGlobalValue(f38422(Sequences.cconcatenate((SubLObject)$ic298$, (SubLObject)$ic216$), (SubLObject)TWO_INTEGER, (SubLObject)TWO_INTEGER));
        }
        finally {
            if (NIL != var162) {
                Locks.release_lock(var161);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38457() {
        if (NIL != $g4793$.getGlobalValue()) {
            f38390($g4793$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38458(final SubLObject var22, final SubLObject var17, final SubLObject var18, final SubLObject var19, final SubLObject var21, final SubLObject var163) {
        final SubLObject var164 = f38301((SubLObject)UNPROVIDED);
        f38305((SubLObject)$ic299$, var164);
        f38307(var17, var164);
        f38309(var18, var164);
        f38311(var19, var164);
        f38313(var163, var164);
        f38315(var21, var164);
        f38317(var22, var164);
        f38430(var164, $g4793$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38459(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if ($g4770$.getDynamicValue(var16).numG((SubLObject)MINUS_ONE_INTEGER)) {
            f38389(PrintLow.format((SubLObject)NIL, (SubLObject)$ic300$, var15), $g4793$.getGlobalValue());
        }
        final SubLObject var17 = f38312(var15);
        if ($g4770$.getDynamicValue(var16).numG((SubLObject)ZERO_INTEGER)) {
            f38389(PrintLow.format((SubLObject)NIL, (SubLObject)$ic301$, $g4795$.getGlobalValue()), $g4793$.getGlobalValue());
        }
        if (NIL == $g4795$.getGlobalValue()) {
            $g4795$.setGlobalValue(module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        if ($g4770$.getDynamicValue(var16).numG((SubLObject)ZERO_INTEGER)) {
            f38389(PrintLow.format((SubLObject)NIL, (SubLObject)$ic301$, $g4795$.getGlobalValue()), $g4793$.getGlobalValue());
        }
        module0067.f4886($g4795$.getGlobalValue(), var17, var15);
        Threads.process_unblock(var17);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38460(final SubLObject var70) {
        $g4796$.setGlobalValue(Numbers.add($g4796$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        f38458(var70, $g4796$.getGlobalValue(), (SubLObject)ONE_INTEGER, Threads.process_name(Threads.current_process()), (SubLObject)NIL, Threads.current_process());
        Threads.process_block();
        final SubLObject var71 = module0067.f4884($g4795$.getGlobalValue(), Threads.current_process(), (SubLObject)UNPROVIDED);
        return f38318(var71);
    }
    
    public static SubLObject f38461() {
        return f38379($g4797$.getGlobalValue());
    }
    
    public static SubLObject f38462() {
        final SubLObject var164 = $g4798$.getGlobalValue();
        SubLObject var165 = (SubLObject)NIL;
        try {
            var165 = Locks.seize_lock(var164);
            if (NIL != $g4797$.getGlobalValue()) {
                Errors.error((SubLObject)$ic272$);
            }
            $g4797$.setGlobalValue(f38422(Sequences.cconcatenate((SubLObject)$ic303$, (SubLObject)$ic216$), (SubLObject)FIVE_INTEGER, (SubLObject)$ic207$));
        }
        finally {
            if (NIL != var165) {
                Locks.release_lock(var164);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38463() {
        final SubLObject var166 = $g4798$.getGlobalValue();
        SubLObject var167 = (SubLObject)NIL;
        try {
            var167 = Locks.seize_lock(var166);
            if (NIL != $g4797$.getGlobalValue()) {
                f38424($g4797$.getGlobalValue());
                $g4797$.setGlobalValue((SubLObject)NIL);
                f38427((SubLObject)$ic303$);
            }
        }
        finally {
            if (NIL != var167) {
                Locks.release_lock(var166);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38464() {
        final SubLObject var168 = $g4798$.getGlobalValue();
        SubLObject var169 = (SubLObject)NIL;
        try {
            var169 = Locks.seize_lock(var168);
            if (NIL != $g4797$.getGlobalValue()) {
                f38424($g4797$.getGlobalValue());
                $g4797$.setGlobalValue((SubLObject)NIL);
                f38427((SubLObject)$ic303$);
            }
            $g4797$.setGlobalValue(f38422(Sequences.cconcatenate((SubLObject)$ic303$, (SubLObject)$ic216$), (SubLObject)FIVE_INTEGER, (SubLObject)$ic207$));
        }
        finally {
            if (NIL != var169) {
                Locks.release_lock(var168);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38465() {
        if (NIL != $g4797$.getGlobalValue()) {
            f38390($g4797$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38466(final SubLObject var22, final SubLObject var18) {
        assert NIL != Types.integerp(var18) : var18;
        final SubLObject var23 = f38301((SubLObject)UNPROVIDED);
        f38305((SubLObject)$ic305$, var23);
        $g4799$.setGlobalValue(Numbers.add($g4799$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        f38307($g4799$.getGlobalValue(), var23);
        f38309(var18, var23);
        f38311(constants_high_oc.f10743(module0574.f35152()), var23);
        f38317(var22, var23);
        f38430(var23, $g4797$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38467(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if ($g4770$.getDynamicValue(var16).numG((SubLObject)TWO_INTEGER)) {
            f38389(PrintLow.format((SubLObject)NIL, (SubLObject)$ic306$, var15), $g4797$.getGlobalValue());
        }
        f38389(PrintLow.format((SubLObject)NIL, (SubLObject)$ic307$, f38290(var15), f38288(var15)), $g4797$.getGlobalValue());
        if (NIL != f38289(var15)) {
            f38389(PrintLow.format((SubLObject)NIL, (SubLObject)$ic152$, f38289(var15)), $g4797$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38468() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38276", "S#41873", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38277", "SET-TASK-PROCESSOR-VERBOSITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38278", "S#41874", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38280", "S#41865", 1, 0, false);
        new $f38280$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38281", "S#41875", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38282", "S#41876", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38283", "S#41877", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38284", "S#41878", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38285", "S#41879", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38286", "S#41880", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38287", "S#41881", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38288", "S#41882", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38289", "S#41883", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38290", "S#41884", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38291", "S#41885", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38292", "S#41886", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38293", "S#41887", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38294", "S#41888", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38295", "S#41889", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38296", "S#41890", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38297", "S#41891", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38298", "S#41892", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38299", "S#41893", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38300", "S#41894", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38301", "S#41895", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38302", "S#41896", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38303", "S#41897", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38304", "S#41898", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38305", "S#41899", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38306", "S#41900", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38307", "S#41901", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38308", "S#41902", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38309", "S#41903", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38310", "S#41904", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38311", "S#41905", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38312", "S#41906", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38313", "S#41907", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38314", "S#41908", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38315", "S#41909", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38316", "S#41910", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38317", "S#41911", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38318", "S#41912", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38319", "S#41913", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38320", "S#41914", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38321", "S#41915", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38322", "S#41916", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38323", "S#41917", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38279", "S#41918", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38324", "S#41919", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38325", "S#41867", 1, 0, false);
        new $f38325$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38326", "S#41920", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38327", "S#41921", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38328", "S#41922", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38329", "S#41923", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38330", "S#41924", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38331", "S#41925", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38332", "S#41926", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38333", "S#41927", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38334", "S#41928", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38335", "S#41929", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38336", "S#41930", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38337", "S#41931", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38339", "S#41869", 1, 0, false);
        new $f38339$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38340", "S#41932", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38341", "S#41933", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38342", "S#41934", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38343", "S#41935", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38344", "S#41936", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38345", "S#41937", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38346", "S#41938", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38347", "S#41939", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38348", "S#41940", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38349", "S#41941", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38350", "S#41942", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38338", "S#41943", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38351", "S#41944", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38353", "S#31689", 1, 0, false);
        new $f38353$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38354", "S#41945", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38355", "S#41946", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38356", "S#41947", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38357", "S#41948", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38358", "S#41949", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38359", "S#41950", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38360", "S#41951", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38361", "S#41952", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38362", "S#41953", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38363", "S#41954", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38364", "S#41955", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38365", "S#41956", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38366", "S#41957", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38367", "S#41958", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38368", "S#41959", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38369", "S#41960", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38370", "S#41961", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38371", "S#41962", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38372", "S#41963", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38352", "S#41964", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38376", "S#41965", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38377", "S#41966", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38379", "S#41967", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38380", "S#41968", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38381", "S#41969", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38382", "S#41970", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38383", "S#41971", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38384", "S#41972", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38385", "S#41973", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38386", "S#41974", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38387", "S#41975", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38388", "SET-TPOOL-BACKGROUND-MSG-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38389", "S#41976", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38390", "S#41977", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38391", "S#41978", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38393", "S#41979", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38373", "S#41980", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38394", "S#41981", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38374", "S#41982", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38395", "S#41983", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38375", "S#41984", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38396", "S#41985", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38397", "S#41986", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38378", "S#31690", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38398", "S#41987", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38399", "S#41988", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38400", "S#41989", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38401", "S#41990", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38402", "S#41991", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38403", "S#41992", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38404", "S#41993", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38405", "S#41994", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38406", "S#41995", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38407", "S#41996", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38409", "S#41997", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38408", "S#41998", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38410", "S#41999", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38412", "S#42000", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0623", "f38413", "CATCH-TASK-PROCESSOR-TERMINATION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0623", "f38414", "CATCH-TASK-PROCESSOR-TERMINATION-QUIETLY");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38411", "S#42001", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38415", "S#42002", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38416", "S#42003", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38417", "S#42004", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38420", "S#31691", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38421", "S#42005", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38422", "S#42006", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38423", "S#42007", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38424", "S#42008", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38425", "S#42009", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38426", "S#42010", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38427", "ENSURE-TASK-PROCESSORS-KILLED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38428", "S#42011", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38418", "S#42012", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38392", "S#42013", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38429", "S#42014", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38430", "S#42015", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0623", "f38431", "WITH-LONG-RUNNING-TASK-PROCESS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0623", "f38432", "S#42016");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0623", "f38433", "S#42017");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0623", "f38434", "S#42018");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38435", "S#9980", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38436", "INITIALIZE-API-TASK-PROCESSORS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38437", "HALT-API-TASK-PROCESSORS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38438", "RESTART-API-TASK-PROCESSORS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38439", "SHOW-API-TP-MSGS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38440", "SHOW-API-TASK-PROCESSORS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38441", "DISPLAY-API-TASK-PROCESSORS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38442", "API-TASK-PROCESSOR-REQUEST", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38443", "SET-JAVA-API-LEASE-ACTIVITY-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38444", "S#42019", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38419", "S#42020", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38445", "S#42021", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38446", "S#42022", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38447", "S#42023", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38448", "S#42024", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38449", "S#42025", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38450", "S#42026", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38451", "S#42027", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38452", "S#42028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38453", "S#42029", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38454", "S#42030", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38455", "S#42031", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38456", "S#42032", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38457", "S#42033", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38458", "S#42034", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38459", "S#42035", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38460", "S#42036", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38461", "S#42037", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38462", "S#42038", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38463", "S#42039", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38464", "S#42040", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38465", "S#42041", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38466", "S#42042", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0623", "f38467", "S#42043", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38469() {
        $g4770$ = SubLFiles.defparameter("S#9977", (SubLObject)ZERO_INTEGER);
        $g4771$ = SubLFiles.defconstant("S#42044", (SubLObject)$ic3$);
        $g4772$ = SubLFiles.defconstant("S#42045", (SubLObject)$ic63$);
        $g4773$ = SubLFiles.deflexical("S#42046", (SubLObject)NIL);
        $g4774$ = SubLFiles.defconstant("S#42047", (SubLObject)$ic84$);
        $g4775$ = SubLFiles.defconstant("S#42048", (SubLObject)$ic111$);
        $g4776$ = SubLFiles.defconstant("S#42049", (SubLObject)$ic154$);
        $g4777$ = SubLFiles.deflexical("S#42050", (SubLObject)NIL);
        $g4778$ = SubLFiles.deflexical("S#42051", (SubLObject)NIL);
        $g4779$ = SubLFiles.deflexical("S#42052", (SubLObject)NIL);
        $g4780$ = SubLFiles.defparameter("S#9969", (SubLObject)NIL);
        $g4781$ = SubLFiles.deflexical("S#42053", module0084.f5827((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g4782$ = SubLFiles.deflexical("S#42054", Locks.make_lock((SubLObject)$ic177$));
        $g4783$ = SubLFiles.deflexical("S#42055", (SubLObject)NIL);
        $g4784$ = SubLFiles.defparameter("S#42056", (SubLObject)$ic154$);
        $g4785$ = SubLFiles.deflexical("S#42057", (SubLObject)NIL);
        $g4786$ = SubLFiles.defparameter("S#42058", (SubLObject)T);
        $g4787$ = SubLFiles.defparameter("S#42059", (SubLObject)NIL);
        $g4788$ = SubLFiles.defparameter("S#42060", StreamsLow.$standard_output$.getDynamicValue());
        $g4789$ = SubLFiles.defconstant("S#42061", (SubLObject)FIVE_INTEGER);
        $g4790$ = SubLFiles.defconstant("S#42062", (SubLObject)$ic207$);
        $g4791$ = SubLFiles.deflexical("S#42063", (SubLObject)NIL);
        $g1441$ = SubLFiles.defconstant("S#42064", Locks.make_lock((SubLObject)$ic271$));
        $g4792$ = SubLFiles.deflexical("S#42065", (SubLObject)NIL);
        $g4793$ = SubLFiles.deflexical("S#42066", (SubLObject)NIL);
        $g4794$ = SubLFiles.defconstant("S#42067", Locks.make_lock((SubLObject)$ic271$));
        $g4795$ = SubLFiles.deflexical("S#42068", (SubLObject)NIL);
        $g4796$ = SubLFiles.deflexical("S#42069", (SubLObject)ZERO_INTEGER);
        $g4797$ = SubLFiles.deflexical("S#42070", (SubLObject)NIL);
        $g4798$ = SubLFiles.defconstant("S#42071", Locks.make_lock((SubLObject)$ic271$));
        $g4799$ = SubLFiles.deflexical("S#42072", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic304$)) ? $g4799$.getGlobalValue() : ZERO_INTEGER));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38470() {
        module0002.f38((SubLObject)$ic0$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g4771$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic10$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic11$);
        Structures.def_csetf((SubLObject)$ic12$, (SubLObject)$ic13$);
        Structures.def_csetf((SubLObject)$ic14$, (SubLObject)$ic15$);
        Structures.def_csetf((SubLObject)$ic16$, (SubLObject)$ic17$);
        Structures.def_csetf((SubLObject)$ic18$, (SubLObject)$ic19$);
        Structures.def_csetf((SubLObject)$ic20$, (SubLObject)$ic21$);
        Structures.def_csetf((SubLObject)$ic22$, (SubLObject)$ic23$);
        Structures.def_csetf((SubLObject)$ic24$, (SubLObject)$ic25$);
        Structures.def_csetf((SubLObject)$ic26$, (SubLObject)$ic27$);
        Structures.def_csetf((SubLObject)$ic28$, (SubLObject)$ic29$);
        Structures.def_csetf((SubLObject)$ic30$, (SubLObject)$ic31$);
        Equality.identity((SubLObject)$ic3$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g4771$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic47$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g4772$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic70$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic71$);
        Structures.def_csetf((SubLObject)$ic72$, (SubLObject)$ic73$);
        Structures.def_csetf((SubLObject)$ic74$, (SubLObject)$ic75$);
        Structures.def_csetf((SubLObject)$ic76$, (SubLObject)$ic77$);
        Equality.identity((SubLObject)$ic63$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g4772$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic82$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g4774$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic91$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic92$);
        Structures.def_csetf((SubLObject)$ic93$, (SubLObject)$ic94$);
        Structures.def_csetf((SubLObject)$ic95$, (SubLObject)$ic96$);
        Structures.def_csetf((SubLObject)$ic97$, (SubLObject)$ic98$);
        Structures.def_csetf((SubLObject)$ic99$, (SubLObject)$ic100$);
        Equality.identity((SubLObject)$ic84$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g4774$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic105$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g4775$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic118$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic119$);
        Structures.def_csetf((SubLObject)$ic120$, (SubLObject)$ic121$);
        Structures.def_csetf((SubLObject)$ic122$, (SubLObject)$ic123$);
        Structures.def_csetf((SubLObject)$ic124$, (SubLObject)$ic125$);
        Structures.def_csetf((SubLObject)$ic126$, (SubLObject)$ic127$);
        Structures.def_csetf((SubLObject)$ic128$, (SubLObject)$ic129$);
        Structures.def_csetf((SubLObject)$ic130$, (SubLObject)$ic131$);
        Structures.def_csetf((SubLObject)$ic132$, (SubLObject)$ic133$);
        Structures.def_csetf((SubLObject)$ic134$, (SubLObject)$ic135$);
        Equality.identity((SubLObject)$ic111$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g4775$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic145$));
        module0002.f38((SubLObject)$ic158$);
        module0012.f375((SubLObject)$ic191$, (SubLObject)$ic188$, (SubLObject)$ic192$);
        module0012.f375((SubLObject)$ic194$, (SubLObject)$ic195$, (SubLObject)$ic196$);
        module0002.f38((SubLObject)$ic215$);
        module0002.f38((SubLObject)$ic222$);
        module0012.f368((SubLObject)$ic274$, (SubLObject)NIL, (SubLObject)$ic275$, (SubLObject)NIL, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic276$, (SubLObject)NIL, (SubLObject)$ic277$, (SubLObject)NIL, (SubLObject)NIL);
        module0012.f369((SubLObject)$ic278$);
        module0012.f369((SubLObject)$ic279$);
        module0012.f369((SubLObject)$ic280$);
        module0012.f369((SubLObject)$ic281$);
        module0012.f369((SubLObject)$ic282$);
        module0012.f369((SubLObject)$ic283$);
        if (NIL == $g4785$.getGlobalValue()) {
            $g4785$.setGlobalValue(module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        module0067.f4886($g4785$.getGlobalValue(), (SubLObject)$ic284$, Symbols.symbol_function((SubLObject)$ic174$));
        module0002.f38((SubLObject)$ic285$);
        if (NIL == $g4773$.getGlobalValue()) {
            $g4773$.setGlobalValue(module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        module0067.f4886($g4773$.getGlobalValue(), (SubLObject)$ic284$, Symbols.symbol_function((SubLObject)$ic290$));
        if (NIL == $g4785$.getGlobalValue()) {
            $g4785$.setGlobalValue(module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        module0067.f4886($g4785$.getGlobalValue(), (SubLObject)$ic299$, Symbols.symbol_function((SubLObject)$ic174$));
        if (NIL == $g4773$.getGlobalValue()) {
            $g4773$.setGlobalValue(module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        module0067.f4886($g4773$.getGlobalValue(), (SubLObject)$ic299$, Symbols.symbol_function((SubLObject)$ic302$));
        module0003.f57((SubLObject)$ic304$);
        if (NIL == $g4785$.getGlobalValue()) {
            $g4785$.setGlobalValue(module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        module0067.f4886($g4785$.getGlobalValue(), (SubLObject)$ic305$, Symbols.symbol_function((SubLObject)$ic174$));
        if (NIL == $g4773$.getGlobalValue()) {
            $g4773$.setGlobalValue(module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        module0067.f4886($g4773$.getGlobalValue(), (SubLObject)$ic305$, Symbols.symbol_function((SubLObject)$ic308$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f38468();
    }
    
    public void initializeVariables() {
        f38469();
    }
    
    public void runTopLevelForms() {
        f38470();
    }
    
    static {
        me = (SubLFile)new module0623();
        $g4770$ = null;
        $g4771$ = null;
        $g4772$ = null;
        $g4773$ = null;
        $g4774$ = null;
        $g4775$ = null;
        $g4776$ = null;
        $g4777$ = null;
        $g4778$ = null;
        $g4779$ = null;
        $g4780$ = null;
        $g4781$ = null;
        $g4782$ = null;
        $g4783$ = null;
        $g4784$ = null;
        $g4785$ = null;
        $g4786$ = null;
        $g4787$ = null;
        $g4788$ = null;
        $g4789$ = null;
        $g4790$ = null;
        $g4791$ = null;
        $g1441$ = null;
        $g4792$ = null;
        $g4793$ = null;
        $g4794$ = null;
        $g4795$ = null;
        $g4796$ = null;
        $g4797$ = null;
        $g4798$ = null;
        $g4799$ = null;
        $ic0$ = makeSymbol("SET-TASK-PROCESSOR-VERBOSITY");
        $ic1$ = makeSymbol("INTEGERP");
        $ic2$ = makeString("Invalid verbosity, must be 0 - 9 but was ~S~%");
        $ic3$ = makeSymbol("S#41864", "CYC");
        $ic4$ = makeSymbol("S#41865", "CYC");
        $ic5$ = ConsesLow.list(new SubLObject[] { makeSymbol("TYPE"), makeSymbol("S#1519", "CYC"), makeSymbol("S#9485", "CYC"), makeSymbol("S#10031", "CYC"), makeSymbol("S#42073", "CYC"), makeSymbol("S#713", "CYC"), makeSymbol("S#10030", "CYC"), makeSymbol("S#42074", "CYC"), makeSymbol("S#5851", "CYC"), makeSymbol("S#42075", "CYC") });
        $ic6$ = ConsesLow.list(new SubLObject[] { makeKeyword("TYPE"), makeKeyword("ID"), makeKeyword("PRIORITY"), makeKeyword("REQUESTOR"), makeKeyword("GIVEBACK-INFO"), makeKeyword("BINDINGS"), makeKeyword("REQUEST"), makeKeyword("RESPONSE"), makeKeyword("ERROR-MESSAGE"), makeKeyword("TASK-PROCESSOR-NAME") });
        $ic7$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#41875", "CYC"), makeSymbol("S#41876", "CYC"), makeSymbol("S#41877", "CYC"), makeSymbol("S#41878", "CYC"), makeSymbol("S#41879", "CYC"), makeSymbol("S#41880", "CYC"), makeSymbol("S#41881", "CYC"), makeSymbol("S#41882", "CYC"), makeSymbol("S#41883", "CYC"), makeSymbol("S#41884", "CYC") });
        $ic8$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#41885", "CYC"), makeSymbol("S#41886", "CYC"), makeSymbol("S#41887", "CYC"), makeSymbol("S#41888", "CYC"), makeSymbol("S#41889", "CYC"), makeSymbol("S#41890", "CYC"), makeSymbol("S#41891", "CYC"), makeSymbol("S#41892", "CYC"), makeSymbol("S#41893", "CYC"), makeSymbol("S#41894", "CYC") });
        $ic9$ = makeSymbol("S#41918", "CYC");
        $ic10$ = makeSymbol("S#41874", "CYC");
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#41865", "CYC"));
        $ic12$ = makeSymbol("S#41875", "CYC");
        $ic13$ = makeSymbol("S#41885", "CYC");
        $ic14$ = makeSymbol("S#41876", "CYC");
        $ic15$ = makeSymbol("S#41886", "CYC");
        $ic16$ = makeSymbol("S#41877", "CYC");
        $ic17$ = makeSymbol("S#41887", "CYC");
        $ic18$ = makeSymbol("S#41878", "CYC");
        $ic19$ = makeSymbol("S#41888", "CYC");
        $ic20$ = makeSymbol("S#41879", "CYC");
        $ic21$ = makeSymbol("S#41889", "CYC");
        $ic22$ = makeSymbol("S#41880", "CYC");
        $ic23$ = makeSymbol("S#41890", "CYC");
        $ic24$ = makeSymbol("S#41881", "CYC");
        $ic25$ = makeSymbol("S#41891", "CYC");
        $ic26$ = makeSymbol("S#41882", "CYC");
        $ic27$ = makeSymbol("S#41892", "CYC");
        $ic28$ = makeSymbol("S#41883", "CYC");
        $ic29$ = makeSymbol("S#41893", "CYC");
        $ic30$ = makeSymbol("S#41884", "CYC");
        $ic31$ = makeSymbol("S#41894", "CYC");
        $ic32$ = makeKeyword("TYPE");
        $ic33$ = makeKeyword("ID");
        $ic34$ = makeKeyword("PRIORITY");
        $ic35$ = makeKeyword("REQUESTOR");
        $ic36$ = makeKeyword("GIVEBACK-INFO");
        $ic37$ = makeKeyword("BINDINGS");
        $ic38$ = makeKeyword("REQUEST");
        $ic39$ = makeKeyword("RESPONSE");
        $ic40$ = makeKeyword("ERROR-MESSAGE");
        $ic41$ = makeKeyword("TASK-PROCESSOR-NAME");
        $ic42$ = makeString("Invalid slot ~S for construction function");
        $ic43$ = makeKeyword("BEGIN");
        $ic44$ = makeSymbol("S#41895", "CYC");
        $ic45$ = makeKeyword("SLOT");
        $ic46$ = makeKeyword("END");
        $ic47$ = makeSymbol("S#41897", "CYC");
        $ic48$ = makeSymbol("SYMBOLP");
        $ic49$ = makeSymbol("STRINGP");
        $ic50$ = makeSymbol("STREAMP");
        $ic51$ = makeString("#<");
        $ic52$ = makeKeyword("STREAM");
        $ic53$ = makeString("type=");
        $ic54$ = makeString(" id=");
        $ic55$ = makeString(" priority=");
        $ic56$ = makeString(" requestor=");
        $ic57$ = makeString(" giveback-info=");
        $ic58$ = makeString(" bindings=");
        $ic59$ = makeString(" request=");
        $ic60$ = makeString(" response=");
        $ic61$ = makeString(" error-message=");
        $ic62$ = makeKeyword("BASE");
        $ic63$ = makeSymbol("S#41866", "CYC");
        $ic64$ = makeSymbol("S#41867", "CYC");
        $ic65$ = ConsesLow.list((SubLObject)makeSymbol("S#3267", "CYC"), (SubLObject)makeSymbol("S#41864", "CYC"), (SubLObject)makeSymbol("S#5959", "CYC"));
        $ic66$ = ConsesLow.list((SubLObject)makeKeyword("RESULT"), (SubLObject)makeKeyword("TASK-INFO"), (SubLObject)makeKeyword("FINISHED"));
        $ic67$ = ConsesLow.list((SubLObject)makeSymbol("S#41920", "CYC"), (SubLObject)makeSymbol("S#41921", "CYC"), (SubLObject)makeSymbol("S#41922", "CYC"));
        $ic68$ = ConsesLow.list((SubLObject)makeSymbol("S#41923", "CYC"), (SubLObject)makeSymbol("S#41924", "CYC"), (SubLObject)makeSymbol("S#41925", "CYC"));
        $ic69$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic70$ = makeSymbol("S#41919", "CYC");
        $ic71$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#41867", "CYC"));
        $ic72$ = makeSymbol("S#41920", "CYC");
        $ic73$ = makeSymbol("S#41923", "CYC");
        $ic74$ = makeSymbol("S#41921", "CYC");
        $ic75$ = makeSymbol("S#41924", "CYC");
        $ic76$ = makeSymbol("S#41922", "CYC");
        $ic77$ = makeSymbol("S#41925", "CYC");
        $ic78$ = makeKeyword("RESULT");
        $ic79$ = makeKeyword("TASK-INFO");
        $ic80$ = makeKeyword("FINISHED");
        $ic81$ = makeSymbol("S#41926", "CYC");
        $ic82$ = makeSymbol("S#41928", "CYC");
        $ic83$ = makeSymbol("BOOLEANP");
        $ic84$ = makeSymbol("S#41868", "CYC");
        $ic85$ = makeSymbol("S#41869", "CYC");
        $ic86$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#104", "CYC"), (SubLObject)makeSymbol("S#42076", "CYC"), (SubLObject)makeSymbol("S#41864", "CYC"));
        $ic87$ = ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeKeyword("PROCESS"), (SubLObject)makeKeyword("BUSY-P"), (SubLObject)makeKeyword("TASK-INFO"));
        $ic88$ = ConsesLow.list((SubLObject)makeSymbol("S#41932", "CYC"), (SubLObject)makeSymbol("S#41933", "CYC"), (SubLObject)makeSymbol("S#41934", "CYC"), (SubLObject)makeSymbol("S#41935", "CYC"));
        $ic89$ = ConsesLow.list((SubLObject)makeSymbol("S#41936", "CYC"), (SubLObject)makeSymbol("S#41937", "CYC"), (SubLObject)makeSymbol("S#41938", "CYC"), (SubLObject)makeSymbol("S#41939", "CYC"));
        $ic90$ = makeSymbol("S#41943", "CYC");
        $ic91$ = makeSymbol("S#41931", "CYC");
        $ic92$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#41869", "CYC"));
        $ic93$ = makeSymbol("S#41932", "CYC");
        $ic94$ = makeSymbol("S#41936", "CYC");
        $ic95$ = makeSymbol("S#41933", "CYC");
        $ic96$ = makeSymbol("S#41937", "CYC");
        $ic97$ = makeSymbol("S#41934", "CYC");
        $ic98$ = makeSymbol("S#41938", "CYC");
        $ic99$ = makeSymbol("S#41935", "CYC");
        $ic100$ = makeSymbol("S#41939", "CYC");
        $ic101$ = makeKeyword("NAME");
        $ic102$ = makeKeyword("PROCESS");
        $ic103$ = makeKeyword("BUSY-P");
        $ic104$ = makeSymbol("S#41940", "CYC");
        $ic105$ = makeSymbol("S#41942", "CYC");
        $ic106$ = makeString("name=");
        $ic107$ = makeString(" process=");
        $ic108$ = makeString(" whostate=");
        $ic109$ = makeString(" busy-p=");
        $ic110$ = makeString(" last response=");
        $ic111$ = makeSymbol("S#41870", "CYC");
        $ic112$ = makeSymbol("S#31689", "CYC");
        $ic113$ = ConsesLow.list((SubLObject)makeSymbol("S#672", "CYC"), (SubLObject)makeSymbol("S#42077", "CYC"), (SubLObject)makeSymbol("S#42078", "CYC"), (SubLObject)makeSymbol("S#42079", "CYC"), (SubLObject)makeSymbol("S#42080", "CYC"), (SubLObject)makeSymbol("S#42081", "CYC"), (SubLObject)makeSymbol("S#42082", "CYC"), (SubLObject)makeSymbol("S#42083", "CYC"));
        $ic114$ = ConsesLow.list((SubLObject)makeKeyword("LOCK"), (SubLObject)makeKeyword("REQUEST-QUEUE"), (SubLObject)makeKeyword("REQUEST-SEMAPHORE"), (SubLObject)makeKeyword("PROCESSORS"), (SubLObject)makeKeyword("BACKGROUND-MSGS"), (SubLObject)makeKeyword("PROCESS-NAME-PREFIX"), (SubLObject)makeKeyword("MIN-NBR-OF-TASK-PROCESSORS"), (SubLObject)makeKeyword("MAX-NBR-OF-TASK-PROCESSORS"));
        $ic115$ = ConsesLow.list((SubLObject)makeSymbol("S#41945", "CYC"), (SubLObject)makeSymbol("S#41946", "CYC"), (SubLObject)makeSymbol("S#41947", "CYC"), (SubLObject)makeSymbol("S#41948", "CYC"), (SubLObject)makeSymbol("S#41949", "CYC"), (SubLObject)makeSymbol("S#41950", "CYC"), (SubLObject)makeSymbol("S#41951", "CYC"), (SubLObject)makeSymbol("S#41952", "CYC"));
        $ic116$ = ConsesLow.list((SubLObject)makeSymbol("S#41953", "CYC"), (SubLObject)makeSymbol("S#41954", "CYC"), (SubLObject)makeSymbol("S#41955", "CYC"), (SubLObject)makeSymbol("S#41956", "CYC"), (SubLObject)makeSymbol("S#41957", "CYC"), (SubLObject)makeSymbol("S#41958", "CYC"), (SubLObject)makeSymbol("S#41959", "CYC"), (SubLObject)makeSymbol("S#41960", "CYC"));
        $ic117$ = makeSymbol("S#41964", "CYC");
        $ic118$ = makeSymbol("S#41944", "CYC");
        $ic119$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#31689", "CYC"));
        $ic120$ = makeSymbol("S#41945", "CYC");
        $ic121$ = makeSymbol("S#41953", "CYC");
        $ic122$ = makeSymbol("S#41946", "CYC");
        $ic123$ = makeSymbol("S#41954", "CYC");
        $ic124$ = makeSymbol("S#41947", "CYC");
        $ic125$ = makeSymbol("S#41955", "CYC");
        $ic126$ = makeSymbol("S#41948", "CYC");
        $ic127$ = makeSymbol("S#41956", "CYC");
        $ic128$ = makeSymbol("S#41949", "CYC");
        $ic129$ = makeSymbol("S#41957", "CYC");
        $ic130$ = makeSymbol("S#41950", "CYC");
        $ic131$ = makeSymbol("S#41958", "CYC");
        $ic132$ = makeSymbol("S#41951", "CYC");
        $ic133$ = makeSymbol("S#41959", "CYC");
        $ic134$ = makeSymbol("S#41952", "CYC");
        $ic135$ = makeSymbol("S#41960", "CYC");
        $ic136$ = makeKeyword("LOCK");
        $ic137$ = makeKeyword("REQUEST-QUEUE");
        $ic138$ = makeKeyword("REQUEST-SEMAPHORE");
        $ic139$ = makeKeyword("PROCESSORS");
        $ic140$ = makeKeyword("BACKGROUND-MSGS");
        $ic141$ = makeKeyword("PROCESS-NAME-PREFIX");
        $ic142$ = makeKeyword("MIN-NBR-OF-TASK-PROCESSORS");
        $ic143$ = makeKeyword("MAX-NBR-OF-TASK-PROCESSORS");
        $ic144$ = makeSymbol("S#41961", "CYC");
        $ic145$ = makeSymbol("S#41963", "CYC");
        $ic146$ = makeString(" request-queue=");
        $ic147$ = makeString(" processors=");
        $ic148$ = makeString(" process name prefix=");
        $ic149$ = makeString(" min processors=");
        $ic150$ = makeString(" max processors=");
        $ic151$ = makeString("There are no task processors.");
        $ic152$ = makeString("~S~%");
        $ic153$ = makeString("request=~S~%");
        $ic154$ = makeInteger(500);
        $ic155$ = makeSymbol("LOCK-P");
        $ic156$ = makeSymbol("S#5480", "CYC");
        $ic157$ = makeSymbol("LISTP");
        $ic158$ = makeSymbol("SET-TPOOL-BACKGROUND-MSG-PATH");
        $ic159$ = makeString("tpool-background-msg-lock");
        $ic160$ = makeString("~A is not a valid file specification");
        $ic161$ = makeKeyword("DIRECTION");
        $ic162$ = makeKeyword("OUTPUT");
        $ic163$ = makeKeyword("IF-DOES-NOT-EXIST");
        $ic164$ = makeKeyword("CREATE");
        $ic165$ = makeKeyword("IF-EXISTS");
        $ic166$ = makeKeyword("OVERWRITE");
        $ic167$ = makeString("[");
        $ic168$ = makeString("]");
        $ic169$ = makeString("  ");
        $ic170$ = makeString(" ");
        $ic171$ = makeSymbol("CLET");
        $ic172$ = makeSymbol("CSETQ");
        $ic173$ = makeSymbol("S#9969", "CYC");
        $ic174$ = makeSymbol("S#5237", "CYC");
        $ic175$ = makeSymbol("EVAL");
        $ic176$ = makeSymbol("PROCESSP");
        $ic177$ = makeString("Task processes being worked on");
        $ic178$ = makeKeyword("ABORT");
        $ic179$ = makeKeyword("CANCEL");
        $ic180$ = makeSymbol("S#41995", "CYC");
        $ic181$ = makeKeyword("NEWEST");
        $ic182$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic183$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic184$ = makeSymbol("S#41999", "CYC");
        $ic185$ = makeSymbol("S#42000", "CYC");
        $ic186$ = makeString("API error: Unknown active task process termination reason ~A");
        $ic187$ = makeKeyword("TERMINATE-PREMATURELY");
        $ic188$ = ConsesLow.list((SubLObject)makeSymbol("S#768", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic189$ = makeSymbol("CCATCH");
        $ic190$ = makeSymbol("PROGN");
        $ic191$ = makeSymbol("CATCH-TASK-PROCESSOR-TERMINATION");
        $ic192$ = makeString("Allow for the API calling side to catch the termination of the task processor.\n   The client must wrap the api-request form with catch-task-processor-termination.");
        $ic193$ = makeUninternedSymbol("US#56A639B");
        $ic194$ = makeSymbol("CATCH-TASK-PROCESSOR-TERMINATION-QUIETLY");
        $ic195$ = ConsesLow.list((SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic196$ = makeString("Allow for the API calling side to catch the termination of the task processor\n   without looking at the termination reason.\n   The client must wrap the api-request form with catch-task-processor-termination-quietly.");
        $ic197$ = (SubLFloat)makeDouble(0.001);
        $ic198$ = makeKeyword("TASK-PROCESSOR-QUIT");
        $ic199$ = makeString("Invalid task-processor");
        $ic200$ = makeString("Invalid task-process-pool");
        $ic201$ = makeString("Task Info ~S~%");
        $ic202$ = makeSymbol("S#38", "CYC");
        $ic203$ = makeString("Response ~S~%");
        $ic204$ = makeString("Error-message ~S~%");
        $ic205$ = makeString("Posting partial results ~A at ~A");
        $ic206$ = makeString("Function only valid from within a Task Processor, but running inside ~A.");
        $ic207$ = makeInteger(25);
        $ic208$ = makeString("Task processor ");
        $ic209$ = makeString("Initializing task processors~%");
        $ic210$ = makeString("~alock");
        $ic211$ = makeString("task-pool-request-semaphore");
        $ic212$ = makeString("~a~s");
        $ic213$ = makeSymbol("S#42004", "CYC");
        $ic214$ = makeSymbol("S#42011", "CYC");
        $ic215$ = makeSymbol("ENSURE-TASK-PROCESSORS-KILLED");
        $ic216$ = makeString(" processor ");
        $ic217$ = makeString(" Killing ~A.~%");
        $ic218$ = makeString("Allocating a new task processor~%");
        $ic219$ = makeString("Awakening first available task processor~%");
        $ic220$ = makeString("Task processors are not initialized.");
        $ic221$ = makeString("~%Error: cannot queue task request for ~%~S~%");
        $ic222$ = makeSymbol("WITH-LONG-RUNNING-TASK-PROCESS");
        $ic223$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42084", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#31690", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CURRENT-PROCESS")))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42085", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#41968", "CYC"), (SubLObject)makeSymbol("S#42084", "CYC"))), (SubLObject)makeSymbol("S#42086", "CYC"));
        $ic224$ = makeSymbol("CUNWIND-PROTECT");
        $ic225$ = ConsesLow.list((SubLObject)makeSymbol("WITH-LOCK-HELD"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42085", "CYC"), (SubLObject)makeKeyword("WHOSTATE"), (SubLObject)makeString("Upping maximum on process pool ....")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42087", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#41984", "CYC"), (SubLObject)makeSymbol("S#42084", "CYC")))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#41983", "CYC"), (SubLObject)makeSymbol("S#42084", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("+"), (SubLObject)makeSymbol("S#42087", "CYC"), (SubLObject)ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CSETQ"), (SubLObject)makeSymbol("S#42086", "CYC"), (SubLObject)T)));
        $ic226$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("PWHEN"), (SubLObject)makeSymbol("S#42086", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("WITH-LOCK-HELD"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42085", "CYC"), (SubLObject)makeKeyword("WHOSTATE"), (SubLObject)makeString("Reverting maximum on process pool ....")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42087", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#41984", "CYC"), (SubLObject)makeSymbol("S#42084", "CYC")))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#41983", "CYC"), (SubLObject)makeSymbol("S#42084", "CYC"), (SubLObject)ConsesLow.list((SubLObject)ONE_INTEGER, (SubLObject)makeSymbol("S#42087", "CYC"), (SubLObject)ONE_INTEGER))))));
        $ic227$ = ConsesLow.list((SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#42082", "CYC"), (SubLObject)makeSymbol("S#42083", "CYC"));
        $ic228$ = makeString("*");
        $ic229$ = makeString("-TASK-PROCESS-POOL*");
        $ic230$ = makeString("-TASK-PROCESS-POOL-LOCK*");
        $ic231$ = makeSymbol("DEFLEXICAL-PUBLIC");
        $ic232$ = ConsesLow.list((SubLObject)NIL, (SubLObject)makeString("Task process pool for requests."));
        $ic233$ = makeSymbol("DEFCONSTANT-PUBLIC");
        $ic234$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("MAKE-LOCK"), (SubLObject)makeString("task processor initialization lock")), (SubLObject)makeString("Task process pool lock to guarantee only a single instance is initialized."));
        $ic235$ = makeSymbol("DEFINE-PUBLIC");
        $ic236$ = makeString("-TASK-PROCESSORS-INITIALIZED-P");
        $ic237$ = makeString("Return T when there are task processors.");
        $ic238$ = makeSymbol("RET");
        $ic239$ = makeSymbol("S#41967", "CYC");
        $ic240$ = makeString("INITIALIZE-");
        $ic241$ = makeString("-TASK-PROCESSORS");
        $ic242$ = makeString("Initialize the task processor pool for requests.");
        $ic243$ = makeSymbol("WITH-LOCK-HELD");
        $ic244$ = makeSymbol("PWHEN");
        $ic245$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("ERROR"), (SubLObject)makeString("Illegal attempt to reinitialize processor pool without first halting it.")));
        $ic246$ = makeSymbol("S#42006", "CYC");
        $ic247$ = makeSymbol("CCONCATENATE");
        $ic248$ = ConsesLow.list((SubLObject)makeString(" processor "));
        $ic249$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("RET"), (SubLObject)NIL));
        $ic250$ = makeString("HALT-");
        $ic251$ = makeString("Halt the task processors.");
        $ic252$ = makeSymbol("S#42008", "CYC");
        $ic253$ = ConsesLow.list((SubLObject)NIL);
        $ic254$ = makeString("RESTART-");
        $ic255$ = makeString("Restart (halt + initialize) the task processors.");
        $ic256$ = makeString("SHOW-");
        $ic257$ = makeString("-TP-MSGS");
        $ic258$ = makeString("Show and reset the task processor background messages for the\n          task-process-pool.");
        $ic259$ = makeSymbol("S#41977", "CYC");
        $ic260$ = ConsesLow.list((SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#42088", "CYC"), (SubLObject)makeSymbol("S#105", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic261$ = makeString("-TASK-PROCESSOR-REQUEST");
        $ic262$ = ConsesLow.list((SubLObject)makeSymbol("PUNLESS"), (SubLObject)makeSymbol("S#42057", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CSETQ"), (SubLObject)makeSymbol("S#42057", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("NEW-DICTIONARY"))));
        $ic263$ = makeSymbol("DICTIONARY-ENTER");
        $ic264$ = makeSymbol("S#42057", "CYC");
        $ic265$ = ConsesLow.list((SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#105", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic266$ = makeString("DISPATCH-");
        $ic267$ = makeString("-TASK-PROCESSOR-RESPONSE");
        $ic268$ = ConsesLow.list((SubLObject)makeSymbol("PUNLESS"), (SubLObject)makeSymbol("S#42046", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CSETQ"), (SubLObject)makeSymbol("S#42046", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("NEW-DICTIONARY"))));
        $ic269$ = makeSymbol("S#42046", "CYC");
        $ic270$ = makeSymbol("FUNCTION");
        $ic271$ = makeString("task processor initialization lock");
        $ic272$ = makeString("Illegal attempt to reinitialize processor pool without first halting it.");
        $ic273$ = makeString("API");
        $ic274$ = makeSymbol("SHOW-API-TASK-PROCESSORS");
        $ic275$ = makeString("Provides a convenient alias for DISPLAY-API-TASK-PROCESSORS.");
        $ic276$ = makeSymbol("DISPLAY-API-TASK-PROCESSORS");
        $ic277$ = makeString("");
        $ic278$ = makeSymbol("INITIALIZE-API-TASK-PROCESSORS");
        $ic279$ = makeSymbol("HALT-API-TASK-PROCESSORS");
        $ic280$ = makeSymbol("RESTART-API-TASK-PROCESSORS");
        $ic281$ = makeSymbol("SHOW-API-TP-MSGS");
        $ic282$ = makeSymbol("API-TASK-PROCESSOR-REQUEST");
        $ic283$ = makeSymbol("WITH-IMMEDIATE-EXECUTION");
        $ic284$ = makeKeyword("API");
        $ic285$ = makeSymbol("SET-JAVA-API-LEASE-ACTIVITY-DISPLAY");
        $ic286$ = makeString("Dispatching api response ~S~%");
        $ic287$ = makeSymbol("S#42089", "CYC");
        $ic288$ = makeString("Sending api response ~S to socket ~S~% identified by ~A~%");
        $ic289$ = makeString("Dropping api response ~S, socket ~S~% identified by ~A is not available~%");
        $ic290$ = makeSymbol("S#42021", "CYC");
        $ic291$ = makeSymbol("S#42025", "CYC");
        $ic292$ = makeSymbol("S#42023", "CYC");
        $ic293$ = makeSymbol("S#42026", "CYC");
        $ic294$ = makeSymbol("S#42027", "CYC");
        $ic295$ = makeSymbol("S#42028", "CYC");
        $ic296$ = makeSymbol("S#42024", "CYC");
        $ic297$ = makeString("Cannot invoke intermediate results accumulator outside of a task processor.~%");
        $ic298$ = makeString("BG");
        $ic299$ = makeKeyword("BG");
        $ic300$ = makeString("dispatching bg response ~S~%");
        $ic301$ = makeString("bg response dictionary ~S~%");
        $ic302$ = makeSymbol("S#42035", "CYC");
        $ic303$ = makeString("CONSOLE");
        $ic304$ = makeSymbol("S#42072", "CYC");
        $ic305$ = makeKeyword("CONSOLE");
        $ic306$ = makeString("dispatching console response ~S~%");
        $ic307$ = makeString("~A  ~A~%");
        $ic308$ = makeSymbol("S#42043", "CYC");
    }
    
    public static final class $sX41864_native extends SubLStructNative
    {
        public SubLObject $type;
        public SubLObject $id;
        public SubLObject $priority;
        public SubLObject $requestor;
        public SubLObject $giveback_info;
        public SubLObject $bindings;
        public SubLObject $request;
        public SubLObject $response;
        public SubLObject $error_message;
        public SubLObject $task_processor_name;
        private static final SubLStructDeclNative structDecl;
        
        public $sX41864_native() {
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$priority = (SubLObject)CommonSymbols.NIL;
            this.$requestor = (SubLObject)CommonSymbols.NIL;
            this.$giveback_info = (SubLObject)CommonSymbols.NIL;
            this.$bindings = (SubLObject)CommonSymbols.NIL;
            this.$request = (SubLObject)CommonSymbols.NIL;
            this.$response = (SubLObject)CommonSymbols.NIL;
            this.$error_message = (SubLObject)CommonSymbols.NIL;
            this.$task_processor_name = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX41864_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$type;
        }
        
        public SubLObject getField3() {
            return this.$id;
        }
        
        public SubLObject getField4() {
            return this.$priority;
        }
        
        public SubLObject getField5() {
            return this.$requestor;
        }
        
        public SubLObject getField6() {
            return this.$giveback_info;
        }
        
        public SubLObject getField7() {
            return this.$bindings;
        }
        
        public SubLObject getField8() {
            return this.$request;
        }
        
        public SubLObject getField9() {
            return this.$response;
        }
        
        public SubLObject getField10() {
            return this.$error_message;
        }
        
        public SubLObject getField11() {
            return this.$task_processor_name;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$type = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$priority = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$requestor = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$giveback_info = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$bindings = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$request = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$response = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$error_message = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$task_processor_name = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX41864_native.class, $ic3$, $ic4$, $ic5$, $ic6$, new String[] { "$type", "$id", "$priority", "$requestor", "$giveback_info", "$bindings", "$request", "$response", "$error_message", "$task_processor_name" }, $ic7$, $ic8$, $ic9$);
        }
    }
    
    public static final class $f38280$UnaryFunction extends UnaryFunction
    {
        public $f38280$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#41865"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return f38280(var5);
        }
    }
    
    public static final class $sX41866_native extends SubLStructNative
    {
        public SubLObject $result;
        public SubLObject $task_info;
        public SubLObject $finished;
        private static final SubLStructDeclNative structDecl;
        
        public $sX41866_native() {
            this.$result = (SubLObject)CommonSymbols.NIL;
            this.$task_info = (SubLObject)CommonSymbols.NIL;
            this.$finished = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX41866_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$result;
        }
        
        public SubLObject getField3() {
            return this.$task_info;
        }
        
        public SubLObject getField4() {
            return this.$finished;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$result = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$task_info = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$finished = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX41866_native.class, $ic63$, $ic64$, $ic65$, $ic66$, new String[] { "$result", "$task_info", "$finished" }, $ic67$, $ic68$, $ic69$);
        }
    }
    
    public static final class $f38325$UnaryFunction extends UnaryFunction
    {
        public $f38325$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#41867"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return f38325(var5);
        }
    }
    
    public static final class $sX41868_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $process;
        public SubLObject $busy_p;
        public SubLObject $task_info;
        private static final SubLStructDeclNative structDecl;
        
        public $sX41868_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$process = (SubLObject)CommonSymbols.NIL;
            this.$busy_p = (SubLObject)CommonSymbols.NIL;
            this.$task_info = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX41868_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$process;
        }
        
        public SubLObject getField4() {
            return this.$busy_p;
        }
        
        public SubLObject getField5() {
            return this.$task_info;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$process = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$busy_p = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$task_info = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX41868_native.class, $ic84$, $ic85$, $ic86$, $ic87$, new String[] { "$name", "$process", "$busy_p", "$task_info" }, $ic88$, $ic89$, $ic90$);
        }
    }
    
    public static final class $f38339$UnaryFunction extends UnaryFunction
    {
        public $f38339$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#41869"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return f38339(var5);
        }
    }
    
    public static final class $sX41870_native extends SubLStructNative
    {
        public SubLObject $lock;
        public SubLObject $request_queue;
        public SubLObject $request_semaphore;
        public SubLObject $processors;
        public SubLObject $background_msgs;
        public SubLObject $process_name_prefix;
        public SubLObject $min_nbr_of_task_processors;
        public SubLObject $max_nbr_of_task_processors;
        private static final SubLStructDeclNative structDecl;
        
        public $sX41870_native() {
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$request_queue = (SubLObject)CommonSymbols.NIL;
            this.$request_semaphore = (SubLObject)CommonSymbols.NIL;
            this.$processors = (SubLObject)CommonSymbols.NIL;
            this.$background_msgs = (SubLObject)CommonSymbols.NIL;
            this.$process_name_prefix = (SubLObject)CommonSymbols.NIL;
            this.$min_nbr_of_task_processors = (SubLObject)CommonSymbols.NIL;
            this.$max_nbr_of_task_processors = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX41870_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$lock;
        }
        
        public SubLObject getField3() {
            return this.$request_queue;
        }
        
        public SubLObject getField4() {
            return this.$request_semaphore;
        }
        
        public SubLObject getField5() {
            return this.$processors;
        }
        
        public SubLObject getField6() {
            return this.$background_msgs;
        }
        
        public SubLObject getField7() {
            return this.$process_name_prefix;
        }
        
        public SubLObject getField8() {
            return this.$min_nbr_of_task_processors;
        }
        
        public SubLObject getField9() {
            return this.$max_nbr_of_task_processors;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$request_queue = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$request_semaphore = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$processors = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$background_msgs = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$process_name_prefix = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$min_nbr_of_task_processors = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$max_nbr_of_task_processors = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX41870_native.class, $ic111$, $ic112$, $ic113$, $ic114$, new String[] { "$lock", "$request_queue", "$request_semaphore", "$processors", "$background_msgs", "$process_name_prefix", "$min_nbr_of_task_processors", "$max_nbr_of_task_processors" }, $ic115$, $ic116$, $ic117$);
        }
    }
    
    public static final class $f38353$UnaryFunction extends UnaryFunction
    {
        public $f38353$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#31689"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return f38353(var5);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 954 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/