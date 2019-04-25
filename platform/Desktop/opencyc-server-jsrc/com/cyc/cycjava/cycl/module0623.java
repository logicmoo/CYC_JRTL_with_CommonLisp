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
        return module0623.$g4770$.getDynamicValue(var1);
    }
    
    public static SubLObject f38277(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        assert module0623.NIL != Types.integerp(var2) : var2;
        if (module0623.NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && (!module0623.MINUS_ONE_INTEGER.numL(var2) || !var2.numL((SubLObject)module0623.TEN_INTEGER))) {
            Errors.error((SubLObject)module0623.$ic2$, var2);
        }
        module0623.$g4770$.setDynamicValue(var2, var3);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38278(final SubLObject var3, final SubLObject var4) {
        f38279(var3, var4, (SubLObject)module0623.ZERO_INTEGER);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38280(final SubLObject var3) {
        return (SubLObject)((var3.getClass() == $sX41864_native.class) ? module0623.T : module0623.NIL);
    }
    
    public static SubLObject f38281(final SubLObject var3) {
        assert module0623.NIL != f38280(var3) : var3;
        return var3.getField2();
    }
    
    public static SubLObject f38282(final SubLObject var3) {
        assert module0623.NIL != f38280(var3) : var3;
        return var3.getField3();
    }
    
    public static SubLObject f38283(final SubLObject var3) {
        assert module0623.NIL != f38280(var3) : var3;
        return var3.getField4();
    }
    
    public static SubLObject f38284(final SubLObject var3) {
        assert module0623.NIL != f38280(var3) : var3;
        return var3.getField5();
    }
    
    public static SubLObject f38285(final SubLObject var3) {
        assert module0623.NIL != f38280(var3) : var3;
        return var3.getField6();
    }
    
    public static SubLObject f38286(final SubLObject var3) {
        assert module0623.NIL != f38280(var3) : var3;
        return var3.getField7();
    }
    
    public static SubLObject f38287(final SubLObject var3) {
        assert module0623.NIL != f38280(var3) : var3;
        return var3.getField8();
    }
    
    public static SubLObject f38288(final SubLObject var3) {
        assert module0623.NIL != f38280(var3) : var3;
        return var3.getField9();
    }
    
    public static SubLObject f38289(final SubLObject var3) {
        assert module0623.NIL != f38280(var3) : var3;
        return var3.getField10();
    }
    
    public static SubLObject f38290(final SubLObject var3) {
        assert module0623.NIL != f38280(var3) : var3;
        return var3.getField11();
    }
    
    public static SubLObject f38291(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38280(var3) : var3;
        return var3.setField2(var6);
    }
    
    public static SubLObject f38292(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38280(var3) : var3;
        return var3.setField3(var6);
    }
    
    public static SubLObject f38293(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38280(var3) : var3;
        return var3.setField4(var6);
    }
    
    public static SubLObject f38294(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38280(var3) : var3;
        return var3.setField5(var6);
    }
    
    public static SubLObject f38295(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38280(var3) : var3;
        return var3.setField6(var6);
    }
    
    public static SubLObject f38296(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38280(var3) : var3;
        return var3.setField7(var6);
    }
    
    public static SubLObject f38297(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38280(var3) : var3;
        return var3.setField8(var6);
    }
    
    public static SubLObject f38298(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38280(var3) : var3;
        return var3.setField9(var6);
    }
    
    public static SubLObject f38299(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38280(var3) : var3;
        return var3.setField10(var6);
    }
    
    public static SubLObject f38300(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38280(var3) : var3;
        return var3.setField11(var6);
    }
    
    public static SubLObject f38301(SubLObject var7) {
        if (var7 == module0623.UNPROVIDED) {
            var7 = (SubLObject)module0623.NIL;
        }
        final SubLObject var8 = (SubLObject)new $sX41864_native();
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        for (var9 = (SubLObject)module0623.NIL, var9 = var7; module0623.NIL != var9; var9 = conses_high.cddr(var9)) {
            var10 = var9.first();
            var11 = conses_high.cadr(var9);
            var12 = var10;
            if (var12.eql((SubLObject)module0623.$ic32$)) {
                f38291(var8, var11);
            }
            else if (var12.eql((SubLObject)module0623.$ic33$)) {
                f38292(var8, var11);
            }
            else if (var12.eql((SubLObject)module0623.$ic34$)) {
                f38293(var8, var11);
            }
            else if (var12.eql((SubLObject)module0623.$ic35$)) {
                f38294(var8, var11);
            }
            else if (var12.eql((SubLObject)module0623.$ic36$)) {
                f38295(var8, var11);
            }
            else if (var12.eql((SubLObject)module0623.$ic37$)) {
                f38296(var8, var11);
            }
            else if (var12.eql((SubLObject)module0623.$ic38$)) {
                f38297(var8, var11);
            }
            else if (var12.eql((SubLObject)module0623.$ic39$)) {
                f38298(var8, var11);
            }
            else if (var12.eql((SubLObject)module0623.$ic40$)) {
                f38299(var8, var11);
            }
            else if (var12.eql((SubLObject)module0623.$ic41$)) {
                f38300(var8, var11);
            }
            else {
                Errors.error((SubLObject)module0623.$ic42$, var10);
            }
        }
        return var8;
    }
    
    public static SubLObject f38302(final SubLObject var13, final SubLObject var14) {
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic43$, (SubLObject)module0623.$ic44$, (SubLObject)module0623.TEN_INTEGER);
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic32$, f38281(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic33$, f38282(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic34$, f38283(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic35$, f38284(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic36$, f38285(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic37$, f38286(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic38$, f38287(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic39$, f38288(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic40$, f38289(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic41$, f38290(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic46$, (SubLObject)module0623.$ic44$, (SubLObject)module0623.TEN_INTEGER);
        return var13;
    }
    
    public static SubLObject f38303(final SubLObject var13, final SubLObject var14) {
        return f38302(var13, var14);
    }
    
    public static SubLObject f38304(final SubLObject var15) {
        assert module0623.NIL != f38280(var15) : var15;
        return f38281(var15);
    }
    
    public static SubLObject f38305(final SubLObject var16, final SubLObject var15) {
        assert module0623.NIL != Types.symbolp(var16) : var16;
        assert module0623.NIL != f38280(var15) : var15;
        f38291(var15, var16);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38306(final SubLObject var15) {
        assert module0623.NIL != f38280(var15) : var15;
        return f38282(var15);
    }
    
    public static SubLObject f38307(final SubLObject var17, final SubLObject var15) {
        assert module0623.NIL != Types.integerp(var17) : var17;
        assert module0623.NIL != f38280(var15) : var15;
        f38292(var15, var17);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38308(final SubLObject var15) {
        assert module0623.NIL != f38280(var15) : var15;
        return f38283(var15);
    }
    
    public static SubLObject f38309(final SubLObject var18, final SubLObject var15) {
        assert module0623.NIL != Types.integerp(var18) : var18;
        assert module0623.NIL != f38280(var15) : var15;
        f38293(var15, var18);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38310(final SubLObject var15) {
        assert module0623.NIL != f38280(var15) : var15;
        return f38284(var15);
    }
    
    public static SubLObject f38311(final SubLObject var19, final SubLObject var15) {
        assert module0623.NIL != Types.stringp(var19) : var19;
        assert module0623.NIL != f38280(var15) : var15;
        f38294(var15, var19);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38312(final SubLObject var15) {
        assert module0623.NIL != f38280(var15) : var15;
        return f38285(var15);
    }
    
    public static SubLObject f38313(final SubLObject var20, final SubLObject var15) {
        assert module0623.NIL != f38280(var15) : var15;
        f38295(var15, var20);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38314(final SubLObject var15) {
        assert module0623.NIL != f38280(var15) : var15;
        return f38286(var15);
    }
    
    public static SubLObject f38315(final SubLObject var21, final SubLObject var15) {
        assert module0623.NIL != f38280(var15) : var15;
        f38296(var15, var21);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38316(final SubLObject var15) {
        assert module0623.NIL != f38280(var15) : var15;
        return f38287(var15);
    }
    
    public static SubLObject f38317(final SubLObject var22, final SubLObject var15) {
        assert module0623.NIL != f38280(var15) : var15;
        f38297(var15, var22);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38318(final SubLObject var15) {
        assert module0623.NIL != f38280(var15) : var15;
        return f38288(var15);
    }
    
    public static SubLObject f38319(final SubLObject var23, final SubLObject var15) {
        assert module0623.NIL != f38280(var15) : var15;
        f38298(var15, var23);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38320(final SubLObject var15) {
        assert module0623.NIL != f38280(var15) : var15;
        return f38289(var15);
    }
    
    public static SubLObject f38321(final SubLObject var24, final SubLObject var15) {
        assert module0623.NIL != f38280(var15) : var15;
        f38299(var15, var24);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38322(final SubLObject var15) {
        assert module0623.NIL != f38280(var15) : var15;
        return f38290(var15);
    }
    
    public static SubLObject f38323(final SubLObject var25, final SubLObject var15) {
        assert module0623.NIL != Types.stringp(var25) : var25;
        assert module0623.NIL != f38280(var15) : var15;
        f38300(var15, var25);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38279(final SubLObject var15, final SubLObject var4, final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        assert module0623.NIL != f38280(var15) : var15;
        assert module0623.NIL != Types.streamp(var4) : var4;
        streams_high.terpri(var4);
        if (module0623.NIL != print_high.$print_readably$.getDynamicValue(var27)) {
            print_high.print_not_readable(var15, var4);
        }
        else {
            streams_high.write_string((SubLObject)module0623.$ic51$, var4, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var15), new SubLObject[] { module0623.$ic52$, var4 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var4);
            streams_high.write_string((SubLObject)module0623.$ic53$, var4, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED);
            print_high.princ(f38281(var15), var4);
            streams_high.write_string((SubLObject)module0623.$ic54$, var4, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED);
            print_high.princ(f38282(var15), var4);
            streams_high.write_string((SubLObject)module0623.$ic55$, var4, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED);
            print_high.princ(f38283(var15), var4);
            streams_high.write_string((SubLObject)module0623.$ic56$, var4, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED);
            print_high.princ(f38284(var15), var4);
            streams_high.write_string((SubLObject)module0623.$ic57$, var4, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED);
            print_high.princ(f38285(var15), var4);
            streams_high.terpri(var4);
            streams_high.write_string((SubLObject)module0623.$ic58$, var4, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED);
            print_high.princ(f38286(var15), var4);
            streams_high.terpri(var4);
            streams_high.write_string((SubLObject)module0623.$ic59$, var4, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED);
            print_high.princ(f38287(var15), var4);
            streams_high.terpri(var4);
            streams_high.write_string((SubLObject)module0623.$ic60$, var4, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED);
            print_high.princ(f38288(var15), var4);
            streams_high.terpri(var4);
            streams_high.write_string((SubLObject)module0623.$ic61$, var4, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED);
            print_high.princ(f38289(var15), var4);
            streams_high.write_char((SubLObject)Characters.CHAR_space, var4);
            PrintLow.write(Equality.pointer(var15), new SubLObject[] { module0623.$ic52$, var4, module0623.$ic62$, module0623.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var4);
        }
        return var15;
    }
    
    public static SubLObject f38324(final SubLObject var3, final SubLObject var4) {
        compatibility.default_struct_print_function(var3, var4, (SubLObject)module0623.ZERO_INTEGER);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38325(final SubLObject var3) {
        return (SubLObject)((var3.getClass() == $sX41866_native.class) ? module0623.T : module0623.NIL);
    }
    
    public static SubLObject f38326(final SubLObject var3) {
        assert module0623.NIL != f38325(var3) : var3;
        return var3.getField2();
    }
    
    public static SubLObject f38327(final SubLObject var3) {
        assert module0623.NIL != f38325(var3) : var3;
        return var3.getField3();
    }
    
    public static SubLObject f38328(final SubLObject var3) {
        assert module0623.NIL != f38325(var3) : var3;
        return var3.getField4();
    }
    
    public static SubLObject f38329(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38325(var3) : var3;
        return var3.setField2(var6);
    }
    
    public static SubLObject f38330(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38325(var3) : var3;
        return var3.setField3(var6);
    }
    
    public static SubLObject f38331(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38325(var3) : var3;
        return var3.setField4(var6);
    }
    
    public static SubLObject f38332(SubLObject var7) {
        if (var7 == module0623.UNPROVIDED) {
            var7 = (SubLObject)module0623.NIL;
        }
        final SubLObject var8 = (SubLObject)new $sX41866_native();
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        for (var9 = (SubLObject)module0623.NIL, var9 = var7; module0623.NIL != var9; var9 = conses_high.cddr(var9)) {
            var10 = var9.first();
            var11 = conses_high.cadr(var9);
            var12 = var10;
            if (var12.eql((SubLObject)module0623.$ic78$)) {
                f38329(var8, var11);
            }
            else if (var12.eql((SubLObject)module0623.$ic79$)) {
                f38330(var8, var11);
            }
            else if (var12.eql((SubLObject)module0623.$ic80$)) {
                f38331(var8, var11);
            }
            else {
                Errors.error((SubLObject)module0623.$ic42$, var10);
            }
        }
        return var8;
    }
    
    public static SubLObject f38333(final SubLObject var13, final SubLObject var14) {
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic43$, (SubLObject)module0623.$ic81$, (SubLObject)module0623.THREE_INTEGER);
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic78$, f38326(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic79$, f38327(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic80$, f38328(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic46$, (SubLObject)module0623.$ic81$, (SubLObject)module0623.THREE_INTEGER);
        return var13;
    }
    
    public static SubLObject f38334(final SubLObject var13, final SubLObject var14) {
        return f38333(var13, var14);
    }
    
    public static SubLObject f38335(final SubLObject var33, final SubLObject var15, final SubLObject var34) {
        assert module0623.NIL != Types.booleanp(var34) : var34;
        final SubLObject var35 = f38332((SubLObject)module0623.UNPROVIDED);
        f38329(var35, var33);
        f38330(var35, var15);
        f38331(var35, var34);
        return var35;
    }
    
    public static SubLObject f38336(final SubLObject var36) {
        return f38283(f38327(var36));
    }
    
    public static SubLObject f38337(final SubLObject var3, final SubLObject var4) {
        f38338(var3, var4, (SubLObject)module0623.ZERO_INTEGER);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38339(final SubLObject var3) {
        return (SubLObject)((var3.getClass() == $sX41868_native.class) ? module0623.T : module0623.NIL);
    }
    
    public static SubLObject f38340(final SubLObject var3) {
        assert module0623.NIL != f38339(var3) : var3;
        return var3.getField2();
    }
    
    public static SubLObject f38341(final SubLObject var3) {
        assert module0623.NIL != f38339(var3) : var3;
        return var3.getField3();
    }
    
    public static SubLObject f38342(final SubLObject var3) {
        assert module0623.NIL != f38339(var3) : var3;
        return var3.getField4();
    }
    
    public static SubLObject f38343(final SubLObject var3) {
        assert module0623.NIL != f38339(var3) : var3;
        return var3.getField5();
    }
    
    public static SubLObject f38344(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38339(var3) : var3;
        return var3.setField2(var6);
    }
    
    public static SubLObject f38345(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38339(var3) : var3;
        return var3.setField3(var6);
    }
    
    public static SubLObject f38346(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38339(var3) : var3;
        return var3.setField4(var6);
    }
    
    public static SubLObject f38347(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38339(var3) : var3;
        return var3.setField5(var6);
    }
    
    public static SubLObject f38348(SubLObject var7) {
        if (var7 == module0623.UNPROVIDED) {
            var7 = (SubLObject)module0623.NIL;
        }
        final SubLObject var8 = (SubLObject)new $sX41868_native();
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        for (var9 = (SubLObject)module0623.NIL, var9 = var7; module0623.NIL != var9; var9 = conses_high.cddr(var9)) {
            var10 = var9.first();
            var11 = conses_high.cadr(var9);
            var12 = var10;
            if (var12.eql((SubLObject)module0623.$ic101$)) {
                f38344(var8, var11);
            }
            else if (var12.eql((SubLObject)module0623.$ic102$)) {
                f38345(var8, var11);
            }
            else if (var12.eql((SubLObject)module0623.$ic103$)) {
                f38346(var8, var11);
            }
            else if (var12.eql((SubLObject)module0623.$ic79$)) {
                f38347(var8, var11);
            }
            else {
                Errors.error((SubLObject)module0623.$ic42$, var10);
            }
        }
        return var8;
    }
    
    public static SubLObject f38349(final SubLObject var13, final SubLObject var14) {
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic43$, (SubLObject)module0623.$ic104$, (SubLObject)module0623.FOUR_INTEGER);
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic101$, f38340(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic102$, f38341(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic103$, f38342(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic79$, f38343(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic46$, (SubLObject)module0623.$ic104$, (SubLObject)module0623.FOUR_INTEGER);
        return var13;
    }
    
    public static SubLObject f38350(final SubLObject var13, final SubLObject var14) {
        return f38349(var13, var14);
    }
    
    public static SubLObject f38338(final SubLObject var40, final SubLObject var4, final SubLObject var26) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (module0623.NIL != print_high.$print_readably$.getDynamicValue(var41)) {
            print_high.print_not_readable(var40, var4);
        }
        else {
            streams_high.write_string((SubLObject)module0623.$ic51$, var4, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var40), new SubLObject[] { module0623.$ic52$, var4 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var4);
            streams_high.write_string((SubLObject)module0623.$ic106$, var4, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED);
            print_high.princ(f38340(var40), var4);
            streams_high.terpri(var4);
            streams_high.write_string((SubLObject)module0623.$ic107$, var4, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED);
            print_high.princ(f38341(var40), var4);
            streams_high.terpri(var4);
            streams_high.write_string((SubLObject)module0623.$ic108$, var4, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED);
            print_high.princ(Threads.process_whostate(f38341(var40)), var4);
            streams_high.write_string((SubLObject)module0623.$ic109$, var4, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED);
            print_high.princ(f38342(var40), var4);
            streams_high.terpri(var4);
            if (module0623.NIL != f38343(var40)) {
                streams_high.write_string((SubLObject)module0623.$ic59$, var4, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED);
                module0194.f12114(f38287(f38343(var40)), var4, (SubLObject)module0623.UNPROVIDED);
                streams_high.terpri(var4);
                if (module0623.NIL != f38288(f38343(var40))) {
                    streams_high.write_string((SubLObject)module0623.$ic110$, var4, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED);
                    module0194.f12114(f38288(f38343(var40)), var4, (SubLObject)module0623.UNPROVIDED);
                    streams_high.terpri(var4);
                }
            }
            streams_high.write_char((SubLObject)Characters.CHAR_space, var4);
            PrintLow.write(Equality.pointer(var40), new SubLObject[] { module0623.$ic52$, var4, module0623.$ic62$, module0623.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var4);
        }
        return var40;
    }
    
    public static SubLObject f38351(final SubLObject var3, final SubLObject var4) {
        f38352(var3, var4, (SubLObject)module0623.ZERO_INTEGER);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38353(final SubLObject var3) {
        return (SubLObject)((var3.getClass() == $sX41870_native.class) ? module0623.T : module0623.NIL);
    }
    
    public static SubLObject f38354(final SubLObject var3) {
        assert module0623.NIL != f38353(var3) : var3;
        return var3.getField2();
    }
    
    public static SubLObject f38355(final SubLObject var3) {
        assert module0623.NIL != f38353(var3) : var3;
        return var3.getField3();
    }
    
    public static SubLObject f38356(final SubLObject var3) {
        assert module0623.NIL != f38353(var3) : var3;
        return var3.getField4();
    }
    
    public static SubLObject f38357(final SubLObject var3) {
        assert module0623.NIL != f38353(var3) : var3;
        return var3.getField5();
    }
    
    public static SubLObject f38358(final SubLObject var3) {
        assert module0623.NIL != f38353(var3) : var3;
        return var3.getField6();
    }
    
    public static SubLObject f38359(final SubLObject var3) {
        assert module0623.NIL != f38353(var3) : var3;
        return var3.getField7();
    }
    
    public static SubLObject f38360(final SubLObject var3) {
        assert module0623.NIL != f38353(var3) : var3;
        return var3.getField8();
    }
    
    public static SubLObject f38361(final SubLObject var3) {
        assert module0623.NIL != f38353(var3) : var3;
        return var3.getField9();
    }
    
    public static SubLObject f38362(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38353(var3) : var3;
        return var3.setField2(var6);
    }
    
    public static SubLObject f38363(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38353(var3) : var3;
        return var3.setField3(var6);
    }
    
    public static SubLObject f38364(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38353(var3) : var3;
        return var3.setField4(var6);
    }
    
    public static SubLObject f38365(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38353(var3) : var3;
        return var3.setField5(var6);
    }
    
    public static SubLObject f38366(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38353(var3) : var3;
        return var3.setField6(var6);
    }
    
    public static SubLObject f38367(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38353(var3) : var3;
        return var3.setField7(var6);
    }
    
    public static SubLObject f38368(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38353(var3) : var3;
        return var3.setField8(var6);
    }
    
    public static SubLObject f38369(final SubLObject var3, final SubLObject var6) {
        assert module0623.NIL != f38353(var3) : var3;
        return var3.setField9(var6);
    }
    
    public static SubLObject f38370(SubLObject var7) {
        if (var7 == module0623.UNPROVIDED) {
            var7 = (SubLObject)module0623.NIL;
        }
        final SubLObject var8 = (SubLObject)new $sX41870_native();
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        for (var9 = (SubLObject)module0623.NIL, var9 = var7; module0623.NIL != var9; var9 = conses_high.cddr(var9)) {
            var10 = var9.first();
            var11 = conses_high.cadr(var9);
            var12 = var10;
            if (var12.eql((SubLObject)module0623.$ic136$)) {
                f38362(var8, var11);
            }
            else if (var12.eql((SubLObject)module0623.$ic137$)) {
                f38363(var8, var11);
            }
            else if (var12.eql((SubLObject)module0623.$ic138$)) {
                f38364(var8, var11);
            }
            else if (var12.eql((SubLObject)module0623.$ic139$)) {
                f38365(var8, var11);
            }
            else if (var12.eql((SubLObject)module0623.$ic140$)) {
                f38366(var8, var11);
            }
            else if (var12.eql((SubLObject)module0623.$ic141$)) {
                f38367(var8, var11);
            }
            else if (var12.eql((SubLObject)module0623.$ic142$)) {
                f38368(var8, var11);
            }
            else if (var12.eql((SubLObject)module0623.$ic143$)) {
                f38369(var8, var11);
            }
            else {
                Errors.error((SubLObject)module0623.$ic42$, var10);
            }
        }
        return var8;
    }
    
    public static SubLObject f38371(final SubLObject var13, final SubLObject var14) {
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic43$, (SubLObject)module0623.$ic144$, (SubLObject)module0623.EIGHT_INTEGER);
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic136$, f38354(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic137$, f38355(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic138$, f38356(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic139$, f38357(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic140$, f38358(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic141$, f38359(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic142$, f38360(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic45$, (SubLObject)module0623.$ic143$, f38361(var13));
        Functions.funcall(var14, var13, (SubLObject)module0623.$ic46$, (SubLObject)module0623.$ic144$, (SubLObject)module0623.EIGHT_INTEGER);
        return var13;
    }
    
    public static SubLObject f38372(final SubLObject var13, final SubLObject var14) {
        return f38371(var13, var14);
    }
    
    public static SubLObject f38352(final SubLObject var47, final SubLObject var4, final SubLObject var26) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        if (module0623.NIL != print_high.$print_readably$.getDynamicValue(var48)) {
            print_high.print_not_readable(var47, var4);
        }
        else {
            streams_high.write_string((SubLObject)module0623.$ic51$, var4, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var47), new SubLObject[] { module0623.$ic52$, var4 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var4);
            streams_high.write_string((SubLObject)module0623.$ic146$, var4, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED);
            print_high.princ(f38355(var47), var4);
            streams_high.terpri(var4);
            streams_high.write_string((SubLObject)module0623.$ic147$, var4, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED);
            print_high.princ(f38357(var47), var4);
            streams_high.terpri(var4);
            streams_high.write_string((SubLObject)module0623.$ic148$, var4, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED);
            print_high.princ(f38373(var47), var4);
            streams_high.terpri(var4);
            streams_high.write_string((SubLObject)module0623.$ic149$, var4, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED);
            print_high.princ(f38374(var47), var4);
            streams_high.terpri(var4);
            streams_high.write_string((SubLObject)module0623.$ic150$, var4, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED);
            print_high.princ(f38375(var47), var4);
            streams_high.terpri(var4);
            streams_high.write_char((SubLObject)Characters.CHAR_space, var4);
            PrintLow.write(Equality.pointer(var47), new SubLObject[] { module0623.$ic52$, var4, module0623.$ic62$, module0623.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var4);
        }
        return var47;
    }
    
    public static SubLObject f38376(final SubLObject var47, SubLObject var4) {
        if (var4 == module0623.UNPROVIDED) {
            var4 = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert module0623.NIL != f38353(var47) : var47;
        assert module0623.NIL != Types.streamp(var4) : var4;
        if (module0623.NIL != f38357(var47)) {
            SubLObject var48 = f38357(var47);
            SubLObject var49 = (SubLObject)module0623.NIL;
            var49 = var48.first();
            while (module0623.NIL != var48) {
                print_high.print(var49, var4);
                var48 = var48.rest();
                var49 = var48.first();
            }
        }
        else {
            print_high.princ((SubLObject)module0623.$ic151$, var4);
            streams_high.terpri(var4);
        }
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38377(SubLObject var4) {
        if (var4 == module0623.UNPROVIDED) {
            var4 = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject var5 = Threads.all_processes();
        SubLObject var6 = (SubLObject)module0623.NIL;
        var6 = var5.first();
        while (module0623.NIL != var5) {
            final SubLObject var7 = f38378(var6);
            final SubLObject var8 = (SubLObject)((module0623.NIL != var7) ? f38357(var7) : module0623.NIL);
            SubLObject var9 = (SubLObject)module0623.NIL;
            if (module0623.NIL == var9) {
                SubLObject var10 = var8;
                SubLObject var11 = (SubLObject)module0623.NIL;
                var11 = var10.first();
                while (module0623.NIL == var9 && module0623.NIL != var10) {
                    if (f38341(var11).equal(var6) && module0623.NIL != f38343(var11) && module0623.NIL != f38287(f38343(var11))) {
                        var9 = (SubLObject)module0623.T;
                        PrintLow.format(var4, (SubLObject)module0623.$ic152$, var6);
                        PrintLow.format(var4, (SubLObject)module0623.$ic153$, f38287(f38343(var11)));
                    }
                    var10 = var10.rest();
                    var11 = var10.first();
                }
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38379(final SubLObject var47) {
        if (module0623.NIL == f38353(var47)) {
            return (SubLObject)module0623.NIL;
        }
        return Types.listp(f38357(var47));
    }
    
    public static SubLObject f38380(final SubLObject var47) {
        assert module0623.NIL != f38353(var47) : var47;
        return f38354(var47);
    }
    
    public static SubLObject f38381(final SubLObject var58, final SubLObject var47) {
        assert module0623.NIL != Types.lock_p(var58) : var58;
        assert module0623.NIL != f38353(var47) : var47;
        f38362(var47, var58);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38382(final SubLObject var47) {
        assert module0623.NIL != f38353(var47) : var47;
        return f38355(var47);
    }
    
    public static SubLObject f38383(final SubLObject var59, final SubLObject var47) {
        assert module0623.NIL != module0055.f4044(var59) : var59;
        assert module0623.NIL != f38353(var47) : var47;
        f38363(var47, var59);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38384(final SubLObject var47) {
        assert module0623.NIL != f38353(var47) : var47;
        return f38357(var47);
    }
    
    public static SubLObject f38385(final SubLObject var47) {
        assert module0623.NIL != f38353(var47) : var47;
        return Sequences.length(f38357(var47));
    }
    
    public static SubLObject f38386(final SubLObject var40, final SubLObject var47) {
        assert module0623.NIL != f38339(var40) : var40;
        assert module0623.NIL != f38353(var47) : var47;
        SubLObject var48 = f38357(var47);
        var48 = (SubLObject)ConsesLow.cons(var40, var48);
        f38365(var47, var48);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38387(final SubLObject var60, final SubLObject var47) {
        assert module0623.NIL != Types.listp(var60) : var60;
        assert module0623.NIL != f38353(var47) : var47;
        f38365(var47, var60);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38388(final SubLObject var61) {
        assert module0623.NIL != Types.stringp(var61) : var61;
        module0623.$g4777$.setGlobalValue(var61);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38389(final SubLObject var62, final SubLObject var47) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        assert module0623.NIL != Types.stringp(var62) : var62;
        if (module0623.NIL != var47 && !module0623.areAssertionsDisabledFor(me) && module0623.NIL == f38353(var47)) {
            throw new AssertionError(var47);
        }
        if (module0623.NIL == module0623.$g4779$.getGlobalValue()) {
            module0623.$g4779$.setGlobalValue(Locks.make_lock((SubLObject)module0623.$ic159$));
        }
        final SubLObject var64 = module0623.$g4779$.getGlobalValue();
        SubLObject var65 = (SubLObject)module0623.NIL;
        try {
            var65 = Locks.seize_lock(var64);
            if (module0623.NIL != module0623.$g4777$.getGlobalValue()) {
                if (module0623.NIL == Errors.$ignore_mustsP$.getDynamicValue(var63) && !module0623.$g4777$.getGlobalValue().isString()) {
                    Errors.error((SubLObject)module0623.$ic160$, module0623.$g4777$.getGlobalValue());
                }
                if (module0623.NIL == module0623.$g4778$.getGlobalValue()) {
                    module0623.$g4778$.setGlobalValue(StreamsLow.open(module0623.$g4777$.getGlobalValue(), new SubLObject[] { module0623.$ic161$, module0623.$ic162$, module0623.$ic163$, module0623.$ic164$, module0623.$ic165$, module0623.$ic166$ }));
                }
                print_high.princ((SubLObject)module0623.$ic167$, module0623.$g4778$.getGlobalValue());
                print_high.princ(Threads.process_name(Threads.current_process()), module0623.$g4778$.getGlobalValue());
                print_high.princ((SubLObject)module0623.$ic168$, module0623.$g4778$.getGlobalValue());
                streams_high.terpri(module0623.$g4778$.getGlobalValue());
                print_high.princ((SubLObject)module0623.$ic169$, module0623.$g4778$.getGlobalValue());
                print_high.princ(var62, module0623.$g4778$.getGlobalValue());
                streams_high.terpri(module0623.$g4778$.getGlobalValue());
                streams_high.force_output(module0623.$g4778$.getGlobalValue());
            }
            else if (module0623.NIL != var47) {
                SubLObject var66 = (SubLObject)module0623.NIL;
                var66 = f38358(var47);
                var66 = (SubLObject)ConsesLow.cons(Sequences.cconcatenate(module0051.f3552((SubLObject)module0623.UNPROVIDED), new SubLObject[] { module0623.$ic170$, var62 }), var66);
                f38366(var47, var66);
            }
        }
        finally {
            if (module0623.NIL != var65) {
                Locks.release_lock(var64);
            }
        }
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38390(final SubLObject var47) {
        assert module0623.NIL != f38353(var47) : var47;
        SubLObject var48 = Sequences.nreverse(f38358(var47));
        SubLObject var49 = (SubLObject)module0623.NIL;
        var49 = var48.first();
        while (module0623.NIL != var48) {
            print_high.princ(var49, (SubLObject)module0623.UNPROVIDED);
            var48 = var48.rest();
            var49 = var48.first();
        }
        f38366(var47, (SubLObject)module0623.NIL);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38391(final SubLObject var66) {
        assert module0623.NIL != Types.stringp(var66) : var66;
        f38390(f38392(var66));
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38393(final SubLObject var67, final SubLObject var47) {
        assert module0623.NIL != Types.stringp(var67) : var67;
        assert module0623.NIL != f38353(var47) : var47;
        f38367(var47, var67);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38373(final SubLObject var47) {
        assert module0623.NIL != f38353(var47) : var47;
        return f38359(var47);
    }
    
    public static SubLObject f38394(final SubLObject var68, final SubLObject var47) {
        assert module0623.NIL != Types.integerp(var68) : var68;
        assert module0623.NIL != f38353(var47) : var47;
        f38368(var47, var68);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38374(final SubLObject var47) {
        assert module0623.NIL != f38353(var47) : var47;
        return f38360(var47);
    }
    
    public static SubLObject f38395(final SubLObject var69, final SubLObject var47) {
        assert module0623.NIL != Types.integerp(var69) : var69;
        assert module0623.NIL != f38353(var47) : var47;
        f38369(var47, var69);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38375(final SubLObject var47) {
        assert module0623.NIL != f38353(var47) : var47;
        return f38361(var47);
    }
    
    public static SubLObject f38396(final SubLObject var47) {
        return Sequences.length(f38357(var47));
    }
    
    public static SubLObject f38397(final SubLObject var21, final SubLObject var70, final SubLObject var71) {
        final SubLThread var72 = SubLProcess.currentSubLThread();
        SubLObject var73 = (SubLObject)module0623.NIL;
        SubLObject var74 = (SubLObject)module0623.NIL;
        final SubLObject var75 = module0623.$g4780$.currentBinding(var72);
        try {
            module0623.$g4780$.bind((SubLObject)module0623.NIL, var72);
            var74 = (SubLObject)ConsesLow.list((SubLObject)module0623.$ic171$, ConsesLow.append(var21, (SubLObject)module0623.NIL), (SubLObject)ConsesLow.list((SubLObject)module0623.$ic172$, (SubLObject)module0623.$ic173$, var70));
            if (Symbols.symbol_function((SubLObject)module0623.$ic174$).eql(var71)) {
                module0112.f7688(var74);
            }
            else if (Symbols.symbol_function((SubLObject)module0623.$ic175$).eql(var71)) {
                Eval.eval(var74);
            }
            else {
                Functions.funcall(var71, var74);
            }
            var73 = module0623.$g4780$.getDynamicValue(var72);
        }
        finally {
            module0623.$g4780$.rebind(var75, var72);
        }
        return var73;
    }
    
    public static SubLObject f38378(final SubLObject var52) {
        assert module0623.NIL != Types.processp(var52) : var52;
        return module0084.f5831(module0623.$g4781$.getGlobalValue(), var52, (SubLObject)module0623.UNPROVIDED);
    }
    
    public static SubLObject f38398(final SubLObject var52, final SubLObject var47) {
        assert module0623.NIL != Types.processp(var52) : var52;
        assert module0623.NIL != f38353(var47) : var47;
        return module0084.f5829(module0623.$g4781$.getGlobalValue(), var52, var47);
    }
    
    public static SubLObject f38399(final SubLObject var52) {
        assert module0623.NIL != Types.processp(var52) : var52;
        return module0084.f5830(module0623.$g4781$.getGlobalValue(), var52);
    }
    
    public static SubLObject f38400() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0623.$g4782$.getGlobalValue();
        SubLObject var3 = (SubLObject)module0623.NIL;
        try {
            var3 = Locks.seize_lock(var2);
            if (module0623.NIL == module0089.f6045(module0623.$g4783$.getGlobalValue())) {
                module0623.$g4783$.setGlobalValue(module0089.f6070(module0623.$g4784$.getDynamicValue(var1), Symbols.symbol_function((SubLObject)module0623.EQUAL)));
            }
        }
        finally {
            if (module0623.NIL != var3) {
                Locks.release_lock(var2);
            }
        }
        return module0623.$g4783$.getGlobalValue();
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
        SubLObject var19 = (SubLObject)module0623.NIL;
        final SubLObject var20 = module0623.$g4782$.getGlobalValue();
        SubLObject var21 = (SubLObject)module0623.NIL;
        try {
            var21 = Locks.seize_lock(var20);
            f38400();
            var16.resetMultipleValues();
            final SubLObject var22 = module0089.f6077(module0623.$g4783$.getGlobalValue(), var17);
            final SubLObject var23 = var16.secondMultipleValue();
            var16.resetMultipleValues();
            if (module0623.NIL == var23) {
                module0089.f6082(module0623.$g4783$.getGlobalValue(), var17, var18);
            }
            else {
                var19 = var22;
            }
        }
        finally {
            if (module0623.NIL != var21) {
                Locks.release_lock(var20);
            }
        }
        return var19;
    }
    
    public static SubLObject f38405(final SubLObject var15) {
        final SubLObject var16 = f38401(var15);
        final SubLObject var17 = module0623.$g4782$.getGlobalValue();
        SubLObject var18 = (SubLObject)module0623.NIL;
        try {
            var18 = Locks.seize_lock(var17);
            if (module0623.NIL != module0089.f6045(module0623.$g4783$.getGlobalValue())) {
                module0089.f6087(module0623.$g4783$.getGlobalValue(), var16);
            }
        }
        finally {
            if (module0623.NIL != var18) {
                Locks.release_lock(var17);
            }
        }
        return var15;
    }
    
    public static SubLObject f38406(final SubLObject var86) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var86.isKeyword() && (var86 == module0623.$ic178$ || var86 == module0623.$ic179$));
    }
    
    public static SubLObject f38407(final SubLObject var76, final SubLObject var87, final SubLObject var86) {
        final SubLThread var88 = SubLProcess.currentSubLThread();
        assert module0623.NIL != f38406(var86) : var86;
        final SubLObject var89 = f38402(var76, var87);
        final SubLObject var90 = module0623.$g4782$.getGlobalValue();
        SubLObject var91 = (SubLObject)module0623.NIL;
        try {
            var91 = Locks.seize_lock(var90);
            f38400();
            var88.resetMultipleValues();
            final SubLObject var92 = module0089.f6077(module0623.$g4783$.getGlobalValue(), var89);
            final SubLObject var93 = var88.secondMultipleValue();
            var88.resetMultipleValues();
            if (module0623.NIL != var93) {
                f38408(var92, var86, var76, var87);
            }
            else {
                module0089.f6082(module0623.$g4783$.getGlobalValue(), var89, var86);
            }
        }
        finally {
            if (module0623.NIL != var91) {
                Locks.release_lock(var90);
            }
        }
        return var86;
    }
    
    public static SubLObject f38409(final SubLObject var87) {
        final SubLThread var88 = SubLProcess.currentSubLThread();
        final SubLObject var89 = module0623.$g4782$.getGlobalValue();
        SubLObject var90 = (SubLObject)module0623.NIL;
        try {
            var90 = Locks.seize_lock(var89);
            if (module0623.NIL != module0089.f6045(module0623.$g4783$.getGlobalValue())) {
                final SubLObject var91 = module0623.$g4783$.getGlobalValue();
                final SubLObject var92 = (SubLObject)module0623.$ic181$;
                SubLObject var93 = module0089.f6097(var91, var92);
                SubLObject var94 = (SubLObject)module0623.NIL;
                SubLObject var95 = (SubLObject)module0623.NIL;
                while (module0623.NIL == module0089.f6098(var91, var93)) {
                    var94 = module0089.f6099(var93);
                    var95 = module0089.f6100(var93);
                    var93 = module0089.f6101(var93, var92);
                    final SubLObject var96 = f38403(var94);
                    if (var96.equal(var87) && module0623.NIL != Threads.valid_process_p(var95)) {
                        SubLObject var97 = (SubLObject)module0623.NIL;
                        try {
                            var88.throwStack.push(module0623.$ic182$);
                            final SubLObject var98 = Errors.$error_handler$.currentBinding(var88);
                            try {
                                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0623.$ic183$), var88);
                                try {
                                    f38408(var95, (SubLObject)module0623.$ic178$, (SubLObject)module0623.MINUS_ONE_INTEGER, var87);
                                }
                                catch (Throwable var99) {
                                    Errors.handleThrowable(var99, (SubLObject)module0623.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(var98, var88);
                            }
                        }
                        catch (Throwable var100) {
                            var97 = Errors.handleThrowable(var100, (SubLObject)module0623.$ic182$);
                        }
                        finally {
                            var88.throwStack.pop();
                        }
                    }
                }
            }
        }
        finally {
            if (module0623.NIL != var90) {
                Locks.release_lock(var89);
            }
        }
        return var87;
    }
    
    public static SubLObject f38408(final SubLObject var52, final SubLObject var86, final SubLObject var76, final SubLObject var87) {
        if (var86.eql((SubLObject)module0623.$ic178$)) {
            module0004.f80(var52, Symbols.symbol_function((SubLObject)module0623.$ic184$), (SubLObject)ConsesLow.list(var76, var87));
        }
        else if (var86.eql((SubLObject)module0623.$ic179$)) {
            module0004.f80(var52, Symbols.symbol_function((SubLObject)module0623.$ic185$), (SubLObject)ConsesLow.list(var76, var87));
        }
        else {
            Errors.error((SubLObject)module0623.$ic186$, var86);
        }
        return var86;
    }
    
    public static SubLObject f38410(final SubLObject var76, final SubLObject var100) {
        final SubLObject var101 = f38411();
        if (module0623.NIL == var101) {
            return (SubLObject)module0623.NIL;
        }
        if (!var100.equal(f38285(var101))) {
            return (SubLObject)module0623.NIL;
        }
        if (var76.numGE((SubLObject)module0623.ZERO_INTEGER) && !var76.eql(f38282(var101))) {
            return (SubLObject)module0623.NIL;
        }
        Dynamic.sublisp_throw((SubLObject)module0623.$ic187$, (SubLObject)module0623.$ic178$);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38412(final SubLObject var76, final SubLObject var100) {
        final SubLObject var101 = f38411();
        if (module0623.NIL == var101) {
            return (SubLObject)module0623.NIL;
        }
        if (!var100.equal(f38285(var101))) {
            return (SubLObject)module0623.NIL;
        }
        if (var76.numGE((SubLObject)module0623.ZERO_INTEGER) && !var76.eql(f38282(var101))) {
            return (SubLObject)module0623.NIL;
        }
        Dynamic.sublisp_throw((SubLObject)module0623.$ic187$, (SubLObject)module0623.$ic179$);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38413(final SubLObject var101, final SubLObject var102) {
        SubLObject var104;
        final SubLObject var103 = var104 = var101.rest();
        SubLObject var105 = (SubLObject)module0623.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var104, var103, (SubLObject)module0623.$ic188$);
        var105 = var104.first();
        final SubLObject var106;
        var104 = (var106 = var104.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0623.$ic189$, (SubLObject)module0623.$ic187$, var105, reader.bq_cons((SubLObject)module0623.$ic190$, ConsesLow.append(var106, (SubLObject)module0623.NIL)));
    }
    
    public static SubLObject f38414(final SubLObject var101, final SubLObject var102) {
        final SubLObject var103 = var101.rest();
        final SubLObject var105;
        final SubLObject var104 = var105 = var103;
        final SubLObject var106 = (SubLObject)module0623.$ic193$;
        return (SubLObject)ConsesLow.list((SubLObject)module0623.$ic191$, var106, reader.bq_cons((SubLObject)module0623.$ic190$, ConsesLow.append(var105, (SubLObject)module0623.NIL)));
    }
    
    public static SubLObject f38411() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0623.$g4787$.getDynamicValue(var1);
    }
    
    public static SubLObject f38415() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (module0623.NIL != module0623.$g4787$.getDynamicValue(var1)) {
            return f38312(module0623.$g4787$.getDynamicValue(var1));
        }
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38416(final SubLObject var18) {
        return Numbers.max(Threads.$process_min_priority$.getGlobalValue(), Numbers.min(var18, Threads.$process_max_priority$.getGlobalValue()));
    }
    
    public static SubLObject f38417() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        for (SubLObject var2 = f38378(Threads.current_process()); module0623.NIL == var2; var2 = f38378(Threads.current_process())) {
            Threads.sleep((SubLObject)module0623.$ic197$);
        }
        SubLObject var3 = (SubLObject)module0623.NIL;
        try {
            var1.throwStack.push(module0623.$ic198$);
            final SubLObject var4 = f38378(Threads.current_process());
            final SubLObject var5 = f38418(Threads.process_name(Threads.current_process()), var4);
            SubLObject var6 = (SubLObject)module0623.NIL;
            SubLObject var7 = (SubLObject)module0623.NIL;
            SubLObject var8 = (SubLObject)module0623.NIL;
            SubLObject var9 = (SubLObject)module0623.NIL;
            final SubLObject var10 = (SubLObject)module0623.NIL;
            SubLObject var11 = (SubLObject)module0623.NIL;
            SubLObject var12 = (SubLObject)module0623.NIL;
            if (module0623.NIL == Errors.$ignore_mustsP$.getDynamicValue(var1) && module0623.NIL == f38339(var5)) {
                Errors.error((SubLObject)module0623.$ic199$);
            }
            if (module0623.NIL == Errors.$ignore_mustsP$.getDynamicValue(var1) && module0623.NIL == f38353(var4)) {
                Errors.error((SubLObject)module0623.$ic200$);
            }
            while (true) {
                var7 = (SubLObject)module0623.NIL;
                var9 = (SubLObject)module0623.NIL;
                var11 = (SubLObject)module0623.NIL;
                try {
                    var1.throwStack.push(module0623.$ic187$);
                    f38346(var5, (SubLObject)module0623.NIL);
                    Semaphores.semaphore_wait(f38356(var4));
                    final SubLObject var13 = f38380(var4);
                    SubLObject var14 = (SubLObject)module0623.NIL;
                    try {
                        var14 = Locks.seize_lock(var13);
                        var7 = module0055.f4068(f38355(var4), (SubLObject)module0623.UNPROVIDED);
                    }
                    finally {
                        if (module0623.NIL != var14) {
                            Locks.release_lock(var13);
                        }
                    }
                    if (module0623.$g4770$.getDynamicValue(var1).numG((SubLObject)module0623.TWO_INTEGER)) {
                        f38389(PrintLow.format((SubLObject)module0623.NIL, (SubLObject)module0623.$ic201$, var7), var4);
                    }
                    var8 = f38287(var7);
                    f38300(var7, f38340(var5));
                    f38347(var5, var7);
                    var6 = module0067.f4884(module0623.$g4785$.getGlobalValue(), f38281(var7), (SubLObject)module0623.UNPROVIDED);
                    try {
                        final SubLObject var15 = module0623.$g4787$.currentBinding(var1);
                        try {
                            module0623.$g4787$.bind(var7, var1);
                            SubLObject var16 = f38404(var7);
                            final SubLObject var17 = f38308(var7);
                            Threads.set_process_priority(Threads.current_process(), f38416(var17));
                            if (module0623.NIL == var16) {
                                try {
                                    var1.throwStack.push(module0623.$ic187$);
                                    try {
                                        var1.throwStack.push(module0003.$g3$.getGlobalValue());
                                        final SubLObject var73_115 = Errors.$error_handler$.currentBinding(var1);
                                        try {
                                            Errors.$error_handler$.bind((SubLObject)module0623.$ic202$, var1);
                                            try {
                                                var9 = f38397(f38286(var7), var8, var6);
                                            }
                                            catch (Throwable var98_116) {
                                                Errors.handleThrowable(var98_116, (SubLObject)module0623.NIL);
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
                                    var16 = Errors.handleThrowable(var18, (SubLObject)module0623.$ic187$);
                                }
                                finally {
                                    var1.throwStack.pop();
                                }
                                if (module0623.NIL != var16) {
                                    var11 = var16;
                                }
                                if (module0623.$g4770$.getDynamicValue(var1).numG((SubLObject)module0623.TWO_INTEGER)) {
                                    f38389(PrintLow.format((SubLObject)module0623.NIL, (SubLObject)module0623.$ic203$, var9), var4);
                                    if (var11.isString()) {
                                        f38389(PrintLow.format((SubLObject)module0623.NIL, (SubLObject)module0623.$ic204$, var11), var4);
                                    }
                                }
                                f38298(var7, var9);
                                if (var16 != module0623.$ic178$) {
                                    f38299(var7, var11);
                                }
                                try {
                                    var1.throwStack.push(module0623.$ic187$);
                                    f38419(var7, (SubLObject)module0623.T);
                                }
                                catch (Throwable var18) {
                                    var16 = Errors.handleThrowable(var18, (SubLObject)module0623.$ic187$);
                                }
                                finally {
                                    var1.throwStack.pop();
                                }
                            }
                        }
                        finally {
                            module0623.$g4787$.rebind(var15, var1);
                        }
                    }
                    finally {
                        final SubLObject var19 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0623.T, var1);
                            f38405(var7);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var19, var1);
                        }
                    }
                }
                catch (Throwable var20) {
                    var12 = Errors.handleThrowable(var20, (SubLObject)module0623.$ic187$);
                }
                finally {
                    var1.throwStack.pop();
                }
            }
        }
        catch (Throwable var21) {
            var3 = Errors.handleThrowable(var21, (SubLObject)module0623.$ic198$);
        }
        finally {
            var1.throwStack.pop();
        }
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38420(final SubLObject var117) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        assert module0623.NIL != Types.listp(var117) : var117;
        final SubLObject var119 = f38378(Threads.current_process());
        if (module0623.$g4770$.getDynamicValue(var118).numG((SubLObject)module0623.TWO_INTEGER)) {
            f38389(PrintLow.format((SubLObject)module0623.NIL, (SubLObject)module0623.$ic205$, var117, module0051.f3552(Time.get_universal_time())), var119);
        }
        return f38421(var119, var117);
    }
    
    public static SubLObject f38421(final SubLObject var47, final SubLObject var117) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        if (module0623.NIL == f38353(var47)) {
            Errors.error((SubLObject)module0623.$ic206$, Threads.current_process());
        }
        final SubLObject var119 = f38411();
        final SubLObject var120 = module0623.$g4786$.currentBinding(var118);
        try {
            module0623.$g4786$.bind((SubLObject)module0623.NIL, var118);
            f38298(var119, var117);
            f38419(var119, (SubLObject)module0623.NIL);
        }
        finally {
            module0623.$g4786$.rebind(var120, var118);
        }
        return (SubLObject)module0623.T;
    }
    
    public static SubLObject f38422(SubLObject var67, SubLObject var68, SubLObject var69) {
        if (var67 == module0623.UNPROVIDED) {
            var67 = (SubLObject)module0623.$ic208$;
        }
        if (var68 == module0623.UNPROVIDED) {
            var68 = module0623.$g4789$.getGlobalValue();
        }
        if (var69 == module0623.UNPROVIDED) {
            var69 = module0623.$g4790$.getGlobalValue();
        }
        final SubLThread var70 = SubLProcess.currentSubLThread();
        assert module0623.NIL != Types.integerp(var68) : var68;
        assert module0623.NIL != Types.integerp(var69) : var69;
        assert module0623.NIL != Types.stringp(var67) : var67;
        module0623.$g4788$.setDynamicValue(StreamsLow.$standard_output$.getDynamicValue(var70), var70);
        SubLObject var71 = (SubLObject)module0623.NIL;
        var71 = f38370((SubLObject)module0623.UNPROVIDED);
        f38393(var67, var71);
        f38394(var68, var71);
        f38395(var69, var71);
        if (module0623.$g4770$.getDynamicValue(var70).numG((SubLObject)module0623.TWO_INTEGER)) {
            f38389(PrintLow.format((SubLObject)module0623.NIL, (SubLObject)module0623.$ic209$), var71);
        }
        f38381(Locks.make_lock(PrintLow.format((SubLObject)module0623.NIL, (SubLObject)module0623.$ic210$, var67)), var71);
        f38364(var71, Semaphores.new_semaphore((SubLObject)module0623.$ic211$, (SubLObject)module0623.ZERO_INTEGER));
        f38383(module0055.f4059(module0623.$g4776$.getGlobalValue(), (SubLObject)module0623.$ic16$, (SubLObject)module0623.UNPROVIDED), var71);
        SubLObject var72;
        for (var72 = (SubLObject)module0623.NIL, var72 = (SubLObject)module0623.ZERO_INTEGER; var72.numL(var68); var72 = Numbers.add(var72, (SubLObject)module0623.ONE_INTEGER)) {
            f38423(var71);
        }
        return var71;
    }
    
    public static SubLObject f38423(final SubLObject var47) {
        assert module0623.NIL != f38353(var47) : var47;
        final SubLObject var48 = f38348((SubLObject)module0623.UNPROVIDED);
        final SubLObject var49 = f38373(var47);
        final SubLObject var50 = f38396(var47);
        f38344(var48, PrintLow.format((SubLObject)module0623.NIL, (SubLObject)module0623.$ic212$, var49, Numbers.add(var50, (SubLObject)module0623.ONE_INTEGER)));
        f38345(var48, Threads.make_process(f38340(var48), Symbols.symbol_function((SubLObject)module0623.$ic213$)));
        f38386(var48, var47);
        f38398(f38341(var48), var47);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38424(final SubLObject var47) {
        assert module0623.NIL != f38353(var47) : var47;
        SubLObject var48 = f38357(var47);
        SubLObject var49 = (SubLObject)module0623.NIL;
        var49 = var48.first();
        while (module0623.NIL != var48) {
            f38425(var49);
            f38399(f38341(var49));
            var48 = var48.rest();
            var49 = var48.first();
        }
        f38365(var47, (SubLObject)module0623.NIL);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38425(final SubLObject var40) {
        assert module0623.NIL != f38339(var40) : var40;
        SubLObject var41 = f38341(var40);
        if (module0623.NIL != Threads.valid_process_p(var41)) {
            f38426(var41);
        }
        f38399(var41);
        var41 = (SubLObject)module0623.NIL;
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38426(final SubLObject var52) {
        return Threads.interrupt_process(var52, Symbols.symbol_function((SubLObject)module0623.$ic214$));
    }
    
    public static SubLObject f38427(final SubLObject var16) {
        assert module0623.NIL != Types.stringp(var16) : var16;
        final SubLObject var17 = Sequences.cconcatenate(var16, (SubLObject)module0623.$ic216$);
        SubLObject var18 = Threads.all_processes();
        SubLObject var19 = (SubLObject)module0623.NIL;
        var19 = var18.first();
        while (module0623.NIL != var18) {
            final SubLObject var20 = Threads.process_name(var19);
            if (module0623.NIL != module0038.f2684(var20, var17)) {
                PrintLow.format((SubLObject)module0623.T, (SubLObject)module0623.$ic217$, var20);
                Threads.kill_process(var19);
            }
            var18 = var18.rest();
            var19 = var18.first();
        }
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38428() {
        Dynamic.sublisp_throw((SubLObject)module0623.$ic198$, (SubLObject)module0623.NIL);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38418(final SubLObject var66, final SubLObject var47) {
        assert module0623.NIL != Types.stringp(var66) : var66;
        assert module0623.NIL != f38353(var47) : var47;
        SubLObject var67 = f38357(var47);
        SubLObject var68 = (SubLObject)module0623.NIL;
        var68 = var67.first();
        while (module0623.NIL != var67) {
            if (module0623.NIL != Strings.stringE(var66, f38340(var68), (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED)) {
                return var68;
            }
            var67 = var67.rest();
            var68 = var67.first();
        }
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38392(final SubLObject var66) {
        assert module0623.NIL != Types.stringp(var66) : var66;
        SubLObject var67 = Threads.all_processes();
        SubLObject var68 = (SubLObject)module0623.NIL;
        var68 = var67.first();
        while (module0623.NIL != var67) {
            final SubLObject var69 = Threads.process_name(var68);
            if (module0623.NIL != Strings.stringE(var66, var69, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED)) {
                return f38378(var68);
            }
            var67 = var67.rest();
            var68 = var67.first();
        }
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38429(final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        if (f38396(var47).numL(f38375(var47))) {
            if (module0623.$g4770$.getDynamicValue(var48).numG((SubLObject)module0623.TWO_INTEGER)) {
                f38389(PrintLow.format((SubLObject)module0623.NIL, (SubLObject)module0623.$ic218$), var47);
            }
            f38423(var47);
        }
        f38389(PrintLow.format((SubLObject)module0623.NIL, (SubLObject)module0623.$ic219$), var47);
        Semaphores.semaphore_signal(f38356(var47));
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38430(final SubLObject var15, final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        assert module0623.NIL != f38280(var15) : var15;
        assert module0623.NIL != f38353(var47) : var47;
        if (module0623.NIL == Errors.$ignore_mustsP$.getDynamicValue(var48) && module0623.NIL == f38357(var47)) {
            Errors.error((SubLObject)module0623.$ic220$);
        }
        final SubLObject var49 = f38354(var47);
        SubLObject var50 = (SubLObject)module0623.NIL;
        try {
            var50 = Locks.seize_lock(var49);
            var48.resetMultipleValues();
            final SubLObject var51 = module0055.f4067(var15, f38355(var47));
            final SubLObject var52 = var48.secondMultipleValue();
            final SubLObject var53 = var48.thirdMultipleValue();
            var48.resetMultipleValues();
            if (module0623.NIL != var52) {
                Errors.cerror((SubLObject)module0623.$ic221$, var53);
            }
            f38429(var47);
        }
        finally {
            if (module0623.NIL != var50) {
                Locks.release_lock(var49);
            }
        }
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38431(final SubLObject var101, final SubLObject var102) {
        final SubLObject var103 = var101.rest();
        final SubLObject var105;
        final SubLObject var104 = var105 = var103;
        return (SubLObject)ConsesLow.list((SubLObject)module0623.$ic171$, (SubLObject)module0623.$ic223$, (SubLObject)ConsesLow.listS((SubLObject)module0623.$ic224$, (SubLObject)ConsesLow.listS((SubLObject)module0623.$ic190$, (SubLObject)module0623.$ic225$, ConsesLow.append(var105, (SubLObject)module0623.NIL)), (SubLObject)module0623.$ic226$));
    }
    
    public static SubLObject f38432(final SubLObject var101, final SubLObject var102) {
        SubLObject var104;
        final SubLObject var103 = var104 = var101.rest();
        SubLObject var105 = (SubLObject)module0623.NIL;
        SubLObject var106 = (SubLObject)module0623.NIL;
        SubLObject var107 = (SubLObject)module0623.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var104, var103, (SubLObject)module0623.$ic227$);
        var105 = var104.first();
        var104 = var104.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var104, var103, (SubLObject)module0623.$ic227$);
        var106 = var104.first();
        var104 = var104.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var104, var103, (SubLObject)module0623.$ic227$);
        var107 = var104.first();
        var104 = var104.rest();
        if (module0623.NIL != var104) {
            cdestructuring_bind.cdestructuring_bind_error(var103, (SubLObject)module0623.$ic227$);
            return (SubLObject)module0623.NIL;
        }
        assert module0623.NIL != Types.stringp(var105) : var105;
        assert module0623.NIL != Types.integerp(var106) : var106;
        assert module0623.NIL != Types.integerp(var107) : var107;
        final SubLObject var108 = Packages.intern(Sequences.cconcatenate((SubLObject)module0623.$ic228$, new SubLObject[] { var105, module0623.$ic229$ }), (SubLObject)module0623.UNPROVIDED);
        final SubLObject var109 = Packages.intern(Sequences.cconcatenate((SubLObject)module0623.$ic228$, new SubLObject[] { var105, module0623.$ic230$ }), (SubLObject)module0623.UNPROVIDED);
        return (SubLObject)ConsesLow.list((SubLObject)module0623.$ic190$, (SubLObject)ConsesLow.listS((SubLObject)module0623.$ic231$, var108, (SubLObject)module0623.$ic232$), (SubLObject)ConsesLow.listS((SubLObject)module0623.$ic233$, var109, (SubLObject)module0623.$ic234$), (SubLObject)ConsesLow.list((SubLObject)module0623.$ic235$, Packages.intern(Sequences.cconcatenate(var105, (SubLObject)module0623.$ic236$), (SubLObject)module0623.UNPROVIDED), (SubLObject)module0623.NIL, (SubLObject)module0623.$ic237$, (SubLObject)ConsesLow.list((SubLObject)module0623.$ic238$, (SubLObject)ConsesLow.list((SubLObject)module0623.$ic239$, var108))), (SubLObject)ConsesLow.listS((SubLObject)module0623.$ic235$, Packages.intern(Sequences.cconcatenate((SubLObject)module0623.$ic240$, new SubLObject[] { var105, module0623.$ic241$ }), (SubLObject)module0623.UNPROVIDED), (SubLObject)module0623.NIL, (SubLObject)module0623.$ic242$, (SubLObject)ConsesLow.list((SubLObject)module0623.$ic243$, (SubLObject)ConsesLow.list(var109), (SubLObject)ConsesLow.listS((SubLObject)module0623.$ic244$, var108, (SubLObject)module0623.$ic245$), (SubLObject)ConsesLow.list((SubLObject)module0623.$ic172$, var108, (SubLObject)ConsesLow.list((SubLObject)module0623.$ic246$, (SubLObject)ConsesLow.listS((SubLObject)module0623.$ic247$, var105, (SubLObject)module0623.$ic248$), var106, var107))), (SubLObject)module0623.$ic249$), (SubLObject)ConsesLow.listS((SubLObject)module0623.$ic235$, Packages.intern(Sequences.cconcatenate((SubLObject)module0623.$ic250$, new SubLObject[] { var105, module0623.$ic241$ }), (SubLObject)module0623.UNPROVIDED), (SubLObject)module0623.NIL, (SubLObject)module0623.$ic251$, (SubLObject)ConsesLow.list((SubLObject)module0623.$ic243$, (SubLObject)ConsesLow.list(var109), (SubLObject)ConsesLow.list((SubLObject)module0623.$ic244$, var108, (SubLObject)ConsesLow.list((SubLObject)module0623.$ic252$, var108), (SubLObject)ConsesLow.listS((SubLObject)module0623.$ic172$, var108, (SubLObject)module0623.$ic253$), (SubLObject)ConsesLow.list((SubLObject)module0623.$ic215$, var105))), (SubLObject)module0623.$ic249$), (SubLObject)ConsesLow.listS((SubLObject)module0623.$ic235$, Packages.intern(Sequences.cconcatenate((SubLObject)module0623.$ic254$, new SubLObject[] { var105, module0623.$ic241$ }), (SubLObject)module0623.UNPROVIDED), (SubLObject)module0623.NIL, (SubLObject)module0623.$ic255$, (SubLObject)ConsesLow.list((SubLObject)module0623.$ic243$, (SubLObject)ConsesLow.list(var109), (SubLObject)ConsesLow.list((SubLObject)module0623.$ic244$, var108, (SubLObject)ConsesLow.list((SubLObject)module0623.$ic252$, var108), (SubLObject)ConsesLow.listS((SubLObject)module0623.$ic172$, var108, (SubLObject)module0623.$ic253$), (SubLObject)ConsesLow.list((SubLObject)module0623.$ic215$, var105)), (SubLObject)ConsesLow.list((SubLObject)module0623.$ic172$, var108, (SubLObject)ConsesLow.list((SubLObject)module0623.$ic246$, (SubLObject)ConsesLow.listS((SubLObject)module0623.$ic247$, var105, (SubLObject)module0623.$ic248$), var106, var107))), (SubLObject)module0623.$ic249$), (SubLObject)ConsesLow.listS((SubLObject)module0623.$ic235$, Packages.intern(Sequences.cconcatenate((SubLObject)module0623.$ic256$, new SubLObject[] { var105, module0623.$ic257$ }), (SubLObject)module0623.UNPROVIDED), (SubLObject)module0623.NIL, (SubLObject)module0623.$ic258$, (SubLObject)ConsesLow.list((SubLObject)module0623.$ic244$, var108, (SubLObject)ConsesLow.list((SubLObject)module0623.$ic259$, var108)), (SubLObject)module0623.$ic249$));
    }
    
    public static SubLObject f38433(final SubLObject var101, final SubLObject var102) {
        SubLObject var104;
        final SubLObject var103 = var104 = var101.rest();
        SubLObject var105 = (SubLObject)module0623.NIL;
        SubLObject var106 = (SubLObject)module0623.NIL;
        SubLObject var107 = (SubLObject)module0623.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var104, var103, (SubLObject)module0623.$ic260$);
        var105 = var104.first();
        var104 = var104.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var104, var103, (SubLObject)module0623.$ic260$);
        var106 = var104.first();
        var104 = var104.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var104, var103, (SubLObject)module0623.$ic260$);
        var107 = var104.first();
        final SubLObject var108;
        var104 = (var108 = var104.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0623.$ic190$, (SubLObject)ConsesLow.listS((SubLObject)module0623.$ic235$, Packages.intern(Sequences.cconcatenate(var105, (SubLObject)module0623.$ic261$), (SubLObject)module0623.UNPROVIDED), var107, ConsesLow.append(var108, (SubLObject)module0623.NIL)), (SubLObject)module0623.$ic262$, (SubLObject)ConsesLow.list((SubLObject)module0623.$ic263$, (SubLObject)module0623.$ic264$, Symbols.make_keyword(var105), var106));
    }
    
    public static SubLObject f38434(final SubLObject var101, final SubLObject var102) {
        SubLObject var104;
        final SubLObject var103 = var104 = var101.rest();
        SubLObject var105 = (SubLObject)module0623.NIL;
        SubLObject var106 = (SubLObject)module0623.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var104, var103, (SubLObject)module0623.$ic265$);
        var105 = var104.first();
        var104 = var104.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var104, var103, (SubLObject)module0623.$ic265$);
        var106 = var104.first();
        final SubLObject var107;
        var104 = (var107 = var104.rest());
        final SubLObject var108 = Packages.intern(Sequences.cconcatenate((SubLObject)module0623.$ic266$, new SubLObject[] { var105, module0623.$ic267$ }), (SubLObject)module0623.UNPROVIDED);
        return (SubLObject)ConsesLow.list((SubLObject)module0623.$ic190$, (SubLObject)ConsesLow.listS((SubLObject)module0623.$ic235$, var108, var106, ConsesLow.append(var107, (SubLObject)module0623.NIL)), (SubLObject)module0623.$ic268$, (SubLObject)ConsesLow.list((SubLObject)module0623.$ic263$, (SubLObject)module0623.$ic269$, Symbols.make_keyword(var105), (SubLObject)ConsesLow.list((SubLObject)module0623.$ic270$, var108)));
    }
    
    public static SubLObject f38435() {
        return f38379(module0623.$g4791$.getGlobalValue());
    }
    
    public static SubLObject f38436() {
        final SubLObject var137 = module0623.$g1441$.getGlobalValue();
        SubLObject var138 = (SubLObject)module0623.NIL;
        try {
            var138 = Locks.seize_lock(var137);
            if (module0623.NIL != module0623.$g4791$.getGlobalValue()) {
                Errors.error((SubLObject)module0623.$ic272$);
            }
            module0623.$g4791$.setGlobalValue(f38422(Sequences.cconcatenate((SubLObject)module0623.$ic273$, (SubLObject)module0623.$ic216$), (SubLObject)module0623.FIVE_INTEGER, (SubLObject)module0623.$ic207$));
        }
        finally {
            if (module0623.NIL != var138) {
                Locks.release_lock(var137);
            }
        }
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38437() {
        final SubLObject var139 = module0623.$g1441$.getGlobalValue();
        SubLObject var140 = (SubLObject)module0623.NIL;
        try {
            var140 = Locks.seize_lock(var139);
            if (module0623.NIL != module0623.$g4791$.getGlobalValue()) {
                f38424(module0623.$g4791$.getGlobalValue());
                module0623.$g4791$.setGlobalValue((SubLObject)module0623.NIL);
                f38427((SubLObject)module0623.$ic273$);
            }
        }
        finally {
            if (module0623.NIL != var140) {
                Locks.release_lock(var139);
            }
        }
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38438() {
        final SubLObject var141 = module0623.$g1441$.getGlobalValue();
        SubLObject var142 = (SubLObject)module0623.NIL;
        try {
            var142 = Locks.seize_lock(var141);
            if (module0623.NIL != module0623.$g4791$.getGlobalValue()) {
                f38424(module0623.$g4791$.getGlobalValue());
                module0623.$g4791$.setGlobalValue((SubLObject)module0623.NIL);
                f38427((SubLObject)module0623.$ic273$);
            }
            module0623.$g4791$.setGlobalValue(f38422(Sequences.cconcatenate((SubLObject)module0623.$ic273$, (SubLObject)module0623.$ic216$), (SubLObject)module0623.FIVE_INTEGER, (SubLObject)module0623.$ic207$));
        }
        finally {
            if (module0623.NIL != var142) {
                Locks.release_lock(var141);
            }
        }
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38439() {
        if (module0623.NIL != module0623.$g4791$.getGlobalValue()) {
            f38390(module0623.$g4791$.getGlobalValue());
        }
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38440() {
        f38441();
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38441() {
        if (module0623.NIL != module0623.$g4791$.getGlobalValue()) {
            f38376(module0623.$g4791$.getGlobalValue(), (SubLObject)module0623.UNPROVIDED);
        }
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38442(SubLObject var22, final SubLObject var17, final SubLObject var18, final SubLObject var19, final SubLObject var21, final SubLObject var143) {
        final SubLObject var144 = Equality.eq(var22.first(), (SubLObject)module0623.$ic283$);
        final SubLObject var145 = f38301((SubLObject)module0623.UNPROVIDED);
        if (module0623.NIL != var144) {
            var22 = conses_high.second(var22);
        }
        f38305((SubLObject)module0623.$ic284$, var145);
        f38307(var17, var145);
        f38309(var18, var145);
        f38311(var19, var145);
        f38313(var143, var145);
        f38315(var21, var145);
        f38317(var22, var145);
        f38430(var145, module0623.$g4791$.getGlobalValue());
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38443(final SubLObject var145) {
        assert module0623.NIL != Types.booleanp(var145) : var145;
        module0623.$g4792$.setGlobalValue(var145);
        return module0623.$g4792$.getGlobalValue();
    }
    
    public static SubLObject f38444() {
        return module0623.$g4792$.getGlobalValue();
    }
    
    public static SubLObject f38419(final SubLObject var15, SubLObject var34) {
        if (var34 == module0623.UNPROVIDED) {
            var34 = (SubLObject)module0623.T;
        }
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if (module0623.NIL != module0623.$g4786$.getDynamicValue(var35)) {
            f38317((SubLObject)module0623.NIL, var15);
        }
        Functions.funcall(module0067.f4884(module0623.$g4773$.getGlobalValue(), f38281(var15), (SubLObject)module0623.UNPROVIDED), var15, var34);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38445(final SubLObject var15, SubLObject var34) {
        if (var34 == module0623.UNPROVIDED) {
            var34 = (SubLObject)module0623.T;
        }
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if (module0623.$g4770$.getDynamicValue(var35).numG((SubLObject)module0623.ZERO_INTEGER)) {
            f38389(PrintLow.format((SubLObject)module0623.NIL, (SubLObject)module0623.$ic286$, var15), module0623.$g4791$.getGlobalValue());
        }
        final SubLObject var36 = f38312(var15);
        final SubLObject var37 = (SubLObject)ConsesLow.list((SubLObject)module0623.$ic287$, f38316(var15), f38306(var15), f38308(var15), f38310(var15), f38318(var15), f38320(var15), var34);
        final SubLObject var38 = module0624.f38486(var36);
        final SubLObject var39 = module0624.f38487(var36);
        final SubLObject var40 = module0338.$g2879$.currentBinding(var35);
        try {
            module0338.$g2879$.bind((SubLObject)module0623.T, var35);
            if (var38.isStream() && module0623.NIL != streams_high.open_stream_p(var38)) {
                module0115.f7977();
                if (f38276().numG((SubLObject)module0623.ZERO_INTEGER)) {
                    f38389(PrintLow.format((SubLObject)module0623.NIL, (SubLObject)module0623.$ic288$, new SubLObject[] { f38318(var15), var38, var36 }), module0623.$g4791$.getGlobalValue());
                }
                final SubLObject var148_149 = var39;
                SubLObject var41 = (SubLObject)module0623.NIL;
                try {
                    var41 = Locks.seize_lock(var148_149);
                    module0115.f7985(var38, var37, (SubLObject)module0623.NIL);
                }
                finally {
                    if (module0623.NIL != var41) {
                        Locks.release_lock(var148_149);
                    }
                }
            }
            else if (f38276().numG((SubLObject)module0623.ZERO_INTEGER)) {
                f38389(PrintLow.format((SubLObject)module0623.NIL, (SubLObject)module0623.$ic289$, new SubLObject[] { var37, var38, var36 }), module0623.$g4791$.getGlobalValue());
            }
        }
        finally {
            module0338.$g2879$.rebind(var40, var35);
        }
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38446(final SubLObject var151) {
        return module0083.f5696(var151, (SubLObject)module0623.$ic291$, (SubLObject)module0623.$ic292$, (SubLObject)module0623.$ic293$, (SubLObject)module0623.$ic294$, (SubLObject)module0623.$ic295$, (SubLObject)module0623.$ic296$);
    }
    
    public static SubLObject f38447(final SubLObject var152, final SubLObject var153) {
        final SubLThread var154 = SubLProcess.currentSubLThread();
        if (module0623.NIL == Errors.$ignore_mustsP$.getDynamicValue(var154) && module0623.NIL == f38353(f38378(Threads.current_process()))) {
            Errors.error(Errors.error((SubLObject)module0623.$ic297$));
        }
        module0083.f5698(var152, var153);
        f38420((SubLObject)ConsesLow.list(var153));
        return var152;
    }
    
    public static SubLObject f38448(final SubLObject var152, final SubLObject var154) {
        final SubLThread var155 = SubLProcess.currentSubLThread();
        if (module0623.NIL == Errors.$ignore_mustsP$.getDynamicValue(var155) && module0623.NIL == f38353(f38378(Threads.current_process()))) {
            Errors.error(Errors.error((SubLObject)module0623.$ic297$));
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
        if (var156 == module0623.UNPROVIDED) {
            var156 = (SubLObject)module0623.NIL;
        }
        return module0083.f5700(var152, var156);
    }
    
    public static SubLObject f38452(final SubLObject var152) {
        return module0083.f5702(var152);
    }
    
    public static SubLObject f38453() {
        return f38379(module0623.$g4793$.getGlobalValue());
    }
    
    public static SubLObject f38454() {
        final SubLObject var157 = module0623.$g4794$.getGlobalValue();
        SubLObject var158 = (SubLObject)module0623.NIL;
        try {
            var158 = Locks.seize_lock(var157);
            if (module0623.NIL != module0623.$g4793$.getGlobalValue()) {
                Errors.error((SubLObject)module0623.$ic272$);
            }
            module0623.$g4793$.setGlobalValue(f38422(Sequences.cconcatenate((SubLObject)module0623.$ic298$, (SubLObject)module0623.$ic216$), (SubLObject)module0623.TWO_INTEGER, (SubLObject)module0623.TWO_INTEGER));
        }
        finally {
            if (module0623.NIL != var158) {
                Locks.release_lock(var157);
            }
        }
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38455() {
        final SubLObject var159 = module0623.$g4794$.getGlobalValue();
        SubLObject var160 = (SubLObject)module0623.NIL;
        try {
            var160 = Locks.seize_lock(var159);
            if (module0623.NIL != module0623.$g4793$.getGlobalValue()) {
                f38424(module0623.$g4793$.getGlobalValue());
                module0623.$g4793$.setGlobalValue((SubLObject)module0623.NIL);
                f38427((SubLObject)module0623.$ic298$);
            }
        }
        finally {
            if (module0623.NIL != var160) {
                Locks.release_lock(var159);
            }
        }
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38456() {
        final SubLObject var161 = module0623.$g4794$.getGlobalValue();
        SubLObject var162 = (SubLObject)module0623.NIL;
        try {
            var162 = Locks.seize_lock(var161);
            if (module0623.NIL != module0623.$g4793$.getGlobalValue()) {
                f38424(module0623.$g4793$.getGlobalValue());
                module0623.$g4793$.setGlobalValue((SubLObject)module0623.NIL);
                f38427((SubLObject)module0623.$ic298$);
            }
            module0623.$g4793$.setGlobalValue(f38422(Sequences.cconcatenate((SubLObject)module0623.$ic298$, (SubLObject)module0623.$ic216$), (SubLObject)module0623.TWO_INTEGER, (SubLObject)module0623.TWO_INTEGER));
        }
        finally {
            if (module0623.NIL != var162) {
                Locks.release_lock(var161);
            }
        }
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38457() {
        if (module0623.NIL != module0623.$g4793$.getGlobalValue()) {
            f38390(module0623.$g4793$.getGlobalValue());
        }
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38458(final SubLObject var22, final SubLObject var17, final SubLObject var18, final SubLObject var19, final SubLObject var21, final SubLObject var163) {
        final SubLObject var164 = f38301((SubLObject)module0623.UNPROVIDED);
        f38305((SubLObject)module0623.$ic299$, var164);
        f38307(var17, var164);
        f38309(var18, var164);
        f38311(var19, var164);
        f38313(var163, var164);
        f38315(var21, var164);
        f38317(var22, var164);
        f38430(var164, module0623.$g4793$.getGlobalValue());
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38459(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (module0623.$g4770$.getDynamicValue(var16).numG((SubLObject)module0623.MINUS_ONE_INTEGER)) {
            f38389(PrintLow.format((SubLObject)module0623.NIL, (SubLObject)module0623.$ic300$, var15), module0623.$g4793$.getGlobalValue());
        }
        final SubLObject var17 = f38312(var15);
        if (module0623.$g4770$.getDynamicValue(var16).numG((SubLObject)module0623.ZERO_INTEGER)) {
            f38389(PrintLow.format((SubLObject)module0623.NIL, (SubLObject)module0623.$ic301$, module0623.$g4795$.getGlobalValue()), module0623.$g4793$.getGlobalValue());
        }
        if (module0623.NIL == module0623.$g4795$.getGlobalValue()) {
            module0623.$g4795$.setGlobalValue(module0067.f4880((SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED));
        }
        if (module0623.$g4770$.getDynamicValue(var16).numG((SubLObject)module0623.ZERO_INTEGER)) {
            f38389(PrintLow.format((SubLObject)module0623.NIL, (SubLObject)module0623.$ic301$, module0623.$g4795$.getGlobalValue()), module0623.$g4793$.getGlobalValue());
        }
        module0067.f4886(module0623.$g4795$.getGlobalValue(), var17, var15);
        Threads.process_unblock(var17);
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38460(final SubLObject var70) {
        module0623.$g4796$.setGlobalValue(Numbers.add(module0623.$g4796$.getGlobalValue(), (SubLObject)module0623.ONE_INTEGER));
        f38458(var70, module0623.$g4796$.getGlobalValue(), (SubLObject)module0623.ONE_INTEGER, Threads.process_name(Threads.current_process()), (SubLObject)module0623.NIL, Threads.current_process());
        Threads.process_block();
        final SubLObject var71 = module0067.f4884(module0623.$g4795$.getGlobalValue(), Threads.current_process(), (SubLObject)module0623.UNPROVIDED);
        return f38318(var71);
    }
    
    public static SubLObject f38461() {
        return f38379(module0623.$g4797$.getGlobalValue());
    }
    
    public static SubLObject f38462() {
        final SubLObject var164 = module0623.$g4798$.getGlobalValue();
        SubLObject var165 = (SubLObject)module0623.NIL;
        try {
            var165 = Locks.seize_lock(var164);
            if (module0623.NIL != module0623.$g4797$.getGlobalValue()) {
                Errors.error((SubLObject)module0623.$ic272$);
            }
            module0623.$g4797$.setGlobalValue(f38422(Sequences.cconcatenate((SubLObject)module0623.$ic303$, (SubLObject)module0623.$ic216$), (SubLObject)module0623.FIVE_INTEGER, (SubLObject)module0623.$ic207$));
        }
        finally {
            if (module0623.NIL != var165) {
                Locks.release_lock(var164);
            }
        }
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38463() {
        final SubLObject var166 = module0623.$g4798$.getGlobalValue();
        SubLObject var167 = (SubLObject)module0623.NIL;
        try {
            var167 = Locks.seize_lock(var166);
            if (module0623.NIL != module0623.$g4797$.getGlobalValue()) {
                f38424(module0623.$g4797$.getGlobalValue());
                module0623.$g4797$.setGlobalValue((SubLObject)module0623.NIL);
                f38427((SubLObject)module0623.$ic303$);
            }
        }
        finally {
            if (module0623.NIL != var167) {
                Locks.release_lock(var166);
            }
        }
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38464() {
        final SubLObject var168 = module0623.$g4798$.getGlobalValue();
        SubLObject var169 = (SubLObject)module0623.NIL;
        try {
            var169 = Locks.seize_lock(var168);
            if (module0623.NIL != module0623.$g4797$.getGlobalValue()) {
                f38424(module0623.$g4797$.getGlobalValue());
                module0623.$g4797$.setGlobalValue((SubLObject)module0623.NIL);
                f38427((SubLObject)module0623.$ic303$);
            }
            module0623.$g4797$.setGlobalValue(f38422(Sequences.cconcatenate((SubLObject)module0623.$ic303$, (SubLObject)module0623.$ic216$), (SubLObject)module0623.FIVE_INTEGER, (SubLObject)module0623.$ic207$));
        }
        finally {
            if (module0623.NIL != var169) {
                Locks.release_lock(var168);
            }
        }
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38465() {
        if (module0623.NIL != module0623.$g4797$.getGlobalValue()) {
            f38390(module0623.$g4797$.getGlobalValue());
        }
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38466(final SubLObject var22, final SubLObject var18) {
        assert module0623.NIL != Types.integerp(var18) : var18;
        final SubLObject var23 = f38301((SubLObject)module0623.UNPROVIDED);
        f38305((SubLObject)module0623.$ic305$, var23);
        module0623.$g4799$.setGlobalValue(Numbers.add(module0623.$g4799$.getGlobalValue(), (SubLObject)module0623.ONE_INTEGER));
        f38307(module0623.$g4799$.getGlobalValue(), var23);
        f38309(var18, var23);
        f38311(constants_high_oc.f10743(module0574.f35152()), var23);
        f38317(var22, var23);
        f38430(var23, module0623.$g4797$.getGlobalValue());
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38467(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (module0623.$g4770$.getDynamicValue(var16).numG((SubLObject)module0623.TWO_INTEGER)) {
            f38389(PrintLow.format((SubLObject)module0623.NIL, (SubLObject)module0623.$ic306$, var15), module0623.$g4797$.getGlobalValue());
        }
        f38389(PrintLow.format((SubLObject)module0623.NIL, (SubLObject)module0623.$ic307$, f38290(var15), f38288(var15)), module0623.$g4797$.getGlobalValue());
        if (module0623.NIL != f38289(var15)) {
            f38389(PrintLow.format((SubLObject)module0623.NIL, (SubLObject)module0623.$ic152$, f38289(var15)), module0623.$g4797$.getGlobalValue());
        }
        return (SubLObject)module0623.NIL;
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
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38469() {
        module0623.$g4770$ = SubLFiles.defparameter("S#9977", (SubLObject)module0623.ZERO_INTEGER);
        module0623.$g4771$ = SubLFiles.defconstant("S#42044", (SubLObject)module0623.$ic3$);
        module0623.$g4772$ = SubLFiles.defconstant("S#42045", (SubLObject)module0623.$ic63$);
        module0623.$g4773$ = SubLFiles.deflexical("S#42046", (SubLObject)module0623.NIL);
        module0623.$g4774$ = SubLFiles.defconstant("S#42047", (SubLObject)module0623.$ic84$);
        module0623.$g4775$ = SubLFiles.defconstant("S#42048", (SubLObject)module0623.$ic111$);
        module0623.$g4776$ = SubLFiles.defconstant("S#42049", (SubLObject)module0623.$ic154$);
        module0623.$g4777$ = SubLFiles.deflexical("S#42050", (SubLObject)module0623.NIL);
        module0623.$g4778$ = SubLFiles.deflexical("S#42051", (SubLObject)module0623.NIL);
        module0623.$g4779$ = SubLFiles.deflexical("S#42052", (SubLObject)module0623.NIL);
        module0623.$g4780$ = SubLFiles.defparameter("S#9969", (SubLObject)module0623.NIL);
        module0623.$g4781$ = SubLFiles.deflexical("S#42053", module0084.f5827((SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED));
        module0623.$g4782$ = SubLFiles.deflexical("S#42054", Locks.make_lock((SubLObject)module0623.$ic177$));
        module0623.$g4783$ = SubLFiles.deflexical("S#42055", (SubLObject)module0623.NIL);
        module0623.$g4784$ = SubLFiles.defparameter("S#42056", (SubLObject)module0623.$ic154$);
        module0623.$g4785$ = SubLFiles.deflexical("S#42057", (SubLObject)module0623.NIL);
        module0623.$g4786$ = SubLFiles.defparameter("S#42058", (SubLObject)module0623.T);
        module0623.$g4787$ = SubLFiles.defparameter("S#42059", (SubLObject)module0623.NIL);
        module0623.$g4788$ = SubLFiles.defparameter("S#42060", StreamsLow.$standard_output$.getDynamicValue());
        module0623.$g4789$ = SubLFiles.defconstant("S#42061", (SubLObject)module0623.FIVE_INTEGER);
        module0623.$g4790$ = SubLFiles.defconstant("S#42062", (SubLObject)module0623.$ic207$);
        module0623.$g4791$ = SubLFiles.deflexical("S#42063", (SubLObject)module0623.NIL);
        module0623.$g1441$ = SubLFiles.defconstant("S#42064", Locks.make_lock((SubLObject)module0623.$ic271$));
        module0623.$g4792$ = SubLFiles.deflexical("S#42065", (SubLObject)module0623.NIL);
        module0623.$g4793$ = SubLFiles.deflexical("S#42066", (SubLObject)module0623.NIL);
        module0623.$g4794$ = SubLFiles.defconstant("S#42067", Locks.make_lock((SubLObject)module0623.$ic271$));
        module0623.$g4795$ = SubLFiles.deflexical("S#42068", (SubLObject)module0623.NIL);
        module0623.$g4796$ = SubLFiles.deflexical("S#42069", (SubLObject)module0623.ZERO_INTEGER);
        module0623.$g4797$ = SubLFiles.deflexical("S#42070", (SubLObject)module0623.NIL);
        module0623.$g4798$ = SubLFiles.defconstant("S#42071", Locks.make_lock((SubLObject)module0623.$ic271$));
        module0623.$g4799$ = SubLFiles.deflexical("S#42072", (SubLObject)((module0623.NIL != Symbols.boundp((SubLObject)module0623.$ic304$)) ? module0623.$g4799$.getGlobalValue() : module0623.ZERO_INTEGER));
        return (SubLObject)module0623.NIL;
    }
    
    public static SubLObject f38470() {
        module0002.f38((SubLObject)module0623.$ic0$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0623.$g4771$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0623.$ic10$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0623.$ic11$);
        Structures.def_csetf((SubLObject)module0623.$ic12$, (SubLObject)module0623.$ic13$);
        Structures.def_csetf((SubLObject)module0623.$ic14$, (SubLObject)module0623.$ic15$);
        Structures.def_csetf((SubLObject)module0623.$ic16$, (SubLObject)module0623.$ic17$);
        Structures.def_csetf((SubLObject)module0623.$ic18$, (SubLObject)module0623.$ic19$);
        Structures.def_csetf((SubLObject)module0623.$ic20$, (SubLObject)module0623.$ic21$);
        Structures.def_csetf((SubLObject)module0623.$ic22$, (SubLObject)module0623.$ic23$);
        Structures.def_csetf((SubLObject)module0623.$ic24$, (SubLObject)module0623.$ic25$);
        Structures.def_csetf((SubLObject)module0623.$ic26$, (SubLObject)module0623.$ic27$);
        Structures.def_csetf((SubLObject)module0623.$ic28$, (SubLObject)module0623.$ic29$);
        Structures.def_csetf((SubLObject)module0623.$ic30$, (SubLObject)module0623.$ic31$);
        Equality.identity((SubLObject)module0623.$ic3$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0623.$g4771$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0623.$ic47$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0623.$g4772$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0623.$ic70$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0623.$ic71$);
        Structures.def_csetf((SubLObject)module0623.$ic72$, (SubLObject)module0623.$ic73$);
        Structures.def_csetf((SubLObject)module0623.$ic74$, (SubLObject)module0623.$ic75$);
        Structures.def_csetf((SubLObject)module0623.$ic76$, (SubLObject)module0623.$ic77$);
        Equality.identity((SubLObject)module0623.$ic63$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0623.$g4772$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0623.$ic82$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0623.$g4774$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0623.$ic91$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0623.$ic92$);
        Structures.def_csetf((SubLObject)module0623.$ic93$, (SubLObject)module0623.$ic94$);
        Structures.def_csetf((SubLObject)module0623.$ic95$, (SubLObject)module0623.$ic96$);
        Structures.def_csetf((SubLObject)module0623.$ic97$, (SubLObject)module0623.$ic98$);
        Structures.def_csetf((SubLObject)module0623.$ic99$, (SubLObject)module0623.$ic100$);
        Equality.identity((SubLObject)module0623.$ic84$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0623.$g4774$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0623.$ic105$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0623.$g4775$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0623.$ic118$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0623.$ic119$);
        Structures.def_csetf((SubLObject)module0623.$ic120$, (SubLObject)module0623.$ic121$);
        Structures.def_csetf((SubLObject)module0623.$ic122$, (SubLObject)module0623.$ic123$);
        Structures.def_csetf((SubLObject)module0623.$ic124$, (SubLObject)module0623.$ic125$);
        Structures.def_csetf((SubLObject)module0623.$ic126$, (SubLObject)module0623.$ic127$);
        Structures.def_csetf((SubLObject)module0623.$ic128$, (SubLObject)module0623.$ic129$);
        Structures.def_csetf((SubLObject)module0623.$ic130$, (SubLObject)module0623.$ic131$);
        Structures.def_csetf((SubLObject)module0623.$ic132$, (SubLObject)module0623.$ic133$);
        Structures.def_csetf((SubLObject)module0623.$ic134$, (SubLObject)module0623.$ic135$);
        Equality.identity((SubLObject)module0623.$ic111$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0623.$g4775$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0623.$ic145$));
        module0002.f38((SubLObject)module0623.$ic158$);
        module0012.f375((SubLObject)module0623.$ic191$, (SubLObject)module0623.$ic188$, (SubLObject)module0623.$ic192$);
        module0012.f375((SubLObject)module0623.$ic194$, (SubLObject)module0623.$ic195$, (SubLObject)module0623.$ic196$);
        module0002.f38((SubLObject)module0623.$ic215$);
        module0002.f38((SubLObject)module0623.$ic222$);
        module0012.f368((SubLObject)module0623.$ic274$, (SubLObject)module0623.NIL, (SubLObject)module0623.$ic275$, (SubLObject)module0623.NIL, (SubLObject)module0623.NIL);
        module0012.f368((SubLObject)module0623.$ic276$, (SubLObject)module0623.NIL, (SubLObject)module0623.$ic277$, (SubLObject)module0623.NIL, (SubLObject)module0623.NIL);
        module0012.f369((SubLObject)module0623.$ic278$);
        module0012.f369((SubLObject)module0623.$ic279$);
        module0012.f369((SubLObject)module0623.$ic280$);
        module0012.f369((SubLObject)module0623.$ic281$);
        module0012.f369((SubLObject)module0623.$ic282$);
        module0012.f369((SubLObject)module0623.$ic283$);
        if (module0623.NIL == module0623.$g4785$.getGlobalValue()) {
            module0623.$g4785$.setGlobalValue(module0067.f4880((SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED));
        }
        module0067.f4886(module0623.$g4785$.getGlobalValue(), (SubLObject)module0623.$ic284$, Symbols.symbol_function((SubLObject)module0623.$ic174$));
        module0002.f38((SubLObject)module0623.$ic285$);
        if (module0623.NIL == module0623.$g4773$.getGlobalValue()) {
            module0623.$g4773$.setGlobalValue(module0067.f4880((SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED));
        }
        module0067.f4886(module0623.$g4773$.getGlobalValue(), (SubLObject)module0623.$ic284$, Symbols.symbol_function((SubLObject)module0623.$ic290$));
        if (module0623.NIL == module0623.$g4785$.getGlobalValue()) {
            module0623.$g4785$.setGlobalValue(module0067.f4880((SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED));
        }
        module0067.f4886(module0623.$g4785$.getGlobalValue(), (SubLObject)module0623.$ic299$, Symbols.symbol_function((SubLObject)module0623.$ic174$));
        if (module0623.NIL == module0623.$g4773$.getGlobalValue()) {
            module0623.$g4773$.setGlobalValue(module0067.f4880((SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED));
        }
        module0067.f4886(module0623.$g4773$.getGlobalValue(), (SubLObject)module0623.$ic299$, Symbols.symbol_function((SubLObject)module0623.$ic302$));
        module0003.f57((SubLObject)module0623.$ic304$);
        if (module0623.NIL == module0623.$g4785$.getGlobalValue()) {
            module0623.$g4785$.setGlobalValue(module0067.f4880((SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED));
        }
        module0067.f4886(module0623.$g4785$.getGlobalValue(), (SubLObject)module0623.$ic305$, Symbols.symbol_function((SubLObject)module0623.$ic174$));
        if (module0623.NIL == module0623.$g4773$.getGlobalValue()) {
            module0623.$g4773$.setGlobalValue(module0067.f4880((SubLObject)module0623.UNPROVIDED, (SubLObject)module0623.UNPROVIDED));
        }
        module0067.f4886(module0623.$g4773$.getGlobalValue(), (SubLObject)module0623.$ic305$, Symbols.symbol_function((SubLObject)module0623.$ic308$));
        return (SubLObject)module0623.NIL;
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
        module0623.$g4770$ = null;
        module0623.$g4771$ = null;
        module0623.$g4772$ = null;
        module0623.$g4773$ = null;
        module0623.$g4774$ = null;
        module0623.$g4775$ = null;
        module0623.$g4776$ = null;
        module0623.$g4777$ = null;
        module0623.$g4778$ = null;
        module0623.$g4779$ = null;
        module0623.$g4780$ = null;
        module0623.$g4781$ = null;
        module0623.$g4782$ = null;
        module0623.$g4783$ = null;
        module0623.$g4784$ = null;
        module0623.$g4785$ = null;
        module0623.$g4786$ = null;
        module0623.$g4787$ = null;
        module0623.$g4788$ = null;
        module0623.$g4789$ = null;
        module0623.$g4790$ = null;
        module0623.$g4791$ = null;
        module0623.$g1441$ = null;
        module0623.$g4792$ = null;
        module0623.$g4793$ = null;
        module0623.$g4794$ = null;
        module0623.$g4795$ = null;
        module0623.$g4796$ = null;
        module0623.$g4797$ = null;
        module0623.$g4798$ = null;
        module0623.$g4799$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("SET-TASK-PROCESSOR-VERBOSITY");
        $ic1$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic2$ = SubLObjectFactory.makeString("Invalid verbosity, must be 0 - 9 but was ~S~%");
        $ic3$ = SubLObjectFactory.makeSymbol("S#41864", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#41865", "CYC");
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("S#1519", "CYC"), SubLObjectFactory.makeSymbol("S#9485", "CYC"), SubLObjectFactory.makeSymbol("S#10031", "CYC"), SubLObjectFactory.makeSymbol("S#42073", "CYC"), SubLObjectFactory.makeSymbol("S#713", "CYC"), SubLObjectFactory.makeSymbol("S#10030", "CYC"), SubLObjectFactory.makeSymbol("S#42074", "CYC"), SubLObjectFactory.makeSymbol("S#5851", "CYC"), SubLObjectFactory.makeSymbol("S#42075", "CYC") });
        $ic6$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("PRIORITY"), SubLObjectFactory.makeKeyword("REQUESTOR"), SubLObjectFactory.makeKeyword("GIVEBACK-INFO"), SubLObjectFactory.makeKeyword("BINDINGS"), SubLObjectFactory.makeKeyword("REQUEST"), SubLObjectFactory.makeKeyword("RESPONSE"), SubLObjectFactory.makeKeyword("ERROR-MESSAGE"), SubLObjectFactory.makeKeyword("TASK-PROCESSOR-NAME") });
        $ic7$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#41875", "CYC"), SubLObjectFactory.makeSymbol("S#41876", "CYC"), SubLObjectFactory.makeSymbol("S#41877", "CYC"), SubLObjectFactory.makeSymbol("S#41878", "CYC"), SubLObjectFactory.makeSymbol("S#41879", "CYC"), SubLObjectFactory.makeSymbol("S#41880", "CYC"), SubLObjectFactory.makeSymbol("S#41881", "CYC"), SubLObjectFactory.makeSymbol("S#41882", "CYC"), SubLObjectFactory.makeSymbol("S#41883", "CYC"), SubLObjectFactory.makeSymbol("S#41884", "CYC") });
        $ic8$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#41885", "CYC"), SubLObjectFactory.makeSymbol("S#41886", "CYC"), SubLObjectFactory.makeSymbol("S#41887", "CYC"), SubLObjectFactory.makeSymbol("S#41888", "CYC"), SubLObjectFactory.makeSymbol("S#41889", "CYC"), SubLObjectFactory.makeSymbol("S#41890", "CYC"), SubLObjectFactory.makeSymbol("S#41891", "CYC"), SubLObjectFactory.makeSymbol("S#41892", "CYC"), SubLObjectFactory.makeSymbol("S#41893", "CYC"), SubLObjectFactory.makeSymbol("S#41894", "CYC") });
        $ic9$ = SubLObjectFactory.makeSymbol("S#41918", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#41874", "CYC");
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#41865", "CYC"));
        $ic12$ = SubLObjectFactory.makeSymbol("S#41875", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#41885", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#41876", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#41886", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#41877", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#41887", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#41878", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#41888", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#41879", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#41889", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#41880", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#41890", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#41881", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#41891", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#41882", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#41892", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#41883", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#41893", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#41884", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#41894", "CYC");
        $ic32$ = SubLObjectFactory.makeKeyword("TYPE");
        $ic33$ = SubLObjectFactory.makeKeyword("ID");
        $ic34$ = SubLObjectFactory.makeKeyword("PRIORITY");
        $ic35$ = SubLObjectFactory.makeKeyword("REQUESTOR");
        $ic36$ = SubLObjectFactory.makeKeyword("GIVEBACK-INFO");
        $ic37$ = SubLObjectFactory.makeKeyword("BINDINGS");
        $ic38$ = SubLObjectFactory.makeKeyword("REQUEST");
        $ic39$ = SubLObjectFactory.makeKeyword("RESPONSE");
        $ic40$ = SubLObjectFactory.makeKeyword("ERROR-MESSAGE");
        $ic41$ = SubLObjectFactory.makeKeyword("TASK-PROCESSOR-NAME");
        $ic42$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic43$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic44$ = SubLObjectFactory.makeSymbol("S#41895", "CYC");
        $ic45$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic46$ = SubLObjectFactory.makeKeyword("END");
        $ic47$ = SubLObjectFactory.makeSymbol("S#41897", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("SYMBOLP");
        $ic49$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic50$ = SubLObjectFactory.makeSymbol("STREAMP");
        $ic51$ = SubLObjectFactory.makeString("#<");
        $ic52$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic53$ = SubLObjectFactory.makeString("type=");
        $ic54$ = SubLObjectFactory.makeString(" id=");
        $ic55$ = SubLObjectFactory.makeString(" priority=");
        $ic56$ = SubLObjectFactory.makeString(" requestor=");
        $ic57$ = SubLObjectFactory.makeString(" giveback-info=");
        $ic58$ = SubLObjectFactory.makeString(" bindings=");
        $ic59$ = SubLObjectFactory.makeString(" request=");
        $ic60$ = SubLObjectFactory.makeString(" response=");
        $ic61$ = SubLObjectFactory.makeString(" error-message=");
        $ic62$ = SubLObjectFactory.makeKeyword("BASE");
        $ic63$ = SubLObjectFactory.makeSymbol("S#41866", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#41867", "CYC");
        $ic65$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3267", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41864", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5959", "CYC"));
        $ic66$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RESULT"), (SubLObject)SubLObjectFactory.makeKeyword("TASK-INFO"), (SubLObject)SubLObjectFactory.makeKeyword("FINISHED"));
        $ic67$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#41920", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41921", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41922", "CYC"));
        $ic68$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#41923", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41924", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41925", "CYC"));
        $ic69$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic70$ = SubLObjectFactory.makeSymbol("S#41919", "CYC");
        $ic71$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#41867", "CYC"));
        $ic72$ = SubLObjectFactory.makeSymbol("S#41920", "CYC");
        $ic73$ = SubLObjectFactory.makeSymbol("S#41923", "CYC");
        $ic74$ = SubLObjectFactory.makeSymbol("S#41921", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("S#41924", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("S#41922", "CYC");
        $ic77$ = SubLObjectFactory.makeSymbol("S#41925", "CYC");
        $ic78$ = SubLObjectFactory.makeKeyword("RESULT");
        $ic79$ = SubLObjectFactory.makeKeyword("TASK-INFO");
        $ic80$ = SubLObjectFactory.makeKeyword("FINISHED");
        $ic81$ = SubLObjectFactory.makeSymbol("S#41926", "CYC");
        $ic82$ = SubLObjectFactory.makeSymbol("S#41928", "CYC");
        $ic83$ = SubLObjectFactory.makeSymbol("BOOLEANP");
        $ic84$ = SubLObjectFactory.makeSymbol("S#41868", "CYC");
        $ic85$ = SubLObjectFactory.makeSymbol("S#41869", "CYC");
        $ic86$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#104", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42076", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41864", "CYC"));
        $ic87$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("PROCESS"), (SubLObject)SubLObjectFactory.makeKeyword("BUSY-P"), (SubLObject)SubLObjectFactory.makeKeyword("TASK-INFO"));
        $ic88$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#41932", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41933", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41934", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41935", "CYC"));
        $ic89$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#41936", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41937", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41938", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41939", "CYC"));
        $ic90$ = SubLObjectFactory.makeSymbol("S#41943", "CYC");
        $ic91$ = SubLObjectFactory.makeSymbol("S#41931", "CYC");
        $ic92$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#41869", "CYC"));
        $ic93$ = SubLObjectFactory.makeSymbol("S#41932", "CYC");
        $ic94$ = SubLObjectFactory.makeSymbol("S#41936", "CYC");
        $ic95$ = SubLObjectFactory.makeSymbol("S#41933", "CYC");
        $ic96$ = SubLObjectFactory.makeSymbol("S#41937", "CYC");
        $ic97$ = SubLObjectFactory.makeSymbol("S#41934", "CYC");
        $ic98$ = SubLObjectFactory.makeSymbol("S#41938", "CYC");
        $ic99$ = SubLObjectFactory.makeSymbol("S#41935", "CYC");
        $ic100$ = SubLObjectFactory.makeSymbol("S#41939", "CYC");
        $ic101$ = SubLObjectFactory.makeKeyword("NAME");
        $ic102$ = SubLObjectFactory.makeKeyword("PROCESS");
        $ic103$ = SubLObjectFactory.makeKeyword("BUSY-P");
        $ic104$ = SubLObjectFactory.makeSymbol("S#41940", "CYC");
        $ic105$ = SubLObjectFactory.makeSymbol("S#41942", "CYC");
        $ic106$ = SubLObjectFactory.makeString("name=");
        $ic107$ = SubLObjectFactory.makeString(" process=");
        $ic108$ = SubLObjectFactory.makeString(" whostate=");
        $ic109$ = SubLObjectFactory.makeString(" busy-p=");
        $ic110$ = SubLObjectFactory.makeString(" last response=");
        $ic111$ = SubLObjectFactory.makeSymbol("S#41870", "CYC");
        $ic112$ = SubLObjectFactory.makeSymbol("S#31689", "CYC");
        $ic113$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#672", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42077", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42078", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42079", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42080", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42081", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42082", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42083", "CYC"));
        $ic114$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("REQUEST-QUEUE"), (SubLObject)SubLObjectFactory.makeKeyword("REQUEST-SEMAPHORE"), (SubLObject)SubLObjectFactory.makeKeyword("PROCESSORS"), (SubLObject)SubLObjectFactory.makeKeyword("BACKGROUND-MSGS"), (SubLObject)SubLObjectFactory.makeKeyword("PROCESS-NAME-PREFIX"), (SubLObject)SubLObjectFactory.makeKeyword("MIN-NBR-OF-TASK-PROCESSORS"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-NBR-OF-TASK-PROCESSORS"));
        $ic115$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#41945", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41946", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41947", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41948", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41949", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41950", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41951", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41952", "CYC"));
        $ic116$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#41953", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41954", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41955", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41956", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41957", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41958", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41959", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41960", "CYC"));
        $ic117$ = SubLObjectFactory.makeSymbol("S#41964", "CYC");
        $ic118$ = SubLObjectFactory.makeSymbol("S#41944", "CYC");
        $ic119$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#31689", "CYC"));
        $ic120$ = SubLObjectFactory.makeSymbol("S#41945", "CYC");
        $ic121$ = SubLObjectFactory.makeSymbol("S#41953", "CYC");
        $ic122$ = SubLObjectFactory.makeSymbol("S#41946", "CYC");
        $ic123$ = SubLObjectFactory.makeSymbol("S#41954", "CYC");
        $ic124$ = SubLObjectFactory.makeSymbol("S#41947", "CYC");
        $ic125$ = SubLObjectFactory.makeSymbol("S#41955", "CYC");
        $ic126$ = SubLObjectFactory.makeSymbol("S#41948", "CYC");
        $ic127$ = SubLObjectFactory.makeSymbol("S#41956", "CYC");
        $ic128$ = SubLObjectFactory.makeSymbol("S#41949", "CYC");
        $ic129$ = SubLObjectFactory.makeSymbol("S#41957", "CYC");
        $ic130$ = SubLObjectFactory.makeSymbol("S#41950", "CYC");
        $ic131$ = SubLObjectFactory.makeSymbol("S#41958", "CYC");
        $ic132$ = SubLObjectFactory.makeSymbol("S#41951", "CYC");
        $ic133$ = SubLObjectFactory.makeSymbol("S#41959", "CYC");
        $ic134$ = SubLObjectFactory.makeSymbol("S#41952", "CYC");
        $ic135$ = SubLObjectFactory.makeSymbol("S#41960", "CYC");
        $ic136$ = SubLObjectFactory.makeKeyword("LOCK");
        $ic137$ = SubLObjectFactory.makeKeyword("REQUEST-QUEUE");
        $ic138$ = SubLObjectFactory.makeKeyword("REQUEST-SEMAPHORE");
        $ic139$ = SubLObjectFactory.makeKeyword("PROCESSORS");
        $ic140$ = SubLObjectFactory.makeKeyword("BACKGROUND-MSGS");
        $ic141$ = SubLObjectFactory.makeKeyword("PROCESS-NAME-PREFIX");
        $ic142$ = SubLObjectFactory.makeKeyword("MIN-NBR-OF-TASK-PROCESSORS");
        $ic143$ = SubLObjectFactory.makeKeyword("MAX-NBR-OF-TASK-PROCESSORS");
        $ic144$ = SubLObjectFactory.makeSymbol("S#41961", "CYC");
        $ic145$ = SubLObjectFactory.makeSymbol("S#41963", "CYC");
        $ic146$ = SubLObjectFactory.makeString(" request-queue=");
        $ic147$ = SubLObjectFactory.makeString(" processors=");
        $ic148$ = SubLObjectFactory.makeString(" process name prefix=");
        $ic149$ = SubLObjectFactory.makeString(" min processors=");
        $ic150$ = SubLObjectFactory.makeString(" max processors=");
        $ic151$ = SubLObjectFactory.makeString("There are no task processors.");
        $ic152$ = SubLObjectFactory.makeString("~S~%");
        $ic153$ = SubLObjectFactory.makeString("request=~S~%");
        $ic154$ = SubLObjectFactory.makeInteger(500);
        $ic155$ = SubLObjectFactory.makeSymbol("LOCK-P");
        $ic156$ = SubLObjectFactory.makeSymbol("S#5480", "CYC");
        $ic157$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic158$ = SubLObjectFactory.makeSymbol("SET-TPOOL-BACKGROUND-MSG-PATH");
        $ic159$ = SubLObjectFactory.makeString("tpool-background-msg-lock");
        $ic160$ = SubLObjectFactory.makeString("~A is not a valid file specification");
        $ic161$ = SubLObjectFactory.makeKeyword("DIRECTION");
        $ic162$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic163$ = SubLObjectFactory.makeKeyword("IF-DOES-NOT-EXIST");
        $ic164$ = SubLObjectFactory.makeKeyword("CREATE");
        $ic165$ = SubLObjectFactory.makeKeyword("IF-EXISTS");
        $ic166$ = SubLObjectFactory.makeKeyword("OVERWRITE");
        $ic167$ = SubLObjectFactory.makeString("[");
        $ic168$ = SubLObjectFactory.makeString("]");
        $ic169$ = SubLObjectFactory.makeString("  ");
        $ic170$ = SubLObjectFactory.makeString(" ");
        $ic171$ = SubLObjectFactory.makeSymbol("CLET");
        $ic172$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic173$ = SubLObjectFactory.makeSymbol("S#9969", "CYC");
        $ic174$ = SubLObjectFactory.makeSymbol("S#5237", "CYC");
        $ic175$ = SubLObjectFactory.makeSymbol("EVAL");
        $ic176$ = SubLObjectFactory.makeSymbol("PROCESSP");
        $ic177$ = SubLObjectFactory.makeString("Task processes being worked on");
        $ic178$ = SubLObjectFactory.makeKeyword("ABORT");
        $ic179$ = SubLObjectFactory.makeKeyword("CANCEL");
        $ic180$ = SubLObjectFactory.makeSymbol("S#41995", "CYC");
        $ic181$ = SubLObjectFactory.makeKeyword("NEWEST");
        $ic182$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic183$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic184$ = SubLObjectFactory.makeSymbol("S#41999", "CYC");
        $ic185$ = SubLObjectFactory.makeSymbol("S#42000", "CYC");
        $ic186$ = SubLObjectFactory.makeString("API error: Unknown active task process termination reason ~A");
        $ic187$ = SubLObjectFactory.makeKeyword("TERMINATE-PREMATURELY");
        $ic188$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#768", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic189$ = SubLObjectFactory.makeSymbol("CCATCH");
        $ic190$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic191$ = SubLObjectFactory.makeSymbol("CATCH-TASK-PROCESSOR-TERMINATION");
        $ic192$ = SubLObjectFactory.makeString("Allow for the API calling side to catch the termination of the task processor.\n   The client must wrap the api-request form with catch-task-processor-termination.");
        $ic193$ = SubLObjectFactory.makeUninternedSymbol("US#56A639B");
        $ic194$ = SubLObjectFactory.makeSymbol("CATCH-TASK-PROCESSOR-TERMINATION-QUIETLY");
        $ic195$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic196$ = SubLObjectFactory.makeString("Allow for the API calling side to catch the termination of the task processor\n   without looking at the termination reason.\n   The client must wrap the api-request form with catch-task-processor-termination-quietly.");
        $ic197$ = (SubLFloat)SubLObjectFactory.makeDouble(0.001);
        $ic198$ = SubLObjectFactory.makeKeyword("TASK-PROCESSOR-QUIT");
        $ic199$ = SubLObjectFactory.makeString("Invalid task-processor");
        $ic200$ = SubLObjectFactory.makeString("Invalid task-process-pool");
        $ic201$ = SubLObjectFactory.makeString("Task Info ~S~%");
        $ic202$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic203$ = SubLObjectFactory.makeString("Response ~S~%");
        $ic204$ = SubLObjectFactory.makeString("Error-message ~S~%");
        $ic205$ = SubLObjectFactory.makeString("Posting partial results ~A at ~A");
        $ic206$ = SubLObjectFactory.makeString("Function only valid from within a Task Processor, but running inside ~A.");
        $ic207$ = SubLObjectFactory.makeInteger(25);
        $ic208$ = SubLObjectFactory.makeString("Task processor ");
        $ic209$ = SubLObjectFactory.makeString("Initializing task processors~%");
        $ic210$ = SubLObjectFactory.makeString("~alock");
        $ic211$ = SubLObjectFactory.makeString("task-pool-request-semaphore");
        $ic212$ = SubLObjectFactory.makeString("~a~s");
        $ic213$ = SubLObjectFactory.makeSymbol("S#42004", "CYC");
        $ic214$ = SubLObjectFactory.makeSymbol("S#42011", "CYC");
        $ic215$ = SubLObjectFactory.makeSymbol("ENSURE-TASK-PROCESSORS-KILLED");
        $ic216$ = SubLObjectFactory.makeString(" processor ");
        $ic217$ = SubLObjectFactory.makeString(" Killing ~A.~%");
        $ic218$ = SubLObjectFactory.makeString("Allocating a new task processor~%");
        $ic219$ = SubLObjectFactory.makeString("Awakening first available task processor~%");
        $ic220$ = SubLObjectFactory.makeString("Task processors are not initialized.");
        $ic221$ = SubLObjectFactory.makeString("~%Error: cannot queue task request for ~%~S~%");
        $ic222$ = SubLObjectFactory.makeSymbol("WITH-LONG-RUNNING-TASK-PROCESS");
        $ic223$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42084", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#31690", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-PROCESS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42085", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#41968", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42084", "CYC"))), (SubLObject)SubLObjectFactory.makeSymbol("S#42086", "CYC"));
        $ic224$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic225$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-LOCK-HELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42085", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("WHOSTATE"), (SubLObject)SubLObjectFactory.makeString("Upping maximum on process pool ....")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42087", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#41984", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42084", "CYC")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#41983", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42084", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("S#42087", "CYC"), (SubLObject)module0623.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("S#42086", "CYC"), (SubLObject)module0623.T)));
        $ic226$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("S#42086", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-LOCK-HELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42085", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("WHOSTATE"), (SubLObject)SubLObjectFactory.makeString("Reverting maximum on process pool ....")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42087", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#41984", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42084", "CYC")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#41983", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42084", "CYC"), (SubLObject)ConsesLow.list((SubLObject)module0623.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("S#42087", "CYC"), (SubLObject)module0623.ONE_INTEGER))))));
        $ic227$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#42082", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42083", "CYC"));
        $ic228$ = SubLObjectFactory.makeString("*");
        $ic229$ = SubLObjectFactory.makeString("-TASK-PROCESS-POOL*");
        $ic230$ = SubLObjectFactory.makeString("-TASK-PROCESS-POOL-LOCK*");
        $ic231$ = SubLObjectFactory.makeSymbol("DEFLEXICAL-PUBLIC");
        $ic232$ = ConsesLow.list((SubLObject)module0623.NIL, (SubLObject)SubLObjectFactory.makeString("Task process pool for requests."));
        $ic233$ = SubLObjectFactory.makeSymbol("DEFCONSTANT-PUBLIC");
        $ic234$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-LOCK"), (SubLObject)SubLObjectFactory.makeString("task processor initialization lock")), (SubLObject)SubLObjectFactory.makeString("Task process pool lock to guarantee only a single instance is initialized."));
        $ic235$ = SubLObjectFactory.makeSymbol("DEFINE-PUBLIC");
        $ic236$ = SubLObjectFactory.makeString("-TASK-PROCESSORS-INITIALIZED-P");
        $ic237$ = SubLObjectFactory.makeString("Return T when there are task processors.");
        $ic238$ = SubLObjectFactory.makeSymbol("RET");
        $ic239$ = SubLObjectFactory.makeSymbol("S#41967", "CYC");
        $ic240$ = SubLObjectFactory.makeString("INITIALIZE-");
        $ic241$ = SubLObjectFactory.makeString("-TASK-PROCESSORS");
        $ic242$ = SubLObjectFactory.makeString("Initialize the task processor pool for requests.");
        $ic243$ = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $ic244$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic245$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Illegal attempt to reinitialize processor pool without first halting it.")));
        $ic246$ = SubLObjectFactory.makeSymbol("S#42006", "CYC");
        $ic247$ = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $ic248$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" processor "));
        $ic249$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)module0623.NIL));
        $ic250$ = SubLObjectFactory.makeString("HALT-");
        $ic251$ = SubLObjectFactory.makeString("Halt the task processors.");
        $ic252$ = SubLObjectFactory.makeSymbol("S#42008", "CYC");
        $ic253$ = ConsesLow.list((SubLObject)module0623.NIL);
        $ic254$ = SubLObjectFactory.makeString("RESTART-");
        $ic255$ = SubLObjectFactory.makeString("Restart (halt + initialize) the task processors.");
        $ic256$ = SubLObjectFactory.makeString("SHOW-");
        $ic257$ = SubLObjectFactory.makeString("-TP-MSGS");
        $ic258$ = SubLObjectFactory.makeString("Show and reset the task processor background messages for the\n          task-process-pool.");
        $ic259$ = SubLObjectFactory.makeSymbol("S#41977", "CYC");
        $ic260$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#42088", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic261$ = SubLObjectFactory.makeString("-TASK-PROCESSOR-REQUEST");
        $ic262$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("S#42057", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("S#42057", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"))));
        $ic263$ = SubLObjectFactory.makeSymbol("DICTIONARY-ENTER");
        $ic264$ = SubLObjectFactory.makeSymbol("S#42057", "CYC");
        $ic265$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic266$ = SubLObjectFactory.makeString("DISPATCH-");
        $ic267$ = SubLObjectFactory.makeString("-TASK-PROCESSOR-RESPONSE");
        $ic268$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("S#42046", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("S#42046", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"))));
        $ic269$ = SubLObjectFactory.makeSymbol("S#42046", "CYC");
        $ic270$ = SubLObjectFactory.makeSymbol("FUNCTION");
        $ic271$ = SubLObjectFactory.makeString("task processor initialization lock");
        $ic272$ = SubLObjectFactory.makeString("Illegal attempt to reinitialize processor pool without first halting it.");
        $ic273$ = SubLObjectFactory.makeString("API");
        $ic274$ = SubLObjectFactory.makeSymbol("SHOW-API-TASK-PROCESSORS");
        $ic275$ = SubLObjectFactory.makeString("Provides a convenient alias for DISPLAY-API-TASK-PROCESSORS.");
        $ic276$ = SubLObjectFactory.makeSymbol("DISPLAY-API-TASK-PROCESSORS");
        $ic277$ = SubLObjectFactory.makeString("");
        $ic278$ = SubLObjectFactory.makeSymbol("INITIALIZE-API-TASK-PROCESSORS");
        $ic279$ = SubLObjectFactory.makeSymbol("HALT-API-TASK-PROCESSORS");
        $ic280$ = SubLObjectFactory.makeSymbol("RESTART-API-TASK-PROCESSORS");
        $ic281$ = SubLObjectFactory.makeSymbol("SHOW-API-TP-MSGS");
        $ic282$ = SubLObjectFactory.makeSymbol("API-TASK-PROCESSOR-REQUEST");
        $ic283$ = SubLObjectFactory.makeSymbol("WITH-IMMEDIATE-EXECUTION");
        $ic284$ = SubLObjectFactory.makeKeyword("API");
        $ic285$ = SubLObjectFactory.makeSymbol("SET-JAVA-API-LEASE-ACTIVITY-DISPLAY");
        $ic286$ = SubLObjectFactory.makeString("Dispatching api response ~S~%");
        $ic287$ = SubLObjectFactory.makeSymbol("S#42089", "CYC");
        $ic288$ = SubLObjectFactory.makeString("Sending api response ~S to socket ~S~% identified by ~A~%");
        $ic289$ = SubLObjectFactory.makeString("Dropping api response ~S, socket ~S~% identified by ~A is not available~%");
        $ic290$ = SubLObjectFactory.makeSymbol("S#42021", "CYC");
        $ic291$ = SubLObjectFactory.makeSymbol("S#42025", "CYC");
        $ic292$ = SubLObjectFactory.makeSymbol("S#42023", "CYC");
        $ic293$ = SubLObjectFactory.makeSymbol("S#42026", "CYC");
        $ic294$ = SubLObjectFactory.makeSymbol("S#42027", "CYC");
        $ic295$ = SubLObjectFactory.makeSymbol("S#42028", "CYC");
        $ic296$ = SubLObjectFactory.makeSymbol("S#42024", "CYC");
        $ic297$ = SubLObjectFactory.makeString("Cannot invoke intermediate results accumulator outside of a task processor.~%");
        $ic298$ = SubLObjectFactory.makeString("BG");
        $ic299$ = SubLObjectFactory.makeKeyword("BG");
        $ic300$ = SubLObjectFactory.makeString("dispatching bg response ~S~%");
        $ic301$ = SubLObjectFactory.makeString("bg response dictionary ~S~%");
        $ic302$ = SubLObjectFactory.makeSymbol("S#42035", "CYC");
        $ic303$ = SubLObjectFactory.makeString("CONSOLE");
        $ic304$ = SubLObjectFactory.makeSymbol("S#42072", "CYC");
        $ic305$ = SubLObjectFactory.makeKeyword("CONSOLE");
        $ic306$ = SubLObjectFactory.makeString("dispatching console response ~S~%");
        $ic307$ = SubLObjectFactory.makeString("~A  ~A~%");
        $ic308$ = SubLObjectFactory.makeSymbol("S#42043", "CYC");
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
            structDecl = Structures.makeStructDeclNative((Class)$sX41864_native.class, module0623.$ic3$, module0623.$ic4$, module0623.$ic5$, module0623.$ic6$, new String[] { "$type", "$id", "$priority", "$requestor", "$giveback_info", "$bindings", "$request", "$response", "$error_message", "$task_processor_name" }, module0623.$ic7$, module0623.$ic8$, module0623.$ic9$);
        }
    }
    
    public static final class $f38280$UnaryFunction extends UnaryFunction
    {
        public $f38280$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#41865"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0623.f38280(var5);
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
            structDecl = Structures.makeStructDeclNative((Class)$sX41866_native.class, module0623.$ic63$, module0623.$ic64$, module0623.$ic65$, module0623.$ic66$, new String[] { "$result", "$task_info", "$finished" }, module0623.$ic67$, module0623.$ic68$, module0623.$ic69$);
        }
    }
    
    public static final class $f38325$UnaryFunction extends UnaryFunction
    {
        public $f38325$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#41867"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0623.f38325(var5);
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
            structDecl = Structures.makeStructDeclNative((Class)$sX41868_native.class, module0623.$ic84$, module0623.$ic85$, module0623.$ic86$, module0623.$ic87$, new String[] { "$name", "$process", "$busy_p", "$task_info" }, module0623.$ic88$, module0623.$ic89$, module0623.$ic90$);
        }
    }
    
    public static final class $f38339$UnaryFunction extends UnaryFunction
    {
        public $f38339$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#41869"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0623.f38339(var5);
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
            structDecl = Structures.makeStructDeclNative((Class)$sX41870_native.class, module0623.$ic111$, module0623.$ic112$, module0623.$ic113$, module0623.$ic114$, new String[] { "$lock", "$request_queue", "$request_semaphore", "$processors", "$background_msgs", "$process_name_prefix", "$min_nbr_of_task_processors", "$max_nbr_of_task_processors" }, module0623.$ic115$, module0623.$ic116$, module0623.$ic117$);
        }
    }
    
    public static final class $f38353$UnaryFunction extends UnaryFunction
    {
        public $f38353$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#31689"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0623.f38353(var5);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0623.class
	Total time: 954 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/